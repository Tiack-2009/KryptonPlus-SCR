// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

// $VF: synthetic class
public class qdb {
  public static final MethodHandle[] chm;
  static {
    // $VF: Couldn't be decompiled
    // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
    // java.lang.RuntimeException: parsing failure!
    //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
    //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
    //
    // Bytecode:
    // 000: ldc -1236295809
    // 002: ldc 1984588424
    // 004: ishr
    // 005: bipush 2
    // 006: ior
    // 007: ldc 4718675
    // 009: iand
    // 00a: anewarray 23
    // 00d: putstatic qdb.chm [Ljava/lang/invoke/MethodHandle;
    // 010: goto 148
    // 013: ldc 978076386
    // 015: ldc 1561620298
    // 017: ixor
    // 018: ldc -2071985200
    // 01a: ior
    // 01b: ldc -593483785
    // 01d: iand
    // 01e: istore 1
    // 01f: goto 262
    // 022: goto 045
    // 025: invokedynamic JNT ()[I bsm=qdb.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1650454300, "鮭\udba9", "ᚻ\uf4b8\uf8b8", "ﺳ욳嚱운", 187226444 ]
    // 02a: invokedynamic JNT ()Lnet/minecraft/class_2350; bsm=qdb.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1650454300, "鮮宯宮ᮬᮮ\udba8宽宽ᮽ\udbbd鮢", "Ⴛﺸᒻ邸ົڻႻﺸ\uf2b8ᢻ\uf6b8¸ᒻ邸\uf2b8һ\uf6b8ኻኻ\ueab8颸銸麸貸", "ﺳ욳\udeb4⺲\ue6b1Ẳ㚴⚲욱⺲\ue6b1隱າ蚱\ueeb1Ẳ㚴隱\udeb1蚱ᚲᚲ뚱ິᚴ暴㺴嚴", 187226441 ]
    // 02f: invokedynamic JNT (Ljava/lang/Object;)I bsm=qdb.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1198798437, "ǓǁťǏƹşǕ", "⺵\u2ef5㛵", "锟焟괟锞鄟脟锟焟椟ꔟ感生괟锞椟负感ꤟꤟ够ꔞꤞ넞鴞", -1208768674 ]
    // 034: bipush 1
    // 035: iastore
    // 036: goto 039
    // 039: ldc -1010300947
    // 03b: ldc 420984254
    // 03d: imul
    // 03e: ldc 1993956862
    // 040: ixor
    // 041: istore 1
    // 042: goto 262
    // 045: ldc -1079533934
    // 047: ldc -871725292
    // 049: ishr
    // 04a: ldc -1720127232
    // 04c: ixor
    // 04d: istore 1
    // 04e: goto 14e
    // 051: goto 074
    // 054: invokedynamic JNT ()[I bsm=qdb.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1650454300, "鮭\udba9", "ᚻ\uf4b8\uf8b8", "ﺳ욳嚱운", 187226439 ]
    // 059: invokedynamic JNT ()Lnet/minecraft/class_2350; bsm=qdb.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1650454300, "鮮宯宮ᮬᮮ\udba8宽宽ᮽ\udbbd\udbbd", "Ⴛﺸᒻ邸ົڻႻﺸ\uf2b8ᢻ\uf6b8¸ᒻ邸\uf2b8һ\uf6b8ኻኻ\ueab8颸銸麸貸", "ﺳ욳\udeb4⺲\ue6b1Ẳ㚴⚲욱⺲\ue6b1隱າ蚱\ueeb1Ẳ㚴隱\udeb1蚱ᚲᚲ뚱ິᚴ暴㺴嚴", 187226440 ]
    // 05e: invokedynamic JNT (Ljava/lang/Object;)I bsm=qdb.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1198798437, "ǓǁťǏƹşǕ", "⺵\u2ef5㛵", "锟焟괟锞鄟脟锟焟椟ꔟ感生괟锞椟负感ꤟꤟ够ꔞꤞ넞鴞", -1208768677 ]
    // 063: bipush 2
    // 064: iastore
    // 065: goto 068
    // 068: ldc 2025160235
    // 06a: ldc 75524269
    // 06c: isub
    // 06d: ldc 1606914845
    // 06f: ixor
    // 070: istore 1
    // 071: goto 14e
    // 074: ldc 1256403908
    // 076: ldc -1806907046
    // 078: ixor
    // 079: ldc 160237930
    // 07b: ior
    // 07c: ldc 801972203
    // 07e: iand
    // 07f: istore 1
    // 080: goto 14e
    // 083: invokedynamic JNT ()[I bsm=qdb.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1650454300, "鮭\udba9", "ᚻ\uf4b8\uf8b8", "ﺳ욳嚱운", 187226438 ]
    // 088: invokedynamic JNT ()Lnet/minecraft/class_2350; bsm=qdb.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1650454300, "鮮宯宮ᮬᮮ\udba8宽宽ᮽᮢ\udbbd", "Ⴛﺸᒻ邸ົڻႻﺸ\uf2b8ᢻ\uf6b8¸ᒻ邸\uf2b8һ\uf6b8ኻኻ\ueab8颸銸麸貸", "ﺳ욳\udeb4⺲\ue6b1Ẳ㚴⚲욱⺲\ue6b1隱າ蚱\ueeb1Ẳ㚴隱\udeb1蚱ᚲᚲ뚱ິᚴ暴㺴嚴", 187226435 ]
    // 08d: invokedynamic JNT (Ljava/lang/Object;)I bsm=qdb.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1198798437, "ǓǁťǏƹşǕ", "⺵\u2ef5㛵", "锟焟괟锞鄟脟锟焟椟ꔟ感生괟锞椟负感ꤟꤟ够ꔞꤞ넞鴞", -1208768680 ]
    // 092: bipush 3
    // 093: iastore
    // 094: goto 09a
    // 097: goto 0a6
    // 09a: ldc -1178648539
    // 09c: ldc -1777927929
    // 09e: iushr
    // 09f: ldc -837479442
    // 0a1: ixor
    // 0a2: istore 1
    // 0a3: goto 14e
    // 0a6: ldc 499418073
    // 0a8: dup
    // 0a9: ishl
    // 0aa: ldc -108770621
    // 0ac: ixor
    // 0ad: istore 1
    // 0ae: goto 14e
    // 0b1: goto 0d4
    // 0b4: invokedynamic JNT ()[I bsm=qdb.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1650454300, "鮭\udba9", "ᚻ\uf4b8\uf8b8", "ﺳ욳嚱운", 187226433 ]
    // 0b9: invokedynamic JNT ()Lnet/minecraft/class_2350; bsm=qdb.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1650454300, "鮮宯宮ᮬᮮ\udba8宽宽ᮽ\udbbd客", "Ⴛﺸᒻ邸ົڻႻﺸ\uf2b8ᢻ\uf6b8¸ᒻ邸\uf2b8һ\uf6b8ኻኻ\ueab8颸銸麸貸", "ﺳ욳\udeb4⺲\ue6b1Ẳ㚴⚲욱⺲\ue6b1隱າ蚱\ueeb1Ẳ㚴隱\udeb1蚱ᚲᚲ뚱ິᚴ暴㺴嚴", 187226434 ]
    // 0be: invokedynamic JNT (Ljava/lang/Object;)I bsm=qdb.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1198798437, "ǓǁťǏƹşǕ", "⺵\u2ef5㛵", "锟焟괟锞鄟脟锟焟椟ꔟ感生괟锞椟负感ꤟꤟ够ꔞꤞ넞鴞", -1208768683 ]
    // 0c3: bipush 4
    // 0c4: iastore
    // 0c5: goto 0c8
    // 0c8: ldc -1183390496
    // 0ca: ldc 1943050422
    // 0cc: ixor
    // 0cd: ldc 612057409
    // 0cf: ixor
    // 0d0: istore 1
    // 0d1: goto 14e
    // 0d4: ldc 1622853617
    // 0d6: ldc -932357358
    // 0d8: ixor
    // 0d9: ldc 522731301
    // 0db: ior
    // 0dc: ldc 1064927015
    // 0de: iand
    // 0df: istore 1
    // 0e0: goto 14e
    // 0e3: goto 106
    // 0e6: invokedynamic JNT ()[I bsm=qdb.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1650454300, "鮭\udba9", "ᚻ\uf4b8\uf8b8", "ﺳ욳嚱운", 187226432 ]
    // 0eb: invokedynamic JNT ()Lnet/minecraft/class_2350; bsm=qdb.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1650454300, "鮮宯宮ᮬᮮ\udba8宽宽ᮽ\udbbd宣", "Ⴛﺸᒻ邸ົڻႻﺸ\uf2b8ᢻ\uf6b8¸ᒻ邸\uf2b8һ\uf6b8ኻኻ\ueab8颸銸麸貸", "ﺳ욳\udeb4⺲\ue6b1Ẳ㚴⚲욱⺲\ue6b1隱າ蚱\ueeb1Ẳ㚴隱\udeb1蚱ᚲᚲ뚱ິᚴ暴㺴嚴", 187226429 ]
    // 0f0: invokedynamic JNT (Ljava/lang/Object;)I bsm=qdb.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1198798437, "ǓǁťǏƹşǕ", "⺵\u2ef5㛵", "锟焟괟锞鄟脟锟焟椟ꔟ感生괟锞椟负感ꤟꤟ够ꔞꤞ넞鴞", -1208768686 ]
    // 0f5: bipush 5
    // 0f6: iastore
    // 0f7: goto 0fa
    // 0fa: ldc 2064390741
    // 0fc: ldc -1209333333
    // 0fe: iadd
    // 0ff: ldc 2022960742
    // 101: ixor
    // 102: istore 1
    // 103: goto 14e
    // 106: ldc 1338307224
    // 108: ldc -467001375
    // 10a: ior
    // 10b: ldc -407683137
    // 10d: ixor
    // 10e: istore 1
    // 10f: goto 14e
    // 112: goto 24f
    // 115: invokedynamic JNT ()[I bsm=qdb.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1650454300, "鮭\udba9", "ᚻ\uf4b8\uf8b8", "ﺳ욳嚱운", 187226427 ]
    // 11a: invokedynamic JNT ()Lnet/minecraft/class_2350; bsm=qdb.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1650454300, "鮮宯宮ᮬᮮ\udba8宽宽ᮽ\udbbdᮢ", "Ⴛﺸᒻ邸ົڻႻﺸ\uf2b8ᢻ\uf6b8¸ᒻ邸\uf2b8һ\uf6b8ኻኻ\ueab8颸銸麸貸", "ﺳ욳\udeb4⺲\ue6b1Ẳ㚴⚲욱⺲\ue6b1隱າ蚱\ueeb1Ẳ㚴隱\udeb1蚱ᚲᚲ뚱ິᚴ暴㺴嚴", 187226428 ]
    // 11f: invokedynamic JNT (Ljava/lang/Object;)I bsm=qdb.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1198798437, "ǓǁťǏƹşǕ", "⺵\u2ef5㛵", "锟焟괟锞鄟脟锟焟椟ꔟ感生괟锞椟负感ꤟꤟ够ꔞꤞ넞鴞", -1208768689 ]
    // 124: bipush 6
    // 126: iastore
    // 127: goto 12a
    // 12a: ldc 1797844010
    // 12c: ldc 367013370
    // 12e: iand
    // 12f: ldc 838894675
    // 131: ior
    // 132: ldc 844400255
    // 134: iand
    // 135: istore 1
    // 136: goto 14e
    // 139: astore 0
    // 13a: goto 0d4
    // 13d: ldc 610025443
    // 13f: dup
    // 140: imul
    // 141: ldc 1361023419
    // 143: ixor
    // 144: istore 1
    // 145: goto 1ed
    // 148: ldc 1564832195
    // 14a: istore 1
    // 14b: goto 1cc
    // 14e: iload 1
    // 14f: ldc 2055721791
    // 151: isub
    // 152: ldc 711035181
    // 154: iadd
    // 155: ldc 1277727708
    // 157: ixor
    // 158: ldc 450648283
    // 15a: isub
    // 15b: ldc 1377477714
    // 15d: ixor
    // 15e: ldc 2057785014
    // 160: iadd
    // 161: lookupswitch -202 11 -1447411306 -272 -985775443 -202 -401036095 -269 85105713 -222 100694037 -76 1001669438 -79 1137339829 -126 1227353462 -173 1263425584 252 1428945010 -123 1618997858 -176
    // 1c4: astore 0
    // 1c5: goto 24f
    // 1c8: astore 0
    // 1c9: goto 0a6
    // 1cc: invokedynamic JNT ()[Lnet/minecraft/class_2350; bsm=qdb.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 1667964467, "ƩşǕǇŧƻ", "⺵\u2ef5㩵㖵㴵㯵㾵\u2d75㷵㻵㴵㯵㱵䀵㳵㬵㾵\u2d75㱵㶵㳵䁵䁵㥵〵ふ⿵サ㉵", "锟焟괟锞鄟脟锟焟椟ꔟ感生괟锞椟负感ꤟꤟ够ꔞꤞ넞鴞", -1208768690 ]
    // 1d1: checkcast [Lnet/minecraft/class_2350;
    // 1d4: arraylength
    // 1d5: newarray 10
    // 1d7: putstatic qdb.rc [I
    // 1da: goto 013
    // 1dd: astore 0
    // 1de: goto 106
    // 1e1: ldc 782049399
    // 1e3: ldc -2065202031
    // 1e5: ishl
    // 1e6: ldc 519266294
    // 1e8: ixor
    // 1e9: istore 1
    // 1ea: goto 1ed
    // 1ed: iload 1
    // 1ee: ldc 1406932351
    // 1f0: iadd
    // 1f1: ldc 1154269525
    // 1f3: isub
    // 1f4: ldc 899155221
    // 1f6: ixor
    // 1f7: ldc 1130066734
    // 1f9: iadd
    // 1fa: ldc 904519557
    // 1fc: iadd
    // 1fd: ldc 1562172512
    // 1ff: isub
    // 200: lookupswitch -56 5 -1061824420 -199 -802545329 -56 878342801 -35 1336244818 52 1960650632 -60
    // 234: astore 0
    // 235: goto 074
    // 238: ldc 429781437
    // 23a: dup
    // 23b: ishr
    // 23c: ldc 513451265
    // 23e: ixor
    // 23f: istore 1
    // 240: goto 1ed
    // 243: ldc 2069654694
    // 245: ldc 1759365935
    // 247: iadd
    // 248: ldc 334464277
    // 24a: ixor
    // 24b: istore 1
    // 24c: goto 1ed
    // 24f: ldc 1133825855
    // 251: dup
    // 252: ldc 1347771315
    // 254: ior
    // 255: iadd
    // 256: ldc -1229819633
    // 258: ixor
    // 259: istore 1
    // 25a: goto 14e
    // 25d: return
    // 25e: astore 0
    // 25f: goto 045
    // 262: iload 1
    // 263: ldc 733866428
    // 265: iadd
    // 266: ldc 720466698
    // 268: ixor
    // 269: ldc 1532655657
    // 26b: iadd
    // 26c: ldc 1911235870
    // 26e: ixor
    // 26f: ldc 854292373
    // 271: iadd
    // 272: ldc 1774913105
    // 274: isub
    // 275: lookupswitch -592 2 -1140772259 -595 283341077 -592
    // 290: ldc -862374350
    // 292: dup
    // 293: isub
    // 294: ldc 1921670079
    // 296: ixor
    // 297: istore 1
    // 298: goto 1ed
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (var10 - 405477070 + 374833926 - 868871325 - 2098884744 + 216118143 + 367310120 - 1653782626 ^ 775188031) - 1794336154;
    MethodHandle var10000 = chm[(var10 - 405477070 + 374833926 - 868871325 - 2098884744 + 216118143 + 367310120 - 1653782626 ^ 775188031)
      - 1794336154
      + 2140691731];
    if (chm[var10001 + 2140691731] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = 1987086023 + 652023961 ^ -1655857312; var23 < var13.length(); var23 += -1490762260 >> -1031653856 ^ -1490762259) {
        int var42 = var13.charAt(var23) - 216;
        int var10004 = (var42 & 65528) >> 3;
        int var43 = ((var42 & 65528) >> 3 | var42 << 13) ^ 134 ^ 192;
        int var83 = ((((var42 & 65528) >> 3 | var42 << 13) ^ 134 ^ 192) & 57344) >> 13;
        var42 = ((((var10004 | var42 << 13) ^ 134 ^ 192) & 57344) >> 13 | (((var42 & 65528) >> 3 | var42 << 13) ^ 134 ^ 192) << 3) + 21;
        var10004 = ((var83 | var43 << 3) + 21 & 65528) >> 3;
        int var45 = (((var83 | var43 << 3) + 21 & 65528) >> 3 | var42 << 13) - 103;
        int var85 = ((((var83 | var43 << 3) + 21 & 65528) >> 3 | var42 << 13) - 103 & 49152) >> 14;
        char var46 = (char)((((var10004 | var42 << 13) - 103 & 49152) >> 14 | (((var83 | var43 << 3) + 21 & 65528) >> 3 | var42 << 13) - 103 << 2) + 152);
        var13.setCharAt(var23, (char)((var85 | var45 << 2) + 152));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (-571004075 & 340258376 | 0) & 1083183524; var29 < var16.length(); var29 += -100502570 & 831409892 ^ 805454533) {
        int var51 = var16.charAt(var29) + 244 ^ 253;
        int var86 = (var51 & 65534) >> 1;
        int var52 = ((var51 & 65534) >> 1 | var51 << 15) ^ 254 ^ 45 ^ 121;
        int var87 = ((((var51 & 65534) >> 1 | var51 << 15) ^ 254 ^ 45 ^ 121) & 65504) >> 5;
        var51 = ((((var86 | var51 << 15) ^ 254 ^ 45 ^ 121) & 65504) >> 5 | (((var51 & 65534) >> 1 | var51 << 15) ^ 254 ^ 45 ^ 121) << 11) - 144;
        var86 = ((var87 | var52 << 11) - 144 & 0) >> 16;
        int var54 = ((var87 | var52 << 11) - 144 & 0) >> 16 | var51 << 0;
        int var89 = ((((var87 | var52 << 11) - 144 & 0) >> 16 | var51 << 0) & 0) >> 16;
        char var55 = (char)(((var86 | var51 << 0) & 0) >> 16 | (((var87 | var52 << 11) - 144 & 0) >> 16 | var51 << 0) << 0);
        var16.setCharAt(var29, (char)(var89 | var54 << 0));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), qdb.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (-87284633 | -983254649 | 0) & 1196032; var35 < var19.length(); var35 += -766791128 << -766791128 ^ 1269966849) {
        int var60 = var19.charAt(var35) + 148;
        char var63 = (char)(
          (
              ((((((var60 & 65534) >> 1 | var60 << 15) & 65535) >> 0 | ((var60 & 65534) >> 1 | var60 << 15) << 16) - 190 + 64 - 156 ^ 65) & 65024) >> 9
                | (((((var60 & 65534) >> 1 | var60 << 15) & 65535) >> 0 | ((var60 & 65534) >> 1 | var60 << 15) << 16) - 190 + 64 - 156 ^ 65) << 7
            )
            + 91
            + 175
        );
        var19.setCharAt(
          var35,
          (char)(
            (
                ((((((var60 & 65534) >> 1 | var60 << 15) & 65535) >> 0 | ((var60 & 65534) >> 1 | var60 << 15) << 16) - 190 + 64 - 156 ^ 65) & 65024) >> 9
                  | (((((var60 & 65534) >> 1 | var60 << 15) & 65535) >> 0 | ((var60 & 65534) >> 1 | var60 << 15) << 16) - 190 + 64 - 156 ^ 65) << 7
              )
              + 91
              + 175
          )
        );
      }

