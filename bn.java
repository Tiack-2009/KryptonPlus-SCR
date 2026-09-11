// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

public class bn {
  public String zb;
  public String ckl;
  // [JNT] MethodHandle dispatch table (removed)
  public bn(hn var1, String var2, String var3) {
    this.zb = var2;
    this.ckl = var3;
  }

  public String ob() {
    return null /* jnt:encrypted */;
  }

  public String brh() {
    return null /* jnt:encrypted */;
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (((var10 ^ 1090889849) - 1540420921 + 1592614228 ^ 289520556) - 1591073915 + 1141021396 ^ 1809020473) - 1224778037 ^ 537497016;
    MethodHandle var10000 = hlq[((((var10 ^ 1090889849) - 1540420921 + 1592614228 ^ 289520556) - 1591073915 + 1141021396 ^ 1809020473) - 1224778037 ^ 537497016)
      - 2097854070];
    if (hlq[var10001 - 2097854070] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (445938091 & -1985221580 - 445938091 | 0) & -1314814430; var24 < var14.length(); var24 += (1970887923 & 1970887923 | 0) & -2013134327) {
        char var43 = var14.charAt(var24);
        int var10004 = (var43 & 'ﰀ') >> 10;
        int var44 = ((var43 & 'ﰀ') >> 10 | var43 << 6) - 187;
        int var86 = (((var43 & 'ﰀ') >> 10 | var43 << 6) - 187 & 0) >> 16;
        var43 = (char)(((((var10004 | var43 << 6) - 187 & 0) >> 16 | ((var43 & 'ﰀ') >> 10 | var43 << 6) - 187 << 0) - 202 + 48 - 195 - 84 - 204 ^ 66) + 175);
        var14.setCharAt(var24, (char)(((var86 | var44 << 0) - 202 + 48 - 195 - 84 - 204 ^ 66) + 175));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = 68091482 >>> (-1301476963 << 68091482) ^ 68091482; var30 < var17.length(); var30 += -187276109 - -1889922254 ^ 1702646144) {
        int var50 = var17.charAt(var30) - 'C';
        int var87 = (var50 & 49152) >> 14;
        int var51 = ((var50 & 49152) >> 14 | var50 << 2) ^ 146;
        int var88 = ((((var50 & 49152) >> 14 | var50 << 2) ^ 146) & 65532) >> 2;
        var50 = (((var87 | var50 << 2) ^ 146) & 65532) >> 2 | (((var50 & 49152) >> 14 | var50 << 2) ^ 146) << 14;
        var87 = ((var88 | var51 << 14) & 63488) >> 11;
        int var53 = (((var88 | var51 << 14) & 63488) >> 11 | var50 << 5) - 128 + 88;
        int var90 = ((((var88 | var51 << 14) & 63488) >> 11 | var50 << 5) - 128 + 88 & 65534) >> 1;
        var50 = ((var87 | var50 << 5) - 128 + 88 & 65534) >> 1 | (((var88 | var51 << 14) & 63488) >> 11 | var50 << 5) - 128 + 88 << 15;
        var87 = ((var90 | var53 << 15) & 49152) >> 14;
        int var55 = ((var90 | var53 << 15) & 49152) >> 14 | var50 << 2;
        int var92 = ((((var90 | var53 << 15) & 49152) >> 14 | var50 << 2) & 65472) >> 6;
        char var56 = (char)(((var87 | var50 << 2) & 65472) >> 6 | (((var90 | var53 << 15) & 49152) >> 14 | var50 << 2) << 10);
        var17.setCharAt(var30, (char)(var92 | var55 << 10));
      }

      Class var6 = Class.forName(var17.toString(), false, bn.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (-327279264 | -327279264 | 0) & 25190943; var36 < var20.length(); var36 += 542187779 + (1758494428 >> -1304083821) ^ 542191132) {
        int var61 = var20.charAt(var36);
        int var93 = (var61 & 65472) >> 6;
        int var62 = (var61 & 65472) >> 6 | var61 << 10;
        int var94 = (((var61 & 65472) >> 6 | var61 << 10) & 0) >> 16;
        var61 = ((((var93 | var61 << 10) & 0) >> 16 | ((var61 & 65472) >> 6 | var61 << 10) << 0) ^ 42) - 190;
        var93 = (((var94 | var62 << 0) ^ 42) - 190 & 65528) >> 3;
        int var64 = ((((var94 | var62 << 0) ^ 42) - 190 & 65528) >> 3 | var61 << 13) + 30 + 10;
        int var96 = (((((var94 | var62 << 0) ^ 42) - 190 & 65528) >> 3 | var61 << 13) + 30 + 10 & 63488) >> 11;
        char var65 = (char)(
          ((((var93 | var61 << 13) + 30 + 10 & 63488) >> 11 | ((((var94 | var62 << 0) ^ 42) - 190 & 65528) >> 3 | var61 << 13) + 30 + 10 << 5) ^ 113) - 125
        );
        var20.setCharAt(var36, (char)(((var96 | var64 << 5) ^ 113) - 125));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), bn.class.getClassLoader()).returnType();
      switch (((var4 + 1040399790 + 1441095490 + 1574663840 + 842839184 ^ 1761875106 ^ 1095842874) - 784799376 ^ 1967537991) + 881048861 - 2107181916) {
        case 477760799:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 994708667:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1410113068:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 2105640396:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      hlq[((((var10 ^ 1090889849) - 1540420921 + 1592614228 ^ 289520556) - 1591073915 + 1141021396 ^ 1809020473) - 1224778037 ^ 537497016) - 2097854070] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
