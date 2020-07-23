package jagex;

import setting.Settings;

/* jagex.Class164 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class164
{
    public static Class163[] aClass163Array2188 = new Class163[Settings.MAX_INDEX_COUNT];
    public static Class34 aClass34_2189;
    public static int anInt2190;
    public static float aFloat2191;
    public static int anInt2192;
    public static Class173 aClass173_2193 = null;
    public static FileSystem aClass158_2194;
    
    public static void method2408(String arg0, boolean arg1, byte arg2) {
	try {
	    anInt2192++;
	    if (arg0 != null) {
		if (Class118.anInt1551 >= 100)
		    Class186.method2562(Class120.IgnoreListFullString, (byte) 53);
		else {
		    String string = Class192.method2622((byte) 79, arg0);
		    if (string != null) {
			for (int i = 0; Class118.anInt1551 > i; i++) {
			    String string_0_
				= Class192.method2622((byte) 43,
						      (Class89.aStringArray3255
						       [i]));
			    if (string_0_ != null
				&& string_0_.equals(string)) {
				Class186.method2562(arg0 + (Class131_Sub18
							    .AlreadyOnIgnoreListString),
						    (byte) 53);
				return;
			    }
			    if (Class23_Sub1_Sub1.aStringArray5090[i]
				!= null) {
				String string_1_
				    = Class192.method2622((byte) 122,
							  (Class23_Sub1_Sub1
							   .aStringArray5090
							   [i]));
				if (string_1_ != null
				    && string_1_.equals(string)) {
				    Class186.method2562(arg0 + (Class131_Sub18
								.AlreadyOnIgnoreListString),
							(byte) 53);
				    return;
				}
			    }
			}
			for (int i = 0;
			     (Class33.anInt469 > i);
			     i++) {
			    String string_2_
				= Class192.method2622((byte) 118,
						      (Class23_Sub2
						       .aStringArray3707[i]));
			    if (string_2_ != null
				&& string_2_.equals(string)) {
				Class186.method2562(((Class131_Sub2_Sub12
						      .PleaseRemoveString)
						     + arg0
						     + Class52.FriendsToIgnoreString),
						    (byte) 53);
				return;
			    }
			    if (Class131_Sub25.aStringArray4477[i] != null) {
				String string_3_
				    = Class192.method2622((byte) 121,
							  (Class131_Sub25
							   .aStringArray4477
							   [i]));
				if (string_3_ != null
				    && string_3_.equals(string)) {
				    Class186.method2562(((Class131_Sub2_Sub12
							  .PleaseRemoveString)
							 + arg0
							 + Class52.FriendsToIgnoreString),
							(byte) 53);
				    return;
				}
			    }
			}
			if (Class192.method2622
				((byte) 67,
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .aString6491))
				.equals(string))
			    Class186.method2562((Class131_Sub41_Sub1
						 .AddSelfToIgnoreListString),
						(byte) 53);
			else {
			    if (arg2 >= -90)
				method2409((byte) 82);
			    Class131_Sub2_Sub39.anInt6077++;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(82);
				System.out.println("Packet 82 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			    Class93.aClass131_Sub15_Sub2_1226.writeByte
				(8, 1 + Class131_Sub30.method1856((byte) -103,
								  arg0));
			    Class93.aClass131_Sub15_Sub2_1226
				.writeString(arg0, (byte) -7);
			    Class93.aClass131_Sub15_Sub2_1226
				.writeByte(-32, !arg1 ? 0 : 1);
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ra.B("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ')'));
	}
    }
    
    public static void method2409(byte arg0) {
	try {
	    aClass34_2189 = null;
	    aClass158_2194 = null;
	    if (arg0 >= -97)
		aClass158_2194 = null;
	    aClass163Array2188 = null;
	    aClass173_2193 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ra.A(" + arg0 + ')');
	}
    }
    
    public static Stream method2410(int arg0) {
	try {
	    anInt2190++;
	    Stream stream = new Stream(37);
	    stream.writeByte(-127, 14);
	    stream.writeByte(-120, Class134.anInt1809);
	    stream.writeByte(5, Class131_Sub9.aBoolean4213 ? 1 : 0);
	    stream.writeByte(-28, !Class91.aBoolean1180 ? 0 : 1);
	    stream.writeByte(-116, Class135.aBoolean1818 ? 1 : 0);
	    stream.writeByte(72, Class183.aBoolean2613 ? 1 : 0);
	    stream.writeByte(arg0 ^ 0x3e0e, 0);
	    stream.writeByte(-17,
				      Class131_Sub33.aBoolean4557 ? 1 : 0);
	    stream.writeByte(arg0 + 15870,
				      Class103.aBoolean1349 ? 1 : 0);
	    stream.writeByte(53, Class121.aBoolean1588 ? 1 : 0);
	    stream.writeByte(18, Class131_Sub2_Sub16.anInt5779);
	    stream.writeByte(-117, !Class167.aBoolean2235 ? 0 : 1);
	    stream.writeByte(27,
				      !Class23_Sub1_Sub2.aBoolean5159 ? 0 : 1);
	    stream
		.writeByte(-113, !Class131_Sub8_Sub1.aBoolean6089 ? 0 : 1);
	    stream.writeByte(-122, Class131_Sub7.anInt4165);
	    stream.writeByte(78, !Class58.aBoolean765 ? 0 : 1);
	    stream.writeByte(-108, Class23_Sub4_Sub2.anInt5380);
	    stream.writeByte(50, Class212.anInt3112);
	    stream.writeByte(arg0 + 15888, InputStream_Sub1.anInt55);
	    stream.writeShort(Class90.anInt1176, (byte) 88);
	    stream.writeShort(Class14.anInt163, (byte) 121);
	    stream.writeByte(arg0 ^ 0x3e02,
				      Class186.method2563(-101));
	    stream.writeInt(Class46_Sub1.anInt3787, (byte) 126);
	    stream.writeByte(-110, Class91.anInt1184);
	    stream
		.writeByte(112, Class131_Sub41_Sub7.aBoolean6255 ? 1 : 0);
	    stream.writeByte(-117,
				      Class131_Sub6.aBoolean4143 ? 1 : 0);
	    stream.writeByte(83, Class141.anInt1876);
	    stream.writeByte(-115, Class177.aBoolean2530 ? 1 : 0);
	    stream.writeByte(-118, Class40.aBoolean533 ? 1 : 0);
	    if (arg0 != -15996)
		return null;
	    stream.writeByte(arg0 ^ ~0x3e44, Class171.anInt2284);
	    stream.writeByte(80,
				      !Class131_Sub13.aBoolean4268 ? 0 : 1);
	    stream.writeByte(-120,
				      Class131_Sub2_Sub10_Sub1.anInt6537);
	    return stream;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ra.C(" + arg0 + ')');
	}
    }
}
