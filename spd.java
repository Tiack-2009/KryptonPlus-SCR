// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

public enum spd {
  sc,
  wb;
  // [JNT] MethodHandle dispatch table (removed)
  // $VF: Failed to inline enum fields
  // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
  static {
    int var10000 = -1633986674 + -1633986674 ^ 1026993948;

    StringBuilder var10001;
    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < ((-1671721893 | -1671721893) ^ -1671721902);
      var10000 += (2069190891 - -359655159 | 1) & 1075888145
    ) {
      /* jnt */((/* jnt */ ^ 25) - 108 - 30 - 104 - 81)
      );
    }

    sc = (spd)/* jnt */, 0
    );
    var10000 = 1548041748 >> 471995800 ^ 92;

    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < (1753271880 + 1753271880 ^ -788423530);
      var10000 += 1897341367 * 903536449 ^ 1981020278
    ) {
      /* jnt */(/* jnt */ - 147 + 185 ^ 7 ^ 6 ^ 113)
      );
    }

    wb = (spd)/* jnt */, 1
    );
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (((var10 ^ 146019417) + 1764069327 ^ 1802377947) + 961566221 ^ 666200275 ^ 784155990) - 1860113915 - 1031560263 - 2020729917;
    MethodHandle var10000 = dok[(((var10 ^ 146019417) + 1764069327 ^ 1802377947) + 961566221 ^ 666200275 ^ 784155990) - 1860113915 - 1031560263 - 2020729917
      ^ 1626699924];
    if (dok[var10001 ^ 1626699924] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (-147012480 * 500171961 | 0) & 537103706; var23 < var13.length(); var23 += -1111352155 + (1932260763 - 562151073) ^ 258757534) {
        int var42 = (var13.charAt(var23) ^ 'u') + 165 - 111 + 34;
        int var10004 = (var42 & 49152) >> 14;
        int var43 = (((var42 & 49152) >> 14 | var42 << 2) + 243 ^ 126) + 228 + 31;
        int var83 = ((((var42 & 49152) >> 14 | var42 << 2) + 243 ^ 126) + 228 + 31 & 65528) >> 3;
        char var44 = (char)(
          (((var10004 | var42 << 2) + 243 ^ 126) + 228 + 31 & 65528) >> 3 | (((var42 & 49152) >> 14 | var42 << 2) + 243 ^ 126) + 228 + 31 << 13
        );
        var13.setCharAt(var23, (char)(var83 | var43 << 13));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (668633756 | 668633756 >> -1202657780) ^ 668663740; var29 < var16.length(); var29 += -599274152 + -599274152 ^ -1198548303) {
        int var49 = var16.charAt(var29) - 226;
        char var54 = (char)(
          (
              (
                    (
                          (
                                (
                                    (
                                          ((((var49 & 65528) >> 3 | var49 << 13) - 146 & 61440) >> 12 | ((var49 & 65528) >> 3 | var49 << 13) - 146 << 4) + 30
                                            & 65534
                                        )
                                        >> 1
                                      | ((((var49 & 65528) >> 3 | var49 << 13) - 146 & 61440) >> 12 | ((var49 & 65528) >> 3 | var49 << 13) - 146 << 4) + 30
                                        << 15
                                  )
                                  & 49152
                              )
                              >> 14
                            | (
                                (((((var49 & 65528) >> 3 | var49 << 13) - 146 & 61440) >> 12 | ((var49 & 65528) >> 3 | var49 << 13) - 146 << 4) + 30 & 65534)
                                    >> 1
                                  | ((((var49 & 65528) >> 3 | var49 << 13) - 146 & 61440) >> 12 | ((var49 & 65528) >> 3 | var49 << 13) - 146 << 4) + 30 << 15
                              )
                              << 2
                        )
                        - 172
                      & 65408
                  )
                  >> 7
                | (
                      (
                            (
                                (((((var49 & 65528) >> 3 | var49 << 13) - 146 & 61440) >> 12 | ((var49 & 65528) >> 3 | var49 << 13) - 146 << 4) + 30 & 65534)
                                    >> 1
                                  | ((((var49 & 65528) >> 3 | var49 << 13) - 146 & 61440) >> 12 | ((var49 & 65528) >> 3 | var49 << 13) - 146 << 4) + 30 << 15
                              )
                              & 49152
                          )
                          >> 14
                        | (
                            (((((var49 & 65528) >> 3 | var49 << 13) - 146 & 61440) >> 12 | ((var49 & 65528) >> 3 | var49 << 13) - 146 << 4) + 30 & 65534) >> 1
                              | ((((var49 & 65528) >> 3 | var49 << 13) - 146 & 61440) >> 12 | ((var49 & 65528) >> 3 | var49 << 13) - 146 << 4) + 30 << 15
                          )
                          << 2
                    )
                    - 172
                  << 9
            )
            ^ 124
        );
        var16.setCharAt(
          var29,
          (char)(
            (
                (
                      (
                            (
                                  (
                                      (
                                            ((((var49 & 65528) >> 3 | var49 << 13) - 146 & 61440) >> 12 | ((var49 & 65528) >> 3 | var49 << 13) - 146 << 4) + 30
                                              & 65534
                                          )
                                          >> 1
                                        | ((((var49 & 65528) >> 3 | var49 << 13) - 146 & 61440) >> 12 | ((var49 & 65528) >> 3 | var49 << 13) - 146 << 4) + 30
                                          << 15
                                    )
                                    & 49152
                                )
                                >> 14
                              | (
                                  (((((var49 & 65528) >> 3 | var49 << 13) - 146 & 61440) >> 12 | ((var49 & 65528) >> 3 | var49 << 13) - 146 << 4) + 30 & 65534)
                                      >> 1
                                    | ((((var49 & 65528) >> 3 | var49 << 13) - 146 & 61440) >> 12 | ((var49 & 65528) >> 3 | var49 << 13) - 146 << 4) + 30 << 15
                                )
                                << 2
                          )
                          - 172
                        & 65408
                    )
                    >> 7
                  | (
                        (
                              (
                                  (((((var49 & 65528) >> 3 | var49 << 13) - 146 & 61440) >> 12 | ((var49 & 65528) >> 3 | var49 << 13) - 146 << 4) + 30 & 65534)
                                      >> 1
                                    | ((((var49 & 65528) >> 3 | var49 << 13) - 146 & 61440) >> 12 | ((var49 & 65528) >> 3 | var49 << 13) - 146 << 4) + 30 << 15
                                )
                                & 49152
                            )
                            >> 14
                          | (
                              (((((var49 & 65528) >> 3 | var49 << 13) - 146 & 61440) >> 12 | ((var49 & 65528) >> 3 | var49 << 13) - 146 << 4) + 30 & 65534)
                                  >> 1
                                | ((((var49 & 65528) >> 3 | var49 << 13) - 146 & 61440) >> 12 | ((var49 & 65528) >> 3 | var49 << 13) - 146 << 4) + 30 << 15
                            )
                            << 2
                      )
                      - 172
                    << 9
              )
              ^ 124
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), spd.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = 1946346424 ^ 1047628257 ^ 1249077849; var35 < var19.length(); var35 += -1082847649 + -752316279 ^ -1835163927) {
        int var59 = var19.charAt(var35) ^ 11;
        int var89 = (var59 & 65528) >> 3;
        int var60 = ((var59 & 65528) >> 3 | var59 << 13) + 98;
        int var90 = (((var59 & 65528) >> 3 | var59 << 13) + 98 & 65520) >> 4;
        var59 = (((var89 | var59 << 13) + 98 & 65520) >> 4 | ((var59 & 65528) >> 3 | var59 << 13) + 98 << 12) - 155 - 116 + 163;
        var89 = ((var90 | var60 << 12) - 155 - 116 + 163 & 64512) >> 10;
        int var62 = ((var90 | var60 << 12) - 155 - 116 + 163 & 64512) >> 10 | var59 << 6;
        int var92 = ((((var90 | var60 << 12) - 155 - 116 + 163 & 64512) >> 10 | var59 << 6) & 63488) >> 11;
        char var63 = (char)((((var89 | var59 << 6) & 63488) >> 11 | (((var90 | var60 << 12) - 155 - 116 + 163 & 64512) >> 10 | var59 << 6) << 5) - 176);
        var19.setCharAt(var35, (char)((var92 | var62 << 5) - 176));
      }

      Class var7 = Class.forName(var19.toString(), false, spd.class.getClassLoader());
      switch (((var4 ^ 1223226879) + 897071239 + 1116786621 ^ 935328393) + 2133178702 - 363109919 - 1853543259 - 1951617486 + 277534604 - 2114046783) {
        case 606918760:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 947773582:
        case 1119545481:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1588631234:
          var10000 = var0.findSpecial(var7, var5, var6, spd.class);
          break;
        case 1874740282:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    dok[(((var10 ^ 146019417) + 1764069327 ^ 1802377947) + 961566221 ^ 666200275 ^ 784155990) - 1860113915 - 1031560263 - 2020729917 ^ 1626699924] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = var10 + 833071920 + 601155224 - 285511098 - 1223516508 - 395116771 - 935895987 - 981292902 + 2100731816 ^ 1358917478;
    MethodHandle var10000 = dok[(var10 + 833071920 + 601155224 - 285511098 - 1223516508 - 395116771 - 935895987 - 981292902 + 2100731816 ^ 1358917478)
      - 758252076];
    if (dok[var10001 - 758252076] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (-805341597 - -805341597 | 0) & -1740187208; var24 < var14.length(); var24 += (-725090805 * -1138785629 | 1) & 172130401) {
        int var43 = var14.charAt(var24) + 'Q';
        char var46 = (char)(
          (
              (
                    (
                        ((((((var43 & 65504) >> 5 | var43 << 11) ^ 215) & 32768) >> 15 | (((var43 & 65504) >> 5 | var43 << 11) ^ 215) << 1) ^ 182) + 120 - 121
                          ^ 28
                      )
                      & 65534
                  )
                  >> 1
                | (((((((var43 & 65504) >> 5 | var43 << 11) ^ 215) & 32768) >> 15 | (((var43 & 65504) >> 5 | var43 << 11) ^ 215) << 1) ^ 182) + 120 - 121 ^ 28)
                  << 15
            )
            ^ 52
        );
        var14.setCharAt(
          var24,
          (char)(
            (
                (
                      (
                          ((((((var43 & 65504) >> 5 | var43 << 11) ^ 215) & 32768) >> 15 | (((var43 & 65504) >> 5 | var43 << 11) ^ 215) << 1) ^ 182)
                              + 120
                              - 121
                            ^ 28
                        )
                        & 65534
                    )
                    >> 1
                  | (
                      ((((((var43 & 65504) >> 5 | var43 << 11) ^ 215) & 32768) >> 15 | (((var43 & 65504) >> 5 | var43 << 11) ^ 215) << 1) ^ 182) + 120 - 121
                        ^ 28
                    )
                    << 15
              )
              ^ 52
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (577049403 + (781597561 << 781597561) | 0) & 1778420928; var30 < var17.length(); var30 += (1937577483 ^ -762477204 | 0) & 1242048641) {
        int var51 = var17.charAt(var30) + 'G' + 221 + 63;
        char var56 = (char)(
          (
              (
                    (
                        (
                              (
                                  (
                                      (((((var51 & 32768) >> 15 | var51 << 1) & 65472) >> 6 | ((var51 & 32768) >> 15 | var51 << 1) << 10) & 57344) >> 13
                                        | ((((var51 & 32768) >> 15 | var51 << 1) & 65472) >> 6 | ((var51 & 32768) >> 15 | var51 << 1) << 10) << 3
                                    )
                                    ^ 7
                                )
                                & 63488
                            )
                            >> 11
                          | (
                              (
                                  (((((var51 & 32768) >> 15 | var51 << 1) & 65472) >> 6 | ((var51 & 32768) >> 15 | var51 << 1) << 10) & 57344) >> 13
                                    | ((((var51 & 32768) >> 15 | var51 << 1) & 65472) >> 6 | ((var51 & 32768) >> 15 | var51 << 1) << 10) << 3
                                )
                                ^ 7
                            )
                            << 5
                      )
                      & 65520
                  )
                  >> 4
                | (
                    (
                          (
                              (
                                  (((((var51 & 32768) >> 15 | var51 << 1) & 65472) >> 6 | ((var51 & 32768) >> 15 | var51 << 1) << 10) & 57344) >> 13
                                    | ((((var51 & 32768) >> 15 | var51 << 1) & 65472) >> 6 | ((var51 & 32768) >> 15 | var51 << 1) << 10) << 3
                                )
                                ^ 7
                            )
                            & 63488
                        )
                        >> 11
                      | (
                          (
                              (((((var51 & 32768) >> 15 | var51 << 1) & 65472) >> 6 | ((var51 & 32768) >> 15 | var51 << 1) << 10) & 57344) >> 13
                                | ((((var51 & 32768) >> 15 | var51 << 1) & 65472) >> 6 | ((var51 & 32768) >> 15 | var51 << 1) << 10) << 3
                            )
                            ^ 7
                        )
                        << 5
                  )
                  << 12
            )
            - 224
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
                                        (((((var51 & 32768) >> 15 | var51 << 1) & 65472) >> 6 | ((var51 & 32768) >> 15 | var51 << 1) << 10) & 57344) >> 13
                                          | ((((var51 & 32768) >> 15 | var51 << 1) & 65472) >> 6 | ((var51 & 32768) >> 15 | var51 << 1) << 10) << 3
                                      )
                                      ^ 7
                                  )
                                  & 63488
                              )
                              >> 11
                            | (
                                (
                                    (((((var51 & 32768) >> 15 | var51 << 1) & 65472) >> 6 | ((var51 & 32768) >> 15 | var51 << 1) << 10) & 57344) >> 13
                                      | ((((var51 & 32768) >> 15 | var51 << 1) & 65472) >> 6 | ((var51 & 32768) >> 15 | var51 << 1) << 10) << 3
                                  )
                                  ^ 7
                              )
                              << 5
                        )
                        & 65520
                    )
                    >> 4
                  | (
                      (
                            (
                                (
                                    (((((var51 & 32768) >> 15 | var51 << 1) & 65472) >> 6 | ((var51 & 32768) >> 15 | var51 << 1) << 10) & 57344) >> 13
                                      | ((((var51 & 32768) >> 15 | var51 << 1) & 65472) >> 6 | ((var51 & 32768) >> 15 | var51 << 1) << 10) << 3
                                  )
                                  ^ 7
                              )
                              & 63488
                          )
                          >> 11
                        | (
                            (
                                (((((var51 & 32768) >> 15 | var51 << 1) & 65472) >> 6 | ((var51 & 32768) >> 15 | var51 << 1) << 10) & 57344) >> 13
                                  | ((((var51 & 32768) >> 15 | var51 << 1) & 65472) >> 6 | ((var51 & 32768) >> 15 | var51 << 1) << 10) << 3
                              )
                              ^ 7
                          )
                          << 5
                    )
                    << 12
              )
              - 224
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, spd.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = 1744410837 + 1622874611 ^ -927681848; var36 < var20.length(); var36 += (-442881504 & -442881504 | 1) & 402756063) {
        int var61 = (var20.charAt(var36) ^ 'R') + 40;
        int var89 = (var61 & 65408) >> 7;
        int var62 = (var61 & 65408) >> 7 | var61 << 9;
        int var90 = (((var61 & 65408) >> 7 | var61 << 9) & 32768) >> 15;
        char var63 = (char)((((((var89 | var61 << 9) & 32768) >> 15 | ((var61 & 65408) >> 7 | var61 << 9) << 1) - 105 ^ 32) + 151 ^ 25 ^ 149) + 115);
        var20.setCharAt(var36, (char)((((var90 | var62 << 1) - 105 ^ 32) + 151 ^ 25 ^ 149) + 115));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), spd.class.getClassLoader()).returnType();
      switch ((((var4 - 1276189074 ^ 121870413) + 1756549443 ^ 1243041524) - 1780056482 + 2070665955 + 744995757 ^ 1283458590) - 111177651 - 198397670) {
        case 731141808:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 973012885:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1110156248:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1766578643:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      dok[(var10 + 833071920 + 601155224 - 285511098 - 1223516508 - 395116771 - 935895987 - 981292902 + 2100731816 ^ 1358917478) - 758252076] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
