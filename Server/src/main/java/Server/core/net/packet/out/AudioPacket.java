package core.net.packet.out;

import core.game.node.entity.player.link.audio.Audio;
import core.net.packet.IoBuffer;
import core.net.packet.OutgoingPacket;
import core.net.packet.context.DefaultContext;

/**
 * Sends an audio packet.
 * @author Vexia
 */
public class AudioPacket implements OutgoingPacket<DefaultContext> {

	@Override
	public void send(DefaultContext context) {
		final Audio audio = (Audio) context.getObjects()[0];
		IoBuffer buffer = new IoBuffer(136);
		buffer.putShort(audio.getId());
		buffer.put((byte) audio.getVolume());
		buffer.putShort(audio.getDelay());
		buffer.put((byte) 0);
		context.getPlayer().getSession().write(buffer);
	}

}
