// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

// $VF: synthetic class
public class mup {
  public static final MethodHandle[] nyb;
  static {
    // $VF: Couldn't be decompiled
    // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
    // java.lang.RuntimeException: parsing failure!
    //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
    //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
    //
    // Bytecode:
    // 000: ldc 341895928
    // 002: ldc 1686584973
    // 004: iadd
    // 005: bipush 2
    // 006: ior
    // 007: ldc -2062352313
    // 009: iand
    // 00a: anewarray 23
    // 00d: putstatic mup.nyb [Ljava/lang/invoke/MethodHandle;
    // 010: goto 0a4
    // 013: ldc 1041371084
    // 015: ldc -1757816476
    // 017: dup_x1
    // 018: ishr
    // 019: imul
    // 01a: ldc -1572002772
    // 01c: ior
    // 01d: ldc -1209162626
    // 01f: iand
    // 020: istore 1
    // 021: goto 078
    // 024: goto 046
    // 027: invokedynamic JNT ()[I bsm=mup.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -2086985922, "႕傖傓", "᧔\u1ad4ᨴ", "쁮샮맮냮", -1232308381 ]
    // 02c: invokedynamic JNT ()Lnet/minecraft/class_239$class_240; bsm=mup.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -2086985922, "\uf093傔킓낔낓႓偭遭遭遭", "᧴ᣔ᪴ᇴ᧔ᥔ᧴ᣔᢔᩴᡔᣴ᪴ᇴᢔᦴᡔ᪔᪔᠔ቴኔፔႴᢔᦴᡔ᪔᪔᠔ቴኴሴ", "쁮샮깮齮ꋮꩮ뿮黮ꃮ齮ꋮꗮ굮ꓮꍮꩮ뿮ꗮ鹮ꓮ귮귮럮쵮췮죮쉮ꗮ鹮ꓮ귮귮럮쵮쩮챮짮", -1232308380 ]
    // 031: invokedynamic JNT (Ljava/lang/Object;)I bsm=mup.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -883634695, "\ue49d\ue498\ue46a\ue467\ue49c\ue46f\ue462", "행햩톩", "빅鉅홅비뉅ꉅ빅鉅詅칅艅鹅홅비詅뙅艅쩅쩅穅칄쩄\ue244附詅뙅艅쩅쩅穅칄홄완", 1972752624 ]
    // 036: bipush 1
    // 037: iastore
    // 038: goto 03b
    // 03b: ldc -1231160466
    // 03d: dup
    // 03e: ishl
    // 03f: ldc 847819105
    // 041: ixor
    // 042: istore 1
    // 043: goto 078
    // 046: ldc -724317583
    // 048: ldc -876916144
    // 04a: iadd
    // 04b: ldc 1331856919
    // 04d: ior
    // 04e: ldc 1340254135
    // 050: iand
    // 051: istore 1
    // 052: goto 0ca
    // 055: goto 0aa
    // 058: invokedynamic JNT ()[I bsm=mup.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -2086985922, "႕傖傓", "᧔\u1ad4ᨴ", "쁮샮맮냮", -1232308390 ]
    // 05d: invokedynamic JNT ()Lnet/minecraft/class_239$class_240; bsm=mup.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -2086985922, "\uf093傔킓낔낓႓偭遭遭灭", "᧴ᣔ᪴ᇴ᧔ᥔ᧴ᣔᢔᩴᡔᣴ᪴ᇴᢔᦴᡔ᪔᪔᠔ቴኔፔႴᢔᦴᡔ᪔᪔᠔ቴኴሴ", "쁮샮깮齮ꋮꩮ뿮黮ꃮ齮ꋮꗮ굮ꓮꍮꩮ뿮ꗮ鹮ꓮ귮귮럮쵮췮죮쉮ꗮ鹮ꓮ귮귮럮쵮쩮챮짮", -1232308377 ]
    // 062: invokedynamic JNT (Ljava/lang/Object;)I bsm=mup.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -883634695, "\ue49d\ue498\ue46a\ue467\ue49c\ue46f\ue462", "행햩톩", "빅鉅홅비뉅ꉅ빅鉅詅칅艅鹅홅비詅뙅艅쩅쩅穅칄쩄\ue244附詅뙅艅쩅쩅穅칄홄완", 1972752525 ]
    // 067: bipush 2
    // 068: iastore
    // 069: goto 06c
    // 06c: ldc 1126515439
    // 06e: ldc 1141997000
    // 070: isub
    // 071: ldc 1497537377
    // 073: ixor
    // 074: istore 1
    // 075: goto 0ca
    // 078: iload 1
    // 079: ldc 571491083
    // 07b: isub
    // 07c: ldc 1682028681
    // 07e: isub
    // 07f: ldc 1089125517
    // 081: isub
    // 082: ldc 1694179419
    // 084: isub
    // 085: ldc 1624224853
    // 087: ixor
    // 088: ldc 317564317
    // 08a: isub
    // 08b: lookupswitch -103 2 -655535432 -100 770131731 -103
    // 0a4: ldc -916697452
    // 0a6: istore 1
    // 0a7: goto 0b9
    // 0aa: ldc -415364563
    // 0ac: ldc -348286298
    // 0ae: iand
    // 0af: ldc 298193151
    // 0b1: ior
    // 0b2: ldc -1309253889
    // 0b4: iand
    // 0b5: istore 1
    // 0b6: goto 0ca
    // 0b9: invokedynamic JNT ()[Lnet/minecraft/class_239$class_240; bsm=mup.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1479083227, "\ue494\ue46f\ue462\ue49b\ue46b\ue499", "행햩쿩툉칉촩쬉황츩충칉촩쳩쫉첩쵉쬉황쳩츉첩쫩쫩큩틉틩펩픉쳩츉첩쫩쫩큩틉팉튉폩", "빅鉅홅비뉅ꉅ빅鉅詅칅艅鹅홅비詅뙅艅쩅쩅穅칄쩄\ue244附詅뙅艅쩅쩅穅칄홄완", 1972752524 ]
    // 0be: checkcast [Lnet/minecraft/class_239$class_240;
    // 0c1: arraylength
    // 0c2: newarray 10
    // 0c4: putstatic mup.oya [I
    // 0c7: goto 013
    // 0ca: iload 1
    // 0cb: ldc 972916762
    // 0cd: iadd
    // 0ce: ldc 1272623472
    // 0d0: ixor
    // 0d1: ldc 1351716696
    // 0d3: iadd
    // 0d4: ldc 1538831343
    // 0d6: isub
    // 0d7: ldc 41278920
    // 0d9: ixor
    // 0da: ldc 182316753
    // 0dc: ixor
    // 0dd: lookupswitch -133 3 -1649789237 43 -1463484064 -136 -1078220749 -133
    // 100: astore 0
    // 101: goto 046
    // 104: astore 0
    // 105: goto 0aa
    // 108: return
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = ((((var10 ^ 550543536) + 777688527 ^ 40388608) + 734409575 ^ 1900683006) - 1954161846 ^ 1939516595) - 551018805 + 410180830;
    MethodHandle var10000 = nyb[((((var10 ^ 550543536) + 777688527 ^ 40388608) + 734409575 ^ 1900683006) - 1954161846 ^ 1939516595) - 551018805 + 410180830
      ^ 325833224];
    if (nyb[var10001 ^ 325833224] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = 99153356 >>> 1380243953 ^ 756; var23 < var13.length(); var23 += 412732634 >> 1970500444 ^ 0) {
        char var42 = var13.charAt(var23);
        char var47 = (char)(
          (
              (
                  (
                        (
                            (
                                  (
                                      (
                                            (((((var42 & '耀') >> 15 | var42 << 1) & 65408) >> 7 | ((var42 & '耀') >> 15 | var42 << 1) << 9) & 32768) >> 15
                                              | ((((var42 & '耀') >> 15 | var42 << 1) & 65408) >> 7 | ((var42 & '耀') >> 15 | var42 << 1) << 9) << 1
                                          )
                                          + 21
                                          + 144
                                        ^ 55
                                    )
                                    & 61440
                                )
                                >> 12
                              | (
                                  (
                                        (((((var42 & '耀') >> 15 | var42 << 1) & 65408) >> 7 | ((var42 & '耀') >> 15 | var42 << 1) << 9) & 32768) >> 15
                                          | ((((var42 & '耀') >> 15 | var42 << 1) & 65408) >> 7 | ((var42 & '耀') >> 15 | var42 << 1) << 9) << 1
                                      )
                                      + 21
                                      + 144
                                    ^ 55
                                )
                                << 4
                          )
                          & 32768
                      )
                      >> 15
                    | (
                        (
                              (
                                  (
                                        (((((var42 & '耀') >> 15 | var42 << 1) & 65408) >> 7 | ((var42 & '耀') >> 15 | var42 << 1) << 9) & 32768) >> 15
                                          | ((((var42 & '耀') >> 15 | var42 << 1) & 65408) >> 7 | ((var42 & '耀') >> 15 | var42 << 1) << 9) << 1
                                      )
                                      + 21
                                      + 144
                                    ^ 55
                                )
                                & 61440
                            )
                            >> 12
                          | (
                              (
                                    (((((var42 & '耀') >> 15 | var42 << 1) & 65408) >> 7 | ((var42 & '耀') >> 15 | var42 << 1) << 9) & 32768) >> 15
                                      | ((((var42 & '耀') >> 15 | var42 << 1) & 65408) >> 7 | ((var42 & '耀') >> 15 | var42 << 1) << 9) << 1
                                  )
                                  + 21
                                  + 144
                                ^ 55
                            )
                            << 4
                      )
                      << 1
                )
                ^ 124
            )
            + 206
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
                                              (((((var42 & '耀') >> 15 | var42 << 1) & 65408) >> 7 | ((var42 & '耀') >> 15 | var42 << 1) << 9) & 32768) >> 15
                                                | ((((var42 & '耀') >> 15 | var42 << 1) & 65408) >> 7 | ((var42 & '耀') >> 15 | var42 << 1) << 9) << 1
                                            )
                                            + 21
                                            + 144
                                          ^ 55
                                      )
                                      & 61440
                                  )
                                  >> 12
                                | (
                                    (
                                          (((((var42 & '耀') >> 15 | var42 << 1) & 65408) >> 7 | ((var42 & '耀') >> 15 | var42 << 1) << 9) & 32768) >> 15
                                            | ((((var42 & '耀') >> 15 | var42 << 1) & 65408) >> 7 | ((var42 & '耀') >> 15 | var42 << 1) << 9) << 1
                                        )
                                        + 21
                                        + 144
                                      ^ 55
                                  )
                                  << 4
                            )
                            & 32768
                        )
                        >> 15
                      | (
                          (
                                (
                                    (
                                          (((((var42 & '耀') >> 15 | var42 << 1) & 65408) >> 7 | ((var42 & '耀') >> 15 | var42 << 1) << 9) & 32768) >> 15
                                            | ((((var42 & '耀') >> 15 | var42 << 1) & 65408) >> 7 | ((var42 & '耀') >> 15 | var42 << 1) << 9) << 1
                                        )
                                        + 21
                                        + 144
                                      ^ 55
                                  )
                                  & 61440
                              )
                              >> 12
                            | (
                                (
                                      (((((var42 & '耀') >> 15 | var42 << 1) & 65408) >> 7 | ((var42 & '耀') >> 15 | var42 << 1) << 9) & 32768) >> 15
                                        | ((((var42 & '耀') >> 15 | var42 << 1) & 65408) >> 7 | ((var42 & '耀') >> 15 | var42 << 1) << 9) << 1
                                    )
                                    + 21
                                    + 144
                                  ^ 55
                              )
                              << 4
                        )
                        << 1
                  )
                  ^ 124
              )
              + 206
          )
        );
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (-769985197 >>> -769985197 | 0) & 2034458632; var29 < var16.length(); var29 += -1208554383 >>> -1208554383 ^ 23546) {
        int var52 = var16.charAt(var29) + ';' - 149;
        int var83 = (var52 & 65520) >> 4;
        int var53 = ((var52 & 65520) >> 4 | var52 << 12) - 209;
        int var84 = (((var52 & 65520) >> 4 | var52 << 12) - 209 & 65534) >> 1;
        char var54 = (char)((((var83 | var52 << 12) - 209 & 65534) >> 1 | ((var52 & 65520) >> 4 | var52 << 12) - 209 << 15) + 139 + 150 + 44 + 203 ^ 112);
        var16.setCharAt(var29, (char)((var84 | var53 << 15) + 139 + 150 + 44 + 203 ^ 112));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), mup.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (-1818270125 ^ -1818270125 | 0) & -1309539841; var35 < var19.length(); var35 += -1128820745 - (1881268281 + -1128820745) ^ -1881268282) {
        int var59 = (var19.charAt(var35) ^ 'Y') + 235 - 61 + 84 + 60 ^ 120 ^ 83;
        int var85 = (var59 & 65528) >> 3;
        int var60 = ((var59 & 65528) >> 3 | var59 << 13) ^ 238;
        int var86 = ((((var59 & 65528) >> 3 | var59 << 13) ^ 238) & 65408) >> 7;
        char var61 = (char)((((var85 | var59 << 13) ^ 238) & 65408) >> 7 | (((var59 & 65528) >> 3 | var59 << 13) ^ 238) << 9);
        var19.setCharAt(var35, (char)(var86 | var60 << 9));
      }

      Class var7 = Class.forName(var19.toString(), false, mup.class.getClassLoader());
      switch ((((var4 ^ 1025162562 ^ 1114100452 ^ 858063584 ^ 161198435) - 97699491 + 1987009873 ^ 1897235921) + 2079635134 ^ 687583046) + 116078869) {
        case 701269108:
        case 2060576836:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 711128733:
          var10000 = var0.findSpecial(var7, var5, var6, mup.class);
          break;
        case 1516717970:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 1989196332:
          var10000 = var0.findConstructor(var7, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    nyb[((((var10 ^ 550543536) + 777688527 ^ 40388608) + 734409575 ^ 1900683006) - 1954161846 ^ 1939516595) - 551018805 + 410180830 ^ 325833224] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (((var10 ^ 2054028361) + 635302007 - 340380906 ^ 1276346738) + 1389567569 + 177800442 ^ 2089690543 ^ 1225933301) + 1922676569;
    MethodHandle var10000 = nyb[(((var10 ^ 2054028361) + 635302007 - 340380906 ^ 1276346738) + 1389567569 + 177800442 ^ 2089690543 ^ 1225933301) + 1922676569
      ^ 1290268323];
    if (nyb[var10001 ^ 1290268323] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (549221165 * -520772389 | 0) & -1566333824; var24 < var14.length(); var24 += (1980299152 << 1980299152 | 1) & 514833) {
        char var43 = var14.charAt(var24);
        char var48 = (char)(
          (
                (
                    (
                          (
                                (
                                      (
                                            (
                                                (((var43 & 'ﾀ') >> 7 | var43 << '\t') + 203 + 211 & 61440) >> 12
                                                  | ((var43 & 'ﾀ') >> 7 | var43 << '\t') + 203 + 211 << 4
                                              )
                                              & 0
                                          )
                                          >> 16
                                        | (
                                            (((var43 & 'ﾀ') >> 7 | var43 << '\t') + 203 + 211 & 61440) >> 12
                                              | ((var43 & 'ﾀ') >> 7 | var43 << '\t') + 203 + 211 << 4
                                          )
                                          << 0
                                    )
                                    - 212
                                  ^ 34
                              )
                              + 197
                            & 65535
                        )
                        >> 0
                      | (
                            (
                                  (
                                        (
                                            (((var43 & 'ﾀ') >> 7 | var43 << '\t') + 203 + 211 & 61440) >> 12
                                              | ((var43 & 'ﾀ') >> 7 | var43 << '\t') + 203 + 211 << 4
                                          )
                                          & 0
                                      )
                                      >> 16
                                    | ((((var43 & 'ﾀ') >> 7 | var43 << '\t') + 203 + 211 & 61440) >> 12 | ((var43 & 'ﾀ') >> 7 | var43 << '\t') + 203 + 211 << 4)
                                      << 0
                                )
                                - 212
                              ^ 34
                          )
                          + 197
                        << 16
                  )
                  & 64512
              )
              >> 10
            | (
                (
                      (
                            (
                                  (
                                        (
                                            (((var43 & 'ﾀ') >> 7 | var43 << '\t') + 203 + 211 & 61440) >> 12
                                              | ((var43 & 'ﾀ') >> 7 | var43 << '\t') + 203 + 211 << 4
                                          )
                                          & 0
                                      )
                                      >> 16
                                    | ((((var43 & 'ﾀ') >> 7 | var43 << '\t') + 203 + 211 & 61440) >> 12 | ((var43 & 'ﾀ') >> 7 | var43 << '\t') + 203 + 211 << 4)
                                      << 0
                                )
                                - 212
                              ^ 34
                          )
                          + 197
                        & 65535
                    )
                    >> 0
                  | (
                        (
                              (((((var43 & 'ﾀ') >> 7 | var43 << '\t') + 203 + 211 & 61440) >> 12 | ((var43 & 'ﾀ') >> 7 | var43 << '\t') + 203 + 211 << 4) & 0)
                                  >> 16
                                | ((((var43 & 'ﾀ') >> 7 | var43 << '\t') + 203 + 211 & 61440) >> 12 | ((var43 & 'ﾀ') >> 7 | var43 << '\t') + 203 + 211 << 4)
                                  << 0
                            )
                            - 212
                          ^ 34
                      )
                      + 197
                    << 16
              )
              << 6
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
                                                  (((var43 & 'ﾀ') >> 7 | var43 << '\t') + 203 + 211 & 61440) >> 12
                                                    | ((var43 & 'ﾀ') >> 7 | var43 << '\t') + 203 + 211 << 4
                                                )
                                                & 0
                                            )
                                            >> 16
                                          | (
                                              (((var43 & 'ﾀ') >> 7 | var43 << '\t') + 203 + 211 & 61440) >> 12
                                                | ((var43 & 'ﾀ') >> 7 | var43 << '\t') + 203 + 211 << 4
                                            )
                                            << 0
                                      )
                                      - 212
                                    ^ 34
                                )
                                + 197
                              & 65535
                          )
                          >> 0
                        | (
                              (
                                    (
                                          (
                                              (((var43 & 'ﾀ') >> 7 | var43 << '\t') + 203 + 211 & 61440) >> 12
                                                | ((var43 & 'ﾀ') >> 7 | var43 << '\t') + 203 + 211 << 4
                                            )
                                            & 0
                                        )
                                        >> 16
                                      | (
                                          (((var43 & 'ﾀ') >> 7 | var43 << '\t') + 203 + 211 & 61440) >> 12
                                            | ((var43 & 'ﾀ') >> 7 | var43 << '\t') + 203 + 211 << 4
                                        )
                                        << 0
                                  )
                                  - 212
                                ^ 34
                            )
                            + 197
                          << 16
                    )
                    & 64512
                )
                >> 10
              | (
                  (
                        (
                              (
                                    (
                                          (
                                              (((var43 & 'ﾀ') >> 7 | var43 << '\t') + 203 + 211 & 61440) >> 12
                                                | ((var43 & 'ﾀ') >> 7 | var43 << '\t') + 203 + 211 << 4
                                            )
                                            & 0
                                        )
                                        >> 16
                                      | (
                                          (((var43 & 'ﾀ') >> 7 | var43 << '\t') + 203 + 211 & 61440) >> 12
                                            | ((var43 & 'ﾀ') >> 7 | var43 << '\t') + 203 + 211 << 4
                                        )
                                        << 0
                                  )
                                  - 212
                                ^ 34
                            )
                            + 197
                          & 65535
                      )
                      >> 0
                    | (
                          (
                                (((((var43 & 'ﾀ') >> 7 | var43 << '\t') + 203 + 211 & 61440) >> 12 | ((var43 & 'ﾀ') >> 7 | var43 << '\t') + 203 + 211 << 4) & 0)
                                    >> 16
                                  | ((((var43 & 'ﾀ') >> 7 | var43 << '\t') + 203 + 211 & 61440) >> 12 | ((var43 & 'ﾀ') >> 7 | var43 << '\t') + 203 + 211 << 4)
                                    << 0
                              )
                              - 212
                            ^ 34
                        )
                        + 197
                      << 16
                )
                << 6
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = -704456342 >>> 80663815 ^ 28050866; var30 < var17.length(); var30 += -1095789690 >> -38519616 ^ -1095789689) {
        int var53 = var17.charAt(var30) + 158;
        int var90 = (var53 & 49152) >> 14;
        int var54 = ((var53 & 49152) >> 14 | var53 << 2) - 70;
        int var91 = (((var53 & 49152) >> 14 | var53 << 2) - 70 & 65504) >> 5;
        var53 = (((var90 | var53 << 2) - 70 & 65504) >> 5 | ((var53 & 49152) >> 14 | var53 << 2) - 70 << 11) + 211 - 226;
        var90 = ((var91 | var54 << 11) + 211 - 226 & 65024) >> 9;
        int var56 = (((var91 | var54 << 11) + 211 - 226 & 65024) >> 9 | var53 << 7) - 138;
        int var93 = ((((var91 | var54 << 11) + 211 - 226 & 65024) >> 9 | var53 << 7) - 138 & 65024) >> 9;
        char var57 = (char)((((var90 | var53 << 7) - 138 & 65024) >> 9 | (((var91 | var54 << 11) + 211 - 226 & 65024) >> 9 | var53 << 7) - 138 << 7) + 159);
        var17.setCharAt(var30, (char)((var93 | var56 << 7) + 159));
      }

      Class var6 = Class.forName(var17.toString(), false, mup.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (1369004860 << -836551441 | 0) & 1375848800; var36 < var20.length(); var36 += (-1876789599 | -1876789599 | 0) & 1262586127) {
        int var62 = (var20.charAt(var36) ^ 170) - 197;
        char var65 = (char)(
          (
              ((((((var62 & 65408) >> 7 | var62 << 9) + 212 + 114 & 0) >> 16 | ((var62 & 65408) >> 7 | var62 << 9) + 212 + 114 << 0) ^ 149) & 65535) >> 0
                | (((((var62 & 65408) >> 7 | var62 << 9) + 212 + 114 & 0) >> 16 | ((var62 & 65408) >> 7 | var62 << 9) + 212 + 114 << 0) ^ 149) << 16
            )
            ^ 233
            ^ 145
        );
        var20.setCharAt(
          var36,
          (char)(
            (
                ((((((var62 & 65408) >> 7 | var62 << 9) + 212 + 114 & 0) >> 16 | ((var62 & 65408) >> 7 | var62 << 9) + 212 + 114 << 0) ^ 149) & 65535) >> 0
                  | (((((var62 & 65408) >> 7 | var62 << 9) + 212 + 114 & 0) >> 16 | ((var62 & 65408) >> 7 | var62 << 9) + 212 + 114 << 0) ^ 149) << 16
              )
              ^ 233
              ^ 145
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), mup.class.getClassLoader()).returnType();
      switch ((var4 - 1335901638 + 1963193868 - 1948226494 - 1610446964 - 517271733 - 1277049436 ^ 1606992283) + 1027818080 - 1382015360 ^ 1350064193) {
        case 187753495:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1271139903:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1846926993:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1903270651:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      nyb[(((var10 ^ 2054028361) + 635302007 - 340380906 ^ 1276346738) + 1389567569 + 177800442 ^ 2089690543 ^ 1225933301) + 1922676569 ^ 1290268323] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
