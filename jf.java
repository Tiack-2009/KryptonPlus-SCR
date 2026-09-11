// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

public enum jf {
  ew,
  g;
  // [JNT] MethodHandle dispatch table (removed)
  // $VF: Failed to inline enum fields
  // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
  static {
    int var10000 = (332939212 | 1453952812 | 0) & 134479889;

    StringBuilder var10001;
    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < (1433534069 >>> (960379144 >>> 773493170) ^ 43751);
      var10000 += (1723870679 & 1012223435 | 0) & 294748205
    ) {
      /* jnt */(
          (/* jnt */ + '_' ^ 229 ^ 149 ^ 237) - 18
        )
      );
    }

    ew = (jf)/* jnt */, 0
    );
    var10000 = 1160370683 & 1160370683 ^ 1160370683;

    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < ((1511005047 | -907060273 | 4) & 32773);
      var10000 += (-730591127 + (-1667902163 ^ -730591127) | 1) & -1574303727
    ) {
      char var8 = /* jnt */;
      int var10004 = (var8 & 'ﰀ') >> 10;
      int var9 = ((var8 & 'ﰀ') >> 10 | var8 << 6) + 201;
      int var13 = (((var8 & 'ﰀ') >> 10 | var8 << 6) + 201 & 63488) >> 11;
      var8 = (char)(((((var10004 | var8 << 6) + 201 & 63488) >> 11 | ((var8 & 'ﰀ') >> 10 | var8 << 6) + 201 << 5) ^ 32) - 131);
      /* jnt */(((var13 | var9 << 5) ^ 32) - 131)
      );
    }

    g = (jf)/* jnt */, 1
    );
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 ^ 1296810394 ^ 1941066878) - 106917793 + 1401696373 + 1146121321 - 1290871333 ^ 2010514478) - 1832002313 ^ 1080262738;
    MethodHandle var10000 = deu[(((var10 ^ 1296810394 ^ 1941066878) - 106917793 + 1401696373 + 1146121321 - 1290871333 ^ 2010514478) - 1832002313 ^ 1080262738)
      + 1794766171];
    if (deu[var10001 + 1794766171] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (101120738 - -2072815980 | 0) & 2082751121; var23 < var13.length(); var23 += (849304090 | 849304090 | 1) & 16777445) {
        int var42 = var13.charAt(var23) + 's' - 230 + 64;
        int var10004 = (var42 & 65504) >> 5;
        int var43 = ((var42 & 65504) >> 5 | var42 << 11) ^ 21;
        int var77 = ((((var42 & 65504) >> 5 | var42 << 11) ^ 21) & 49152) >> 14;
        var42 = (((var10004 | var42 << 11) ^ 21) & 49152) >> 14 | (((var42 & 65504) >> 5 | var42 << 11) ^ 21) << 2;
        var10004 = ((var77 | var43 << 2) & 65535) >> 0;
        int var45 = ((var77 | var43 << 2) & 65535) >> 0 | var42 << 16;
        int var79 = ((((var77 | var43 << 2) & 65535) >> 0 | var42 << 16) & 65504) >> 5;
        char var46 = (char)((((var10004 | var42 << 16) & 65504) >> 5 | (((var77 | var43 << 2) & 65535) >> 0 | var42 << 16) << 11) + 202 + 109);
        var13.setCharAt(var23, (char)((var79 | var45 << 11) + 202 + 109));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = -1044907185 >> -1044907185 ^ -31889; var29 < var16.length(); var29 += (-1039805178 >> -348459455 | 0) & 81531989) {
        int var51 = (var16.charAt(var29) + 127 ^ 91 ^ 168) + 206 - 123 - 169;
        char var52 = (char)(((var51 & 65528) >> 3 | var51 << 13) - 158 + 186 - 102);
        var16.setCharAt(var29, (char)(((var51 & 65528) >> 3 | var51 << 13) - 158 + 186 - 102));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), jf.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (1305786884 >> (196486181 ^ 1305786884 >>> 196486181) | 0) & 1887254928;
        var35 < var19.length();
        var35 += 1228164878 + -1953864382 ^ -725699503
      ) {
        int var57 = (var19.charAt(var35) ^ 'J') - 10 ^ 7;
        char var60 = (char)(
          (
                ((((var57 & 65472) >> 6 | var57 << 10) + 63 + 151 - 182 - 10 & 49152) >> 14 | ((var57 & 65472) >> 6 | var57 << 10) + 63 + 151 - 182 - 10 << 2)
                  & 65532
              )
              >> 2
            | ((((var57 & 65472) >> 6 | var57 << 10) + 63 + 151 - 182 - 10 & 49152) >> 14 | ((var57 & 65472) >> 6 | var57 << 10) + 63 + 151 - 182 - 10 << 2)
              << 14
        );
        var19.setCharAt(
          var35,
          (char)(
            (
                  ((((var57 & 65472) >> 6 | var57 << 10) + 63 + 151 - 182 - 10 & 49152) >> 14 | ((var57 & 65472) >> 6 | var57 << 10) + 63 + 151 - 182 - 10 << 2)
                    & 65532
                )
                >> 2
              | ((((var57 & 65472) >> 6 | var57 << 10) + 63 + 151 - 182 - 10 & 49152) >> 14 | ((var57 & 65472) >> 6 | var57 << 10) + 63 + 151 - 182 - 10 << 2)
                << 14
          )
        );
      }

      Class var7 = Class.forName(var19.toString(), false, jf.class.getClassLoader());
      switch (((var4 ^ 1300070310 ^ 490135572) + 1993227385 ^ 2146432517) - 958750206 + 2136863348 + 1321362090 - 202610200 + 545283288 + 1073226548) {
        case 46652411:
        case 968964145:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 734503945:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 902769055:
          var10000 = var0.findSpecial(var7, var5, var6, jf.class);
          break;
        case 1214736797:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    deu[(((var10 ^ 1296810394 ^ 1941066878) - 106917793 + 1401696373 + 1146121321 - 1290871333 ^ 2010514478) - 1832002313 ^ 1080262738) + 1794766171] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 - 1309472382 ^ 49213103) + 1355071591 ^ 789564560) + 196831599 + 535023998 + 1707189998 - 747391062 + 568947447;
    MethodHandle var10000 = deu[((var10 - 1309472382 ^ 49213103) + 1355071591 ^ 789564560)
      + 196831599
      + 535023998
      + 1707189998
      - 747391062
      + 568947447
      - 556185669];
    if (deu[var10001 - 556185669] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (1119853992 + -1514143131 | 0) & 33576754; var24 < var14.length(); var24 += (-235985933 | -235985933 | 1) & 202396673) {
        int var43 = (var14.charAt(var24) - 139 ^ 75) - 28 - 115;
        int var10004 = (var43 & 65504) >> 5;
        int var44 = (var43 & 65504) >> 5 | var43 << 11;
        int var80 = (((var43 & 65504) >> 5 | var43 << 11) & 49152) >> 14;
        char var45 = (char)(((((var10004 | var43 << 11) & 49152) >> 14 | ((var43 & 65504) >> 5 | var43 << 11) << 2) + 143 ^ 173) - 51 ^ 211);
        var14.setCharAt(var24, (char)(((var80 | var44 << 2) + 143 ^ 173) - 51 ^ 211));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (-2056828227 & 1941187690 >> 250090765 | 0) & 1858658894;
        var30 < var17.length();
        var30 += (-310943702 * (-1925985993 + 1670088600) | 1) & -2045503991
      ) {
        int var50 = var17.charAt(var30) - 28;
        int var81 = (var50 & 65024) >> 9;
        int var51 = ((var50 & 65024) >> 9 | var50 << 7) - 205 - 84 + 90 + 23 + 104 - 138 + 213;
        int var82 = (((var50 & 65024) >> 9 | var50 << 7) - 205 - 84 + 90 + 23 + 104 - 138 + 213 & 0) >> 16;
        char var52 = (char)(
          ((var81 | var50 << 7) - 205 - 84 + 90 + 23 + 104 - 138 + 213 & 0) >> 16
            | ((var50 & 65024) >> 9 | var50 << 7) - 205 - 84 + 90 + 23 + 104 - 138 + 213 << 0
        );
        var17.setCharAt(var30, (char)(var82 | var51 << 0));
      }

      Class var6 = Class.forName(var17.toString(), false, jf.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = -2037972346 << -2037972346 ^ -1581211264; var36 < var20.length(); var36 += (-1071260344 >>> -2090814678 | 1) & 503510025) {
        char var57 = var20.charAt(var36);
        char var62 = (char)(
          (
                (
                      (
                            (
                                (
                                      ((((((var57 & '쀀') >> 14 | var57 << 2) & 63488) >> 11 | ((var57 & '쀀') >> 14 | var57 << 2) << 5) ^ 10) - 186 ^ 37) - 169
                                        & 65472
                                    )
                                    >> 6
                                  | ((((((var57 & '쀀') >> 14 | var57 << 2) & 63488) >> 11 | ((var57 & '쀀') >> 14 | var57 << 2) << 5) ^ 10) - 186 ^ 37) - 169
                                    << 10
                              )
                              & 65408
                          )
                          >> 7
                        | (
                            (((((((var57 & '쀀') >> 14 | var57 << 2) & 63488) >> 11 | ((var57 & '쀀') >> 14 | var57 << 2) << 5) ^ 10) - 186 ^ 37) - 169 & 65472)
                                >> 6
                              | ((((((var57 & '쀀') >> 14 | var57 << 2) & 63488) >> 11 | ((var57 & '쀀') >> 14 | var57 << 2) << 5) ^ 10) - 186 ^ 37) - 169 << 10
                          )
                          << 9
                    )
                    - 233
                  & 64512
              )
              >> 10
            | (
                  (
                        (
                            (((((((var57 & '쀀') >> 14 | var57 << 2) & 63488) >> 11 | ((var57 & '쀀') >> 14 | var57 << 2) << 5) ^ 10) - 186 ^ 37) - 169 & 65472)
                                >> 6
                              | ((((((var57 & '쀀') >> 14 | var57 << 2) & 63488) >> 11 | ((var57 & '쀀') >> 14 | var57 << 2) << 5) ^ 10) - 186 ^ 37) - 169 << 10
                          )
                          & 65408
                      )
                      >> 7
                    | (
                        (((((((var57 & '쀀') >> 14 | var57 << 2) & 63488) >> 11 | ((var57 & '쀀') >> 14 | var57 << 2) << 5) ^ 10) - 186 ^ 37) - 169 & 65472) >> 6
                          | ((((((var57 & '쀀') >> 14 | var57 << 2) & 63488) >> 11 | ((var57 & '쀀') >> 14 | var57 << 2) << 5) ^ 10) - 186 ^ 37) - 169 << 10
                      )
                      << 9
                )
                - 233
              << 6
        );
        var20.setCharAt(
          var36,
          (char)(
            (
                  (
                        (
                              (
                                  (
                                        ((((((var57 & '쀀') >> 14 | var57 << 2) & 63488) >> 11 | ((var57 & '쀀') >> 14 | var57 << 2) << 5) ^ 10) - 186 ^ 37)
                                            - 169
                                          & 65472
                                      )
                                      >> 6
                                    | ((((((var57 & '쀀') >> 14 | var57 << 2) & 63488) >> 11 | ((var57 & '쀀') >> 14 | var57 << 2) << 5) ^ 10) - 186 ^ 37) - 169
                                      << 10
                                )
                                & 65408
                            )
                            >> 7
                          | (
                              (((((((var57 & '쀀') >> 14 | var57 << 2) & 63488) >> 11 | ((var57 & '쀀') >> 14 | var57 << 2) << 5) ^ 10) - 186 ^ 37) - 169 & 65472)
                                  >> 6
                                | ((((((var57 & '쀀') >> 14 | var57 << 2) & 63488) >> 11 | ((var57 & '쀀') >> 14 | var57 << 2) << 5) ^ 10) - 186 ^ 37) - 169
                                  << 10
                            )
                            << 9
                      )
                      - 233
                    & 64512
                )
                >> 10
              | (
                    (
                          (
                              (((((((var57 & '쀀') >> 14 | var57 << 2) & 63488) >> 11 | ((var57 & '쀀') >> 14 | var57 << 2) << 5) ^ 10) - 186 ^ 37) - 169 & 65472)
                                  >> 6
                                | ((((((var57 & '쀀') >> 14 | var57 << 2) & 63488) >> 11 | ((var57 & '쀀') >> 14 | var57 << 2) << 5) ^ 10) - 186 ^ 37) - 169
                                  << 10
                            )
                            & 65408
                        )
                        >> 7
                      | (
                          (((((((var57 & '쀀') >> 14 | var57 << 2) & 63488) >> 11 | ((var57 & '쀀') >> 14 | var57 << 2) << 5) ^ 10) - 186 ^ 37) - 169 & 65472)
                              >> 6
                            | ((((((var57 & '쀀') >> 14 | var57 << 2) & 63488) >> 11 | ((var57 & '쀀') >> 14 | var57 << 2) << 5) ^ 10) - 186 ^ 37) - 169 << 10
                        )
                        << 9
                  )
                  - 233
                << 6
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), jf.class.getClassLoader()).returnType();
      switch (((var4 + 1168439338 ^ 2063591942) - 735817253 - 912442058 + 1935585671 - 309908042 ^ 762932776) + 1746800813 + 742108080 ^ 1645067817) {
        case 192130088:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 588013423:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 680619265:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 832883401:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      deu[((var10 - 1309472382 ^ 49213103) + 1355071591 ^ 789564560) + 196831599 + 535023998 + 1707189998 - 747391062 + 568947447 - 556185669] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
