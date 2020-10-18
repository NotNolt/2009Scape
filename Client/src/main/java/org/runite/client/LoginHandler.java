package org.runite.client;

import org.rs09.client.config.GameConfig;

import org.rs09.client.data.HashTable;
import org.rs09.client.net.Connection;

import java.io.IOException;
import java.net.Socket;
import java.util.Objects;

class LoginHandler {

    public static Class3_Sub30_Sub1 loginOutputStream = new Class3_Sub30_Sub1();
    static CacheIndex aClass153_1680;
    static boolean dynamic;
    static int loginStage = 0;
    static long isaacServerKey = 0L;

    static void handleLogin() {
        try {
            if (0 != loginStage && 5 != loginStage) {
                try {
                    if (++Class50.anInt820 > 2000) {
                        if (Class3_Sub15.activeConnection != null) {
                            Class3_Sub15.activeConnection.close();
                            Class3_Sub15.activeConnection = null;
                        }

                        if (Class166.anInt2079 >= 1) {
                            Class158.anInt2005 = -5;
                            loginStage = 0;
                            return;
                        }

                        Class50.anInt820 = 0;
                        if (Class140_Sub6.accRegistryPort == Class162.anInt2036) {
                            Class140_Sub6.accRegistryPort = Client.currentPort;
                        } else {
                            Class140_Sub6.accRegistryPort = Class162.anInt2036;
                        }

                        loginStage = 1;
                        ++Class166.anInt2079;
                    }
                    if (loginStage == 1) {
                        Class3_Sub9.aClass64_2318 = Class38.aClass87_665.method1441((byte) 8, Class38_Sub1.accRegistryIp, GameConfig.SERVER_PORT + GameConfig.WORLD);//Class140_Sub6.accRegistryPort);
                        loginStage = 2;
                    }

                    if (loginStage == 2) {
                        if (Objects.requireNonNull(Class3_Sub9.aClass64_2318).anInt978 == 2) {
                            throw new IOException();
                        }

                        if (1 != Class3_Sub9.aClass64_2318.anInt978) {
                            return;
                        }

                        Class3_Sub15.activeConnection = new Connection((Socket) Class3_Sub9.aClass64_2318.anObject974, Class38.aClass87_665);
                        Class3_Sub9.aClass64_2318 = null;
                        long var1 = PacketParser.aLong3202 = Class131.username.toLong();
                        Class3_Sub13_Sub1.outgoingBuffer.index = 0;
                        Class3_Sub13_Sub1.outgoingBuffer.writeByte(14);
                        int nameHash = (int) (var1 >> 16 & 31L);
                        Class3_Sub13_Sub1.outgoingBuffer.writeByte(nameHash);
                        Class3_Sub15.activeConnection.sendBytes(Class3_Sub13_Sub1.outgoingBuffer.buffer, 2);
                        if (WorldListEntry.aClass155_2627 != null) {
                            WorldListEntry.aClass155_2627.method2159(106);
                        }

                        if (Class3_Sub21.aClass155_2491 != null) {
                            Class3_Sub21.aClass155_2491.method2159(79);
                        }

                        int var4 = Class3_Sub15.activeConnection.readByte();
                        if (WorldListEntry.aClass155_2627 != null) {
                            WorldListEntry.aClass155_2627.method2159(68);
                        }

                        if (null != Class3_Sub21.aClass155_2491) {
                            Class3_Sub21.aClass155_2491.method2159(109);
                        }

                        if (var4 != 0) {
                            Class158.anInt2005 = var4;
                            loginStage = 0;
                            Class3_Sub15.activeConnection.close();
                            Class3_Sub15.activeConnection = null;
                            return;
                        }

                        loginStage = 3;
                    }

                    if (loginStage == 3) {
                        if (Class3_Sub15.activeConnection.availableBytes() < 8) {
                            return;
                        }

                        Class3_Sub15.activeConnection.readBytes(PacketParser.incomingBuffer.buffer, 0, 8);
                        PacketParser.incomingBuffer.index = 0;
                        isaacServerKey = PacketParser.incomingBuffer.readLong();
                        int[] var9 = new int[4];
                        Class3_Sub13_Sub1.outgoingBuffer.index = 0;
                        var9[2] = (int) (isaacServerKey >> 32);
                        var9[3] = (int) isaacServerKey;
                        var9[1] = (int) (Math.random() * 9.9999999E7D);
                        var9[0] = (int) (Math.random() * 9.9999999E7D);
                        Class3_Sub13_Sub1.outgoingBuffer.writeByte(10);
                        Class3_Sub13_Sub1.outgoingBuffer.writeInt(var9[0]);
                        Class3_Sub13_Sub1.outgoingBuffer.writeInt(var9[1]);
                        Class3_Sub13_Sub1.outgoingBuffer.writeInt(var9[2]);
                        Class3_Sub13_Sub1.outgoingBuffer.writeInt(var9[3]);
                        Class3_Sub13_Sub1.outgoingBuffer.writeLong(Class131.username.toLong());
                        Class3_Sub13_Sub1.outgoingBuffer.writeString(Class131.password);
                        Class3_Sub13_Sub1.method229();
                        Class3_Sub13_Sub1.outgoingBuffer.rsaEncrypt(Class3_Sub13_Sub14.aBigInteger3162, Class3_Sub13_Sub37.aBigInteger3441);
                        loginOutputStream.index = 0;
                        if (40 == Class143.loadingStage) {
                            loginOutputStream.writeByte(18);
                        } else {
                            loginOutputStream.writeByte(16);
                        }

                        loginOutputStream.writeShort(Class3_Sub13_Sub1.outgoingBuffer.index + 163 - -Class3_Sub13_Sub33.method326((byte) 111, Class163_Sub2.aClass94_2996));
                        loginOutputStream.writeInt(GameConfig.CLIENT_BUILD);
                        loginOutputStream.writeByte(Class7.anInt2161);
                        loginOutputStream.writeByte(!Client.aBoolean3779 ? 0 : 1);
                        loginOutputStream.writeByte(1);
                        loginOutputStream.writeByte(Class83.method1411(0));
                        loginOutputStream.writeShort(Class23.anInt454);
                        loginOutputStream.writeShort(Class140_Sub7.anInt2934);
                        loginOutputStream.writeByte(Unsorted.anInt3671);
                        Class81.putRandomDataFile(loginOutputStream, true);
                        loginOutputStream.writeString(Class163_Sub2.aClass94_2996);
                        loginOutputStream.writeInt(Class3_Sub26.anInt2554);
                        loginOutputStream.writeInt(Class84.method1421());
                        CS2Script.aBoolean2705 = true;
                        loginOutputStream.writeShort(Class113.interfacePacketCounter);
                        loginOutputStream.writeInt(CacheIndex.skeletonsIndex.getReferenceTableCrc());
                        loginOutputStream.writeInt(CacheIndex.skinsIndex.getReferenceTableCrc());
                        loginOutputStream.writeInt(CacheIndex.configurationsIndex.getReferenceTableCrc());
                        loginOutputStream.writeInt(CacheIndex.interfacesIndex.getReferenceTableCrc());
                        loginOutputStream.writeInt(CacheIndex.soundFXIndex.getReferenceTableCrc());
                        loginOutputStream.writeInt(CacheIndex.landscapesIndex.getReferenceTableCrc());
                        loginOutputStream.writeInt(CacheIndex.musicIndex.getReferenceTableCrc());
                        loginOutputStream.writeInt(CacheIndex.modelsIndex.getReferenceTableCrc());
                        loginOutputStream.writeInt(CacheIndex.spritesIndex.getReferenceTableCrc());
                        loginOutputStream.writeInt(CacheIndex.texturesIndex.getReferenceTableCrc());
                        loginOutputStream.writeInt(CacheIndex.huffmanEncodingIndex.getReferenceTableCrc());
                        loginOutputStream.writeInt(CacheIndex.music2Index.getReferenceTableCrc());
                        loginOutputStream.writeInt(CacheIndex.interfaceScriptsIndex.getReferenceTableCrc());
                        loginOutputStream.writeInt(CacheIndex.fontsIndex.getReferenceTableCrc());
                        loginOutputStream.writeInt(CacheIndex.soundFX2Index.getReferenceTableCrc());
                        loginOutputStream.writeInt(CacheIndex.soundFX3Index.getReferenceTableCrc());
                        loginOutputStream.writeInt(CacheIndex.objectConfigIndex.getReferenceTableCrc());
                        loginOutputStream.writeInt(CacheIndex.clientscriptMaskIndex.getReferenceTableCrc());
                        loginOutputStream.writeInt(CacheIndex.npcConfigIndex.getReferenceTableCrc());
                        loginOutputStream.writeInt(CacheIndex.itemConfigIndex.getReferenceTableCrc());
                        loginOutputStream.writeInt(CacheIndex.animationIndex.getReferenceTableCrc());
                        loginOutputStream.writeInt(CacheIndex.graphicFXIndex.getReferenceTableCrc());
                        loginOutputStream.writeInt(CacheIndex.clientScriptConfigIndex.getReferenceTableCrc());
                        loginOutputStream.writeInt(CacheIndex.worldmapIndex.getReferenceTableCrc());
                        loginOutputStream.writeInt(CacheIndex.quickchatMessagesIndex.getReferenceTableCrc());
                        loginOutputStream.writeInt(CacheIndex.quickchatMenusIndex.getReferenceTableCrc());
                        loginOutputStream.writeInt(CacheIndex.materialsIndex.getReferenceTableCrc());
                        loginOutputStream.writeInt(CacheIndex.particlesConfigIndex.getReferenceTableCrc());
                        loginOutputStream.writeInt(CacheIndex.libIndex.getReferenceTableCrc());
                        loginOutputStream.putBytes(Class3_Sub13_Sub1.outgoingBuffer.buffer, Class3_Sub13_Sub1.outgoingBuffer.index);
                        Class3_Sub15.activeConnection.sendBytes(loginOutputStream.buffer, loginOutputStream.index);
                        Class3_Sub13_Sub1.outgoingBuffer.method814(var9);

                        for (int var2 = 0; var2 < 4; ++var2) {
                            var9[var2] += 50;
                        }

                        PacketParser.incomingBuffer.method814(var9);
                        loginStage = 4;
                    }

                    if (loginStage == 4) {
                        if (Class3_Sub15.activeConnection.availableBytes() < 1) {
                            return;
                        }

                        int opcode = Class3_Sub15.activeConnection.readByte();
                        if (opcode == 21) {
                            loginStage = 7;
                        } else if (opcode == 29) {
                            loginStage = 10;
                        } else {
                            if (opcode == 1) {
                                loginStage = 5;
                                Class158.anInt2005 = opcode;
                                return;
                            }

                            if (2 != opcode) {
                                if (opcode != 15) {
                                    if (23 == opcode && Class166.anInt2079 < 1) {
                                        loginStage = 1;
                                        ++Class166.anInt2079;
                                        Class50.anInt820 = 0;
                                        Class3_Sub15.activeConnection.close();
                                        Class3_Sub15.activeConnection = null;
                                        return;
                                    }

                                    Class158.anInt2005 = opcode;
                                    loginStage = 0;
                                    Class3_Sub15.activeConnection.close();
                                    Class3_Sub15.activeConnection = null;
                                    return;
                                }

                                loginStage = 0;
                                Class158.anInt2005 = opcode;
                                return;
                            }

                            loginStage = 8;
                        }
                    }

                    if (6 == loginStage) {
                        Class3_Sub13_Sub1.outgoingBuffer.index = 0;
                        Class3_Sub13_Sub1.outgoingBuffer.putOpcode(17);
                        Class3_Sub15.activeConnection.sendBytes(Class3_Sub13_Sub1.outgoingBuffer.buffer, Class3_Sub13_Sub1.outgoingBuffer.index);
                        loginStage = 4;
                        return;
                    }

                    if (loginStage == 7) {
                        if (Class3_Sub15.activeConnection.availableBytes() >= 1) {
                            Class3_Sub13_Sub34.anInt3413 = 60 * (3 + Class3_Sub15.activeConnection.readByte());
                            loginStage = 0;
                            Class158.anInt2005 = 21;
                            Class3_Sub15.activeConnection.close();
                            Class3_Sub15.activeConnection = null;
                            return;
                        }

                        return;
                    }

                    if (loginStage == 10) {
                        if (1 <= Class3_Sub15.activeConnection.availableBytes()) {
                            Class3_Sub26.anInt2561 = Class3_Sub15.activeConnection.readByte();
                            loginStage = 0;
                            Class158.anInt2005 = 29;
                            Class3_Sub15.activeConnection.close();
                            Class3_Sub15.activeConnection = null;
                            return;
                        }

                        return;
                    }

                    if (loginStage == 8) {
                        if (Class3_Sub15.activeConnection.availableBytes() < 14) {
                            return;
                        }

                        Class3_Sub15.activeConnection.readBytes(PacketParser.incomingBuffer.buffer, 0, 14);
                        PacketParser.incomingBuffer.index = 0;
                        Class3_Sub13_Sub26.rights = PacketParser.incomingBuffer.readUnsignedByte();
                        CS2Script.anInt3775 = PacketParser.incomingBuffer.readUnsignedByte();
                        Class3_Sub15.aBoolean2433 = PacketParser.incomingBuffer.readUnsignedByte() == 1;
                        Class121.aBoolean1641 = 1 == PacketParser.incomingBuffer.readUnsignedByte();
                        Unsorted.aBoolean4063 = PacketParser.incomingBuffer.readUnsignedByte() == 1;
                        Class3_Sub13_Sub14.aBoolean3166 = 1 == PacketParser.incomingBuffer.readUnsignedByte();
                        Unsorted.aBoolean29 = PacketParser.incomingBuffer.readUnsignedByte() == 1;
                        Class3_Sub1.localIndex = PacketParser.incomingBuffer.readUnsignedShort();
                        Class3_Sub13_Sub29.disableGEBoxes = PacketParser.incomingBuffer.readUnsignedByte() == 1;
                        Unsorted.isMember = PacketParser.incomingBuffer.readUnsignedByte() == 1;
                        Class113.method1702(Unsorted.isMember);
                        Class8.method845(Unsorted.isMember);
                        if (!Client.aBoolean3779) {
                            if ((!Class3_Sub15.aBoolean2433 || Unsorted.aBoolean4063) && !Class3_Sub13_Sub29.disableGEBoxes) {
                                try {
                                    TextCore.aClass94_516.method1577(Class38.aClass87_665.applet);
                                } catch (Throwable var5) {
                                }
                            } else {
                                try {
                                    Class97.aClass94_1374.method1577(Class38.aClass87_665.applet);
                                } catch (Throwable var6) {
                                }
                            }
                        }

                        PacketParser.incomingOpcode = PacketParser.incomingBuffer.getOpcode();
                        dynamic = PacketParser.incomingOpcode == 214;
                        Unsorted.incomingPacketLength = PacketParser.incomingBuffer.readUnsignedShort();
                        loginStage = 9;
                    }

                    if (loginStage == 9) {
                        if (Unsorted.incomingPacketLength > Class3_Sub15.activeConnection.availableBytes()) {
                            return;
                        }

                        PacketParser.incomingBuffer.index = 0;
                        Class3_Sub15.activeConnection.readBytes(PacketParser.incomingBuffer.buffer, 0, Unsorted.incomingPacketLength);
                        Class158.anInt2005 = 2;
                        loginStage = 0;
                        resetAll();
                        Unsorted.anInt3606 = -1;
                        Class39.updateSceneGraph(dynamic);
                        PacketParser.incomingOpcode = -1;
                        return;
                    }
                } catch (IOException var7) {
                    if (null != Class3_Sub15.activeConnection) {
                        Class3_Sub15.activeConnection.close();
                        Class3_Sub15.activeConnection = null;
                    }

                    if (Class166.anInt2079 >= 1) {
                        loginStage = 0;
                        Class158.anInt2005 = -4;
                    } else {
                        loginStage = 1;
                        Class50.anInt820 = 0;
                        ++Class166.anInt2079;
                        if (Class140_Sub6.accRegistryPort == Class162.anInt2036) {
                            Class140_Sub6.accRegistryPort = Client.currentPort;
                        } else {
                            Class140_Sub6.accRegistryPort = Class162.anInt2036;
                        }
                    }
                }

            }
        } catch (RuntimeException var8) {
            throw ClientErrorException.clientError(var8, "ri.A(" + ')');
        }
    }

