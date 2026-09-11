// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import dev.krypton.utils.render.Color.Color;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.BlockState;

public record jzj(
  String name,
  Color color,
  class_2248 block,
  String name,
  Color color,
  class_2248 block,
  String name,
  Color color,
  class_2248 block,
  String name,
  Color color,
  class_2248 block,
  String name,
  zn color,
  class_2248 block,
  String name,
  zn color,
  class_2248 block,
  String name,
  zn color,
  class_2248 block,
  String name,
  zn color,
  class_2248 block,
  String name,
  Color color,
  class_2248 block,
  String name,
  Color color,
  class_2248 block,
  String name,
  Color color,
  class_2248 block,
  String name,
  Color color,
  class_2248 block,
  String name,
  zn color,
  class_2248 block,
  String name,
  zn color,
  class_2248 block,
  String name,
  zn color,
  class_2248 block,
  String name,
  zn color,
  class_2248 block
) {
  public String ue;
  public zn fks;
  public class_2248 zyc;
  // [JNT] MethodHandle dispatch table (removed)
  public jzj(String var1, zn var2, class_2248 var3) {
    this.ue = var1;
    this.fks = var2;
    this.zyc = var3;
  }

  @Override
  public String toString() {
    return null /* jnt:encrypted */;
  }

  @Override
  public boolean equals(Object var1) {
    return !(var1 instanceof jzj)
      ? false
      : /* jnt */var1),
        null /* jnt:encrypted */
      );
  }

  @Override
  public int hashCode() {
    return /* jnt */
    );
  }

  public String az() {
    return null /* jnt:encrypted */;
  }

  public zn xo() {
    return null /* jnt:encrypted */;
  }

  public class_2248 ptf() {
    return null /* jnt:encrypted */;
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (var10 - 414812085 - 1884021606 - 1332470895 - 814385887 + 1954739282 + 514033669 - 1164822712 ^ 2110562834) - 202454450;
    MethodHandle var10000 = fbu[(var10 - 414812085 - 1884021606 - 1332470895 - 814385887 + 1954739282 + 514033669 - 1164822712 ^ 2110562834) - 202454450
      ^ 1411940389];
    if (fbu[var10001 ^ 1411940389] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = -2058590734 + 1349744496 ^ -708846238; var23 < var13.length(); var23 += (1748075763 | -1428817496 | 0) & 655877) {
        int var42 = var13.charAt(var23) + 250 + 131;
        int var10004 = (var42 & 65024) >> 9;
        int var43 = ((var42 & 65024) >> 9 | var42 << 7) - 22 + 229;
        int var79 = (((var42 & 65024) >> 9 | var42 << 7) - 22 + 229 & 0) >> 16;
        char var44 = (char)((((((var10004 | var42 << 7) - 22 + 229 & 0) >> 16 | ((var42 & 65024) >> 9 | var42 << 7) - 22 + 229 << 0) ^ 164) + 90 ^ 16) + 105);
        var13.setCharAt(var23, (char)((((var79 | var43 << 0) ^ 164) + 90 ^ 16) + 105));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = -1454893928 ^ 1498660004 ^ -266622916; var29 < var16.length(); var29 += -401694763 << 1640760300 ^ -369274879) {
        int var49 = var16.charAt(var29) + 151;
        char var52 = (char)(
          (
                (
                    (((((var49 & 65504) >> 5 | var49 << 11) + 210 ^ 3) & 61440) >> 12 | (((var49 & 65504) >> 5 | var49 << 11) + 210 ^ 3) << 4) - 18 - 48
                      ^ 166
                      ^ 172
                  )
                  & 65535
              )
              >> 0
            | ((((((var49 & 65504) >> 5 | var49 << 11) + 210 ^ 3) & 61440) >> 12 | (((var49 & 65504) >> 5 | var49 << 11) + 210 ^ 3) << 4) - 18 - 48 ^ 166 ^ 172)
              << 16
        );
        var16.setCharAt(
          var29,
          (char)(
            (
                  (
                      (((((var49 & 65504) >> 5 | var49 << 11) + 210 ^ 3) & 61440) >> 12 | (((var49 & 65504) >> 5 | var49 << 11) + 210 ^ 3) << 4) - 18 - 48
                        ^ 166
                        ^ 172
                    )
                    & 65535
                )
                >> 0
              | (
                  (((((var49 & 65504) >> 5 | var49 << 11) + 210 ^ 3) & 61440) >> 12 | (((var49 & 65504) >> 5 | var49 << 11) + 210 ^ 3) << 4) - 18 - 48
                    ^ 166
                    ^ 172
                )
                << 16
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), jzj.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = 1265248488 ^ 1265248488 ^ 0; var35 < var19.length(); var35 += -719337609 & 906252004 ^ 335824485) {
        int var57 = var19.charAt(var35);
        int var83 = (var57 & 57344) >> 13;
        int var58 = ((var57 & 57344) >> 13 | var57 << 3) - 122;
        int var84 = (((var57 & 57344) >> 13 | var57 << 3) - 122 & 65535) >> 0;
        var57 = ((var83 | var57 << 3) - 122 & 65535) >> 0 | ((var57 & 57344) >> 13 | var57 << 3) - 122 << 16;
        var83 = ((var84 | var58 << 16) & 65535) >> 0;
        int var60 = (((var84 | var58 << 16) & 65535) >> 0 | var57 << 16) + 228 + 218 + 116 ^ 82;
        int var86 = (((((var84 | var58 << 16) & 65535) >> 0 | var57 << 16) + 228 + 218 + 116 ^ 82) & 65535) >> 0;
        char var61 = (char)(
          ((((var83 | var57 << 16) + 228 + 218 + 116 ^ 82) & 65535) >> 0 | ((((var84 | var58 << 16) & 65535) >> 0 | var57 << 16) + 228 + 218 + 116 ^ 82) << 16)
            + 72
        );
        var19.setCharAt(var35, (char)((var86 | var60 << 16) + 72));
      }

      Class var7 = Class.forName(var19.toString(), false, jzj.class.getClassLoader());
      switch ((((var4 ^ 1729983931 ^ 1100199193) + 2051160881 ^ 848309183) - 304918078 + 2054879870 ^ 1993111779) + 7034519 - 2143622977 ^ 718413892) {
        case 222686104:
        case 1181138832:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 658584641:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 844932484:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 1989333539:
          var10000 = var0.findSpecial(var7, var5, var6, jzj.class);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    fbu[(var10 - 414812085 - 1884021606 - 1332470895 - 814385887 + 1954739282 + 514033669 - 1164822712 ^ 2110562834) - 202454450 ^ 1411940389] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (var10 + 1029418599 + 878873085 ^ 971238958 ^ 248367450 ^ 1011587421) - 153679198 + 599133011 + 1894419249 ^ 45913831;
    MethodHandle var10000 = fbu[((var10 + 1029418599 + 878873085 ^ 971238958 ^ 248367450 ^ 1011587421) - 153679198 + 599133011 + 1894419249 ^ 45913831)
      + 1281009574];
    if (fbu[var10001 + 1281009574] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (1539271985 & -533880209 | 0) & -1342140540; var24 < var14.length(); var24 += 2027595386 >>> 1905666334 ^ 0) {
        char var43 = var14.charAt(var24);
        char var46 = (char)(
          (
                (
                    ((((((var43 & '\ufffe') >> 1 | var43 << 15) & 32768) >> 15 | ((var43 & '\ufffe') >> 1 | var43 << 15) << 1) ^ 136) & 65024) >> 9
                      | (((((var43 & '\ufffe') >> 1 | var43 << 15) & 32768) >> 15 | ((var43 & '\ufffe') >> 1 | var43 << 15) << 1) ^ 136) << 7
                  )
                  ^ 221
                  ^ 152
              )
              - 154
              - 215
              + 185
            ^ 108
        );
        var14.setCharAt(
          var24,
          (char)(
            (
                  (
                      ((((((var43 & '\ufffe') >> 1 | var43 << 15) & 32768) >> 15 | ((var43 & '\ufffe') >> 1 | var43 << 15) << 1) ^ 136) & 65024) >> 9
                        | (((((var43 & '\ufffe') >> 1 | var43 << 15) & 32768) >> 15 | ((var43 & '\ufffe') >> 1 | var43 << 15) << 1) ^ 136) << 7
                    )
                    ^ 221
                    ^ 152
                )
                - 154
                - 215
                + 185
              ^ 108
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (315074608 | 598335162 | 0) & 67109185;
        var30 < var17.length();
        var30 += -1297262851 + (1658379066 >>> (-1297262851 << 1658379066)) ^ 361116214
      ) {
        int var51 = (var17.charAt(var30) - '"' ^ 40) + 184 + 234;
        char var54 = (char)(
          (
              (((((var51 & 49152) >> 14 | var51 << 2) + 42 + 2 & 65472) >> 6 | ((var51 & 49152) >> 14 | var51 << 2) + 42 + 2 << 10) & 65024) >> 9
                | ((((var51 & 49152) >> 14 | var51 << 2) + 42 + 2 & 65472) >> 6 | ((var51 & 49152) >> 14 | var51 << 2) + 42 + 2 << 10) << 7
            )
            - 34
        );
        var17.setCharAt(
          var30,
          (char)(
            (
                (((((var51 & 49152) >> 14 | var51 << 2) + 42 + 2 & 65472) >> 6 | ((var51 & 49152) >> 14 | var51 << 2) + 42 + 2 << 10) & 65024) >> 9
                  | ((((var51 & 49152) >> 14 | var51 << 2) + 42 + 2 & 65472) >> 6 | ((var51 & 49152) >> 14 | var51 << 2) + 42 + 2 << 10) << 7
              )
              - 34
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, jzj.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (1781625159 - 1781625159 | 0) & -916949286; var36 < var20.length(); var36 += -1830856309 >>> 2001449775 ^ 75199) {
        int var59 = (var20.charAt(var36) + 137 + 50 ^ 63 ^ 171) + 199 + 67;
        int var83 = (var59 & 65504) >> 5;
        int var60 = ((var59 & 65504) >> 5 | var59 << 11) + 228 ^ 58;
        int var84 = ((((var59 & 65504) >> 5 | var59 << 11) + 228 ^ 58) & 65408) >> 7;
        char var61 = (char)((((var83 | var59 << 11) + 228 ^ 58) & 65408) >> 7 | (((var59 & 65504) >> 5 | var59 << 11) + 228 ^ 58) << 9);
        var20.setCharAt(var36, (char)(var84 | var60 << 9));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), jzj.class.getClassLoader()).returnType();
      switch (((var4 ^ 880248452) + 919272915 + 1050720508 ^ 285705856) + 970669819 ^ 1185253602 ^ 2103965978 ^ 1315126602 ^ 1417380880 ^ 2071946155) {
        case 223539659:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1229005508:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1545020653:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1987676299:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      fbu[((var10 + 1029418599 + 878873085 ^ 971238958 ^ 248367450 ^ 1011587421) - 153679198 + 599133011 + 1894419249 ^ 45913831) + 1281009574] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
