package core.game.world.update.flag.player;

import core.game.container.impl.EquipmentContainer;
import core.game.node.entity.player.Player;
import core.game.node.entity.player.link.appearance.Appearance;
import core.game.node.entity.player.link.appearance.BodyPart;
import core.game.node.item.Item;
import core.game.world.update.flag.UpdateFlag;
import core.net.packet.IoBuffer;
import core.tools.StringUtils;

/**
 * Handles the appearance update flag.
 * @author Woahscam
 *
 */
public final class AppearanceFlag extends UpdateFlag<Player> {

	/**
	 * Constructs a new {@code AppearanceFlag} {@code Object}.
	 * @param player The player.
	 */
	public AppearanceFlag(Player player) {
		super(player);
	}

	@Override
	public void write(IoBuffer buffer) {
		int mask = 0x0;
		Appearance appearance = context.getAppearance();
		appearance.prepareBodyData(context);
		IoBuffer block = new IoBuffer();
		int gender = appearance.getGender().toByte();
		if (context.size() > 1) {
			gender |= (context.size() - 1) << 3;
		}
		block.put(gender); // Gender
		block.put(mask);
		block.put(appearance.getSkullIcon()); // Skull icon
		block.put(appearance.getHeadIcon()); // Head icon
		if (!appearance.isNpc()) {
			for (int index = 0; index < 4; index++) {
				if (context.getEquipment().get(index) != null) {
					block.putShort(32768 + context.getEquipment().get(index).getDefinition().getEquipId());
				} else {
					block.put((byte) 0);
				}
			}

			block.putShort(0x100 + Appearance.AppearanceCache.TORSO);
			block.put(0);
			block.putShort(0x100 + Appearance.AppearanceCache.ARMS);
			block.putShort(0x100 + Appearance.AppearanceCache.LEGS);
			block.putShort(0x100 + Appearance.AppearanceCache.HAIR);
			block.putShort(0x100 + Appearance.AppearanceCache.WRISTS);
			block.putShort(0x100 + Appearance.AppearanceCache.FEET);
			block.putShort(0x100 + Appearance.AppearanceCache.FACIAL_HAIR);
			final BodyPart[] colors = new BodyPart[] { appearance.getHair(), appearance.getTorso(), appearance.getLegs(), appearance.getFeet(), appearance.getSkin() };
			for (int i = 0; i < colors.length; i++) {// colours
				block.put(colors[i].getColor());
			}
		} else {
			block.putShort(-1);
			block.putShort(appearance.getNpcId());
			block.put((byte) 0);
			}


		block.put(1426);
		block.putString(context.getUsername());
		block.put(context.getProperties().getCurrentCombatLevel());
		block.putShort(0);
		block.putShort(0);
		buffer.put(block.toByteBuffer().position());
		buffer.put(block);
	}

	//		block.putShort(0x100 + appearance.getBodyParts()[2]);
//		block.put(0);
//		block.putShort(0x100 + appearance.getBodyParts()[3]);
//		block.putShort(0x100 + appearance.getBodyParts()[5]);
//		block.putShort(0x100 + appearance.getBodyParts()[0]);
//		block.putShort(0x100 + appearance.getBodyParts()[4]);
//		block.putShort(0x100 + appearance.getBodyParts()[6]);
//		block.putShort(0x100 + appearance.getBodyParts()[1]);
//		for (int color : appearance.getColors()) {// colours
//			block.put(color);
//		}


	//			if (context.getEquipment().get(EquipmentContainer.SLOT_CHEST) != null) {
//				block.putShort(32768 + context.getEquipment().get(EquipmentContainer.SLOT_CHEST).getDefinition().getEquipId());
//			} else {
//				block.putShort(0x100 + Appearance.AppearanceCache.TORSO);
//			}
//			if (context.getEquipment().get(EquipmentContainer.SLOT_SHIELD) != null) {
//				block.putShort(32768 + context.getEquipment().get(EquipmentContainer.SLOT_SHIELD).getDefinition().getEquipId());
//			} else {
//				block.putShort((byte) 0);
//			}
//			Item chest = context.getEquipment().get(EquipmentContainer.SLOT_CHEST);
//			if (chest != null) {
//				if (context.getEquipment().get(EquipmentContainer.SLOT_CHEST)) {
//					block.putShort(32768 + context.getEquipment().get(EquipmentContainer.SLOT_CHEST).getDefinition().getEquipId());
//				} else {
//
//				}
//			} else {
//				block.putShort(0x100 + Appearance.AppearanceCache.ARMS);
//			}
//			if (context.getEquipment().get(EquipmentContainer.SLOT_LEGS) != null) {
//				block.putShort(32768 + context.getEquipment().get(EquipmentContainer.SLOT_LEGS).getDefinition().getEquipId());
//			} else {
//				block.putShort(0x100 + Appearance.AppearanceCache.LEGS);


//		int npcId = appearance.getNpcId();
//		if (npcId == -1) {
//			int[] parts = appearance.getBodyParts();
//			for (int i = 0; i < 12; i++) {
//				int value = parts[i];
//				if (value == 0) {
//					block.put(0);
//				} else {
//					block.putShort(value);
//				}
//			}
//		} else {
//			block.putShort(-1);
//			block.putShort(npcId);
//			block.put(255);
//		}
//		final BodyPart[] colors = new BodyPart[] { appearance.getHair(), appearance.getTorso(), appearance.getLegs(), appearance.getFeet(), appearance.getSkin() };
//		for (int i = 0; i < colors.length; i++) {// colours
//			block.put(colors[i].getColor());
//		}
//		block.putShort(appearance.getRenderAnimation());
//		block.putLong(StringUtils.stringToLong(context.getUsername()));
//		block.put(context.getProperties().getCurrentCombatLevel());
//		block.putShort(0);
//		block.putShort(0);
//		buffer.put(block.toByteBuffer().position());
//		buffer.put(block);
//	}

	@Override
	public int data() {
		return getData();
	}

	@Override
	public int ordinal() {
		return getOrdinal();
	}

	/**
	 * Gets the ordinal for this flag.
	 * @return The flag ordinal.
	 */
	public static int getOrdinal() {
		return 3;
	}

	/**
	 * Gets the mask data.
	 * @return The mask data.
	 */
	public static int getData() {
		return 0x10;
	}
}