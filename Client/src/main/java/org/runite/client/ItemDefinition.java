package org.runite.client;

import org.rs09.client.Linkable;
import org.rs09.client.data.HashTable;
import org.rs09.client.LinkableInt;
import org.rs09.client.data.ReferenceCache;

import java.util.Objects;

final class ItemDefinition {

    /**
     * Values used for Item Definition Information
     */
    int itemId;
    /*
        Start Opcode Values
     */
    private int itemInterfaceModelId;
    RSString itemName;
    int itemModelZoom;
    int itemModelRotationY;
    int itemModelRotationX;
    int itemModelOffsetX;
    int itemModelOffsetY;
    int itemStackable;
    int itemValue = 1;
    boolean itemMembersOnly;
    private int itemMaleWornModelID1;
    private int itemFemaleWornModelID1;
    private int itemMaleWornModelID2;
    private int itemFemaleWornModelID2;
    RSString[] itemGroundOptions;
    RSString[] itemInventoryOptions;
    private short[] itemOriginalModelColors;
    private short[] itemModifiedModelColors;
    private short[] itemOriginalTextures;
    private short[] itemModifiedTextures;
    private byte[] aByteArray785;
    private boolean itemUnnoted;
    private int itemColorEquip1;
    private int itemColorEquip2 = -1;
    private int itemMaleWornModelID3;
    private int itemFemaleWornModelID3 = -1;
    private int itemMaleWornModelID4;
    private int itemFemaleWornModelID4 = -1;
    int anInt768;
    int itemType;
    int itemNoteID;
    int itemNoteTemplateID;
    int[] itemStackID;
    int[] itemStackAmount;
    private int anInt805;
    private int anInt780;
    private int anInt797;
    private int anInt784;
    private int anInt790;
    int itemTeamID = 0;
    int itemLendID;
    int itemLendTemplateID;
    private int wornModelPositionX = 0;
    private int wornModelPositionZ;
    private int wornModelPositionY;
    private int anInt777;
    private int anInt802;
    private int anInt752;
    int anInt767;
    int anInt758;
    int anInt788;
    int anInt756 = -1;
    HashTable aHashTable_798;
	/*
		End Opcode Values
	 */
    /**
     * Cache Information
     */
    static CacheIndex itemDefinitionIndex;
    static int itemDefinitionSize;
    static CacheIndex aClass153_2581;
    static ReferenceCache aReferenceCache_3572 = new ReferenceCache(64);
    /**
     * Unsorted
     */
    static int[] anIntArray2664;
    static RSString aClass94_672 = RSString.parse("null");


    static ItemDefinition getItemDefinition(int itemId) {
        try {
            ItemDefinition itemDefinition = (ItemDefinition) aReferenceCache_3572.get(itemId);
            if (itemDefinition == null) {
                byte[] buffer = itemDefinitionIndex.getFile(itemId >>> 8, 255 & itemId);
                itemDefinition = new ItemDefinition();
                itemDefinition.itemId = itemId;
                if (buffer != null) {
                    itemDefinition.parseDefinitions(new DataBuffer(buffer));
                }
                if (itemDefinition.itemNoteTemplateID != -1) {
                    itemDefinition.itemToNoteTransfer(getItemDefinition(itemDefinition.itemNoteID), getItemDefinition(itemDefinition.itemNoteTemplateID));
                }
                if (itemDefinition.itemLendTemplateID != -1) {
                    itemDefinition.itemLendDefinitionTransfer(getItemDefinition(itemDefinition.itemLendID), getItemDefinition(itemDefinition.itemLendTemplateID));
                }
                if (!Class139.aBoolean1827 && itemDefinition.itemMembersOnly) {
                    itemDefinition.itemName = TextCore.MembersObject;
                    itemDefinition.itemTeamID = 0;
                    itemDefinition.itemInventoryOptions = ClientErrorException.aClass94Array2119;
                    itemDefinition.itemUnnoted = false;
                    itemDefinition.itemGroundOptions = Unsorted.aClass94Array2596;
                }

                aReferenceCache_3572.put(itemDefinition, itemId);
            }
            return itemDefinition;
        } catch (RuntimeException var4) {
            throw ClientErrorException.clientError(var4, "fk.F(" + itemId + ')');
        }
    }

