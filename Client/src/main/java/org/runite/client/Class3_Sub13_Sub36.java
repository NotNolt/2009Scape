package org.runite.client;

import org.rs09.client.rendering.Toolkit;

public final class Class3_Sub13_Sub36 extends Class3_Sub13 {

    static int anInt3423;
    static float aFloat3424;
    static boolean aBoolean3094 = false;
    private int[] anIntArray3425;
    static byte[][][] aByteArrayArrayArray3430;
    private int anInt3431;
    private int anInt3433;
    private int anInt3434 = -1;
    static float aFloat3435;

    static void method338(int var1, boolean var2, int var3, int var4, int var5) {
        try {
            ++Class79.anInt1127;
            Class124.method1745();
            if (!var2) {
                Class3_Sub5.method116(true);
                method1611(71, true);
                Class3_Sub5.method116(false);
            }

            method1611(100, false);
            if (!var2) {
                Class3_Sub13_Sub28.method302(2);
            }

            Unsorted.method2067();
            if (HDToolKit.highDetail) {
                Class65.method1239(var4, 125, var5, var1, var3, true);
                var3 = Class163_Sub1.anInt2989;
                var5 = Class3_Sub28_Sub3.anInt3564;
                var4 = Class96.resizeWidth;
                var1 = Unsorted.resizeHeight;
            }

            int var6;
            int var7;
            if (1 == Class133.anInt1753) {
                var7 = 2047 & LinkableRSString.anInt2589 + Unsorted.CAMERA_DIRECTION;
                var6 = Unsorted.anInt2309;
                if (Class75_Sub4.anInt2670 / 256 > var6) {
                    var6 = Class75_Sub4.anInt2670 / 256;
                }

                if (Class104.aBooleanArray2169[4] && Class166.anIntArray2073[4] + 128 > var6) {
                    var6 = 128 + Class166.anIntArray2073[4];
                }

                Class140_Sub2.method1952(Unsorted.anInt3155, var1, Class121.method1736(WorldListCountry.localPlane, 1, Class102.player.anInt2819, Class102.player.anInt2829) + -50, Client.ZOOM - -(var6 * 3), var7, Unsorted.anInt942, var6);
            }

            var7 = Class7.anInt2162;
            var6 = NPC.anInt3995;
            int var8 = Unsorted.anInt1111;
            int var9 = Class139.anInt1823;
            int var10 = Class3_Sub13_Sub25.anInt3315;

            int var11;
            int var12;
            for (var11 = 0; 5 > var11; ++var11) {
                if (Class104.aBooleanArray2169[var11]) {
                    var12 = (int) ((double) (-Class3_Sub13_Sub32.anIntArray3383[var11]) + (double) (Class3_Sub13_Sub32.anIntArray3383[var11] * 2 + 1) * Math.random() + Math.sin((double) Class163_Sub1_Sub1.anIntArray4009[var11] * ((double) Class3_Sub13_Sub29.anIntArray3359[var11] / 100.0D)) * (double) Class166.anIntArray2073[var11]);
                    if (var11 == 3) {
                        Class3_Sub13_Sub25.anInt3315 = var12 + Class3_Sub13_Sub25.anInt3315 & 2047;
                    }

                    if (var11 == 4) {
                        Class139.anInt1823 += var12;
                        if (128 > Class139.anInt1823) {
                            Class139.anInt1823 = 128;
                        }

                        if (Class139.anInt1823 > 383) {
                            Class139.anInt1823 = 383;
                        }
                    }

                    if (var11 == 2) {
                        Unsorted.anInt1111 += var12;
                    }

                    if (var11 == 1) {
                        Class7.anInt2162 += var12;
                    }

                    if (var11 == 0) {
                        NPC.anInt3995 += var12;
                    }
                }
            }

            Class3_Sub28_Sub20.method725();
            if (HDToolKit.highDetail) {
                Class22.setClipping(var3, var5, var3 + var4, var5 - -var1);
                float var17 = (float) Class139.anInt1823 * 0.17578125F;
                float var16 = 0.17578125F * (float) Class3_Sub13_Sub25.anInt3315;
                if (Class133.anInt1753 == 3) {
                    var17 = 360.0F * Class3_Sub28_Sub6.aFloat1169 / 6.2831855F;
                    var16 = Class45.aFloat730 * 360.0F / 6.2831855F;
                }

                HDToolKit.viewport(var3, var5, var4, var1, var4 / 2 + var3, var5 - -(var1 / 2), var17, var16, Unsorted.anInt1705, Unsorted.anInt1705);
            } else {
                Class74.setClipping(var3, var5, var4 + var3, var1 + var5);
                Class51.method1134();
            }

            if (!Class38_Sub1.aBoolean2615 && var3 <= Unsorted.anInt1297 && var4 + var3 > Unsorted.anInt1297 && var5 <= Class38_Sub1.anInt2612 && Class38_Sub1.anInt2612 < var1 + var5) {
                aBoolean3094 = true;
                Unsorted.anInt59 = 0;
                var12 = Class145.screenUpperX;
                int var13 = Class1.screenUpperY;
                var11 = Class139.screenLowerX;
                Unsorted.anInt3642 = var11 + (var12 - var11) * (-var3 + Unsorted.anInt1297) / var4;
                int var14 = HDToolKit.screenLowerY;
                Class140_Sub1_Sub1.anInt384 = (-var13 + var14) * (Class38_Sub1.anInt2612 - var5) / var1 + var13;
            } else {
                aBoolean3094 = false;
                Unsorted.anInt59 = 0;
            }

            Class58.method1194();
            byte var19 = Class137.method1817() != 2 ? 1 : (byte) Class79.anInt1127;
            if (HDToolKit.highDetail) {
                HDToolKit.method1846();
                HDToolKit.method1831(true);
                HDToolKit.method1827(true);
                if (Class143.loadingStage == 10) {
                    var12 = Class3_Sub30_Sub1.method809(Class106.anInt1446, Unsorted.anInt1111 >> 10, Unsorted.anInt3625, NPC.anInt3995 >> 10);
                } else {
                    var12 = Class3_Sub30_Sub1.method809(Class106.anInt1446, Class102.player.anIntArray2755[0] >> 3, Unsorted.anInt3625, Class102.player.anIntArray2767[0] >> 3);
                }

                Class68.method1269(Class44.anInt719, !WorldListEntry.aBoolean2623);
                HDToolKit.HDViewportBackgroundColor(var12);
                ClientErrorException.method2285(Class139.anInt1823, Unsorted.anInt1111, Class7.anInt2162, NPC.anInt3995, Class3_Sub13_Sub25.anInt3315);
                HDToolKit.anInt1791 = Class44.anInt719;
                Class3_Sub22.method398(NPC.anInt3995, Class7.anInt2162, Unsorted.anInt1111, Class139.anInt1823, Class3_Sub13_Sub25.anInt3315, Class158.aByteArrayArrayArray2008, Unsorted.anIntArray686, Class129_Sub1.anIntArray2696, Class159.anIntArray2021, Player.anIntArray3959, Class140_Sub7.anIntArray1871, WorldListCountry.localPlane + 1, var19, Class102.player.anInt2819 >> 7, Class102.player.anInt2829 >> 7);
                Unsorted.aBoolean47 = true;
                Class68.method1265();
                ClientErrorException.method2285(0, 0, 0, 0, 0);
                Class58.method1194();
                Unsorted.method1775();
                Class82.method1405(var5, var4, var3, Unsorted.anInt1705, var1, Unsorted.anInt1705, -7397);
                Class163_Sub2_Sub1.method2221(var4, var3, var1, Unsorted.anInt1705, Unsorted.anInt1705, var5);
            } else {
                Toolkit.JAVA_TOOLKIT.method934(var3, var5, var4, var1, 0);
                Class3_Sub22.method398(NPC.anInt3995, Class7.anInt2162, Unsorted.anInt1111, Class139.anInt1823, Class3_Sub13_Sub25.anInt3315, Class158.aByteArrayArrayArray2008, Unsorted.anIntArray686, Class129_Sub1.anIntArray2696, Class159.anIntArray2021, Player.anIntArray3959, Class140_Sub7.anIntArray1871, WorldListCountry.localPlane - -1, var19, Class102.player.anInt2819 >> 7, Class102.player.anInt2829 >> 7);
                Class58.method1194();
                Unsorted.method1775();
                Class82.method1405(var5, var4, var3, 256, var1, 256, -6403 + -994);
                Class163_Sub2_Sub1.method2221(var4, var3, var1, 256, 256, var5);
            }

            ((Class102) Class51.anInterface2_838).method1610(Class106.anInt1446);
            Class65.method1235(var4, var5, var1, var3);
            Class139.anInt1823 = var9;
            Unsorted.anInt1111 = var8;
            Class7.anInt2162 = var7;
            NPC.anInt3995 = var6;
            Class3_Sub13_Sub25.anInt3315 = var10;
            if (Class3_Sub13_Sub4.aBoolean3064 && Class58.aJs5Worker_917.countPriorityRequests() == 0) {
                Class3_Sub13_Sub4.aBoolean3064 = false;
            }

            if (Class3_Sub13_Sub4.aBoolean3064) {
                Toolkit.getActiveToolkit().method934(var3, var5, var4, var1, 0);
                Class3_Sub13.method164((byte) -52, false, TextCore.LoadingPleaseWait2);
            }

            if (!var2 && !Class3_Sub13_Sub4.aBoolean3064 && !Class38_Sub1.aBoolean2615 && var3 <= Unsorted.anInt1297 && var4 + var3 > Unsorted.anInt1297 && Class38_Sub1.anInt2612 >= var5 && var1 + var5 > Class38_Sub1.anInt2612) {
                Class104.method1628(var5, var4, var1, var3, Class38_Sub1.anInt2612, Unsorted.anInt1297);
            }

        } catch (RuntimeException var15) {
            throw ClientErrorException.clientError(var15, "ui.OA(" + -6403 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
        }
    }

    static void method1611(int var0, boolean var1) {
        try {
            int var2;
            NPC var3;
            int var6;
            int var7;
            int var8;
            int var9;
            int var10;
            for (var2 = 0; var2 < Class163.localNPCCount; ++var2) {
                var3 = NPC.npcs[Class15.localNPCIndexes[var2]];
                if (null != var3 && var3.hasDefinitions() && var3.definition.aBoolean1263 == var1 && var3.definition.method1472()) {
                    int var4 = var3.getSize();
                    int var5;
                    if (1 != var4) {
                        if (((1 & var4) != 0 || (127 & var3.anInt2819) == 0 && 0 == (127 & var3.anInt2829)) && ((var4 & 1) != 1 || (127 & var3.anInt2819) == 64 && 64 == (127 & var3.anInt2829))) {
                            var5 = var3.anInt2819 + -(var4 * 64) >> 7;
                            var6 = -(var4 * 64) + var3.anInt2829 >> 7;
                            var7 = var3.getSize() + var5;
                            if (var5 < 0) {
                                var5 = 0;
                            }

                            if (var7 > 104) {
                                var7 = 104;
                            }

                            var8 = var6 + var3.getSize();
                            if (var6 < 0) {
                                var6 = 0;
                            }

                            if (104 < var8) {
                                var8 = 104;
                            }

                            for (var9 = var5; var9 < var7; ++var9) {
                                for (var10 = var6; var8 > var10; ++var10) {
                                    ++Class163_Sub1_Sub1.anIntArrayArray4010[var9][var10];
                                }
                            }
                        }
                    } else if ((127 & var3.anInt2819) == 64 && (var3.anInt2829 & 127) == 64) {
                        var5 = var3.anInt2819 >> 7;
                        var6 = var3.anInt2829 >> 7;
                        if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                            ++Class163_Sub1_Sub1.anIntArrayArray4010[var5][var6];
                        }
                    }
                }
            }

            label200:
            for (var2 = 0; Class163.localNPCCount > var2; ++var2) {
                var3 = NPC.npcs[Class15.localNPCIndexes[var2]];
                long var15 = (long) Class15.localNPCIndexes[var2] << 32 | 536870912L;
                if (var3 != null && var3.hasDefinitions() && !var3.definition.aBoolean1263 == !var1 && var3.definition.method1472()) {
                    var6 = var3.getSize();
                    if (var6 != 1) {
                        if ((var6 & 1) == 0 && (var3.anInt2819 & 127) == 0 && (127 & var3.anInt2829) == 0 || (var6 & 1) == 1 && (var3.anInt2819 & 127) == 64 && (127 & var3.anInt2829) == 64) {
                            var7 = -(64 * var6) + var3.anInt2819 >> 7;
                            var8 = -(var6 * 64) + var3.anInt2829 >> 7;
                            var10 = var8 - -var6;
                            if (var8 < 0) {
                                var8 = 0;
                            }

                            boolean var11 = true;
                            var9 = var7 + var6;
                            if (var10 > 104) {
                                var10 = 104;
                            }

                            if (var7 < 0) {
                                var7 = 0;
                            }

                            if (var9 > 104) {
                                var9 = 104;
                            }

                            int var12;
                            int var13;
                            for (var12 = var7; var12 < var9; ++var12) {
                                for (var13 = var8; var10 > var13; ++var13) {
                                    if (Class163_Sub1_Sub1.anIntArrayArray4010[var12][var13] <= 1) {
                                        var11 = false;
                                        break;
                                    }
                                }
                            }

                            if (var11) {
                                var12 = var7;

                                while (true) {
                                    if (var12 >= var9) {
                                        continue label200;
                                    }

                                    for (var13 = var8; var13 < var10; ++var13) {
                                        --Class163_Sub1_Sub1.anIntArrayArray4010[var12][var13];
                                    }

                                    ++var12;
                                }
                            }
                        }
                    } else if ((127 & var3.anInt2819) == 64 && (127 & var3.anInt2829) == 64) {
                        var7 = var3.anInt2819 >> 7;
                        var8 = var3.anInt2829 >> 7;
                        if (0 > var7 || var7 >= 104 || var8 < 0 || var8 >= 104) {
                            continue;
                        }

                        if (1 < Class163_Sub1_Sub1.anIntArrayArray4010[var7][var8]) {
                            --Class163_Sub1_Sub1.anIntArrayArray4010[var7][var8];
                            continue;
                        }
                    }

                    if (!var3.definition.aBoolean1270) {
                        var15 |= Long.MIN_VALUE;
                    }

                    var3.anInt2831 = Class121.method1736(WorldListCountry.localPlane, 1, var3.anInt2819, var3.anInt2829);
                    Class20.method907(WorldListCountry.localPlane, var3.anInt2819, var3.anInt2829, var3.anInt2831, -64 + 64 * var6 + 60, var3, var3.anInt2785, var15, var3.aBoolean2810);
                }
            }

        } catch (RuntimeException var14) {
            throw ClientErrorException.clientError(var14, "nk.V(" + var0 + ',' + var1 + ')');
        }
    }

