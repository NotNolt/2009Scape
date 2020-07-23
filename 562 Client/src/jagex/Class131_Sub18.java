package jagex;/* jagex.Class131_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub18 extends Class131 {
	public static float aFloat4378;
	public int anInt4379;
	public static int anInt4380;
	public static int anInt4381;
	public static int anInt4382;
	public static int anInt4383;
	public int anInt4384;
	public static int anInt4385;
	public static String LoadedInputHandlerString;
	public static String FullFriendsListString;
	public static String AlreadyOnIgnoreListString = " is already on your ignore list.";
	public static volatile int anInt4389;
	public static int[] anIntArray4390;

	public static int method1803(byte arg0, int arg1) {
		try {
			anInt4381++;
			if (arg0 != 41)
				return 56;
			return arg1 & 0xff;
		} catch (RuntimeException runtimeexception) {
			throw Class131_Sub2_Sub6.method1495(runtimeexception, ("kr.A("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static int method1804(int arg0, byte arg1, int arg2) {
		try {
			int i = 98 / ((arg1 - -36) / 50);
			anInt4383++;
			if (arg0 == 4 || arg0 == 5)
				return Class9.anIntArray117[0x3 & arg2];
			return 256;
		} catch (RuntimeException runtimeexception) {
			throw Class131_Sub2_Sub6.method1495(runtimeexception, ("kr.E("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public static void method1805(byte arg0) {
		try {
			if (arg0 > -65)
				anInt4385 = -46;
			LoadedInputHandlerString = null;
			FullFriendsListString = null;
			AlreadyOnIgnoreListString = null;
			anIntArray4390 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class131_Sub2_Sub6.method1495(runtimeexception, "kr.C("
					+ arg0 + ')');
		}
	}

	public static int method1806(int arg0) {
		try {
			anInt4380++;
			if (arg0 > -10)
				AlreadyOnIgnoreListString = null;
			if (Class74.aFrame1014 != null)
				return 3;
			if (!Class85.aBoolean1104)
				return 1;
			return 2;
		} catch (RuntimeException runtimeexception) {
			throw Class131_Sub2_Sub6.method1495(runtimeexception, "kr.D("
					+ arg0 + ')');
		}
	}

	public static int method1807(Class23_Sub4_Sub1 arg0, int arg1) {
		try {
			anInt4382++;
			if (arg0.anInt5310 == 0)
				return 0;
			if (arg1 != 16383)
				anIntArray4390 = null;
			if (arg0.anInt5255 != -1 && arg0.anInt5255 < 32768) {
				Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1 = (Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379[arg0.anInt5255]);
				if (class23_sub4_sub1_sub1 != null) {
					int i = arg0.anInt3733 - class23_sub4_sub1_sub1.anInt3733;
					int i_0_ = arg0.anInt3747
							+ -class23_sub4_sub1_sub1.anInt3747;
					if (i != 0 || i_0_ != 0)
						arg0.method347(-1408718297,
								0x3fff & (int) (2607.5945876176133 * Math
										.atan2((double) i, (double) i_0_)));
				}
			}
			if (arg0.anInt5255 >= 32768) {
				int i = arg0.anInt5255 + -32768;
				if (Class110.anInt1433 == i)
					i = 2047;
				Player class23_sub4_sub1_sub2 = Class105.aClass23_Sub4_Sub1_Sub2Array1373[i];
				if (class23_sub4_sub1_sub2 != null) {
					int i_1_ = arg0.anInt3733
							+ -class23_sub4_sub1_sub2.anInt3733;
					int i_2_ = arg0.anInt3747
							- class23_sub4_sub1_sub2.anInt3747;
					if (i_1_ != 0 || i_2_ != 0)
						arg0.method347(-1408718297,
								(0x3fff & (int) (Math.atan2((double) i_1_,
										(double) i_2_) * 2607.5945876176133)));
				}
			}
			direction(arg0, arg1);
			int i = arg0.method330(arg1 ^ 0x3ffd);
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class131_Sub2_Sub6.method1495(runtimeexception, ("kr.B("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	private static void direction(Class23_Sub4_Sub1 arg0, int arg1) {
		/*if ((arg0.anInt5246 != 0 || arg0.anInt5299 != 0 || arg0.direction != 0)
				&& ((arg0.anInt5334 ^ 0xffffffff) == -1 || (arg0.anInt5321 ^ 0xffffffff) < -1)) {
			int i = (arg0.anInt3733 - (-jagex.Class92.anInt1191 + (-jagex.Class92.anInt1191 + arg0.anInt5246)) * 64);
			int i_3_ = -((arg0.anInt5299 - jagex.Class64.anInt818 + -jagex.Class64.anInt818) * 64)
					+ arg0.anInt3747;
			if (i != 0 || (i_3_ ^ 0xffffffff) != -1)
				arg0.method347(
						-1408718297,
						0x3fff & arg0.direction);
			arg0.anInt5246 = 0;
			arg0.anInt5299 = 0;
		
		}
		/*/
		if(arg0.direction != 0 ) {
			/*int i_9_ = i - 259411823 * aClass386_10084.anInt4144 & 0x3fff;
			if (i_9_ > 8192)
				anInt10068 = (aClass386_10084.anInt4144 * 259411823 - (16384 - i_9_)) * 1874549911;
			else
				anInt10068 = (aClass386_10084.anInt4144 * 259411823 + i_9_) * 1874549911;
			/*/

			arg0.method347(
					-1408718297,
					0x3fff & arg0.direction);
		}
		arg0.direction = 0;
	}

	public Class131_Sub18(int arg0, int arg1) {
		try {
			anInt4379 = arg1;
			anInt4384 = arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class131_Sub2_Sub6.method1495(runtimeexception, ("kr.<init>("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	static {
		FullFriendsListString = "Your friend list is full. Max of 100 for free users, and 200 for members.";
		aFloat4378 = 0.0F;
		anInt4389 = 0;
		anIntArray4390 = new int[13];
		LoadedInputHandlerString = "Loaded input handler";
	}
}
