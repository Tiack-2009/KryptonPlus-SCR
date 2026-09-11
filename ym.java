// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

public class ym extends lz {
  public String ue;
  // [JNT] MethodHandle dispatch table (removed)
  public ym(gz var1, String var2) {
    super(var1);
    this.ue = var2;
  }

  @Override
  public InputStream cc() {
    InputStream var1 = /* jnt */
    );
    if (var1 != null) {
      return var1;
    } else {
      String var2 = null /* jnt:encrypted */;
      StringBuilder var10000 = (StringBuilder)/* jnt */;
      int var10001 = (-1438827220 << 1766457970 | 0) & 138522606;

      StringBuilder var10002;
      for (var10002 = (StringBuilder)/* jnt */;
        var10001 < (-470743020 << 1330803233 ^ -941486028);
        var10001 += (561210605 - 2056654439 | 1) & 1495269705
      ) {
        int var5 = /* jnt */ - 225;
        int var10005 = (var5 & 65408) >> 7;
        int var6 = (var5 & 65408) >> 7 | var5 << 9;
        int var10 = (((var5 & 65408) >> 7 | var5 << 9) & 65472) >> 6;
        char var7 = (char)((((var10005 | var5 << 9) & 65472) >> 6 | ((var5 & 65408) >> 7 | var5 << 9) << 10) - 208 ^ 69);
        /* jnt */((var10 | var6 << 10) - 208 ^ 69)
        );
      }

