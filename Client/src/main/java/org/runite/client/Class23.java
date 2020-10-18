package org.runite.client;

public final class Class23 {

    static int anInt453 = 0;
    public static int anInt454;
    static int anInt455;
    static boolean[][] aBooleanArrayArray457;


    static void method938(int var0, int var1, int var2, int var3, int var4, int var5, int var7, int var8) {
        try {
            int var9 = var2 - var7;
            int var10 = var3 - var8;
            int var11 = (-var1 + var0 << 16) / var9;
            int var12 = (-var5 + var4 << 16) / var10;
            Class136.method1814(var1, var3, var2, var12, var7, var11, var8, var5);
        } catch (RuntimeException var13) {
            throw ClientErrorException.clientError(var13, "dl.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + 1 + ',' + var7 + ',' + var8 + ')');
        }
    }

    static DataBuffer method939() {
        try {
            DataBuffer buffer = new DataBuffer(34);
            buffer.writeByte(11);
            buffer.writeByte(Unsorted.anInt3625);
            buffer.writeByte(!Unsorted.aBoolean3665 ? 0 : 1);
            buffer.writeByte(Unsorted.aBoolean3604 ? 1 : 0);
            buffer.writeByte(KeyboardListener.aBoolean1905 ? 1 : 0);
            buffer.writeByte(Unsorted.aBoolean488 ? 1 : 0);
            buffer.writeByte(!RSInterface.aBoolean236 ? 0 : 1);
            buffer.writeByte(!WorldListEntry.aBoolean2623 ? 0 : 1);
            buffer.writeByte(Class3_Sub13_Sub22.aBoolean3275 ? 1 : 0);
            buffer.writeByte(!Class140_Sub6.aBoolean2910 ? 0 : 1);
            buffer.writeByte(Unsorted.anInt1137);
            buffer.writeByte(!Class106.aBoolean1441 ? 0 : 1);
            buffer.writeByte(Class128.aBoolean1685 ? 1 : 0);
            buffer.writeByte(Class38.aBoolean661 ? 1 : 0);
            buffer.writeByte(Class3_Sub28_Sub9.anInt3622);
            buffer.writeByte(!Class3_Sub13_Sub15.aBoolean3184 ? 0 : 1);
            buffer.writeByte(CS2Script.anInt2453);
            buffer.writeByte(Unsorted.anInt120);
            buffer.writeByte(Sprites.anInt340);
            buffer.writeShort(Class3_Sub13.anInt2378);
            buffer.writeShort(Unsorted.anInt3071);
            buffer.writeByte(Class127_Sub1.method1757());
            buffer.writeInt(Unsorted.anInt2148);
            buffer.writeByte(Unsorted.anInt2577);
            buffer.writeByte(Unsorted.aBoolean2146 ? 1 : 0);
            buffer.writeByte(!Class15.aBoolean346 ? 0 : 1);
            buffer.writeByte(Class3_Sub20.anInt2488);
            buffer.writeByte(Unsorted.aBoolean1080 ? 1 : 0);
            buffer.writeByte(Class163_Sub3.aBoolean3004 ? 1 : 0);
            return buffer;
        } catch (RuntimeException var2) {
            throw ClientErrorException.clientError(var2, "dl.C(" + (byte) -116 + ')');
        }
    }

    static void method940(int var0, int var1) {
        try {
            if (var0 >= 101) {
                MouseListeningClass var2 = Unsorted.aClass149_4047;
                synchronized (var2) {
                    Unsorted.anInt4045 = var1;
                }
            }
        } catch (RuntimeException var5) {
            throw ClientErrorException.clientError(var5, "dl.D(" + var0 + ',' + var1 + ')');
        }
    }

}
