package core.net.event;

import java.nio.ByteBuffer;

import core.net.IoReadEvent;
import core.net.IoSession;
import core.net.packet.IncomingPacket;
import core.net.packet.IoBuffer;
import core.net.packet.PacketRepository;

/**
 * Handles game packet reading.
 * @author Emperor
 */
public final class GameReadEvent extends IoReadEvent {

	/**
	 * The incoming packet sizes, sorted by opcode.
	 */
	public static final int[] PACKET_SIZES = {
			-3, -3, -3, 6, 1, 2, -3, 4, -1, -3,//0-9
			-3, -3, -3, 8, -3, -3, -3, -3, -3, 6,//10-19
			8, -3, -3, -3, -3, -3, -3, -3, 6, 8,//20-29
			-3, -3, 1, -3, -3, 0, 8, -3, 3, 6,//30-39
			-3, -3, -3, -1, -3, 7, -1, 9, -3, 1,//40-49
			6, -3, 2, -3, 3, 12, 0, 8, 10, -3,//50-59
			8, 10, -3, -3, -3, -3, 8, 6, 4, 8,//60-69
			-3, -3, -3, -3, -1, -3, 6, -3, 14, 9,//70-79
			-3, -3, 2, -3, 9, 6, -3, 6, 2, 6,//80-89
			-3, 7, 8, -3, -3, 0, -3, -3, -3, -3,//90-99
			-3, -3, -3, -3, -1, 2, -1, -3, 12, 6,//100-109
			-3, -3, 12, -3, 5, -3, -3, 16, -3, 5,//110-119
			-1, -3, 14, -1, -3, -3, -3, 6, 6, -3,//120-129
			-3, -3, -3, 8, -3, -3, -3, 8, -3, 8,//130-139
			3, 3, -3, -3, 4, 8, -3, 6, 4, -1,//140-149
			-3, -3, 6, -3, -3, -3, 6, 8, -1, -3,//150-159
			-3, -3, -3, -1, -3, -1, -1, -3, -3, 6,//160-169
			7, -1, -1, 6, -3, -3, -3, -1, 9, 8,//170-179
			4, -3, -1, 4, -3, 2, -3, 6, 16, 8,//180-189
			7, 12, 4, 6, 7, -3, -3, -1, -3, -3,//190-199
			4, -3, 15, 6, -3, 4, 4, 3, -3, -3,//200-209
			-3, 6, -3, -3, 2, -3, 6, 3, -3, -3,//210-219
			-3, 6, -3, -3, -3, -3, -1, -1, 2, 8,//220-229
			6, -3, -3, 8, 8, 4, 8, 2, -3, 2,//230-239
			-1, 2, 2, 8, 8, 2, -1, -3, 8, 2,//240-249
			-3, 14, -3, 9, 3, -1			//250-255
	};

	/**
	 * Constructs a new {@code GameReadEvent}.
	 * @param session The session.
	 * @param buffer The buffer to read from.
	 */
	public GameReadEvent(IoSession session, ByteBuffer buffer) {
		super(session, buffer);
	}

	@Override
	public void read(IoSession session, ByteBuffer buffer) {
		int last = -1;
		while (buffer.hasRemaining()) {
			int opcode = buffer.get() & 0xFF;
			if (opcode >= PACKET_SIZES.length) {
				break;
			}
			int header = PACKET_SIZES[opcode];
			int size = header;
			if (header < 0) {
				size = getPacketSize(buffer, opcode, header, last);
			}
			if (size == -1) {
				break;
			}
			if (buffer.remaining() < size) {
				switch (header) {
					case -2:
						queueBuffer(opcode, size >> 8, size);
						break;
					case -1:
						queueBuffer(opcode, size);
						break;
					default:
						queueBuffer(opcode);
						break;
				}
				break;
			}
			byte[] data = new byte[size];
			buffer.get(data);
			IoBuffer buf = new IoBuffer(opcode, null, ByteBuffer.wrap(data));
			IncomingPacket packet = PacketRepository.getIncoming(opcode);
			if (packet == null) {
				System.err.println("Unhandled packet [opcode=" + opcode + ", previous=" + last + ", size=" + size + ", header=" + header +"]");
				continue;
			}
			last = opcode;
			try {
				packet.decode(session.getPlayer(), opcode, buf);
			} catch (Throwable t) {
				t.printStackTrace();
			}
		}
	}

	/**
	 * Gets the packet size for the given opcode.
	 * @param buffer The buffer.
	 * @param opcode The opcode.
	 * @param header The packet header.
	 * @param last The last opcode.
	 * @return The packet size.
	 */
	private int getPacketSize(ByteBuffer buffer, int opcode, int header, int last) {
		if (header == -1) {
			if (buffer.remaining() < 1) {
				queueBuffer(opcode);
				return -1;
			}
			return buffer.get() & 0xFF;
		}
		if (header == -2) {
			if (buffer.remaining() < 2) {
				queueBuffer(opcode);
				return -1;
			}
			return buffer.getShort() & 0xFFFF;
		}
		System.err.println("Invalid packet [opcode=" + opcode + ", last=" + last + ", queued=" + usedQueuedBuffer + "]!");
		return -1;
	}

}