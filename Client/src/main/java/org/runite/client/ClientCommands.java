package org.runite.client;


public class ClientCommands {

    static boolean commandQaOpEnabled = false;
    static boolean fpsOverlayEnabled = false;
    static boolean tweeningEnabled = false;
    static boolean shiftClickEnabled = false;
    static boolean renderInfoOverlayEnabled = false;
    /**
     * Removed out of (depreciated)Properties.java
     */
    private static boolean modernHotkeys;


    public static void ClientCommands(RSString command) {
        try {
            int var2;
            int var3;
            Runtime runtime;
            if (command.equalsStringIgnoreCase(TextCore.COMMAND_GARBAGE_COLLECTOR)) {
                clearClientSoftReferences();

                for (var2 = 0; var2 < 10; ++var2) {
                    System.gc();
                }

                runtime = Runtime.getRuntime();
                var3 = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
                Class3_Sub30_Sub1.addChatMessage(null, 0, RSString.stringCombiner(new RSString[]{TextCore.memoryEquals, RSString.stringAnimator(var3), TextCore.Memoryk}), -1);
            }

            int var4;
            if (command.equalsStringIgnoreCase(TextCore.COMMAND_MEMORY_MANAGEMENT)) {
                clearClientSoftReferences();

                for (var2 = 0; var2 < 10; ++var2) {
                    System.gc();
                }

                runtime = Runtime.getRuntime();
                var3 = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
                Class3_Sub30_Sub1.addChatMessage(null, 0, RSString.stringCombiner(new RSString[]{TextCore.memoryBeforeCleanup, RSString.stringAnimator(var3), TextCore.Memoryk}), -1);
                Class3_Sub1.method90(1);
                clearClientSoftReferences();

                for (var4 = 0; var4 < 10; ++var4) {
                    System.gc();
                }

                var3 = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
                Class3_Sub30_Sub1.addChatMessage(null, 0, RSString.stringCombiner(new RSString[]{TextCore.aClass94_2033, RSString.stringAnimator(var3), TextCore.Memoryk}), -1);
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_PC_CACHE_SIZE)) {
                Class3_Sub30_Sub1.addChatMessage(null, 0, RSString.stringCombiner(new RSString[]{TextCore.aClass94_442, RSString.stringAnimator(Unsorted.method1727((byte) 123))}), -1);
            }

            if (HDToolKit.highDetail && command.equalsStringIgnoreCase(TextCore.COMMAND_GRAPHICS_CARD_MEMORY)) {
                System.out.println("oncard_geometry:" + Class31.anInt585);
                System.out.println("oncard_2d:" + Class31.memory2D);
                System.out.println("oncard_texture:" + Class31.anInt580);
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_BREAK_CLIENT_CONNECTION)) {
                Class3_Sub13_Sub13.breakClientConnection();
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_BREAK_JS5_CLIENT_CONNECTION)) {
                Class58.aJs5Worker_917.close();
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_BREAK_JS5_SERVER_CONNECTION)) {
                Class58.aJs5Worker_917.requestTermination();
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_BREAK_CONNECTION)) {
                Class38.aClass87_665.method1431();
                Class3_Sub15.activeConnection.applyDummyStreams();
                Class58.aJs5Worker_917.applyDummyStreams();
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_REPLACE_CANVAS)) {
                Class3_Sub28_Sub5.forceReplaceCanvasEnable = true;
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_REBUILD)) {
                Class117.method1719(25);
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_TOGGLE_FPSON)) {
                fpsOverlayEnabled = true;
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_TOGGLE_FPSOFF)) {
                fpsOverlayEnabled = false;
            }
            if (command.equalsStringIgnoreCase(TextCore.COMMAND_RENDER_INFO)) {
                renderInfoOverlayEnabled = true;
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_RENDER_INFO_OFF)) {
                renderInfoOverlayEnabled = false;
            }
            if (command.equalsStringIgnoreCase(TextCore.TOGGLE_FK)) {
                boolean on = !modernHotkeys;
                modernHotkeys = true;
                Class3_Sub30_Sub1.addChatMessage(null, 0, RSString.parse("Modern hotkeys mode toggled " + (on ? "on." : "off.")), -1);
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_LOWRES_GRAPHICS)) {
                GameObject.graphicsSettings(false, 0, -1, -1);
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_HIGHRES_GRAPHICS_WINDOW)) {
                GameObject.graphicsSettings(false, 1, -1, -1);
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_HIGHRES_GRAPHICS_RESIZE)) {
                GameObject.graphicsSettings(false, 2, -1, -1);
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_HIGHRES_GRAPHICS_FULLSCREEN)) {
                GameObject.graphicsSettings(false, 3, 1024, 768);
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_NOCLIP)) {
                for (var2 = 0; var2 < 4; ++var2) {
                    for (var3 = 1; var3 < 103; ++var3) {
                        for (var4 = 1; var4 < 103; ++var4) {
                            Unsorted.aClass91Array1182[var2].anIntArrayArray1304[var3][var4] = 0;
                        }
                    }
                }
            }

            if (command.startsWith(TextCore.COMMAND_SET_PARTICLES)) {
                Class127_Sub1.method1758(command.substring(15).parseInt());
                Class119.method1730(Class38.aClass87_665);
                CS2Script.aBoolean2705 = false;
            }

            if (command.startsWith(TextCore.COMMAND_FPS) && Class44.anInt718 != 0) {
                Class65.method1237(command.substring(6).parseInt());
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_ERROR_TEST)) {
                throw new RuntimeException();
            }

            if (command.startsWith(TextCore.COMMAND_RECT_DEBUG)) {
                Client.rectDebugInt = command.substring(12).trim(1).parseInt();
                Class3_Sub30_Sub1.addChatMessage(null, 0, RSString.stringCombiner(new RSString[]{TextCore.rectDebugEquals, RSString.stringAnimator(Client.rectDebugInt)}), -1);
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_QA_OP_TEST)) {
                commandQaOpEnabled = true;
            }
            /* Client tweening */
            if (command.equalsStringIgnoreCase(TextCore.COMMAND_TWEENING)) {
                if (tweeningEnabled) {
                    tweeningEnabled = false;
                    Class3_Sub30_Sub1.addChatMessage(null, 0, TextCore.forcedTweeningDisabled, -1);
                } else {
                    tweeningEnabled = true;
                    Class3_Sub30_Sub1.addChatMessage(null, 0, TextCore.forcedTweeningEnabled, -1);
                }
            }

            if (command.equalsStringIgnoreCase(TextCore.COMMAND_SHIFT_DROP_CLICK)) {
                shiftClickEnabled = !shiftClickEnabled;
            }
            Class3_Sub13_Sub1.outgoingBuffer.putOpcode(44);
            Class3_Sub13_Sub1.outgoingBuffer.writeByte(command.length() + -1);
            Class3_Sub13_Sub1.outgoingBuffer.writeString(command.substring(2));

        } catch (RuntimeException var5) {
            throw ClientErrorException.clientError(var5, "k.H(" + (command != null ? "{...}" : "null") + ',' + false + ')');
        }
    }

    static void clearClientSoftReferences() {
        try {
            Class163_Sub2_Sub1.aReferenceCache_4015.clearSoftReferences();
            Class44.aReferenceCache_725.clearSoftReferences();
            Class140_Sub4.aReferenceCache_2792.clearSoftReferences();
            ObjectDefinition.aReferenceCache_21.clearSoftReferences();
            ObjectDefinition.aReferenceCache_1401.clearSoftReferences();
            ObjectDefinition.aReferenceCache_4051.clearSoftReferences();
            ObjectDefinition.aReferenceCache_1965.clearSoftReferences();
            NPCDefinition.aReferenceCache_4043.clearSoftReferences();
            NPCDefinition.aReferenceCache_2442.clearSoftReferences();
            NPCDefinition.aReferenceCache_1964.clearSoftReferences();
            ItemDefinition.aReferenceCache_3572.clearSoftReferences();
            Class143.aReferenceCache_1874.clearSoftReferences();
            Class67.aReferenceCache_1013.clearSoftReferences();
            AnimationDefinition.aReferenceCache_1146.clearSoftReferences();
            Class159.aReferenceCache_2016.clearSoftReferences();
            GraphicDefinition.aReferenceCache_2604.clearSoftReferences();
            GraphicDefinition.aReferenceCache_511.clearSoftReferences();
            CS2Script.aReferenceCache_2450.clearSoftReferences();
            Class136.aReferenceCache_1772.clearSoftReferences();
            RenderAnimationDefinition.aReferenceCache_1955.clearSoftReferences();
            Class3_Sub13_Sub34.aReferenceCache_3412.clearSoftReferences();
            Class3_Sub13_Sub31.aReferenceCache_3369.clearSoftReferences();
            Class128.aReferenceCache_1683.clearSoftReferences();
            Unsorted.aReferenceCache_684.clearSoftReferences();
            Class163_Sub1.aReferenceCache_2984.clearSoftReferences();
            KeyboardListener.aReferenceCache_1911.clearSoftReferences();
            Unsorted.aReferenceCache_1131.clearSoftReferences();
            Class114.aReferenceCache_1569.clearSoftReferences();
            Class3_Sub15.aReferenceCache_2428.clearSoftReferences();
            Unsorted.aReferenceCache_743.clearSoftReferences();
            Class61.aReferenceCache_939.clearSoftReferences();
            Class158_Sub1.aReferenceCache_2982.clearSoftReferences();
            Class3_Sub13_Sub11.aReferenceCache_3130.clearSoftReferences();
            AtmosphereParser.aReferenceCache_1135.clearSoftReferences();
        } catch (RuntimeException var2) {
            throw ClientErrorException.clientError(var2, "je.O(" + ')');
        }
    }
}
