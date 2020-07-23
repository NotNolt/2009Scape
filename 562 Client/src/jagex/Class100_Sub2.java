package jagex;/* jagex.Class100_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class100_Sub2 extends Class100
{
    public long aLong3877 = 0L;
    public long aLong3878 = 0L;
    public long[] aLongArray3879;
    public long aLong3880 = 0L;
    public int anInt3881 = 1;
    public int anInt3882;
    
    public long method882(int arg0) {
	long l;
	try {
	    long l_0_ = System.nanoTime();
	    long l_1_ = -aLong3880 + l_0_;
	    aLong3880 = l_0_;
	    if (l_1_ > -5000000000L
		&& l_1_ < 5000000000L) {
		aLongArray3879[anInt3882] = l_1_;
		if (anInt3881 < 1)
		    anInt3881++;
		anInt3882 = (anInt3882 - -1) % 10;
	    }
	    long l_2_ = 0L;
	    if (arg0 != 3080)
		return -100L;
	    for (int i = 1; i <= anInt3881; i++)
		l_2_ += aLongArray3879[(anInt3882 + (-i - -10)) % 10];
	    l = l_2_ / (long) anInt3881;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return l;
    }
    
    public int method876(int arg0, int arg1) {
	int i;
	try {
	    int i_3_ = -128 % ((-11 - arg1) / 35);
	    long l = 1000000L * (long) arg0;
	    aLong3878 += method882(3080);
	    if (aLong3877 > aLong3878) {
		ObjectDefinition.sleep(-107, (aLong3877 - aLong3878) / 1000000L);
		aLong3880 += -aLong3878 + aLong3877;
		aLong3878 += -aLong3878 + aLong3877;
		aLong3877 += l;
		return 1;
	    }
	    int i_4_ = 0;
	    do {
		aLong3877 += l;
		i_4_++;
	    } while (i_4_ < 10
		     && (aLong3878 > aLong3877));
	    if (aLong3877 < aLong3878)
		aLong3877 = aLong3878;
	    i = i_4_;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return i;
    }
    
    public void method874(int arg0) {
	aLong3880 = 0L;
	int i = 79 / ((arg0 - 9) / 63);
	if (aLong3878 < aLong3877)
	    aLong3878 += aLong3877 - aLong3878;
    }
    
    public Class100_Sub2() {
	aLongArray3879 = new long[10];
	anInt3882 = 0;
	aLong3878 = System.nanoTime();
	aLong3877 = System.nanoTime();
    }
    
    public long method880(int arg0) {
	long l;
	try {
	    if (arg0 != 30786)
		return -68L;
	    l = aLong3878;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return l;
    }
}