    final void parseDefinitions(DataBuffer buffer) {
        try {
            while (true) {
                int opcode = buffer.readUnsignedByte();
                if (0 == opcode) {

                    return;
                }
                this.parseOpcode(buffer, opcode);
            }
        } catch (RuntimeException var4) {
            throw ClientErrorException.clientError(var4, "h.M(" + 1 + ',' + (buffer != null ? "{...}" : "null") + ')');
        }
    }

    private void parseOpcode(DataBuffer buffer, int opcode) {
        try {
            int var5;
            int var6;
            switch (opcode) {
                case 1:
                    this.itemInterfaceModelId = buffer.readUnsignedShort();
                    break;
                case 2:
                    this.itemName = buffer.readString();
                    break;
                case 4:
                    this.itemModelZoom = buffer.readUnsignedShort();
                    break;
                case 5:
                    this.itemModelRotationY = buffer.readUnsignedShort();
                    break;
                case 6:
                    this.itemModelRotationX = buffer.readUnsignedShort();
                    break;
                case 7:
                    this.itemModelOffsetX = buffer.readUnsignedShort();
                    if (this.itemModelOffsetX > 32767) {
                        this.itemModelOffsetX -= 65536;
                    }
                    break;
                case 8:
                    this.itemModelOffsetY = buffer.readUnsignedShort();
                    if (this.itemModelOffsetY > 32767) {
                        this.itemModelOffsetY -= 65536;
                    }
                    break;
                case 11:
                    this.itemStackable = 1;
                    break;
                case 12:
                    this.itemValue = buffer.readInt();
                    break;
                case 16:
                    this.itemMembersOnly = true;
                    break;
                case 23:
                    this.itemMaleWornModelID1 = buffer.readUnsignedShort();
                    break;
                case 24:
                    this.itemFemaleWornModelID1 = buffer.readUnsignedShort();
                    break;
                case 25:
                    this.itemMaleWornModelID2 = buffer.readUnsignedShort();
                    break;
                case 26:
                    this.itemFemaleWornModelID2 = buffer.readUnsignedShort();
                    break;
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                    this.itemGroundOptions[-30 + opcode] = buffer.readString();
                    if (this.itemGroundOptions[opcode + -30].equalsStringIgnoreCase(TextCore.HasHidden)) {
                        this.itemGroundOptions[-30 + opcode] = null;
                    }
                    break;
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                    this.itemInventoryOptions[-35 + opcode] = buffer.readString();
                    break;
                case 40:
                    var5 = buffer.readUnsignedByte();
                    this.itemOriginalModelColors = new short[var5];
                    this.itemModifiedModelColors = new short[var5];

                    for (var6 = 0; var5 > var6; ++var6) {
                        this.itemModifiedModelColors[var6] = (short) buffer.readUnsignedShort();
                        this.itemOriginalModelColors[var6] = (short) buffer.readUnsignedShort();
                    }
                    break;
                case 41:
                    var5 = buffer.readUnsignedByte();
                    this.itemOriginalTextures = new short[var5];
                    this.itemModifiedTextures = new short[var5];

                    for (var6 = 0; var6 < var5; ++var6) {
                        this.itemModifiedTextures[var6] = (short) buffer.readUnsignedShort();
                        this.itemOriginalTextures[var6] = (short) buffer.readUnsignedShort();
                    }
                    break;
                case 42:
                    var5 = buffer.readUnsignedByte();
                    this.aByteArray785 = new byte[var5];

                    for (var6 = 0; var5 > var6; ++var6) {
                        this.aByteArray785[var6] = buffer.readSignedByte();
                    }
                    break;
                case 65:
                    this.itemUnnoted = true;
                    break;
                case 78:
                    this.itemColorEquip1 = buffer.readUnsignedShort();
                    break;
                case 79:
                    this.itemColorEquip2 = buffer.readUnsignedShort();
                    break;
                case 90:
                    this.itemMaleWornModelID3 = buffer.readUnsignedShort();
                    break;
                case 91:
                    this.itemFemaleWornModelID3 = buffer.readUnsignedShort();
                    break;
                case 92:
                    this.itemMaleWornModelID4 = buffer.readUnsignedShort();
                    break;
                case 93:
                    this.itemFemaleWornModelID4 = buffer.readUnsignedShort();
                    break;
                case 95:
                    this.anInt768 = buffer.readUnsignedShort();
                    break;
                case 96:
                    this.itemType = buffer.readUnsignedByte();
                    break;
                case 97:
                    this.itemNoteID = buffer.readUnsignedShort();
                    break;
                case 98:
                    this.itemNoteTemplateID = buffer.readUnsignedShort();
                    break;
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                case 109:
                    if (null == this.itemStackID) {
                        this.itemStackID = new int[10];
                        this.itemStackAmount = new int[10];
                    }

                    this.itemStackID[-100 + opcode] = buffer.readUnsignedShort();
                    this.itemStackAmount[opcode + -100] = buffer.readUnsignedShort();
                    break;
                case 110:
                    this.anInt805 = buffer.readUnsignedShort();
                    break;
                case 111:
                    this.anInt780 = buffer.readUnsignedShort();
                    break;
                case 112:
                    this.anInt797 = buffer.readUnsignedShort();
                    break;
                case 113:
                    this.anInt784 = buffer.readSignedByte();
                    break;
                case 114:
                    this.anInt790 = 5 * buffer.readSignedByte();
                    break;
                case 115:
                    this.itemTeamID = buffer.readUnsignedByte();
                    break;
                case 121:
                    this.itemLendID = buffer.readUnsignedShort();
                    break;
                case 122:
                    this.itemLendTemplateID = buffer.readUnsignedShort();
                    break;
                case 125:
                    this.wornModelPositionX = buffer.readSignedByte();
                    this.wornModelPositionZ = buffer.readSignedByte();
                    this.wornModelPositionY = buffer.readSignedByte();
                    break;
                case 126:
                    this.anInt777 = buffer.readSignedByte();
                    this.anInt802 = buffer.readSignedByte();
                    this.anInt752 = buffer.readSignedByte();
                    break;
                case 127:
                    this.anInt767 = buffer.readUnsignedByte();
                    this.anInt758 = buffer.readUnsignedShort();
                    break;
                case 128:
                    this.anInt788 = buffer.readUnsignedByte();
                    this.anInt756 = buffer.readUnsignedShort();
                    break;
                case 129:
                case 130:
                    buffer.readUnsignedByte();
                    buffer.readUnsignedShort();
                    break;
                case 249:
                    var5 = buffer.readUnsignedByte();
                    if (null == this.aHashTable_798) {
                        var6 = Class95.method1585((byte) 97, var5);
                        this.aHashTable_798 = new HashTable(var6);
                    }
                    for (var6 = 0; var6 < var5; ++var6) {
                        boolean var7 = buffer.readUnsignedByte() == 1;
                        int var8 = buffer.readMedium();
                        Object var9;
                        if (var7) {
                            var9 = new LinkableRSString(buffer.readString());
                        } else {
                            var9 = new LinkableInt(buffer.readInt());
                        }

                        this.aHashTable_798.put((long) var8, (Linkable) var9);
                    }
            }
        } catch (RuntimeException var10) {
            throw ClientErrorException.clientError(var10, "h.Q(" + (byte) -72 + ',' + (buffer != null ? "{...}" : "null") + ',' + opcode + ')');
        }
    }

