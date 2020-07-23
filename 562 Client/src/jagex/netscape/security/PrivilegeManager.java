package jagex.netscape.security;
//import sun.plugin.resources.ResourceHandler;

import netscape.security.PrivilegeTable;

public class PrivilegeManager
{
    public static final int PROPER_SUBSET = 1;
    public static final int EQUAL = 2;
    public static final int NO_SUBSET = 3;
    public static final int SIGNED_APPLET_DBNAME = 4;
    public static final int TEMP_FILENAME = 5;
    
    protected PrivilegeManager() {
    }
    
    public void checkPrivilegeEnabled(Target arg0)
	throws ForbiddenTargetException {
	printErrorMessage();
    }
    
    public void checkPrivilegeEnabled(Target arg0, Object arg1)
	throws ForbiddenTargetException {
	printErrorMessage();
    }
    
    public static void enablePrivilege(String arg0)
	throws ForbiddenTargetException {
	printErrorMessage();
    }
    
    public void enablePrivilege(Target arg0) throws ForbiddenTargetException {
	printErrorMessage();
    }
    
    public void enablePrivilege(Target arg0, Principal arg1)
	throws ForbiddenTargetException {
	printErrorMessage();
    }
    
    public void enablePrivilege(Target arg0, Principal arg1, Object arg2)
	throws ForbiddenTargetException {
	printErrorMessage();
    }
    
    public void revertPrivilege(Target arg0) {
	printErrorMessage();
    }
    
    public static void revertPrivilege(String arg0) {
	printErrorMessage();
    }
    
    public void disablePrivilege(Target arg0) {
	printErrorMessage();
    }
    
    public static void disablePrivilege(String arg0) {
	printErrorMessage();
    }
    
    public static void checkPrivilegeGranted(String arg0)
	throws ForbiddenTargetException {
	printErrorMessage();
    }
    
    public void checkPrivilegeGranted(Target arg0)
	throws ForbiddenTargetException {
	printErrorMessage();
    }
    
    public void checkPrivilegeGranted(Target arg0, Object arg1)
	throws ForbiddenTargetException {
	printErrorMessage();
    }
    
    public void checkPrivilegeGranted
	(Target arg0, Principal arg1, Object arg2)
	throws ForbiddenTargetException {
	printErrorMessage();
    }
    
    public boolean isCalledByPrincipal(Principal arg0, int arg1) {
	printErrorMessage();
	return false;
    }
    
    public boolean isCalledByPrincipal(Principal arg0) {
	printErrorMessage();
	return isCalledByPrincipal(arg0, 1);
    }
    
    public static Principal getSystemPrincipal() {
	printErrorMessage();
	return null;
    }
    
    public static PrivilegeManager getPrivilegeManager() {
	printErrorMessage();
	return new PrivilegeManager();
    }
    
    public static Principal[] getMyPrincipals() {
	printErrorMessage();
	return null;
    }
    
    public Principal[] getClassPrincipals(Class arg0) {
	printErrorMessage();
	return null;
    }
    
    public boolean hasPrincipal(Class arg0, Principal arg1) {
	printErrorMessage();
	return false;
    }
    
    public int comparePrincipalArray(Principal[] arg0, Principal[] arg1) {
	printErrorMessage();
	return 3;
    }
    
    public boolean checkMatchPrincipal(Class arg0, int arg1) {
	printErrorMessage();
	return false;
    }
    
    public boolean checkMatchPrincipal(Principal arg0, int arg1) {
	printErrorMessage();
	return false;
    }
    
    public boolean checkMatchPrincipal(Class arg0) {
	printErrorMessage();
	return false;
    }
    
    public boolean checkMatchPrincipalAlways() {
	printErrorMessage();
	return false;
    }
    
    public Principal[] getClassPrincipalsFromStack(int arg0) {
	printErrorMessage();
	return null;
    }
    
    public PrivilegeTable getPrivilegeTableFromStack() {
	printErrorMessage();
	return null;
    }
    
    private static void printErrorMessage() {
	/*System.err.println(ResourceHandler
			       .getMessage("liveconnect.wrong.securitymodel"));*/
    	System.err.println("liveconnect.wrong.securitymodel");
    }
}
