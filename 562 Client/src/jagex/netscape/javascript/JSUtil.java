package jagex.netscape.javascript;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;

public class JSUtil
{
    public static String getStackTrace(Throwable arg0) {
	ByteArrayOutputStream bytearrayoutputstream
	    = new ByteArrayOutputStream();
	PrintWriter printwriter = new PrintWriter(bytearrayoutputstream);
	arg0.printStackTrace(printwriter);
	printwriter.flush();
	return bytearrayoutputstream.toString();
    }
}
