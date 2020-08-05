package core.net.packet.out;

import core.net.packet.IoBuffer;
import core.net.packet.OutgoingPacket;
import core.net.packet.context.InterfaceConfigContext;

/**
 * The outgoing interface configuration packet.
 * @author Woah
 */
public class InterfaceConfig implements OutgoingPacket<InterfaceConfigContext> {

	@Override
	public void send(InterfaceConfigContext context) {
		IoBuffer buffer = new IoBuffer(3);
		buffer.putShortA(context.getPlayer().getInterfaceManager().getPacketCount(1));
		buffer.putS(context.isHidden() ? 1 : 0);
		buffer.putIntB(context.getInterfaceId() << 16 | context.getChildId());
		context.getPlayer().getSession().write(buffer);
	}
}
