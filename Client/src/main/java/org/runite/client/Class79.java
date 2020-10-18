package org.runite.client;

final class Class79 {

    int anInt1123;
    static int anInt1124 = -1;
    int anInt1125;
    static int anInt1127 = 0;
    int anInt1128;


    static void method1385(int var0, int var1) {
        try {
            Class3_Sub28_Sub6 var3 = Class3_Sub24_Sub3.method466(6, var1);
            var3.g();
            var3.anInt3598 = var0;
        } catch (RuntimeException var4) {
            throw ClientErrorException.clientError(var4, "kk.E(" + var0 + ',' + var1 + ',' + (byte) -127 + ')');
        }
    }

    final void parseDefinitions(DataBuffer buffer) {
        try {
            while (true) {
                int opcode = buffer.readUnsignedByte();
                if (opcode == 0) {
                    return;
                }
                this.method1389(buffer, opcode);
            }
        } catch (RuntimeException var4) {
            throw ClientErrorException.clientError(var4, "kk.G(" + (buffer != null ? "{...}" : "null") + ',' + -111 + ')');
        }
    }

    private void method1389(DataBuffer buffer, int var3) {
        try {
            if (1 == var3) {
                this.anInt1128 = buffer.readUnsignedShort();
                this.anInt1123 = buffer.readUnsignedByte();
                this.anInt1125 = buffer.readUnsignedByte();
            }

        } catch (RuntimeException var5) {
            throw ClientErrorException.clientError(var5, "kk.B(" + (buffer != null ? "{...}" : "null") + ',' + 1 + ',' + var3 + ')');
        }
    }

    static void method1390(DataBuffer buffer) {
        try {
            if (-buffer.index + buffer.buffer.length >= 1) {
                int opcode = buffer.readUnsignedByte();
                if (opcode >= 0 && opcode <= 11) {
                    byte var3;
                    if (opcode == 11) {
                        var3 = 33;
                    } else if (opcode == 10) {
                        var3 = 32;
                    } else if (opcode == 9) {
                        var3 = 31;
                    } else if (opcode == 8) {
                        var3 = 30;
                    } else if (opcode == 7) {
                        var3 = 29;
                    } else if (opcode == 6) {
                        var3 = 28;
                    } else if (opcode == 5) {
                        var3 = 28;
                    } else if (opcode == 4) {
                        var3 = 24;
                    } else if (opcode == 3) {
                        var3 = 23;
                    } else if (opcode == 2) {
                        var3 = 22;
                    } else if (1 == opcode) {
                        var3 = 23;
                    } else {
                        var3 = 19;
                    }

                    if (var3 <= buffer.buffer.length - buffer.index) {
                        Unsorted.anInt3625 = buffer.readUnsignedByte();
                        if (Unsorted.anInt3625 >= 1) {
                            if (Unsorted.anInt3625 > 4) {
                                Unsorted.anInt3625 = 4;
                            }
                        } else {
                            Unsorted.anInt3625 = 1;
                        }

                        Unsorted.method957(1 == buffer.readUnsignedByte());
                        Unsorted.aBoolean3604 = buffer.readUnsignedByte() == 1;
                        KeyboardListener.aBoolean1905 = 1 == buffer.readUnsignedByte();
                        Unsorted.aBoolean488 = 1 == buffer.readUnsignedByte();
                        RSInterface.aBoolean236 = buffer.readUnsignedByte() == 1;
                        WorldListEntry.aBoolean2623 = buffer.readUnsignedByte() == 1;
                        Class3_Sub13_Sub22.aBoolean3275 = buffer.readUnsignedByte() == 1;
                        Class140_Sub6.aBoolean2910 = 1 == buffer.readUnsignedByte();
                        Unsorted.anInt1137 = buffer.readUnsignedByte();
                        if (2 < Unsorted.anInt1137) {
                            Unsorted.anInt1137 = 2;
                        }

                        if (opcode < 2) {
                            Class106.aBoolean1441 = buffer.readUnsignedByte() == 1;
                            buffer.readUnsignedByte();
                        } else {
                            Class106.aBoolean1441 = buffer.readUnsignedByte() == 1;
                        }

                        Class128.aBoolean1685 = 1 == buffer.readUnsignedByte();
                        Class38.aBoolean661 = buffer.readUnsignedByte() == 1;
                        Class3_Sub28_Sub9.anInt3622 = buffer.readUnsignedByte();
                        if (Class3_Sub28_Sub9.anInt3622 > 2) {
                            Class3_Sub28_Sub9.anInt3622 = 2;
                        }

                        Unsorted.anInt3671 = Class3_Sub28_Sub9.anInt3622;
                        Class3_Sub13_Sub15.aBoolean3184 = buffer.readUnsignedByte() == 1;
                        CS2Script.anInt2453 = buffer.readUnsignedByte();
                        if (CS2Script.anInt2453 > 127) {
                            CS2Script.anInt2453 = 127;
                        }

                        Unsorted.anInt120 = buffer.readUnsignedByte();
                        Sprites.anInt340 = buffer.readUnsignedByte();
                        if (Sprites.anInt340 > 127) {
                            Sprites.anInt340 = 127;
                        }

                        if (opcode >= 1) {
                            Class3_Sub13.anInt2378 = buffer.readUnsignedShort();
                            Unsorted.anInt3071 = buffer.readUnsignedShort();
                        }

                        if (opcode >= 3 && opcode < 6) {
                            buffer.readUnsignedByte();
                        }

                        if (opcode >= 4) {
                            int var4 = buffer.readUnsignedByte();
                            if (Class3_Sub24_Sub3.anInt3492 < 96) {
                                var4 = 0;
                            }

                            Class127_Sub1.method1758(var4);
                        }

                        if (opcode >= 5) {
                            Unsorted.anInt2148 = buffer.readInt();
                        }

                        if (6 <= opcode) {
                            Unsorted.anInt2577 = buffer.readUnsignedByte();
                        }

                        if (opcode >= 7) {
                            Unsorted.aBoolean2146 = 1 == buffer.readUnsignedByte();
                        }

                        if (8 <= opcode) {
                            Class15.aBoolean346 = buffer.readUnsignedByte() == 1;
                        }

                        if (9 <= opcode) {
                            Class3_Sub20.anInt2488 = buffer.readUnsignedByte();
                        }

                        if (10 <= opcode) {
                            Unsorted.aBoolean1080 = 0 != buffer.readUnsignedByte();
                        }

                        if (opcode >= 11) {
                            Class163_Sub3.aBoolean3004 = buffer.readUnsignedByte() != 0;
                        }

                    }
                }
            }
        } catch (RuntimeException var5) {
            throw ClientErrorException.clientError(var5, "kk.F(" + (buffer != null ? "{...}" : "null") + ',' + -1 + ')');
        }
    }

    static boolean method1391(int var0) {
        try {
            return var0 == ~Class10.anInt154 && !Class101.aClass3_Sub24_Sub4_1421.method473(-128);
        } catch (RuntimeException var2) {
            throw ClientErrorException.clientError(var2, "kk.A(" + var0 + ')');
        }
    }

}
