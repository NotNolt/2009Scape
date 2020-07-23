package jagex.netscape.security;

public final class Privilege
{
    public static final int N_PERMISSIONS = 15;
    public static final int FORBIDDEN = 0;
    public static final int ALLOWED = 1;
    public static final int BLANK = 2;
    public static final int N_DURATIONS = 240;
    public static final int SCOPE = 16;
    public static final int SESSION = 32;
    public static final int FOREVER = 64;
    private int permission = 0;
    private int duration = 16;
    
    Privilege(int arg0, int arg1) {
	permission = arg0;
	duration = arg1;
    }
    
    public static Privilege findPrivilege(int arg0, int arg1) {
	return new Privilege(arg0, arg1);
    }
    
    public static int add(int arg0, int arg1) {
	if (arg0 == 0 || arg1 == 0)
	    return 0;
	if (arg0 == 2)
	    return arg1;
	if (arg1 == 2)
	    return arg0;
	if (arg0 == 1 || arg1 == 1)
	    return 1;
	return 2;
    }
    
    public static Privilege add(Privilege arg0, Privilege arg1) {
	int i = add(arg0.getPermission(), arg1.getPermission());
	return new Privilege(i, arg0.getDuration());
    }
    
    public boolean samePermission(Privilege arg0) {
	return samePermission(arg0.getPermission());
    }
    
    public boolean samePermission(int arg0) {
	return permission == arg0;
    }
    
    public boolean sameDuration(Privilege arg0) {
	return sameDuration(arg0.getDuration());
    }
    
    public boolean sameDuration(int arg0) {
	return duration == arg0;
    }
    
    public boolean isAllowed() {
	return permission == 1;
    }
    
    public boolean isForbidden() {
	return permission == 0;
    }
    
    public boolean isBlank() {
	return permission == 2;
    }
    
    public int getPermission() {
	return permission;
    }
    
    public int getDuration() {
	return duration;
    }
    
    public boolean equals(Object arg0) {
	if (arg0 instanceof Privilege) {
	    Privilege privilege = (Privilege) arg0;
	    return (permission == privilege.getPermission()
		    && duration == privilege.getDuration());
	}
	return false;
    }
}
