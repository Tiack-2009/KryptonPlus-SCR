// KryptonPlus Module: Surround
// Original class: cm
// Status: PARTIAL - JNT native encryption (strings in jnt.so)


import dev.krypton.jnt3.Loader;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import net.minecraft.PlayerEntity;
import net.minecraft.BlockState;
import net.minecraft.BlockPos;
import net.minecraft.Text;
import net.minecraft.ClientWorld;
import net.minecraft.VeinPatchFeatureConfig;
import net.minecraft.WorldChunk;
import net.minecraft.MinecraftClient;

public class Surround extends np {
  public double[] hj;
  public class_6574 wt;
  public ExecutorService kk;
  public HashSet lt;
  public int bu;
  public int up;
  public volatile boolean do;
  public volatile boolean ynj;
  // [JNT] MethodHandle dispatch table (removed)
  public cm() {
    int var10001 = (1787186166 | 1167214302 & 1787186166) ^ 1787186166;

    StringBuilder var10002;
    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < (-1173802818 ^ 926405688 ^ -1925258102);
      var10001 += 365564150 ^ (159820924 | 365564150 << 159820924) ^ 2085403787
    ) {
      int var6 = (/* jnt */ ^ 24) - 223 ^ 75;
      int var10005 = (var6 & 63488) >> 11;
      int var7 = (var6 & 63488) >> 11 | var6 << 5;
      int var18 = (((var6 & 63488) >> 11 | var6 << 5) & 65535) >> 0;
      char var8 = (char)(((var10005 | var6 << 5) & 65535) >> 0 | ((var6 & 63488) >> 11 | var6 << 5) << 16);
      /* jnt */(var18 | var7 << 16));
    }

    String var2 = /* jnt */;
    int var4 = 1090411501 ^ -828420486 ^ -1906240105;

    StringBuilder var10;
    for (var10 = (StringBuilder)/* jnt */;
      var4 < ((935467094 >>> 935467094 | 32) & -572948936);
      var4 += 1753462083 & -1982572956 ^ 142611521
    ) {
      int var14 = (/* jnt */ - '\r' ^ 22) + 113;
      int var10006 = (var14 & 65472) >> 6;
      int var15 = (var14 & 65472) >> 6 | var14 << 10;
      int var21 = (((var14 & 65472) >> 6 | var14 << 10) & 0) >> 16;
      char var16 = (char)(((var10006 | var14 << 10) & 0) >> 16 | ((var14 & 65472) >> 6 | var14 << 10) << 0);
      /* jnt */(var21 | var15 << 0));
    }

    super(
      var2,
      /* jnt */,
      -1,
      null /* jnt:encrypted */
    );
    this.hj = new double[]{1.0, 0.875, 0.75, 0.625, 0.5, 0.375, 0.25, 0.125};
  }

  @Override
    // [JNT_NATIVE] void dz() - implementation encrypted in native .so library
  public native void dz();

  @Override
  public void x() {
    if (null /* jnt:encrypted */
        != null
      && !/* jnt */
      )) {
      /* jnt */
      );
    }

    /* jnt */;
  }

  public boolean kt() {
    int var12 = -2120325217;
    if (null /* jnt:encrypted */
        )
        != null
      && null /* jnt:encrypted */
        )
        != null) {
      var12 = (1652377840 + 1640444666 | 729809966) & -1349515985;
    } else {
      var12 = (1830194937 | 1781926718 | 4210753) & 99438789;
    }

    switch (((var12 + 1048192654 ^ 1243410953) - 1731904709 - 629682090 ^ 1027564836) + 602617881) {
      case 1242019963:
        kcp var1 = (kcp)/* jnt */;
        Iterator var2 = /* jnt */
        );

        label102:
        while (true) {
          var12 = 2038408794 + -457227833 ^ 1485029555;

          while (true) {
            switch ((var12 ^ 1520783257 ^ 1590709114) + 1933752211 - 1101002643 - 2001395291 + 293822327) {
              case -1927238579:
              default:
                return false;
              case -828150387:
            }

            if (/* jnt */) {
              class_2818 var3 = (ClientWorld)/* jnt */;
              class_1923 var4 = /* jnt */;
              int var5 = /* jnt */;
              int var6 = /* jnt */;
              boolean var7 = true;
              int var8 = var5;

              label100:
              while (true) {
                var12 = (-941201695 * -941201695 | 1028400550) & -1109430786;

                while (true) {
                  switch (((var12 ^ 953496237 ^ 1254027755) + 1281365149 ^ 1158754011) - 1371025399 - 1914736133) {
                    case -1791092758:
                    default:
                      if (var8 < var5 + 16) {
                        int var9 = var6;

                        label89:
                        while (true) {
                          var12 = -397708849 + -2047922981 ^ 846721824;

                          while (true) {
                            switch ((var12 ^ 1972803204) + 1573500971 - 1917706188 - 1757547463 ^ 116106620 ^ 1412270830) {
                              case -28055500:
                              default:
                                if (var9 < var6 + 16) {
                                  int var10 = 0;

                                  label86:
                                  while (true) {
                                    var12 = -1849682046 & -1825864150 ^ -1687830095;

                                    while (true) {
                                      switch ((var12 + 347245435 ^ 140487316 ^ 898710304) + 375891417 + 1447073561 - 16793283) {
                                        case -1904295735:
                                          if (var10 < 10) {
                                            class_2248 var11 = /* jnt */
                                            );
                                            if (var11
                                              != null /* jnt:encrypted */
                                              )
                                             {
                                              var7 = false;
                                              break label89;
                                            }

                                            var10++;
                                            continue label86;
                                          }

                                          var12 = (-1485498389 + 615353699 | 511776304) & 2140528569;
                                          break;
                                        case -1163742922:
                                        default:
                                          var9 += 4;
                                          continue label89;
                                      }
                                    }
                                  }
                                }

                                var12 = (1531991887 * 1531991887 | -1294850616) & -1074387480;
                                break;
                              case 64794518:
                                var8 += 4;
                                continue label100;
                            }
                          }
                        }
                      }

                      var12 = (526489033 >> 1683907551 | 310787170) & -1681949065;
                      break;
                    case 612794142:
                      if (var7) {
                        return true;
                      }

                      var12 = (1564128523 - -1403841206 | 1853948094) & 1859373758;
                      break;
                    case 1749070418:
                      continue label102;
                  }
                }
              }
            }

            var12 = 1882625614 + (1882625614 & 1882625614) ^ 626869070;
          }
        }
      case 1705770472:
      default:
        return false;
    }
  }

  @yet
  public void cu(cz var1) {
    null /* jnt:encrypted */;
    /* jnt */
    );
  }

  @yet
  public void ko(zb var1) {
    class_2818 var2 = /* jnt */
      ),
      /* jnt */
      ),
      /* jnt */
      )
    );
    /* jnt */;
  }

  @yet
  public void vf(lf var1) {
    int var13 = 1999106082;
    Iterator var2 = /* jnt */
    );

    while (true) {
      var13 = (-601998208 - (-601998208 ^ -601998208) | 1109733986) & -337265030;

      while (true) {
        switch ((var13 ^ 12981556 ^ 2079740715) + 540055303 - 1721704104 ^ 1895107244 ^ 1183904456) {
          case -114575343:
          default:
            return;
          case 1556285624:
        }

        if (/* jnt */) {
          class_1923 var3 = (PlayerEntity)/* jnt */;
          if (!/* jnt */
            ),
            null /* jnt:encrypted */,
            null /* jnt:encrypted */
          )) {
            /* jnt */;
          } else {
            double var4 = (double)/* jnt */;
            double var6 = (double)/* jnt */;
            double var8 = var4 + 16.0;
            double var10 = var6 + 16.0;
            zn var12 = (zn)/* jnt */;
            /* jnt */,
              var4,
              63.0,
              var6,
              var8,
              63.1F,
              var10,
              var12,
              var12,
              null /* jnt:encrypted */,
              0
            );
          }
          break;
        }

        var13 = (66256725 * -514060249 | 1846315529) & -289616371;
      }
    }
  }

  public void ty() {
    if (null /* jnt:encrypted */ && !null /* jnt:encrypted */) {
      null /* jnt:encrypted */;
      /* jnt */,
        (Runnable)() -> {
          int var2 = -234146702;

          Throwable var10000;
          label88: {
            try {
              var2 = (-1978999878 - -1978999878 | -1827916013) & -611436613;
            } catch (Throwable var14) {
              var10000 = var14;
              boolean var10001 = false;
              break label88;
            }

            label85:
            while (true) {
              switch ((var2 + 2087198091 ^ 681667535 ^ 1575724076 ^ 503403304) - 365865995 + 1183874800) {
                case -1795056838:
                  try {
                    /* jnt */;
                  } catch (Throwable var13) {
                    var10000 = var13;
                    boolean var17 = false;
                    break label85;
                  }

                  var2 = -179523468 ^ -1053948162 ^ 1893943278;
                  break;
                case -1125774299:
                default:
                  return;
                case -597465847:
                  try {
                    null /* jnt:encrypted */;
                    null /* jnt:encrypted */;
                    /* jnt */;
                  } catch (Throwable var12) {
                    var10000 = var12;
                    boolean var16 = false;
                    break label85;
                  }

                  var2 = 256389228 * 1793244070 ^ 1887552008;
              }
            }
          }

          Throwable var1 = var10000;
          null /* jnt:encrypted */;
          null /* jnt:encrypted */;
          /* jnt */;
          throw var1;
        }
      );
    }
  }

  public void xw() {
    int var3 = 197473642;
    Iterator var1 = /* jnt */
    );

    while (true) {
      var3 = (1961313242 ^ 1721531197 | 1300554896) & 1338369940;

      while (true) {
        switch ((var3 - 521413084 ^ 1198828340 ^ 513257981) + 1862161556 + 1587816349 ^ 187544700) {
          case -219269431:
            return;
          case 1037623518:
        }

        if (/* jnt */) {
          class_2818 var2 = (ClientWorld)/* jnt */;
          /* jnt */;
          break;
        }

        var3 = -378554344 >>> 1656838395 ^ -1797898700;
      }
    }
  }

  public void wm(class_2818 var1) {
    int var2 = 1945587081;
    if (!null /* jnt:encrypted */) {
      var2 = (471829003 >> 393761863 * -180653916 | -112784589) & -70782989;

      while (true) {
        switch ((var2 + 160582866 ^ 200518967 ^ 677890558) + 1031615656 - 1361348111 + 1495672236) {
          case 221372484:
            /* jnt */,
              (Runnable)() -> {
                int var14 = 1233321450;
                class_1923 var2x = /* jnt */;
                int var3x = /* jnt */;
                int var4 = /* jnt */;
                kcp var5 = (kcp)/* jnt */;
                int var6 = 0;
                int var7 = var3x;

                label190:
                while (true) {
                  var14 = (-1757335532 ^ -1757335532 | -38392312) & -639429;

                  while (true) {
                    label225: {
                      int var8;
                      switch ((var14 ^ 966071377) + 72263519 ^ 559723466 ^ 942607904 ^ 983008234 ^ 1247243973) {
                        case -1581076099:
                          if (var7 >= var3x + 16) {
                            var14 = (-1838890584 | 1224191353 << 822196018) ^ -798585703;
                            continue;
                          }

                          var8 = var4;
                          var14 = -1604697572 >>> -1781677073 ^ 1547495961;
                          break;
                        case -694163600:
                        default:
                          var7 = var3x;
                          break label225;
                        case 198529146:
                          if (var6 > 1000) {
                            return;
                          }

                          var14 = (1323918958 >>> 1323918958 | -2092301305) & -1345338353;
                          continue;
                        case 228463499:
                          return;
                        case 801193038:
                          if (var7 >= var3x + 16) {
                            var14 = (-955845878 & -619935755 | 1682640574) & 2120978430;
                            continue;
                          }

                          var8 = var4;
                          var14 = (1959020371 ^ 1959020371 | 619884264) & -1342504978;
                      }

                      label177:
                      while (true) {
                        int var9;
                        switch ((var14 + 440333244 + 1941805790 ^ 280629186) + 961063494 + 1644792228 - 1029663512) {
                          case -548657375:
                            var7++;
                            continue label190;
                          case -144361454:
                            var7++;
                            break label177;
                          case 4717330:
                            if (var8 >= var4 + 16) {
                              var14 = (-2057833705 + -2057833705 | -213282360) & -70526471;
                              continue;
                            }

                            var9 = 1;
                            var14 = (-1970869997 + -238715623 | 1300302034) & -845158189;
                            break;
                          case 1483931479:
                          default:
                            if (var8 >= var4 + 16) {
                              var14 = 1318296490 >> 1147693072 ^ 65440864;
                              continue;
                            }

                            var9 = 1;
                            var14 = -912610100 ^ -912610100 ^ 1847499216;
                        }

                        label169:
                        while (true) {
                          switch (var14 - 184678534 - 2104601122 ^ 998554592 ^ 56649463 ^ 416274203 ^ 2558868) {
                            case -978913616:
                              if (var9 < 7) {
                                if (/* jnt */
                                  )
                                  == null /* jnt:encrypted */
                                  )
                                 {
                                  var6++;
                                }

                                var14 = -1764944665 ^ -1764944665 ^ 2118174042;
                              } else {
                                var14 = -2140337923 ^ -325404197 ^ -644176311;
                              }
                              break;
                            case -708762838:
                              var9++;
                              var14 = -912610100 ^ -912610100 ^ 1847499216;
                              break;
                            case -451557454:
                            default:
                              if (var9 >= 7) {
                                var14 = 1228759573 << 1124613464 ^ -142789901;
                                break;
                              } else {
                                class_2248 var10 = /* jnt */
                                );
                                if (!/* jnt */
                                  && var10
                                    == null /* jnt:encrypted */
                                  )
                                 {
                                  var14 = -955335781 ^ 1047270124 * 1047270124 ^ -428049647;
                                } else {
                                  var14 = (1503699950 ^ -1412295094 | -1994423856) & -1382035464;
                                }

                                label156:
                                while (true) {
                                  switch ((var14 - 1242660566 - 542983034 - 1685668937 - 78020825 ^ 797528822) - 351854110) {
                                    case -1527368384:
                                      if (/* jnt */,
                                        var2x
                                      )) {
                                        int var10000 = (-1835035349 + -1835035349 | 0) & -1040187359;

                                        StringBuilder var10001;
                                        for (var10001 = (StringBuilder)/* jnt */;
                                          var10000 < (2109354586 - (2109354586 << 1801744531) ^ -353750447);
                                          var10000 += -1406818569 - (-1406818569 - -1797871499) ^ -1797871500
                                        ) {
                                          char var24 = /* jnt */;
                                          char var27 = (char)(
                                            (
                                                (
                                                      ((((var24 & '\uffff') >> 0 | var24 << 16) & 57344) >> 13 | ((var24 & '\uffff') >> 0 | var24 << 16) << 3)
                                                        & 63488
                                                    )
                                                    >> 11
                                                  | ((((var24 & '\uffff') >> 0 | var24 << 16) & 57344) >> 13 | ((var24 & '\uffff') >> 0 | var24 << 16) << 3)
                                                    << 5
                                              )
                                              - 111
                                              - 239
                                          );
                                          /* jnt */(
                                              (
                                                  (
                                                        ((((var24 & '\uffff') >> 0 | var24 << 16) & 57344) >> 13 | ((var24 & '\uffff') >> 0 | var24 << 16) << 3)
                                                          & 63488
                                                      )
                                                      >> 11
                                                    | ((((var24 & '\uffff') >> 0 | var24 << 16) & 57344) >> 13 | ((var24 & '\uffff') >> 0 | var24 << 16) << 3)
                                                      << 5
                                                )
                                                - 111
                                                - 239
                                            )
                                          );
                                        }

                                        vc var11 = (vc)/* jnt */
                                        );
                                        /* jnt */
                                        );
                                        int var12 = var3x;
                                        var10001 = (StringBuilder)/* jnt */;
                                        int var29 = (-1830462130 + -1830462130 | 0) & -1709113021;
                                        StringBuilder var33 = (StringBuilder)/* jnt */;

                                        label153:
                                        while (true) {
                                          var14 = (-1542910274 - (1448879443 >>> 1074429482) | 335546498) & 353769606;

                                          while (true) {
                                            StringBuilder var30;
                                            switch (((var14 ^ 1662693054) - 335272390 ^ 1918457925 ^ 323349386 ^ 1520615060) + 1758112135) {
                                              case -1031963984:
                                              default:
                                                var30 = var33;
                                                if (var29 < ((-310477666 | 1165988241) ^ -310379108)) {
                                                  int var43 = (
                                                      /* jnt */ ^ 189
                                                    )
                                                    + 143;
                                                  char var46 = (char)(
                                                    (((((var43 & 65534) >> 1 | var43 << 15) & 65504) >> 5 | ((var43 & 65534) >> 1 | var43 << 15) << 11) & 65532)
                                                        >> 2
                                                      | ((((var43 & 65534) >> 1 | var43 << 15) & 65504) >> 5 | ((var43 & 65534) >> 1 | var43 << 15) << 11)
                                                        << 14
                                                  );
                                                  /* jnt */(
                                                      (
                                                            ((((var43 & 65534) >> 1 | var43 << 15) & 65504) >> 5 | ((var43 & 65534) >> 1 | var43 << 15) << 11)
                                                              & 65532
                                                          )
                                                          >> 2
                                                        | ((((var43 & 65534) >> 1 | var43 << 15) & 65504) >> 5 | ((var43 & 65534) >> 1 | var43 << 15) << 11)
                                                          << 14
                                                    )
                                                  );
                                                  var29 += 1786443348 >>> 1527647281 ^ 13628;
                                                  continue label153;
                                                }

                                                var14 = (-1388343747 + 1194628928 | -1743615070) & -1173172298;
                                                break;
                                              case 622113948:
                                                var30 = var33;
                                                if (var29 < ((946677719 >>> 946677719 | 4) & -1717884785)) {
                                                  int var39 = /* jnt */
                                                      + 233
                                                    ^ 152
                                                    ^ 179;
                                                  char var40 = (char)(((var39 & 0) >> 16 | var39 << 0) + 117);
                                                  /* jnt */(((var39 & 0) >> 16 | var39 << 0) + 117)
                                                  );
                                                  var29 += (-1888609146 + 1223473416 + 2046970890 | 1) & 203444801;
                                                  var14 = -960854422 - -691870244 ^ 386068004;
                                                  continue;
                                                }

                                                var14 = -685040961 >>> 835999138 ^ 76584542;
                                            }

                                            switch (var14 - 1643889733 - 1962657270 + 769067573 + 844277108 - 2022689567 ^ 971821190) {
                                              case -245876093:
                                                var10001 = /* jnt */
                                                  ),
                                                  var12
                                                );
                                                var29 = 1564471611 - 1564471611 ^ 0;
                                                var33 = (StringBuilder)/* jnt */;
                                                var14 = -960854422 - -691870244 ^ 386068004;
                                                break;
                                              case 2014346182:
                                              default:
                                                /* jnt */
                                                      ),
                                                      var4
                                                    )
                                                  )
                                                );
                                                /* jnt */)","햕풕禕鮕邕憕\uda95颕钕鮕邕溕羕沕鎕憕\uda95溕馕沕纕纕䪕뺕ꊕꆕꚕ","⑉㡉籉\u244eᡉ⡉⑉㡉偉鑉䡉䑉籉\u244e偉᱉䡉遉遉\ue049過衎豎",-1853477932>(
                                                    null /* jnt:encrypted */
                                                  ),
                                                  /* jnt */
                                                );
                                                var14 = (-256194377 | -765533350) ^ -1233011313;
                                                continue label156;
                                            }
                                          }
                                        }
                                      }

                                      var14 = (-256194377 | -765533350) ^ -1233011313;
                                      break;
                                    case -450834838:
                                      var9++;
                                      var14 = (-1970869997 + -238715623 | 1300302034) & -845158189;
                                      continue label169;
                                    case 1249951210:
                                    default:
                                      return;
                                  }
                                }
                              }
                            case 217412959:
                              var8++;
                              var14 = -1604697572 >>> -1781677073 ^ 1547495961;
                              continue label177;
                            case 2047185363:
                              var8++;
                              var14 = (1959020371 ^ 1959020371 | 619884264) & -1342504978;
                              continue label177;
                          }
                        }
                      }
                    }

                    var14 = 1781337277 << (1781337277 & (1781337277 ^ 1781337277)) ^ 295427520;
                  }
                }
              }
            );
            return;
          case 1724649745:
          default:
            if (null /* jnt:encrypted */) {
              /* jnt */;
              return;
            }

            var2 = 2141697679 + -173472883 ^ -1346004872;
        }
      }
    }
  }

  public void io() {
    int var9 = 1365344754;
    class_1923 var1 = /* jnt */
      )
    );
    kcp var2 = (kcp)/* jnt */;
    byte var3 = 16;
    ArrayList var4 = (ArrayList)/* jnt */;
    int var5 = /* jnt */;

    label106:
    while (true) {
      var9 = (-1822396873 >>> 535144775 | -2133741311) & -990658795;

      while (true) {
        switch (((var9 + 1277229712 ^ 129163263 ^ 1208198362) + 1348608335 ^ 1643281539) + 1136993685) {
          case -155536671:
            if (var5 < /* jnt */ + var3) {
              int var11 = /* jnt */;

              label94:
              while (true) {
                var9 = (1657908762 >> 1589021369 | 60974856) & -1883572326;

                while (true) {
                  switch (((var9 + 64380439 ^ 1920920624) + 1553889876 ^ 1217758714) + 1510555786 + 85824969) {
                    case -1926874171:
                    default:
                      var5++;
                      continue label106;
                    case -128451364:
                  }

                  if (var11 < /* jnt */ + var3) {
                    int var12 = 7;

                    while (true) {
                      var9 = -1991414833 & -1342991971 ^ -602591476;

                      while (true) {
                        switch (((var9 - 155122624 - 382724883 ^ 1923119416) - 1586580369 ^ 1572546112) - 959159245) {
                          case -907051415:
                          default:
                            var11++;
                            continue label94;
                          case 2075998584:
                        }

                        if (var12 >= 1) {
                          class_2248 var8 = /* jnt */
                          );
                          if (var8
                            == null /* jnt:encrypted */
                            )
                           {
                            /* jnt *//* jnt */
                            );
                          }

                          var12--;
                          break;
                        }

                        var9 = (1385068257 ^ -1786387664 | 731924482) & -269419974;
                      }
                    }
                  }

                  var9 = (994160646 + 1826568900 | 1994129893) & 1994141677;
                }
              }
            }

            var9 = (1567640596 | -556146002) ^ -1439511518;
            break;
          case 51585392:
          default:
            if (/* jnt */ < 20) {
              /* jnt */,
                (Runnable)() -> {
                  int var1x = 791895434;
                  if (null /* jnt:encrypted */
                      )
                      == null
                    && null /* jnt:encrypted */
                      )
                      == null) {
                    var1x = 2145246750 & -238284964 >> -238284964 ^ 1849931003;
                  } else {
                    var1x = -1020868113 + (-865932508 << -1658147483) ^ 420466537;
                  }

                  while (true) {
                    switch (((var1x ^ 437016402) + 1117734739 - 1386937610 + 228991665 ^ 204539919) + 439328899) {
                      case -1003983365:
                      default:
                        return;
                      case 525157185:
                        /* jnt */;
                        break;
                      case 1614990276:
                        class_746 var10000 = null /* jnt:encrypted */
                        );
                        int var10001 = (1295716919 | -1758537331 | 0) & 12582912;

                        StringBuilder var10002;
                        for (var10002 = (StringBuilder)/* jnt */;
                          var10001 < ((-224226718 + -1777442760 | 7) & 1174864919);
                          var10001 += (652215744 | 652215744 | 1) & 1209936425
                        ) {
                          int var5x = (/* jnt */ ^ 252) - 241;
                          int var10005 = (var5x & 63488) >> 11;
                          int var6x = ((var5x & 63488) >> 11 | var5x << 5) + 8;
                          int var10x = (((var5x & 63488) >> 11 | var5x << 5) + 8 & 65504) >> 5;
                          char var7x = (char)(((var10005 | var5x << 5) + 8 & 65504) >> 5 | ((var5x & 63488) >> 11 | var5x << 5) + 8 << 11);
                          /* jnt */(var10x | var6x << 11)
                          );
                        }

                        /* jnt */\u0015","햕禕鞕沕掕沕\uda95馕沕鮕銕\uda95底憕羕钕鮕銕ꚕ풕禕鮕邕憕\uda95颕钕鮕邕溕羕沕鎕憕\uda95溕馕沕纕纕䪕뾕ꂕꎕ법ꚕ","⑉㡉籉\u244eᡉ⡉⑉㡉偉鑉䡉䑉籉\u244e偉᱉䡉遉遉\ue049鑎硎葎衎",-1853477972>(
                            /* jnt */
                          ),
                          false
                        );
                        /* jnt */;
                    }

                    var1x = -477780352 << -1832131366 ^ -1306325201;
                  }
                }
              );
              return;
            }

            var9 = -253771238 + -253771238 ^ 635133790;
            break;
          case 304730690:
            boolean var10 = true;
            Iterator var6 = /* jnt */;

            label67:
            while (true) {
              var9 = -1079388504 >>> -1796100023 + -445109014 ^ 428032559;

              while (true) {
                switch ((var9 ^ 1277499643) - 1202080295 - 800954920 + 1974611189 ^ 1529925255 ^ 468929302) {
                  case -1579993927:
                    if (var10) {
                      null /* jnt:encrypted */;
                      null /* jnt:encrypted */;
                      return;
                    }

                    var9 = 767512162 - -1739115850 ^ 1868320466;
                    continue;
                  case -191097926:
                    if (null /* jnt:encrypted */
                        )
                        == null
                      && null /* jnt:encrypted */
                        )
                        == null) {
                      break;
                    }

                    var9 = (-895121161 >> -895121161 - 1079483266 | 35080) & 1510779294;
                    continue;
                  case 322375766:
                  default:
                    if (/* jnt */) {
                      class_2338 var7 = (BlockPos)/* jnt */;
                      if (/* jnt */\u0015","햕풕璕","⑉㡉籉\u244eᡉ⡉⑉㡉偉鑉䡉䑉籉\u244e偉᱉䡉遉遉\ue049鑎過過汎",-1853478023>(var7),
                        /* jnt */,
                        /* jnt */
                      )) {
                        continue label67;
                      }

                      var10 = false;
                    }

                    var9 = (-1487170146 >> -1487170146 | -1906163631) & -1360564103;
                    continue;
                  case 1421115164:
                    /* jnt */,
                      (Runnable)() -> {
                        class_746 var10000 = null /* jnt:encrypted */
                        );
                        int var10001 = -1651238610 - -1651238610 ^ 0;

                        StringBuilder var10002;
                        for (var10002 = (StringBuilder)/* jnt */;
                          var10001 < (2074675905 >>> 2074675905 ^ 1037337964);
                          var10001 += -414319645 >>> -414319645 ^ 485080957
                        ) {
                          int var3x = /* jnt */;
                          int var10005 = (var3x & 65534) >> 1;
                          int var4x = (var3x & 65534) >> 1 | var3x << 15;
                          int var12x = (((var3x & 65534) >> 1 | var3x << 15) & 65520) >> 4;
                          var3x = ((var10005 | var3x << 15) & 65520) >> 4 | ((var3x & 65534) >> 1 | var3x << 15) << 12;
                          var10005 = ((var12x | var4x << 12) & 65408) >> 7;
                          int var6x = (((var12x | var4x << 12) & 65408) >> 7 | var3x << 9) - 169;
                          int var14x = ((((var12x | var4x << 12) & 65408) >> 7 | var3x << 9) - 169 & 65504) >> 5;
                          char var7x = (char)(((var10005 | var3x << 9) - 169 & 65504) >> 5 | (((var12x | var4x << 12) & 65408) >> 7 | var3x << 9) - 169 << 11);
                          /* jnt */(var14x | var6x << 11)
                          );
                        }

                        /* jnt */\u0015","햕禕鞕沕掕沕\uda95馕沕鮕銕\uda95底憕羕钕鮕銕ꚕ풕禕鮕邕憕\uda95颕钕鮕邕溕羕沕鎕憕\uda95溕馕沕纕纕䪕뾕ꂕꎕ법ꚕ","⑉㡉籉\u244eᡉ⡉⑉㡉偉鑉䡉䑉籉\u244e偉᱉䡉遉遉\ue049鑎硎葎衎",-1853477986>(
                            /* jnt */
                          ),
                          true
                        );
                      }
                    );
                    break;
                  case 2128812001:
                    /* jnt */;
                    return;
                }

                var9 = (-1395827611 >> (1848501508 << -1395827611) | 1400328465) & 1945620921;
              }
            }
        }
      }
    }
  }

  public void ul(ArrayList var1, class_1923 var2, int var3) {
    int var4 = 280000;
    int var5 = -var4;
    int var7 = var4 - var5;
    int var8 = var7 / var3 + 1;
    long var9 = (long)var8 * (long)var8;
    AtomicLong var11 = new AtomicLong(0L);
    AtomicBoolean var12 = new AtomicBoolean(false);
    int var13 = Runtime.getRuntime().availableProcessors();
    ExecutorService var14 = Executors.newFixedThreadPool(var13);
    long var15 = System.currentTimeMillis();
    Thread var17 = new Thread(() -> {
      try {
        while (!var12.get() && !Thread.currentThread().isInterrupted()) {
          Thread.sleep(3000L);
          long var7x = var11.get();
          long var9x = System.currentTimeMillis() - var15;
          long var11x = var7x * 1000L / Math.max(var9x, 1L);
          long var13x = (var9 - var7x) / Math.max(var11x, 1L);
          this.gk.execute(() -> {
            if (this.gk.field_1724 == null && this.gk.field_1687 == null) {
              this.gyx(false);
            } else {
              this.gk.field_1724.method_7353(class_2561.method_30163(String.format("ETA: %,ds", var13x)), true);
            }
          });
        }
      } catch (InterruptedException var15x) {
        Thread.currentThread().interrupt();
      }
    });
    var17.start();
    ArrayList var18 = new ArrayList();
    int var19 = var8 / var13;
    int var20 = var8 % var13;

    for (int var21 = 0; var21 < var13; var21++) {
      int var22 = var21 * var19 + Math.min(var21, var20);
      int var23 = var22 + var19 + (var21 < var20 ? 1 : 0);
      CompletableFuture var24 = CompletableFuture.runAsync(() -> {
        for (int var12x = var22; var12x < var23 && !var12.get(); var12x++) {
          int var13x = var5 + var12x * var3;

          for (int var14x = 0; var14x < var8 && !var12.get(); var14x++) {
            int var15x = var5 + var14x * var3;
            var11.incrementAndGet();
            boolean var16 = true;

            for (class_2338 var18x : var1) {
              int var19x = var18x.method_10263() - var2.method_8326();
              int var20x = var18x.method_10260() - var2.method_8328();
              int var21x = var13x + var19x;
              int var22x = var15x + var20x;
              int var23x = var18x.method_10264();
              if (!this.lr(var21x, var23x, var22x)) {
                var16 = false;
                break;
              }
            }

            if (var16) {
              var12.set(true);
              int var24x = var13x - var2.method_8326();
              int var25x = var15x - var2.method_8328();
              this.bu = var24x;
              this.up = var25x;
              long var26 = System.currentTimeMillis() - var15;
              this.gk.execute(() -> {
                if (this.gk.field_1724 != null || this.gk.field_1687 != null) {
                  this.gk.field_1724.method_7353(class_2561.method_30163("Finished in (" + var26 / 1000L + "s)"), false);
                }
              });
              break;
            }
          }
        }
      }, var14);
      var18.add(var24);
    }

    try {
      CompletableFuture.allOf(var18.toArray(new CompletableFuture[0])).join();
    } catch (Exception var25) {
    }

    var17.interrupt();
    var14.shutdown();
    if (!var12.get()) {
      this.gk.execute(() -> {
        if (this.gk.field_1724 != null || this.gk.field_1687 != null) {
          this.gk.field_1724.method_7353(class_2561.method_30163("No offset found. Try different location."), false);
        }
      });
    }
  }

  public boolean lr(int var1, int var2, int var3) {
    int var7 = -1856038797;
    if (var2 >= 8) {
      return false;
    } else {
      var7 = (-2087078306 * (-2087078306 << 1507784265) | -464821099) & -445907201;

      while (true) {
        switch (((var7 ^ 598167791) + 1932128311 ^ 426117959) - 1383128873 + 1658814940 ^ 2032382625) {
          case 723812898:
          default:
            double var4 = null /* jnt:encrypted */[var2];
            class_5819 var6 = /* jnt */,
              var1,
              var2,
              var3
            );
            return (double)/* jnt */ < var4;
          case 1258125320:
        }

        if (var2 <= 0) {
          return true;
        }

        var7 = (755513545 | -2030864306 | 1113687694) & -696793185;
      }
    }
  }

  public boolean sm(int var1, int var2, int var3) {
    int var7 = -456271577;
    if (var2 >= 8) {
      return false;
    } else {
      var7 = (1974288866 & -1617484700 + 1974288866 | 1235261093) & -873285979;

      while (true) {
        switch ((var7 + 1838762522 ^ 832936492) + 92468021 + 141828483 ^ 704105930 ^ 1392932494) {
          case -295554033:
            if (var2 <= 0) {
              return true;
            }

            var7 = (-1849597136 >> 2012051068 | -1865262886) & -253862438;
            break;
          case 121170388:
          default:
            double var4 = null /* jnt:encrypted */[var2];
            class_5819 var6 = /* jnt */,
              var1 + null /* jnt:encrypted */,
              var2,
              var3 + null /* jnt:encrypted */
            );
            return (double)/* jnt */ < var4;
        }
      }
    }
  }

  static {
    Loader.init(cm.class);
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = var10 - 23398399 + 558150811 - 2116638933 - 1436403385 - 1209779039 + 814560946 + 1478711683 - 430850035 - 46421261;
    MethodHandle var10000 = hzn[var10 - 23398399 + 558150811 - 2116638933 - 1436403385 - 1209779039 + 814560946 + 1478711683 - 430850035 - 46421261 - 29421579];
    if (hzn[var10001 - 29421579] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = -744418418 << -744418418 ^ 1155760128; var23 < var13.length(); var23 += 1040794195 * 1375322844 ^ 435348821) {
        int var42 = var13.charAt(var23) + 17;
        char var47 = (char)(
          (
                (
                    (
                          (
                              (
                                    (
                                        ((((var42 & 32768) >> 15 | var42 << 1) ^ 157) - 162 + 199 + 162 & 65532) >> 2
                                          | (((var42 & 32768) >> 15 | var42 << 1) ^ 157) - 162 + 199 + 162 << 14
                                      )
                                      & 57344
                                  )
                                  >> 13
                                | (
                                    ((((var42 & 32768) >> 15 | var42 << 1) ^ 157) - 162 + 199 + 162 & 65532) >> 2
                                      | (((var42 & 32768) >> 15 | var42 << 1) ^ 157) - 162 + 199 + 162 << 14
                                  )
                                  << 3
                            )
                            & 65528
                        )
                        >> 3
                      | (
                          (
                                (
                                    ((((var42 & 32768) >> 15 | var42 << 1) ^ 157) - 162 + 199 + 162 & 65532) >> 2
                                      | (((var42 & 32768) >> 15 | var42 << 1) ^ 157) - 162 + 199 + 162 << 14
                                  )
                                  & 57344
                              )
                              >> 13
                            | (
                                ((((var42 & 32768) >> 15 | var42 << 1) ^ 157) - 162 + 199 + 162 & 65532) >> 2
                                  | (((var42 & 32768) >> 15 | var42 << 1) ^ 157) - 162 + 199 + 162 << 14
                              )
                              << 3
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
                                    ((((var42 & 32768) >> 15 | var42 << 1) ^ 157) - 162 + 199 + 162 & 65532) >> 2
                                      | (((var42 & 32768) >> 15 | var42 << 1) ^ 157) - 162 + 199 + 162 << 14
                                  )
                                  & 57344
                              )
                              >> 13
                            | (
                                ((((var42 & 32768) >> 15 | var42 << 1) ^ 157) - 162 + 199 + 162 & 65532) >> 2
                                  | (((var42 & 32768) >> 15 | var42 << 1) ^ 157) - 162 + 199 + 162 << 14
                              )
                              << 3
                        )
                        & 65528
                    )
                    >> 3
                  | (
                      (
                            (
                                ((((var42 & 32768) >> 15 | var42 << 1) ^ 157) - 162 + 199 + 162 & 65532) >> 2
                                  | (((var42 & 32768) >> 15 | var42 << 1) ^ 157) - 162 + 199 + 162 << 14
                              )
                              & 57344
                          )
                          >> 13
                        | (
                            ((((var42 & 32768) >> 15 | var42 << 1) ^ 157) - 162 + 199 + 162 & 65532) >> 2
                              | (((var42 & 32768) >> 15 | var42 << 1) ^ 157) - 162 + 199 + 162 << 14
                          )
                          << 3
                    )
                    << 13
              )
              << 15
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
                                          ((((var42 & 32768) >> 15 | var42 << 1) ^ 157) - 162 + 199 + 162 & 65532) >> 2
                                            | (((var42 & 32768) >> 15 | var42 << 1) ^ 157) - 162 + 199 + 162 << 14
                                        )
                                        & 57344
                                    )
                                    >> 13
                                  | (
                                      ((((var42 & 32768) >> 15 | var42 << 1) ^ 157) - 162 + 199 + 162 & 65532) >> 2
                                        | (((var42 & 32768) >> 15 | var42 << 1) ^ 157) - 162 + 199 + 162 << 14
                                    )
                                    << 3
                              )
                              & 65528
                          )
                          >> 3
                        | (
                            (
                                  (
                                      ((((var42 & 32768) >> 15 | var42 << 1) ^ 157) - 162 + 199 + 162 & 65532) >> 2
                                        | (((var42 & 32768) >> 15 | var42 << 1) ^ 157) - 162 + 199 + 162 << 14
                                    )
                                    & 57344
                                )
                                >> 13
                              | (
                                  ((((var42 & 32768) >> 15 | var42 << 1) ^ 157) - 162 + 199 + 162 & 65532) >> 2
                                    | (((var42 & 32768) >> 15 | var42 << 1) ^ 157) - 162 + 199 + 162 << 14
                                )
                                << 3
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
                                      ((((var42 & 32768) >> 15 | var42 << 1) ^ 157) - 162 + 199 + 162 & 65532) >> 2
                                        | (((var42 & 32768) >> 15 | var42 << 1) ^ 157) - 162 + 199 + 162 << 14
                                    )
                                    & 57344
                                )
                                >> 13
                              | (
                                  ((((var42 & 32768) >> 15 | var42 << 1) ^ 157) - 162 + 199 + 162 & 65532) >> 2
                                    | (((var42 & 32768) >> 15 | var42 << 1) ^ 157) - 162 + 199 + 162 << 14
                                )
                                << 3
                          )
                          & 65528
                      )
                      >> 3
                    | (
                        (
                              (
                                  ((((var42 & 32768) >> 15 | var42 << 1) ^ 157) - 162 + 199 + 162 & 65532) >> 2
                                    | (((var42 & 32768) >> 15 | var42 << 1) ^ 157) - 162 + 199 + 162 << 14
                                )
                                & 57344
                            )
                            >> 13
                          | (
                              ((((var42 & 32768) >> 15 | var42 << 1) ^ 157) - 162 + 199 + 162 & 65532) >> 2
                                | (((var42 & 32768) >> 15 | var42 << 1) ^ 157) - 162 + 199 + 162 << 14
                            )
                            << 3
                      )
                      << 13
                )
                << 15
          )
        );
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = 1829450478 >> 1500259473 ^ 13957; var29 < var16.length(); var29 += -1103616245 & -1181825111 ^ -1207433464) {
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
                                                  ((((var52 & '\uffff') >> 0 | var52 << 16) - 54 ^ 94) & 65024) >> 9
                                                    | (((var52 & '\uffff') >> 0 | var52 << 16) - 54 ^ 94) << 7
                                                )
                                                ^ 246
                                            )
                                            - 26
                                          & 65520
                                      )
                                      >> 4
                                    | (
                                          (
                                              ((((var52 & '\uffff') >> 0 | var52 << 16) - 54 ^ 94) & 65024) >> 9
                                                | (((var52 & '\uffff') >> 0 | var52 << 16) - 54 ^ 94) << 7
                                            )
                                            ^ 246
                                        )
                                        - 26
                                      << 12
                                )
                                & 32768
                            )
                            >> 15
                          | (
                              (
                                    (
                                          (
                                              ((((var52 & '\uffff') >> 0 | var52 << 16) - 54 ^ 94) & 65024) >> 9
                                                | (((var52 & '\uffff') >> 0 | var52 << 16) - 54 ^ 94) << 7
                                            )
                                            ^ 246
                                        )
                                        - 26
                                      & 65520
                                  )
                                  >> 4
                                | (
                                      (
                                          ((((var52 & '\uffff') >> 0 | var52 << 16) - 54 ^ 94) & 65024) >> 9
                                            | (((var52 & '\uffff') >> 0 | var52 << 16) - 54 ^ 94) << 7
                                        )
                                        ^ 246
                                    )
                                    - 26
                                  << 12
                            )
                            << 1
                      )
                      & 61440
                  )
                  >> 12
                | (
                    (
                          (
                              (
                                    (
                                          (
                                              ((((var52 & '\uffff') >> 0 | var52 << 16) - 54 ^ 94) & 65024) >> 9
                                                | (((var52 & '\uffff') >> 0 | var52 << 16) - 54 ^ 94) << 7
                                            )
                                            ^ 246
                                        )
                                        - 26
                                      & 65520
                                  )
                                  >> 4
                                | (
                                      (
                                          ((((var52 & '\uffff') >> 0 | var52 << 16) - 54 ^ 94) & 65024) >> 9
                                            | (((var52 & '\uffff') >> 0 | var52 << 16) - 54 ^ 94) << 7
                                        )
                                        ^ 246
                                    )
                                    - 26
                                  << 12
                            )
                            & 32768
                        )
                        >> 15
                      | (
                          (
                                (
                                      (
                                          ((((var52 & '\uffff') >> 0 | var52 << 16) - 54 ^ 94) & 65024) >> 9
                                            | (((var52 & '\uffff') >> 0 | var52 << 16) - 54 ^ 94) << 7
                                        )
                                        ^ 246
                                    )
                                    - 26
                                  & 65520
                              )
                              >> 4
                            | (
                                  (
                                      ((((var52 & '\uffff') >> 0 | var52 << 16) - 54 ^ 94) & 65024) >> 9
                                        | (((var52 & '\uffff') >> 0 | var52 << 16) - 54 ^ 94) << 7
                                    )
                                    ^ 246
                                )
                                - 26
                              << 12
                        )
                        << 1
                  )
                  << 4
            )
            ^ 45
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
                                                    ((((var52 & '\uffff') >> 0 | var52 << 16) - 54 ^ 94) & 65024) >> 9
                                                      | (((var52 & '\uffff') >> 0 | var52 << 16) - 54 ^ 94) << 7
                                                  )
                                                  ^ 246
                                              )
                                              - 26
                                            & 65520
                                        )
                                        >> 4
                                      | (
                                            (
                                                ((((var52 & '\uffff') >> 0 | var52 << 16) - 54 ^ 94) & 65024) >> 9
                                                  | (((var52 & '\uffff') >> 0 | var52 << 16) - 54 ^ 94) << 7
                                              )
                                              ^ 246
                                          )
                                          - 26
                                        << 12
                                  )
                                  & 32768
                              )
                              >> 15
                            | (
                                (
                                      (
                                            (
                                                ((((var52 & '\uffff') >> 0 | var52 << 16) - 54 ^ 94) & 65024) >> 9
                                                  | (((var52 & '\uffff') >> 0 | var52 << 16) - 54 ^ 94) << 7
                                              )
                                              ^ 246
                                          )
                                          - 26
                                        & 65520
                                    )
                                    >> 4
                                  | (
                                        (
                                            ((((var52 & '\uffff') >> 0 | var52 << 16) - 54 ^ 94) & 65024) >> 9
                                              | (((var52 & '\uffff') >> 0 | var52 << 16) - 54 ^ 94) << 7
                                          )
                                          ^ 246
                                      )
                                      - 26
                                    << 12
                              )
                              << 1
                        )
                        & 61440
                    )
                    >> 12
                  | (
                      (
                            (
                                (
                                      (
                                            (
                                                ((((var52 & '\uffff') >> 0 | var52 << 16) - 54 ^ 94) & 65024) >> 9
                                                  | (((var52 & '\uffff') >> 0 | var52 << 16) - 54 ^ 94) << 7
                                              )
                                              ^ 246
                                          )
                                          - 26
                                        & 65520
                                    )
                                    >> 4
                                  | (
                                        (
                                            ((((var52 & '\uffff') >> 0 | var52 << 16) - 54 ^ 94) & 65024) >> 9
                                              | (((var52 & '\uffff') >> 0 | var52 << 16) - 54 ^ 94) << 7
                                          )
                                          ^ 246
                                      )
                                      - 26
                                    << 12
                              )
                              & 32768
                          )
                          >> 15
                        | (
                            (
                                  (
                                        (
                                            ((((var52 & '\uffff') >> 0 | var52 << 16) - 54 ^ 94) & 65024) >> 9
                                              | (((var52 & '\uffff') >> 0 | var52 << 16) - 54 ^ 94) << 7
                                          )
                                          ^ 246
                                      )
                                      - 26
                                    & 65520
                                )
                                >> 4
                              | (
                                    (
                                        ((((var52 & '\uffff') >> 0 | var52 << 16) - 54 ^ 94) & 65024) >> 9
                                          | (((var52 & '\uffff') >> 0 | var52 << 16) - 54 ^ 94) << 7
                                      )
                                      ^ 246
                                  )
                                  - 26
                                << 12
                          )
                          << 1
                    )
                    << 4
              )
              ^ 45
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), cm.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (-117614307 & -117614307 | 0) & 100671680; var35 < var19.length(); var35 += 644408952 * -1251775539 ^ -1833126375) {
        int var62 = var19.charAt(var35);
        int var98 = (var62 & 65535) >> 0;
        int var63 = ((var62 & 65535) >> 0 | var62 << 16) ^ 250;
        int var99 = ((((var62 & 65535) >> 0 | var62 << 16) ^ 250) & 65520) >> 4;
        var62 = ((((var98 | var62 << 16) ^ 250) & 65520) >> 4 | (((var62 & 65535) >> 0 | var62 << 16) ^ 250) << 12) - 12;
        var98 = ((var99 | var63 << 12) - 12 & 64512) >> 10;
        int var65 = (((var99 | var63 << 12) - 12 & 64512) >> 10 | var62 << 6) + 104 - 44;
        int var101 = ((((var99 | var63 << 12) - 12 & 64512) >> 10 | var62 << 6) + 104 - 44 & 61440) >> 12;
        char var66 = (char)(
          (((var98 | var62 << 6) + 104 - 44 & 61440) >> 12 | (((var99 | var63 << 12) - 12 & 64512) >> 10 | var62 << 6) + 104 - 44 << 4) - 6 ^ 237
        );
        var19.setCharAt(var35, (char)((var101 | var65 << 4) - 6 ^ 237));
      }

      Class var7 = Class.forName(var19.toString(), false, cm.class.getClassLoader());
      switch (((var4 - 386272879 - 1203735826 - 2099506951 - 1044473550 ^ 626167972 ^ 1733438221) + 1350462392 ^ 778932439) - 1982097190 ^ 1177216190) {
        case 157938115:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 358596858:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 895655497:
        case 1554634584:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1785658767:
          var10000 = var0.findSpecial(var7, var5, var6, cm.class);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    hzn[var10 - 23398399 + 558150811 - 2116638933 - 1436403385 - 1209779039 + 814560946 + 1478711683 - 430850035 - 46421261 - 29421579] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 + 794695642 + 1929120269 + 455981463 ^ 1980963095 ^ 1511549194) + 179354892 ^ 1855249464) + 1301197986 + 54514184;
    MethodHandle var10000 = hzn[((var10 + 794695642 + 1929120269 + 455981463 ^ 1980963095 ^ 1511549194) + 179354892 ^ 1855249464)
      + 1301197986
      + 54514184
      - 221085295];
    if (hzn[var10001 - 221085295] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (1059382170 + 1226567719 | 0) & 572073014; var24 < var14.length(); var24 += (-312563891 << 557652398 | 1) & 69768153) {
        int var43 = var14.charAt(var24) ^ 171;
        char var46 = (char)(
          (
                (
                    (((((var43 & 57344) >> 13 | var43 << 3) ^ 106 ^ 154) + 71 & 65472) >> 6 | (((var43 & 57344) >> 13 | var43 << 3) ^ 106 ^ 154) + 71 << 10)
                        + 233
                        + 155
                      ^ 249
                  )
                  & 65534
              )
              >> 1
            | (
                (((((var43 & 57344) >> 13 | var43 << 3) ^ 106 ^ 154) + 71 & 65472) >> 6 | (((var43 & 57344) >> 13 | var43 << 3) ^ 106 ^ 154) + 71 << 10)
                    + 233
                    + 155
                  ^ 249
              )
              << 15
        );
        var14.setCharAt(
          var24,
          (char)(
            (
                  (
                      (((((var43 & 57344) >> 13 | var43 << 3) ^ 106 ^ 154) + 71 & 65472) >> 6 | (((var43 & 57344) >> 13 | var43 << 3) ^ 106 ^ 154) + 71 << 10)
                          + 233
                          + 155
                        ^ 249
                    )
                    & 65534
                )
                >> 1
              | (
                  (((((var43 & 57344) >> 13 | var43 << 3) ^ 106 ^ 154) + 71 & 65472) >> 6 | (((var43 & 57344) >> 13 | var43 << 3) ^ 106 ^ 154) + 71 << 10)
                      + 233
                      + 155
                    ^ 249
                )
                << 15
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (2048740353 ^ 678606965 | 0) & -2003826559; var30 < var17.length(); var30 += -1502053832 + (215247249 >> 887195145) ^ -1501633427) {
        int var51 = var17.charAt(var30) + 221;
        char var54 = (char)(
          (
              (((((var51 & 32768) >> 15 | var51 << 1) + 133 & 57344) >> 13 | ((var51 & 32768) >> 15 | var51 << 1) + 133 << 3) - 84 + 101 - 45 & 65534) >> 1
                | ((((var51 & 32768) >> 15 | var51 << 1) + 133 & 57344) >> 13 | ((var51 & 32768) >> 15 | var51 << 1) + 133 << 3) - 84 + 101 - 45 << 15
            )
            - 45
            + 230
        );
        var17.setCharAt(
          var30,
          (char)(
            (
                (((((var51 & 32768) >> 15 | var51 << 1) + 133 & 57344) >> 13 | ((var51 & 32768) >> 15 | var51 << 1) + 133 << 3) - 84 + 101 - 45 & 65534) >> 1
                  | ((((var51 & 32768) >> 15 | var51 << 1) + 133 & 57344) >> 13 | ((var51 & 32768) >> 15 | var51 << 1) + 133 << 3) - 84 + 101 - 45 << 15
              )
              - 45
              + 230
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, cm.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (-718848688 + -718848688 * -718848688 | 0) & 1300299941; var36 < var20.length(); var36 += (-761834428 | -761834428 | 1) & 553681793) {
        int var59 = var20.charAt(var36) + '0';
        char var64 = (char)(
          (
                (
                      (
                            (
                                  (((((var59 & 65534) >> 1 | var59 << 15) & 65528) >> 3 | ((var59 & 65534) >> 1 | var59 << 15) << 13) & 65504) >> 5
                                    | ((((var59 & 65534) >> 1 | var59 << 15) & 65528) >> 3 | ((var59 & 65534) >> 1 | var59 << 15) << 13) << 11
                                )
                                - 120
                                + 133
                                - 230
                              & 0
                          )
                          >> 16
                        | (
                              (((((var59 & 65534) >> 1 | var59 << 15) & 65528) >> 3 | ((var59 & 65534) >> 1 | var59 << 15) << 13) & 65504) >> 5
                                | ((((var59 & 65534) >> 1 | var59 << 15) & 65528) >> 3 | ((var59 & 65534) >> 1 | var59 << 15) << 13) << 11
                            )
                            - 120
                            + 133
                            - 230
                          << 0
                    )
                    + 226
                  & 63488
              )
              >> 11
            | (
                  (
                        (
                              (((((var59 & 65534) >> 1 | var59 << 15) & 65528) >> 3 | ((var59 & 65534) >> 1 | var59 << 15) << 13) & 65504) >> 5
                                | ((((var59 & 65534) >> 1 | var59 << 15) & 65528) >> 3 | ((var59 & 65534) >> 1 | var59 << 15) << 13) << 11
                            )
                            - 120
                            + 133
                            - 230
                          & 0
                      )
                      >> 16
                    | (
                          (((((var59 & 65534) >> 1 | var59 << 15) & 65528) >> 3 | ((var59 & 65534) >> 1 | var59 << 15) << 13) & 65504) >> 5
                            | ((((var59 & 65534) >> 1 | var59 << 15) & 65528) >> 3 | ((var59 & 65534) >> 1 | var59 << 15) << 13) << 11
                        )
                        - 120
                        + 133
                        - 230
                      << 0
                )
                + 226
              << 5
        );
        var20.setCharAt(
          var36,
          (char)(
            (
                  (
                        (
                              (
                                    (((((var59 & 65534) >> 1 | var59 << 15) & 65528) >> 3 | ((var59 & 65534) >> 1 | var59 << 15) << 13) & 65504) >> 5
                                      | ((((var59 & 65534) >> 1 | var59 << 15) & 65528) >> 3 | ((var59 & 65534) >> 1 | var59 << 15) << 13) << 11
                                  )
                                  - 120
                                  + 133
                                  - 230
                                & 0
                            )
                            >> 16
                          | (
                                (((((var59 & 65534) >> 1 | var59 << 15) & 65528) >> 3 | ((var59 & 65534) >> 1 | var59 << 15) << 13) & 65504) >> 5
                                  | ((((var59 & 65534) >> 1 | var59 << 15) & 65528) >> 3 | ((var59 & 65534) >> 1 | var59 << 15) << 13) << 11
                              )
                              - 120
                              + 133
                              - 230
                            << 0
                      )
                      + 226
                    & 63488
                )
                >> 11
              | (
                    (
                          (
                                (((((var59 & 65534) >> 1 | var59 << 15) & 65528) >> 3 | ((var59 & 65534) >> 1 | var59 << 15) << 13) & 65504) >> 5
                                  | ((((var59 & 65534) >> 1 | var59 << 15) & 65528) >> 3 | ((var59 & 65534) >> 1 | var59 << 15) << 13) << 11
                              )
                              - 120
                              + 133
                              - 230
                            & 0
                        )
                        >> 16
                      | (
                            (((((var59 & 65534) >> 1 | var59 << 15) & 65528) >> 3 | ((var59 & 65534) >> 1 | var59 << 15) << 13) & 65504) >> 5
                              | ((((var59 & 65534) >> 1 | var59 << 15) & 65528) >> 3 | ((var59 & 65534) >> 1 | var59 << 15) << 13) << 11
                          )
                          - 120
                          + 133
                          - 230
                        << 0
                  )
                  + 226
                << 5
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), cm.class.getClassLoader()).returnType();
      switch ((var4 - 1193561796 - 312828328 - 1613092726 - 1318089892 - 1929527126 + 427836218 ^ 193068534) - 1490385005 - 619558209 - 1168516516) {
        case 574190188:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1015810433:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1301066597:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1336418400:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      hzn[((var10 + 794695642 + 1929120269 + 455981463 ^ 1980963095 ^ 1511549194) + 179354892 ^ 1855249464) + 1301197986 + 54514184 - 221085295] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }

  public static native void guard();
}
