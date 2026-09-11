// KryptonPlus Module: AntiCheat
// Original class: jr
// Status: PARTIAL - JNT native encryption (strings in jnt.so)


import dev.krypton.jnt3.Loader;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.function.BiFunction;
import net.minecraft.PlayerEntity;
import net.minecraft.ClientWorld;

public class AntiCheat extends np {
  public rt llx;
  public rt bmg;
  public rt lsk;
  public kc bmeb;
  public kc ie;
  public kc adm;
  public kc qie;
  public kc twj;
  public ConcurrentHashMap fqx;
  public ConcurrentHashMap roe;
  public Set js;
  public Set tl;
  public ConcurrentHashMap cqb;
  public ConcurrentHashMap buv;
  public ConcurrentHashMap cgk;
  public ExecutorService kk;
  // [JNT] MethodHandle dispatch table (removed)
  public jr() {
    int var10001 = (504399746 + -40612861 | 0) & -1071962064;

    StringBuilder var10002;
    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < (-1365066040 * 1533999679 ^ -95665368);
      var10001 += (-1467501921 ^ 1016880096 | 1) & 21234817
    ) {
      int var44 = /* jnt */
        + 'y'
        - 98
        + 138;
      int var10005 = (var44 & 32768) >> 15;
      int var45 = (var44 & 32768) >> 15 | var44 << 1;
      int var136 = (((var44 & 32768) >> 15 | var44 << 1) & 65472) >> 6;
      char var46 = (char)(((var10005 | var44 << 1) & 65472) >> 6 | ((var44 & 32768) >> 15 | var44 << 1) << 10);
      /* jnt */(var136 | var45 << 10)
      );
    }

    String var2 = /* jnt */;
    int var22 = -164639737 << 248520938 ^ -1087366144;

    StringBuilder var48;
    for (var48 = (StringBuilder)/* jnt */;
      var22 < ((1326017080 * -519086647 | 7) & 270090831);
      var22 += (-748177094 & 1945174818 | 1) & 9720349
    ) {
      char var102 = /* jnt */;
      int var10006 = (var102 & '\ue000') >> 13;
      int var103 = (var102 & '\ue000') >> 13 | var102 << 3;
      int var163 = (((var102 & '\ue000') >> 13 | var102 << 3) & 65472) >> 6;
      var102 = (char)((((var10006 | var102 << 3) & 65472) >> 6 | ((var102 & '\ue000') >> 13 | var102 << 3) << 10) - 61 + 161 - 187);
      /* jnt */((var163 | var103 << 10) - 61 + 161 - 187)
      );
    }

    super(
      var2,
      /* jnt */,
      -1,
      null /* jnt:encrypted */
    );
    var10001 = -250878771 ^ (-437750596 | -437750596) ^ 350457969;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < (-1832041795 + 383961125 ^ -1448080655);
      var10001 += (-570837418 >>> (871298145 | -451487987) | 1) & -1272971261
    ) {
      int var51 = (
          (/* jnt */ ^ 29) - 179 ^ 11
        )
        - 70;
      char var52 = (char)((var51 & 65520) >> 4 | var51 << 12);
      /* jnt */((var51 & 65520) >> 4 | var51 << 12)
      );
    }

    this.llx = (rt)/* jnt */,
      2.0,
      16.0,
      4.0,
      1.0
    );
    var10001 = (-59834820 | 26019601 * (-59834820 - 26019601) | 0) & 8388608;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((-973435765 ^ -973435765 | 11) & -260435125);
      var10001 += 790661135 << 837419317 - (790661135 >>> 837419317) ^ -268435455
    ) {
      char var55 = /* jnt */;
      int var140 = (var55 & '\ufff8') >> 3;
      int var56 = ((var55 & '\ufff8') >> 3 | var55 << '\r') ^ 113;
      int var141 = ((((var55 & '\ufff8') >> 3 | var55 << '\r') ^ 113) & 65520) >> 4;
      int var57 = (((var140 | var55 << '\r') ^ 113) & 65520) >> 4 | (((var55 & '\ufff8') >> 3 | var55 << '\r') ^ 113) << 12;
      var140 = ((var141 | var56 << 12) & 65408) >> 7;
      int var58 = ((var141 | var56 << 12) & 65408) >> 7 | var57 << 9;
      int var143 = ((((var141 | var56 << 12) & 65408) >> 7 | var57 << 9) & 65504) >> 5;
      char var59 = (char)(((var140 | var57 << 9) & 65504) >> 5 | (((var141 | var56 << 12) & 65408) >> 7 | var57 << 9) << 11);
      /* jnt */(var143 | var58 << 11)
      );
    }

    rt var7 = (rt)/* jnt */,
      1.0,
      20.0,
      3.0,
      1.0
    );
    int var28 = 1103629419 + -1061879088 ^ 41750331;

    for (var48 = (StringBuilder)/* jnt */;
      var28 < ((954045073 | 954045073) ^ 954045089);
      var28 += (-1564619842 | -1564619842 | 1) & 474087489
    ) {
      int var112 = /* jnt */ - '$' - 177;
      char var113 = (char)(((var112 & 65472) >> 6 | var112 << 10) + 87 - 55);
      /* jnt */(((var112 & 65472) >> 6 | var112 << 10) + 87 - 55)
      );
    }

    this.bmg = /* jnt */
    );
    var10001 = 1548166426 ^ 1665061309 ^ 1064957095;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((1468310928 | 1468310928) ^ 1468310933);
      var10001 += (-210413151 ^ -1102390825 | 1) & -1874829567
    ) {
      char var64 = /* jnt */;
      int var145 = (var64 & '\uffff') >> 0;
      int var65 = ((var64 & '\uffff') >> 0 | var64 << 16) + 126;
      int var146 = (((var64 & '\uffff') >> 0 | var64 << 16) + 126 & 65528) >> 3;
      char var66 = (char)((((var145 | var64 << 16) + 126 & 65528) >> 3 | ((var64 & '\uffff') >> 0 | var64 << 16) + 126 << 13) - 10 - 191);
      /* jnt */((var146 | var65 << 13) - 10 - 191)
      );
    }

    this.lsk = (rt)/* jnt */,
      10.0,
      255.0,
      80.0,
      1.0
    );
    var10001 = (-454118646 | -1980931409 | 0) & 268436480;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < (84213791 & 1228395141 ^ 17104897);
      var10001 += (1940601451 >> -738795421 | 1) & -1325400013
    ) {
      char var69 = /* jnt */;
      char var72 = (char)(
        ((((((var69 & '\uffc0') >> 6 | var69 << '\n') ^ 147) + 242 & 49152) >> 14 | (((var69 & '\uffc0') >> 6 | var69 << '\n') ^ 147) + 242 << 2) & 0) >> 16
          | (((((var69 & '\uffc0') >> 6 | var69 << '\n') ^ 147) + 242 & 49152) >> 14 | (((var69 & '\uffc0') >> 6 | var69 << '\n') ^ 147) + 242 << 2) << 0
      );
      /* jnt */(
          ((((((var69 & '\uffc0') >> 6 | var69 << '\n') ^ 147) + 242 & 49152) >> 14 | (((var69 & '\uffc0') >> 6 | var69 << '\n') ^ 147) + 242 << 2) & 0) >> 16
            | (((((var69 & '\uffc0') >> 6 | var69 << '\n') ^ 147) + 242 & 49152) >> 14 | (((var69 & '\uffc0') >> 6 | var69 << '\n') ^ 147) + 242 << 2) << 0
        )
      );
    }

    this.bmeb = (kc)/* jnt */,
      true
    );
    var10001 = (-1073023940 + (66932792 >>> 329151892) | 0) & 795934848;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((2142421510 ^ 253775976 | 8) & 241238043);
      var10001 += (850104862 << 850104862 | 1) & 445665767
    ) {
      char var75 = /* jnt */;
      int var150 = (var75 & '\uf000') >> 12;
      int var76 = (var75 & '\uf000') >> 12 | var75 << 4;
      int var151 = (((var75 & '\uf000') >> 12 | var75 << 4) & 57344) >> 13;
      int var77 = ((var150 | var75 << 4) & 57344) >> 13 | ((var75 & '\uf000') >> 12 | var75 << 4) << 3;
      var150 = ((var151 | var76 << 3) & 49152) >> 14;
      int var78 = ((var151 | var76 << 3) & 49152) >> 14 | var77 << 2;
      int var153 = ((((var151 | var76 << 3) & 49152) >> 14 | var77 << 2) & 65472) >> 6;
      char var79 = (char)((((var150 | var77 << 2) & 65472) >> 6 | (((var151 | var76 << 3) & 49152) >> 14 | var77 << 2) << 10) ^ 230);
      /* jnt */((var153 | var78 << 10) ^ 230)
      );
    }

    this.ie = (kc)/* jnt */,
      true
    );
    var10001 = (46909853 & 1218997100 >> 1704546205 | 0) & -452415447;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((2080126549 & -1582697092 | 1) & -871251803);
      var10001 += -1532502238 - -1532502238 ^ 1
    ) {
      char var82 = /* jnt */;
      int var154 = (var82 & '\uffff') >> 0;
      int var83 = (((var82 & '\uffff') >> 0 | var82 << 16) ^ 238 ^ 115) + 41;
      int var155 = ((((var82 & '\uffff') >> 0 | var82 << 16) ^ 238 ^ 115) + 41 & 32768) >> 15;
      char var84 = (char)((((var154 | var82 << 16) ^ 238 ^ 115) + 41 & 32768) >> 15 | (((var82 & '\uffff') >> 0 | var82 << 16) ^ 238 ^ 115) + 41 << 1);
      /* jnt */(var155 | var83 << 1)
      );
    }

    this.adm = (kc)/* jnt */,
      true
    );
    var10001 = (328829906 | 603622810 | 0) & 1208238116;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < (1508351277 ^ 1508351277 ^ 8);
      var10001 += (-1924785288 + -498118638 | 1) & 268472385
    ) {
      int var87 = /* jnt */ - 152;
      char var90 = (char)(
        (((((var87 & 49152) >> 14 | var87 << 2) - 201 & 64512) >> 10 | ((var87 & 49152) >> 14 | var87 << 2) - 201 << 6) & 61440) >> 12
          | ((((var87 & 49152) >> 14 | var87 << 2) - 201 & 64512) >> 10 | ((var87 & 49152) >> 14 | var87 << 2) - 201 << 6) << 4
      );
      /* jnt */(
          (((((var87 & 49152) >> 14 | var87 << 2) - 201 & 64512) >> 10 | ((var87 & 49152) >> 14 | var87 << 2) - 201 << 6) & 61440) >> 12
            | ((((var87 & 49152) >> 14 | var87 << 2) - 201 & 64512) >> 10 | ((var87 & 49152) >> 14 | var87 << 2) - 201 << 6) << 4
        )
      );
    }

    this.qie = (kc)/* jnt */,
      true
    );
    var10001 = (197694776 & -1793479108 | 0) & 106049605;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < (1148803321 * 674697646 ^ -1629355473);
      var10001 += 1209111432 + 480848749 ^ 1689960180
    ) {
      char var93 = /* jnt */;
      char var96 = (char)(
        (((((var93 & '￠') >> 5 | var93 << 11) + 114 - 237 & 0) >> 16 | ((var93 & '￠') >> 5 | var93 << 11) + 114 - 237 << 0) & 49152) >> 14
          | ((((var93 & '￠') >> 5 | var93 << 11) + 114 - 237 & 0) >> 16 | ((var93 & '￠') >> 5 | var93 << 11) + 114 - 237 << 0) << 2
      );
      /* jnt */(
          (((((var93 & '￠') >> 5 | var93 << 11) + 114 - 237 & 0) >> 16 | ((var93 & '￠') >> 5 | var93 << 11) + 114 - 237 << 0) & 49152) >> 14
            | ((((var93 & '￠') >> 5 | var93 << 11) + 114 - 237 & 0) >> 16 | ((var93 & '￠') >> 5 | var93 << 11) + 114 - 237 << 0) << 2
        )
      );
    }

    kc var20 = (kc)/* jnt */,
      true
    );
    int var42 = -1815070784 * -1656489355 ^ 1004206784;

    for (var48 = (StringBuilder)/* jnt */&+\uffd8+ￜￛﾗￛￜￜ'*￣\uffd8+ￜﾗ\uffd9,)￠ￜￛﾗ\uffd9ￜ+.ￜￜ%ﾗ\uffd0ﾗ\uffe7ﾤ￭\uffe7"
      );
      var42 < (-1823689321 - -654227575 ^ -1169461728);
      var42 += (-1882161479 | -1882161479) ^ -1882161480
    ) {
      int var133 = (
          /* jnt */ - 133 ^ 242 ^ 210
        )
        + 238;
      char var134 = (char)((var133 & 65535) >> 0 | var133 << 16);
      /* jnt */((var133 & 65535) >> 0 | var133 << 16)
      );
    }

    this.twj = /* jnt */
    );
    this.fqx = (ConcurrentHashMap)/* jnt */;
    this.roe = (ConcurrentHashMap)/* jnt */;
    this.js = /* jnt */;
    this.tl = /* jnt */;
    this.cqb = (ConcurrentHashMap)/* jnt */;
    this.buv = (ConcurrentHashMap)/* jnt */;
    this.cgk = (ConcurrentHashMap)/* jnt */;
    /* jnt */,
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
    if (null /* jnt:encrypted */ != null
      && !/* jnt */
      )) {
      /* jnt */
      );
    }

    /* jnt */
    );
    /* jnt */
    );
    /* jnt */
    );
    /* jnt */
    );
    /* jnt */
    );
    /* jnt */
    );
    /* jnt */
    );
  }

  @yet
  public void pra(zb var1) {
    if (null /* jnt:encrypted */
      )
      != null) {
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
  }

  public void aep(class_2818 var1) {
    int var2 = 1612880367;
    if (null /* jnt:encrypted */ != null
      && !/* jnt */
      )) {
      var2 = -1326165444 << -1092864624 ^ -1139295407;
    } else {
      var2 = 1081164391 + 508105496 ^ 1768031536;
    }

    while (true) {
      switch ((var2 + 237350075 + 1014088638 - 999049861 ^ 1045667497) + 1385896355 + 230140076) {
        case -1869433315:
          /* jnt */,
            (Runnable)() -> {
              int var3x = -636289610;
              if (/* jnt */
                && null /* jnt:encrypted */
                  )
                  != null) {
                var3x = 2143274193 * 2143274193 ^ 433493077;
              } else {
                var3x = -1785697903 >> -1785697903 ^ -1049058072;
              }

              switch ((var3x - 171002742 + 1423244596 - 1918738424 ^ 1902737376) + 1499438823 + 1406810840) {
                case -1852757735:
                default:
                  class_1923 var2x = /* jnt */;
                  /* jnt */, var2x
                  );
                  /* jnt */;
                  return;
                case 350085573:
              }
            }
          );
          return;
        case -654070983:
          return;
        case 599278139:
        default:
          if (var1 == null) {
            return;
          }

          var2 = -958537793 ^ -1991321069 ^ -1326300449;
      }
    }
  }

  public void ew(class_1923 param1, class_2818 param2) {
    // $VF: Couldn't be decompiled
    // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
    // java.lang.RuntimeException: parsing failure!
    //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
    //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
    //
    // Bytecode:
    // 000: goto 43d
    // 003: ldc_w -83514216
    // 006: dup
    // 007: ishl
    // 008: ldc_w -1295781342
    // 00b: ixor
    // 00c: istore 11
    // 00e: goto 153
    // 011: ldc_w -1316183432
    // 014: ldc_w -1077645181
    // 017: ldc_w 1267911897
    // 01a: iand
    // 01b: iadd
    // 01c: ldc_w 1383623263
    // 01f: ixor
    // 020: istore 11
    // 022: goto 153
    // 025: iload 8
    // 027: iload 3
    // 028: if_icmpgt 4bc
    // 02b: aload 1
    // 02c: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "롾塿\ud87e\uf87f\uf87e顱塵塴硵塴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶ྵ侵\u07b5ﾴ", "䂁䒁쒁", -133408752 ]
    // 031: iload 7
    // 033: iadd
    // 034: aload 1
    // 035: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "롾塿\ud87e\uf87f\uf87e顱塵塴硵硴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶ྵ侵\u07b5ﾴ", "䂁䒁쒁", -133408755 ]
    // 03a: iload 8
    // 03c: iadd
    // 03d: invokedynamic JNT (II)Ljava/lang/Object; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 67004896, "\udd7e\uea22\uea36\uea22\uea5e\udd76", "鈲\uf332\uf332録쀲", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ䥏쥏祏楏", -1407099037 ]
    // 042: checkcast net/minecraft/class_1923
    // 045: astore 9
    // 047: aload 0
    // 048: invokedynamic JNT (Ljava/lang/Object;)Ljava/util/concurrent/ConcurrentHashMap; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "롾塼硽", "잷\u07b7", "䂁䒁킁䢂⒂碂⒂岁璂炂䒂傂岁Ⲃ岂墂Ⲃ璂梂梂㒂墂炂岁겁岂墂Ⲃ璂梂梂㒂墂炂삁⒂沂䂂풁⒂悂貁", -133408793 ]
    // 04d: aload 9
    // 04f: iload 4
    // 051: invokedynamic apply (I)Ljava/util/function/BiFunction; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;, jr.kqx (ILnet/minecraft/class_1923;Ljava/lang/Integer;)Ljava/lang/Integer;, (Lnet/minecraft/class_1923;Ljava/lang/Integer;)Ljava/lang/Integer; ]
    // 056: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\ude0a\uea3a\uea32\uea4e\uea52\uea5e\ude12", "鈲\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932줲\udc32퐲\udf32\udd32⸳\ue532\uf632퐲\udb32″\udb32\ue932⼳⸳팲혲\ue932퀲⼳⠳\udd32⸳팲⤳⠳\ue932ﰲ팲\uf032⼳⠳\udd32⸳팲⤳⠳\ue532録\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932줲\udc32퐲\udf32\udd32⸳\ue532", "壘䥊㥋䥊륎ो᥋쥊饊륎楊ꥊ륊楊ो祋祋ॊ륊᥋륎楈ꥊ륊楊ो祋祋ॊ륊᥋\ud948䥊楋\ud94a襈䥊奋", -1407099039 ]
    // 05b: pop
    // 05c: iinc 8 1
    // 05f: goto 445
    // 062: ldc_w 1904303786
    // 065: ldc_w 1834581910
    // 068: ldc_w 2071072751
    // 06b: ishr
    // 06c: isub
    // 06d: ldc_w -2109260925
    // 070: ior
    // 071: ldc_w -755515517
    // 074: iand
    // 075: istore 11
    // 077: goto 1bb
    // 07a: ldc_w 946330481
    // 07d: ldc_w -1653289927
    // 080: isub
    // 081: ldc_w 1334622656
    // 084: ior
    // 085: ldc_w -271778333
    // 088: iand
    // 089: istore 11
    // 08b: goto 0a2
    // 08e: ldc_w 1069771539
    // 091: ldc_w 345593065
    // 094: ior
    // 095: ldc_w 1109448900
    // 098: ior
    // 099: ldc_w -966665532
    // 09c: iand
    // 09d: istore 11
    // 09f: goto 0a2
    // 0a2: iload 11
    // 0a4: ldc_w 2138558247
    // 0a7: isub
    // 0a8: ldc_w 1329069060
    // 0ab: isub
    // 0ac: ldc_w 1532210414
    // 0af: ixor
    // 0b0: ldc_w 715151065
    // 0b3: ixor
    // 0b4: ldc_w 957763547
    // 0b7: isub
    // 0b8: ldc_w 2142771200
    // 0bb: ixor
    // 0bc: lookupswitch 324 4 -1734662734 520 -1352958002 674 -1298940461 853 1214292135 324
    // 0e8: iload 8
    // 0ea: iload 3
    // 0eb: if_icmpgt 2b0
    // 0ee: iload 3
    // 0ef: ineg
    // 0f0: istore 9
    // 0f2: goto 08e
    // 0f5: aload 6
    // 0f7: ifnull 34a
    // 0fa: aload 6
    // 0fc: invokedynamic JNT (Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -517434092, "\uea22\uea4a\udd92\uea32\uea4e\uea5e\uea62", "鈲録쐲", "壘䥊㥋䥊륎ो᥋쥊饊륎楉ॊ᥋", -1407099044 ]
    // 101: ifne 34a
    // 104: aload 0
    // 105: invokedynamic JNT (Ljava/lang/Object;)Ljava/util/Set; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "\uf87c\uf87f", "잷\u07b7", "䂁䒁킁䢂⒂碂⒂岁璂炂䒂傂岁\uec81㒂炂貁", -133408754 ]
    // 10a: aload 6
    // 10c: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -517434092, "\uea46\ude12\uea32\uea3a\uea56\ude12\udd82\uea3e\uea3e", "鈲\uf632퐲\udb32″\udb32\ue932⼳⸳팲혲\ue932ﴲ⤳혲혲\udf32\udd32⸳팲⤳⠳\ue532録쐲", "壘䥊㥋䥊륎ो᥋쥊饊륎楉ॊ᥋", -1407099062 ]
    // 111: pop
    // 112: goto 34a
    // 115: ldc_w -361059962
    // 118: dup
    // 119: ldc_w 513976253
    // 11c: iushr
    // 11d: imul
    // 11e: ldc_w -1786735276
    // 121: ior
    // 122: ldc_w -1650286754
    // 125: iand
    // 126: istore 11
    // 128: goto 213
    // 12b: ldc_w -841547856
    // 12e: ldc_w -290154682
    // 131: ixor
    // 132: ldc_w -1430642432
    // 135: ior
    // 136: ldc_w -285296894
    // 139: iand
    // 13a: istore 11
    // 13c: goto 213
    // 13f: ldc_w 100912296
    // 142: ldc_w -491739049
    // 145: isub
    // 146: ldc_w -863816778
    // 149: ior
    // 14a: ldc_w -846776385
    // 14d: iand
    // 14e: istore 11
    // 150: goto 248
    // 153: iload 11
    // 155: ldc_w 1953405156
    // 158: ixor
    // 159: ldc_w 512143652
    // 15c: isub
    // 15d: ldc_w 1338202378
    // 160: isub
    // 161: ldc_w 620160211
    // 164: isub
    // 165: ldc_w 1764282023
    // 168: ixor
    // 169: ldc_w 46064841
    // 16c: iadd
    // 16d: lookupswitch -133 2 -1526490581 -133 1907414191 297
    // 188: ldc_w -1992456731
    // 18b: ldc_w -422782166
    // 18e: iushr
    // 18f: ldc_w 331347441
    // 192: ixor
    // 193: istore 11
    // 195: goto 248
    // 198: ldc_w 267062179
    // 19b: ldc_w 913836196
    // 19e: dup
    // 19f: ishl
    // 1a0: isub
    // 1a1: ldc_w -288319062
    // 1a4: ixor
    // 1a5: istore 11
    // 1a7: goto 0a2
    // 1aa: ldc_w -1657250127
    // 1ad: ldc_w -468237220
    // 1b0: swap
    // 1b1: ishr
    // 1b2: ldc_w -544886546
    // 1b5: ixor
    // 1b6: istore 11
    // 1b8: goto 0a2
    // 1bb: iload 11
    // 1bd: ldc_w 1872063948
    // 1c0: iadd
    // 1c1: ldc_w 1238614882
    // 1c4: ixor
    // 1c5: ldc_w 227158317
    // 1c8: iadd
    // 1c9: ldc_w 1098573530
    // 1cc: ixor
    // 1cd: ldc_w 2111831815
    // 1d0: iadd
    // 1d1: ldc_w 857542685
    // 1d4: iadd
    // 1d5: lookupswitch 367 4 157353124 528 1151791282 -432 2108748938 656 2142107970 367
    // 200: iinc 8 1
    // 203: goto 011
    // 206: iload 7
    // 208: iload 3
    // 209: if_icmpgt 188
    // 20c: iload 3
    // 20d: ineg
    // 20e: istore 8
    // 210: goto 062
    // 213: iload 11
    // 215: ldc_w 1510091145
    // 218: iadd
    // 219: ldc_w 931390615
    // 21c: ixor
    // 21d: ldc_w 1651083049
    // 220: ixor
    // 221: ldc_w 2070818173
    // 224: iadd
    // 225: ldc_w 1907302460
    // 228: iadd
    // 229: ldc_w 384218987
    // 22c: iadd
    // 22d: lookupswitch 118 2 -1502435203 118 1427779161 -39
    // 248: iload 11
    // 24a: ldc_w 1992152077
    // 24d: ixor
    // 24e: ldc_w 275178653
    // 251: iadd
    // 252: ldc_w 1598136967
    // 255: isub
    // 256: ldc_w 430827424
    // 259: ixor
    // 25a: ldc_w 279866730
    // 25d: iadd
    // 25e: ldc_w 1261299544
    // 261: ixor
    // 262: lookupswitch 618 3 -850016126 503 1119338928 618 1807426341 -365
    // 284: return
    // 285: aload 7
    // 287: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "\u187c硿", "ྷ羷", "䂁䒁쒁", -133408744 ]
    // 28c: ifle 3d5
    // 28f: iload 3
    // 290: ineg
    // 291: istore 8
    // 293: goto 011
    // 296: iload 8
    // 298: iload 3
    // 299: if_icmpgt 3d5
    // 29c: iload 3
    // 29d: ineg
    // 29e: istore 9
    // 2a0: goto 1aa
    // 2a3: iload 7
    // 2a5: iload 3
    // 2a6: if_icmpgt 13f
    // 2a9: iload 3
    // 2aa: ineg
    // 2ab: istore 8
    // 2ad: goto 445
    // 2b0: ldc_w -593243847
    // 2b3: ldc_w 352881345
    // 2b6: isub
    // 2b7: ldc_w 340650430
    // 2ba: ior
    // 2bb: ldc_w 929954239
    // 2be: iand
    // 2bf: istore 11
    // 2c1: goto 47e
    // 2c4: iload 9
    // 2c6: iload 3
    // 2c7: if_icmpgt 07a
    // 2ca: aload 1
    // 2cb: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "롾塿\ud87e\uf87f\uf87e顱塵塴硵塴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶ྵ侵\u07b5ﾴ", "䂁䒁쒁", -133408747 ]
    // 2d0: iload 8
    // 2d2: iadd
    // 2d3: aload 1
    // 2d4: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "롾塿\ud87e\uf87f\uf87e顱塵塴硵硴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶ྵ侵\u07b5ﾴ", "䂁䒁쒁", -133408766 ]
    // 2d9: iload 9
    // 2db: iadd
    // 2dc: invokedynamic JNT (II)Ljava/lang/Object; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 67004896, "\udd7e\uea22\uea36\uea22\uea5e\udd76", "鈲\uf332\uf332録쀲", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ䥏쥏祏楏", -1407099066 ]
    // 2e1: checkcast net/minecraft/class_1923
    // 2e4: astore 10
    // 2e6: aload 0
    // 2e7: invokedynamic JNT (Ljava/lang/Object;)Ljava/util/concurrent/ConcurrentHashMap; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "롾塼硽", "잷\u07b7", "䂁䒁킁䢂⒂碂⒂岁璂炂䒂傂岁Ⲃ岂墂Ⲃ璂梂梂㒂墂炂岁겁岂墂Ⲃ璂梂梂㒂墂炂삁⒂沂䂂풁⒂悂貁", -133408980 ]
    // 2ec: aload 10
    // 2ee: aload 7
    // 2f0: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "\u187c硿", "ྷ羷", "䂁䒁쒁", -133408983 ]
    // 2f5: invokedynamic JNT (I)Ljava/lang/Integer; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -704030877, "\uea56\ude02\uea3e\uea52\ude12\uddba\ude16", "鈲\uf332録\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932\uf332⠳⸳\udf32턲\udf32ⰳ\ue532", "壘䥊㥋䥊륎饊䥊륊⥊륎쥈륊᥋ॊ⥊ॊ祋", -1407099065 ]
    // 2fa: invokedynamic apply ()Ljava/util/function/BiFunction; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;, java/lang/Integer.sum (II)I, (Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer; ]
    // 2ff: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea46\ude1a\ude12", "鈲\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932줲\udc32퐲\udf32\udd32⸳\ue532\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932줲\udc32퐲\udf32\udd32⸳\ue532\uf632퐲\udb32″\udb32\ue932⼳⸳팲혲\ue932퀲⼳⠳\udd32⸳팲⤳⠳\ue932ﰲ팲\uf032⼳⠳\udd32⸳팲⤳⠳\ue532録\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932줲\udc32퐲\udf32\udd32⸳\ue532", "壘䥊㥋䥊륎ो᥋쥊饊륎楊ꥊ륊楊ो祋祋ॊ륊᥋륎楈ꥊ륊楊ो祋祋ॊ륊᥋\ud948䥊楋\ud94a襈䥊奋", -1407100686 ]
    // 304: pop
    // 305: iinc 9 1
    // 308: goto 1aa
    // 30b: aload 7
    // 30d: invokedynamic JNT (Ljava/lang/Object;)Ljava/util/Set; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "硼塿顾", "ྷ羷", "䂁䒁킁䢂⒂碂⒂岁璂炂䒂傂岁\uec81㒂炂貁", -133408800 ]
    // 312: invokedynamic JNT (Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -517434092, "\uea22\uea4a\udd92\uea32\uea4e\uea5e\uea62", "鈲録쐲", "壘䥊㥋䥊륎ो᥋쥊饊륎楉ॊ᥋", -1407100688 ]
    // 317: ifne 46b
    // 31a: aload 0
    // 31b: invokedynamic JNT (Ljava/lang/Object;)Ljava/util/concurrent/ConcurrentHashMap; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "\u187e塼㡾", "잷\u07b7", "䂁䒁킁䢂⒂碂⒂岁璂炂䒂傂岁Ⲃ岂墂Ⲃ璂梂梂㒂墂炂岁겁岂墂Ⲃ璂梂梂㒂墂炂삁⒂沂䂂풁⒂悂貁", -133408982 ]
    // 320: aload 1
    // 321: aload 7
    // 323: invokedynamic JNT (Ljava/lang/Object;)Ljava/util/Set; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "硼塿顾", "ྷ羷", "䂁䒁킁䢂⒂碂⒂岁璂炂䒂傂岁\uec81㒂炂貁", -133408969 ]
    // 328: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea4e\uea52\uea5e", "鈲\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932줲\udc32퐲\udf32\udd32⸳\ue532\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932줲\udc32퐲\udf32\udd32⸳\ue532録\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932줲\udc32퐲\udf32\udd32⸳\ue532", "壘䥊㥋䥊륎ो᥋쥊饊륎楊ꥊ륊楊ो祋祋ॊ륊᥋륎楈ꥊ륊楊ो祋祋ॊ륊᥋\ud948䥊楋\ud94a襈䥊奋", -1407100623 ]
    // 32d: pop
    // 32e: aload 0
    // 32f: invokedynamic JNT (Ljava/lang/Object;)Ljava/util/Set; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "\uf87c\uf87f", "잷\u07b7", "䂁䒁킁䢂⒂碂⒂岁璂炂䒂傂岁\uec81㒂炂貁", -133408751 ]
    // 334: aload 7
    // 336: invokedynamic JNT (Ljava/lang/Object;)Ljava/util/Set; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "硼塿顾", "ྷ羷", "䂁䒁킁䢂⒂碂⒂岁璂炂䒂傂岁\uec81㒂炂貁", -133408802 ]
    // 33b: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -517434092, "\ude02\ude1e\ude1e\udd82\uea3e\uea3e", "鈲\uf632퐲\udb32″\udb32\ue932⼳⸳팲혲\ue932ﴲ⤳혲혲\udf32\udd32⸳팲⤳⠳\ue532録쐲", "壘䥊㥋䥊륎ो᥋쥊饊륎楉ॊ᥋", -1407100710 ]
    // 340: pop
    // 341: goto 46b
    // 344: iinc 7 1
    // 347: goto 115
    // 34a: ldc_w 890932722
    // 34d: ldc_w 1172529835
    // 350: iand
    // 351: ldc_w 1117571269
    // 354: ior
    // 355: ldc_w -157487659
    // 358: iand
    // 359: istore 11
    // 35b: goto 248
    // 35e: iinc 8 1
    // 361: goto 003
    // 364: aload 0
    // 365: invokedynamic JNT (Ljava/lang/Object;)Lrt; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "\uf87f\uf87f硽", "잷\u07b7", "䂁䒁킁梂炂貁", -133408792 ]
    // 36a: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea5a\uea32\ude06", "鈲録\uf332", "祋᥋", -1407100712 ]
    // 36f: istore 3
    // 370: aload 0
    // 371: invokedynamic JNT (Ljava/lang/Object;)Ljava/util/concurrent/ConcurrentHashMap; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "㡾\ud87c롼", "잷\u07b7", "䂁䒁킁䢂⒂碂⒂岁璂炂䒂傂岁Ⲃ岂墂Ⲃ璂梂梂㒂墂炂岁겁岂墂Ⲃ璂梂梂㒂墂炂삁⒂沂䂂풁⒂悂貁", -133408750 ]
    // 376: aload 1
    // 377: bipush 0
    // 378: invokedynamic JNT (I)Ljava/lang/Integer; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -704030877, "\uea56\ude02\uea3e\uea52\ude12\uddba\ude16", "鈲\uf332録\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932\uf332⠳⸳\udf32턲\udf32ⰳ\ue532", "壘䥊㥋䥊륎饊䥊륊⥊륎쥈륊᥋ॊ⥊ॊ祋", -1407100714 ]
    // 37d: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\ude1a\ude12\uea5e\uddba\uea46\udd9e\ude12\ude16\ude02\uea52\uea3e\uea5e", "鈲\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932줲\udc32퐲\udf32\udd32⸳\ue532\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932줲\udc32퐲\udf32\udd32⸳\ue532録\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932줲\udc32퐲\udf32\udd32⸳\ue532", "壘䥊㥋䥊륎ो᥋쥊饊륎楊ꥊ륊楊ो祋祋ॊ륊᥋륎楈ꥊ륊楊ो祋祋ॊ륊᥋\ud948䥊楋\ud94a襈䥊奋", -1407100711 ]
    // 382: checkcast java/lang/Integer
    // 385: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea22\uea36\uea5e\uddd6\ude02\uea3e\uea52\ude12", "鈲録\uf332", "壘䥊㥋䥊륎饊䥊륊⥊륎쥈륊᥋ॊ⥊ॊ祋", -1407100716 ]
    // 38a: istore 4
    // 38c: invokedynamic JNT ()Ljava/lang/Boolean; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -663520593, "\uf870㡰\ud870\ud872", "잷辷➷辷\ue7b5\uf7b7辷\ue7b7龷\ue7b5螶\udfb7\udfb7\uf7b7꾷辷\ue7b7", "䂁䒁킁䢂⒂碂⒂岁傂⒂墂㲂岁ꢁ岂岂傂㒂⒂墂貁", -133408890 ]
    // 391: aload 0
    // 392: invokedynamic JNT (Ljava/lang/Object;)Ljava/util/concurrent/ConcurrentHashMap; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "\u187e顾\u187f", "잷\u07b7", "䂁䒁킁䢂⒂碂⒂岁璂炂䒂傂岁Ⲃ岂墂Ⲃ璂梂梂㒂墂炂岁겁岂墂Ⲃ璂梂梂㒂墂炂삁⒂沂䂂풁⒂悂貁", -133408893 ]
    // 397: aload 1
    // 398: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\ude1a\ude12\uea5e", "鈲\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932줲\udc32퐲\udf32\udd32⸳\ue532録\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932줲\udc32퐲\udf32\udd32⸳\ue532", "壘䥊㥋䥊륎ो᥋쥊饊륎楊ꥊ륊楊ो祋祋ॊ륊᥋륎楈ꥊ륊楊ो祋祋ॊ륊᥋\ud948䥊楋\ud94a襈䥊奋", -1407100635 ]
    // 39d: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\ude12\uea42\uea52\ude02\uea3e\uea4a", "鈲\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932줲\udc32퐲\udf32\udd32⸳\ue532録쐲", "壘䥊㥋䥊륎饊䥊륊⥊륎祈ꥊꥊ饊ॊ䥊륊", -1407100608 ]
    // 3a2: istore 5
    // 3a4: aload 0
    // 3a5: invokedynamic JNT (Ljava/lang/Object;)Ljava/util/concurrent/ConcurrentHashMap; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "\u187e塼㡾", "잷\u07b7", "䂁䒁킁䢂⒂碂⒂岁璂炂䒂傂岁Ⲃ岂墂Ⲃ璂梂梂㒂墂炂岁겁岂墂Ⲃ璂梂梂㒂墂炂삁⒂沂䂂풁⒂悂貁", -133408902 ]
    // 3aa: aload 1
    // 3ab: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea46\ude12\uea32\uea3a\uea56\ude12", "鈲\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932줲\udc32퐲\udf32\udd32⸳\ue532録\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932줲\udc32퐲\udf32\udd32⸳\ue532", "壘䥊㥋䥊륎ो᥋쥊饊륎楊ꥊ륊楊ो祋祋ॊ륊᥋륎楈ꥊ륊楊ो祋祋ॊ륊᥋\ud948䥊楋\ud94a襈䥊奋", -1407100610 ]
    // 3b0: checkcast java/util/Set
    // 3b3: astore 6
    // 3b5: iload 4
    // 3b7: ifle 13f
    // 3ba: iload 3
    // 3bb: ineg
    // 3bc: istore 7
    // 3be: goto 115
    // 3c1: ldc_w -1317378919
    // 3c4: ldc_w 761819770
    // 3c7: iushr
    // 3c8: ldc_w 1515695105
    // 3cb: ior
    // 3cc: ldc_w -77611663
    // 3cf: iand
    // 3d0: istore 11
    // 3d2: goto 1bb
    // 3d5: ldc_w 631583003
    // 3d8: ldc_w -657071131
    // 3db: ishr
    // 3dc: ldc_w 1767584679
    // 3df: ixor
    // 3e0: istore 11
    // 3e2: goto 47e
    // 3e5: iload 8
    // 3e7: iload 3
    // 3e8: if_icmpgt 3c1
    // 3eb: aload 0
    // 3ec: aload 1
    // 3ed: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "롾塿\ud87e\uf87f\uf87e顱塵塴硵塴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶ྵ侵\u07b5ﾴ", "䂁䒁쒁", -133408988 ]
    // 3f2: iload 7
    // 3f4: iadd
    // 3f5: aload 1
    // 3f6: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "롾塿\ud87e\uf87f\uf87e顱塵塴硵硴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶ྵ侵\u07b5ﾴ", "䂁䒁쒁", -133408991 ]
    // 3fb: iload 8
    // 3fd: iadd
    // 3fe: invokedynamic JNT (II)Ljava/lang/Object; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 67004896, "\udd7e\uea22\uea36\uea22\uea5e\udd76", "鈲\uf332\uf332録쀲", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ䥏쥏祏楏", -1407100609 ]
    // 403: checkcast net/minecraft/class_1923
    // 406: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)V bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea42\ude06", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\ueb32\ue332\uec32\ued32\ue532録쀲", "壘祋", -1407100630 ]
    // 40b: iinc 8 1
    // 40e: goto 062
    // 411: iload 9
    // 413: iload 3
    // 414: if_icmpgt 198
    // 417: aload 0
    // 418: aload 1
    // 419: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "롾塿\ud87e\uf87f\uf87e顱塵塴硵塴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶ྵ侵\u07b5ﾴ", "䂁䒁쒁", -133408968 ]
    // 41e: iload 8
    // 420: iadd
    // 421: aload 1
    // 422: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "롾塿\ud87e\uf87f\uf87e顱塵塴硵硴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶ྵ侵\u07b5ﾴ", "䂁䒁쒁", -133408971 ]
    // 427: iload 9
    // 429: iadd
    // 42a: invokedynamic JNT (II)Ljava/lang/Object; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 67004896, "\udd7e\uea22\uea36\uea22\uea5e\udd76", "鈲\uf332\uf332録쀲", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ䥏쥏祏楏", -1407100629 ]
    // 42f: checkcast net/minecraft/class_1923
    // 432: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)V bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea4e\ude0a\ude02", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\ueb32\ue332\uec32\ued32\ue532録쀲", "壘祋", -1407100634 ]
    // 437: iinc 9 1
    // 43a: goto 08e
    // 43d: ldc_w 1443986237
    // 440: istore 11
    // 442: goto 364
    // 445: ldc_w 321104613
    // 448: ldc_w 1608290379
    // 44b: isub
    // 44c: ldc_w 218213729
    // 44f: ior
    // 450: ldc_w 497938297
    // 453: iand
    // 454: istore 11
    // 456: goto 1bb
    // 459: iload 5
    // 45b: ifeq 188
    // 45e: iload 3
    // 45f: ineg
    // 460: istore 7
    // 462: goto 12b
    // 465: iinc 7 1
    // 468: goto 12b
    // 46b: ldc_w -966221188
    // 46e: ldc_w -943896394
    // 471: dup2
    // 472: ishl
    // 473: ishr
    // 474: isub
    // 475: ldc_w -2078464906
    // 478: ixor
    // 479: istore 11
    // 47b: goto 47e
    // 47e: iload 11
    // 480: ldc_w 1922895718
    // 483: isub
    // 484: ldc_w 773401372
    // 487: isub
    // 488: ldc_w 1832853965
    // 48b: iadd
    // 48c: ldc_w 1818550050
    // 48f: ixor
    // 490: ldc_w 511220974
    // 493: ixor
    // 494: ldc_w 1908701829
    // 497: ixor
    // 498: lookupswitch -397 3 -535893952 -531 925317171 -397 1156013490 -532
    // 4bc: ldc_w -2065547439
    // 4bf: ldc_w -1759558662
    // 4c2: iand
    // 4c3: ldc_w -665538439
    // 4c6: ixor
    // 4c7: istore 11
    // 4c9: goto 1bb
    // 4cc: aload 0
    // 4cd: aload 1
    // 4ce: aload 2
    // 4cf: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lqc; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\ude1a\uea4a\uea56", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\ueb32\ue332\uec32\ued32\ue532\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\ue232\ueb32\ue232\ue532録\uf632⬳\udd32\ue532", "壘祋", -1407100631 ]
    // 4d4: astore 7
    // 4d6: aload 0
    // 4d7: invokedynamic JNT (Ljava/lang/Object;)Ljava/util/concurrent/ConcurrentHashMap; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "㡾\ud87c롼", "잷\u07b7", "䂁䒁킁䢂⒂碂⒂岁璂炂䒂傂岁Ⲃ岂墂Ⲃ璂梂梂㒂墂炂岁겁岂墂Ⲃ璂梂梂㒂墂炂삁⒂沂䂂풁⒂悂貁", -133408823 ]
    // 4dc: aload 1
    // 4dd: aload 7
    // 4df: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "\u187c硿", "ྷ羷", "䂁䒁쒁", -133408810 ]
    // 4e4: invokedynamic JNT (I)Ljava/lang/Integer; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -704030877, "\uea56\ude02\uea3e\uea52\ude12\uddba\ude16", "鈲\uf332録\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932\uf332⠳⸳\udf32턲\udf32ⰳ\ue532", "壘䥊㥋䥊륎饊䥊륊⥊륎쥈륊᥋ॊ⥊ॊ祋", -1407100718 ]
    // 4e9: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea4e\uea52\uea5e", "鈲\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932줲\udc32퐲\udf32\udd32⸳\ue532\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932줲\udc32퐲\udf32\udd32⸳\ue532録\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932줲\udc32퐲\udf32\udd32⸳\ue532", "壘䥊㥋䥊륎ो᥋쥊饊륎楊ꥊ륊楊ो祋祋ॊ륊᥋륎楈ꥊ륊楊ो祋祋ॊ륊᥋\ud948䥊楋\ud94a襈䥊奋", -1407100619 ]
    // 4ee: pop
    // 4ef: aload 0
    // 4f0: invokedynamic JNT (Ljava/lang/Object;)Ljava/util/concurrent/ConcurrentHashMap; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "\u187e顾\u187f", "잷\u07b7", "䂁䒁킁䢂⒂碂⒂岁璂炂䒂傂岁Ⲃ岂墂Ⲃ璂梂梂㒂墂炂岁겁岂墂Ⲃ璂梂梂㒂墂炂삁⒂沂䂂풁⒂悂貁", -133408771 ]
    // 4f5: aload 1
    // 4f6: aload 7
    // 4f8: invokedynamic JNT (Ljava/lang/Object;)Z bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "\ud87c硼㡼", "ྷ羷", "䂁䒁ࢂ", -133408822 ]
    // 4fd: invokedynamic JNT (Z)Ljava/lang/Boolean; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -704030877, "\uea56\ude02\uea3e\uea52\ude12\uddba\ude16", "鈲쐲録\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932ﰲ⤳⤳혲\udf32\udb32⠳\ue532", "壘䥊㥋䥊륎饊䥊륊⥊륎祈ꥊꥊ饊ॊ䥊륊", -1407100530 ]
    // 502: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea4e\uea52\uea5e", "鈲\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932줲\udc32퐲\udf32\udd32⸳\ue532\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932줲\udc32퐲\udf32\udd32⸳\ue532録\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932줲\udc32퐲\udf32\udd32⸳\ue532", "壘䥊㥋䥊륎ो᥋쥊饊륎楊ꥊ륊楊ो祋祋ॊ륊᥋륎楈ꥊ륊楊ो祋祋ॊ륊᥋\ud948䥊楋\ud94a襈䥊奋", -1407100527 ]
    // 507: pop
    // 508: aload 7
    // 50a: invokedynamic JNT (Ljava/lang/Object;)Z bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "\ud87c硼㡼", "ྷ羷", "䂁䒁ࢂ", -133408847 ]
    // 50f: ifeq 2b0
    // 512: iload 3
    // 513: ineg
    // 514: istore 8
    // 516: goto 003
  }

  public void pca(class_1923 var1) {
    /* jnt */,
      var1,
      /* jnt */,
      Integer::sum
    );
  }

  public void qb(class_1923 var1) {
    /* jnt */,
      var1,
      (BiFunction<class_1923, Integer, Integer>)(var0, var1x) -> {
        if (var1x == null) {
          return null;
        } else {
          int var2 = /* jnt */ - 1;
          return var2 <= 0
            ? null
            : /* jnt */;
        }
      }
    );
  }

  public boolean eu(class_1923 var1) {
    return /* jnt */, var1
    );
  }

  public qc gsv(class_1923 param1, class_2818 param2) {
    // $VF: Couldn't be decompiled
    // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
    // java.lang.RuntimeException: parsing failure!
    //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
    //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
    //
    // Bytecode:
    // 000: goto 0f5
    // 003: iinc 8 1
    // 006: goto 568
    // 009: ldc_w -793038381
    // 00c: ldc_w 1553681122
    // 00f: ishl
    // 010: ldc_w 2037150237
    // 013: ixor
    // 014: istore 32
    // 016: goto 5ee
    // 019: iadd
    // 01a: istore 16
    // 01c: aload 0
    // 01d: invokedynamic JNT (Ljava/lang/Object;)Lkc; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "㡾\ud87f\ud87e㡾", "잷\u07b7", "䂁䒁킁䲂Ⲃ貁", -133408871 ]
    // 022: invokedynamic JNT (Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\ude16\uea42\uea5a", "鈲録쐲", "\ue94a楊", -1407100617 ]
    // 027: ifeq 33f
    // 02a: iload 7
    // 02c: goto 21f
    // 02f: aload 0
    // 030: invokedynamic JNT (Ljava/lang/Object;)Lkc; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "塿\ud87e", "잷\u07b7", "䂁䒁킁䲂Ⲃ貁", -133408861 ]
    // 035: invokedynamic JNT (Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\ude16\uea42\uea5a", "鈲録쐲", "\ue94a楊", -1407100539 ]
    // 03a: ifeq 5b7
    // 03d: aload 22
    // 03f: invokedynamic JNT ()Lnet/minecraft/class_2248; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -663520593, "롾塿\ud87e\uf87f\uf87e顱㡴硵롴顴\ud874", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶\u07b5\u07b5㞵➵", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ梁梁炁肁貁", -133408819 ]
    // 044: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd46\udd5a\udd6e\udd52\udd46", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\uec32\uee32\ue232\ue532録쐲", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏㥏\ud94f奏", -1407100509 ]
    // 049: ifeq 5b7
    // 04c: aload 22
    // 04e: invokedynamic JNT ()Lnet/minecraft/class_2758; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -663520593, "롾塿\ud87e\uf87f\uf87e顱塴㡴\ud874塴顴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶\u07b5\u1fb5㞵ྵ", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ梁粁璁肁貁", -133408857 ]
    // 053: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd46\udd6e\udd5e\udd62\udd6e", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\ue132\ue032\ue332\ue532録쐲", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏㥏\ud94f奏", -1407100511 ]
    // 058: ifeq 5b7
    // 05b: aload 22
    // 05d: invokedynamic JNT ()Lnet/minecraft/class_2758; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -663520593, "롾塿\ud87e\uf87f\uf87e顱塴㡴\ud874塴顴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶\u07b5\u1fb5㞵ྵ", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ梁粁璁肁貁", -133408831 ]
    // 062: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Comparable; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd42\udd42\udd56\udd52\udd5e", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\ue132\ue032\ue332\ue532録\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932ﴲ⤳휲⨳\udb32ⰳ\udb32\udc32혲\udf32\ue532", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏㥏\ud94f奏", -1407100769 ]
    // 067: checkcast java/lang/Integer
    // 06a: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea22\uea36\uea5e\uddd6\ude02\uea3e\uea52\ude12", "鈲録\uf332", "壘䥊㥋䥊륎饊䥊륊⥊륎쥈륊᥋ॊ⥊ॊ祋", -1407100534 ]
    // 06f: istore 26
    // 071: iload 23
    // 073: iload 24
    // 075: bipush 1
    // 076: isub
    // 077: iload 25
    // 079: invokedynamic JNT (III)Ljava/lang/Object; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 67004896, "\udd7e\uea22\uea36\uea22\uea5e\udd76", "鈲\uf332\uf332\uf332録쀲", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏楏楏\ud94f", -1407100531 ]
    // 07e: checkcast net/minecraft/class_2338
    // 081: astore 27
    // 083: aload 0
    // 084: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "顾\u187f", "잷\u07b7", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ沁撁悁貁", -133408811 ]
    // 089: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_638; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "롾塿\ud87e\uf87f\uf87e顱塴롴硵顴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶ﾴྵ឵", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ碁沁肁貁", -133408830 ]
    // 08e: aload 27
    // 090: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Lnet/minecraft/class_2680; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd6e\udd4a\udd46\udd4e", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\ued32\ued32\ue232\ue532録\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\ue032\ue232\uea32\ue532", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ㥏楏\ud94f", -1407100538 ]
    // 095: invokedynamic JNT (Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd46\udd56\udd46\udd42\udd52", "鈲録쐲", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏㥏\ud94f奏", -1407100535 ]
    // 09a: istore 28
    // 09c: iload 26
    // 09e: bipush 25
    // 0a0: if_icmpeq 526
    // 0a3: iload 28
    // 0a5: ifne 912
    // 0a8: goto 526
    // 0ab: aload 0
    // 0ac: invokedynamic JNT (Ljava/lang/Object;)Lkc; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "塼塿\ud87e", "잷\u07b7", "䂁䒁킁䲂Ⲃ貁", -133408791 ]
    // 0b1: invokedynamic JNT (Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\ude16\uea42\uea5a", "鈲録쐲", "\ue94a楊", -1407100537 ]
    // 0b6: ifeq 0d2
    // 0b9: aload 22
    // 0bb: invokedynamic JNT ()Lnet/minecraft/class_2248; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -663520593, "롾塿\ud87e\uf87f\uf87e顱㡴顴塴롴塴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶\u07b5\u07b5㞵➵", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ梁梁炁肁貁", -133408781 ]
    // 0c0: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd46\udd5a\udd6e\udd52\udd46", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\uec32\uee32\ue232\ue532録쐲", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏㥏\ud94f奏", -1407098603 ]
    // 0c5: ifeq 756
    // 0c8: iinc 13 1
    // 0cb: goto 0d2
    // 0ce: bipush 0
    // 0cf: goto 3d6
    // 0d2: ldc_w -1835734653
    // 0d5: ldc_w -932352681
    // 0d8: dup
    // 0d9: iadd
    // 0da: imul
    // 0db: ldc_w -226610816
    // 0de: ixor
    // 0df: istore 32
    // 0e1: goto 779
    // 0e4: iinc 30 1
    // 0e7: goto 3a8
    // 0ea: aload 15
    // 0ec: invokedynamic JNT (IZLjava/lang/Object;)Ljava/lang/Object; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 67004896, "\udd7e\uea22\uea36\uea22\uea5e\udd76", "鈲\uf332쐲\uf632퐲\udb32″\udb32\ue932⼳⸳팲혲\ue932촲\udf32⸳\ue532録쀲", "䥋楊", -1407098576 ]
    // 0f1: checkcast qc
    // 0f4: areturn
    // 0f5: ldc_w -821662165
    // 0f8: istore 32
    // 0fa: goto 2f8
    // 0fd: bipush 0
    // 0fe: goto 135
    // 101: ldc_w 1590026291
    // 104: ldc_w 691767641
    // 107: dup_x1
    // 108: ishl
    // 109: ixor
    // 10a: ldc_w -248575367
    // 10d: ixor
    // 10e: istore 32
    // 110: goto 474
    // 113: ldc_w 1985144248
    // 116: dup
    // 117: iand
    // 118: ldc_w 1331205431
    // 11b: ixor
    // 11c: istore 32
    // 11e: goto 373
    // 121: ldc_w 1229179516
    // 124: ldc_w 227438664
    // 127: ishl
    // 128: ldc_w -1110998578
    // 12b: ior
    // 12c: ldc_w -3152897
    // 12f: iand
    // 130: istore 32
    // 132: goto 8bd
    // 135: ldc_w 1424176426
    // 138: ldc_w -1711442076
    // 13b: iushr
    // 13c: ldc_w -215457315
    // 13f: ixor
    // 140: istore 32
    // 142: goto a50
    // 145: istore 28
    // 147: iload 28
    // 149: ifeq 460
    // 14c: iinc 12 1
    // 14f: goto 900
    // 152: ldc_w -2083774471
    // 155: dup
    // 156: ishl
    // 157: ldc_w 392416080
    // 15a: ior
    // 15b: ldc_w 1072431062
    // 15e: iand
    // 15f: istore 32
    // 161: goto 6b5
    // 164: iload 16
    // 166: aload 3
    // 167: arraylength
    // 168: if_icmpge 152
    // 16b: aload 3
    // 16c: iload 16
    // 16e: aaload
    // 16f: astore 17
    // 171: aload 17
    // 173: ifnull 5e0
    // 176: aload 17
    // 178: invokedynamic JNT (Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd4a\udd6e\udd46\udd62\udd46", "鈲録쐲", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏\ud94f祏㥏", -1407098573 ]
    // 17d: ifeq 689
    // 180: goto 5e0
    // 183: iadd
    // 184: aload 0
    // 185: invokedynamic JNT (Ljava/lang/Object;)Lkc; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "塼塿\ud87e", "잷\u07b7", "䂁䒁킁䲂Ⲃ貁", -133408777 ]
    // 18a: invokedynamic JNT (Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\ude16\uea42\uea5a", "鈲録쐲", "\ue94a楊", -1407099023 ]
    // 18f: ifeq 865
    // 192: iload 14
    // 194: goto 3d6
    // 197: aload 0
    // 198: invokedynamic JNT (Ljava/lang/Object;)Lkc; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "\uf87c顼㡿", "잷\u07b7", "䂁䒁킁䲂Ⲃ貁", -133408815 ]
    // 19d: invokedynamic JNT (Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\ude16\uea42\uea5a", "鈲録쐲", "\ue94a楊", -1407099025 ]
    // 1a2: ifeq 512
    // 1a5: aload 22
    // 1a7: invokedynamic JNT ()Lnet/minecraft/class_2248; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -663520593, "롾塿\ud87e\uf87f\uf87e顱㡴硵硵硵硵", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶\u07b5\u07b5㞵➵", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ梁梁炁肁貁", -133408869 ]
    // 1ac: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd46\udd5a\udd6e\udd52\udd46", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\uec32\uee32\ue232\ue532録쐲", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏㥏\ud94f奏", -1407098595 ]
    // 1b1: ifeq 512
    // 1b4: aload 22
    // 1b6: invokedynamic JNT ()Lnet/minecraft/class_2754; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -663520593, "롾塿\ud87e\uf87f\uf87e顱塴㡴\uf874塵롴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶\u07b5\u1fb5㞵ྵ", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ梁粁璁炁貁", -133408859 ]
    // 1bb: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd46\udd6e\udd5e\udd62\udd6e", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\ue132\ue032\ue332\ue532録쐲", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏㥏\ud94f奏", -1407098597 ]
    // 1c0: ifeq 512
    // 1c3: aload 22
    // 1c5: invokedynamic JNT ()Lnet/minecraft/class_2754; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -663520593, "롾塿\ud87e\uf87f\uf87e顱塴㡴\uf874塵롴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶\u07b5\u1fb5㞵ྵ", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ梁粁璁炁貁", -133408865 ]
    // 1ca: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Comparable; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd42\udd42\udd56\udd52\udd5e", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\ue132\ue032\ue332\ue532録\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932ﴲ⤳휲⨳\udb32ⰳ\udb32\udc32혲\udf32\ue532", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏㥏\ud94f奏", -1407098599 ]
    // 1cf: invokedynamic JNT ()Lnet/minecraft/class_2350$class_2351; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -663520593, "롾塿\ud87e\uf87f\uf87e顱塴塴硴\ud874㡴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶\u07b5ﾴ⾵឵략羷\uf7b7辷ﾶﾶ徶\u07b5ﾴ⾵ྵ", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ梁沁璁悁めⲂ傂⒂沂沂ᲂ梁沁璁撁貁", -133408711 ]
    // 1d4: if_acmpeq 512
    // 1d7: iload 24
    // 1d9: iflt 512
    // 1dc: iload 24
    // 1de: bipush 60
    // 1e0: if_icmpgt 512
    // 1e3: iload 23
    // 1e5: iload 24
    // 1e7: iload 25
    // 1e9: invokedynamic JNT (III)Ljava/lang/Object; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 67004896, "\udd7e\uea22\uea36\uea22\uea5e\udd76", "鈲\uf332\uf332\uf332録쀲", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏楏楏\ud94f", -1407098601 ]
    // 1ee: checkcast net/minecraft/class_2338
    // 1f1: astore 26
    // 1f3: bipush 1
    // 1f4: istore 27
    // 1f6: invokedynamic JNT ()[Lnet/minecraft/class_2350; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -704030877, "\uea56\ude02\uea3e\uea52\ude12\uea4a", "鈲録씲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\ued32\uef32\uea32\ue532", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏楏ॏ奏", -1407099006 ]
    // 1fb: checkcast [Lnet/minecraft/class_2350;
    // 1fe: astore 28
    // 200: aload 28
    // 202: arraylength
    // 203: istore 29
    // 205: bipush 0
    // 206: istore 30
    // 208: goto 3a8
    // 20b: iadd
    // 20c: aload 0
    // 20d: invokedynamic JNT (Ljava/lang/Object;)Lkc; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "塾\uf87e\ud87f", "잷\u07b7", "䂁䒁킁䲂Ⲃ貁", -133408784 ]
    // 212: invokedynamic JNT (Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\ude16\uea42\uea5a", "鈲録쐲", "\ue94a楊", -1407099008 ]
    // 217: ifeq 244
    // 21a: iload 12
    // 21c: goto 135
    // 21f: ldc_w -955794672
    // 222: dup
    // 223: iand
    // 224: ldc_w -1607463708
    // 227: ior
    // 228: ldc_w -1330033170
    // 22b: iand
    // 22c: istore 32
    // 22e: goto 5ee
    // 231: iload 4
    // 233: iload 16
    // 235: iadd
    // 236: bipush 4
    // 237: ishl
    // 238: istore 18
    // 23a: bipush 0
    // 23b: istore 19
    // 23d: goto 2eb
    // 240: bipush 0
    // 241: goto 9d4
    // 244: ldc_w -343032686
    // 247: ldc_w 1031673520
    // 24a: ishr
    // 24b: ldc_w 2002637395
    // 24e: ixor
    // 24f: istore 32
    // 251: goto 5ee
    // 254: iinc 13 1
    // 257: goto 0d2
    // 25a: iinc 16 1
    // 25d: goto 699
    // 260: ldc_w -1403739118
    // 263: ldc_w 1372151372
    // 266: iand
    // 267: ldc_w -99677143
    // 26a: ixor
    // 26b: istore 32
    // 26d: goto 6f8
    // 270: ldc_w 113216994
    // 273: dup
    // 274: iushr
    // 275: ldc_w 1166087698
    // 278: ior
    // 279: ldc_w 1975885718
    // 27c: iand
    // 27d: istore 32
    // 27f: goto 6b5
    // 282: aload 27
    // 284: invokedynamic JNT (Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd46\udd56\udd46\udd42\udd52", "鈲録쐲", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏㥏\ud94f奏", -1407099005 ]
    // 289: ifeq aa4
    // 28c: aload 22
    // 28e: invokedynamic JNT ()Lnet/minecraft/class_2746; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -663520593, "롾塿\ud87e\uf87f\uf87e顱塴㡴\uf874硵塵", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶\u07b5\u1fb5㞵ྵ", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ梁粁炁碁貁", -133408697 ]
    // 293: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Comparable; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd42\udd42\udd56\udd52\udd5e", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\ue132\ue032\ue332\ue532録\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932ﴲ⤳휲⨳\udb32ⰳ\udb32\udc32혲\udf32\ue532", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏㥏\ud94f奏", -1407099007 ]
    // 298: checkcast java/lang/Boolean
    // 29b: invokedynamic JNT (Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\ude06\uea3a\uea3a\uea3e\ude12\ude02\uea36\uddd6\ude02\uea3e\uea52\ude12", "鈲録쐲", "壘䥊㥋䥊륎饊䥊륊⥊륎祈ꥊꥊ饊ॊ䥊륊", -1407099012 ]
    // 2a0: ifne 121
    // 2a3: aload 22
    // 2a5: invokedynamic JNT ()Lnet/minecraft/class_2746; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -663520593, "롾塿\ud87e\uf87f\uf87e顱塴㡴\uf874硵顴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶\u07b5\u1fb5㞵ྵ", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ梁粁炁碁貁", -133408786 ]
    // 2aa: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Comparable; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd42\udd42\udd56\udd52\udd5e", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\ue132\ue032\ue332\ue532録\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932ﴲ⤳휲⨳\udb32ⰳ\udb32\udc32혲\udf32\ue532", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏㥏\ud94f奏", -1407099030 ]
    // 2af: checkcast java/lang/Boolean
    // 2b2: invokedynamic JNT (Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\ude06\uea3a\uea3a\uea3e\ude12\ude02\uea36\uddd6\ude02\uea3e\uea52\ude12", "鈲録쐲", "壘䥊㥋䥊륎饊䥊륊⥊륎祈ꥊꥊ饊ॊ䥊륊", -1407099027 ]
    // 2b7: ifne 121
    // 2ba: aload 22
    // 2bc: invokedynamic JNT ()Lnet/minecraft/class_2746; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -663520593, "롾塿\ud87e\uf87f\uf87e顱塴㡴\ud874\uf874硴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶\u07b5\u1fb5㞵ྵ", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ梁粁炁碁貁", -133408779 ]
    // 2c1: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Comparable; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd42\udd42\udd56\udd52\udd5e", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\ue132\ue032\ue332\ue532録\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932ﴲ⤳휲⨳\udb32ⰳ\udb32\udc32혲\udf32\ue532", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏㥏\ud94f奏", -1407099029 ]
    // 2c6: checkcast java/lang/Boolean
    // 2c9: invokedynamic JNT (Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\ude06\uea3a\uea3a\uea3e\ude12\ude02\uea36\uddd6\ude02\uea3e\uea52\ude12", "鈲録쐲", "壘䥊㥋䥊륎饊䥊륊⥊륎祈ꥊꥊ饊ॊ䥊륊", -1407099034 ]
    // 2ce: ifne 121
    // 2d1: aload 22
    // 2d3: invokedynamic JNT ()Lnet/minecraft/class_2746; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -663520593, "롾塿\ud87e\uf87f\uf87e顱塴㡴\ud874㡴顴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶\u07b5\u1fb5㞵ྵ", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ梁粁炁碁貁", -133412212 ]
    // 2d8: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Comparable; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd42\udd42\udd56\udd52\udd5e", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\ue132\ue032\ue332\ue532録\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932ﴲ⤳휲⨳\udb32ⰳ\udb32\udc32혲\udf32\ue532", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏㥏\ud94f奏", -1407099036 ]
    // 2dd: checkcast java/lang/Boolean
    // 2e0: invokedynamic JNT (Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\ude06\uea3a\uea3a\uea3e\ude12\ude02\uea36\uddd6\ude02\uea3e\uea52\ude12", "鈲録쐲", "壘䥊㥋䥊륎饊䥊륊⥊륎祈ꥊꥊ饊ॊ䥊륊", -1407099033 ]
    // 2e5: ifeq 767
    // 2e8: goto 121
    // 2eb: iload 19
    // 2ed: bipush 16
    // 2ef: if_icmpge 5e0
    // 2f2: bipush 0
    // 2f3: istore 20
    // 2f5: goto 113
    // 2f8: aload 2
    // 2f9: invokedynamic JNT (Ljava/lang/Object;)[Lnet/minecraft/class_2826; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd42\udd46\udd4e\udd4e\udd56", "鈲録씲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\ue232\uec32\ue032\ue532", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏\ud94f䥏\ud94f", -1407098862 ]
    // 2fe: checkcast [Lnet/minecraft/class_2826;
    // 301: astore 3
    // 302: aload 2
    // 303: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd4a\udd46\udd6e\udd62\udd42", "鈲録\uf332", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏\ud94f䥏\ud94f", -1407099019 ]
    // 308: istore 4
    // 30a: aload 1
    // 30b: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd6e\udd4a\udd46\udd56", "鈲録\uf332", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ䥏쥏祏楏", -1407098864 ]
    // 310: istore 5
    // 312: aload 1
    // 313: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd6e\udd4a\udd46\udd6e", "鈲録\uf332", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ䥏쥏祏楏", -1407098861 ]
    // 318: istore 6
    // 31a: bipush 0
    // 31b: istore 7
    // 31d: bipush 0
    // 31e: istore 8
    // 320: bipush 0
    // 321: istore 9
    // 323: bipush 0
    // 324: istore 10
    // 326: bipush 0
    // 327: istore 11
    // 329: bipush 0
    // 32a: istore 12
    // 32c: bipush 0
    // 32d: istore 13
    // 32f: bipush 0
    // 330: istore 14
    // 332: invokedynamic JNT ()Ljava/util/concurrent/ConcurrentHashMap$KeySetView; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -704030877, "\uea36\ude12\uea5a\uddaa\ude12\uea62\uddca\ude12\uea5e", "鈲録\uf632퐲\udb32″\udb32\ue932⼳⸳팲혲\ue932\udd32⤳⠳\udd32⼳ⰳⰳ\udf32⠳⸳\ue932ﴲ⤳⠳\udd32⼳ⰳⰳ\udf32⠳⸳\uf232\udb32ⴳ툲\uf732\udb32⨳鸲\uf532\udf32⌳촲\udf32⸳쀲팲\udf32ℳ\ue532", "壘䥊㥋䥊륎ो᥋쥊饊륎楊ꥊ륊楊ो祋祋ॊ륊᥋륎楈ꥊ륊楊ो祋祋ॊ륊᥋\ud948䥊楋\ud94a襈䥊奋", -1407100722 ]
    // 337: astore 15
    // 339: bipush 0
    // 33a: istore 16
    // 33c: goto 699
    // 33f: ldc_w -347557210
    // 342: dup
    // 343: dup_x1
    // 344: iadd
    // 345: ior
    // 346: ldc_w 4911189
    // 349: ior
    // 34a: ldc_w -1966411691
    // 34d: iand
    // 34e: istore 32
    // 350: goto 6b5
    // 353: ldc_w -802052073
    // 356: ldc_w -402620372
    // 359: ishr
    // 35a: ldc_w 620323095
    // 35d: ixor
    // 35e: istore 32
    // 360: goto a50
    // 363: ldc_w 1313458567
    // 366: ldc_w -748634336
    // 369: ixor
    // 36a: ldc_w -1497984701
    // 36d: ixor
    // 36e: istore 32
    // 370: goto a1a
    // 373: iload 32
    // 375: ldc_w 262578451
    // 378: iadd
    // 379: ldc_w 1601271026
    // 37c: ixor
    // 37d: ldc_w 8372338
    // 380: iadd
    // 381: ldc_w 2084498836
    // 384: iadd
    // 385: ldc_w 1448020779
    // 388: iadd
    // 389: ldc_w 1530406144
    // 38c: isub
    // 38d: lookupswitch 455 2 -1885996671 455 717895940 943
    // 3a8: ldc_w 1343126618
    // 3ab: ldc_w -19344513
    // 3ae: swap
    // 3af: iand
    // 3b0: ldc_w -47004127
    // 3b3: ior
    // 3b4: ldc_w -42480079
    // 3b7: iand
    // 3b8: istore 32
    // 3ba: goto a1a
    // 3bd: iinc 7 1
    // 3c0: goto 568
    // 3c3: aload 0
    // 3c4: invokedynamic JNT (Ljava/lang/Object;)Lkc; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "㡾\ud87f\ud87e㡾", "잷\u07b7", "䂁䒁킁䲂Ⲃ貁", -133412236 ]
    // 3c9: invokedynamic JNT (Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\ude16\uea42\uea5a", "鈲録쐲", "\ue94a楊", -1407100724 ]
    // 3ce: ifeq 270
    // 3d1: iload 8
    // 3d3: goto 9d4
    // 3d6: ldc_w -1750648195
    // 3d9: dup
    // 3da: iadd
    // 3db: ldc_w 322246676
    // 3de: ior
    // 3df: ldc_w -1284171500
    // 3e2: iand
    // 3e3: istore 32
    // 3e5: goto a50
    // 3e8: ldc_w -1705173156
    // 3eb: ldc_w 302425060
    // 3ee: ishl
    // 3ef: ldc_w 2062560411
    // 3f2: ior
    // 3f3: ldc_w -17289505
    // 3f6: iand
    // 3f7: istore 32
    // 3f9: goto 779
    // 3fc: iload 32
    // 3fe: ldc_w 11910729
    // 401: isub
    // 402: ldc_w 1534621917
    // 405: isub
    // 406: ldc_w 1469608296
    // 409: ixor
    // 40a: ldc_w 1135684247
    // 40d: iadd
    // 40e: ldc_w 496918741
    // 411: ixor
    // 412: ldc_w 1574798630
    // 415: ixor
    // 416: lookupswitch -485 2 -950686857 -444 754343002 -485
    // 430: ldc_w 1802370198
    // 433: ldc_w -2017620592
    // 436: dup_x1
    // 437: isub
    // 438: imul
    // 439: ldc_w 949351088
    // 43c: ixor
    // 43d: istore 32
    // 43f: goto 8bd
    // 442: iinc 9 1
    // 445: goto 5b7
    // 448: bipush 0
    // 449: goto 0ea
    // 44c: iadd
    // 44d: aload 0
    // 44e: invokedynamic JNT (Ljava/lang/Object;)Lkc; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "塾\uf87e\ud87f", "잷\u07b7", "䂁䒁킁䲂Ⲃ貁", -133412162 ]
    // 453: invokedynamic JNT (Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\ude16\uea42\uea5a", "鈲録쐲", "\ue94a楊", -1407099014 ]
    // 458: ifeq 4a8
    // 45b: iload 11
    // 45d: goto 353
    // 460: ldc_w -2049424470
    // 463: ldc_w -1716981706
    // 466: ishl
    // 467: ldc_w 3760688
    // 46a: ior
    // 46b: ldc_w -1170343243
    // 46e: iand
    // 46f: istore 32
    // 471: goto 4ca
    // 474: iload 32
    // 476: ldc_w 1921878640
    // 479: ixor
    // 47a: ldc_w 1117402461
    // 47d: iadd
    // 47e: ldc_w 1379582911
    // 481: isub
    // 482: ldc_w 562851816
    // 485: isub
    // 486: ldc_w 1753499671
    // 489: ixor
    // 48a: ldc_w 1085021217
    // 48d: iadd
    // 48e: lookupswitch 1172 2 882138930 1172 1259040937 192
    // 4a8: ldc_w -1298908730
    // 4ab: ldc_w 1746868164
    // 4ae: ishl
    // 4af: ldc_w -937858907
    // 4b2: ixor
    // 4b3: istore 32
    // 4b5: goto 5ee
    // 4b8: ldc_w 1740367351
    // 4bb: dup
    // 4bc: ixor
    // 4bd: ldc_w 1558356686
    // 4c0: ior
    // 4c1: ldc_w 2147413759
    // 4c4: iand
    // 4c5: istore 32
    // 4c7: goto 5ee
    // 4ca: iload 32
    // 4cc: ldc_w 92404281
    // 4cf: ixor
    // 4d0: ldc_w 1429868685
    // 4d3: isub
    // 4d4: ldc_w 1110662551
    // 4d7: iadd
    // 4d8: ldc_w 803103962
    // 4db: isub
    // 4dc: ldc_w 1846501332
    // 4df: isub
    // 4e0: ldc_w 1075562081
    // 4e3: ixor
    // 4e4: lookupswitch 1258 2 -1092622844 1258 669791206 125
    // 500: ldc_w 259867938
    // 503: dup
    // 504: imul
    // 505: ldc_w -1608318904
    // 508: ior
    // 509: ldc_w -299410582
    // 50c: iand
    // 50d: istore 32
    // 50f: goto a50
    // 512: ldc_w -1654288271
    // 515: ldc_w -285545374
    // 518: ior
    // 519: ldc_w 135274521
    // 51c: ior
    // 51d: ldc_w 1289496091
    // 520: iand
    // 521: istore 32
    // 523: goto 779
    // 526: ldc_w 1987751630
    // 529: ldc_w 169901325
    // 52c: ior
    // 52d: ldc_w 554220469
    // 530: ixor
    // 531: istore 32
    // 533: goto 6f8
    // 536: ldc_w -1208546328
    // 539: ldc_w -225138331
    // 53c: iand
    // 53d: ldc_w -997879655
    // 540: ior
    // 541: ldc_w -293096291
    // 544: iand
    // 545: istore 32
    // 547: goto 474
    // 54a: bipush 0
    // 54b: goto 5cc
    // 54e: iinc 20 1
    // 551: goto 113
    // 554: iload 20
    // 556: bipush 16
    // 558: if_icmpge 5a3
    // 55b: bipush 0
    // 55c: istore 21
    // 55e: goto 101
    // 561: goto 3e8
    // 564: bipush 0
    // 565: goto 353
    // 568: ldc_w -131136025
    // 56b: ldc_w 243452137
    // 56e: ixor
    // 56f: ldc_w 143610276
    // 572: ior
    // 573: ldc_w 753924022
    // 576: iand
    // 577: istore 32
    // 579: goto 779
    // 57c: aload 0
    // 57d: invokedynamic JNT (Ljava/lang/Object;)Lkc; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "塿\ud87e", "잷\u07b7", "䂁䒁킁䲂Ⲃ貁", -133412152 ]
    // 582: invokedynamic JNT (Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\ude16\uea42\uea5a", "鈲録쐲", "\ue94a楊", -1407099016 ]
    // 587: ifeq 009
    // 58a: iload 10
    // 58c: goto 5cc
    // 58f: ldc_w 350937604
    // 592: ldc_w -934855990
    // 595: ior
    // 596: ldc_w 1124336785
    // 599: ior
    // 59a: ldc_w 1604677271
    // 59d: iand
    // 59e: istore 32
    // 5a0: goto 5ee
    // 5a3: ldc_w 347258496
    // 5a6: ldc_w -1945130254
    // 5a9: ior
    // 5aa: ldc_w -715969266
    // 5ad: ior
    // 5ae: ldc_w -2150641
    // 5b1: iand
    // 5b2: istore 32
    // 5b4: goto 373
    // 5b7: ldc_w -645507162
    // 5ba: ldc_w -679548108
    // 5bd: swap
    // 5be: ishl
    // 5bf: ldc_w 725537972
    // 5c2: ixor
    // 5c3: istore 32
    // 5c5: goto 779
    // 5c8: bipush 1
    // 5c9: goto 145
    // 5cc: ldc_w -405655204
    // 5cf: ldc_w -1524796435
    // 5d2: isub
    // 5d3: ldc_w -1471522800
    // 5d6: ior
    // 5d7: ldc_w -126920112
    // 5da: iand
    // 5db: istore 32
    // 5dd: goto a50
    // 5e0: ldc_w -1297129071
    // 5e3: dup
    // 5e4: ishr
    // 5e5: ldc_w -1898688260
    // 5e8: ixor
    // 5e9: istore 32
    // 5eb: goto 3fc
    // 5ee: iload 32
    // 5f0: ldc_w 1852169551
    // 5f3: iadd
    // 5f4: ldc_w 1545440490
    // 5f7: ixor
    // 5f8: ldc_w 1875351853
    // 5fb: iadd
    // 5fc: ldc_w 209471704
    // 5ff: ixor
    // 600: ldc_w 415360066
    // 603: ixor
    // 604: ldc_w 530486972
    // 607: ixor
    // 608: lookupswitch 774 8 -2004368883 -164 -1774752830 -140 -915391712 1023 184375839 161 205495298 774 301862610 -1291 932779234 -1338 1860275537 -190
    // 654: iload 30
    // 656: iload 29
    // 658: if_icmpge 363
    // 65b: aload 28
    // 65d: iload 30
    // 65f: aaload
    // 660: astore 31
    // 662: aload 0
    // 663: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "顾\u187f", "잷\u07b7", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ沁撁悁貁", -133412238 ]
    // 668: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_638; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "롾塿\ud87e\uf87f\uf87e顱塴롴硵顴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶ﾴྵ឵", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ碁沁肁貁", -133412161 ]
    // 66d: aload 26
    // 66f: aload 31
    // 671: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Lnet/minecraft/class_2338; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd42\udd4e\udd4e\udd62\udd4a", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\ued32\uef32\uea32\ue532録\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\ued32\ued32\ue232\ue532", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏楏楏\ud94f", -1407099015 ]
    // 676: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Lnet/minecraft/class_2680; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd6e\udd4a\udd46\udd4e", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\ued32\ued32\ue232\ue532録\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\ue032\ue232\uea32\ue532", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ㥏楏\ud94f", -1407099020 ]
    // 67b: invokedynamic JNT (Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd46\udd56\udd46\udd42\udd52", "鈲録쐲", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏㥏\ud94f奏", -1407099017 ]
    // 680: ifeq 0e4
    // 683: bipush 0
    // 684: istore 27
    // 686: goto 363
    // 689: ldc_w 648867826
    // 68c: ldc_w 1506621309
    // 68f: ixor
    // 690: ldc_w -1515524817
    // 693: ixor
    // 694: istore 32
    // 696: goto 3fc
    // 699: ldc_w 1627576451
    // 69c: ldc_w -1230727304
    // 69f: iand
    // 6a0: ldc_w 788330798
    // 6a3: ixor
    // 6a4: istore 32
    // 6a6: goto 6b5
    // 6a9: bipush 0
    // 6aa: goto 500
    // 6ad: bipush 0
    // 6ae: goto 21f
    // 6b1: bipush 0
    // 6b2: goto 145
    // 6b5: iload 32
    // 6b7: ldc_w 1257377539
    // 6ba: iadd
    // 6bb: ldc_w 2118011691
    // 6be: ixor
    // 6bf: ldc_w 2058022453
    // 6c2: isub
    // 6c3: ldc_w 1088980034
    // 6c6: iadd
    // 6c7: ldc_w 1039350242
    // 6ca: isub
    // 6cb: ldc_w 521959777
    // 6ce: iadd
    // 6cf: lookupswitch -34 4 -1783577910 -1167 -1546492156 -780 -818476890 -1387 1391036927 -34
    // 6f8: iload 32
    // 6fa: ldc_w 33168339
    // 6fd: isub
    // 6fe: ldc_w 83265379
    // 701: isub
    // 702: ldc_w 823159398
    // 705: ixor
    // 706: ldc_w 208836611
    // 709: iadd
    // 70a: ldc_w 1594346223
    // 70d: ixor
    // 70e: ldc_w 1204684863
    // 711: isub
    // 712: lookupswitch -1807 4 -547002457 -1807 -516578933 -720 581764630 232 1241080888 -853
    // 73c: iinc 19 1
    // 73f: goto 2eb
    // 742: iadd
    // 743: aload 0
    // 744: invokedynamic JNT (Ljava/lang/Object;)Lkc; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "塼塿\ud87e", "잷\u07b7", "䂁䒁킁䲂Ⲃ貁", -133412253 ]
    // 749: invokedynamic JNT (Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\ude16\uea42\uea5a", "鈲録쐲", "\ue94a楊", -1407100731 ]
    // 74e: ifeq 4b8
    // 751: iload 13
    // 753: goto 8ab
    // 756: ldc_w -61968372
    // 759: ldc_w -1221040386
    // 75c: swap
    // 75d: iand
    // 75e: ldc_w -1195907990
    // 761: ixor
    // 762: istore 32
    // 764: goto 779
    // 767: ldc_w 2146159877
    // 76a: dup
    // 76b: imul
    // 76c: ldc_w -2136695734
    // 76f: ior
    // 770: ldc_w -794362418
    // 773: iand
    // 774: istore 32
    // 776: goto 8bd
    // 779: iload 32
    // 77b: ldc_w 431568470
    // 77e: iadd
    // 77f: ldc_w 1614833181
    // 782: isub
    // 783: ldc_w 772318717
    // 786: isub
    // 787: ldc_w 482543402
    // 78a: iadd
    // 78b: ldc_w 557520294
    // 78e: iadd
    // 78f: ldc_w 1785061119
    // 792: ixor
    // 793: lookupswitch 801 7 -1669610931 -1892 -1573147368 -1768 -1136126579 232 -1087675031 -1532 -677921217 801 -362066074 109 2083501528 226
    // 7d4: iinc 11 1
    // 7d7: goto 3e8
    // 7da: iload 27
    // 7dc: ifeq 512
    // 7df: aload 15
    // 7e1: aload 26
    // 7e3: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -517434092, "\ude02\ude1e\ude1e", "鈲\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932줲\udc32퐲\udf32\udd32⸳\ue532録쐲", "壘䥊㥋䥊륎ो᥋쥊饊륎楉ॊ᥋", -1407100704 ]
    // 7e8: pop
    // 7e9: goto 512
    // 7ec: iadd
    // 7ed: istore 17
    // 7ef: iload 17
    // 7f1: iload 16
    // 7f3: ifle 448
    // 7f6: bipush 1
    // 7f7: goto 0ea
    // 7fa: iinc 10 1
    // 7fd: goto 5b7
    // 800: aload 22
    // 802: invokedynamic JNT ()Lnet/minecraft/class_2754; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -663520593, "롾塿\ud87e\uf87f\uf87e顱塴㡴\ud874㡴\ud874", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶\u07b5\u1fb5㞵ྵ", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ梁粁璁炁貁", -133412262 ]
    // 807: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd46\udd6e\udd5e\udd62\udd6e", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\ue132\ue032\ue332\ue532録쐲", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏㥏\ud94f奏", -1407100706 ]
    // 80c: ifeq 0d2
    // 80f: aload 22
    // 811: invokedynamic JNT ()Lnet/minecraft/class_2754; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -663520593, "롾塿\ud87e\uf87f\uf87e顱塴㡴\ud874㡴\ud874", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶\u07b5\u1fb5㞵ྵ", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ梁粁璁炁貁", -133412220 ]
    // 816: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Comparable; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd42\udd42\udd56\udd52\udd5e", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\ue132\ue032\ue332\ue532録\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932ﴲ⤳휲⨳\udb32ⰳ\udb32\udc32혲\udf32\ue532", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏㥏\ud94f奏", -1407100708 ]
    // 81b: checkcast net/minecraft/class_2350
    // 81e: astore 26
    // 820: iload 23
    // 822: iload 24
    // 824: iload 25
    // 826: invokedynamic JNT (III)Ljava/lang/Object; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 67004896, "\udd7e\uea22\uea36\uea22\uea5e\udd76", "鈲\uf332\uf332\uf332録쀲", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏楏楏\ud94f", -1407100705 ]
    // 82b: checkcast net/minecraft/class_2338
    // 82e: aload 26
    // 830: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_2350; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd42\udd4e\udd42\udd52\udd4a", "鈲録\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\ued32\uef32\uea32\ue532", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏楏ॏ奏", -1407100726 ]
    // 835: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Lnet/minecraft/class_2338; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd42\udd4e\udd4e\udd62\udd4a", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\ued32\uef32\uea32\ue532録\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\ued32\ued32\ue232\ue532", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏楏楏\ud94f", -1407100723 ]
    // 83a: astore 27
    // 83c: aload 0
    // 83d: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "顾\u187f", "잷\u07b7", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ沁撁悁貁", -133412203 ]
    // 842: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_638; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "롾塿\ud87e\uf87f\uf87e顱塴롴硵顴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶ﾴྵ឵", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ碁沁肁貁", -133412222 ]
    // 847: aload 27
    // 849: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Lnet/minecraft/class_2680; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd6e\udd4a\udd46\udd4e", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\ued32\ued32\ue232\ue532録\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\ue032\ue232\uea32\ue532", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ㥏楏\ud94f", -1407100730 ]
    // 84e: invokedynamic JNT ()Lnet/minecraft/class_2248; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -663520593, "롾塿\ud87e\uf87f\uf87e顱㡴顴塴롴硴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶\u07b5\u07b5㞵➵", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ梁梁炁肁貁", -133408852 ]
    // 853: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd46\udd5a\udd6e\udd52\udd46", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\uec32\uee32\ue232\ue532録쐲", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏㥏\ud94f奏", -1407100732 ]
    // 858: istore 28
    // 85a: iload 28
    // 85c: ifeq 254
    // 85f: iinc 14 1
    // 862: goto 0d2
    // 865: ldc_w -913771066
    // 868: dup
    // 869: dup
    // 86a: iadd
    // 86b: ishr
    // 86c: ldc_w -579492703
    // 86f: ixor
    // 870: istore 32
    // 872: goto 5ee
    // 875: iinc 21 1
    // 878: goto 101
    // 87b: aload 22
    // 87d: invokedynamic JNT ()Lnet/minecraft/class_2248; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -663520593, "롾塿\ud87e\uf87f\uf87e顱㡴顴塴롴\uf874", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶\u07b5\u07b5㞵➵", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ梁梁炁肁貁", -133408842 ]
    // 882: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd46\udd5a\udd6e\udd52\udd46", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\uec32\uee32\ue232\ue532録쐲", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏㥏\ud94f奏", -1407098254 ]
    // 887: ifne 9f3
    // 88a: aload 22
    // 88c: invokedynamic JNT ()Lnet/minecraft/class_2248; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -663520593, "롾塿\ud87e\uf87f\uf87e顱㡴顴塴롴ᡴ", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶\u07b5\u07b5㞵➵", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ梁梁炁肁貁", -133412256 ]
    // 891: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd46\udd5a\udd6e\udd52\udd46", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\uec32\uee32\ue232\ue532録쐲", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏㥏\ud94f奏", -1407098256 ]
    // 896: ifne 9f3
    // 899: aload 22
    // 89b: invokedynamic JNT ()Lnet/minecraft/class_2248; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -663520593, "롾塿\ud87e\uf87f\uf87e顱㡴顴塴롴㡴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶\u07b5\u07b5㞵➵", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ梁梁炁肁貁", -133408854 ]
    // 8a0: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd46\udd5a\udd6e\udd52\udd46", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\uec32\uee32\ue232\ue532録쐲", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏㥏\ud94f奏", -1407098194 ]
    // 8a5: ifeq 0d2
    // 8a8: goto 9f3
    // 8ab: ldc_w 1125165421
    // 8ae: ldc_w -858081375
    // 8b1: dup_x1
    // 8b2: isub
    // 8b3: ishl
    // 8b4: ldc_w -1349922037
    // 8b7: ixor
    // 8b8: istore 32
    // 8ba: goto a50
    // 8bd: iload 32
    // 8bf: ldc_w 1317958912
    // 8c2: isub
    // 8c3: ldc_w 1210003600
    // 8c6: isub
    // 8c7: ldc_w 1733228270
    // 8ca: iadd
    // 8cb: ldc_w 166449220
    // 8ce: iadd
    // 8cf: ldc_w 254412158
    // 8d2: isub
    // 8d3: ldc_w 305374144
    // 8d6: isub
    // 8d7: lookupswitch -783 4 -1191224782 -783 309767220 -1621 970331310 -550 1300140167 -259
    // 900: ldc_w -1050679200
    // 903: dup
    // 904: isub
    // 905: ldc_w 493721362
    // 908: ixor
    // 909: istore 32
    // 90b: goto 4ca
    // 90e: bipush 0
    // 90f: goto 8ab
    // 912: ldc_w 306902677
    // 915: ldc_w 913150417
    // 918: ior
    // 919: ldc_w 694492626
    // 91c: ixor
    // 91d: istore 32
    // 91f: goto 6f8
    // 922: iload 21
    // 924: bipush 16
    // 926: if_icmpge 536
    // 929: aload 17
    // 92b: iload 19
    // 92d: iload 20
    // 92f: iload 21
    // 931: invokedynamic JNT (Ljava/lang/Object;III)Lnet/minecraft/class_2680; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd42\udd46\udd46\udd52\udd5e", "鈲\uf332\uf332\uf332録\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\ue032\ue232\uea32\ue532", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏\ud94f祏㥏", -1407098191 ]
    // 936: astore 22
    // 938: iload 5
    // 93a: iload 19
    // 93c: iadd
    // 93d: istore 23
    // 93f: iload 18
    // 941: iload 20
    // 943: iadd
    // 944: istore 24
    // 946: iload 6
    // 948: iload 21
    // 94a: iadd
    // 94b: istore 25
    // 94d: aload 0
    // 94e: invokedynamic JNT (Ljava/lang/Object;)Lkc; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "㡾\ud87f\ud87e㡾", "잷\u07b7", "䂁䒁킁䲂Ⲃ貁", -133412207 ]
    // 953: invokedynamic JNT (Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\ude16\uea42\uea5a", "鈲録쐲", "\ue94a楊", -1407098193 ]
    // 958: ifeq 568
    // 95b: aload 22
    // 95d: invokedynamic JNT ()Lnet/minecraft/class_2248; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -663520593, "롾塿\ud87e\uf87f\uf87e顱塵塵塵ᡴ", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶\u07b5\u07b5㞵➵", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ梁梁炁肁貁", -133412261 ]
    // 962: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd46\udd5a\udd6e\udd52\udd46", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\uec32\uee32\ue232\ue532録쐲", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏㥏\ud94f奏", -1407098275 ]
    // 967: ifeq 568
    // 96a: aload 22
    // 96c: invokedynamic JNT ()Lnet/minecraft/class_2758; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -663520593, "롾塿\ud87e\uf87f\uf87e顱塴㡴\ud874塴顴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶\u07b5\u1fb5㞵ྵ", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ梁粁璁肁貁", -133412251 ]
    // 971: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd46\udd6e\udd5e\udd62\udd6e", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\ue132\ue032\ue332\ue532録쐲", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏㥏\ud94f奏", -1407098277 ]
    // 976: ifeq 568
    // 979: aload 22
    // 97b: invokedynamic JNT ()Lnet/minecraft/class_2758; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -663520593, "롾塿\ud87e\uf87f\uf87e顱塴㡴\ud874塴顴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶\u07b5\u1fb5㞵ྵ", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ梁粁璁肁貁", -133412257 ]
    // 980: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Comparable; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd42\udd42\udd56\udd52\udd5e", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\ue132\ue032\ue332\ue532録\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932ﴲ⤳휲⨳\udb32ⰳ\udb32\udc32혲\udf32\ue532", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏㥏\ud94f奏", -1407098279 ]
    // 985: checkcast java/lang/Integer
    // 988: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea22\uea36\uea5e\uddd6\ude02\uea3e\uea52\ude12", "鈲録\uf332", "壘䥊㥋䥊륎饊䥊륊⥊륎쥈륊᥋ॊ⥊ॊ祋", -1407098284 ]
    // 98d: istore 26
    // 98f: iload 23
    // 991: iload 24
    // 993: bipush 1
    // 994: iadd
    // 995: iload 25
    // 997: invokedynamic JNT (III)Ljava/lang/Object; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 67004896, "\udd7e\uea22\uea36\uea22\uea5e\udd76", "鈲\uf332\uf332\uf332録쀲", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏楏楏\ud94f", -1407098281 ]
    // 99c: checkcast net/minecraft/class_2338
    // 99f: astore 27
    // 9a1: aload 0
    // 9a2: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "顾\u187f", "잷\u07b7", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ沁撁悁貁", -133408765 ]
    // 9a7: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_638; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "롾塿\ud87e\uf87f\uf87e顱塴롴硵顴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶ﾴྵ឵", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ碁沁肁貁", -133408848 ]
    // 9ac: aload 27
    // 9ae: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Lnet/minecraft/class_2680; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd6e\udd4a\udd46\udd4e", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\ued32\ued32\ue232\ue532録\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\ue032\ue232\uea32\ue532", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ㥏楏\ud94f", -1407098176 ]
    // 9b3: invokedynamic JNT ()Lnet/minecraft/class_2248; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -663520593, "롾塿\ud87e\uf87f\uf87e顱塴硴ᡴ硵㡴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶\u07b5\u07b5㞵➵", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ梁梁炁肁貁", -133408774 ]
    // 9b8: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd46\udd5a\udd6e\udd52\udd46", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\uec32\uee32\ue232\ue532録쐲", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏㥏\ud94f奏", -1407098178 ]
    // 9bd: istore 28
    // 9bf: iload 26
    // 9c1: bipush 25
    // 9c3: if_icmpeq 260
    // 9c6: iload 28
    // 9c8: ifne 9e3
    // 9cb: goto 260
    // 9ce: iinc 11 1
    // 9d1: goto 900
    // 9d4: ldc_w 1523356120
    // 9d7: dup
    // 9d8: swap
    // 9d9: isub
    // 9da: ldc_w 48977678
    // 9dd: ixor
    // 9de: istore 32
    // 9e0: goto 5ee
    // 9e3: ldc_w 1296781636
    // 9e6: ldc_w -1339694101
    // 9e9: ixor
    // 9ea: ldc_w -1666336711
    // 9ed: ixor
    // 9ee: istore 32
    // 9f0: goto 6f8
    // 9f3: ldc_w 62299125
    // 9f6: ldc_w 1855849248
    // 9f9: imul
    // 9fa: ldc_w -1231027699
    // 9fd: ior
    // 9fe: ldc_w -23049569
    // a01: iand
    // a02: istore 32
    // a04: goto 779
    // a07: aload 0
    // a08: invokedynamic JNT (Ljava/lang/Object;)Lkc; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "塿\ud87e", "잷\u07b7", "䂁䒁킁䲂Ⲃ貁", -133408860 ]
    // a0d: invokedynamic JNT (Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\ude16\uea42\uea5a", "鈲録쐲", "\ue94a楊", -1407098180 ]
    // a12: ifeq 58f
    // a15: iload 9
    // a17: goto 500
    // a1a: iload 32
    // a1c: ldc_w 962219005
    // a1f: ixor
    // a20: ldc_w 911567278
    // a23: ixor
    // a24: ldc_w 77612228
    // a27: isub
    // a28: ldc_w 1649816877
    // a2b: iadd
    // a2c: ldc_w 1328087065
    // a2f: isub
    // a30: ldc_w 128695085
    // a33: ixor
    // a34: lookupswitch -992 2 123826079 -992 1152781610 -602
    // a50: iload 32
    // a52: ldc_w 1484286207
    // a55: isub
    // a56: ldc_w 388134640
    // a59: isub
    // a5a: ldc_w 1424452215
    // a5d: iadd
    // a5e: ldc_w 2015702284
    // a61: iadd
    // a62: ldc_w 1301928110
    // a65: iadd
    // a66: ldc_w 1234543675
    // a69: isub
    // a6a: lookupswitch -2279 6 -1796537317 -2641 27083855 -1566 1014648340 -808 1239696471 -2143 1474051734 -2279 1718202130 -638
    // aa4: ldc_w 1430701163
    // aa7: ldc_w -1620607252
    // aaa: iushr
    // aab: ldc_w -1807070129
    // aae: ixor
    // aaf: istore 32
    // ab1: goto 8bd
    // ab4: aload 0
    // ab5: invokedynamic JNT (Ljava/lang/Object;)Lkc; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "塾\uf87e\ud87f", "잷\u07b7", "䂁䒁킁䲂Ⲃ貁", -133408850 ]
    // aba: invokedynamic JNT (Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\ude16\uea42\uea5a", "鈲録쐲", "\ue94a楊", -1407098198 ]
    // abf: ifeq 3e8
    // ac2: aload 22
    // ac4: invokedynamic JNT ()Lnet/minecraft/class_2248; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -663520593, "롾塿\ud87e\uf87f\uf87e顱塴硴\ud874塵顴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶\u07b5\u07b5㞵➵", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ梁梁炁肁貁", -133408840 ]
    // ac9: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd46\udd5a\udd6e\udd52\udd46", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\uec32\uee32\ue232\ue532録쐲", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏㥏\ud94f奏", -1407098200 ]
    // ace: ifeq 3e8
    // ad1: iload 23
    // ad3: iload 24
    // ad5: iload 25
    // ad7: invokedynamic JNT (III)Ljava/lang/Object; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 67004896, "\udd7e\uea22\uea36\uea22\uea5e\udd76", "鈲\uf332\uf332\uf332録쀲", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏楏楏\ud94f", -1407098197 ]
    // adc: checkcast net/minecraft/class_2338
    // adf: astore 26
    // ae1: aload 0
    // ae2: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "顾\u187f", "잷\u07b7", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ沁撁悁貁", -133408849 ]
    // ae7: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_638; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "롾塿\ud87e\uf87f\uf87e顱塴롴硵顴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶ﾴྵ឵", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ碁沁肁貁", -133408692 ]
    // aec: aload 26
    // aee: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_2338; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd42\udd4e\udd4e\udd5a\udd5e", "鈲録\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\ued32\ued32\ue232\ue532", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏楏楏\ud94f", -1407098204 ]
    // af3: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Lnet/minecraft/class_2680; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd6e\udd4a\udd46\udd4e", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\ued32\ued32\ue232\ue532録\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\ue032\ue232\uea32\ue532", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ㥏楏\ud94f", -1407098201 ]
    // af8: astore 27
    // afa: aload 27
    // afc: invokedynamic JNT ()Lnet/minecraft/class_2248; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -663520593, "롾塿\ud87e\uf87f\uf87e顱塴硴\ud874塵顴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶\u07b5\u07b5㞵➵", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ梁梁炁肁貁", -133408685 ]
    // b01: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd46\udd5a\udd6e\udd52\udd46", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\uec32\uec32\uee32\ue232\ue532録쐲", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏㥏\ud94f奏", -1407098187 ]
    // b06: ifeq 430
    // b09: goto 3e8
  }

  @yet
  public void ml(lf param1) {
    // $VF: Couldn't be decompiled
    // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
    // java.lang.RuntimeException: parsing failure!
    //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
    //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
    //
    // Bytecode:
    // 000: goto 318
    // 003: ldc_w -2096754821
    // 006: ldc_w -1718943300
    // 009: imul
    // 00a: ldc_w -1006095827
    // 00d: ior
    // 00e: ldc_w -171163779
    // 011: iand
    // 012: istore 12
    // 014: goto 1f3
    // 017: ldc_w -260081776
    // 01a: ldc_w -1366855442
    // 01d: ixor
    // 01e: ldc_w -2050526695
    // 021: ior
    // 022: ldc_w -2049968453
    // 025: iand
    // 026: istore 12
    // 028: goto 3cc
    // 02b: ldc_w 490070050
    // 02e: ldc_w -238997154
    // 031: iadd
    // 032: ldc_w -1137609056
    // 035: ixor
    // 036: istore 12
    // 038: goto 3cc
    // 03b: aload 0
    // 03c: invokedynamic JNT (Ljava/lang/Object;)Ljava/util/Set; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "㡿\u187c", "잷\u07b7", "䂁䒁킁䢂⒂碂⒂岁璂炂䒂傂岁\uec81㒂炂貁", -133408643 ]
    // 041: aload 7
    // 043: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "롾塿\ud87e\uf87f\uf87e顱塵塴硵塴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶ྵ侵\u07b5ﾴ", "䂁䒁쒁", -133408694 ]
    // 048: iload 10
    // 04a: iadd
    // 04b: aload 7
    // 04d: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "롾塿\ud87e\uf87f\uf87e顱塵塴硵硴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶ྵ侵\u07b5ﾴ", "䂁䒁쒁", -133408681 ]
    // 052: iload 11
    // 054: iadd
    // 055: invokedynamic JNT (II)Ljava/lang/Object; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 67004896, "\udd7e\uea22\uea36\uea22\uea5e\udd76", "鈲\uf332\uf332録쀲", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ䥏쥏祏楏", -1407098095 ]
    // 05a: checkcast net/minecraft/class_1923
    // 05d: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -517434092, "\ude0a\uea3a\uea36\uea5e\ude02\uea22\uea36\uea4a", "鈲\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932줲\udc32퐲\udf32\udd32⸳\ue532録쐲", "壘䥊㥋䥊륎ो᥋쥊饊륎楉ॊ᥋", -1407098100 ]
    // 062: ifeq 017
    // 065: iinc 9 1
    // 068: goto 017
    // 06b: ldc_w 673625058
    // 06e: ldc_w 194971279
    // 071: ishr
    // 072: ldc_w -960075062
    // 075: ixor
    // 076: istore 12
    // 078: goto 1f3
    // 07b: iinc 10 1
    // 07e: goto 0f9
    // 081: ldc_w -138357322
    // 084: ldc_w -1775772727
    // 087: imul
    // 088: ldc_w 612474901
    // 08b: ior
    // 08c: ldc_w 1052882007
    // 08f: iand
    // 090: istore 12
    // 092: goto 130
    // 095: aload 5
    // 097: invokedynamic JNT (Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -517434092, "\uea2e\ude02\uea4a\uddb6\ude12\uea6e\uea5e", "鈲録쐲", "壘䥊㥋䥊륎ो᥋쥊饊륎쥈᥋ॊ祋䥊᥋ꥊ祋", -1407098097 ]
    // 09c: ifeq 28a
    // 09f: aload 5
    // 0a1: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -517434092, "\uea36\ude12\uea6e\uea5e", "鈲録\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932줲\udc32퐲\udf32\udd32⸳\ue532", "壘䥊㥋䥊륎ो᥋쥊饊륎쥈᥋ॊ祋䥊᥋ꥊ祋", -1407098182 ]
    // 0a6: checkcast net/minecraft/class_2338
    // 0a9: astore 6
    // 0ab: aload 1
    // 0ac: invokedynamic JNT (Ljava/lang/Object;)Loi; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "\u187c塿塾", "\uf7b7ꞷ", "䂁䒁킁岂䒂貁", -133408632 ]
    // 0b1: aload 6
    // 0b3: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd42\udd4e\udd46\udd56\udd4a", "鈲録\uf332", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏楏楏\ud94f", -1407098184 ]
    // 0b8: i2d
    // 0b9: aload 6
    // 0bb: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd42\udd4e\udd46\udd56\udd5e", "鈲録\uf332", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏楏楏\ud94f", -1407098181 ]
    // 0c0: i2d
    // 0c1: aload 6
    // 0c3: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd42\udd4e\udd46\udd56\udd4e", "鈲録\uf332", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏楏楏\ud94f", -1407098186 ]
    // 0c8: i2d
    // 0c9: aload 6
    // 0cb: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd42\udd4e\udd46\udd56\udd4a", "鈲録\uf332", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏楏楏\ud94f", -1407098183 ]
    // 0d0: bipush 1
    // 0d1: iadd
    // 0d2: i2d
    // 0d3: aload 6
    // 0d5: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd42\udd4e\udd46\udd56\udd5e", "鈲録\uf332", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏楏楏\ud94f", -1407098188 ]
    // 0da: bipush 1
    // 0db: iadd
    // 0dc: i2d
    // 0dd: aload 6
    // 0df: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd42\udd4e\udd46\udd56\udd4e", "鈲録\uf332", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ祏楏楏\ud94f", -1407098185 ]
    // 0e4: bipush 1
    // 0e5: iadd
    // 0e6: i2d
    // 0e7: aload 4
    // 0e9: aload 4
    // 0eb: invokedynamic JNT ()Ls; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -663520593, "㡿塽塿", "ﾶ", "䂁䒁킁沂貁", -133408733 ]
    // 0f0: bipush 0
    // 0f1: invokedynamic JNT (Ljava/lang/Object;DDDDDDLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\ude12\uea36", "鈲︲︲︲︲︲︲\uf632\u2433⠳\ue532\uf632\u2433⠳\ue532\uf632ⴳ\ue532\uf332録쀲", "ꥊ쥊", -1407098107 ]
    // 0f6: goto 10d
    // 0f9: ldc_w 1982500722
    // 0fc: ldc_w 1930384628
    // 0ff: iushr
    // 100: ldc_w -676178035
    // 103: ior
    // 104: ldc_w -138750051
    // 107: iand
    // 108: istore 12
    // 10a: goto 130
    // 10d: ldc_w 160972569
    // 110: ldc_w -1486461631
    // 113: ior
    // 114: ldc_w -673884543
    // 117: ixor
    // 118: istore 12
    // 11a: goto 385
    // 11d: iload 11
    // 11f: bipush 1
    // 120: if_icmpgt 1cf
    // 123: iload 10
    // 125: ifne 02b
    // 128: iload 11
    // 12a: ifne 02b
    // 12d: goto 017
    // 130: iload 12
    // 132: ldc_w 1108980086
    // 135: iadd
    // 136: ldc_w 1150957497
    // 139: iadd
    // 13a: ldc_w 1209274621
    // 13d: iadd
    // 13e: ldc_w 142847414
    // 141: ixor
    // 142: ldc_w 94420720
    // 145: ixor
    // 146: ldc_w 1053565983
    // 149: ixor
    // 14a: lookupswitch 99 3 -1785370912 99 -832136742 394 637884562 84
    // 16c: aload 0
    // 16d: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "顾\u187f", "잷\u07b7", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ沁撁悁貁", -133408691 ]
    // 172: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_638; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "롾塿\ud87e\uf87f\uf87e顱塴롴硵顴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶ﾴྵ឵", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ碁沁肁貁", -133408742 ]
    // 177: aload 7
    // 179: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "롾塿\ud87e\uf87f\uf87e顱塵塴硵塴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶ྵ侵\u07b5ﾴ", "䂁䒁쒁", -133408729 ]
    // 17e: aload 7
    // 180: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "롾塿\ud87e\uf87f\uf87e顱塵塴硵硴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶ྵ侵\u07b5ﾴ", "䂁䒁쒁", -133408700 ]
    // 185: invokedynamic JNT (Ljava/lang/Object;II)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd6e\udd4a\udd62\udd4a", "鈲\uf332\uf332録쐲", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ㥏楏\ud94f", -1407098852 ]
    // 18a: ifne 06b
    // 18d: goto 3b8
    // 190: aload 0
    // 191: aload 7
    // 193: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\ude12\uea52", "鈲\uf632⠳\udf32⸳\ue932휲팲⠳\udf32\udd32ⰳ\udb32퀲⸳\ue932\udd32혲\udb32ⴳⴳ\ud932\ueb32\ue332\uec32\ued32\ue532録쐲", "壘祋", -1407098849 ]
    // 198: ifeq 272
    // 19b: goto 3b8
    // 19e: iload 9
    // 1a0: bipush 3
    // 1a1: if_icmpge 081
    // 1a4: goto 3b8
    // 1a7: iinc 11 1
    // 1aa: goto 1b9
    // 1ad: iload 10
    // 1af: bipush 1
    // 1b0: if_icmpgt 329
    // 1b3: bipush -1
    // 1b4: istore 11
    // 1b6: goto 1b9
    // 1b9: ldc_w 582914828
    // 1bc: ldc_w 332667457
    // 1bf: dup
    // 1c0: iand
    // 1c1: iadd
    // 1c2: ldc_w 1208287891
    // 1c5: ior
    // 1c6: ldc_w -905486413
    // 1c9: iand
    // 1ca: istore 12
    // 1cc: goto 3cc
    // 1cf: ldc_w -1148354619
    // 1d2: ldc_w 317756971
    // 1d5: imul
    // 1d6: ldc_w 811581909
    // 1d9: ixor
    // 1da: istore 12
    // 1dc: goto 3cc
    // 1df: ldc_w 369528453
    // 1e2: ldc_w -1446918429
    // 1e5: ixor
    // 1e6: ldc_w 1967396352
    // 1e9: ior
    // 1ea: ldc_w -10733948
    // 1ed: iand
    // 1ee: istore 12
    // 1f0: goto 29e
    // 1f3: iload 12
    // 1f5: ldc_w 935283869
    // 1f8: isub
    // 1f9: ldc_w 1719823048
    // 1fc: iadd
    // 1fd: ldc_w 1726239131
    // 200: iadd
    // 201: ldc_w 322787236
    // 204: isub
    // 205: ldc_w 1884831901
    // 208: ixor
    // 209: ldc_w 1317630973
    // 20c: iadd
    // 20d: lookupswitch -125 3 -2014214607 275 86869872 -161 1718847231 -125
    // 230: aload 0
    // 231: invokedynamic JNT (Ljava/lang/Object;)Ljava/util/Set; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "\uf87c\uf87f", "잷\u07b7", "䂁䒁킁䢂⒂碂⒂岁璂炂䒂傂岁\uec81㒂炂貁", -133408693 ]
    // 236: invokedynamic JNT (Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -517434092, "\uea22\uea4a\udd92\uea32\uea4e\uea5e\uea62", "鈲録쐲", "壘䥊㥋䥊륎ो᥋쥊饊륎楉ॊ᥋", -1407098099 ]
    // 23b: ifne 28a
    // 23e: bipush 0
    // 23f: sipush 255
    // 242: sipush 255
    // 245: iload 2
    // 246: invokedynamic JNT (IIII)Ljava/lang/Object; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 67004896, "\udd7e\uea22\uea36\uea22\uea5e\udd76", "鈲\uf332\uf332\uf332\uf332録쀲", "屢륊", -1407098104 ]
    // 24b: checkcast zn
    // 24e: astore 4
    // 250: aload 0
    // 251: invokedynamic JNT (Ljava/lang/Object;)Ljava/util/Set; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "\uf87c\uf87f", "잷\u07b7", "䂁䒁킁䢂⒂碂⒂岁璂炂䒂傂岁\uec81㒂炂貁", -133408702 ]
    // 256: aload 0
    // 257: invokedynamic test (Ljr;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, jr.kwz (Lnet/minecraft/class_2338;)Z, (Lnet/minecraft/class_2338;)Z ]
    // 25c: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -517434092, "\uea46\ude12\uea32\uea3a\uea56\ude12\udda2\ude16", "鈲\uf632퐲\udb32″\udb32\ue932⼳⸳팲혲\ue932퀲⼳⠳\udd32⸳팲⤳⠳\ue932쨲ⰳ\udf32\ude32팲\udd32\udb32⸳\udf32\ue532録쐲", "壘䥊㥋䥊륎ो᥋쥊饊륎楉ॊ᥋", -1407098106 ]
    // 261: pop
    // 262: aload 0
    // 263: invokedynamic JNT (Ljava/lang/Object;)Ljava/util/Set; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "\uf87c\uf87f", "잷\u07b7", "䂁䒁킁䢂⒂碂⒂岁璂炂䒂傂岁\uec81㒂炂貁", -133408660 ]
    // 268: invokedynamic JNT (Ljava/lang/Object;)Ljava/util/Iterator; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -517434092, "\uea22\uea5e\ude12\uea46\ude02\uea5e\uea3a\uea46", "鈲録\uf632퐲\udb32″\udb32\ue932⼳⸳팲혲\ue932\uf332⸳\udf32ⰳ\udb32⸳⤳ⰳ\ue532", "壘䥊㥋䥊륎ो᥋쥊饊륎楉ॊ᥋", -1407098108 ]
    // 26d: astore 5
    // 26f: goto 10d
    // 272: ldc_w -2002595899
    // 275: ldc_w 1999779608
    // 278: ldc_w 295398253
    // 27b: ishl
    // 27c: ixor
    // 27d: ldc_w 76690376
    // 280: ior
    // 281: ldc_w 1706703836
    // 284: iand
    // 285: istore 12
    // 287: goto 1f3
    // 28a: ldc_w 1477599868
    // 28d: ldc_w -1081534019
    // 290: ior
    // 291: ldc_w 952541288
    // 294: ior
    // 295: ldc_w 2059840638
    // 298: iand
    // 299: istore 12
    // 29b: goto 29e
    // 29e: iload 12
    // 2a0: ldc_w 659592754
    // 2a3: iadd
    // 2a4: ldc_w 1972639067
    // 2a7: ixor
    // 2a8: ldc_w 697362938
    // 2ab: iadd
    // 2ac: ldc_w 711035104
    // 2af: isub
    // 2b0: ldc_w 809858768
    // 2b3: iadd
    // 2b4: ldc_w 1234241490
    // 2b7: isub
    // 2b8: lookupswitch 344 2 -1117324275 344 954501509 -136
    // 2d4: aload 1
    // 2d5: invokedynamic JNT (Ljava/lang/Object;)Loi; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "\u187c塿塾", "\uf7b7ꞷ", "䂁䒁킁岂䒂貁", -133408650 ]
    // 2da: aload 7
    // 2dc: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd6e\udd4a\udd46\udd56", "鈲録\uf332", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ䥏쥏祏楏", -1407098190 ]
    // 2e1: i2d
    // 2e2: ldc2_w 63.0
    // 2e5: aload 7
    // 2e7: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd6e\udd4a\udd46\udd6e", "鈲録\uf332", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ䥏쥏祏楏", -1407098219 ]
    // 2ec: i2d
    // 2ed: aload 7
    // 2ef: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd6e\udd4a\udd46\udd56", "鈲録\uf332", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ䥏쥏祏楏", -1407098192 ]
    // 2f4: bipush 16
    // 2f6: iadd
    // 2f7: i2d
    // 2f8: ldc2_w 63.1
    // 2fb: aload 7
    // 2fd: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea32\ude12\uea5e\uea2e\uea3a\ude1e\uddfa\udd6e\udd4a\udd46\udd6e", "鈲録\uf332", "륊ॊ᥋륎襊쥊륊ॊ楊祋䥊㥊᥋륎楊饊䥊楋楋ꥉ䥏쥏祏楏", -1407098189 ]
    // 302: bipush 16
    // 304: iadd
    // 305: i2d
    // 306: aload 4
    // 308: aload 4
    // 30a: invokedynamic JNT ()Ls; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -663520593, "㡿塽塿", "ﾶ", "䂁䒁킁沂貁", -133408649 ]
    // 30f: bipush 0
    // 310: invokedynamic JNT (Ljava/lang/Object;DDDDDDLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\ude12\uea36", "鈲︲︲︲︲︲︲\uf632\u2433⠳\ue532\uf632\u2433⠳\ue532\uf632ⴳ\ue532\uf332録쀲", "ꥊ쥊", -1407098127 ]
    // 315: goto 3b8
    // 318: ldc_w -417303816
    // 31b: istore 12
    // 31d: goto 33a
    // 320: bipush 0
    // 321: istore 9
    // 323: bipush -1
    // 324: istore 10
    // 326: goto 0f9
    // 329: ldc_w 1301760512
    // 32c: ldc_w -1824122181
    // 32f: swap
    // 330: iadd
    // 331: ldc_w -1476456156
    // 334: ixor
    // 335: istore 12
    // 337: goto 130
    // 33a: aload 0
    // 33b: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "顾\u187f", "잷\u07b7", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ沁撁悁貁", -133408687 ]
    // 340: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_638; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "롾塿\ud87e\uf87f\uf87e顱塴롴硵顴", "\ue7b7꾷㞷\ue7b5\uefb7쾷\ue7b7꾷羷\u07b7辷ꞷ㞷\ue7b5羷\uf7b7辷ﾶﾶ徶ﾴྵ឵", "䂁䒁킁墂㒂炂岁咂䒂墂㒂Ⲃ梂⒂㢂炂岁Ⲃ傂⒂沂沂ᲂ碁沁肁貁", -133408738 ]
    // 345: ifnonnull 411
    // 348: return
    // 349: aload 5
    // 34b: invokedynamic JNT (Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -517434092, "\uea2e\ude02\uea4a\uddb6\ude12\uea6e\uea5e", "鈲録쐲", "壘䥊㥋䥊륎ो᥋쥊饊륎쥈᥋ॊ祋䥊᥋ꥊ祋", -1407098214 ]
    // 350: ifeq 1df
    // 353: aload 5
    // 355: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -517434092, "\uea36\ude12\uea6e\uea5e", "鈲録\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932줲\udc32퐲\udf32\udd32⸳\ue532", "壘䥊㥋䥊륎ो᥋쥊饊륎쥈᥋ॊ祋䥊᥋ꥊ祋", -1407098211 ]
    // 35a: checkcast java/util/Map$Entry
    // 35d: astore 6
    // 35f: aload 6
    // 361: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -517434092, "\ude1a\ude12\uea5e\uddaa\ude12\uea62", "鈲録\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932줲\udc32퐲\udf32\udd32⸳\ue532", "壘䥊㥋䥊륎ो᥋쥊饊륎襈䥊奋᥎ै륊᥋祋쥋", -1407098216 ]
    // 366: checkcast net/minecraft/class_1923
    // 369: astore 7
    // 36b: aload 6
    // 36d: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -517434092, "\ude1a\ude12\uea5e\uddd6\ude02\uea3e\uea52\ude12", "鈲録\uf632퐲\udb32″\udb32\ue932혲\udb32⠳턲\ue932줲\udc32퐲\udf32\udd32⸳\ue532", "壘䥊㥋䥊륎ो᥋쥊饊륎襈䥊奋᥎ै륊᥋祋쥋", -1407098213 ]
    // 372: checkcast java/lang/Integer
    // 375: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea22\uea36\uea5e\uddd6\ude02\uea3e\uea52\ude12", "鈲録\uf332", "壘䥊㥋䥊륎饊䥊륊⥊륎쥈륊᥋ॊ⥊ॊ祋", -1407098218 ]
    // 37a: istore 8
    // 37c: iload 8
    // 37e: iload 3
    // 37f: if_icmpge 003
    // 382: goto 3b8
    // 385: iload 12
    // 387: ldc_w 893543504
    // 38a: isub
    // 38b: ldc_w 1072251096
    // 38e: ixor
    // 38f: ldc_w 370581431
    // 392: isub
    // 393: ldc_w 673115403
    // 396: isub
    // 397: ldc_w 1926045733
    // 39a: ixor
    // 39b: ldc_w 527159599
    // 39e: iadd
    // 39f: lookupswitch -778 2 1802676698 -778 2103725229 -86
    // 3b8: ldc_w 1122565007
    // 3bb: ldc_w -271056167
    // 3be: isub
    // 3bf: ldc_w -2050618107
    // 3c2: ior
    // 3c3: ldc_w -1880683179
    // 3c6: iand
    // 3c7: istore 12
    // 3c9: goto 385
    // 3cc: iload 12
    // 3ce: ldc_w 1829728238
    // 3d1: ixor
    // 3d2: ldc_w 1022529921
    // 3d5: iadd
    // 3d6: ldc_w 1991400878
    // 3d9: iadd
    // 3da: ldc_w 995690837
    // 3dd: ixor
    // 3de: ldc_w 1253047014
    // 3e1: ixor
    // 3e2: ldc_w 1166596038
    // 3e5: isub
    // 3e6: lookupswitch -939 4 -1659753336 -939 -1475665167 -575 801633058 -875 1708319833 -713
    // 410: return
    // 411: aload 0
    // 412: invokedynamic JNT (Ljava/lang/Object;)Lrt; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "\uf87f\u187c\u187f", "잷\u07b7", "䂁䒁킁梂炂貁", -133408580 ]
    // 417: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea5a\uea32\ude06", "鈲録\uf332", "祋᥋", -1407098220 ]
    // 41c: istore 2
    // 41d: aload 0
    // 41e: invokedynamic JNT (Ljava/lang/Object;)Lrt; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "㡾\ud87f顾", "잷\u07b7", "䂁䒁킁梂炂貁", -133408570 ]
    // 423: invokedynamic JNT (Ljava/lang/Object;)I bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea5a\uea32\ude06", "鈲録\uf332", "祋᥋", -1407098110 ]
    // 428: istore 3
    // 429: aload 0
    // 42a: invokedynamic JNT (Ljava/lang/Object;)Ljava/util/concurrent/ConcurrentHashMap; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "롾塼硽", "잷\u07b7", "䂁䒁킁䢂⒂碂⒂岁璂炂䒂傂岁Ⲃ岂墂Ⲃ璂梂梂㒂墂炂岁겁岂墂Ⲃ璂梂梂㒂墂炂삁⒂沂䂂풁⒂悂貁", -133408656 ]
    // 42f: invokedynamic JNT (Ljava/lang/Object;)Z bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\uea22\uea4a\udd92\uea32\uea4e\uea5e\uea62", "鈲録쐲", "壘䥊㥋䥊륎ो᥋쥊饊륎楊ꥊ륊楊ो祋祋ॊ륊᥋륎楈ꥊ륊楊ो祋祋ॊ륊᥋\ud948䥊楋\ud94a襈䥊奋", -1407098112 ]
    // 434: ifne 1df
    // 437: sipush 255
    // 43a: bipush 0
    // 43b: bipush 0
    // 43c: iload 2
    // 43d: invokedynamic JNT (IIII)Ljava/lang/Object; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 67004896, "\udd7e\uea22\uea36\uea22\uea5e\udd76", "鈲\uf332\uf332\uf332\uf332録쀲", "屢륊", -1407098109 ]
    // 442: checkcast zn
    // 445: astore 4
    // 447: aload 0
    // 448: invokedynamic JNT (Ljava/lang/Object;)Ljava/util/concurrent/ConcurrentHashMap; bsm=jr.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1760821587, "롾塼硽", "잷\u07b7", "䂁䒁킁䢂⒂碂⒂岁璂炂䒂傂岁Ⲃ岂墂Ⲃ璂梂梂㒂墂炂岁겁岂墂Ⲃ璂梂梂㒂墂炂삁⒂沂䂂풁⒂悂貁", -133408569 ]
    // 44d: invokedynamic JNT (Ljava/lang/Object;)Ljava/util/Set; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -836480447, "\ude12\uea36\uea5e\uea46\uea62\uddca\ude12\uea5e", "鈲録\uf632퐲\udb32″\udb32\ue932⼳⸳팲혲\ue932촲\udf32⸳\ue532", "壘䥊㥋䥊륎ो᥋쥊饊륎楊ꥊ륊楊ो祋祋ॊ륊᥋륎楈ꥊ륊楊ो祋祋ॊ륊᥋\ud948䥊楋\ud94a襈䥊奋", -1407098111 ]
    // 452: invokedynamic JNT (Ljava/lang/Object;)Ljava/util/Iterator; bsm=jr.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -517434092, "\uea22\uea5e\ude12\uea46\ude02\uea5e\uea3a\uea46", "鈲録\uf632퐲\udb32″\udb32\ue932⼳⸳팲혲\ue932\uf332⸳\udf32ⰳ\udb32⸳⤳ⰳ\ue532", "壘䥊㥋䥊륎ो᥋쥊饊륎楉ॊ᥋", -1407098116 ]
    // 457: astore 5
    // 459: goto 3b8
  }

  static {
    Loader.init(jr.class);
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (((var10 + 2132564924 ^ 1035540558) - 421175061 ^ 930764158) - 1941750002 ^ 1788261340) - 723383892 ^ 451731852 ^ 1834618954;
    MethodHandle var10000 = vbk[(((var10 + 2132564924 ^ 1035540558) - 421175061 ^ 930764158) - 1941750002 ^ 1788261340) - 723383892
      ^ 451731852
      ^ 1834618954
      ^ 1712446605];
    if (vbk[var10001 ^ 1712446605] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (310199930 * -1486341506 | 0) & 1074504529; var23 < var13.length(); var23 += 1174598337 + 1831038164 ^ -1289330796) {
        int var42 = var13.charAt(var23);
        int var10004 = (var42 & 65535) >> 0;
        int var43 = ((var42 & 65535) >> 0 | var42 << 16) + 161;
        int var93 = (((var42 & 65535) >> 0 | var42 << 16) + 161 & 65520) >> 4;
        var42 = (((var10004 | var42 << 16) + 161 & 65520) >> 4 | ((var42 & 65535) >> 0 | var42 << 16) + 161 << 12) + 52;
        var10004 = ((var93 | var43 << 12) + 52 & 65532) >> 2;
        int var45 = (((var93 | var43 << 12) + 52 & 65532) >> 2 | var42 << 14) ^ 88;
        int var95 = (((((var93 | var43 << 12) + 52 & 65532) >> 2 | var42 << 14) ^ 88) & 64512) >> 10;
        var42 = (((var10004 | var42 << 14) ^ 88) & 64512) >> 10 | ((((var93 | var43 << 12) + 52 & 65532) >> 2 | var42 << 14) ^ 88) << 6;
        var10004 = ((var95 | var45 << 6) & 65520) >> 4;
        int var47 = (((var95 | var45 << 6) & 65520) >> 4 | var42 << 12) + 154;
        int var97 = ((((var95 | var45 << 6) & 65520) >> 4 | var42 << 12) + 154 & 49152) >> 14;
        char var48 = (char)(((var10004 | var42 << 12) + 154 & 49152) >> 14 | (((var95 | var45 << 6) & 65520) >> 4 | var42 << 12) + 154 << 2);
        var13.setCharAt(var23, (char)(var97 | var47 << 2));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (1911116970 ^ 1911116970 | 0) & 750005393; var29 < var16.length(); var29 += (1940792212 | -1759538747 + -2064337570 | 1) & 2113) {
        int var53 = var16.charAt(var29);
        int var98 = (var53 & 65520) >> 4;
        int var54 = (var53 & 65520) >> 4 | var53 << 12;
        int var99 = (((var53 & 65520) >> 4 | var53 << 12) & 65024) >> 9;
        var53 = (((var98 | var53 << 12) & 65024) >> 9 | ((var53 & 65520) >> 4 | var53 << 12) << 7) - 173 - 229;
        var98 = ((var99 | var54 << 7) - 173 - 229 & 63488) >> 11;
        int var56 = ((var99 | var54 << 7) - 173 - 229 & 63488) >> 11 | var53 << 5;
        int var101 = ((((var99 | var54 << 7) - 173 - 229 & 63488) >> 11 | var53 << 5) & 65535) >> 0;
        char var57 = (char)(
          ((((var98 | var53 << 5) & 65535) >> 0 | (((var99 | var54 << 7) - 173 - 229 & 63488) >> 11 | var53 << 5) << 16) ^ 40) - 84 + 167 - 165
        );
        var16.setCharAt(var29, (char)(((var101 | var56 << 16) ^ 40) - 84 + 167 - 165));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), jr.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = 2091312688 & -653634117 ^ 1476543536; var35 < var19.length(); var35 += (-1385616283 & -1224853926 >> 1335904234 | 0) & 311432001) {
        int var62 = var19.charAt(var35);
        int var102 = (var62 & 65504) >> 5;
        int var63 = (var62 & 65504) >> 5 | var62 << 11;
        int var103 = (((var62 & 65504) >> 5 | var62 << 11) & 65528) >> 3;
        var62 = ((var102 | var62 << 11) & 65528) >> 3 | ((var62 & 65504) >> 5 | var62 << 11) << 13;
        var102 = ((var103 | var63 << 13) & 64512) >> 10;
        int var65 = (((var103 | var63 << 13) & 64512) >> 10 | var62 << 6) - 26 ^ 177;
        int var105 = (((((var103 | var63 << 13) & 64512) >> 10 | var62 << 6) - 26 ^ 177) & 65408) >> 7;
        var62 = (((var102 | var62 << 6) - 26 ^ 177) & 65408) >> 7 | ((((var103 | var63 << 13) & 64512) >> 10 | var62 << 6) - 26 ^ 177) << 9;
        var102 = ((var105 | var65 << 9) & 61440) >> 12;
        int var67 = (((var105 | var65 << 9) & 61440) >> 12 | var62 << 4) ^ 81;
        int var107 = (((((var105 | var65 << 9) & 61440) >> 12 | var62 << 4) ^ 81) & 65408) >> 7;
        char var68 = (char)(((((var102 | var62 << 4) ^ 81) & 65408) >> 7 | ((((var105 | var65 << 9) & 61440) >> 12 | var62 << 4) ^ 81) << 9) ^ 5);
        var19.setCharAt(var35, (char)((var107 | var67 << 9) ^ 5));
      }

      Class var7 = Class.forName(var19.toString(), false, jr.class.getClassLoader());
      switch ((((var4 - 402540659 + 1540459610 - 822079023 + 1384969237 ^ 87869302) + 1019917451 ^ 1017124323) + 2096479192 ^ 1560432477) - 1301551411) {
        case 32284109:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 390250385:
        case 1132885426:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1137826324:
          var10000 = var0.findSpecial(var7, var5, var6, jr.class);
          break;
        case 1273195300:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    vbk[(((var10 + 2132564924 ^ 1035540558) - 421175061 ^ 930764158) - 1941750002 ^ 1788261340) - 723383892 ^ 451731852 ^ 1834618954 ^ 1712446605] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 - 1276141977 ^ 1676388313) - 166371843 + 1453958794 - 475177462 + 1128042236 ^ 904966485) + 1905961770 ^ 539986124;
    MethodHandle var10000 = vbk[(((var10 - 1276141977 ^ 1676388313) - 166371843 + 1453958794 - 475177462 + 1128042236 ^ 904966485) + 1905961770 ^ 539986124)
      - 1607144675];
    if (vbk[var10001 - 1607144675] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (47930514 * -914682900 | 0) & 1352671781; var24 < var14.length(); var24 += -926033972 ^ 224564880 ^ -978370211) {
        int var43 = var14.charAt(var24) ^ 'v';
        char var50 = (char)(
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
                                                              ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4)
                                                                & 64512
                                                            )
                                                            >> 10
                                                          | ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4)
                                                            << 6
                                                      )
                                                      ^ 15
                                                  )
                                                  & 65408
                                              )
                                              >> 7
                                            | (
                                                (
                                                    (((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) & 64512)
                                                        >> 10
                                                      | ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) << 6
                                                  )
                                                  ^ 15
                                              )
                                              << 9
                                        )
                                        & 65535
                                    )
                                    >> 0
                                  | (
                                      (
                                            (
                                                (
                                                    (((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) & 64512)
                                                        >> 10
                                                      | ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) << 6
                                                  )
                                                  ^ 15
                                              )
                                              & 65408
                                          )
                                          >> 7
                                        | (
                                            (
                                                (((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) & 64512)
                                                    >> 10
                                                  | ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) << 6
                                              )
                                              ^ 15
                                          )
                                          << 9
                                    )
                                    << 16
                              )
                              + 1
                            & 63488
                        )
                        >> 11
                      | (
                            (
                                  (
                                      (
                                            (
                                                (
                                                    (((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) & 64512)
                                                        >> 10
                                                      | ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) << 6
                                                  )
                                                  ^ 15
                                              )
                                              & 65408
                                          )
                                          >> 7
                                        | (
                                            (
                                                (((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) & 64512)
                                                    >> 10
                                                  | ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) << 6
                                              )
                                              ^ 15
                                          )
                                          << 9
                                    )
                                    & 65535
                                )
                                >> 0
                              | (
                                  (
                                        (
                                            (
                                                (((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) & 64512)
                                                    >> 10
                                                  | ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) << 6
                                              )
                                              ^ 15
                                          )
                                          & 65408
                                      )
                                      >> 7
                                    | (
                                        (
                                            (((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) & 64512) >> 10
                                              | ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) << 6
                                          )
                                          ^ 15
                                      )
                                      << 9
                                )
                                << 16
                          )
                          + 1
                        << 5
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
                                                (
                                                    (((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) & 64512)
                                                        >> 10
                                                      | ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) << 6
                                                  )
                                                  ^ 15
                                              )
                                              & 65408
                                          )
                                          >> 7
                                        | (
                                            (
                                                (((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) & 64512)
                                                    >> 10
                                                  | ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) << 6
                                              )
                                              ^ 15
                                          )
                                          << 9
                                    )
                                    & 65535
                                )
                                >> 0
                              | (
                                  (
                                        (
                                            (
                                                (((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) & 64512)
                                                    >> 10
                                                  | ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) << 6
                                              )
                                              ^ 15
                                          )
                                          & 65408
                                      )
                                      >> 7
                                    | (
                                        (
                                            (((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) & 64512) >> 10
                                              | ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) << 6
                                          )
                                          ^ 15
                                      )
                                      << 9
                                )
                                << 16
                          )
                          + 1
                        & 63488
                    )
                    >> 11
                  | (
                        (
                              (
                                  (
                                        (
                                            (
                                                (((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) & 64512)
                                                    >> 10
                                                  | ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) << 6
                                              )
                                              ^ 15
                                          )
                                          & 65408
                                      )
                                      >> 7
                                    | (
                                        (
                                            (((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) & 64512) >> 10
                                              | ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) << 6
                                          )
                                          ^ 15
                                      )
                                      << 9
                                )
                                & 65535
                            )
                            >> 0
                          | (
                              (
                                    (
                                        (
                                            (((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) & 64512) >> 10
                                              | ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) << 6
                                          )
                                          ^ 15
                                      )
                                      & 65408
                                  )
                                  >> 7
                                | (
                                    (
                                        (((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) & 64512) >> 10
                                          | ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) << 6
                                      )
                                      ^ 15
                                  )
                                  << 9
                            )
                            << 16
                      )
                      + 1
                    << 5
              )
              << 16
        );
        var14.setCharAt(
          var24,
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
                                                                    (((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12
                                                                      | ((var43 & 65504) >> 5 | var43 << 11) << 4
                                                                  )
                                                                  & 64512
                                                              )
                                                              >> 10
                                                            | ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4)
                                                              << 6
                                                        )
                                                        ^ 15
                                                    )
                                                    & 65408
                                                )
                                                >> 7
                                              | (
                                                  (
                                                      (
                                                            ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4)
                                                              & 64512
                                                          )
                                                          >> 10
                                                        | ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4)
                                                          << 6
                                                    )
                                                    ^ 15
                                                )
                                                << 9
                                          )
                                          & 65535
                                      )
                                      >> 0
                                    | (
                                        (
                                              (
                                                  (
                                                      (
                                                            ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4)
                                                              & 64512
                                                          )
                                                          >> 10
                                                        | ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4)
                                                          << 6
                                                    )
                                                    ^ 15
                                                )
                                                & 65408
                                            )
                                            >> 7
                                          | (
                                              (
                                                  (((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) & 64512)
                                                      >> 10
                                                    | ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) << 6
                                                )
                                                ^ 15
                                            )
                                            << 9
                                      )
                                      << 16
                                )
                                + 1
                              & 63488
                          )
                          >> 11
                        | (
                              (
                                    (
                                        (
                                              (
                                                  (
                                                      (
                                                            ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4)
                                                              & 64512
                                                          )
                                                          >> 10
                                                        | ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4)
                                                          << 6
                                                    )
                                                    ^ 15
                                                )
                                                & 65408
                                            )
                                            >> 7
                                          | (
                                              (
                                                  (((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) & 64512)
                                                      >> 10
                                                    | ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) << 6
                                                )
                                                ^ 15
                                            )
                                            << 9
                                      )
                                      & 65535
                                  )
                                  >> 0
                                | (
                                    (
                                          (
                                              (
                                                  (((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) & 64512)
                                                      >> 10
                                                    | ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) << 6
                                                )
                                                ^ 15
                                            )
                                            & 65408
                                        )
                                        >> 7
                                      | (
                                          (
                                              (((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) & 64512)
                                                  >> 10
                                                | ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) << 6
                                            )
                                            ^ 15
                                        )
                                        << 9
                                  )
                                  << 16
                            )
                            + 1
                          << 5
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
                                                  (
                                                      (
                                                            ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4)
                                                              & 64512
                                                          )
                                                          >> 10
                                                        | ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4)
                                                          << 6
                                                    )
                                                    ^ 15
                                                )
                                                & 65408
                                            )
                                            >> 7
                                          | (
                                              (
                                                  (((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) & 64512)
                                                      >> 10
                                                    | ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) << 6
                                                )
                                                ^ 15
                                            )
                                            << 9
                                      )
                                      & 65535
                                  )
                                  >> 0
                                | (
                                    (
                                          (
                                              (
                                                  (((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) & 64512)
                                                      >> 10
                                                    | ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) << 6
                                                )
                                                ^ 15
                                            )
                                            & 65408
                                        )
                                        >> 7
                                      | (
                                          (
                                              (((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) & 64512)
                                                  >> 10
                                                | ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) << 6
                                            )
                                            ^ 15
                                        )
                                        << 9
                                  )
                                  << 16
                            )
                            + 1
                          & 63488
                      )
                      >> 11
                    | (
                          (
                                (
                                    (
                                          (
                                              (
                                                  (((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) & 64512)
                                                      >> 10
                                                    | ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) << 6
                                                )
                                                ^ 15
                                            )
                                            & 65408
                                        )
                                        >> 7
                                      | (
                                          (
                                              (((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) & 64512)
                                                  >> 10
                                                | ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) << 6
                                            )
                                            ^ 15
                                        )
                                        << 9
                                  )
                                  & 65535
                              )
                              >> 0
                            | (
                                (
                                      (
                                          (
                                              (((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) & 64512)
                                                  >> 10
                                                | ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) << 6
                                            )
                                            ^ 15
                                        )
                                        & 65408
                                    )
                                    >> 7
                                  | (
                                      (
                                          (((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) & 64512) >> 10
                                            | ((((var43 & 65504) >> 5 | var43 << 11) & 61440) >> 12 | ((var43 & 65504) >> 5 | var43 << 11) << 4) << 6
                                        )
                                        ^ 15
                                    )
                                    << 9
                              )
                              << 16
                        )
                        + 1
                      << 5
                )
                << 16
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = -204842356 ^ -1674498462 ^ 1878750446; var30 < var17.length(); var30 += (2015278069 << 633924127 | 1) & 2057388281) {
        char var55 = var17.charAt(var30);
        char var62 = (char)(
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
                                                                  (
                                                                      (((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1
                                                                        | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15
                                                                    )
                                                                    ^ 1
                                                                )
                                                                + 148
                                                              & 64512
                                                          )
                                                          >> 10
                                                        | (
                                                              (
                                                                  (((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1
                                                                    | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15
                                                                )
                                                                ^ 1
                                                            )
                                                            + 148
                                                          << 6
                                                    )
                                                    & 61440
                                                )
                                                >> 12
                                              | (
                                                  (
                                                        (
                                                              (
                                                                  (((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1
                                                                    | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15
                                                                )
                                                                ^ 1
                                                            )
                                                            + 148
                                                          & 64512
                                                      )
                                                      >> 10
                                                    | (
                                                          (
                                                              (((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1
                                                                | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15
                                                            )
                                                            ^ 1
                                                        )
                                                        + 148
                                                      << 6
                                                )
                                                << 4
                                          )
                                          ^ 154
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
                                                              (
                                                                  (((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1
                                                                    | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15
                                                                )
                                                                ^ 1
                                                            )
                                                            + 148
                                                          & 64512
                                                      )
                                                      >> 10
                                                    | (
                                                          (
                                                              (((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1
                                                                | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15
                                                            )
                                                            ^ 1
                                                        )
                                                        + 148
                                                      << 6
                                                )
                                                & 61440
                                            )
                                            >> 12
                                          | (
                                              (
                                                    (
                                                          (
                                                              (((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1
                                                                | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15
                                                            )
                                                            ^ 1
                                                        )
                                                        + 148
                                                      & 64512
                                                  )
                                                  >> 10
                                                | (((((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1 | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15) ^ 1)
                                                    + 148
                                                  << 6
                                            )
                                            << 4
                                      )
                                      ^ 154
                                  )
                                  << 1
                            )
                            & 65520
                        )
                        >> 4
                      | (
                          (
                                (
                                    (
                                        (
                                              (
                                                  (
                                                        (
                                                              (
                                                                  (((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1
                                                                    | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15
                                                                )
                                                                ^ 1
                                                            )
                                                            + 148
                                                          & 64512
                                                      )
                                                      >> 10
                                                    | (
                                                          (
                                                              (((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1
                                                                | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15
                                                            )
                                                            ^ 1
                                                        )
                                                        + 148
                                                      << 6
                                                )
                                                & 61440
                                            )
                                            >> 12
                                          | (
                                              (
                                                    (
                                                          (
                                                              (((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1
                                                                | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15
                                                            )
                                                            ^ 1
                                                        )
                                                        + 148
                                                      & 64512
                                                  )
                                                  >> 10
                                                | (((((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1 | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15) ^ 1)
                                                    + 148
                                                  << 6
                                            )
                                            << 4
                                      )
                                      ^ 154
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
                                                          (
                                                              (((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1
                                                                | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15
                                                            )
                                                            ^ 1
                                                        )
                                                        + 148
                                                      & 64512
                                                  )
                                                  >> 10
                                                | (((((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1 | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15) ^ 1)
                                                    + 148
                                                  << 6
                                            )
                                            & 61440
                                        )
                                        >> 12
                                      | (
                                          (
                                                (((((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1 | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15) ^ 1)
                                                    + 148
                                                  & 64512
                                              )
                                              >> 10
                                            | (((((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1 | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15) ^ 1)
                                                + 148
                                              << 6
                                        )
                                        << 4
                                  )
                                  ^ 154
                              )
                              << 1
                        )
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
                                              (
                                                  (
                                                        (
                                                              (
                                                                  (((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1
                                                                    | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15
                                                                )
                                                                ^ 1
                                                            )
                                                            + 148
                                                          & 64512
                                                      )
                                                      >> 10
                                                    | (
                                                          (
                                                              (((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1
                                                                | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15
                                                            )
                                                            ^ 1
                                                        )
                                                        + 148
                                                      << 6
                                                )
                                                & 61440
                                            )
                                            >> 12
                                          | (
                                              (
                                                    (
                                                          (
                                                              (((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1
                                                                | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15
                                                            )
                                                            ^ 1
                                                        )
                                                        + 148
                                                      & 64512
                                                  )
                                                  >> 10
                                                | (((((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1 | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15) ^ 1)
                                                    + 148
                                                  << 6
                                            )
                                            << 4
                                      )
                                      ^ 154
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
                                                          (
                                                              (((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1
                                                                | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15
                                                            )
                                                            ^ 1
                                                        )
                                                        + 148
                                                      & 64512
                                                  )
                                                  >> 10
                                                | (((((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1 | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15) ^ 1)
                                                    + 148
                                                  << 6
                                            )
                                            & 61440
                                        )
                                        >> 12
                                      | (
                                          (
                                                (((((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1 | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15) ^ 1)
                                                    + 148
                                                  & 64512
                                              )
                                              >> 10
                                            | (((((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1 | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15) ^ 1)
                                                + 148
                                              << 6
                                        )
                                        << 4
                                  )
                                  ^ 154
                              )
                              << 1
                        )
                        & 65520
                    )
                    >> 4
                  | (
                      (
                            (
                                (
                                    (
                                          (
                                              (
                                                    (
                                                          (
                                                              (((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1
                                                                | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15
                                                            )
                                                            ^ 1
                                                        )
                                                        + 148
                                                      & 64512
                                                  )
                                                  >> 10
                                                | (((((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1 | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15) ^ 1)
                                                    + 148
                                                  << 6
                                            )
                                            & 61440
                                        )
                                        >> 12
                                      | (
                                          (
                                                (((((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1 | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15) ^ 1)
                                                    + 148
                                                  & 64512
                                              )
                                              >> 10
                                            | (((((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1 | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15) ^ 1)
                                                + 148
                                              << 6
                                        )
                                        << 4
                                  )
                                  ^ 154
                              )
                              & 32768
                          )
                          >> 15
                        | (
                            (
                                (
                                      (
                                          (
                                                (((((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1 | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15) ^ 1)
                                                    + 148
                                                  & 64512
                                              )
                                              >> 10
                                            | (((((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1 | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15) ^ 1)
                                                + 148
                                              << 6
                                        )
                                        & 61440
                                    )
                                    >> 12
                                  | (
                                      (
                                            (((((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1 | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15) ^ 1)
                                                + 148
                                              & 64512
                                          )
                                          >> 10
                                        | (((((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1 | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15) ^ 1) + 148
                                          << 6
                                    )
                                    << 4
                              )
                              ^ 154
                          )
                          << 1
                    )
                    << 12
              )
              << 16
        );
        var17.setCharAt(
          var30,
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
                                                                    (
                                                                        (((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1
                                                                          | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15
                                                                      )
                                                                      ^ 1
                                                                  )
                                                                  + 148
                                                                & 64512
                                                            )
                                                            >> 10
                                                          | (
                                                                (
                                                                    (((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1
                                                                      | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15
                                                                  )
                                                                  ^ 1
                                                              )
                                                              + 148
                                                            << 6
                                                      )
                                                      & 61440
                                                  )
                                                  >> 12
                                                | (
                                                    (
                                                          (
                                                                (
                                                                    (((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1
                                                                      | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15
                                                                  )
                                                                  ^ 1
                                                              )
                                                              + 148
                                                            & 64512
                                                        )
                                                        >> 10
                                                      | (
                                                            (
                                                                (((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1
                                                                  | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15
                                                              )
                                                              ^ 1
                                                          )
                                                          + 148
                                                        << 6
                                                  )
                                                  << 4
                                            )
                                            ^ 154
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
                                                                (
                                                                    (((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1
                                                                      | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15
                                                                  )
                                                                  ^ 1
                                                              )
                                                              + 148
                                                            & 64512
                                                        )
                                                        >> 10
                                                      | (
                                                            (
                                                                (((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1
                                                                  | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15
                                                              )
                                                              ^ 1
                                                          )
                                                          + 148
                                                        << 6
                                                  )
                                                  & 61440
                                              )
                                              >> 12
                                            | (
                                                (
                                                      (
                                                            (
                                                                (((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1
                                                                  | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15
                                                              )
                                                              ^ 1
                                                          )
                                                          + 148
                                                        & 64512
                                                    )
                                                    >> 10
                                                  | (
                                                        ((((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1 | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15)
                                                          ^ 1
                                                      )
                                                      + 148
                                                    << 6
                                              )
                                              << 4
                                        )
                                        ^ 154
                                    )
                                    << 1
                              )
                              & 65520
                          )
                          >> 4
                        | (
                            (
                                  (
                                      (
                                          (
                                                (
                                                    (
                                                          (
                                                                (
                                                                    (((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1
                                                                      | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15
                                                                  )
                                                                  ^ 1
                                                              )
                                                              + 148
                                                            & 64512
                                                        )
                                                        >> 10
                                                      | (
                                                            (
                                                                (((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1
                                                                  | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15
                                                              )
                                                              ^ 1
                                                          )
                                                          + 148
                                                        << 6
                                                  )
                                                  & 61440
                                              )
                                              >> 12
                                            | (
                                                (
                                                      (
                                                            (
                                                                (((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1
                                                                  | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15
                                                              )
                                                              ^ 1
                                                          )
                                                          + 148
                                                        & 64512
                                                    )
                                                    >> 10
                                                  | (
                                                        ((((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1 | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15)
                                                          ^ 1
                                                      )
                                                      + 148
                                                    << 6
                                              )
                                              << 4
                                        )
                                        ^ 154
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
                                                            (
                                                                (((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1
                                                                  | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15
                                                              )
                                                              ^ 1
                                                          )
                                                          + 148
                                                        & 64512
                                                    )
                                                    >> 10
                                                  | (
                                                        ((((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1 | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15)
                                                          ^ 1
                                                      )
                                                      + 148
                                                    << 6
                                              )
                                              & 61440
                                          )
                                          >> 12
                                        | (
                                            (
                                                  (((((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1 | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15) ^ 1)
                                                      + 148
                                                    & 64512
                                                )
                                                >> 10
                                              | (((((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1 | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15) ^ 1)
                                                  + 148
                                                << 6
                                          )
                                          << 4
                                    )
                                    ^ 154
                                )
                                << 1
                          )
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
                                                (
                                                    (
                                                          (
                                                                (
                                                                    (((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1
                                                                      | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15
                                                                  )
                                                                  ^ 1
                                                              )
                                                              + 148
                                                            & 64512
                                                        )
                                                        >> 10
                                                      | (
                                                            (
                                                                (((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1
                                                                  | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15
                                                              )
                                                              ^ 1
                                                          )
                                                          + 148
                                                        << 6
                                                  )
                                                  & 61440
                                              )
                                              >> 12
                                            | (
                                                (
                                                      (
                                                            (
                                                                (((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1
                                                                  | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15
                                                              )
                                                              ^ 1
                                                          )
                                                          + 148
                                                        & 64512
                                                    )
                                                    >> 10
                                                  | (
                                                        ((((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1 | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15)
                                                          ^ 1
                                                      )
                                                      + 148
                                                    << 6
                                              )
                                              << 4
                                        )
                                        ^ 154
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
                                                            (
                                                                (((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1
                                                                  | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15
                                                              )
                                                              ^ 1
                                                          )
                                                          + 148
                                                        & 64512
                                                    )
                                                    >> 10
                                                  | (
                                                        ((((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1 | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15)
                                                          ^ 1
                                                      )
                                                      + 148
                                                    << 6
                                              )
                                              & 61440
                                          )
                                          >> 12
                                        | (
                                            (
                                                  (((((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1 | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15) ^ 1)
                                                      + 148
                                                    & 64512
                                                )
                                                >> 10
                                              | (((((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1 | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15) ^ 1)
                                                  + 148
                                                << 6
                                          )
                                          << 4
                                    )
                                    ^ 154
                                )
                                << 1
                          )
                          & 65520
                      )
                      >> 4
                    | (
                        (
                              (
                                  (
                                      (
                                            (
                                                (
                                                      (
                                                            (
                                                                (((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1
                                                                  | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15
                                                              )
                                                              ^ 1
                                                          )
                                                          + 148
                                                        & 64512
                                                    )
                                                    >> 10
                                                  | (
                                                        ((((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1 | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15)
                                                          ^ 1
                                                      )
                                                      + 148
                                                    << 6
                                              )
                                              & 61440
                                          )
                                          >> 12
                                        | (
                                            (
                                                  (((((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1 | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15) ^ 1)
                                                      + 148
                                                    & 64512
                                                )
                                                >> 10
                                              | (((((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1 | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15) ^ 1)
                                                  + 148
                                                << 6
                                          )
                                          << 4
                                    )
                                    ^ 154
                                )
                                & 32768
                            )
                            >> 15
                          | (
                              (
                                  (
                                        (
                                            (
                                                  (((((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1 | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15) ^ 1)
                                                      + 148
                                                    & 64512
                                                )
                                                >> 10
                                              | (((((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1 | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15) ^ 1)
                                                  + 148
                                                << 6
                                          )
                                          & 61440
                                      )
                                      >> 12
                                    | (
                                        (
                                              (((((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1 | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15) ^ 1)
                                                  + 148
                                                & 64512
                                            )
                                            >> 10
                                          | (((((var55 & '\ufffe') >> 1 | var55 << 15) & 65534) >> 1 | ((var55 & '\ufffe') >> 1 | var55 << 15) << 15) ^ 1)
                                              + 148
                                            << 6
                                      )
                                      << 4
                                )
                                ^ 154
                            )
                            << 1
                      )
                      << 12
                )
                << 16
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, jr.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = -736543564 >>> 2049768128 ^ -736543564; var36 < var20.length(); var36 += (-999643118 | 911285042) ^ -159663309) {
        char var67 = var20.charAt(var36);
        char var72 = (char)(
          (
                (
                    (
                          (
                              (
                                    (
                                        (
                                              (((var67 & '\uf800') >> 11 | var67 << 5) - 41 - 56 - 51 & 65472) >> 6
                                                | ((var67 & '\uf800') >> 11 | var67 << 5) - 41 - 56 - 51 << 10
                                            )
                                            + 91
                                          ^ 153
                                      )
                                      & 63488
                                  )
                                  >> 11
                                | (
                                    (
                                          (((var67 & '\uf800') >> 11 | var67 << 5) - 41 - 56 - 51 & 65472) >> 6
                                            | ((var67 & '\uf800') >> 11 | var67 << 5) - 41 - 56 - 51 << 10
                                        )
                                        + 91
                                      ^ 153
                                  )
                                  << 5
                            )
                            & 65024
                        )
                        >> 9
                      | (
                          (
                                (
                                    (
                                          (((var67 & '\uf800') >> 11 | var67 << 5) - 41 - 56 - 51 & 65472) >> 6
                                            | ((var67 & '\uf800') >> 11 | var67 << 5) - 41 - 56 - 51 << 10
                                        )
                                        + 91
                                      ^ 153
                                  )
                                  & 63488
                              )
                              >> 11
                            | (
                                (
                                      (((var67 & '\uf800') >> 11 | var67 << 5) - 41 - 56 - 51 & 65472) >> 6
                                        | ((var67 & '\uf800') >> 11 | var67 << 5) - 41 - 56 - 51 << 10
                                    )
                                    + 91
                                  ^ 153
                              )
                              << 5
                        )
                        << 7
                  )
                  & 65504
              )
              >> 5
            | (
                (
                      (
                          (
                                (
                                    (
                                          (((var67 & '\uf800') >> 11 | var67 << 5) - 41 - 56 - 51 & 65472) >> 6
                                            | ((var67 & '\uf800') >> 11 | var67 << 5) - 41 - 56 - 51 << 10
                                        )
                                        + 91
                                      ^ 153
                                  )
                                  & 63488
                              )
                              >> 11
                            | (
                                (
                                      (((var67 & '\uf800') >> 11 | var67 << 5) - 41 - 56 - 51 & 65472) >> 6
                                        | ((var67 & '\uf800') >> 11 | var67 << 5) - 41 - 56 - 51 << 10
                                    )
                                    + 91
                                  ^ 153
                              )
                              << 5
                        )
                        & 65024
                    )
                    >> 9
                  | (
                      (
                            (
                                (
                                      (((var67 & '\uf800') >> 11 | var67 << 5) - 41 - 56 - 51 & 65472) >> 6
                                        | ((var67 & '\uf800') >> 11 | var67 << 5) - 41 - 56 - 51 << 10
                                    )
                                    + 91
                                  ^ 153
                              )
                              & 63488
                          )
                          >> 11
                        | (
                            (
                                  (((var67 & '\uf800') >> 11 | var67 << 5) - 41 - 56 - 51 & 65472) >> 6
                                    | ((var67 & '\uf800') >> 11 | var67 << 5) - 41 - 56 - 51 << 10
                                )
                                + 91
                              ^ 153
                          )
                          << 5
                    )
                    << 7
              )
              << 11
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
                                                (((var67 & '\uf800') >> 11 | var67 << 5) - 41 - 56 - 51 & 65472) >> 6
                                                  | ((var67 & '\uf800') >> 11 | var67 << 5) - 41 - 56 - 51 << 10
                                              )
                                              + 91
                                            ^ 153
                                        )
                                        & 63488
                                    )
                                    >> 11
                                  | (
                                      (
                                            (((var67 & '\uf800') >> 11 | var67 << 5) - 41 - 56 - 51 & 65472) >> 6
                                              | ((var67 & '\uf800') >> 11 | var67 << 5) - 41 - 56 - 51 << 10
                                          )
                                          + 91
                                        ^ 153
                                    )
                                    << 5
                              )
                              & 65024
                          )
                          >> 9
                        | (
                            (
                                  (
                                      (
                                            (((var67 & '\uf800') >> 11 | var67 << 5) - 41 - 56 - 51 & 65472) >> 6
                                              | ((var67 & '\uf800') >> 11 | var67 << 5) - 41 - 56 - 51 << 10
                                          )
                                          + 91
                                        ^ 153
                                    )
                                    & 63488
                                )
                                >> 11
                              | (
                                  (
                                        (((var67 & '\uf800') >> 11 | var67 << 5) - 41 - 56 - 51 & 65472) >> 6
                                          | ((var67 & '\uf800') >> 11 | var67 << 5) - 41 - 56 - 51 << 10
                                      )
                                      + 91
                                    ^ 153
                                )
                                << 5
                          )
                          << 7
                    )
                    & 65504
                )
                >> 5
              | (
                  (
                        (
                            (
                                  (
                                      (
                                            (((var67 & '\uf800') >> 11 | var67 << 5) - 41 - 56 - 51 & 65472) >> 6
                                              | ((var67 & '\uf800') >> 11 | var67 << 5) - 41 - 56 - 51 << 10
                                          )
                                          + 91
                                        ^ 153
                                    )
                                    & 63488
                                )
                                >> 11
                              | (
                                  (
                                        (((var67 & '\uf800') >> 11 | var67 << 5) - 41 - 56 - 51 & 65472) >> 6
                                          | ((var67 & '\uf800') >> 11 | var67 << 5) - 41 - 56 - 51 << 10
                                      )
                                      + 91
                                    ^ 153
                                )
                                << 5
                          )
                          & 65024
                      )
                      >> 9
                    | (
                        (
                              (
                                  (
                                        (((var67 & '\uf800') >> 11 | var67 << 5) - 41 - 56 - 51 & 65472) >> 6
                                          | ((var67 & '\uf800') >> 11 | var67 << 5) - 41 - 56 - 51 << 10
                                      )
                                      + 91
                                    ^ 153
                                )
                                & 63488
                            )
                            >> 11
                          | (
                              (
                                    (((var67 & '\uf800') >> 11 | var67 << 5) - 41 - 56 - 51 & 65472) >> 6
                                      | ((var67 & '\uf800') >> 11 | var67 << 5) - 41 - 56 - 51 << 10
                                  )
                                  + 91
                                ^ 153
                            )
                            << 5
                      )
                      << 7
                )
                << 11
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), jr.class.getClassLoader()).returnType();
      switch ((((var4 ^ 1795172190) + 1319405951 ^ 2030296449 ^ 443184256 ^ 1783374969 ^ 812455862) - 1331357061 ^ 946250264) - 520062621 + 1969501438) {
        case 717678722:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1605082145:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1689800523:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 2054724614:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      vbk[(((var10 - 1276141977 ^ 1676388313) - 166371843 + 1453958794 - 475177462 + 1128042236 ^ 904966485) + 1905961770 ^ 539986124) - 1607144675] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }

  public static native void guard();
}
