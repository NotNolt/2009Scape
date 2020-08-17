package core.net.packet.out;

import core.net.packet.IoBuffer;
import core.net.packet.OutgoingPacket;
import core.net.packet.context.WindowsPaneContext;

/**
 * Handles the windows pane outgoing packet.
 * @author Woah
 */
public final class WindowsPane implements OutgoingPacket<WindowsPaneContext> {

	@Override
	public void send(WindowsPaneContext context) {
		System.out.println("Sending WindowPane || Outgoing");
		IoBuffer buffer = new IoBuffer(50);
		buffer.putShortA(context.getWindowId());
		buffer.putShort(context.getPlayer().getInterfaceManager().getPacketCount(1));
		buffer.putS(context.getType());
		context.getPlayer().getDetails().getSession().write(buffer);
	}

}