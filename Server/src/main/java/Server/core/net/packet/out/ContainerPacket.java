package core.net.packet.out;

import core.game.container.ContainerEvent;
import core.game.node.item.Item;
import core.net.packet.IoBuffer;
import core.net.packet.OutgoingPacket;
import core.net.packet.PacketHeader;
import core.net.packet.context.ContainerContext;

/**
 * Represents the outgoing container packet.
 * @author Woah
 */
public final class ContainerPacket implements OutgoingPacket<ContainerContext> {

	@Override
	public void send(ContainerContext context) {
		IoBuffer buffer = new IoBuffer(120, PacketHeader.SHORT);
		buffer.putInt(context.getInterfaceId() << 16 | context.getChildId());
		buffer.putShort(context.getType());
		buffer.putShort(context.getItems().length);
		for (int index = 0; index < context.getItems().length; index++) {
			Item item = context.getItems()[index];
			int id = -1;
			int amt = 0;
			if (item != null) {
				id = item.getId();
				amt = item.getAmount();
			}
			buffer.putC((Math.min(amt, 255)));
			if(amt >= 255)
				buffer.putIntA(amt);
			buffer.putLEShort(id + 1);
			}
		context.getPlayer().getSession().write(buffer);
		}


//		buffer.putShort(context.getType());
//		buffer.putShort(context.getLength());
//		for (int i = 0; i < context.getLength(); i++) {
//			Item item = context.getItems()[i];
//			int id, amt;
//			if (item == null) {
//				id = -1;
//				amt = 0;
//			} else {
//				id = item.getDefinition().getId();
//				amt = item.getAmount();
//			}
//			if (amt > 254) {
//				buffer.putIntA(255);
//				buffer.putC(amt);
//			} else {
//				buffer.putC(amt);
//			}
//			buffer.putLEShort(id + 1);
//		}
//		context.getPlayer().getSession().write(buffer);
//	}

//		IoBuffer buffer = null;
//		if (context.isClear()) {
//			buffer = new IoBuffer(120);
//			buffer.putInt(context.getInterfaceId() << 16 | context.getChildId());
//		} else {
//			boolean slotBased = context.getSlots() != null;
//			buffer = new IoBuffer(slotBased ? 22 : 120, PacketHeader.SHORT);
//			buffer.putShort(context.getInterfaceId());
//			buffer.putShort(context.getChildId());
//			buffer.putShort(context.getType());
//			if (slotBased) {
//				for (int slot : context.getSlots()) {
//					buffer.putSmart(slot);
//					Item item = context.getItems()[slot];
//					if (item != null && !item.equals(ContainerEvent.NULL_ITEM)) {
//						buffer.putShort(item.getId() + 1);
//						int amount = item.getAmount();
//						if (amount < 0 || amount > 254) {
//							buffer.put(255).putInt(amount);
//						} else {
//							buffer.put(amount);
//						}
//					} else {
//						buffer.putShort(0);
//					}
//				}
//			} else {
//				buffer.putShort(context.getItems().length);
//				for (Item item : context.getItems())
//					if (item != null) {
//						int amount = item.getAmount();
//						if (amount < 0 || amount > 254) {
//							buffer.putIntA(255).putC(amount);
//						} else {
//							buffer.putC(amount);
//						}
//						buffer.putLEShort(item.getId() + 1);
//					} else {
//						buffer.putLEShort(0).putC(0);
//					}
//			}
//		}
//		context.getPlayer().getSession().write(buffer);
//	}

}