// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

public class mu {
  public int jc;
  public int qi;
  // [JNT] MethodHandle dispatch table (removed)
  public mu(int var1, int var2) {
    this.jc = var1;
    this.qi = var2;
  }

  @Override
  public boolean equals(Object var1) {
    int var3 = 998095338;
    if (this == var1) {
      return true;
    } else {
      var3 = -263148071 + 1890222746 ^ 468179417;

      while (true) {
        switch (((var3 ^ 913935338) + 189721976 + 1823447859 ^ 1089175560) - 1720176631 + 980518970) {
          case -245292146:
          default:
            return false;
          case 1500652326:
        }

        if (var1 instanceof mu var2) {
          var3 = (-679694659 | 419965146 | 146948096) & 683856024;

          while (true) {
            switch (((var3 + 1666166881 ^ 1228956090) + 2128839733 + 748141459 ^ 1067326819) + 795942117) {
              case 160275850:
                return false;
              case 516188493:
              default:
                if (null /* jnt:encrypted */ == null /* jnt:encrypted */
                  && null /* jnt:encrypted */ == null /* jnt:encrypted */) {
                  return true;
                }

                var3 = 710282572 >> -194280605 ^ 180177482;
            }
          }
        }

        var3 = -382163623 ^ -1282128878 ^ -1991571399;
      }
    }
  }

