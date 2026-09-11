package dev.krypton.jnt3;

// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.io.IOException;

public class Loader {
  public Loader() {
    int var1 = -2090775134;
    var1 = 1842943572 * 1002661501 ^ -692485898;

    while (true) {
      switch (var1) {
        case -1453793294:
        default:
          var1 = 1958306557 - (-63269613 << 1958306557) ^ -1533638954;
          break;
        case -1339038677:
          super();
          return;
      }
    }
  }

  public static byte[] decompress(byte[] param0) throws IOException {
    // $VF: Couldn't be decompiled
    // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
    // java.lang.RuntimeException: parsing failure!
    //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
    //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
    //
    // Bytecode:
    // 000: ldc -331581152
    // 002: istore 7
    // 004: goto 007
    // 007: ldc 1121196181
    // 009: dup
    // 00a: swap
    // 00b: ior
    // 00c: ldc -1589080807
    // 00e: ior
    // 00f: ldc -110432769
    // 011: iand
    // 012: istore 7
    // 014: goto 198
    // 017: ldc 1432605386
    // 019: dup
    // 01a: iand
    // 01b: ldc 1320468208
    // 01d: ior
    // 01e: ldc 1593704433
    // 020: iand
    // 021: istore 7
    // 023: goto 198
    // 026: new java/util/zip/GZIPInputStream
    // 029: dup
    // 02a: aload 1
    // 02b: invokespecial java/util/zip/GZIPInputStream.<init> (Ljava/io/InputStream;)V
    // 02e: astore 2
    // 02f: goto 032
    // 032: new java/io/ByteArrayOutputStream
    // 035: dup
    // 036: invokespecial java/io/ByteArrayOutputStream.<init> ()V
    // 039: astore 3
    // 03a: goto 03d
    // 03d: sipush 1024
    // 040: newarray 8
    // 042: astore 4
    // 044: goto 047
    // 047: aload 2
    // 048: aload 4
    // 04a: invokevirtual java/util/zip/GZIPInputStream.read ([B)I
    // 04d: dup
    // 04e: istore 5
    // 050: goto 053
    // 053: ifle 06c
    // 056: goto 059
    // 059: ldc 1091982975
    // 05b: ldc 1159473832
    // 05d: ldc -119824686
    // 05f: iand
    // 060: ishl
    // 061: ldc -1035132384
    // 063: ior
    // 064: ldc -16958619
    // 066: iand
    // 067: istore 7
    // 069: goto 15f
    // 06c: ldc 1677574727
    // 06e: ldc -1551632834
    // 070: ishl
    // 071: ldc 86811807
    // 073: ixor
    // 074: istore 7
    // 076: goto 15f
    // 079: aload 3
    // 07a: invokevirtual java/io/ByteArrayOutputStream.close ()V
    // 07d: goto 0a8
    // 080: aload 3
    // 081: aload 4
    // 083: bipush 0
    // 084: iload 5
    // 086: invokevirtual java/io/ByteArrayOutputStream.write ([BII)V
    // 089: goto 047
    // 08c: aload 3
    // 08d: invokevirtual java/io/ByteArrayOutputStream.toByteArray ()[B
    // 090: astore 6
    // 092: goto 095
    // 095: ldc 2113886566
    // 097: dup
    // 098: iushr
    // 099: ldc 595340949
    // 09b: ixor
    // 09c: istore 7
    // 09e: goto 136
    // 0a1: aload 2
    // 0a2: invokevirtual java/util/zip/GZIPInputStream.close ()V
    // 0a5: goto 0b7
    // 0a8: ldc 1961277491
    // 0aa: dup
    // 0ab: ishr
    // 0ac: ldc -1353818008
    // 0ae: ior
    // 0af: ldc -278989971
    // 0b1: iand
    // 0b2: istore 7
    // 0b4: goto 136
    // 0b7: ldc -375190862
    // 0b9: ldc 901828665
    // 0bb: imul
    // 0bc: ldc -1837062643
    // 0be: ior
    // 0bf: ldc -1817727347
    // 0c1: iand
    // 0c2: istore 7
    // 0c4: goto 136
    // 0c7: astore 4
    // 0c9: goto 0cc
    // 0cc: ldc -1380989354
    // 0ce: ldc 281121262
    // 0d0: ishl
    // 0d1: ldc -2032517108
    // 0d3: ior
    // 0d4: ldc -1478821892
    // 0d6: iand
    // 0d7: istore 7
    // 0d9: goto 17c
    // 0dc: aload 3
    // 0dd: invokevirtual java/io/ByteArrayOutputStream.close ()V
    // 0e0: goto 0e6
    // 0e3: goto 0ff
    // 0e6: ldc 1360500136
    // 0e8: ldc -407991623
    // 0ea: imul
    // 0eb: ldc -1518099971
    // 0ed: ixor
    // 0ee: istore 7
    // 0f0: goto 17c
    // 0f3: astore 5
    // 0f5: aload 4
    // 0f7: aload 5
    // 0f9: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
    // 0fc: goto 0ff
    // 0ff: aload 4
    // 101: athrow
    // 102: astore 3
    // 103: goto 106
    // 106: ldc 94277142
    // 108: dup
    // 109: iushr
    // 10a: ldc -1832008374
    // 10c: ixor
    // 10d: istore 7
    // 10f: goto 1c3
    // 112: aload 2
    // 113: invokevirtual java/util/zip/GZIPInputStream.close ()V
    // 116: goto 11c
    // 119: goto 134
    // 11c: ldc -294722816
    // 11e: ldc -486398144
    // 120: iadd
    // 121: ldc 1774084835
    // 123: ixor
    // 124: istore 7
    // 126: goto 1c3
    // 129: astore 4
    // 12b: aload 3
    // 12c: aload 4
    // 12e: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
    // 131: goto 134
    // 134: aload 3
    // 135: athrow
    // 136: iload 7
    // 138: lookupswitch -151 3 -1817794931 36 -1353817492 -151 579589104 -191
    // 15c: aload 6
    // 15e: areturn
    // 15f: iload 7
    // 161: lookupswitch -225 2 -1034079643 -225 -986930017 -213
    // 17c: iload 7
    // 17e: lookupswitch -162 2 -1478836212 -162 90445717 -155
    // 198: iload 7
    // 19a: lookupswitch 26 2 -515338851 26 1593179888 29
    // 1b4: goto 017
    // 1b7: new java/io/ByteArrayInputStream
    // 1ba: dup
    // 1bb: aload 0
    // 1bc: invokespecial java/io/ByteArrayInputStream.<init> ([B)V
    // 1bf: astore 1
    // 1c0: goto 026
    // 1c3: iload 7
    // 1c5: lookupswitch -172 2 -1832008356 -179 -1194366813 -172
  }

  public static native void init(Class<?> var0);

