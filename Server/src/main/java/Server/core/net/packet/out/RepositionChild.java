package core.net.packet.out;

import core.net.packet.IoBuffer;
import core.net.packet.OutgoingPacket;
import core.net.packet.context.ChildPositionContext;

/**
 * Handles the "reposition interface child" outgoing packet.
 * @author Woah
 */
public final class RepositionChild implements OutgoingPacket<ChildPositionContext> {

	@Override
	public void send(ChildPositionContext context) {
		IoBuffer buffer = new IoBuffer(160);
		buffer.putLEShortA(context.getPlayer().getInterfaceManager().getPacketCount(1));
		buffer.putLEInt(context.getInterfaceId() << 16 | context.getChildId());
		buffer.putLEShort(context.getPosition().x);
		buffer.putShortA(context.getPosition().y);
		context.getPlayer().getDetails().getSession().write(buffer);
	}

}