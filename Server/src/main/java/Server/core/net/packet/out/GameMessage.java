package core.net.packet.out;

import core.net.packet.IoBuffer;
import core.net.packet.OutgoingPacket;
import core.net.packet.PacketHeader;
import core.net.packet.context.GameMessageContext;

/**
 * The game message outgoing packet.
 * @author Woah
 */
public class GameMessage implements OutgoingPacket<GameMessageContext> {

	@Override
	public void send(GameMessageContext context) {
		IoBuffer buffer = new IoBuffer(193, PacketHeader.BYTE);
		buffer.putSmart(0);
		buffer.putInt(0);
		buffer.put((byte) 0);
		buffer.putString(context.getMessage());
		context.getPlayer().getSession().write(buffer);
	}
}