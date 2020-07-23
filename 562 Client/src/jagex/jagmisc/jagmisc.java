package jagex.jagmisc;

public class jagmisc
{
    public static int ping(byte arg0, byte arg1, byte arg2, byte arg3,
			   long arg4) throws Throwable {
	try {
	    int i = ping0(arg0, arg1, arg2, arg3, arg4);
	    if (i < 0)
		throw new Exception(String.valueOf(i));
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public static native boolean init();
    
    public static void quit() {
	try {
	    Quit0();
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    private static native void Quit0();
    
    private static native int ping0(byte arg0, byte arg1, byte arg2, byte arg3,
				    long arg4);
    
    public static native long nanoTime();
}
