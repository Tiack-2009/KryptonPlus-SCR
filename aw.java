// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

// $VF: synthetic class
public class aw {
  public static final MethodHandle[] eut;
  static {
    // $VF: Couldn't be decompiled
    // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
    // java.lang.RuntimeException: parsing failure!
    //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
    //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
    //
    // Bytecode:
    // 000: ldc -444955534
    // 002: ldc 1345932726
    // 004: ixor
    // 005: bipush 3
    // 006: ior
    // 007: ldc 9183783
    // 009: iand
    // 00a: anewarray 23
    // 00d: putstatic aw.eut [Ljava/lang/invoke/MethodHandle;
    // 010: goto 073
    // 013: ldc -1803023816
    // 015: ldc -1083699128
    // 017: imul
    // 018: ldc 1611711817
    // 01a: ixor
    // 01b: istore 1
    // 01c: goto 088
    // 01f: invokedynamic JNT ()[I bsm=aw.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1587126365, "ꭴꮐ겜", "\ud875\ue675", "\ue10cℍꄙℕ", 1866840588 ]
    // 024: invokedynamic JNT ()Lcom/mojang/blaze3d/textures/TextureFormat; bsm=aw.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1587126365, "ꭔꯘ갔감ꮜ", "\uda75\ude75\udc75鵵\udc75\ude75\ue175\ud875\udd75홵鵵\ud975\udb75\ud875\uf175푵ꩵ퍵鵵\ue375푵\uef75\ue375\ue475\ue975푵\uea75鵵͵푵\uef75\ue375\ue475\ue975푵\uf575\ude75\ue975\udc75\ud875\ue375", "\ue10cℍ\ue115ꄛꄞ℞ꄎ℞ꄞ愝ℛ愞ꄜꄎ愛\ue11dℛ愡ℜꄏ\ue11bꄎ\ue11fℜ\ue120\ue11f℠感ℜꄟꄎ\ue117ℜ\ue120\ue11f℠感ℜ愔ꄞ感℞ℛ\ue11fꄑ", 1866840671 ]
    // 029: invokedynamic JNT (Ljava/lang/Object;)I bsm=aw.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1630211759, "뱤졤遤ꑤ롤葤끤", "\uf204\uf244梅", "\u0ee7ၧႧࣇႧၧ၇༧Ⴧཧࣇཇဇ༧ቇྦྷࣧ༇ࣇᄇྦྷᆇᄇᆧᅇྦྷყࣇഇྦྷᆇᄇᆧᅇྦྷேၧᅇႧ༧ᄇ", 1527973275 ]
    // 02e: bipush 1
    // 02f: iastore
    // 030: goto 036
    // 033: goto 045
    // 036: ldc 1979730426
    // 038: ldc 646845206
    // 03a: iadd
    // 03b: ldc 65020059
    // 03d: ior
    // 03e: ldc 602681051
    // 040: iand
    // 041: istore 1
    // 042: goto 088
    // 045: ldc 871178973
    // 047: ldc 1093686248
    // 049: iushr
    // 04a: ldc -343497102
    // 04c: ixor
    // 04d: istore 1
    // 04e: goto 0c9
    // 051: goto 079
    // 054: invokedynamic JNT ()[I bsm=aw.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1587126365, "ꭴꮐ겜", "\ud875\ue675", "\ue10cℍꄙℕ", 1866840673 ]
    // 059: invokedynamic JNT ()Lcom/mojang/blaze3d/textures/TextureFormat; bsm=aw.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1587126365, "ꭔꯠ갌ꮜ", "\uda75\ude75\udc75鵵\udc75\ude75\ue175\ud875\udd75홵鵵\ud975\udb75\ud875\uf175푵ꩵ퍵鵵\ue375푵\uef75\ue375\ue475\ue975푵\uea75鵵͵푵\uef75\ue375\ue475\ue975푵\uf575\ude75\ue975\udc75\ud875\ue375", "\ue10cℍ\ue115ꄛꄞ℞ꄎ℞ꄞ愝ℛ愞ꄜꄎ愛\ue11dℛ愡ℜꄏ\ue11bꄎ\ue11fℜ\ue120\ue11f℠感ℜꄟꄎ\ue117ℜ\ue120\ue11f℠感ℜ愔ꄞ感℞ℛ\ue11fꄑ", 1866840672 ]
    // 05e: invokedynamic JNT (Ljava/lang/Object;)I bsm=aw.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1630211759, "뱤졤遤ꑤ롤葤끤", "\uf204\uf244梅", "\u0ee7ၧႧࣇႧၧ၇༧Ⴧཧࣇཇဇ༧ቇྦྷࣧ༇ࣇᄇྦྷᆇᄇᆧᅇྦྷყࣇഇྦྷᆇᄇᆧᅇྦྷேၧᅇႧ༧ᄇ", 1527973248 ]
    // 063: bipush 2
    // 064: iastore
    // 065: goto 068
    // 068: ldc 30660313
    // 06a: dup
    // 06b: ixor
    // 06c: ldc 2127738454
    // 06e: ixor
    // 06f: istore 1
    // 070: goto 0c9
    // 073: ldc 2136818221
    // 075: istore 1
    // 076: goto 0b8
    // 079: ldc 143450789
    // 07b: ldc -887806998
    // 07d: ixor
    // 07e: ldc 33692320
    // 080: ior
    // 081: ldc 1651187381
    // 083: iand
    // 084: istore 1
    // 085: goto 0c9
    // 088: iload 1
    // 089: ldc 121692164
    // 08b: iadd
    // 08c: ldc 258715830
    // 08e: isub
    // 08f: ldc 55844724
    // 091: ixor
    // 092: ldc 268669924
    // 094: isub
    // 095: ldc 592194613
    // 097: ixor
    // 098: ldc 1295355041
    // 09a: iadd
    // 09b: lookupswitch -124 2 420686125 -104 1791359787 -124
    // 0b4: astore 0
    // 0b5: goto 045
    // 0b8: invokedynamic JNT ()[Lcom/mojang/blaze3d/textures/TextureFormat; bsm=aw.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1317579927, "\ud864葤끤푤鑤챤", "\uf204\uf244ﻄﬄӅυͅ\uf3c4ͅυʅх΅ׅ\uf3c4҅̅хڅՅ\uf8c4ԅ\uf3c4अՅ\u0605अॅࢅՅࣅ\uf3c4ąՅ\u0605अॅࢅՅﶄυࢅͅхअ\uf6c4", "\u0ee7ၧႧࣇႧၧ၇༧Ⴧཧࣇཇဇ༧ቇྦྷࣧ༇ࣇᄇྦྷᆇᄇᆧᅇྦྷყࣇഇྦྷᆇᄇᆧᅇྦྷேၧᅇႧ༧ᄇ", 1527973247 ]
    // 0bd: checkcast [Lcom/mojang/blaze3d/textures/TextureFormat;
    // 0c0: arraylength
    // 0c1: newarray 10
    // 0c3: putstatic aw.jax [I
    // 0c6: goto 013
    // 0c9: iload 1
    // 0ca: ldc 963894680
    // 0cc: ixor
    // 0cd: ldc 598381575
    // 0cf: isub
    // 0d0: ldc 2134229381
    // 0d2: iadd
    // 0d3: ldc 1110163792
    // 0d5: isub
    // 0d6: ldc 1864611802
    // 0d8: iadd
    // 0d9: ldc 689810998
    // 0db: ixor
    // 0dc: lookupswitch -139 3 -113696288 -139 719734131 40 1918112998 -136
    // 100: astore 0
    // 101: goto 079
    // 104: return
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (var10 + 193330259 ^ 1423450106 ^ 497983145 ^ 438205855) + 563300247 - 9409967 + 1311812376 - 718895221 ^ 1414616717;
    MethodHandle var10000 = eut[(var10 + 193330259 ^ 1423450106 ^ 497983145 ^ 438205855) + 563300247 - 9409967 + 1311812376 - 718895221
      ^ 1414616717
      ^ 773699362];
    if (eut[var10001 ^ 773699362] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = 750038299 & 1922240766 ^ 546308122; var23 < var13.length(); var23 += (253894592 | 1170433485 | 1) & -2146959359) {
        int var42 = var13.charAt(var23) + 27 - 175;
        char var47 = (char)(
          (
                (
                    (
                          (
                              (
                                    ((((((var42 & 57344) >> 13 | var42 << 3) ^ 102) & 65534) >> 1 | (((var42 & 57344) >> 13 | var42 << 3) ^ 102) << 15) ^ 231)
                                        + 112
                                      & 65408
                                  )
                                  >> 7
                                | ((((((var42 & 57344) >> 13 | var42 << 3) ^ 102) & 65534) >> 1 | (((var42 & 57344) >> 13 | var42 << 3) ^ 102) << 15) ^ 231)
                                    + 112
                                  << 9
                            )
                            & 49152
                        )
                        >> 14
                      | (
                          (
                                ((((((var42 & 57344) >> 13 | var42 << 3) ^ 102) & 65534) >> 1 | (((var42 & 57344) >> 13 | var42 << 3) ^ 102) << 15) ^ 231)
                                    + 112
                                  & 65408
                              )
                              >> 7
                            | ((((((var42 & 57344) >> 13 | var42 << 3) ^ 102) & 65534) >> 1 | (((var42 & 57344) >> 13 | var42 << 3) ^ 102) << 15) ^ 231) + 112
                              << 9
                        )
                        << 2
                  )
                  & 65408
              )
              >> 7
            | (
                (
                      (
                          (
                                ((((((var42 & 57344) >> 13 | var42 << 3) ^ 102) & 65534) >> 1 | (((var42 & 57344) >> 13 | var42 << 3) ^ 102) << 15) ^ 231)
                                    + 112
                                  & 65408
                              )
                              >> 7
                            | ((((((var42 & 57344) >> 13 | var42 << 3) ^ 102) & 65534) >> 1 | (((var42 & 57344) >> 13 | var42 << 3) ^ 102) << 15) ^ 231) + 112
                              << 9
                        )
                        & 49152
                    )
                    >> 14
                  | (
                      (((((((var42 & 57344) >> 13 | var42 << 3) ^ 102) & 65534) >> 1 | (((var42 & 57344) >> 13 | var42 << 3) ^ 102) << 15) ^ 231) + 112 & 65408)
                          >> 7
                        | ((((((var42 & 57344) >> 13 | var42 << 3) ^ 102) & 65534) >> 1 | (((var42 & 57344) >> 13 | var42 << 3) ^ 102) << 15) ^ 231) + 112 << 9
                    )
                    << 2
              )
              << 9
        );
        var13.setCharAt(
          var23,
          (char)(
            (
                  (
                      (
                            (
                                (
                                      ((((((var42 & 57344) >> 13 | var42 << 3) ^ 102) & 65534) >> 1 | (((var42 & 57344) >> 13 | var42 << 3) ^ 102) << 15) ^ 231)
                                          + 112
                                        & 65408
                                    )
                                    >> 7
                                  | ((((((var42 & 57344) >> 13 | var42 << 3) ^ 102) & 65534) >> 1 | (((var42 & 57344) >> 13 | var42 << 3) ^ 102) << 15) ^ 231)
                                      + 112
                                    << 9
                              )
                              & 49152
                          )
                          >> 14
                        | (
                            (
                                  ((((((var42 & 57344) >> 13 | var42 << 3) ^ 102) & 65534) >> 1 | (((var42 & 57344) >> 13 | var42 << 3) ^ 102) << 15) ^ 231)
                                      + 112
                                    & 65408
                                )
                                >> 7
                              | ((((((var42 & 57344) >> 13 | var42 << 3) ^ 102) & 65534) >> 1 | (((var42 & 57344) >> 13 | var42 << 3) ^ 102) << 15) ^ 231)
                                  + 112
                                << 9
                          )
                          << 2
                    )
                    & 65408
                )
                >> 7
              | (
                  (
                        (
                            (
                                  ((((((var42 & 57344) >> 13 | var42 << 3) ^ 102) & 65534) >> 1 | (((var42 & 57344) >> 13 | var42 << 3) ^ 102) << 15) ^ 231)
                                      + 112
                                    & 65408
                                )
                                >> 7
                              | ((((((var42 & 57344) >> 13 | var42 << 3) ^ 102) & 65534) >> 1 | (((var42 & 57344) >> 13 | var42 << 3) ^ 102) << 15) ^ 231)
                                  + 112
                                << 9
                          )
                          & 49152
                      )
                      >> 14
                    | (
                        (
                              ((((((var42 & 57344) >> 13 | var42 << 3) ^ 102) & 65534) >> 1 | (((var42 & 57344) >> 13 | var42 << 3) ^ 102) << 15) ^ 231) + 112
                                & 65408
                            )
                            >> 7
                          | ((((((var42 & 57344) >> 13 | var42 << 3) ^ 102) & 65534) >> 1 | (((var42 & 57344) >> 13 | var42 << 3) ^ 102) << 15) ^ 231) + 112
                            << 9
                      )
                      << 2
                )
                << 9
          )
        );
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = -1113124870 & 1180604326 ^ 67504034; var29 < var16.length(); var29 += -208730563 ^ 550545898 ^ -748703786) {
        int var52 = var16.charAt(var29) + 'r' - 181;
        int var89 = (var52 & 49152) >> 14;
        int var53 = (var52 & 49152) >> 14 | var52 << 2;
        int var90 = (((var52 & 49152) >> 14 | var52 << 2) & 63488) >> 11;
        var52 = ((var89 | var52 << 2) & 63488) >> 11 | ((var52 & 49152) >> 14 | var52 << 2) << 5;
        var89 = ((var90 | var53 << 5) & 65535) >> 0;
        int var55 = (((var90 | var53 << 5) & 65535) >> 0 | var52 << 16) - 82 - 120;
        int var92 = ((((var90 | var53 << 5) & 65535) >> 0 | var52 << 16) - 82 - 120 & 57344) >> 13;
        char var56 = (char)(
          (((var89 | var52 << 16) - 82 - 120 & 57344) >> 13 | (((var90 | var53 << 5) & 65535) >> 0 | var52 << 16) - 82 - 120 << 3) - 215 ^ 136
        );
        var16.setCharAt(var29, (char)((var92 | var55 << 3) - 215 ^ 136));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), aw.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = 408227706 >> 408227706 ^ 6; var35 < var19.length(); var35 += -1135648224 * -1135648224 ^ -1252228095) {
        int var61 = var19.charAt(var35) - 127 - 202 ^ 66;
        char var64 = (char)(
          (((((var61 & 0) >> 16 | var61 << 0) - 209 & 0) >> 16 | ((var61 & 0) >> 16 | var61 << 0) - 209 << 0) + 50 - 221 - 0 & 65504) >> 5
            | ((((var61 & 0) >> 16 | var61 << 0) - 209 & 0) >> 16 | ((var61 & 0) >> 16 | var61 << 0) - 209 << 0) + 50 - 221 - 0 << 11
        );
        var19.setCharAt(
          var35,
          (char)(
            (((((var61 & 0) >> 16 | var61 << 0) - 209 & 0) >> 16 | ((var61 & 0) >> 16 | var61 << 0) - 209 << 0) + 50 - 221 - 0 & 65504) >> 5
              | ((((var61 & 0) >> 16 | var61 << 0) - 209 & 0) >> 16 | ((var61 & 0) >> 16 | var61 << 0) - 209 << 0) + 50 - 221 - 0 << 11
          )
        );
      }