    final int[][] method166(int var1, int var2) {
        try {
            if (var1 != -1) {
                this.anInt3434 = 6;
            }

            int[][] var3 = this.aClass97_2376.method1594((byte) -120, var2);
            if (this.aClass97_2376.aBoolean1379 && this.method339()) {
                int var4 = (this.anInt3433 != Class101.anInt1427 ? this.anInt3433 * var2 / Class101.anInt1427 : var2) * this.anInt3431;
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                int var8;
                int var9;
                if (this.anInt3431 == Class113.anInt1559) {
                    for (var8 = 0; var8 < Class113.anInt1559; ++var8) {
                        var9 = this.anIntArray3425[var4++];
                        var7[var8] = Unsorted.bitwiseAnd(var9 << 4, 4080);
                        var6[var8] = Unsorted.bitwiseAnd(var9, '\uff00') >> 4;
                        var5[var8] = Unsorted.bitwiseAnd(var9, 16711680) >> 12;
                    }
                } else {
                    for (var8 = 0; var8 < Class113.anInt1559; ++var8) {
                        var9 = this.anInt3431 * var8 / Class113.anInt1559;
                        int var10 = this.anIntArray3425[var4 - -var9];
                        var7[var8] = Unsorted.bitwiseAnd(var10 << 4, 4080);
                        var6[var8] = Unsorted.bitwiseAnd('\uff00', var10) >> 4;
                        var5[var8] = Unsorted.bitwiseAnd(var10 >> 12, 4080);
                    }
                }
            }

            return var3;
        } catch (RuntimeException var11) {
            throw ClientErrorException.clientError(var11, "ui.T(" + var1 + ',' + var2 + ')');
        }
    }

