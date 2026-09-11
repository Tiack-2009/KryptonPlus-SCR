// KryptonPlus Core: RenderModule
// Original class: vwz
// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.class_11908;
import net.minecraft.Identifier;
import net.minecraft.MinecraftClient;
import net.minecraft.DrawContext;

public abstract class vwz {
  public class_310 gk = /* jnt */;
  public fs nik;
  public wus bge;
  public int xif;
  public zn pb;
  public boolean di;
  public int jc;
  public int jlq;
  public int kan;
  public int fg;
  // [JNT] MethodHandle dispatch table (removed)
  public vwz(fs var1, wus var2, int var3) {
    this.nik = var1;
    this.bge = var2;
    this.xif = var3;
    this.jc = /* jnt */;
    this.jlq = /* jnt */ + /* jnt */ + var3;
    this.kan = /* jnt */ + /* jnt */;
    this.fg = /* jnt */
      + /* jnt */
      + var3
      + /* jnt */;
  }

  public int zcq() {
    return /* jnt */)
    );
  }

  public int yf() {
    return /* jnt */)
    );
  }

  public int md() {
    return /* jnt */)
    );
  }

  public int lwk() {
    return /* jnt */)
    );
  }

  public int eh() {
    return null /* jnt:encrypted */);
  }

  public void h(class_332 var1, int var2, int var3, float var4) {
    /* jnt */var2, (double)var3);
    /* jnt */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted */
    );
    null /* jnt:encrypted */;
    null /* jnt:encrypted */
        + /* jnt */
    );
    /* jnt */,
      null /* jnt:encrypted */,
      null /* jnt:encrypted */,
      null /* jnt:encrypted */,
      /* jnt */)
    );
  }

  public void gfg(double var1, double var3) {
    null /* jnt:encrypted */;
  }

  public void ykg(int var1, int var2) {
    if (/* jnt */var1, (double)var2)
      && !null /* jnt:encrypted */)
      )) {
      /* jnt */null /* jnt:encrypted */null /* jnt:encrypted */
        ),
        /* jnt */
        ),
        var1 + 20,
        var2 + 20
      );
    }
  }

  public void fr() {
    null /* jnt:encrypted */;
  }

  public void z(class_11908 var1) {
  }

  public boolean xfw(double var1, double var3) {
    return var1 > (double)/* jnt */
      && var1 < (double)(/* jnt */ + /* jnt */)
      && var3
        > (double)(
          null /* jnt:encrypted */
            + /* jnt */
            + /* jnt */
        )
      && var3
        < (double)(
          null /* jnt:encrypted */
            + /* jnt */
            + /* jnt */
            + /* jnt */
        );
  }
  public void po() {
    int var2 = -1549108322;
    if (null /* jnt:encrypted */ == null) {
      null /* jnt:encrypted *//* jnt */);
      var2 = (-1703993215 | -956125201) ^ 737183904;
    } else {
      var2 = (-75588432 << -225943066 | -1530306450) & -1528208529;
    }

    while (true) {
      switch (var2 + 1584678582 - 1539144755 - 705501684 - 1477406156 + 707572826 - 252434921) {
        case -1873132413:
        default:
          byte var1 = 120;
          if (/* jnt */) != var1) {
            null /* jnt:encrypted */
            );
          }

          return;
        case 1084521890:
          null /* jnt:encrypted *//* jnt */)
            )
          );
      }

      var2 = (-1703993215 | -956125201) ^ 737183904;
    }
  }

  public void iu(class_11909 var1, boolean var2) {
  }

  public void zi(class_11909 var1) {
  }

  public void vk(class_11909 var1, double var2, double var4) {
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 + 1686567534 ^ 1021422456) - 1016040832 - 601037735 ^ 1058991165 ^ 257221852 ^ 1405283441 ^ 958654344) - 96167067;
    MethodHandle var10000 = zui[((var10 + 1686567534 ^ 1021422456) - 1016040832 - 601037735 ^ 1058991165 ^ 257221852 ^ 1405283441 ^ 958654344)
      - 96167067
      + 2112147907];
    if (zui[var10001 + 2112147907] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (-993920067 ^ 1875288040 | 0) & 4229666; var23 < var13.length(); var23 += -863490589 >> 1933431973 ^ -26984082) {
        int var42 = var13.charAt(var23) ^ 182;
        int var10004 = (var42 & 0) >> 16;
        int var43 = (((var42 & 0) >> 16 | var42 << 0) - 44 ^ 136) + 188 - 96 ^ 9;
        int var79 = (((((var42 & 0) >> 16 | var42 << 0) - 44 ^ 136) + 188 - 96 ^ 9) & 65528) >> 3;
        char var44 = (char)(
          (((((var10004 | var42 << 0) - 44 ^ 136) + 188 - 96 ^ 9) & 65528) >> 3 | ((((var42 & 0) >> 16 | var42 << 0) - 44 ^ 136) + 188 - 96 ^ 9) << 13) - 24
            ^ 130
        );
        var13.setCharAt(var23, (char)((var79 | var43 << 13) - 24 ^ 130));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (555146578 | 555146578) ^ 555146578; var29 < var16.length(); var29 += (-1393833937 << (1154802345 & 1531006626) | 1) & 319817665) {
        int var49 = var16.charAt(var29) + '0' + 164;
        char var52 = (char)(
          (
              (
                    (((((var49 & 63488) >> 11 | var49 << 5) ^ 234) + 151 & 64512) >> 10 | (((var49 & 63488) >> 11 | var49 << 5) ^ 234) + 151 << 6) + 167 - 154
                      & 65504
                  )
                  >> 5
                | (((((var49 & 63488) >> 11 | var49 << 5) ^ 234) + 151 & 64512) >> 10 | (((var49 & 63488) >> 11 | var49 << 5) ^ 234) + 151 << 6) + 167 - 154
                  << 11
            )
            - 159
        );
        var16.setCharAt(
          var29,
          (char)(
            (
                (
                      (((((var49 & 63488) >> 11 | var49 << 5) ^ 234) + 151 & 64512) >> 10 | (((var49 & 63488) >> 11 | var49 << 5) ^ 234) + 151 << 6)
                          + 167
                          - 154
                        & 65504
                    )
                    >> 5
                  | (((((var49 & 63488) >> 11 | var49 << 5) ^ 234) + 151 & 64512) >> 10 | (((var49 & 63488) >> 11 | var49 << 5) ^ 234) + 151 << 6) + 167 - 154
                    << 11
              )
              - 159
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), vwz.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = 178818900 >>> 700422261 ^ 85; var35 < var19.length(); var35 += -1661019477 & 1721293856 ^ 77125665) {
        int var57 = (var19.charAt(var35) ^ 'd') + 42;
        int var83 = (var57 & 64512) >> 10;
        int var58 = (var57 & 64512) >> 10 | var57 << 6;
        int var84 = (((var57 & 64512) >> 10 | var57 << 6) & 65520) >> 4;
        var57 = (((var83 | var57 << 6) & 65520) >> 4 | ((var57 & 64512) >> 10 | var57 << 6) << 12) - 166;
        var83 = ((var84 | var58 << 12) - 166 & 65528) >> 3;
        int var60 = (((var84 | var58 << 12) - 166 & 65528) >> 3 | var57 << 13) - 39 + 173 - 210;
        int var86 = ((((var84 | var58 << 12) - 166 & 65528) >> 3 | var57 << 13) - 39 + 173 - 210 & 65504) >> 5;
        char var61 = (char)(
          ((var83 | var57 << 13) - 39 + 173 - 210 & 65504) >> 5 | (((var84 | var58 << 12) - 166 & 65528) >> 3 | var57 << 13) - 39 + 173 - 210 << 11
        );
        var19.setCharAt(var35, (char)(var86 | var60 << 11));
      }

      Class var7 = Class.forName(var19.toString(), false, vwz.class.getClassLoader());
      switch ((var4 - 368371453 - 1103461273 - 1451789046 + 29718321 ^ 1436522411 ^ 1927339714 ^ 1253412240 ^ 1323644988) - 147711962 - 372420483) {
        case 8953630:
          var10000 = var0.findSpecial(var7, var5, var6, vwz.class);
          break;
        case 54312027:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 332361939:
        case 832902168:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1269003223:
          var10000 = var0.findConstructor(var7, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    zui[((var10 + 1686567534 ^ 1021422456) - 1016040832 - 601037735 ^ 1058991165 ^ 257221852 ^ 1405283441 ^ 958654344) - 96167067 + 2112147907] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (var10 ^ 1705493076 ^ 286354816) + 1132241161 + 541977747 - 1585721142 + 523913499 - 1677273559 + 930013358 + 1956380891;
    MethodHandle var10000 = zui[(var10 ^ 1705493076 ^ 286354816)
      + 1132241161
      + 541977747
      - 1585721142
      + 523913499
      - 1677273559
      + 930013358
      + 1956380891
      + 506790844];
    if (zui[var10001 + 506790844] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = 143455979 & -1743088005 ^ 134780523; var24 < var14.length(); var24 += (1688077773 & 1688077773 >> 1688077773 | 1) & 775197205) {
        int var43 = var14.charAt(var24) - 177;
        int var10004 = (var43 & 57344) >> 13;
        int var44 = (var43 & 57344) >> 13 | var43 << 3;
        int var84 = (((var43 & 57344) >> 13 | var43 << 3) & 65472) >> 6;
        var43 = ((((var10004 | var43 << 3) & 65472) >> 6 | ((var43 & 57344) >> 13 | var43 << 3) << 10) ^ 73) - 141;
        var10004 = (((var84 | var44 << 10) ^ 73) - 141 & 65534) >> 1;
        int var46 = (((((var84 | var44 << 10) ^ 73) - 141 & 65534) >> 1 | var43 << 15) + 155 ^ 153) + 184;
        int var86 = ((((((var84 | var44 << 10) ^ 73) - 141 & 65534) >> 1 | var43 << 15) + 155 ^ 153) + 184 & 65408) >> 7;
        char var47 = (char)(
          (((var10004 | var43 << 15) + 155 ^ 153) + 184 & 65408) >> 7
            | (((((var84 | var44 << 10) ^ 73) - 141 & 65534) >> 1 | var43 << 15) + 155 ^ 153) + 184 << 9
        );
        var14.setCharAt(var24, (char)(var86 | var46 << 9));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (-1183829142 & -521612065 | 0) & 361161504; var30 < var17.length(); var30 += (1913565942 & 1913565942 | 1) & 5309697) {
        int var52 = (var17.charAt(var30) ^ 162 ^ 189) - 223;
        int var87 = (var52 & 65472) >> 6;
        int var53 = ((var52 & 65472) >> 6 | var52 << 10) - 48;
        int var88 = (((var52 & 65472) >> 6 | var52 << 10) - 48 & 65528) >> 3;
        var52 = ((var87 | var52 << 10) - 48 & 65528) >> 3 | ((var52 & 65472) >> 6 | var52 << 10) - 48 << 13;
        var87 = ((var88 | var53 << 13) & 49152) >> 14;
        int var55 = ((((var88 | var53 << 13) & 49152) >> 14 | var52 << 2) ^ 15) + 19;
        int var90 = (((((var88 | var53 << 13) & 49152) >> 14 | var52 << 2) ^ 15) + 19 & 65532) >> 2;
        char var56 = (char)((((var87 | var52 << 2) ^ 15) + 19 & 65532) >> 2 | ((((var88 | var53 << 13) & 49152) >> 14 | var52 << 2) ^ 15) + 19 << 14);
        var17.setCharAt(var30, (char)(var90 | var55 << 14));
      }

      Class var6 = Class.forName(var17.toString(), false, vwz.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (-1399261813 + 852546324 | 0) & 1181536; var36 < var20.length(); var36 += (1678012502 | 1668441001 | 1) & 269060097) {
        int var61 = var20.charAt(var36) ^ 253 ^ 64;
        char var64 = (char)(
          ((((((var61 & 49152) >> 14 | var61 << 2) & 65472) >> 6 | ((var61 & 49152) >> 14 | var61 << 2) << 10) ^ 136) - 143 + 236 - 189 + 132 & 65408) >> 7
            | (((((var61 & 49152) >> 14 | var61 << 2) & 65472) >> 6 | ((var61 & 49152) >> 14 | var61 << 2) << 10) ^ 136) - 143 + 236 - 189 + 132 << 9
        );
        var20.setCharAt(
          var36,
          (char)(
            ((((((var61 & 49152) >> 14 | var61 << 2) & 65472) >> 6 | ((var61 & 49152) >> 14 | var61 << 2) << 10) ^ 136) - 143 + 236 - 189 + 132 & 65408) >> 7
              | (((((var61 & 49152) >> 14 | var61 << 2) & 65472) >> 6 | ((var61 & 49152) >> 14 | var61 << 2) << 10) ^ 136) - 143 + 236 - 189 + 132 << 9
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), vwz.class.getClassLoader()).returnType();
      switch ((((var4 ^ 1249251924) + 528497661 - 978009549 - 176904700 ^ 1250568126 ^ 957145407) + 1463877471 ^ 1420406723) - 663054807 ^ 72245255) {
        case 712456564:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1203744944:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1716161963:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1889947857:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      zui[(var10 ^ 1705493076 ^ 286354816) + 1132241161 + 541977747 - 1585721142 + 523913499 - 1677273559 + 930013358 + 1956380891 + 506790844] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
