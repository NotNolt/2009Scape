package core.net.packet.out;

import core.game.node.entity.player.Player;
import core.game.node.object.GameObject;
import core.game.world.map.Location;
import core.net.packet.IoBuffer;
import core.net.packet.OutgoingPacket;
import core.net.packet.context.BuildObjectContext;

/**
 * The construct game object packet.
 * @author Emperor
 */
public final class ConstructObject implements OutgoingPacket<BuildObjectContext> {

	/**
	 * Writes the packet.
	 * @param buffer The buffer.
	 * @param object The objects.
	 */
	public static IoBuffer write(IoBuffer buffer, GameObject object) {
		Location l = object.getLocation();
		buffer.put(115);
		buffer.putC(0);
		buffer.putLEShortA(object.getId());
		buffer.putC((object.getType() << 2) + (object.getRotation() & 0x3));
		return buffer;
	}

	@Override
	public void send(BuildObjectContext context) {
		Player player = context.getPlayer();
		GameObject o = context.getGameObject();
		IoBuffer buffer = write(UpdateAreaPosition.getBuffer(player, o.getLocation().getChunkBase()), o);
		player.getSession().write(buffer);

	}

}