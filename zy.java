// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

// $VF: synthetic class
public class zy {
  // [JNT] MethodHandle dispatch table (removed)
  // $VF: Handled exception range with multiple entry points by splitting it
  // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
  static {
    int var1 = 1872908145;

    label27: {
      try {
        var1 = -586233784 * 138887102 ^ 724114602;
      } catch (NoSuchFieldError var3) {
        boolean var10001 = false;
        break label27;
      }

      label24:
      while (true) {
        switch ((var1 - 210305171 - 1215727398 ^ 31871455) + 280350504 + 418636751 ^ 1431820797) {
          case -725072120:
          default:
            try {
              null /* jnt:encrypted */[/* jnt */
              )] = 1;
            } catch (NoSuchFieldError var2) {
              boolean var5 = false;
              break label24;
            }

            var1 = (-466675718 >>> -1400063186 | 1076654785) & -940670985;
            break;
          case 1092989991:
            break label24;
        }
      }
    }
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 - 696442955 ^ 1180054792 ^ 798865835 ^ 1706515443) + 1514902343 ^ 2100674731 ^ 428931666) - 1765864953 ^ 503808887;
    MethodHandle var10000 = gdk[(((var10 - 696442955 ^ 1180054792 ^ 798865835 ^ 1706515443) + 1514902343 ^ 2100674731 ^ 428931666) - 1765864953 ^ 503808887)
      - 1462387737];
    if (gdk[var10001 - 1462387737] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = 451444959 << 161800467 ^ 116916224; var23 < var13.length(); var23 += (1371067771 | 1423918225 | 1) & 167780869) {
        int var42 = var13.charAt(var23);
        int var10004 = (var42 & 65532) >> 2;
        int var43 = (var42 & 65532) >> 2 | var42 << 14;
        int var85 = (((var42 & 65532) >> 2 | var42 << 14) & 65532) >> 2;
        var42 = ((((var10004 | var42 << 14) & 65532) >> 2 | ((var42 & 65532) >> 2 | var42 << 14) << 14) ^ 57 ^ 105 ^ 230 ^ 117 ^ 76) - 173;
        var10004 = (((var85 | var43 << 14) ^ 57 ^ 105 ^ 230 ^ 117 ^ 76) - 173 & 65535) >> 0;
        int var45 = (((var85 | var43 << 14) ^ 57 ^ 105 ^ 230 ^ 117 ^ 76) - 173 & 65535) >> 0 | var42 << 16;
        int var87 = (((((var85 | var43 << 14) ^ 57 ^ 105 ^ 230 ^ 117 ^ 76) - 173 & 65535) >> 0 | var42 << 16) & 65024) >> 9;
        char var46 = (char)(
          ((var10004 | var42 << 16) & 65024) >> 9 | ((((var85 | var43 << 14) ^ 57 ^ 105 ^ 230 ^ 117 ^ 76) - 173 & 65535) >> 0 | var42 << 16) << 7
        );
        var13.setCharAt(var23, (char)(var87 | var45 << 7));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (407556927 ^ (1065676639 | -730195104) | 0) & 272827038; var29 < var16.length(); var29 += 967537926 << -725093317 ^ 805306369) {
        int var51 = var16.charAt(var29);
        int var88 = (var51 & 65408) >> 7;
        int var52 = (var51 & 65408) >> 7 | var51 << 9;
        int var89 = (((var51 & 65408) >> 7 | var51 << 9) & 32768) >> 15;
        var51 = (((var88 | var51 << 9) & 32768) >> 15 | ((var51 & 65408) >> 7 | var51 << 9) << 1) + 57 - 215;
        var88 = ((var89 | var52 << 1) + 57 - 215 & 65535) >> 0;
        int var54 = ((((var89 | var52 << 1) + 57 - 215 & 65535) >> 0 | var51 << 16) ^ 184 ^ 143) - 120;
        int var91 = (((((var89 | var52 << 1) + 57 - 215 & 65535) >> 0 | var51 << 16) ^ 184 ^ 143) - 120 & 64512) >> 10;
        char var55 = (char)(
          ((((var88 | var51 << 16) ^ 184 ^ 143) - 120 & 64512) >> 10 | ((((var89 | var52 << 1) + 57 - 215 & 65535) >> 0 | var51 << 16) ^ 184 ^ 143) - 120 << 6)
            ^ 100
        );
        var16.setCharAt(var29, (char)((var91 | var54 << 6) ^ 100));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), zy.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (-1912453274 >> (-1639814845 | 568066951) | 0) & 2247025; var35 < var19.length(); var35 += -1431855029 * 2106846345 ^ -2054493150) {
        int var60 = var19.charAt(var35) ^ 22;
        int var92 = (var60 & 61440) >> 12;
        int var61 = (var60 & 61440) >> 12 | var60 << 4;
        int var93 = (((var60 & 61440) >> 12 | var60 << 4) & 65472) >> 6;
        var60 = ((var92 | var60 << 4) & 65472) >> 6 | ((var60 & 61440) >> 12 | var60 << 4) << 10;
        var92 = ((var93 | var61 << 10) & 65408) >> 7;
        int var63 = ((((var93 | var61 << 10) & 65408) >> 7 | var60 << 9) ^ 107 ^ 130) - 37 + 50;
        int var95 = (((((var93 | var61 << 10) & 65408) >> 7 | var60 << 9) ^ 107 ^ 130) - 37 + 50 & 65408) >> 7;
        char var64 = (char)(
          ((((var92 | var60 << 9) ^ 107 ^ 130) - 37 + 50 & 65408) >> 7 | ((((var93 | var61 << 10) & 65408) >> 7 | var60 << 9) ^ 107 ^ 130) - 37 + 50 << 9)
            + 239
        );
        var19.setCharAt(var35, (char)((var95 | var63 << 9) + 239));
      }

      Class var7 = Class.forName(var19.toString(), false, zy.class.getClassLoader());
      switch (((var4 ^ 367321676 ^ 1873490456 ^ 739015881) - 1002602884 - 340916880 - 35761537 ^ 561480676) + 2048798682 - 57377003 + 1315733097) {
        case 282491914:
        case 974072766:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 413132685:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 1183220562:
          var10000 = var0.findSpecial(var7, var5, var6, zy.class);
          break;
        case 1763930429:
          var10000 = var0.findConstructor(var7, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    gdk[(((var10 - 696442955 ^ 1180054792 ^ 798865835 ^ 1706515443) + 1514902343 ^ 2100674731 ^ 428931666) - 1765864953 ^ 503808887) - 1462387737] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (var10 + 1904131320 + 93422183 + 104909866 + 330942954 + 1222729582 - 1771356568 - 1646907499 ^ 1344678224) - 525489313;
    MethodHandle var10000 = gdk[(var10 + 1904131320 + 93422183 + 104909866 + 330942954 + 1222729582 - 1771356568 - 1646907499 ^ 1344678224) - 525489313
      ^ 1617679899];
    if (gdk[var10001 ^ 1617679899] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (2127507948 ^ 88585061 | 0) & 67590400; var24 < var14.length(); var24 += 238426617 ^ 15610793 * 1980692201 ^ 2040099625) {
        int var43 = (var14.charAt(var24) ^ 205) - 35;
        char var48 = (char)(
          (
              (
                    (
                          (
                                (
                                    (((((var43 & 65534) >> 1 | var43 << 15) & 65472) >> 6 | ((var43 & 65534) >> 1 | var43 << 15) << 10) & 64512) >> 10
                                      | ((((var43 & 65534) >> 1 | var43 << 15) & 65472) >> 6 | ((var43 & 65534) >> 1 | var43 << 15) << 10) << 6
                                  )
                                  & 0
                              )
                              >> 16
                            | (
                                (((((var43 & 65534) >> 1 | var43 << 15) & 65472) >> 6 | ((var43 & 65534) >> 1 | var43 << 15) << 10) & 64512) >> 10
                                  | ((((var43 & 65534) >> 1 | var43 << 15) & 65472) >> 6 | ((var43 & 65534) >> 1 | var43 << 15) << 10) << 6
                              )
                              << 0
                        )
                        + 165
                      & 65534
                  )
                  >> 1
                | (
                      (
                            (
                                (((((var43 & 65534) >> 1 | var43 << 15) & 65472) >> 6 | ((var43 & 65534) >> 1 | var43 << 15) << 10) & 64512) >> 10
                                  | ((((var43 & 65534) >> 1 | var43 << 15) & 65472) >> 6 | ((var43 & 65534) >> 1 | var43 << 15) << 10) << 6
                              )
                              & 0
                          )
                          >> 16
                        | (
                            (((((var43 & 65534) >> 1 | var43 << 15) & 65472) >> 6 | ((var43 & 65534) >> 1 | var43 << 15) << 10) & 64512) >> 10
                              | ((((var43 & 65534) >> 1 | var43 << 15) & 65472) >> 6 | ((var43 & 65534) >> 1 | var43 << 15) << 10) << 6
                          )
                          << 0
                    )
                    + 165
                  << 15
            )
            ^ 182
            ^ 177
        );
        var14.setCharAt(
          var24,
          (char)(
            (
                (
                      (
                            (
                                  (
                                      (((((var43 & 65534) >> 1 | var43 << 15) & 65472) >> 6 | ((var43 & 65534) >> 1 | var43 << 15) << 10) & 64512) >> 10
                                        | ((((var43 & 65534) >> 1 | var43 << 15) & 65472) >> 6 | ((var43 & 65534) >> 1 | var43 << 15) << 10) << 6
                                    )
                                    & 0
                                )
                                >> 16
                              | (
                                  (((((var43 & 65534) >> 1 | var43 << 15) & 65472) >> 6 | ((var43 & 65534) >> 1 | var43 << 15) << 10) & 64512) >> 10
                                    | ((((var43 & 65534) >> 1 | var43 << 15) & 65472) >> 6 | ((var43 & 65534) >> 1 | var43 << 15) << 10) << 6
                                )
                                << 0
                          )
                          + 165
                        & 65534
                    )
                    >> 1
                  | (
                        (
                              (
                                  (((((var43 & 65534) >> 1 | var43 << 15) & 65472) >> 6 | ((var43 & 65534) >> 1 | var43 << 15) << 10) & 64512) >> 10
                                    | ((((var43 & 65534) >> 1 | var43 << 15) & 65472) >> 6 | ((var43 & 65534) >> 1 | var43 << 15) << 10) << 6
                                )
                                & 0
                            )
                            >> 16
                          | (
                              (((((var43 & 65534) >> 1 | var43 << 15) & 65472) >> 6 | ((var43 & 65534) >> 1 | var43 << 15) << 10) & 64512) >> 10
                                | ((((var43 & 65534) >> 1 | var43 << 15) & 65472) >> 6 | ((var43 & 65534) >> 1 | var43 << 15) << 10) << 6
                            )
                            << 0
                      )
                      + 165
                    << 15
              )
              ^ 182
              ^ 177
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (942336537 << 942336537 | 0) & 1160335408;
        var30 < var17.length();
        var30 += -1736792194 ^ -1736792194 + -1736792194 * -1736792194 ^ -766316803
      ) {
        int var53 = var17.charAt(var30) + 29;
        char var56 = (char)(
          (
              (
                    (((((var53 & 65534) >> 1 | var53 << 15) + 103 & 65534) >> 1 | ((var53 & 65534) >> 1 | var53 << 15) + 103 << 15) & 61440) >> 12
                      | ((((var53 & 65534) >> 1 | var53 << 15) + 103 & 65534) >> 1 | ((var53 & 65534) >> 1 | var53 << 15) + 103 << 15) << 4
                  )
                  + 143
                ^ 208
            )
            - 74
            + 130
            - 192
        );
        var17.setCharAt(
          var30,
          (char)(
            (
                (
                      (((((var53 & 65534) >> 1 | var53 << 15) + 103 & 65534) >> 1 | ((var53 & 65534) >> 1 | var53 << 15) + 103 << 15) & 61440) >> 12
                        | ((((var53 & 65534) >> 1 | var53 << 15) + 103 & 65534) >> 1 | ((var53 & 65534) >> 1 | var53 << 15) + 103 << 15) << 4
                    )
                    + 143
                  ^ 208
              )
              - 74
              + 130
              - 192
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, zy.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (1942164077 | 2107864152) ^ 2145613437; var36 < var20.length(); var36 += -263194869 * -930331896 ^ 573282649) {
        int var61 = var20.charAt(var36) + '(';
        int var93 = (var61 & 65024) >> 9;
        int var62 = ((var61 & 65024) >> 9 | var61 << 7) ^ 63 ^ 206;
        int var94 = ((((var61 & 65024) >> 9 | var61 << 7) ^ 63 ^ 206) & 64512) >> 10;
        var61 = (((((var93 | var61 << 7) ^ 63 ^ 206) & 64512) >> 10 | (((var61 & 65024) >> 9 | var61 << 7) ^ 63 ^ 206) << 6) ^ 84) - 225;
        var93 = (((var94 | var62 << 6) ^ 84) - 225 & 64512) >> 10;
        int var64 = ((((var94 | var62 << 6) ^ 84) - 225 & 64512) >> 10 | var61 << 6) - 151;
        int var96 = (((((var94 | var62 << 6) ^ 84) - 225 & 64512) >> 10 | var61 << 6) - 151 & 65024) >> 9;
        char var65 = (char)(((var93 | var61 << 6) - 151 & 65024) >> 9 | ((((var94 | var62 << 6) ^ 84) - 225 & 64512) >> 10 | var61 << 6) - 151 << 7);
        var20.setCharAt(var36, (char)(var96 | var64 << 7));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), zy.class.getClassLoader()).returnType();
      switch (((var4 - 326808489 ^ 1169430545) + 1951165435 + 865693147 + 374266447 + 771340420 - 1690188839 ^ 348373338 ^ 1753340544) - 237445985) {
        case 507823009:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 695958026:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1239000261:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 2003162883:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      gdk[(var10 + 1904131320 + 93422183 + 104909866 + 330942954 + 1222729582 - 1771356568 - 1646907499 ^ 1344678224) - 525489313 ^ 1617679899] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
