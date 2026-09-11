// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

// $VF: synthetic class
public class hb {
  public static final MethodHandle[] uot;
  static {
    // $VF: Couldn't be decompiled
    // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
    // java.lang.RuntimeException: parsing failure!
    //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
    //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
    //
    // Bytecode:
    // 00: ldc -1288765125
    // 02: ldc 1256897674
    // 04: iushr
    // 05: ldc 2935751
    // 07: ixor
    // 08: anewarray 23
    // 0b: putstatic hb.uot [Ljava/lang/invoke/MethodHandle;
    // 0e: goto 7d
    // 11: ldc -1541830821
    // 13: ldc 659391433
    // 15: swap
    // 16: imul
    // 17: ldc -1409095000
    // 19: ior
    // 1a: ldc -27792465
    // 1c: iand
    // 1d: istore 1
    // 1e: goto e4
    // 21: goto 47
    // 24: invokedynamic JNT ()[I bsm=hb.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1489168714, "\u0ef0\u0de0\u0e80", "䥀䍀", "︷︸﹪﹘", -1239587424 ]
    // 29: invokedynamic JNT ()Lnet/minecraft/class_156$class_158; bsm=hb.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1489168714, "\u0d50\u0e00ീධരრ\u0a80\u0a80ઠઠ", "佀䙀啀ཀ乀䩀佀䙀䑀區䉀䝀啀ཀ䑀䵀䉀呀呀䁀ቀᙀᝀՀ䑀䵀䉀呀呀䁀ቀᙀ᥀", "︷︸﹛ﹽﹴﺃ︾ﹼﹸﹽﹴﹲﺁﹰ\ufe75ﺃ︾ﹲﹻﹰﺂﺂ\ufe6e﹀﹄﹅︳ﹲﹻﹰﺂﺂ\ufe6e﹀﹄﹇﹊", -1239587423 ]
    // 2e: invokedynamic JNT (Ljava/lang/Object;)I bsm=hb.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1056395693, "ㆈ㊈⒈⮈⺈⎈Ⲉ", "䈊䎊厊", "ࡈܨईHࠨިࡈܨۨࣈڨ݈ईHۨࠈڨࣨࣨ٨¨Ĩň（ۨࠈڨࣨࣨ٨¨Ĩƈ", 642518826 ]
    // 33: bipush 1
    // 34: iastore
    // 35: goto 38
    // 38: ldc -703201073
    // 3a: ldc 638597596
    // 3c: iadd
    // 3d: ldc -498548010
    // 3f: ior
    // 40: ldc -211822601
    // 42: iand
    // 43: istore 1
    // 44: goto e4
    // 47: ldc -1967674679
    // 49: ldc 1031197088
    // 4b: ldc 1691520589
    // 4d: ixor
    // 4e: ishr
    // 4f: ldc -668948032
    // 51: ior
    // 52: ldc -601166907
    // 54: iand
    // 55: istore 1
    // 56: goto ad
    // 59: invokedynamic JNT ()[I bsm=hb.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1489168714, "\u0ef0\u0de0\u0e80", "䥀䍀", "︷︸﹪﹘", -1239587361 ]
    // 5e: invokedynamic JNT ()Lnet/minecraft/class_156$class_158; bsm=hb.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1489168714, "\u0d50\u0e00ീධരრ\u0a80\u0a80ઠ\u0a60", "佀䙀啀ཀ乀䩀佀䙀䑀區䉀䝀啀ཀ䑀䵀䉀呀呀䁀ቀᙀᝀՀ䑀䵀䉀呀呀䁀ቀᙀ᥀", "︷︸﹛ﹽﹴﺃ︾ﹼﹸﹽﹴﹲﺁﹰ\ufe75ﺃ︾ﹲﹻﹰﺂﺂ\ufe6e﹀﹄﹅︳ﹲﹻﹰﺂﺂ\ufe6e﹀﹄﹇﹊", -1239587364 ]
    // 63: invokedynamic JNT (Ljava/lang/Object;)I bsm=hb.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1056395693, "ㆈ㊈⒈⮈⺈⎈Ⲉ", "䈊䎊厊", "ࡈܨईHࠨިࡈܨۨࣈڨ݈ईHۨࠈڨࣨࣨ٨¨Ĩň（ۨࠈڨࣨࣨ٨¨Ĩƈ", 642518825 ]
    // 68: bipush 2
    // 69: iastore
    // 6a: goto 70
    // 6d: goto 9c
    // 70: ldc 993568181
    // 72: ldc 1985759024
    // 74: isub
    // 75: ldc 1140652706
    // 77: ixor
    // 78: istore 1
    // 79: goto ad
    // 7c: return
    // 7d: ldc -1825811585
    // 7f: istore 1
    // 80: goto 8b
    // 83: astore 0
    // 84: goto 9c
    // 87: astore 0
    // 88: goto 47
    // 8b: invokedynamic JNT ()[Lnet/minecraft/class_156$class_158; bsm=hb.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1163863195, "㚈⎈Ⲉ㞈➈㖈", "䈊䎊岊吊攊憊栊䚊斊掊攊憊悊朊徊愊栊䚊悊搊徊梊梊床䞊䦊䤊䀊悊搊徊梊梊床䞊䦊䨊䲊", "ࡈܨईHࠨިࡈܨۨࣈڨ݈ईHۨࠈڨࣨࣨ٨¨Ĩň（ۨࠈڨࣨࣨ٨¨Ĩƈ", 642518822 ]
    // 90: checkcast [Lnet/minecraft/class_156$class_158;
    // 93: arraylength
    // 94: newarray 10
    // 96: putstatic hb.xoq [I
    // 99: goto 11
    // 9c: ldc -1212907043
    // 9e: ldc 1678143893
    // a0: dup_x1
    // a1: ior
    // a2: ixor
    // a3: ldc 759721301
    // a5: ior
    // a6: ldc 769490421
    // a8: iand
    // a9: istore 1
    // aa: goto ad
    // ad: iload 1
    // ae: ldc 959708726
    // b0: iadd
    // b1: ldc 1409727706
    // b3: isub
    // b4: ldc 362391202
    // b6: iadd
    // b7: ldc 1948870379
    // b9: ixor
    // ba: ldc 1215043495
    // bc: iadd
    // bd: ldc 834230127
    // bf: isub
    // c0: lookupswitch -103 3 -1183221920 -103 209824518 -83 1936258032 -68
    // e4: iload 1
    // e5: ldc 1192111856
    // e7: iadd
    // e8: ldc 559777429
    // ea: ixor
    // eb: ldc 746303114
    // ed: ixor
    // ee: ldc 1430354894
    // f0: ixor
    // f1: ldc 75711362
    // f3: iadd
    // f4: ldc 105746871
    // f6: ixor
    // f7: lookupswitch -211 2 666443131 -211 1676674063 -214
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (var10 + 389546784 ^ 646616974) + 133002990 + 2138826275 + 1884036851 - 1733907716 - 2013528661 + 601026665 + 471865987;
    MethodHandle var10000 = uot[(var10 + 389546784 ^ 646616974)
      + 133002990
      + 2138826275
      + 1884036851
      - 1733907716
      - 2013528661
      + 601026665
      + 471865987
      - 1935258969];
    if (uot[var10001 - 1935258969] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = -975999329 ^ 1424114423 * (-975999329 >>> 1424114423) ^ 1020149122; var23 < var13.length(); var23 += 1805385732 >>> -1434020449 ^ 1) {
        int var42 = var13.charAt(var23);
        int var10004 = (var42 & 49152) >> 14;
        int var43 = ((var42 & 49152) >> 14 | var42 << 2) ^ 223;
        int var87 = ((((var42 & 49152) >> 14 | var42 << 2) ^ 223) & 65534) >> 1;
        var42 = ((((var10004 | var42 << 2) ^ 223) & 65534) >> 1 | (((var42 & 49152) >> 14 | var42 << 2) ^ 223) << 15) ^ 71;
        var10004 = (((var87 | var43 << 15) ^ 71) & 65504) >> 5;
        int var45 = (((var87 | var43 << 15) ^ 71) & 65504) >> 5 | var42 << 11;
        int var89 = (((((var87 | var43 << 15) ^ 71) & 65504) >> 5 | var42 << 11) & 57344) >> 13;
        var42 = ((var10004 | var42 << 11) & 57344) >> 13 | ((((var87 | var43 << 15) ^ 71) & 65504) >> 5 | var42 << 11) << 3;
        var10004 = ((var89 | var45 << 3) & 65535) >> 0;
        int var47 = ((((var89 | var45 << 3) & 65535) >> 0 | var42 << 16) ^ 180) - 250;
        int var91 = (((((var89 | var45 << 3) & 65535) >> 0 | var42 << 16) ^ 180) - 250 & 65408) >> 7;
        char var48 = (char)((((var10004 | var42 << 16) ^ 180) - 250 & 65408) >> 7 | ((((var89 | var45 << 3) & 65535) >> 0 | var42 << 16) ^ 180) - 250 << 9);
        var13.setCharAt(var23, (char)(var91 | var47 << 9));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (-221609484 | 1580459493 | 0) & 16781314; var29 < var16.length(); var29 += 1657282124 * -1494929907 ^ 1536635357) {
        int var53 = var16.charAt(var29) ^ 161 ^ 75;
        char var56 = (char)(
          (
              (((((var53 & 65024) >> 9 | var53 << 7) & 61440) >> 12 | ((var53 & 65024) >> 9 | var53 << 7) << 4) + 137 - 6 + 144 - 230 & 65532) >> 2
                | ((((var53 & 65024) >> 9 | var53 << 7) & 61440) >> 12 | ((var53 & 65024) >> 9 | var53 << 7) << 4) + 137 - 6 + 144 - 230 << 14
            )
            - 105
        );
        var16.setCharAt(
          var29,
          (char)(
            (
                (((((var53 & 65024) >> 9 | var53 << 7) & 61440) >> 12 | ((var53 & 65024) >> 9 | var53 << 7) << 4) + 137 - 6 + 144 - 230 & 65532) >> 2
                  | ((((var53 & 65024) >> 9 | var53 << 7) & 61440) >> 12 | ((var53 & 65024) >> 9 | var53 << 7) << 4) + 137 - 6 + 144 - 230 << 14
              )
              - 105
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), hb.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = -459292187 & -459292187 ^ -459292187; var35 < var19.length(); var35 += (747383752 ^ -1331067785 | 0) & 1121587201) {
        int var61 = var19.charAt(var35);
        int var95 = (var61 & 65535) >> 0;
        int var62 = ((var61 & 65535) >> 0 | var61 << 16) + 14 + 234;
        int var96 = (((var61 & 65535) >> 0 | var61 << 16) + 14 + 234 & 65472) >> 6;
        var61 = ((var95 | var61 << 16) + 14 + 234 & 65472) >> 6 | ((var61 & 65535) >> 0 | var61 << 16) + 14 + 234 << 10;
        var95 = ((var96 | var62 << 10) & 32768) >> 15;
        int var64 = (((var96 | var62 << 10) & 32768) >> 15 | var61 << 1) - 78 + 31;
        int var98 = ((((var96 | var62 << 10) & 32768) >> 15 | var61 << 1) - 78 + 31 & 0) >> 16;
        char var65 = (char)((((var95 | var61 << 1) - 78 + 31 & 0) >> 16 | (((var96 | var62 << 10) & 32768) >> 15 | var61 << 1) - 78 + 31 << 0) - 104 + 187);
        var19.setCharAt(var35, (char)((var98 | var64 << 0) - 104 + 187));
      }

      Class var7 = Class.forName(var19.toString(), false, hb.class.getClassLoader());
      switch (((var4 + 214727314 - 272951156 - 444468777 ^ 1973399278) - 1661021036 + 191785304 + 1288386240 ^ 469231698) + 1673784158 - 123918011) {
        case 20706077:
          var10000 = var0.findSpecial(var7, var5, var6, hb.class);
          break;
        case 570081237:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 747835043:
        case 1412141776:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1489813018:
          var10000 = var0.findConstructor(var7, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    uot[(var10 + 389546784 ^ 646616974) + 133002990 + 2138826275 + 1884036851 - 1733907716 - 2013528661 + 601026665 + 471865987 - 1935258969] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (var10 + 2069967891 - 149629602 + 1129109708 + 1827257377 - 1261344518 + 886196992 + 1884743432 ^ 1607789150) + 2033947141;
    MethodHandle var10000 = uot[(var10 + 2069967891 - 149629602 + 1129109708 + 1827257377 - 1261344518 + 886196992 + 1884743432 ^ 1607789150)
      + 2033947141
      + 431224989];
    if (uot[var10001 + 431224989] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (881183054 >>> 881183054 | 0) & -365025120; var24 < var14.length(); var24 += (251622316 << 958412623 | 1) & 1109930729) {
        char var43 = var14.charAt(var24);
        char var46 = (char)(
          (
                (((((var43 & '￠') >> 5 | var43 << 11) & 65504) >> 5 | ((var43 & '￠') >> 5 | var43 << 11) << 11) & 64512) >> 10
                  | ((((var43 & '￠') >> 5 | var43 << 11) & 65504) >> 5 | ((var43 & '￠') >> 5 | var43 << 11) << 11) << 6
              )
              - 31
              + 172
              - 124
              - 94
              + 78
              - 148
            ^ 36
        );
        var14.setCharAt(
          var24,
          (char)(
            (
                  (((((var43 & '￠') >> 5 | var43 << 11) & 65504) >> 5 | ((var43 & '￠') >> 5 | var43 << 11) << 11) & 64512) >> 10
                    | ((((var43 & '￠') >> 5 | var43 << 11) & 65504) >> 5 | ((var43 & '￠') >> 5 | var43 << 11) << 11) << 6
                )
                - 31
                + 172
                - 124
                - 94
                + 78
                - 148
              ^ 36
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (-1356650514 | -1356650514 + -620389053 | 0) & 1346639872; var30 < var17.length(); var30 += 1280679999 >>> 1280679999 ^ 1) {
        char var51 = var17.charAt(var30);
        char var58 = (char)(
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
                                                                (((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0
                                                                  | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16
                                                              )
                                                              & 65535
                                                          )
                                                          >> 0
                                                        | (
                                                            (((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0
                                                              | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16
                                                          )
                                                          << 16
                                                    )
                                                    & 49152
                                                )
                                                >> 14
                                              | (
                                                  (
                                                        (
                                                            (((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0
                                                              | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16
                                                          )
                                                          & 65535
                                                      )
                                                      >> 0
                                                    | (
                                                        (((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0
                                                          | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16
                                                      )
                                                      << 16
                                                )
                                                << 2
                                          )
                                          - 11
                                          - 9
                                        & 65520
                                    )
                                    >> 4
                                  | (
                                        (
                                              (
                                                  (
                                                        (
                                                            (((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0
                                                              | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16
                                                          )
                                                          & 65535
                                                      )
                                                      >> 0
                                                    | (
                                                        (((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0
                                                          | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16
                                                      )
                                                      << 16
                                                )
                                                & 49152
                                            )
                                            >> 14
                                          | (
                                              (
                                                    ((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16)
                                                      & 65535
                                                  )
                                                  >> 0
                                                | ((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16)
                                                  << 16
                                            )
                                            << 2
                                      )
                                      - 11
                                      - 9
                                    << 12
                              )
                              & 65528
                          )
                          >> 3
                        | (
                            (
                                  (
                                        (
                                              (
                                                  (
                                                        (
                                                            (((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0
                                                              | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16
                                                          )
                                                          & 65535
                                                      )
                                                      >> 0
                                                    | (
                                                        (((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0
                                                          | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16
                                                      )
                                                      << 16
                                                )
                                                & 49152
                                            )
                                            >> 14
                                          | (
                                              (
                                                    ((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16)
                                                      & 65535
                                                  )
                                                  >> 0
                                                | ((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16)
                                                  << 16
                                            )
                                            << 2
                                      )
                                      - 11
                                      - 9
                                    & 65520
                                )
                                >> 4
                              | (
                                    (
                                          (
                                              (
                                                    ((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16)
                                                      & 65535
                                                  )
                                                  >> 0
                                                | ((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16)
                                                  << 16
                                            )
                                            & 49152
                                        )
                                        >> 14
                                      | (
                                          (((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16) & 65535)
                                              >> 0
                                            | ((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16)
                                              << 16
                                        )
                                        << 2
                                  )
                                  - 11
                                  - 9
                                << 12
                          )
                          << 13
                    )
                    + 4
                  & 57344
              )
              >> 13
            | (
                  (
                        (
                            (
                                  (
                                        (
                                              (
                                                  (
                                                        (
                                                            (((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0
                                                              | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16
                                                          )
                                                          & 65535
                                                      )
                                                      >> 0
                                                    | (
                                                        (((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0
                                                          | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16
                                                      )
                                                      << 16
                                                )
                                                & 49152
                                            )
                                            >> 14
                                          | (
                                              (
                                                    ((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16)
                                                      & 65535
                                                  )
                                                  >> 0
                                                | ((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16)
                                                  << 16
                                            )
                                            << 2
                                      )
                                      - 11
                                      - 9
                                    & 65520
                                )
                                >> 4
                              | (
                                    (
                                          (
                                              (
                                                    ((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16)
                                                      & 65535
                                                  )
                                                  >> 0
                                                | ((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16)
                                                  << 16
                                            )
                                            & 49152
                                        )
                                        >> 14
                                      | (
                                          (((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16) & 65535)
                                              >> 0
                                            | ((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16)
                                              << 16
                                        )
                                        << 2
                                  )
                                  - 11
                                  - 9
                                << 12
                          )
                          & 65528
                      )
                      >> 3
                    | (
                        (
                              (
                                    (
                                          (
                                              (
                                                    ((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16)
                                                      & 65535
                                                  )
                                                  >> 0
                                                | ((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16)
                                                  << 16
                                            )
                                            & 49152
                                        )
                                        >> 14
                                      | (
                                          (((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16) & 65535)
                                              >> 0
                                            | ((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16)
                                              << 16
                                        )
                                        << 2
                                  )
                                  - 11
                                  - 9
                                & 65520
                            )
                            >> 4
                          | (
                                (
                                      (
                                          (((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16) & 65535)
                                              >> 0
                                            | ((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16)
                                              << 16
                                        )
                                        & 49152
                                    )
                                    >> 14
                                  | (
                                      (((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16) & 65535)
                                          >> 0
                                        | ((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16) << 16
                                    )
                                    << 2
                              )
                              - 11
                              - 9
                            << 12
                      )
                      << 13
                )
                + 4
              << 3
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
                                                                  (((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0
                                                                    | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16
                                                                )
                                                                & 65535
                                                            )
                                                            >> 0
                                                          | (
                                                              (((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0
                                                                | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16
                                                            )
                                                            << 16
                                                      )
                                                      & 49152
                                                  )
                                                  >> 14
                                                | (
                                                    (
                                                          (
                                                              (((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0
                                                                | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16
                                                            )
                                                            & 65535
                                                        )
                                                        >> 0
                                                      | (
                                                          (((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0
                                                            | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16
                                                        )
                                                        << 16
                                                  )
                                                  << 2
                                            )
                                            - 11
                                            - 9
                                          & 65520
                                      )
                                      >> 4
                                    | (
                                          (
                                                (
                                                    (
                                                          (
                                                              (((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0
                                                                | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16
                                                            )
                                                            & 65535
                                                        )
                                                        >> 0
                                                      | (
                                                          (((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0
                                                            | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16
                                                        )
                                                        << 16
                                                  )
                                                  & 49152
                                              )
                                              >> 14
                                            | (
                                                (
                                                      (
                                                          (((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0
                                                            | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16
                                                        )
                                                        & 65535
                                                    )
                                                    >> 0
                                                  | ((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16)
                                                    << 16
                                              )
                                              << 2
                                        )
                                        - 11
                                        - 9
                                      << 12
                                )
                                & 65528
                            )
                            >> 3
                          | (
                              (
                                    (
                                          (
                                                (
                                                    (
                                                          (
                                                              (((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0
                                                                | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16
                                                            )
                                                            & 65535
                                                        )
                                                        >> 0
                                                      | (
                                                          (((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0
                                                            | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16
                                                        )
                                                        << 16
                                                  )
                                                  & 49152
                                              )
                                              >> 14
                                            | (
                                                (
                                                      (
                                                          (((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0
                                                            | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16
                                                        )
                                                        & 65535
                                                    )
                                                    >> 0
                                                  | ((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16)
                                                    << 16
                                              )
                                              << 2
                                        )
                                        - 11
                                        - 9
                                      & 65520
                                  )
                                  >> 4
                                | (
                                      (
                                            (
                                                (
                                                      (
                                                          (((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0
                                                            | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16
                                                        )
                                                        & 65535
                                                    )
                                                    >> 0
                                                  | ((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16)
                                                    << 16
                                              )
                                              & 49152
                                          )
                                          >> 14
                                        | (
                                            (
                                                  ((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16)
                                                    & 65535
                                                )
                                                >> 0
                                              | ((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16)
                                                << 16
                                          )
                                          << 2
                                    )
                                    - 11
                                    - 9
                                  << 12
                            )
                            << 13
                      )
                      + 4
                    & 57344
                )
                >> 13
              | (
                    (
                          (
                              (
                                    (
                                          (
                                                (
                                                    (
                                                          (
                                                              (((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0
                                                                | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16
                                                            )
                                                            & 65535
                                                        )
                                                        >> 0
                                                      | (
                                                          (((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0
                                                            | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16
                                                        )
                                                        << 16
                                                  )
                                                  & 49152
                                              )
                                              >> 14
                                            | (
                                                (
                                                      (
                                                          (((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0
                                                            | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16
                                                        )
                                                        & 65535
                                                    )
                                                    >> 0
                                                  | ((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16)
                                                    << 16
                                              )
                                              << 2
                                        )
                                        - 11
                                        - 9
                                      & 65520
                                  )
                                  >> 4
                                | (
                                      (
                                            (
                                                (
                                                      (
                                                          (((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0
                                                            | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16
                                                        )
                                                        & 65535
                                                    )
                                                    >> 0
                                                  | ((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16)
                                                    << 16
                                              )
                                              & 49152
                                          )
                                          >> 14
                                        | (
                                            (
                                                  ((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16)
                                                    & 65535
                                                )
                                                >> 0
                                              | ((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16)
                                                << 16
                                          )
                                          << 2
                                    )
                                    - 11
                                    - 9
                                  << 12
                            )
                            & 65528
                        )
                        >> 3
                      | (
                          (
                                (
                                      (
                                            (
                                                (
                                                      (
                                                          (((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0
                                                            | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16
                                                        )
                                                        & 65535
                                                    )
                                                    >> 0
                                                  | ((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16)
                                                    << 16
                                              )
                                              & 49152
                                          )
                                          >> 14
                                        | (
                                            (
                                                  ((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16)
                                                    & 65535
                                                )
                                                >> 0
                                              | ((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16)
                                                << 16
                                          )
                                          << 2
                                    )
                                    - 11
                                    - 9
                                  & 65520
                              )
                              >> 4
                            | (
                                  (
                                        (
                                            (
                                                  ((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16)
                                                    & 65535
                                                )
                                                >> 0
                                              | ((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16)
                                                << 16
                                          )
                                          & 49152
                                      )
                                      >> 14
                                    | (
                                        (((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16) & 65535)
                                            >> 0
                                          | ((((var51 & '\uffc0') >> 6 | var51 << '\n') & 65535) >> 0 | ((var51 & '\uffc0') >> 6 | var51 << '\n') << 16) << 16
                                      )
                                      << 2
                                )
                                - 11
                                - 9
                              << 12
                        )
                        << 13
                  )
                  + 4
                << 3
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, hb.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = 1557962521 + -1967575870 ^ -409613349; var36 < var20.length(); var36 += (718004461 | 1635672535) ^ 1811931646) {
        char var63 = var20.charAt(var36);
        char var66 = (char)(
          (
              (((((var63 & 0) >> 16 | var63 << 0) + 252 + 0 & 65532) >> 2 | ((var63 & 0) >> 16 | var63 << 0) + 252 + 0 << 14) & 49152) >> 14
                | ((((var63 & 0) >> 16 | var63 << 0) + 252 + 0 & 65532) >> 2 | ((var63 & 0) >> 16 | var63 << 0) + 252 + 0 << 14) << 2
            )
            + 86
            - 40
            + 95
            - 115
            + 219
        );
        var20.setCharAt(
          var36,
          (char)(
            (
                (((((var63 & 0) >> 16 | var63 << 0) + 252 + 0 & 65532) >> 2 | ((var63 & 0) >> 16 | var63 << 0) + 252 + 0 << 14) & 49152) >> 14
                  | ((((var63 & 0) >> 16 | var63 << 0) + 252 + 0 & 65532) >> 2 | ((var63 & 0) >> 16 | var63 << 0) + 252 + 0 << 14) << 2
              )
              + 86
              - 40
              + 95
              - 115
              + 219
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), hb.class.getClassLoader()).returnType();
      switch ((var4 - 828844894 ^ 1065474120) + 654521899 + 77560272 + 1873229530 - 1219148819 + 459366524 - 1730239766 - 846641751 + 467800773) {
        case 333712974:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 562997199:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 983480742:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1395645005:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      uot[(var10 + 2069967891 - 149629602 + 1129109708 + 1827257377 - 1261344518 + 886196992 + 1884743432 ^ 1607789150) + 2033947141 + 431224989] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
