package core.net.packet.out;

import core.net.packet.IoBuffer;
import core.net.packet.OutgoingPacket;
import core.net.packet.context.PlayerContext;

/**
 * The run energy outgoing packet.
 * @author Woah
 */
public class RunEnergy implements OutgoingPacket<PlayerContext> {

	@Override
	public void send(PlayerContext context) {
		IoBuffer buffer = new IoBuffer(63);
		buffer.put((byte) context.getPlayer().getSettings().getRunEnergy());
		context.getPlayer().getDetails().getSession().write(buffer);
	}
}