    static void method1480(boolean itemNoted, RSString itemName) {
        try {
            short[] var3 = new short[16];
            itemName = itemName.toLowercase();
            int var4 = 0;
            for (int var5 = 0; itemDefinitionSize > var5; ++var5) {
                ItemDefinition itemdefinition = getItemDefinition(var5);
                if ((!itemNoted || itemdefinition.itemUnnoted) && itemdefinition.itemNoteTemplateID == -1 && -1 == itemdefinition.itemLendTemplateID && itemdefinition.itemType == 0 && itemdefinition.itemName.toLowercase().indexOf(itemName, 116) != -1) {
                    if (var4 >= 250) {
                        Class99.aShortArray1398 = null;
                        Unsorted.anInt952 = -1;
                        return;
                    }
                    if (var3.length <= var4) {
                        short[] var7 = new short[2 * var3.length];
                        System.arraycopy(var3, 0, var7, 0, var4);
                        var3 = var7;
                    }
                    var3[var4++] = (short) var5;
                }
            }

            Class99.aShortArray1398 = var3;
            Class140_Sub4.anInt2756 = 0;
            Unsorted.anInt952 = var4;
            RSString[] var10 = new RSString[Unsorted.anInt952];

            for (int var11 = 0; Unsorted.anInt952 > var11; ++var11) {
                var10[var11] = getItemDefinition(var3[var11]).itemName;
            }

            Class3_Sub13_Sub29.method307(var10, Class99.aShortArray1398, 77);
        } catch (RuntimeException var9) {
            throw ClientErrorException.clientError(var9, "me.J(" + itemNoted + ',' + (itemName != null ? "{...}" : "null") + ',' + 102 + ')');
        }
    }

