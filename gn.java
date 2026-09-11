// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

public class gn extends wus {
  public boolean klg;
  public int imh;
  public int gx;
  public boolean uo;
  // [JNT] MethodHandle dispatch table (removed)
  public gn(String var1, int var2, boolean var3) {
    super(var1);
    this.gx = var2;
    this.imh = var2;
    this.klg = var3;
  }

  public boolean ivd() {
    return null /* jnt:encrypted */;
  }

  public boolean fav() {
    return null /* jnt:encrypted */;
  }

  public void ki(boolean var1) {
    null /* jnt:encrypted */;
  }

  public int cl() {
    return null /* jnt:encrypted */;
  }

  public int bj() {
    return null /* jnt:encrypted */;
  }

  public void ymi(int var1) {
    null /* jnt:encrypted */;
  }

  public void yzx() {
    null /* jnt:encrypted */);
  }

  @Override
  public boolean d() {
    return null /* jnt:encrypted */ == null /* jnt:encrypted */;
  }

  public gn feo(String var1) {
    /* jnt */;
    return this;
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (var10 - 2104344036 - 451536032 - 664499355 + 936727560 ^ 136699282) + 912018031 - 1402161115 + 818309597 + 1013654733;
    MethodHandle var10000 = meo[(var10 - 2104344036 - 451536032 - 664499355 + 936727560 ^ 136699282) + 912018031 - 1402161115 + 818309597 + 1013654733
      ^ 529307662];
    if (meo[var10001 ^ 529307662] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = -1152124920 ^ 748006982 ^ -1748609458; var23 < var13.length(); var23 += (1857293154 + 1857293154 | 1) & 8472875) {
        int var42 = var13.charAt(var23);
        int var10004 = (var42 & 49152) >> 14;
        int var43 = (var42 & 49152) >> 14 | var42 << 2;
        int var81 = (((var42 & 49152) >> 14 | var42 << 2) & 49152) >> 14;
        var42 = (((var10004 | var42 << 2) & 49152) >> 14 | ((var42 & 49152) >> 14 | var42 << 2) << 2) - 219 - 103;
        var10004 = ((var81 | var43 << 2) - 219 - 103 & 64512) >> 10;
        int var45 = (((var81 | var43 << 2) - 219 - 103 & 64512) >> 10 | var42 << 6) - 114 - 121 + 176;
        int var83 = ((((var81 | var43 << 2) - 219 - 103 & 64512) >> 10 | var42 << 6) - 114 - 121 + 176 & 65534) >> 1;
        char var46 = (char)(
          (((var10004 | var42 << 6) - 114 - 121 + 176 & 65534) >> 1 | (((var81 | var43 << 2) - 219 - 103 & 64512) >> 10 | var42 << 6) - 114 - 121 + 176 << 15)
            + 6
        );
        var13.setCharAt(var23, (char)((var83 | var45 << 15) + 6));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (187287522 << 1814047042 | 0) & 1343225971; var29 < var16.length(); var29 += (-1474955905 ^ -1724366902 | 1) & 201331979) {
        int var51 = var16.charAt(var29) - 27;
        char var54 = (char)(
          (
              (
                    ((((((var51 & 65532) >> 2 | var51 << 14) + 63 ^ 86) & 65024) >> 9 | (((var51 & 65532) >> 2 | var51 << 14) + 63 ^ 86) << 7) ^ 7) + 128 - 102
                      & 65504
                  )
                  >> 5
                | ((((((var51 & 65532) >> 2 | var51 << 14) + 63 ^ 86) & 65024) >> 9 | (((var51 & 65532) >> 2 | var51 << 14) + 63 ^ 86) << 7) ^ 7) + 128 - 102
                  << 11
            )
            + 52
        );
        var16.setCharAt(
          var29,
          (char)(
            (
                (
                      ((((((var51 & 65532) >> 2 | var51 << 14) + 63 ^ 86) & 65024) >> 9 | (((var51 & 65532) >> 2 | var51 << 14) + 63 ^ 86) << 7) ^ 7)
                          + 128
                          - 102
                        & 65504
                    )
                    >> 5
                  | ((((((var51 & 65532) >> 2 | var51 << 14) + 63 ^ 86) & 65024) >> 9 | (((var51 & 65532) >> 2 | var51 << 14) + 63 ^ 86) << 7) ^ 7) + 128 - 102
                    << 11
              )
              + 52
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), gn.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = 351662470 * -681698640 ^ -1663981536; var35 < var19.length(); var35 += (-1400967706 >>> -2265436 | 1) & -1794637535) {
        int var59 = var19.charAt(var35) + 164 + 75 + 31 - 194;
        char var62 = (char)(
          (
              ((((((var59 & 57344) >> 13 | var59 << 3) - 93 ^ 162) & 65535) >> 0 | (((var59 & 57344) >> 13 | var59 << 3) - 93 ^ 162) << 16) & 65408) >> 7
                | (((((var59 & 57344) >> 13 | var59 << 3) - 93 ^ 162) & 65535) >> 0 | (((var59 & 57344) >> 13 | var59 << 3) - 93 ^ 162) << 16) << 9
            )
            - 44
        );
        var19.setCharAt(
          var35,
          (char)(
            (
                ((((((var59 & 57344) >> 13 | var59 << 3) - 93 ^ 162) & 65535) >> 0 | (((var59 & 57344) >> 13 | var59 << 3) - 93 ^ 162) << 16) & 65408) >> 7
                  | (((((var59 & 57344) >> 13 | var59 << 3) - 93 ^ 162) & 65535) >> 0 | (((var59 & 57344) >> 13 | var59 << 3) - 93 ^ 162) << 16) << 9
              )
              - 44
          )
        );
      }

      Class var7 = Class.forName(var19.toString(), false, gn.class.getClassLoader());
      switch ((((var4 - 1963502906 ^ 1275789348) - 1490369740 - 1533423324 ^ 250384685 ^ 464117966) - 881094236 ^ 234651545) + 1919648455 + 1090864374) {
        case 208878623:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 270122047:
        case 854375647:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 768457895:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 1746656269:
          var10000 = var0.findSpecial(var7, var5, var6, gn.class);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    meo[(var10 - 2104344036 - 451536032 - 664499355 + 936727560 ^ 136699282) + 912018031 - 1402161115 + 818309597 + 1013654733 ^ 529307662] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (((var10 ^ 1418199542) - 1857133143 ^ 1060389668) + 1464229442 + 1940702195 ^ 173385665) + 1600560360 ^ 2068270234 ^ 1296858837;
    MethodHandle var10000 = meo[(
        (((var10 ^ 1418199542) - 1857133143 ^ 1060389668) + 1464229442 + 1940702195 ^ 173385665) + 1600560360 ^ 2068270234 ^ 1296858837
      )
      - 866286848];
    if (meo[var10001 - 866286848] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = 1734011847 + -1636279512 ^ 97732335; var24 < var14.length(); var24 += (1222538282 >> 375082692 | 1) & 33) {
        int var43 = var14.charAt(var24);
        int var10004 = (var43 & 49152) >> 14;
        int var44 = (var43 & 49152) >> 14 | var43 << 2;
        int var84 = (((var43 & 49152) >> 14 | var43 << 2) & 65534) >> 1;
        var43 = (((var10004 | var43 << 2) & 65534) >> 1 | ((var43 & 49152) >> 14 | var43 << 2) << 15) - 65 ^ 2;
        var10004 = (((var84 | var44 << 15) - 65 ^ 2) & 65532) >> 2;
        int var46 = ((((var84 | var44 << 15) - 65 ^ 2) & 65532) >> 2 | var43 << 14) - 65;
        int var86 = (((((var84 | var44 << 15) - 65 ^ 2) & 65532) >> 2 | var43 << 14) - 65 & 0) >> 16;
        var43 = ((var10004 | var43 << 14) - 65 & 0) >> 16 | ((((var84 | var44 << 15) - 65 ^ 2) & 65532) >> 2 | var43 << 14) - 65 << 0;
        var10004 = ((var86 | var46 << 0) & 65520) >> 4;
        int var48 = (((var86 | var46 << 0) & 65520) >> 4 | var43 << 12) + 71;
        int var88 = ((((var86 | var46 << 0) & 65520) >> 4 | var43 << 12) + 71 & 65520) >> 4;
        char var49 = (char)(((var10004 | var43 << 12) + 71 & 65520) >> 4 | (((var86 | var46 << 0) & 65520) >> 4 | var43 << 12) + 71 << 12);
        var14.setCharAt(var24, (char)(var88 | var48 << 12));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (-1615473930 << -1892102479 | 0) & 1477506656; var30 < var17.length(); var30 += (1765544277 - -817905753 | 1) & 1174610449) {
        int var54 = var17.charAt(var30) + 164;
        int var89 = (var54 & 49152) >> 14;
        int var55 = ((var54 & 49152) >> 14 | var54 << 2) - 91 - 1;
        int var90 = (((var54 & 49152) >> 14 | var54 << 2) - 91 - 1 & 61440) >> 12;
        char var56 = (char)((((var89 | var54 << 2) - 91 - 1 & 61440) >> 12 | ((var54 & 49152) >> 14 | var54 << 2) - 91 - 1 << 4) + 90 + 47 + 186 - 132 ^ 81);
        var17.setCharAt(var30, (char)((var90 | var55 << 4) + 90 + 47 + 186 - 132 ^ 81));
      }

      Class var6 = Class.forName(var17.toString(), false, gn.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (1453612819 & -1215932365 | 0) & 1766924684; var36 < var20.length(); var36 += -1861169617 + -2112497743 ^ 321299937) {
        int var61 = (var20.charAt(var36) - 227 ^ 4) + 212 + 209 - 138;
        char var64 = (char)(
          ((((((var61 & 0) >> 16 | var61 << 0) & 61440) >> 12 | ((var61 & 0) >> 16 | var61 << 0) << 4) ^ 110) - 152 & 65504) >> 5
            | (((((var61 & 0) >> 16 | var61 << 0) & 61440) >> 12 | ((var61 & 0) >> 16 | var61 << 0) << 4) ^ 110) - 152 << 11
        );
        var20.setCharAt(
          var36,
          (char)(
            ((((((var61 & 0) >> 16 | var61 << 0) & 61440) >> 12 | ((var61 & 0) >> 16 | var61 << 0) << 4) ^ 110) - 152 & 65504) >> 5
              | (((((var61 & 0) >> 16 | var61 << 0) & 61440) >> 12 | ((var61 & 0) >> 16 | var61 << 0) << 4) ^ 110) - 152 << 11
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), gn.class.getClassLoader()).returnType();
      switch (var4 + 1641161927 - 1378911925 + 978968127 - 1612145358 + 748231599 + 1503375004 + 904578497 + 682102681 - 275676335 + 1938376954) {
        case 984119536:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1067484928:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1329664738:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1928650884:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      meo[((((var10 ^ 1418199542) - 1857133143 ^ 1060389668) + 1464229442 + 1940702195 ^ 173385665) + 1600560360 ^ 2068270234 ^ 1296858837) - 866286848] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