    private boolean method339() {
        try {
            if (this.anIntArray3425 == null) {
                if (this.anInt3434 < 0) {
                    return false;
                } else {
                    int var2 = Class113.anInt1559;
                    int var3 = Class101.anInt1427;
                    int var4 = !Class17.anInterface2_408.method14((byte) -104, this.anInt3434) ? 128 : 64;
                    this.anIntArray3425 = Class17.anInterface2_408.method16(64, this.anInt3434);
                    this.anInt3433 = var4;
                    this.anInt3431 = var4;
                    Class3_Sub13_Sub3.method180(18, var3, var2);
                    return this.anIntArray3425 != null;
                }
            } else {
                return true;
            }
        } catch (RuntimeException var5) {
            throw ClientErrorException.clientError(var5, "ui.LA(" + false + ')');
        }
    }

    final void method157(int var1, DataBuffer var2, boolean var3) {
        try {
            if (!var3) {
                CacheIndex.animationIndex = (CacheIndex) null;
            }

            if (0 == var1) {
                this.anInt3434 = var2.readUnsignedShort();
            }

        } catch (RuntimeException var5) {
            throw ClientErrorException.clientError(var5, "ui.A(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
        }
    }

    public Class3_Sub13_Sub36() {
        super(0, false);
    }

    final void method161(byte var1) {
        try {
            super.method161(var1);
            this.anIntArray3425 = null;
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "ui.BA(" + var1 + ')');
        }
    }

