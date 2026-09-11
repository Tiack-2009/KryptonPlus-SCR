// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

public enum ip {
  zm,
  qc;
  // [JNT] MethodHandle dispatch table (removed)
  // $VF: Failed to inline enum fields
  // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
  static {
    int var10000 = -347639481 - -264465427 ^ -83174054;

    StringBuilder var10001;
    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < (-1637077227 << -1637077227 ^ -492830717);
      var10000 += (-684846444 >>> -127892774 | 1) & 294969353
    ) {
      char var6 = /* jnt */;
      char var7 = (char)((((var6 & '\uffc0') >> 6 | var6 << '\n') - 115 ^ 7 ^ 192) - 84);
      /* jnt */((((var6 & '\uffc0') >> 6 | var6 << '\n') - 115 ^ 7 ^ 192) - 84)
      );
    }

    zm = (ip)/* jnt */, 0
    );
    var10000 = (-592975301 ^ 295381928 | 0) & 12589164;

    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < (-1232423925 * -1270880932 ^ -1214543117);
      var10000 += (1228403534 >>> 1228403534 | 0) & 1927465249
    ) {
      int var10 = /* jnt */ + 18 - 233 - 147;
      char var11 = (char)(((var10 & 61440) >> 12 | var10 << 4) + 96);
      /* jnt */(((var10 & 61440) >> 12 | var10 << 4) + 96)
      );
    }

    qc = (ip)/* jnt */, 1
    );
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 ^ 2103064665) - 579024126 + 1941276560 ^ 1617890364 ^ 1064080779) + 1059048027 + 93498544 - 741527011 ^ 534748282;
    MethodHandle var10000 = vxz[(((var10 ^ 2103064665) - 579024126 + 1941276560 ^ 1617890364 ^ 1064080779) + 1059048027 + 93498544 - 741527011 ^ 534748282)
      + 1284424497];
    if (vxz[var10001 + 1284424497] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (255915839 << 1600118908 | 0) & 86536553; var23 < var13.length(); var23 += (-76584630 >> -76584630 | 1) & 74757) {
        int var42 = var13.charAt(var23);
        int var10004 = (var42 & 65408) >> 7;
        int var43 = (var42 & 65408) >> 7 | var42 << 9;
        int var85 = (((var42 & 65408) >> 7 | var42 << 9) & 32768) >> 15;
        var42 = ((((var10004 | var42 << 9) & 32768) >> 15 | ((var42 & 65408) >> 7 | var42 << 9) << 1) ^ 76) - 30;
        var10004 = (((var85 | var43 << 1) ^ 76) - 30 & 63488) >> 11;
        int var45 = (((((var85 | var43 << 1) ^ 76) - 30 & 63488) >> 11 | var42 << 5) + 170 ^ 29) + 214 - 149;
        int var87 = ((((((var85 | var43 << 1) ^ 76) - 30 & 63488) >> 11 | var42 << 5) + 170 ^ 29) + 214 - 149 & 63488) >> 11;
        char var46 = (char)(
          (((var10004 | var42 << 5) + 170 ^ 29) + 214 - 149 & 63488) >> 11
            | (((((var85 | var43 << 1) ^ 76) - 30 & 63488) >> 11 | var42 << 5) + 170 ^ 29) + 214 - 149 << 5
        );
        var13.setCharAt(var23, (char)(var87 | var45 << 5));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = 634172133 - 1405887740 ^ -771715607; var29 < var16.length(); var29 += 284202768 << 284202768 ^ -1760559103) {
        char var51 = var16.charAt(var29);
        char var54 = (char)(
          (
              (
                    (
                          (((((var51 & '\uffc0') >> 6 | var51 << '\n') + 13 ^ 30) & 65532) >> 2 | (((var51 & '\uffc0') >> 6 | var51 << '\n') + 13 ^ 30) << 14)
                            & 61440
                        )
                        >> 12
                      | (((((var51 & '\uffc0') >> 6 | var51 << '\n') + 13 ^ 30) & 65532) >> 2 | (((var51 & '\uffc0') >> 6 | var51 << '\n') + 13 ^ 30) << 14)
                        << 4
                  )
                  - 75
                  - 157
                ^ 2
            )
            - 239
            + 40
        );
        var16.setCharAt(
          var29,
          (char)(
            (
                (
                      (
                            (((((var51 & '\uffc0') >> 6 | var51 << '\n') + 13 ^ 30) & 65532) >> 2 | (((var51 & '\uffc0') >> 6 | var51 << '\n') + 13 ^ 30) << 14)
                              & 61440
                          )
                          >> 12
                        | (((((var51 & '\uffc0') >> 6 | var51 << '\n') + 13 ^ 30) & 65532) >> 2 | (((var51 & '\uffc0') >> 6 | var51 << '\n') + 13 ^ 30) << 14)
                          << 4
                    )
                    - 75
                    - 157
                  ^ 2
              )
              - 239
              + 40
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), ip.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (-1293730348 * -1293730348 | 0) & 974735465; var35 < var19.length(); var35 += (1074370161 | 1074370161) ^ 1074370160) {
        char var59 = var19.charAt(var35);
        char var64 = (char)(
          (
                (
                      (
                            (
                                  (
                                        (
                                            (((((var59 & 0) >> 16 | var59 << 0) - 197 ^ 50) & 49152) >> 14 | (((var59 & 0) >> 16 | var59 << 0) - 197 ^ 50) << 2)
                                              ^ 37
                                          )
                                          & 32768
                                      )
                                      >> 15
                                    | (
                                        (((((var59 & 0) >> 16 | var59 << 0) - 197 ^ 50) & 49152) >> 14 | (((var59 & 0) >> 16 | var59 << 0) - 197 ^ 50) << 2)
                                          ^ 37
                                      )
                                      << 1
                                )
                                - 187
                              & 32768
                          )
                          >> 15
                        | (
                              (
                                    ((((((var59 & 0) >> 16 | var59 << 0) - 197 ^ 50) & 49152) >> 14 | (((var59 & 0) >> 16 | var59 << 0) - 197 ^ 50) << 2) ^ 37)
                                      & 32768
                                  )
                                  >> 15
                                | ((((((var59 & 0) >> 16 | var59 << 0) - 197 ^ 50) & 49152) >> 14 | (((var59 & 0) >> 16 | var59 << 0) - 197 ^ 50) << 2) ^ 37)
                                  << 1
                            )
                            - 187
                          << 1
                    )
                    + 239
                  & 0
              )
              >> 16
            | (
                  (
                        (
                              (
                                    ((((((var59 & 0) >> 16 | var59 << 0) - 197 ^ 50) & 49152) >> 14 | (((var59 & 0) >> 16 | var59 << 0) - 197 ^ 50) << 2) ^ 37)
                                      & 32768
                                  )
                                  >> 15
                                | ((((((var59 & 0) >> 16 | var59 << 0) - 197 ^ 50) & 49152) >> 14 | (((var59 & 0) >> 16 | var59 << 0) - 197 ^ 50) << 2) ^ 37)
                                  << 1
                            )
                            - 187
                          & 32768
                      )
                      >> 15
                    | (
                          (((((((var59 & 0) >> 16 | var59 << 0) - 197 ^ 50) & 49152) >> 14 | (((var59 & 0) >> 16 | var59 << 0) - 197 ^ 50) << 2) ^ 37) & 32768)
                              >> 15
                            | ((((((var59 & 0) >> 16 | var59 << 0) - 197 ^ 50) & 49152) >> 14 | (((var59 & 0) >> 16 | var59 << 0) - 197 ^ 50) << 2) ^ 37) << 1
                        )
                        - 187
                      << 1
                )
                + 239
              << 0
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
                                              (
                                                  ((((var59 & 0) >> 16 | var59 << 0) - 197 ^ 50) & 49152) >> 14
                                                    | (((var59 & 0) >> 16 | var59 << 0) - 197 ^ 50) << 2
                                                )
                                                ^ 37
                                            )
                                            & 32768
                                        )
                                        >> 15
                                      | (
                                          (((((var59 & 0) >> 16 | var59 << 0) - 197 ^ 50) & 49152) >> 14 | (((var59 & 0) >> 16 | var59 << 0) - 197 ^ 50) << 2)
                                            ^ 37
                                        )
                                        << 1
                                  )
                                  - 187
                                & 32768
                            )
                            >> 15
                          | (
                                (
                                      (
                                          (((((var59 & 0) >> 16 | var59 << 0) - 197 ^ 50) & 49152) >> 14 | (((var59 & 0) >> 16 | var59 << 0) - 197 ^ 50) << 2)
                                            ^ 37
                                        )
                                        & 32768
                                    )
                                    >> 15
                                  | ((((((var59 & 0) >> 16 | var59 << 0) - 197 ^ 50) & 49152) >> 14 | (((var59 & 0) >> 16 | var59 << 0) - 197 ^ 50) << 2) ^ 37)
                                    << 1
                              )
                              - 187
                            << 1
                      )
                      + 239
                    & 0
                )
                >> 16
              | (
                    (
                          (
                                (
                                      (
                                          (((((var59 & 0) >> 16 | var59 << 0) - 197 ^ 50) & 49152) >> 14 | (((var59 & 0) >> 16 | var59 << 0) - 197 ^ 50) << 2)
                                            ^ 37
                                        )
                                        & 32768
                                    )
                                    >> 15
                                  | ((((((var59 & 0) >> 16 | var59 << 0) - 197 ^ 50) & 49152) >> 14 | (((var59 & 0) >> 16 | var59 << 0) - 197 ^ 50) << 2) ^ 37)
                                    << 1
                              )
                              - 187
                            & 32768
                        )
                        >> 15
                      | (
                            (
                                  ((((((var59 & 0) >> 16 | var59 << 0) - 197 ^ 50) & 49152) >> 14 | (((var59 & 0) >> 16 | var59 << 0) - 197 ^ 50) << 2) ^ 37)
                                    & 32768
                                )
                                >> 15
                              | ((((((var59 & 0) >> 16 | var59 << 0) - 197 ^ 50) & 49152) >> 14 | (((var59 & 0) >> 16 | var59 << 0) - 197 ^ 50) << 2) ^ 37)
                                << 1
                          )
                          - 187
                        << 1
                  )
                  + 239
                << 0
          )
        );
      }

      Class var7 = Class.forName(var19.toString(), false, ip.class.getClassLoader());
      switch (((var4 ^ 1797482465) - 3649752 + 314806399 ^ 81807492 ^ 644210995 ^ 334430415) + 783788318 + 2070486545 ^ 249892400 ^ 1184735681) {
        case 158145456:
        case 616096768:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 549581558:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 738885006:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 958925620:
          var10000 = var0.findSpecial(var7, var5, var6, ip.class);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    vxz[(((var10 ^ 2103064665) - 579024126 + 1941276560 ^ 1617890364 ^ 1064080779) + 1059048027 + 93498544 - 741527011 ^ 534748282) + 1284424497] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (var10 - 290139100 ^ 656118000 ^ 6062225) - 1064348183 + 7386600 - 1640781057 - 133304356 + 1508107872 - 940888496;
    MethodHandle var10000 = vxz[(var10 - 290139100 ^ 656118000 ^ 6062225) - 1064348183 + 7386600 - 1640781057 - 133304356 + 1508107872 - 940888496 - 1414853516];
    if (vxz[var10001 - 1414853516] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (-2005743962 + -2005743962 | 0) & -1357368655; var24 < var14.length(); var24 += (94913197 | 66744180) ^ 133853180) {
        int var43 = var14.charAt(var24) - '$' - 169 - 52;
        char var46 = (char)(
          (
              ((((((var43 & 65472) >> 6 | var43 << 10) + 155 & 65520) >> 4 | ((var43 & 65472) >> 6 | var43 << 10) + 155 << 12) ^ 200) & 65408) >> 7
                | (((((var43 & 65472) >> 6 | var43 << 10) + 155 & 65520) >> 4 | ((var43 & 65472) >> 6 | var43 << 10) + 155 << 12) ^ 200) << 9
            )
            ^ 251
            ^ 130
        );
        var14.setCharAt(
          var24,
          (char)(
            (
                ((((((var43 & 65472) >> 6 | var43 << 10) + 155 & 65520) >> 4 | ((var43 & 65472) >> 6 | var43 << 10) + 155 << 12) ^ 200) & 65408) >> 7
                  | (((((var43 & 65472) >> 6 | var43 << 10) + 155 & 65520) >> 4 | ((var43 & 65472) >> 6 | var43 << 10) + 155 << 12) ^ 200) << 9
              )
              ^ 251
              ^ 130
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (701608471 & -1131497360 | 0) & 1094976516; var30 < var17.length(); var30 += -262808172 >> 832822035 ^ -501) {
        int var51 = var17.charAt(var30) + '6' + 30 + 176 - 87 - 174 ^ 195 ^ 182;
        char var54 = (char)(
          (((((var51 & 65504) >> 5 | var51 << 11) & 64512) >> 10 | ((var51 & 65504) >> 5 | var51 << 11) << 6) & 0) >> 16
            | ((((var51 & 65504) >> 5 | var51 << 11) & 64512) >> 10 | ((var51 & 65504) >> 5 | var51 << 11) << 6) << 0
        );
        var17.setCharAt(
          var30,
          (char)(
            (((((var51 & 65504) >> 5 | var51 << 11) & 64512) >> 10 | ((var51 & 65504) >> 5 | var51 << 11) << 6) & 0) >> 16
              | ((((var51 & 65504) >> 5 | var51 << 11) & 64512) >> 10 | ((var51 & 65504) >> 5 | var51 << 11) << 6) << 0
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, ip.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = -81324517 << 648713457 ^ 741736448; var36 < var20.length(); var36 += (478694618 & 1364508828 | 1) & -346184093) {
        int var59 = var20.charAt(var36) - 129 + 212 - 98 + 76 ^ 101;
        int var87 = (var59 & 65535) >> 0;
        int var60 = ((var59 & 65535) >> 0 | var59 << 16) ^ 249;
        int var88 = ((((var59 & 65535) >> 0 | var59 << 16) ^ 249) & 65535) >> 0;
        var59 = (((var87 | var59 << 16) ^ 249) & 65535) >> 0 | (((var59 & 65535) >> 0 | var59 << 16) ^ 249) << 16;
        var87 = ((var88 | var60 << 16) & 32768) >> 15;
        int var62 = ((var88 | var60 << 16) & 32768) >> 15 | var59 << 1;
        int var90 = ((((var88 | var60 << 16) & 32768) >> 15 | var59 << 1) & 63488) >> 11;
        char var63 = (char)(((var87 | var59 << 1) & 63488) >> 11 | (((var88 | var60 << 16) & 32768) >> 15 | var59 << 1) << 5);
        var20.setCharAt(var36, (char)(var90 | var62 << 5));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), ip.class.getClassLoader()).returnType();
      switch (((var4 - 598961904 ^ 2030684438) + 894164472 ^ 1815593395) - 1800593513 - 1657306359 + 1130661166 + 1221531970 - 2108725613 + 1817978271) {
        case 335627770:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 904210126:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1181046113:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 2054219946:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      vxz[(var10 - 290139100 ^ 656118000 ^ 6062225) - 1064348183 + 7386600 - 1640781057 - 133304356 + 1508107872 - 940888496 - 1414853516] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