    static int method1753(int var0, int var1) {
        var1 = var1 * (var0 & 127) >> 7;
        if (var1 < 2) {
            var1 = 2;
        } else if (var1 > 126) {
            var1 = 126;
        }

        return (var0 & '\uff80') + var1;
    }

    static void resetAll() {
        try {
            Class3_Sub13_Sub13.anInt2556 = 0;
            Class3_Sub13_Sub13.aBoolean2774 = true;
            Class3_Sub13_Sub13.aLong1465 = 0L;
            Class3_Sub13_Sub13.aClass67_1443.anInt1018 = 0;
            Class3_Sub13_Sub13.aBoolean3078 = true;
            Class3_Sub13.method153(112);
            Class24.anInt469 = -1;
            Class7.anInt2166 = -1;
            PacketParser.incomingOpcode = -1;
            Class3_Sub13_Sub13.anInt2023 = 0;
            Class3_Sub13_Sub13.anInt2617 = 0;
            Class3_Sub13_Sub1.outgoingBuffer.index = 0;
            LinkableRSString.anInt2582 = -1;
            Class3_Sub28_Sub16.anInt3699 = 0;
            PacketParser.incomingBuffer.index = 0;

            int var1;
            for (var1 = 0; ClientErrorException.aClass96Array2114.length > var1; ++var1) {
                ClientErrorException.aClass96Array2114[var1] = null;
            }

            Class3_Sub13_Sub34.anInt3415 = 0;
            Class38_Sub1.aBoolean2615 = false;
            Class23.method940(119, 0);

            for (var1 = 0; var1 < 100; ++var1) {
                LinkableRSString.aClass94Array2580[var1] = null;
            }

            Class164_Sub1.anInt3012 = 0;
            Class3_Sub13_Sub13.anInt3216 = (int) (Math.random() * 100.0D) + -50;
            Class45.anInt733 = 0;
            Unsorted.CAMERA_DIRECTION = 2047 & (int) (Math.random() * 20.0D) - 10;
            Class163_Sub1_Sub1.anInt909 = -1;
            Class159.localPlayerCount = 0;
            Class161.anInt2028 = 0;
            Class3_Sub13_Sub13.anInt42 = (int) (110.0D * Math.random()) + -55;
            GameObject.aBoolean1837 = false;
            Class164_Sub2.anInt3020 = -20 + (int) (30.0D * Math.random());
            Class113.anInt1552 = 0;
            Class65.anInt987 = 0;
            Class3_Sub13_Sub8.anInt3102 = -60 + (int) (Math.random() * 120.0D);
            Class3_Sub13_Sub9.anInt3114 = 0;
            LinkableRSString.anInt2589 = (int) (80.0D * Math.random()) - 40;
            Class163.localNPCCount = 0;

            for (var1 = 0; 2048 > var1; ++var1) {
                Class3_Sub13_Sub22.players[var1] = null;
                Class65.aClass3_Sub30Array986[var1] = null;
            }

            for (var1 = 0; var1 < '\u8000'; ++var1) {
                NPC.npcs[var1] = null;
            }

            Class102.player = Class3_Sub13_Sub22.players[2047] = new Player();
            Class3_Sub13_Sub30.aClass61_3364.method1211(-112);
            Class3_Sub13_Sub15.aClass61_3177.method1211(-58);
            if (null != Class3_Sub13_Sub22.aClass61ArrayArrayArray3273) {
                for (var1 = 0; 4 > var1; ++var1) {
                    for (int var2 = 0; var2 < 104; ++var2) {
                        for (int var3 = 0; var3 < 104; ++var3) {
                            Class3_Sub13_Sub22.aClass61ArrayArrayArray3273[var1][var2][var3] = null;
                        }
                    }
                }
            }

            Class3_Sub13_Sub6.aClass61_3075 = new Class61();
            CS2Script.anInt1357 = 0;
            Class8.anInt104 = 0;
            Class3_Sub13_Sub2.method176(-114);
            Class3_Sub2.method103();
            Class75.anInt1105 = 0;
            Class163_Sub2_Sub1.anInt4014 = 0;
            Class157.anInt1996 = 0;
            Class3_Sub13_Sub34.anInt3414 = 0;
            Class146.anInt1904 = 0;
            Unsorted.anInt30 = 0;
            Class164_Sub1.anInt529 = 0;
            MouseListeningClass.anInt1923 = 0;
            Unsorted.anInt3631 = 0;
            Class163_Sub2_Sub1.anInt4021 = 0;

            for (var1 = 0; var1 < Class3_Sub13_Sub13.anIntArray1277.length; ++var1) {
                Class3_Sub13_Sub13.anIntArray1277[var1] = -1;
            }

            if (Class3_Sub28_Sub12.anInt3655 != -1) {
                Class60.method1208((byte) -128, Class3_Sub28_Sub12.anInt3655);
            }

            for (Class3_Sub31 var7 = (Class3_Sub31) Class3_Sub13_Sub17.aHashTable_3208.first(); var7 != null; var7 = (Class3_Sub31) Class3_Sub13_Sub17.aHashTable_3208.next()) {
                Class3_Sub13_Sub18.method254(true, var7);
            }

            Class3_Sub28_Sub12.anInt3655 = -1;
            Class3_Sub13_Sub17.aHashTable_3208 = new HashTable(8);
            Class3_Sub7.method122(-113);
            Class3_Sub13_Sub7.aClass11_3087 = null;
            Class38_Sub1.aBoolean2615 = false;
            Class3_Sub13_Sub34.anInt3415 = 0;
            Unsorted.aClass52_1112.method1161(new int[]{0, 0, 0, 0, 0}, -1, false, (int[]) null, -1);

            for (var1 = 0; 8 > var1; ++var1) {
                Class91.aClass94Array1299[var1] = null;
                Class1.aBooleanArray54[var1] = false;
                Class3_Sub13_Sub26.anIntArray3328[var1] = -1;
            }

            Class3_Sub28_Sub9.method580((byte) 80);
            Class3_Sub13_Sub4.aBoolean3064 = true;

            for (var1 = 0; var1 < 100; ++var1) {
                Unsorted.aBooleanArray3674[var1] = true;
            }

            Unsorted.clanSize = 0;
            PacketParser.aClass3_Sub19Array3694 = null;
            RSInterface.aClass94_251 = null;

            for (var1 = 0; 6 > var1; ++var1) {
                Class3_Sub13_Sub33.aClass133Array3393[var1] = new Class133();
            }

            for (var1 = 0; var1 < 25; ++var1) {
                Class3_Sub13_Sub15.anIntArray3185[var1] = 0;
                Class3_Sub20.anIntArray2480[var1] = 0;
                Class133.anIntArray1743[var1] = 0;
            }

            if (HDToolKit.highDetail) {
                Class3_Sub13_Sub14.method236();
            }

            Unsorted.aBoolean4068 = true;
            Class113.interfacePacketCounter = 0;
            Class3_Sub13_Sub28.aClass94_3353 = TextCore.HasWalkHere;
            Unsorted.aBoolean1084 = false;
            Class3_Sub13_Sub38.aShortArray3455 = Class3_Sub13_Sub9.aShortArray3110 = NPCDefinition.aShortArray1779 = Class3_Sub13_Sub38.aShortArray3453 = new short[256];
            Class3_Sub13.method165();
            Unsorted.aBoolean1951 = false;
            Class3_Sub13_Sub8.method204(-3);
        } catch (RuntimeException var6) {
            throw ClientErrorException.clientError(var6, "tk.A(" + true + ')');
        }
    }
}
