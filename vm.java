// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.ByteBuffer;

public class vm {
  public static int ln = 2048;
  public sx bin;
  public int fg;
  public float lm;
  public float dx;
  public Int2ObjectOpenHashMap elu;
  // [JNT] MethodHandle dispatch table (removed)
  public vm(ByteBuffer param1, int param2) {
    // $VF: Couldn't be decompiled
    // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
    // java.lang.RuntimeException: parsing failure!
    //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
    //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
    //
    // Bytecode:
    // 000: goto 0e1
    // 003: aload 8
    // 005: bipush 1
    // 006: invokedynamic JNT (Ljava/lang/Object;I)Ljava/nio/IntBuffer; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "堌堁頌頌\ud80c\ud801堛᠍頎", "⻔⤄⼄⤔⫴⪄⮴⪄⽤⬴⬄⭤⽤⤄⬴⮔⡴⯄⪴⪴⫄\u2b74〤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ恸ꁸ쁸\ue07e\ue07fg\ue063\ue07e\ue07fⁿ聸恸ꁼ쁸恽ꁾꁿ", 1929407358 ]
    // 00b: astore 9
    // 00d: aload 3
    // 00e: aload 9
    // 010: aconst_null
    // 011: aconst_null
    // 012: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -233787523, "\ud80d頎᠂頎頎\ud800\ud81a堂頎\u181b\ud80c᠍頎᠇堄堂頎\u180e堃\ud801\ud80d", "⻔⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⢴⭤⬴⮔⬄⬴⪴⭤〤⤔⫴⪄⮴⪄⽤⬴⬄⭤⽤⤄⬴⮔⡴⯄⪴⪴⫄\u2b74〤⤔⫴⪄⮴⪄⽤⬴⬄⭤⽤⤄⬴⮔⡴⯄⪴⪴⫄\u2b74〤⤔⫴⪄⮴⪄⽤⬴⬄⭤⽤⤄⬴⮔⡴⯄⪴⪴⫄\u2b74〤⼄⦴", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼聸\ue078\ue07e쁸恸䁿\ue07e", 1929407359 ]
    // 017: aload 0
    // 018: aload 9
    // 01a: bipush 0
    // 01b: invokedynamic JNT (Ljava/lang/Object;I)I bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "\ud802堂頎", "⻔⤄⼄⤄", "聿恽x恽g\u007f恾ⁿg恢\u007f쁸聢\ue078~~\ue07e聸", 1929407352 ]
    // 020: i2f
    // 021: putfield vm.dx F
    // 024: goto 036
    // 027: aload 8
    // 029: ifnull 1c4
    // 02c: aload 8
    // 02e: invokedynamic JNT (Ljava/lang/Object;)V bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "\ud801頌\ud80c\ud80d堂", "⻔⼄⦴", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ恸ꁸ쁸\ue07e\ue07fg\ue063\ue07e\ue07fⁿ聸恸ꁼ쁸恽ꁾꁿ", 1929407329 ]
    // 033: goto 1c4
    // 036: ldc 1648235944
    // 038: dup
    // 039: iushr
    // 03a: ldc -67354227
    // 03c: ior
    // 03d: ldc -138769
    // 03f: iand
    // 040: istore 15
    // 042: goto 3eb
    // 045: ldc 796204397
    // 047: ldc -1103159346
    // 049: iushr
    // 04a: ldc 1937937249
    // 04c: ior
    // 04d: ldc -207440021
    // 04f: iand
    // 050: istore 15
    // 052: goto 08f
    // 055: goto 06f
    // 058: aload 8
    // 05a: invokedynamic JNT (Ljava/lang/Object;)V bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "\ud801頌\ud80c\ud80d堂", "⻔⼄⦴", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ恸ꁸ쁸\ue07e\ue07fg\ue063\ue07e\ue07fⁿ聸恸ꁼ쁸恽ꁾꁿ", 1929407330 ]
    // 05f: goto 062
    // 062: ldc 510288857
    // 064: ldc 1369801869
    // 066: isub
    // 067: ldc 566572292
    // 069: ixor
    // 06a: istore 15
    // 06c: goto 08f
    // 06f: ldc 735492050
    // 071: ldc 1878174988
    // 073: iand
    // 074: ldc 91560837
    // 076: ixor
    // 077: istore 15
    // 079: goto 08f
    // 07c: aload 9
    // 07e: athrow
    // 07f: ldc 1935462921
    // 081: ldc 1317572762
    // 083: iand
    // 084: ldc -1106959721
    // 086: ior
    // 087: ldc -1093681417
    // 089: iand
    // 08a: istore 15
    // 08c: goto 200
    // 08f: iload 15
    // 091: ldc 2008738293
    // 093: iadd
    // 094: ldc 221599014
    // 096: isub
    // 097: ldc 645801586
    // 099: iadd
    // 09a: ldc 1883239738
    // 09c: iadd
    // 09d: ldc 1625185447
    // 09f: isub
    // 0a0: ldc 948311459
    // 0a2: isub
    // 0a3: lookupswitch -75 3 -1769538378 -39 -614337134 -75 1424042105 -78
    // 0c4: astore 9
    // 0c6: aload 8
    // 0c8: ifnull 06f
    // 0cb: goto 045
    // 0ce: ldc -255588239
    // 0d0: ldc 451844297
    // 0d2: dup2
    // 0d3: isub
    // 0d4: isub
    // 0d5: isub
    // 0d6: ldc 607200352
    // 0d8: ior
    // 0d9: ldc 611659258
    // 0db: iand
    // 0dc: istore 15
    // 0de: goto 104
    // 0e1: ldc -1286403599
    // 0e3: istore 15
    // 0e5: goto 230
    // 0e8: ldc -785180655
    // 0ea: dup
    // 0eb: ishr
    // 0ec: ldc 471830480
    // 0ee: ixor
    // 0ef: istore 15
    // 0f1: goto 200
    // 0f4: ldc -550790207
    // 0f6: ldc -1645258613
    // 0f8: ior
    // 0f9: ldc 135284052
    // 0fb: ior
    // 0fc: ldc 725247326
    // 0fe: iand
    // 0ff: istore 15
    // 101: goto 104
    // 104: iload 15
    // 106: ldc 492558708
    // 108: ixor
    // 109: ldc 463012933
    // 10b: isub
    // 10c: ldc 1113803192
    // 10e: iadd
    // 10f: ldc 647705328
    // 111: iadd
    // 112: ldc 1600716930
    // 114: ixor
    // 115: ldc 883821980
    // 117: iadd
    // 118: lookupswitch 192 2 241662593 192 1901863339 191
    // 134: iload 11
    // 136: aload 9
    // 138: invokedynamic JNT (Ljava/lang/Object;)I bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "\ud801堁頍堁\ud801堃頎堏", "⻔⼄⤄", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ\ue07e쁾ꁾ䁾恽聸쁦聢\ue078~~\ue07e聸", 1929407331 ]
    // 13d: if_icmpge 07f
    // 140: aload 9
    // 142: iload 11
    // 144: invokedynamic JNT (Ljava/lang/Object;I)Lorg/lwjgl/system/Struct; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "\ud802堂頎", "⻔⤄⼄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤Ⰴ⮤⮔⫄⭄⽤⦤⮔\u2b74⯄⪤⮔〤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ\ue07e쁾ꁾ䁾恽聸쁦聢\ue078~~\ue07e聸", 1929407340 ]
    // 149: checkcast org/lwjgl/stb/STBTTPackedchar
    // 14c: astore 12
    // 14e: ldc 4.8828125E-4
    // 150: fstore 13
    // 152: ldc 4.8828125E-4
    // 154: fstore 14
    // 156: aload 0
    // 157: invokedynamic JNT (Ljava/lang/Object;)Lit/unimi/dsi/fastutil/ints/Int2ObjectOpenHashMap; bsm=vm.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1190471836, "쭀쭸쯀", "勨篨", "⥯⥿⮯⵿ⸯ⧟⸿\u2dcf⵿\u2dbf⵿⧟\u2d2f⸟⵿⧟ⵏ⳿⸟ⸯ⸿ⸯ⵿\u2daf⧟⵿\u2dcfⸯ⸟⧟⭿\u2dcfⸯ⨏⯟ⴏⶏⴿⴟⸯ⯟ⷯⴿ\u2dcf⭯⳿⸟ⵯ⮿⳿ⷯ⪟", -2002553793 ]
    // 15c: iload 11
    // 15e: iload 10
    // 160: iadd
    // 161: aload 12
    // 163: invokedynamic JNT (Ljava/lang/Object;)F bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "頏\ud80c᠃᠃", "⻔⼄⢴", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ\ue07e쁾ꁾ䁾恽聸", 1929407334 ]
    // 168: aload 12
    // 16a: invokedynamic JNT (Ljava/lang/Object;)F bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "堏\ud80c᠃᠃", "⻔⼄⢴", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ\ue07e쁾ꁾ䁾恽聸", 1929407335 ]
    // 16f: aload 12
    // 171: invokedynamic JNT (Ljava/lang/Object;)F bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "頏\ud80c᠃᠃\u181e", "⻔⼄⢴", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ\ue07e쁾ꁾ䁾恽聸", 1929407328 ]
    // 176: aload 12
    // 178: invokedynamic JNT (Ljava/lang/Object;)F bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "堏\ud80c᠃᠃\u181e", "⻔⼄⢴", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ\ue07e쁾ꁾ䁾恽聸", 1929407305 ]
    // 17d: aload 12
    // 17f: invokedynamic JNT (Ljava/lang/Object;)S bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "頏頝", "⻔⼄⦤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ\ue07e쁾ꁾ䁾恽聸", 1929407306 ]
    // 184: i2f
    // 185: fload 13
    // 187: fmul
    // 188: aload 12
    // 18a: invokedynamic JNT (Ljava/lang/Object;)S bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "堏頝", "⻔⼄⦤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ\ue07e쁾ꁾ䁾恽聸", 1929407307 ]
    // 18f: i2f
    // 190: fload 14
    // 192: fmul
    // 193: aload 12
    // 195: invokedynamic JNT (Ljava/lang/Object;)S bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "頏堝", "⻔⼄⦤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ\ue07e쁾ꁾ䁾恽聸", 1929407348 ]
    // 19a: i2f
    // 19b: fload 13
    // 19d: fmul
    // 19e: aload 12
    // 1a0: invokedynamic JNT (Ljava/lang/Object;)S bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "堏堝", "⻔⼄⦤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ\ue07e쁾ꁾ䁾恽聸", 1929407309 ]
    // 1a5: i2f
    // 1a6: fload 14
    // 1a8: fmul
    // 1a9: aload 12
    // 1ab: invokedynamic JNT (Ljava/lang/Object;)F bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "頏堁頂᠏堁᠍\ud801堂", "⻔⼄⢴", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ\ue07e쁾ꁾ䁾恽聸", 1929407310 ]
    // 1b0: invokedynamic JNT (FFFFFFFFF)Ljava/lang/Object; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -846025708, "領堃᠍堃頎᠙", "⻔⢴⢴⢴⢴⢴⢴⢴⢴⢴⼄⦴", "䁿ꁿ", 1929407311 ]
    // 1b5: checkcast pk
    // 1b8: invokedynamic JNT (Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "頍堎頎", "⻔⤄⤔⫴⪄⮴⪄⽤⬔⪄⬴⫤⽤⥤⩴⫴⫄⪤⮔〤⼄⤔⫴⪄⮴⪄⽤⬔⪄⬴⫤⽤⥤⩴⫴⫄⪤⮔〤", "恾쁸g\ue078\u007f恾\ue07f恾g쁾ꁸ恾g~恽ꁸ쁸\ue078쁸恾쁿g恾\u007f쁸ꁸg恢\u007f쁸聠\u2063聾聿\ue07eꁾ쁸\u2063䁿\ue07e\u007f䁢恽ꁸ䁾\ue063恽䁿", 1929407304 ]
    // 1bd: pop
    // 1be: iinc 11 1
    // 1c1: goto 0e8
    // 1c4: ldc 488515455
    // 1c6: ldc -149304442
    // 1c8: isub
    // 1c9: ldc -1008377242
    // 1cb: ixor
    // 1cc: istore 15
    // 1ce: goto 3eb
    // 1d1: bipush 0
    // 1d2: istore 8
    // 1d4: goto 0ce
    // 1d7: return
    // 1d8: iload 8
    // 1da: aload 5
    // 1dc: arraylength
    // 1dd: if_icmpge 0f4
    // 1e0: aload 5
    // 1e2: iload 8
    // 1e4: aaload
    // 1e5: astore 9
    // 1e7: aload 7
    // 1e9: iload 8
    // 1eb: invokedynamic JNT (Ljava/lang/Object;I)Lorg/lwjgl/system/Struct; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "\ud802堂頎", "⻔⤄⼄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤Ⰴ⮤⮔⫄⭄⽤⦤⮔\u2b74⯄⪤⮔〤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ聼恽\u007f⁾\ue07e쁦聢\ue078~~\ue07e聸", 1929407345 ]
    // 1f0: checkcast org/lwjgl/stb/STBTTPackRange
    // 1f3: invokedynamic JNT (Ljava/lang/Object;)I bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "᠃堃\u180e\ud80d頎\ud800堎᠍堃\ud801\ud80c頂堂\ud800\ud801\ud80c頂堂頍\ud80c堃᠍頎\ud800堃᠍\ud800\u180e堁᠍\ud802堂", "⻔⼄⤄", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ聼恽\u007f⁾\ue07e", 1929407346 ]
    // 1f8: istore 10
    // 1fa: bipush 0
    // 1fb: istore 11
    // 1fd: goto 0e8
    // 200: iload 15
    // 202: ldc 473685193
    // 204: ixor
    // 205: ldc 1417865847
    // 207: iadd
    // 208: ldc 568703760
    // 20a: ixor
    // 20b: ldc 1957943964
    // 20d: ixor
    // 20e: ldc 997073959
    // 210: iadd
    // 211: ldc 684763413
    // 213: ixor
    // 214: lookupswitch 465 2 -141691755 465 346440119 -224
    // 230: aload 0
    // 231: invokespecial java/lang/Object.<init> ()V
    // 234: aload 0
    // 235: invokedynamic JNT ()Ljava/lang/Object; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -846025708, "領堃᠍堃頎᠙", "⻔⼄⦴", "恾쁸g\ue078\u007f恾\ue07f恾g쁾ꁸ恾g~恽ꁸ쁸\ue078쁸恾쁿g恾\u007f쁸ꁸg恢\u007f쁸聠\u2063聾聿\ue07eꁾ쁸\u2063䁿\ue07e\u007f䁢恽ꁸ䁾\ue063恽䁿", 1929407347 ]
    // 23a: checkcast it/unimi/dsi/fastutil/ints/Int2ObjectOpenHashMap
    // 23d: putfield vm.elu Lit/unimi/dsi/fastutil/ints/Int2ObjectOpenHashMap;
    // 240: aload 0
    // 241: iload 2
    // 242: putfield vm.fg I
    // 245: invokedynamic JNT ()Lorg/lwjgl/stb/STBTTFontinfo; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -233787523, "\ud801\u180e堂堁頎堂", "⻔⼄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⢴⭤⬴⮔⬄⬴⪴⭤〤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼bⁿ\u007f쁸恾\u007f~ⁿ", 1929407356 ]
    // 24a: astore 3
    // 24b: aload 3
    // 24c: aload 1
    // 24d: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Z bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -233787523, "\ud80d頎᠂頎頎\ud800堛᠍堃頎\u181b\ud80c᠍頎", "⻔⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⢴⭤⬴⮔⬄⬴⪴⭤〤⤔⫴⪄⮴⪄⽤⬴⬄⭤⽤⡴Ⰴ⮔⫄⡴⯄⪴⪴⫄\u2b74〤⼄⧴", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼聸\ue078\ue07e쁸恸䁿\ue07e", 1929407349 ]
    // 252: pop
    // 253: ldc_w 4194304
    // 256: invokedynamic JNT (I)Ljava/nio/ByteBuffer; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -233787523, "\ud801\u180e堂堁頎堂\u181a堏頎堂\u181a堎᠃᠃堂\u180e", "⻔⤄⼄⤔⫴⪄⮴⪄⽤⬴⬄⭤⽤⡴Ⰴ⮔⫄⡴⯄⪴⪴⫄\u2b74〤", "ⁿ聸⁾g쁿⁸聿⁾쁿g聢\ue078~~\ue07e聸\ue07c쁸恾쁿ꁸ", 1929407350 ]
    // 25b: astore 4
    // 25d: bipush 6
    // 25f: anewarray 282
    // 262: dup
    // 263: bipush 0
    // 264: bipush 95
    // 266: invokedynamic JNT (I)Lorg/lwjgl/stb/STBTTPackedchar$Buffer; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -233787523, "\ud801\u180e堂堁頎堂", "⻔⤄⼄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⥔⪄⪤⬤⫄⪔⪤⫔⪄\u2b74⺔⡴⯄⪴⪴⫄\u2b74〤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ\ue07e쁾ꁾ䁾恽聸", 1929407351 ]
    // 26b: aastore
    // 26c: dup
    // 26d: bipush 1
    // 26e: bipush 96
    // 270: invokedynamic JNT (I)Lorg/lwjgl/stb/STBTTPackedchar$Buffer; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -233787523, "\ud801\u180e堂堁頎堂", "⻔⤄⼄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⥔⪄⪤⬤⫄⪔⪤⫔⪄\u2b74⺔⡴⯄⪴⪴⫄\u2b74〤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ\ue07e쁾ꁾ䁾恽聸", 1929407344 ]
    // 275: aastore
    // 276: dup
    // 277: bipush 2
    // 278: sipush 128
    // 27b: invokedynamic JNT (I)Lorg/lwjgl/stb/STBTTPackedchar$Buffer; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -233787523, "\ud801\u180e堂堁頎堂", "⻔⤄⼄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⥔⪄⪤⬤⫄⪔⪤⫔⪄\u2b74⺔⡴⯄⪴⪴⫄\u2b74〤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ\ue07e쁾ꁾ䁾恽聸", 1929407321 ]
    // 280: aastore
    // 281: dup
    // 282: bipush 3
    // 283: sipush 144
    // 286: invokedynamic JNT (I)Lorg/lwjgl/stb/STBTTPackedchar$Buffer; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -233787523, "\ud801\u180e堂堁頎堂", "⻔⤄⼄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⥔⪄⪤⬤⫄⪔⪤⫔⪄\u2b74⺔⡴⯄⪴⪴⫄\u2b74〤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ\ue07e쁾ꁾ䁾恽聸", 1929407322 ]
    // 28b: aastore
    // 28c: dup
    // 28d: bipush 4
    // 28e: sipush 256
    // 291: invokedynamic JNT (I)Lorg/lwjgl/stb/STBTTPackedchar$Buffer; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -233787523, "\ud801\u180e堂堁頎堂", "⻔⤄⼄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⥔⪄⪤⬤⫄⪔⪤⫔⪄\u2b74⺔⡴⯄⪴⪴⫄\u2b74〤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ\ue07e쁾ꁾ䁾恽聸", 1929407323 ]
    // 296: aastore
    // 297: dup
    // 298: bipush 5
    // 299: bipush 1
    // 29a: invokedynamic JNT (I)Lorg/lwjgl/stb/STBTTPackedchar$Buffer; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -233787523, "\ud801\u180e堂堁頎堂", "⻔⤄⼄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⥔⪄⪤⬤⫄⪔⪤⫔⪄\u2b74⺔⡴⯄⪴⪴⫄\u2b74〤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ\ue07e쁾ꁾ䁾恽聸", 1929407300 ]
    // 29f: aastore
    // 2a0: astore 5
    // 2a2: invokedynamic JNT ()Lorg/lwjgl/stb/STBTTPackContext; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -233787523, "\ud801\u180e堂堁頎堂", "⻔⼄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⥔⪄⪤⬤⢤⭤⬴⮔⫄⯔⮔〤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿꁢⁿ\u007f쁸\ue07e䁸쁸", 1929407325 ]
    // 2a7: astore 6
    // 2a9: aload 6
    // 2ab: aload 4
    // 2ad: sipush 2048
    // 2b0: sipush 2048
    // 2b3: bipush 0
    // 2b4: bipush 1
    // 2b5: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;IIII)Z bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -233787523, "\ud80d頎᠂頎頎\ud800項堁\ud801\ud803\u181a堂\ud802堃᠍", "⻔⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⥔⪄⪤⬤⢤⭤⬴⮔⫄⯔⮔〤⤔⫴⪄⮴⪄⽤⬴⬄⭤⽤⡴Ⰴ⮔⫄⡴⯄⪴⪴⫄\u2b74〤⤄⤄⤄⤄⼄⧴", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼聸\ue078\ue07e쁸恸䁿\ue07e", 1929407326 ]
    // 2ba: pop
    // 2bb: aload 5
    // 2bd: arraylength
    // 2be: invokedynamic JNT (I)Lorg/lwjgl/stb/STBTTPackRange$Buffer; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -233787523, "\ud801\u180e堂堁頎堂", "⻔⤄⼄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⥔⪄⪤⬤⥴⪄⬴⫤⫄⺔⡴⯄⪴⪴⫄\u2b74〤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ聼恽\u007f⁾\ue07e", 1929407327 ]
    // 2c3: astore 7
    // 2c5: aload 7
    // 2c7: invokedynamic JNT ()Lorg/lwjgl/stb/STBTTPackRange; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -233787523, "\ud801\u180e堂堁頎堂", "⻔⼄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⥔⪄⪤⬤⥴⪄⬴⫤⫄〤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ聼恽\u007f⁾\ue07e", 1929407320 ]
    // 2cc: iload 2
    // 2cd: i2f
    // 2ce: bipush 32
    // 2d0: aconst_null
    // 2d1: bipush 95
    // 2d3: aload 5
    // 2d5: bipush 0
    // 2d6: aaload
    // 2d7: bipush 2
    // 2d8: bipush 2
    // 2d9: invokedynamic JNT (Ljava/lang/Object;FILjava/lang/Object;ILjava/lang/Object;BB)Lorg/lwjgl/stb/STBTTPackRange; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "\ud80d堂頎", "⻔⢴⤄⤔⫴⪄⮴⪄⽤⬴⬄⭤⽤⤄⬴⮔⡴⯄⪴⪴⫄\u2b74〤⤄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⥔⪄⪤⬤⫄⪔⪤⫔⪄\u2b74⺔⡴⯄⪴⪴⫄\u2b74〤⡴⡴⼄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⥔⪄⪤⬤⥴⪄⬴⫤⫄〤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ聼恽\u007f⁾\ue07e", 1929407297 ]
    // 2de: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Lorg/lwjgl/system/StructBuffer; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "頍堎頎", "⻔⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤Ⰴ⮤⮔⫄⭄⽤⦤⮔\u2b74⯄⪤⮔〤⼄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤Ⰴ⮤⮔⫄⭄⽤⦤⮔\u2b74⯄⪤⮔⡴⯄⪴⪴⫄\u2b74〤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ聼恽\u007f⁾\ue07e쁦聢\ue078~~\ue07e聸", 1929407298 ]
    // 2e3: pop
    // 2e4: aload 7
    // 2e6: invokedynamic JNT ()Lorg/lwjgl/stb/STBTTPackRange; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -233787523, "\ud801\u180e堂堁頎堂", "⻔⼄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⥔⪄⪤⬤⥴⪄⬴⫤⫄〤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ聼恽\u007f⁾\ue07e", 1929407299 ]
    // 2eb: iload 2
    // 2ec: i2f
    // 2ed: sipush 160
    // 2f0: aconst_null
    // 2f1: bipush 96
    // 2f3: aload 5
    // 2f5: bipush 1
    // 2f6: aaload
    // 2f7: bipush 2
    // 2f8: bipush 2
    // 2f9: invokedynamic JNT (Ljava/lang/Object;FILjava/lang/Object;ILjava/lang/Object;BB)Lorg/lwjgl/stb/STBTTPackRange; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "\ud80d堂頎", "⻔⢴⤄⤔⫴⪄⮴⪄⽤⬴⬄⭤⽤⤄⬴⮔⡴⯄⪴⪴⫄\u2b74〤⤄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⥔⪄⪤⬤⫄⪔⪤⫔⪄\u2b74⺔⡴⯄⪴⪴⫄\u2b74〤⡴⡴⼄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⥔⪄⪤⬤⥴⪄⬴⫤⫄〤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ聼恽\u007f⁾\ue07e", 1929407308 ]
    // 2fe: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Lorg/lwjgl/system/StructBuffer; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "頍堎頎", "⻔⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤Ⰴ⮤⮔⫄⭄⽤⦤⮔\u2b74⯄⪤⮔〤⼄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤Ⰴ⮤⮔⫄⭄⽤⦤⮔\u2b74⯄⪤⮔⡴⯄⪴⪴⫄\u2b74〤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ聼恽\u007f⁾\ue07e쁦聢\ue078~~\ue07e聸", 1929407301 ]
    // 303: pop
    // 304: aload 7
    // 306: invokedynamic JNT ()Lorg/lwjgl/stb/STBTTPackRange; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -233787523, "\ud801\u180e堂堁頎堂", "⻔⼄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⥔⪄⪤⬤⥴⪄⬴⫤⫄〤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ聼恽\u007f⁾\ue07e", 1929407302 ]
    // 30b: iload 2
    // 30c: i2f
    // 30d: sipush 256
    // 310: aconst_null
    // 311: sipush 128
    // 314: aload 5
    // 316: bipush 2
    // 317: aaload
    // 318: bipush 2
    // 319: bipush 2
    // 31a: invokedynamic JNT (Ljava/lang/Object;FILjava/lang/Object;ILjava/lang/Object;BB)Lorg/lwjgl/stb/STBTTPackRange; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "\ud80d堂頎", "⻔⢴⤄⤔⫴⪄⮴⪄⽤⬴⬄⭤⽤⤄⬴⮔⡴⯄⪴⪴⫄\u2b74〤⤄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⥔⪄⪤⬤⫄⪔⪤⫔⪄\u2b74⺔⡴⯄⪴⪴⫄\u2b74〤⡴⡴⼄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⥔⪄⪤⬤⥴⪄⬴⫤⫄〤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ聼恽\u007f⁾\ue07e", 1929407303 ]
    // 31f: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Lorg/lwjgl/system/StructBuffer; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "頍堎頎", "⻔⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤Ⰴ⮤⮔⫄⭄⽤⦤⮔\u2b74⯄⪤⮔〤⼄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤Ⰴ⮤⮔⫄⭄⽤⦤⮔\u2b74⯄⪤⮔⡴⯄⪴⪴⫄\u2b74〤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ聼恽\u007f⁾\ue07e쁦聢\ue078~~\ue07e聸", 1929407296 ]
    // 324: pop
    // 325: aload 7
    // 327: invokedynamic JNT ()Lorg/lwjgl/stb/STBTTPackRange; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -233787523, "\ud801\u180e堂堁頎堂", "⻔⼄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⥔⪄⪤⬤⥴⪄⬴⫤⫄〤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ聼恽\u007f⁾\ue07e", 1929407273 ]
    // 32c: iload 2
    // 32d: i2f
    // 32e: sipush 880
    // 331: aconst_null
    // 332: sipush 144
    // 335: aload 5
    // 337: bipush 3
    // 338: aaload
    // 339: bipush 2
    // 33a: bipush 2
    // 33b: invokedynamic JNT (Ljava/lang/Object;FILjava/lang/Object;ILjava/lang/Object;BB)Lorg/lwjgl/stb/STBTTPackRange; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "\ud80d堂頎", "⻔⢴⤄⤔⫴⪄⮴⪄⽤⬴⬄⭤⽤⤄⬴⮔⡴⯄⪴⪴⫄\u2b74〤⤄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⥔⪄⪤⬤⫄⪔⪤⫔⪄\u2b74⺔⡴⯄⪴⪴⫄\u2b74〤⡴⡴⼄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⥔⪄⪤⬤⥴⪄⬴⫤⫄〤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ聼恽\u007f⁾\ue07e", 1929407274 ]
    // 340: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Lorg/lwjgl/system/StructBuffer; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "頍堎頎", "⻔⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤Ⰴ⮤⮔⫄⭄⽤⦤⮔\u2b74⯄⪤⮔〤⼄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤Ⰴ⮤⮔⫄⭄⽤⦤⮔\u2b74⯄⪤⮔⡴⯄⪴⪴⫄\u2b74〤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ聼恽\u007f⁾\ue07e쁦聢\ue078~~\ue07e聸", 1929407275 ]
    // 345: pop
    // 346: aload 7
    // 348: invokedynamic JNT ()Lorg/lwjgl/stb/STBTTPackRange; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -233787523, "\ud801\u180e堂堁頎堂", "⻔⼄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⥔⪄⪤⬤⥴⪄⬴⫤⫄〤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ聼恽\u007f⁾\ue07e", 1929407316 ]
    // 34d: iload 2
    // 34e: i2f
    // 34f: sipush 1024
    // 352: aconst_null
    // 353: sipush 256
    // 356: aload 5
    // 358: bipush 4
    // 359: aaload
    // 35a: bipush 2
    // 35b: bipush 2
    // 35c: invokedynamic JNT (Ljava/lang/Object;FILjava/lang/Object;ILjava/lang/Object;BB)Lorg/lwjgl/stb/STBTTPackRange; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "\ud80d堂頎", "⻔⢴⤄⤔⫴⪄⮴⪄⽤⬴⬄⭤⽤⤄⬴⮔⡴⯄⪴⪴⫄\u2b74〤⤄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⥔⪄⪤⬤⫄⪔⪤⫔⪄\u2b74⺔⡴⯄⪴⪴⫄\u2b74〤⡴⡴⼄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⥔⪄⪤⬤⥴⪄⬴⫤⫄〤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ聼恽\u007f⁾\ue07e", 1929407277 ]
    // 361: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Lorg/lwjgl/system/StructBuffer; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "頍堎頎", "⻔⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤Ⰴ⮤⮔⫄⭄⽤⦤⮔\u2b74⯄⪤⮔〤⼄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤Ⰴ⮤⮔⫄⭄⽤⦤⮔\u2b74⯄⪤⮔⡴⯄⪴⪴⫄\u2b74〤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ聼恽\u007f⁾\ue07e쁦聢\ue078~~\ue07e聸", 1929407278 ]
    // 366: pop
    // 367: aload 7
    // 369: invokedynamic JNT ()Lorg/lwjgl/stb/STBTTPackRange; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -233787523, "\ud801\u180e堂堁頎堂", "⻔⼄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⥔⪄⪤⬤⥴⪄⬴⫤⫄〤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ聼恽\u007f⁾\ue07e", 1929407279 ]
    // 36e: iload 2
    // 36f: i2f
    // 370: sipush 8734
    // 373: aconst_null
    // 374: bipush 1
    // 375: aload 5
    // 377: bipush 5
    // 378: aaload
    // 379: bipush 2
    // 37a: bipush 2
    // 37b: invokedynamic JNT (Ljava/lang/Object;FILjava/lang/Object;ILjava/lang/Object;BB)Lorg/lwjgl/stb/STBTTPackRange; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "\ud80d堂頎", "⻔⢴⤄⤔⫴⪄⮴⪄⽤⬴⬄⭤⽤⤄⬴⮔⡴⯄⪴⪴⫄\u2b74〤⤄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⥔⪄⪤⬤⫄⪔⪤⫔⪄\u2b74⺔⡴⯄⪴⪴⫄\u2b74〤⡴⡴⼄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⥔⪄⪤⬤⥴⪄⬴⫤⫄〤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ聼恽\u007f⁾\ue07e", 1929407272 ]
    // 380: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)Lorg/lwjgl/system/StructBuffer; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "頍堎頎", "⻔⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤Ⰴ⮤⮔⫄⭄⽤⦤⮔\u2b74⯄⪤⮔〤⼄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤Ⰴ⮤⮔⫄⭄⽤⦤⮔\u2b74⯄⪤⮔⡴⯄⪴⪴⫄\u2b74〤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ聼恽\u007f⁾\ue07e쁦聢\ue078~~\ue07e聸", 1929407313 ]
    // 385: pop
    // 386: aload 7
    // 388: invokedynamic JNT (Ljava/lang/Object;)Lorg/lwjgl/system/CustomBuffer; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "᠃頌堃頍", "⻔⼄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤Ⰴ⮤⮔⫄⭄⽤⢤⯄⮤⮔⭤⭄⡴⯄⪴⪴⫄\u2b74〤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼쁼䁣恽ꁾꁿ聼恽\u007f⁾\ue07e쁦聢\ue078~~\ue07e聸", 1929407314 ]
    // 38d: pop
    // 38e: aload 6
    // 390: aload 1
    // 391: bipush 0
    // 392: aload 7
    // 394: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)Z bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -233787523, "\ud80d頎᠂頎頎\ud800項堁\ud801\ud803\u181b\ud80c᠍頎᠆堁᠍\ud802堂\ud80d", "⻔⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⥔⪄⪤⬤⢤⭤⬴⮔⫄⯔⮔〤⤔⫴⪄⮴⪄⽤⬴⬄⭤⽤⡴Ⰴ⮔⫄⡴⯄⪴⪴⫄\u2b74〤⤄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⥔⪄⪤⬤⥴⪄⬴⫤⫄⺔⡴⯄⪴⪴⫄\u2b74〤⼄⧴", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼聸\ue078\ue07e쁸恸䁿\ue07e", 1929407315 ]
    // 399: pop
    // 39a: aload 6
    // 39c: invokedynamic JNT (Ljava/lang/Object;)V bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -233787523, "\ud80d頎᠂頎頎\ud800項堁\ud801\ud803堚᠍頂", "⻔⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⥔⪄⪤⬤⢤⭤⬴⮔⫄⯔⮔〤⼄⦴", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼聸\ue078\ue07e쁸恸䁿\ue07e", 1929407324 ]
    // 3a1: aload 0
    // 3a2: sipush 2048
    // 3a5: sipush 2048
    // 3a8: invokedynamic JNT ()Lcom/mojang/blaze3d/textures/TextureFormat; bsm=vm.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -2081255251, "좨졀져짘", "編秨篨뭧篨秨盨翨竨懨뭧绨糨翨曨揨깧擨뭧哨揨棨哨叨滨揨淨뭧㓨揨棨哨叨滨揨䋨秨滨篨翨哨", "⥯⥿⮯ⴟ\u2ddf\u2dbf⧟\u2dbf\u2ddfⶏ⳿\u2dcfⵟ⧟ⴏ\u2daf⳿⺏ⴿ⨟\u2d2f⧟ⸯⴿ\u2e6fⸯ⸿⸏ⴿ⸟⧟Ⱟⴿ\u2e6fⸯ⸿⸏ⴿ⭏\u2ddf⸏\u2dbf⳿ⸯ⪟", -2002553745 ]
    // 3ad: invokedynamic JNT ()Lcom/mojang/blaze3d/textures/FilterMode; bsm=vm.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -2081255251, "졸졠좈졀젠좨", "編秨篨뭧篨秨盨翨竨懨뭧绨糨翨曨揨깧擨뭧哨揨棨哨叨滨揨淨뭧䋨矨糨哨揨滨寨秨擨揨", "⥯⥿⮯ⴟ\u2ddf\u2dbf⧟\u2dbf\u2ddfⶏ⳿\u2dcfⵟ⧟ⴏ\u2daf⳿⺏ⴿ⨟\u2d2f⧟ⸯⴿ\u2e6fⸯ⸿⸏ⴿ⸟⧟⭏⵿\u2dafⸯⴿ⸏⮿\u2ddf\u2d2fⴿ⪟", -2002553744 ]
    // 3b2: invokedynamic JNT ()Lcom/mojang/blaze3d/textures/FilterMode; bsm=vm.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -2081255251, "졸졠좈졀젠좨", "編秨篨뭧篨秨盨翨竨懨뭧绨糨翨曨揨깧擨뭧哨揨棨哨叨滨揨淨뭧䋨矨糨哨揨滨寨秨擨揨", "⥯⥿⮯ⴟ\u2ddf\u2dbf⧟\u2dbf\u2ddfⶏ⳿\u2dcfⵟ⧟ⴏ\u2daf⳿⺏ⴿ⨟\u2d2f⧟ⸯⴿ\u2e6fⸯ⸿⸏ⴿ⸟⧟⭏⵿\u2dafⸯⴿ⸏⮿\u2ddf\u2d2fⴿ⪟", -2002553743 ]
    // 3b7: invokedynamic JNT (IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -846025708, "領堃᠍堃頎᠙", "⻔⤄⤄⤔⪤⭤⭄⽤⭄⭤⫴⪄⬴⫤⽤⩴⬔⪄⯴⫄⾤⪔⽤⮔⫄⯔⮔⯄\u2b74⫄⮤⽤⦔⫄⯔⮔⯄\u2b74⫄⢴⭤\u2b74⭄⪄⮔〤⤔⪤⭤⭄⽤⭄⭤⫴⪄⬴⫤⽤⩴⬔⪄⯴⫄⾤⪔⽤⮔⫄⯔⮔⯄\u2b74⫄⮤⽤⢴⬄⬔⮔⫄\u2b74⥄⭤⪔⫄〤⤔⪤⭤⭄⽤⭄⭤⫴⪄⬴⫤⽤⩴⬔⪄⯴⫄⾤⪔⽤⮔⫄⯔⮔⯄\u2b74⫄⮤⽤⢴⬄⬔⮔⫄\u2b74⥄⭤⪔⫄〤⼄⦴", "ꁸ䁸", 1929407312 ]
    // 3bc: checkcast sx
    // 3bf: putfield vm.bin Lsx;
    // 3c2: aload 0
    // 3c3: invokedynamic JNT (Ljava/lang/Object;)Lsx; bsm=vm.1 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -1190471836, "쬨쭠쮈", "勨篨", "⥯⥿⮯⸟\u2e6f⪟", -2002553749 ]
    // 3c8: aload 4
    // 3ca: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)V bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "\ud803堌", "⻔⤔⫴⪄⮴⪄⽤⬴⬄⭤⽤⡴Ⰴ⮔⫄⡴⯄⪴⪴⫄\u2b74〤⼄⦴", "ꁸ䁸", 1929407290 ]
    // 3cf: aload 0
    // 3d0: aload 3
    // 3d1: iload 2
    // 3d2: i2f
    // 3d3: invokedynamic JNT (Ljava/lang/Object;F)F bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -233787523, "\ud80d頎᠂頎頎\ud800\ud805\ud801堁頌堂\u181b\ud80c\u180e項堃頏堂頌頛堂堃\ud802頃頎", "⻔⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤⮔⩴⽤⦤⦔⡴⦔⦔⢴⭤⬴⮔⬄⬴⪴⭤〤⢴⼄⢴", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ쁸聾gꁼ쁼聢쁼聸\ue078\ue07e쁸恸䁿\ue07e", 1929407291 ]
    // 3d8: putfield vm.lm F
    // 3db: invokedynamic JNT ()Lorg/lwjgl/system/MemoryStack; bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -233787523, "\ud80d頎堁\ud801\ud803項堎\ud80d頃", "⻔⼄⤔⭤\u2b74⫤⽤⬔⯤⫴⫤⬔⽤⮤Ⰴ⮤⮔⫄⭄⽤⥄⫄⭄⭤\u2b74Ⰴ⦤⮔⪄⪤⬤〤", "ⁿ聸⁾g쁿⁸聿⁾쁿gꁸ恸ꁸ쁸\ue07e\ue07fg\ue063\ue07e\ue07fⁿ聸恸ꁼ쁸恽ꁾꁿ", 1929407268 ]
    // 3e0: astore 8
    // 3e2: goto 003
    // 3e5: iinc 8 1
    // 3e8: goto 0ce
    // 3eb: iload 15
    // 3ed: ldc_w 1619129777
    // 3f0: iadd
    // 3f1: ldc_w 1655081532
    // 3f4: ixor
    // 3f5: ldc_w 776877560
    // 3f8: ixor
    // 3f9: ldc_w 2128557231
    // 3fc: isub
    // 3fd: ldc_w 83489737
    // 400: isub
    // 401: ldc_w 1405951652
    // 404: isub
    // 405: lookupswitch -990 2 853887352 -564 955294174 -990
    // 420: astore 10
    // 422: aload 9
    // 424: aload 10
    // 426: invokedynamic JNT (Ljava/lang/Object;Ljava/lang/Object;)V bsm=vm.0 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; args=[ -496486922, "堁頂頂\ud805堎頍頍\u180e堂\ud80d\ud80d堂頂", "⻔⤔⫴⪄⮴⪄⽤⬔⪄⬴⫤⽤⦔⫔\u2b74⭤⯤⪄⩴⬔⫄〤⼄⦴", "聿恽x恽g쁿恽\u007f⁾g쁼䁾聸ⁿ⁸恽聾쁿\ue07e", 1929407293 ]
    // 42b: goto 06f
  }

