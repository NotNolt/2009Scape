package core.game.world.update.flag.player;

import core.game.world.update.flag.UpdateFlag;
import core.game.world.update.flag.context.Graphics;
import core.net.packet.IoBuffer;

/**
 * Handles the graphic update flag.
 * @author Woah
 * 
 */
public final class GraphicFlag extends UpdateFlag<Graphics> {

	/**
	 * Constructs a new {@code GraphicFlag} {@code Object}.
	 * @param context The context.
	 */
	public GraphicFlag(Graphics context) {
		super(context);
	}

	@Override
	public void write(IoBuffer buffer) {
		buffer.putShort(context.getId());
		buffer.putIntA(context.getDelay());
	}

	@Override
	public int data() {
		return maskData();
	}

	@Override
	public int ordinal() {
		return 9;
	}

	/**
	 * Gets the mask data of the graphic update flag.
	 * @return The mask data.
	 */
	public static int maskData() {
		return 0x100;
	}
}