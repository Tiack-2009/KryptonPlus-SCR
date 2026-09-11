// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.MinecraftClient;

public class ux {
  // [JNT] MethodHandle dispatch table (removed)
  public static double gj(double var0, double var2) {
    return var2 * (double)/* jnt */;
  }

  public static double bk(double var0, double var2, double var4) {
    var0 = /* jnt */
    );
    double var8 = var0 * var0 * (3.0 - 2.0 * var0);
    return var2 + (var4 - var2) * var8;
  }

  public static double kap(float var0, double var1, double var3) {
    int var5 = (int)/* jnt */ * (double)var0
    );
    return var1 < var3
      ? /* jnt */var5, var3)
      : /* jnt */var5, var3);
  }

  public static double lmc(double var0, double var2, double var4) {
    return var2 + (var4 - var2) * var0;
  }

  public static double dlg(double var0, double var2, double var4, double var6) {
    return /* jnt */(1.0F - (float)/* jnt */), var0, var2
    );
  }

  public static double wja(double var0, double var2, double var4) {
    return /* jnt */
    );
  }

  public static int ii(int var0, int var1, int var2) {
    return /* jnt */
    );
  }

  public static float fif(float var0, float var1, float var2) {
    return (float)(
      (
            1.0
              - /* jnt */((float)(/* jnt */ * (double)var2)), 0.0, 1.0
              )
          )
          * (double)var0
        + /* jnt */((float)(/* jnt */ * (double)var2)), 0.0, 1.0
          )
          * (double)var1
    );
  }

  public static double vu() {
    return /* jnt */null /* jnt:encrypted */
        )
        > 0
      ? 1.0
        / (double)/* jnt */null /* jnt:encrypted */
        )
      : 1.0;
  }

  // $VF: Handled exception range with multiple entry points by splitting it
  // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
  public static double yzq(String var0) {
    int var5 = -1238810933;
    if (var0 != null && !/* jnt */) {
      var5 = 683927455 - -1825953510 ^ 1292864226;
    } else {
      var5 = 1264989979 ^ 1478908981 ^ 1046661138;
    }

    switch ((var5 + 1236148716 - 609054004 - 316167167 - 1943529941 ^ 1199615766) + 315520049) {
      case -1625151129:
        return -1.0;
      case 1133803662:
      default:
        String var1 = /* jnt */
          )
        );
        double var2 = 1.0;
        if (/* jnt */) {
          var2 = 1.0E12;
          var1 = /* jnt */ - 1
          );

          try {
            var5 = (328766058 >>> -468337099 | -877332410) & -810026938;
          } catch (NumberFormatException var10) {
            boolean var10001 = false;
            return -1.0;
          }
        } else {
          var5 = (376299236 * 227919212 | -2009054445) & -867089417;
        }

        while (true) {
          switch ((var5 - 148469829 - 683296298 ^ 217018702 ^ 1114964475) + 274556630 - 104356898) {
            case -1633438664:
              if (/* jnt */) {
                var2 = 1000.0;
                var1 = /* jnt */ - 1
                );
              }

              try {
                var5 = (328766058 >>> -468337099 | -877332410) & -810026938;
                break;
              } catch (NumberFormatException var7) {
                boolean var16 = false;
                return -1.0;
              }
            case -555723754:
              try {
                return /* jnt */ * var2;
              } catch (NumberFormatException var6) {
                boolean var15 = false;
                return -1.0;
              }
            case -498270427:
              if (/* jnt */) {
                var2 = 1.0E9;
                var1 = /* jnt */ - 1
                );

                try {
                  var5 = (328766058 >>> -468337099 | -877332410) & -810026938;
                } catch (NumberFormatException var9) {
                  boolean var14 = false;
                  return -1.0;
                }
              } else {
                var5 = (-2078719890 ^ -2078719890 | 1110324800) & 2003795528;
              }
              break;
            case 1747259928:
            default:
              if (/* jnt */) {
                var2 = 1000000.0;
                var1 = /* jnt */ - 1
                );

                try {
                  var5 = (328766058 >>> -468337099 | -877332410) & -810026938;
                } catch (NumberFormatException var8) {
                  boolean var13 = false;
                  return -1.0;
                }
              } else {
                var5 = (-517391096 | -517391096) ^ -313415000;
              }
          }
        }
    }
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 ^ 1242976658) - 429102129 ^ 521910856) - 1643329380 - 831035616 + 135139889 + 1714869883 + 1184913398 ^ 1134870365;
    MethodHandle var10000 = usg[((var10 ^ 1242976658) - 429102129 ^ 521910856) - 1643329380 - 831035616 + 135139889 + 1714869883 + 1184913398
      ^ 1134870365
      ^ 1392808162];
    if (usg[var10001 ^ 1392808162] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = -1419930510 << 1022940687 ^ -902234112; var23 < var13.length(); var23 += 398991560 << 398991560 ^ -937375743) {
        char var42 = var13.charAt(var23);
        char var47 = (char)(
          (
              (
                    (
                        (
                              (
                                    (
                                        (
                                            (
                                                  ((((var42 & '\ufff8') >> 3 | var42 << '\r') & 65532) >> 2 | ((var42 & '\ufff8') >> 3 | var42 << '\r') << 14)
                                                    & 65024
                                                )
                                                >> 9
                                              | ((((var42 & '\ufff8') >> 3 | var42 << '\r') & 65532) >> 2 | ((var42 & '\ufff8') >> 3 | var42 << '\r') << 14)
                                                << 7
                                          )
                                          ^ 164
                                      )
                                      & 65520
                                  )
                                  >> 4
                                | (
                                    (
                                        (((((var42 & '\ufff8') >> 3 | var42 << '\r') & 65532) >> 2 | ((var42 & '\ufff8') >> 3 | var42 << '\r') << 14) & 65024)
                                            >> 9
                                          | ((((var42 & '\ufff8') >> 3 | var42 << '\r') & 65532) >> 2 | ((var42 & '\ufff8') >> 3 | var42 << '\r') << 14) << 7
                                      )
                                      ^ 164
                                  )
                                  << 12
                            )
                            + 86
                            + 123
                          ^ 16
                      )
                      & 65528
                  )
                  >> 3
                | (
                    (
                          (
                                (
                                    (
                                        (((((var42 & '\ufff8') >> 3 | var42 << '\r') & 65532) >> 2 | ((var42 & '\ufff8') >> 3 | var42 << '\r') << 14) & 65024)
                                            >> 9
                                          | ((((var42 & '\ufff8') >> 3 | var42 << '\r') & 65532) >> 2 | ((var42 & '\ufff8') >> 3 | var42 << '\r') << 14) << 7
                                      )
                                      ^ 164
                                  )
                                  & 65520
                              )
                              >> 4
                            | (
                                (
                                    (((((var42 & '\ufff8') >> 3 | var42 << '\r') & 65532) >> 2 | ((var42 & '\ufff8') >> 3 | var42 << '\r') << 14) & 65024) >> 9
                                      | ((((var42 & '\ufff8') >> 3 | var42 << '\r') & 65532) >> 2 | ((var42 & '\ufff8') >> 3 | var42 << '\r') << 14) << 7
                                  )
                                  ^ 164
                              )
                              << 12
                        )
                        + 86
                        + 123
                      ^ 16
                  )
                  << 13
            )
            - 82
        );
        var13.setCharAt(
          var23,
          (char)(
            (
                (
                      (
                          (
                                (
                                      (
                                          (
                                              (
                                                    ((((var42 & '\ufff8') >> 3 | var42 << '\r') & 65532) >> 2 | ((var42 & '\ufff8') >> 3 | var42 << '\r') << 14)
                                                      & 65024
                                                  )
                                                  >> 9
                                                | ((((var42 & '\ufff8') >> 3 | var42 << '\r') & 65532) >> 2 | ((var42 & '\ufff8') >> 3 | var42 << '\r') << 14)
                                                  << 7
                                            )
                                            ^ 164
                                        )
                                        & 65520
                                    )
                                    >> 4
                                  | (
                                      (
                                          (((((var42 & '\ufff8') >> 3 | var42 << '\r') & 65532) >> 2 | ((var42 & '\ufff8') >> 3 | var42 << '\r') << 14) & 65024)
                                              >> 9
                                            | ((((var42 & '\ufff8') >> 3 | var42 << '\r') & 65532) >> 2 | ((var42 & '\ufff8') >> 3 | var42 << '\r') << 14) << 7
                                        )
                                        ^ 164
                                    )
                                    << 12
                              )
                              + 86
                              + 123
                            ^ 16
                        )
                        & 65528
                    )
                    >> 3
                  | (
                      (
                            (
                                  (
                                      (
                                          (((((var42 & '\ufff8') >> 3 | var42 << '\r') & 65532) >> 2 | ((var42 & '\ufff8') >> 3 | var42 << '\r') << 14) & 65024)
                                              >> 9
                                            | ((((var42 & '\ufff8') >> 3 | var42 << '\r') & 65532) >> 2 | ((var42 & '\ufff8') >> 3 | var42 << '\r') << 14) << 7
                                        )
                                        ^ 164
                                    )
                                    & 65520
                                )
                                >> 4
                              | (
                                  (
                                      (((((var42 & '\ufff8') >> 3 | var42 << '\r') & 65532) >> 2 | ((var42 & '\ufff8') >> 3 | var42 << '\r') << 14) & 65024)
                                          >> 9
                                        | ((((var42 & '\ufff8') >> 3 | var42 << '\r') & 65532) >> 2 | ((var42 & '\ufff8') >> 3 | var42 << '\r') << 14) << 7
                                    )
                                    ^ 164
                                )
                                << 12
                          )
                          + 86
                          + 123
                        ^ 16
                    )
                    << 13
              )
              - 82
          )
        );
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = 956256686 << -1813620456 ^ -1375731712; var29 < var16.length(); var29 += (649923561 | -60647061) ^ -16802838) {
        char var52 = var16.charAt(var29);
        char var57 = (char)(
          (
                (
                    (
                          (
                              (
                                    (
                                        (
                                              (
                                                  ((((var52 & '\ufff0') >> 4 | var52 << '\f') ^ 19) & 65520) >> 4
                                                    | (((var52 & '\ufff0') >> 4 | var52 << '\f') ^ 19) << 12
                                                )
                                                ^ 16
                                            )
                                            + 190
                                          ^ 56
                                          ^ 163
                                      )
                                      & 65535
                                  )
                                  >> 0
                                | (
                                    (
                                          (
                                              ((((var52 & '\ufff0') >> 4 | var52 << '\f') ^ 19) & 65520) >> 4
                                                | (((var52 & '\ufff0') >> 4 | var52 << '\f') ^ 19) << 12
                                            )
                                            ^ 16
                                        )
                                        + 190
                                      ^ 56
                                      ^ 163
                                  )
                                  << 16
                            )
                            & 65528
                        )
                        >> 3
                      | (
                          (
                                (
                                    (
                                          (
                                              ((((var52 & '\ufff0') >> 4 | var52 << '\f') ^ 19) & 65520) >> 4
                                                | (((var52 & '\ufff0') >> 4 | var52 << '\f') ^ 19) << 12
                                            )
                                            ^ 16
                                        )
                                        + 190
                                      ^ 56
                                      ^ 163
                                  )
                                  & 65535
                              )
                              >> 0
                            | (
                                (
                                      (((((var52 & '\ufff0') >> 4 | var52 << '\f') ^ 19) & 65520) >> 4 | (((var52 & '\ufff0') >> 4 | var52 << '\f') ^ 19) << 12)
                                        ^ 16
                                    )
                                    + 190
                                  ^ 56
                                  ^ 163
                              )
                              << 16
                        )
                        << 13
                  )
                  & 65534
              )
              >> 1
            | (
                (
                      (
                          (
                                (
                                    (
                                          (
                                              ((((var52 & '\ufff0') >> 4 | var52 << '\f') ^ 19) & 65520) >> 4
                                                | (((var52 & '\ufff0') >> 4 | var52 << '\f') ^ 19) << 12
                                            )
                                            ^ 16
                                        )
                                        + 190
                                      ^ 56
                                      ^ 163
                                  )
                                  & 65535
                              )
                              >> 0
                            | (
                                (
                                      (((((var52 & '\ufff0') >> 4 | var52 << '\f') ^ 19) & 65520) >> 4 | (((var52 & '\ufff0') >> 4 | var52 << '\f') ^ 19) << 12)
                                        ^ 16
                                    )
                                    + 190
                                  ^ 56
                                  ^ 163
                              )
                              << 16
                        )
                        & 65528
                    )
                    >> 3
                  | (
                      (
                            (
                                (
                                      (((((var52 & '\ufff0') >> 4 | var52 << '\f') ^ 19) & 65520) >> 4 | (((var52 & '\ufff0') >> 4 | var52 << '\f') ^ 19) << 12)
                                        ^ 16
                                    )
                                    + 190
                                  ^ 56
                                  ^ 163
                              )
                              & 65535
                          )
                          >> 0
                        | (
                            ((((((var52 & '\ufff0') >> 4 | var52 << '\f') ^ 19) & 65520) >> 4 | (((var52 & '\ufff0') >> 4 | var52 << '\f') ^ 19) << 12) ^ 16)
                                + 190
                              ^ 56
                              ^ 163
                          )
                          << 16
                    )
                    << 13
              )
              << 15
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
                                                (
                                                    ((((var52 & '\ufff0') >> 4 | var52 << '\f') ^ 19) & 65520) >> 4
                                                      | (((var52 & '\ufff0') >> 4 | var52 << '\f') ^ 19) << 12
                                                  )
                                                  ^ 16
                                              )
                                              + 190
                                            ^ 56
                                            ^ 163
                                        )
                                        & 65535
                                    )
                                    >> 0
                                  | (
                                      (
                                            (
                                                ((((var52 & '\ufff0') >> 4 | var52 << '\f') ^ 19) & 65520) >> 4
                                                  | (((var52 & '\ufff0') >> 4 | var52 << '\f') ^ 19) << 12
                                              )
                                              ^ 16
                                          )
                                          + 190
                                        ^ 56
                                        ^ 163
                                    )
                                    << 16
                              )
                              & 65528
                          )
                          >> 3
                        | (
                            (
                                  (
                                      (
                                            (
                                                ((((var52 & '\ufff0') >> 4 | var52 << '\f') ^ 19) & 65520) >> 4
                                                  | (((var52 & '\ufff0') >> 4 | var52 << '\f') ^ 19) << 12
                                              )
                                              ^ 16
                                          )
                                          + 190
                                        ^ 56
                                        ^ 163
                                    )
                                    & 65535
                                )
                                >> 0
                              | (
                                  (
                                        (
                                            ((((var52 & '\ufff0') >> 4 | var52 << '\f') ^ 19) & 65520) >> 4
                                              | (((var52 & '\ufff0') >> 4 | var52 << '\f') ^ 19) << 12
                                          )
                                          ^ 16
                                      )
                                      + 190
                                    ^ 56
                                    ^ 163
                                )
                                << 16
                          )
                          << 13
                    )
                    & 65534
                )
                >> 1
              | (
                  (
                        (
                            (
                                  (
                                      (
                                            (
                                                ((((var52 & '\ufff0') >> 4 | var52 << '\f') ^ 19) & 65520) >> 4
                                                  | (((var52 & '\ufff0') >> 4 | var52 << '\f') ^ 19) << 12
                                              )
                                              ^ 16
                                          )
                                          + 190
                                        ^ 56
                                        ^ 163
                                    )
                                    & 65535
                                )
                                >> 0
                              | (
                                  (
                                        (
                                            ((((var52 & '\ufff0') >> 4 | var52 << '\f') ^ 19) & 65520) >> 4
                                              | (((var52 & '\ufff0') >> 4 | var52 << '\f') ^ 19) << 12
                                          )
                                          ^ 16
                                      )
                                      + 190
                                    ^ 56
                                    ^ 163
                                )
                                << 16
                          )
                          & 65528
                      )
                      >> 3
                    | (
                        (
                              (
                                  (
                                        (
                                            ((((var52 & '\ufff0') >> 4 | var52 << '\f') ^ 19) & 65520) >> 4
                                              | (((var52 & '\ufff0') >> 4 | var52 << '\f') ^ 19) << 12
                                          )
                                          ^ 16
                                      )
                                      + 190
                                    ^ 56
                                    ^ 163
                                )
                                & 65535
                            )
                            >> 0
                          | (
                              ((((((var52 & '\ufff0') >> 4 | var52 << '\f') ^ 19) & 65520) >> 4 | (((var52 & '\ufff0') >> 4 | var52 << '\f') ^ 19) << 12) ^ 16)
                                  + 190
                                ^ 56
                                ^ 163
                            )
                            << 16
                      )
                      << 13
                )
                << 15
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), ux.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (1001530371 & 1001530371 | 0) & 4283092; var35 < var19.length(); var35 += 1691823383 - 1954116458 ^ -262293076) {
        int var62 = var19.charAt(var35);
        int var98 = (var62 & 65535) >> 0;
        int var63 = ((var62 & 65535) >> 0 | var62 << 16) + 123;
        int var99 = (((var62 & 65535) >> 0 | var62 << 16) + 123 & 65534) >> 1;
        var62 = (((var98 | var62 << 16) + 123 & 65534) >> 1 | ((var62 & 65535) >> 0 | var62 << 16) + 123 << 15) + 134;
        var98 = ((var99 | var63 << 15) + 134 & 65535) >> 0;
        int var65 = ((var99 | var63 << 15) + 134 & 65535) >> 0 | var62 << 16;
        int var101 = ((((var99 | var63 << 15) + 134 & 65535) >> 0 | var62 << 16) & 65528) >> 3;
        char var66 = (char)(((((var98 | var62 << 16) & 65528) >> 3 | (((var99 | var63 << 15) + 134 & 65535) >> 0 | var62 << 16) << 13) ^ 168) - 244 ^ 1 ^ 244);
        var19.setCharAt(var35, (char)(((var101 | var65 << 13) ^ 168) - 244 ^ 1 ^ 244));
      }

      Class var7 = Class.forName(var19.toString(), false, ux.class.getClassLoader());
      switch ((var4 + 360061198 - 1730765184 + 1274427415 ^ 2050124519 ^ 713720947 ^ 1324517466) - 185091940 + 677578882 + 1891108176 + 1229435515) {
        case 612993796:
        case 2099011022:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 706484333:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 939126049:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 1545076718:
          var10000 = var0.findSpecial(var7, var5, var6, ux.class);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    usg[((var10 ^ 1242976658) - 429102129 ^ 521910856) - 1643329380 - 831035616 + 135139889 + 1714869883 + 1184913398 ^ 1134870365 ^ 1392808162] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 + 1404905588 + 1826990113 ^ 179196284 ^ 687455555) + 1796523180 ^ 2099305075 ^ 1134791692) - 831903463 - 1425538618;
    MethodHandle var10000 = usg[((var10 + 1404905588 + 1826990113 ^ 179196284 ^ 687455555) + 1796523180 ^ 2099305075 ^ 1134791692) - 831903463 - 1425538618
      ^ 1062327033];
    if (usg[var10001 ^ 1062327033] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = 1647815775 * 1647815775 ^ 1088539457; var24 < var14.length(); var24 += -2041772208 & -2041772208 ^ -2041772207) {
        char var43 = var14.charAt(var24);
        char var48 = (char)(
          (
                (
                      (
                            (
                                (
                                      ((((((var43 & '￠') >> 5 | var43 << 11) ^ 175) & 65504) >> 5 | (((var43 & '￠') >> 5 | var43 << 11) ^ 175) << 11) ^ 62)
                                          - 66
                                          + 208
                                        & 63488
                                    )
                                    >> 11
                                  | ((((((var43 & '￠') >> 5 | var43 << 11) ^ 175) & 65504) >> 5 | (((var43 & '￠') >> 5 | var43 << 11) ^ 175) << 11) ^ 62)
                                      - 66
                                      + 208
                                    << 5
                              )
                              & 65024
                          )
                          >> 9
                        | (
                            (
                                  ((((((var43 & '￠') >> 5 | var43 << 11) ^ 175) & 65504) >> 5 | (((var43 & '￠') >> 5 | var43 << 11) ^ 175) << 11) ^ 62)
                                      - 66
                                      + 208
                                    & 63488
                                )
                                >> 11
                              | ((((((var43 & '￠') >> 5 | var43 << 11) ^ 175) & 65504) >> 5 | (((var43 & '￠') >> 5 | var43 << 11) ^ 175) << 11) ^ 62)
                                  - 66
                                  + 208
                                << 5
                          )
                          << 7
                    )
                    - 145
                  & 63488
              )
              >> 11
            | (
                  (
                        (
                            (
                                  ((((((var43 & '￠') >> 5 | var43 << 11) ^ 175) & 65504) >> 5 | (((var43 & '￠') >> 5 | var43 << 11) ^ 175) << 11) ^ 62)
                                      - 66
                                      + 208
                                    & 63488
                                )
                                >> 11
                              | ((((((var43 & '￠') >> 5 | var43 << 11) ^ 175) & 65504) >> 5 | (((var43 & '￠') >> 5 | var43 << 11) ^ 175) << 11) ^ 62)
                                  - 66
                                  + 208
                                << 5
                          )
                          & 65024
                      )
                      >> 9
                    | (
                        (
                              ((((((var43 & '￠') >> 5 | var43 << 11) ^ 175) & 65504) >> 5 | (((var43 & '￠') >> 5 | var43 << 11) ^ 175) << 11) ^ 62) - 66 + 208
                                & 63488
                            )
                            >> 11
                          | ((((((var43 & '￠') >> 5 | var43 << 11) ^ 175) & 65504) >> 5 | (((var43 & '￠') >> 5 | var43 << 11) ^ 175) << 11) ^ 62) - 66 + 208
                            << 5
                      )
                      << 7
                )
                - 145
              << 5
        );
        var14.setCharAt(
          var24,
          (char)(
            (
                  (
                        (
                              (
                                  (
                                        ((((((var43 & '￠') >> 5 | var43 << 11) ^ 175) & 65504) >> 5 | (((var43 & '￠') >> 5 | var43 << 11) ^ 175) << 11) ^ 62)
                                            - 66
                                            + 208
                                          & 63488
                                      )
                                      >> 11
                                    | ((((((var43 & '￠') >> 5 | var43 << 11) ^ 175) & 65504) >> 5 | (((var43 & '￠') >> 5 | var43 << 11) ^ 175) << 11) ^ 62)
                                        - 66
                                        + 208
                                      << 5
                                )
                                & 65024
                            )
                            >> 9
                          | (
                              (
                                    ((((((var43 & '￠') >> 5 | var43 << 11) ^ 175) & 65504) >> 5 | (((var43 & '￠') >> 5 | var43 << 11) ^ 175) << 11) ^ 62)
                                        - 66
                                        + 208
                                      & 63488
                                  )
                                  >> 11
                                | ((((((var43 & '￠') >> 5 | var43 << 11) ^ 175) & 65504) >> 5 | (((var43 & '￠') >> 5 | var43 << 11) ^ 175) << 11) ^ 62)
                                    - 66
                                    + 208
                                  << 5
                            )
                            << 7
                      )
                      - 145
                    & 63488
                )
                >> 11
              | (
                    (
                          (
                              (
                                    ((((((var43 & '￠') >> 5 | var43 << 11) ^ 175) & 65504) >> 5 | (((var43 & '￠') >> 5 | var43 << 11) ^ 175) << 11) ^ 62)
                                        - 66
                                        + 208
                                      & 63488
                                  )
                                  >> 11
                                | ((((((var43 & '￠') >> 5 | var43 << 11) ^ 175) & 65504) >> 5 | (((var43 & '￠') >> 5 | var43 << 11) ^ 175) << 11) ^ 62)
                                    - 66
                                    + 208
                                  << 5
                            )
                            & 65024
                        )
                        >> 9
                      | (
                          (
                                ((((((var43 & '￠') >> 5 | var43 << 11) ^ 175) & 65504) >> 5 | (((var43 & '￠') >> 5 | var43 << 11) ^ 175) << 11) ^ 62)
                                    - 66
                                    + 208
                                  & 63488
                              )
                              >> 11
                            | ((((((var43 & '￠') >> 5 | var43 << 11) ^ 175) & 65504) >> 5 | (((var43 & '￠') >> 5 | var43 << 11) ^ 175) << 11) ^ 62) - 66 + 208
                              << 5
                        )
                        << 7
                  )
                  - 145
                << 5
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = -497029850 & -497029850 ^ -497029850; var30 < var17.length(); var30 += 1780291215 & -680036704 ^ 1108678273) {
        int var53 = var17.charAt(var30) - 167 - 49;
        int var90 = (var53 & 61440) >> 12;
        int var54 = ((var53 & 61440) >> 12 | var53 << 4) ^ 172 ^ 214;
        int var91 = ((((var53 & 61440) >> 12 | var53 << 4) ^ 172 ^ 214) & 57344) >> 13;
        var53 = (((var90 | var53 << 4) ^ 172 ^ 214) & 57344) >> 13 | (((var53 & 61440) >> 12 | var53 << 4) ^ 172 ^ 214) << 3;
        var90 = ((var91 | var54 << 3) & 32768) >> 15;
        int var56 = (((var91 | var54 << 3) & 32768) >> 15 | var53 << 1) - 211 ^ 140;
        int var93 = (((((var91 | var54 << 3) & 32768) >> 15 | var53 << 1) - 211 ^ 140) & 63488) >> 11;
        char var57 = (char)((((var90 | var53 << 1) - 211 ^ 140) & 63488) >> 11 | ((((var91 | var54 << 3) & 32768) >> 15 | var53 << 1) - 211 ^ 140) << 5);
        var17.setCharAt(var30, (char)(var93 | var56 << 5));
      }

      Class var6 = Class.forName(var17.toString(), false, ux.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = 254769286 + 254769286 ^ 509538572; var36 < var20.length(); var36 += (-481462450 ^ 619247247 - -481462450 | 0) & 1426153953) {
        char var62 = var20.charAt(var36);
        char var65 = (char)(
          (
              (((((((var62 & 'ﾀ') >> 7 | var62 << '\t') ^ 123) & 65472) >> 6 | (((var62 & 'ﾀ') >> 7 | var62 << '\t') ^ 123) << 10) ^ 157) + 27 - 93 & 32768)
                  >> 15
                | ((((((var62 & 'ﾀ') >> 7 | var62 << '\t') ^ 123) & 65472) >> 6 | (((var62 & 'ﾀ') >> 7 | var62 << '\t') ^ 123) << 10) ^ 157) + 27 - 93 << 1
            )
            + 141
            - 2
            - 164
        );
        var20.setCharAt(
          var36,
          (char)(
            (
                (((((((var62 & 'ﾀ') >> 7 | var62 << '\t') ^ 123) & 65472) >> 6 | (((var62 & 'ﾀ') >> 7 | var62 << '\t') ^ 123) << 10) ^ 157) + 27 - 93 & 32768)
                    >> 15
                  | ((((((var62 & 'ﾀ') >> 7 | var62 << '\t') ^ 123) & 65472) >> 6 | (((var62 & 'ﾀ') >> 7 | var62 << '\t') ^ 123) << 10) ^ 157) + 27 - 93 << 1
              )
              + 141
              - 2
              - 164
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), ux.class.getClassLoader()).returnType();
      switch ((((var4 ^ 32134810) - 894285216 ^ 453021814) + 1366229531 + 405159633 ^ 287125131) + 35419302 + 1382629590 + 1320647187 ^ 2034059353) {
        case 434504786:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 441403481:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 567763885:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1162021686:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      usg[((var10 + 1404905588 + 1826990113 ^ 179196284 ^ 687455555) + 1796523180 ^ 2099305075 ^ 1134791692) - 831903463 - 1425538618 ^ 1062327033] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
