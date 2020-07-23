package core.net.event;

import core.cache.Cache;
import core.cache.crypto.ISAACCipher;
import core.cache.crypto.ISAACPair;
import core.cache.misc.buffer.ByteBufferUtils;
import core.game.node.entity.player.info.ClientInfo;
import core.game.node.entity.player.info.PlayerDetails;
import core.game.node.entity.player.info.UIDInfo;
import core.game.node.entity.player.info.login.LoginParser;
import core.game.node.entity.player.info.login.LoginType;
import core.game.node.entity.player.info.login.Response;
import core.game.node.entity.player.info.portal.PlayerSQLManager;
import core.game.system.SystemLogger;
import core.game.system.task.TaskExecutor;
import core.net.Constants;
import core.net.IoReadEvent;
import core.net.IoSession;
import core.net.amsc.WorldCommunicator;
import core.tools.StringUtils;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.sql.SQLException;
import java.util.Base64;

/**
 * Handles login reading events.
 * @author Emperor
 */
public final class LoginReadEvent extends IoReadEvent {

	/**
	 * The RSA exponent.
	 */
	public static final BigInteger RSA_KEY = new BigInteger("63836541338254930133129004074732382929998437615009296959260995188633082779361618777286690536401412536788693103949475863420785422077437411678826531544580956203799783573564225075359462174640338384017065666188771184000361929010560260535244941334940115723150494202345239634306833859051437359114435513508472366353");

	/**
	 * The RSA modulus.
	 */
	public static final BigInteger MODULUS = new BigInteger("119365899446067315932975991898363325061579719991294025359328021960040125142258621067848949689980866028232491082585431814345859060363748342297790362002830405818586025541018815563000741957417375211440504983329981059065255756529758598479962175681326119784430342275130902058984323109363665114655494006708620299283");


	private int nameHash;



	/**
	 * Constructs a new {@code LoginReadEvent}.
	 * @param session The session.
	 * @param buffer The buffer with data to read from.
	 */
	public LoginReadEvent(IoSession session, ByteBuffer buffer) {
		super(session, buffer);
	}

	@Override
	public void read(IoSession session, ByteBuffer buffer) {
		int opcode = buffer.get() & 0xFF;
		System.out.println("LoginReadEvent opcode: " + opcode);
		switch (opcode) {
			case 16:
			case 18:
				System.out.println("Decoding World...");
				decodeWorld(opcode, session, buffer);
				break;
			default:
				System.err.println("[jagex.Login] Unhandled login type [opcode=" + opcode + "]!");
				session.disconnect();
				break;
		}
	}

	//buffer.get() & 0xFF;
	//buffer.getShort() & 0xFFFF;

