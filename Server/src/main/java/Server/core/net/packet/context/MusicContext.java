package core.net.packet.context;

import core.game.node.entity.player.Player;
import core.net.packet.Context;

/**
 * Packet context for music.
 * @author Emperor
 * @author SonicForce41
 */
public class MusicContext implements Context {

	/**
	 * The jagex.Player
	 */
	private Player player;

	/**
	 * The music Id
	 */
	private int musicId;

	/**
	 * The music length
	 */
	private int length;

	/**
	 * The music length
	 */
	private int categoryId;

	/**
	 * The secondary music type.
	 */
	private boolean secondary;

	/**
	 * Constructs a new {@code MusicContext} {@code Object}.
	 * @param player The player.
	 * @param musicId The music id.
	 */
	public MusicContext(Player player, int musicId) {
		this(player, musicId, false);
	}

	/**
	 * Constructs a new {@code MusicContext} {@code Object}.
	 * @param player The player.
	 * @param musicId The music id.
	 * @param temporary The temporary music type.
	 */
	public MusicContext(Player player, int musicId, boolean temporary) {
		this.player = player;
		this.musicId = musicId;
		this.secondary = temporary;
	}

	public MusicContext(Player player, int musicId, int length) {
		this.player = player;
		this.musicId = musicId;
		this.length = length;
	}

	public MusicContext(Player player, int musicId, int categoryId, int length) {
		this.player = player;
		this.musicId = musicId;
		this.categoryId = categoryId;
		this.length = length;
	}

	/**
	 * Gets the Music Id
	 * @return the musicId
	 */
	public final int getMusicId() {
		return musicId;
	}

	/**
	 * Gets the Music length
	 * @return
	 */
	public final int getLength() { return length; }

	/**
	 * Gets the CategoryId
	 * @return
	 */
	public final int getcategoryId() { return categoryId; }

	@Override
	public Player getPlayer() {
		return player;
	}

	/**
	 * Gets the secondary.
	 * @return The secondary.
	 */
	public boolean isSecondary() {
		return secondary;
	}

	/**
	 * Sets the secondary.
	 * @param secondary The secondary to set.
	 */
	public void setSecondary(boolean secondary) {
		this.secondary = secondary;
	}

}