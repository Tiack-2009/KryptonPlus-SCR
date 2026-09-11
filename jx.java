// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import javazoom.jl.player.advanced.PlaybackEvent;
import javazoom.jl.player.advanced.PlaybackListener;

public class jx extends PlaybackListener {
  // [JNT] MethodHandle dispatch table (removed)
  public jx(jd var1) {
    this.hda = var1;
    super();
  }

  public void playbackFinished(PlaybackEvent var1) {
    if (/* jnt */)
      && /* jnt */ == Integer.MAX_VALUE) {
      /* jnt */);
    }
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (((var10 - 360697073 ^ 1820573862 ^ 1545074640) + 1241597581 ^ 984400630) - 2037359677 ^ 872521271 ^ 989968876) + 1236049540;
    MethodHandle var10000 = yqf[(((var10 - 360697073 ^ 1820573862 ^ 1545074640) + 1241597581 ^ 984400630) - 2037359677 ^ 872521271 ^ 989968876) + 1236049540
      ^ 1579953136];
    if (yqf[var10001 ^ 1579953136] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = 1451687380 + (-2073064856 >> 1451687380) ^ 1451685402;
        var23 < var13.length();
        var23 += (-1628065689 + (1547559904 & -1628065689 << 1547559904) | 1) & 79996425
      ) {
        int var42 = var13.charAt(var23) - 242;
        int var10004 = (var42 & 61440) >> 12;
        int var43 = ((var42 & 61440) >> 12 | var42 << 4) + 113 - 235 - 243 + 117 - 41 - 139 ^ 78;
        int var79 = ((((var42 & 61440) >> 12 | var42 << 4) + 113 - 235 - 243 + 117 - 41 - 139 ^ 78) & 49152) >> 14;
        char var44 = (char)(
          (((var10004 | var42 << 4) + 113 - 235 - 243 + 117 - 41 - 139 ^ 78) & 49152) >> 14
            | (((var42 & 61440) >> 12 | var42 << 4) + 113 - 235 - 243 + 117 - 41 - 139 ^ 78) << 2
        );
        var13.setCharAt(var23, (char)(var79 | var43 << 2));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = -108547520 >>> -108547520 ^ -108547520; var29 < var16.length(); var29 += (2104199480 >> -1020847076 | 1) & 772934193) {
        int var49 = var16.charAt(var29);
        int var80 = (var49 & 65520) >> 4;
        int var50 = (var49 & 65520) >> 4 | var49 << 12;
        int var81 = (((var49 & 65520) >> 4 | var49 << 12) & 64512) >> 10;
        var49 = ((var80 | var49 << 12) & 64512) >> 10 | ((var49 & 65520) >> 4 | var49 << 12) << 6;
        var80 = ((var81 | var50 << 6) & 65504) >> 5;
        int var52 = ((var81 | var50 << 6) & 65504) >> 5 | var49 << 11;
        int var83 = ((((var81 | var50 << 6) & 65504) >> 5 | var49 << 11) & 61440) >> 12;
        var49 = (((var80 | var49 << 11) & 61440) >> 12 | (((var81 | var50 << 6) & 65504) >> 5 | var49 << 11) << 4) ^ 143;
        var80 = (((var83 | var52 << 4) ^ 143) & 65520) >> 4;
        int var54 = ((((var83 | var52 << 4) ^ 143) & 65520) >> 4 | var49 << 12) ^ 67;
        int var85 = ((((((var83 | var52 << 4) ^ 143) & 65520) >> 4 | var49 << 12) ^ 67) & 64512) >> 10;
        char var55 = (char)(((((var80 | var49 << 12) ^ 67) & 64512) >> 10 | (((((var83 | var52 << 4) ^ 143) & 65520) >> 4 | var49 << 12) ^ 67) << 6) - 156 - 71);
        var16.setCharAt(var29, (char)((var85 | var54 << 6) - 156 - 71));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), jx.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = 253668308 >> 1302916665 ^ 7; var35 < var19.length(); var35 += -2134365422 >>> -1960014894 ^ 8243) {
        int var60 = (var19.charAt(var35) + '#' + 95 ^ 23) + 138;
        char var61 = (char)((((var60 & 65408) >> 7 | var60 << 9) + 155 ^ 135) + 164 + 46 - 207);
        var19.setCharAt(var35, (char)((((var60 & 65408) >> 7 | var60 << 9) + 155 ^ 135) + 164 + 46 - 207));
      }

      Class var7 = Class.forName(var19.toString(), false, jx.class.getClassLoader());
      switch ((((var4 ^ 1660743684 ^ 453837376) + 1223131937 ^ 1650721418) + 1226656303 - 1086147994 + 100441030 ^ 1786707348) - 323945126 + 625236061) {
        case 42160322:
          var10000 = var0.findSpecial(var7, var5, var6, jx.class);
          break;
        case 207419947:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 1243091104:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 1391588762:
        case 1589891923:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    yqf[(((var10 - 360697073 ^ 1820573862 ^ 1545074640) + 1241597581 ^ 984400630) - 2037359677 ^ 872521271 ^ 989968876) + 1236049540 ^ 1579953136] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (var10 + 1324695434 - 1762170856 + 1509311470 ^ 1117595260) + 535631390 - 1658007028 - 1591093114 + 1994689014 + 530304890;
    MethodHandle var10000 = yqf[(var10 + 1324695434 - 1762170856 + 1509311470 ^ 1117595260) + 535631390 - 1658007028 - 1591093114 + 1994689014 + 530304890
      ^ 932670812];
    if (yqf[var10001 ^ 932670812] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = 1508427349 >>> -1245546241 * (1508427349 ^ -1245546241) ^ 359;
        var24 < var14.length();
        var24 += (-132246454 + -1156324694 * -445520060 | 1) & 1141395465
      ) {
        int var43 = var14.charAt(var24);
        int var10004 = (var43 & 65534) >> 1;
        int var44 = ((var43 & 65534) >> 1 | var43 << 15) - 52;
        int var84 = (((var43 & 65534) >> 1 | var43 << 15) - 52 & 63488) >> 11;
        var43 = (((var10004 | var43 << 15) - 52 & 63488) >> 11 | ((var43 & 65534) >> 1 | var43 << 15) - 52 << 5) + 46 ^ 234 ^ 185;
        var10004 = (((var84 | var44 << 5) + 46 ^ 234 ^ 185) & 49152) >> 14;
        int var46 = (((var84 | var44 << 5) + 46 ^ 234 ^ 185) & 49152) >> 14 | var43 << 2;
        int var86 = (((((var84 | var44 << 5) + 46 ^ 234 ^ 185) & 49152) >> 14 | var43 << 2) & 65024) >> 9;
        char var47 = (char)((((var10004 | var43 << 2) & 65024) >> 9 | ((((var84 | var44 << 5) + 46 ^ 234 ^ 185) & 49152) >> 14 | var43 << 2) << 7) + 2 + 4);
        var14.setCharAt(var24, (char)((var86 | var46 << 7) + 2 + 4));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (-1611535083 >> -539199160 | 0) & 4194322;
        var30 < var17.length();
        var30 += (-2110976386 | -1501106687 << (-2110976386 >>> -1501106687) | 1) & 1565560961
      ) {
        int var52 = var17.charAt(var30) - 196 ^ 225;
        char var55 = (char)(
          (
                (((((var52 & 65024) >> 9 | var52 << 7) - 56 - 176 - 162 & 65532) >> 2 | ((var52 & 65024) >> 9 | var52 << 7) - 56 - 176 - 162 << 14) & 65528)
                    >> 3
                  | ((((var52 & 65024) >> 9 | var52 << 7) - 56 - 176 - 162 & 65532) >> 2 | ((var52 & 65024) >> 9 | var52 << 7) - 56 - 176 - 162 << 14) << 13
              )
              + 244
            ^ 194
        );
        var17.setCharAt(
          var30,
          (char)(
            (
                  (((((var52 & 65024) >> 9 | var52 << 7) - 56 - 176 - 162 & 65532) >> 2 | ((var52 & 65024) >> 9 | var52 << 7) - 56 - 176 - 162 << 14) & 65528)
                      >> 3
                    | ((((var52 & 65024) >> 9 | var52 << 7) - 56 - 176 - 162 & 65532) >> 2 | ((var52 & 65024) >> 9 | var52 << 7) - 56 - 176 - 162 << 14) << 13
                )
                + 244
              ^ 194
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, jx.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = 1995597468 ^ 169749967 ^ 2095860563; var36 < var20.length(); var36 += -612210582 >> -2055475563 ^ -291) {
        int var60 = var20.charAt(var36) + 'b';
        int var90 = (var60 & 64512) >> 10;
        int var61 = ((var60 & 64512) >> 10 | var60 << 6) + 154 - 114 - 249 ^ 118;
        int var91 = ((((var60 & 64512) >> 10 | var60 << 6) + 154 - 114 - 249 ^ 118) & 65520) >> 4;
        var60 = ((((var90 | var60 << 6) + 154 - 114 - 249 ^ 118) & 65520) >> 4 | (((var60 & 64512) >> 10 | var60 << 6) + 154 - 114 - 249 ^ 118) << 12) + 21;
        var90 = ((var91 | var61 << 12) + 21 & 64512) >> 10;
        int var63 = ((var91 | var61 << 12) + 21 & 64512) >> 10 | var60 << 6;
        int var93 = ((((var91 | var61 << 12) + 21 & 64512) >> 10 | var60 << 6) & 61440) >> 12;
        char var64 = (char)(((var90 | var60 << 6) & 61440) >> 12 | (((var91 | var61 << 12) + 21 & 64512) >> 10 | var60 << 6) << 4);
        var20.setCharAt(var36, (char)(var93 | var63 << 4));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), jx.class.getClassLoader()).returnType();
      switch (((var4 - 2041572227 + 196316150 ^ 200445303 ^ 1751281437) - 1743468984 ^ 412314315 ^ 1620934558 ^ 59340685) - 1540896950 ^ 443225665) {
        case 1047336101:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1508549278:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1672388805:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 2109494036:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      yqf[(var10 + 1324695434 - 1762170856 + 1509311470 ^ 1117595260) + 535631390 - 1658007028 - 1591093114 + 1994689014 + 530304890 ^ 932670812] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
