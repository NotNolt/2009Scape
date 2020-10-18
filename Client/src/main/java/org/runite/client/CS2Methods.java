package org.runite.client;

import org.rs09.client.LinkableInt;
import org.rs09.client.data.Queue;

import java.util.Objects;

public class CS2Methods {
    static boolean method2248(int var1) {
        try {
            return 32 <= var1 && var1 <= 126 || (var1 >= 160 && 255 >= var1 || (var1 == 128 || var1 == 140 || var1 == 151 || var1 == 156 || var1 == 159));
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "we.B(" + -157 + ',' + var1 + ')');
        }
    }

    static boolean method1066(int var0) {
        try {
            if (97 <= var0 && var0 <= 122) {
                return true;
            } else {
                return var0 >= 65 && 90 >= var0 || 48 <= var0 && 57 >= var0;
            }
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "gj.K(" + var0 + ',' + -32 + ')');
        }
    }

    static boolean method487(int var0) {
        try {
            return 97 <= var0 && var0 <= 122 || var0 >= 65 && var0 <= 90;
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "va.EB(" + var0 + ',' + (byte) -85 + ')');
        }
    }

    static boolean method544(int var1) {
        try {
            return var1 >= 48 && 57 >= var1;
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "bn.E(" + -49 + ',' + var1 + ')');
        }
    }

    static int method332(int var1) {
        try {
            if ((var1 < 65 || var1 > 90) && (var1 < 192 || var1 > 222 || var1 == 215)) {
                if (var1 != 159) return var1 != 140 ? var1 : 156;
                return 255;
            }
            return 32 + var1;
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "sk.C(" + 2 + ',' + var1 + ')');
        }
    }

    static int method2287(int var0) {
        try {
            return (var0 < 97 || var0 > 122) && (var0 < 224 || var0 > 254 || 247 == var0) ? var0 != 255 ? var0 != 156 ? var0 : 140 : 159 : var0 + -32;
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "ld.C(" + var0 + ',' + (byte) 59 + ')');
        }
    }

    static void method2092(int var0) {
        try {
            Class3_Sub28_Sub6 var2 = Class3_Sub24_Sub3.method466(9, var0);
            var2.a();
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "ug.B(" + var0 + ',' + (byte) -47 + ')');
        }
    }

    static void method265(int var1) {
        try {
            Class3_Sub28_Sub6 var2 = Class3_Sub24_Sub3.method466(8, var1);
            var2.a();

        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "mc.B(" + (byte) -42 + ',' + var1 + ')');
        }
    }

    static void method1649(int var0, int var1) {
        try {
            if (var1 <= -65) {
                Class3_Sub28_Sub6 var2 = Class3_Sub24_Sub3.method466(10, var0);
                var2.a();
            }
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "og.C(" + var0 + ',' + var1 + ')');
        }
    }

    static void method2206(int var1) {
        try {
            Class3_Sub28_Sub6 var2 = Class3_Sub24_Sub3.method466(4, var1);
            var2.a();
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "wc.A(" + true + ',' + var1 + ')');
        }
    }

    static void method1259(int var0) {
        try {
            Class3_Sub28_Sub6 var2 = Class3_Sub24_Sub3.method466(12, var0);
            var2.a();
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "jd.A(" + var0 + ',' + (byte) 109 + ')');
        }
    }

    static void method56(int var0) {
        Class3_Sub28_Sub6 var2 = Class3_Sub24_Sub3.method466(6, var0);
        var2.a();
    }

    static void method1657(int var0) {
        try {
            Class3_Sub28_Sub6 var2 = Class3_Sub24_Sub3.method466(5, var0);
            var2.a();

        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "oi.J(" + var0 + ',' + -903 + ')');
        }
    }

    public static void method1516(int var0, int var1) {
        try {
            Class3_Sub28_Sub6 var2 = Class3_Sub24_Sub3.method466(3, var0);
            var2.a();
            if (var1 < 87) {
                TextCore.aClass94_1326 = null;
            }

        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "n.L(" + var0 + ',' + var1 + ')');
        }
    }

    static Queue method1664(int var0, int var1) {
        try {
            Queue var3 = new Queue();

            for (Class3_Sub28_Sub3 var4 = (Class3_Sub28_Sub3) Class134.aClass61_1758.method1222(); var4 != null; var4 = (Class3_Sub28_Sub3) Class134.aClass61_1758.method1221()) {
                if (var4.aBoolean3553 && var4.method537(var1, var0)) {
                    var3.offer(var4);
                }
            }

            return var3;
        } catch (RuntimeException var5) {
            throw ClientErrorException.clientError(var5, "ok.B(" + var0 + ',' + var1 + ',' + (byte) -118 + ')');
        }
    }

    static int method1643(boolean var1, int var2, int var3) {
        try {

            Class3_Sub25 var4 = (Class3_Sub25) Class3_Sub2.aHashTable_2220.get((long) var2);
            if (null == var4) {
                return 0;
            } else {
                int var5 = 0;

                for (int var6 = 0; var6 < var4.anIntArray2547.length; ++var6) {
                    if (var4.anIntArray2547[var6] >= 0 && ItemDefinition.itemDefinitionSize > var4.anIntArray2547[var6]) {
                        ItemDefinition var7 = ItemDefinition.getItemDefinition(var4.anIntArray2547[var6]);
                        if (null != var7.aHashTable_798) {
                            LinkableInt var8 = (LinkableInt) var7.aHashTable_798.get((long) var3);
                            if (null != var8) {
                                if (var1) {
                                    var5 += var4.anIntArray2551[var6] * var8.value;
                                } else {
                                    var5 += var8.value;
                                }
                            }
                        }
                    }
                }

                return var5;
            }
        } catch (RuntimeException var9) {
            throw ClientErrorException.clientError(var9, "od.B(" + 10131 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
        }
    }

    static void method1479(int var0) {
        try {
            Class3_Sub13_Sub30.anInt3362 = -1;

            if (var0 == 37) {
                NPC.worldMapZoomFloatY = 3.0F;
            } else if (50 == var0) {
                NPC.worldMapZoomFloatY = 4.0F;
            } else if (var0 == 75) {
                NPC.worldMapZoomFloatY = 6.0F;
            } else if (var0 == 100) {
                NPC.worldMapZoomFloatY = 8.0F;
            } else if (var0 == 200) {
                NPC.worldMapZoomFloatY = 16.0F;
            }

        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "me.C(" + var0 + ',' + (byte) 56 + ')');
        }
    }

    static Class3_Sub28_Sub17_Sub1 getFontsDefinition(int fontId) {
        try {
            Class3_Sub28_Sub17_Sub1 var2 = (Class3_Sub28_Sub17_Sub1) AtmosphereParser.aReferenceCache_1135.get(fontId);
            if (var2 == null) {
                byte[] buffer = CacheIndex.fontsIndex.getFile(fontId, 0);
                var2 = new Class3_Sub28_Sub17_Sub1(buffer);
                var2.method697(Class3_Sub13_Sub22.aClass109Array3270, null);
                AtmosphereParser.aReferenceCache_1135.put(var2, fontId);
            }
            return var2;
        } catch (RuntimeException var4) {
            throw ClientErrorException.clientError(var4, "li.A(" + -28922 + ',' + fontId + ')');
        }
    }

    static void method825(int var1) {
        try {
            Class3_Sub28_Sub6 var3 = Class3_Sub24_Sub3.method466(1, var1);
            var3.a();
        } catch (RuntimeException var4) {
            throw ClientErrorException.clientError(var4, "ac.D(" + (byte) 92 + ',' + var1 + ')');
        }
    }

    static int method826(RSString var0) {
        try {
            if (var0 != null) {
                for (int var2 = 0; Class8.anInt104 > var2; ++var2) {
                    if (var0.equalsStringIgnoreCase(Class70.aClass94Array1046[var2])) {
                        return var2;
                    }
                }
            }
            return -1;
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "ac.B(" + (var0 != null ? "{...}" : "null") + ')');
        }
    }

    static WorldListEntry method1953() {
        try {
            WorldListEntry.anInt2291 = 0;
            return method1107();
        } catch (RuntimeException var2) {
            throw ClientErrorException.clientError(var2, "bh.H(" + (byte) 124 + ')');
        }
    }

    static WorldListEntry method1107() {
        try {
            if (Unsorted.aClass44_Sub1Array3201.length > WorldListEntry.anInt2291) {
                return Unsorted.aClass44_Sub1Array3201[WorldListEntry.anInt2291++];
            } else {
                return null;
            }
        } catch (RuntimeException var2) {
            throw ClientErrorException.clientError(var2, "h.R(" + ')');
        }
    }

    static void method1808(int var0, boolean var1, int var3, boolean var4) {
        try {
            Unsorted.method1047(var0, var3, Unsorted.aClass44_Sub1Array3201.length - 1, var4, 0, var1);

        } catch (RuntimeException var6) {
            throw ClientErrorException.clientError(var6, "sh.C(" + var0 + ',' + var1 + ',' + (byte) 30 + ',' + var3 + ',' + var4 + ')');
        }
    }

    static int method1079(int var0) {
        try {
            if (0 > var0) {
                return 0;
            } else {
                Class3_Sub25 var2 = (Class3_Sub25) Class3_Sub2.aHashTable_2220.get(var0);
                if (var2 == null) {
                    return Objects.requireNonNull(method2069(var0)).size;
                } else {
                    int var3 = 0;
                    for (int var4 = 0; var4 < var2.anIntArray2547.length; ++var4) {
                        if (var2.anIntArray2547[var4] == -1) {
                            ++var3;
                        }
                    }
                    var3 += Objects.requireNonNull(method2069(var0)).size + -var2.anIntArray2547.length;
                    return var3;
                }
            }
        } catch (RuntimeException var5) {
            throw ClientErrorException.clientError(var5, "ba.D(" + var0 + ',' + (byte) -80 + ')');
        }
    }

    static void method2229(long var0) {
        try {
            if (var0 != 0) {
                if ((100 > Class8.anInt104 || Class3_Sub13_Sub29.disableGEBoxes) && Class8.anInt104 < 200) {
                    RSString var3 = Objects.requireNonNull(Unsorted.method1052(var0)).method1545();

                    int var4;
                    for (var4 = 0; Class8.anInt104 > var4; ++var4) {
                        if (var0 == Class50.aLongArray826[var4]) {
                            Class3_Sub30_Sub1.addChatMessage(TextCore.aClass94_3672, 0, RSString.stringCombiner(new RSString[]{var3, TextCore.HasFriendsAlready}), -1);
                            return;
                        }
                    }

                    for (var4 = 0; var4 < Class3_Sub28_Sub5.anInt3591; ++var4) {
                        if (Class114.ignores[var4] == var0) {
                            Class3_Sub30_Sub1.addChatMessage(TextCore.aClass94_3672, 0, RSString.stringCombiner(new RSString[]{TextCore.HasPleaseRemove, var3, TextCore.HasIgnoreToFriends}), -1);
                            return;
                        }
                    }

                    if (var3.equalsString(Class102.player.displayName)) {
                        Class3_Sub30_Sub1.addChatMessage(TextCore.aClass94_3672, 0, TextCore.HasOnOwnFriendsList, -1);
                    } else {
                        Class70.aClass94Array1046[Class8.anInt104] = var3;
                        Class50.aLongArray826[Class8.anInt104] = var0;
                        Unsorted.anIntArray882[Class8.anInt104] = 0;
                        Unsorted.aClass94Array2566[Class8.anInt104] = TextCore.aClass94_3672;
                        Class57.anIntArray904[Class8.anInt104] = 0;
                        Unsorted.aBooleanArray73[Class8.anInt104] = false;
                        ++Class8.anInt104;
                        Class110.anInt1472 = PacketParser.anInt3213;
                        Class3_Sub13_Sub1.outgoingBuffer.putOpcode(120);
                        Class3_Sub13_Sub1.outgoingBuffer.writeLong(var0);
                    }
                } else {
                    Class3_Sub30_Sub1.addChatMessage(TextCore.aClass94_3672, 0, TextCore.HasFriendsListFull, -1);
                }
            }
        } catch (RuntimeException var5) {
            throw ClientErrorException.clientError(var5, "fb.C(" + var0 + ',' + (byte) -91 + ')');
        }
    }

    public static Class3_Sub28_Sub12 method2069(int var0) {
        Class3_Sub28_Sub12 var2 = (Class3_Sub28_Sub12) Class49.aClass47_818.get(var0);
        if (null == var2) {
            byte[] var3 = Class8.aClass153_105.getFile(5, var0);
            var2 = new Class3_Sub28_Sub12();
            if (var3 != null) {
                var2.decode(new DataBuffer(var3));
            }
            Class49.aClass47_818.put(var0, var2);
        }
        return var2;
    }

    static void method1041(long var0, RSString name) {
        try {
            // System.out.println("Class 40 " + var0 + ", " + var2 + ", " + name.toString());
            Class3_Sub13_Sub1.outgoingBuffer.index = 0;
            Class3_Sub13_Sub1.outgoingBuffer.writeByte(186);
            Class3_Sub13_Sub1.outgoingBuffer.writeString(name);
            // Class3_Sub13_Sub1.outgoingBuffer.putLong(var0, var2 + -2037463204);
            Unsorted.registryStage = 1;
            Class132.anInt1734 = 0;
            Class3_Sub13_Sub21.anInt548 = 0;
            Unsorted.anInt1711 = -3;
        } catch (RuntimeException var4) {
            throw ClientErrorException.clientError(var4, "gd.D(" + var0 + ',' + -28236 + ')');
        }
    }

    static void method1368() {
        try {
            Class3_Sub13_Sub1.outgoingBuffer.putOpcode(104);
            Class3_Sub13_Sub1.outgoingBuffer.writeLong(0L);
        } catch (RuntimeException var2) {
            throw ClientErrorException.clientError(var2, "kh.D(" + -90 + ')');
        }
    }
}