    static void method968() {
        try {
            int[] itemDefinitionArray = new int[itemDefinitionSize];
            int length = 0;
            int itemID;
            for (itemID = 0; itemDefinitionSize > itemID; ++itemID) {
                ItemDefinition itemdefinition = getItemDefinition(itemID);
                if (itemdefinition.itemMaleWornModelID1 >= 0 || itemdefinition.itemMaleWornModelID2 >= 0) {
                    itemDefinitionArray[length++] = itemID;
                }
            }
            anIntArray2664 = new int[length];
            for (itemID = 0; itemID < length; ++itemID) {
                anIntArray2664[itemID] = itemDefinitionArray[itemID];
            }
        } catch (RuntimeException var5) {
            throw ClientErrorException.clientError(var5, "eh.A(" + ')');
        }
    }

    final boolean method1102(boolean var1) {
        try {
            int var3 = this.itemMaleWornModelID3;
            int var4 = this.itemMaleWornModelID4;
            if (var1) {
                var3 = this.itemFemaleWornModelID3;
                var4 = this.itemFemaleWornModelID4;
            }
            if (var3 == -1) {
                return true;
            } else {
                boolean var5 = true;
                if (!aClass153_2581.method2129((byte) -75, 0, var3)) {
                    var5 = false;
                }

                if (var4 != -1 && !aClass153_2581.method2129((byte) 58, 0, var4)) {
                    var5 = false;
                }

                return var5;
            }
        } catch (RuntimeException var6) {
            throw ClientErrorException.clientError(var6, "h.G(" + var1 + ',' + false + ')');
        }
    }

