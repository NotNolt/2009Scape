package core.net.packet.out;

import core.net.packet.IoBuffer;
import core.net.packet.OutgoingPacket;
import core.net.packet.context.PlayerContext;

/**
 * The outgoing logout packet.
 * @author Woah
 */
public class Logout implements OutgoingPacket<PlayerContext> {

	@Override
	public void send(PlayerContext context) {
		IoBuffer buffer = new IoBuffer(236);
		context.getPlayer().getDetails().getSession().write(buffer);
	}
}