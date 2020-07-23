package jagex.netscape.javascript;
import java.applet.Applet;

public abstract class JSObject
{
    protected JSObject() {
    }
    
    public abstract Object call(String arg0, Object[] arg1) throws JSException;
    
    public abstract Object eval(String arg0) throws JSException;
    
    public abstract Object getMember(String arg0) throws JSException;
    
    public abstract void setMember(String arg0, Object arg1)
	throws JSException;
    
    public abstract void removeMember(String arg0) throws JSException;
    
    public abstract Object getSlot(int arg0) throws JSException;
    
    public abstract void setSlot(int arg0, Object arg1) throws JSException;
    
    public static JSObject getWindow(Applet arg0) throws JSException {
	do {
	    JSObject jsobject;
	    try {
		if (arg0 == null)
		    break;
		String string = arg0.getParameter("MAYSCRIPT");
		java.applet.AppletContext appletcontext
		    = arg0.getAppletContext();
		JSObject jsobject1 = null;
		/*if (appletcontext instanceof JSContext) {
		    JSContext jscontext = (JSContext) appletcontext;
		    jsobject1 = jscontext.getJSObject();
		}*/
		if (jsobject1 == null)
		    break;
		jsobject = jsobject1;
	    } catch (Throwable throwable) {
		throw new JSException(6, throwable);
	    }
	    return jsobject;
	} while (false);
	throw new JSException();
    }
}