      Class var7 = Class.forName(var19.toString(), false, aw.class.getClassLoader());
      switch ((var4 + 341656416 - 1128928380 - 1706667640 + 325027801 + 1891991051 + 897850599 + 132932633 ^ 1903406141) + 703716412 + 1149014482) {
        case 56468096:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 1181045210:
        case 1842882512:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1517566148:
          var10000 = var0.findSpecial(var7, var5, var6, aw.class);
          break;
        case 2020773352:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    eut[(var10 + 193330259 ^ 1423450106 ^ 497983145 ^ 438205855) + 563300247 - 9409967 + 1311812376 - 718895221 ^ 1414616717 ^ 773699362] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (var10 - 1531015284 - 1623282562 ^ 2079405737) - 108722285 + 611899432 - 300184525 + 1731909913 + 10938044 + 174369892;
    MethodHandle var10000 = eut[(var10 - 1531015284 - 1623282562 ^ 2079405737)
      - 108722285
      + 611899432
      - 300184525
      + 1731909913
      + 10938044
      + 174369892
      - 1192466662];
    if (eut[var10001 - 1192466662] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (-460678202 << 1363681971 | 0) & 554156984; var24 < var14.length(); var24 += 615803553 + -1076481107 ^ -460677553) {
        char var43 = var14.charAt(var24);
        char var48 = (char)(
          (
                (
                      (
                            (
                                (
                                      (
                                            ((((var43 & '\uf800') >> 11 | var43 << 5) & 65532) >> 2 | ((var43 & '\uf800') >> 11 | var43 << 5) << 14) + 158 + 45
                                              & 65472
                                          )
                                          >> 6
                                        | ((((var43 & '\uf800') >> 11 | var43 << 5) & 65532) >> 2 | ((var43 & '\uf800') >> 11 | var43 << 5) << 14) + 158 + 45
                                          << 10
                                    )
                                    - 166
                                  ^ 149
                              )
                              & 49152
                          )
                          >> 14
                        | (
                            (
                                  (((((var43 & '\uf800') >> 11 | var43 << 5) & 65532) >> 2 | ((var43 & '\uf800') >> 11 | var43 << 5) << 14) + 158 + 45 & 65472)
                                      >> 6
                                    | ((((var43 & '\uf800') >> 11 | var43 << 5) & 65532) >> 2 | ((var43 & '\uf800') >> 11 | var43 << 5) << 14) + 158 + 45 << 10
                                )
                                - 166
                              ^ 149
                          )
                          << 2
                    )
                    - 167
                  & 65534
              )
              >> 1
            | (
                  (
                        (
                            (
                                  (((((var43 & '\uf800') >> 11 | var43 << 5) & 65532) >> 2 | ((var43 & '\uf800') >> 11 | var43 << 5) << 14) + 158 + 45 & 65472)
                                      >> 6
                                    | ((((var43 & '\uf800') >> 11 | var43 << 5) & 65532) >> 2 | ((var43 & '\uf800') >> 11 | var43 << 5) << 14) + 158 + 45 << 10
                                )
                                - 166
                              ^ 149
                          )
                          & 49152
                      )
                      >> 14
                    | (
                        (
                              (((((var43 & '\uf800') >> 11 | var43 << 5) & 65532) >> 2 | ((var43 & '\uf800') >> 11 | var43 << 5) << 14) + 158 + 45 & 65472)
                                  >> 6
                                | ((((var43 & '\uf800') >> 11 | var43 << 5) & 65532) >> 2 | ((var43 & '\uf800') >> 11 | var43 << 5) << 14) + 158 + 45 << 10
                            )
                            - 166
                          ^ 149
                      )
                      << 2
                )
                - 167
              << 15
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
                                              ((((var43 & '\uf800') >> 11 | var43 << 5) & 65532) >> 2 | ((var43 & '\uf800') >> 11 | var43 << 5) << 14)
                                                  + 158
                                                  + 45
                                                & 65472
                                            )
                                            >> 6
                                          | ((((var43 & '\uf800') >> 11 | var43 << 5) & 65532) >> 2 | ((var43 & '\uf800') >> 11 | var43 << 5) << 14) + 158 + 45
                                            << 10
                                      )
                                      - 166
                                    ^ 149
                                )
                                & 49152
                            )
                            >> 14
                          | (
                              (
                                    (
                                          ((((var43 & '\uf800') >> 11 | var43 << 5) & 65532) >> 2 | ((var43 & '\uf800') >> 11 | var43 << 5) << 14) + 158 + 45
                                            & 65472
                                        )
                                        >> 6
                                      | ((((var43 & '\uf800') >> 11 | var43 << 5) & 65532) >> 2 | ((var43 & '\uf800') >> 11 | var43 << 5) << 14) + 158 + 45
                                        << 10
                                  )
                                  - 166
                                ^ 149
                            )
                            << 2
                      )
                      - 167
                    & 65534
                )
                >> 1
              | (
                    (
                          (
                              (
                                    (
                                          ((((var43 & '\uf800') >> 11 | var43 << 5) & 65532) >> 2 | ((var43 & '\uf800') >> 11 | var43 << 5) << 14) + 158 + 45
                                            & 65472
                                        )
                                        >> 6
                                      | ((((var43 & '\uf800') >> 11 | var43 << 5) & 65532) >> 2 | ((var43 & '\uf800') >> 11 | var43 << 5) << 14) + 158 + 45
                                        << 10
                                  )
                                  - 166
                                ^ 149
                            )
                            & 49152
                        )
                        >> 14
                      | (
                          (
                                (((((var43 & '\uf800') >> 11 | var43 << 5) & 65532) >> 2 | ((var43 & '\uf800') >> 11 | var43 << 5) << 14) + 158 + 45 & 65472)
                                    >> 6
                                  | ((((var43 & '\uf800') >> 11 | var43 << 5) & 65532) >> 2 | ((var43 & '\uf800') >> 11 | var43 << 5) << 14) + 158 + 45 << 10
                              )
                              - 166
                            ^ 149
                        )
                        << 2
                  )
                  - 167
                << 15
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = -1293581818 & -1378887792 ^ -1597668864; var30 < var17.length(); var30 += -1348960634 + -1788824313 ^ 1157182348) {
        int var53 = var17.charAt(var30) - 213 ^ 238 ^ 177;
        char var56 = (char)(
          (
              ((((((var53 & 65520) >> 4 | var53 << 12) & 65520) >> 4 | ((var53 & 65520) >> 4 | var53 << 12) << 12) ^ 97 ^ 30) + 146 & 65535) >> 0
                | (((((var53 & 65520) >> 4 | var53 << 12) & 65520) >> 4 | ((var53 & 65520) >> 4 | var53 << 12) << 12) ^ 97 ^ 30) + 146 << 16
            )
            ^ 91
        );
        var17.setCharAt(
          var30,
          (char)(
            (
                ((((((var53 & 65520) >> 4 | var53 << 12) & 65520) >> 4 | ((var53 & 65520) >> 4 | var53 << 12) << 12) ^ 97 ^ 30) + 146 & 65535) >> 0
                  | (((((var53 & 65520) >> 4 | var53 << 12) & 65520) >> 4 | ((var53 & 65520) >> 4 | var53 << 12) << 12) ^ 97 ^ 30) + 146 << 16
              )
              ^ 91
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, aw.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = 645797804 >>> 204541584 ^ 9854; var36 < var20.length(); var36 += (-1496141485 + -1672711567 | 1) & -1260349413) {
        int var61 = var20.charAt(var36);
        int var93 = (var61 & 0) >> 16;
        int var62 = ((var61 & 0) >> 16 | var61 << 0) - 228 - 15;
        int var94 = (((var61 & 0) >> 16 | var61 << 0) - 228 - 15 & 57344) >> 13;
        var61 = (((var93 | var61 << 0) - 228 - 15 & 57344) >> 13 | ((var61 & 0) >> 16 | var61 << 0) - 228 - 15 << 3) + 63 + 145 + 45;
        var93 = ((var94 | var62 << 3) + 63 + 145 + 45 & 65528) >> 3;
        int var64 = ((var94 | var62 << 3) + 63 + 145 + 45 & 65528) >> 3 | var61 << 13;
        int var96 = ((((var94 | var62 << 3) + 63 + 145 + 45 & 65528) >> 3 | var61 << 13) & 49152) >> 14;
        char var65 = (char)((((var93 | var61 << 13) & 49152) >> 14 | (((var94 | var62 << 3) + 63 + 145 + 45 & 65528) >> 3 | var61 << 13) << 2) - 190);
        var20.setCharAt(var36, (char)((var96 | var64 << 2) - 190));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), aw.class.getClassLoader()).returnType();
      switch (((var4 + 632044839 - 271967710 ^ 599715404) - 154508053 ^ 1597737454) - 144485238 + 1902016087 - 1761591328 + 1372427994 ^ 387593500) {
        case 420605374:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 868016924:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1848212275:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 2104724765:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      eut[(var10 - 1531015284 - 1623282562 ^ 2079405737) - 108722285 + 611899432 - 300184525 + 1731909913 + 10938044 + 174369892 - 1192466662] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
