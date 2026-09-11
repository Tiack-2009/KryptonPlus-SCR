// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.World;
import net.minecraft.BlockState;
import net.minecraft.class_2791;
import net.minecraft.class_2826;
import net.minecraft.MinecraftClient;

public class kh {
  public class_1937 kc = null /* jnt:encrypted */null /* jnt:encrypted */
  );
  public class_2791 s;
  // [JNT] MethodHandle dispatch table (removed)
  public class_2680 pw(int var1, int var2, int var3) {
    int var8 = -1217298550;
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

      var8 = (-1800759897 + -1800759897 | 891947026) & -1221621733;

      while (true) {
        switch ((var8 + 1123998839 + 1938952995 ^ 440628849) - 495191005 + 636105831 ^ 371359669) {
          case -331297286:
          default:
            if (var6 == null) {
              return /* jnt */
              );
            }

            var8 = -2130120287 + -1402329474 ^ 1085311116;
            break;
          case 1348229459:
            class_2826 var7 = /* jnt */[/* jnt */];
            if (var7 == null) {
              return /* jnt */
              );
            } else {
              null /* jnt:encrypted */;
              return /* jnt */;
            }
        }
      }
    }
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 ^ 441497549 ^ 455365222) - 2137805390 ^ 1934644597 ^ 930447374) + 1314203034 - 724430269 - 910303391 + 1164795517;
    MethodHandle var10000 = zer[((var10 ^ 441497549 ^ 455365222) - 2137805390 ^ 1934644597 ^ 930447374)
      + 1314203034
      - 724430269
      - 910303391
      + 1164795517
      + 1507659011];
    if (zer[var10001 + 1507659011] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (2044725843 + (2044725843 & 2044725843) | 0) & 136112193; var23 < var13.length(); var23 += (727705235 * 727705235 | 1) & 537428613) {
        int var42 = var13.charAt(var23);
        int var10004 = (var42 & 65532) >> 2;
        int var43 = (((var42 & 65532) >> 2 | var42 << 14) ^ 93) + 31 - 134;
        int var89 = ((((var42 & 65532) >> 2 | var42 << 14) ^ 93) + 31 - 134 & 65504) >> 5;
        var42 = (((((var10004 | var42 << 14) ^ 93) + 31 - 134 & 65504) >> 5 | (((var42 & 65532) >> 2 | var42 << 14) ^ 93) + 31 - 134 << 11) ^ 200) + 219 + 73;
        var10004 = (((var89 | var43 << 11) ^ 200) + 219 + 73 & 57344) >> 13;
        int var45 = (((var89 | var43 << 11) ^ 200) + 219 + 73 & 57344) >> 13 | var42 << 3;
        int var91 = (((((var89 | var43 << 11) ^ 200) + 219 + 73 & 57344) >> 13 | var42 << 3) & 65504) >> 5;
        char var46 = (char)(((var10004 | var42 << 3) & 65504) >> 5 | ((((var89 | var43 << 11) ^ 200) + 219 + 73 & 57344) >> 13 | var42 << 3) << 11);
        var13.setCharAt(var23, (char)(var91 | var45 << 11));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (-1536028624 ^ 701577739 * -1104696365 | 0) & 539008284;
        var29 < var16.length();
        var29 += (43256733 ^ 1690798399 << 1690798399 | 0) & 492961827
      ) {
        char var51 = var16.charAt(var29);
        char var56 = (char)(
          (
              (
                  (
                        (
                            (
                                (
                                      (
                                          (
                                                (((((var51 & '\uf800') >> 11 | var51 << 5) & 32768) >> 15 | ((var51 & '\uf800') >> 11 | var51 << 5) << 1) ^ 90)
                                                  & 64512
                                              )
                                              >> 10
                                            | (((((var51 & '\uf800') >> 11 | var51 << 5) & 32768) >> 15 | ((var51 & '\uf800') >> 11 | var51 << 5) << 1) ^ 90)
                                              << 6
                                        )
                                        & 65532
                                    )
                                    >> 2
                                  | (
                                      ((((((var51 & '\uf800') >> 11 | var51 << 5) & 32768) >> 15 | ((var51 & '\uf800') >> 11 | var51 << 5) << 1) ^ 90) & 64512)
                                          >> 10
                                        | (((((var51 & '\uf800') >> 11 | var51 << 5) & 32768) >> 15 | ((var51 & '\uf800') >> 11 | var51 << 5) << 1) ^ 90) << 6
                                    )
                                    << 14
                              )
                              ^ 10
                          )
                          & 61440
                      )
                      >> 12
                    | (
                        (
                            (
                                  (
                                      ((((((var51 & '\uf800') >> 11 | var51 << 5) & 32768) >> 15 | ((var51 & '\uf800') >> 11 | var51 << 5) << 1) ^ 90) & 64512)
                                          >> 10
                                        | (((((var51 & '\uf800') >> 11 | var51 << 5) & 32768) >> 15 | ((var51 & '\uf800') >> 11 | var51 << 5) << 1) ^ 90) << 6
                                    )
                                    & 65532
                                )
                                >> 2
                              | (
                                  ((((((var51 & '\uf800') >> 11 | var51 << 5) & 32768) >> 15 | ((var51 & '\uf800') >> 11 | var51 << 5) << 1) ^ 90) & 64512)
                                      >> 10
                                    | (((((var51 & '\uf800') >> 11 | var51 << 5) & 32768) >> 15 | ((var51 & '\uf800') >> 11 | var51 << 5) << 1) ^ 90) << 6
                                )
                                << 14
                          )
                          ^ 10
                      )
                      << 4
                )
                ^ 246
            )
            - 126
            + 85
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
                                                  (
                                                      ((((var51 & '\uf800') >> 11 | var51 << 5) & 32768) >> 15 | ((var51 & '\uf800') >> 11 | var51 << 5) << 1)
                                                        ^ 90
                                                    )
                                                    & 64512
                                                )
                                                >> 10
                                              | (((((var51 & '\uf800') >> 11 | var51 << 5) & 32768) >> 15 | ((var51 & '\uf800') >> 11 | var51 << 5) << 1) ^ 90)
                                                << 6
                                          )
                                          & 65532
                                      )
                                      >> 2
                                    | (
                                        (
                                              (((((var51 & '\uf800') >> 11 | var51 << 5) & 32768) >> 15 | ((var51 & '\uf800') >> 11 | var51 << 5) << 1) ^ 90)
                                                & 64512
                                            )
                                            >> 10
                                          | (((((var51 & '\uf800') >> 11 | var51 << 5) & 32768) >> 15 | ((var51 & '\uf800') >> 11 | var51 << 5) << 1) ^ 90)
                                            << 6
                                      )
                                      << 14
                                )
                                ^ 10
                            )
                            & 61440
                        )
                        >> 12
                      | (
                          (
                              (
                                    (
                                        (
                                              (((((var51 & '\uf800') >> 11 | var51 << 5) & 32768) >> 15 | ((var51 & '\uf800') >> 11 | var51 << 5) << 1) ^ 90)
                                                & 64512
                                            )
                                            >> 10
                                          | (((((var51 & '\uf800') >> 11 | var51 << 5) & 32768) >> 15 | ((var51 & '\uf800') >> 11 | var51 << 5) << 1) ^ 90)
                                            << 6
                                      )
                                      & 65532
                                  )
                                  >> 2
                                | (
                                    ((((((var51 & '\uf800') >> 11 | var51 << 5) & 32768) >> 15 | ((var51 & '\uf800') >> 11 | var51 << 5) << 1) ^ 90) & 64512)
                                        >> 10
                                      | (((((var51 & '\uf800') >> 11 | var51 << 5) & 32768) >> 15 | ((var51 & '\uf800') >> 11 | var51 << 5) << 1) ^ 90) << 6
                                  )
                                  << 14
                            )
                            ^ 10
                        )
                        << 4
                  )
                  ^ 246
              )
              - 126
              + 85
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), kh.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (-938193328 + -938193328 | 0) & 1762992136; var35 < var19.length(); var35 += -1638848109 * 624940687 ^ -1035724004) {
        int var61 = var19.charAt(var35) - 189;
        char var66 = (char)(
          (
              (
                    (
                        (
                              (
                                  (
                                        (
                                              (((((var61 & 65024) >> 9 | var61 << 7) ^ 253) & 63488) >> 11 | (((var61 & 65024) >> 9 | var61 << 7) ^ 253) << 5)
                                                & 61440
                                            )
                                            >> 12
                                          | (((((var61 & 65024) >> 9 | var61 << 7) ^ 253) & 63488) >> 11 | (((var61 & 65024) >> 9 | var61 << 7) ^ 253) << 5)
                                            << 4
                                      )
                                      + 208
                                    ^ 207
                                )
                                & 49152
                            )
                            >> 14
                          | (
                              (
                                    ((((((var61 & 65024) >> 9 | var61 << 7) ^ 253) & 63488) >> 11 | (((var61 & 65024) >> 9 | var61 << 7) ^ 253) << 5) & 61440)
                                        >> 12
                                      | (((((var61 & 65024) >> 9 | var61 << 7) ^ 253) & 63488) >> 11 | (((var61 & 65024) >> 9 | var61 << 7) ^ 253) << 5) << 4
                                  )
                                  + 208
                                ^ 207
                            )
                            << 2
                      )
                      & 65408
                  )
                  >> 7
                | (
                    (
                          (
                              (
                                    ((((((var61 & 65024) >> 9 | var61 << 7) ^ 253) & 63488) >> 11 | (((var61 & 65024) >> 9 | var61 << 7) ^ 253) << 5) & 61440)
                                        >> 12
                                      | (((((var61 & 65024) >> 9 | var61 << 7) ^ 253) & 63488) >> 11 | (((var61 & 65024) >> 9 | var61 << 7) ^ 253) << 5) << 4
                                  )
                                  + 208
                                ^ 207
                            )
                            & 49152
                        )
                        >> 14
                      | (
                          (
                                ((((((var61 & 65024) >> 9 | var61 << 7) ^ 253) & 63488) >> 11 | (((var61 & 65024) >> 9 | var61 << 7) ^ 253) << 5) & 61440)
                                    >> 12
                                  | (((((var61 & 65024) >> 9 | var61 << 7) ^ 253) & 63488) >> 11 | (((var61 & 65024) >> 9 | var61 << 7) ^ 253) << 5) << 4
                              )
                              + 208
                            ^ 207
                        )
                        << 2
                  )
                  << 9
            )
            ^ 114
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
                                                (((((var61 & 65024) >> 9 | var61 << 7) ^ 253) & 63488) >> 11 | (((var61 & 65024) >> 9 | var61 << 7) ^ 253) << 5)
                                                  & 61440
                                              )
                                              >> 12
                                            | (((((var61 & 65024) >> 9 | var61 << 7) ^ 253) & 63488) >> 11 | (((var61 & 65024) >> 9 | var61 << 7) ^ 253) << 5)
                                              << 4
                                        )
                                        + 208
                                      ^ 207
                                  )
                                  & 49152
                              )
                              >> 14
                            | (
                                (
                                      ((((((var61 & 65024) >> 9 | var61 << 7) ^ 253) & 63488) >> 11 | (((var61 & 65024) >> 9 | var61 << 7) ^ 253) << 5) & 61440)
                                          >> 12
                                        | (((((var61 & 65024) >> 9 | var61 << 7) ^ 253) & 63488) >> 11 | (((var61 & 65024) >> 9 | var61 << 7) ^ 253) << 5) << 4
                                    )
                                    + 208
                                  ^ 207
                              )
                              << 2
                        )
                        & 65408
                    )
                    >> 7
                  | (
                      (
                            (
                                (
                                      ((((((var61 & 65024) >> 9 | var61 << 7) ^ 253) & 63488) >> 11 | (((var61 & 65024) >> 9 | var61 << 7) ^ 253) << 5) & 61440)
                                          >> 12
                                        | (((((var61 & 65024) >> 9 | var61 << 7) ^ 253) & 63488) >> 11 | (((var61 & 65024) >> 9 | var61 << 7) ^ 253) << 5) << 4
                                    )
                                    + 208
                                  ^ 207
                              )
                              & 49152
                          )
                          >> 14
                        | (
                            (
                                  ((((((var61 & 65024) >> 9 | var61 << 7) ^ 253) & 63488) >> 11 | (((var61 & 65024) >> 9 | var61 << 7) ^ 253) << 5) & 61440)
                                      >> 12
                                    | (((((var61 & 65024) >> 9 | var61 << 7) ^ 253) & 63488) >> 11 | (((var61 & 65024) >> 9 | var61 << 7) ^ 253) << 5) << 4
                                )
                                + 208
                              ^ 207
                          )
                          << 2
                    )
                    << 9
              )
              ^ 114
          )
        );
      }

      Class var7 = Class.forName(var19.toString(), false, kh.class.getClassLoader());
      switch ((((var4 ^ 821671177) - 1212455377 ^ 153696150) - 1363087423 + 1175222612 - 2019462174 ^ 1178536844 ^ 897074713 ^ 1349268849) - 1925054330) {
        case 357077893:
        case 2055604242:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1184335411:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 1359773675:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 2071955708:
          var10000 = var0.findSpecial(var7, var5, var6, kh.class);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    zer[((var10 ^ 441497549 ^ 455365222) - 2137805390 ^ 1934644597 ^ 930447374) + 1314203034 - 724430269 - 910303391 + 1164795517 + 1507659011] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = var10 + 999866738 + 1712924980 - 801140022 - 980637720 + 1467691478 - 970468725 - 2123646874 + 1114861923 + 156868075;
    MethodHandle var10000 = zer[var10
      + 999866738
      + 1712924980
      - 801140022
      - 980637720
      + 1467691478
      - 970468725
      - 2123646874
      + 1114861923
      + 156868075
      - 138408044];
    if (zer[var10001 - 138408044] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (-1730019338 * (-299275463 - -1730019338) | 0) & 1241514129; var24 < var14.length(); var24 += (-162893136 - -928568952 | 1) & 1075348161) {
        int var43 = ((var14.charAt(var24) ^ '9') - 130 ^ 164) - 93;
        char var46 = (char)(
          (
              (((((var43 & 65408) >> 7 | var43 << 9) - 159 & 65024) >> 9 | ((var43 & 65408) >> 7 | var43 << 9) - 159 << 7) - 132 & 65408) >> 7
                | ((((var43 & 65408) >> 7 | var43 << 9) - 159 & 65024) >> 9 | ((var43 & 65408) >> 7 | var43 << 9) - 159 << 7) - 132 << 9
            )
            ^ 181
        );
        var14.setCharAt(
          var24,
          (char)(
            (
                (((((var43 & 65408) >> 7 | var43 << 9) - 159 & 65024) >> 9 | ((var43 & 65408) >> 7 | var43 << 9) - 159 << 7) - 132 & 65408) >> 7
                  | ((((var43 & 65408) >> 7 | var43 << 9) - 159 & 65024) >> 9 | ((var43 & 65408) >> 7 | var43 << 9) - 159 << 7) - 132 << 9
              )
              ^ 181
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (1148170684 + 1148170684 | 0) & 805309446; var30 < var17.length(); var30 += -738399374 >> -738399374 ^ -2818) {
        int var51 = ((var17.charAt(var30) ^ 138) - 77 ^ 61) - 97 + 174;
        int var80 = (var51 & 61440) >> 12;
        int var52 = ((var51 & 61440) >> 12 | var51 << 4) ^ 89;
        int var81 = ((((var51 & 61440) >> 12 | var51 << 4) ^ 89) & 65534) >> 1;
        char var53 = (char)((((((var80 | var51 << 4) ^ 89) & 65534) >> 1 | (((var51 & 61440) >> 12 | var51 << 4) ^ 89) << 15) ^ 234) - 195);
        var17.setCharAt(var30, (char)(((var81 | var52 << 15) ^ 234) - 195));
      }

      Class var6 = Class.forName(var17.toString(), false, kh.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = -1506631338 >> -1506631338 ^ -360; var36 < var20.length(); var36 += (-1456156236 << 1599718998 | 1) & -1828816261) {
        char var58 = var20.charAt(var36);
        char var61 = (char)(
          (
                (
                    ((((var58 & '\uf800') >> 11 | var58 << 5) & 65520) >> 4 | ((var58 & '\uf800') >> 11 | var58 << 5) << 12) + 249 - 181 - 227 - 148 - 32 - 203
                      ^ 94
                  )
                  & 57344
              )
              >> 13
            | (((((var58 & '\uf800') >> 11 | var58 << 5) & 65520) >> 4 | ((var58 & '\uf800') >> 11 | var58 << 5) << 12) + 249 - 181 - 227 - 148 - 32 - 203 ^ 94)
              << 3
        );
        var20.setCharAt(
          var36,
          (char)(
            (
                  (
                      ((((var58 & '\uf800') >> 11 | var58 << 5) & 65520) >> 4 | ((var58 & '\uf800') >> 11 | var58 << 5) << 12)
                          + 249
                          - 181
                          - 227
                          - 148
                          - 32
                          - 203
                        ^ 94
                    )
                    & 57344
                )
                >> 13
              | (
                  ((((var58 & '\uf800') >> 11 | var58 << 5) & 65520) >> 4 | ((var58 & '\uf800') >> 11 | var58 << 5) << 12) + 249 - 181 - 227 - 148 - 32 - 203
                    ^ 94
                )
                << 3
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), kh.class.getClassLoader()).returnType();
      switch ((((var4 + 301906112 + 658344686 ^ 964010001) + 1907059220 ^ 1634431294) - 1178218836 ^ 872488163) + 1956223265 - 1414179961 + 769072428) {
        case 219438316:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 551858370:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1080123610:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1844119558:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      zer[var10 + 999866738 + 1712924980 - 801140022 - 980637720 + 1467691478 - 970468725 - 2123646874 + 1114861923 + 156868075 - 138408044] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
