package org.runite.jagex;

final class Class162 {

   static int anInt2036;
   static int anInt2038 = 0;
   static int[][] anIntArrayArray2039 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
   static byte[] aByteArray2040 = new byte[520];


   static void method2203(Player var0) {
      try {
         Class3_Sub9 var2 = (Class3_Sub9) Unsorted.aHashTable_4046.get(var0.displayName.toLong());

         if(null != var2) {
            if(var2.aClass3_Sub24_Sub1_2312 != null) {
               Class3_Sub26.aClass3_Sub24_Sub2_2563.method461(var2.aClass3_Sub24_Sub1_2312);
               var2.aClass3_Sub24_Sub1_2312 = null;
            }

            var2.unlink();
         }

      } catch (RuntimeException var3) {
         throw Class44.clientError(var3, "wc.B(" + (var0 != null?"{...}":"null") + ',' + 8 + ')');
      }
   }

   static void method2204(DataBuffer var0) {
      try {
         if(null != Unsorted.aClass30_1039) {
            try {
               Unsorted.aClass30_1039.method984(-117, 0L);
               Unsorted.aClass30_1039.method983(var0.buffer, var0.index, -903171152, 24);
            } catch (Exception var3) {
            }
         }

          var0.index += 24;
      } catch (RuntimeException var4) {
         throw Class44.clientError(var4, "wc.E(" + "null" + ',' + 120 + ')');
      }
   }

   static void method2206(int var1) {
      try {
         Class3_Sub28_Sub6 var2 = Class3_Sub24_Sub3.method466(4, var1);
         var2.a();
      } catch (RuntimeException var3) {
         throw Class44.clientError(var3, "wc.A(" + true + ',' + var1 + ')');
      }
   }

   static ObjectDefinition getObjectDefinition(int objectId) {
      try {
          //36873, 24065, 22418

         ObjectDefinition var2 = (ObjectDefinition) Unsorted.aReferenceCache_21.get((long)objectId);
         if(var2 == null) {
            byte[] var3 = Class85.aClass153_1171.getFile(Class3_Sub13_Sub36.method340(objectId), objectId & 255);
            var2 = new ObjectDefinition();
            var2.objectId = objectId;
            if(null != var3) {
               var2.method1692(6219, new DataBuffer(var3));
            }

            var2.method1689(4 + -2120);
            if(!Sprites.aBoolean337 && var2.aBoolean1491) {
               var2.options = null;
            }

            if(var2.NotClipped) {
               var2.ClipType = 0;
               var2.ProjectileClipped = false;
            }

            Unsorted.aReferenceCache_21.put(var2, (long)objectId);
         }
         return var2;
      } catch (RuntimeException var4) {
         throw Class44.clientError(var4, "wc.D(" + 4 + ',' + objectId + ')');
      }
   }

}
