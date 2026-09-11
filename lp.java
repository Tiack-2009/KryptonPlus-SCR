// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import dev.krypton.jnt3.Loader;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

public enum lp {
  vbr,
  gp;
  // [JNT] MethodHandle dispatch table (removed)
  // $VF: Failed to inline enum fields
  // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
  static {
    Loader.init(lp.class);
    int var10000 = 813201892 * -1040678344 ^ -1054838304;

    StringBuilder var10001;
    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < (-1564804943 + (1701903341 ^ -1310196741) ^ 2001860803);
      var10000 += (-952199030 - -232235680 | 1) & 146883793
    ) {
      /* jnt */(/* jnt */ + '6' + 143 + 16 + 73 ^ 252)
      );
    }

    vbr = (lp)/* jnt */, 0
    );
    var10000 = (1840119877 >>> 1840119877 | 0) & 1409322969;

    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < (312314032 & -329184831 ^ 67717);
      var10000 += 291897850 >>> -988270829 ^ 557
    ) {
      char var8 = /* jnt */;
      char var11 = (char)(
        (
            (((((var8 & 'ﰀ') >> 10 | var8 << 6) & 65534) >> 1 | ((var8 & 'ﰀ') >> 10 | var8 << 6) << 15) + 193 & 65024) >> 9
              | ((((var8 & 'ﰀ') >> 10 | var8 << 6) & 65534) >> 1 | ((var8 & 'ﰀ') >> 10 | var8 << 6) << 15) + 193 << 7
          )
          - 26
      );
      /* jnt */(
          (
              (((((var8 & 'ﰀ') >> 10 | var8 << 6) & 65534) >> 1 | ((var8 & 'ﰀ') >> 10 | var8 << 6) << 15) + 193 & 65024) >> 9
                | ((((var8 & 'ﰀ') >> 10 | var8 << 6) & 65534) >> 1 | ((var8 & 'ﰀ') >> 10 | var8 << 6) << 15) + 193 << 7
            )
            - 26
        )
      );
    }

    gp = (lp)/* jnt */, 1
    );
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 - 178245648 ^ 482711982) + 1807813878 - 758064341 ^ 108471066 ^ 1522508905) + 1300298293 - 2107949008 ^ 770872913;
    MethodHandle var10000 = bffs[(((var10 - 178245648 ^ 482711982) + 1807813878 - 758064341 ^ 108471066 ^ 1522508905) + 1300298293 - 2107949008 ^ 770872913)
      + 2011607857];
    if (bffs[var10001 + 2011607857] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (-1554304243 * -1554304243 | 0) & 67342672; var23 < var13.length(); var23 += (1524691309 | 1524691309 ^ 241981962 | 1) & 16974977) {
        int var42 = var13.charAt(var23) - 26 + 189 - 176 ^ 128;
        char var45 = (char)(
          (((((var42 & 65534) >> 1 | var42 << 15) - 254 & 65534) >> 1 | ((var42 & 65534) >> 1 | var42 << 15) - 254 << 15) + 69 - 158 & 65534) >> 1
            | ((((var42 & 65534) >> 1 | var42 << 15) - 254 & 65534) >> 1 | ((var42 & 65534) >> 1 | var42 << 15) - 254 << 15) + 69 - 158 << 15
        );
        var13.setCharAt(
          var23,
          (char)(
            (((((var42 & 65534) >> 1 | var42 << 15) - 254 & 65534) >> 1 | ((var42 & 65534) >> 1 | var42 << 15) - 254 << 15) + 69 - 158 & 65534) >> 1
              | ((((var42 & 65534) >> 1 | var42 << 15) - 254 & 65534) >> 1 | ((var42 & 65534) >> 1 | var42 << 15) - 254 << 15) + 69 - 158 << 15
          )
        );
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = 491500039 + 1170151675 ^ 1661651714; var29 < var16.length(); var29 += 952048809 >> (952048809 << -1957171850) ^ 952048808) {
        int var50 = var16.charAt(var29) ^ 'P';
        char var55 = (char)(
          (
              (
                    (
                        (
                              (
                                  ((((((var50 & 63488) >> 11 | var50 << 5) & 65534) >> 1 | ((var50 & 63488) >> 11 | var50 << 5) << 15) ^ 244 ^ 132) & 65534)
                                      >> 1
                                    | (((((var50 & 63488) >> 11 | var50 << 5) & 65534) >> 1 | ((var50 & 63488) >> 11 | var50 << 5) << 15) ^ 244 ^ 132) << 15
                                )
                                & 65528
                            )
                            >> 3
                          | (
                              ((((((var50 & 63488) >> 11 | var50 << 5) & 65534) >> 1 | ((var50 & 63488) >> 11 | var50 << 5) << 15) ^ 244 ^ 132) & 65534) >> 1
                                | (((((var50 & 63488) >> 11 | var50 << 5) & 65534) >> 1 | ((var50 & 63488) >> 11 | var50 << 5) << 15) ^ 244 ^ 132) << 15
                            )
                            << 13
                      )
                      & 0
                  )
                  >> 16
                | (
                    (
                          (
                              ((((((var50 & 63488) >> 11 | var50 << 5) & 65534) >> 1 | ((var50 & 63488) >> 11 | var50 << 5) << 15) ^ 244 ^ 132) & 65534) >> 1
                                | (((((var50 & 63488) >> 11 | var50 << 5) & 65534) >> 1 | ((var50 & 63488) >> 11 | var50 << 5) << 15) ^ 244 ^ 132) << 15
                            )
                            & 65528
                        )
                        >> 3
                      | (
                          ((((((var50 & 63488) >> 11 | var50 << 5) & 65534) >> 1 | ((var50 & 63488) >> 11 | var50 << 5) << 15) ^ 244 ^ 132) & 65534) >> 1
                            | (((((var50 & 63488) >> 11 | var50 << 5) & 65534) >> 1 | ((var50 & 63488) >> 11 | var50 << 5) << 15) ^ 244 ^ 132) << 15
                        )
                        << 13
                  )
                  << 0
            )
            + 182
            + 45
        );
        var16.setCharAt(
          var29,
          (char)(
            (
                (
                      (
                          (
                                (
                                    ((((((var50 & 63488) >> 11 | var50 << 5) & 65534) >> 1 | ((var50 & 63488) >> 11 | var50 << 5) << 15) ^ 244 ^ 132) & 65534)
                                        >> 1
                                      | (((((var50 & 63488) >> 11 | var50 << 5) & 65534) >> 1 | ((var50 & 63488) >> 11 | var50 << 5) << 15) ^ 244 ^ 132) << 15
                                  )
                                  & 65528
                              )
                              >> 3
                            | (
                                ((((((var50 & 63488) >> 11 | var50 << 5) & 65534) >> 1 | ((var50 & 63488) >> 11 | var50 << 5) << 15) ^ 244 ^ 132) & 65534) >> 1
                                  | (((((var50 & 63488) >> 11 | var50 << 5) & 65534) >> 1 | ((var50 & 63488) >> 11 | var50 << 5) << 15) ^ 244 ^ 132) << 15
                              )
                              << 13
                        )
                        & 0
                    )
                    >> 16
                  | (
                      (
                            (
                                ((((((var50 & 63488) >> 11 | var50 << 5) & 65534) >> 1 | ((var50 & 63488) >> 11 | var50 << 5) << 15) ^ 244 ^ 132) & 65534) >> 1
                                  | (((((var50 & 63488) >> 11 | var50 << 5) & 65534) >> 1 | ((var50 & 63488) >> 11 | var50 << 5) << 15) ^ 244 ^ 132) << 15
                              )
                              & 65528
                          )
                          >> 3
                        | (
                            ((((((var50 & 63488) >> 11 | var50 << 5) & 65534) >> 1 | ((var50 & 63488) >> 11 | var50 << 5) << 15) ^ 244 ^ 132) & 65534) >> 1
                              | (((((var50 & 63488) >> 11 | var50 << 5) & 65534) >> 1 | ((var50 & 63488) >> 11 | var50 << 5) << 15) ^ 244 ^ 132) << 15
                          )
                          << 13
                    )
                    << 0
              )
              + 182
              + 45
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), lp.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (867686835 << -1863947752 | 0) & 203225533; var35 < var19.length(); var35 += -140073726 + 1496381395 * -346283999 ^ 1455748916) {
        int var60 = var19.charAt(var35) - 220 - 165 + 213 + 25;
        int var92 = (var60 & 65472) >> 6;
        int var61 = ((var60 & 65472) >> 6 | var60 << 10) ^ 15;
        int var93 = ((((var60 & 65472) >> 6 | var60 << 10) ^ 15) & 65534) >> 1;
        var60 = (((var92 | var60 << 10) ^ 15) & 65534) >> 1 | (((var60 & 65472) >> 6 | var60 << 10) ^ 15) << 15;
        var92 = ((var93 | var61 << 15) & 61440) >> 12;
        int var63 = (((var93 | var61 << 15) & 61440) >> 12 | var60 << 4) ^ 76;
        int var95 = (((((var93 | var61 << 15) & 61440) >> 12 | var60 << 4) ^ 76) & 64512) >> 10;
        char var64 = (char)((((var92 | var60 << 4) ^ 76) & 64512) >> 10 | ((((var93 | var61 << 15) & 61440) >> 12 | var60 << 4) ^ 76) << 6);
        var19.setCharAt(var35, (char)(var95 | var63 << 6));
      }

      Class var7 = Class.forName(var19.toString(), false, lp.class.getClassLoader());
      switch (((var4 - 1481429366 + 508303642 + 49594067 ^ 1990300939) + 1615507842 + 1740883469 ^ 929771528) - 1433777745 ^ 695944443 ^ 418606888) {
        case 164179201:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 167252350:
        case 634752685:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1397478724:
          var10000 = var0.findSpecial(var7, var5, var6, lp.class);
          break;
        case 1521232099:
          var10000 = var0.findConstructor(var7, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    bffs[(((var10 - 178245648 ^ 482711982) + 1807813878 - 758064341 ^ 108471066 ^ 1522508905) + 1300298293 - 2107949008 ^ 770872913) + 2011607857] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 - 1421971369 ^ 1013704225) + 356110677 - 1385298274 - 237403506 - 66761540 ^ 892347455 ^ 353525990) + 983773502;
    MethodHandle var10000 = bffs[((var10 - 1421971369 ^ 1013704225) + 356110677 - 1385298274 - 237403506 - 66761540 ^ 892347455 ^ 353525990)
      + 983773502
      - 438160441];
    if (bffs[var10001 - 438160441] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = 1887091163 >> 456426257 ^ 14397; var24 < var14.length(); var24 += (-345785385 + 653899921 | 1) & 150997121) {
        int var43 = var14.charAt(var24) ^ 204;
        char var48 = (char)(
          (
              (
                    (
                        (
                            (
                                  (
                                      (((((var43 & 65532) >> 2 | var43 << 14) - 185 & 49152) >> 14 | ((var43 & 65532) >> 2 | var43 << 14) - 185 << 2) & 49152)
                                          >> 14
                                        | ((((var43 & 65532) >> 2 | var43 << 14) - 185 & 49152) >> 14 | ((var43 & 65532) >> 2 | var43 << 14) - 185 << 2) << 2
                                    )
                                    & 65504
                                )
                                >> 5
                              | (
                                  (((((var43 & 65532) >> 2 | var43 << 14) - 185 & 49152) >> 14 | ((var43 & 65532) >> 2 | var43 << 14) - 185 << 2) & 49152)
                                      >> 14
                                    | ((((var43 & 65532) >> 2 | var43 << 14) - 185 & 49152) >> 14 | ((var43 & 65532) >> 2 | var43 << 14) - 185 << 2) << 2
                                )
                                << 11
                          )
                          ^ 45
                      )
                      & 65504
                  )
                  >> 5
                | (
                    (
                        (
                              (
                                  (((((var43 & 65532) >> 2 | var43 << 14) - 185 & 49152) >> 14 | ((var43 & 65532) >> 2 | var43 << 14) - 185 << 2) & 49152)
                                      >> 14
                                    | ((((var43 & 65532) >> 2 | var43 << 14) - 185 & 49152) >> 14 | ((var43 & 65532) >> 2 | var43 << 14) - 185 << 2) << 2
                                )
                                & 65504
                            )
                            >> 5
                          | (
                              (((((var43 & 65532) >> 2 | var43 << 14) - 185 & 49152) >> 14 | ((var43 & 65532) >> 2 | var43 << 14) - 185 << 2) & 49152) >> 14
                                | ((((var43 & 65532) >> 2 | var43 << 14) - 185 & 49152) >> 14 | ((var43 & 65532) >> 2 | var43 << 14) - 185 << 2) << 2
                            )
                            << 11
                      )
                      ^ 45
                  )
                  << 11
            )
            + 142
            - 221
        );
        var14.setCharAt(
          var24,
          (char)(
            (
                (
                      (
                          (
                              (
                                    (
                                        (((((var43 & 65532) >> 2 | var43 << 14) - 185 & 49152) >> 14 | ((var43 & 65532) >> 2 | var43 << 14) - 185 << 2) & 49152)
                                            >> 14
                                          | ((((var43 & 65532) >> 2 | var43 << 14) - 185 & 49152) >> 14 | ((var43 & 65532) >> 2 | var43 << 14) - 185 << 2) << 2
                                      )
                                      & 65504
                                  )
                                  >> 5
                                | (
                                    (((((var43 & 65532) >> 2 | var43 << 14) - 185 & 49152) >> 14 | ((var43 & 65532) >> 2 | var43 << 14) - 185 << 2) & 49152)
                                        >> 14
                                      | ((((var43 & 65532) >> 2 | var43 << 14) - 185 & 49152) >> 14 | ((var43 & 65532) >> 2 | var43 << 14) - 185 << 2) << 2
                                  )
                                  << 11
                            )
                            ^ 45
                        )
                        & 65504
                    )
                    >> 5
                  | (
                      (
                          (
                                (
                                    (((((var43 & 65532) >> 2 | var43 << 14) - 185 & 49152) >> 14 | ((var43 & 65532) >> 2 | var43 << 14) - 185 << 2) & 49152)
                                        >> 14
                                      | ((((var43 & 65532) >> 2 | var43 << 14) - 185 & 49152) >> 14 | ((var43 & 65532) >> 2 | var43 << 14) - 185 << 2) << 2
                                  )
                                  & 65504
                              )
                              >> 5
                            | (
                                (((((var43 & 65532) >> 2 | var43 << 14) - 185 & 49152) >> 14 | ((var43 & 65532) >> 2 | var43 << 14) - 185 << 2) & 49152) >> 14
                                  | ((((var43 & 65532) >> 2 | var43 << 14) - 185 & 49152) >> 14 | ((var43 & 65532) >> 2 | var43 << 14) - 185 << 2) << 2
                              )
                              << 11
                        )
                        ^ 45
                    )
                    << 11
              )
              + 142
              - 221
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (-332348128 + (-332348128 | -332348128) | 0) & 637562901; var30 < var17.length(); var30 += (1052401407 - 2043163003 | 1) & 17416777) {
        int var53 = var17.charAt(var30) + 216;
        int var90 = (var53 & 65520) >> 4;
        int var54 = (var53 & 65520) >> 4 | var53 << 12;
        int var91 = (((var53 & 65520) >> 4 | var53 << 12) & 65528) >> 3;
        var53 = (((var90 | var53 << 12) & 65528) >> 3 | ((var53 & 65520) >> 4 | var53 << 12) << 13) - 26 + 60 + 7 ^ 79;
        var90 = (((var91 | var54 << 13) - 26 + 60 + 7 ^ 79) & 65408) >> 7;
        int var56 = (((var91 | var54 << 13) - 26 + 60 + 7 ^ 79) & 65408) >> 7 | var53 << 9;
        int var93 = (((((var91 | var54 << 13) - 26 + 60 + 7 ^ 79) & 65408) >> 7 | var53 << 9) & 65528) >> 3;
        char var57 = (char)((((var90 | var53 << 9) & 65528) >> 3 | ((((var91 | var54 << 13) - 26 + 60 + 7 ^ 79) & 65408) >> 7 | var53 << 9) << 13) + 150);
        var17.setCharAt(var30, (char)((var93 | var56 << 13) + 150));
      }

      Class var6 = Class.forName(var17.toString(), false, lp.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = 1921572240 + 1921572240 ^ -451822816; var36 < var20.length(); var36 += (-508296678 | 327608636 | 1) & 138478593) {
        char var62 = var20.charAt(var36);
        char var65 = (char)(
          (
                (
                      (
                            ((((var62 & 'ﾀ') >> 7 | var62 << '\t') + 110 + 128 ^ 193) + 29 & 65472) >> 6
                              | (((var62 & 'ﾀ') >> 7 | var62 << '\t') + 110 + 128 ^ 193) + 29 << 10
                          )
                          - 203
                        ^ 231
                    )
                    - 143
                  & 65472
              )
              >> 6
            | (
                  (
                        ((((var62 & 'ﾀ') >> 7 | var62 << '\t') + 110 + 128 ^ 193) + 29 & 65472) >> 6
                          | (((var62 & 'ﾀ') >> 7 | var62 << '\t') + 110 + 128 ^ 193) + 29 << 10
                      )
                      - 203
                    ^ 231
                )
                - 143
              << 10
        );
        var20.setCharAt(
          var36,
          (char)(
            (
                  (
                        (
                              ((((var62 & 'ﾀ') >> 7 | var62 << '\t') + 110 + 128 ^ 193) + 29 & 65472) >> 6
                                | (((var62 & 'ﾀ') >> 7 | var62 << '\t') + 110 + 128 ^ 193) + 29 << 10
                            )
                            - 203
                          ^ 231
                      )
                      - 143
                    & 65472
                )
                >> 6
              | (
                    (
                          ((((var62 & 'ﾀ') >> 7 | var62 << '\t') + 110 + 128 ^ 193) + 29 & 65472) >> 6
                            | (((var62 & 'ﾀ') >> 7 | var62 << '\t') + 110 + 128 ^ 193) + 29 << 10
                        )
                        - 203
                      ^ 231
                  )
                  - 143
                << 10
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), lp.class.getClassLoader()).returnType();
      switch (var4 - 1182517604 + 559980098 - 1436011995 - 348207565 - 1213698587 + 290603801 + 1170612342 - 1067082534 - 1650454245 + 917976864) {
        case 147897506:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1399242686:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1704952664:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1869804047:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      bffs[((var10 - 1421971369 ^ 1013704225) + 356110677 - 1385298274 - 237403506 - 66761540 ^ 892347455 ^ 353525990) + 983773502 - 438160441] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }

  public static native void guard();
}
