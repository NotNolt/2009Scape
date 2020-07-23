package jagex.netscape.security;

public class Target
{
    private String name = null;
    private Principal prin = null;
    private String risk = null;
    private String riskColor = null;
    private String description = null;
    private String url = null;
    private Target[] targetAry = null;
    
    protected Target() {
	this(null, null, null, null, null, null, null);
    }
    
    public Target(String arg0, Principal arg1) {
	this(arg0, arg1, null, null, null, null, null);
    }
    
    public Target(String arg0) {
	this(arg0, null, null, null, null, null, null);
    }
    
    public Target(String arg0, Principal arg1, Target[] arg2) {
	this(arg0, arg1, null, null, null, null, arg2);
    }
    
    public Target(String arg0, Principal arg1, String arg2, String arg3,
		  String arg4, String arg5) {
	this(arg0, arg1, arg2, arg3, arg4, arg5, null);
    }
    
    public Target(String arg0, Principal arg1, String arg2, String arg3,
		  String arg4, String arg5, Target[] arg6) {
	name = arg0;
	prin = arg1;
	risk = arg2;
	riskColor = arg3;
	description = arg4;
	url = arg5;
	targetAry = arg6;
    }
    
    public final Target registerTarget() {
	return this;
    }
    
    public static Target findTarget(String arg0) {
	return new Target(arg0);
    }
    
    public static Target findTarget(String arg0, Principal arg1) {
	return new Target(arg0, arg1);
    }
    
    public static Target findTarget(Target arg0) {
	return arg0;
    }
    
    public Privilege checkPrivilegeEnabled(Principal[] arg0, Object arg1) {
	PrivilegeManager privilegemanager
	    = PrivilegeManager.getPrivilegeManager();
	privilegemanager.checkPrivilegeEnabled(this, arg1);
	return null;
    }
    
    public Privilege checkPrivilegeEnabled(Principal[] arg0) {
	return checkPrivilegeEnabled(arg0, null);
    }
    
    public Privilege checkPrivilegeEnabled(Principal arg0, Object arg1) {
	PrivilegeManager privilegemanager
	    = PrivilegeManager.getPrivilegeManager();
	privilegemanager.checkPrivilegeEnabled(this, arg1);
	return null;
    }
    
    public Privilege enablePrivilege(Principal arg0, Object arg1) {
	PrivilegeManager privilegemanager
	    = PrivilegeManager.getPrivilegeManager();
	privilegemanager.enablePrivilege(this, arg0, arg1);
	return null;
    }
    
    public String getRisk() {
	return risk;
    }
    
    public String getRiskColor() {
	return riskColor;
    }
    
    public String getDescription() {
	return description;
    }
    
    public static Target getTargetFromDescription(String arg0) {
	return null;
    }
    
    public String getHelpUrl() {
	return url;
    }
    
    public String getDetailedInfo(Object arg0) {
	return null;
    }
}
