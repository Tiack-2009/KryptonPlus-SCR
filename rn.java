// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import dev.krypton.jnt3.Loader;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class rn extends LinkedHashMap<mu, Boolean> {
  // [JNT] MethodHandle dispatch table (removed)
  public rn(es var1, int var2, float var3, boolean var4) {
    this.vjb = var1;
    super(var2, var3, var4);
  }

  @Override
  public boolean removeEldestEntry(Entry var1) {
    return /* jnt */ > 10000;
  }

  static {
    Loader.init(rn.class);
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 - 832093174 - 1816881944 ^ 395689611) + 1771629792 + 523567125 - 1683351630 ^ 151564957) - 1776319732 + 1662817951;
    MethodHandle var10000 = zzo[((var10 - 832093174 - 1816881944 ^ 395689611) + 1771629792 + 523567125 - 1683351630 ^ 151564957)
      - 1776319732
      + 1662817951
      + 456523637];
    if (zzo[var10001 + 456523637] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = 453909585 - 453909585 ^ 0; var23 < var13.length(); var23 += 29444048 >> -1826357242 ^ 460062) {
        int var42 = (var13.charAt(var23) - ')' ^ 150) + 152;
        int var10004 = (var42 & 65472) >> 6;
        int var43 = ((var42 & 65472) >> 6 | var42 << 10) ^ 8 ^ 211;
        int var87 = ((((var42 & 65472) >> 6 | var42 << 10) ^ 8 ^ 211) & 49152) >> 14;
        var42 = (((var10004 | var42 << 10) ^ 8 ^ 211) & 49152) >> 14 | (((var42 & 65472) >> 6 | var42 << 10) ^ 8 ^ 211) << 2;
        var10004 = ((var87 | var43 << 2) & 65520) >> 4;
        int var45 = ((var87 | var43 << 2) & 65520) >> 4 | var42 << 12;
        int var89 = ((((var87 | var43 << 2) & 65520) >> 4 | var42 << 12) & 57344) >> 13;
        char var46 = (char)((((var10004 | var42 << 12) & 57344) >> 13 | (((var87 | var43 << 2) & 65520) >> 4 | var42 << 12) << 3) + 249);
        var13.setCharAt(var23, (char)((var89 | var45 << 3) + 249));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (-1634171563 | -526028944 | 0) & 16781442; var29 < var16.length(); var29 += 1910671567 ^ -1089971316 ^ -823471294) {
        char var51 = var16.charAt(var29);
        char var54 = (char)(
          ((((((var51 & 'ﰀ') >> 10 | var51 << 6) & 32768) >> 15 | ((var51 & 'ﰀ') >> 10 | var51 << 6) << 1) + 173 - 80 ^ 107 ^ 77) + 12 - 226 + 207 & 65472)
              >> 6
            | (((((var51 & 'ﰀ') >> 10 | var51 << 6) & 32768) >> 15 | ((var51 & 'ﰀ') >> 10 | var51 << 6) << 1) + 173 - 80 ^ 107 ^ 77) + 12 - 226 + 207 << 10
        );
        var16.setCharAt(
          var29,
          (char)(
            ((((((var51 & 'ﰀ') >> 10 | var51 << 6) & 32768) >> 15 | ((var51 & 'ﰀ') >> 10 | var51 << 6) << 1) + 173 - 80 ^ 107 ^ 77) + 12 - 226 + 207 & 65472)
                >> 6
              | (((((var51 & 'ﰀ') >> 10 | var51 << 6) & 32768) >> 15 | ((var51 & 'ﰀ') >> 10 | var51 << 6) << 1) + 173 - 80 ^ 107 ^ 77) + 12 - 226 + 207 << 10
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), rn.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (1654815958 | 1752892887 | 0) & 335544832; var35 < var19.length(); var35 += -1934318743 - 546341084 ^ 1814307468) {
        int var59 = var19.charAt(var35) ^ 3;
        int var93 = (var59 & 65532) >> 2;
        int var60 = ((var59 & 65532) >> 2 | var59 << 14) ^ 200;
        int var94 = ((((var59 & 65532) >> 2 | var59 << 14) ^ 200) & 65535) >> 0;
        var59 = (((var93 | var59 << 14) ^ 200) & 65535) >> 0 | (((var59 & 65532) >> 2 | var59 << 14) ^ 200) << 16;
        var93 = ((var94 | var60 << 16) & 63488) >> 11;
        int var62 = (((var94 | var60 << 16) & 63488) >> 11 | var59 << 5) ^ 16;
        int var96 = (((((var94 | var60 << 16) & 63488) >> 11 | var59 << 5) ^ 16) & 65472) >> 6;
        var59 = ((((var93 | var59 << 5) ^ 16) & 65472) >> 6 | ((((var94 | var60 << 16) & 63488) >> 11 | var59 << 5) ^ 16) << 10) + 208;
        var93 = ((var96 | var62 << 10) + 208 & 65408) >> 7;
        int var64 = ((var96 | var62 << 10) + 208 & 65408) >> 7 | var59 << 9;
        int var98 = ((((var96 | var62 << 10) + 208 & 65408) >> 7 | var59 << 9) & 49152) >> 14;
        char var65 = (char)(((var93 | var59 << 9) & 49152) >> 14 | (((var96 | var62 << 10) + 208 & 65408) >> 7 | var59 << 9) << 2);
        var19.setCharAt(var35, (char)(var98 | var64 << 2));
      }

      Class var7 = Class.forName(var19.toString(), false, rn.class.getClassLoader());
      switch ((var4 - 1002718319 - 1897662083 + 255716270 ^ 885860081 ^ 1703667103) + 1766308183 - 567913844 + 354408666 + 150018626 ^ 941437663) {
        case 695171148:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 1047360602:
          var10000 = var0.findSpecial(var7, var5, var6, rn.class);
          break;
        case 1303065005:
        case 1330219779:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1413364394:
          var10000 = var0.findConstructor(var7, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    zzo[((var10 - 832093174 - 1816881944 ^ 395689611) + 1771629792 + 523567125 - 1683351630 ^ 151564957) - 1776319732 + 1662817951 + 456523637] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static native void guard();
}
