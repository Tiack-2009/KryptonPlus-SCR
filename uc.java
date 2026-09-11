// KryptonPlus Module: Fullbright
// Original class: uc
// Status: PARTIAL - JNT native encryption (strings in jnt.so)


import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.ToDoubleFunction;
import net.minecraft.Entity;
import net.minecraft.PlayerEntity;
import net.minecraft.ClientPlayerEntity;
import net.minecraft.ItemStack;
import net.minecraft.Vec3d;
import net.minecraft.DrawContext;
import net.minecraft.class_640;
import org.joml.Matrix3x2fStack;
import org.joml.Vector3f;

public class Fullbright extends np {
  public kc d;
  public kc v;
  public rt e;
  public kc jb;
  public kc fk;
  public rt b;
  public kc x;
  public kc j;
  public kc a;
  public kc yc;
  public static int u = -1;
  public static int p = -59111;
  public static int n = -23296;
  public static int y = -15074279;
  public static int q = -1525469;
  public static int bs = -15422806;
  public static int m = -5592406;
  public static int i = -16725761;
  public static int ob = -1609560040;
  public static int ep = 3;
  public static int k = 1;
  public static int ua = 2;
  public List r;
  // [JNT] MethodHandle dispatch table (removed)
  public uc() {
    int var1 = -1898579010;
    int var10001 = (1416540663 ^ -1481923349 | 0) & 204472320;

    StringBuilder var10002;
    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < (-816995157 * (-816995157 + 728863511) ^ -1597208929);
      var10001 += (1016925854 << -1307311363 | 1) & 334088177
    ) {
      int var58 = /* jnt */ + '"';
      int var10005 = (var58 & 57344) >> 13;
      int var59 = ((var58 & 57344) >> 13 | var58 << 3) - 113;
      int var201 = (((var58 & 57344) >> 13 | var58 << 3) - 113 & 65024) >> 9;
      char var60 = (char)((((var10005 | var58 << 3) - 113 & 65024) >> 9 | ((var58 & 57344) >> 13 | var58 << 3) - 113 << 7) ^ 146);
      /* jnt */((var201 | var59 << 7) ^ 146)
      );
    }

    String var8 = /* jnt */;
    int var32 = (-159521580 ^ 1358371415 | 0) & 1481900292;

    StringBuilder var62;
    for (var62 = (StringBuilder)/* jnt */;
      var32 < (595038598 * -202007967 ^ -719929360);
      var32 += -573535368 >>> 583809571 ^ 465178990
    ) {
      int var128 = /* jnt */ ^ 179;
      int var10006 = (var128 & 65528) >> 3;
      int var129 = ((var128 & 65528) >> 3 | var128 << 13) - 67 ^ 54;
      int var243 = ((((var128 & 65528) >> 3 | var128 << 13) - 67 ^ 54) & 65520) >> 4;
      char var130 = (char)((((var10006 | var128 << 13) - 67 ^ 54) & 65520) >> 4 | (((var128 & 65528) >> 3 | var128 << 13) - 67 ^ 54) << 12);
      /* jnt */(var243 | var129 << 12));
    }

    super(
      var8,
      /* jnt */,
      -1,
      null /* jnt:encrypted */
    );
    uc var10000 = this;
    var10001 = (48835456 | 105151119 | 0) & 536872048;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((-887965817 & -887965817 | 1) & 78399599);
      var10001 += (-80089632 & (566575869 | -1745787247) | 1) & 1216518153
    ) {
      char var65 = /* jnt */;
      int var204 = (var65 & '\ue000') >> 13;
      int var66 = ((var65 & '\ue000') >> 13 | var65 << 3) - 238;
      int var205 = (((var65 & '\ue000') >> 13 | var65 << 3) - 238 & 65534) >> 1;
      char var67 = (char)((((var204 | var65 << 3) - 238 & 65534) >> 1 | ((var65 & '\ue000') >> 13 | var65 << 3) - 238 << 15) - 95 - 10);
      /* jnt */((var205 | var66 << 15) - 95 - 10)
      );
    }

    kc var11 = (kc)/* jnt */, true
    );
    int var36 = (-1600304314 - 1482139722 | 0) & -2086512382;
    var62 = (StringBuilder)/* jnt */;

    label230:
    while (true) {
      var1 = (885909252 - (56888560 << 56888560) | -1943965668) & -597462849;

      while (true) {
        label226:
        while (true) {
          label224:
          while (true) {
            label222:
            while (true) {
              label220:
              while (true) {
                label218:
                while (true) {
                  label216:
                  while (true) {
                    label271: {
                      switch (((var1 ^ 1041979393) + 996273831 - 1113062113 + 1019126226 ^ 467572793) - 1036634592) {
                        case -2074964678:
                          var10002 = var62;
                          if (var36 < (963341 >> 2065654044 ^ 23)) {
                            char var197 = /* jnt */;
                            int var261 = (var197 & '￠') >> 5;
                            int var198 = (((var197 & '￠') >> 5 | var197 << 11) ^ 189) + 192 ^ 222;
                            int var262 = (((((var197 & '￠') >> 5 | var197 << 11) ^ 189) + 192 ^ 222) & 65532) >> 2;
                            var197 = (char)(
                              ((((var261 | var197 << 11) ^ 189) + 192 ^ 222) & 65532) >> 2 | ((((var197 & '￠') >> 5 | var197 << 11) ^ 189) + 192 ^ 222) << 14
                            );
                            /* jnt */(var262 | var198 << 14)
                            );
                            var36 += 945916231 & 945916231 ^ 945916230;
                            break label220;
                          }

                          var1 = 1360580092 ^ -397726 ^ -615340041;
                          break;
                        case -2000532697:
                        default:
                          var10002 = var62;
                          if (var36 < ((-1148567314 + (-453767545 | -453767545) | 30) & 453050398)) {
                            char var163 = /* jnt */;
                            int var254 = (var163 & '\uf000') >> 12;
                            int var164 = (((var163 & '\uf000') >> 12 | var163 << 4) ^ 92 ^ 250) - 191;
                            int var255 = ((((var163 & '\uf000') >> 12 | var163 << 4) ^ 92 ^ 250) - 191 & 65532) >> 2;
                            var163 = (char)(
                              (((var254 | var163 << 4) ^ 92 ^ 250) - 191 & 65532) >> 2 | (((var163 & '\uf000') >> 12 | var163 << 4) ^ 92 ^ 250) - 191 << 14
                            );
                            /* jnt */(var255 | var164 << 14)
                            );
                            var36 += (-434285023 + 2041088920 * -1069838301 | 0) & 1007293441;
                            break label271;
                          }

                          var1 = (253198509 & -647476510 | 1108424285) & -677382563;
                          break;
                        case -1559978171:
                          var10002 = var62;
                          if (var36 < (-1346474616 - 783090423 ^ -2129565053)) {
                            char var159 = /* jnt */;
                            char var160 = (char)(((var159 & 'ﰀ') >> 10 | var159 << 6) - 64 - 54 + 192 - 253);
                            /* jnt */(((var159 & 'ﰀ') >> 10 | var159 << 6) - 64 - 54 + 192 - 253)
                            );
                            var36 += -1879754327 >>> 1183364750 ^ 147413;
                            break label216;
                          }

                          var1 = -550478800 * -1692026866 ^ -1986231203;
                          break;
                        case -1244505172:
                          var10002 = var62;
                          if (var36 < ((-1035929253 - -1035929253 | 24) & 473152638)) {
                            int var155 = (/* jnt */ ^ 'M')
                              - 16;
                            char var156 = (char)(((var155 & 0) >> 16 | var155 << 0) + 249 - 210);
                            /* jnt */(((var155 & 0) >> 16 | var155 << 0) + 249 - 210)
                            );
                            var36 += (854153994 >> -19465703 | 0) & -481200829;
                            continue label230;
                          }

                          var1 = -996726890 * -69809959 ^ -2144831199;
                          break;
                        case -978652216:
                          var10002 = var62;
                          if (var36 < ((1757394106 ^ -1875166380 | 16) & 75186192)) {
                            char var150 = /* jnt */;
                            int var250 = (var150 & '耀') >> 15;
                            int var151 = ((var150 & '耀') >> 15 | var150 << 1) + 74;
                            int var251 = (((var150 & '耀') >> 15 | var150 << 1) + 74 & 65528) >> 3;
                            var150 = (char)((((var250 | var150 << 1) + 74 & 65528) >> 3 | ((var150 & '耀') >> 15 | var150 << 1) + 74 << 13) + 47 + 132);
                            /* jnt */((var251 | var151 << 13) + 47 + 132)
                            );
                            var36 += -1480406357 - 568531080 ^ -2048937438;
                            break label218;
                          }

                          var1 = (-832151829 & 1289153696 | -536837774) & -480278146;
                          break;
                        case -306496793:
                          var10002 = var62;
                          if (var36 < (119256014 + 1654584237 ^ 1773840230)) {
                            int var146 = /* jnt */ ^ 167;
                            char var147 = (char)((((var146 & 65520) >> 4 | var146 << 12) ^ 213) + 198 ^ 186);
                            /* jnt */((((var146 & 65520) >> 4 | var146 << 12) ^ 213) + 198 ^ 186)
                            );
                            var36 += -1369224341 >> 300226388 ^ -1305;
                            break label224;
                          }

                          var1 = -2073504275 ^ -130822062 ^ -1950840022;
                          break;
                        case 1289617242:
                          var10002 = var62;
                          if (var36 < ((1964318768 ^ 1448641535 | 24) & -592294852)) {
                            int var142 = /* jnt */
                              + 'g'
                              + 108
                              - 219;
                            char var143 = (char)(((var142 & 65504) >> 5 | var142 << 11) ^ 44);
                            /* jnt */(((var142 & 65504) >> 5 | var142 << 11) ^ 44)
                            );
                            var36 += -1160125819 >> 1940530118 ^ -18126965;
                            break label222;
                          }

                          var1 = -163919756 - (-647920278 >> -297409958) ^ -195965910;
                          break;
                        case 1318561059:
                          var10002 = var62;
                          if (var36 < ((-1669438880 * -1669438880 | 25) & 35789407)) {
                            int var135 = /* jnt */;
                            int var244 = (var135 & 65024) >> 9;
                            int var136 = (var135 & 65024) >> 9 | var135 << 7;
                            int var245 = (((var135 & 65024) >> 9 | var135 << 7) & 65504) >> 5;
                            var135 = (((var244 | var135 << 7) & 65504) >> 5 | ((var135 & 65024) >> 9 | var135 << 7) << 11) ^ 190;
                            var244 = (((var245 | var136 << 11) ^ 190) & 65528) >> 3;
                            int var138 = (((var245 | var136 << 11) ^ 190) & 65528) >> 3 | var135 << 13;
                            int var247 = (((((var245 | var136 << 11) ^ 190) & 65528) >> 3 | var135 << 13) & 65534) >> 1;
                            char var139 = (char)(((var244 | var135 << 13) & 65534) >> 1 | ((((var245 | var136 << 11) ^ 190) & 65528) >> 3 | var135 << 13) << 15);
                            /* jnt */(var247 | var138 << 15)
                            );
                            var36 += (1199742551 + -541275868 | 1) & -2000646011;
                            break label226;
                          }

                          var1 = 728325945 * (1481209173 >> 728325945) ^ 639535256;
                      }

                      rt var14;
                      int var40;
                      switch (var1 - 1547978011 + 352160482 + 1021216772 ^ 1710849103 ^ 964965485 ^ 497606017) {
                        case -2076751509:
                          var10000.x = /* jnt */
                          );
                          var10000 = this;
                          var10001 = (-221432197 ^ -605994797 | 0) & 373358864;

                          for (var10002 = (StringBuilder)/* jnt */;
                            var10001 < ((-1969425385 << 1704721943 | 4) & 342356876);
                            var10001 += 580384659 * 942243762 ^ 1074204983
                          ) {
                            int var123 = (
                                /* jnt */
                                  ^ 'e'
                                  ^ 161
                              )
                              + 135;
                            char var124 = (char)(((var123 & 63488) >> 11 | var123 << 5) - 247);
                            /* jnt */(((var123 & 63488) >> 11 | var123 << 5) - 247)
                            );
                          }

                          var11 = (kc)/* jnt */,
                            true
                          );
                          var36 = (-654360617 >> -1627121493 | 0) & 24600;
                          var62 = (StringBuilder)/* jnt */;
                          break label218;
                        case -1811168610:
                          var10000.j = /* jnt */
                          );
                          var10000 = this;
                          var10001 = 288323676 + 1054243698 ^ 1342567374;

                          for (var10002 = (StringBuilder)/* jnt */;
                            var10001 < ((2068812315 | 1773701226 | 0) & 67134600);
                            var10001 += (-954248096 | 470745837) ^ -551594260
                          ) {
                            char var117 = /* jnt */;
                            char var120 = (char)(
                              (
                                  (((((var117 & '쀀') >> 14 | var117 << 2) + 111 & 61440) >> 12 | ((var117 & '쀀') >> 14 | var117 << 2) + 111 << 4) & 65528) >> 3
                                    | ((((var117 & '쀀') >> 14 | var117 << 2) + 111 & 61440) >> 12 | ((var117 & '쀀') >> 14 | var117 << 2) + 111 << 4) << 13
                                )
                                + 134
                            );
                            /* jnt */(
                                (
                                    (((((var117 & '쀀') >> 14 | var117 << 2) + 111 & 61440) >> 12 | ((var117 & '쀀') >> 14 | var117 << 2) + 111 << 4) & 65528)
                                        >> 3
                                      | ((((var117 & '쀀') >> 14 | var117 << 2) + 111 & 61440) >> 12 | ((var117 & '쀀') >> 14 | var117 << 2) + 111 << 4) << 13
                                  )
                                  + 134
                              )
                            );
                          }

                          var11 = (kc)/* jnt */,
                            false
                          );
                          var36 = (2050379414 + 2050379414 | 0) & 34676931;
                          var62 = (StringBuilder)/* jnt */;
                          break label220;
                        case -1397831229:
                          var10000.jb = /* jnt */
                          );
                          var10000 = this;
                          var10001 = (480513334 >> -213350341 | 0) & -379765276;

                          for (var10002 = (StringBuilder)/* jnt */;
                            var10001 < ((-82304473 ^ -1719644224 ^ -82304473 << -1719644224 | 14) & 573874207);
                            var10001 += (1533398885 ^ -546632655 | 1) & 1930432683
                          ) {
                            char var112 = /* jnt */;
                            int var235 = (var112 & 'ﰀ') >> 10;
                            int var113 = ((var112 & 'ﰀ') >> 10 | var112 << 6) + 113 - 129 ^ 74;
                            int var236 = ((((var112 & 'ﰀ') >> 10 | var112 << 6) + 113 - 129 ^ 74) & 32768) >> 15;
                            char var114 = (char)(
                              (((var235 | var112 << 6) + 113 - 129 ^ 74) & 32768) >> 15 | (((var112 & 'ﰀ') >> 10 | var112 << 6) + 113 - 129 ^ 74) << 1
                            );
                            /* jnt */(var236 | var113 << 1)
                            );
                          }

                          var11 = (kc)/* jnt */,
                            false
                          );
                          var36 = (1377555272 ^ 1377555272 | 0) & 100483510;
                          var62 = (StringBuilder)/* jnt */;
                          break label222;
                        case -1177073732:
                        default:
                          var10000.fk = /* jnt */
                          );
                          var10000 = this;
                          var10001 = (-675315855 >>> -479258457 | 0) & -233832192;

                          for (var10002 = (StringBuilder)/* jnt */;
                            var10001 < ((743658842 * -817023851 | 9) & -1005452643);
                            var10001 += (-1737804691 + (-1737804691 >>> 1798882187) | 1) & 1182894117
                          ) {
                            char var96 = /* jnt */;
                            int var225 = (var96 & '￠') >> 5;
                            int var97 = (var96 & '￠') >> 5 | var96 << 11;
                            int var226 = (((var96 & '￠') >> 5 | var96 << 11) & 65472) >> 6;
                            char var98 = (char)(((((var225 | var96 << 11) & 65472) >> 6 | ((var96 & '￠') >> 5 | var96 << 11) << 10) ^ 75) + 102 + 19);
                            /* jnt */(((var226 | var97 << 10) ^ 75) + 102 + 19)
                            );
                          }

                          var14 = (rt)/* jnt */,
                            10.0,
                            500.0,
                            200.0,
                            10.0
                          );
                          var40 = 873317576 >> 2111192564 ^ 832;
                          var62 = (StringBuilder)/* jnt */;
                          var1 = 837886093 & 918513831 ^ 1319895811;
                          break;
                        case 72300220:
                          var10000.yc = /* jnt */
                          );
                          this.r = (ArrayList)/* jnt */;
                          /* jnt */,
                              null /* jnt:encrypted */,
                              null /* jnt:encrypted */,
                              null /* jnt:encrypted */,
                              null /* jnt:encrypted */,
                              null /* jnt:encrypted */,
                              null /* jnt:encrypted */,
                              null /* jnt:encrypted */,
                              null /* jnt:encrypted */,
                              null /* jnt:encrypted */
                            }
                          );
                          return;
                        case 405012849:
                          var10000.d = /* jnt */
                          );
                          var10000 = this;
                          var10001 = (-2070055194 & -1067089329 | 0) & 1813667248;

                          for (var10002 = (StringBuilder)/* jnt */;
                            var10001 < ((1184678011 >>> (-948356149 >> 1184678011) | 5) & 1687580349);
                            var10001 += (926657849 * (888884097 << -1992418662) | 1) & 450562133
                          ) {
                            char var91 = /* jnt */;
                            int var223 = (var91 & '\ue000') >> 13;
                            int var92 = (((var91 & '\ue000') >> 13 | var91 << 3) ^ 106) - 88;
                            int var224 = ((((var91 & '\ue000') >> 13 | var91 << 3) ^ 106) - 88 & 63488) >> 11;
                            char var93 = (char)(
                              ((((var223 | var91 << 3) ^ 106) - 88 & 63488) >> 11 | (((var91 & '\ue000') >> 13 | var91 << 3) ^ 106) - 88 << 5) - 40
                            );
                            /* jnt */((var224 | var92 << 5) - 40)
                            );
                          }

                          var11 = (kc)/* jnt */,
                            false
                          );
                          var36 = (-1466087921 - -1673904728 | 0) & 1937798288;
                          var62 = (StringBuilder)/* jnt */;
                          break label271;
                        case 715048855:
                          var10000.a = /* jnt */
                          );
                          var10000 = this;
                          var10001 = -442971902 << (904448154 ^ 904448154) ^ -442971902;

                          for (var10002 = (StringBuilder)/* jnt */;
                            var10001 < (1946823086 << 1946823086 ^ -1972666363);
                            var10001 += -1097294528 & 70218283 ^ 67637249
                          ) {
                            int var86 = (
                                /* jnt */ ^ 216
                              )
                              + 100;
                            int var221 = (var86 & 0) >> 16;
                            int var87 = (var86 & 0) >> 16 | var86 << 0;
                            int var222 = (((var86 & 0) >> 16 | var86 << 0) & 61440) >> 12;
                            char var88 = (char)((((var221 | var86 << 0) & 61440) >> 12 | ((var86 & 0) >> 16 | var86 << 0) << 4) ^ 98);
                            /* jnt */((var222 | var87 << 4) ^ 98)
                            );
                          }

                          var11 = (kc)/* jnt */,
                            true
                          );
                          var36 = -1115490673 ^ 1714476861 ^ -609082958;
                          var62 = (StringBuilder)/* jnt */;
                          break label226;
                        case 2038206859:
                          var10000.v = /* jnt */
                          );
                          var10000 = this;
                          var10001 = 452794063 & 452794063 ^ 452794063;

                          for (var10002 = (StringBuilder)/* jnt */;
                            var10001 < (1860432142 + 1860432142 ^ -574103015);
                            var10001 += (1306456649 >> 1368625569 + 1306456649 + 1368625569 | 1) & 2132018209
                          ) {
                            char var79 = /* jnt */;
                            char var82 = (char)(
                              ((((((var79 & '\ufffe') >> 1 | var79 << 15) & 0) >> 16 | ((var79 & '\ufffe') >> 1 | var79 << 15) << 0) ^ 235 ^ 12) & 0) >> 16
                                | (((((var79 & '\ufffe') >> 1 | var79 << 15) & 0) >> 16 | ((var79 & '\ufffe') >> 1 | var79 << 15) << 0) ^ 235 ^ 12) << 0
                            );
                            /* jnt */(
                                ((((((var79 & '\ufffe') >> 1 | var79 << 15) & 0) >> 16 | ((var79 & '\ufffe') >> 1 | var79 << 15) << 0) ^ 235 ^ 12) & 0) >> 16
                                  | (((((var79 & '\ufffe') >> 1 | var79 << 15) & 0) >> 16 | ((var79 & '\ufffe') >> 1 | var79 << 15) << 0) ^ 235 ^ 12) << 0
                              )
                            );
                          }

                          var14 = (rt)/* jnt */,
                            0.5,
                            3.0,
                            1.0,
                            0.1
                          );
                          var40 = (-593015884 | -946617992 | 0) & 541593603;
                          var62 = (StringBuilder)/* jnt */;
                          var1 = (-1565403759 & -1565403759 | -1558369243) & -144883931;
                      }

                      label206:
                      while (true) {
                        switch ((var1 ^ 1643198401) - 2003691267 - 1009929029 + 1409465524 + 1128257414 ^ 416841600) {
                          case -1101655210:
                            var10002 = var62;
                            if (var40 >= (1504629714 * -1895280852 ^ 1241134604)) {
                              var1 = (143843721 | -1420682510 | -920311464) & -574625288;
                              break label206;
                            }

                            int var183 = /* jnt */ + '(';
                            char var186 = (char)(
                              (((((var183 & 57344) >> 13 | var183 << 3) - 121 & 65024) >> 9 | ((var183 & 57344) >> 13 | var183 << 3) - 121 << 7) & 65024) >> 9
                                | ((((var183 & 57344) >> 13 | var183 << 3) - 121 & 65024) >> 9 | ((var183 & 57344) >> 13 | var183 << 3) - 121 << 7) << 7
                            );
                            /* jnt */(
                                (((((var183 & 57344) >> 13 | var183 << 3) - 121 & 65024) >> 9 | ((var183 & 57344) >> 13 | var183 << 3) - 121 << 7) & 65024)
                                    >> 9
                                  | ((((var183 & 57344) >> 13 | var183 << 3) - 121 & 65024) >> 9 | ((var183 & 57344) >> 13 | var183 << 3) - 121 << 7) << 7
                              )
                            );
                            var40 += (-1083872917 >> -1909331676 | 1) & 9;
                            var1 = (-1565403759 & -1565403759 | -1558369243) & -144883931;
                            break;
                          case 458623417:
                          default:
                            var10002 = var62;
                            if (var40 >= ((-836749101 | -1233582267) ^ -25608256)) {
                              var1 = -1199335878 * -1698869698 ^ -367410580;
                              break label206;
                            }

                            char var178 = /* jnt */;
                            int var256 = (var178 & '￠') >> 5;
                            int var179 = ((var178 & '￠') >> 5 | var178 << 11) - 200 ^ 183;
                            int var257 = ((((var178 & '￠') >> 5 | var178 << 11) - 200 ^ 183) & 32768) >> 15;
                            var178 = (char)(
                              ((((var256 | var178 << 11) - 200 ^ 183) & 32768) >> 15 | (((var178 & '￠') >> 5 | var178 << 11) - 200 ^ 183) << 1) ^ 105
                            );
                            /* jnt */((var257 | var179 << 1) ^ 105)
                            );
                            var40 += -1390656368 >>> (-1390656368 >>> -1390656368 * -1390656368) ^ 44317;
                            var1 = 837886093 & 918513831 ^ 1319895811;
                        }
                      }

                      switch ((var1 - 835824566 ^ 1628930315) - 886414054 + 117928981 + 786196580 ^ 957760438) {
                        case -1055505558:
                          var10000.e = /* jnt */
                          );
                          var10000 = this;
                          var10001 = 1744766281 ^ -824179496 ^ -1457585775;

                          for (var10002 = (StringBuilder)/* jnt */;
                            var10001 < ((1058548072 << -752872052 * -703208948 | 11) & 1452579039);
                            var10001 += (-1615374111 | 1601489083) ^ -537405190
                          ) {
                            char var107 = /* jnt */;
                            int var233 = (var107 & '쀀') >> 14;
                            int var108 = ((var107 & '쀀') >> 14 | var107 << 2) - 102 + 156;
                            int var234 = (((var107 & '쀀') >> 14 | var107 << 2) - 102 + 156 & 0) >> 16;
                            char var109 = (char)((((var233 | var107 << 2) - 102 + 156 & 0) >> 16 | ((var107 & '쀀') >> 14 | var107 << 2) - 102 + 156 << 0) - 128);
                            /* jnt */((var234 | var108 << 0) - 128)
                            );
                          }

                          var11 = (kc)/* jnt */,
                            true
                          );
                          var36 = (-441528536 + 819531825 | 0) & -920125274;
                          var62 = (StringBuilder)/* jnt */;
                          break label224;
                        case 394371202:
                        default:
                          var10000.b = /* jnt */
                          );
                          var10000 = this;
                          var10001 = (-1649774407 * -1649774407 | 0) & 243335756;

                          for (var10002 = (StringBuilder)/* jnt */;
                            var10001 < ((1351101470 >> -1007050258 | 6) & -2076701426);
                            var10001 += -1355392284 << -1355392284 ^ -211440063
                          ) {
                            char var103 = /* jnt */;
                            char var104 = (char)((((var103 & '\uffc0') >> 6 | var103 << '\n') ^ 5) + 252 ^ 232 ^ 176);
                            /* jnt */((((var103 & '\uffc0') >> 6 | var103 << '\n') ^ 5) + 252 ^ 232 ^ 176)
                            );
                          }

                          var11 = (kc)/* jnt */,
                            true
                          );
                          var36 = 852628132 << -1806095015 * -1747221546 ^ -1266374400;
                          var62 = (StringBuilder)/* jnt */;
                          break label216;
                      }
                    }

                    var1 = -82276884 >> 1735532774 ^ 1719586192;
                  }

                  var1 = -507227169 * 16820075 ^ -1248426832;
                }

                var1 = (2033692579 >>> 1121981232 | -587557160) & -587540488;
              }

              var1 = -703893464 * (707585476 - -703893464) ^ -1551646230;
            }

            var1 = -1494128277 << -1494128277 ^ -287261846;
          }

          var1 = (754235831 & -596276244 | -997697949) & -997621897;
        }

        var1 = -1049180481 - -1807862984 ^ 1926539812;
      }
    }
  }

  @yet
  public void za(by var1) {
    int var10 = 359991956;
    if (null /* jnt:encrypted */
        )
        != null
      && null /* jnt:encrypted */
        )
        != null) {
      var10 = 1650999912 + 1650999912 ^ 489663886;
    } else {
      var10 = -2138226041 << -2138226041 ^ 1154801709;
    }

    switch (var10 - 441267643 + 328523348 + 1935805650 + 1223988022 ^ 611767307 ^ 161588088) {
      case -1782277315:
        return;
      case -1572206964:
      default:
        /* jnt */
        );
        class_243 var2 = /* jnt */
            )
          )
        );
        double var3 = /* jnt */)
          * /* jnt */);
        cd var5 = (cd)/* jnt */null /* jnt:encrypted */), cd.class
        );
        boolean var6 = /* jnt *//* jnt */null /* jnt:encrypted */), oy.class
          )
        );
        Iterator var7 = /* jnt */
            )
          )
        );

        label87:
        while (true) {
          var10 = (559883358 - -1884949009 | 1018057347) & 1022252675;

          while (true) {
            switch (((var10 ^ 249178468) + 1771177912 - 2059119132 ^ 338306154) - 763067862 - 1148895021) {
              case -1016415002:
                if (/* jnt */) {
                  class_1297 var8 = (Entity)/* jnt */;
                  if (!(
                    /* jnt */
                      > var3
                  )) {
                    var10 = (601887553 >> -643622614 | 2047262978) & -78719525;

                    while (true) {
                      label78:
                      switch (((var10 - 2142477148 ^ 363066192) + 1333489815 - 1909637002 ^ 299720869) - 1424049174) {
                        case -2019896176:
                          if (!(var8 instanceof class_1657 var9)) {
                            var10 = (-1121799201 >> -1121799201 | 9994240) & -860252078;
                            continue;
                          }

                          if (!/* jnt */)) {
                            continue label87;
                          }

                          var10 = 471099753 >>> -540924835 ^ 1773458408;

                          while (true) {
                            switch (((var10 ^ 756238768) + 348747699 ^ 1383657818 ^ 1261437013) + 458166672 - 757964697) {
                              case 777737467:
                              default:
                                if (/* jnt */)
                                  && /* jnt */,
                                    /* jnt */
                                      )
                                    )
                                  )) {
                                  continue label87;
                                }

                                var10 = -1990850190 - -1990850190 ^ 1977489679;
                                break;
                              case 1660922740:
                                if (/* jnt */)
                                  && var5 != null
                                  && /* jnt */) {
                                  continue label87;
                                }
                                break label78;
                            }
                          }
                        case -1252250392:
                          /* jnt */, var8
                          );
                          continue label87;
                        case -760062976:
                        default:
                          if (!(var8 instanceof class_1542)
                            || !/* jnt */)) {
                            continue label87;
                          }
                      }

                      var10 = (-1020417639 << 1801226618 | -1958197382) & -1420134405;
                    }
                  }
                  continue label87;
                }

                var10 = (545335223 << 545335223 | -2031112038) & -956303106;
                break;
              case 824940269:
              default:
                /* jnt */,
                  /* jnt */var1x -> -/* jnt */
                  )
                );
                return;
            }
          }
        }
    }
  }

  @yet
  public void vn(xo var1) {
    int var17 = -1610959503;
    if (null /* jnt:encrypted */
        )
        != null
      && null /* jnt:encrypted */
        )
        != null
      && !/* jnt */
      )) {
      var17 = 79310648 >>> 79310648 ^ 1474310383;
    } else {
      var17 = 1314755878 << 636876109 ^ -277286229;
    }

    switch (((var17 - 1663705485 ^ 1289989725) + 1262302722 ^ 2085744806) - 1726168304 + 103630015) {
      case 489229746:
      default:
        return;
      case 520957810:
        class_332 var2 = null /* jnt:encrypted */;
        float var3 = null /* jnt:encrypted */;
        Iterator var4 = /* jnt */
        );

        label61:
        while (true) {
          var17 = 1406976075 ^ (1406976075 | 879033638) ^ -1856870097;

          while (true) {
            switch (((var17 - 1316003797 + 481288789 ^ 1347129389) + 2096162831 ^ 1289542211) - 1668150857) {
              case -1194836307:
                if (/* jnt */) {
                  class_1297 var5 = (Entity)/* jnt */;
                  double var6 = /* jnt */var3,
                    null /* jnt:encrypted */,
                    /* jnt */
                  );
                  double var8 = /* jnt */var3,
                    null /* jnt:encrypted */,
                    /* jnt */
                  );
                  double var10 = /* jnt */var3,
                    null /* jnt:encrypted */,
                    /* jnt */
                  );
                  double var12 = var8
                    + (double)/* jnt */
                    + (var5 instanceof class_1542 ? 0.25 : 0.5);
                  Vector3f var14 = /* jnt */;
                  if (var14 != null) {
                    var17 = 833152486 - 833152486 ^ 421008639;

                    while (true) {
                      switch (((var17 + 627972344 - 1945554044 ^ 869811096) - 859160912 ^ 1114337787) + 598821979) {
                        case -1476698941:
                        default:
                          if (var5 instanceof class_1657 var15) {
                            /* jnt */,
                              null /* jnt:encrypted */
                            );
                            break;
                          }

                          var17 = (-1448600819 >>> -1448600819 | 1335564958) & 1339808414;
                          continue;
                        case -1234125876:
                          continue label61;
                        case -508584156:
                          if (var5 instanceof class_1542 var16) {
                            /* jnt */,
                              null /* jnt:encrypted */
                            );
                          }
                      }

                      var17 = 843776722 & 843776722 ^ -1273934572;
                    }
                  }
                  continue label61;
                }

                var17 = (325786337 << 325786337 | 1837817624) & 2141912984;
                break;
              case 1128294846:
              default:
                return;
            }
          }
        }
    }
  }
  public void sr(class_332 var1, class_1657 var2, float var3, float var4) {
    int var40 = -2021023802;
    cd var5 = (cd)/* jnt */null /* jnt:encrypted */), cd.class
    );
    boolean var6 = var5 != null && /* jnt */;
    px var7 = (px)/* jnt */null /* jnt:encrypted */), px.class
    );
    String var8 = var7 != null
        && /* jnt */
        && var2
          == null /* jnt:encrypted */
          )
      ? /* jnt */
      : /* jnt */
      );
    float var9 = /* jnt */;
    float var10 = /* jnt */ + var9;
    float var11 = /* jnt */ + var9;
    float var12 = var11 > 0.0F ? var10 / var11 : 0.0F;
    int var13 = /* jnt */;
    int var10000;
    if (var12 <= 0.33F) {
      var10000 = -59111;
    } else {
      var40 = -2086154007 + 610404451 ^ -2063295285;

      label534:
      while (true) {
        switch (var40 + 1871133720 + 1763499159 - 1734665697 - 1197877663 - 1332519239 - 1086123430) {
          case -960708663:
          default:
            if (var12 <= 0.66F) {
              var10000 = -23296;
              break label534;
            }

            var40 = (48956958 >> 48956958 | -2111625602) & -558139394;
            break;
          case 466788544:
            var10000 = -15074279;
            break label534;
        }
      }
    }

    int var14 = var10000;
    int var15 = var6 ? -16725761 : var14;
    String var16 = /* jnt */)
      ? /* jnt */
      : "";
    String var17 = "";
    StringBuilder var127;
    int var10001;
    StringBuilder var10002;
    if (/* jnt */)) {
      if (/* jnt */
        )
        != null) {
        class_640 var18 = /* jnt */
          ),
          /* jnt */
        );
        int var37 = var18 != null ? /* jnt */ : 0;
        var127 = /* jnt *//* jnt */, var37
        );
        var10001 = (734775132 + 734775132 | 0) & 537419843;
        var10002 = (StringBuilder)/* jnt */;
      } else {
        var40 = (248931389 | -1647684517 - (248931389 & -1647684517)) ^ -254582931;
        switch ((var40 ^ 1599387957 ^ 1201868741) - 505366984 + 1194144912 + 1038163305 - 596201095) {
          case -1151314036:
          default:
            Object var43 = null;
            int var102 = var43 != null ? /* jnt */ : 0;
            var127 = /* jnt *//* jnt */, var102
            );
            var10001 = (734775132 + 734775132 | 0) & 537419843;
            var10002 = (StringBuilder)/* jnt */;
            break;
          case -626964326:
            String var42 = "";
            if (/* jnt */)) {
              double var19 = (double)/* jnt *//* jnt */
                      )
                    )
                    * 10.0
                )
                / 10.0;
              var42 = /* jnt *//* jnt */, var19
                  ),
                  "m"
                )
              );
            }

            /* jnt */
              )
            );
            byte var48 = 9;
            int var20 = /* jnt */
              ),
              var8
            );
            int var21 = 0;
            if (!/* jnt */) {
              var21 += /* jnt */
                ),
                var16
              );
            }

            var40 = 11861336 * -1302342891 ^ -963357451;

            label382:
            while (true) {
              label385:
              while (true) {
                label388: {
                  label390: {
                    label392: {
                      label394: {
                        label396: {
                          switch (((var40 ^ 273959636 ^ 1881366424) + 114655612 - 1343764210 ^ 1217651016) - 88077817) {
                            case -1919594056:
                            default:
                              var10000 = 4 + var20;
                              if (var21 > 0) {
                                var10001 = 3 + var21;
                                break label396;
                              }

                              var40 = (1848196342 << -1603080844 | 481786) & 582973947;
                              break;
                            case -1012676790:
                              if (/* jnt */) {
                                break label385;
                              }

                              var10000 = var21;
                              if (var21 > 0) {
                                var10001 = 2;
                                break label394;
                              }

                              var40 = (-284467224 << -140614751 | 966125580) & 1039526174;
                              break;
                            case -228164353:
                              if (/* jnt */) {
                                break label388;
                              }

                              var10000 = var21;
                              if (var21 > 0) {
                                var10001 = 2;
                                break label392;
                              }

                              var40 = (1005283350 >> -683720045 | 542310331) & -9175045;
                          }

                          switch (((var40 ^ 1633060227) - 810003476 ^ 903829508) - 1666138919 + 477846928 + 1180815350) {
                            case 109269696:
                              var10001 = 0;
                              break;
                            case 422740718:
                            default:
                              var10001 = 0;
                              break label394;
                            case 619806911:
                              var10001 = 0;
                              break label392;
                          }
                        }

                        var40 = -1465908868 ^ 1897306069 ^ -1536209407;
                        break label390;
                      }

                      var40 = -1916495114 >>> -1916495114 ^ -406093388;
                      break label390;
                    }

                    var40 = 1926331945 >> 1411796113 ^ 23590210;
                  }

                  switch ((var40 + 271740507 + 949643715 + 1870881430 - 1346435236 ^ 587593450) + 518290015) {
                    case -1950110248:
                      var21 = var10000
                        + var10001
                        + /* jnt */
                          ),
                          var17
                        );
                      break label385;
                    case -439261519:
                      int var22 = var10000 + var10001 + 3;
                      int var23 = 3 + var48 + 3;
                      int var24 = var23 + (/* jnt */) ? 2 : 0);
                      float var25 = (float)/* jnt */);
                      Matrix3x2fStack var26 = /* jnt */;
                      /* jnt */;
                      /* jnt */;
                      /* jnt */;
                      /* jnt */;
                      int var27 = (int)(var3 - (float)var22 / 2.0F);
                      int var28 = (int)(var4 - (float)var24);
                      /* jnt */;
                      /* jnt */;
                      int var29 = var28 + 3;
                      /* jnt */
                        ),
                        var8,
                        var27 + 1 + 3,
                        var29,
                        var6 ? -16725761 : -1,
                        true
                      );
                      int var30 = var27 + var22 - 3;
                      if (!/* jnt */) {
                        int var31 = /* jnt */
                          ),
                          var42
                        );
                        var30 -= var31;
                        /* jnt */
                          ),
                          var42,
                          var30,
                          var29,
                          -5592406,
                          true
                        );
                        var30 -= 2;
                      }

                      var40 = (1592981085 >> 1748436638 | 2103003456) & 2145339770;

                      label446:
                      while (true) {
                        label449:
                        switch ((var40 - 1522493270 ^ 757830030) - 892310052 - 1405101824 + 1477378275 + 1340560119) {
                          case -961852514:
                            /* jnt */;
                            return;
                          case -823931748:
                            if (!/* jnt */) {
                              int var83 = /* jnt */
                                ),
                                var16
                              );
                              var30 -= var83;
                              /* jnt */
                                ),
                                var16,
                                var30,
                                var29,
                                var14,
                                true
                              );
                            }

                            var40 = -2030044413 - -1068588295 ^ -264933595;
                            break;
                          case -386495078:
                            if (/* jnt */)) {
                              /* jnt */;
                            }

                            var40 = 309282456 >> 1665710439 ^ -446015951;
                            break;
                          case 368441613:
                          default:
                            if (/* jnt */)) {
                              int var82 = var27 + 1;
                              int var32 = var28 + var23;
                              int var33 = var22 - 1;
                              /* jnt */;
                              int var34 = (int)((float)var33 * /* jnt */);
                              if (var34 > 0) {
                                if (var12 <= 0.33F) {
                                  var10000 = -43691;
                                } else {
                                  var40 = (-795537832 & 1329735018 | -1307567166) & -31728694;

                                  label482:
                                  while (true) {
                                    label484:
                                    switch ((var40 - 1898714876 ^ 1241168569 ^ 1266750998) + 1557396909 + 957207097 - 1188054255) {
                                      case -1447900597:
                                      default:
                                        var10000 = -11141291;
                                        break label482;
                                      case -776916136:
                                    }

                                    if (var12 <= 0.66F) {
                                      var10000 = -13244;
                                      break;
                                    }

                                    var40 = (910602283 ^ -2063315077 | -939087641) & -836785417;
                                  }
                                }

                                int var35 = var10000;
                                if (var12 <= 0.33F) {
                                  var10000 = -3403503;
                                } else {
                                  var40 = (1415237371 | 1415237371 | -1559875200) & -209242649;

                                  label500:
                                  while (true) {
                                    label502:
                                    switch (((var40 ^ 1864315194) + 392525875 - 575356961 + 2094542231 ^ 1474714550) - 1445468931) {
                                      case -1112644495:
                                      default:
                                        var10000 = -15610863;
                                        break label500;
                                      case 63247921:
                                    }

                                    if (var12 <= 0.66F) {
                                      var10000 = -3368670;
                                      break;
                                    }

                                    var40 = (-1259009162 >> 222779678 | 16812579) & -1121808861;
                                  }
                                }

                                int var36 = var10000;
                                /* jnt */;
                                /* jnt */;
                              }
                            }

                            var40 = (-709873987 - -42385163 | 931250752) & 1065605840;
                            break;
                          case 783878938:
                            if (!/* jnt */) {
                              int var81 = /* jnt */
                                ),
                                var17
                              );
                              var30 -= var81;
                              /* jnt */
                                ),
                                var17,
                                var30,
                                var29,
                                -15422806,
                                true
                              );
                              var30 -= 2;
                            }

                            var40 = 71821263 >> 1623383838 ^ -575273026;
                        }
                      }
                    case 1767338799:
                    default:
                      var21 = var10000
                        + var10001
                        + /* jnt */
                          ),
                          var42
                        );
                  }
                }

                var40 = (-557451144 | 944398138 | 1107167523) & 1140738471;
              }

              var40 = -1575052368 - -1237984181 ^ -2081955057;
            }
        }
      }
    } else {
      var40 = 1263003377 >> -23147698 * -23147698 ^ -1955051921;
      switch ((var40 ^ 1599387957 ^ 1201868741) - 505366984 + 1194144912 + 1038163305 - 596201095) {
        case -1151314036:
        default:
          Object var45 = null;
          int var103 = var45 != null ? /* jnt */ : 0;
          var127 = /* jnt *//* jnt */, var103
          );
          var10001 = (734775132 + 734775132 | 0) & 537419843;
          var10002 = (StringBuilder)/* jnt */;
          break;
        case -626964326:
          String var44 = "";
          if (/* jnt */)) {
            double var49 = (double)/* jnt *//* jnt */
                    )
                  )
                  * 10.0
              )
              / 10.0;
            var44 = /* jnt *//* jnt */, var49
                ),
                "m"
              )
            );
          }

          /* jnt */
            )
          );
          byte var50 = 9;
          int var53 = /* jnt */
            ),
            var8
          );
          int var55 = 0;
          if (!/* jnt */) {
            var55 += /* jnt */
              ),
              var16
            );
          }

          var40 = 11861336 * -1302342891 ^ -963357451;

          label231:
          while (true) {
            label234:
            while (true) {
              label237: {
                label239: {
                  label241: {
                    label243: {
                      label245: {
                        switch (((var40 ^ 273959636 ^ 1881366424) + 114655612 - 1343764210 ^ 1217651016) - 88077817) {
                          case -1919594056:
                          default:
                            var10000 = 4 + var53;
                            if (var55 > 0) {
                              var10001 = 3 + var55;
                              break label245;
                            }

                            var40 = (1848196342 << -1603080844 | 481786) & 582973947;
                            break;
                          case -1012676790:
                            if (/* jnt */) {
                              break label234;
                            }

                            var10000 = var55;
                            if (var55 > 0) {
                              var10001 = 2;
                              break label243;
                            }

                            var40 = (-284467224 << -140614751 | 966125580) & 1039526174;
                            break;
                          case -228164353:
                            if (/* jnt */) {
                              break label237;
                            }

                            var10000 = var55;
                            if (var55 > 0) {
                              var10001 = 2;
                              break label241;
                            }

                            var40 = (1005283350 >> -683720045 | 542310331) & -9175045;
                        }

                        switch (((var40 ^ 1633060227) - 810003476 ^ 903829508) - 1666138919 + 477846928 + 1180815350) {
                          case 109269696:
                            var10001 = 0;
                            break;
                          case 422740718:
                          default:
                            var10001 = 0;
                            break label243;
                          case 619806911:
                            var10001 = 0;
                            break label241;
                        }
                      }

                      var40 = -1465908868 ^ 1897306069 ^ -1536209407;
                      break label239;
                    }

                    var40 = -1916495114 >>> -1916495114 ^ -406093388;
                    break label239;
                  }

                  var40 = 1926331945 >> 1411796113 ^ 23590210;
                }

                switch ((var40 + 271740507 + 949643715 + 1870881430 - 1346435236 ^ 587593450) + 518290015) {
                  case -1950110248:
                    var55 = var10000
                      + var10001
                      + /* jnt */
                        ),
                        var17
                      );
                    break label234;
                  case -439261519:
                    int var57 = var10000 + var10001 + 3;
                    int var59 = 3 + var50 + 3;
                    int var61 = var59 + (/* jnt */) ? 2 : 0);
                    float var63 = (float)/* jnt */);
                    Matrix3x2fStack var65 = /* jnt */;
                    /* jnt */;
                    /* jnt */;
                    /* jnt */;
                    /* jnt */;
                    int var67 = (int)(var3 - (float)var57 / 2.0F);
                    int var69 = (int)(var4 - (float)var61);
                    /* jnt */;
                    /* jnt */;
                    int var71 = var69 + 3;
                    /* jnt */
                      ),
                      var8,
                      var67 + 1 + 3,
                      var71,
                      var6 ? -16725761 : -1,
                      true
                    );
                    int var75 = var67 + var57 - 3;
                    if (!/* jnt */) {
                      int var84 = /* jnt */
                        ),
                        var44
                      );
                      var75 -= var84;
                      /* jnt */
                        ),
                        var44,
                        var75,
                        var71,
                        -5592406,
                        true
                      );
                      var75 -= 2;
                    }

                    var40 = (1592981085 >> 1748436638 | 2103003456) & 2145339770;

                    label295:
                    while (true) {
                      label298:
                      switch ((var40 - 1522493270 ^ 757830030) - 892310052 - 1405101824 + 1477378275 + 1340560119) {
                        case -961852514:
                          /* jnt */;
                          return;
                        case -823931748:
                          if (!/* jnt */) {
                            int var87 = /* jnt */
                              ),
                              var16
                            );
                            var75 -= var87;
                            /* jnt */
                              ),
                              var16,
                              var75,
                              var71,
                              var14,
                              true
                            );
                          }

                          var40 = -2030044413 - -1068588295 ^ -264933595;
                          break;
                        case -386495078:
                          if (/* jnt */)) {
                            /* jnt */;
                          }

                          var40 = 309282456 >> 1665710439 ^ -446015951;
                          break;
                        case 368441613:
                        default:
                          if (/* jnt */)) {
                            int var86 = var67 + 1;
                            int var92 = var69 + var59;
                            int var94 = var57 - 1;
                            /* jnt */;
                            int var96 = (int)((float)var94 * /* jnt */);
                            if (var96 > 0) {
                              if (var12 <= 0.33F) {
                                var10000 = -43691;
                              } else {
                                var40 = (-795537832 & 1329735018 | -1307567166) & -31728694;

                                label331:
                                while (true) {
                                  label333:
                                  switch ((var40 - 1898714876 ^ 1241168569 ^ 1266750998) + 1557396909 + 957207097 - 1188054255) {
                                    case -1447900597:
                                    default:
                                      var10000 = -11141291;
                                      break label331;
                                    case -776916136:
                                  }

                                  if (var12 <= 0.66F) {
                                    var10000 = -13244;
                                    break;
                                  }

                                  var40 = (910602283 ^ -2063315077 | -939087641) & -836785417;
                                }
                              }

                              int var98 = var10000;
                              if (var12 <= 0.33F) {
                                var10000 = -3403503;
                              } else {
                                var40 = (1415237371 | 1415237371 | -1559875200) & -209242649;

                                label349:
                                while (true) {
                                  label351:
                                  switch (((var40 ^ 1864315194) + 392525875 - 575356961 + 2094542231 ^ 1474714550) - 1445468931) {
                                    case -1112644495:
                                    default:
                                      var10000 = -15610863;
                                      break label349;
                                    case 63247921:
                                  }

                                  if (var12 <= 0.66F) {
                                    var10000 = -3368670;
                                    break;
                                  }

                                  var40 = (-1259009162 >> 222779678 | 16812579) & -1121808861;
                                }
                              }

                              int var100 = var10000;
                              /* jnt */;
                              /* jnt */;
                            }
                          }

                          var40 = (-709873987 - -42385163 | 931250752) & 1065605840;
                          break;
                        case 783878938:
                          if (!/* jnt */) {
                            int var85 = /* jnt */
                              ),
                              var17
                            );
                            var75 -= var85;
                            /* jnt */
                              ),
                              var17,
                              var75,
                              var71,
                              -15422806,
                              true
                            );
                            var75 -= 2;
                          }

                          var40 = 71821263 >> 1623383838 ^ -575273026;
                      }
                    }
                  case 1767338799:
                  default:
                    var55 = var10000
                      + var10001
                      + /* jnt */
                        ),
                        var44
                      );
                }
              }

              var40 = (-557451144 | 944398138 | 1107167523) & 1140738471;
            }

            var40 = -1575052368 - -1237984181 ^ -2081955057;
          }
      }
    }

    while (true) {
      while (var10001 >= ((-1381254549 >> 1678870011 | 2) & 2)) {
        var17 = /* jnt */
          )
        );
        var40 = 1263003377 >> -23147698 * -23147698 ^ -1955051921;
        switch ((var40 ^ 1599387957 ^ 1201868741) - 505366984 + 1194144912 + 1038163305 - 596201095) {
          case -1151314036:
          default:
            Object var47 = null;
            int var104 = var47 != null ? /* jnt */ : 0;
            var127 = /* jnt *//* jnt */, var104
            );
            var10001 = (734775132 + 734775132 | 0) & 537419843;
            var10002 = (StringBuilder)/* jnt */;
            break;
          case -626964326:
            String var46 = "";
            if (/* jnt */)) {
              double var51 = (double)/* jnt *//* jnt */
                      )
                    )
                    * 10.0
                )
                / 10.0;
              var46 = /* jnt *//* jnt */, var51
                  ),
                  "m"
                )
              );
            }

            /* jnt */
              )
            );
            byte var52 = 9;
            int var54 = /* jnt */
              ),
              var8
            );
            int var56 = 0;
            if (!/* jnt */) {
              var56 += /* jnt */
                ),
                var16
              );
            }

            var40 = 11861336 * -1302342891 ^ -963357451;

            while (true) {
              label197:
              while (true) {
                label195: {
                  label194: {
                    label193: {
                      label192: {
                        label191: {
                          switch (((var40 ^ 273959636 ^ 1881366424) + 114655612 - 1343764210 ^ 1217651016) - 88077817) {
                            case -1919594056:
                            default:
                              var10000 = 4 + var54;
                              if (var56 > 0) {
                                var10001 = 3 + var56;
                                break label191;
                              }

                              var40 = (1848196342 << -1603080844 | 481786) & 582973947;
                              break;
                            case -1012676790:
                              if (/* jnt */) {
                                break label197;
                              }

                              var10000 = var56;
                              if (var56 > 0) {
                                var10001 = 2;
                                break label192;
                              }

                              var40 = (-284467224 << -140614751 | 966125580) & 1039526174;
                              break;
                            case -228164353:
                              if (/* jnt */) {
                                break label195;
                              }

                              var10000 = var56;
                              if (var56 > 0) {
                                var10001 = 2;
                                break label193;
                              }

                              var40 = (1005283350 >> -683720045 | 542310331) & -9175045;
                          }

                          switch (((var40 ^ 1633060227) - 810003476 ^ 903829508) - 1666138919 + 477846928 + 1180815350) {
                            case 109269696:
                              var10001 = 0;
                              break;
                            case 422740718:
                            default:
                              var10001 = 0;
                              break label192;
                            case 619806911:
                              var10001 = 0;
                              break label193;
                          }
                        }

                        var40 = -1465908868 ^ 1897306069 ^ -1536209407;
                        break label194;
                      }

                      var40 = -1916495114 >>> -1916495114 ^ -406093388;
                      break label194;
                    }

                    var40 = 1926331945 >> 1411796113 ^ 23590210;
                  }

                  switch ((var40 + 271740507 + 949643715 + 1870881430 - 1346435236 ^ 587593450) + 518290015) {
                    case -1950110248:
                      var56 = var10000
                        + var10001
                        + /* jnt */
                          ),
                          var17
                        );
                      break label197;
                    case -439261519:
                      int var58 = var10000 + var10001 + 3;
                      int var60 = 3 + var52 + 3;
                      int var62 = var60 + (/* jnt */) ? 2 : 0);
                      float var64 = (float)/* jnt */);
                      Matrix3x2fStack var66 = /* jnt */;
                      /* jnt */;
                      /* jnt */;
                      /* jnt */;
                      /* jnt */;
                      int var68 = (int)(var3 - (float)var58 / 2.0F);
                      int var70 = (int)(var4 - (float)var62);
                      /* jnt */;
                      /* jnt */;
                      int var72 = var70 + 3;
                      /* jnt */
                        ),
                        var8,
                        var68 + 1 + 3,
                        var72,
                        var6 ? -16725761 : -1,
                        true
                      );
                      int var78 = var68 + var58 - 3;
                      if (!/* jnt */) {
                        int var88 = /* jnt */
                          ),
                          var46
                        );
                        var78 -= var88;
                        /* jnt */
                          ),
                          var46,
                          var78,
                          var72,
                          -5592406,
                          true
                        );
                        var78 -= 2;
                      }

                      var40 = (1592981085 >> 1748436638 | 2103003456) & 2145339770;

                      while (true) {
                        switch ((var40 - 1522493270 ^ 757830030) - 892310052 - 1405101824 + 1477378275 + 1340560119) {
                          case -961852514:
                            /* jnt */;
                            return;
                          case -823931748:
                            if (!/* jnt */) {
                              int var91 = /* jnt */
                                ),
                                var16
                              );
                              var78 -= var91;
                              /* jnt */
                                ),
                                var16,
                                var78,
                                var72,
                                var14,
                                true
                              );
                            }

                            var40 = -2030044413 - -1068588295 ^ -264933595;
                            break;
                          case -386495078:
                            if (/* jnt */)) {
                              /* jnt */;
                            }

                            var40 = 309282456 >> 1665710439 ^ -446015951;
                            break;
                          case 368441613:
                          default:
                            if (/* jnt */)) {
                              int var90 = var68 + 1;
                              int var93 = var70 + var60;
                              int var95 = var58 - 1;
                              /* jnt */;
                              int var97 = (int)((float)var95 * /* jnt */);
                              if (var97 > 0) {
                                if (var12 <= 0.33F) {
                                  var10000 = -43691;
                                } else {
                                  var40 = (-795537832 & 1329735018 | -1307567166) & -31728694;

                                  label158:
                                  while (true) {
                                    switch ((var40 - 1898714876 ^ 1241168569 ^ 1266750998) + 1557396909 + 957207097 - 1188054255) {
                                      case -1447900597:
                                      default:
                                        var10000 = -11141291;
                                        break label158;
                                      case -776916136:
                                    }

                                    if (var12 <= 0.66F) {
                                      var10000 = -13244;
                                      break;
                                    }

                                    var40 = (910602283 ^ -2063315077 | -939087641) & -836785417;
                                  }
                                }

                                int var99 = var10000;
                                if (var12 <= 0.33F) {
                                  var10000 = -3403503;
                                } else {
                                  var40 = (1415237371 | 1415237371 | -1559875200) & -209242649;

                                  label147:
                                  while (true) {
                                    switch (((var40 ^ 1864315194) + 392525875 - 575356961 + 2094542231 ^ 1474714550) - 1445468931) {
                                      case -1112644495:
                                      default:
                                        var10000 = -15610863;
                                        break label147;
                                      case 63247921:
                                    }

                                    if (var12 <= 0.66F) {
                                      var10000 = -3368670;
                                      break;
                                    }

                                    var40 = (-1259009162 >> 222779678 | 16812579) & -1121808861;
                                  }
                                }

                                int var101 = var10000;
                                /* jnt */;
                                /* jnt */;
                              }
                            }

                            var40 = (-709873987 - -42385163 | 931250752) & 1065605840;
                            break;
                          case 783878938:
                            if (!/* jnt */) {
                              int var89 = /* jnt */
                                ),
                                var17
                              );
                              var78 -= var89;
                              /* jnt */
                                ),
                                var17,
                                var78,
                                var72,
                                -15422806,
                                true
                              );
                              var78 -= 2;
                            }

                            var40 = 71821263 >> 1623383838 ^ -575273026;
                        }
                      }
                    case 1767338799:
                    default:
                      var56 = var10000
                        + var10001
                        + /* jnt */
                          ),
                          var46
                        );
                  }
                }

                var40 = (-557451144 | 944398138 | 1107167523) & 1140738471;
              }

              var40 = -1575052368 - -1237984181 ^ -2081955057;
            }
        }
      }

      char var142 = /* jnt */;
      char var145 = (char)(
        (
            ((((((var142 & '\uffff') >> 0 | var142 << 16) ^ 184) & 61440) >> 12 | (((var142 & '\uffff') >> 0 | var142 << 16) ^ 184) << 4) & 64512) >> 10
              | (((((var142 & '\uffff') >> 0 | var142 << 16) ^ 184) & 61440) >> 12 | (((var142 & '\uffff') >> 0 | var142 << 16) ^ 184) << 4) << 6
          )
          - 43
      );
      /* jnt */(
          (
              ((((((var142 & '\uffff') >> 0 | var142 << 16) ^ 184) & 61440) >> 12 | (((var142 & '\uffff') >> 0 | var142 << 16) ^ 184) << 4) & 64512) >> 10
                | (((((var142 & '\uffff') >> 0 | var142 << 16) ^ 184) & 61440) >> 12 | (((var142 & '\uffff') >> 0 | var142 << 16) ^ 184) << 4) << 6
            )
            - 43
        )
      );
      var10001 += 1821096005 * -1294797806 ^ -267470629;
    }
  }
  public void f(class_332 var1, class_1657 var2, float var3, int var4) {
    int var16 = 2107775605;
    class_1799[] var5 = new class_1799[]{
      /* jnt */,
      /* jnt */
      ),
      /* jnt */
      ),
      /* jnt */
      ),
      /* jnt */
      ),
      /* jnt */
    };
    int var6 = 0;
    class_1799[] var7 = var5;
    int var8 = var5.length;
    int var9 = 0;

    label63:
    while (true) {
      var16 = 1810468686 & 1226995449 ^ -1903909067;

      while (true) {
        switch ((var16 ^ 434549617) - 253320541 + 1669530247 - 1734708319 ^ 2064778986 ^ 518962906) {
          case -1363504409:
          default:
            if (var9 < var8) {
              class_1799 var20 = var7[var9];
              if (!/* jnt */) {
                var6++;
              }

              var9++;
              continue label63;
            }

            var16 = 59439010 ^ -641771826 ^ -1186036447;
            continue;
          case -357457326:
            byte var17 = 16;
            byte var18 = 2;
            var9 = var6 * var17 + (var6 - 1) * var18;
            int var10 = (int)(var3 - (float)var9 / 2.0F);
            int var11 = var4 - var17 - 2;
            class_1799[] var12 = var5;
            int var13 = var5.length;
            int var14 = 0;

            label50:
            while (true) {
              var16 = 1482777205 ^ 422005660 ^ 804238452;

              while (true) {
                switch (var16 + 2121393044 + 1273186056 - 1749962435 + 299218959 + 1492288028 ^ 387502843) {
                  case -1389127220:
                  default:
                    return;
                  case 744513882:
                }

                if (var14 < var13) {
                  class_1799 var15 = var12[var14];
                  if (/* jnt */) {
                    var16 = -472922459 & -552114017 ^ -1537882736;
                  } else {
                    var16 = 1208406336 >>> 1208406336 + -237483929 ^ -1271584198;
                  }

                  while (true) {
                    switch ((var16 - 304859364 - 447634276 - 1279536573 ^ 1737589534) + 889244685 ^ 1479824172) {
                      case -919834186:
                      default:
                        /* jnt */;
                        /* jnt */
                          ),
                          var15,
                          var10,
                          var11
                        );
                        var10 += var17 + var18;
                        var16 = -472922459 & -552114017 ^ -1537882736;
                        break;
                      case -426627273:
                        var14++;
                        continue label50;
                    }
                  }
                }

                var16 = -208774362 - 2010198507 ^ -1763632120;
              }
            }
          case 39651383:
        }

        if (var6 == 0) {
          return;
        }

        var16 = (-1871339294 >>> 192347592 | -1154510138) & -1066258;
      }
    }
  }

  public void pf(class_332 var1, class_1542 var2, float var3, float var4) {
    class_1799 var5 = /* jnt */;
    if (!/* jnt */) {
      String var6 = /* jnt */
      );
      String var10000;
      if (/* jnt */ > 1) {
        int var18 = /* jnt */;
        var10000 = /* jnt *//* jnt */, "x"
            ),
            var18
          )
        );
      } else {
        var10000 = "";
      }

      String var7 = var10000;
      int var8 = /* jnt */
        ),
        var6
      );
      int var9 = /* jnt */
        ? 0
        : 2
          + /* jnt */
            ),
            var7
          );
      int var10 = 4 + var8 + (var9 > 0 ? var9 : 0) + 3;
      /* jnt */
        )
      );
      int var11 = 3 + 9 + 3;
      float var12 = (float)/* jnt */);
      Matrix3x2fStack var13 = /* jnt */;
      /* jnt */;
      /* jnt */;
      /* jnt */;
      /* jnt */;
      int var14 = (int)(var3 - (float)var10 / 2.0F);
      int var15 = (int)(var4 - (float)var11);
      /* jnt */;
      /* jnt */;
      int var16 = var15 + 3;
      /* jnt */
        ),
        var6,
        var14 + 1 + 3,
        var16,
        -1,
        true
      );
      if (!/* jnt */) {
        int var17 = var14
          + var10
          - 3
          - /* jnt */
            ),
            var7
          );
        /* jnt */
          ),
          var7,
          var17,
          var16,
          -1525469,
          true
        );
      }

      /* jnt */;
    }
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = var10 + 728103506 - 1985470332 - 276458560 + 117601084 - 992941507 + 928304082 - 1732639021 + 2051983330 ^ 1986084875;
    MethodHandle var10000 = fuf[var10 + 728103506 - 1985470332 - 276458560 + 117601084 - 992941507 + 928304082 - 1732639021 + 2051983330
      ^ 1986084875
      ^ 1858317679];
    if (fuf[var10001 ^ 1858317679] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (-1988710232 >> 1167582844 | 0) & 6; var23 < var13.length(); var23 += -2106422797 ^ -2106422797 ^ 1) {
        int var42 = var13.charAt(var23);
        int var10004 = (var42 & 65535) >> 0;
        int var43 = ((var42 & 65535) >> 0 | var42 << 16) ^ 236;
        int var87 = ((((var42 & 65535) >> 0 | var42 << 16) ^ 236) & 65535) >> 0;
        var42 = ((((var10004 | var42 << 16) ^ 236) & 65535) >> 0 | (((var42 & 65535) >> 0 | var42 << 16) ^ 236) << 16) - 43;
        var10004 = ((var87 | var43 << 16) - 43 & 65528) >> 3;
        int var45 = (((var87 | var43 << 16) - 43 & 65528) >> 3 | var42 << 13) - 50;
        int var89 = ((((var87 | var43 << 16) - 43 & 65528) >> 3 | var42 << 13) - 50 & 65535) >> 0;
        var42 = (((var10004 | var42 << 13) - 50 & 65535) >> 0 | (((var87 | var43 << 16) - 43 & 65528) >> 3 | var42 << 13) - 50 << 16) - 237;
        var10004 = ((var89 | var45 << 16) - 237 & 65472) >> 6;
        int var47 = ((var89 | var45 << 16) - 237 & 65472) >> 6 | var42 << 10;
        int var91 = ((((var89 | var45 << 16) - 237 & 65472) >> 6 | var42 << 10) & 57344) >> 13;
        char var48 = (char)(((var10004 | var42 << 10) & 57344) >> 13 | (((var89 | var45 << 16) - 237 & 65472) >> 6 | var42 << 10) << 3);
        var13.setCharAt(var23, (char)(var91 | var47 << 3));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (1096216097 ^ -2144021811 | 0) & 881426689; var29 < var16.length(); var29 += (1651368650 << 1651368650 | 1) & 1208014593) {
        int var53 = var16.charAt(var29) + 210 ^ 128 ^ 134;
        char var56 = (char)(
          (
                (
                    ((((((var53 & 65534) >> 1 | var53 << 15) & 49152) >> 14 | ((var53 & 65534) >> 1 | var53 << 15) << 2) ^ 242) & 61440) >> 12
                      | (((((var53 & 65534) >> 1 | var53 << 15) & 49152) >> 14 | ((var53 & 65534) >> 1 | var53 << 15) << 2) ^ 242) << 4
                  )
                  ^ 214
              )
              - 28
            ^ 218
        );
        var16.setCharAt(
          var29,
          (char)(
            (
                  (
                      ((((((var53 & 65534) >> 1 | var53 << 15) & 49152) >> 14 | ((var53 & 65534) >> 1 | var53 << 15) << 2) ^ 242) & 61440) >> 12
                        | (((((var53 & 65534) >> 1 | var53 << 15) & 49152) >> 14 | ((var53 & 65534) >> 1 | var53 << 15) << 2) ^ 242) << 4
                    )
                    ^ 214
                )
                - 28
              ^ 218
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), uc.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = 1880462965 >>> 1880462965 ^ 896; var35 < var19.length(); var35 += -1787920200 >> 296175418 ^ -28) {
        int var61 = var19.charAt(var35);
        int var95 = (var61 & 65528) >> 3;
        int var62 = ((var61 & 65528) >> 3 | var61 << 13) ^ 146;
        int var96 = ((((var61 & 65528) >> 3 | var61 << 13) ^ 146) & 49152) >> 14;
        var61 = (((var95 | var61 << 13) ^ 146) & 49152) >> 14 | (((var61 & 65528) >> 3 | var61 << 13) ^ 146) << 2;
        var95 = ((var96 | var62 << 2) & 63488) >> 11;
        int var64 = ((((var96 | var62 << 2) & 63488) >> 11 | var61 << 5) ^ 40 ^ 154 ^ 115) - 79;
        int var98 = (((((var96 | var62 << 2) & 63488) >> 11 | var61 << 5) ^ 40 ^ 154 ^ 115) - 79 & 65534) >> 1;
        char var65 = (char)(
          ((((var95 | var61 << 5) ^ 40 ^ 154 ^ 115) - 79 & 65534) >> 1 | ((((var96 | var62 << 2) & 63488) >> 11 | var61 << 5) ^ 40 ^ 154 ^ 115) - 79 << 15)
            - 148
        );
        var19.setCharAt(var35, (char)((var98 | var64 << 15) - 148));
      }

      Class var7 = Class.forName(var19.toString(), false, uc.class.getClassLoader());
      switch ((var4 + 1588019054 - 791618400 - 1684823696 - 2037400194 ^ 785313260) - 760150947 - 732605610 - 2102769619 ^ 1494947245 ^ 2123959938) {
        case 291027957:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 545421404:
        case 1501187897:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 740748621:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 1251650265:
          var10000 = var0.findSpecial(var7, var5, var6, uc.class);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    fuf[var10 + 728103506 - 1985470332 - 276458560 + 117601084 - 992941507 + 928304082 - 1732639021 + 2051983330 ^ 1986084875 ^ 1858317679] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (var10 - 1230363900 - 1808003452 ^ 2104533650) + 2026126590 + 130956536 + 590382101 ^ 1240607232 ^ 1438615052 ^ 1814270026;
    MethodHandle var10000 = fuf[((var10 - 1230363900 - 1808003452 ^ 2104533650) + 2026126590 + 130956536 + 590382101 ^ 1240607232 ^ 1438615052 ^ 1814270026)
      - 895714793];
    if (fuf[var10001 - 895714793] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = -439504861 >>> -115625969 ^ 117659; var24 < var14.length(); var24 += 1295578098 ^ -10834896 ^ -1302175805) {
        int var43 = var14.charAt(var24) ^ 230;
        char var48 = (char)(
          (
                (
                    (
                          (
                                (
                                      (((((var43 & 32768) >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & 32768) >> 15 | var43 << 1) << 16) + 219 & 32768) >> 15
                                        | ((((var43 & 32768) >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & 32768) >> 15 | var43 << 1) << 16) + 219 << 1
                                    )
                                    + 190
                                  ^ 79
                              )
                              - 12
                            & 32768
                        )
                        >> 15
                      | (
                            (
                                  (((((var43 & 32768) >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & 32768) >> 15 | var43 << 1) << 16) + 219 & 32768) >> 15
                                    | ((((var43 & 32768) >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & 32768) >> 15 | var43 << 1) << 16) + 219 << 1
                                )
                                + 190
                              ^ 79
                          )
                          - 12
                        << 1
                  )
                  & 65528
              )
              >> 3
            | (
                (
                      (
                            (
                                  (((((var43 & 32768) >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & 32768) >> 15 | var43 << 1) << 16) + 219 & 32768) >> 15
                                    | ((((var43 & 32768) >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & 32768) >> 15 | var43 << 1) << 16) + 219 << 1
                                )
                                + 190
                              ^ 79
                          )
                          - 12
                        & 32768
                    )
                    >> 15
                  | (
                        (
                              (((((var43 & 32768) >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & 32768) >> 15 | var43 << 1) << 16) + 219 & 32768) >> 15
                                | ((((var43 & 32768) >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & 32768) >> 15 | var43 << 1) << 16) + 219 << 1
                            )
                            + 190
                          ^ 79
                      )
                      - 12
                    << 1
              )
              << 13
        );
        var14.setCharAt(
          var24,
          (char)(
            (
                  (
                      (
                            (
                                  (
                                        (((((var43 & 32768) >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & 32768) >> 15 | var43 << 1) << 16) + 219 & 32768)
                                            >> 15
                                          | ((((var43 & 32768) >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & 32768) >> 15 | var43 << 1) << 16) + 219 << 1
                                      )
                                      + 190
                                    ^ 79
                                )
                                - 12
                              & 32768
                          )
                          >> 15
                        | (
                              (
                                    (((((var43 & 32768) >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & 32768) >> 15 | var43 << 1) << 16) + 219 & 32768) >> 15
                                      | ((((var43 & 32768) >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & 32768) >> 15 | var43 << 1) << 16) + 219 << 1
                                  )
                                  + 190
                                ^ 79
                            )
                            - 12
                          << 1
                    )
                    & 65528
                )
                >> 3
              | (
                  (
                        (
                              (
                                    (((((var43 & 32768) >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & 32768) >> 15 | var43 << 1) << 16) + 219 & 32768) >> 15
                                      | ((((var43 & 32768) >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & 32768) >> 15 | var43 << 1) << 16) + 219 << 1
                                  )
                                  + 190
                                ^ 79
                            )
                            - 12
                          & 32768
                      )
                      >> 15
                    | (
                          (
                                (((((var43 & 32768) >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & 32768) >> 15 | var43 << 1) << 16) + 219 & 32768) >> 15
                                  | ((((var43 & 32768) >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & 32768) >> 15 | var43 << 1) << 16) + 219 << 1
                              )
                              + 190
                            ^ 79
                        )
                        - 12
                      << 1
                )
                << 13
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = 104287022 >>> 1372236452 ^ 6517938; var30 < var17.length(); var30 += (251196324 << -156165935 | 1) & 3284157) {
        int var53 = var17.charAt(var30) - '3';
        char var54 = (char)((((var53 & 65408) >> 7 | var53 << 9) + 130 + 250 - 130 + 1 - 244 ^ 244 ^ 96) + 211);
        var17.setCharAt(var30, (char)((((var53 & 65408) >> 7 | var53 << 9) + 130 + 250 - 130 + 1 - 244 ^ 244 ^ 96) + 211));
      }

      Class var6 = Class.forName(var17.toString(), false, uc.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (-990946982 | -1088253475) ^ -1058337; var36 < var20.length(); var36 += 143681044 * 2035260714 ^ -361299127) {
        int var59 = (var20.charAt(var36) + 199 ^ 70) + 41;
        char var64 = (char)(
          (
                (
                      (
                          (
                                (
                                    (((((var59 & 49152) >> 14 | var59 << 2) & 65408) >> 7 | ((var59 & 49152) >> 14 | var59 << 2) << 9) & 57344) >> 13
                                      | ((((var59 & 49152) >> 14 | var59 << 2) & 65408) >> 7 | ((var59 & 49152) >> 14 | var59 << 2) << 9) << 3
                                  )
                                  & 65024
                              )
                              >> 9
                            | (
                                (((((var59 & 49152) >> 14 | var59 << 2) & 65408) >> 7 | ((var59 & 49152) >> 14 | var59 << 2) << 9) & 57344) >> 13
                                  | ((((var59 & 49152) >> 14 | var59 << 2) & 65408) >> 7 | ((var59 & 49152) >> 14 | var59 << 2) << 9) << 3
                              )
                              << 7
                        )
                        & 57344
                    )
                    >> 13
                  | (
                      (
                            (
                                (((((var59 & 49152) >> 14 | var59 << 2) & 65408) >> 7 | ((var59 & 49152) >> 14 | var59 << 2) << 9) & 57344) >> 13
                                  | ((((var59 & 49152) >> 14 | var59 << 2) & 65408) >> 7 | ((var59 & 49152) >> 14 | var59 << 2) << 9) << 3
                              )
                              & 65024
                          )
                          >> 9
                        | (
                            (((((var59 & 49152) >> 14 | var59 << 2) & 65408) >> 7 | ((var59 & 49152) >> 14 | var59 << 2) << 9) & 57344) >> 13
                              | ((((var59 & 49152) >> 14 | var59 << 2) & 65408) >> 7 | ((var59 & 49152) >> 14 | var59 << 2) << 9) << 3
                          )
                          << 7
                    )
                    << 3
              )
              - 182
            ^ 181
        );
        var20.setCharAt(
          var36,
          (char)(
            (
                  (
                        (
                            (
                                  (
                                      (((((var59 & 49152) >> 14 | var59 << 2) & 65408) >> 7 | ((var59 & 49152) >> 14 | var59 << 2) << 9) & 57344) >> 13
                                        | ((((var59 & 49152) >> 14 | var59 << 2) & 65408) >> 7 | ((var59 & 49152) >> 14 | var59 << 2) << 9) << 3
                                    )
                                    & 65024
                                )
                                >> 9
                              | (
                                  (((((var59 & 49152) >> 14 | var59 << 2) & 65408) >> 7 | ((var59 & 49152) >> 14 | var59 << 2) << 9) & 57344) >> 13
                                    | ((((var59 & 49152) >> 14 | var59 << 2) & 65408) >> 7 | ((var59 & 49152) >> 14 | var59 << 2) << 9) << 3
                                )
                                << 7
                          )
                          & 57344
                      )
                      >> 13
                    | (
                        (
                              (
                                  (((((var59 & 49152) >> 14 | var59 << 2) & 65408) >> 7 | ((var59 & 49152) >> 14 | var59 << 2) << 9) & 57344) >> 13
                                    | ((((var59 & 49152) >> 14 | var59 << 2) & 65408) >> 7 | ((var59 & 49152) >> 14 | var59 << 2) << 9) << 3
                                )
                                & 65024
                            )
                            >> 9
                          | (
                              (((((var59 & 49152) >> 14 | var59 << 2) & 65408) >> 7 | ((var59 & 49152) >> 14 | var59 << 2) << 9) & 57344) >> 13
                                | ((((var59 & 49152) >> 14 | var59 << 2) & 65408) >> 7 | ((var59 & 49152) >> 14 | var59 << 2) << 9) << 3
                            )
                            << 7
                      )
                      << 3
                )
                - 182
              ^ 181
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), uc.class.getClassLoader()).returnType();
      switch ((((var4 ^ 344370185) + 2036737693 ^ 1029216240 ^ 2062209280 ^ 304944465 ^ 1081032556) - 1353204030 - 1209365079 ^ 1235852108) - 1049020324) {
        case 643546280:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 702579828:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1333408289:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1971654595:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      fuf[((var10 - 1230363900 - 1808003452 ^ 2104533650) + 2026126590 + 130956536 + 590382101 ^ 1240607232 ^ 1438615052 ^ 1814270026) - 895714793] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
