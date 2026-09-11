// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.DrawContext;

public class fg {
  // [JNT] MethodHandle dispatch table (removed)
  public static void voj() {
    et var0 = /* jnt */;
    /* jnt */;
  }

  public static void ua() {
    et var0 = /* jnt */;
    /* jnt */;
  }

  public static void oc(String var0, class_332 var1, int var2, int var3, int var4) {
    et var5 = /* jnt */;
    /* jnt */var2, (double)var3, (zn)/* jnt */, false
    );
  }

  public static int ou(String var0) {
    et var1 = /* jnt */;
    return (int)/* jnt */;
  }

  public static void fc(String var0, class_332 var1, int var2, int var3, int var4) {
    int var5 = /* jnt */;
    /* jnt */;
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 ^ 133731211) - 1150892915 + 298747636 + 1763593297 ^ 1005914700 ^ 2007032842 ^ 1325891211) + 1512949161 - 1126742848;
    MethodHandle var10000 = epx[((var10 ^ 133731211) - 1150892915 + 298747636 + 1763593297 ^ 1005914700 ^ 2007032842 ^ 1325891211)
      + 1512949161
      - 1126742848
      + 486772329];
    if (epx[var10001 + 486772329] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (1825392632 + 1235251718 | 0) & 135267328; var23 < var13.length(); var23 += (-470539436 & -85818698 | 1) & 488501643) {
        char var42 = var13.charAt(var23);
        char var43 = (char)(((((var42 & 'ﰀ') >> 10 | var42 << 6) ^ 227 ^ 4 ^ 95) + 104 ^ 228) - 168 + 202 + 220 + 215);
        var13.setCharAt(var23, (char)(((((var42 & 'ﰀ') >> 10 | var42 << 6) ^ 227 ^ 4 ^ 95) + 104 ^ 228) - 168 + 202 + 220 + 215));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = 457988098 << 1501889183 ^ 0; var29 < var16.length(); var29 += 1569276807 >>> 1254227280 ^ 23944) {
        int var48 = var16.charAt(var29);
        int var79 = (var48 & 64512) >> 10;
        int var49 = (var48 & 64512) >> 10 | var48 << 6;
        int var80 = (((var48 & 64512) >> 10 | var48 << 6) & 65532) >> 2;
        var48 = ((var79 | var48 << 6) & 65532) >> 2 | ((var48 & 64512) >> 10 | var48 << 6) << 14;
        var79 = ((var80 | var49 << 14) & 65504) >> 5;
        int var51 = ((((var80 | var49 << 14) & 65504) >> 5 | var48 << 11) ^ 198) + 32 + 56 + 153;
        int var82 = (((((var80 | var49 << 14) & 65504) >> 5 | var48 << 11) ^ 198) + 32 + 56 + 153 & 65024) >> 9;
        char var52 = (char)(
          ((((var79 | var48 << 11) ^ 198) + 32 + 56 + 153 & 65024) >> 9 | ((((var80 | var49 << 14) & 65504) >> 5 | var48 << 11) ^ 198) + 32 + 56 + 153 << 7)
            - 106
            - 171
        );
        var16.setCharAt(var29, (char)((var82 | var51 << 7) - 106 - 171));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), fg.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (1661857601 & -1079571248 | 0) & 1489670274; var35 < var19.length(); var35 += (-809060073 - (-459317007 << -281614258) | 0) & 6291465) {
        int var57 = var19.charAt(var35) - 246;
        int var83 = (var57 & 65528) >> 3;
        int var58 = ((var57 & 65528) >> 3 | var57 << 13) - 204 ^ 166;
        int var84 = ((((var57 & 65528) >> 3 | var57 << 13) - 204 ^ 166) & 65532) >> 2;
        var57 = (((var83 | var57 << 13) - 204 ^ 166) & 65532) >> 2 | (((var57 & 65528) >> 3 | var57 << 13) - 204 ^ 166) << 14;
        var83 = ((var84 | var58 << 14) & 32768) >> 15;
        int var60 = (((var84 | var58 << 14) & 32768) >> 15 | var57 << 1) + 243;
        int var86 = ((((var84 | var58 << 14) & 32768) >> 15 | var57 << 1) + 243 & 65504) >> 5;
        char var61 = (char)((((var83 | var57 << 1) + 243 & 65504) >> 5 | (((var84 | var58 << 14) & 32768) >> 15 | var57 << 1) + 243 << 11) + 134 - 132);
        var19.setCharAt(var35, (char)((var86 | var60 << 11) + 134 - 132));
      }

      Class var7 = Class.forName(var19.toString(), false, fg.class.getClassLoader());
      switch ((var4 + 109793114 - 1223462760 + 1474316118 + 1241827217 - 1625295772 + 289179689 + 2009647733 - 256467473 ^ 50458101) - 1999671587) {
        case 195187662:
        case 932813060:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 315983725:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 442660342:
          var10000 = var0.findSpecial(var7, var5, var6, fg.class);
          break;
        case 1430342516:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    epx[((var10 ^ 133731211) - 1150892915 + 298747636 + 1763593297 ^ 1005914700 ^ 2007032842 ^ 1325891211) + 1512949161 - 1126742848 + 486772329] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }
}
