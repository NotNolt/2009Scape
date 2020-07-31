package setting;

import jagex.Client;

import java.io.File;
import java.math.BigInteger;

/**
 * A class with configurations stored.
 * @author Woahscam
 */

public final class Configurations {

    /**
     * The website.
     */
    public static final String WEBSITE = "https://github.com/2009scape/2009Scape";

    /**
     * The client build.
     */
    public static final int CLIENT_BUILD = 562;

    /**
     * The sub build.
     */
    public static final int SUB_BUILD = 1;

    /**
     * If the client is local.
     */
    public static boolean LOCAL_MS = true;
    public static boolean LOCAL_SERVER = true;
    
    public static String PUBLIC_IP_ADDRESS;

    /**
     * Packaging.
     */
    public static final String PACKAGE_JAGEX = " ";

    /**
     * The login theme song.
     */
    public static final String LOGIN_MUSIC = "sea shanty 2";

    /**
     * The cache name.
     */
    public static final String CACHE_NAME = File.separator + ".runite_" + CLIENT_BUILD;

    /**
     * The RSA modulus.
     */
    public static final BigInteger MODULUS = new BigInteger("11206719348431650513171671018397173875527561036041859828114669681511079464644350457240662773502649504136578282907910504211944100665125647292825199995029019");

    /**
     * The RSA exponent.
     */
    public static final BigInteger PUBLIC_EXPONENT = new BigInteger("65537");

    /**
     * If the walk packet should be send when doing eg. object actions.
     */
    public static final boolean ENABLE_WALK_AID = false;

    /**
     * The MS IP.
     */
    public static String MS_IP = Configurations.LOCAL_MS ? "127.0.0.1" : Configurations.PUBLIC_IP_ADDRESS;

    /**
     * The operation system name.
     */
    public static final String OS_NAME = System.getProperty("os.name").toUpperCase();

    /**
     * IF RSA is enabled.
     */
    public static final boolean USE_RSA = true;

    /**
     * IF we use ISAAC cipher.
     */
    public static final boolean USE_ISAAC = false;

    /**
     * The cache path.
     * @return the path.
     */
    public static String getCachePath() {
        final String OS = System.getProperty("os.name").toUpperCase();
        if (OS.contains("WIN")) {
            return new StringBuilder(System.getProperty("user.home") + CACHE_NAME).toString();
        } else if (OS.contains("MAC")) {
            return new StringBuilder(System.getProperty("user.home") + CACHE_NAME).toString();
        } else if (OS.contains("NUX")) {
            return System.getProperty("user.home") + CACHE_NAME;
        }
        return new StringBuilder(System.getProperty("user.dir")).toString() + CACHE_NAME;
    }

}