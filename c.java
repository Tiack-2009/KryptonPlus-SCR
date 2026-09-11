// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import dev.krypton.mixin.ProjectionMatrix2Accessor;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.class_11278;
import net.minecraft.ItemStack;
import net.minecraft.Vec3d;
import net.minecraft.MinecraftClient;
import net.minecraft.DrawContext;
import org.joml.Matrix3x2fStack;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;

public class c {
  public static Matrix4f eyg = (Matrix4f)/* jnt */;
  public static Matrix4f kp = (Matrix4f)/* jnt */;
  public static Vector4f iyk = (Vector4f)/* jnt */;
  public static class_11278 fn;
  public static class_243 mtx;
  public static boolean gf;
  // [JNT] MethodHandle dispatch table (removed)
  public static void pl() {
    float var0 = (float)/* jnt */null /* jnt:encrypted */
      )
    );
    float var1 = (float)/* jnt */null /* jnt:encrypted */
      )
    );
    /* jnt */, var0, var1
      ),
      null /* jnt:encrypted */
    );
    /* jnt */,
      /* jnt */null /* jnt:encrypted */, var0, var1
      )
    );
    null /* jnt:encrypted */;
  }

  public static void zc() {
    float var0 = (float)(
      /* jnt */null /* jnt:encrypted */
          )
        )
        / /* jnt */null /* jnt:encrypted */
          )
        )
    );
    float var1 = (float)(
      /* jnt */null /* jnt:encrypted */
          )
        )
        / /* jnt */null /* jnt:encrypted */
          )
        )
    );
    /* jnt */, var0, var1
      ),
      null /* jnt:encrypted */
    );
    /* jnt */,
      /* jnt */null /* jnt:encrypted */, var0, var1
      )
    );
    null /* jnt:encrypted */;
  }

  public static void my(int var0, int var1, int var2, int var3, int var4) {
    int var7 = 1253875314;
    zn var5 = (zn)/* jnt */;
    if (null /* jnt:encrypted */ != 0) {
      boolean var6 = /* jnt */);
      if (!var6) {
        /* jnt */);
      }

      var7 = 1739806480 * -994850040 ^ 329121672;

      while (true) {
        switch (((var7 ^ 2053157030) - 18426385 ^ 1950426109) - 1606081689 - 1785969400 ^ 471209013) {
          case -1204612331:
          default:
            return;
          case -550087942:
        }

        /* jnt */, (double)var0, (double)var1, (double)(var2 - var0), (double)(var3 - var1), var5
        );
        if (!var6) {
          /* jnt */);
        }

        var7 = -1844770711 * -1844770711 ^ 470281450;
      }
    }
  }

  public static void npn(int var0, int var1, int var2, int var3, zn var4) {
    /* jnt */);
  }

  public static void lpe(class_332 var0, zn var1, double var2, double var4, double var6, double var8, double var10) {
    /* jnt */;
  }

  public static void li(class_332 var0, zn var1, double var2, double var4, double var6, double var8, double var10, double var12, double var14, double var16) {
    int var37 = 1846796216;
    if (null /* jnt:encrypted */ != 0) {
      var37 = (596715950 | -1150948457) ^ -814213114;

      while (true) {
        switch ((var37 - 33016032 ^ 1916426914) + 240859345 + 1329977901 + 1773443553 + 515454026) {
          case -423931484:
            if (var6 < var2) {
              double var43 = var2;
              var2 = var6;
              var6 = var43;
            }

            var37 = 875026383 - -1752570820 ^ -1552631475;
            break;
          case 903527557:
            if (var8 < var4) {
              double var42 = var4;
              var4 = var8;
              var8 = var42;
            }

            var37 = (-1605036150 ^ -1605036150 | -102539212) & -33594441;
            break;
          case 1809887007:
          default:
            double var18 = var6 - var2;
            double var20 = var8 - var4;
            if (!(var18 <= 0.0) && !(var20 <= 0.0)) {
              var37 = (1238357945 - (-777485916 + -1435541859) | -1592488254) & -313028926;
            } else {
              var37 = 1810043310 - 1810043310 ^ 738912239;
            }

            switch (((var37 - 1994290375 ^ 21377367 ^ 729347701) - 500449723 ^ 477832952) + 382435276) {
              case -1273965437:
              default:
                return;
              case 957627314:
                double var22 = /* jnt */ / 2.0;
                var10 = /* jnt */;
                var12 = /* jnt */;
                var14 = /* jnt */;
                var16 = /* jnt */;
                zn var24 = (zn)/* jnt */,
                  null /* jnt:encrypted */,
                  null /* jnt:encrypted */,
                  null /* jnt:encrypted */
                );
                int var25 = (int)/* jnt */;
                int var26 = (int)/* jnt */;
                boolean var27 = /* jnt */);
                if (!var27) {
                  /* jnt */);
                }

                int var28 = var25;

                label61:
                while (true) {
                  var37 = (1459289992 + 1248595739 | -324877564) & -273425659;

                  while (true) {
                    switch (((var37 ^ 1474368070) + 424648986 ^ 898150353) - 1074365553 - 752212503 - 1078451472) {
                      case 543616510:
                        return;
                      case 955488756:
                      default:
                        if (var28 < var26) {
                          double var29 = (double)var28 + 0.5;
                          double var31 = /* jnt */;
                          double var33 = /* jnt */;
                          int var35 = (int)/* jnt */;
                          int var36 = (int)/* jnt */;
                          if (var36 > var35) {
                            /* jnt */,
                              (double)var35,
                              (double)var28,
                              (double)(var36 - var35),
                              1.0,
                              var24
                            );
                          }

                          var28++;
                          continue label61;
                        }

                        var37 = 584906459 * -845617194 ^ 640931206;
                        continue;
                      case 1783567269:
                    }

                    if (!var27) {
                      /* jnt */);
                    }

                    var37 = 36266783 >> 1720037190 ^ -1990241561;
                  }
                }
            }
        }
      }
    }
  }
  public static void ka(
    class_332 var0, zn var1, double var2, double var4, double var6, double var8, double var10, double var12, double var14, double var16, double var18
  ) {
    int var63 = 1000113669;
    if (null /* jnt:encrypted */ != 0) {
      var63 = -955003691 << -220089340 ^ 1033683428;

      while (true) {
        switch (((var63 ^ 658350891) + 1072014951 - 716184311 ^ 1390958334) + 1273479606 + 450936174) {
          case -1692515119:
            double var70 = var6 - var2;
            double var22 = var8 - var4;
            if (!(var70 <= 0.0) && !(var22 <= 0.0)) {
              var63 = (1943525458 | 801629180) ^ -730594354;
            } else {
              var63 = (962313316 - 571341835 | 548412583) & -51200849;
            }

            switch (var63 + 1538296881 + 700371370 - 265827500 - 1413697028 + 442354840 + 342238726) {
              case -2063046024:
                return;
              case -71580167:
              default:
                var18 = /* jnt */ / 2.0
                );
                double var24 = /* jnt */ / 2.0;
                var10 = /* jnt */;
                var12 = /* jnt */;
                var14 = /* jnt */;
                var16 = /* jnt */;
                double var26 = var2 + var18;
                double var28 = var4 + var18;
                double var30 = var6 - var18;
                double var32 = var8 - var18;
                if (!(var30 <= var26) && !(var32 <= var28)) {
                  var63 = (505395652 >> -770985225 | -1443959643) & -101781579;
                } else {
                  var63 = (-903419773 | -1987657449) ^ 653703393;
                }

                switch ((var63 + 1845869968 - 1440074325 + 1469921807 ^ 1176574995) + 892717476 + 1950530549) {
                  case -994776980:
                    /* jnt */;
                    return;
                  case 152406917:
                  default:
                    double var34 = /* jnt */;
                    double var36 = /* jnt */;
                    double var38 = /* jnt */;
                    double var40 = /* jnt */;
                    zn var42 = (zn)/* jnt */,
                      null /* jnt:encrypted */,
                      null /* jnt:encrypted */,
                      null /* jnt:encrypted */
                    );
                    int var43 = (int)/* jnt */;
                    int var44 = (int)/* jnt */;
                    int var45 = (int)/* jnt */;
                    int var46 = (int)/* jnt */;
                    boolean var47 = /* jnt */);
                    if (!var47) {
                      /* jnt */);
                    }

                    int var48 = var43;

                    label107:
                    while (true) {
                      var63 = (880821321 | 2141291445 | -1873270373) & -1176948741;

                      while (true) {
                        switch ((var63 ^ 584415658) + 264712207 ^ 1988762365 ^ 1583454496 ^ 1636106382 ^ 1251751204) {
                          case -1457442793:
                            if (var48 < var44) {
                              double var49 = (double)var48 + 0.5;
                              double var51 = /* jnt */;
                              double var53 = /* jnt */;
                              int var55 = (int)/* jnt */;
                              int var56 = (int)/* jnt */;
                              if (var56 <= var55) {
                                var63 = 994784195 >>> 1477470973 ^ -1013430969;
                              } else {
                                var63 = (1412358662 | 689685410 | 631979983 | -2125182894) & -645924518;
                              }

                              while (true) {
                                switch ((var63 + 438046355 + 1589756492 - 624401299 - 2143410249 ^ 311309076) - 1809239610) {
                                  case -1466011283:
                                    double var57 = /* jnt */;
                                    double var59 = /* jnt */;
                                    int var61 = (int)/* jnt */;
                                    int var62 = (int)/* jnt */;
                                    if (var61 > var55) {
                                      /* jnt */,
                                        (double)var55,
                                        (double)var48,
                                        (double)(/* jnt */ - var55),
                                        1.0,
                                        var42
                                      );
                                    }

                                    if (var56 > var62) {
                                      /* jnt */,
                                        (double)/* jnt */,
                                        (double)var48,
                                        (double)(
                                          var56 - /* jnt */
                                        ),
                                        1.0,
                                        var42
                                      );
                                    }

                                    var63 = 994784195 >>> 1477470973 ^ -1013430969;
                                    continue;
                                  case 438027043:
                                    var48++;
                                    continue label107;
                                  case 1048185680:
                                  default:
                                    /* jnt */,
                                      (double)var55,
                                      (double)var48,
                                      (double)(var56 - var55),
                                      1.0,
                                      var42
                                    );
                                    var63 = 994784195 >>> 1477470973 ^ -1013430969;
                                    continue;
                                  case 1410569999:
                                }

                                if (var48 >= var45) {
                                  if (var48 >= var46) {
                                    var63 = (-943396141 ^ -943396141 << -943396141 | 1694107019) & -419783233;
                                  } else {
                                    var63 = (1300276092 | 1121451484 << 1300276092) ^ -23720756;
                                  }
                                } else {
                                  var63 = (-943396141 ^ -943396141 << -943396141 | 1694107019) & -419783233;
                                }
                              }
                            }

                            var63 = 1182382356 << 408551423 ^ 671989924;
                            continue;
                          case 147647248:
                          default:
                            return;
                          case 426598250:
                        }

                        if (!var47) {
                          /* jnt */);
                        }

                        var63 = (1449942334 >> 1579643938 | -928890638) & -102599438;
                      }
                    }
                }
            }
          case -1430450218:
            if (var6 < var2) {
              double var69 = var2;
              var2 = var6;
              var6 = var69;
            }

            var63 = 618904772 >> 618904772 ^ -496000996;
            break;
          case -176025159:
          default:
            if (var8 < var4) {
              double var20 = var4;
              var4 = var8;
              var8 = var20;
            }

            var63 = (-1652609259 << -100800329 | 1949672648) & 1996335099;
            break;
          case 956558613:
            if (var18 <= 0.0) {
              return;
            }

            var63 = (-1425855153 * (-1734776047 >> -782956818) | -595420716) & -539297289;
        }
      }
    }
  }

  public static void pye(class_332 var0, zn var1, double var2, double var4, double var6) {
    int var23 = 1607405542;
    if (null /* jnt:encrypted */ != 0) {
      var23 = 1755867740 >>> 1011146560 ^ -1663438450;

      while (true) {
        switch ((var23 + 455405340 ^ 1946614757) + 1810578266 + 1982027706 + 1541249690 + 926747086) {
          case -256268153:
            if (var6 <= 0.0) {
              return;
            }

            var23 = (635957502 & -1528733817 | -1738594096) & -1713411344;
            break;
          case 892068741:
          default:
            zn var8 = (zn)/* jnt */,
              null /* jnt:encrypted */,
              null /* jnt:encrypted */,
              null /* jnt:encrypted */
            );
            int var9 = (int)/* jnt */;
            int var10 = (int)/* jnt */;
            double var11 = var6 * var6;
            boolean var13 = /* jnt */);
            if (!var13) {
              /* jnt */);
            }

            int var14 = var9;

            label50:
            while (true) {
              var23 = (-799153345 * -1698738136 | 241666566) & -1905288673;

              while (true) {
                switch (var23 + 1290869746 + 1387377061 - 234743000 + 844203074 - 919510669 ^ 284595624) {
                  case -1954939590:
                  default:
                    if (var14 < var10) {
                      double var15 = (double)var14 + 0.5 - var4;
                      double var17 = var11 - var15 * var15;
                      if (!(var17 <= 0.0)) {
                        double var19 = /* jnt */;
                        int var21 = (int)/* jnt */;
                        int var22 = (int)/* jnt */;
                        if (var22 > var21) {
                          /* jnt */, (double)var21, (double)var14, (double)(var22 - var21), 1.0, var8
                          );
                        }
                      }

                      var14++;
                      continue label50;
                    }

                    var23 = (-809297035 * 247842376 | 2048183198) & -94503010;
                    break;
                  case -1748280390:
                    if (!var13) {
                      /* jnt */);
                    }

                    var23 = (-1448310083 * (-565439728 - -565439728) | -1126281371) & -1107361931;
                    break;
                  case 1525713009:
                    return;
                }
              }
            }
        }
      }
    }
  }

  public static void zy(class_332 var0, int var1, double var2, double var4, double var6, double var8, double var10, double var12, double var14, double var16) {
    int var41 = 65236103;
    int var18 = var1 >> 24 & 0xFF;
    if (var18 != 0) {
      var41 = -1374426141 * -1374426141 ^ -1096567182;

      while (true) {
        switch (var41 + 1801995884 - 353861892 - 550495773 + 1606069537 ^ 755166812 ^ 58697025) {
          case -877010497:
          default:
            if (var8 < var4) {
              double var47 = var4;
              var4 = var8;
              var8 = var47;
            }

            var41 = (-234946038 >> -234946038 | 139600184) & -2007518788;
            break;
          case 871167289:
            double var46 = var6 - var2;
            double var21 = var8 - var4;
            if (!(var46 <= 0.0) && !(var21 <= 0.0)) {
              var41 = -1436182386 >> -1004470564 ^ 1047118077;
            } else {
              var41 = -259656669 - -1443788307 ^ -1153881767;
            }

            switch ((var41 + 522217193 - 830418008 ^ 1352186237 ^ 1890895985) + 1477740645 ^ 403758150) {
              case -12628801:
              default:
                double var23 = /* jnt */ / 2.0;
                var10 = /* jnt */;
                var12 = /* jnt */;
                var14 = /* jnt */;
                var16 = /* jnt */;
                int var25 = var1 >> 16 & 0xFF;
                int var26 = var1 >> 8 & 0xFF;
                int var27 = var1 & 0xFF;
                zn var28 = (zn)/* jnt */;
                int var29 = (int)/* jnt */;
                int var30 = (int)/* jnt */;
                boolean var31 = /* jnt */);
                if (!var31) {
                  /* jnt */);
                }

                int var32 = var29;

                label61:
                while (true) {
                  var41 = -162600657 ^ 226803951 ^ 2093136571;

                  while (true) {
                    switch ((var41 - 1385058245 + 1280861155 ^ 485500274 ^ 1452657772) + 1406721591 + 70683765) {
                      case -1649682042:
                      default:
                        return;
                      case 583448883:
                        if (var32 < var30) {
                          double var33 = (double)var32 + 0.5;
                          double var35 = /* jnt */;
                          double var37 = /* jnt */;
                          int var39 = (int)/* jnt */;
                          int var40 = (int)/* jnt */;
                          if (var40 > var39) {
                            /* jnt */,
                              (double)var39,
                              (double)var32,
                              (double)(var40 - var39),
                              1.0,
                              var28
                            );
                          }

                          var32++;
                          continue label61;
                        }

                        var41 = (438766125 - 166159097 | 1547714749) & 1575896253;
                        continue;
                      case 1953307761:
                    }

                    if (!var31) {
                      /* jnt */);
                    }

                    var41 = (-945330030 - -2089280823 | 304624550) & -1762692170;
                  }
                }
              case 996559671:
                return;
            }
          case 1251443386:
            if (var6 < var2) {
              double var19 = var2;
              var2 = var6;
              var6 = var19;
            }

            var41 = (-244507259 >>> -244507259 | 1351097910) & -251814089;
        }
      }
    }
  }

  public static void svz(class_332 var0, int var1, double var2, double var4, double var6) {
    int var27 = -1598018712;
    int var8 = var1 >> 24 & 0xFF;
    if (var8 != 0) {
      var27 = (909881971 + -1384229478 | -1738531054) & -1134313550;

      while (true) {
        switch (((var27 ^ 1581661396) - 1667701368 + 167520741 ^ 877895376) - 897875917 + 565550851) {
          case -1739798741:
          default:
            int var9 = var1 >> 16 & 0xFF;
            int var10 = var1 >> 8 & 0xFF;
            int var11 = var1 & 0xFF;
            zn var12 = (zn)/* jnt */;
            int var13 = (int)/* jnt */;
            int var14 = (int)/* jnt */;
            double var15 = var6 * var6;
            boolean var17 = /* jnt */);
            if (!var17) {
              /* jnt */);
            }

            int var18 = var13;

            label51:
            while (true) {
              var27 = 131853577 << 1646246990 ^ -583792689;

              while (true) {
                switch ((var27 ^ 419084479 ^ 1677858656) + 279689210 + 481128157 - 562522428 + 1607019794) {
                  case -1964047380:
                    if (!var17) {
                      /* jnt */);
                    }

                    var27 = (-1778879716 | -1778879716 | 138838243) & 777488619;
                    break;
                  case -970337603:
                    if (var18 < var14) {
                      double var19 = (double)var18 + 0.5 - var4;
                      double var21 = var15 - var19 * var19;
                      if (!(var21 <= 0.0)) {
                        double var23 = /* jnt */;
                        int var25 = (int)/* jnt */;
                        int var26 = (int)/* jnt */;
                        if (var26 > var25) {
                          /* jnt */,
                            (double)var25,
                            (double)var18,
                            (double)(var26 - var25),
                            1.0,
                            var12
                          );
                        }
                      }

                      var18++;
                      continue label51;
                    }

                    var27 = (-1908643049 - -1908643049 | 1672263392) & 2146238189;
                    break;
                  case -599189023:
                  default:
                    return;
                }
              }
            }
          case -1524904679:
            if (var6 <= 0.0) {
              return;
            }

            var27 = (1124905134 * 2126719644 | -1879764628) & -664084;
        }
      }
    }
  }

  public static double sbq(double var0, double var2, double var4, double var6, double var8, double var10) {
    int var20 = -667426468;
    if (var8 > 0.0 && var6 < var2 + var8) {
      double var21 = var0 + var8;
      double var22 = var2 + var8;
      double var23 = var6 - var22;
      double var24 = /* jnt */
      );
      return var21 - var24;
    } else {
      var20 = (-2025513917 << -2019528302 | -1667927784) & -1078495332;

      while (true) {
        switch (((var20 + 1643989933 ^ 855539604) - 1994227115 + 896905746 ^ 534183794) - 1238987307) {
          case -1443326305:
          default:
            if (var10 > 0.0 && var6 > var4 - var10) {
              double var12 = var0 + var10;
              double var14 = var4 - var10;
              double var16 = var6 - var14;
              double var18 = /* jnt */
              );
              return var12 - var18;
            }

            var20 = (531092626 << 1151731423 | -281655732) & -8948020;
            break;
          case -203986053:
            return var0;
        }
      }
    }
  }

  public static double xmq(double var0, double var2, double var4, double var6, double var8, double var10) {
    int var20 = 218311757;
    if (var8 > 0.0 && var6 < var2 + var8) {
      double var21 = var0 - var8;
      double var22 = var2 + var8;
      double var23 = var6 - var22;
      double var24 = /* jnt */
      );
      return var21 + var24;
    } else {
      var20 = (1768087600 * 1768087600 | 86554104) & 90814458;

      while (true) {
        switch ((var20 ^ 1547293100) + 385547506 - 658504077 - 1084587471 ^ 1324752788 ^ 1091374619) {
          case -1454933624:
            return var0;
          case 131987557:
        }

        if (var10 > 0.0 && var6 > var4 - var10) {
          double var12 = var0 - var10;
          double var14 = var4 - var10;
          double var16 = var6 - var14;
          double var18 = /* jnt */
          );
          return var12 + var18;
        }

        var20 = 301363163 << 1864533191 ^ 1353244253;
      }
    }
  }

  public static double urb(double var0, double var2) {
    return /* jnt */
      ? 0.0
      : /* jnt */;
  }

  public static Vector3f yx(double var0, double var2, double var4) {
    class_243 var6 = /* jnt */null /* jnt:encrypted */
        )
      )
    );
    /* jnt */,
      (float)(var0 - null /* jnt:encrypted */),
      (float)(var2 - null /* jnt:encrypted */),
      (float)(var4 - null /* jnt:encrypted */),
      1.0F
    );
    /* jnt */, null /* jnt:encrypted */
    );
    /* jnt */, null /* jnt:encrypted */
    );
    if (null /* jnt:encrypted */)
      <= 0.0F) {
      return null;
    } else {
      float var7 = 1.0F
        / null /* jnt:encrypted */);
      float var8 = null /* jnt:encrypted */
        )
        * var7;
      float var9 = null /* jnt:encrypted */
        )
        * var7;
      float var10 = (float)/* jnt */null /* jnt:encrypted */
        )
      );
      float var11 = (var8 * 0.5F + 0.5F)
        * (float)/* jnt */null /* jnt:encrypted */
          )
        )
        / var10;
      float var12 = (1.0F - (var9 * 0.5F + 0.5F))
        * (float)/* jnt */null /* jnt:encrypted */
          )
        )
        / var10;
      return (Vector3f)/* jnt */)
          * var7
      );
    }
  }

  public static void jjz(Matrix4f var0, Matrix4f var1) {
    /* jnt */, var0
    );
    /* jnt */, var1
    );
    Matrix4f var2 = /* jnt *//* jnt */
    );
    Matrix4f var3 = /* jnt *//* jnt */
    );
    Vector4f var4 = /* jnt *//* jnt */, var2
      ),
      var3
    );
    /* jnt */
    );
    class_243 var5 = /* jnt */null /* jnt:encrypted */
        )
      )
    );
    null /* jnt:encrypted *//* jnt */
          + (double)null /* jnt:encrypted */,
        null /* jnt:encrypted */
          + (double)null /* jnt:encrypted */,
        null /* jnt:encrypted */
          + (double)null /* jnt:encrypted */
      )
    );
  }

  public static void rlg(class_332 var0, class_1799 var1, int var2, int var3) {
    /* jnt */;
  }

  public static void uq(class_332 var0, class_1799 var1, int var2, int var3, float var4, boolean var5) {
    int var9 = -876652351;
    if (var1 != null && !/* jnt */) {
      var9 = (-1699510769 ^ -1699510769 | -118088837) & -33645701;
    } else {
      var9 = (-176071939 << 380238792 | 1113587828) & -1015578115;
    }

    switch (var9 + 2057157437 + 702646062 + 552653266 - 67202034 ^ 1231808282 ^ 693557180) {
      case -631639200:
      default:
        Matrix3x2fStack var6 = /* jnt */;
        /* jnt */;
        if (var5) {
          /* jnt *//* jnt */null /* jnt:encrypted */
                )
              )
          );
        }

        /* jnt */;
        int var7 = (int)((float)var2 / var4);
        int var8 = (int)((float)var3 / var4);
        /* jnt */;
        /* jnt */;
        return;
      case -455337703:
    }
  }

  public static void zj(class_332 var0, class_1799 var1, int var2, int var3, int var4, float var5) {
    int var9 = 468920368;
    if (var1 != null && !/* jnt */) {
      var9 = (-1519376707 + -1730909442 | 1194360353) & 1199210025;
    } else {
      var9 = (1069266397 >>> 1069266397 | -509790632) & -268615713;
    }

    switch (((var9 + 1732868815 ^ 226733964) - 158341800 ^ 1094822670) - 777723807 ^ 442618257) {
      case -1336825422:
        int var6 = (int)(16.0F * var5);
        int var7 = (var4 - var6) / 2;
        int var8 = (var4 - var6) / 2;
        /* jnt */;
        return;
      case 1446533314:
    }
  }

  public static int vlx(double var0) {
    return (int)(
      var0
        * (double)/* jnt */null /* jnt:encrypted */
          )
        )
    );
  }

  static {
    int var10000 = 26754387 - 1129221783 ^ -1102467396;

    StringBuilder var10001;
    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < ((1788610691 & 1788610691 | 24) & -2073869283);
      var10000 += (669257813 ^ 48175682 & 669257813 >>> 48175682 | 0) & 4369065
    ) {
      int var2 = /* jnt */
          + 'i'
        ^ 156;
      int var10004 = (var2 & 65472) >> 6;
      int var3 = ((var2 & 65472) >> 6 | var2 << 10) + 204;
      int var7 = (((var2 & 65472) >> 6 | var2 << 10) + 204 & 65408) >> 7;
      char var4 = (char)(((var10004 | var2 << 10) + 204 & 65408) >> 7 | ((var2 & 65472) >> 6 | var2 << 10) + 204 << 9);
      /* jnt */(var7 | var3 << 9)
      );
    }

    fn = (class_11278)/* jnt */,
      -10.0F,
      100.0F,
      true
    );
    gf = true;
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (((var10 ^ 500955104) + 1461919185 - 1203125630 - 2048850905 ^ 668774163) - 1769373294 ^ 1835192496) + 1104141510 - 480057508;
    MethodHandle var10000 = vzr[(((var10 ^ 500955104) + 1461919185 - 1203125630 - 2048850905 ^ 668774163) - 1769373294 ^ 1835192496)
      + 1104141510
      - 480057508
      + 1744131499];
    if (vzr[var10001 + 1744131499] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (325969278 - 325969278 | 0) & 79169844; var23 < var13.length(); var23 += (-1675958684 | 439548999) ^ -1640300954) {
        int var42 = (((var13.charAt(var23) ^ ':') - 159 ^ 23) + 86 - 94 ^ 152) + 38 ^ 90;
        char var43 = (char)(((var42 & 65472) >> 6 | var42 << 10) - 16);
        var13.setCharAt(var23, (char)(((var42 & 65472) >> 6 | var42 << 10) - 16));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (1230399976 << -352826363 | 0) & 18890765; var29 < var16.length(); var29 += 1572208961 << -1985984632 ^ -1241431807) {
        int var48 = var16.charAt(var29) + 129 + 3;
        int var83 = (var48 & 65520) >> 4;
        int var49 = ((var48 & 65520) >> 4 | var48 << 12) + 58 + 64;
        int var84 = (((var48 & 65520) >> 4 | var48 << 12) + 58 + 64 & 61440) >> 12;
        var48 = ((var83 | var48 << 12) + 58 + 64 & 61440) >> 12 | ((var48 & 65520) >> 4 | var48 << 12) + 58 + 64 << 4;
        var83 = ((var84 | var49 << 4) & 65535) >> 0;
        int var51 = ((var84 | var49 << 4) & 65535) >> 0 | var48 << 16;
        int var86 = ((((var84 | var49 << 4) & 65535) >> 0 | var48 << 16) & 57344) >> 13;
        var48 = ((var83 | var48 << 16) & 57344) >> 13 | (((var84 | var49 << 4) & 65535) >> 0 | var48 << 16) << 3;
        var83 = ((var86 | var51 << 3) & 64512) >> 10;
        int var53 = ((var86 | var51 << 3) & 64512) >> 10 | var48 << 6;
        int var88 = ((((var86 | var51 << 3) & 64512) >> 10 | var48 << 6) & 65504) >> 5;
        char var54 = (char)(((var83 | var48 << 6) & 65504) >> 5 | (((var86 | var51 << 3) & 64512) >> 10 | var48 << 6) << 11);
        var16.setCharAt(var29, (char)(var88 | var53 << 11));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), c.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (-127468831 * -1799477840 | 0) & 212992000; var35 < var19.length(); var35 += (-149607990 * 726328224 | 1) & -1069301441) {
        int var59 = var19.charAt(var35) ^ 'w';
        int var89 = (var59 & 32768) >> 15;
        int var60 = (var59 & 32768) >> 15 | var59 << 1;
        int var90 = (((var59 & 32768) >> 15 | var59 << 1) & 64512) >> 10;
        var59 = ((var89 | var59 << 1) & 64512) >> 10 | ((var59 & 32768) >> 15 | var59 << 1) << 6;
        var89 = ((var90 | var60 << 6) & 65528) >> 3;
        int var62 = ((((var90 | var60 << 6) & 65528) >> 3 | var59 << 13) - 79 ^ 199) + 98 ^ 197 ^ 205;
        int var92 = ((((((var90 | var60 << 6) & 65528) >> 3 | var59 << 13) - 79 ^ 199) + 98 ^ 197 ^ 205) & 64512) >> 10;
        char var63 = (char)(
          ((((var89 | var59 << 13) - 79 ^ 199) + 98 ^ 197 ^ 205) & 64512) >> 10
            | (((((var90 | var60 << 6) & 65528) >> 3 | var59 << 13) - 79 ^ 199) + 98 ^ 197 ^ 205) << 6
        );
        var19.setCharAt(var35, (char)(var92 | var62 << 6));
      }

      Class var7 = Class.forName(var19.toString(), false, c.class.getClassLoader());
      switch ((((var4 ^ 642269347 ^ 1275868876 ^ 567711418) - 257627337 + 1136545934 + 1271482534 ^ 191751123) - 815670418 ^ 1588806519) + 2132556733) {
        case 118481052:
          var10000 = var0.findSpecial(var7, var5, var6, c.class);
          break;
        case 349481151:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 742453504:
        case 1423100301:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1192881795:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    vzr[(((var10 ^ 500955104) + 1461919185 - 1203125630 - 2048850905 ^ 668774163) - 1769373294 ^ 1835192496) + 1104141510 - 480057508 + 1744131499] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 + 1665499593 ^ 515195099 ^ 1755412529 ^ 974655459 ^ 100272478) + 578407451 + 991275994 ^ 1833067802) + 1607008927;
    MethodHandle var10000 = vzr[((var10 + 1665499593 ^ 515195099 ^ 1755412529 ^ 974655459 ^ 100272478) + 578407451 + 991275994 ^ 1833067802)
      + 1607008927
      + 809296044];
    if (vzr[var10001 + 809296044] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (-995181955 ^ 1231121928 & 1231121928 | 0) & 36700682; var24 < var14.length(); var24 += -1648489916 >> -1211852829 ^ -206061239) {
        int var43 = var14.charAt(var24) - 201 - 60;
        int var10004 = (var43 & 65520) >> 4;
        int var44 = ((var43 & 65520) >> 4 | var43 << 12) ^ 130 ^ 251;
        int var84 = ((((var43 & 65520) >> 4 | var43 << 12) ^ 130 ^ 251) & 65520) >> 4;
        var43 = (((var10004 | var43 << 12) ^ 130 ^ 251) & 65520) >> 4 | (((var43 & 65520) >> 4 | var43 << 12) ^ 130 ^ 251) << 12;
        var10004 = ((var84 | var44 << 12) & 65528) >> 3;
        int var46 = (((var84 | var44 << 12) & 65528) >> 3 | var43 << 13) - 243 + 158;
        int var86 = ((((var84 | var44 << 12) & 65528) >> 3 | var43 << 13) - 243 + 158 & 57344) >> 13;
        char var47 = (char)(((var10004 | var43 << 13) - 243 + 158 & 57344) >> 13 | (((var84 | var44 << 12) & 65528) >> 3 | var43 << 13) - 243 + 158 << 3);
        var14.setCharAt(var24, (char)(var86 | var46 << 3));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (1695627558 >> 1695627558 + 779061629 | 0) & -1823385581; var30 < var17.length(); var30 += 1333056251 - 1317175941 ^ 15880311) {
        int var52 = var17.charAt(var30) ^ 196;
        int var87 = (var52 & 57344) >> 13;
        int var53 = ((var52 & 57344) >> 13 | var52 << 3) - 121;
        int var88 = (((var52 & 57344) >> 13 | var52 << 3) - 121 & 65504) >> 5;
        var52 = (((var87 | var52 << 3) - 121 & 65504) >> 5 | ((var52 & 57344) >> 13 | var52 << 3) - 121 << 11) - 187 + 122;
        var87 = ((var88 | var53 << 11) - 187 + 122 & 65472) >> 6;
        int var55 = (((var88 | var53 << 11) - 187 + 122 & 65472) >> 6 | var52 << 10) + 245;
        int var90 = ((((var88 | var53 << 11) - 187 + 122 & 65472) >> 6 | var52 << 10) + 245 & 65472) >> 6;
        char var56 = (char)((((var87 | var52 << 10) + 245 & 65472) >> 6 | (((var88 | var53 << 11) - 187 + 122 & 65472) >> 6 | var52 << 10) + 245 << 10) + 17);
        var17.setCharAt(var30, (char)((var90 | var55 << 10) + 17));
      }

      Class var6 = Class.forName(var17.toString(), false, c.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = 635877795 >> 650184415 ^ 0; var36 < var20.length(); var36 += 1783964467 & -2080174821 ^ 65810) {
        char var61 = var20.charAt(var36);
        char var64 = (char)(
          (
              (
                    (
                        (((((var61 & '\uf800') >> 11 | var61 << 5) + 123 + 78 & 65532) >> 2 | ((var61 & '\uf800') >> 11 | var61 << 5) + 123 + 78 << 14) & 65472)
                            >> 6
                          | ((((var61 & '\uf800') >> 11 | var61 << 5) + 123 + 78 & 65532) >> 2 | ((var61 & '\uf800') >> 11 | var61 << 5) + 123 + 78 << 14)
                            << 10
                      )
                      ^ 21
                  )
                  - 228
                  - 5
                ^ 237
            )
            - 197
        );
        var20.setCharAt(
          var36,
          (char)(
            (
                (
                      (
                          (
                                ((((var61 & '\uf800') >> 11 | var61 << 5) + 123 + 78 & 65532) >> 2 | ((var61 & '\uf800') >> 11 | var61 << 5) + 123 + 78 << 14)
                                  & 65472
                              )
                              >> 6
                            | ((((var61 & '\uf800') >> 11 | var61 << 5) + 123 + 78 & 65532) >> 2 | ((var61 & '\uf800') >> 11 | var61 << 5) + 123 + 78 << 14)
                              << 10
                        )
                        ^ 21
                    )
                    - 228
                    - 5
                  ^ 237
              )
              - 197
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), c.class.getClassLoader()).returnType();
      switch ((var4 + 560712239 ^ 2098375346) + 674472329 - 1878974775 + 1011698077 + 208582259 + 605282634 - 823815117 + 1592719667 ^ 819306244) {
        case 684009403:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 750338764:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 774251434:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1690246698:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      vzr[((var10 + 1665499593 ^ 515195099 ^ 1755412529 ^ 974655459 ^ 100272478) + 578407451 + 991275994 ^ 1833067802) + 1607008927 + 809296044] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
