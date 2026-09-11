// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import net.minecraft.class_11905;
import net.minecraft.class_11908;
import net.minecraft.Identifier;
import net.minecraft.Item;
import net.minecraft.ItemStack;
import net.minecraft.DrawContext;
import net.minecraft.class_437;

public class us extends class_437 implements yh {
  public ib bo;
  public List izf;
  public int vz;
  public int tk;
  public int vv;
  public int ng;
  public String vjy;
  public List dmb;
  public int bj;
  public int ast;
  // [JNT] MethodHandle dispatch table (removed)
  public us(yez var1, ib var2) {
    int var4 = -1646389763;
    this.ij = var1;
    super(/* jnt */);
    this.vz = 11;
    this.tk = 6;
    this.vv = 40;
    this.ng = 8;
    this.vjy = "";
    this.bj = 0;
    this.ast = -1;
    this.bo = var2;
    this.izf = (ArrayList)/* jnt */;
    /* jnt */,
      (Consumer<class_1792>)var1x -> {
        if (var1x
          != null /* jnt:encrypted */
          )
         {
          /* jnt */, var1x
          );
        }
      }
    );
    this.dmb = (ArrayList)/* jnt */
    );
    if (/* jnt */ != null
      && /* jnt */
        != null /* jnt:encrypted */
      )
     {
      int var3 = 0;

      label29:
      while (true) {
        var4 = 1917079069 ^ -406484890 + -979570999 ^ 726989796;

        while (true) {
          switch (((var4 ^ 1121296165) - 1047557403 - 262963710 ^ 73946929) + 2043177583 - 539040571) {
            case -1201847816:
            default:
              var3++;
              continue label29;
            case -964067041:
              if (var3
                >= /* jnt */
                )) {
                return;
              }

              if (/* jnt */, var3
                )
                == /* jnt */) {
                this.ast = var3;
                return;
              }

              var4 = (1199697404 << -1628573190 | -366018005) & -364913873;
          }
        }
      }
    }
  }

  public void method_25394(class_332 var1, int var2, int var3, float var4) {
    int var35 = 1469355003;
    /* jnt */;
    var2 *= /* jnt */
        )
      )
    );
    var3 *= /* jnt */
        )
      )
    );
    /* jnt */;
    /* jnt */
          )
        )
      ),
      /* jnt */
          )
        )
      ),
      /* jnt *//* jnt */) ? 180 : 0
        )
      )
    );
    int var5 = /* jnt */
        )
      )
    );
    int var6 = /* jnt */
        )
      )
    );
    short var7 = 580;
    short var8 = 450;
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
    String var32 = /* jnt */);
    StringBuilder var10000 = (StringBuilder)/* jnt */;
    int var10001 = 376310060 >>> -1899648857 ^ 2939922;

    StringBuilder var10002;
    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < (-1521847505 - 2020496607 ^ 752623197);
      var10001 += 1313722383 << -1004494587 ^ -910556703
    ) {
      int var92 = /* jnt */ ^ 24 ^ 77;
      int var10005 = (var92 & 65535) >> 0;
      int var93 = (var92 & 65535) >> 0 | var92 << 16;
      int var124 = (((var92 & 65535) >> 0 | var92 << 16) & 57344) >> 13;
      char var94 = (char)((((var10005 | var92 << 16) & 57344) >> 13 | ((var92 & 65535) >> 0 | var92 << 16) << 3) - 136);
      /* jnt */((var124 | var93 << 3) - 136));
    }

    /* jnt */
          ),
          var32
        )
      ),
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
    String var54 = null /* jnt:encrypted */;
    String var34 = /* jnt */ % 1000L > 500L ? "|" : "";
    String var33 = var54;
    var10000 = (StringBuilder)/* jnt */;
    var10001 = (-152626603 + -1137212959 | 0) & 1075905224;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((301373517 * 827300156 | 0) & -1536605975);
      var10001 += (-29323401 ^ -29323401 | 1) & 2072464705
    ) {
      int var97 = /* jnt */ - '.' - 100;
      char var100 = (char)(
        (((((var97 & 65534) >> 1 | var97 << 15) & 65520) >> 4 | ((var97 & 65534) >> 1 | var97 << 15) << 12) & 64512) >> 10
          | ((((var97 & 65534) >> 1 | var97 << 15) & 65520) >> 4 | ((var97 & 65534) >> 1 | var97 << 15) << 12) << 6
      );
      /* jnt */(
          (((((var97 & 65534) >> 1 | var97 << 15) & 65520) >> 4 | ((var97 & 65534) >> 1 | var97 << 15) << 12) & 64512) >> 10
            | ((((var97 & 65534) >> 1 | var97 << 15) & 65520) >> 4 | ((var97 & 65534) >> 1 | var97 << 15) << 12) << 6
        )
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
        / 11.0
    );
    byte var20 = 48;
    int var21 = /* jnt */;
    null /* jnt:encrypted */
    );
    if (var19 > 6) {
      byte var22 = 6;
      int var23 = var15 + var17 - var22 - 5;
      int var24 = var16 + 5;
      int var25 = var18 - 10;
      /* jnt *//* jnt */,
        (double)var23,
        (double)var24,
        (double)(var23 + var22),
        (double)(var24 + var25),
        3.0,
        3.0,
        3.0,
        3.0
      );
      float var26 = (float)null /* jnt:encrypted */ / (float)var21;
      float var27 = /* jnt */var25 * (6.0F / (float)var19));
      int var28 = var24 + (int)(((float)var25 - var27) * var26);
      /* jnt */,
        (double)var23,
        (double)var28,
        (double)(var23 + var22),
        (double)((float)var28 + var27),
        3.0,
        3.0,
        3.0,
        3.0
      );
    }

    int var38 = /* jnt */
      ),
      66
    );
    int var39 = null /* jnt:encrypted */ * 11;
    int var40 = /* jnt */
      )
    );
    int var41 = var39;

    label113:
    while (true) {
      var35 = (975930912 * -2012758767 * -1241609140 | 143233356) & 447329628;

      while (true) {
        switch (((var35 ^ 1704381708) - 1675952745 ^ 344491516) + 248347521 - 844262853 ^ 2076120127) {
          case -2020532776:
            if (var41 < var40) {
              int var44 = (var41 - var39) / 11;
              int var46 = (var41 - var39) % 11;
              int var48 = var15 + 5 + var46 * var20;
              int var49 = var16 + 5 + var44 * var20;
              zn var50 = var41 == null /* jnt:encrypted */
                ? /* jnt */
                : (zn)/* jnt */;
              /* jnt */var48, (double)var49, (double)(var48 + 40), (double)(var49 + 40), 4.0, 4.0, 4.0, 4.0
              );
              class_1792 var31 = (Item)/* jnt */, var41
              );
              /* jnt *//* jnt */,
                var48,
                var49,
                40,
                2.0F
              );
              if (var2 >= var48 && var2 <= var48 + 40 && var3 >= var49 && var3 <= var49 + 40) {
                /* jnt */,
                  (double)var48,
                  (double)var49,
                  (double)(var48 + 40),
                  (double)(var49 + 40),
                  4.0,
                  4.0,
                  4.0,
                  4.0,
                  1.0
                );
              }

              var41++;
              continue label113;
            }

            var35 = (-397223816 & 811673381 | -609645418) & -538079298;
            continue;
          case -260275306:
            var41 = var10 + var8 - 45;
            byte var43 = 80;
            byte var45 = 30;
            int var47 = var9 + var7 - var43 - 20;
            int var29 = var47 - var43 - 10;
            int var30 = var29 - var43 - 10;
            /* jnt */,
              (double)var47,
              (double)var41,
              (double)(var47 + var43),
              (double)(var41 + var45),
              5.0,
              5.0,
              5.0,
              5.0
            );
            int var58 = (-11947722 | -155433288 | 0) & 0;
            StringBuilder var65 = (StringBuilder)/* jnt */;

            label89:
            while (true) {
              var35 = 2083889487 & 2083889487 ^ -1168824357;

              while (true) {
                label85:
                while (true) {
                  label83: {
                    switch (((var35 ^ 1085905269) - 1169886872 ^ 259742104) - 838977486 - 983709549 ^ 689792238) {
                      case -925094536:
                      default:
                        var10000 = var65;
                        if (var58 < ((-1757392189 | -855945137) ^ -537177397)) {
                          int var87 = /* jnt */ + '-';
                          char var90 = (char)(
                            ((((((var87 & 65504) >> 5 | var87 << 11) & 65504) >> 5 | ((var87 & 65504) >> 5 | var87 << 11) << 11) ^ 154) & 65024) >> 9
                              | (((((var87 & 65504) >> 5 | var87 << 11) & 65504) >> 5 | ((var87 & 65504) >> 5 | var87 << 11) << 11) ^ 154) << 7
                          );
                          /* jnt */(
                              ((((((var87 & 65504) >> 5 | var87 << 11) & 65504) >> 5 | ((var87 & 65504) >> 5 | var87 << 11) << 11) ^ 154) & 65024) >> 9
                                | (((((var87 & 65504) >> 5 | var87 << 11) & 65504) >> 5 | ((var87 & 65504) >> 5 | var87 << 11) << 11) ^ 154) << 7
                            )
                          );
                          var58 += (480109422 >>> 101721019 | 0) & -2121593539;
                          continue label89;
                        }

                        var35 = (980978613 << 980978613 | -2129069775) & -1860304899;
                        break;
                      case 212688840:
                        var10000 = var65;
                        if (var58 < ((-72603059 - 1439687326 | 1) & 1107527701)) {
                          /* jnt */((/* jnt */ + 174 ^ 158) + 196 ^ 251 ^ 243)
                          );
                          var58 += (-652328439 ^ 1816949851 | 1) & 11012237;
                          break label83;
                        }

                        var35 = (-308242398 | -590967454) ^ -2067227377;
                        break;
                      case 1238161211:
                        var10000 = var65;
                        if (var58 < ((-1480750681 + 147716453 | 2) & 1297378551)) {
                          int var80 = /* jnt */ - 245 - 34;
                          int var119 = (var80 & 65408) >> 7;
                          int var81 = ((var80 & 65408) >> 7 | var80 << 9) - 129;
                          int var120 = (((var80 & 65408) >> 7 | var80 << 9) - 129 & 65408) >> 7;
                          char var82 = (char)(((var119 | var80 << 9) - 129 & 65408) >> 7 | ((var80 & 65408) >> 7 | var80 << 9) - 129 << 9);
                          /* jnt */(var120 | var81 << 9));
                          var58 += 493809322 - 411660755 ^ 82148566;
                          break label85;
                        }

                        var35 = (1425637609 - -1612704603 | -2081986934) & -336105830;
                    }

                    switch ((var35 - 2063975779 - 1712715460 + 1239796065 ^ 125109471) - 1393471264 - 1437641959) {
                      case 1036889457:
                        /* jnt */,
                          var1,
                          var30 + var43 / 2,
                          var41 + 8,
                          /* jnt *//* jnt */)
                        );
                        /* jnt */;
                        return;
                      case 1440130733:
                        /* jnt */,
                          var1,
                          var47 + var43 / 2,
                          var41 + 8,
                          /* jnt *//* jnt */)
                        );
                        /* jnt *//* jnt */,
                          (double)var29,
                          (double)var41,
                          (double)(var29 + var43),
                          (double)(var41 + var45),
                          5.0,
                          5.0,
                          5.0,
                          5.0
                        );
                        var58 = (-1309891691 | -1467337795 | 0) & 68159490;
                        var65 = (StringBuilder)/* jnt */;
                        break label85;
                      case 1660232468:
                      default:
                        /* jnt */,
                          var1,
                          var29 + var43 / 2,
                          var41 + 8,
                          /* jnt *//* jnt */)
                        );
                        /* jnt *//* jnt */,
                          (double)var30,
                          (double)var41,
                          (double)(var30 + var43),
                          (double)(var41 + var45),
                          5.0,
                          5.0,
                          5.0,
                          5.0
                        );
                        var58 = -1579024041 ^ -1422474092 ^ -1335822887 ^ -1162596326;
                        var65 = (StringBuilder)/* jnt */;
                    }
                  }

                  var35 = 744641031 << 744641031 ^ -1820661660;
                }

                var35 = (1968016213 | 1968016213) ^ 842918656;
              }
            }
          case 1362287702:
        }

        if (/* jnt */
        )) {
          int var56 = (1823942224 + -1087528611 | 0) & -803719102;

          for (var63 = (StringBuilder)/* jnt */;
            var56 < ((1579265412 & (1546158090 ^ -584446149) | 14) & -628288833);
            var56 += -1746146830 & -1746146830 ^ -1746146829
          ) {
            int var73 = /* jnt */ + 219;
            int var115 = (var73 & 65520) >> 4;
            int var74 = (var73 & 65520) >> 4 | var73 << 12;
            int var116 = (((var73 & 65520) >> 4 | var73 << 12) & 65504) >> 5;
            int var75 = ((var115 | var73 << 12) & 65504) >> 5 | ((var73 & 65520) >> 4 | var73 << 12) << 11;
            var115 = ((var116 | var74 << 11) & 49152) >> 14;
            int var76 = ((var116 | var74 << 11) & 49152) >> 14 | var75 << 2;
            int var118 = ((((var116 | var74 << 11) & 49152) >> 14 | var75 << 2) & 65024) >> 9;
            char var77 = (char)(((var115 | var75 << 2) & 65024) >> 9 | (((var116 | var74 << 11) & 49152) >> 14 | var75 << 2) << 7);
            /* jnt */(var118 | var76 << 7));
          }

          /* jnt */,
            var1,
            var15 + var17 / 2,
            var16 + var18 / 2 - 10,
            /* jnt *//* jnt */)
          );
        }

        var35 = (-1611871941 ^ 758698034 | 1748222582) & 2050738166;
      }
    }
  }

  public boolean method_25402(class_11909 var1, boolean var2) {
    int var28 = 970074185;
    int var3 = /* jnt */);
    int var4 = /* jnt */);
    int var5 = /* jnt */
        )
      )
    );
    int var6 = /* jnt */
        )
      )
    );
    short var7 = 580;
    short var8 = 450;
    int var9 = (var5 - var7) / 2;
    int var10 = (var6 - var8) / 2;
    int var11 = var10 + var8 - 45;
    byte var12 = 80;
    byte var13 = 30;
    int var14 = var9 + var7 - var12 - 20;
    int var15 = var14 - var12 - 10;
    int var16 = var15 - var12 - 10;
    if (/* jnt */var3, (double)var4, var14, var11, var12, var13)) {
      if (null /* jnt:encrypted */ >= 0
        && null /* jnt:encrypted */
          < /* jnt */
          )) {
        /* jnt */,
          (Item)/* jnt */,
            null /* jnt:encrypted */
          )
        );
      }

      var28 = -993086484 & 1104409953 ^ -662312364;
    } else {
      var28 = (-1940971739 >> 1450292441 | 8217) & 816620217;
    }

    while (true) {
      switch ((var28 ^ 1085856644) - 1010413586 - 1679860436 ^ 374006127 ^ 2086220413 ^ 662722212) {
        case -2111200383:
        default:
          if (/* jnt */var3, (double)var4, var15, var11, var12, var13)) {
            /* jnt */
              ),
              (yva)null /* jnt:encrypted */null /* jnt:encrypted */
              )
            );
            return true;
          }

          var28 = 968750032 ^ 47182527 ^ -989425947;
          break;
        case -2024043465:
          int var29 = var9 + 20;
          int var18 = var10 + 50 + 30 + 15;
          int var19 = var7 - 40;
          int var20 = var8 - (var18 - var10) - 60;
          if (/* jnt */var3, (double)var4, var29, var18, var19, var20)) {
            byte var21 = 48;
            int var22 = null /* jnt:encrypted */ * 11;
            int var23 = var3 - var29 - 5;
            int var24 = var4 - var18 - 5;
            int var25 = var23 / var21;
            int var26 = var24 / var21;
            if (var25 >= 0 && var25 < 11) {
              int var27 = var22 + var26 * 11 + var25;
              if (var27 >= 0
                && var27
                  < /* jnt */
                  )) {
                null /* jnt:encrypted */;
                return true;
              }
            }
          }

          return /* jnt */;
        case 1407288478:
          if (/* jnt */var3, (double)var4, var16, var11, var12, var13)) {
            /* jnt */,
              /* jnt */)
            );
            null /* jnt:encrypted */;
            int var17 = 0;

            label60:
            while (true) {
              var28 = -48717788 & 1554643303 ^ 1398058974;

              while (true) {
                switch ((var28 ^ 519878970) + 1322536166 - 2068474566 - 1058823526 ^ 229807690 ^ 1660832379) {
                  case -1136031345:
                  default:
                    var17++;
                    continue label60;
                  case -918362293:
                    if (var17
                      < /* jnt */
                      )) {
                      if (/* jnt */, var17
                        )
                        != /* jnt */)
                        )
                       {
                        var28 = (1076920710 ^ -949614778 | 543778878) & 1617655870;
                        break;
                      }

                      null /* jnt:encrypted */;
                    }

                    var28 = (-719489389 << 890794994 | -1583183894) & -1478035462;
                    break;
                  case 1053499323:
                    return true;
                }
              }
            }
          }

          var28 = -1291384048 ^ 580975711 ^ -1170378580;
          break;
        case 1966516348:
          /* jnt */
            ),
            (yva)null /* jnt:encrypted */null /* jnt:encrypted */
            )
          );
          return true;
      }
    }
  }
  public boolean method_25401(double var1, double var3, double var5, double var7) {
    int var21 = 233305251;
    var1 *= (double)/* jnt */
        )
      )
    );
    var3 *= (double)/* jnt */
        )
      )
    );
    int var9 = /* jnt */
        )
      )
    );
    int var10 = /* jnt */
        )
      )
    );
    short var11 = 580;
    short var12 = 450;
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
          / 11.0
      );
      int var20 = /* jnt */;
      if (var7 > 0.0) {
        null /* jnt:encrypted */
        );
        var21 = (557717375 | 557717375) ^ -1495281871;
      } else {
        var21 = (-237058347 | -1133524523) ^ 1574530006;
      }

      while (true) {
        switch (var21 - 740379894 - 749668048 - 1528901453 + 1516963383 + 224170537 - 2041487877) {
          case -1039578218:
            return true;
          case -632416437:
        }

        if (var7 < 0.0) {
          null /* jnt:encrypted */
          );
        }

        var21 = (557717375 | 557717375) ^ -1495281871;
      }
    }
  }

  public boolean method_25404(class_11908 var1) {
    int var2 = 2101952400;
    if (/* jnt */ == 256) {
      if (null /* jnt:encrypted */ >= 0
        && null /* jnt:encrypted */
          < /* jnt */
          )) {
        /* jnt */,
          (Item)/* jnt */,
            null /* jnt:encrypted */
          )
        );
      }

      var2 = (118681447 * 118681447 | -1401289560) & -1073748818;
    } else {
      var2 = (1521301899 * -2057094254 | -1758132799) & -1208625669;
    }

    while (true) {
      switch ((var2 + 1895653775 ^ 430784442 ^ 1184526172 ^ 1845303876) - 1496947436 - 304693443) {
        case -1045020456:
          return true;
        case -1001148186:
          /* jnt */
            ),
            (yva)null /* jnt:encrypted */null /* jnt:encrypted */
            )
          );
          return true;
        case -986300510:
          return true;
        case -824794559:
        default:
          if (/* jnt */ == 259) {
            if (!/* jnt */
            )) {
              null /* jnt:encrypted */
                    - 1
                )
              );
              /* jnt */;
            }

            var2 = (1842221877 - (1842221877 - -1650064316) | 554003240) & 830991229;
          } else {
            var2 = (-120958127 | 195463787) ^ -10139399;
          }
          break;
        case -819309755:
          return true;
        case -606084092:
          if (/* jnt */ == 265) {
            if (null /* jnt:encrypted */ >= 11) {
              null /* jnt:encrypted */ - 11);
              /* jnt */;
            }

            var2 = (-148834650 << 1933012378 | 651555990) & -1361707585;
          } else {
            var2 = (-97756473 | 466150312) ^ 2102936855;
          }
          break;
        case -563769370:
          if (/* jnt */ == 262) {
            if (null /* jnt:encrypted */
              < /* jnt */
                )
                - 1) {
              null /* jnt:encrypted */ + 1);
              /* jnt */;
            }

            var2 = -997022163 >>> 975202069 ^ -305137915;
          } else {
            var2 = (-24446003 | 801950858 | 537008245) & 540432887;
          }
          break;
        case -551073083:
          if (/* jnt */ == 263) {
            if (null /* jnt:encrypted */ > 0) {
              null /* jnt:encrypted */ - 1);
              /* jnt */;
            }

            var2 = (-50019376 >>> -581673088 - 618850516 | -1756757373) & -1082513417;
          } else {
            var2 = (-1391575042 << -1466861063 | 168083368) & 194903994;
          }
          break;
        case -520107946:
          return true;
        case 10763363:
          return true;
        case 619424426:
          return true;
        case 753009772:
          return /* jnt */;
        case 946279797:
          if (/* jnt */ == 257) {
            if (null /* jnt:encrypted */ >= 0
              && null /* jnt:encrypted */
                < /* jnt */
                )) {
              /* jnt */,
                (Item)/* jnt */,
                  null /* jnt:encrypted */
                )
              );
              /* jnt */
                ),
                (yva)null /* jnt:encrypted */null /* jnt:encrypted */
                )
              );
            }

            var2 = -1409729613 - 2127917860 ^ -1133102869;
          } else {
            var2 = (401660075 | -149906707 | 957415688) & 966085946;
          }
          break;
        case 1511362166:
          if (/* jnt */ == 264) {
            if (null /* jnt:encrypted */ + 11
              < /* jnt */
              )) {
              null /* jnt:encrypted */ + 11);
              /* jnt */;
            }

            var2 = (1941281678 | 1941281678 | 229245968) & -1913918152;
          } else {
            var2 = (509781948 - 1335095662 | 84085509) & 660802407;
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

  public void ycp() {
    int var3 = -1308635348;
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
            (Predicate<class_1792>)var1x -> /* jnt */
                  )
                ),
                var1
              )
          ),
          /* jnt */
        )
      );
    }

    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    class_1792 var4 = /* jnt */);
    if (var4 != null) {
      int var2 = 0;

      label32:
      while (true) {
        var3 = (1955889292 >> -818787908 | 521579568) & -539574928;

        while (true) {
          switch ((var3 + 2000801843 + 589347994 ^ 954696196 ^ 1520424467) - 221669890 ^ 61860363) {
            case -832247581:
              if (var2
                >= /* jnt */
                )) {
                return;
              }

              if (/* jnt */, var2
                )
                == var4) {
                null /* jnt:encrypted */;
                return;
              }

              var3 = -715125287 & -1789618926 - (-715125287 << -1789618926) ^ -845786813;
              break;
            case 1078305086:
            default:
              var2++;
              continue label32;
          }
        }
      }
    }
  }
  public void cq() {
    int var2 = 1157736393;
    if (null /* jnt:encrypted */ >= 0) {
      int var1 = null /* jnt:encrypted */ / 11;
      if (var1 < null /* jnt:encrypted */) {
        null /* jnt:encrypted */;
        var2 = 993596145 << 1778254452 ^ -1992076627;
      } else {
        var2 = -53766199 >>> 1332757576 ^ -1129037693;
      }

      while (true) {
        switch ((var2 - 357721707 ^ 1204314030) - 1887570206 ^ 872518359 ^ 366548025 ^ 1736439971) {
          case 551670915:
          default:
            return;
          case 907743140:
        }

        if (var1 >= null /* jnt:encrypted */ + 6) {
          null /* jnt:encrypted */;
        }

        var2 = 993596145 << 1778254452 ^ -1992076627;
      }
    }
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
    int var10001 = (var10 - 272289650 - 1410754158 - 122198199 - 2092891759 ^ 754364174) - 189512722 + 163259546 + 727410290 ^ 1883378177;
    MethodHandle var10000 = rht[(var10 - 272289650 - 1410754158 - 122198199 - 2092891759 ^ 754364174) - 189512722 + 163259546 + 727410290
      ^ 1883378177
      ^ 1969703914];
    if (rht[var10001 ^ 1969703914] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = -1987218348 + -1791930278 ^ 515818670; var23 < var13.length(); var23 += 713623892 ^ 713623892 ^ 713623892 >>> 713623892 ^ 681) {
        int var42 = var13.charAt(var23) - '1';
        char var45 = (char)(
          (
                (
                    (((((var42 & 65534) >> 1 | var42 << 15) ^ 58 ^ 66) & 65472) >> 6 | (((var42 & 65534) >> 1 | var42 << 15) ^ 58 ^ 66) << 10) + 215 - 92 - 217
                      ^ 160
                  )
                  & 0
              )
              >> 16
            | (
                (((((var42 & 65534) >> 1 | var42 << 15) ^ 58 ^ 66) & 65472) >> 6 | (((var42 & 65534) >> 1 | var42 << 15) ^ 58 ^ 66) << 10) + 215 - 92 - 217
                  ^ 160
              )
              << 0
        );
        var13.setCharAt(
          var23,
          (char)(
            (
                  (
                      (((((var42 & 65534) >> 1 | var42 << 15) ^ 58 ^ 66) & 65472) >> 6 | (((var42 & 65534) >> 1 | var42 << 15) ^ 58 ^ 66) << 10)
                          + 215
                          - 92
                          - 217
                        ^ 160
                    )
                    & 0
                )
                >> 16
              | (
                  (((((var42 & 65534) >> 1 | var42 << 15) ^ 58 ^ 66) & 65472) >> 6 | (((var42 & 65534) >> 1 | var42 << 15) ^ 58 ^ 66) << 10) + 215 - 92 - 217
                    ^ 160
                )
                << 0
          )
        );
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (-2079171965 | -1247973875) ^ -1247838577; var29 < var16.length(); var29 += 838639134 - -1165163401 ^ 2003802534) {
        int var50 = (var16.charAt(var29) - 196 + 176 ^ 74) - 239;
        int var79 = (var50 & 65535) >> 0;
        int var51 = (var50 & 65535) >> 0 | var50 << 16;
        int var80 = (((var50 & 65535) >> 0 | var50 << 16) & 65024) >> 9;
        var50 = ((var79 | var50 << 16) & 65024) >> 9 | ((var50 & 65535) >> 0 | var50 << 16) << 7;
        var79 = ((var80 | var51 << 7) & 61440) >> 12;
        int var53 = (((var80 | var51 << 7) & 61440) >> 12 | var50 << 4) ^ 54 ^ 17;
        int var82 = (((((var80 | var51 << 7) & 61440) >> 12 | var50 << 4) ^ 54 ^ 17) & 57344) >> 13;
        char var54 = (char)((((var79 | var50 << 4) ^ 54 ^ 17) & 57344) >> 13 | ((((var80 | var51 << 7) & 61440) >> 12 | var50 << 4) ^ 54 ^ 17) << 3);
        var16.setCharAt(var29, (char)(var82 | var53 << 3));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), us.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (-1893397515 >> 525243185 | 0) & 14377; var35 < var19.length(); var35 += -1170126157 + -1170126157 ^ 1954714983) {
        int var59 = var19.charAt(var35) + 'v' - 61 + 179 - 175;
        char var60 = (char)((((var59 & 65532) >> 2 | var59 << 14) ^ 138) - 232 + 73 + 242 ^ 46);
        var19.setCharAt(var35, (char)((((var59 & 65532) >> 2 | var59 << 14) ^ 138) - 232 + 73 + 242 ^ 46));
      }

      Class var7 = Class.forName(var19.toString(), false, us.class.getClassLoader());
      switch (((var4 - 1569235171 - 700397018 - 1259716205 + 35181229 ^ 1414200747) - 370835796 ^ 747831645) - 1884693652 + 276771745 + 1666376001) {
        case 181437968:
        case 541867807:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 199715233:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 1060707471:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 1631856382:
          var10000 = var0.findSpecial(var7, var5, var6, us.class);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    rht[(var10 - 272289650 - 1410754158 - 122198199 - 2092891759 ^ 754364174) - 189512722 + 163259546 + 727410290 ^ 1883378177 ^ 1969703914] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (((var10 + 1303847455 ^ 1219083024) - 182757165 - 1721568025 ^ 62202756) + 2116792244 ^ 686049376) - 1454271680 ^ 1653677935;
    MethodHandle var10000 = rht[(((var10 + 1303847455 ^ 1219083024) - 182757165 - 1721568025 ^ 62202756) + 2116792244 ^ 686049376) - 1454271680
      ^ 1653677935
      ^ 201735222];
    if (rht[var10001 ^ 201735222] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (351573130 >>> 1632859173 | 0) & 336614161;
        var24 < var14.length();
        var24 += (155533025 - (1308483802 >> (155533025 ^ 1308483802)) | 1) & -2071986137
      ) {
        int var43 = var14.charAt(var24) ^ 170;
        int var10004 = (var43 & 65535) >> 0;
        int var44 = (var43 & 65535) >> 0 | var43 << 16;
        int var82 = (((var43 & 65535) >> 0 | var43 << 16) & 65532) >> 2;
        var43 = ((var10004 | var43 << 16) & 65532) >> 2 | ((var43 & 65535) >> 0 | var43 << 16) << 14;
        var10004 = ((var82 | var44 << 14) & 65520) >> 4;
        int var46 = (((var82 | var44 << 14) & 65520) >> 4 | var43 << 12) + 232 - 163 ^ 179 ^ 200;
        int var84 = (((((var82 | var44 << 14) & 65520) >> 4 | var43 << 12) + 232 - 163 ^ 179 ^ 200) & 63488) >> 11;
        char var47 = (char)(
          (
              (((var10004 | var43 << 12) + 232 - 163 ^ 179 ^ 200) & 63488) >> 11
                | ((((var82 | var44 << 14) & 65520) >> 4 | var43 << 12) + 232 - 163 ^ 179 ^ 200) << 5
            )
            - 167
        );
        var14.setCharAt(var24, (char)((var84 | var46 << 5) - 167));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = 1738390377 - -1574741213 ^ -981835706; var30 < var17.length(); var30 += 441652869 ^ -1329768613 ^ -1427226145) {
        int var52 = var17.charAt(var30) ^ 'V';
        char var55 = (char)(
          (
              ((((((var52 & 65408) >> 7 | var52 << 9) & 65535) >> 0 | ((var52 & 65408) >> 7 | var52 << 9) << 16) + 154 ^ 153) & 65534) >> 1
                | (((((var52 & 65408) >> 7 | var52 << 9) & 65535) >> 0 | ((var52 & 65408) >> 7 | var52 << 9) << 16) + 154 ^ 153) << 15
            )
            - 154
            - 206
            - 38
            + 233
        );
        var17.setCharAt(
          var30,
          (char)(
            (
                ((((((var52 & 65408) >> 7 | var52 << 9) & 65535) >> 0 | ((var52 & 65408) >> 7 | var52 << 9) << 16) + 154 ^ 153) & 65534) >> 1
                  | (((((var52 & 65408) >> 7 | var52 << 9) & 65535) >> 0 | ((var52 & 65408) >> 7 | var52 << 9) << 16) + 154 ^ 153) << 15
              )
              - 154
              - 206
              - 38
              + 233
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, us.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (-1755813043 - 2127083863 | 0) & 603979777; var36 < var20.length(); var36 += (-481078933 ^ 654400667 | 1) & 570446345) {
        int var60 = var20.charAt(var36) - '6' + 42 + 252;
        char var63 = (char)(
          (
              (((((((var60 & 65528) >> 3 | var60 << 13) ^ 169) + 8 & 65472) >> 6 | (((var60 & 65528) >> 3 | var60 << 13) ^ 169) + 8 << 10) ^ 204) & 65532) >> 2
                | ((((((var60 & 65528) >> 3 | var60 << 13) ^ 169) + 8 & 65472) >> 6 | (((var60 & 65528) >> 3 | var60 << 13) ^ 169) + 8 << 10) ^ 204) << 14
            )
            + 125
        );
        var20.setCharAt(
          var36,
          (char)(
            (
                (((((((var60 & 65528) >> 3 | var60 << 13) ^ 169) + 8 & 65472) >> 6 | (((var60 & 65528) >> 3 | var60 << 13) ^ 169) + 8 << 10) ^ 204) & 65532)
                    >> 2
                  | ((((((var60 & 65528) >> 3 | var60 << 13) ^ 169) + 8 & 65472) >> 6 | (((var60 & 65528) >> 3 | var60 << 13) ^ 169) + 8 << 10) ^ 204) << 14
              )
              + 125
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), us.class.getClassLoader()).returnType();
      switch ((((var4 ^ 785661688) - 366720297 - 933188331 - 1609847017 ^ 550756679) + 238015271 - 1905052506 ^ 132281256) + 1266925513 - 648699048) {
        case 38504721:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 815347229:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1540727577:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1666965675:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      rht[(((var10 + 1303847455 ^ 1219083024) - 182757165 - 1721568025 ^ 62202756) + 2116792244 ^ 686049376) - 1454271680 ^ 1653677935 ^ 201735222] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
