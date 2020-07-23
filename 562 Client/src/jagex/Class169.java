package jagex;/* jagex.Class169 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class169
{
    public static int anInt2265;
    public static Class119 aClass119_2266 = new Class119();
    public static Class214 aClass214_2267;
    public static int anInt2268 = -1;
    public static Class55 aClass55_2269;
    
    public static void method2438(boolean arg0, String arg1, boolean arg2,
				  SignLink arg3, boolean arg4) {
	try {
	    anInt2265++;
	    if (arg0 != false)
		method2438(true, null, true, null, true);
	    if (arg4) {
		if (SignLink.osName.startsWith("win")
		    && SignLink.anInt2902 != 3) {
		    String string = null;
		    if (arg3.BrowserGameFrame != null)
			string = arg3.BrowserGameFrame.getParameter("haveie6");
		    if (string == null || !string.equals("1")) {
			SignlinkNode class139
			    = Class131_Sub2_Sub2.method1481(arg1, arg3,
							    (byte) -86, 0);
			Class91.aSignLink_1178 = arg3;
			Class31.aClass139_442 = class139;
			Class131_Sub41_Sub19.aString6408 = arg1;
			return;
		    }
		}
		if (SignLink.osName.startsWith("mac")) {
		    String string = null;
		    if (arg3.BrowserGameFrame != null)
			string = arg3.BrowserGameFrame.getParameter("havefirefox");
		    if (string != null && string.equals("1") && arg2) {
			Class131_Sub2_Sub2.method1481(arg1, arg3, (byte) -70,
						      1);
			return;
		    }
		}
		Class131_Sub2_Sub2.method1481(arg1, arg3, (byte) -60, 2);
	    } else Class131_Sub2_Sub2.method1481(arg1, arg3, (byte) -57, 3);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("rh.B(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ','
						 + (arg3 != null ? "{...}"
						    : "null")
						 + ',' + arg4 + ')'));
	}
    }
    
    public static void method2439(byte arg0) {
	try {
	    aClass119_2266 = null;
	    aClass214_2267 = null;
	    aClass55_2269 = null;
	    int i = 26 % ((-13 - arg0) / 56);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"rh.A(" + arg0 + ')');
	}
    }
    
    static {
	aClass214_2267 = new Class214(64);
    }
}
