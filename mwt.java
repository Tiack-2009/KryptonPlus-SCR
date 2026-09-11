// KryptonPlus Module: AutoClicker
// Original class: mwt
// Status: PARTIAL - JNT native encryption (strings in jnt.so)


import dev.krypton.jnt3.Loader;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Iterator;
import net.minecraft.Entity;
import net.minecraft.ClientPlayerEntity;
import net.minecraft.class_1661;
import net.minecraft.class_1707;
import net.minecraft.Item;
import net.minecraft.ItemStack;
import net.minecraft.BlockState;
import net.minecraft.BlockPos;
import net.minecraft.class_2661;
import net.minecraft.HitResult;
import net.minecraft.class_634;
import net.minecraft.class_638;
import net.minecraft.MinecraftClient;

public class AutoClicker extends np {
  public rt qk;
  public rt lzv;
  public rt un;
  public rt kjo;
  public kc fk;
  public kc lwr;
  public kc zox;
  public e vca;
  public int fy;
  public kn gtm;
  public boolean fmq;
  public String yat;
  public class_2338 rno;
  public class_2338 yvxg;
  public int ts;
  public boolean tlj;
  public int wbe;
  public boolean trg;
  public boolean he;
  public boolean sqs;
  public int ok;
  public double xkc;
  public double dfy;
  public double cn;
  public boolean xar;
  public int aer;
  // [JNT] MethodHandle dispatch table (removed)
  public mwt() {
    int var1 = 1389878116;
    int var10001 = 1595014217 ^ 1595014217 ^ 0;

    StringBuilder var10002;
    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < (1182359734 >> -1593858287 ^ 9011);
      var10001 += (-1369148449 | -506478738) ^ -269484034
    ) {
      char var44 = /* jnt */;
      int var10005 = (var44 & '\uf800') >> 11;
      int var45 = (var44 & '\uf800') >> 11 | var44 << 5;
      int var118 = (((var44 & '\uf800') >> 11 | var44 << 5) & 63488) >> 11;
      var44 = (char)((((var10005 | var44 << 5) & 63488) >> 11 | ((var44 & '\uf800') >> 11 | var44 << 5) << 5) - 246 ^ 225 ^ 119);
      /* jnt */((var118 | var45 << 5) - 246 ^ 225 ^ 119));
    }

    String var5 = /* jnt */;
    int var24 = (381143880 >> -1303539217 | 0) & 2091303424;

    StringBuilder var48;
    for (var48 = (StringBuilder)/* jnt */;
      var24 < ((-344082877 >>> 1257913910 | 50) & -538592206);
      var24 += (-1658724813 | 1343958082 | 0) & 8651013
    ) {
      int var92 = (/* jnt */ + 'D' + 151 ^ 161) + 116;
      char var93 = (char)((var92 & 61440) >> 12 | var92 << 4);
      /* jnt */((var92 & 61440) >> 12 | var92 << 4));
    }

    super(
      var5,
      /* jnt */,
      -1,
      null /* jnt:encrypted */
    );
    var10001 = 808291675 & -1385912578 * (808291675 + -1385912578) ^ 805667914;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < (-272182810 + 1694822257 ^ 1422639430);
      var10001 += (-541376338 - -1976577299 | 1) & 38047751
    ) {
      int var51 = /* jnt */ - 137 + 24;
      char var52 = (char)(((var51 & 32768) >> 15 | var51 << 1) + 141 - 140);
      /* jnt */(((var51 & 32768) >> 15 | var51 << 1) + 141 - 140));
    }

    this.qk = (rt)/* jnt */, 4.0, 20.0, 8.0, 1.0
    );
    var10001 = (-994605926 - -1406090784 | 0) & 1178665285;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((-2113401133 & -563945421 | 18) & 1367485586);
      var10001 += -149550389 + -173274717 ^ -322825105
    ) {
      char var55 = /* jnt */;
      char var56 = (char)((((var55 & '￠') >> 5 | var55 << 11) - 119 ^ 53) + 233 - 150);
      /* jnt */((((var55 & '￠') >> 5 | var55 << 11) - 119 ^ 53) + 233 - 150)
      );
    }

    this.lzv = (rt)/* jnt */, 2.0, 10.0, 4.0, 1.0
    );
    mwt var10000 = this;
    var10001 = (-1631723528 ^ 1503317578 | 0) & 277391885;

    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < (1594928332 << 496730459 ^ 1610612754);
      var10001 += -738472838 - -1487036285 ^ 748563446
    ) {
      char var59 = /* jnt */;
      char var60 = (char)(((var59 & '\ufff0') >> 4 | var59 << '\f') + 67 + 66 - 196 ^ 70);
      /* jnt */(((var59 & '\ufff0') >> 4 | var59 << '\f') + 67 + 66 - 196 ^ 70)
      );
    }

    rt var12 = (rt)/* jnt */, 20.0, 100.0, 30.0, 1.0
    );
    int var32 = (-594951263 << -683948067 | 0) & -2146324602;
    var48 = (StringBuilder)/* jnt */;

    label92:
    while (true) {
      var1 = 1624155616 >>> 1552591964 ^ -1722676649;

      while (true) {
        label126: {
          switch (((var1 + 92189606 ^ 1965517883) - 17696143 ^ 653536465) - 1076160367 - 846322822) {
            case -423770370:
              var10002 = var48;
              if (var32 < (-1884200995 >>> (403218762 & 142546506) ^ 2354297)) {
                char var113 = /* jnt */;
                char var116 = (char)(
                  (
                      ((((((var113 & '耀') >> 15 | var113 << 1) & 49152) >> 14 | ((var113 & '耀') >> 15 | var113 << 1) << 2) ^ 169) & 65504) >> 5
                        | (((((var113 & '耀') >> 15 | var113 << 1) & 49152) >> 14 | ((var113 & '耀') >> 15 | var113 << 1) << 2) ^ 169) << 11
                    )
                    + 74
                );
                /* jnt */(
                    (
                        ((((((var113 & '耀') >> 15 | var113 << 1) & 49152) >> 14 | ((var113 & '耀') >> 15 | var113 << 1) << 2) ^ 169) & 65504) >> 5
                          | (((((var113 & '耀') >> 15 | var113 << 1) & 49152) >> 14 | ((var113 & '耀') >> 15 | var113 << 1) << 2) ^ 169) << 11
                      )
                      + 74
                  )
                );
                var32 += -1066772602 - -180231040 ^ -886541561;
                break label126;
              }

              var1 = -364831739 >> (-364831739 << -1431872746) ^ 1685038378;
              break;
            case 1502026999:
            default:
              var10002 = var48;
              if (var32 < ((553588408 | 466139813 | 65) & 67108929)) {
                char var99 = /* jnt */;
                char var100 = (char)((((var99 & 0) >> 16 | var99 << 0) + 72 ^ 142 ^ 5) - 132);
                /* jnt */((((var99 & 0) >> 16 | var99 << 0) + 72 ^ 142 ^ 5) - 132)
                );
                var32 += 1353290807 >> -1171255622 ^ 21;
                continue label92;
              }

              var1 = (-1280757789 + -1280757789 | -1326713824) & -1293159254;
          }

          switch ((var1 + 555440892 ^ 315185504) - 1727723998 - 300871862 + 262762298 ^ 821051440) {
            case 1689424321:
              var10000.kjo = /* jnt */
              );
              var10001 = -1182684871 + (-1182684871 & -657281769) ^ 1375883850;

              for (var10002 = (StringBuilder)/* jnt */;
                var10001 < (-1307365881 >>> -1307365881 ^ 23340626);
                var10001 += (-2008547593 * -354519874 | 1) & 306632833
              ) {
                char var71 = /* jnt */;
                char var74 = (char)(
                  (
                      (((((var71 & '쀀') >> 14 | var71 << 2) & 65504) >> 5 | ((var71 & '쀀') >> 14 | var71 << 2) << 11) - 248 & 65520) >> 4
                        | ((((var71 & '쀀') >> 14 | var71 << 2) & 65504) >> 5 | ((var71 & '쀀') >> 14 | var71 << 2) << 11) - 248 << 12
                    )
                    ^ 227
                );
                /* jnt */(
                    (
                        (((((var71 & '쀀') >> 14 | var71 << 2) & 65504) >> 5 | ((var71 & '쀀') >> 14 | var71 << 2) << 11) - 248 & 65520) >> 4
                          | ((((var71 & '쀀') >> 14 | var71 << 2) & 65504) >> 5 | ((var71 & '쀀') >> 14 | var71 << 2) << 11) - 248 << 12
                      )
                      ^ 227
                  )
                );
              }

              this.fk = (kc)/* jnt */, true
              );
              var10001 = 336089148 & 1689103077 ^ 67633188;

              for (var10002 = (StringBuilder)/* jnt */;
                var10001 < ((-208870831 + -1562281209 | 15) & 152043567);
                var10001 += 1929675647 * 646683602 ^ 1430700847
              ) {
                int var77 = /* jnt */ - 155 - 191 - 47;
                char var78 = (char)(((var77 & 32768) >> 15 | var77 << 1) - 146);
                /* jnt */(((var77 & 32768) >> 15 | var77 << 1) - 146)
                );
              }

              this.lwr = (kc)/* jnt */, false
              );
              var10001 = 406871443 * (1228808243 + -1535856517) ^ -285406742;

              for (var10002 = (StringBuilder)/* jnt */;
                var10001 < ((-1371392929 >>> 1069026684 | 7) & -1223961793);
                var10001 += -148038015 & -148038015 ^ -148038016
              ) {
                int var81 = /* jnt */ + '!';
                char var84 = (char)(
                  (
                      (((((var81 & 65472) >> 6 | var81 << 10) & 65504) >> 5 | ((var81 & 65472) >> 6 | var81 << 10) << 11) & 57344) >> 13
                        | ((((var81 & 65472) >> 6 | var81 << 10) & 65504) >> 5 | ((var81 & 65472) >> 6 | var81 << 10) << 11) << 3
                    )
                    ^ 7
                );
                /* jnt */(
                    (
                        (((((var81 & 65472) >> 6 | var81 << 10) & 65504) >> 5 | ((var81 & 65472) >> 6 | var81 << 10) << 11) & 57344) >> 13
                          | ((((var81 & 65472) >> 6 | var81 << 10) & 65504) >> 5 | ((var81 & 65472) >> 6 | var81 << 10) << 11) << 3
                      )
                      ^ 7
                  )
                );
              }

              this.zox = (kc)/* jnt */, true
              );
              var10001 = -849043671 >> -2036672975 ^ -6478;

              for (var10002 = (StringBuilder)/* jnt */;
                var10001 < ((255582189 ^ 255582189 | 7) & 419175047);
                var10001 += 1372098120 ^ -1513487861 ^ -201159614
              ) {
                int var87 = /* jnt */ ^ 166 ^ 92;
                char var88 = (char)(((var87 & 65024) >> 9 | var87 << 7) + 226 + 210);
                /* jnt */(((var87 & 65024) >> 9 | var87 << 7) + 226 + 210)
                );
              }

              this.vca = (e)/* jnt */, ""
              );
              this.gtm = null /* jnt:encrypted */;
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
              return;
            case 1836964756:
            default:
              var10000.un = /* jnt */
              );
              var10000 = this;
              var10001 = 134335355 + 134335355 ^ 268670710;
              var10002 = (StringBuilder)/* jnt */;
          }

          while (var10001 < (726664496 * -225054978 ^ -1020803664)) {
            char var66 = /* jnt */;
            int var124 = (var66 & 0) >> 16;
            int var67 = (var66 & 0) >> 16 | var66 << 0;
            int var125 = (((var66 & 0) >> 16 | var66 << 0) & 64512) >> 10;
            char var68 = (char)(((((var124 | var66 << 0) & 64512) >> 10 | ((var66 & 0) >> 16 | var66 << 0) << 6) ^ 188) - 5 + 111);
            /* jnt */(((var125 | var67 << 6) ^ 188) - 5 + 111));
            var10001 += (-1690400648 ^ -397616854 | 1) & -1945260531;
          }

          var12 = (rt)/* jnt */,
            20.0,
            200.0,
            60.0,
            10.0
          );
          var32 = (312203571 << -1088012466 | 0) & 26349078;
          var48 = (StringBuilder)/* jnt */;
        }

        var1 = (-1165350891 - -1165350891 | -267709468) & -184860684;
      }
    }
  }

  @Override
    // [JNT_NATIVE] void dz() - implementation encrypted in native .so library
  public native void dz();

  @Override
  public void x() {
    /* jnt */;
    if (null /* jnt:encrypted */
      )
      != null) {
      /* jnt */;
      /* jnt */;
    }
  }

  @yet
  public void za(by param1) {
    // $VF: Couldn't be decompiled
    // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
    // java.lang.RuntimeException: parsing failure!
    //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
    //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
    //
    // Bytecode:
    // 000: goto 72c
    // 003: swap
    // 004: ldc_w -1832198613
    // 007: dup
    // 008: ior
    // 009: bipush 52
    // 00b: ior
    // 00c: ldc_w 1227948340
    // 00f: iand
    // 010: dup2
    // 011: if_icmpge 1d8
    // 014: pop
    // 015: dup2
    // 016: invokedynamic JNT (Ljava/lang/Object;I)C bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帇︆ḇ㸉ḃ縉", "ூ쯉쯁䯇", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921079067 ]
    // 01b: dup
    // 01c: ldc_w 65408
    // 01f: iand
    // 020: bipush 7
    // 022: ishr
    // 023: swap
    // 024: bipush 9
    // 026: ishl
    // 027: ior
    // 028: dup
    // 029: ldc 64512
    // 02b: iand
    // 02c: bipush 10
    // 02e: ishr
    // 02f: swap
    // 030: bipush 6
    // 032: ishl
    // 033: ior
    // 034: bipush 66
    // 036: ixor
    // 037: bipush 15
    // 039: iadd
    // 03a: dup
    // 03b: ldc 61440
    // 03d: iand
    // 03e: bipush 12
    // 040: ishr
    // 041: swap
    // 042: bipush 4
    // 043: ishl
    // 044: ior
    // 045: i2c
    // 046: dup
    // 047: dup2_x2
    // 048: pop2
    // 049: dup2_x2
    // 04a: dup2_x1
    // 04b: pop2
    // 04c: invokedynamic JNT (Ljava/lang/Object;IC)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帉鸇縉布︆ḇ㸉ḃ縉", "ூ쯉䯇쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921079064 ]
    // 051: pop
    // 052: ldc_w -425208706
    // 055: ldc_w -1558078835
    // 058: swap
    // 059: iadd
    // 05a: bipush 0
    // 05b: ior
    // 05c: ldc_w 573833425
    // 05f: iand
    // 060: iadd
    // 061: swap
    // 062: goto f81
    // 065: ldc_w -1237617277
    // 068: ldc_w 937526111
    // 06b: ishl
    // 06c: ldc_w 1613482904
    // 06f: ixor
    // 070: istore 11
    // 072: goto e7e
    // 075: ldc_w -426230512
    // 078: ldc_w -2083166401
    // 07b: ixor
    // 07c: ldc_w 1263332224
    // 07f: ixor
    // 080: istore 11
    // 082: goto df2
    // 085: ldc_w 1118052689
    // 088: ldc_w -810449495
    // 08b: ldc_w -1174149392
    // 08e: iadd
    // 08f: iadd
    // 090: ldc_w -521627367
    // 093: ixor
    // 094: istore 11
    // 096: goto 688
    // 099: swap
    // 09a: ldc_w -1548555940
    // 09d: ldc_w 789564102
    // 0a0: ishl
    // 0a1: bipush 52
    // 0a3: ior
    // 0a4: ldc_w 54536308
    // 0a7: iand
    // 0a8: dup2
    // 0a9: if_icmpge 5ff
    // 0ac: pop
    // 0ad: dup2
    // 0ae: invokedynamic JNT (Ljava/lang/Object;I)C bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帇︆ḇ㸉ḃ縉", "ூ쯉쯁䯇", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921079065 ]
    // 0b3: sipush 184
    // 0b6: ixor
    // 0b7: sipush 133
    // 0ba: ixor
    // 0bb: dup
    // 0bc: ldc_w 65408
    // 0bf: iand
    // 0c0: bipush 7
    // 0c2: ishr
    // 0c3: swap
    // 0c4: bipush 9
    // 0c6: ishl
    // 0c7: ior
    // 0c8: dup
    // 0c9: bipush 0
    // 0ca: iand
    // 0cb: bipush 16
    // 0cd: ishr
    // 0ce: swap
    // 0cf: bipush 0
    // 0d0: ishl
    // 0d1: ior
    // 0d2: dup
    // 0d3: ldc_w 65408
    // 0d6: iand
    // 0d7: bipush 7
    // 0d9: ishr
    // 0da: swap
    // 0db: bipush 9
    // 0dd: ishl
    // 0de: ior
    // 0df: i2c
    // 0e0: dup
    // 0e1: dup2_x2
    // 0e2: pop2
    // 0e3: dup2_x2
    // 0e4: dup2_x1
    // 0e5: pop2
    // 0e6: invokedynamic JNT (Ljava/lang/Object;IC)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帉鸇縉布︆ḇ㸉ḃ縉", "ூ쯉䯇쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921079078 ]
    // 0eb: pop
    // 0ec: ldc_w -334640398
    // 0ef: ldc_w -730524023
    // 0f2: ishr
    // 0f3: ldc_w -653596
    // 0f6: ixor
    // 0f7: iadd
    // 0f8: swap
    // 0f9: goto f91
    // 0fc: aload 0
    // 0fd: dload 2
    // 0fe: invokedynamic JNT (Ljava/lang/Object;D)V bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -492293368, "\u0a0b\u0a63ণ", "\ue07f\uef7f\uecff", "}䁽t", -1259363423 ]
    // 103: aload 0
    // 104: dload 4
    // 106: invokedynamic JNT (Ljava/lang/Object;D)V bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -492293368, "ফ\u09bbਓ", "\ue07f\uef7f\uecff", "}䁽t", -1259363410 ]
    // 10b: aload 0
    // 10c: dload 6
    // 10e: invokedynamic JNT (Ljava/lang/Object;D)V bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -492293368, "ণ\u0a7b", "\ue07f\uef7f\uecff", "}䁽t", -1259363413 ]
    // 113: aload 0
    // 114: invokedynamic JNT (Ljava/lang/Object;)Z bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u0a0b\u09d3ਜ਼", "\ue07f\uef7f\uecff", "}䁽聹", -1259363416 ]
    // 119: ifeq 751
    // 11c: aload 0
    // 11d: dup
    // 11e: invokedynamic JNT (Ljava/lang/Object;)I bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09d3\u09b3ਜ਼", "\ue07f\uef7f\uecff", "}䁽䁵", -1259363411 ]
    // 123: bipush 1
    // 124: isub
    // 125: invokedynamic JNT (Ljava/lang/Object;I)V bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -492293368, "\u09d3\u09b3ਜ਼", "\ue07f\uef7f\uecff", "}䁽䁵", -1259363398 ]
    // 12a: aload 0
    // 12b: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঃ\u0a63", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾃㾃ﾃ뾁", -1259363401 ]
    // 130: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_638; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࡓ࠻ࠋࠃ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쵿쉿싿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮羀뾃ﾁ뾁", -1259363404 ]
    // 135: dload 2
    // 136: d2i
    // 137: bipush 4
    // 138: ishr
    // 139: dload 6
    // 13b: d2i
    // 13c: bipush 4
    // 13d: ishr
    // 13e: invokedynamic JNT (Ljava/lang/Object;II)Z bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "鸆鸇縉︆\ude06縇\ude04︐帑Ḑ帑", "ூ쯉쯉쯁词", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᑖᛖᅖ", -921079071 ]
    // 143: istore 8
    // 145: aload 0
    // 146: invokedynamic JNT (Ljava/lang/Object;)I bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09d3\u09b3ਜ਼", "\ue07f\uef7f\uecff", "}䁽䁵", -1259363402 ]
    // 14b: ifgt 1c8
    // 14e: iload 8
    // 150: ifeq 1c8
    // 153: aload 0
    // 154: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঃ\u0a63", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾃㾃ﾃ뾁", -1259363405 ]
    // 159: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_746; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࡓࠃ࡛ࠫ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쵿쉿싿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾀ﾀ羀뾁", -1259363408 ]
    // 15e: ldc_w 1374813840
    // 161: ldc_w -163974794
    // 164: iadd
    // 165: bipush 0
    // 166: ior
    // 167: ldc_w 558891361
    // 16a: iand
    // 16b: ldc_w "鰂萁氁䰁쀁萁\udc01렁鐁적䀁적밁퀁鐁谁퀁琁耀封밁적뀁送耀뀁밁萁送鐁送뀀耀적鐁찁퐁됁ꐁ렁鰁렀렀렀"
    // 16e: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1856205066, "縐Ḇ븆Ḇ縉븐", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078987 ]
    // 173: checkcast java/lang/StringBuilder
    // 176: goto 220
    // 179: ldc_w -1322906190
    // 17c: ldc_w -1854562841
    // 17f: ishl
    // 180: ldc_w 550046827
    // 183: ior
    // 184: ldc_w -1226871173
    // 187: iand
    // 188: istore 11
    // 18a: goto df2
    // 18d: iload 11
    // 18f: ldc_w 1445282629
    // 192: iadd
    // 193: ldc_w 208088308
    // 196: iadd
    // 197: ldc_w 595718367
    // 19a: isub
    // 19b: ldc_w 103697285
    // 19e: ixor
    // 19f: ldc_w 1477849091
    // 1a2: iadd
    // 1a3: ldc_w 1082382046
    // 1a6: isub
    // 1a7: lookupswitch -420 3 -724894187 -420 1649606858 -270 1804413700 1930
    // 1c8: ldc_w -1598388136
    // 1cb: ldc_w -193813501
    // 1ce: ishr
    // 1cf: ldc_w 753524155
    // 1d2: ixor
    // 1d3: istore 11
    // 1d5: goto d9f
    // 1d8: ldc_w 957168629
    // 1db: ldc_w -246065576
    // 1de: imul
    // 1df: ldc_w -1030319388
    // 1e2: ior
    // 1e3: ldc_w -1006659609
    // 1e6: iand
    // 1e7: istore 11
    // 1e9: goto f11
    // 1ec: iload 11
    // 1ee: ldc_w 745156965
    // 1f1: iadd
    // 1f2: ldc_w 3005712
    // 1f5: isub
    // 1f6: ldc_w 805576561
    // 1f9: ixor
    // 1fa: ldc_w 1754835875
    // 1fd: iadd
    // 1fe: ldc_w 1240861206
    // 201: iadd
    // 202: ldc_w 1008873586
    // 205: isub
    // 206: lookupswitch 1416 2 -2111079393 1416 1979133480 192
    // 220: ldc_w -285172860
    // 223: ldc_w 877819993
    // 226: isub
    // 227: ldc_w -1210506335
    // 22a: ixor
    // 22b: istore 11
    // 22d: goto 440
    // 230: return
    // 231: aload 0
    // 232: invokedynamic JNT (Ljava/lang/Object;)D bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "㸈㸆縉", "ூ쯁ே", "㟖㓖㍖", -921078984 ]
    // 237: dstore 8
    // 239: dload 8
    // 23b: ldc2_w 2.0
    // 23e: dcmpg
    // 23f: ifge 850
    // 242: aload 0
    // 243: aload 0
    // 244: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ਓ\u09d3ਫ", "\ue07f\uef7f\uecff", "}䁽z聭䁯聰䁯뾂r䁯聲쁬뾂쁻p聳䁭聲쁬뾁", -1259363393 ]
    // 249: astore 10
    // 24b: invokedynamic JNT ()Ljava/lang/Object; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1856205066, "縐Ḇ븆Ḇ縉븐", "ூ쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078998 ]
    // 250: checkcast java/lang/StringBuilder
    // 253: ldc_w -1452770233
    // 256: ldc_w 126823542
    // 259: iushr
    // 25a: sipush 677
    // 25d: ixor
    // 25e: ldc_w "ࢼ<＼﹛ǜ￼ʼƜ|ȜﷻȜƼɜ|<ɜｼ\uf7fbﷻŜ￼˼|Ȝ\uf7fb"
    // 261: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1856205066, "縐Ḇ븆Ḇ縉븐", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078999 ]
    // 266: checkcast java/lang/StringBuilder
    // 269: goto efd
    // 26c: swap
    // 26d: ldc_w -1371212162
    // 270: dup
    // 271: iushr
    // 272: bipush 56
    // 274: ixor
    // 275: dup2
    // 276: if_icmpge b27
    // 279: pop
    // 27a: dup2
    // 27b: invokedynamic JNT (Ljava/lang/Object;I)C bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帇︆ḇ㸉ḃ縉", "ூ쯉쯁䯇", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078996 ]
    // 280: dup
    // 281: bipush 0
    // 282: iand
    // 283: bipush 16
    // 285: ishr
    // 286: swap
    // 287: bipush 0
    // 288: ishl
    // 289: ior
    // 28a: dup
    // 28b: ldc 61440
    // 28d: iand
    // 28e: bipush 12
    // 290: ishr
    // 291: swap
    // 292: bipush 4
    // 293: ishl
    // 294: ior
    // 295: bipush 40
    // 297: ixor
    // 298: bipush 109
    // 29a: isub
    // 29b: dup
    // 29c: ldc 65472
    // 29e: iand
    // 29f: bipush 6
    // 2a1: ishr
    // 2a2: swap
    // 2a3: bipush 10
    // 2a5: ishl
    // 2a6: ior
    // 2a7: i2c
    // 2a8: dup
    // 2a9: dup2_x2
    // 2aa: pop2
    // 2ab: dup2_x2
    // 2ac: dup2_x1
    // 2ad: pop2
    // 2ae: invokedynamic JNT (Ljava/lang/Object;IC)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帉鸇縉布︆ḇ㸉ḃ縉", "ூ쯉䯇쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921079045 ]
    // 2b3: pop
    // 2b4: ldc_w 1063636995
    // 2b7: ldc_w 564980378
    // 2ba: imul
    // 2bb: bipush 1
    // 2bc: ior
    // 2bd: ldc_w 629800961
    // 2c0: iand
    // 2c1: iadd
    // 2c2: swap
    // 2c3: goto d77
    // 2c6: return
    // 2c7: ldc_w 621638194
    // 2ca: ldc_w 1073631898
    // 2cd: ixor
    // 2ce: ldc_w 1104199239
    // 2d1: ior
    // 2d2: ldc_w 1777450847
    // 2d5: iand
    // 2d6: istore 11
    // 2d8: goto 884
    // 2db: ldc_w -1196749661
    // 2de: ldc_w -699115381
    // 2e1: ixor
    // 2e2: ldc_w 1903181599
    // 2e5: ixor
    // 2e6: istore 11
    // 2e8: goto e7e
    // 2eb: ldc_w 2095710735
    // 2ee: dup
    // 2ef: ldc_w 253640553
    // 2f2: ishl
    // 2f3: ishl
    // 2f4: ldc_w 865135616
    // 2f7: ior
    // 2f8: ldc_w -1275986672
    // 2fb: iand
    // 2fc: istore 11
    // 2fe: goto 688
    // 301: ldc_w 1247597157
    // 304: dup
    // 305: isub
    // 306: ldc_w 930129608
    // 309: ixor
    // 30a: istore 11
    // 30c: goto 688
    // 30f: aload 0
    // 310: invokedynamic JNT ()Lkn; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -984144447, "ਣ੫ਛ", "\ue17f\ue3ff", "}䁽z쁭聲뾁", -1259363400 ]
    // 315: invokedynamic JNT (Ljava/lang/Object;Lkn;)V bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -492293368, "ঃਫੳ", "\ue07f\uef7f\uecff", "}䁽z쁭聲뾁", -1259363395 ]
    // 31a: goto 394
    // 31d: return
    // 31e: ldc_w 587168789
    // 321: ldc_w 16936660
    // 324: dup_x1
    // 325: iushr
    // 326: iadd
    // 327: ldc_w -1571810760
    // 32a: ixor
    // 32b: istore 11
    // 32d: goto 1ec
    // 330: aload 0
    // 331: invokedynamic JNT (Ljava/lang/Object;)Z bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "鸆ḉ븆", "ூ쯁词", "㟖㓖㍖", -921079040 ]
    // 336: ifeq 4fe
    // 339: return
    // 33a: dload 8
    // 33c: aload 0
    // 33d: invokedynamic JNT (Ljava/lang/Object;)Lrt; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u0a53\u0a63", "\ue07f\uef7f\uecff", "}䁽z聳p뾁", -1259363385 ]
    // 342: invokedynamic JNT (Ljava/lang/Object;)I bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "\ude09鸆㸇", "ூ쯁쯉", "㙖㍖", -921079054 ]
    // 347: i2d
    // 348: dcmpg
    // 349: ifge ebc
    // 34c: aload 0
    // 34d: invokedynamic JNT (Ljava/lang/Object;)Z bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঋ\u09b3", "\ue07f\uef7f\uecff", "}䁽聹", -1259363367 ]
    // 352: ifne ebc
    // 355: aload 0
    // 356: invokedynamic JNT (Ljava/lang/Object;)Z bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ਣ\u0a53ਣ", "\ue07f\uef7f\uecff", "}䁽聹", -1259363386 ]
    // 35b: ifne ebc
    // 35e: aload 0
    // 35f: invokedynamic JNT (Ljava/lang/Object;)Lkn; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঃਫੳ", "\ue07f\uef7f\uecff", "}䁽z쁭聲뾁", -1259363389 ]
    // 364: invokedynamic JNT ()Lkn; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -984144447, "\u0a43\u0a43੫", "\ue17f\ue3ff", "}䁽z쁭聲뾁", -1259363392 ]
    // 369: if_acmpne ebc
    // 36c: aload 0
    // 36d: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঃ\u0a63", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾃㾃ﾃ뾁", -1259363387 ]
    // 372: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_746; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࡓࠃ࡛ࠫ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쵿쉿싿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾀ﾀ羀뾁", -1259363470 ]
    // 377: ldc_w 899699168
    // 37a: ldc_w -574392863
    // 37d: dup_x1
    // 37e: ishr
    // 37f: iadd
    // 380: bipush 0
    // 381: ior
    // 382: ldc_w 90972456
    // 385: iand
    // 386: ldc_w "Ҁꏿ닿껿鹿ꗿ鳿\ua97fꏿ齿깿齿ꣿ鱿ꏿ\ua6ff鱿꿿왿뛿齿\ua9ff鱿\ua9ff\ua6ffꗿ\ua87f왿ꑿ\ua9ff黿鱿ꗿ\ua97f\ua6ffꏿ엿왿돿\ua6ffꩿꏿ黿鱿\ua9ff\ua97f꓿왿ꗿ\ua97fꑿ왿ꟿ\ua9ff\ua97f\ua9ff\ua97f꓿왿ꗿ\ua87f\ua87f쥿쥿쥿"
    // 389: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1856205066, "縐Ḇ븆Ḇ縉븐", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921079033 ]
    // 38e: checkcast java/lang/StringBuilder
    // 391: goto 2db
    // 394: ldc_w 964452103
    // 397: ldc_w 151934951
    // 39a: iushr
    // 39b: ldc_w -2050682158
    // 39e: ior
    // 39f: ldc_w -976414757
    // 3a2: iand
    // 3a3: istore 11
    // 3a5: goto 688
    // 3a8: aload 0
    // 3a9: invokedynamic JNT (Ljava/lang/Object;)Lkc; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ਛ\u0a43\u0a0b", "\ue07f\uef7f\uecff", "}䁽z쁭쁯뾁", -1259363508 ]
    // 3ae: invokedynamic JNT (Ljava/lang/Object;)Z bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "븇ḉ\ude09", "ூ쯁词", "㫖㻖", -921079047 ]
    // 3b3: ifeq bb2
    // 3b6: aload 0
    // 3b7: bipush 6
    // 3b9: invokedynamic JNT ()Lnet/minecraft/class_2248; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -984144447, "\u09bbও\u09b3੫ফৃࡓࡋࠫࠫࠣ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ췿췿쳿쿿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮羃羃ﾀﾁ뾁", -1259363506 ]
    // 3be: invokedynamic JNT (Ljava/lang/Object;ILjava/lang/Object;)Lnet/minecraft/class_2338; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "縆︉帇", "ூ쯉\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃诃\u0bc3ெ䯅쯁\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃䯃䯃ெ䯅", "㟖㓖㍖", -921079093 ]
    // 3c3: ifnonnull ebc
    // 3c6: goto bb2
    // 3c9: ldc_w 237114621
    // 3cc: ldc_w 194619916
    // 3cf: iushr
    // 3d0: ldc_w 1959304850
    // 3d3: ixor
    // 3d4: istore 11
    // 3d6: goto 60f
    // 3d9: aload 0
    // 3da: invokedynamic JNT (Ljava/lang/Object;)Lkn; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঃਫੳ", "\ue07f\uef7f\uecff", "}䁽z쁭聲뾁", -1259363512 ]
    // 3df: invokedynamic JNT (Ljava/lang/Object;)I bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "\ude06㸉縇Ḇ븆ḇ縆", "ூ쯁쯉", "㫖㡖", -921079091 ]
    // 3e4: ldc_w 1066053673
    // 3e7: iadd
    // 3e8: ldc_w 1537195544
    // 3eb: isub
    // 3ec: ldc_w 631170393
    // 3ef: ixor
    // 3f0: ldc_w 1266889784
    // 3f3: ixor
    // 3f4: ldc_w 323862327
    // 3f7: iadd
    // 3f8: ldc_w 1449587401
    // 3fb: isub
    // 3fc: lookupswitch 1434 7 1256058846 -251 1256058848 2672 1256058849 1740 1256058850 321 1256058851 244 1256058852 2447 1256058853 2652
    // 440: iload 11
    // 442: ldc_w 697714549
    // 445: ixor
    // 446: ldc_w 1216010631
    // 449: isub
    // 44a: ldc_w 409959580
    // 44d: ixor
    // 44e: ldc_w 926897665
    // 451: ixor
    // 452: ldc_w 580753194
    // 455: isub
    // 456: ldc_w 219515093
    // 459: ixor
    // 45a: lookupswitch 242 2 -577952402 242 1326180017 26
    // 474: swap
    // 475: ldc_w -1769333242
    // 478: ldc_w -1672061759
    // 47b: imul
    // 47c: bipush 57
    // 47e: ior
    // 47f: ldc_w 554702201
    // 482: iand
    // 483: dup2
    // 484: if_icmpge 3c9
    // 487: pop
    // 488: dup2
    // 489: invokedynamic JNT (Ljava/lang/Object;I)C bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帇︆ḇ㸉ḃ縉", "ூ쯉쯁䯇", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921079088 ]
    // 48e: bipush 112
    // 490: isub
    // 491: bipush 125
    // 493: isub
    // 494: sipush 135
    // 497: ixor
    // 498: dup
    // 499: ldc_w 32768
    // 49c: iand
    // 49d: bipush 15
    // 49f: ishr
    // 4a0: swap
    // 4a1: bipush 1
    // 4a2: ishl
    // 4a3: ior
    // 4a4: bipush 83
    // 4a6: ixor
    // 4a7: i2c
    // 4a8: dup
    // 4a9: dup2_x2
    // 4aa: pop2
    // 4ab: dup2_x2
    // 4ac: dup2_x1
    // 4ad: pop2
    // 4ae: invokedynamic JNT (Ljava/lang/Object;IC)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帉鸇縉布︆ḇ㸉ḃ縉", "ூ쯉䯇쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921079089 ]
    // 4b3: pop
    // 4b4: ldc_w 1066647961
    // 4b7: ldc_w -724807692
    // 4ba: ixor
    // 4bb: ldc_w -346059156
    // 4be: ixor
    // 4bf: iadd
    // 4c0: swap
    // 4c1: goto 5ba
    // 4c4: ldc_w 21665787
    // 4c7: ldc_w 1037687791
    // 4ca: ldc_w -1815989820
    // 4cd: imul
    // 4ce: ior
    // 4cf: ldc_w -2113008560
    // 4d2: ior
    // 4d3: ldc_w -1480647472
    // 4d6: iand
    // 4d7: istore 11
    // 4d9: goto 688
    // 4dc: ldc_w -2055030931
    // 4df: ldc_w -1748078350
    // 4e2: ldc_w 2003777707
    // 4e5: ior
    // 4e6: ior
    // 4e7: ldc_w 1191944711
    // 4ea: ixor
    // 4eb: istore 11
    // 4ed: goto c2c
    // 4f0: ldc_w 2082106288
    // 4f3: dup
    // 4f4: iushr
    // 4f5: ldc_w 1361840092
    // 4f8: ixor
    // 4f9: istore 11
    // 4fb: goto 688
    // 4fe: ldc_w -2034810843
    // 501: ldc_w 1228582519
    // 504: ishl
    // 505: ldc_w -419178697
    // 508: ior
    // 509: ldc_w -412090505
    // 50c: iand
    // 50d: istore 11
    // 50f: goto df2
    // 512: ldc_w -1057550001
    // 515: ldc_w 827041791
    // 518: ishr
    // 519: ldc_w -263403524
    // 51c: ixor
    // 51d: istore 11
    // 51f: goto 64d
    // 522: pop2
    // 523: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "縉\ude06帅縉㸉Ḇ븆\ude07", "ூ쯁\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921079038 ]
    // 528: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_2561; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1965457850, "鸆鸇縉︆\ude06縇\ude04帑︑ḑ븑帑", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅쯁\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃쯂诂쯃䯅", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᙖᏖᑖᗖ", -921079039 ]
    // 52d: bipush 0
    // 52e: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;Z)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "鸆鸇縉︆\ude06縇\ude04\ude11帑鸑帑", "ூ\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃쯂诂쯃䯅词쯁诊", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᓖፖᑖ", -921079036 ]
    // 533: aload 0
    // 534: bipush 0
    // 535: invokedynamic JNT (Ljava/lang/Object;Z)V bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -492293368, "\u0a0b\u09d3ਜ਼", "\ue07f\uef7f\uecff", "}䁽聹", -1259363373 ]
    // 53a: goto d67
    // 53d: ldc_w -1677272428
    // 540: dup
    // 541: isub
    // 542: ldc_w 1498618015
    // 545: ixor
    // 546: istore 11
    // 548: goto 688
    // 54b: return
    // 54c: swap
    // 54d: ldc_w 2102470555
    // 550: ldc_w 396595081
    // 553: ior
    // 554: bipush 36
    // 556: ior
    // 557: ldc_w -2147467156
    // 55a: iand
    // 55b: dup2
    // 55c: if_icmpge 91f
    // 55f: pop
    // 560: dup2
    // 561: invokedynamic JNT (Ljava/lang/Object;I)C bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帇︆ḇ㸉ḃ縉", "ூ쯉쯁䯇", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921079082 ]
    // 566: dup
    // 567: ldc 65520
    // 569: iand
    // 56a: bipush 4
    // 56b: ishr
    // 56c: swap
    // 56d: bipush 12
    // 56f: ishl
    // 570: ior
    // 571: dup
    // 572: ldc 64512
    // 574: iand
    // 575: bipush 10
    // 577: ishr
    // 578: swap
    // 579: bipush 6
    // 57b: ishl
    // 57c: ior
    // 57d: dup
    // 57e: ldc_w 65535
    // 581: iand
    // 582: bipush 0
    // 583: ishr
    // 584: swap
    // 585: bipush 16
    // 587: ishl
    // 588: ior
    // 589: dup
    // 58a: bipush 0
    // 58b: iand
    // 58c: bipush 16
    // 58e: ishr
    // 58f: swap
    // 590: bipush 0
    // 591: ishl
    // 592: ior
    // 593: dup
    // 594: ldc 61440
    // 596: iand
    // 597: bipush 12
    // 599: ishr
    // 59a: swap
    // 59b: bipush 4
    // 59c: ishl
    // 59d: ior
    // 59e: i2c
    // 59f: dup
    // 5a0: dup2_x2
    // 5a1: pop2
    // 5a2: dup2_x2
    // 5a3: dup2_x1
    // 5a4: pop2
    // 5a5: invokedynamic JNT (Ljava/lang/Object;IC)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帉鸇縉布︆ḇ㸉ḃ縉", "ூ쯉䯇쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921079083 ]
    // 5aa: pop
    // 5ab: ldc_w -899085126
    // 5ae: dup
    // 5af: ishr
    // 5b0: bipush 1
    // 5b1: ior
    // 5b2: bipush 9
    // 5b4: iand
    // 5b5: iadd
    // 5b6: swap
    // 5b7: goto 220
    // 5ba: ldc_w 737209362
    // 5bd: ldc_w 83038916
    // 5c0: iand
    // 5c1: ldc_w -1108258833
    // 5c4: ior
    // 5c5: ldc_w -1107468305
    // 5c8: iand
    // 5c9: istore 11
    // 5cb: goto 440
    // 5ce: ldc_w -1744900874
    // 5d1: ldc_w 2022991762
    // 5d4: iadd
    // 5d5: ldc_w 535675356
    // 5d8: ixor
    // 5d9: istore 11
    // 5db: goto 1ec
    // 5de: aload 0
    // 5df: invokedynamic JNT (Ljava/lang/Object;)Lkc; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ਛ\u0a43\u0a0b", "\ue07f\uef7f\uecff", "}䁽z쁭쁯뾁", -1259363390 ]
    // 5e4: invokedynamic JNT (Ljava/lang/Object;)Z bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "븇ḉ\ude09", "ூ쯁词", "㫖㻖", -921079081 ]
    // 5e9: ifeq 085
    // 5ec: aload 0
    // 5ed: bipush 6
    // 5ef: invokedynamic JNT ()Lnet/minecraft/class_2248; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -984144447, "\u09bbও\u09b3੫ফৃࡓࡋࠫࠫࠣ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ췿췿쳿쿿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮羃羃ﾀﾁ뾁", -1259363364 ]
    // 5f4: invokedynamic JNT (Ljava/lang/Object;ILjava/lang/Object;)Lnet/minecraft/class_2338; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "縆︉帇", "ூ쯉\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃诃\u0bc3ெ䯅쯁\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃䯃䯃ெ䯅", "㟖㓖㍖", -921079095 ]
    // 5f9: ifnonnull 2eb
    // 5fc: goto 085
    // 5ff: ldc_w 241464158
    // 602: ldc_w -423659733
    // 605: ishr
    // 606: ldc_w 1687938039
    // 609: ixor
    // 60a: istore 11
    // 60c: goto f11
    // 60f: iload 11
    // 611: ldc_w 56180061
    // 614: ixor
    // 615: ldc_w 725869389
    // 618: ixor
    // 619: ldc_w 1444387773
    // 61c: iadd
    // 61d: ldc_w 2099394476
    // 620: ixor
    // 621: ldc_w 1407185711
    // 624: isub
    // 625: ldc_w 956410134
    // 628: iadd
    // 629: lookupswitch 1696 2 -1892056427 1696 -1259749453 -263
    // 644: aload 0
    // 645: invokedynamic JNT (Ljava/lang/Object;)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "︈㸆", "ூ쯁诊", "㟖㓖㍖", -921079092 ]
    // 64a: goto 996
    // 64d: iload 11
    // 64f: ldc_w 653755564
    // 652: iadd
    // 653: ldc_w 939949743
    // 656: isub
    // 657: ldc_w 129563771
    // 65a: ixor
    // 65b: ldc_w 1873314223
    // 65e: isub
    // 65f: ldc_w 1849932152
    // 662: isub
    // 663: ldc_w 588502213
    // 666: iadd
    // 667: lookupswitch 1393 3 -295387356 1393 983031580 850 1044667417 980
    // 688: iload 11
    // 68a: ldc_w 132571296
    // 68d: ixor
    // 68e: ldc_w 51101789
    // 691: isub
    // 692: ldc_w 191832157
    // 695: ixor
    // 696: ldc_w 294711541
    // 699: isub
    // 69a: ldc_w 915236225
    // 69d: isub
    // 69e: ldc_w 1216314580
    // 6a1: ixor
    // 6a2: lookupswitch 611 16 -1820605983 893 -1766313164 2116 -1532728015 534 -1400078029 611 -1170708100 -915 -1012244214 -713 -559597289 -196 116242700 -762 149752257 -1138 152820675 314 533390723 1409 922783003 166 988924594 1855 1088011677 -94 1489819658 473 1680328478 -872
    // 72c: ldc_w -2112897980
    // 72f: istore 11
    // 731: goto d3b
    // 734: ldc_w 1789645181
    // 737: ldc_w -993004052
    // 73a: ishr
    // 73b: ldc_w -2085575583
    // 73e: ior
    // 73f: ldc_w -604177053
    // 742: iand
    // 743: istore 11
    // 745: goto f11
    // 748: aload 0
    // 749: invokedynamic JNT (Ljava/lang/Object;)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "㸉\ude07", "ூ쯁诊", "㟖㓖㍖", -921078757 ]
    // 74e: goto 996
    // 751: ldc_w 1339076484
    // 754: dup
    // 755: ior
    // 756: ldc_w 1585825407
    // 759: ixor
    // 75a: istore 11
    // 75c: goto df2
    // 75f: aload 0
    // 760: invokedynamic JNT (Ljava/lang/Object;)I bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09d3\u09b3ਜ਼", "\ue07f\uef7f\uecff", "}䁽䁵", -1259363368 ]
    // 765: bipush -100
    // 767: if_icmpgt d67
    // 76a: aload 0
    // 76b: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঃ\u0a63", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾃㾃ﾃ뾁", -1259363363 ]
    // 770: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_746; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࡓࠃ࡛ࠫ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쵿쉿싿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾀ﾀ羀뾁", -1259365270 ]
    // 775: ldc_w -454815754
    // 778: ldc_w 1737538098
    // 77b: iadd
    // 77c: ldc_w 1282722344
    // 77f: ixor
    // 780: ldc_w "ǪƉŰŴ膃ƋƂ膆Ɖ膄腳膄Ɔ膁Ɖƌ膁ŭ膫ŲƆ膄膅膉膫膅ƆƋ膉膫膁ƇƅƉƆƁ膁膥膫膄ƉƄƁƅƇ膆Ɗ膫Ƌ膆ſƂƋſ膦膦膦"
    // 783: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1856205066, "縐Ḇ븆Ḇ縉븐", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078753 ]
    // 788: checkcast java/lang/StringBuilder
    // 78b: goto 5ba
    // 78e: aload 0
    // 78f: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঃ\u0a63", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾃㾃ﾃ뾁", -1259365276 ]
    // 794: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_746; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࡓࠃ࡛ࠫ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쵿쉿싿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾀ﾀ羀뾁", -1259365255 ]
    // 799: invokedynamic JNT (Ljava/lang/Object;)D bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "鸆鸇縉︆\ude06縇\ude04㸑帑帑ḑ\ude11", "ூ쯁ே", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᓖፖᑖ", -921078764 ]
    // 79e: dstore 2
    // 79f: aload 0
    // 7a0: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঃ\u0a63", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾃㾃ﾃ뾁", -1259365277 ]
    // 7a5: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_746; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࡓࠃ࡛ࠫ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쵿쉿싿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾀ﾀ羀뾁", -1259365280 ]
    // 7aa: invokedynamic JNT (Ljava/lang/Object;)D bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "鸆鸇縉︆\ude06縇\ude04㸑帑帑ḑ︐", "ூ쯁ே", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᓖፖᑖ", -921078747 ]
    // 7af: dstore 4
    // 7b1: aload 0
    // 7b2: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঃ\u0a63", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾃㾃ﾃ뾁", -1259365230 ]
    // 7b7: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_746; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࡓࠃ࡛ࠫ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쵿쉿싿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾀ﾀ羀뾁", -1259365265 ]
    // 7bc: invokedynamic JNT (Ljava/lang/Object;)D bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "鸆鸇縉︆\ude06縇\ude04㸑帑帑㸑ḑ", "ூ쯁ே", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᓖፖᑖ", -921078758 ]
    // 7c1: dstore 6
    // 7c3: aload 0
    // 7c4: invokedynamic JNT (Ljava/lang/Object;)D bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u0a0b\u0a63ণ", "\ue07f\uef7f\uecff", "}䁽t", -1259365279 ]
    // 7c9: dconst_0
    // 7ca: dcmpl
    // 7cb: ifne b3b
    // 7ce: aload 0
    // 7cf: invokedynamic JNT (Ljava/lang/Object;)D bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ণ\u0a7b", "\ue07f\uef7f\uecff", "}䁽t", -1259365266 ]
    // 7d4: dconst_0
    // 7d5: dcmpl
    // 7d6: ifeq 075
    // 7d9: goto b3b
    // 7dc: aload 0
    // 7dd: ldc_w -1496434759
    // 7e0: ldc_w 1108986870
    // 7e3: iand
    // 7e4: bipush 0
    // 7e5: ior
    // 7e6: ldc_w 963815503
    // 7e9: iand
    // 7ea: ldc_w "儁촀뤀꤀\ue300씀\uf100\udf00촀\ue700ꌀ\ue700\ue100\ueb00촀준\ueb00봀䌀꤀\ue300씀\uf100\udf00촀\ue700\ue900䌀\ue900촀준\ued00\ue700촀쬀开䌀鬀\ue100턀턀픀\udf00턀䌀\ue100\ued00\ueb00开开开"
    // 7ed: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1856205066, "縐Ḇ븆Ḇ縉븐", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078677 ]
    // 7f2: checkcast java/lang/StringBuilder
    // 7f5: goto ed2
    // 7f8: swap
    // 7f9: ldc_w -228993385
    // 7fc: ldc_w 50002824
    // 7ff: ixor
    // 800: ldc_w -257741474
    // 803: ixor
    // 804: dup2
    // 805: if_icmpge ba3
    // 808: pop
    // 809: dup2
    // 80a: invokedynamic JNT (Ljava/lang/Object;I)C bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帇︆ḇ㸉ḃ縉", "ூ쯉쯁䯇", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078674 ]
    // 80f: dup
    // 810: ldc_w 65534
    // 813: iand
    // 814: bipush 1
    // 815: ishr
    // 816: swap
    // 817: bipush 15
    // 819: ishl
    // 81a: ior
    // 81b: dup
    // 81c: ldc 65472
    // 81e: iand
    // 81f: bipush 6
    // 821: ishr
    // 822: swap
    // 823: bipush 10
    // 825: ishl
    // 826: ior
    // 827: sipush 201
    // 82a: iadd
    // 82b: bipush 21
    // 82d: ixor
    // 82e: bipush 96
    // 830: ixor
    // 831: i2c
    // 832: dup
    // 833: dup2_x2
    // 834: pop2
    // 835: dup2_x2
    // 836: dup2_x1
    // 837: pop2
    // 838: invokedynamic JNT (Ljava/lang/Object;IC)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帉鸇縉布︆ḇ㸉ḃ縉", "ூ쯉䯇쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078675 ]
    // 83d: pop
    // 83e: ldc_w -795825204
    // 841: ldc_w -1135367694
    // 844: imul
    // 845: bipush 1
    // 846: ior
    // 847: ldc_w 279939111
    // 84a: iand
    // 84b: iadd
    // 84c: swap
    // 84d: goto 2db
    // 850: ldc_w 128501989
    // 853: ldc_w 1341280433
    // 856: ishr
    // 857: ldc_w 1162143747
    // 85a: ior
    // 85b: ldc_w 1305279715
    // 85e: iand
    // 85f: istore 11
    // 861: goto 688
    // 864: pop2
    // 865: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "縉\ude06帅縉㸉Ḇ븆\ude07", "ூ쯁\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078672 ]
    // 86a: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "ḇ︉︉鸇븆縇", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅쯁\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎诇쯒쯑\u0bd1\u0bcf쯎诓䯅", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078673 ]
    // 86f: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "縉\ude06帅縉㸉Ḇ븆\ude07", "ூ쯁\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078750 ]
    // 874: bipush 1
    // 875: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;Z)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "븇Ḇ\ude07", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅词쯁诊", "㟖㓖㍖", -921078751 ]
    // 87a: return
    // 87b: aload 0
    // 87c: invokedynamic JNT (Ljava/lang/Object;)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "㸉븆", "ூ쯁诊", "㟖㓖㍖", -921078748 ]
    // 881: goto 996
    // 884: iload 11
    // 886: ldc_w 1823535213
    // 889: isub
    // 88a: ldc_w 2073655298
    // 88d: ixor
    // 88e: ldc_w 742735677
    // 891: iadd
    // 892: ldc_w 1859761280
    // 895: ixor
    // 896: ldc_w 1088896755
    // 899: ixor
    // 89a: ldc_w 1131316969
    // 89d: isub
    // 89e: lookupswitch 582 2 -1179518843 582 403215001 1094
    // 8b8: dload 8
    // 8ba: aload 0
    // 8bb: invokedynamic JNT (Ljava/lang/Object;)Lrt; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "੫ਛ\u0a3b", "\ue07f\uef7f\uecff", "}䁽z聳p뾁", -1259365261 ]
    // 8c0: invokedynamic JNT (Ljava/lang/Object;)I bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "\ude09鸆㸇", "ூ쯁쯉", "㙖㍖", -921078666 ]
    // 8c5: i2d
    // 8c6: dcmpg
    // 8c7: ifge 394
    // 8ca: aload 0
    // 8cb: invokedynamic JNT (Ljava/lang/Object;)Z bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঋ\u09b3", "\ue07f\uef7f\uecff", "}䁽聹", -1259365259 ]
    // 8d0: ifne 394
    // 8d3: aload 0
    // 8d4: invokedynamic JNT (Ljava/lang/Object;)Lkn; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঃਫੳ", "\ue07f\uef7f\uecff", "}䁽z쁭聲뾁", -1259365278 ]
    // 8d9: invokedynamic JNT ()Lkn; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -984144447, "\u0a43\u0a43੫", "\ue17f\ue3ff", "}䁽z쁭聲뾁", -1259365249 ]
    // 8de: if_acmpne 394
    // 8e1: aload 0
    // 8e2: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঃ\u0a63", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾃㾃ﾃ뾁", -1259365252 ]
    // 8e7: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_746; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࡓࠃ࡛ࠫ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쵿쉿싿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾀ﾀ羀뾁", -1259365263 ]
    // 8ec: ldc_w 1534613733
    // 8ef: dup
    // 8f0: imul
    // 8f1: bipush 0
    // 8f2: ior
    // 8f3: ldc_w 6373378
    // 8f6: iand
    // 8f7: ldc_w "加冐兰児凄冈几冼冘凌兄凌净凔冘冐凔典傄儘儸儘兌儠儘儼儐全傈傄儸冨冼冨冼冠傄冈冼冔傄冘冐冤冘凐凔冨冼冠傄僈傄册凨傄僈傈"
    // 8fa: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1856205066, "縐Ḇ븆Ḇ縉븐", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078676 ]
    // 8ff: checkcast java/lang/StringBuilder
    // 902: goto d77
    // 905: aload 0
    // 906: ldc_w 1029452505
    // 909: ldc_w -92704798
    // 90c: ishl
    // 90d: ldc_w -177157276
    // 910: ixor
    // 911: ldc_w "\udf72彪彩彨ｵὪ\udf74뽫齪㽴ｩ㽴\udf6b罴齪彪罴齩｣뽯\udf6b｣齪彪ｪ齪彴罴｣Ὢ뽴ὪὫ罫Ὢ㽪罫齪ὢ｣罯\udf6b\udf6a\udf6aὫ뽫\udf6a｣\udf6b齴罴ὢ"
    // 914: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1856205066, "縐Ḇ븆Ḇ縉븐", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078725 ]
    // 919: checkcast java/lang/StringBuilder
    // 91c: goto f81
    // 91f: ldc_w -2033127983
    // 922: dup
    // 923: isub
    // 924: ldc_w -1459322539
    // 927: ior
    // 928: ldc_w -82012321
    // 92b: iand
    // 92c: istore 11
    // 92e: goto 60f
    // 931: swap
    // 932: ldc_w 1420651122
    // 935: ldc_w 1406559368
    // 938: ishl
    // 939: bipush 51
    // 93b: ior
    // 93c: ldc_w 277972095
    // 93f: iand
    // 940: dup2
    // 941: if_icmpge 734
    // 944: pop
    // 945: dup2
    // 946: invokedynamic JNT (Ljava/lang/Object;I)C bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帇︆ḇ㸉ḃ縉", "ூ쯉쯁䯇", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078722 ]
    // 94b: dup
    // 94c: ldc 65520
    // 94e: iand
    // 94f: bipush 4
    // 950: ishr
    // 951: swap
    // 952: bipush 12
    // 954: ishl
    // 955: ior
    // 956: bipush 30
    // 958: isub
    // 959: dup
    // 95a: ldc 49152
    // 95c: iand
    // 95d: bipush 14
    // 95f: ishr
    // 960: swap
    // 961: bipush 2
    // 962: ishl
    // 963: ior
    // 964: bipush 72
    // 966: isub
    // 967: dup
    // 968: ldc_w 65408
    // 96b: iand
    // 96c: bipush 7
    // 96e: ishr
    // 96f: swap
    // 970: bipush 9
    // 972: ishl
    // 973: ior
    // 974: i2c
    // 975: dup
    // 976: dup2_x2
    // 977: pop2
    // 978: dup2_x2
    // 979: dup2_x1
    // 97a: pop2
    // 97b: invokedynamic JNT (Ljava/lang/Object;IC)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帉鸇縉布︆ḇ㸉ḃ縉", "ூ쯉䯇쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078723 ]
    // 980: pop
    // 981: ldc_w -682928468
    // 984: ldc_w -885105173
    // 987: dup2
    // 988: imul
    // 989: ior
    // 98a: iand
    // 98b: bipush 1
    // 98c: ior
    // 98d: ldc_w 883196241
    // 990: iand
    // 991: iadd
    // 992: swap
    // 993: goto ed2
    // 996: ldc_w 1352916774
    // 999: ldc_w -1262915211
    // 99c: imul
    // 99d: ldc_w -2130375551
    // 9a0: ior
    // 9a1: ldc_w -785556045
    // 9a4: iand
    // 9a5: istore 11
    // 9a7: goto 688
    // 9aa: pop2
    // 9ab: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "縉\ude06帅縉㸉Ḇ븆\ude07", "ூ쯁\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078720 ]
    // 9b0: bipush 1
    // 9b1: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;Z)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "븇Ḇ\ude07", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅词쯁诊", "㟖㓖㍖", -921078721 ]
    // 9b6: goto 996
    // 9b9: pop2
    // 9ba: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "縉\ude06帅縉㸉Ḇ븆\ude07", "ூ쯁\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078734 ]
    // 9bf: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_2561; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1965457850, "鸆鸇縉︆\ude06縇\ude04帑︑ḑ븑帑", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅쯁\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃쯂诂쯃䯅", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᙖᏖᑖᗖ", -921078735 ]
    // 9c4: bipush 0
    // 9c5: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;Z)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "鸆鸇縉︆\ude06縇\ude04\ude11帑鸑帑", "ூ\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃쯂诂쯃䯅词쯁诊", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᓖፖᑖ", -921078732 ]
    // 9ca: aload 0
    // 9cb: bipush 1
    // 9cc: invokedynamic JNT (Ljava/lang/Object;Z)V bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -492293368, "ঋ\u09b3", "\ue07f\uef7f\uecff", "}䁽聹", -1259365245 ]
    // 9d1: aload 0
    // 9d2: bipush 0
    // 9d3: invokedynamic JNT (Ljava/lang/Object;Z)V bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -492293368, "ਣ\u0a53ਣ", "\ue07f\uef7f\uecff", "}䁽聹", -1259365248 ]
    // 9d8: aload 0
    // 9d9: invokedynamic JNT (Ljava/lang/Object;)Z bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "縉帆븉", "ூ쯁词", "㟖㓖㍖", -921078715 ]
    // 9de: ifeq a0b
    // 9e1: aload 0
    // 9e2: invokedynamic JNT (Ljava/lang/Object;)Lkc; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ਛ\u0a43\u0a0b", "\ue07f\uef7f\uecff", "}䁽z쁭쁯뾁", -1259365326 ]
    // 9e7: invokedynamic JNT (Ljava/lang/Object;)Z bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "븇ḉ\ude09", "ூ쯁词", "㫖㻖", -921078713 ]
    // 9ec: ifeq a0b
    // 9ef: aload 0
    // 9f0: invokedynamic JNT ()Lkn; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -984144447, "ਣ੫ਛ", "\ue17f\ue3ff", "}䁽z쁭聲뾁", -1259365364 ]
    // 9f5: invokedynamic JNT (Ljava/lang/Object;Lkn;)V bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -492293368, "ঃਫੳ", "\ue07f\uef7f\uecff", "}䁽z쁭聲뾁", -1259365247 ]
    // 9fa: bipush 0
    // 9fb: bipush 1
    // 9fc: invokedynamic JNT (ZZ)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1965457850, "븆︉", "ூ词词쯁诊", "㕖㛖", -921078724 ]
    // a01: aload 0
    // a02: aconst_null
    // a03: invokedynamic JNT (Ljava/lang/Object;Lnet/minecraft/class_2338;)V bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -492293368, "ਜ਼\u0a7b\u0a43", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮羃뾃뾃ﾁ뾁", -1259365365 ]
    // a08: goto 394
    // a0b: ldc_w 435501853
    // a0e: ldc_w 1467358600
    // a11: ishl
    // a12: ldc_w 189109345
    // a15: ior
    // a16: ldc_w -549060893
    // a19: iand
    // a1a: istore 11
    // a1c: goto 688
    // a1f: aload 0
    // a20: ldc_w 1345682464
    // a23: ldc_w -2095051170
    // a26: ior
    // a27: bipush 0
    // a28: ior
    // a29: ldc_w 163840
    // a2c: iand
    // a2d: ldc_w "쀔쀥쀫쀩!䀥쀠耦䀤耡)耡쀦 䀤쀥 䀪5耮쀦5䀤쀥'䀤쀡 5䀥耠䀥䀧&䀥耥&䀤䀵5.쀦쀤쀤䀧耦쀤5쀦䀠 䀵"
    // a30: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1856205066, "縐Ḇ븆Ḇ縉븐", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078770 ]
    // a35: checkcast java/lang/StringBuilder
    // a38: goto f91
    // a3b: pop2
    // a3c: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "縉\ude06帅縉㸉Ḇ븆\ude07", "ூ쯁\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078771 ]
    // a41: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_2561; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1965457850, "鸆鸇縉︆\ude06縇\ude04帑︑ḑ븑帑", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅쯁\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃쯂诂쯃䯅", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᙖᏖᑖᗖ", -921078768 ]
    // a46: bipush 0
    // a47: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;Z)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "鸆鸇縉︆\ude06縇\ude04\ude11帑鸑帑", "ூ\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃쯂诂쯃䯅词쯁诊", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᓖፖᑖ", -921078769 ]
    // a4c: aload 0
    // a4d: bipush 1
    // a4e: invokedynamic JNT (Ljava/lang/Object;Z)V bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -492293368, "\u0a0b\u09d3ਜ਼", "\ue07f\uef7f\uecff", "}䁽聹", -1259365228 ]
    // a53: aload 0
    // a54: aload 0
    // a55: invokedynamic JNT (Ljava/lang/Object;)Lrt; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u0a63ছ\u0a43", "\ue07f\uef7f\uecff", "}䁽z聳p뾁", -1259365271 ]
    // a5a: invokedynamic JNT (Ljava/lang/Object;)I bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "\ude09鸆㸇", "ூ쯁쯉", "㙖㍖", -921078716 ]
    // a5f: invokedynamic JNT (Ljava/lang/Object;I)V bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -492293368, "\u09d3\u09b3ਜ਼", "\ue07f\uef7f\uecff", "}䁽䁵", -1259365229 ]
    // a64: bipush 0
    // a65: invokedynamic JNT (Z)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1965457850, "㸉鸉", "ூ词쯁诊", "㏖㯖", -921078762 ]
    // a6a: bipush 0
    // a6b: bipush 1
    // a6c: invokedynamic JNT (ZZ)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1965457850, "븆︉", "ூ词词쯁诊", "㕖㛖", -921078763 ]
    // a71: aload 0
    // a72: aconst_null
    // a73: invokedynamic JNT (Ljava/lang/Object;Lnet/minecraft/class_2338;)V bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -492293368, "ਜ਼\u0a7b\u0a43", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮羃뾃뾃ﾁ뾁", -1259365246 ]
    // a78: aload 0
    // a79: aconst_null
    // a7a: invokedynamic JNT (Ljava/lang/Object;Lnet/minecraft/class_2338;)V bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -492293368, "ਓ\u0a3b\u0a0bঃ", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮羃뾃뾃ﾁ뾁", -1259365217 ]
    // a7f: aload 0
    // a80: bipush 0
    // a81: invokedynamic JNT (Ljava/lang/Object;I)V bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -492293368, "ਫਣ", "\ue07f\uef7f\uecff", "}䁽䁵", -1259365220 ]
    // a86: aload 0
    // a87: invokedynamic JNT (Ljava/lang/Object;)Z bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbੳ\u0a53", "\ue07f\uef7f\uecff", "}䁽聹", -1259365231 ]
    // a8c: ifne 075
    // a8f: aload 0
    // a90: invokedynamic JNT ()Lkn; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -984144447, "ਃঃ", "\ue17f\ue3ff", "}䁽z쁭聲뾁", -1259365218 ]
    // a95: invokedynamic JNT (Ljava/lang/Object;Lkn;)V bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -492293368, "ঃਫੳ", "\ue07f\uef7f\uecff", "}䁽z쁭聲뾁", -1259365221 ]
    // a9a: goto 075
    // a9d: pop2
    // a9e: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "縉\ude06帅縉㸉Ḇ븆\ude07", "ூ쯁\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078690 ]
    // aa3: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "ḇ︉︉鸇븆縇", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅쯁\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎诇쯒쯑\u0bd1\u0bcf쯎诓䯅", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078691 ]
    // aa8: aload 10
    // aaa: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "ḇ︉︉鸇븆縇", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯈诏译쯎䯏\u0bd3䯅쯁\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎诇쯒쯑\u0bd1\u0bcf쯎诓䯅", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078688 ]
    // aaf: ldc_w -1847750754
    // ab2: dup
    // ab3: ior
    // ab4: bipush 0
    // ab5: ior
    // ab6: ldc_w 1811951680
    // ab9: iand
    // aba: ldc_w "ƖǛǣǪƖǁǀǇƹǀƽǂǑƖǗǢǣǧǝƙƖƹǔǣǤǪǡǠǛƙ"
    // abd: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1856205066, "縐Ḇ븆Ḇ縉븐", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078689 ]
    // ac2: checkcast java/lang/StringBuilder
    // ac5: goto 2c7
    // ac8: ldc_w -1984429506
    // acb: ldc_w -1890086970
    // ace: ishr
    // acf: ldc_w 268988229
    // ad2: ior
    // ad3: ldc_w -1874956417
    // ad6: iand
    // ad7: istore 11
    // ad9: goto 688
    // adc: invokedynamic JNT (Ljava/lang/Object;Lkn;)V bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -492293368, "ঃਫੳ", "\ue07f\uef7f\uecff", "}䁽z쁭聲뾁", -1259365340 ]
    // ae1: goto 996
    // ae4: swap
    // ae5: ldc_w 1609968371
    // ae8: ldc_w 879489086
    // aeb: isub
    // aec: ldc_w 730479275
    // aef: ixor
    // af0: dup2
    // af1: if_icmpge 4dc
    // af4: pop
    // af5: dup2
    // af6: invokedynamic JNT (Ljava/lang/Object;I)C bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帇︆ḇ㸉ḃ縉", "ூ쯉쯁䯇", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078703 ]
    // afb: bipush 1
    // afc: ixor
    // afd: sipush 249
    // b00: isub
    // b01: bipush 2
    // b02: ixor
    // b03: sipush 217
    // b06: isub
    // b07: bipush 93
    // b09: iadd
    // b0a: i2c
    // b0b: dup
    // b0c: dup2_x2
    // b0d: pop2
    // b0e: dup2_x2
    // b0f: dup2_x1
    // b10: pop2
    // b11: invokedynamic JNT (Ljava/lang/Object;IC)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帉鸇縉布︆ḇ㸉ḃ縉", "ூ쯉䯇쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078700 ]
    // b16: pop
    // b17: ldc_w 490826479
    // b1a: ldc_w 1391203468
    // b1d: ishr
    // b1e: ldc_w 119831
    // b21: ixor
    // b22: iadd
    // b23: swap
    // b24: goto 2c7
    // b27: ldc_w 1708333329
    // b2a: ldc_w 1872079097
    // b2d: ixor
    // b2e: ldc_w 59880192
    // b31: ior
    // b32: ldc_w -1543520486
    // b35: iand
    // b36: istore 11
    // b38: goto 64d
    // b3b: dload 2
    // b3c: aload 0
    // b3d: invokedynamic JNT (Ljava/lang/Object;)D bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u0a0b\u0a63ণ", "\ue07f\uef7f\uecff", "}䁽t", -1259365341 ]
    // b42: dsub
    // b43: dload 2
    // b44: aload 0
    // b45: invokedynamic JNT (Ljava/lang/Object;)D bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u0a0b\u0a63ণ", "\ue07f\uef7f\uecff", "}䁽t", -1259365344 ]
    // b4a: dsub
    // b4b: dmul
    // b4c: dload 4
    // b4e: aload 0
    // b4f: invokedynamic JNT (Ljava/lang/Object;)D bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ফ\u09bbਓ", "\ue07f\uef7f\uecff", "}䁽t", -1259365339 ]
    // b54: dsub
    // b55: dload 4
    // b57: aload 0
    // b58: invokedynamic JNT (Ljava/lang/Object;)D bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ফ\u09bbਓ", "\ue07f\uef7f\uecff", "}䁽t", -1259365294 ]
    // b5d: dsub
    // b5e: dmul
    // b5f: dadd
    // b60: dload 6
    // b62: aload 0
    // b63: invokedynamic JNT (Ljava/lang/Object;)D bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ণ\u0a7b", "\ue07f\uef7f\uecff", "}䁽t", -1259365329 ]
    // b68: dsub
    // b69: dload 6
    // b6b: aload 0
    // b6c: invokedynamic JNT (Ljava/lang/Object;)D bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ণ\u0a7b", "\ue07f\uef7f\uecff", "}䁽t", -1259365332 ]
    // b71: dsub
    // b72: dmul
    // b73: dadd
    // b74: dstore 8
    // b76: dload 8
    // b78: ldc2_w 2500.0
    // b7b: dcmpl
    // b7c: ifle 075
    // b7f: aload 0
    // b80: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঃ\u0a63", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾃㾃ﾃ뾁", -1259365343 ]
    // b85: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_746; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࡓࠃ࡛ࠫ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쵿쉿싿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾀ﾀ羀뾁", -1259365330 ]
    // b8a: ldc_w -421666464
    // b8d: ldc_w -1637196909
    // b90: ishr
    // b91: sipush -805
    // b94: ixor
    // b95: ldc_w "o\u00ad\u0093\u009b¸©¿¦\u00adº\u0098º§¼\u00ad«¼\u0095è\u009c\u00ad¤\u00ad¸§º¼è¬\u00ad¼\u00ad«¼\u00ad¬äè¿©¡¼¡¦¯è®§ºè¿§º¤¬è¼§è¤§©¬æææ"
    // b98: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1856205066, "縐Ḇ븆Ḇ縉븐", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078613 ]
    // b9d: checkcast java/lang/StringBuilder
    // ba0: goto 065
    // ba3: ldc_w 1929545573
    // ba6: dup
    // ba7: swap
    // ba8: ishr
    // ba9: ldc_w -1140015045
    // bac: ixor
    // bad: istore 11
    // baf: goto 64d
    // bb2: ldc_w -1528878202
    // bb5: ldc_w 171682889
    // bb8: dup_x1
    // bb9: isub
    // bba: ixor
    // bbb: ldc_w -1091106935
    // bbe: ixor
    // bbf: istore 11
    // bc1: goto 688
    // bc4: ldc_w -137139899
    // bc7: ldc_w 913104030
    // bca: iushr
    // bcb: ldc_w -263229908
    // bce: ior
    // bcf: ldc_w -192975058
    // bd2: iand
    // bd3: istore 11
    // bd5: goto c2c
    // bd8: pop2
    // bd9: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "縉\ude06帅縉㸉Ḇ븆\ude07", "ூ쯁\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078610 ]
    // bde: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_2561; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1965457850, "鸆鸇縉︆\ude06縇\ude04帑︑ḑ븑帑", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅쯁\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃쯂诂쯃䯅", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᙖᏖᑖᗖ", -921078611 ]
    // be3: bipush 0
    // be4: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;Z)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "鸆鸇縉︆\ude06縇\ude04\ude11帑鸑帑", "ூ\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃쯂诂쯃䯅词쯁诊", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᓖፖᑖ", -921078608 ]
    // be9: aload 0
    // bea: bipush 1
    // beb: invokedynamic JNT (Ljava/lang/Object;Z)V bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -492293368, "ਣ\u0a53ਣ", "\ue07f\uef7f\uecff", "}䁽聹", -1259365321 ]
    // bf0: aload 0
    // bf1: invokedynamic JNT (Ljava/lang/Object;)Z bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "縉帆븉", "ூ쯁词", "㟖㓖㍖", -921078686 ]
    // bf6: ifeq 4c4
    // bf9: aload 0
    // bfa: invokedynamic JNT (Ljava/lang/Object;)Lkc; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ਛ\u0a43\u0a0b", "\ue07f\uef7f\uecff", "}䁽z쁭쁯뾁", -1259365367 ]
    // bff: invokedynamic JNT (Ljava/lang/Object;)Z bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "븇ḉ\ude09", "ூ쯁词", "㫖㻖", -921078684 ]
    // c04: ifeq 4c4
    // c07: aload 0
    // c08: invokedynamic JNT ()Lkn; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -984144447, "ਣ੫ਛ", "\ue17f\ue3ff", "}䁽z쁭聲뾁", -1259365325 ]
    // c0d: invokedynamic JNT (Ljava/lang/Object;Lkn;)V bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -492293368, "ঃਫੳ", "\ue07f\uef7f\uecff", "}䁽z쁭聲뾁", -1259365328 ]
    // c12: bipush 0
    // c13: bipush 1
    // c14: invokedynamic JNT (ZZ)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1965457850, "븆︉", "ூ词词쯁诊", "㕖㛖", -921078603 ]
    // c19: aload 0
    // c1a: aconst_null
    // c1b: invokedynamic JNT (Ljava/lang/Object;Lnet/minecraft/class_2338;)V bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -492293368, "ਜ਼\u0a7b\u0a43", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮羃뾃뾃ﾁ뾁", -1259365342 ]
    // c20: goto ebc
    // c23: aload 0
    // c24: invokedynamic JNT (Ljava/lang/Object;)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帉鸇帉", "ூ쯁诊", "㟖㓖㍖", -921078601 ]
    // c29: goto 996
    // c2c: iload 11
    // c2e: ldc_w 1958153507
    // c31: isub
    // c32: ldc_w 868961542
    // c35: isub
    // c36: ldc_w 2050320344
    // c39: isub
    // c3a: ldc_w 2046477788
    // c3d: isub
    // c3e: ldc_w 1098142942
    // c41: iadd
    // c42: ldc_w 987328892
    // c45: ixor
    // c46: lookupswitch -994 2 -1345828269 -425 1870617477 -994
    // c60: swap
    // c61: ldc_w 316038668
    // c64: ldc_w -1788937625
    // c67: ixor
    // c68: bipush 64
    // c6a: ior
    // c6b: ldc_w 272636882
    // c6e: iand
    // c6f: dup2
    // c70: if_icmpge 512
    // c73: pop
    // c74: dup2
    // c75: invokedynamic JNT (Ljava/lang/Object;I)C bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帇︆ḇ㸉ḃ縉", "ூ쯉쯁䯇", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078614 ]
    // c7a: dup
    // c7b: ldc_w 65535
    // c7e: iand
    // c7f: bipush 0
    // c80: ishr
    // c81: swap
    // c82: bipush 16
    // c84: ishl
    // c85: ior
    // c86: dup
    // c87: ldc_w 65534
    // c8a: iand
    // c8b: bipush 1
    // c8c: ishr
    // c8d: swap
    // c8e: bipush 15
    // c90: ishl
    // c91: ior
    // c92: dup
    // c93: ldc_w 32768
    // c96: iand
    // c97: bipush 15
    // c99: ishr
    // c9a: swap
    // c9b: bipush 1
    // c9c: ishl
    // c9d: ior
    // c9e: dup
    // c9f: bipush 0
    // ca0: iand
    // ca1: bipush 16
    // ca3: ishr
    // ca4: swap
    // ca5: bipush 0
    // ca6: ishl
    // ca7: ior
    // ca8: sipush 200
    // cab: ixor
    // cac: i2c
    // cad: dup
    // cae: dup2_x2
    // caf: pop2
    // cb0: dup2_x2
    // cb1: dup2_x1
    // cb2: pop2
    // cb3: invokedynamic JNT (Ljava/lang/Object;IC)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帉鸇縉布︆ḇ㸉ḃ縉", "ூ쯉䯇쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078615 ]
    // cb8: pop
    // cb9: ldc_w -1208112163
    // cbc: ldc_w 359370957
    // cbf: ixor
    // cc0: ldc_w -1567212783
    // cc3: ixor
    // cc4: iadd
    // cc5: swap
    // cc6: goto 065
    // cc9: pop2
    // cca: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "縉\ude06帅縉㸉Ḇ븆\ude07", "ூ쯁\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078612 ]
    // ccf: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_2561; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1965457850, "鸆鸇縉︆\ude06縇\ude04帑︑ḑ븑帑", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅쯁\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃쯂诂쯃䯅", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᙖᏖᑖᗖ", -921078661 ]
    // cd4: bipush 0
    // cd5: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;Z)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "鸆鸇縉︆\ude06縇\ude04\ude11帑鸑帑", "ூ\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃쯂诂쯃䯅词쯁诊", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᓖፖᑖ", -921078658 ]
    // cda: aload 0
    // cdb: bipush 0
    // cdc: invokedynamic JNT (Ljava/lang/Object;Z)V bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -492293368, "\u0a0b\u09d3ਜ਼", "\ue07f\uef7f\uecff", "}䁽聹", -1259365315 ]
    // ce1: goto d67
    // ce4: swap
    // ce5: ldc_w 1397432720
    // ce8: ldc_w -271675949
    // ceb: isub
    // cec: ldc_w 1669108647
    // cef: ixor
    // cf0: dup2
    // cf1: if_icmpge bc4
    // cf4: pop
    // cf5: dup2
    // cf6: invokedynamic JNT (Ljava/lang/Object;I)C bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帇︆ḇ㸉ḃ縉", "ூ쯉쯁䯇", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078656 ]
    // cfb: sipush 232
    // cfe: iadd
    // cff: bipush 4
    // d00: isub
    // d01: dup
    // d02: ldc_w 63488
    // d05: iand
    // d06: bipush 11
    // d08: ishr
    // d09: swap
    // d0a: bipush 5
    // d0b: ishl
    // d0c: ior
    // d0d: dup
    // d0e: ldc 64512
    // d10: iand
    // d11: bipush 10
    // d13: ishr
    // d14: swap
    // d15: bipush 6
    // d17: ishl
    // d18: ior
    // d19: bipush 90
    // d1b: iadd
    // d1c: i2c
    // d1d: dup
    // d1e: dup2_x2
    // d1f: pop2
    // d20: dup2_x2
    // d21: dup2_x1
    // d22: pop2
    // d23: invokedynamic JNT (Ljava/lang/Object;IC)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帉鸇縉布︆ḇ㸉ḃ縉", "ூ쯉䯇쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078657 ]
    // d28: pop
    // d29: ldc_w 850735625
    // d2c: ldc_w -53550937
    // d2f: imul
    // d30: bipush 0
    // d31: ior
    // d32: ldc_w 8785953
    // d35: iand
    // d36: iadd
    // d37: swap
    // d38: goto efd
    // d3b: aload 0
    // d3c: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঃ\u0a63", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾃㾃ﾃ뾁", -1259365308 ]
    // d41: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_746; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࡓࠃ࡛ࠫ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쵿쉿싿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾀ﾀ羀뾁", -1259365287 ]
    // d46: ifnull 31e
    // d49: aload 0
    // d4a: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঃ\u0a63", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾃㾃ﾃ뾁", -1259365306 ]
    // d4f: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_638; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࡓ࠻ࠋࠃ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쵿쉿싿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮羀뾃ﾁ뾁", -1259365309 ]
    // d54: ifnonnull 5ce
    // d57: goto 31e
    // d5a: pop2
    // d5b: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "縉\ude06帅縉㸉Ḇ븆\ude07", "ூ쯁\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078650 ]
    // d60: bipush 1
    // d61: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;Z)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "븇Ḇ\ude07", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅词쯁诊", "㟖㓖㍖", -921078651 ]
    // d66: return
    // d67: ldc_w -1711156781
    // d6a: ldc_w 66548734
    // d6d: ishl
    // d6e: ldc_w 1587300231
    // d71: ixor
    // d72: istore 11
    // d74: goto d9f
    // d77: ldc_w 634748052
    // d7a: ldc_w 1292612212
    // d7d: ldc_w 800776548
    // d80: imul
    // d81: iadd
    // d82: ldc_w 1457110563
    // d85: ixor
    // d86: istore 11
    // d88: goto e7e
    // d8b: ldc_w -2003390400
    // d8e: ldc_w -1486726049
    // d91: iushr
    // d92: ldc_w -2111865203
    // d95: ior
    // d96: ldc_w -1843396691
    // d99: iand
    // d9a: istore 11
    // d9c: goto 688
    // d9f: iload 11
    // da1: ldc_w 1348788191
    // da4: isub
    // da5: ldc_w 1805994496
    // da8: ixor
    // da9: ldc_w 381214485
    // dac: iadd
    // dad: ldc_w 1107033800
    // db0: ixor
    // db1: ldc_w 723825303
    // db4: isub
    // db5: ldc_w 1347183584
    // db8: iadd
    // db9: lookupswitch -1626 2 -1562860610 -2158 -583668617 -1626
    // dd4: pop2
    // dd5: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "縉\ude06帅縉㸉Ḇ븆\ude07", "ூ쯁\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078648 ]
    // dda: bipush 1
    // ddb: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;Z)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "븇Ḇ\ude07", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅词쯁诊", "㟖㓖㍖", -921078649 ]
    // de0: return
    // de1: aload 0
    // de2: invokedynamic JNT (Ljava/lang/Object;)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "縇縇︆", "ூ쯁诊", "㟖㓖㍖", -921078662 ]
    // de7: goto 996
    // dea: invokedynamic JNT ()Lkn; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -984144447, "\u0a43\u0a43੫", "\ue17f\ue3ff", "}䁽z쁭聲뾁", -1259365311 ]
    // def: goto adc
    // df2: iload 11
    // df4: ldc_w 1798195044
    // df7: ixor
    // df8: ldc_w 81381376
    // dfb: isub
    // dfc: ldc_w 778257977
    // dff: isub
    // e00: ldc_w 1546586291
    // e03: ixor
    // e04: ldc_w 1685235873
    // e07: iadd
    // e08: ldc_w 1808622489
    // e0b: iadd
    // e0c: lookupswitch -3344 5 -892534625 -3035 -719350045 52 -346999537 -2780 505277531 -3344 1601890743 340
    // e40: aload 0
    // e41: invokedynamic JNT (Ljava/lang/Object;)I bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbਓ", "\ue07f\uef7f\uecff", "}䁽䁵", -1259364402 ]
    // e46: ifle f4c
    // e49: aload 0
    // e4a: dup
    // e4b: invokedynamic JNT (Ljava/lang/Object;)I bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbਓ", "\ue07f\uef7f\uecff", "}䁽䁵", -1259364405 ]
    // e50: bipush 1
    // e51: isub
    // e52: invokedynamic JNT (Ljava/lang/Object;I)V bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -492293368, "\u09bbਓ", "\ue07f\uef7f\uecff", "}䁽䁵", -1259364408 ]
    // e57: return
    // e58: ldc_w 511335635
    // e5b: ldc_w 312842892
    // e5e: ixor
    // e5f: ldc_w -939341628
    // e62: ior
    // e63: ldc_w -350488107
    // e66: iand
    // e67: istore 11
    // e69: goto 688
    // e6c: ldc_w 1772784893
    // e6f: dup
    // e70: ishl
    // e71: ldc_w 321588350
    // e74: ior
    // e75: ldc_w -1209041154
    // e78: iand
    // e79: istore 11
    // e7b: goto 688
    // e7e: iload 11
    // e80: ldc_w 907826833
    // e83: isub
    // e84: ldc_w 491431718
    // e87: iadd
    // e88: ldc_w 1914651120
    // e8b: iadd
    // e8c: ldc_w 2118452704
    // e8f: iadd
    // e90: ldc_w 1401693315
    // e93: iadd
    // e94: ldc_w 996091966
    // e97: isub
    // e98: lookupswitch -568 3 -806657982 -568 256835553 -1696 471740529 -3116
    // ebc: ldc_w 990310837
    // ebf: ldc_w -511797803
    // ec2: dup_x1
    // ec3: ixor
    // ec4: imul
    // ec5: ldc_w 1548538950
    // ec8: ior
    // ec9: ldc_w -61932338
    // ecc: iand
    // ecd: istore 11
    // ecf: goto 688
    // ed2: ldc_w -84376269
    // ed5: ldc_w -211193550
    // ed8: iand
    // ed9: ldc_w 109189888
    // edc: ior
    // edd: ldc_w 516923148
    // ee0: iand
    // ee1: istore 11
    // ee3: goto 18d
    // ee6: aload 0
    // ee7: aload 0
    // ee8: invokedynamic JNT (Ljava/lang/Object;)Lkc; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "੫ਃਜ਼", "\ue07f\uef7f\uecff", "}䁽z쁭쁯뾁", -1259364403 ]
    // eed: invokedynamic JNT (Ljava/lang/Object;)Z bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "븇ḉ\ude09", "ூ쯁词", "㫖㻖", -921078704 ]
    // ef2: ifeq dea
    // ef5: invokedynamic JNT ()Lkn; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -984144447, "ফਣਜ਼", "\ue17f\ue3ff", "}䁽z쁭聲뾁", -1259365289 ]
    // efa: goto adc
    // efd: ldc_w -923997861
    // f00: dup
    // f01: dup_x1
    // f02: ishr
    // f03: iushr
    // f04: ldc_w -1622270685
    // f07: ior
    // f08: ldc_w -2187989
    // f0b: iand
    // f0c: istore 11
    // f0e: goto 884
    // f11: iload 11
    // f13: ldc_w 1266461408
    // f16: iadd
    // f17: ldc_w 215150675
    // f1a: isub
    // f1b: ldc_w 1636342530
    // f1e: iadd
    // f1f: ldc_w 337906492
    // f22: iadd
    // f23: ldc_w 1461113496
    // f26: iadd
    // f27: ldc_w 1580171365
    // f2a: isub
    // f2b: lookupswitch -1409 3 299360887 -465 821190495 -1409 1876772322 -343
    // f4c: ldc_w 235899274
    // f4f: ldc_w 262700741
    // f52: ldc_w -1359859639
    // f55: imul
    // f56: iand
    // f57: ldc_w 1735893867
    // f5a: ixor
    // f5b: istore 11
    // f5d: goto df2
    // f60: aload 0
    // f61: invokedynamic JNT (Ljava/lang/Object;)Z bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbੳ\u0a53", "\ue07f\uef7f\uecff", "}䁽聹", -1259365292 ]
    // f66: ifne 179
    // f69: aload 0
    // f6a: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_1657; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "㸉縇\ude06", "ூ쯁\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌쯃诂쯂䯂䯅", "㟖㓖㍖", -921078655 ]
    // f6f: astore 8
    // f71: aload 8
    // f73: ifnull 31d
    // f76: aload 0
    // f77: aload 8
    // f79: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "︆㸆︉", "ூ\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌쯃诂쯂䯂䯅쯁诊", "㟖㓖㍖", -921078652 ]
    // f7e: goto 31d
    // f81: ldc_w 58600350
    // f84: ldc_w 888605007
    // f87: ior
    // f88: ldc_w 1274239940
    // f8b: ixor
    // f8c: istore 11
    // f8e: goto 18d
    // f91: ldc_w -404915079
    // f94: dup
    // f95: imul
    // f96: ldc_w 213912774
    // f99: ior
    // f9a: ldc_w 771026118
    // f9d: iand
    // f9e: istore 11
    // fa0: goto 18d
  }

  public void ses() {
    int var4 = -1662428707;
    if (null /* jnt:encrypted */
        )
      ) instanceof class_1707 var1
      && /* jnt */ == 4) {
      var4 = -1612034660 - (133047647 + -230432033) ^ -2136020540;

      while (true) {
        switch ((var4 - 1573335394 - 639811154 + 206129041 ^ 1288347998) + 282438024 - 2140094976) {
          case 1587998040:
          default:
            /* jnt */
              )
            );
            null /* jnt:encrypted */);
            null /* jnt:encrypted */;
            return;
          case 1929579697:
        }

        if (!null /* jnt:encrypted */) {
          int var5 = 45;

          while (true) {
            var4 = (-1491619029 | -1877708023) ^ 1765110892;

            while (true) {
              switch ((var4 ^ 1498334109) - 1915037075 + 734177635 + 1543831854 + 1373966015 + 349167547) {
                case -131110218:
                default:
                  null /* jnt:encrypted */;
                  null /* jnt:encrypted */;
                  return;
                case 63158354:
              }

              if (var5 <= 80) {
                class_1799 var3 = (ItemStack)/* jnt */
                      )
                    )
                  ),
                  var5
                );
                if (/* jnt */
                    != null /* jnt:encrypted */
                  && /* jnt */
                    != null /* jnt:encrypted */
                  && !/* jnt */
                  )) {
                  /* jnt */
                    ),
                    null /* jnt:encrypted */
                        )
                      )
                    ),
                    var5,
                    0,
                    null /* jnt:encrypted */,
                    null /* jnt:encrypted */
                    )
                  );
                }

                var5++;
                break;
              }

              var4 = (61653536 * -2070640904 | 579417251) & 580859131;
            }
          }
        }

        var4 = (-1216587724 << -1637497383 | -112538447) & -68489221;
      }
    }

    class_634 var10000 = /* jnt */
    );
    int var10001 = -1844585317 & 753734410 ^ 856074;

    StringBuilder var10002;
    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((-156680697 | -1701516499) ^ -21102805);
      var10001 += -85888867 - 739915351 ^ -825804217
    ) {
      char var10 = /* jnt */;
      char var11 = (char)((((var10 & '\ufffe') >> 1 | var10 << 15) ^ 64) + 83 + 54 - 0);
      /* jnt */((((var10 & '\ufffe') >> 1 | var10 << 15) ^ 64) + 83 + 54 - 0)
      );
    }

    /* jnt */
    );
    null /* jnt:encrypted */;
  }

  public void ddh() {
    int var3 = -283495781;
    if (null /* jnt:encrypted */
      )
    ) instanceof class_1707) {
      /* jnt */
        )
      );
      null /* jnt:encrypted */;
    } else {
      var3 = (1054619671 ^ -2134559209 | 1732622457) & 1876277755;

      while (true) {
        label86:
        while (true) {
          switch ((var3 - 1301873158 + 1173862410 ^ 467918788 ^ 1084545223 ^ 1525497328) + 1835916434) {
            case -1511243829:
              null /* jnt:encrypted */;
              break label86;
            case -745787104:
              /* jnt */;
              if (!/* jnt */) {
                if (!/* jnt */) {
                  int var10001 = (1827482125 | 1788089813 | 0) & 147456;

                  StringBuilder var10002;
                  for (var10002 = (StringBuilder)/* jnt */;
                    var10001 < (-1756582990 - 1701329998 * 1701329998 ^ -38272059);
                    var10001 += (-1289366810 >>> 1545505065 | 1) & 1847855379
                  ) {
                    int var8 = /* jnt */ + 'p' - 102 - 185;
                    char var9 = (char)(((var8 & 64512) >> 10 | var8 << 6) + 137);
                    /* jnt */(((var8 & 64512) >> 10 | var8 << 6) + 137)
                    );
                  }

                  /* jnt */, true
                  );
                  return;
                }

                var3 = 1645794688 - 530285105 ^ -41993299;
              } else {
                var3 = 1829835344 * -1610823072 ^ -1579576700;
              }
              continue;
            case -712046943:
              if (!null /* jnt:encrypted */
                && !null /* jnt:encrypted */) {
                var3 = (-366647203 >>> -366647203 | -860045270) & -4270802;
                continue;
              }

              var3 = (-1591493679 >> -1591493679 | 302833673) & -230884851;
              continue;
            case -172743531:
              class_2248 var1 = /* jnt */
                  ),
                  null /* jnt:encrypted */
                )
              );
              if (!/* jnt */
              )) {
                /* jnt */;
                null /* jnt:encrypted */ + 1);
                if (null /* jnt:encrypted */
                  > /* jnt */)) {
                  null /* jnt:encrypted */ + 1
                  );
                  null /* jnt:encrypted */ + 1
                  );
                  null /* jnt:encrypted */;
                  null /* jnt:encrypted */;
                  if (null /* jnt:encrypted */
                    && null /* jnt:encrypted */ >= 1
                    && /* jnt */) {
                    null /* jnt:encrypted */;
                    null /* jnt:encrypted */);
                  }
                }

                var3 = (-733706369 & 747921280 + 747921280 | -1008158220) & -403898889;
              } else {
                var3 = 1839994482 - (1839994482 - (1839994482 ^ 1839994482)) ^ -1416837628;
              }

              switch ((var3 ^ 852431465) - 108210756 - 1938258380 + 463951159 - 1557989190 - 1731071125) {
                case -825668375:
                  return;
                case 1994748345:
                default:
                  null /* jnt:encrypted */;
                  yr var2 = /* jnt */
                    ),
                    /* jnt */
                    )
                  );
                  /* jnt */
                    ),
                    (float)/* jnt */
                  );
                  /* jnt */
                    ),
                    (float)/* jnt */
                  );
                  /* jnt */;
                  return;
              }
            case 446887181:
              if (null /* jnt:encrypted */ == null) {
                null /* jnt:encrypted */
                );
                if (null /* jnt:encrypted */ == null) {
                  /* jnt */;
                  /* jnt */;
                  if (!null /* jnt:encrypted */) {
                    /* jnt */;
                    null /* jnt:encrypted */;
                  }

                  var3 = (1945876295 >>> 845136284 | 1898732280) & -202384648;
                } else {
                  var3 = 1986485431 ^ -1008819596 & 1986485431 ^ 1968504645;
                }
                continue;
              }
              break label86;
            case 607715495:
              null /* jnt:encrypted */;
              return;
            case 840902995:
              if (!/* jnt */)
                || !/* jnt */) {
                var3 = (-1647458776 | -1647458776) ^ 2087235273;
                continue;
              }

              null /* jnt:encrypted */);
              break;
            case 1226571944:
              null /* jnt:encrypted */);
              break;
            case 1409687417:
              return;
            case 1486846352:
            default:
              null /* jnt:encrypted */);
          }

          var3 = (-2038622614 >>> (-1841091831 & -963414005) | -292306928) & -270810352;
        }

        var3 = (221599718 * 749620235 | 294436044) & -1852965396;
      }
    }
  }

  public void rn() {
    int var4 = -954121104;
    /* jnt */;
    /* jnt */;
    if (null /* jnt:encrypted */
      )
    ) instanceof class_1707 var5) {
      if (/* jnt */ == 6) {
        null /* jnt:encrypted */);
      } else {
        /* jnt */
          )
        );
        null /* jnt:encrypted */;
      }
    } else {
      var4 = (1292136922 + 212609919 | -2019597816) & -2019593652;

      while (true) {
        switch (((var4 ^ 199146533 ^ 1002061383) - 1204447240 ^ 1052421074) - 1225141602 + 471910173) {
          case -1089989178:
            yr var1 = /* jnt */
              ),
              /* jnt */
              )
            );
            /* jnt */
              ),
              (float)/* jnt */
            );
            /* jnt */
              ),
              (float)/* jnt */
            );
            if (null /* jnt:encrypted */
              ) instanceof class_3965 var6
              && /* jnt */
                    ),
                    /* jnt */
                  )
                )
                == null /* jnt:encrypted */
              )
             {
              /* jnt */;
              null /* jnt:encrypted */;
            }

            return;
          case 564510123:
        }

        if (null /* jnt:encrypted */ == null) {
          null /* jnt:encrypted */
          );
          if (null /* jnt:encrypted */ == null) {
            class_746 var10000 = null /* jnt:encrypted */
            );
            int var10001 = (-2127949690 ^ -1838093882 | 0) & -998243176;

            StringBuilder var10002;
            for (var10002 = (StringBuilder)/* jnt */;
              var10001 < ((-1172323550 | -1172323550) ^ -1172323574);
              var10001 += 261352725 * -317868009 ^ 868377826
            ) {
              int var10 = /* jnt */;
              int var10005 = (var10 & 0) >> 16;
              int var11 = (var10 & 0) >> 16 | var10 << 0;
              int var19 = (((var10 & 0) >> 16 | var10 << 0) & 65520) >> 4;
              var10 = ((var10005 | var10 << 0) & 65520) >> 4 | ((var10 & 0) >> 16 | var10 << 0) << 12;
              var10005 = ((var19 | var11 << 12) & 65534) >> 1;
              int var13 = ((var19 | var11 << 12) & 65534) >> 1 | var10 << 15;
              int var21 = ((((var19 | var11 << 12) & 65534) >> 1 | var10 << 15) & 0) >> 16;
              char var14 = (char)((((var10005 | var10 << 15) & 0) >> 16 | (((var19 | var11 << 12) & 65534) >> 1 | var10 << 15) << 0) + 153);
              /* jnt */((var21 | var13 << 0) + 153));
            }

            /* jnt */
              ),
              false
            );
            null /* jnt:encrypted */);
            return;
          }
        }

        var4 = (452313929 - 36246599 | 755381379) & 1833368963;
      }
    }
  }

  public void xj() {
    int var6 = -1654179980;
    if (null /* jnt:encrypted */
        )
      ) instanceof class_1707 var1
      && /* jnt */ == 6) {
      int var7 = 0;
      int var3 = 0;

      label72:
      while (true) {
        var6 = (1268400114 << 1268400114 | 625215514) & 627341339;

        while (true) {
          switch (var6 + 1712967163 - 1795689126 + 763989166 - 2024143995 - 1057461362 + 1183654043) {
            case -2131759499:
              var3++;
              continue label72;
            case -591468597:
              if (var3 < 54) {
                if (/* jnt *//* jnt */
                          )
                        )
                      ),
                      var3
                    )
                  )
                  == null /* jnt:encrypted */
                  )
                 {
                  var7++;
                }

                var6 = (1024274918 - -807677019 | -1992030012) & -906022940;
              } else {
                var6 = (-1616169662 ^ 1838272100 | 749050544) & -1377314120;
              }
              break;
            case -428669875:
            default:
              boolean var8 = false;
              int var4 = 54;

              while (true) {
                var6 = (1355199463 - -1534698256 | 1434493512) & 1436525273;

                while (true) {
                  switch (var6 + 1444930210 + 1048205932 - 1190818523 - 1590491916 ^ 1594600991 ^ 2024275648) {
                    case -1089154664:
                    default:
                      if (!var8) {
                        /* jnt */
                          )
                        );
                        null /* jnt:encrypted */;
                        null /* jnt:encrypted */
                        );
                      }

                      var6 = -480879684 * 224940033 ^ 1134590846;
                      continue;
                    case -986153162:
                      return;
                    case 1677664991:
                  }

                  if (var4 < 90) {
                    class_1792 var5 = /* jnt *//* jnt */
                            )
                          )
                        ),
                        var4
                      )
                    );
                    if (var5
                      == null /* jnt:encrypted */
                      )
                     {
                      /* jnt */
                        ),
                        null /* jnt:encrypted */
                            )
                          )
                        ),
                        var4,
                        0,
                        null /* jnt:encrypted */,
                        null /* jnt:encrypted */
                        )
                      );
                      var8 = true;
                      null /* jnt:encrypted */;
                      return;
                    }

                    var4++;
                    break;
                  }

                  var6 = -1697536100 * -1920739862 ^ 218739384;
                }
              }
            case 1679997537:
              if (var7 == 0) {
                class_746 var10000 = null /* jnt:encrypted */
                );
                int var10001 = (-1809731017 | 888486411 | 0) & 1090535872;

                StringBuilder var10002;
                for (var10002 = (StringBuilder)/* jnt */;
                  var10001 < ((-1820736408 ^ -574726472 | 39) & 556286247);
                  var10001 += (1452086283 | 19820716 * -1111425123) ^ 2126478718
                ) {
                  int var14 = /* jnt */ + 228 + 211 - 35;
                  char var15 = (char)(((var14 & 65520) >> 4 | var14 << 12) + 182);
                  /* jnt */(((var14 & 65520) >> 4 | var14 << 12) + 182)
                  );
                }

                /* jnt */
                  ),
                  false
                );
                /* jnt */
                  )
                );
                null /* jnt:encrypted */);
                null /* jnt:encrypted */;
                return;
              }

              var6 = (-1385985074 >>> -1385985074 * (-1385985074 & -1385985074) | 741868552) & 804890076;
          }
        }
      }
    }

    /* jnt */
      )
    );
    null /* jnt:encrypted */);
    null /* jnt:encrypted */;
  }

  public void rg() {
    // $VF: Couldn't be decompiled
    // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
    // java.lang.RuntimeException: parsing failure!
    //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
    //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
    //
    // Bytecode:
    // 000: goto 400
    // 003: pop2
    // 004: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "縉\ude06帅縉㸉Ḇ븆\ude07", "ூ쯁\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078858 ]
    // 009: bipush 1
    // 00a: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;Z)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "븇Ḇ\ude07", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅词쯁诊", "㟖㓖㍖", -921078859 ]
    // 00f: return
    // 010: ldc_w 1380909950
    // 013: dup
    // 014: imul
    // 015: ldc_w -883476310
    // 018: ixor
    // 019: istore 6
    // 01b: goto 4bb
    // 01e: ldc_w -824320669
    // 021: dup
    // 022: ishl
    // 023: ldc_w 9438348
    // 026: ior
    // 027: ldc_w -1863297876
    // 02a: iand
    // 02b: istore 6
    // 02d: goto 0b0
    // 030: iload 6
    // 032: ldc_w 1987040298
    // 035: iadd
    // 036: ldc_w 1817303054
    // 039: ixor
    // 03a: ldc_w 1223220828
    // 03d: iadd
    // 03e: ldc_w 543761815
    // 041: iadd
    // 042: ldc_w 264761596
    // 045: ixor
    // 046: ldc_w 1794292035
    // 049: ixor
    // 04a: lookupswitch 302 3 -1344211798 860 -803114772 302 -393058925 829
    // 06c: aload 0
    // 06d: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঃ\u0a63", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾃㾃ﾃ뾁", -1259363550 ]
    // 072: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_746; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࡓࠃ࡛ࠫ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쵿쉿싿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾀ﾀ羀뾁", -1259363521 ]
    // 077: invokedynamic JNT (Ljava/lang/Object;)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "鸆鸇縉︆\ude06縇\ude04\ude11帑縑븑", "ூ쯁诊", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᓖፖᑖ", -921078870 ]
    // 07c: aload 0
    // 07d: bipush 5
    // 07e: invokedynamic JNT (Ljava/lang/Object;I)V bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -492293368, "\u09bbਓ", "\ue07f\uef7f\uecff", "}䁽䁵", -1259363535 ]
    // 083: return
    // 084: iload 2
    // 085: ifne 7c9
    // 088: aload 0
    // 089: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঃ\u0a63", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾃㾃ﾃ뾁", -1259363522 ]
    // 08e: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_746; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࡓࠃ࡛ࠫ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쵿쉿싿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾀ﾀ羀뾁", -1259363525 ]
    // 093: ldc_w 1348411659
    // 096: dup
    // 097: iadd
    // 098: ldc_w -1598143978
    // 09b: ixor
    // 09c: ldc_w "ꟺ藺臺繺豺蓺迺譺蛺赺糺赺诺蹺蛺藺蹺苺擺睺藺衺蛺跺蹺擺蝺軺詺詺敺擺竺诺蟺蟺裺譺蟺擺诺軺蹺敺"
    // 09f: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1856205066, "縐Ḇ븆Ḇ縉븐", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078914 ]
    // 0a4: checkcast java/lang/StringBuilder
    // 0a7: goto 44c
    // 0aa: iinc 4 1
    // 0ad: goto 108
    // 0b0: iload 6
    // 0b2: ldc_w 1306931832
    // 0b5: iadd
    // 0b6: ldc_w 406551333
    // 0b9: ixor
    // 0ba: ldc_w 1843289886
    // 0bd: iadd
    // 0be: ldc_w 1967527984
    // 0c1: isub
    // 0c2: ldc_w 309809760
    // 0c5: ixor
    // 0c6: ldc_w 1192278489
    // 0c9: iadd
    // 0ca: lookupswitch 1932 4 -208662616 1932 -127771790 1400 1438206035 435 1963113288 203
    // 0f4: ldc_w -272688581
    // 0f7: ldc_w 805082396
    // 0fa: iand
    // 0fb: ldc_w 1901534436
    // 0fe: ior
    // 0ff: ldc_w -109051921
    // 102: iand
    // 103: istore 6
    // 105: goto 6f2
    // 108: ldc_w 912011478
    // 10b: ldc_w -2129538424
    // 10e: iushr
    // 10f: ldc_w -904237403
    // 112: ixor
    // 113: istore 6
    // 115: goto 6f2
    // 118: ldc_w 2110222105
    // 11b: ldc_w 275447639
    // 11e: ishr
    // 11f: ldc_w 1691329357
    // 122: ixor
    // 123: istore 6
    // 125: goto 0b0
    // 128: ldc_w 1132948646
    // 12b: ldc_w 921479600
    // 12e: isub
    // 12f: ldc_w 811643160
    // 132: ior
    // 133: ldc_w -1285161575
    // 136: iand
    // 137: istore 6
    // 139: goto 789
    // 13c: bipush 0
    // 13d: bipush 1
    // 13e: invokedynamic JNT (ZZ)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1965457850, "븆︉", "ூ词词쯁诊", "㕖㛖", -921078915 ]
    // 143: bipush 0
    // 144: invokedynamic JNT (Z)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1965457850, "㸉鸉", "ூ词쯁诊", "㏖㯖", -921078912 ]
    // 149: aload 0
    // 14a: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঃ\u0a63", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾃㾃ﾃ뾁", -1259363513 ]
    // 14f: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_746; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࡓࠃ࡛ࠫ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쵿쉿싿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾀ﾀ羀뾁", -1259363516 ]
    // 154: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_1703; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࠃ࠳ࡓ࡛", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ콿쳿쿿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮㾃뾀ﾃ뾃뾁", -1259363495 ]
    // 159: astore 2
    // 15a: aload 2
    // 15b: instanceof net/minecraft/class_1707
    // 15e: ifeq 773
    // 161: aload 2
    // 162: checkcast net/minecraft/class_1707
    // 165: astore 1
    // 166: aload 1
    // 167: invokedynamic JNT (Ljava/lang/Object;)I bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "鸆鸇縉︆\ude06縇\ude04ḑ\ude11帑︐︐", "ூ쯁쯉", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᗖᓖᕖᓖ", -921078924 ]
    // 16c: bipush 6
    // 16e: if_icmpne 06c
    // 171: bipush 0
    // 172: istore 2
    // 173: bipush 0
    // 174: istore 3
    // 175: goto 2af
    // 178: pop2
    // 179: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "縉\ude06帅縉㸉Ḇ븆\ude07", "ூ쯁\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078909 ]
    // 17e: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_2561; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1965457850, "鸆鸇縉︆\ude06縇\ude04帑︑ḑ븑帑", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅쯁\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃쯂诂쯃䯅", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᙖᏖᑖᗖ", -921078906 ]
    // 183: bipush 0
    // 184: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;Z)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "鸆鸇縉︆\ude06縇\ude04\ude11帑鸑帑", "ூ\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃쯂诂쯃䯅词쯁诊", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᓖፖᑖ", -921078907 ]
    // 189: goto 3f2
    // 18c: bipush 0
    // 18d: istore 3
    // 18e: bipush 54
    // 190: istore 4
    // 192: goto 108
    // 195: aload 0
    // 196: invokedynamic JNT (Ljava/lang/Object;)Z bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ਣ\u0a53ਣ", "\ue07f\uef7f\uecff", "}䁽聹", -1259363598 ]
    // 19b: ifeq 3f2
    // 19e: aload 0
    // 19f: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঃ\u0a63", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾃㾃ﾃ뾁", -1259363633 ]
    // 1a4: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_746; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࡓࠃ࡛ࠫ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쵿쉿싿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾀ﾀ羀뾁", -1259363636 ]
    // 1a9: ldc_w -497018222
    // 1ac: ldc_w -907510811
    // 1af: iushr
    // 1b0: ldc_w 118685908
    // 1b3: ixor
    // 1b4: ldc_w "\uedf5\ue5f3闳嗳㗴엳淴◴\ue5f3䗴㷳䗴ⷴ嗴\ue5f3헳嗴ꗳ뷱\ue5f2헳ﷳ\ue5f3䷴嗴\ue5f3\uddf3엱뷱◳ﷵ◴ﷵ◴\uf5f3뷱엳ᗴᗴ뷱䗴\ue5f3ᷴ엳ﷵ◴ﷵ◴\uf5f3뷱䷴㗴엳淴◴\ue5f3䗴䷴ⷲⷲⷲ"
    // 1b7: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1856205066, "縐Ḇ븆Ḇ縉븐", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078919 ]
    // 1bc: checkcast java/lang/StringBuilder
    // 1bf: goto 360
    // 1c2: swap
    // 1c3: ldc_w 1094497851
    // 1c6: ldc_w 360232310
    // 1c9: dup_x1
    // 1ca: isub
    // 1cb: isub
    // 1cc: ldc_w -374033278
    // 1cf: ixor
    // 1d0: dup2
    // 1d1: if_icmpge 372
    // 1d4: pop
    // 1d5: dup2
    // 1d6: invokedynamic JNT (Ljava/lang/Object;I)C bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帇︆ḇ㸉ḃ縉", "ூ쯉쯁䯇", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078916 ]
    // 1db: sipush 129
    // 1de: ixor
    // 1df: dup
    // 1e0: ldc_w 65535
    // 1e3: iand
    // 1e4: bipush 0
    // 1e5: ishr
    // 1e6: swap
    // 1e7: bipush 16
    // 1e9: ishl
    // 1ea: ior
    // 1eb: bipush 61
    // 1ed: iadd
    // 1ee: dup
    // 1ef: ldc 65520
    // 1f1: iand
    // 1f2: bipush 4
    // 1f3: ishr
    // 1f4: swap
    // 1f5: bipush 12
    // 1f7: ishl
    // 1f8: ior
    // 1f9: dup
    // 1fa: ldc_w 65528
    // 1fd: iand
    // 1fe: bipush 3
    // 1ff: ishr
    // 200: swap
    // 201: bipush 13
    // 203: ishl
    // 204: ior
    // 205: i2c
    // 206: dup
    // 207: dup2_x2
    // 208: pop2
    // 209: dup2_x2
    // 20a: dup2_x1
    // 20b: pop2
    // 20c: invokedynamic JNT (Ljava/lang/Object;IC)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帉鸇縉布︆ḇ㸉ḃ縉", "ூ쯉䯇쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078965 ]
    // 211: pop
    // 212: ldc_w 1803703073
    // 215: ldc_w 584693745
    // 218: ixor
    // 219: ldc_w 1230759121
    // 21c: ixor
    // 21d: iadd
    // 21e: swap
    // 21f: goto 3ca
    // 222: iload 3
    // 223: ifne 864
    // 226: aload 0
    // 227: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঃ\u0a63", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾃㾃ﾃ뾁", -1259363640 ]
    // 22c: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_746; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࡓࠃ࡛ࠫ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쵿쉿싿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾀ﾀ羀뾁", -1259363635 ]
    // 231: invokedynamic JNT (Ljava/lang/Object;)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "鸆鸇縉︆\ude06縇\ude04\ude11帑縑븑", "ூ쯁诊", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᓖፖᑖ", -921078960 ]
    // 236: aload 0
    // 237: bipush 3
    // 238: invokedynamic JNT (Ljava/lang/Object;I)V bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -492293368, "\u09bbਓ", "\ue07f\uef7f\uecff", "}䁽䁵", -1259363497 ]
    // 23d: aload 0
    // 23e: bipush 5
    // 23f: invokedynamic JNT ()Lnet/minecraft/class_2248; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -984144447, "\u09bbও\u09b3੫ফৃࡓࡋ࡛࠻ࡋ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ췿췿쳿쿿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮羃羃ﾀﾁ뾁", -1259363500 ]
    // 244: invokedynamic JNT (Ljava/lang/Object;ILjava/lang/Object;)Lnet/minecraft/class_2338; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "縆︉帇", "ூ쯉\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃诃\u0bc3ெ䯅쯁\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃䯃䯃ெ䯅", "㟖㓖㍖", -921078911 ]
    // 249: astore 4
    // 24b: aload 4
    // 24d: ifnull 118
    // 250: aload 0
    // 251: invokedynamic JNT (Ljava/lang/Object;)Z bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঋ\u09b3", "\ue07f\uef7f\uecff", "}䁽聹", -1259363498 ]
    // 256: ifeq 01e
    // 259: aload 0
    // 25a: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঃ\u0a63", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾃㾃ﾃ뾁", -1259363501 ]
    // 25f: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_746; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࡓࠃ࡛ࠫ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쵿쉿싿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾀ﾀ羀뾁", -1259363504 ]
    // 264: ldc_w -1897108580
    // 267: dup
    // 268: ixor
    // 269: bipush 0
    // 26a: ior
    // 26b: ldc_w -641925289
    // 26e: iand
    // 26f: ldc_w "参㇂ⷂ⧂㝂ヂ㯂㙂㋂㡂❂㡂㟂㥂㋂㇂㥂⻂ག⋂㇂㍂㋂㧂㥂㋂ㅂჂག⛂㓂㙂㓂㙂㏂ག㙂㋂㭂㥂ག㧂㝂ヂ㯂㙂㋂㡂ᙂᙂᙂ"
    // 272: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1856205066, "縐Ḇ븆Ḇ縉븐", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078955 ]
    // 277: checkcast java/lang/StringBuilder
    // 27a: goto 3ca
    // 27d: aload 0
    // 27e: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঃ\u0a63", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾃㾃ﾃ뾁", -1259363518 ]
    // 283: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_746; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࡓࠃ࡛ࠫ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쵿쉿싿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾀ﾀ羀뾁", -1259363489 ]
    // 288: ldc_w 620621159
    // 28b: ldc_w -1240736969
    // 28e: iadd
    // 28f: ldc_w -620115810
    // 292: ixor
    // 293: ldc_w "2ﺾﻊﻚﺠﺾﺒﺤﺶﺜﻠﺜﺢﺘﺶﺺﺘﻆ｀\ufefeﺨﺨ｀ﺚﺠﺾﺒﺤﺶﺜﺚ｀ﺚﺶﺺﺖﺜﺶﺸ＾"
    // 296: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1856205066, "縐Ḇ븆Ḇ縉븐", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078966 ]
    // 29b: checkcast java/lang/StringBuilder
    // 29e: goto 010
    // 2a1: ldc_w -271240986
    // 2a4: dup
    // 2a5: ior
    // 2a6: ldc_w 1044393195
    // 2a9: ixor
    // 2aa: istore 6
    // 2ac: goto 030
    // 2af: ldc_w -1297549756
    // 2b2: ldc_w 55660508
    // 2b5: swap
    // 2b6: imul
    // 2b7: ldc_w 1581964315
    // 2ba: ixor
    // 2bb: istore 6
    // 2bd: goto 408
    // 2c0: aload 0
    // 2c1: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_2338; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ਓ\u0a3b\u0a0bঃ", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮羃뾃뾃ﾁ뾁", -1259363503 ]
    // 2c6: ifnonnull 128
    // 2c9: aload 0
    // 2ca: aload 0
    // 2cb: bipush 6
    // 2cd: invokedynamic JNT ()Lnet/minecraft/class_2248; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -984144447, "\u09bbও\u09b3੫ফৃࡓࡋࠫࠫࠣ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ췿췿쳿쿿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮羃羃ﾀﾁ뾁", -1259363490 ]
    // 2d2: invokedynamic JNT (Ljava/lang/Object;ILjava/lang/Object;)Lnet/minecraft/class_2338; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "縆︉帇", "ூ쯉\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃诃\u0bc3ெ䯅쯁\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃䯃䯃ெ䯅", "㟖㓖㍖", -921078117 ]
    // 2d7: invokedynamic JNT (Ljava/lang/Object;Lnet/minecraft/class_2338;)V bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -492293368, "ਓ\u0a3b\u0a0bঃ", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮羃뾃뾃ﾁ뾁", -1259363496 ]
    // 2dc: aload 0
    // 2dd: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_2338; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ਓ\u0a3b\u0a0bঃ", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮羃뾃뾃ﾁ뾁", -1259363491 ]
    // 2e2: ifnonnull 128
    // 2e5: aload 0
    // 2e6: ldc_w 1869777303
    // 2e9: ldc_w 486971634
    // 2ec: ishl
    // 2ed: bipush 0
    // 2ee: ior
    // 2ef: ldc_w 2151160
    // 2f2: iand
    // 2f3: ldc_w "\ueb7b쥻앻셻ퟻ졻퍻컻쩻탻쟻탻콻퇻쩻쥻퇻왻꿻뻻콻꿻쩻쥻쯻쩻텻퇻꿻쫻콻퉻컻짻\ua87b꿻멻칻쩻탻쭻쩻컻쥻푻꿻췻콻쭻콻퉻퇻\ua87b"
    // 2f6: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1856205066, "縐Ḇ븆Ḇ縉븐", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078112 ]
    // 2fb: checkcast java/lang/StringBuilder
    // 2fe: goto 584
    // 301: iinc 3 1
    // 304: goto 2af
    // 307: swap
    // 308: ldc_w 1986258290
    // 30b: ldc_w 1365621966
    // 30e: dup2
    // 30f: ishr
    // 310: ishl
    // 311: iand
    // 312: ldc_w 1449328688
    // 315: ixor
    // 316: dup2
    // 317: if_icmpge 7bc
    // 31a: pop
    // 31b: dup2
    // 31c: invokedynamic JNT (Ljava/lang/Object;I)C bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帇︆ḇ㸉ḃ縉", "ூ쯉쯁䯇", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078113 ]
    // 321: sipush 232
    // 324: ixor
    // 325: dup
    // 326: ldc_w 32768
    // 329: iand
    // 32a: bipush 15
    // 32c: ishr
    // 32d: swap
    // 32e: bipush 1
    // 32f: ishl
    // 330: ior
    // 331: bipush 117
    // 333: iadd
    // 334: bipush 0
    // 335: ixor
    // 336: dup
    // 337: ldc 49152
    // 339: iand
    // 33a: bipush 14
    // 33c: ishr
    // 33d: swap
    // 33e: bipush 2
    // 33f: ishl
    // 340: ior
    // 341: i2c
    // 342: dup
    // 343: dup2_x2
    // 344: pop2
    // 345: dup2_x2
    // 346: dup2_x1
    // 347: pop2
    // 348: invokedynamic JNT (Ljava/lang/Object;IC)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帉鸇縉布︆ḇ㸉ḃ縉", "ூ쯉䯇쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078126 ]
    // 34d: pop
    // 34e: ldc_w 759798542
    // 351: ldc_w 719415125
    // 354: iushr
    // 355: bipush 1
    // 356: ior
    // 357: ldc_w -38742379
    // 35a: iand
    // 35b: iadd
    // 35c: swap
    // 35d: goto 307
    // 360: ldc_w -1898263678
    // 363: dup
    // 364: ior
    // 365: ldc_w 537415315
    // 368: ior
    // 369: ldc_w 743272183
    // 36c: iand
    // 36d: istore 6
    // 36f: goto 4bb
    // 372: ldc_w 138029138
    // 375: ldc_w -1226811916
    // 378: iadd
    // 379: ldc_w -1608249024
    // 37c: ior
    // 37d: ldc_w -1318839835
    // 380: iand
    // 381: istore 6
    // 383: goto 030
    // 386: return
    // 387: pop2
    // 388: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "縉\ude06帅縉㸉Ḇ븆\ude07", "ூ쯁\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078127 ]
    // 38d: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_2561; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1965457850, "鸆鸇縉︆\ude06縇\ude04帑︑ḑ븑帑", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅쯁\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃쯂诂쯃䯅", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᙖᏖᑖᗖ", -921078124 ]
    // 392: bipush 0
    // 393: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;Z)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "鸆鸇縉︆\ude06縇\ude04\ude11帑鸑帑", "ூ\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃쯂诂쯃䯅词쯁诊", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᓖፖᑖ", -921078109 ]
    // 398: aload 0
    // 399: invokedynamic JNT ()Lkn; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -984144447, "੫੫ਲ਼", "\ue17f\ue3ff", "}䁽z쁭聲뾁", -1259364896 ]
    // 39e: invokedynamic JNT (Ljava/lang/Object;Lkn;)V bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -492293368, "ঃਫੳ", "\ue07f\uef7f\uecff", "}䁽z쁭聲뾁", -1259364891 ]
    // 3a3: goto 864
    // 3a6: pop2
    // 3a7: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "縉\ude06帅縉㸉Ḇ븆\ude07", "ூ쯁\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078104 ]
    // 3ac: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_2561; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1965457850, "鸆鸇縉︆\ude06縇\ude04帑︑ḑ븑帑", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅쯁\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃쯂诂쯃䯅", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᙖᏖᑖᗖ", -921078105 ]
    // 3b1: bipush 0
    // 3b2: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;Z)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "鸆鸇縉︆\ude06縇\ude04\ude11帑鸑帑", "ூ\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃쯂诂쯃䯅词쯁诊", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᓖፖᑖ", -921078118 ]
    // 3b7: goto 3f2
    // 3ba: ldc_w -2135388186
    // 3bd: ldc_w 1836258447
    // 3c0: imul
    // 3c1: ldc_w 1942672504
    // 3c4: ixor
    // 3c5: istore 6
    // 3c7: goto 030
    // 3ca: ldc_w -229797432
    // 3cd: ldc_w 577090289
    // 3d0: imul
    // 3d1: ldc_w -2128271051
    // 3d4: ior
    // 3d5: ldc_w -348275913
    // 3d8: iand
    // 3d9: istore 6
    // 3db: goto 4bb
    // 3de: ldc_w 1837379699
    // 3e1: ldc_w 1587587496
    // 3e4: iadd
    // 3e5: ldc_w 88473668
    // 3e8: ior
    // 3e9: ldc_w 1971280373
    // 3ec: iand
    // 3ed: istore 6
    // 3ef: goto 408
    // 3f2: ldc_w 715343716
    // 3f5: dup
    // 3f6: iadd
    // 3f7: ldc_w -634910812
    // 3fa: ixor
    // 3fb: istore 6
    // 3fd: goto 0b0
    // 400: ldc_w -970447726
    // 403: istore 6
    // 405: goto 13c
    // 408: iload 6
    // 40a: ldc_w 1753098657
    // 40d: ixor
    // 40e: ldc_w 1150356306
    // 411: ixor
    // 412: ldc_w 1539023129
    // 415: isub
    // 416: ldc_w 1931181081
    // 419: ixor
    // 41a: ldc_w 751677350
    // 41d: isub
    // 41e: ldc_w 1192111306
    // 421: isub
    // 422: lookupswitch -926 4 -2050602978 -662 184207652 -289 1376484618 -926 1433462518 794
    // 44c: swap
    // 44d: ldc_w -319538951
    // 450: ldc_w -1297752228
    // 453: ishl
    // 454: bipush 44
    // 456: ior
    // 457: ldc_w 1239559998
    // 45a: iand
    // 45b: dup2
    // 45c: if_icmpge 4f8
    // 45f: pop
    // 460: dup2
    // 461: invokedynamic JNT (Ljava/lang/Object;I)C bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帇︆ḇ㸉ḃ縉", "ூ쯉쯁䯇", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078119 ]
    // 466: dup
    // 467: ldc 49152
    // 469: iand
    // 46a: bipush 14
    // 46c: ishr
    // 46d: swap
    // 46e: bipush 2
    // 46f: ishl
    // 470: ior
    // 471: bipush 22
    // 473: iadd
    // 474: dup
    // 475: ldc_w 63488
    // 478: iand
    // 479: bipush 11
    // 47b: ishr
    // 47c: swap
    // 47d: bipush 5
    // 47e: ishl
    // 47f: ior
    // 480: dup
    // 481: ldc 49152
    // 483: iand
    // 484: bipush 14
    // 486: ishr
    // 487: swap
    // 488: bipush 2
    // 489: ishl
    // 48a: ior
    // 48b: bipush 87
    // 48d: iadd
    // 48e: i2c
    // 48f: dup
    // 490: dup2_x2
    // 491: pop2
    // 492: dup2_x2
    // 493: dup2_x1
    // 494: pop2
    // 495: invokedynamic JNT (Ljava/lang/Object;IC)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帉鸇縉布︆ḇ㸉ḃ縉", "ூ쯉䯇쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078116 ]
    // 49a: pop
    // 49b: ldc_w -1800320696
    // 49e: ldc_w 1441978896
    // 4a1: ishl
    // 4a2: ldc_w 1229455361
    // 4a5: ixor
    // 4a6: iadd
    // 4a7: swap
    // 4a8: goto 44c
    // 4ab: ldc_w 253024769
    // 4ae: ldc_w 289326238
    // 4b1: iadd
    // 4b2: ldc_w 504068624
    // 4b5: ixor
    // 4b6: istore 6
    // 4b8: goto 408
    // 4bb: iload 6
    // 4bd: ldc_w 420220069
    // 4c0: ixor
    // 4c1: ldc_w 590920372
    // 4c4: isub
    // 4c5: ldc_w 1186744542
    // 4c8: isub
    // 4c9: ldc_w 1576778664
    // 4cc: ixor
    // 4cd: ldc_w 173018734
    // 4d0: iadd
    // 4d1: ldc_w 1736423963
    // 4d4: ixor
    // 4d5: lookupswitch -787 3 -965007007 277 -413658401 -787 1875014180 96
    // 4f8: pop2
    // 4f9: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "縉\ude06帅縉㸉Ḇ븆\ude07", "ூ쯁\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078549 ]
    // 4fe: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_2561; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1965457850, "鸆鸇縉︆\ude06縇\ude04帑︑ḑ븑帑", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅쯁\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃쯂诂쯃䯅", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᙖᏖᑖᗖ", -921078546 ]
    // 503: bipush 0
    // 504: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;Z)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "鸆鸇縉︆\ude06縇\ude04\ude11帑鸑帑", "ூ\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃쯂诂쯃䯅词쯁诊", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᓖፖᑖ", -921078547 ]
    // 509: aload 0
    // 50a: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঃ\u0a63", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾃㾃ﾃ뾁", -1259364870 ]
    // 50f: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_746; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࡓࠃ࡛ࠫ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쵿쉿싿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾀ﾀ羀뾁", -1259364873 ]
    // 514: invokedynamic JNT (Ljava/lang/Object;)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "鸆鸇縉︆\ude06縇\ude04\ude11帑縑븑", "ூ쯁诊", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᓖፖᑖ", -921078110 ]
    // 519: aload 0
    // 51a: ldc_w -717076653
    // 51d: ldc_w 799833442
    // 520: dup_x1
    // 521: imul
    // 522: iushr
    // 523: ldc_w 12497397
    // 526: ixor
    // 527: ldc_w "弲\udf39\udf38\udf27［鼹弼㼻Ἲ뼻Ｇ뼻弻缼Ἲ\udf39缼ἹＡἦ\udf39ＺἺ\udf3b缼Ａ㼺Ἴ缻缻Ａ缺Ἴ뼻鼺㼻强ＡἺἻἺ뼻强Ἲ㼻\udf39鼼鼡"
    // 52a: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1856205066, "縐Ḇ븆Ḇ縉븐", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078111 ]
    // 52f: checkcast java/lang/StringBuilder
    // 532: goto 307
    // 535: swap
    // 536: ldc_w 943516915
    // 539: ldc_w 1559956353
    // 53c: ixor
    // 53d: ldc_w 1690822490
    // 540: ixor
    // 541: dup2
    // 542: if_icmpge 2a1
    // 545: pop
    // 546: dup2
    // 547: invokedynamic JNT (Ljava/lang/Object;I)C bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帇︆ḇ㸉ḃ縉", "ூ쯉쯁䯇", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078108 ]
    // 54c: sipush 155
    // 54f: iadd
    // 550: sipush 254
    // 553: ixor
    // 554: sipush 215
    // 557: iadd
    // 558: bipush 68
    // 55a: iadd
    // 55b: dup
    // 55c: ldc_w 65534
    // 55f: iand
    // 560: bipush 1
    // 561: ishr
    // 562: swap
    // 563: bipush 15
    // 565: ishl
    // 566: ior
    // 567: i2c
    // 568: dup
    // 569: dup2_x2
    // 56a: pop2
    // 56b: dup2_x2
    // 56c: dup2_x1
    // 56d: pop2
    // 56e: invokedynamic JNT (Ljava/lang/Object;IC)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帉鸇縉布︆ḇ㸉ḃ縉", "ூ쯉䯇쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078541 ]
    // 573: pop
    // 574: ldc_w 808886197
    // 577: ldc_w 1533776244
    // 57a: ishr
    // 57b: sipush 770
    // 57e: ixor
    // 57f: iadd
    // 580: swap
    // 581: goto 010
    // 584: swap
    // 585: ldc_w -655498367
    // 588: dup
    // 589: iadd
    // 58a: ldc_w -1310996681
    // 58d: ixor
    // 58e: dup2
    // 58f: if_icmpge 003
    // 592: pop
    // 593: dup2
    // 594: invokedynamic JNT (Ljava/lang/Object;I)C bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帇︆ḇ㸉ḃ縉", "ூ쯉쯁䯇", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078538 ]
    // 599: dup
    // 59a: ldc_w 63488
    // 59d: iand
    // 59e: bipush 11
    // 5a0: ishr
    // 5a1: swap
    // 5a2: bipush 5
    // 5a3: ishl
    // 5a4: ior
    // 5a5: sipush 141
    // 5a8: iadd
    // 5a9: dup
    // 5aa: ldc 61440
    // 5ac: iand
    // 5ad: bipush 12
    // 5af: ishr
    // 5b0: swap
    // 5b1: bipush 4
    // 5b2: ishl
    // 5b3: ior
    // 5b4: dup
    // 5b5: ldc_w 63488
    // 5b8: iand
    // 5b9: bipush 11
    // 5bb: ishr
    // 5bc: swap
    // 5bd: bipush 5
    // 5be: ishl
    // 5bf: ior
    // 5c0: dup
    // 5c1: ldc 65504
    // 5c3: iand
    // 5c4: bipush 5
    // 5c5: ishr
    // 5c6: swap
    // 5c7: bipush 11
    // 5c9: ishl
    // 5ca: ior
    // 5cb: i2c
    // 5cc: dup
    // 5cd: dup2_x2
    // 5ce: pop2
    // 5cf: dup2_x2
    // 5d0: dup2_x1
    // 5d1: pop2
    // 5d2: invokedynamic JNT (Ljava/lang/Object;IC)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帉鸇縉布︆ḇ㸉ḃ縉", "ூ쯉䯇쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078539 ]
    // 5d7: pop
    // 5d8: ldc_w 647345661
    // 5db: ldc_w 1467177945
    // 5de: ishr
    // 5df: bipush 1
    // 5e0: ior
    // 5e1: ldc_w -1319053727
    // 5e4: iand
    // 5e5: iadd
    // 5e6: swap
    // 5e7: goto 584
    // 5ea: swap
    // 5eb: ldc_w -1725730463
    // 5ee: ldc_w 1982844802
    // 5f1: imul
    // 5f2: ldc_w -209976705
    // 5f5: ixor
    // 5f6: dup2
    // 5f7: if_icmpge 3ba
    // 5fa: pop
    // 5fb: dup2
    // 5fc: invokedynamic JNT (Ljava/lang/Object;I)C bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帇︆ḇ㸉ḃ縉", "ூ쯉쯁䯇", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078536 ]
    // 601: dup
    // 602: ldc_w 65534
    // 605: iand
    // 606: bipush 1
    // 607: ishr
    // 608: swap
    // 609: bipush 15
    // 60b: ishl
    // 60c: ior
    // 60d: bipush 36
    // 60f: iadd
    // 610: sipush 226
    // 613: iadd
    // 614: dup
    // 615: ldc 64512
    // 617: iand
    // 618: bipush 10
    // 61a: ishr
    // 61b: swap
    // 61c: bipush 6
    // 61e: ishl
    // 61f: ior
    // 620: bipush 105
    // 622: iadd
    // 623: i2c
    // 624: dup
    // 625: dup2_x2
    // 626: pop2
    // 627: dup2_x2
    // 628: dup2_x1
    // 629: pop2
    // 62a: invokedynamic JNT (Ljava/lang/Object;IC)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帉鸇縉布︆ḇ㸉ḃ縉", "ூ쯉䯇쯁诊", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078537 ]
    // 62f: pop
    // 630: ldc_w -1456243635
    // 633: ldc_w -1171905521
    // 636: ishl
    // 637: bipush 1
    // 638: ior
    // 639: ldc_w 17398671
    // 63c: iand
    // 63d: iadd
    // 63e: swap
    // 63f: goto 360
    // 642: aload 0
    // 643: invokedynamic JNT (Ljava/lang/Object;)Z bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ਫਜ਼ঃ", "\ue07f\uef7f\uecff", "}䁽聹", -1259364868 ]
    // 648: ifne 728
    // 64b: aload 0
    // 64c: invokedynamic JNT (Ljava/lang/Object;)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帉\ude06븉", "ூ쯁诊", "㟖㓖㍖", -921078551 ]
    // 651: aload 0
    // 652: bipush 1
    // 653: invokedynamic JNT (Ljava/lang/Object;Z)V bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -492293368, "ਫਜ਼ঃ", "\ue07f\uef7f\uecff", "}䁽聹", -1259364866 ]
    // 658: goto 728
    // 65b: aload 0
    // 65c: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঃ\u0a63", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾃㾃ﾃ뾁", -1259364869 ]
    // 661: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_746; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࡓࠃ࡛ࠫ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쵿쉿싿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾀ﾀ羀뾁", -1259364872 ]
    // 666: aload 0
    // 667: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_2338; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ਓ\u0a3b\u0a0bঃ", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮羃뾃뾃ﾁ뾁", -1259364867 ]
    // 66c: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_243; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "鸆鸇縉︆\ude06縇\ude04縑븑鸑鸑︐", "ூ쯁\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃\u0bc3䯃䯅", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᙖᛖᛖᅖ", -921078080 ]
    // 671: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Lyr; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1965457850, "︉︉", "ூ\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌쯃诃쯅䯂䯅\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃\u0bc3䯃䯅쯁\u0bc9쯕诓䯅", "㕖㛖", -921078081 ]
    // 676: astore 1
    // 677: aload 0
    // 678: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঃ\u0a63", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾃㾃ﾃ뾁", -1259363836 ]
    // 67d: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_746; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࡓࠃ࡛ࠫ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쵿쉿싿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾀ﾀ羀뾁", -1259363815 ]
    // 682: aload 1
    // 683: invokedynamic JNT (Ljava/lang/Object;)D bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "鸉帆帆", "ூ쯁ே", "㇖㙖", -921078092 ]
    // 688: d2f
    // 689: invokedynamic JNT (Ljava/lang/Object;F)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "鸆鸇縉︆\ude06縇\ude04帑븑縑鸑븑", "ூ识쯁诊", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᓖፖᑖ", -921078077 ]
    // 68e: aload 0
    // 68f: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঃ\u0a63", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾃㾃ﾃ뾁", -1259363840 ]
    // 694: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_746; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࡓࠃ࡛ࠫ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쵿쉿싿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾀ﾀ羀뾁", -1259363835 ]
    // 699: aload 1
    // 69a: invokedynamic JNT (Ljava/lang/Object;)D bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "帉ḉ鸆", "ூ쯁ே", "㇖㙖", -921078072 ]
    // 69f: d2f
    // 6a0: invokedynamic JNT (Ljava/lang/Object;F)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "鸆鸇縉︆\ude06縇\ude04帑븑縑鸑\ude11", "ூ识쯁诊", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᓖፖᑖ", -921078073 ]
    // 6a5: aload 0
    // 6a6: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঃ\u0a63", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾃㾃ﾃ뾁", -1259372148 ]
    // 6ab: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_239; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࡓࠃ࠻࠳", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쵿쉿싿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮羃뾃㾁뾁", -1259363839 ]
    // 6b0: astore 3
    // 6b1: aload 3
    // 6b2: instanceof net/minecraft/class_3965
    // 6b5: ifeq 386
    // 6b8: aload 3
    // 6b9: checkcast net/minecraft/class_3965
    // 6bc: astore 2
    // 6bd: aload 0
    // 6be: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঃ\u0a63", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾃㾃ﾃ뾁", -1259372146 ]
    // 6c3: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_638; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࡓ࠻ࠋࠃ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쵿쉿싿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮羀뾃ﾁ뾁", -1259372149 ]
    // 6c8: aload 2
    // 6c9: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_2338; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "鸆鸇縉︆\ude06縇\ude04ḑ\ude11\ude11\ude11\ude11", "ூ쯁\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃䯃䯃ெ䯅", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᛖᇖᑖᏖ", -921078130 ]
    // 6ce: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Lnet/minecraft/class_2680; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "鸆鸇縉︆\ude06縇\ude04︐帑㸑︑", "ூ\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃䯃䯃ெ䯅쯁\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃诂ெ\u0bc4䯅", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᑖᛖᅖ", -921078131 ]
    // 6d3: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_2248; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "鸆鸇縉︆\ude06縇\ude04㸑븑㸑︑縑", "ூ쯁\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃诃\u0bc3ெ䯅", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᙖᑖᅖᕖ", -921078128 ]
    // 6d8: invokedynamic JNT ()Lnet/minecraft/class_2248; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -984144447, "\u09bbও\u09b3੫ফৃࡓࡋࠫࠫࠣ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ췿췿쳿쿿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮羃羃ﾀﾁ뾁", -1259363817 ]
    // 6dd: if_acmpne 386
    // 6e0: aload 2
    // 6e1: bipush 1
    // 6e2: invokedynamic JNT (Ljava/lang/Object;Z)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1965457850, "\ude06\ude07", "ூ\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌䯃쯅诂쯂䯅词쯁诊", "㕖㛖", -921078078 ]
    // 6e7: aload 0
    // 6e8: bipush 10
    // 6ea: invokedynamic JNT (Ljava/lang/Object;I)V bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -492293368, "\u09bbਓ", "\ue07f\uef7f\uecff", "}䁽䁵", -1259364887 ]
    // 6ef: goto 386
    // 6f2: iload 6
    // 6f4: ldc_w 2123933788
    // 6f7: isub
    // 6f8: ldc_w 207636054
    // 6fb: ixor
    // 6fc: ldc_w 1097146599
    // 6ff: iadd
    // 700: ldc_w 1584760903
    // 703: ixor
    // 704: ldc_w 1412950111
    // 707: isub
    // 708: ldc_w 1984566883
    // 70b: iadd
    // 70c: lookupswitch 209 2 -1951331858 -1258 -113274091 209
    // 728: ldc_w 1979166816
    // 72b: ldc_w -869135663
    // 72e: ishr
    // 72f: ldc_w -292122352
    // 732: ior
    // 733: ldc_w -289948783
    // 736: iand
    // 737: istore 6
    // 739: goto 0b0
    // 73c: iload 3
    // 73d: bipush 54
    // 73f: if_icmpge 4ab
    // 742: aload 0
    // 743: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঃ\u0a63", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾃㾃ﾃ뾁", -1259363818 ]
    // 748: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_746; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࡓࠃ࡛ࠫ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쵿쉿싿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾀ﾀ羀뾁", -1259363821 ]
    // 74d: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_1703; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࠃ࠳ࡓ࡛", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ콿쳿쿿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮㾃뾀ﾃ뾃뾁", -1259363824 ]
    // 752: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_2371; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "鸆鸇縉︆\ude06縇\ude04\ude11븑︑㸑", "ூ쯁\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃䯃䯂쯃䯅", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᗖᓖᕖᛖ", -921078123 ]
    // 757: iload 3
    // 758: invokedynamic JNT (Ljava/lang/Object;I)Ljava/lang/Object; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "\ude07鸇縉", "ூ쯉쯁\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯈诏译쯎䯏\u0bd3䯅", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᙖᛖᓖᗖ", -921078120 ]
    // 75d: checkcast net/minecraft/class_1799
    // 760: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_1792; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "鸆鸇縉︆\ude06縇\ude04\ude11Ḑ︑Ḑ", "ூ쯁\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌쯃䯂쯅诃䯅", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᗖᓖᇖᇖ", -921078121 ]
    // 765: invokedynamic JNT ()Lnet/minecraft/class_1792; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -984144447, "\u09bbও\u09b3੫ফৃࠋࡓ࠻࡛", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쉿컿싿췿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮㾃뾀㾁羃뾁", -1259363812 ]
    // 76a: if_acmpne 3de
    // 76d: iinc 2 1
    // 770: goto 3de
    // 773: ldc_w -1959589556
    // 776: ldc_w 2125175825
    // 779: dup
    // 77a: isub
    // 77b: iand
    // 77c: ldc_w 207810474
    // 77f: ior
    // 780: ldc_w -570490961
    // 783: iand
    // 784: istore 6
    // 786: goto 789
    // 789: iload 6
    // 78b: ldc_w 600169203
    // 78e: ixor
    // 78f: ldc_w 407164676
    // 792: ixor
    // 793: ldc_w 647562536
    // 796: isub
    // 797: ldc_w 1631610734
    // 79a: ixor
    // 79b: ldc_w 17884441
    // 79e: isub
    // 79f: ldc_w 1696852077
    // 7a2: ixor
    // 7a3: lookupswitch -1251 2 -405519491 -328 198851887 -1251
    // 7bc: pop2
    // 7bd: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "縉\ude06帅縉㸉Ḇ븆\ude07", "ூ쯁\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅", "㩖㷖㑖㷖ᡖ㝖㷖㡖㳖ᡖ⛖㍖㙖㧖㡖㳖⹖㏖㧖㝖㭖㯖㙖", -921078135 ]
    // 7c2: bipush 1
    // 7c3: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;Z)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "븇Ḇ\ude07", "ூ\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯋\u0bd3诓쯑诐䯎䯅词쯁诊", "㟖㓖㍖", -921078132 ]
    // 7c8: return
    // 7c9: ldc_w -653998629
    // 7cc: dup
    // 7cd: dup
    // 7ce: ishl
    // 7cf: ishr
    // 7d0: ldc_w 177986369
    // 7d3: ior
    // 7d4: ldc_w -291767485
    // 7d7: iand
    // 7d8: istore 6
    // 7da: goto 408
    // 7dd: iload 4
    // 7df: bipush 90
    // 7e1: if_icmpge 0f4
    // 7e4: aload 0
    // 7e5: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঃ\u0a63", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾃㾃ﾃ뾁", -1259363813 ]
    // 7ea: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_746; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࡓࠃ࡛ࠫ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쵿쉿싿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾀ﾀ羀뾁", -1259363816 ]
    // 7ef: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_1703; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࠃ࠳ࡓ࡛", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ콿쳿쿿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮㾃뾀ﾃ뾃뾁", -1259363811 ]
    // 7f4: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_2371; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "鸆鸇縉︆\ude06縇\ude04\ude11븑︑㸑", "ூ쯁\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌诃䯃䯂쯃䯅", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᗖᓖᕖᛖ", -921078560 ]
    // 7f9: iload 4
    // 7fb: invokedynamic JNT (Ljava/lang/Object;I)Ljava/lang/Object; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "\ude07鸇縉", "ூ쯉쯁\u0bc9译쯏诒쯏䯀\u0bd1쯏诐䯎䯀䯈诏译쯎䯏\u0bd3䯅", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᙖᛖᓖᗖ", -921078561 ]
    // 800: checkcast net/minecraft/class_1799
    // 803: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_1792; bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "鸆鸇縉︆\ude06縇\ude04\ude11Ḑ︑Ḑ", "ூ쯁\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌쯃䯂쯅诃䯅", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᗖᓖᇖᇖ", -921078574 ]
    // 808: astore 5
    // 80a: aload 5
    // 80c: invokedynamic JNT ()Lnet/minecraft/class_1792; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -984144447, "\u09bbও\u09b3੫ফৃࠋࠋࠫࠓ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쉿컿싿췿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮㾃뾀㾁羃뾁", -1259372103 ]
    // 811: if_acmpne 0aa
    // 814: aload 0
    // 815: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঃ\u0a63", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾃㾃ﾃ뾁", -1259372122 ]
    // 81a: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_636; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࡓࠃ࠻ࡓ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쵿쉿싿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮羀뾃羀뾁", -1259372125 ]
    // 81f: aload 0
    // 820: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঃ\u0a63", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾃㾃ﾃ뾁", -1259372128 ]
    // 825: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_746; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࡓࠃ࡛ࠫ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쵿쉿싿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾀ﾀ羀뾁", -1259372123 ]
    // 82a: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_1703; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࠃ࠳ࡓ࡛", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ콿쳿쿿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮㾃뾀ﾃ뾃뾁", -1259372078 ]
    // 82f: invokedynamic JNT (Ljava/lang/Object;)I bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࠃࠃ࠻ࠣ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쉿콿싿쵿", "}䁽䁵", -1259372113 ]
    // 834: iload 4
    // 836: bipush 0
    // 837: invokedynamic JNT ()Lnet/minecraft/class_1713; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -984144447, "\u09bbও\u09b3੫ফৃࠃࠃࠓࠫ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쉿콿쉿쵿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮㾃뾀㾃뾃뾁", -1259372116 ]
    // 83c: aload 0
    // 83d: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_310; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "ঃ\u0a63", "\ue07f\uef7f\uecff", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾃㾃ﾃ뾁", -1259372127 ]
    // 842: invokedynamic JNT (Ljava/lang/Object;)Lnet/minecraft/class_746; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -602009863, "\u09bbও\u09b3੫ফৃࡓࠃ࡛ࠫ", "\ue3ff\ue47f\uecff쏿\ue07f\ue67f\ue3ff\ue47f\ue57f\uedff奔\ue7ff\uecff쏿\ue57f\ue0ff奔\ued7f\ued7fﭿ쵿쉿싿", "}䁽z聲䁬p뾂䁲䁭聲䁬쁯聳䁯聬p뾂쁯r䁯쁳쁳쁮뾀ﾀ羀뾁", -1259372114 ]
    // 847: invokedynamic JNT (Ljava/lang/Object;IIILjava/lang/Object;Ljava/lang/Object;)V bsm=mwt.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -475543968, "鸆鸇縉︆\ude06縇\ude04㸑Ḑ︑븑", "ூ쯉쯉쯉\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌쯃䯂쯃䯃䯅\u0bc9诐쯎\u0bd3䯀쯐쯑诐쯎䯏诓쯏诎\u0bd3䯀䯏\u0bd1쯏䯓䯓䯌쯃诂쯂䯂䯅쯁诊", "㡖㯖㍖ᡖ㟖㧖㡖㯖㻖㙖㷖㱖㍖ᡖ㻖㝖㷖㛖㛖⃖ᑖᛖᑖ", -921078485 ]
    // 84c: bipush 1
    // 84d: istore 3
    // 84e: aload 0
    // 84f: bipush 1
    // 850: invokedynamic JNT (Ljava/lang/Object;I)V bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -492293368, "\u09bbਓ", "\ue07f\uef7f\uecff", "}䁽䁵", -1259372120 ]
    // 855: return
    // 856: aload 0
    // 857: invokedynamic JNT ()Lkn; bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -984144447, "\u0a43\u0a43੫", "\ue17f\ue3ff", "}䁽z쁭聲뾁", -1259372115 ]
    // 85c: invokedynamic JNT (Ljava/lang/Object;Lkn;)V bsm=mwt.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -492293368, "ঃਫੳ", "\ue07f\uef7f\uecff", "}䁽z쁭聲뾁", -1259372102 ]
    // 861: goto 864
    // 864: return
  }

  public void hjp(class_1657 var1) {
    null /* jnt:encrypted */;
    null /* jnt:encrypted */
    );
    null /* jnt:encrypted */);
    class_746 var10000 = null /* jnt:encrypted */
    );
    String var2 = null /* jnt:encrypted */;
    StringBuilder var10001 = (StringBuilder)/* jnt */;
    int var10002 = (-509791013 << -1573004821 | 0) & 335610459;

    StringBuilder var10003;
    for (var10003 = (StringBuilder)/* jnt */;
      var10002 < ((2107232708 | -1466326486 | 4) & 37881892);
      var10002 += (-128712784 | -264517768) ^ -126091271
    ) {
      int var5 = /* jnt */ - 23;
      char var8 = (char)(
        (((((var5 & 0) >> 16 | var5 << 0) - 182 & 64512) >> 10 | ((var5 & 0) >> 16 | var5 << 0) - 182 << 6) & 0) >> 16
          | ((((var5 & 0) >> 16 | var5 << 0) - 182 & 64512) >> 10 | ((var5 & 0) >> 16 | var5 << 0) - 182 << 6) << 0
      );
      /* jnt */(
          (((((var5 & 0) >> 16 | var5 << 0) - 182 & 64512) >> 10 | ((var5 & 0) >> 16 | var5 << 0) - 182 << 6) & 0) >> 16
            | ((((var5 & 0) >> 16 | var5 << 0) - 182 & 64512) >> 10 | ((var5 & 0) >> 16 | var5 << 0) - 182 << 6) << 0
        )
      );
    }

    /* jnt */
            ),
            var2
          )
        )
      ),
      false
    );
    /* jnt */;
  }

  public class_1657 rdo() {
    int var4 = -124302882;
    Iterator var1 = /* jnt */
        )
      )
    );

    label48:
    while (true) {
      var4 = (-440066418 * 66492257 | -1922957232) & -1385955629;

      while (true) {
        switch (((var4 ^ 1322053500 ^ 1478652757) + 1856712618 ^ 490072789) + 1970473363 ^ 632788730) {
          case -1609166447:
            return null;
          case -1446868231:
        }

        if (/* jnt */) {
          class_1297 var2 = (Entity)/* jnt */;
          if (var2 instanceof class_1657 var3
            && var2
              != null /* jnt:encrypted */
              )) {
            var4 = (-937281240 >>> 1807792672 | 643588610) & 1727885179;

            while (true) {
              switch (var4 - 482827389 + 655055786 - 1068766228 - 320551146 - 273802690 - 2121968957) {
                case -1893430694:
                  if (/* jnt */)
                    && /* jnt *//* jnt */null /* jnt:encrypted */null /* jnt:encrypted */
                        ),
                        cd.class
                      ),
                      var3
                    )) {
                    continue label48;
                  }

                  var4 = (877032778 << -199319852 | -1999351438) & -1929619597;
                  break;
                case -1248038750:
                default:
                  return var3;
              }
            }
          }
          break;
        }

        var4 = (-744523371 >> -2103363167 | -2145457406) & -1700856965;
      }
    }
  }

  public double zjt() {
    int var4 = 1197957095;
    Iterator var1 = /* jnt */
        )
      )
    );

    label48:
    while (true) {
      var4 = (1555786336 - 1555786336 | 2136125443) & 2147465707;

      while (true) {
        switch ((var4 + 1013779236 - 167632358 ^ 1329487902) - 1468273955 ^ 828572590 ^ 1137144442) {
          case -1995958246:
          default:
            return Double.MAX_VALUE;
          case -706749976:
        }

        if (/* jnt */) {
          class_1297 var2 = (Entity)/* jnt */;
          if (var2 instanceof class_1657 var3
            && var2
              != null /* jnt:encrypted */
              )) {
            var4 = (-1696736616 - 1664258214 | -829901791) & -553863647;

            while (true) {
              switch ((var4 + 1957637464 + 1394480278 ^ 1196555969 ^ 1745694032) + 1018173024 - 7638731) {
                case -983257805:
                default:
                  if (/* jnt */)
                    && /* jnt *//* jnt */null /* jnt:encrypted */null /* jnt:encrypted */
                        ),
                        cd.class
                      ),
                      var3
                    )) {
                    continue label48;
                  }

                  var4 = (1596402458 | 1558688831) ^ -1869237069;
                  break;
                case -190896512:
                  return /* jnt */
                      )
                    ),
                    /* jnt */
                  );
              }
            }
          }
          break;
        }

        var4 = -970105001 & 610746936 ^ -306465887;
      }
    }
  }

  public boolean mqn() {
    double var1 = /* jnt */
      )
    );
    double var3 = /* jnt */
      )
    );
    return var1 < 2.0 && var1 > -2.0 && var3 < 2.0 && var3 > -2.0;
  }

  public boolean gl() {
    int var4 = -68186645;
    class_1661 var1 = /* jnt */
      )
    );
    int var2 = 0;

    label28:
    while (true) {
      var4 = (1070798146 << 741113701 | 554177959) & 596383727;

      while (true) {
        switch ((((var4 ^ 48360796) + 218154066 ^ 944418574) + 457070696 ^ 641139425) + 1941947004) {
          case -1951847674:
          default:
            if (var2 < 9) {
              class_1799 var3 = /* jnt */;
              if (/* jnt */
                )
                && /* jnt */
                )) {
                return true;
              }

              var2++;
              continue label28;
            }

            var4 = (-542320885 & -403967328 | -1808306378) & -1254625353;
            break;
          case 95257463:
            return false;
        }
      }
    }
  }

  public boolean yjy() {
    class_1799 var1 = /* jnt */
        )
      )
    );
    return /* jnt */
      )
      && /* jnt */
      );
  }

  public boolean lsl() {
    int var4 = -1160529325;
    class_1661 var1 = /* jnt */
      )
    );
    int var2 = 0;

    while (true) {
      var4 = (627173820 ^ -983820074 | -716809339) & -682139753;

      while (true) {
        switch ((var4 + 838108264 + 1413520091 ^ 940975317 ^ 2121676481) - 1757582124 + 1867041089) {
          case -502117181:
          default:
            return false;
          case 611491571:
        }

        if (var2 < 9) {
          class_1799 var3 = /* jnt */;
          if (/* jnt */
            )
            && /* jnt */
            )) {
            /* jnt */;
            return true;
          }

          var2++;
          break;
        }

        var4 = -1279038012 ^ -1279038012 ^ 397862263;
      }
    }
  }

  public boolean tkv() {
    int var3 = -573805836;
    class_1661 var1 = /* jnt */
      )
    );
    int var2 = 0;

    label25:
    while (true) {
      var3 = -1599085156 & -1599085156 >> -557854741 ^ 506446103;

      while (true) {
        switch ((var3 - 972229699 ^ 774318484) - 2075326339 - 1098447043 - 1534031960 + 1229534719) {
          case -613589187:
          default:
            if (var2 < /* jnt */) {
              if (/* jnt */
                )
                == null /* jnt:encrypted */
                )
               {
                return true;
              }

              var3 = (-1859652665 >> -892123118 - -892123118 | 681675858) & 1861586006;
            } else {
              var3 = 1502279593 << 1502279593 ^ 287866019;
            }
            break;
          case -247236888:
            var2++;
            continue label25;
          case 362862933:
            return false;
        }
      }
    }
  }

  public class_2338 lpc(int var1, class_2248 var2) {
    int var14 = -1798722097;
    class_638 var3 = null /* jnt:encrypted */
    );
    class_2338 var4 = /* jnt */
      )
    );
    class_2338 var5 = null;
    double var6 = Double.MAX_VALUE;
    int var8 = -var1;

    label68:
    while (true) {
      var14 = (1819129373 - -1049376048 | 356890938) & 1968175419;

      while (true) {
        switch (((var14 ^ 605845392) + 342334581 + 1914159245 ^ 1354853913) + 2039469347 + 1609175560) {
          case -1601475361:
          default:
            if (var8 <= var1) {
              int var9 = -var1;

              label65:
              while (true) {
                var14 = (-1851636995 | -1851636995 | -1910736623) & -1889730661;

                while (true) {
                  switch ((var14 + 312916942 + 824166207 ^ 1492428157 ^ 1773326463) + 1677339590 + 1017352964) {
                    case -2076030354:
                    default:
                      if (var9 <= var1) {
                        int var10 = -var1;

                        label62:
                        while (true) {
                          var14 = -1582323019 >> -1582323019 ^ -90723153;

                          while (true) {
                            switch (((var14 + 1792936088 ^ 1258685378) + 1491291373 ^ 722292639 ^ 1415624463) - 1517572926) {
                              case -1864758473:
                              default:
                                if (var10 <= var1) {
                                  class_2338 var11 = /* jnt */;
                                  if (/* jnt */
                                    )
                                    == var2) {
                                    double var12 = /* jnt */;
                                    if (var12 < var6) {
                                      var6 = var12;
                                      var5 = var11;
                                    }
                                  }

                                  var10++;
                                  continue label62;
                                }

                                var14 = (-2101951328 * 740017458 | -669198169) & -107094281;
                                break;
                              case -1667729924:
                                var9++;
                                continue label65;
                            }
                          }
                        }
                      }

                      var14 = (2126026845 - (2126026845 << 2126026845) | 352747906) & 894412226;
                      break;
                    case 170995863:
                      var8++;
                      continue label68;
                  }
                }
              }
            }

            var14 = (-908205989 | -806845971 | 1225065731) & 2141001575;
            break;
          case 2084276491:
            return var5;
        }
      }
    }
  }

  public void snx(class_1657 var1) {
    int var13 = -556844844;
    String var2 = /* jnt */
    );
    if (!/* jnt */) {
      class_2338 var3 = /* jnt */;
      String var9 = /* jnt */;
      StringBuilder var10000 = (StringBuilder)/* jnt */;
      int var10001 = (864225531 | 864225531) ^ 864225531;
      StringBuilder var10002 = (StringBuilder)/* jnt */;

      label158:
      while (true) {
        var13 = (1774633712 | 2087041473) ^ -1091583598;

        while (true) {
          label153: {
            StringBuilder var21;
            switch ((var13 + 1633246702 + 1022219022 ^ 426805116) - 2028813545 ^ 1711777162 ^ 144117940) {
              case -1849550332:
              default:
                var21 = var10002;
                if (var10001 < ((-1111986201 >>> 833771015 | 33) & 2122320417)) {
                  char var87 = /* jnt */;
                  char var90 = (char)(
                    (((((var87 & 'ﰀ') >> 10 | var87 << 6) & 65472) >> 6 | ((var87 & 'ﰀ') >> 10 | var87 << 6) << 10) - 186 - 29 & 64512) >> 10
                      | ((((var87 & 'ﰀ') >> 10 | var87 << 6) & 65472) >> 6 | ((var87 & 'ﰀ') >> 10 | var87 << 6) << 10) - 186 - 29 << 6
                  );
                  /* jnt */(
                      (((((var87 & 'ﰀ') >> 10 | var87 << 6) & 65472) >> 6 | ((var87 & 'ﰀ') >> 10 | var87 << 6) << 10) - 186 - 29 & 64512) >> 10
                        | ((((var87 & 'ﰀ') >> 10 | var87 << 6) & 65472) >> 6 | ((var87 & 'ﰀ') >> 10 | var87 << 6) << 10) - 186 - 29 << 6
                    )
                  );
                  var10001 += (-605819462 | -605819462) ^ -605819461;
                  continue label158;
                }

                var13 = (634443373 & 929446242 | 1256875029) & -554013001;
                break;
              case -685332127:
                var21 = var10002;
                if (var10001 < (1011783278 ^ -2109348717 ^ -1106545935)) {
                  int var47 = /* jnt */ - 229 ^ 235 ^ 82;
                  char var48 = (char)(((var47 & 65528) >> 3 | var47 << 13) ^ 105);
                  /* jnt */(((var47 & 65528) >> 3 | var47 << 13) ^ 105)
                  );
                  var10001 += 698787333 << (698787333 >>> 234389831) ^ 1784696833;
                  break label153;
                }

                var13 = -1671033252 + -144639710 ^ -1204139858;
            }

            switch (var13 - 1954313290 + 208899469 + 1526050344 - 1201602438 + 443293445 ^ 197181743) {
              case -92801131:
                String var4 = /* jnt */
                  )
                );
                te var5 = (te)/* jnt */;
                var10001 = (880964450 >>> 880964450 | 0) & 537198883;

                for (var10002 = (StringBuilder)/* jnt */\u0010\u001f,ò,\u0011.\u001f\u001d."
                  );
                  var10001 < ((-613780705 - -613780705 | 14) & -1339310193);
                  var10001 += (-579209621 + -579209621 | 1) & 17301505
                ) {
                  /* jnt */((/* jnt */ ^ 'A' ^ 205) + 82 + 117 - 245)
                  );
                }

                /* jnt */
                );
                double var6 = /* jnt */
                    )
                  ),
                  /* jnt */
                );
                hn var8 = (hn)/* jnt */;
                hn var20 = var8;
                var10001 = (-1277576631 + -649330390 | 0) & 1115815940;
                var10002 = (StringBuilder)/* jnt */;

                label136:
                while (true) {
                  var13 = 787830049 & 787830049 >>> 787830049 ^ 502472490;

                  while (true) {
                    label132:
                    while (true) {
                      label130:
                      while (true) {
                        label128: {
                          StringBuilder var25;
                          switch (((var13 ^ 1653410612) - 573512330 + 1316162856 ^ 1505679547) + 152621277 - 1230639319) {
                            case -1129603571:
                              var25 = var10002;
                              if (var10001 < ((605337008 & 605337008 | 15) & -1008664049)) {
                                char var82 = /* jnt */;
                                char var85 = (char)(
                                  (
                                      (((((var82 & '\ufff8') >> 3 | var82 << '\r') & 65528) >> 3 | ((var82 & '\ufff8') >> 3 | var82 << '\r') << 13) & 49152)
                                          >> 14
                                        | ((((var82 & '\ufff8') >> 3 | var82 << '\r') & 65528) >> 3 | ((var82 & '\ufff8') >> 3 | var82 << '\r') << 13) << 2
                                    )
                                    - 206
                                    - 219
                                );
                                /* jnt */(
                                    (
                                        (((((var82 & '\ufff8') >> 3 | var82 << '\r') & 65528) >> 3 | ((var82 & '\ufff8') >> 3 | var82 << '\r') << 13) & 49152)
                                            >> 14
                                          | ((((var82 & '\ufff8') >> 3 | var82 << '\r') & 65528) >> 3 | ((var82 & '\ufff8') >> 3 | var82 << '\r') << 13) << 2
                                      )
                                      - 206
                                      - 219
                                  )
                                );
                                var10001 += (1589021244 * (1516285758 - -763270897) | 1) & 604771385;
                                continue label136;
                              }

                              var13 = (1153264070 | -156966237 | -1996465064) & -849674536;
                              break;
                            case -1046703362:
                              var25 = var10002;
                              if (var10001 < (85979477 >> 2022448109 ^ 10484)) {
                                int var64 = /* jnt */;
                                int var125 = (var64 & 61440) >> 12;
                                int var65 = (var64 & 61440) >> 12 | var64 << 4;
                                int var126 = (((var64 & 61440) >> 12 | var64 << 4) & 49152) >> 14;
                                var64 = ((var125 | var64 << 4) & 49152) >> 14 | ((var64 & 61440) >> 12 | var64 << 4) << 2;
                                var125 = ((var126 | var65 << 2) & 49152) >> 14;
                                int var67 = (((var126 | var65 << 2) & 49152) >> 14 | var64 << 2) ^ 76;
                                int var128 = (((((var126 | var65 << 2) & 49152) >> 14 | var64 << 2) ^ 76) & 65408) >> 7;
                                char var68 = (char)(
                                  (((var125 | var64 << 2) ^ 76) & 65408) >> 7 | ((((var126 | var65 << 2) & 49152) >> 14 | var64 << 2) ^ 76) << 9
                                );
                                /* jnt */(var128 | var67 << 9));
                                var10001 += (-407159648 >> 1672237523 | 1) & 9;
                                break label128;
                              }

                              var13 = (1665295771 | -739949318 | -2004856298) & -1936428522;
                              break;
                            case -509591152:
                            default:
                              var25 = var10002;
                              if (var10001 < ((127878779 | 993825607) ^ 1069537140)) {
                                int var60 = (/* jnt */ ^ 212 ^ 60)
                                  + 122
                                  - 240;
                                char var61 = (char)((var60 & 65535) >> 0 | var60 << 16);
                                /* jnt */((var60 & 65535) >> 0 | var60 << 16)
                                );
                                var10001 += (1861580580 >> 890521828 | 1) & 536905865;
                                break label132;
                              }

                              var13 = 707802912 & 800144966 >> (707802912 >> 800144966) ^ 817918670;
                              break;
                            case -352328608:
                              var25 = var10002;
                              if (var10001 < ((-1253035480 << 113728282 | 8) & 532621709)) {
                                char var54 = /* jnt */;
                                char var57 = (char)(
                                  (
                                      (((((var54 & '\uffc0') >> 6 | var54 << '\n') & 65532) >> 2 | ((var54 & '\uffc0') >> 6 | var54 << '\n') << 14) & 65535)
                                          >> 0
                                        | ((((var54 & '\uffc0') >> 6 | var54 << '\n') & 65532) >> 2 | ((var54 & '\uffc0') >> 6 | var54 << '\n') << 14) << 16
                                    )
                                    + 155
                                    - 104
                                );
                                /* jnt */(
                                    (
                                        (((((var54 & '\uffc0') >> 6 | var54 << '\n') & 65532) >> 2 | ((var54 & '\uffc0') >> 6 | var54 << '\n') << 14) & 65535)
                                            >> 0
                                          | ((((var54 & '\uffc0') >> 6 | var54 << '\n') & 65532) >> 2 | ((var54 & '\uffc0') >> 6 | var54 << '\n') << 14) << 16
                                      )
                                      + 155
                                      - 104
                                  )
                                );
                                var10001 += 1145386868 - 1893728960 ^ -748342091;
                                break label130;
                              }

                              var13 = (48724402 << 48724402 | 856110590) & 2071934975;
                          }

                          switch ((var13 ^ 349367327) - 1580201863 + 1008906706 + 800434069 - 1402962120 + 1295370115) {
                            case -1550498140:
                            default:
                              /* jnt */,
                                /* jnt */
                                ),
                                true
                              );
                              var20 = var8;
                              var10001 = -26486867 >>> -214027534 ^ 16282;
                              var10002 = (StringBuilder)/* jnt */;
                              break label130;
                            case -519521438:
                              /* jnt */
                              );
                              /* jnt */
                              );
                              /* jnt */;
                              var20 = var8;
                              var10001 = 911988893 ^ -212155819 ^ -989783352;
                              var10002 = (StringBuilder)/* jnt */;
                              break;
                            case 726746988:
                              String var27 = /* jnt */;
                              int var12;
                              int var11 = var12 = /* jnt */;
                              int var10 = /* jnt */;
                              var10002 = (StringBuilder)/* jnt */;
                              int var73 = (943852343 >> (-847557122 >>> 1460277693) | 0) & -1341852221;
                              StringBuilder var105 = (StringBuilder)/* jnt */;

                              label104:
                              while (true) {
                                var13 = (-976441116 ^ -976441116 | 888022464) & -1258412057;

                                while (true) {
                                  label100:
                                  while (true) {
                                    label98: {
                                      StringBuilder var74;
                                      switch (((var13 + 564577936 - 1230507417 ^ 636225058) + 901678797 ^ 1172173359) - 1952632315) {
                                        case -1494229166:
                                          var74 = var105;
                                          if (var73 < ((-1093431601 | -835428881 | 2) & 8211)) {
                                            int var144 = /* jnt */
                                              ^ 156
                                              ^ 171
                                              ^ 144;
                                            char var145 = (char)(((var144 & 65472) >> 6 | var144 << 10) + 135);
                                            /* jnt */(((var144 & 65472) >> 6 | var144 << 10) + 135)
                                            );
                                            var73 += (1015614842 + (2047927203 | 925816722) | 0) & 1142268417;
                                            continue label104;
                                          }

                                          var13 = -2032757005 >>> -1875101428 ^ -1002597366;
                                          break;
                                        case 525879262:
                                          var74 = var105;
                                          if (var73 < ((-1630368095 >>> -2074530523 | 5) & 1627916679)) {
                                            /* jnt */(
                                                (
                                                    (/* jnt */ ^ 246 ^ 85) - 104
                                                      ^ 184
                                                  )
                                                  - 195
                                              )
                                            );
                                            var73 += 82881132 * 82881132 ^ 1542692241;
                                            break label98;
                                          }

                                          var13 = (-957192906 >> 536787014 | 677984833) & 719928155;
                                          break;
                                        case 1441420724:
                                        default:
                                          var74 = var105;
                                          if (var73 < ((2091994808 | -1890664136 | 5) & 4165)) {
                                            int var132 = /* jnt */ + 227;
                                            int var10007 = (var132 & 63488) >> 11;
                                            int var133 = (var132 & 63488) >> 11 | var132 << 5;
                                            int var160 = (((var132 & 63488) >> 11 | var132 << 5) & 65534) >> 1;
                                            var132 = ((var10007 | var132 << 5) & 65534) >> 1 | ((var132 & 63488) >> 11 | var132 << 5) << 15;
                                            var10007 = ((var160 | var133 << 15) & 65024) >> 9;
                                            int var135 = ((var160 | var133 << 15) & 65024) >> 9 | var132 << 7;
                                            int var162 = ((((var160 | var133 << 15) & 65024) >> 9 | var132 << 7) & 63488) >> 11;
                                            char var136 = (char)(
                                              ((var10007 | var132 << 7) & 63488) >> 11 | (((var160 | var133 << 15) & 65024) >> 9 | var132 << 7) << 5
                                            );
                                            /* jnt */(var162 | var135 << 5)
                                            );
                                            var73 += (-573482355 + -573482355 | 1) & 1074284641;
                                            break label100;
                                          }

                                          var13 = (1864646455 - 1144794438 * (1864646455 >> 1144794438) | 1123885184) & 1191043234;
                                      }

                                      switch (((var13 ^ 1423858287) + 993308610 + 1082917124 - 1162638136 ^ 468911885) - 1009980047) {
                                        case -1602628344:
                                          var10002 = /* jnt */
                                            ),
                                            var10
                                          );
                                          var73 = 33309519 ^ 33309519 ^ 0;
                                          var105 = (StringBuilder)/* jnt */;
                                          break label100;
                                        case 389115111:
                                        default:
                                          var10002 = /* jnt */
                                            ),
                                            var11
                                          );
                                          var73 = 1491358938 >> -1933910846 ^ 372839734;
                                          var105 = (StringBuilder)/* jnt */;
                                          break;
                                        case 1923450674:
                                          /* jnt */
                                                ),
                                                var12
                                              )
                                            ),
                                            false
                                          );
                                          var10001 = (1431778598 - 1431778598 | 0) & 1929447954;

                                          for (var10002 = (StringBuilder)/* jnt */;
                                            var10001 < (-515116760 & -515116760 ^ -515116754);
                                            var10001 += (468967611 * -82397036 | 1) & 2723
                                          ) {
                                            char var76 = /* jnt */;
                                            int var141 = (var76 & '￼') >> 2;
                                            int var77 = (var76 & '￼') >> 2 | var76 << 14;
                                            int var142 = (((var76 & '￼') >> 2 | var76 << 14) & 65472) >> 6;
                                            var76 = (char)(((((var141 | var76 << 14) & 65472) >> 6 | ((var76 & '￼') >> 2 | var76 << 14) << 10) ^ 26) - 180 ^ 42);
                                            /* jnt */(((var142 | var77 << 10) ^ 26) - 180 ^ 42)
                                            );
                                          }

                                          String var30 = /* jnt */;
                                          int var45 = (1725562405 >>> 973415925 | 0) & -2034108344;

                                          for (var80 = (StringBuilder)/* jnt */;
                                            var45 < ((2039329646 + -520734701 | 17) & 18089075);
                                            var45 += (1338908937 << -798653078 + -1575629684 | 1) & -1247530035
                                          ) {
                                            int var112 = (/* jnt */ ^ '5')
                                              + 183
                                              + 21;
                                            char var113 = (char)(((var112 & 65534) >> 1 | var112 << 15) ^ 143);
                                            /* jnt */(((var112 & 65534) >> 1 | var112 << 15) ^ 143)
                                            );
                                          }

                                          /* jnt */,
                                            false
                                          );
                                          /* jnt */;
                                          /* jnt */() -> {
                                              int var2x = 696535353;

                                              try {
                                                var2x = (-860406618 - (-671328072 & -860406618 >>> -671328072) | 420595801) & -1652818977;
                                              } catch (IOException var4x) {
                                                boolean var10001x = false;
                                                return;
                                              }

                                              while (true) {
                                                switch ((var2x + 457556755 - 353812722 ^ 1460783357) + 77323087 + 1066230622 ^ 182605642) {
                                                  case -48369761:
                                                  default:
                                                    return;
                                                  case 847128160:
                                                    try {
                                                      /* jnt */;
                                                    } catch (IOException var3x) {
                                                      boolean var6x = false;
                                                      return;
                                                    }

                                                    var2x = (967591392 + -777390474 | -728199008) & -23530828;
                                                }
                                              }
                                            }
                                          );
                                          return;
                                      }
                                    }

                                    var13 = (1383674595 | 1383674595) ^ -24339209;
                                  }

                                  var13 = -1544734090 ^ 2099073291 >>> -1386801248 ^ 2099247335;
                                }
                              }
                            case 1859945084:
                              String var26 = /* jnt */;
                              int var40 = (-1619148689 >>> -1971347080 | 0) & -1921316832;

                              StringBuilder var71;
                              for (var71 = (StringBuilder)/* jnt */;
                                var40 < ((1205359287 >> -1209081934 | 11) & 1885675531);
                                var40 += (-1071630902 - (1506184828 - (-1071630902 << 1506184828)) | 1) & -2130306895
                              ) {
                                int var101 = (/* jnt */ ^ 204) - 19;
                                int var10006 = (var101 & 49152) >> 14;
                                int var102 = (var101 & 49152) >> 14 | var101 << 2;
                                int var153 = (((var101 & 49152) >> 14 | var101 << 2) & 65532) >> 2;
                                char var103 = (char)((((var10006 | var101 << 2) & 65532) >> 2 | ((var101 & 49152) >> 14 | var101 << 2) << 14) + 183);
                                /* jnt */((var153 | var102 << 14) + 183)
                                );
                              }

                              /* jnt */,
                                  new Object[]{/* jnt */}
                                ),
                                true
                              );
                              var20 = var8;
                              var10001 = (1643399554 >>> -1553061949 | 0) & -1849596787;
                              var10002 = (StringBuilder)/* jnt */;
                              break label132;
                          }
                        }

                        var13 = -1868845481 * -1868845481 ^ 981892352;
                      }

                      var13 = -68734339 >>> -68734339 ^ 607191408;
                    }

                    var13 = -2045377349 & -1629999085 >>> -1629999085 ^ 781610300;
                  }
                }
              case 526682672:
              default:
                var10000 = /* jnt */
                  ),
                  var9
                );
                var10001 = (-133577897 >>> 763447158 | 0) & 1268367390;
                var10002 = (StringBuilder)/* jnt */;
            }
          }

          var13 = (1596144767 | 1596144767) ^ -760245945;
        }
      }
    }
  }
  public void sov() {
    int var4 = -1708677930;
    String var1 = /* jnt */
    );
    if (!/* jnt */) {
      te var2 = (te)/* jnt */;
      int var10001 = (-256143865 + -1209378587 | 0) & 1413486595;

      StringBuilder var10002;
      for (var10002 = (StringBuilder)/* jnt */;
        var10001 < (-556230665 - 1779809587 ^ 1958927050);
        var10001 += (-1292840331 * -1667397371 | 1) & 46678545
      ) {
        char var22 = /* jnt */;
        char var25 = (char)(
          (
              (((((var22 & 'ﾀ') >> 7 | var22 << '\t') & 49152) >> 14 | ((var22 & 'ﾀ') >> 7 | var22 << '\t') << 2) + 81 & 65520) >> 4
                | ((((var22 & 'ﾀ') >> 7 | var22 << '\t') & 49152) >> 14 | ((var22 & 'ﾀ') >> 7 | var22 << '\t') << 2) + 81 << 12
            )
            + 98
        );
        /* jnt */(
            (
                (((((var22 & 'ﾀ') >> 7 | var22 << '\t') & 49152) >> 14 | ((var22 & 'ﾀ') >> 7 | var22 << '\t') << 2) + 81 & 65520) >> 4
                  | ((((var22 & 'ﾀ') >> 7 | var22 << '\t') & 49152) >> 14 | ((var22 & 'ﾀ') >> 7 | var22 << '\t') << 2) + 81 << 12
              )
              + 98
          )
        );
      }

      /* jnt */
      );
      hn var3 = (hn)/* jnt */;
      hn var10000 = var3;
      var10001 = (-2010853395 << -2010853395 | 0) & 537005832;
      var10002 = (StringBuilder)/* jnt */;

      label96:
      while (true) {
        var4 = -1194672174 & 271376781 + 1993741866 ^ 730117353;

        while (true) {
          label92:
          while (true) {
            label90:
            while (true) {
              label88: {
                StringBuilder var11;
                switch (((var4 ^ 919046152 ^ 1679384381) - 1834340411 ^ 1739409036 ^ 951497868) + 1140613408) {
                  case 387274547:
                    var11 = var10002;
                    if (var10001 < ((742584988 ^ -1403217068 | 16) & 780142129)) {
                      char var47 = /* jnt */;
                      int var78 = (var47 & '耀') >> 15;
                      int var48 = ((var47 & '耀') >> 15 | var47 << 1) - 70;
                      int var79 = (((var47 & '耀') >> 15 | var47 << 1) - 70 & 32768) >> 15;
                      var47 = (char)((((var78 | var47 << 1) - 70 & 32768) >> 15 | ((var47 & '耀') >> 15 | var47 << 1) - 70 << 1) - 159 + 5);
                      /* jnt */((var79 | var48 << 1) - 159 + 5));
                      var10001 += -1993041492 & -1993041492 ^ -1993041491;
                      continue label96;
                    }

                    var4 = (439448470 << 439448470 | 1375784163) & 1377623267;
                    break;
                  case 403232367:
                  default:
                    var11 = var10002;
                    if (var10001 < ((1811113002 * 1811113002 | 2) & 18030854)) {
                      char var38 = /* jnt */;
                      char var41 = (char)(
                        ((((((var38 & '\ue000') >> 13 | var38 << 3) & 57344) >> 13 | ((var38 & '\ue000') >> 13 | var38 << 3) << 3) ^ 215 ^ 30) & 64512) >> 10
                          | (((((var38 & '\ue000') >> 13 | var38 << 3) & 57344) >> 13 | ((var38 & '\ue000') >> 13 | var38 << 3) << 3) ^ 215 ^ 30) << 6
                      );
                      /* jnt */(
                          ((((((var38 & '\ue000') >> 13 | var38 << 3) & 57344) >> 13 | ((var38 & '\ue000') >> 13 | var38 << 3) << 3) ^ 215 ^ 30) & 64512) >> 10
                            | (((((var38 & '\ue000') >> 13 | var38 << 3) & 57344) >> 13 | ((var38 & '\ue000') >> 13 | var38 << 3) << 3) ^ 215 ^ 30) << 6
                        )
                      );
                      var10001 += 1726532344 >>> 1675698579 ^ 3292;
                      break label90;
                    }

                    var4 = (1650821102 | 1957734244) ^ 1277032080;
                    break;
                  case 1883649987:
                    var11 = var10002;
                    if (var10001 < (-1920131366 * -2070998291 ^ -1684610087)) {
                      int var34 = (/* jnt */ + '%' + 238 ^ 179) - 143;
                      char var35 = (char)((var34 & 65408) >> 7 | var34 << 9);
                      /* jnt */((var34 & 65408) >> 7 | var34 << 9)
                      );
                      var10001 += (2133962637 & 1478569350 | 1) & 614093369;
                      break label92;
                    }

                    var4 = (841735075 - -1950949445 | 1763031221) & -15221067;
                    break;
                  case 2056397418:
                    var11 = var10002;
                    if (var10001 < ((1447893061 + -236287268 | 15) & -1522511649)) {
                      int var28 = /* jnt */ + 222;
                      char var31 = (char)(
                        ((((((var28 & 65528) >> 3 | var28 << 13) ^ 134) & 65472) >> 6 | (((var28 & 65528) >> 3 | var28 << 13) ^ 134) << 10) & 65504) >> 5
                          | (((((var28 & 65528) >> 3 | var28 << 13) ^ 134) & 65472) >> 6 | (((var28 & 65528) >> 3 | var28 << 13) ^ 134) << 10) << 11
                      );
                      /* jnt */(
                          ((((((var28 & 65528) >> 3 | var28 << 13) ^ 134) & 65472) >> 6 | (((var28 & 65528) >> 3 | var28 << 13) ^ 134) << 10) & 65504) >> 5
                            | (((((var28 & 65528) >> 3 | var28 << 13) ^ 134) & 65472) >> 6 | (((var28 & 65528) >> 3 | var28 << 13) ^ 134) << 10) << 11
                        )
                      );
                      var10001 += (1377003821 << 1916083742 | 1) & 553256299;
                      break label88;
                    }

                    var4 = (1420519030 | -633371669 | -184416381) & -183619649;
                }

                switch (((var4 ^ 1514048131) - 333325518 ^ 231454699 ^ 263634600) + 651628041 ^ 1450645682) {
                  case -1770940540:
                    /* jnt */,
                      /* jnt */
                      ),
                      true
                    );
                    var10000 = var3;
                    var10001 = (-868067986 - 1308263372 | 0) & 28844032;
                    var10002 = (StringBuilder)/* jnt */;
                    break label90;
                  case -1670379386:
                    /* jnt */,
                      null /* jnt:encrypted */,
                      true
                    );
                    var10000 = var3;
                    var10001 = (1868605289 - 522738126 | 0) & -1606016988;
                    var10002 = (StringBuilder)/* jnt */;
                    break;
                  case 590075079:
                  default:
                    String var12 = /* jnt */;
                    int var19;
                    StringBuilder var44;
                    if (/* jnt */
                    )) {
                      var19 = (-1592179174 + (-1592179174 & -860928639) | 0) & 1155085441;
                      var44 = (StringBuilder)/* jnt */;
                      var4 = (1910162585 - -1714004158 | -2003578234) & -1900815626;
                    } else {
                      var19 = 987759052 ^ 987759052 + 987759052 ^ 1327497812;
                      var44 = (StringBuilder)/* jnt */;
                      var4 = -160547484 >> 1763938350 ^ 16154968;
                    }

                    label70:
                    while (true) {
                      switch ((var4 - 1347432284 ^ 192173106) + 1128446807 - 963761750 + 1738328902 ^ 1829487560) {
                        case -911317945:
                        default:
                          var10002 = var44;
                          if (var19 >= (110207696 * -1086087154 * 110207696 ^ -1324958186)) {
                            var4 = 1871685387 * -1178426295 ^ 928592912;
                            break label70;
                          }

                          /* jnt */((/* jnt */ ^ '/') - 101 ^ 219 ^ 228 ^ 226)
                          );
                          var19 += -926706176 - -926706176 ^ 1;
                          var4 = (1910162585 - -1714004158 | -2003578234) & -1900815626;
                          continue;
                        case 2050027061:
                      }

                      var10002 = var44;
                      if (var19 >= ((-1079154742 ^ -2051523522 | 11) & -2071297013)) {
                        var4 = (1863292779 ^ 44476161 | 680330756) & 798836700;
                        break;
                      }

                      int var61 = /* jnt */ ^ 185;
                      char var62 = (char)((((var61 & 32768) >> 15 | var61 << 1) - 195 ^ 167) + 123);
                      /* jnt */((((var61 & 32768) >> 15 | var61 << 1) - 195 ^ 167) + 123)
                      );
                      var19 += -1726919405 & 1430382544 & 1526696866 ^ 268501249;
                      var4 = -160547484 >> 1763938350 ^ 16154968;
                    }
                    /* jnt */ + 976280884) {
                        case 1366733432 -> /* jnt */;
                        default -> /* jnt */;
                      },
                      false
                    );
                    /* jnt */;
                    /* jnt */() -> {
                        int var2x = 696535353;

                        try {
                          var2x = (-860406618 - (-671328072 & -860406618 >>> -671328072) | 420595801) & -1652818977;
                        } catch (IOException var4x) {
                          boolean var10001x = false;
                          return;
                        }

                        while (true) {
                          switch ((var2x + 457556755 - 353812722 ^ 1460783357) + 77323087 + 1066230622 ^ 182605642) {
                            case -48369761:
                            default:
                              return;
                            case 847128160:
                              try {
                                /* jnt */;
                              } catch (IOException var3x) {
                                boolean var6x = false;
                                return;
                              }

                              var2x = (967591392 + -777390474 | -728199008) & -23530828;
                          }
                        }
                      }
                    );
                    return;
                  case 1250111080:
                    /* jnt */
                    );
                    /* jnt */
                    );
                    var10000 = var3;
                    var10001 = -1055942880 + -1767050894 ^ 1471973522;
                    var10002 = (StringBuilder)/* jnt */;
                    break label92;
                }
              }

              var4 = (1201734397 << 1370272238 | -2076519248) & -1925523530;
            }

            var4 = 1456431072 ^ -1578806305 ^ 1570344064;
          }

          var4 = (1561203573 >> -175388986 | -1300692054) & -1158028309;
        }
      }
    }
  }

  public void fig(String var1, boolean var2) {
    int var4 = 498759669;
    /* jnt */;
    /* jnt */;
    jt var3 = (jt)/* jnt */null /* jnt:encrypted */null /* jnt:encrypted */
      ),
      jt.class
    );
    if (var3 != null && /* jnt */) {
      /* jnt */;
    }

    var4 = (778013349 | 1261173152) ^ -1470103340;

    while (true) {
      switch (((var4 ^ 1098522650) + 1888966066 ^ 677389641) + 1075329430 ^ 1240362118 ^ 845713981) {
        case -52080196:
          return;
        case 1697887057:
      }

      /* jnt */
          )
        ),
        (class_2661)/* jnt */
        )
      );
      if (var2) {
        /* jnt */;
      }

      var4 = 1368746572 >> 789303810 ^ -1416855537;
    }
  }

  public void la() {
    null /* jnt:encrypted */;
    null /* jnt:encrypted */);
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
  }

  static {
    Loader.init(mwt.class);
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (var10 + 447658034 + 1919176777 + 628997308 ^ 396856614) + 1807877096 - 1613240373 ^ 1180817097 ^ 250077552 ^ 673884014;
    MethodHandle var10000 = sza[(var10 + 447658034 + 1919176777 + 628997308 ^ 396856614) + 1807877096 - 1613240373
      ^ 1180817097
      ^ 250077552
      ^ 673884014
      ^ 386609264];
    if (sza[var10001 ^ 386609264] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (-181899527 + -915931621 | 0) & 19730944; var23 < var13.length(); var23 += (-1191524556 | -1191524556 | 1) & 83957827) {
        int var42 = (var13.charAt(var23) + 254 + 115 - 189 + 113 - 23 ^ 105) + 201 - 93 + 36;
        char var43 = (char)((var42 & 57344) >> 13 | var42 << 3);
        var13.setCharAt(var23, (char)((var42 & 57344) >> 13 | var42 << 3));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = -679073780 + 568081556 ^ -110992224; var29 < var16.length(); var29 += -1344626132 + (-353895774 ^ 747526520) ^ 1984185863) {
        char var48 = var16.charAt(var29);
        char var53 = (char)(
          (
                (
                      (
                            (
                                  (
                                      (((((var48 & '\uffff') >> 0 | var48 << 16) + 71 & 0) >> 16 | ((var48 & '\uffff') >> 0 | var48 << 16) + 71 << 0) & 64512)
                                          >> 10
                                        | ((((var48 & '\uffff') >> 0 | var48 << 16) + 71 & 0) >> 16 | ((var48 & '\uffff') >> 0 | var48 << 16) + 71 << 0) << 6
                                    )
                                    & 32768
                                )
                                >> 15
                              | (
                                  (((((var48 & '\uffff') >> 0 | var48 << 16) + 71 & 0) >> 16 | ((var48 & '\uffff') >> 0 | var48 << 16) + 71 << 0) & 64512)
                                      >> 10
                                    | ((((var48 & '\uffff') >> 0 | var48 << 16) + 71 & 0) >> 16 | ((var48 & '\uffff') >> 0 | var48 << 16) + 71 << 0) << 6
                                )
                                << 1
                          )
                          - 155
                          + 249
                        ^ 239
                    )
                    + 245
                  & 65504
              )
              >> 5
            | (
                  (
                        (
                              (
                                  (((((var48 & '\uffff') >> 0 | var48 << 16) + 71 & 0) >> 16 | ((var48 & '\uffff') >> 0 | var48 << 16) + 71 << 0) & 64512)
                                      >> 10
                                    | ((((var48 & '\uffff') >> 0 | var48 << 16) + 71 & 0) >> 16 | ((var48 & '\uffff') >> 0 | var48 << 16) + 71 << 0) << 6
                                )
                                & 32768
                            )
                            >> 15
                          | (
                              (((((var48 & '\uffff') >> 0 | var48 << 16) + 71 & 0) >> 16 | ((var48 & '\uffff') >> 0 | var48 << 16) + 71 << 0) & 64512) >> 10
                                | ((((var48 & '\uffff') >> 0 | var48 << 16) + 71 & 0) >> 16 | ((var48 & '\uffff') >> 0 | var48 << 16) + 71 << 0) << 6
                            )
                            << 1
                      )
                      - 155
                      + 249
                    ^ 239
                )
                + 245
              << 11
        );
        var16.setCharAt(
          var29,
          (char)(
            (
                  (
                        (
                              (
                                    (
                                        (((((var48 & '\uffff') >> 0 | var48 << 16) + 71 & 0) >> 16 | ((var48 & '\uffff') >> 0 | var48 << 16) + 71 << 0) & 64512)
                                            >> 10
                                          | ((((var48 & '\uffff') >> 0 | var48 << 16) + 71 & 0) >> 16 | ((var48 & '\uffff') >> 0 | var48 << 16) + 71 << 0) << 6
                                      )
                                      & 32768
                                  )
                                  >> 15
                                | (
                                    (((((var48 & '\uffff') >> 0 | var48 << 16) + 71 & 0) >> 16 | ((var48 & '\uffff') >> 0 | var48 << 16) + 71 << 0) & 64512)
                                        >> 10
                                      | ((((var48 & '\uffff') >> 0 | var48 << 16) + 71 & 0) >> 16 | ((var48 & '\uffff') >> 0 | var48 << 16) + 71 << 0) << 6
                                  )
                                  << 1
                            )
                            - 155
                            + 249
                          ^ 239
                      )
                      + 245
                    & 65504
                )
                >> 5
              | (
                    (
                          (
                                (
                                    (((((var48 & '\uffff') >> 0 | var48 << 16) + 71 & 0) >> 16 | ((var48 & '\uffff') >> 0 | var48 << 16) + 71 << 0) & 64512)
                                        >> 10
                                      | ((((var48 & '\uffff') >> 0 | var48 << 16) + 71 & 0) >> 16 | ((var48 & '\uffff') >> 0 | var48 << 16) + 71 << 0) << 6
                                  )
                                  & 32768
                              )
                              >> 15
                            | (
                                (((((var48 & '\uffff') >> 0 | var48 << 16) + 71 & 0) >> 16 | ((var48 & '\uffff') >> 0 | var48 << 16) + 71 << 0) & 64512) >> 10
                                  | ((((var48 & '\uffff') >> 0 | var48 << 16) + 71 & 0) >> 16 | ((var48 & '\uffff') >> 0 | var48 << 16) + 71 << 0) << 6
                              )
                              << 1
                        )
                        - 155
                        + 249
                      ^ 239
                  )
                  + 245
                << 11
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), mwt.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (1308641135 >> 1541492338 | 0) & -690828166; var35 < var19.length(); var35 += (329428322 - -2073019943 | 0) & 817892353) {
        int var58 = var19.charAt(var35) + 236 - 106;
        int var86 = (var58 & 65408) >> 7;
        int var59 = ((var58 & 65408) >> 7 | var58 << 9) - 38 + 39;
        int var87 = (((var58 & 65408) >> 7 | var58 << 9) - 38 + 39 & 57344) >> 13;
        var58 = (((var86 | var58 << 9) - 38 + 39 & 57344) >> 13 | ((var58 & 65408) >> 7 | var58 << 9) - 38 + 39 << 3) ^ 245;
        var86 = (((var87 | var59 << 3) ^ 245) & 57344) >> 13;
        int var61 = ((((var87 | var59 << 3) ^ 245) & 57344) >> 13 | var58 << 3) ^ 132;
        int var89 = ((((((var87 | var59 << 3) ^ 245) & 57344) >> 13 | var58 << 3) ^ 132) & 65472) >> 6;
        char var62 = (char)((((var86 | var58 << 3) ^ 132) & 65472) >> 6 | (((((var87 | var59 << 3) ^ 245) & 57344) >> 13 | var58 << 3) ^ 132) << 10);
        var19.setCharAt(var35, (char)(var89 | var61 << 10));
      }

      Class var7 = Class.forName(var19.toString(), false, mwt.class.getClassLoader());
      switch (((var4 - 645791680 + 649209638 + 1219253700 + 748347623 ^ 199008919 ^ 1711318179) - 1081365797 ^ 143102650) + 461544738 ^ 1570233621) {
        case 14376647:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 478308787:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 544979284:
        case 1243095465:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 642667017:
          var10000 = var0.findSpecial(var7, var5, var6, mwt.class);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    sza[(var10 + 447658034 + 1919176777 + 628997308 ^ 396856614) + 1807877096 - 1613240373 ^ 1180817097 ^ 250077552 ^ 673884014 ^ 386609264] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (((var10 ^ 2037759469) - 268413583 - 13067160 ^ 2019373509) - 231405241 ^ 361848684) - 1509930469 - 1983559855 + 1207376824;
    MethodHandle var10000 = sza[(((var10 ^ 2037759469) - 268413583 - 13067160 ^ 2019373509) - 231405241 ^ 361848684)
      - 1509930469
      - 1983559855
      + 1207376824
      - 453976353];
    if (sza[var10001 - 453976353] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = -1835524962 & 946134341 ^ 268442628; var24 < var14.length(); var24 += 437675947 + 437675947 ^ 875351895) {
        int var43 = (var14.charAt(var24) + 127 ^ 244 ^ 145) + 160 - 167;
        int var10004 = (var43 & 57344) >> 13;
        int var44 = (var43 & 57344) >> 13 | var43 << 3;
        int var88 = (((var43 & 57344) >> 13 | var43 << 3) & 65535) >> 0;
        var43 = ((var10004 | var43 << 3) & 65535) >> 0 | ((var43 & 57344) >> 13 | var43 << 3) << 16;
        var10004 = ((var88 | var44 << 16) & 63488) >> 11;
        int var46 = ((var88 | var44 << 16) & 63488) >> 11 | var43 << 5;
        int var90 = ((((var88 | var44 << 16) & 63488) >> 11 | var43 << 5) & 63488) >> 11;
        char var47 = (char)((((var10004 | var43 << 5) & 63488) >> 11 | (((var88 | var44 << 16) & 63488) >> 11 | var43 << 5) << 5) - 229);
        var14.setCharAt(var24, (char)((var90 | var46 << 5) - 229));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = 1112683956 >> (1112683956 ^ 185000192) ^ 1061;
        var30 < var17.length();
        var30 += (-1879716414 + (1808168670 << -1879716414) | 1) & 2097349
      ) {
        int var52 = var17.charAt(var30);
        int var91 = (var52 & 65408) >> 7;
        int var53 = ((var52 & 65408) >> 7 | var52 << 9) ^ 171;
        int var92 = ((((var52 & 65408) >> 7 | var52 << 9) ^ 171) & 65535) >> 0;
        var52 = ((((var91 | var52 << 9) ^ 171) & 65535) >> 0 | (((var52 & 65408) >> 7 | var52 << 9) ^ 171) << 16) + 244 + 173;
        var91 = ((var92 | var53 << 16) + 244 + 173 & 65472) >> 6;
        int var55 = ((var92 | var53 << 16) + 244 + 173 & 65472) >> 6 | var52 << 10;
        int var94 = ((((var92 | var53 << 16) + 244 + 173 & 65472) >> 6 | var52 << 10) & 0) >> 16;
        var52 = ((var91 | var52 << 10) & 0) >> 16 | (((var92 | var53 << 16) + 244 + 173 & 65472) >> 6 | var52 << 10) << 0;
        var91 = ((var94 | var55 << 0) & 63488) >> 11;
        int var57 = ((var94 | var55 << 0) & 63488) >> 11 | var52 << 5;
        int var96 = ((((var94 | var55 << 0) & 63488) >> 11 | var52 << 5) & 32768) >> 15;
        char var58 = (char)((((var91 | var52 << 5) & 32768) >> 15 | (((var94 | var55 << 0) & 63488) >> 11 | var52 << 5) << 1) - 159);
        var17.setCharAt(var30, (char)((var96 | var57 << 1) - 159));
      }

      Class var6 = Class.forName(var17.toString(), false, mwt.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (-569996707 + -222318516 | 0) & 588841282; var36 < var20.length(); var36 += 180183178 * (687154462 >>> 180183178) ^ -177903269) {
        int var63 = (var20.charAt(var36) ^ '}') - 91 + 183;
        char var66 = (char)(
          (
              ((((((var63 & 0) >> 16 | var63 << 0) ^ 71) & 32768) >> 15 | (((var63 & 0) >> 16 | var63 << 0) ^ 71) << 1) - 139 + 125 & 32768) >> 15
                | (((((var63 & 0) >> 16 | var63 << 0) ^ 71) & 32768) >> 15 | (((var63 & 0) >> 16 | var63 << 0) ^ 71) << 1) - 139 + 125 << 1
            )
            - 40
        );
        var20.setCharAt(
          var36,
          (char)(
            (
                ((((((var63 & 0) >> 16 | var63 << 0) ^ 71) & 32768) >> 15 | (((var63 & 0) >> 16 | var63 << 0) ^ 71) << 1) - 139 + 125 & 32768) >> 15
                  | (((((var63 & 0) >> 16 | var63 << 0) ^ 71) & 32768) >> 15 | (((var63 & 0) >> 16 | var63 << 0) ^ 71) << 1) - 139 + 125 << 1
              )
              - 40
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), mwt.class.getClassLoader()).returnType();
      switch ((var4 + 1582145422 - 1786015620 + 1842242839 + 1653642861 - 1712583421 ^ 1526999257 ^ 776530725) + 641910202 - 612449749 ^ 1273346133) {
        case 456504334:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 471637446:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1932932023:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 2091354143:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      sza[(((var10 ^ 2037759469) - 268413583 - 13067160 ^ 2019373509) - 231405241 ^ 361848684) - 1509930469 - 1983559855 + 1207376824 - 453976353] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }

  public static native void guard();
}
