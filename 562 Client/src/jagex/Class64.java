package jagex;/* jagex.Class64 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class64
{
    public static int anInt808;
    public static String PlayerUsernameString = "";
    public static int[][][] anIntArrayArrayArray810;
    public static int anInt811 = 0;
    public static int anInt812;
    public static int anInt813;
    public static boolean aBoolean814;
    public static int anInt815;
    public static int anInt816 = 0;
    public static int anInt817;
    public static int anInt818;
    
    public static void method668(byte arg0) {
	try {
	    anIntArrayArrayArray810 = null;
	    PlayerUsernameString = null;
	    int i = 22 % ((-82 - arg0) / 39);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"gh.B(" + arg0 + ')');
	}
    }
    
    public static void method669(boolean arg0, Class23_Sub4_Sub1_Sub1 arg1) {
	try {
	    anInt808++;
	    if (Class147.anInt1946 < 400) {
		if (arg0)
		    method673(null);
		NPCDefinition NPCDefinition = arg1.aNPCDefinition_6474;
		if (NPCDefinition.anIntArray845 != null) {
		    NPCDefinition = NPCDefinition.method697(true);
		    if (NPCDefinition == null)
			return;
		}
		if (NPCDefinition.aBoolean841) {
		    String string = NPCDefinition.NPCName;
		    if (NPCDefinition.NPCStandAnimation != 0) {String string_0_ = (Class126.anInt1696 == 1 ? Class46.RatingString : Class1_Sub2.LevelString);
			string += ((Class100.PlayerLevelDifferenceMethod((byte) 51, NPCDefinition.NPCStandAnimation, (Class166.aClass23_Sub4_Sub1_Sub2_2216.anInt6515))) + " (" + (String) string_0_ + NPCDefinition.NPCStandAnimation + ")");
		    }
		    if (Class131_Sub1_Sub4.anInt5546 == 1) {
			Class144.anInt1912++;
			Class131_Sub31.UseWithMethod(Class218.anInt3200,(long) arg1.anInt5274, FileSystem.UseOptionString, -1, 0, (Class148.aString1979 + " -> <col=ffff00>" + string), 0, 23);
		    } else if (Class154.aBoolean2047) {
			Class131_Sub41_Sub16 class131_sub41_sub16 = (Class153.anInt2042 != -1 ? Class145.method2163(Class153.anInt2042, true) : null);
			if ((0x2 & Class193.anInt2839) != 0) {
			    if (class131_sub41_sub16 == null || (class131_sub41_sub16.anInt6374 != NPCDefinition.method692(Class153.anInt2042, (class131_sub41_sub16.anInt6374), 74))) {
				Class131_Sub31.UseWithMethod(Class131_Sub41_Sub21.anInt6447,(long) arg1.anInt5274, Class131_Sub41_Sub2.DefaultNullString, -1, 0, (GraphicDefinition.aString1453 + " -> <col=ffff00>" + string), 0, 13);
				Class165.anInt2202++;
			    }
			}
		    } else {
			String[] strings = NPCDefinition.NPCOption;
			if (Class131_Sub2_Sub1.aBoolean5565)
			    strings = Class98.method867(strings, (byte) 122);
			if (strings != null) {
			    for (int i = 4; i >= 0; i--) {
				if (strings[i] != null && (Class126.anInt1696 != 0 || !(strings[i].equalsIgnoreCase(Class180.AttackString)))) {
				    int i_1_ = 0;
				    int i_2_ = InputStream_Sub1.anInt57;
				    if (i == 0)
					i_1_ = 43;
				    if (i == 1)
					i_1_ = 8;
				    if (i == 2)
					i_1_ = 41;
				    if (i == 3)
					i_1_ = 14;
				    if (i == 4)
					i_1_ = 1;
				    if (NPCDefinition.anInt833 == i)
					i_2_ = NPCDefinition.anInt874;
				    if (NPCDefinition.anInt837 == i)
					i_2_ = NPCDefinition.anInt889;
				    Class131_Sub31.UseWithMethod(i_2_, (long) arg1.anInt5274, strings[i], -1, 0, "<col=ffff00>" + string, 0, i_1_);
				    Class131_Sub31.anInt4526++;
				}
			    }
			}
			if (Class126.anInt1696 == 0 && strings != null) {
			    for (int i = 4; i >= 0; i--) {
				if (strings[i] != null && (strings[i].equalsIgnoreCase(Class180.AttackString))) {
				    short i_3_ = 0;
				    if (NPCDefinition.NPCStandAnimation > (Class166.aClass23_Sub4_Sub1_Sub2_2216.anInt6515))
					i_3_ = (short) 2000;
				    short i_4_ = 0;
				    if (i == 0)
					i_4_ = (short) 43;
				    if (i == 1)
					i_4_ = (short) 8;
				    if (i == 2)
					i_4_ = (short) 41;
				    if (i == 3)
					i_4_ = (short) 14;
				    if (i == 4)
					i_4_ = (short) 1;
				    if (i_4_ != 0)
					i_4_ += i_3_;
				    Class41.anInt542++;
				    Class131_Sub31.UseWithMethod
					(NPCDefinition.anInt872,(long) arg1.anInt5274, strings[i], -1, 0, "<col=ffff00>" + string, 0, i_4_);
				}
			    }
			}
			Class142.anInt1888++;
			Class131_Sub31.UseWithMethod((Class131_Sub2_Sub22
						   .anInt5862),
						  (long) arg1.anInt5274,
						  Class131_Sub19.ExamineString,
						  -1, 0,
						  "<col=ffff00>" + string, 0,
						  1008);
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gh.F(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method670(int arg0, Class23_Sub4_Sub1 arg1) {
	try {
	    if (arg0 == 1) {
		anInt815++;
		if (arg1 instanceof Class23_Sub4_Sub1_Sub1) {
		    Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
			= (Class23_Sub4_Sub1_Sub1) arg1;
		    if (class23_sub4_sub1_sub1.aNPCDefinition_6474 != null)
			method669(false, class23_sub4_sub1_sub1);
		} else if (arg1 instanceof Player)
		    Class182.method2535((Player) arg1, 2223);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gh.C(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method671(int arg0, FileSystem arg1) {
	try {
	    anInt812++;
	    if (arg0 >= -43)
		PlayerUsernameString = null;
	    OutputStream_Sub1.aClass158_67 = arg1;
	    Class23_Sub1_Sub2.anInt5156
		= OutputStream_Sub1.aClass158_67.method2368(15, (byte) -72);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gh.G(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static int method672(int arg0, int arg1, byte[] arg2, int arg3) {
	try {
	    anInt817++;
	    if (arg0 != -5)
		return -40;
	    int i = -1;
	    for (int i_5_ = arg3; i_5_ < arg1;
             i_5_++)
		i = (Class131_Sub7.anIntArray4169[0xff & (arg2[i_5_] ^ i)]
		     ^ i >>> 38952072);
	    i ^= 0xffffffff;
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gh.D(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ',' + arg3 + ')'));
	}
    }
    
    public static void method673(Class131_Sub8_Sub1 arg0) {
	if (Class172.anInt2293 < 255) {
	    Class131_Sub2_Sub11.aClass131_Sub8_Sub1Array5707[(Class172
							      .anInt2293)]
		= arg0;
	    GraphicDefinition.aBooleanArray1441[Class172.anInt2293] = false;
	    Class172.anInt2293++;
	    int i = arg0.anInt6095;
	    if (arg0.aBoolean6103)
		i = 0;
	    int i_6_ = arg0.anInt6095;
	    if (arg0.aBoolean6092)
		i_6_ = Class133.anInt1805 - 1;
	    for (int i_7_ = i; i_7_ <= i_6_; i_7_++) {
		int i_8_ = 0;
		int i_9_ = arg0.anInt4191 - arg0.anInt4192 + 64 >> 7;
		if (i_9_ < 0) {
		    i_8_ -= i_9_;
		    i_9_ = 0;
		}
		int i_10_ = arg0.anInt4191 + arg0.anInt4192 - 64 >> 7;
		if (i_10_ >= Class131_Sub8_Sub1.anInt6099)
		    i_10_ = Class131_Sub8_Sub1.anInt6099 - 1;
		for (int i_11_ = i_9_; i_11_ <= i_10_; i_11_++) {
		    int i_12_ = arg0.aShortArray6104[i_8_++];
		    int i_13_ = ((arg0.anInt4195 - arg0.anInt4192 + 64 >> 7)
				 + (i_12_ >>> 8));
		    int i_14_ = i_13_ + (i_12_ & 0xff) - 1;
		    if (i_13_ < 0)
			i_13_ = 0;
		    if (i_14_ >= Class210.anInt3068)
			i_14_ = Class210.anInt3068 - 1;
		    for (int i_15_ = i_13_; i_15_ <= i_14_; i_15_++) {
			int i_16_
			    = anIntArrayArrayArray810[i_7_][i_15_][i_11_];
			if ((i_16_ & 0xff) == 0)
			    anIntArrayArrayArray810[i_7_][i_15_][i_11_]
				= i_16_ | Class172.anInt2293;
			else if ((i_16_ & 0xff00) == 0)
			    anIntArrayArrayArray810[i_7_][i_15_][i_11_]
				= i_16_ | Class172.anInt2293 << 8;
			else if ((i_16_ & 0xff0000) == 0)
			    anIntArrayArrayArray810[i_7_][i_15_][i_11_]
				= i_16_ | Class172.anInt2293 << 16;
			else if ((i_16_ & ~0xffffff) == 0)
			    anIntArrayArrayArray810[i_7_][i_15_][i_11_]
				= i_16_ | Class172.anInt2293 << 24;
		    }
		}
	    }
	}
    }
    
    public static void method674(int arg0) {
	try {
	    if (Class131_Sub41_Sub4.anInt6204 > arg0) {
		int i = 0;
		for (int i_17_ = 0;
		     (Class131_Sub41_Sub7.aStringArray6253.length > i_17_);
		     i_17_++) {
		    if (Class131_Sub41_Sub7.aStringArray6253[i_17_]
			    .startsWith("--> ")
			&& Class131_Sub41_Sub4.anInt6204 == ++i) {
			Class23_Sub1_Sub1.aString5085
			    = Class131_Sub41_Sub7.aStringArray6253[i_17_]
				  .substring(4);
			break;
		    }
		}
	    } else
		Class23_Sub1_Sub1.aString5085 = "";
	    anInt813++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"gh.E(" + arg0 + ')');
	}
    }
    
    static {
	aBoolean814 = false;
    }
}