// KryptonPlus Module: Xray
// Original class: znx
// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Path2D.Float;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.Identifier;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Xray {
  public static Map ucr = (HashMap)/* jnt */;
  public static int qql = 64;
  // [JNT] MethodHandle dispatch table (removed)
  // $VF: Handled exception range with multiple entry points by splitting it
  // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
  public static void xc(String var0, String var1) {
    int var8 = 861922760;
    if (!/* jnt */, var0
    )) {
      Exception var10000;
      label66: {
        InputStream var2;
        label65: {
          label64: {
            try {
              ClassLoader var14 = /* jnt */;
              StringBuilder var18 = (StringBuilder)/* jnt */;
              int var10002 = (476509803 - (1604850082 >>> 403472647) | 0) & -1604843103;

              StringBuilder var10003;
              for (var10003 = (StringBuilder)/* jnt */;
                var10002 < ((962179005 | -123431135) ^ -100810840);
                var10002 += (1865725499 >>> 1622921935 | 1) & -1471798893
              ) {
                int var37 = /* jnt */
                  - 'C'
                  - 151
                  + 32
                  + 84;
                char var38 = (char)((var37 & 65472) >> 6 | var37 << 10);
                /* jnt */((var37 & 65472) >> 6 | var37 << 10)
                );
              }

              var2 = /* jnt */
                    ),
                    var1
                  )
                )
              );
              if (var2 == null) {
                break label64;
              }
            } catch (Exception var11) {
              var10000 = var11;
              boolean var10001 = false;
              break label66;
            }

            try {
              var8 = -1458333505 << -314665816 ^ 1402321105;
              break label65;
            } catch (Exception var10) {
              var10000 = var10;
              boolean var19 = false;
              break label66;
            }
          }

          var8 = 975843464 >>> (-522994958 >> -522994958) ^ -469069052;
        }

        switch ((var8 - 921548495 ^ 1128911559 ^ 820367294) - 166995619 - 2064222976 ^ 1618389687) {
          case -1782370193:
          default:
            try {
              BufferedImage var3 = /* jnt */;
              class_1011 var4 = /* jnt */;
              int var15 = -1426544546 + -1426544546 ^ 1441878204;

              StringBuilder var21;
              for (var21 = (StringBuilder)/* jnt */;
                var15 < ((794714383 >> -1010071772 - 794714383 | 5) & -852790137);
                var15 += -634118268 + (1564582487 & -1844336718) ^ -365575785
              ) {
                int var26 = /* jnt */ + 'D';
                int var40 = (var26 & 63488) >> 11;
                int var27 = ((var26 & 63488) >> 11 | var26 << 5) + 18;
                int var41 = (((var26 & 63488) >> 11 | var26 << 5) + 18 & 65408) >> 7;
                char var28 = (char)((((var40 | var26 << 5) + 18 & 65408) >> 7 | ((var26 & 63488) >> 11 | var26 << 5) + 18 << 9) - 139);
                /* jnt */((var41 | var27 << 9) - 139)
                );
              }

              String var17 = /* jnt */;
              var21 = (StringBuilder)/* jnt */;
              int var30 = 1641773943 - 603782478 ^ 1037991465;

              StringBuilder var35;
              for (var35 = (StringBuilder)/* jnt */;
                var30 < ((-1576290919 & 1126074191 | 4) & -2062524297);
                var30 += (-1903804635 - 1293799350 | 1) & -1308422015
              ) {
                int var43 = /* jnt */ - 237
                  ^ 196
                  ^ 216;
                int var49 = (var43 & 65535) >> 0;
                int var44 = (var43 & 65535) >> 0 | var43 << 16;
                int var50 = (((var43 & 65535) >> 0 | var43 << 16) & 57344) >> 13;
                char var45 = (char)(((var49 | var43 << 16) & 57344) >> 13 | ((var43 & 65535) >> 0 | var43 << 16) << 3);
                /* jnt */(var50 | var44 << 3)
                );
              }

              class_2960 var5 = /* jnt */
                    ),
                    var0
                  )
                )
              );
              /* jnt */
                ),
                var5,
                (class_1043)/* jnt */() -> {
                    StringBuilder var10000x = (StringBuilder)/* jnt */;
                    int var10001x = (-1104617466 + -1104617466 | 0) & -2102784192;

                    StringBuilder var10002x;
                    for (var10002x = (StringBuilder)/* jnt */;
                      var10001x < (-525522043 + 1435636142 ^ 910114110);
                      var10001x += (-1075273224 + 1162211876 | 1) & 1619003841
                    ) {
                      /* jnt */(
                          (
                              /* jnt */
                                  + '\''
                                  + 5
                                  - 5
                                ^ 251
                            )
                            + 110
                        )
                      );
                    }

                    return /* jnt */
                        ),
                        var0
                      )
                    );
                  },
                  var4
                )
              );
              /* jnt */, var0, var5
              );
              return;
            } catch (Exception var9) {
              var10000 = var9;
              boolean var20 = false;
              break;
            }
          case 969259452:
            return;
        }
      }

      Exception var12 = var10000;
      /* jnt */;
    }
  }

  public static void wpw(String var0, double var1, double var3, double var5, zn var7) {
    int var11 = 1072046023;
    class_2960 var8 = (Identifier)/* jnt */, var0
    );
    if (var8 != null) {
      class_1044 var9 = /* jnt */
        ),
        var8
      );
      if (var9 != null) {
        boolean var10 = /* jnt */);
        if (var10) {
          /* jnt */);
        }

        var11 = (628841993 ^ -386422221 | 801453740) & 804732588;

        while (true) {
          switch ((var11 - 425524630 + 1559721232 + 1029533573 ^ 886544520) - 348306035 + 293275807) {
            case -2128424113:
            default:
              /* jnt */);
              /* jnt */, var1, var3, var5, var5, var7);
              /* jnt */,
                /* jnt */,
                /* jnt */
              );
              if (var10) {
                /* jnt */);
              }

              var11 = -1392199520 * -1392199520 ^ -1883639736;
              break;
            case -1359400453:
              return;
          }
        }
      }
    }
  }

  public static boolean lkt(String var0) {
    return /* jnt */, var0
    );
  }

  public static BufferedImage rh(InputStream var0, int var1) throws Exception {
    int var11 = -56542587;
    Document var2 = /* jnt */
      ),
      var0
    );
    Element var3 = /* jnt */;
    BufferedImage var4 = (BufferedImage)/* jnt */;
    Graphics2D var5 = /* jnt */;
    /* jnt */,
      null /* jnt:encrypted */
    );
    /* jnt */,
      null /* jnt:encrypted */
    );
    float var6 = (float)var1 / 24.0F;
    /* jnt */var6, (double)var6);
    /* jnt *//* jnt */),
        null /* jnt:encrypted */),
        null /* jnt:encrypted */),
        null /* jnt:encrypted */)
      )
    );
    /* jnt *//* jnt */
    );
    NodeList var7 = /* jnt */;
    int var8 = 0;

    while (true) {
      var11 = (665244916 & 712616626 * 712616626 | 1097775026) & -848379913;

      while (true) {
        switch (var11 - 1843060144 + 414343702 - 474062860 + 1666873223 + 980236968 + 373497546) {
          case -2014754247:
            /* jnt */;
            return var4;
          case -2012254903:
        }

        if (var8 < /* jnt */) {
          if (/* jnt */ instanceof Element var10
            )
           {
            /* jnt */;
          }

          var8++;
          break;
        }

        var11 = (1701329442 << 1017092762 | 1162384614) & 1701811951;
      }
    }
  }

  public static void wsu(Graphics2D var0, Element var1) {
    // $VF: Couldn't be decompiled
    // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
    // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.struct.gen.VarType.isSuperset(org.jetbrains.java.decompiler.struct.gen.VarType)" because "t1" is null
    //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.mergeVars(VarDefinitionHelper.java:666)
    //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.mergeVars(VarDefinitionHelper.java:597)
    //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.mergeVars(VarDefinitionHelper.java:597)
    //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.mergeVars(VarDefinitionHelper.java:597)
    //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.mergeVars(VarDefinitionHelper.java:597)
    //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.mergeVars(VarDefinitionHelper.java:597)
    //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.mergeVars(VarDefinitionHelper.java:597)
    //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.mergeVars(VarDefinitionHelper.java:597)
    //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.mergeVars(VarDefinitionHelper.java:597)
    //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.mergeVars(VarDefinitionHelper.java:597)
    //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.mergeVars(VarDefinitionHelper.java:597)
    //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.mergeVars(VarDefinitionHelper.java:597)
    //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.mergeVars(VarDefinitionHelper.java:597)
    //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.mergeVars(VarDefinitionHelper.java:597)
    //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.mergeVars(VarDefinitionHelper.java:597)
    //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.mergeVars(VarDefinitionHelper.java:597)
    //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.mergeVars(VarDefinitionHelper.java:597)
    //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.mergeVars(VarDefinitionHelper.java:597)
    //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.mergeVars(VarDefinitionHelper.java:546)
    //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.setVarDefinitions(VarDefinitionHelper.java:245)
    //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarProcessor.setVarDefinitions(VarProcessor.java:53)
    //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:422)
    //
    // Bytecode:
    // 0000: goto 04b6
    // 0003: ldc_w -413972725
    // 0006: ldc_w -1124040985
    // 0009: ixor
    // 000a: ldc_w -1471643136
    // 000d: ior
    // 000e: ldc_w -1362586087
    // 0011: iand
    // 0012: istore 9
    // 0014: goto 0f73
    // 0017: ldc_w 2085971429
    // 001a: ldc_w 55400995
    // 001d: isub
    // 001e: ldc_w -1327336159
    // 0021: ior
    // 0022: ldc_w -1276643985
    // 0025: iand
    // 0026: istore 9
    // 0028: goto 075c
    // 002b: iload 9
    // 002d: ldc_w 795913199
    // 0030: ixor
    // 0031: ldc_w 2086100823
    // 0034: ixor
    // 0035: ldc_w 213744963
    // 0038: iadd
    // 0039: ldc_w 1128839267
    // 003c: ixor
    // 003d: ldc_w 1074839720
    // 0040: iadd
    // 0041: ldc_w 491104080
    // 0044: ixor
    // 0045: lookupswitch 2905 5 -1861270008 1000 -1519027465 2905 -1256221699 2145 -1178738801 3539 -177320933 1444
    // 0078: iload 9
    // 007a: ldc_w 1411879312
    // 007d: isub
    // 007e: ldc_w 982961865
    // 0081: isub
    // 0082: ldc_w 413230904
    // 0085: iadd
    // 0086: ldc_w 199196699
    // 0089: ixor
    // 008a: ldc_w 1345000640
    // 008d: isub
    // 008e: ldc_w 801251405
    // 0091: ixor
    // 0092: lookupswitch 601 2 -1782977631 601 -1630622630 749
    // 00ac: swap
    // 00ad: ldc_w 1618877272
    // 00b0: ldc_w 118008615
    // 00b3: ldc_w -756585237
    // 00b6: iadd
    // 00b7: isub
    // 00b8: ldc_w -2037513404
    // 00bb: ixor
    // 00bc: dup2
    // 00bd: if_icmpge 0652
    // 00c0: pop
    // 00c1: dup2
    // 00c2: invokedynamic JNT (Ljava/lang/Object;I)C bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "\ufddfﲟ﹟﨟\uf65f烈", "ͽƿͿƣ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104153 ]
    // 00c7: bipush 119
    // 00c9: isub
    // 00ca: dup
    // 00cb: ldc_w 63488
    // 00ce: iand
    // 00cf: bipush 11
    // 00d1: ishr
    // 00d2: swap
    // 00d3: bipush 5
    // 00d4: ishl
    // 00d5: ior
    // 00d6: dup
    // 00d7: ldc_w 65024
    // 00da: iand
    // 00db: bipush 9
    // 00dd: ishr
    // 00de: swap
    // 00df: bipush 7
    // 00e1: ishl
    // 00e2: ior
    // 00e3: sipush 187
    // 00e6: iadd
    // 00e7: bipush 125
    // 00e9: iadd
    // 00ea: i2c
    // 00eb: dup
    // 00ec: dup2_x2
    // 00ed: pop2
    // 00ee: dup2_x2
    // 00ef: dup2_x1
    // 00f0: pop2
    // 00f1: invokedynamic JNT (Ljava/lang/Object;IC)V bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "履ﵟ烈\uf5dfﲟ﹟﨟\uf65f烈", "ͽƿƣͿǉ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104148 ]
    // 00f6: pop
    // 00f7: ldc_w -1254242135
    // 00fa: ldc_w -1195326909
    // 00fd: iushr
    // 00fe: ldc_w 380090644
    // 0101: ixor
    // 0102: iadd
    // 0103: swap
    // 0104: goto 0d6b
    // 0107: ldc_w -685552655
    // 010a: ldc_w 1658897427
    // 010d: ishr
    // 010e: ldc_w 1217537154
    // 0111: ior
    // 0112: ldc_w 1221766531
    // 0115: iand
    // 0116: istore 9
    // 0118: goto 075c
    // 011b: ldc_w -153968721
    // 011e: ldc_w 2138011641
    // 0121: ior
    // 0122: ldc_w -1609568133
    // 0125: ior
    // 0126: ldc_w -1500515205
    // 0129: iand
    // 012a: istore 9
    // 012c: goto 0c61
    // 012f: ldc_w -1860271837
    // 0132: dup
    // 0133: ishl
    // 0134: ldc_w -789559217
    // 0137: ixor
    // 0138: istore 9
    // 013a: goto 0239
    // 013d: ldc_w 1661280389
    // 0140: dup
    // 0141: ior
    // 0142: ldc_w 1248705718
    // 0145: ixor
    // 0146: istore 9
    // 0148: goto 071f
    // 014b: aload 2
    // 014c: ldc_w -1154941453
    // 014f: ldc_w 1481384129
    // 0152: ixor
    // 0153: bipush 0
    // 0154: ior
    // 0155: ldc_w 135790729
    // 0158: iand
    // 0159: ldc_w "ǲǚǢƺ"
    // 015c: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1177502414, "ݠﱟײַﱟ烈۠", "ͽƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳͿǉ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104151 ]
    // 0161: checkcast java/lang/StringBuilder
    // 0164: goto 0419
    // 0167: swap
    // 0168: ldc_w -406358959
    // 016b: dup
    // 016c: ldc_w 206026975
    // 016f: iand
    // 0170: ixor
    // 0171: ldc_w -478133246
    // 0174: ixor
    // 0175: dup2
    // 0176: if_icmpge 0f08
    // 0179: pop
    // 017a: dup2
    // 017b: invokedynamic JNT (Ljava/lang/Object;I)C bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "\ufddfﲟ﹟﨟\uf65f烈", "ͽƿͿƣ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104154 ]
    // 0180: dup
    // 0181: ldc_w 65532
    // 0184: iand
    // 0185: bipush 2
    // 0186: ishr
    // 0187: swap
    // 0188: bipush 14
    // 018a: ishl
    // 018b: ior
    // 018c: bipush 74
    // 018e: isub
    // 018f: dup
    // 0190: ldc_w 65520
    // 0193: iand
    // 0194: bipush 4
    // 0195: ishr
    // 0196: swap
    // 0197: bipush 12
    // 0199: ishl
    // 019a: ior
    // 019b: dup
    // 019c: ldc_w 65528
    // 019f: iand
    // 01a0: bipush 3
    // 01a1: ishr
    // 01a2: swap
    // 01a3: bipush 13
    // 01a5: ishl
    // 01a6: ior
    // 01a7: sipush 207
    // 01aa: isub
    // 01ab: i2c
    // 01ac: dup
    // 01ad: dup2_x2
    // 01ae: pop2
    // 01af: dup2_x2
    // 01b0: dup2_x1
    // 01b1: pop2
    // 01b2: invokedynamic JNT (Ljava/lang/Object;IC)V bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "履ﵟ烈\uf5dfﲟ﹟﨟\uf65f烈", "ͽƿƣͿǉ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104157 ]
    // 01b7: pop
    // 01b8: ldc_w -214777473
    // 01bb: ldc_w 1922874267
    // 01be: iand
    // 01bf: ldc_w 1913684250
    // 01c2: ixor
    // 01c3: iadd
    // 01c4: swap
    // 01c5: goto 0167
    // 01c8: pop2
    // 01c9: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "烈\ufadf\uf1df烈﨟ﱟײַﳟ", "ͽͿƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104152 ]
    // 01ce: fconst_0
    // 01cf: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;F)F bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -685398015, "ﭟ寧", "ͽƥțȁǫΛȋ\u0383ǣΛѵțǧΛ̷ǥѷǧѷșȕʳƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳƩͿƩ", "ꂅ\ue084肅", 260104155 ]
    // 01d4: fstore 4
    // 01d6: aload 1
    // 01d7: ldc_w -1292284347
    // 01da: ldc_w -619124020
    // 01dd: ixor
    // 01de: bipush 0
    // 01df: ior
    // 01e0: ldc_w -2078797198
    // 01e3: iand
    // 01e4: ldc_w "綆ꦆ"
    // 01e7: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1177502414, "ݠﱟײַﱟ烈۠", "ͽƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳͿǉ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104142 ]
    // 01ec: checkcast java/lang/StringBuilder
    // 01ef: goto 0e78
    // 01f2: aload 0
    // 01f3: aload 6
    // 01f5: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)V bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "ﶟ﨟﹟\uf8df", "ͽƥȑȏȉȏΛȏȋȕΛǃǽȏ̭ѷʳͿǉ", "ꂄႄ悅ႄ\ue098ႄ炅䂅\ue098炊₅ႄ\u0085肄還やゅ₉䂊", 260104145 ]
    // 01fa: goto 0893
    // 01fd: pop2
    // 01fe: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "烈\ufadf\uf1df烈﨟ﱟײַﳟ", "ͽͿƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104140 ]
    // 0203: fconst_0
    // 0204: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;F)F bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -685398015, "ﭟ寧", "ͽƥțȁǫΛȋ\u0383ǣΛѵțǧΛ̷ǥѷǧѷșȕʳƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳƩͿƩ", "ꂅ\ue084肅", 260104143 ]
    // 0209: fstore 7
    // 020b: aload 1
    // 020c: ldc_w -307174219
    // 020f: ldc_w -2006104720
    // 0212: swap
    // 0213: iadd
    // 0214: ldc_w 1981688357
    // 0217: ixor
    // 0218: ldc_w "茪輪"
    // 021b: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1177502414, "ݠﱟײַﱟ烈۠", "ͽƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳͿǉ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104146 ]
    // 0220: checkcast java/lang/StringBuilder
    // 0223: goto 0167
    // 0226: pop2
    // 0227: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "烈\ufadf\uf1df烈﨟ﱟײַﳟ", "ͽͿƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104149 ]
    // 022c: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Z bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "ﵟ著寧﹟ﮟ履", "ͽƥȑȏȉȏΛǥȏșǫΛǛǡȑѷǣȕʳͿǱ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄", 260104144 ]
    // 0231: ifeq 09fc
    // 0234: bipush 1
    // 0235: istore 3
    // 0236: goto 09fc
    // 0239: iload 9
    // 023b: ldc_w 585110444
    // 023e: isub
    // 023f: ldc_w 72035906
    // 0242: isub
    // 0243: ldc_w 1835927258
    // 0246: isub
    // 0247: ldc_w 133298033
    // 024a: ixor
    // 024b: ldc_w 1711595322
    // 024e: isub
    // 024f: ldc_w 1829242177
    // 0252: ixor
    // 0253: lookupswitch 1193 2 866006405 1193 1969566914 -97
    // 026c: aload 2
    // 026d: ldc_w -503763315
    // 0270: ldc_w 519024627
    // 0273: dup_x1
    // 0274: iand
    // 0275: ishr
    // 0276: bipush 0
    // 0277: ior
    // 0278: ldc_w -259514362
    // 027b: iand
    // 027c: ldc_w "ﭰ\uf370\udb70䍱\udb70썰\ueb70ꍰ"
    // 027f: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1177502414, "ݠﱟײַﱟ烈۠", "ͽƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳͿǉ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104147 ]
    // 0284: checkcast java/lang/StringBuilder
    // 0287: goto 06ad
    // 028a: ldc_w -417816658
    // 028d: ldc_w 2045258441
    // 0290: imul
    // 0291: ldc_w 416018041
    // 0294: ixor
    // 0295: istore 9
    // 0297: goto 0d93
    // 029a: ldc_w -2104323107
    // 029d: dup
    // 029e: dup
    // 029f: ior
    // 02a0: imul
    // 02a1: ldc_w 748314674
    // 02a4: ior
    // 02a5: ldc_w 1021240439
    // 02a8: iand
    // 02a9: istore 9
    // 02ab: goto 0d93
    // 02ae: ldc_w 1188349883
    // 02b1: ldc_w -1708652746
    // 02b4: imul
    // 02b5: ldc_w 2072841958
    // 02b8: ixor
    // 02b9: istore 9
    // 02bb: goto 0239
    // 02be: ldc_w -727173612
    // 02c1: dup
    // 02c2: ldc_w 1608368752
    // 02c5: ior
    // 02c6: iushr
    // 02c7: ldc_w -1692548484
    // 02ca: ior
    // 02cb: ldc_w -77729156
    // 02ce: iand
    // 02cf: istore 9
    // 02d1: goto 06c1
    // 02d4: ldc_w -1913232180
    // 02d7: ldc_w -521508838
    // 02da: dup2
    // 02db: iadd
    // 02dc: iand
    // 02dd: iushr
    // 02de: ldc_w 1989560536
    // 02e1: ior
    // 02e2: ldc_w 2140569560
    // 02e5: iand
    // 02e6: istore 9
    // 02e8: goto 0078
    // 02eb: swap
    // 02ec: ldc_w -1241784164
    // 02ef: ldc_w 999171858
    // 02f2: ldc_w -1447078893
    // 02f5: ixor
    // 02f6: isub
    // 02f7: bipush 2
    // 02f8: ior
    // 02f9: ldc_w 403968578
    // 02fc: iand
    // 02fd: dup2
    // 02fe: if_icmpge 0699
    // 0301: pop
    // 0302: dup2
    // 0303: invokedynamic JNT (Ljava/lang/Object;I)C bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "\ufddfﲟ﹟﨟\uf65f烈", "ͽƿͿƣ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104166 ]
    // 0308: bipush 50
    // 030a: isub
    // 030b: dup
    // 030c: ldc_w 49152
    // 030f: iand
    // 0310: bipush 14
    // 0312: ishr
    // 0313: swap
    // 0314: bipush 2
    // 0315: ishl
    // 0316: ior
    // 0317: dup
    // 0318: ldc_w 65534
    // 031b: iand
    // 031c: bipush 1
    // 031d: ishr
    // 031e: swap
    // 031f: bipush 15
    // 0321: ishl
    // 0322: ior
    // 0323: dup
    // 0324: ldc_w 65534
    // 0327: iand
    // 0328: bipush 1
    // 0329: ishr
    // 032a: swap
    // 032b: bipush 15
    // 032d: ishl
    // 032e: ior
    // 032f: bipush 37
    // 0331: ixor
    // 0332: i2c
    // 0333: dup
    // 0334: dup2_x2
    // 0335: pop2
    // 0336: dup2_x2
    // 0337: dup2_x1
    // 0338: pop2
    // 0339: invokedynamic JNT (Ljava/lang/Object;IC)V bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "履ﵟ烈\uf5dfﲟ﹟﨟\uf65f烈", "ͽƿƣͿǉ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104169 ]
    // 033e: pop
    // 033f: ldc_w 1792865733
    // 0342: ldc_w -866933129
    // 0345: dup
    // 0346: iushr
    // 0347: ior
    // 0348: bipush 0
    // 0349: ior
    // 034a: ldc_w -1809774079
    // 034d: iand
    // 034e: iadd
    // 034f: swap
    // 0350: goto 02d4
    // 0353: pop2
    // 0354: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "烈\ufadf\uf1df烈﨟ﱟײַﳟ", "ͽͿƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104164 ]
    // 0359: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Z bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "ﵟ著寧﹟ﮟ履", "ͽƥȑȏȉȏΛǥȏșǫΛǛǡȑѷǣȕʳͿǱ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄", 260104167 ]
    // 035e: ifeq 09fc
    // 0361: bipush 3
    // 0362: istore 3
    // 0363: goto 09fc
    // 0366: aload 0
    // 0367: fload 4
    // 0369: fload 5
    // 036b: fload 6
    // 036d: fload 7
    // 036f: invokedynamic JNT (FFFF)Ljava/lang/Object; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1177502414, "ݠﱟײַﱟ烈۠", "ͽƩƩƩƩͿǉ", "ꂄႄ悅ႄ\ue098ႄ炅䂅\ue098炄傄\uf084킄\ue098₋傄や䂅ႄ\ue084炄삄傄₉䂊䂘悊삄\uf084ႄ䂅", 260104170 ]
    // 0374: checkcast java/awt/geom/Rectangle2D$Float
    // 0377: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)V bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "ﶟ﨟﹟\uf8df", "ͽƥȑȏȉȏΛȏȋȕΛǃǽȏ̭ѷʳͿǉ", "ꂄႄ悅ႄ\ue098ႄ炅䂅\ue098炊₅ႄ\u0085肄還やゅ₉䂊", 260104173 ]
    // 037c: goto 08ff
    // 037f: swap
    // 0380: ldc_w 970071103
    // 0383: ldc_w 243642348
    // 0386: ishl
    // 0387: bipush 5
    // 0388: ior
    // 0389: ldc_w 37226975
    // 038c: iand
    // 038d: dup2
    // 038e: if_icmpge 0fc2
    // 0391: pop
    // 0392: dup2
    // 0393: invokedynamic JNT (Ljava/lang/Object;I)C bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "\ufddfﲟ﹟﨟\uf65f烈", "ͽƿͿƣ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104168 ]
    // 0398: dup
    // 0399: ldc_w 63488
    // 039c: iand
    // 039d: bipush 11
    // 039f: ishr
    // 03a0: swap
    // 03a1: bipush 5
    // 03a2: ishl
    // 03a3: ior
    // 03a4: sipush 140
    // 03a7: isub
    // 03a8: dup
    // 03a9: ldc_w 63488
    // 03ac: iand
    // 03ad: bipush 11
    // 03af: ishr
    // 03b0: swap
    // 03b1: bipush 5
    // 03b2: ishl
    // 03b3: ior
    // 03b4: bipush 125
    // 03b6: iadd
    // 03b7: sipush 220
    // 03ba: ixor
    // 03bb: i2c
    // 03bc: dup
    // 03bd: dup2_x2
    // 03be: pop2
    // 03bf: dup2_x2
    // 03c0: dup2_x1
    // 03c1: pop2
    // 03c2: invokedynamic JNT (Ljava/lang/Object;IC)V bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "履ﵟ烈\uf5dfﲟ﹟﨟\uf65f烈", "ͽƿƣͿǉ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104171 ]
    // 03c7: pop
    // 03c8: ldc_w 57656221
    // 03cb: ldc_w 2083564605
    // 03ce: ishl
    // 03cf: ldc_w -1610612735
    // 03d2: ixor
    // 03d3: iadd
    // 03d4: swap
    // 03d5: goto 0d7f
    // 03d8: goto 029a
    // 03db: ldc_w -1919709763
    // 03de: ldc_w -1380058623
    // 03e1: isub
    // 03e2: ldc_w -1605882298
    // 03e5: ior
    // 03e6: ldc_w -1569951882
    // 03e9: iand
    // 03ea: istore 9
    // 03ec: goto 06c1
    // 03ef: pop2
    // 03f0: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "烈\ufadf\uf1df烈﨟ﱟײַﳟ", "ͽͿƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104158 ]
    // 03f5: fconst_0
    // 03f6: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;F)F bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -685398015, "ﭟ寧", "ͽƥțȁǫΛȋ\u0383ǣΛѵțǧΛ̷ǥѷǧѷșȕʳƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳƩͿƩ", "ꂅ\ue084肅", 260104161 ]
    // 03fb: fstore 4
    // 03fd: aload 1
    // 03fe: ldc_w -2003888164
    // 0401: ldc_w -1039533873
    // 0404: isub
    // 0405: bipush 0
    // 0406: ior
    // 0407: ldc_w 289947712
    // 040a: iand
    // 040b: ldc_w "絔細"
    // 040e: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1177502414, "ݠﱟײַﱟ烈۠", "ͽƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳͿǉ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104156 ]
    // 0413: checkcast java/lang/StringBuilder
    // 0416: goto 0d57
    // 0419: ldc_w -1397892647
    // 041c: ldc_w 698803471
    // 041f: ior
    // 0420: ldc_w 1493697505
    // 0423: ior
    // 0424: ldc_w 2106381281
    // 0427: iand
    // 0428: istore 9
    // 042a: goto 002b
    // 042d: swap
    // 042e: ldc_w 1474752921
    // 0431: ldc_w -967973148
    // 0434: ixor
    // 0435: ldc_w -1851058311
    // 0438: ixor
    // 0439: dup2
    // 043a: if_icmpge 09a4
    // 043d: pop
    // 043e: dup2
    // 043f: invokedynamic JNT (Ljava/lang/Object;I)C bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "\ufddfﲟ﹟﨟\uf65f烈", "ͽƿͿƣ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104159 ]
    // 0444: sipush 245
    // 0447: ixor
    // 0448: bipush 66
    // 044a: iadd
    // 044b: bipush 22
    // 044d: iadd
    // 044e: bipush 58
    // 0450: isub
    // 0451: dup
    // 0452: ldc_w 32768
    // 0455: iand
    // 0456: bipush 15
    // 0458: ishr
    // 0459: swap
    // 045a: bipush 1
    // 045b: ishl
    // 045c: ior
    // 045d: i2c
    // 045e: dup
    // 045f: dup2_x2
    // 0460: pop2
    // 0461: dup2_x2
    // 0462: dup2_x1
    // 0463: pop2
    // 0464: invokedynamic JNT (Ljava/lang/Object;IC)V bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "履ﵟ烈\uf5dfﲟ﹟﨟\uf65f烈", "ͽƿƣͿǉ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104162 ]
    // 0469: pop
    // 046a: ldc_w -1575271320
    // 046d: ldc_w 1667152132
    // 0470: iadd
    // 0471: bipush 1
    // 0472: ior
    // 0473: ldc_w -1442840061
    // 0476: iand
    // 0477: iadd
    // 0478: swap
    // 0479: goto 0d45
    // 047c: pop2
    // 047d: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "烈\ufadf\uf1df烈﨟ﱟײַﳟ", "ͽͿƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104165 ]
    // 0482: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Z bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "ﵟ著寧﹟ﮟ履", "ͽƥȑȏȉȏΛǥȏșǫΛǛǡȑѷǣȕʳͿǱ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄", 260104160 ]
    // 0487: ifeq 09fc
    // 048a: bipush 0
    // 048b: istore 3
    // 048c: goto 09fc
    // 048f: return
    // 0490: pop2
    // 0491: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "烈\ufadf\uf1df烈﨟ﱟײַﳟ", "ͽͿƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104163 ]
    // 0496: fconst_0
    // 0497: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;F)F bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -685398015, "ﭟ寧", "ͽƥțȁǫΛȋ\u0383ǣΛѵțǧΛ̷ǥѷǧѷșȕʳƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳƩͿƩ", "ꂅ\ue084肅", 260104118 ]
    // 049c: fstore 6
    // 049e: aload 1
    // 049f: ldc_w -169153555
    // 04a2: dup
    // 04a3: ior
    // 04a4: ldc_w -169153555
    // 04a7: ixor
    // 04a8: ldc_w "ᕐᔠᕠᕀᕐᘐ"
    // 04ab: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1177502414, "ݠﱟײַﱟ烈۠", "ͽƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳͿǉ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104121 ]
    // 04b0: checkcast java/lang/StringBuilder
    // 04b3: goto 0660
    // 04b6: ldc_w 263429090
    // 04b9: istore 9
    // 04bb: goto 053d
    // 04be: swap
    // 04bf: ldc_w 8826921
    // 04c2: dup
    // 04c3: dup
    // 04c4: iadd
    // 04c5: imul
    // 04c6: bipush 2
    // 04c7: ior
    // 04c8: ldc_w 900141199
    // 04cb: iand
    // 04cc: dup2
    // 04cd: if_icmpge 0107
    // 04d0: pop
    // 04d1: dup2
    // 04d2: invokedynamic JNT (Ljava/lang/Object;I)C bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "\ufddfﲟ﹟﨟\uf65f烈", "ͽƿͿƣ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104116 ]
    // 04d7: sipush 156
    // 04da: iadd
    // 04db: bipush 10
    // 04dd: isub
    // 04de: sipush 197
    // 04e1: iadd
    // 04e2: dup
    // 04e3: ldc_w 65520
    // 04e6: iand
    // 04e7: bipush 4
    // 04e8: ishr
    // 04e9: swap
    // 04ea: bipush 12
    // 04ec: ishl
    // 04ed: ior
    // 04ee: sipush 139
    // 04f1: iadd
    // 04f2: i2c
    // 04f3: dup
    // 04f4: dup2_x2
    // 04f5: pop2
    // 04f6: dup2_x2
    // 04f7: dup2_x1
    // 04f8: pop2
    // 04f9: invokedynamic JNT (Ljava/lang/Object;IC)V bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "履ﵟ烈\uf5dfﲟ﹟﨟\uf65f烈", "ͽƿƣͿǉ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104119 ]
    // 04fe: pop
    // 04ff: ldc_w 2040840121
    // 0502: ldc_w -1664268495
    // 0505: swap
    // 0506: ior
    // 0507: bipush 0
    // 0508: ior
    // 0509: ldc_w 131137
    // 050c: iand
    // 050d: iadd
    // 050e: swap
    // 050f: goto 0ea5
    // 0512: ldc_w 762304564
    // 0515: ldc_w 814742109
    // 0518: iushr
    // 0519: ldc_w 135641476
    // 051c: ior
    // 051d: ldc_w -272630291
    // 0520: iand
    // 0521: istore 9
    // 0523: goto 0f73
    // 0526: ldc_w 887802863
    // 0529: ldc_w 1739211212
    // 052c: ishr
    // 052d: ldc_w -238649279
    // 0530: ior
    // 0531: ldc_w -103878459
    // 0534: iand
    // 0535: istore 9
    // 0537: goto 0d93
    // 053a: goto 029a
    // 053d: aload 1
    // 053e: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -394389726, "ﳟﵟ烈\uf19f﹟ﳟ\uf31f﹟ﭟﵟ", "ͽͿƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳ", "\uf084₅炄\ue098炅らや\ue098䂄\uf084킄\ue098傊삄傄킄傄\ue084䂅", 260104122 ]
    // 0543: astore 2
    // 0544: bipush -1
    // 0545: istore 3
    // 0546: aload 2
    // 0547: invokedynamic JNT (Ljava/lang/Object;)I bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "ﲟ﹟履ﲟ\uf5df\ufadfﶟﵟ", "ͽͿƿ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄", 260104125 ]
    // 054c: ldc_w 1114815757
    // 054f: isub
    // 0550: ldc_w 953618431
    // 0553: isub
    // 0554: ldc_w 195994968
    // 0557: isub
    // 0558: ldc_w 742683315
    // 055b: iadd
    // 055c: ldc_w 1495320434
    // 055f: isub
    // 0560: ldc_w 1485770691
    // 0563: iadd
    // 0564: lookupswitch 1176 5 -1527973740 -730 -1527862075 1769 -1527799164 1068 -969356704 -62 1403454832 293
    // 0598: aload 1
    // 0599: ldc_w -1270763851
    // 059c: dup
    // 059d: ishl
    // 059e: ldc_w -694157312
    // 05a1: ixor
    // 05a2: ldc_w "\uf486\uf016"
    // 05a5: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1177502414, "ݠﱟײַﱟ烈۠", "ͽƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳͿǉ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104120 ]
    // 05aa: checkcast java/lang/StringBuilder
    // 05ad: goto 0d6b
    // 05b0: ldc_w -1881975337
    // 05b3: ldc_w 26312820
    // 05b6: ior
    // 05b7: ldc_w 947937288
    // 05ba: ior
    // 05bb: ldc_w -1129322456
    // 05be: iand
    // 05bf: istore 9
    // 05c1: goto 0d93
    // 05c4: aload 1
    // 05c5: ldc_w "d"
    // 05c8: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -394389726, "ﳟﵟ烈\uf65f烈烈﨟ﱟ\ufe1f寧烈ﵟ", "ͽƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳͿƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳ", "\uf084₅炄\ue098炅らや\ue098䂄\uf084킄\ue098傊삄傄킄傄\ue084䂅", 260104123 ]
    // 05cd: astore 4
    // 05cf: aload 4
    // 05d1: invokedynamic JNT (Ljava/lang/Object;)Z bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "ﱟ履\uf55fﭟ犯烈\uf85f", "ͽͿǱ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄", 260104110 ]
    // 05d6: ifne 03d8
    // 05d9: aload 0
    // 05da: aload 4
    // 05dc: invokedynamic JNT (Ljava/lang/Object;)Ljava/awt/geom/Path2D$Float; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -685398015, "犯ﮟ履", "ͽƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳͿƥȑȏȉȏΛȏȋȕΛǫѷțǧΛǭȏȕǽ\u0381̵ǵƩǥțȏȕʳ", "ꂅ\ue084肅", 260104113 ]
    // 05e1: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)V bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "ﶟ﨟﹟\uf8df", "ͽƥȑȏȉȏΛȏȋȕΛǃǽȏ̭ѷʳͿǉ", "ꂄႄ悅ႄ\ue098ႄ炅䂅\ue098炊₅ႄ\u0085肄還やゅ₉䂊", 260104108 ]
    // 05e6: goto 03d8
    // 05e9: swap
    // 05ea: ldc_w 451170210
    // 05ed: ldc_w 843435282
    // 05f0: ldc_w 1989322131
    // 05f3: iand
    // 05f4: iand
    // 05f5: bipush 4
    // 05f6: ior
    // 05f7: ldc_w 1627682925
    // 05fa: iand
    // 05fb: dup2
    // 05fc: if_icmpge 0f51
    // 05ff: pop
    // 0600: dup2
    // 0601: invokedynamic JNT (Ljava/lang/Object;I)C bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "\ufddfﲟ﹟﨟\uf65f烈", "ͽƿͿƣ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104111 ]
    // 0606: dup
    // 0607: bipush 0
    // 0608: iand
    // 0609: bipush 16
    // 060b: ishr
    // 060c: swap
    // 060d: bipush 0
    // 060e: ishl
    // 060f: ior
    // 0610: bipush 110
    // 0612: isub
    // 0613: dup
    // 0614: bipush 0
    // 0615: iand
    // 0616: bipush 16
    // 0618: ishr
    // 0619: swap
    // 061a: bipush 0
    // 061b: ishl
    // 061c: ior
    // 061d: dup
    // 061e: ldc 65472
    // 0620: iand
    // 0621: bipush 6
    // 0623: ishr
    // 0624: swap
    // 0625: bipush 10
    // 0627: ishl
    // 0628: ior
    // 0629: dup
    // 062a: ldc_w 65520
    // 062d: iand
    // 062e: bipush 4
    // 062f: ishr
    // 0630: swap
    // 0631: bipush 12
    // 0633: ishl
    // 0634: ior
    // 0635: i2c
    // 0636: dup
    // 0637: dup2_x2
    // 0638: pop2
    // 0639: dup2_x2
    // 063a: dup2_x1
    // 063b: pop2
    // 063c: invokedynamic JNT (Ljava/lang/Object;IC)V bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "履ﵟ烈\uf5dfﲟ﹟﨟\uf65f烈", "ͽƿƣͿǉ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104114 ]
    // 0641: pop
    // 0642: ldc_w -1846897894
    // 0645: ldc_w 2040058880
    // 0648: iushr
    // 0649: ldc_w -1846897893
    // 064c: ixor
    // 064d: iadd
    // 064e: swap
    // 064f: goto 0b3d
    // 0652: ldc_w -1795700520
    // 0655: dup
    // 0656: iushr
    // 0657: ldc_w -381623533
    // 065a: ixor
    // 065b: istore 9
    // 065d: goto 06c1
    // 0660: ldc_w 894742755
    // 0663: ldc_w 1629872166
    // 0666: swap
    // 0667: ishr
    // 0668: ldc_w 1910063356
    // 066b: ior
    // 066c: ldc_w -103032067
    // 066f: iand
    // 0670: istore 9
    // 0672: goto 0a22
    // 0675: ldc_w 295993011
    // 0678: ldc_w 2052400649
    // 067b: ldc_w -1103766313
    // 067e: iand
    // 067f: ixor
    // 0680: ldc_w -2092945278
    // 0683: ixor
    // 0684: istore 9
    // 0686: goto 0810
    // 0689: ldc_w -13255429
    // 068c: ldc_w -1906813963
    // 068f: isub
    // 0690: ldc_w 467268826
    // 0693: ixor
    // 0694: istore 9
    // 0696: goto 0d93
    // 0699: ldc_w 1962218436
    // 069c: ldc_w -843008346
    // 069f: ishl
    // 06a0: ldc_w -636040685
    // 06a3: ior
    // 06a4: ldc_w -88618413
    // 06a7: iand
    // 06a8: istore 9
    // 06aa: goto 0913
    // 06ad: ldc_w 298012439
    // 06b0: ldc_w -1076825704
    // 06b3: iushr
    // 06b4: ldc_w 1298381723
    // 06b7: ior
    // 06b8: ldc_w -805568613
    // 06bb: iand
    // 06bc: istore 9
    // 06be: goto 002b
    // 06c1: iload 9
    // 06c3: ldc_w 1978103103
    // 06c6: ixor
    // 06c7: ldc_w 1855832768
    // 06ca: isub
    // 06cb: ldc_w 146019512
    // 06ce: iadd
    // 06cf: ldc_w 1761375310
    // 06d2: isub
    // 06d3: ldc_w 1946722674
    // 06d6: ixor
    // 06d7: ldc_w 526693748
    // 06da: iadd
    // 06db: lookupswitch 1331 3 -1674425355 1331 -651261308 -748 1937828627 -1299
    // 06fc: iload 7
    // 06fe: bipush 1
    // 06ff: iadd
    // 0700: aload 5
    // 0702: arraylength
    // 0703: if_icmpge 02ae
    // 0706: aload 6
    // 0708: aload 5
    // 070a: iload 7
    // 070c: faload
    // 070d: aload 5
    // 070f: iload 7
    // 0711: bipush 1
    // 0712: iadd
    // 0713: faload
    // 0714: invokedynamic JNT (Ljava/lang/Object;FF)V bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "ﮟﱟײַﵟ\uf19f\ufadf", "ͽƩƩͿǉ", "ꂄႄ悅ႄ\ue098ႄ炅䂅\ue098炄傄\uf084킄\ue098\u008bႄ䂅肄₉䂊䂘悊삄\uf084ႄ䂅", 260104117 ]
    // 0719: iinc 7 2
    // 071c: goto 012f
    // 071f: iload 9
    // 0721: ldc_w 1363547124
    // 0724: iadd
    // 0725: ldc_w 921383436
    // 0728: ixor
    // 0729: ldc_w 1699996916
    // 072c: isub
    // 072d: ldc_w 1583901148
    // 0730: iadd
    // 0731: ldc_w 2023962681
    // 0734: iadd
    // 0735: ldc_w 1402500578
    // 0738: iadd
    // 0739: lookupswitch 1458 3 -2056206712 -1677 -334852778 1390 295023918 1458
    // 075c: iload 9
    // 075e: ldc_w 2037406246
    // 0761: ixor
    // 0762: ldc_w 1256380510
    // 0765: isub
    // 0766: ldc_w 1290722754
    // 0769: iadd
    // 076a: ldc_w 300577106
    // 076d: ixor
    // 076e: ldc_w 24705016
    // 0771: ixor
    // 0772: ldc_w 544356278
    // 0775: ixor
    // 0776: lookupswitch -1401 2 -92371531 -1401 55463188 246
    // 0790: swap
    // 0791: ldc_w -1592990476
    // 0794: dup
    // 0795: ldc_w 1469341955
    // 0798: isub
    // 0799: iand
    // 079a: ldc_w 17334514
    // 079d: ixor
    // 079e: dup2
    // 079f: if_icmpge 0512
    // 07a2: pop
    // 07a3: dup2
    // 07a4: invokedynamic JNT (Ljava/lang/Object;I)C bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "\ufddfﲟ﹟﨟\uf65f烈", "ͽƿͿƣ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104112 ]
    // 07a9: sipush 154
    // 07ac: iadd
    // 07ad: dup
    // 07ae: ldc_w 49152
    // 07b1: iand
    // 07b2: bipush 14
    // 07b4: ishr
    // 07b5: swap
    // 07b6: bipush 2
    // 07b7: ishl
    // 07b8: ior
    // 07b9: bipush 123
    // 07bb: isub
    // 07bc: dup
    // 07bd: ldc_w 63488
    // 07c0: iand
    // 07c1: bipush 11
    // 07c3: ishr
    // 07c4: swap
    // 07c5: bipush 5
    // 07c6: ishl
    // 07c7: ior
    // 07c8: bipush 124
    // 07ca: isub
    // 07cb: i2c
    // 07cc: dup
    // 07cd: dup2_x2
    // 07ce: pop2
    // 07cf: dup2_x2
    // 07d0: dup2_x1
    // 07d1: pop2
    // 07d2: invokedynamic JNT (Ljava/lang/Object;IC)V bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "履ﵟ烈\uf5dfﲟ﹟﨟\uf65f烈", "ͽƿƣͿǉ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104115 ]
    // 07d7: pop
    // 07d8: ldc_w 1938487831
    // 07db: ldc_w -215378809
    // 07de: ishl
    // 07df: bipush 1
    // 07e0: ior
    // 07e1: ldc_w 176329831
    // 07e4: iand
    // 07e5: iadd
    // 07e6: swap
    // 07e7: goto 0e78
    // 07ea: pop2
    // 07eb: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "烈\ufadf\uf1df烈﨟ﱟײַﳟ", "ͽͿƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104134 ]
    // 07f0: fconst_0
    // 07f1: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;F)F bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -685398015, "ﭟ寧", "ͽƥțȁǫΛȋ\u0383ǣΛѵțǧΛ̷ǥѷǧѷșȕʳƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳƩͿƩ", "ꂅ\ue084肅", 260104137 ]
    // 07f6: fstore 5
    // 07f8: aload 1
    // 07f9: ldc_w -669072795
    // 07fc: dup
    // 07fd: ishr
    // 07fe: ldc_w -20908525
    // 0801: ixor
    // 0802: ldc_w "\u008fI"
    // 0805: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1177502414, "ݠﱟײַﱟ烈۠", "ͽƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳͿǉ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104132 ]
    // 080a: checkcast java/lang/StringBuilder
    // 080d: goto 02d4
    // 0810: iload 9
    // 0812: ldc_w 1145199567
    // 0815: iadd
    // 0816: ldc_w 1322696464
    // 0819: ixor
    // 081a: ldc_w 681722445
    // 081d: iadd
    // 081e: ldc_w 1839498005
    // 0821: isub
    // 0822: ldc_w 1283894594
    // 0825: ixor
    // 0826: ldc_w 1463702199
    // 0829: isub
    // 082a: lookupswitch -1540 5 -1220601075 -942 -1155128146 1812 -756440433 1130 883912833 -1239 2075390376 -1540
    // 085c: ldc_w 1018841328
    // 085f: ldc_w -102485754
    // 0862: iand
    // 0863: ldc_w 1375681318
    // 0866: ixor
    // 0867: istore 9
    // 0869: goto 0810
    // 086c: pop2
    // 086d: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "烈\ufadf\uf1df烈﨟ﱟײַﳟ", "ͽͿƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104135 ]
    // 0872: fconst_0
    // 0873: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;F)F bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -685398015, "ﭟ寧", "ͽƥțȁǫΛȋ\u0383ǣΛѵțǧΛ̷ǥѷǧѷșȕʳƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳƩͿƩ", "ꂅ\ue084肅", 260104138 ]
    // 0878: fstore 7
    // 087a: aload 0
    // 087b: fload 4
    // 087d: fload 5
    // 087f: fload 6
    // 0881: fload 7
    // 0883: invokedynamic JNT (FFFF)Ljava/lang/Object; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1177502414, "ݠﱟײַﱟ烈۠", "ͽƩƩƩƩͿǉ", "ꂄႄ悅ႄ\ue098ႄ炅䂅\ue098炄傄\uf084킄\ue098삊還\ue084傄₉䂊䂘悊삄\uf084ႄ䂅", 260104141 ]
    // 0888: checkcast java/awt/geom/Line2D$Float
    // 088b: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)V bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "ﶟ﨟﹟\uf8df", "ͽƥȑȏȉȏΛȏȋȕΛǃǽȏ̭ѷʳͿǉ", "ꂄႄ悅ႄ\ue098ႄ炅䂅\ue098炊₅ႄ\u0085肄還やゅ₉䂊", 260104136 ]
    // 0890: goto 029a
    // 0893: goto 029a
    // 0896: ldc_w -1307924655
    // 0899: ldc_w 1591911245
    // 089c: ixor
    // 089d: ldc_w 1407406199
    // 08a0: ixor
    // 08a1: istore 9
    // 08a3: goto 071f
    // 08a6: swap
    // 08a7: ldc_w 1934993436
    // 08aa: ldc_w -1162429605
    // 08ad: dup
    // 08ae: imul
    // 08af: iushr
    // 08b0: bipush 49
    // 08b2: ixor
    // 08b3: dup2
    // 08b4: if_icmpge 0f63
    // 08b7: pop
    // 08b8: dup2
    // 08b9: invokedynamic JNT (Ljava/lang/Object;I)C bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "\ufddfﲟ﹟﨟\uf65f烈", "ͽƿͿƣ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104139 ]
    // 08be: sipush 147
    // 08c1: iadd
    // 08c2: dup
    // 08c3: ldc_w 64512
    // 08c6: iand
    // 08c7: bipush 10
    // 08c9: ishr
    // 08ca: swap
    // 08cb: bipush 6
    // 08cd: ishl
    // 08ce: ior
    // 08cf: sipush 203
    // 08d2: iadd
    // 08d3: dup
    // 08d4: ldc_w 65534
    // 08d7: iand
    // 08d8: bipush 1
    // 08d9: ishr
    // 08da: swap
    // 08db: bipush 15
    // 08dd: ishl
    // 08de: ior
    // 08df: bipush 117
    // 08e1: isub
    // 08e2: i2c
    // 08e3: dup
    // 08e4: dup2_x2
    // 08e5: pop2
    // 08e6: dup2_x2
    // 08e7: dup2_x1
    // 08e8: pop2
    // 08e9: invokedynamic JNT (Ljava/lang/Object;IC)V bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "履ﵟ烈\uf5dfﲟ﹟﨟\uf65f烈", "ͽƿƣͿǉ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104126 ]
    // 08ee: pop
    // 08ef: ldc_w 165499238
    // 08f2: ldc_w 1389371704
    // 08f5: iadd
    // 08f6: ldc_w 1554870943
    // 08f9: ixor
    // 08fa: iadd
    // 08fb: swap
    // 08fc: goto 06ad
    // 08ff: ldc_w -1165918910
    // 0902: ldc_w 1604920632
    // 0905: ixor
    // 0906: ldc_w 185992013
    // 0909: ior
    // 090a: ldc_w 456596317
    // 090d: iand
    // 090e: istore 9
    // 0910: goto 0c61
    // 0913: iload 9
    // 0915: ldc_w 374368825
    // 0918: iadd
    // 0919: ldc_w 279604821
    // 091c: isub
    // 091d: ldc_w 147149531
    // 0920: ixor
    // 0921: ldc_w 118278245
    // 0924: ixor
    // 0925: ldc_w 664710245
    // 0928: isub
    // 0929: ldc_w 1982181211
    // 092c: iadd
    // 092d: lookupswitch -1181 2 -540430056 -1181 1056727615 55
    // 0948: aload 2
    // 0949: ldc_w -1154890304
    // 094c: ldc_w -178720654
    // 094f: isub
    // 0950: bipush 0
    // 0951: ior
    // 0952: ldc_w 839387281
    // 0955: iand
    // 0956: ldc_w "쁯葯큯ꁯ"
    // 0959: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1177502414, "ݠﱟײַﱟ烈۠", "ͽƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳͿǉ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104129 ]
    // 095e: checkcast java/lang/StringBuilder
    // 0961: goto 0b3d
    // 0964: pop2
    // 0965: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "烈\ufadf\uf1df烈﨟ﱟײַﳟ", "ͽͿƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104124 ]
    // 096a: fconst_0
    // 096b: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;F)F bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -685398015, "ﭟ寧", "ͽƥțȁǫΛȋ\u0383ǣΛѵțǧΛ̷ǥѷǧѷșȕʳƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳƩͿƩ", "ꂅ\ue084肅", 260104127 ]
    // 0970: fstore 6
    // 0972: aload 1
    // 0973: ldc_w -335319742
    // 0976: ldc_w -2087083633
    // 0979: ldc_w -173112619
    // 097c: iand
    // 097d: ior
    // 097e: ldc_w -309596729
    // 0981: ixor
    // 0982: ldc_w "ﶘ廊"
    // 0985: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1177502414, "ݠﱟײַﱟ烈۠", "ͽƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳͿǉ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104130 ]
    // 098a: checkcast java/lang/StringBuilder
    // 098d: goto 0ea5
    // 0990: ldc_w 1408689276
    // 0993: ldc_w -461797397
    // 0996: iand
    // 0997: ldc_w -1769374704
    // 099a: ior
    // 099b: ldc_w -1764753956
    // 099e: iand
    // 099f: istore 9
    // 09a1: goto 0d93
    // 09a4: ldc_w 724346155
    // 09a7: ldc_w 1855911559
    // 09aa: ishl
    // 09ab: ldc_w 1747591427
    // 09ae: ixor
    // 09af: istore 9
    // 09b1: goto 0810
    // 09b4: iload 9
    // 09b6: ldc_w 1400338448
    // 09b9: isub
    // 09ba: ldc_w 1897852838
    // 09bd: isub
    // 09be: ldc_w 500053885
    // 09c1: isub
    // 09c2: ldc_w 581371644
    // 09c5: ixor
    // 09c6: ldc_w 241205089
    // 09c9: iadd
    // 09ca: ldc_w 1836442844
    // 09cd: isub
    // 09ce: lookupswitch -574 2 -1556007391 -574 -378819408 273
    // 09e8: ldc_w 665327746
    // 09eb: ldc_w 1861060600
    // 09ee: ldc_w -1683441249
    // 09f1: iadd
    // 09f2: iand
    // 09f3: ldc_w 759966512
    // 09f6: ixor
    // 09f7: istore 9
    // 09f9: goto 0d93
    // 09fc: ldc_w -1332029776
    // 09ff: ldc_w -1125022384
    // 0a02: dup_x1
    // 0a03: isub
    // 0a04: ishl
    // 0a05: ldc_w 1629503751
    // 0a08: ixor
    // 0a09: istore 9
    // 0a0b: goto 0d93
    // 0a0e: ldc_w 684996137
    // 0a11: ldc_w 927572080
    // 0a14: imul
    // 0a15: ldc_w 1146193995
    // 0a18: ior
    // 0a19: ldc_w 1147111551
    // 0a1c: iand
    // 0a1d: istore 9
    // 0a1f: goto 0d93
    // 0a22: iload 9
    // 0a24: ldc_w 810212559
    // 0a27: iadd
    // 0a28: ldc_w 303791360
    // 0a2b: iadd
    // 0a2c: ldc_w 1783173120
    // 0a2f: ixor
    // 0a30: ldc_w 945888937
    // 0a33: isub
    // 0a34: ldc_w 253085470
    // 0a37: isub
    // 0a38: ldc_w 1729640799
    // 0a3b: isub
    // 0a3c: lookupswitch 1434 2 -1099584576 -1406 662307749 1434
    // 0a58: ldc_w -1272113417
    // 0a5b: ldc_w 1017805882
    // 0a5e: ldc_w -186353922
    // 0a61: ixor
    // 0a62: ishl
    // 0a63: ldc_w -1935421170
    // 0a66: ior
    // 0a67: ldc_w -1376266482
    // 0a6a: iand
    // 0a6b: istore 9
    // 0a6d: goto 0d93
    // 0a70: pop2
    // 0a71: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "烈\ufadf\uf1df烈﨟ﱟײַﳟ", "ͽͿƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104133 ]
    // 0a76: fconst_0
    // 0a77: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;F)F bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -685398015, "ﭟ寧", "ͽƥțȁǫΛȋ\u0383ǣΛѵțǧΛ̷ǥѷǧѷșȕʳƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳƩͿƩ", "ꂅ\ue084肅", 260104128 ]
    // 0a7c: fstore 5
    // 0a7e: aload 1
    // 0a7f: ldc_w "r"
    // 0a82: fconst_0
    // 0a83: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;F)F bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -685398015, "ﭟ寧", "ͽƥțȁǫΛȋ\u0383ǣΛѵțǧΛ̷ǥѷǧѷșȕʳƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳƩͿƩ", "ꂅ\ue084肅", 260104131 ]
    // 0a88: fstore 6
    // 0a8a: aload 0
    // 0a8b: fload 4
    // 0a8d: fload 6
    // 0a8f: fsub
    // 0a90: fload 5
    // 0a92: fload 6
    // 0a94: fsub
    // 0a95: fload 6
    // 0a97: fconst_2
    // 0a98: fmul
    // 0a99: fload 6
    // 0a9b: fconst_2
    // 0a9c: fmul
    // 0a9d: invokedynamic JNT (FFFF)Ljava/lang/Object; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1177502414, "ݠﱟײַﱟ烈۠", "ͽƩƩƩƩͿǉ", "ꂄႄ悅ႄ\ue098ႄ炅䂅\ue098炄傄\uf084킄\ue098傊삄삄還\u0085ゅ傄₉䂊䂘悊삄\uf084ႄ䂅", 260104086 ]
    // 0aa2: checkcast java/awt/geom/Ellipse2D$Float
    // 0aa5: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)V bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "ﶟ﨟﹟\uf8df", "ͽƥȑȏȉȏΛȏȋȕΛǃǽȏ̭ѷʳͿǉ", "ꂄႄ悅ႄ\ue098ႄ炅䂅\ue098炊₅ႄ\u0085肄還やゅ₉䂊", 260104089 ]
    // 0aaa: goto 029a
    // 0aad: aload 1
    // 0aae: ldc_w "x"
    // 0ab1: fconst_0
    // 0ab2: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;F)F bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -685398015, "ﭟ寧", "ͽƥțȁǫΛȋ\u0383ǣΛѵțǧΛ̷ǥѷǧѷșȕʳƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳƩͿƩ", "ꂅ\ue084肅", 260104084 ]
    // 0ab7: fstore 4
    // 0ab9: aload 1
    // 0aba: ldc_w "y"
    // 0abd: fconst_0
    // 0abe: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;F)F bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -685398015, "ﭟ寧", "ͽƥțȁǫΛȋ\u0383ǣΛѵțǧΛ̷ǥѷǧѷșȕʳƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳƩͿƩ", "ꂅ\ue084肅", 260104087 ]
    // 0ac3: fstore 5
    // 0ac5: aload 1
    // 0ac6: ldc_w 370471146
    // 0ac9: ldc_w -674978564
    // 0acc: iand
    // 0acd: ldc_w 369402088
    // 0ad0: ixor
    // 0ad1: ldc_w "殄渄滄櫄淄"
    // 0ad4: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1177502414, "ݠﱟײַﱟ烈۠", "ͽƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳͿǉ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104090 ]
    // 0ad9: checkcast java/lang/StringBuilder
    // 0adc: goto 0d7f
    // 0adf: swap
    // 0ae0: ldc_w -1062017326
    // 0ae3: dup
    // 0ae4: dup2
    // 0ae5: iand
    // 0ae6: ishl
    // 0ae7: ishr
    // 0ae8: ldc_w -1062017328
    // 0aeb: ixor
    // 0aec: dup2
    // 0aed: if_icmpge 0003
    // 0af0: pop
    // 0af1: dup2
    // 0af2: invokedynamic JNT (Ljava/lang/Object;I)C bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "\ufddfﲟ﹟﨟\uf65f烈", "ͽƿͿƣ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104093 ]
    // 0af7: dup
    // 0af8: ldc_w 65528
    // 0afb: iand
    // 0afc: bipush 3
    // 0afd: ishr
    // 0afe: swap
    // 0aff: bipush 13
    // 0b01: ishl
    // 0b02: ior
    // 0b03: bipush 55
    // 0b05: iadd
    // 0b06: sipush 179
    // 0b09: iadd
    // 0b0a: sipush 147
    // 0b0d: ixor
    // 0b0e: dup
    // 0b0f: ldc_w 61440
    // 0b12: iand
    // 0b13: bipush 12
    // 0b15: ishr
    // 0b16: swap
    // 0b17: bipush 4
    // 0b18: ishl
    // 0b19: ior
    // 0b1a: i2c
    // 0b1b: dup
    // 0b1c: dup2_x2
    // 0b1d: pop2
    // 0b1e: dup2_x2
    // 0b1f: dup2_x1
    // 0b20: pop2
    // 0b21: invokedynamic JNT (Ljava/lang/Object;IC)V bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "履ﵟ烈\uf5dfﲟ﹟﨟\uf65f烈", "ͽƿƣͿǉ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104088 ]
    // 0b26: pop
    // 0b27: ldc_w -426018295
    // 0b2a: ldc_w 1565114176
    // 0b2d: ldc_w -1364343873
    // 0b30: isub
    // 0b31: ishr
    // 0b32: bipush 1
    // 0b33: ior
    // 0b34: ldc_w 8388769
    // 0b37: iand
    // 0b38: iadd
    // 0b39: swap
    // 0b3a: goto 0d57
    // 0b3d: ldc_w -852749393
    // 0b40: ldc_w 790415623
    // 0b43: ishl
    // 0b44: ldc_w 162652613
    // 0b47: ior
    // 0b48: ldc_w -302915073
    // 0b4b: iand
    // 0b4c: istore 9
    // 0b4e: goto 002b
    // 0b51: aload 2
    // 0b52: ldc_w -869766996
    // 0b55: ldc_w -1939095624
    // 0b58: ldc_w -555485510
    // 0b5b: iushr
    // 0b5c: isub
    // 0b5d: bipush 0
    // 0b5e: ior
    // 0b5f: ldc_w 324212240
    // 0b62: iand
    // 0b63: ldc_w "豝ꑝ졝豝끝鑝"
    // 0b66: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1177502414, "ݠﱟײַﱟ烈۠", "ͽƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳͿǉ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104091 ]
    // 0b6b: checkcast java/lang/StringBuilder
    // 0b6e: goto 0bfe
    // 0b71: ldc_w -1039101206
    // 0b74: ldc_w 1803827716
    // 0b77: ishr
    // 0b78: ldc_w 43673058
    // 0b7b: ior
    // 0b7c: ldc_w -1012930582
    // 0b7f: iand
    // 0b80: istore 9
    // 0b82: goto 0d93
    // 0b85: aload 2
    // 0b86: ldc_w -2089543021
    // 0b89: dup
    // 0b8a: ishr
    // 0b8b: bipush 0
    // 0b8c: ior
    // 0b8d: bipush 17
    // 0b8f: iand
    // 0b90: ldc_w "î胡胦é"
    // 0b93: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1177502414, "ݠﱟײַﱟ烈۠", "ͽƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳͿǉ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104078 ]
    // 0b98: checkcast java/lang/StringBuilder
    // 0b9b: goto 0d45
    // 0b9e: swap
    // 0b9f: ldc_w 1532615570
    // 0ba2: ldc_w 334277057
    // 0ba5: isub
    // 0ba6: ldc_w 1198338517
    // 0ba9: ixor
    // 0baa: dup2
    // 0bab: if_icmpge 085c
    // 0bae: pop
    // 0baf: dup2
    // 0bb0: invokedynamic JNT (Ljava/lang/Object;I)C bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "\ufddfﲟ﹟﨟\uf65f烈", "ͽƿͿƣ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104081 ]
    // 0bb5: bipush 82
    // 0bb7: ixor
    // 0bb8: dup
    // 0bb9: ldc_w 61440
    // 0bbc: iand
    // 0bbd: bipush 12
    // 0bbf: ishr
    // 0bc0: swap
    // 0bc1: bipush 4
    // 0bc2: ishl
    // 0bc3: ior
    // 0bc4: dup
    // 0bc5: ldc 57344
    // 0bc7: iand
    // 0bc8: bipush 13
    // 0bca: ishr
    // 0bcb: swap
    // 0bcc: bipush 3
    // 0bcd: ishl
    // 0bce: ior
    // 0bcf: dup
    // 0bd0: ldc_w 64512
    // 0bd3: iand
    // 0bd4: bipush 10
    // 0bd6: ishr
    // 0bd7: swap
    // 0bd8: bipush 6
    // 0bda: ishl
    // 0bdb: ior
    // 0bdc: bipush 88
    // 0bde: ixor
    // 0bdf: i2c
    // 0be0: dup
    // 0be1: dup2_x2
    // 0be2: pop2
    // 0be3: dup2_x2
    // 0be4: dup2_x1
    // 0be5: pop2
    // 0be6: invokedynamic JNT (Ljava/lang/Object;IC)V bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "履ﵟ烈\uf5dfﲟ﹟﨟\uf65f烈", "ͽƿƣͿǉ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104076 ]
    // 0beb: pop
    // 0bec: ldc_w -768308896
    // 0bef: ldc_w 205708537
    // 0bf2: isub
    // 0bf3: bipush 0
    // 0bf4: ior
    // 0bf5: ldc_w 33951873
    // 0bf8: iand
    // 0bf9: iadd
    // 0bfa: swap
    // 0bfb: goto 0419
    // 0bfe: ldc_w 1868815748
    // 0c01: ldc_w 1719441736
    // 0c04: ishr
    // 0c05: ldc_w 1236866164
    // 0c08: ixor
    // 0c09: istore 9
    // 0c0b: goto 002b
    // 0c0e: pop2
    // 0c0f: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "烈\ufadf\uf1df烈﨟ﱟײַﳟ", "ͽͿƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104079 ]
    // 0c14: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -394389726, "ﳟﵟ烈\uf65f烈烈﨟ﱟ\ufe1f寧烈ﵟ", "ͽƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳͿƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳ", "\uf084₅炄\ue098炅らや\ue098䂄\uf084킄\ue098傊삄傄킄傄\ue084䂅", 260104082 ]
    // 0c19: astore 4
    // 0c1b: aload 4
    // 0c1d: invokedynamic JNT (Ljava/lang/Object;)[F bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -685398015, "ﯟﵟײַ", "ͽƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳͿǳƩ", "ꂅ\ue084肅", 260104085 ]
    // 0c22: checkcast [F
    // 0c25: astore 5
    // 0c27: aload 5
    // 0c29: arraylength
    // 0c2a: bipush 4
    // 0c2b: if_icmplt 0893
    // 0c2e: invokedynamic JNT ()Ljava/lang/Object; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1177502414, "ݠﱟײַﱟ烈۠", "ͽͿǉ", "ꂄႄ悅ႄ\ue098ႄ炅䂅\ue098炄傄\uf084킄\ue098\u008bႄ䂅肄₉䂊䂘悊삄\uf084ႄ䂅", 260104080 ]
    // 0c33: checkcast java/awt/geom/Path2D$Float
    // 0c36: astore 6
    // 0c38: aload 6
    // 0c3a: aload 5
    // 0c3c: bipush 0
    // 0c3d: faload
    // 0c3e: aload 5
    // 0c40: bipush 1
    // 0c41: faload
    // 0c42: invokedynamic JNT (Ljava/lang/Object;FF)V bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "ﭟ\ufadf蘭ﵟ\uf19f\ufadf", "ͽƩƩͿǉ", "ꂄႄ悅ႄ\ue098ႄ炅䂅\ue098炄傄\uf084킄\ue098\u008bႄ䂅肄₉䂊䂘悊삄\uf084ႄ䂅", 260104083 ]
    // 0c47: bipush 2
    // 0c48: istore 7
    // 0c4a: goto 012f
    // 0c4d: ldc_w 2062513405
    // 0c50: ldc_w 1261229685
    // 0c53: ior
    // 0c54: ldc_w -2134356981
    // 0c57: ior
    // 0c58: ldc_w -1092813605
    // 0c5b: iand
    // 0c5c: istore 9
    // 0c5e: goto 0d93
    // 0c61: iload 9
    // 0c63: ldc_w 295906683
    // 0c66: isub
    // 0c67: ldc_w 1271504143
    // 0c6a: iadd
    // 0c6b: ldc_w 1401895579
    // 0c6e: ixor
    // 0c6f: ldc_w 412542657
    // 0c72: ixor
    // 0c73: ldc_w 1622139540
    // 0c76: iadd
    // 0c77: ldc_w 1305521244
    // 0c7a: ixor
    // 0c7b: lookupswitch -2325 2 589665635 -1857 1099904693 -2325
    // 0c94: pop2
    // 0c95: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "烈\ufadf\uf1df烈﨟ﱟײַﳟ", "ͽͿƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104102 ]
    // 0c9a: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Z bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "ﵟ著寧﹟ﮟ履", "ͽƥȑȏȉȏΛǥȏșǫΛǛǡȑѷǣȕʳͿǱ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄", 260104105 ]
    // 0c9f: ifeq 09fc
    // 0ca2: bipush 2
    // 0ca3: istore 3
    // 0ca4: goto 09fc
    // 0ca7: swap
    // 0ca8: ldc_w -1673660909
    // 0cab: dup
    // 0cac: iadd
    // 0cad: ldc_w 947645472
    // 0cb0: ixor
    // 0cb1: dup2
    // 0cb2: if_icmpge 03db
    // 0cb5: pop
    // 0cb6: dup2
    // 0cb7: invokedynamic JNT (Ljava/lang/Object;I)C bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "\ufddfﲟ﹟﨟\uf65f烈", "ͽƿͿƣ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104100 ]
    // 0cbc: sipush 237
    // 0cbf: ixor
    // 0cc0: bipush 105
    // 0cc2: ixor
    // 0cc3: sipush 226
    // 0cc6: isub
    // 0cc7: bipush 108
    // 0cc9: iadd
    // 0cca: sipush 155
    // 0ccd: ixor
    // 0cce: i2c
    // 0ccf: dup
    // 0cd0: dup2_x2
    // 0cd1: pop2
    // 0cd2: dup2_x2
    // 0cd3: dup2_x1
    // 0cd4: pop2
    // 0cd5: invokedynamic JNT (Ljava/lang/Object;IC)V bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "履ﵟ烈\uf5dfﲟ﹟﨟\uf65f烈", "ͽƿƣͿǉ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104103 ]
    // 0cda: pop
    // 0cdb: ldc_w -941423262
    // 0cde: ldc_w 631288186
    // 0ce1: ishl
    // 0ce2: ldc_w -2013265919
    // 0ce5: ixor
    // 0ce6: iadd
    // 0ce7: swap
    // 0ce8: goto 0896
    // 0ceb: swap
    // 0cec: ldc_w 2036333532
    // 0cef: ldc_w 2094766672
    // 0cf2: ixor
    // 0cf3: ldc_w 92561806
    // 0cf6: ixor
    // 0cf7: dup2
    // 0cf8: if_icmpge 02be
    // 0cfb: pop
    // 0cfc: dup2
    // 0cfd: invokedynamic JNT (Ljava/lang/Object;I)C bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "\ufddfﲟ﹟﨟\uf65f烈", "ͽƿͿƣ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104106 ]
    // 0d02: bipush 88
    // 0d04: ixor
    // 0d05: dup
    // 0d06: ldc_w 63488
    // 0d09: iand
    // 0d0a: bipush 11
    // 0d0c: ishr
    // 0d0d: swap
    // 0d0e: bipush 5
    // 0d0f: ishl
    // 0d10: ior
    // 0d11: sipush 178
    // 0d14: isub
    // 0d15: sipush 170
    // 0d18: ixor
    // 0d19: dup
    // 0d1a: ldc_w 65408
    // 0d1d: iand
    // 0d1e: bipush 7
    // 0d20: ishr
    // 0d21: swap
    // 0d22: bipush 9
    // 0d24: ishl
    // 0d25: ior
    // 0d26: i2c
    // 0d27: dup
    // 0d28: dup2_x2
    // 0d29: pop2
    // 0d2a: dup2_x2
    // 0d2b: dup2_x1
    // 0d2c: pop2
    // 0d2d: invokedynamic JNT (Ljava/lang/Object;IC)V bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "履ﵟ烈\uf5dfﲟ﹟﨟\uf65f烈", "ͽƿƣͿǉ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104109 ]
    // 0d32: pop
    // 0d33: ldc_w 285908251
    // 0d36: ldc_w -1762389215
    // 0d39: isub
    // 0d3a: bipush 1
    // 0d3b: ior
    // 0d3c: ldc_w -2048383483
    // 0d3f: iand
    // 0d40: iadd
    // 0d41: swap
    // 0d42: goto 013d
    // 0d45: ldc_w -1211224308
    // 0d48: dup
    // 0d49: imul
    // 0d4a: ldc_w 286445352
    // 0d4d: ior
    // 0d4e: ldc_w 1368588079
    // 0d51: iand
    // 0d52: istore 9
    // 0d54: goto 002b
    // 0d57: ldc_w 639165164
    // 0d5a: ldc_w 1014689658
    // 0d5d: ishr
    // 0d5e: ldc_w 1284158474
    // 0d61: ior
    // 0d62: ldc_w 1571535930
    // 0d65: iand
    // 0d66: istore 9
    // 0d68: goto 09b4
    // 0d6b: ldc_w -472357819
    // 0d6e: ldc_w 1270130799
    // 0d71: ishr
    // 0d72: ldc_w -1543402491
    // 0d75: ior
    // 0d76: ldc_w -1517965931
    // 0d79: iand
    // 0d7a: istore 9
    // 0d7c: goto 071f
    // 0d7f: ldc_w -2077861651
    // 0d82: ldc_w -463265183
    // 0d85: ishr
    // 0d86: ldc_w -2130439731
    // 0d89: ior
    // 0d8a: ldc_w -1117447187
    // 0d8d: iand
    // 0d8e: istore 9
    // 0d90: goto 0078
    // 0d93: iload 9
    // 0d95: ldc_w 934946267
    // 0d98: ixor
    // 0d99: ldc_w 268742443
    // 0d9c: isub
    // 0d9d: ldc_w 2089433170
    // 0da0: ixor
    // 0da1: ldc_w 1717660708
    // 0da4: iadd
    // 0da5: ldc_w 70296011
    // 0da8: isub
    // 0da9: ldc_w 422098762
    // 0dac: iadd
    // 0dad: lookupswitch -604 12 -2095534019 -2025 -1698150454 -768 -1417039311 -604 -1356543258 -3170 -262870769 -2069 53455826 -2334 351283959 220 575048662 271 1179356996 -2881 1395195291 507 1765708717 -552 2102498090 -1125
    // 0e18: swap
    // 0e19: ldc_w 214549355
    // 0e1c: ldc_w 1293560844
    // 0e1f: iand
    // 0e20: ldc_w 201850894
    // 0e23: ixor
    // 0e24: dup2
    // 0e25: if_icmpge 0675
    // 0e28: pop
    // 0e29: dup2
    // 0e2a: invokedynamic JNT (Ljava/lang/Object;I)C bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "\ufddfﲟ﹟﨟\uf65f烈", "ͽƿͿƣ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104104 ]
    // 0e2f: bipush 8
    // 0e31: isub
    // 0e32: bipush 84
    // 0e34: isub
    // 0e35: dup
    // 0e36: ldc_w 65520
    // 0e39: iand
    // 0e3a: bipush 4
    // 0e3b: ishr
    // 0e3c: swap
    // 0e3d: bipush 12
    // 0e3f: ishl
    // 0e40: ior
    // 0e41: dup
    // 0e42: ldc_w 65534
    // 0e45: iand
    // 0e46: bipush 1
    // 0e47: ishr
    // 0e48: swap
    // 0e49: bipush 15
    // 0e4b: ishl
    // 0e4c: ior
    // 0e4d: dup
    // 0e4e: ldc_w 65504
    // 0e51: iand
    // 0e52: bipush 5
    // 0e53: ishr
    // 0e54: swap
    // 0e55: bipush 11
    // 0e57: ishl
    // 0e58: ior
    // 0e59: i2c
    // 0e5a: dup
    // 0e5b: dup2_x2
    // 0e5c: pop2
    // 0e5d: dup2_x2
    // 0e5e: dup2_x1
    // 0e5f: pop2
    // 0e60: invokedynamic JNT (Ljava/lang/Object;IC)V bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "履ﵟ烈\uf5dfﲟ﹟﨟\uf65f烈", "ͽƿƣͿǉ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104107 ]
    // 0e65: pop
    // 0e66: ldc_w -1334751420
    // 0e69: ldc_w -2033976058
    // 0e6c: imul
    // 0e6d: bipush 1
    // 0e6e: ior
    // 0e6f: ldc_w -383414173
    // 0e72: iand
    // 0e73: iadd
    // 0e74: swap
    // 0e75: goto 0bfe
    // 0e78: ldc_w 1144167422
    // 0e7b: ldc_w 576577588
    // 0e7e: swap
    // 0e7f: ishr
    // 0e80: ldc_w 55983251
    // 0e83: ixor
    // 0e84: istore 9
    // 0e86: goto 09b4
    // 0e89: aload 1
    // 0e8a: ldc_w 164618253
    // 0e8d: ldc_w 749597926
    // 0e90: isub
    // 0e91: bipush 0
    // 0e92: ior
    // 0e93: ldc_w 13898832
    // 0e96: iand
    // 0e97: ldc_w "ǥǮǬǯǡǚ"
    // 0e9a: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1177502414, "ݠﱟײַﱟ烈۠", "ͽƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳͿǉ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104094 ]
    // 0e9f: checkcast java/lang/StringBuilder
    // 0ea2: goto 0896
    // 0ea5: ldc_w -499997470
    // 0ea8: ldc_w -1612194922
    // 0eab: dup2
    // 0eac: ishr
    // 0ead: isub
    // 0eae: ior
    // 0eaf: ldc_w 67305749
    // 0eb2: ior
    // 0eb3: ldc_w -990936809
    // 0eb6: iand
    // 0eb7: istore 9
    // 0eb9: goto 0a22
    // 0ebc: iload 3
    // 0ebd: ldc_w 1953561953
    // 0ec0: iadd
    // 0ec1: ldc_w 128726395
    // 0ec4: isub
    // 0ec5: ldc_w 801158795
    // 0ec8: isub
    // 0ec9: ldc_w 468424883
    // 0ecc: isub
    // 0ecd: ldc_w 439752591
    // 0ed0: iadd
    // 0ed1: ldc_w 690503438
    // 0ed4: isub
    // 0ed5: lookupswitch -3131 5 304501033 -2341 304501034 -1261 304501035 -868 304501036 -1223 304501037 -1149
    // 0f08: pop2
    // 0f09: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "烈\ufadf\uf1df烈﨟ﱟײַﳟ", "ͽͿƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104097 ]
    // 0f0e: fconst_0
    // 0f0f: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;F)F bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -685398015, "ﭟ寧", "ͽƥțȁǫΛȋ\u0383ǣΛѵțǧΛ̷ǥѷǧѷșȕʳƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳƩͿƩ", "ꂅ\ue084肅", 260104092 ]
    // 0f14: fstore 8
    // 0f16: fload 8
    // 0f18: fconst_0
    // 0f19: fcmpl
    // 0f1a: ifle 011b
    // 0f1d: aload 0
    // 0f1e: fload 4
    // 0f20: fload 5
    // 0f22: fload 6
    // 0f24: fload 7
    // 0f26: fload 8
    // 0f28: fconst_2
    // 0f29: fmul
    // 0f2a: fload 8
    // 0f2c: fconst_2
    // 0f2d: fmul
    // 0f2e: invokedynamic JNT (FFFFFF)Ljava/lang/Object; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1177502414, "ݠﱟײַﱟ烈۠", "ͽƩƩƩƩƩƩͿǉ", "ꂄႄ悅ႄ\ue098ႄ炅䂅\ue098炄傄\uf084킄\ue098₋\uf084傅\ue084䂄₋傄や䂅ႄ\ue084炄삄傄₉䂊䂘悊삄\uf084ႄ䂅", 260104095 ]
    // 0f33: checkcast java/awt/geom/RoundRectangle2D$Float
    // 0f36: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)V bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "ﶟ﨟﹟\uf8df", "ͽƥȑȏȉȏΛȏȋȕΛǃǽȏ̭ѷʳͿǉ", "ꂄႄ悅ႄ\ue098ႄ炅䂅\ue098炊₅ႄ\u0085肄還やゅ₉䂊", 260104098 ]
    // 0f3b: goto 08ff
    // 0f3e: pop2
    // 0f3f: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/String; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "烈\ufadf\uf1df烈﨟ﱟײַﳟ", "ͽͿƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104101 ]
    // 0f44: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Z bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "ﵟ著寧﹟ﮟ履", "ͽƥȑȏȉȏΛǥȏșǫΛǛǡȑѷǣȕʳͿǱ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄", 260104096 ]
    // 0f49: ifeq 09fc
    // 0f4c: bipush 4
    // 0f4d: istore 3
    // 0f4e: goto 09fc
    // 0f51: ldc_w -1664586976
    // 0f54: dup
    // 0f55: iand
    // 0f56: ldc_w -2132393841
    // 0f59: ior
    // 0f5a: ldc_w -1527356769
    // 0f5d: iand
    // 0f5e: istore 9
    // 0f60: goto 0810
    // 0f63: ldc_w 280798806
    // 0f66: dup
    // 0f67: dup
    // 0f68: iadd
    // 0f69: ishl
    // 0f6a: ldc_w 1800907789
    // 0f6d: ixor
    // 0f6e: istore 9
    // 0f70: goto 0810
    // 0f73: iload 9
    // 0f75: ldc_w 458210474
    // 0f78: iadd
    // 0f79: ldc_w 403766777
    // 0f7c: ixor
    // 0f7d: ldc_w 1004486140
    // 0f80: ixor
    // 0f81: ldc_w 1272567923
    // 0f84: iadd
    // 0f85: ldc_w 84370566
    // 0f88: isub
    // 0f89: ldc_w 1836697996
    // 0f8c: iadd
    // 0f8d: lookupswitch -1955 2 -1700541392 -1955 -1258884189 -1309
    // 0fa8: aload 1
    // 0fa9: ldc_w -2050368112
    // 0fac: ldc_w -1367474339
    // 0faf: ior
    // 0fb0: ldc_w -1342308387
    // 0fb3: ixor
    // 0fb4: ldc_w "\ue1d6\ue1b2"
    // 0fb7: invokedynamic JNT (Ljava/lang/Object;)Ljava/lang/Object; bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1177502414, "ݠﱟײַﱟ烈۠", "ͽƥȑȏȉȏΛǥȏșǫΛǃȕȁǿșǫʳͿǉ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104099 ]
    // 0fbc: checkcast java/lang/StringBuilder
    // 0fbf: goto 013d
    // 0fc2: ldc_w 1031652077
    // 0fc5: ldc_w -938578814
    // 0fc8: ixor
    // 0fc9: ldc_w -2000416584
    // 0fcc: ior
    // 0fcd: ldc_w -1729283912
    // 0fd0: iand
    // 0fd1: istore 9
    // 0fd3: goto 0913
    // 0fd6: swap
    // 0fd7: ldc_w 1085346416
    // 0fda: ldc_w -2066182605
    // 0fdd: ldc_w -1738224038
    // 0fe0: imul
    // 0fe1: imul
    // 0fe2: bipush 6
    // 0fe4: ior
    // 0fe5: ldc_w -2013214442
    // 0fe8: iand
    // 0fe9: dup2
    // 0fea: if_icmpge 0017
    // 0fed: pop
    // 0fee: dup2
    // 0fef: invokedynamic JNT (Ljava/lang/Object;I)C bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "\ufddfﲟ﹟﨟\uf65f烈", "ͽƿͿƣ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104054 ]
    // 0ff4: dup
    // 0ff5: ldc_w 65520
    // 0ff8: iand
    // 0ff9: bipush 4
    // 0ffa: ishr
    // 0ffb: swap
    // 0ffc: bipush 12
    // 0ffe: ishl
    // 0fff: ior
    // 1000: bipush 116
    // 1002: isub
    // 1003: bipush 99
    // 1005: iadd
    // 1006: bipush 125
    // 1008: isub
    // 1009: bipush 95
    // 100b: isub
    // 100c: i2c
    // 100d: dup
    // 100e: dup2_x2
    // 100f: pop2
    // 1010: dup2_x2
    // 1011: dup2_x1
    // 1012: pop2
    // 1013: invokedynamic JNT (Ljava/lang/Object;IC)V bsm=znx.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 602612639, "履ﵟ烈\uf5dfﲟ﹟﨟\uf65f烈", "ͽƿƣͿǉ", "ꂄႄ悅ႄ\ue098삄ႄ\ue084炄\ue098る䂅₅還\ue084炄₊傅還삄䂄傄₅", 260104057 ]
    // 1018: pop
    // 1019: ldc_w -1916329733
    // 101c: ldc_w -2008921623
    // 101f: iadd
    // 1020: ldc_w 369715941
    // 1023: ixor
    // 1024: iadd
    // 1025: swap
    // 1026: goto 0660
  }

  public static float mu(Element var0, String var1, float var2) {
    String var3 = /* jnt */;
    return /* jnt */
      ? var2
      : /* jnt */;
  }

  public static Float pls(String var0) {
    int var17 = 1835709827;
    Float var1 = (Float)/* jnt */;
    List var2 = /* jnt */;
    float var3 = 0.0F;
    float var4 = 0.0F;
    float var5 = 0.0F;
    float var6 = 0.0F;
    char var7 = 'M';
    int var8 = 0;

    while (true) {
      var17 = (-315687110 << -315687110 | 1645108755) & 1808793267;

      while (true) {
        switch (var17 - 359993395 - 274696562 - 585429130 + 1327607288 + 893566352 + 1892525443) {
          case -1984953753:
          default:
            return var1;
          case 377939183:
        }

        if (var8 < /* jnt */) {
          char var9;
          if (/* jnt */ instanceof Character var10) {
            var9 = /* jnt */;
            var8++;
          } else {
            var17 = (979364484 ^ -1379070498 | 571034725) & -1359356161;

            char var10000;
            label88:
            while (true) {
              switch (((var17 ^ 251837557) + 1129770030 + 1708794831 + 1913083862 ^ 558589247) + 859869601) {
                case 416894595:
                  if (var7 == 'M') {
                    var10000 = 'L';
                    break label88;
                  }

                  var17 = 221688593 - 470792766 ^ 247011965;
                  break;
                case 831578702:
                  var10000 = var7;
                  break label88;
                case 1574909234:
                default:
                  if (var7 == 'm') {
                    var10000 = 'l';
                    break label88;
                  }

                  var17 = (-966766109 >>> 249706029 | -857718582) & -588646949;
              }
            }

            var9 = var10000;
          }

          var17 = 1755046249 >>> -1180290721 ^ -617499211;

          label102:
          while (true) {
            switch ((var17 - 1342488116 + 1289064373 ^ 143822364) + 643919963 + 147370280 + 569085177) {
              case -1978951773:
                var8++;
                break label102;
              case -1378406684:
                float var40 = /* jnt */;
                float var43 = /* jnt */;
                float var45 = /* jnt */;
                float var47 = /* jnt */;
                var3 = /* jnt */;
                var4 = /* jnt */;
                /* jnt */;
                break label102;
              case -1203226154:
                /* jnt */;
                var3 = var5;
                var4 = var6;
                break label102;
              case -643401550:
                var4 += /* jnt */;
                /* jnt */;
                break label102;
              case 564508582:
                switch ((var9 - 1331895689 ^ 1984268047 ^ 1343830606 ^ 1711554539 ^ 540288859) - 514110769) {
                  case -1303670321:
                  case -1303670289:
                    var17 = (478091680 >> 1756571787 | 1925984773) & 2128573405;
                    continue;
                  case -1303670320:
                  case -1303670305:
                  case -1303670304:
                  case -1303670302:
                  case -1303670301:
                  case -1303670299:
                  case -1303670298:
                  case -1303670297:
                  case -1303670296:
                  case -1303670295:
                  case -1303670294:
                  case -1303670292:
                  case -1303670291:
                  case -1303670290:
                  case -1303670288:
                  case -1303670287:
                  case -1303670286:
                  case -1303670285:
                  case -1303670284:
                  case -1303670283:
                  case -1303670282:
                  case -1303670281:
                  case -1303670279:
                  case -1303670277:
                  case -1303670276:
                  case -1303670274:
                  case -1303670273:
                  case -1303670272:
                  case -1303670270:
                  case -1303670269:
                  case -1303670267:
                  case -1303670266:
                  case -1303670265:
                  case -1303670264:
                  case -1303670263:
                  case -1303670262:
                  case -1303670260:
                  case -1303670259:
                  case -1303670258:
                  case -1303670249:
                  case -1303670247:
                  case -1303670245:
                  case -1303670244:
                  case -1303670242:
                  default:
                    var17 = 1712102465 + -1721649599 ^ -856111304;
                    continue;
                  case -1303670303:
                    var17 = (245097990 * 245097990 | 204217795) & 535633883;
                    continue;
                  case -1303670300:
                    var17 = 1806864137 - 1806864137 ^ 799222996;
                    continue;
                  case -1303670293:
                    var17 = (16330235 >>> -1106994042 | -2093985272) & -1887864087;
                    continue;
                  case -1303670280:
                  case -1303670248:
                    var17 = (-489534287 | 2144529532 | 270812929) & 289200067;
                    continue;
                  case -1303670278:
                    var17 = 984545491 >>> (-1393534837 & 1903024721) ^ 903230983;
                    continue;
                  case -1303670275:
                    var17 = (-602157628 & -602157628 | 1445219208) & -143328277;
                    continue;
                  case -1303670271:
                    var17 = (-369314281 >>> -1961863044 | -740243855) & -134873223;
                    continue;
                  case -1303670268:
                    var17 = -1266499312 - -334459427 * -334459427 ^ -299220585;
                    continue;
                  case -1303670261:
                    var17 = (607635094 * (-338361100 | -822273008) | -1597947628) & -522100908;
                    continue;
                  case -1303670246:
                    var17 = -1578748912 & -100373618 ^ -142205709;
                    continue;
                  case -1303670243:
                    var17 = 150810675 & -1874887536 ^ -558135693;
                    continue;
                }
              case 585620425:
                var3 = /* jnt */;
                var4 = /* jnt */;
                /* jnt */;
                var5 = var3;
                var6 = var4;
                break label102;
              case 618313844:
                var3 = /* jnt */;
                /* jnt */;
                break label102;
              case 638999877:
                var4 = /* jnt */;
                /* jnt */;
                break label102;
              case 691587170:
                var3 = /* jnt */;
                var4 = /* jnt */;
                /* jnt */;
                break label102;
              case 749519313:
                var3 += /* jnt */;
                /* jnt */;
                break label102;
              case 1396969428:
                var3 += /* jnt */;
                var4 += /* jnt */;
                /* jnt */;
                break label102;
              case 1470940634:
                float var39 = /* jnt */;
                float var42 = /* jnt */;
                float var44 = /* jnt */;
                int var46 = (int)/* jnt */;
                int var48 = (int)/* jnt */;
                float var49 = /* jnt */;
                float var16 = /* jnt */;
                if (var9 == 'a') {
                  var49 += var3;
                  var16 += var4;
                }

                boolean var10006 = var46 != 0;
                var17 = 1543977881 << -1772027246 ^ 1236400208;

                boolean var10007;
                label97:
                while (true) {
                  switch ((var17 - 1050350710 ^ 1430928803 ^ 1969725490) - 1829458184 + 1727912925 - 976702858) {
                    case 148028310:
                    default:
                      if (var48 != 0) {
                        var10007 = true;
                        break label97;
                      }

                      var17 = (-580666151 + (-580666151 ^ -580666151) | -1038661966) & -8925257;
                      break;
                    case 1085039863:
                      var10007 = false;
                      break label97;
                  }
                }

                /* jnt */;
                var3 = var49;
                var4 = var16;
                break label102;
              case 1979129541:
              default:
                var3 += /* jnt */;
                var4 += /* jnt */;
                /* jnt */;
                var5 = var3;
                var6 = var4;
                break label102;
              case 2127971439:
                float var38 = var3 + /* jnt */;
                float var41 = var4 + /* jnt */;
                float var12 = var3 + /* jnt */;
                float var13 = var4 + /* jnt */;
                float var14 = /* jnt */;
                float var15 = /* jnt */;
                var3 += var14;
                var4 += var15;
                /* jnt */;
                break label102;
            }
          }

          var7 = var9;
          break;
        }

        var17 = 1898308599 & -492999114 ^ -1120790083;
      }
    }
  }
  public static List gw(String var0) {
    int var7 = -1040186519;
    ArrayList var1 = (ArrayList)/* jnt */;
    int var2 = 0;

    label140:
    while (true) {
      var7 = 1034108410 ^ 54623678 ^ -1901001464;

      while (true) {
        switch (((var7 ^ 1462124720 ^ 144762389) - 590435186 + 8315023 ^ 1366730945) + 2096962328) {
          case 424867039:
            if (var2 < /* jnt */) {
              char var3 = /* jnt */;
              if (!/* jnt */ && var3 != ',') {
                var7 = (-656406807 & -656406807 | 545396005) & 698031405;
              } else {
                var7 = 1171667220 >>> 1696509997 ^ -1607583816;
              }

              while (true) {
                label126:
                switch (((var7 ^ 1918109841 ^ 1794851650 ^ 742644768) + 1177598678 ^ 2134462766) + 1980486692) {
                  case -1817034562:
                    if (!/* jnt */) {
                      var7 = 310818489 * -1754203536 ^ -843500825;
                      continue;
                    }

                    /* jnt */
                    );
                    var2++;
                    break;
                  case -149506701:
                    continue label140;
                  case 466873634:
                    var2++;
                    break;
                  case 916370256:
                    int var4 = var2;
                    if (var3 != '-' && var3 != '+') {
                      var7 = -545269148 + -73563403 ^ -1783670124;
                    } else {
                      var7 = (-250911990 >> 265923481 | 587730945) & -1280806767;
                    }

                    boolean var10000;
                    label118:
                    while (true) {
                      switch ((var7 - 1583509914 + 2084971663 + 56856671 ^ 635550297) + 189486979 ^ 2104617772) {
                        case -2128049645:
                          var2++;
                          var7 = -545269148 + -73563403 ^ -1783670124;
                          break;
                        case -735030250:
                          var10000 = false;
                          break label118;
                        case 672506839:
                        default:
                          if (var3 == '.') {
                            var10000 = true;
                            break label118;
                          }

                          var7 = (463766932 ^ 2060996275 | -1765762918) & -1764581670;
                      }
                    }

                    boolean var5 = var10000;
                    if (var5) {
                      var2++;
                    }

                    label103:
                    while (true) {
                      var7 = (-1934488034 & 699544941 | -733978262) & -714743429;

                      while (true) {
                        switch (((var7 ^ 1627948598) - 2022317710 + 403107195 + 340017171 ^ 337794460) - 1120907163) {
                          case 977007653:
                            if (var2 < /* jnt */) {
                              char var6 = /* jnt */;
                              if (var6 == '.') {
                                if (!var5) {
                                  var5 = true;
                                  var2++;
                                  var7 = -214307928 - -1397615126 * -291542802 ^ -592440601;
                                } else {
                                  var7 = 34490606 * -112946304 ^ 512795533;
                                }
                              } else {
                                var7 = 34490606 * -112946304 ^ 512795533;
                              }

                              label93:
                              while (true) {
                                switch (var7 - 1404790865 - 1965433182 + 1608195750 + 1081309050 + 1090549502 - 646451021) {
                                  case -124586321:
                                    if (!/* jnt */) {
                                      break label93;
                                    }

                                    var2++;
                                    var7 = -214307928 - -1397615126 * -291542802 ^ -592440601;
                                    break;
                                  case 717349661:
                                  default:
                                    continue label103;
                                }
                              }
                            }

                            var7 = (2016787263 - 2016787263 | -1667648078) & -23462473;
                            break;
                          case 1654679421:
                          default:
                            /* jnt */
                                )
                              )
                            );
                            break label126;
                        }
                      }
                    }
                  case 1863876536:
                    if (var3 != '-'
                      && var3 != '+'
                      && var3 != '.'
                      && !/* jnt */) {
                      var7 = -498263615 ^ 1036457398 ^ -648713297;
                    } else {
                      var7 = (2012738409 << -695474710 | 135677151) & 1838564831;
                    }
                    continue;
                  case 2104086099:
                  default:
                    var2++;
                }

                var7 = 902815039 & (902815039 ^ (902815039 | 902815039)) ^ -1930534280;
              }
            }

            var7 = (-1407352687 >>> (-1407352687 >> -249730734) | -531765420) & -437262371;
            break;
          case 1248559844:
          default:
            return var1;
        }
      }
    }
  }

  public static float wwq(List var0, int var1) {
    return var1 < /* jnt */
        && /* jnt */ instanceof Number var2
      ? /* jnt */
      : 0.0F;
  }

  public static float[] ken(String var0) {
    int var6 = -591319610;
    List var1 = /* jnt */;
    float[] var2 = new float[/* jnt */];
    int var3 = 0;

    while (true) {
      var6 = 1719978754 ^ 1168015005 ^ -1481128314;

      while (true) {
        switch ((var6 - 902670904 ^ 882974333) - 824312962 - 1839995894 - 1746571997 + 1878262353) {
          case -1369883202:
            return var2;
          case -477485672:
        }

        if (var3 < /* jnt */) {
          var2[var3] = /* jnt */ instanceof Number var4
            ? /* jnt */
            : 0.0F;
          var3++;
          break;
        }

        var6 = (-225985282 << -225985282 | 666540791) & -1480598793;
      }
    }
  }

  public static void te(Float var0, float var1, float var2, float var3, float var4, float var5, boolean var6, boolean var7, float var8, float var9) {
    int var62 = 2073038613;
    if (var1 != var8 || var2 != var9) {
      var62 = -658575931 * -574123339 ^ 347711909;

      while (true) {
        switch (((var62 ^ 2033800092) - 2120591195 ^ 756923232 ^ 1825419380) + 1654959297 ^ 1183530161) {
          case -1723825831:
            /* jnt */;
            return;
          case 1243719283:
          default:
            if (var3 != 0.0F && var4 != 0.0F) {
              var62 = 1220259035 >>> 1220259035 ^ 1773859798;
            } else {
              var62 = -42092101 - -637818494 ^ -504921557;
            }
            break;
          case 1895406604:
            var3 = /* jnt */;
            var4 = /* jnt */;
            double var10 = /* jnt */var5);
            double var12 = /* jnt */;
            double var14 = /* jnt */;
            double var16 = (double)(var1 - var8) / 2.0;
            double var18 = (double)(var2 - var9) / 2.0;
            double var20 = var12 * var16 + var14 * var18;
            double var22 = -var14 * var16 + var12 * var18;
            double var24 = var20 * var20;
            double var26 = var22 * var22;
            double var28 = (double)var3 * (double)var3;
            double var30 = (double)var4 * (double)var4;
            double var32 = var24 / var28 + var26 / var30;
            if (var32 > 1.0) {
              double var34 = /* jnt */;
              var3 = (float)((double)var3 * var34);
              var4 = (float)((double)var4 * var34);
              var28 = (double)var3 * (double)var3;
              var30 = (double)var4 * (double)var4;
            }

            double var65 = var28 * var30 - var28 * var26 - var30 * var24;
            double var36 = var28 * var26 + var30 * var24;
            double var38 = /* jnt */;
            double var40 = /* jnt */ * (double)(var6 == var7 ? -1 : 1);
            double var42 = var40 * (double)var3 * var22 / (double)var4;
            double var44 = -var40 * (double)var4 * var20 / (double)var3;
            double var46 = var12 * var42 - var14 * var44 + (double)(var1 + var8) / 2.0;
            double var48 = var14 * var42 + var12 * var44 + (double)(var2 + var9) / 2.0;
            double var50 = /* jnt */ / (double)var3, (var22 - var44) / (double)var4
            );
            double var52 = /* jnt */ / (double)var3, (var22 - var44) / (double)var4, (-var20 - var42) / (double)var3, (-var22 - var44) / (double)var4
            );
            if (!var7 && var52 > 0.0) {
              var52 -= Math.PI * 2;
            }

            var62 = -1936950378 >>> -1936950378 ^ -1899126099;

            while (true) {
              switch ((var62 + 1640510962 - 142270969 ^ 1990342877 ^ 2113884993 ^ 258553708) - 316186674) {
                case -648673226:
                default:
                  if (var7 && var52 < 0.0) {
                    var52 += Math.PI * 2;
                  }

                  var62 = -1466533780 + -1502923187 + -292513457 ^ 308464269;
                  break;
                case 2050026076:
                  int var54 = (int)/* jnt */ / (Math.PI / 2)
                  );
                  double var55 = var52 / (double)var54;
                  int var57 = 0;

                  while (true) {
                    var62 = 1067778839 ^ 482506081 - 482506081 ^ -1349136438;

                    while (true) {
                      switch (((var62 - 397766536 ^ 1128767868) + 1934235932 ^ 83266206) - 103459998 - 1817554978) {
                        case -536164929:
                          return;
                        case 938558235:
                      }

                      if (var57 < var54) {
                        double var58 = var50 + (double)var57 * var55;
                        double var60 = var50 + (double)(var57 + 1) * var55;
                        /* jnt */var3, (double)var4, var10, var58, var60
                        );
                        var57++;
                        break;
                      }

                      var62 = 1192389987 << (415700168 >> 415700168) ^ 1847172673;
                    }
                  }
              }
            }
        }
      }
    }
  }

  public static double rom(double var0, double var2, double var4, double var6) {
    double var8 = var0 * var4 + var2 * var6;
    double var10 = /* jnt */
      * /* jnt */;
    double var12 = /* jnt */
      )
    );
    return var0 * var6 - var2 * var4 < 0.0 ? -var12 : var12;
  }

  public static void fl(Float var0, double var1, double var3, double var5, double var7, double var9, double var11, double var13) {
    double var15 = /* jnt */
      * (
        /* jnt */ / 2.0), 2.0
                )
          )
          - 1.0
      )
      / 3.0;
    double var17 = /* jnt */;
    double var19 = /* jnt */;
    double var21 = /* jnt */;
    double var23 = /* jnt */;
    double var25 = /* jnt */;
    double var27 = /* jnt */;
    double var29 = var17 * var5 * var21 - var19 * var7 * var23 + var1;
    double var31 = var19 * var5 * var21 + var17 * var7 * var23 + var3;
    double var33 = var17 * var5 * var25 - var19 * var7 * var27 + var1;
    double var35 = var19 * var5 * var25 + var17 * var7 * var27 + var3;
    double var37 = -var17 * var5 * var23 - var19 * var7 * var21;
    double var39 = -var19 * var5 * var23 + var17 * var7 * var21;
    double var41 = -var17 * var5 * var27 - var19 * var7 * var25;
    double var43 = -var19 * var5 * var27 + var17 * var7 * var25;
    /* jnt */;
  }

  public static class_1011 xl(BufferedImage var0) {
    int var6 = -1783618769;
    int var1 = /* jnt */;
    int var2 = /* jnt */;
    class_1011 var3 = (class_1011)/* jnt */;
    int var4 = 0;

    label42:
    while (true) {
      var6 = -580971267 + -1913125013 ^ -1794726637;

      while (true) {
        switch (((var6 - 97809592 ^ 1705538476) - 942012705 ^ 763256356 ^ 482608570) - 361494672) {
          case 374403764:
          default:
            return var3;
          case 1049193792:
        }

        if (var4 < var2) {
          int var5 = 0;

          while (true) {
            var6 = -903866437 + 1908826292 ^ -772232311;

            while (true) {
              switch ((var6 + 1699904259 - 1516307617 - 312597308 ^ 216853448) - 813887168 - 1274182684) {
                case -1820287229:
                default:
                  var4++;
                  continue label42;
                case 1913461224:
              }

              if (var5 < var1) {
                /* jnt */
                );
                var5++;
                break;
              }

              var6 = 2019096786 >>> 2019096786 ^ 181098727;
            }
          }
        }

        var6 = 1889873727 + -1288669606 ^ 523037334;
      }
    }
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 - 1939454275 + 1784135467 ^ 2009017857) - 438847989 ^ 616089129 ^ 1093863599 ^ 626829676) - 728567084 - 1390901824;
    MethodHandle var10000 = ywr[((var10 - 1939454275 + 1784135467 ^ 2009017857) - 438847989 ^ 616089129 ^ 1093863599 ^ 626829676)
      - 728567084
      - 1390901824
      + 1724228000];
    if (ywr[var10001 + 1724228000] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (-336902959 | 1532277412) ^ -67111179; var23 < var13.length(); var23 += 296212736 ^ -624621366 ^ -882716213) {
        char var42 = var13.charAt(var23);
        char var45 = (char)(
          (
                (((((var42 & '\ufffe') >> 1 | var42 << 15) + 176 & 65534) >> 1 | ((var42 & '\ufffe') >> 1 | var42 << 15) + 176 << 15) & 65520) >> 4
                  | ((((var42 & '\ufffe') >> 1 | var42 << 15) + 176 & 65534) >> 1 | ((var42 & '\ufffe') >> 1 | var42 << 15) + 176 << 15) << 12
              )
              + 82
              + 98
              - 179
              + 191
            ^ 163
            ^ 124
        );
        var13.setCharAt(
          var23,
          (char)(
            (
                  (((((var42 & '\ufffe') >> 1 | var42 << 15) + 176 & 65534) >> 1 | ((var42 & '\ufffe') >> 1 | var42 << 15) + 176 << 15) & 65520) >> 4
                    | ((((var42 & '\ufffe') >> 1 | var42 << 15) + 176 & 65534) >> 1 | ((var42 & '\ufffe') >> 1 | var42 << 15) + 176 << 15) << 12
                )
                + 82
                + 98
                - 179
                + 191
              ^ 163
              ^ 124
          )
        );
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (1846224757 & 443476477 | 0) & 1354009090; var29 < var16.length(); var29 += 1925802192 >>> 585885927 ^ 15045328) {
        int var50 = (var16.charAt(var29) - 156 ^ 146) - 249 - 15 - 140 ^ 183;
        int var83 = (var50 & 57344) >> 13;
        int var51 = (var50 & 57344) >> 13 | var50 << 3;
        int var84 = (((var50 & 57344) >> 13 | var50 << 3) & 65520) >> 4;
        char var52 = (char)((((var83 | var50 << 3) & 65520) >> 4 | ((var50 & 57344) >> 13 | var50 << 3) << 12) + 126 ^ 154);
        var16.setCharAt(var29, (char)((var84 | var51 << 12) + 126 ^ 154));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), znx.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = -2001864772 >>> -318973632 ^ -2001864772; var35 < var19.length(); var35 += (-1176692793 | 1437486026) ^ -33595442) {
        int var57 = var19.charAt(var35) ^ 172;
        char var62 = (char)(
          (
                (
                    (
                          (
                              (((((((var57 & 0) >> 16 | var57 << 0) - 5 & 49152) >> 14 | ((var57 & 0) >> 16 | var57 << 0) - 5 << 2) ^ 160) + 204 ^ 224) & 65532)
                                  >> 2
                                | ((((((var57 & 0) >> 16 | var57 << 0) - 5 & 49152) >> 14 | ((var57 & 0) >> 16 | var57 << 0) - 5 << 2) ^ 160) + 204 ^ 224)
                                  << 14
                            )
                            & 65472
                        )
                        >> 6
                      | (
                          (((((((var57 & 0) >> 16 | var57 << 0) - 5 & 49152) >> 14 | ((var57 & 0) >> 16 | var57 << 0) - 5 << 2) ^ 160) + 204 ^ 224) & 65532)
                              >> 2
                            | ((((((var57 & 0) >> 16 | var57 << 0) - 5 & 49152) >> 14 | ((var57 & 0) >> 16 | var57 << 0) - 5 << 2) ^ 160) + 204 ^ 224) << 14
                        )
                        << 10
                  )
                  & 65472
              )
              >> 6
            | (
                (
                      (
                          (((((((var57 & 0) >> 16 | var57 << 0) - 5 & 49152) >> 14 | ((var57 & 0) >> 16 | var57 << 0) - 5 << 2) ^ 160) + 204 ^ 224) & 65532)
                              >> 2
                            | ((((((var57 & 0) >> 16 | var57 << 0) - 5 & 49152) >> 14 | ((var57 & 0) >> 16 | var57 << 0) - 5 << 2) ^ 160) + 204 ^ 224) << 14
                        )
                        & 65472
                    )
                    >> 6
                  | (
                      (((((((var57 & 0) >> 16 | var57 << 0) - 5 & 49152) >> 14 | ((var57 & 0) >> 16 | var57 << 0) - 5 << 2) ^ 160) + 204 ^ 224) & 65532) >> 2
                        | ((((((var57 & 0) >> 16 | var57 << 0) - 5 & 49152) >> 14 | ((var57 & 0) >> 16 | var57 << 0) - 5 << 2) ^ 160) + 204 ^ 224) << 14
                    )
                    << 10
              )
              << 10
        );
        var19.setCharAt(
          var35,
          (char)(
            (
                  (
                      (
                            (
                                (
                                      ((((((var57 & 0) >> 16 | var57 << 0) - 5 & 49152) >> 14 | ((var57 & 0) >> 16 | var57 << 0) - 5 << 2) ^ 160) + 204 ^ 224)
                                        & 65532
                                    )
                                    >> 2
                                  | ((((((var57 & 0) >> 16 | var57 << 0) - 5 & 49152) >> 14 | ((var57 & 0) >> 16 | var57 << 0) - 5 << 2) ^ 160) + 204 ^ 224)
                                    << 14
                              )
                              & 65472
                          )
                          >> 6
                        | (
                            (((((((var57 & 0) >> 16 | var57 << 0) - 5 & 49152) >> 14 | ((var57 & 0) >> 16 | var57 << 0) - 5 << 2) ^ 160) + 204 ^ 224) & 65532)
                                >> 2
                              | ((((((var57 & 0) >> 16 | var57 << 0) - 5 & 49152) >> 14 | ((var57 & 0) >> 16 | var57 << 0) - 5 << 2) ^ 160) + 204 ^ 224) << 14
                          )
                          << 10
                    )
                    & 65472
                )
                >> 6
              | (
                  (
                        (
                            (((((((var57 & 0) >> 16 | var57 << 0) - 5 & 49152) >> 14 | ((var57 & 0) >> 16 | var57 << 0) - 5 << 2) ^ 160) + 204 ^ 224) & 65532)
                                >> 2
                              | ((((((var57 & 0) >> 16 | var57 << 0) - 5 & 49152) >> 14 | ((var57 & 0) >> 16 | var57 << 0) - 5 << 2) ^ 160) + 204 ^ 224) << 14
                          )
                          & 65472
                      )
                      >> 6
                    | (
                        (((((((var57 & 0) >> 16 | var57 << 0) - 5 & 49152) >> 14 | ((var57 & 0) >> 16 | var57 << 0) - 5 << 2) ^ 160) + 204 ^ 224) & 65532) >> 2
                          | ((((((var57 & 0) >> 16 | var57 << 0) - 5 & 49152) >> 14 | ((var57 & 0) >> 16 | var57 << 0) - 5 << 2) ^ 160) + 204 ^ 224) << 14
                      )
                      << 10
                )
                << 10
          )
        );
      }

      Class var7 = Class.forName(var19.toString(), false, znx.class.getClassLoader());
      switch ((((var4 ^ 2086046867) - 69055876 + 643125537 ^ 1207256971) + 433581897 + 1869277412 + 839373846 ^ 710158184) - 994513205 + 151661140) {
        case 380300539:
          var10000 = var0.findSpecial(var7, var5, var6, znx.class);
          break;
        case 1036070318:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 1066019503:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 1417106303:
        case 2028058412:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    ywr[((var10 - 1939454275 + 1784135467 ^ 2009017857) - 438847989 ^ 616089129 ^ 1093863599 ^ 626829676) - 728567084 - 1390901824 + 1724228000] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (var10 + 107593816 + 1402899686 + 638529055 ^ 228624513) - 910286227 + 1568114958 + 948747695 - 1652004684 - 865387120;
    MethodHandle var10000 = ywr[(var10 + 107593816 + 1402899686 + 638529055 ^ 228624513) - 910286227 + 1568114958 + 948747695 - 1652004684 - 865387120
      ^ 184298552];
    if (ywr[var10001 ^ 184298552] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = -1211929172 << 1171522331 ^ 1610612736; var24 < var14.length(); var24 += 1089806159 >>> -1229143975 ^ 33) {
        int var43 = (var14.charAt(var24) + 'U' - 6 ^ 152 ^ 184 ^ 250) + 78 + 97;
        int var10004 = (var43 & 61440) >> 12;
        int var44 = ((var43 & 61440) >> 12 | var43 << 4) + 157;
        int var82 = (((var43 & 61440) >> 12 | var43 << 4) + 157 & 0) >> 16;
        char var45 = (char)(((var10004 | var43 << 4) + 157 & 0) >> 16 | ((var43 & 61440) >> 12 | var43 << 4) + 157 << 0);
        var14.setCharAt(var24, (char)(var82 | var44 << 0));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = 1170282035 << 713007690 ^ 72928256; var30 < var17.length(); var30 += (-288970265 << -2115338646 | 1) & -532659941) {
        char var50 = var17.charAt(var30);
        char var55 = (char)(
          (
              (
                    (
                        (
                            (
                                  (
                                        ((((((var50 & '쀀') >> 14 | var50 << 2) ^ 86) & 65408) >> 7 | (((var50 & '쀀') >> 14 | var50 << 2) ^ 86) << 9) - 222 & 0)
                                            >> 16
                                          | (((((var50 & '쀀') >> 14 | var50 << 2) ^ 86) & 65408) >> 7 | (((var50 & '쀀') >> 14 | var50 << 2) ^ 86) << 9) - 222
                                            << 0
                                      )
                                      - 96
                                    & 65504
                                )
                                >> 5
                              | (
                                    ((((((var50 & '쀀') >> 14 | var50 << 2) ^ 86) & 65408) >> 7 | (((var50 & '쀀') >> 14 | var50 << 2) ^ 86) << 9) - 222 & 0)
                                        >> 16
                                      | (((((var50 & '쀀') >> 14 | var50 << 2) ^ 86) & 65408) >> 7 | (((var50 & '쀀') >> 14 | var50 << 2) ^ 86) << 9) - 222 << 0
                                  )
                                  - 96
                                << 11
                          )
                          ^ 221
                      )
                      & 32768
                  )
                  >> 15
                | (
                    (
                        (
                              (
                                    ((((((var50 & '쀀') >> 14 | var50 << 2) ^ 86) & 65408) >> 7 | (((var50 & '쀀') >> 14 | var50 << 2) ^ 86) << 9) - 222 & 0)
                                        >> 16
                                      | (((((var50 & '쀀') >> 14 | var50 << 2) ^ 86) & 65408) >> 7 | (((var50 & '쀀') >> 14 | var50 << 2) ^ 86) << 9) - 222 << 0
                                  )
                                  - 96
                                & 65504
                            )
                            >> 5
                          | (
                                ((((((var50 & '쀀') >> 14 | var50 << 2) ^ 86) & 65408) >> 7 | (((var50 & '쀀') >> 14 | var50 << 2) ^ 86) << 9) - 222 & 0) >> 16
                                  | (((((var50 & '쀀') >> 14 | var50 << 2) ^ 86) & 65408) >> 7 | (((var50 & '쀀') >> 14 | var50 << 2) ^ 86) << 9) - 222 << 0
                              )
                              - 96
                            << 11
                      )
                      ^ 221
                  )
                  << 1
            )
            - 94
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
                                                (((((var50 & '쀀') >> 14 | var50 << 2) ^ 86) & 65408) >> 7 | (((var50 & '쀀') >> 14 | var50 << 2) ^ 86) << 9)
                                                    - 222
                                                  & 0
                                              )
                                              >> 16
                                            | (((((var50 & '쀀') >> 14 | var50 << 2) ^ 86) & 65408) >> 7 | (((var50 & '쀀') >> 14 | var50 << 2) ^ 86) << 9) - 222
                                              << 0
                                        )
                                        - 96
                                      & 65504
                                  )
                                  >> 5
                                | (
                                      ((((((var50 & '쀀') >> 14 | var50 << 2) ^ 86) & 65408) >> 7 | (((var50 & '쀀') >> 14 | var50 << 2) ^ 86) << 9) - 222 & 0)
                                          >> 16
                                        | (((((var50 & '쀀') >> 14 | var50 << 2) ^ 86) & 65408) >> 7 | (((var50 & '쀀') >> 14 | var50 << 2) ^ 86) << 9) - 222
                                          << 0
                                    )
                                    - 96
                                  << 11
                            )
                            ^ 221
                        )
                        & 32768
                    )
                    >> 15
                  | (
                      (
                          (
                                (
                                      ((((((var50 & '쀀') >> 14 | var50 << 2) ^ 86) & 65408) >> 7 | (((var50 & '쀀') >> 14 | var50 << 2) ^ 86) << 9) - 222 & 0)
                                          >> 16
                                        | (((((var50 & '쀀') >> 14 | var50 << 2) ^ 86) & 65408) >> 7 | (((var50 & '쀀') >> 14 | var50 << 2) ^ 86) << 9) - 222
                                          << 0
                                    )
                                    - 96
                                  & 65504
                              )
                              >> 5
                            | (
                                  ((((((var50 & '쀀') >> 14 | var50 << 2) ^ 86) & 65408) >> 7 | (((var50 & '쀀') >> 14 | var50 << 2) ^ 86) << 9) - 222 & 0) >> 16
                                    | (((((var50 & '쀀') >> 14 | var50 << 2) ^ 86) & 65408) >> 7 | (((var50 & '쀀') >> 14 | var50 << 2) ^ 86) << 9) - 222 << 0
                                )
                                - 96
                              << 11
                        )
                        ^ 221
                    )
                    << 1
              )
              - 94
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, znx.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (-962022797 >> -887293120 | 0) & 554782092; var36 < var20.length(); var36 += 557813760 & 1064387853 ^ 556859393) {
        int var60 = var20.charAt(var36) - 157;
        char var63 = (char)(
          (
                (((((((var60 & 65534) >> 1 | var60 << 15) ^ 129) & 65472) >> 6 | (((var60 & 65534) >> 1 | var60 << 15) ^ 129) << 10) ^ 155) + 238 ^ 245)
                    + 80
                    - 167
                  & 32768
              )
              >> 15
            | (((((((var60 & 65534) >> 1 | var60 << 15) ^ 129) & 65472) >> 6 | (((var60 & 65534) >> 1 | var60 << 15) ^ 129) << 10) ^ 155) + 238 ^ 245)
                + 80
                - 167
              << 1
        );
        var20.setCharAt(
          var36,
          (char)(
            (
                  (((((((var60 & 65534) >> 1 | var60 << 15) ^ 129) & 65472) >> 6 | (((var60 & 65534) >> 1 | var60 << 15) ^ 129) << 10) ^ 155) + 238 ^ 245)
                      + 80
                      - 167
                    & 32768
                )
                >> 15
              | (((((((var60 & 65534) >> 1 | var60 << 15) ^ 129) & 65472) >> 6 | (((var60 & 65534) >> 1 | var60 << 15) ^ 129) << 10) ^ 155) + 238 ^ 245)
                  + 80
                  - 167
                << 1
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), znx.class.getClassLoader()).returnType();
      switch (((var4 + 1578467119 ^ 2089614994 ^ 1807843785) - 1145692795 ^ 1238595037 ^ 1137951189 ^ 1169545057) - 738404835 + 1771727279 + 363983536) {
        case 709609207:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 961338536:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1687863559:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1936091732:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      ywr[(var10 + 107593816 + 1402899686 + 638529055 ^ 228624513) - 910286227 + 1568114958 + 948747695 - 1652004684 - 865387120 ^ 184298552] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
