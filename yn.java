// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.class_11905;
import net.minecraft.class_11908;
import net.minecraft.Identifier;
import net.minecraft.DrawContext;
import net.minecraft.class_437;

public class yn extends class_437 implements yh {
  public e gi;
  public boolean dut;
  public int mk;
  public String ypu;
  public int xf;
  public int xp;
  public long oa;
  public boolean ub;
  // [JNT] MethodHandle dispatch table (removed)
  public yn(cg var1, e var2) {
    this.kgl = var1;
    super(
      /* jnt */
    );
    this.dut = false;
    this.mk = 530;
    this.xp = -1;
    this.oa = 0L;
    this.ub = true;
    this.gi = var2;
    this.ypu = /* jnt */;
    this.xf = /* jnt */
    );
  }

  public static boolean egz(int var0) {
    return var0 == 86 && /* jnt */;
  }

  public static boolean ie(int var0) {
    return var0 == 67 && /* jnt */;
  }

  public static boolean lx(int var0) {
    return var0 == 88 && /* jnt */;
  }
  public static boolean sph() {
    int var0 = -312490563;
    int var10000;
    if (null /* jnt:encrypted */) {
      var10000 = /* jnt */
          )
        ),
        343
      );
      var0 = 1466218857 << -1362623828 ^ -952161007;
      label28:
      switch ((var0 + 235166991 + 1796075836 ^ 1514923187 ^ 1720344191 ^ 925193787) - 1800743247) {
        case -1560035748:
          break;
        case 69526916:
        default:
          return (boolean)var10000;
      }
    } else {
      var0 = (204969817 - 1938495161 | 647443025) & 648001113;
      switch (var0 - 1659663687 + 1560122184 + 1016808618 + 2002326898 - 1541539198 ^ 670976477) {
        case 57031194:
          var10000 = 0;
          var0 = (1632706028 | 537670423 | -1417641392) & -340864039;
          break;
        case 1597861165:
        default:
          var10000 = /* jnt */
              )
            ),
            341
          );
          var0 = 1466218857 << -1362623828 ^ -952161007;
      }

      label41:
      switch ((var0 + 235166991 + 1796075836 ^ 1514923187 ^ 1720344191 ^ 925193787) - 1800743247) {
        case -1560035748:
          break;
        case 69526916:
        default:
          return (boolean)var10000;
      }
    }

    while (true) {
      while (var10000 != 1) {
        var0 = (-632289388 + -1224934625 | -764149464) & -25831128;
        switch (var0 - 1659663687 + 1560122184 + 1016808618 + 2002326898 - 1541539198 ^ 670976477) {
          case 57031194:
            var10000 = 0;
            var0 = (1632706028 | 537670423 | -1417641392) & -340864039;
            break;
          case 1597861165:
          default:
            var10000 = /* jnt */
                )
              ),
              341
            );
            var0 = 1466218857 << -1362623828 ^ -952161007;
        }

        label33:
        switch ((var0 + 235166991 + 1796075836 ^ 1514923187 ^ 1720344191 ^ 925193787) - 1800743247) {
          case -1560035748:
            break;
          case 69526916:
          default:
            return (boolean)var10000;
        }
      }

      var10000 = 1;
      var0 = (1632706028 | 537670423 | -1417641392) & -340864039;
      switch ((var0 + 235166991 + 1796075836 ^ 1514923187 ^ 1720344191 ^ 925193787) - 1800743247) {
        case -1560035748:
          break;
        case 69526916:
        default:
          return true;
      }
    }
  }
  public void method_25394(class_332 var1, int var2, int var3, float var4) {
    int var32 = -1092409824;
    /* jnt */;
    var2 *= /* jnt */
      )
    );
    var3 *= /* jnt */
      )
    );
    /* jnt */;
    long var5 = /* jnt */;
    if (var5 - null /* jnt:encrypted */ > 530L) {
      null /* jnt:encrypted */);
      null /* jnt:encrypted */;
    }

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
    int var7 = /* jnt */)
      )
    );
    int var8 = /* jnt */)
      )
    );
    int var9 = /* jnt */
    );
    short var10 = 600;
    int var11 = /* jnt */)
          )
        )
        - 100
    );
    byte var12 = 120;
    int var13 = (var7 - var11) / 2;
    int var14 = (var8 - var12) / 2;
    /* jnt *//* jnt */,
      (double)var13,
      (double)var14,
      (double)(var13 + var11),
      (double)(var14 + var12),
      8.0,
      8.0,
      8.0,
      8.0
    );
    /* jnt *//* jnt */,
      (double)var13,
      (double)var14,
      (double)(var13 + var11),
      (double)(var14 + 30),
      8.0,
      8.0,
      0.0,
      0.0
    );
    /* jnt */)
    );
    /* jnt */),
      var1,
      var13 + var11 / 2,
      var14 + 8,
      /* jnt *//* jnt */)
    );
    int var15 = var13 + 20;
    int var16 = var14 + 50;
    int var17 = var11 - 40;
    byte var18 = 30;
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
    /* jnt *//* jnt */,
      (double)var15,
      (double)var16,
      (double)(var15 + var17),
      (double)(var16 + var18),
      5.0,
      5.0,
      5.0,
      5.0,
      1.0
    );
    String var19 = null /* jnt:encrypted */;
    int var20 = var15 + 10;
    int var21 = var16 + 10;
    String var22 = /* jnt */
    );
    String var23 = /* jnt */
    );
    int var24 = var20 + /* jnt */;
    if (null /* jnt:encrypted */ != -1) {
      if (null /* jnt:encrypted */ != null /* jnt:encrypted */) {
        int var25 = /* jnt */, null /* jnt:encrypted */
        );
        int var26 = /* jnt */, null /* jnt:encrypted */
        );
        String var27 = /* jnt */;
        String var28 = /* jnt */;
        String var29 = /* jnt */;
        int var30 = /* jnt */;
        int var31 = /* jnt */;
        /* jnt *//* jnt */)
        );
        /* jnt */)
        );
        /* jnt *//* jnt */)
        );
        /* jnt *//* jnt */)
        );
        var32 = -13001535 + (-157969048 >>> -1849180406) ^ 478181818;
      } else {
        var32 = -1172338603 + -1172338603 ^ 337829016;
      }
    } else {
      var32 = -1172338603 + -1172338603 ^ 337829016;
    }

    while (true) {
      switch ((var32 + 323590956 + 968134992 ^ 978241332 ^ 53758492) - 588493949 - 235243465) {
        case -663312150:
          int var35 = var14 + var12 - 30;
          byte var36 = 80;
          byte var37 = 25;
          int var38 = var13 + var11 - var36 - 20;
          int var39 = var38 - var36 - 10;
          /* jnt */,
            (double)var38,
            (double)var35,
            (double)(var38 + var36),
            (double)(var35 + var37),
            5.0,
            5.0,
            5.0,
            5.0
          );
          int var10000 = (753620295 & 935954744 | 0) & -1040027979;
          StringBuilder var10001 = (StringBuilder)/* jnt */;

          label62:
          while (true) {
            var32 = 983147858 >>> 2037735937 ^ 184656530;

            while (true) {
              label58:
              while (true) {
                label56: {
                  StringBuilder var43;
                  switch (((var32 ^ 1164042031) + 1025284256 ^ 1456307103) - 1381232040 ^ 457020418 ^ 1551607209) {
                    case -421707409:
                      var43 = var10001;
                      if (var10000 < ((1547331072 | 1498928410 | 12) & 31)) {
                        int var58 = /* jnt */
                            - 140
                          ^ 224;
                        char var61 = (char)(
                          (((((var58 & 32768) >> 15 | var58 << 1) & 0) >> 16 | ((var58 & 32768) >> 15 | var58 << 1) << 0) & 65534) >> 1
                            | ((((var58 & 32768) >> 15 | var58 << 1) & 0) >> 16 | ((var58 & 32768) >> 15 | var58 << 1) << 0) << 15
                        );
                        /* jnt */(
                            (((((var58 & 32768) >> 15 | var58 << 1) & 0) >> 16 | ((var58 & 32768) >> 15 | var58 << 1) << 0) & 65534) >> 1
                              | ((((var58 & 32768) >> 15 | var58 << 1) & 0) >> 16 | ((var58 & 32768) >> 15 | var58 << 1) << 0) << 15
                          )
                        );
                        var10000 += 1881292612 & 1223707895 ^ 1075842117;
                        break label56;
                      }

                      var32 = -1838654801 + -2066690273 ^ -2117399187;
                      break;
                    case 157396970:
                      var43 = var10001;
                      if (var10000 < ((-1819937083 << (-1246159048 >>> -1819937083) | 6) & 1690130767)) {
                        int var52 = /* jnt */
                          - '8';
                        char var55 = (char)(
                          (((((var52 & 65520) >> 4 | var52 << 12) & 63488) >> 11 | ((var52 & 65520) >> 4 | var52 << 12) << 5) + 27 & 57344) >> 13
                            | ((((var52 & 65520) >> 4 | var52 << 12) & 63488) >> 11 | ((var52 & 65520) >> 4 | var52 << 12) << 5) + 27 << 3
                        );
                        /* jnt */(
                            (((((var52 & 65520) >> 4 | var52 << 12) & 63488) >> 11 | ((var52 & 65520) >> 4 | var52 << 12) << 5) + 27 & 57344) >> 13
                              | ((((var52 & 65520) >> 4 | var52 << 12) & 63488) >> 11 | ((var52 & 65520) >> 4 | var52 << 12) << 5) + 27 << 3
                          )
                        );
                        var10000 += (-1305611399 >> (-1600575378 >> -1305611399 * -1600575378) | 1) & 1;
                        break label58;
                      }

                      var32 = (822797905 ^ -1119976422 | -670616380) & -597738044;
                      break;
                    case 863403816:
                    default:
                      var43 = var10001;
                      if (var10000 < ((-2073931270 - 1889779220 | 0) & -398431220)) {
                        int var47 = /* jnt */
                          - '&'
                          - 160
                          - 92;
                        int var10004 = (var47 & 0) >> 16;
                        int var48 = (var47 & 0) >> 16 | var47 << 0;
                        int var70 = (((var47 & 0) >> 16 | var47 << 0) & 61440) >> 12;
                        char var49 = (char)(((var10004 | var47 << 0) & 61440) >> 12 | ((var47 & 0) >> 16 | var47 << 0) << 4);
                        /* jnt */(var70 | var48 << 4)
                        );
                        var10000 += (1918690142 & 1937329171 | 1) & -2069392503;
                        continue label62;
                      }

                      var32 = (-1123127517 & 57048021 | -1432254890) & -1364474018;
                  }

                  switch (var32 - 1061065417 + 1558724294 + 153563285 - 1521431868 + 1339024826 + 432384343) {
                    case -861316342:
                      /* jnt */,
                        var1,
                        var13 + 20,
                        var14 + var12 - 20,
                        /* jnt *//* jnt */
                        )
                      );
                      /* jnt */;
                      return;
                    case -530907715:
                      /* jnt */,
                        var1,
                        var38 + var36 / 2,
                        var35 + 6,
                        /* jnt *//* jnt */
                        )
                      );
                      /* jnt *//* jnt */,
                        (double)var39,
                        (double)var35,
                        (double)(var39 + var36),
                        (double)(var35 + var37),
                        5.0,
                        5.0,
                        5.0,
                        5.0
                      );
                      var10000 = 2140955899 << 91550623 + 2140955899 * 91550623 ^ -104443984;
                      var10001 = (StringBuilder)/* jnt */;
                      break label58;
                    case 298740523:
                    default:
                      /* jnt */,
                        var1,
                        var39 + var36 / 2,
                        var35 + 6,
                        /* jnt *//* jnt */
                        )
                      );
                      var10000 = (448223600 << 1956618541 | 0) & 345042420;
                      var10001 = (StringBuilder)/* jnt */;
                  }
                }

                var32 = (-571085967 ^ -571085967 | 761549436) & -1082656129;
              }

              var32 = (-714676077 - 1650341819 | -1124923151) & -50606339;
            }
          }
        case 1665677632:
        default:
          /* jnt *//* jnt */)
          );
          if (null /* jnt:encrypted */) {
            /* jnt *//* jnt */)
            );
          }
      }

      var32 = -13001535 + (-157969048 >>> -1849180406) ^ 478181818;
    }
  }

  public void method_16014(double var1, double var3) {
    /* jnt */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
  }

  public boolean method_25402(class_11909 var1, boolean var2) {
    int var17 = -287792933;
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
    int var7 = /* jnt */
    );
    int var8 = /* jnt */)
            )
          )
          - 100
      )
    );
    byte var9 = 120;
    int var10 = (var5 - var8) / 2;
    int var11 = (var6 - var9) / 2;
    int var12 = var11 + var9 - 30;
    byte var13 = 80;
    byte var14 = 25;
    int var15 = var10 + var8 - var13 - 20;
    int var16 = var15 - var13 - 10;
    if (/* jnt */var3, (double)var4, var15, var12, var13, var14)) {
      /* jnt */,
        /* jnt */
        )
      );
      /* jnt */),
        (yva)null /* jnt:encrypted */null /* jnt:encrypted */)
      );
      return true;
    } else {
      var17 = -1804506356 ^ -1804506356 ^ -1520739030;

      while (true) {
        switch (var17 + 1899075190 - 2101550708 + 427117595 - 1381806011 - 757997909 - 1192092702) {
          case -777676649:
          default:
            return /* jnt */;
          case -333026279:
        }

        if (/* jnt */var3, (double)var4, var16, var12, var13, var14)) {
          /* jnt */),
            (yva)null /* jnt:encrypted */null /* jnt:encrypted */)
          );
          return true;
        }

        var17 = -368488353 * 229786324 ^ 1638368516;
      }
    }
  }

  public boolean fki(double var1, double var3, int var5, int var6, int var7, int var8) {
    return var1 >= (double)var5 && var1 <= (double)(var5 + var7) && var3 >= (double)var6 && var3 <= (double)(var6 + var8);
  }
  public boolean method_25404(class_11908 var1) {
    int var16 = 1790675866;
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    if (/* jnt */ == 256) {
      /* jnt */,
        /* jnt */
        )
      );
      /* jnt */),
        (yva)null /* jnt:encrypted */null /* jnt:encrypted */)
      );
      return true;
    } else {
      var16 = -1643789054 * 1844900959 ^ -1721483735;

      while (true) {
        label418:
        while (true) {
          label416:
          while (true) {
            label414:
            while (true) {
              label411:
              while (true) {
                label409:
                while (true) {
                  label407:
                  while (true) {
                    label405:
                    while (true) {
                      label402:
                      while (true) {
                        label398:
                        while (true) {
                          label393:
                          while (true) {
                            label390:
                            while (true) {
                              label388:
                              while (true) {
                                label346: {
                                  int var17;
                                  switch (var16 + 192115192 - 879148644 - 1569577618 + 289574622 - 1930180343 ^ 574628741) {
                                    case -2033866369:
                                      return true;
                                    case -1684547263:
                                      if (/* jnt */
                                        != 261) {
                                        var16 = (1590846655 >> (-1133003145 >>> -1009684581) | 1368428067) & -38477969;
                                      } else {
                                        if (null /* jnt:encrypted */ != -1
                                          && null /* jnt:encrypted */ != null /* jnt:encrypted */) {
                                          var17 = /* jnt */, null /* jnt:encrypted */
                                          );
                                          int var27 = /* jnt */, null /* jnt:encrypted */
                                          );
                                          String var45 = /* jnt */, 0, var17
                                          );
                                          String var35 = /* jnt */, var27
                                          );
                                          String var34 = var45;
                                          null /* jnt:encrypted */,
                                                var35
                                              )
                                            )
                                          );
                                          null /* jnt:encrypted */;
                                          null /* jnt:encrypted */;
                                          break label414;
                                        }

                                        var16 = (1463264716 >> -2055668679 | -38624616) & -70758;
                                      }
                                      continue;
                                    case -1602629670:
                                      if (/* jnt */
                                        != 268) {
                                        var16 = (-582462149 | 376311378) ^ -388261333;
                                      } else {
                                        if ((
                                            /* jnt */
                                              & 1
                                          )
                                          != 0) {
                                          if (null /* jnt:encrypted */ == -1) {
                                            null /* jnt:encrypted */);
                                          }
                                          break label398;
                                        }

                                        var16 = (1273137111 & 1642758679 | -1340720780) & -27312642;
                                      }
                                      continue;
                                    case -1571438858:
                                      if (/* jnt */
                                        != 262) {
                                        var16 = (144064350 & -249465709 & 144064350 | 1787083638) & 1789311991;
                                      } else {
                                        if ((
                                            /* jnt */
                                              & 1
                                          )
                                          != 0) {
                                          if (null /* jnt:encrypted */ == -1) {
                                            null /* jnt:encrypted */);
                                          }
                                          break label418;
                                        }

                                        var16 = (1878292413 ^ 2022443835 + 1878292413 | 728531617) & -1410494721;
                                      }
                                      continue;
                                    case -1502673955:
                                      if (/* jnt */
                                      )) {
                                        String var20 = /* jnt */
                                            )
                                          )
                                        );
                                        if (null /* jnt:encrypted */ != -1
                                          && null /* jnt:encrypted */ != null /* jnt:encrypted */) {
                                          int var26 = /* jnt */, null /* jnt:encrypted */
                                          );
                                          int var4 = /* jnt */, null /* jnt:encrypted */
                                          );
                                          String var39 = /* jnt */, 0, var26
                                          );
                                          String var29 = /* jnt */, var4
                                          );
                                          String var6 = var39;
                                          String var5 = /* jnt *//* jnt */,
                                                  var6
                                                ),
                                                var20
                                              ),
                                              var29
                                            )
                                          );
                                          var5 = /* jnt */, 200
                                            )
                                          );
                                          null /* jnt:encrypted */;
                                          null /* jnt:encrypted */
                                            )
                                          );
                                        } else {
                                          String var10000 = /* jnt */,
                                            0,
                                            null /* jnt:encrypted */
                                          );
                                          String var31 = /* jnt */,
                                            null /* jnt:encrypted */
                                          );
                                          String var7 = var10000;
                                          String var24 = /* jnt *//* jnt */,
                                                  var7
                                                ),
                                                var20
                                              ),
                                              var31
                                            )
                                          );
                                          var24 = /* jnt */, 200
                                            )
                                          );
                                          null /* jnt:encrypted */;
                                          null /* jnt:encrypted */
                                            )
                                          );
                                        }

                                        null /* jnt:encrypted */;
                                        return true;
                                      }

                                      var16 = (1487939397 + -1425202832 | 1684832437) & -302068995;
                                      continue;
                                    case -1391602053:
                                      if (null /* jnt:encrypted */ <= 0) {
                                        break label407;
                                      }

                                      if (!/* jnt */) {
                                        var16 = -1902914280 + 1869306931 ^ -304743892;
                                        continue;
                                      }

                                      var17 = null /* jnt:encrypted */;
                                      var16 = -17503770 - 95306376 ^ 1668462620;
                                      break;
                                    case -1316808098:
                                      return true;
                                    case -1241592098:
                                      return true;
                                    case -1240786068:
                                      return true;
                                    case -1191803837:
                                      if (/* jnt */
                                        != 259) {
                                        var16 = -1002939969 >> -90028587 ^ 1574778874;
                                      } else {
                                        if (null /* jnt:encrypted */ != -1
                                          && null /* jnt:encrypted */ != null /* jnt:encrypted */) {
                                          var17 = /* jnt */, null /* jnt:encrypted */
                                          );
                                          int var23 = /* jnt */, null /* jnt:encrypted */
                                          );
                                          String var42 = /* jnt */, 0, var17
                                          );
                                          String var10 = /* jnt */, var23
                                          );
                                          String var30 = var42;
                                          null /* jnt:encrypted */,
                                                var10
                                              )
                                            )
                                          );
                                          null /* jnt:encrypted */;
                                          null /* jnt:encrypted */;
                                          break label407;
                                        }

                                        var16 = (-1553520541 | -1553520541) ^ -721425034;
                                      }
                                      continue;
                                    case -1110280491:
                                      if (null /* jnt:encrypted */
                                          < /* jnt */
                                          )
                                        && /* jnt */,
                                            null /* jnt:encrypted */
                                          )
                                        )) {
                                        null /* jnt:encrypted */ + 1);
                                        break label402;
                                      }
                                      break label393;
                                    case -1007450816:
                                      if (null /* jnt:encrypted */ > 0
                                        && !/* jnt */,
                                            null /* jnt:encrypted */ - 1
                                          )
                                        )) {
                                        null /* jnt:encrypted */ - 1);
                                        break label405;
                                      }
                                      break label390;
                                    case -971572672:
                                      null /* jnt:encrypted */
                                      );
                                      return true;
                                    case -836285179:
                                      if (/* jnt */
                                        == 257) {
                                        /* jnt */,
                                          /* jnt */
                                          )
                                        );
                                        /* jnt */
                                          ),
                                          (yva)null /* jnt:encrypted */null /* jnt:encrypted */
                                          )
                                        );
                                        return true;
                                      }

                                      var16 = -1211263943 >>> 1407333815 * -1211263943 ^ 1819930478;
                                      continue;
                                    case -798396195:
                                      null /* jnt:encrypted */ + 1);
                                      break label393;
                                    case -786743568:
                                      return true;
                                    case -513698741:
                                      null /* jnt:encrypted */;
                                      break label418;
                                    case -453109233:
                                      if (/* jnt */
                                      )) {
                                        if (null /* jnt:encrypted */ != -1
                                          && null /* jnt:encrypted */ != null /* jnt:encrypted */) {
                                          var17 = /* jnt */, null /* jnt:encrypted */
                                          );
                                          int var22 = /* jnt */, null /* jnt:encrypted */
                                          );
                                          /* jnt */
                                                )
                                              )
                                            ),
                                            /* jnt */, var17, var22
                                            )
                                          );
                                          String var41 = /* jnt */, 0, var17
                                          );
                                          String var9 = /* jnt */, var22
                                          );
                                          String var8 = var41;
                                          null /* jnt:encrypted */,
                                                var9
                                              )
                                            )
                                          );
                                          null /* jnt:encrypted */;
                                          null /* jnt:encrypted */;
                                        }

                                        var16 = (1567063139 >>> 245451135 | 2090207232) & -19403492;
                                      } else {
                                        var16 = (-668040819 + (1302938406 >>> -2042206398) | 436410643) & -75293293;
                                      }
                                      continue;
                                    case -224495648:
                                      null /* jnt:encrypted */;
                                      break label416;
                                    case -207292879:
                                      if (null /* jnt:encrypted */ > 0
                                        && /* jnt */,
                                            null /* jnt:encrypted */ - 1
                                          )
                                        )) {
                                        null /* jnt:encrypted */ - 1);
                                        break label390;
                                      }
                                      break label388;
                                    case 89859190:
                                      null /* jnt:encrypted */;
                                      break label411;
                                    case 94363605:
                                      String var40 = /* jnt */,
                                        0,
                                        null /* jnt:encrypted */ - 1
                                      );
                                      String var12 = /* jnt */,
                                        null /* jnt:encrypted */
                                      );
                                      String var11 = var40;
                                      null /* jnt:encrypted */,
                                            var12
                                          )
                                        )
                                      );
                                      null /* jnt:encrypted */ - 1);
                                      null /* jnt:encrypted */;
                                      break label407;
                                    case 644291209:
                                      if (null /* jnt:encrypted */
                                          < /* jnt */
                                          )
                                        && !/* jnt */,
                                            null /* jnt:encrypted */
                                          )
                                        )) {
                                        null /* jnt:encrypted */ + 1);
                                        break label409;
                                      }
                                      break label402;
                                    case 655483805:
                                      null /* jnt:encrypted */ - 1);
                                      break label388;
                                    case 709577178:
                                    default:
                                      null /* jnt:encrypted */;
                                      break label398;
                                    case 829975161:
                                      if (/* jnt */
                                          == 65
                                        && /* jnt */) {
                                        null /* jnt:encrypted */;
                                        null /* jnt:encrypted */
                                        );
                                        return true;
                                      }

                                      var16 = (1697499423 + 278911128 | -2097129768) & -1961658659;
                                      continue;
                                    case 925364230:
                                      if (null /* jnt:encrypted */
                                        >= /* jnt */
                                        )) {
                                        break label414;
                                      }

                                      if (!/* jnt */) {
                                        var16 = (-2089383351 * -2089383351 | 125915660) & -1215999268;
                                        continue;
                                      }

                                      var17 = null /* jnt:encrypted */;
                                      var16 = -1898702264 * -1868567793 * (-1898702264 | -1868567793) ^ -157844663;
                                      break;
                                    case 1017767139:
                                      null /* jnt:encrypted */;
                                      return true;
                                    case 1144104335:
                                      return true;
                                    case 1258658973:
                                      if (/* jnt */
                                        != 263) {
                                        var16 = (2076920948 & 1737294089 + 2076920948 + 1737294089 | 673196170) & -311890486;
                                      } else {
                                        if ((
                                            /* jnt */
                                              & 1
                                          )
                                          != 0) {
                                          if (null /* jnt:encrypted */ == -1) {
                                            null /* jnt:encrypted */);
                                          }
                                          break label411;
                                        }

                                        var16 = (1397272103 - -664688268 | 224449290) & -1888094390;
                                      }
                                      continue;
                                    case 1448656816:
                                      if (null /* jnt:encrypted */ > 0) {
                                        if (!/* jnt */) {
                                          var16 = (400469006 | 400469006) ^ -96328927;
                                          continue;
                                        }
                                        break label405;
                                      }
                                      break label388;
                                    case 1458049629:
                                      return /* jnt */;
                                    case 1609685531:
                                      if (/* jnt */
                                      )) {
                                        if (null /* jnt:encrypted */ != -1
                                          && null /* jnt:encrypted */ != null /* jnt:encrypted */) {
                                          var17 = /* jnt */, null /* jnt:encrypted */
                                          );
                                          int var3 = /* jnt */, null /* jnt:encrypted */
                                          );
                                          /* jnt */
                                                )
                                              )
                                            ),
                                            /* jnt */, var17, var3
                                            )
                                          );
                                        }

                                        var16 = (909861810 | 909861810) ^ -1238179904;
                                      } else {
                                        var16 = 757575855 & 757575855 ^ -2110867442;
                                      }
                                      continue;
                                    case 1831523772:
                                      if (/* jnt */
                                        != 269) {
                                        var16 = (-1750365555 ^ -1962835016 | 1087570159) & 2113093871;
                                      } else {
                                        if ((
                                            /* jnt */
                                              & 1
                                          )
                                          != 0) {
                                          if (null /* jnt:encrypted */ == -1) {
                                            null /* jnt:encrypted */);
                                          }
                                          break label416;
                                        }

                                        var16 = (-1595926356 ^ 1857901463 | -1322769828) & -1188318340;
                                      }
                                      continue;
                                    case 1836752960:
                                      String var10001 = /* jnt */,
                                        0,
                                        null /* jnt:encrypted */
                                      );
                                      String var15 = /* jnt */,
                                        null /* jnt:encrypted */ + 1
                                      );
                                      String var14 = var10001;
                                      null /* jnt:encrypted */,
                                            var15
                                          )
                                        )
                                      );
                                      break label346;
                                    case 1916591180:
                                      if (null /* jnt:encrypted */
                                        < /* jnt */
                                        )) {
                                        if (!/* jnt */) {
                                          var16 = (-579393201 & -579393201 | -1973419475) & -621005201;
                                          continue;
                                        }
                                        break label409;
                                      }
                                      break label393;
                                  }

                                  while (true) {
                                    label341:
                                    while (true) {
                                      switch ((var16 + 1614458106 - 412081097 ^ 515463523 ^ 333570064 ^ 835439982) - 1675924678) {
                                        case -2081889847:
                                        default:
                                          if (var17
                                            >= /* jnt */
                                            )) {
                                            var16 = 925220545 << 739082278 ^ -1641399369;
                                            continue;
                                          }

                                          if (!/* jnt */, var17
                                            )
                                          )) {
                                            var16 = 925220545 << 739082278 ^ -1641399369;
                                            continue;
                                          }

                                          var17++;
                                          break;
                                        case -393689350:
                                          String var44 = /* jnt */, 0, var17
                                          );
                                          String var33 = /* jnt */,
                                            null /* jnt:encrypted */
                                          );
                                          String var32 = var44;
                                          null /* jnt:encrypted */,
                                                var33
                                              )
                                            )
                                          );
                                          null /* jnt:encrypted */;
                                          null /* jnt:encrypted */;
                                          break label407;
                                        case -317319869:
                                          if (var17 <= 0) {
                                            var16 = 3342712 >>> -444681846 ^ 693326444;
                                            continue;
                                          }

                                          if (!/* jnt */, var17 - 1
                                            )
                                          )) {
                                            var16 = 3342712 >>> -444681846 ^ 693326444;
                                            continue;
                                          }

                                          var17--;
                                          break label341;
                                        case 66950249:
                                          if (var17
                                              < /* jnt */
                                              )
                                            && !/* jnt */, var17
                                              )
                                            )) {
                                            var17++;
                                            var16 = -1898702264 * -1868567793 * (-1898702264 | -1868567793) ^ -157844663;
                                            continue;
                                          }
                                          break;
                                        case 1048482927:
                                          String var43 = /* jnt */,
                                            0,
                                            null /* jnt:encrypted */
                                          );
                                          String var36 = /* jnt */, var17
                                          );
                                          String var13 = var43;
                                          null /* jnt:encrypted */,
                                                var36
                                              )
                                            )
                                          );
                                          break label346;
                                        case 2036920232:
                                          if (var17 > 0
                                            && !/* jnt */, var17 - 1
                                              )
                                            )) {
                                            var17--;
                                            var16 = -17503770 - 95306376 ^ 1668462620;
                                            continue;
                                          }
                                          break label341;
                                      }

                                      var16 = (1211579007 - 123243320 | -1826410399) & -1816972815;
                                    }

                                    var16 = (195216600 >> -1339260706 | 616500451) & 1958690299;
                                  }
                                }

                                null /* jnt:encrypted */;
                                break label414;
                              }

                              var16 = -1336566576 << 463533020 ^ 1320965409;
                            }

                            var16 = (-1910941353 >> -1910941353 | 66763) & -1171282741;
                          }

                          var16 = 1970606376 ^ 956890043 ^ -1747450337;
                        }

                        var16 = 312337019 * 513421335 ^ -376373392;
                      }

                      var16 = (-1714037528 >>> -1421210696 + 759991384 | -2015550430) & -537057681;
                    }

                    var16 = (-1628525721 + 1431828312 | -1984268972) & -872514084;
                  }

                  var16 = (733677695 ^ 1166060252 | 403441906) & -57800458;
                }

                var16 = 611970348 >> 418643073 ^ -28377419;
              }

              var16 = 333443650 - 333443650 ^ 1550019404;
            }

            var16 = 1287929297 - -1182780129 ^ 529814179;
          }

          var16 = (583880057 | 583880057 | -861820716) & -844907810;
        }

        var16 = 169568332 >> 425427649 ^ 1036679878;
      }
    }
  }

  public boolean method_25400(class_11905 var1) {
    int var9 = 1366228743;
    if (null /* jnt:encrypted */ != -1
      && null /* jnt:encrypted */ != null /* jnt:encrypted */) {
      int var2 = /* jnt */, null /* jnt:encrypted */
      );
      int var3 = /* jnt */, null /* jnt:encrypted */
      );
      String var10000 = /* jnt */, 0, var2
      );
      String var13 = /* jnt */;
      String var11 = /* jnt */, var3
      );
      String var10 = var13;
      String var5 = var10000;
      String var4 = /* jnt *//* jnt */, var5
            ),
            var10
          ),
          var11
        )
      );
      if (/* jnt */ > 200) {
        return true;
      }

      null /* jnt:encrypted */;
      null /* jnt:encrypted */;
      null /* jnt:encrypted */;
    } else {
      var9 = -644717101 + -644717101 ^ 1194179656;

      label26:
      while (true) {
        switch ((var9 + 1225728205 + 1091536478 + 1543498385 ^ 1919335490) + 2125857640 ^ 913011921) {
          case 292539777:
            if (/* jnt */
              )
              >= 200) {
              return true;
            }

            var9 = (137270183 | -1749184080) ^ 1236928986;
            break;
          case 2056513282:
          default:
            String var10001 = /* jnt */, 0, null /* jnt:encrypted */
            );
            String var10002 = /* jnt */;
            String var8 = /* jnt */, null /* jnt:encrypted */
            );
            String var7 = var10002;
            String var6 = var10001;
            null /* jnt:encrypted */,
                    var7
                  ),
                  var8
                )
              )
            );
            null /* jnt:encrypted */ + 1);
            break label26;
        }
      }
    }

    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    return true;
  }

  public void method_25420(class_332 var1, int var2, int var3, float var4) {
  }

  public boolean method_25422() {
    return false;
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (var10 - 1442834545 + 886370456 - 1713243664 - 111616131 - 345899033 - 2138575547 + 986388835 ^ 1751141742) + 1432833664;
    MethodHandle var10000 = npk[(var10 - 1442834545 + 886370456 - 1713243664 - 111616131 - 345899033 - 2138575547 + 986388835 ^ 1751141742)
      + 1432833664
      + 424297809];
    if (npk[var10001 + 424297809] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (-1416355696 >> 2077903756 | 0) & 16928; var23 < var13.length(); var23 += (26747565 - 26747565 | 1) & 714889525) {
        int var42 = var13.charAt(var23) - 146 - 176 - 165 ^ 75;
        int var10004 = (var42 & 65520) >> 4;
        int var43 = ((var42 & 65520) >> 4 | var42 << 12) - 60 - 177 + 29;
        int var81 = (((var42 & 65520) >> 4 | var42 << 12) - 60 - 177 + 29 & 64512) >> 10;
        char var44 = (char)((((var10004 | var42 << 12) - 60 - 177 + 29 & 64512) >> 10 | ((var42 & 65520) >> 4 | var42 << 12) - 60 - 177 + 29 << 6) ^ 145);
        var13.setCharAt(var23, (char)((var81 | var43 << 6) ^ 145));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = -2084960954 + -2084960954 ^ 125045388; var29 < var16.length(); var29 += (684336884 ^ 918971908 | 1) & 569614347) {
        char var49 = var16.charAt(var29);
        char var52 = (char)(
          (
              (
                    (
                          (((((var49 & '\ufffe') >> 1 | var49 << 15) - 152 & 57344) >> 13 | ((var49 & '\ufffe') >> 1 | var49 << 15) - 152 << 3) & 65504) >> 5
                            | ((((var49 & '\ufffe') >> 1 | var49 << 15) - 152 & 57344) >> 13 | ((var49 & '\ufffe') >> 1 | var49 << 15) - 152 << 3) << 11
                        )
                        - 15
                      ^ 212
                  )
                  - 25
                ^ 178
                ^ 129
            )
            - 53
        );
        var16.setCharAt(
          var29,
          (char)(
            (
                (
                      (
                            (((((var49 & '\ufffe') >> 1 | var49 << 15) - 152 & 57344) >> 13 | ((var49 & '\ufffe') >> 1 | var49 << 15) - 152 << 3) & 65504) >> 5
                              | ((((var49 & '\ufffe') >> 1 | var49 << 15) - 152 & 57344) >> 13 | ((var49 & '\ufffe') >> 1 | var49 << 15) - 152 << 3) << 11
                          )
                          - 15
                        ^ 212
                    )
                    - 25
                  ^ 178
                  ^ 129
              )
              - 53
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), yn.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = -947138447 - -1893895515 ^ 946757068; var35 < var19.length(); var35 += -372975412 >> -1387823691 ^ -177) {
        int var57 = var19.charAt(var35) + ']';
        char var62 = (char)(
          (
                (
                    (
                          (
                              (
                                    (
                                          (
                                              (((var57 & 65504) >> 5 | var57 << 11) + 160 - 231 & 65472) >> 6
                                                | ((var57 & 65504) >> 5 | var57 << 11) + 160 - 231 << 10
                                            )
                                            & 65504
                                        )
                                        >> 5
                                      | (
                                          (((var57 & 65504) >> 5 | var57 << 11) + 160 - 231 & 65472) >> 6
                                            | ((var57 & 65504) >> 5 | var57 << 11) + 160 - 231 << 10
                                        )
                                        << 11
                                  )
                                  + 57
                                ^ 70
                            )
                            & 65024
                        )
                        >> 9
                      | (
                          (
                                (
                                      ((((var57 & 65504) >> 5 | var57 << 11) + 160 - 231 & 65472) >> 6 | ((var57 & 65504) >> 5 | var57 << 11) + 160 - 231 << 10)
                                        & 65504
                                    )
                                    >> 5
                                  | ((((var57 & 65504) >> 5 | var57 << 11) + 160 - 231 & 65472) >> 6 | ((var57 & 65504) >> 5 | var57 << 11) + 160 - 231 << 10)
                                    << 11
                              )
                              + 57
                            ^ 70
                        )
                        << 7
                  )
                  & 63488
              )
              >> 11
            | (
                (
                      (
                          (
                                (
                                      ((((var57 & 65504) >> 5 | var57 << 11) + 160 - 231 & 65472) >> 6 | ((var57 & 65504) >> 5 | var57 << 11) + 160 - 231 << 10)
                                        & 65504
                                    )
                                    >> 5
                                  | ((((var57 & 65504) >> 5 | var57 << 11) + 160 - 231 & 65472) >> 6 | ((var57 & 65504) >> 5 | var57 << 11) + 160 - 231 << 10)
                                    << 11
                              )
                              + 57
                            ^ 70
                        )
                        & 65024
                    )
                    >> 9
                  | (
                      (
                            (((((var57 & 65504) >> 5 | var57 << 11) + 160 - 231 & 65472) >> 6 | ((var57 & 65504) >> 5 | var57 << 11) + 160 - 231 << 10) & 65504)
                                >> 5
                              | ((((var57 & 65504) >> 5 | var57 << 11) + 160 - 231 & 65472) >> 6 | ((var57 & 65504) >> 5 | var57 << 11) + 160 - 231 << 10)
                                << 11
                          )
                          + 57
                        ^ 70
                    )
                    << 7
              )
              << 5
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
                                                (((var57 & 65504) >> 5 | var57 << 11) + 160 - 231 & 65472) >> 6
                                                  | ((var57 & 65504) >> 5 | var57 << 11) + 160 - 231 << 10
                                              )
                                              & 65504
                                          )
                                          >> 5
                                        | (
                                            (((var57 & 65504) >> 5 | var57 << 11) + 160 - 231 & 65472) >> 6
                                              | ((var57 & 65504) >> 5 | var57 << 11) + 160 - 231 << 10
                                          )
                                          << 11
                                    )
                                    + 57
                                  ^ 70
                              )
                              & 65024
                          )
                          >> 9
                        | (
                            (
                                  (
                                        (
                                            (((var57 & 65504) >> 5 | var57 << 11) + 160 - 231 & 65472) >> 6
                                              | ((var57 & 65504) >> 5 | var57 << 11) + 160 - 231 << 10
                                          )
                                          & 65504
                                      )
                                      >> 5
                                    | ((((var57 & 65504) >> 5 | var57 << 11) + 160 - 231 & 65472) >> 6 | ((var57 & 65504) >> 5 | var57 << 11) + 160 - 231 << 10)
                                      << 11
                                )
                                + 57
                              ^ 70
                          )
                          << 7
                    )
                    & 63488
                )
                >> 11
              | (
                  (
                        (
                            (
                                  (
                                        (
                                            (((var57 & 65504) >> 5 | var57 << 11) + 160 - 231 & 65472) >> 6
                                              | ((var57 & 65504) >> 5 | var57 << 11) + 160 - 231 << 10
                                          )
                                          & 65504
                                      )
                                      >> 5
                                    | ((((var57 & 65504) >> 5 | var57 << 11) + 160 - 231 & 65472) >> 6 | ((var57 & 65504) >> 5 | var57 << 11) + 160 - 231 << 10)
                                      << 11
                                )
                                + 57
                              ^ 70
                          )
                          & 65024
                      )
                      >> 9
                    | (
                        (
                              (
                                    ((((var57 & 65504) >> 5 | var57 << 11) + 160 - 231 & 65472) >> 6 | ((var57 & 65504) >> 5 | var57 << 11) + 160 - 231 << 10)
                                      & 65504
                                  )
                                  >> 5
                                | ((((var57 & 65504) >> 5 | var57 << 11) + 160 - 231 & 65472) >> 6 | ((var57 & 65504) >> 5 | var57 << 11) + 160 - 231 << 10)
                                  << 11
                            )
                            + 57
                          ^ 70
                      )
                      << 7
                )
                << 5
          )
        );
      }

      Class var7 = Class.forName(var19.toString(), false, yn.class.getClassLoader());
      switch (((var4 + 1010433346 + 1448638617 - 1679979407 ^ 1744071996) - 323667507 + 560756410 + 1428371205 ^ 1975088721) + 151988711 + 1986180547) {
        case 76344503:
        case 1696939622:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 528898924:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 1378188499:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 1702593259:
          var10000 = var0.findSpecial(var7, var5, var6, yn.class);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    npk[(var10 - 1442834545 + 886370456 - 1713243664 - 111616131 - 345899033 - 2138575547 + 986388835 ^ 1751141742) + 1432833664 + 424297809] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (var10 - 504831555 ^ 928085292) - 271507881 - 1052437685 - 702945136 + 805469114 + 1140285932 ^ 1545299169 ^ 1484689349;
    MethodHandle var10000 = npk[((var10 - 504831555 ^ 928085292) - 271507881 - 1052437685 - 702945136 + 805469114 + 1140285932 ^ 1545299169 ^ 1484689349)
      + 1189254122];
    if (npk[var10001 + 1189254122] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (1063450901 << 1802711758 | 0) & 1090692918; var24 < var14.length(); var24 += -292139636 << 1551943939 ^ 1957850209) {
        int var43 = (var14.charAt(var24) ^ 146) + 135 ^ 142;
        int var10004 = (var43 & 0) >> 16;
        int var44 = (var43 & 0) >> 16 | var43 << 0;
        int var84 = (((var43 & 0) >> 16 | var43 << 0) & 63488) >> 11;
        var43 = (((var10004 | var43 << 0) & 63488) >> 11 | ((var43 & 0) >> 16 | var43 << 0) << 5) + 213;
        var10004 = ((var84 | var44 << 5) + 213 & 49152) >> 14;
        int var46 = (((var84 | var44 << 5) + 213 & 49152) >> 14 | var43 << 2) + 162 ^ 222;
        int var86 = (((((var84 | var44 << 5) + 213 & 49152) >> 14 | var43 << 2) + 162 ^ 222) & 65504) >> 5;
        char var47 = (char)(
          (((var10004 | var43 << 2) + 162 ^ 222) & 65504) >> 5 | ((((var84 | var44 << 5) + 213 & 49152) >> 14 | var43 << 2) + 162 ^ 222) << 11
        );
        var14.setCharAt(var24, (char)(var86 | var46 << 11));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = -1584845724 + -1584845724 ^ 1125275848; var30 < var17.length(); var30 += (-956960838 >>> -144800593 - -956960838 | 0) & 1958887873) {
        int var52 = (var17.charAt(var30) + 215 ^ 183) - 209;
        char var55 = (char)(
          (
              (((((((var52 & 61440) >> 12 | var52 << 4) + 2 ^ 135) & 65534) >> 1 | (((var52 & 61440) >> 12 | var52 << 4) + 2 ^ 135) << 15) ^ 242) & 65528) >> 3
                | ((((((var52 & 61440) >> 12 | var52 << 4) + 2 ^ 135) & 65534) >> 1 | (((var52 & 61440) >> 12 | var52 << 4) + 2 ^ 135) << 15) ^ 242) << 13
            )
            ^ 68
        );
        var17.setCharAt(
          var30,
          (char)(
            (
                (((((((var52 & 61440) >> 12 | var52 << 4) + 2 ^ 135) & 65534) >> 1 | (((var52 & 61440) >> 12 | var52 << 4) + 2 ^ 135) << 15) ^ 242) & 65528)
                    >> 3
                  | ((((((var52 & 61440) >> 12 | var52 << 4) + 2 ^ 135) & 65534) >> 1 | (((var52 & 61440) >> 12 | var52 << 4) + 2 ^ 135) << 15) ^ 242) << 13
              )
              ^ 68
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, yn.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (-609083383 - 1702106713 | 0) & -1983880190; var36 < var20.length(); var36 += (-692126558 * -692126558 | 1) & 3180889) {
        int var60 = var20.charAt(var36);
        int var90 = (var60 & 0) >> 16;
        int var61 = ((var60 & 0) >> 16 | var60 << 0) + 212;
        int var91 = (((var60 & 0) >> 16 | var60 << 0) + 212 & 63488) >> 11;
        var60 = ((((var90 | var60 << 0) + 212 & 63488) >> 11 | ((var60 & 0) >> 16 | var60 << 0) + 212 << 5) - 33 ^ 240) - 17;
        var90 = (((var91 | var61 << 5) - 33 ^ 240) - 17 & 49152) >> 14;
        int var63 = ((((var91 | var61 << 5) - 33 ^ 240) - 17 & 49152) >> 14 | var60 << 2) + 118;
        int var93 = (((((var91 | var61 << 5) - 33 ^ 240) - 17 & 49152) >> 14 | var60 << 2) + 118 & 65024) >> 9;
        char var64 = (char)((((var90 | var60 << 2) + 118 & 65024) >> 9 | ((((var91 | var61 << 5) - 33 ^ 240) - 17 & 49152) >> 14 | var60 << 2) + 118 << 7) ^ 20);
        var20.setCharAt(var36, (char)((var93 | var63 << 7) ^ 20));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), yn.class.getClassLoader()).returnType();
      switch ((var4 + 1965140393 - 1315734755 + 1778266768 - 172936155 ^ 221574084) - 176722250 - 2089552974 + 450898883 + 1164823854 + 469600732) {
        case 739725279:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1118952470:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1193856207:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 2116898526:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      npk[((var10 - 504831555 ^ 928085292) - 271507881 - 1052437685 - 702945136 + 805469114 + 1140285932 ^ 1545299169 ^ 1484689349) + 1189254122] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
