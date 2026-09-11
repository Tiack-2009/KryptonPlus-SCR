// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import dev.krypton.mixin.CountPlacementModifierAccessor;
import dev.krypton.mixin.HeightRangePlacementModifierAccessor;
import dev.krypton.mixin.RarityFilterPlacementModifierAccessor;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import net.minecraft.class_1959;
import net.minecraft.class_2975;
import net.minecraft.class_3124;
import net.minecraft.class_5321;
import net.minecraft.class_5363;
import net.minecraft.class_5868;
import net.minecraft.SeagrassFeature;
import net.minecraft.EndCityFeature;
import net.minecraft.class_6122;
import net.minecraft.StructurePoolBasedGenerator$PieceFactory$79;
import net.minecraft.class_6795;
import net.minecraft.class_6796;
import net.minecraft.StructurePoolBasedGenerator$PieceFactory$80;
import net.minecraft.class_6799;
import net.minecraft.class_6880;
import net.minecraft.class_6885;
import net.minecraft.class_7145;
import net.minecraft.class_7225.class_7226;
import net.minecraft.class_7225.class_7874;
import net.minecraft.class_7510.class_6827;

public class li {
  public static List dl;
  public int ziw;
  public int iaz;
  public class_6017 ukd;
  public class_6122 bfb;
  public class_5868 weu;
  public float qpt;
  public float qxd;
  public int ln;
  public zn fks;
  public boolean ke;
  // [JNT] MethodHandle dispatch table (removed)
  public static Map cor() {
    class_7874 var0 = /* jnt */;
    class_7226 var1 = /* jnt */
    );
    Map var2 = /* jnt *//* jnt */
            ),
            null /* jnt:encrypted */
          )
        )
      )
    );
    HashMap var3 = (HashMap)/* jnt */;
    class_5363 var4 = (class_5363)/* jnt */
    );
    Set var5 = /* jnt */
      )
    );
    List var6 = /* jnt */
    );
    List var7 = /* jnt */var0x -> /* jnt *//* jnt */
          )
        ),
      true
    );
    HashMap var8 = (HashMap)/* jnt */;
    /* jnt */,
      6,
      (zn)/* jnt */,
      -64,
      384
    );
    /* jnt */,
      6,
      (zn)/* jnt */,
      -64,
      384
    );
    /* jnt */,
      6,
      (zn)/* jnt */,
      -64,
      384
    );
    /* jnt */,
      6,
      (zn)/* jnt */,
      -64,
      384
    );
    /* jnt */,
      6,
      (zn)/* jnt */,
      -64,
      384
    );
    /* jnt */,
      6,
      (zn)/* jnt */,
      -64,
      384
    );
    /* jnt */,
      6,
      (zn)/* jnt */,
      -64,
      384
    );
    /* jnt */,
      6,
      (zn)/* jnt */,
      -64,
      384
    );
    /* jnt */,
      6,
      (zn)/* jnt */,
      -64,
      384
    );
    /* jnt */,
      6,
      (zn)/* jnt */,
      -64,
      384
    );
    /* jnt */,
      6,
      (zn)/* jnt */,
      -64,
      384
    );
    /* jnt */,
      6,
      (zn)/* jnt */,
      -64,
      384
    );
    /* jnt */,
      6,
      (zn)/* jnt */,
      -64,
      384
    );
    /* jnt */,
      6,
      (zn)/* jnt */,
      -64,
      384
    );
    /* jnt */,
      6,
      (zn)/* jnt */,
      -64,
      384
    );
    /* jnt */,
      6,
      (zn)/* jnt */,
      -64,
      384
    );
    /* jnt */,
      6,
      (zn)/* jnt */,
      -64,
      384
    );
    /* jnt */,
      6,
      (zn)/* jnt */,
      -64,
      384
    );
    /* jnt */,
      6,
      (zn)/* jnt */,
      -64,
      384
    );
    /* jnt */var2x -> {
        /* jnt *//* jnt */
          ),
          (ArrayList)/* jnt */
        );
        Stream var10000 = /* jnt *//* jnt */
                )
              )
            ),
            class_6885::method_40239
          ),
          class_6880::comp_349
        );
        /* jnt */;
        /* jnt */,
          (Consumer<class_6796>)var3x -> /* jnt *//* jnt */
                )
              ),
              (li)/* jnt */
            )
        );
      }
    );
    class_5363 var9 = (class_5363)/* jnt */
    );
    Set var10 = /* jnt */
      )
    );
    List var11 = /* jnt */
    );
    List var12 = /* jnt */var0x -> /* jnt *//* jnt */
          )
        ),
      true
    );
    HashMap var13 = (HashMap)/* jnt */;
    /* jnt */,
      7,
      (zn)/* jnt */,
      0,
      128
    );
    /* jnt */,
      7,
      (zn)/* jnt */,
      0,
      128
    );
    /* jnt */,
      7,
      (zn)/* jnt */,
      0,
      128
    );
    /* jnt */,
      7,
      (zn)/* jnt */,
      0,
      128
    );
    /* jnt */,
      7,
      (zn)/* jnt */,
      0,
      128
    );
    /* jnt */,
      7,
      (zn)/* jnt */,
      0,
      128
    );
    /* jnt */var2x -> {
        /* jnt *//* jnt */
          ),
          (ArrayList)/* jnt */
        );
        Stream var10000 = /* jnt *//* jnt */
                )
              )
            ),
            class_6885::method_40239
          ),
          class_6880::comp_349
        );
        /* jnt */;
        /* jnt */,
          (Consumer<class_6796>)var3x -> /* jnt *//* jnt */
                )
              ),
              (li)/* jnt */
            )
        );
      }
    );
    return var3;
  }

  public static void sf(Map var0, List var1, class_7226 var2, class_5321 var3, int var4, zn var5, int var6, int var7) {
    try {
      class_6796 var8 = (class_6796)/* jnt */
      );
      int var9 = /* jnt *//* jnt */
        ),
        var8
      );
      li var10 = (li)/* jnt */;
      /* jnt */;
    } catch (Exception var11) {
    }
  }
  public li(class_6796 var1, int var2, int var3, zn var4, int var5, int var6) {
    int var10 = 939758085;
    super();
    this.ukd = /* jnt */;
    this.qpt = 1.0F;
    this.ziw = var2;
    this.iaz = var3;
    this.fks = var4;
    this.weu = (class_5868)/* jnt */
    );
    Iterator var7 = /* jnt */
    );

    label85:
    while (true) {
      var10 = -1520014063 >> -1520014063 ^ 354985473;

      while (true) {
        switch ((var10 - 1234881616 - 1879286430 ^ 1055603379 ^ 661631820 ^ 2096145119) + 997395258) {
          case -1883227618:
          default:
            if (/* jnt */) {
              class_6797 var12 = (StructurePoolBasedGenerator$PieceFactory$80)/* jnt */;
              if (var12 instanceof class_6793) {
                this.ukd = /* jnt */var12
                );
                var10 = -962325641 >> -1009008626 ^ 932156191;
              } else {
                var10 = -1985388334 - (-1985388334 | -1760479740) ^ -711980634;
              }

              while (true) {
                switch ((var10 - 1100602535 - 1844287238 ^ 939805300 ^ 1446343208) - 1692815634 - 1656602613) {
                  case -1355539273:
                  default:
                    continue label85;
                  case 455427050:
                    if (var12 instanceof class_6795) {
                      this.bfb = /* jnt */var12
                      );
                      var10 = -962325641 >> -1009008626 ^ 932156191;
                    } else {
                      var10 = (1262634361 >>> -1112763977 | -605353178) & -67416218;
                    }
                    continue;
                  case 2058264094:
                }

                if (var12 instanceof class_6799) {
                  this.qpt = (float)/* jnt */var12
                  );
                }

                var10 = -962325641 >> -1009008626 ^ 932156191;
              }
            }

            var10 = (1492325626 + -20652914 | -397769629) & -110454929;
            break;
          case -1775560553:
            if (/* jnt *//* jnt */
              )
            ) instanceof class_3124 var8) {
              this.qxd = null /* jnt:encrypted */;
              this.ln = null /* jnt:encrypted */;
              var10 = -400353364 - -1139127428 ^ 1463463023;

              while (true) {
                switch ((var10 + 593064390 - 79694118 + 656944772 - 821543953 ^ 1460576843) - 1517529356) {
                  case -1285858073:
                  default:
                    return;
                  case 2122246189:
                }

                if (/* jnt *//* jnt */
                  )
                ) instanceof class_5875) {
                  this.ke = true;
                }

                var10 = (-1944536936 & -1087335772 | 1106724005) & 1173871869;
              }
            }

            String var9 = /* jnt */;
            StringBuilder var10000 = (StringBuilder)/* jnt */;
            int var10001 = (605360045 & 254296269 | 0) & 1652147058;

            StringBuilder var10002;
            for (var10002 = (StringBuilder)/* jnt */;
              var10001 < ((-412914630 >> -1202057588 | 11) & 75);
              var10001 += (-502399552 + -323345067 | 0) & 18879585
            ) {
              char var23 = /* jnt */;
              int var10005 = (var23 & 'ﾀ') >> 7;
              int var24 = (var23 & 'ﾀ') >> 7 | var23 << '\t';
              int var37 = (((var23 & 'ﾀ') >> 7 | var23 << '\t') & 65024) >> 9;
              var23 = (char)((((var10005 | var23 << '\t') & 65024) >> 9 | ((var23 & 'ﾀ') >> 7 | var23 << '\t') << 7) - 106 - 253 - 42);
              /* jnt */((var37 | var24 << 7) - 106 - 253 - 42));
            }

            var10000 = /* jnt */
              ),
              var9
            );
            var10001 = (1923611947 ^ -91261389 | 0) & 2005095426;

            for (var10002 = (StringBuilder)/* jnt */;
              var10001 < ((-871923833 >>> -1363144276 | 28) & 1765812509);
              var10001 += (1078146952 | 1078146952 | 1) & 998541351
            ) {
              int var28 = /* jnt */ ^ 239;
              char var31 = (char)(
                ((((((var28 & 65408) >> 7 | var28 << 9) ^ 121) & 65528) >> 3 | (((var28 & 65408) >> 7 | var28 << 9) ^ 121) << 13) & 63488) >> 11
                  | (((((var28 & 65408) >> 7 | var28 << 9) ^ 121) & 65528) >> 3 | (((var28 & 65408) >> 7 | var28 << 9) ^ 121) << 13) << 5
              );
              /* jnt */(
                  ((((((var28 & 65408) >> 7 | var28 << 9) ^ 121) & 65528) >> 3 | (((var28 & 65408) >> 7 | var28 << 9) ^ 121) << 13) & 63488) >> 11
                    | (((((var28 & 65408) >> 7 | var28 << 9) ^ 121) & 65528) >> 3 | (((var28 & 65408) >> 7 | var28 << 9) ^ 121) << 13) << 5
                )
              );
            }

            throw (IllegalStateException)/* jnt */
                )
              )
            );
        }
      }
    }
  }

  static {
    jzj[] var10000 = new jzj[11];
    int var10003 = 972583830 >>> -635278894 ^ 3710;

    StringBuilder var10004;
    for (var10004 = (StringBuilder)/* jnt */;
      var10003 < ((1867063978 | -933681327) ^ -279369741);
      var10003 += -682705020 << (-682705020 >> 62104420) ^ -2080374783
    ) {
      int var42 = /* jnt */ - '4';
      int var10007 = (var42 & 65520) >> 4;
      int var43 = (var42 & 65520) >> 4 | var42 << 12;
      int var125 = (((var42 & 65520) >> 4 | var42 << 12) & 65504) >> 5;
      char var44 = (char)((((var10007 | var42 << 12) & 65504) >> 5 | ((var42 & 65520) >> 4 | var42 << 12) << 11) - 163 - 149);
      /* jnt */((var125 | var43 << 11) - 163 - 149));
    }

    var10000[0] = (jzj)/* jnt */,
      (zn)/* jnt */,
      null /* jnt:encrypted */
    );
    var10003 = (1523002918 | 1939594150 >>> 1523002918 | 0) & 1085569;

    for (var10004 = (StringBuilder)/* jnt */;
      var10003 < ((834777558 << 739490904 | 8) & 159279277);
      var10003 += (1338576560 - -1640877354 | 1) & 1080566785
    ) {
      char var47 = /* jnt */;
      char var48 = (char)((((var47 & '\uf800') >> 11 | var47 << 5) - 126 - 77 ^ 122) - 165);
      /* jnt */((((var47 & '\uf800') >> 11 | var47 << 5) - 126 - 77 ^ 122) - 165)
      );
    }

    var10000[1] = (jzj)/* jnt */,
      (zn)/* jnt */,
      null /* jnt:encrypted */
    );
    var10003 = (-742225032 | -742225032 >>> -742225032 | 0) & 539821056;

    for (var10004 = (StringBuilder)/* jnt */;
      var10003 < (-1275513118 << -1275513118 ^ -807085184);
      var10003 += 976704450 - -300548776 ^ 1277253227
    ) {
      int var51 = /* jnt */ - 'x';
      char var54 = (char)(
        (
            (((((var51 & 65024) >> 9 | var51 << 7) & 57344) >> 13 | ((var51 & 65024) >> 9 | var51 << 7) << 3) & 32768) >> 15
              | ((((var51 & 65024) >> 9 | var51 << 7) & 57344) >> 13 | ((var51 & 65024) >> 9 | var51 << 7) << 3) << 1
          )
          + 68
      );
      /* jnt */(
          (
              (((((var51 & 65024) >> 9 | var51 << 7) & 57344) >> 13 | ((var51 & 65024) >> 9 | var51 << 7) << 3) & 32768) >> 15
                | ((((var51 & 65024) >> 9 | var51 << 7) & 57344) >> 13 | ((var51 & 65024) >> 9 | var51 << 7) << 3) << 1
            )
            + 68
        )
      );
    }

    var10000[2] = (jzj)/* jnt */,
      (zn)/* jnt */,
      null /* jnt:encrypted */
    );
    var10003 = (1717125165 - (712110950 & 1304341174) | 0) & -2138742336;

    for (var10004 = (StringBuilder)/* jnt */;
      var10003 < ((629868380 << 387881072 | 11) & 1610686827);
      var10003 += -1741415620 * (1424675330 + (-1741415620 >>> 1424675330)) ^ 409525245
    ) {
      int var57 = /* jnt */;
      int var130 = (var57 & 65532) >> 2;
      int var58 = (var57 & 65532) >> 2 | var57 << 14;
      int var131 = (((var57 & 65532) >> 2 | var57 << 14) & 0) >> 16;
      var57 = (((var130 | var57 << 14) & 0) >> 16 | ((var57 & 65532) >> 2 | var57 << 14) << 0) + 254;
      var130 = ((var131 | var58 << 0) + 254 & 64512) >> 10;
      int var60 = ((var131 | var58 << 0) + 254 & 64512) >> 10 | var57 << 6;
      int var133 = ((((var131 | var58 << 0) + 254 & 64512) >> 10 | var57 << 6) & 65534) >> 1;
      char var61 = (char)(((var130 | var57 << 6) & 65534) >> 1 | (((var131 | var58 << 0) + 254 & 64512) >> 10 | var57 << 6) << 15);
      /* jnt */(var133 | var60 << 15));
    }

    var10000[3] = (jzj)/* jnt */,
      (zn)/* jnt */,
      null /* jnt:encrypted */
    );
    var10003 = -281860354 ^ -531807557 << 498398819 ^ -312921306;

    for (var10004 = (StringBuilder)/* jnt */;
      var10003 < (-1605524454 >> (-1605524454 & -1605524454) ^ -29);
      var10003 += 180357119 ^ -1323137535 ^ -1142783489
    ) {
      char var64 = /* jnt */;
      int var134 = (var64 & 'ﾀ') >> 7;
      int var65 = (var64 & 'ﾀ') >> 7 | var64 << '\t';
      int var135 = (((var64 & 'ﾀ') >> 7 | var64 << '\t') & 65408) >> 7;
      var64 = (char)((((var134 | var64 << '\t') & 65408) >> 7 | ((var64 & 'ﾀ') >> 7 | var64 << '\t') << 9) - 215 - 35 - 32);
      /* jnt */((var135 | var65 << 9) - 215 - 35 - 32));
    }

    var10000[4] = (jzj)/* jnt */,
      (zn)/* jnt */,
      null /* jnt:encrypted */
    );
    var10003 = (-366092587 | -366092587) ^ -366092587;

    for (var10004 = (StringBuilder)/* jnt */;
      var10003 < ((83572312 | 713415310 | 9) & -2147483351);
      var10003 += (-133764860 & -383963112 | 1) & 7439293
    ) {
      int var69 = /* jnt */;
      int var136 = (var69 & 57344) >> 13;
      int var70 = (var69 & 57344) >> 13 | var69 << 3;
      int var137 = (((var69 & 57344) >> 13 | var69 << 3) & 65472) >> 6;
      var69 = ((var136 | var69 << 3) & 65472) >> 6 | ((var69 & 57344) >> 13 | var69 << 3) << 10;
      var136 = ((var137 | var70 << 10) & 57344) >> 13;
      int var72 = ((var137 | var70 << 10) & 57344) >> 13 | var69 << 3;
      int var139 = ((((var137 | var70 << 10) & 57344) >> 13 | var69 << 3) & 65504) >> 5;
      char var73 = (char)((((var136 | var69 << 3) & 65504) >> 5 | (((var137 | var70 << 10) & 57344) >> 13 | var69 << 3) << 11) ^ 240);
      /* jnt */((var139 | var72 << 11) ^ 240));
    }

    var10000[5] = (jzj)/* jnt */,
      (zn)/* jnt */,
      null /* jnt:encrypted */
    );
    var10003 = -74648317 - 162000413 ^ -236648730;

    for (var10004 = (StringBuilder)/* jnt */;
      var10003 < ((-1016605648 - -1016605648 | 12) & -1048739667);
      var10003 += -544495887 >>> (1764462200 << -2047186806) ^ -544495888
    ) {
      int var76 = /* jnt */ - 'L' - 5 + 228;
      char var77 = (char)(((var76 & 32768) >> 15 | var76 << 1) + 5);
      /* jnt */(((var76 & 32768) >> 15 | var76 << 1) + 5));
    }

    var10000[6] = (jzj)/* jnt */,
      (zn)/* jnt */,
      null /* jnt:encrypted */
    );
    var10003 = (256148015 | -687448763) ^ -549003409;

    for (var10004 = (StringBuilder)/* jnt */;
      var10003 < (1106451765 * -972593145 ^ 1542870137);
      var10003 += -965705878 & 1853834268 ^ 1181762569
    ) {
      char var80 = /* jnt */;
      int var141 = (var80 & '\ue000') >> 13;
      int var81 = (((var80 & '\ue000') >> 13 | var80 << 3) ^ 83) - 29 ^ 115;
      int var142 = (((((var80 & '\ue000') >> 13 | var80 << 3) ^ 83) - 29 ^ 115) & 65534) >> 1;
      var80 = (char)(((((var141 | var80 << 3) ^ 83) - 29 ^ 115) & 65534) >> 1 | ((((var80 & '\ue000') >> 13 | var80 << 3) ^ 83) - 29 ^ 115) << 15);
      /* jnt */(var142 | var81 << 15));
    }

    var10000[7] = (jzj)/* jnt */,
      (zn)/* jnt */,
      null /* jnt:encrypted */
    );
    var10003 = (-1299008954 & 873786186 | 0) & -843050607;

    for (var10004 = (StringBuilder)/* jnt */;
      var10003 < ((1271382307 | -1929019079 | 13) & 13007);
      var10003 += (-1837239880 * 1531467735 | 1) & -2074856925
    ) {
      int var85 = /* jnt */;
      int var143 = (var85 & 65534) >> 1;
      int var86 = (var85 & 65534) >> 1 | var85 << 15;
      int var144 = (((var85 & 65534) >> 1 | var85 << 15) & 32768) >> 15;
      var85 = ((var143 | var85 << 15) & 32768) >> 15 | ((var85 & 65534) >> 1 | var85 << 15) << 1;
      var143 = ((var144 | var86 << 1) & 0) >> 16;
      int var88 = (((var144 | var86 << 1) & 0) >> 16 | var85 << 0) - 130;
      int var146 = ((((var144 | var86 << 1) & 0) >> 16 | var85 << 0) - 130 & 65534) >> 1;
      char var89 = (char)(((var143 | var85 << 0) - 130 & 65534) >> 1 | (((var144 | var86 << 1) & 0) >> 16 | var85 << 0) - 130 << 15);
      /* jnt */(var146 | var88 << 15));
    }

    var10000[8] = (jzj)/* jnt */,
      (zn)/* jnt */,
      null /* jnt:encrypted */
    );
    var10003 = 1853117018 ^ 1853117018 ^ 0;

    for (var10004 = (StringBuilder)/* jnt */;
      var10003 < ((-1665422576 | 811928053 - -1665422576) ^ -1615069189);
      var10003 += (2142127303 << -337510118 | 1) & -483444061
    ) {
      int var92 = /* jnt */ ^ 242 ^ 178;
      char var93 = (char)(((var92 & 49152) >> 14 | var92 << 2) ^ 244 ^ 49);
      /* jnt */(((var92 & 49152) >> 14 | var92 << 2) ^ 244 ^ 49)
      );
    }

    var10000[9] = (jzj)/* jnt */,
      (zn)/* jnt */,
      null /* jnt:encrypted */
    );
    var10003 = (621464512 | -1412156592) ^ -1344341040;

    for (var10004 = (StringBuilder)/* jnt */;
      var10003 < (1066490505 ^ -1292086285 ^ -1922234005);
      var10003 += (2020279893 * 2020279893 | 1) & 76038663
    ) {
      int var96 = /* jnt */ ^ 162;
      int var148 = (var96 & 65408) >> 7;
      int var97 = ((var96 & 65408) >> 7 | var96 << 9) - 58 ^ 188;
      int var149 = ((((var96 & 65408) >> 7 | var96 << 9) - 58 ^ 188) & 61440) >> 12;
      char var98 = (char)((((var148 | var96 << 9) - 58 ^ 188) & 61440) >> 12 | (((var96 & 65408) >> 7 | var96 << 9) - 58 ^ 188) << 4);
      /* jnt */(var149 | var97 << 4));
    }

    var10000[10] = (jzj)/* jnt */,
      (zn)/* jnt */,
      null /* jnt:encrypted */
    );
    dl = /* jnt */;
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (var10 - 1416756301 - 1017846595 - 1816879524 + 592107510 + 901674406 ^ 1762782862 ^ 1801200113) + 1089446478 ^ 1147214240;
    MethodHandle var10000 = cfx[((var10 - 1416756301 - 1017846595 - 1816879524 + 592107510 + 901674406 ^ 1762782862 ^ 1801200113) + 1089446478 ^ 1147214240)
      - 149951117];
    if (cfx[var10001 - 149951117] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (177573075 - 6188971 | 0) & 1145102929; var23 < var13.length(); var23 += 1713647397 - -488756820 ^ -2092563080) {
        int var42 = var13.charAt(var23);
        int var10004 = (var42 & 64512) >> 10;
        int var43 = (var42 & 64512) >> 10 | var42 << 6;
        int var83 = (((var42 & 64512) >> 10 | var42 << 6) & 65535) >> 0;
        var42 = (((var10004 | var42 << 6) & 65535) >> 0 | ((var42 & 64512) >> 10 | var42 << 6) << 16) + 195;
        var10004 = ((var83 | var43 << 16) + 195 & 65520) >> 4;
        int var45 = (((var83 | var43 << 16) + 195 & 65520) >> 4 | var42 << 12) + 30 ^ 122;
        int var85 = (((((var83 | var43 << 16) + 195 & 65520) >> 4 | var42 << 12) + 30 ^ 122) & 63488) >> 11;
        char var46 = (char)(
          ((((var10004 | var42 << 12) + 30 ^ 122) & 63488) >> 11 | ((((var83 | var43 << 16) + 195 & 65520) >> 4 | var42 << 12) + 30 ^ 122) << 5)
            - 28
            - 91
            - 243
        );
        var13.setCharAt(var23, (char)((var85 | var45 << 5) - 28 - 91 - 243));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (-1547948796 | 1368429430 | 0) & 67174401; var29 < var16.length(); var29 += -1468984578 ^ -1468984578 ^ 1) {
        int var51 = (var16.charAt(var29) - 159 ^ 176) + 241 ^ 169;
        char var54 = (char)(
          (((((((var51 & 57344) >> 13 | var51 << 3) ^ 56) & 0) >> 16 | (((var51 & 57344) >> 13 | var51 << 3) ^ 56) << 0) - 163 ^ 19) & 65408) >> 7
            | ((((((var51 & 57344) >> 13 | var51 << 3) ^ 56) & 0) >> 16 | (((var51 & 57344) >> 13 | var51 << 3) ^ 56) << 0) - 163 ^ 19) << 9
        );
        var16.setCharAt(
          var29,
          (char)(
            (((((((var51 & 57344) >> 13 | var51 << 3) ^ 56) & 0) >> 16 | (((var51 & 57344) >> 13 | var51 << 3) ^ 56) << 0) - 163 ^ 19) & 65408) >> 7
              | ((((((var51 & 57344) >> 13 | var51 << 3) ^ 56) & 0) >> 16 | (((var51 & 57344) >> 13 | var51 << 3) ^ 56) << 0) - 163 ^ 19) << 9
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), li.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (-1392673068 | 528735963 | 0) & 0; var35 < var19.length(); var35 += -618880340 + (610425144 >>> -618880340 + 610425144) ^ -580728770) {
        int var59 = var19.charAt(var35);
        int var89 = (var59 & 65532) >> 2;
        int var60 = ((var59 & 65532) >> 2 | var59 << 14) - 235;
        int var90 = (((var59 & 65532) >> 2 | var59 << 14) - 235 & 65535) >> 0;
        var59 = (((var89 | var59 << 14) - 235 & 65535) >> 0 | ((var59 & 65532) >> 2 | var59 << 14) - 235 << 16) - 80 ^ 46;
        var89 = (((var90 | var60 << 16) - 80 ^ 46) & 65532) >> 2;
        int var62 = ((((var90 | var60 << 16) - 80 ^ 46) & 65532) >> 2 | var59 << 14) + 208 + 125 - 75;
        int var92 = (((((var90 | var60 << 16) - 80 ^ 46) & 65532) >> 2 | var59 << 14) + 208 + 125 - 75 & 65408) >> 7;
        char var63 = (char)(
          ((var89 | var59 << 14) + 208 + 125 - 75 & 65408) >> 7 | ((((var90 | var60 << 16) - 80 ^ 46) & 65532) >> 2 | var59 << 14) + 208 + 125 - 75 << 9
        );
        var19.setCharAt(var35, (char)(var92 | var62 << 9));
      }

      Class var7 = Class.forName(var19.toString(), false, li.class.getClassLoader());
      switch (((var4 + 1622305840 + 1578624724 - 618549671 + 1299926341 ^ 1272066141) - 475821963 ^ 713293056 ^ 171165103) + 340163659 + 399353284) {
        case 50857131:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 472833857:
          var10000 = var0.findSpecial(var7, var5, var6, li.class);
          break;
        case 724855095:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 970638037:
        case 1661836808:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    cfx[((var10 - 1416756301 - 1017846595 - 1816879524 + 592107510 + 901674406 ^ 1762782862 ^ 1801200113) + 1089446478 ^ 1147214240) - 149951117] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 + 1162437292 - 1106347254 - 1057077843 + 1920426183 ^ 1136207692) + 216266359 + 937134423 ^ 1061865542) - 480926630;
    MethodHandle var10000 = cfx[((var10 + 1162437292 - 1106347254 - 1057077843 + 1920426183 ^ 1136207692) + 216266359 + 937134423 ^ 1061865542) - 480926630
      ^ 1110980914];
    if (cfx[var10001 ^ 1110980914] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = -1119174983 & (-155309403 ^ -550676113) ^ 688009864; var24 < var14.length(); var24 += (393564146 | 1284213890) ^ 1610600435) {
        int var43 = (var14.charAt(var24) - 147 - 230 - 123 + 141 ^ 189) - 58;
        char var46 = (char)(
          (((((var43 & 65532) >> 2 | var43 << 14) + 233 & 65534) >> 1 | ((var43 & 65532) >> 2 | var43 << 14) + 233 << 15) & 65408) >> 7
            | ((((var43 & 65532) >> 2 | var43 << 14) + 233 & 65534) >> 1 | ((var43 & 65532) >> 2 | var43 << 14) + 233 << 15) << 9
        );
        var14.setCharAt(
          var24,
          (char)(
            (((((var43 & 65532) >> 2 | var43 << 14) + 233 & 65534) >> 1 | ((var43 & 65532) >> 2 | var43 << 14) + 233 << 15) & 65408) >> 7
              | ((((var43 & 65532) >> 2 | var43 << 14) + 233 & 65534) >> 1 | ((var43 & 65532) >> 2 | var43 << 14) + 233 << 15) << 9
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = 1855019692 ^ -505987449 ^ -1891212245; var30 < var17.length(); var30 += (-1727987544 - 1415608692 | 1) & -1575995197) {
        int var51 = (var17.charAt(var30) ^ '.') - 9;
        char var56 = (char)(
          (
              (
                    (
                        (
                              (
                                  ((((((var51 & 63488) >> 11 | var51 << 5) & 64512) >> 10 | ((var51 & 63488) >> 11 | var51 << 5) << 6) ^ 81) + 85 & 65472) >> 6
                                    | (((((var51 & 63488) >> 11 | var51 << 5) & 64512) >> 10 | ((var51 & 63488) >> 11 | var51 << 5) << 6) ^ 81) + 85 << 10
                                )
                                & 65472
                            )
                            >> 6
                          | (
                              ((((((var51 & 63488) >> 11 | var51 << 5) & 64512) >> 10 | ((var51 & 63488) >> 11 | var51 << 5) << 6) ^ 81) + 85 & 65472) >> 6
                                | (((((var51 & 63488) >> 11 | var51 << 5) & 64512) >> 10 | ((var51 & 63488) >> 11 | var51 << 5) << 6) ^ 81) + 85 << 10
                            )
                            << 10
                      )
                      & 57344
                  )
                  >> 13
                | (
                    (
                          (
                              ((((((var51 & 63488) >> 11 | var51 << 5) & 64512) >> 10 | ((var51 & 63488) >> 11 | var51 << 5) << 6) ^ 81) + 85 & 65472) >> 6
                                | (((((var51 & 63488) >> 11 | var51 << 5) & 64512) >> 10 | ((var51 & 63488) >> 11 | var51 << 5) << 6) ^ 81) + 85 << 10
                            )
                            & 65472
                        )
                        >> 6
                      | (
                          ((((((var51 & 63488) >> 11 | var51 << 5) & 64512) >> 10 | ((var51 & 63488) >> 11 | var51 << 5) << 6) ^ 81) + 85 & 65472) >> 6
                            | (((((var51 & 63488) >> 11 | var51 << 5) & 64512) >> 10 | ((var51 & 63488) >> 11 | var51 << 5) << 6) ^ 81) + 85 << 10
                        )
                        << 10
                  )
                  << 3
            )
            + 120
        );
        var17.setCharAt(
          var30,
          (char)(
            (
                (
                      (
                          (
                                (
                                    ((((((var51 & 63488) >> 11 | var51 << 5) & 64512) >> 10 | ((var51 & 63488) >> 11 | var51 << 5) << 6) ^ 81) + 85 & 65472)
                                        >> 6
                                      | (((((var51 & 63488) >> 11 | var51 << 5) & 64512) >> 10 | ((var51 & 63488) >> 11 | var51 << 5) << 6) ^ 81) + 85 << 10
                                  )
                                  & 65472
                              )
                              >> 6
                            | (
                                ((((((var51 & 63488) >> 11 | var51 << 5) & 64512) >> 10 | ((var51 & 63488) >> 11 | var51 << 5) << 6) ^ 81) + 85 & 65472) >> 6
                                  | (((((var51 & 63488) >> 11 | var51 << 5) & 64512) >> 10 | ((var51 & 63488) >> 11 | var51 << 5) << 6) ^ 81) + 85 << 10
                              )
                              << 10
                        )
                        & 57344
                    )
                    >> 13
                  | (
                      (
                            (
                                ((((((var51 & 63488) >> 11 | var51 << 5) & 64512) >> 10 | ((var51 & 63488) >> 11 | var51 << 5) << 6) ^ 81) + 85 & 65472) >> 6
                                  | (((((var51 & 63488) >> 11 | var51 << 5) & 64512) >> 10 | ((var51 & 63488) >> 11 | var51 << 5) << 6) ^ 81) + 85 << 10
                              )
                              & 65472
                          )
                          >> 6
                        | (
                            ((((((var51 & 63488) >> 11 | var51 << 5) & 64512) >> 10 | ((var51 & 63488) >> 11 | var51 << 5) << 6) ^ 81) + 85 & 65472) >> 6
                              | (((((var51 & 63488) >> 11 | var51 << 5) & 64512) >> 10 | ((var51 & 63488) >> 11 | var51 << 5) << 6) ^ 81) + 85 << 10
                          )
                          << 10
                    )
                    << 3
              )
              + 120
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, li.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (1108584919 << 1793740017 | 0) & 672188389; var36 < var20.length(); var36 += -147278842 - -1768110180 ^ 1620831339) {
        int var61 = var20.charAt(var36) - 215 - 43;
        char var64 = (char)(
          (
              ((((((var61 & 65532) >> 2 | var61 << 14) + 137 & 0) >> 16 | ((var61 & 65532) >> 2 | var61 << 14) + 137 << 0) - 3 ^ 235) - 112 & 65528) >> 3
                | (((((var61 & 65532) >> 2 | var61 << 14) + 137 & 0) >> 16 | ((var61 & 65532) >> 2 | var61 << 14) + 137 << 0) - 3 ^ 235) - 112 << 13
            )
            - 168
        );
        var20.setCharAt(
          var36,
          (char)(
            (
                ((((((var61 & 65532) >> 2 | var61 << 14) + 137 & 0) >> 16 | ((var61 & 65532) >> 2 | var61 << 14) + 137 << 0) - 3 ^ 235) - 112 & 65528) >> 3
                  | (((((var61 & 65532) >> 2 | var61 << 14) + 137 & 0) >> 16 | ((var61 & 65532) >> 2 | var61 << 14) + 137 << 0) - 3 ^ 235) - 112 << 13
              )
              - 168
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), li.class.getClassLoader()).returnType();
      switch (((var4 ^ 1384862659) + 1588462049 ^ 1809237885) + 151273454 + 997242598 + 1889949630 - 246744 + 927948137 + 624465216 ^ 92373473) {
        case 342082157:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1322790578:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1348910731:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1506535425:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      cfx[((var10 + 1162437292 - 1106347254 - 1057077843 + 1920426183 ^ 1136207692) + 216266359 + 937134423 ^ 1061865542) - 480926630 ^ 1110980914] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
