// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import net.minecraft.class_11905;
import net.minecraft.class_11908;
import net.minecraft.Identifier;
import net.minecraft.ItemStack;
import net.minecraft.DrawContext;
import net.minecraft.class_437;

public class oz extends class_437 implements yh {
  public kb ruk;
  public String vjy;
  public List eiq;
  public List vig;
  public int bj;
  public int vz;
  public int tk;
  public Set ule;
  public int vv;
  public int ng;
  public int de;
  public int rm;
  // [JNT] MethodHandle dispatch table (removed)
  public oz(mx var1, kb var2) {
    this.yri = var1;
    super(/* jnt */);
    this.vjy = "";
    this.bj = 0;
    this.vz = 11;
    this.tk = 6;
    this.vv = 40;
    this.ng = 8;
    this.de = 0;
    this.rm = 0;
    this.ruk = var2;
    this.ule = (HashSet)/* jnt */
    );
    this.eiq = (ArrayList)/* jnt */
    );
    this.vig = (ArrayList)/* jnt */
    );
  }
  public void method_25394(class_332 var1, int var2, int var3, float var4) {
    int var46 = 604880187;
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
    short var7 = 580;
    short var8 = 460;
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
    int var42 = /* jnt */);
    StringBuilder var10000 = (StringBuilder)/* jnt */;
    int var10001 = 1446849979 ^ 1446849979 ^ 0;
    StringBuilder var10002 = (StringBuilder)/* jnt */;

    label271:
    while (true) {
      var46 = 1581939780 << 429404461 ^ 2027614808;

      while (true) {
        label266: {
          StringBuilder var81;
          switch ((var46 ^ 99514165) - 2084702650 - 1607512031 + 890032457 + 397574455 + 747067532) {
            case -806357280:
            default:
              var81 = var10002;
              if (var10001 < ((1959612503 * -972649079 | 9) & 201725549)) {
                int var154 = /* jnt */ ^ 'N';
                char var157 = (char)(
                  (((((var154 & 65504) >> 5 | var154 << 11) & 65528) >> 3 | ((var154 & 65504) >> 5 | var154 << 11) << 13) + 208 & 65520) >> 4
                    | ((((var154 & 65504) >> 5 | var154 << 11) & 65528) >> 3 | ((var154 & 65504) >> 5 | var154 << 11) << 13) + 208 << 12
                );
                /* jnt */(
                    (((((var154 & 65504) >> 5 | var154 << 11) & 65528) >> 3 | ((var154 & 65504) >> 5 | var154 << 11) << 13) + 208 & 65520) >> 4
                      | ((((var154 & 65504) >> 5 | var154 << 11) & 65528) >> 3 | ((var154 & 65504) >> 5 | var154 << 11) << 13) + 208 << 12
                  )
                );
                var10001 += -1262823311 & -1633038752 ^ -1800877983;
                continue label271;
              }

              var46 = (403003093 ^ 1027970686 | -930000576) & -610445366;
              break;
            case 987185214:
              var81 = var10002;
              if (var10001 < ((598670007 | -408575234 ^ 1531122904 | 8) & 1073807626)) {
                int var128 = /* jnt */ - 172 ^ 153;
                int var10005 = (var128 & 65504) >> 5;
                int var129 = ((var128 & 65504) >> 5 | var128 << 11) - 71;
                int var178 = (((var128 & 65504) >> 5 | var128 << 11) - 71 & 65520) >> 4;
                char var130 = (char)(((var10005 | var128 << 11) - 71 & 65520) >> 4 | ((var128 & 65504) >> 5 | var128 << 11) - 71 << 12);
                /* jnt */(var178 | var129 << 12));
                var10001 += 1083023309 >>> -854253865 ^ 128;
                break label266;
              }

              var46 = -1047607402 << 1867060432 ^ -416158671;
          }

          switch ((var46 - 1948283133 ^ 141126857) - 337840219 - 1479573811 + 1017762244 ^ 2063001595) {
            case 263358408:
            default:
              /* jnt */
                  )
                ),
                var1,
                var9 + var7 / 2,
                var10 + 8,
                /* jnt *//* jnt */)
              );
              int var11 = var10 + 40;
              short var12 = 150;
              byte var13 = 30;
              int var14 = var9 + 20;
              int var15 = var14 + var12 + 10;
              zn var16 = null /* jnt:encrypted */ == 0
                ? /* jnt */
                : (zn)/* jnt */;
              /* jnt */var14, (double)var11, (double)(var14 + var12), (double)(var11 + var13), 5.0, 5.0, 5.0, 5.0
              );
              int var71 = (57308246 >>> -1900181183 - 1553203484 | 0) & 434152461;

              for (var82 = (StringBuilder)/* jnt */;
                var71 < ((-541936376 * -1675283529 | 8) & 33827145);
                var71 += (-1048491721 << 741088960 | 0) & 505950337
              ) {
                int var98 = /* jnt */ + '{';
                char var101 = (char)(
                  (
                      (((((var98 & 65472) >> 6 | var98 << 10) & 63488) >> 11 | ((var98 & 65472) >> 6 | var98 << 10) << 5) & 65528) >> 3
                        | ((((var98 & 65472) >> 6 | var98 << 10) & 63488) >> 11 | ((var98 & 65472) >> 6 | var98 << 10) << 5) << 13
                    )
                    + 203
                );
                /* jnt */(
                    (
                        (((((var98 & 65472) >> 6 | var98 << 10) & 63488) >> 11 | ((var98 & 65472) >> 6 | var98 << 10) << 5) & 65528) >> 3
                          | ((((var98 & 65472) >> 6 | var98 << 10) & 63488) >> 11 | ((var98 & 65472) >> 6 | var98 << 10) << 5) << 13
                      )
                      + 203
                  )
                );
              }

              /* jnt */,
                var1,
                var14 + var12 / 2,
                var11 + 8,
                /* jnt *//* jnt */)
              );
              zn var17 = null /* jnt:encrypted */ == 1
                ? /* jnt */
                : (zn)/* jnt */;
              /* jnt */var15, (double)var11, (double)(var15 + var12), (double)(var11 + var13), 5.0, 5.0, 5.0, 5.0
              );
              int var43 = /* jnt */);
              var10000 = (StringBuilder)/* jnt */;
              var10001 = 1199948236 & 1199948236 ^ 1199948236;

              for (var10002 = (StringBuilder)/* jnt */;
                var10001 < ((-137224778 + 1187415218 | 2) & 23413130);
                var10001 += (188110171 & 188110171 | 0) & 4728965
              ) {
                char var137 = /* jnt */;
                char var138 = (char)(((var137 & '\uffff') >> 0 | var137 << 16) + 0 + 114 + 209 - 74);
                /* jnt */(((var137 & '\uffff') >> 0 | var137 << 16) + 0 + 114 + 209 - 74)
                );
              }

              /* jnt */
                      ),
                      var43
                    ),
                    ")"
                  )
                ),
                var1,
                var15 + var12 / 2,
                var11 + 8,
                /* jnt *//* jnt */)
              );
              int var18 = var9 + 20;
              int var19 = var11 + var13 + 10;
              int var20 = var7 - 40;
              byte var21 = 30;
              if (null /* jnt:encrypted */ == 0) {
                /* jnt *//* jnt */,
                  (double)var18,
                  (double)var19,
                  (double)(var18 + var20),
                  (double)(var19 + var21),
                  5.0,
                  5.0,
                  5.0,
                  5.0
                );
                /* jnt *//* jnt */,
                  (double)var18,
                  (double)var19,
                  (double)(var18 + var20),
                  (double)(var19 + var21),
                  5.0,
                  5.0,
                  5.0,
                  5.0,
                  1.0
                );
                String var74 = null /* jnt:encrypted */;
                String var45 = /* jnt */ % 1000L > 500L ? "|" : "";
                String var44 = var74;
                var10000 = (StringBuilder)/* jnt */;
                var10001 = -1092206976 ^ -1092206976 ^ 0;

                for (var10002 = (StringBuilder)/* jnt */;
                  var10001 < ((-135048460 * -1251742674 | 8) & 135266350);
                  var10001 += -1724610737 >>> -74827172 ^ 8
                ) {
                  int var141 = /* jnt */ - 149;
                  char var144 = (char)(
                    (((((var141 & 65535) >> 0 | var141 << 16) & 65535) >> 0 | ((var141 & 65535) >> 0 | var141 << 16) << 16) - 195 & 65408) >> 7
                      | ((((var141 & 65535) >> 0 | var141 << 16) & 65535) >> 0 | ((var141 & 65535) >> 0 | var141 << 16) << 16) - 195 << 9
                  );
                  /* jnt */(
                      (((((var141 & 65535) >> 0 | var141 << 16) & 65535) >> 0 | ((var141 & 65535) >> 0 | var141 << 16) << 16) - 195 & 65408) >> 7
                        | ((((var141 & 65535) >> 0 | var141 << 16) & 65535) >> 0 | ((var141 & 65535) >> 0 | var141 << 16) << 16) - 195 << 9
                    )
                  );
                }

                /* jnt */
                        ),
                        var44
                      ),
                      var45
                    )
                  ),
                  var1,
                  var18 + 10,
                  var19 + 8,
                  /* jnt *//* jnt */)
                );
              }

              label302: {
                int var22 = var9 + 20;
                int var23 = null /* jnt:encrypted */ == 0 ? var19 + var21 + 15 : var19 + 15;
                int var24 = var7 - 40;
                int var25 = var8 - (var23 - var10) - 75;
                /* jnt *//* jnt */,
                  (double)var22,
                  (double)var23,
                  (double)(var22 + var24),
                  (double)(var23 + var25),
                  5.0,
                  5.0,
                  5.0,
                  5.0
                );
                Object var26 = null /* jnt:encrypted */ == 0
                  ? null /* jnt:encrypted */
                  : (ArrayList)/* jnt */
                  );
                int var27 = null /* jnt:encrypted */ == 0
                  ? null /* jnt:encrypted */
                  : null /* jnt:encrypted */;
                int var28 = (int)/* jnt *//* jnt */ / 11.0
                );
                byte var29 = 48;
                int var30 = /* jnt */;
                if (null /* jnt:encrypted */ == 0) {
                  null /* jnt:encrypted */
                  );
                  var27 = null /* jnt:encrypted */;
                  var46 = (1142343353 << 1651499520 | 1088964672) & -923931577;
                } else {
                  var46 = (442271100 | 1422406111 | -249446376) & -144442081;
                }

                label231:
                while (true) {
                  label303: {
                    int var31;
                    int var32;
                    int var33;
                    int var34;
                    switch ((var46 - 469738491 + 38906958 - 1572298517 ^ 1103518002) - 442120223 + 11181152) {
                      case 336525755:
                        var31 = /* jnt */, 66
                        );
                        var32 = var27 * 11;
                        var33 = /* jnt */
                        );
                        var34 = var32;
                        var46 = (474981333 >>> 1197715648 | 1094340613) & -348496651;
                        break;
                      case 613100464:
                        null /* jnt:encrypted */
                        );
                        var27 = null /* jnt:encrypted */;
                        var46 = (1142343353 << 1651499520 | 1088964672) & -923931577;
                        continue;
                      case 1855033486:
                      default:
                        if (var28 <= 6) {
                          break label303;
                        }

                        var31 = 6;
                        var32 = var22 + var24 - var31 - 5;
                        var33 = var23 + 5;
                        var34 = var25 - 10;
                        /* jnt *//* jnt */,
                          (double)var32,
                          (double)var33,
                          (double)(var32 + var31),
                          (double)(var33 + var34),
                          3.0,
                          3.0,
                          3.0,
                          3.0
                        );
                        if (var30 > 0) {
                          float var35 = (float)var27 / (float)var30;
                          float var36 = /* jnt */var34 * (6.0F / (float)var28));
                          int var37 = var33 + (int)(((float)var34 - var36) * var35);
                          /* jnt */,
                            (double)var32,
                            (double)var37,
                            (double)(var32 + var31),
                            (double)((float)var37 + var36),
                            3.0,
                            3.0,
                            3.0,
                            3.0
                          );
                          break label303;
                        }

                        var46 = (-404875354 ^ -1030687534 | 1359221761) & -754084687;
                    }

                    label225:
                    while (true) {
                      switch ((var46 + 594774015 ^ 363668063) - 177963041 ^ 1895421877 ^ 1842342781 ^ 365605195) {
                        case -1592283470:
                          var76 = (-1410499685 & -1410499685 | 0) & 164896;
                          var88 = (StringBuilder)/* jnt */;
                          var46 = 1376488948 * -1929867764 ^ -1952451712;
                          break label231;
                        case 1211375311:
                          if (!/* jnt */) {
                            break label302;
                          }

                          if (null /* jnt:encrypted */ == 0) {
                            var76 = 1987981591 & 832083546 ^ 806883346;
                            var88 = (StringBuilder)/* jnt */;
                            var46 = 1361877371 >> -163469352 ^ 146966406;
                            break label231;
                          }

                          var46 = (-438466910 << 322784677 | 1964484878) & 2113403311;
                          continue;
                        case 1584214989:
                        default:
                          float var52 = 0.0F;
                          float var55 = /* jnt */var34 * (6.0F / (float)var28));
                          int var58 = var33 + (int)(((float)var34 - var55) * var52);
                          /* jnt */,
                            (double)var32,
                            (double)var58,
                            (double)(var32 + var31),
                            (double)((float)var58 + var55),
                            3.0,
                            3.0,
                            3.0,
                            3.0
                          );
                          break label225;
                        case 1721366505:
                      }

                      if (var34 < var33) {
                        int var51 = (var34 - var32) / 11;
                        int var54 = (var34 - var32) % 11;
                        int var57 = var22 + 5 + var54 * var29;
                        int var38 = var23 + 5 + var51 * var29;
                        jzj var39 = (jzj)/* jnt */;
                        boolean var40 = /* jnt */, var39
                        );
                        zn var41 = var40
                          ? /* jnt */
                          : (zn)/* jnt */;
                        /* jnt */var57, (double)var38, (double)(var57 + 40), (double)(var38 + 40), 4.0, 4.0, 4.0, 4.0
                        );
                        /* jnt *//* jnt */
                            )
                          ),
                          var57,
                          var38,
                          40,
                          2.0F
                        );
                        if (var2 >= var57 && var2 <= var57 + 40 && var3 >= var38 && var3 <= var38 + 40) {
                          /* jnt */,
                            (double)var57,
                            (double)var38,
                            (double)(var57 + 40),
                            (double)(var38 + 40),
                            4.0,
                            4.0,
                            4.0,
                            4.0,
                            1.0
                          );
                        }

                        var46 = 1563493990 - -1725330145 ^ 1182348457;

                        while (true) {
                          switch (var46 + 587428780 - 84907334 + 86501225 - 1372905587 + 1465970627 - 378011994) {
                            case -1801576013:
                              if (var40) {
                                /* jnt *//* jnt */)
                                );
                              }

                              var46 = (1107160164 * (1121360275 >>> 1107160164 - 1121360275) | 378816035) & 531980019;
                              break;
                            case 682896040:
                            default:
                              var34++;
                              var46 = (474981333 >>> 1197715648 | 1094340613) & -348496651;
                              continue label225;
                          }
                        }
                      } else {
                        var46 = -155611822 - -751389116 ^ 416775741;
                      }
                    }
                  }

                  var46 = (-1418848673 >>> 1046720558 | -472120830) & -337747125;
                }

                label181:
                while (true) {
                  switch (((var46 - 325761857 ^ 221302687) + 993894878 + 1612097951 ^ 1114059730) - 1739258850) {
                    case -1718886755:
                      var10000 = var88;
                      if (var76 >= ((2110329663 * -1377074168 | 16) & 11856403)) {
                        var46 = (678955826 ^ -1910134898 >>> -1806985442 | 654708271) & -8413633;
                        break label181;
                      }

                      char var110 = /* jnt */;
                      char var113 = (char)(
                        (
                              ((((var110 & '\uffc0') >> 6 | var110 << '\n') + 223 & 65535) >> 0 | ((var110 & '\uffc0') >> 6 | var110 << '\n') + 223 << 16)
                                  - 175
                                & 65472
                            )
                            >> 6
                          | ((((var110 & '\uffc0') >> 6 | var110 << '\n') + 223 & 65535) >> 0 | ((var110 & '\uffc0') >> 6 | var110 << '\n') + 223 << 16) - 175
                            << 10
                      );
                      /* jnt */(
                          (
                                ((((var110 & '\uffc0') >> 6 | var110 << '\n') + 223 & 65535) >> 0 | ((var110 & '\uffc0') >> 6 | var110 << '\n') + 223 << 16)
                                    - 175
                                  & 65472
                              )
                              >> 6
                            | ((((var110 & '\uffc0') >> 6 | var110 << '\n') + 223 & 65535) >> 0 | ((var110 & '\uffc0') >> 6 | var110 << '\n') + 223 << 16)
                                - 175
                              << 10
                        )
                      );
                      var76 += (-1907229196 | 669945404) ^ -1342177283;
                      var46 = 1376488948 * -1929867764 ^ -1952451712;
                      break;
                    case 1781629298:
                    default:
                      var10000 = var88;
                      if (var76 >= (-33926426 + 93491167 ^ 59564744)) {
                        var46 = 960696206 ^ -790363117 ^ -1611578414;
                        break label181;
                      }

                      /* jnt */(((/* jnt */ + 232 ^ 231) + 194 ^ 79) + 122)
                      );
                      var76 += 350418906 ^ 350418906 ^ 1;
                      var46 = 1361877371 >> -163469352 ^ 146966406;
                  }
                }
                String var49 = switch ((var46 ^ 1579044539 ^ 950264765 ^ 1104678425) + 526229193 + 472112663 - 928315312) {
                  default -> /* jnt */;
                  case 1432383616 -> /* jnt */;
                };
                /* jnt *//* jnt */)
                );
              }

              int var50 = var10 + var8 - 40;
              byte var53 = 100;
              byte var56 = 30;
              int var59 = var9 + var7 - var53 - 20;
              int var60 = var59 - var53 - 10;
              int var61 = var60 - var53 - 10;
              /* jnt */,
                (double)var59,
                (double)var50,
                (double)(var59 + var53),
                (double)(var50 + var56),
                5.0,
                5.0,
                5.0,
                5.0
              );
              int var79 = 1504396872 ^ -1153011146 ^ -487771010;
              StringBuilder var91 = (StringBuilder)/* jnt */;

              label160:
              while (true) {
                var46 = (-841823241 * 403521609 | 476477384) & -1635878933;

                while (true) {
                  label156:
                  while (true) {
                    label154: {
                      switch (var46 + 242123066 + 2045299205 - 1946354771 ^ 198197396 ^ 1494042109 ^ 344063648) {
                        case -186235618:
                          var10000 = var91;
                          if (var79 < ((21512485 + 21512485 + -352199748 | 4) & 38281716)) {
                            char var123 = /* jnt */;
                            char var126 = (char)(
                              (
                                  ((((((var123 & 0) >> 16 | var123 << 0) & 64512) >> 10 | ((var123 & 0) >> 16 | var123 << 0) << 6) ^ 29) & 65532) >> 2
                                    | (((((var123 & 0) >> 16 | var123 << 0) & 64512) >> 10 | ((var123 & 0) >> 16 | var123 << 0) << 6) ^ 29) << 14
                                )
                                - 31
                            );
                            /* jnt */(
                                (
                                    ((((((var123 & 0) >> 16 | var123 << 0) & 64512) >> 10 | ((var123 & 0) >> 16 | var123 << 0) << 6) ^ 29) & 65532) >> 2
                                      | (((((var123 & 0) >> 16 | var123 << 0) & 64512) >> 10 | ((var123 & 0) >> 16 | var123 << 0) << 6) ^ 29) << 14
                                  )
                                  - 31
                              )
                            );
                            var79 += -1034029318 << 1027489727 ^ 1;
                            continue label160;
                          }

                          var46 = -2122323949 ^ 806280718 ^ -1837587858;
                          break;
                        case 323735880:
                        default:
                          var10000 = var91;
                          if (var79 < (-197661188 - (-666496356 << -666496356) ^ 876080629)) {
                            char var118 = /* jnt */;
                            int var170 = (var118 & '￠') >> 5;
                            int var119 = (var118 & '￠') >> 5 | var118 << 11;
                            int var171 = (((var118 & '￠') >> 5 | var118 << 11) & 65528) >> 3;
                            char var120 = (char)((((var170 | var118 << 11) & 65528) >> 3 | ((var118 & '￠') >> 5 | var118 << 11) << 13) + 103 + 127 - 110);
                            /* jnt */((var171 | var119 << 13) + 103 + 127 - 110)
                            );
                            var79 += (-2103687517 >> -2103687517 | 1) & 195053097;
                            break label156;
                          }

                          var46 = -1920473859 << 574183787 ^ 74533302;
                          break;
                        case 384334936:
                          var10000 = var91;
                          if (var79 < ((-132982260 * -10558255 | 2) & -2147418090)) {
                            /* jnt */(/* jnt */ - '&' + 167 - 41 + 103 - 228)
                            );
                            var79 += (17368353 - -1503471333 | 1) & 89231825;
                            break label154;
                          }

                          var46 = -143283630 & 1584855671 ^ 704290997;
                      }

                      switch (var46 - 500861352 - 1413889750 + 386412453 + 2145723921 + 387078882 - 548397603) {
                        case -1698885410:
                          /* jnt */,
                            var1,
                            var60 + var53 / 2,
                            var50 + 8,
                            /* jnt *//* jnt */)
                          );
                          /* jnt *//* jnt */,
                            (double)var61,
                            (double)var50,
                            (double)(var61 + var53),
                            (double)(var50 + var56),
                            5.0,
                            5.0,
                            5.0,
                            5.0
                          );
                          var79 = (850098131 * -626613745 | 0) & 16928800;
                          var91 = (StringBuilder)/* jnt */;
                          break label156;
                        case 1043896938:
                        default:
                          /* jnt */,
                            var1,
                            var59 + var53 / 2,
                            var50 + 8,
                            /* jnt *//* jnt */)
                          );
                          /* jnt *//* jnt */,
                            (double)var60,
                            (double)var50,
                            (double)(var60 + var53),
                            (double)(var50 + var56),
                            5.0,
                            5.0,
                            5.0,
                            5.0
                          );
                          var79 = (-2013716190 | -2013716190) ^ -2013716190;
                          var91 = (StringBuilder)/* jnt */;
                          break;
                        case 1451599789:
                          /* jnt */,
                            var1,
                            var61 + var53 / 2,
                            var50 + 8,
                            /* jnt *//* jnt */)
                          );
                          /* jnt */;
                          return;
                      }
                    }

                    var46 = -1661763954 ^ 246485207 << 975627098 ^ -57459157;
                  }

                  var46 = -1207068602 & -1309786212 ^ -254870639;
                }
              }
            case 1469658049:
              var10000 = /* jnt */
                ),
                var42
              );
              var10001 = (263973251 & 263973251 & 263973251 | 0) & 1346633732;
              var10002 = (StringBuilder)/* jnt */;
          }
        }

        var46 = (518478756 ^ 1511870236 | -1739773602) & -1706198529;
      }
    }
  }
  public boolean method_25402(class_11909 var1, boolean var2) {
    int var37 = -1602463966;
    int var3 = /* jnt */);
    int var4 = /* jnt */);
    int var5 = /* jnt */)
      )
    );
    int var6 = /* jnt */)
      )
    );
    short var7 = 580;
    short var8 = 460;
    int var9 = (var5 - var7) / 2;
    int var10 = (var6 - var8) / 2;
    int var11 = var10 + 40;
    short var12 = 150;
    byte var13 = 30;
    int var14 = var9 + 20;
    int var15 = var14 + var12 + 10;
    if (/* jnt */var3, (double)var4, var14, var11, var12, var13)) {
      null /* jnt:encrypted */;
      return true;
    } else {
      var37 = (2091940713 | 8386040 + -388105419 | 118620160) & 1599844391;

      while (true) {
        switch (((var37 ^ 485184390) - 2069863781 + 645792590 ^ 1533707072 ^ 1839223559) - 1614513598) {
          case -616548496:
          default:
            int var16 = var10 + var8 - 40;
            byte var17 = 100;
            byte var18 = 30;
            int var19 = var9 + var7 - var17 - 20;
            int var20 = var19 - var17 - 10;
            int var21 = var20 - var17 - 10;
            if (/* jnt */var3, (double)var4, var19, var16, var17, var18)) {
              /* jnt */,
                (HashSet)/* jnt */
                )
              );
              /* jnt */),
                (yva)null /* jnt:encrypted */null /* jnt:encrypted */
                )
              );
              return true;
            } else {
              var37 = (625962984 | 613371116) ^ 18452583;

              while (true) {
                switch ((var37 + 1327047169 - 1714133306 + 212089171 ^ 162241400) + 76696900 + 532699154) {
                  case -2011020540:
                    int var22 = var11 + var13 + 10;
                    int var23 = var9 + 20;
                    int var24 = null /* jnt:encrypted */ == 0 ? var22 + 30 + 15 : var22 + 15;
                    int var25 = var7 - 40;
                    int var26 = var8 - (var24 - var10) - 75;
                    Object var10000;
                    if (/* jnt */var3, (double)var4, var23, var24, var25, var26)) {
                      if (null /* jnt:encrypted */ == 0) {
                        var10000 = null /* jnt:encrypted */;
                      } else {
                        var37 = (1405508277 | 1405508277 - 1405508277) ^ 862617457;
                        switch ((var37 ^ 2130702413) - 49891648 + 691324686 + 381308369 + 1767775981 - 1664694889) {
                          case -1933843645:
                          default:
                            return /* jnt */;
                          case 1634633132:
                            var10000 = (ArrayList)/* jnt */
                            );
                        }
                      }
                    } else {
                      var37 = (1491974908 | -805122991 | 655410021) & 928957295;
                      switch ((var37 ^ 2130702413) - 49891648 + 691324686 + 381308369 + 1767775981 - 1664694889) {
                        case -1933843645:
                        default:
                          return /* jnt */;
                        case 1634633132:
                          var10000 = (ArrayList)/* jnt */
                          );
                      }
                    }

                    while (true) {
                      Object var27 = var10000;
                      int var28 = null /* jnt:encrypted */ == 0
                        ? null /* jnt:encrypted */
                        : null /* jnt:encrypted */;
                      byte var29 = 48;
                      int var30 = var28 * 11;
                      int var31 = var3 - var23 - 5;
                      int var32 = var4 - var24 - 5;
                      int var33 = var31 / var29;
                      int var34 = var32 / var29;
                      if (var33 >= 0 && var33 < 11) {
                        int var35 = var30 + var34 * 11 + var33;
                        if (var35 >= 0 && var35 < /* jnt */) {
                          jzj var36 = (jzj)/* jnt */;
                          if (/* jnt */, var36
                          )) {
                            /* jnt */, var36
                            );
                            var37 = (390182407 << (1946505897 ^ -300938296) | -721094191) & -183632933;
                          } else {
                            var37 = (-365153186 >>> -470053284 | 741992376) & -289802311;
                          }

                          while (true) {
                            switch ((((var37 ^ 1566531584) + 592578244 ^ 806170316) + 2069640368 ^ 544785898) - 237782583) {
                              case -230897069:
                              default:
                                /* jnt */, var36
                                );
                                var37 = (390182407 << (1946505897 ^ -300938296) | -721094191) & -183632933;
                                break;
                              case 1213776050:
                                return true;
                            }
                          }
                        }
                      }

                      var37 = (1491974908 | -805122991 | 655410021) & 928957295;
                      switch ((var37 ^ 2130702413) - 49891648 + 691324686 + 381308369 + 1767775981 - 1664694889) {
                        case -1933843645:
                        default:
                          return /* jnt */;
                        case 1634633132:
                          var10000 = (ArrayList)/* jnt */
                          );
                      }
                    }
                  case -1852484859:
                  default:
                    if (/* jnt */var3, (double)var4, var21, var16, var17, var18)) {
                      /* jnt */);
                      return true;
                    }

                    var37 = 113434414 ^ 113434414 ^ 1959937212;
                    break;
                  case 940965939:
                    if (/* jnt */var3, (double)var4, var20, var16, var17, var18)) {
                      /* jnt */
                        ),
                        (yva)null /* jnt:encrypted */null /* jnt:encrypted */
                        )
                      );
                      return true;
                    }

                    var37 = (-1575181122 | -1575181122 | 1296519297) & 2144829437;
                }
              }
            }
          case 2009732109:
            if (/* jnt */var3, (double)var4, var15, var11, var12, var13)) {
              null /* jnt:encrypted */;
              return true;
            }

            var37 = (-777728914 + (2142932104 >>> -777728914) | 2121798662) & 2121815078;
        }
      }
    }
  }
  public boolean method_25401(double var1, double var3, double var5, double var7) {
    Object var10000;
    label58: {
      int var24 = 837519434;
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
      short var11 = 580;
      short var12 = 460;
      int var13 = (var9 - var11) / 2;
      int var14 = (var10 - var12) / 2;
      int var15 = var14 + 40;
      int var16 = var15 + 30 + 10;
      int var17 = var13 + 20;
      int var18 = null /* jnt:encrypted */ == 0 ? var16 + 30 + 15 : var16 + 15;
      int var19 = var11 - 40;
      int var20 = var12 - (var18 - var14) - 75;
      if (/* jnt */) {
        if (null /* jnt:encrypted */ == 0) {
          var10000 = null /* jnt:encrypted */;
          break label58;
        }

        var24 = (-559909944 >>> -559909944 | 1495799276) & 1504525804;
      } else {
        var24 = (-2004219776 | -2004219776 + -2004219776 | 877905546) & -1132472578;
      }

      switch (var24 + 2002381229 - 2050343913 - 857971729 - 1164388348 ^ 168381972 ^ 1516455648) {
        case -1909481641:
        default:
          var10000 = (ArrayList)/* jnt */
          );
          break;
        case 278081717:
          return /* jnt */;
      }
    }

    Object var21 = var10000;
    int var22 = (int)/* jnt *//* jnt */ / 11.0
    );
    int var23 = /* jnt */;
    int var28;
    if (null /* jnt:encrypted */ == 0) {
      if (var7 > 0.0) {
        null /* jnt:encrypted */
        );
        var28 = (-695258892 * -639761724 | 1544116389) & 1547533567;
      } else {
        var28 = (-79842853 >> -978610679 | 855777446) & -215751234;
      }
    } else {
      var28 = (-348495350 | 213947096 | -1295815371) & -1228410955;
    }

    while (true) {
      switch (((var28 - 561732416 ^ 1888349812) - 886758308 + 810544979 ^ 199970407) + 2120689516) {
        case -859213693:
          return true;
        case 366550090:
        default:
          if (var7 < 0.0) {
            null /* jnt:encrypted */
            );
          }
          break;
        case 568335032:
          if (var7 < 0.0) {
            null /* jnt:encrypted */
            );
          }
          break;
        case 1765337923:
          if (var7 > 0.0) {
            null /* jnt:encrypted */
            );
            var28 = (-695258892 * -639761724 | 1544116389) & 1547533567;
          } else {
            var28 = (1876973712 ^ -398246037 | -15957432) & -10573236;
          }
          continue;
      }

      var28 = (-695258892 * -639761724 | 1544116389) & 1547533567;
    }
  }

  public boolean method_25404(class_11908 var1) {
    int var2 = -2063372774;
    if (/* jnt */ == 256) {
      /* jnt */,
        (HashSet)/* jnt */
        )
      );
      /* jnt */),
        (yva)null /* jnt:encrypted */null /* jnt:encrypted */)
      );
      return true;
    } else {
      var2 = 1371034467 ^ -1256099501 ^ 1459014815;

      while (true) {
        switch (((var2 ^ 2026896877) - 165644261 ^ 1819878961) - 339393260 + 1266395315 + 1393952487) {
          case -435828102:
          default:
            return /* jnt */;
          case 902009742:
            if (/* jnt */ == 257) {
              /* jnt */,
                (HashSet)/* jnt */
                )
              );
              /* jnt */),
                (yva)null /* jnt:encrypted */null /* jnt:encrypted */
                )
              );
              return true;
            }

            var2 = (-1546834246 >> 1622135768 | 137921037) & 964200015;
            break;
          case 923836954:
            if (null /* jnt:encrypted */ == 0
              && /* jnt */ == 259) {
              if (!/* jnt */
              )) {
                null /* jnt:encrypted */
                      - 1
                  )
                );
                /* jnt */;
              }

              var2 = -1564488625 * (-109558415 + 1456031062) ^ -2143530933;
              break;
            }

            var2 = (-68120016 >>> -1326712959 | -1610433197) & -1472282757;
            break;
          case 1945721225:
            return true;
        }
      }
    }
  }

  public boolean method_25400(class_11905 var1) {
    if (null /* jnt:encrypted */ == 0) {
      String var10001 = null /* jnt:encrypted */;
      String var3 = /* jnt */;
      String var2 = var10001;
      null /* jnt:encrypted */,
            var3
          )
        )
      );
      /* jnt */;
    }

    return true;
  }

  public void vrt() {
    if (/* jnt */)) {
      null /* jnt:encrypted *//* jnt */
        )
      );
    } else {
      String var1 = /* jnt */
      );
      null /* jnt:encrypted *//* jnt */
            ),
            (Predicate<jzj>)var1x -> /* jnt */
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
    int var10001 = (var10 ^ 1805496139) + 1765087715 + 1649787593 - 466912378 + 1550231805 - 1666775320 - 347222393 - 1467893317 ^ 1469442737;
    MethodHandle var10000 = lcb[((var10 ^ 1805496139) + 1765087715 + 1649787593 - 466912378 + 1550231805 - 1666775320 - 347222393 - 1467893317 ^ 1469442737)
      + 1229743857];
    if (lcb[var10001 + 1229743857] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (-300384792 ^ -1242068927 | 0) & -1609563632;
        var23 < var13.length();
        var23 += (1034744087 | -185531467 | 1034744087 ^ -185531467) ^ -33688650
      ) {
        int var42 = var13.charAt(var23) + '&';
        int var10004 = (var42 & 65408) >> 7;
        int var43 = (var42 & 65408) >> 7 | var42 << 9;
        int var91 = (((var42 & 65408) >> 7 | var42 << 9) & 65528) >> 3;
        var42 = ((var10004 | var42 << 9) & 65528) >> 3 | ((var42 & 65408) >> 7 | var42 << 9) << 13;
        var10004 = ((var91 | var43 << 13) & 65520) >> 4;
        int var45 = (((var91 | var43 << 13) & 65520) >> 4 | var42 << 12) - 217 + 151 - 109 ^ 191;
        int var93 = (((((var91 | var43 << 13) & 65520) >> 4 | var42 << 12) - 217 + 151 - 109 ^ 191) & 65528) >> 3;
        char var46 = (char)(
          (
              (((var10004 | var42 << 12) - 217 + 151 - 109 ^ 191) & 65528) >> 3
                | ((((var91 | var43 << 13) & 65520) >> 4 | var42 << 12) - 217 + 151 - 109 ^ 191) << 13
            )
            - 131
        );
        var13.setCharAt(var23, (char)((var93 | var45 << 13) - 131));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (-923368606 >> -329183463 | 0) & 17; var29 < var16.length(); var29 += (-243354656 >> 961398076 | 0) & 1) {
        int var51 = var16.charAt(var29) + 213 - 11 - 6;
        char var56 = (char)(
          (
                (
                    (
                          (
                              (
                                    (((((var51 & 32768) >> 15 | var51 << 1) & 32768) >> 15 | ((var51 & 32768) >> 15 | var51 << 1) << 1) & 65472) >> 6
                                      | ((((var51 & 32768) >> 15 | var51 << 1) & 32768) >> 15 | ((var51 & 32768) >> 15 | var51 << 1) << 1) << 10
                                  )
                                  - 75
                                ^ 61
                            )
                            & 57344
                        )
                        >> 13
                      | (
                          (
                                (((((var51 & 32768) >> 15 | var51 << 1) & 32768) >> 15 | ((var51 & 32768) >> 15 | var51 << 1) << 1) & 65472) >> 6
                                  | ((((var51 & 32768) >> 15 | var51 << 1) & 32768) >> 15 | ((var51 & 32768) >> 15 | var51 << 1) << 1) << 10
                              )
                              - 75
                            ^ 61
                        )
                        << 3
                  )
                  & 65024
              )
              >> 9
            | (
                (
                      (
                          (
                                (((((var51 & 32768) >> 15 | var51 << 1) & 32768) >> 15 | ((var51 & 32768) >> 15 | var51 << 1) << 1) & 65472) >> 6
                                  | ((((var51 & 32768) >> 15 | var51 << 1) & 32768) >> 15 | ((var51 & 32768) >> 15 | var51 << 1) << 1) << 10
                              )
                              - 75
                            ^ 61
                        )
                        & 57344
                    )
                    >> 13
                  | (
                      (
                            (((((var51 & 32768) >> 15 | var51 << 1) & 32768) >> 15 | ((var51 & 32768) >> 15 | var51 << 1) << 1) & 65472) >> 6
                              | ((((var51 & 32768) >> 15 | var51 << 1) & 32768) >> 15 | ((var51 & 32768) >> 15 | var51 << 1) << 1) << 10
                          )
                          - 75
                        ^ 61
                    )
                    << 3
              )
              << 7
        );
        var16.setCharAt(
          var29,
          (char)(
            (
                  (
                      (
                            (
                                (
                                      (((((var51 & 32768) >> 15 | var51 << 1) & 32768) >> 15 | ((var51 & 32768) >> 15 | var51 << 1) << 1) & 65472) >> 6
                                        | ((((var51 & 32768) >> 15 | var51 << 1) & 32768) >> 15 | ((var51 & 32768) >> 15 | var51 << 1) << 1) << 10
                                    )
                                    - 75
                                  ^ 61
                              )
                              & 57344
                          )
                          >> 13
                        | (
                            (
                                  (((((var51 & 32768) >> 15 | var51 << 1) & 32768) >> 15 | ((var51 & 32768) >> 15 | var51 << 1) << 1) & 65472) >> 6
                                    | ((((var51 & 32768) >> 15 | var51 << 1) & 32768) >> 15 | ((var51 & 32768) >> 15 | var51 << 1) << 1) << 10
                                )
                                - 75
                              ^ 61
                          )
                          << 3
                    )
                    & 65024
                )
                >> 9
              | (
                  (
                        (
                            (
                                  (((((var51 & 32768) >> 15 | var51 << 1) & 32768) >> 15 | ((var51 & 32768) >> 15 | var51 << 1) << 1) & 65472) >> 6
                                    | ((((var51 & 32768) >> 15 | var51 << 1) & 32768) >> 15 | ((var51 & 32768) >> 15 | var51 << 1) << 1) << 10
                                )
                                - 75
                              ^ 61
                          )
                          & 57344
                      )
                      >> 13
                    | (
                        (
                              (((((var51 & 32768) >> 15 | var51 << 1) & 32768) >> 15 | ((var51 & 32768) >> 15 | var51 << 1) << 1) & 65472) >> 6
                                | ((((var51 & 32768) >> 15 | var51 << 1) & 32768) >> 15 | ((var51 & 32768) >> 15 | var51 << 1) << 1) << 10
                            )
                            - 75
                          ^ 61
                      )
                      << 3
                )
                << 7
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), oz.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = 1275114952 ^ 1099893353 ^ 227524513; var35 < var19.length(); var35 += (-900358299 & -900358299 | 1) & 84025473) {
        int var61 = var19.charAt(var35) - 246;
        int var99 = (var61 & 61440) >> 12;
        int var62 = ((var61 & 61440) >> 12 | var61 << 4) + 95;
        int var100 = (((var61 & 61440) >> 12 | var61 << 4) + 95 & 61440) >> 12;
        var61 = ((var99 | var61 << 4) + 95 & 61440) >> 12 | ((var61 & 61440) >> 12 | var61 << 4) + 95 << 4;
        var99 = ((var100 | var62 << 4) & 65472) >> 6;
        int var64 = ((var100 | var62 << 4) & 65472) >> 6 | var61 << 10;
        int var102 = ((((var100 | var62 << 4) & 65472) >> 6 | var61 << 10) & 61440) >> 12;
        var61 = ((var99 | var61 << 10) & 61440) >> 12 | (((var100 | var62 << 4) & 65472) >> 6 | var61 << 10) << 4;
        var99 = ((var102 | var64 << 4) & 65528) >> 3;
        int var66 = ((((var102 | var64 << 4) & 65528) >> 3 | var61 << 13) ^ 56) - 58;
        int var104 = (((((var102 | var64 << 4) & 65528) >> 3 | var61 << 13) ^ 56) - 58 & 65472) >> 6;
        char var67 = (char)((((var99 | var61 << 13) ^ 56) - 58 & 65472) >> 6 | ((((var102 | var64 << 4) & 65528) >> 3 | var61 << 13) ^ 56) - 58 << 10);
        var19.setCharAt(var35, (char)(var104 | var66 << 10));
      }

      Class var7 = Class.forName(var19.toString(), false, oz.class.getClassLoader());
      switch ((((var4 ^ 351100077 ^ 1186397895) + 1487087951 - 754205761 ^ 1627327067) - 1940811594 ^ 700705213) - 1126170619 + 1483140086 + 1624175522) {
        case 284429957:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 616163157:
        case 855748137:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 926204960:
          var10000 = var0.findSpecial(var7, var5, var6, oz.class);
          break;
        case 934159289:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    lcb[((var10 ^ 1805496139) + 1765087715 + 1649787593 - 466912378 + 1550231805 - 1666775320 - 347222393 - 1467893317 ^ 1469442737) + 1229743857] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = var10 + 1296578715 + 1478354565 - 1962029555 - 1932356664 - 123115317 + 2082459935 + 2071418387 + 1893217780 + 609290193;
    MethodHandle var10000 = lcb[var10
      + 1296578715
      + 1478354565
      - 1962029555
      - 1932356664
      - 123115317
      + 2082459935
      + 2071418387
      + 1893217780
      + 609290193
      - 308283723];
    if (lcb[var10001 - 308283723] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = 331761670 & 990134383 ^ 319045638; var24 < var14.length(); var24 += (183612662 + 183612662 | 1) & 134222867) {
        int var43 = var14.charAt(var24) ^ '7';
        char var48 = (char)(
          (
                (
                      (
                          (
                                (
                                    (
                                          ((((var43 & 61440) >> 12 | var43 << 4) - 128 & 57344) >> 13 | ((var43 & 61440) >> 12 | var43 << 4) - 128 << 3) - 196
                                            & 65504
                                        )
                                        >> 5
                                      | ((((var43 & 61440) >> 12 | var43 << 4) - 128 & 57344) >> 13 | ((var43 & 61440) >> 12 | var43 << 4) - 128 << 3) - 196
                                        << 11
                                  )
                                  & 0
                              )
                              >> 16
                            | (
                                (((((var43 & 61440) >> 12 | var43 << 4) - 128 & 57344) >> 13 | ((var43 & 61440) >> 12 | var43 << 4) - 128 << 3) - 196 & 65504)
                                    >> 5
                                  | ((((var43 & 61440) >> 12 | var43 << 4) - 128 & 57344) >> 13 | ((var43 & 61440) >> 12 | var43 << 4) - 128 << 3) - 196 << 11
                              )
                              << 0
                        )
                        & 0
                    )
                    >> 16
                  | (
                      (
                            (
                                (((((var43 & 61440) >> 12 | var43 << 4) - 128 & 57344) >> 13 | ((var43 & 61440) >> 12 | var43 << 4) - 128 << 3) - 196 & 65504)
                                    >> 5
                                  | ((((var43 & 61440) >> 12 | var43 << 4) - 128 & 57344) >> 13 | ((var43 & 61440) >> 12 | var43 << 4) - 128 << 3) - 196 << 11
                              )
                              & 0
                          )
                          >> 16
                        | (
                            (((((var43 & 61440) >> 12 | var43 << 4) - 128 & 57344) >> 13 | ((var43 & 61440) >> 12 | var43 << 4) - 128 << 3) - 196 & 65504) >> 5
                              | ((((var43 & 61440) >> 12 | var43 << 4) - 128 & 57344) >> 13 | ((var43 & 61440) >> 12 | var43 << 4) - 128 << 3) - 196 << 11
                          )
                          << 0
                    )
                    << 0
              )
              + 57
            ^ 135
        );
        var14.setCharAt(
          var24,
          (char)(
            (
                  (
                        (
                            (
                                  (
                                      (
                                            ((((var43 & 61440) >> 12 | var43 << 4) - 128 & 57344) >> 13 | ((var43 & 61440) >> 12 | var43 << 4) - 128 << 3)
                                                - 196
                                              & 65504
                                          )
                                          >> 5
                                        | ((((var43 & 61440) >> 12 | var43 << 4) - 128 & 57344) >> 13 | ((var43 & 61440) >> 12 | var43 << 4) - 128 << 3) - 196
                                          << 11
                                    )
                                    & 0
                                )
                                >> 16
                              | (
                                  (((((var43 & 61440) >> 12 | var43 << 4) - 128 & 57344) >> 13 | ((var43 & 61440) >> 12 | var43 << 4) - 128 << 3) - 196 & 65504)
                                      >> 5
                                    | ((((var43 & 61440) >> 12 | var43 << 4) - 128 & 57344) >> 13 | ((var43 & 61440) >> 12 | var43 << 4) - 128 << 3) - 196
                                      << 11
                                )
                                << 0
                          )
                          & 0
                      )
                      >> 16
                    | (
                        (
                              (
                                  (((((var43 & 61440) >> 12 | var43 << 4) - 128 & 57344) >> 13 | ((var43 & 61440) >> 12 | var43 << 4) - 128 << 3) - 196 & 65504)
                                      >> 5
                                    | ((((var43 & 61440) >> 12 | var43 << 4) - 128 & 57344) >> 13 | ((var43 & 61440) >> 12 | var43 << 4) - 128 << 3) - 196
                                      << 11
                                )
                                & 0
                            )
                            >> 16
                          | (
                              (((((var43 & 61440) >> 12 | var43 << 4) - 128 & 57344) >> 13 | ((var43 & 61440) >> 12 | var43 << 4) - 128 << 3) - 196 & 65504)
                                  >> 5
                                | ((((var43 & 61440) >> 12 | var43 << 4) - 128 & 57344) >> 13 | ((var43 & 61440) >> 12 | var43 << 4) - 128 << 3) - 196 << 11
                            )
                            << 0
                      )
                      << 0
                )
                + 57
              ^ 135
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (1843274844 - 348547232 * (1843274844 - 348547232) | 0) & 2330656;
        var30 < var17.length();
        var30 += 1919492408 >>> -1817796666 ^ 29992069
      ) {
        int var53 = var17.charAt(var30) + 28;
        int var94 = (var53 & 63488) >> 11;
        int var54 = ((var53 & 63488) >> 11 | var53 << 5) + 90;
        int var95 = (((var53 & 63488) >> 11 | var53 << 5) + 90 & 65408) >> 7;
        var53 = (((var94 | var53 << 5) + 90 & 65408) >> 7 | ((var53 & 63488) >> 11 | var53 << 5) + 90 << 9) + 0;
        var94 = ((var95 | var54 << 9) + 0 & 57344) >> 13;
        int var56 = (((var95 | var54 << 9) + 0 & 57344) >> 13 | var53 << 3) + 102 + 170 - 230;
        int var97 = ((((var95 | var54 << 9) + 0 & 57344) >> 13 | var53 << 3) + 102 + 170 - 230 & 61440) >> 12;
        char var57 = (char)(
          ((var94 | var53 << 3) + 102 + 170 - 230 & 61440) >> 12 | (((var95 | var54 << 9) + 0 & 57344) >> 13 | var53 << 3) + 102 + 170 - 230 << 4
        );
        var17.setCharAt(var30, (char)(var97 | var56 << 4));
      }

      Class var6 = Class.forName(var17.toString(), false, oz.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (-17088453 << 1716402704 | 0) & 847253586; var36 < var20.length(); var36 += (941046721 ^ 867098619 | 1) & 872553409) {
        char var62 = var20.charAt(var36);
        char var67 = (char)(
          (
                (
                      (
                          (
                              (
                                    (
                                        (((((var62 & '￠') >> 5 | var62 << 11) & 63488) >> 11 | ((var62 & '￠') >> 5 | var62 << 11) << 5) & 57344) >> 13
                                          | ((((var62 & '￠') >> 5 | var62 << 11) & 63488) >> 11 | ((var62 & '￠') >> 5 | var62 << 11) << 5) << 3
                                      )
                                      & 64512
                                  )
                                  >> 10
                                | (
                                    (((((var62 & '￠') >> 5 | var62 << 11) & 63488) >> 11 | ((var62 & '￠') >> 5 | var62 << 11) << 5) & 57344) >> 13
                                      | ((((var62 & '￠') >> 5 | var62 << 11) & 63488) >> 11 | ((var62 & '￠') >> 5 | var62 << 11) << 5) << 3
                                  )
                                  << 6
                            )
                            ^ 218
                        )
                        & 32768
                    )
                    >> 15
                  | (
                      (
                          (
                                (
                                    (((((var62 & '￠') >> 5 | var62 << 11) & 63488) >> 11 | ((var62 & '￠') >> 5 | var62 << 11) << 5) & 57344) >> 13
                                      | ((((var62 & '￠') >> 5 | var62 << 11) & 63488) >> 11 | ((var62 & '￠') >> 5 | var62 << 11) << 5) << 3
                                  )
                                  & 64512
                              )
                              >> 10
                            | (
                                (((((var62 & '￠') >> 5 | var62 << 11) & 63488) >> 11 | ((var62 & '￠') >> 5 | var62 << 11) << 5) & 57344) >> 13
                                  | ((((var62 & '￠') >> 5 | var62 << 11) & 63488) >> 11 | ((var62 & '￠') >> 5 | var62 << 11) << 5) << 3
                              )
                              << 6
                        )
                        ^ 218
                    )
                    << 1
              )
              + 35
              - 205
              - 88
            ^ 106
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
                                          (((((var62 & '￠') >> 5 | var62 << 11) & 63488) >> 11 | ((var62 & '￠') >> 5 | var62 << 11) << 5) & 57344) >> 13
                                            | ((((var62 & '￠') >> 5 | var62 << 11) & 63488) >> 11 | ((var62 & '￠') >> 5 | var62 << 11) << 5) << 3
                                        )
                                        & 64512
                                    )
                                    >> 10
                                  | (
                                      (((((var62 & '￠') >> 5 | var62 << 11) & 63488) >> 11 | ((var62 & '￠') >> 5 | var62 << 11) << 5) & 57344) >> 13
                                        | ((((var62 & '￠') >> 5 | var62 << 11) & 63488) >> 11 | ((var62 & '￠') >> 5 | var62 << 11) << 5) << 3
                                    )
                                    << 6
                              )
                              ^ 218
                          )
                          & 32768
                      )
                      >> 15
                    | (
                        (
                            (
                                  (
                                      (((((var62 & '￠') >> 5 | var62 << 11) & 63488) >> 11 | ((var62 & '￠') >> 5 | var62 << 11) << 5) & 57344) >> 13
                                        | ((((var62 & '￠') >> 5 | var62 << 11) & 63488) >> 11 | ((var62 & '￠') >> 5 | var62 << 11) << 5) << 3
                                    )
                                    & 64512
                                )
                                >> 10
                              | (
                                  (((((var62 & '￠') >> 5 | var62 << 11) & 63488) >> 11 | ((var62 & '￠') >> 5 | var62 << 11) << 5) & 57344) >> 13
                                    | ((((var62 & '￠') >> 5 | var62 << 11) & 63488) >> 11 | ((var62 & '￠') >> 5 | var62 << 11) << 5) << 3
                                )
                                << 6
                          )
                          ^ 218
                      )
                      << 1
                )
                + 35
                - 205
                - 88
              ^ 106
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), oz.class.getClassLoader()).returnType();
      switch ((var4 + 1768460383 - 394281984 - 539277083 - 599962905 - 306340821 ^ 883557479) - 355214074 + 1035017518 + 1895658638 + 90263691) {
        case 375810173:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 616825690:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 810431826:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 945974096:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      lcb[var10 + 1296578715 + 1478354565 - 1962029555 - 1932356664 - 123115317 + 2082459935 + 2071418387 + 1893217780 + 609290193 - 308283723] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
