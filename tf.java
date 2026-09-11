// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

public enum tf {
  ml,
  xt;
  // [JNT] MethodHandle dispatch table (removed)
  // $VF: Failed to inline enum fields
  // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
  static {
    int var10000 = (2024651990 ^ 2024651990 | 0) & 741035734;

    StringBuilder var10001;
    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < (-28130775 << 99648448 ^ -28130784);
      var10000 += (1049257852 - 1049257852 | 1) & 20995833
    ) {
      /* jnt */(
          (/* jnt */ - 156 ^ 12)
              - 84
              + 56
            ^ 236
        )
      );
    }

    ml = (tf)/* jnt */,
      0
    );
    var10000 = (-1838536552 << 1498578336 | 0) & 680859489;

    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < (1127393232 * -829540968 ^ -667831416);
      var10000 += -1319539182 << 1176206369 ^ 1655888933
    ) {
      int var8 = /* jnt */ - 'V';
      int var10004 = (var8 & 65535) >> 0;
      int var9 = ((var8 & 65535) >> 0 | var8 << 16) ^ 79;
      int var13 = ((((var8 & 65535) >> 0 | var8 << 16) ^ 79) & 49152) >> 14;
      char var10 = (char)(((((var10004 | var8 << 16) ^ 79) & 49152) >> 14 | (((var8 & 65535) >> 0 | var8 << 16) ^ 79) << 2) ^ 85);
      /* jnt */((var13 | var9 << 2) ^ 85)
      );
    }

    xt = (tf)/* jnt */,
      1
    );
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 - 2147408688 ^ 961060435) + 586294115 ^ 1651981757 ^ 57248117) + 759324673 - 15366518 + 126420098 - 572379812;
    MethodHandle var10000 = ujn[((var10 - 2147408688 ^ 961060435) + 586294115 ^ 1651981757 ^ 57248117)
      + 759324673
      - 15366518
      + 126420098
      - 572379812
      + 1979254831];
    if (ujn[var10001 + 1979254831] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = -587358547 >>> 1068724650 ^ 3620711; var23 < var13.length(); var23 += 1184410704 >>> -951208278 ^ 1156650) {
        int var42 = var13.charAt(var23) - 130 + 236 + 243 + 8;
        char var45 = (char)(
          (
              (
                    (((((var42 & 63488) >> 11 | var42 << 5) & 65532) >> 2 | ((var42 & 63488) >> 11 | var42 << 5) << 14) & 0) >> 16
                      | ((((var42 & 63488) >> 11 | var42 << 5) & 65532) >> 2 | ((var42 & 63488) >> 11 | var42 << 5) << 14) << 0
                  )
                  - 51
                ^ 8
            )
            - 16
        );
        var13.setCharAt(
          var23,
          (char)(
            (
                (
                      (((((var42 & 63488) >> 11 | var42 << 5) & 65532) >> 2 | ((var42 & 63488) >> 11 | var42 << 5) << 14) & 0) >> 16
                        | ((((var42 & 63488) >> 11 | var42 << 5) & 65532) >> 2 | ((var42 & 63488) >> 11 | var42 << 5) << 14) << 0
                    )
                    - 51
                  ^ 8
              )
              - 16
          )
        );
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = 134910564 + 76970855 ^ 211881419; var29 < var16.length(); var29 += 1331404281 << -387447935 ^ -1632158733) {
        int var50 = var16.charAt(var29) ^ 239;
        int var87 = (var50 & 65520) >> 4;
        int var51 = (var50 & 65520) >> 4 | var50 << 12;
        int var88 = (((var50 & 65520) >> 4 | var50 << 12) & 65472) >> 6;
        var50 = ((var87 | var50 << 12) & 65472) >> 6 | ((var50 & 65520) >> 4 | var50 << 12) << 10;
        var87 = ((var88 | var51 << 10) & 32768) >> 15;
        int var53 = (((var88 | var51 << 10) & 32768) >> 15 | var50 << 1) - 106 - 129 + 68 - 124;
        int var90 = ((((var88 | var51 << 10) & 32768) >> 15 | var50 << 1) - 106 - 129 + 68 - 124 & 65532) >> 2;
        char var54 = (char)(
          (((var87 | var50 << 1) - 106 - 129 + 68 - 124 & 65532) >> 2 | (((var88 | var51 << 10) & 32768) >> 15 | var50 << 1) - 106 - 129 + 68 - 124 << 14) - 76
        );
        var16.setCharAt(var29, (char)((var90 | var53 << 14) - 76));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), tf.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (-1060378545 * 516460702 | 0) & 4328993; var35 < var19.length(); var35 += -1813782100 - -1813782100 ^ 1) {
        int var59 = var19.charAt(var35) - 'e' ^ 222;
        char var64 = (char)(
          (
              (
                    (
                        (
                              (
                                  (
                                        (((((var59 & 65532) >> 2 | var59 << 14) & 65528) >> 3 | ((var59 & 65532) >> 2 | var59 << 14) << 13) & 64512) >> 10
                                          | ((((var59 & 65532) >> 2 | var59 << 14) & 65528) >> 3 | ((var59 & 65532) >> 2 | var59 << 14) << 13) << 6
                                      )
                                      + 33
                                    ^ 238
                                )
                                & 61440
                            )
                            >> 12
                          | (
                              (
                                    (((((var59 & 65532) >> 2 | var59 << 14) & 65528) >> 3 | ((var59 & 65532) >> 2 | var59 << 14) << 13) & 64512) >> 10
                                      | ((((var59 & 65532) >> 2 | var59 << 14) & 65528) >> 3 | ((var59 & 65532) >> 2 | var59 << 14) << 13) << 6
                                  )
                                  + 33
                                ^ 238
                            )
                            << 4
                      )
                      & 65534
                  )
                  >> 1
                | (
                    (
                          (
                              (
                                    (((((var59 & 65532) >> 2 | var59 << 14) & 65528) >> 3 | ((var59 & 65532) >> 2 | var59 << 14) << 13) & 64512) >> 10
                                      | ((((var59 & 65532) >> 2 | var59 << 14) & 65528) >> 3 | ((var59 & 65532) >> 2 | var59 << 14) << 13) << 6
                                  )
                                  + 33
                                ^ 238
                            )
                            & 61440
                        )
                        >> 12
                      | (
                          (
                                (((((var59 & 65532) >> 2 | var59 << 14) & 65528) >> 3 | ((var59 & 65532) >> 2 | var59 << 14) << 13) & 64512) >> 10
                                  | ((((var59 & 65532) >> 2 | var59 << 14) & 65528) >> 3 | ((var59 & 65532) >> 2 | var59 << 14) << 13) << 6
                              )
                              + 33
                            ^ 238
                        )
                        << 4
                  )
                  << 15
            )
            + 31
        );
        var19.setCharAt(
          var35,
          (char)(
            (
                (
                      (
                          (
                                (
                                    (
                                          (((((var59 & 65532) >> 2 | var59 << 14) & 65528) >> 3 | ((var59 & 65532) >> 2 | var59 << 14) << 13) & 64512) >> 10
                                            | ((((var59 & 65532) >> 2 | var59 << 14) & 65528) >> 3 | ((var59 & 65532) >> 2 | var59 << 14) << 13) << 6
                                        )
                                        + 33
                                      ^ 238
                                  )
                                  & 61440
                              )
                              >> 12
                            | (
                                (
                                      (((((var59 & 65532) >> 2 | var59 << 14) & 65528) >> 3 | ((var59 & 65532) >> 2 | var59 << 14) << 13) & 64512) >> 10
                                        | ((((var59 & 65532) >> 2 | var59 << 14) & 65528) >> 3 | ((var59 & 65532) >> 2 | var59 << 14) << 13) << 6
                                    )
                                    + 33
                                  ^ 238
                              )
                              << 4
                        )
                        & 65534
                    )
                    >> 1
                  | (
                      (
                            (
                                (
                                      (((((var59 & 65532) >> 2 | var59 << 14) & 65528) >> 3 | ((var59 & 65532) >> 2 | var59 << 14) << 13) & 64512) >> 10
                                        | ((((var59 & 65532) >> 2 | var59 << 14) & 65528) >> 3 | ((var59 & 65532) >> 2 | var59 << 14) << 13) << 6
                                    )
                                    + 33
                                  ^ 238
                              )
                              & 61440
                          )
                          >> 12
                        | (
                            (
                                  (((((var59 & 65532) >> 2 | var59 << 14) & 65528) >> 3 | ((var59 & 65532) >> 2 | var59 << 14) << 13) & 64512) >> 10
                                    | ((((var59 & 65532) >> 2 | var59 << 14) & 65528) >> 3 | ((var59 & 65532) >> 2 | var59 << 14) << 13) << 6
                                )
                                + 33
                              ^ 238
                          )
                          << 4
                    )
                    << 15
              )
              + 31
          )
        );
      }

      Class var7 = Class.forName(var19.toString(), false, tf.class.getClassLoader());
      switch ((var4 + 2141083353 ^ 1222656566 ^ 1527523994) - 259477330 - 1353599693 + 625048692 - 627277431 - 1466962118 - 511988649 + 1112765318) {
        case 50480511:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 450932414:
          var10000 = var0.findSpecial(var7, var5, var6, tf.class);
          break;
        case 1120523007:
        case 1849297488:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1941275826:
          var10000 = var0.findConstructor(var7, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    ujn[((var10 - 2147408688 ^ 961060435) + 586294115 ^ 1651981757 ^ 57248117) + 759324673 - 15366518 + 126420098 - 572379812 + 1979254831] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 ^ 1224217623) - 940921853 - 1817913735 ^ 1526634660) - 1773789481 - 1086054953 - 289541262 + 1066299701 + 628539065;
    MethodHandle var10000 = ujn[((var10 ^ 1224217623) - 940921853 - 1817913735 ^ 1526634660) - 1773789481 - 1086054953 - 289541262 + 1066299701 + 628539065
      ^ 1982028539];
    if (ujn[var10001 ^ 1982028539] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (-1071514944 - (1568190285 - (-1071514944 + 1568190285)) | 0) & 1764754047;
        var24 < var14.length();
        var24 += (-1903190795 - -1456857743 | 1) & 270139417
      ) {
        int var43 = var14.charAt(var24) - ';' + 81 - 241;
        int var10004 = (var43 & 65408) >> 7;
        int var44 = (var43 & 65408) >> 7 | var43 << 9;
        int var92 = (((var43 & 65408) >> 7 | var43 << 9) & 65520) >> 4;
        var43 = ((var10004 | var43 << 9) & 65520) >> 4 | ((var43 & 65408) >> 7 | var43 << 9) << 12;
        var10004 = ((var92 | var44 << 12) & 65535) >> 0;
        int var46 = (((var92 | var44 << 12) & 65535) >> 0 | var43 << 16) + 167;
        int var94 = ((((var92 | var44 << 12) & 65535) >> 0 | var43 << 16) + 167 & 65520) >> 4;
        var43 = ((var10004 | var43 << 16) + 167 & 65520) >> 4 | (((var92 | var44 << 12) & 65535) >> 0 | var43 << 16) + 167 << 12;
        var10004 = ((var94 | var46 << 12) & 65408) >> 7;
        int var48 = ((var94 | var46 << 12) & 65408) >> 7 | var43 << 9;
        int var96 = ((((var94 | var46 << 12) & 65408) >> 7 | var43 << 9) & 0) >> 16;
        char var49 = (char)(((var10004 | var43 << 9) & 0) >> 16 | (((var94 | var46 << 12) & 65408) >> 7 | var43 << 9) << 0);
        var14.setCharAt(var24, (char)(var96 | var48 << 0));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = 588975069 * 317111092 ^ 364304356; var30 < var17.length(); var30 += -1096462987 >> (475684290 >>> 475684290) ^ -16732) {
        char var54 = var17.charAt(var30);
        char var59 = (char)(
          (
              (
                    (
                          (
                              (
                                    (
                                          (((((var54 & '￠') >> 5 | var54 << 11) & 61440) >> 12 | ((var54 & '￠') >> 5 | var54 << 11) << 4) & 0) >> 16
                                            | ((((var54 & '￠') >> 5 | var54 << 11) & 61440) >> 12 | ((var54 & '￠') >> 5 | var54 << 11) << 4) << 0
                                        )
                                        - 152
                                      & 61440
                                  )
                                  >> 12
                                | (
                                      (((((var54 & '￠') >> 5 | var54 << 11) & 61440) >> 12 | ((var54 & '￠') >> 5 | var54 << 11) << 4) & 0) >> 16
                                        | ((((var54 & '￠') >> 5 | var54 << 11) & 61440) >> 12 | ((var54 & '￠') >> 5 | var54 << 11) << 4) << 0
                                    )
                                    - 152
                                  << 4
                            )
                            ^ 182
                        )
                        - 63
                        - 180
                      & 49152
                  )
                  >> 14
                | (
                      (
                          (
                                (
                                      (((((var54 & '￠') >> 5 | var54 << 11) & 61440) >> 12 | ((var54 & '￠') >> 5 | var54 << 11) << 4) & 0) >> 16
                                        | ((((var54 & '￠') >> 5 | var54 << 11) & 61440) >> 12 | ((var54 & '￠') >> 5 | var54 << 11) << 4) << 0
                                    )
                                    - 152
                                  & 61440
                              )
                              >> 12
                            | (
                                  (((((var54 & '￠') >> 5 | var54 << 11) & 61440) >> 12 | ((var54 & '￠') >> 5 | var54 << 11) << 4) & 0) >> 16
                                    | ((((var54 & '￠') >> 5 | var54 << 11) & 61440) >> 12 | ((var54 & '￠') >> 5 | var54 << 11) << 4) << 0
                                )
                                - 152
                              << 4
                        )
                        ^ 182
                    )
                    - 63
                    - 180
                  << 2
            )
            ^ 67
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
                                            (((((var54 & '￠') >> 5 | var54 << 11) & 61440) >> 12 | ((var54 & '￠') >> 5 | var54 << 11) << 4) & 0) >> 16
                                              | ((((var54 & '￠') >> 5 | var54 << 11) & 61440) >> 12 | ((var54 & '￠') >> 5 | var54 << 11) << 4) << 0
                                          )
                                          - 152
                                        & 61440
                                    )
                                    >> 12
                                  | (
                                        (((((var54 & '￠') >> 5 | var54 << 11) & 61440) >> 12 | ((var54 & '￠') >> 5 | var54 << 11) << 4) & 0) >> 16
                                          | ((((var54 & '￠') >> 5 | var54 << 11) & 61440) >> 12 | ((var54 & '￠') >> 5 | var54 << 11) << 4) << 0
                                      )
                                      - 152
                                    << 4
                              )
                              ^ 182
                          )
                          - 63
                          - 180
                        & 49152
                    )
                    >> 14
                  | (
                        (
                            (
                                  (
                                        (((((var54 & '￠') >> 5 | var54 << 11) & 61440) >> 12 | ((var54 & '￠') >> 5 | var54 << 11) << 4) & 0) >> 16
                                          | ((((var54 & '￠') >> 5 | var54 << 11) & 61440) >> 12 | ((var54 & '￠') >> 5 | var54 << 11) << 4) << 0
                                      )
                                      - 152
                                    & 61440
                                )
                                >> 12
                              | (
                                    (((((var54 & '￠') >> 5 | var54 << 11) & 61440) >> 12 | ((var54 & '￠') >> 5 | var54 << 11) << 4) & 0) >> 16
                                      | ((((var54 & '￠') >> 5 | var54 << 11) & 61440) >> 12 | ((var54 & '￠') >> 5 | var54 << 11) << 4) << 0
                                  )
                                  - 152
                                << 4
                          )
                          ^ 182
                      )
                      - 63
                      - 180
                    << 2
              )
              ^ 67
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, tf.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (-782711056 & -782711056 >> -782711056 | 0) & 570505998; var36 < var20.length(); var36 += (848751031 * -2010149580 | 1) & 939887171) {
        int var64 = var20.charAt(var36);
        int var102 = (var64 & 63488) >> 11;
        int var65 = ((var64 & 63488) >> 11 | var64 << 5) - 77 ^ 198;
        int var103 = ((((var64 & 63488) >> 11 | var64 << 5) - 77 ^ 198) & 65528) >> 3;
        var64 = ((((var102 | var64 << 5) - 77 ^ 198) & 65528) >> 3 | (((var64 & 63488) >> 11 | var64 << 5) - 77 ^ 198) << 13) - 41 - 169;
        var102 = ((var103 | var65 << 13) - 41 - 169 & 57344) >> 13;
        int var67 = ((var103 | var65 << 13) - 41 - 169 & 57344) >> 13 | var64 << 3;
        int var105 = ((((var103 | var65 << 13) - 41 - 169 & 57344) >> 13 | var64 << 3) & 65504) >> 5;
        char var68 = (char)((((var102 | var64 << 3) & 65504) >> 5 | (((var103 | var65 << 13) - 41 - 169 & 57344) >> 13 | var64 << 3) << 11) + 111 ^ 214);
        var20.setCharAt(var36, (char)((var105 | var67 << 11) + 111 ^ 214));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), tf.class.getClassLoader()).returnType();
      switch (((var4 ^ 1541748535 ^ 904787077) + 1867578830 - 2111380399 - 1153517100 - 748387539 ^ 638994500) - 880438063 ^ 1100159946 ^ 632865330) {
        case 400846812:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 715411414:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1413502925:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1996446539:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      ujn[((var10 ^ 1224217623) - 940921853 - 1817913735 ^ 1526634660) - 1773789481 - 1086054953 - 289541262 + 1066299701 + 628539065 ^ 1982028539] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