    public RSString method1105(RSString var2, int var3) {
        try {
            if (this.aHashTable_798 == null) {
                return var2;
            } else {
                LinkableRSString var4 = (LinkableRSString) this.aHashTable_798.get(var3);
                return null != var4 ? var4.value : var2;
            }
        } catch (RuntimeException var5) {
            throw ClientErrorException.clientError(var5, "h.S(" + 107 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
        }
    }


    final ItemDefinition method1106(int var1) {
        try {
            if (this.itemStackID != null && var1 > 1) {
                int var4 = -1;

                for (int var5 = 0; 10 > var5; ++var5) {
                    if (this.itemStackAmount[var5] <= var1 && this.itemStackAmount[var5] != 0) {
                        var4 = this.itemStackID[var5];
                    }
                }

                if (var4 != -1) {
                    return getItemDefinition(var4);
                }
            }

            return this;
        } catch (RuntimeException var6) {
            throw ClientErrorException.clientError(var6, "h.H(" + var1 + ',' + 78 + ')');
        }
    }

    final boolean method1108(boolean var2) {
        try {
            int var4 = this.itemFemaleWornModelID1;
            int var3 = this.itemMaleWornModelID1;
            int var5 = this.itemColorEquip1;
            if (var2) {
                var5 = this.itemColorEquip2;
                var3 = this.itemMaleWornModelID2;
                var4 = this.itemFemaleWornModelID2;
            }

            if (var3 == -1) {
                return true;
            } else {
                boolean var7 = true;
                if (!aClass153_2581.method2129((byte) -90, 0, var3)) {
                    var7 = false;
                }

                if (var4 != -1 && !aClass153_2581.method2129((byte) -114, 0, var4)) {
                    var7 = false;
                }

                if (-1 != var5 && !aClass153_2581.method2129((byte) 83, 0, var5)) {
                    var7 = false;
                }

                return var7;
            }
        } catch (RuntimeException var8) {
            throw ClientErrorException.clientError(var8, "h.C(" + (byte) 95 + ',' + var2 + ')');
        }
    }

    final void itemLendDefinitionTransfer(ItemDefinition var2, ItemDefinition var3) {
        try {
            this.aByteArray785 = var2.aByteArray785;
            this.wornModelPositionZ = var2.wornModelPositionZ;
            this.aHashTable_798 = var2.aHashTable_798;
            this.itemColorEquip1 = var2.itemColorEquip1;
            this.itemMaleWornModelID2 = var2.itemMaleWornModelID2;
            this.wornModelPositionY = var2.wornModelPositionY;
            this.itemInventoryOptions = new RSString[5];
            this.itemInterfaceModelId = var3.itemInterfaceModelId;
            this.itemModelZoom = var3.itemModelZoom;
            this.itemValue = 0;
            this.itemTeamID = var2.itemTeamID;
            this.itemFemaleWornModelID3 = var2.itemFemaleWornModelID3;
            this.itemModifiedModelColors = var2.itemModifiedModelColors;
            this.anInt768 = var3.anInt768;
            this.itemFemaleWornModelID1 = var2.itemFemaleWornModelID1;
            this.itemModelRotationX = var3.itemModelRotationX;
            this.itemMaleWornModelID3 = var2.itemMaleWornModelID3;
            this.itemMaleWornModelID4 = var2.itemMaleWornModelID4;
            this.wornModelPositionX = var2.wornModelPositionX;
            this.itemModelRotationY = var3.itemModelRotationY;
            this.itemModelOffsetY = var3.itemModelOffsetY;
            this.itemFemaleWornModelID4 = var2.itemFemaleWornModelID4;
            this.anInt777 = var2.anInt777;
            this.itemOriginalModelColors = var2.itemOriginalModelColors;
            this.anInt802 = var2.anInt802;
            this.anInt752 = var2.anInt752;
            this.itemModelOffsetX = var3.itemModelOffsetX;
            this.itemMaleWornModelID1 = var2.itemMaleWornModelID1;
            this.itemFemaleWornModelID2 = var2.itemFemaleWornModelID2;
            this.itemName = var2.itemName;
            this.itemOriginalTextures = var2.itemOriginalTextures;
            this.itemModifiedTextures = var2.itemModifiedTextures;
            this.itemGroundOptions = var2.itemGroundOptions;
            this.itemMembersOnly = var2.itemMembersOnly;
            this.itemColorEquip2 = var2.itemColorEquip2;
            if (null != var2.itemInventoryOptions) {
                System.arraycopy(var2.itemInventoryOptions, 0, this.itemInventoryOptions, 0, 4);
            }

            this.itemInventoryOptions[4] = TextCore.HasDiscard;
        } catch (RuntimeException var5) {
            throw ClientErrorException.clientError(var5, "h.J(" + (byte) 69 + ',' + (var2 != null ? "{...}" : "null") + ',' + (var3 != null ? "{...}" : "null") + ')');
        }
    }

    final Model method1110(int var2, int var3, AnimationDefinition var4, int var5, int var6) {
        try {
            if (this.itemStackID != null && var5 > 1) {
                int var7 = -1;

                for (int var8 = 0; var8 < 10; ++var8) {
                    if (this.itemStackAmount[var8] <= var5 && this.itemStackAmount[var8] != 0) {
                        var7 = this.itemStackID[var8];
                    }
                }

                if (var7 != -1) {
                    return getItemDefinition(var7).method1110(var2, var3, var4, 1, var6);
                }
            }

            Model var11 = (Model) Class143.aReferenceCache_1874.get((long) this.itemId);
            if (var11 == null) {
                Model_Sub1 var12 = Model_Sub1.method2015(aClass153_2581, this.itemInterfaceModelId);
                if (null == var12) {
                    return null;
                }

                int var9;
                if (null != this.itemModifiedModelColors) {
                    for (var9 = 0; this.itemModifiedModelColors.length > var9; ++var9) {
                        if (null != this.aByteArray785 && this.aByteArray785.length > var9) {
                            var12.method2016(this.itemModifiedModelColors[var9], Class3_Sub13_Sub38.aShortArray3453[this.aByteArray785[var9] & 255]);
                        } else {
                            var12.method2016(this.itemModifiedModelColors[var9], this.itemOriginalModelColors[var9]);
                        }
                    }
                }

                if (this.itemModifiedTextures != null) {
                    for (var9 = 0; var9 < this.itemModifiedTextures.length; ++var9) {
                        var12.method1998(this.itemModifiedTextures[var9], this.itemOriginalTextures[var9]);
                    }
                }

                var11 = var12.method2008(this.anInt784 + 64, 768 + this.anInt790, -50, -10, -50);
                if (this.anInt805 != 128 || this.anInt780 != 128 || this.anInt797 != 128) {
                    var11.resize(this.anInt805, this.anInt780, this.anInt797);
                }

                var11.aBoolean2699 = true;
                if (HDToolKit.highDetail) {
                    ((Class140_Sub1_Sub1) var11).method1920(false, false, false, false, false, true);
                }

                Class143.aReferenceCache_1874.put(var11, (long) this.itemId);
            }

            if (var4 != null) {
                var11 = var4.method2055(var11, (byte) -88, var2, var3, var6);
            }

            return var11;
        } catch (RuntimeException var10) {
            throw ClientErrorException.clientError(var10, "h.E(" + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ',' + var5 + ',' + var6 + ')');
        }
    }

    final int method1115(int var1, int var2, int var3) {
        try {
            if (this.aHashTable_798 == null) {
                return var1;
            } else {
                LinkableInt var5 = (LinkableInt) this.aHashTable_798.get(var3);
                return null != var5 ? var5.value : var1;
            }
        } catch (RuntimeException var6) {
            throw ClientErrorException.clientError(var6, "h.I(" + var1 + ',' + var2 + ',' + var3 + ')');
        }
    }

    final Model_Sub1 method1116(boolean var1) {
        try {
            int var4 = this.itemMaleWornModelID4;
            int var3 = this.itemMaleWornModelID3;
            if (var1) {
                var4 = this.itemFemaleWornModelID4;
                var3 = this.itemFemaleWornModelID3;
            }

            if (-1 == var3) {
                return null;
            } else {
                Model_Sub1 var5 = Model_Sub1.method2015(aClass153_2581, var3);
                if (-1 != var4) {
                    Model_Sub1 var6 = Model_Sub1.method2015(aClass153_2581, var4);
                    Model_Sub1[] var7 = new Model_Sub1[]{var5, var6};
                    var5 = new Model_Sub1(var7, 2);
                }

                int var9;
                if (this.itemModifiedModelColors != null) {
                    for (var9 = 0; var9 < this.itemModifiedModelColors.length; ++var9) {
                        Objects.requireNonNull(var5).method2016(this.itemModifiedModelColors[var9], this.itemOriginalModelColors[var9]);
                    }
                }

                if (this.itemModifiedTextures != null) {
                    for (var9 = 0; var9 < this.itemModifiedTextures.length; ++var9) {
                        Objects.requireNonNull(var5).method1998(this.itemModifiedTextures[var9], this.itemOriginalTextures[var9]);
                    }
                }

                return var5;
            }
        } catch (RuntimeException var8) {
            throw ClientErrorException.clientError(var8, "h.A(" + var1 + ',' + (byte) -109 + ')');
        }
    }

    final Model_Sub1 method1117(boolean var1) {
        try {
            int var3 = this.itemMaleWornModelID1;
            int var4 = this.itemFemaleWornModelID1;
            int var5 = this.itemColorEquip1;
            if (var1) {
                var5 = this.itemColorEquip2;
                var3 = this.itemMaleWornModelID2;
                var4 = this.itemFemaleWornModelID2;
            }
            if (var3 == -1) {
                return null;
            } else {
                Model_Sub1 var6 = Model_Sub1.method2015(aClass153_2581, var3);
                if (var4 != -1) {
                    Model_Sub1 var7 = Model_Sub1.method2015(aClass153_2581, var4);
                    if (-1 == var5) {
                        Model_Sub1[] var8 = new Model_Sub1[]{var6, var7};
                        var6 = new Model_Sub1(var8, 2);
                    } else {
                        Model_Sub1 var12 = Model_Sub1.method2015(aClass153_2581, var5);
                        Model_Sub1[] var9 = new Model_Sub1[]{var6, var7, var12};
                        var6 = new Model_Sub1(var9, 3);
                    }
                }
                if (!var1 && (this.wornModelPositionX != 0 || this.wornModelPositionZ != 0 || this.wornModelPositionY != 0)) {
                    Objects.requireNonNull(var6).method2001(this.wornModelPositionX, this.wornModelPositionZ, this.wornModelPositionY);
                }
                if (var1 && (this.anInt777 != 0 || this.anInt802 != 0 || this.anInt752 != 0)) {
                    Objects.requireNonNull(var6).method2001(this.anInt777, this.anInt802, this.anInt752);
                }

                int var11;
                if (this.itemModifiedModelColors != null) {
                    for (var11 = 0; var11 < this.itemModifiedModelColors.length; ++var11) {
                        Objects.requireNonNull(var6).method2016(this.itemModifiedModelColors[var11], this.itemOriginalModelColors[var11]);
                    }
                }

                if (this.itemModifiedTextures != null) {
                    for (var11 = 0; var11 < this.itemModifiedTextures.length; ++var11) {
                        Objects.requireNonNull(var6).method1998(this.itemModifiedTextures[var11], this.itemOriginalTextures[var11]);
                    }
                }

                return var6;
            }
        } catch (RuntimeException var10) {
            throw ClientErrorException.clientError(var10, "h.D(" + var1 + ',' + 80 + ')');
        }
    }

    final void itemToNoteTransfer(ItemDefinition var1, ItemDefinition var2) {
        try {
            this.itemName = var1.itemName;
            this.itemModelZoom = var2.itemModelZoom;
            this.itemModifiedModelColors = var2.itemModifiedModelColors;
            this.itemOriginalModelColors = var2.itemOriginalModelColors;
            this.itemModelRotationY = var2.itemModelRotationY;
            this.itemModelRotationX = var2.itemModelRotationX;
            this.itemOriginalTextures = var2.itemOriginalTextures;
            this.itemInterfaceModelId = var2.itemInterfaceModelId;
            this.aByteArray785 = var2.aByteArray785;
            this.anInt768 = var2.anInt768;
            this.itemValue = var1.itemValue;
            this.itemStackable = 1;
            this.itemModelOffsetY = var2.itemModelOffsetY;
            this.itemModelOffsetX = var2.itemModelOffsetX;
            this.itemModifiedTextures = var2.itemModifiedTextures;
            this.itemMembersOnly = var1.itemMembersOnly;
        } catch (RuntimeException var5) {
            throw ClientErrorException.clientError(var5, "h.N(" + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ',' + false + ')');
        }
    }

    final Class140_Sub1_Sub2 method1120() {
        try {
            Model_Sub1 var2 = Model_Sub1.method2015(aClass153_2581, this.itemInterfaceModelId);
            if (var2 == null) {
                return null;
            } else {
                int var3;
                if (this.itemModifiedModelColors != null) {
                    for (var3 = 0; this.itemModifiedModelColors.length > var3; ++var3) {
                        if (null != this.aByteArray785 && this.aByteArray785.length > var3) {
                            var2.method2016(this.itemModifiedModelColors[var3], Class3_Sub13_Sub38.aShortArray3453[this.aByteArray785[var3] & 255]);
                        } else {
                            var2.method2016(this.itemModifiedModelColors[var3], this.itemOriginalModelColors[var3]);
                        }
                    }
                }

                if (this.itemModifiedTextures != null) {
                    for (var3 = 0; var3 < this.itemModifiedTextures.length; ++var3) {
                        var2.method1998(this.itemModifiedTextures[var3], this.itemOriginalTextures[var3]);
                    }
                }

                Class140_Sub1_Sub2 var5 = var2.method2000(64 - -this.anInt784, 768 - -this.anInt790);

                if (this.anInt805 != 128 || this.anInt780 != 128 || this.anInt797 != 128) {
                    var5.resize(this.anInt805, this.anInt780, this.anInt797);
                }

                return var5;
            }
        } catch (RuntimeException var4) {
            throw ClientErrorException.clientError(var4, "h.L(" + 18206 + ')');
        }
    }

    public ItemDefinition() {
        this.itemName = aClass94_672;
        this.itemModelZoom = 2000;
        this.itemModelRotationY = 0;
        this.itemModelRotationX = 0;
        this.itemModelOffsetX = 0;
        this.itemModelOffsetY = 0;
        this.itemStackable = 0;
        this.itemMembersOnly = false;
        this.itemMaleWornModelID1 = -1;
        this.itemFemaleWornModelID1 = -1;
        this.itemMaleWornModelID2 = -1;
        this.itemFemaleWornModelID2 = -1;
        this.itemGroundOptions = new RSString[]{null, null, TextCore.HasTake, null, null};
        this.itemInventoryOptions = new RSString[]{null, null, null, null, TextCore.HasDrop};
        this.itemUnnoted = false;
        this.itemColorEquip1 = -1;
        this.itemMaleWornModelID3 = -1;
        this.itemMaleWornModelID4 = -1;
        this.anInt768 = 0;
        this.itemType = 0;
        this.itemNoteID = -1;
        this.itemNoteTemplateID = -1;
        this.anInt805 = 128;
        this.anInt780 = 128;
        this.anInt797 = 128;
        this.anInt784 = 0;
        this.anInt790 = 0;
        this.itemLendID = -1;
        this.itemLendTemplateID = -1;
        this.wornModelPositionX = 0;
        this.wornModelPositionZ = 0;
        this.wornModelPositionY = 0;
        this.anInt777 = 0;
        this.anInt802 = 0;
        this.anInt752 = 0;
        this.anInt767 = -1;
        this.anInt758 = -1;
        this.anInt788 = -1;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var2 = 1 + var1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            int var4 = var0 / 4;
            PacketParser.anIntArray781[var1] = var4;
        }
    }

    public int getShiftClickActionIndex() {
        return (itemInventoryOptions != null)
                ? ("Drop".equalsIgnoreCase(itemInventoryOptions[4].toString()) ? 4 : -1) : -1;
    }
}
