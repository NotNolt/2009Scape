package org.runite.client;

class Class38 {

    static int anInt660;
    static boolean aBoolean661 = true;
    static int[][] anIntArrayArray663;
    static int[] anIntArray664 = new int[14];
    static Signlink aClass87_665;
    static Class146 aClass146_668;


    static void method1027() {
        try {
            Class44.aReferenceCache_725.sweep(5);
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "fk.J(" + 5 + ')');
        }
    }

    static void method1028() {
        try {
            for (int var1 = -1; Class159.localPlayerCount > var1; ++var1) {
                int var2;
                if (var1 == -1) {
                    var2 = 2047;
                } else {
                    var2 = Class56.localPlayerIndexes[var1];
                }

                Player var3 = Class3_Sub13_Sub22.players[var2];
                if (var3 != null) {
                    Unsorted.method68(var3.getSize(), var3);
                }
            }

        } catch (RuntimeException var4) {
            throw ClientErrorException.clientError(var4, "fk.G(" + -102 + ')');
        }
    }

    static void method1029(int var0) {
        try {
            Class3_Sub13_Sub1.outgoingBuffer.putOpcode(177);
            Class3_Sub13_Sub1.outgoingBuffer.writeShort(Class113.interfacePacketCounter);
        } catch (RuntimeException var2) {
            throw ClientErrorException.clientError(var2, "fk.D(" + var0 + ')');
        }
    }

}