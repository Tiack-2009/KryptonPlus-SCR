// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashSet;
import java.util.Set;

public class nj extends wus {
  public Set pag;
  public Runnable xo;
  public Set wl;
  // [JNT] MethodHandle dispatch table (removed)
  public nj(String var1, Set var2) {
    super(var1);
    this.wl = (HashSet)/* jnt */;
    this.pag = (HashSet)/* jnt */;
  }

  public Set nvj() {
    return null /* jnt:encrypted */;
  }

  public void wtl(Set var1) {
    null /* jnt:encrypted *//* jnt */
    );
    if (null /* jnt:encrypted */ != null) {
      /* jnt */
      );
    }
  }

  public Set ojg() {
    return null /* jnt:encrypted */;
  }

  public void ft() {
    null /* jnt:encrypted *//* jnt */
      )
    );
  }

  public nj hkz(Runnable var1) {
    null /* jnt:encrypted */;
    return this;
  }

  @Override
  public boolean d() {
    return /* jnt */, null /* jnt:encrypted */
    );
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 + 357030944 ^ 1326194863) + 561944510 - 1300894889 ^ 1430864845) - 1979186214 + 130842279 - 1668890586 - 1820632028;
    MethodHandle var10000 = gll[((var10 + 357030944 ^ 1326194863) + 561944510 - 1300894889 ^ 1430864845) - 1979186214 + 130842279 - 1668890586 - 1820632028
      ^ 1026068550];
    if (gll[var10001 ^ 1026068550] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = 1346738074 >>> 2002223923 ^ 2568; var23 < var13.length(); var23 += (-47502830 << -1106642917 | 1) & 1163887381) {
        int var42 = var13.charAt(var23) ^ 'm';
        int var10004 = (var42 & 65408) >> 7;
        int var43 = ((var42 & 65408) >> 7 | var42 << 9) ^ 52;
        int var81 = ((((var42 & 65408) >> 7 | var42 << 9) ^ 52) & 65520) >> 4;
        var42 = (((var10004 | var42 << 9) ^ 52) & 65520) >> 4 | (((var42 & 65408) >> 7 | var42 << 9) ^ 52) << 12;
        var10004 = ((var81 | var43 << 12) & 65535) >> 0;
        int var45 = ((((var81 | var43 << 12) & 65535) >> 0 | var42 << 16) ^ 235) - 26 - 163;
        int var83 = (((((var81 | var43 << 12) & 65535) >> 0 | var42 << 16) ^ 235) - 26 - 163 & 49152) >> 14;
        char var46 = (char)(
          ((((var10004 | var42 << 16) ^ 235) - 26 - 163 & 49152) >> 14 | ((((var81 | var43 << 12) & 65535) >> 0 | var42 << 16) ^ 235) - 26 - 163 << 2) ^ 45
        );
        var13.setCharAt(var23, (char)((var83 | var45 << 2) ^ 45));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (1764084586 >> 589017026 | 0) & -525956831; var29 < var16.length(); var29 += -273854928 & -1118540677 ^ -1392227279) {
        int var51 = var16.charAt(var29) + 'V' - 135 + 174 ^ 82;
        char var54 = (char)(
          ((((((var51 & 61440) >> 12 | var51 << 4) - 220 - 41 & 65534) >> 1 | ((var51 & 61440) >> 12 | var51 << 4) - 220 - 41 << 15) ^ 41) & 64512) >> 10
            | (((((var51 & 61440) >> 12 | var51 << 4) - 220 - 41 & 65534) >> 1 | ((var51 & 61440) >> 12 | var51 << 4) - 220 - 41 << 15) ^ 41) << 6
        );
        var16.setCharAt(
          var29,
          (char)(
            ((((((var51 & 61440) >> 12 | var51 << 4) - 220 - 41 & 65534) >> 1 | ((var51 & 61440) >> 12 | var51 << 4) - 220 - 41 << 15) ^ 41) & 64512) >> 10
              | (((((var51 & 61440) >> 12 | var51 << 4) - 220 - 41 & 65534) >> 1 | ((var51 & 61440) >> 12 | var51 << 4) - 220 - 41 << 15) ^ 41) << 6
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), nj.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (714240521 * -1218072566 | 0) & 687872769; var35 < var19.length(); var35 += (-1012187453 >>> 1009012374 | 1) & 1979820241) {
        char var59 = var19.charAt(var35);
        char var62 = (char)(
          (((((((var59 & 0) >> 16 | var59 << 0) & 65408) >> 7 | ((var59 & 0) >> 16 | var59 << 0) << 9) - 82 ^ 229) + 36 - 67 ^ 141) - 44 + 203 & 65408) >> 7
            | ((((((var59 & 0) >> 16 | var59 << 0) & 65408) >> 7 | ((var59 & 0) >> 16 | var59 << 0) << 9) - 82 ^ 229) + 36 - 67 ^ 141) - 44 + 203 << 9
        );
        var19.setCharAt(
          var35,
          (char)(
            (((((((var59 & 0) >> 16 | var59 << 0) & 65408) >> 7 | ((var59 & 0) >> 16 | var59 << 0) << 9) - 82 ^ 229) + 36 - 67 ^ 141) - 44 + 203 & 65408) >> 7
              | ((((((var59 & 0) >> 16 | var59 << 0) & 65408) >> 7 | ((var59 & 0) >> 16 | var59 << 0) << 9) - 82 ^ 229) + 36 - 67 ^ 141) - 44 + 203 << 9
          )
        );
      }

      Class var7 = Class.forName(var19.toString(), false, nj.class.getClassLoader());
      switch (((var4 - 2034574658 - 385043187 - 11614425 ^ 1943712151 ^ 1455133238 ^ 1071760480) - 1447528369 + 1386163112 ^ 1831812330) - 2011611090) {
        case 512407697:
          var10000 = var0.findSpecial(var7, var5, var6, nj.class);
          break;
        case 645349460:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 937376948:
        case 1485495316:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1935266911:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    gll[((var10 + 357030944 ^ 1326194863) + 561944510 - 1300894889 ^ 1430864845) - 1979186214 + 130842279 - 1668890586 - 1820632028 ^ 1026068550] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 - 727381726 ^ 2106264260) - 1549783630 + 2105138637 + 1458977596 ^ 1667401090) + 1952578842 + 865109635 + 449525373;
    MethodHandle var10000 = gll[((var10 - 727381726 ^ 2106264260) - 1549783630 + 2105138637 + 1458977596 ^ 1667401090)
      + 1952578842
      + 865109635
      + 449525373
      - 756862375];
    if (gll[var10001 - 756862375] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (1040459875 >> 1651313135 | 0) & -1633353487; var24 < var14.length(); var24 += (-879462996 + (-74387769 << -1592432631) | 1) & 33565761) {
        int var43 = var14.charAt(var24) ^ 30;
        char var46 = (char)(
          (
                (
                      (
                          ((((var43 & 63488) >> 11 | var43 << 5) + 35 ^ 179 ^ 62) + 69 & 65472) >> 6
                            | (((var43 & 63488) >> 11 | var43 << 5) + 35 ^ 179 ^ 62) + 69 << 10
                        )
                        ^ 161
                    )
                    - 210
                  & 65535
              )
              >> 0
            | (
                  (
                      ((((var43 & 63488) >> 11 | var43 << 5) + 35 ^ 179 ^ 62) + 69 & 65472) >> 6
                        | (((var43 & 63488) >> 11 | var43 << 5) + 35 ^ 179 ^ 62) + 69 << 10
                    )
                    ^ 161
                )
                - 210
              << 16
        );
        var14.setCharAt(
          var24,
          (char)(
            (
                  (
                        (
                            ((((var43 & 63488) >> 11 | var43 << 5) + 35 ^ 179 ^ 62) + 69 & 65472) >> 6
                              | (((var43 & 63488) >> 11 | var43 << 5) + 35 ^ 179 ^ 62) + 69 << 10
                          )
                          ^ 161
                      )
                      - 210
                    & 65535
                )
                >> 0
              | (
                    (
                        ((((var43 & 63488) >> 11 | var43 << 5) + 35 ^ 179 ^ 62) + 69 & 65472) >> 6
                          | (((var43 & 63488) >> 11 | var43 << 5) + 35 ^ 179 ^ 62) + 69 << 10
                      )
                      ^ 161
                  )
                  - 210
                << 16
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = -1768051458 << -2038937475 ^ -1073741824; var30 < var17.length(); var30 += (1144674087 << 1144674087 | 1) & 541330525) {
        char var51 = var17.charAt(var30);
        char var56 = (char)(
          (
                (
                      (
                            (
                                  (
                                      (
                                          (((((var51 & 'ﾀ') >> 7 | var51 << '\t') & 65535) >> 0 | ((var51 & 'ﾀ') >> 7 | var51 << '\t') << 16) & 57344) >> 13
                                            | ((((var51 & 'ﾀ') >> 7 | var51 << '\t') & 65535) >> 0 | ((var51 & 'ﾀ') >> 7 | var51 << '\t') << 16) << 3
                                        )
                                        ^ 54
                                    )
                                    & 57344
                                )
                                >> 13
                              | (
                                  (
                                      (((((var51 & 'ﾀ') >> 7 | var51 << '\t') & 65535) >> 0 | ((var51 & 'ﾀ') >> 7 | var51 << '\t') << 16) & 57344) >> 13
                                        | ((((var51 & 'ﾀ') >> 7 | var51 << '\t') & 65535) >> 0 | ((var51 & 'ﾀ') >> 7 | var51 << '\t') << 16) << 3
                                    )
                                    ^ 54
                                )
                                << 3
                          )
                          + 177
                        & 65504
                    )
                    >> 5
                  | (
                        (
                              (
                                  (
                                      (((((var51 & 'ﾀ') >> 7 | var51 << '\t') & 65535) >> 0 | ((var51 & 'ﾀ') >> 7 | var51 << '\t') << 16) & 57344) >> 13
                                        | ((((var51 & 'ﾀ') >> 7 | var51 << '\t') & 65535) >> 0 | ((var51 & 'ﾀ') >> 7 | var51 << '\t') << 16) << 3
                                    )
                                    ^ 54
                                )
                                & 57344
                            )
                            >> 13
                          | (
                              (
                                  (((((var51 & 'ﾀ') >> 7 | var51 << '\t') & 65535) >> 0 | ((var51 & 'ﾀ') >> 7 | var51 << '\t') << 16) & 57344) >> 13
                                    | ((((var51 & 'ﾀ') >> 7 | var51 << '\t') & 65535) >> 0 | ((var51 & 'ﾀ') >> 7 | var51 << '\t') << 16) << 3
                                )
                                ^ 54
                            )
                            << 3
                      )
                      + 177
                    << 11
              )
              + 175
              + 125
            ^ 31
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
                                            (((((var51 & 'ﾀ') >> 7 | var51 << '\t') & 65535) >> 0 | ((var51 & 'ﾀ') >> 7 | var51 << '\t') << 16) & 57344) >> 13
                                              | ((((var51 & 'ﾀ') >> 7 | var51 << '\t') & 65535) >> 0 | ((var51 & 'ﾀ') >> 7 | var51 << '\t') << 16) << 3
                                          )
                                          ^ 54
                                      )
                                      & 57344
                                  )
                                  >> 13
                                | (
                                    (
                                        (((((var51 & 'ﾀ') >> 7 | var51 << '\t') & 65535) >> 0 | ((var51 & 'ﾀ') >> 7 | var51 << '\t') << 16) & 57344) >> 13
                                          | ((((var51 & 'ﾀ') >> 7 | var51 << '\t') & 65535) >> 0 | ((var51 & 'ﾀ') >> 7 | var51 << '\t') << 16) << 3
                                      )
                                      ^ 54
                                  )
                                  << 3
                            )
                            + 177
                          & 65504
                      )
                      >> 5
                    | (
                          (
                                (
                                    (
                                        (((((var51 & 'ﾀ') >> 7 | var51 << '\t') & 65535) >> 0 | ((var51 & 'ﾀ') >> 7 | var51 << '\t') << 16) & 57344) >> 13
                                          | ((((var51 & 'ﾀ') >> 7 | var51 << '\t') & 65535) >> 0 | ((var51 & 'ﾀ') >> 7 | var51 << '\t') << 16) << 3
                                      )
                                      ^ 54
                                  )
                                  & 57344
                              )
                              >> 13
                            | (
                                (
                                    (((((var51 & 'ﾀ') >> 7 | var51 << '\t') & 65535) >> 0 | ((var51 & 'ﾀ') >> 7 | var51 << '\t') << 16) & 57344) >> 13
                                      | ((((var51 & 'ﾀ') >> 7 | var51 << '\t') & 65535) >> 0 | ((var51 & 'ﾀ') >> 7 | var51 << '\t') << 16) << 3
                                  )
                                  ^ 54
                              )
                              << 3
                        )
                        + 177
                      << 11
                )
                + 175
                + 125
              ^ 31
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, nj.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (1355882833 | 1111467025) ^ 1392485713; var36 < var20.length(); var36 += 162907425 << 1601321104 ^ -987693055) {
        int var61 = (var20.charAt(var36) + '^' ^ 140) + 239;
        char var64 = (char)(
          (
              (((((var61 & 65520) >> 4 | var61 << 12) & 65520) >> 4 | ((var61 & 65520) >> 4 | var61 << 12) << 12) + 196 - 153 + 149 & 63488) >> 11
                | ((((var61 & 65520) >> 4 | var61 << 12) & 65520) >> 4 | ((var61 & 65520) >> 4 | var61 << 12) << 12) + 196 - 153 + 149 << 5
            )
            ^ 238
        );
        var20.setCharAt(
          var36,
          (char)(
            (
                (((((var61 & 65520) >> 4 | var61 << 12) & 65520) >> 4 | ((var61 & 65520) >> 4 | var61 << 12) << 12) + 196 - 153 + 149 & 63488) >> 11
                  | ((((var61 & 65520) >> 4 | var61 << 12) & 65520) >> 4 | ((var61 & 65520) >> 4 | var61 << 12) << 12) + 196 - 153 + 149 << 5
              )
              ^ 238
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), nj.class.getClassLoader()).returnType();
      switch (((var4 + 1394944473 + 31955481 ^ 1755255527) - 765595752 - 1247146223 + 1457384706 - 2002575087 - 664566467 ^ 970827049) + 580541277) {
        case 262067901:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1401378527:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1871152398:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 2135184657:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      gll[((var10 - 727381726 ^ 2106264260) - 1549783630 + 2105138637 + 1458977596 ^ 1667401090) + 1952578842 + 865109635 + 449525373 - 756862375] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
