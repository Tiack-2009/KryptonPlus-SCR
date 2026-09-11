// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

// $VF: synthetic class
public class ufz {
  public static final MethodHandle[] siqp;
  static {
    // $VF: Couldn't be decompiled
    // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
    // java.lang.RuntimeException: parsing failure!
    //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
    //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
    //
    // Bytecode:
    // 000: ldc -176393782
    // 002: ldc 361338490
    // 004: imul
    // 005: bipush 16
    // 007: ior
    // 008: ldc -2144853958
    // 00a: iand
    // 00b: anewarray 23
    // 00e: putstatic ufz.siqp [Ljava/lang/invoke/MethodHandle;
    // 011: goto 12a
    // 014: ldc 1625406945
    // 016: dup
    // 017: iushr
    // 018: ldc -460955129
    // 01a: ior
    // 01b: ldc -57252993
    // 01d: iand
    // 01e: istore 1
    // 01f: goto 230
    // 022: invokedynamic JNT ()[I bsm=ufz.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -194177781, "ᜂ梂梂", "鍴鎈鍘", "붻뱻짻쑻", 1215988061 ]
    // 027: invokedynamic JNT ()Lwv; bsm=ufz.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -194177781, "គᜂ", "鍌鍈", "붻뱻욻탻퀻쇻", 1215988062 ]
    // 02c: invokedynamic JNT (Ljava/lang/Object;)I bsm=ufz.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1907144762, "닿웿軿髿뛿竿껿", "ÃÂâ", "畆\uf545", -272986777 ]
    // 031: bipush 1
    // 032: iastore
    // 033: goto 039
    // 036: goto 048
    // 039: ldc 2113973155
    // 03b: ldc 1328038389
    // 03d: imul
    // 03e: ldc 119145027
    // 040: ior
    // 041: ldc -1220867381
    // 043: iand
    // 044: istore 1
    // 045: goto 230
    // 048: ldc 1771539434
    // 04a: ldc -157675025
    // 04c: ixor
    // 04d: ldc -210156851
    // 04f: ixor
    // 050: istore 1
    // 051: goto 1c8
    // 054: goto 079
    // 057: invokedynamic JNT ()[I bsm=ufz.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -194177781, "ᜂ梂梂", "鍴鎈鍘", "붻뱻짻쑻", 1215988064 ]
    // 05c: invokedynamic JNT ()Lwv; bsm=ufz.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -194177781, "ᝂᛂ", "鍌鍈", "붻뱻욻탻퀻쇻", 1215988057 ]
    // 061: invokedynamic JNT (Ljava/lang/Object;)I bsm=ufz.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1907144762, "닿웿軿髿뛿竿껿", "ÃÂâ", "畆\uf545", -272986772 ]
    // 066: bipush 2
    // 067: iastore
    // 068: goto 06b
    // 06b: ldc 1660058979
    // 06d: dup
    // 06e: ishl
    // 06f: ldc -670802876
    // 071: ior
    // 072: ldc -128099130
    // 074: iand
    // 075: istore 1
    // 076: goto 1c8
    // 079: ldc -499553003
    // 07b: dup
    // 07c: dup_x1
    // 07d: ixor
    // 07e: ixor
    // 07f: ldc -552703783
    // 081: ixor
    // 082: istore 1
    // 083: goto 1c8
    // 086: goto 0af
    // 089: invokedynamic JNT ()[I bsm=ufz.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -194177781, "ᜂ梂梂", "鍴鎈鍘", "붻뱻짻쑻", 1215988059 ]
    // 08e: invokedynamic JNT ()Lwv; bsm=ufz.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -194177781, "椂概", "鍌鍈", "붻뱻욻탻퀻쇻", 1215988060 ]
    // 093: invokedynamic JNT (Ljava/lang/Object;)I bsm=ufz.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1907144762, "닿웿軿髿뛿竿껿", "ÃÂâ", "畆\uf545", -272986783 ]
    // 098: bipush 3
    // 099: iastore
    // 09a: goto 09d
    // 09d: ldc -845033505
    // 09f: ldc -23259240
    // 0a1: dup2
    // 0a2: ior
    // 0a3: ior
    // 0a4: iushr
    // 0a5: ldc 1474229398
    // 0a7: ior
    // 0a8: ldc 2011102462
    // 0aa: iand
    // 0ab: istore 1
    // 0ac: goto 1c8
    // 0af: ldc -2000041190
    // 0b1: ldc 1156725369
    // 0b3: ldc 48771939
    // 0b5: iadd
    // 0b6: iadd
    // 0b7: ldc -1969492697
    // 0b9: ixor
    // 0ba: istore 1
    // 0bb: goto 1c8
    // 0be: goto 0e3
    // 0c1: invokedynamic JNT ()[I bsm=ufz.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -194177781, "ᜂ梂梂", "鍴鎈鍘", "붻뱻짻쑻", 1215988054 ]
    // 0c6: invokedynamic JNT ()Lwv; bsm=ufz.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -194177781, "គᑂ", "鍌鍈", "붻뱻욻탻퀻쇻", 1215988055 ]
    // 0cb: invokedynamic JNT (Ljava/lang/Object;)I bsm=ufz.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1907144762, "닿웿軿髿뛿竿껿", "ÃÂâ", "畆\uf545", -272986786 ]
    // 0d0: bipush 4
    // 0d1: iastore
    // 0d2: goto 0d5
    // 0d5: ldc 2017110423
    // 0d7: dup
    // 0d8: iand
    // 0d9: ldc 109113720
    // 0db: ior
    // 0dc: ldc -544476678
    // 0de: iand
    // 0df: istore 1
    // 0e0: goto 1c8
    // 0e3: ldc -1925918011
    // 0e5: dup
    // 0e6: ishl
    // 0e7: ldc -110835855
    // 0e9: ior
    // 0ea: ldc -110307343
    // 0ec: iand
    // 0ed: istore 1
    // 0ee: goto 1c8
    // 0f1: invokedynamic JNT ()[I bsm=ufz.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -194177781, "ᜂ梂梂", "鍴鎈鍘", "붻뱻짻쑻", 1215988049 ]
    // 0f6: invokedynamic JNT ()Lwv; bsm=ufz.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -194177781, "椂ᘂ", "鍌鍈", "붻뱻욻탻퀻쇻", 1215988050 ]
    // 0fb: invokedynamic JNT (Ljava/lang/Object;)I bsm=ufz.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1907144762, "닿웿軿髿뛿竿껿", "ÃÂâ", "畆\uf545", -272986781 ]
    // 100: bipush 5
    // 101: iastore
    // 102: goto 108
    // 105: goto 17d
    // 108: ldc 733172368
    // 10a: ldc 146280487
    // 10c: iushr
    // 10d: ldc -1951918758
    // 10f: ior
    // 110: ldc -806701185
    // 112: iand
    // 113: istore 1
    // 114: goto 1c8
    // 117: return
    // 118: ldc -1830102209
    // 11a: ldc 376407239
    // 11c: ldc -162885213
    // 11e: ior
    // 11f: iand
    // 120: ldc -359531366
    // 122: ior
    // 123: ldc -275120165
    // 125: iand
    // 126: istore 1
    // 127: goto 189
    // 12a: ldc -680556002
    // 12c: istore 1
    // 12d: goto 164
    // 130: ldc 30839377
    // 132: ldc -1064395333
    // 134: iand
    // 135: ldc -419123290
    // 137: ior
    // 138: ldc -11554833
    // 13a: iand
    // 13b: istore 1
    // 13c: goto 189
    // 13f: astore 0
    // 140: goto 0e3
    // 143: ldc 968129564
    // 145: ldc -1417484029
    // 147: dup_x1
    // 148: isub
    // 149: isub
    // 14a: ldc -595236505
    // 14c: ixor
    // 14d: istore 1
    // 14e: goto 189
    // 151: astore 0
    // 152: goto 0af
    // 155: ldc -1300120745
    // 157: ldc 76543230
    // 159: ixor
    // 15a: ldc 29558800
    // 15c: ior
    // 15d: ldc 1472425329
    // 15f: iand
    // 160: istore 1
    // 161: goto 189
    // 164: invokedynamic JNT ()[Lwv; bsm=ufz.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -648761115, "훿竿껿쫿諿싿", "ÃÂäßøùÄ", "畆\uf545", -272986782 ]
    // 169: checkcast [Lwv;
    // 16c: arraylength
    // 16d: newarray 10
    // 16f: putstatic ufz.ouu [I
    // 172: goto 014
    // 175: astore 0
    // 176: goto 17d
    // 179: astore 0
    // 17a: goto 079
    // 17d: ldc 1129196383
    // 17f: ldc -213136994
    // 181: ixor
    // 182: ldc -412722467
    // 184: ixor
    // 185: istore 1
    // 186: goto 1c8
    // 189: iload 1
    // 18a: ldc 1638866569
    // 18c: isub
    // 18d: ldc 241612983
    // 18f: iadd
    // 190: ldc 1256747037
    // 192: isub
    // 193: ldc 1638887249
    // 195: isub
    // 196: ldc 518807999
    // 198: iadd
    // 199: ldc 1513894265
    // 19b: ixor
    // 19c: lookupswitch -35 4 -1159960459 -35 1402612579 -93 1546583391 -39 1827887305 -75
    // 1c8: iload 1
    // 1c9: ldc 1400942213
    // 1cb: ixor
    // 1cc: ldc 1285799827
    // 1ce: ixor
    // 1cf: ldc 973129118
    // 1d1: iadd
    // 1d2: ldc 108183961
    // 1d4: isub
    // 1d5: ldc 1173725866
    // 1d7: iadd
    // 1d8: ldc 139807946
    // 1da: iadd
    // 1db: lookupswitch -234 9 -1544746925 -338 -1014836123 -285 -956975040 -282 -904291197 -196 -891889415 -341 -181355177 -388 379722210 -214 1225736395 -391 1747499616 -234
    // 22c: astore 0
    // 22d: goto 048
    // 230: iload 1
    // 231: ldc 549019582
    // 233: isub
    // 234: ldc 801462861
    // 236: isub
    // 237: ldc 686415818
    // 239: iadd
    // 23a: ldc 1142972600
    // 23c: isub
    // 23d: ldc 1214795416
    // 23f: isub
    // 240: ldc 485784901
    // 242: isub
    // 243: lookupswitch -545 2 -702022667 -525 595876769 -545
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (var10 - 695271970 - 1482606188 + 658999620 + 753890972 ^ 283348332 ^ 2091045444) - 1417650445 - 1214080371 ^ 1907841283;
    MethodHandle var10000 = siqp[((var10 - 695271970 - 1482606188 + 658999620 + 753890972 ^ 283348332 ^ 2091045444) - 1417650445 - 1214080371 ^ 1907841283)
      - 1614072848];
    if (siqp[var10001 - 1614072848] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = 1282622085 << 639936101 ^ -1905766240; var23 < var13.length(); var23 += (1013992431 ^ -50124657 | 1) & 445417499) {
        char var42 = var13.charAt(var23);
        char var47 = (char)(
          (
              (
                    (
                        (
                              (
                                    (
                                        (((((var42 & '￼') >> 2 | var42 << 14) & 65520) >> 4 | ((var42 & '￼') >> 2 | var42 << 14) << 12) & 49152) >> 14
                                          | ((((var42 & '￼') >> 2 | var42 << 14) & 65520) >> 4 | ((var42 & '￼') >> 2 | var42 << 14) << 12) << 2
                                      )
                                      & 65520
                                  )
                                  >> 4
                                | (
                                    (((((var42 & '￼') >> 2 | var42 << 14) & 65520) >> 4 | ((var42 & '￼') >> 2 | var42 << 14) << 12) & 49152) >> 14
                                      | ((((var42 & '￼') >> 2 | var42 << 14) & 65520) >> 4 | ((var42 & '￼') >> 2 | var42 << 14) << 12) << 2
                                  )
                                  << 12
                            )
                            + 224
                            + 189
                            - 150
                          ^ 201
                      )
                      & 65532
                  )
                  >> 2
                | (
                    (
                          (
                                (
                                    (((((var42 & '￼') >> 2 | var42 << 14) & 65520) >> 4 | ((var42 & '￼') >> 2 | var42 << 14) << 12) & 49152) >> 14
                                      | ((((var42 & '￼') >> 2 | var42 << 14) & 65520) >> 4 | ((var42 & '￼') >> 2 | var42 << 14) << 12) << 2
                                  )
                                  & 65520
                              )
                              >> 4
                            | (
                                (((((var42 & '￼') >> 2 | var42 << 14) & 65520) >> 4 | ((var42 & '￼') >> 2 | var42 << 14) << 12) & 49152) >> 14
                                  | ((((var42 & '￼') >> 2 | var42 << 14) & 65520) >> 4 | ((var42 & '￼') >> 2 | var42 << 14) << 12) << 2
                              )
                              << 12
                        )
                        + 224
                        + 189
                        - 150
                      ^ 201
                  )
                  << 14
            )
            ^ 115
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
                                          (((((var42 & '￼') >> 2 | var42 << 14) & 65520) >> 4 | ((var42 & '￼') >> 2 | var42 << 14) << 12) & 49152) >> 14
                                            | ((((var42 & '￼') >> 2 | var42 << 14) & 65520) >> 4 | ((var42 & '￼') >> 2 | var42 << 14) << 12) << 2
                                        )
                                        & 65520
                                    )
                                    >> 4
                                  | (
                                      (((((var42 & '￼') >> 2 | var42 << 14) & 65520) >> 4 | ((var42 & '￼') >> 2 | var42 << 14) << 12) & 49152) >> 14
                                        | ((((var42 & '￼') >> 2 | var42 << 14) & 65520) >> 4 | ((var42 & '￼') >> 2 | var42 << 14) << 12) << 2
                                    )
                                    << 12
                              )
                              + 224
                              + 189
                              - 150
                            ^ 201
                        )
                        & 65532
                    )
                    >> 2
                  | (
                      (
                            (
                                  (
                                      (((((var42 & '￼') >> 2 | var42 << 14) & 65520) >> 4 | ((var42 & '￼') >> 2 | var42 << 14) << 12) & 49152) >> 14
                                        | ((((var42 & '￼') >> 2 | var42 << 14) & 65520) >> 4 | ((var42 & '￼') >> 2 | var42 << 14) << 12) << 2
                                    )
                                    & 65520
                                )
                                >> 4
                              | (
                                  (((((var42 & '￼') >> 2 | var42 << 14) & 65520) >> 4 | ((var42 & '￼') >> 2 | var42 << 14) << 12) & 49152) >> 14
                                    | ((((var42 & '￼') >> 2 | var42 << 14) & 65520) >> 4 | ((var42 & '￼') >> 2 | var42 << 14) << 12) << 2
                                )
                                << 12
                          )
                          + 224
                          + 189
                          - 150
                        ^ 201
                    )
                    << 14
              )
              ^ 115
          )
        );
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = -1431298606 >> 165842828 ^ -349439; var29 < var16.length(); var29 += 1622010548 & 1622010548 ^ 1622010549) {
        var16.setCharAt(var29, (char)(((var16.charAt(var29) + 209 ^ 71) - 203 - 155 - 91 - 197 + 251 ^ 185) - 38 ^ 227));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), ufz.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (917957819 << -1647462434 * 317988001 | 0) & 951496512; var35 < var19.length(); var35 += -1388818607 + -875292274 ^ 2030856414) {
        int var56 = var19.charAt(var35) + 135 - 238;
        char var61 = (char)(
          (
                (
                      (
                            (
                                (((((var56 & 65532) >> 2 | var56 << 14) + 239 & 65534) >> 1 | ((var56 & 65532) >> 2 | var56 << 14) + 239 << 15) & 0) >> 16
                                  | ((((var56 & 65532) >> 2 | var56 << 14) + 239 & 65534) >> 1 | ((var56 & 65532) >> 2 | var56 << 14) + 239 << 15) << 0
                              )
                              & 0
                          )
                          >> 16
                        | (
                            (((((var56 & 65532) >> 2 | var56 << 14) + 239 & 65534) >> 1 | ((var56 & 65532) >> 2 | var56 << 14) + 239 << 15) & 0) >> 16
                              | ((((var56 & 65532) >> 2 | var56 << 14) + 239 & 65534) >> 1 | ((var56 & 65532) >> 2 | var56 << 14) + 239 << 15) << 0
                          )
                          << 0
                    )
                    + 101
                    + 143
                  & 61440
              )
              >> 12
            | (
                  (
                        (
                            (((((var56 & 65532) >> 2 | var56 << 14) + 239 & 65534) >> 1 | ((var56 & 65532) >> 2 | var56 << 14) + 239 << 15) & 0) >> 16
                              | ((((var56 & 65532) >> 2 | var56 << 14) + 239 & 65534) >> 1 | ((var56 & 65532) >> 2 | var56 << 14) + 239 << 15) << 0
                          )
                          & 0
                      )
                      >> 16
                    | (
                        (((((var56 & 65532) >> 2 | var56 << 14) + 239 & 65534) >> 1 | ((var56 & 65532) >> 2 | var56 << 14) + 239 << 15) & 0) >> 16
                          | ((((var56 & 65532) >> 2 | var56 << 14) + 239 & 65534) >> 1 | ((var56 & 65532) >> 2 | var56 << 14) + 239 << 15) << 0
                      )
                      << 0
                )
                + 101
                + 143
              << 4
        );
        var19.setCharAt(
          var35,
          (char)(
            (
                  (
                        (
                              (
                                  (((((var56 & 65532) >> 2 | var56 << 14) + 239 & 65534) >> 1 | ((var56 & 65532) >> 2 | var56 << 14) + 239 << 15) & 0) >> 16
                                    | ((((var56 & 65532) >> 2 | var56 << 14) + 239 & 65534) >> 1 | ((var56 & 65532) >> 2 | var56 << 14) + 239 << 15) << 0
                                )
                                & 0
                            )
                            >> 16
                          | (
                              (((((var56 & 65532) >> 2 | var56 << 14) + 239 & 65534) >> 1 | ((var56 & 65532) >> 2 | var56 << 14) + 239 << 15) & 0) >> 16
                                | ((((var56 & 65532) >> 2 | var56 << 14) + 239 & 65534) >> 1 | ((var56 & 65532) >> 2 | var56 << 14) + 239 << 15) << 0
                            )
                            << 0
                      )
                      + 101
                      + 143
                    & 61440
                )
                >> 12
              | (
                    (
                          (
                              (((((var56 & 65532) >> 2 | var56 << 14) + 239 & 65534) >> 1 | ((var56 & 65532) >> 2 | var56 << 14) + 239 << 15) & 0) >> 16
                                | ((((var56 & 65532) >> 2 | var56 << 14) + 239 & 65534) >> 1 | ((var56 & 65532) >> 2 | var56 << 14) + 239 << 15) << 0
                            )
                            & 0
                        )
                        >> 16
                      | (
                          (((((var56 & 65532) >> 2 | var56 << 14) + 239 & 65534) >> 1 | ((var56 & 65532) >> 2 | var56 << 14) + 239 << 15) & 0) >> 16
                            | ((((var56 & 65532) >> 2 | var56 << 14) + 239 & 65534) >> 1 | ((var56 & 65532) >> 2 | var56 << 14) + 239 << 15) << 0
                        )
                        << 0
                  )
                  + 101
                  + 143
                << 4
          )
        );
      }

      Class var7 = Class.forName(var19.toString(), false, ufz.class.getClassLoader());
      switch ((var4 + 424016200 - 177994636 ^ 188355295) + 1938559438 - 1929636340 - 1483848273 - 1851718487 - 709098754 - 642561054 - 1579223321) {
        case 266873468:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 385068554:
        case 583864150:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 750802845:
          var10000 = var0.findSpecial(var7, var5, var6, ufz.class);
          break;
        case 2009756791:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    siqp[((var10 - 695271970 - 1482606188 + 658999620 + 753890972 ^ 283348332 ^ 2091045444) - 1417650445 - 1214080371 ^ 1907841283) - 1614072848] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = var10 - 1206511116 - 527357701 - 180628835 + 492330774 + 653371849 - 2001064628 + 1843291226 - 739784586 + 689484120;
    MethodHandle var10000 = siqp[var10 - 1206511116 - 527357701 - 180628835 + 492330774 + 653371849 - 2001064628 + 1843291226 - 739784586 + 689484120
      ^ 239119164];
    if (siqp[var10001 ^ 239119164] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = -2085768302 >> -2033025270 - -330082525 ^ -16295065; var24 < var14.length(); var24 += 530079678 ^ 530079678 ^ 1) {
        char var43 = var14.charAt(var24);
        char var46 = (char)(
          (
              ((((((var43 & 'ﰀ') >> 10 | var43 << 6) ^ 10) - 206 + 36 & 65024) >> 9 | (((var43 & 'ﰀ') >> 10 | var43 << 6) ^ 10) - 206 + 36 << 7) & 65528) >> 3
                | (((((var43 & 'ﰀ') >> 10 | var43 << 6) ^ 10) - 206 + 36 & 65024) >> 9 | (((var43 & 'ﰀ') >> 10 | var43 << 6) ^ 10) - 206 + 36 << 7) << 13
            )
            + 224
            - 53
            + 155
            + 206
        );
        var14.setCharAt(
          var24,
          (char)(
            (
                ((((((var43 & 'ﰀ') >> 10 | var43 << 6) ^ 10) - 206 + 36 & 65024) >> 9 | (((var43 & 'ﰀ') >> 10 | var43 << 6) ^ 10) - 206 + 36 << 7) & 65528)
                    >> 3
                  | (((((var43 & 'ﰀ') >> 10 | var43 << 6) ^ 10) - 206 + 36 & 65024) >> 9 | (((var43 & 'ﰀ') >> 10 | var43 << 6) ^ 10) - 206 + 36 << 7) << 13
              )
              + 224
              - 53
              + 155
              + 206
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (714929287 & -1734953876 | 0) & -785757901; var30 < var17.length(); var30 += (243673088 - -130711761 | 0) & 673710891) {
        int var51 = var17.charAt(var30) ^ 234;
        char var56 = (char)(
          (
              (
                    (
                        (
                              (
                                  (((((var51 & 65534) >> 1 | var51 << 15) & 63488) >> 11 | ((var51 & 65534) >> 1 | var51 << 15) << 5) + 43 + 172 & 57344) >> 13
                                    | ((((var51 & 65534) >> 1 | var51 << 15) & 63488) >> 11 | ((var51 & 65534) >> 1 | var51 << 15) << 5) + 43 + 172 << 3
                                )
                                & 64512
                            )
                            >> 10
                          | (
                              (((((var51 & 65534) >> 1 | var51 << 15) & 63488) >> 11 | ((var51 & 65534) >> 1 | var51 << 15) << 5) + 43 + 172 & 57344) >> 13
                                | ((((var51 & 65534) >> 1 | var51 << 15) & 63488) >> 11 | ((var51 & 65534) >> 1 | var51 << 15) << 5) + 43 + 172 << 3
                            )
                            << 6
                      )
                      & 32768
                  )
                  >> 15
                | (
                    (
                          (
                              (((((var51 & 65534) >> 1 | var51 << 15) & 63488) >> 11 | ((var51 & 65534) >> 1 | var51 << 15) << 5) + 43 + 172 & 57344) >> 13
                                | ((((var51 & 65534) >> 1 | var51 << 15) & 63488) >> 11 | ((var51 & 65534) >> 1 | var51 << 15) << 5) + 43 + 172 << 3
                            )
                            & 64512
                        )
                        >> 10
                      | (
                          (((((var51 & 65534) >> 1 | var51 << 15) & 63488) >> 11 | ((var51 & 65534) >> 1 | var51 << 15) << 5) + 43 + 172 & 57344) >> 13
                            | ((((var51 & 65534) >> 1 | var51 << 15) & 63488) >> 11 | ((var51 & 65534) >> 1 | var51 << 15) << 5) + 43 + 172 << 3
                        )
                        << 6
                  )
                  << 1
            )
            - 60
            - 58
        );
        var17.setCharAt(
          var30,
          (char)(
            (
                (
                      (
                          (
                                (
                                    (((((var51 & 65534) >> 1 | var51 << 15) & 63488) >> 11 | ((var51 & 65534) >> 1 | var51 << 15) << 5) + 43 + 172 & 57344)
                                        >> 13
                                      | ((((var51 & 65534) >> 1 | var51 << 15) & 63488) >> 11 | ((var51 & 65534) >> 1 | var51 << 15) << 5) + 43 + 172 << 3
                                  )
                                  & 64512
                              )
                              >> 10
                            | (
                                (((((var51 & 65534) >> 1 | var51 << 15) & 63488) >> 11 | ((var51 & 65534) >> 1 | var51 << 15) << 5) + 43 + 172 & 57344) >> 13
                                  | ((((var51 & 65534) >> 1 | var51 << 15) & 63488) >> 11 | ((var51 & 65534) >> 1 | var51 << 15) << 5) + 43 + 172 << 3
                              )
                              << 6
                        )
                        & 32768
                    )
                    >> 15
                  | (
                      (
                            (
                                (((((var51 & 65534) >> 1 | var51 << 15) & 63488) >> 11 | ((var51 & 65534) >> 1 | var51 << 15) << 5) + 43 + 172 & 57344) >> 13
                                  | ((((var51 & 65534) >> 1 | var51 << 15) & 63488) >> 11 | ((var51 & 65534) >> 1 | var51 << 15) << 5) + 43 + 172 << 3
                              )
                              & 64512
                          )
                          >> 10
                        | (
                            (((((var51 & 65534) >> 1 | var51 << 15) & 63488) >> 11 | ((var51 & 65534) >> 1 | var51 << 15) << 5) + 43 + 172 & 57344) >> 13
                              | ((((var51 & 65534) >> 1 | var51 << 15) & 63488) >> 11 | ((var51 & 65534) >> 1 | var51 << 15) << 5) + 43 + 172 << 3
                          )
                          << 6
                    )
                    << 1
              )
              - 60
              - 58
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, ufz.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (-1599536439 << 1852905404 | 0) & 1843282332; var36 < var20.length(); var36 += (-1738270070 | 2058504825 | 1) & 631809) {
        int var61 = ((var20.charAt(var36) ^ 172 ^ 50) - 73 ^ 82) - 15;
        char var62 = (char)(((var61 & 65472) >> 6 | var61 << 10) - 17 - 26 + 126 + 228);
        var20.setCharAt(var36, (char)(((var61 & 65472) >> 6 | var61 << 10) - 17 - 26 + 126 + 228));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), ufz.class.getClassLoader()).returnType();
      switch (((var4 + 1525973804 + 1365515659 ^ 2090180187) + 2067806930 - 126315282 ^ 860502605) - 1743459597 + 924161827 + 21709590 ^ 1585215818) {
        case 77320904:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1062047667:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1641539501:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1841626890:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      siqp[var10 - 1206511116 - 527357701 - 180628835 + 492330774 + 653371849 - 2001064628 + 1843291226 - 739784586 + 689484120 ^ 239119164] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
