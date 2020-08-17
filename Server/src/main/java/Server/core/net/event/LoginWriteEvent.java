package core.net.event;

import core.game.node.entity.player.Player;
import core.game.node.entity.player.info.login.Response;
import core.net.EventProducer;
import core.net.IoSession;
import core.net.IoWriteEvent;
import core.net.producer.GameEventProducer;

import java.nio.ByteBuffer;

/**
 * Handles login writing events.
 * @author Emperor
 */
public final class LoginWriteEvent extends IoWriteEvent {

	/**
	 * The game event producer.
	 */
	private static final EventProducer GAME_PRODUCER = new GameEventProducer();

	/**
	 * Constructs a new {@code LoginWriteEvent}.
	 * @param session The session.
	 * @param context The event context.
	 */
	public LoginWriteEvent(IoSession session, Object context) {
		super(session, context);
	}

	@Override
	public void write(IoSession session, Object context) {
		System.out.println("jagex.Login Write Event...");
		Response response = (Response) context;
		ByteBuffer buffer = ByteBuffer.allocate(500);
		buffer.put((byte) response.opcode());
		System.out.println("Sending opcode: " + response.opcode() + " to client");
		switch (response.opcode()) {
			case 2: //successful login
				System.out.println("jagex.Login Successful");
				buffer.put(getWorldResponse(session));
				session.setProducer(GAME_PRODUCER);
				break;
			//Could add a case here to auto-restart the server in case the login server goes offline (case 8)
			//Possibly a risk for malicious attacks though
//			case 21: //Moving world
//				System.out.println("User Moving Worlds");
//				buffer.put((byte) session.getServerKey());
//				break;
		}
		buffer.flip();
		session.queue(buffer);
	}

	/**
	 * Gets the world response buffer.
	 * @param session The session.
	 * @return The buffer.
	 */
	private static ByteBuffer getWorldResponse(IoSession session) {
		System.out.println("Retrieving World Response");
		ByteBuffer buffer = ByteBuffer.allocate(15);//150?
		Player player = session.getPlayer();
		buffer.put((byte) player.getDetails().getRights().ordinal());
		buffer.put((byte) 0);
		buffer.put((byte) 0);
		buffer.put((byte) 0);
		buffer.put((byte) 1);
		buffer.put((byte) 0);
		buffer.put((byte) 0);
		buffer.putShort((short) player.getIndex());
		buffer.put((byte) 1); // Enable all G.E boxes
		buffer.put((byte) 1);
		buffer.flip();
		return buffer;

	}
}