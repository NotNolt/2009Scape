package core.net.packet.in;

import core.game.node.entity.player.Player;
import core.net.packet.IncomingPacket;
import core.net.packet.IoBuffer;

/**
 * Handles the display update packet.
 * @author Woah
 *
 */
public class DisplayUpdatePacket implements IncomingPacket {

	@Override
	public void decode(Player player, int opcode, IoBuffer buffer) {
		int windowMode = buffer.get(); //Window mode
		int screenWidth = buffer.getShort();
		int screenHeight = buffer.getShort();
		int displayMode = buffer.get(); //jagex.Display mode
		player.getSession().getClientInfo().setWindowMode(windowMode);
		player.getSession().getClientInfo().setScreenWidth(screenWidth);
		player.getSession().getClientInfo().setScreenHeight(screenHeight);
		player.getSession().getClientInfo().setDisplayMode(displayMode);
	}

}