      throw (RuntimeException)/* jnt */
              ),
              var2
            ),
            "."
          )
        )
      );
    }
  }

  @Override
  public String toString() {
    String var1 = /* jnt */;
    StringBuilder var10000 = /* jnt *//* jnt */, var1
    );
    int var10001 = -936187279 >> -1679236767 ^ -468093640;

    StringBuilder var10002;
    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((-1253972120 << -1715183341 | 10) & -2144599554);
      var10001 += (-536300000 >> -536300000 | 1) & 95439113
    ) {
      int var4 = /* jnt */ + 'q' - 143;
      int var10005 = (var4 & 65535) >> 0;
      int var5 = (var4 & 65535) >> 0 | var4 << 16;
      int var9 = (((var4 & 65535) >> 0 | var4 << 16) & 57344) >> 13;
      char var6 = (char)((((var10005 | var4 << 16) & 57344) >> 13 | ((var4 & 65535) >> 0 | var4 << 16) << 3) - 26);
      /* jnt */((var9 | var5 << 3) - 26)
      );
    }

    return /* jnt */
      )
    );
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 + 199974426 ^ 1364719264 ^ 1746287727) - 342738223 - 169007136 ^ 1046459113) + 527698182 - 1112598331 - 37865473;
    MethodHandle var10000 = czi[((var10 + 199974426 ^ 1364719264 ^ 1746287727) - 342738223 - 169007136 ^ 1046459113)
      + 527698182
      - 1112598331
      - 37865473
      - 890897375];
    if (czi[var10001 - 890897375] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (-179614762 << 1425094062 - -1467404032 | 0) & 218781772;
        var23 < var13.length();
        var23 += 1919819723 >>> (-75551608 >>> -75551608) ^ 468704
      ) {
        char var42 = var13.charAt(var23);
        char var43 = (char)(((((var42 & '\ufff0') >> 4 | var42 << '\f') ^ 133) + 21 + 59 - 248 ^ 84 ^ 96 ^ 1) - 225 ^ 198);
        var13.setCharAt(var23, (char)(((((var42 & '\ufff0') >> 4 | var42 << '\f') ^ 133) + 21 + 59 - 248 ^ 84 ^ 96 ^ 1) - 225 ^ 198));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (-1198182200 & -1126139818 | 0) & 1146603652;
        var29 < var16.length();
        var29 += (1226384138 ^ -834139217 >>> -792987041 | 0) & -2138814239
      ) {
        int var48 = var16.charAt(var29);
        int var75 = (var48 & 64512) >> 10;
        int var49 = ((var48 & 64512) >> 10 | var48 << 6) ^ 183;
        int var76 = ((((var48 & 64512) >> 10 | var48 << 6) ^ 183) & 65535) >> 0;
        var48 = (((((var75 | var48 << 6) ^ 183) & 65535) >> 0 | (((var48 & 64512) >> 10 | var48 << 6) ^ 183) << 16) - 180 ^ 98) - 205 - 141;
        var75 = (((var76 | var49 << 16) - 180 ^ 98) - 205 - 141 & 65408) >> 7;
        int var51 = (((var76 | var49 << 16) - 180 ^ 98) - 205 - 141 & 65408) >> 7 | var48 << 9;
        int var78 = (((((var76 | var49 << 16) - 180 ^ 98) - 205 - 141 & 65408) >> 7 | var48 << 9) & 32768) >> 15;
        char var52 = (char)((((var75 | var48 << 9) & 32768) >> 15 | ((((var76 | var49 << 16) - 180 ^ 98) - 205 - 141 & 65408) >> 7 | var48 << 9) << 1) + 160);
        var16.setCharAt(var29, (char)((var78 | var51 << 1) + 160));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), ym.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = 824165819 - -1812261023 ^ -1658540454; var35 < var19.length(); var35 += 301186675 << 35624212 ^ -416284671) {
        int var57 = (var19.charAt(var35) ^ 218) - 109 + 20 + 165 ^ 224;
        int var79 = (var57 & 63488) >> 11;
        int var58 = ((var57 & 63488) >> 11 | var57 << 5) - 139 + 211 ^ 179;
        int var80 = ((((var57 & 63488) >> 11 | var57 << 5) - 139 + 211 ^ 179) & 65532) >> 2;
        char var59 = (char)((((var79 | var57 << 5) - 139 + 211 ^ 179) & 65532) >> 2 | (((var57 & 63488) >> 11 | var57 << 5) - 139 + 211 ^ 179) << 14);
        var19.setCharAt(var35, (char)(var80 | var58 << 14));
      }

      Class var7 = Class.forName(var19.toString(), false, ym.class.getClassLoader());
      switch ((((var4 ^ 1632727250) + 1263453198 + 553051297 - 1488825487 - 1156826049 ^ 115750581) + 1602380100 ^ 1470500440 ^ 1899003158) + 2057140230) {
        case 57547410:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 208486866:
        case 1582990303:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1287444189:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 1385076959:
          var10000 = var0.findSpecial(var7, var5, var6, ym.class);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    czi[((var10 + 199974426 ^ 1364719264 ^ 1746287727) - 342738223 - 169007136 ^ 1046459113) + 527698182 - 1112598331 - 37865473 - 890897375] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (((var10 ^ 2090003977) - 1573604783 ^ 83247646 ^ 224672250 ^ 178194995 ^ 603377) + 303678906 ^ 491776498) - 108735891;
    MethodHandle var10000 = czi[(((var10 ^ 2090003977) - 1573604783 ^ 83247646 ^ 224672250 ^ 178194995 ^ 603377) + 303678906 ^ 491776498)
      - 108735891
      - 255116611];
    if (czi[var10001 - 255116611] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = 86115736 + (-1317737993 >> 1621529082) ^ 86115716; var24 < var14.length(); var24 += 980762428 << -704070549 ^ -1443241983) {
        int var43 = var14.charAt(var24) + 234;
        int var10004 = (var43 & 61440) >> 12;
        int var44 = (var43 & 61440) >> 12 | var43 << 4;
        int var88 = (((var43 & 61440) >> 12 | var43 << 4) & 32768) >> 15;
        var43 = ((var10004 | var43 << 4) & 32768) >> 15 | ((var43 & 61440) >> 12 | var43 << 4) << 1;
        var10004 = ((var88 | var44 << 1) & 57344) >> 13;
        int var46 = (((var88 | var44 << 1) & 57344) >> 13 | var43 << 3) - 134 + 140 ^ 197 ^ 97 ^ 79;
        int var90 = (((((var88 | var44 << 1) & 57344) >> 13 | var43 << 3) - 134 + 140 ^ 197 ^ 97 ^ 79) & 63488) >> 11;
        char var47 = (char)(
          (((var10004 | var43 << 3) - 134 + 140 ^ 197 ^ 97 ^ 79) & 63488) >> 11
            | ((((var88 | var44 << 1) & 57344) >> 13 | var43 << 3) - 134 + 140 ^ 197 ^ 97 ^ 79) << 5
        );
        var14.setCharAt(var24, (char)(var90 | var46 << 5));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (896651257 >> -1717990372 | 0) & -10654120; var30 < var17.length(); var30 += (-1509535895 ^ -312286853 | 1) & 528513) {
        int var52 = var17.charAt(var30);
        int var91 = (var52 & 57344) >> 13;
        int var53 = (var52 & 57344) >> 13 | var52 << 3;
        int var92 = (((var52 & 57344) >> 13 | var52 << 3) & 0) >> 16;
        var52 = (((var91 | var52 << 3) & 0) >> 16 | ((var52 & 57344) >> 13 | var52 << 3) << 0) + 56 - 76 ^ 179;
        var91 = (((var92 | var53 << 0) + 56 - 76 ^ 179) & 65024) >> 9;
        int var55 = ((((var92 | var53 << 0) + 56 - 76 ^ 179) & 65024) >> 9 | var52 << 7) ^ 237;
        int var94 = ((((((var92 | var53 << 0) + 56 - 76 ^ 179) & 65024) >> 9 | var52 << 7) ^ 237) & 57344) >> 13;
        char var56 = (char)(
          (((((var91 | var52 << 7) ^ 237) & 57344) >> 13 | (((((var92 | var53 << 0) + 56 - 76 ^ 179) & 65024) >> 9 | var52 << 7) ^ 237) << 3) ^ 72) - 185
        );
        var17.setCharAt(var30, (char)(((var94 | var55 << 3) ^ 72) - 185));
      }

      Class var6 = Class.forName(var17.toString(), false, ym.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (-1718753587 >> -1179816745 | 0) & 76; var36 < var20.length(); var36 += -1342053381 * -1860006871 * -1780813152 ^ -1086802463) {
        int var61 = var20.charAt(var36) ^ 'z';
        char var66 = (char)(
          (
              (
                    (
                          (
                                (
                                    (((((var61 & 65408) >> 7 | var61 << 9) + 148 & 57344) >> 13 | ((var61 & 65408) >> 7 | var61 << 9) + 148 << 3) & 32768)
                                        >> 15
                                      | ((((var61 & 65408) >> 7 | var61 << 9) + 148 & 57344) >> 13 | ((var61 & 65408) >> 7 | var61 << 9) + 148 << 3) << 1
                                  )
                                  & 65535
                              )
                              >> 0
                            | (
                                (((((var61 & 65408) >> 7 | var61 << 9) + 148 & 57344) >> 13 | ((var61 & 65408) >> 7 | var61 << 9) + 148 << 3) & 32768) >> 15
                                  | ((((var61 & 65408) >> 7 | var61 << 9) + 148 & 57344) >> 13 | ((var61 & 65408) >> 7 | var61 << 9) + 148 << 3) << 1
                              )
                              << 16
                        )
                        + 226
                      & 65532
                  )
                  >> 2
                | (
                      (
                            (
                                (((((var61 & 65408) >> 7 | var61 << 9) + 148 & 57344) >> 13 | ((var61 & 65408) >> 7 | var61 << 9) + 148 << 3) & 32768) >> 15
                                  | ((((var61 & 65408) >> 7 | var61 << 9) + 148 & 57344) >> 13 | ((var61 & 65408) >> 7 | var61 << 9) + 148 << 3) << 1
                              )
                              & 65535
                          )
                          >> 0
                        | (
                            (((((var61 & 65408) >> 7 | var61 << 9) + 148 & 57344) >> 13 | ((var61 & 65408) >> 7 | var61 << 9) + 148 << 3) & 32768) >> 15
                              | ((((var61 & 65408) >> 7 | var61 << 9) + 148 & 57344) >> 13 | ((var61 & 65408) >> 7 | var61 << 9) + 148 << 3) << 1
                          )
                          << 16
                    )
                    + 226
                  << 14
            )
            + 83
            + 94
        );
        var20.setCharAt(
          var36,
          (char)(
            (
                (
                      (
                            (
                                  (
                                      (((((var61 & 65408) >> 7 | var61 << 9) + 148 & 57344) >> 13 | ((var61 & 65408) >> 7 | var61 << 9) + 148 << 3) & 32768)
                                          >> 15
                                        | ((((var61 & 65408) >> 7 | var61 << 9) + 148 & 57344) >> 13 | ((var61 & 65408) >> 7 | var61 << 9) + 148 << 3) << 1
                                    )
                                    & 65535
                                )
                                >> 0
                              | (
                                  (((((var61 & 65408) >> 7 | var61 << 9) + 148 & 57344) >> 13 | ((var61 & 65408) >> 7 | var61 << 9) + 148 << 3) & 32768) >> 15
                                    | ((((var61 & 65408) >> 7 | var61 << 9) + 148 & 57344) >> 13 | ((var61 & 65408) >> 7 | var61 << 9) + 148 << 3) << 1
                                )
                                << 16
                          )
                          + 226
                        & 65532
                    )
                    >> 2
                  | (
                        (
                              (
                                  (((((var61 & 65408) >> 7 | var61 << 9) + 148 & 57344) >> 13 | ((var61 & 65408) >> 7 | var61 << 9) + 148 << 3) & 32768) >> 15
                                    | ((((var61 & 65408) >> 7 | var61 << 9) + 148 & 57344) >> 13 | ((var61 & 65408) >> 7 | var61 << 9) + 148 << 3) << 1
                                )
                                & 65535
                            )
                            >> 0
                          | (
                              (((((var61 & 65408) >> 7 | var61 << 9) + 148 & 57344) >> 13 | ((var61 & 65408) >> 7 | var61 << 9) + 148 << 3) & 32768) >> 15
                                | ((((var61 & 65408) >> 7 | var61 << 9) + 148 & 57344) >> 13 | ((var61 & 65408) >> 7 | var61 << 9) + 148 << 3) << 1
                            )
                            << 16
                      )
                      + 226
                    << 14
              )
              + 83
              + 94
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), ym.class.getClassLoader()).returnType();
      switch ((var4 + 273421667 - 264695990 - 2013270678 - 1110637745 - 139538392 ^ 1026253573) + 1297753400 - 916748458 - 1736340514 - 2104119196) {
        case 61393319:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 866746878:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1959644259:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 2059892977:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      czi[(((var10 ^ 2090003977) - 1573604783 ^ 83247646 ^ 224672250 ^ 178194995 ^ 603377) + 303678906 ^ 491776498) - 108735891 - 255116611] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
