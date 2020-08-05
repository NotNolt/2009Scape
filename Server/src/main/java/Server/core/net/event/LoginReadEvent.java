package core.net.event;

import core.cache.Cache;
import core.cache.crypto.ISAACCipher;
import core.cache.crypto.ISAACPair;
import core.cache.misc.buffer.ByteBufferUtils;
import core.game.node.entity.player.Player;
import core.game.node.entity.player.info.ClientInfo;
import core.game.node.entity.player.info.PlayerDetails;
import core.game.node.entity.player.info.UIDInfo;
import core.game.node.entity.player.info.login.LoginParser;
import core.game.node.entity.player.info.login.LoginType;
import core.game.node.entity.player.info.login.Response;
import core.game.node.entity.player.info.portal.PlayerSQLManager;
import core.game.node.entity.player.link.InterfaceManager;
import core.game.system.SystemLogger;
import core.game.system.task.TaskExecutor;
import core.net.Constants;
import core.net.IoReadEvent;
import core.net.IoSession;
import core.net.amsc.WorldCommunicator;
import core.net.packet.IoBuffer;
import core.tools.IsaacGroup;
import core.tools.StringUtils;
import jagex.Login;

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
	 * The login rsa exponent.
	 */
	private static final BigInteger EXPONENT = new BigInteger("10576590401440322986110047695651341967882733497127746373629378048138048538187119036342734495313507419048289616041709032673071798161365641163600617162178497");

	/**
	 * The login rsa modulus.
	 */
	private static final BigInteger MODULUS = new BigInteger("11206719348431650513171671018397173875527561036041859828114669681511079464644350457240662773502649504136578282907910504211944100665125647292825199995029019");

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
		System.out.println("Transfered to LoginReadEvent...");
		int opcode = buffer.get() & 0xFF;//Initial contact is unsigned byte opcode
		System.out.println("Transfered successfully with opcode: " + opcode);
		if ((buffer.getShort() & 0xFFFF) < 1) {
			session.write(Response.BAD_SESSION_ID);
			return;
		}
		if (buffer.getInt() != Constants.REVISION) {
			session.write(Response.UPDATED);
			//System.out.println("Roar " + buffer.getInt(buffer.position() - 8) + ", " + buffer.getInt(buffer.position() - 4));
			return;
		}
		switch (opcode) {
			case 16: //Reconnect world login
			case 18: //World login
				decodeWorld(opcode, session, buffer);
				break;
			default:
				System.err.println("[Login] Unhandled login type [opcode=" + opcode + "]!");
				session.disconnect();
				break;
		}
	}

	/**
	 * Decodes a world login request.
	 * @param session The session.
	 * @param buffer The buffer to read from.
	 */
	private static void decodeWorld(int opcode, IoSession session, ByteBuffer buffer) {
		int windowMode = buffer.get() & 0xFF;// Connection Byte
		int displayMode = buffer.get() & 0xFF;// display mode <Byte is 2
		int screenWidth = buffer.getShort() & 0xFFFF;// width <Short is 765
		int screenHeight = buffer.getShort() & 0xFFFF;// height <Short is 503 Combined makes up 765x503 game frame
		System.out.println("Initial Connection: " + windowMode + " || Display: " + displayMode + " || Client Width x Height: " + screenWidth + "x" + screenHeight);
		buffer.get();//0 Byte Spacer
		byte[] data = new byte[24]; // random.dat data.
		buffer.get(data);
		ByteBufferUtils.getString(buffer);
		buffer.getInt();//Affiliate id
		buffer.getInt();// Flags
		buffer.getShort();
		for (int i = 0; i < 29; i++) {
			int crc = Cache.getIndexes()[i] == null ? 0 : Cache.getIndexes()[i].getInformation().getInformationContainer().getCrc();
			if (crc != buffer.getInt()) {
				return;
			}
		}
		System.out.println("Passed CRC");


//		ByteBuffer buf = encryptUsingRSA(buffer);
//		int id = buf.get();
		if (buffer.get() != 10) {
			buffer.get();
		}
		System.out.println("Passed RSA");
//		int[] seeds = IsaacGroup.setIsaacSeeds(buffer, new int[4]);
		buffer.getInt();
		buffer.getInt();
		buffer.getInt();
		buffer.getInt();
		System.out.println("Passed Isaac");
		final Long Lusername = buffer.getLong();
		System.out.println(Lusername);
		final String password = ByteBufferUtils.getString(buffer).trim();
		final String username = StringUtils.decodeBase37(Lusername).trim();
//		IsaacGroup group = IsaacGroup.get(seeds);
		session.setClientInfo(new ClientInfo(displayMode, windowMode, screenWidth, screenHeight));
		final ByteBuffer b = buffer;
		TaskExecutor.executeSQL(new Runnable() {
			@Override
			public void run() {
				try {
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

	/**
	 * Handles the login procedure after we check an acc is registered & certified.
	 * @param session the session.
	 * @param buffer the byte buffer.
	 * @param opcode the opcode.
	 */
	private static void login(final PlayerDetails details, IoSession session, ByteBuffer buffer, int opcode) {
		System.out.println("Handling Login...");
		final LoginParser parser = new LoginParser(details, LoginType.fromType(opcode));
		System.out.println("Login Parsed from opcode: " + opcode);
		details.setSession(session);
//		System.out.println("ip Conx: " + details.getIpAddress());
//		System.out.println("Comp name: " + buffer.getInt());
//		System.out.println("Mac: " + ByteBufferUtils.getString(buffer));
//		System.out.println("Serial: " + ByteBufferUtils.getString(buffer));
		new UIDInfo(details.getIpAddress());
		if (WorldCommunicator.isEnabled()) {
			System.out.println("WorldCommunicator registered");
			WorldCommunicator.register(parser);
		} else {
			System.out.println("Executing SQL");
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
	 * Encrypts a buffer using the RSA encryption algorithm.
	 * @param buffer The byte buf.
	 * @return The encrypted buffer.
	 */
	public static ByteBuffer encryptUsingRSA(ByteBuffer buffer) {
		byte[] data = new byte[buffer.get()];
		buffer.get(data);
		return ByteBuffer.wrap(new BigInteger(data).modPow(EXPONENT, MODULUS).toByteArray());
	}

}