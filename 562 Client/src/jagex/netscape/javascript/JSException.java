package jagex.netscape.javascript;

public class JSException extends RuntimeException
{
    public static final int EXCEPTION_TYPE_EMPTY = -1;
    public static final int EXCEPTION_TYPE_VOID = 0;
    public static final int EXCEPTION_TYPE_OBJECT = 1;
    public static final int EXCEPTION_TYPE_FUNCTION = 2;
    public static final int EXCEPTION_TYPE_STRING = 3;
    public static final int EXCEPTION_TYPE_NUMBER = 4;
    public static final int EXCEPTION_TYPE_BOOLEAN = 5;
    public static final int EXCEPTION_TYPE_ERROR = 6;
    protected String message = null;
    protected String filename = null;
    protected int lineno = -1;
    protected String source = null;
    protected int tokenIndex = -1;
    private int wrappedExceptionType = -1;
    private Object wrappedException = null;
    
    public JSException() {
	this((String) null);
    }
    
    public JSException(String arg0) {
	this(arg0, null, -1, null, -1);
    }
    
    public JSException(String arg0, String arg1, int arg2, String arg3,
		       int arg4) {
	super(arg0);
	message = arg0;
	filename = arg1;
	lineno = arg2;
	source = arg3;
	tokenIndex = arg4;
	wrappedExceptionType = -1;
    }
    
    public JSException(int arg0, Object arg1) {
	this();
	wrappedExceptionType = arg0;
	wrappedException = arg1;
    }
    
    public int getWrappedExceptionType() {
	return wrappedExceptionType;
    }
    
    public Object getWrappedException() {
	return wrappedException;
    }
}