	/**
	 * Decodes a world login request.
	 * @param session The session.
	 * @param buffer The buffer to read from.
	 */
	private void decodeWorld(final int opcode, final IoSession session, ByteBuffer buffer) {
		int packetSize = buffer.getShort();
		if(packetSize != buffer.remaining()) {
			session.disconnect();
			return;
		}
		if(buffer.getInt() != Constants.REVISION) {
			session.write(Response.UPDATED);
			return;
		}
		buffer.get();
		int displayMode = buffer.get();
		int screenWidth = buffer.getShort();
		int screenHeight = buffer.getShort();
		for (int i = 0; i < 24; i++)
			buffer.get();
		ByteBufferUtils.getString(buffer);
		for (int it = 0; it < 2; it++)
			buffer.getInt();
		buffer.getShort();

		for (int i = 0; i < Cache.getIndexes().length; i++) {
			int crc = Cache.getIndexes()[i] == null ? 0 : Cache.getIndexes()[i].getInformation().getInformationContainer().getCrc();
			if (crc != buffer.getInt() && crc != 0) {
				//System.out.println("Invalid CRC at index: "+ crc);
				//session.write(Response.UPDATED);
				//return;
			}
		}
		if (buffer.get() != 10)
			buffer.get();


//		buffer = getRSABlock(buffer);
//		int[] isaacSeed = getISAACSeed(buffer);
//		ISAACCipher inCipher = new ISAACCipher(isaacSeed);
//		for (int i = 0; i < 4; i++) {
//			isaacSeed[i] += 50;
//		}
//		ISAACCipher outCipher = new ISAACCipher(isaacSeed);
//		session.setIsaacPair(new ISAACPair(inCipher, outCipher));
		session.setClientInfo(new ClientInfo(displayMode, screenWidth, screenHeight));
		final ByteBuffer b = buffer;
		TaskExecutor.executeSQL(new Runnable() {
			@Override
			public void run() {
				try {
					final String username = StringUtils.longToString(b.getLong());
					final String password = ByteBufferUtils.getString(b);
					Response response = PlayerSQLManager.getCredentialResponse(username, password);
					if (response != Response.SUCCESSFUL) {
						session.write(response, true);
						return;
					}
					login(new PlayerDetails(username, password), session, b, opcode);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
	}





//		byte uno = buffer.get(); // Memory?
//		System.out.println("Passed Byte 1: " + uno);
//		byte dos = buffer.get();// no advertisement = 1
//		System.out.println("Passed Byte 2: " + dos);
//		byte tris = buffer.get();// 1
//		System.out.println("Passed Byte 3: " + tris);
//		int windowMode = buffer.get();// Screen size mode
//		System.out.println("Retrieved windowMode " + windowMode);
//
//		System.out.println("Retrieved screenWidth " + screenWidth);
//
//		System.out.println("Retrieved screenHeight " + screenHeight);
//		int displayMode = buffer.get(); // jagex.Display mode
//		System.out.println("Retrieved displayMode " + displayMode);
//
//
//		byte[] data = new byte[24]; // random.dat data.
//		System.out.println("Reading Random.dat data" + opcode);
//		buffer.get(data);
//		System.out.println("Buffer retrieved data" + opcode);
//
//
//		String astring =ByteBufferUtils.getString(buffer);
//		System.out.println("Getting data as string" + astring);
//
//
//		int affliliate = buffer.getInt();// Affiliate id
//		System.out.println("Found Affiliate ID" + affliliate);
//		buffer.getInt(); // Hash containing a bunch of settings
//		System.out.println("Found Settings Hash");
//		buffer.getShort();//Current interface packet counter.
//		System.out.println("Found Interface packets");
		/*buffer = getRSABlock(buffer);
		int[] isaacSeed = getISAACSeed(buffer);
		ISAACCipher inCipher = new ISAACCipher(isaacSeed);
		for (int i = 0; i < 4; i++) {
			isaacSeed[i] += 50;
		}
		ISAACCipher outCipher = new ISAACCipher(isaacSeed);
		session.setIsaacPair(new ISAACPair(inCipher, outCipher));*/


	/**
	 * Handles the login procedure after we check an acc is registered & certified.
	 * @param details the password.
	 * @param session the session.
	 * @param buffer the byte buffer.
	 * @param opcode the opcode.
	 */
	private static void login(final PlayerDetails details, IoSession session, ByteBuffer buffer, int opcode) {
		final LoginParser parser = new LoginParser(details, LoginType.fromType(opcode));
		System.out.println("Login Procedures Checked");
		details.setSession(session);
		details.getInfo().translate(new UIDInfo(details.getIpAddress(), ByteBufferUtils.getString(buffer), ByteBufferUtils.getString(buffer),ByteBufferUtils.getString(buffer)));
		if (WorldCommunicator.isEnabled()) {
			WorldCommunicator.register(parser);
		} else {
			TaskExecutor.executeSQL(parser);
		}
	}

	/**
	 * Gets the ISAAC seed from the buffer.
	 * @param buffer The buffer to read from.
	 * @return The ISAAC seed.
	 */
	public static int[] getISAACSeed(ByteBuffer buffer) {
		int[] seed = new int[4];
		for (int i = 0; i < 4; i++) {
			seed[i] = buffer.getInt();
		}
		return seed;
	}

	/**
	 * Gets the RSA block buffer.
	 * @param buffer The buffer to get the RSA block from.
	 * @return The RSA block buffer.
	 */
	public static ByteBuffer getRSABlock(ByteBuffer buffer) {
		byte[] rsaData = new byte[buffer.get() & 0xFF];
		buffer.get(rsaData);
		ByteBuffer block = ByteBuffer.wrap(rsaData);
		int num = block.get();
		if (num != 10) {
			throw new IllegalArgumentException("Invalid RSA header " + num + "!");
		}
		return block;
	}

	public void setNameHash(int nameHash) {
		this.nameHash = nameHash;
	}

	public int getNameHash() {
		return nameHash;
	}

}