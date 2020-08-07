package setting;

/**
 * Represents the game settings to use in the client.
 * @author Woahscam
 *
 */
public final class GameSetting {

    /**
     * The name of the game.
     */
    private final String name;

    /**
     * The ip to the game to connect to.
     */
    private String ip;

    /**
     * Represents the world if to load.
     */
    private int world;

    /**
     * Represents the environment of the game.
     */
    private String environment;

    /**
     * Represents the language used
     */
    private String language;

    /**
     * Represents the game type
     */
    private String game;

    /**
     * If the client should use a lower amount of memory.
     */
    private final boolean lowMemory;

    /**
     * Constructs a new {@code GameSetting} {@code Object}
     * @param name the name.
     * @param ip the ip.
     * @param world the world.
     * @param environment the enviornment.
     * @param lowMemory if low memory.
     */
    public GameSetting(String name, String ip, int world, String environment, String language, String game, boolean lowMemory) {
        this.name = name;
        this.ip = ip;
        this.world = world;
        this.environment = environment;
        this.language = language;
        this.game = game;
        this.lowMemory = lowMemory;
    }

    /**
     * Gets the name.
     * @return the name.
     */
    public String getName() {
        return name;
    }

    /**
     * @return the world
     */
    public int getWorld() {
        return world;
    }

    /**
     * @return the enviornment
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * @return the ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * Checks if the client has th low memory flag enabled.
     * @return {@code True} if so.
     */
    public boolean isLowMemory() {
        return lowMemory;
    }

    /**
     * Sets the ip.
     * @param ip the ip to set
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * Sets the World
     * @param world to set
     */
    public void setWorld(int world) {
        this.world = world;
    }

    /**
     * Sets the Language
     * @param language to set
     */
    public void setLanguage(String language) { this.language = language; }

    /**
     * Sets the Game type 0/1
     * @param game
     */
    public void setGame(String game) { this.game = game; }

    /**
     * Sets the enviroment
     * @return
     */
    public void setEnvironment(String environment) { this.environment = environment; }
}