package core.net.packet.out;

import core.net.packet.context.ConfigContext;
import core.net.packet.IoBuffer;
import core.net.packet.OutgoingPacket;

/**
 * The config outgoing packet.
 * @author Emperor
 */
public class Config implements OutgoingPacket<ConfigContext> {

	@Override
	public void send(ConfigContext context) {
		IoBuffer buffer;
		if (context.getValue() < 128) {
			buffer = new IoBuffer(186);
			buffer.putS((byte) context.getValue());
			buffer.putLEShortA(context.getId());
		} else {
			buffer = new IoBuffer(151);
			buffer.putLEInt(context.getValue());
			buffer.putShort(context.getId());
		}
		context.getPlayer().getDetails().getSession().write(buffer);
	}
}