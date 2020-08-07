package core.net.packet.out;

import core.game.node.entity.player.Player;
import core.game.world.map.Location;
import core.game.world.map.RegionPlane;
import core.net.packet.IoBuffer;
import core.net.packet.OutgoingPacket;
import core.net.packet.PacketHeader;
import core.net.packet.context.AreaPositionContext;

/**
 * Handles the update area position packet.
 * @author Woah
 */
public final class UpdateAreaPosition implements OutgoingPacket<AreaPositionContext> {


	/**
	 * Gets the region chunk update buffer.
	 * @param player The player.
	 * @param base The base location of the chunk.
	 * @return The buffer.
	 */
	public static IoBuffer getChunkUpdateBuffer(Player player, Location base) {
		int x = base.getSceneX(player.getPlayerFlags().getLastSceneGraph());
		int y = base.getSceneY(player.getPlayerFlags().getLastSceneGraph());
		int z = base.getZ() << 1;
		return new IoBuffer(83, PacketHeader.SHORT).putA(y).putA(x).put(z);
	}

	/**
	 * Gets the region chunk update buffer.
	 * @param player The player.
	 * @param base The base location of the chunk.
	 * @return The buffer.
	 */
	public static IoBuffer getBuffer(Player player, Location base) {
		int x = base.getSceneX(player.getPlayerFlags().getLastSceneGraph());
		int y = base.getSceneY(player.getPlayerFlags().getLastSceneGraph());
		return new IoBuffer(207).putS(y).put(x);
	}

	@Override
	public void send(AreaPositionContext context) {
		context.getPlayer().getSession().write(getBuffer(context.getPlayer(), context.getLocation()));
	}

}