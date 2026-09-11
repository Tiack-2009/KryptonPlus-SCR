// Status: PARTIAL - JNT native encryption (strings in jnt.so)


// === KRYPTON PLUS - DEOBFUSCATED ===
// Class: cok
// Identity: PacketHandler (packet processing module)
// Obfuscation: JNT (jnt.so) native obfuscator
// Note: String literals and some method bodies are encrypted in native .so

import dev.krypton.jnt3.Loader;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.class_1707;
import net.minecraft.Item;
import net.minecraft.ItemStack;
import net.minecraft.Text;
import net.minecraft.class_634;
import net.minecraft.Item.class_9635;

public class cok extends np {
  public o aw;
  public ib cd;
  public e br;
  public rt bq;
  public kc ce;
  public int fy;
  public boolean sv;
  // [JNT] MethodHandle dispatch table (removed)
  public cok() {
    int var10001 = 322238052 << 322238052 ^ 860841536;

    StringBuilder var10002;
    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((2049838013 * 2049838013 | 9) & -1602083713);
      var10001 += -1296862846 - -1296862846 ^ 1
    ) {
      char var32 = /* jnt */;
      char var35 = (char)(
        (((((((var32 & '￠') >> 5 | var32 << 11) ^ 187) & 65534) >> 1 | (((var32 & '￠') >> 5 | var32 << 11) ^ 187) << 15) ^ 216) & 64512) >> 10
          | ((((((var32 & '￠') >> 5 | var32 << 11) ^ 187) & 65534) >> 1 | (((var32 & '￠') >> 5 | var32 << 11) ^ 187) << 15) ^ 216) << 6
      );
      /* jnt */(
          (((((((var32 & '￠') >> 5 | var32 << 11) ^ 187) & 65534) >> 1 | (((var32 & '￠') >> 5 | var32 << 11) ^ 187) << 15) ^ 216) & 64512) >> 10
            | ((((((var32 & '￠') >> 5 | var32 << 11) ^ 187) & 65534) >> 1 | (((var32 & '￠') >> 5 | var32 << 11) ^ 187) << 15) ^ 216) << 6
        )
      );
    }

    String var2 = /* jnt */;
    int var16 = ~(-837062809 >> -231412066);

    StringBuilder var37;
    for (var37 = (StringBuilder)/* jnt */;
      var16 < ((-651008994 >>> -651008994 | 28) & 1276422367);
      var16 += -424576567 ^ 1813161677 ^ -1968972027
    ) {
      char var72 = /* jnt */;
      int var10006 = (var72 & '￠') >> 5;
      int var73 = (var72 & '￠') >> 5 | var72 << 11;
      int var120 = (((var72 & '￠') >> 5 | var72 << 11) & 65532) >> 2;
      var72 = (char)((((var10006 | var72 << 11) & 65532) >> 2 | ((var72 & '￠') >> 5 | var72 << 11) << 14) + 86 + 111 + 150);
      /* jnt */((var120 | var73 << 14) + 86 + 111 + 150));
    }

    super(
      var2,
      /* jnt */,
      -1,
      null /* jnt:encrypted */
    );
    var10001 = (129190044 ^ 1145925591 | 0) & -2080339952;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((-298073170 << 828837243 | 4) & 123167069);
      var10001 += (1770695923 ^ 466189651 | 1) & -2129649573
    ) {
      int var40 = /* jnt */ + 244;
      char var43 = (char)(
        (((((var40 & 65532) >> 2 | var40 << 14) & 0) >> 16 | ((var40 & 65532) >> 2 | var40 << 14) << 0) + 250 & 65024) >> 9
          | ((((var40 & 65532) >> 2 | var40 << 14) & 0) >> 16 | ((var40 & 65532) >> 2 | var40 << 14) << 0) + 250 << 7
      );
      /* jnt */(
          (((((var40 & 65532) >> 2 | var40 << 14) & 0) >> 16 | ((var40 & 65532) >> 2 | var40 << 14) << 0) + 250 & 65024) >> 9
            | ((((var40 & 65532) >> 2 | var40 << 14) & 0) >> 16 | ((var40 & 65532) >> 2 | var40 << 14) << 0) + 250 << 7
        )
      );
    }

    this.aw = (o)/* jnt */,
      null /* jnt:encrypted */,
      lp.class
    );
    var10001 = (1961862838 >> 1961862838 | 0) & -823188476;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((1748046607 | 499863558) ^ 2113622795);
      var10001 += (986080087 ^ -1450430039 | 1) & 1082228993
    ) {
      int var46 = /* jnt */ ^ ' ';
      int var106 = (var46 & 65535) >> 0;
      int var47 = ((var46 & 65535) >> 0 | var46 << 16) + 233;
      int var107 = (((var46 & 65535) >> 0 | var46 << 16) + 233 & 65528) >> 3;
      char var48 = (char)((((var106 | var46 << 16) + 233 & 65528) >> 3 | ((var46 & 65535) >> 0 | var46 << 16) + 233 << 13) + 226);
      /* jnt */((var107 | var47 << 13) + 226));
    }

    this.cd = (ib)/* jnt */,
      null /* jnt:encrypted */
    );
    var10001 = (-1736061664 * 176831694 | 0) & 67113021;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < (292535122 - (1191051950 >> 292535122) ^ 292530584);
      var10001 += (2086758607 | 1684674786) ^ 2087418094
    ) {
      int var51 = (/* jnt */ ^ 243) - 239 ^ 167;
      int var108 = (var51 & 65520) >> 4;
      int var52 = (var51 & 65520) >> 4 | var51 << 12;
      int var109 = (((var51 & 65520) >> 4 | var51 << 12) & 65535) >> 0;
      char var53 = (char)(((var108 | var51 << 12) & 65535) >> 0 | ((var51 & 65520) >> 4 | var51 << 12) << 16);
      /* jnt */(var109 | var52 << 16));
    }

    this.br = (e)/* jnt */, ""
    );
    var10001 = (584505612 | -1771786041 | 0) & 66608;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((141297809 | -1044727073 | 1) & 33637669);
      var10001 += -1747639038 << (-712390252 << -1286539818) ^ -1747639037
    ) {
      int var56 = /* jnt */ - 249;
      int var110 = (var56 & 65472) >> 6;
      int var57 = ((var56 & 65472) >> 6 | var56 << 10) ^ 143;
      int var111 = ((((var56 & 65472) >> 6 | var56 << 10) ^ 143) & 65504) >> 5;
      char var58 = (char)(((((var110 | var56 << 10) ^ 143) & 65504) >> 5 | (((var56 & 65472) >> 6 | var56 << 10) ^ 143) << 11) ^ 50);
      /* jnt */((var111 | var57 << 11) ^ 50));
    }

    rt var11 = (rt)/* jnt */, 0.0, 20.0, 2.0, 1.0
    );
    int var26 = (-788363625 | 790506684 | 0) & 4280320;

    for (var37 = (StringBuilder)/* jnt */;
      var26 < ((97277615 | -382688522 ^ 97277615) ^ -302188830);
      var26 += (-1871168000 << -1552935877 | 1) & 2101027919
    ) {
      int var86 = /* jnt */;
      int var121 = (var86 & 65532) >> 2;
      int var87 = (var86 & 65532) >> 2 | var86 << 14;
      int var122 = (((var86 & 65532) >> 2 | var86 << 14) & 65472) >> 6;
      var86 = (((var121 | var86 << 14) & 65472) >> 6 | ((var86 & 65532) >> 2 | var86 << 14) << 10) + 188;
      var121 = ((var122 | var87 << 10) + 188 & 65520) >> 4;
      int var89 = ((var122 | var87 << 10) + 188 & 65520) >> 4 | var86 << 12;
      int var124 = ((((var122 | var87 << 10) + 188 & 65520) >> 4 | var86 << 12) & 65408) >> 7;
      char var90 = (char)(((var121 | var86 << 12) & 65408) >> 7 | (((var122 | var87 << 10) + 188 & 65520) >> 4 | var86 << 12) << 9);
      /* jnt */(var124 | var89 << 9));
    }

    this.bq = /* jnt */
    );
    var10001 = 1497384153 >> 980209558 ^ 357;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((-2122527347 >>> 715197673 | 9) & -1063894643);
      var10001 += -1011069725 & 611632843 ^ 3425474
    ) {
      char var63 = /* jnt */;
      int var116 = (var63 & '︀') >> 9;
      int var64 = ((var63 & '︀') >> 9 | var63 << 7) - 163 + 0 + 46;
      int var117 = (((var63 & '︀') >> 9 | var63 << 7) - 163 + 0 + 46 & 65472) >> 6;
      char var65 = (char)(((var116 | var63 << 7) - 163 + 0 + 46 & 65472) >> 6 | ((var63 & '︀') >> 9 | var63 << 7) - 163 + 0 + 46 << 10);
      /* jnt */(var117 | var64 << 10));
    }

    kc var14 = (kc)/* jnt */, true
    );
    int var30 = 1131278052 + -2048748241 ^ -917470189;

    for (var37 = (StringBuilder)/* jnt */;
      var30 < ((-67229545 >>> -67229545 | 72) & 373862472);
      var30 += (-231853671 ^ -231853671 | 1) & 370963675
    ) {
      char var95 = /* jnt */;
      int var125 = (var95 & '\ufff8') >> 3;
      int var96 = (var95 & '\ufff8') >> 3 | var95 << '\r';
      int var126 = (((var95 & '\ufff8') >> 3 | var95 << '\r') & 49152) >> 14;
      var95 = (char)((((var125 | var95 << '\r') & 49152) >> 14 | ((var95 & '\ufff8') >> 3 | var95 << '\r') << 2) - 179 - 67 + 245);
      /* jnt */((var126 | var96 << 2) - 179 - 67 + 245));
    }

    this.ce = /* jnt */
    );
    /* jnt */,
        null /* jnt:encrypted */,
        null /* jnt:encrypted */,
        null /* jnt:encrypted */,
        null /* jnt:encrypted */
      }
    );
  }

  @Override
    // [JNT_NATIVE] void dz() - implementation encrypted in native .so library
  public native void dz();

  @Override
  public void x() {
    /* jnt */;
  }
  @yet
  public void za(by var1) {
    int var12 = 538354310;
    if (null /* jnt:encrypted */
      )
      != null) {
      var12 = 944630727 >>> 70628160 ^ 1327400873;

      while (true) {
        label409:
        while (true) {
          switch (((var12 - 1390585264 ^ 2011366383) - 2143443952 ^ 1815957687) + 1742562733 + 189228810) {
            case 259703432:
              if (null /* jnt:encrypted */
                )
              ) instanceof class_1707 var2x) {
                var12 = (-106055468 << -106055468 | 1410534013) & 1998552831;
                break label409;
              }

              var12 = (-1481622460 >> (-1927903278 << -1481622460) | 1265459210) & -9438549;
              break;
            case 856753805:
            default:
              if (null /* jnt:encrypted */ > 0) {
                null /* jnt:encrypted */ - 1);
                return;
              }

              var12 = (1598006077 >> -371107936 | -265775584) & -231022860;
              continue;
            case 2012517507:
              if (!/* jnt *//* jnt */),
                null /* jnt:encrypted */
              )) {
                var12 = (-1080739589 << -1080739589 | 44738665) & 1543487231;
                continue;
              }

              if (null /* jnt:encrypted */
                  )
                ) instanceof class_1707 var2x
                && /* jnt */ == 4) {
                var12 = (1143973204 - 1108945111 | -1066810472) & -1015297096;
                break label409;
              }

              var12 = 103278780 >> 103278780 ^ -1427439941;
          }

          switch (var12 + 394354669 + 1952184359 - 315519261 - 966883550 + 1240953260 - 611627137) {
            case 266022399:
            default:
              class_634 var53 = /* jnt */
              );
              int var57 = -693145788 & -1792565649 ^ -1809379772;

              StringBuilder var66;
              for (var66 = (StringBuilder)/* jnt */;
                var57 < ((1064593483 | 1064593483) ^ 1064593487);
                var57 += -929415748 & 1778278546 ^ 1218060433
              ) {
                int var81 = (/* jnt */ ^ '<') + 193;
                char var82 = (char)(((var81 & 61440) >> 12 | var81 << 4) - 133 - 77);
                /* jnt */(((var81 & 61440) >> 12 | var81 << 4) - 133 - 77)
                );
              }

              /* jnt */
              );
              null /* jnt:encrypted */;
              return;
            case 1415423822:
              String var14 = /* jnt */;
              int var10001 = (1169795568 << 461042996 | 0) & 1610835730;

              StringBuilder var10002;
              for (var10002 = (StringBuilder)/* jnt */;
                var10001 < ((950436879 | -306707942) ^ -37845476);
                var10001 += (-1621804162 - (-1988945123 & -1621804162 << -1988945123) | 1) & -2144812927
              ) {
                char var73 = /* jnt */;
                char var76 = (char)(
                  (((((var73 & '￠') >> 5 | var73 << 11) - 51 - 208 & 65472) >> 6 | ((var73 & '￠') >> 5 | var73 << 11) - 51 - 208 << 10) & 57344) >> 13
                    | ((((var73 & '￠') >> 5 | var73 << 11) - 51 - 208 & 65472) >> 6 | ((var73 & '￠') >> 5 | var73 << 11) - 51 - 208 << 10) << 3
                );
                /* jnt */(
                    (((((var73 & '￠') >> 5 | var73 << 11) - 51 - 208 & 65472) >> 6 | ((var73 & '￠') >> 5 | var73 << 11) - 51 - 208 << 10) & 57344) >> 13
                      | ((((var73 & '￠') >> 5 | var73 << 11) - 51 - 208 & 65472) >> 6 | ((var73 & '￠') >> 5 | var73 << 11) - 51 - 208 << 10) << 3
                  )
                );
              }

              if (/* jnt */
              )) {
                null /* jnt:encrypted */;
                return;
              }

              var12 = 899232149 >> -1678837539 ^ -920423282;

              while (true) {
                switch ((var12 + 193262184 - 1104883198 ^ 858758432 ^ 519777807) - 1573884939 ^ 2028474914) {
                  case -1986803481:
                  default:
                    class_634 var10000 = /* jnt */
                    );
                    StringBuilder var56 = (StringBuilder)/* jnt */;
                    int var64 = (-403701706 & -1784949283 | 0) & 168001353;

                    StringBuilder var78;
                    for (var78 = (StringBuilder)/* jnt */;
                      var64 < (-695425776 >>> -628911366 ^ 51);
                      var64 += (-1614878425 | -1468605983) ^ -1073808922
                    ) {
                      int var103 = /* jnt */ ^ 'g';
                      char var104 = (char)(((var103 & 65024) >> 9 | var103 << 7) + 230 - 53 + 160);
                      /* jnt */(((var103 & 65024) >> 9 | var103 << 7) + 230 - 53 + 160)
                      );
                    }

                    /* jnt */
                          ),
                          var14
                        )
                      )
                    );
                    null /* jnt:encrypted */;
                    return;
                  case 430040553:
                    if (!/* jnt */)
                    )) {
                      String var11 = /* jnt */
                      );
                      var14 = /* jnt *//* jnt */, var14
                            ),
                            " "
                          ),
                          var11
                        )
                      );
                    }

                    var12 = 1141060082 & 1579472745 ^ -587855627;
                }
              }
          }
        }

        while (true) {
          switch ((var12 ^ 42354585 ^ 563646322 ^ 1419901842) - 1796684371 ^ 1452887259 ^ 157550709) {
            case -1916384679:
              /* jnt */
                )
              );
              break;
            case -1055881672:
              if (/* jnt */ == 4) {
                int var17 = /* jnt */
                );
                if (var17 > 0) {
                  if (null /* jnt:encrypted */ && var17 == 36) {
                    null /* jnt:encrypted */;
                    /* jnt */
                      )
                    );
                    return;
                  }

                  var12 = -1503541709 & -1481444085 ^ -1975030612;
                } else {
                  var12 = (1483783634 >> -812460020 + 228899522 | -958030144) & -285745436;
                }

                label307:
                while (true) {
                  switch ((var12 ^ 811077830) - 1038544351 + 424128053 - 279468553 ^ 756893583 ^ 1556541850) {
                    case -1759270749:
                    default:
                      class_1792 var19 = /* jnt */
                      );
                      int var21 = null /* jnt:encrypted */
                          )
                        )
                      );
                      ArrayList var24 = (ArrayList)/* jnt */;
                      class_1799 var28 = null /* jnt:encrypted */;
                      int var32 = 36;
                      var12 = (986887352 + 1291180447 | 1411698820) & 1957158303;

                      label304:
                      while (true) {
                        switch (((var12 ^ 962706470) + 143147420 ^ 1497262825) - 1630339913 - 2002774716 ^ 134507295) {
                          case 440998061:
                            if (/* jnt */) {
                              var12 = (1483783634 >> -812460020 + 228899522 | -958030144) & -285745436;
                              continue label307;
                            }

                            if (/* jnt */)
                              && /* jnt */ > 1) {
                              var32 = /* jnt *//* jnt */
                              );
                              /* jnt */
                                ),
                                var21,
                                var32,
                                0,
                                null /* jnt:encrypted */,
                                null /* jnt:encrypted */
                                )
                              );
                              int var37 = 1;

                              while (true) {
                                var12 = (19275314 - 1408014504 | 1423069212) & 2012672380;

                                while (true) {
                                  switch ((var12 + 984644151 + 1599986557 ^ 1642302749) - 397107050 ^ 531451596 ^ 798165698) {
                                    case -378724095:
                                    default:
                                      /* jnt */
                                        ),
                                        var21,
                                        var32,
                                        0,
                                        null /* jnt:encrypted */,
                                        null /* jnt:encrypted */
                                        )
                                      );
                                      /* jnt */
                                        ),
                                        var21,
                                        var32,
                                        0,
                                        null /* jnt:encrypted */,
                                        null /* jnt:encrypted */
                                        )
                                      );
                                      break label307;
                                    case 1778976877:
                                  }

                                  if (var37 < /* jnt */) {
                                    /* jnt */
                                      ),
                                      var21,
                                      /* jnt *//* jnt */
                                      ),
                                      0,
                                      null /* jnt:encrypted */,
                                      null /* jnt:encrypted */
                                      )
                                    );
                                    var37++;
                                    break;
                                  }

                                  var12 = (1847735761 >>> 1847735761 | -150015824) & -139463758;
                                }
                              }
                            }

                            var12 = (1463116558 - -1989981925 | 6571536) & 2046250841;
                            break;
                          case 1335171818:
                            Iterator var33 = /* jnt */;

                            while (/* jnt */) {
                              int var36 = /* jnt *//* jnt */
                              );
                              /* jnt */
                                ),
                                var21,
                                var36,
                                1,
                                null /* jnt:encrypted */,
                                null /* jnt:encrypted */
                                )
                              );
                              null /* jnt:encrypted */
                              );
                              if (/* jnt */)
                                != 0) {
                                return;
                              }
                            }
                            break label307;
                          case 1591914880:
                          default:
                            if (var32 >= 72) {
                              var12 = 154431232 ^ -852678194 ^ 1445147434;
                            } else {
                              class_1799 var35 = (ItemStack)/* jnt */
                                    )
                                  )
                                ),
                                var32
                              );
                              if (!/* jnt */) {
                                if (/* jnt */
                                  != var19) {
                                  var12 = 630781364 * 574995561 ^ 1401917028;
                                } else {
                                  var12 = (299874721 ^ 299874721 | -190268238) & -35061830;
                                }
                              } else {
                                var12 = 630781364 * 574995561 ^ 1401917028;
                              }

                              while (true) {
                                switch ((var12 - 332900617 - 1700216495 ^ 166554425) - 1207887895 + 911516753 + 6120762) {
                                  case -88803970:
                                    if (/* jnt */) {
                                      /* jnt */
                                      );
                                    }
                                    break;
                                  case 531701045:
                                    var32++;
                                    var12 = (986887352 + 1291180447 | 1411698820) & 1957158303;
                                    continue label304;
                                  case 1632100663:
                                  default:
                                    if (!/* jnt */) {
                                      var12 = 1514787280 >>> 403840502 * 403840502 ^ 2059353078;
                                      continue;
                                    }

                                    var28 = var35;
                                    /* jnt */
                                    );
                                }

                                var12 = 630781364 * 574995561 ^ 1401917028;
                              }
                            }
                        }
                      }
                    case -1330806202:
                      /* jnt */
                        )
                      );
                      null /* jnt:encrypted */;
                      return;
                  }
                }

                null /* jnt:encrypted */;
                return;
              }

              var12 = -2087165630 & -2087165630 ^ 1538709937;
              continue;
            case -395724257:
            default:
              if (/* jnt */ == 6) {
                class_1799 var16 = /* jnt */
                );
                if (/* jnt */
                )) {
                  null /* jnt:encrypted */;
                  /* jnt */
                    )
                  );
                  return;
                }

                class_9635 var18 = /* jnt */
                  )
                );
                List var20 = /* jnt */
                  ),
                  null /* jnt:encrypted */
                );
                Iterator var22 = /* jnt */;

                label360:
                while (true) {
                  var12 = (741331229 >> -2135860005 | -1170715026) & -1157632401;

                  while (true) {
                    switch ((var12 - 583086915 - 1548506214 + 477862184 ^ 641240941) + 1781766150 - 1110556553) {
                      case -1717524224:
                      default:
                        if (/* jnt */) {
                          class_2561 var27 = (Text)/* jnt */;
                          String var31 = /* jnt */;
                          int var59 = -2036731250 >>> 1398928613 ^ 70569876;

                          StringBuilder var68;
                          for (var68 = (StringBuilder)/* jnt */;
                            var59 < ((-1638692933 | 667715472) ^ -1075869784);
                            var59 += (1227520239 - (1651383211 & -622531716) | 0) & -1458499583
                          ) {
                            char var85 = /* jnt */;
                            char var88 = (char)(
                              (((((var85 & 'ﰀ') >> 10 | var85 << 6) + 0 & 63488) >> 11 | ((var85 & 'ﰀ') >> 10 | var85 << 6) + 0 << 5) + 81 & 61440) >> 12
                                | ((((var85 & 'ﰀ') >> 10 | var85 << 6) + 0 & 63488) >> 11 | ((var85 & 'ﰀ') >> 10 | var85 << 6) + 0 << 5) + 81 << 4
                            );
                            /* jnt */(
                                (((((var85 & 'ﰀ') >> 10 | var85 << 6) + 0 & 63488) >> 11 | ((var85 & 'ﰀ') >> 10 | var85 << 6) + 0 << 5) + 81 & 61440) >> 12
                                  | ((((var85 & 'ﰀ') >> 10 | var85 << 6) + 0 & 63488) >> 11 | ((var85 & 'ﰀ') >> 10 | var85 << 6) + 0 << 5) + 81 << 4
                              )
                            );
                          }

                          if (/* jnt */
                          )) {
                            String var9 = /* jnt */
                            );
                            String var54 = var9;
                            var59 = -1298694039 >> 625244896 ^ -1298694039;
                            var68 = (StringBuilder)/* jnt */;

                            label358:
                            while (true) {
                              var12 = -758579421 * 1274035442 ^ 1756168536;

                              while (true) {
                                label438: {
                                  StringBuilder var62;
                                  switch (((var12 ^ 2034731812) - 364317339 ^ 1064368871) + 943389213 + 246714406 ^ 146751402) {
                                    case -1812627976:
                                    default:
                                      var62 = var68;
                                      if (var59 < (-1377914661 & -1377914661 ^ -1377914658)) {
                                        int var97 = (/* jnt */ ^ 'X')
                                          + 153
                                          + 113;
                                        char var98 = (char)(((var97 & 65534) >> 1 | var97 << 15) - 92);
                                        /* jnt */(((var97 & 65534) >> 1 | var97 << 15) - 92)
                                        );
                                        var59 += (1043083700 ^ 435103237 | 0) & 1477713987;
                                        break label438;
                                      }

                                      var12 = (-564471446 + -669680329 | -1400861590) & -325997062;
                                      break;
                                    case 908104129:
                                      var62 = var68;
                                      if (var59 < ((-505905167 >> -505905167 | 1) & 2069)) {
                                        int var91 = /* jnt */ ^ 7;
                                        char var94 = (char)(
                                          ((((((var91 & 65528) >> 3 | var91 << 13) & 65024) >> 9 | ((var91 & 65528) >> 3 | var91 << 13) << 7) ^ 92) & 32768)
                                              >> 15
                                            | (((((var91 & 65528) >> 3 | var91 << 13) & 65024) >> 9 | ((var91 & 65528) >> 3 | var91 << 13) << 7) ^ 92) << 1
                                        );
                                        /* jnt */(
                                            ((((((var91 & 65528) >> 3 | var91 << 13) & 65024) >> 9 | ((var91 & 65528) >> 3 | var91 << 13) << 7) ^ 92) & 32768)
                                                >> 15
                                              | (((((var91 & 65528) >> 3 | var91 << 13) & 65024) >> 9 | ((var91 & 65528) >> 3 | var91 << 13) << 7) ^ 92) << 1
                                          )
                                        );
                                        var59 += 1659672854 >>> 1659672854 ^ 394;
                                        continue label358;
                                      }

                                      var12 = 1943267440 >> 1461748661 ^ 2041710116;
                                  }

                                  switch ((var12 + 1888235476 ^ 1473537905 ^ 1786291467) - 1194454733 - 1032074655 ^ 780334913) {
                                    case -1250382567:
                                      if (/* jnt */
                                      )) {
                                        break label360;
                                      }
                                      continue label360;
                                    case 2086544585:
                                  }

                                  if (/* jnt */
                                  )) {
                                    break label360;
                                  }

                                  var54 = var31;
                                  var59 = (-1765649391 * 215806979 | 0) & -529495676;
                                  var68 = (StringBuilder)/* jnt */;
                                }

                                var12 = (747089525 * -536311815 * 747089525 | -383613434) & -106510609;
                              }
                            }
                          }
                          continue label360;
                        }

                        var12 = 1409995792 + (1409995792 - 1409995792) ^ 1248538246;
                        break;
                      case -974496779:
                        int var23 = 0;

                        label318:
                        while (true) {
                          var12 = -666335129 >> -551048610 ^ 712948082;

                          while (true) {
                            switch (((var12 + 1130684748 ^ 975642951 ^ 1071048917) + 1001031399 ^ 424198635) + 1149711067) {
                              case -2045646924:
                              default:
                                if (var23 < 44) {
                                  if (!/* jnt */
                                    ),
                                    /* jnt */
                                    )
                                  )) {
                                    var12 = (2080198100 - 2077096569 | -1397486832) & -783373;
                                  } else {
                                    var12 = -1010501623 + -1506016500 ^ 1912275597;
                                  }
                                } else {
                                  var12 = -1901148963 >>> -1788012591 ^ -1470064612;
                                }
                                break;
                              case -738554223:
                                /* jnt */
                                  ),
                                  null /* jnt:encrypted */
                                      )
                                    )
                                  ),
                                  var23,
                                  1,
                                  null /* jnt:encrypted */,
                                  null /* jnt:encrypted */
                                  )
                                );
                                null /* jnt:encrypted */;
                                return;
                              case 1835179258:
                                var23++;
                                continue label318;
                              case 1964867810:
                                null /* jnt:encrypted */;
                                /* jnt */
                                  )
                                );
                                return;
                            }
                          }
                        }
                    }
                  }
                }

                /* jnt */
                  ),
                  null /* jnt:encrypted */
                      )
                    )
                  ),
                  47,
                  1,
                  null /* jnt:encrypted */,
                  null /* jnt:encrypted */
                  )
                );
                null /* jnt:encrypted */;
                return;
              }

              var12 = (1835456577 ^ 781228570 >>> -1593914590 | 1027148048) & -38023280;
              continue;
            case 357628608:
              if (/* jnt */
                )
                > 0) {
                class_1792 var15 = /* jnt */
                );
                int var4 = null /* jnt:encrypted */
                    )
                  )
                );
                ArrayList var5 = (ArrayList)/* jnt */;
                class_1799 var6 = null /* jnt:encrypted */;
                int var7 = 36;

                label245:
                while (true) {
                  var12 = -32853925 >>> -32853925 ^ -117105178;

                  while (true) {
                    switch (((var12 - 470213476 ^ 784194343) + 882242848 ^ 2075304477) - 527093526 - 771360519) {
                      case -96136788:
                        Iterator var26 = /* jnt */;

                        while (/* jnt */) {
                          int var30 = /* jnt *//* jnt */
                          );
                          /* jnt */
                            ),
                            var4,
                            var30,
                            1,
                            null /* jnt:encrypted */,
                            null /* jnt:encrypted */
                            )
                          );
                          null /* jnt:encrypted */
                          );
                          if (/* jnt */) != 0) {
                            return;
                          }
                        }
                        break;
                      case 268869298:
                      default:
                        if (var7 <= 71) {
                          class_1799 var29 = (ItemStack)/* jnt */
                                )
                              )
                            ),
                            var7
                          );
                          if (!/* jnt */) {
                            if (/* jnt */
                              != var15) {
                              var12 = -1870983911 << 1373815368 ^ -889528984;
                            } else {
                              var12 = 2007816980 - -1493088701 ^ 502320827;
                            }
                          } else {
                            var12 = -1870983911 << 1373815368 ^ -889528984;
                          }

                          while (true) {
                            switch ((var12 + 1964764697 - 1510994154 - 1652176833 + 1223547004 ^ 739895859) + 868478712) {
                              case -751667367:
                              default:
                                var7++;
                                continue label245;
                              case 377946463:
                                if (/* jnt */) {
                                  var6 = var29;
                                  /* jnt */
                                  );
                                  var12 = -1870983911 << 1373815368 ^ -889528984;
                                } else {
                                  var12 = (1769538528 >> (-812678139 >>> 1769538528 - -812678139) | -898904574) & -1053086;
                                }
                                continue;
                              case 464942391:
                            }

                            if (/* jnt */) {
                              /* jnt */
                              );
                            }

                            var12 = -1870983911 << 1373815368 ^ -889528984;
                          }
                        }

                        var12 = -1227790690 - -1919820403 ^ -345460946;
                        continue;
                      case 1775249274:
                        null /* jnt:encrypted */;
                        return;
                      case 2026657508:
                        if (/* jnt */) {
                          var12 = (1546948083 ^ -813354580 | -716959568) & -715876431;
                          continue;
                        }

                        if (!/* jnt */)
                          || /* jnt */ <= 1) {
                          var12 = -504992060 >> 1400760168 ^ -1159821159;
                          continue;
                        }

                        var7 = /* jnt *//* jnt */
                        );
                        /* jnt */
                          ),
                          var4,
                          var7,
                          0,
                          null /* jnt:encrypted */,
                          null /* jnt:encrypted */
                          )
                        );
                        int var8 = 1;

                        label210:
                        while (true) {
                          var12 = 734207549 >>> 1416723285 ^ 2137825962;

                          while (true) {
                            switch ((var12 + 79851681 ^ 342901278) + 667298931 + 202814651 + 90993758 + 877115610) {
                              case -478146559:
                                /* jnt */
                                  ),
                                  var4,
                                  var7,
                                  0,
                                  null /* jnt:encrypted */,
                                  null /* jnt:encrypted */
                                  )
                                );
                                /* jnt */
                                  ),
                                  var4,
                                  var7,
                                  0,
                                  null /* jnt:encrypted */,
                                  null /* jnt:encrypted */
                                  )
                                );
                                break label210;
                              case -34577167:
                            }

                            if (var8 < /* jnt */) {
                              /* jnt */
                                ),
                                var4,
                                /* jnt *//* jnt */
                                ),
                                0,
                                null /* jnt:encrypted */,
                                null /* jnt:encrypted */
                                )
                              );
                              var8++;
                              break;
                            }

                            var12 = -452055187 >>> 1972105515 ^ 1556116257;
                          }
                        }
                    }

                    null /* jnt:encrypted */;
                    return;
                  }
                }
              }

              var12 = (1913781397 | 1913781397 & -1145270134 | 183265827) & 1324317563;
              continue;
            case 461837721:
              if (/* jnt */ == 3) {
                /* jnt */
                  ),
                  null /* jnt:encrypted */
                      )
                    )
                  ),
                  15,
                  1,
                  null /* jnt:encrypted */,
                  null /* jnt:encrypted */
                  )
                );
                null /* jnt:encrypted */;
                null /* jnt:encrypted */;
                return;
              }
              break;
            case 1135021284:
              null /* jnt:encrypted */;
              return;
          }

          var12 = -981668556 ^ 1029845634 ^ 147877458;
        }
      }
    }
  }

  public String op() {
    class_1792 var1 = /* jnt */
    );
    if (!/* jnt */
    )) {
      return /* jnt */
      );
    } else {
      int var10000 = -1932110323 >>> 168873649 ^ 18027;

      StringBuilder var10001;
      for (var10001 = (StringBuilder)/* jnt */;
        var10000 < ((-976482704 + 515575277 | 5) & 151544231);
        var10000 += 577396937 ^ -1193528717 ^ -1699327301
      ) {
        int var4 = /* jnt */ - '/';
        int var10004 = (var4 & 49152) >> 14;
        int var5 = ((var4 & 49152) >> 14 | var4 << 2) - 92 ^ 55;
        int var9 = ((((var4 & 49152) >> 14 | var4 << 2) - 92 ^ 55) & 32768) >> 15;
        char var6 = (char)((((var10004 | var4 << 2) - 92 ^ 55) & 32768) >> 15 | (((var4 & 49152) >> 14 | var4 << 2) - 92 ^ 55) << 1);
        /* jnt */(var9 | var5 << 1));
      }

      return /* jnt */;
    }
  }

  static {
    Loader.init(cok.class);
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (var10 - 1222071017 + 2146768594 ^ 2007707738 ^ 915130687 ^ 1341149394 ^ 1127938727) - 1547042760 + 722567723 - 244333820;
    MethodHandle var10000 = ost[(var10 - 1222071017 + 2146768594 ^ 2007707738 ^ 915130687 ^ 1341149394 ^ 1127938727)
      - 1547042760
      + 722567723
      - 244333820
      - 1828923270];
    if (ost[var10001 - 1828923270] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (669006568 ^ -1167516 - -236967032 | 0) & 1107297346;
        var23 < var13.length();
        var23 += 997012612 - (-1380691476 | -1380691476) ^ -1917263207
      ) {
        char var42 = var13.charAt(var23);
        char var45 = (char)(
          (
                (
                    ((((var42 & '\uffff') >> 0 | var42 << 16) + 121 - 7 ^ 190) - 219 - 49 + 234 + 36 & 65024) >> 9
                      | (((var42 & '\uffff') >> 0 | var42 << 16) + 121 - 7 ^ 190) - 219 - 49 + 234 + 36 << 7
                  )
                  & 57344
              )
              >> 13
            | (
                ((((var42 & '\uffff') >> 0 | var42 << 16) + 121 - 7 ^ 190) - 219 - 49 + 234 + 36 & 65024) >> 9
                  | (((var42 & '\uffff') >> 0 | var42 << 16) + 121 - 7 ^ 190) - 219 - 49 + 234 + 36 << 7
              )
              << 3
        );
        var13.setCharAt(
          var23,
          (char)(
            (
                  (
                      ((((var42 & '\uffff') >> 0 | var42 << 16) + 121 - 7 ^ 190) - 219 - 49 + 234 + 36 & 65024) >> 9
                        | (((var42 & '\uffff') >> 0 | var42 << 16) + 121 - 7 ^ 190) - 219 - 49 + 234 + 36 << 7
                    )
                    & 57344
                )
                >> 13
              | (
                  ((((var42 & '\uffff') >> 0 | var42 << 16) + 121 - 7 ^ 190) - 219 - 49 + 234 + 36 & 65024) >> 9
                    | (((var42 & '\uffff') >> 0 | var42 << 16) + 121 - 7 ^ 190) - 219 - 49 + 234 + 36 << 7
                )
                << 3
          )
        );
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (-1018457412 | -1018457412) ^ -1018457412; var29 < var16.length(); var29 += (362487713 + 1259258116 | 0) & 290457859) {
        int var50 = var16.charAt(var29) ^ '=';
        int var83 = (var50 & 49152) >> 14;
        int var51 = (var50 & 49152) >> 14 | var50 << 2;
        int var84 = (((var50 & 49152) >> 14 | var50 << 2) & 65408) >> 7;
        var50 = ((((var83 | var50 << 2) & 65408) >> 7 | ((var50 & 49152) >> 14 | var50 << 2) << 9) ^ 71) - 118 - 11 + 178 - 47;
        var83 = (((var84 | var51 << 9) ^ 71) - 118 - 11 + 178 - 47 & 65528) >> 3;
        int var53 = (((var84 | var51 << 9) ^ 71) - 118 - 11 + 178 - 47 & 65528) >> 3 | var50 << 13;
        int var86 = (((((var84 | var51 << 9) ^ 71) - 118 - 11 + 178 - 47 & 65528) >> 3 | var50 << 13) & 32768) >> 15;
        char var54 = (char)(((var83 | var50 << 13) & 32768) >> 15 | ((((var84 | var51 << 9) ^ 71) - 118 - 11 + 178 - 47 & 65528) >> 3 | var50 << 13) << 1);
        var16.setCharAt(var29, (char)(var86 | var53 << 1));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), cok.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (1429416330 >> -1964082579 + 429144033 | 0) & 1269181184; var35 < var19.length(); var35 += -1664636439 - -1664636439 ^ 1) {
        int var59 = (var19.charAt(var35) ^ '2') + 141;
        char var62 = (char)(
          (
                (((((var59 & 64512) >> 10 | var59 << 6) - 86 + 169 & 65024) >> 9 | ((var59 & 64512) >> 10 | var59 << 6) - 86 + 169 << 7) & 61440) >> 12
                  | ((((var59 & 64512) >> 10 | var59 << 6) - 86 + 169 & 65024) >> 9 | ((var59 & 64512) >> 10 | var59 << 6) - 86 + 169 << 7) << 4
              )
              + 68
            ^ 9
            ^ 132
        );
        var19.setCharAt(
          var35,
          (char)(
            (
                  (((((var59 & 64512) >> 10 | var59 << 6) - 86 + 169 & 65024) >> 9 | ((var59 & 64512) >> 10 | var59 << 6) - 86 + 169 << 7) & 61440) >> 12
                    | ((((var59 & 64512) >> 10 | var59 << 6) - 86 + 169 & 65024) >> 9 | ((var59 & 64512) >> 10 | var59 << 6) - 86 + 169 << 7) << 4
                )
                + 68
              ^ 9
              ^ 132
          )
        );
      }

      Class var7 = Class.forName(var19.toString(), false, cok.class.getClassLoader());
      switch (((var4 ^ 880922417 ^ 1424865391 ^ 448625386 ^ 1108137356 ^ 854367338 ^ 534556420) + 282087717 ^ 2067968439) + 1020171396 ^ 1448943989) {
        case 1653236375:
        case 2041696497:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1727058464:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 1774659621:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 1949392500:
          var10000 = var0.findSpecial(var7, var5, var6, cok.class);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    ost[(var10 - 1222071017 + 2146768594 ^ 2007707738 ^ 915130687 ^ 1341149394 ^ 1127938727) - 1547042760 + 722567723 - 244333820 - 1828923270] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 ^ 391333358) - 519506550 ^ 38375150) - 322473902 - 1910087062 + 1231920623 + 100910398 + 1369624907 - 453878994;
    MethodHandle var10000 = ost[((var10 ^ 391333358) - 519506550 ^ 38375150)
      - 322473902
      - 1910087062
      + 1231920623
      + 100910398
      + 1369624907
      - 453878994
      + 1464944277];
    if (ost[var10001 + 1464944277] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = 1303763808 >>> (772588461 >>> 1303763808 * 772588461) ^ 159150; var24 < var14.length(); var24 += -10805077 >>> -825327824 ^ 65370) {
        int var43 = var14.charAt(var24) ^ 195;
        char var46 = (char)(
          (
              (((((((var43 & 65520) >> 4 | var43 << 12) & 49152) >> 14 | ((var43 & 65520) >> 4 | var43 << 12) << 2) ^ 74) - 102 ^ 188) + 74 & 65504) >> 5
                | ((((((var43 & 65520) >> 4 | var43 << 12) & 49152) >> 14 | ((var43 & 65520) >> 4 | var43 << 12) << 2) ^ 74) - 102 ^ 188) + 74 << 11
            )
            ^ 184
            ^ 34
        );
        var14.setCharAt(
          var24,
          (char)(
            (
                (((((((var43 & 65520) >> 4 | var43 << 12) & 49152) >> 14 | ((var43 & 65520) >> 4 | var43 << 12) << 2) ^ 74) - 102 ^ 188) + 74 & 65504) >> 5
                  | ((((((var43 & 65520) >> 4 | var43 << 12) & 49152) >> 14 | ((var43 & 65520) >> 4 | var43 << 12) << 2) ^ 74) - 102 ^ 188) + 74 << 11
              )
              ^ 184
              ^ 34
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = -1548203370 * -1263002997 ^ -1334592654; var30 < var17.length(); var30 += 447005810 >>> 447005810 ^ 1704) {
        int var51 = var17.charAt(var30) - 187;
        int var88 = (var51 & 65534) >> 1;
        int var52 = (var51 & 65534) >> 1 | var51 << 15;
        int var89 = (((var51 & 65534) >> 1 | var51 << 15) & 65024) >> 9;
        var51 = ((((var88 | var51 << 15) & 65024) >> 9 | ((var51 & 65534) >> 1 | var51 << 15) << 7) ^ 102) - 88 + 181;
        var88 = (((var89 | var52 << 7) ^ 102) - 88 + 181 & 64512) >> 10;
        int var54 = (((var89 | var52 << 7) ^ 102) - 88 + 181 & 64512) >> 10 | var51 << 6;
        int var91 = (((((var89 | var52 << 7) ^ 102) - 88 + 181 & 64512) >> 10 | var51 << 6) & 0) >> 16;
        char var55 = (char)((((var88 | var51 << 6) & 0) >> 16 | ((((var89 | var52 << 7) ^ 102) - 88 + 181 & 64512) >> 10 | var51 << 6) << 0) + 142 ^ 108);
        var17.setCharAt(var30, (char)((var91 | var54 << 0) + 142 ^ 108));
      }

      Class var6 = Class.forName(var17.toString(), false, cok.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (910869076 << 910869076 * (910869076 | 910869076) | 0) & 220851950;
        var36 < var20.length();
        var36 += (-418107243 >>> -945130546 | 1) & 1637351849
      ) {
        char var60 = var20.charAt(var36);
        char var65 = (char)(
          (
                (
                    (
                          (
                                (
                                    (
                                        (
                                              (
                                                  ((((var60 & '\ufffe') >> 1 | var60 << 15) & 49152) >> 14 | ((var60 & '\ufffe') >> 1 | var60 << 15) << 2)
                                                      + 230
                                                    ^ 83
                                                )
                                                & 65532
                                            )
                                            >> 2
                                          | (
                                              ((((var60 & '\ufffe') >> 1 | var60 << 15) & 49152) >> 14 | ((var60 & '\ufffe') >> 1 | var60 << 15) << 2) + 230
                                                ^ 83
                                            )
                                            << 14
                                      )
                                      ^ 12
                                  )
                                  & 65535
                              )
                              >> 0
                            | (
                                (
                                    (
                                          (((((var60 & '\ufffe') >> 1 | var60 << 15) & 49152) >> 14 | ((var60 & '\ufffe') >> 1 | var60 << 15) << 2) + 230 ^ 83)
                                            & 65532
                                        )
                                        >> 2
                                      | (((((var60 & '\ufffe') >> 1 | var60 << 15) & 49152) >> 14 | ((var60 & '\ufffe') >> 1 | var60 << 15) << 2) + 230 ^ 83)
                                        << 14
                                  )
                                  ^ 12
                              )
                              << 16
                        )
                        - 89
                      ^ 98
                  )
                  & 65408
              )
              >> 7
            | (
                (
                      (
                            (
                                (
                                    (
                                          (((((var60 & '\ufffe') >> 1 | var60 << 15) & 49152) >> 14 | ((var60 & '\ufffe') >> 1 | var60 << 15) << 2) + 230 ^ 83)
                                            & 65532
                                        )
                                        >> 2
                                      | (((((var60 & '\ufffe') >> 1 | var60 << 15) & 49152) >> 14 | ((var60 & '\ufffe') >> 1 | var60 << 15) << 2) + 230 ^ 83)
                                        << 14
                                  )
                                  ^ 12
                              )
                              & 65535
                          )
                          >> 0
                        | (
                            (
                                ((((((var60 & '\ufffe') >> 1 | var60 << 15) & 49152) >> 14 | ((var60 & '\ufffe') >> 1 | var60 << 15) << 2) + 230 ^ 83) & 65532)
                                    >> 2
                                  | (((((var60 & '\ufffe') >> 1 | var60 << 15) & 49152) >> 14 | ((var60 & '\ufffe') >> 1 | var60 << 15) << 2) + 230 ^ 83) << 14
                              )
                              ^ 12
                          )
                          << 16
                    )
                    - 89
                  ^ 98
              )
              << 9
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
                                                    ((((var60 & '\ufffe') >> 1 | var60 << 15) & 49152) >> 14 | ((var60 & '\ufffe') >> 1 | var60 << 15) << 2)
                                                        + 230
                                                      ^ 83
                                                  )
                                                  & 65532
                                              )
                                              >> 2
                                            | (
                                                ((((var60 & '\ufffe') >> 1 | var60 << 15) & 49152) >> 14 | ((var60 & '\ufffe') >> 1 | var60 << 15) << 2) + 230
                                                  ^ 83
                                              )
                                              << 14
                                        )
                                        ^ 12
                                    )
                                    & 65535
                                )
                                >> 0
                              | (
                                  (
                                      (
                                            (
                                                ((((var60 & '\ufffe') >> 1 | var60 << 15) & 49152) >> 14 | ((var60 & '\ufffe') >> 1 | var60 << 15) << 2) + 230
                                                  ^ 83
                                              )
                                              & 65532
                                          )
                                          >> 2
                                        | (((((var60 & '\ufffe') >> 1 | var60 << 15) & 49152) >> 14 | ((var60 & '\ufffe') >> 1 | var60 << 15) << 2) + 230 ^ 83)
                                          << 14
                                    )
                                    ^ 12
                                )
                                << 16
                          )
                          - 89
                        ^ 98
                    )
                    & 65408
                )
                >> 7
              | (
                  (
                        (
                              (
                                  (
                                      (
                                            (
                                                ((((var60 & '\ufffe') >> 1 | var60 << 15) & 49152) >> 14 | ((var60 & '\ufffe') >> 1 | var60 << 15) << 2) + 230
                                                  ^ 83
                                              )
                                              & 65532
                                          )
                                          >> 2
                                        | (((((var60 & '\ufffe') >> 1 | var60 << 15) & 49152) >> 14 | ((var60 & '\ufffe') >> 1 | var60 << 15) << 2) + 230 ^ 83)
                                          << 14
                                    )
                                    ^ 12
                                )
                                & 65535
                            )
                            >> 0
                          | (
                              (
                                  (
                                        (((((var60 & '\ufffe') >> 1 | var60 << 15) & 49152) >> 14 | ((var60 & '\ufffe') >> 1 | var60 << 15) << 2) + 230 ^ 83)
                                          & 65532
                                      )
                                      >> 2
                                    | (((((var60 & '\ufffe') >> 1 | var60 << 15) & 49152) >> 14 | ((var60 & '\ufffe') >> 1 | var60 << 15) << 2) + 230 ^ 83)
                                      << 14
                                )
                                ^ 12
                            )
                            << 16
                      )
                      - 89
                    ^ 98
                )
                << 9
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), cok.class.getClassLoader()).returnType();
      switch ((var4 + 1957012052 + 210754648 - 33860058 + 840424602 - 279145861 ^ 815828138) + 1733635452 + 536856792 ^ 516954231 ^ 904221324) {
        case 438827168:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1224346070:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1698283261:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1853509708:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      ost[((var10 ^ 391333358) - 519506550 ^ 38375150) - 322473902 - 1910087062 + 1231920623 + 100910398 + 1369624907 - 453878994 + 1464944277] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }

  public static native void guard();
}
