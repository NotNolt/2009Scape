package org.runite.client;

import org.rs09.client.data.ReferenceCache;

public final class GraphicDefinition {

    /**
     * Values used for Graphic Definition Information
     */
    int graphicId;
    /*
        Start Opcode Values
    */
    private int anInt541;
    int anInt542 = -1;
    private int sizeX = 128;
    private int sizeY = 128;
    private int anInt543 = 0;
    private int anInt538 = 0;
    private int anInt537 = 0;
    boolean aBoolean536 = false;
    private short[] aShortArray533;
    private short[] aShortArray545;
    private short[] aShortArray534;
    private short[] aShortArray535;
	/*
		End Opcode Values
	 */
    /**
     * Cache Information
     */
    static CacheIndex aClass153_3214;
    public static CacheIndex aClass153_4048;
    static ReferenceCache aReferenceCache_2604 = new ReferenceCache(64);
    static ReferenceCache aReferenceCache_511 = new ReferenceCache(30);


    static GraphicDefinition getGraphicDefinition(int graphicId) {
        try {
            GraphicDefinition graphicDefinition = (GraphicDefinition) aReferenceCache_2604.get(graphicId);
            if (graphicDefinition == null) {
                byte[] buffer = aClass153_3214.getFile(graphicId >>> 8, 255 & graphicId);
                graphicDefinition = new GraphicDefinition();
                graphicDefinition.graphicId = graphicId;
                if (null != buffer) {
                    graphicDefinition.parseDefinitions(new DataBuffer(buffer));
                }
                aReferenceCache_2604.put(graphicDefinition, graphicId);
            }
            return graphicDefinition;
        } catch (RuntimeException var4) {
            throw ClientErrorException.clientError(var4, "ck.D(" + graphicId + ')');
        }
    }

    final void parseDefinitions(DataBuffer buffer) {
        try {
            while (true) {
                int opcode = buffer.readUnsignedByte();
                if (opcode == 0) {
                    return;
                }
                this.parseOpcode(buffer, opcode);
            }
        } catch (RuntimeException var4) {
            throw ClientErrorException.clientError(var4, "eg.A(" + (buffer != null ? "{...}" : "null") + ',' + (byte) -113 + ')');
        }
    }

    private void parseOpcode(DataBuffer buffer, int opcode) {
        try {
            int var4;
            int var5;
            switch (opcode) {
                case 1:
                    this.anInt541 = buffer.readUnsignedShort();
                    break;
                case 2:
                    this.anInt542 = buffer.readUnsignedShort();
                    break;
                case 4:
                    this.sizeX = buffer.readUnsignedShort();
                    break;
                case 5:
                    this.sizeY = buffer.readUnsignedShort();
                    break;
                case 6:
                    this.anInt543 = buffer.readUnsignedShort();
                    break;
                case 7:
                    this.anInt538 = buffer.readUnsignedByte();
                    break;
                case 8:
                    this.anInt537 = buffer.readUnsignedByte();
                    break;
                case 9:
                    this.aBoolean536 = true;
                    break;
                case 40:
                    var4 = buffer.readUnsignedByte();
                    this.aShortArray533 = new short[var4];
                    this.aShortArray545 = new short[var4];

                    for (var5 = 0; var4 > var5; ++var5) {
                        this.aShortArray533[var5] = (short) buffer.readUnsignedShort();
                        this.aShortArray545[var5] = (short) buffer.readUnsignedShort();
                    }
                    break;
                case 41:
                    var4 = buffer.readUnsignedByte();
                    this.aShortArray534 = new short[var4];
                    this.aShortArray535 = new short[var4];

                    for (var5 = 0; var5 < var4; ++var5) {
                        this.aShortArray534[var5] = (short) buffer.readUnsignedShort();
                        this.aShortArray535[var5] = (short) buffer.readUnsignedShort();
                    }
                    break;
            }
        } catch (RuntimeException var6) {
            throw ClientErrorException.clientError(var6, "eg.D(" + (buffer != null ? "{...}" : "null") + ',' + opcode + ',' + 128 + ')');
        }


    }

    final Model method966(int var1, int var3, int var4) {
        try {
            Model var5 = (Model) aReferenceCache_511.get(this.graphicId);
            if (var5 == null) {
                Model_Sub1 var6 = Model_Sub1.method2015(aClass153_4048, this.anInt541);
                if (null == var6) {
                    return null;
                }

                int var7;
                if (null != this.aShortArray533) {
                    for (var7 = 0; this.aShortArray533.length > var7; ++var7) {
                        var6.method2016(this.aShortArray533[var7], this.aShortArray545[var7]);
                    }
                }

                if (this.aShortArray534 != null) {
                    for (var7 = 0; var7 < this.aShortArray534.length; ++var7) {
                        var6.method1998(this.aShortArray534[var7], this.aShortArray535[var7]);
                    }
                }

                var5 = var6.method2008(64 - -this.anInt538, this.anInt537 + 850, -30, -50, -30);
                aReferenceCache_511.put(var5, this.graphicId);
            }

            Model var9;
            if (this.anInt542 == -1 || var3 == -1) {
                var9 = var5.method1882(true, true, true);
            } else {
                var9 = AnimationDefinition.getAnimationDefinition(this.anInt542).method2059(var1, var4, var3, var5);
            }
            if (128 != this.sizeX || 128 != this.sizeY) {
                var9.resize(this.sizeX, this.sizeY, this.sizeX);
            }
            if (this.anInt543 != 0) {
                if (this.anInt543 == 90) {
                    var9.method1885();
                }

                if (180 == this.anInt543) {
                    var9.method1874();
                }

                if (270 == this.anInt543) {
                    var9.method1900();
                }
            }

            return var9;
        } catch (RuntimeException var8) {
            throw ClientErrorException.clientError(var8, "eg.C(" + var1 + ',' + (byte) -30 + ',' + var3 + ',' + var4 + ')');
        }
    }

}
