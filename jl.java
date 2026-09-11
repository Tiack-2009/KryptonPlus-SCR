// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

public enum jl {
  rcor,
  lva,
  bf;
  // [JNT] MethodHandle dispatch table (removed)
  // $VF: Failed to inline enum fields
  // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
  static {
    int var10000 = 611233344 >>> -525588930 ^ 0;

    StringBuilder var10001;
    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < (253022240 >>> 347296144 ^ 3856);
      var10000 += -711011504 >> 255250246 - -1361474864 ^ -169
    ) {
      char var10 = /* jnt */;
      char var13 = (char)(
        ((((((var10 & '쀀') >> 14 | var10 << 2) & 65520) >> 4 | ((var10 & '쀀') >> 14 | var10 << 2) << 12) ^ 54) + 209 & 65528) >> 3
          | (((((var10 & '쀀') >> 14 | var10 << 2) & 65520) >> 4 | ((var10 & '쀀') >> 14 | var10 << 2) << 12) ^ 54) + 209 << 13
      );
      /* jnt */(
          ((((((var10 & '쀀') >> 14 | var10 << 2) & 65520) >> 4 | ((var10 & '쀀') >> 14 | var10 << 2) << 12) ^ 54) + 209 & 65528) >> 3
            | (((((var10 & '쀀') >> 14 | var10 << 2) & 65520) >> 4 | ((var10 & '쀀') >> 14 | var10 << 2) << 12) ^ 54) + 209 << 13
        )
      );
    }

    rcor = (jl)/* jnt */, 0
    );
    var10000 = -953341641 >> -2135657162 ^ -228;

    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < (-251544853 * -435601450 ^ -1732962953);
      var10000 += -1248381856 >>> 1264590899 ^ 5811
    ) {
      int var16 = /* jnt */ - '<' + 50;
      char var17 = (char)(((var16 & 65472) >> 6 | var16 << 10) + 232 + 181);
      /* jnt */(((var16 & 65472) >> 6 | var16 << 10) + 232 + 181)
      );
    }

    lva = (jl)/* jnt */, 1
    );
    var10000 = 232873108 << -329638484 ^ 365510656;

    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < ((-1024231082 * -722439819 | 4) & 1342313508);
      var10000 += (1256120750 >>> 909616539 | 1) & -1469427805
    ) {
      int var20 = /* jnt */;
      int var36 = (var20 & 65520) >> 4;
      int var21 = ((var20 & 65520) >> 4 | var20 << 12) ^ 250;
      int var37 = ((((var20 & 65520) >> 4 | var20 << 12) ^ 250) & 65528) >> 3;
      var20 = (((var36 | var20 << 12) ^ 250) & 65528) >> 3 | (((var20 & 65520) >> 4 | var20 << 12) ^ 250) << 13;
      var36 = ((var37 | var21 << 13) & 65528) >> 3;
      int var23 = ((var37 | var21 << 13) & 65528) >> 3 | var20 << 13;
      int var39 = ((((var37 | var21 << 13) & 65528) >> 3 | var20 << 13) & 32768) >> 15;
      char var24 = (char)(((var36 | var20 << 13) & 32768) >> 15 | (((var37 | var21 << 13) & 65528) >> 3 | var20 << 13) << 1);
      /* jnt */(var39 | var23 << 1));
    }

    bf = (jl)/* jnt */, 2
    );
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = var10 - 376252434 + 975567449 - 1587610843 - 136414074 - 516930011 - 1918405296 + 1991385501 + 2133393996 - 1803747435;
    MethodHandle var10000 = cif[var10 - 376252434 + 975567449 - 1587610843 - 136414074 - 516930011 - 1918405296 + 1991385501 + 2133393996 - 1803747435
      ^ 58515827];
    if (cif[var10001 ^ 58515827] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = -1165147639 >> 228443945 ^ -2275679; var23 < var13.length(); var23 += 512259688 >> 512259688 ^ 2001015) {
        int var42 = var13.charAt(var23) + 'r' + 160;
        int var10004 = (var42 & 63488) >> 11;
        int var43 = (var42 & 63488) >> 11 | var42 << 5;
        int var89 = (((var42 & 63488) >> 11 | var42 << 5) & 0) >> 16;
        var42 = (((var10004 | var42 << 5) & 0) >> 16 | ((var42 & 63488) >> 11 | var42 << 5) << 0) + 221;
        var10004 = ((var89 | var43 << 0) + 221 & 0) >> 16;
        int var45 = ((var89 | var43 << 0) + 221 & 0) >> 16 | var42 << 0;
        int var91 = ((((var89 | var43 << 0) + 221 & 0) >> 16 | var42 << 0) & 65024) >> 9;
        var42 = ((var10004 | var42 << 0) & 65024) >> 9 | (((var89 | var43 << 0) + 221 & 0) >> 16 | var42 << 0) << 7;
        var10004 = ((var91 | var45 << 7) & 32768) >> 15;
        int var47 = ((var91 | var45 << 7) & 32768) >> 15 | var42 << 1;
        int var93 = ((((var91 | var45 << 7) & 32768) >> 15 | var42 << 1) & 64512) >> 10;
        char var48 = (char)((((var10004 | var42 << 1) & 64512) >> 10 | (((var91 | var45 << 7) & 32768) >> 15 | var42 << 1) << 6) ^ 28);
        var13.setCharAt(var23, (char)((var93 | var47 << 6) ^ 28));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (-1986615301 - -1543414094 | 0) & 403186834; var29 < var16.length(); var29 += 1111299856 ^ 305907036 ^ 1342624333) {
        int var53 = var16.charAt(var29);
        int var94 = (var53 & 65024) >> 9;
        int var54 = (var53 & 65024) >> 9 | var53 << 7;
        int var95 = (((var53 & 65024) >> 9 | var53 << 7) & 65520) >> 4;
        var53 = ((((var94 | var53 << 7) & 65520) >> 4 | ((var53 & 65024) >> 9 | var53 << 7) << 12) - 52 ^ 149) + 84 + 43 - 254;
        var94 = (((var95 | var54 << 12) - 52 ^ 149) + 84 + 43 - 254 & 65535) >> 0;
        int var56 = (((var95 | var54 << 12) - 52 ^ 149) + 84 + 43 - 254 & 65535) >> 0 | var53 << 16;
        int var97 = (((((var95 | var54 << 12) - 52 ^ 149) + 84 + 43 - 254 & 65535) >> 0 | var53 << 16) & 32768) >> 15;
        char var57 = (char)(
          (((var94 | var53 << 16) & 32768) >> 15 | ((((var95 | var54 << 12) - 52 ^ 149) + 84 + 43 - 254 & 65535) >> 0 | var53 << 16) << 1) + 144
        );
        var16.setCharAt(var29, (char)((var97 | var56 << 1) + 144));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), jl.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = -346307446 * (-1470491216 + -1470491216) ^ -42671680; var35 < var19.length(); var35 += (-1002137554 + -1001678866 | 1) & 1953090691) {
        int var62 = var19.charAt(var35) + 136 - 88;
        int var98 = (var62 & 57344) >> 13;
        int var63 = ((var62 & 57344) >> 13 | var62 << 3) ^ 96;
        int var99 = ((((var62 & 57344) >> 13 | var62 << 3) ^ 96) & 65534) >> 1;
        var62 = ((((var98 | var62 << 3) ^ 96) & 65534) >> 1 | (((var62 & 57344) >> 13 | var62 << 3) ^ 96) << 15) - 40 - 193 ^ 209;
        var98 = (((var99 | var63 << 15) - 40 - 193 ^ 209) & 65534) >> 1;
        int var65 = (((var99 | var63 << 15) - 40 - 193 ^ 209) & 65534) >> 1 | var62 << 15;
        int var101 = (((((var99 | var63 << 15) - 40 - 193 ^ 209) & 65534) >> 1 | var62 << 15) & 65472) >> 6;
        char var66 = (char)(((var98 | var62 << 15) & 65472) >> 6 | ((((var99 | var63 << 15) - 40 - 193 ^ 209) & 65534) >> 1 | var62 << 15) << 10);
        var19.setCharAt(var35, (char)(var101 | var65 << 10));
      }

      Class var7 = Class.forName(var19.toString(), false, jl.class.getClassLoader());
      switch ((var4 + 1266094284 - 501919992 - 2032981956 + 466745998 - 1840565020 ^ 72577123) - 422156727 + 1880348901 + 1452903101 + 1234715144) {
        case 680510348:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 733541948:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 1085345974:
        case 1609124116:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1130851754:
          var10000 = var0.findSpecial(var7, var5, var6, jl.class);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    cif[var10 - 376252434 + 975567449 - 1587610843 - 136414074 - 516930011 - 1918405296 + 1991385501 + 2133393996 - 1803747435 ^ 58515827] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (var10 + 1327837769 - 1896354453 ^ 206729093 ^ 529607785) + 1482388601 + 512074324 - 1367423067 - 212764957 ^ 1236436470;
    MethodHandle var10000 = cif[((var10 + 1327837769 - 1896354453 ^ 206729093 ^ 529607785) + 1482388601 + 512074324 - 1367423067 - 212764957 ^ 1236436470)
      + 202257066];
    if (cif[var10001 + 202257066] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = 480715319 + -1637845150 ^ -1157129831; var24 < var14.length(); var24 += (-860288017 & -860288017 | 0) & 268710913) {
        int var43 = var14.charAt(var24);
        int var10004 = (var43 & 63488) >> 11;
        int var44 = (var43 & 63488) >> 11 | var43 << 5;
        int var88 = (((var43 & 63488) >> 11 | var43 << 5) & 64512) >> 10;
        var43 = (((var10004 | var43 << 5) & 64512) >> 10 | ((var43 & 63488) >> 11 | var43 << 5) << 6) - 30 + 168 - 2;
        var10004 = ((var88 | var44 << 6) - 30 + 168 - 2 & 63488) >> 11;
        int var46 = ((((var88 | var44 << 6) - 30 + 168 - 2 & 63488) >> 11 | var43 << 5) ^ 184) - 249 ^ 58;
        int var90 = ((((((var88 | var44 << 6) - 30 + 168 - 2 & 63488) >> 11 | var43 << 5) ^ 184) - 249 ^ 58) & 65504) >> 5;
        char var47 = (char)(
          ((((var10004 | var43 << 5) ^ 184) - 249 ^ 58) & 65504) >> 5
            | (((((var88 | var44 << 6) - 30 + 168 - 2 & 63488) >> 11 | var43 << 5) ^ 184) - 249 ^ 58) << 11
        );
        var14.setCharAt(var24, (char)(var90 | var46 << 11));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = 1245162767 >> 1564541557 ^ 593; var30 < var17.length(); var30 += (-1015248155 >>> -8334156 | 1) & 1788780617) {
        int var52 = var17.charAt(var30);
        int var91 = (var52 & 65535) >> 0;
        int var53 = (((var52 & 65535) >> 0 | var52 << 16) + 36 ^ 47) - 202;
        int var92 = ((((var52 & 65535) >> 0 | var52 << 16) + 36 ^ 47) - 202 & 57344) >> 13;
        var52 = (((var91 | var52 << 16) + 36 ^ 47) - 202 & 57344) >> 13 | (((var52 & 65535) >> 0 | var52 << 16) + 36 ^ 47) - 202 << 3;
        var91 = ((var92 | var53 << 3) & 63488) >> 11;
        int var55 = (((var92 | var53 << 3) & 63488) >> 11 | var52 << 5) - 221 + 239;
        int var94 = ((((var92 | var53 << 3) & 63488) >> 11 | var52 << 5) - 221 + 239 & 49152) >> 14;
        char var56 = (char)((((var91 | var52 << 5) - 221 + 239 & 49152) >> 14 | (((var92 | var53 << 3) & 63488) >> 11 | var52 << 5) - 221 + 239 << 2) - 83);
        var17.setCharAt(var30, (char)((var94 | var55 << 2) - 83));
      }

      Class var6 = Class.forName(var17.toString(), false, jl.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = 859400863 * -1508076619 ^ -214585493; var36 < var20.length(); var36 += (-1596673866 - -1206032521 | 1) & 269004929) {
        char var61 = var20.charAt(var36);
        char var66 = (char)(
          (
                (
                    (
                          (
                              (
                                    (
                                        ((((var61 & 'ﾀ') >> 7 | var61 << '\t') ^ 84 ^ 63 ^ 20) - 250 + 227 & 65408) >> 7
                                          | (((var61 & 'ﾀ') >> 7 | var61 << '\t') ^ 84 ^ 63 ^ 20) - 250 + 227 << 9
                                      )
                                      & 63488
                                  )
                                  >> 11
                                | (
                                    ((((var61 & 'ﾀ') >> 7 | var61 << '\t') ^ 84 ^ 63 ^ 20) - 250 + 227 & 65408) >> 7
                                      | (((var61 & 'ﾀ') >> 7 | var61 << '\t') ^ 84 ^ 63 ^ 20) - 250 + 227 << 9
                                  )
                                  << 5
                            )
                            & 65024
                        )
                        >> 9
                      | (
                          (
                                (
                                    ((((var61 & 'ﾀ') >> 7 | var61 << '\t') ^ 84 ^ 63 ^ 20) - 250 + 227 & 65408) >> 7
                                      | (((var61 & 'ﾀ') >> 7 | var61 << '\t') ^ 84 ^ 63 ^ 20) - 250 + 227 << 9
                                  )
                                  & 63488
                              )
                              >> 11
                            | (
                                ((((var61 & 'ﾀ') >> 7 | var61 << '\t') ^ 84 ^ 63 ^ 20) - 250 + 227 & 65408) >> 7
                                  | (((var61 & 'ﾀ') >> 7 | var61 << '\t') ^ 84 ^ 63 ^ 20) - 250 + 227 << 9
                              )
                              << 5
                        )
                        << 7
                  )
                  & 65528
              )
              >> 3
            | (
                (
                      (
                          (
                                (
                                    ((((var61 & 'ﾀ') >> 7 | var61 << '\t') ^ 84 ^ 63 ^ 20) - 250 + 227 & 65408) >> 7
                                      | (((var61 & 'ﾀ') >> 7 | var61 << '\t') ^ 84 ^ 63 ^ 20) - 250 + 227 << 9
                                  )
                                  & 63488
                              )
                              >> 11
                            | (
                                ((((var61 & 'ﾀ') >> 7 | var61 << '\t') ^ 84 ^ 63 ^ 20) - 250 + 227 & 65408) >> 7
                                  | (((var61 & 'ﾀ') >> 7 | var61 << '\t') ^ 84 ^ 63 ^ 20) - 250 + 227 << 9
                              )
                              << 5
                        )
                        & 65024
                    )
                    >> 9
                  | (
                      (
                            (
                                ((((var61 & 'ﾀ') >> 7 | var61 << '\t') ^ 84 ^ 63 ^ 20) - 250 + 227 & 65408) >> 7
                                  | (((var61 & 'ﾀ') >> 7 | var61 << '\t') ^ 84 ^ 63 ^ 20) - 250 + 227 << 9
                              )
                              & 63488
                          )
                          >> 11
                        | (
                            ((((var61 & 'ﾀ') >> 7 | var61 << '\t') ^ 84 ^ 63 ^ 20) - 250 + 227 & 65408) >> 7
                              | (((var61 & 'ﾀ') >> 7 | var61 << '\t') ^ 84 ^ 63 ^ 20) - 250 + 227 << 9
                          )
                          << 5
                    )
                    << 7
              )
              << 13
        );
        var20.setCharAt(
          var36,
          (char)(
            (
                  (
                      (
                            (
                                (
                                      (
                                          ((((var61 & 'ﾀ') >> 7 | var61 << '\t') ^ 84 ^ 63 ^ 20) - 250 + 227 & 65408) >> 7
                                            | (((var61 & 'ﾀ') >> 7 | var61 << '\t') ^ 84 ^ 63 ^ 20) - 250 + 227 << 9
                                        )
                                        & 63488
                                    )
                                    >> 11
                                  | (
                                      ((((var61 & 'ﾀ') >> 7 | var61 << '\t') ^ 84 ^ 63 ^ 20) - 250 + 227 & 65408) >> 7
                                        | (((var61 & 'ﾀ') >> 7 | var61 << '\t') ^ 84 ^ 63 ^ 20) - 250 + 227 << 9
                                    )
                                    << 5
                              )
                              & 65024
                          )
                          >> 9
                        | (
                            (
                                  (
                                      ((((var61 & 'ﾀ') >> 7 | var61 << '\t') ^ 84 ^ 63 ^ 20) - 250 + 227 & 65408) >> 7
                                        | (((var61 & 'ﾀ') >> 7 | var61 << '\t') ^ 84 ^ 63 ^ 20) - 250 + 227 << 9
                                    )
                                    & 63488
                                )
                                >> 11
                              | (
                                  ((((var61 & 'ﾀ') >> 7 | var61 << '\t') ^ 84 ^ 63 ^ 20) - 250 + 227 & 65408) >> 7
                                    | (((var61 & 'ﾀ') >> 7 | var61 << '\t') ^ 84 ^ 63 ^ 20) - 250 + 227 << 9
                                )
                                << 5
                          )
                          << 7
                    )
                    & 65528
                )
                >> 3
              | (
                  (
                        (
                            (
                                  (
                                      ((((var61 & 'ﾀ') >> 7 | var61 << '\t') ^ 84 ^ 63 ^ 20) - 250 + 227 & 65408) >> 7
                                        | (((var61 & 'ﾀ') >> 7 | var61 << '\t') ^ 84 ^ 63 ^ 20) - 250 + 227 << 9
                                    )
                                    & 63488
                                )
                                >> 11
                              | (
                                  ((((var61 & 'ﾀ') >> 7 | var61 << '\t') ^ 84 ^ 63 ^ 20) - 250 + 227 & 65408) >> 7
                                    | (((var61 & 'ﾀ') >> 7 | var61 << '\t') ^ 84 ^ 63 ^ 20) - 250 + 227 << 9
                                )
                                << 5
                          )
                          & 65024
                      )
                      >> 9
                    | (
                        (
                              (
                                  ((((var61 & 'ﾀ') >> 7 | var61 << '\t') ^ 84 ^ 63 ^ 20) - 250 + 227 & 65408) >> 7
                                    | (((var61 & 'ﾀ') >> 7 | var61 << '\t') ^ 84 ^ 63 ^ 20) - 250 + 227 << 9
                                )
                                & 63488
                            )
                            >> 11
                          | (
                              ((((var61 & 'ﾀ') >> 7 | var61 << '\t') ^ 84 ^ 63 ^ 20) - 250 + 227 & 65408) >> 7
                                | (((var61 & 'ﾀ') >> 7 | var61 << '\t') ^ 84 ^ 63 ^ 20) - 250 + 227 << 9
                            )
                            << 5
                      )
                      << 7
                )
                << 13
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), jl.class.getClassLoader()).returnType();
      switch (((var4 + 1611561992 + 1954292704 - 1465685378 ^ 1355064986) + 517064582 + 9735145 ^ 1199506986) + 1338644430 + 421703409 ^ 401116483) {
        case 1236141823:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1412895026:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1538865410:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1974562658:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      cif[((var10 + 1327837769 - 1896354453 ^ 206729093 ^ 529607785) + 1482388601 + 512074324 - 1367423067 - 212764957 ^ 1236436470) + 202257066] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
