// KryptonPlus Module: Speed
// Original class: es
// Status: PARTIAL - JNT native encryption (strings in jnt.so)


import dev.krypton.jnt3.Loader;
import dev.krypton.mixin.MobSpawnerLogicAccessor;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import net.minecraft.class_1269;
import net.minecraft.class_1661;
import net.minecraft.class_1707;
import net.minecraft.Item;
import net.minecraft.ItemStack;
import net.minecraft.class_1917;
import net.minecraft.class_1952;
import net.minecraft.class_2189;
import net.minecraft.BlockState;
import net.minecraft.BlockPos;
import net.minecraft.class_2384;
import net.minecraft.Vec3d;
import net.minecraft.NbtElement;
import net.minecraft.Text;
import net.minecraft.ClientLoginNetworkHandler;
import net.minecraft.class_2661;
import net.minecraft.BlockState;
import net.minecraft.ClientWorld;
import net.minecraft.class_2846;
import net.minecraft.class_5250;
import net.minecraft.class_634;
import net.minecraft.class_638;

public class Speed extends np {
  public nj env;
  public rt pf;
  public kc vxj;
  public kc ny;
  public rt fr;
  public kc tym;
  public rt vl;
  public kc xr;
  public e vca;
  public kc qtu;
  public kc lh;
  public rt lwa;
  public int rk;
  public int qq;
  public Map ayk;
  public Random cyq;
  public vt wnz;
  public yd mzr;
  public int fy;
  public int qn;
  public Set ini;
  public mu mpr;
  public ArrayList siq;
  public int hax;
  public class_2338 dyj;
  public boolean rp;
  public boolean pz;
  public boolean to;
  public int nv;
  public int xh;
  public int dvv;
  public int heq;
  public float ud;
  public float xy;
  public int hit;
  public int xgu;
  public boolean dv;
  public static float kyy = 1.6F;
  public static float in = 1.2F;
  public int ekm;
  public int xoi;
  public float zdb;
  public float mxs;
  // [JNT] MethodHandle dispatch table (removed)
  public es() {
    int var1 = 206518995;
    int var10001 = (-1387056154 << -1387056154 | 0) & 705888360;

    StringBuilder var10002;
    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((-1967591383 * -1967591383 | 2) & -1426063278);
      var10001 += 601365359 << 1182884716 ^ -2118717439
    ) {
      int var60 = /* jnt */ - 'x';
      char var61 = (char)(((var60 & 61440) >> 12 | var60 << 4) ^ 71 ^ 170 ^ 222);
      /* jnt */(((var60 & 61440) >> 12 | var60 << 4) ^ 71 ^ 170 ^ 222)
      );
    }

    String var5 = /* jnt */;
    int var32 = (-1389272767 + 1092201322 | 0) & 280252432;

    StringBuilder var63;
    for (var63 = (StringBuilder)/* jnt */;
      var32 < (951545646 - -1332681229 ^ -2010740447);
      var32 += -1929522240 ^ 58887365 & (-1929522240 ^ 58887365) ^ -1879056444
    ) {
      int var139 = /* jnt */ + 177;
      char var140 = (char)(((var139 & 57344) >> 13 | var139 << 3) + 250 + 83 + 21);
      /* jnt */(((var139 & 57344) >> 13 | var139 << 3) + 250 + 83 + 21)
      );
    }

    super(
      var5,
      /* jnt */,
      -1,
      null /* jnt:encrypted */
    );
    var10001 = 388164107 << 388164107 ^ 391141376;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < (965253633 * (848398310 << -138329786) ^ -1602684530);
      var10001 += -979812797 & -469018881 ^ -1006037438
    ) {
      int var66 = /* jnt */ + '`';
      int var183 = (var66 & 57344) >> 13;
      int var67 = ((var66 & 57344) >> 13 | var66 << 3) ^ 69;
      int var184 = ((((var66 & 57344) >> 13 | var66 << 3) ^ 69) & 65472) >> 6;
      char var68 = (char)(((((var183 | var66 << 3) ^ 69) & 65472) >> 6 | (((var66 & 57344) >> 13 | var66 << 3) ^ 69) << 10) - 238);
      /* jnt */((var184 | var67 << 10) - 238));
    }

    this.env = (nj)/* jnt */,
      (oo)/* jnt */
    );
    var10001 = (426176904 >>> 426176904 | 0) & -484175604;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < (-929944628 >>> -1682753549 ^ 6429);
      var10001 += (768914447 << -343559227 | 1) & 20975121
    ) {
      char var71 = /* jnt */;
      char var74 = (char)(
        ((((((var71 & '\ufffe') >> 1 | var71 << 15) ^ 72 ^ 141) & 63488) >> 11 | (((var71 & '\ufffe') >> 1 | var71 << 15) ^ 72 ^ 141) << 5) & 65024) >> 9
          | (((((var71 & '\ufffe') >> 1 | var71 << 15) ^ 72 ^ 141) & 63488) >> 11 | (((var71 & '\ufffe') >> 1 | var71 << 15) ^ 72 ^ 141) << 5) << 7
      );
      /* jnt */(
          ((((((var71 & '\ufffe') >> 1 | var71 << 15) ^ 72 ^ 141) & 63488) >> 11 | (((var71 & '\ufffe') >> 1 | var71 << 15) ^ 72 ^ 141) << 5) & 65024) >> 9
            | (((((var71 & '\ufffe') >> 1 | var71 << 15) ^ 72 ^ 141) & 63488) >> 11 | (((var71 & '\ufffe') >> 1 | var71 << 15) ^ 72 ^ 141) << 5) << 7
        )
      );
    }

    this.pf = (rt)/* jnt */, 1.0, 500.0, 100.0, 1.0
    );
    var10001 = -1199568856 >> -1091529779 - 1543298128 ^ -3;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < (-2097764154 & 1324868443 ^ 49717322);
      var10001 += (-1181823205 >> 2111946062 | 0) & 69701
    ) {
      int var77 = (/* jnt */ ^ 27) + 206;
      int var188 = (var77 & 65504) >> 5;
      int var78 = ((var77 & 65504) >> 5 | var77 << 11) ^ 227;
      int var189 = ((((var77 & 65504) >> 5 | var77 << 11) ^ 227) & 61440) >> 12;
      char var79 = (char)((((var188 | var77 << 11) ^ 227) & 61440) >> 12 | (((var77 & 65504) >> 5 | var77 << 11) ^ 227) << 4);
      /* jnt */(var189 | var78 << 4));
    }

    this.vxj = (kc)/* jnt */, true
    );
    var10001 = 1536124355 ^ 1455582539 ^ 223152264;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((378481766 - -511533181 | 14) & -1068432866);
      var10001 += (985667198 & 985667198 & 985667198 | 1) & 19087617
    ) {
      char var82 = /* jnt */;
      char var85 = (char)(
        (((((var82 & '\uffff') >> 0 | var82 << 16) & 65504) >> 5 | ((var82 & '\uffff') >> 0 | var82 << 16) << 11) + 224 - 23 & 49152) >> 14
          | ((((var82 & '\uffff') >> 0 | var82 << 16) & 65504) >> 5 | ((var82 & '\uffff') >> 0 | var82 << 16) << 11) + 224 - 23 << 2
      );
      /* jnt */(
          (((((var82 & '\uffff') >> 0 | var82 << 16) & 65504) >> 5 | ((var82 & '\uffff') >> 0 | var82 << 16) << 11) + 224 - 23 & 49152) >> 14
            | ((((var82 & '\uffff') >> 0 | var82 << 16) & 65504) >> 5 | ((var82 & '\uffff') >> 0 | var82 << 16) << 11) + 224 - 23 << 2
        )
      );
    }

    this.ny = (kc)/* jnt */, true
    );
    var10001 = (1652278559 - 1652278559 | 0) & 911511991;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((245815481 - 1103343129 | 10) & 538214747);
      var10001 += (-2108779058 - -673289471 | 0) & 329009
    ) {
      char var88 = /* jnt */;
      int var193 = (var88 & '\uffc0') >> 6;
      int var89 = ((var88 & '\uffc0') >> 6 | var88 << '\n') - 91;
      int var194 = (((var88 & '\uffc0') >> 6 | var88 << '\n') - 91 & 65024) >> 9;
      int var90 = ((var193 | var88 << '\n') - 91 & 65024) >> 9 | ((var88 & '\uffc0') >> 6 | var88 << '\n') - 91 << 7;
      var193 = ((var194 | var89 << 7) & 32768) >> 15;
      int var91 = ((var194 | var89 << 7) & 32768) >> 15 | var90 << 1;
      int var196 = ((((var194 | var89 << 7) & 32768) >> 15 | var90 << 1) & 65520) >> 4;
      char var92 = (char)(((var193 | var90 << 1) & 65520) >> 4 | (((var194 | var89 << 7) & 32768) >> 15 | var90 << 1) << 12);
      /* jnt */(var196 | var91 << 12));
    }

    this.fr = (rt)/* jnt */, 1.0, 9.0, 8.0, 1.0
    );
    es var10000 = this;
    var10001 = (-501663079 ^ (-501663079 | 41351304) | 0) & 2140211152;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((-1142972949 & -906740284 | 9) & 1109549087);
      var10001 += (330883108 + 717132136 | 1) & 16811569
    ) {
      char var95 = /* jnt */;
      int var197 = (var95 & '︀') >> 9;
      int var96 = (var95 & '︀') >> 9 | var95 << 7;
      int var198 = (((var95 & '︀') >> 9 | var95 << 7) & 65535) >> 0;
      int var97 = ((var197 | var95 << 7) & 65535) >> 0 | ((var95 & '︀') >> 9 | var95 << 7) << 16;
      var197 = ((var198 | var96 << 16) & 63488) >> 11;
      int var98 = ((var198 | var96 << 16) & 63488) >> 11 | var97 << 5;
      int var200 = ((((var198 | var96 << 16) & 63488) >> 11 | var97 << 5) & 63488) >> 11;
      char var99 = (char)((((var197 | var97 << 5) & 63488) >> 11 | (((var198 | var96 << 16) & 63488) >> 11 | var97 << 5) << 5) ^ 243);
      /* jnt */((var200 | var98 << 5) ^ 243));
    }

    kc var18 = (kc)/* jnt */, true
    );
    int var46 = -1258755521 * -217494886 ^ -626384922;
    var63 = (StringBuilder)/* jnt */;

    label110:
    while (true) {
      var1 = 1770039489 * -1145667726 ^ 656212282;

      while (true) {
        label162: {
          switch ((var1 + 308626450 ^ 307002062 ^ 204974258 ^ 2095348861) + 410912904 + 1233510186) {
            case -1479767370:
            default:
              var10002 = var63;
              if (var46 < ((1113024 | -1389873145 | 41) & 1107755069)) {
                /* jnt */(/* jnt */ - 225 + 76 + 0 - 15 + 93)
                );
                var46 += -1810336673 - 1834695910 ^ 649934712;
                break label162;
              }

              var1 = (761573624 * -943979478 | -2062461242) & -1116610865;
              break;
            case -166170739:
              var10002 = var63;
              if (var46 < ((-305250323 + -1918003527 * -1689267048 | 30) & -2079323586)) {
                int var161 = /* jnt */ - 'j' + 56 ^ 36;
                char var162 = (char)(((var161 & 64512) >> 10 | var161 << 6) + 156);
                /* jnt */(((var161 & 64512) >> 10 | var161 << 6) + 156)
                );
                var46 += (513345071 | -1537156009 << -1537156009) ^ 1066993198;
                continue label110;
              }

              var1 = (-2139385030 ^ 2010032025 | 1078611462) & 1575743319;
          }

          switch (var1 + 1879406290 + 688863322 - 1773069705 - 1395420760 - 157190180 + 1497812041) {
            case -2113073801:
            default:
              var10000.tym = /* jnt */
              );
              var10001 = (46437304 >>> 46437304 | 0) & 444091436;

              for (var10002 = (StringBuilder)/* jnt */;
                var10001 < ((573912540 ^ 620452251 | 8) & -1459580370);
                var10001 += (-840437878 >> (-840437878 ^ -840437878 ^ -840437878) | 1) & 262661
              ) {
                int var110 = /* jnt */ - 140;
                char var113 = (char)(
                  (((((var110 & 49152) >> 14 | var110 << 2) - 18 & 63488) >> 11 | ((var110 & 49152) >> 14 | var110 << 2) - 18 << 5) & 65535) >> 0
                    | ((((var110 & 49152) >> 14 | var110 << 2) - 18 & 63488) >> 11 | ((var110 & 49152) >> 14 | var110 << 2) - 18 << 5) << 16
                );
                /* jnt */(
                    (((((var110 & 49152) >> 14 | var110 << 2) - 18 & 63488) >> 11 | ((var110 & 49152) >> 14 | var110 << 2) - 18 << 5) & 65535) >> 0
                      | ((((var110 & 49152) >> 14 | var110 << 2) - 18 & 63488) >> 11 | ((var110 & 49152) >> 14 | var110 << 2) - 18 << 5) << 16
                  )
                );
              }

              this.vl = (rt)/* jnt */, 1.0, 9.0, 9.0, 1.0
              );
              var10001 = -355028899 - -1987459763 ^ 1632430864;

              for (var10002 = (StringBuilder)/* jnt */;
                var10001 < ((-181224808 - -721961334 | 20) & 1141113205);
                var10001 += 813990776 << -105884621 ^ 465567745
              ) {
                char var116 = /* jnt */;
                char var119 = (char)(
                  (
                        (((((var116 & 'ﰀ') >> 10 | var116 << 6) & 65535) >> 0 | ((var116 & 'ﰀ') >> 10 | var116 << 6) << 16) & 65532) >> 2
                          | ((((var116 & 'ﰀ') >> 10 | var116 << 6) & 65535) >> 0 | ((var116 & 'ﰀ') >> 10 | var116 << 6) << 16) << 14
                      )
                      + 113
                    ^ 242
                );
                /* jnt */(
                    (
                          (((((var116 & 'ﰀ') >> 10 | var116 << 6) & 65535) >> 0 | ((var116 & 'ﰀ') >> 10 | var116 << 6) << 16) & 65532) >> 2
                            | ((((var116 & 'ﰀ') >> 10 | var116 << 6) & 65535) >> 0 | ((var116 & 'ﰀ') >> 10 | var116 << 6) << 16) << 14
                        )
                        + 113
                      ^ 242
                  )
                );
              }

              this.xr = (kc)/* jnt */, false
              );
              var10001 = (-2071446128 >> -33328356 | 0) & 2;

              for (var10002 = (StringBuilder)/* jnt */;
                var10001 < (-632976205 + 1268620339 ^ 635644129);
                var10001 += (678435146 | -826608763 - -1360549469 | 1) & 271365
              ) {
                char var122 = /* jnt */;
                char var125 = (char)(
                  (
                      (((((var122 & '￼') >> 2 | var122 << 14) - 31 & 64512) >> 10 | ((var122 & '￼') >> 2 | var122 << 14) - 31 << 6) & 65532) >> 2
                        | ((((var122 & '￼') >> 2 | var122 << 14) - 31 & 64512) >> 10 | ((var122 & '￼') >> 2 | var122 << 14) - 31 << 6) << 14
                    )
                    + 173
                );
                /* jnt */(
                    (
                        (((((var122 & '￼') >> 2 | var122 << 14) - 31 & 64512) >> 10 | ((var122 & '￼') >> 2 | var122 << 14) - 31 << 6) & 65532) >> 2
                          | ((((var122 & '￼') >> 2 | var122 << 14) - 31 & 64512) >> 10 | ((var122 & '￼') >> 2 | var122 << 14) - 31 << 6) << 14
                      )
                      + 173
                  )
                );
              }

              this.vca = (e)/* jnt */, ""
              );
              var10001 = 1217714783 >>> 1280982947 ^ 152214347;

              for (var10002 = (StringBuilder)/* jnt */;
                var10001 < (1576041632 & 496216091 ^ 495986699);
                var10001 += 1709541269 >>> -1563633191 ^ 51
              ) {
                int var128 = /* jnt */ - '\r';
                int var213 = (var128 & 65534) >> 1;
                int var129 = ((var128 & 65534) >> 1 | var128 << 15) + 104 + 65;
                int var214 = (((var128 & 65534) >> 1 | var128 << 15) + 104 + 65 & 65528) >> 3;
                char var130 = (char)(((var213 | var128 << 15) + 104 + 65 & 65528) >> 3 | ((var128 & 65534) >> 1 | var128 << 15) + 104 + 65 << 13);
                /* jnt */(var214 | var129 << 13));
              }

              this.qtu = (kc)/* jnt */, true
              );
              var10000 = this;
              var10001 = (840941084 | -1787411017) ^ -1216348225;

              for (var10002 = (StringBuilder)/* jnt */;
                var10001 < ((1545240443 | -2028687802 - (1545240443 | -2028687802)) ^ -10);
                var10001 += -992300682 - 332427367 ^ -1324728050
              ) {
                int var133 = /* jnt */ + 203;
                char var136 = (char)(
                  (((((var133 & 0) >> 16 | var133 << 0) & 64512) >> 10 | ((var133 & 0) >> 16 | var133 << 0) << 6) + 97 & 64512) >> 10
                    | ((((var133 & 0) >> 16 | var133 << 0) & 64512) >> 10 | ((var133 & 0) >> 16 | var133 << 0) << 6) + 97 << 6
                );
                /* jnt */(
                    (((((var133 & 0) >> 16 | var133 << 0) & 64512) >> 10 | ((var133 & 0) >> 16 | var133 << 0) << 6) + 97 & 64512) >> 10
                      | ((((var133 & 0) >> 16 | var133 << 0) & 64512) >> 10 | ((var133 & 0) >> 16 | var133 << 0) << 6) + 97 << 6
                  )
                );
              }

              var18 = (kc)/* jnt */, false
              );
              var46 = (1882957123 & -1343435024 >> 986129392 | 0) & -1899740642;
              var63 = (StringBuilder)/* jnt */;
              break;
            case -1315733962:
              var10000.lh = /* jnt */
              );
              var10001 = (-1959297469 + -1959297469 | 0) & -376372880;

              for (var10002 = (StringBuilder)/* jnt */;
                var10001 < ((1147754301 >>> (-778360224 >>> 762015745) | 16) & 747090838);
                var10001 += 1074086518 << -1025453437 ^ 2757553
              ) {
                int var105 = /* jnt */ ^ '8';
                int var202 = (var105 & 63488) >> 11;
                int var106 = ((var105 & 63488) >> 11 | var105 << 5) + 116 ^ 128;
                int var203 = ((((var105 & 63488) >> 11 | var105 << 5) + 116 ^ 128) & 57344) >> 13;
                char var107 = (char)((((var202 | var105 << 5) + 116 ^ 128) & 57344) >> 13 | (((var105 & 63488) >> 11 | var105 << 5) + 116 ^ 128) << 3);
                /* jnt */(var203 | var106 << 3));
              }

              this.lwa = (rt)/* jnt */, 1.0, 120.0, 20.0, 1.0
              );
              this.rk = 60;
              this.qq = 3;
              this.ayk = (rn)/* jnt */;
              this.cyq = (Random)/* jnt */;
              this.mzr = null /* jnt:encrypted */;
              this.hax = 0;
              this.rp = false;
              this.pz = false;
              this.to = false;
              this.nv = 0;
              this.xh = 0;
              this.dvv = 0;
              this.heq = 0;
              this.ud = 0.0F;
              this.xy = 0.0F;
              this.hit = 0;
              this.xgu = 0;
              this.dv = true;
              this.ekm = 0;
              this.xoi = 0;
              this.zdb = 0.0F;
              this.mxs = 0.0F;
              /* jnt */,
                  null /* jnt:encrypted */,
                  null /* jnt:encrypted */,
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
          }
        }

        var1 = (895987158 | 532651896) ^ 722368269;
      }
    }
  }

  @Override
    // [JNT_NATIVE] void dz() - implementation encrypted in native .so library
  public native void dz();

  @Override
  public void x() {
    if (null /* jnt:encrypted */
      )
      != null) {
      /* jnt */;
      /* jnt */
          )
        ),
        false
      );
      /* jnt */);
    }
  }
  @yet
  public void za(by var1) {
    int var12 = 56492323;
    if (null /* jnt:encrypted */
        )
        != null
      && null /* jnt:encrypted */
        )
        != null) {
      var12 = (1587739527 >> 1116950686 | 997302436) & 1064411639;
    } else {
      var12 = (18248840 + -144621907 | 554622661) & 621731823;
    }

    while (true) {
      switch ((var12 + 1094988142 ^ 980620772 ^ 921908467) - 913172706 + 1532151563 - 899680245) {
        case -267425818:
        default:
          null /* jnt:encrypted */ - 1);
          int var2 = null /* jnt:encrypted */) * 3 + 1;
          int var3 = null /* jnt:encrypted */) * 3 + 1;
          null /* jnt:encrypted *//* jnt *//* jnt */
                )
              ),
              var3
            )
          );
          if (null /* jnt:encrypted */ == null) {
            return;
          }

          tb var4 = (tb)/* jnt */null /* jnt:encrypted */null /* jnt:encrypted */
            ),
            tb.class
          );
          if (/* jnt */ && /* jnt */) {
            /* jnt */;
            return;
          }

          var12 = (-1506011192 * -942772756 | -1975425791) & -563222557;

          while (true) {
            switch (((var12 - 1296806560 ^ 904708165) - 553087722 ^ 1131169311) - 558909442 + 1399606185) {
              case -1012237207:
                if (/* jnt */)) {
                  class_1799 var18 = /* jnt */
                    )
                  );
                  if (/* jnt */
                    )
                    && /* jnt */
                        - /* jnt */
                      < 100) {
                    null /* jnt:encrypted */;
                    null /* jnt:encrypted */
                        )
                      )
                    );
                  }
                }

                var12 = (820896054 * 431558234 | -726658554) & -4648137;
                break;
              case -831309386:
                if (null /* jnt:encrypted */) {
                  if (null /* jnt:encrypted */
                      )
                    ) instanceof class_1707 var17
                    && /* jnt */ == 4) {
                    var12 = 2010637435 ^ (-1696906323 | 1950989573) ^ 1945744415;

                    while (true) {
                      switch ((var12 - 1169001185 - 1592293698 ^ 1772592223) + 1561793264 + 1141708431 + 873376978) {
                        case -1243073591:
                          /* jnt */
                            )
                          );
                          null /* jnt:encrypted */;
                          return;
                        case 355143242:
                      }

                      if (!/* jnt */
                            )
                          ),
                          34
                        ),
                        null /* jnt:encrypted */
                      )) {
                        int var24 = 36;

                        while (true) {
                          var12 = (1657458871 >> -1909735713 | -1618349537) & -1073742017;

                          while (true) {
                            switch (((var12 ^ 1096437572 ^ 417052390) + 2114040118 ^ 63240967) + 842970511 - 1191275530) {
                              case 750282323:
                                null /* jnt:encrypted */;
                                return;
                              case 856330617:
                            }

                            if (var24 <= 62) {
                              class_1792 var29 = /* jnt */
                                )
                              );
                              if (var29
                                != null /* jnt:encrypted */) {
                                /* jnt */
                                  ),
                                  null /* jnt:encrypted */
                                      )
                                    )
                                  ),
                                  var24,
                                  1,
                                  null /* jnt:encrypted */,
                                  null /* jnt:encrypted */
                                  )
                                );
                                null /* jnt:encrypted */;
                                return;
                              }

                              var24++;
                              break;
                            }

                            var12 = (-1872571633 ^ 64467251 | 205442817) & -1119887503;
                          }
                        }
                      }

                      var12 = (-1210201016 | 2051481734 | 78153024) & 766035274;
                    }
                  }

                  class_634 var44 = /* jnt */
                  );
                  int var54 = (-1501280802 | -455280910) ^ -421726210;

                  StringBuilder var65;
                  for (var65 = (StringBuilder)/* jnt */;
                    var54 < ((-1666855433 << 920690575 | 4) & 134487319);
                    var54 += (-1091201005 - -1091201005 | 1) & -1941842827
                  ) {
                    int var91 = /* jnt */ - '#';
                    int var115 = (var91 & 65024) >> 9;
                    int var92 = (((var91 & 65024) >> 9 | var91 << 7) ^ 187) - 80;
                    int var116 = ((((var91 & 65024) >> 9 | var91 << 7) ^ 187) - 80 & 63488) >> 11;
                    char var93 = (char)((((var115 | var91 << 7) ^ 187) - 80 & 63488) >> 11 | (((var91 & 65024) >> 9 | var91 << 7) ^ 187) - 80 << 5);
                    /* jnt */(var116 | var92 << 5));
                  }

                  /* jnt */
                  );
                  null /* jnt:encrypted */;
                  return;
                }

                var12 = (-1247275285 & -1247275285 | 241931365) & -545530393;
                break;
              case 112049452:
                if (null /* jnt:encrypted */ > 0) {
                  /* jnt */;
                  null /* jnt:encrypted */ - 1);
                  return;
                }

                var12 = (826782336 | -72776215) ^ 1638278813;
                break;
              case 934538414:
              default:
                if (/* jnt */)) {
                  class_1661 var16 = /* jnt */
                    )
                  );
                  boolean var22 = false;
                  int var28 = 9;

                  label362:
                  while (true) {
                    var12 = (-1827676235 << -1416055482 | 335552550) & 510341678;

                    while (true) {
                      switch ((var12 + 1768019298 ^ 1411739356 ^ 1582270825) + 12226778 - 1190151259 ^ 2029586433) {
                        case -76349039:
                          var22 = true;
                          break;
                        case 621572707:
                          if (!var22) {
                            null /* jnt:encrypted */;
                            return;
                          }
                          break label362;
                        case 1468094141:
                        default:
                          if (var28 < 35) {
                            if (!/* jnt */,
                              null /* jnt:encrypted */
                            )) {
                              var12 = -2027727520 >>> (1299837809 ^ 1665073464) ^ -242264610;
                            } else {
                              var12 = (-818964556 | -818964556 | 408027202) & 1517546826;
                            }
                            continue;
                          }
                          break;
                        case 1945617123:
                          var28++;
                          continue label362;
                      }

                      var12 = (749173592 - 1764235183 | 81245268) & 1289745652;
                    }
                  }
                }

                var12 = (988123828 | 1036636076 | 18903554) & -2124058013;
                break;
              case 1301410143:
                /* jnt */;
                if (/* jnt */)) {
                  int var15 = /* jnt */) - 1;
                  if (!/* jnt */
                        )
                      ),
                      var15
                    ),
                    null /* jnt:encrypted */
                  )) {
                    if (null /* jnt:encrypted */ < 30 && !null /* jnt:encrypted */) {
                      null /* jnt:encrypted */ + 1);
                      return;
                    }

                    var12 = (502124287 >>> -2435175 | -1872775534) & -1738541069;
                  } else {
                    var12 = 1674966639 >> -1031701045 ^ -312919533;
                  }

                  label344:
                  while (true) {
                    switch (((var12 ^ 284842355) + 2140714696 ^ 1427528318) + 269421680 - 623158396 - 468408004) {
                      case -2071556691:
                        if (null /* jnt:encrypted */
                            )
                          ) instanceof class_1707 var21
                          && /* jnt */ == 3) {
                          var12 = (680100575 ^ 325683459 + 325683459 | -478657979) & -277025963;

                          while (true) {
                            switch ((var12 ^ 1158224553) + 520079732 + 2095562119 + 1583501705 + 23156094 + 1336518177) {
                              case -1909230467:
                                /* jnt */
                                    )
                                  ),
                                  (class_2846)/* jnt */,
                                    null /* jnt:encrypted */,
                                    null /* jnt:encrypted */
                                  )
                                );
                                if (/* jnt */
                                  ),
                                  null /* jnt:encrypted */
                                )) {
                                  /* jnt */
                                    ),
                                    null /* jnt:encrypted */
                                        )
                                      )
                                    ),
                                    23,
                                    0,
                                    null /* jnt:encrypted */,
                                    null /* jnt:encrypted */
                                    )
                                  );
                                  null /* jnt:encrypted */;
                                  return;
                                }

                                var12 = -381006300 >>> -1355285657 ^ -1633283105;
                                break;
                              case -171528929:
                                if (/* jnt */
                                  ),
                                  null /* jnt:encrypted */
                                )) {
                                  /* jnt */
                                    ),
                                    null /* jnt:encrypted */
                                        )
                                      )
                                    ),
                                    13,
                                    0,
                                    null /* jnt:encrypted */,
                                    null /* jnt:encrypted */
                                    )
                                  );
                                  null /* jnt:encrypted */;
                                  return;
                                }

                                var12 = (1773224136 & -1089656238 * -498726895 | -264391901) & -197266589;
                                break;
                              case 9027053:
                              default:
                                if (/* jnt */
                                  ),
                                  null /* jnt:encrypted */
                                )) {
                                  /* jnt */
                                    ),
                                    null /* jnt:encrypted */
                                        )
                                      )
                                    ),
                                    13,
                                    0,
                                    null /* jnt:encrypted */,
                                    null /* jnt:encrypted */
                                    )
                                  );
                                  null /* jnt:encrypted */;
                                  return;
                                }

                                var12 = 1557173036 * 1557173036 ^ 466367843;
                                break;
                              case 634548749:
                                class_634 var43 = /* jnt */
                                );
                                int var52 = -1874710314 << -35246826 ^ 897581056;

                                StringBuilder var63;
                                for (var63 = (StringBuilder)/* jnt */;
                                  var52 < (-1966980843 * -1966980843 ^ 1482664893);
                                  var52 += (2026649189 << 1516548521 | 1) & 117507437
                                ) {
                                  /* jnt */(
                                      (/* jnt */ ^ 137) - 70
                                        ^ 31
                                        ^ 2
                                        ^ 253
                                    )
                                  );
                                }

                                /* jnt */
                                );
                                null /* jnt:encrypted */;
                                return;
                            }
                          }
                        }

                        class_634 var42 = /* jnt */
                        );
                        int var50 = (43506548 & -1962358193 | 0) & -581823327;

                        StringBuilder var61;
                        for (var61 = (StringBuilder)/* jnt */;
                          var50 < ((-1091337731 * 1329654188 | 4) & 5522437);
                          var50 += (-416362404 | 1854692041) ^ -273753380
                        ) {
                          int var84 = /* jnt */ ^ '&';
                          int var113 = (var84 & 65528) >> 3;
                          int var85 = (((var84 & 65528) >> 3 | var84 << 13) ^ 75) - 41;
                          int var114 = ((((var84 & 65528) >> 3 | var84 << 13) ^ 75) - 41 & 65520) >> 4;
                          char var86 = (char)((((var113 | var84 << 13) ^ 75) - 41 & 65520) >> 4 | (((var84 & 65528) >> 3 | var84 << 13) ^ 75) - 41 << 12);
                          /* jnt */(var114 | var85 << 12));
                        }

                        /* jnt */
                        );
                        null /* jnt:encrypted */;
                        return;
                      case -1625578508:
                        null /* jnt:encrypted */;
                        null /* jnt:encrypted */;
                        break label344;
                      case -145712120:
                        if (!null /* jnt:encrypted */) {
                          break label344;
                        }

                        if (null /* jnt:encrypted */
                          )
                          != null) {
                          /* jnt */
                            )
                          );
                          null /* jnt:encrypted */;
                        }

                        var12 = (-1952059164 ^ -1952059164 | 361252993) & -1746973799;
                        break;
                      case 606604807:
                      default:
                        null /* jnt:encrypted */;
                        null /* jnt:encrypted */;
                        if (/* jnt */
                              )
                            )
                          )
                          != var15) {
                          /* jnt */;
                        }

                        var12 = (664744007 >>> -1932032983 | 1879062080) & 1969370730;
                    }
                  }
                }

                var12 = (1829869112 + 1829869112 | 613966151) & 1843192815;
                break;
              case 1437486697:
                vt var14 = /* jnt */;
                if (var14 == null) {
                  /* jnt */;
                  return;
                }

                /* jnt */;
                float var20 = /* jnt */;
                float var26 = var20 + null /* jnt:encrypted */;
                float var30 = /* jnt */
                    )
                  ),
                  var26,
                  12.0F
                );
                float var9 = 2.0F;
                float var10 = var9 + null /* jnt:encrypted */;
                float var11 = /* jnt */
                    )
                  ),
                  var10
                );
                /* jnt */
                  ),
                  var30
                );
                /* jnt */
                  ),
                  var11
                );
                /* jnt */;
                return;
              case 1476488861:
                if (/* jnt */)) {
                  boolean var13 = /* jnt */
                        )
                      )
                    ),
                    null /* jnt:encrypted */
                  );
                  mf var19 = (mf)/* jnt */null /* jnt:encrypted */null /* jnt:encrypted */
                    ),
                    mf.class
                  );
                  if (var13) {
                    null /* jnt:encrypted */;
                    var12 = (1245972991 >> 1245972991 | 293323742) & 1568406494;
                  } else {
                    var12 = (-1105218803 << -984183986 | 135637282) & 1579002358;
                  }

                  label331:
                  while (true) {
                    switch (((var12 ^ 646600672) + 1590100826 - 1361802009 ^ 172701032 ^ 8968511) - 1721801681) {
                      case -779137767:
                        null /* jnt:encrypted */ + 1);
                        var12 = (1245972991 >> 1245972991 | 293323742) & 1568406494;
                        break;
                      case -391238569:
                        if ((double)null /* jnt:encrypted */
                          > /* jnt */)) {
                          int var48 = (-1218009465 - -1218009465 | 0) & 1278765282;

                          StringBuilder var59;
                          for (var59 = (StringBuilder)/* jnt */;
                            var48 < ((1385787270 | 124261368 | 17) & -1610317805);
                            var48 += -535902537 >> -535902537 ^ -63
                          ) {
                            char var78 = /* jnt */;
                            char var81 = (char)(
                              (
                                  (((((var78 & '\uf000') >> 12 | var78 << 4) & 32768) >> 15 | ((var78 & '\uf000') >> 12 | var78 << 4) << 1) + 104 & 64512)
                                      >> 10
                                    | ((((var78 & '\uf000') >> 12 | var78 << 4) & 32768) >> 15 | ((var78 & '\uf000') >> 12 | var78 << 4) << 1) + 104 << 6
                                )
                                - 175
                            );
                            /* jnt */(
                                (
                                    (((((var78 & '\uf000') >> 12 | var78 << 4) & 32768) >> 15 | ((var78 & '\uf000') >> 12 | var78 << 4) << 1) + 104 & 64512)
                                        >> 10
                                      | ((((var78 & '\uf000') >> 12 | var78 << 4) & 32768) >> 15 | ((var78 & '\uf000') >> 12 | var78 << 4) << 1) + 104 << 6
                                  )
                                  - 175
                              )
                            );
                          }

                          /* jnt */,
                            (int)/* jnt */
                              )
                            ),
                            (int)/* jnt */
                              )
                            ),
                            (int)/* jnt */
                              )
                            )
                          );
                          return;
                        }
                        break label331;
                      case 207079299:
                      default:
                        if (/* jnt */) {
                          if (/* jnt */
                            )
                            != -1) {
                            null /* jnt:encrypted */;
                            var12 = (1245972991 >> 1245972991 | 293323742) & 1568406494;
                          } else {
                            var12 = 366163964 - -660772179 ^ 1055911635;
                          }
                        } else {
                          var12 = 366163964 - -660772179 ^ 1055911635;
                        }
                    }
                  }
                }

                var12 = (300726652 | 959873160 | -2111748769) & -2094409889;
                break;
              case 2095104302:
                if (null /* jnt:encrypted */) {
                  int var5 = /* jnt */) - 1;
                  class_1799 var6 = /* jnt */
                      )
                    ),
                    var5
                  );
                  if (/* jnt */
                        )
                      )
                    )
                    != var5) {
                    /* jnt */;
                  }

                  var12 = (-2099230678 - (-2099230678 - -2099230678) | 2014566029) & 2029518733;

                  while (true) {
                    switch (var12 + 1679909515 - 749437390 - 250889787 + 1892534096 + 460977983 ^ 1092614146) {
                      case -945775987:
                        if (/* jnt */
                              )
                            )
                          )
                          > 0) {
                          class_1269 var25 = /* jnt */
                            ),
                            null /* jnt:encrypted */
                            ),
                            null /* jnt:encrypted */
                          );
                          if (/* jnt */
                            && /* jnt */) {
                            /* jnt */
                              ),
                              null /* jnt:encrypted */
                            );
                          }

                          null /* jnt:encrypted */;
                          return;
                        }

                        var12 = (-2128989601 - -2128989601 | -1427042601) & -1073897729;
                        break;
                      case -341311017:
                      default:
                        if (!/* jnt */
                            )
                          ),
                          null /* jnt:encrypted */
                        )) {
                          /* jnt */
                            ),
                            null /* jnt:encrypted */
                                )
                              )
                            ),
                            36 + null /* jnt:encrypted */,
                            40,
                            null /* jnt:encrypted */,
                            null /* jnt:encrypted */
                            )
                          );
                          null /* jnt:encrypted */;
                          return;
                        }

                        var12 = (486568612 * 1104370428 | -2133456610) & -235512321;
                        break;
                      case -26892009:
                        if (null /* jnt:encrypted */
                          )
                          != null) {
                          /* jnt */
                            )
                          );
                          null /* jnt:encrypted */;
                          return;
                        }

                        var12 = 1960414161 * (1412797547 & -1730962057) ^ -1204271849;
                        break;
                      case 514170858:
                        /* jnt */
                          ),
                          null /* jnt:encrypted */
                              )
                            )
                          ),
                          36 + null /* jnt:encrypted */,
                          40,
                          null /* jnt:encrypted */,
                          null /* jnt:encrypted */
                          )
                        );
                        null /* jnt:encrypted */;
                        return;
                      case 1822609308:
                        if (!/* jnt */
                        )) {
                          if (null /* jnt:encrypted */
                              )
                            ) instanceof class_1707 var7
                            && /* jnt */ == 3) {
                            var12 = 820334212 - 937408510 ^ 1957169102;

                            while (true) {
                              switch ((var12 - 284580003 - 348658467 ^ 1235866497) + 2041200773 - 533409122 + 142499898) {
                                case -1868283552:
                                  if (/* jnt */
                                    ),
                                    null /* jnt:encrypted */
                                  )) {
                                    /* jnt */
                                      ),
                                      null /* jnt:encrypted */
                                          )
                                        )
                                      ),
                                      13,
                                      0,
                                      null /* jnt:encrypted */,
                                      null /* jnt:encrypted */
                                      )
                                    );
                                    null /* jnt:encrypted */;
                                    return;
                                  }

                                  var12 = 901683677 + 181838320 ^ -101444538;
                                  break;
                                case 709203301:
                                default:
                                  class_634 var41 = /* jnt */
                                  );
                                  int var46 = (841868213 | 841868213) ^ 841868213;

                                  StringBuilder var57;
                                  for (var57 = (StringBuilder)/* jnt */;
                                    var46 < (-1909202641 + -1828184398 ^ 557580261);
                                    var46 += (1981442145 << (-978127471 ^ 1672159044) | 1) & -1814523691
                                  ) {
                                    int var73 = /* jnt */ + 'q';
                                    int var108 = (var73 & 0) >> 16;
                                    int var74 = ((var73 & 0) >> 16 | var73 << 0) + 194;
                                    int var109 = (((var73 & 0) >> 16 | var73 << 0) + 194 & 63488) >> 11;
                                    char var75 = (char)((((var108 | var73 << 0) + 194 & 63488) >> 11 | ((var73 & 0) >> 16 | var73 << 0) + 194 << 5) - 243);
                                    /* jnt */((var109 | var74 << 5) - 243)
                                    );
                                  }

                                  /* jnt */
                                  );
                                  null /* jnt:encrypted */;
                                  return;
                                case 1013504929:
                                  if (/* jnt */
                                    ),
                                    null /* jnt:encrypted */
                                  )) {
                                    /* jnt */
                                      ),
                                      null /* jnt:encrypted */
                                          )
                                        )
                                      ),
                                      16,
                                      0,
                                      null /* jnt:encrypted */,
                                      null /* jnt:encrypted */
                                      )
                                    );
                                    null /* jnt:encrypted */;
                                    return;
                                  }

                                  var12 = (-774459900 >> 398530850 + -1839039443 | 1095769106) & -883482765;
                                  break;
                                case 1214939762:
                                  /* jnt */
                                      )
                                    ),
                                    (class_2846)/* jnt */,
                                      null /* jnt:encrypted */,
                                      null /* jnt:encrypted */
                                    )
                                  );
                                  if (/* jnt */
                                    ),
                                    null /* jnt:encrypted */
                                  )) {
                                    /* jnt */
                                      ),
                                      null /* jnt:encrypted */
                                          )
                                        )
                                      ),
                                      23,
                                      0,
                                      null /* jnt:encrypted */,
                                      null /* jnt:encrypted */
                                      )
                                    );
                                    null /* jnt:encrypted */;
                                    return;
                                  }

                                  var12 = (-1858014147 | 2082028462 | 604004428) & -1274780337;
                                  break;
                                case 1317989449:
                                  if (/* jnt */
                                    ),
                                    null /* jnt:encrypted */
                                  )) {
                                    /* jnt */
                                      ),
                                      null /* jnt:encrypted */
                                          )
                                        )
                                      ),
                                      17,
                                      0,
                                      null /* jnt:encrypted */,
                                      null /* jnt:encrypted */
                                      )
                                    );
                                    null /* jnt:encrypted */;
                                    return;
                                  }

                                  var12 = 1084103519 - (1084103519 + 857993219) ^ 431972263;
                              }
                            }
                          }

                          class_634 var10000 = /* jnt */
                          );
                          int var10001 = -770847519 << 1190026740 ^ -837812224;

                          StringBuilder var10002;
                          for (var10002 = (StringBuilder)/* jnt */;
                            var10001 < ((2123610476 * 631544798 | 4) & 71307351);
                            var10001 += (-1222892349 | -471190414 | 1) & 134300161
                          ) {
                            char var67 = /* jnt */;
                            char var70 = (char)(
                              (((((var67 & '\ufff0') >> 4 | var67 << '\f') & 61440) >> 12 | ((var67 & '\ufff0') >> 4 | var67 << '\f') << 4) + 68 + 119 & 64512)
                                  >> 10
                                | ((((var67 & '\ufff0') >> 4 | var67 << '\f') & 61440) >> 12 | ((var67 & '\ufff0') >> 4 | var67 << '\f') << 4) + 68 + 119 << 6
                            );
                            /* jnt */(
                                (
                                      ((((var67 & '\ufff0') >> 4 | var67 << '\f') & 61440) >> 12 | ((var67 & '\ufff0') >> 4 | var67 << '\f') << 4) + 68 + 119
                                        & 64512
                                    )
                                    >> 10
                                  | ((((var67 & '\ufff0') >> 4 | var67 << '\f') & 61440) >> 12 | ((var67 & '\ufff0') >> 4 | var67 << '\f') << 4) + 68 + 119
                                    << 6
                              )
                            );
                          }

                          /* jnt */
                          );
                          null /* jnt:encrypted */;
                          return;
                        }

                        var12 = (-1101786999 - -408977682 | 135292932) & 184154148;
                    }
                  }
                }

                var12 = -127263545 >> -127263545 * -127263545 ^ -327231465;
            }
          }
        case 1578632824:
          return;
        case 1601882424:
          if (null /* jnt:encrypted */ <= 0) {
            /* jnt */;
            /* jnt */);
            null /* jnt:encrypted */;
          }

          var12 = (-207897672 | -244476536) ^ 955891855;
      }
    }
  }

  @yet
  public void vf(lf var1) {
    /* jnt */, var1
    );
    /* jnt */;
  }
  // $VF: Irreducible bytecode has more than 5 nodes in sequence and was not entirely decomposed
  // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
  public void qcq() {
    int var32 = -1030283705;
    if (null /* jnt:encrypted */
        )
        != null
      && null /* jnt:encrypted */
        )
        != null) {
      var32 = (-2128559694 >>> -2128559694 | 1266010263) & -805311017;
    } else {
      var32 = (-1311308320 & 1158124713 | -259364593) & -222364369;
    }

    switch (var32 + 1963253278 - 1502156255 - 1828964418 + 1810808713 + 1181075379 - 1097994078) {
      case 266921226:
      default:
        return;
      case 1792041138:
        class_638 var1 = null /* jnt:encrypted */
        );
        class_2338 var2 = /* jnt */
          )
        );
        int var3 = /* jnt */, 3
        );
        int var4 = /* jnt */, 3
        );
        null /* jnt:encrypted *//* jnt */);
        int var5 = var3 * 3 + 1;
        int var6 = var4 * 3 + 1;
        int var7 = /* jnt */;
        null /* jnt:encrypted *//* jnt */
        );
        byte var8 = 90;
        int var9 = var5 - var8 - 1;
        int var10 = var6 - var8 - 1;
        int var11 = var7;
        byte[][] var12 = new byte[60][60];
        int var13 = 0;

        label307:
        while (true) {
          var32 = -981411151 * 294455906 ^ -828416944;

          while (true) {
            label302:
            while (true) {
              label338: {
                int var14;
                switch ((var32 + 1753473389 ^ 2081436573) - 1028261973 + 1506475474 + 971587541 - 705713679) {
                  case -2045908453:
                    var13 = 0;
                    break label338;
                  case -1967854932:
                    if (var13 >= 60) {
                      var32 = -1950544286 >> -1950544286 ^ 1292065580;
                      continue;
                    }

                    var14 = 0;
                    var32 = -1512193049 & -368208391 ^ -1616008692;
                    break;
                  case -1864783617:
                    return;
                  case -236943702:
                    if (var13 >= 60) {
                      var32 = 1210745440 >>> -256383565 ^ -1121952035;
                      continue;
                    }

                    var14 = 0;
                    var32 = (-182126771 & 898450622 | -2097955853) & -1292387341;
                    break;
                  case 800246949:
                    if (var13 >= 60) {
                      var32 = (1742946383 << 40496042 | 234882982) & 250558455;
                      continue;
                    }

                    var14 = 0;
                    var32 = (-750303147 * 1689273939 | -773028256) & -672270360;
                    break;
                  case 921635281:
                  default:
                    var13 = 0;
                    break label302;
                }

                label294:
                while (true) {
                  switch (var32 - 40248095 - 200066678 + 742968911 - 1945676856 - 1625469406 ^ 294413998) {
                    case -1724459969:
                      if (var14 >= 60) {
                        var32 = -975512926 - -1174996077 ^ 343558517;
                      } else {
                        if (var12[var13][var14] != 2) {
                          var32 = -775048618 << -861023787 ^ 1479269074;
                          continue;
                        }

                        int var34 = -1;

                        label211:
                        for (; var34 <= 1; var34++) {
                          int var36 = -1;

                          label208:
                          while (true) {
                            var32 = (1991857717 >>> 854081456 | 166902356) & 2045951964;

                            while (true) {
                              switch ((var32 + 1701639003 + 1180532474 ^ 1678415511) - 1775943217 - 902341715 ^ 678928372) {
                                case -2023490714:
                                  int var37 = var13 + var34;
                                  int var38 = var14 + var36;
                                  if (var37 >= 0 && var37 < 60 && var38 >= 0 && var38 < 60) {
                                    int var39 = null /* jnt:encrypted */)
                                      + (var37 - 30);
                                    int var40 = null /* jnt:encrypted */)
                                      + (var38 - 30);
                                    /* jnt */,
                                      (mu)/* jnt */,
                                      /* jnt */
                                    );
                                  }

                                  var36++;
                                  continue label208;
                                case -1062546512:
                                  continue label211;
                                case 442751702:
                                default:
                                  if (var36 <= 1) {
                                    if (/* jnt */
                                        + /* jnt */
                                      > 1) {
                                      var36++;
                                      continue label208;
                                    }

                                    var32 = 1573874640 << 1573874640 ^ 354606892;
                                  } else {
                                    var32 = 804596639 ^ -1815679412 ^ -57932839;
                                  }
                              }
                            }
                          }
                        }

                        var32 = -775048618 << -861023787 ^ 1479269074;
                      }
                      break;
                    case -308403143:
                      if (var14 < 60) {
                        int var33 = null /* jnt:encrypted */)
                          + (var13 - 30);
                        int var35 = null /* jnt:encrypted */)
                          + (var14 - 30);
                        /* jnt */,
                          (mu)/* jnt */,
                          /* jnt */
                        );
                        var14++;
                        var32 = (-182126771 & 898450622 | -2097955853) & -1292387341;
                      } else {
                        var32 = 598216957 >> 598216957 ^ 191344734;
                      }
                      break;
                    case 243554338:
                      if (var14 < 60) {
                        byte var15 = 0;
                        int var16 = var9 + var13 * 3;
                        int var17 = var10 + var14 * 3;
                        class_2680 var18 = /* jnt *//* jnt */
                        );
                        if (/* jnt */
                          != null /* jnt:encrypted */) {
                          var14++;
                          var32 = (-750303147 * 1689273939 | -773028256) & -672270360;
                          break;
                        }

                        int var19 = 0;
                        var32 = (-2061716874 | 1705920967) ^ 1538181854;

                        label290:
                        while (true) {
                          switch (((var32 + 1165309414 ^ 14512597) - 1354168240 ^ 1123625637 ^ 651239898) - 1244147440) {
                            case -1939806875:
                            default:
                              if (var19 < 3) {
                                int var20 = var9 + var13 * 3 + var19;
                                int var21 = 0;
                                var32 = 1828281932 >>> (1496190134 ^ -1018465217) ^ 647086751;

                                label282:
                                while (true) {
                                  switch (((var32 ^ 548900185) + 1722366129 - 249448448 ^ 1486058330) - 1258846664 - 1381617235) {
                                    case -876512209:
                                      var19++;
                                      var32 = (-2061716874 | 1705920967) ^ 1538181854;
                                      continue label290;
                                    case 1743130405:
                                  }

                                  if (var21 < 3) {
                                    int var22 = var10 + var14 * 3 + var21;
                                    class_2680 var23 = /* jnt *//* jnt */
                                    );
                                    if (/* jnt */ instanceof class_2189) {
                                      var15 = 1;
                                      break;
                                    }

                                    var32 = -1202343419 * -1202343419 ^ 2079827908;

                                    while (true) {
                                      switch ((var32 - 1643232614 ^ 1693930329) - 941288272 - 2065457195 - 1763470081 - 2067348075) {
                                        case -1165896633:
                                          if (/* jnt */
                                          )) {
                                            var15 = 2;
                                            break label282;
                                          }

                                          var32 = 190963021 << -482349035 ^ 1870648706;
                                          break;
                                        case 1754028638:
                                        default:
                                          class_2680 var24 = /* jnt *//* jnt */
                                          );
                                          if (/* jnt */
                                          )) {
                                            var15 = 2;
                                            break label282;
                                          }

                                          var32 = 931324360 * 931324360 ^ -1507591835;

                                          while (true) {
                                            switch ((var32 - 629775178 ^ 945526885) + 2087783203 - 1145725754 + 766383255 + 1789697185) {
                                              case -814083084:
                                                class_2680 var25 = /* jnt *//* jnt */
                                                );
                                                class_2680 var26 = /* jnt *//* jnt */
                                                );
                                                if (/* jnt */ instanceof class_2189) {
                                                  if (!/* jnt */
                                                    ),
                                                    null /* jnt:encrypted */
                                                  )) {
                                                    if (!(
                                                      /* jnt */ instanceof class_2189
                                                    )) {
                                                      var32 = 1961687412 >>> 1961687412 ^ 1771047909;
                                                    } else {
                                                      var32 = 73811542 >> 73811542 ^ -1054598176;
                                                    }
                                                  } else {
                                                    var32 = 1961687412 >>> 1961687412 ^ 1771047909;
                                                  }
                                                } else {
                                                  var32 = 73811542 >> 73811542 ^ -1054598176;
                                                }

                                                switch (var32 - 901132149 + 1367754656 + 291499356 - 1103957580 ^ 726717445 ^ 1302475159) {
                                                  case -898238786:
                                                  default:
                                                    int var27 = 0;
                                                    var32 = (-1663560040 & -274728980 | 741515604) & 1044046709;

                                                    label280:
                                                    while (true) {
                                                      switch (((var32 + 1762837565 ^ 1793132380) - 506902445 + 1623979659 ^ 1788810216) - 2103791442) {
                                                        case -1418117903:
                                                        default:
                                                          if (var27 < 3) {
                                                            int var28 = var11 + var27;
                                                            class_2338 var29 = (BlockPos)/* jnt */;
                                                            class_2680 var30 = /* jnt */;
                                                            class_2248 var31 = /* jnt */;
                                                            if (!/* jnt */) {
                                                              if (var31 instanceof class_2384) {
                                                                var32 = (-87369324 | -87369324 | 168172641) & -1693499799;
                                                              } else {
                                                                var32 = (-2031283929 >>> 1305086511 - -2031283929 * 1305086511 | -819139837) & -282071065;
                                                              }
                                                            } else {
                                                              var32 = (-87369324 | -87369324 | 168172641) & -1693499799;
                                                            }

                                                            while (true) {
                                                              switch (((var32 ^ 77606414) + 1652481096 ^ 1131505974) - 684036396 - 2010170158 - 287529784) {
                                                                case -1868384273:
                                                                  var15 = 2;
                                                                  break label282;
                                                                case -1144634091:
                                                                  if (/* jnt */
                                                                    ),
                                                                    null /* jnt:encrypted */
                                                                  )) {
                                                                    if (var31
                                                                      == null /* jnt:encrypted */
                                                                      )
                                                                     {
                                                                      var15 = 1;
                                                                      break label282;
                                                                    }

                                                                    var32 = 1423679838 & 503087069 ^ 237659525;
                                                                  } else {
                                                                    var32 = 1423679838 & 503087069 ^ 237659525;
                                                                  }
                                                                  break;
                                                                case 300318359:
                                                                default:
                                                                  var27++;
                                                                  var32 = (-1663560040 & -274728980 | 741515604) & 1044046709;
                                                                  continue label280;
                                                              }
                                                            }
                                                          }

                                                          var32 = (-1149546751 ^ -63345381 << -1411043562 | 271370258) & -1825580590;
                                                          break;
                                                        case 1010994119:
                                                          var21++;
                                                          var32 = 1828281932 >>> (1496190134 ^ -1018465217) ^ 647086751;
                                                          continue label282;
                                                      }
                                                    }
                                                  case 838985332:
                                                    var15 = 1;
                                                    break label282;
                                                }
                                              case 319027935:
                                              default:
                                                if (/* jnt */
                                                  == null /* jnt:encrypted */
                                                  )
                                                 {
                                                  var15 = 1;
                                                  break label282;
                                                }

                                                var32 = (-1711394393 * 722170402 | 740593152) & -324223359;
                                            }
                                          }
                                      }
                                    }
                                  } else {
                                    var32 = (823435808 + -2028344597 | -380613884) & -70026250;
                                  }
                                }
                              }

                              var32 = 2100410125 & (-2075570065 | 123203732) ^ -1962700837;
                              break;
                            case -1671243562:
                              var12[var13][var14] = var15;
                              var14++;
                              var32 = (-750303147 * 1689273939 | -773028256) & -672270360;
                              continue label294;
                          }
                        }
                      }

                      var32 = (-1569127569 >>> -1569127569 | -338146624) & -69251371;
                      break;
                    case 629126106:
                      var13++;
                      continue label307;
                    case 1158566317:
                      var13++;
                      break label302;
                    case 1300891608:
                    default:
                      var14++;
                      var32 = -1512193049 & -368208391 ^ -1616008692;
                      break;
                    case 2033744816:
                      var13++;
                      break label294;
                  }
                }
              }

              var32 = 967812202 ^ 976810478 << (967812202 & 976810478) ^ 1672432621;
            }

            var32 = 1329128437 & 996740568 ^ 1513796189;
          }
        }
    }
  }

  public void aii(vt var1) {
    mu var2 = null /* jnt:encrypted */;
    ArrayList var3 = /* jnt */;
    if (var3 != null) {
      null /* jnt:encrypted */;
      null /* jnt:encrypted */;
    }
  }

  public ArrayList wnz(mu var1, vt var2) {
    int var8 = -74926917;
    ArrayList var3 = (ArrayList)/* jnt */;
    /* jnt */;
    /* jnt */);
    /* jnt */);
    /* jnt */;
    Iterator var4 = /* jnt */;

    label41:
    while (true) {
      var8 = (-108064784 | 505936259 | 818967820) & -1294828243;

      while (true) {
        switch ((var8 - 725770776 - 312702368 - 946718837 ^ 973478662) - 1609822604 + 2050443903) {
          case 549199609:
          default:
            if (/* jnt */) {
              vt var5 = (vt)/* jnt */;
              ArrayList var6 = /* jnt */;
              if (/* jnt */ > 5) {
                return var6;
              }

              var8 = -208348577 & (-76328168 | -76328168) ^ 1612570902;

              mu var10000;
              label38:
              while (true) {
                switch ((var8 - 875644358 ^ 985296497 ^ 562071557) + 1628122986 - 1684391817 + 1105054590) {
                  case -2073444709:
                    if (!/* jnt */) {
                      var10000 = (mu)/* jnt */;
                      break label38;
                    }

                    var8 = (2005818776 << -741358244 | -80374345) & -4735041;
                    break;
                  case 448912612:
                  default:
                    var10000 = var1;
                    break label38;
                }
              }

              mu var7 = var10000;
              /* jnt */;
              continue label41;
            }

            var8 = (-1751136126 * 258182741 | -1436530492) & -26948667;
            break;
          case 676235652:
            return null;
        }
      }
    }
  }

  public void rl(mu var1) {
    int var4 = -438474117;
    int var2 = -3;

    label42:
    while (true) {
      var4 = 1242608655 << (1242608655 >> 1308751213) ^ -1527628831;

      while (true) {
        switch ((var4 + 1472410366 + 901384273 ^ 1501710330) - 1512882844 ^ 963232811 ^ 1196029067) {
          case -1382629202:
            if (var2 <= 3) {
              int var3 = -3;

              label39:
              while (true) {
                var4 = (468836365 - -1536903812 | 517095172) & -1628241980;

                while (true) {
                  switch (var4 - 1659964232 + 1141848470 - 1027638469 - 1798612691 + 532223707 ^ 1539448941) {
                    case 754350456:
                      if (var3 <= 3) {
                        /* jnt */,
                          (mu)/* jnt */ + var2, null /* jnt:encrypted */ + var3
                          )
                        );
                        var3++;
                        continue label39;
                      }

                      var4 = (-1914160511 >>> -796326992 | -1463221741) & -2256289;
                      break;
                    case 1525267329:
                    default:
                      var2++;
                      continue label42;
                  }
                }
              }
            }

            var4 = -2080404412 - 1101501201 ^ -1290819529;
            break;
          case -1291109971:
          default:
            return;
        }
      }
    }
  }

  public void sms(mu var1) {
    /* jnt */,
      (Predicate<mu>)var2 -> /* jnt */
    );
  }

  public boolean ny(mu var1, mu var2) {
    int var4 = -367315110;
    byte var3 = 10;

    var4 = switch ((
          /* jnt */) ^ 413859146
        )
        + 2103389451
        + 1329428744
        - 1135012748
        + 1631404066
      ^ 1871751506) {
      case 1833787040 -> (-2095432430 | 1589845917 | 896166401) & 1970237253;
      case 1833787041, 1833787045, 1833787050 -> -1231045072 * (-1366090788 & -1366090788) ^ 1263014485;
      case 1833787043 -> 1824947068 & 2028828181 ^ -1565407169;
      case 1833787044, 1833787046, 1833787047 -> (-593059890 >> 1138110731 | 157284) & -670929307;
      default -> -878670847 - -1439358870 ^ 1809254790;
    };

    while (true) {
      boolean var10000;
      switch (((var4 + 2109177931 ^ 260161096) - 82658656 - 52721320 ^ 1491393127) - 362203408) {
        case -1763801497:
          if (null /* jnt:encrypted */ >= null /* jnt:encrypted */ - var3) {
            var4 = (-1409707917 >>> 1828521516 | -590340074) & -573528233;
            continue;
          }

          var10000 = true;
          break;
        case -1499225561:
          var10000 = false;
          break;
        case -916119065:
          var10000 = false;
          break;
        case -781340325:
          throw (MatchException)/* jnt */;
        case -181699193:
          if (null /* jnt:encrypted */ <= null /* jnt:encrypted */ + var3) {
            var4 = 233645643 * -1949725238 ^ 1876240757;
            continue;
          }

          var10000 = true;
          break;
        case -140877257:
          if (null /* jnt:encrypted */ >= null /* jnt:encrypted */ - var3) {
            var4 = (558304176 << 558304176 | 1705661125) & 1979711487;
            continue;
          }

          var10000 = true;
          break;
        case -25412043:
          var10000 = false;
          break;
        case 276383345:
          var10000 = false;
          break;
        case 1374112065:
        default:
          if (null /* jnt:encrypted */ <= null /* jnt:encrypted */ + var3) {
            var4 = (-1207471657 >> -1207471657 + 347321424 | 60412549) & 66966157;
            continue;
          }

          var10000 = true;
      }

      return var10000;
    }
  }

  public boolean ydc(mu var1) {
    return /* jnt */, var1
    );
  }

  public ArrayList yv(mu var1, vt var2) {
    int var19 = -564872829;
    PriorityQueue var3 = (PriorityQueue)/* jnt */var0 -> null /* jnt:encrypted */
      )
    );
    HashSet var4 = (HashSet)/* jnt */;
    ge var5 = (ge)/* jnt */;
    /* jnt */;
    ge var6 = var5;
    int var7 = 0;
    int[] var8 = new int[]{0, -1, 1, 0, -1, 1, -1, 1};
    int[] var9 = new int[]{-1, 0, 0, 1, -1, -1, 1, 1};

    label76:
    while (true) {
      var19 = 333974477 * 1054902889 ^ 1824707417;

      while (true) {
        switch ((var19 - 2118963027 - 98765933 - 1551594462 ^ 797964014) + 228070242 ^ 1274820479) {
          case -1390724288:
            return /* jnt */;
          case 593225949:
        }

        if (!/* jnt */) {
          ge var10 = (ge)/* jnt */;
          if (!/* jnt */
          )) {
            /* jnt */);
            int var11 = /* jnt */, var2
            );
            if (var11 > var7) {
              var7 = var11;
              var6 = var10;
            }

            int var12 = 0;

            label74:
            while (true) {
              var19 = -526734407 >>> 455588386 ^ 1509704662;

              while (true) {
                switch ((var19 ^ 664315824 ^ 2076224919 ^ 1724459715) + 150032324 + 821905062 - 1347873952) {
                  case 1155756966:
                  default:
                    if (var12 < var8.length) {
                      int var13 = null /* jnt:encrypted */) + var8[var12];
                      int var14 = null /* jnt:encrypted */) + var9[var12];
                      mu var15 = (mu)/* jnt */;
                      if (/* jnt *//* jnt */,
                          var15,
                          /* jnt */
                        )
                      )) {
                        var19 = (-193716608 ^ -193716608 | -2096743307) & -1680343177;

                        label70:
                        while (true) {
                          switch (var19 + 1969821991 + 1286385057 + 1740953507 + 1944306248 + 1842546250 + 205975756) {
                            case -1696689090:
                            default:
                              if (/* jnt */) {
                                break label70;
                              }

                              var19 = 1405310345 << 1948512474 ^ 999935325;
                              break;
                            case -716902099:
                              int var16 = null /* jnt:encrypted */ + 1;
                              int var17 = /* jnt */;
                              ge var18 = (ge)/* jnt */;
                              /* jnt */;
                              break label70;
                            case 930227494:
                              if (/* jnt */) {
                                break label70;
                              }

                              var19 = (1119450976 >> 116141895 | -1117218464) & -8610460;
                          }
                        }
                      }

                      var12++;
                      continue label74;
                    }

                    var19 = 1866722884 >> 932537175 ^ 1225967266;
                    break;
                  case 1562087522:
                    continue label76;
                }
              }
            }
          }
          break;
        }

        var19 = 623933971 >>> 623933971 ^ -680765065;
      }
    }
  }

  public int igh(mu var1, mu var2, vt var3) {
    int var4 = -1595384425;
    return switch (switch ((/* jnt */ + 221612887 ^ 1245126581)
          - 1842196948
          + 383820666
          + 1927884947
          + 713865447) {
          case -1920241662 -> -1615124685 >>> -1615124685 ^ 1132239452;
          case -1920241656 -> (1120410177 - 315528363 | 1358964232) & 1468743373;
          case -1920241655 -> -869704330 + 420418375 ^ -507487184;
          case -1920241653 -> -1241183761 >>> -403274312 ^ -2144680466;
          case -1920241652 -> (-1361931930 * -1361931930 | 1880165971) & -265072809;
          case -1920241651 -> (-1298112475 ^ 1273202346 | 77448042) & 1587397498;
          case -1920241650 -> (1309163234 + 1176900816 | -1555454451) & -1546932643;
          case -1920241649 -> (-1334854566 & -1164828240 | 204586337) & 766770547;
          default -> (1233527772 & 1233527772 | 1069960480) & 1073110825;
        }
        + 1576510486
        + 1668861570
        - 1350009969
        - 1956958332
        + 1780105463
      ^ 1426852997) {
      case -1778372983 -> null /* jnt:encrypted */ - null /* jnt:encrypted */;
      case -1282068609 -> null /* jnt:encrypted */
      - null /* jnt:encrypted */
      + (null /* jnt:encrypted */ - null /* jnt:encrypted */);
      default -> null /* jnt:encrypted */ - null /* jnt:encrypted */;
      case -386168405 -> null /* jnt:encrypted */
      - null /* jnt:encrypted */
      + (null /* jnt:encrypted */ - null /* jnt:encrypted */);
      case -214392497 -> throw (MatchException)/* jnt */;
      case -51977016 -> null /* jnt:encrypted */ - null /* jnt:encrypted */;
      case 59990140 -> null /* jnt:encrypted */ - null /* jnt:encrypted */;
      case 1047168938 -> null /* jnt:encrypted */
      - null /* jnt:encrypted */
      + (null /* jnt:encrypted */ - null /* jnt:encrypted */);
      case 1555433530 -> null /* jnt:encrypted */
      - null /* jnt:encrypted */
      + (null /* jnt:encrypted */ - null /* jnt:encrypted */);
    };
  }

  public vt ifp(mu var1, mu var2) {
    int var5 = -158810234;
    int var3 = null /* jnt:encrypted */ - null /* jnt:encrypted */;
    int var4 = null /* jnt:encrypted */ - null /* jnt:encrypted */;
    if (var3 == 0 && var4 < 0) {
      return null /* jnt:encrypted */;
    } else {
      var5 = (-685520964 >>> -358808340 | -901836575) & -545278495;

      while (true) {
        switch ((var5 + 541505651 ^ 787361488 ^ 1760326976 ^ 820277713) + 1976264117 - 2006870372) {
          case -1899584470:
            if (var3 > 0 && var4 < 0) {
              return null /* jnt:encrypted */;
            }

            var5 = (-2008775875 * -2008775875 | 354099454) & 389784063;
            break;
          case -1701789850:
          default:
            if (var3 == 0 && var4 > 0) {
              return null /* jnt:encrypted */;
            }

            var5 = (2015142782 | -1104186628 + 1555895611) ^ 527788821;
            break;
          case -245149971:
            if (var3 < 0 && var4 == 0) {
              return null /* jnt:encrypted */;
            }

            var5 = (1849259125 >> 1849259125 | 1559828874) & 1560123818;
            break;
          case 58386465:
            return null /* jnt:encrypted */;
          case 168228013:
            if (var3 > 0 && var4 == 0) {
              return null /* jnt:encrypted */;
            }

            var5 = (-13964022 & -749624659 * -13964022 | 1177605157) & -948248715;
            break;
          case 1066725252:
            if (var3 < 0 && var4 < 0) {
              return null /* jnt:encrypted */;
            }

            var5 = (-561349318 & 52271998 >>> -561349318 - 52271998 | -52650729) & -33645225;
            break;
          case 1470331050:
            if (var3 < 0 && var4 > 0) {
              return null /* jnt:encrypted */;
            }

            var5 = (577330784 - 577330784 | 1399130398) & -202913473;
            break;
          case 1777499164:
            if (var3 > 0 && var4 > 0) {
              return null /* jnt:encrypted */;
            }

            var5 = 1704590080 << 1253764055 ^ -1891000923;
        }
      }
    }
  }

  public int fym(mu var1, mu var2, vt var3) {
    int var6 = 855847028;
    int var4 = null /* jnt:encrypted */ - null /* jnt:encrypted */;
    int var5 = null /* jnt:encrypted */ - null /* jnt:encrypted */;
    return switch ((
        (
              switch ((/* jnt */ ^ 1950291475 ^ 1588669619 ^ 1582563209)
                    - 1622521571
                    - 1439150143
                    + 1050943307) {
                    case -50037423 -> (-979627579 + 1372014337 | -1409006295) & -1392187607;
                    case -50037422 -> (1097740197 << 1097740197 | -1506072935) & -142606375;
                    case -50037421 -> (-1199728481 | -1328770663 | -2092112366) & -681777550;
                    case -50037420 -> -1669865447 >> -1669865447 ^ 1094627782;
                    case -50037419 -> -658860509 * 362230449 ^ -1460283903;
                    case -50037418 -> (-1948773378 >>> 488579028 | -1687998206) & -605293789;
                    case -50037417 -> -861759692 >> -861759692 ^ -1781434436;
                    case -50037416 -> (-310582447 >>> -310582447 | -958189563) & -17584121;
                    default -> (-1085686203 | -1925130311 | 807277153) & 845034107;
                  }
                  + 1479696051
                  - 1639868549
                ^ 1670575895
            )
            + 416875798
          ^ 1882233082
      )
      - 1675284736) {
      case -1694471305 -> var5 + var4 + /* jnt */;
      case -1337021636 -> throw (MatchException)/* jnt */;
      case 53471004 -> var5 + /* jnt */ * 2;
      case 140448307 -> -var5 + var4 + /* jnt */;
      case 256956311 -> var4 + /* jnt */ * 2;
      case 391347366 -> var5 - var4 + /* jnt */;
      case 601062850 -> -var5 - var4 + /* jnt */;
      case 1003835341 -> -var4 + /* jnt */ * 2;
      default -> -var5 + /* jnt */ * 2;
    };
  }

  public ArrayList wbr(ge var1) {
    int var4 = -1950022494;
    ArrayList var2 = (ArrayList)/* jnt */;
    ge var3 = var1;

    label22:
    while (true) {
      var4 = (473535052 << 473535052 | 1117270397) & 1255881215;

      while (true) {
        switch (((var4 ^ 1144576867) - 756292180 ^ 1166073946) + 1250195706 - 2084301834 ^ 1187408788) {
          case 882038548:
            if (var3 != null) {
              /* jnt */
              );
              var3 = null /* jnt:encrypted */;
              continue label22;
            }

            var4 = 857256122 - (1104771222 ^ 857256122 * 1104771222) ^ 1792869540;
            break;
          case 1779363229:
          default:
            return var2;
        }
      }
    }
  }
  public void kyv(lf var1) {
    int var10 = -417730863;
    if (null /* jnt:encrypted */
        )
        != null
      && null /* jnt:encrypted */
        )
        != null
      && null /* jnt:encrypted */ != null) {
      var10 = 259672654 * 1607102598 ^ 148247392;
    } else {
      var10 = -1293772130 & -463774721 ^ 101586016;
    }

    switch (((var10 ^ 903953678) + 1983369303 - 1090784004 ^ 1519390682) + 820447942 + 1390200265) {
      case -1769090970:
        byte var2 = 30;
        double var3 = /* jnt */
            )
          )
          + 0.03;
        zn var5 = (zn)/* jnt */;
        int var6 = null /* jnt:encrypted */) - var2;

        label67:
        while (true) {
          var10 = 864723948 + 1153440436 ^ 1079047519;

          while (true) {
            switch ((var10 ^ 1759233896 ^ 1612309114) - 975053566 - 132599792 + 271109753 + 435440746) {
              case -1596553646:
                return;
              case 418387682:
            }

            if (var6 <= null /* jnt:encrypted */) + var2) {
              int var7 = null /* jnt:encrypted */) - var2;

              label64:
              while (true) {
                var10 = 1926294534 ^ 9681692 ^ 1701524207;

                while (true) {
                  switch ((var10 ^ 133977348 ^ 1572064786 ^ 1309734899) + 1241376673 + 977742876 ^ 308665078) {
                    case -1966273335:
                    default:
                      var6++;
                      continue label67;
                    case -1780890053:
                  }

                  if (var7 <= null /* jnt:encrypted */) + var2) {
                    mu var8 = (mu)/* jnt */;
                    Boolean var9 = (Boolean)/* jnt */, var8
                    );
                    if (var9 != null) {
                      if (/* jnt */) {
                        var10 = (461723595 & 461723595 | 1156644901) & 1710819135;
                      } else {
                        var10 = (194759610 | -1807770712 | 547660800) & 1944364040;
                      }
                    } else {
                      var10 = (461723595 & 461723595 | 1156644901) & 1710819135;
                    }

                    while (true) {
                      switch ((var10 + 369419537 - 189554077 ^ 1271331489 ^ 54490457) + 1349424508 ^ 374777728) {
                        case -783966848:
                        default:
                          /* jnt */;
                          var10 = (461723595 & 461723595 | 1156644901) & 1710819135;
                          break;
                        case 2129146199:
                          var7++;
                          continue label64;
                      }
                    }
                  }

                  var10 = (2094313975 | 2094313975 | 2895428) & 37547631;
                }
              }
            }

            var10 = (630054575 << 131704864 * -1708398882 | -1870896832) & -226559137;
          }
        }
      case 372557608:
    }
  }

  public void zpi(lf var1, int var2, int var3, double var4, zn var6) {
    double var7 = (double)(var2 * 3);
    double var9 = (double)(var3 * 3);
    double var11 = var7 + 3.0;
    double var13 = var9 + 3.0;
    /* jnt */, var7, var4, var9, var11, var4, var9, var6
    );
    /* jnt */, var11, var4, var9, var11, var4, var13, var6
    );
    /* jnt */, var11, var4, var13, var7, var4, var13, var6
    );
    /* jnt */, var7, var4, var13, var7, var4, var9, var6
    );
  }

  public void wwn(ArrayList var1, lf var2) {
    int var20 = 1103514426;
    if (null /* jnt:encrypted */
        )
        != null
      && null /* jnt:encrypted */
        )
        != null
      && var1 != null
      && /* jnt */ >= 2
      && null /* jnt:encrypted */ != null) {
      var20 = -466429791 * 828136428 ^ 1453403198;
    } else {
      var20 = -1773175728 >>> -1773175728 ^ -1232319567;
    }

    switch (var20 - 1734532670 + 1573560920 + 2129445789 - 1839071677 ^ 594517932 ^ 1980999380) {
      case -348169600:
        return;
      case 78147636:
      default:
        int var3 = 0;

        while (true) {
          var20 = (-975983817 - 95713275 | 613023874) & 619661462;

          while (true) {
            switch ((var20 - 33362237 + 1481835736 ^ 1549975253) + 1051943227 ^ 1559000605 ^ 1333295843) {
              case -1156652669:
                return;
              case 1991090401:
            }

            if (var3 < /* jnt */ - 1) {
              mu var4 = (mu)/* jnt */;
              mu var5 = (mu)/* jnt */;
              double var6 = (double)(null /* jnt:encrypted */ * 3) + 1.5;
              double var8 = /* jnt */
                )
              );
              double var10 = (double)(null /* jnt:encrypted */ * 3) + 1.5;
              double var12 = (double)(null /* jnt:encrypted */ * 3) + 1.5;
              double var14 = /* jnt */
                )
              );
              double var16 = (double)(null /* jnt:encrypted */ * 3) + 1.5;
              class_243 var18 = (Vec3d)/* jnt */;
              class_243 var19 = (Vec3d)/* jnt */;
              /* jnt */,
                null /* jnt:encrypted */,
                null /* jnt:encrypted */,
                null /* jnt:encrypted */,
                null /* jnt:encrypted */,
                null /* jnt:encrypted */,
                null /* jnt:encrypted */,
                (zn)/* jnt */)
              );
              var3++;
              break;
            }

            var20 = (857940063 | 151004427 - 151004427) ^ -334750045;
          }
        }
    }
  }
  public vt ix() {
    int var6 = 859045998;
    if (null /* jnt:encrypted */ != null
      && !/* jnt */
      )
      && null /* jnt:encrypted */
        < /* jnt */
        )
      && null /* jnt:encrypted */
        )
        != null) {
      var6 = 1427689414 >>> 471548403 ^ 816849890;
    } else {
      var6 = (-1780602099 & 1402596961 | 954372224) & 971486636;
    }

    switch ((var6 - 742722525 ^ 1521874427) - 1778257364 - 181072176 + 2020996723 - 1195578614) {
      case 328348625:
        return null;
      case 457755416:
      default:
        class_2338 var1 = /* jnt */
          )
        );
        int var2 = /* jnt */, 3
        );
        int var3 = /* jnt */, 3
        );
        mu var4 = (mu)/* jnt */;
        mu var5 = (mu)/* jnt */, null /* jnt:encrypted */
        );
        if (/* jnt */) {
          null /* jnt:encrypted */ + 1);
          if (null /* jnt:encrypted */
            >= /* jnt */
            )) {
            return null;
          }

          var6 = (-1026166858 * -503869969 | 1610711063) & -524159113;
        } else {
          var6 = 1474363668 >>> 176024216 ^ -13766203;
        }

        while (true) {
          switch (((var6 + 238099818 ^ 2137885008) - 529650458 ^ 466954770) - 74829530 ^ 639932912) {
            case 1137050971:
              var5 = (mu)/* jnt */,
                null /* jnt:encrypted */
              );
              var6 = 1474363668 >>> 176024216 ^ -13766203;
              break;
            case 1658541654:
            default:
              return /* jnt */;
          }
        }
    }
  }

  public float awu(vt var1) {
    int var16 = -2119677348;
    if (null /* jnt:encrypted */ != null
      && null /* jnt:encrypted */
        < /* jnt */
        )
      && null /* jnt:encrypted */
        )
        != null) {
      var16 = -669184808 >>> (-1285810891 & (-669184808 | -1285810891)) ^ -1344606600;
    } else {
      var16 = 499518735 << 1074691413 ^ 1547041864;
    }

    switch ((var16 ^ 275206658 ^ 1090287551 ^ 900975141) + 175759124 + 408048468 + 596339093) {
      case -548098099:
      default:
        return /* jnt */;
      case 290038557:
        mu var2 = (mu)/* jnt */, null /* jnt:encrypted */
        );
        double var3 = (double)(null /* jnt:encrypted */ * 3) + 1.5;
        double var5 = (double)(null /* jnt:encrypted */ * 3) + 1.5;
        double var7 = /* jnt */
          )
        );
        double var9 = /* jnt */
          )
        );
        double var11 = var3 - var7;
        double var13 = var5 - var9;
        return /* jnt */ < 0.1
            && /* jnt */ < 0.1
          ? /* jnt */
          : (float)/* jnt */
          );
    }
  }

  public float jj(vt var1) {
    int var2 = -1663763779;
    return switch ((
          switch ((/* jnt */ ^ 248513487 ^ 202072571 ^ 1668585423)
                - 1322679004
                - 384771211
                + 632230584) {
                case 563702089 -> -1117735160 * -1117735160 ^ -1120269836;
                case 563702090 -> 1960675925 << 1960675925 ^ -43320965;
                case 563702091 -> -671821976 & -671821976 ^ -1705815139;
                case 563702092 -> (1579648933 << (2029523807 >> -2077407868) | -1827124044) & -1619374091;
                case 563702093 -> (-1560836459 & 915172548 | -707609942) & -704971090;
                case 563702094 -> (631112443 + 986757008 | -1575938642) & -80243202;
                case 563702095 -> (1501139118 - 1440242612 | -1726693279) & -615070875;
                case 563702096 -> 1243864014 << 920254545 ^ 562454475;
                default -> (-617401413 >> -617401413 | 1621508616) & 1978581594;
              }
              - 693867475
            ^ 1114448691
        )
        - 1240374396
        - 552767533
      ^ 1347166317
      ^ 2069809985) {
      case -1894905305 -> throw (MatchException)/* jnt */;
      case -1529012973 -> -45.0F;
      case -1473628653 -> 45.0F;
      case -802351548 -> 0.0F;
      case -471857096 -> 135.0F;
      case -387950834 -> -135.0F;
      case -272464891 -> 180.0F;
      default -> -90.0F;
      case 2132046085 -> 90.0F;
    };
  }

  public float wgr(float var1, float var2, float var3) {
    float var4 = /* jnt */;
    var4 = /* jnt */;
    return var1 + var4;
  }

  public float ab(float var1) {
    int var2 = -1044685474;
    var1 %= 360.0F;
    if (var1 >= 180.0F) {
      var1 -= 360.0F;
    }

    var2 = 313699099 << 1890978170 ^ -127187433;

    while (true) {
      switch ((var2 + 1258025020 + 1160992491 + 48159362 ^ 952999686) - 1473157422 ^ 1145930610) {
        case -2085888790:
        default:
          if (var1 < -180.0F) {
            var1 += 360.0F;
          }

          var2 = -386396471 * -386396471 ^ -2084725076;
          break;
        case -1648910464:
          return var1;
      }
    }
  }

  public void wup() {
    int var2 = -1784318003;
    int var10002 = null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    if (var10002 <= 0) {
      null /* jnt:encrypted */
      );
      null /* jnt:encrypted */
                * 2.0F
              - 1.0F
          )
          * 0.35F
      );
      null /* jnt:encrypted */
                * 2.0F
              - 1.0F
          )
          * 0.25F
      );
      null /* jnt:encrypted */
      );
    }

    var2 = (764076091 | -442685792) ^ 867601753;

    while (true) {
      switch (var2 - 1057645810 + 427181987 + 835251499 + 1806483046 - 1312403036 ^ 1888293184) {
        case -1471611220:
          null /* jnt:encrypted */
          );
          null /* jnt:encrypted */
          );
          return;
        case 2002541192:
          if (null /* jnt:encrypted */ <= 0) {
            var2 = (-684668362 | 982666197) ^ 449121073;
            continue;
          }

          null /* jnt:encrypted */ - 1);
          float var1 = 0.85F
            + /* jnt */
              )
              * 0.3F;
          null /* jnt:encrypted */ + null /* jnt:encrypted */ * var1
          );
          null /* jnt:encrypted */ + null /* jnt:encrypted */ * var1
          );
          null /* jnt:encrypted */
              * (
                0.65F
                  + /* jnt */
                    )
                    * 0.1F
              )
          );
          null /* jnt:encrypted */
              * (
                0.65F
                  + /* jnt */
                    )
                    * 0.1F
              )
          );
          break;
        case 2140320236:
        default:
          null /* jnt:encrypted */ * 0.92F);
          null /* jnt:encrypted */ * 0.92F);
          null /* jnt:encrypted */
              + (
                  /* jnt */
                    )
                    - 0.5F
                )
                * 0.02F
          );
          null /* jnt:encrypted */
              + (
                  /* jnt */
                    )
                    - 0.5F
                )
                * 0.015F
          );
      }

      var2 = (1175284765 | -929731560) ^ 1636006939;
    }
  }
  public void oei() {
    int var2 = -655260438;
    if (null /* jnt:encrypted */ <= 0) {
      int var1 = /* jnt */, 3
      );

      var2 = switch (((var1 ^ 328402251) + 201047002 ^ 615377428) - 1260189764 + 1804273606 ^ 115890653) {
        case 1568236388 -> -900102433 << -1739950100 ^ 967025232;
        case 1568236398 -> -332541932 >> -1002123050 ^ -610529233;
        case 1568236399 -> (-1635138703 & 802117330 | 558125317) & 570218757;
        default -> 1938230052 >> 648991626 ^ 1849518172;
      };

      label28:
      while (true) {
        switch ((var2 + 1128225500 ^ 844023515) - 1974512018 - 1100175839 + 663375021 ^ 444986552) {
          case -592043676:
            null /* jnt:encrypted */);
            break;
          case -586267954:
            null /* jnt:encrypted */);
            break;
          case -370040987:
            null /* jnt:encrypted */
            );
            var2 = (2081651559 >>> 746731969 | 959217733) & 2070912893;
            break label28;
          case 1561084299:
          default:
            null /* jnt:encrypted */);
        }

        var2 = 1938230052 >> 648991626 ^ 1849518172;
      }
    } else {
      var2 = (594210924 + 439805671 | 583401996) & 1658720942;
    }

    while (true) {
      switch (var2 + 1161098544 + 1801809346 - 1422058356 + 1391062955 - 1343184844 - 458978280) {
        case 1713155459:
        default:
          null /* jnt:encrypted */ - 1);
          var2 = (2081651559 >>> 746731969 | 959217733) & 2070912893;
          break;
        case 2122594538:
          return;
      }
    }
  }

  public void qqd() {
    int var1 = -929777133;
    if (null /* jnt:encrypted */ > 0) {
      null /* jnt:encrypted */ - 1);
    } else {
      var1 = -1984796486 * 151424868 ^ 1897915595;

      while (true) {
        label39:
        switch (((var1 - 1761465211 ^ 964126243) + 1493740492 - 2015266298 ^ 311764911) - 420978585) {
          case -2064885242:
            return;
          case 435463383:
            null /* jnt:encrypted */);
            if (!null /* jnt:encrypted */) {
              var1 = (1287833435 + -470619938 | 38822018) & -883591990;
              continue;
            }

            null /* jnt:encrypted */
            );
            break;
          case 436518991:
            null /* jnt:encrypted */;
            null /* jnt:encrypted */
            );
            break;
          case 941517322:
            null /* jnt:encrypted */;
            null /* jnt:encrypted */
            );
            break;
          case 1718019550:
            if (!(
              /* jnt */
                )
                < 0.15F
            )) {
              var1 = (809915920 >>> -1154097297 | -488241199) & -17395725;
              continue;
            }

            null /* jnt:encrypted */;
            null /* jnt:encrypted */
            );
            break;
          case 2000802201:
          default:
            switch ((
                (
                      /* jnt */)
                          + 1897466215
                          - 1642156475
                        ^ 703121542
                    )
                    - 704749003
                  ^ 1643099938
              )
              - 1500582219) {
              case 1136739575:
                var1 = -591196588 - -2084290673 ^ 1166876773;
                continue;
              case 1136739634:
                var1 = (-843645161 * (1454535084 & (-843645161 ^ 1454535084)) | 1087127700) & -437468778;
                continue;
              case 1136739636:
                var1 = (-1387193306 ^ 839509522 << 839509522 | -1026151511) & -489264215;
                continue;
              default:
                break label39;
            }
          case 2055628728:
            null /* jnt:encrypted */
            );
        }

        var1 = (1626788577 * -1869985933 | -78016024) & -69616136;
      }
    }
  }

  public void dok(boolean var1) {
    if (var1) {
      /* jnt */
          )
        ),
        false
      );
    } else {
      /* jnt */;
      /* jnt */;
      /* jnt */
          )
        ),
        null /* jnt:encrypted */
      );
    }
  }

  public boolean dkt(class_2248 var1) {
    int var2 = -865443060;
    if (var1 != null /* jnt:encrypted */
      && var1 != null /* jnt:encrypted */) {
      var2 = (183247535 << 228687270 | 1735291239) & -9439249;
    } else {
      var2 = (-524687788 * -1210829174 | -503019857) & -502882625;
    }
    return switch (((var2 + 225052015 ^ 1383952927) + 292757772 ^ 621107618) + 1852119289 ^ 1224017833) {
      default -> false;
      case 287070209 -> true;
    };
  }

  public vt ov() {
    int var2 = 48659427;
    float var1 = /* jnt */
        )
      )
      % 360.0F;
    if (var1 < 0.0F) {
      var1 += 360.0F;
    }

    var2 = 1962888578 + 803600977 ^ 179548667;

    while (true) {
      switch ((var2 ^ 271932742) - 620480053 - 1437935754 - 1751034624 - 289709647 - 491707468) {
        case -1745882518:
          if ((double)var1 >= 247.5 && (double)var1 < 292.5) {
            return null /* jnt:encrypted */;
          }

          var2 = 996068192 >>> 194735172 ^ -67040733;
          break;
        case -1396664556:
        default:
          if ((double)var1 >= 22.5 && (double)var1 < 67.5) {
            return null /* jnt:encrypted */;
          }

          var2 = (102109258 | -1392410600) ^ -1425548200;
          break;
        case -630032046:
          if ((double)var1 >= 202.5 && (double)var1 < 247.5) {
            return null /* jnt:encrypted */;
          }

          var2 = (-2127927163 * 1064401250 | -1197473792) & -1112646781;
          break;
        case -572610695:
          if ((double)var1 >= 292.5 && (double)var1 < 337.5) {
            return null /* jnt:encrypted */;
          }

          var2 = -1188996726 ^ 1842321012 ^ -1995705415;
          break;
        case -263228337:
          if ((double)var1 >= 157.5 && (double)var1 < 202.5) {
            return null /* jnt:encrypted */;
          }

          var2 = (936677417 | 936677417) ^ -873185085;
          break;
        case 42073322:
          if ((double)var1 >= 67.5 && (double)var1 < 112.5) {
            return null /* jnt:encrypted */;
          }

          var2 = -1609456219 * 1537623829 ^ -2076170966;
          break;
        case 1009601703:
          return null /* jnt:encrypted */;
        case 1886457227:
          if ((double)var1 >= 112.5 && (double)var1 < 157.5) {
            return null /* jnt:encrypted */;
          }

          var2 = 201471624 - -1572732576 ^ 2013782215;
      }
    }
  }
  public void du() {
    int var15 = -329118977;
    int var1 = 0;
    int var2 = 0;
    class_2338 var3 = null;
    Set var4 = /* jnt */);
    Iterator var5 = /* jnt */
    );

    label171:
    while (true) {
      var15 = (-1929039943 & 1352993658 | 1975528512) & -35095446;

      while (true) {
        label165:
        while (true) {
          label163:
          while (true) {
            label161:
            while (true) {
              es var10000;
              int var10001;
              StringBuilder var10002;
              switch ((var15 + 1973696892 + 1014652317 ^ 1802597496) - 154952076 + 82388644 ^ 1818096327) {
                case -2129486962:
                  null /* jnt:encrypted */;
                  break label161;
                case -1888408110:
                  return;
                case 604082134:
                  if (/* jnt */) {
                    class_2818 var6 = (ClientWorld)/* jnt */;
                    Iterator var7 = /* jnt */
                    );

                    label112:
                    while (true) {
                      var15 = -247396839 & -417928166 ^ -537915839;

                      class_2338 var8;
                      label75:
                      while (true) {
                        switch (var15 - 135579461 + 924394843 - 1453229903 - 1760922461 + 777833791 + 2085924619) {
                          case 273424461:
                            continue label171;
                          case 1494340109:
                        }

                        if (/* jnt */) {
                          var8 = (BlockPos)/* jnt */;
                          if (!/* jnt */)
                            || !(
                              /* jnt */
                                ),
                                var8
                              ) instanceof class_2636 var10
                            )) {
                            break;
                          }

                          class_1917 var11 = /* jnt */;
                          class_1952 var12 = /* jnt */var11
                          );
                          class_2487 var13 = /* jnt */;
                          var10001 = (1775559881 >>> 1026753891 + 1775559881 | 0) & -1379851615;

                          for (var10002 = (StringBuilder)/* jnt */;
                            var10001 < (-1782285986 >>> -1133137379 ^ 6);
                            var10001 += 1321228353 ^ 1321228353 ^ 1
                          ) {
                            int var47 = /* jnt */ + 228 + 43 ^ 213;
                            int var73 = (var47 & 65535) >> 0;
                            int var48 = (var47 & 65535) >> 0 | var47 << 16;
                            int var74 = (((var47 & 65535) >> 0 | var47 << 16) & 65024) >> 9;
                            char var49 = (char)(((var73 | var47 << 16) & 65024) >> 9 | ((var47 & 65535) >> 0 | var47 << 16) << 7);
                            /* jnt */(var74 | var48 << 7));
                          }

                          Optional var14 = /* jnt */
                          );
                          if (!/* jnt */) {
                            String var24 = (String)/* jnt */;
                            var10001 = (-1959702334 | 1752972833 | 0) & 131348;
                            var10002 = (StringBuilder)/* jnt */;

                            label102:
                            while (true) {
                              var15 = (1252166552 ^ 1990173872 | 327359001) & 1406360249;

                              while (true) {
                                label184: {
                                  StringBuilder var30;
                                  switch (((var15 ^ 1628801864) + 978803708 - 78971710 + 456475274 ^ 863970144) - 1307148051) {
                                    case -1887138811:
                                    default:
                                      var30 = var10002;
                                      if (var10001 < ((-1937808246 >>> -1976363284 | 0) & 886509585)) {
                                        int var56 = /* jnt */;
                                        int var76 = (var56 & 64512) >> 10;
                                        int var57 = (var56 & 64512) >> 10 | var56 << 6;
                                        int var77 = (((var56 & 64512) >> 10 | var56 << 6) & 63488) >> 11;
                                        var56 = ((var76 | var56 << 6) & 63488) >> 11 | ((var56 & 64512) >> 10 | var56 << 6) << 5;
                                        var76 = ((var77 | var57 << 5) & 49152) >> 14;
                                        int var59 = (((var77 | var57 << 5) & 49152) >> 14 | var56 << 2) ^ 129;
                                        int var79 = (((((var77 | var57 << 5) & 49152) >> 14 | var56 << 2) ^ 129) & 57344) >> 13;
                                        char var60 = (char)(
                                          (((var76 | var56 << 2) ^ 129) & 57344) >> 13 | ((((var77 | var57 << 5) & 49152) >> 14 | var56 << 2) ^ 129) << 3
                                        );
                                        /* jnt */(var79 | var59 << 3)
                                        );
                                        var10001 += -816162951 >>> -2100232569 ^ 27178159;
                                        break label184;
                                      }

                                      var15 = (-1432142264 * -632027830 | -1314338766) & -167851597;
                                      break;
                                    case -1573416762:
                                      var30 = var10002;
                                      if (var10001 < (-155695366 - -1505305817 ^ 1349610438)) {
                                        int var52 = /* jnt */ ^ '$';
                                        char var53 = (char)(((var52 & 65024) >> 9 | var52 << 7) + 225 - 112 - 133);
                                        /* jnt */(((var52 & 65024) >> 9 | var52 << 7) + 225 - 112 - 133)
                                        );
                                        var10001 += (-2089913064 * -2089913064 | 1) & 4261175;
                                        continue label102;
                                      }

                                      var15 = (1985951797 | -123927727 & 1985951797 | -2050700160) & -2047541280;
                                  }

                                  switch ((var15 - 1341576591 + 1486532541 - 1308624957 ^ 835267193) - 162732924 + 355399392) {
                                    case -1458074562:
                                      if (!/* jnt */
                                      )) {
                                        var2++;
                                        var3 = var8;
                                      }
                                      break label75;
                                    case 2100150348:
                                  }

                                  if (/* jnt */
                                  )) {
                                    break label75;
                                  }

                                  var24 = (String)/* jnt */;
                                  var10001 = (-945153458 | -945153458 | 0) & 138477568;
                                  var10002 = (StringBuilder)/* jnt */;
                                }

                                var15 = (-1829816362 << 1353471140 | -601095592) & -47413634;
                              }
                            }
                          }
                          continue label112;
                        }

                        var15 = (1932654920 & -131000052 | -703971183) & -26321157;
                      }

                      class_2248 var16 = /* jnt */
                          ),
                          var8
                        )
                      );
                      if (/* jnt */) {
                        var1++;
                      }
                    }
                  }

                  var15 = 1714488609 ^ -705361569 ^ -1013597955;
                  continue;
                case 687076923:
                  if (var2 <= 0) {
                    var15 = 905547715 ^ 1560792858 ^ -2142537239;
                    continue;
                  }

                  null /* jnt:encrypted */ + 1);
                  break label161;
                case 725060461:
                  if (var1 <= /* jnt */)) {
                    break label163;
                  }

                  var10000 = this;
                  var10001 = (-17331910 * (2037931631 >>> -990050330) | 0) & -2105407084;
                  var10002 = (StringBuilder)/* jnt */;
                  var15 = (170657945 * 170657945 | -1759898518) & -1621140114;
                  break;
                case 989793650:
                default:
                  if (null /* jnt:encrypted */ <= 10) {
                    break label165;
                  }

                  var10000 = this;
                  var10001 = (82071753 & 947760009 | 0) & -1021579164;
                  var10002 = (StringBuilder)/* jnt */;
                  var15 = (-1286135059 ^ -1546500791 | 687617645) & -285409683;
              }

              while (true) {
                switch (((var15 - 320147553 ^ 1850289491 ^ 2035500907) + 357915313 ^ 258735038) + 493542613) {
                  case -582658255:
                  default:
                    if (var10001 >= ((-1980691551 >>> -1373099626 | 12) & -1697225714)) {
                      var15 = 1609515529 >> 174072937 ^ -1502278175;
                      switch (var15 + 2070046322 + 473933275 - 811265518 - 547615609 - 229208741 ^ 443217146) {
                        case -2088732050:
                          /* jnt */,
                            /* jnt */,
                            /* jnt */,
                            /* jnt */,
                            false
                          );
                          null /* jnt:encrypted */;
                          break label165;
                        case -985774469:
                        default:
                          /* jnt */,
                            (int)null /* jnt:encrypted */
                              )
                            ),
                            (int)null /* jnt:encrypted */
                              )
                            ),
                            (int)null /* jnt:encrypted */
                              )
                            ),
                            true
                          );
                          break label163;
                      }
                    }

                    int var43 = /* jnt */ ^ 'k' ^ 101;
                    char var44 = (char)(((var43 & 65024) >> 9 | var43 << 7) - 218 - 155);
                    /* jnt */(((var43 & 65024) >> 9 | var43 << 7) - 218 - 155)
                    );
                    var10001 += -1393609257 - -435310564 ^ -958298694;
                    var15 = (170657945 * 170657945 | -1759898518) & -1621140114;
                    continue;
                  case 883194416:
                }

                if (var10001 >= ((-1332239043 - -1727740005 | 17) & 1617698905)) {
                  var15 = (201567983 >>> 201567983 | 1626396243) & 1962735347;
                  switch (var15 + 2070046322 + 473933275 - 811265518 - 547615609 - 229208741 ^ 443217146) {
                    case -2088732050:
                      /* jnt */,
                        /* jnt */,
                        /* jnt */,
                        /* jnt */,
                        false
                      );
                      null /* jnt:encrypted */;
                      break label165;
                    case -985774469:
                    default:
                      /* jnt */,
                        (int)null /* jnt:encrypted */
                          )
                        ),
                        (int)null /* jnt:encrypted */
                          )
                        ),
                        (int)null /* jnt:encrypted */
                          )
                        ),
                        true
                      );
                      break label163;
                  }
                }

                char var38 = /* jnt */;
                int var10005 = (var38 & '\uffff') >> 0;
                int var39 = (var38 & '\uffff') >> 0 | var38 << 16;
                int var71 = (((var38 & '\uffff') >> 0 | var38 << 16) & 65534) >> 1;
                var38 = (char)((((var10005 | var38 << 16) & 65534) >> 1 | ((var38 & '\uffff') >> 0 | var38 << 16) << 15) + 36 - 199 + 64);
                /* jnt */((var71 | var39 << 15) + 36 - 199 + 64)
                );
                var10001 += -1279786741 * -233282578 ^ -1132447429;
                var15 = (-1286135059 ^ -1546500791 | 687617645) & -285409683;
              }
            }

            var15 = -1045870187 - -1391819234 ^ 1811313851;
          }

          var15 = 1772705905 ^ -558971985 >> 337713852 ^ 1283748320;
        }

        var15 = 366460538 ^ 1021105791 ^ 1202012628;
      }
    }
  }

  // $VF: Handled exception range with multiple entry points by splitting it
  // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
  public void gk(String var1, int var2, int var3, int var4) {
    int var13 = -1003231280;
    if (/* jnt */)) {
      te var5 = (te)/* jnt */)
      );
      hn var6 = (hn)/* jnt */;
      int var10001 = -523008653 >> -523008653 ^ -998;

      StringBuilder var10002;
      for (var10002 = (StringBuilder)/* jnt */;
        var10001 < (1589089960 - 805579644 ^ 783510306);
        var10001 += (-1334748659 << (-1334748659 & -1334748659) | 1) & 1421756997
      ) {
        char var40 = /* jnt */;
        int var10005 = (var40 & 'ﰀ') >> 10;
        int var41 = ((var40 & 'ﰀ') >> 10 | var40 << 6) - 17 ^ 146;
        int var85 = ((((var40 & 'ﰀ') >> 10 | var40 << 6) - 17 ^ 146) & 65024) >> 9;
        var40 = (char)(((((var10005 | var40 << 6) - 17 ^ 146) & 65024) >> 9 | (((var40 & 'ﰀ') >> 10 | var40 << 6) - 17 ^ 146) << 7) - 152);
        /* jnt */((var85 | var41 << 7) - 152));
      }

      /* jnt */
      );
      String var8 = /* jnt */
          )
        )
      );
      StringBuilder var22 = (StringBuilder)/* jnt */;
      int var31 = (859969362 ^ -172668102 + -172668102 | 0) & 93391369;
      StringBuilder var44 = (StringBuilder)/* jnt */;

      label128:
      while (true) {
        var13 = -1522447883 >>> 851288932 ^ 1533440828;

        while (true) {
          label123: {
            switch (((var13 + 220207068 - 817802350 ^ 1657543096) - 1339594512 ^ 48062301) + 846677075) {
              case -109348303:
                var10002 = var44;
                if (var31 < (1810392412 << 1810392412 ^ -1073741812)) {
                  int var79 = /* jnt */;
                  int var121 = (var79 & 63488) >> 11;
                  int var80 = (var79 & 63488) >> 11 | var79 << 5;
                  int var122 = (((var79 & 63488) >> 11 | var79 << 5) & 32768) >> 15;
                  var79 = (((var121 | var79 << 5) & 32768) >> 15 | ((var79 & 63488) >> 11 | var79 << 5) << 1) - 141;
                  var121 = ((var122 | var80 << 1) - 141 & 65024) >> 9;
                  int var82 = ((var122 | var80 << 1) - 141 & 65024) >> 9 | var79 << 7;
                  int var124 = ((((var122 | var80 << 1) - 141 & 65024) >> 9 | var79 << 7) & 61440) >> 12;
                  char var83 = (char)(((var121 | var79 << 7) & 61440) >> 12 | (((var122 | var80 << 1) - 141 & 65024) >> 9 | var79 << 7) << 4);
                  /* jnt */(var124 | var82 << 4));
                  var31 += (1077363766 | 987431408 | 1) & -2130700287;
                  break label123;
                }

                var13 = 1058856797 + -1097761363 ^ 266534321;
                break;
              case 802271511:
              default:
                var10002 = var44;
                if (var31 < (1069631773 - (1685157582 & -308738901) ^ -609205070)) {
                  int var59 = /* jnt */ - 194;
                  int var10006 = (var59 & 65520) >> 4;
                  int var60 = (var59 & 65520) >> 4 | var59 << 12;
                  int var111 = (((var59 & 65520) >> 4 | var59 << 12) & 64512) >> 10;
                  var59 = ((var10006 | var59 << 12) & 64512) >> 10 | ((var59 & 65520) >> 4 | var59 << 12) << 6;
                  var10006 = ((var111 | var60 << 6) & 65408) >> 7;
                  int var62 = ((var111 | var60 << 6) & 65408) >> 7 | var59 << 9;
                  int var113 = ((((var111 | var60 << 6) & 65408) >> 7 | var59 << 9) & 57344) >> 13;
                  char var63 = (char)(((var10006 | var59 << 9) & 57344) >> 13 | (((var111 | var60 << 6) & 65408) >> 7 | var59 << 9) << 3);
                  /* jnt */(var113 | var62 << 3));
                  var31 += (28764691 | 1360995456 | 1) & 570429765;
                  continue label128;
                }

                var13 = (-1105001021 ^ 1065893952 * 1802047635 | 1376847040) & -618820124;
            }

            switch ((var13 + 2022587536 ^ 962151780) + 1880959364 ^ 272142006 ^ 1051823562 ^ 533301948) {
              case -744277640:
              default:
                var22 = /* jnt */
                  ),
                  var8
                );
                var31 = -794677079 & -2085308491 ^ -2136985439;
                var44 = (StringBuilder)/* jnt */;
                break;
              case -220182413:
                /* jnt */
                    )
                  )
                );
                String var9 = /* jnt */
                  )
                );
                StringBuilder var23 = (StringBuilder)/* jnt */;
                int var33 = (-944488840 - -944488840 | 0) & -1440299722;

                for (var44 = (StringBuilder)/* jnt */;
                  var33 < ((1066783251 - -1407506602 | 18) & 1677722646);
                  var33 += -995687819 ^ 781353599 ^ -365592565
                ) {
                  int var67 = (/* jnt */ ^ '@') + 83 ^ 114 ^ 42;
                  char var68 = (char)((var67 & 57344) >> 13 | var67 << 3);
                  /* jnt */((var67 & 57344) >> 13 | var67 << 3));
                }

                /* jnt */
                      ),
                      var9
                    )
                  )
                );
                /* jnt */);
                LocalTime var24 = /* jnt */;
                int var35 = (1421523572 + 1800746188 | 0) & 985665563;

                for (var44 = (StringBuilder)/* jnt */;
                  var35 < ((1321145928 * (1345165609 >>> 1345165609) | 5) & 142609437);
                  var35 += (-507849399 >> -1360729805 | 0) & 969
                ) {
                  int var71 = /* jnt */ + 21 ^ 136 ^ 152 ^ 91;
                  char var72 = (char)((var71 & 32768) >> 15 | var71 << 1);
                  /* jnt */((var71 & 32768) >> 15 | var71 << 1));
                }

                /* jnt */
                    )
                  ),
                  null
                );
                var10001 = -106950455 - 1327087373 ^ -1434037828;

                for (var10002 = (StringBuilder)/* jnt */;
                  var10001 < ((583178010 | 583178010) ^ 583178002);
                  var10001 += (-718866674 & -49226495 | 1) & 679479391
                ) {
                  int var52 = /* jnt */ + 199;
                  char var53 = (char)(((var52 & 32768) >> 15 | var52 << 1) - 103 ^ 168 ^ 166);
                  /* jnt */(((var52 & 32768) >> 15 | var52 << 1) - 103 ^ 168 ^ 166)
                  );
                }

                String var27 = /* jnt */;
                int var11 = var3;
                int var10 = var2;
                var10002 = (StringBuilder)/* jnt */;
                int var55 = (1637634020 | -1412249836 | 0) & 67174409;
                StringBuilder var75 = (StringBuilder)/* jnt */;

                label92:
                while (true) {
                  var13 = -325033823 + 1739785203 ^ 1951832209;

                  while (true) {
                    label87:
                    while (true) {
                      label85: {
                        switch ((var13 - 671318779 ^ 190343737 ^ 592096733) + 1536960412 + 927315874 + 621470235) {
                          case -2013429689:
                            var44 = var75;
                            if (var55 < (1301206193 * 1919525998 ^ -499529715)) {
                              char var103 = /* jnt */;
                              int var127 = (var103 & '\uffc0') >> 6;
                              int var104 = (var103 & '\uffc0') >> 6 | var103 << '\n';
                              int var128 = (((var103 & '\uffc0') >> 6 | var103 << '\n') & 61440) >> 12;
                              var103 = (char)((((var127 | var103 << '\n') & 61440) >> 12 | ((var103 & '\uffc0') >> 6 | var103 << '\n') << 4) + 130 - 141 - 110);
                              /* jnt */((var128 | var104 << 4) + 130 - 141 - 110)
                              );
                              var55 += -1482350875 - -248070420 ^ -1234280456;
                              continue label92;
                            }

                            var13 = (-1508864214 >>> -1248176072 | -1550792112) & -1415709100;
                            break;
                          case -1308598563:
                          default:
                            var44 = var75;
                            if (var55 < (-432306810 << -432306810 ^ -1897832060)) {
                              char var99 = /* jnt */;
                              char var100 = (char)(((var99 & '￠') >> 5 | var99 << 11) + 48 - 206 + 148 + 139);
                              /* jnt */(((var99 & '￠') >> 5 | var99 << 11) + 48 - 206 + 148 + 139)
                              );
                              var55 += 53899187 + -1508445236 ^ -1454546050;
                              break label87;
                            }

                            var13 = 1665492815 * 540944499 ^ 22673438;
                            break;
                          case 1632779133:
                            var44 = var75;
                            if (var55 < (-595292807 >> -595292807 * -606213722 ^ -138)) {
                              int var94 = /* jnt */ + '@' - 125;
                              int var10007 = (var94 & 49152) >> 14;
                              int var95 = (var94 & 49152) >> 14 | var94 << 2;
                              int var125 = (((var94 & 49152) >> 14 | var94 << 2) & 63488) >> 11;
                              char var96 = (char)((((var10007 | var94 << 2) & 63488) >> 11 | ((var94 & 49152) >> 14 | var94 << 2) << 5) - 31);
                              /* jnt */((var125 | var95 << 5) - 31)
                              );
                              var55 += (117452255 ^ 1164264128 | 1) & -1801940895;
                              break label85;
                            }

                            var13 = (-1546412995 >> -662855708 + -662855708 | -394221334) & -323307030;
                        }

                        switch ((var13 ^ 2047767514) - 1524580329 - 786276784 - 1330129561 - 1620030463 ^ 280220610) {
                          case -1329976673:
                          default:
                            var10002 = /* jnt */
                              ),
                              var10
                            );
                            var55 = 1591916953 >> 150636234 ^ 1554606;
                            var75 = (StringBuilder)/* jnt */;
                            break;
                          case -465807286:
                            /* jnt */
                                  ),
                                  var4
                                )
                              ),
                              true
                            );
                            /* jnt */;

                            Exception var10000;
                            label69: {
                              try {
                                var13 = (1495161558 ^ 414530927 | 677137000) & 1046280953;
                              } catch (Exception var15) {
                                var10000 = var15;
                                boolean var28 = false;
                                break label69;
                              }

                              label66:
                              while (true) {
                                switch (var13 + 2128101177 - 729493103 - 1526114946 - 1611976857 + 1780373388 + 1159884582) {
                                  case -87652713:
                                    break label128;
                                  case 1877919578:
                                  default:
                                    try {
                                      /* jnt */;
                                    } catch (Exception var14) {
                                      var10000 = var14;
                                      boolean var29 = false;
                                      break label66;
                                    }

                                    var13 = (-1719940483 - 1532657757 | -1590418890) & -1283543178;
                                }
                              }
                            }

                            Exception var7 = var10000;
                            /* jnt */;
                            break label128;
                          case 1303108157:
                            var10002 = /* jnt */
                              ),
                              var11
                            );
                            var55 = 1941213687 << -1842751650 ^ -1073741824;
                            var75 = (StringBuilder)/* jnt */;
                            break label87;
                        }
                      }

                      var13 = (165555308 >>> 735511494 | -1453637606) & -1443118853;
                    }

                    var13 = 91199691 + (91199691 >> 91199691) ^ -9135131;
                  }
                }
            }
          }

          var13 = -660519997 >>> 66907115 ^ -1693992811;
        }
      }
    }

    /* jnt */
    );
  }

  // $VF: Handled exception range with multiple entry points by splitting it
  // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
  public void qm(String var1, int var2, int var3, int var4, boolean var5) {
    int var16 = 1255038667;
    int var10000;
    StringBuilder var10001;
    if (var5) {
      var10000 = (-1819215997 >> -717598604 | 0) & 580;
      var10001 = (StringBuilder)/* jnt */;
      var16 = (599523069 - 1007855109 | 2046326387) & 2046654067;
    } else {
      var10000 = -477848341 ^ 1481526167 ^ -1144334468;
      var10001 = (StringBuilder)/* jnt */;
      var16 = (359135991 - 359135991 | -929375082) & -838934634;
    }

    label176:
    while (true) {
      switch (((var16 - 1965359943 ^ 618201381) - 1529797056 ^ 1292508673) + 2113542196 ^ 1531974563) {
        case -1809716356:
        default:
          var28 = var10001;
          if (var10000 >= ((-236610077 | 1458863915) ^ -134873108)) {
            var16 = (-197977182 & 74695448 | -1966818002) & -1359037122;
            break label176;
          }

          int var45 = /* jnt */ + 236 ^ 2;
          char var46 = (char)(((var45 & 65528) >> 3 | var45 << 13) + 43 ^ 13);
          /* jnt */(((var45 & 65528) >> 3 | var45 << 13) + 43 ^ 13)
          );
          var10000 += -2107391698 - -2107391698 ^ 1;
          var16 = (359135991 - 359135991 | -929375082) & -838934634;
          continue;
        case 1553894879:
      }

      var28 = var10001;
      if (var10000 >= ((-1274939960 * 102649389 | 4) & 22021013)) {
        var16 = (-576774462 >>> 737543565 - 1154834542 | 772071174) & 1857028023;
        break;
      }

      int var40 = /* jnt */ ^ 188;
      int var10004 = (var40 & 49152) >> 14;
      int var41 = (var40 & 49152) >> 14 | var40 << 2;
      int var67 = (((var40 & 49152) >> 14 | var40 << 2) & 61440) >> 12;
      char var42 = (char)((((var10004 | var40 << 2) & 61440) >> 12 | ((var40 & 49152) >> 14 | var40 << 2) << 4) + 16 ^ 7);
      /* jnt */((var67 | var41 << 4) + 16 ^ 7));
      var10000 += (-2044863396 + -2044863396 | 1) & -507510527;
      var16 = (599523069 - 1007855109 | 2046326387) & 2046654067;
    }
    String var6 = switch (var16 - 140346680 + 196458742 + 1937929561 - 1529011440 + 1244952232 ^ 1907258727) {
      case -2058581350 -> /* jnt */;
      default -> /* jnt */;
    };
    if (/* jnt */)) {
      te var7 = (te)/* jnt */)
      );
      hn var8 = (hn)/* jnt */;
      /* jnt */;
      String var10 = /* jnt */
          )
        )
      );
      var10001 = (StringBuilder)/* jnt */;
      int var48 = (590493949 | -1653572339) ^ -1083015683;
      StringBuilder var57 = (StringBuilder)/* jnt */;

      label153:
      while (true) {
        var16 = -1442762075 >>> 1487364030 ^ 884360066;

        while (true) {
          label148: {
            StringBuilder var49;
            switch (((var16 ^ 136052932) + 1900131659 ^ 922705392) - 1872080365 - 1310831617 - 2063740485) {
              case -1729942374:
                var49 = var57;
                if (var48 < ((1900269475 | 883920214) ^ 1978650619)) {
                  char var92 = /* jnt */;
                  int var135 = (var92 & '쀀') >> 14;
                  int var93 = (((var92 & '쀀') >> 14 | var92 << 2) ^ 40 ^ 33) + 108;
                  int var136 = ((((var92 & '쀀') >> 14 | var92 << 2) ^ 40 ^ 33) + 108 & 65534) >> 1;
                  var92 = (char)((((var135 | var92 << 2) ^ 40 ^ 33) + 108 & 65534) >> 1 | (((var92 & '쀀') >> 14 | var92 << 2) ^ 40 ^ 33) + 108 << 15);
                  /* jnt */(var136 | var93 << 15));
                  var48 += (498774268 >> -1711435389 | 0) & -1404567551;
                  break label148;
                }

                var16 = -841630871 >>> -38081915 ^ 1443176030;
                break;
              case 1650136396:
              default:
                var49 = var57;
                if (var48 < ((-1617783724 << (218056408 | 1984853751) | 33) & -1240363277)) {
                  int var70 = /* jnt */ - 164 - 37;
                  int var10006 = (var70 & 57344) >> 13;
                  int var71 = (var70 & 57344) >> 13 | var70 << 3;
                  int var121 = (((var70 & 57344) >> 13 | var70 << 3) & 65504) >> 5;
                  char var72 = (char)((((var10006 | var70 << 3) & 65504) >> 5 | ((var70 & 57344) >> 13 | var70 << 3) << 11) - 147);
                  /* jnt */((var121 | var71 << 11) - 147));
                  var48 += (698936211 * 1086518992 | 1) & -2097658875;
                  continue label153;
                }

                var16 = 515085059 & -1323662884 ^ -1487590203;
            }

            switch (((var16 ^ 1896855845) - 199930892 ^ 314523629) + 1474789635 + 1557209669 + 2104575204) {
              case -619952283:
              default:
                var10001 = /* jnt */
                  ),
                  var10
                );
                var48 = -722697505 << -1591161614 ^ 192675840;
                var57 = (StringBuilder)/* jnt */;
                break;
              case 972050853:
                /* jnt */
                    )
                  )
                );
                hn var30 = var8;
                String var12 = /* jnt */
                  )
                );
                var10001 = /* jnt *//* jnt */, var6
                );
                var48 = (-1404754477 + 469625953 | 0) & 61916360;
                var57 = (StringBuilder)/* jnt */;

                label135:
                while (true) {
                  var16 = -292485150 << 1447856433 ^ -1864245618;

                  while (true) {
                    label185: {
                      StringBuilder var51;
                      switch ((var16 + 1428821788 + 968190800 ^ 70670773 ^ 183323199 ^ 1537925662) + 655724353) {
                        case -1568005969:
                          var51 = var57;
                          if (var48 < (-1793298446 >>> 1493591744 ^ -1793298437)) {
                            int var89 = /* jnt */ ^ 195;
                            char var90 = (char)(((var89 & 63488) >> 11 | var89 << 5) + 161 - 228 + 86);
                            /* jnt */(((var89 & 63488) >> 11 | var89 << 5) + 161 - 228 + 86)
                            );
                            var48 += (-537735065 >>> 1902059889 | 1) & -112127995;
                            continue label135;
                          }

                          var16 = -136429056 & 157814201 ^ -820373631;
                          break;
                        case 522766576:
                        default:
                          var51 = var57;
                          if (var48 < (81750889 ^ -1987986801 ^ -1923165714)) {
                            int var76 = (/* jnt */ + '1' ^ 44 ^ 208) + 49;
                            char var77 = (char)((var76 & 63488) >> 11 | var76 << 5);
                            /* jnt */((var76 & 63488) >> 11 | var76 << 5)
                            );
                            var48 += 1520335289 & 1520335289 ^ 1520335288;
                            break label185;
                          }

                          var16 = -1849403083 >>> -421148117 + 1815251133 ^ 2052239466;
                      }

                      LocalTime var36;
                      switch ((var16 + 221953859 ^ 694013198) + 207520934 + 483622436 - 806412113 + 660666151) {
                        case -819586792:
                        default:
                          String var37 = /* jnt */
                            )
                          );
                          int var14 = var3;
                          int var13 = var2;
                          StringBuilder var54 = (StringBuilder)/* jnt */;
                          int var65 = 1394995137 * -1811062575 ^ -592569199;
                          StringBuilder var85 = (StringBuilder)/* jnt */;

                          label111:
                          while (true) {
                            var16 = (-1951966256 >> 1865185643 | 537794594) & -1504798429;

                            while (true) {
                              label106:
                              while (true) {
                                label104: {
                                  switch (((var16 ^ 2037456333) + 787646214 + 316359339 - 838934660 ^ 1914730681) - 1124406783) {
                                    case -557314985:
                                      var57 = var85;
                                      if (var65 < ((-1337432315 | -1337432315 >> 693040363 | 0) & 98436)) {
                                        char var114 = /* jnt */;
                                        int var143 = (var114 & '\ufffe') >> 1;
                                        int var115 = ((var114 & '\ufffe') >> 1 | var114 << 15) - 0 - 28;
                                        int var144 = (((var114 & '\ufffe') >> 1 | var114 << 15) - 0 - 28 & 61440) >> 12;
                                        var114 = (char)(
                                          (((var143 | var114 << 15) - 0 - 28 & 61440) >> 12 | ((var114 & '\ufffe') >> 1 | var114 << 15) - 0 - 28 << 4) - 207
                                        );
                                        /* jnt */((var144 | var115 << 4) - 207)
                                        );
                                        var65 += (-1241082104 << -1555532117 | 1) & 1078440579;
                                        break label104;
                                      }

                                      var16 = (-1127033342 | -1127033342) ^ 1061830625;
                                      break;
                                    case 609213616:
                                      var57 = var85;
                                      if (var65 < ((-1566152683 + -379084655 | 4) & 324055892)) {
                                        int var107 = /* jnt */;
                                        int var139 = (var107 & 65535) >> 0;
                                        int var108 = (var107 & 65535) >> 0 | var107 << 16;
                                        int var140 = (((var107 & 65535) >> 0 | var107 << 16) & 61440) >> 12;
                                        var107 = (((var139 | var107 << 16) & 61440) >> 12 | ((var107 & 65535) >> 0 | var107 << 16) << 4) + 111;
                                        var139 = ((var140 | var108 << 4) + 111 & 49152) >> 14;
                                        int var110 = ((var140 | var108 << 4) + 111 & 49152) >> 14 | var107 << 2;
                                        int var142 = ((((var140 | var108 << 4) + 111 & 49152) >> 14 | var107 << 2) & 65532) >> 2;
                                        char var111 = (char)(
                                          ((var139 | var107 << 2) & 65532) >> 2 | (((var140 | var108 << 4) + 111 & 49152) >> 14 | var107 << 2) << 14
                                        );
                                        /* jnt */(var142 | var110 << 14)
                                        );
                                        var65 += (-1617111941 ^ -285328098 | 0) & -2137714151;
                                        break label106;
                                      }

                                      var16 = (737953907 | -420496060) ^ 1147974989;
                                      break;
                                    case 1512489379:
                                    default:
                                      var57 = var85;
                                      if (var65 < ((-1023240315 | 1259448851 * (-1023240315 << 1259448851)) ^ -939878522)) {
                                        char var101 = /* jnt */;
                                        char var104 = (char)(
                                          (
                                              (
                                                    (
                                                        ((((var101 & '︀') >> 9 | var101 << 7) ^ 163) & 65532) >> 2
                                                          | (((var101 & '︀') >> 9 | var101 << 7) ^ 163) << 14
                                                      )
                                                      & 63488
                                                  )
                                                  >> 11
                                                | (
                                                    ((((var101 & '︀') >> 9 | var101 << 7) ^ 163) & 65532) >> 2
                                                      | (((var101 & '︀') >> 9 | var101 << 7) ^ 163) << 14
                                                  )
                                                  << 5
                                            )
                                            + 194
                                        );
                                        /* jnt */(
                                            (
                                                (
                                                      (
                                                          ((((var101 & '︀') >> 9 | var101 << 7) ^ 163) & 65532) >> 2
                                                            | (((var101 & '︀') >> 9 | var101 << 7) ^ 163) << 14
                                                        )
                                                        & 63488
                                                    )
                                                    >> 11
                                                  | (
                                                      ((((var101 & '︀') >> 9 | var101 << 7) ^ 163) & 65532) >> 2
                                                        | (((var101 & '︀') >> 9 | var101 << 7) ^ 163) << 14
                                                    )
                                                    << 5
                                              )
                                              + 194
                                          )
                                        );
                                        var65 += (1191503952 * 1191503952 | 1) & 143287843;
                                        continue label111;
                                      }

                                      var16 = (-570283692 << -895987786 | -2143018465) & -546968833;
                                  }

                                  switch ((var16 + 823842787 - 1487116759 ^ 1785804041 ^ 2020848557 ^ 42017710) + 89062155) {
                                    case -1713889705:
                                    default:
                                      var54 = /* jnt */
                                        ),
                                        var14
                                      );
                                      var65 = (-2001257552 | 1606736310 | 0) & 537396297;
                                      var85 = (StringBuilder)/* jnt */;
                                      break;
                                    case -1031290836:
                                      var54 = /* jnt */
                                        ),
                                        var13
                                      );
                                      var65 = (355016287 | 435027905 | 0) & -503185376;
                                      var85 = (StringBuilder)/* jnt */;
                                      break label106;
                                    case 1373797872:
                                      /* jnt */
                                            ),
                                            var4
                                          )
                                        ),
                                        true
                                      );
                                      /* jnt */;

                                      label88: {
                                        try {
                                          var16 = -576398011 << 1023461386 ^ 1329330111;
                                        } catch (Exception var18) {
                                          var31 = var18;
                                          boolean var38 = false;
                                          break label88;
                                        }

                                        label85:
                                        while (true) {
                                          switch (((var16 ^ 1979515693 ^ 1426581496) - 1392699605 ^ 130752114 ^ 1739310444) - 2114909172) {
                                            case -524693069:
                                              break label153;
                                            case 1271058839:
                                            default:
                                              try {
                                                /* jnt */;
                                              } catch (Exception var17) {
                                                var31 = var17;
                                                boolean var39 = false;
                                                break label85;
                                              }

                                              var16 = (936791454 << 620050889 * (936791454 + 620050889) | -1320033445) & -176166049;
                                          }
                                        }
                                      }

                                      Exception var9 = var31;
                                      /* jnt */;
                                      break label153;
                                  }
                                }

                                var16 = (58598441 << 433503203 | 1028697103) & -1117782897;
                              }

                              var16 = -339465289 ^ 718020926 ^ -1109461075;
                            }
                          }
                        case 324220522:
                          /* jnt */
                                ),
                                var12
                              )
                            )
                          );
                          /* jnt */);
                          var36 = /* jnt */;
                          var48 = (-297882255 - 267206590 | 0) & 564527112;
                          var57 = (StringBuilder)/* jnt */;
                      }

                      while (var48 < ((-411904398 - 1988911887 | 4) & 1150109)) {
                        char var81 = /* jnt */;
                        int var123 = (var81 & '쀀') >> 14;
                        int var82 = ((var81 & '쀀') >> 14 | var81 << 2) ^ 109 ^ 150;
                        int var124 = ((((var81 & '쀀') >> 14 | var81 << 2) ^ 109 ^ 150) & 61440) >> 12;
                        var81 = (char)(((((var123 | var81 << 2) ^ 109 ^ 150) & 61440) >> 12 | (((var81 & '쀀') >> 14 | var81 << 2) ^ 109 ^ 150) << 4) ^ 169);
                        /* jnt */((var124 | var82 << 4) ^ 169));
                        var48 += (-1945430653 | -1629670093) ^ -1629538894;
                      }

                      /* jnt */
                          )
                        ),
                        null
                      );
                      var30 = var8;
                      var12 = var6;
                      var10001 = /* jnt *//* jnt */, var6
                      );
                      var48 = 1677720147 + (-1248187782 >> 1677720147) ^ 1677717766;
                      var57 = (StringBuilder)/* jnt */;
                    }

                    var16 = (-370864458 << -370864458 | 503530959) & 1592743391;
                  }
                }
            }
          }

          var16 = -733994375 & (-1965043568 | -733994375) ^ -1434580657;
        }
      }
    }

    /* jnt */
    );
  }

  public void tx(class_2561 var1) {
    int var10000 = (403365154 << -864620004 + -99943088 | 0) & 36265918;

    StringBuilder var10001;
    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < ((-573513335 << (-1014627972 | 1525123359) | 19) & 1037054011);
      var10000 += (1835014848 >> -824586260 | 0) & 1365319723
    ) {
      int var5 = (/* jnt */ ^ 'J') - 230;
      int var10004 = (var5 & 32768) >> 15;
      int var6 = ((var5 & 32768) >> 15 | var5 << 1) - 164;
      int var10 = (((var5 & 32768) >> 15 | var5 << 1) - 164 & 32768) >> 15;
      char var7 = (char)(((var10004 | var5 << 1) - 164 & 32768) >> 15 | ((var5 & 32768) >> 15 | var5 << 1) - 164 << 1);
      /* jnt */(var10 | var6 << 1));
    }

    class_5250 var2 = /* jnt */
    );
    /* jnt */;
    /* jnt */;
    /* jnt */
        )
      ),
      (class_2661)/* jnt */
    );
  }

  public void la() {
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted *//* jnt */
    );
  }

  public boolean ke() {
    return null /* jnt:encrypted */;
  }

  static {
    Loader.init(es.class);
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (var10 ^ 2005161633) + 1013321659 - 2022781469 + 274988035 + 1622805024 + 621265042 - 1188864390 - 1991495323 ^ 1022936810;
    MethodHandle var10000 = lxh[(var10 ^ 2005161633) + 1013321659 - 2022781469 + 274988035 + 1622805024 + 621265042 - 1188864390 - 1991495323
      ^ 1022936810
      ^ 407796735];
    if (lxh[var10001 ^ 407796735] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = 988098208 ^ 988098208 ^ 0; var23 < var13.length(); var23 += (1127645017 & 210121666 | 1) & -682013641) {
        int var42 = var13.charAt(var23) ^ 170;
        int var10004 = (var42 & 65535) >> 0;
        int var43 = ((var42 & 65535) >> 0 | var42 << 16) - 189 + 45;
        int var85 = (((var42 & 65535) >> 0 | var42 << 16) - 189 + 45 & 0) >> 16;
        var42 = (((var10004 | var42 << 16) - 189 + 45 & 0) >> 16 | ((var42 & 65535) >> 0 | var42 << 16) - 189 + 45 << 0) ^ 5;
        var10004 = (((var85 | var43 << 0) ^ 5) & 65534) >> 1;
        int var45 = (((var85 | var43 << 0) ^ 5) & 65534) >> 1 | var42 << 15;
        int var87 = (((((var85 | var43 << 0) ^ 5) & 65534) >> 1 | var42 << 15) & 65534) >> 1;
        var42 = ((var10004 | var42 << 15) & 65534) >> 1 | ((((var85 | var43 << 0) ^ 5) & 65534) >> 1 | var42 << 15) << 15;
        var10004 = ((var87 | var45 << 15) & 57344) >> 13;
        int var47 = ((var87 | var45 << 15) & 57344) >> 13 | var42 << 3;
        int var89 = ((((var87 | var45 << 15) & 57344) >> 13 | var42 << 3) & 57344) >> 13;
        char var48 = (char)(((var10004 | var42 << 3) & 57344) >> 13 | (((var87 | var45 << 15) & 57344) >> 13 | var42 << 3) << 3);
        var13.setCharAt(var23, (char)(var89 | var47 << 3));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = 1845885520 ^ 573766807 ^ 1278674631; var29 < var16.length(); var29 += -1823957232 >>> 293367621 ^ 77219065) {
        int var53 = ((var16.charAt(var29) - 159 ^ 112) + 243 ^ 19) + 68 ^ 128;
        char var56 = (char)(
          (((((var53 & 65528) >> 3 | var53 << 13) + 46 & 65408) >> 7 | ((var53 & 65528) >> 3 | var53 << 13) + 46 << 9) & 65024) >> 9
            | ((((var53 & 65528) >> 3 | var53 << 13) + 46 & 65408) >> 7 | ((var53 & 65528) >> 3 | var53 << 13) + 46 << 9) << 7
        );
        var16.setCharAt(
          var29,
          (char)(
            (((((var53 & 65528) >> 3 | var53 << 13) + 46 & 65408) >> 7 | ((var53 & 65528) >> 3 | var53 << 13) + 46 << 9) & 65024) >> 9
              | ((((var53 & 65528) >> 3 | var53 << 13) + 46 & 65408) >> 7 | ((var53 & 65528) >> 3 | var53 << 13) + 46 << 9) << 7
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), es.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = -1754860302 ^ 1010722305 ^ 1010722305 ^ -1754860302; var35 < var19.length(); var35 += (-883041686 | -2065103611) ^ -805445778) {
        char var61 = var19.charAt(var35);
        char var64 = (char)(
          (
              (
                    (
                          ((((var61 & '쀀') >> 14 | var61 << 2) + 246 - 234 + 68 & 65520) >> 4 | ((var61 & '쀀') >> 14 | var61 << 2) + 246 - 234 + 68 << 12)
                              - 175
                            ^ 223
                        )
                        + 110
                      & 65528
                  )
                  >> 3
                | (((((var61 & '쀀') >> 14 | var61 << 2) + 246 - 234 + 68 & 65520) >> 4 | ((var61 & '쀀') >> 14 | var61 << 2) + 246 - 234 + 68 << 12) - 175 ^ 223)
                    + 110
                  << 13
            )
            - 253
        );
        var19.setCharAt(
          var35,
          (char)(
            (
                (
                      (
                            ((((var61 & '쀀') >> 14 | var61 << 2) + 246 - 234 + 68 & 65520) >> 4 | ((var61 & '쀀') >> 14 | var61 << 2) + 246 - 234 + 68 << 12)
                                - 175
                              ^ 223
                          )
                          + 110
                        & 65528
                    )
                    >> 3
                  | (
                        ((((var61 & '쀀') >> 14 | var61 << 2) + 246 - 234 + 68 & 65520) >> 4 | ((var61 & '쀀') >> 14 | var61 << 2) + 246 - 234 + 68 << 12) - 175
                          ^ 223
                      )
                      + 110
                    << 13
              )
              - 253
          )
        );
      }

      Class var7 = Class.forName(var19.toString(), false, es.class.getClassLoader());
      switch (((var4 ^ 1385483555) + 2129947281 ^ 178403055 ^ 1993990777) - 1010379927 - 1811443992 + 470053096 + 101621480 + 1275006035 - 42421868) {
        case 213753718:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 995290771:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 1086245768:
        case 1365973237:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1312090480:
          var10000 = var0.findSpecial(var7, var5, var6, es.class);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    lxh[(var10 ^ 2005161633) + 1013321659 - 2022781469 + 274988035 + 1622805024 + 621265042 - 1188864390 - 1991495323 ^ 1022936810 ^ 407796735] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 - 158138946 ^ 767108533 ^ 1414803850) + 2040901420 + 1164704232 - 1207049737 ^ 876489547) - 2054127005 ^ 624031162;
    MethodHandle var10000 = lxh[(((var10 - 158138946 ^ 767108533 ^ 1414803850) + 2040901420 + 1164704232 - 1207049737 ^ 876489547) - 2054127005 ^ 624031162)
      + 2075153251];
    if (lxh[var10001 + 2075153251] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (305964572 * (1154858208 << 305964572) | 0) & 1253745281; var24 < var14.length(); var24 += (882796431 * 174156883 | 0) & 146870307) {
        int var43 = var14.charAt(var24) + 168 - 233;
        int var10004 = (var43 & 65528) >> 3;
        int var44 = (var43 & 65528) >> 3 | var43 << 13;
        int var94 = (((var43 & 65528) >> 3 | var43 << 13) & 65534) >> 1;
        var43 = (((var10004 | var43 << 13) & 65534) >> 1 | ((var43 & 65528) >> 3 | var43 << 13) << 15) - 44 + 60 + 167;
        var10004 = ((var94 | var44 << 15) - 44 + 60 + 167 & 32768) >> 15;
        int var46 = (((var94 | var44 << 15) - 44 + 60 + 167 & 32768) >> 15 | var43 << 1) ^ 171;
        int var96 = (((((var94 | var44 << 15) - 44 + 60 + 167 & 32768) >> 15 | var43 << 1) ^ 171) & 61440) >> 12;
        char var47 = (char)((((var10004 | var43 << 1) ^ 171) & 61440) >> 12 | ((((var94 | var44 << 15) - 44 + 60 + 167 & 32768) >> 15 | var43 << 1) ^ 171) << 4);
        var14.setCharAt(var24, (char)(var96 | var46 << 4));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (817948526 >>> 817948526 | 0) & -1776739128; var30 < var17.length(); var30 += (-1120860411 & 90091056 & 90091056 | 1) & -1198978705) {
        int var52 = (var17.charAt(var30) ^ 'Q') - 60 + 42;
        int var97 = (var52 & 65408) >> 7;
        int var53 = (var52 & 65408) >> 7 | var52 << 9;
        int var98 = (((var52 & 65408) >> 7 | var52 << 9) & 65520) >> 4;
        var52 = ((var97 | var52 << 9) & 65520) >> 4 | ((var52 & 65408) >> 7 | var52 << 9) << 12;
        var97 = ((var98 | var53 << 12) & 65408) >> 7;
        int var55 = ((var98 | var53 << 12) & 65408) >> 7 | var52 << 9;
        int var100 = ((((var98 | var53 << 12) & 65408) >> 7 | var52 << 9) & 65504) >> 5;
        var52 = ((var97 | var52 << 9) & 65504) >> 5 | (((var98 | var53 << 12) & 65408) >> 7 | var52 << 9) << 11;
        var97 = ((var100 | var55 << 11) & 64512) >> 10;
        int var57 = (((var100 | var55 << 11) & 64512) >> 10 | var52 << 6) + 180;
        int var102 = ((((var100 | var55 << 11) & 64512) >> 10 | var52 << 6) + 180 & 65535) >> 0;
        char var58 = (char)(((var97 | var52 << 6) + 180 & 65535) >> 0 | (((var100 | var55 << 11) & 64512) >> 10 | var52 << 6) + 180 << 16);
        var17.setCharAt(var30, (char)(var102 | var57 << 16));
      }

      Class var6 = Class.forName(var17.toString(), false, es.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (1918219487 * -900851891 * 1959686785 | 0) & 151519300; var36 < var20.length(); var36 += (-1025320516 ^ 1153060416 | 1) & 967049217) {
        int var63 = var20.charAt(var36);
        int var103 = (var63 & 65528) >> 3;
        int var64 = (var63 & 65528) >> 3 | var63 << 13;
        int var104 = (((var63 & 65528) >> 3 | var63 << 13) & 65504) >> 5;
        var63 = (((var103 | var63 << 13) & 65504) >> 5 | ((var63 & 65528) >> 3 | var63 << 13) << 11) + 191;
        var103 = ((var104 | var64 << 11) + 191 & 65408) >> 7;
        int var66 = ((var104 | var64 << 11) + 191 & 65408) >> 7 | var63 << 9;
        int var106 = ((((var104 | var64 << 11) + 191 & 65408) >> 7 | var63 << 9) & 61440) >> 12;
        var63 = ((var103 | var63 << 9) & 61440) >> 12 | (((var104 | var64 << 11) + 191 & 65408) >> 7 | var63 << 9) << 4;
        var103 = ((var106 | var66 << 4) & 63488) >> 11;
        int var68 = (((var106 | var66 << 4) & 63488) >> 11 | var63 << 5) - 243 - 175;
        int var108 = ((((var106 | var66 << 4) & 63488) >> 11 | var63 << 5) - 243 - 175 & 63488) >> 11;
        char var69 = (char)((((var103 | var63 << 5) - 243 - 175 & 63488) >> 11 | (((var106 | var66 << 4) & 63488) >> 11 | var63 << 5) - 243 - 175 << 5) - 212);
        var20.setCharAt(var36, (char)((var108 | var68 << 5) - 212));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), es.class.getClassLoader()).returnType();
      switch ((((var4 - 1493015961 ^ 1862603534) - 1050134182 + 1472179562 + 238324447 ^ 183841497) - 1348506128 ^ 420867456) - 668276489 ^ 330961809) {
        case 50676927:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 239241872:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 696350131:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 720036433:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      lxh[(((var10 - 158138946 ^ 767108533 ^ 1414803850) + 2040901420 + 1164704232 - 1207049737 ^ 876489547) - 2054127005 ^ 624031162) + 2075153251] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }

  public static native void guard();
}
