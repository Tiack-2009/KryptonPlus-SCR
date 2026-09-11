// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

public class f extends wus {
  public zn f;
  public zn l;
  public double z = 0.0;
  // [JNT] MethodHandle dispatch table (removed)
  public f(String var1, zn var2) {
    super(var1);
    this.l = /* jnt */;
    this.f = /* jnt */;
    float[] var3 = /* jnt */,
      null /* jnt:encrypted */,
      null /* jnt:encrypted */,
      null
    );
    this.z = (double)(var3[0] * 360.0F);
  }

  public f(String var1, int var2, int var3, int var4) {
    this(var1, (zn)/* jnt */);
  }

  public f(String var1, int var2, int var3, int var4, int var5) {
    this(var1, (zn)/* jnt */);
  }

  public zn m() {
    return null /* jnt:encrypted */;
  }

  public void p(zn var1) {
    /* jnt */, var1);
  }

  public void q(int var1, int var2, int var3, int var4) {
    /* jnt */, var1, var2, var3, var4);
  }

  public zn u() {
    return null /* jnt:encrypted */;
  }

  public int k() {
    return null /* jnt:encrypted */);
  }

  public int j() {
    return null /* jnt:encrypted */);
  }

  public int t() {
    return null /* jnt:encrypted */);
  }

  public int w() {
    return null /* jnt:encrypted */);
  }

  public int l() {
    return /* jnt */);
  }

  public zn r() {
    return (zn)/* jnt */),
      null /* jnt:encrypted */),
      null /* jnt:encrypted */),
      null /* jnt:encrypted */)
    );
  }

  public double c() {
    return null /* jnt:encrypted */;
  }

  public void o(double var1) {
    null /* jnt:encrypted */;
  }

  @Override
  public boolean d() {
    return null /* jnt:encrypted */)
        == null /* jnt:encrypted */)
      && null /* jnt:encrypted */)
        == null /* jnt:encrypted */)
      && null /* jnt:encrypted */)
        == null /* jnt:encrypted */)
      && null /* jnt:encrypted */)
        == null /* jnt:encrypted */);
  }

  public f y(String var1) {
    /* jnt */;
    return this;
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 + 1496727013 ^ 719361415) - 1913457213 - 897362968 - 1675243475 + 87439893 - 1960846361 ^ 1399838238) - 2042044324;
    MethodHandle var10000 = aetj[((var10 + 1496727013 ^ 719361415) - 1913457213 - 897362968 - 1675243475 + 87439893 - 1960846361 ^ 1399838238)
      - 2042044324
      - 1634381578];
    if (aetj[var10001 - 1634381578] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = 1545496726 ^ -141120616 ^ -1417100530; var23 < var13.length(); var23 += -453565867 ^ -1731904425 ^ 2083659267) {
        int var42 = (var13.charAt(var23) ^ 1) - 251 + 174;
        char var43 = (char)((((((var42 & 64512) >> 10 | var42 << 6) ^ 119) + 129 ^ 38) - 30 ^ 196) - 65);
        var13.setCharAt(var23, (char)((((((var42 & 64512) >> 10 | var42 << 6) ^ 119) + 129 ^ 38) - 30 ^ 196) - 65));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (1029893010 ^ 1029893010 | 0) & 1898755462; var29 < var16.length(); var29 += -1649505293 * -238977857 ^ 1983323724) {
        int var48 = var16.charAt(var29);
        int var79 = (var48 & 65024) >> 9;
        int var49 = (var48 & 65024) >> 9 | var48 << 7;
        int var80 = (((var48 & 65024) >> 9 | var48 << 7) & 65024) >> 9;
        var48 = ((((var79 | var48 << 7) & 65024) >> 9 | ((var48 & 65024) >> 9 | var48 << 7) << 7) - 225 ^ 21) - 139 - 92;
        var79 = (((var80 | var49 << 7) - 225 ^ 21) - 139 - 92 & 0) >> 16;
        int var51 = (((((var80 | var49 << 7) - 225 ^ 21) - 139 - 92 & 0) >> 16 | var48 << 0) ^ 227) - 36;
        int var82 = ((((((var80 | var49 << 7) - 225 ^ 21) - 139 - 92 & 0) >> 16 | var48 << 0) ^ 227) - 36 & 65408) >> 7;
        char var52 = (char)(
          (((var79 | var48 << 0) ^ 227) - 36 & 65408) >> 7 | (((((var80 | var49 << 7) - 225 ^ 21) - 139 - 92 & 0) >> 16 | var48 << 0) ^ 227) - 36 << 9
        );
        var16.setCharAt(var29, (char)(var82 | var51 << 9));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), f.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = -256456793 - -374821042 ^ 118364249; var35 < var19.length(); var35 += (-1527619234 & -1816634492 | 1) & 1678028489) {
        int var57 = var19.charAt(var35) + 145 + 221;
        int var83 = (var57 & 65528) >> 3;
        int var58 = (((var57 & 65528) >> 3 | var57 << 13) ^ 65) - 199;
        int var84 = ((((var57 & 65528) >> 3 | var57 << 13) ^ 65) - 199 & 65534) >> 1;
        var57 = ((((var83 | var57 << 13) ^ 65) - 199 & 65534) >> 1 | (((var57 & 65528) >> 3 | var57 << 13) ^ 65) - 199 << 15) + 39 + 173;
        var83 = ((var84 | var58 << 15) + 39 + 173 & 65024) >> 9;
        int var60 = ((var84 | var58 << 15) + 39 + 173 & 65024) >> 9 | var57 << 7;
        int var86 = ((((var84 | var58 << 15) + 39 + 173 & 65024) >> 9 | var57 << 7) & 65472) >> 6;
        char var61 = (char)(((var83 | var57 << 7) & 65472) >> 6 | (((var84 | var58 << 15) + 39 + 173 & 65024) >> 9 | var57 << 7) << 10);
        var19.setCharAt(var35, (char)(var86 | var60 << 10));
      }

      Class var7 = Class.forName(var19.toString(), false, f.class.getClassLoader());
      switch ((((var4 ^ 1358874085) + 1756837164 + 1079623399 + 171475117 ^ 2114687955 ^ 2007771260) - 1868069685 - 682257193 ^ 311506582) + 1319531531) {
        case 64189523:
          var10000 = var0.findSpecial(var7, var5, var6, f.class);
          break;
        case 421648381:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 665259226:
        case 1823790094:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1860346957:
          var10000 = var0.findConstructor(var7, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    aetj[((var10 + 1496727013 ^ 719361415) - 1913457213 - 897362968 - 1675243475 + 87439893 - 1960846361 ^ 1399838238) - 2042044324 - 1634381578] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 ^ 1955883254 ^ 90909415) - 13319509 + 311774091 ^ 1362716286) + 444668619 - 1841057285 + 2044490480 ^ 343302040;
    MethodHandle var10000 = aetj[(((var10 ^ 1955883254 ^ 90909415) - 13319509 + 311774091 ^ 1362716286) + 444668619 - 1841057285 + 2044490480 ^ 343302040)
      + 1779677125];
    if (aetj[var10001 + 1779677125] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = -192772624 >> -1854075765 ^ -94128; var24 < var14.length(); var24 += -641879070 >>> -641879070 ^ 913272057) {
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
                                                          (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135)
                                                            & 65532
                                                        )
                                                        >> 2
                                                      | (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135)
                                                        << 14
                                                  )
                                                  & 65528
                                              )
                                              >> 3
                                            | (
                                                ((((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) & 65532)
                                                    >> 2
                                                  | (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135)
                                                    << 14
                                              )
                                              << 13
                                        )
                                        & 57344
                                    )
                                    >> 13
                                  | (
                                      (
                                            (
                                                ((((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) & 65532)
                                                    >> 2
                                                  | (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135)
                                                    << 14
                                              )
                                              & 65528
                                          )
                                          >> 3
                                        | (
                                            ((((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) & 65532)
                                                >> 2
                                              | (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) << 14
                                          )
                                          << 13
                                    )
                                    << 3
                              )
                              + 137
                              - 143
                            & 65504
                        )
                        >> 5
                      | (
                            (
                                  (
                                      (
                                            (
                                                ((((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) & 65532)
                                                    >> 2
                                                  | (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135)
                                                    << 14
                                              )
                                              & 65528
                                          )
                                          >> 3
                                        | (
                                            ((((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) & 65532)
                                                >> 2
                                              | (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) << 14
                                          )
                                          << 13
                                    )
                                    & 57344
                                )
                                >> 13
                              | (
                                  (
                                        (
                                            ((((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) & 65532)
                                                >> 2
                                              | (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) << 14
                                          )
                                          & 65528
                                      )
                                      >> 3
                                    | (
                                        ((((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) & 65532) >> 2
                                          | (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) << 14
                                      )
                                      << 13
                                )
                                << 3
                          )
                          + 137
                          - 143
                        << 11
                  )
                  & 65504
              )
              >> 5
            | (
                (
                      (
                            (
                                  (
                                      (
                                            (
                                                ((((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) & 65532)
                                                    >> 2
                                                  | (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135)
                                                    << 14
                                              )
                                              & 65528
                                          )
                                          >> 3
                                        | (
                                            ((((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) & 65532)
                                                >> 2
                                              | (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) << 14
                                          )
                                          << 13
                                    )
                                    & 57344
                                )
                                >> 13
                              | (
                                  (
                                        (
                                            ((((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) & 65532)
                                                >> 2
                                              | (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) << 14
                                          )
                                          & 65528
                                      )
                                      >> 3
                                    | (
                                        ((((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) & 65532) >> 2
                                          | (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) << 14
                                      )
                                      << 13
                                )
                                << 3
                          )
                          + 137
                          - 143
                        & 65504
                    )
                    >> 5
                  | (
                        (
                              (
                                  (
                                        (
                                            ((((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) & 65532)
                                                >> 2
                                              | (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) << 14
                                          )
                                          & 65528
                                      )
                                      >> 3
                                    | (
                                        ((((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) & 65532) >> 2
                                          | (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) << 14
                                      )
                                      << 13
                                )
                                & 57344
                            )
                            >> 13
                          | (
                              (
                                    (
                                        ((((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) & 65532) >> 2
                                          | (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) << 14
                                      )
                                      & 65528
                                  )
                                  >> 3
                                | (
                                    ((((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) & 65532) >> 2
                                      | (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) << 14
                                  )
                                  << 13
                            )
                            << 3
                      )
                      + 137
                      - 143
                    << 11
              )
              << 11
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
                                                                ((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16)
                                                                  ^ 135
                                                              )
                                                              & 65532
                                                          )
                                                          >> 2
                                                        | (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135)
                                                          << 14
                                                    )
                                                    & 65528
                                                )
                                                >> 3
                                              | (
                                                  (
                                                        (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135)
                                                          & 65532
                                                      )
                                                      >> 2
                                                    | (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135)
                                                      << 14
                                                )
                                                << 13
                                          )
                                          & 57344
                                      )
                                      >> 13
                                    | (
                                        (
                                              (
                                                  (
                                                        (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135)
                                                          & 65532
                                                      )
                                                      >> 2
                                                    | (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135)
                                                      << 14
                                                )
                                                & 65528
                                            )
                                            >> 3
                                          | (
                                              ((((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) & 65532)
                                                  >> 2
                                                | (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) << 14
                                            )
                                            << 13
                                      )
                                      << 3
                                )
                                + 137
                                - 143
                              & 65504
                          )
                          >> 5
                        | (
                              (
                                    (
                                        (
                                              (
                                                  (
                                                        (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135)
                                                          & 65532
                                                      )
                                                      >> 2
                                                    | (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135)
                                                      << 14
                                                )
                                                & 65528
                                            )
                                            >> 3
                                          | (
                                              ((((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) & 65532)
                                                  >> 2
                                                | (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) << 14
                                            )
                                            << 13
                                      )
                                      & 57344
                                  )
                                  >> 13
                                | (
                                    (
                                          (
                                              ((((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) & 65532)
                                                  >> 2
                                                | (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) << 14
                                            )
                                            & 65528
                                        )
                                        >> 3
                                      | (
                                          ((((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) & 65532) >> 2
                                            | (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) << 14
                                        )
                                        << 13
                                  )
                                  << 3
                            )
                            + 137
                            - 143
                          << 11
                    )
                    & 65504
                )
                >> 5
              | (
                  (
                        (
                              (
                                    (
                                        (
                                              (
                                                  (
                                                        (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135)
                                                          & 65532
                                                      )
                                                      >> 2
                                                    | (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135)
                                                      << 14
                                                )
                                                & 65528
                                            )
                                            >> 3
                                          | (
                                              ((((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) & 65532)
                                                  >> 2
                                                | (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) << 14
                                            )
                                            << 13
                                      )
                                      & 57344
                                  )
                                  >> 13
                                | (
                                    (
                                          (
                                              ((((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) & 65532)
                                                  >> 2
                                                | (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) << 14
                                            )
                                            & 65528
                                        )
                                        >> 3
                                      | (
                                          ((((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) & 65532) >> 2
                                            | (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) << 14
                                        )
                                        << 13
                                  )
                                  << 3
                            )
                            + 137
                            - 143
                          & 65504
                      )
                      >> 5
                    | (
                          (
                                (
                                    (
                                          (
                                              ((((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) & 65532)
                                                  >> 2
                                                | (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) << 14
                                            )
                                            & 65528
                                        )
                                        >> 3
                                      | (
                                          ((((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) & 65532) >> 2
                                            | (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) << 14
                                        )
                                        << 13
                                  )
                                  & 57344
                              )
                              >> 13
                            | (
                                (
                                      (
                                          ((((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) & 65532) >> 2
                                            | (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) << 14
                                        )
                                        & 65528
                                    )
                                    >> 3
                                  | (
                                      ((((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) & 65532) >> 2
                                        | (((((var43 & '耀') >> 15 | var43 << 1) & 65535) >> 0 | ((var43 & '耀') >> 15 | var43 << 1) << 16) ^ 135) << 14
                                    )
                                    << 13
                              )
                              << 3
                        )
                        + 137
                        - 143
                      << 11
                )
                << 11
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (-1262577308 ^ -1703446599 | 0) & -1054600928; var30 < var17.length(); var30 += 726746592 >>> 1670085790 ^ 1) {
        int var55 = var17.charAt(var30) + 211 + 106;
        int var98 = (var55 & 65472) >> 6;
        int var56 = (var55 & 65472) >> 6 | var55 << 10;
        int var99 = (((var55 & 65472) >> 6 | var55 << 10) & 57344) >> 13;
        var55 = (((var98 | var55 << 10) & 57344) >> 13 | ((var55 & 65472) >> 6 | var55 << 10) << 3) + 3;
        var98 = ((var99 | var56 << 3) + 3 & 61440) >> 12;
        int var58 = (((var99 | var56 << 3) + 3 & 61440) >> 12 | var55 << 4) ^ 220;
        int var101 = (((((var99 | var56 << 3) + 3 & 61440) >> 12 | var55 << 4) ^ 220) & 61440) >> 12;
        char var59 = (char)(((((var98 | var55 << 4) ^ 220) & 61440) >> 12 | ((((var99 | var56 << 3) + 3 & 61440) >> 12 | var55 << 4) ^ 220) << 4) + 133 - 212);
        var17.setCharAt(var30, (char)((var101 | var58 << 4) + 133 - 212));
      }

      Class var6 = Class.forName(var17.toString(), false, f.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (178670609 << 178670609 | 0) & 1124864562; var36 < var20.length(); var36 += (916547662 * (916547662 + 916547662) | 1) & 1149833267) {
        int var64 = var20.charAt(var36);
        int var102 = (var64 & 65472) >> 6;
        int var65 = (var64 & 65472) >> 6 | var64 << 10;
        int var103 = (((var64 & 65472) >> 6 | var64 << 10) & 64512) >> 10;
        var64 = ((var102 | var64 << 10) & 64512) >> 10 | ((var64 & 65472) >> 6 | var64 << 10) << 6;
        var102 = ((var103 | var65 << 6) & 65024) >> 9;
        int var67 = (((var103 | var65 << 6) & 65024) >> 9 | var64 << 7) - 16 + 192 ^ 56 ^ 207;
        int var105 = (((((var103 | var65 << 6) & 65024) >> 9 | var64 << 7) - 16 + 192 ^ 56 ^ 207) & 57344) >> 13;
        char var68 = (char)(
          (
              ((((var102 | var64 << 7) - 16 + 192 ^ 56 ^ 207) & 57344) >> 13 | ((((var103 | var65 << 6) & 65024) >> 9 | var64 << 7) - 16 + 192 ^ 56 ^ 207) << 3)
                ^ 7
            )
            + 159
        );
        var20.setCharAt(var36, (char)(((var105 | var67 << 3) ^ 7) + 159));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), f.class.getClassLoader()).returnType();
      switch ((((var4 ^ 2064012409) + 638797013 ^ 254051919) + 1442135380 + 372283028 + 1271671277 ^ 67648299 ^ 1586970558 ^ 1412284340) - 635772777) {
        case 81466030:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 390107974:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 582774848:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 840906698:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      aetj[(((var10 ^ 1955883254 ^ 90909415) - 13319509 + 311774091 ^ 1362716286) + 444668619 - 1841057285 + 2044490480 ^ 343302040) + 1779677125] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
