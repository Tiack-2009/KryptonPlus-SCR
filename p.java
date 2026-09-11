// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

// $VF: synthetic class
public class p {
  public static final MethodHandle[] hpj;
  static {
    // $VF: Couldn't be decompiled
    // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
    // java.lang.RuntimeException: parsing failure!
    //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
    //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
    //
    // Bytecode:
    // 000: ldc 1398258592
    // 002: dup
    // 003: isub
    // 004: bipush 19
    // 006: ior
    // 007: ldc 382085983
    // 009: iand
    // 00a: anewarray 22
    // 00d: putstatic p.hpj [Ljava/lang/invoke/MethodHandle;
    // 010: goto 222
    // 013: ldc 776331401
    // 015: ldc -938716446
    // 017: ior
    // 018: ldc 161554708
    // 01a: ior
    // 01b: ldc 1509014004
    // 01d: iand
    // 01e: istore 1
    // 01f: goto 170
    // 022: goto 047
    // 025: invokedynamic JNT ()[I bsm=p.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 409357560, "ᨣᤓ", "ჴ", "팦펦첦쎦", 1785430783 ]
    // 02a: invokedynamic JNT ()Lnet/minecraft/class_2350; bsm=p.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 409357560, "ᥣᥳᤳᧃ\u1943ᣓᘣᘣᗳᙃᙓ", "ე၄ᄴ\u0cd4Ⴤႄე၄ဤᄔငၔᄴ\u0cd4ဤႴငᄤᄤ\u0fe4ഔതൄ\u0cf4", "팦펦씦㘥ㆥ㤥횦㖥㎥㘥ㆥゥ㠥쾦㈥㤥횦ゥ㔥쾦㢥㢥캦\ud826\ud8a6\ud9a6휦\udca6", 1785430778 ]
    // 02f: invokedynamic JNT (Ljava/lang/Object;)I bsm=p.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1232925902, "\u139a።ᏲᎪᎂᏪᎲ", "霠꜠Ꜣ", "삕쀅샵법삅쁅삕쀅뿥샕뿅쀕샵법뿥쁵뿅샥샥뾥볕볥봅벵", 2012165311 ]
    // 034: bipush 1
    // 035: iastore
    // 036: goto 039
    // 039: ldc -517395797
    // 03b: dup
    // 03c: iushr
    // 03d: ldc -2090724854
    // 03f: ior
    // 040: ldc -1008246917
    // 042: iand
    // 043: istore 1
    // 044: goto 170
    // 047: ldc 1025189912
    // 049: ldc 1287529028
    // 04b: dup_x1
    // 04c: ishr
    // 04d: isub
    // 04e: ldc -1140210319
    // 050: ixor
    // 051: istore 1
    // 052: goto 228
    // 055: goto 07b
    // 058: invokedynamic JNT ()[I bsm=p.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 409357560, "ᨣᤓ", "ჴ", "팦펦첦쎦", 1785430756 ]
    // 05d: invokedynamic JNT ()Lnet/minecraft/class_2350; bsm=p.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 409357560, "ᥣᥳᤳᧃ\u1943ᣓᘣᘣᗳᙃᙃ", "ე၄ᄴ\u0cd4Ⴤႄე၄ဤᄔငၔᄴ\u0cd4ဤႴငᄤᄤ\u0fe4ഔതൄ\u0cf4", "팦펦씦㘥ㆥ㤥횦㖥㎥㘥ㆥゥ㠥쾦㈥㤥횦ゥ㔥쾦㢥㢥캦\ud826\ud8a6\ud9a6휦\udca6", 1785430779 ]
    // 062: invokedynamic JNT (Ljava/lang/Object;)I bsm=p.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1232925902, "\u139a።ᏲᎪᎂᏪᎲ", "霠꜠Ꜣ", "삕쀅샵법삅쁅삕쀅뿥샕뿅쀕샵법뿥쁵뿅샥샥뾥볕볥봅벵", 2012164636 ]
    // 067: bipush 2
    // 068: iastore
    // 069: goto 06c
    // 06c: ldc 1818768993
    // 06e: ldc 464871102
    // 070: ishl
    // 071: ldc -414907901
    // 073: ior
    // 074: ldc -269624637
    // 076: iand
    // 077: istore 1
    // 078: goto 228
    // 07b: ldc -2102717635
    // 07d: ldc 1604020627
    // 07f: ishl
    // 080: ldc -327811214
    // 082: ixor
    // 083: istore 1
    // 084: goto 228
    // 087: goto 0ad
    // 08a: invokedynamic JNT ()[I bsm=p.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 409357560, "ᨣᤓ", "ჴ", "팦펦첦쎦", 1785430757 ]
    // 08f: invokedynamic JNT ()Lnet/minecraft/class_2350; bsm=p.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 409357560, "ᥣᥳᤳᧃ\u1943ᣓᘣᘣᗳᘳᙃ", "ე၄ᄴ\u0cd4Ⴤႄე၄ဤᄔငၔᄴ\u0cd4ဤႴငᄤᄤ\u0fe4ഔതൄ\u0cf4", "팦펦씦㘥ㆥ㤥횦㖥㎥㘥ㆥゥ㠥쾦㈥㤥횦ゥ㔥쾦㢥㢥캦\ud826\ud8a6\ud9a6휦\udca6", 1785430768 ]
    // 094: invokedynamic JNT (Ljava/lang/Object;)I bsm=p.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1232925902, "\u139a።ᏲᎪᎂᏪᎲ", "霠꜠Ꜣ", "삕쀅샵법삅쁅삕쀅뿥샕뿅쀕샵법뿥쁵뿅샥샥뾥볕볥봅벵", 2012164601 ]
    // 099: bipush 3
    // 09a: iastore
    // 09b: goto 09e
    // 09e: ldc -278870695
    // 0a0: ldc 1749388498
    // 0a2: ishl
    // 0a3: ldc -1065426625
    // 0a5: ior
    // 0a6: ldc -595663873
    // 0a8: iand
    // 0a9: istore 1
    // 0aa: goto 228
    // 0ad: ldc -941989109
    // 0af: ldc -880596530
    // 0b1: dup2
    // 0b2: ishr
    // 0b3: ishl
    // 0b4: ixor
    // 0b5: ldc 1074930410
    // 0b7: ior
    // 0b8: ldc 1477590010
    // 0ba: iand
    // 0bb: istore 1
    // 0bc: goto 228
    // 0bf: invokedynamic JNT ()[I bsm=p.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 409357560, "ᨣᤓ", "ჴ", "팦펦첦쎦", 1785430770 ]
    // 0c4: invokedynamic JNT ()Lnet/minecraft/class_2350; bsm=p.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 409357560, "ᥣᥳᤳᧃ\u1943ᣓᘣᘣᗳᙃᙣ", "ე၄ᄴ\u0cd4Ⴤႄე၄ဤᄔငၔᄴ\u0cd4ဤႴငᄤᄤ\u0fe4ഔതൄ\u0cf4", "팦펦씦㘥ㆥ㤥횦㖥㎥㘥ㆥゥ㠥쾦㈥㤥횦ゥ㔥쾦㢥㢥캦\ud826\ud8a6\ud9a6휦\udca6", 1785430769 ]
    // 0c9: invokedynamic JNT (Ljava/lang/Object;)I bsm=p.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1232925902, "\u139a።ᏲᎪᎂᏪᎲ", "霠꜠Ꜣ", "삕쀅샵법삅쁅삕쀅뿥샕뿅쀕샵법뿥쁵뿅샥샥뾥볕볥봅벵", 2012164598 ]
    // 0ce: bipush 4
    // 0cf: iastore
    // 0d0: goto 0d6
    // 0d3: goto 0e2
    // 0d6: ldc 1048765708
    // 0d8: ldc 428401944
    // 0da: ior
    // 0db: ldc 545934498
    // 0dd: ixor
    // 0de: istore 1
    // 0df: goto 228
    // 0e2: ldc 1563491083
    // 0e4: ldc 176894978
    // 0e6: iand
    // 0e7: ldc 1633348774
    // 0e9: ixor
    // 0ea: istore 1
    // 0eb: goto 228
    // 0ee: goto 114
    // 0f1: invokedynamic JNT ()[I bsm=p.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 409357560, "ᨣᤓ", "ჴ", "팦펦첦쎦", 1785430771 ]
    // 0f6: invokedynamic JNT ()Lnet/minecraft/class_2350; bsm=p.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 409357560, "ᥣᥳᤳᧃ\u1943ᣓᘣᘣᗳᙃᚣ", "ე၄ᄴ\u0cd4Ⴤႄე၄ဤᄔငၔᄴ\u0cd4ဤႴငᄤᄤ\u0fe4ഔതൄ\u0cf4", "팦펦씦㘥ㆥ㤥횦㖥㎥㘥ㆥゥ㠥쾦㈥㤥횦ゥ㔥쾦㢥㢥캦\ud826\ud8a6\ud9a6휦\udca6", 1785430782 ]
    // 0fb: invokedynamic JNT (Ljava/lang/Object;)I bsm=p.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1232925902, "\u139a።ᏲᎪᎂᏪᎲ", "霠꜠Ꜣ", "삕쀅샵법삅쁅삕쀅뿥샕뿅쀕샵법뿥쁵뿅샥샥뾥볕볥봅벵", 2012164595 ]
    // 100: bipush 5
    // 101: iastore
    // 102: goto 105
    // 105: ldc -1849667591
    // 107: ldc 1860248514
    // 109: iadd
    // 10a: ldc 957944965
    // 10c: ior
    // 10d: ldc -35782707
    // 10f: iand
    // 110: istore 1
    // 111: goto 228
    // 114: ldc -1811909076
    // 116: ldc 1571732309
    // 118: ishl
    // 119: ldc 106402151
    // 11b: ior
    // 11c: ldc -1235223177
    // 11e: iand
    // 11f: istore 1
    // 120: goto 228
    // 123: goto 29c
    // 126: invokedynamic JNT ()[I bsm=p.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 409357560, "ᨣᤓ", "ჴ", "팦펦첦쎦", 1785430664 ]
    // 12b: invokedynamic JNT ()Lnet/minecraft/class_2350; bsm=p.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ 409357560, "ᥣᥳᤳᧃ\u1943ᣓᘣᘣᗳᙃᘳ", "ე၄ᄴ\u0cd4Ⴤႄე၄ဤᄔငၔᄴ\u0cd4ဤႴငᄤᄤ\u0fe4ഔതൄ\u0cf4", "팦펦씦㘥ㆥ㤥횦㖥㎥㘥ㆥゥ㠥쾦㈥㤥횦ゥ㔥쾦㢥㢥캦\ud826\ud8a6\ud9a6휦\udca6", 1785430671 ]
    // 130: invokedynamic JNT (Ljava/lang/Object;)I bsm=p.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1232925902, "\u139a።ᏲᎪᎂᏪᎲ", "霠꜠Ꜣ", "삕쀅샵법삅쁅삕쀅뿥샕뿅쀕샵법뿥쁵뿅샥샥뾥볕볥봅벵", 2012164592 ]
    // 135: bipush 6
    // 137: iastore
    // 138: goto 13b
    // 13b: ldc 1490442309
    // 13d: ldc 1927975242
    // 13f: imul
    // 140: ldc 549208167
    // 142: ior
    // 143: ldc 956097903
    // 145: iand
    // 146: istore 1
    // 147: goto 228
    // 14a: astore 0
    // 14b: goto 07b
    // 14e: astore 0
    // 14f: goto 29c
    // 152: ldc -722244768
    // 154: ldc 1705019587
    // 156: imul
    // 157: ldc -613869364
    // 159: ixor
    // 15a: istore 1
    // 15b: goto 19c
    // 15e: ldc -70263957
    // 160: ldc 2136262705
    // 162: swap
    // 163: ishr
    // 164: ldc -1073010790
    // 166: ixor
    // 167: istore 1
    // 168: goto 19c
    // 16b: return
    // 16c: astore 0
    // 16d: goto 0e2
    // 170: iload 1
    // 171: ldc 443941845
    // 173: ixor
    // 174: ldc 485841855
    // 176: ixor
    // 177: ldc 1055902136
    // 179: ixor
    // 17a: ldc 1662021430
    // 17c: ixor
    // 17d: ldc 2141365850
    // 17f: ixor
    // 180: ldc 311510199
    // 182: ixor
    // 183: lookupswitch -350 2 -1255601374 -353 2142154237 -350
    // 19c: iload 1
    // 19d: ldc 1987129213
    // 19f: isub
    // 1a0: ldc 1386617642
    // 1a2: iadd
    // 1a3: ldc 1476647283
    // 1a5: iadd
    // 1a6: ldc 1387408558
    // 1a8: ixor
    // 1a9: ldc 1601576812
    // 1ab: isub
    // 1ac: ldc 1998534183
    // 1ae: ixor
    // 1af: lookupswitch -97 5 -1778655157 -101 -143744239 -97 761060727 111 805742854 -67 980977568 107
    // 1e0: ldc 2129121760
    // 1e2: dup
    // 1e3: ishl
    // 1e4: ldc -1571306058
    // 1e6: ixor
    // 1e7: istore 1
    // 1e8: goto 19c
    // 1eb: ldc 1247703804
    // 1ed: ldc 2062608018
    // 1ef: ishl
    // 1f0: ldc 29833021
    // 1f2: ixor
    // 1f3: istore 1
    // 1f4: goto 19c
    // 1f7: invokedynamic JNT ()[Lnet/minecraft/class_2350; bsm=p.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1757085493, "ፂᏪᎲፊᏊ፺", "霠꜠윣휢\uf724朤圥ܡ\ue724Ꜥ\uf724朤䜤㜥✤眤圥ܡ䜤휤✤䜥䜥ܤ㜡䜡朡ᜡ육", "삕쀅샵법삅쁅삕쀅뿥샕뿅쀕샵법뿥쁵뿅샥샥뾥볕볥봅벵", 2012164591 ]
    // 1fc: checkcast [Lnet/minecraft/class_2350;
    // 1ff: arraylength
    // 200: newarray 10
    // 202: putstatic p.rc [I
    // 205: goto 013
    // 208: ldc -1562044531
    // 20a: dup
    // 20b: ishr
    // 20c: ldc 109469938
    // 20e: ior
    // 20f: ldc -1227888397
    // 211: iand
    // 212: istore 1
    // 213: goto 19c
    // 216: astore 0
    // 217: goto 047
    // 21a: astore 0
    // 21b: goto 114
    // 21e: astore 0
    // 21f: goto 0ad
    // 222: ldc 313352872
    // 224: istore 1
    // 225: goto 1f7
    // 228: iload 1
    // 229: ldc 370300452
    // 22b: isub
    // 22c: ldc 2045258525
    // 22e: ixor
    // 22f: ldc 328335032
    // 231: iadd
    // 232: ldc 292744208
    // 234: ixor
    // 235: ldc 1199879567
    // 237: isub
    // 238: ldc 775181330
    // 23a: iadd
    // 23b: lookupswitch -433 11 -1838206754 -483 -1815203347 -486 -1324084943 -436 -218267255 -277 -165210479 -208 255265694 -433 368041672 -330 1502265350 -380 1713603519 -333 1716931209 -280 2090482098 -360
    // 29c: ldc 1282735332
    // 29e: ldc -468457805
    // 2a0: isub
    // 2a1: ldc -1985081202
    // 2a3: ior
    // 2a4: ldc -1716636257
    // 2a6: iand
    // 2a7: istore 1
    // 2a8: goto 228
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 - 1876385642 ^ 1339739822) - 626695791 + 821307715 ^ 259638305 ^ 1084115952) + 863851205 + 850943752 + 472356439;
    MethodHandle var10000 = hpj[((var10 - 1876385642 ^ 1339739822) - 626695791 + 821307715 ^ 259638305 ^ 1084115952)
      + 863851205
      + 850943752
      + 472356439
      + 1629589184];
    if (hpj[var10001 + 1629589184] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = 615397891 >>> 589812324 ^ 38462368; var23 < var13.length(); var23 += -2143008216 ^ -111653032 ^ 2031879537) {
        int var42 = var13.charAt(var23) ^ 236;
        int var10004 = (var42 & 65024) >> 9;
        int var43 = ((var42 & 65024) >> 9 | var42 << 7) + 81;
        int var93 = (((var42 & 65024) >> 9 | var42 << 7) + 81 & 0) >> 16;
        var42 = (((var10004 | var42 << 7) + 81 & 0) >> 16 | ((var42 & 65024) >> 9 | var42 << 7) + 81 << 0) + 129 + 20 - 141;
        var10004 = ((var93 | var43 << 0) + 129 + 20 - 141 & 0) >> 16;
        int var45 = (((var93 | var43 << 0) + 129 + 20 - 141 & 0) >> 16 | var42 << 0) + 159;
        int var95 = ((((var93 | var43 << 0) + 129 + 20 - 141 & 0) >> 16 | var42 << 0) + 159 & 64512) >> 10;
        char var46 = (char)(((var10004 | var42 << 0) + 159 & 64512) >> 10 | (((var93 | var43 << 0) + 129 + 20 - 141 & 0) >> 16 | var42 << 0) + 159 << 6);
        var13.setCharAt(var23, (char)(var95 | var45 << 6));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = -1719132867 - 203693270 ^ -1922826137; var29 < var16.length(); var29 += 1695879119 + 495473138 ^ -2103615040) {
        int var51 = var16.charAt(var29) + 'D' + 73;
        int var96 = (var51 & 65528) >> 3;
        int var52 = ((var51 & 65528) >> 3 | var51 << 13) - 244;
        int var97 = (((var51 & 65528) >> 3 | var51 << 13) - 244 & 61440) >> 12;
        var51 = ((var96 | var51 << 13) - 244 & 61440) >> 12 | ((var51 & 65528) >> 3 | var51 << 13) - 244 << 4;
        var96 = ((var97 | var52 << 4) & 65472) >> 6;
        int var54 = ((var97 | var52 << 4) & 65472) >> 6 | var51 << 10;
        int var99 = ((((var97 | var52 << 4) & 65472) >> 6 | var51 << 10) & 65024) >> 9;
        var51 = ((var96 | var51 << 10) & 65024) >> 9 | (((var97 | var52 << 4) & 65472) >> 6 | var51 << 10) << 7;
        var96 = ((var99 | var54 << 7) & 64512) >> 10;
        int var56 = ((var99 | var54 << 7) & 64512) >> 10 | var51 << 6;
        int var101 = ((((var99 | var54 << 7) & 64512) >> 10 | var51 << 6) & 65520) >> 4;
        char var57 = (char)((((var96 | var51 << 6) & 65520) >> 4 | (((var99 | var54 << 7) & 64512) >> 10 | var51 << 6) << 12) - 177);
        var16.setCharAt(var29, (char)((var101 | var56 << 12) - 177));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), p.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (-1119342875 | -1719798289) ^ -1115815953; var35 < var19.length(); var35 += 2030535128 >> 2030535128 * 2030535128 ^ 2030535129) {
        int var62 = var19.charAt(var35);
        int var102 = (var62 & 0) >> 16;
        int var63 = ((var62 & 0) >> 16 | var62 << 0) - 44;
        int var103 = (((var62 & 0) >> 16 | var62 << 0) - 44 & 65408) >> 7;
        var62 = (((var102 | var62 << 0) - 44 & 65408) >> 7 | ((var62 & 0) >> 16 | var62 << 0) - 44 << 9) + 205;
        var102 = ((var103 | var63 << 9) + 205 & 0) >> 16;
        int var65 = ((var103 | var63 << 9) + 205 & 0) >> 16 | var62 << 0;
        int var105 = ((((var103 | var63 << 9) + 205 & 0) >> 16 | var62 << 0) & 65504) >> 5;
        var62 = (((var102 | var62 << 0) & 65504) >> 5 | (((var103 | var63 << 9) + 205 & 0) >> 16 | var62 << 0) << 11) ^ 145 ^ 51;
        var102 = (((var105 | var65 << 11) ^ 145 ^ 51) & 65528) >> 3;
        int var67 = (((var105 | var65 << 11) ^ 145 ^ 51) & 65528) >> 3 | var62 << 13;
        int var107 = (((((var105 | var65 << 11) ^ 145 ^ 51) & 65528) >> 3 | var62 << 13) & 65504) >> 5;
        char var68 = (char)(((var102 | var62 << 13) & 65504) >> 5 | ((((var105 | var65 << 11) ^ 145 ^ 51) & 65528) >> 3 | var62 << 13) << 11);
        var19.setCharAt(var35, (char)(var107 | var67 << 11));
      }

      Class var7 = Class.forName(var19.toString(), false, p.class.getClassLoader());
      switch ((((var4 ^ 1310201512 ^ 1489539813) + 34528535 - 1972496368 + 7542146 ^ 1704313919) - 1548822743 - 538375108 ^ 1952629524) - 1450941216) {
        case 632793470:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 1101459546:
        case 1636886344:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1121375527:
          var10000 = var0.findSpecial(var7, var5, var6, p.class);
          break;
        case 1146049089:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    hpj[((var10 - 1876385642 ^ 1339739822) - 626695791 + 821307715 ^ 259638305 ^ 1084115952) + 863851205 + 850943752 + 472356439 + 1629589184] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 ^ 2028686388) + 534185652 + 132153137 ^ 685390580 ^ 824114669) - 242057174 - 223576235 - 336498916 + 300360895;
    MethodHandle var10000 = hpj[((var10 ^ 2028686388) + 534185652 + 132153137 ^ 685390580 ^ 824114669)
      - 242057174
      - 223576235
      - 336498916
      + 300360895
      - 101984003];
    if (hpj[var10001 - 101984003] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = -947824443 >> -947824443 ^ -29619514; var24 < var14.length(); var24 += -663369021 << 1424937480 ^ 1976222465) {
        int var43 = var14.charAt(var24) + '.';
        char var48 = (char)(
          (
              (
                    (
                        (
                              (
                                    (
                                          (((((var43 & 65528) >> 3 | var43 << 13) - 248 & 64512) >> 10 | ((var43 & 65528) >> 3 | var43 << 13) - 248 << 6) ^ 254)
                                            & 49152
                                        )
                                        >> 14
                                      | (((((var43 & 65528) >> 3 | var43 << 13) - 248 & 64512) >> 10 | ((var43 & 65528) >> 3 | var43 << 13) - 248 << 6) ^ 254)
                                        << 2
                                  )
                                  + 38
                                & 65532
                            )
                            >> 2
                          | (
                                ((((((var43 & 65528) >> 3 | var43 << 13) - 248 & 64512) >> 10 | ((var43 & 65528) >> 3 | var43 << 13) - 248 << 6) ^ 254) & 49152)
                                    >> 14
                                  | (((((var43 & 65528) >> 3 | var43 << 13) - 248 & 64512) >> 10 | ((var43 & 65528) >> 3 | var43 << 13) - 248 << 6) ^ 254) << 2
                              )
                              + 38
                            << 14
                      )
                      & 65408
                  )
                  >> 7
                | (
                    (
                          (
                                ((((((var43 & 65528) >> 3 | var43 << 13) - 248 & 64512) >> 10 | ((var43 & 65528) >> 3 | var43 << 13) - 248 << 6) ^ 254) & 49152)
                                    >> 14
                                  | (((((var43 & 65528) >> 3 | var43 << 13) - 248 & 64512) >> 10 | ((var43 & 65528) >> 3 | var43 << 13) - 248 << 6) ^ 254) << 2
                              )
                              + 38
                            & 65532
                        )
                        >> 2
                      | (
                            ((((((var43 & 65528) >> 3 | var43 << 13) - 248 & 64512) >> 10 | ((var43 & 65528) >> 3 | var43 << 13) - 248 << 6) ^ 254) & 49152)
                                >> 14
                              | (((((var43 & 65528) >> 3 | var43 << 13) - 248 & 64512) >> 10 | ((var43 & 65528) >> 3 | var43 << 13) - 248 << 6) ^ 254) << 2
                          )
                          + 38
                        << 14
                  )
                  << 9
            )
            + 73
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
                                                ((((var43 & 65528) >> 3 | var43 << 13) - 248 & 64512) >> 10 | ((var43 & 65528) >> 3 | var43 << 13) - 248 << 6)
                                                  ^ 254
                                              )
                                              & 49152
                                          )
                                          >> 14
                                        | (((((var43 & 65528) >> 3 | var43 << 13) - 248 & 64512) >> 10 | ((var43 & 65528) >> 3 | var43 << 13) - 248 << 6) ^ 254)
                                          << 2
                                    )
                                    + 38
                                  & 65532
                              )
                              >> 2
                            | (
                                  (
                                        (((((var43 & 65528) >> 3 | var43 << 13) - 248 & 64512) >> 10 | ((var43 & 65528) >> 3 | var43 << 13) - 248 << 6) ^ 254)
                                          & 49152
                                      )
                                      >> 14
                                    | (((((var43 & 65528) >> 3 | var43 << 13) - 248 & 64512) >> 10 | ((var43 & 65528) >> 3 | var43 << 13) - 248 << 6) ^ 254)
                                      << 2
                                )
                                + 38
                              << 14
                        )
                        & 65408
                    )
                    >> 7
                  | (
                      (
                            (
                                  (
                                        (((((var43 & 65528) >> 3 | var43 << 13) - 248 & 64512) >> 10 | ((var43 & 65528) >> 3 | var43 << 13) - 248 << 6) ^ 254)
                                          & 49152
                                      )
                                      >> 14
                                    | (((((var43 & 65528) >> 3 | var43 << 13) - 248 & 64512) >> 10 | ((var43 & 65528) >> 3 | var43 << 13) - 248 << 6) ^ 254)
                                      << 2
                                )
                                + 38
                              & 65532
                          )
                          >> 2
                        | (
                              ((((((var43 & 65528) >> 3 | var43 << 13) - 248 & 64512) >> 10 | ((var43 & 65528) >> 3 | var43 << 13) - 248 << 6) ^ 254) & 49152)
                                  >> 14
                                | (((((var43 & 65528) >> 3 | var43 << 13) - 248 & 64512) >> 10 | ((var43 & 65528) >> 3 | var43 << 13) - 248 << 6) ^ 254) << 2
                            )
                            + 38
                          << 14
                    )
                    << 9
              )
              + 73
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (-1920944501 ^ -1110643132 ^ 871861629 | 0) & -331077119; var30 < var17.length(); var30 += (1866392147 >>> 1663952013 | 0) & -1460141055) {
        int var53 = (var17.charAt(var30) ^ 'R') - 217 + 86 + 143 + 253 ^ 136 ^ 215;
        char var54 = (char)(((var53 & 65520) >> 4 | var53 << 12) + 29 - 204);
        var17.setCharAt(var30, (char)(((var53 & 65520) >> 4 | var53 << 12) + 29 - 204));
      }

      Class var6 = Class.forName(var17.toString(), false, p.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = -1684148659 >> -481364079 ^ -12850; var36 < var20.length(); var36 += -20088182 & -203347592 & (-20088182 ^ -203347592) ^ 1) {
        int var59 = var20.charAt(var36);
        int var87 = (var59 & 61440) >> 12;
        int var60 = (((var59 & 61440) >> 12 | var59 << 4) ^ 243) - 229 + 47 + 147;
        int var88 = ((((var59 & 61440) >> 12 | var59 << 4) ^ 243) - 229 + 47 + 147 & 65504) >> 5;
        var59 = ((((var87 | var59 << 4) ^ 243) - 229 + 47 + 147 & 65504) >> 5 | (((var59 & 61440) >> 12 | var59 << 4) ^ 243) - 229 + 47 + 147 << 11) + 236;
        var87 = ((var88 | var60 << 11) + 236 & 65532) >> 2;
        int var62 = ((var88 | var60 << 11) + 236 & 65532) >> 2 | var59 << 14;
        int var90 = ((((var88 | var60 << 11) + 236 & 65532) >> 2 | var59 << 14) & 65520) >> 4;
        char var63 = (char)((((var87 | var59 << 14) & 65520) >> 4 | (((var88 | var60 << 11) + 236 & 65532) >> 2 | var59 << 14) << 12) + 191);
        var20.setCharAt(var36, (char)((var90 | var62 << 12) + 191));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), p.class.getClassLoader()).returnType();
      switch (((var4 - 1162213569 ^ 1680118701) - 2082289195 - 984307955 ^ 1864445548) + 393951092 + 1945190313 - 930278472 - 787128100 + 1886922881) {
        case 77867586:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 201406711:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 974032168:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1063967431:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      hpj[((var10 ^ 2028686388) + 534185652 + 132153137 ^ 685390580 ^ 824114669) - 242057174 - 223576235 - 336498916 + 300360895 - 101984003] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
