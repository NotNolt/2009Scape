package org.runite.client;

import org.rs09.client.data.ReferenceCache;

final class RenderAnimationDefinition {

    /**
     * Values used for Animation Definition Information
     */

    /*
    	Start Opcode Values
	*/
    int anInt368 = -1;
    int anInt382 = -1;
    int anInt398 = -1;
    int anInt372 = -1;
    int anInt406 = -1;
    int anInt379 = -1;
    int anInt393 = -1;
    int anInt386 = -1;
    int anInt373 = -1;
    int anInt375 = -1;
    int anInt395 = 0;
    int anInt381 = 0;
    int[][] anIntArrayArray359;
    int anInt369 = 0;
    int anInt357 = 0;
    int anInt387 = 0;
    int anInt370 = 0;
    int anInt400 = 0;
    int anInt403 = 0;
    int anInt399 = 0;
    int anInt371 = 0;
    int anInt360 = -1;
    int anInt367 = -1;
    int anInt407 = -1;
    int anInt389 = -1;
    int anInt390 = -1;
    int anInt364 = -1;
    /*
		End Opcode Values
	 */
    /**
     * Cache Information
     */
    static ReferenceCache aReferenceCache_1955 = new ReferenceCache(64);
    static CacheIndex aClass153_1372;


    static RenderAnimationDefinition getRenderAnimationDefinition(int renderAnimationId) {
        try {
            RenderAnimationDefinition renderAnimationDefinition = (RenderAnimationDefinition) aReferenceCache_1955.get(renderAnimationId);
            if (renderAnimationDefinition == null) {
                byte[] buffer = aClass153_1372.getFile(32, renderAnimationId);
                renderAnimationDefinition = new RenderAnimationDefinition();
                if (buffer != null) {
                    renderAnimationDefinition.parseDefinitions(new DataBuffer(buffer));
                }
                aReferenceCache_1955.put(renderAnimationDefinition, renderAnimationId);
            }
            return renderAnimationDefinition;
        } catch (RuntimeException var4) {
            throw ClientErrorException.clientError(var4, "hb.E(" + false + ',' + renderAnimationId + ')');
        }
    }

    final void parseDefinitions(DataBuffer buffer) {
        try {
            while (true) {
                int opcode = buffer.readUnsignedByte();
                if (opcode == 0) {
                    return;
                }
                this.parseOpcode(opcode, buffer);
            }
        } catch (RuntimeException var4) {
            throw ClientErrorException.clientError(var4, "ck.H(" + -1 + ',' + (buffer != null ? "{...}" : "null") + ')');
        }
    }

    private void parseOpcode(int opcode, DataBuffer buffer) {
        try {
            switch (opcode) {
                case 1:
                    this.anInt368 = buffer.readUnsignedShort();
                    this.anInt382 = buffer.readUnsignedShort();
                    if (this.anInt382 == 65535) {
                        this.anInt382 = -1;
                    }
                    if ('\uffff' == this.anInt368) {
                        this.anInt368 = -1;
                    }
                    break;
                case 2:
                    this.anInt398 = buffer.readUnsignedShort();
                    break;
                case 3:
                    this.anInt372 = buffer.readUnsignedShort();
                    break;
                case 4:
                    this.anInt406 = buffer.readUnsignedShort();
                    break;
                case 5:
                    this.anInt379 = buffer.readUnsignedShort();
                    break;
                case 6:
                    this.anInt393 = buffer.readUnsignedShort();
                    break;
                case 7:
                    this.anInt386 = buffer.readUnsignedShort();
                    break;
                case 8:
                    this.anInt373 = buffer.readUnsignedShort();
                    break;
                case 9:
                    this.anInt375 = buffer.readUnsignedShort();
                    break;
                case 26:
                    this.anInt395 = (short) (4 * buffer.readUnsignedByte());
                    this.anInt381 = (short) (4 * buffer.readUnsignedByte());
                    break;
                case 27:
                    if (this.anIntArrayArray359 == null) {
                        this.anIntArrayArray359 = new int[12][];
                    }
                    int var4 = buffer.readUnsignedByte();
                    this.anIntArrayArray359[var4] = new int[6];
                    for (int var5 = 0; var5 < 6; ++var5) {
                        this.anIntArrayArray359[var4][var5] = buffer.readSignedShort();
                    }
                    break;
                case 29:
                    this.anInt369 = buffer.readUnsignedByte();
                    break;
                case 30:
                    this.anInt357 = buffer.readUnsignedShort();
                    break;
                case 31:
                    this.anInt387 = buffer.readUnsignedByte();
                    break;
                case 32:
                    this.anInt370 = buffer.readUnsignedShort();
                    break;
                case 33:
                    this.anInt400 = buffer.readSignedShort();
                    break;
                case 34:
                    this.anInt403 = buffer.readUnsignedByte();
                    break;
                case 35:
                    this.anInt399 = buffer.readUnsignedShort();
                    break;
                case 36:
                    this.anInt371 = buffer.readSignedShort();
                    break;
                case 37:
                    this.anInt360 = buffer.readUnsignedByte();
                    break;
                case 38:
                    this.anInt367 = buffer.readUnsignedShort();
                    break;
                case 39:
                    this.anInt407 = buffer.readUnsignedShort();
                    break;
                case 40:
                    this.anInt389 = buffer.readUnsignedShort();
                    break;
                case 41:
                    this.anInt390 = buffer.readUnsignedShort();
                    break;
                case 42:
                    this.anInt364 = buffer.readUnsignedShort();
                    break;
                case 43:
                case 44:
                case 45:
                    buffer.readUnsignedShort();
                    break;
            }
        } catch (RuntimeException var6) {
            throw ClientErrorException.clientError(var6, "ck.E(" + opcode + ',' + (byte) -106 + ',' + (buffer != null ? "{...}" : "null") + ')');
        }
    }
}
