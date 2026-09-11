// Status: PARTIAL - JNT native encryption (strings in jnt.so)


import dev.krypton.jnt3.Loader;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.function.Consumer;
import net.minecraft.Entity;
import net.minecraft.class_1299;
import net.minecraft.class_638;

public class mg extends np {
  // [JNT] MethodHandle dispatch table (removed)
  public mg() {
    int var10001 = (575262360 & 1663345071 | 0) & -1801094857;

    StringBuilder var10002;
    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < (1920608975 & 1341756018 ^ 1115161163);
      var10001 += (-644550252 + (656671463 >> 213411478) | 1) & 539102657
    ) {
      char var6 = /* jnt */;
      char var9 = (char)(
        (
            (((((var6 & '︀') >> 9 | var6 << 7) - 36 & 65535) >> 0 | ((var6 & '︀') >> 9 | var6 << 7) - 36 << 16) & 65408) >> 7
              | ((((var6 & '︀') >> 9 | var6 << 7) - 36 & 65535) >> 0 | ((var6 & '︀') >> 9 | var6 << 7) - 36 << 16) << 9
          )
          ^ 218
      );
      /* jnt */(
          (
              (((((var6 & '︀') >> 9 | var6 << 7) - 36 & 65535) >> 0 | ((var6 & '︀') >> 9 | var6 << 7) - 36 << 16) & 65408) >> 7
                | ((((var6 & '︀') >> 9 | var6 << 7) - 36 & 65535) >> 0 | ((var6 & '︀') >> 9 | var6 << 7) - 36 << 16) << 9
            )
            ^ 218
        )
      );
    }

    String var2 = /* jnt */;
    int var4 = 1738509906 ^ 238394626 ^ 1772753744;

    StringBuilder var11;
    for (var11 = (StringBuilder)/* jnt */;
      var4 < ((-627151419 - 650699770 | 32) & 67261997);
      var4 += (-1409232768 >> 1856188807 | 1) & 8823317
    ) {
      int var16 = /* jnt */ - 198 + 241;
      char var17 = (char)(((var16 & 61440) >> 12 | var16 << 4) + 206 + 91);
      /* jnt */(((var16 & 61440) >> 12 | var16 << 4) + 206 + 91)
      );
    }

    super(
      var2,
      /* jnt */,
      -1,
      null /* jnt:encrypted */
    );
    /* jnt */;
  }

  @Override
    // [JNT_NATIVE] void dz() - implementation encrypted in native .so library
  public native void dz();

  @Override
  public void x() {
    /* jnt */;
  }

  @yet
  public void axm(yf var1) {
    if (/* jnt */
      )
    )) {
      /* jnt */;
    }
  }

  public void ohx() {
    class_638 var1 = null /* jnt:encrypted */
    );
    if (var1 != null) {
      ArrayList var2 = (ArrayList)/* jnt */;
      /* jnt */,
        (Consumer<class_1297>)var2x -> {
          if (var2x != null
            && /* jnt */
            )) {
            /* jnt */;
          }
        }
      );
      /* jnt */var0 -> {
          if (!/* jnt */) {
            /* jnt */
            );
          }
        }
      );
    }
  }

  public boolean smb(class_1299 var1) {
    int var2 = -863507093;
    if (var1 == null
      || !/* jnt */
        )
        && !/* jnt */
        )) {
      var2 = 1792269916 ^ -1586700785 ^ 1328800074;
    } else {
      var2 = (-1215945143 + -1215945143 | 169083653) & -1695273179;
    }
    return switch (var2 - 1856970065 - 829993350 - 517896543 + 105616224 ^ 1313272383 ^ 1312934345) {
      default -> false;
      case 1365139929 -> true;
    };
  }

  static {
    Loader.init(mg.class);
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (var10 ^ 1068196192 ^ 80132547) - 1244671977 + 83331106 + 593857468 - 691857417 - 1391033003 - 309401982 ^ 1015684390;
    MethodHandle var10000 = rhn[(var10 ^ 1068196192 ^ 80132547) - 1244671977 + 83331106 + 593857468 - 691857417 - 1391033003 - 309401982
      ^ 1015684390
      ^ 1879712748];
    if (rhn[var10001 ^ 1879712748] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = -703537732 + -1703507065 ^ 1887922499; var23 < var13.length(); var23 += -1799099012 ^ 740875846 ^ -1192545477) {
        int var42 = var13.charAt(var23);
        int var10004 = (var42 & 61440) >> 12;
        int var43 = ((var42 & 61440) >> 12 | var42 << 4) + 92 - 146;
        int var81 = (((var42 & 61440) >> 12 | var42 << 4) + 92 - 146 & 61440) >> 12;
        var42 = ((var10004 | var42 << 4) + 92 - 146 & 61440) >> 12 | ((var42 & 61440) >> 12 | var42 << 4) + 92 - 146 << 4;
        var10004 = ((var81 | var43 << 4) & 65532) >> 2;
        int var45 = (((var81 | var43 << 4) & 65532) >> 2 | var42 << 14) - 215 - 234;
        int var83 = ((((var81 | var43 << 4) & 65532) >> 2 | var42 << 14) - 215 - 234 & 65408) >> 7;
        char var46 = (char)(
          (((var10004 | var42 << 14) - 215 - 234 & 65408) >> 7 | (((var81 | var43 << 4) & 65532) >> 2 | var42 << 14) - 215 - 234 << 9) - 122 + 39
        );
        var13.setCharAt(var23, (char)((var83 | var45 << 9) - 122 + 39));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = -1812988736 + 1474010681 ^ -338978055; var29 < var16.length(); var29 += (146059856 * 146059856 | 1) & 4719735) {
        int var51 = (var16.charAt(var29) ^ '8') + 87 - 108 + 48 + 141 + 45;
        int var84 = (var51 & 57344) >> 13;
        int var52 = ((var51 & 57344) >> 13 | var51 << 3) - 221;
        int var85 = (((var51 & 57344) >> 13 | var51 << 3) - 221 & 65520) >> 4;
        char var53 = (char)((((var84 | var51 << 3) - 221 & 65520) >> 4 | ((var51 & 57344) >> 13 | var51 << 3) - 221 << 12) - 104);
        var16.setCharAt(var29, (char)((var85 | var52 << 12) - 104));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), mg.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = -500773868 ^ -1814114686 ^ 1912078998; var35 < var19.length(); var35 += (-642916804 << 295800949 | 1) & 542475725) {
        int var58 = var19.charAt(var35) - 203;
        int var86 = (var58 & 65534) >> 1;
        int var59 = (var58 & 65534) >> 1 | var58 << 15;
        int var87 = (((var58 & 65534) >> 1 | var58 << 15) & 65472) >> 6;
        var58 = (((var86 | var58 << 15) & 65472) >> 6 | ((var58 & 65534) >> 1 | var58 << 15) << 10) - 254 ^ 84;
        var86 = (((var87 | var59 << 10) - 254 ^ 84) & 65532) >> 2;
        int var61 = (((((var87 | var59 << 10) - 254 ^ 84) & 65532) >> 2 | var58 << 14) ^ 5) - 223 ^ 109;
        int var89 = (((((((var87 | var59 << 10) - 254 ^ 84) & 65532) >> 2 | var58 << 14) ^ 5) - 223 ^ 109) & 65528) >> 3;
        char var62 = (char)(
          ((((var86 | var58 << 14) ^ 5) - 223 ^ 109) & 65528) >> 3
            | ((((((var87 | var59 << 10) - 254 ^ 84) & 65532) >> 2 | var58 << 14) ^ 5) - 223 ^ 109) << 13
        );
        var19.setCharAt(var35, (char)(var89 | var61 << 13));
      }

      Class var7 = Class.forName(var19.toString(), false, mg.class.getClassLoader());
      switch ((var4 ^ 770992737) + 1529052799 + 245735809 - 1101876556 - 1316483796 - 997943103 - 736946918 - 1263805624 - 2125842264 - 2137561811) {
        case 215500765:
        case 1317283218:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 225256113:
          var10000 = var0.findSpecial(var7, var5, var6, mg.class);
          break;
        case 612337492:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 1173444523:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    rhn[(var10 ^ 1068196192 ^ 80132547) - 1244671977 + 83331106 + 593857468 - 691857417 - 1391033003 - 309401982 ^ 1015684390 ^ 1879712748] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 + 1291075770 + 2122603272 ^ 1911171055) - 83616658 + 876860851 - 1689328722 ^ 1136241202 ^ 1872211121) - 1725138556;
    MethodHandle var10000 = rhn[((var10 + 1291075770 + 2122603272 ^ 1911171055) - 83616658 + 876860851 - 1689328722 ^ 1136241202 ^ 1872211121)
      - 1725138556
      - 178047304];
    if (rhn[var10001 - 178047304] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (2136218633 + (-387207381 - 286076535) | 0) & 679739458; var24 < var14.length(); var24 += -732395695 & 185781604 ^ 1082689) {
        int var43 = var14.charAt(var24);
        int var10004 = (var43 & 63488) >> 11;
        int var44 = ((var43 & 63488) >> 11 | var43 << 5) + 177;
        int var86 = (((var43 & 63488) >> 11 | var43 << 5) + 177 & 63488) >> 11;
        var43 = ((var10004 | var43 << 5) + 177 & 63488) >> 11 | ((var43 & 63488) >> 11 | var43 << 5) + 177 << 5;
        var10004 = ((var86 | var44 << 5) & 61440) >> 12;
        int var46 = ((var86 | var44 << 5) & 61440) >> 12 | var43 << 4;
        int var88 = ((((var86 | var44 << 5) & 61440) >> 12 | var43 << 4) & 0) >> 16;
        var43 = (((var10004 | var43 << 4) & 0) >> 16 | (((var86 | var44 << 5) & 61440) >> 12 | var43 << 4) << 0) + 252;
        var10004 = ((var88 | var46 << 0) + 252 & 65408) >> 7;
        int var48 = (((var88 | var46 << 0) + 252 & 65408) >> 7 | var43 << 9) - 13;
        int var90 = ((((var88 | var46 << 0) + 252 & 65408) >> 7 | var43 << 9) - 13 & 61440) >> 12;
        char var49 = (char)((((var10004 | var43 << 9) - 13 & 61440) >> 12 | (((var88 | var46 << 0) + 252 & 65408) >> 7 | var43 << 9) - 13 << 4) ^ 197);
        var14.setCharAt(var24, (char)((var90 | var48 << 4) ^ 197));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (-1198518026 & -1167048699 | 0) & 50386001; var30 < var17.length(); var30 += (1814857131 + (1814857131 & -1738786320) | 1) & 12865697) {
        int var54 = (var17.charAt(var30) ^ 19 ^ 231) + 22 - 24 + 95 + 183;
        int var91 = (var54 & 32768) >> 15;
        int var55 = ((var54 & 32768) >> 15 | var54 << 1) + 247;
        int var92 = (((var54 & 32768) >> 15 | var54 << 1) + 247 & 63488) >> 11;
        char var56 = (char)((((var91 | var54 << 1) + 247 & 63488) >> 11 | ((var54 & 32768) >> 15 | var54 << 1) + 247 << 5) + 250);
        var17.setCharAt(var30, (char)((var92 | var55 << 5) + 250));
      }

      Class var6 = Class.forName(var17.toString(), false, mg.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (-2083240616 >> 1693049508 | 0) & 39040; var36 < var20.length(); var36 += (-1734271840 << (880621274 >>> 1908762932) | 1) & 23077769) {
        int var61 = (var20.charAt(var36) ^ 253) + 157;
        int var93 = (var61 & 0) >> 16;
        int var62 = (var61 & 0) >> 16 | var61 << 0;
        int var94 = (((var61 & 0) >> 16 | var61 << 0) & 49152) >> 14;
        var61 = ((var93 | var61 << 0) & 49152) >> 14 | ((var61 & 0) >> 16 | var61 << 0) << 2;
        var93 = ((var94 | var62 << 2) & 64512) >> 10;
        int var64 = (((var94 | var62 << 2) & 64512) >> 10 | var61 << 6) + 29 - 56;
        int var96 = ((((var94 | var62 << 2) & 64512) >> 10 | var61 << 6) + 29 - 56 & 65520) >> 4;
        char var65 = (char)((((var93 | var61 << 6) + 29 - 56 & 65520) >> 4 | (((var94 | var62 << 2) & 64512) >> 10 | var61 << 6) + 29 - 56 << 12) - 196 + 3);
        var20.setCharAt(var36, (char)((var96 | var64 << 12) - 196 + 3));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), mg.class.getClassLoader()).returnType();
      switch ((((var4 - 285134400 ^ 332562341 ^ 822311832 ^ 899387830) + 1589190279 ^ 1388292770) + 1333388946 ^ 1518960010 ^ 219666918) + 370262263) {
        case 550026582:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1354914753:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1769446348:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1933522019:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      rhn[((var10 + 1291075770 + 2122603272 ^ 1911171055) - 83616658 + 876860851 - 1689328722 ^ 1136241202 ^ 1872211121) - 1725138556 - 178047304] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }

  public static native void guard();
}
