// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

public class gu {
  // [JNT] MethodHandle dispatch table (removed)
  public static zn oxg(int var0, int var1) {
    zn var2 = /* jnt */((/* jnt */ * 3L + (long)(var0 * 175)) % 7200L)
        / 7200.0F,
      0.6F,
      1.0F
    );
    return (zn)/* jnt */,
      null /* jnt:encrypted */,
      null /* jnt:encrypted */,
      var1
    );
  }

  public static zn rarm(zn var0, int var1, int var2) {
    float[] var3 = new float[3];
    float[] var10000 = /* jnt */,
      null /* jnt:encrypted */,
      null /* jnt:encrypted */,
      var3
    );
    float var4 = /* jnt */(/* jnt */ % 2000L) / 1000.0F
              + (float)var1 / (float)var2 * 2.0F
          )
          % 2.0F
        - 1.0F
    );
    var3[2] = 0.25F + 0.75F * var4 % 2.0F;
    int var5 = /* jnt */;
    return (zn)/* jnt */
    );
  }

  public static zn khq(float var0, zn var1, zn var2) {
    return (zn)/* jnt *//* jnt */null /* jnt:encrypted */, (double)null /* jnt:encrypted */
      ),
      (int)/* jnt */null /* jnt:encrypted */, (double)null /* jnt:encrypted */
      ),
      (int)/* jnt */null /* jnt:encrypted */, (double)null /* jnt:encrypted */
      )
    );
  }

  public static zn by(float var0, int var1, zn var2) {
    return (zn)/* jnt */,
      null /* jnt:encrypted */,
      null /* jnt:encrypted */,
      (int)/* jnt */null /* jnt:encrypted */, (double)var1)
    );
  }

  public static zn qsl(zn var0, zn var1, float var2) {
    int var3 = /* jnt */null /* jnt:encrypted */
          + var2 * (float)(null /* jnt:encrypted */ - null /* jnt:encrypted */)
      ),
      0,
      255
    );
    int var4 = /* jnt */null /* jnt:encrypted */
          + var2 * (float)(null /* jnt:encrypted */ - null /* jnt:encrypted */)
      ),
      0,
      255
    );
    int var5 = /* jnt */null /* jnt:encrypted */
          + var2 * (float)(null /* jnt:encrypted */ - null /* jnt:encrypted */)
      ),
      0,
      255
    );
    int var6 = /* jnt */null /* jnt:encrypted */
          + var2 * (float)(null /* jnt:encrypted */ - null /* jnt:encrypted */)
      ),
      0,
      255
    );
    return (zn)/* jnt */;
  }

  public static int muw(int var0, int var1, int var2) {
    return /* jnt */
    );
  }

  public static int rdq(int var0, int var1, float var2) {
    int var3 = var0 >> 24 & 0xFF;
    int var4 = var1 >> 24 & 0xFF;
    int var5 = var0 >> 16 & 0xFF;
    int var6 = var1 >> 16 & 0xFF;
    int var7 = var0 >> 8 & 0xFF;
    int var8 = var1 >> 8 & 0xFF;
    int var9 = var0 & 0xFF;
    int var10 = var1 & 0xFF;
    int var11 = /* jnt */var3 + var2 * (float)(var4 - var3)), 0, 255
    );
    int var12 = /* jnt */var5 + var2 * (float)(var6 - var5)), 0, 255
    );
    int var13 = /* jnt */var7 + var2 * (float)(var8 - var7)), 0, 255
    );
    int var14 = /* jnt */var9 + var2 * (float)(var10 - var9)), 0, 255
    );
    return var11 << 24 | var12 << 16 | var13 << 8 | var14;
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (var10 - 1298864690 + 78019232 - 16706346 + 136051451 ^ 1197948502) - 2090815835 - 1098411352 - 1238442337 ^ 1142159690;
    MethodHandle var10000 = gpq[((var10 - 1298864690 + 78019232 - 16706346 + 136051451 ^ 1197948502) - 2090815835 - 1098411352 - 1238442337 ^ 1142159690)
      - 431222356];
    if (gpq[var10001 - 431222356] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = 1645104151 >> 1645104151 ^ 196; var23 < var13.length(); var23 += (1684497675 ^ 541050316 | 1) & -1952376575) {
        int var42 = var13.charAt(var23);
        int var10004 = (var42 & 0) >> 16;
        int var43 = ((var42 & 0) >> 16 | var42 << 0) + 157;
        int var79 = (((var42 & 0) >> 16 | var42 << 0) + 157 & 65024) >> 9;
        var42 = ((((var10004 | var42 << 0) + 157 & 65024) >> 9 | ((var42 & 0) >> 16 | var42 << 0) + 157 << 7) ^ 92 ^ 168) + 149 + 7;
        var10004 = (((var79 | var43 << 7) ^ 92 ^ 168) + 149 + 7 & 63488) >> 11;
        int var45 = ((((var79 | var43 << 7) ^ 92 ^ 168) + 149 + 7 & 63488) >> 11 | var42 << 5) + 246;
        int var81 = (((((var79 | var43 << 7) ^ 92 ^ 168) + 149 + 7 & 63488) >> 11 | var42 << 5) + 246 & 65408) >> 7;
        char var46 = (char)(
          ((var10004 | var42 << 5) + 246 & 65408) >> 7 | ((((var79 | var43 << 7) ^ 92 ^ 168) + 149 + 7 & 63488) >> 11 | var42 << 5) + 246 << 9
        );
        var13.setCharAt(var23, (char)(var81 | var45 << 9));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (-1661617577 | 1144771380 | 0) & 16777224; var29 < var16.length(); var29 += (1135350259 | 903622745 & -1317376052 | 0) & 67241473) {
        int var51 = ((var16.charAt(var29) ^ 'R') - 86 ^ 248) + 60 - 198 - 165;
        int var82 = (var51 & 63488) >> 11;
        int var52 = ((var51 & 63488) >> 11 | var51 << 5) - 213;
        int var83 = (((var51 & 63488) >> 11 | var51 << 5) - 213 & 32768) >> 15;
        char var53 = (char)((((var82 | var51 << 5) - 213 & 32768) >> 15 | ((var51 & 63488) >> 11 | var51 << 5) - 213 << 1) ^ 88);
        var16.setCharAt(var29, (char)((var83 | var52 << 1) ^ 88));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), gu.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = 2132338456 >> 541928529 ^ 16268; var35 < var19.length(); var35 += (-1827415221 - -94125502 | 1) & 1128751781) {
        int var58 = var19.charAt(var35) - 183 ^ 146;
        char var61 = (char)(
          (
              ((((((var58 & 63488) >> 11 | var58 << 5) & 65528) >> 3 | ((var58 & 63488) >> 11 | var58 << 5) << 13) + 19 ^ 92) + 32 + 62 & 0) >> 16
                | (((((var58 & 63488) >> 11 | var58 << 5) & 65528) >> 3 | ((var58 & 63488) >> 11 | var58 << 5) << 13) + 19 ^ 92) + 32 + 62 << 0
            )
            ^ 179
        );
        var19.setCharAt(
          var35,
          (char)(
            (
                ((((((var58 & 63488) >> 11 | var58 << 5) & 65528) >> 3 | ((var58 & 63488) >> 11 | var58 << 5) << 13) + 19 ^ 92) + 32 + 62 & 0) >> 16
                  | (((((var58 & 63488) >> 11 | var58 << 5) & 65528) >> 3 | ((var58 & 63488) >> 11 | var58 << 5) << 13) + 19 ^ 92) + 32 + 62 << 0
              )
              ^ 179
          )
        );
      }

      Class var7 = Class.forName(var19.toString(), false, gu.class.getClassLoader());
      switch ((((var4 ^ 1060347739) - 1251899301 + 650975890 ^ 15780307) + 710270904 ^ 1852832553 ^ 2063504094 ^ 1622825257) - 345552744 - 1977564624) {
        case 1168868338:
        case 1741283343:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1370070436:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 1654188741:
          var10000 = var0.findSpecial(var7, var5, var6, gu.class);
          break;
        case 2013197697:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    gpq[((var10 - 1298864690 + 78019232 - 16706346 + 136051451 ^ 1197948502) - 2090815835 - 1098411352 - 1238442337 ^ 1142159690) - 431222356] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (var10 + 1791762864 - 1077887064 + 1051512212 + 170630480 ^ 1944945712) + 1140888678 + 1329514915 + 651640962 - 1009487872;
    MethodHandle var10000 = gpq[(var10 + 1791762864 - 1077887064 + 1051512212 + 170630480 ^ 1944945712)
      + 1140888678
      + 1329514915
      + 651640962
      - 1009487872
      - 1639660353];
    if (gpq[var10001 - 1639660353] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = -1763120282 >> 1057025125 ^ -55097509; var24 < var14.length(); var24 += (959850511 >>> -1739369426 | 1) & -1511978975) {
        int var43 = var14.charAt(var24) ^ '6';
        int var10004 = (var43 & 63488) >> 11;
        int var44 = (var43 & 63488) >> 11 | var43 << 5;
        int var90 = (((var43 & 63488) >> 11 | var43 << 5) & 63488) >> 11;
        var43 = (((var10004 | var43 << 5) & 63488) >> 11 | ((var43 & 63488) >> 11 | var43 << 5) << 5) - 59 + 40;
        var10004 = ((var90 | var44 << 5) - 59 + 40 & 65024) >> 9;
        int var46 = (((var90 | var44 << 5) - 59 + 40 & 65024) >> 9 | var43 << 7) - 215;
        int var92 = ((((var90 | var44 << 5) - 59 + 40 & 65024) >> 9 | var43 << 7) - 215 & 32768) >> 15;
        var43 = ((var10004 | var43 << 7) - 215 & 32768) >> 15 | (((var90 | var44 << 5) - 59 + 40 & 65024) >> 9 | var43 << 7) - 215 << 1;
        var10004 = ((var92 | var46 << 1) & 57344) >> 13;
        int var48 = ((var92 | var46 << 1) & 57344) >> 13 | var43 << 3;
        int var94 = ((((var92 | var46 << 1) & 57344) >> 13 | var43 << 3) & 65024) >> 9;
        char var49 = (char)(((var10004 | var43 << 3) & 65024) >> 9 | (((var92 | var46 << 1) & 57344) >> 13 | var43 << 3) << 7);
        var14.setCharAt(var24, (char)(var94 | var48 << 7));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (-958695918 - -958695918 | 0) & -900199250; var30 < var17.length(); var30 += 1977584602 >> -720200258 ^ 0) {
        int var54 = var17.charAt(var30) + '_';
        char var59 = (char)(
          (
              (
                    (
                          (
                                (
                                    (((((var54 & 65472) >> 6 | var54 << 10) - 62 & 32768) >> 15 | ((var54 & 65472) >> 6 | var54 << 10) - 62 << 1) + 25 & 32768)
                                        >> 15
                                      | ((((var54 & 65472) >> 6 | var54 << 10) - 62 & 32768) >> 15 | ((var54 & 65472) >> 6 | var54 << 10) - 62 << 1) + 25 << 1
                                  )
                                  & 65504
                              )
                              >> 5
                            | (
                                (((((var54 & 65472) >> 6 | var54 << 10) - 62 & 32768) >> 15 | ((var54 & 65472) >> 6 | var54 << 10) - 62 << 1) + 25 & 32768)
                                    >> 15
                                  | ((((var54 & 65472) >> 6 | var54 << 10) - 62 & 32768) >> 15 | ((var54 & 65472) >> 6 | var54 << 10) - 62 << 1) + 25 << 1
                              )
                              << 11
                        )
                        + 22
                      & 65528
                  )
                  >> 3
                | (
                      (
                            (
                                (((((var54 & 65472) >> 6 | var54 << 10) - 62 & 32768) >> 15 | ((var54 & 65472) >> 6 | var54 << 10) - 62 << 1) + 25 & 32768)
                                    >> 15
                                  | ((((var54 & 65472) >> 6 | var54 << 10) - 62 & 32768) >> 15 | ((var54 & 65472) >> 6 | var54 << 10) - 62 << 1) + 25 << 1
                              )
                              & 65504
                          )
                          >> 5
                        | (
                            (((((var54 & 65472) >> 6 | var54 << 10) - 62 & 32768) >> 15 | ((var54 & 65472) >> 6 | var54 << 10) - 62 << 1) + 25 & 32768) >> 15
                              | ((((var54 & 65472) >> 6 | var54 << 10) - 62 & 32768) >> 15 | ((var54 & 65472) >> 6 | var54 << 10) - 62 << 1) + 25 << 1
                          )
                          << 11
                    )
                    + 22
                  << 13
            )
            - 159
        );
        var17.setCharAt(
          var30,
          (char)(
            (
                (
                      (
                            (
                                  (
                                      (
                                            ((((var54 & 65472) >> 6 | var54 << 10) - 62 & 32768) >> 15 | ((var54 & 65472) >> 6 | var54 << 10) - 62 << 1) + 25
                                              & 32768
                                          )
                                          >> 15
                                        | ((((var54 & 65472) >> 6 | var54 << 10) - 62 & 32768) >> 15 | ((var54 & 65472) >> 6 | var54 << 10) - 62 << 1) + 25
                                          << 1
                                    )
                                    & 65504
                                )
                                >> 5
                              | (
                                  (((((var54 & 65472) >> 6 | var54 << 10) - 62 & 32768) >> 15 | ((var54 & 65472) >> 6 | var54 << 10) - 62 << 1) + 25 & 32768)
                                      >> 15
                                    | ((((var54 & 65472) >> 6 | var54 << 10) - 62 & 32768) >> 15 | ((var54 & 65472) >> 6 | var54 << 10) - 62 << 1) + 25 << 1
                                )
                                << 11
                          )
                          + 22
                        & 65528
                    )
                    >> 3
                  | (
                        (
                              (
                                  (((((var54 & 65472) >> 6 | var54 << 10) - 62 & 32768) >> 15 | ((var54 & 65472) >> 6 | var54 << 10) - 62 << 1) + 25 & 32768)
                                      >> 15
                                    | ((((var54 & 65472) >> 6 | var54 << 10) - 62 & 32768) >> 15 | ((var54 & 65472) >> 6 | var54 << 10) - 62 << 1) + 25 << 1
                                )
                                & 65504
                            )
                            >> 5
                          | (
                              (((((var54 & 65472) >> 6 | var54 << 10) - 62 & 32768) >> 15 | ((var54 & 65472) >> 6 | var54 << 10) - 62 << 1) + 25 & 32768) >> 15
                                | ((((var54 & 65472) >> 6 | var54 << 10) - 62 & 32768) >> 15 | ((var54 & 65472) >> 6 | var54 << 10) - 62 << 1) + 25 << 1
                            )
                            << 11
                      )
                      + 22
                    << 13
              )
              - 159
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, gu.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (113592812 ^ -449733579 | 0) & 403374630; var36 < var20.length(); var36 += (897639138 >> 897639138 | 1) & 277939463) {
        char var64 = var20.charAt(var36);
        char var67 = (char)(
          (
              (
                    (
                        (((((var64 & '￠') >> 5 | var64 << 11) ^ 159) - 135 ^ 14 ^ 232 ^ 64) & 65532) >> 2
                          | ((((var64 & '￠') >> 5 | var64 << 11) ^ 159) - 135 ^ 14 ^ 232 ^ 64) << 14
                      )
                      & 65472
                  )
                  >> 6
                | (
                    (((((var64 & '￠') >> 5 | var64 << 11) ^ 159) - 135 ^ 14 ^ 232 ^ 64) & 65532) >> 2
                      | ((((var64 & '￠') >> 5 | var64 << 11) ^ 159) - 135 ^ 14 ^ 232 ^ 64) << 14
                  )
                  << 10
            )
            + 24
            - 248
        );
        var20.setCharAt(
          var36,
          (char)(
            (
                (
                      (
                          (((((var64 & '￠') >> 5 | var64 << 11) ^ 159) - 135 ^ 14 ^ 232 ^ 64) & 65532) >> 2
                            | ((((var64 & '￠') >> 5 | var64 << 11) ^ 159) - 135 ^ 14 ^ 232 ^ 64) << 14
                        )
                        & 65472
                    )
                    >> 6
                  | (
                      (((((var64 & '￠') >> 5 | var64 << 11) ^ 159) - 135 ^ 14 ^ 232 ^ 64) & 65532) >> 2
                        | ((((var64 & '￠') >> 5 | var64 << 11) ^ 159) - 135 ^ 14 ^ 232 ^ 64) << 14
                    )
                    << 10
              )
              + 24
              - 248
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), gu.class.getClassLoader()).returnType();
      switch (((var4 - 1407271871 + 652066793 + 1674622760 - 950495107 ^ 1994643866) + 2015849153 ^ 1133815300 ^ 348099011 ^ 723733985) + 1954718765) {
        case 216430829:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 488430633:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1024108529:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1873317873:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      gpq[(var10 + 1791762864 - 1077887064 + 1051512212 + 170630480 ^ 1944945712) + 1140888678 + 1329514915 + 651640962 - 1009487872 - 1639660353] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
