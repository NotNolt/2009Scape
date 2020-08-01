package core.net.packet.out;

import core.net.packet.IoBuffer;
import core.net.packet.OutgoingPacket;
import core.net.packet.context.MusicContext;

/**
 * Outgoing Music packet
 * @author SonicForce41
 */
public class MusicPacket implements OutgoingPacket<MusicContext> {

	@Override
	public void send(MusicContext context) {
		IoBuffer buffer = null;
		if (context.isSecondary()) {
			buffer = new IoBuffer(30);
			buffer.putTri(255);
			buffer.putLEShort(context.getMusicId());
		} else {
			buffer = new IoBuffer(188);
			buffer.putLEShortA(context.getMusicId());
		}
		context.getPlayer().getDetails().getSession().write(buffer);
	}

}
