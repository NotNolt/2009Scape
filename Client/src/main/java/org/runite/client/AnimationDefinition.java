package org.runite.client;


import org.rs09.client.data.ReferenceCache;

public final class AnimationDefinition {

    /**
     * Values used for Animation Definition Information
     */
    int animationId;
    /*
        Start Opcode Values
    */
    int[] duration;
    int[] frames;
    int[] soundMinDelay;
    int[] soundMaxDelay;
    int[] anIntArray1362;
    int anInt1865 = -1;
    boolean[] aBooleanArray1855;
    boolean aBoolean1859 = false;
    int anInt1857 = 5;
    int anInt1854 = -1;
    int anInt1849 = -1;
    int anInt1861 = 99;
    int anInt1866 = -1;
    int anInt1850 = -1;
    int anInt1845 = 2;
    private int[] anIntArray1870;
    int[][] anIntArrayArray1867;
    boolean aBoolean1848 = false;
    boolean aBoolean1846 = false;
    boolean aBoolean1872 = false;
    boolean effect2Sound;
	/*
		End Opcode Values
	 */
    /**
     * Cache Information
     */
    static ReferenceCache aReferenceCache_1146 = new ReferenceCache(64);
    static CacheIndex animationDefinitionIndex;


    static AnimationDefinition getAnimationDefinition(int animationId) {
        try {
            AnimationDefinition animationDefinition = (AnimationDefinition) aReferenceCache_1146.get(animationId);
            if (animationDefinition == null) {
                byte[] buffer = animationDefinitionIndex.getFile(animationId >>> 7, animationId & 127);
                animationDefinition = new AnimationDefinition();
                animationDefinition.animationId = animationId;
                if (buffer != null) {
                    animationDefinition.parseDefinitions(new DataBuffer(buffer));
                }
                animationDefinition.method2058();
                aReferenceCache_1146.put(animationDefinition, animationId);
            }
            return animationDefinition;
        } catch (RuntimeException var4) {
            throw ClientErrorException.clientError(var4, "client.D(" + animationId + ',' + (byte) -20 + ')');
        }
    }

    final void parseDefinitions(DataBuffer buffer) {
        try {
            while (true) {
                int opcode = buffer.readUnsignedByte();
                if (opcode == 0) {
                    return;
                }
                this.parseOpcode(opcode, buffer);
            }
        } catch (RuntimeException var4) {
            throw ClientErrorException.clientError(var4, "tk.I(" + (buffer != null ? "{...}" : "null") + ',' + (byte) -102 + ')');
        }
    }

