// Status: PARTIAL - JNT native encryption (strings in jnt.so)


// === KRYPTON PLUS - DEOBFUSCATED ===
// Class: kcp
// Identity: BlockChecker (packet block validation)
// Obfuscation: JNT (jnt.so) native obfuscator
// Note: String literals and some method bodies are encrypted in native .so

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.World;
import net.minecraft.BlockState;
import net.minecraft.class_2791;
import net.minecraft.class_2826;
import net.minecraft.MinecraftClient;

public class kcp {
  public class_1937 kc = null /* jnt:encrypted */null /* jnt:encrypted */
  );
  public class_2791 s;
  // [JNT] MethodHandle dispatch table (removed)
  public class_2680 jfb(int var1, int var2, int var3) {
    int var8 = -1531616676;
    if (/* jnt */, var2
    )) {
      return /* jnt */
      );
    } else {
      int var4 = var1 >> 4;
      int var5 = var3 >> 4;
      class_2791 var6;
      if (null /* jnt:encrypted */ != null
        && null /* jnt:encrypted */
          )
          == var4
        && null /* jnt:encrypted */
          )
          == var5) {
        var6 = null /* jnt:encrypted */;
      } else {
        var6 = /* jnt */,
          var4,
          var5,
          null /* jnt:encrypted */,
          false
        );
      }

      var8 = -1577394888 * -1040107635 ^ -2003211588;

      while (true) {
        switch ((var8 - 1787490563 + 1779582539 ^ 126212125 ^ 255993231 ^ 2130355326) - 1213502912) {
          case 892628235:
            class_2826 var7 = /* jnt */[/* jnt */];
            if (var7 == null) {
              return /* jnt */
              );
            } else {
              null /* jnt:encrypted */;
              return /* jnt */;
            }
          case 1316076928:
          default:
            if (var6 == null) {
              return /* jnt */
              );
            }

            var8 = -619799320 >> -1209306281 ^ -204277143;
        }
      }
    }
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 - 439588237 - 1389956642 - 1683139511 + 156238092 - 1485877097 ^ 1060540276) + 578195491 ^ 648229561) - 1261200566;
    MethodHandle var10000 = gwa[((var10 - 439588237 - 1389956642 - 1683139511 + 156238092 - 1485877097 ^ 1060540276) + 578195491 ^ 648229561)
      - 1261200566
      - 1350787808];
    if (gwa[var10001 - 1350787808] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (-1860514234 & 573582539 | 0) & -838606675; var23 < var13.length(); var23 += -84846359 >> -110592482 * 369313259 ^ -82857) {
        int var42 = var13.charAt(var23) + 127 - 49 - 83;
        int var10004 = (var42 & 65532) >> 2;
        int var43 = (var42 & 65532) >> 2 | var42 << 14;
        int var87 = (((var42 & 65532) >> 2 | var42 << 14) & 49152) >> 14;
        var42 = (((var10004 | var42 << 14) & 49152) >> 14 | ((var42 & 65532) >> 2 | var42 << 14) << 2) ^ 87;
        var10004 = (((var87 | var43 << 2) ^ 87) & 65535) >> 0;
        int var45 = ((((var87 | var43 << 2) ^ 87) & 65535) >> 0 | var42 << 16) + 14 + 69;
        int var89 = (((((var87 | var43 << 2) ^ 87) & 65535) >> 0 | var42 << 16) + 14 + 69 & 63488) >> 11;
        char var46 = (char)(((var10004 | var42 << 16) + 14 + 69 & 63488) >> 11 | ((((var87 | var43 << 2) ^ 87) & 65535) >> 0 | var42 << 16) + 14 + 69 << 5);
        var13.setCharAt(var23, (char)(var89 | var45 << 5));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (1514271235 & 1514271235 | 0) & 630980976; var29 < var16.length(); var29 += (1966967514 - 630731500 | 1) & -1336369151) {
        char var51 = var16.charAt(var29);
        char var56 = (char)(
          (
                (
                    (
                          (
                                (
                                    (((((var51 & '\uf800') >> 11 | var51 << 5) & 65472) >> 6 | ((var51 & '\uf800') >> 11 | var51 << 5) << 10) + 177 & 65024)
                                        >> 9
                                      | ((((var51 & '\uf800') >> 11 | var51 << 5) & 65472) >> 6 | ((var51 & '\uf800') >> 11 | var51 << 5) << 10) + 177 << 7
                                  )
                                  & 65535
                              )
                              >> 0
                            | (
                                (((((var51 & '\uf800') >> 11 | var51 << 5) & 65472) >> 6 | ((var51 & '\uf800') >> 11 | var51 << 5) << 10) + 177 & 65024) >> 9
                                  | ((((var51 & '\uf800') >> 11 | var51 << 5) & 65472) >> 6 | ((var51 & '\uf800') >> 11 | var51 << 5) << 10) + 177 << 7
                              )
                              << 16
                        )
                        + 154
                        - 171
                      ^ 180
                      ^ 42
                  )
                  & 65024
              )
              >> 9
            | (
                (
                      (
                            (
                                (((((var51 & '\uf800') >> 11 | var51 << 5) & 65472) >> 6 | ((var51 & '\uf800') >> 11 | var51 << 5) << 10) + 177 & 65024) >> 9
                                  | ((((var51 & '\uf800') >> 11 | var51 << 5) & 65472) >> 6 | ((var51 & '\uf800') >> 11 | var51 << 5) << 10) + 177 << 7
                              )
                              & 65535
                          )
                          >> 0
                        | (
                            (((((var51 & '\uf800') >> 11 | var51 << 5) & 65472) >> 6 | ((var51 & '\uf800') >> 11 | var51 << 5) << 10) + 177 & 65024) >> 9
                              | ((((var51 & '\uf800') >> 11 | var51 << 5) & 65472) >> 6 | ((var51 & '\uf800') >> 11 | var51 << 5) << 10) + 177 << 7
                          )
                          << 16
                    )
                    + 154
                    - 171
                  ^ 180
                  ^ 42
              )
              << 7
        );
        var16.setCharAt(
          var29,
          (char)(
            (
                  (
                      (
                            (
                                  (
                                      (((((var51 & '\uf800') >> 11 | var51 << 5) & 65472) >> 6 | ((var51 & '\uf800') >> 11 | var51 << 5) << 10) + 177 & 65024)
                                          >> 9
                                        | ((((var51 & '\uf800') >> 11 | var51 << 5) & 65472) >> 6 | ((var51 & '\uf800') >> 11 | var51 << 5) << 10) + 177 << 7
                                    )
                                    & 65535
                                )
                                >> 0
                              | (
                                  (((((var51 & '\uf800') >> 11 | var51 << 5) & 65472) >> 6 | ((var51 & '\uf800') >> 11 | var51 << 5) << 10) + 177 & 65024) >> 9
                                    | ((((var51 & '\uf800') >> 11 | var51 << 5) & 65472) >> 6 | ((var51 & '\uf800') >> 11 | var51 << 5) << 10) + 177 << 7
                                )
                                << 16
                          )
                          + 154
                          - 171
                        ^ 180
                        ^ 42
                    )
                    & 65024
                )
                >> 9
              | (
                  (
                        (
                              (
                                  (((((var51 & '\uf800') >> 11 | var51 << 5) & 65472) >> 6 | ((var51 & '\uf800') >> 11 | var51 << 5) << 10) + 177 & 65024) >> 9
                                    | ((((var51 & '\uf800') >> 11 | var51 << 5) & 65472) >> 6 | ((var51 & '\uf800') >> 11 | var51 << 5) << 10) + 177 << 7
                                )
                                & 65535
                            )
                            >> 0
                          | (
                              (((((var51 & '\uf800') >> 11 | var51 << 5) & 65472) >> 6 | ((var51 & '\uf800') >> 11 | var51 << 5) << 10) + 177 & 65024) >> 9
                                | ((((var51 & '\uf800') >> 11 | var51 << 5) & 65472) >> 6 | ((var51 & '\uf800') >> 11 | var51 << 5) << 10) + 177 << 7
                            )
                            << 16
                      )
                      + 154
                      - 171
                    ^ 180
                    ^ 42
                )
                << 7
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), kcp.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (-902413585 ^ (607509731 | 1428246450) | 0) & 11272800; var35 < var19.length(); var35 += -1459863922 >>> 928987613 ^ 4) {
        int var61 = var19.charAt(var35);
        int var95 = (var61 & 65528) >> 3;
        int var62 = ((var61 & 65528) >> 3 | var61 << 13) + 183 - 98;
        int var96 = (((var61 & 65528) >> 3 | var61 << 13) + 183 - 98 & 65535) >> 0;
        var61 = (((var95 | var61 << 13) + 183 - 98 & 65535) >> 0 | ((var61 & 65528) >> 3 | var61 << 13) + 183 - 98 << 16) - 115 - 9;
        var95 = ((var96 | var62 << 16) - 115 - 9 & 65520) >> 4;
        int var64 = ((var96 | var62 << 16) - 115 - 9 & 65520) >> 4 | var61 << 12;
        int var98 = ((((var96 | var62 << 16) - 115 - 9 & 65520) >> 4 | var61 << 12) & 32768) >> 15;
        char var65 = (char)((((var95 | var61 << 12) & 32768) >> 15 | (((var96 | var62 << 16) - 115 - 9 & 65520) >> 4 | var61 << 12) << 1) ^ 159 ^ 89);
        var19.setCharAt(var35, (char)((var98 | var64 << 1) ^ 159 ^ 89));
      }

      Class var7 = Class.forName(var19.toString(), false, kcp.class.getClassLoader());
      switch (((var4 + 1697293895 - 253547356 ^ 1209170588) + 1201216047 ^ 1624950068) + 707940597 + 1791497509 - 1686209615 + 1099803553 + 383392975) {
        case 469682922:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 924782957:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 1163389493:
        case 1490811265:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1304339727:
          var10000 = var0.findSpecial(var7, var5, var6, kcp.class);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    gwa[((var10 - 439588237 - 1389956642 - 1683139511 + 156238092 - 1485877097 ^ 1060540276) + 578195491 ^ 648229561) - 1261200566 - 1350787808] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 + 174519084 ^ 51441983 ^ 733402158) + 1608598087 + 1566050532 + 1176241676 ^ 567423072 ^ 937385916) + 1175039495;
    MethodHandle var10000 = gwa[((var10 + 174519084 ^ 51441983 ^ 733402158) + 1608598087 + 1566050532 + 1176241676 ^ 567423072 ^ 937385916)
      + 1175039495
      + 1147388834];
    if (gwa[var10001 + 1147388834] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (-1201718810 * 394961001 | 0) & 671416480; var24 < var14.length(); var24 += 466739900 + -1479406342 ^ -1012666441) {
        int var43 = var14.charAt(var24);
        int var10004 = (var43 & 65024) >> 9;
        int var44 = (var43 & 65024) >> 9 | var43 << 7;
        int var86 = (((var43 & 65024) >> 9 | var43 << 7) & 0) >> 16;
        var43 = ((var10004 | var43 << 7) & 0) >> 16 | ((var43 & 65024) >> 9 | var43 << 7) << 0;
        var10004 = ((var86 | var44 << 0) & 65535) >> 0;
        int var46 = (((var86 | var44 << 0) & 65535) >> 0 | var43 << 16) + 144;
        int var88 = ((((var86 | var44 << 0) & 65535) >> 0 | var43 << 16) + 144 & 65528) >> 3;
        var43 = ((var10004 | var43 << 16) + 144 & 65528) >> 3 | (((var86 | var44 << 0) & 65535) >> 0 | var43 << 16) + 144 << 13;
        var10004 = ((var88 | var46 << 13) & 65520) >> 4;
        int var48 = ((var88 | var46 << 13) & 65520) >> 4 | var43 << 12;
        int var90 = ((((var88 | var46 << 13) & 65520) >> 4 | var43 << 12) & 57344) >> 13;
        char var49 = (char)((((var10004 | var43 << 12) & 57344) >> 13 | (((var88 | var46 << 13) & 65520) >> 4 | var43 << 12) << 3) - 213 - 228 ^ 19);
        var14.setCharAt(var24, (char)((var90 | var48 << 3) - 213 - 228 ^ 19));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (-1901577120 >> -892765676 | 0) & 769; var30 < var17.length(); var30 += (-1501331736 << 580756099 | 1) & -1981808625) {
        int var54 = var17.charAt(var30) ^ 240;
        int var91 = (var54 & 57344) >> 13;
        int var55 = (var54 & 57344) >> 13 | var54 << 3;
        int var92 = (((var54 & 57344) >> 13 | var54 << 3) & 65532) >> 2;
        char var56 = (char)(((((var91 | var54 << 3) & 65532) >> 2 | ((var54 & 57344) >> 13 | var54 << 3) << 14) + 102 + 87 ^ 87 ^ 30) - 169 - 143 - 208);
        var17.setCharAt(var30, (char)(((var92 | var55 << 14) + 102 + 87 ^ 87 ^ 30) - 169 - 143 - 208));
      }

      Class var6 = Class.forName(var17.toString(), false, kcp.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (185421398 & -1246198191 | 0) & 1476446344; var36 < var20.length(); var36 += (1508036568 << -905056071 | 1) & 185551775) {
        int var61 = var20.charAt(var36) + 218;
        int var93 = (var61 & 65535) >> 0;
        int var62 = ((var61 & 65535) >> 0 | var61 << 16) ^ 175;
        int var94 = ((((var61 & 65535) >> 0 | var61 << 16) ^ 175) & 57344) >> 13;
        var61 = (((((var93 | var61 << 16) ^ 175) & 57344) >> 13 | (((var61 & 65535) >> 0 | var61 << 16) ^ 175) << 3) ^ 50) + 254;
        var93 = (((var94 | var62 << 3) ^ 50) + 254 & 32768) >> 15;
        int var64 = ((((var94 | var62 << 3) ^ 50) + 254 & 32768) >> 15 | var61 << 1) + 67 - 78;
        int var96 = (((((var94 | var62 << 3) ^ 50) + 254 & 32768) >> 15 | var61 << 1) + 67 - 78 & 65534) >> 1;
        char var65 = (char)(((var93 | var61 << 1) + 67 - 78 & 65534) >> 1 | ((((var94 | var62 << 3) ^ 50) + 254 & 32768) >> 15 | var61 << 1) + 67 - 78 << 15);
        var20.setCharAt(var36, (char)(var96 | var64 << 15));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), kcp.class.getClassLoader()).returnType();
      switch (((var4 ^ 1868627531 ^ 531118353) - 1990974538 + 555836836 ^ 1094786379 ^ 173151201 ^ 154011322) - 399095416 + 1426587718 ^ 1939271910) {
        case 90998245:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 623875329:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1342463317:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1959628787:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      gwa[((var10 + 174519084 ^ 51441983 ^ 733402158) + 1608598087 + 1566050532 + 1176241676 ^ 567423072 ^ 937385916) + 1175039495 + 1147388834] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
