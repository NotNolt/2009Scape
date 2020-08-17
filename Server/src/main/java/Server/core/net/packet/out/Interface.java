package core.net.packet.out;

import core.net.packet.IoBuffer;
import core.net.packet.OutgoingPacket;
import core.net.packet.context.InterfaceContext;

/**
 * The interface outgoing packet.
 * @author Woah
 */
public final class Interface implements OutgoingPacket<InterfaceContext> {

/**	Changed Client + Server sided for maximum 530 compatibility for interfaces
 * Original 562:
	Short, Subtract Byte (putS), Short, LEInt
 	InterfaceID, Interface Fixed, Interface counter, Window/Component ID
**/
	@Override
	public void send(InterfaceContext context) {
		System.out.println("Sending Interface || Outgoing");
		IoBuffer buffer = new IoBuffer(56);
		buffer.putLEInt(context.getWindowId() << 16 | context.getComponentId());//Window and Child ID
		buffer.putShort(context.getInterfaceId());//Interface ID
		buffer.putS(context.isWalkable() ? 1 : 0);//Is the interface fixed or full boolean
		buffer.putShort(context.getPlayer().getInterfaceManager().getPacketCount(1));//Interface counter
		context.getPlayer().getDetails().getSession().write(buffer);
	}

}