package jagex;/* jagex.Class210 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class210
{
    public static long aLong3062;
    public static int anInt3063;
    public static int[] anIntArray3064 = new int[13];
    public static int anInt3065;
    public static Class50[] aClass50Array3066 = new Class50[5];
    public static int anInt3067;
    public static int anInt3068;
    public static Class115 aClass115_3069;
    
    public static boolean method2759(int arg0, int arg1, int arg2, int arg3,
				     int arg4, int arg5, int arg6, int arg7,
				     int arg8, int arg9, boolean arg10) {
	try {
	    anInt3067++;
	    int i = Class143.method2141(arg7, arg2, arg6, arg8,
					Class131_Sub2_Sub18.anIntArray5821,
					arg10, -12757,
					Class131_Sub24.anIntArray4473, arg5,
					Class166
					    .aClass23_Sub4_Sub1_Sub2_2216
					    .method335((byte) -51),
					arg4, arg0, arg1, arg9,
					(Class131_Sub2_Sub9.aClass19Array5682
					 [ItemDefinition.anInt300]));
	    if (i < 1)
		return false;
	    Class131_Sub2_Sub6.anInt5622
		= Class131_Sub2_Sub18.anIntArray5821[-1 + i];
	    Class169.anInt2268 = Class131_Sub24.anIntArray4473[i - 1];
	    Class78.aBoolean1051 = false;
	    Class149.method2181((byte) -117);
	    int i_0_ = -96 / ((50 - arg3) / 35);
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ve.C(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ',' + arg7
						 + ',' + arg8 + ',' + arg9
						 + ',' + arg10 + ')'));
	}
    }
    
    public static void PlayerSpriteContainer(int arg0, FileSystem arg1) {
	try {
	    if (arg0 == 1) {
		Class131_Sub2_Sub32.anInt6014 = arg1.getContainerId(110, "p11_full");
		anInt3065++;
		Class128.anInt1743 = arg1.getContainerId(97, "p12_full");
		PacketParser.anInt5872 = arg1.getContainerId(112, "b12_full");
		Class131_Sub17.HitmarksCID = arg1.getContainerId(113, "hitmarks");
		Class203.HitbarDefCID = arg1.getContainerId(99, "hitbar_default");
		Class85.TimerbarDefCID = arg1.getContainerId(arg0 + 109, "timerbar_default");
		Class55.HeadiconsPkCID = arg1.getContainerId(126, "headicons_pk");
		Class110_Sub1.HeadiconsPrayerCID = arg1.getContainerId(108, "headicons_prayer");
		Class44.HintHeadicoCID = arg1.getContainerId(95, "hint_headicons");
		Class131_Sub31.HintMapMarkerCID = arg1.getContainerId(120, "hint_mapmarkers");
		Class93.MapFlagCID = arg1.getContainerId(124, "mapflag");
		Class74.CrossCID = arg1.getContainerId(arg0 + 120, "cross");
		Class209.MapDotsCID = arg1.getContainerId(98, "mapdots");
		Class131_Sub2_Sub9.ScrollBarCID = arg1.getContainerId(113, "scrollbar");
		Class105.NameIcoCID = arg1.getContainerId(arg0 ^ 0x7c, "name_icons");
		Class131_Sub21.FloorShadowCID = arg1.getContainerId(110, "floorshadows");
		Class131_Sub41_Sub5.CompassCID = arg1.getContainerId(107, "compass");
		GraphicsToolkit.HintMapEdgeCID = arg1.getContainerId(112, "hint_mapedge");
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ve.B(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method2761(int arg0) {
	try {
	    if (arg0 != -23369)
		aClass50Array3066 = null;
	    aClass115_3069 = null;
	    anIntArray3064 = null;
	    aClass50Array3066 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ve.A(" + arg0 + ')');
	}
    }
    
    static {
	aLong3062 = 0L;
	for (int i = 0;
         aClass50Array3066.length > i; i++)
	    aClass50Array3066[i] = new Class50();
    }
}
