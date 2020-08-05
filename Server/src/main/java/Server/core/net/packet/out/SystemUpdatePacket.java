package core.net.packet.out;

import core.net.packet.IoBuffer;
import core.net.packet.OutgoingPacket;
import core.net.packet.context.SystemUpdateContext;

/**
 * Handles the system update packet.
 * @author Woah
 */
public class SystemUpdatePacket implements OutgoingPacket<SystemUpdateContext> {

	@Override
	public void send(final SystemUpdateContext context) {
		IoBuffer buffer = new IoBuffer(231).putLEShort(context.getTime());
		context.getPlayer().getDetails().getSession().write(buffer);
	}

}