    private void parseOpcode(int opcode, DataBuffer buffer) {
        try {
            int var4;
            int var5;
            switch (opcode) {
                case 1:
                    var4 = buffer.readUnsignedShort();
                    this.duration = new int[var4];
                    for (var5 = 0; var4 > var5; ++var5) {
                        this.duration[var5] = buffer.readUnsignedShort();
                    }
                    this.frames = new int[var4];
                    for (var5 = 0; var4 > var5; ++var5) {
                        this.frames[var5] = buffer.readUnsignedShort();
                    }
                    for (var5 = 0; var4 > var5; ++var5) {
                        this.frames[var5] += buffer.readUnsignedShort() << 16;
                    }
                    break;
                case 2:
                    this.anInt1865 = buffer.readUnsignedShort();
                    break;
                case 3:
                    this.aBooleanArray1855 = new boolean[256];
                    var4 = buffer.readUnsignedByte();

                    for (var5 = 0; var5 < var4; ++var5) {
                        this.aBooleanArray1855[buffer.readUnsignedByte()] = true;
                    }
                    break;
                case 4:
                    this.aBoolean1859 = true;
                    break;
                case 5:
                    this.anInt1857 = buffer.readUnsignedByte();
                    break;
                case 6:
                    this.anInt1854 = buffer.readUnsignedShort();
                    break;
                case 7:
                    this.anInt1849 = buffer.readUnsignedShort();
                    break;
                case 8:
                    this.anInt1861 = buffer.readUnsignedByte();
                    break;
                case 9:
                    this.anInt1866 = buffer.readUnsignedByte();
                    break;
                case 10:
                    this.anInt1850 = buffer.readUnsignedByte();
                    break;
                case 11:
                    this.anInt1845 = buffer.readUnsignedByte();
                    break;
                case 12:
                    var4 = buffer.readUnsignedByte();
                    this.anIntArray1870 = new int[var4];

                    for (var5 = 0; var5 < var4; ++var5) {
                        this.anIntArray1870[var5] = buffer.readUnsignedShort();
                    }

                    for (var5 = 0; var5 < var4; ++var5) {
                        this.anIntArray1870[var5] += buffer.readUnsignedShort() << 16;
                    }
                    break;
                case 13:
                    var4 = buffer.readUnsignedShort();
                    this.anIntArrayArray1867 = new int[var4][];

                    for (var5 = 0; var5 < var4; ++var5) {
                        int var6 = buffer.readUnsignedByte();
                        if (var6 > 0) {
                            this.anIntArrayArray1867[var5] = new int[var6];
                            this.anIntArrayArray1867[var5][0] = buffer.readMedium();

                            for (int var7 = 1; var7 < var6; ++var7) {
                                this.anIntArrayArray1867[var5][var7] = buffer.readUnsignedShort();
                            }
                        }
                    }
                    break;
                case 14:
                    this.aBoolean1848 = true;
                    break;
                case 15:
                    this.aBoolean1846 = true;
                    break;
                case 16:
                    this.aBoolean1872 = true;
                    break;
                case 17:
                    buffer.readSignedByte();
                    break;
                case 18:
                    this.effect2Sound = true;
                    break;
                case 19:
                    if (anIntArray1362 == null) {
                        anIntArray1362 = new int[anIntArrayArray1867.length];
                        for (int index = 0; index < anIntArrayArray1867.length; index++) {
                            anIntArray1362[index] = 255;
                        }
                    }
                    anIntArray1362[buffer.readUnsignedByte()] = buffer.readUnsignedByte();
                    break;
                case 20:
                    if ((soundMaxDelay == null) || (soundMinDelay == null)) {
                        soundMaxDelay = (new int[anIntArrayArray1867.length]);
                        soundMinDelay = (new int[anIntArrayArray1867.length]);
                        for (int i_34_ = 0; (i_34_ < anIntArrayArray1867.length); i_34_++) {
                            soundMaxDelay[i_34_] = 256;
                            soundMinDelay[i_34_] = 256;
                        }
                    }
                    int index = buffer.readUnsignedByte();
                    soundMaxDelay[index] = buffer.readSignedShort();
                    soundMinDelay[index] = buffer.readSignedShort();
                    break;
            }
        } catch (RuntimeException var8) {
            throw ClientErrorException.clientError(var8, "tk.H(" + opcode + ',' + (byte) -73 + ',' + (buffer != null ? "{...}" : "null") + ')');
        }
    }

    final Model method2054(int var2, int var3, Model var4, int var5, int var6) {
        try {
            int var7 = this.duration[var2];
            var2 = this.frames[var2];
            Class3_Sub28_Sub5 var8 = Class3_Sub9.method133(var2 >> 16);
            var2 &= '\uffff';
            if (var8 == null) {
                return var4.method1890(true, true, true);
            } else {
                var5 &= 3;
                Class3_Sub28_Sub5 var9 = null;

                if ((this.aBoolean1846 || ClientCommands.tweeningEnabled) && var3 != -1 && this.frames.length > var3) {
                    var3 = this.frames[var3];
                    var9 = Class3_Sub9.method133(var3 >> 16);
                    var3 &= '\uffff';
                }

                Model var10;
                if (var9 == null) {
                    var10 = var4.method1890(!var8.method559(var2), !var8.method561(var2, (byte) 121), !this.aBoolean1848);
                } else {
                    var10 = var4.method1890(!var8.method559(var2) & !var9.method559(var3), !var8.method561(var2, (byte) 125) & !var9.method561(var3, (byte) 118), !this.aBoolean1848);
                }

                if (HDToolKit.highDetail && this.aBoolean1848) {
                    if (var5 == 1) {
                        ((Class140_Sub1_Sub1) var10).method1902();
                    } else if (2 == var5) {
                        ((Class140_Sub1_Sub1) var10).method1911();
                    } else if (var5 == 3) {
                        ((Class140_Sub1_Sub1) var10).method1925();
                    }
                } else if (var5 == 1) {
                    var10.method1900();
                } else if (2 == var5) {
                    var10.method1874();
                } else if (3 == var5) {
                    var10.method1885();
                }

                var10.method1880(var8, var2, var9, var3, -1 + var6, var7, this.aBoolean1848);
                if (HDToolKit.highDetail && this.aBoolean1848) {
                    if (1 == var5) {
                        ((Class140_Sub1_Sub1) var10).method1925();
                    } else if (var5 == 2) {
                        ((Class140_Sub1_Sub1) var10).method1911();
                    } else if (var5 == 3) {
                        ((Class140_Sub1_Sub1) var10).method1902();
                    }
                } else if (var5 == 1) {
                    var10.method1885();
                } else if (var5 == 2) {
                    var10.method1874();
                } else if (var5 == 3) {
                    var10.method1900();
                }

                return var10;
            }
        } catch (RuntimeException var11) {
            throw ClientErrorException.clientError(var11, "tk.D(" + 19749 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ',' + var5 + ',' + var6 + ')');
        }
    }

