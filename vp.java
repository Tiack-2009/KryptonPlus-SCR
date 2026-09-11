// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

public class vp {
  public String tw;
  // [JNT] MethodHandle dispatch table (removed)
  public vp(hn var1, String var2) {
    this.tw = var2;
  }

  public String kh() {
    return null /* jnt:encrypted */;
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (((var10 - 547367422 - 1414823947 - 805719763 ^ 1663662779) - 927838866 ^ 833663773) - 1402520127 ^ 1400615796) - 615009440;
    MethodHandle var10000 = ulo[(((var10 - 547367422 - 1414823947 - 805719763 ^ 1663662779) - 927838866 ^ 833663773) - 1402520127 ^ 1400615796)
      - 615009440
      - 1230977942];
    if (ulo[var10001 - 1230977942] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (-580917712 ^ -580917712 | 0) & -1305171257; var24 < var14.length(); var24 += -1711681897 * 409542714 ^ 5942839) {
        int var43 = var14.charAt(var24) - 6 ^ 117;
        char var48 = (char)(
          (
              (
                    (
                          (
                                (
                                    (((((var43 & 65520) >> 4 | var43 << 12) + 185 & 61440) >> 12 | ((var43 & 65520) >> 4 | var43 << 12) + 185 << 4) & 65528)
                                        >> 3
                                      | ((((var43 & 65520) >> 4 | var43 << 12) + 185 & 61440) >> 12 | ((var43 & 65520) >> 4 | var43 << 12) + 185 << 4) << 13
                                  )
                                  & 65504
                              )
                              >> 5
                            | (
                                (((((var43 & 65520) >> 4 | var43 << 12) + 185 & 61440) >> 12 | ((var43 & 65520) >> 4 | var43 << 12) + 185 << 4) & 65528) >> 3
                                  | ((((var43 & 65520) >> 4 | var43 << 12) + 185 & 61440) >> 12 | ((var43 & 65520) >> 4 | var43 << 12) + 185 << 4) << 13
                              )
                              << 11
                        )
                        + 49
                      & 65408
                  )
                  >> 7
                | (
                      (
                            (
                                (((((var43 & 65520) >> 4 | var43 << 12) + 185 & 61440) >> 12 | ((var43 & 65520) >> 4 | var43 << 12) + 185 << 4) & 65528) >> 3
                                  | ((((var43 & 65520) >> 4 | var43 << 12) + 185 & 61440) >> 12 | ((var43 & 65520) >> 4 | var43 << 12) + 185 << 4) << 13
                              )
                              & 65504
                          )
                          >> 5
                        | (
                            (((((var43 & 65520) >> 4 | var43 << 12) + 185 & 61440) >> 12 | ((var43 & 65520) >> 4 | var43 << 12) + 185 << 4) & 65528) >> 3
                              | ((((var43 & 65520) >> 4 | var43 << 12) + 185 & 61440) >> 12 | ((var43 & 65520) >> 4 | var43 << 12) + 185 << 4) << 13
                          )
                          << 11
                    )
                    + 49
                  << 9
            )
            ^ 39
        );
        var14.setCharAt(
          var24,
          (char)(
            (
                (
                      (
                            (
                                  (
                                      (((((var43 & 65520) >> 4 | var43 << 12) + 185 & 61440) >> 12 | ((var43 & 65520) >> 4 | var43 << 12) + 185 << 4) & 65528)
                                          >> 3
                                        | ((((var43 & 65520) >> 4 | var43 << 12) + 185 & 61440) >> 12 | ((var43 & 65520) >> 4 | var43 << 12) + 185 << 4) << 13
                                    )
                                    & 65504
                                )
                                >> 5
                              | (
                                  (((((var43 & 65520) >> 4 | var43 << 12) + 185 & 61440) >> 12 | ((var43 & 65520) >> 4 | var43 << 12) + 185 << 4) & 65528) >> 3
                                    | ((((var43 & 65520) >> 4 | var43 << 12) + 185 & 61440) >> 12 | ((var43 & 65520) >> 4 | var43 << 12) + 185 << 4) << 13
                                )
                                << 11
                          )
                          + 49
                        & 65408
                    )
                    >> 7
                  | (
                        (
                              (
                                  (((((var43 & 65520) >> 4 | var43 << 12) + 185 & 61440) >> 12 | ((var43 & 65520) >> 4 | var43 << 12) + 185 << 4) & 65528) >> 3
                                    | ((((var43 & 65520) >> 4 | var43 << 12) + 185 & 61440) >> 12 | ((var43 & 65520) >> 4 | var43 << 12) + 185 << 4) << 13
                                )
                                & 65504
                            )
                            >> 5
                          | (
                              (((((var43 & 65520) >> 4 | var43 << 12) + 185 & 61440) >> 12 | ((var43 & 65520) >> 4 | var43 << 12) + 185 << 4) & 65528) >> 3
                                | ((((var43 & 65520) >> 4 | var43 << 12) + 185 & 61440) >> 12 | ((var43 & 65520) >> 4 | var43 << 12) + 185 << 4) << 13
                            )
                            << 11
                      )
                      + 49
                    << 9
              )
              ^ 39
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (-470268446 << (-470268446 >>> 1483877698) | 0) & 497436878; var30 < var17.length(); var30 += (-176627739 & 2114355175 | 0) & 139206683) {
        int var53 = var17.charAt(var30);
        int var96 = (var53 & 65535) >> 0;
        int var54 = ((var53 & 65535) >> 0 | var53 << 16) + 184 + 79;
        int var97 = (((var53 & 65535) >> 0 | var53 << 16) + 184 + 79 & 65504) >> 5;
        var53 = ((var96 | var53 << 16) + 184 + 79 & 65504) >> 5 | ((var53 & 65535) >> 0 | var53 << 16) + 184 + 79 << 11;
        var96 = ((var97 | var54 << 11) & 65534) >> 1;
        int var56 = ((var97 | var54 << 11) & 65534) >> 1 | var53 << 15;
        int var99 = ((((var97 | var54 << 11) & 65534) >> 1 | var53 << 15) & 64512) >> 10;
        var53 = (((var96 | var53 << 15) & 64512) >> 10 | (((var97 | var54 << 11) & 65534) >> 1 | var53 << 15) << 6) + 5;
        var96 = ((var99 | var56 << 6) + 5 & 65520) >> 4;
        int var58 = (((var99 | var56 << 6) + 5 & 65520) >> 4 | var53 << 12) - 52;
        int var101 = ((((var99 | var56 << 6) + 5 & 65520) >> 4 | var53 << 12) - 52 & 65472) >> 6;
        char var59 = (char)(((var96 | var53 << 12) - 52 & 65472) >> 6 | (((var99 | var56 << 6) + 5 & 65520) >> 4 | var53 << 12) - 52 << 10);
        var17.setCharAt(var30, (char)(var101 | var58 << 10));
      }

      Class var6 = Class.forName(var17.toString(), false, vp.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = -1648696137 * -1912295836 ^ -1185826436; var36 < var20.length(); var36 += -899733138 << (1478372627 | -1385022994) ^ 1) {
        int var64 = var20.charAt(var36);
        int var102 = (var64 & 65532) >> 2;
        int var65 = (var64 & 65532) >> 2 | var64 << 14;
        int var103 = (((var64 & 65532) >> 2 | var64 << 14) & 65472) >> 6;
        var64 = ((((var102 | var64 << 14) & 65472) >> 6 | ((var64 & 65532) >> 2 | var64 << 14) << 10) + 150 + 83 - 121 ^ 98) + 91 - 197;
        var102 = (((var103 | var65 << 10) + 150 + 83 - 121 ^ 98) + 91 - 197 & 57344) >> 13;
        int var67 = (((var103 | var65 << 10) + 150 + 83 - 121 ^ 98) + 91 - 197 & 57344) >> 13 | var64 << 3;
        int var105 = (((((var103 | var65 << 10) + 150 + 83 - 121 ^ 98) + 91 - 197 & 57344) >> 13 | var64 << 3) & 0) >> 16;
        char var68 = (char)(((var102 | var64 << 3) & 0) >> 16 | ((((var103 | var65 << 10) + 150 + 83 - 121 ^ 98) + 91 - 197 & 57344) >> 13 | var64 << 3) << 0);
        var20.setCharAt(var36, (char)(var105 | var67 << 0));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), vp.class.getClassLoader()).returnType();
      switch (((var4 + 1523663265 ^ 942524968) - 1455912272 + 1126890314 ^ 282861926) - 16602679 + 1481612024 - 1684177126 - 1739796657 - 1469113766) {
        case 428988389:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 873883859:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1682812805:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1855122392:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      ulo[(((var10 - 547367422 - 1414823947 - 805719763 ^ 1663662779) - 927838866 ^ 833663773) - 1402520127 ^ 1400615796) - 615009440 - 1230977942] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
