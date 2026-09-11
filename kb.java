// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashSet;
import java.util.Set;

public class kb extends wus {
  public Runnable xo;
  public Set wl;
  public Set pag;
  // [JNT] MethodHandle dispatch table (removed)
  public kb(String var1, Set var2) {
    super(var1);
    this.wl = (HashSet)/* jnt */;
    this.pag = (HashSet)/* jnt */;
  }

  public Set nvj() {
    return null /* jnt:encrypted */;
  }

  public void wtl(Set var1) {
    null /* jnt:encrypted *//* jnt */
    );
    if (null /* jnt:encrypted */ != null) {
      /* jnt */
      );
    }
  }

  public Set ojg() {
    return null /* jnt:encrypted */;
  }

  public void ft() {
    null /* jnt:encrypted *//* jnt */
      )
    );
  }

  public kb kaz(Runnable var1) {
    null /* jnt:encrypted */;
    return this;
  }

  @Override
  public boolean d() {
    return /* jnt */,
      null /* jnt:encrypted */
    );
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (var10 ^ 1023940350) - 651545380 + 38052733 + 39984747 + 2693587 - 677335836 + 630109019 - 314021134 ^ 1313170031;
    MethodHandle var10000 = nzj[((var10 ^ 1023940350) - 651545380 + 38052733 + 39984747 + 2693587 - 677335836 + 630109019 - 314021134 ^ 1313170031) + 998969705];
    if (nzj[var10001 + 998969705] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = 832439650 << -1478306203 ^ 868265024; var23 < var13.length(); var23 += -1100667081 * -1450812535 ^ -1361278610) {
        char var42 = var13.charAt(var23);
        int var10004 = (var42 & 'ﰀ') >> 10;
        int var43 = (((var42 & 'ﰀ') >> 10 | var42 << 6) ^ 211 ^ 69) - 225 + 247 + 125 - 179 ^ 76;
        int var79 = (((((var42 & 'ﰀ') >> 10 | var42 << 6) ^ 211 ^ 69) - 225 + 247 + 125 - 179 ^ 76) & 65534) >> 1;
        var42 = (char)(
          (
              ((((var10004 | var42 << 6) ^ 211 ^ 69) - 225 + 247 + 125 - 179 ^ 76) & 65534) >> 1
                | ((((var42 & 'ﰀ') >> 10 | var42 << 6) ^ 211 ^ 69) - 225 + 247 + 125 - 179 ^ 76) << 15
            )
            ^ 175
        );
        var13.setCharAt(var23, (char)((var79 | var43 << 15) ^ 175));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = -328496688 << -316515875 ^ 0; var29 < var16.length(); var29 += (1896672426 * -1204066847 | 1) & 16926869) {
        int var49 = var16.charAt(var29) + 'g';
        char var52 = (char)(
          (
              (((((((var49 & 61440) >> 12 | var49 << 4) ^ 85) & 63488) >> 11 | (((var49 & 61440) >> 12 | var49 << 4) ^ 85) << 5) ^ 248) - 127 - 47 & 61440)
                  >> 12
                | ((((((var49 & 61440) >> 12 | var49 << 4) ^ 85) & 63488) >> 11 | (((var49 & 61440) >> 12 | var49 << 4) ^ 85) << 5) ^ 248) - 127 - 47 << 4
            )
            - 76
            - 11
        );
        var16.setCharAt(
          var29,
          (char)(
            (
                (((((((var49 & 61440) >> 12 | var49 << 4) ^ 85) & 63488) >> 11 | (((var49 & 61440) >> 12 | var49 << 4) ^ 85) << 5) ^ 248) - 127 - 47 & 61440)
                    >> 12
                  | ((((((var49 & 61440) >> 12 | var49 << 4) ^ 85) & 63488) >> 11 | (((var49 & 61440) >> 12 | var49 << 4) ^ 85) << 5) ^ 248) - 127 - 47 << 4
              )
              - 76
              - 11
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), kb.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (837738448 + -2064164675 | 0) & 16827440; var35 < var19.length(); var35 += (2118828767 >> -666202219 | 1) & -462444535) {
        int var57 = var19.charAt(var35) + 210;
        int var83 = (var57 & 65535) >> 0;
        int var58 = (((var57 & 65535) >> 0 | var57 << 16) + 86 ^ 115 ^ 6) - 126;
        int var84 = ((((var57 & 65535) >> 0 | var57 << 16) + 86 ^ 115 ^ 6) - 126 & 65504) >> 5;
        var57 = ((((var83 | var57 << 16) + 86 ^ 115 ^ 6) - 126 & 65504) >> 5 | (((var57 & 65535) >> 0 | var57 << 16) + 86 ^ 115 ^ 6) - 126 << 11) ^ 16;
        var83 = (((var84 | var58 << 11) ^ 16) & 64512) >> 10;
        int var60 = (((var84 | var58 << 11) ^ 16) & 64512) >> 10 | var57 << 6;
        int var86 = (((((var84 | var58 << 11) ^ 16) & 64512) >> 10 | var57 << 6) & 57344) >> 13;
        char var61 = (char)(((var83 | var57 << 6) & 57344) >> 13 | ((((var84 | var58 << 11) ^ 16) & 64512) >> 10 | var57 << 6) << 3);
        var19.setCharAt(var35, (char)(var86 | var60 << 3));
      }

      Class var7 = Class.forName(var19.toString(), false, kb.class.getClassLoader());
      switch ((var4 + 512961541 + 1122994052 + 877339112 ^ 138583843 ^ 208804462) - 1188556970 - 1525616155 - 372257398 ^ 649728223 ^ 1646225718) {
        case 217590176:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 225218902:
        case 1079893686:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 451710017:
          var10000 = var0.findSpecial(var7, var5, var6, kb.class);
          break;
        case 1354455615:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    nzj[((var10 ^ 1023940350) - 651545380 + 38052733 + 39984747 + 2693587 - 677335836 + 630109019 - 314021134 ^ 1313170031) + 998969705] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 - 1998446856 + 1135967510 ^ 1931242779) - 281230376 ^ 148579711 ^ 128519748) + 1891774036 - 1885565462 ^ 403971465;
    MethodHandle var10000 = nzj[(((var10 - 1998446856 + 1135967510 ^ 1931242779) - 281230376 ^ 148579711 ^ 128519748) + 1891774036 - 1885565462 ^ 403971465)
      - 1565843142];
    if (nzj[var10001 - 1565843142] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (-455692688 - -610627103 | 0) & 541090384; var24 < var14.length(); var24 += 1963452448 - (1963452448 ^ 1372996185) ^ 1345732006) {
        int var43 = var14.charAt(var24);
        int var10004 = (var43 & 65534) >> 1;
        int var44 = ((var43 & 65534) >> 1 | var43 << 15) ^ 126 ^ 178;
        int var90 = ((((var43 & 65534) >> 1 | var43 << 15) ^ 126 ^ 178) & 63488) >> 11;
        var43 = (((var10004 | var43 << 15) ^ 126 ^ 178) & 63488) >> 11 | (((var43 & 65534) >> 1 | var43 << 15) ^ 126 ^ 178) << 5;
        var10004 = ((var90 | var44 << 5) & 64512) >> 10;
        int var46 = (((var90 | var44 << 5) & 64512) >> 10 | var43 << 6) ^ 65;
        int var92 = (((((var90 | var44 << 5) & 64512) >> 10 | var43 << 6) ^ 65) & 57344) >> 13;
        var43 = (((var10004 | var43 << 6) ^ 65) & 57344) >> 13 | ((((var90 | var44 << 5) & 64512) >> 10 | var43 << 6) ^ 65) << 3;
        var10004 = ((var92 | var46 << 3) & 65534) >> 1;
        int var48 = (((var92 | var46 << 3) & 65534) >> 1 | var43 << 15) ^ 21;
        int var94 = (((((var92 | var46 << 3) & 65534) >> 1 | var43 << 15) ^ 21) & 65472) >> 6;
        char var49 = (char)((((var10004 | var43 << 15) ^ 21) & 65472) >> 6 | ((((var92 | var46 << 3) & 65534) >> 1 | var43 << 15) ^ 21) << 10);
        var14.setCharAt(var24, (char)(var94 | var48 << 10));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (370556391 | 1379757565) ^ 1447001599; var30 < var17.length(); var30 += (-1330106234 - -1301946043 | 1) & 8658987) {
        int var54 = var17.charAt(var30);
        int var95 = (var54 & 32768) >> 15;
        int var55 = (var54 & 32768) >> 15 | var54 << 1;
        int var96 = (((var54 & 32768) >> 15 | var54 << 1) & 65504) >> 5;
        var54 = (((var95 | var54 << 1) & 65504) >> 5 | ((var54 & 32768) >> 15 | var54 << 1) << 11) ^ 63;
        var95 = (((var96 | var55 << 11) ^ 63) & 49152) >> 14;
        int var57 = ((((var96 | var55 << 11) ^ 63) & 49152) >> 14 | var54 << 2) - 196 + 115;
        int var98 = (((((var96 | var55 << 11) ^ 63) & 49152) >> 14 | var54 << 2) - 196 + 115 & 61440) >> 12;
        char var58 = (char)(
          ((((var95 | var54 << 2) - 196 + 115 & 61440) >> 12 | ((((var96 | var55 << 11) ^ 63) & 49152) >> 14 | var54 << 2) - 196 + 115 << 4) - 187 ^ 190) - 4
        );
        var17.setCharAt(var30, (char)(((var98 | var57 << 4) - 187 ^ 190) - 4));
      }

      Class var6 = Class.forName(var17.toString(), false, kb.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (115452456 + 379951607 | 0) & 36733504; var36 < var20.length(); var36 += (-1299162514 ^ -1299162514 | 1) & 1504789819) {
        int var63 = var20.charAt(var36) ^ '\f' ^ 116;
        int var99 = (var63 & 65472) >> 6;
        int var64 = ((var63 & 65472) >> 6 | var63 << 10) + 35;
        int var100 = (((var63 & 65472) >> 6 | var63 << 10) + 35 & 65535) >> 0;
        var63 = ((var99 | var63 << 10) + 35 & 65535) >> 0 | ((var63 & 65472) >> 6 | var63 << 10) + 35 << 16;
        var99 = ((var100 | var64 << 16) & 49152) >> 14;
        int var66 = (((var100 | var64 << 16) & 49152) >> 14 | var63 << 2) + 98;
        int var102 = ((((var100 | var64 << 16) & 49152) >> 14 | var63 << 2) + 98 & 65472) >> 6;
        char var67 = (char)((((var99 | var63 << 2) + 98 & 65472) >> 6 | (((var100 | var64 << 16) & 49152) >> 14 | var63 << 2) + 98 << 10) ^ 39 ^ 45);
        var20.setCharAt(var36, (char)((var102 | var66 << 10) ^ 39 ^ 45));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), kb.class.getClassLoader()).returnType();
      switch ((var4 - 1548582339 + 1391102356 - 747419991 ^ 1489361234 ^ 474103079) + 1921425451 - 861477180 + 994474820 ^ 1157155794 ^ 950387481) {
        case 512034129:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 527738837:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1795087577:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 2053726901:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      nzj[(((var10 - 1998446856 + 1135967510 ^ 1931242779) - 281230376 ^ 148579711 ^ 128519748) + 1891774036 - 1885565462 ^ 403971465) - 1565843142] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