    static AbstractIndexedSprite[] method343() {
        try {
            AbstractIndexedSprite[] var1 = new AbstractIndexedSprite[Class95.anInt1338];

            for (int var2 = 0; var2 < Class95.anInt1338; ++var2) {
                if (HDToolKit.highDetail) {
                    var1[var2] = new HDIndexedSprite(Class3_Sub15.anInt2426, Class133.anInt1748, Class164.anIntArray2048[var2], Unsorted.anIntArray2591[var2], Class140_Sub7.anIntArray2931[var2], Unsorted.anIntArray3076[var2], Class163_Sub1.aByteArrayArray2987[var2], Class3_Sub13_Sub38.spritePalette);
                } else {
                    var1[var2] = new LDIndexedSprite(Class3_Sub15.anInt2426, Class133.anInt1748, Class164.anIntArray2048[var2], Unsorted.anIntArray2591[var2], Class140_Sub7.anIntArray2931[var2], Unsorted.anIntArray3076[var2], Class163_Sub1.aByteArrayArray2987[var2], Class3_Sub13_Sub38.spritePalette);
                }
            }
            Class39.method1035((byte) 113);
            return var1;
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "ui.JA(" + 1854847236 + ')');
        }
    }

    final int method155(byte var1) {
        try {
            if (var1 != 19) {
                this.method155((byte) -60);
            }

            return this.anInt3434;
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "ui.HA(" + var1 + ')');
        }
    }

    static void method344(int var0, int var1) {
        try {
            if (0 <= var0 && Class3_Sub24_Sub4.aBooleanArray3503.length > var0) {
                Class3_Sub24_Sub4.aBooleanArray3503[var0] = !Class3_Sub24_Sub4.aBooleanArray3503[var0];
                if (var1 != 4) {
                    aByteArrayArrayArray3430 = (byte[][][]) ((byte[][][]) null);
                }

            }
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "ui.KA(" + var0 + ',' + var1 + ')');
        }
    }

}
