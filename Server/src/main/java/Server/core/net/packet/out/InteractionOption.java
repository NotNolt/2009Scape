package core.net.packet.out;

import core.net.packet.IoBuffer;
import core.net.packet.OutgoingPacket;
import core.net.packet.PacketHeader;
import core.net.packet.context.InteractionOptionContext;

/**
 * Handles the interaction option changed outgoing packet.
 * @author Woah
 */
public final class InteractionOption implements OutgoingPacket<InteractionOptionContext> {

	@Override
	public void send(InteractionOptionContext context) {
		IoBuffer buffer = new IoBuffer(73, PacketHeader.BYTE);
		buffer.putLEShortA(65535);
		buffer.putString(context.getName());
		buffer.putC(context.getIndex() == 0 ? 1 : 0);
		buffer.putS(context.getIndex() + 1);
		context.getPlayer().getSession().write(buffer);
	}

}