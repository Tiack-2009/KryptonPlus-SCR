// Status: PARTIAL - JNT native encryption (strings in jnt.so)


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
import net.minecraft.class_5321;
import net.minecraft.class_638;
import net.minecraft.class_6880;
import net.minecraft.BlockPos.class_2339;

public class pl extends np {
  public Map nid;
  public long hb;
  public Map vf;
  public e qvi;
  public rt wjr;
  public kc dlu;
  public kc och;
  public kc wf;
  public kb auh;
  // [JNT] MethodHandle dispatch table (removed)
  public pl() {
    int var10001 = (-1694002598 << -1560428723 | 0) & 11544380;

    StringBuilder var10002;
    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((607386195 ^ -583342135 | 5) & 33964135);
      var10001 += -5586748 - -631429727 ^ 625842978
    ) {
      int var30 = /* jnt */ - 239 + 216;
      char var33 = (char)(
        (((((var30 & 65534) >> 1 | var30 << 15) & 65520) >> 4 | ((var30 & 65534) >> 1 | var30 << 15) << 12) & 65534) >> 1
          | ((((var30 & 65534) >> 1 | var30 << 15) & 65520) >> 4 | ((var30 & 65534) >> 1 | var30 << 15) << 12) << 15
      );
      /* jnt */(
          (((((var30 & 65534) >> 1 | var30 << 15) & 65520) >> 4 | ((var30 & 65534) >> 1 | var30 << 15) << 12) & 65534) >> 1
            | ((((var30 & 65534) >> 1 | var30 << 15) & 65520) >> 4 | ((var30 & 65534) >> 1 | var30 << 15) << 12) << 15
        )
      );
    }

    String var2 = /* jnt */;
    int var16 = (1964686498 & -1201366077 | 0) & 162359109;

    StringBuilder var35;
    for (var35 = (StringBuilder)/* jnt */;
      var16 < ((-632542540 ^ -1405113816 | 11) & -2013235333);
      var16 += (-2081637606 * -2081637606 | 1) & 1112539161
    ) {
      int var70 = (/* jnt */ ^ 218) - 75;
      int var10006 = (var70 & 61440) >> 12;
      int var71 = (var70 & 61440) >> 12 | var70 << 4;
      int var102 = (((var70 & 61440) >> 12 | var70 << 4) & 65535) >> 0;
      char var72 = (char)((((var10006 | var70 << 4) & 65535) >> 0 | ((var70 & 61440) >> 12 | var70 << 4) << 16) + 74);
      /* jnt */((var102 | var71 << 16) + 74));
    }

    super(
      var2,
      /* jnt */,
      -1,
      null /* jnt:encrypted */
    );
    this.nid = (ConcurrentHashMap)/* jnt */;
    var10001 = (890644786 * 204442681 | 0) & 587739485;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < (-965253477 >>> -965253477 ^ 19);
      var10001 += (596546236 * 1127483217 | 1) & 1149258371
    ) {
      char var38 = /* jnt */;
      char var41 = (char)(
        (((((var38 & '︀') >> 9 | var38 << 7) + 106 & 65534) >> 1 | ((var38 & '︀') >> 9 | var38 << 7) + 106 << 15) + 114 & 65534) >> 1
          | ((((var38 & '︀') >> 9 | var38 << 7) + 106 & 65534) >> 1 | ((var38 & '︀') >> 9 | var38 << 7) + 106 << 15) + 114 << 15
      );
      /* jnt */(
          (((((var38 & '︀') >> 9 | var38 << 7) + 106 & 65534) >> 1 | ((var38 & '︀') >> 9 | var38 << 7) + 106 << 15) + 114 & 65534) >> 1
            | ((((var38 & '︀') >> 9 | var38 << 7) + 106 & 65534) >> 1 | ((var38 & '︀') >> 9 | var38 << 7) + 106 << 15) + 114 << 15
        )
      );
    }

    this.qvi = (e)/* jnt */, ""
    );
    var10001 = -699577000 ^ -1954529027 << -24505700 ^ 105729368;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < (1760996387 - -1057167079 ^ -1476803839);
      var10001 += -847840243 & -1695372498 ^ -2005751795
    ) {
      char var44 = /* jnt */;
      int var93 = (var44 & '\uffc0') >> 6;
      int var45 = ((var44 & '\uffc0') >> 6 | var44 << '\n') + 62 ^ 33 ^ 179;
      int var94 = ((((var44 & '\uffc0') >> 6 | var44 << '\n') + 62 ^ 33 ^ 179) & 65504) >> 5;
      char var46 = (char)((((var93 | var44 << '\n') + 62 ^ 33 ^ 179) & 65504) >> 5 | (((var44 & '\uffc0') >> 6 | var44 << '\n') + 62 ^ 33 ^ 179) << 11);
      /* jnt */(var94 | var45 << 11));
    }

    this.wjr = (rt)/* jnt */, 1.0, 10.0, 5.0, 1.0
    );
    var10001 = (970342566 >> -1050121241 | 0) & -1601683134;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((-1436307705 << -1436307705 | 17) & 237522043);
      var10001 += 1381206144 & -444922764 ^ 1079181313
    ) {
      char var49 = /* jnt */;
      char var50 = (char)(((((var49 & 'ﾀ') >> 7 | var49 << '\t') ^ 140) - 203 ^ 138) + 126);
      /* jnt */(((((var49 & 'ﾀ') >> 7 | var49 << '\t') ^ 140) - 203 ^ 138) + 126)
      );
    }

    this.dlu = (kc)/* jnt */, false
    );
    var10001 = 1265448193 >> (374686215 | 374686215) ^ 9886314;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < (-1570574904 >> -161097623 ^ -3067545);
      var10001 += -210362462 & 47302232 ^ 38798849
    ) {
      char var53 = /* jnt */;
      char var54 = (char)((((var53 & 'ﰀ') >> 10 | var53 << 6) - 62 - 39 ^ 82) - 185);
      /* jnt */((((var53 & 'ﰀ') >> 10 | var53 << 6) - 62 - 39 ^ 82) - 185)
      );
    }

    this.och = (kc)/* jnt */, true
    );
    var10001 = -755172260 & -755172260 ^ -755172260;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((1308552746 | 911726983) ^ 2147483560);
      var10001 += (-1654935322 ^ -2007859330 & -1654935322 << -2007859330 | 1) & -1601942527
    ) {
      char var57 = /* jnt */;
      char var60 = (char)(
        (((((((var57 & '︀') >> 9 | var57 << 7) ^ 244) & 65528) >> 3 | (((var57 & '︀') >> 9 | var57 << 7) ^ 244) << 13) ^ 18) & 61440) >> 12
          | ((((((var57 & '︀') >> 9 | var57 << 7) ^ 244) & 65528) >> 3 | (((var57 & '︀') >> 9 | var57 << 7) ^ 244) << 13) ^ 18) << 4
      );
      /* jnt */(
          (((((((var57 & '︀') >> 9 | var57 << 7) ^ 244) & 65528) >> 3 | (((var57 & '︀') >> 9 | var57 << 7) ^ 244) << 13) ^ 18) & 61440) >> 12
            | ((((((var57 & '︀') >> 9 | var57 << 7) ^ 244) & 65528) >> 3 | (((var57 & '︀') >> 9 | var57 << 7) ^ 244) << 13) ^ 18) << 4
        )
      );
    }

    this.wf = (kc)/* jnt */, false
    );
    var10001 = -2028194450 >>> -2028194450 ^ 138352;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < (-615197641 << (-1268865937 << -1935277379) ^ -615197638);
      var10001 += (-225506367 ^ 1639797445 - 1639797445 | 1) & 74506247
    ) {
      char var63 = /* jnt */;
      int var100 = (var63 & 'ﰀ') >> 10;
      int var64 = (var63 & 'ﰀ') >> 10 | var63 << 6;
      int var101 = (((var63 & 'ﰀ') >> 10 | var63 << 6) & 57344) >> 13;
      char var65 = (char)((((var100 | var63 << 6) & 57344) >> 13 | ((var63 & 'ﰀ') >> 10 | var63 << 6) << 3) - 206 + 46 ^ 182);
      /* jnt */((var101 | var64 << 3) - 206 + 46 ^ 182));
    }

    this.auh = (kb)/* jnt */,
      (HashSet)/* jnt */
    );
    /* jnt */,
        null /* jnt:encrypted */,
        null /* jnt:encrypted */,
        null /* jnt:encrypted */,
        null /* jnt:encrypted */,
        null /* jnt:encrypted */
      }
    );
  }

  // $VF: Handled exception range with multiple entry points by splitting it
  // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
  @Override
  public void dz() {
    label41: {
      int var2 = -639412562;
      if (null /* jnt:encrypted */
          )
          != null
        && null /* jnt:encrypted */
          )
          != null) {
        try {
          var2 = 299706201 << 235036577 ^ -628760502;
        } catch (NumberFormatException var4) {
          boolean var10001 = false;
          break label41;
        }
      } else {
        var2 = -599456896 >> -1116198105 ^ 1479345710;
      }

      label31:
      while (true) {
        switch ((var2 - 1498511859 ^ 1008604060) - 1403784395 + 565555184 - 891785958 + 1339291852) {
          case -1935265884:
            try {
              null /* jnt:encrypted */
                )
              );
            } catch (NumberFormatException var3) {
              boolean var6 = false;
              break label31;
            }

            var2 = (544785866 & 544785866 >> -1933403901 | -1380709360) & -1342366640;
            break;
          case -1444316809:
          default:
            /* jnt */;
            /* jnt */;
            return;
          case 1361742476:
            var2 = 2018670669 << 2018670669 ^ 427261411;
            break;
          case 1527777973:
            /* jnt */;
            return;
        }
      }
    }

    /* jnt */;
  }

  @Override
  public void x() {
    /* jnt */);
    null /* jnt:encrypted */;
    /* jnt */;
  }

  @yet
  public void ml(lf var1) {
    int var7 = 329509974;
    if (null /* jnt:encrypted */
        )
        != null
      && null /* jnt:encrypted */ != null) {
      var7 = -741791763 & -741791763 ^ 815787999;
    } else {
      var7 = (1235134602 - 1334775411 | 3752006) & -1917239225;
    }

    switch (((var7 + 614150275 ^ 720307707) - 1235882029 ^ 1864643415) + 812588319 - 683912731) {
      case -1812181638:
      default:
        int var2 = null /* jnt:encrypted */
          )
        );
        int var3 = null /* jnt:encrypted */
          )
        );
        int var4 = /* jnt */);
        int var5 = 0;

        label59:
        while (true) {
          var7 = (1225469256 | 1225469256 | -1261104587) & -187302979;

          while (true) {
            switch ((var7 + 1660058016 + 1879324735 ^ 940473990 ^ 1660164346 ^ 1463960080) - 1587616844) {
              case 1808968996:
              default:
                if (var5 <= var4) {
                  int var6 = -var5 + var2;

                  label56:
                  while (true) {
                    var7 = 1693102402 & 1433460534 * (1693102402 << 1433460534) ^ -492496061;

                    while (true) {
                      switch ((var7 + 347544717 + 264744622 + 2095189719 ^ 1325801585) + 1233179564 ^ 1784055633) {
                        case -556650623:
                          if (var6 <= var5 + var2) {
                            /* jnt */;
                            var6++;
                            continue label56;
                          }

                          var7 = 360903057 ^ 1798394793 * 360903057 ^ -2061262754;
                          continue;
                        case 520653974:
                        default:
                          var5++;
                          continue label59;
                        case 1129742324:
                          var6 = -var5 + 1 + var2;
                          break;
                        case 1783423181:
                          if (var6 >= var5 + var2) {
                            var7 = (-1075234899 & 1716223788 >> -1193999323 | -1067831720) & -872776098;
                            continue;
                          }

                          /* jnt */;
                          var6++;
                      }

                      var7 = (786835743 * 786835743 | 1479821359) & -650126977;
                    }
                  }
                }

                var7 = -1256599539 - 2064159501 ^ -899083926;
                break;
              case 1882578393:
                return;
            }
          }
        }
      case 1533068631:
    }
  }

  public void dy(int var1, int var2, lf var3) {
    int var16 = 465942967;
    long var4 = /* jnt */;
    if (/* jnt */, /* jnt */
    )) {
      Map var6 = (Map)/* jnt */,
        /* jnt */
      );
      Iterator var7 = /* jnt */
      );

      label67:
      while (/* jnt */) {
        Entry var8 = (Entry)/* jnt */;
        li var9 = (li)/* jnt */;
        boolean var10 = false;
        Iterator var11 = /* jnt */)
        );

        label50:
        while (true) {
          var16 = (-390470331 >> -390470331 | 113394132) & 1724011509;

          while (true) {
            switch ((var16 + 1044954020 ^ 1063139937 ^ 1511904430) + 1935277881 - 1163691985 - 236429583) {
              case -533796944:
              default:
                if (/* jnt */) {
                  jzj var18 = (jzj)/* jnt */;
                  if (/* jnt */)
                    != /* jnt */)) {
                    continue label50;
                  }

                  var10 = true;
                }

                var16 = (1180053381 << -141989145 | 708913612) & -1411827218;
                continue;
              case 8157436:
                zn var17 = null /* jnt:encrypted */;
                zn var12 = (zn)/* jnt */,
                  null /* jnt:encrypted */,
                  null /* jnt:encrypted */,
                  150
                );
                Iterator var13 = /* jnt *//* jnt */
                );

                label65:
                while (true) {
                  var16 = (121690561 | 102152287 | 1516258968) & 2062112444;

                  while (true) {
                    switch (var16 + 424508292 + 434420908 ^ 808863702 ^ 2138118849 ^ 93911480 ^ 2051074827) {
                      case -1123171992:
                        if (/* jnt */) {
                          class_243 var14 = (Vec3d)/* jnt */;
                          /* jnt */,
                            null /* jnt:encrypted */,
                            null /* jnt:encrypted */,
                            null /* jnt:encrypted */,
                            null /* jnt:encrypted */ + 1.0,
                            null /* jnt:encrypted */ + 1.0,
                            null /* jnt:encrypted */ + 1.0,
                            var12,
                            var12,
                            null /* jnt:encrypted */,
                            0
                          );
                          if (/* jnt */)) {
                            zn var15 = (zn)/* jnt */,
                              null /* jnt:encrypted */,
                              null /* jnt:encrypted */,
                              255
                            );
                            /* jnt */,
                              null /* jnt:encrypted */
                              ),
                              null /* jnt:encrypted */
                              ),
                              null /* jnt:encrypted */
                              ),
                              null /* jnt:encrypted */ + 0.5,
                              null /* jnt:encrypted */ + 0.5,
                              null /* jnt:encrypted */ + 0.5,
                              var15
                            );
                          }
                          continue label65;
                        }

                        var16 = (-1588461683 << -1468228322 | -1469738782) & -1183989777;
                        break;
                      case -351762762:
                      default:
                        continue label67;
                    }
                  }
                }
              case 750772760:
            }

            if (!var10) {
              continue label67;
            }

            var16 = (-1006235968 & -1006235968 | 1200394440) & 1604169932;
          }
        }
      }
    }
  }

  @yet
  public void zn(jqs var1) {
    int var7 = -968745259;
    if (/* jnt */)
      && !/* jnt */
      )) {
      var7 = (1458830406 << 1458830406 | 873639091) & 911392435;
    } else {
      var7 = (-2133002725 >> -1555399574 | 429564292) & 972792732;
    }

    switch (((var7 - 1733857858 ^ 1585516579) + 1410230799 ^ 1879651573) + 1661468880 ^ 156804375) {
      case -254790541:
      default:
        long var2 = /* jnt *//* jnt */
          )
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

        return;
      case -99039910:
    }
  }

  public void bet() {
    int var3 = -60415182;
    if (null /* jnt:encrypted */
      )
      != null) {
      Iterator var1 = /* jnt */
      );

      label26:
      while (true) {
        var3 = 1471988942 ^ -1322877047 ^ -1892659430;

        while (true) {
          switch (((var3 ^ 1837588227) - 67797844 + 424324209 ^ 1488783245) + 1260766276 ^ 822210033) {
            case -1107855925:
            default:
              if (/* jnt */) {
                class_2818 var2 = (ClientWorld)/* jnt */;
                /* jnt */;
                continue label26;
              }

              var3 = (762244052 ^ 762244052 | -901628540) & -816906803;
              break;
            case 31440284:
              return;
          }
        }
      }
    }
  }

  public void mj() {
    null /* jnt:encrypted */;
    /* jnt */);
    if (null /* jnt:encrypted */
        )
        != null
      && null /* jnt:encrypted */ != 0L) {
      /* jnt */;
    }
  }

  @yet
  public void pra(zb var1) {
    class_2818 var2 = /* jnt */
      ),
      /* jnt */
      ),
      /* jnt */
      )
    );
    /* jnt */;
  }

  public void vlp(class_2791 var1) {
    int var24 = -98013857;
    if (null /* jnt:encrypted */ != null) {
      class_1923 var2 = /* jnt */;
      long var3 = /* jnt */;
      class_638 var5 = null /* jnt:encrypted */
      );
      if (!/* jnt */,
          /* jnt */
        )
        && var5 != null) {
        var24 = 243990328 >> 1901558600 ^ -918060049;
      } else {
        var24 = (1362046125 << 644636348 | 521351032) & 1073479547;
      }

      switch ((var24 + 1518692192 - 1721440313 - 93584651 ^ 736369701) + 950846993 ^ 957157065) {
        case -333118509:
        default:
          HashSet var6 = (HashSet)/* jnt */;
          /* jnt */,
            (Consumer<class_1923>)var2x -> {
              int var8x = 1997240091;
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
                  var8x = (-1186043341 >>> -1048260836 + -1186043341 | 1114903704) & 1274385657;

                  while (true) {
                    switch (((var8x ^ 33943760) - 218139322 + 635080971 ^ 136416970) + 541434938 + 130604456) {
                      case 1723021305:
                      default:
                        return;
                      case 2038031925:
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

                    var8x = -459526738 >> 2015254011 ^ -531546720;
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
          class_2919 var10 = (class_2919)/* jnt */, 0L
            )
          );
          long var11 = /* jnt */, var8, var9
          );
          HashMap var13 = (HashMap)/* jnt */;
          Iterator var14 = /* jnt */;

          label82:
          while (true) {
            var24 = (-536853283 << 1372848568 + 1313005861 | 1436635508) & -543040137;

            while (true) {
              switch (((var24 ^ 1555410160 ^ 274965611) + 1486592452 ^ 171751229) + 1565238444 + 710696370) {
                case -1856508737:
                  /* jnt */,
                    /* jnt */,
                    var13
                  );
                  return;
                case 2144749292:
              }

              if (/* jnt */) {
                li var15 = (li)/* jnt */;
                HashSet var16 = (HashSet)/* jnt */;
                /* jnt */, null /* jnt:encrypted */
                );
                int var17 = /* jnt */, var10
                );
                int var18 = 0;

                while (true) {
                  var24 = -562954139 & 25684877 ^ 1572396875;

                  label76:
                  while (true) {
                    switch (((var24 ^ 1205826578) + 1536634646 - 111563682 ^ 630189238 ^ 1332962527) - 234435194) {
                      case -139404225:
                        if (var18 < var17) {
                          if (null /* jnt:encrypted */ != 1.0F
                            && /* jnt */
                              >= 1.0F / null /* jnt:encrypted */) {
                            break label76;
                          }

                          var24 = (1758049350 >> 1758049350 | -1550516188) & -404919002;
                        } else {
                          var24 = -741483317 >> -1745807647 ^ 1968876580;
                        }
                        break;
                      case 134266118:
                        continue label82;
                      case 1171157321:
                      default:
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
                          var24 = (205030773 >> 366227648 | -2024531422) & -144720962;

                          while (true) {
                            switch (var24 - 1494077085 + 1460476500 + 1107965401 + 1753525821 + 989121802 ^ 375783331) {
                              case 1271900372:
                                /* jnt */,
                                    null /* jnt:encrypted */
                                  )
                                );
                                break label76;
                              case 2092591022:
                              default:
                                if (null /* jnt:encrypted */) {
                                  /* jnt */
                                    )
                                  );
                                  break label76;
                                }

                                var24 = (-438527996 >> -438527996 | 1881561632) & 2049400552;
                            }
                          }
                        }
                        break label76;
                      case 1286563636:
                        if (!/* jnt */) {
                          /* jnt */;
                        }

                        var24 = -561198334 * 416509833 ^ -976258443;
                    }
                  }

                  var18++;
                }
              }

              var24 = 1834152517 << 1834152517 ^ 1283425187;
            }
          }
        case 1714908427:
      }
    }
  }

  public List sco(class_5321 var1) {
    return /* jnt */, var1
      )
      ? (List)/* jnt */, var1
      )
      : (List)/* jnt */
            )
          )
        )
      );
  }

  public ArrayList bil(class_638 var1, class_2919 var2, class_2338 var3, int var4, float var5) {
    int var28 = 630200699;
    float var6 = /* jnt */ * (float) Math.PI;
    float var7 = (float)var4 / 8.0F;
    int var8 = /* jnt */var4 / 16.0F * 2.0F + 1.0F) / 2.0F
    );
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

    label46:
    while (true) {
      var28 = 125779784 & 125779784 + 125779784 ^ 1781743648;

      while (true) {
        switch ((var28 - 455803845 ^ 1930297764 ^ 754782844 ^ 1182625829) - 1337033782 - 1007051660) {
          case -1124847132:
          default:
            if (var26 <= var21 + var24) {
              int var27 = var23;

              label43:
              while (true) {
                var28 = (-2060861515 ^ -1976175412 - (-2060861515 & -1976175412) | -1868300288) & -1746500906;

                while (true) {
                  switch (((var28 ^ 113507173) + 1842814968 + 1267551528 ^ 826371126) + 1715326838 + 728360469) {
                    case -921551785:
                      var27++;
                      continue label43;
                    case 221397106:
                      if (var27 <= var23 + var24) {
                        if (var22
                          <= /* jnt */,
                            var26,
                            var27
                          )) {
                          return /* jnt */;
                        }

                        var28 = -1927182295 ^ -1927182295 ^ 1241810623;
                      } else {
                        var28 = -1824903553 & -317507476 ^ -1391635295;
                      }
                      break;
                    case 1722371721:
                    default:
                      var26++;
                      continue label46;
                  }
                }
              }
            }

            var28 = 1098385051 >>> 194314259 ^ 1760091736;
            break;
          case -931411571:
            return (ArrayList)/* jnt */;
        }
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
    int var60 = -1801693281;
    BitSet var22 = (BitSet)/* jnt */;
    class_2339 var23 = (class_2339)/* jnt */;
    double[] var24 = new double[var3 * 4];
    ArrayList var25 = (ArrayList)/* jnt */;
    int var26 = 0;

    label133:
    while (true) {
      var60 = (1428107577 << 1428107577 | -844479430) & -37763265;

      while (true) {
        label127:
        while (true) {
          switch ((var60 ^ 238623682 ^ 610084324 ^ 259778126) + 107368402 - 649375708 - 179894996) {
            case -1381088908:
              if (var26 < var3) {
                float var66 = (float)var26 / (float)var3;
                double var61 = /* jnt */var66, var4, var6
                );
                double var62 = /* jnt */var66, var12, var14
                );
                double var63 = /* jnt */var66, var8, var10
                );
                double var64 = /* jnt */ * (double)var3 / 16.0;
                double var36 = (
                    (double)(
                          /* jnt */((float) Math.PI * var66)
                            )
                            + 1.0F
                        )
                        * var64
                      + 1.0
                  )
                  / 2.0;
                var24[var26 * 4] = var61;
                var24[var26 * 4 + 1] = var62;
                var24[var26 * 4 + 2] = var63;
                var24[var26 * 4 + 3] = var36;
                var26++;
                continue label133;
              }

              var60 = -1214746838 ^ 1792494605 ^ -1155122566;
              continue;
            case -119421359:
              if (var26 >= var3 - 1) {
                var60 = (310905055 << 1837575628 | 23110603) & 1030667247;
                continue;
              }

              if (!(var24[var26 * 4 + 3] <= 0.0)) {
                int var65 = var26 + 1;

                label118:
                while (true) {
                  var60 = (1670121075 << -1816572272 | 1478348866) & 2082461679;

                  while (true) {
                    switch ((var60 - 804293780 + 1346632357 ^ 1305310195 ^ 881623942) + 1949186891 + 1700962772) {
                      case -557601979:
                        if (var65 >= var3) {
                          break label118;
                        }

                        if (!(var24[var65 * 4 + 3] <= 0.0)) {
                          double var27 = var24[var26 * 4] - var24[var65 * 4];
                          double var29 = var24[var26 * 4 + 1] - var24[var65 * 4 + 1];
                          double var31 = var24[var26 * 4 + 2] - var24[var65 * 4 + 2];
                          double var33 = var24[var26 * 4 + 3] - var24[var65 * 4 + 3];
                          if (var33 * var33 > var27 * var27 + var29 * var29 + var31 * var31) {
                            if (var33 > 0.0) {
                              var24[var65 * 4 + 3] = -1.0;
                            } else {
                              var24[var26 * 4 + 3] = -1.0;
                            }
                          }
                        }

                        var60 = (-559877817 >> -1522260523 | 201878570) & -309694998;
                        break;
                      case 1311573933:
                      default:
                        var65++;
                        continue label118;
                    }
                  }
                }
              }

              var60 = 1454045942 - 1454045942 ^ -2062080777;
              continue;
            case -110358331:
              var26 = 0;
              break label127;
            case -11515176:
              return var25;
            case 409953879:
            default:
              var26 = 0;
              break;
            case 1754548279:
              if (var26 >= var3) {
                var60 = (-910552244 + (-910552244 >>> 1154232744) | 222834904) & 1063026174;
                continue;
              }

              double var35 = var24[var26 * 4 + 3];
              if (!(var35 < 0.0)) {
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
                  double var50 = ((double)var49 + 0.5 - var37) / var35;
                  if (var50 * var50 < 1.0) {
                    for (int var52 = var44; var52 <= var47; var52++) {
                      double var53 = ((double)var52 + 0.5 - var39) / var35;
                      if (var50 * var50 + var53 * var53 < 1.0) {
                        for (int var55 = var45; var55 <= var48; var55++) {
                          double var56 = ((double)var55 + 0.5 - var41) / var35;
                          if (var50 * var50 + var53 * var53 + var56 * var56 < 1.0) {
                            int var58 = var49 - var16 + (var52 - var17) * var19 + (var55 - var18) * var19 * var20;
                            if (!/* jnt */) {
                              /* jnt */;
                              /* jnt */;
                              boolean var59 = !/* jnt */
                              );
                              if (var52 >= /* jnt */
                                && var52
                                  < /* jnt */
                                    + /* jnt */
                                && (
                                  var59
                                    || /* jnt */
                                    )
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
              break label127;
            case 1963041217:
              var26++;
          }

          var60 = (1207380112 | -1345250348 - -1914228306 | 75512129) & 385285447;
        }

        var60 = 1949487012 << 826203037 + 1949487012 + 826203037 ^ -1232831619;
      }
    }
  }

  public boolean ald(class_638 var1, class_2338 var2, float var3, class_2919 var4) {
    int var9 = 131895864;
    if (var3 != 0.0F && (var3 == 1.0F || !(/* jnt */ >= var3))) {
      var9 = 2135847653 >>> 2135847653 ^ -1725714048;
    } else {
      var9 = 1061053733 >>> -741032503 ^ -934320488;
    }

    switch (var9 - 312295899 + 1875855362 + 1133132917 - 2061270302 + 2043715478 - 1968605335) {
      case -986472812:
        class_2350[] var5 = /* jnt */;
        int var6 = var5.length;
        int var7 = 0;

        while (true) {
          var9 = -1742941333 >> 501864267 ^ -1184063580;

          while (true) {
            switch ((var9 - 270551877 - 933046036 ^ 921625989 ^ 1257657435) - 1893502450 ^ 1232700689) {
              case -340320402:
              default:
                return true;
              case 1533513560:
            }

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
              break;
            }

            var9 = -345494772 & -345494772 >> -345494772 ^ 1545154056;
          }
        }
      case -223685081:
      default:
        return true;
    }
  }
  public ArrayList yaw(class_638 var1, class_2919 var2, class_2338 var3, int var4) {
    int var12 = 1917015067;
    ArrayList var5 = (ArrayList)/* jnt */;
    int var6 = /* jnt */;
    int var7 = 0;

    label45:
    while (true) {
      var12 = (-2096385871 | 425500916 | -58563584) & -58563027;

      while (true) {
        switch (var12 - 446151163 + 1562996900 - 866136310 + 627819301 + 322993546 + 1813244936) {
          case -1338763633:
            if (var7 < var6) {
              var4 = /* jnt */;
              int var8 = /* jnt */
                + /* jnt */;
              int var9 = /* jnt */
                + /* jnt */;
              int var10 = /* jnt */
                + /* jnt */;
              boolean var11 = !/* jnt */);
              if (!var11) {
                if (/* jnt *//* jnt */
                  )
                )) {
                  var12 = 870356171 & 870356171 >>> 870356171 ^ -1864509689;
                } else {
                  var12 = (604383075 ^ 565786111 | -805171455) & -109641869;
                }
              } else {
                var12 = 870356171 & 870356171 >>> 870356171 ^ -1864509689;
              }

              while (true) {
                switch ((var12 ^ 849145911) + 1991496021 + 1508944707 + 1509764362 + 1381030957 + 1089542749) {
                  case -1584492718:
                    var7++;
                    continue label45;
                  case 1613026142:
                  default:
                    if (/* jnt *//* jnt */,
                      1.0F,
                      var2
                    )) {
                      /* jnt *//* jnt */var8, (double)var9, (double)var10
                        )
                      );
                    }
                }

                var12 = (604383075 ^ 565786111 | -805171455) & -109641869;
              }
            }

            var12 = (-2110670267 >>> -392252927 | 548120217) & -185882951;
            break;
          case 341661987:
          default:
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

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 + 391715855 ^ 1994614673 ^ 215310982) - 1930760241 - 968646775 ^ 636896812) + 139127385 - 1257620958 + 1703596090;
    MethodHandle var10000 = uig[((var10 + 391715855 ^ 1994614673 ^ 215310982) - 1930760241 - 968646775 ^ 636896812)
      + 139127385
      - 1257620958
      + 1703596090
      + 2098210826];
    if (uig[var10001 + 2098210826] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (-1874561597 >>> -1724303981 | 0) & -1099428607; var23 < var13.length(); var23 += (-227663132 & 1011843645 | 1) & -1013953135) {
        int var42 = var13.charAt(var23);
        int var10004 = (var42 & 49152) >> 14;
        int var43 = ((var42 & 49152) >> 14 | var42 << 2) + 226;
        int var87 = (((var42 & 49152) >> 14 | var42 << 2) + 226 & 65528) >> 3;
        var42 = (((var10004 | var42 << 2) + 226 & 65528) >> 3 | ((var42 & 49152) >> 14 | var42 << 2) + 226 << 13) + 113;
        var10004 = ((var87 | var43 << 13) + 113 & 64512) >> 10;
        int var45 = ((var87 | var43 << 13) + 113 & 64512) >> 10 | var42 << 6;
        int var89 = ((((var87 | var43 << 13) + 113 & 64512) >> 10 | var42 << 6) & 65534) >> 1;
        var42 = ((var10004 | var42 << 6) & 65534) >> 1 | (((var87 | var43 << 13) + 113 & 64512) >> 10 | var42 << 6) << 15;
        var10004 = ((var89 | var45 << 15) & 65534) >> 1;
        int var47 = (((var89 | var45 << 15) & 65534) >> 1 | var42 << 15) - 0;
        int var91 = ((((var89 | var45 << 15) & 65534) >> 1 | var42 << 15) - 0 & 65532) >> 2;
        char var48 = (char)((((var10004 | var42 << 15) - 0 & 65532) >> 2 | (((var89 | var45 << 15) & 65534) >> 1 | var42 << 15) - 0 << 14) ^ 27);
        var13.setCharAt(var23, (char)((var91 | var47 << 14) ^ 27));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = -305454723 + -622676454 ^ -928131177; var29 < var16.length(); var29 += -1343017647 + -1926164031 ^ 1025785619) {
        char var53 = var16.charAt(var29);
        char var56 = (char)(
          (
                (
                    ((((((var53 & '\uffc0') >> 6 | var53 << '\n') ^ 231) & 49152) >> 14 | (((var53 & '\uffc0') >> 6 | var53 << '\n') ^ 231) << 2) ^ 169)
                        - 135
                        + 106
                        + 96
                        - 66
                      ^ 101
                  )
                  & 57344
              )
              >> 13
            | (
                ((((((var53 & '\uffc0') >> 6 | var53 << '\n') ^ 231) & 49152) >> 14 | (((var53 & '\uffc0') >> 6 | var53 << '\n') ^ 231) << 2) ^ 169)
                    - 135
                    + 106
                    + 96
                    - 66
                  ^ 101
              )
              << 3
        );
        var16.setCharAt(
          var29,
          (char)(
            (
                  (
                      ((((((var53 & '\uffc0') >> 6 | var53 << '\n') ^ 231) & 49152) >> 14 | (((var53 & '\uffc0') >> 6 | var53 << '\n') ^ 231) << 2) ^ 169)
                          - 135
                          + 106
                          + 96
                          - 66
                        ^ 101
                    )
                    & 57344
                )
                >> 13
              | (
                  ((((((var53 & '\uffc0') >> 6 | var53 << '\n') ^ 231) & 49152) >> 14 | (((var53 & '\uffc0') >> 6 | var53 << '\n') ^ 231) << 2) ^ 169)
                      - 135
                      + 106
                      + 96
                      - 66
                    ^ 101
                )
                << 3
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), pl.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (-562549135 << -1964467828 | 0) & 1140877623; var35 < var19.length(); var35 += 1446820987 >>> 829795147 - 829795147 ^ 1446820986) {
        int var61 = var19.charAt(var35) + 200 - 33;
        int var95 = (var61 & 65528) >> 3;
        int var62 = (var61 & 65528) >> 3 | var61 << 13;
        int var96 = (((var61 & 65528) >> 3 | var61 << 13) & 65535) >> 0;
        var61 = ((var95 | var61 << 13) & 65535) >> 0 | ((var61 & 65528) >> 3 | var61 << 13) << 16;
        var95 = ((var96 | var62 << 16) & 65528) >> 3;
        int var64 = (((var96 | var62 << 16) & 65528) >> 3 | var61 << 13) - 213 - 223 - 195 + 28;
        int var98 = ((((var96 | var62 << 16) & 65528) >> 3 | var61 << 13) - 213 - 223 - 195 + 28 & 65408) >> 7;
        char var65 = (char)(
          ((var95 | var61 << 13) - 213 - 223 - 195 + 28 & 65408) >> 7 | (((var96 | var62 << 16) & 65528) >> 3 | var61 << 13) - 213 - 223 - 195 + 28 << 9
        );
        var19.setCharAt(var35, (char)(var98 | var64 << 9));
      }

      Class var7 = Class.forName(var19.toString(), false, pl.class.getClassLoader());
      switch ((var4 + 1470003887 ^ 549050510) + 1205595233 + 1244121675 + 480108659 + 1733609082 - 901703372 ^ 1690510846 ^ 859575895 ^ 325006885) {
        case 472183180:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 679343852:
        case 2049601707:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1786049969:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 2144545013:
          var10000 = var0.findSpecial(var7, var5, var6, pl.class);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    uig[((var10 + 391715855 ^ 1994614673 ^ 215310982) - 1930760241 - 968646775 ^ 636896812) + 139127385 - 1257620958 + 1703596090 + 2098210826] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (((var10 - 1645805144 + 66256954 ^ 369267064) - 1350791531 ^ 369090393) - 841074795 ^ 1280623534) - 1792305498 + 1557336078;
    MethodHandle var10000 = uig[(((var10 - 1645805144 + 66256954 ^ 369267064) - 1350791531 ^ 369090393) - 841074795 ^ 1280623534)
      - 1792305498
      + 1557336078
      - 1600356721];
    if (uig[var10001 - 1600356721] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = -1833382477 & (-1637353693 | -1833382477 + -1637353693) ^ -1843345997;
        var24 < var14.length();
        var24 += (1626372633 << -1782036714 | 1) & 413698035
      ) {
        char var43 = var14.charAt(var24);
        char var46 = (char)(
          (
                (((((var43 & '︀') >> 9 | var43 << 7) & 65408) >> 7 | ((var43 & '︀') >> 9 | var43 << 7) << 9) - 238 - 65 - 122 & 65528) >> 3
                  | ((((var43 & '︀') >> 9 | var43 << 7) & 65408) >> 7 | ((var43 & '︀') >> 9 | var43 << 7) << 9) - 238 - 65 - 122 << 13
              )
              + 54
              - 112
              - 60
            ^ 42
        );
        var14.setCharAt(
          var24,
          (char)(
            (
                  (((((var43 & '︀') >> 9 | var43 << 7) & 65408) >> 7 | ((var43 & '︀') >> 9 | var43 << 7) << 9) - 238 - 65 - 122 & 65528) >> 3
                    | ((((var43 & '︀') >> 9 | var43 << 7) & 65408) >> 7 | ((var43 & '︀') >> 9 | var43 << 7) << 9) - 238 - 65 - 122 << 13
                )
                + 54
                - 112
                - 60
              ^ 42
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (-1755638047 | -1668534129) ^ -1612761361; var30 < var17.length(); var30 += (-1756237949 & -1756237949 | 1) & 673189917) {
        int var51 = var17.charAt(var30) - 'C' ^ 186;
        char var54 = (char)(
          ((((((var51 & 65535) >> 0 | var51 << 16) & 49152) >> 14 | ((var51 & 65535) >> 0 | var51 << 16) << 2) ^ 141) + 18 + 195 - 123 - 75 & 65532) >> 2
            | (((((var51 & 65535) >> 0 | var51 << 16) & 49152) >> 14 | ((var51 & 65535) >> 0 | var51 << 16) << 2) ^ 141) + 18 + 195 - 123 - 75 << 14
        );
        var17.setCharAt(
          var30,
          (char)(
            ((((((var51 & 65535) >> 0 | var51 << 16) & 49152) >> 14 | ((var51 & 65535) >> 0 | var51 << 16) << 2) ^ 141) + 18 + 195 - 123 - 75 & 65532) >> 2
              | (((((var51 & 65535) >> 0 | var51 << 16) & 49152) >> 14 | ((var51 & 65535) >> 0 | var51 << 16) << 2) ^ 141) + 18 + 195 - 123 - 75 << 14
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, pl.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = -1437299786 >>> -1437299786 ^ 681; var36 < var20.length(); var36 += (1000910899 ^ -1736917985 + 1948518957 | 1) & 1217104129) {
        int var59 = var20.charAt(var36) + '[';
        int var91 = (var59 & 49152) >> 14;
        int var60 = ((var59 & 49152) >> 14 | var59 << 2) - 62;
        int var92 = (((var59 & 49152) >> 14 | var59 << 2) - 62 & 64512) >> 10;
        var59 = ((var91 | var59 << 2) - 62 & 64512) >> 10 | ((var59 & 49152) >> 14 | var59 << 2) - 62 << 6;
        var91 = ((var92 | var60 << 6) & 57344) >> 13;
        int var62 = ((var92 | var60 << 6) & 57344) >> 13 | var59 << 3;
        int var94 = ((((var92 | var60 << 6) & 57344) >> 13 | var59 << 3) & 61440) >> 12;
        var59 = ((var91 | var59 << 3) & 61440) >> 12 | (((var92 | var60 << 6) & 57344) >> 13 | var59 << 3) << 4;
        var91 = ((var94 | var62 << 4) & 65535) >> 0;
        int var64 = (((var94 | var62 << 4) & 65535) >> 0 | var59 << 16) ^ 33;
        int var96 = (((((var94 | var62 << 4) & 65535) >> 0 | var59 << 16) ^ 33) & 65532) >> 2;
        char var65 = (char)(((((var91 | var59 << 16) ^ 33) & 65532) >> 2 | ((((var94 | var62 << 4) & 65535) >> 0 | var59 << 16) ^ 33) << 14) + 82);
        var20.setCharAt(var36, (char)((var96 | var64 << 14) + 82));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), pl.class.getClassLoader()).returnType();
      switch (((var4 ^ 228738698) + 1337809818 - 1801924148 + 789294978 ^ 934975863 ^ 868202899) - 395114684 + 812888864 ^ 1408190641 ^ 1482681014) {
        case 700453653:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1147986728:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1372955109:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1915121013:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      uig[(((var10 - 1645805144 + 66256954 ^ 369267064) - 1350791531 ^ 369090393) - 841074795 ^ 1280623534) - 1792305498 + 1557336078 - 1600356721] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
