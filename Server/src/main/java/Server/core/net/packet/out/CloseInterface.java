package core.net.packet.out;

import core.net.packet.IoBuffer;
import core.net.packet.OutgoingPacket;
import core.net.packet.context.InterfaceContext;

/**
 * Represents the outgoing packet used for closing an interface.
 * @author Woah
 */
public final class CloseInterface implements OutgoingPacket<InterfaceContext> {

	@Override
	public void send(InterfaceContext context) {
		IoBuffer buffer = new IoBuffer(203);
		buffer.putShort(0);
		buffer.putInt(context.getWindowId() << 16 | context.getComponentId());
		context.getPlayer().getSession().write(buffer);
	}

}