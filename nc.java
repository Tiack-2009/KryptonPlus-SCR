// KryptonPlus Module: AutoArmor
// Original class: nc
// Status: PARTIAL - JNT native encryption (strings in jnt.so)


import dev.krypton.jnt3.Loader;
import dev.krypton.mixin.MobSpawnerLogicAccessor;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.time.LocalTime;
import java.util.Iterator;
import java.util.Optional;
import java.util.Random;
import net.minecraft.class_1269;
import net.minecraft.class_1707;
import net.minecraft.ItemStack;
import net.minecraft.class_1917;
import net.minecraft.class_1952;
import net.minecraft.BlockPos;
import net.minecraft.Vec3d;
import net.minecraft.NbtElement;
import net.minecraft.Text;
import net.minecraft.class_2586;
import net.minecraft.class_2595;
import net.minecraft.class_2605;
import net.minecraft.class_2611;
import net.minecraft.class_2627;
import net.minecraft.ClientLoginNetworkHandler;
import net.minecraft.class_2661;
import net.minecraft.ClientWorld;
import net.minecraft.class_2846;
import net.minecraft.class_3719;
import net.minecraft.class_3866;
import net.minecraft.class_5250;
import net.minecraft.class_634;

public class AutoArmor extends np {
  public o lu;
  public kc vxj;
  public rt pf;
  public kc ny;
  public kc uko;
  public rt fr;
  public kc tym;
  public rt vl;
  public kc xr;
  public e vca;
  public kc qtu;
  public rt lwa;
  public rt kj;
  public class_243 ir;
  public class_243 kja;
  public double ug;
  public double dhh;
  public boolean elb;
  public boolean ijj;
  public boolean rp;
  public boolean pz;
  public int nv;
  public int qtp;
  public int fy;
  public int xh;
  public int qn;
  // [JNT] MethodHandle dispatch table (removed)
  public nc() {
    int var10001 = (-1437608958 | 743427721 | 0) & 1057136;

    StringBuilder var10002;
    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((1912492033 << 225450413 | 15) & 338559775);
      var10001 += (-768835072 << -768835072 | 1) & 676535595
    ) {
      char var61 = /* jnt */;
      char var64 = (char)(
        (
            (((((var61 & '\ue000') >> 13 | var61 << 3) & 64512) >> 10 | ((var61 & '\ue000') >> 13 | var61 << 3) << 6) + 219 & 0) >> 16
              | ((((var61 & '\ue000') >> 13 | var61 << 3) & 64512) >> 10 | ((var61 & '\ue000') >> 13 | var61 << 3) << 6) + 219 << 0
          )
          ^ 221
      );
      /* jnt */(
          (
              (((((var61 & '\ue000') >> 13 | var61 << 3) & 64512) >> 10 | ((var61 & '\ue000') >> 13 | var61 << 3) << 6) + 219 & 0) >> 16
                | ((((var61 & '\ue000') >> 13 | var61 << 3) & 64512) >> 10 | ((var61 & '\ue000') >> 13 | var61 << 3) << 6) + 219 << 0
            )
            ^ 221
        )
      );
    }

    String var2 = /* jnt */;
    int var31 = -1475481562 * -1876277456 ^ 645108000;

    StringBuilder var66;
    for (var66 = (StringBuilder)/* jnt */;
      var31 < ((473899828 << 431799620 | 44) & 470059071);
      var31 += -2101881707 ^ -643884058 ^ 1529401202
    ) {
      char var140 = /* jnt */;
      int var10006 = (var140 & 0) >> 16;
      int var141 = ((var140 & 0) >> 16 | var140 << 0) + 54;
      int var213 = (((var140 & 0) >> 16 | var140 << 0) + 54 & 65532) >> 2;
      var140 = (char)(((((var10006 | var140 << 0) + 54 & 65532) >> 2 | ((var140 & 0) >> 16 | var140 << 0) + 54 << 14) ^ 189) + 220);
      /* jnt */(((var213 | var141 << 14) ^ 189) + 220));
    }

    super(
      var2,
      /* jnt */,
      -1,
      null /* jnt:encrypted */
    );
    var10001 = -1127529150 & -363257065 ^ -1471610622;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((271236152 >> (-1044996310 & 1298082245) | 4) & -397327483);
      var10001 += 1740132152 & -2099053779 ^ 44059433
    ) {
      int var69 = /* jnt */ ^ 216 ^ 32 ^ 166;
      char var70 = (char)(((var69 & 0) >> 16 | var69 << 0) ^ 221);
      /* jnt */(((var69 & 0) >> 16 | var69 << 0) ^ 221)
      );
    }

    this.lu = (o)/* jnt */,
      null /* jnt:encrypted */,
      bv.class
    );
    var10001 = (-1113052470 - -1849522654 | 0) & 1202434;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((140576358 << 24778393 | 8) & 822234924);
      var10001 += -901380654 - (-316787978 | -316787978) ^ -584592675
    ) {
      char var73 = /* jnt */;
      int var183 = (var73 & '耀') >> 15;
      int var74 = ((var73 & '耀') >> 15 | var73 << 1) + 90 - 179;
      int var184 = (((var73 & '耀') >> 15 | var73 << 1) + 90 - 179 & 64512) >> 10;
      char var75 = (char)((((var183 | var73 << 1) + 90 - 179 & 64512) >> 10 | ((var73 & '耀') >> 15 | var73 << 1) + 90 - 179 << 6) + 199);
      /* jnt */((var184 | var74 << 6) + 199));
    }

    this.vxj = (kc)/* jnt */, true
    );
    var10001 = (-1603607202 >> 1130999777 | 0) & 260734992;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((-1830944432 >> (1383575170 | 1342003468) | 7) & 73871);
      var10001 += (-328842938 + -328842938 | 1) & 554834947
    ) {
      int var78 = /* jnt */ ^ 164 ^ 150;
      int var185 = (var78 & 65532) >> 2;
      int var79 = ((var78 & 65532) >> 2 | var78 << 14) + 163;
      int var186 = (((var78 & 65532) >> 2 | var78 << 14) + 163 & 65472) >> 6;
      char var80 = (char)(((var185 | var78 << 14) + 163 & 65472) >> 6 | ((var78 & 65532) >> 2 | var78 << 14) + 163 << 10);
      /* jnt */(var186 | var79 << 10));
    }

    this.pf = (rt)/* jnt */,
      1.0,
      500.0,
      100.0,
      1.0
    );
    var10001 = (-315071983 + -267206554 | 0) & 578833672;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((1292765547 * -406424733 | 14) & 244646030);
      var10001 += -1298713482 >>> -1372702658 ^ 3
    ) {
      int var83 = /* jnt */ + 187;
      int var187 = (var83 & 65504) >> 5;
      int var84 = (var83 & 65504) >> 5 | var83 << 11;
      int var188 = (((var83 & 65504) >> 5 | var83 << 11) & 49152) >> 14;
      char var85 = (char)((((var187 | var83 << 11) & 49152) >> 14 | ((var83 & 65504) >> 5 | var83 << 11) << 2) + 124 + 89);
      /* jnt */((var188 | var84 << 2) + 124 + 89));
    }

    this.ny = (kc)/* jnt */, true
    );
    var10001 = (62069270 >>> -1392873048 | 0) & -1840774140;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < (-1485618451 & 1460838306 ^ 118620851);
      var10001 += -985750573 >> 153373349 ^ -30804705
    ) {
      char var88 = /* jnt */;
      char var93 = (char)(
        (
              (
                  (
                        (
                            (((((var88 & '︀') >> 9 | var88 << 7) & 65472) >> 6 | ((var88 & '︀') >> 9 | var88 << 7) << 10) & 65520) >> 4
                              | ((((var88 & '︀') >> 9 | var88 << 7) & 65472) >> 6 | ((var88 & '︀') >> 9 | var88 << 7) << 10) << 12
                          )
                          & 49152
                      )
                      >> 14
                    | (
                        (((((var88 & '︀') >> 9 | var88 << 7) & 65472) >> 6 | ((var88 & '︀') >> 9 | var88 << 7) << 10) & 65520) >> 4
                          | ((((var88 & '︀') >> 9 | var88 << 7) & 65472) >> 6 | ((var88 & '︀') >> 9 | var88 << 7) << 10) << 12
                      )
                      << 2
                )
                & 65532
            )
            >> 2
          | (
              (
                    (
                        (((((var88 & '︀') >> 9 | var88 << 7) & 65472) >> 6 | ((var88 & '︀') >> 9 | var88 << 7) << 10) & 65520) >> 4
                          | ((((var88 & '︀') >> 9 | var88 << 7) & 65472) >> 6 | ((var88 & '︀') >> 9 | var88 << 7) << 10) << 12
                      )
                      & 49152
                  )
                  >> 14
                | (
                    (((((var88 & '︀') >> 9 | var88 << 7) & 65472) >> 6 | ((var88 & '︀') >> 9 | var88 << 7) << 10) & 65520) >> 4
                      | ((((var88 & '︀') >> 9 | var88 << 7) & 65472) >> 6 | ((var88 & '︀') >> 9 | var88 << 7) << 10) << 12
                  )
                  << 2
            )
            << 14
      );
      /* jnt */(
          (
                (
                    (
                          (
                              (((((var88 & '︀') >> 9 | var88 << 7) & 65472) >> 6 | ((var88 & '︀') >> 9 | var88 << 7) << 10) & 65520) >> 4
                                | ((((var88 & '︀') >> 9 | var88 << 7) & 65472) >> 6 | ((var88 & '︀') >> 9 | var88 << 7) << 10) << 12
                            )
                            & 49152
                        )
                        >> 14
                      | (
                          (((((var88 & '︀') >> 9 | var88 << 7) & 65472) >> 6 | ((var88 & '︀') >> 9 | var88 << 7) << 10) & 65520) >> 4
                            | ((((var88 & '︀') >> 9 | var88 << 7) & 65472) >> 6 | ((var88 & '︀') >> 9 | var88 << 7) << 10) << 12
                        )
                        << 2
                  )
                  & 65532
              )
              >> 2
            | (
                (
                      (
                          (((((var88 & '︀') >> 9 | var88 << 7) & 65472) >> 6 | ((var88 & '︀') >> 9 | var88 << 7) << 10) & 65520) >> 4
                            | ((((var88 & '︀') >> 9 | var88 << 7) & 65472) >> 6 | ((var88 & '︀') >> 9 | var88 << 7) << 10) << 12
                        )
                        & 49152
                    )
                    >> 14
                  | (
                      (((((var88 & '︀') >> 9 | var88 << 7) & 65472) >> 6 | ((var88 & '︀') >> 9 | var88 << 7) << 10) & 65520) >> 4
                        | ((((var88 & '︀') >> 9 | var88 << 7) & 65472) >> 6 | ((var88 & '︀') >> 9 | var88 << 7) << 10) << 12
                    )
                    << 2
              )
              << 14
        )
      );
    }

    this.uko = (kc)/* jnt */, true
    );
    var10001 = 1980278031 ^ 1980278031 ^ 0;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < (1915005768 >> 1915005768 ^ 7480481);
      var10001 += (-1083256723 & 207352135 | 1) & 1091576721
    ) {
      int var96 = (/* jnt */ ^ 'I') + 189 + 15;
      char var97 = (char)(((var96 & 57344) >> 13 | var96 << 3) ^ 215);
      /* jnt */(((var96 & 57344) >> 13 | var96 << 3) ^ 215)
      );
    }

    this.fr = (rt)/* jnt */,
      1.0,
      9.0,
      8.0,
      1.0
    );
    var10001 = -111911473 - 884988361 ^ -996899834;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < (-1371713595 >> -1371713595 ^ -42866057);
      var10001 += (816651091 >>> -521499500 | 1) & 1879711985
    ) {
      int var100 = /* jnt */ + 219 + 86 - 164 ^ 116;
      char var101 = (char)((var100 & 65520) >> 4 | var100 << 12);
      /* jnt */((var100 & 65520) >> 4 | var100 << 12)
      );
    }

    kc var17 = (kc)/* jnt */, true
    );
    int var47 = 1366470137 + -1118007408 ^ 248462729;

    for (var66 = (StringBuilder)/* jnt */;
      var47 < ((-1119052566 * 642083509 | 14) & 675938335);
      var47 += (-670794227 | -1919384728) ^ -576913556
    ) {
      int var159 = /* jnt */ ^ 211;
      char var162 = (char)(
        (
            (((((var159 & 65532) >> 2 | var159 << 14) & 57344) >> 13 | ((var159 & 65532) >> 2 | var159 << 14) << 3) & 65532) >> 2
              | ((((var159 & 65532) >> 2 | var159 << 14) & 57344) >> 13 | ((var159 & 65532) >> 2 | var159 << 14) << 3) << 14
          )
          + 61
      );
      /* jnt */(
          (
              (((((var159 & 65532) >> 2 | var159 << 14) & 57344) >> 13 | ((var159 & 65532) >> 2 | var159 << 14) << 3) & 65532) >> 2
                | ((((var159 & 65532) >> 2 | var159 << 14) & 57344) >> 13 | ((var159 & 65532) >> 2 | var159 << 14) << 3) << 14
            )
            + 61
        )
      );
    }

    this.tym = /* jnt */
    );
    var10001 = (-1828995844 >>> -1828995844 | 0) & 436943936;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((-1214244581 * 692385309 | 0) & 1276121102);
      var10001 += (-1884560203 ^ -639557855 | 1) & -1599798269
    ) {
      char var106 = /* jnt */;
      char var109 = (char)(
        (
            ((((((var106 & '\uf000') >> 12 | var106 << 4) & 63488) >> 11 | ((var106 & '\uf000') >> 12 | var106 << 4) << 5) ^ 59) & 65472) >> 6
              | (((((var106 & '\uf000') >> 12 | var106 << 4) & 63488) >> 11 | ((var106 & '\uf000') >> 12 | var106 << 4) << 5) ^ 59) << 10
          )
          ^ 171
      );
      /* jnt */(
          (
              ((((((var106 & '\uf000') >> 12 | var106 << 4) & 63488) >> 11 | ((var106 & '\uf000') >> 12 | var106 << 4) << 5) ^ 59) & 65472) >> 6
                | (((((var106 & '\uf000') >> 12 | var106 << 4) & 63488) >> 11 | ((var106 & '\uf000') >> 12 | var106 << 4) << 5) ^ 59) << 10
            )
            ^ 171
        )
      );
    }

    this.vl = (rt)/* jnt */,
      1.0,
      9.0,
      9.0,
      1.0
    );
    var10001 = (457579184 >>> -167791306 | 0) & -1563407598;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((-1899209275 | -1899209275 | 20) & 1253908);
      var10001 += -1300390950 ^ -1097953497 ^ 217257212
    ) {
      int var112 = /* jnt */ - '8' - 136;
      char var113 = (char)(((var112 & 63488) >> 11 | var112 << 5) + 169 - 55);
      /* jnt */(((var112 & 63488) >> 11 | var112 << 5) + 169 - 55)
      );
    }

    this.xr = (kc)/* jnt */, false
    );
    var10001 = (-120638484 >>> (-1316680716 ^ 1623654315) | 0) & 255785094;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < (1803687212 - -61991493 ^ 1865678710);
      var10001 += 289041079 & 827872905 ^ 286802560
    ) {
      char var116 = /* jnt */;
      char var117 = (char)(((var116 & '\ufff8') >> 3 | var116 << '\r') + 131 + 63 - 82 - 224);
      /* jnt */(((var116 & '\ufff8') >> 3 | var116 << '\r') + 131 + 63 - 82 - 224)
      );
    }

    this.vca = (e)/* jnt */, ""
    );
    var10001 = (-1857483755 >> -1576562478 | 0) & 2444;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((-1691153177 << 1833225781 | 11) & 52366491);
      var10001 += (-997979053 ^ 1679522518 | 0) & 522190953
    ) {
      char var120 = /* jnt */;
      int var204 = (var120 & '\ufff0') >> 4;
      int var121 = ((var120 & '\ufff0') >> 4 | var120 << '\f') - 228 + 98 + 218;
      int var205 = (((var120 & '\ufff0') >> 4 | var120 << '\f') - 228 + 98 + 218 & 61440) >> 12;
      char var122 = (char)(((var204 | var120 << '\f') - 228 + 98 + 218 & 61440) >> 12 | ((var120 & '\ufff0') >> 4 | var120 << '\f') - 228 + 98 + 218 << 4);
      /* jnt */(var205 | var121 << 4));
    }

    this.qtu = (kc)/* jnt */, true
    );
    var10001 = (657477891 | -150420116) ^ -147270289;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < (1491218371 >>> -916992237 ^ 2828);
      var10001 += (2139337688 + 2080061833 | 1) & 75502089
    ) {
      char var125 = /* jnt */;
      char var128 = (char)(
        (
            (((((var125 & '\ufff0') >> 4 | var125 << '\f') & 65408) >> 7 | ((var125 & '\ufff0') >> 4 | var125 << '\f') << 9) & 61440) >> 12
              | ((((var125 & '\ufff0') >> 4 | var125 << '\f') & 65408) >> 7 | ((var125 & '\ufff0') >> 4 | var125 << '\f') << 9) << 4
          )
          ^ 249
          ^ 113
      );
      /* jnt */(
          (
              (((((var125 & '\ufff0') >> 4 | var125 << '\f') & 65408) >> 7 | ((var125 & '\ufff0') >> 4 | var125 << '\f') << 9) & 61440) >> 12
                | ((((var125 & '\ufff0') >> 4 | var125 << '\f') & 65408) >> 7 | ((var125 & '\ufff0') >> 4 | var125 << '\f') << 9) << 4
            )
            ^ 249
            ^ 113
        )
      );
    }

    this.lwa = (rt)/* jnt */,
      1.0,
      120.0,
      20.0,
      1.0
    );
    var10001 = -1208807818 ^ -1207823705 ^ 267459793;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < (70871949 >> 569798910 ^ 8);
      var10001 += (108444116 * -2077891408 | 1) & 69799445
    ) {
      char var131 = /* jnt */;
      int var209 = (var131 & '\uffc0') >> 6;
      int var132 = ((var131 & '\uffc0') >> 6 | var131 << '\n') ^ 23;
      int var210 = ((((var131 & '\uffc0') >> 6 | var131 << '\n') ^ 23) & 61440) >> 12;
      int var133 = (((var209 | var131 << '\n') ^ 23) & 61440) >> 12 | (((var131 & '\uffc0') >> 6 | var131 << '\n') ^ 23) << 4;
      var209 = ((var210 | var132 << 4) & 65528) >> 3;
      int var134 = ((var210 | var132 << 4) & 65528) >> 3 | var133 << 13;
      int var212 = ((((var210 | var132 << 4) & 65528) >> 3 | var133 << 13) & 65532) >> 2;
      char var135 = (char)(((var209 | var133 << 13) & 65532) >> 2 | (((var210 | var132 << 4) & 65528) >> 3 | var133 << 13) << 14);
      /* jnt */(var212 | var134 << 14));
    }

    this.kj = (rt)/* jnt */,
      -59.0,
      30.0,
      -20.0,
      1.0
    );
    this.dhh = 0.0;
    this.elb = false;
    this.ijj = false;
    this.rp = false;
    this.pz = false;
    this.nv = 0;
    this.qtp = 0;
    this.fy = 0;
    this.xh = 0;
    this.qn = 0;
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
    int var6 = 824855382;
    if (null /* jnt:encrypted */
      )
      != null) {
      var6 = (-88904557 * (-2091808493 >>> -854508557) | -1178136531) & -68685139;

      while (true) {
        label331:
        while (true) {
          label329:
          while (true) {
            switch ((var6 ^ 160413870) + 1054897773 ^ 1663004252 ^ 1806920829 ^ 1091301181 ^ 1928680572) {
              case -1818867404:
                /* jnt */
                  ),
                  89.9F
                );
                if (/* jnt */)) {
                  class_1799 var9 = /* jnt */
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

                var6 = (2129095324 >> 509418955 | -1424293296) & -335825285;
                continue;
              case -1467783723:
                return;
              case -1106949148:
                if (!/* jnt */)
                  || !/* jnt */
                    )
                  )
                  || /* jnt */
                    )
                  )) {
                  var6 = (1240899301 & -585843746 | -1292810701) & -151697605;
                  continue;
                }

                /* jnt */;
                break label329;
              case -1013652774:
                if (/* jnt */
                      )
                    )
                    < (double)/* jnt */)
                  && !null /* jnt:encrypted */) {
                  null /* jnt:encrypted */;
                  null /* jnt:encrypted */;
                }

                var6 = (-521572396 * (1896544655 - 1896544655) | 1568595686) & 1568661230;
                continue;
              case -730183920:
                if (null /* jnt:encrypted */ > 0) {
                  null /* jnt:encrypted */ - 1
                  );
                  return;
                }

                var6 = -442988741 & -2070211140 ^ 1237835747;
                continue;
              case -635036636:
                null /* jnt:encrypted */;
                break label331;
              case 17419370:
                if (/* jnt */)
                  && !/* jnt */
                    )
                  )) {
                  /* jnt */;
                }
                break label329;
              case 130640817:
                if (null /* jnt:encrypted */ > 200.0) {
                  /* jnt */;
                  null /* jnt:encrypted */;
                  return;
                }

                var6 = (1283591901 >>> 1283591901 | -1335206431) & -1174765581;
                continue;
              case 892494131:
                if (null /* jnt:encrypted */ > 20.0
                  && null /* jnt:encrypted */) {
                  /* jnt */;
                  null /* jnt:encrypted */;
                  return;
                }

                var6 = (85669734 & -1521337226 | -266017656) & -51057446;
                continue;
              case 954360194:
                /* jnt */;
                if (/* jnt */)) {
                  int var8 = /* jnt */)
                    - 1;
                  if (!/* jnt */
                        )
                      ),
                      var8
                    ),
                    null /* jnt:encrypted */
                  )) {
                    if (null /* jnt:encrypted */ < 30
                      && !null /* jnt:encrypted */) {
                      null /* jnt:encrypted */ + 1
                      );
                      return;
                    }

                    var6 = (506674229 * -1579360467 | -796890974) & -52331866;
                  } else {
                    var6 = (1534053675 ^ 921889062 | -1588553375) & -9135755;
                  }

                  label308:
                  while (true) {
                    switch ((var6 + 222503086 + 1086639576 - 1417935726 ^ 752751925) - 367563267 - 123228301) {
                      case -1396328776:
                        if (!null /* jnt:encrypted */) {
                          break label308;
                        }

                        if (null /* jnt:encrypted */
                          )
                          != null) {
                          /* jnt */
                            )
                          );
                          null /* jnt:encrypted */;
                        }

                        var6 = -242850320 << 786691089 ^ -777226769;
                        break;
                      case -914723841:
                      default:
                        null /* jnt:encrypted */;
                        null /* jnt:encrypted */;
                        if (/* jnt */
                              )
                            )
                          )
                          != var8) {
                          /* jnt */;
                        }

                        var6 = 1714791134 << 1685101036 ^ 466769057;
                        break;
                      case -98775044:
                        if (null /* jnt:encrypted */
                            )
                          ) instanceof class_1707 var11
                          && /* jnt */ == 3) {
                          var6 = 1148055453 >> 1332803301 ^ 2002210744;

                          while (true) {
                            switch ((var6 + 1783848054 + 466972424 ^ 1054369488 ^ 1952107240) + 1260306236 - 1099385345) {
                              case -1237336778:
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

                                var6 = (949341768 ^ 949341768 | -1539857957) & -1246233125;
                                break;
                              case -1162496587:
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

                                var6 = 45039536 & 1531237726 ^ 1644574037;
                                break;
                              case 97378474:
                                class_634 var22 = /* jnt */
                                );
                                int var30 = (-15939479 | -513090966 | 0) & 9502996;

                                StringBuilder var39;
                                for (var39 = (StringBuilder)/* jnt */;
                                  var30 < (-1072577994 << -1072577994 ^ -1920991228);
                                  var30 += 1702159959 ^ -2073865756 ^ -518539342
                                ) {
                                  char var58 = /* jnt */;
                                  int var74 = (var58 & '\uffff') >> 0;
                                  int var59 = (var58 & '\uffff') >> 0 | var58 << 16;
                                  int var75 = (((var58 & '\uffff') >> 0 | var58 << 16) & 65528) >> 3;
                                  var58 = (char)(((((var74 | var58 << 16) & 65528) >> 3 | ((var58 & '\uffff') >> 0 | var58 << 16) << 13) ^ 189) - 78 - 230);
                                  /* jnt */(((var75 | var59 << 13) ^ 189) - 78 - 230)
                                  );
                                }

                                /* jnt */
                                );
                                null /* jnt:encrypted */;
                                return;
                              case 1786394268:
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

                                var6 = -1389954671 >> 688129359 ^ -814440044;
                            }
                          }
                        }

                        class_634 var21 = /* jnt */
                        );
                        int var28 = -885559932 + -1922730472 ^ 1486676892;

                        StringBuilder var37;
                        for (var37 = (StringBuilder)/* jnt */;
                          var28 < (-845706446 & 2032731692 >>> -65100430 ^ 2566);
                          var28 += -639175124 - -585714181 ^ -53460944
                        ) {
                          /* jnt */(
                              ((/* jnt */ + '(' ^ 126) + 56 ^ 230) + 243
                            )
                          );
                        }

                        /* jnt */
                        );
                        null /* jnt:encrypted */;
                        return;
                      case 567122338:
                        null /* jnt:encrypted */;
                        null /* jnt:encrypted */;
                        break label308;
                    }
                  }
                }

                var6 = -1728106983 << -2060587250 ^ -1001644627;
                continue;
              case 993281814:
                null /* jnt:encrypted */
                  )
                );
                null /* jnt:encrypted */;
                break;
              case 1076864126:
                if (/* jnt */)) {
                  boolean var7 = /* jnt */
                        )
                      )
                    ),
                    null /* jnt:encrypted */
                  );
                  mf var10 = (mf)/* jnt */null /* jnt:encrypted */null /* jnt:encrypted */
                    ),
                    mf.class
                  );
                  if (var7) {
                    null /* jnt:encrypted */;
                    var6 = (-1101520035 & -509748579 | 1405290706) & 1607405010;
                  } else {
                    var6 = (-1327462282 >>> -1327462282 | -419905524) & -268573940;
                  }

                  label295:
                  while (true) {
                    switch ((var6 + 669924928 + 46815026 + 1939108863 ^ 478406807) - 1949107142 - 666647403) {
                      case -35855175:
                      default:
                        if (/* jnt */) {
                          if (/* jnt */
                            )
                            != -1) {
                            null /* jnt:encrypted */;
                            var6 = (-1101520035 & -509748579 | 1405290706) & 1607405010;
                          } else {
                            var6 = -1609384443 - -1394518355 ^ -96708364;
                          }
                        } else {
                          var6 = -1609384443 - -1394518355 ^ -96708364;
                        }
                        break;
                      case 535847513:
                        null /* jnt:encrypted */ + 1.0
                        );
                        var6 = (-1101520035 & -509748579 | 1405290706) & 1607405010;
                        break;
                      case 1387445155:
                        if (null /* jnt:encrypted */
                          > /* jnt */
                          )) {
                          int var26 = (-551801047 >>> -181977726 | 0) & 1074806832;

                          StringBuilder var35;
                          for (var35 = (StringBuilder)/* jnt */;
                            var26 < ((-2095081994 << 29517114 | 19) & 115498431);
                            var26 += (-860610774 - 1378461130 | 1) & 23397909
                          ) {
                            int var51 = (/* jnt */ ^ 177 ^ 182) + 210;
                            int var72 = (var51 & 65472) >> 6;
                            int var52 = (var51 & 65472) >> 6 | var51 << 10;
                            int var73 = (((var51 & 65472) >> 6 | var51 << 10) & 65408) >> 7;
                            char var53 = (char)(((var72 | var51 << 10) & 65408) >> 7 | ((var51 & 65472) >> 6 | var51 << 10) << 9);
                            /* jnt */(var73 | var52 << 9)
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
                        break label295;
                    }
                  }
                }

                var6 = (-1767077001 >>> -2047515744 | 709231744) & 1808145794;
                continue;
              case 1197173630:
                return;
              case 1309592190:
                if (null /* jnt:encrypted */ == null
                  || !(
                    /* jnt */,
                        /* jnt */
                          )
                        )
                      )
                      < 2.0
                  )) {
                  var6 = (-186847304 - -999659776 | -938921817) & -930253849;
                  continue;
                }

                null /* jnt:encrypted */ + 1.0);
                break;
              case 1501074169:
                if (null /* jnt:encrypted */ <= 0) {
                  var6 = 1471910317 * 660238481 ^ 1832875746;
                  continue;
                }

                null /* jnt:encrypted */ - 1
                );
                if (null /* jnt:encrypted */ < 1) {
                  if (null /* jnt:encrypted */ != null
                    && /* jnt */,
                        /* jnt */
                          )
                        )
                      )
                      < 100.0) {
                    /* jnt */;
                    return;
                  }

                  var6 = -1564602769 >> -1519703258 ^ -1629406864;
                  continue;
                }
                break label331;
              case 1773345280:
                if (null /* jnt:encrypted */) {
                  /* jnt */;
                }

                var6 = 662274194 << 662274194 ^ 928718367;
                continue;
              case 2121589264:
              default:
                if (null /* jnt:encrypted */) {
                  int var2 = /* jnt */)
                    - 1;
                  class_1799 var3 = /* jnt */
                      )
                    ),
                    var2
                  );
                  if (/* jnt */
                        )
                      )
                    )
                    != var2) {
                    /* jnt */;
                  }

                  var6 = (392995735 - -2105230855 | 50366850) & 1668458930;

                  while (true) {
                    switch (((var6 - 1560549885 ^ 1571352979) + 603436026 ^ 1856958562) + 798564661 - 1184611951) {
                      case -1476636785:
                        if (/* jnt */
                              )
                            )
                          )
                          > 0) {
                          class_1269 var12 = /* jnt */
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

                        var6 = -1586918182 >>> -1133133759 ^ -1009498080;
                        break;
                      case -1346788510:
                        if (null /* jnt:encrypted */
                          )
                          != null) {
                          /* jnt */
                            )
                          );
                          null /* jnt:encrypted */;
                          return;
                        }

                        var6 = -751064408 ^ -751064408 ^ -60629549;
                        break;
                      case -901763931:
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
                      case 1514022184:
                        if (!/* jnt */
                        )) {
                          if (null /* jnt:encrypted */
                              )
                            ) instanceof class_1707 var4
                            && /* jnt */ == 3) {
                            var6 = (1574351115 - -58056341 * -58056341 | -784050785) & -574105665;

                            while (true) {
                              switch ((var6 + 1505016448 ^ 2045928269) + 951381877 - 1200609995 ^ 19276442 ^ 1959707908) {
                                case -824042784:
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

                                  var6 = (165800183 - -2034808266 | -1103065936) & -1086006024;
                                  break;
                                case 667201401:
                                default:
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

                                  var6 = (654008092 | 775160926) ^ -1785986767;
                                  break;
                                case 672626642:
                                  class_634 var20 = /* jnt */
                                  );
                                  int var24 = -213736882 & -213736882 ^ -213736882;

                                  StringBuilder var33;
                                  for (var33 = (StringBuilder)/* jnt */;
                                    var24 < (82728377 >> -1011034139 ^ 2585257);
                                    var24 += 2037164189 ^ -1460231133 ^ -778433345
                                  ) {
                                    int var46 = (/* jnt */ ^ 150) + 158;
                                    int var70 = (var46 & 57344) >> 13;
                                    int var47 = (var46 & 57344) >> 13 | var46 << 3;
                                    int var71 = (((var46 & 57344) >> 13 | var46 << 3) & 61440) >> 12;
                                    char var48 = (char)((((var70 | var46 << 3) & 61440) >> 12 | ((var46 & 57344) >> 13 | var46 << 3) << 4) - 167);
                                    /* jnt */((var71 | var47 << 4) - 167)
                                    );
                                  }

                                  /* jnt */
                                  );
                                  null /* jnt:encrypted */;
                                  return;
                                case 1237770850:
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

                                  var6 = -156338610 - -699986229 ^ 797348858;
                                  break;
                                case 1952515520:
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

                                  var6 = (1389668469 >>> 924243014 | 1449165081) & 1450374493;
                              }
                            }
                          }

                          class_634 var10000 = /* jnt */
                          );
                          int var10001 = -1859417253 ^ -1859417253 ^ 0;

                          StringBuilder var10002;
                          for (var10002 = (StringBuilder)/* jnt */;
                            var10001 < (31332316 & -1718441267 ^ 26346184);
                            var10001 += 1310814014 ^ -2134160422 << (1310814014 ^ -2134160422) ^ 1117115039
                          ) {
                            char var41 = /* jnt */;
                            int var10005 = (var41 & 'ﾀ') >> 7;
                            int var42 = (var41 & 'ﾀ') >> 7 | var41 << '\t';
                            int var69 = (((var41 & 'ﾀ') >> 7 | var41 << '\t') & 0) >> 16;
                            var41 = (char)((((var10005 | var41 << '\t') & 0) >> 16 | ((var41 & 'ﾀ') >> 7 | var41 << '\t') << 0) + 252 + 254 - 252);
                            /* jnt */((var69 | var42 << 0) + 252 + 254 - 252)
                            );
                          }

                          /* jnt */
                          );
                          null /* jnt:encrypted */;
                          return;
                        }

                        var6 = (1270698078 | 1256435944 | 884221440) & -1229574252;
                        break;
                      case 1900050723:
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

                        var6 = (1063444678 ^ 997666069 | 1323577870) & -85217;
                    }
                  }
                }

                var6 = 1060566487 + -848507997 ^ 1130038723;
                continue;
            }

            var6 = -783203928 + -1824794031 ^ -1568488783;
          }

          var6 = 1741947698 << 1741947698 ^ 289838173;
        }

        var6 = (47060543 >>> -1536616007 | 883352351) & 2007497727;
      }
    }
  }

  public void aek() {
    null /* jnt:encrypted */;
    class_634 var10000 = /* jnt */
    );
    String var1 = /* jnt */
          )
          == null /* jnt:encrypted */
        ? /* jnt */
        : (bv)/* jnt */
        )
    );
    StringBuilder var10001 = (StringBuilder)/* jnt */;
    int var10002 = (-931595799 << 1711426152 | 0) & -2029648171;

    StringBuilder var10003;
    for (var10003 = (StringBuilder)/* jnt */;
      var10002 < ((-1037189691 - -1789817052 | 4) & -2094956450);
      var10002 += (-799359096 | 1575206917 | 1) & 570687555
    ) {
      int var4 = /* jnt */ + 'M';
      char var7 = (char)(
        (((((var4 & 65504) >> 5 | var4 << 11) & 32768) >> 15 | ((var4 & 65504) >> 5 | var4 << 11) << 1) - 124 & 0) >> 16
          | ((((var4 & 65504) >> 5 | var4 << 11) & 32768) >> 15 | ((var4 & 65504) >> 5 | var4 << 11) << 1) - 124 << 0
      );
      /* jnt */(
          (((((var4 & 65504) >> 5 | var4 << 11) & 32768) >> 15 | ((var4 & 65504) >> 5 | var4 << 11) << 1) - 124 & 0) >> 16
            | ((((var4 & 65504) >> 5 | var4 << 11) & 32768) >> 15 | ((var4 & 65504) >> 5 | var4 << 11) << 1) - 124 << 0
        )
      );
    }

    /* jnt */
          ),
          var1
        )
      )
    );
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted *//* jnt */
            )
          )
        )
      )
    );
  }

  public void tx(class_2561 var1) {
    int var10000 = 1609309195 * 2133887042 ^ -522906922;

    StringBuilder var10001;
    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < (1234824345 * 1088491487 ^ 1416302679);
      var10000 += (-1175302197 << -1175302197 | 1) & 1820336827
    ) {
      char var5 = /* jnt */;
      char var8 = (char)(
        ((((((var5 & '\ufff0') >> 4 | var5 << '\f') & 65504) >> 5 | ((var5 & '\ufff0') >> 4 | var5 << '\f') << 11) + 27 ^ 118) & 61440) >> 12
          | (((((var5 & '\ufff0') >> 4 | var5 << '\f') & 65504) >> 5 | ((var5 & '\ufff0') >> 4 | var5 << '\f') << 11) + 27 ^ 118) << 4
      );
      /* jnt */(
          ((((((var5 & '\ufff0') >> 4 | var5 << '\f') & 65504) >> 5 | ((var5 & '\ufff0') >> 4 | var5 << '\f') << 11) + 27 ^ 118) & 61440) >> 12
            | (((((var5 & '\ufff0') >> 4 | var5 << '\f') & 65504) >> 5 | ((var5 & '\ufff0') >> 4 | var5 << '\f') << 11) + 27 ^ 118) << 4
        )
      );
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

  public bv imk() {
    bv[] var1 = new bv[]{
      null /* jnt:encrypted */,
      null /* jnt:encrypted */,
      null /* jnt:encrypted */,
      null /* jnt:encrypted */,
      null /* jnt:encrypted */,
      null /* jnt:encrypted */
    };
    return var1[/* jnt *//* jnt */, var1.length
    )];
  }
  public String mxb(bv var1) {
    int var2 = -49767118;

    int var10000;
    StringBuilder var10001;
    switch (switch ((/* jnt */ + 924068453 ^ 1217553063) + 43501656 - 2057897775 - 869256366
          ^ 1954418907) {
          case -1478808090 -> (-353997285 ^ -353997285 | 728198751) & -277877025;
          case -1478808089 -> -222598457 << (370396524 >> 1092401715) ^ 1022168534;
          default -> (1867048651 - 1537448914 | -1004267898) & -713771098;
        }
        + 230663537
        - 133685397
        + 261787381
        - 182479835
        - 39487758
      ^ 1844279280) {
      case -1815776702:
      default:
        var10000 = 196989736 * 196989736 ^ -415566272;
        var10001 = (StringBuilder)/* jnt */;
        var2 = (854007119 + -1757512203 | -1298266229) & -20545;
        break;
      case -1331297666:
        return /* jnt */;
      case 1583594167:
        var10000 = (633810766 >> -62733309 | 0) & 2051211798;
        var10001 = (StringBuilder)/* jnt */;
        var2 = 1282223787 + 1282223787 ^ -1926715761;
    }

    label49:
    while (true) {
      switch ((var2 - 41501824 + 1442652020 - 316944874 ^ 1003559708) + 814414800 - 1381049673) {
        case -557319668:
        default:
          var7 = var10001;
          if (var10000 >= (1855933791 * 782548237 ^ -586018604)) {
            var2 = (-473760722 ^ -1739357883 >>> -210521402 | 172527948) & 449633775;
            break label49;
          }

          int var14 = /* jnt */ + 211 ^ 149 ^ 155;
          int var20 = (var14 & 65535) >> 0;
          int var15 = (var14 & 65535) >> 0 | var14 << 16;
          int var21 = (((var14 & 65535) >> 0 | var14 << 16) & 49152) >> 14;
          char var16 = (char)(((var20 | var14 << 16) & 49152) >> 14 | ((var14 & 65535) >> 0 | var14 << 16) << 2);
          /* jnt */(var21 | var15 << 2));
          var10000 += (-636014588 * 1201364982 | 1) & -2142748637;
          var2 = (854007119 + -1757512203 | -1298266229) & -20545;
          continue;
        case 1266521734:
      }

      var7 = var10001;
      if (var10000 >= (213766962 << -2037114949 ^ -1879048182)) {
        var2 = (2034676236 - -232382530 | 948709408) & 2089724984;
        break;
      }

      int var10 = (/* jnt */ + ' ' ^ 29) - 226 + 125;
      char var11 = (char)((var10 & 65528) >> 3 | var10 << 13);
      /* jnt */((var10 & 65528) >> 3 | var10 << 13)
      );
      var10000 += (-1295229115 >> (1619216891 >> -1295229115 * 1619216891) | 0) & 2049;
      var2 = 1282223787 + 1282223787 ^ -1926715761;
    }
    return switch (((var2 ^ 1928403252) + 550730667 ^ 1846379629) - 1011371838 + 1731979640 - 2022892430) {
      case -1453246697 -> /* jnt */;
      default -> /* jnt */;
    };
  }

  public void hrp() {
    int var2 = -645318248;
    tb var1 = (tb)/* jnt */null /* jnt:encrypted */null /* jnt:encrypted */
      ),
      tb.class
    );
    if (/* jnt */) {
      if (/* jnt */) {
        return;
      }

      var2 = (1050887807 >> 598491389 | 1637662938) & -140516390;
    } else {
      var2 = (-1321457684 * -1806412763 | 1346667721) & 1585306863;
    }

    switch (var2 - 1219206454 - 1643245871 + 1597591717 - 2006696806 + 432024 - 597328031) {
      case 1844030112:
        /* jnt */;
        return;
      case 2064176813:
      default:
        /* jnt */;
    }
  }

  public void sx(boolean var1) {
    if (/* jnt */
        )
      )
      != 89.9F) {
      /* jnt */
        ),
        89.9F
      );
    }

    /* jnt */;
  }
  public void du() {
    int var14 = -414583985;
    int var1 = 0;
    int var2 = 0;
    class_2338 var3 = null;
    Iterator var4 = /* jnt */
    );

    label199:
    while (true) {
      var14 = (11611884 >>> -528867839 | -568049552) & -18581003;

      while (true) {
        label193:
        while (true) {
          label191:
          while (true) {
            label227: {
              nc var23;
              int var27;
              StringBuilder var34;
              switch ((var14 ^ 92970223 ^ 380539525) - 237003140 - 929740942 + 17554639 - 502040927) {
                case -1949127355:
                  return;
                case -1790610681:
                  if (var2 > 0) {
                    null /* jnt:encrypted */ + 1
                    );
                    break label193;
                  }

                  var14 = 2058593652 >>> 1555888374 ^ 1869249816;
                  continue;
                case -260372636:
                default:
                  if (var1 <= /* jnt */)
                    )
                   {
                    break label191;
                  }

                  var23 = this;
                  var27 = -523039335 & -523039335 ^ -523039335;
                  var34 = (StringBuilder)/* jnt */;
                  var14 = (1621732545 * 1109067702 | 1733230724) & -268489019;
                  break;
                case 434285558:
                  null /* jnt:encrypted */;
                  break label193;
                case 1520597527:
                  if (null /* jnt:encrypted */ <= 10) {
                    break label227;
                  }

                  var23 = this;
                  var27 = (235177677 << 1511424240 | 0) & 959584993;
                  var34 = (StringBuilder)/* jnt */;
                  var14 = 271379662 * 1834349543 ^ 1769227172;
                  break;
                case 1792317564:
                  if (/* jnt */) {
                    class_2818 var5 = (ClientWorld)/* jnt */;
                    Iterator var6 = /* jnt */
                    );

                    label142:
                    while (true) {
                      var14 = (-751340782 | -317148799 >>> (-751340782 >> -317148799)) ^ -866849624;

                      class_2586 var8;
                      label85:
                      while (true) {
                        switch ((var14 - 2110945014 ^ 1540693277 ^ 252379667) + 1516615599 + 1279844529 ^ 115743448) {
                          case -1696921974:
                          default:
                            if (/* jnt */) {
                              class_2338 var7 = (BlockPos)/* jnt */;
                              var8 = /* jnt */
                                ),
                                var7
                              );
                              if (!/* jnt */
                                )
                                || !(var8 instanceof class_2636 var9)) {
                                break label85;
                              }

                              class_1917 var10 = /* jnt */;
                              class_1952 var11 = /* jnt */var10
                              );
                              class_2487 var12 = /* jnt */;
                              var27 = (-867516257 ^ 875131495 & -557732605 | 0) & 87033088;

                              for (var34 = (StringBuilder)/* jnt */;
                                var27 < ((-1977972343 + 1757774280 | 2) & 136103050);
                                var27 += (657572045 + 657572045 | 1) & -1341380063
                              ) {
                                char var37 = /* jnt */;
                                char var38 = (char)(((var37 & '\ufff0') >> 4 | var37 << '\f') + 207 - 110 + 95 + 200);
                                /* jnt */(((var37 & '\ufff0') >> 4 | var37 << '\f') + 207 - 110 + 95 + 200)
                                );
                              }

                              Optional var13 = /* jnt */
                              );
                              if (!/* jnt */) {
                                String var10000 = (String)/* jnt */;
                                var27 = -556700117 << 928961181 ^ 1610612736;
                                var34 = (StringBuilder)/* jnt */;

                                label112:
                                while (true) {
                                  var14 = (1441919130 ^ -822862971 | -1931868303) & -570800271;

                                  while (true) {
                                    label213: {
                                      StringBuilder var26;
                                      switch ((var14 - 230137304 - 1882987249 ^ 2050798388 ^ 317348911) - 1977837161 - 267661422) {
                                        case -593488882:
                                          var26 = var34;
                                          if (var27 < (2036293418 & 1306418921 ^ 1230921272)) {
                                            int var45 = /* jnt */ - '&';
                                            char var46 = (char)(((var45 & 65472) >> 6 | var45 << 10) - 20 + 130 + 155);
                                            /* jnt */(((var45 & 65472) >> 6 | var45 << 10) - 20 + 130 + 155)
                                            );
                                            var27 += (-339278100 >> -52691925 | 1) & 1547;
                                            break label213;
                                          }

                                          var14 = (1900487450 * 1900487450 | -1016872621) & -1008479781;
                                          break;
                                        case -245839140:
                                        default:
                                          var26 = var34;
                                          if (var27 < (1683419900 & -1308600447 ^ 536892053)) {
                                            int var41 = /* jnt */ - 6;
                                            char var42 = (char)((((var41 & 63488) >> 11 | var41 << 5) - 113 ^ 225) - 26);
                                            /* jnt */((((var41 & 63488) >> 11 | var41 << 5) - 113 ^ 225) - 26)
                                            );
                                            var27 += 1966017303 * 1966017303 ^ 418184208;
                                            continue label112;
                                          }

                                          var14 = (-1049120358 << -453546330 | -1449117406) & -1073857110;
                                      }

                                      switch (var14 - 96957878 - 289628729 + 870808606 - 1474677344 + 1076031289 ^ 591450212) {
                                        case -532228402:
                                          if (/* jnt */
                                          )) {
                                            break label85;
                                          }

                                          var10000 = (String)/* jnt */;
                                          var27 = (1595477000 + -555322705 | 0) & -2147483648;
                                          var34 = (StringBuilder)/* jnt */;
                                          break;
                                        case -348304705:
                                        default:
                                          if (!/* jnt */
                                          )) {
                                            var2++;
                                            var3 = var7;
                                          }
                                          break label85;
                                      }
                                    }

                                    var14 = (677076233 << (-1968768053 ^ -993734560) | 9746119) & -1399521313;
                                  }
                                }
                              }
                              continue label142;
                            }

                            var14 = -174654129 - (-506082382 ^ -174654129) ^ -1098029288;
                            break;
                          case 1533466466:
                            continue label199;
                        }
                      }

                      var14 = -494504770 * -494504770 ^ -2013951557;

                      while (true) {
                        switch (var14 - 1593275273 - 977875102 - 1416272075 ^ 410075119 ^ 558257750 ^ 793841996) {
                          case -655043434:
                          default:
                            continue label142;
                          case 241114092:
                            var1++;
                            break;
                          case 1615040312:
                            if (var8 instanceof class_2595
                              || var8 instanceof class_2611
                              || var8 instanceof class_2627
                              || var8 instanceof class_3866
                              || var8 instanceof class_3719
                              || var8 instanceof class_2605) {
                              var14 = (-1755762293 | -1755762293 | 14974978) & 635742335;
                              continue;
                            }
                        }

                        var14 = 1632130653 * 1632130653 ^ -1756400484;
                      }
                    }
                  }

                  var14 = (-1796271623 * (1043315519 | 378935724) | -1533987070) & -457885717;
                  continue;
              }

              while (true) {
                switch ((var14 ^ 1897459853) - 560740253 - 868472963 - 994038578 + 1114377317 ^ 602176029) {
                  case -352298239:
                    if (var27 >= (1372719247 * 1832510365 ^ 909970621)) {
                      var14 = (-1008426720 | -1236067265 | -970956586) & -432971042;
                      switch ((var14 + 314417502 ^ 1834913667) + 867926754 - 983694926 - 1257828604 - 1192623372) {
                        case -54778805:
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
                          break label191;
                        case 756600695:
                        default:
                          /* jnt */,
                            /* jnt */,
                            /* jnt */,
                            /* jnt */,
                            false
                          );
                          null /* jnt:encrypted */;
                          break label227;
                      }
                    }

                    char var55 = /* jnt */;
                    char var58 = (char)(
                      (((((var55 & '쀀') >> 14 | var55 << 2) + 14 & 57344) >> 13 | ((var55 & '쀀') >> 14 | var55 << 2) + 14 << 3) - 237 & 63488) >> 11
                        | ((((var55 & '쀀') >> 14 | var55 << 2) + 14 & 57344) >> 13 | ((var55 & '쀀') >> 14 | var55 << 2) + 14 << 3) - 237 << 5
                    );
                    /* jnt */(
                        (((((var55 & '쀀') >> 14 | var55 << 2) + 14 & 57344) >> 13 | ((var55 & '쀀') >> 14 | var55 << 2) + 14 << 3) - 237 & 63488) >> 11
                          | ((((var55 & '쀀') >> 14 | var55 << 2) + 14 & 57344) >> 13 | ((var55 & '쀀') >> 14 | var55 << 2) + 14 << 3) - 237 << 5
                      )
                    );
                    var27 += -1516123399 ^ -937102194 ^ 1837448822;
                    var14 = (1621732545 * 1109067702 | 1733230724) & -268489019;
                    break;
                  case 506714051:
                  default:
                    if (var27 >= ((1739917754 | 1739917754) ^ 1739917739)) {
                      var14 = 980028371 + -1869058762 + 980028371 ^ -1644195114;
                      switch ((var14 + 314417502 ^ 1834913667) + 867926754 - 983694926 - 1257828604 - 1192623372) {
                        case -54778805:
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
                          break label191;
                        case 756600695:
                        default:
                          /* jnt */,
                            /* jnt */,
                            /* jnt */,
                            /* jnt */,
                            false
                          );
                          null /* jnt:encrypted */;
                          break label227;
                      }
                    }

                    int var49 = /* jnt */ - 'B';
                    char var52 = (char)(
                      (((((var49 & 65535) >> 0 | var49 << 16) & 65024) >> 9 | ((var49 & 65535) >> 0 | var49 << 16) << 7) - 204 & 63488) >> 11
                        | ((((var49 & 65535) >> 0 | var49 << 16) & 65024) >> 9 | ((var49 & 65535) >> 0 | var49 << 16) << 7) - 204 << 5
                    );
                    /* jnt */(
                        (((((var49 & 65535) >> 0 | var49 << 16) & 65024) >> 9 | ((var49 & 65535) >> 0 | var49 << 16) << 7) - 204 & 63488) >> 11
                          | ((((var49 & 65535) >> 0 | var49 << 16) & 65024) >> 9 | ((var49 & 65535) >> 0 | var49 << 16) << 7) - 204 << 5
                      )
                    );
                    var27 += -1760767017 ^ -1760767017 ^ 1;
                    var14 = 271379662 * 1834349543 ^ 1769227172;
                }
              }
            }

            var14 = (-1270467987 << -1270467987 | 29540460) & 2043861756;
          }

          var14 = (-283352828 ^ -1510310918 & (-283352828 ^ -1510310918) | 822744449) & -48562803;
        }

        var14 = -1397005562 >>> 1674636286 ^ -1372959023;
      }
    }
  }

  // $VF: Handled exception range with multiple entry points by splitting it
  // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
  public void qm(String var1, int var2, int var3, int var4, boolean var5) {
    int var16 = -647614670;
    int var10000;
    StringBuilder var10001;
    if (var5) {
      var10000 = 1199413646 & 1162639495 ^ 1162614918;
      var10001 = (StringBuilder)/* jnt */;
      var16 = (1226307984 * -226926615 | 134809845) & 1579755773;
    } else {
      var10000 = (-926666218 ^ -50822222 | 0) & -2013131183;
      var10001 = (StringBuilder)/* jnt */;
      var16 = (-133971380 | 736603665 | -2011869054) & -1969925142;
    }

    label176:
    while (true) {
      switch (((var16 ^ 149112628) + 719983758 ^ 405826012 ^ 1455014886 ^ 1171000385) - 149581505) {
        case -1657070026:
          var28 = var10001;
          if (var10000 >= ((-1980222934 | -1227796462 | 7) & 2055)) {
            var16 = (-103690492 - -103690492 | -349993460) & -80742530;
            break label176;
          }

          int var45 = /* jnt */ - '_' - 79;
          int var70 = (var45 & 65408) >> 7;
          int var46 = (var45 & 65408) >> 7 | var45 << 9;
          int var71 = (((var45 & 65408) >> 7 | var45 << 9) & 65472) >> 6;
          char var47 = (char)((((var70 | var45 << 9) & 65472) >> 6 | ((var45 & 65408) >> 7 | var45 << 9) << 10) ^ 138);
          /* jnt */((var71 | var46 << 10) ^ 138));
          var10000 += (211817946 | -169547166 | 1) & 34144257;
          var16 = (-133971380 | 736603665 | -2011869054) & -1969925142;
          break;
        case 403133299:
        default:
          var28 = var10001;
          if (var10000 >= (-899490265 + (-983896713 >>> (-899490265 | -983896713)) ^ -899489867)) {
            var16 = (-1904947408 - 2062056350 | -1876841369) & -563757841;
            break label176;
          }

          char var40 = /* jnt */;
          int var10004 = (var40 & '\uffc0') >> 6;
          int var41 = (var40 & '\uffc0') >> 6 | var40 << '\n';
          int var69 = (((var40 & '\uffc0') >> 6 | var40 << '\n') & 65472) >> 6;
          var40 = (char)((((var10004 | var40 << '\n') & 65472) >> 6 | ((var40 & '\uffc0') >> 6 | var40 << '\n') << 10) + 104 + 95 - 88);
          /* jnt */((var69 | var41 << 10) + 104 + 95 - 88)
          );
          var10000 += -1324032797 & -1324032797 ^ -1324032798;
          var16 = (1226307984 * -226926615 | 134809845) & 1579755773;
      }
    }
    String var6 = switch ((var16 + 1006283345 - 696068400 - 308317565 - 1958930782 ^ 428205477) + 176947612) {
      default -> /* jnt */;
      case 2055501715 -> /* jnt */;
    };
    if (/* jnt */)) {
      te var7 = (te)/* jnt */
        )
      );
      hn var8 = (hn)/* jnt */;
      /* jnt */;
      String var10 = /* jnt */
          )
        )
      );
      var10001 = (StringBuilder)/* jnt */;
      int var49 = (-2104281585 * 877746032 * -1113486434 | 0) & 541099029;
      StringBuilder var59 = (StringBuilder)/* jnt */;

      label153:
      while (true) {
        var16 = (1750740540 * 1750740540 | 592268680) & -481309218;

        while (true) {
          label148: {
            StringBuilder var50;
            switch ((var16 + 998333022 + 1206573407 - 1490030459 - 227161901 ^ 906775123) + 1520916113) {
              case -2105446927:
              default:
                var50 = var59;
                if (var49 < (-1552959728 >> 1679978507 ^ -758278)) {
                  char var99 = /* jnt */;
                  char var100 = (char)((((var99 & '￠') >> 5 | var99 << 11) + 135 ^ 194 ^ 80) - 134);
                  /* jnt */((((var99 & '￠') >> 5 | var99 << 11) + 135 ^ 194 ^ 80) - 134)
                  );
                  var49 += -1439543340 >>> -1439543340 ^ 2722;
                  break label148;
                }

                var16 = (-392103006 - (-285981707 - -1248108019) | 856245853) & 1936283229;
                break;
              case 284903311:
                var50 = var59;
                if (var49 < ((-531072873 | -531072873) ^ -531072842)) {
                  int var73 = /* jnt */ ^ 'F';
                  int var10006 = (var73 & 64512) >> 10;
                  int var74 = (var73 & 64512) >> 10 | var73 << 6;
                  int var125 = (((var73 & 64512) >> 10 | var73 << 6) & 0) >> 16;
                  var73 = ((var10006 | var73 << 6) & 0) >> 16 | ((var73 & 64512) >> 10 | var73 << 6) << 0;
                  var10006 = ((var125 | var74 << 0) & 32768) >> 15;
                  int var76 = ((var125 | var74 << 0) & 32768) >> 15 | var73 << 1;
                  int var127 = ((((var125 | var74 << 0) & 32768) >> 15 | var73 << 1) & 65520) >> 4;
                  char var77 = (char)(((var10006 | var73 << 1) & 65520) >> 4 | (((var125 | var74 << 0) & 32768) >> 15 | var73 << 1) << 12);
                  /* jnt */(var127 | var76 << 12));
                  var49 += (-1866355878 >> 464523631 | 1) & 56385;
                  continue label153;
                }

                var16 = 474144183 >> 1649124793 ^ -72177035;
            }

            switch ((var16 ^ 1870860421) + 563483757 + 1628508749 + 1285307235 + 278246697 - 1179213495) {
              case -161874073:
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
                var49 = (1417795003 >> -887444384 | 0) & -2094661120;
                var59 = (StringBuilder)/* jnt */;

                label135:
                while (true) {
                  var16 = (1372425676 * 819492355 | 1620577107) & 1790545875;

                  while (true) {
                    label185: {
                      StringBuilder var52;
                      switch (var16 + 1654544653 - 805541580 - 2048795093 - 258359275 - 75511783 + 2144268486) {
                        case -1927437133:
                          var52 = var59;
                          if (var49 < ((781626220 - -183836870 | 9) & -2039217715)) {
                            char var95 = /* jnt */;
                            int var136 = (var95 & '￼') >> 2;
                            int var96 = ((var95 & '￼') >> 2 | var95 << 14) - 166;
                            int var137 = (((var95 & '￼') >> 2 | var95 << 14) - 166 & 61440) >> 12;
                            var95 = (char)(((((var136 | var95 << 14) - 166 & 61440) >> 12 | ((var95 & '￼') >> 2 | var95 << 14) - 166 << 4) ^ 250) - 244);
                            /* jnt */(((var137 | var96 << 4) ^ 250) - 244)
                            );
                            var49 += -2035217409 ^ -2035217409 ^ 1;
                            continue label135;
                          }

                          var16 = (-1032588731 << -756575410 | -1054826275) & -1050089761;
                          break;
                        case -318862182:
                        default:
                          var52 = var59;
                          if (var49 < ((-1323349357 & -607526210 | 8) & 1685364809)) {
                            int var81 = /* jnt */ + 212 - 135
                              ^ 121
                              ^ 250;
                            char var82 = (char)((var81 & 63488) >> 11 | var81 << 5);
                            /* jnt */((var81 & 63488) >> 11 | var81 << 5)
                            );
                            var49 += (1538544563 << 537367464 | 1) & 161762499;
                            break label185;
                          }

                          var16 = 475351923 & -1887083201 ^ 1167432298;
                      }

                      LocalTime var36;
                      switch ((var16 + 651056817 - 2018507055 + 1040138037 ^ 948281232 ^ 572092009) + 2007328147) {
                        case -1539838084:
                          String var37 = /* jnt */
                            )
                          );
                          int var14 = var3;
                          int var13 = var2;
                          StringBuilder var55 = (StringBuilder)/* jnt */;
                          int var67 = (-727058369 | 1292843080) ^ -575670145;
                          StringBuilder var91 = (StringBuilder)/* jnt */;

                          label111:
                          while (true) {
                            var16 = -2101411409 & 2094353051 ^ 1480714162;

                            while (true) {
                              label106:
                              while (true) {
                                label104: {
                                  switch ((var16 - 830415966 ^ 1344664591) + 1291528778 + 1950652627 + 1003743030 - 706094811) {
                                    case -849947422:
                                      var59 = var91;
                                      if (var67 < (2048414009 + -2000916827 ^ 47497178)) {
                                        int var119 = (/* jnt */ ^ 'c')
                                          - 60
                                          - 236
                                          + 202;
                                        char var120 = (char)((var119 & 65534) >> 1 | var119 << 15);
                                        /* jnt */((var119 & 65534) >> 1 | var119 << 15)
                                        );
                                        var67 += 810876314 & 810876314 ^ 810876315;
                                        break label106;
                                      }

                                      var16 = (-108297550 << -108297550 | 285635731) & 2102820763;
                                      break;
                                    case -172352993:
                                      var59 = var91;
                                      if (var67 < ((841168240 | -197118359 >> -197118359) ^ -313985)) {
                                        int var114 = /* jnt */
                                          + '-'
                                          + 88;
                                        int var139 = (var114 & 49152) >> 14;
                                        int var115 = (var114 & 49152) >> 14 | var114 << 2;
                                        int var140 = (((var114 & 49152) >> 14 | var114 << 2) & 57344) >> 13;
                                        char var116 = (char)((((var139 | var114 << 2) & 57344) >> 13 | ((var114 & 49152) >> 14 | var114 << 2) << 3) + 227);
                                        /* jnt */((var140 | var115 << 3) + 227)
                                        );
                                        var67 += (-986068293 & -673195537 | 0) & 38147841;
                                        break label104;
                                      }

                                      var16 = (-1079274509 | 273849003 | 148120644) & 1559522764;
                                      break;
                                    case 1248705100:
                                    default:
                                      var59 = var91;
                                      if (var67 < (-764736626 << -413216358 ^ 939524099)) {
                                        int var110 = /* jnt */
                                          + 168
                                          - 248
                                          - 234
                                          + 79;
                                        char var111 = (char)((var110 & 61440) >> 12 | var110 << 4);
                                        /* jnt */((var110 & 61440) >> 12 | var110 << 4)
                                        );
                                        var67 += (-1096712853 * 941709436 | 1) & -1814087679;
                                        continue label111;
                                      }

                                      var16 = -1052448663 >>> -258655827 ^ 980052552;
                                  }

                                  switch ((var16 - 431428669 ^ 918067403 ^ 900738835) - 1267127594 - 753356012 + 1488628567) {
                                    case -590061361:
                                      var55 = /* jnt */
                                        ),
                                        var14
                                      );
                                      var67 = 88775122 ^ -1065657396 ^ -986594786;
                                      var91 = (StringBuilder)/* jnt */;
                                      break;
                                    case -528337000:
                                    default:
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
                                          var16 = (276364569 * -1857348207 | 45666608) & 381541872;
                                        } catch (Exception var18) {
                                          var31 = var18;
                                          boolean var38 = false;
                                          break label88;
                                        }

                                        label85:
                                        while (true) {
                                          switch (var16 - 1201691855 - 1568780271 + 63073724 + 1917033260 ^ 1219324026 ^ 1223965933) {
                                            case -470181427:
                                              try {
                                                /* jnt */;
                                              } catch (Exception var17) {
                                                var31 = var17;
                                                boolean var39 = false;
                                                break label85;
                                              }

                                              var16 = (-1313085352 >> 61400403 | 11038921) & 665350857;
                                              break;
                                            case -120243612:
                                            default:
                                              break label153;
                                          }
                                        }
                                      }

                                      Exception var9 = var31;
                                      /* jnt */;
                                      break label153;
                                    case 67798315:
                                      var55 = /* jnt */
                                        ),
                                        var13
                                      );
                                      var67 = -2129422723 >>> 1194741459 ^ 4130;
                                      var91 = (StringBuilder)/* jnt */;
                                      break label106;
                                  }
                                }

                                var16 = -140062378 & -1397319401 ^ 12457488;
                              }

                              var16 = -1061069735 & -1770443428 ^ 1538966939;
                            }
                          }
                        case 782758400:
                        default:
                          /* jnt */
                                ),
                                var12
                              )
                            )
                          );
                          /* jnt */
                          );
                          var36 = /* jnt */;
                          var49 = (1966415997 >>> -1860780719 | 0) & -1725889212;
                          var59 = (StringBuilder)/* jnt */;
                      }

                      while (var49 < ((-1476453267 >>> -51183005 | 1) & -1593832329)) {
                        char var86 = /* jnt */;
                        char var89 = (char)(
                          (
                              (((((var86 & 0) >> 16 | var86 << 0) & 61440) >> 12 | ((var86 & 0) >> 16 | var86 << 0) << 4) - 24 & 63488) >> 11
                                | ((((var86 & 0) >> 16 | var86 << 0) & 61440) >> 12 | ((var86 & 0) >> 16 | var86 << 0) << 4) - 24 << 5
                            )
                            + 7
                        );
                        /* jnt */(
                            (
                                (((((var86 & 0) >> 16 | var86 << 0) & 61440) >> 12 | ((var86 & 0) >> 16 | var86 << 0) << 4) - 24 & 63488) >> 11
                                  | ((((var86 & 0) >> 16 | var86 << 0) & 61440) >> 12 | ((var86 & 0) >> 16 | var86 << 0) << 4) - 24 << 5
                              )
                              + 7
                          )
                        );
                        var49 += -1510537187 >> -1823252925 ^ -188817150;
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
                      var49 = -1119831773 * 1537823052 ^ 1390807396;
                      var59 = (StringBuilder)/* jnt */;
                    }

                    var16 = (2035094660 ^ 2035094660 | -929467590) & -119538694;
                  }
                }
              case 767652749:
              default:
                var10001 = /* jnt */
                  ),
                  var10
                );
                var49 = (2040068202 >>> -1312158851 | 0) & -2080677304;
                var59 = (StringBuilder)/* jnt */;
            }
          }

          var16 = (411850438 * (-395710451 >>> 1739053792) | -1530630116) & -54037378;
        }
      }
    }

    /* jnt */
    );
  }

  // $VF: Handled exception range with multiple entry points by splitting it
  // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
  public void gk(String var1, int var2, int var3, int var4) {
    int var13 = 689822892;
    if (/* jnt */)) {
      te var5 = (te)/* jnt */
        )
      );
      hn var6 = (hn)/* jnt */;
      int var10001 = (-188874779 - 1833427260 | 0) & 805929024;

      StringBuilder var10002;
      for (var10002 = (StringBuilder)/* jnt */;
        var10001 < ((-208649427 << 364021957 | 14) & -2131261362);
        var10001 += 898310680 + 1667568699 ^ -1729087918
      ) {
        char var40 = /* jnt */;
        char var43 = (char)(
          (
              (((((var40 & '\ufff0') >> 4 | var40 << '\f') & 0) >> 16 | ((var40 & '\ufff0') >> 4 | var40 << '\f') << 0) - 33 & 49152) >> 14
                | ((((var40 & '\ufff0') >> 4 | var40 << '\f') & 0) >> 16 | ((var40 & '\ufff0') >> 4 | var40 << '\f') << 0) - 33 << 2
            )
            - 139
        );
        /* jnt */(
            (
                (((((var40 & '\ufff0') >> 4 | var40 << '\f') & 0) >> 16 | ((var40 & '\ufff0') >> 4 | var40 << '\f') << 0) - 33 & 49152) >> 14
                  | ((((var40 & '\ufff0') >> 4 | var40 << '\f') & 0) >> 16 | ((var40 & '\ufff0') >> 4 | var40 << '\f') << 0) - 33 << 2
              )
              - 139
          )
        );
      }

      /* jnt */
      );
      String var8 = /* jnt */
          )
        )
      );
      StringBuilder var22 = (StringBuilder)/* jnt */;
      int var31 = (-105493269 >>> -105493269 | 0) & -1700773598;
      StringBuilder var45 = (StringBuilder)/* jnt */;

      label128:
      while (true) {
        var13 = (1626110306 | 1626110306) ^ 76326548;

        while (true) {
          label123: {
            switch (((var13 - 151230648 ^ 1447464139) - 1465424472 - 1257582456 ^ 1549606864) - 37082724) {
              case -1535422592:
              default:
                var10002 = var45;
                if (var31 < ((-348844913 + 1536933926 | 8) & -1205460210)) {
                  int var84 = /* jnt */ + 20 ^ 157;
                  int var131 = (var84 & 65472) >> 6;
                  int var85 = (var84 & 65472) >> 6 | var84 << 10;
                  int var132 = (((var84 & 65472) >> 6 | var84 << 10) & 63488) >> 11;
                  char var86 = (char)((((var131 | var84 << 10) & 63488) >> 11 | ((var84 & 65472) >> 6 | var84 << 10) << 5) + 249);
                  /* jnt */((var132 | var85 << 5) + 249));
                  var31 += -717731473 << -199993831 ^ -570425343;
                  break label123;
                }

                var13 = 1451467145 - -617880789 ^ -1631756824;
                break;
              case 878528401:
                var10002 = var45;
                if (var31 < (-684315575 * 1562341527 ^ -2043998418)) {
                  int var61 = /* jnt */ + '<';
                  int var10006 = (var61 & 49152) >> 14;
                  int var62 = (var61 & 49152) >> 14 | var61 << 2;
                  int var117 = (((var61 & 49152) >> 14 | var61 << 2) & 32768) >> 15;
                  char var63 = (char)((((var10006 | var61 << 2) & 32768) >> 15 | ((var61 & 49152) >> 14 | var61 << 2) << 1) + 153 ^ 66);
                  /* jnt */((var117 | var62 << 1) + 153 ^ 66)
                  );
                  var31 += -46227715 >>> 886484156 ^ 14;
                  continue label128;
                }

                var13 = 260690429 * -445245999 ^ 1045655533;
            }

            switch ((var13 ^ 1185805856) - 211664969 - 1966866703 - 247186087 + 738779174 - 767903054) {
              case -816791527:
              default:
                var22 = /* jnt */
                  ),
                  var8
                );
                var31 = -2035682244 >> -1143310889 ^ -243;
                var45 = (StringBuilder)/* jnt */;
                break;
              case 284503151:
                /* jnt */
                    )
                  )
                );
                String var9 = /* jnt */
                  )
                );
                StringBuilder var23 = (StringBuilder)/* jnt */;
                int var33 = -573708490 - 931714535 ^ -1505423025;

                for (var45 = (StringBuilder)/* jnt */;
                  var33 < (-661240891 * -661240891 ^ -322128497);
                  var33 += (1666585111 >>> 1938731014 | 1) & -167771229
                ) {
                  int var67 = /* jnt */ - 211;
                  int var118 = (var67 & 61440) >> 12;
                  int var68 = (var67 & 61440) >> 12 | var67 << 4;
                  int var119 = (((var67 & 61440) >> 12 | var67 << 4) & 57344) >> 13;
                  var67 = ((var118 | var67 << 4) & 57344) >> 13 | ((var67 & 61440) >> 12 | var67 << 4) << 3;
                  var118 = ((var119 | var68 << 3) & 65528) >> 3;
                  int var70 = ((var119 | var68 << 3) & 65528) >> 3 | var67 << 13;
                  int var121 = ((((var119 | var68 << 3) & 65528) >> 3 | var67 << 13) & 65535) >> 0;
                  char var71 = (char)(((var118 | var67 << 13) & 65535) >> 0 | (((var119 | var68 << 3) & 65528) >> 3 | var67 << 13) << 16);
                  /* jnt */(var121 | var70 << 16));
                }

                /* jnt */
                      ),
                      var9
                    )
                  )
                );
                /* jnt */
                );
                LocalTime var24 = /* jnt */;
                int var35 = 621767163 + -2014677664 ^ -1392910501;

                for (var45 = (StringBuilder)/* jnt */;
                  var35 < ((1363838884 | 2039153049) ^ 2043381688);
                  var35 += 1338679685 * (-641823961 >> -641823961) ^ 927388271
                ) {
                  char var74 = /* jnt */;
                  char var77 = (char)(
                    (
                          ((((((var74 & '\ufff8') >> 3 | var74 << '\r') ^ 104) & 32768) >> 15 | (((var74 & '\ufff8') >> 3 | var74 << '\r') ^ 104) << 1) ^ 64)
                            & 65534
                        )
                        >> 1
                      | ((((((var74 & '\ufff8') >> 3 | var74 << '\r') ^ 104) & 32768) >> 15 | (((var74 & '\ufff8') >> 3 | var74 << '\r') ^ 104) << 1) ^ 64)
                        << 15
                  );
                  /* jnt */(
                      (
                            ((((((var74 & '\ufff8') >> 3 | var74 << '\r') ^ 104) & 32768) >> 15 | (((var74 & '\ufff8') >> 3 | var74 << '\r') ^ 104) << 1) ^ 64)
                              & 65534
                          )
                          >> 1
                        | ((((((var74 & '\ufff8') >> 3 | var74 << '\r') ^ 104) & 32768) >> 15 | (((var74 & '\ufff8') >> 3 | var74 << '\r') ^ 104) << 1) ^ 64)
                          << 15
                    )
                  );
                }

                /* jnt */
                    )
                  ),
                  null
                );
                var10001 = (-242767818 >> 1597511106 | 0) & 42991808;

                for (var10002 = (StringBuilder)/* jnt */;
                  var10001 < ((-1367858788 | 1328626402 << 1328626402 | 0) & 1090589800);
                  var10001 += (1250908743 * 890431386 | 1) & -1773961143
                ) {
                  int var53 = /* jnt */ + 'D' - 148 - 246 ^ 10;
                  char var54 = (char)((var53 & 0) >> 16 | var53 << 0);
                  /* jnt */((var53 & 0) >> 16 | var53 << 0)
                  );
                }

                String var27 = /* jnt */;
                int var11 = var3;
                int var10 = var2;
                var10002 = (StringBuilder)/* jnt */;
                int var56 = (1917705972 - 638980454 | 0) & 54534688;
                StringBuilder var80 = (StringBuilder)/* jnt */;

                label92:
                while (true) {
                  var13 = (1368717186 ^ -2109648516 | 159736096) & 765453233;

                  while (true) {
                    label87:
                    while (true) {
                      label85: {
                        switch ((var13 + 1159776178 - 235907079 ^ 2051897654 ^ 1458484226) + 1587802031 ^ 2024162136) {
                          case -1307640506:
                            var45 = var80;
                            if (var56 < (-1110162456 * (-1110162456 << 848810621) ^ 3)) {
                              char var112 = /* jnt */;
                              char var113 = (char)((((var112 & '\uffff') >> 0 | var112 << 16) - 149 ^ 92) - 112 - 137);
                              /* jnt */((((var112 & '\uffff') >> 0 | var112 << 16) - 149 ^ 92) - 112 - 137)
                              );
                              var56 += 1505986629 - 658532834 ^ 847453794;
                              continue label92;
                            }

                            var13 = (-704867747 | 2032426763) ^ 491662331;
                            break;
                          case 773495608:
                            var45 = var80;
                            if (var56 < (1324313943 - -1228232769 ^ -1742420580)) {
                              int var106 = /* jnt */ + 242 - 160;
                              char var109 = (char)(
                                (((((var106 & 63488) >> 11 | var106 << 5) & 61440) >> 12 | ((var106 & 63488) >> 11 | var106 << 5) << 4) & 65520) >> 4
                                  | ((((var106 & 63488) >> 11 | var106 << 5) & 61440) >> 12 | ((var106 & 63488) >> 11 | var106 << 5) << 4) << 12
                              );
                              /* jnt */(
                                  (((((var106 & 63488) >> 11 | var106 << 5) & 61440) >> 12 | ((var106 & 63488) >> 11 | var106 << 5) << 4) & 65520) >> 4
                                    | ((((var106 & 63488) >> 11 | var106 << 5) & 61440) >> 12 | ((var106 & 63488) >> 11 | var106 << 5) << 4) << 12
                                )
                              );
                              var56 += -591505803 >>> -1496803949 ^ 7062;
                              break label85;
                            }

                            var13 = 2138909023 + (-1070718619 | 2138909023 - -1070718619) ^ -1444976939;
                            break;
                          case 2089118696:
                          default:
                            var45 = var80;
                            if (var56 < (-1576953271 * -1576953271 ^ -175249195)) {
                              int var101 = (/* jnt */ ^ 0 ^ 44) - 251;
                              int var10007 = (var101 & 49152) >> 14;
                              int var102 = (var101 & 49152) >> 14 | var101 << 2;
                              int var133 = (((var101 & 49152) >> 14 | var101 << 2) & 65024) >> 9;
                              char var103 = (char)(((var10007 | var101 << 2) & 65024) >> 9 | ((var101 & 49152) >> 14 | var101 << 2) << 7);
                              /* jnt */(var133 | var102 << 7)
                              );
                              var56 += 466566747 & 1620178914 ^ 8468035;
                              break label87;
                            }

                            var13 = -1039274307 * (-1646715132 - -1646715132) ^ -2078715342;
                        }

                        switch (((var13 - 339528864 ^ 1535507647) + 503331114 ^ 1146552659 ^ 1801044677) - 2050900076) {
                          case 51982677:
                            var10002 = /* jnt */
                              ),
                              var11
                            );
                            var56 = 328120735 & 771043737 ^ 25440665;
                            var80 = (StringBuilder)/* jnt */;
                            break;
                          case 507432060:
                          default:
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
                                var13 = (1454040121 ^ -1371430287 >>> 1454040121 | 223482516) & 1306212245;
                              } catch (Exception var15) {
                                var10000 = var15;
                                boolean var28 = false;
                                break label69;
                              }

                              label66:
                              while (true) {
                                switch (((var13 + 408212805 ^ 1840181992) + 812013660 + 83473748 ^ 1866931481) + 478353846) {
                                  case 5592440:
                                    break label128;
                                  case 1277703598:
                                  default:
                                    try {
                                      /* jnt */;
                                    } catch (Exception var14) {
                                      var10000 = var14;
                                      boolean var29 = false;
                                      break label66;
                                    }

                                    var13 = (-266739452 - 1239305859 | 541394046) & 717690750;
                                }
                              }
                            }

                            Exception var7 = var10000;
                            /* jnt */;
                            break label128;
                          case 549228039:
                            var10002 = /* jnt */
                              ),
                              var10
                            );
                            var56 = -1763161914 ^ 703732125 >>> 703732125 ^ -1763161913;
                            var80 = (StringBuilder)/* jnt */;
                            break label87;
                        }
                      }

                      var13 = 1954922708 << (894566483 & 1954922708) ^ 1568540122;
                    }

                    var13 = (333522285 & 1834323776 | 1389089930) & -152043874;
                  }
                }
            }
          }

          var13 = (-853483644 - -1749554634 | -998235773) & -561700441;
        }
      }
    }

    /* jnt */
    );
  }

  public boolean ke() {
    return null /* jnt:encrypted */;
  }

  static {
    Loader.init(nc.class);
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (((var10 - 903730544 + 1547485192 ^ 654899446) + 611859090 ^ 2071760278) + 89556751 + 238831426 ^ 974638101) + 1653860401;
    MethodHandle var10000 = xiz[(((var10 - 903730544 + 1547485192 ^ 654899446) + 611859090 ^ 2071760278) + 89556751 + 238831426 ^ 974638101) + 1653860401
      ^ 782042810];
    if (xiz[var10001 ^ 782042810] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (-1789931217 >> 1763074113 | 0) & 558367232; var23 < var13.length(); var23 += 1920141767 << 2058507432 ^ 1930020609) {
        int var42 = var13.charAt(var23) + '(' ^ 123;
        int var10004 = (var42 & 61440) >> 12;
        int var43 = (((var42 & 61440) >> 12 | var42 << 4) ^ 35 ^ 181) - 195 ^ 177;
        int var91 = (((((var42 & 61440) >> 12 | var42 << 4) ^ 35 ^ 181) - 195 ^ 177) & 65532) >> 2;
        char var44 = (char)(
          (((((var10004 | var42 << 4) ^ 35 ^ 181) - 195 ^ 177) & 65532) >> 2 | ((((var42 & 61440) >> 12 | var42 << 4) ^ 35 ^ 181) - 195 ^ 177) << 14)
            - 144
            + 152
        );
        var13.setCharAt(var23, (char)((var91 | var43 << 14) - 144 + 152));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (-1644897881 << (-1042559863 | 906323112) | 0) & 374116591;
        var29 < var16.length();
        var29 += -1046804340 << (-707376325 << 1724065136) ^ -1046804339
      ) {
        char var49 = var16.charAt(var29);
        char var56 = (char)(
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
                                                                ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1)
                                                                  & 61440
                                                              )
                                                              >> 12
                                                            | ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1)
                                                              << 4
                                                        )
                                                        + 115
                                                      & 65528
                                                  )
                                                  >> 3
                                                | (
                                                      (((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) & 61440)
                                                          >> 12
                                                        | ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) << 4
                                                    )
                                                    + 115
                                                  << 13
                                            )
                                            & 65520
                                        )
                                        >> 4
                                      | (
                                          (
                                                (
                                                      (((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) & 61440)
                                                          >> 12
                                                        | ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) << 4
                                                    )
                                                    + 115
                                                  & 65528
                                              )
                                              >> 3
                                            | (
                                                  (((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) & 61440)
                                                      >> 12
                                                    | ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) << 4
                                                )
                                                + 115
                                              << 13
                                        )
                                        << 12
                                  )
                                  - 54
                                & 65520
                            )
                            >> 4
                          | (
                                (
                                      (
                                          (
                                                (
                                                      (((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) & 61440)
                                                          >> 12
                                                        | ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) << 4
                                                    )
                                                    + 115
                                                  & 65528
                                              )
                                              >> 3
                                            | (
                                                  (((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) & 61440)
                                                      >> 12
                                                    | ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) << 4
                                                )
                                                + 115
                                              << 13
                                        )
                                        & 65520
                                    )
                                    >> 4
                                  | (
                                      (
                                            (
                                                  (((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) & 61440)
                                                      >> 12
                                                    | ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) << 4
                                                )
                                                + 115
                                              & 65528
                                          )
                                          >> 3
                                        | (
                                              (((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) & 61440) >> 12
                                                | ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) << 4
                                            )
                                            + 115
                                          << 13
                                    )
                                    << 12
                              )
                              - 54
                            << 12
                      )
                      & 65535
                  )
                  >> 0
                | (
                    (
                          (
                                (
                                      (
                                          (
                                                (
                                                      (((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) & 61440)
                                                          >> 12
                                                        | ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) << 4
                                                    )
                                                    + 115
                                                  & 65528
                                              )
                                              >> 3
                                            | (
                                                  (((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) & 61440)
                                                      >> 12
                                                    | ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) << 4
                                                )
                                                + 115
                                              << 13
                                        )
                                        & 65520
                                    )
                                    >> 4
                                  | (
                                      (
                                            (
                                                  (((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) & 61440)
                                                      >> 12
                                                    | ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) << 4
                                                )
                                                + 115
                                              & 65528
                                          )
                                          >> 3
                                        | (
                                              (((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) & 61440) >> 12
                                                | ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) << 4
                                            )
                                            + 115
                                          << 13
                                    )
                                    << 12
                              )
                              - 54
                            & 65520
                        )
                        >> 4
                      | (
                            (
                                  (
                                      (
                                            (
                                                  (((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) & 61440)
                                                      >> 12
                                                    | ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) << 4
                                                )
                                                + 115
                                              & 65528
                                          )
                                          >> 3
                                        | (
                                              (((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) & 61440) >> 12
                                                | ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) << 4
                                            )
                                            + 115
                                          << 13
                                    )
                                    & 65520
                                )
                                >> 4
                              | (
                                  (
                                        (
                                              (((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) & 61440) >> 12
                                                | ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) << 4
                                            )
                                            + 115
                                          & 65528
                                      )
                                      >> 3
                                    | (
                                          (((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) & 61440) >> 12
                                            | ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) << 4
                                        )
                                        + 115
                                      << 13
                                )
                                << 12
                          )
                          - 54
                        << 12
                  )
                  << 16
            )
            ^ 119
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
                                                      (
                                                            (
                                                                  ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1)
                                                                    & 61440
                                                                )
                                                                >> 12
                                                              | ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1)
                                                                << 4
                                                          )
                                                          + 115
                                                        & 65528
                                                    )
                                                    >> 3
                                                  | (
                                                        (((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) & 61440)
                                                            >> 12
                                                          | ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) << 4
                                                      )
                                                      + 115
                                                    << 13
                                              )
                                              & 65520
                                          )
                                          >> 4
                                        | (
                                            (
                                                  (
                                                        (((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) & 61440)
                                                            >> 12
                                                          | ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) << 4
                                                      )
                                                      + 115
                                                    & 65528
                                                )
                                                >> 3
                                              | (
                                                    (((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) & 61440)
                                                        >> 12
                                                      | ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) << 4
                                                  )
                                                  + 115
                                                << 13
                                          )
                                          << 12
                                    )
                                    - 54
                                  & 65520
                              )
                              >> 4
                            | (
                                  (
                                        (
                                            (
                                                  (
                                                        (((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) & 61440)
                                                            >> 12
                                                          | ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) << 4
                                                      )
                                                      + 115
                                                    & 65528
                                                )
                                                >> 3
                                              | (
                                                    (((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) & 61440)
                                                        >> 12
                                                      | ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) << 4
                                                  )
                                                  + 115
                                                << 13
                                          )
                                          & 65520
                                      )
                                      >> 4
                                    | (
                                        (
                                              (
                                                    (((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) & 61440)
                                                        >> 12
                                                      | ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) << 4
                                                  )
                                                  + 115
                                                & 65528
                                            )
                                            >> 3
                                          | (
                                                (((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) & 61440) >> 12
                                                  | ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) << 4
                                              )
                                              + 115
                                            << 13
                                      )
                                      << 12
                                )
                                - 54
                              << 12
                        )
                        & 65535
                    )
                    >> 0
                  | (
                      (
                            (
                                  (
                                        (
                                            (
                                                  (
                                                        (((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) & 61440)
                                                            >> 12
                                                          | ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) << 4
                                                      )
                                                      + 115
                                                    & 65528
                                                )
                                                >> 3
                                              | (
                                                    (((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) & 61440)
                                                        >> 12
                                                      | ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) << 4
                                                  )
                                                  + 115
                                                << 13
                                          )
                                          & 65520
                                      )
                                      >> 4
                                    | (
                                        (
                                              (
                                                    (((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) & 61440)
                                                        >> 12
                                                      | ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) << 4
                                                  )
                                                  + 115
                                                & 65528
                                            )
                                            >> 3
                                          | (
                                                (((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) & 61440) >> 12
                                                  | ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) << 4
                                              )
                                              + 115
                                            << 13
                                      )
                                      << 12
                                )
                                - 54
                              & 65520
                          )
                          >> 4
                        | (
                              (
                                    (
                                        (
                                              (
                                                    (((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) & 61440)
                                                        >> 12
                                                      | ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) << 4
                                                  )
                                                  + 115
                                                & 65528
                                            )
                                            >> 3
                                          | (
                                                (((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) & 61440) >> 12
                                                  | ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) << 4
                                              )
                                              + 115
                                            << 13
                                      )
                                      & 65520
                                  )
                                  >> 4
                                | (
                                    (
                                          (
                                                (((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) & 61440) >> 12
                                                  | ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) << 4
                                              )
                                              + 115
                                            & 65528
                                        )
                                        >> 3
                                      | (
                                            (((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) & 61440) >> 12
                                              | ((((var49 & '￠') >> 5 | var49 << 11) & 32768) >> 15 | ((var49 & '￠') >> 5 | var49 << 11) << 1) << 4
                                          )
                                          + 115
                                        << 13
                                  )
                                  << 12
                            )
                            - 54
                          << 12
                    )
                    << 16
              )
              ^ 119
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), nc.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (1840387035 ^ 2134852449 | 0) & 1677732417; var35 < var19.length(); var35 += (-275205134 | -1220449910 | 131965242 | 1) & 2097153) {
        int var61 = var19.charAt(var35);
        int var99 = (var61 & 65024) >> 9;
        int var62 = ((var61 & 65024) >> 9 | var61 << 7) + 107;
        int var100 = (((var61 & 65024) >> 9 | var61 << 7) + 107 & 65408) >> 7;
        var61 = ((var99 | var61 << 7) + 107 & 65408) >> 7 | ((var61 & 65024) >> 9 | var61 << 7) + 107 << 9;
        var99 = ((var100 | var62 << 9) & 64512) >> 10;
        int var64 = ((((var100 | var62 << 9) & 64512) >> 10 | var61 << 6) ^ 125) + 169 ^ 24;
        int var102 = ((((((var100 | var62 << 9) & 64512) >> 10 | var61 << 6) ^ 125) + 169 ^ 24) & 65408) >> 7;
        var61 = ((((var99 | var61 << 6) ^ 125) + 169 ^ 24) & 65408) >> 7 | (((((var100 | var62 << 9) & 64512) >> 10 | var61 << 6) ^ 125) + 169 ^ 24) << 9;
        var99 = ((var102 | var64 << 9) & 65534) >> 1;
        int var66 = ((var102 | var64 << 9) & 65534) >> 1 | var61 << 15;
        int var104 = ((((var102 | var64 << 9) & 65534) >> 1 | var61 << 15) & 32768) >> 15;
        char var67 = (char)(((var99 | var61 << 15) & 32768) >> 15 | (((var102 | var64 << 9) & 65534) >> 1 | var61 << 15) << 1);
        var19.setCharAt(var35, (char)(var104 | var66 << 1));
      }

      Class var7 = Class.forName(var19.toString(), false, nc.class.getClassLoader());
      switch (((var4 ^ 1015391082 ^ 669786468) - 1120012824 + 1524674292 - 1826563493 - 1516338428 ^ 164204016) - 1110835184 + 1446596719 + 1444724114) {
        case 1492605729:
        case 1864009245:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1522606634:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 1846688919:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 2006618144:
          var10000 = var0.findSpecial(var7, var5, var6, nc.class);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    xiz[(((var10 - 903730544 + 1547485192 ^ 654899446) + 611859090 ^ 2071760278) + 89556751 + 238831426 ^ 974638101) + 1653860401 ^ 782042810] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 ^ 1655253174 ^ 27967867) + 1984233519 + 1639300553 + 948019387 - 834152642 + 27217642 ^ 209736517) + 1098775327;
    MethodHandle var10000 = xiz[((var10 ^ 1655253174 ^ 27967867) + 1984233519 + 1639300553 + 948019387 - 834152642 + 27217642 ^ 209736517)
      + 1098775327
      + 640535071];
    if (xiz[var10001 + 640535071] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (-1962866252 | -1465807213 & -1962866252) ^ -1962866252; var24 < var14.length(); var24 += (316725217 & 316725217 | 0) & 135661581) {
        int var43 = var14.charAt(var24);
        int var10004 = (var43 & 57344) >> 13;
        int var44 = (var43 & 57344) >> 13 | var43 << 3;
        int var90 = (((var43 & 57344) >> 13 | var43 << 3) & 65408) >> 7;
        var43 = (((var10004 | var43 << 3) & 65408) >> 7 | ((var43 & 57344) >> 13 | var43 << 3) << 9) ^ 69;
        var10004 = (((var90 | var44 << 9) ^ 69) & 65532) >> 2;
        int var46 = ((((var90 | var44 << 9) ^ 69) & 65532) >> 2 | var43 << 14) ^ 51;
        int var92 = ((((((var90 | var44 << 9) ^ 69) & 65532) >> 2 | var43 << 14) ^ 51) & 65520) >> 4;
        var43 = ((((var10004 | var43 << 14) ^ 51) & 65520) >> 4 | (((((var90 | var44 << 9) ^ 69) & 65532) >> 2 | var43 << 14) ^ 51) << 12) + 186 - 175;
        var10004 = ((var92 | var46 << 12) + 186 - 175 & 57344) >> 13;
        int var48 = ((var92 | var46 << 12) + 186 - 175 & 57344) >> 13 | var43 << 3;
        int var94 = ((((var92 | var46 << 12) + 186 - 175 & 57344) >> 13 | var43 << 3) & 49152) >> 14;
        char var49 = (char)(((var10004 | var43 << 3) & 49152) >> 14 | (((var92 | var46 << 12) + 186 - 175 & 57344) >> 13 | var43 << 3) << 2);
        var14.setCharAt(var24, (char)(var94 | var48 << 2));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = 743924833 ^ 1276202580 ^ 1615211061; var30 < var17.length(); var30 += (1072794647 + -798728039 | 1) & 111284737) {
        char var54 = var17.charAt(var30);
        char var57 = (char)(
          (
              (
                    ((((((var54 & 'ﾀ') >> 7 | var54 << '\t') - 63 & 32768) >> 15 | ((var54 & 'ﾀ') >> 7 | var54 << '\t') - 63 << 1) + 133 ^ 252) + 124 ^ 19)
                        - 253
                      & 61440
                  )
                  >> 12
                | ((((((var54 & 'ﾀ') >> 7 | var54 << '\t') - 63 & 32768) >> 15 | ((var54 & 'ﾀ') >> 7 | var54 << '\t') - 63 << 1) + 133 ^ 252) + 124 ^ 19) - 253
                  << 4
            )
            - 192
        );
        var17.setCharAt(
          var30,
          (char)(
            (
                (
                      ((((((var54 & 'ﾀ') >> 7 | var54 << '\t') - 63 & 32768) >> 15 | ((var54 & 'ﾀ') >> 7 | var54 << '\t') - 63 << 1) + 133 ^ 252) + 124 ^ 19)
                          - 253
                        & 61440
                    )
                    >> 12
                  | ((((((var54 & 'ﾀ') >> 7 | var54 << '\t') - 63 & 32768) >> 15 | ((var54 & 'ﾀ') >> 7 | var54 << '\t') - 63 << 1) + 133 ^ 252) + 124 ^ 19)
                      - 253
                    << 4
              )
              - 192
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, nc.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = -1758453508 ^ 1842843491 ^ -85479521; var36 < var20.length(); var36 += (-1888641988 << 1518236572 | 1) & 64596405) {
        char var62 = var20.charAt(var36);
        char var67 = (char)(
          (
                (
                    (
                          (
                                (
                                      (
                                          (
                                                (
                                                    ((((var62 & '\ufff8') >> 3 | var62 << '\r') ^ 150) & 32768) >> 15
                                                      | (((var62 & '\ufff8') >> 3 | var62 << '\r') ^ 150) << 1
                                                  )
                                                  & 65408
                                              )
                                              >> 7
                                            | (
                                                ((((var62 & '\ufff8') >> 3 | var62 << '\r') ^ 150) & 32768) >> 15
                                                  | (((var62 & '\ufff8') >> 3 | var62 << '\r') ^ 150) << 1
                                              )
                                              << 9
                                        )
                                        ^ 97
                                    )
                                    + 24
                                  ^ 211
                              )
                              - 26
                            & 65534
                        )
                        >> 1
                      | (
                            (
                                  (
                                      (
                                            (
                                                ((((var62 & '\ufff8') >> 3 | var62 << '\r') ^ 150) & 32768) >> 15
                                                  | (((var62 & '\ufff8') >> 3 | var62 << '\r') ^ 150) << 1
                                              )
                                              & 65408
                                          )
                                          >> 7
                                        | (
                                            ((((var62 & '\ufff8') >> 3 | var62 << '\r') ^ 150) & 32768) >> 15
                                              | (((var62 & '\ufff8') >> 3 | var62 << '\r') ^ 150) << 1
                                          )
                                          << 9
                                    )
                                    ^ 97
                                )
                                + 24
                              ^ 211
                          )
                          - 26
                        << 15
                  )
                  & 65532
              )
              >> 2
            | (
                (
                      (
                            (
                                  (
                                      (
                                            (
                                                ((((var62 & '\ufff8') >> 3 | var62 << '\r') ^ 150) & 32768) >> 15
                                                  | (((var62 & '\ufff8') >> 3 | var62 << '\r') ^ 150) << 1
                                              )
                                              & 65408
                                          )
                                          >> 7
                                        | (
                                            ((((var62 & '\ufff8') >> 3 | var62 << '\r') ^ 150) & 32768) >> 15
                                              | (((var62 & '\ufff8') >> 3 | var62 << '\r') ^ 150) << 1
                                          )
                                          << 9
                                    )
                                    ^ 97
                                )
                                + 24
                              ^ 211
                          )
                          - 26
                        & 65534
                    )
                    >> 1
                  | (
                        (
                              (
                                  (
                                        (
                                            ((((var62 & '\ufff8') >> 3 | var62 << '\r') ^ 150) & 32768) >> 15
                                              | (((var62 & '\ufff8') >> 3 | var62 << '\r') ^ 150) << 1
                                          )
                                          & 65408
                                      )
                                      >> 7
                                    | (
                                        ((((var62 & '\ufff8') >> 3 | var62 << '\r') ^ 150) & 32768) >> 15
                                          | (((var62 & '\ufff8') >> 3 | var62 << '\r') ^ 150) << 1
                                      )
                                      << 9
                                )
                                ^ 97
                            )
                            + 24
                          ^ 211
                      )
                      - 26
                    << 15
              )
              << 14
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
                                                      ((((var62 & '\ufff8') >> 3 | var62 << '\r') ^ 150) & 32768) >> 15
                                                        | (((var62 & '\ufff8') >> 3 | var62 << '\r') ^ 150) << 1
                                                    )
                                                    & 65408
                                                )
                                                >> 7
                                              | (
                                                  ((((var62 & '\ufff8') >> 3 | var62 << '\r') ^ 150) & 32768) >> 15
                                                    | (((var62 & '\ufff8') >> 3 | var62 << '\r') ^ 150) << 1
                                                )
                                                << 9
                                          )
                                          ^ 97
                                      )
                                      + 24
                                    ^ 211
                                )
                                - 26
                              & 65534
                          )
                          >> 1
                        | (
                              (
                                    (
                                        (
                                              (
                                                  ((((var62 & '\ufff8') >> 3 | var62 << '\r') ^ 150) & 32768) >> 15
                                                    | (((var62 & '\ufff8') >> 3 | var62 << '\r') ^ 150) << 1
                                                )
                                                & 65408
                                            )
                                            >> 7
                                          | (
                                              ((((var62 & '\ufff8') >> 3 | var62 << '\r') ^ 150) & 32768) >> 15
                                                | (((var62 & '\ufff8') >> 3 | var62 << '\r') ^ 150) << 1
                                            )
                                            << 9
                                      )
                                      ^ 97
                                  )
                                  + 24
                                ^ 211
                            )
                            - 26
                          << 15
                    )
                    & 65532
                )
                >> 2
              | (
                  (
                        (
                              (
                                    (
                                        (
                                              (
                                                  ((((var62 & '\ufff8') >> 3 | var62 << '\r') ^ 150) & 32768) >> 15
                                                    | (((var62 & '\ufff8') >> 3 | var62 << '\r') ^ 150) << 1
                                                )
                                                & 65408
                                            )
                                            >> 7
                                          | (
                                              ((((var62 & '\ufff8') >> 3 | var62 << '\r') ^ 150) & 32768) >> 15
                                                | (((var62 & '\ufff8') >> 3 | var62 << '\r') ^ 150) << 1
                                            )
                                            << 9
                                      )
                                      ^ 97
                                  )
                                  + 24
                                ^ 211
                            )
                            - 26
                          & 65534
                      )
                      >> 1
                    | (
                          (
                                (
                                    (
                                          (
                                              ((((var62 & '\ufff8') >> 3 | var62 << '\r') ^ 150) & 32768) >> 15
                                                | (((var62 & '\ufff8') >> 3 | var62 << '\r') ^ 150) << 1
                                            )
                                            & 65408
                                        )
                                        >> 7
                                      | (
                                          ((((var62 & '\ufff8') >> 3 | var62 << '\r') ^ 150) & 32768) >> 15
                                            | (((var62 & '\ufff8') >> 3 | var62 << '\r') ^ 150) << 1
                                        )
                                        << 9
                                  )
                                  ^ 97
                              )
                              + 24
                            ^ 211
                        )
                        - 26
                      << 15
                )
                << 14
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), nc.class.getClassLoader()).returnType();
      switch ((((var4 - 1821082597 - 1406306516 ^ 1606748902) + 337391073 ^ 140507119) + 1139724862 ^ 924870521) + 855731706 - 2027788539 ^ 1326056880) {
        case 166596490:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 871223494:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 943188999:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 2015616538:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      xiz[((var10 ^ 1655253174 ^ 27967867) + 1984233519 + 1639300553 + 948019387 - 834152642 + 27217642 ^ 209736517) + 1098775327 + 640535071] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }

  public static native void guard();
}
