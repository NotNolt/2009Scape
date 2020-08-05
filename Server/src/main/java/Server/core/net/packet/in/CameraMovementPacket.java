package core.net.packet.in;

import core.game.node.entity.player.Player;
import core.net.packet.IncomingPacket;
import core.net.packet.IoBuffer;

/**
 * Handles an incoming camera movement changed packet.
 * @author Woah
 */
public final class CameraMovementPacket implements IncomingPacket {

	@Override
	public void decode(Player player, int opcode, IoBuffer buffer) {
		buffer.getShort();
		buffer.getLEShort();
	}

}