      Class var7 = Class.forName(var19.toString(), false, qdb.class.getClassLoader());
      switch ((((var4 - 327771002 ^ 137772844) + 1018599964 + 1328714836 ^ 891029307) - 1163577301 ^ 795326676) - 808631957 + 1778149395 + 1438808775) {
        case 306173204:
        case 2035098858:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 510818306:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 1592496616:
          var10000 = var0.findSpecial(var7, var5, var6, qdb.class);
          break;
        case 2049068634:
          var10000 = var0.findConstructor(var7, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    chm[(var10 - 405477070 + 374833926 - 868871325 - 2098884744 + 216118143 + 367310120 - 1653782626 ^ 775188031) - 1794336154 + 2140691731] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (var10 + 2030263491 - 1468274326 ^ 1467517342) - 551212113 + 409533823 - 567871472 - 384969497 - 622884671 - 104529927;
    MethodHandle var10000 = chm[(var10 + 2030263491 - 1468274326 ^ 1467517342)
      - 551212113
      + 409533823
      - 567871472
      - 384969497
      - 622884671
      - 104529927
      - 255333830];
    if (chm[var10001 - 255333830] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = 349758410 + 1767253381 ^ 2117011791; var24 < var14.length(); var24 += 1352761205 << -1634850395 ^ 338685601) {
        int var43 = var14.charAt(var24) ^ 144 ^ 34;
        char var48 = (char)(
          (
              (
                    (
                        (
                              (
                                  ((((((var43 & 0) >> 16 | var43 << 0) & 65504) >> 5 | ((var43 & 0) >> 16 | var43 << 0) << 11) ^ 217) & 65528) >> 3
                                    | (((((var43 & 0) >> 16 | var43 << 0) & 65504) >> 5 | ((var43 & 0) >> 16 | var43 << 0) << 11) ^ 217) << 13
                                )
                                & 65535
                            )
                            >> 0
                          | (
                              ((((((var43 & 0) >> 16 | var43 << 0) & 65504) >> 5 | ((var43 & 0) >> 16 | var43 << 0) << 11) ^ 217) & 65528) >> 3
                                | (((((var43 & 0) >> 16 | var43 << 0) & 65504) >> 5 | ((var43 & 0) >> 16 | var43 << 0) << 11) ^ 217) << 13
                            )
                            << 16
                      )
                      & 65472
                  )
                  >> 6
                | (
                    (
                          (
                              ((((((var43 & 0) >> 16 | var43 << 0) & 65504) >> 5 | ((var43 & 0) >> 16 | var43 << 0) << 11) ^ 217) & 65528) >> 3
                                | (((((var43 & 0) >> 16 | var43 << 0) & 65504) >> 5 | ((var43 & 0) >> 16 | var43 << 0) << 11) ^ 217) << 13
                            )
                            & 65535
                        )
                        >> 0
                      | (
                          ((((((var43 & 0) >> 16 | var43 << 0) & 65504) >> 5 | ((var43 & 0) >> 16 | var43 << 0) << 11) ^ 217) & 65528) >> 3
                            | (((((var43 & 0) >> 16 | var43 << 0) & 65504) >> 5 | ((var43 & 0) >> 16 | var43 << 0) << 11) ^ 217) << 13
                        )
                        << 16
                  )
                  << 10
            )
            - 180
            + 40
        );
        var14.setCharAt(
          var24,
          (char)(
            (
                (
                      (
                          (
                                (
                                    ((((((var43 & 0) >> 16 | var43 << 0) & 65504) >> 5 | ((var43 & 0) >> 16 | var43 << 0) << 11) ^ 217) & 65528) >> 3
                                      | (((((var43 & 0) >> 16 | var43 << 0) & 65504) >> 5 | ((var43 & 0) >> 16 | var43 << 0) << 11) ^ 217) << 13
                                  )
                                  & 65535
                              )
                              >> 0
                            | (
                                ((((((var43 & 0) >> 16 | var43 << 0) & 65504) >> 5 | ((var43 & 0) >> 16 | var43 << 0) << 11) ^ 217) & 65528) >> 3
                                  | (((((var43 & 0) >> 16 | var43 << 0) & 65504) >> 5 | ((var43 & 0) >> 16 | var43 << 0) << 11) ^ 217) << 13
                              )
                              << 16
                        )
                        & 65472
                    )
                    >> 6
                  | (
                      (
                            (
                                ((((((var43 & 0) >> 16 | var43 << 0) & 65504) >> 5 | ((var43 & 0) >> 16 | var43 << 0) << 11) ^ 217) & 65528) >> 3
                                  | (((((var43 & 0) >> 16 | var43 << 0) & 65504) >> 5 | ((var43 & 0) >> 16 | var43 << 0) << 11) ^ 217) << 13
                              )
                              & 65535
                          )
                          >> 0
                        | (
                            ((((((var43 & 0) >> 16 | var43 << 0) & 65504) >> 5 | ((var43 & 0) >> 16 | var43 << 0) << 11) ^ 217) & 65528) >> 3
                              | (((((var43 & 0) >> 16 | var43 << 0) & 65504) >> 5 | ((var43 & 0) >> 16 | var43 << 0) << 11) ^ 217) << 13
                          )
                          << 16
                    )
                    << 10
              )
              - 180
              + 40
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (1683902758 & 1683902758 | 0) & 276867265; var30 < var17.length(); var30 += (-705310307 * -1749251493 | 0) & -465567215) {
        int var53 = (var17.charAt(var30) ^ 149) - 92;
        int var92 = (var53 & 32768) >> 15;
        int var54 = ((var53 & 32768) >> 15 | var53 << 1) ^ 162 ^ 146;
        int var93 = ((((var53 & 32768) >> 15 | var53 << 1) ^ 162 ^ 146) & 65520) >> 4;
        var53 = ((((var92 | var53 << 1) ^ 162 ^ 146) & 65520) >> 4 | (((var53 & 32768) >> 15 | var53 << 1) ^ 162 ^ 146) << 12) ^ 185;
        var92 = (((var93 | var54 << 12) ^ 185) & 32768) >> 15;
        int var56 = (((var93 | var54 << 12) ^ 185) & 32768) >> 15 | var53 << 1;
        int var95 = (((((var93 | var54 << 12) ^ 185) & 32768) >> 15 | var53 << 1) & 65408) >> 7;
        char var57 = (char)((((var92 | var53 << 1) & 65408) >> 7 | ((((var93 | var54 << 12) ^ 185) & 32768) >> 15 | var53 << 1) << 9) - 151);
        var17.setCharAt(var30, (char)((var95 | var56 << 9) - 151));
      }

      Class var6 = Class.forName(var17.toString(), false, qdb.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (882875386 >> 887304782 | 0) & -215743232; var36 < var20.length(); var36 += 2008301222 >> -2071119402 ^ 479) {
        int var62 = var20.charAt(var36) - ' ' + 117;
        int var96 = (var62 & 57344) >> 13;
        int var63 = (var62 & 57344) >> 13 | var62 << 3;
        int var97 = (((var62 & 57344) >> 13 | var62 << 3) & 65528) >> 3;
        var62 = (((var96 | var62 << 3) & 65528) >> 3 | ((var62 & 57344) >> 13 | var62 << 3) << 13) + 242;
        var96 = ((var97 | var63 << 13) + 242 & 49152) >> 14;
        int var65 = ((var97 | var63 << 13) + 242 & 49152) >> 14 | var62 << 2;
        int var99 = ((((var97 | var63 << 13) + 242 & 49152) >> 14 | var62 << 2) & 57344) >> 13;
        char var66 = (char)(((((var96 | var62 << 2) & 57344) >> 13 | (((var97 | var63 << 13) + 242 & 49152) >> 14 | var62 << 2) << 3) ^ 55 ^ 243) + 141);
        var20.setCharAt(var36, (char)(((var99 | var65 << 3) ^ 55 ^ 243) + 141));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), qdb.class.getClassLoader()).returnType();
      switch ((var4 + 585356238 + 264417934 + 1834298859 - 811680826 ^ 1342517181 ^ 590606948 ^ 907742334 ^ 1902346536) + 727952547 ^ 1554296228) {
        case 1123969493:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1303581165:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1337646479:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1839969934:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      chm[(var10 + 2030263491 - 1468274326 ^ 1467517342) - 551212113 + 409533823 - 567871472 - 384969497 - 622884671 - 104529927 - 255333830] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
