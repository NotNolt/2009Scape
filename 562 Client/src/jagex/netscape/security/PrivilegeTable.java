package jagex.netscape.security;
import java.util.Enumeration;
import java.util.Hashtable;

public class PrivilegeTable
{
    Hashtable table = new Hashtable();
    
    public int size() {
	return table.size();
    }
    
    public boolean isEmpty() {
	return table.isEmpty();
    }
    
    public Enumeration keys() {
	return table.keys();
    }
    
    public Enumeration elements() {
	return table.elements();
    }
    
    public Privilege get(Object arg0) {
	return (Privilege) table.get(arg0);
    }
    
    public Privilege get(Target arg0) {
	return get((Object) arg0);
    }
    
    public Privilege put(Object arg0, Privilege arg1) {
	return (Privilege) table.put(arg0, arg1);
    }
    
    public Privilege put(Target arg0, Privilege arg1) {
	return (Privilege) table.put(arg0, arg1);
    }
    
    public Privilege remove(Object arg0) {
	return (Privilege) table.remove(arg0);
    }
    
    public Privilege remove(Target arg0) {
	return (Privilege) table.remove(arg0);
    }
    
    public void clear() {
	table.clear();
    }
}
