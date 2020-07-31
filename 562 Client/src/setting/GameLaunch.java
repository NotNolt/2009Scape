package setting;
import jagex.Client;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Handles the launching of the game client
 * @author Woahscam
 *
 */

public class GameLaunch {

    public static final String CONF_FILE= "client.conf";

    public static String PUBLIC_IP_ADDRESS;

    /**
     * The game settings.
     */
    public static GameSetting SETTINGS = new GameSetting("2009Scape 562", "127.0.0.1", 1, "wip", "english", "game0", false);

    /**
     * The main method.
     r @param args the arguments casted on runtime.
     r_game

     */
    public static void main(String[]args) {
        try {
            PUBLIC_IP_ADDRESS = "127.0.0.1";
        } catch (Exception e){
            System.out.println("Can't find config file " + CONF_FILE + " defaulting to IP 127.0.0.1");
            PUBLIC_IP_ADDRESS = "127.0.0.1";
        }
        System.out.println("Running liveserver client");
        Configurations.LOCAL_SERVER = false;
        Configurations.LOCAL_MS = false;
        Configurations.MS_IP = Configurations.LOCAL_MS ? "127.0.0.1" : PUBLIC_IP_ADDRESS; //Needs to be done because of order it's otherwise set

        for (int i = 0; i < args.length; i++) {
            String[] cmd = args[i].split("=");
            switch (cmd[0]) {
                case "ip":
                    SETTINGS.setIp(cmd[1]);
                    break;
                case "worldid":
                    SETTINGS.setWorld(Integer.parseInt(cmd[2]));
                    break;
                case "modewhat":
                    SETTINGS.setEnvironment(String.valueOf(cmd[3]));
                    break;
                case "language":
                    SETTINGS.setLanguage(String.valueOf(cmd[4]));
                    break;
                case "game":
                    SETTINGS.setGame(String.valueOf(cmd[5]));
                    break;
            }
        }
        /**
         * Launches the client
         */
        //Client.main();
    }

}
