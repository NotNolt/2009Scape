package jagex;/* jagex.Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class2
{
    public static int anInt81;
    public static int anInt82;
    public static Class214 aClass214_83;
    public static int anInt84;
    public static int anInt85;
    public static int[] anIntArray86 = new int[25];
    
    public static void method141(byte arg0, int arg1) {
	try {
	    Class131_Sub41_Sub21_Sub2.anInt6595 = arg1;
	    anInt82++;
	    synchronized (Class153.aClass214_2040) {
		if (arg0 != -120)
		    return;
		Class153.aClass214_2040.method2783(-97);
	    }
	    synchronized (Class131_Sub2_Sub30.aClass214_5988) {
		Class131_Sub2_Sub30.aClass214_5988.method2783(-100);
	    }
	    synchronized (Class192.aClass214_2824) {
		Class192.aClass214_2824.method2783(-109);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ab.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method142(int arg0, int arg1, boolean arg2,
				 GraphicsToolkit arg3, ObjectDefinition arg4, int arg5) {
	try {
	    anInt81++;
	    Class51 class51
		= Class131_Sub2_Sub21.method1573((byte) -110, arg4.anInt2708);
	    if (class51.anInt670 != -1) {
		if (arg4.aBoolean2719) {
		    arg5 += arg4.anInt2695;
		    arg5 &= 0x3;
		} else arg5 = 0;
			Class152 class152
		    = class51.method594(arg4.aBoolean2722, arg5, -31318, arg3);
		if (class152 != null) {
		    int i = arg4.anInt2702;
		    int i_0_ = arg4.anInt2668;
		    if ((arg5 & 0x1) == 1) {
			i_0_ = arg4.anInt2702;
			i = arg4.anInt2668;
		    }
		    int i_1_ = class152.method2216();
		    if (arg2 != false)
			method143(null, -65);
		    int i_2_ = class152.method2198();
		    if (class51.aBoolean684) {
			i_2_ = i_0_ * 4;
			i_1_ = 4 * i;
		    }
		    if (class51.anInt674 == 0)
			class152.method2200(arg1, arg0 - i_0_ * 4 + 4, i_1_,
					    i_2_);
		    else
			class152.method2201(arg1, -(i_0_ * 4) - (-4 - arg0),
					    i_1_, i_2_, 1,
					    class51.anInt674 | ~0xffffff, 1);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ab.B(" + arg0 + ',' + arg1
						 + ',' + arg2 + ','
						 + (arg3 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg4 != null ? "{...}"
						    : "null")
						 + ',' + arg5 + ')'));
	}
    }
    
    public static void method143(Class131_Sub21 arg0, int arg1) {
	anInt85++;
	if (arg0 != null && arg0 != NPCDefinition.aClass119_843.aClass131_1553) {
	    int i = arg0.anInt4444;
	    int i_3_ = arg0.anInt4441;
	    int i_4_ = arg0.anInt4442;
	    int i_5_ = (int) arg0.aLong4437;
	    if (i_4_ >= 2000)
		i_4_ -= 2000;
	    long l = arg0.aLong4437;
	    if (i_4_ == 59) {
		Player class23_sub4_sub1_sub2
		    = Class105.aClass23_Sub4_Sub1_Sub2Array1373[i_5_];
		if (class23_sub4_sub1_sub2 != null) {
		    Class91.anInt1181 = 2;
		    Client.anInt3476++;
		    Class131_Sub41_Sub17.anInt6383 = Class131_Sub11.anInt4246;
		    Class120_Sub2.anInt3966 = Class207.anInt3022;
		    Class23_Sub4_Sub4.anInt5400 = 0;
		    Class93.aClass131_Sub15_Sub2_1226.createPacket(94);
			System.out.println("Packet 94 Sent");//TODO: REMOVE PACKET DEBUG TEXT
		    Class93.aClass131_Sub15_Sub2_1226.writeByte
			(-115,
			 Class131_Sub2_Sub39.aBooleanArray6080[82] ? 1 : 0);
		    Class93.aClass131_Sub15_Sub2_1226.writeLEShort(i_5_,
								 (byte) -115);
		    Class210.method2759
			(-2, class23_sub4_sub1_sub2.anIntArray5328[0], 0, 123,
			 class23_sub4_sub1_sub2.anIntArray5331[0],
			 class23_sub4_sub1_sub2.method335((byte) -78),
			 (Class166.aClass23_Sub4_Sub1_Sub2_2216.anIntArray5328
			  [0]),
			 (Class166.aClass23_Sub4_Sub1_Sub2_2216.anIntArray5331
			  [0]),
			 0, class23_sub4_sub1_sub2.method335((byte) -126),
			 true);
		}
	    }
	    if (i_4_ == 2) {
		Class93.aClass131_Sub15_Sub2_1226.createPacket(248);
		System.out.println("Packet 248 Sent");//TODO: REMOVE PACKET DEBUG TEXT
		Class120_Sub2.anInt3972++;
		Class93.aClass131_Sub15_Sub2_1226.writeInt(i_3_, (byte) 125);
		Class93.aClass131_Sub15_Sub2_1226.writeShortA(i, (byte) -121);
		Class93.aClass131_Sub15_Sub2_1226.writeLEShort(i_5_,
							     (byte) -115);
		Class131_Sub2_Sub1.anInt5561 = 0;
		Class131_Sub41_Sub12.aClass173_6321
		    = Class190.method2615(i_3_, -54);
		Class71.anInt948 = i;
	    }
	    if (i_4_ == 4) {
		Class173 class173
		    = InputStream_Sub1.method87(i, i_3_, (byte) -109);
		if (class173 != null) {
		    Class63.method666(2878);
		    Class131_Sub37 class131_sub37 = Client.method66(class173);
		    Class23_Sub1_Sub2.method303(class131_sub37.anInt4602,
						class173.anInt2374, i, false,
						class173.anInt2303,
						class131_sub37
						    .method1888((byte) 101),
						i_3_);
		    Class131_Sub1_Sub4.anInt5546 = 0;
		    Class131_Sub41_Sub2.DefaultNullString = Class131_Sub2_Sub17.method1552(class173, (byte) 90);
		    if (Class131_Sub41_Sub2.DefaultNullString == null)
			Class131_Sub41_Sub2.DefaultNullString = "Null";
		    if (class173.aBoolean2355)
			GraphicDefinition.aString1453 = class173.aString2391 + "<col=ffffff>";
		    else
			GraphicDefinition.aString1453 = ("<col=00ff00>" + class173.aString2373 + "<col=ffffff>");
		}
	    } else {
		if (i_4_ == 1007 || i_4_ == 1002 || i_4_ == 1010
		    || i_4_ == 1003 || i_4_ == 1004)
		    Class131_Sub2_Sub37.method1637(i, -9328, i_4_, i_5_);
		if (i_4_ == 1009) {
		    Class34.anInt488++;
		    Class91.anInt1181 = 2;
		    Class120_Sub2.anInt3966 = Class207.anInt3022;
		    Class23_Sub4_Sub4.anInt5400 = 0;
		    Class131_Sub41_Sub17.anInt6383 = Class131_Sub11.anInt4246;
		    Class93.aClass131_Sub15_Sub2_1226.createPacket(142);
			System.out.println("Packet 142 Sent");//TODO: REMOVE PACKET DEBUG TEXT
		    Class93.aClass131_Sub15_Sub2_1226.writeShortA(i_5_,
								 (byte) -127);
		}
		if (i_4_ == 18) {
		    Class93.anInt1216++;
		    Class93.aClass131_Sub15_Sub2_1226.createPacket(78);
			System.out.println("Packet 78 Sent");//TODO: REMOVE PACKET DEBUG TEXT
		    Class93.aClass131_Sub15_Sub2_1226.writeInt(i_3_,
								 (byte) 125);
		    Class93.aClass131_Sub15_Sub2_1226.writeShortA(i_5_,
								 (byte) -120);
		    Class93.aClass131_Sub15_Sub2_1226
			.writeShort(Class98.anInt1306, (byte) 98);
		    Class93.aClass131_Sub15_Sub2_1226.writeLEShort(i,
								 (byte) -115);
		    Class93.aClass131_Sub15_Sub2_1226
			.writeInt1((byte) -98, Class88.anInt1161);
		    Class131_Sub2_Sub1.anInt5561 = 0;
		    Class131_Sub41_Sub12.aClass173_6321
			= Class190.method2615(i_3_, -4);
		    Class71.anInt948 = i;
		}
		if (i_4_ == 1005) {
		    Class131_Sub41_Sub17.anInt6383 = Class131_Sub11.anInt4246;
		    Class120_Sub2.anInt3966 = Class207.anInt3022;
		    Class91.anInt1181 = 2;
		    Class131_Sub29.anInt4513++;
		    Class23_Sub4_Sub4.anInt5400 = 0;
		    Class93.aClass131_Sub15_Sub2_1226.createPacket(124);
			System.out.println("Packet 124 Sent");//TODO: REMOVE PACKET DEBUG TEXT
		    Class93.aClass131_Sub15_Sub2_1226.writeLEShortA(-12614, i_5_);
		}
		if (i_4_ == 49) {
		    Player class23_sub4_sub1_sub2
			= Class105.aClass23_Sub4_Sub1_Sub2Array1373[i_5_];
		    if (class23_sub4_sub1_sub2 != null) {
			Class91.anInt1181 = 2;
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class121.anInt1592++;
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(152);
			System.out.println("Packet 152 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			Class93.aClass131_Sub15_Sub2_1226.writeByteS
			    ((!Class131_Sub2_Sub39.aBooleanArray6080[82] ? 0
			      : 1),
			     1549190008);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(i_5_, (byte) 74);
			Class210.method2759
			    (-2, class23_sub4_sub1_sub2.anIntArray5328[0], 0,
			     -61, class23_sub4_sub1_sub2.anIntArray5331[0],
			     class23_sub4_sub1_sub2.method335((byte) -81),
			     (Class166.aClass23_Sub4_Sub1_Sub2_2216
			      .anIntArray5328[0]),
			     (Class166.aClass23_Sub4_Sub1_Sub2_2216
			      .anIntArray5331[0]),
			     0, class23_sub4_sub1_sub2.method335((byte) -85),
			     true);
		    }
		}
		if (i_4_ == 23) {
		    Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
			= (Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379
			   [i_5_]);
		    if (class23_sub4_sub1_sub1 != null) {
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class91.anInt1181 = 2;
			Class1_Sub4.anInt3550++;
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(136);
			System.out.println("Packet 136 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(Class209.anInt3038, (byte) 27);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeInt1((byte) -55, Class182.anInt2604);
			Class93.aClass131_Sub15_Sub2_1226.writeByteA
			    (true, (!Class131_Sub2_Sub39.aBooleanArray6080[82]
				    ? 0 : 1));
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShortA(-12614, Class17.anInt178);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShort(i_5_, (byte) -115);
			Class210.method2759
			    (-2, class23_sub4_sub1_sub1.anIntArray5328[0], 0,
			     101, class23_sub4_sub1_sub1.anIntArray5331[0],
			     class23_sub4_sub1_sub1.method335((byte) -104),
			     (Class166.aClass23_Sub4_Sub1_Sub2_2216
			      .anIntArray5328[0]),
			     (Class166.aClass23_Sub4_Sub1_Sub2_2216
			      .anIntArray5331[0]),
			     0, class23_sub4_sub1_sub1.method335((byte) -38),
			     true);
		    }
		}
		if (i_4_ == 16) {
		    Player class23_sub4_sub1_sub2
			= Class105.aClass23_Sub4_Sub1_Sub2Array1373[i_5_];
		    if (class23_sub4_sub1_sub2 != null) {
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class131.anInt1787++;
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class91.anInt1181 = 2;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(185);
			System.out.println("Packet 185 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			Class93.aClass131_Sub15_Sub2_1226.writeByteA
			    (true, (!Class131_Sub2_Sub39.aBooleanArray6080[82]
				    ? 0 : 1));
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(i_5_, (byte) 39);
			Class210.method2759
			    (-2, class23_sub4_sub1_sub2.anIntArray5328[0], 0,
			     99, class23_sub4_sub1_sub2.anIntArray5331[0],
			     class23_sub4_sub1_sub2.method335((byte) -102),
			     (Class166.aClass23_Sub4_Sub1_Sub2_2216
			      .anIntArray5328[0]),
			     (Class166.aClass23_Sub4_Sub1_Sub2_2216
			      .anIntArray5331[0]),
			     0, class23_sub4_sub1_sub2.method335((byte) -53),
			     true);
		    }
		}
		if (i_4_ == 42) {
		    Class131_Sub2_Sub11.anInt5715++;
		    Class93.aClass131_Sub15_Sub2_1226.createPacket(69);
			System.out.println("Packet 69 Sent");//TODO: REMOVE PACKET DEBUG TEXT
		    Class93.aClass131_Sub15_Sub2_1226.writeInt(i_3_,
								 (byte) 125);
		    Class93.aClass131_Sub15_Sub2_1226.writeShortA(i,
								 (byte) -122);
		    Class93.aClass131_Sub15_Sub2_1226.writeLEShortA(-12614, i_5_);
		    Class131_Sub2_Sub1.anInt5561 = 0;
		    Class131_Sub41_Sub12.aClass173_6321
			= Class190.method2615(i_3_, -67);
		    Class71.anInt948 = i;
		}
		if (i_4_ == 1011) {
		    Class131_Sub41_Sub11_Sub1.anInt6554++;
		    Class131_Sub41_Sub17.anInt6383 = Class131_Sub11.anInt4246;
		    Class120_Sub2.anInt3966 = Class207.anInt3022;
		    Class91.anInt1181 = 2;
		    Class23_Sub4_Sub4.anInt5400 = 0;
		    Class93.aClass131_Sub15_Sub2_1226.createPacket(143);
			System.out.println("Packet 143 Sent");//TODO: REMOVE PACKET DEBUG TEXT
		    Class93.aClass131_Sub15_Sub2_1226.writeLEShortA
			(-12614, (int) (l >>> -1337525664) & 0x7fffffff);
		    Class93.aClass131_Sub15_Sub2_1226.writeByteA
			(true,
			 Class131_Sub2_Sub39.aBooleanArray6080[82] ? 1 : 0);
		    Class93.aClass131_Sub15_Sub2_1226
			.writeLEShortA(-12614, i + Class92.anInt1191);
		    Class93.aClass131_Sub15_Sub2_1226
			.writeLEShortA(-12614, i_3_ - -Class64.anInt818);
		    Class23_Sub4_Sub1.method333(i, i_3_, 25242, l);
		}
		if (i_4_ == 11) {
		    Class63.method666(2878);
		    Class173 class173 = Class190.method2615(i_3_, -83);
		    Class209.anInt3038 = i;
		    Class131_Sub1_Sub4.anInt5546 = 1;
		    Class17.anInt178 = i_5_;
		    Class182.anInt2604 = i_3_;
		    Class23_Sub4_Sub4.method383(-125, class173);
		    Class148.aString1979
			= ("<col=ff9040>"
			   + Class131_Sub19.method1808(i_5_, false).itemDefName
			   + "<col=ffffff>");
		    if (Class148.aString1979 == null)
			Class148.aString1979 = "null";
		} else {
		    if (i_4_ == 44) {
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class91.anInt1181 = 2;
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class121.anInt1587++;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(159);
			System.out.println("Packet 159 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(Class98.anInt1306, (byte) 122);
			Class93.aClass131_Sub15_Sub2_1226.writeShort
			    (0x7fffffff & (int) (l >>> -1466489760),
			     (byte) 97);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeInt1((byte) -58, Class88.anInt1161);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShortA(i - -Class92.anInt1191, (byte) -126);
			Class93.aClass131_Sub15_Sub2_1226.writeByteS
			    ((!Class131_Sub2_Sub39.aBooleanArray6080[82] ? 0
			      : 1),
			     1549190008);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShortA(-12614, i_3_ + Class64.anInt818);
			Class23_Sub4_Sub1.method333(i, i_3_, 25242, l);
		    }
		    if (i_4_ == 8) {
			Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
			    = (Class23_Sub4_Sub2
			       .aClass23_Sub4_Sub1_Sub1Array5379[i_5_]);
			if (class23_sub4_sub1_sub1 != null) {
			    Class120_Sub2.anInt3966 = Class207.anInt3022;
			    Class131_Sub41_Sub17.anInt6383
				= Class131_Sub11.anInt4246;
			    Class23_Sub4_Sub4.anInt5400 = 0;
			    Class91.anInt1181 = 2;
			    Class126.anInt1693++;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(207);
				System.out.println("Packet 207 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			    Class93.aClass131_Sub15_Sub2_1226
				.writeLEShort(i_5_, (byte) -115);
			    Class93.aClass131_Sub15_Sub2_1226.writeByteS
				((!Class131_Sub2_Sub39.aBooleanArray6080[82]
				  ? 0 : 1),
				 1549190008);
			    Class210.method2759
				(-2, class23_sub4_sub1_sub1.anIntArray5328[0],
				 0, -87,
				 class23_sub4_sub1_sub1.anIntArray5331[0],
				 class23_sub4_sub1_sub1.method335((byte) -121),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5328[0]),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5331[0]),
				 0,
				 class23_sub4_sub1_sub1.method335((byte) -64),
				 true);
			}
		    }
		    if (i_4_ == 10) {
			Player class23_sub4_sub1_sub2
			    = Class105.aClass23_Sub4_Sub1_Sub2Array1373[i_5_];
			if (class23_sub4_sub1_sub2 != null) {
			    Class74.anInt1013++;
			    Class23_Sub4_Sub4.anInt5400 = 0;
			    Class120_Sub2.anInt3966 = Class207.anInt3022;
			    Class91.anInt1181 = 2;
			    Class131_Sub41_Sub17.anInt6383
				= Class131_Sub11.anInt4246;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(141);
				System.out.println("Packet 141 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			    Class93.aClass131_Sub15_Sub2_1226.writeByte
				(72, (Class131_Sub2_Sub39.aBooleanArray6080[82]
				      ? 1 : 0));
			    Class93.aClass131_Sub15_Sub2_1226
				.writeShort(i_5_, (byte) 119);
			    Class210.method2759
				(-2, class23_sub4_sub1_sub2.anIntArray5328[0],
				 0, 14,
				 class23_sub4_sub1_sub2.anIntArray5331[0],
				 class23_sub4_sub1_sub2.method335((byte) -38),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5328[0]),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5331[0]),
				 0,
				 class23_sub4_sub1_sub2.method335((byte) -93),
				 true);
			}
		    }
		    if (i_4_ == 38) {
			Class93.aClass131_Sub15_Sub2_1226.createPacket(205);
			System.out.println("Packet 205 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			Class111.anInt3274++;
			Class93.aClass131_Sub15_Sub2_1226
			    .writeInt(i_3_, (byte) 125);
			Class173 class173 = Class190.method2615(i_3_, -58);
			if (class173.anIntArrayArray2327 != null
			    && class173.anIntArrayArray2327[0][0] == 5) {
			    int i_6_ = class173.anIntArrayArray2327[0][1];
			    if (class173.anIntArray2407[0] != Class131_Sub2_Sub13.anIntArray5735[i_6_]) {
				Class131_Sub2_Sub13.anIntArray5735[i_6_]
				    = class173.anIntArray2407[0];
				Class131_Sub8_Sub1.method1683((byte) 102,
							      i_6_);
			    }
			}
		    }
		    if (i_4_ == 25) {
			Player class23_sub4_sub1_sub2
			    = Class105.aClass23_Sub4_Sub1_Sub2Array1373[i_5_];
			if (class23_sub4_sub1_sub2 != null) {
			    Class215.anInt3156++;
			    Class131_Sub41_Sub17.anInt6383
				= Class131_Sub11.anInt4246;
			    Class91.anInt1181 = 2;
			    Class23_Sub4_Sub4.anInt5400 = 0;
			    Class120_Sub2.anInt3966 = Class207.anInt3022;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(79);
				System.out.println("Packet 79 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			    Class93.aClass131_Sub15_Sub2_1226.writeByteC
				(-29012,
				 (Class131_Sub2_Sub39.aBooleanArray6080[82] ? 1
				  : 0));
			    Class93.aClass131_Sub15_Sub2_1226
				.writeLEShort(Class98.anInt1306, (byte) -115);
			    Class93.aClass131_Sub15_Sub2_1226
				.writeInt2(113414280, Class88.anInt1161);
			    Class93.aClass131_Sub15_Sub2_1226
				.writeShortA(i_5_, (byte) -117);
			    Class210.method2759
				(-2, class23_sub4_sub1_sub2.anIntArray5328[0],
				 0, 114,
				 class23_sub4_sub1_sub2.anIntArray5331[0],
				 class23_sub4_sub1_sub2.method335((byte) -32),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5328[0]),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5331[0]),
				 0,
				 class23_sub4_sub1_sub2.method335((byte) -103),
				 true);
			}
		    }
		    if (i_4_ == 47) {
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class131_Sub2_Sub37.anInt6063++;
			Class91.anInt1181 = 2;
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(26);
			System.out.println("Packet 26 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(i + Class92.anInt1191, (byte) 109);
			Class93.aClass131_Sub15_Sub2_1226.writeLEShortA
			    (-12614, (int) (l >>> 425620320) & 0x7fffffff);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShortA(-12614, i_3_ - -Class64.anInt818);
			Class93.aClass131_Sub15_Sub2_1226.writeByte
			    (-111, (!Class131_Sub2_Sub39.aBooleanArray6080[82]
				    ? 0 : 1));
			Class23_Sub4_Sub1.method333(i, i_3_, 25242, l);
		    }
		    if (i_4_ == 40)
			Class131_Sub2.method1458(0, false);
		    if (i_4_ == 20) {
			Player class23_sub4_sub1_sub2
			    = Class105.aClass23_Sub4_Sub1_Sub2Array1373[i_5_];
			if (class23_sub4_sub1_sub2 != null) {
			    Class120_Sub2.anInt3966 = Class207.anInt3022;
			    Class23_Sub4_Sub4.anInt5400 = 0;
			    Class91.anInt1181 = 2;
			    Class131_Sub41_Sub17.anInt6383
				= Class131_Sub11.anInt4246;
			    Class146.anInt1937++;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(128);
				System.out.println("Packet 128 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			    Class93.aClass131_Sub15_Sub2_1226
				.writeShortA(i_5_, (byte) -128);
			    Class93.aClass131_Sub15_Sub2_1226.writeByteA
				(true,
				 (!Class131_Sub2_Sub39.aBooleanArray6080[82]
				  ? 0 : 1));
			    Class210.method2759
				(-2, class23_sub4_sub1_sub2.anIntArray5328[0],
				 0, 103,
				 class23_sub4_sub1_sub2.anIntArray5331[0],
				 class23_sub4_sub1_sub2.method335((byte) -67),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5328[0]),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5331[0]),
				 0,
				 class23_sub4_sub1_sub2.method335((byte) -51),
				 true);
			}
		    }
		    if (i_4_ == 45) {
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class91.anInt1181 = 2;
			Class1_Sub4.anInt3546++;
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(190);
			System.out.println("Packet 190 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			Class93.aClass131_Sub15_Sub2_1226.writeByteS
			    (Class131_Sub2_Sub39.aBooleanArray6080[82] ? 1 : 0,
			     1549190008);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShortA(i_3_ + Class64.anInt818, (byte) -121);
			Class93.aClass131_Sub15_Sub2_1226.writeShort
			    (0x7fffffff & (int) (l >>> 11498848), (byte) 72);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(Class92.anInt1191 + i, (byte) 61);
			Class23_Sub4_Sub1.method333(i, i_3_, 25242, l);
		    }
		    if (i_4_ == 14) {
			Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
			    = (Class23_Sub4_Sub2
			       .aClass23_Sub4_Sub1_Sub1Array5379[i_5_]);
			if (class23_sub4_sub1_sub1 != null) {
			    Class131_Sub41_Sub17.anInt6383
				= Class131_Sub11.anInt4246;
			    Class23_Sub4_Sub4.anInt5400 = 0;
			    Class91.anInt1181 = 2;
			    Class131_Sub41_Sub17_Sub1.anInt6562++;
			    Class120_Sub2.anInt3966 = Class207.anInt3022;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(38);
				System.out.println("Packet 38 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			    Class93.aClass131_Sub15_Sub2_1226
				.writeLEShort(i_5_, (byte) -115);
			    Class93.aClass131_Sub15_Sub2_1226.writeByte
				(-110,
				 (!Class131_Sub2_Sub39.aBooleanArray6080[82]
				  ? 0 : 1));
			    Class210.method2759
				(-2, class23_sub4_sub1_sub1.anIntArray5328[0],
				 0, -108,
				 class23_sub4_sub1_sub1.anIntArray5331[0],
				 class23_sub4_sub1_sub1.method335((byte) -52),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5328[0]),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5331[0]),
				 0,
				 class23_sub4_sub1_sub1.method335((byte) -92),
				 true);
			}
		    }
		    if (i_4_ == 46) {
			Class49.anInt652++;
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class91.anInt1181 = 2;
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(194);
			System.out.println("Packet 194 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShortA(-12614, Class64.anInt818 + i_3_);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShortA(i_5_, (byte) -120);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShortA(-12614, i - -Class92.anInt1191);
			Class93.aClass131_Sub15_Sub2_1226.writeByte
			    (-117, (!Class131_Sub2_Sub39.aBooleanArray6080[82]
				    ? 0 : 1));
			Class131_Sub41_Sub13.method2012(0, i_3_, i);
		    }
		    if (i_4_ == 32) {
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class203.anInt2956++;
			Class91.anInt1181 = 2;
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(40);
			System.out.println("Packet 40 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(Class64.anInt818 + i_3_, (byte) 115);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShortA(-12614, Class17.anInt178);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeInt(Class182.anInt2604, (byte) 125);
			Class93.aClass131_Sub15_Sub2_1226.writeLEShortA(-12614,
								     i_5_);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(Class209.anInt3038, (byte) 125);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShortA(-12614, i + Class92.anInt1191);
			Class93.aClass131_Sub15_Sub2_1226.writeByteA
			    (true, (!Class131_Sub2_Sub39.aBooleanArray6080[82]
				    ? 0 : 1));
			Class131_Sub41_Sub13.method2012(0, i_3_, i);
		    }
		    if (i_4_ == 57) {
			if (Class56.anInt745 > 0
			    && Class131_Sub2_Sub39.aBooleanArray6080[82]
			    && Class131_Sub2_Sub39.aBooleanArray6080[81])
			    Class120_Sub2.method1035(ItemDefinition.anInt300,
						     i_3_ + Class64.anInt818,
						     i + Class92.anInt1191,
						     63);
			else {
			    Class23_Sub4_Sub1_Sub1.method355(i_3_, i_5_, 0, i);
			    if (i_5_ == 1) {
				Class93.aClass131_Sub15_Sub2_1226
				    .writeByte(-112, -1);
				Class93.aClass131_Sub15_Sub2_1226
				    .writeByte(44, -1);
				Class93.aClass131_Sub15_Sub2_1226.writeShort
				    ((int) Class120.aFloat1578, (byte) 88);
				Class93.aClass131_Sub15_Sub2_1226
				    .writeByte(2, 57);
				Class93.aClass131_Sub15_Sub2_1226
				    .writeByte(-13, Class148.anInt1982);
				Class93.aClass131_Sub15_Sub2_1226
				    .writeByte(9, Class1_Sub7.anInt3590);
				Class93.aClass131_Sub15_Sub2_1226
				    .writeByte(-109, 89);
				Class93.aClass131_Sub15_Sub2_1226.writeShort
				    ((Class166.aClass23_Sub4_Sub1_Sub2_2216
				      .anInt3733),
				     (byte) 116);
				Class93.aClass131_Sub15_Sub2_1226.writeShort
				    ((Class166.aClass23_Sub4_Sub1_Sub2_2216
				      .anInt3747),
				     (byte) 77);
				Class93.aClass131_Sub15_Sub2_1226
				    .writeByte(77, 63);
			    } else {
				Class23_Sub4_Sub4.anInt5400 = 0;
				Class120_Sub2.anInt3966 = Class207.anInt3022;
				Class91.anInt1181 = 1;
				Class131_Sub41_Sub17.anInt6383
				    = Class131_Sub11.anInt4246;
			    }
				Class210.method2759(-4, i, 0, 126, i_3_, 1,
						(Class166
						 .aClass23_Sub4_Sub1_Sub2_2216
						 .anIntArray5328[0]),
						(Class166
						 .aClass23_Sub4_Sub1_Sub2_2216
						 .anIntArray5331[0]),
						0, 1, true);
			}
		    }
		    if (i_4_ == 60) {
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class91.anInt1181 = 2;
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class110_Sub2.anInt3908++;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(174);
			System.out.println("Packet 174 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(i + Class92.anInt1191, (byte) 40);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShortA(i_5_, (byte) -124);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShortA(-12614, Class64.anInt818 + i_3_);
			Class93.aClass131_Sub15_Sub2_1226.writeByte
			    (-115, (!Class131_Sub2_Sub39.aBooleanArray6080[82]
				    ? 0 : 1));
			Class131_Sub41_Sub13.method2012(0, i_3_, i);
		    }
		    if (i_4_ == 22)
			Class131_Sub1_Sub4.method1450(i_3_, i, -112);
		    if (i_4_ == 1008) {
			Class91.anInt1181 = 2;
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
			    = (Class23_Sub4_Sub2
			       .aClass23_Sub4_Sub1_Sub1Array5379[i_5_]);
			if (class23_sub4_sub1_sub1 != null) {
			    NPCDefinition NPCDefinition
				= class23_sub4_sub1_sub1.aNPCDefinition_6474;
			    if (NPCDefinition.anIntArray845 != null)
				NPCDefinition = NPCDefinition.method697(true);
			    if (NPCDefinition != null) {
				Class93.aClass131_Sub15_Sub2_1226.createPacket(49);
				System.out.println("Packet 49 Sent");//TODO: REMOVE PACKET DEBUG TEXT
				Class22_Sub1.anInt3659++;
				Class93.aClass131_Sub15_Sub2_1226
				    .writeLEShort(NPCDefinition.anInt900, (byte) -115);
			    }
			}
		    }
		    if (i_4_ == 5) {
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class81.anInt1077++;
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class91.anInt1181 = 2;
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(6);
			System.out.println("Packet 6 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			Class93.aClass131_Sub15_Sub2_1226.writeByte
			    (68, (Class131_Sub2_Sub39.aBooleanArray6080[82] ? 1
				  : 0));
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShort(i_5_, (byte) -115);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShortA(Class64.anInt818 + i_3_, (byte) -121);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShort(i - -Class92.anInt1191, (byte) -115);
			Class131_Sub41_Sub13.method2012(0, i_3_, i);
		    }
		    if (i_4_ == 29) {
			Class173 class173 = Class190.method2615(i_3_, -58);
			boolean bool = true;
			if (class173.anInt2441 > 0)
			    bool = Class214.method2772(class173, -5241);
			if (bool) {
			    Class111.anInt3274++;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(205);
				System.out.println("Packet 205 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			    Class93.aClass131_Sub15_Sub2_1226
				.writeInt(i_3_, (byte) 126);
			}
		    }
		    if (i_4_ == 15) {
			Class93.aClass131_Sub15_Sub2_1226.createPacket(168);
			System.out.println("Packet 168 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			Class115.anInt1481++;
			Class93.aClass131_Sub15_Sub2_1226
			    .writeInt(i_3_, (byte) 127);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShort(i, (byte) -115);
			Class93.aClass131_Sub15_Sub2_1226.writeLEShortA(-12614,
								     i_5_);
			Class131_Sub2_Sub1.anInt5561 = 0;
			Class131_Sub41_Sub12.aClass173_6321
			    = Class190.method2615(i_3_, -6);
			Class71.anInt948 = i;
		    }
		    if (i_4_ == 41) {
			Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
			    = (Class23_Sub4_Sub2
			       .aClass23_Sub4_Sub1_Sub1Array5379[i_5_]);
			if (class23_sub4_sub1_sub1 != null) {
			    Class131_Sub41_Sub17.anInt6383
				= Class131_Sub11.anInt4246;
			    Class91.anInt1181 = 2;
			    Class23_Sub4_Sub4.anInt5400 = 0;
			    Class120_Sub2.anInt3966 = Class207.anInt3022;
			    Class131_Sub29.anInt4509++;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(254);
				System.out.println("Packet 254 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			    Class93.aClass131_Sub15_Sub2_1226
				.writeShortA(i_5_, (byte) -128);
			    Class93.aClass131_Sub15_Sub2_1226.writeByte
				(-20,
				 (!Class131_Sub2_Sub39.aBooleanArray6080[82]
				  ? 0 : 1));
			    Class210.method2759
				(-2, class23_sub4_sub1_sub1.anIntArray5328[0],
				 0, -32,
				 class23_sub4_sub1_sub1.anIntArray5331[0],
				 class23_sub4_sub1_sub1.method335((byte) -98),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5328[0]),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5331[0]),
				 0,
				 class23_sub4_sub1_sub1.method335((byte) -99),
				 true);
			}
		    }
		    if (i_4_ == 36 || i_4_ == 1006)
			Class5.method161((byte) 31, arg0.aString4445, i_3_,
					 i_5_, i);
		    if (i_4_ == 34) {
			Class111.anInt3274++;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(205);
			System.out.println("Packet 205 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			Class93.aClass131_Sub15_Sub2_1226
			    .writeInt(i_3_, (byte) 125);
			Class173 class173 = Class190.method2615(i_3_, -66);
			if (class173.anIntArrayArray2327 != null
			    && class173.anIntArrayArray2327[0][0] == 5) {
			    int i_7_ = class173.anIntArrayArray2327[0][1];
			    Class131_Sub2_Sub13.anIntArray5735[i_7_]
				= 1 - Class131_Sub2_Sub13.anIntArray5735[i_7_];
			    Class131_Sub8_Sub1.method1683((byte) 37, i_7_);
			}
		    }
		    if (i_4_ == 39) {
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class91.anInt1181 = 2;
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class131_Sub2_Sub26.anInt5928++;
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(12);
			System.out.println("Packet 12 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShortA(i_3_ + Class64.anInt818, (byte) -123);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShortA(-12614, Class92.anInt1191 + i);
			Class93.aClass131_Sub15_Sub2_1226.writeByte
			    (-28, (!Class131_Sub2_Sub39.aBooleanArray6080[82]
				   ? 0 : 1));
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShort(i_5_, (byte) -115);
			Class131_Sub41_Sub13.method2012(0, i_3_, i);
		    }
		    if (arg1 < 79)
			aClass214_83 = null;
		    if (i_4_ == 24
			&& Class164.aClass173_2193 == null) {
			Class160.method2383(false, i_3_, i);
			Class164.aClass173_2193
			    = InputStream_Sub1.method87(i, i_3_, (byte) -101);
			Class23_Sub4_Sub4.method383(-117,
						    Class164.aClass173_2193);
		    }
		    if (i_4_ == 48) {
			Class93.aClass131_Sub15_Sub2_1226.createPacket(111);
			System.out.println("Packet 111 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			Class1_Sub2.anInt3506++;
			Class93.aClass131_Sub15_Sub2_1226
			    .writeInt(i_3_, (byte) 125);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(i, (byte) 57);
			Class93.aClass131_Sub15_Sub2_1226.writeLEShortA(-12614,
								     i_5_);
			Class131_Sub2_Sub1.anInt5561 = 0;
			Class131_Sub41_Sub12.aClass173_6321
			    = Class190.method2615(i_3_, -22);
			Class71.anInt948 = i;
		    }
		    if (i_4_ == 50) {
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class58.anInt764++;
			Class91.anInt1181 = 1;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(241);
			System.out.println("Packet 241 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShortA(i_3_ + Class64.anInt818, (byte) -124);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShortA(-12614, i + Class92.anInt1191);
			Class93.aClass131_Sub15_Sub2_1226
			    .method1769(Class88.anInt1161, -2062);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShort(Class98.anInt1306, (byte) -115);
			Class210.method2759(-4, i, 0, 113, i_3_, 1,
					    (Class166
					     .aClass23_Sub4_Sub1_Sub2_2216
					     .anIntArray5328[0]),
					    (Class166
					     .aClass23_Sub4_Sub1_Sub2_2216
					     .anIntArray5331[0]),
					    0, 1, true);
		    }
		    if (i_4_ == 12) {
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class91.anInt1181 = 2;
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class131_Sub41.anInt4676++;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(202);
			System.out.println("Packet 202 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShort(i_3_ - -Class64.anInt818, (byte) -115);
			Class93.aClass131_Sub15_Sub2_1226.writeLEShort
			    (0x7fffffff & (int) (l >>> -771693984),
			     (byte) -115);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeInt1((byte) -61, Class182.anInt2604);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShortA(Class17.anInt178, (byte) -125);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShortA(Class209.anInt3038, (byte) -123);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShort(i + Class92.anInt1191, (byte) -115);
			Class93.aClass131_Sub15_Sub2_1226.writeByteA
			    (true, (!Class131_Sub2_Sub39.aBooleanArray6080[82]
				    ? 0 : 1));
			Class23_Sub4_Sub1.method333(i, i_3_, 25242, l);
		    }
		    if (i_4_ == 26) {
			Class131_Sub41_Sub11.anInt6297++;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(229);
			System.out.println("Packet 229 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			Class93.aClass131_Sub15_Sub2_1226
			    .writeInt(i_3_, (byte) 127);
			Class93.aClass131_Sub15_Sub2_1226.writeLEShortA(-12614,
								     i_5_);
			Class93.aClass131_Sub15_Sub2_1226.writeLEShortA(-12614,
								     i);
			Class131_Sub2_Sub1.anInt5561 = 0;
			Class131_Sub41_Sub12.aClass173_6321
			    = Class190.method2615(i_3_, -93);
			Class71.anInt948 = i;
		    }
		    if (i_4_ == 58) {
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class6.anInt94++;
			Class91.anInt1181 = 2;
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(151);
			System.out.println("Packet 151 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShortA(-12614, Class92.anInt1191 + i);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(i_3_ + Class64.anInt818, (byte) 70);
			Class93.aClass131_Sub15_Sub2_1226.writeByte
			    (-114, (Class131_Sub2_Sub39.aBooleanArray6080[82]
				    ? 1 : 0));
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShort(i_5_, (byte) -115);
			Class131_Sub41_Sub13.method2012(0, i_3_, i);
		    }
		    if (i_4_ == 21) {
			Player class23_sub4_sub1_sub2
			    = Class105.aClass23_Sub4_Sub1_Sub2Array1373[i_5_];
			if (class23_sub4_sub1_sub2 != null) {
			    Class23_Sub4_Sub4.anInt5400 = 0;
			    Class120_Sub2.anInt3966 = Class207.anInt3022;
			    Class23_Sub5_Sub1.anInt5032++;
			    Class131_Sub41_Sub17.anInt6383
				= Class131_Sub11.anInt4246;
			    Class91.anInt1181 = 2;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(35);
				System.out.println("Packet 35 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			    Class93.aClass131_Sub15_Sub2_1226
				.writeShort(i_5_, (byte) 112);
			    Class93.aClass131_Sub15_Sub2_1226.writeByteC
				(-29012,
				 (!Class131_Sub2_Sub39.aBooleanArray6080[82]
				  ? 0 : 1));
			    Class210.method2759
				(-2, class23_sub4_sub1_sub2.anIntArray5328[0],
				 0, 88,
				 class23_sub4_sub1_sub2.anIntArray5331[0],
				 class23_sub4_sub1_sub2.method335((byte) -108),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5328[0]),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5331[0]),
				 0,
				 class23_sub4_sub1_sub2.method335((byte) -82),
				 true);
			}
		    }
		    if (i_4_ == 17) {
			if (Class56.anInt745 > 0
			    && Class131_Sub2_Sub39.aBooleanArray6080[82]
			    && Class131_Sub2_Sub39.aBooleanArray6080[81])
			    Class120_Sub2.method1035(ItemDefinition.anInt300,
						     Class64.anInt818 - -i_3_,
						     Class92.anInt1191 - -i,
						     63);
			else {
			    Class131_Sub23.anInt4450++;
			    Class131_Sub41_Sub17.anInt6383
				= Class131_Sub11.anInt4246;
			    Class23_Sub4_Sub4.anInt5400 = 0;
			    Class120_Sub2.anInt3966 = Class207.anInt3022;
			    Class91.anInt1181 = 1;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(160);
				System.out.println("Packet 160 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			    Class93.aClass131_Sub15_Sub2_1226.writeShortA
				(i + Class92.anInt1191, (byte) -127);
			    Class93.aClass131_Sub15_Sub2_1226.writeLEShort
				(i_3_ + Class64.anInt818, (byte) -115);
			}
		    }
		    if (i_4_ == 28) {
			Player class23_sub4_sub1_sub2
			    = Class105.aClass23_Sub4_Sub1_Sub2Array1373[i_5_];
			if (class23_sub4_sub1_sub2 != null) {
			    Class91.anInt1181 = 2;
			    Class120_Sub2.anInt3966 = Class207.anInt3022;
			    Class154.anInt2054++;
			    Class131_Sub41_Sub17.anInt6383
				= Class131_Sub11.anInt4246;
			    Class23_Sub4_Sub4.anInt5400 = 0;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(114);
				System.out.println("Packet 114 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			    Class93.aClass131_Sub15_Sub2_1226.writeShort(i_5_, (byte) 54);
			    Class93.aClass131_Sub15_Sub2_1226.writeByteC(-29012,(Class131_Sub2_Sub39.aBooleanArray6080[82] ? 1 : 0));
			    Class210.method2759(-2, class23_sub4_sub1_sub2.anIntArray5328[0], 0, -62, class23_sub4_sub1_sub2.anIntArray5331[0], class23_sub4_sub1_sub2.method335((byte) -45), (Class166.aClass23_Sub4_Sub1_Sub2_2216.anIntArray5328[0]),(Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5331[0]),
				 0,
				 class23_sub4_sub1_sub2.method335((byte) -67),
				 true);
			}
		    }
		    if (i_4_ == 1) {
			Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
			    = (Class23_Sub4_Sub2
			       .aClass23_Sub4_Sub1_Sub1Array5379[i_5_]);
			if (class23_sub4_sub1_sub1 != null) {
			    Class120_Sub2.anInt3966 = Class207.anInt3022;
			    Class91.anInt1181 = 2;
			    Class131_Sub41_Sub17.anInt6383
				= Class131_Sub11.anInt4246;
			    Class23_Sub4_Sub4.anInt5400 = 0;
			    Class52.anInt693++;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(95);
				System.out.println("Packet 95 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			    Class93.aClass131_Sub15_Sub2_1226
				.writeLEShort(i_5_, (byte) -115);
			    Class93.aClass131_Sub15_Sub2_1226.writeByteC
				(-29012,
				 (Class131_Sub2_Sub39.aBooleanArray6080[82] ? 1
				  : 0));
			    Class210.method2759
				(-2, class23_sub4_sub1_sub1.anIntArray5328[0],
				 0, 87,
				 class23_sub4_sub1_sub1.anIntArray5331[0],
				 class23_sub4_sub1_sub1.method335((byte) -39),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5328[0]),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5331[0]),
				 0,
				 class23_sub4_sub1_sub1.method335((byte) -35),
				 true);
			}
		    }
		    if (i_4_ == 7) {
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			GraphicsToolkit.anInt1768++;
			Class91.anInt1181 = 2;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(54);
			System.out.println("Packet 54 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(Class98.anInt1306, (byte) 119);
			Class93.aClass131_Sub15_Sub2_1226.writeByte
			    (-109, (Class131_Sub2_Sub39.aBooleanArray6080[82]
				    ? 1 : 0));
			Class93.aClass131_Sub15_Sub2_1226.writeLEShortA(-12614,
								     i_5_);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShortA(-12614, i - -Class92.anInt1191);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeInt1((byte) -127, Class88.anInt1161);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(i_3_ - -Class64.anInt818, (byte) 94);
			Class131_Sub41_Sub13.method2012(0, i_3_, i);
		    }
		    if (i_4_ == 13) {
			Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
			    = (Class23_Sub4_Sub2
			       .aClass23_Sub4_Sub1_Sub1Array5379[i_5_]);
			if (class23_sub4_sub1_sub1 != null) {
			    Class131_Sub41_Sub17.anInt6383
				= Class131_Sub11.anInt4246;
			    Class67.anInt906++;
			    Class120_Sub2.anInt3966 = Class207.anInt3022;
			    Class91.anInt1181 = 2;
			    Class23_Sub4_Sub4.anInt5400 = 0;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(84);
				System.out.println("Packet 84 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			    Class93.aClass131_Sub15_Sub2_1226
				.writeLEShort(Class98.anInt1306, (byte) -115);
			    Class93.aClass131_Sub15_Sub2_1226
				.writeShort(i_5_, (byte) 121);
			    Class93.aClass131_Sub15_Sub2_1226.writeByteA
				(true,
				 (Class131_Sub2_Sub39.aBooleanArray6080[82] ? 1
				  : 0));
			    Class93.aClass131_Sub15_Sub2_1226
				.writeInt2(113414280, Class88.anInt1161);
			    Class210.method2759
				(-2, class23_sub4_sub1_sub1.anIntArray5328[0],
				 0, 0,
				 class23_sub4_sub1_sub1.anIntArray5331[0],
				 class23_sub4_sub1_sub1.method335((byte) -67),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5328[0]),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5331[0]),
				 0,
				 class23_sub4_sub1_sub1.method335((byte) -83),
				 true);
			}
		    }
		    if (i_4_ == 51) {
			Player class23_sub4_sub1_sub2
			    = Class105.aClass23_Sub4_Sub1_Sub2Array1373[i_5_];
			if (class23_sub4_sub1_sub2 != null) {
			    Class91.anInt1181 = 2;
			    Class131_Sub9.anInt4204++;
			    Class120_Sub2.anInt3966 = Class207.anInt3022;
			    Class23_Sub4_Sub4.anInt5400 = 0;
			    Class131_Sub41_Sub17.anInt6383
				= Class131_Sub11.anInt4246;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(140);
				System.out.println("Packet 140 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			    Class93.aClass131_Sub15_Sub2_1226
				.writeLEShort(i_5_, (byte) -115);
			    Class93.aClass131_Sub15_Sub2_1226.writeByteC
				(-29012,
				 (Class131_Sub2_Sub39.aBooleanArray6080[82] ? 1
				  : 0));
			    Class210.method2759
				(-2, class23_sub4_sub1_sub2.anIntArray5328[0],
				 0, 105,
				 class23_sub4_sub1_sub2.anIntArray5331[0],
				 class23_sub4_sub1_sub2.method335((byte) -82),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5328[0]),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5331[0]),
				 0,
				 class23_sub4_sub1_sub2.method335((byte) -33),
				 true);
			}
		    }
		    if (i_4_ == 33) {
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class127_Sub1.anInt4006++;
			Class91.anInt1181 = 2;
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(181);
			System.out.println("Packet 181 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShortA(Class92.anInt1191 + i, (byte) -127);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShortA(-12614, i_3_ + Class64.anInt818);
			Class93.aClass131_Sub15_Sub2_1226.writeShort
			    (0x7fffffff & (int) (l >>> -203828896),
			     (byte) 113);
			Class93.aClass131_Sub15_Sub2_1226.writeByte
			    (47, (Class131_Sub2_Sub39.aBooleanArray6080[82] ? 1
				  : 0));
			Class23_Sub4_Sub1.method333(i, i_3_, 25242, l);
		    }
		    if (i_4_ == 37) {
			Class166.anInt2211++;
			Class91.anInt1181 = 2;
			Class120_Sub2.anInt3966 = Class207.anInt3022;
			Class131_Sub41_Sub17.anInt6383
			    = Class131_Sub11.anInt4246;
			Class23_Sub4_Sub4.anInt5400 = 0;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(45);
			System.out.println("Packet 45 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(i - -Class92.anInt1191, (byte) 27);
			Class93.aClass131_Sub15_Sub2_1226.writeByteA
			    (true, (!Class131_Sub2_Sub39.aBooleanArray6080[82]
				    ? 0 : 1));
			Class93.aClass131_Sub15_Sub2_1226.writeLEShort
			    (0x7fffffff & (int) (l >>> 1058159840),
			     (byte) -115);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShort(i_3_ + Class64.anInt818, (byte) -115);
			Class23_Sub4_Sub1.method333(i, i_3_, 25242, l);
		    }
		    if (i_4_ == 31) {
			Class131_Sub21.anInt4435++;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(29);
			System.out.println("Packet 29 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			Class93.aClass131_Sub15_Sub2_1226
			    .writeInt(i_3_, (byte) 125);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(i_5_, (byte) 45);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShort(i, (byte) -115);
			Class131_Sub2_Sub1.anInt5561 = 0;
			Class131_Sub41_Sub12.aClass173_6321
			    = Class190.method2615(i_3_, -94);
			Class71.anInt948 = i;
		    }
		    if (i_4_ == 19) {
			Class92.anInt1190++;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(53);
			System.out.println("Packet 53 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			Class93.aClass131_Sub15_Sub2_1226
			    .writeInt(i_3_, (byte) 126);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShortA(i_5_, (byte) -127);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShortA(i, (byte) -122);
			Class131_Sub2_Sub1.anInt5561 = 0;
			Class131_Sub41_Sub12.aClass173_6321
			    = Class190.method2615(i_3_, -30);
			Class71.anInt948 = i;
		    }
		    if (i_4_ == 6) {
			Class93.aClass131_Sub15_Sub2_1226.createPacket(234);
			System.out.println("Packet 234 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			Class200.anInt2925++;
			Class93.aClass131_Sub15_Sub2_1226
			    .writeInt(i_3_, (byte) 126);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShortA(i_5_, (byte) -125);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShort(i, (byte) -115);
			Class131_Sub2_Sub1.anInt5561 = 0;
			Class131_Sub41_Sub12.aClass173_6321
			    = Class190.method2615(i_3_, -108);
			Class71.anInt948 = i;
		    }
		    if (i_4_ == 35) {
			Class44.anInt592++;
			Class93.aClass131_Sub15_Sub2_1226.createPacket(117);
			System.out.println("Packet 117 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			Class93.aClass131_Sub15_Sub2_1226
			    .writeInt(i_3_, (byte) 125);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(Class209.anInt3038, (byte) 60);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(i, (byte) 118);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShortA(-12614, Class17.anInt178);
			Class93.aClass131_Sub15_Sub2_1226
			    .method1769(Class182.anInt2604, -2062);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeLEShort(i_5_, (byte) -115);
			Class131_Sub2_Sub1.anInt5561 = 0;
			Class131_Sub41_Sub12.aClass173_6321
			    = Class190.method2615(i_3_, -64);
			Class71.anInt948 = i;
		    }
		    if (i_4_ == 3) {
			Class93.aClass131_Sub15_Sub2_1226.createPacket(189);
			System.out.println("Packet 189 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			Class75.anInt1031++;
			Class93.aClass131_Sub15_Sub2_1226
			    .writeInt(i_3_, (byte) 125);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(i, (byte) 42);
			Class93.aClass131_Sub15_Sub2_1226.writeLEShortA(-12614,
								     i_5_);
			Class131_Sub2_Sub1.anInt5561 = 0;
			Class131_Sub41_Sub12.aClass173_6321
			    = Class190.method2615(i_3_, -41);
			Class71.anInt948 = i;
		    }
		    if (i_4_ == 1012) {
			Class173 class173 = Class190.method2615(i_3_, -15);
			if (class173 == null || class173.anIntArray2418[i] < 100000) {
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(124);
				System.out.println("Packet 124 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			    Class131_Sub29.anInt4513++;
			    Class93.aClass131_Sub15_Sub2_1226
				.writeLEShortA(-12614, i_5_);
			} else
			    Class186.method2562((String.valueOf(class173
								.anIntArray2418
								[i])
						 + " x "
						 + (Class131_Sub19.method1808
						    (i_5_, false).itemDefName)),
						(byte) 53);
			Class131_Sub2_Sub1.anInt5561 = 0;
			Class131_Sub41_Sub12.aClass173_6321
			    = Class190.method2615(i_3_, -113);
			Class71.anInt948 = i;
		    }
		    if (i_4_ == 9) {
			Player class23_sub4_sub1_sub2
			    = Class105.aClass23_Sub4_Sub1_Sub2Array1373[i_5_];
			if (class23_sub4_sub1_sub2 != null) {
			    Class23_Sub4_Sub4.anInt5400 = 0;
			    Class120_Sub2.anInt3966 = Class207.anInt3022;
			    Class91.anInt1181 = 2;
			    Class131_Sub41_Sub13.anInt6323++;
			    Class131_Sub41_Sub17.anInt6383
				= Class131_Sub11.anInt4246;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(138);
				System.out.println("Packet 138 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			    Class93.aClass131_Sub15_Sub2_1226
				.writeLEShort(i_5_, (byte) -115);
			    Class93.aClass131_Sub15_Sub2_1226.writeByte
				(-108,
				 (!Class131_Sub2_Sub39.aBooleanArray6080[82]
				  ? 0 : 1));
			    Class93.aClass131_Sub15_Sub2_1226
				.writeLEShort(Class209.anInt3038, (byte) -115);
			    Class93.aClass131_Sub15_Sub2_1226
				.writeLEShortA(-12614, Class17.anInt178);
			    Class93.aClass131_Sub15_Sub2_1226
				.writeInt(Class182.anInt2604, (byte) 125);
			    Class210.method2759
				(-2, class23_sub4_sub1_sub2.anIntArray5328[0],
				 0, 99,
				 class23_sub4_sub1_sub2.anIntArray5331[0],
				 class23_sub4_sub1_sub2.method335((byte) -45),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5328[0]),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5331[0]),
				 0,
				 class23_sub4_sub1_sub2.method335((byte) -30),
				 true);
			}
		    }
		    if (i_4_ == 30) {
			Class93.aClass131_Sub15_Sub2_1226.createPacket(66);
			System.out.println("Packet 66 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			Class76.anInt1038++;
			Class93.aClass131_Sub15_Sub2_1226
			    .writeInt(i_3_, (byte) 125);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShort(i_5_, (byte) 52);
			Class93.aClass131_Sub15_Sub2_1226
			    .writeShortA(i, (byte) -121);
			Class131_Sub2_Sub1.anInt5561 = 0;
			Class131_Sub41_Sub12.aClass173_6321
			    = Class190.method2615(i_3_, -5);
			Class71.anInt948 = i;
		    }
		    if (i_4_ == 43) {
			Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
			    = (Class23_Sub4_Sub2
			       .aClass23_Sub4_Sub1_Sub1Array5379[i_5_]);
			if (class23_sub4_sub1_sub1 != null) {
			    Class23_Sub4_Sub4.anInt5400 = 0;
			    Class120_Sub2.anInt3966 = Class207.anInt3022;
			    Class91.anInt1181 = 2;
			    Class131_Sub41_Sub17.anInt6383
				= Class131_Sub11.anInt4246;
			    Class131_Sub27.anInt4490++;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(217);
				System.out.println("Packet 217 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			    Class93.aClass131_Sub15_Sub2_1226.writeByteS
				((!Class131_Sub2_Sub39.aBooleanArray6080[82]
				  ? 0 : 1),
				 1549190008);
			    Class93.aClass131_Sub15_Sub2_1226
				.writeShortA(i_5_, (byte) -117);
			    Class210.method2759
				(-2, class23_sub4_sub1_sub1.anIntArray5328[0],
				 0, -99,
				 class23_sub4_sub1_sub1.anIntArray5331[0],
				 class23_sub4_sub1_sub1.method335((byte) -99),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5328[0]),
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5331[0]),
				 0,
				 class23_sub4_sub1_sub1.method335((byte) -76),
				 true);
			}
		    }
		    if (Class131_Sub1_Sub4.anInt5546 != 0) {
			Class131_Sub1_Sub4.anInt5546 = 0;
			Class23_Sub4_Sub4.method383
			    (-88,
			     Class190.method2615(Class182.anInt2604, -106));
		    }
		    if (Class154.aBoolean2047)
			Class63.method666(2878);
		    if (Class131_Sub41_Sub12.aClass173_6321 != null
			&& Class131_Sub2_Sub1.anInt5561 == 0)
			Class23_Sub4_Sub4.method383(-109, (Class131_Sub41_Sub12
							   .aClass173_6321));
		}
	    }
	}
    }
    
    public static void method144(int arg0) {
	try {
	    if (arg0 != 42)
		anIntArray86 = null;
	    anIntArray86 = null;
	    aClass214_83 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ab.D(" + arg0 + ')');
	}
    }
    
    static {
	aClass214_83 = new Class214(50);
    }
}
