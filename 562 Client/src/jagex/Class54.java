package jagex;/* jagex.Class54 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class54
{
    public int anInt709;
    public HDToolkit aClass130_Sub2_710;
    
    public void method607(int arg0) {
	aClass130_Sub2_710.opengl.glNewList(anInt709 + arg0, 4864);
    }
    
    public void method608() {
	aClass130_Sub2_710.opengl.glEndList();
    }
    
    public Class54(HDToolkit arg0, int arg1) {
	aClass130_Sub2_710 = arg0;
	anInt709 = aClass130_Sub2_710.opengl.glGenLists(arg1);
    }
    
    public void method609(char arg0) {
	aClass130_Sub2_710.opengl.glCallList(anInt709 + arg0);
    }
}
