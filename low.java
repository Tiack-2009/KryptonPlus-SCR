// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

public enum low {
  rhs,
  vbd,
  cf,
  rsy,
  cak;

  public int ftn;
  // [JNT] MethodHandle dispatch table (removed)
  public low(int var3) {
    this.ftn = var3;
  }

  public int wvn() {
    return null /* jnt:encrypted */;
  }

  // $VF: Failed to inline enum fields
  // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
  static {
    int var10000 = (50375370 - 1566494676 | 0) & 1480720649;

    StringBuilder var10001;
    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < ((-1295365500 ^ 1459619845 | 7) & 305497463);
      var10000 += -841265819 - 1979568855 * 1979568855 ^ -583017259
    ) {
      char var18 = /* jnt */;
      int var10004 = (var18 & '\uf800') >> 11;
      int var19 = ((var18 & '\uf800') >> 11 | var18 << 5) - 232;
      int var50 = (((var18 & '\uf800') >> 11 | var18 << 5) - 232 & 65024) >> 9;
      var18 = (char)((((var10004 | var18 << 5) - 232 & 65024) >> 9 | ((var18 & '\uf800') >> 11 | var18 << 5) - 232 << 7) - 124 ^ 246);
      /* jnt */((var50 | var19 << 7) - 124 ^ 246));
    }

    rhs = (low)/* jnt */, 0, 0
    );
    var10000 = (1305893356 << 1907659785 | 0) & 1128268687;

    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < (-1845450491 << -1845450491 ^ 1075126436);
      var10000 += 2074736225 ^ -1791246925 & -1927272342 ^ -24519102
    ) {
      int var23 = /* jnt */ ^ 'd';
      int var51 = (var23 & 65534) >> 1;
      int var24 = ((var23 & 65534) >> 1 | var23 << 15) ^ 62;
      int var52 = ((((var23 & 65534) >> 1 | var23 << 15) ^ 62) & 65024) >> 9;
      char var25 = (char)(((((var51 | var23 << 15) ^ 62) & 65024) >> 9 | (((var23 & 65534) >> 1 | var23 << 15) ^ 62) << 7) - 237);
      /* jnt */((var52 | var24 << 7) - 237));
    }

    vbd = (low)/* jnt */, 1, 1
    );
    var10000 = (1810678003 + (1810678003 << 1810678003) | 0) & -1940908020;

    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < (2055785458 ^ 1588070837 ^ 606126657);
      var10000 += 838874412 ^ 713940531 ^ 411953950
    ) {
      char var28 = /* jnt */;
      char var31 = (char)(
        (
            (((((var28 & '\ufff8') >> 3 | var28 << '\r') & 65534) >> 1 | ((var28 & '\ufff8') >> 3 | var28 << '\r') << 15) & 61440) >> 12
              | ((((var28 & '\ufff8') >> 3 | var28 << '\r') & 65534) >> 1 | ((var28 & '\ufff8') >> 3 | var28 << '\r') << 15) << 4
          )
          + 53
          + 2
      );
      /* jnt */(
          (
              (((((var28 & '\ufff8') >> 3 | var28 << '\r') & 65534) >> 1 | ((var28 & '\ufff8') >> 3 | var28 << '\r') << 15) & 61440) >> 12
                | ((((var28 & '\ufff8') >> 3 | var28 << '\r') & 65534) >> 1 | ((var28 & '\ufff8') >> 3 | var28 << '\r') << 15) << 4
            )
            + 53
            + 2
        )
      );
    }

    cf = (low)/* jnt */, 2, 2
    );
    var10000 = (-1385816938 | -418678554 | 0) & 276857601;

    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < (-2108963949 >> -617723161 ^ -16476284);
      var10000 += 1155303574 ^ -901462499 ^ -1902621046
    ) {
      /* jnt */((/* jnt */ ^ 'X' ^ 164) + 147 + 164 + 47)
      );
    }

    rsy = (low)/* jnt */, 3, 3
    );
    var10000 = 69572244 >>> 69572244 ^ 66;

    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < ((-795130658 << -795130658 | 6) & 225979822);
      var10000 += (-1272044823 - -1423409795 | 1) & -2072487917
    ) {
      char var36 = /* jnt */;
      char var39 = (char)(
        (
            (((((var36 & '\ufffe') >> 1 | var36 << 15) & 0) >> 16 | ((var36 & '\ufffe') >> 1 | var36 << 15) << 0) + 184 & 65024) >> 9
              | ((((var36 & '\ufffe') >> 1 | var36 << 15) & 0) >> 16 | ((var36 & '\ufffe') >> 1 | var36 << 15) << 0) + 184 << 7
          )
          - 194
      );
      /* jnt */(
          (
              (((((var36 & '\ufffe') >> 1 | var36 << 15) & 0) >> 16 | ((var36 & '\ufffe') >> 1 | var36 << 15) << 0) + 184 & 65024) >> 9
                | ((((var36 & '\ufffe') >> 1 | var36 << 15) & 0) >> 16 | ((var36 & '\ufffe') >> 1 | var36 << 15) << 0) + 184 << 7
            )
            - 194
        )
      );
    }

    cak = (low)/* jnt */, 4, 4
    );
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (((var10 - 1484114441 - 471473142 ^ 2040040997) + 1357988817 ^ 14418079) + 621056743 - 530650478 ^ 1176701935) - 2085880464;
    MethodHandle var10000 = orf[(((var10 - 1484114441 - 471473142 ^ 2040040997) + 1357988817 ^ 14418079) + 621056743 - 530650478 ^ 1176701935) - 2085880464
      ^ 1500338599];
    if (orf[var10001 ^ 1500338599] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = 583230008 >> (-385091146 ^ 31654955) ^ 1; var23 < var13.length(); var23 += 2019162947 * 2121068221 ^ 2085276278) {
        char var42 = var13.charAt(var23);
        char var47 = (char)(
          (
              (
                  (
                        (
                              (
                                    (
                                          (((((var42 & '︀') >> 9 | var42 << 7) & 32768) >> 15 | ((var42 & '︀') >> 9 | var42 << 7) << 1) + 100 & 65472) >> 6
                                            | ((((var42 & '︀') >> 9 | var42 << 7) & 32768) >> 15 | ((var42 & '︀') >> 9 | var42 << 7) << 1) + 100 << 10
                                        )
                                        + 144
                                      & 63488
                                  )
                                  >> 11
                                | (
                                      (((((var42 & '︀') >> 9 | var42 << 7) & 32768) >> 15 | ((var42 & '︀') >> 9 | var42 << 7) << 1) + 100 & 65472) >> 6
                                        | ((((var42 & '︀') >> 9 | var42 << 7) & 32768) >> 15 | ((var42 & '︀') >> 9 | var42 << 7) << 1) + 100 << 10
                                    )
                                    + 144
                                  << 5
                            )
                            + 244
                          & 63488
                      )
                      >> 11
                    | (
                          (
                                (
                                      (((((var42 & '︀') >> 9 | var42 << 7) & 32768) >> 15 | ((var42 & '︀') >> 9 | var42 << 7) << 1) + 100 & 65472) >> 6
                                        | ((((var42 & '︀') >> 9 | var42 << 7) & 32768) >> 15 | ((var42 & '︀') >> 9 | var42 << 7) << 1) + 100 << 10
                                    )
                                    + 144
                                  & 63488
                              )
                              >> 11
                            | (
                                  (((((var42 & '︀') >> 9 | var42 << 7) & 32768) >> 15 | ((var42 & '︀') >> 9 | var42 << 7) << 1) + 100 & 65472) >> 6
                                    | ((((var42 & '︀') >> 9 | var42 << 7) & 32768) >> 15 | ((var42 & '︀') >> 9 | var42 << 7) << 1) + 100 << 10
                                )
                                + 144
                              << 5
                        )
                        + 244
                      << 5
                )
                ^ 73
            )
            + 78
        );
        var13.setCharAt(
          var23,
          (char)(
            (
                (
                    (
                          (
                                (
                                      (
                                            (((((var42 & '︀') >> 9 | var42 << 7) & 32768) >> 15 | ((var42 & '︀') >> 9 | var42 << 7) << 1) + 100 & 65472) >> 6
                                              | ((((var42 & '︀') >> 9 | var42 << 7) & 32768) >> 15 | ((var42 & '︀') >> 9 | var42 << 7) << 1) + 100 << 10
                                          )
                                          + 144
                                        & 63488
                                    )
                                    >> 11
                                  | (
                                        (((((var42 & '︀') >> 9 | var42 << 7) & 32768) >> 15 | ((var42 & '︀') >> 9 | var42 << 7) << 1) + 100 & 65472) >> 6
                                          | ((((var42 & '︀') >> 9 | var42 << 7) & 32768) >> 15 | ((var42 & '︀') >> 9 | var42 << 7) << 1) + 100 << 10
                                      )
                                      + 144
                                    << 5
                              )
                              + 244
                            & 63488
                        )
                        >> 11
                      | (
                            (
                                  (
                                        (((((var42 & '︀') >> 9 | var42 << 7) & 32768) >> 15 | ((var42 & '︀') >> 9 | var42 << 7) << 1) + 100 & 65472) >> 6
                                          | ((((var42 & '︀') >> 9 | var42 << 7) & 32768) >> 15 | ((var42 & '︀') >> 9 | var42 << 7) << 1) + 100 << 10
                                      )
                                      + 144
                                    & 63488
                                )
                                >> 11
                              | (
                                    (((((var42 & '︀') >> 9 | var42 << 7) & 32768) >> 15 | ((var42 & '︀') >> 9 | var42 << 7) << 1) + 100 & 65472) >> 6
                                      | ((((var42 & '︀') >> 9 | var42 << 7) & 32768) >> 15 | ((var42 & '︀') >> 9 | var42 << 7) << 1) + 100 << 10
                                  )
                                  + 144
                                << 5
                          )
                          + 244
                        << 5
                  )
                  ^ 73
              )
              + 78
          )
        );
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = 1431980862 - 1398733813 ^ 33247049; var29 < var16.length(); var29 += (-658824488 | 1444797800 | 1) & 7) {
        int var52 = var16.charAt(var29) + 193 + 98 - 89 - 217;
        char var57 = (char)(
          (
                (
                      (
                            (
                                (((((var52 & 32768) >> 15 | var52 << 1) & 65520) >> 4 | ((var52 & 32768) >> 15 | var52 << 1) << 12) & 57344) >> 13
                                  | ((((var52 & 32768) >> 15 | var52 << 1) & 65520) >> 4 | ((var52 & 32768) >> 15 | var52 << 1) << 12) << 3
                              )
                              & 65528
                          )
                          >> 3
                        | (
                            (((((var52 & 32768) >> 15 | var52 << 1) & 65520) >> 4 | ((var52 & 32768) >> 15 | var52 << 1) << 12) & 57344) >> 13
                              | ((((var52 & 32768) >> 15 | var52 << 1) & 65520) >> 4 | ((var52 & 32768) >> 15 | var52 << 1) << 12) << 3
                          )
                          << 13
                    )
                    - 158
                  & 57344
              )
              >> 13
            | (
                  (
                        (
                            (((((var52 & 32768) >> 15 | var52 << 1) & 65520) >> 4 | ((var52 & 32768) >> 15 | var52 << 1) << 12) & 57344) >> 13
                              | ((((var52 & 32768) >> 15 | var52 << 1) & 65520) >> 4 | ((var52 & 32768) >> 15 | var52 << 1) << 12) << 3
                          )
                          & 65528
                      )
                      >> 3
                    | (
                        (((((var52 & 32768) >> 15 | var52 << 1) & 65520) >> 4 | ((var52 & 32768) >> 15 | var52 << 1) << 12) & 57344) >> 13
                          | ((((var52 & 32768) >> 15 | var52 << 1) & 65520) >> 4 | ((var52 & 32768) >> 15 | var52 << 1) << 12) << 3
                      )
                      << 13
                )
                - 158
              << 3
        );
        var16.setCharAt(
          var29,
          (char)(
            (
                  (
                        (
                              (
                                  (((((var52 & 32768) >> 15 | var52 << 1) & 65520) >> 4 | ((var52 & 32768) >> 15 | var52 << 1) << 12) & 57344) >> 13
                                    | ((((var52 & 32768) >> 15 | var52 << 1) & 65520) >> 4 | ((var52 & 32768) >> 15 | var52 << 1) << 12) << 3
                                )
                                & 65528
                            )
                            >> 3
                          | (
                              (((((var52 & 32768) >> 15 | var52 << 1) & 65520) >> 4 | ((var52 & 32768) >> 15 | var52 << 1) << 12) & 57344) >> 13
                                | ((((var52 & 32768) >> 15 | var52 << 1) & 65520) >> 4 | ((var52 & 32768) >> 15 | var52 << 1) << 12) << 3
                            )
                            << 13
                      )
                      - 158
                    & 57344
                )
                >> 13
              | (
                    (
                          (
                              (((((var52 & 32768) >> 15 | var52 << 1) & 65520) >> 4 | ((var52 & 32768) >> 15 | var52 << 1) << 12) & 57344) >> 13
                                | ((((var52 & 32768) >> 15 | var52 << 1) & 65520) >> 4 | ((var52 & 32768) >> 15 | var52 << 1) << 12) << 3
                            )
                            & 65528
                        )
                        >> 3
                      | (
                          (((((var52 & 32768) >> 15 | var52 << 1) & 65520) >> 4 | ((var52 & 32768) >> 15 | var52 << 1) << 12) & 57344) >> 13
                            | ((((var52 & 32768) >> 15 | var52 << 1) & 65520) >> 4 | ((var52 & 32768) >> 15 | var52 << 1) << 12) << 3
                        )
                        << 13
                  )
                  - 158
                << 3
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), low.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = -2140087176 >> -570487786 ^ -511; var35 < var19.length(); var35 += 1231809372 & -71630655 ^ 1227554881) {
        int var62 = var19.charAt(var35) ^ 173 ^ 239 ^ 224;
        char var63 = (char)((((var62 & 65528) >> 3 | var62 << 13) ^ 239 ^ 138) - 190 - 226 - 113 + 12);
        var19.setCharAt(var35, (char)((((var62 & 65528) >> 3 | var62 << 13) ^ 239 ^ 138) - 190 - 226 - 113 + 12));
      }

      Class var7 = Class.forName(var19.toString(), false, low.class.getClassLoader());
      switch (((((var4 + 1171911941 ^ 1791835377 ^ 1267143524) + 2118783184 ^ 1425706877) - 1082784200 ^ 466795616) + 347382830 ^ 1806916728) - 778691825) {
        case 99254853:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 1165923357:
          var10000 = var0.findSpecial(var7, var5, var6, low.class);
          break;
        case 1294315570:
        case 1751534928:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1784137537:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    orf[(((var10 - 1484114441 - 471473142 ^ 2040040997) + 1357988817 ^ 14418079) + 621056743 - 530650478 ^ 1176701935) - 2085880464 ^ 1500338599] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 + 1881148898 - 919984182 + 1395147953 ^ 80641351) + 1709339524 + 1327363610 + 308134283 ^ 1157791499) + 1596185908;
    MethodHandle var10000 = orf[((var10 + 1881148898 - 919984182 + 1395147953 ^ 80641351) + 1709339524 + 1327363610 + 308134283 ^ 1157791499) + 1596185908
      ^ 1393340463];
    if (orf[var10001 ^ 1393340463] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = -1021511707 >> 21531191 ^ -122; var24 < var14.length(); var24 += -203809004 * -203809004 ^ -371861103) {
        int var43 = var14.charAt(var24) - 'c';
        int var10004 = (var43 & 32768) >> 15;
        int var44 = (((var43 & 32768) >> 15 | var43 << 1) ^ 71) - 91;
        int var80 = ((((var43 & 32768) >> 15 | var43 << 1) ^ 71) - 91 & 65528) >> 3;
        char var45 = (char)(
          ((((var10004 | var43 << 1) ^ 71) - 91 & 65528) >> 3 | (((var43 & 32768) >> 15 | var43 << 1) ^ 71) - 91 << 13) - 1 - 58 + 182 - 17 + 15
        );
        var14.setCharAt(var24, (char)((var80 | var44 << 13) - 1 - 58 + 182 - 17 + 15));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = -1611903156 * -1611903156 ^ -1263534448; var30 < var17.length(); var30 += (286087439 << 1474253005 | 1) & 77334449) {
        int var50 = var17.charAt(var30) - '\f' + 65 ^ 185;
        int var81 = (var50 & 65024) >> 9;
        int var51 = (var50 & 65024) >> 9 | var50 << 7;
        int var82 = (((var50 & 65024) >> 9 | var50 << 7) & 61440) >> 12;
        var50 = (((var81 | var50 << 7) & 61440) >> 12 | ((var50 & 65024) >> 9 | var50 << 7) << 4) - 50;
        var81 = ((var82 | var51 << 4) - 50 & 57344) >> 13;
        int var53 = ((((var82 | var51 << 4) - 50 & 57344) >> 13 | var50 << 3) ^ 137) - 98;
        int var84 = (((((var82 | var51 << 4) - 50 & 57344) >> 13 | var50 << 3) ^ 137) - 98 & 65472) >> 6;
        char var54 = (char)((((var81 | var50 << 3) ^ 137) - 98 & 65472) >> 6 | ((((var82 | var51 << 4) - 50 & 57344) >> 13 | var50 << 3) ^ 137) - 98 << 10);
        var17.setCharAt(var30, (char)(var84 | var53 << 10));
      }

      Class var6 = Class.forName(var17.toString(), false, low.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (833897293 + -621987605 | 0) & 592609475; var36 < var20.length(); var36 += (751550014 * 1820813986 | 1) & 1107374147) {
        char var59 = var20.charAt(var36);
        char var62 = (char)(
          (
                (
                    (
                        ((((var59 & '\uffc0') >> 6 | var59 << '\n') + 1 ^ 177 ^ 225) + 120 - 253 - 206 & 65535) >> 0
                          | (((var59 & '\uffc0') >> 6 | var59 << '\n') + 1 ^ 177 ^ 225) + 120 - 253 - 206 << 16
                      )
                      ^ 194
                  )
                  & 65472
              )
              >> 6
            | (
                (
                    ((((var59 & '\uffc0') >> 6 | var59 << '\n') + 1 ^ 177 ^ 225) + 120 - 253 - 206 & 65535) >> 0
                      | (((var59 & '\uffc0') >> 6 | var59 << '\n') + 1 ^ 177 ^ 225) + 120 - 253 - 206 << 16
                  )
                  ^ 194
              )
              << 10
        );
        var20.setCharAt(
          var36,
          (char)(
            (
                  (
                      (
                          ((((var59 & '\uffc0') >> 6 | var59 << '\n') + 1 ^ 177 ^ 225) + 120 - 253 - 206 & 65535) >> 0
                            | (((var59 & '\uffc0') >> 6 | var59 << '\n') + 1 ^ 177 ^ 225) + 120 - 253 - 206 << 16
                        )
                        ^ 194
                    )
                    & 65472
                )
                >> 6
              | (
                  (
                      ((((var59 & '\uffc0') >> 6 | var59 << '\n') + 1 ^ 177 ^ 225) + 120 - 253 - 206 & 65535) >> 0
                        | (((var59 & '\uffc0') >> 6 | var59 << '\n') + 1 ^ 177 ^ 225) + 120 - 253 - 206 << 16
                    )
                    ^ 194
                )
                << 10
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), low.class.getClassLoader()).returnType();
      switch ((((var4 ^ 1385485606) + 280008732 ^ 161543389 ^ 1497759429) + 1070562793 ^ 834521291) + 1363521278 + 108592276 + 1677912557 ^ 678994912) {
        case 70512172:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1397601313:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1709271265:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1883565312:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      orf[((var10 + 1881148898 - 919984182 + 1395147953 ^ 80641351) + 1709339524 + 1327363610 + 308134283 ^ 1157791499) + 1596185908 ^ 1393340463] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
