package org.runite.client;

import java.util.Objects;

final class Class163_Sub3 extends Class163 {

    static int[] anIntArray2999;
    static boolean aBoolean3004 = true;
    static byte[][] aByteArrayArray3005;


    static final int[] PLAYER_RENDER_LOG = new int[4];

    static void renderPlayers() {
        try {
            Unsorted.maskUpdateCount = 0;
            Class139.anInt1829 = 0;
            Unsorted.updateLocalPosition();
            PLAYER_RENDER_LOG[0] = PacketParser.incomingBuffer.index;
            Class140_Sub3.renderLocalPlayers();
            PLAYER_RENDER_LOG[1] = PacketParser.incomingBuffer.index;
            Class131.addLocalPlayers();
            PLAYER_RENDER_LOG[2] = PacketParser.incomingBuffer.index;
            Unsorted.parsePlayerMasks();
            PLAYER_RENDER_LOG[3] = PacketParser.incomingBuffer.index;
            int var1;
            for (var1 = 0; Class139.anInt1829 > var1; ++var1) {
                int var2 = Class3_Sub7.anIntArray2292[var1];
                if (Class44.anInt719 != Class3_Sub13_Sub22.players[var2].anInt2838) {
                    if (0 < Class3_Sub13_Sub22.players[var2].anInt3969) {
                        Class162.method2203(Class3_Sub13_Sub22.players[var2]);
                    }

                    Class3_Sub13_Sub22.players[var2] = null;
                }
            }

            if (PacketParser.incomingBuffer.index == Unsorted.incomingPacketLength) {
                for (var1 = 0; var1 < Class159.localPlayerCount; ++var1) {
                    if (null == Class3_Sub13_Sub22.players[Class56.localPlayerIndexes[var1]]) {
//                     throw new RuntimeException("gpp2 pos:" + var1 + " size:" + Class159.anInt2022);
//                     System.err.println("gpp2 pos:" + var1 + " size:" + Class159.anInt2022);
                        System.err.println("Local player was null - index: " + Class56.localPlayerIndexes[var1] + ", list index: " + var1 + ", list size: " + Class159.localPlayerCount);
                    }
                }

            } else {
                System.err.println("Player rendering packet size mismatch - size log: self=" + PLAYER_RENDER_LOG[0] + ", local=" + PLAYER_RENDER_LOG[1] + ", add global=" + PLAYER_RENDER_LOG[2] + ", masks=" + PLAYER_RENDER_LOG[3] + ".");
//               System.err.println("gpp1 pos:" + GraphicDefinition.incomingBuffer.index + " psize:" + Class130.incomingPacketLength);
//                throw new RuntimeException("gpp1 pos:" + Class28.incomingBuffer.index + " psize:" + Class130.incomingPacketLength);
            }
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "fb.B(" + (byte) -122 + ')');
        }
    }

}