  @Override
  public int hashCode() {
    return null /* jnt:encrypted */ * 31 + null /* jnt:encrypted */;
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (var10 - 1371325518 + 1239732181 + 2114215859 - 995098566 - 950144086 - 1548915536 - 970477462 ^ 1266497203) + 926306065;
    MethodHandle var10000 = utr[(var10 - 1371325518 + 1239732181 + 2114215859 - 995098566 - 950144086 - 1548915536 - 970477462 ^ 1266497203)
      + 926306065
      + 1876252459];
    if (utr[var10001 + 1876252459] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (-1891018780 ^ -1159134405 | 0) & -1035820544; var24 < var14.length(); var24 += -36597970 ^ -36597970 ^ 1) {
        int var43 = var14.charAt(var24) - 243 ^ 149;
        char var48 = (char)(
          (
                (
                    (
                          (
                                (
                                    (((((var43 & 65528) >> 3 | var43 << 13) & 65024) >> 9 | ((var43 & 65528) >> 3 | var43 << 13) << 7) & 0) >> 16
                                      | ((((var43 & 65528) >> 3 | var43 << 13) & 65024) >> 9 | ((var43 & 65528) >> 3 | var43 << 13) << 7) << 0
                                  )
                                  & 32768
                              )
                              >> 15
                            | (
                                (((((var43 & 65528) >> 3 | var43 << 13) & 65024) >> 9 | ((var43 & 65528) >> 3 | var43 << 13) << 7) & 0) >> 16
                                  | ((((var43 & 65528) >> 3 | var43 << 13) & 65024) >> 9 | ((var43 & 65528) >> 3 | var43 << 13) << 7) << 0
                              )
                              << 1
                        )
                        + 195
                        + 70
                      ^ 194
                  )
                  & 65024
              )
              >> 9
            | (
                (
                      (
                            (
                                (((((var43 & 65528) >> 3 | var43 << 13) & 65024) >> 9 | ((var43 & 65528) >> 3 | var43 << 13) << 7) & 0) >> 16
                                  | ((((var43 & 65528) >> 3 | var43 << 13) & 65024) >> 9 | ((var43 & 65528) >> 3 | var43 << 13) << 7) << 0
                              )
                              & 32768
                          )
                          >> 15
                        | (
                            (((((var43 & 65528) >> 3 | var43 << 13) & 65024) >> 9 | ((var43 & 65528) >> 3 | var43 << 13) << 7) & 0) >> 16
                              | ((((var43 & 65528) >> 3 | var43 << 13) & 65024) >> 9 | ((var43 & 65528) >> 3 | var43 << 13) << 7) << 0
                          )
                          << 1
                    )
                    + 195
                    + 70
                  ^ 194
              )
              << 7
        );
        var14.setCharAt(
          var24,
          (char)(
            (
                  (
                      (
                            (
                                  (
                                      (((((var43 & 65528) >> 3 | var43 << 13) & 65024) >> 9 | ((var43 & 65528) >> 3 | var43 << 13) << 7) & 0) >> 16
                                        | ((((var43 & 65528) >> 3 | var43 << 13) & 65024) >> 9 | ((var43 & 65528) >> 3 | var43 << 13) << 7) << 0
                                    )
                                    & 32768
                                )
                                >> 15
                              | (
                                  (((((var43 & 65528) >> 3 | var43 << 13) & 65024) >> 9 | ((var43 & 65528) >> 3 | var43 << 13) << 7) & 0) >> 16
                                    | ((((var43 & 65528) >> 3 | var43 << 13) & 65024) >> 9 | ((var43 & 65528) >> 3 | var43 << 13) << 7) << 0
                                )
                                << 1
                          )
                          + 195
                          + 70
                        ^ 194
                    )
                    & 65024
                )
                >> 9
              | (
                  (
                        (
                              (
                                  (((((var43 & 65528) >> 3 | var43 << 13) & 65024) >> 9 | ((var43 & 65528) >> 3 | var43 << 13) << 7) & 0) >> 16
                                    | ((((var43 & 65528) >> 3 | var43 << 13) & 65024) >> 9 | ((var43 & 65528) >> 3 | var43 << 13) << 7) << 0
                                )
                                & 32768
                            )
                            >> 15
                          | (
                              (((((var43 & 65528) >> 3 | var43 << 13) & 65024) >> 9 | ((var43 & 65528) >> 3 | var43 << 13) << 7) & 0) >> 16
                                | ((((var43 & 65528) >> 3 | var43 << 13) & 65024) >> 9 | ((var43 & 65528) >> 3 | var43 << 13) << 7) << 0
                            )
                            << 1
                      )
                      + 195
                      + 70
                    ^ 194
                )
                << 7
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (926878707 | 1592565275 | 0) & 8196; var30 < var17.length(); var30 += -1212592026 >> -1443454133 ^ -592085) {
        char var53 = var17.charAt(var30);
        char var58 = (char)(
          (
                (
                    (
                          (
                                (
                                    (((((var53 & '耀') >> 15 | var53 << 1) & 57344) >> 13 | ((var53 & '耀') >> 15 | var53 << 1) << 3) - 203 & 0) >> 16
                                      | ((((var53 & '耀') >> 15 | var53 << 1) & 57344) >> 13 | ((var53 & '耀') >> 15 | var53 << 1) << 3) - 203 << 0
                                  )
                                  ^ 57
                                  ^ 140
                              )
                              + 129
                              - 77
                            & 65408
                        )
                        >> 7
                      | (
                            (
                                (((((var53 & '耀') >> 15 | var53 << 1) & 57344) >> 13 | ((var53 & '耀') >> 15 | var53 << 1) << 3) - 203 & 0) >> 16
                                  | ((((var53 & '耀') >> 15 | var53 << 1) & 57344) >> 13 | ((var53 & '耀') >> 15 | var53 << 1) << 3) - 203 << 0
                              )
                              ^ 57
                              ^ 140
                          )
                          + 129
                          - 77
                        << 9
                  )
                  & 65024
              )
              >> 9
            | (
                (
                      (
                            (
                                (((((var53 & '耀') >> 15 | var53 << 1) & 57344) >> 13 | ((var53 & '耀') >> 15 | var53 << 1) << 3) - 203 & 0) >> 16
                                  | ((((var53 & '耀') >> 15 | var53 << 1) & 57344) >> 13 | ((var53 & '耀') >> 15 | var53 << 1) << 3) - 203 << 0
                              )
                              ^ 57
                              ^ 140
                          )
                          + 129
                          - 77
                        & 65408
                    )
                    >> 7
                  | (
                        (
                            (((((var53 & '耀') >> 15 | var53 << 1) & 57344) >> 13 | ((var53 & '耀') >> 15 | var53 << 1) << 3) - 203 & 0) >> 16
                              | ((((var53 & '耀') >> 15 | var53 << 1) & 57344) >> 13 | ((var53 & '耀') >> 15 | var53 << 1) << 3) - 203 << 0
                          )
                          ^ 57
                          ^ 140
                      )
                      + 129
                      - 77
                    << 9
              )
              << 7
        );
        var17.setCharAt(
          var30,
          (char)(
            (
                  (
                      (
                            (
                                  (
                                      (((((var53 & '耀') >> 15 | var53 << 1) & 57344) >> 13 | ((var53 & '耀') >> 15 | var53 << 1) << 3) - 203 & 0) >> 16
                                        | ((((var53 & '耀') >> 15 | var53 << 1) & 57344) >> 13 | ((var53 & '耀') >> 15 | var53 << 1) << 3) - 203 << 0
                                    )
                                    ^ 57
                                    ^ 140
                                )
                                + 129
                                - 77
                              & 65408
                          )
                          >> 7
                        | (
                              (
                                  (((((var53 & '耀') >> 15 | var53 << 1) & 57344) >> 13 | ((var53 & '耀') >> 15 | var53 << 1) << 3) - 203 & 0) >> 16
                                    | ((((var53 & '耀') >> 15 | var53 << 1) & 57344) >> 13 | ((var53 & '耀') >> 15 | var53 << 1) << 3) - 203 << 0
                                )
                                ^ 57
                                ^ 140
                            )
                            + 129
                            - 77
                          << 9
                    )
                    & 65024
                )
                >> 9
              | (
                  (
                        (
                              (
                                  (((((var53 & '耀') >> 15 | var53 << 1) & 57344) >> 13 | ((var53 & '耀') >> 15 | var53 << 1) << 3) - 203 & 0) >> 16
                                    | ((((var53 & '耀') >> 15 | var53 << 1) & 57344) >> 13 | ((var53 & '耀') >> 15 | var53 << 1) << 3) - 203 << 0
                                )
                                ^ 57
                                ^ 140
                            )
                            + 129
                            - 77
                          & 65408
                      )
                      >> 7
                    | (
                          (
                              (((((var53 & '耀') >> 15 | var53 << 1) & 57344) >> 13 | ((var53 & '耀') >> 15 | var53 << 1) << 3) - 203 & 0) >> 16
                                | ((((var53 & '耀') >> 15 | var53 << 1) & 57344) >> 13 | ((var53 & '耀') >> 15 | var53 << 1) << 3) - 203 << 0
                            )
                            ^ 57
                            ^ 140
                        )
                        + 129
                        - 77
                      << 9
                )
                << 7
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, mu.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = 55409258 + 1318487534 * -60976755 ^ 2106002560; var36 < var20.length(); var36 += -392741868 ^ -957875126 ^ 779141215) {
        int var63 = var20.charAt(var36) + 's';
        int var99 = (var63 & 65472) >> 6;
        int var64 = ((var63 & 65472) >> 6 | var63 << 10) - 156;
        int var100 = (((var63 & 65472) >> 6 | var63 << 10) - 156 & 65472) >> 6;
        var63 = ((var99 | var63 << 10) - 156 & 65472) >> 6 | ((var63 & 65472) >> 6 | var63 << 10) - 156 << 10;
        var99 = ((var100 | var64 << 10) & 65532) >> 2;
        int var66 = (((var100 | var64 << 10) & 65532) >> 2 | var63 << 14) + 233 + 121 ^ 63;
        int var102 = (((((var100 | var64 << 10) & 65532) >> 2 | var63 << 14) + 233 + 121 ^ 63) & 49152) >> 14;
        char var67 = (char)(
          ((((var99 | var63 << 14) + 233 + 121 ^ 63) & 49152) >> 14 | ((((var100 | var64 << 10) & 65532) >> 2 | var63 << 14) + 233 + 121 ^ 63) << 2) - 230
        );
        var20.setCharAt(var36, (char)((var102 | var66 << 2) - 230));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), mu.class.getClassLoader()).returnType();
      switch ((((var4 ^ 1507003323 ^ 258920351) + 648407969 ^ 1207714436) + 1135034855 - 1167697741 + 1312288385 ^ 391634175 ^ 1709339903) + 2019722387) {
        case 877774090:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1509288853:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1784262773:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1996481946:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      utr[(var10 - 1371325518 + 1239732181 + 2114215859 - 995098566 - 950144086 - 1548915536 - 970477462 ^ 1266497203) + 926306065 + 1876252459] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
