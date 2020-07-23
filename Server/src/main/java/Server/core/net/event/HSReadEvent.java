package core.net.event;

import core.net.Constants;
import core.net.IoReadEvent;
import core.net.IoSession;
import core.net.lobby.WorldList;
import core.net.registry.AccountRegister;
import core.tools.RandomFunction;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/**
 * Handles handshake read events.
 * @author Emperor
 */
public final class HSReadEvent extends IoReadEvent {

	// debug
	static Map<String, Integer> count = new HashMap<>();

	/**
	 * Constructs a new {@code HSReadEvent}.
	 * @param session The session.
	 * @param buffer The buffer.
	 */
	public HSReadEvent(IoSession session, ByteBuffer buffer) {
		super(session, buffer);
	}

	@Override
	public void read(IoSession session, ByteBuffer buffer) {
		Integer amount = count.get(session.getAddress());
		if (amount == null) {
			amount = 0;
		}
		count.put(session.getAddress(), amount + 1);
		int opcode = buffer.get() & 0xFF;
		System.out.println("HSReadEvent opcode - " + opcode);
		switch (opcode) {
		case 14:
			session.setNameHash(buffer.get() & 0xFF);
			System.out.println("Setting name Hash - HSReadEvent");
			session.setServerKey(RandomFunction.RANDOM.nextLong());
			System.out.println("Setting Server Key - HSReadEvent");
			session.write(true);
			break;
		case 15:
			int revision = buffer.getInt();
			System.out.println("Revision " + revision);
			//int sub_revision = buffer.getInt();
			buffer.flip();
			System.out.println(buffer.limit());
			if (revision != Constants.REVISION) { //|| sub_revision != Constants.CLIENT_BUILD) {
				System.out.println("Revision disconnect!");
				session.disconnect();
				break;
			}
			session.write(false);
			break;
		case 147:
		case 186:
		case 36:
		case 21:
			System.out.println("Reading Account Register...");
			AccountRegister.read(session, opcode, buffer);
			break;
		case 255:
		case 23:	// World list
			System.out.println("Updating world list information");
			int updateStamp = buffer.getInt();
			WorldList.sendUpdate(session, updateStamp);
			break;

		default:
			System.out.println("Disconnecting because fuck you - HSReadEvent");
			session.disconnect();
			break;
		}
	}

}