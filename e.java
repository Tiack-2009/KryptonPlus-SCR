// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

public class e extends wus {
  public String o;
  public String bd;
  // [JNT] MethodHandle dispatch table (removed)
  public e(String var1, String var2) {
    super(var1);
    this.o = var2;
    this.bd = var2;
  }

  public String db() {
    return null /* jnt:encrypted */;
  }

  public String je() {
    return null /* jnt:encrypted */;
  }

  public void lxd(String var1) {
    null /* jnt:encrypted */;
  }

  @Override
  public boolean d() {
    return /* jnt */,
      null /* jnt:encrypted */
    );
  }

  public e yhw(String var1) {
    /* jnt */;
    return this;
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 ^ 1187383750 ^ 158530910 ^ 988426831 ^ 960080379) + 853826858 - 1694912687 ^ 347781123 ^ 417623123) - 3249434;
    MethodHandle var10000 = nqu[((var10 ^ 1187383750 ^ 158530910 ^ 988426831 ^ 960080379) + 853826858 - 1694912687 ^ 347781123 ^ 417623123) - 3249434
      ^ 1128023798];
    if (nqu[var10001 ^ 1128023798] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (2065323831 >>> 2065323831 | 0) & 1995687680;
        var23 < var13.length();
        var23 += (-2142934304 + -1286444890 + -2142934304 | 1) & 1210236945
      ) {
        int var42 = var13.charAt(var23) + 187;
        char var47 = (char)(
          (
                (
                    (
                          (
                              (
                                    (((((var42 & 49152) >> 14 | var42 << 2) + 57 & 65534) >> 1 | ((var42 & 49152) >> 14 | var42 << 2) + 57 << 15) + 183 ^ 15)
                                        - 166
                                      & 65534
                                  )
                                  >> 1
                                | (((((var42 & 49152) >> 14 | var42 << 2) + 57 & 65534) >> 1 | ((var42 & 49152) >> 14 | var42 << 2) + 57 << 15) + 183 ^ 15)
                                    - 166
                                  << 15
                            )
                            & 32768
                        )
                        >> 15
                      | (
                          (
                                (((((var42 & 49152) >> 14 | var42 << 2) + 57 & 65534) >> 1 | ((var42 & 49152) >> 14 | var42 << 2) + 57 << 15) + 183 ^ 15) - 166
                                  & 65534
                              )
                              >> 1
                            | (((((var42 & 49152) >> 14 | var42 << 2) + 57 & 65534) >> 1 | ((var42 & 49152) >> 14 | var42 << 2) + 57 << 15) + 183 ^ 15) - 166
                              << 15
                        )
                        << 1
                  )
                  & 65504
              )
              >> 5
            | (
                (
                      (
                          (
                                (((((var42 & 49152) >> 14 | var42 << 2) + 57 & 65534) >> 1 | ((var42 & 49152) >> 14 | var42 << 2) + 57 << 15) + 183 ^ 15) - 166
                                  & 65534
                              )
                              >> 1
                            | (((((var42 & 49152) >> 14 | var42 << 2) + 57 & 65534) >> 1 | ((var42 & 49152) >> 14 | var42 << 2) + 57 << 15) + 183 ^ 15) - 166
                              << 15
                        )
                        & 32768
                    )
                    >> 15
                  | (
                      ((((((var42 & 49152) >> 14 | var42 << 2) + 57 & 65534) >> 1 | ((var42 & 49152) >> 14 | var42 << 2) + 57 << 15) + 183 ^ 15) - 166 & 65534)
                          >> 1
                        | (((((var42 & 49152) >> 14 | var42 << 2) + 57 & 65534) >> 1 | ((var42 & 49152) >> 14 | var42 << 2) + 57 << 15) + 183 ^ 15) - 166 << 15
                    )
                    << 1
              )
              << 11
        );
        var13.setCharAt(
          var23,
          (char)(
            (
                  (
                      (
                            (
                                (
                                      (((((var42 & 49152) >> 14 | var42 << 2) + 57 & 65534) >> 1 | ((var42 & 49152) >> 14 | var42 << 2) + 57 << 15) + 183 ^ 15)
                                          - 166
                                        & 65534
                                    )
                                    >> 1
                                  | (((((var42 & 49152) >> 14 | var42 << 2) + 57 & 65534) >> 1 | ((var42 & 49152) >> 14 | var42 << 2) + 57 << 15) + 183 ^ 15)
                                      - 166
                                    << 15
                              )
                              & 32768
                          )
                          >> 15
                        | (
                            (
                                  (((((var42 & 49152) >> 14 | var42 << 2) + 57 & 65534) >> 1 | ((var42 & 49152) >> 14 | var42 << 2) + 57 << 15) + 183 ^ 15)
                                      - 166
                                    & 65534
                                )
                                >> 1
                              | (((((var42 & 49152) >> 14 | var42 << 2) + 57 & 65534) >> 1 | ((var42 & 49152) >> 14 | var42 << 2) + 57 << 15) + 183 ^ 15) - 166
                                << 15
                          )
                          << 1
                    )
                    & 65504
                )
                >> 5
              | (
                  (
                        (
                            (
                                  (((((var42 & 49152) >> 14 | var42 << 2) + 57 & 65534) >> 1 | ((var42 & 49152) >> 14 | var42 << 2) + 57 << 15) + 183 ^ 15)
                                      - 166
                                    & 65534
                                )
                                >> 1
                              | (((((var42 & 49152) >> 14 | var42 << 2) + 57 & 65534) >> 1 | ((var42 & 49152) >> 14 | var42 << 2) + 57 << 15) + 183 ^ 15) - 166
                                << 15
                          )
                          & 32768
                      )
                      >> 15
                    | (
                        (
                              (((((var42 & 49152) >> 14 | var42 << 2) + 57 & 65534) >> 1 | ((var42 & 49152) >> 14 | var42 << 2) + 57 << 15) + 183 ^ 15) - 166
                                & 65534
                            )
                            >> 1
                          | (((((var42 & 49152) >> 14 | var42 << 2) + 57 & 65534) >> 1 | ((var42 & 49152) >> 14 | var42 << 2) + 57 << 15) + 183 ^ 15) - 166
                            << 15
                      )
                      << 1
                )
                << 11
          )
        );
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (1363334268 >>> -953613065 | 0) & 1708463373; var29 < var16.length(); var29 += 105373374 ^ 357431107 ^ 319433212) {
        int var52 = var16.charAt(var29) + 206 - 230 - 89;
        char var55 = (char)(
          ((((((var52 & 63488) >> 11 | var52 << 5) + 77 - 13 ^ 104) & 57344) >> 13 | (((var52 & 63488) >> 11 | var52 << 5) + 77 - 13 ^ 104) << 3) + 164 & 65520)
              >> 4
            | (((((var52 & 63488) >> 11 | var52 << 5) + 77 - 13 ^ 104) & 57344) >> 13 | (((var52 & 63488) >> 11 | var52 << 5) + 77 - 13 ^ 104) << 3) + 164
              << 12
        );
        var16.setCharAt(
          var29,
          (char)(
            (
                  (((((var52 & 63488) >> 11 | var52 << 5) + 77 - 13 ^ 104) & 57344) >> 13 | (((var52 & 63488) >> 11 | var52 << 5) + 77 - 13 ^ 104) << 3) + 164
                    & 65520
                )
                >> 4
              | (((((var52 & 63488) >> 11 | var52 << 5) + 77 - 13 ^ 104) & 57344) >> 13 | (((var52 & 63488) >> 11 | var52 << 5) + 77 - 13 ^ 104) << 3) + 164
                << 12
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), e.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (1118221642 | 1519078947 | 0) & 16777364; var35 < var19.length(); var35 += (-1508016873 ^ 2080627719 * -1508016873 | 1) & 607137089) {
        int var60 = (var19.charAt(var35) ^ 24) - 133 - 150;
        int var92 = (var60 & 57344) >> 13;
        int var61 = (var60 & 57344) >> 13 | var60 << 3;
        int var93 = (((var60 & 57344) >> 13 | var60 << 3) & 61440) >> 12;
        var60 = (((var92 | var60 << 3) & 61440) >> 12 | ((var60 & 57344) >> 13 | var60 << 3) << 4) - 143 ^ 23;
        var92 = (((var93 | var61 << 4) - 143 ^ 23) & 65532) >> 2;
        int var63 = ((((var93 | var61 << 4) - 143 ^ 23) & 65532) >> 2 | var60 << 14) + 3;
        int var95 = (((((var93 | var61 << 4) - 143 ^ 23) & 65532) >> 2 | var60 << 14) + 3 & 0) >> 16;
        char var64 = (char)(((var92 | var60 << 14) + 3 & 0) >> 16 | ((((var93 | var61 << 4) - 143 ^ 23) & 65532) >> 2 | var60 << 14) + 3 << 0);
        var19.setCharAt(var35, (char)(var95 | var63 << 0));
      }

      Class var7 = Class.forName(var19.toString(), false, e.class.getClassLoader());
      switch (((((var4 ^ 1771500371) + 1104425430 - 284758032 ^ 2110749325) + 356541718 ^ 1044861846) + 441954577 ^ 414042671) + 138652056 - 1235410446) {
        case 43306226:
          var10000 = var0.findSpecial(var7, var5, var6, e.class);
          break;
        case 116109191:
        case 1136367496:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1753722098:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 1965298324:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    nqu[((var10 ^ 1187383750 ^ 158530910 ^ 988426831 ^ 960080379) + 853826858 - 1694912687 ^ 347781123 ^ 417623123) - 3249434 ^ 1128023798] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (var10 + 2138438395 - 710056439 ^ 1751920166) - 1369492217 - 808614236 - 1663520951 - 1270556425 + 1251871796 - 1442759665;
    MethodHandle var10000 = nqu[(var10 + 2138438395 - 710056439 ^ 1751920166)
      - 1369492217
      - 808614236
      - 1663520951
      - 1270556425
      + 1251871796
      - 1442759665
      + 1621494879];
    if (nqu[var10001 + 1621494879] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = -513600098 + -1510940480 ^ -2024540578; var24 < var14.length(); var24 += (1534636121 | 1534636121 | 0) & 344577) {
        int var43 = (var14.charAt(var24) ^ 227) - 0 - 148 - 151;
        int var10004 = (var43 & 65535) >> 0;
        int var44 = (var43 & 65535) >> 0 | var43 << 16;
        int var96 = (((var43 & 65535) >> 0 | var43 << 16) & 0) >> 16;
        var43 = ((var10004 | var43 << 16) & 0) >> 16 | ((var43 & 65535) >> 0 | var43 << 16) << 0;
        var10004 = ((var96 | var44 << 0) & 65024) >> 9;
        int var46 = (((var96 | var44 << 0) & 65024) >> 9 | var43 << 7) + 36;
        int var98 = ((((var96 | var44 << 0) & 65024) >> 9 | var43 << 7) + 36 & 65408) >> 7;
        char var47 = (char)((((var10004 | var43 << 7) + 36 & 65408) >> 7 | (((var96 | var44 << 0) & 65024) >> 9 | var43 << 7) + 36 << 9) - 189);
        var14.setCharAt(var24, (char)((var98 | var46 << 9) - 189));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (-390884390 ^ -1532208058 | 0) & 822083680; var30 < var17.length(); var30 += (-646209073 + 201045229 | 1) & 302514179) {
        char var52 = var17.charAt(var30);
        char var57 = (char)(
          (
                (
                      (
                            (
                                  (((((var52 & '耀') >> 15 | var52 << 1) - 100 & 65534) >> 1 | ((var52 & '耀') >> 15 | var52 << 1) - 100 << 15) & 65408) >> 7
                                    | ((((var52 & '耀') >> 15 | var52 << 1) - 100 & 65534) >> 1 | ((var52 & '耀') >> 15 | var52 << 1) - 100 << 15) << 9
                                )
                                + 9
                                - 228
                                + 42
                              & 49152
                          )
                          >> 14
                        | (
                              (((((var52 & '耀') >> 15 | var52 << 1) - 100 & 65534) >> 1 | ((var52 & '耀') >> 15 | var52 << 1) - 100 << 15) & 65408) >> 7
                                | ((((var52 & '耀') >> 15 | var52 << 1) - 100 & 65534) >> 1 | ((var52 & '耀') >> 15 | var52 << 1) - 100 << 15) << 9
                            )
                            + 9
                            - 228
                            + 42
                          << 2
                    )
                    + 251
                  & 61440
              )
              >> 12
            | (
                  (
                        (
                              (((((var52 & '耀') >> 15 | var52 << 1) - 100 & 65534) >> 1 | ((var52 & '耀') >> 15 | var52 << 1) - 100 << 15) & 65408) >> 7
                                | ((((var52 & '耀') >> 15 | var52 << 1) - 100 & 65534) >> 1 | ((var52 & '耀') >> 15 | var52 << 1) - 100 << 15) << 9
                            )
                            + 9
                            - 228
                            + 42
                          & 49152
                      )
                      >> 14
                    | (
                          (((((var52 & '耀') >> 15 | var52 << 1) - 100 & 65534) >> 1 | ((var52 & '耀') >> 15 | var52 << 1) - 100 << 15) & 65408) >> 7
                            | ((((var52 & '耀') >> 15 | var52 << 1) - 100 & 65534) >> 1 | ((var52 & '耀') >> 15 | var52 << 1) - 100 << 15) << 9
                        )
                        + 9
                        - 228
                        + 42
                      << 2
                )
                + 251
              << 4
        );
        var17.setCharAt(
          var30,
          (char)(
            (
                  (
                        (
                              (
                                    (((((var52 & '耀') >> 15 | var52 << 1) - 100 & 65534) >> 1 | ((var52 & '耀') >> 15 | var52 << 1) - 100 << 15) & 65408) >> 7
                                      | ((((var52 & '耀') >> 15 | var52 << 1) - 100 & 65534) >> 1 | ((var52 & '耀') >> 15 | var52 << 1) - 100 << 15) << 9
                                  )
                                  + 9
                                  - 228
                                  + 42
                                & 49152
                            )
                            >> 14
                          | (
                                (((((var52 & '耀') >> 15 | var52 << 1) - 100 & 65534) >> 1 | ((var52 & '耀') >> 15 | var52 << 1) - 100 << 15) & 65408) >> 7
                                  | ((((var52 & '耀') >> 15 | var52 << 1) - 100 & 65534) >> 1 | ((var52 & '耀') >> 15 | var52 << 1) - 100 << 15) << 9
                              )
                              + 9
                              - 228
                              + 42
                            << 2
                      )
                      + 251
                    & 61440
                )
                >> 12
              | (
                    (
                          (
                                (((((var52 & '耀') >> 15 | var52 << 1) - 100 & 65534) >> 1 | ((var52 & '耀') >> 15 | var52 << 1) - 100 << 15) & 65408) >> 7
                                  | ((((var52 & '耀') >> 15 | var52 << 1) - 100 & 65534) >> 1 | ((var52 & '耀') >> 15 | var52 << 1) - 100 << 15) << 9
                              )
                              + 9
                              - 228
                              + 42
                            & 49152
                        )
                        >> 14
                      | (
                            (((((var52 & '耀') >> 15 | var52 << 1) - 100 & 65534) >> 1 | ((var52 & '耀') >> 15 | var52 << 1) - 100 << 15) & 65408) >> 7
                              | ((((var52 & '耀') >> 15 | var52 << 1) - 100 & 65534) >> 1 | ((var52 & '耀') >> 15 | var52 << 1) - 100 << 15) << 9
                          )
                          + 9
                          - 228
                          + 42
                        << 2
                  )
                  + 251
                << 4
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, e.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (-633322494 & 66484979 | 0) & -1196677867; var36 < var20.length(); var36 += (305469887 & 1615846358 | 1) & 327328321) {
        int var62 = var20.charAt(var36);
        int var104 = (var62 & 65504) >> 5;
        int var63 = (var62 & 65504) >> 5 | var62 << 11;
        int var105 = (((var62 & 65504) >> 5 | var62 << 11) & 64512) >> 10;
        var62 = ((var104 | var62 << 11) & 64512) >> 10 | ((var62 & 65504) >> 5 | var62 << 11) << 6;
        var104 = ((var105 | var63 << 6) & 57344) >> 13;
        int var65 = ((var105 | var63 << 6) & 57344) >> 13 | var62 << 3;
        int var107 = ((((var105 | var63 << 6) & 57344) >> 13 | var62 << 3) & 65472) >> 6;
        var62 = ((var104 | var62 << 3) & 65472) >> 6 | (((var105 | var63 << 6) & 57344) >> 13 | var62 << 3) << 10;
        var104 = ((var107 | var65 << 10) & 65532) >> 2;
        int var67 = ((var107 | var65 << 10) & 65532) >> 2 | var62 << 14;
        int var109 = ((((var107 | var65 << 10) & 65532) >> 2 | var62 << 14) & 65532) >> 2;
        var62 = (((var104 | var62 << 14) & 65532) >> 2 | (((var107 | var65 << 10) & 65532) >> 2 | var62 << 14) << 14) ^ 199 ^ 153;
        var104 = (((var109 | var67 << 14) ^ 199 ^ 153) & 65528) >> 3;
        int var69 = (((var109 | var67 << 14) ^ 199 ^ 153) & 65528) >> 3 | var62 << 13;
        int var111 = (((((var109 | var67 << 14) ^ 199 ^ 153) & 65528) >> 3 | var62 << 13) & 65528) >> 3;
        char var70 = (char)(((var104 | var62 << 13) & 65528) >> 3 | ((((var109 | var67 << 14) ^ 199 ^ 153) & 65528) >> 3 | var62 << 13) << 13);
        var20.setCharAt(var36, (char)(var111 | var69 << 13));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), e.class.getClassLoader()).returnType();
      switch ((var4 ^ 1907303023 ^ 1152412619 ^ 441658655) - 1799808826 - 1182577487 - 1629242490 + 1527350278 - 878904859 - 1515068204 + 25855225) {
        case 423072329:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 642228752:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1170103186:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1465791869:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      nqu[(var10 + 2138438395 - 710056439 ^ 1751920166) - 1369492217 - 808614236 - 1663520951 - 1270556425 + 1251871796 - 1442759665 + 1621494879] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
