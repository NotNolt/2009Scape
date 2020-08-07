package core.net.packet.out;

import plugin.ge.OfferState;
import core.net.packet.IoBuffer;
import core.net.packet.OutgoingPacket;
import core.net.packet.PacketHeader;
import core.net.packet.context.GrandExchangeContext;

/**
 * The outgoing packet used for updating a player's grand exchange data.
 * @author Woah
 */
public class GrandExchangePacket implements OutgoingPacket<GrandExchangeContext> {

	@Override
	public void send(GrandExchangeContext context) {
		final IoBuffer buffer = new IoBuffer(134, PacketHeader.NORMAL);
		buffer.put((byte) context.getOffer().getIndex());
		if (context.getOffer().getState() != OfferState.REMOVED) {
			int state = context.getOffer().getState().ordinal() + 1;
			if (context.getOffer().isSell()) {
				state += 8;
			}
			if (context.getOffer().getState() == OfferState.ABORTED) {
				state = context.getOffer().isSell() ? -3 : 5;
			}
			buffer.put((byte) state).putShort((short) context.getOffer().getItemId()).putInt(context.getOffer().getOfferedValue()).putInt(context.getOffer().getAmount()).putInt(context.getOffer().getCompletedAmount()).putInt(context.getOffer().getTotalCoinExchange());
		} else {
			buffer.put(0).putShort(0).putInt(0).putInt(0).putInt(0).putInt(0);
		}
		try {
		context.getPlayer().getSession().write(buffer);
		} catch (Exception e) {
		}
	}

}
