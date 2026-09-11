// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.MinecraftClient;

public abstract class po {
  public class_310 gk = /* jnt */;
  // [JNT] MethodHandle dispatch table (removed)
  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 + 1899735957 + 754412105 ^ 181638808) - 423093479 + 37122471 ^ 1627243828 ^ 292701768) + 1184572156 + 86813345;
    MethodHandle var10000 = tjm[((var10 + 1899735957 + 754412105 ^ 181638808) - 423093479 + 37122471 ^ 1627243828 ^ 292701768)
      + 1184572156
      + 86813345
      + 2015563818];
    if (tjm[var10001 + 2015563818] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = 450558719 * -1408640223 ^ -236355617; var23 < var13.length(); var23 += (371677512 | -85750979) ^ -18359428) {
        int var42 = var13.charAt(var23) + 236 ^ 109;
        int var10004 = (var42 & 61440) >> 12;
        int var43 = (var42 & 61440) >> 12 | var42 << 4;
        int var81 = (((var42 & 61440) >> 12 | var42 << 4) & 65528) >> 3;
        char var44 = (char)((((((var10004 | var42 << 4) & 65528) >> 3 | ((var42 & 61440) >> 12 | var42 << 4) << 13) ^ 50) + 9 + 74 ^ 236) + 67 - 82);
        var13.setCharAt(var23, (char)((((var81 | var43 << 13) ^ 50) + 9 + 74 ^ 236) + 67 - 82));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (-1009843931 | -454314570 | 0) & 268435464; var29 < var16.length(); var29 += (1868749987 & 1112036965 | 1) & -1207817699) {
        char var49 = var16.charAt(var29);
        char var54 = (char)(
          (
              (
                    (
                        (
                            (
                                  (
                                        (
                                              (((((var49 & '￼') >> 2 | var49 << 14) ^ 45) & 65024) >> 9 | (((var49 & '￼') >> 2 | var49 << 14) ^ 45) << 7) + 2
                                                & 65472
                                            )
                                            >> 6
                                          | (((((var49 & '￼') >> 2 | var49 << 14) ^ 45) & 65024) >> 9 | (((var49 & '￼') >> 2 | var49 << 14) ^ 45) << 7) + 2
                                            << 10
                                      )
                                      - 71
                                    & 65528
                                )
                                >> 3
                              | (
                                    ((((((var49 & '￼') >> 2 | var49 << 14) ^ 45) & 65024) >> 9 | (((var49 & '￼') >> 2 | var49 << 14) ^ 45) << 7) + 2 & 65472)
                                        >> 6
                                      | (((((var49 & '￼') >> 2 | var49 << 14) ^ 45) & 65024) >> 9 | (((var49 & '￼') >> 2 | var49 << 14) ^ 45) << 7) + 2 << 10
                                  )
                                  - 71
                                << 13
                          )
                          ^ 149
                      )
                      & 61440
                  )
                  >> 12
                | (
                    (
                        (
                              (
                                    ((((((var49 & '￼') >> 2 | var49 << 14) ^ 45) & 65024) >> 9 | (((var49 & '￼') >> 2 | var49 << 14) ^ 45) << 7) + 2 & 65472)
                                        >> 6
                                      | (((((var49 & '￼') >> 2 | var49 << 14) ^ 45) & 65024) >> 9 | (((var49 & '￼') >> 2 | var49 << 14) ^ 45) << 7) + 2 << 10
                                  )
                                  - 71
                                & 65528
                            )
                            >> 3
                          | (
                                ((((((var49 & '￼') >> 2 | var49 << 14) ^ 45) & 65024) >> 9 | (((var49 & '￼') >> 2 | var49 << 14) ^ 45) << 7) + 2 & 65472) >> 6
                                  | (((((var49 & '￼') >> 2 | var49 << 14) ^ 45) & 65024) >> 9 | (((var49 & '￼') >> 2 | var49 << 14) ^ 45) << 7) + 2 << 10
                              )
                              - 71
                            << 13
                      )
                      ^ 149
                  )
                  << 4
            )
            - 90
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
                                          (
                                                (((((var49 & '￼') >> 2 | var49 << 14) ^ 45) & 65024) >> 9 | (((var49 & '￼') >> 2 | var49 << 14) ^ 45) << 7) + 2
                                                  & 65472
                                              )
                                              >> 6
                                            | (((((var49 & '￼') >> 2 | var49 << 14) ^ 45) & 65024) >> 9 | (((var49 & '￼') >> 2 | var49 << 14) ^ 45) << 7) + 2
                                              << 10
                                        )
                                        - 71
                                      & 65528
                                  )
                                  >> 3
                                | (
                                      ((((((var49 & '￼') >> 2 | var49 << 14) ^ 45) & 65024) >> 9 | (((var49 & '￼') >> 2 | var49 << 14) ^ 45) << 7) + 2 & 65472)
                                          >> 6
                                        | (((((var49 & '￼') >> 2 | var49 << 14) ^ 45) & 65024) >> 9 | (((var49 & '￼') >> 2 | var49 << 14) ^ 45) << 7) + 2 << 10
                                    )
                                    - 71
                                  << 13
                            )
                            ^ 149
                        )
                        & 61440
                    )
                    >> 12
                  | (
                      (
                          (
                                (
                                      ((((((var49 & '￼') >> 2 | var49 << 14) ^ 45) & 65024) >> 9 | (((var49 & '￼') >> 2 | var49 << 14) ^ 45) << 7) + 2 & 65472)
                                          >> 6
                                        | (((((var49 & '￼') >> 2 | var49 << 14) ^ 45) & 65024) >> 9 | (((var49 & '￼') >> 2 | var49 << 14) ^ 45) << 7) + 2 << 10
                                    )
                                    - 71
                                  & 65528
                              )
                              >> 3
                            | (
                                  ((((((var49 & '￼') >> 2 | var49 << 14) ^ 45) & 65024) >> 9 | (((var49 & '￼') >> 2 | var49 << 14) ^ 45) << 7) + 2 & 65472)
                                      >> 6
                                    | (((((var49 & '￼') >> 2 | var49 << 14) ^ 45) & 65024) >> 9 | (((var49 & '￼') >> 2 | var49 << 14) ^ 45) << 7) + 2 << 10
                                )
                                - 71
                              << 13
                        )
                        ^ 149
                    )
                    << 4
              )
              - 90
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), po.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = 1527833689 & -77220034 ^ 1526768664; var35 < var19.length(); var35 += (-1184659960 >> 665368277 | 0) & 17) {
        int var59 = (var19.charAt(var35) ^ '\f') + 73 ^ 117 ^ 227;
        char var62 = (char)(
          ((((((var59 & 65520) >> 4 | var59 << 12) - 195 + 241 & 65408) >> 7 | ((var59 & 65520) >> 4 | var59 << 12) - 195 + 241 << 9) ^ 28) & 65528) >> 3
            | (((((var59 & 65520) >> 4 | var59 << 12) - 195 + 241 & 65408) >> 7 | ((var59 & 65520) >> 4 | var59 << 12) - 195 + 241 << 9) ^ 28) << 13
        );
        var19.setCharAt(
          var35,
          (char)(
            ((((((var59 & 65520) >> 4 | var59 << 12) - 195 + 241 & 65408) >> 7 | ((var59 & 65520) >> 4 | var59 << 12) - 195 + 241 << 9) ^ 28) & 65528) >> 3
              | (((((var59 & 65520) >> 4 | var59 << 12) - 195 + 241 & 65408) >> 7 | ((var59 & 65520) >> 4 | var59 << 12) - 195 + 241 << 9) ^ 28) << 13
          )
        );
      }

      Class var7 = Class.forName(var19.toString(), false, po.class.getClassLoader());
      switch ((((var4 + 2051041325 - 1061493880 ^ 1713216528) - 976260447 ^ 1216210956) - 925963503 ^ 1376509188 ^ 158064006 ^ 1790952557) - 688710590) {
        case 587354113:
        case 790804239:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 624625485:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 826776982:
          var10000 = var0.findSpecial(var7, var5, var6, po.class);
          break;
        case 1597231922:
          var10000 = var0.findConstructor(var7, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    tjm[((var10 + 1899735957 + 754412105 ^ 181638808) - 423093479 + 37122471 ^ 1627243828 ^ 292701768) + 1184572156 + 86813345 + 2015563818] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }
}
