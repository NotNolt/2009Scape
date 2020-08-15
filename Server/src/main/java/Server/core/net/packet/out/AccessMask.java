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
		buffer.putInt(context.getInterfaceId() << 16 | context.getChildId());
		buffer.putLEShort(context.getLength());
		buffer.putLEShort(context.getOffset());
		buffer.putLEShortA(0);
		buffer.putLEInt(context.getInterfaceId() << 16 | context.getChildId());
		context.getPlayer().getSession().write(buffer);




//		buffer.putInt(context.getId());
//		buffer.putLEShort(context.getLength());
//		buffer.putLEShort(context.getOffset());
//		buffer.putLEShortA(context.getPlayer().getInterfaceManager().getPacketCount(1));
//		buffer.putLEInt(context.getInterfaceId() << 16 | context.getChildId());
//		context.getPlayer().getSession().write(buffer);
	}
}
