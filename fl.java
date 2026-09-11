// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.class_639;
import net.minecraft.class_642;

public record fl(
  class_639 address,
  class_642 info,
  class_639 address,
  class_642 info,
  class_639 address,
  class_642 info,
  class_639 address,
  class_642 info,
  class_639 address,
  class_642 info,
  class_639 address,
  class_642 info,
  class_639 address,
  class_642 info,
  class_639 address,
  class_642 info,
  class_639 address,
  class_642 info,
  class_639 address,
  class_642 info,
  class_639 address,
  class_642 info,
  class_639 address,
  class_642 info,
  class_639 address,
  class_642 info,
  class_639 address,
  class_642 info,
  class_639 address,
  class_642 info,
  class_639 address,
  class_642 info
) implements rzj {
  public class_639 rgy;
  public class_642 jmo;
  // [JNT] MethodHandle dispatch table (removed)
  public fl(class_639 var1, class_642 var2) {
    this.rgy = var1;
    this.jmo = var2;
  }

  public class_639 jv() {
    return null /* jnt:encrypted */;
  }

  public class_642 hi() {
    return null /* jnt:encrypted */;
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (var10 + 138667888 + 1763504963 + 183640799 ^ 832830355 ^ 1546409903) - 1992322696 - 2080352022 + 1479890386 ^ 100875546;
    MethodHandle var10000 = wcq[(var10 + 138667888 + 1763504963 + 183640799 ^ 832830355 ^ 1546409903) - 1992322696 - 2080352022 + 1479890386
      ^ 100875546
      ^ 1804482283];
    if (wcq[var10001 ^ 1804482283] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = -316029569 << (1558437755 >> (-316029569 >>> 1558437755)) ^ -1264118276;
        var24 < var14.length();
        var24 += (-1803987657 >> 1177145102 | 1) & 110097
      ) {
        int var43 = (var14.charAt(var24) - 149 - 198 ^ 113) + 148 ^ 160;
        int var10004 = (var43 & 65535) >> 0;
        int var44 = (var43 & 65535) >> 0 | var43 << 16;
        int var88 = (((var43 & 65535) >> 0 | var43 << 16) & 65528) >> 3;
        var43 = (((var10004 | var43 << 16) & 65528) >> 3 | ((var43 & 65535) >> 0 | var43 << 16) << 13) ^ 144;
        var10004 = (((var88 | var44 << 13) ^ 144) & 65535) >> 0;
        int var46 = (((var88 | var44 << 13) ^ 144) & 65535) >> 0 | var43 << 16;
        int var90 = (((((var88 | var44 << 13) ^ 144) & 65535) >> 0 | var43 << 16) & 65520) >> 4;
        char var47 = (char)(((var10004 | var43 << 16) & 65520) >> 4 | ((((var88 | var44 << 13) ^ 144) & 65535) >> 0 | var43 << 16) << 12);
        var14.setCharAt(var24, (char)(var90 | var46 << 12));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (-1638140158 ^ -488957523 | 0) & -2112159424; var30 < var17.length(); var30 += 112381758 >> -658053609 ^ 12) {
        int var52 = var17.charAt(var30) + '3' - 41;
        int var91 = (var52 & 57344) >> 13;
        int var53 = ((var52 & 57344) >> 13 | var52 << 3) - 182 ^ 15;
        int var92 = ((((var52 & 57344) >> 13 | var52 << 3) - 182 ^ 15) & 65528) >> 3;
        var52 = (((var91 | var52 << 3) - 182 ^ 15) & 65528) >> 3 | (((var52 & 57344) >> 13 | var52 << 3) - 182 ^ 15) << 13;
        var91 = ((var92 | var53 << 13) & 0) >> 16;
        int var55 = (((var92 | var53 << 13) & 0) >> 16 | var52 << 0) ^ 236;
        int var94 = (((((var92 | var53 << 13) & 0) >> 16 | var52 << 0) ^ 236) & 61440) >> 12;
        char var56 = (char)(((((var91 | var52 << 0) ^ 236) & 61440) >> 12 | ((((var92 | var53 << 13) & 0) >> 16 | var52 << 0) ^ 236) << 4) - 190);
        var17.setCharAt(var30, (char)((var94 | var55 << 4) - 190));
      }

      Class var6 = Class.forName(var17.toString(), false, fl.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (1616254049 | 1789925443) ^ 1794514019; var36 < var20.length(); var36 += (-1900481539 >> -1470202794 | 1) & 133) {
        int var61 = var20.charAt(var36) - 131;
        char var66 = (char)(
          (
              (
                    (
                        (
                              (
                                    (
                                        (((((var61 & 64512) >> 10 | var61 << 6) & 65528) >> 3 | ((var61 & 64512) >> 10 | var61 << 6) << 13) & 65535) >> 0
                                          | ((((var61 & 64512) >> 10 | var61 << 6) & 65528) >> 3 | ((var61 & 64512) >> 10 | var61 << 6) << 13) << 16
                                      )
                                      ^ 163
                                  )
                                  - 45
                                  + 83
                                & 65024
                            )
                            >> 9
                          | (
                                (
                                    (((((var61 & 64512) >> 10 | var61 << 6) & 65528) >> 3 | ((var61 & 64512) >> 10 | var61 << 6) << 13) & 65535) >> 0
                                      | ((((var61 & 64512) >> 10 | var61 << 6) & 65528) >> 3 | ((var61 & 64512) >> 10 | var61 << 6) << 13) << 16
                                  )
                                  ^ 163
                              )
                              - 45
                              + 83
                            << 7
                      )
                      & 65535
                  )
                  >> 0
                | (
                    (
                          (
                                (
                                    (((((var61 & 64512) >> 10 | var61 << 6) & 65528) >> 3 | ((var61 & 64512) >> 10 | var61 << 6) << 13) & 65535) >> 0
                                      | ((((var61 & 64512) >> 10 | var61 << 6) & 65528) >> 3 | ((var61 & 64512) >> 10 | var61 << 6) << 13) << 16
                                  )
                                  ^ 163
                              )
                              - 45
                              + 83
                            & 65024
                        )
                        >> 9
                      | (
                            (
                                (((((var61 & 64512) >> 10 | var61 << 6) & 65528) >> 3 | ((var61 & 64512) >> 10 | var61 << 6) << 13) & 65535) >> 0
                                  | ((((var61 & 64512) >> 10 | var61 << 6) & 65528) >> 3 | ((var61 & 64512) >> 10 | var61 << 6) << 13) << 16
                              )
                              ^ 163
                          )
                          - 45
                          + 83
                        << 7
                  )
                  << 16
            )
            - 25
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
                                          (((((var61 & 64512) >> 10 | var61 << 6) & 65528) >> 3 | ((var61 & 64512) >> 10 | var61 << 6) << 13) & 65535) >> 0
                                            | ((((var61 & 64512) >> 10 | var61 << 6) & 65528) >> 3 | ((var61 & 64512) >> 10 | var61 << 6) << 13) << 16
                                        )
                                        ^ 163
                                    )
                                    - 45
                                    + 83
                                  & 65024
                              )
                              >> 9
                            | (
                                  (
                                      (((((var61 & 64512) >> 10 | var61 << 6) & 65528) >> 3 | ((var61 & 64512) >> 10 | var61 << 6) << 13) & 65535) >> 0
                                        | ((((var61 & 64512) >> 10 | var61 << 6) & 65528) >> 3 | ((var61 & 64512) >> 10 | var61 << 6) << 13) << 16
                                    )
                                    ^ 163
                                )
                                - 45
                                + 83
                              << 7
                        )
                        & 65535
                    )
                    >> 0
                  | (
                      (
                            (
                                  (
                                      (((((var61 & 64512) >> 10 | var61 << 6) & 65528) >> 3 | ((var61 & 64512) >> 10 | var61 << 6) << 13) & 65535) >> 0
                                        | ((((var61 & 64512) >> 10 | var61 << 6) & 65528) >> 3 | ((var61 & 64512) >> 10 | var61 << 6) << 13) << 16
                                    )
                                    ^ 163
                                )
                                - 45
                                + 83
                              & 65024
                          )
                          >> 9
                        | (
                              (
                                  (((((var61 & 64512) >> 10 | var61 << 6) & 65528) >> 3 | ((var61 & 64512) >> 10 | var61 << 6) << 13) & 65535) >> 0
                                    | ((((var61 & 64512) >> 10 | var61 << 6) & 65528) >> 3 | ((var61 & 64512) >> 10 | var61 << 6) << 13) << 16
                                )
                                ^ 163
                            )
                            - 45
                            + 83
                          << 7
                    )
                    << 16
              )
              - 25
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), fl.class.getClassLoader()).returnType();
      switch ((((var4 ^ 2061185655) + 443593934 - 1597440842 ^ 1873544375) + 2008720427 + 664522005 ^ 1558330154 ^ 268433784) - 1602316017 ^ 1069780481) {
        case 359596022:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 704414952:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1323008768:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 2143336586:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      wcq[(var10 + 138667888 + 1763504963 + 183640799 ^ 832830355 ^ 1546409903) - 1992322696 - 2080352022 + 1479890386 ^ 100875546 ^ 1804482283] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
