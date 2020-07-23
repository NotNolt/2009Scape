package jagex;/* jagex.Class100 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class100
{
    public static int anInt1315;
    public static int anInt1316;
    public static Class214 aClass214_1317 = new Class214(64);
    public static int anInt1318;
    public static int anInt1319;
    public static int anInt1320;
    public static int anInt1321;
    public static Class50 aClass50_1322;
    public static String Glow2ColorText = "glow2:";
    public static FileSystem aClass158_1324;
    public static boolean aBoolean1325;
    public static String Started3dLibraryString;
    
    public static String PlayerLevelDifferenceMethod(byte playerLevelByte, int otherPlayer, int yourPlayer) {
	try {
	    anInt1315++;
	    int playerLevelDiff = -otherPlayer + yourPlayer;
	    if (playerLevelByte != 51)
		method873(false);

	    if (playerLevelDiff < -9)
			return "<col=ff0000>";//Solid Red
	    if (playerLevelDiff < -6)
			return "<col=ff3000>";//Dark Orange
	    if (playerLevelDiff < -3)
			return "<col=ff7000>";//Orange
	    if (playerLevelDiff < 0)
			return "<col=ffb000>";//Yellow-Orange
		if (playerLevelDiff > 0)
			return "<col=c0ff00>";//Yellow
		if (playerLevelDiff > 3)
			return "<col=80ff00>";//Yellow-Green
		if (playerLevelDiff > 6)
			return "<col=40ff00>";//Green
	    if (playerLevelDiff > 9)
			return "<col=00ff00>";//Bright Green
		return "<col=ffff00>";//Yellow

	} 	catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception, ("kn.J(" + playerLevelByte + ',' + otherPlayer + ',' + yourPlayer + ')'));
		}
    }
    
    public static void method873(boolean arg0) {
	aClass214_1317 = null;
	Started3dLibraryString = null;
	Glow2ColorText = null;
	aClass50_1322 = null;
	aClass158_1324 = null;
	if (arg0 != false)
	    aBoolean1325 = false;
    }
    
    public abstract void method874(int i);
    
    public static void method875(int arg0) {
	try {
	    Class23_Sub4_Sub1_Sub1.aClass214_6477.method2775((byte) 56);
	    anInt1316++;
	    Class2.aClass214_83.method2775((byte) 56);
	    Class131_Sub7.aClass214_4180.method2775((byte) 56);
	    Class82.aClass214_1087.method2775((byte) 56);
	    if (arg0 <= 115)
		aClass158_1324 = null;
	    Class209.aClass214_3042.method2775((byte) 56);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"kn.G(" + arg0 + ')');
	}
    }
    
    public abstract int method876(int i, int i_0_);
    
    public static void method877(int arg0) {
	try {
	    Class93.aClass100_1219.method874(arg0 + 123);
	    anInt1318++;
	    if (arg0 != -1)
		method873(true);
	    for (int i = 0; i < 32; i++)
		Class166.aLongArray2212[i] = 0L;
	    for (int i = 0; i < 32; i++)
		Class144.aLongArray1920[i] = 0L;
	    Class131_Sub1_Sub4.anInt5544 = 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"kn.H(" + arg0 + ')');
	}
    }
    
    public static int method878(int arg0, int arg1, int arg2, int arg3) {
	try {
	    anInt1320++;
	    arg3 &= 0x3;
	    if (arg3 == arg0)
		return arg2;
	    if (arg3 == 1)
		return 1023 - arg1;
	    if (arg3 == 2)
		return -arg2 + 1023;
	    return arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("kn.I(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public static void method879(int arg0) {
	try {
	    anInt1319++;
	    if (arg0 != -8822)
		method873(false);
	    for (int i = -1;
			 i < Class131_Sub38.anInt4618;
		 i++) {
		int i_1_;
		if (i == -1)
		    i_1_ = 2047;
		else
		    i_1_ = Class148.anIntArray1983[i];
		Player class23_sub4_sub1_sub2
		    = Class105.aClass23_Sub4_Sub1_Sub2Array1373[i_1_];
		if (class23_sub4_sub1_sub2 != null)
		    Class131_Sub41_Sub6.method1967(class23_sub4_sub1_sub2
						       .method335((byte) -39),
						   arg0 ^ 0x221e,
						   class23_sub4_sub1_sub2);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"kn.E(" + arg0 + ')');
	}
    }
    
    public abstract long method880(int i);
    
    static {
	anInt1321 = 0;
	aClass50_1322 = new Class50();
	aBoolean1325 = false;
	Started3dLibraryString = "Started 3d Library";
    }
}