  public double mo(String var1, int var2) {
    int var8 = 1443001356;
    double var3 = 0.0;
    int var5 = 0;

    while (true) {
      var8 = 954335536 << -343818669 - -1160413236 ^ 1041472872;

      while (true) {
        switch ((var8 - 166769113 ^ 1048112657) + 1733028906 + 1406069157 + 641541186 ^ 409652933) {
          case -1326165348:
          default:
            return var3;
          case 1155037546:
        }

        if (var5 < var2) {
          char var6 = /* jnt */;
          pk var7 = (pk)/* jnt */, var6
          );
          if (var7 == null) {
            var7 = (pk)/* jnt */, 32
            );
          }

          var3 += (double)null /* jnt:encrypted */;
          var5++;
          break;
        }

        var8 = (-1564094050 - -1564094050 | 53411378) & -1551892545;
      }
    }
  }

  public int fsl() {
    return null /* jnt:encrypted */;
  }

  public double ll(sd var1, String var2, double var3, double var5, zn var7, double var8) {
    int var14 = -328687908;
    var5 += (double)(null /* jnt:encrypted */ * null /* jnt:encrypted */) * var8;
    int var10 = /* jnt */;
    /* jnt */;
    int var11 = 0;

    label26:
    while (true) {
      var14 = (-1975191444 * -1476957404 | 308762671) & 317192367;

      while (true) {
        switch (((var14 - 2121917356 ^ 498865743) + 2044129406 ^ 930272299) - 888463539 - 1910628568) {
          case -1912355370:
          default:
            if (var11 < var10) {
              char var12 = /* jnt */;
              pk var13 = (pk)/* jnt */,
                var12
              );
              if (var13 == null) {
                var13 = (pk)/* jnt */,
                  32
                );
              }

              /* jnt */null /* jnt:encrypted */ * var8,
                        var5 + (double)null /* jnt:encrypted */ * var8
                      ),
                      (double)null /* jnt:encrypted */,
                      (double)null /* jnt:encrypted */
                    ),
                    var7
                  )
                ),
                /* jnt */null /* jnt:encrypted */ * var8,
                        var5 + (double)null /* jnt:encrypted */ * var8
                      ),
                      (double)null /* jnt:encrypted */,
                      (double)null /* jnt:encrypted */
                    ),
                    var7
                  )
                ),
                /* jnt */null /* jnt:encrypted */ * var8,
                        var5 + (double)null /* jnt:encrypted */ * var8
                      ),
                      (double)null /* jnt:encrypted */,
                      (double)null /* jnt:encrypted */
                    ),
                    var7
                  )
                ),
                /* jnt */null /* jnt:encrypted */ * var8,
                        var5 + (double)null /* jnt:encrypted */ * var8
                      ),
                      (double)null /* jnt:encrypted */,
                      (double)null /* jnt:encrypted */
                    ),
                    var7
                  )
                )
              );
              var3 += (double)null /* jnt:encrypted */ * var8;
              var11++;
              continue label26;
            }

            var14 = (-1810856908 & -171918387 | 1244638932) & -348127275;
            break;
          case 1371232323:
            return var3;
        }
      }
    }
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 ^ 473789035) + 506749438 - 131888732 - 239699875 + 1998638116 - 894677290 ^ 1576180235) - 1305540715 - 135652165;
    MethodHandle var10000 = qsk[((var10 ^ 473789035) + 506749438 - 131888732 - 239699875 + 1998638116 - 894677290 ^ 1576180235)
      - 1305540715
      - 135652165
      + 1895618987];
    if (qsk[var10001 + 1895618987] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = 1445156948 >> (1445156948 >> -1951642202) ^ 722578474; var23 < var13.length(); var23 += (1635122685 | -728411030) ^ -168428034) {
        char var42 = var13.charAt(var23);
        char var47 = (char)(
          (
              (
                  (
                        (
                            (
                                  (
                                      (((((var42 & '￼') >> 2 | var42 << 14) & 65520) >> 4 | ((var42 & '￼') >> 2 | var42 << 14) << 12) - 217 - 135 & 65408) >> 7
                                        | ((((var42 & '￼') >> 2 | var42 << 14) & 65520) >> 4 | ((var42 & '￼') >> 2 | var42 << 14) << 12) - 217 - 135 << 9
                                    )
                                    & 64512
                                )
                                >> 10
                              | (
                                  (((((var42 & '￼') >> 2 | var42 << 14) & 65520) >> 4 | ((var42 & '￼') >> 2 | var42 << 14) << 12) - 217 - 135 & 65408) >> 7
                                    | ((((var42 & '￼') >> 2 | var42 << 14) & 65520) >> 4 | ((var42 & '￼') >> 2 | var42 << 14) << 12) - 217 - 135 << 9
                                )
                                << 6
                          )
                          & 65408
                      )
                      >> 7
                    | (
                        (
                              (
                                  (((((var42 & '￼') >> 2 | var42 << 14) & 65520) >> 4 | ((var42 & '￼') >> 2 | var42 << 14) << 12) - 217 - 135 & 65408) >> 7
                                    | ((((var42 & '￼') >> 2 | var42 << 14) & 65520) >> 4 | ((var42 & '￼') >> 2 | var42 << 14) << 12) - 217 - 135 << 9
                                )
                                & 64512
                            )
                            >> 10
                          | (
                              (((((var42 & '￼') >> 2 | var42 << 14) & 65520) >> 4 | ((var42 & '￼') >> 2 | var42 << 14) << 12) - 217 - 135 & 65408) >> 7
                                | ((((var42 & '￼') >> 2 | var42 << 14) & 65520) >> 4 | ((var42 & '￼') >> 2 | var42 << 14) << 12) - 217 - 135 << 9
                            )
                            << 6
                      )
                      << 9
                )
                ^ 64
                ^ 145
            )
            - 116
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
                                        (((((var42 & '￼') >> 2 | var42 << 14) & 65520) >> 4 | ((var42 & '￼') >> 2 | var42 << 14) << 12) - 217 - 135 & 65408)
                                            >> 7
                                          | ((((var42 & '￼') >> 2 | var42 << 14) & 65520) >> 4 | ((var42 & '￼') >> 2 | var42 << 14) << 12) - 217 - 135 << 9
                                      )
                                      & 64512
                                  )
                                  >> 10
                                | (
                                    (((((var42 & '￼') >> 2 | var42 << 14) & 65520) >> 4 | ((var42 & '￼') >> 2 | var42 << 14) << 12) - 217 - 135 & 65408) >> 7
                                      | ((((var42 & '￼') >> 2 | var42 << 14) & 65520) >> 4 | ((var42 & '￼') >> 2 | var42 << 14) << 12) - 217 - 135 << 9
                                  )
                                  << 6
                            )
                            & 65408
                        )
                        >> 7
                      | (
                          (
                                (
                                    (((((var42 & '￼') >> 2 | var42 << 14) & 65520) >> 4 | ((var42 & '￼') >> 2 | var42 << 14) << 12) - 217 - 135 & 65408) >> 7
                                      | ((((var42 & '￼') >> 2 | var42 << 14) & 65520) >> 4 | ((var42 & '￼') >> 2 | var42 << 14) << 12) - 217 - 135 << 9
                                  )
                                  & 64512
                              )
                              >> 10
                            | (
                                (((((var42 & '￼') >> 2 | var42 << 14) & 65520) >> 4 | ((var42 & '￼') >> 2 | var42 << 14) << 12) - 217 - 135 & 65408) >> 7
                                  | ((((var42 & '￼') >> 2 | var42 << 14) & 65520) >> 4 | ((var42 & '￼') >> 2 | var42 << 14) << 12) - 217 - 135 << 9
                              )
                              << 6
                        )
                        << 9
                  )
                  ^ 64
                  ^ 145
              )
              - 116
          )
        );
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = -423829950 * -423829950 ^ -907638524; var29 < var16.length(); var29 += -1966534665 + -352238212 ^ 1976194418) {
        int var52 = (var16.charAt(var29) ^ 5) - 45 ^ 37;
        int var93 = (var52 & 0) >> 16;
        int var53 = (var52 & 0) >> 16 | var52 << 0;
        int var94 = (((var52 & 0) >> 16 | var52 << 0) & 65472) >> 6;
        var52 = (((var93 | var52 << 0) & 65472) >> 6 | ((var52 & 0) >> 16 | var52 << 0) << 10) ^ 176;
        var93 = (((var94 | var53 << 10) ^ 176) & 64512) >> 10;
        int var55 = (((((var94 | var53 << 10) ^ 176) & 64512) >> 10 | var52 << 6) ^ 59) - 58;
        int var96 = ((((((var94 | var53 << 10) ^ 176) & 64512) >> 10 | var52 << 6) ^ 59) - 58 & 65520) >> 4;
        char var56 = (char)((((var93 | var52 << 6) ^ 59) - 58 & 65520) >> 4 | (((((var94 | var53 << 10) ^ 176) & 64512) >> 10 | var52 << 6) ^ 59) - 58 << 12);
        var16.setCharAt(var29, (char)(var96 | var55 << 12));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), vm.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = -331992814 - -331992814 ^ 0; var35 < var19.length(); var35 += 1398929604 >>> -1197717011 ^ 170766) {
        int var61 = var19.charAt(var35) ^ 'k';
        char var66 = (char)(
          (
              (
                  (
                        (
                            (
                                  (
                                      (((((var61 & 57344) >> 13 | var61 << 3) & 65535) >> 0 | ((var61 & 57344) >> 13 | var61 << 3) << 16) & 32768) >> 15
                                        | ((((var61 & 57344) >> 13 | var61 << 3) & 65535) >> 0 | ((var61 & 57344) >> 13 | var61 << 3) << 16) << 1
                                    )
                                    & 65520
                                )
                                >> 4
                              | (
                                  (((((var61 & 57344) >> 13 | var61 << 3) & 65535) >> 0 | ((var61 & 57344) >> 13 | var61 << 3) << 16) & 32768) >> 15
                                    | ((((var61 & 57344) >> 13 | var61 << 3) & 65535) >> 0 | ((var61 & 57344) >> 13 | var61 << 3) << 16) << 1
                                )
                                << 12
                          )
                          & 57344
                      )
                      >> 13
                    | (
                        (
                              (
                                  (((((var61 & 57344) >> 13 | var61 << 3) & 65535) >> 0 | ((var61 & 57344) >> 13 | var61 << 3) << 16) & 32768) >> 15
                                    | ((((var61 & 57344) >> 13 | var61 << 3) & 65535) >> 0 | ((var61 & 57344) >> 13 | var61 << 3) << 16) << 1
                                )
                                & 65520
                            )
                            >> 4
                          | (
                              (((((var61 & 57344) >> 13 | var61 << 3) & 65535) >> 0 | ((var61 & 57344) >> 13 | var61 << 3) << 16) & 32768) >> 15
                                | ((((var61 & 57344) >> 13 | var61 << 3) & 65535) >> 0 | ((var61 & 57344) >> 13 | var61 << 3) << 16) << 1
                            )
                            << 12
                      )
                      << 3
                )
                ^ 60
            )
            + 142
            - 121
            - 67
        );
        var19.setCharAt(
          var35,
          (char)(
            (
                (
                    (
                          (
                              (
                                    (
                                        (((((var61 & 57344) >> 13 | var61 << 3) & 65535) >> 0 | ((var61 & 57344) >> 13 | var61 << 3) << 16) & 32768) >> 15
                                          | ((((var61 & 57344) >> 13 | var61 << 3) & 65535) >> 0 | ((var61 & 57344) >> 13 | var61 << 3) << 16) << 1
                                      )
                                      & 65520
                                  )
                                  >> 4
                                | (
                                    (((((var61 & 57344) >> 13 | var61 << 3) & 65535) >> 0 | ((var61 & 57344) >> 13 | var61 << 3) << 16) & 32768) >> 15
                                      | ((((var61 & 57344) >> 13 | var61 << 3) & 65535) >> 0 | ((var61 & 57344) >> 13 | var61 << 3) << 16) << 1
                                  )
                                  << 12
                            )
                            & 57344
                        )
                        >> 13
                      | (
                          (
                                (
                                    (((((var61 & 57344) >> 13 | var61 << 3) & 65535) >> 0 | ((var61 & 57344) >> 13 | var61 << 3) << 16) & 32768) >> 15
                                      | ((((var61 & 57344) >> 13 | var61 << 3) & 65535) >> 0 | ((var61 & 57344) >> 13 | var61 << 3) << 16) << 1
                                  )
                                  & 65520
                              )
                              >> 4
                            | (
                                (((((var61 & 57344) >> 13 | var61 << 3) & 65535) >> 0 | ((var61 & 57344) >> 13 | var61 << 3) << 16) & 32768) >> 15
                                  | ((((var61 & 57344) >> 13 | var61 << 3) & 65535) >> 0 | ((var61 & 57344) >> 13 | var61 << 3) << 16) << 1
                              )
                              << 12
                        )
                        << 3
                  )
                  ^ 60
              )
              + 142
              - 121
              - 67
          )
        );
      }

      Class var7 = Class.forName(var19.toString(), false, vm.class.getClassLoader());
      switch ((var4 + 1873005046 - 6447059 ^ 259978854 ^ 312506294 ^ 2029117770 ^ 989056822) - 235535118 + 120518409 + 44919634 ^ 514968856) {
        case 351713818:
        case 1170007108:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 617664577:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 1080749552:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 1887827251:
          var10000 = var0.findSpecial(var7, var5, var6, vm.class);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    qsk[((var10 ^ 473789035) + 506749438 - 131888732 - 239699875 + 1998638116 - 894677290 ^ 1576180235) - 1305540715 - 135652165 + 1895618987] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (var10 + 962210243 + 537669833 - 1178996050 + 16937890 - 941481231 ^ 1251476172) + 1658581259 + 265862727 + 488750267;
    MethodHandle var10000 = qsk[(var10 + 962210243 + 537669833 - 1178996050 + 16937890 - 941481231 ^ 1251476172)
      + 1658581259
      + 265862727
      + 488750267
      + 1106852154];
    if (qsk[var10001 + 1106852154] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = -336529272 << -336529272 ^ -252147712; var24 < var14.length(); var24 += 1169289482 & 1169289482 ^ 1169289483) {
        char var43 = var14.charAt(var24);
        char var48 = (char)(
          (
              (
                    (
                        (
                              (
                                  (
                                        ((((((var43 & '￠') >> 5 | var43 << 11) & 65528) >> 3 | ((var43 & '￠') >> 5 | var43 << 11) << 13) ^ 222) + 134 ^ 247)
                                            - 105
                                          & 65504
                                      )
                                      >> 5
                                    | ((((((var43 & '￠') >> 5 | var43 << 11) & 65528) >> 3 | ((var43 & '￠') >> 5 | var43 << 11) << 13) ^ 222) + 134 ^ 247)
                                        - 105
                                      << 11
                                )
                                & 65528
                            )
                            >> 3
                          | (
                              (
                                    ((((((var43 & '￠') >> 5 | var43 << 11) & 65528) >> 3 | ((var43 & '￠') >> 5 | var43 << 11) << 13) ^ 222) + 134 ^ 247) - 105
                                      & 65504
                                  )
                                  >> 5
                                | ((((((var43 & '￠') >> 5 | var43 << 11) & 65528) >> 3 | ((var43 & '￠') >> 5 | var43 << 11) << 13) ^ 222) + 134 ^ 247) - 105
                                  << 11
                            )
                            << 13
                      )
                      & 65528
                  )
                  >> 3
                | (
                    (
                          (
                              (
                                    ((((((var43 & '￠') >> 5 | var43 << 11) & 65528) >> 3 | ((var43 & '￠') >> 5 | var43 << 11) << 13) ^ 222) + 134 ^ 247) - 105
                                      & 65504
                                  )
                                  >> 5
                                | ((((((var43 & '￠') >> 5 | var43 << 11) & 65528) >> 3 | ((var43 & '￠') >> 5 | var43 << 11) << 13) ^ 222) + 134 ^ 247) - 105
                                  << 11
                            )
                            & 65528
                        )
                        >> 3
                      | (
                          (((((((var43 & '￠') >> 5 | var43 << 11) & 65528) >> 3 | ((var43 & '￠') >> 5 | var43 << 11) << 13) ^ 222) + 134 ^ 247) - 105 & 65504)
                              >> 5
                            | ((((((var43 & '￠') >> 5 | var43 << 11) & 65528) >> 3 | ((var43 & '￠') >> 5 | var43 << 11) << 13) ^ 222) + 134 ^ 247) - 105 << 11
                        )
                        << 13
                  )
                  << 13
            )
            - 3
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
                                          ((((((var43 & '￠') >> 5 | var43 << 11) & 65528) >> 3 | ((var43 & '￠') >> 5 | var43 << 11) << 13) ^ 222) + 134 ^ 247)
                                              - 105
                                            & 65504
                                        )
                                        >> 5
                                      | ((((((var43 & '￠') >> 5 | var43 << 11) & 65528) >> 3 | ((var43 & '￠') >> 5 | var43 << 11) << 13) ^ 222) + 134 ^ 247)
                                          - 105
                                        << 11
                                  )
                                  & 65528
                              )
                              >> 3
                            | (
                                (
                                      ((((((var43 & '￠') >> 5 | var43 << 11) & 65528) >> 3 | ((var43 & '￠') >> 5 | var43 << 11) << 13) ^ 222) + 134 ^ 247)
                                          - 105
                                        & 65504
                                    )
                                    >> 5
                                  | ((((((var43 & '￠') >> 5 | var43 << 11) & 65528) >> 3 | ((var43 & '￠') >> 5 | var43 << 11) << 13) ^ 222) + 134 ^ 247) - 105
                                    << 11
                              )
                              << 13
                        )
                        & 65528
                    )
                    >> 3
                  | (
                      (
                            (
                                (
                                      ((((((var43 & '￠') >> 5 | var43 << 11) & 65528) >> 3 | ((var43 & '￠') >> 5 | var43 << 11) << 13) ^ 222) + 134 ^ 247)
                                          - 105
                                        & 65504
                                    )
                                    >> 5
                                  | ((((((var43 & '￠') >> 5 | var43 << 11) & 65528) >> 3 | ((var43 & '￠') >> 5 | var43 << 11) << 13) ^ 222) + 134 ^ 247) - 105
                                    << 11
                              )
                              & 65528
                          )
                          >> 3
                        | (
                            (((((((var43 & '￠') >> 5 | var43 << 11) & 65528) >> 3 | ((var43 & '￠') >> 5 | var43 << 11) << 13) ^ 222) + 134 ^ 247) - 105 & 65504)
                                >> 5
                              | ((((((var43 & '￠') >> 5 | var43 << 11) & 65528) >> 3 | ((var43 & '￠') >> 5 | var43 << 11) << 13) ^ 222) + 134 ^ 247) - 105
                                << 11
                          )
                          << 13
                    )
                    << 13
              )
              - 3
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = 768517134 ^ -1993203008 ^ -1526954290;
        var30 < var17.length();
        var30 += (-914491671 >>> -1367395700 + (-914491671 ^ -1367395700) | 1) & 973832193
      ) {
        char var53 = var17.charAt(var30);
        char var58 = (char)(
          (
              (
                    (
                        (
                              (
                                    (
                                        (
                                              (
                                                  (((var53 & '\ufffe') >> 1 | var53 << 15) - 12 - 104 & 65532) >> 2
                                                    | ((var53 & '\ufffe') >> 1 | var53 << 15) - 12 - 104 << 14
                                                )
                                                & 65520
                                            )
                                            >> 4
                                          | (
                                              (((var53 & '\ufffe') >> 1 | var53 << 15) - 12 - 104 & 65532) >> 2
                                                | ((var53 & '\ufffe') >> 1 | var53 << 15) - 12 - 104 << 14
                                            )
                                            << 12
                                      )
                                      ^ 225
                                  )
                                  + 117
                                & 65528
                            )
                            >> 3
                          | (
                                (
                                    (
                                          (
                                              (((var53 & '\ufffe') >> 1 | var53 << 15) - 12 - 104 & 65532) >> 2
                                                | ((var53 & '\ufffe') >> 1 | var53 << 15) - 12 - 104 << 14
                                            )
                                            & 65520
                                        )
                                        >> 4
                                      | (
                                          (((var53 & '\ufffe') >> 1 | var53 << 15) - 12 - 104 & 65532) >> 2
                                            | ((var53 & '\ufffe') >> 1 | var53 << 15) - 12 - 104 << 14
                                        )
                                        << 12
                                  )
                                  ^ 225
                              )
                              + 117
                            << 13
                      )
                      & 49152
                  )
                  >> 14
                | (
                    (
                          (
                                (
                                    (
                                          (
                                              (((var53 & '\ufffe') >> 1 | var53 << 15) - 12 - 104 & 65532) >> 2
                                                | ((var53 & '\ufffe') >> 1 | var53 << 15) - 12 - 104 << 14
                                            )
                                            & 65520
                                        )
                                        >> 4
                                      | (
                                          (((var53 & '\ufffe') >> 1 | var53 << 15) - 12 - 104 & 65532) >> 2
                                            | ((var53 & '\ufffe') >> 1 | var53 << 15) - 12 - 104 << 14
                                        )
                                        << 12
                                  )
                                  ^ 225
                              )
                              + 117
                            & 65528
                        )
                        >> 3
                      | (
                            (
                                (
                                      (
                                          (((var53 & '\ufffe') >> 1 | var53 << 15) - 12 - 104 & 65532) >> 2
                                            | ((var53 & '\ufffe') >> 1 | var53 << 15) - 12 - 104 << 14
                                        )
                                        & 65520
                                    )
                                    >> 4
                                  | (
                                      (((var53 & '\ufffe') >> 1 | var53 << 15) - 12 - 104 & 65532) >> 2
                                        | ((var53 & '\ufffe') >> 1 | var53 << 15) - 12 - 104 << 14
                                    )
                                    << 12
                              )
                              ^ 225
                          )
                          + 117
                        << 13
                  )
                  << 2
            )
            ^ 43
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
                                                    (((var53 & '\ufffe') >> 1 | var53 << 15) - 12 - 104 & 65532) >> 2
                                                      | ((var53 & '\ufffe') >> 1 | var53 << 15) - 12 - 104 << 14
                                                  )
                                                  & 65520
                                              )
                                              >> 4
                                            | (
                                                (((var53 & '\ufffe') >> 1 | var53 << 15) - 12 - 104 & 65532) >> 2
                                                  | ((var53 & '\ufffe') >> 1 | var53 << 15) - 12 - 104 << 14
                                              )
                                              << 12
                                        )
                                        ^ 225
                                    )
                                    + 117
                                  & 65528
                              )
                              >> 3
                            | (
                                  (
                                      (
                                            (
                                                (((var53 & '\ufffe') >> 1 | var53 << 15) - 12 - 104 & 65532) >> 2
                                                  | ((var53 & '\ufffe') >> 1 | var53 << 15) - 12 - 104 << 14
                                              )
                                              & 65520
                                          )
                                          >> 4
                                        | (
                                            (((var53 & '\ufffe') >> 1 | var53 << 15) - 12 - 104 & 65532) >> 2
                                              | ((var53 & '\ufffe') >> 1 | var53 << 15) - 12 - 104 << 14
                                          )
                                          << 12
                                    )
                                    ^ 225
                                )
                                + 117
                              << 13
                        )
                        & 49152
                    )
                    >> 14
                  | (
                      (
                            (
                                  (
                                      (
                                            (
                                                (((var53 & '\ufffe') >> 1 | var53 << 15) - 12 - 104 & 65532) >> 2
                                                  | ((var53 & '\ufffe') >> 1 | var53 << 15) - 12 - 104 << 14
                                              )
                                              & 65520
                                          )
                                          >> 4
                                        | (
                                            (((var53 & '\ufffe') >> 1 | var53 << 15) - 12 - 104 & 65532) >> 2
                                              | ((var53 & '\ufffe') >> 1 | var53 << 15) - 12 - 104 << 14
                                          )
                                          << 12
                                    )
                                    ^ 225
                                )
                                + 117
                              & 65528
                          )
                          >> 3
                        | (
                              (
                                  (
                                        (
                                            (((var53 & '\ufffe') >> 1 | var53 << 15) - 12 - 104 & 65532) >> 2
                                              | ((var53 & '\ufffe') >> 1 | var53 << 15) - 12 - 104 << 14
                                          )
                                          & 65520
                                      )
                                      >> 4
                                    | (
                                        (((var53 & '\ufffe') >> 1 | var53 << 15) - 12 - 104 & 65532) >> 2
                                          | ((var53 & '\ufffe') >> 1 | var53 << 15) - 12 - 104 << 14
                                      )
                                      << 12
                                )
                                ^ 225
                            )
                            + 117
                          << 13
                    )
                    << 2
              )
              ^ 43
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, vm.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = -41534196 * (-417078707 - -1465286003) ^ -183681792; var36 < var20.length(); var36 += 1466569537 ^ 517275902 ^ 1237259198) {
        int var63 = var20.charAt(var36) + '\b';
        char var66 = (char)(
          (
              ((((((var63 & 61440) >> 12 | var63 << 4) ^ 101) & 65534) >> 1 | (((var63 & 61440) >> 12 | var63 << 4) ^ 101) << 15) + 22 + 42 - 111 + 163 & 65408)
                  >> 7
                | (((((var63 & 61440) >> 12 | var63 << 4) ^ 101) & 65534) >> 1 | (((var63 & 61440) >> 12 | var63 << 4) ^ 101) << 15) + 22 + 42 - 111 + 163 << 9
            )
            + 145
        );
        var20.setCharAt(
          var36,
          (char)(
            (
                (
                      (((((var63 & 61440) >> 12 | var63 << 4) ^ 101) & 65534) >> 1 | (((var63 & 61440) >> 12 | var63 << 4) ^ 101) << 15) + 22 + 42 - 111 + 163
                        & 65408
                    )
                    >> 7
                  | (((((var63 & 61440) >> 12 | var63 << 4) ^ 101) & 65534) >> 1 | (((var63 & 61440) >> 12 | var63 << 4) ^ 101) << 15) + 22 + 42 - 111 + 163
                    << 9
              )
              + 145
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), vm.class.getClassLoader()).returnType();
      switch ((var4 + 1051403245 + 1928738659 + 771137302 + 1157611002 + 1595559373 - 789550344 + 1416140877 + 1818484728 ^ 287588634) + 2069256218) {
        case 45961874:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 60527399:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1521736174:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1949324071:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      qsk[(var10 + 962210243 + 537669833 - 1178996050 + 16937890 - 941481231 ^ 1251476172) + 1658581259 + 265862727 + 488750267 + 1106852154] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
