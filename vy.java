// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.class_11905;
import net.minecraft.class_11908;
import net.minecraft.Identifier;
import net.minecraft.DrawContext;
import net.minecraft.class_437;

public class vy extends class_437 implements yh {
  public yuw aaz;
  public int re;
  public int tk;
  public int zms;
  public int pc;
  public int bac;
  public String vjy;
  public List dlg;
  public int bj;
  // [JNT] MethodHandle dispatch table (removed)
  public vy(au var1, yuw var2) {
    this.spl = var1;
    super(
      /* jnt */
    );
    this.re = 3;
    this.tk = 10;
    this.zms = 190;
    this.pc = 30;
    this.bac = 10;
    this.vjy = "";
    this.bj = 0;
    this.aaz = var2;
    this.dlg = (ArrayList)/* jnt */
    );
  }

  public void method_25394(class_332 var1, int var2, int var3, float var4) {
    int var35 = 193472922;
    /* jnt */;
    var2 *= /* jnt */)
      )
    );
    var3 *= /* jnt */)
      )
    );
    /* jnt */;
    /* jnt */)
        )
      ),
      /* jnt */)
        )
      ),
      /* jnt *//* jnt */) ? 180 : 0
        )
      )
    );
    int var5 = /* jnt */)
      )
    );
    int var6 = /* jnt */)
      )
    );
    short var7 = 650;
    short var8 = 550;
    int var9 = (var5 - var7) / 2;
    int var10 = (var6 - var8) / 2;
    /* jnt *//* jnt */,
      (double)var9,
      (double)var10,
      (double)(var9 + var7),
      (double)(var10 + var8),
      8.0,
      8.0,
      8.0,
      8.0
    );
    /* jnt *//* jnt */,
      (double)var9,
      (double)var10,
      (double)(var9 + var7),
      (double)(var10 + 30),
      8.0,
      8.0,
      0.0,
      0.0
    );
    /* jnt */)
    );
    int var10000 = -240404323 & 573623348 & -356273322 ^ 536903700;

    StringBuilder var10001;
    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < ((147946689 >> -1833054759 | 19) & -1849497221);
      var10000 += (-587861459 * -443898974 | 1) & 1105723397
    ) {
      int var73 = (
            /* jnt */
              ^ 28
          )
          - 166
        ^ 218;
      int var10004 = (var73 & 65408) >> 7;
      int var74 = (var73 & 65408) >> 7 | var73 << 9;
      int var119 = (((var73 & 65408) >> 7 | var73 << 9) & 65534) >> 1;
      char var75 = (char)(((var10004 | var73 << 9) & 65534) >> 1 | ((var73 & 65408) >> 7 | var73 << 9) << 15);
      /* jnt */(var119 | var74 << 15)
      );
    }

    /* jnt */,
      var1,
      var9 + var7 / 2,
      var10 + 8,
      /* jnt *//* jnt */)
    );
    int var11 = var9 + 20;
    int var12 = var10 + 50;
    int var13 = var7 - 40;
    byte var14 = 30;
    /* jnt *//* jnt */,
      (double)var11,
      (double)var12,
      (double)(var11 + var13),
      (double)(var12 + var14),
      5.0,
      5.0,
      5.0,
      5.0
    );
    /* jnt *//* jnt */,
      (double)var11,
      (double)var12,
      (double)(var11 + var13),
      (double)(var12 + var14),
      5.0,
      5.0,
      5.0,
      5.0,
      1.0
    );
    String var57 = null /* jnt:encrypted */;
    String var34 = /* jnt */ % 1000L > 500L
      ? "|"
      : "";
    String var33 = var57;
    StringBuilder var58 = (StringBuilder)/* jnt */;
    int var64 = (857152778 * 857152778 | 0) & -936857447;

    StringBuilder var77;
    for (var77 = (StringBuilder)/* jnt */;
      var64 < ((1531876938 & 1531876938 | 0) & -1610547064);
      var64 += 1315347914 - 1203942636 ^ 111405279
    ) {
      int var106 = /* jnt */
        - 7
        - 221
        - 39;
      char var107 = (char)(((var106 & 65535) >> 0 | var106 << 16) + 86);
      /* jnt */(((var106 & 65535) >> 0 | var106 << 16) + 86)
      );
    }

    /* jnt */
            ),
            var33
          ),
          var34
        )
      ),
      var1,
      var11 + 10,
      var12 + 9,
      /* jnt *//* jnt */)
    );
    int var15 = var9 + 20;
    int var16 = var12 + var14 + 15;
    int var17 = var7 - 40;
    int var18 = var8 - (var16 - var10) - 60;
    /* jnt *//* jnt */,
      (double)var15,
      (double)var16,
      (double)(var15 + var17),
      (double)(var16 + var18),
      5.0,
      5.0,
      5.0,
      5.0
    );
    int var19 = (int)/* jnt *//* jnt */
        )
        / 3.0
    );
    int var20 = /* jnt */;
    null /* jnt:encrypted */
    );
    if (var19 > 10) {
      byte var21 = 6;
      int var22 = var15 + var17 - var21 - 5;
      int var23 = var16 + 5;
      int var24 = var18 - 10;
      /* jnt *//* jnt */,
        (double)var22,
        (double)var23,
        (double)(var22 + var21),
        (double)(var23 + var24),
        3.0,
        3.0,
        3.0,
        3.0
      );
      float var25 = (float)null /* jnt:encrypted */ / (float)var20;
      float var26 = /* jnt */var24 * (10.0F / (float)var19)
      );
      int var27 = var23 + (int)(((float)var24 - var26) * var25);
      /* jnt */,
        (double)var22,
        (double)var27,
        (double)(var22 + var21),
        (double)((float)var27 + var26),
        3.0,
        3.0,
        3.0,
        3.0
      );
    }

    int var38 = /* jnt */
      ),
      30
    );
    int var39 = null /* jnt:encrypted */ * 3;
    int var40 = /* jnt */
      )
    );
    int var41 = var39;

    label134:
    while (true) {
      var35 = (1985476334 >>> (1994258539 << (1985476334 | 1994258539)) | 180371728) & 1255165714;

      while (true) {
        switch ((var35 ^ 1962245626) + 1786390509 - 209309693 - 194469872 - 720460552 + 1791703367) {
          case -1829326528:
            var41 = var10 + var8 - 45;
            byte var44 = 80;
            byte var46 = 30;
            int var48 = var9 + var7 - var44 - 20;
            int var49 = var48 - var44 - 10;
            int var50 = var49 - var44 - 10;
            int var51 = var50 - var44 - 10;
            /* jnt */,
              (double)var48,
              (double)var41,
              (double)(var48 + var44),
              (double)(var41 + var46),
              5.0,
              5.0,
              5.0,
              5.0
            );
            var10000 = -258542671 + (1535004299 >>> 1074394294) ^ -258542306;
            var10001 = (StringBuilder)/* jnt */;

            label106:
            while (true) {
              var35 = -2144019401 << (-683044203 ^ -392070734) ^ 1661594123;

              while (true) {
                label102:
                while (true) {
                  label100:
                  while (true) {
                    label98: {
                      StringBuilder var62;
                      switch ((var35 - 907204290 ^ 523295376) - 1277411751 + 1796894853 + 1338688772 ^ 1751632226) {
                        case -1556021927:
                          var62 = var10001;
                          if (var10000 < (1269110134 + 1800344434 ^ -1225512724)) {
                            int var101 = /* jnt */
                              - 'q'
                              + 63;
                            char var102 = (char)(((var101 & 65504) >> 5 | var101 << 11) + 208 - 61);
                            /* jnt */(((var101 & 65504) >> 5 | var101 << 11) + 208 - 61)
                            );
                            var10000 += (1927150991 - (-1312913596 & -1312913596) | 0) & 14712849;
                            continue label106;
                          }

                          var35 = (-1152642505 + 1710466508 * 1710466508 | 151146512) & 185071633;
                          break;
                        case -1428796198:
                          var62 = var10001;
                          if (var10000 < ((463044163 >>> 1081481586 | 1) & -1869432571)) {
                            int var96 = /* jnt */
                              + '|';
                            int var128 = (var96 & 0) >> 16;
                            int var97 = ((var96 & 0) >> 16 | var96 << 0) - 200 + 127;
                            int var129 = (((var96 & 0) >> 16 | var96 << 0) - 200 + 127 & 0) >> 16;
                            char var98 = (char)(((var128 | var96 << 0) - 200 + 127 & 0) >> 16 | ((var96 & 0) >> 16 | var96 << 0) - 200 + 127 << 0);
                            /* jnt */(var129 | var97 << 0)
                            );
                            var10000 += (2136110560 | 1168685589) ^ 2147155956;
                            break label102;
                          }

                          var35 = -916041480 & (-699874497 ^ -699874497) ^ 1607785040;
                          break;
                        case -1373222359:
                        default:
                          var62 = var10001;
                          if (var10000 < (973933770 + 973933770 ^ 1947867537)) {
                            char var92 = /* jnt */;
                            char var93 = (char)((((var92 & '︀') >> 9 | var92 << 7) ^ 201) - 22 - 213 + 69);
                            /* jnt */((((var92 & '︀') >> 9 | var92 << 7) ^ 201) - 22 - 213 + 69)
                            );
                            var10000 += 837812055 ^ -141226536 ^ -965021042;
                            break label98;
                          }

                          var35 = -1001120 + 1968456204 ^ 1656379104;
                          break;
                        case 1707676071:
                          var62 = var10001;
                          if (var10000 < ((1254929205 >>> 1769416810 | 2) & 1213008967)) {
                            char var87 = /* jnt */;
                            int var125 = (var87 & '쀀') >> 14;
                            int var88 = ((var87 & '쀀') >> 14 | var87 << 2) ^ 184;
                            int var126 = ((((var87 & '쀀') >> 14 | var87 << 2) ^ 184) & 65472) >> 6;
                            char var89 = (char)(((((var125 | var87 << 2) ^ 184) & 65472) >> 6 | (((var87 & '쀀') >> 14 | var87 << 2) ^ 184) << 10) ^ 106 ^ 105);
                            /* jnt */((var126 | var88 << 10) ^ 106 ^ 105)
                            );
                            var10000 += -2022380363 ^ -604289073 ^ 1552919419;
                            break label100;
                          }

                          var35 = -768660661 << 292018967 ^ 365376712;
                      }

                      switch (var35 + 1157982097 + 809226545 + 1531929766 + 457055834 + 1093281941 - 1613825456) {
                        case -674310472:
                        default:
                          /* jnt */,
                            var1,
                            var48 + var44 / 2,
                            var41 + 8,
                            /* jnt *//* jnt */
                            )
                          );
                          /* jnt *//* jnt */,
                            (double)var49,
                            (double)var41,
                            (double)(var49 + var44),
                            (double)(var41 + var46),
                            5.0,
                            5.0,
                            5.0,
                            5.0
                          );
                          var10000 = (2135335238 >> 2058479183 | 0) & 518324530;
                          var10001 = (StringBuilder)/* jnt */;
                          break label100;
                        case -456750029:
                          /* jnt */,
                            var1,
                            var51 + var44 / 2,
                            var41 + 8,
                            /* jnt *//* jnt */
                            )
                          );
                          /* jnt */;
                          return;
                        case 748468471:
                          /* jnt */,
                            var1,
                            var50 + var44 / 2,
                            var41 + 8,
                            /* jnt *//* jnt */
                            )
                          );
                          /* jnt *//* jnt */,
                            (double)var51,
                            (double)var41,
                            (double)(var51 + var44),
                            (double)(var41 + var46),
                            5.0,
                            5.0,
                            5.0,
                            5.0
                          );
                          var10000 = (-189008863 - -1987460560 | 0) & -1807118848;
                          var10001 = (StringBuilder)/* jnt */;
                          break;
                        case 2098140015:
                          /* jnt */,
                            var1,
                            var49 + var44 / 2,
                            var41 + 8,
                            /* jnt *//* jnt */
                            )
                          );
                          /* jnt *//* jnt */,
                            (double)var50,
                            (double)var41,
                            (double)(var50 + var44),
                            (double)(var41 + var46),
                            5.0,
                            5.0,
                            5.0,
                            5.0
                          );
                          var10000 = (1739275728 - (-1368019067 >> -1368019067) | 0) & 365454721;
                          var10001 = (StringBuilder)/* jnt */;
                          break label102;
                      }
                    }

                    var35 = 533588325 & 146406672 ^ 1984579003;
                  }

                  var35 = 1067070437 >> (-1778123544 >>> (1067070437 >>> -1778123544)) ^ -2006276400;
                }

                var35 = -1633246548 >> -1321383427 ^ 2100059636;
              }
            }
          case -1378440756:
            if (/* jnt */
            )) {
              var10000 = (-137420977 - -1023932900 | 0) & -2128559488;

              for (var10001 = (StringBuilder)/* jnt */;
                var10000 < ((-1041747731 | -129576743 | 5) & 68117);
                var10000 += -112874902 * 827959585 ^ -1470828117
              ) {
                char var80 = /* jnt */;
                int var121 = (var80 & '\ufff0') >> 4;
                int var81 = ((var80 & '\ufff0') >> 4 | var80 << '\f') - 57;
                int var122 = (((var80 & '\ufff0') >> 4 | var80 << '\f') - 57 & 57344) >> 13;
                int var82 = ((var121 | var80 << '\f') - 57 & 57344) >> 13 | ((var80 & '\ufff0') >> 4 | var80 << '\f') - 57 << 3;
                var121 = ((var122 | var81 << 3) & 65472) >> 6;
                int var83 = ((var122 | var81 << 3) & 65472) >> 6 | var82 << 10;
                int var124 = ((((var122 | var81 << 3) & 65472) >> 6 | var82 << 10) & 65534) >> 1;
                char var84 = (char)(((var121 | var82 << 10) & 65534) >> 1 | (((var122 | var81 << 3) & 65472) >> 6 | var82 << 10) << 15);
                /* jnt */(var124 | var83 << 15)
                );
              }

              /* jnt */,
                var1,
                var15 + var17 / 2,
                var16 + var18 / 2 - 10,
                /* jnt *//* jnt */)
              );
            }

            var35 = (1669296515 + 1888070928 | 877045480) & 2102831099;
            break;
          case -798486233:
          default:
            if (var41 < var40) {
              int var43 = (var41 - var39) / 3;
              int var45 = (var41 - var39) % 3;
              int var47 = var15 + 5 + var45 * 200;
              int var28 = var16 + 5 + var43 * 40;
              lb var29 = (lb)/* jnt */, var41
              );
              boolean var30 = /* jnt */, var29);
              zn var31 = var30
                ? /* jnt */
                : (zn)/* jnt */;
              /* jnt */var47, (double)var28, (double)(var47 + 190), (double)(var28 + 30), 4.0, 4.0, 4.0, 4.0
              );
              String var32 = /* jnt */;
              /* jnt *//* jnt */)
              );
              if (var30) {
                /* jnt *//* jnt */,
                  (double)(var47 + 2),
                  (double)(var28 + 2),
                  (double)(var47 + 190 - 2),
                  (double)(var28 + 30 - 2),
                  4.0,
                  4.0,
                  4.0,
                  4.0
                );
              }

              var35 = (220774442 + -1475228319 | 594870822) & -268582090;

              while (true) {
                switch ((var35 + 1746894575 - 606074986 ^ 1730643197) + 1375243593 - 1540980423 + 1288707154) {
                  case -817252310:
                  default:
                    if (var2 >= var47 && var2 <= var47 + 190 && var3 >= var28 && var3 <= var28 + 30) {
                      /* jnt */,
                        (double)var47,
                        (double)var28,
                        (double)(var47 + 190),
                        (double)(var28 + 30),
                        4.0,
                        4.0,
                        4.0,
                        4.0,
                        1.0
                      );
                    }

                    var35 = 1261573198 >>> -492692018 ^ -1315058101;
                    break;
                  case -710207287:
                    var41++;
                    continue label134;
                }
              }
            }

            var35 = 1150531744 >>> 1150531744 ^ 737482455;
        }
      }
    }
  }

  public boolean method_25402(class_11909 var1, boolean var2) {
    int var30 = 2064078749;
    int var3 = /* jnt */
    );
    int var4 = /* jnt */
    );
    int var5 = /* jnt */)
      )
    );
    int var6 = /* jnt */)
      )
    );
    short var7 = 650;
    short var8 = 550;
    int var9 = (var5 - var7) / 2;
    int var10 = (var6 - var8) / 2;
    int var11 = var10 + var8 - 45;
    byte var12 = 80;
    byte var13 = 30;
    int var14 = var9 + var7 - var12 - 20;
    int var15 = var14 - var12 - 10;
    int var16 = var15 - var12 - 10;
    int var17 = var16 - var12 - 10;
    if (/* jnt */var3, (double)var4, var14, var11, var12, var13)) {
      /* jnt */),
        (yva)null /* jnt:encrypted */null /* jnt:encrypted */)
      );
      return true;
    } else {
      var30 = 557264518 - 557264518 ^ -153305338;

      while (true) {
        switch ((var30 - 60403080 ^ 1301744523 ^ 1154896150 ^ 168186439 ^ 37357107) + 1895300704) {
          case -1085800130:
            int var18 = var9 + 20;
            int var19 = var10 + 50 + 30 + 15;
            int var20 = var7 - 40;
            int var21 = var8 - (var19 - var10) - 60;
            if (/* jnt */var3, (double)var4, var18, var19, var20, var21)) {
              int var22 = null /* jnt:encrypted */ * 3;
              int var23 = var3 - var18 - 5;
              int var24 = var4 - var19 - 5;
              int var25 = var23 / 200;
              int var26 = var24 / 40;
              if (var25 >= 0 && var25 < 3) {
                int var27 = var22 + var26 * 3 + var25;
                if (var27 >= 0
                  && var27
                    < /* jnt */
                    )) {
                  int var28 = var25 * 200;
                  int var29 = var26 * 40;
                  if (var23 >= var28 && var23 <= var28 + 190 && var24 >= var29 && var24 <= var29 + 30) {
                    /* jnt */,
                      (lb)/* jnt */, var27
                      )
                    );
                    return true;
                  }
                }
              }
            }

            return /* jnt */;
          case -878322380:
          default:
            if (/* jnt */var3, (double)var4, var17, var11, var12, var13)) {
              /* jnt */
                )
              );
              return true;
            }

            var30 = (-1860965115 | -1065229486 << 1188862856 | 1115979967) & 1925626367;
            break;
          case 117652385:
            if (/* jnt */var3, (double)var4, var16, var11, var12, var13)) {
              /* jnt */);
              return true;
            }

            var30 = (1603363721 >>> (2002143149 ^ -1486623143) | 1600814533) & 1601896389;
            break;
          case 1664490999:
            if (/* jnt */var3, (double)var4, var15, var11, var12, var13)) {
              /* jnt */),
                (yva)null /* jnt:encrypted */null /* jnt:encrypted */)
              );
              return true;
            }

            var30 = (993455132 >> -570783483 | -1694047984) & -552607305;
        }
      }
    }
  }
  public boolean method_25401(double var1, double var3, double var5, double var7) {
    int var21 = -2086990153;
    var1 *= (double)/* jnt */)
      )
    );
    var3 *= (double)/* jnt */)
      )
    );
    int var9 = /* jnt */)
      )
    );
    int var10 = /* jnt */)
      )
    );
    short var11 = 650;
    short var12 = 550;
    int var13 = (var9 - var11) / 2;
    int var14 = (var10 - var12) / 2;
    int var15 = var13 + 20;
    int var16 = var14 + 50 + 30 + 15;
    int var17 = var11 - 40;
    int var18 = var12 - (var16 - var14) - 60;
    if (!/* jnt */) {
      return /* jnt */;
    } else {
      int var19 = (int)/* jnt *//* jnt */
          )
          / 3.0
      );
      int var20 = /* jnt */;
      if (var7 > 0.0) {
        null /* jnt:encrypted */
        );
        var21 = (-1022437720 | 1422306528 | 605034644) & 743659956;
      } else {
        var21 = -1276758884 * -1848864510 ^ -1988220147;
      }

      while (true) {
        switch ((var21 - 1050423577 + 1121998069 ^ 949684486) + 962144097 + 1824789237 - 1991987100) {
          case -710801967:
          default:
            if (var7 < 0.0) {
              null /* jnt:encrypted */
              );
            }

            var21 = (-1022437720 | 1422306528 | 605034644) & 743659956;
            break;
          case 1064263760:
            return true;
        }
      }
    }
  }

  public boolean method_25404(class_11908 var1) {
    int var2 = 401013451;
    if (/* jnt */
      == 256) {
      /* jnt */),
        (yva)null /* jnt:encrypted */null /* jnt:encrypted */)
      );
      return true;
    } else {
      var2 = (1626581491 ^ 2134889584 | -467364484) & -189426180;

      while (true) {
        switch ((var2 - 1010714665 + 1122428900 + 1930592755 ^ 1670358456) + 391655725 ^ 595082070) {
          case -619532906:
          default:
            if (/* jnt */
              == 257) {
              /* jnt */),
                (yva)null /* jnt:encrypted */null /* jnt:encrypted */)
              );
              return true;
            }

            var2 = 1272167970 >>> (-126863654 >>> 58573703) ^ -300962230;
            break;
          case 105937001:
            if (/* jnt */
              == 259) {
              if (!/* jnt */
              )) {
                null /* jnt:encrypted */
                      - 1
                  )
                );
                /* jnt */;
              }

              var2 = (1800885029 | -2107884023 >>> 1885831161 | 459810398) & -1677920546;
            } else {
              var2 = 1773844183 & -1375548575 ^ 551558204;
            }
            break;
          case 761812407:
            return true;
          case 954651452:
            return /* jnt */;
        }
      }
    }
  }

  public boolean method_25400(class_11905 var1) {
    String var10001 = null /* jnt:encrypted */;
    String var3 = /* jnt */;
    String var2 = var10001;
    null /* jnt:encrypted */,
          var3
        )
      )
    );
    /* jnt */;
    return true;
  }

  public void jps() {
    if (/* jnt */
    )) {
      null /* jnt:encrypted *//* jnt */
        )
      );
    } else {
      String var1 = /* jnt */
      );
      null /* jnt:encrypted *//* jnt */
            ),
            (Predicate<lb>)var1x -> /* jnt */
                ),
                var1
              )
          ),
          /* jnt */
        )
      );
    }

    null /* jnt:encrypted */;
  }

  public boolean kza(double var1, double var3, int var5, int var6, int var7, int var8) {
    return var1 >= (double)var5 && var1 <= (double)(var5 + var7) && var3 >= (double)var6 && var3 <= (double)(var6 + var8);
  }

  public void method_25420(class_332 var1, int var2, int var3, float var4) {
  }

  public boolean method_25422() {
    return false;
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (var10 ^ 1897616754) + 879476568 - 1939403006 - 766146318 + 1977512243 - 1794035334 - 1987219694 ^ 938056886 ^ 1933487904;
    MethodHandle var10000 = pty[((var10 ^ 1897616754) + 879476568 - 1939403006 - 766146318 + 1977512243 - 1794035334 - 1987219694 ^ 938056886 ^ 1933487904)
      - 1232456727];
    if (pty[var10001 - 1232456727] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (1274194820 + -2126975517 | 0) & 302252168; var23 < var13.length(); var23 += (-1150220830 << -1150220830 + -1150220830 | 1) & 4522013) {
        int var42 = var13.charAt(var23) ^ 205;
        int var10004 = (var42 & 65528) >> 3;
        int var43 = (((var42 & 65528) >> 3 | var42 << 13) + 226 ^ 132) + 18;
        int var83 = ((((var42 & 65528) >> 3 | var42 << 13) + 226 ^ 132) + 18 & 65408) >> 7;
        var42 = ((((var10004 | var42 << 13) + 226 ^ 132) + 18 & 65408) >> 7 | (((var42 & 65528) >> 3 | var42 << 13) + 226 ^ 132) + 18 << 9) + 129 - 139;
        var10004 = ((var83 | var43 << 9) + 129 - 139 & 32768) >> 15;
        int var45 = ((var83 | var43 << 9) + 129 - 139 & 32768) >> 15 | var42 << 1;
        int var85 = ((((var83 | var43 << 9) + 129 - 139 & 32768) >> 15 | var42 << 1) & 49152) >> 14;
        char var46 = (char)(((var10004 | var42 << 1) & 49152) >> 14 | (((var83 | var43 << 9) + 129 - 139 & 32768) >> 15 | var42 << 1) << 2);
        var13.setCharAt(var23, (char)(var85 | var45 << 2));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = 1380727737 >>> 1046758192 ^ 21068; var29 < var16.length(); var29 += 223439631 + -907010219 ^ -683570587) {
        int var51 = var16.charAt(var29) - 6 + 201 - 241 + 218 + 101;
        char var54 = (char)(
          ((((((var51 & 0) >> 16 | var51 << 0) ^ 94) - 18 & 65532) >> 2 | (((var51 & 0) >> 16 | var51 << 0) ^ 94) - 18 << 14) & 65520) >> 4
            | (((((var51 & 0) >> 16 | var51 << 0) ^ 94) - 18 & 65532) >> 2 | (((var51 & 0) >> 16 | var51 << 0) ^ 94) - 18 << 14) << 12
        );
        var16.setCharAt(
          var29,
          (char)(
            ((((((var51 & 0) >> 16 | var51 << 0) ^ 94) - 18 & 65532) >> 2 | (((var51 & 0) >> 16 | var51 << 0) ^ 94) - 18 << 14) & 65520) >> 4
              | (((((var51 & 0) >> 16 | var51 << 0) ^ 94) - 18 & 65532) >> 2 | (((var51 & 0) >> 16 | var51 << 0) ^ 94) - 18 << 14) << 12
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), vy.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (365473430 >> 365473430 | 0) & -1855769464; var35 < var19.length(); var35 += -1072786572 << -1072786572 ^ 926941185) {
        int var59 = var19.charAt(var35) + 201;
        int var89 = (var59 & 49152) >> 14;
        int var60 = ((var59 & 49152) >> 14 | var59 << 2) - 148 - 26 + 176;
        int var90 = (((var59 & 49152) >> 14 | var59 << 2) - 148 - 26 + 176 & 32768) >> 15;
        var59 = ((var89 | var59 << 2) - 148 - 26 + 176 & 32768) >> 15 | ((var59 & 49152) >> 14 | var59 << 2) - 148 - 26 + 176 << 1;
        var89 = ((var90 | var60 << 1) & 65024) >> 9;
        int var62 = ((var90 | var60 << 1) & 65024) >> 9 | var59 << 7;
        int var92 = ((((var90 | var60 << 1) & 65024) >> 9 | var59 << 7) & 65528) >> 3;
        char var63 = (char)((((var89 | var59 << 7) & 65528) >> 3 | (((var90 | var60 << 1) & 65024) >> 9 | var59 << 7) << 13) - 203 - 2);
        var19.setCharAt(var35, (char)((var92 | var62 << 13) - 203 - 2));
      }

      Class var7 = Class.forName(var19.toString(), false, vy.class.getClassLoader());
      switch (((var4 + 1575445218 - 58868812 ^ 108434923) - 47097971 + 1497392442 - 1446463337 + 1434597244 ^ 1191400370) - 340861948 - 242399637) {
        case 442537977:
        case 656634774:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 444550858:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 724101171:
          var10000 = var0.findSpecial(var7, var5, var6, vy.class);
          break;
        case 1214627450:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    pty[((var10 ^ 1897616754) + 879476568 - 1939403006 - 766146318 + 1977512243 - 1794035334 - 1987219694 ^ 938056886 ^ 1933487904) - 1232456727] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 ^ 524747004 ^ 1839632027) + 1671106381 - 1684142490 ^ 442083370) - 852118638 + 1818213570 - 39799449 - 713598054;
    MethodHandle var10000 = pty[((var10 ^ 524747004 ^ 1839632027) + 1671106381 - 1684142490 ^ 442083370)
      - 852118638
      + 1818213570
      - 39799449
      - 713598054
      + 356344620];
    if (pty[var10001 + 356344620] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (-658985743 + 1274750478 | 0) & -805303296; var24 < var14.length(); var24 += 1463984886 << 1779824188 ^ 1610612737) {
        char var43 = var14.charAt(var24);
        char var48 = (char)(
          (
              (
                    (
                          (
                                (
                                    (((((var43 & 'ﰀ') >> 10 | var43 << 6) - 249 & 0) >> 16 | ((var43 & 'ﰀ') >> 10 | var43 << 6) - 249 << 0) & 32768) >> 15
                                      | ((((var43 & 'ﰀ') >> 10 | var43 << 6) - 249 & 0) >> 16 | ((var43 & 'ﰀ') >> 10 | var43 << 6) - 249 << 0) << 1
                                  )
                                  & 61440
                              )
                              >> 12
                            | (
                                (((((var43 & 'ﰀ') >> 10 | var43 << 6) - 249 & 0) >> 16 | ((var43 & 'ﰀ') >> 10 | var43 << 6) - 249 << 0) & 32768) >> 15
                                  | ((((var43 & 'ﰀ') >> 10 | var43 << 6) - 249 & 0) >> 16 | ((var43 & 'ﰀ') >> 10 | var43 << 6) - 249 << 0) << 1
                              )
                              << 4
                        )
                        + 68
                      & 65504
                  )
                  >> 5
                | (
                      (
                            (
                                (((((var43 & 'ﰀ') >> 10 | var43 << 6) - 249 & 0) >> 16 | ((var43 & 'ﰀ') >> 10 | var43 << 6) - 249 << 0) & 32768) >> 15
                                  | ((((var43 & 'ﰀ') >> 10 | var43 << 6) - 249 & 0) >> 16 | ((var43 & 'ﰀ') >> 10 | var43 << 6) - 249 << 0) << 1
                              )
                              & 61440
                          )
                          >> 12
                        | (
                            (((((var43 & 'ﰀ') >> 10 | var43 << 6) - 249 & 0) >> 16 | ((var43 & 'ﰀ') >> 10 | var43 << 6) - 249 << 0) & 32768) >> 15
                              | ((((var43 & 'ﰀ') >> 10 | var43 << 6) - 249 & 0) >> 16 | ((var43 & 'ﰀ') >> 10 | var43 << 6) - 249 << 0) << 1
                          )
                          << 4
                    )
                    + 68
                  << 11
            )
            + 253
            - 179
            + 175
        );
        var14.setCharAt(
          var24,
          (char)(
            (
                (
                      (
                            (
                                  (
                                      (((((var43 & 'ﰀ') >> 10 | var43 << 6) - 249 & 0) >> 16 | ((var43 & 'ﰀ') >> 10 | var43 << 6) - 249 << 0) & 32768) >> 15
                                        | ((((var43 & 'ﰀ') >> 10 | var43 << 6) - 249 & 0) >> 16 | ((var43 & 'ﰀ') >> 10 | var43 << 6) - 249 << 0) << 1
                                    )
                                    & 61440
                                )
                                >> 12
                              | (
                                  (((((var43 & 'ﰀ') >> 10 | var43 << 6) - 249 & 0) >> 16 | ((var43 & 'ﰀ') >> 10 | var43 << 6) - 249 << 0) & 32768) >> 15
                                    | ((((var43 & 'ﰀ') >> 10 | var43 << 6) - 249 & 0) >> 16 | ((var43 & 'ﰀ') >> 10 | var43 << 6) - 249 << 0) << 1
                                )
                                << 4
                          )
                          + 68
                        & 65504
                    )
                    >> 5
                  | (
                        (
                              (
                                  (((((var43 & 'ﰀ') >> 10 | var43 << 6) - 249 & 0) >> 16 | ((var43 & 'ﰀ') >> 10 | var43 << 6) - 249 << 0) & 32768) >> 15
                                    | ((((var43 & 'ﰀ') >> 10 | var43 << 6) - 249 & 0) >> 16 | ((var43 & 'ﰀ') >> 10 | var43 << 6) - 249 << 0) << 1
                                )
                                & 61440
                            )
                            >> 12
                          | (
                              (((((var43 & 'ﰀ') >> 10 | var43 << 6) - 249 & 0) >> 16 | ((var43 & 'ﰀ') >> 10 | var43 << 6) - 249 << 0) & 32768) >> 15
                                | ((((var43 & 'ﰀ') >> 10 | var43 << 6) - 249 & 0) >> 16 | ((var43 & 'ﰀ') >> 10 | var43 << 6) - 249 << 0) << 1
                            )
                            << 4
                      )
                      + 68
                    << 11
              )
              + 253
              - 179
              + 175
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (890566337 * 679484418 | 0) & -2147483564; var30 < var17.length(); var30 += 976779278 >> 976779278 ^ 59616) {
        int var53 = ((var17.charAt(var30) ^ 163 ^ 121 ^ 97) + 220 ^ 200) + 8 - 151 ^ 161;
        int var94 = (var53 & 65024) >> 9;
        int var54 = (var53 & 65024) >> 9 | var53 << 7;
        int var95 = (((var53 & 65024) >> 9 | var53 << 7) & 32768) >> 15;
        char var55 = (char)(((var94 | var53 << 7) & 32768) >> 15 | ((var53 & 65024) >> 9 | var53 << 7) << 1);
        var17.setCharAt(var30, (char)(var95 | var54 << 1));
      }

      Class var6 = Class.forName(var17.toString(), false, vy.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = -365800746 * (-2031624101 - -2031624101) ^ 0; var36 < var20.length(); var36 += (-802126516 & 1021775455 | 1) & -528207597) {
        int var60 = var20.charAt(var36) - '(';
        char var67 = (char)(
          (
                (
                      (
                            (
                                (
                                      (
                                          (
                                              (
                                                    (
                                                        (
                                                              ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14)
                                                                & 63488
                                                            )
                                                            >> 11
                                                          | ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14)
                                                            << 5
                                                      )
                                                      & 63488
                                                  )
                                                  >> 11
                                                | (
                                                    (((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) & 63488)
                                                        >> 11
                                                      | ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) << 5
                                                  )
                                                  << 5
                                            )
                                            ^ 221
                                        )
                                        & 65520
                                    )
                                    >> 4
                                  | (
                                      (
                                          (
                                                (
                                                    (((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) & 63488)
                                                        >> 11
                                                      | ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) << 5
                                                  )
                                                  & 63488
                                              )
                                              >> 11
                                            | (
                                                (((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) & 63488)
                                                    >> 11
                                                  | ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) << 5
                                              )
                                              << 5
                                        )
                                        ^ 221
                                    )
                                    << 12
                              )
                              & 65472
                          )
                          >> 6
                        | (
                            (
                                  (
                                      (
                                          (
                                                (
                                                    (((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) & 63488)
                                                        >> 11
                                                      | ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) << 5
                                                  )
                                                  & 63488
                                              )
                                              >> 11
                                            | (
                                                (((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) & 63488)
                                                    >> 11
                                                  | ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) << 5
                                              )
                                              << 5
                                        )
                                        ^ 221
                                    )
                                    & 65520
                                )
                                >> 4
                              | (
                                  (
                                      (
                                            (
                                                (((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) & 63488)
                                                    >> 11
                                                  | ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) << 5
                                              )
                                              & 63488
                                          )
                                          >> 11
                                        | (
                                            (((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) & 63488) >> 11
                                              | ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) << 5
                                          )
                                          << 5
                                    )
                                    ^ 221
                                )
                                << 12
                          )
                          << 10
                    )
                    + 1
                  & 65024
              )
              >> 9
            | (
                  (
                        (
                            (
                                  (
                                      (
                                          (
                                                (
                                                    (((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) & 63488)
                                                        >> 11
                                                      | ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) << 5
                                                  )
                                                  & 63488
                                              )
                                              >> 11
                                            | (
                                                (((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) & 63488)
                                                    >> 11
                                                  | ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) << 5
                                              )
                                              << 5
                                        )
                                        ^ 221
                                    )
                                    & 65520
                                )
                                >> 4
                              | (
                                  (
                                      (
                                            (
                                                (((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) & 63488)
                                                    >> 11
                                                  | ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) << 5
                                              )
                                              & 63488
                                          )
                                          >> 11
                                        | (
                                            (((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) & 63488) >> 11
                                              | ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) << 5
                                          )
                                          << 5
                                    )
                                    ^ 221
                                )
                                << 12
                          )
                          & 65472
                      )
                      >> 6
                    | (
                        (
                              (
                                  (
                                      (
                                            (
                                                (((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) & 63488)
                                                    >> 11
                                                  | ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) << 5
                                              )
                                              & 63488
                                          )
                                          >> 11
                                        | (
                                            (((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) & 63488) >> 11
                                              | ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) << 5
                                          )
                                          << 5
                                    )
                                    ^ 221
                                )
                                & 65520
                            )
                            >> 4
                          | (
                              (
                                  (
                                        (
                                            (((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) & 63488) >> 11
                                              | ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) << 5
                                          )
                                          & 63488
                                      )
                                      >> 11
                                    | (
                                        (((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) & 63488) >> 11
                                          | ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) << 5
                                      )
                                      << 5
                                )
                                ^ 221
                            )
                            << 12
                      )
                      << 10
                )
                + 1
              << 7
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
                                                (
                                                      (
                                                          (
                                                                (
                                                                    (((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2
                                                                      | ((var60 & 65472) >> 6 | var60 << 10) << 14
                                                                  )
                                                                  & 63488
                                                              )
                                                              >> 11
                                                            | ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14)
                                                              << 5
                                                        )
                                                        & 63488
                                                    )
                                                    >> 11
                                                  | (
                                                      (
                                                            ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14)
                                                              & 63488
                                                          )
                                                          >> 11
                                                        | ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14)
                                                          << 5
                                                    )
                                                    << 5
                                              )
                                              ^ 221
                                          )
                                          & 65520
                                      )
                                      >> 4
                                    | (
                                        (
                                            (
                                                  (
                                                      (
                                                            ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14)
                                                              & 63488
                                                          )
                                                          >> 11
                                                        | ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14)
                                                          << 5
                                                    )
                                                    & 63488
                                                )
                                                >> 11
                                              | (
                                                  (((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) & 63488)
                                                      >> 11
                                                    | ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) << 5
                                                )
                                                << 5
                                          )
                                          ^ 221
                                      )
                                      << 12
                                )
                                & 65472
                            )
                            >> 6
                          | (
                              (
                                    (
                                        (
                                            (
                                                  (
                                                      (
                                                            ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14)
                                                              & 63488
                                                          )
                                                          >> 11
                                                        | ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14)
                                                          << 5
                                                    )
                                                    & 63488
                                                )
                                                >> 11
                                              | (
                                                  (((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) & 63488)
                                                      >> 11
                                                    | ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) << 5
                                                )
                                                << 5
                                          )
                                          ^ 221
                                      )
                                      & 65520
                                  )
                                  >> 4
                                | (
                                    (
                                        (
                                              (
                                                  (((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) & 63488)
                                                      >> 11
                                                    | ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) << 5
                                                )
                                                & 63488
                                            )
                                            >> 11
                                          | (
                                              (((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) & 63488)
                                                  >> 11
                                                | ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) << 5
                                            )
                                            << 5
                                      )
                                      ^ 221
                                  )
                                  << 12
                            )
                            << 10
                      )
                      + 1
                    & 65024
                )
                >> 9
              | (
                    (
                          (
                              (
                                    (
                                        (
                                            (
                                                  (
                                                      (
                                                            ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14)
                                                              & 63488
                                                          )
                                                          >> 11
                                                        | ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14)
                                                          << 5
                                                    )
                                                    & 63488
                                                )
                                                >> 11
                                              | (
                                                  (((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) & 63488)
                                                      >> 11
                                                    | ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) << 5
                                                )
                                                << 5
                                          )
                                          ^ 221
                                      )
                                      & 65520
                                  )
                                  >> 4
                                | (
                                    (
                                        (
                                              (
                                                  (((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) & 63488)
                                                      >> 11
                                                    | ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) << 5
                                                )
                                                & 63488
                                            )
                                            >> 11
                                          | (
                                              (((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) & 63488)
                                                  >> 11
                                                | ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) << 5
                                            )
                                            << 5
                                      )
                                      ^ 221
                                  )
                                  << 12
                            )
                            & 65472
                        )
                        >> 6
                      | (
                          (
                                (
                                    (
                                        (
                                              (
                                                  (((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) & 63488)
                                                      >> 11
                                                    | ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) << 5
                                                )
                                                & 63488
                                            )
                                            >> 11
                                          | (
                                              (((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) & 63488)
                                                  >> 11
                                                | ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) << 5
                                            )
                                            << 5
                                      )
                                      ^ 221
                                  )
                                  & 65520
                              )
                              >> 4
                            | (
                                (
                                    (
                                          (
                                              (((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) & 63488)
                                                  >> 11
                                                | ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) << 5
                                            )
                                            & 63488
                                        )
                                        >> 11
                                      | (
                                          (((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) & 63488) >> 11
                                            | ((((var60 & 65472) >> 6 | var60 << 10) & 65532) >> 2 | ((var60 & 65472) >> 6 | var60 << 10) << 14) << 5
                                        )
                                        << 5
                                  )
                                  ^ 221
                              )
                              << 12
                        )
                        << 10
                  )
                  + 1
                << 7
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), vy.class.getClassLoader()).returnType();
      switch ((var4 - 544848793 + 1462122193 ^ 1348405679) - 1700342991 + 1183467649 + 42618338 ^ 346189778 ^ 764026181 ^ 1230004738 ^ 221307442) {
        case 524385648:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1013833702:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1504965955:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1683779005:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      pty[((var10 ^ 524747004 ^ 1839632027) + 1671106381 - 1684142490 ^ 442083370) - 852118638 + 1818213570 - 39799449 - 713598054 + 356344620] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
