// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class xr {
  public String ue;
  public List fja = (ArrayList)/* jnt */;
  // [JNT] MethodHandle dispatch table (removed)
  public xr(String var1) {
    this.ue = var1;
  }

  public boolean sad(lz var1) {
    return /* jnt */, var1
    );
  }

  public boolean fhy(im var1) {
    return /* jnt */ != null;
  }

  public lz vj(im var1) {
    int var4 = -1607916024;
    if (var1 == null) {
      return null;
    } else {
      Iterator var2 = /* jnt */
      );

      lz var3;
      label29:
      while (true) {
        var4 = (-1777858823 * 490829434 | 1541892132) & -537924036;

        while (true) {
          switch (((var4 ^ 1106101867) + 728816991 - 1257840435 ^ 105936658) - 1653370407 ^ 850764323) {
            case -1527771367:
            default:
              if (/* jnt */) {
                var3 = (lz)/* jnt */;
                if (/* jnt */), var1
                )) {
                  break label29;
                }
                continue label29;
              }

              var4 = (-1114645071 + -864994461 | 1928098915) & -135465225;
              break;
            case 2702096:
              return null;
          }
        }
      }

      return var3;
    }
  }

  public String vyn() {
    return null /* jnt:encrypted */;
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 ^ 90429335) + 410630577 - 2124508987 - 384967896 - 2061584803 ^ 1502994834 ^ 833200207) + 1994569781 + 1798110263;
    MethodHandle var10000 = wes[((var10 ^ 90429335) + 410630577 - 2124508987 - 384967896 - 2061584803 ^ 1502994834 ^ 833200207)
      + 1994569781
      + 1798110263
      - 200420634];
    if (wes[var10001 - 200420634] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (1471804154 & -157114103 | 0) & -2128656506; var23 < var13.length(); var23 += 696357483 ^ 1990288893 ^ 1595996055) {
        int var42 = var13.charAt(var23) + ':';
        int var10004 = (var42 & 65504) >> 5;
        int var43 = ((var42 & 65504) >> 5 | var42 << 11) + 31 - 222 + 182 ^ 147;
        int var77 = ((((var42 & 65504) >> 5 | var42 << 11) + 31 - 222 + 182 ^ 147) & 65408) >> 7;
        char var44 = (char)(
          (((((var10004 | var42 << 11) + 31 - 222 + 182 ^ 147) & 65408) >> 7 | (((var42 & 65504) >> 5 | var42 << 11) + 31 - 222 + 182 ^ 147) << 9) ^ 57)
            + 61
            - 137
        );
        var13.setCharAt(var23, (char)(((var77 | var43 << 9) ^ 57) + 61 - 137));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (-440592382 >>> -1431672462 | 0) & 23938048;
        var29 < var16.length();
        var29 += 60455135 + (1849258615 >> 60455135 + 1849258615) ^ 60455574
      ) {
        int var49 = (var16.charAt(var29) ^ 167) + 132 - 132;
        int var78 = (var49 & 63488) >> 11;
        int var50 = (((var49 & 63488) >> 11 | var49 << 5) ^ 100) - 212 ^ 227;
        int var79 = (((((var49 & 63488) >> 11 | var49 << 5) ^ 100) - 212 ^ 227) & 65528) >> 3;
        char var51 = (char)(
          (((((var78 | var49 << 5) ^ 100) - 212 ^ 227) & 65528) >> 3 | ((((var49 & 63488) >> 11 | var49 << 5) ^ 100) - 212 ^ 227) << 13) - 18 ^ 78
        );
        var16.setCharAt(var29, (char)((var79 | var50 << 13) - 18 ^ 78));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), xr.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (-2106469710 - (980417116 ^ -1336898208) | 0) & 83951624; var35 < var19.length(); var35 += (442479831 >>> 442479831 | 1) & -1296348023) {
        int var56 = var19.charAt(var35) + 147 ^ 206;
        int var80 = (var56 & 65535) >> 0;
        int var57 = (var56 & 65535) >> 0 | var56 << 16;
        int var81 = (((var56 & 65535) >> 0 | var56 << 16) & 65534) >> 1;
        var56 = (((var80 | var56 << 16) & 65534) >> 1 | ((var56 & 65535) >> 0 | var56 << 16) << 15) + 252 + 160 + 169;
        var80 = ((var81 | var57 << 15) + 252 + 160 + 169 & 64512) >> 10;
        int var59 = ((var81 | var57 << 15) + 252 + 160 + 169 & 64512) >> 10 | var56 << 6;
        int var83 = ((((var81 | var57 << 15) + 252 + 160 + 169 & 64512) >> 10 | var56 << 6) & 32768) >> 15;
        char var60 = (char)((((var80 | var56 << 6) & 32768) >> 15 | (((var81 | var57 << 15) + 252 + 160 + 169 & 64512) >> 10 | var56 << 6) << 1) - 176);
        var19.setCharAt(var35, (char)((var83 | var59 << 1) - 176));
      }

      Class var7 = Class.forName(var19.toString(), false, xr.class.getClassLoader());
      switch ((((var4 ^ 1385214811) - 1361146015 - 285996818 ^ 1112066029) - 958022020 + 1614929064 - 283384639 ^ 1790263585) - 1411938089 - 731212081) {
        case 253021530:
        case 853398809:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 848412379:
          var10000 = var0.findSpecial(var7, var5, var6, xr.class);
          break;
        case 1050902554:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 2040216326:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    wes[((var10 ^ 90429335) + 410630577 - 2124508987 - 384967896 - 2061584803 ^ 1502994834 ^ 833200207) + 1994569781 + 1798110263 - 200420634] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (var10 - 555722595 ^ 966537717 ^ 1977810728 ^ 1609746626) - 1991627604 + 890979886 - 1962729822 ^ 621035754 ^ 1150834744;
    MethodHandle var10000 = wes[(var10 - 555722595 ^ 966537717 ^ 1977810728 ^ 1609746626) - 1991627604 + 890979886 - 1962729822
      ^ 621035754
      ^ 1150834744
      ^ 1315407275];
    if (wes[var10001 ^ 1315407275] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (1793903544 | -480342575) ^ -335622151; var24 < var14.length(); var24 += 1028026977 * 1028026977 ^ -98137920) {
        int var43 = var14.charAt(var24);
        int var10004 = (var43 & 64512) >> 10;
        int var44 = ((var43 & 64512) >> 10 | var43 << 6) ^ 63 ^ 17;
        int var88 = ((((var43 & 64512) >> 10 | var43 << 6) ^ 63 ^ 17) & 63488) >> 11;
        var43 = (((var10004 | var43 << 6) ^ 63 ^ 17) & 63488) >> 11 | (((var43 & 64512) >> 10 | var43 << 6) ^ 63 ^ 17) << 5;
        var10004 = ((var88 | var44 << 5) & 65472) >> 6;
        int var46 = ((var88 | var44 << 5) & 65472) >> 6 | var43 << 10;
        int var90 = ((((var88 | var44 << 5) & 65472) >> 6 | var43 << 10) & 65520) >> 4;
        var43 = ((var10004 | var43 << 10) & 65520) >> 4 | (((var88 | var44 << 5) & 65472) >> 6 | var43 << 10) << 12;
        var10004 = ((var90 | var46 << 12) & 63488) >> 11;
        int var48 = ((var90 | var46 << 12) & 63488) >> 11 | var43 << 5;
        int var92 = ((((var90 | var46 << 12) & 63488) >> 11 | var43 << 5) & 65532) >> 2;
        char var49 = (char)((((var10004 | var43 << 5) & 65532) >> 2 | (((var90 | var46 << 12) & 63488) >> 11 | var43 << 5) << 14) + 187 ^ 88);
        var14.setCharAt(var24, (char)((var92 | var48 << 14) + 187 ^ 88));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (-1988838449 >> -1988838449 | 0) & 51458; var30 < var17.length(); var30 += 421808896 ^ -2115296108 ^ -1731235947) {
        int var54 = var17.charAt(var30);
        int var93 = (var54 & 65528) >> 3;
        int var55 = ((var54 & 65528) >> 3 | var54 << 13) ^ 223;
        int var94 = ((((var54 & 65528) >> 3 | var54 << 13) ^ 223) & 63488) >> 11;
        var54 = ((((var93 | var54 << 13) ^ 223) & 63488) >> 11 | (((var54 & 65528) >> 3 | var54 << 13) ^ 223) << 5) + 168 - 84 + 65 + 92;
        var93 = ((var94 | var55 << 5) + 168 - 84 + 65 + 92 & 65024) >> 9;
        int var57 = (((var94 | var55 << 5) + 168 - 84 + 65 + 92 & 65024) >> 9 | var54 << 7) + 201;
        int var96 = ((((var94 | var55 << 5) + 168 - 84 + 65 + 92 & 65024) >> 9 | var54 << 7) + 201 & 32768) >> 15;
        char var58 = (char)(((var93 | var54 << 7) + 201 & 32768) >> 15 | (((var94 | var55 << 5) + 168 - 84 + 65 + 92 & 65024) >> 9 | var54 << 7) + 201 << 1);
        var17.setCharAt(var30, (char)(var96 | var57 << 1));
      }

      Class var6 = Class.forName(var17.toString(), false, xr.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (1881072656 << -901473008 | 0) & 283911474; var36 < var20.length(); var36 += 767736652 - (-1255490645 | -1255490645) ^ 2023227296) {
        int var63 = var20.charAt(var36) + 25 - 164 - 15 - 238 + 43;
        char var66 = (char)(
          (
              (((((var63 & 32768) >> 15 | var63 << 1) & 32768) >> 15 | ((var63 & 32768) >> 15 | var63 << 1) << 1) & 61440) >> 12
                | ((((var63 & 32768) >> 15 | var63 << 1) & 32768) >> 15 | ((var63 & 32768) >> 15 | var63 << 1) << 1) << 4
            )
            + 168
            - 195
        );
        var20.setCharAt(
          var36,
          (char)(
            (
                (((((var63 & 32768) >> 15 | var63 << 1) & 32768) >> 15 | ((var63 & 32768) >> 15 | var63 << 1) << 1) & 61440) >> 12
                  | ((((var63 & 32768) >> 15 | var63 << 1) & 32768) >> 15 | ((var63 & 32768) >> 15 | var63 << 1) << 1) << 4
              )
              + 168
              - 195
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), xr.class.getClassLoader()).returnType();
      switch ((((var4 ^ 286136727) - 206464586 ^ 1144229566) + 1173168812 + 1230450638 - 1994641327 ^ 1056124399) + 123681893 + 1243544846 ^ 1587309605) {
        case 182742478:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1525654145:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1709472870:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1848871654:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      wes[(var10 - 555722595 ^ 966537717 ^ 1977810728 ^ 1609746626) - 1991627604 + 890979886 - 1962729822 ^ 621035754 ^ 1150834744 ^ 1315407275] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
