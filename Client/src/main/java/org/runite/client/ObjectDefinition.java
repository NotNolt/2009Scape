package org.runite.client;

import org.rs09.client.Linkable;
import org.rs09.client.config.GameConfig;
import org.rs09.client.data.HashTable;
import org.rs09.client.LinkableInt;
import org.rs09.client.data.ReferenceCache;

import java.util.Objects;

final class ObjectDefinition {

    /**
     * *       *       *       *
     * Values used for Object Definition Information
     */
    int objectId;
    /*
        Start Opcode Values
     */
    private int[] objectModels;
    private int[] objectConfiguration;
    RSString name;
    int objectSizeX = 1;
    int objectSizeY = 1;
    boolean objectProjectileClipped;
    int objectClipType;
    int SecondInt;
    private byte aByte1505;
    private boolean aBoolean1541;
    boolean aBoolean1542;
    int animationId;
    int anInt1528;
    private int anInt1494 = 0;
    private int anInt1489;
    RSString[] objectOptions;
    private short[] objectOriginalColors;
    private short[] objectModifiedColors;
    private short[] aShortArray1495;
    private short[] aShortArray1476;
    private byte[] aByteArray1513;
    int objectMapIcon;
    private boolean aBoolean1536;
    boolean aBoolean1525;
    private int anInt1479;
    private int anInt1488;
    private int anInt1481;
    int objectWalkingFlag;
    private int anInt1496;
    private int anInt1511;
    private int SecondBool;
    boolean aBoolean1483 = false;
    boolean objectNotClipped;
    int anInt1540;
    private int objectConfigFileId;
    private int objectConfigId;
    int[] objectChildrenIds;
    int anInt1512;
    int anInt1484;
    int anInt1518;
    int anInt1515;
    int[] anIntArray1539;
    private short aShort1500;
    boolean aBoolean1530;
    boolean aBoolean1503;
    boolean aBoolean1492;
    boolean aBoolean1502 = false;
    boolean aBoolean1491;
    boolean aBoolean1507;
    boolean aBoolean1537;
    boolean aBoolean1510;
    int anInt1493;
    int anInt1517;
    int anInt1520;
    int anInt1522;
    int anInt1478;
    int anInt1516;
    private HashTable aHashTable_1501;
	/*
		End Opcode Values
	 */
    /**
     * Cache Information
     */
    public static ReferenceCache aReferenceCache_21 = new ReferenceCache(64);
    static ReferenceCache aReferenceCache_1401 = new ReferenceCache(500);
    public static ReferenceCache aReferenceCache_4051 = new ReferenceCache(30);
    static Class136 aClass136_1413 = new Class136();
    static ReferenceCache aReferenceCache_1965 = new ReferenceCache(50);
    static CacheIndex aClass153_1043;
    static CacheIndex objectDefinitionIndex;


    static ObjectDefinition getObjectDefinition(int objectId) {
        try {
            //36873, 24065, 22418
            ObjectDefinition objectdefinition = (ObjectDefinition) aReferenceCache_21.get(objectId);
            if (objectdefinition == null) {
                byte[] buffer = objectDefinitionIndex.getFile(objectId >>> 8, objectId & 255);
                objectdefinition = new ObjectDefinition();
                objectdefinition.objectId = objectId;
                if (buffer != null) {
                    objectdefinition.parseDefinitions(new DataBuffer(buffer));
                }
                objectdefinition.method1689();
                if (!Sprites.aBoolean337 && objectdefinition.aBoolean1491) {
                    objectdefinition.objectOptions = null;
                }
                if (objectdefinition.objectNotClipped) {
                    objectdefinition.objectClipType = 0;
                    objectdefinition.objectProjectileClipped = false;
                }
                aReferenceCache_21.put(objectdefinition, objectId);
            }
            return objectdefinition;
        } catch (RuntimeException var4) {
            throw ClientErrorException.clientError(var4, "wc.D(" + 4 + ',' + objectId + ')');
        }
    }

