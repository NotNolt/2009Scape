package jagex;/* jagex.Class84 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class84
{
    public static int anInt1099;
    public String aString1100;
    public static int anInt1101 = 0;
    public int anInt1102;
    
    public static void method805(String arg0, int arg1, boolean arg2) {
	try {
	    Class131_Sub2_Sub10_Sub1.aClass158_6535.anInt2097 = 1;
	    anInt1099++;
	    arg0 = arg0.toLowerCase();
	    short[] is = new short[16];
	    int i = 0;
	    for (int i_0_ = 0; Class131_Sub14.anInt4289 > i_0_; i_0_++) {
		ItemDefinition itemDefinition = Class131_Sub19.method1808(i_0_, false);
		if ((!arg2 || itemDefinition.aBoolean327) && itemDefinition.anInt318 == -1 && itemDefinition.anInt309 == -1 && itemDefinition.anInt290 == 0 && itemDefinition.itemDefName.toLowerCase().indexOf(arg0) != -1) {
		    if (i >= 250) {
			Cryption.aShortArray1822 = null;
			Class131_Sub22.anInt4449 = -1;
			return;
		    }
		    if (i >= is.length) {
			short[] is_1_ = new short[is.length * 2];
			for (int i_2_ = 0; i_2_ < i; i_2_++)
			    is_1_[i_2_] = is[i_2_];
			is = is_1_;
		    }
		    is[i++] = (short) i_0_;
		}
	    }
	    Class131_Sub22.anInt4449 = i;
	    Cryption.aShortArray1822 = is;
	    Class88.anInt1172 = 0;
	    String[] strings = new String[Class131_Sub22.anInt4449];
	    for (int i_3_ = 0;
             i_3_ < Class131_Sub22.anInt4449;
		 i_3_++)
		strings[i_3_]
		    = Class131_Sub19.method1808(is[i_3_], false).itemDefName;
	    Class94.method860(arg1, Cryption.aShortArray1822, strings);
	    Class131_Sub2_Sub10_Sub1.aClass158_6535.method2356(false);
	    Class131_Sub2_Sub10_Sub1.aClass158_6535.anInt2097 = 2;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ja.A("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ')'));
	}
    }
}
