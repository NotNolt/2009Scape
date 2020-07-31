package core.net.event;

import core.cache.misc.buffer.ByteBufferUtils;
import core.net.IoReadEvent;
import core.net.IoSession;

import java.nio.ByteBuffer;

/**
 * Handles JS-5 reading events.
 * @author Emperor
 */
public final class JS5ReadEvent extends IoReadEvent {

	/**
	 * Constructs a new {@code JS5ReadEvent}.
	 * @param session The session.
	 * @param buffer The buffer.
	 */
	public JS5ReadEvent(IoSession session, ByteBuffer buffer) {
		super(session, buffer);
	}

	@Override
	public void read(IoSession session, ByteBuffer buffer) {
		while (buffer.hasRemaining()) {
			int opcode = buffer.get() & 0xFF;
			System.out.println("JS5ReadEvent opcode: " + opcode);
			if (buffer.remaining() < 3) {
				queueBuffer(opcode);
				return;
			}
			switch (opcode) {
			case 0:
			case 1:
//				int request = ByteBufferUtils.getTriByte(buffer);
				int container = buffer.get() & 0xFF;
				int archive = buffer.getShort() & 0xFFFF;
				session.write(new int[] { container, archive, opcode });
				break;
			case 2: // music
			case 3: // Music
				ByteBufferUtils.getTriByte(buffer);
				break;
			case 4:
				session.setJs5Encryption(buffer.get());
				if (buffer.getShort() != 0) {
					session.disconnect();
					return;
				}
				break;
//			case 5:
//			case 9:
//				if (buffer.remaining() < 4) {
//					queueBuffer(opcode);
//					return;
//				}
//				buffer.getInt();
//				break;
			case 6:
				ByteBufferUtils.getTriByte(buffer); // Value should be 3
				break;
			case 7:
				ByteBufferUtils.getTriByte(buffer);
				session.disconnect();
				return;
			default:
				System.out.println("Unhandled JS5 opcode " + opcode + "!");
				buffer.get();
				buffer.getShort();
				break;
			}
		}
	}
}