  static {
    // $VF: Couldn't be decompiled
    // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
    // java.lang.RuntimeException: parsing failure!
    //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
    //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
    //
    // Bytecode:
    // 000: ldc -1704070727
    // 002: istore 13
    // 004: goto 007
    // 007: ldc 1033802199
    // 009: ldc 1061175841
    // 00b: dup
    // 00c: ishl
    // 00d: iadd
    // 00e: ldc 159672672
    // 010: ior
    // 011: ldc 1268083690
    // 013: iand
    // 014: istore 13
    // 016: goto ce3
    // 019: ldc -2070957418
    // 01b: ldc -820883983
    // 01d: dup2
    // 01e: iushr
    // 01f: iadd
    // 020: imul
    // 021: ldc 17902848
    // 023: ior
    // 024: ldc -1583661720
    // 026: iand
    // 027: istore 13
    // 029: goto ce3
    // 02c: ldc "os.arch"
    // 02e: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
    // 031: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
    // 034: astore 2
    // 035: goto 038
    // 038: ldc "/dev/krypton/jnt3/"
    // 03a: astore 3
    // 03b: goto 03e
    // 03e: aload 3
    // 03f: astore 4
    // 041: goto 044
    // 044: ldc 1046208915
    // 046: ldc 423271562
    // 048: isub
    // 049: ldc -2012604918
    // 04b: ior
    // 04c: ldc -1936738770
    // 04e: iand
    // 04f: istore 13
    // 051: goto d10
    // 054: ldc -1890766566
    // 056: ldc 785414185
    // 058: ldc -1828504637
    // 05a: ishr
    // 05b: ior
    // 05c: ldc -1794097082
    // 05e: ior
    // 05f: ldc -1787019026
    // 061: iand
    // 062: istore 13
    // 064: goto d10
    // 067: ldc 1891448233
    // 069: ldc -703896037
    // 06b: ior
    // 06c: ldc -2119965573
    // 06e: ixor
    // 06f: istore 13
    // 071: goto d10
    // 074: ldc -444115370
    // 076: dup
    // 077: ior
    // 078: ldc 291086497
    // 07a: ior
    // 07b: ldc 1398384809
    // 07d: iand
    // 07e: istore 13
    // 080: goto 9cd
    // 083: ldc 291078607
    // 085: ldc 1269846548
    // 087: ishr
    // 088: ldc 827883961
    // 08a: ixor
    // 08b: istore 13
    // 08d: goto 9cd
    // 090: ldc 1717656724
    // 092: dup
    // 093: ishl
    // 094: ldc 931650224
    // 096: ior
    // 097: ldc -1213735937
    // 099: iand
    // 09a: istore 13
    // 09c: goto d10
    // 09f: ldc 1235055259
    // 0a1: ldc -1522306715
    // 0a3: ishr
    // 0a4: ldc 1904431910
    // 0a6: ior
    // 0a7: ldc -74222657
    // 0a9: iand
    // 0aa: istore 13
    // 0ac: goto 9cd
    // 0af: ldc 1967272310
    // 0b1: ldc -1363267979
    // 0b3: ior
    // 0b4: ldc -2115132832
    // 0b6: ior
    // 0b7: ldc -168972569
    // 0b9: iand
    // 0ba: istore 13
    // 0bc: goto bc8
    // 0bf: ldc -1241895992
    // 0c1: ldc 1168136164
    // 0c3: iand
    // 0c4: ldc -231741646
    // 0c6: ixor
    // 0c7: istore 13
    // 0c9: goto f1c
    // 0cc: ldc 818254271
    // 0ce: ldc -59261998
    // 0d0: iushr
    // 0d1: ldc -1178335734
    // 0d3: ior
    // 0d4: ldc -2840689
    // 0d6: iand
    // 0d7: istore 13
    // 0d9: goto 9cd
    // 0dc: ldc -1623440860
    // 0de: ldc -743662739
    // 0e0: ldc -2056593399
    // 0e2: ishl
    // 0e3: iushr
    // 0e4: ldc -860973020
    // 0e6: ixor
    // 0e7: istore 13
    // 0e9: goto bc8
    // 0ec: ldc 1686547926
    // 0ee: dup
    // 0ef: ior
    // 0f0: ldc -1710944243
    // 0f2: ior
    // 0f3: ldc -68685249
    // 0f5: iand
    // 0f6: istore 13
    // 0f8: goto f1c
    // 0fb: ldc -320257412
    // 0fd: ldc -1008618822
    // 0ff: ixor
    // 100: ldc -683358373
    // 102: ixor
    // 103: istore 13
    // 105: goto d10
    // 108: ldc 1711088428
    // 10a: ldc -39791384
    // 10c: imul
    // 10d: ldc 230743597
    // 10f: ior
    // 110: ldc 2144403053
    // 112: iand
    // 113: istore 13
    // 115: goto 9cd
    // 118: ldc -1183554102
    // 11a: ldc -727502672
    // 11c: iadd
    // 11d: ldc 2070099627
    // 11f: ixor
    // 120: istore 13
    // 122: goto 9cd
    // 125: ldc 114574695
    // 127: ldc 1974744187
    // 129: ixor
    // 12a: ldc 1767625953
    // 12c: ior
    // 12d: ldc 2145114087
    // 12f: iand
    // 130: istore 13
    // 132: goto d10
    // 135: ldc -1708248917
    // 137: ldc -880978734
    // 139: ixor
    // 13a: ldc -136608789
    // 13c: ixor
    // 13d: istore 13
    // 13f: goto d10
    // 142: ldc 265663824
    // 144: ldc 213812211
    // 146: isub
    // 147: ldc -6480818
    // 149: ixor
    // 14a: istore 13
    // 14c: goto d10
    // 14f: ldc 289469959
    // 151: ldc 1743350098
    // 153: ldc -325993246
    // 155: ishl
    // 156: iushr
    // 157: ldc 1756831111
    // 159: ixor
    // 15a: istore 13
    // 15c: goto 9cd
    // 15f: ldc 265184460
    // 161: ldc 487822806
    // 163: iushr
    // 164: ldc 1511254396
    // 166: ixor
    // 167: istore 13
    // 169: goto 9cd
    // 16c: ldc 1820154937
    // 16e: dup
    // 16f: isub
    // 170: ldc 1090915877
    // 172: ixor
    // 173: istore 13
    // 175: goto d10
    // 178: ldc 2034349121
    // 17a: ldc -647738077
    // 17c: ixor
    // 17d: ldc 1969820097
    // 17f: ixor
    // 180: istore 13
    // 182: goto 9cd
    // 185: ldc -1912940275
    // 187: ldc 534812425
    // 189: dup_x1
    // 18a: ior
    // 18b: iadd
    // 18c: ldc 1611156528
    // 18e: ior
    // 18f: ldc 1710149233
    // 191: iand
    // 192: istore 13
    // 194: goto bc8
    // 197: ldc 1700958607
    // 199: ldc -1115771440
    // 19b: dup2
    // 19c: iand
    // 19d: ishr
    // 19e: ior
    // 19f: ldc 593901111
    // 1a1: ixor
    // 1a2: istore 13
    // 1a4: goto f1c
    // 1a7: ldc 863862798
    // 1a9: ldc 608646755
    // 1ab: iadd
    // 1ac: ldc -1773246346
    // 1ae: ixor
    // 1af: istore 13
    // 1b1: goto 9cd
    // 1b4: ldc 1638984491
    // 1b6: ldc -1934033915
    // 1b8: iushr
    // 1b9: ldc 131685721
    // 1bb: ixor
    // 1bc: istore 13
    // 1be: goto bc8
    // 1c1: ldc -1148081782
    // 1c3: ldc -1163355921
    // 1c5: ishr
    // 1c6: ldc 405803976
    // 1c8: ixor
    // 1c9: istore 13
    // 1cb: goto f1c
    // 1ce: ldc 1231986854
    // 1d0: ldc 1426516657
    // 1d2: iushr
    // 1d3: ldc -1837721022
    // 1d5: ixor
    // 1d6: istore 13
    // 1d8: goto d10
    // 1db: ldc 2078347052
    // 1dd: ldc 1398551155
    // 1df: iand
    // 1e0: ldc -1364558414
    // 1e2: ixor
    // 1e3: istore 13
    // 1e5: goto 9cd
    // 1e8: ldc -1436876612
    // 1ea: ldc 1323021213
    // 1ec: ixor
    // 1ed: ldc 438856813
    // 1ef: ior
    // 1f0: ldc 444530173
    // 1f2: iand
    // 1f3: istore 13
    // 1f5: goto 9cd
    // 1f8: ldc -633232887
    // 1fa: ldc 2057739111
    // 1fc: imul
    // 1fd: ldc 1944493616
    // 1ff: ixor
    // 200: istore 13
    // 202: goto d10
    // 205: ldc -1751406845
    // 207: ldc 532624698
    // 209: iushr
    // 20a: ldc 269012802
    // 20c: ior
    // 20d: ldc -716648454
    // 20f: iand
    // 210: istore 13
    // 212: goto d10
    // 215: ldc -432782053
    // 217: ldc 1134594021
    // 219: imul
    // 21a: ldc 1476923930
    // 21c: ior
    // 21d: ldc -666323301
    // 21f: iand
    // 220: istore 13
    // 222: goto d10
    // 225: ldc -725609529
    // 227: ldc 738671282
    // 229: dup2
    // 22a: ixor
    // 22b: ixor
    // 22c: imul
    // 22d: ldc_w -1124138892
    // 230: ixor
    // 231: istore 13
    // 233: goto 9cd
    // 236: ldc_w -1679644350
    // 239: ldc_w 1265761029
    // 23c: swap
    // 23d: ishl
    // 23e: ldc_w -1577054078
    // 241: ior
    // 242: ldc_w -297725298
    // 245: iand
    // 246: istore 13
    // 248: goto 9cd
    // 24b: ldc_w 2137183659
    // 24e: ldc_w -314652428
    // 251: iand
    // 252: ldc_w 137006658
    // 255: ixor
    // 256: istore 13
    // 258: goto d10
    // 25b: ldc_w 1567499654
    // 25e: ldc_w -910491488
    // 261: ldc_w -1857360976
    // 264: ior
    // 265: iadd
    // 266: ldc_w -1171818047
    // 269: ior
    // 26a: ldc_w -1150288431
    // 26d: iand
    // 26e: istore 13
    // 270: goto 9cd
    // 273: ldc_w 1941406244
    // 276: ldc_w -1823720159
    // 279: ishl
    // 27a: ldc_w 1045208474
    // 27d: ior
    // 27e: ldc_w 2120129950
    // 281: iand
    // 282: istore 13
    // 284: goto bc8
    // 287: ldc_w 1272297584
    // 28a: ldc_w 1143452263
    // 28d: ior
    // 28e: ldc_w -1362099863
    // 291: ior
    // 292: ldc_w -1074241175
    // 295: iand
    // 296: istore 13
    // 298: goto f1c
    // 29b: ldc_w 992945780
    // 29e: ldc_w -1702034921
    // 2a1: iushr
    // 2a2: ldc_w 1462796438
    // 2a5: ixor
    // 2a6: istore 13
    // 2a8: goto 9cd
    // 2ab: ldc_w 973596673
    // 2ae: ldc_w 2038795478
    // 2b1: dup
    // 2b2: ishr
    // 2b3: ishl
    // 2b4: ldc_w -1364935773
    // 2b7: ixor
    // 2b8: istore 13
    // 2ba: goto bc8
    // 2bd: ldc_w -314092550
    // 2c0: dup
    // 2c1: ior
    // 2c2: ldc_w 271680136
    // 2c5: ior
    // 2c6: ldc_w 1458692845
    // 2c9: iand
    // 2ca: istore 13
    // 2cc: goto f1c
    // 2cf: ldc_w 100401940
    // 2d2: ldc_w -1133994644
    // 2d5: imul
    // 2d6: ldc_w -890562098
    // 2d9: ixor
    // 2da: istore 13
    // 2dc: goto d10
    // 2df: ldc_w 885767888
    // 2e2: ldc_w 1111544423
    // 2e5: ior
    // 2e6: ldc_w 1788545993
    // 2e9: ixor
    // 2ea: istore 13
    // 2ec: goto 9cd
    // 2ef: ldc_w 557330635
    // 2f2: dup
    // 2f3: ixor
    // 2f4: ldc_w 1021389427
    // 2f7: ior
    // 2f8: ldc_w -1125663885
    // 2fb: iand
    // 2fc: istore 13
    // 2fe: goto 9cd
    // 301: ldc_w -1025110002
    // 304: ldc_w -890487588
    // 307: ixor
    // 308: ldc_w 1435847186
    // 30b: ior
    // 30c: ldc_w -543294854
    // 30f: iand
    // 310: istore 13
    // 312: goto d10
    // 315: ldc_w 1364696814
    // 318: ldc_w 976890244
    // 31b: ishl
    // 31c: ldc_w 1859158767
    // 31f: ixor
    // 320: istore 13
    // 322: goto 9cd
    // 325: ldc_w -271791414
    // 328: ldc_w -900911582
    // 32b: dup
    // 32c: ishr
    // 32d: isub
    // 32e: ldc_w -1345931752
    // 331: ixor
    // 332: istore 13
    // 334: goto 9cd
    // 337: ldc_w -1927611523
    // 33a: dup
    // 33b: dup_x1
    // 33c: iushr
    // 33d: iadd
    // 33e: ldc_w 885096612
    // 341: ior
    // 342: ldc_w 1959643327
    // 345: iand
    // 346: istore 13
    // 348: goto d10
    // 34b: ldc_w 167322205
    // 34e: ldc_w -1165335690
    // 351: iushr
    // 352: ldc_w 1167669386
    // 355: ior
    // 356: ldc_w 2006809551
    // 359: iand
    // 35a: istore 13
    // 35c: goto d10
    // 35f: aload 1
    // 360: goto 363
    // 363: invokevirtual java/lang/String.concat (Ljava/lang/String;)Ljava/lang/String;
    // 366: goto 369
    // 369: ldc_w "/"
    // 36c: goto 36f
    // 36f: invokevirtual java/lang/String.concat (Ljava/lang/String;)Ljava/lang/String;
    // 372: goto 375
    // 375: aload 2
    // 376: goto 379
    // 379: invokevirtual java/lang/String.concat (Ljava/lang/String;)Ljava/lang/String;
    // 37c: goto 37f
    // 37f: invokespecial java/lang/UnsatisfiedLinkError.<init> (Ljava/lang/String;)V
    // 382: athrow
    // 383: ldc_w -568812806
    // 386: ldc_w -2094855079
    // 389: ishr
    // 38a: ldc_w -591368599
    // 38d: ixor
    // 38e: istore 13
    // 390: goto d10
    // 393: ldc_w -465700450
    // 396: ldc_w -546727726
    // 399: ixor
    // 39a: ldc_w -375784035
    // 39d: ixor
    // 39e: istore 13
    // 3a0: goto af8
    // 3a3: ldc_w 862728513
    // 3a6: ldc_w 2143525005
    // 3a9: iand
    // 3aa: ldc_w 915999616
    // 3ad: ixor
    // 3ae: istore 13
    // 3b0: goto af8
    // 3b3: ldc_w 437404925
    // 3b6: dup
    // 3b7: ior
    // 3b8: ldc_w -686732670
    // 3bb: ior
    // 3bc: ldc_w -134521214
    // 3bf: iand
    // 3c0: istore 13
    // 3c2: goto af8
    // 3c5: aload 0
    // 3c6: invokevirtual java/io/File.deleteOnExit ()V
    // 3c9: goto 3a3
    // 3cc: aload 0
    // 3cd: invokevirtual java/io/File.exists ()Z
    // 3d0: ifne 3ec
    // 3d3: goto 3b3
    // 3d6: new java/io/IOException
    // 3d9: dup
    // 3da: invokespecial java/io/IOException.<init> ()V
    // 3dd: athrow
    // 3de: goto 40a
    // 3e1: ldc_w "lib"
    // 3e4: aconst_null
    // 3e5: invokestatic java/io/File.createTempFile (Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    // 3e8: astore 0
    // 3e9: goto 393
    // 3ec: ldc_w 1033654286
    // 3ef: dup
    // 3f0: ishl
    // 3f1: ldc_w 517935503
    // 3f4: ixor
    // 3f5: istore 13
    // 3f7: goto af8
    // 3fa: astore 5
    // 3fc: goto 3ff
    // 3ff: new java/lang/UnsatisfiedLinkError
    // 402: dup
    // 403: ldc_w "Failed to create temp file"
    // 406: invokespecial java/lang/UnsatisfiedLinkError.<init> (Ljava/lang/String;)V
    // 409: athrow
    // 40a: ldc_w 1841946901
    // 40d: ldc_w -10670934
    // 410: imul
    // 411: ldc_w 1639441413
    // 414: ior
    // 415: ldc_w 1974985805
    // 418: iand
    // 419: istore 13
    // 41b: goto af8
    // 41e: new java/io/FileOutputStream
    // 421: dup
    // 422: aload 0
    // 423: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;)V
    // 426: astore 6
    // 428: goto 42b
    // 42b: ldc dev/krypton/jnt3/Loader
    // 42d: astore 7
    // 42f: goto 432
    // 432: aload 7
    // 434: aload 3
    // 435: invokevirtual java/lang/Class.getResourceAsStream (Ljava/lang/String;)Ljava/io/InputStream;
    // 438: astore 8
    // 43a: goto 43d
    // 43d: ldc_w 1218438265
    // 440: ldc_w 412994441
    // 443: swap
    // 444: ishr
    // 445: ldc_w -82642124
    // 448: ior
    // 449: ldc_w -67634306
    // 44c: iand
    // 44d: istore 13
    // 44f: goto ba4
    // 452: ldc_w 1152399471
    // 455: dup
    // 456: dup
    // 457: iand
    // 458: ishl
    // 459: ldc_w 1181234362
    // 45c: ior
    // 45d: ldc_w 1207467710
    // 460: iand
    // 461: istore 13
    // 463: goto ba4
    // 466: aload 3
    // 467: invokevirtual java/lang/String.concat (Ljava/lang/String;)Ljava/lang/String;
    // 46a: goto 46d
    // 46d: invokespecial java/lang/UnsatisfiedLinkError.<init> (Ljava/lang/String;)V
    // 470: athrow
    // 471: ldc_w -1313925218
    // 474: ldc_w 478537146
    // 477: dup
    // 478: iushr
    // 479: iadd
    // 47a: ldc_w -171828287
    // 47d: ixor
    // 47e: istore 13
    // 480: goto ba4
    // 483: aload 8
    // 485: aload 5
    // 487: invokevirtual java/io/InputStream.read ([B)I
    // 48a: dup
    // 48b: istore 9
    // 48d: goto 490
    // 490: bipush -1
    // 491: if_icmpeq 4ab
    // 494: goto 497
    // 497: ldc_w -916827896
    // 49a: ldc_w -510173817
    // 49d: ixor
    // 49e: ldc_w 1143607473
    // 4a1: ior
    // 4a2: ldc_w -998558793
    // 4a5: iand
    // 4a6: istore 13
    // 4a8: goto b5c
    // 4ab: ldc_w -41397355
    // 4ae: ldc_w -1655831280
    // 4b1: ldc_w -1361042644
    // 4b4: isub
    // 4b5: ior
    // 4b6: ldc_w -2130271092
    // 4b9: ior
    // 4ba: ldc_w -2092439891
    // 4bd: iand
    // 4be: istore 13
    // 4c0: goto b5c
    // 4c3: ldc_w 1654398629
    // 4c6: ldc_w -260871746
    // 4c9: imul
    // 4ca: ldc_w 1382207557
    // 4cd: ior
    // 4ce: ldc_w -738799027
    // 4d1: iand
    // 4d2: istore 13
    // 4d4: goto b5c
    // 4d7: ldc_w 908562456
    // 4da: ldc_w -713675066
    // 4dd: ishr
    // 4de: ldc_w 386411441
    // 4e1: ixor
    // 4e2: istore 13
    // 4e4: goto e6c
    // 4e7: ldc_w -1303945615
    // 4ea: ldc_w 1956166590
    // 4ed: ishr
    // 4ee: ldc_w 1747977472
    // 4f1: ior
    // 4f2: ldc_w 2016544135
    // 4f5: iand
    // 4f6: istore 13
    // 4f8: goto e6c
    // 4fb: ldc_w 1303698877
    // 4fe: dup
    // 4ff: swap
    // 500: iand
    // 501: ldc_w -1724889280
    // 504: ixor
    // 505: istore 13
    // 507: goto e6c
    // 50a: ldc_w 1695018502
    // 50d: dup
    // 50e: dup_x1
    // 50f: isub
    // 510: imul
    // 511: ldc_w 1928934021
    // 514: ior
    // 515: ldc_w -151421985
    // 518: iand
    // 519: istore 13
    // 51b: goto e6c
    // 51e: aload 10
    // 520: aload 5
    // 522: bipush 0
    // 523: iload 9
    // 525: invokevirtual java/io/ByteArrayOutputStream.write ([BII)V
    // 528: goto 483
    // 52b: aload 10
    // 52d: invokevirtual java/io/ByteArrayOutputStream.close ()V
    // 530: goto 4c3
    // 533: aload 10
    // 535: invokevirtual java/io/ByteArrayOutputStream.toByteArray ()[B
    // 538: invokestatic dev/krypton/jnt3/Loader.decompress ([B)[B
    // 53b: astore 11
    // 53d: goto 4d7
    // 540: aload 8
    // 542: ifnonnull 471
    // 545: goto 452
    // 548: new java/lang/UnsatisfiedLinkError
    // 54b: dup
    // 54c: ldc_w "Couldn't find lib: "
    // 54f: goto 466
    // 552: new java/io/ByteArrayOutputStream
    // 555: dup
    // 556: invokespecial java/io/ByteArrayOutputStream.<init> ()V
    // 559: astore 10
    // 55b: goto 483
    // 55e: aload 6
    // 560: aload 11
    // 562: invokevirtual java/io/FileOutputStream.write ([B)V
    // 565: goto 4e7
    // 568: aload 6
    // 56a: invokevirtual java/io/FileOutputStream.close ()V
    // 56d: goto 4fb
    // 570: aload 0
    // 571: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
    // 574: invokestatic java/lang/System.load (Ljava/lang/String;)V
    // 577: goto 50a
    // 57a: aload 0
    // 57b: invokevirtual java/io/File.deleteOnExit ()V
    // 57e: goto 586
    // 581: aload 8
    // 583: goto 596
    // 586: ldc_w -1427645059
    // 589: ldc_w -746262571
    // 58c: imul
    // 58d: ldc_w -2095127618
    // 590: ixor
    // 591: istore 13
    // 593: goto e6c
    // 596: ldc_w 538440879
    // 599: dup
    // 59a: iadd
    // 59b: ldc_w 1520980441
    // 59e: ixor
    // 59f: istore 13
    // 5a1: goto ec0
    // 5a4: ldc_w -1735646842
    // 5a7: ldc_w -1884235124
    // 5aa: iand
    // 5ab: ldc_w -2065304921
    // 5ae: ixor
    // 5af: istore 13
    // 5b1: goto e6c
    // 5b4: ldc_w -1823718936
    // 5b7: dup
    // 5b8: isub
    // 5b9: ldc_w 220575669
    // 5bc: ixor
    // 5bd: istore 13
    // 5bf: goto ec0
    // 5c2: ldc_w 134641624
    // 5c5: ldc_w -2083689501
    // 5c8: iadd
    // 5c9: ldc_w 2081457432
    // 5cc: ior
    // 5cd: ldc_w 2083841308
    // 5d0: iand
    // 5d1: istore 13
    // 5d3: goto e6c
    // 5d6: astore 9
    // 5d8: aload 8
    // 5da: ifnull 61b
    // 5dd: goto 5e0
    // 5e0: ldc_w -826604857
    // 5e3: dup
    // 5e4: dup
    // 5e5: isub
    // 5e6: iushr
    // 5e7: ldc_w 2102202685
    // 5ea: ixor
    // 5eb: istore 13
    // 5ed: goto c60
    // 5f0: aload 8
    // 5f2: invokevirtual java/io/InputStream.close ()V
    // 5f5: goto 5fb
    // 5f8: goto 61b
    // 5fb: ldc_w -1439011756
    // 5fe: ldc_w -752727791
    // 601: iand
    // 602: ldc_w 1630851658
    // 605: ior
    // 606: ldc_w 1904014062
    // 609: iand
    // 60a: istore 13
    // 60c: goto c60
    // 60f: astore 10
    // 611: aload 9
    // 613: aload 10
    // 615: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
    // 618: goto 61b
    // 61b: ldc_w 1490425669
    // 61e: ldc_w -521362551
    // 621: ishl
    // 622: ldc_w 1020873357
    // 625: ixor
    // 626: istore 13
    // 628: goto c60
    // 62b: aload 9
    // 62d: athrow
    // 62e: aload 8
    // 630: goto 5b4
    // 633: goto 64a
    // 636: aload 6
    // 638: invokevirtual java/io/FileOutputStream.close ()V
    // 63b: goto 6a0
    // 63e: ifnull 64a
    // 641: goto 5a4
    // 644: invokevirtual java/io/InputStream.close ()V
    // 647: goto 5c2
    // 64a: ldc_w -526240325
    // 64d: ldc_w 986707336
    // 650: imul
    // 651: ldc_w 1200264679
    // 654: ixor
    // 655: istore 13
    // 657: goto e6c
    // 65a: astore 7
    // 65c: goto 65f
    // 65f: ldc_w -1182785206
    // 662: ldc_w -471221124
    // 665: isub
    // 666: ldc_w 1499901646
    // 669: ixor
    // 66a: istore 13
    // 66c: goto c28
    // 66f: aload 6
    // 671: invokevirtual java/io/FileOutputStream.close ()V
    // 674: goto 67a
    // 677: goto 69a
    // 67a: ldc_w 1901431059
    // 67d: ldc_w 2142820485
    // 680: iadd
    // 681: ldc_w 9541983
    // 684: ior
    // 685: ldc_w 1593155039
    // 688: iand
    // 689: istore 13
    // 68b: goto c28
    // 68e: astore 8
    // 690: aload 7
    // 692: aload 8
    // 694: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
    // 697: goto 69a
    // 69a: aload 7
    // 69c: athrow
    // 69d: goto 9cc
    // 6a0: ldc_w -712054522
    // 6a3: ldc_w -1954125043
    // 6a6: ior
    // 6a7: ldc_w 567887362
    // 6aa: ior
    // 6ab: ldc_w 903726998
    // 6ae: iand
    // 6af: istore 13
    // 6b1: goto e6c
    // 6b4: astore 6
    // 6b6: goto 6b9
    // 6b9: ldc_w -585274026
    // 6bc: ldc_w 671778393
    // 6bf: iand
    // 6c0: ldc_w -408275800
    // 6c3: ixor
    // 6c4: istore 13
    // 6c6: goto e42
    // 6c9: ldc_w -2045672161
    // 6cc: ldc_w 1139611982
    // 6cf: iushr
    // 6d0: ldc_w -710281316
    // 6d3: ixor
    // 6d4: istore 13
    // 6d6: goto e42
    // 6d9: ldc dev/krypton/jnt3/Loader
    // 6db: astore 8
    // 6dd: goto 6e0
    // 6e0: aload 8
    // 6e2: aload 4
    // 6e4: invokevirtual java/lang/Class.getResourceAsStream (Ljava/lang/String;)Ljava/io/InputStream;
    // 6e7: astore 9
    // 6e9: goto 6ec
    // 6ec: ldc_w 1564866604
    // 6ef: ldc_w -1216424096
    // 6f2: ixor
    // 6f3: ldc_w 1861144320
    // 6f6: ixor
    // 6f7: istore 13
    // 6f9: goto b36
    // 6fc: ldc_w -111942495
    // 6ff: dup
    // 700: iadd
    // 701: ldc_w 206320828
    // 704: ior
    // 705: ldc_w 207566269
    // 708: iand
    // 709: istore 13
    // 70b: goto b36
    // 70e: aload 4
    // 710: goto 713
    // 713: invokevirtual java/lang/String.concat (Ljava/lang/String;)Ljava/lang/String;
    // 716: goto 719
    // 719: aload 3
    // 71a: goto 71d
    // 71d: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001 (tried \u0001 first)" ]
    // 722: goto 725
    // 725: invokespecial java/lang/UnsatisfiedLinkError.<init> (Ljava/lang/String;)V
    // 728: athrow
    // 729: ldc_w 1641697418
    // 72c: ldc_w 1067854923
    // 72f: imul
    // 730: ldc_w -692593172
    // 733: ixor
    // 734: istore 13
    // 736: goto b36
    // 739: aload 9
    // 73b: aload 5
    // 73d: invokevirtual java/io/InputStream.read ([B)I
    // 740: dup
    // 741: istore 10
    // 743: goto 746
    // 746: bipush -1
    // 747: if_icmpeq 75d
    // 74a: goto 74d
    // 74d: ldc_w -242889456
    // 750: ldc_w 1932292255
    // 753: ixor
    // 754: ldc_w -954817573
    // 757: ixor
    // 758: istore 13
    // 75a: goto b80
    // 75d: ldc_w 784889144
    // 760: ldc_w 553772779
    // 763: iushr
    // 764: ldc_w -209710021
    // 767: ior
    // 768: ldc_w -3689093
    // 76b: iand
    // 76c: istore 13
    // 76e: goto b80
    // 771: ldc_w -1789697542
    // 774: ldc_w -846959116
    // 777: swap
    // 778: ishl
    // 779: ldc_w 562814618
    // 77c: ior
    // 77d: ldc_w 737148670
    // 780: iand
    // 781: istore 13
    // 783: goto b80
    // 786: ldc_w 1433555485
    // 789: ldc_w -613505610
    // 78c: iand
    // 78d: ldc_w -2038400485
    // 790: ior
    // 791: ldc_w -2031322497
    // 794: iand
    // 795: istore 13
    // 797: goto c84
    // 79a: ldc_w 2144011788
    // 79d: ldc_w 2056398955
    // 7a0: imul
    // 7a1: ldc_w -2085671867
    // 7a4: ixor
    // 7a5: istore 13
    // 7a7: goto c84
    // 7aa: ldc_w 1765170052
    // 7ad: ldc_w 646093003
    // 7b0: ishl
    // 7b1: ldc_w 1747424099
    // 7b4: ior
    // 7b5: ldc_w 1869067123
    // 7b8: iand
    // 7b9: istore 13
    // 7bb: goto c84
    // 7be: ldc_w -342945449
    // 7c1: ldc_w -989070960
    // 7c4: imul
    // 7c5: ldc_w -1456273405
    // 7c8: ior
    // 7c9: ldc_w -1141158133
    // 7cc: iand
    // 7cd: istore 13
    // 7cf: goto c84
    // 7d2: aload 9
    // 7d4: ifnonnull 729
    // 7d7: goto 6fc
    // 7da: new java/lang/UnsatisfiedLinkError
    // 7dd: dup
    // 7de: ldc_w "Couldn't find lib: "
    // 7e1: goto 70e
    // 7e4: new java/io/ByteArrayOutputStream
    // 7e7: dup
    // 7e8: invokespecial java/io/ByteArrayOutputStream.<init> ()V
    // 7eb: astore 11
    // 7ed: goto 739
    // 7f0: aload 11
    // 7f2: aload 5
    // 7f4: bipush 0
    // 7f5: iload 10
    // 7f7: invokevirtual java/io/ByteArrayOutputStream.write ([BII)V
    // 7fa: goto 739
    // 7fd: aload 11
    // 7ff: invokevirtual java/io/ByteArrayOutputStream.close ()V
    // 802: goto 771
    // 805: aload 11
    // 807: invokevirtual java/io/ByteArrayOutputStream.toByteArray ()[B
    // 80a: invokestatic dev/krypton/jnt3/Loader.decompress ([B)[B
    // 80d: astore 12
    // 80f: goto 786
    // 812: aload 7
    // 814: aload 12
    // 816: invokevirtual java/io/FileOutputStream.write ([B)V
    // 819: goto 79a
    // 81c: aload 7
    // 81e: invokevirtual java/io/FileOutputStream.close ()V
    // 821: goto 7aa
    // 824: aload 0
    // 825: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
    // 828: invokestatic java/lang/System.load (Ljava/lang/String;)V
    // 82b: goto 7be
    // 82e: aload 0
    // 82f: invokevirtual java/io/File.deleteOnExit ()V
    // 832: goto 83a
    // 835: aload 9
    // 837: goto 84c
    // 83a: ldc_w 324941143
    // 83d: dup
    // 83e: ishl
    // 83f: ldc_w 1386480567
    // 842: ior
    // 843: ldc_w 1391265719
    // 846: iand
    // 847: istore 13
    // 849: goto c84
    // 84c: ldc_w -1727362917
    // 84f: ldc_w -664921956
    // 852: ishr
    // 853: ldc_w -111217193
    // 856: ixor
    // 857: istore 13
    // 859: goto c44
    // 85c: ldc_w -625557602
    // 85f: ldc_w -43160869
    // 862: dup_x1
    // 863: iushr
    // 864: iand
    // 865: ldc_w -1987649692
    // 868: ixor
    // 869: istore 13
    // 86b: goto c84
    // 86e: ldc_w -1272876067
    // 871: ldc_w -1039946925
    // 874: isub
    // 875: ldc_w 917748680
    // 878: ixor
    // 879: istore 13
    // 87b: goto c44
    // 87e: ldc_w -695603401
    // 881: ldc_w 523488372
    // 884: ishr
    // 885: ldc_w 844998311
    // 888: ior
    // 889: ldc_w -1166039113
    // 88c: iand
    // 88d: istore 13
    // 88f: goto c84
    // 892: astore 10
    // 894: aload 9
    // 896: ifnull 8d5
    // 899: goto 89c
    // 89c: ldc_w -1318326579
    // 89f: ldc_w 1229777386
    // 8a2: iand
    // 8a3: ldc_w 111266316
    // 8a6: ior
    // 8a7: ldc_w 1991630604
    // 8aa: iand
    // 8ab: istore 13
    // 8ad: goto edc
    // 8b0: aload 9
    // 8b2: invokevirtual java/io/InputStream.close ()V
    // 8b5: goto 8bb
    // 8b8: goto 8d5
    // 8bb: ldc_w 840653545
    // 8be: dup
    // 8bf: ishr
    // 8c0: ldc_w 109869758
    // 8c3: ixor
    // 8c4: istore 13
    // 8c6: goto edc
    // 8c9: astore 11
    // 8cb: aload 10
    // 8cd: aload 11
    // 8cf: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
    // 8d2: goto 8d5
    // 8d5: ldc_w -1568742304
    // 8d8: ldc_w 1645272410
    // 8db: ior
    // 8dc: ldc_w 161579541
    // 8df: ior
    // 8e0: ldc_w -1715763427
    // 8e3: iand
    // 8e4: istore 13
    // 8e6: goto edc
    // 8e9: ifnull 908
    // 8ec: goto 85c
    // 8ef: invokevirtual java/io/InputStream.close ()V
    // 8f2: goto 87e
    // 8f5: aload 9
    // 8f7: goto 86e
    // 8fa: goto 908
    // 8fd: aload 7
    // 8ff: invokevirtual java/io/FileOutputStream.close ()V
    // 902: goto 96d
    // 905: aload 10
    // 907: athrow
    // 908: ldc_w -1638508636
    // 90b: ldc_w 1707096350
    // 90e: ishr
    // 90f: ldc_w 335970325
    // 912: ior
    // 913: ldc_w 1452770069
    // 916: iand
    // 917: istore 13
    // 919: goto c84
    // 91c: astore 8
    // 91e: goto 921
    // 921: ldc_w 1092354007
    // 924: ldc_w 1435408215
    // 927: iadd
    // 928: ldc_w -1366491920
    // 92b: ixor
    // 92c: istore 13
    // 92e: goto f00
    // 931: aload 7
    // 933: invokevirtual java/io/FileOutputStream.close ()V
    // 936: goto 93c
    // 939: goto 95a
    // 93c: ldc_w 66316797
    // 93f: dup
    // 940: iadd
    // 941: ldc_w -1197317631
    // 944: ior
    // 945: ldc_w -16878845
    // 948: iand
    // 949: istore 13
    // 94b: goto f00
    // 94e: astore 9
    // 950: aload 8
    // 952: aload 9
    // 954: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
    // 957: goto 95a
    // 95a: aload 8
    // 95c: athrow
    // 95d: goto 99b
    // 960: new java/io/FileOutputStream
    // 963: dup
    // 964: aload 0
    // 965: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;)V
    // 968: astore 7
    // 96a: goto 6d9
    // 96d: ldc_w -2072982255
    // 970: ldc_w 786534248
    // 973: isub
    // 974: ldc_w -766254638
    // 977: ixor
    // 978: istore 13
    // 97a: goto c84
    // 97d: astore 7
    // 97f: goto 982
    // 982: new java/lang/UnsatisfiedLinkError
    // 985: dup
    // 986: ldc_w "Failed to extract file: "
    // 989: goto 98c
    // 98c: aload 7
    // 98e: invokevirtual java/io/IOException.getMessage ()Ljava/lang/String;
    // 991: invokevirtual java/lang/String.concat (Ljava/lang/String;)Ljava/lang/String;
    // 994: goto 997
    // 997: invokespecial java/lang/UnsatisfiedLinkError.<init> (Ljava/lang/String;)V
    // 99a: athrow
    // 99b: ldc_w 1891164532
    // 99e: dup
    // 99f: swap
    // 9a0: ior
    // 9a1: ldc_w 34617217
    // 9a4: ior
    // 9a5: ldc_w -1973764201
    // 9a8: iand
    // 9a9: istore 13
    // 9ab: goto c84
    // 9ae: astore 6
    // 9b0: goto 9b3
    // 9b3: new java/lang/UnsatisfiedLinkError
    // 9b6: dup
    // 9b7: ldc_w "Failed to extract file: "
    // 9ba: goto 9bd
    // 9bd: aload 6
    // 9bf: invokevirtual java/io/IOException.getMessage ()Ljava/lang/String;
    // 9c2: invokevirtual java/lang/String.concat (Ljava/lang/String;)Ljava/lang/String;
    // 9c5: goto 9c8
    // 9c8: invokespecial java/lang/UnsatisfiedLinkError.<init> (Ljava/lang/String;)V
    // 9cb: athrow
    // 9cc: return
    // 9cd: iload 13
    // 9cf: lookupswitch 241 20 -1371467642 254 -1178335733 188 -1150322223 258 -1047863801 226 -716379997 220 -176906031 203 -117955387 245 -34963566 232 264298093 194 438893933 241 475067710 270 827883692 178 1021389427 279 1364828321 169 1392494938 292 1462796512 264 1511254339 216 1755733361 207 1937994678 182 2074700815 283
    // a78: ldc_w "aarch64-macos"
    // a7b: invokevirtual java/lang/String.concat (Ljava/lang/String;)Ljava/lang/String;
    // a7e: goto 083
    // a81: astore 3
    // a82: goto 337
    // a85: ldc_w "x86_64"
    // a88: goto 0af
    // a8b: ldc_w "amd64"
    // a8e: goto 0dc
    // a91: ldc_w "x86_64-macos"
    // a94: invokevirtual java/lang/String.concat (Ljava/lang/String;)Ljava/lang/String;
    // a97: goto 118
    // a9a: astore 3
    // a9b: goto 337
    // a9e: ldc_w "aarch64-windows"
    // aa1: invokevirtual java/lang/String.concat (Ljava/lang/String;)Ljava/lang/String;
    // aa4: goto 15f
    // aa7: astore 3
    // aa8: goto 337
    // aab: ldc_w "x86_64"
    // aae: goto 185
    // ab1: ldc_w "amd64"
    // ab4: goto 1b4
    // ab7: ldc_w "x86_64-windows"
    // aba: invokevirtual java/lang/String.concat (Ljava/lang/String;)Ljava/lang/String;
    // abd: goto 1e8
    // ac0: astore 3
    // ac1: goto 337
    // ac4: ldc_w "aarch64-linux"
    // ac7: invokevirtual java/lang/String.concat (Ljava/lang/String;)Ljava/lang/String;
    // aca: goto 236
    // acd: astore 3
    // ace: goto 337
    // ad1: ldc_w "x86_64"
    // ad4: goto 273
    // ad7: ldc_w "amd64"
    // ada: goto 2ab
    // add: ldc_w "x86_64-linux"
    // ae0: invokevirtual java/lang/String.concat (Ljava/lang/String;)Ljava/lang/String;
    // ae3: goto 2ef
    // ae6: astore 3
    // ae7: goto 301
    // aea: ldc_w "x86_64-linux-gnu"
    // aed: invokevirtual java/lang/String.concat (Ljava/lang/String;)Ljava/lang/String;
    // af0: goto 325
    // af3: astore 4
    // af5: goto 337
    // af8: iload 13
    // afa: lookupswitch 50 5 -758276911 -1845 -686600574 -1828 98114433 -1838 182227343 -1820 1639441477 50
    // b2c: sipush 2048
    // b2f: newarray 8
    // b31: astore 5
    // b33: goto 41e
    // b36: iload 13
    // b38: lookupswitch -862 3 -2066358196 -870 -1224831614 -852 206517692 -862
    // b5c: iload 13
    // b5e: lookupswitch -1587 3 -2092439891 -1587 -756624827 -1579 1147867319 -1600
    // b80: iload 13
    // b82: lookupswitch -914 3 -209349317 -901 562814618 -893 1170153044 -914
    // ba4: iload 13
    // ba6: lookupswitch -1630 3 -82642116 -1638 1147997284 -1620 1182282938 -1630
    // bc8: iload 13
    // bca: lookupswitch 82 6 -168972697 58 81058304 76 794737635 88 1402132992 64 1707757104 70 2119081370 82
    // c04: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
    // c07: goto 0bf
    // c0a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
    // c0d: goto 0ec
    // c10: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
    // c13: goto 197
    // c16: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
    // c19: goto 1c1
    // c1c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
    // c1f: goto 287
    // c22: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
    // c25: goto 2bd
    // c28: iload 13
    // c2a: lookupswitch -1467 2 -1930376704 -1467 1351981535 -1459
    // c44: iload 13
    // c46: lookupswitch -861 2 -995200190 -855 111217198 -861
    // c60: iload 13
    // c62: lookupswitch -1650 3 -1862811507 -1591 -1275718662 -1650 1630851658 -1642
    // c84: iload 13
    // c86: lookupswitch -1112 10 -2032109025 -1140 -2015568773 -809 -1987649665 -913 -1166039129 -908 -1154265341 -1112 -838186175 -1130 35174293 90 1386480567 -1105 1452770069 -905 1785181027 -1122
    // ce0: goto 9cc
    // ce3: iload 13
    // ce5: lookupswitch 30 2 -1592050368 30 160787304 27
    // d00: goto 019
    // d03: ldc_w "os.name"
    // d06: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
    // d09: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
    // d0c: astore 1
    // d0d: goto 02c
    // d10: iload 13
    // d12: lookupswitch 276 19 -1945430518 162 -1837711627 234 -1789116338 175 -1698743633 238 -1500977262 213 -1215833424 192 -826308162 272 -670558693 264 -129222755 196 -58053357 226 269012834 251 591368582 -2353 885639333 281 1090915877 230 1167669391 294 1570597458 276 1695043298 268 1998361536 188 2069616101 200
    // db4: aload 1
    // db5: ldc_w "mac"
    // db8: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
    // dbb: ifeq 125
    // dbe: goto 054
    // dc1: aload 2
    // dc2: ldc_w "aarch64"
    // dc5: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
    // dc8: ifeq 090
    // dcb: goto 067
    // dce: aload 3
    // dcf: goto 074
    // dd2: aload 2
    // dd3: goto 09f
    // dd6: aload 3
    // dd7: goto 108
    // dda: aload 1
    // ddb: ldc_w "win"
    // dde: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
    // de1: ifeq 1f8
    // de4: goto 135
    // de7: aload 2
    // de8: ldc_w "aarch64"
    // deb: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
    // dee: ifeq 16c
    // df1: goto 142
    // df4: aload 3
    // df5: goto 14f
    // df8: aload 2
    // df9: goto 178
    // dfc: aload 3
    // dfd: goto 1db
    // e00: aload 1
    // e01: ldc_w "lin"
    // e04: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
    // e07: ifeq 337
    // e0a: goto 205
    // e0d: aload 2
    // e0e: ldc_w "aarch64"
    // e11: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
    // e14: ifeq 24b
    // e17: goto 215
    // e1a: aload 3
    // e1b: goto 225
    // e1e: aload 2
    // e1f: goto 25b
    // e22: aload 3
    // e23: goto 2df
    // e26: aload 4
    // e28: goto 315
    // e2b: aload 3
    // e2c: invokevirtual java/lang/String.hashCode ()I
    // e2f: ldc_w 1388925557
    // e32: if_icmpne 383
    // e35: goto 34b
    // e38: new java/lang/UnsatisfiedLinkError
    // e3b: dup
    // e3c: ldc_w "Unsupported os/arch: "
    // e3f: goto 35f
    // e42: iload 13
    // e44: lookupswitch -1252 2 -710152230 -1252 -274583304 28
    // e60: aload 4
    // e62: aload 3
    // e63: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
    // e66: ifeq 6c9
    // e69: aload 6
    // e6b: athrow
    // e6c: iload 13
    // e6e: lookupswitch -2104 9 -729507075 -2302 208007715 -2112 399554033 -2320 608638911 -2104 903726854 -2001 1698176959 -2285 1928934021 -2292 2016544134 -2310 2081482008 -2107
    // ec0: iload 13
    // ec2: lookupswitch -2180 2 220575669 -2174 445102215 -2180
    // edc: iload 13
    // ede: lookupswitch -1582 3 -1984198883 -1497 110458643 -1574 111266316 -1582
    // f00: iload 13
    // f02: lookupswitch -1489 2 -1092193533 -1481 942042078 -1489
    // f1c: iload 13
    // f1e: lookupswitch 58 6 -1343217303 84 -568816664 71 -405838613 78 -141564686 58 -91770849 65 1416741608 91
    // f58: ifne 0fb
    // f5b: aload 2
    // f5c: goto 0cc
    // f5f: ifeq 337
    // f62: goto 0fb
    // f65: ifne 1ce
    // f68: aload 2
    // f69: goto 1a7
    // f6c: ifeq 337
    // f6f: goto 1ce
    // f72: ifne 2cf
    // f75: aload 2
    // f76: goto 29b
    // f79: ifeq 337
    // f7c: goto 2cf
  }

  public static native void guard();
}
