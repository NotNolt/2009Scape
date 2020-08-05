package core.net.packet.out;

import core.net.packet.IoBuffer;
import core.net.packet.OutgoingPacket;
import core.net.packet.context.DisplayModelContext;

/**
 * Represents the outgoing packet for the displaying of a node model on an
 * interface.
 * @author Woah
 */
public final class DisplayModel implements OutgoingPacket<DisplayModelContext> {

	@Override
	public void send(DisplayModelContext context) {
		IoBuffer buffer;
		switch (context.getType()) {
		case PLAYER:
			buffer = new IoBuffer(219);
			buffer.putShortA(context.getPlayer().getInterfaceManager().getPacketCount(1));
			buffer.putIntA(context.getInterfaceId() << 16 | context.getChildId());
			break;
		case NPC:
			buffer = new IoBuffer(158);
			buffer.putLEShortA(context.getNodeId());
			buffer.putShort(context.getPlayer().getInterfaceManager().getPacketCount(1));
			buffer.putIntB((context.getInterfaceId() << 16) | context.getChildId());
			break;
		case ITEM:
			int value = context.getAmount() > 0 ? context.getAmount() : context.getZoom();
			buffer = new IoBuffer(145);
			buffer.putInt(context.getInterfaceId() << 16 | context.getChildId());
			buffer.putIntA(value);
			buffer.putLEShortA(context.getPlayer().getInterfaceManager().getPacketCount(1));
			buffer.putLEShortA(context.getNodeId());
			break;
//		case MODEL:
//			buffer = new IoBuffer(130);
//			buffer.putLEInt(context.getInterfaceId() << 16 | context.getChildId());
//			buffer.putLEShortA(context.getPlayer().getInterfaceManager().getPacketCount(1));
//			buffer.putShortA(context.getNodeId());
//			break;
		default:
			return;
		}
		context.getPlayer().getSession().write(buffer);
	}

}