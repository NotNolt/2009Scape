package core.net.packet.out;

import core.net.packet.IoBuffer;
import core.net.packet.OutgoingPacket;
import core.net.packet.context.MusicContext;

/**
 * Outgoing Music packet
 * @author Woah
 */
public class MusicPacket implements OutgoingPacket<MusicContext> {

	@Override
	public void send(MusicContext context) {
		IoBuffer buffer = null;
		if (context.isSecondary()) {
			buffer = new IoBuffer(30);
			buffer.put(context.getLength());
			buffer.putLE3(context.getMusicId());
			buffer.putLEShortA(context.getcategoryId());
		} else {
			buffer = new IoBuffer(188);
			buffer.putLEShortA(context.getMusicId());
			buffer.putS(context.getLength());
		}
		context.getPlayer().getDetails().getSession().write(buffer);
	}

}
