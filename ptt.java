// KryptonPlus Module: AutoFish
// Original class: ptt
// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

public class AutoFish extends er {
  public double hrz;
  public double la;
  public double sbo;
  // [JNT] MethodHandle dispatch table (removed)
  public ptt(double var1, double var3, double var5) {
    this.hrz = var1;
    this.la = var3;
    this.sbo = var5;
  }

  public double tbw() {
    return null /* jnt:encrypted */;
  }

  public void zqp(double var1) {
    null /* jnt:encrypted */;
  }

  public double kcv() {
    return null /* jnt:encrypted */;
  }

  public void jiw(double var1) {
    null /* jnt:encrypted */;
  }

  public double izs() {
    return null /* jnt:encrypted */;
  }

  public void tul(double var1) {
    null /* jnt:encrypted */;
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (var10 - 1252541445 ^ 435451569 ^ 1092605493) + 1016107336 + 716608595 - 644519734 - 1654665192 - 1847666496 - 447177164;
    MethodHandle var10000 = dof[(var10 - 1252541445 ^ 435451569 ^ 1092605493)
      + 1016107336
      + 716608595
      - 644519734
      - 1654665192
      - 1847666496
      - 447177164
      + 1987758211];
    if (dof[var10001 + 1987758211] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (-1361220595 ^ -1361220595 ^ -1128469320 | 0) & 1124205378; var24 < var14.length(); var24 += (1918106891 | 283770542) ^ 1929117614) {
        int var43 = (var14.charAt(var24) + 'c' - 57 ^ 105) + 38;
        int var10004 = (var43 & 61440) >> 12;
        int var44 = (var43 & 61440) >> 12 | var43 << 4;
        int var86 = (((var43 & 61440) >> 12 | var43 << 4) & 65520) >> 4;
        char var45 = (char)(((((var10004 | var43 << 4) & 65520) >> 4 | ((var43 & 61440) >> 12 | var43 << 4) << 12) ^ 187) - 178 - 252 ^ 200);
        var14.setCharAt(var24, (char)(((var86 | var44 << 12) ^ 187) - 178 - 252 ^ 200));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (1274704693 + 1041891684 | 0) & 1140886048; var30 < var17.length(); var30 += (403273868 ^ 506069956 | 1) & -2139061101) {
        int var50 = var17.charAt(var30);
        int var87 = (var50 & 65472) >> 6;
        int var51 = ((var50 & 65472) >> 6 | var50 << 10) ^ 99;
        int var88 = ((((var50 & 65472) >> 6 | var50 << 10) ^ 99) & 65504) >> 5;
        var50 = ((((var87 | var50 << 10) ^ 99) & 65504) >> 5 | (((var50 & 65472) >> 6 | var50 << 10) ^ 99) << 11) ^ 33;
        var87 = (((var88 | var51 << 11) ^ 33) & 61440) >> 12;
        int var53 = (((var88 | var51 << 11) ^ 33) & 61440) >> 12 | var50 << 4;
        int var90 = (((((var88 | var51 << 11) ^ 33) & 61440) >> 12 | var50 << 4) & 65024) >> 9;
        var50 = ((((var87 | var50 << 4) & 65024) >> 9 | ((((var88 | var51 << 11) ^ 33) & 61440) >> 12 | var50 << 4) << 7) ^ 43) + 35;
        var87 = (((var90 | var53 << 7) ^ 43) + 35 & 65024) >> 9;
        int var55 = (((var90 | var53 << 7) ^ 43) + 35 & 65024) >> 9 | var50 << 7;
        int var92 = (((((var90 | var53 << 7) ^ 43) + 35 & 65024) >> 9 | var50 << 7) & 49152) >> 14;
        char var56 = (char)(((var87 | var50 << 7) & 49152) >> 14 | ((((var90 | var53 << 7) ^ 43) + 35 & 65024) >> 9 | var50 << 7) << 2);
        var17.setCharAt(var30, (char)(var92 | var55 << 2));
      }

      Class var6 = Class.forName(var17.toString(), false, ptt.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (-1809181271 - 558824133 | 0) & 270336; var36 < var20.length(); var36 += (-711034186 + 1114604254 | 1) & 1722810921) {
        int var61 = var20.charAt(var36) ^ 29;
        int var93 = (var61 & 65520) >> 4;
        int var62 = ((var61 & 65520) >> 4 | var61 << 12) - 234 - 123;
        int var94 = (((var61 & 65520) >> 4 | var61 << 12) - 234 - 123 & 65024) >> 9;
        var61 = ((var93 | var61 << 12) - 234 - 123 & 65024) >> 9 | ((var61 & 65520) >> 4 | var61 << 12) - 234 - 123 << 7;
        var93 = ((var94 | var62 << 7) & 63488) >> 11;
        int var64 = ((((var94 | var62 << 7) & 63488) >> 11 | var61 << 5) - 183 ^ 251) + 254;
        int var96 = (((((var94 | var62 << 7) & 63488) >> 11 | var61 << 5) - 183 ^ 251) + 254 & 65472) >> 6;
        char var65 = (char)(
          (((var93 | var61 << 5) - 183 ^ 251) + 254 & 65472) >> 6 | ((((var94 | var62 << 7) & 63488) >> 11 | var61 << 5) - 183 ^ 251) + 254 << 10
        );
        var20.setCharAt(var36, (char)(var96 | var64 << 10));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), ptt.class.getClassLoader()).returnType();
      switch (((var4 - 2102533770 + 335182098 - 614670776 ^ 947631340) - 1368414189 - 74654615 + 1237058748 - 960077011 ^ 2052134383) - 1846455869) {
        case 182244156:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 207163641:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 288036509:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1084152062:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      dof[(var10 - 1252541445 ^ 435451569 ^ 1092605493) + 1016107336 + 716608595 - 644519734 - 1654665192 - 1847666496 - 447177164 + 1987758211] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
