package core.net.packet.out;

import core.game.node.entity.player.Player;
import core.game.system.mysql.impl.RegionSQLHandler;
import core.net.packet.IoBuffer;
import core.net.packet.OutgoingPacket;
import core.net.packet.PacketHeader;
import core.net.packet.context.SceneGraphContext;

/**
 * The update scene graph outgoing packet.
 * @author Woah
 */
public final class UpdateSceneGraph implements OutgoingPacket<SceneGraphContext> {

	@Override
	public void send(SceneGraphContext context) {
		System.out.println("Sending UpdateSceneGraph || Outgoing");
		IoBuffer buffer = new IoBuffer(76, PacketHeader.SHORT);
		Player player = context.getPlayer();
		boolean forceSend = true;
		player.getPlayerFlags().setLastSceneGraph(player.getLocation());
		buffer.putLEShortA(player.getLocation().getRegionX());
		buffer.putShort(player.getLocation().getSceneY());
		buffer.put((byte) 0);
		buffer.putA(0);
		if (((player.getLocation().getRegionX() / 8) == 48) || ((player.getLocation().getRegionX() / 8) == 49) && ((player.getLocation().getRegionY() / 8) == 48)) {
			forceSend = false;
		}
		if (((player.getLocation().getRegionX() / 8) == 48) && ((player.getLocation().getRegionY() / 8) == 148)) {
			forceSend = false;
		}
		for (int regionX = (player.getLocation().getRegionX() - 6) / 8; regionX <= ((player.getLocation().getRegionX() + 6) / 8); regionX++) {
			for (int regionY = (player.getLocation().getRegionY() - 6) / 8; regionY <= ((player.getLocation().getRegionY() + 6) / 8); regionY++) {
				int region = regionY + (regionX << 8);
				if (forceSend || ((regionY != 49) && (regionY != 149) && (regionY != 147) && (regionX != 50) && ((regionX != 49) || (regionY != 47)))) {
					int[] keys = RegionSQLHandler.getRegionXTEA(region);
					for (int i = 0; i < keys.length; i++) {
						buffer.putInt(keys[i]);
					}
				}
			}
		}

		buffer.putA(player.getLocation().getZ());
		buffer.putShort(player.getLocation().getSceneX());
		buffer.putShort(player.getLocation().getRegionY());
		player.getDetails().getSession().write(buffer);
	}

}