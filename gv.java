// Status: PARTIAL - JNT native encryption (strings in jnt.so)


import dev.krypton.mixin.ChunkLightProviderAccessor;
import dev.krypton.mixin.ChunkToNibbleArrayMapAccessor;
import dev.krypton.mixin.LightStorageAccessor;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.BlockPos;
import net.minecraft.class_2804;
import net.minecraft.class_3556;
import net.minecraft.class_3558;
import net.minecraft.class_3560;
import net.minecraft.class_4076;

public class gv extends np {
  // [JNT] MethodHandle dispatch table (removed)
  public gv() {
    int var10001 = (1085017747 & -1705603775 | 0) & 1059648286;

    StringBuilder var10002;
    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((-2047341540 | 171669028 | 0) & 1879343439);
      var10001 += (-2072956817 + -2072956817 | 1) & 1694571521
    ) {
      /* jnt */((/* jnt */ - 171 + 223 - 195 ^ 153) - 125)
      );
    }

    String var2 = /* jnt */;
    int var4 = (297686948 >> 297686948 | 0) & -557840380;

    StringBuilder var7;
    for (var7 = (StringBuilder)/* jnt */;
      var4 < (586651624 << 586651624 ^ -141039573);
      var4 += -1743802108 ^ -1743802108 ^ 1
    ) {
      /* jnt */(/* jnt */ + 212 - 29 + 203 + 113 + 31)
      );
    }

    super(
      var2,
      /* jnt */,
      -1,
      null /* jnt:encrypted */
    );
  }

  // $VF: Handled exception range with multiple entry points by splitting it
  // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
  @yet
  public void vf(lf var1) {
    Exception var10000;
    label153: {
      int var22 = -1146864638;
      if (null /* jnt:encrypted */
          )
          != null
        && null /* jnt:encrypted */
          )
          != null) {
        try {
          var22 = (-176139630 >> -1846640390 | -62699246) & -18351842;
        } catch (Exception var34) {
          var10000 = var34;
          boolean var10001 = false;
          break label153;
        }
      } else {
        var22 = (1337795899 << 2048086909 | 419018618) & -1711409282;
      }

      label135:
      switch (var22 + 43418329 - 1891410083 + 486617077 ^ 481430337 ^ 1052240703 ^ 240114027) {
        case -2121715108:
          ObjectIterator var6;
          try {
            class_3558 var2 = (class_3558)/* jnt */
                )
              ),
              null /* jnt:encrypted */
            );
            class_3560 var3 = /* jnt */var2
            );
            class_3556 var4 = /* jnt */var3
            );
            Long2ObjectOpenHashMap var5 = /* jnt */var4
            );
            var6 = /* jnt */
            );
          } catch (Exception var33) {
            var10000 = var33;
            boolean var41 = false;
            break;
          }

          label131:
          while (true) {
            try {
              var22 = (1706000012 ^ 1474567768 | 1427117324) & 1964383743;
            } catch (Exception var27) {
              var10000 = var27;
              boolean var42 = false;
              break label135;
            }

            class_2804 var10;
            int var12;
            int var13;
            int var14;
            int var15;
            while (true) {
              switch (((var22 ^ 1414051353 ^ 329125384) + 380173507 - 821220452 ^ 2036258674) + 466472360) {
                case -612092700:
                default:
                  return;
                case 2096221958:
              }

              try {
                if (/* jnt */) {
                  Entry var7 = (Entry)/* jnt */;
                  long var8 = /* jnt */;
                  var10 = (class_2804)/* jnt */;
                  if (var10 == null || /* jnt */) {
                    continue label131;
                  }

                  class_4076 var11 = /* jnt */;
                  var12 = /* jnt */;
                  var13 = /* jnt */;
                  var14 = /* jnt */;
                  var15 = 0;
                  break;
                }
              } catch (Exception var32) {
                var10000 = var32;
                boolean var43 = false;
                break label135;
              }

              var22 = 749470527 ^ 749470527 ^ -1494990850;
            }

            label119:
            while (true) {
              try {
                var22 = 970067282 >> 796230207 ^ 1144364558;
              } catch (Exception var26) {
                var10000 = var26;
                boolean var44 = false;
                break label135;
              }

              int var16;
              label89:
              while (true) {
                switch ((var22 + 1794233707 + 168050938 ^ 60239700) - 342723668 ^ 1849558409 ^ 485814575) {
                  case -729417099:
                    try {
                      if (var15 < 16) {
                        var16 = 0;
                        break label89;
                      }

                      var22 = (-1432371516 << -255839705 | 826445182) & 893566462;
                      break;
                    } catch (Exception var29) {
                      var10000 = var29;
                      boolean var45 = false;
                      break label135;
                    }
                  case -410479419:
                  default:
                    continue label131;
                }
              }

              label116:
              while (true) {
                try {
                  var22 = (115347965 + -1684538842 | 218661813) & -1650589707;
                } catch (Exception var24) {
                  var10000 = var24;
                  boolean var46 = false;
                  break label135;
                }

                int var17;
                label100:
                while (true) {
                  switch (((var22 ^ 1035572047 ^ 297315063 ^ 1649423100) - 2043433599 ^ 329286793) - 1463853435) {
                    case 60626304:
                      try {
                        if (var16 < 16) {
                          var17 = 0;
                          break label100;
                        }

                        var22 = (-944303844 << -944303844 | 1822567396) & 1840164837;
                        break;
                      } catch (Exception var30) {
                        var10000 = var30;
                        boolean var48 = false;
                        break label135;
                      }
                    case 1665509677:
                    default:
                      try {
                        var15++;
                        continue label119;
                      } catch (Exception var28) {
                        var10000 = var28;
                        boolean var47 = false;
                        break label135;
                      }
                  }
                }

                label113:
                while (true) {
                  try {
                    var22 = -1223583756 - -1730650382 ^ 1974111223;
                  } catch (Exception var23) {
                    var10000 = var23;
                    boolean var49 = false;
                    break label135;
                  }

                  while (true) {
                    switch ((var22 - 1260755322 - 1166962120 ^ 843402118 ^ 1061375070) + 68309859 - 1369214779) {
                      case -1974505325:
                        try {
                          if (var17 < 16) {
                            int var18 = /* jnt */;
                            if (var18 != 0) {
                              float var19 = (float)var18 / 15.0F;
                              zn var20 = (zn)/* jnt */;
                              class_2338 var21 = (BlockPos)/* jnt */;
                              if (/* jnt */ < -30) {
                                /* jnt */,
                                  (double)/* jnt */,
                                  (double)/* jnt */,
                                  (double)/* jnt */,
                                  (double)(/* jnt */ + 1),
                                  (double)(/* jnt */ + 1),
                                  (double)(/* jnt */ + 1),
                                  var20,
                                  var20,
                                  null /* jnt:encrypted */,
                                  0
                                );
                              }
                            }

                            var17++;
                            continue label113;
                          }

                          var22 = (50602619 >> (50602619 | 50602619) | 1602539503) & -532497;
                          break;
                        } catch (Exception var31) {
                          var10000 = var31;
                          boolean var51 = false;
                          break label135;
                        }
                      case 1984730013:
                      default:
                        try {
                          var16++;
                          continue label116;
                        } catch (Exception var25) {
                          var10000 = var25;
                          boolean var50 = false;
                          break label135;
                        }
                    }
                  }
                }
              }
            }
          }
        case -341905232:
        default:
          return;
      }
    }

    Exception var35 = var10000;
    /* jnt */;
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 ^ 1127132692 ^ 503344470) + 1401596875 - 1674139522 - 34615563 + 101984662 + 1786576906 ^ 590678795) + 640790507;
    MethodHandle var10000 = jjt[((var10 ^ 1127132692 ^ 503344470) + 1401596875 - 1674139522 - 34615563 + 101984662 + 1786576906 ^ 590678795)
      + 640790507
      - 824118475];
    if (jjt[var10001 - 824118475] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (1963632576 >>> -878629896 | 0) & 767502978; var23 < var13.length(); var23 += (-1104528711 | 784263200 & 784263200 | 0) & 16842817) {
        int var42 = var13.charAt(var23) - 18;
        int var10004 = (var42 & 65504) >> 5;
        int var43 = ((var42 & 65504) >> 5 | var42 << 11) - 97;
        int var83 = (((var42 & 65504) >> 5 | var42 << 11) - 97 & 65528) >> 3;
        var42 = (((var10004 | var42 << 11) - 97 & 65528) >> 3 | ((var42 & 65504) >> 5 | var42 << 11) - 97 << 13) ^ 193;
        var10004 = (((var83 | var43 << 13) ^ 193) & 32768) >> 15;
        int var45 = (((var83 | var43 << 13) ^ 193) & 32768) >> 15 | var42 << 1;
        int var85 = (((((var83 | var43 << 13) ^ 193) & 32768) >> 15 | var42 << 1) & 57344) >> 13;
        char var46 = (char)((((var10004 | var42 << 1) & 57344) >> 13 | ((((var83 | var43 << 13) ^ 193) & 32768) >> 15 | var42 << 1) << 3) + 157 + 205 - 204);
        var13.setCharAt(var23, (char)((var85 | var45 << 3) + 157 + 205 - 204));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = -1362060630 << -261960148 ^ 162177024; var29 < var16.length(); var29 += (873644038 - (-509623662 << 80241196) | 1) & -939254823) {
        int var51 = ((var16.charAt(var29) - 'p' ^ 237) - 107 - 128 - 67 ^ 189) - 61 - 9 - 183;
        char var52 = (char)((var51 & 57344) >> 13 | var51 << 3);
        var16.setCharAt(var29, (char)((var51 & 57344) >> 13 | var51 << 3));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), gv.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = 2060050952 & -2057678014 ^ 4735488; var35 < var19.length(); var35 += (-879484632 << 583774733 | 1) & 1531583445) {
        int var57 = var19.charAt(var35);
        int var87 = (var57 & 0) >> 16;
        int var58 = (var57 & 0) >> 16 | var57 << 0;
        int var88 = (((var57 & 0) >> 16 | var57 << 0) & 65532) >> 2;
        var57 = ((var87 | var57 << 0) & 65532) >> 2 | ((var57 & 0) >> 16 | var57 << 0) << 14;
        var87 = ((var88 | var58 << 14) & 57344) >> 13;
        int var60 = (((var88 | var58 << 14) & 57344) >> 13 | var57 << 3) + 133;
        int var90 = ((((var88 | var58 << 14) & 57344) >> 13 | var57 << 3) + 133 & 65534) >> 1;
        var57 = (((var87 | var57 << 3) + 133 & 65534) >> 1 | (((var88 | var58 << 14) & 57344) >> 13 | var57 << 3) + 133 << 15) - 21 + 95;
        var87 = ((var90 | var60 << 15) - 21 + 95 & 49152) >> 14;
        int var62 = ((var90 | var60 << 15) - 21 + 95 & 49152) >> 14 | var57 << 2;
        int var92 = ((((var90 | var60 << 15) - 21 + 95 & 49152) >> 14 | var57 << 2) & 57344) >> 13;
        char var63 = (char)((((var87 | var57 << 2) & 57344) >> 13 | (((var90 | var60 << 15) - 21 + 95 & 49152) >> 14 | var57 << 2) << 3) ^ 121);
        var19.setCharAt(var35, (char)((var92 | var62 << 3) ^ 121));
      }

      Class var7 = Class.forName(var19.toString(), false, gv.class.getClassLoader());
      switch ((((var4 + 1517783045 - 820062817 + 987154638 ^ 1667938573) + 418429158 ^ 90841833) + 1573156974 + 128446517 ^ 784823448) + 499991269) {
        case 257768309:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 823314318:
          var10000 = var0.findSpecial(var7, var5, var6, gv.class);
          break;
        case 1576020506:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 1898556399:
        case 2080007897:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    jjt[((var10 ^ 1127132692 ^ 503344470) + 1401596875 - 1674139522 - 34615563 + 101984662 + 1786576906 ^ 590678795) + 640790507 - 824118475] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (var10 ^ 152721931) + 342003089 - 969972221 - 1483308463 - 1163781312 - 2011480340 + 2039333144 + 630962105 + 495447440;
    MethodHandle var10000 = jjt[(var10 ^ 152721931) + 342003089 - 969972221 - 1483308463 - 1163781312 - 2011480340 + 2039333144 + 630962105 + 495447440
      ^ 1183928032];
    if (jjt[var10001 ^ 1183928032] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = 725636824 & (-826216733 | -496606780) ^ 708855488; var24 < var14.length(); var24 += (-961587992 * -961587992 | 1) & -293173239) {
        int var43 = var14.charAt(var24) ^ 227;
        int var10004 = (var43 & 65520) >> 4;
        int var44 = ((var43 & 65520) >> 4 | var43 << 12) - 211;
        int var96 = (((var43 & 65520) >> 4 | var43 << 12) - 211 & 65472) >> 6;
        var43 = (((var10004 | var43 << 12) - 211 & 65472) >> 6 | ((var43 & 65520) >> 4 | var43 << 12) - 211 << 10) + 79 + 28;
        var10004 = ((var96 | var44 << 10) + 79 + 28 & 65532) >> 2;
        int var46 = ((var96 | var44 << 10) + 79 + 28 & 65532) >> 2 | var43 << 14;
        int var98 = ((((var96 | var44 << 10) + 79 + 28 & 65532) >> 2 | var43 << 14) & 64512) >> 10;
        char var47 = (char)((((var10004 | var43 << 14) & 64512) >> 10 | (((var96 | var44 << 10) + 79 + 28 & 65532) >> 2 | var43 << 14) << 6) + 25 ^ 229);
        var14.setCharAt(var24, (char)((var98 | var46 << 6) + 25 ^ 229));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (1617820956 + 729676265 | 0) & 872415328; var30 < var17.length(); var30 += (710838219 << -1413433817 | 1) & -2138570225) {
        int var52 = var17.charAt(var30) + 188;
        int var99 = (var52 & 61440) >> 12;
        int var53 = (var52 & 61440) >> 12 | var52 << 4;
        int var100 = (((var52 & 61440) >> 12 | var52 << 4) & 65024) >> 9;
        var52 = (((var99 | var52 << 4) & 65024) >> 9 | ((var52 & 61440) >> 12 | var52 << 4) << 7) + 233 - 224;
        var99 = ((var100 | var53 << 7) + 233 - 224 & 65408) >> 7;
        int var55 = ((var100 | var53 << 7) + 233 - 224 & 65408) >> 7 | var52 << 9;
        int var102 = ((((var100 | var53 << 7) + 233 - 224 & 65408) >> 7 | var52 << 9) & 32768) >> 15;
        var52 = ((var99 | var52 << 9) & 32768) >> 15 | (((var100 | var53 << 7) + 233 - 224 & 65408) >> 7 | var52 << 9) << 1;
        var99 = ((var102 | var55 << 1) & 0) >> 16;
        int var57 = ((var102 | var55 << 1) & 0) >> 16 | var52 << 0;
        int var104 = ((((var102 | var55 << 1) & 0) >> 16 | var52 << 0) & 65408) >> 7;
        char var58 = (char)((((var99 | var52 << 0) & 65408) >> 7 | (((var102 | var55 << 1) & 0) >> 16 | var52 << 0) << 9) ^ 61);
        var17.setCharAt(var30, (char)((var104 | var57 << 9) ^ 61));
      }

      Class var6 = Class.forName(var17.toString(), false, gv.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = 1480843407 * (475151901 - 475151901) ^ 0; var36 < var20.length(); var36 += (455012489 | 455012489 | 0) & -991883725) {
        int var63 = var20.charAt(var36) + 23;
        char var70 = (char)(
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
                                                              ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1)
                                                                & 65528
                                                            )
                                                            >> 3
                                                          | ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1)
                                                            << 13
                                                      )
                                                      & 65532
                                                  )
                                                  >> 2
                                                | (
                                                    (((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) & 65528)
                                                        >> 3
                                                      | ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1)
                                                        << 13
                                                  )
                                                  << 14
                                            )
                                            + 39
                                          & 65408
                                      )
                                      >> 7
                                    | (
                                          (
                                                (
                                                    (((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) & 65528)
                                                        >> 3
                                                      | ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1)
                                                        << 13
                                                  )
                                                  & 65532
                                              )
                                              >> 2
                                            | (
                                                (((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) & 65528)
                                                    >> 3
                                                  | ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) << 13
                                              )
                                              << 14
                                        )
                                        + 39
                                      << 9
                                )
                                & 32768
                            )
                            >> 15
                          | (
                              (
                                    (
                                          (
                                                (
                                                    (((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) & 65528)
                                                        >> 3
                                                      | ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1)
                                                        << 13
                                                  )
                                                  & 65532
                                              )
                                              >> 2
                                            | (
                                                (((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) & 65528)
                                                    >> 3
                                                  | ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) << 13
                                              )
                                              << 14
                                        )
                                        + 39
                                      & 65408
                                  )
                                  >> 7
                                | (
                                      (
                                            (
                                                (((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) & 65528)
                                                    >> 3
                                                  | ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) << 13
                                              )
                                              & 65532
                                          )
                                          >> 2
                                        | (
                                            (((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) & 65528) >> 3
                                              | ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) << 13
                                          )
                                          << 14
                                    )
                                    + 39
                                  << 9
                            )
                            << 1
                      )
                      & 49152
                  )
                  >> 14
                | (
                    (
                          (
                              (
                                    (
                                          (
                                                (
                                                    (((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) & 65528)
                                                        >> 3
                                                      | ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1)
                                                        << 13
                                                  )
                                                  & 65532
                                              )
                                              >> 2
                                            | (
                                                (((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) & 65528)
                                                    >> 3
                                                  | ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) << 13
                                              )
                                              << 14
                                        )
                                        + 39
                                      & 65408
                                  )
                                  >> 7
                                | (
                                      (
                                            (
                                                (((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) & 65528)
                                                    >> 3
                                                  | ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) << 13
                                              )
                                              & 65532
                                          )
                                          >> 2
                                        | (
                                            (((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) & 65528) >> 3
                                              | ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) << 13
                                          )
                                          << 14
                                    )
                                    + 39
                                  << 9
                            )
                            & 32768
                        )
                        >> 15
                      | (
                          (
                                (
                                      (
                                            (
                                                (((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) & 65528)
                                                    >> 3
                                                  | ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) << 13
                                              )
                                              & 65532
                                          )
                                          >> 2
                                        | (
                                            (((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) & 65528) >> 3
                                              | ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) << 13
                                          )
                                          << 14
                                    )
                                    + 39
                                  & 65408
                              )
                              >> 7
                            | (
                                  (
                                        (
                                            (((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) & 65528) >> 3
                                              | ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) << 13
                                          )
                                          & 65532
                                      )
                                      >> 2
                                    | (
                                        (((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) & 65528) >> 3
                                          | ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) << 13
                                      )
                                      << 14
                                )
                                + 39
                              << 9
                        )
                        << 1
                  )
                  << 2
            )
            ^ 134
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
                                                                    (((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15
                                                                      | ((var63 & 65520) >> 4 | var63 << 12) << 1
                                                                  )
                                                                  & 65528
                                                              )
                                                              >> 3
                                                            | ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1)
                                                              << 13
                                                        )
                                                        & 65532
                                                    )
                                                    >> 2
                                                  | (
                                                      (
                                                            ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1)
                                                              & 65528
                                                          )
                                                          >> 3
                                                        | ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1)
                                                          << 13
                                                    )
                                                    << 14
                                              )
                                              + 39
                                            & 65408
                                        )
                                        >> 7
                                      | (
                                            (
                                                  (
                                                      (
                                                            ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1)
                                                              & 65528
                                                          )
                                                          >> 3
                                                        | ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1)
                                                          << 13
                                                    )
                                                    & 65532
                                                )
                                                >> 2
                                              | (
                                                  (((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) & 65528)
                                                      >> 3
                                                    | ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) << 13
                                                )
                                                << 14
                                          )
                                          + 39
                                        << 9
                                  )
                                  & 32768
                              )
                              >> 15
                            | (
                                (
                                      (
                                            (
                                                  (
                                                      (
                                                            ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1)
                                                              & 65528
                                                          )
                                                          >> 3
                                                        | ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1)
                                                          << 13
                                                    )
                                                    & 65532
                                                )
                                                >> 2
                                              | (
                                                  (((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) & 65528)
                                                      >> 3
                                                    | ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) << 13
                                                )
                                                << 14
                                          )
                                          + 39
                                        & 65408
                                    )
                                    >> 7
                                  | (
                                        (
                                              (
                                                  (((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) & 65528)
                                                      >> 3
                                                    | ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) << 13
                                                )
                                                & 65532
                                            )
                                            >> 2
                                          | (
                                              (((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) & 65528) >> 3
                                                | ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) << 13
                                            )
                                            << 14
                                      )
                                      + 39
                                    << 9
                              )
                              << 1
                        )
                        & 49152
                    )
                    >> 14
                  | (
                      (
                            (
                                (
                                      (
                                            (
                                                  (
                                                      (
                                                            ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1)
                                                              & 65528
                                                          )
                                                          >> 3
                                                        | ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1)
                                                          << 13
                                                    )
                                                    & 65532
                                                )
                                                >> 2
                                              | (
                                                  (((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) & 65528)
                                                      >> 3
                                                    | ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) << 13
                                                )
                                                << 14
                                          )
                                          + 39
                                        & 65408
                                    )
                                    >> 7
                                  | (
                                        (
                                              (
                                                  (((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) & 65528)
                                                      >> 3
                                                    | ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) << 13
                                                )
                                                & 65532
                                            )
                                            >> 2
                                          | (
                                              (((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) & 65528) >> 3
                                                | ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) << 13
                                            )
                                            << 14
                                      )
                                      + 39
                                    << 9
                              )
                              & 32768
                          )
                          >> 15
                        | (
                            (
                                  (
                                        (
                                              (
                                                  (((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) & 65528)
                                                      >> 3
                                                    | ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) << 13
                                                )
                                                & 65532
                                            )
                                            >> 2
                                          | (
                                              (((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) & 65528) >> 3
                                                | ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) << 13
                                            )
                                            << 14
                                      )
                                      + 39
                                    & 65408
                                )
                                >> 7
                              | (
                                    (
                                          (
                                              (((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) & 65528) >> 3
                                                | ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) << 13
                                            )
                                            & 65532
                                        )
                                        >> 2
                                      | (
                                          (((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) & 65528) >> 3
                                            | ((((var63 & 65520) >> 4 | var63 << 12) & 32768) >> 15 | ((var63 & 65520) >> 4 | var63 << 12) << 1) << 13
                                        )
                                        << 14
                                  )
                                  + 39
                                << 9
                          )
                          << 1
                    )
                    << 2
              )
              ^ 134
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), gv.class.getClassLoader()).returnType();
      switch (((var4 ^ 1831561765 ^ 1510879760) - 1674301934 - 1035168514 ^ 884655542 ^ 199937556) - 1652913407 ^ 1950379204 ^ 1869178186 ^ 56420098) {
        case 872119499:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1601343938:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1716544869:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1763867405:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      jjt[(var10 ^ 152721931) + 342003089 - 969972221 - 1483308463 - 1163781312 - 2011480340 + 2039333144 + 630962105 + 495447440 ^ 1183928032] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
