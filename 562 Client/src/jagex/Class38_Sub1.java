package jagex;/* jagex.Class38_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class38_Sub1 extends Class38 implements Interface2
{
    public int anInt3269;
    
    public void method8(Class7 arg0) {
	aClass130_Sub2_507.opengl.glColorPointer
	    (arg0.aByte99, arg0.aShort103, anInt3269,
	     aByteBuffer508.position(arg0.aByte100));
    }
    
    public Class38_Sub1(HDToolkit arg0, int arg1, ByteBuffer arg2) {
	super(arg0, arg2);
	anInt3269 = arg1;
    }
    
    public void method6(Class7 arg0) {
	aClass130_Sub2_507.opengl.glTexCoordPointer
	    (arg0.aByte99, arg0.aShort103, anInt3269,
	     aByteBuffer508.position(arg0.aByte100));
    }
    
    public void method3(int arg0, byte[] arg1, int arg2) {
	method500(arg1, arg2);
	anInt3269 = arg0;
    }
    
    public Class38_Sub1(HDToolkit arg0, int arg1, byte[] arg2, int arg3) {
	super(arg0, arg2, arg3);
	anInt3269 = arg1;
    }
    
    public void method5(Class7 arg0) {
	aClass130_Sub2_507.opengl.glVertexPointer
	    (arg0.aByte99, arg0.aShort103, anInt3269,
	     aByteBuffer508.position(arg0.aByte100));
    }
    
    public void method7(Class7 arg0) {
	aClass130_Sub2_507.opengl.glNormalPointer
	    (arg0.aShort103, anInt3269,
	     aByteBuffer508.position(arg0.aByte100));
    }
    
    public int method4() {
	return 0;
    }
}
