package jagex;/* jagex.RawStream - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class RawStream extends Stream
{
    public void method1782(float arg0, byte arg1) {
	if (arg1 != -30)
	    method1782(1.1401689F, (byte) -113);
	int i = Float.floatToRawIntBits(arg0);
	aByteArray4324[anInt4360++] = (byte) i;
	aByteArray4324[anInt4360++] = (byte) (i >> -480786424);
	aByteArray4324[anInt4360++] = (byte) (i >> -922546768);
	aByteArray4324[anInt4360++] = (byte) (i >> -1925215560);
    }
    
    public void method1783(float arg0, byte arg1) {
	int i = Float.floatToRawIntBits(arg0);
	aByteArray4324[anInt4360++] = (byte) (i >> -1520506120);
	if (arg1 == 126) {
	    aByteArray4324[anInt4360++] = (byte) (i >> 993081040);
	    aByteArray4324[anInt4360++] = (byte) (i >> -1790614584);
	    aByteArray4324[anInt4360++] = (byte) i;
	}
    }
    
    public RawStream(int arg0) {
	super(arg0);
    }
}
