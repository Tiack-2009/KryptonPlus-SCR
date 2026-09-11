// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

public class rt extends wus {
  public double ti;
  public double t;
  public double oh;
  public double kd;
  public double oc;
  // [JNT] MethodHandle dispatch table (removed)
  public rt(String var1, double var2, double var4, double var6, double var8) {
    super(var1);
    this.ti = var2;
    this.t = var4;
    this.oc = var6;
    this.oh = var8;
    this.kd = var6;
  }

  public double hce() {
    return null /* jnt:encrypted */;
  }

  public void cav(double var1) {
    double var3 = 1.0 / null /* jnt:encrypted */;
    null /* jnt:encrypted *//* jnt */,
              /* jnt */, var1)
            )
            * var3
        )
        / var3
    );
  }

  public double lh() {
    return null /* jnt:encrypted */;
  }

  public double mn() {
    return null /* jnt:encrypted */;
  }

  public double mh() {
    return null /* jnt:encrypted */;
  }

  public double pc() {
    return null /* jnt:encrypted */;
  }

  public int wmb() {
    return (int)null /* jnt:encrypted */;
  }

  public float vww() {
    return (float)null /* jnt:encrypted */;
  }

  public long eg() {
    return (long)null /* jnt:encrypted */;
  }

  @Override
  public boolean d() {
    return null /* jnt:encrypted */ == null /* jnt:encrypted */;
  }

  public rt gjf(String var1) {
    /* jnt */;
    return this;
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (var10 + 1924842319 - 512236580 + 339873100 - 1988556463 ^ 1022714002 ^ 1520755485 ^ 745731026) + 35990794 ^ 1687993893;
    MethodHandle var10000 = kws[((var10 + 1924842319 - 512236580 + 339873100 - 1988556463 ^ 1022714002 ^ 1520755485 ^ 745731026) + 35990794 ^ 1687993893)
      - 605577491];
    if (kws[var10001 - 605577491] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (-1534214227 & -1534214227 | 0) & 186777616; var23 < var13.length(); var23 += (-839938352 | 1357335978) ^ -571486213) {
        int var42 = var13.charAt(var23);
        int var10004 = (var42 & 65532) >> 2;
        int var43 = (var42 & 65532) >> 2 | var42 << 14;
        int var83 = (((var42 & 65532) >> 2 | var42 << 14) & 65528) >> 3;
        var42 = ((var10004 | var42 << 14) & 65528) >> 3 | ((var42 & 65532) >> 2 | var42 << 14) << 13;
        var10004 = ((var83 | var43 << 13) & 57344) >> 13;
        int var45 = ((var83 | var43 << 13) & 57344) >> 13 | var42 << 3;
        int var85 = ((((var83 | var43 << 13) & 57344) >> 13 | var42 << 3) & 57344) >> 13;
        var42 = ((var10004 | var42 << 3) & 57344) >> 13 | (((var83 | var43 << 13) & 57344) >> 13 | var42 << 3) << 3;
        var10004 = ((var85 | var45 << 3) & 65534) >> 1;
        int var47 = ((((var85 | var45 << 3) & 65534) >> 1 | var42 << 15) - 122 ^ 231) + 152;
        int var87 = (((((var85 | var45 << 3) & 65534) >> 1 | var42 << 15) - 122 ^ 231) + 152 & 65408) >> 7;
        char var48 = (char)(
          ((((var10004 | var42 << 15) - 122 ^ 231) + 152 & 65408) >> 7 | ((((var85 | var45 << 3) & 65534) >> 1 | var42 << 15) - 122 ^ 231) + 152 << 9) ^ 77
        );
        var13.setCharAt(var23, (char)((var87 | var47 << 9) ^ 77));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (1301322642 << 1013146573 | 0) & -2012963046; var29 < var16.length(); var29 += (133522900 + -1587916737 | 0) & 338692485) {
        char var53 = var16.charAt(var29);
        int var88 = (var53 & '￼') >> 2;
        int var54 = (((var53 & '￼') >> 2 | var53 << 14) - 166 ^ 61) + 64 + 184 - 152;
        int var89 = ((((var53 & '￼') >> 2 | var53 << 14) - 166 ^ 61) + 64 + 184 - 152 & 49152) >> 14;
        var53 = (char)(
          ((((var88 | var53 << 14) - 166 ^ 61) + 64 + 184 - 152 & 49152) >> 14 | (((var53 & '￼') >> 2 | var53 << 14) - 166 ^ 61) + 64 + 184 - 152 << 2)
            - 96
            - 198
            + 9
        );
        var16.setCharAt(var29, (char)((var89 | var54 << 2) - 96 - 198 + 9));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), rt.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (-1878830234 + -1571740592 | 0) & 25790529; var35 < var19.length(); var35 += (-2066568813 << 1273102955 | 1) & 537986373) {
        char var60 = var19.charAt(var35);
        char var63 = (char)(
          (
              (
                    ((((((var60 & '쀀') >> 14 | var60 << 2) ^ 127) & 32768) >> 15 | (((var60 & '쀀') >> 14 | var60 << 2) ^ 127) << 1) & 65520) >> 4
                      | (((((var60 & '쀀') >> 14 | var60 << 2) ^ 127) & 32768) >> 15 | (((var60 & '쀀') >> 14 | var60 << 2) ^ 127) << 1) << 12
                  )
                  + 47
                  + 151
                ^ 70
                ^ 188
            )
            - 254
            + 34
        );
        var19.setCharAt(
          var35,
          (char)(
            (
                (
                      ((((((var60 & '쀀') >> 14 | var60 << 2) ^ 127) & 32768) >> 15 | (((var60 & '쀀') >> 14 | var60 << 2) ^ 127) << 1) & 65520) >> 4
                        | (((((var60 & '쀀') >> 14 | var60 << 2) ^ 127) & 32768) >> 15 | (((var60 & '쀀') >> 14 | var60 << 2) ^ 127) << 1) << 12
                    )
                    + 47
                    + 151
                  ^ 70
                  ^ 188
              )
              - 254
              + 34
          )
        );
      }

      Class var7 = Class.forName(var19.toString(), false, rt.class.getClassLoader());
      switch ((var4 + 1340688969 - 2083313507 - 1398791583 + 2131976508 + 1741766870 ^ 1085299498) - 1624832787 + 1752548199 - 1948331056 - 1766838831) {
        case 383876349:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 1039142380:
          var10000 = var0.findSpecial(var7, var5, var6, rt.class);
          break;
        case 1365910688:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 1902632576:
        case 2086869271:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    kws[((var10 + 1924842319 - 512236580 + 339873100 - 1988556463 ^ 1022714002 ^ 1520755485 ^ 745731026) + 35990794 ^ 1687993893) - 605577491] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (var10 - 1168422320 + 49032533 ^ 1906719191) + 719508437 + 1399966342 + 407388513 - 140359718 + 741440331 + 2137601647;
    MethodHandle var10000 = kws[(var10 - 1168422320 + 49032533 ^ 1906719191)
      + 719508437
      + 1399966342
      + 407388513
      - 140359718
      + 741440331
      + 2137601647
      - 640397834];
    if (kws[var10001 - 640397834] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (262629405 >> 262629405 | 0) & -1399130824; var24 < var14.length(); var24 += (-2021365464 | -548028721 | 1) & 2097169) {
        char var43 = var14.charAt(var24);
        char var50 = (char)(
          (
              (
                    (
                          (
                                (
                                    (
                                          (
                                                (
                                                      (
                                                          (
                                                                (
                                                                    (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                                      | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                                  )
                                                                  & 64512
                                                              )
                                                              >> 10
                                                            | (
                                                                (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                                  | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                              )
                                                              << 6
                                                        )
                                                        & 65520
                                                    )
                                                    >> 4
                                                  | (
                                                      (
                                                            (
                                                                (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                                  | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                              )
                                                              & 64512
                                                          )
                                                          >> 10
                                                        | (
                                                            (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                              | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                          )
                                                          << 6
                                                    )
                                                    << 12
                                              )
                                              + 5
                                            & 61440
                                        )
                                        >> 12
                                      | (
                                            (
                                                  (
                                                      (
                                                            (
                                                                (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                                  | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                              )
                                                              & 64512
                                                          )
                                                          >> 10
                                                        | (
                                                            (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                              | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                          )
                                                          << 6
                                                    )
                                                    & 65520
                                                )
                                                >> 4
                                              | (
                                                  (
                                                        (
                                                            (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                              | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                          )
                                                          & 64512
                                                      )
                                                      >> 10
                                                    | (
                                                        (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                          | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                      )
                                                      << 6
                                                )
                                                << 12
                                          )
                                          + 5
                                        << 4
                                  )
                                  & 65528
                              )
                              >> 3
                            | (
                                (
                                      (
                                            (
                                                  (
                                                      (
                                                            (
                                                                (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                                  | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                              )
                                                              & 64512
                                                          )
                                                          >> 10
                                                        | (
                                                            (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                              | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                          )
                                                          << 6
                                                    )
                                                    & 65520
                                                )
                                                >> 4
                                              | (
                                                  (
                                                        (
                                                            (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                              | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                          )
                                                          & 64512
                                                      )
                                                      >> 10
                                                    | (
                                                        (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                          | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                      )
                                                      << 6
                                                )
                                                << 12
                                          )
                                          + 5
                                        & 61440
                                    )
                                    >> 12
                                  | (
                                        (
                                              (
                                                  (
                                                        (
                                                            (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                              | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                          )
                                                          & 64512
                                                      )
                                                      >> 10
                                                    | (
                                                        (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                          | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                      )
                                                      << 6
                                                )
                                                & 65520
                                            )
                                            >> 4
                                          | (
                                              (
                                                    ((((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15 | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1)
                                                      & 64512
                                                  )
                                                  >> 10
                                                | ((((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15 | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1)
                                                  << 6
                                            )
                                            << 12
                                      )
                                      + 5
                                    << 4
                              )
                              << 13
                        )
                        - 208
                      & 65532
                  )
                  >> 2
                | (
                      (
                            (
                                (
                                      (
                                            (
                                                  (
                                                      (
                                                            (
                                                                (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                                  | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                              )
                                                              & 64512
                                                          )
                                                          >> 10
                                                        | (
                                                            (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                              | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                          )
                                                          << 6
                                                    )
                                                    & 65520
                                                )
                                                >> 4
                                              | (
                                                  (
                                                        (
                                                            (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                              | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                          )
                                                          & 64512
                                                      )
                                                      >> 10
                                                    | (
                                                        (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                          | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                      )
                                                      << 6
                                                )
                                                << 12
                                          )
                                          + 5
                                        & 61440
                                    )
                                    >> 12
                                  | (
                                        (
                                              (
                                                  (
                                                        (
                                                            (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                              | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                          )
                                                          & 64512
                                                      )
                                                      >> 10
                                                    | (
                                                        (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                          | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                      )
                                                      << 6
                                                )
                                                & 65520
                                            )
                                            >> 4
                                          | (
                                              (
                                                    ((((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15 | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1)
                                                      & 64512
                                                  )
                                                  >> 10
                                                | ((((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15 | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1)
                                                  << 6
                                            )
                                            << 12
                                      )
                                      + 5
                                    << 4
                              )
                              & 65528
                          )
                          >> 3
                        | (
                            (
                                  (
                                        (
                                              (
                                                  (
                                                        (
                                                            (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                              | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                          )
                                                          & 64512
                                                      )
                                                      >> 10
                                                    | (
                                                        (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                          | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                      )
                                                      << 6
                                                )
                                                & 65520
                                            )
                                            >> 4
                                          | (
                                              (
                                                    ((((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15 | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1)
                                                      & 64512
                                                  )
                                                  >> 10
                                                | ((((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15 | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1)
                                                  << 6
                                            )
                                            << 12
                                      )
                                      + 5
                                    & 61440
                                )
                                >> 12
                              | (
                                    (
                                          (
                                              (
                                                    ((((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15 | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1)
                                                      & 64512
                                                  )
                                                  >> 10
                                                | ((((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15 | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1)
                                                  << 6
                                            )
                                            & 65520
                                        )
                                        >> 4
                                      | (
                                          (((((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15 | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1) & 64512)
                                              >> 10
                                            | ((((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15 | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1) << 6
                                        )
                                        << 12
                                  )
                                  + 5
                                << 4
                          )
                          << 13
                    )
                    - 208
                  << 14
            )
            - 197
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
                                            (
                                                  (
                                                        (
                                                            (
                                                                  (
                                                                      (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                                        | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                                    )
                                                                    & 64512
                                                                )
                                                                >> 10
                                                              | (
                                                                  (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                                    | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                                )
                                                                << 6
                                                          )
                                                          & 65520
                                                      )
                                                      >> 4
                                                    | (
                                                        (
                                                              (
                                                                  (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                                    | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                                )
                                                                & 64512
                                                            )
                                                            >> 10
                                                          | (
                                                              (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                                | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                            )
                                                            << 6
                                                      )
                                                      << 12
                                                )
                                                + 5
                                              & 61440
                                          )
                                          >> 12
                                        | (
                                              (
                                                    (
                                                        (
                                                              (
                                                                  (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                                    | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                                )
                                                                & 64512
                                                            )
                                                            >> 10
                                                          | (
                                                              (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                                | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                            )
                                                            << 6
                                                      )
                                                      & 65520
                                                  )
                                                  >> 4
                                                | (
                                                    (
                                                          (
                                                              (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                                | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                            )
                                                            & 64512
                                                        )
                                                        >> 10
                                                      | (
                                                          (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                            | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                        )
                                                        << 6
                                                  )
                                                  << 12
                                            )
                                            + 5
                                          << 4
                                    )
                                    & 65528
                                )
                                >> 3
                              | (
                                  (
                                        (
                                              (
                                                    (
                                                        (
                                                              (
                                                                  (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                                    | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                                )
                                                                & 64512
                                                            )
                                                            >> 10
                                                          | (
                                                              (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                                | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                            )
                                                            << 6
                                                      )
                                                      & 65520
                                                  )
                                                  >> 4
                                                | (
                                                    (
                                                          (
                                                              (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                                | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                            )
                                                            & 64512
                                                        )
                                                        >> 10
                                                      | (
                                                          (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                            | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                        )
                                                        << 6
                                                  )
                                                  << 12
                                            )
                                            + 5
                                          & 61440
                                      )
                                      >> 12
                                    | (
                                          (
                                                (
                                                    (
                                                          (
                                                              (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                                | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                            )
                                                            & 64512
                                                        )
                                                        >> 10
                                                      | (
                                                          (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                            | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                        )
                                                        << 6
                                                  )
                                                  & 65520
                                              )
                                              >> 4
                                            | (
                                                (
                                                      (
                                                          (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                            | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                        )
                                                        & 64512
                                                    )
                                                    >> 10
                                                  | ((((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15 | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1)
                                                    << 6
                                              )
                                              << 12
                                        )
                                        + 5
                                      << 4
                                )
                                << 13
                          )
                          - 208
                        & 65532
                    )
                    >> 2
                  | (
                        (
                              (
                                  (
                                        (
                                              (
                                                    (
                                                        (
                                                              (
                                                                  (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                                    | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                                )
                                                                & 64512
                                                            )
                                                            >> 10
                                                          | (
                                                              (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                                | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                            )
                                                            << 6
                                                      )
                                                      & 65520
                                                  )
                                                  >> 4
                                                | (
                                                    (
                                                          (
                                                              (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                                | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                            )
                                                            & 64512
                                                        )
                                                        >> 10
                                                      | (
                                                          (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                            | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                        )
                                                        << 6
                                                  )
                                                  << 12
                                            )
                                            + 5
                                          & 61440
                                      )
                                      >> 12
                                    | (
                                          (
                                                (
                                                    (
                                                          (
                                                              (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                                | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                            )
                                                            & 64512
                                                        )
                                                        >> 10
                                                      | (
                                                          (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                            | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                        )
                                                        << 6
                                                  )
                                                  & 65520
                                              )
                                              >> 4
                                            | (
                                                (
                                                      (
                                                          (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                            | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                        )
                                                        & 64512
                                                    )
                                                    >> 10
                                                  | ((((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15 | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1)
                                                    << 6
                                              )
                                              << 12
                                        )
                                        + 5
                                      << 4
                                )
                                & 65528
                            )
                            >> 3
                          | (
                              (
                                    (
                                          (
                                                (
                                                    (
                                                          (
                                                              (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                                | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                            )
                                                            & 64512
                                                        )
                                                        >> 10
                                                      | (
                                                          (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                            | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                        )
                                                        << 6
                                                  )
                                                  & 65520
                                              )
                                              >> 4
                                            | (
                                                (
                                                      (
                                                          (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                            | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                        )
                                                        & 64512
                                                    )
                                                    >> 10
                                                  | ((((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15 | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1)
                                                    << 6
                                              )
                                              << 12
                                        )
                                        + 5
                                      & 61440
                                  )
                                  >> 12
                                | (
                                      (
                                            (
                                                (
                                                      (
                                                          (((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15
                                                            | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1
                                                        )
                                                        & 64512
                                                    )
                                                    >> 10
                                                  | ((((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15 | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1)
                                                    << 6
                                              )
                                              & 65520
                                          )
                                          >> 4
                                        | (
                                            (
                                                  ((((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15 | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1)
                                                    & 64512
                                                )
                                                >> 10
                                              | ((((var43 & '\ufff0') >> 4 | var43 << '\f') & 32768) >> 15 | ((var43 & '\ufff0') >> 4 | var43 << '\f') << 1)
                                                << 6
                                          )
                                          << 12
                                    )
                                    + 5
                                  << 4
                            )
                            << 13
                      )
                      - 208
                    << 14
              )
              - 197
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = -649617453 & (-649617453 ^ -1825435894) ^ 1212518609; var30 < var17.length(); var30 += 1353314537 & -1259090512 ^ 279036065) {
        char var55 = var17.charAt(var30);
        char var62 = (char)(
          (
              (
                    (
                        (
                              (
                                  (
                                        (
                                            (
                                                (
                                                      (
                                                          (
                                                                (
                                                                    (((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16
                                                                      | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0
                                                                  )
                                                                  & 65408
                                                              )
                                                              >> 7
                                                            | ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0)
                                                              << 9
                                                        )
                                                        & 65520
                                                    )
                                                    >> 4
                                                  | (
                                                      (
                                                            ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0)
                                                              & 65408
                                                          )
                                                          >> 7
                                                        | ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0)
                                                          << 9
                                                    )
                                                    << 12
                                              )
                                              ^ 206
                                          )
                                          & 65532
                                      )
                                      >> 2
                                    | (
                                        (
                                            (
                                                  (
                                                      (
                                                            ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0)
                                                              & 65408
                                                          )
                                                          >> 7
                                                        | ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0)
                                                          << 9
                                                    )
                                                    & 65520
                                                )
                                                >> 4
                                              | (
                                                  (((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) & 65408)
                                                      >> 7
                                                    | ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) << 9
                                                )
                                                << 12
                                          )
                                          ^ 206
                                      )
                                      << 14
                                )
                                & 65532
                            )
                            >> 2
                          | (
                              (
                                    (
                                        (
                                            (
                                                  (
                                                      (
                                                            ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0)
                                                              & 65408
                                                          )
                                                          >> 7
                                                        | ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0)
                                                          << 9
                                                    )
                                                    & 65520
                                                )
                                                >> 4
                                              | (
                                                  (((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) & 65408)
                                                      >> 7
                                                    | ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) << 9
                                                )
                                                << 12
                                          )
                                          ^ 206
                                      )
                                      & 65532
                                  )
                                  >> 2
                                | (
                                    (
                                        (
                                              (
                                                  (((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) & 65408)
                                                      >> 7
                                                    | ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) << 9
                                                )
                                                & 65520
                                            )
                                            >> 4
                                          | (
                                              (((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) & 65408) >> 7
                                                | ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) << 9
                                            )
                                            << 12
                                      )
                                      ^ 206
                                  )
                                  << 14
                            )
                            << 14
                      )
                      & 64512
                  )
                  >> 10
                | (
                    (
                          (
                              (
                                    (
                                        (
                                            (
                                                  (
                                                      (
                                                            ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0)
                                                              & 65408
                                                          )
                                                          >> 7
                                                        | ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0)
                                                          << 9
                                                    )
                                                    & 65520
                                                )
                                                >> 4
                                              | (
                                                  (((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) & 65408)
                                                      >> 7
                                                    | ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) << 9
                                                )
                                                << 12
                                          )
                                          ^ 206
                                      )
                                      & 65532
                                  )
                                  >> 2
                                | (
                                    (
                                        (
                                              (
                                                  (((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) & 65408)
                                                      >> 7
                                                    | ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) << 9
                                                )
                                                & 65520
                                            )
                                            >> 4
                                          | (
                                              (((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) & 65408) >> 7
                                                | ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) << 9
                                            )
                                            << 12
                                      )
                                      ^ 206
                                  )
                                  << 14
                            )
                            & 65532
                        )
                        >> 2
                      | (
                          (
                                (
                                    (
                                        (
                                              (
                                                  (((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) & 65408)
                                                      >> 7
                                                    | ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) << 9
                                                )
                                                & 65520
                                            )
                                            >> 4
                                          | (
                                              (((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) & 65408) >> 7
                                                | ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) << 9
                                            )
                                            << 12
                                      )
                                      ^ 206
                                  )
                                  & 65532
                              )
                              >> 2
                            | (
                                (
                                    (
                                          (
                                              (((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) & 65408) >> 7
                                                | ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) << 9
                                            )
                                            & 65520
                                        )
                                        >> 4
                                      | (
                                          (((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) & 65408) >> 7
                                            | ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) << 9
                                        )
                                        << 12
                                  )
                                  ^ 206
                              )
                              << 14
                        )
                        << 14
                  )
                  << 6
            )
            - 47
        );
        var17.setCharAt(
          var30,
          (char)(
            (
                (
                      (
                          (
                                (
                                    (
                                          (
                                              (
                                                  (
                                                        (
                                                            (
                                                                  (
                                                                      (((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16
                                                                        | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0
                                                                    )
                                                                    & 65408
                                                                )
                                                                >> 7
                                                              | (
                                                                  (((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16
                                                                    | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0
                                                                )
                                                                << 9
                                                          )
                                                          & 65520
                                                      )
                                                      >> 4
                                                    | (
                                                        (
                                                              ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0)
                                                                & 65408
                                                            )
                                                            >> 7
                                                          | ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0)
                                                            << 9
                                                      )
                                                      << 12
                                                )
                                                ^ 206
                                            )
                                            & 65532
                                        )
                                        >> 2
                                      | (
                                          (
                                              (
                                                    (
                                                        (
                                                              ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0)
                                                                & 65408
                                                            )
                                                            >> 7
                                                          | ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0)
                                                            << 9
                                                      )
                                                      & 65520
                                                  )
                                                  >> 4
                                                | (
                                                    (((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) & 65408)
                                                        >> 7
                                                      | ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) << 9
                                                  )
                                                  << 12
                                            )
                                            ^ 206
                                        )
                                        << 14
                                  )
                                  & 65532
                              )
                              >> 2
                            | (
                                (
                                      (
                                          (
                                              (
                                                    (
                                                        (
                                                              ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0)
                                                                & 65408
                                                            )
                                                            >> 7
                                                          | ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0)
                                                            << 9
                                                      )
                                                      & 65520
                                                  )
                                                  >> 4
                                                | (
                                                    (((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) & 65408)
                                                        >> 7
                                                      | ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) << 9
                                                  )
                                                  << 12
                                            )
                                            ^ 206
                                        )
                                        & 65532
                                    )
                                    >> 2
                                  | (
                                      (
                                          (
                                                (
                                                    (((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) & 65408)
                                                        >> 7
                                                      | ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) << 9
                                                  )
                                                  & 65520
                                              )
                                              >> 4
                                            | (
                                                (((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) & 65408)
                                                    >> 7
                                                  | ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) << 9
                                              )
                                              << 12
                                        )
                                        ^ 206
                                    )
                                    << 14
                              )
                              << 14
                        )
                        & 64512
                    )
                    >> 10
                  | (
                      (
                            (
                                (
                                      (
                                          (
                                              (
                                                    (
                                                        (
                                                              ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0)
                                                                & 65408
                                                            )
                                                            >> 7
                                                          | ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0)
                                                            << 9
                                                      )
                                                      & 65520
                                                  )
                                                  >> 4
                                                | (
                                                    (((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) & 65408)
                                                        >> 7
                                                      | ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) << 9
                                                  )
                                                  << 12
                                            )
                                            ^ 206
                                        )
                                        & 65532
                                    )
                                    >> 2
                                  | (
                                      (
                                          (
                                                (
                                                    (((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) & 65408)
                                                        >> 7
                                                      | ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) << 9
                                                  )
                                                  & 65520
                                              )
                                              >> 4
                                            | (
                                                (((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) & 65408)
                                                    >> 7
                                                  | ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) << 9
                                              )
                                              << 12
                                        )
                                        ^ 206
                                    )
                                    << 14
                              )
                              & 65532
                          )
                          >> 2
                        | (
                            (
                                  (
                                      (
                                          (
                                                (
                                                    (((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) & 65408)
                                                        >> 7
                                                      | ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) << 9
                                                  )
                                                  & 65520
                                              )
                                              >> 4
                                            | (
                                                (((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) & 65408)
                                                    >> 7
                                                  | ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) << 9
                                              )
                                              << 12
                                        )
                                        ^ 206
                                    )
                                    & 65532
                                )
                                >> 2
                              | (
                                  (
                                      (
                                            (
                                                (((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) & 65408)
                                                    >> 7
                                                  | ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) << 9
                                              )
                                              & 65520
                                          )
                                          >> 4
                                        | (
                                            (((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) & 65408) >> 7
                                              | ((((var55 & '︀') >> 9 | var55 << 7) - 63 & 0) >> 16 | ((var55 & '︀') >> 9 | var55 << 7) - 63 << 0) << 9
                                          )
                                          << 12
                                    )
                                    ^ 206
                                )
                                << 14
                          )
                          << 14
                    )
                    << 6
              )
              - 47
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, rt.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (-1590315544 - 508994087 | 0) & 939524142; var36 < var20.length(); var36 += 102091212 >> 938346400 ^ 102091213) {
        int var67 = var20.charAt(var36);
        int var115 = (var67 & 65532) >> 2;
        int var68 = (var67 & 65532) >> 2 | var67 << 14;
        int var116 = (((var67 & 65532) >> 2 | var67 << 14) & 65504) >> 5;
        var67 = ((var115 | var67 << 14) & 65504) >> 5 | ((var67 & 65532) >> 2 | var67 << 14) << 11;
        var115 = ((var116 | var68 << 11) & 65528) >> 3;
        int var70 = ((var116 | var68 << 11) & 65528) >> 3 | var67 << 13;
        int var118 = ((((var116 | var68 << 11) & 65528) >> 3 | var67 << 13) & 65535) >> 0;
        var67 = (((var115 | var67 << 13) & 65535) >> 0 | (((var116 | var68 << 11) & 65528) >> 3 | var67 << 13) << 16) + 68;
        var115 = ((var118 | var70 << 16) + 68 & 32768) >> 15;
        int var72 = ((var118 | var70 << 16) + 68 & 32768) >> 15 | var67 << 1;
        int var120 = ((((var118 | var70 << 16) + 68 & 32768) >> 15 | var67 << 1) & 32768) >> 15;
        char var73 = (char)(((((var115 | var67 << 1) & 32768) >> 15 | (((var118 | var70 << 16) + 68 & 32768) >> 15 | var67 << 1) << 1) ^ 247) - 83 - 175);
        var20.setCharAt(var36, (char)(((var120 | var72 << 1) ^ 247) - 83 - 175));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), rt.class.getClassLoader()).returnType();
      switch ((var4 - 852321998 + 1889574446 + 710829437 ^ 1736046585 ^ 209984586 ^ 569427107) - 1425413721 - 1625743523 - 1212230976 + 1408466801) {
        case 132226180:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 644022978:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1170089141:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1888531263:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      kws[(var10 - 1168422320 + 49032533 ^ 1906719191) + 719508437 + 1399966342 + 407388513 - 140359718 + 741440331 + 2137601647 - 640397834] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
