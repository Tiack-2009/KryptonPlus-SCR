// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

public record yr(
  double yaw,
  double pitch,
  double yaw,
  double pitch,
  double yaw,
  double pitch,
  double yaw,
  double pitch,
  double yaw,
  double pitch,
  double yaw,
  double pitch,
  double yaw,
  double pitch,
  double yaw,
  double pitch,
  double yaw,
  double pitch,
  double yaw,
  double pitch,
  double yaw,
  double pitch,
  double yaw,
  double pitch,
  double yaw,
  double pitch,
  double yaw,
  double pitch,
  double yaw,
  double pitch,
  double yaw,
  double pitch
) {
  public double lsr;
  public double kya;
  // [JNT] MethodHandle dispatch table (removed)
  public yr(double var1, double var3) {
    this.lsr = var1;
    this.kya = var3;
  }

  public double ukk() {
    return null /* jnt:encrypted */;
  }

  public double sqm() {
    return null /* jnt:encrypted */;
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 - 1776434907 - 26654445 ^ 193523807) - 539886920 + 1597544770 + 956296875 ^ 1469033254 ^ 1110082727) + 65366617;
    MethodHandle var10000 = pjz[((var10 - 1776434907 - 26654445 ^ 193523807) - 539886920 + 1597544770 + 956296875 ^ 1469033254 ^ 1110082727)
      + 65366617
      + 1996542316];
    if (pjz[var10001 + 1996542316] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (-1329967020 >>> -1329967020 + -1329967020 | 0) & -553565824; var24 < var14.length(); var24 += -44868561 & -44868561 ^ -44868562) {
        int var43 = var14.charAt(var24) - 127 + 75;
        int var10004 = (var43 & 65024) >> 9;
        int var44 = (var43 & 65024) >> 9 | var43 << 7;
        int var92 = (((var43 & 65024) >> 9 | var43 << 7) & 65532) >> 2;
        var43 = (((var10004 | var43 << 7) & 65532) >> 2 | ((var43 & 65024) >> 9 | var43 << 7) << 14) ^ 221;
        var10004 = (((var92 | var44 << 14) ^ 221) & 32768) >> 15;
        int var46 = (((var92 | var44 << 14) ^ 221) & 32768) >> 15 | var43 << 1;
        int var94 = (((((var92 | var44 << 14) ^ 221) & 32768) >> 15 | var43 << 1) & 65408) >> 7;
        char var47 = (char)(((((var10004 | var43 << 1) & 65408) >> 7 | ((((var92 | var44 << 14) ^ 221) & 32768) >> 15 | var43 << 1) << 9) ^ 251) + 175 - 202);
        var14.setCharAt(var24, (char)(((var94 | var46 << 9) ^ 251) + 175 - 202));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = 1390175374 ^ -978573640 >> 1390175374 * -978573640 ^ -1390173918;
        var30 < var17.length();
        var30 += (397335471 * 397335471 | 0) & 655821391
      ) {
        int var52 = var17.charAt(var30);
        int var95 = (var52 & 61440) >> 12;
        int var53 = (var52 & 61440) >> 12 | var52 << 4;
        int var96 = (((var52 & 61440) >> 12 | var52 << 4) & 64512) >> 10;
        var52 = (((var95 | var52 << 4) & 64512) >> 10 | ((var52 & 61440) >> 12 | var52 << 4) << 6) + 226;
        var95 = ((var96 | var53 << 6) + 226 & 65534) >> 1;
        int var55 = ((var96 | var53 << 6) + 226 & 65534) >> 1 | var52 << 15;
        int var98 = ((((var96 | var53 << 6) + 226 & 65534) >> 1 | var52 << 15) & 0) >> 16;
        var52 = ((((var95 | var52 << 15) & 0) >> 16 | (((var96 | var53 << 6) + 226 & 65534) >> 1 | var52 << 15) << 0) ^ 207) - 128;
        var95 = (((var98 | var55 << 0) ^ 207) - 128 & 65528) >> 3;
        int var57 = ((((var98 | var55 << 0) ^ 207) - 128 & 65528) >> 3 | var52 << 13) + 78;
        int var100 = (((((var98 | var55 << 0) ^ 207) - 128 & 65528) >> 3 | var52 << 13) + 78 & 65408) >> 7;
        char var58 = (char)(((var95 | var52 << 13) + 78 & 65408) >> 7 | ((((var98 | var55 << 0) ^ 207) - 128 & 65528) >> 3 | var52 << 13) + 78 << 9);
        var17.setCharAt(var30, (char)(var100 | var57 << 9));
      }

      Class var6 = Class.forName(var17.toString(), false, yr.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (1675882495 | -1081015133) ^ -790529; var36 < var20.length(); var36 += (3346013 >>> 3346013 | 1) & 708662109) {
        int var63 = var20.charAt(var36) + 230;
        char var68 = (char)(
          (
              (
                    (
                        (
                              (
                                  (
                                        (
                                            (((var63 & 65528) >> 3 | var63 << 13) + 156 + 30 + 227 & 65504) >> 5
                                              | ((var63 & 65528) >> 3 | var63 << 13) + 156 + 30 + 227 << 11
                                          )
                                          & 65528
                                      )
                                      >> 3
                                    | (
                                        (((var63 & 65528) >> 3 | var63 << 13) + 156 + 30 + 227 & 65504) >> 5
                                          | ((var63 & 65528) >> 3 | var63 << 13) + 156 + 30 + 227 << 11
                                      )
                                      << 13
                                )
                                & 64512
                            )
                            >> 10
                          | (
                              (
                                    (
                                        (((var63 & 65528) >> 3 | var63 << 13) + 156 + 30 + 227 & 65504) >> 5
                                          | ((var63 & 65528) >> 3 | var63 << 13) + 156 + 30 + 227 << 11
                                      )
                                      & 65528
                                  )
                                  >> 3
                                | (
                                    (((var63 & 65528) >> 3 | var63 << 13) + 156 + 30 + 227 & 65504) >> 5
                                      | ((var63 & 65528) >> 3 | var63 << 13) + 156 + 30 + 227 << 11
                                  )
                                  << 13
                            )
                            << 6
                      )
                      & 64512
                  )
                  >> 10
                | (
                    (
                          (
                              (
                                    (
                                        (((var63 & 65528) >> 3 | var63 << 13) + 156 + 30 + 227 & 65504) >> 5
                                          | ((var63 & 65528) >> 3 | var63 << 13) + 156 + 30 + 227 << 11
                                      )
                                      & 65528
                                  )
                                  >> 3
                                | (
                                    (((var63 & 65528) >> 3 | var63 << 13) + 156 + 30 + 227 & 65504) >> 5
                                      | ((var63 & 65528) >> 3 | var63 << 13) + 156 + 30 + 227 << 11
                                  )
                                  << 13
                            )
                            & 64512
                        )
                        >> 10
                      | (
                          (
                                (
                                    (((var63 & 65528) >> 3 | var63 << 13) + 156 + 30 + 227 & 65504) >> 5
                                      | ((var63 & 65528) >> 3 | var63 << 13) + 156 + 30 + 227 << 11
                                  )
                                  & 65528
                              )
                              >> 3
                            | (
                                (((var63 & 65528) >> 3 | var63 << 13) + 156 + 30 + 227 & 65504) >> 5
                                  | ((var63 & 65528) >> 3 | var63 << 13) + 156 + 30 + 227 << 11
                              )
                              << 13
                        )
                        << 6
                  )
                  << 6
            )
            + 60
        );
        var20.setCharAt(
          var36,
          (char)(
            (
                (
                      (
                          (
                                (
                                    (
                                          (
                                              (((var63 & 65528) >> 3 | var63 << 13) + 156 + 30 + 227 & 65504) >> 5
                                                | ((var63 & 65528) >> 3 | var63 << 13) + 156 + 30 + 227 << 11
                                            )
                                            & 65528
                                        )
                                        >> 3
                                      | (
                                          (((var63 & 65528) >> 3 | var63 << 13) + 156 + 30 + 227 & 65504) >> 5
                                            | ((var63 & 65528) >> 3 | var63 << 13) + 156 + 30 + 227 << 11
                                        )
                                        << 13
                                  )
                                  & 64512
                              )
                              >> 10
                            | (
                                (
                                      (
                                          (((var63 & 65528) >> 3 | var63 << 13) + 156 + 30 + 227 & 65504) >> 5
                                            | ((var63 & 65528) >> 3 | var63 << 13) + 156 + 30 + 227 << 11
                                        )
                                        & 65528
                                    )
                                    >> 3
                                  | (
                                      (((var63 & 65528) >> 3 | var63 << 13) + 156 + 30 + 227 & 65504) >> 5
                                        | ((var63 & 65528) >> 3 | var63 << 13) + 156 + 30 + 227 << 11
                                    )
                                    << 13
                              )
                              << 6
                        )
                        & 64512
                    )
                    >> 10
                  | (
                      (
                            (
                                (
                                      (
                                          (((var63 & 65528) >> 3 | var63 << 13) + 156 + 30 + 227 & 65504) >> 5
                                            | ((var63 & 65528) >> 3 | var63 << 13) + 156 + 30 + 227 << 11
                                        )
                                        & 65528
                                    )
                                    >> 3
                                  | (
                                      (((var63 & 65528) >> 3 | var63 << 13) + 156 + 30 + 227 & 65504) >> 5
                                        | ((var63 & 65528) >> 3 | var63 << 13) + 156 + 30 + 227 << 11
                                    )
                                    << 13
                              )
                              & 64512
                          )
                          >> 10
                        | (
                            (
                                  (
                                      (((var63 & 65528) >> 3 | var63 << 13) + 156 + 30 + 227 & 65504) >> 5
                                        | ((var63 & 65528) >> 3 | var63 << 13) + 156 + 30 + 227 << 11
                                    )
                                    & 65528
                                )
                                >> 3
                              | (
                                  (((var63 & 65528) >> 3 | var63 << 13) + 156 + 30 + 227 & 65504) >> 5
                                    | ((var63 & 65528) >> 3 | var63 << 13) + 156 + 30 + 227 << 11
                                )
                                << 13
                          )
                          << 6
                    )
                    << 6
              )
              + 60
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), yr.class.getClassLoader()).returnType();
      switch (((var4 ^ 1025021195) + 80597797 - 1261009348 - 1071036272 + 365212851 ^ 1629079008) - 768996913 - 1530980389 - 1622993010 ^ 1172128282) {
        case 76657243:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 755259127:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 782672159:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1903402392:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      pjz[((var10 - 1776434907 - 26654445 ^ 193523807) - 539886920 + 1597544770 + 956296875 ^ 1469033254 ^ 1110082727) + 65366617 + 1996542316] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
