// Status: PARTIAL - JNT native encryption (strings in jnt.so)


import dev.krypton.jnt3.Loader;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import net.minecraft.PlayerEntity;
import net.minecraft.BlockPos;
import net.minecraft.class_2350;
import net.minecraft.Vec3d;
import net.minecraft.class_2791;
import net.minecraft.ClientWorld;
import net.minecraft.class_2826;
import net.minecraft.class_2919;
import net.minecraft.Camera;
import net.minecraft.MatrixStack;
import net.minecraft.class_5321;
import net.minecraft.class_638;
import net.minecraft.class_6880;
import net.minecraft.BlockPos.class_2339;

public class vtk extends np {
  public rt eg;
  public rt da;
  public Map nid;
  public Map vf;
  public static zn lnh = (zn)/* jnt */;
  // [JNT] MethodHandle dispatch table (removed)
  public vtk() {
    int var10001 = (-1219369873 * 1959834544 | 0) & -1040181747;

    StringBuilder var10002;
    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < (-836996694 - -836996694 ^ 16);
      var10001 += (1645992066 & 1645992066 | 1) & 155459637
    ) {
      int var14 = /* jnt */;
      int var10005 = (var14 & 65472) >> 6;
      int var15 = ((var14 & 65472) >> 6 | var14 << 10) - 180;
      int var46 = (((var14 & 65472) >> 6 | var14 << 10) - 180 & 61440) >> 12;
      var14 = ((var10005 | var14 << 10) - 180 & 61440) >> 12 | ((var14 & 65472) >> 6 | var14 << 10) - 180 << 4;
      var10005 = ((var46 | var15 << 4) & 32768) >> 15;
      int var17 = ((var46 | var15 << 4) & 32768) >> 15 | var14 << 1;
      int var48 = ((((var46 | var15 << 4) & 32768) >> 15 | var14 << 1) & 49152) >> 14;
      char var18 = (char)(((var10005 | var14 << 1) & 49152) >> 14 | (((var46 | var15 << 4) & 32768) >> 15 | var14 << 1) << 2);
      /* jnt */(var48 | var17 << 2));
    }

    String var2 = /* jnt */;
    int var8 = 1450655893 ^ 1450655893 ^ 0;

    StringBuilder var20;
    for (var20 = (StringBuilder)/* jnt */;
      var8 < ((711638672 & 711638672 | 0) & -1064304518);
      var8 += -1181411933 * (1607099637 & -64780314) ^ 1550045485
    ) {
      int var36 = /* jnt */;
      int var10006 = (var36 & 65408) >> 7;
      int var37 = (var36 & 65408) >> 7 | var36 << 9;
      int var57 = (((var36 & 65408) >> 7 | var36 << 9) & 49152) >> 14;
      var36 = (((var10006 | var36 << 9) & 49152) >> 14 | ((var36 & 65408) >> 7 | var36 << 9) << 2) ^ 153;
      var10006 = (((var57 | var37 << 2) ^ 153) & 65535) >> 0;
      int var39 = (((var57 | var37 << 2) ^ 153) & 65535) >> 0 | var36 << 16;
      int var59 = (((((var57 | var37 << 2) ^ 153) & 65535) >> 0 | var36 << 16) & 65024) >> 9;
      char var40 = (char)(((var10006 | var36 << 16) & 65024) >> 9 | ((((var57 | var37 << 2) ^ 153) & 65535) >> 0 | var36 << 16) << 7);
      /* jnt */(var59 | var39 << 7));
    }

    super(
      var2,
      /* jnt */,
      -1,
      null /* jnt:encrypted */
    );
    var10001 = 8818595 + 8818595 ^ 17637190;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((-718599171 & -1064167741 | 4) & 640175423);
      var10001 += (-1900726098 + -1900726098 | 1) & 42207777
    ) {
      int var23 = /* jnt */ - '8';
      int var53 = (var23 & 0) >> 16;
      int var24 = (var23 & 0) >> 16 | var23 << 0;
      int var54 = (((var23 & 0) >> 16 | var23 << 0) & 65528) >> 3;
      char var25 = (char)((((var53 | var23 << 0) & 65528) >> 3 | ((var23 & 0) >> 16 | var23 << 0) << 13) + 149 - 110);
      /* jnt */((var54 | var24 << 13) + 149 - 110));
    }

    this.eg = (rt)/* jnt */, 1.0, 255.0, 125.0, 1.0
    );
    var10001 = (1536483892 >>> 1535803006 | 0) & 1845437850;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((1327222800 >>> -1950336192 | 5) & -1876687379);
      var10001 += 1401186291 & -1711183307 ^ 302015024
    ) {
      int var28 = /* jnt */ + '0' + 94;
      int var55 = (var28 & 65024) >> 9;
      int var29 = ((var28 & 65024) >> 9 | var28 << 7) - 253;
      int var56 = (((var28 & 65024) >> 9 | var28 << 7) - 253 & 57344) >> 13;
      char var30 = (char)(((var55 | var28 << 7) - 253 & 57344) >> 13 | ((var28 & 65024) >> 9 | var28 << 7) - 253 << 3);
      /* jnt */(var56 | var29 << 3));
    }

    this.da = (rt)/* jnt */, 1.0, 10.0, 5.0, 1.0
    );
    this.nid = (ConcurrentHashMap)/* jnt */;
    /* jnt */, null /* jnt:encrypted */}
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
  public void vf(lf var1) {
    int var8 = -326986885;
    if (null /* jnt:encrypted */
        )
        != null
      && null /* jnt:encrypted */ != null) {
      var8 = (-2022941594 * 1687606461 | 1361351828) & -545483595;
    } else {
      var8 = (-387986817 | -35239735 ^ 588361517) ^ -884740277;
    }

    switch (var8 + 1718901997 ^ 681175393 ^ 290949077 ^ 1272812467 ^ 1847757527 ^ 982851338) {
      case -1164692101:
        return;
      case 524589403:
      default:
        class_4184 var2 = /* jnt */
          )
        );
        if (var2 != null) {
          class_4587 var3 = null /* jnt:encrypted */;
          /* jnt */;
          class_243 var4 = /* jnt */;
          /* jnt */,
              /* jnt */
            )
          );
          /* jnt */,
              /* jnt */ + 180.0F
            )
          );
          /* jnt */,
            -null /* jnt:encrypted */,
            -null /* jnt:encrypted */
          );
        }

        int var9 = null /* jnt:encrypted */
          )
        );
        int var10 = null /* jnt:encrypted */
          )
        );
        int var5 = /* jnt */);
        int var6 = 0;

        label63:
        while (true) {
          var8 = (983304704 - 887082620 | 809624595) & -1117784077;

          while (true) {
            switch (((var8 ^ 725461891 ^ 347162036) - 2106627159 ^ 724692671) - 1163204284 - 557988077) {
              case -2142471462:
                class_4587 var11 = null /* jnt:encrypted */;
                /* jnt */;
                return;
              case 1071258697:
            }

            if (var6 <= var5) {
              int var7 = -var6 + var9;

              label60:
              while (true) {
                var8 = (1122512861 - -948170657 | -1971191504) & -623228624;

                while (true) {
                  switch (((var8 + 169159680 ^ 162210) + 1506674894 ^ 1989241821) + 323671983 ^ 1342345176) {
                    case -2144504137:
                    default:
                      var6++;
                      continue label63;
                    case -786021814:
                      var7 = -var6 + 1 + var9;
                      break;
                    case 193436084:
                      if (var7 <= var6 + var9) {
                        /* jnt */;
                        var7++;
                        continue label60;
                      }

                      var8 = (-1958841001 | -1958841001 << -1958841001 - -1958841001 | -1268662078) & -1209808646;
                      continue;
                    case 1207046525:
                      if (var7 >= var6 + var9) {
                        var8 = 1009207221 & 1302382814 ^ 1789873273;
                        continue;
                      }

                      /* jnt */;
                      var7++;
                  }

                  var8 = (1076968284 | -923926378 - -923926378) ^ 1316915875;
                }
              }
            }

            var8 = -1494570004 - -1494570004 ^ 1961776804;
          }
        }
    }
  }

  public void dy(int var1, int var2, lf var3) {
    int var11 = 540564662;
    long var4 = /* jnt */;
    if (/* jnt */,
      /* jnt */
    )) {
      Map var6 = (Map)/* jnt */,
        /* jnt */
      );
      Iterator var7 = /* jnt */
      );

      label39:
      while (/* jnt */) {
        Entry var8 = (Entry)/* jnt */;
        if (/* jnt *//* jnt */)
          )
          == /* jnt */)) {
          Iterator var9 = /* jnt *//* jnt */
          );

          label37:
          while (true) {
            var11 = 87034039 * (-1644368746 & -422036988) ^ 497161174;

            while (true) {
              switch ((var11 ^ 533318298) + 1823189803 + 1955800084 + 1510325564 - 368992435 + 2107152845) {
                case -238147291:
                default:
                  if (/* jnt */) {
                    class_243 var10 = (Vec3d)/* jnt */;
                    /* jnt */,
                      null /* jnt:encrypted */,
                      null /* jnt:encrypted */,
                      null /* jnt:encrypted */,
                      null /* jnt:encrypted */ + 1.0,
                      null /* jnt:encrypted */ + 1.0,
                      null /* jnt:encrypted */ + 1.0,
                      /* jnt */)
                      ),
                      /* jnt */)
                      ),
                      null /* jnt:encrypted */,
                      0
                    );
                    continue label37;
                  }

                  var11 = (-1923250552 - 882875197 | -1777845187) & -1775747075;
                  break;
                case 750828412:
                  continue label39;
              }
            }
          }
        }
      }
    }
  }

  public void mj() {
    /* jnt */);
    if (null /* jnt:encrypted */
      )
      != null) {
      null /* jnt:encrypted */;
      /* jnt */;
    }
  }

  public zn xty(int var1) {
    return (zn)/* jnt */;
  }

  @yet
  public void ko(zb var1) {
    if (null /* jnt:encrypted */ == null
      && null /* jnt:encrypted */
        )
        != null) {
      null /* jnt:encrypted */;
    }

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
  public void zn(jqs var1) {
    if (/* jnt */
      ),
      null /* jnt:encrypted */
    )) {
      long var2 = /* jnt */
      );
      if (/* jnt */,
        /* jnt */
      )) {
        class_243 var4 = /* jnt */
        );
        Iterator var5 = /* jnt *//* jnt */,
              /* jnt */
            )
          )
        );

        while (/* jnt */) {
          Set var6 = (Set)/* jnt */;
          /* jnt */;
        }
      }
    }
  }

  public void bet() {
    int var3 = 1822653444;
    if (null /* jnt:encrypted */
      )
      != null) {
      Iterator var1 = /* jnt */
      );

      label26:
      while (true) {
        var3 = (-433293958 * 1705357076 | -967216089) & -807403801;

        while (true) {
          switch ((var3 ^ 492451854 ^ 1606373903 ^ 1351566137) + 762346697 - 425662538 ^ 42772298) {
            case -204872876:
              if (/* jnt */) {
                class_2818 var2 = (ClientWorld)/* jnt */;
                /* jnt */;
                continue label26;
              }

              var3 = (-67117821 << -1778258621 | 537149091) & 713867239;
              break;
            case 1316707152:
            default:
              return;
          }
        }
      }
    }
  }

  public void vlp(class_2791 var1) {
    int var24 = 117863070;
    if (null /* jnt:encrypted */ != null) {
      class_1923 var2 = /* jnt */;
      long var3 = /* jnt */;
      class_638 var5 = null /* jnt:encrypted */
      );
      if (!/* jnt */,
          /* jnt */
        )
        && var5 != null) {
        var24 = 811829140 + 811829140 ^ 2128960;
      } else {
        var24 = 1432105164 >>> -1711256077 + -1331538282 ^ -835565254;
      }

      switch (((var24 ^ 1769954584) + 1193916445 ^ 561690846) - 1722352173 - 1076917357 + 1839425596) {
        case -1766474709:
          return;
        case 948260853:
        default:
          HashSet var6 = (HashSet)/* jnt */;
          /* jnt */,
            (Consumer<class_1923>)var2x -> {
              int var8x = 1613514786;
              class_2791 var3x = /* jnt */,
                null /* jnt:encrypted */,
                null /* jnt:encrypted */,
                false
              );
              if (var3x != null) {
                class_2826[] var4 = /* jnt */;
                int var5x = var4.length;
                int var6x = 0;

                while (true) {
                  var8x = 1330556949 + -1226870824 ^ 665762870;

                  while (true) {
                    switch (((var8x - 194197370 ^ 837509811) - 590533024 ^ 404899687) - 277269191 + 943643701) {
                      case 1040002460:
                      default:
                        return;
                      case 1084853187:
                    }

                    if (var6x < var5x) {
                      class_2826 var7x = var4[var6x];
                      /* jnt */,
                        (Consumer<class_6880>)var1xx -> /* jnt *//* jnt */
                            )
                          )
                      );
                      var6x++;
                      break;
                    }

                    var8x = (1793388513 * (-50685340 << -736862365) | 201621972) & 1279755741;
                  }
                }
              }
            }
          );
          Set var7 = (Set)/* jnt */,
              (Function<class_5321, Stream>)var1x -> /* jnt */
                )
            ),
            /* jnt */
          );
          int var8 = null /* jnt:encrypted */ << 4;
          int var9 = null /* jnt:encrypted */ << 4;
          class_2919 var10 = (class_2919)/* jnt */,
              0L
            )
          );
          long var11 = /* jnt */;
          HashMap var13 = (HashMap)/* jnt */;
          Iterator var14 = /* jnt */;

          label82:
          while (true) {
            var24 = (1292695820 - (316673658 >>> 1292695820 + 316673658) | 875201644) & 926582381;

            while (true) {
              switch ((var24 + 1647061389 - 919785406 - 2040059066 ^ 1713471761 ^ 510080955) + 1718687260) {
                case 69129540:
                default:
                  if (/* jnt */) {
                    li var15 = (li)/* jnt */;
                    HashSet var16 = (HashSet)/* jnt */;
                    /* jnt */, null /* jnt:encrypted */
                    );
                    int var17 = /* jnt */, var10
                    );
                    int var18 = 0;

                    while (true) {
                      var24 = -2129362891 >> -2129362891 ^ 35027756;

                      label76:
                      while (true) {
                        switch ((var24 + 1904994939 - 1849912214 ^ 1758187909) + 1231405799 - 2007596930 + 710439395) {
                          case -374833900:
                            int var19 = /* jnt */ + var8;
                            int var20 = /* jnt */ + var9;
                            int var21 = /* jnt */,
                              var10,
                              null /* jnt:encrypted */
                            );
                            class_2338 var22 = (BlockPos)/* jnt */;
                            class_5321 var23 = (class_5321)/* jnt */
                              )
                            );
                            if (/* jnt */, var15
                            )) {
                              var24 = -2124258967 - (1949485373 << -782363760) ^ -1425217462;

                              while (true) {
                                switch ((var24 + 200976507 ^ 2106380289) + 1786072691 + 929874323 + 276397515 ^ 1518441772) {
                                  case 205157350:
                                    /* jnt */,
                                        null /* jnt:encrypted */
                                      )
                                    );
                                    break label76;
                                  case 1334180444:
                                  default:
                                    if (null /* jnt:encrypted */) {
                                      /* jnt */
                                        )
                                      );
                                      break label76;
                                    }

                                    var24 = (-346034783 ^ -1217377745 | -2049908615) & -302909315;
                                }
                              }
                            }
                            break label76;
                          case 496069517:
                            if (!/* jnt */) {
                              /* jnt */;
                            }

                            var24 = 1427298419 >>> -1924477519 ^ 1266578933;
                            break;
                          case 572638508:
                          default:
                            continue label82;
                          case 1712229588:
                            if (var18 < var17) {
                              if (null /* jnt:encrypted */ != 1.0F
                                && /* jnt */
                                  >= 1.0F / null /* jnt:encrypted */) {
                                break label76;
                              }

                              var24 = 1969174891 << 1969174891 ^ 2076495716;
                            } else {
                              var24 = -1402745958 - -1402745958 ^ 1181673691;
                            }
                        }
                      }

                      var18++;
                    }
                  }

                  var24 = -288558675 - 202764128 ^ 556431200;
                  break;
                case 1938580228:
                  /* jnt */,
                    /* jnt */,
                    var13
                  );
                  return;
              }
            }
          }
      }
    }
  }

  public List sco(class_5321 var1) {
    int var2 = 387020669;
    if (null /* jnt:encrypted */ == null) {
      null /* jnt:encrypted */;
    }

    var2 = -2002319913 ^ -2002319913 ^ 1734537289;

    while (true) {
      switch (var2 + 736452074 ^ 1726692893 ^ 1043295895 ^ 413828222 ^ 385878167 ^ 1149871899) {
        case -2136001205:
          if (/* jnt */, var1
          )) {
            return (List)/* jnt */, var1
            );
          }

          var2 = 551131419 & 551131419 >>> 1419323851 ^ 1806695246;
          break;
        case -2072888513:
        default:
          return (List)/* jnt */
                )
              )
            )
          );
      }
    }
  }

  public ArrayList bil(class_638 var1, class_2919 var2, class_2338 var3, int var4, float var5) {
    int var28 = 432591800;
    float var6 = /* jnt */ * (float) Math.PI;
    float var7 = (float)var4 / 8.0F;
    int var8 = /* jnt */var4 / 16.0F * 2.0F + 1.0F) / 2.0F);
    double var9 = (double)/* jnt */
      + /* jnt */var6) * (double)var7;
    double var11 = (double)/* jnt */
      - /* jnt */var6) * (double)var7;
    double var13 = (double)/* jnt */
      + /* jnt */var6) * (double)var7;
    double var15 = (double)/* jnt */
      - /* jnt */var6) * (double)var7;
    double var17 = (double)(
      /* jnt */
        + /* jnt */
        - 2
    );
    double var19 = (double)(
      /* jnt */
        + /* jnt */
        - 2
    );
    int var21 = /* jnt */
      - /* jnt */
      - var8;
    int var22 = /* jnt */ - 2 - var8;
    int var23 = /* jnt */
      - /* jnt */
      - var8;
    int var24 = 2 * (/* jnt */ + var8);
    int var25 = 2 * (2 + var8);
    int var26 = var21;

    label45:
    while (true) {
      var28 = (153039464 >> 1820276060 | -1427723443) & -286266547;

      while (true) {
        switch ((var28 ^ 1924898387 ^ 796321646 ^ 1014262803) - 1530493525 ^ 884830193 ^ 1574109881) {
          case -1925089633:
          default:
            return (ArrayList)/* jnt */;
          case 424159558:
        }

        if (var26 <= var21 + var24) {
          int var27 = var23;

          label42:
          while (true) {
            var28 = (-1347148402 | -2104134205 | -1069282736) & -244381104;

            while (true) {
              switch ((var28 + 956217759 + 1031944528 ^ 277270979) + 1727513765 + 2114518162 + 1211833826) {
                case -668571121:
                  var26++;
                  continue label45;
                case 423751719:
                  var27++;
                  continue label42;
                case 1956580373:
                default:
                  if (var27 <= var23 + var24) {
                    if (var22
                      <= /* jnt */,
                        var26,
                        var27
                      )) {
                      return /* jnt */;
                    }

                    var28 = 141949855 >> 193920239 ^ -2046829259;
                  } else {
                    var28 = -964787124 << 1635930135 ^ 1709926470;
                  }
              }
            }
          }
        }

        var28 = (-1785135683 | -681452294) ^ -1993834755;
      }
    }
  }

  public ArrayList umd(
    class_638 var1,
    class_2919 var2,
    int var3,
    double var4,
    double var6,
    double var8,
    double var10,
    double var12,
    double var14,
    int var16,
    int var17,
    int var18,
    int var19,
    int var20,
    float var21
  ) {
    int var59 = 314744770;
    BitSet var22 = (BitSet)/* jnt */;
    class_2339 var23 = (class_2339)/* jnt */;
    double[] var24 = new double[var3 * 4];
    ArrayList var25 = (ArrayList)/* jnt */;
    int var26 = 0;

    label123:
    while (true) {
      var59 = (1054893314 >> 1054893314 | 172171702) & -1169169922;

      while (true) {
        label117:
        while (true) {
          switch ((var59 - 2000325631 ^ 1129879186) + 1560975243 + 1197139419 - 946741268 - 276680998) {
            case -1813151132:
              var26 = 0;
              break label117;
            case -1084978417:
            default:
              if (var26 >= var3) {
                var59 = 1358998230 + -526470999 ^ 525879942;
                continue;
              }

              double var65 = var24[var26 * 4 + 3];
              if (!(var65 < 0.0)) {
                double var37 = var24[var26 * 4];
                double var39 = var24[var26 * 4 + 1];
                double var41 = var24[var26 * 4 + 2];
                int var43 = /* jnt */, var16
                );
                int var44 = /* jnt */, var17
                );
                int var45 = /* jnt */, var18
                );
                int var46 = /* jnt */, var43
                );
                int var47 = /* jnt */, var44
                );
                int var48 = /* jnt */, var45
                );

                for (int var49 = var43; var49 <= var46; var49++) {
                  double var50 = ((double)var49 + 0.5 - var37) / var65;
                  if (var50 * var50 < 1.0) {
                    for (int var52 = var44; var52 <= var47; var52++) {
                      double var53 = ((double)var52 + 0.5 - var39) / var65;
                      if (var50 * var50 + var53 * var53 < 1.0) {
                        for (int var55 = var45; var55 <= var48; var55++) {
                          double var56 = ((double)var55 + 0.5 - var41) / var65;
                          if (var50 * var50 + var53 * var53 + var56 * var56 < 1.0) {
                            int var58 = var49 - var16 + (var52 - var17) * var19 + (var55 - var18) * var19 * var20;
                            if (!/* jnt */) {
                              /* jnt */;
                              /* jnt */;
                              if (var52 >= -64
                                && var52 < 320
                                && /* jnt */
                                )
                                && /* jnt */) {
                                /* jnt *//* jnt */var49, (double)var52, (double)var55
                                  )
                                );
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }

              var26++;
              break;
            case -52190173:
              var26 = 0;
              break;
            case 621456168:
              if (var26 >= var3 - 1) {
                var59 = -2089406120 * 1078137684 ^ -1961577084;
                continue;
              }

              if (!(var24[var26 * 4 + 3] <= 0.0)) {
                int var64 = var26 + 1;

                label82:
                while (true) {
                  var59 = 1983578304 + 1983578304 ^ -261584403;

                  while (true) {
                    switch ((var59 + 766222775 + 1180948203 + 652027764 ^ 1410344476) - 67361219 - 130471569) {
                      case -682598837:
                      default:
                        if (var64 >= var3) {
                          break label82;
                        }

                        if (!(var24[var64 * 4 + 3] <= 0.0)) {
                          double var60 = var24[var26 * 4] - var24[var64 * 4];
                          double var61 = var24[var26 * 4 + 1] - var24[var64 * 4 + 1];
                          double var62 = var24[var26 * 4 + 2] - var24[var64 * 4 + 2];
                          double var63 = var24[var26 * 4 + 3] - var24[var64 * 4 + 3];
                          if (var63 * var63 > var60 * var60 + var61 * var61 + var62 * var62) {
                            if (var63 > 0.0) {
                              var24[var64 * 4 + 3] = -1.0;
                            } else {
                              var24[var26 * 4 + 3] = -1.0;
                            }
                          }
                        }

                        var59 = -1089173354 >>> 587865309 ^ 2009412829;
                        break;
                      case 987185822:
                        var64++;
                        continue label82;
                    }
                  }
                }
              }

              var59 = (-629919588 >> -1144308361 | -2012845784) & -863082134;
              continue;
            case 734105489:
              if (var26 < var3) {
                float var35 = (float)var26 / (float)var3;
                double var27 = /* jnt */var35, var4, var6);
                double var29 = /* jnt */var35, var12, var14);
                double var31 = /* jnt */var35, var8, var10);
                double var33 = /* jnt */ * (double)var3 / 16.0;
                double var36 = (
                    (double)(/* jnt */((float) Math.PI * var35)) + 1.0F)
                        * var33
                      + 1.0
                  )
                  / 2.0;
                var24[var26 * 4] = var27;
                var24[var26 * 4 + 1] = var29;
                var24[var26 * 4 + 2] = var31;
                var24[var26 * 4 + 3] = var36;
                var26++;
                continue label123;
              }

              var59 = 1409630764 * 1606325905 ^ -301093307;
              continue;
            case 1347264404:
              return var25;
            case 1904531431:
              var26++;
              break label117;
          }

          var59 = (-1793862520 | 2097267238) ^ 1789862622;
        }

        var59 = (18492454 - -60355830 | 33821805) & -754657553;
      }
    }
  }

  public boolean ald(class_638 var1, class_2338 var2, float var3, class_2919 var4) {
    int var9 = -381052480;
    if (var3 == 0.0F || var3 != 1.0F && /* jnt */ >= var3) {
      var9 = (1676836469 | 1022133092 + 1022133092 | -1475018622) & -1456104222;
    } else {
      var9 = (-709083593 + -709083593 | 839647513) & 1941713337;
    }

    switch (var9 + 735009907 + 803133525 - 1094622464 + 562367646 - 2069465331 ^ 340703904) {
      case -409340404:
        class_2350[] var5 = /* jnt */;
        int var6 = var5.length;
        int var7 = 0;

        label37:
        while (true) {
          var9 = (-951891308 << (175167274 >> 771240248) | -1152015724) & -1143610729;

          while (true) {
            switch (var9 + 1454486168 + 1637443616 - 1764373914 + 952453740 + 1138310251 ^ 161144240) {
              case -1903193287:
                if (var7 < var6) {
                  class_2350 var8 = var5[var7];
                  if (!/* jnt */
                        )
                      )
                    )
                    && var3 != 1.0F) {
                    return false;
                  }

                  var7++;
                  continue label37;
                }

                var9 = -1075895100 + -942962362 ^ 293934324;
                break;
              case 1752562499:
              default:
                return true;
            }
          }
        }
      case 2107540213:
      default:
        return true;
    }
  }

  public ArrayList yaw(class_638 var1, class_2919 var2, class_2338 var3, int var4) {
    int var11 = -795829689;
    ArrayList var5 = (ArrayList)/* jnt */;
    int var6 = /* jnt */;
    int var7 = 0;

    label28:
    while (true) {
      var11 = -1568135360 - 2080298357 ^ 1090092452;

      while (true) {
        switch (var11 + 294164986 - 808502362 + 468698625 + 939827100 + 463302647 - 2053550160) {
          case 1022568275:
          default:
            if (var7 < var6) {
              var4 = /* jnt */;
              int var8 = /* jnt */
                + /* jnt */;
              int var9 = /* jnt */
                + /* jnt */;
              int var10 = /* jnt */
                + /* jnt */;
              if (/* jnt *//* jnt */
                  )
                )
                && /* jnt *//* jnt */, 1.0F, var2
                )) {
                /* jnt *//* jnt */var8, (double)var9, (double)var10)
                );
              }

              var7++;
              continue label28;
            }

            var11 = 443010169 ^ -1234456610 ^ -667403230;
            break;
          case 1253530217:
            return var5;
        }
      }
    }
  }

  public int cfz(class_2919 var1, int var2) {
    return /* jnt */
            - /* jnt */
        )
        * (float)var2
    );
  }

  static {
    Loader.init(vtk.class);
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (((var10 ^ 751618141) - 1373205259 ^ 382065858 ^ 193660945) - 1321765972 - 1667031760 - 12545211 ^ 759992677) - 2108724033;
    MethodHandle var10000 = ops[(((var10 ^ 751618141) - 1373205259 ^ 382065858 ^ 193660945) - 1321765972 - 1667031760 - 12545211 ^ 759992677)
      - 2108724033
      - 170082280];
    if (ops[var10001 - 170082280] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (-934895855 & -934895855 | 0) & 339296358; var23 < var13.length(); var23 += (-234137414 ^ -1720312079 | 1) & -1803548491) {
        int var42 = var13.charAt(var23) - '3';
        char var47 = (char)(
          (
              (
                    (
                          (
                                (
                                    (((((var42 & 65532) >> 2 | var42 << 14) & 65534) >> 1 | ((var42 & 65532) >> 2 | var42 << 14) << 15) - 143 & 32768) >> 15
                                      | ((((var42 & 65532) >> 2 | var42 << 14) & 65534) >> 1 | ((var42 & 65532) >> 2 | var42 << 14) << 15) - 143 << 1
                                  )
                                  & 64512
                              )
                              >> 10
                            | (
                                (((((var42 & 65532) >> 2 | var42 << 14) & 65534) >> 1 | ((var42 & 65532) >> 2 | var42 << 14) << 15) - 143 & 32768) >> 15
                                  | ((((var42 & 65532) >> 2 | var42 << 14) & 65534) >> 1 | ((var42 & 65532) >> 2 | var42 << 14) << 15) - 143 << 1
                              )
                              << 6
                        )
                        + 238
                      & 63488
                  )
                  >> 11
                | (
                      (
                            (
                                (((((var42 & 65532) >> 2 | var42 << 14) & 65534) >> 1 | ((var42 & 65532) >> 2 | var42 << 14) << 15) - 143 & 32768) >> 15
                                  | ((((var42 & 65532) >> 2 | var42 << 14) & 65534) >> 1 | ((var42 & 65532) >> 2 | var42 << 14) << 15) - 143 << 1
                              )
                              & 64512
                          )
                          >> 10
                        | (
                            (((((var42 & 65532) >> 2 | var42 << 14) & 65534) >> 1 | ((var42 & 65532) >> 2 | var42 << 14) << 15) - 143 & 32768) >> 15
                              | ((((var42 & 65532) >> 2 | var42 << 14) & 65534) >> 1 | ((var42 & 65532) >> 2 | var42 << 14) << 15) - 143 << 1
                          )
                          << 6
                    )
                    + 238
                  << 5
            )
            ^ 37
            ^ 128
        );
        var13.setCharAt(
          var23,
          (char)(
            (
                (
                      (
                            (
                                  (
                                      (((((var42 & 65532) >> 2 | var42 << 14) & 65534) >> 1 | ((var42 & 65532) >> 2 | var42 << 14) << 15) - 143 & 32768) >> 15
                                        | ((((var42 & 65532) >> 2 | var42 << 14) & 65534) >> 1 | ((var42 & 65532) >> 2 | var42 << 14) << 15) - 143 << 1
                                    )
                                    & 64512
                                )
                                >> 10
                              | (
                                  (((((var42 & 65532) >> 2 | var42 << 14) & 65534) >> 1 | ((var42 & 65532) >> 2 | var42 << 14) << 15) - 143 & 32768) >> 15
                                    | ((((var42 & 65532) >> 2 | var42 << 14) & 65534) >> 1 | ((var42 & 65532) >> 2 | var42 << 14) << 15) - 143 << 1
                                )
                                << 6
                          )
                          + 238
                        & 63488
                    )
                    >> 11
                  | (
                        (
                              (
                                  (((((var42 & 65532) >> 2 | var42 << 14) & 65534) >> 1 | ((var42 & 65532) >> 2 | var42 << 14) << 15) - 143 & 32768) >> 15
                                    | ((((var42 & 65532) >> 2 | var42 << 14) & 65534) >> 1 | ((var42 & 65532) >> 2 | var42 << 14) << 15) - 143 << 1
                                )
                                & 64512
                            )
                            >> 10
                          | (
                              (((((var42 & 65532) >> 2 | var42 << 14) & 65534) >> 1 | ((var42 & 65532) >> 2 | var42 << 14) << 15) - 143 & 32768) >> 15
                                | ((((var42 & 65532) >> 2 | var42 << 14) & 65534) >> 1 | ((var42 & 65532) >> 2 | var42 << 14) << 15) - 143 << 1
                            )
                            << 6
                      )
                      + 238
                    << 5
              )
              ^ 37
              ^ 128
          )
        );
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = 606529617 ^ 1565627321 ^ 2037873640; var29 < var16.length(); var29 += (1928885631 - 1928885631 | 1) & 2034563419) {
        int var52 = var16.charAt(var29) + 29 - 201 - 161 + 91;
        int var87 = (var52 & 65535) >> 0;
        int var53 = (((var52 & 65535) >> 0 | var52 << 16) ^ 88) - 26;
        int var88 = ((((var52 & 65535) >> 0 | var52 << 16) ^ 88) - 26 & 65535) >> 0;
        char var54 = (char)(((((var87 | var52 << 16) ^ 88) - 26 & 65535) >> 0 | (((var52 & 65535) >> 0 | var52 << 16) ^ 88) - 26 << 16) - 237 - 140);
        var16.setCharAt(var29, (char)((var88 | var53 << 16) - 237 - 140));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), vtk.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (745174911 * -2001796617 | 0) & -1867770832;
        var35 < var19.length();
        var35 += (1836146737 + (2134687376 >>> 2134687376) | 0) & -2138955647
      ) {
        int var59 = (var19.charAt(var35) ^ '/') + 197 - 228;
        int var89 = (var59 & 57344) >> 13;
        int var60 = (var59 & 57344) >> 13 | var59 << 3;
        int var90 = (((var59 & 57344) >> 13 | var59 << 3) & 65408) >> 7;
        var59 = (((var89 | var59 << 3) & 65408) >> 7 | ((var59 & 57344) >> 13 | var59 << 3) << 9) - 115 - 53 ^ 211;
        var89 = (((var90 | var60 << 9) - 115 - 53 ^ 211) & 0) >> 16;
        int var62 = (((var90 | var60 << 9) - 115 - 53 ^ 211) & 0) >> 16 | var59 << 0;
        int var92 = (((((var90 | var60 << 9) - 115 - 53 ^ 211) & 0) >> 16 | var59 << 0) & 65528) >> 3;
        char var63 = (char)(((var89 | var59 << 0) & 65528) >> 3 | ((((var90 | var60 << 9) - 115 - 53 ^ 211) & 0) >> 16 | var59 << 0) << 13);
        var19.setCharAt(var35, (char)(var92 | var62 << 13));
      }

      Class var7 = Class.forName(var19.toString(), false, vtk.class.getClassLoader());
      switch (((var4 + 1086143824 + 1937103862 ^ 1757707019) - 1344458860 + 422335845 ^ 1316598197 ^ 1422657961) + 1648885885 - 1592984081 ^ 1549695992) {
        case 130903927:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 296601488:
        case 568527123:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1310521676:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 2054277379:
          var10000 = var0.findSpecial(var7, var5, var6, vtk.class);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    ops[(((var10 ^ 751618141) - 1373205259 ^ 382065858 ^ 193660945) - 1321765972 - 1667031760 - 12545211 ^ 759992677) - 2108724033 - 170082280] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 - 336067338 + 160188798 ^ 1291101361) - 503170369 - 2070880025 ^ 1120697950) - 1186285594 - 950462234 + 1856506364;
    MethodHandle var10000 = ops[((var10 - 336067338 + 160188798 ^ 1291101361) - 503170369 - 2070880025 ^ 1120697950)
      - 1186285594
      - 950462234
      + 1856506364
      - 1239748034];
    if (ops[var10001 - 1239748034] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (1625119899 + 1625119899 | 0) & 1044464640; var24 < var14.length(); var24 += 855140972 >>> 855140972 ^ 208775) {
        int var43 = var14.charAt(var24) - 160 - 59;
        int var10004 = (var43 & 65520) >> 4;
        int var44 = (((var43 & 65520) >> 4 | var43 << 12) ^ 39 ^ 5) - 254;
        int var84 = ((((var43 & 65520) >> 4 | var43 << 12) ^ 39 ^ 5) - 254 & 49152) >> 14;
        var43 = (((var10004 | var43 << 12) ^ 39 ^ 5) - 254 & 49152) >> 14 | (((var43 & 65520) >> 4 | var43 << 12) ^ 39 ^ 5) - 254 << 2;
        var10004 = ((var84 | var44 << 2) & 61440) >> 12;
        int var46 = (((var84 | var44 << 2) & 61440) >> 12 | var43 << 4) - 185;
        int var86 = ((((var84 | var44 << 2) & 61440) >> 12 | var43 << 4) - 185 & 65528) >> 3;
        char var47 = (char)(((var10004 | var43 << 4) - 185 & 65528) >> 3 | (((var84 | var44 << 2) & 61440) >> 12 | var43 << 4) - 185 << 13);
        var14.setCharAt(var24, (char)(var86 | var46 << 13));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = -89248371 & -683605577 >> 1228653460 ^ -89248508; var30 < var17.length(); var30 += (1735225970 << -1675272228 | 1) & 1504643171) {
        int var52 = var17.charAt(var30) ^ 'M';
        int var87 = (var52 & 63488) >> 11;
        int var53 = ((var52 & 63488) >> 11 | var52 << 5) ^ 144;
        int var88 = ((((var52 & 63488) >> 11 | var52 << 5) ^ 144) & 65535) >> 0;
        var52 = (((var87 | var52 << 5) ^ 144) & 65535) >> 0 | (((var52 & 63488) >> 11 | var52 << 5) ^ 144) << 16;
        var87 = ((var88 | var53 << 16) & 65472) >> 6;
        int var55 = ((var88 | var53 << 16) & 65472) >> 6 | var52 << 10;
        int var90 = ((((var88 | var53 << 16) & 65472) >> 6 | var52 << 10) & 65408) >> 7;
        var52 = (((var87 | var52 << 10) & 65408) >> 7 | (((var88 | var53 << 16) & 65472) >> 6 | var52 << 10) << 9) ^ 220;
        var87 = (((var90 | var55 << 9) ^ 220) & 57344) >> 13;
        int var57 = (((var90 | var55 << 9) ^ 220) & 57344) >> 13 | var52 << 3;
        int var92 = (((((var90 | var55 << 9) ^ 220) & 57344) >> 13 | var52 << 3) & 65534) >> 1;
        char var58 = (char)((((var87 | var52 << 3) & 65534) >> 1 | ((((var90 | var55 << 9) ^ 220) & 57344) >> 13 | var52 << 3) << 15) + 160);
        var17.setCharAt(var30, (char)((var92 | var57 << 15) + 160));
      }

      Class var6 = Class.forName(var17.toString(), false, vtk.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = -551733481 & -98285271 ^ -637271807; var36 < var20.length(); var36 += (1817799185 * (-927073746 & -449859284) | 1) & -2137451519) {
        int var63 = ((var20.charAt(var36) ^ 247 ^ 219) + 221 - 246 ^ 91) - 6;
        char var64 = (char)(((var63 & 63488) >> 11 | var63 << 5) - 119 + 32 ^ 251);
        var20.setCharAt(var36, (char)(((var63 & 63488) >> 11 | var63 << 5) - 119 + 32 ^ 251));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), vtk.class.getClassLoader()).returnType();
      switch ((var4 - 1612233556 + 1187582650 + 420112672 + 1450374367 + 1616644365 ^ 770430473 ^ 1546219907) + 705645123 ^ 17222683 ^ 1051660349) {
        case 780507720:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 827817020:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1294131729:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1735297200:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      ops[((var10 - 336067338 + 160188798 ^ 1291101361) - 503170369 - 2070880025 ^ 1120697950) - 1186285594 - 950462234 + 1856506364 - 1239748034] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }

  public static native void guard();
}
