package core.net.packet.out;

import core.net.packet.IoBuffer;
import core.net.packet.OutgoingPacket;
import core.net.packet.context.CSConfigContext;

/**
 * The outgoing packet for client script configs.
 * 
 * @author Woah
 */
public class CSConfigPacket implements OutgoingPacket<CSConfigContext> {

//	@Override
//	public void send(CSConfigContext context) {
//		IoBuffer buffer = new IoBuffer(70);
//		buffer.putShort(context.getPlayer().getInterfaceManager().getPacketCount(1));
//		buffer.putString(context.toString());
//		buffer.putInt(context.getId());
//		context.getPlayer().getDetails().getSession().write(buffer);
//	}

	@Override
	public void send(CSConfigContext context) {
		IoBuffer buffer = new IoBuffer(70);
		buffer.putShort(context.getId());
		buffer.putString(context.getTypes());

		for (int i = context.getTypes().length() - 1; i >= 0; i--) {
			if (context.getTypes().charAt(i) == 's') {
				buffer.putString((String) context.getParameters()[i]);
			} else {
				buffer.putInt(((Number) context.getParameters()[i]).intValue());
			}
		}

		buffer.putInt(context.getValue());
		context.getPlayer().getDetails().getSession().write(buffer);
	}
}