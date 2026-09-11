// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

public enum pw {
  fo,
  pwy,
  cu;
  // [JNT] MethodHandle dispatch table (removed)
  // $VF: Failed to inline enum fields
  // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
  static {
    int var10000 = (1601547856 ^ -1715570965 | 0) & 154404672;

    StringBuilder var10001;
    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < ((451500679 | -1277366151) ^ -1140983045);
      var10000 += (-831944133 ^ -831944133 | 1) & 578694945
    ) {
      int var10 = /* jnt */ ^ '\'';
      int var10004 = (var10 & 65532) >> 2;
      int var11 = ((var10 & 65532) >> 2 | var10 << 14) + 148;
      int var25 = (((var10 & 65532) >> 2 | var10 << 14) + 148 & 65408) >> 7;
      char var12 = (char)((((var10004 | var10 << 14) + 148 & 65408) >> 7 | ((var10 & 65532) >> 2 | var10 << 14) + 148 << 9) ^ 253);
      /* jnt */((var25 | var11 << 9) ^ 253)
      );
    }

    fo = (pw)/* jnt */,
      0
    );
    var10000 = (-1180944975 >>> 905257518 | 0) & -1933569916;

    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < ((-1232052022 | -16590806 | 0) & 4522761);
      var10000 += (1345867951 & -1028821056 | 1) & 46241643
    ) {
      int var15 = (
          /* jnt */
            ^ '\n'
            ^ 153
            ^ 238
        )
        + 79;
      char var16 = (char)((var15 & 65535) >> 0 | var15 << 16);
      /* jnt */((var15 & 65535) >> 0 | var15 << 16)
      );
    }

    pwy = (pw)/* jnt */,
      1
    );
    var10000 = (-1683013081 - 633314160 | 0) & 134222088;

    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < ((-665606551 << -692819104 - -665606551 | 8) & -1050073890);
      var10000 += -1694323015 << -1278844554 ^ -1371537407
    ) {
      int var19 = /* jnt */
        + 222
        - 207
        + 33;
      char var20 = (char)(((var19 & 63488) >> 11 | var19 << 5) + 13);
      /* jnt */(((var19 & 63488) >> 11 | var19 << 5) + 13)
      );
    }

    cu = (pw)/* jnt */,
      2
    );
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (var10 - 405229420 ^ 500365433 ^ 409891415) + 1465404435 + 1874830388 + 1313052664 + 352176094 + 1196282937 + 1305958389;
    MethodHandle var10000 = exa[(var10 - 405229420 ^ 500365433 ^ 409891415)
      + 1465404435
      + 1874830388
      + 1313052664
      + 352176094
      + 1196282937
      + 1305958389
      - 1148550138];
    if (exa[var10001 - 1148550138] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (1172715014 >> 1172715014 | 0) & -2069880569; var23 < var13.length(); var23 += 1091029848 & -1846670061 ^ 17172753) {
        int var42 = var13.charAt(var23) + '%';
        int var10004 = (var42 & 32768) >> 15;
        int var43 = (var42 & 32768) >> 15 | var42 << 1;
        int var97 = (((var42 & 32768) >> 15 | var42 << 1) & 49152) >> 14;
        var42 = (((var10004 | var42 << 1) & 49152) >> 14 | ((var42 & 32768) >> 15 | var42 << 1) << 2) - 39;
        var10004 = ((var97 | var43 << 2) - 39 & 61440) >> 12;
        int var45 = ((var97 | var43 << 2) - 39 & 61440) >> 12 | var42 << 4;
        int var99 = ((((var97 | var43 << 2) - 39 & 61440) >> 12 | var42 << 4) & 65504) >> 5;
        var42 = ((var10004 | var42 << 4) & 65504) >> 5 | (((var97 | var43 << 2) - 39 & 61440) >> 12 | var42 << 4) << 11;
        var10004 = ((var99 | var45 << 11) & 65520) >> 4;
        int var47 = ((var99 | var45 << 11) & 65520) >> 4 | var42 << 12;
        int var101 = ((((var99 | var45 << 11) & 65520) >> 4 | var42 << 12) & 65504) >> 5;
        var42 = ((var10004 | var42 << 12) & 65504) >> 5 | (((var99 | var45 << 11) & 65520) >> 4 | var42 << 12) << 11;
        var10004 = ((var101 | var47 << 11) & 65534) >> 1;
        int var49 = ((var101 | var47 << 11) & 65534) >> 1 | var42 << 15;
        int var103 = ((((var101 | var47 << 11) & 65534) >> 1 | var42 << 15) & 65535) >> 0;
        char var50 = (char)(((var10004 | var42 << 15) & 65535) >> 0 | (((var101 | var47 << 11) & 65534) >> 1 | var42 << 15) << 16);
        var13.setCharAt(var23, (char)(var103 | var49 << 16));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (1058822489 | 424714788 | 0) & -1065156478; var29 < var16.length(); var29 += 457496199 - 457496199 ^ 1) {
        int var55 = var16.charAt(var29);
        int var104 = (var55 & 32768) >> 15;
        int var56 = ((var55 & 32768) >> 15 | var55 << 1) + 163 ^ 24;
        int var105 = ((((var55 & 32768) >> 15 | var55 << 1) + 163 ^ 24) & 49152) >> 14;
        var55 = (((var104 | var55 << 1) + 163 ^ 24) & 49152) >> 14 | (((var55 & 32768) >> 15 | var55 << 1) + 163 ^ 24) << 2;
        var104 = ((var105 | var56 << 2) & 64512) >> 10;
        int var58 = (((var105 | var56 << 2) & 64512) >> 10 | var55 << 6) - 236 + 61;
        int var107 = ((((var105 | var56 << 2) & 64512) >> 10 | var55 << 6) - 236 + 61 & 63488) >> 11;
        var55 = ((var104 | var55 << 6) - 236 + 61 & 63488) >> 11 | (((var105 | var56 << 2) & 64512) >> 10 | var55 << 6) - 236 + 61 << 5;
        var104 = ((var107 | var58 << 5) & 57344) >> 13;
        int var60 = ((var107 | var58 << 5) & 57344) >> 13 | var55 << 3;
        int var109 = ((((var107 | var58 << 5) & 57344) >> 13 | var55 << 3) & 65528) >> 3;
        char var61 = (char)(((var104 | var55 << 3) & 65528) >> 3 | (((var107 | var58 << 5) & 57344) >> 13 | var55 << 3) << 13);
        var16.setCharAt(var29, (char)(var109 | var60 << 13));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), pw.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = -1333464278 >> -804445779 ^ -162777; var35 < var19.length(); var35 += (71139898 ^ 1810451612 | 1) & -1878974143) {
        int var66 = var19.charAt(var35);
        int var110 = (var66 & 65408) >> 7;
        int var67 = ((var66 & 65408) >> 7 | var66 << 9) + 123;
        int var111 = (((var66 & 65408) >> 7 | var66 << 9) + 123 & 65024) >> 9;
        var66 = ((var110 | var66 << 9) + 123 & 65024) >> 9 | ((var66 & 65408) >> 7 | var66 << 9) + 123 << 7;
        var110 = ((var111 | var67 << 7) & 65520) >> 4;
        int var69 = ((((var111 | var67 << 7) & 65520) >> 4 | var66 << 12) ^ 192 ^ 143 ^ 250) - 7 + 222;
        int var113 = (((((var111 | var67 << 7) & 65520) >> 4 | var66 << 12) ^ 192 ^ 143 ^ 250) - 7 + 222 & 65024) >> 9;
        char var70 = (char)(
          (((var110 | var66 << 12) ^ 192 ^ 143 ^ 250) - 7 + 222 & 65024) >> 9
            | ((((var111 | var67 << 7) & 65520) >> 4 | var66 << 12) ^ 192 ^ 143 ^ 250) - 7 + 222 << 7
        );
        var19.setCharAt(var35, (char)(var113 | var69 << 7));
      }

      Class var7 = Class.forName(var19.toString(), false, pw.class.getClassLoader());
      switch ((var4 - 575894600 ^ 58746299 ^ 1652534330) + 1322057461 - 1217908112 - 2065010192 + 1125824132 - 329744317 + 1886660294 ^ 1641417980) {
        case 420433785:
          var10000 = var0.findSpecial(var7, var5, var6, pw.class);
          break;
        case 1136463910:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 1298336236:
        case 1333283015:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1977902181:
          var10000 = var0.findConstructor(var7, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    exa[(var10 - 405229420 ^ 500365433 ^ 409891415) + 1465404435 + 1874830388 + 1313052664 + 352176094 + 1196282937 + 1305958389 - 1148550138] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 - 1239001473 + 1376165784 ^ 1845101268 ^ 1066897407) - 386023586 - 365971589 ^ 1874819256) - 1182895282 + 1494501821;
    MethodHandle var10000 = exa[((var10 - 1239001473 + 1376165784 ^ 1845101268 ^ 1066897407) - 386023586 - 365971589 ^ 1874819256)
      - 1182895282
      + 1494501821
      + 1276383833];
    if (exa[var10001 + 1276383833] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (76414311 | 76414311 | 654482873) ^ 663748095; var24 < var14.length(); var24 += (1713548675 << 1713548675 | 1) & 33587463) {
        int var43 = var14.charAt(var24) + 135 - 3 + 76 + 211;
        char var46 = (char)(
          (
              (((((var43 & 65528) >> 3 | var43 << 13) - 86 & 65535) >> 0 | ((var43 & 65528) >> 3 | var43 << 13) - 86 << 16) - 223 & 32768) >> 15
                | ((((var43 & 65528) >> 3 | var43 << 13) - 86 & 65535) >> 0 | ((var43 & 65528) >> 3 | var43 << 13) - 86 << 16) - 223 << 1
            )
            ^ 48
        );
        var14.setCharAt(
          var24,
          (char)(
            (
                (((((var43 & 65528) >> 3 | var43 << 13) - 86 & 65535) >> 0 | ((var43 & 65528) >> 3 | var43 << 13) - 86 << 16) - 223 & 32768) >> 15
                  | ((((var43 & 65528) >> 3 | var43 << 13) - 86 & 65535) >> 0 | ((var43 & 65528) >> 3 | var43 << 13) - 86 << 16) - 223 << 1
              )
              ^ 48
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (1004997830 >>> (-1977763567 >> -1977763567) | 0) & 50855936; var30 < var17.length(); var30 += 1864815316 >> 1864815316 ^ 1779) {
        int var51 = var17.charAt(var30) - 213 - 183 - 43;
        char var54 = (char)(
          (
              ((((((var51 & 65472) >> 6 | var51 << 10) ^ 103) - 111 & 64512) >> 10 | (((var51 & 65472) >> 6 | var51 << 10) ^ 103) - 111 << 6) & 65532) >> 2
                | (((((var51 & 65472) >> 6 | var51 << 10) ^ 103) - 111 & 64512) >> 10 | (((var51 & 65472) >> 6 | var51 << 10) ^ 103) - 111 << 6) << 14
            )
            ^ 77
            ^ 135
        );
        var17.setCharAt(
          var30,
          (char)(
            (
                ((((((var51 & 65472) >> 6 | var51 << 10) ^ 103) - 111 & 64512) >> 10 | (((var51 & 65472) >> 6 | var51 << 10) ^ 103) - 111 << 6) & 65532) >> 2
                  | (((((var51 & 65472) >> 6 | var51 << 10) ^ 103) - 111 & 64512) >> 10 | (((var51 & 65472) >> 6 | var51 << 10) ^ 103) - 111 << 6) << 14
              )
              ^ 77
              ^ 135
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, pw.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (1738756881 * (-1474873996 & 2040935775) | 0) & -2105526013; var36 < var20.length(); var36 += 890760055 << 26189945 ^ -301989887) {
        int var59 = var20.charAt(var36) - 244;
        int var91 = (var59 & 61440) >> 12;
        int var60 = (var59 & 61440) >> 12 | var59 << 4;
        int var92 = (((var59 & 61440) >> 12 | var59 << 4) & 61440) >> 12;
        var59 = ((var91 | var59 << 4) & 61440) >> 12 | ((var59 & 61440) >> 12 | var59 << 4) << 4;
        var91 = ((var92 | var60 << 4) & 65024) >> 9;
        int var62 = ((var92 | var60 << 4) & 65024) >> 9 | var59 << 7;
        int var94 = ((((var92 | var60 << 4) & 65024) >> 9 | var59 << 7) & 63488) >> 11;
        var59 = ((var91 | var59 << 7) & 63488) >> 11 | (((var92 | var60 << 4) & 65024) >> 9 | var59 << 7) << 5;
        var91 = ((var94 | var62 << 5) & 65535) >> 0;
        int var64 = (((var94 | var62 << 5) & 65535) >> 0 | var59 << 16) ^ 180;
        int var96 = (((((var94 | var62 << 5) & 65535) >> 0 | var59 << 16) ^ 180) & 65504) >> 5;
        char var65 = (char)((((((var91 | var59 << 16) ^ 180) & 65504) >> 5 | ((((var94 | var62 << 5) & 65535) >> 0 | var59 << 16) ^ 180) << 11) ^ 196) + 184);
        var20.setCharAt(var36, (char)(((var96 | var64 << 11) ^ 196) + 184));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), pw.class.getClassLoader()).returnType();
      switch (((var4 + 1798026667 ^ 190518515) - 320785728 + 795492819 ^ 816112972) + 571569870 - 2136698981 + 1685814619 - 721764019 - 1719883594) {
        case 508887062:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 726684297:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1081194061:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1315718268:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      exa[((var10 - 1239001473 + 1376165784 ^ 1845101268 ^ 1066897407) - 386023586 - 365971589 ^ 1874819256) - 1182895282 + 1494501821 + 1276383833] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
