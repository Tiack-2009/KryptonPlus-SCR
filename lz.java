// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

public abstract class lz {
  public gz xim;
  // [JNT] MethodHandle dispatch table (removed)
  public lz(gz var1) {
    this.xim = var1;
  }

  public abstract InputStream cc();

  @Override
  public String toString() {
    return /* jnt */);
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 - 1382290549 ^ 2087903012) + 1631187850 - 1638197622 + 895517200 ^ 2071619956) + 1107881451 + 1893978778 - 791856193;
    MethodHandle var10000 = haq[((var10 - 1382290549 ^ 2087903012) + 1631187850 - 1638197622 + 895517200 ^ 2071619956)
      + 1107881451
      + 1893978778
      - 791856193
      - 218124910];
    if (haq[var10001 - 218124910] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = -2666968 * (-128255860 >>> -570793224) ^ -661408064; var23 < var13.length(); var23 += 1223225517 + -1546406349 ^ -323180831) {
        int var42 = var13.charAt(var23) + '<' - 162 - 181 - 13 - 55;
        char var45 = (char)(
          (((((((var42 & 64512) >> 10 | var42 << 6) ^ 81) & 57344) >> 13 | (((var42 & 64512) >> 10 | var42 << 6) ^ 81) << 3) ^ 223) & 65528) >> 3
            | ((((((var42 & 64512) >> 10 | var42 << 6) ^ 81) & 57344) >> 13 | (((var42 & 64512) >> 10 | var42 << 6) ^ 81) << 3) ^ 223) << 13
        );
        var13.setCharAt(
          var23,
          (char)(
            (((((((var42 & 64512) >> 10 | var42 << 6) ^ 81) & 57344) >> 13 | (((var42 & 64512) >> 10 | var42 << 6) ^ 81) << 3) ^ 223) & 65528) >> 3
              | ((((((var42 & 64512) >> 10 | var42 << 6) ^ 81) & 57344) >> 13 | (((var42 & 64512) >> 10 | var42 << 6) ^ 81) << 3) ^ 223) << 13
          )
        );
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = 1322569172 - -1929397229 ^ -1043000895; var29 < var16.length(); var29 += (1183741524 + 1923101829 | 1) & 1086346273) {
        int var50 = var16.charAt(var29);
        int var87 = (var50 & 65528) >> 3;
        int var51 = ((var50 & 65528) >> 3 | var50 << 13) + 153 + 0;
        int var88 = (((var50 & 65528) >> 3 | var50 << 13) + 153 + 0 & 57344) >> 13;
        var50 = (((var87 | var50 << 13) + 153 + 0 & 57344) >> 13 | ((var50 & 65528) >> 3 | var50 << 13) + 153 + 0 << 3) ^ 31;
        var87 = (((var88 | var51 << 3) ^ 31) & 65532) >> 2;
        int var53 = (((var88 | var51 << 3) ^ 31) & 65532) >> 2 | var50 << 14;
        int var90 = (((((var88 | var51 << 3) ^ 31) & 65532) >> 2 | var50 << 14) & 49152) >> 14;
        char var54 = (char)(((((var87 | var50 << 14) & 49152) >> 14 | ((((var88 | var51 << 3) ^ 31) & 65532) >> 2 | var50 << 14) << 2) ^ 27) - 152 ^ 109);
        var16.setCharAt(var29, (char)(((var90 | var53 << 2) ^ 27) - 152 ^ 109));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), lz.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = 2145529188 - -1910188606 ^ -239249502; var35 < var19.length(); var35 += 1103243742 & (429047075 ^ 1724670081) ^ 1094846851) {
        int var59 = (var19.charAt(var35) + 'T' ^ 77) + 157;
        char var64 = (char)(
          (
                (
                      (
                            (
                                (
                                    (((((var59 & 64512) >> 10 | var59 << 6) & 63488) >> 11 | ((var59 & 64512) >> 10 | var59 << 6) << 5) & 61440) >> 12
                                      | ((((var59 & 64512) >> 10 | var59 << 6) & 63488) >> 11 | ((var59 & 64512) >> 10 | var59 << 6) << 5) << 4
                                  )
                                  ^ 164
                              )
                              & 57344
                          )
                          >> 13
                        | (
                            (
                                (((((var59 & 64512) >> 10 | var59 << 6) & 63488) >> 11 | ((var59 & 64512) >> 10 | var59 << 6) << 5) & 61440) >> 12
                                  | ((((var59 & 64512) >> 10 | var59 << 6) & 63488) >> 11 | ((var59 & 64512) >> 10 | var59 << 6) << 5) << 4
                              )
                              ^ 164
                          )
                          << 3
                    )
                    + 119
                  & 49152
              )
              >> 14
            | (
                  (
                        (
                            (
                                (((((var59 & 64512) >> 10 | var59 << 6) & 63488) >> 11 | ((var59 & 64512) >> 10 | var59 << 6) << 5) & 61440) >> 12
                                  | ((((var59 & 64512) >> 10 | var59 << 6) & 63488) >> 11 | ((var59 & 64512) >> 10 | var59 << 6) << 5) << 4
                              )
                              ^ 164
                          )
                          & 57344
                      )
                      >> 13
                    | (
                        (
                            (((((var59 & 64512) >> 10 | var59 << 6) & 63488) >> 11 | ((var59 & 64512) >> 10 | var59 << 6) << 5) & 61440) >> 12
                              | ((((var59 & 64512) >> 10 | var59 << 6) & 63488) >> 11 | ((var59 & 64512) >> 10 | var59 << 6) << 5) << 4
                          )
                          ^ 164
                      )
                      << 3
                )
                + 119
              << 2
        );
        var19.setCharAt(
          var35,
          (char)(
            (
                  (
                        (
                              (
                                  (
                                      (((((var59 & 64512) >> 10 | var59 << 6) & 63488) >> 11 | ((var59 & 64512) >> 10 | var59 << 6) << 5) & 61440) >> 12
                                        | ((((var59 & 64512) >> 10 | var59 << 6) & 63488) >> 11 | ((var59 & 64512) >> 10 | var59 << 6) << 5) << 4
                                    )
                                    ^ 164
                                )
                                & 57344
                            )
                            >> 13
                          | (
                              (
                                  (((((var59 & 64512) >> 10 | var59 << 6) & 63488) >> 11 | ((var59 & 64512) >> 10 | var59 << 6) << 5) & 61440) >> 12
                                    | ((((var59 & 64512) >> 10 | var59 << 6) & 63488) >> 11 | ((var59 & 64512) >> 10 | var59 << 6) << 5) << 4
                                )
                                ^ 164
                            )
                            << 3
                      )
                      + 119
                    & 49152
                )
                >> 14
              | (
                    (
                          (
                              (
                                  (((((var59 & 64512) >> 10 | var59 << 6) & 63488) >> 11 | ((var59 & 64512) >> 10 | var59 << 6) << 5) & 61440) >> 12
                                    | ((((var59 & 64512) >> 10 | var59 << 6) & 63488) >> 11 | ((var59 & 64512) >> 10 | var59 << 6) << 5) << 4
                                )
                                ^ 164
                            )
                            & 57344
                        )
                        >> 13
                      | (
                          (
                              (((((var59 & 64512) >> 10 | var59 << 6) & 63488) >> 11 | ((var59 & 64512) >> 10 | var59 << 6) << 5) & 61440) >> 12
                                | ((((var59 & 64512) >> 10 | var59 << 6) & 63488) >> 11 | ((var59 & 64512) >> 10 | var59 << 6) << 5) << 4
                            )
                            ^ 164
                        )
                        << 3
                  )
                  + 119
                << 2
          )
        );
      }

      Class var7 = Class.forName(var19.toString(), false, lz.class.getClassLoader());
      switch (((var4 - 1793807670 ^ 916347286) - 838720642 + 1364613940 - 334017412 ^ 539428545 ^ 881042967 ^ 1754758381) - 2141989091 ^ 1029303255) {
        case 91321084:
        case 290291274:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 477788697:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 610031083:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 1439794370:
          var10000 = var0.findSpecial(var7, var5, var6, lz.class);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    haq[((var10 - 1382290549 ^ 2087903012) + 1631187850 - 1638197622 + 895517200 ^ 2071619956) + 1107881451 + 1893978778 - 791856193 - 218124910] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (var10 + 908135882 + 504694963 - 1422271824 ^ 194436931 ^ 1685207373) + 1545408466 + 871044943 + 464738132 - 591025096;
    MethodHandle var10000 = haq[(var10 + 908135882 + 504694963 - 1422271824 ^ 194436931 ^ 1685207373) + 1545408466 + 871044943 + 464738132 - 591025096
      ^ 720996753];
    if (haq[var10001 ^ 720996753] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = -540694893 >> 1338385350 ^ -8448358; var24 < var14.length(); var24 += (-1743335066 >> (-1117492435 | 1904195295) | 1) & 1) {
        int var43 = var14.charAt(var24);
        int var10004 = (var43 & 0) >> 16;
        int var44 = (var43 & 0) >> 16 | var43 << 0;
        int var76 = (((var43 & 0) >> 16 | var43 << 0) & 63488) >> 11;
        var43 = ((((var10004 | var43 << 0) & 63488) >> 11 | ((var43 & 0) >> 16 | var43 << 0) << 5) ^ 201) + 22;
        var10004 = (((var76 | var44 << 5) ^ 201) + 22 & 49152) >> 14;
        int var46 = (((var76 | var44 << 5) ^ 201) + 22 & 49152) >> 14 | var43 << 2;
        int var78 = (((((var76 | var44 << 5) ^ 201) + 22 & 49152) >> 14 | var43 << 2) & 65504) >> 5;
        char var47 = (char)(
          (((((var10004 | var43 << 2) & 65504) >> 5 | ((((var76 | var44 << 5) ^ 201) + 22 & 49152) >> 14 | var43 << 2) << 11) ^ 39) - 155 ^ 144) - 3
        );
        var14.setCharAt(var24, (char)((((var78 | var46 << 11) ^ 39) - 155 ^ 144) - 3));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (850212508 | -607129326 | 0) & 68159584; var30 < var17.length(); var30 += -1808983677 & 255427943 >> (-1808983677 | 255427943) ^ 790787) {
        int var52 = var17.charAt(var30) + '-' ^ 29;
        int var79 = (var52 & 65504) >> 5;
        int var53 = ((var52 & 65504) >> 5 | var52 << 11) + 97 - 181 + 154 + 131 - 9 + 176;
        int var80 = (((var52 & 65504) >> 5 | var52 << 11) + 97 - 181 + 154 + 131 - 9 + 176 & 63488) >> 11;
        char var54 = (char)(
          ((var79 | var52 << 11) + 97 - 181 + 154 + 131 - 9 + 176 & 63488) >> 11 | ((var52 & 65504) >> 5 | var52 << 11) + 97 - 181 + 154 + 131 - 9 + 176 << 5
        );
        var17.setCharAt(var30, (char)(var80 | var53 << 5));
      }

      Class var6 = Class.forName(var17.toString(), false, lz.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = 948652889 >>> 948652889 ^ 28; var36 < var20.length(); var36 += (-1862437917 | 386088769) ^ -1744863262) {
        int var59 = var20.charAt(var36) - 27;
        char var60 = (char)((((var59 & 65532) >> 2 | var59 << 14) + 244 ^ 118 ^ 252) - 202 - 40 + 171 + 100 - 244);
        var20.setCharAt(var36, (char)((((var59 & 65532) >> 2 | var59 << 14) + 244 ^ 118 ^ 252) - 202 - 40 + 171 + 100 - 244));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), lz.class.getClassLoader()).returnType();
      switch (((var4 + 1608771160 - 1593224662 + 1439720241 + 2118098838 - 635949978 ^ 1410071969) - 53947390 ^ 638217577) - 2102033339 + 1131682150) {
        case 711588920:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 767584350:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1734527099:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1879076023:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      haq[(var10 + 908135882 + 504694963 - 1422271824 ^ 194436931 ^ 1685207373) + 1545408466 + 871044943 + 464738132 - 591025096 ^ 720996753] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
