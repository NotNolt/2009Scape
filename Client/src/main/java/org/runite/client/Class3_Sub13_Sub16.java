package org.runite.client;

import java.util.Random;

final class Class3_Sub13_Sub16 extends Class3_Sub13 {

    /**
     * Method154 Switch
     */
    static int anInt3589;
    static int anInt1042;
    static int anInt1914;
    static int anInt3422;
    /**
     * Method157 switch
     */
    private int anInt3203 = 5;
    private int anInt3204 = 5;
    private int anInt3197 = 0;
    private int anInt3193 = 2048;
    private int anInt3191 = 2;
    private int anInt3194 = 1;
    /**
     * Unsorted
     */
    private byte[] aByteArray3195 = new byte[512];
    private short[] aShortArray3200 = new short[512];


    private void method242() {
        try {
            Random var2 = new Random(this.anInt3197);
            this.aShortArray3200 = new short[512];
            if (0 < this.anInt3193) {
                for (int var3 = 0; 512 > var3; ++var3) {
                    this.aShortArray3200[var3] = (short) Class100.method1603((byte) 23, this.anInt3193, var2);
                }
            }
        } catch (RuntimeException var4) {
            throw ClientErrorException.clientError(var4, "hm.C(" + (byte) 37 + ')');
        }
    }

    final void method158(int var1) {
        try {
            if (var1 != 16251) {
                Unsorted.aClass44_Sub1Array3201 = null;
            }
            this.aByteArray3195 = Class49.method1123(var1 ^ 16727940, this.anInt3197);
            this.method242();
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "hm.P(" + var1 + ')');
        }
    }

    final int[] method154(int var1, byte var2) {
        try {
            int[] var3 = this.aClass114_2382.method1709(var1);
            if (this.aClass114_2382.aBoolean1580) {
                int var5 = this.anInt3204 * Class163_Sub3.anIntArray2999[var1] + 2048;
                int var6 = var5 >> 12;
                int var7 = var6 - -1;

                for (int var15 = 0; var15 < Class113.anInt1559; ++var15) {
                    anInt3422 = Integer.MAX_VALUE;
                    anInt1914 = Integer.MAX_VALUE;
                    anInt1042 = Integer.MAX_VALUE;
                    anInt3589 = Integer.MAX_VALUE;
                    int var16 = this.anInt3203 * Class102.anIntArray2125[var15] + 2048;
                    int var17 = var16 >> 12;
                    int var18 = 1 + var17;

                    int var19;
                    for (int var9 = var6 - 1; var7 >= var9; ++var9) {
                        int var13 = 255 & this.aByteArray3195[(var9 >= this.anInt3204 ? -this.anInt3204 + var9 : var9) & 255];

                        for (int var8 = var17 + -1; var18 >= var8; ++var8) {
                            int var14 = (255 & this.aByteArray3195[(var8 >= this.anInt3203 ? -this.anInt3203 + var8 : var8) + var13 & 255]) * 2;
                            int var10 = -(var8 << 12) - (this.aShortArray3200[var14++] - var16);
                            int var11 = var5 - (this.aShortArray3200[var14] + (var9 << 12));
                            var19 = this.anInt3194;
                            int var12;
                            if (var19 == 1) {
                                var12 = var11 * var11 + var10 * var10 >> 12;
                            } else if (3 == var19) {
                                var10 = var10 < 0 ? -var10 : var10;
                                var11 = var11 >= 0 ? var11 : -var11;
                                var12 = var11 >= var10 ? var11 : var10;
                            } else if (4 == var19) {
                                var10 = (int) (Math.sqrt((double) ((float) (0 > var10 ? -var10 : var10) / 4096.0F)) * 4096.0D);
                                var11 = (int) (Math.sqrt((double) ((float) (var11 >= 0 ? var11 : -var11) / 4096.0F)) * 4096.0D);
                                var12 = var11 + var10;
                                var12 = var12 * var12 >> 12;
                            } else if (var19 == 5) {
                                var10 *= var10;
                                var11 *= var11;
                                var12 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var11 + var10) / 1.6777216E7F))) * 4096.0D);
                            } else if (2 == var19) {
                                var12 = (var10 >= 0 ? var10 : -var10) - -(var11 < 0 ? -var11 : var11);
                            } else {
                                var12 = (int) (4096.0D * Math.sqrt((double) ((float) (var11 * var11 + var10 * var10) / 1.6777216E7F)));
                            }

                            if (var12 >= anInt3589) {
                                if (anInt1042 > var12) {
                                    anInt3422 = anInt1914;
                                    anInt1914 = anInt1042;
                                    anInt1042 = var12;
                                } else if (anInt1914 <= var12) {
                                    if (var12 < anInt3422) {
                                        anInt3422 = var12;
                                    }
                                } else {
                                    anInt3422 = anInt1914;
                                    anInt1914 = var12;
                                }
                            } else {
                                anInt3422 = anInt1914;
                                anInt1914 = anInt1042;
                                anInt1042 = anInt3589;
                                anInt3589 = var12;
                            }
                        }
                    }

                    var19 = this.anInt3191;
                    switch (var19) {
                        case 0:
                            var3[var15] = anInt3589;
                            break;
                        case 1:
                            var3[var15] = anInt1042;
                            break;
                        case 2:
                            var3[var15] = anInt1042 + -anInt3589;
                            break;
                        case 3:
                            var3[var15] = anInt1914;
                            break;
                        case 4:
                            var3[var15] = anInt3422;
                            break;
                    }
                }
            }

            return var3;
        } catch (RuntimeException var20) {
            throw ClientErrorException.clientError(var20, "hm.D(" + var1 + ',' + var2 + ')');
        }
    }

    final void method157(int opcode, DataBuffer buffer, boolean var3) {
        try {
            if (!var3) {
                this.method157(-122, null, false);
            }
            switch (opcode) {
                case 0:
                    this.anInt3203 = this.anInt3204 = buffer.readUnsignedByte();
                    break;
                case 1:
                    this.anInt3197 = buffer.readUnsignedByte();
                    break;
                case 2:
                    this.anInt3193 = buffer.readUnsignedShort();
                    break;
                case 3:
                    this.anInt3191 = buffer.readUnsignedByte();
                    break;
                case 4:
                    this.anInt3194 = buffer.readUnsignedByte();
                    break;
                case 5:
                    this.anInt3203 = buffer.readUnsignedByte();
                    break;
                case 6:
                    this.anInt3204 = buffer.readUnsignedByte();
                    break;
            }
        } catch (RuntimeException var5) {
            throw ClientErrorException.clientError(var5, "hm.A(" + opcode + ',' + (buffer != null ? "{...}" : "null") + ',' + var3 + ')');
        }
    }

    public Class3_Sub13_Sub16() {
        super(0, true);
    }

}
