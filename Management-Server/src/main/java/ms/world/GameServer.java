package ms.world;

import ms.net.IoSession;
import ms.net.packet.WorldPacketRepository;
import ms.system.mysql.SQLEntryHandler;
import ms.system.mysql.WorldListSQLHandler;
import ms.system.util.TaskExecutor;
import ms.world.info.Response;
import ms.world.info.WorldInfo;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * Represents a game world.
 * @author Emperor
 *
 */
public final class GameServer {

	/**
	 * The world info.
	 */
	private final WorldInfo info;
	
	/**
	 * The I/O session.
	 */
	private IoSession session;
	
	/**
	 * The players active on the game server.
	 */
	private final Map<String, PlayerSession> players = new HashMap<>();
	
	/**
	 * The scheduled future for the updating task.
	 */
	private ScheduledFuture<?> future;
	
	/**
	 * constructs a new {@code GameServer} {@code Object}.
	 * @param info The world info.
	 */
	public GameServer(WorldInfo info) {
		this.info = info;
	}
	
	/**
	 * Configures the game server.
	 * @param session The I/O session.
	 */
	public void configure(IoSession session) {
		this.session = session;
		session.setGameServer(this);
		future = TaskExecutor.getExecutor().scheduleAtFixedRate(() -> {
			SQLEntryHandler.write(new WorldListSQLHandler(GameServer.this));
			if (!isActive()) {
				future.cancel(false);
				future = null;
			}
		}, 0, 10, TimeUnit.SECONDS);
	}

	/**
	 * Registers a player.
	 * @param player The player.
	 */
	public void register(PlayerSession player) {
		System.out.println("Registering player to ms");
		players.put(player.getUsername(), player);
		System.out.println("Setting player username");
		player.setWorld(this);
		System.out.println("Setting world");
		player.setActive(true);
		System.out.println("Setting player to active");
		player.setWorldId(info.getWorldId());
		System.out.println("Setting World ID");
		player.configure();
		System.out.println("Configuring player");
		WorldPacketRepository.sendRegistryResponse(this, player, Response.SUCCESSFUL);
		System.out.println("Sending registry response");
		player.getCommunication().sync();
		System.out.println("Syncing Communication");
	}

	/**
	 * Checks if the game server is active.
	 * @return {@code True} if so.
	 */
	public boolean isActive() {
		return session.isActive();
	}

	/**
	 * @return the playerAmount
	 */
	public int getPlayerAmount() {
		return players.size();
	}

	/**
	 * @return the info
	 */
	public WorldInfo getInfo() {
		return info;
	}

	/**
	 * @return the session
	 */
	public IoSession getSession() {
		return session;
	}

	/**
	 * @param session the session to set
	 */
	public void setSession(IoSession session) {
		this.session = session;
	}

	/**
	 * Gets the players value.
	 * @return The players.
	 */
	public Map<String, PlayerSession> getPlayers() {
		return players;
	}
}