package org.runite.client;

import org.rs09.client.Linkable;

public final class Class3_Sub10 extends Linkable {

    public RSString value;


    static void method138(RSString var0) {
        try {
            Unsorted.method1250(93, false);
            Class75.method1339(var0);
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "hb.F(" + (var0 != null ? "{...}" : "null") + ',' + 0 + ')');
        }
    }

    static void method139(int var0) {
        try {
            if (var0 >= 63) {
                ObjectDefinition.aReferenceCache_21.clear();
                ObjectDefinition.aReferenceCache_1401.clear();
                ObjectDefinition.aReferenceCache_4051.clear();
                ObjectDefinition.aReferenceCache_1965.clear();
            }
        } catch (RuntimeException var2) {
            throw ClientErrorException.clientError(var2, "hb.D(" + var0 + ')');
        }
    }

    static boolean method140(int var0) {
        try {
            return (var0 >= 0 && Class3_Sub24_Sub4.aBooleanArray3503.length > var0) && Class3_Sub24_Sub4.aBooleanArray3503[var0];
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "hb.A(" + var0 + ',' + 20 + ')');
        }
    }

    static void method142() {
        try {

            Class158_Sub1.aReferenceCache_2982.clear();
        } catch (RuntimeException var2) {
            throw ClientErrorException.clientError(var2, "hb.C(" + true + ')');
        }
    }

    public Class3_Sub10() {
    }

    public Class3_Sub10(RSString var1, int var2) {
        try {
            this.value = var1;
        } catch (RuntimeException var4) {
            throw ClientErrorException.clientError(var4, "hb.<init>(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
        }
    }

}
