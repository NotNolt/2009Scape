package jagex;/* jagex.Login - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;

public class Login
{
    public static int anInt1753;
    public static int anInt1754;
    public static int anInt1755;
    public static int anInt1756;
    public static Class214 aClass214_1757 = new Class214(50);
    public static int anInt1758;
    public static int anInt1759;
    public static int anInt1760;
    public int[] anIntArray1761;
    public static int anInt1762;
    public static int anInt1763 = 0;

    public static void method1149(byte arg0) {
	if (arg0 == 7) {
	    anInt1756++;
	    if (Class75.anInt1024 != 0 && Class75.anInt1024 != 5) {
			//System.out.println(Class75.anInt1024 + " !=0 || " + Class75.anInt1024 + " !=5"); //Cleared Move onto next
		try {
		    if (++Class110_Sub4.anInt3940 > 2000) {//Cleared Move onto Next
				System.out.println(Class110_Sub4.anInt3940);//Skip
			if (Class128_Sub1.aClass33_4013 != null) {
			    Class128_Sub1.aClass33_4013.method452(-1);
			    Class128_Sub1.aClass33_4013 = null;
			}
			if (PacketStream.anInt6130 >= 1) {//When Full Cache this is Less Than 1
				System.out.println(PacketStream.anInt6130);//SKIP
			    Class75.anInt1024 = 0;
			    Class4.anInt3281 = -5;
			    return;
			}
			Class110_Sub4.anInt3940 = 0;
			System.out.println("Class110_Sub4.anInt3940 = " + Class110_Sub4.anInt3940);
			PacketStream.anInt6130++;
			System.out.println("PacketStream.anInt6130++ = " + PacketStream.anInt6130);
			Class75.anInt1024 = 1;
			if (Class131_Sub2_Sub31.ConnectionPort == Class43.anInt590)
				Class131_Sub2_Sub31.ConnectionPort = Class131_Sub14.anInt4288;
			else
			    Class131_Sub2_Sub31.ConnectionPort = Class43.anInt590;
				System.out.println("Class131_Sub2_sub31 != Class43.anInt590:: FALSE");
		    }
		    if (Class75.anInt1024 == 1) {
			System.out.println("Class75.anInt1024 is true");
			Class17.aClass139_183 = (Class23_Sub4.aSignLink_3734.method2703(Class191.aString2817, (byte) 127, Class131_Sub2_Sub31.ConnectionPort));//Ip Address for, Byte 127, Port
			System.out.println("Establishing Connections... :: String: " + Class191.aString2817 + " :: Byte 127 :: Int: " + Class131_Sub2_Sub31.ConnectionPort);
			Class75.anInt1024 = 2;
		    }
		    if (Class75.anInt1024 == 2) {//If the Ip, byte and port are sent this is True
			if (Class17.aClass139_183.status == 2)//Should never throw
			    throw new IOException();
			if (Class17.aClass139_183.status != 1)//Should never throw
			    return;
			Class128_Sub1.aClass33_4013 = new Class33(((Socket)Class17.aClass139_183.anObject1866),Class23_Sub4.aSignLink_3734);//This one opens the Socket for packet sending
			Class17.aClass139_183 = null;//Defaulter for use elsewhere

				/**
				 *	Player Username Conversion
 				 */
			long PlayerUsernameAsLong = (Class173.aLong2428 = Class173.method2454(Class64.PlayerUsernameString,65535));//Username is converted to long here, not sent
			System.out.println("Class173.aLong2428:: " + Class173.aLong2428);
			System.out.println("Class64.PlayerUsernameString:: " + Class64.PlayerUsernameString);
			System.out.println("Client Login Debug <long>:: " + PlayerUsernameAsLong);
				 /**
				  *
				  */

			//Packet 0 Used for pinging the server, has 0 data
			Class93.aClass131_Sub15_Sub2_1226.anInt4360 = 0;

			//Uses int @nameHash = <Byte math>
			int nameHash = (int) (0x1fL & PlayerUsernameAsLong >> 16);//Login Packet 16 Constructor

			//HSReadEvent Byte of -109, Opcode/Packet 14 JS5ReadEvent PACKET
			Class93.aClass131_Sub15_Sub2_1226.writeByte(-109, 14);

			//LoginReadEvent Byte of -118, Opcode/Packet 16 (from nameHash) LoginReadEvent PACKET
			Class93.aClass131_Sub15_Sub2_1226.writeByte(-118, nameHash);

			//Method that accepts arg0, arg1, arg2, byte arg3[] ** aByteArray4324 PacketStream
			Class128_Sub1.aClass33_4013.method454(105, 2, 0, Class93.aClass131_Sub15_Sub2_1226.aByteArray4324);
			System.out.println(Arrays.toString(Class93.aClass131_Sub15_Sub2_1226.aByteArray4324));

			//Neither of these are null, arg0 stays same
			if (Class131_Sub35.aClass215_4588 != null)
				System.out.println("Class131_Sub35.aClass215_4588 is not null");
			    Class131_Sub35.aClass215_4588.method2800(0);
			if (Client.aClass215_3470 != null)
				System.out.println("Client.aClass215_3470 is not null");
			    Client.aClass215_3470.method2800(0);

			//Client is requesting Input Stream from server
			int i_0_ = Class128_Sub1.aClass33_4013.method444(-1707);
			System.out.println("Response from server: " + i_0_);

			//Neither of these are null, arg0 is 54, aBoolean3183 = true; anInt3158++; (Most of the time)
			if (Class131_Sub35.aClass215_4588 != null)
				System.out.println("Class131_Sub35.aClass215_4588 is not null");
			    Class131_Sub35.aClass215_4588.method2800(0);
			if (Client.aClass215_3470 != null)
				System.out.println("Client.aClass215_3470 is not null");
			    Client.aClass215_3470.method2800(arg0 + -7);

			//Open stream from server as long as the server sends something back
			if (i_0_ != 0) {
			    Class4.anInt3281 = i_0_;
			    Class75.anInt1024 = 0;
			    Class128_Sub1.aClass33_4013.method452(-1);
			    Class128_Sub1.aClass33_4013 = null;//Closes thread for listening
			    return;
			}

			//Moves onto the next stage of login
			Class75.anInt1024 = 3;
		    }
		    if (Class75.anInt1024 == 3) {//Returns true
		    	System.out.println(Class75.anInt1024 + " == x");
			if (Class128_Sub1.aClass33_4013.method450((byte) 17) < 8)
			    return;//Reopens input stream if certain values are met


			//Arg1 <Used in method> || Arg2, Arg1, Arg3 Input stream read in that order
			Class128_Sub1.aClass33_4013.method451(53, 0, (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.aByteArray4324), 8);
			System.out.println(Arrays.toString(Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.aByteArray4324));


			//new Packet Stream of 5000, First ping after "Decoded world login request opcode 16 (aka this is why 0 is showing up first)
			Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.anInt4360 = 0;


			Class1.aLong79 = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readLong(-117);// client revision but idk how
			System.out.println("LongClass1.aLong79 == " + Class1.aLong79);

			//New int Array[4]
			int[] DisplayInformation = new int[4];

			//Gets and Sets values from aLong79 **SCREEN HEIGHT** as Short
			DisplayInformation[3] = (int) Class1.aLong79;

			//Gets and Sets values from aLong79 w/bitshift **SCREEN WIDTH** as Short
			DisplayInformation[2] = (int) (Class1.aLong79 >> 32);

			//Used as placeholder/unkown value
			DisplayInformation[0] = (int) (Math.random() * 9.9999999E7);


			Class93.aClass131_Sub15_Sub2_1226.anInt4360 = 0;//Used to ping the server (packet 0)

			//Gets and Sets values from aLong79 w/ Math Random **DISPLAY MODE** as Byte
			DisplayInformation[1] = (int) (Math.random() * 9.9999999E7);
			System.out.println(Arrays.toString(DisplayInformation));

			//Sends Packet 10 with a byte of -22
			Class93.aClass131_Sub15_Sub2_1226.writeByte(-22, 10);//Packet 10 gets sent

			//Big ole Block of data being sent over to the server
			Class93.aClass131_Sub15_Sub2_1226.writeInt(DisplayInformation[0], (byte) 125);//? Read as Byte
			Class93.aClass131_Sub15_Sub2_1226.writeInt(DisplayInformation[1], (byte) 127);//Display Mode 1 Fixed, 2 Resize, 3 Fullscreen
			Class93.aClass131_Sub15_Sub2_1226.writeInt(DisplayInformation[2], (byte) 126);//Screen Width
			Class93.aClass131_Sub15_Sub2_1226.writeInt(DisplayInformation[3], (byte) 125);//Screen Height


			//Packet Stream of username to server Sets 4324Array to larger length Will be <long> followed by 65,535
			Class93.aClass131_Sub15_Sub2_1226.method1747((byte) 115, Class173.method2454(Class64.PlayerUsernameString, arg0 + 65528));//arg0 = 7
			System.out.println(Arrays.toString(Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.aByteArray4324));//Debug Check to check array that was changed
			System.out.println("Writing Username Long: " + Class173.method2454(Class64.PlayerUsernameString, arg0 + 65528));

			//Packet Stream of password to server as open string. Increases/Decreases length of 4324 followed by a byte of -104
			Class93.aClass131_Sub15_Sub2_1226.writeString(Class131_Sub2_Sub11.PlayerPasswordString, (byte) -104);//Unencrypted Client Password String
			System.out.println("Writing Password String... ");

			//RSA Stuff
			Class93.aClass131_Sub15_Sub2_1226.method1761(RuntimeException_Sub1.aBigInteger3246,(byte) -123, Class131_Sub2_Sub10.aBigInteger5699);

			Class131_Sub3.aClass131_Sub15_Sub2_4123.anInt4360 = 0;
			System.out.println(Arrays.toString(Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.aByteArray4324));

			System.out.println("Am I 40? :: " + Class133.anInt1803);
			if (Class133.anInt1803 != 40)
			    Class131_Sub3.aClass131_Sub15_Sub2_4123.writeByte(arg0 ^ 0x35, 16);
			else
			    Class131_Sub3.aClass131_Sub15_Sub2_4123.writeByte(arg0 ^ ~0x12, 18);
			System.out.println("Continuing... ");
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeShort((Class93.aClass131_Sub15_Sub2_1226.anInt4360 + 161 + Class131_Sub30.method1856((byte) -112, (Class23_Sub2_Sub2.aString5186))), (byte) 56);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeInt(562, (byte) 126);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeByte(-29, Class90.anInt1175);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeByte(109, Class131_Sub18.method1806(-28));
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeShort(Class131_Sub1_Sub1.anInt5499, (byte) 125);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeShort(Class218.anInt3201, (byte) 46);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeByte(31, Class131_Sub41_Sub21.anInt6442);
			Class110_Sub3.method947((Class131_Sub3.aClass131_Sub15_Sub2_4123), -34);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeString(Class23_Sub2_Sub2.aString5186, (byte) -110);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeInt(Class131_Sub2_Sub22.anInt5863, (byte) 126);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeInt(Class104.method909((byte) 59), (byte) 127);
			Class131_Sub38.aBoolean4627 = true;
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeShort(Class131_Sub11.anInt4233, (byte) 82);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeInt(Class131_Sub37.aClass158_4596.method2369(-111), (byte) 126);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeInt(Class28.aClass158_283.method2369(-87), (byte) 126);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeInt(Class116.aClass158_1506.method2369(-103), (byte) 127);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeInt(Class128_Sub1.aClass158_4012.method2369(-122), (byte) 127);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeInt(Class135.aClass158_1814.method2369(arg0 + -64), (byte) 125);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeInt(Class37.aClass158_504.method2369(-8), (byte) 126);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeInt(Class156.IDX6.method2369(arg0 ^ ~0x2),(byte) 126);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeInt(Class57.aClass158_752.method2369(-126), (byte) 125);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeInt(Class128.aClass158_1746.method2369(arg0 ^ ~0x15), (byte) 127);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeInt(Class131_Sub2_Sub3.aClass158_5587.method2369(-117), (byte) 126);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeInt(Class147.aClass158_1943.method2369(-58), (byte) 126);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeInt(Class82.aClass158_1091.method2369(-102), (byte) 125);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeInt(Class160.aClass158_2133.method2369(-53), (byte) 126);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeInt(Class157.aClass158_2076.method2369(-7), (byte) 126);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeInt(Class164.aClass158_2194.method2369(-32), (byte) 127);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeInt(Class131_Sub41_Sub21_Sub1.aClass158_6583.method2369(arg0 ^ ~0x39), (byte) 125);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeInt(Class110_Sub3.aClass158_3931.method2369(-106), (byte) 127);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeInt(Class131_Sub2_Sub25.aClass158_5923.method2369(-67), (byte) 125);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeInt(Class131_Sub41.aClass158_4666.method2369(-30), (byte) 125);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeInt(Class131_Sub2_Sub10_Sub1.aClass158_6535.method2369(arg0 ^ ~0x7f), (byte) 125);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeInt(Class108.aClass158_1415.method2369(arg0 ^ ~0xe),(byte) 127);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeInt(Class131_Sub41_Sub11_Sub1.aClass158_6549.method2369(-72), (byte) 127);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeInt(Class23_Sub4_Sub1_Sub1.aClass158_6481.method2369(-114), (byte) 125);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeInt(Class88.aClass158_1153.method2369(arg0 + -40), (byte) 127);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeInt(Class125.aClass158_1627.method2369(-67), (byte) 125);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeInt(Class20.aClass158_236.method2369(-14), (byte) 127);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeInt(Class131_Sub2_Sub28.aClass158_5964.method2369(-6), (byte) 127);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeInt(Class17.aClass158_186.method2369(-115), (byte) 125);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.writeInt(Class21.aClass158_242.method2369(-125), (byte) 125);
			Class131_Sub3.aClass131_Sub15_Sub2_4123.method1734(0, -107, Class93.aClass131_Sub15_Sub2_1226.aByteArray4324, Class93.aClass131_Sub15_Sub2_1226.anInt4360);
			Class128_Sub1.aClass33_4013.method454(arg0 + 76, Class131_Sub3.aClass131_Sub15_Sub2_4123.anInt4360, 0, (Class131_Sub3.aClass131_Sub15_Sub2_4123.aByteArray4324));
			Class93.aClass131_Sub15_Sub2_1226.method1790(DisplayInformation, arg0 + -4);
			for (int i = 0; i < 4; i++)
				DisplayInformation[i] += 50;
			Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.method1790(DisplayInformation, arg0 ^ 0x4);
			Class75.anInt1024 = 4;
			System.out.println("Furthermore");
		    }
		    if (Class75.anInt1024 == 4) {
			if (Class128_Sub1.aClass33_4013.method450((byte) 17) < 1)
			    return;
			int i = Class128_Sub1.aClass33_4013.method444(-1707);
			if (i != 21) {
			    if (i != 29) {
				if (i == 1) {
				    Class75.anInt1024 = 5;
				    Class4.anInt3281 = i;
				    return;
				} else if (i == 2)
					Class75.anInt1024 = 8;
				else {
					if (i == 15) {
						Class4.anInt3281 = i;
						Class75.anInt1024 = 0;
					} else {
						if (i != 23 || (PacketStream.anInt6130) >= 1) {
							System.out.println("Pakkit + " + PacketStream.anInt6130);
							Class4.anInt3281 = i;
							Class75.anInt1024 = 0;
							Class128_Sub1.aClass33_4013.method452(-1);
							Class128_Sub1.aClass33_4013 = null;
						} else {
							PacketStream.anInt6130++;
							Class75.anInt1024 = 1;
							Class110_Sub4.anInt3940 = 0;
							Class128_Sub1.aClass33_4013.method452(arg0 ^ ~0x7);
							Class128_Sub1.aClass33_4013 = null;
							return;
						}
						return;
					}
					return;
				}
				} else
				Class75.anInt1024 = 10;
			} else
			    Class75.anInt1024 = 7;
		    }
		    if (Class75.anInt1024 == 6) {
			Class93.aClass131_Sub15_Sub2_1226.anInt4360 = 0;
			System.out.println("Packet 17 Sent");//TODO: REMOVE PACKET DEBUG TEXT
			Class93.aClass131_Sub15_Sub2_1226.createPacket(17);
			Class128_Sub1.aClass33_4013.method454
			    (arg0 ^ 0x29,
			     Class93.aClass131_Sub15_Sub2_1226.anInt4360, 0,
			     Class93.aClass131_Sub15_Sub2_1226.aByteArray4324);
			Class75.anInt1024 = 4;
		    } else if (Class75.anInt1024 == 7) {
			if (Class128_Sub1.aClass33_4013.method450((byte) 17) >= 1) {
			    Class4.anInt3295
				= (Class128_Sub1.aClass33_4013.method444(-1707)
				   - -3) * 60;
			    Class4.anInt3281 = 21;
			    Class75.anInt1024 = 0;
			    Class128_Sub1.aClass33_4013.method452(-1);
			    Class128_Sub1.aClass33_4013 = null;
			}
		    } else if (Class75.anInt1024 == 10) {
			if (Class128_Sub1.aClass33_4013.method450((byte) 17) >= 1) {
			    Class1_Sub4.anInt3547
				= Class128_Sub1.aClass33_4013
				      .method444(arg0 + -1714);
			    Class4.anInt3281 = 29;
			    Class75.anInt1024 = 0;
			    Class128_Sub1.aClass33_4013.method452(-1);
			    Class128_Sub1.aClass33_4013 = null;
			}
		    } else {
			if (Class75.anInt1024 == 8) {
			    if (Class128_Sub1.aClass33_4013
				    .method450((byte) 17)
				< 14)
				return;
			    Class128_Sub1.aClass33_4013.method451
				(82, 0,
				 (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				  .aByteArray4324),
				 14);
			    Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.anInt4360
				= 0;
			    Class56.anInt745
				= Class23_Sub3_Sub1
				      .aClass131_Sub15_Sub2_5231
				      .readUnsignedByte(arg0 + -64);
			    Class105.anInt1377
				= Class23_Sub3_Sub1
				      .aClass131_Sub15_Sub2_5231
				      .readUnsignedByte(-53);
			    Class103.aBoolean1353
				= Class23_Sub3_Sub1
				      .aClass131_Sub15_Sub2_5231
				      .readUnsignedByte(-65) == 1;
			    Class60.aBoolean786
				= Class23_Sub3_Sub1
                        .aClass131_Sub15_Sub2_5231
                        .readUnsignedByte(55) == 1;
			    Class131_Sub1_Sub4.aBoolean5532
				= Class23_Sub3_Sub1
				      .aClass131_Sub15_Sub2_5231
				      .readUnsignedByte(-116) == 1;
			    Class183_Sub1.aBoolean4956
				= Class23_Sub3_Sub1
				      .aClass131_Sub15_Sub2_5231
				      .readUnsignedByte(arg0 + -17) == 1;
			    Class155.aBoolean2063
				= Class23_Sub3_Sub1
				      .aClass131_Sub15_Sub2_5231
				      .readUnsignedByte(arg0 ^ 0x41) == 1;
			    Class110.anInt1433
				= Class23_Sub3_Sub1
				      .aClass131_Sub15_Sub2_5231
				      .readUnsignedShort(8104);
			    Class131_Sub2_Sub1.aBoolean5570
				= Class23_Sub3_Sub1
                        .aClass131_Sub15_Sub2_5231
                        .readUnsignedByte(-69) == 1;
			    Class131_Sub9.aBoolean4218
				= Class23_Sub3_Sub1
                        .aClass131_Sub15_Sub2_5231
                        .readUnsignedByte(-115) == 1;
			    Class215.method2802(77,
						Class131_Sub9.aBoolean4218);
			    Class131_Sub2_Sub34
				.method1631(Class131_Sub9.aBoolean4218, 66);
			    Class160.method2384(3037,
						Class131_Sub9.aBoolean4218);
			    if ((Class103.aBoolean1353
				 && !Class131_Sub1_Sub4.aBoolean5532)
				|| Class131_Sub2_Sub1.aBoolean5570) {
				try {
				    Class30.method432((Class23_Sub4
						       .aSignLink_3734
						       .BrowserGameFrame),
						      (byte) -100, "zap");
				} catch (Throwable throwable) {
				    /* empty */
				}
			    } else {
				try {
				    Class30.method432((Class23_Sub4
						       .aSignLink_3734
						       .BrowserGameFrame),
						      (byte) -100, "unzap");
				} catch (Throwable throwable) {
				    /* empty */
				}
			    }
			    if (Class1_Sub7.anInt3581 == 0) {
				try {
				    Class30.method432((Class23_Sub4
						       .aSignLink_3734
						       .BrowserGameFrame),
						      (byte) -100, "loggedin");
				} catch (Throwable throwable) {
				    /* empty */
				}
			    }
			    Class131_Sub35.anInt4583
				= Class23_Sub3_Sub1
				      .aClass131_Sub15_Sub2_5231
				      .method1793(5663);
			    Class131_Sub8_Sub1.anInt6100
				= Class23_Sub3_Sub1
				      .aClass131_Sub15_Sub2_5231
				      .readUnsignedShort(8104);
			    Class75.anInt1024 = 9;
			}
			if (Class75.anInt1024 == 9) {
			    if (Class131_Sub8_Sub1.anInt6100 <= Class128_Sub1.aClass33_4013
                        .method450((byte) 17)) {
				Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				    .anInt4360
				    = 0;
				Class128_Sub1.aClass33_4013.method451
				    (arg0 + 113, 0,
				     (Class23_Sub3_Sub1
				      .aClass131_Sub15_Sub2_5231
				      .aByteArray4324),
				     Class131_Sub8_Sub1.anInt6100);
				Class4.anInt3281 = 2;
				Class75.anInt1024 = 0;
				Class131_Sub8.method1675(0);
				Class131_Sub41_Sub13.anInt6326 = -1;
				Class121_Sub2.readMapRegion(false, true);
				Class131_Sub35.anInt4583 = -1;
			    }
			}
		    }
		} catch (IOException ioexception) {
		    if (Class128_Sub1.aClass33_4013 != null) {
			Class128_Sub1.aClass33_4013.method452(arg0 + -8);
			Class128_Sub1.aClass33_4013 = null;
		    }
		    if (PacketStream.anInt6130 >= 1) {
			Class4.anInt3281 = -4;
			Class75.anInt1024 = 0;
		    } else {
			Class110_Sub4.anInt3940 = 0;
			Class75.anInt1024 = 1;
			if (Class43.anInt590 == Class131_Sub2_Sub31.ConnectionPort)
			    Class131_Sub2_Sub31.ConnectionPort
				= Class131_Sub14.anInt4288;
			else
			    Class131_Sub2_Sub31.ConnectionPort = Class43.anInt590;
			PacketStream.anInt6130++;
		    }
		}
	    }//End up here if Server rejects login
	}
    }
    
    public static void method1150(int arg0, byte arg1) {
	try {
	    if (Class113.anIntArray1462 == null
		|| arg0 > Class113.anIntArray1462.length)
		Class113.anIntArray1462 = new int[arg0];
	    anInt1760++;
	    int i = -18 % ((78 - arg1) / 47);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("no.F(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public int method1151(int arg0, int arg1) {
	try {
	    anInt1759++;
	    if (arg0 < 97)
		method1152(-93, 89, 1, (byte) 94, 36);
	    int i = -1 + (anIntArray1761.length >> 1207513921);
	    int i_1_ = arg1 & i;
	    for (;;) {
		int i_2_ = anIntArray1761[1 + i_1_ + i_1_];
		if (i_2_ == -1)
		    return -1;
		if (arg1 == anIntArray1761[i_1_ + i_1_])
		    return i_2_;
		i_1_ = i & 1 + i_1_;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("no.B(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static Class209 method1152(int arg0, int arg1, int arg2, byte arg3,
				      int arg4) {
	try {
	    anInt1758++;
	    Class196[] class196s = null;
	    Class63 class63
		= Class131_Sub2_Sub14.method1538(arg3 + -1728, arg0);
	    if (arg3 != 104)
		return null;
	    if (class63.anIntArray797 != null) {
		class196s = new Class196[class63.anIntArray797.length];
		for (int i = 0; i < class196s.length; i++) {
		    Class98 class98
			= Class131_Sub2_Sub12.method1525((class63.anIntArray797
							  [i]),
							 arg3 ^ 0x5a7);
		    class196s[i]
			= new Class196(class98.anInt1299, class98.anInt1288,
				       class98.anInt1287, class98.anInt1293,
				       class98.anInt1291, class98.anInt1285,
				       class98.anInt1301,
				       class98.aBoolean1289);
		}
	    }
	    return new Class209(class63.anInt792, class196s, class63.anInt794,
				arg1, arg4, arg2);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("no.G(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    public static void method1153(int arg0, int arg1, boolean arg2, int arg3,
				  int arg4, AnimationDefinition arg5) {
	try {
	    anInt1755++;
	    if (Class57.anInt746 < 50
		&& (arg5 != null && arg5.anIntArrayArray2145 != null
		    && arg3 < arg5.anIntArrayArray2145.length
		    && arg5.anIntArrayArray2145[arg3] != null)) {
		int i = arg5.anIntArrayArray2145[arg3][0];
		int i_3_ = i >> 209778440;
		int i_4_ = i >> -650567035 & 0x7;
		if (arg5.anIntArrayArray2145[arg3].length > 1) {
		    int i_5_
			= (int) ((double) arg5.anIntArrayArray2145[arg3].length
				 * Math.random());
		    if (i_5_ > 0)
			i_3_ = arg5.anIntArrayArray2145[arg3][i_5_];
		}
		int i_6_ = i & 0x1f;
		if (i_6_ == 0) {
		    if (arg2)
			Class131_Sub2_Sub13.method1535(0, 255, 0, i_3_, i_4_);
		} else if (InputStream_Sub1.anInt55 != 0) {
		    Class154.anIntArray2056[Class57.anInt746] = i_3_;
		    Class69.anIntArray928[Class57.anInt746] = i_4_;
		    Class119.anIntArray1556[Class57.anInt746] = 0;
		    Class23_Sub3.aClass16Array3723[Class57.anInt746] = null;
		    Class46_Sub1.anIntArray3805[Class57.anInt746] = 255;
		    if (arg1 == 21155) {
			int i_7_ = (-64 + arg0) / 128;
			int i_8_ = (-64 + arg4) / 128;
			InputStream_Sub1.anIntArray58[Class57.anInt746]
			    = i_6_ + (i_8_ << 1170679816) + (i_7_
							     << -308107312);
			Class57.anInt746++;
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("no.E(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ','
						 + (arg5 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method1154(int arg0, byte arg1, boolean arg2) {
	try {
	    anInt1753++;
	    if (arg0 == 0)
		Class183_Sub1.aClass130_4960
		    = GraphicsToolkit.method1157(Class131_Sub41_Sub21.anInt6442 * 2,
					  -9426, Class23_Sub4.aSignLink_3734,
					  Class131_Sub2_Sub15.GameCanvas,
					  arg0,
					  (Class131_Sub2_Sub8
					   .anInterface4_5660));
	    else {
		if (arg2) {
		    Class183_Sub1.aClass130_4960
			= GraphicsToolkit.method1157(0, -9426,
					      Class23_Sub4.aSignLink_3734,
					      Class131_Sub2_Sub15.GameCanvas,
					      0,
					      (Class131_Sub2_Sub8
					       .anInterface4_5660));
		    Class183_Sub1.aClass130_4960.method1191(0);
		    Class55 class55
			= Class131_Sub41_Sub16.method2037((Class157
							   .aClass158_2076),
							  (byte) -35, 0,
							  Class128.anInt1743);
		    Class44 class44
			= (Class183_Sub1.aClass130_4960.method1224
			   (class55,
			    Class124.method1084(Class128.aClass158_1746,
						Class128.anInt1743, 0),
			    true));
		    Class131_Sub41_Sub5
			.method1957(true, -29854, Class14.LoadingPleaseWaitString, class44);
		    Class183_Sub1.aClass130_4960.method1166();
		    Class131_Sub2.method1457((byte) 106);
		    Class183_Sub1.aClass130_4960.method1167(-31586);
		}
		try {
		    Class183_Sub1.aClass130_4960
			= GraphicsToolkit.method1157((Class131_Sub41_Sub21.anInt6442
					       * 2),
					      -9426,
					      Class23_Sub4.aSignLink_3734,
					      Class131_Sub2_Sub15.GameCanvas,
					      arg0,
					      (Class131_Sub2_Sub8
					       .anInterface4_5660));
		} catch (Throwable throwable) {
		    Class183_Sub1.aClass130_4960
			= GraphicsToolkit.method1157(0, -9426,
					      Class23_Sub4.aSignLink_3734,
					      Class131_Sub2_Sub15.GameCanvas,
					      0,
					      (Class131_Sub2_Sub8
					       .anInterface4_5660));
		    arg0 = 0;
		}
	    }
	    if (Class183_Sub1.aClass130_4960.method1241()) {
		Class131_Sub27 class131_sub27
		    = Class183_Sub1.aClass130_4960.method1256(134217728);
		Class183_Sub1.aClass130_4960.method1231(class131_sub27);
	    }
	    Stream.anInt4299 = arg0;
	    Class17.method229((byte) 121);
	    if (!Class183_Sub1.aClass130_4960.method1159())
		Class131_Sub31.anInt4537 = 1;
	    Class183_Sub1.aClass130_4960.method1189(Class131_Sub31.anInt4537);
	    Class183_Sub1.aClass130_4960.method1183(0);
	    PacketParser.aClass9_5876
		= Class183_Sub1.aClass130_4960.method1257();
	    if (arg1 == 32) {
		Class23_Sub4.aClass9_3743
		    = Class183_Sub1.aClass130_4960.method1257();
		int i = (int) ((double) Class131_Sub41_Sub11_Sub1.anInt6546
			       * 34.46);
		if (Class183_Sub1.aClass130_4960.method1186())
		    i += 128;
		Class183_Sub1.aClass130_4960.method1230(50, i);
		Class183_Sub1.aClass130_4960
		    .method1171(!Class183.aBoolean2613);
		if (Class183_Sub1.aClass130_4960.method1213())
		    Class46.method565(Class177.aBoolean2530, 47);
		Class23.aBoolean258 = !Class9.method182((byte) 124);
		Class23_Sub2_Sub2.method313((Class131_Sub2_Sub26.anInt5931
					     >> 1296270051),
					    (Class131_Sub41_Sub11_Sub1
					     .anInt6546) >> 1587802083,
					    120, Class183_Sub1.aClass130_4960);
		Class121_Sub1.method1043(arg1 + -157);
		Class131_Sub38.aBoolean4627 = false;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("no.H(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method1155(int arg0) {
	aClass214_1757 = null;
	if (arg0 != 0)
	    method1156('\002', 28);
    }
    
    public static boolean method1156(char arg0, int arg1) {
	try {
	    anInt1754++;
	    if (arg1 >= -88)
		anInt1763 = -125;
	    if ((arg0 < 65 || arg0 > 90)
		&& (arg0 < 97 || arg0 > 122))
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("no.C(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Login(int[] arg0) {
	try {
	    int i;
	    for (i = 1; arg0.length - -(arg0.length >> 315119297) >= i;
		 i <<= 1) {
		/* empty */
	    }
	    anIntArray1761 = new int[i - -i];
	    for (int i_9_ = 0; i_9_ < i + i;
             i_9_++)
		anIntArray1761[i_9_] = -1;
	    for (int i_10_ = 0; arg0.length > i_10_; i_10_++) {
		int i_11_;
		for (i_11_ = arg0[i_10_] & -1 + i;
             anIntArray1761[1 + (i_11_ + i_11_)] != -1;
		     i_11_ = 1 + i_11_ & i - 1) {
		    /* empty */
		}
		anIntArray1761[i_11_ + i_11_] = arg0[i_10_];
		anIntArray1761[1 + i_11_ + i_11_] = i_10_;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("no.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
}
