package core.net.packet.out;

import core.net.packet.IoBuffer;
import core.net.packet.OutgoingPacket;
import core.net.packet.context.InterfaceContext;

/**
 * The interface outgoing packet.
 * @author Woah
 */
public final class Interface implements OutgoingPacket<InterfaceContext> {

	@Override
	public void send(InterfaceContext context) {
		IoBuffer buffer = new IoBuffer(56);
		buffer.putShort(context.getComponentId());
		buffer.putS(context.isWalkable() ? 1 : 0);
		buffer.putShort(context.getPlayer().getInterfaceManager().getPacketCount(1));
		buffer.putLEInt(context.getWindowId() << 16 & context.getInterfaceId());
		context.getPlayer().getDetails().getSession().write(buffer);
	}

}