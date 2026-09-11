// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

public enum wi {
  uk,
  smp;
  // [JNT] MethodHandle dispatch table (removed)
  // $VF: Failed to inline enum fields
  // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
  static {
    int var10000 = (-1236659494 | -1747501481) ^ -1210106145;

    StringBuilder var10001;
    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < ((-1961425634 << 1394672812 | 6) & -2029648402);
      var10000 += (-963352497 >> -963352497 | 1) & 12935
    ) {
      int var6 = /* jnt */ + 151;
      int var10004 = (var6 & 32768) >> 15;
      int var7 = (var6 & 32768) >> 15 | var6 << 1;
      int var24 = (((var6 & 32768) >> 15 | var6 << 1) & 65528) >> 3;
      var6 = ((var10004 | var6 << 1) & 65528) >> 3 | ((var6 & 32768) >> 15 | var6 << 1) << 13;
      var10004 = ((var24 | var7 << 13) & 65534) >> 1;
      int var9 = ((var24 | var7 << 13) & 65534) >> 1 | var6 << 15;
      int var26 = ((((var24 | var7 << 13) & 65534) >> 1 | var6 << 15) & 65520) >> 4;
      char var10 = (char)(((var10004 | var6 << 15) & 65520) >> 4 | (((var24 | var7 << 13) & 65534) >> 1 | var6 << 15) << 12);
      /* jnt */(var26 | var9 << 12));
    }

    uk = (wi)/* jnt */,
      0
    );
    var10000 = -181503758 - -1117877860 ^ 936374102;

    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < ((751035421 << (63175907 & 751035421) | 4) & 7340614);
      var10000 += (49968135 >>> 49968135 | 1) & 599785751
    ) {
      int var13 = /* jnt */ - 146;
      char var16 = (char)(
        (((((var13 & 65532) >> 2 | var13 << 14) - 224 & 65520) >> 4 | ((var13 & 65532) >> 2 | var13 << 14) - 224 << 12) & 57344) >> 13
          | ((((var13 & 65532) >> 2 | var13 << 14) - 224 & 65520) >> 4 | ((var13 & 65532) >> 2 | var13 << 14) - 224 << 12) << 3
      );
      /* jnt */(
          (((((var13 & 65532) >> 2 | var13 << 14) - 224 & 65520) >> 4 | ((var13 & 65532) >> 2 | var13 << 14) - 224 << 12) & 57344) >> 13
            | ((((var13 & 65532) >> 2 | var13 << 14) - 224 & 65520) >> 4 | ((var13 & 65532) >> 2 | var13 << 14) - 224 << 12) << 3
        )
      );
    }

    smp = (wi)/* jnt */,
      1
    );
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = ((((var10 ^ 1301362688) + 629669225 ^ 1349789058) + 904050619 ^ 760591455) + 483724423 + 443583178 ^ 1968625804) - 1487784562;
    MethodHandle var10000 = ubz[((((var10 ^ 1301362688) + 629669225 ^ 1349789058) + 904050619 ^ 760591455) + 483724423 + 443583178 ^ 1968625804)
      - 1487784562
      + 1780046769];
    if (ubz[var10001 + 1780046769] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (1779249260 ^ 1779249260 | 0) & -411289141; var23 < var13.length(); var23 += (1478221595 >> 1478221595 | 1) & 1867522929) {
        int var42 = var13.charAt(var23);
        int var10004 = (var42 & 65520) >> 4;
        int var43 = ((var42 & 65520) >> 4 | var42 << 12) + 28;
        int var89 = (((var42 & 65520) >> 4 | var42 << 12) + 28 & 49152) >> 14;
        var42 = (((var10004 | var42 << 12) + 28 & 49152) >> 14 | ((var42 & 65520) >> 4 | var42 << 12) + 28 << 2) - 175;
        var10004 = ((var89 | var43 << 2) - 175 & 65472) >> 6;
        int var45 = (((var89 | var43 << 2) - 175 & 65472) >> 6 | var42 << 10) ^ 251;
        int var91 = (((((var89 | var43 << 2) - 175 & 65472) >> 6 | var42 << 10) ^ 251) & 65535) >> 0;
        var42 = (((var10004 | var42 << 10) ^ 251) & 65535) >> 0 | ((((var89 | var43 << 2) - 175 & 65472) >> 6 | var42 << 10) ^ 251) << 16;
        var10004 = ((var91 | var45 << 16) & 61440) >> 12;
        int var47 = (((var91 | var45 << 16) & 61440) >> 12 | var42 << 4) + 245;
        int var93 = ((((var91 | var45 << 16) & 61440) >> 12 | var42 << 4) + 245 & 32768) >> 15;
        char var48 = (char)(((var10004 | var42 << 4) + 245 & 32768) >> 15 | (((var91 | var45 << 16) & 61440) >> 12 | var42 << 4) + 245 << 1);
        var13.setCharAt(var23, (char)(var93 | var47 << 1));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (-516816818 ^ -1053365554 | 0) & -621145015; var29 < var16.length(); var29 += (-216189153 | -53239620) ^ -2115650) {
        int var53 = var16.charAt(var29);
        int var94 = (var53 & 61440) >> 12;
        int var54 = (((var53 & 61440) >> 12 | var53 << 4) ^ 243 ^ 167 ^ 197) - 104;
        int var95 = ((((var53 & 61440) >> 12 | var53 << 4) ^ 243 ^ 167 ^ 197) - 104 & 49152) >> 14;
        var53 = (((var94 | var53 << 4) ^ 243 ^ 167 ^ 197) - 104 & 49152) >> 14 | (((var53 & 61440) >> 12 | var53 << 4) ^ 243 ^ 167 ^ 197) - 104 << 2;
        var94 = ((var95 | var54 << 2) & 65504) >> 5;
        int var56 = ((var95 | var54 << 2) & 65504) >> 5 | var53 << 11;
        int var97 = ((((var95 | var54 << 2) & 65504) >> 5 | var53 << 11) & 65408) >> 7;
        char var57 = (char)((((var94 | var53 << 11) & 65408) >> 7 | (((var95 | var54 << 2) & 65504) >> 5 | var53 << 11) << 9) - 171 - 132);
        var16.setCharAt(var29, (char)((var97 | var56 << 9) - 171 - 132));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), wi.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (600075097 >> 175686955 | 0) & 1674085650; var35 < var19.length(); var35 += 205439070 & -1441177272 ^ 135807049) {
        int var62 = var19.charAt(var35) ^ 216 ^ 95;
        int var98 = (var62 & 63488) >> 11;
        int var63 = ((var62 & 63488) >> 11 | var62 << 5) ^ 24 ^ 250;
        int var99 = ((((var62 & 63488) >> 11 | var62 << 5) ^ 24 ^ 250) & 65472) >> 6;
        var62 = (((var98 | var62 << 5) ^ 24 ^ 250) & 65472) >> 6 | (((var62 & 63488) >> 11 | var62 << 5) ^ 24 ^ 250) << 10;
        var98 = ((var99 | var63 << 10) & 65535) >> 0;
        int var65 = (((var99 | var63 << 10) & 65535) >> 0 | var62 << 16) - 65 - 146;
        int var101 = ((((var99 | var63 << 10) & 65535) >> 0 | var62 << 16) - 65 - 146 & 57344) >> 13;
        char var66 = (char)(((var98 | var62 << 16) - 65 - 146 & 57344) >> 13 | (((var99 | var63 << 10) & 65535) >> 0 | var62 << 16) - 65 - 146 << 3);
        var19.setCharAt(var35, (char)(var101 | var65 << 3));
      }

      Class var7 = Class.forName(var19.toString(), false, wi.class.getClassLoader());
      switch ((var4 + 524911589 + 1242540364 + 241088692 ^ 900707138) + 169776884 + 388546142 + 2099670623 + 1082817095 - 1052863550 ^ 1824568146) {
        case 356233977:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 761999336:
        case 1545275709:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1174789479:
          var10000 = var0.findSpecial(var7, var5, var6, wi.class);
          break;
        case 1698124951:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    ubz[((((var10 ^ 1301362688) + 629669225 ^ 1349789058) + 904050619 ^ 760591455) + 483724423 + 443583178 ^ 1968625804) - 1487784562 + 1780046769] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 ^ 100526040) - 1568654382 ^ 1339784771 ^ 1942644175 ^ 185062501 ^ 1723029969) + 637322880 + 1609868194 ^ 1412636222;
    MethodHandle var10000 = ubz[((var10 ^ 100526040) - 1568654382 ^ 1339784771 ^ 1942644175 ^ 185062501 ^ 1723029969) + 637322880 + 1609868194
      ^ 1412636222
      ^ 1712499234];
    if (ubz[var10001 ^ 1712499234] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (-1268295401 * -1268295401 | 0) & 1078249862; var24 < var14.length(); var24 += (1569348627 & 1569348627 | 0) & -2142928855) {
        char var43 = var14.charAt(var24);
        int var10004 = (var43 & 'ﾀ') >> 7;
        int var44 = ((var43 & 'ﾀ') >> 7 | var43 << '\t') + 225 - 109 + 64 - 189;
        int var78 = (((var43 & 'ﾀ') >> 7 | var43 << '\t') + 225 - 109 + 64 - 189 & 65535) >> 0;
        var43 = (char)(
          (
              (((var10004 | var43 << '\t') + 225 - 109 + 64 - 189 & 65535) >> 0 | ((var43 & 'ﾀ') >> 7 | var43 << '\t') + 225 - 109 + 64 - 189 << 16)
                ^ 208
                ^ 11
                ^ 35
            )
            + 239
        );
        var14.setCharAt(var24, (char)(((var78 | var44 << 16) ^ 208 ^ 11 ^ 35) + 239));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = 70128182 << 70128182 ^ -1920991232; var30 < var17.length(); var30 += (1351857061 ^ -1916742987 | 1) & 33558695) {
        char var50 = var17.charAt(var30);
        int var79 = (var50 & '￼') >> 2;
        int var51 = (((var50 & '￼') >> 2 | var50 << 14) - 109 + 205 + 150 - 161 + 133 ^ 91) - 124 - 80;
        int var80 = ((((var50 & '￼') >> 2 | var50 << 14) - 109 + 205 + 150 - 161 + 133 ^ 91) - 124 - 80 & 61440) >> 12;
        var50 = (char)(
          (((var79 | var50 << 14) - 109 + 205 + 150 - 161 + 133 ^ 91) - 124 - 80 & 61440) >> 12
            | (((var50 & '￼') >> 2 | var50 << 14) - 109 + 205 + 150 - 161 + 133 ^ 91) - 124 - 80 << 4
        );
        var17.setCharAt(var30, (char)(var80 | var51 << 4));
      }

      Class var6 = Class.forName(var17.toString(), false, wi.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = -1154060959 * -1206783546 * 1428148138 ^ 1597653500; var36 < var20.length(); var36 += (378732208 + 378732208 | 1) & -1069547513) {
        int var57 = var20.charAt(var36) + 201;
        int var81 = (var57 & 65532) >> 2;
        int var58 = (var57 & 65532) >> 2 | var57 << 14;
        int var82 = (((var57 & 65532) >> 2 | var57 << 14) & 65472) >> 6;
        var57 = ((((var81 | var57 << 14) & 65472) >> 6 | ((var57 & 65532) >> 2 | var57 << 14) << 10) ^ 61) + 192;
        var81 = (((var82 | var58 << 10) ^ 61) + 192 & 57344) >> 13;
        int var60 = (((((var82 | var58 << 10) ^ 61) + 192 & 57344) >> 13 | var57 << 3) ^ 103) - 115;
        int var84 = ((((((var82 | var58 << 10) ^ 61) + 192 & 57344) >> 13 | var57 << 3) ^ 103) - 115 & 65408) >> 7;
        char var61 = (char)(
          ((((var81 | var57 << 3) ^ 103) - 115 & 65408) >> 7 | (((((var82 | var58 << 10) ^ 61) + 192 & 57344) >> 13 | var57 << 3) ^ 103) - 115 << 9) ^ 105
        );
        var20.setCharAt(var36, (char)((var84 | var60 << 9) ^ 105));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), wi.class.getClassLoader()).returnType();
      switch (((var4 ^ 1685752458) + 819437396 - 1781540085 - 2059080462 ^ 1337919068) - 1304152743 - 588404382 - 60985150 - 178584504 + 282567384) {
        case 31778788:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 793642248:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1014277588:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1782680890:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      ubz[((var10 ^ 100526040) - 1568654382 ^ 1339784771 ^ 1942644175 ^ 185062501 ^ 1723029969) + 637322880 + 1609868194 ^ 1412636222 ^ 1712499234] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
