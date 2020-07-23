package jagex.netscape.security;
import java.net.URL;

public final class Principal
{
    public static final int CODEBASE_EXACT = 1;
    public static final int CODEBASE_REGEXP = 2;
    public static final int CERT = 3;
    public static final int CERT_FINGERPRINT = 4;
    public static final int CERT_KEY = 5;
    private int type = 3;
    private URL url = null;
    
    public Principal() {
    }
    
    public Principal(URL arg0) {
	url = arg0;
    }
    
    public Principal(int arg0, String arg1) {
	type = arg0;
    }
    
    public Principal(int arg0, byte[] arg1) {
	type = arg0;
    }
    
    public Principal(int arg0, byte[] arg1, Class arg2) {
	type = arg0;
    }
    
    public boolean isCodebase() {
	return isCodebaseExact() || isCodebaseRegexp();
    }
    
    public boolean isCodebaseExact() {
	return type == 1;
    }
    
    public boolean isCodebaseRegexp() {
	return type == 2;
    }
    
    public boolean isCert() {
	return type == 3;
    }
    
    public boolean isCertFingerprint() {
	return type == 4;
    }
    
    public String toVerboseString() {
	return this.toString();
    }
    
    public String getVendor() {
	return null;
    }
    
    public String toVerboseHtml() {
	return null;
    }
    
    public String getNickname() {
	return null;
    }
    
    public boolean isSystemPrincipal() {
	return false;
    }
    
    public static int getZigPtr(Class arg0) {
	return -1;
    }
}
