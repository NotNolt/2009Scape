package core.net.packet.out;

import core.net.packet.IoBuffer;
import core.net.packet.OutgoingPacket;
import core.net.packet.context.AccessMaskContext;

/**
 * The access mask outgoing packet.
 * @author Woah
 */
public class AccessMask implements OutgoingPacket<AccessMaskContext> {

	@Override
	public void send(AccessMaskContext context) {
		IoBuffer buffer = new IoBuffer(113);
		buffer.putInt(context.getPlayer().getInterfaceManager().getPacketCount(1));
		buffer.putLEShort(context.getLength());
		buffer.putLEShort(context.getOffset());
		buffer.putLEShortA(context.getId());
		buffer.putLEInt(context.getInterfaceId() << 16 | context.getChildId());
		context.getPlayer().getSession().write(buffer);
	}
}
