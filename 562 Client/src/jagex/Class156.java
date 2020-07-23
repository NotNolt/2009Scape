package jagex;/* jagex.Class156 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class156
{
    public static int anInt2069;
    public static Class214 aClass214_2070;
    public static int[] anIntArray2071;
    public static int anInt2072;
    public static String ShakeText = "shake:";
    public static FileSystem IDX6;
    public static Class152[] aClass152Array2075;
    
    public static void method2340(int arg0) {
	try {
	    IDX6 = null;
	    if (arg0 != 18000)
		ShakeText = null;
	    aClass214_2070 = null;
	    aClass152Array2075 = null;
	    ShakeText = null;
	    anIntArray2071 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"qh.A(" + arg0 + ')');
	}
    }
    
    static {
	anInt2072 = 0;
	anIntArray2071 = new int[500];
	aClass214_2070 = new Class214(64);
    }
}
