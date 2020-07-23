package jagex.netscape.security;

import jagex.netscape.security.Privilege;
import jagex.netscape.security.PrivilegeManager;
import jagex.netscape.security.UserTarget;

public class ParameterizedTarget extends UserTarget
{
    protected ParameterizedTarget() {
    }
    
    public ParameterizedTarget(String arg0, Principal arg1, String arg2,
			       String arg3, String arg4, String arg5) {
	super(arg0, arg1, arg2, arg3, arg4, arg5);
    }
    
    public String getDetailedInfo(Object arg0) {
	return null;
    }
    
    public Privilege enablePrivilege(Principal arg0, Object arg1) {
	PrivilegeManager privilegemanager
	    = PrivilegeManager.getPrivilegeManager();
	privilegemanager.enablePrivilege(this, arg0, arg1);
	return null;
    }
    
    public Privilege checkPrivilegeEnabled(Principal[] arg0, Object arg1) {
	PrivilegeManager privilegemanager
	    = PrivilegeManager.getPrivilegeManager();
	privilegemanager.checkPrivilegeEnabled(this, arg1);
	return null;
    }
}
