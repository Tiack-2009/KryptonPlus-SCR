// Status: PARTIAL - JNT native encryption (strings in jnt.so)


import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import net.minecraft.PlayerEntity;
import net.minecraft.BlockState;
import net.minecraft.BlockPos;
import net.minecraft.BlockState;
import net.minecraft.ClientWorld;
import net.minecraft.class_2826;
import net.minecraft.class_2874;

public class kx extends np {
  public rt eg;
  public kc wf;
  public ws sq;
  public Map iu;
  public Set js;
  public ExecutorService kk;
  public class_2874 qp;
  // [JNT] MethodHandle dispatch table (removed)
  public kx() {
    int var10001 = -857796199 >>> 1891451085 ^ 419576;

    StringBuilder var10002;
    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < (-1135993501 + 2058161266 ^ 922167772);
      var10001 += (-1787666988 << -1787666988 | 1) & 574356969
    ) {
      int var21 = /* jnt */;
      int var10005 = (var21 & 63488) >> 11;
      int var22 = (var21 & 63488) >> 11 | var21 << 5;
      int var68 = (((var21 & 63488) >> 11 | var21 << 5) & 65535) >> 0;
      var21 = ((var10005 | var21 << 5) & 65535) >> 0 | ((var21 & 63488) >> 11 | var21 << 5) << 16;
      var10005 = ((var68 | var22 << 16) & 65528) >> 3;
      int var24 = ((var68 | var22 << 16) & 65528) >> 3 | var21 << 13;
      int var70 = ((((var68 | var22 << 16) & 65528) >> 3 | var21 << 13) & 64512) >> 10;
      char var25 = (char)((((var10005 | var21 << 13) & 64512) >> 10 | (((var68 | var22 << 16) & 65528) >> 3 | var21 << 13) << 6) ^ 7);
      /* jnt */((var70 | var24 << 6) ^ 7));
    }

    String var2 = /* jnt */;
    int var11 = 1153314997 ^ -1834338754 ^ -703330677;

    StringBuilder var27;
    for (var27 = (StringBuilder)/* jnt */;
      var11 < ((82375679 >>> 185580776 | 8) & -1736763860);
      var11 += (126290913 & -1907519353 | 1) & 969457021
    ) {
      char var50 = /* jnt */;
      int var10006 = (var50 & '\uffc0') >> 6;
      int var51 = ((var50 & '\uffc0') >> 6 | var50 << '\n') - 79 ^ 7 ^ 120;
      int var84 = ((((var50 & '\uffc0') >> 6 | var50 << '\n') - 79 ^ 7 ^ 120) & 65535) >> 0;
      var50 = (char)((((var10006 | var50 << '\n') - 79 ^ 7 ^ 120) & 65535) >> 0 | (((var50 & '\uffc0') >> 6 | var50 << '\n') - 79 ^ 7 ^ 120) << 16);
      /* jnt */(var84 | var51 << 16));
    }

    super(
      var2,
      /* jnt */,
      -1,
      null /* jnt:encrypted */
    );
    var10001 = (-254683400 | -98050007 | 0) & 83886340;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < (-590196254 ^ -112138163 ^ 629324202);
      var10001 += 500361439 >> -1672012911 ^ 3816
    ) {
      char var30 = /* jnt */;
      int var73 = (var30 & '￼') >> 2;
      int var31 = (var30 & '￼') >> 2 | var30 << 14;
      int var74 = (((var30 & '￼') >> 2 | var30 << 14) & 65408) >> 7;
      char var32 = (char)(((((var73 | var30 << 14) & 65408) >> 7 | ((var30 & '￼') >> 2 | var30 << 14) << 9) - 242 ^ 18) - 171);
      /* jnt */(((var74 | var31 << 9) - 242 ^ 18) - 171)
      );
    }

    this.eg = (rt)/* jnt */, 1.0, 255.0, 125.0, 1.0
    );
    var10001 = (314464902 - 314464902 | 0) & 1305386988;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((1301729341 >>> 1480144979 | 7) & 2017234959);
      var10001 += (-899515776 | 1015641106) ^ -18121069
    ) {
      int var35 = /* jnt */ - 151 ^ 126 ^ 166 ^ 59;
      char var36 = (char)((var35 & 65472) >> 6 | var35 << 10);
      /* jnt */((var35 & 65472) >> 6 | var35 << 10)
      );
    }

    kc var7 = (kc)/* jnt */, false
    );
    int var17 = (-778029694 >>> -778029694 | 0) & 160760458;

    for (var27 = (StringBuilder)/* jnt */;
      var17 < (-542210209 & 492172846 - 492172846 ^ 45);
      var17 += (331331183 << 331331183 | 1) & 67118613
    ) {
      char var58 = /* jnt */;
      char var63 = (char)(
        (
              (
                  (
                        (
                            (((((var58 & '\uf800') >> 11 | var58 << 5) & 57344) >> 13 | ((var58 & '\uf800') >> 11 | var58 << 5) << 3) & 65534) >> 1
                              | ((((var58 & '\uf800') >> 11 | var58 << 5) & 57344) >> 13 | ((var58 & '\uf800') >> 11 | var58 << 5) << 3) << 15
                          )
                          & 65528
                      )
                      >> 3
                    | (
                        (((((var58 & '\uf800') >> 11 | var58 << 5) & 57344) >> 13 | ((var58 & '\uf800') >> 11 | var58 << 5) << 3) & 65534) >> 1
                          | ((((var58 & '\uf800') >> 11 | var58 << 5) & 57344) >> 13 | ((var58 & '\uf800') >> 11 | var58 << 5) << 3) << 15
                      )
                      << 13
                )
                & 65520
            )
            >> 4
          | (
              (
                    (
                        (((((var58 & '\uf800') >> 11 | var58 << 5) & 57344) >> 13 | ((var58 & '\uf800') >> 11 | var58 << 5) << 3) & 65534) >> 1
                          | ((((var58 & '\uf800') >> 11 | var58 << 5) & 57344) >> 13 | ((var58 & '\uf800') >> 11 | var58 << 5) << 3) << 15
                      )
                      & 65528
                  )
                  >> 3
                | (
                    (((((var58 & '\uf800') >> 11 | var58 << 5) & 57344) >> 13 | ((var58 & '\uf800') >> 11 | var58 << 5) << 3) & 65534) >> 1
                      | ((((var58 & '\uf800') >> 11 | var58 << 5) & 57344) >> 13 | ((var58 & '\uf800') >> 11 | var58 << 5) << 3) << 15
                  )
                  << 13
            )
            << 12
      );
      /* jnt */(
          (
                (
                    (
                          (
                              (((((var58 & '\uf800') >> 11 | var58 << 5) & 57344) >> 13 | ((var58 & '\uf800') >> 11 | var58 << 5) << 3) & 65534) >> 1
                                | ((((var58 & '\uf800') >> 11 | var58 << 5) & 57344) >> 13 | ((var58 & '\uf800') >> 11 | var58 << 5) << 3) << 15
                            )
                            & 65528
                        )
                        >> 3
                      | (
                          (((((var58 & '\uf800') >> 11 | var58 << 5) & 57344) >> 13 | ((var58 & '\uf800') >> 11 | var58 << 5) << 3) & 65534) >> 1
                            | ((((var58 & '\uf800') >> 11 | var58 << 5) & 57344) >> 13 | ((var58 & '\uf800') >> 11 | var58 << 5) << 3) << 15
                        )
                        << 13
                  )
                  & 65520
              )
              >> 4
            | (
                (
                      (
                          (((((var58 & '\uf800') >> 11 | var58 << 5) & 57344) >> 13 | ((var58 & '\uf800') >> 11 | var58 << 5) << 3) & 65534) >> 1
                            | ((((var58 & '\uf800') >> 11 | var58 << 5) & 57344) >> 13 | ((var58 & '\uf800') >> 11 | var58 << 5) << 3) << 15
                        )
                        & 65528
                    )
                    >> 3
                  | (
                      (((((var58 & '\uf800') >> 11 | var58 << 5) & 57344) >> 13 | ((var58 & '\uf800') >> 11 | var58 << 5) << 3) & 65534) >> 1
                        | ((((var58 & '\uf800') >> 11 | var58 << 5) & 57344) >> 13 | ((var58 & '\uf800') >> 11 | var58 << 5) << 3) << 15
                    )
                    << 13
              )
              << 12
        )
      );
    }

    this.wf = /* jnt */
    );
    var10001 = (623250107 + 649319198 | 0) & -2080366586;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((-1009912785 >>> 1119023455 | 6) & -1641397738);
      var10001 += (-1968426258 >>> 288400337 | 1) & 345350177
    ) {
      char var41 = /* jnt */;
      char var44 = (char)(
        (
              (((((var41 & '\uf000') >> 12 | var41 << 4) & 65528) >> 3 | ((var41 & '\uf000') >> 12 | var41 << 4) << 13) & 57344) >> 13
                | ((((var41 & '\uf000') >> 12 | var41 << 4) & 65528) >> 3 | ((var41 & '\uf000') >> 12 | var41 << 4) << 13) << 3
            )
            - 187
          ^ 222
      );
      /* jnt */(
          (
                (((((var41 & '\uf000') >> 12 | var41 << 4) & 65528) >> 3 | ((var41 & '\uf000') >> 12 | var41 << 4) << 13) & 57344) >> 13
                  | ((((var41 & '\uf000') >> 12 | var41 << 4) & 65528) >> 3 | ((var41 & '\uf000') >> 12 | var41 << 4) << 13) << 3
              )
              - 187
            ^ 222
        )
      );
    }

    this.sq = (ws)/* jnt */
    );
    this.iu = (ConcurrentHashMap)/* jnt */;
    this.js = /* jnt */;
    /* jnt */,
        null /* jnt:encrypted */,
        null /* jnt:encrypted */
      }
    );
    /* jnt */, (Runnable)() -> {
        if (/* jnt */) {
          /* jnt */;
        }
      }
    );
  }

  @Override
  public void dz() {
    int var3 = -1921195247;
    /* jnt */;
    null /* jnt:encrypted */;
    /* jnt */);
    /* jnt */);
    if (null /* jnt:encrypted */
        )
        != null
      && null /* jnt:encrypted */
        )
        != null) {
      var3 = (458221359 >> 2045243529 | -1434385284) & -2413316;
    } else {
      var3 = (-1262772951 << 1216658856 | -1048455295) & -273295371;
    }

    switch (((var3 - 551623602 ^ 1371923787 ^ 1466409900) - 159840182 ^ 711499564) + 236771854) {
      case -1106730263:
        null /* jnt:encrypted */
          )
        );
        Iterator var1 = /* jnt */
        );

        while (true) {
          var3 = 481782803 >> 481782803 ^ 1924781519;

          while (true) {
            switch (((var3 ^ 889560512) + 835402205 ^ 301717943) + 167857617 - 1135073427 + 1356664707) {
              case -1436453707:
                return;
              case 2142429570:
            }

            if (/* jnt */) {
              class_2818 var2 = (ClientWorld)/* jnt */;
              /* jnt */;
              break;
            }

            var3 = (-1430808252 * -1430808252 | 1677730214) & 1946444262;
          }
        }
      case -149588884:
    }
  }

  @Override
  public void x() {
    /* jnt */);
    /* jnt */);
    if (null /* jnt:encrypted */ != null
      && !/* jnt */
      )) {
      /* jnt */
      );
    }

    /* jnt */;
  }

  @yet
  public void jo(by var1) {
    if (null /* jnt:encrypted */
      )
      != null) {
      class_2874 var2 = /* jnt */
        )
      );
      if (null /* jnt:encrypted */ != var2) {
        /* jnt */;
      }

      null /* jnt:encrypted */;
    }
  }

  @yet
  public void ko(zb var1) {
    class_1923 var2 = (PlayerEntity)/* jnt */
      ),
      /* jnt */
      )
    );
    class_2818 var3 = /* jnt */
      ),
      null /* jnt:encrypted */,
      null /* jnt:encrypted */
    );
    /* jnt */;
  }
  @yet
  public void zn(jqs var1) {
    int var10 = 668409924;
    Set var2 = /* jnt */);
    if (!/* jnt */) {
      int var3 = /* jnt */
      );
      int var4 = /* jnt */
      );
      int var5 = /* jnt */
      );
      class_2248 var6 = /* jnt */
      );
      class_2248 var7 = /* jnt */
      );
      boolean var8 = /* jnt */
        && !/* jnt */;
      boolean var9 = !var8
        && !/* jnt */
        && /* jnt */;
      if (!var8) {
        if (var9) {
          var10 = (-4040515 + -1933690345 | 58331177) & 1945867309;
        } else {
          var10 = (1004464481 << -1279750667 | -1072328324) & -132138626;
        }
      } else {
        var10 = (-4040515 + -1933690345 | 58331177) & 1945867309;
      }

      while (true) {
        switch (var10 + 608687552 - 987185315 - 1606382 + 1839595308 - 2123410839 - 1075961267) {
          case -2141120627:
          default:
            return;
          case -1673128386:
            /* jnt */,
              (Runnable)() -> {
                int var12 = 937782321;
                class_2338 var6x = (BlockPos)/* jnt */;
                if (var8) {
                  /* jnt */, var6x, var7
                  );
                  var12 = 544300119 * -39489252 ^ -371477919;
                } else {
                  var12 = -77146429 << -1620519800 ^ 1628093827;
                }

                while (true) {
                  switch (var12 - 1748561256 + 494933297 + 313444629 + 2070357364 - 1296334542 + 1736066951) {
                    case 1517490672:
                    default:
                      int var7x = -1;

                      label79:
                      while (true) {
                        var12 = 1844558448 ^ 1473598995 ^ -1293557334;

                        while (true) {
                          switch ((var12 ^ 292329130) - 1528268628 - 1768172472 - 2047569512 + 300863510 ^ 1455082512) {
                            case 450311882:
                              return;
                            case 1001358869:
                          }

                          if (var7x <= 1) {
                            int var8x = -1;

                            label76:
                            while (true) {
                              var12 = (-1491237826 | 571631631 | 1076435654) & 1554743015;

                              while (true) {
                                switch (((var12 ^ 931477090) - 1739397502 ^ 698757270) + 1924228171 - 1538958517 ^ 1567234575) {
                                  case -46979496:
                                  default:
                                    var7x++;
                                    continue label79;
                                  case 1643627816:
                                }

                                if (var8x <= 1) {
                                  int var9x = -1;

                                  while (true) {
                                    var12 = -2078436454 >>> 1230605064 ^ -1147459955;

                                    label70:
                                    while (true) {
                                      switch (var12 - 1200150354 - 1149294183 - 40564573 + 1575411826 - 1453274039 - 1164200494) {
                                        case -292685675:
                                        default:
                                          if (var9x <= 1) {
                                            if (var7x == 0 && var8x == 0 && var9x == 0) {
                                              break label70;
                                            }

                                            var12 = (1484457349 | -1356129043 | 1091965538) & 1096725095;
                                          } else {
                                            var12 = (1202769180 | -1007254465 | 21540912) & 293385331;
                                          }
                                          break;
                                        case 887845290:
                                          var8x++;
                                          continue label76;
                                        case 1959579614:
                                          class_2338 var10x = (BlockPos)/* jnt */;
                                          if (/* jnt */, var10x
                                          )) {
                                            class_2248 var11x = (BlockState)/* jnt */, var10x
                                            );
                                            /* jnt */, var10x, var11x
                                            );
                                          }
                                          break label70;
                                      }
                                    }

                                    var9x++;
                                  }
                                }

                                var12 = (-1110555496 << -546871524 | 1072976823) & 1073119223;
                              }
                            }
                          }

                          var12 = (1117863124 ^ -552597537 >>> 1117863124 | 675990162) & -395650350;
                        }
                      }
                    case 1701797262:
                      /* jnt */, var6x
                      );
                  }

                  var12 = 544300119 * -39489252 ^ -371477919;
                }
              }
            );
        }

        var10 = (1004464481 << -1279750667 | -1072328324) & -132138626;
      }
    }
  }

  @yet
  public void vf(lf var1) {
    /* jnt */;
  }

  public void rqk(class_2818 var1) {
    /* jnt */,
      (Runnable)() -> {
        int var17 = -1100007761;
        if (/* jnt */) {
          Set var2 = /* jnt */
          );
          if (!/* jnt */) {
            class_1923 var3 = /* jnt */;
            /* jnt */, var3
            );
            class_2826[] var4 = /* jnt */;
            int var5 = /* jnt */;
            int var6 = /* jnt */;
            int var7 = /* jnt */;
            int var8 = 0;

            label100:
            while (true) {
              var17 = -439522984 * -439522984 ^ -1656444141;

              while (true) {
                switch ((var17 ^ 929673128) - 1588835665 - 806611163 - 2068105045 - 1673791780 + 1908496641) {
                  case -61524649:
                    if (var8 < var4.length) {
                      class_2826 var9 = var4[var8];
                      if (var9 != null && !/* jnt */) {
                        var17 = (1430135102 + -2029001252 | 1271589236) & 2078997493;
                      } else {
                        var17 = (-869473610 * -869473610 | 758448771) & 1064673931;
                      }

                      while (true) {
                        int var10;
                        int var11;
                        switch ((var17 - 1005185961 - 118562921 + 1892742689 ^ 1856612650 ^ 1755819613) + 1833014420) {
                          case -930676615:
                            var8++;
                            continue label100;
                          case -51353720:
                          default:
                            var10 = var5 + var8 << 4;
                            var11 = 0;
                        }

                        label89:
                        for (; var11 < 16; var11++) {
                          int var12 = 0;
                          var17 = -802706244 << -2025780736 ^ -651075693;

                          label86:
                          while (true) {
                            switch (((var17 ^ 604078914) + 636951909 - 467396889 ^ 624691883) - 186687578 - 945695457) {
                              case -2007741885:
                                continue label89;
                              case -829431081:
                            }

                            if (var12 < 16) {
                              int var13 = 0;
                              var17 = -2119275163 >>> -165458921 ^ -596258082;

                              while (true) {
                                switch ((var17 - 2117831791 - 823013191 - 1204346622 + 262288021 ^ 810269022) - 598675628) {
                                  case -1583365580:
                                  default:
                                    if (var13 < 16) {
                                      class_2680 var14 = /* jnt */;
                                      class_2248 var15 = /* jnt */;
                                      if (/* jnt */) {
                                        class_2338 var16 = (BlockPos)/* jnt */;
                                        /* jnt */, var16, var15
                                        );
                                      }

                                      var13++;
                                      var17 = -2119275163 >>> -165458921 ^ -596258082;
                                    } else {
                                      var17 = -186787048 << -186787048 ^ -612247588;
                                    }
                                    break;
                                  case -928266697:
                                    var12++;
                                    var17 = -802706244 << -2025780736 ^ -651075693;
                                    continue label86;
                                }
                              }
                            } else {
                              var17 = 51408583 >>> (-320851419 >> -320851419) ^ -1059952317;
                            }
                          }
                        }

                        var17 = (-869473610 * -869473610 | 758448771) & 1064673931;
                      }
                    }

                    var17 = -194798144 + 1825058186 ^ 2107175239;
                    break;
                  case 801865729:
                  default:
                    /* jnt */
                        - 1,
                      null /* jnt:encrypted */
                    );
                    /* jnt */
                        + 1,
                      null /* jnt:encrypted */
                    );
                    /* jnt */,
                      null /* jnt:encrypted */
                        - 1
                    );
                    /* jnt */,
                      null /* jnt:encrypted */
                        + 1
                    );
                    return;
                }
              }
            }
          }
        }
      }
    );
  }

  public void nd(int var1, int var2) {
    int var7 = 1454130817;
    class_1923 var3 = (PlayerEntity)/* jnt */;
    if (/* jnt */, var3
    )) {
      Iterator var4 = /* jnt */
        )
      );

      while (true) {
        var7 = -1689710989 - -468852047 ^ -1481697839;

        while (true) {
          switch (((var7 ^ 1402966648 ^ 1651734116) - 1266536366 ^ 426453732) + 358665 - 410420297) {
            case -1720618771:
              return;
            case -1273031355:
          }

          if (/* jnt */) {
            Entry var5 = (Entry)/* jnt */;
            class_2338 var6 = (BlockPos)/* jnt */;
            if (/* jnt */ >> 4 == var1
              && /* jnt */ >> 4 == var2) {
              /* jnt */,
                var6,
                (BlockState)/* jnt */
              );
            }
            break;
          }

          var7 = 1729248910 - 1729248910 ^ -974405013;
        }
      }
    }
  }

  public zn tc(class_2248 var1, int var2) {
    zn var3 = /* jnt */, var1
    );
    if (var3 != null) {
      return (zn)/* jnt */,
        null /* jnt:encrypted */,
        null /* jnt:encrypted */,
        var2
      );
    } else {
      int var4 = /* jnt */,
          var1
        )
      );
      Random var5 = (Random)/* jnt */var4);
      int var6 = 100 + /* jnt */;
      int var7 = 100 + /* jnt */;
      int var8 = 100 + /* jnt */;
      return (zn)/* jnt */;
    }
  }

  public void xn(lf var1) {
    int var14 = 887985502;
    if (null /* jnt:encrypted */
        )
        != null
      && null /* jnt:encrypted */
        )
        != null
      && !/* jnt */
      )) {
      var14 = -1718008592 >> (875552294 | -974934223) ^ -713591494;
    } else {
      var14 = (-1862376622 + 110720915 | 693124114) & 2071477298;
    }

    switch (((var14 ^ 493111058) - 1875998597 ^ 1258595209 ^ 1672198177 ^ 1728433814) + 1155761123) {
      case -862649205:
        int var2 = /* jnt */
          )
        );
        int var3 = /* jnt */
            )
          )
          >> 4;
        int var4 = /* jnt */
            )
          )
          >> 4;
        int var5 = /* jnt */);
        boolean var6 = /* jnt */);
        Iterator var7 = /* jnt */
          )
        );

        while (true) {
          var14 = -1487893311 + -889885799 ^ 1876017377;

          while (true) {
            switch ((var14 + 88016903 ^ 966982412) - 1291767510 + 404277933 + 1865454402 + 538519854) {
              case 1898736721:
              default:
                return;
              case 1976923157:
            }

            if (/* jnt */) {
              Entry var8 = (Entry)/* jnt */;
              class_2338 var9 = (BlockPos)/* jnt */;
              int var10 = /* jnt */ >> 4;
              int var11 = /* jnt */ >> 4;
              if (/* jnt */ <= var2
                && /* jnt */ <= var2) {
                class_2248 var12 = (BlockState)/* jnt */;
                zn var13 = /* jnt */;
                /* jnt */,
                  (double)/* jnt */,
                  (double)/* jnt */,
                  (double)/* jnt */,
                  (double)(/* jnt */ + 1),
                  (double)(/* jnt */ + 1),
                  (double)(/* jnt */ + 1),
                  var13,
                  var13,
                  null /* jnt:encrypted */,
                  0
                );
                if (var6) {
                  /* jnt */,
                    null /* jnt:encrypted */
                    ),
                    null /* jnt:encrypted */
                    ),
                    null /* jnt:encrypted */
                    ),
                    (double)/* jnt */ + 0.5,
                    (double)/* jnt */ + 0.5,
                    (double)/* jnt */ + 0.5,
                    /* jnt */
                  );
                }
              }
              break;
            }

            var14 = -904923578 * -904923578 ^ 1798692315;
          }
        }
      case 1051548296:
    }
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (((var10 ^ 1384277622) + 102127314 ^ 726087232) - 1877196991 + 1873977774 + 2098277656 ^ 76746188) - 1456099391 - 943022250;
    MethodHandle var10000 = wlx[(((var10 ^ 1384277622) + 102127314 ^ 726087232) - 1877196991 + 1873977774 + 2098277656 ^ 76746188) - 1456099391 - 943022250
      ^ 1096790185];
    if (wlx[var10001 ^ 1096790185] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (-201310336 & 808178263 << -201310336 | 0) & 1332207773; var23 < var13.length(); var23 += -304964099 << 807065639 ^ -380699007) {
        char var42 = var13.charAt(var23);
        char var49 = (char)(
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
                                                                    (((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4
                                                                      | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12
                                                                  )
                                                                  & 65472
                                                              )
                                                              >> 6
                                                            | ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12)
                                                              << 10
                                                        )
                                                        - 16
                                                      & 65528
                                                  )
                                                  >> 3
                                                | (
                                                      (
                                                            ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12)
                                                              & 65472
                                                          )
                                                          >> 6
                                                        | ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12)
                                                          << 10
                                                    )
                                                    - 16
                                                  << 13
                                            )
                                            & 61440
                                        )
                                        >> 12
                                      | (
                                          (
                                                (
                                                      (
                                                            ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12)
                                                              & 65472
                                                          )
                                                          >> 6
                                                        | ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12)
                                                          << 10
                                                    )
                                                    - 16
                                                  & 65528
                                              )
                                              >> 3
                                            | (
                                                  (((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) & 65472)
                                                      >> 6
                                                    | ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) << 10
                                                )
                                                - 16
                                              << 13
                                        )
                                        << 4
                                  )
                                  - 201
                                & 65520
                            )
                            >> 4
                          | (
                                (
                                      (
                                          (
                                                (
                                                      (
                                                            ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12)
                                                              & 65472
                                                          )
                                                          >> 6
                                                        | ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12)
                                                          << 10
                                                    )
                                                    - 16
                                                  & 65528
                                              )
                                              >> 3
                                            | (
                                                  (((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) & 65472)
                                                      >> 6
                                                    | ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) << 10
                                                )
                                                - 16
                                              << 13
                                        )
                                        & 61440
                                    )
                                    >> 12
                                  | (
                                      (
                                            (
                                                  (((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) & 65472)
                                                      >> 6
                                                    | ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) << 10
                                                )
                                                - 16
                                              & 65528
                                          )
                                          >> 3
                                        | (
                                              (((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) & 65472) >> 6
                                                | ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) << 10
                                            )
                                            - 16
                                          << 13
                                    )
                                    << 4
                              )
                              - 201
                            << 12
                      )
                      ^ 177
                  )
                  & 0
              )
              >> 16
            | (
                (
                    (
                          (
                                (
                                      (
                                          (
                                                (
                                                      (
                                                            ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12)
                                                              & 65472
                                                          )
                                                          >> 6
                                                        | ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12)
                                                          << 10
                                                    )
                                                    - 16
                                                  & 65528
                                              )
                                              >> 3
                                            | (
                                                  (((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) & 65472)
                                                      >> 6
                                                    | ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) << 10
                                                )
                                                - 16
                                              << 13
                                        )
                                        & 61440
                                    )
                                    >> 12
                                  | (
                                      (
                                            (
                                                  (((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) & 65472)
                                                      >> 6
                                                    | ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) << 10
                                                )
                                                - 16
                                              & 65528
                                          )
                                          >> 3
                                        | (
                                              (((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) & 65472) >> 6
                                                | ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) << 10
                                            )
                                            - 16
                                          << 13
                                    )
                                    << 4
                              )
                              - 201
                            & 65520
                        )
                        >> 4
                      | (
                            (
                                  (
                                      (
                                            (
                                                  (((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) & 65472)
                                                      >> 6
                                                    | ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) << 10
                                                )
                                                - 16
                                              & 65528
                                          )
                                          >> 3
                                        | (
                                              (((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) & 65472) >> 6
                                                | ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) << 10
                                            )
                                            - 16
                                          << 13
                                    )
                                    & 61440
                                )
                                >> 12
                              | (
                                  (
                                        (
                                              (((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) & 65472) >> 6
                                                | ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) << 10
                                            )
                                            - 16
                                          & 65528
                                      )
                                      >> 3
                                    | (
                                          (((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) & 65472) >> 6
                                            | ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) << 10
                                        )
                                        - 16
                                      << 13
                                )
                                << 4
                          )
                          - 201
                        << 12
                  )
                  ^ 177
              )
              << 0
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
                                            (
                                                (
                                                      (
                                                            (
                                                                  (
                                                                      (((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4
                                                                        | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12
                                                                    )
                                                                    & 65472
                                                                )
                                                                >> 6
                                                              | (
                                                                  (((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4
                                                                    | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12
                                                                )
                                                                << 10
                                                          )
                                                          - 16
                                                        & 65528
                                                    )
                                                    >> 3
                                                  | (
                                                        (
                                                              ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12)
                                                                & 65472
                                                            )
                                                            >> 6
                                                          | ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12)
                                                            << 10
                                                      )
                                                      - 16
                                                    << 13
                                              )
                                              & 61440
                                          )
                                          >> 12
                                        | (
                                            (
                                                  (
                                                        (
                                                              ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12)
                                                                & 65472
                                                            )
                                                            >> 6
                                                          | ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12)
                                                            << 10
                                                      )
                                                      - 16
                                                    & 65528
                                                )
                                                >> 3
                                              | (
                                                    (((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) & 65472)
                                                        >> 6
                                                      | ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12)
                                                        << 10
                                                  )
                                                  - 16
                                                << 13
                                          )
                                          << 4
                                    )
                                    - 201
                                  & 65520
                              )
                              >> 4
                            | (
                                  (
                                        (
                                            (
                                                  (
                                                        (
                                                              ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12)
                                                                & 65472
                                                            )
                                                            >> 6
                                                          | ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12)
                                                            << 10
                                                      )
                                                      - 16
                                                    & 65528
                                                )
                                                >> 3
                                              | (
                                                    (((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) & 65472)
                                                        >> 6
                                                      | ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12)
                                                        << 10
                                                  )
                                                  - 16
                                                << 13
                                          )
                                          & 61440
                                      )
                                      >> 12
                                    | (
                                        (
                                              (
                                                    (((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) & 65472)
                                                        >> 6
                                                      | ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12)
                                                        << 10
                                                  )
                                                  - 16
                                                & 65528
                                            )
                                            >> 3
                                          | (
                                                (((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) & 65472)
                                                    >> 6
                                                  | ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) << 10
                                              )
                                              - 16
                                            << 13
                                      )
                                      << 4
                                )
                                - 201
                              << 12
                        )
                        ^ 177
                    )
                    & 0
                )
                >> 16
              | (
                  (
                      (
                            (
                                  (
                                        (
                                            (
                                                  (
                                                        (
                                                              ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12)
                                                                & 65472
                                                            )
                                                            >> 6
                                                          | ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12)
                                                            << 10
                                                      )
                                                      - 16
                                                    & 65528
                                                )
                                                >> 3
                                              | (
                                                    (((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) & 65472)
                                                        >> 6
                                                      | ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12)
                                                        << 10
                                                  )
                                                  - 16
                                                << 13
                                          )
                                          & 61440
                                      )
                                      >> 12
                                    | (
                                        (
                                              (
                                                    (((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) & 65472)
                                                        >> 6
                                                      | ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12)
                                                        << 10
                                                  )
                                                  - 16
                                                & 65528
                                            )
                                            >> 3
                                          | (
                                                (((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) & 65472)
                                                    >> 6
                                                  | ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) << 10
                                              )
                                              - 16
                                            << 13
                                      )
                                      << 4
                                )
                                - 201
                              & 65520
                          )
                          >> 4
                        | (
                              (
                                    (
                                        (
                                              (
                                                    (((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) & 65472)
                                                        >> 6
                                                      | ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12)
                                                        << 10
                                                  )
                                                  - 16
                                                & 65528
                                            )
                                            >> 3
                                          | (
                                                (((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) & 65472)
                                                    >> 6
                                                  | ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) << 10
                                              )
                                              - 16
                                            << 13
                                      )
                                      & 61440
                                  )
                                  >> 12
                                | (
                                    (
                                          (
                                                (((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) & 65472)
                                                    >> 6
                                                  | ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) << 10
                                              )
                                              - 16
                                            & 65528
                                        )
                                        >> 3
                                      | (
                                            (((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) & 65472) >> 6
                                              | ((((var42 & 'ﾀ') >> 7 | var42 << '\t') & 65520) >> 4 | ((var42 & 'ﾀ') >> 7 | var42 << '\t') << 12) << 10
                                          )
                                          - 16
                                        << 13
                                  )
                                  << 4
                            )
                            - 201
                          << 12
                    )
                    ^ 177
                )
                << 0
          )
        );
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (1288790819 + -368279198 | 0) & -2013263318; var29 < var16.length(); var29 += (181799483 + 1964847884 | 0) & -2146959191) {
        int var54 = (var16.charAt(var29) + 205 ^ 45) - 35;
        int var95 = (var54 & 65408) >> 7;
        int var55 = (var54 & 65408) >> 7 | var54 << 9;
        int var96 = (((var54 & 65408) >> 7 | var54 << 9) & 61440) >> 12;
        var54 = ((var95 | var54 << 9) & 61440) >> 12 | ((var54 & 65408) >> 7 | var54 << 9) << 4;
        var95 = ((var96 | var55 << 4) & 65472) >> 6;
        int var57 = (((var96 | var55 << 4) & 65472) >> 6 | var54 << 10) ^ 19;
        int var98 = (((((var96 | var55 << 4) & 65472) >> 6 | var54 << 10) ^ 19) & 65534) >> 1;
        char var58 = (char)(((((var95 | var54 << 10) ^ 19) & 65534) >> 1 | ((((var96 | var55 << 4) & 65472) >> 6 | var54 << 10) ^ 19) << 15) + 135 - 247);
        var16.setCharAt(var29, (char)((var98 | var57 << 15) + 135 - 247));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), kx.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = -1413742420 & 802327842 ^ 730857504; var35 < var19.length(); var35 += 378455710 >> 378455710 ^ 1) {
        int var63 = var19.charAt(var35) + '9' - 125 - 206;
        char var66 = (char)(
          ((((((var63 & 61440) >> 12 | var63 << 4) - 116 + 47 & 49152) >> 14 | ((var63 & 61440) >> 12 | var63 << 4) - 116 + 47 << 2) - 19 ^ 142) & 65528) >> 3
            | (((((var63 & 61440) >> 12 | var63 << 4) - 116 + 47 & 49152) >> 14 | ((var63 & 61440) >> 12 | var63 << 4) - 116 + 47 << 2) - 19 ^ 142) << 13
        );
        var19.setCharAt(
          var35,
          (char)(
            ((((((var63 & 61440) >> 12 | var63 << 4) - 116 + 47 & 49152) >> 14 | ((var63 & 61440) >> 12 | var63 << 4) - 116 + 47 << 2) - 19 ^ 142) & 65528)
                >> 3
              | (((((var63 & 61440) >> 12 | var63 << 4) - 116 + 47 & 49152) >> 14 | ((var63 & 61440) >> 12 | var63 << 4) - 116 + 47 << 2) - 19 ^ 142) << 13
          )
        );
      }

      Class var7 = Class.forName(var19.toString(), false, kx.class.getClassLoader());
      switch (((var4 + 764676283 ^ 1935265586) - 1078137887 ^ 202069013) + 444262317 - 49175119 - 1201436863 + 1046044006 - 1503535350 - 1972834998) {
        case 57271900:
        case 1929212887:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 372333704:
          var10000 = var0.findSpecial(var7, var5, var6, kx.class);
          break;
        case 1659857406:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 1702857953:
          var10000 = var0.findConstructor(var7, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    wlx[(((var10 ^ 1384277622) + 102127314 ^ 726087232) - 1877196991 + 1873977774 + 2098277656 ^ 76746188) - 1456099391 - 943022250 ^ 1096790185] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (((var10 - 208365726 ^ 214719132) - 1424378618 ^ 50541964) - 1910708688 - 1674827351 ^ 1391447812) - 997348597 ^ 1931229225;
    MethodHandle var10000 = wlx[(((var10 - 208365726 ^ 214719132) - 1424378618 ^ 50541964) - 1910708688 - 1674827351 ^ 1391447812) - 997348597
      ^ 1931229225
      ^ 650741627];
    if (wlx[var10001 ^ 650741627] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = 1641587321 << 125372353 ^ -1011792654; var24 < var14.length(); var24 += (-633809181 - 1178663716 * 531698254 | 1) & 236987905) {
        int var43 = var14.charAt(var24) + 171;
        char var46 = (char)(
          (
              (
                    (
                        (((((var43 & 65534) >> 1 | var43 << 15) ^ 246) - 82 - 175 ^ 84) - 115 & 65408) >> 7
                          | ((((var43 & 65534) >> 1 | var43 << 15) ^ 246) - 82 - 175 ^ 84) - 115 << 9
                      )
                      & 65535
                  )
                  >> 0
                | (
                    (((((var43 & 65534) >> 1 | var43 << 15) ^ 246) - 82 - 175 ^ 84) - 115 & 65408) >> 7
                      | ((((var43 & 65534) >> 1 | var43 << 15) ^ 246) - 82 - 175 ^ 84) - 115 << 9
                  )
                  << 16
            )
            + 235
        );
        var14.setCharAt(
          var24,
          (char)(
            (
                (
                      (
                          (((((var43 & 65534) >> 1 | var43 << 15) ^ 246) - 82 - 175 ^ 84) - 115 & 65408) >> 7
                            | ((((var43 & 65534) >> 1 | var43 << 15) ^ 246) - 82 - 175 ^ 84) - 115 << 9
                        )
                        & 65535
                    )
                    >> 0
                  | (
                      (((((var43 & 65534) >> 1 | var43 << 15) ^ 246) - 82 - 175 ^ 84) - 115 & 65408) >> 7
                        | ((((var43 & 65534) >> 1 | var43 << 15) ^ 246) - 82 - 175 ^ 84) - 115 << 9
                    )
                    << 16
              )
              + 235
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = 1904093548 * 1904093548 ^ 621004176; var30 < var17.length(); var30 += (1333462854 + -2059401542 | 1) & 574902505) {
        int var51 = var17.charAt(var30);
        int var82 = (var51 & 61440) >> 12;
        int var52 = (var51 & 61440) >> 12 | var51 << 4;
        int var83 = (((var51 & 61440) >> 12 | var51 << 4) & 65472) >> 6;
        var51 = (((var82 | var51 << 4) & 65472) >> 6 | ((var51 & 61440) >> 12 | var51 << 4) << 10) + 75;
        var82 = ((var83 | var52 << 10) + 75 & 64512) >> 10;
        int var54 = (((var83 | var52 << 10) + 75 & 64512) >> 10 | var51 << 6) - 20 - 153;
        int var85 = ((((var83 | var52 << 10) + 75 & 64512) >> 10 | var51 << 6) - 20 - 153 & 65408) >> 7;
        char var55 = (char)(
          ((((var82 | var51 << 6) - 20 - 153 & 65408) >> 7 | (((var83 | var52 << 10) + 75 & 64512) >> 10 | var51 << 6) - 20 - 153 << 9) - 9 ^ 232) - 231
        );
        var17.setCharAt(var30, (char)(((var85 | var54 << 9) - 9 ^ 232) - 231));
      }

      Class var6 = Class.forName(var17.toString(), false, kx.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = -1493696392 - (-2098333732 >>> -1364063388) ^ -1630985989; var36 < var20.length(); var36 += (602040042 + -1965809308 | 1) & 1342182673) {
        int var60 = var20.charAt(var36) - 'N' + 151;
        int var86 = (var60 & 65024) >> 9;
        int var61 = (((var60 & 65024) >> 9 | var60 << 7) ^ 211 ^ 39 ^ 96) + 176;
        int var87 = ((((var60 & 65024) >> 9 | var60 << 7) ^ 211 ^ 39 ^ 96) + 176 & 63488) >> 11;
        char var62 = (char)(
          ((((var86 | var60 << 7) ^ 211 ^ 39 ^ 96) + 176 & 63488) >> 11 | (((var60 & 65024) >> 9 | var60 << 7) ^ 211 ^ 39 ^ 96) + 176 << 5) - 211 - 183
        );
        var20.setCharAt(var36, (char)((var87 | var61 << 5) - 211 - 183));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), kx.class.getClassLoader()).returnType();
      switch (((var4 - 258183616 + 484624542 + 1437197242 ^ 1736543196) - 1351780630 + 1383098993 ^ 1531891764) - 2098189230 - 510077830 + 1650076882) {
        case 793056548:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1017154304:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1629984304:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1931038518:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      wlx[(((var10 - 208365726 ^ 214719132) - 1424378618 ^ 50541964) - 1910708688 - 1674827351 ^ 1391447812) - 997348597 ^ 1931229225 ^ 650741627] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