    static boolean isValidObjectMapping(byte var0, int var1, int var2, byte[] var3) {
        try {
            boolean var5 = true;
            int var7 = -1;
            DataBuffer buffer = new DataBuffer(var3);

            if (buffer.buffer.length == 0) {
//    		 System.out.println("No object mapping found!");
                return true;
            }
            while (true) {
                if (buffer.index == buffer.buffer.length) {
                    return true;
                }
                int var8 = buffer.method773();
                if (0 == var8) {
                    return var5;
                }

                int var9 = 0;
                var7 += var8;
                boolean var10 = false;

                while (true) {
                    int var11;
                    if (var10) {
                        var11 = buffer.getSmart();
                        if (var11 == 0) {
                            break;
                        }

                        buffer.readUnsignedByte();
                    } else {
                        if (buffer.index == buffer.buffer.length) {
                            break;
                        }
                        var11 = buffer.getSmart();
                        if (0 == var11) {
                            break;
                        }

                        var9 += var11 + -1;
                        int var12 = 63 & var9;
                        int var13 = (4088 & var9) >> 6;
                        int var16 = var2 + var12;
                        int var15 = var1 + var13;
                        int var14 = buffer.readUnsignedByte() >> 2;
                        if (var15 > 0 && var16 > 0 && 103 > var15 && 103 > var16) {
                            ObjectDefinition var17 = getObjectDefinition(var7);
                            if (var14 != 22 || KeyboardListener.aBoolean1905 || 0 != var17.SecondInt || var17.objectClipType == 1 || var17.aBoolean1483) {
                                var10 = true;
                                if (!var17.hasModels()) {
                                    var5 = false;
                                    ++Class162.anInt2038;
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var18) {
            throw ClientErrorException.clientError(var18, "dm.A(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
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
            throw ClientErrorException.clientError(var4, "pb.G(" + (buffer != null ? "{...}" : "null") + ')');
        }
    }

    private void parseOpcode(DataBuffer buffer, int opcode) {
        try {
            int var4;
            int var5;
            switch (opcode) {
                case 1:
                    var4 = buffer.readUnsignedByte();
                    if (var4 > 0) {
                        if (this.objectModels == null || Unsorted.aBoolean742) {
                            this.objectConfiguration = new int[var4];
                            this.objectModels = new int[var4];

                            for (var5 = 0; var4 > var5; ++var5) {
                                this.objectModels[var5] = buffer.readUnsignedShort();
                                this.objectConfiguration[var5] = buffer.readUnsignedByte();
                            }
                        } else {
                            buffer.index += var4 * 3;
                        }
                    }
                    break;
                case 2:
                    this.name = buffer.readString();
                    break;
                case 5:
                    var4 = buffer.readUnsignedByte();
                    if (var4 > 0) {
                        if (null == this.objectModels || Unsorted.aBoolean742) {
                            this.objectModels = new int[var4];
                            this.objectConfiguration = null;

                            for (var5 = 0; var4 > var5; ++var5) {
                                this.objectModels[var5] = buffer.readUnsignedShort();
                            }
                        } else {
                            buffer.index += var4 * 2;
                        }
                    }
                    break;
                case 14:
                    this.objectSizeX = buffer.readUnsignedByte();
                    break;
                case 15:
                    this.objectSizeY = buffer.readUnsignedByte();
                    break;
                case 17:
                    this.objectProjectileClipped = false;
                    this.objectClipType = 0;
                    break;
                case 18:
                    this.objectProjectileClipped = false;
                    break;
                case 19:
                    this.SecondInt = buffer.readUnsignedByte();
                    break;
                case 21:
                    this.aByte1505 = 1;
                    break;
                case 22:
                    this.aBoolean1541 = true;
                    break;
                case 23:
                    this.aBoolean1542 = true;
                    break;
                case 24:
                    this.animationId = buffer.readUnsignedShort();
                    if (this.animationId == 65535) {
                        this.animationId = -1;
                    }
                    break;
                case 27:
                    this.objectClipType = 1;
                    break;
                case 28:
                    this.anInt1528 = buffer.readUnsignedByte();
                    break;
                case 29:
                    this.anInt1494 = buffer.readSignedByte();
                    break;
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                    this.objectOptions[opcode - 30] = buffer.readString();
                    if (this.objectOptions[-30 + opcode].equalsStringIgnoreCase(TextCore.HasHidden)) {
                        this.objectOptions[-30 + opcode] = null;
                    }
                    break;
                case 39:
                    this.anInt1489 = buffer.readSignedByte() * 5;
                    break;
                case 40:
                    var4 = buffer.readUnsignedByte();
                    this.objectOriginalColors = new short[var4];
                    this.objectModifiedColors = new short[var4];

                    for (var5 = 0; var5 < var4; ++var5) {
                        this.objectOriginalColors[var5] = (short) buffer.readUnsignedShort();
                        this.objectModifiedColors[var5] = (short) buffer.readUnsignedShort();
                    }
                    break;
                case 41:
                    var4 = buffer.readUnsignedByte();
                    this.aShortArray1495 = new short[var4];
                    this.aShortArray1476 = new short[var4];

                    for (var5 = 0; var4 > var5; ++var5) {
                        this.aShortArray1476[var5] = (short) buffer.readUnsignedShort();
                        this.aShortArray1495[var5] = (short) buffer.readUnsignedShort();
                    }
                    break;
                case 42:
                    var4 = buffer.readUnsignedByte();
                    this.aByteArray1513 = new byte[var4];

                    for (var5 = 0; var4 > var5; ++var5) {
                        this.aByteArray1513[var5] = buffer.readSignedByte();
                    }
                    break;
                case 60:
                    this.objectMapIcon = buffer.readUnsignedShort();
                    break;
                case 62:
                    this.aBoolean1536 = true;
                    break;
                case 64:
                    this.aBoolean1525 = false;
                    break;
                case 65:
                    this.anInt1479 = buffer.readUnsignedShort();
                    break;
                case 66:
                    this.anInt1488 = buffer.readUnsignedShort();
                    break;
                case 67:
                    this.anInt1481 = buffer.readUnsignedShort();
                    break;
                case 69:
                    this.objectWalkingFlag = buffer.readUnsignedByte();
                    break;
                case 70:
                    this.anInt1496 = buffer.readSignedShort();
                    break;
                case 71:
                    this.anInt1511 = buffer.readSignedShort();
                    break;
                case 72:
                    this.SecondBool = buffer.readSignedShort();
                    break;
                case 73:
                    this.aBoolean1483 = true;
                    break;
                case 74:
                    this.objectNotClipped = true;
                    break;
                case 75:
                    this.anInt1540 = buffer.readUnsignedByte();
                    break;
                case 77:
                case 92:
                    var4 = -1;
                    this.objectConfigFileId = buffer.readUnsignedShort();
                    if ('\uffff' == this.objectConfigFileId) {
                        this.objectConfigFileId = -1;
                    }

                    this.objectConfigId = buffer.readUnsignedShort();
                    if ('\uffff' == this.objectConfigId) {
                        this.objectConfigId = -1;
                    }

                    if (opcode == 92) {
                        var4 = buffer.readUnsignedShort();
                        if (var4 == '\uffff') {
                            var4 = -1;
                        }
                    }
                    var5 = buffer.readUnsignedByte();
                    this.objectChildrenIds = new int[var5 - -2];

                    for (int var6 = 0; var5 >= var6; ++var6) {
                        this.objectChildrenIds[var6] = buffer.readUnsignedShort();
                        if ('\uffff' == this.objectChildrenIds[var6]) {
                            this.objectChildrenIds[var6] = -1;
                        }
                    }
                    this.objectChildrenIds[1 + var5] = var4;
                    break;
                case 78:
                    this.anInt1512 = buffer.readUnsignedShort();
                    this.anInt1484 = buffer.readUnsignedByte();
                    break;
                case 79:
                    this.anInt1518 = buffer.readUnsignedShort();
                    this.anInt1515 = buffer.readUnsignedShort();
                    this.anInt1484 = buffer.readUnsignedByte();
                    var4 = buffer.readUnsignedByte();
                    this.anIntArray1539 = new int[var4];
                    for (var5 = 0; var5 < var4; ++var5) {
                        this.anIntArray1539[var5] = buffer.readUnsignedShort();
                    }
                    break;
                case 81:
                    this.aByte1505 = 2;
                    this.aShort1500 = (short) (256 * buffer.readUnsignedByte());
                    break;
                case 82:
                    this.aBoolean1530 = true;
                    break;
                case 88:
                    this.aBoolean1503 = false;
                    break;
                case 89:
                    this.aBoolean1492 = false;
                    break;
                case 90:
                    this.aBoolean1502 = true;
                    break;
                case 91:
                    this.aBoolean1491 = true;
                    break;
                case 93:
                    this.aByte1505 = 3;
                    this.aShort1500 = (short) buffer.readUnsignedShort();
                    break;
                case 94:
                    this.aByte1505 = 4;
                    break;
                case 95:
                    this.aByte1505 = 5;
                    break;
                case 96:
                    this.aBoolean1507 = true;
                    break;
                case 97:
                    this.aBoolean1537 = true;
                    break;
                case 98:
                    this.aBoolean1510 = true;
                    break;
                case 99:
                    this.anInt1493 = buffer.readUnsignedByte();
                    this.anInt1517 = buffer.readUnsignedShort();
                    break;
                case 100:
                    this.anInt1520 = buffer.readUnsignedByte();
                    this.anInt1522 = buffer.readUnsignedShort();
                    break;
                case 101:
                    this.anInt1478 = buffer.readUnsignedByte();
                    break;
                case 102:
                    this.anInt1516 = buffer.readUnsignedShort();
                    break;
                case 249:
                    var4 = buffer.readUnsignedByte();
                    if (null == this.aHashTable_1501) {
                        var5 = Class95.method1585((byte) 83, var4);
                        this.aHashTable_1501 = new HashTable(var5);
                    }

                    for (var5 = 0; var4 > var5; ++var5) {
                        boolean var10 = buffer.readUnsignedByte() == 1;
                        int var7 = buffer.readMedium();
                        Object var8;
                        if (var10) {
                            var8 = new LinkableRSString(buffer.readString());
                        } else {
                            var8 = new LinkableInt(buffer.readInt());
                        }

                        this.aHashTable_1501.put((long) var7, (Linkable) var8);
                    }
                    break;
            }
        } catch (RuntimeException var9) {
            throw ClientErrorException.clientError(var9, "pb.K(" + (buffer != null ? "{...}" : "null") + ',' + opcode + ',' + -80 + ')');
        }

        /**
         * Will find a better way to incorporate this without tacking it onto the end of ObjectDefinitions at some point.
         * Will *Actually* worry about it and make it 100x better when working on the new client. ~ Woah
         *
         * Checks to see if the Halloween Event is enabled, and then applies the "Gaze-into" option to the cauldron that
         * had it during the 2008 Halloween Event
         */
        if (GameConfig.HALLOWEEN_EVENT_ENABLED) {
            if (objectId == 39233) {
                objectOptions[0] = TextCore.GazeInto;
            }
        }
        if (GameConfig.OBJECT_DEBUG_ENABLED) {
            if (objectOptions[0] == null && objectOptions[1] == null && objectOptions[2] == null && objectOptions[3] == null && objectOptions[4] == null) {
                objectOptions[0] = RSString.parse("Viewing object");
            }
        }
    }

    final boolean method1684(int var2) {
        try {
            if (this.objectConfiguration != null) {
                for (int var7 = 0; var7 < this.objectConfiguration.length; ++var7) {
                    if (this.objectConfiguration[var7] == var2) {
                        return aClass153_1043.method2129((byte) 72, 0, this.objectModels[var7] & '\uffff');
                    }
                }
                return true;
            } else if (null == this.objectModels) {
                return true;
            } else if (var2 == 10) {
                boolean var4 = true;
                for (int objectModel : this.objectModels) {
                    var4 &= aClass153_1043.method2129((byte) 71, 0, '\uffff' & objectModel);
                }
                return var4;
            } else {
                return true;
            }
        } catch (RuntimeException var6) {
            throw ClientErrorException.clientError(var6, "pb.H(" + 115 + ',' + var2 + ')');
        }
    }

    final ObjectDefinition method1685(int var1) {
        try {
            if (var1 != 0) {
                this.method1697(-92, 83, null, -13, null, 18, null, true, 114, 123, null, 118, 85, -116);
            }

            int var2 = -1;
            if (this.objectConfigFileId != -1) {
                var2 = CS2Script.method1484(this.objectConfigFileId);
            } else if (this.objectConfigId != -1) {
                var2 = CS2Script.ram[this.objectConfigId];
            }

            if (var2 >= 0 && this.objectChildrenIds.length - 1 > var2 && this.objectChildrenIds[var2] != -1) {
                return getObjectDefinition(this.objectChildrenIds[var2]);
            } else {
                int var3 = this.objectChildrenIds[-1 + this.objectChildrenIds.length];
                return var3 == -1 ? null : getObjectDefinition(var3);
            }
        } catch (RuntimeException var4) {
            throw ClientErrorException.clientError(var4, "pb.C(" + var1 + ')');
        }
    }

    private Model_Sub1 method1686(int var1, int var2) {
        try {
            Model_Sub1 var4 = null;
            boolean var5 = this.aBoolean1536;
            if (var2 == 2 && 3 < var1) {
                var5 = !var5;
            }

            int var6;
            int var7;
            if (null == this.objectConfiguration) {
                if (var2 != 10) {
                    return null;
                }

                if (this.objectModels == null) {
                    return null;
                }

                var6 = this.objectModels.length;

                for (var7 = 0; var6 > var7; ++var7) {
                    int var8 = this.objectModels[var7];
                    if (var5) {
                        var8 += 65536;
                    }

                    var4 = (Model_Sub1) aReferenceCache_1401.get((long) var8);
                    if (var4 == null) {
                        var4 = Model_Sub1.method2015(aClass153_1043, var8 & '\uffff');
                        if (var4 == null) {
                            return null;
                        }

                        if (var5) {
                            var4.method2002();
                        }

                        aReferenceCache_1401.put(var4, (long) var8);
                    }

                    if (1 < var6) {
                        Class164.aClass140_Sub5Array2058[var7] = var4;
                    }
                }

                if (var6 > 1) {
                    var4 = new Model_Sub1(Class164.aClass140_Sub5Array2058, var6);
                }
            } else {
                var6 = -1;

                for (var7 = 0; this.objectConfiguration.length > var7; ++var7) {
                    if (var2 == this.objectConfiguration[var7]) {
                        var6 = var7;
                        break;
                    }
                }

                if (var6 == -1) {
                    return null;
                }

                var7 = this.objectModels[var6];
                if (var5) {
                    var7 += 65536;
                }

                var4 = (Model_Sub1) aReferenceCache_1401.get((long) var7);
                if (null == var4) {
                    var4 = Model_Sub1.method2015(aClass153_1043, var7 & '\uffff');
                    if (null == var4) {
                        return null;
                    }

                    if (var5) {
                        var4.method2002();
                    }

                    aReferenceCache_1401.put(var4, (long) var7);
                }
            }

            boolean var11;
            var11 = 128 != this.anInt1479 || this.anInt1488 != 128 || 128 != this.anInt1481;

            boolean var12;
            var12 = this.anInt1496 != 0 || this.anInt1511 != 0 || 0 != this.SecondBool;

            Model_Sub1 var13 = new Model_Sub1(Objects.requireNonNull(var4), var1 == 0 && !var11 && !var12, this.objectOriginalColors == null, null == this.aShortArray1476);
            if (var2 == 4 && var1 > 3) {
                var13.method2011();
                var13.method2001(45, 0, -45);
            }

            var1 &= 3;
            if (var1 == 1) {
                var13.method1991();
            } else if (var1 == 2) {
                var13.method1989();
            } else if (3 == var1) {
                var13.method2018();
            }

            int var9;
            if (null != this.objectOriginalColors) {
                for (var9 = 0; this.objectOriginalColors.length > var9; ++var9) {
                    if (null != this.aByteArray1513 && this.aByteArray1513.length > var9) {
                        var13.method2016(this.objectOriginalColors[var9], Class3_Sub13_Sub9.aShortArray3110[255 & this.aByteArray1513[var9]]);
                    } else {
                        var13.method2016(this.objectOriginalColors[var9], this.objectModifiedColors[var9]);
                    }
                }
            }

            if (this.aShortArray1476 != null) {
                for (var9 = 0; this.aShortArray1476.length > var9; ++var9) {
                    var13.method1998(this.aShortArray1476[var9], this.aShortArray1495[var9]);
                }
            }

            if (var11) {
                var13.method1994(this.anInt1479, this.anInt1488, this.anInt1481);
            }

            if (var12) {
                var13.method2001(this.anInt1496, this.anInt1511, this.SecondBool);
            }

            return var13;
        } catch (RuntimeException var10) {
            throw ClientErrorException.clientError(var10, "pb.O(" + var1 + ',' + var2 + ',' + -1 + ')');
        }
    }

    final void method1689() {
        try {
            if (this.SecondInt == -1) {
                this.SecondInt = 0;
                if (null != this.objectModels && (null == this.objectConfiguration || this.objectConfiguration[0] == 10)) {
                    this.SecondInt = 1;
                }

                for (int var2 = 0; var2 < 5; ++var2) {
                    if (this.objectOptions[var2] != null) {
                        this.SecondInt = 1;
                        break;
                    }
                }
            }
            if (-1 == this.anInt1540) {
                this.anInt1540 = this.objectClipType != 0 ? 1 : 0;
            }

        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "pb.D(" + ')');
        }
    }

    final boolean method1690() {
        try {
            if (this.objectChildrenIds == null) {
                return this.anInt1512 != -1 || this.anIntArray1539 != null;
            } else {

                for (int var2 = 0; this.objectChildrenIds.length > var2; ++var2) {
                    if (this.objectChildrenIds[var2] != -1) {
                        ObjectDefinition var3 = getObjectDefinition(this.objectChildrenIds[var2]);
                        if (var3.anInt1512 != -1 || var3.anIntArray1539 != null) {
                            return true;
                        }
                    }
                }

                return false;
            }
        } catch (RuntimeException var4) {
            throw ClientErrorException.clientError(var4, "pb.F(" + 28933 + ')');
        }
    }

    final int method1691(int var1, int var2) {
        try {
            if (this.aHashTable_1501 == null) {
                return var1;
            } else {
                LinkableInt var4 = (LinkableInt) this.aHashTable_1501.get(var2);
                return var4 != null ? var4.value : var1;
            }
        } catch (RuntimeException var5) {
            throw ClientErrorException.clientError(var5, "pb.N(" + var1 + ',' + var2 + ')');
        }
    }

    final boolean hasModels() {
        try {
            if (null == this.objectModels) {
                return true;
            } else {
                boolean var2 = true;

                for (int var3 = 0; var3 < this.objectModels.length; ++var3) {
                    var2 &= aClass153_1043.method2129((byte) 64, 0, '\uffff' & this.objectModels[var3]);
                }

                return var2;
            }
        } catch (RuntimeException var4) {
            throw ClientErrorException.clientError(var4, "pb.I(" + false + ')');
        }
    }

    private Class140_Sub1_Sub1 method1695(int var1, boolean var2, int var4) {
        try {
            int var6 = this.anInt1494 + 64;
            int var7 = 5 * this.anInt1489 + 768;
            Class140_Sub1_Sub1 var5;
            int var8;
            int var12;
            if (this.objectConfiguration == null) {
                if (var4 != 10) {
                    return null;
                }

                if (this.objectModels == null) {
                    return null;
                }

                var8 = this.objectModels.length;
                if (var8 == 0) {
                    return null;
                }

                long var16 = 0L;

                for (int var11 = 0; var11 < var8; ++var11) {
                    var16 = (long) this.objectModels[var11] + var16 * 67783L;
                }

                if (var2) {
                    var16 = ~var16;
                }

                var5 = (Class140_Sub1_Sub1) aReferenceCache_1401.get(var16);
                if (null == var5) {
                    Model_Sub1 var17 = null;

                    for (var12 = 0; var12 < var8; ++var12) {
                        var17 = Model_Sub1.method2015(aClass153_1043, this.objectModels[var12] & '\uffff');
                        if (null == var17) {
                            return null;
                        }

                        if (var8 > 1) {
                            Class164.aClass140_Sub5Array2058[var12] = var17;
                        }
                    }

                    if (1 < var8) {
                        var17 = new Model_Sub1(Class164.aClass140_Sub5Array2058, var8);
                    }

                    var5 = new Class140_Sub1_Sub1(var17, var6, var7, var2);
                    aReferenceCache_1401.put(var5, var16);
                }
            } else {
                var8 = -1;

                int var9;
                for (var9 = 0; this.objectConfiguration.length > var9; ++var9) {
                    if (var4 == this.objectConfiguration[var9]) {
                        var8 = var9;
                        break;
                    }
                }

                if (var8 == -1) {
                    return null;
                }

                var9 = this.objectModels[var8];
                if (var2) {
                    var9 += 65536;
                }

                var5 = (Class140_Sub1_Sub1) aReferenceCache_1401.get((long) var9);
                if (null == var5) {
                    Model_Sub1 var10 = Model_Sub1.method2015(aClass153_1043, '\uffff' & var9);
                    if (null == var10) {
                        return null;
                    }

                    var5 = new Class140_Sub1_Sub1(var10, var6, var7, var2);
                    aReferenceCache_1401.put(var5, (long) var9);
                }
            }

            boolean var14 = this.aBoolean1536;
            if (var4 == 2 && var1 > 3) {
                var14 = !var14;
            }

            boolean var15 = 128 == this.anInt1488 && this.anInt1511 == 0;
            boolean var18 = var1 == 0 && 128 == this.anInt1479 && this.anInt1481 == 128 && this.anInt1496 == 0 && this.SecondBool == 0 && !var14;
            Class140_Sub1_Sub1 var19 = var5.method1926(var18, var15, this.objectOriginalColors == null, var6 == var5.method1903(), var1 == 0 && !var14, true, var5.method1924() == var7, !var14, this.aShortArray1476 == null);
            if (var14) {
                var19.method1931();
            }

            if (var4 == 4 && 3 < var1) {
                var19.method1932();
                var19.method1897(45, 0, -45);
            }

            var1 &= 3;
            if (1 == var1) {
                var19.method1925();
            } else if (var1 == 2) {
                var19.method1911();
            } else if (var1 == 3) {
                var19.method1902();
            }

            if (null != this.objectOriginalColors) {
                for (var12 = 0; var12 < this.objectOriginalColors.length; ++var12) {
                    var19.method1918(this.objectOriginalColors[var12], this.objectModifiedColors[var12]);
                }
            }

            if (null != this.aShortArray1476) {
                for (var12 = 0; var12 < this.aShortArray1476.length; ++var12) {
                    var19.method1916(this.aShortArray1476[var12], this.aShortArray1495[var12]);
                }
            }

            if (this.anInt1479 != 128 || this.anInt1488 != 128 || this.anInt1481 != 128) {
                var19.resize(this.anInt1479, this.anInt1488, this.anInt1481);
            }

            if (this.anInt1496 != 0 || this.anInt1511 != 0 || 0 != this.SecondBool) {
                var19.method1897(this.anInt1496, this.anInt1511, this.SecondBool);
            }

            if (var6 != var19.method1903()) {
                var19.method1914(var6);
            }

            if (var19.method1924() != var7) {
                var19.method1909(var7);
            }

            return var19;
        } catch (RuntimeException var13) {
            throw ClientErrorException.clientError(var13, "pb.L(" + var1 + ',' + var2 + ',' + true + ',' + var4 + ')');
        }
    }

    final Class136 method1696(int var1, int var2, int[][] var3, int var4, int var5, int[][] var6, boolean var7, LDIndexedSprite var8, byte var9, boolean var10, int var11) {
        try {
            if (var9 >= -5) {
                return null;
            } else {
                long var12;
                if (HDToolKit.highDetail) {
                    if (null == this.objectConfiguration) {
                        var12 = (this.objectId << 10) + var1;
                    } else {
                        var12 = var1 + (this.objectId << 10) - -(var4 << 3);
                    }

                    Class136 var16 = (Class136) aReferenceCache_4051.get(var12);
                    Class140_Sub1_Sub1 var14;
                    LDIndexedSprite var15;
                    if (null == var16) {
                        var14 = this.method1695(var1, false, var4);
                        if (null == var14) {
                            aClass136_1413.aClass140_1777 = null;
                            aClass136_1413.aClass109_Sub1_1770 = null;
                            return aClass136_1413;
                        }

                        if (var4 == 10 && var1 > 3) {
                            var14.method1876(256);
                        }

                        if (var10) {
                            var15 = var14.method1933(var8);
                        } else {
                            var15 = null;
                        }

                        var16 = new Class136();
                        var16.aClass140_1777 = var14;
                        var16.aClass109_Sub1_1770 = var15;
                        aReferenceCache_4051.put(var16, var12);
                    } else {
                        var14 = (Class140_Sub1_Sub1) var16.aClass140_1777;
                        var15 = var16.aClass109_Sub1_1770;
                    }

                    boolean var17 = this.aBoolean1541 & var7;
                    Class140_Sub1_Sub1 var18 = var14.method1926(3 != this.aByte1505, this.aByte1505 == 0, true, true, true, !var17, true, true, true);
                    if (this.aByte1505 != 0) {
                        var18.method1919(this.aByte1505, this.aShort1500, var14, var3, var6, var2, var5, var11);
                    }

                    var18.method1920(this.SecondInt == 0 && !this.aBoolean1510, true, true, this.SecondInt == 0, true, false);
                    aClass136_1413.aClass140_1777 = var18;
                    var18.aBoolean3809 = var17;
                    aClass136_1413.aClass109_Sub1_1770 = var15;
                } else {
                    if (this.objectConfiguration == null) {
                        var12 = (this.objectId << 10) + var1;
                    } else {
                        var12 = (var4 << 3) + ((this.objectId << 10) - -var1);
                    }

                    boolean var20;
                    if (var7 && this.aBoolean1541) {
                        var12 |= Long.MIN_VALUE;
                        var20 = true;
                    } else {
                        var20 = false;
                    }

                    Object var22 = aReferenceCache_4051.get(var12);
                    if (null == var22) {
                        Model_Sub1 var21 = this.method1686(var1, var4);
                        if (var21 == null) {
                            aClass136_1413.aClass140_1777 = null;
                            return aClass136_1413;
                        }

                        var21.method2010();
                        if (var4 == 10 && var1 > 3) {
                            var21.method2011();
                        }

                        if (var20) {
                            var21.aShort2879 = (short) (64 + this.anInt1494);
                            var22 = var21;
                            var21.aShort2876 = (short) (768 + 5 * this.anInt1489);
                            var21.method1997();
                        } else {
                            var22 = new Class140_Sub1_Sub2(var21, 64 - -this.anInt1494, 5 * this.anInt1489 + 768, -50, -10, -50);
                        }

                        aReferenceCache_4051.put(var22, var12);
                    }

                    if (var20) {
                        var22 = ((Model_Sub1) var22).method2004();
                    }

                    if (0 != this.aByte1505) {
                        if (var22 instanceof Class140_Sub1_Sub2) {
                            var22 = ((Class140_Sub1_Sub2) var22).method1941(this.aByte1505, this.aShort1500, var3, var6, var2, var5, var11, true);
                        } else if (var22 instanceof Model_Sub1) {
                            var22 = ((Model_Sub1) var22).method1999(this.aByte1505, this.aShort1500, var3, var6, var2, var5, var11);
                        }
                    }

                    aClass136_1413.aClass140_1777 = (GameObject) var22;
                }
                return aClass136_1413;
            }
        } catch (RuntimeException var19) {
            throw ClientErrorException.clientError(var19, "pb.A(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ',' + var5 + ',' + (var6 != null ? "{...}" : "null") + ',' + var7 + ',' + (var8 != null ? "{...}" : "null") + ',' + var9 + ',' + var10 + ',' + var11 + ')');
        }
    }

    final Class136 method1697(int var1, int var2, LDIndexedSprite var3, int var4, AnimationDefinition var5, int var6, int[][] var7, boolean var8, int var9, int var10, int[][] var11, int var12, int var13, int var14) {
        try {
            if (var10 != 8308) {
                this.hasModels();
            }

            long var15;
            if (HDToolKit.highDetail) {
                if (this.objectConfiguration == null) {
                    var15 = var6 + (this.objectId << 10);
                } else {
                    var15 = (var13 << 3) + ((this.objectId << 10) + var6);
                }

                Class140_Sub1_Sub1 var23 = (Class140_Sub1_Sub1) aReferenceCache_1965.get(var15);
                if (var23 == null) {
                    var23 = this.method1695(var6, true, var13);
                    if (null == var23) {
                        return null;
                    }
                    var23.method1908();
                    var23.method1920(false, false, false, false, false, true);
                    aReferenceCache_1965.put(var23, var15);
                }

                boolean var19 = false;
                Class140_Sub1_Sub1 var22 = var23;
                if (null != var5) {
                    var22 = (Class140_Sub1_Sub1) var5.method2056(var12, var9, var14, var6, var23);
                    var19 = true;
                }

                if (var13 == 10 && 3 < var6) {
                    if (!var19) {
                        var22 = (Class140_Sub1_Sub1) var22.method1890(true, true, true);
                        var19 = true;
                    }

                    var22.method1876(256);
                }

                if (var8) {
                    aClass136_1413.aClass109_Sub1_1770 = var22.method1933(var3);
                } else {
                    aClass136_1413.aClass109_Sub1_1770 = null;
                }

                if (this.aByte1505 != 0) {
                    if (!var19) {
                        var22 = (Class140_Sub1_Sub1) var22.method1890(true, true, true);
                    }

                    var22.method1919(this.aByte1505, this.aShort1500, var23, var7, var11, var2, var4, var1);
                }

                aClass136_1413.aClass140_1777 = var22;
            } else {
                if (this.objectConfiguration == null) {
                    var15 = (this.objectId << 10) + var6;
                } else {
                    var15 = var6 + (this.objectId << 10) + (var13 << 3);
                }

                Class140_Sub1_Sub2 var17 = (Class140_Sub1_Sub2) aReferenceCache_1965.get(var15);
                if (var17 == null) {
                    Model_Sub1 var18 = this.method1686(var6, var13);
                    if (var18 == null) {
                        return null;
                    }

                    var17 = new Class140_Sub1_Sub2(var18, 64 + this.anInt1494, this.anInt1489 * 5 + 768, -50, -10, -50);
                    aReferenceCache_1965.put(var17, var15);
                }

                boolean var21 = false;
                if (var5 != null) {
                    var21 = true;
                    var17 = (Class140_Sub1_Sub2) var5.method2054(var9, var12, var17, var6, var14);
                }

                if (var13 == 10 && var6 > 3) {
                    if (!var21) {
                        var21 = true;
                        var17 = (Class140_Sub1_Sub2) var17.method1890(true, true, true);
                    }

                    var17.method1876(256);
                }

                if (this.aByte1505 != 0) {
                    if (!var21) {
                        var17 = (Class140_Sub1_Sub2) var17.method1890(true, true, true);
                    }

                    var17 = var17.method1941(this.aByte1505, this.aShort1500, var7, var11, var2, var4, var1, false);
                }

                aClass136_1413.aClass140_1777 = var17;
            }
            return aClass136_1413;
        } catch (RuntimeException var20) {
            throw ClientErrorException.clientError(var20, "pb.M(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ',' + (var5 != null ? "{...}" : "null") + ',' + var6 + ',' + (var7 != null ? "{...}" : "null") + ',' + var8 + ',' + var9 + ',' + var10 + ',' + (var11 != null ? "{...}" : "null") + ',' + var12 + ',' + var13 + ',' + var14 + ')');
        }
    }

    final RSString method1698(RSString var1, int var3) {
        try {
            if (null == this.aHashTable_1501) {
                return var1;
            } else {
                LinkableRSString var4 = (LinkableRSString) this.aHashTable_1501.get((long) var3);
                return var4 == null ? var1 : var4.value;
            }
        } catch (RuntimeException var5) {
            throw ClientErrorException.clientError(var5, "pb.E(" + (var1 != null ? "{...}" : "null") + ',' + -23085 + ',' + var3 + ')');
        }
    }

    public ObjectDefinition() {
        this.name = RSString.parse("null");
        this.aBoolean1503 = true;
        this.anInt1493 = -1;
        this.anInt1515 = 0;
        this.anInt1516 = -1;
        this.aByte1505 = 0;
        this.aBoolean1491 = false;
        this.anInt1517 = -1;
        this.anInt1496 = 0;
        this.anInt1518 = 0;
        this.objectMapIcon = -1;
        this.aBoolean1510 = false;
        this.anInt1520 = -1;
        this.aShort1500 = -1;
        this.anInt1481 = 128;
        this.objectOptions = new RSString[5];
        this.anInt1479 = 128;
        this.aBoolean1492 = true;
        this.anInt1488 = 128;
        this.objectNotClipped = false;
        this.SecondInt = -1;
        this.aBoolean1530 = false;
        this.aBoolean1525 = true;
        this.objectConfigId = -1;
        this.anInt1522 = -1;
        this.objectWalkingFlag = 0;
        this.objectProjectileClipped = true;
        this.SecondBool = 0;
        this.anInt1478 = 0;
        this.anInt1528 = 16;
        this.aBoolean1537 = false;
        this.anInt1511 = 0;
        this.anInt1484 = 0;
        this.anInt1489 = 0;
        this.animationId = -1;
        this.aBoolean1507 = false;
        this.anInt1512 = -1;
        this.objectClipType = 2;
        this.aBoolean1536 = false;
        this.objectConfigFileId = -1;
        this.anInt1540 = -1;
        this.aBoolean1541 = false;
        this.aBoolean1542 = false;
    }

}
