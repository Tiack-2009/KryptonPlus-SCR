// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.Identifier;
import net.minecraft.DrawContext;

public class eyf extends vwz {
  public f vhf;
  public zn mp = (zn)/* jnt */;
  public zn yp = (zn)/* jnt */;
  public float il = 0.25F;
  public float hvj = 0.0F;
  public zn pb;
  // [JNT] MethodHandle dispatch table (removed)
  public eyf(fs var1, wus var2, int var3) {
    super(var1, var2, var3);
    this.vhf = (f)var2;
  }
  @Override
  public void po() {
    int var3 = 1454606653;
    zn var1 = /* jnt */
        ),
        this
      )
    );
    if (null /* jnt:encrypted */ == null) {
      null /* jnt:encrypted *//* jnt */,
          /* jnt */,
          /* jnt */,
          0
        )
      );
      var3 = (1618172232 | 1079131207 | -1925172400) & -1619217456;
    } else {
      var3 = -974124483 << 672897309 ^ -162701928;
    }

    while (true) {
      switch (((var3 ^ 983580679 ^ 827536032 ^ 1045835600) - 2002952500 ^ 2099614879) + 1172305857) {
        case -2110303827:
          short var2 = 255;
          if (/* jnt */) != var2) {
            null /* jnt:encrypted */
            );
          }

          /* jnt */;
          return;
        case -679427227:
        default:
          null /* jnt:encrypted *//* jnt */,
              /* jnt */,
              /* jnt */,
              /* jnt */)
            )
          );
      }

      var3 = (1618172232 | 1079131207 | -1925172400) & -1619217456;
    }
  }

  @Override
  public void h(class_332 var1, int var2, int var3, float var4) {
    /* jnt */;
    /* jnt */;
    if (!null /* jnt:encrypted */)
    )) {
      zn var5 = (zn)/* jnt */),
        /* jnt */),
        /* jnt */),
        (int)(
          (float)/* jnt */)
            * null /* jnt:encrypted */
        )
      );
      /* jnt */,
        /* jnt */
          + /* jnt */
          + null /* jnt:encrypted */,
        /* jnt */ + /* jnt */,
        /* jnt */
          + /* jnt */
          + null /* jnt:encrypted */
          + /* jnt */,
        /* jnt */
      );
    }

    int var12 = /* jnt */ + 5;
    int var6 = /* jnt */
      + /* jnt */
      + null /* jnt:encrypted */
      + /* jnt */ / 2;
    int var7 = var6 - 4;
    /* jnt */),
      var1,
      var12,
      var7,
      /* jnt */)
    );
    zn var8 = /* jnt */);
    byte var9 = 16;
    int var10 = /* jnt */ + /* jnt */ - var9 - 8;
    int var11 = var6 - var9 / 2;
    /* jnt *//* jnt */,
      (double)(var10 - 1),
      (double)(var11 - 1),
      (double)(var10 + var9 + 1),
      (double)(var11 + var9 + 1),
      3.0,
      3.0,
      3.0,
      3.0
    );
    /* jnt *//* jnt */,
        null /* jnt:encrypted */,
        null /* jnt:encrypted */
      ),
      (double)var10,
      (double)var11,
      (double)(var10 + var9),
      (double)(var11 + var9),
      2.0,
      2.0,
      2.0,
      2.0
    );
  }

  public void at(int var1, int var2, float var3) {
    float var4 = var3 * 0.05F;
    float var5 = /* jnt */var1, (double)var2)
        && !null /* jnt:encrypted */
          )
        )
      ? 1.0F
      : 0.0F;
    null /* jnt:encrypted *//* jnt */null /* jnt:encrypted */, (double)var5, 0.25, (double)var4
      )
    );
  }

  @Override
  public void iu(class_11909 var1, boolean var2) {
    if (/* jnt */,
        /* jnt */
      )
      && /* jnt */ == 0) {
      /* jnt */,
        (dpw)/* jnt */)
      );
    }

    /* jnt */;
  }

  @Override
  public void fr() {
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    /* jnt */;
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (var10 ^ 1785909959) - 1395620119 + 551288102 + 1361464451 - 788630556 + 2027700923 - 757766180 - 568882515 ^ 2020189626;
    MethodHandle var10000 = ziu[((var10 ^ 1785909959) - 1395620119 + 551288102 + 1361464451 - 788630556 + 2027700923 - 757766180 - 568882515 ^ 2020189626)
      + 486745465];
    if (ziu[var10001 + 486745465] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = -1248259305 ^ -1136939165 ^ 161660020; var23 < var13.length(); var23 += (-1647093634 & -1647093634 | 1) & 1108083585) {
        int var42 = var13.charAt(var23) + '?';
        int var10004 = (var42 & 65532) >> 2;
        int var43 = (var42 & 65532) >> 2 | var42 << 14;
        int var89 = (((var42 & 65532) >> 2 | var42 << 14) & 65408) >> 7;
        var42 = (((var10004 | var42 << 14) & 65408) >> 7 | ((var42 & 65532) >> 2 | var42 << 14) << 9) + 108;
        var10004 = ((var89 | var43 << 9) + 108 & 0) >> 16;
        int var45 = (((var89 | var43 << 9) + 108 & 0) >> 16 | var42 << 0) ^ 246;
        int var91 = (((((var89 | var43 << 9) + 108 & 0) >> 16 | var42 << 0) ^ 246) & 65535) >> 0;
        char var46 = (char)(
          (((((var10004 | var42 << 0) ^ 246) & 65535) >> 0 | ((((var89 | var43 << 9) + 108 & 0) >> 16 | var42 << 0) ^ 246) << 16) ^ 107) + 86 - 203
        );
        var13.setCharAt(var23, (char)(((var91 | var45 << 16) ^ 107) + 86 - 203));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (-1978845496 ^ 1876861757 | 0) & 33563144; var29 < var16.length(); var29 += (-716381575 * (584947109 & -716381575) | 1) & 1118045703) {
        int var51 = var16.charAt(var29) ^ 17;
        char var56 = (char)(
          (
              (
                    (
                        (
                            (
                                  (
                                      (
                                            (((((var51 & 32768) >> 15 | var51 << 1) & 32768) >> 15 | ((var51 & 32768) >> 15 | var51 << 1) << 1) & 65472) >> 6
                                              | ((((var51 & 32768) >> 15 | var51 << 1) & 32768) >> 15 | ((var51 & 32768) >> 15 | var51 << 1) << 1) << 10
                                          )
                                          - 129
                                        ^ 68
                                    )
                                    & 65472
                                )
                                >> 6
                              | (
                                  (
                                        (((((var51 & 32768) >> 15 | var51 << 1) & 32768) >> 15 | ((var51 & 32768) >> 15 | var51 << 1) << 1) & 65472) >> 6
                                          | ((((var51 & 32768) >> 15 | var51 << 1) & 32768) >> 15 | ((var51 & 32768) >> 15 | var51 << 1) << 1) << 10
                                      )
                                      - 129
                                    ^ 68
                                )
                                << 10
                          )
                          ^ 15
                      )
                      & 32768
                  )
                  >> 15
                | (
                    (
                        (
                              (
                                  (
                                        (((((var51 & 32768) >> 15 | var51 << 1) & 32768) >> 15 | ((var51 & 32768) >> 15 | var51 << 1) << 1) & 65472) >> 6
                                          | ((((var51 & 32768) >> 15 | var51 << 1) & 32768) >> 15 | ((var51 & 32768) >> 15 | var51 << 1) << 1) << 10
                                      )
                                      - 129
                                    ^ 68
                                )
                                & 65472
                            )
                            >> 6
                          | (
                              (
                                    (((((var51 & 32768) >> 15 | var51 << 1) & 32768) >> 15 | ((var51 & 32768) >> 15 | var51 << 1) << 1) & 65472) >> 6
                                      | ((((var51 & 32768) >> 15 | var51 << 1) & 32768) >> 15 | ((var51 & 32768) >> 15 | var51 << 1) << 1) << 10
                                  )
                                  - 129
                                ^ 68
                            )
                            << 10
                      )
                      ^ 15
                  )
                  << 1
            )
            - 44
        );
        var16.setCharAt(
          var29,
          (char)(
            (
                (
                      (
                          (
                              (
                                    (
                                        (
                                              (((((var51 & 32768) >> 15 | var51 << 1) & 32768) >> 15 | ((var51 & 32768) >> 15 | var51 << 1) << 1) & 65472) >> 6
                                                | ((((var51 & 32768) >> 15 | var51 << 1) & 32768) >> 15 | ((var51 & 32768) >> 15 | var51 << 1) << 1) << 10
                                            )
                                            - 129
                                          ^ 68
                                      )
                                      & 65472
                                  )
                                  >> 6
                                | (
                                    (
                                          (((((var51 & 32768) >> 15 | var51 << 1) & 32768) >> 15 | ((var51 & 32768) >> 15 | var51 << 1) << 1) & 65472) >> 6
                                            | ((((var51 & 32768) >> 15 | var51 << 1) & 32768) >> 15 | ((var51 & 32768) >> 15 | var51 << 1) << 1) << 10
                                        )
                                        - 129
                                      ^ 68
                                  )
                                  << 10
                            )
                            ^ 15
                        )
                        & 32768
                    )
                    >> 15
                  | (
                      (
                          (
                                (
                                    (
                                          (((((var51 & 32768) >> 15 | var51 << 1) & 32768) >> 15 | ((var51 & 32768) >> 15 | var51 << 1) << 1) & 65472) >> 6
                                            | ((((var51 & 32768) >> 15 | var51 << 1) & 32768) >> 15 | ((var51 & 32768) >> 15 | var51 << 1) << 1) << 10
                                        )
                                        - 129
                                      ^ 68
                                  )
                                  & 65472
                              )
                              >> 6
                            | (
                                (
                                      (((((var51 & 32768) >> 15 | var51 << 1) & 32768) >> 15 | ((var51 & 32768) >> 15 | var51 << 1) << 1) & 65472) >> 6
                                        | ((((var51 & 32768) >> 15 | var51 << 1) & 32768) >> 15 | ((var51 & 32768) >> 15 | var51 << 1) << 1) << 10
                                    )
                                    - 129
                                  ^ 68
                              )
                              << 10
                        )
                        ^ 15
                    )
                    << 1
              )
              - 44
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), eyf.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (1737067941 >> 214949795 | 0) & -485867000; var35 < var19.length(); var35 += (-800933843 | 552534836) ^ -252724420) {
        int var61 = (var19.charAt(var35) ^ 228) - 41;
        char var66 = (char)(
          (
                (
                    (
                          (
                              (
                                    (
                                          ((((var61 & 49152) >> 14 | var61 << 2) - 107 ^ 207) & 65408) >> 7
                                            | (((var61 & 49152) >> 14 | var61 << 2) - 107 ^ 207) << 9
                                        )
                                        + 102
                                      & 65408
                                  )
                                  >> 7
                                | (((((var61 & 49152) >> 14 | var61 << 2) - 107 ^ 207) & 65408) >> 7 | (((var61 & 49152) >> 14 | var61 << 2) - 107 ^ 207) << 9)
                                    + 102
                                  << 9
                            )
                            & 63488
                        )
                        >> 11
                      | (
                          (
                                (((((var61 & 49152) >> 14 | var61 << 2) - 107 ^ 207) & 65408) >> 7 | (((var61 & 49152) >> 14 | var61 << 2) - 107 ^ 207) << 9)
                                    + 102
                                  & 65408
                              )
                              >> 7
                            | (((((var61 & 49152) >> 14 | var61 << 2) - 107 ^ 207) & 65408) >> 7 | (((var61 & 49152) >> 14 | var61 << 2) - 107 ^ 207) << 9)
                                + 102
                              << 9
                        )
                        << 5
                  )
                  & 57344
              )
              >> 13
            | (
                (
                      (
                          (
                                (((((var61 & 49152) >> 14 | var61 << 2) - 107 ^ 207) & 65408) >> 7 | (((var61 & 49152) >> 14 | var61 << 2) - 107 ^ 207) << 9)
                                    + 102
                                  & 65408
                              )
                              >> 7
                            | (((((var61 & 49152) >> 14 | var61 << 2) - 107 ^ 207) & 65408) >> 7 | (((var61 & 49152) >> 14 | var61 << 2) - 107 ^ 207) << 9)
                                + 102
                              << 9
                        )
                        & 63488
                    )
                    >> 11
                  | (
                      (
                            (((((var61 & 49152) >> 14 | var61 << 2) - 107 ^ 207) & 65408) >> 7 | (((var61 & 49152) >> 14 | var61 << 2) - 107 ^ 207) << 9) + 102
                              & 65408
                          )
                          >> 7
                        | (((((var61 & 49152) >> 14 | var61 << 2) - 107 ^ 207) & 65408) >> 7 | (((var61 & 49152) >> 14 | var61 << 2) - 107 ^ 207) << 9) + 102
                          << 9
                    )
                    << 5
              )
              << 3
        );
        var19.setCharAt(
          var35,
          (char)(
            (
                  (
                      (
                            (
                                (
                                      (
                                            ((((var61 & 49152) >> 14 | var61 << 2) - 107 ^ 207) & 65408) >> 7
                                              | (((var61 & 49152) >> 14 | var61 << 2) - 107 ^ 207) << 9
                                          )
                                          + 102
                                        & 65408
                                    )
                                    >> 7
                                  | (
                                        ((((var61 & 49152) >> 14 | var61 << 2) - 107 ^ 207) & 65408) >> 7
                                          | (((var61 & 49152) >> 14 | var61 << 2) - 107 ^ 207) << 9
                                      )
                                      + 102
                                    << 9
                              )
                              & 63488
                          )
                          >> 11
                        | (
                            (
                                  (((((var61 & 49152) >> 14 | var61 << 2) - 107 ^ 207) & 65408) >> 7 | (((var61 & 49152) >> 14 | var61 << 2) - 107 ^ 207) << 9)
                                      + 102
                                    & 65408
                                )
                                >> 7
                              | (((((var61 & 49152) >> 14 | var61 << 2) - 107 ^ 207) & 65408) >> 7 | (((var61 & 49152) >> 14 | var61 << 2) - 107 ^ 207) << 9)
                                  + 102
                                << 9
                          )
                          << 5
                    )
                    & 57344
                )
                >> 13
              | (
                  (
                        (
                            (
                                  (((((var61 & 49152) >> 14 | var61 << 2) - 107 ^ 207) & 65408) >> 7 | (((var61 & 49152) >> 14 | var61 << 2) - 107 ^ 207) << 9)
                                      + 102
                                    & 65408
                                )
                                >> 7
                              | (((((var61 & 49152) >> 14 | var61 << 2) - 107 ^ 207) & 65408) >> 7 | (((var61 & 49152) >> 14 | var61 << 2) - 107 ^ 207) << 9)
                                  + 102
                                << 9
                          )
                          & 63488
                      )
                      >> 11
                    | (
                        (
                              (((((var61 & 49152) >> 14 | var61 << 2) - 107 ^ 207) & 65408) >> 7 | (((var61 & 49152) >> 14 | var61 << 2) - 107 ^ 207) << 9)
                                  + 102
                                & 65408
                            )
                            >> 7
                          | (((((var61 & 49152) >> 14 | var61 << 2) - 107 ^ 207) & 65408) >> 7 | (((var61 & 49152) >> 14 | var61 << 2) - 107 ^ 207) << 9) + 102
                            << 9
                      )
                      << 5
                )
                << 3
          )
        );
      }

      Class var7 = Class.forName(var19.toString(), false, eyf.class.getClassLoader());
      switch ((((var4 ^ 1186511948) - 1458800715 ^ 1352432680) - 18593220 ^ 1175866939 ^ 527106669) + 2009951318 - 268564385 - 379360988 + 2144785299) {
        case 700384796:
        case 815990015:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1806596764:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 1944484862:
          var10000 = var0.findSpecial(var7, var5, var6, eyf.class);
          break;
        case 2016464321:
          var10000 = var0.findConstructor(var7, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    ziu[((var10 ^ 1785909959) - 1395620119 + 551288102 + 1361464451 - 788630556 + 2027700923 - 757766180 - 568882515 ^ 2020189626) + 486745465] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (var10 - 2021136309 + 289345499 - 1324113956 + 50621948 + 244746629 - 1281704809 ^ 1562366193) + 350761655 ^ 1897664874;
    MethodHandle var10000 = ziu[((var10 - 2021136309 + 289345499 - 1324113956 + 50621948 + 244746629 - 1281704809 ^ 1562366193) + 350761655 ^ 1897664874)
      + 565309457];
    if (ziu[var10001 + 565309457] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = 1050543158 ^ 1799637888 ^ 1440370614; var24 < var14.length(); var24 += -1383497439 >>> 1862706485 ^ 1389) {
        int var43 = (var14.charAt(var24) ^ 254) + 209 + 188 - 195 - 23 - 214 + 13;
        char var46 = (char)(
          (((((var43 & 49152) >> 14 | var43 << 2) & 61440) >> 12 | ((var43 & 49152) >> 14 | var43 << 2) << 4) & 32768) >> 15
            | ((((var43 & 49152) >> 14 | var43 << 2) & 61440) >> 12 | ((var43 & 49152) >> 14 | var43 << 2) << 4) << 1
        );
        var14.setCharAt(
          var24,
          (char)(
            (((((var43 & 49152) >> 14 | var43 << 2) & 61440) >> 12 | ((var43 & 49152) >> 14 | var43 << 2) << 4) & 32768) >> 15
              | ((((var43 & 49152) >> 14 | var43 << 2) & 61440) >> 12 | ((var43 & 49152) >> 14 | var43 << 2) << 4) << 1
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = 1180264935 + (-899439806 ^ (1180264935 | -899439806)) ^ 1248965260;
        var30 < var17.length();
        var30 += -1688208865 & 2028669351 ^ 407570438
      ) {
        char var51 = var17.charAt(var30);
        char var54 = (char)(
          (
                (
                      (((((var51 & '\ufff8') >> 3 | var51 << '\r') & 65520) >> 4 | ((var51 & '\ufff8') >> 3 | var51 << '\r') << 12) ^ 66 ^ 17) - 161 + 31 + 189
                        & 32768
                    )
                    >> 15
                  | (((((var51 & '\ufff8') >> 3 | var51 << '\r') & 65520) >> 4 | ((var51 & '\ufff8') >> 3 | var51 << '\r') << 12) ^ 66 ^ 17) - 161 + 31 + 189
                    << 1
              )
              + 212
            ^ 2
        );
        var17.setCharAt(
          var30,
          (char)(
            (
                  (
                        (((((var51 & '\ufff8') >> 3 | var51 << '\r') & 65520) >> 4 | ((var51 & '\ufff8') >> 3 | var51 << '\r') << 12) ^ 66 ^ 17)
                            - 161
                            + 31
                            + 189
                          & 32768
                      )
                      >> 15
                    | (((((var51 & '\ufff8') >> 3 | var51 << '\r') & 65520) >> 4 | ((var51 & '\ufff8') >> 3 | var51 << '\r') << 12) ^ 66 ^ 17) - 161 + 31 + 189
                      << 1
                )
                + 212
              ^ 2
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, eyf.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (-1457879983 | -1457879983 | 0) & 1357150472;
        var36 < var20.length();
        var36 += (-1169705513 - (1902052735 ^ -2020657508) | 1) & 746597377
      ) {
        int var59 = var20.charAt(var36) ^ 143;
        char var64 = (char)(
          (
                (
                    (
                          (
                                (
                                    (
                                          (
                                              ((((var59 & 65528) >> 3 | var59 << 13) - 138 ^ 218) & 0) >> 16
                                                | (((var59 & 65528) >> 3 | var59 << 13) - 138 ^ 218) << 0
                                            )
                                            & 65024
                                        )
                                        >> 9
                                      | (
                                          ((((var59 & 65528) >> 3 | var59 << 13) - 138 ^ 218) & 0) >> 16
                                            | (((var59 & 65528) >> 3 | var59 << 13) - 138 ^ 218) << 0
                                        )
                                        << 7
                                  )
                                  & 65520
                              )
                              >> 4
                            | (
                                (
                                      (((((var59 & 65528) >> 3 | var59 << 13) - 138 ^ 218) & 0) >> 16 | (((var59 & 65528) >> 3 | var59 << 13) - 138 ^ 218) << 0)
                                        & 65024
                                    )
                                    >> 9
                                  | (((((var59 & 65528) >> 3 | var59 << 13) - 138 ^ 218) & 0) >> 16 | (((var59 & 65528) >> 3 | var59 << 13) - 138 ^ 218) << 0)
                                    << 7
                              )
                              << 12
                        )
                        + 130
                      ^ 81
                  )
                  & 65472
              )
              >> 6
            | (
                (
                      (
                            (
                                (
                                      (((((var59 & 65528) >> 3 | var59 << 13) - 138 ^ 218) & 0) >> 16 | (((var59 & 65528) >> 3 | var59 << 13) - 138 ^ 218) << 0)
                                        & 65024
                                    )
                                    >> 9
                                  | (((((var59 & 65528) >> 3 | var59 << 13) - 138 ^ 218) & 0) >> 16 | (((var59 & 65528) >> 3 | var59 << 13) - 138 ^ 218) << 0)
                                    << 7
                              )
                              & 65520
                          )
                          >> 4
                        | (
                            ((((((var59 & 65528) >> 3 | var59 << 13) - 138 ^ 218) & 0) >> 16 | (((var59 & 65528) >> 3 | var59 << 13) - 138 ^ 218) << 0) & 65024)
                                >> 9
                              | (((((var59 & 65528) >> 3 | var59 << 13) - 138 ^ 218) & 0) >> 16 | (((var59 & 65528) >> 3 | var59 << 13) - 138 ^ 218) << 0) << 7
                          )
                          << 12
                    )
                    + 130
                  ^ 81
              )
              << 10
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
                                            (
                                                ((((var59 & 65528) >> 3 | var59 << 13) - 138 ^ 218) & 0) >> 16
                                                  | (((var59 & 65528) >> 3 | var59 << 13) - 138 ^ 218) << 0
                                              )
                                              & 65024
                                          )
                                          >> 9
                                        | (
                                            ((((var59 & 65528) >> 3 | var59 << 13) - 138 ^ 218) & 0) >> 16
                                              | (((var59 & 65528) >> 3 | var59 << 13) - 138 ^ 218) << 0
                                          )
                                          << 7
                                    )
                                    & 65520
                                )
                                >> 4
                              | (
                                  (
                                        (
                                            ((((var59 & 65528) >> 3 | var59 << 13) - 138 ^ 218) & 0) >> 16
                                              | (((var59 & 65528) >> 3 | var59 << 13) - 138 ^ 218) << 0
                                          )
                                          & 65024
                                      )
                                      >> 9
                                    | (((((var59 & 65528) >> 3 | var59 << 13) - 138 ^ 218) & 0) >> 16 | (((var59 & 65528) >> 3 | var59 << 13) - 138 ^ 218) << 0)
                                      << 7
                                )
                                << 12
                          )
                          + 130
                        ^ 81
                    )
                    & 65472
                )
                >> 6
              | (
                  (
                        (
                              (
                                  (
                                        (
                                            ((((var59 & 65528) >> 3 | var59 << 13) - 138 ^ 218) & 0) >> 16
                                              | (((var59 & 65528) >> 3 | var59 << 13) - 138 ^ 218) << 0
                                          )
                                          & 65024
                                      )
                                      >> 9
                                    | (((((var59 & 65528) >> 3 | var59 << 13) - 138 ^ 218) & 0) >> 16 | (((var59 & 65528) >> 3 | var59 << 13) - 138 ^ 218) << 0)
                                      << 7
                                )
                                & 65520
                            )
                            >> 4
                          | (
                              (
                                    (((((var59 & 65528) >> 3 | var59 << 13) - 138 ^ 218) & 0) >> 16 | (((var59 & 65528) >> 3 | var59 << 13) - 138 ^ 218) << 0)
                                      & 65024
                                  )
                                  >> 9
                                | (((((var59 & 65528) >> 3 | var59 << 13) - 138 ^ 218) & 0) >> 16 | (((var59 & 65528) >> 3 | var59 << 13) - 138 ^ 218) << 0)
                                  << 7
                            )
                            << 12
                      )
                      + 130
                    ^ 81
                )
                << 10
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), eyf.class.getClassLoader()).returnType();
      switch ((((var4 ^ 390210369) + 1748141834 + 935286642 ^ 1136562715 ^ 1174733276) + 1979087112 - 1792943077 ^ 79034606) + 930824417 - 1866620096) {
        case 482698742:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1462764399:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1574413526:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1594005082:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      ziu[((var10 - 2021136309 + 289345499 - 1324113956 + 50621948 + 244746629 - 1281704809 ^ 1562366193) + 350761655 ^ 1897664874) + 565309457] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
