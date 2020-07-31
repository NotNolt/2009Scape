package core.tools;

import core.cache.misc.buffer.ByteBufferUtils;
import java.nio.ByteBuffer;
import core.cache.crypto.ISAACCipher;

/**
 * @author _jordan <citellumrsps@gmail.com>
 */
public final class IsaacGroup {

    /**
     * Represents the isaac random decoder.
     */
    private final ISAACCipher decoder;

    /**
     * Represents the isaac random encoder.
     */
    private final ISAACCipher encoder;

    /**
     * Constructs a new object.
     * @param decoder The isaac random decoder.
     * @param encoder The isaac random encoder.
     */
    public IsaacGroup(ISAACCipher decoder, ISAACCipher encoder) {
        this.decoder = decoder;
        this.encoder = encoder;
    }

    /**
     * Sets the isaac random group.
     * @param seed The isaac seed.
     * @return The constructed isaac group set.
     */
    public static IsaacGroup get(int[] seed) {
        ISAACCipher decoder = new ISAACCipher(seed);
        for (int i = 0; i < 4; i++) {
            seed[i] += 50;
        }
        ISAACCipher encoder = new ISAACCipher(seed);
        return new IsaacGroup(decoder, encoder);
    }

    /**
     * Creates and returns the isaac seeds later to be used for isaac random.
     *
     * @param buffer The bytebuf to use for reading incoming information.
     * @param isaacSeed The isaac seed block.
     * @return The seeds.
     */
    public static int[] setIsaacSeeds(ByteBuffer buffer, int[] isaacSeed) {
        for (int i = 0; i < isaacSeed.length; i++) {
            isaacSeed[i] = buffer.getInt();
        }
        return isaacSeed;
    }

    /**
     * Gets the decoder.
     * @return the decoder
     */
    public ISAACCipher getDecoder() {
        return decoder;
    }

    /**
     * Gets the encoder.
     * @return the encoder
     */
    public ISAACCipher getEncoder() {
        return encoder;
    }

}