    final Model method2055(Model var1, byte var2, int var3, int var4, int var5) {
        try {
            int var7 = this.frames[var5];
            int var6 = this.duration[var5];
            Class3_Sub28_Sub5 var8 = Class3_Sub9.method133(var7 >> 16);
            var7 &= '\uffff';
            if (null == var8) {
                return var1.method1894(true, true, true);
            } else {
                Class3_Sub28_Sub5 var9 = null;
                if ((this.aBoolean1846 || ClientCommands.tweeningEnabled) && var3 != -1 && this.frames.length > var3) {
                    var3 = this.frames[var3];
                    var9 = Class3_Sub9.method133(var3 >> 16);
                    var3 &= '\uffff';
                }

                Class3_Sub28_Sub5 var10 = null;
                Class3_Sub28_Sub5 var11 = null;
                int var13 = 0;
                int var14 = 0;
                if (null != this.anIntArray1870) {
                    if (var5 < this.anIntArray1870.length) {
                        var13 = this.anIntArray1870[var5];
                        if (var13 != 65535) {
                            var10 = Class3_Sub9.method133(var13 >> 16);
                            var13 &= '\uffff';
                        }
                    }

                    if ((this.aBoolean1846 || ClientCommands.tweeningEnabled) && -1 != var3 && this.anIntArray1870.length > var3) {
                        var14 = this.anIntArray1870[var3];
                        if (var14 != 65535) {
                            var11 = Class3_Sub9.method133(var14 >> 16);
                            var14 &= '\uffff';
                        }
                    }
                }

                boolean var15 = !var8.method559(var7);
                boolean var16 = !var8.method561(var7, (byte) 119);
                if (var10 != null) {
                    var15 &= !var10.method559(var13);
                    var16 &= !var10.method561(var13, (byte) 115);
                }

                if (null != var9) {
                    var15 &= !var9.method559(var3);
                    var16 &= !var9.method561(var3, (byte) 123);
                }

                if (null != var11) {
                    var15 &= !var11.method559(var14);
                    var16 &= !var11.method561(var14, (byte) 121);
                }

                Model var17 = var1.method1894(var15, var16, !this.aBoolean1848);
                var17.method1880(var8, var7, var9, var3, var4 - 1, var6, this.aBoolean1848);
                if (null != var10) {
                    var17.method1880(var10, var13, var11, var14, var4 + -1, var6, this.aBoolean1848);
                }

                return var17;
            }
        } catch (RuntimeException var18) {
            throw ClientErrorException.clientError(var18, "tk.E(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
        }
    }

    final Model method2056(int var1, int var2, int var3, int var4, Model var5) {
        try {
            int var7 = this.duration[var2];
            var2 = this.frames[var2];
            Class3_Sub28_Sub5 var8 = Class3_Sub9.method133(var2 >> 16);
            var2 &= '\uffff';
            if (null == var8) {
                return var5.method1894(true, true, true);
            } else {
                var4 &= 3;
                Class3_Sub28_Sub5 var9 = null;
                if ((this.aBoolean1846 || ClientCommands.tweeningEnabled) && var1 != -1 && this.frames.length > var1) {
                    var1 = this.frames[var1];
                    var9 = Class3_Sub9.method133(var1 >> 16);
                    var1 &= '\uffff';
                }
                Model var10;
                if (null == var9) {
                    var10 = var5.method1894(!var8.method559(var2), !var8.method561(var2, (byte) 123), !this.aBoolean1848);
                } else {
                    var10 = var5.method1894(!var8.method559(var2) & !var9.method559(var1), !var8.method561(var2, (byte) 125) & !var9.method561(var1, (byte) 123), !this.aBoolean1848);
                }
                if (this.aBoolean1848 && HDToolKit.highDetail) {
                    if (1 == var4) {
                        ((Class140_Sub1_Sub1) var10).method1902();
                    } else if (var4 == 2) {
                        ((Class140_Sub1_Sub1) var10).method1911();
                    } else if (var4 == 3) {
                        ((Class140_Sub1_Sub1) var10).method1925();
                    }
                } else if (var4 == 1) {
                    var10.method1900();
                } else if (var4 == 2) {
                    var10.method1874();
                } else if (var4 == 3) {
                    var10.method1885();
                }
                var10.method1880(var8, var2, var9, var1, var3 + -1, var7, this.aBoolean1848);
                if (this.aBoolean1848 && HDToolKit.highDetail) {
                    if (var4 == 1) {
                        ((Class140_Sub1_Sub1) var10).method1925();
                    } else if (var4 == 2) {
                        ((Class140_Sub1_Sub1) var10).method1911();
                    } else if (var4 == 3) {
                        ((Class140_Sub1_Sub1) var10).method1902();
                    }
                } else if (1 == var4) {
                    var10.method1885();
                } else if (var4 == 2) {
                    var10.method1874();
                } else if (3 == var4) {
                    var10.method1900();
                }
                return var10;
            }
        } catch (RuntimeException var11) {
            throw ClientErrorException.clientError(var11, "tk.B(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (var5 != null ? "{...}" : "null") + ',' + 3 + ')');
        }
    }

    final void method2058() {
        try {
            if (this.anInt1866 == -1) {
                if (null == this.aBooleanArray1855) {
                    this.anInt1866 = 0;
                } else {
                    this.anInt1866 = 2;
                }
            }
            if (-1 == this.anInt1850) {
                if (null == this.aBooleanArray1855) {
                    this.anInt1850 = 0;
                } else {
                    this.anInt1850 = 2;
                }
            }
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "tk.C(" + (byte) -41 + ')');
        }
    }

    final Model method2059(int var1, int var2, int var3, Model var5) {
        try {
            int var6 = this.duration[var3];
            var3 = this.frames[var3];
            Class3_Sub28_Sub5 var7 = Class3_Sub9.method133(var3 >> 16);
            var3 &= '\uffff';
            if (var7 == null) {
                return var5.method1882(true, true, true);
            } else {
                Class3_Sub28_Sub5 var9 = null;
                if ((this.aBoolean1846 || ClientCommands.tweeningEnabled) && var1 != -1 && var1 < this.frames.length) {
                    var1 = this.frames[var1];
                    var9 = Class3_Sub9.method133(var1 >> 16);
                    var1 &= '\uffff';
                }
                Model var10;
                if (null == var9) {
                    var10 = var5.method1882(!var7.method559(var3), !var7.method561(var3, (byte) 118), !this.aBoolean1848);
                } else {
                    var10 = var5.method1882(!var7.method559(var3) & !var9.method559(var1), !var7.method561(var3, (byte) 119) & !var9.method561(var1, (byte) 118), !this.aBoolean1848);
                }
                var10.method1880(var7, var3, var9, var1, var2 + -1, var6, this.aBoolean1848);
                return var10;
            }
        } catch (RuntimeException var11) {
            throw ClientErrorException.clientError(var11, "tk.G(" + var1 + ',' + var2 + ',' + var3 + ',' + (byte) -52 + ',' + (var5 != null ? "{...}" : "null") + ')');
        }
    }

}
