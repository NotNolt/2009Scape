package jagex;/* jagex.NPCDefinition - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class NPCDefinition
{
    public Class180 aClass180_832;
    public int anInt833;
    public static int anInt834;
    public static int anInt835;
    public int NPCWalkAnimation;
    public int anInt837;
    public byte aByte838;
    public int anInt839 = 1;
    public int[][] anIntArrayArray840;
    public boolean aBoolean841;
    public int anInt842;
    public static Class119 aClass119_843 = new Class119();
    public int ConfigFileId;
    public int[] anIntArray845;
    public int anInt846;
    public static int anInt847;
    public int NPCRenderAnimationId;
    public boolean aBoolean849 = false;
    public int anInt850;
    public byte aByte851;
    public boolean aBoolean852;
    public int anInt853;
    public byte aByte854;
    public static int anInt855;
    public boolean aBoolean856;
    public boolean aBoolean857;
    public static int anInt858;
    public short[] aShortArray859;
    public int NPCStandAnimation;
    public byte[] aByteArray861;
    public short aShort862;
    public boolean aBoolean863;
    public int anInt864;
    public String NPCName;
    public short[] aShortArray866;
    public byte aByte867;
    public int[] anIntArray868;
    public int anInt869;
    public int anInt870;
    public int anInt871;
    public int anInt872;
    public static int anInt873;
    public int anInt874;
    public int anInt875;
    public int anInt876;
    public int NPCHeadIcon;
    public static int anInt878;
    public int anInt879;
    public short[] aShortArray880;
    public static int anInt881;
    public int[][] anIntArrayArray882;
    public static int anInt883;
    public int anInt884;
    public int[] anIntArray885;
    public static AnimationDefinition[] aAnimationDefinitionArray886 = new AnimationDefinition[14];
    public static int anInt887;
    public int anInt888;
    public int anInt889;
    public static String WhiteColorText = "white:";
    public boolean NPCIsVisibleOnMap;
    public int[] anIntArray892;
    public static int anInt893;
    public short aShort894;
    public String[] NPCOption;
    public short[] aShortArray896;
    public int anInt897;
    public static int anInt898;
    public int anInt899;
    public int anInt900;
    public int anInt901;
    public static int anInt902;
    
    public boolean method690(byte arg0) {
	try {
	    anInt881++;
	    if (anIntArray845 == null)
		return true;
	    int i = -1;
	    if (ConfigFileId == -1) {
		if (anInt888 != -1)
		    i = Class131_Sub2_Sub13.anIntArray5735[anInt888];
	    } else
		i = Class63.method667(ConfigFileId, -1);
	    if (i < 0 || -1 + anIntArray845.length <= i
		|| anIntArray845[i] == -1) {
		int i_0_ = anIntArray845[-1 + anIntArray845.length];
		if (i_0_ != -1)
		    return true;
		return false;
	    }
	    if (arg0 > -127)
		method695(-113, -88, 9, 102, null, -63, null);
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"gj.D(" + arg0 + ')');
	}
    }
    
    public boolean method691(int arg0) {
	try {
	    anInt873++;
	    if (anIntArray845 == null) {
		if (anInt876 == -1 && anInt884 == -1
		    && anInt871 == -1)
		    return false;
		return true;
	    }
	    for (int i = arg0;
             i < anIntArray845.length; i++) {
		if (anIntArray845[i] != -1) {
		    NPCDefinition NPCDefinition
			= Class131_Sub41_Sub7.method1971(anIntArray845[i],
							 arg0 ^ 0x6d);
		    if (NPCDefinition.anInt876 != -1
			|| NPCDefinition.anInt884 != -1
			|| NPCDefinition.anInt871 != -1)
			return true;
		}
	    }
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"gj.C(" + arg0 + ')');
	}
    }
    
    public int method692(int arg0, int arg1, int arg2) {
	try {
	    if (arg2 <= 29)
		return 94;
	    anInt883++;
	    if (aClass180_832 == null)
		return arg1;
	    Class131_Sub24 class131_sub24
		= (Class131_Sub24) aClass180_832.method2521(-108, (long) arg0);
	    if (class131_sub24 == null)
		return arg1;
	    return class131_sub24.anInt4465;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gj.L(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method693(int arg0) {
	try {
	    if (arg0 != 0)
		method693(-21);
	    WhiteColorText = null;
	    aAnimationDefinitionArray886 = null;
	    aClass119_843 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"gj.A(" + arg0 + ')');
	}
    }
    
    public void method694(int arg0) {
	try {
	    if (anIntArray868 == null)
		anIntArray868 = new int[0];
	    if (arg0 != 16172)
		method701((byte) 58, null, -94);
	    anInt887++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"gj.G(" + arg0 + ')');
	}
    }
    
    public Class154 method695(int arg0, int arg1, int arg2, int arg3,
                              AnimationDefinition arg4, int arg5, GraphicsToolkit arg6) {
	try {
	    anInt834++;
	    if (anIntArray845 != null) {
		NPCDefinition NPCDefinition = method697(true);
		if (NPCDefinition == null)
		    return null;
		return NPCDefinition.method695(arg0, arg1, -1, arg3, arg4, arg5,
					 arg6);
	    }
	    if (arg2 != -1)
		WhiteColorText = null;
	    if (anIntArray892 == null)
		return null;
	    int i = arg1;
	    if (arg4 != null && arg3 != -1)
		i |= arg4.method2389(1, true, arg5, arg3);
	    Class154 class154;
	    synchronized (Class131_Sub31.aClass214_4545) {
		class154
		    = (Class154) (Class131_Sub31.aClass214_4545.method2780
				  (125, (long) (arg6.anInt1781 << -2030758800
						| anInt900)));
	    }
	    if (class154 == null
		|| (class154.method2253() & i) != i) {
		if (class154 != null)
		    i |= class154.method2253();
		int i_1_ = i;
		boolean bool = false;
		synchronized (Class23_Sub4_Sub3.aClass158_5003) {
		    for (int i_2_ = 0; anIntArray892.length > i_2_; i_2_++) {
			if (!Class23_Sub4_Sub3.aClass158_5003.method2354
			     (0, anIntArray892[i_2_], arg2 + 111))
			    bool = true;
		    }
		}
		if (bool)
		    return null;
		Class116[] class116s = new Class116[anIntArray892.length];
		synchronized (Class23_Sub4_Sub3.aClass158_5003) {
		    for (int i_3_ = 0;
			 (anIntArray892.length > i_3_);
			 i_3_++)
			class116s[i_3_]
			    = Class134.method2097(anIntArray892[i_3_], 0,
						  (Class23_Sub4_Sub3
						   .aClass158_5003),
						  1);
		}
		Class116 class116;
		if (class116s.length == 1)
		    class116 = class116s[0];
		else
		    class116 = new Class116(class116s, class116s.length);
		if (aShortArray896 != null)
		    i_1_ |= 0x2000;
		if (aShortArray880 != null)
		    i_1_ |= 0x4000;
		class154 = arg6.method1218(class116, i_1_, Class183.anInt2611,
					   64, 768);
		if (aShortArray896 != null) {
		    for (int i_4_ = 0; aShortArray896.length > i_4_; i_4_++) {
			if (aByteArray861 == null
			    || i_4_ >= aByteArray861.length)
			    class154.method2260(aShortArray896[i_4_],
						aShortArray859[i_4_]);
			else
			    class154.method2260(aShortArray896[i_4_],
						(Class192.aShortArray2819
						 [(0xff
						   & aByteArray861[i_4_])]));
		    }
		}
		if (aShortArray880 != null) {
		    for (int i_5_ = 0; aShortArray880.length > i_5_; i_5_++)
			class154.method2281(aShortArray880[i_5_],
					    aShortArray866[i_5_]);
		}
		class154.method2248(i);
		synchronized (Class131_Sub31.aClass214_4545) {
		    Class131_Sub31.aClass214_4545.method2773
			(true, class154,
			 (long) (arg6.anInt1781 << 1255776720 | anInt900));
		}
	    }
	    if (arg4 != null && arg3 != -1)
		class154 = arg4.method2388(arg5, arg0, i, (byte) -112,
					   class154, arg3);
	    class154.method2248(arg1);
	    return class154;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("gj.H(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3
			+ ',' + (arg4 != null ? "{...}" : "null") + ',' + arg5
			+ ',' + (arg6 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public Class154 method696(int arg0, int arg1, Class141[] arg2,
                              AnimationDefinition arg3, int arg4, AnimationDefinition arg5, int arg6,
                              GraphicsToolkit arg7, int arg8, int arg9, int arg10,
                              int arg11) {
	try {
	    anInt858++;
	    if (anIntArray845 != null) {
		NPCDefinition NPCDefinition = method697(true);
		if (NPCDefinition == null)
		    return null;
		return NPCDefinition.method696(arg0, arg1, arg2, arg3, 106, arg5,
					 arg6, arg7, arg8, arg9, arg10, arg11);
	    }
	    int i = arg10;
	    if (anInt899 != 128)
		i |= 0x2;
	    if (anInt864 != 128)
		i |= 0x5;
	    boolean bool = arg3 != null || arg5 != null;
	    boolean bool_6_ = false;
	    if (arg4 < 83)
		anInt850 = -114;
	    boolean bool_7_ = false;
	    boolean bool_8_ = false;
	    int i_9_ = arg2 == null ? 0 : arg2.length;
	    for (int i_10_ = 0; i_9_ > i_10_; i_10_++) {
		Class131_Sub2_Sub8.aClass131_Sub41_Sub10Array5654[i_10_]
		    = null;
		if (arg2[i_10_] != null) {
		    AnimationDefinition animationDefinition
			= Class145.method2159(arg2[i_10_].anInt1881,
					      (byte) -99);
		    if (animationDefinition.anIntArray2139 != null) {
			aAnimationDefinitionArray886[i_10_] = animationDefinition;
			bool = true;
			int i_11_ = arg2[i_10_].anInt1879;
			int i_12_ = arg2[i_10_].anInt1878;
			int i_13_ = animationDefinition.anIntArray2139[i_11_];
			Class131_Sub2_Sub8.aClass131_Sub41_Sub10Array5654
			    [i_10_]
			    = Class34.method462((byte) -119,
						i_13_ >>> -416067152);
			i_13_ &= 0xffff;
			Class153_Sub1.anIntArray4758[i_10_] = i_13_;
			if ((Class131_Sub2_Sub8.aClass131_Sub41_Sub10Array5654
			     [i_10_])
			    != null) {
			    bool_7_ |= Class131_Sub2_Sub8
					   .aClass131_Sub41_Sub10Array5654
					   [i_10_].method1992(65280, i_13_);
			    bool_6_ |= Class131_Sub2_Sub8
					   .aClass131_Sub41_Sub10Array5654
					   [i_10_].method1995((byte) 0, i_13_);
			    bool_8_ |= animationDefinition.aBoolean2141;
			}
			if (!animationDefinition.aBoolean2159 && !Class119.TweenBoolean
			    || i_12_ == -1
			    || animationDefinition.anIntArray2139.length <= i_12_) {
			    Class93.anIntArray1224[i_10_] = 0;
			    Class19.anIntArray224[i_10_] = 0;
			    Class131_Sub2_Sub26
				.aClass131_Sub41_Sub10Array5925[i_10_]
				= null;
			    GraphicDefinition.anIntArray1439[i_10_] = -1;
			} else {
			    Class93.anIntArray1224[i_10_]
				= animationDefinition.anIntArray2153[i_11_];
			    Class19.anIntArray224[i_10_]
				= arg2[i_10_].anInt1884;
			    int i_14_ = animationDefinition.anIntArray2139[i_12_];
			    Class131_Sub2_Sub26
				.aClass131_Sub41_Sub10Array5925[i_10_]
				= Class34.method462((byte) -119,
						    i_14_ >>> -377801616);
			    i_14_ &= 0xffff;
			    GraphicDefinition.anIntArray1439[i_10_] = i_14_;
			    if ((Class131_Sub2_Sub26
				 .aClass131_Sub41_Sub10Array5925[i_10_])
				!= null) {
				bool_7_
				    |= Class131_Sub2_Sub26
					   .aClass131_Sub41_Sub10Array5925
					   [i_10_].method1992(65280, i_14_);
				bool_6_
				    |= Class131_Sub2_Sub26
					   .aClass131_Sub41_Sub10Array5925
					   [i_10_].method1995((byte) 0, i_14_);
			    }
			}
		    }
		}
	    }
	    int i_15_ = -1;
	    int i_16_ = -1;
	    int i_17_ = 0;
	    Class131_Sub41_Sub10 class131_sub41_sub10 = null;
	    Class131_Sub41_Sub10 class131_sub41_sub10_18_ = null;
	    int i_19_ = -1;
	    int i_20_ = -1;
	    int i_21_ = 0;
	    Class131_Sub41_Sub10 class131_sub41_sub10_22_ = null;
	    Class131_Sub41_Sub10 class131_sub41_sub10_23_ = null;
	    if (bool) {
		i |= 0x20;
		if (arg3 != null) {
		    i_15_ = arg3.anIntArray2139[arg8];
		    int i_24_ = i_15_ >>> -217128880;
		    i_15_ &= 0xffff;
		    class131_sub41_sub10
			= Class34.method462((byte) -119, i_24_);
		    if (class131_sub41_sub10 != null) {
			bool_7_
			    |= class131_sub41_sub10.method1992(65280, i_15_);
			bool_6_ |= class131_sub41_sub10.method1995((byte) 0,
								   i_15_);
			bool_8_ |= arg3.aBoolean2141;
		    }
		    if ((arg3.aBoolean2159 || Class119.TweenBoolean)
			&& arg11 != -1 && arg3.anIntArray2139.length > arg11) {
			i_17_ = arg3.anIntArray2153[arg8];
			i_16_ = arg3.anIntArray2139[arg11];
			int i_25_ = i_16_ >>> -856527440;
			i_16_ &= 0xffff;
			if (i_24_ == i_25_)
			    class131_sub41_sub10_18_ = class131_sub41_sub10;
			else
			    class131_sub41_sub10_18_
				= Class34.method462((byte) -119,
						    i_16_ >>> 553919504);
			if (class131_sub41_sub10_18_ != null) {
			    bool_7_
				|= class131_sub41_sub10_18_.method1992(65280,
								       i_16_);
			    bool_6_ |= class131_sub41_sub10_18_
					   .method1995((byte) 0, i_16_);
			}
		    }
		}
		if (arg5 != null) {
		    i_19_ = arg5.anIntArray2139[arg6];
		    int i_26_ = i_19_ >>> -1230896;
		    class131_sub41_sub10_22_
			= Class34.method462((byte) -119, i_26_);
		    i_19_ &= 0xffff;
		    if (class131_sub41_sub10_22_ != null) {
			bool_7_ |= class131_sub41_sub10_22_.method1992(65280,
								       i_19_);
			bool_6_
			    |= class131_sub41_sub10_22_.method1995((byte) 0,
								   i_19_);
			bool_8_ |= arg5.aBoolean2141;
		    }
		    if ((arg5.aBoolean2159 || Class119.TweenBoolean)
			&& arg0 != -1
			&& arg5.anIntArray2139.length > arg0) {
			i_20_ = arg5.anIntArray2139[arg0];
			i_21_ = arg5.anIntArray2153[arg6];
			int i_27_ = i_20_ >>> -22836176;
			i_20_ &= 0xffff;
			if (i_27_ != i_26_)
			    class131_sub41_sub10_23_
				= Class34.method462((byte) -119,
						    i_20_ >>> 1031289776);
			else
			    class131_sub41_sub10_23_
				= class131_sub41_sub10_22_;
			if (class131_sub41_sub10_23_ != null) {
			    bool_7_
				|= class131_sub41_sub10_23_.method1992(65280,
								       i_20_);
			    bool_6_ |= class131_sub41_sub10_23_
					   .method1995((byte) 0, i_20_);
			}
		    }
		}
		if (bool_7_)
		    i |= 0x80;
		if (bool_6_)
		    i |= 0x100;
		if (bool_8_)
		    i |= 0x200;
	    }
	    Class154 class154;
	    synchronized (Login.aClass214_1757) {
		class154
		    = (Class154) (Login.aClass214_1757.method2780
				  (123, (long) (arg7.anInt1781 << 1757673040
						| anInt900)));
	    }
	    if (class154 == null || (i & class154.method2253()) != i) {
		if (class154 != null)
		    i |= class154.method2253();
		int i_28_ = i;
		boolean bool_29_ = false;
		synchronized (Class23_Sub4_Sub3.aClass158_5003) {
		    for (int i_30_ = 0; (i_30_ < anIntArray868.length); i_30_++) {
			if (anIntArray868[i_30_] != -1
			    && !Class23_Sub4_Sub3.aClass158_5003
				    .method2354(0, anIntArray868[i_30_], 106))
			    bool_29_ = true;
		    }
		}
		if (bool_29_)
		    return null;
		Class116[] class116s = new Class116[anIntArray868.length];
		for (int i_31_ = 0; (i_31_ < anIntArray868.length); i_31_++) {
		    if (anIntArray868[i_31_] != -1) {
			synchronized (Class23_Sub4_Sub3.aClass158_5003) {
			    class116s[i_31_]
				= Class134.method2097(anIntArray868[i_31_], 0,
						      (Class23_Sub4_Sub3
						       .aClass158_5003),
						      1);
			}
			if (anIntArrayArray840 != null
			    && anIntArrayArray840[i_31_] != null
			    && class116s[i_31_] != null)
			    class116s[i_31_].method993
				(anIntArrayArray840[i_31_][0],
				 anIntArrayArray840[i_31_][2], 27,
				 anIntArrayArray840[i_31_][1]);
		    }
		}
		RenderAnimationDefinition renderAnimationDefinition = null;
		if (NPCRenderAnimationId != -1)
		    renderAnimationDefinition
			= Class131_Sub41_Sub5.method1958(NPCRenderAnimationId, (byte) 124);
		if (renderAnimationDefinition != null && renderAnimationDefinition.anIntArrayArray979 != null) {
		    for (int i_32_ = 0;
                 i_32_ < renderAnimationDefinition.anIntArrayArray979.length; i_32_++) {
			if (renderAnimationDefinition.anIntArrayArray979[i_32_] != null
			    && i_32_ < class116s.length
			    && class116s[i_32_] != null) {
			    int i_33_ = renderAnimationDefinition.anIntArrayArray979[i_32_][0];
			    int i_34_ = renderAnimationDefinition.anIntArrayArray979[i_32_][1];
			    int i_35_ = renderAnimationDefinition.anIntArrayArray979[i_32_][2];
			    int i_36_ = (renderAnimationDefinition.anIntArrayArray979[i_32_][3]
					 << -139292445);
			    int i_37_ = (renderAnimationDefinition.anIntArrayArray979[i_32_][4]
					 << 1589058947);
			    int i_38_ = (renderAnimationDefinition.anIntArrayArray979[i_32_][5]
					 << -1782979997);
			    if (anIntArrayArray882 == null)
				anIntArrayArray882
				    = (new int
				       [renderAnimationDefinition.anIntArrayArray979.length][]);
			    if (anIntArrayArray882[i_32_] == null) {
				int[] is
				    = anIntArrayArray882[i_32_] = new int[15];
				if (i_36_ != 0 || i_37_ != 0 || i_38_ != 0) {
				    int i_39_ = Class31.anIntArray425[i_36_];
				    int i_40_ = Class31.anIntArray434[i_36_];
				    int i_41_ = Class31.anIntArray425[i_37_];
				    int i_42_ = Class31.anIntArray434[i_37_];
				    int i_43_ = Class31.anIntArray425[i_38_];
				    int i_44_ = Class31.anIntArray434[i_38_];
				    int i_45_
					= i_43_ * i_40_ + 16384 >> 1988922799;
				    int i_46_
					= 16384 + i_40_ * i_44_ >> -152110705;
				    is[4] = (i_39_ * i_43_ - -16384
					     >> -1106721297);
				    is[7] = (i_45_ * i_41_ + -i_44_ * -i_42_
					     - -16384) >> 2141522767;
				    is[2] = 16384 + i_42_ * i_39_ >> 956852719;
				    is[8]
					= 16384 + i_41_ * i_39_ >> -1722762737;
				    is[3]
					= 16384 + i_39_ * i_44_ >> -1880832401;
				    is[5] = -i_40_;
				    is[1] = (i_45_ * i_42_ + -i_44_ * i_41_
					     + 16384) >> -877973905;
				    is[0] = (16384 + (i_43_ * i_41_
						      + i_42_ * i_46_)
					     >> -1284947377);
				    is[6] = (i_46_ * i_41_ + (-i_42_ * i_43_
							      + 16384)
					     >> -1690845777);
				    is[14]
					= (16384
					   + (is[8] * -i_35_ + -i_34_ * is[5])
					   + -i_33_ * is[2]) >> -6999761;
				    is[13]
					= (-i_35_ * is[7] + (-i_34_ * is[4]
							     + (is[1] * -i_33_
								- -16384))
					   >> -1846223377);
				    is[12] = ((16384 + is[0] * -i_33_
					       - (-(-i_34_ * is[3])
						  + -(-i_35_ * is[6])))
					      >> -936354929);
				} else {
				    is[13] = -i_34_;
				    is[0] = is[4] = is[8] = 32768;
				    is[12] = -i_33_;
				    is[14] = -i_35_;
				}
				is[10] = i_34_;
				is[11] = i_35_;
				is[9] = i_33_;
			    }
			    if (i_36_ != 0 || i_37_ != 0
				|| i_38_ != 0)
				class116s[i_32_].method994(i_38_, i_37_, false,
							   i_36_);
			    if (i_33_ != 0
				|| i_34_ != 0 || i_35_ != 0)
				class116s[i_32_].method993(i_33_, i_35_, 52,
							   i_34_);
			}
		    }
		}
		Class116 class116;
		if (class116s.length != 1)
		    class116 = new Class116(class116s, class116s.length);
		else
		    class116 = class116s[0];
		if (aShortArray896 != null)
		    i_28_ |= 0x2000;
		if (aShortArray880 != null)
		    i_28_ |= 0x4000;
		class154 = arg7.method1218(class116, i_28_, Class183.anInt2611,
					   anInt869 + 64, anInt897 + 850);
		if (aShortArray896 != null) {
		    for (int i_47_ = 0;
			 (aShortArray896.length > i_47_);
			 i_47_++) {
			if (aByteArray861 == null
			    || (i_47_ >= aByteArray861.length))
			    class154.method2260(aShortArray896[i_47_],
						aShortArray859[i_47_]);
			else
			    class154.method2260(aShortArray896[i_47_],
						(Class192.aShortArray2819
						 [(aByteArray861[i_47_]
						   & 0xff)]));
		    }
		}
		if (aShortArray880 != null) {
		    for (int i_48_ = 0;
			 (aShortArray880.length > i_48_);
			 i_48_++)
			class154.method2281(aShortArray880[i_48_],
					    aShortArray866[i_48_]);
		}
		class154.method2248(i);
		synchronized (Login.aClass214_1757) {
		    Login.aClass214_1757.method2773(true, class154,
						       (long) ((arg7.anInt1781
								<< -644849520)
							       | anInt900));
		}
	    }
	    Class154 class154_49_ = class154.method2287((byte) 1, i, true);
	    if (!bool)
		return class154_49_;
	    int i_50_ = 0;
	    int i_51_ = 1;
	    for (/**/; i_50_ < i_9_; i_50_++) {
		if (Class131_Sub2_Sub8.aClass131_Sub41_Sub10Array5654[i_50_]
		    != null)
		    class154_49_.method2250
			(GraphicDefinition.anIntArray1439[i_50_],
			 -1 + Class19.anIntArray224[i_50_],
			 Class153_Sub1.anIntArray4758[i_50_], i_51_,
			 anIntArrayArray882[i_50_],
			 Class93.anIntArray1224[i_50_], -119,
			 (Class131_Sub2_Sub8.aClass131_Sub41_Sub10Array5654
			  [i_50_]),
			 (Class131_Sub2_Sub26.aClass131_Sub41_Sub10Array5925
			  [i_50_]),
			 aAnimationDefinitionArray886[i_50_].aBoolean2141, 0);
		i_51_ <<= 1;
	    }
	    if (class131_sub41_sub10 == null
		|| class131_sub41_sub10_22_ == null) {
		if (class131_sub41_sub10 == null) {
		    if (class131_sub41_sub10_22_ != null)
			class154_49_.method2270(i_20_, 0, i_21_, 0, -1 + arg9,
						class131_sub41_sub10_23_,
						arg5.aBoolean2141,
						class131_sub41_sub10_22_,
						i_19_);
		} else
		    class154_49_.method2270(i_16_, 0, i_17_, 0, arg1 + -1,
					    class131_sub41_sub10_18_,
					    arg3.aBoolean2141,
					    class131_sub41_sub10, i_15_);
	    } else
		class154_49_.method2268(class131_sub41_sub10, i_20_,
					class131_sub41_sub10_18_, -1 + arg9,
					i_15_, class131_sub41_sub10_23_, i_19_,
					i_21_, i_17_, -1 + arg1,
					class131_sub41_sub10_22_,
					arg3.aBooleanArray2149,
					arg5.aBoolean2141 | arg3.aBoolean2141,
					i_16_, (byte) 28);
	    for (int i_52_ = 0; i_9_ > i_52_;
             i_52_++) {
		Class131_Sub2_Sub8.aClass131_Sub41_Sub10Array5654[i_52_]
		    = null;
		Class131_Sub2_Sub26.aClass131_Sub41_Sub10Array5925[i_52_]
		    = null;
		aAnimationDefinitionArray886[i_52_] = null;
	    }
	    if (anInt864 != 128 || anInt899 != 128)
		class154_49_.method2262(anInt864, anInt899, anInt864);
	    class154_49_.method2248(arg10);
	    return class154_49_;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("gj.F(" + arg0 + ',' + arg1 + ','
			+ (arg2 != null ? "{...}" : "null") + ','
			+ (arg3 != null ? "{...}" : "null") + ',' + arg4 + ','
			+ (arg5 != null ? "{...}" : "null") + ',' + arg6 + ','
			+ (arg7 != null ? "{...}" : "null") + ',' + arg8 + ','
			+ arg9 + ',' + arg10 + ',' + arg11 + ')'));
	}
    }
    
    public NPCDefinition method697(boolean arg0) {
	try {
	    anInt855++;
	    int i = -1;
	    if (ConfigFileId == -1) {
		if (anInt888 != -1)
		    i = Class131_Sub2_Sub13.anIntArray5735[anInt888];
	    } else
		i = Class63.method667(ConfigFileId, -1);
	    if (arg0 != true)
		NPCRenderAnimationId = 101;
	    if (i < 0 || i >= anIntArray845.length + -1
		|| anIntArray845[i] == -1) {
		int i_53_ = anIntArray845[-1 + anIntArray845.length];
		if (i_53_ == -1)
		    return null;
		return Class131_Sub41_Sub7.method1971(i_53_, 43);
	    }
	    return Class131_Sub41_Sub7.method1971(anIntArray845[i], 72);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"gj.J(" + arg0 + ')');
	}
    }
    
    public String method698(String arg0, boolean arg1, int arg2) {
	try {
	    anInt835++;
	    if (arg1 != true)
		aShort862 = (short) -21;
	    if (aClass180_832 == null)
		return arg0;
	    Class131_Sub29 class131_sub29
		= (Class131_Sub29) aClass180_832.method2521(70, (long) arg2);
	    if (class131_sub29 == null)
		return arg0;
	    return class131_sub29.aString4502;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gj.B("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ')'));
	}
    }
    
    public void method699(int arg0, Stream arg1) {
	try {
	    for (;;) {
		int i = arg1.readUnsignedByte(119);
		if (i == 0)
		    break;
		method701((byte) -117, arg1, i);
	    }
	    int i = -128 % ((arg0 - -55) / 34);
	    anInt893++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gj.I(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method700(byte arg0, int arg1) {
	synchronized (Class182.aClass214_2603) {
	    Class182.aClass214_2603.method2786(0, arg1);
	}
	anInt902++;
	if (arg0 != -1)
	    method702(-53, -33);
    }
    
    public void method701(byte arg0, Stream stream, int opcode) {
	try {
	    anInt847++;
	    if (arg0 >= -112)
		anInt901 = -93;
	    if (opcode == 1) {
		int i = stream.readUnsignedByte(55);
		anIntArray868 = new int[i];
		for (int i_66_ = 0; i_66_ < i; i_66_++) {
		    anIntArray868[i_66_] = stream.readUnsignedShort(8104);
		    if (anIntArray868[i_66_] == 65535)
			anIntArray868[i_66_] = -1;
		}
	    } else if (opcode == 2)
			NPCName = stream.readString(false);
		else if (opcode != 12) {
			if (opcode >= 30 && opcode < 35) {
				NPCOption[opcode - 30] = stream.readString(false);
				if (NPCOption[-30 + opcode]
						.equalsIgnoreCase(Class165.HiddenString))
					NPCOption[-30 + opcode] = null;
			} else if (opcode == 40) {
				int i = stream.readUnsignedByte(-88);
				aShortArray859 = new short[i];
				aShortArray896 = new short[i];
				for (int i_65_ = 0;
					 i_65_ < i;
					 i_65_++) {
					aShortArray896[i_65_]
							= (short) stream.readUnsignedShort(8104);
					aShortArray859[i_65_]
							= (short) stream.readUnsignedShort(8104);
				}
			} else if (opcode == 41) {
				int i = stream.readUnsignedByte(122);
				aShortArray880 = new short[i];
				aShortArray866 = new short[i];
				for (int i_54_ = 0;
					 i > i_54_;
					 i_54_++) {
					aShortArray880[i_54_]
							= (short) stream.readUnsignedShort(8104);
					aShortArray866[i_54_]
							= (short) stream.readUnsignedShort(8104);
				}
			} else if (opcode == 42) {
				int i = stream.readUnsignedByte(75);
				aByteArray861 = new byte[i];
				for (int i_55_ = 0; i > i_55_; i_55_++)
					aByteArray861[i_55_]
							= stream.readSignedByte((byte) 127);
			} else if (opcode == 60) {
				int i = stream.readUnsignedByte(-22);
				anIntArray892 = new int[i];
				for (int i_64_ = 0;
					 i > i_64_;
					 i_64_++)
					anIntArray892[i_64_] = stream.readUnsignedShort(8104);
			} else if (opcode == 93)
				NPCIsVisibleOnMap = false;
			else if (opcode == 95)
				NPCStandAnimation = stream.readUnsignedShort(8104);
			else if (opcode != 97) {
				if (opcode == 98)
					anInt899 = stream.readUnsignedShort(8104);
				else if (opcode == 99)
					aBoolean863 = true;
				else if (opcode == 100)
					anInt869 = stream.readSignedByte((byte) 127);
				else if (opcode == 101)
					anInt897 = stream.readSignedByte((byte) 127) * 5;
				else if (opcode == 102)
					NPCHeadIcon = stream.readUnsignedShort(8104);
				else if (opcode != 103) {
					if (opcode == 106 || opcode == 118) {
						ConfigFileId = stream.readUnsignedShort(8104);
						if (ConfigFileId == 65535)
							ConfigFileId = -1;
						anInt888 = stream.readUnsignedShort(8104);
						if (anInt888 == 65535)
							anInt888 = -1;
						int i = -1;
						if (opcode == 118) {
							i = stream.readUnsignedShort(8104);
							if (i == 65535)
								i = -1;
						}
						int i_56_ = stream.readUnsignedByte(-44);
						anIntArray845 = new int[2 + i_56_];
						for (int i_57_ = 0; i_56_ >= i_57_;
							 i_57_++) {
							anIntArray845[i_57_]
									= stream.readUnsignedShort(8104);
							if (anIntArray845[i_57_] == 65535)
								anIntArray845[i_57_] = -1;
						}
						anIntArray845[i_56_ - -1] = i;
					} else if (opcode != 107) {
						if (opcode == 109)
							aBoolean852 = false;
						else if (opcode != 111) {
							if (opcode == 113) {
								aShort862 = (short) (stream.readUnsignedShort(8104));
								aShort894 = (short) (stream.readUnsignedShort(8104));
							} else if (opcode == 114) {
								aByte851 = (stream.readSignedByte((byte) 127));
								aByte854 = (stream.readSignedByte((byte) 127));
							} else if (opcode == 115) {
								stream.readUnsignedByte(121);
								stream.readUnsignedByte(103);
							} else if (opcode != 119) {
								if (opcode == 121) {
									anIntArrayArray840 = (new int[anIntArray868.length][]);
									int i = (stream.readUnsignedByte(99));
									for (int i_62_ = 0;
										 (i > i_62_);
										 i_62_++) {
										int i_63_ = (stream.readUnsignedByte(-26));
										int[] is = (anIntArrayArray840[i_63_] = (new int[3]));
										is[0] = (stream.readSignedByte((byte) 127));
										is[1] = (stream.readSignedByte((byte) 127));
										is[2] = (stream.readSignedByte((byte) 127));
									}
								} else if (opcode != 122) {
									if (opcode == 123)
										anInt846 = (stream.readUnsignedShort(8104));
									else if (opcode != 125) {
										if (opcode == 127)
											NPCRenderAnimationId = (stream.readUnsignedShort(8104));
										else if (opcode == 128)
											stream.readUnsignedByte(126);
										else if (opcode == 134) {
											anInt876 = (stream.readUnsignedShort(8104));
											if (anInt876 == 65535)
												anInt876 = -1;
											anInt842 = (stream.readUnsignedShort(8104));
											if (anInt842 == 65535)
												anInt842 = -1;
											anInt884 = (stream.readUnsignedShort(8104));
											if (anInt884 == 65535)
												anInt884 = -1;
											anInt871 = (stream.readUnsignedShort(8104));
											if (anInt871 == 65535)
												anInt871 = -1;
											anInt875 = (stream.readUnsignedByte(-46));
										} else if (opcode == 135) {
											anInt833 = stream.readUnsignedByte(105);
											anInt874 = stream.readUnsignedShort(8104);
										} else if (opcode == 136) {
											anInt837 = stream.readUnsignedByte(116);
											anInt889 = stream.readUnsignedShort(8104);
										} else if (opcode != 137) {
											if (opcode != 138) {
												if (opcode != 139) {
													if (opcode == 140)
														anInt850 = stream.readUnsignedByte(-115);
													else if (opcode == 141)
														aBoolean849 = true;
													else if (opcode != 142) {
														if (opcode == 143)
															aBoolean856 = true;
														else if (opcode >= 150 && opcode < 155) {
															NPCOption[opcode - 150] = stream.readString(false);
															if (!Class35.aBoolean494 || NPCOption[opcode - 150].equalsIgnoreCase(Class165.HiddenString))
																NPCOption[opcode + -150] = null;
														} else if (opcode == 160) {
															int i = stream.readUnsignedByte(-124);
															anIntArray885 = new int[i];
															for (int i_58_ = 0; i > i_58_; i_58_++)
																anIntArray885[i_58_] = stream.readUnsignedShort(8104);
														} else if (opcode == 249) {
															int i = stream.readUnsignedByte(99);
															if (aClass180_832 == null) {
																int i_59_ = Class101.method887(1388313616, i);
																aClass180_832 = new Class180(i_59_);
															}
															for (int i_60_ = 0; i > i_60_; i_60_++) {
																boolean bool = stream.readUnsignedByte(65) == 1;
																int i_61_ = stream.read3Bytes(false);
																Class131 class131;
																if (bool)
																	class131 = new Class131_Sub29(stream.readString(false));
																else
																	class131 = new Class131_Sub24(stream.readUnsignedInt(-2));
																aClass180_832.method2523(false, (long) i_61_, class131);
															}
														}
													} else
														anInt870 = stream.readUnsignedShort(8104);
												} else
													anInt879 = stream.readUnsignedShort(8104);
											} else
												anInt901 = stream.readUnsignedShort(8104);
										} else
											anInt872 = stream.readUnsignedShort(8104);
									} else
										aByte838 = (stream.readSignedByte((byte) 127));
								} else
									NPCWalkAnimation = (stream.readUnsignedShort(8104));
							} else
								aByte867 = (stream.readSignedByte((byte) 127));
						} else
							aBoolean857 = false;
					} else
						aBoolean841 = false;
				} else
					anInt853 = stream.readUnsignedShort(8104);
			} else
				anInt864 = stream.readUnsignedShort(8104);
		} else
			anInt839 = stream.readUnsignedByte(-105);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gj.K(" + arg0 + ','
						 + (stream != null ? "{...}"
						    : "null")
						 + ',' + opcode + ')'));
	}
    }
    
    public static void method702(int arg0, int arg1) {
	try {
	    anInt898++;
	    Class131_Sub41_Sub6 class131_sub41_sub6
		= Class131_Sub13.method1709(arg0, arg1, (byte) 1);
	    class131_sub41_sub6.method1959(-68);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("gj.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public NPCDefinition() {
	anInt842 = -1;
	ConfigFileId = -1;
	anInt837 = -1;
	anInt846 = -1;
	anInt853 = 32;
	NPCStandAnimation = -1;
	NPCWalkAnimation = -1;
	NPCName = "null";
	anInt869 = 0;
	aByte867 = (byte) 0;
	anInt850 = 255;
	anInt871 = -1;
	aBoolean852 = true;
	aShort862 = (short) 0;
	anInt876 = -1;
	aByte851 = (byte) -96;
	anInt875 = 0;
	anInt872 = -1;
	NPCRenderAnimationId = -1;
	aByte838 = (byte) 7;
	aBoolean857 = true;
	anInt870 = -1;
	anInt874 = -1;
	anInt833 = -1;
	anInt864 = 128;
	NPCHeadIcon = -1;
	aBoolean856 = false;
	anInt888 = -1;
	aByte854 = (byte) -16;
	aBoolean863 = false;
	NPCIsVisibleOnMap = true;
	anInt889 = -1;
	anInt884 = -1;
	aBoolean841 = true;
	anInt879 = -1;
	anInt899 = 128;
	aShort894 = (short) 0;
	NPCOption = new String[5];
	anInt897 = 0;
	anInt901 = -1;
    }
    
    static {
	anInt878 = 0;
    }
}
