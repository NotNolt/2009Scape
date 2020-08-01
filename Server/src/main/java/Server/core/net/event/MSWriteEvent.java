package core.net.event;

import core.net.IoSession;
import core.net.IoWriteEvent;
import core.net.packet.IoBuffer;

import java.nio.ByteBuffer;

/**
 * Handles management server write events.
 * @author Emperor
 */
public final class MSWriteEvent extends IoWriteEvent {

	/**
	 * Constructs a new {@code MSWriteEvent} {@code Object}
	 * @param session The I/O session.
	 * @param context The packet context.
	 */
	public MSWriteEvent(IoSession session, Object context) {
		super(session, context);
	}

	@Override
	public void write(IoSession session, Object context) {
		System.out.println("MSWrite Event Initiated...");
		IoBuffer b = (IoBuffer) context;
		System.out.println("IoBuffer initialized... - MSWriteEvent");
		int size = b.toByteBuffer().position();
		System.out.println("Buffer to position... - MSWriteEvent");
		ByteBuffer buffer = ByteBuffer.allocate(1 + size + b.getHeader().ordinal());
		System.out.println("Buffer size Allocation... - MSWriteEvent");
		buffer.put((byte) b.opcode());
		System.out.println("buffer putting opcode " + b.opcode());
		switch (b.getHeader()) {
		case NORMAL:
			System.out.println("Using Normal... - MSWriteEvent");
			break;
		case BYTE:
			System.out.println("Using Byte... - MSWriteEvent");
			buffer.put((byte) size);
			break;
		case SHORT:
			System.out.println("Using Short... - MSWriteEvent");
			buffer.putShort((short) size);
			break;
		}
		System.out.println("Putting info in ByteBuffer... - MSWriteEvent");
		buffer.put((ByteBuffer) b.toByteBuffer().flip());
		System.out.println("Buffer flipped and queued... - MSWriteEvent");
		session.queue((ByteBuffer) buffer.flip());
	}

}