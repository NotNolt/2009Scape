package jagex.netscape.security;

public class UserTarget extends Target
{
    public UserTarget() {
    }
    
    public UserTarget(String arg0, Principal arg1, String arg2, String arg3,
		      String arg4, String arg5) {
	super(arg0, arg1, arg2, arg3, arg4, arg5);
    }
    
    public UserTarget(String arg0, Principal arg1, String arg2, String arg3,
		      String arg4, String arg5, Target[] arg6) {
	super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
    
    public Privilege enablePrivilege(Principal arg0, Object arg1) {
	PrivilegeManager privilegemanager
	    = PrivilegeManager.getPrivilegeManager();
	privilegemanager.enablePrivilege(this, arg0, arg1);
	return null;
    }
}
