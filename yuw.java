// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashSet;
import java.util.Set;

public class yuw extends wus {
  public Set pag;
  public Set wl;
  // [JNT] MethodHandle dispatch table (removed)
  public yuw(String var1, Set var2) {
    super(var1);
    this.wl = (HashSet)/* jnt */;
    this.pag = (HashSet)/* jnt */;
  }

  public yuw(String var1) {
    this(var1, (HashSet)/* jnt */);
  }

  public Set nvj() {
    return null /* jnt:encrypted */;
  }

  public void wtl(Set var1) {
    null /* jnt:encrypted *//* jnt */
    );
  }

  public Set ojg() {
    return null /* jnt:encrypted */;
  }

  public void efb(lb var1) {
    /* jnt */, var1
    );
  }

  public void wlx(lb var1) {
    /* jnt */, var1
    );
  }

  public boolean nlv(lb var1) {
    return /* jnt */, var1
    );
  }
  public void rx(lb var1) {
    int var2 = -1822810830;
    if (/* jnt */) {
      /* jnt */;
      var2 = (1035090866 >> -1484339746 | -2065984673) & -589324321;
    } else {
      var2 = (973680493 << -1171716586 | 746376304) & 796917239;
    }

    while (true) {
      switch ((var2 + 767179412 - 1987982888 ^ 1493561116) - 1051530234 - 1073612271 - 640347074) {
        case -1069780180:
          return;
        case 451361301:
        default:
          /* jnt */;
      }

      var2 = (1035090866 >> -1484339746 | -2065984673) & -589324321;
    }
  }

  public void ft() {
    null /* jnt:encrypted *//* jnt */
      )
    );
  }

  @Override
  public boolean d() {
    return /* jnt */,
      null /* jnt:encrypted */
    );
  }

  public yuw bzz(String var1) {
    /* jnt */;
    return this;
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (((var10 ^ 1816679468) - 1657592303 ^ 742690966 ^ 619151455) + 557681719 ^ 100596854) - 1715567502 - 1269900045 ^ 1846015865;
    MethodHandle var10000 = uts[(((var10 ^ 1816679468) - 1657592303 ^ 742690966 ^ 619151455) + 557681719 ^ 100596854) - 1715567502 - 1269900045
      ^ 1846015865
      ^ 1597444201];
    if (uts[var10001 ^ 1597444201] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = 1223740074 >> (-2127294530 << -1736466682) ^ 1223740074; var23 < var13.length(); var23 += (-623332603 & -623332603 | 0) & 2228345) {
        int var42 = (var13.charAt(var23) - '0' - 149 ^ 64) - 3 ^ 169 ^ 222;
        char var45 = (char)(
          (((((var42 & 63488) >> 11 | var42 << 5) & 65504) >> 5 | ((var42 & 63488) >> 11 | var42 << 5) << 11) - 207 & 61440) >> 12
            | ((((var42 & 63488) >> 11 | var42 << 5) & 65504) >> 5 | ((var42 & 63488) >> 11 | var42 << 5) << 11) - 207 << 4
        );
        var13.setCharAt(
          var23,
          (char)(
            (((((var42 & 63488) >> 11 | var42 << 5) & 65504) >> 5 | ((var42 & 63488) >> 11 | var42 << 5) << 11) - 207 & 61440) >> 12
              | ((((var42 & 63488) >> 11 | var42 << 5) & 65504) >> 5 | ((var42 & 63488) >> 11 | var42 << 5) << 11) - 207 << 4
          )
        );
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = -853775138 >> 922357740 ^ -208442; var29 < var16.length(); var29 += -254031613 ^ -1988520684 - -1988520684 ^ -254031614) {
        int var50 = var16.charAt(var29);
        int var83 = (var50 & 65532) >> 2;
        int var51 = ((var50 & 65532) >> 2 | var50 << 14) - 94;
        int var84 = (((var50 & 65532) >> 2 | var50 << 14) - 94 & 61440) >> 12;
        var50 = ((((var83 | var50 << 14) - 94 & 61440) >> 12 | ((var50 & 65532) >> 2 | var50 << 14) - 94 << 4) ^ 175) + 248 + 178 - 9 ^ 72;
        var83 = ((((var84 | var51 << 4) ^ 175) + 248 + 178 - 9 ^ 72) & 32768) >> 15;
        int var53 = ((((var84 | var51 << 4) ^ 175) + 248 + 178 - 9 ^ 72) & 32768) >> 15 | var50 << 1;
        int var86 = ((((((var84 | var51 << 4) ^ 175) + 248 + 178 - 9 ^ 72) & 32768) >> 15 | var50 << 1) & 65504) >> 5;
        char var54 = (char)(((var83 | var50 << 1) & 65504) >> 5 | (((((var84 | var51 << 4) ^ 175) + 248 + 178 - 9 ^ 72) & 32768) >> 15 | var50 << 1) << 11);
        var16.setCharAt(var29, (char)(var86 | var53 << 11));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), yuw.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (-691314225 * -2146647657 | 0) & -520090784;
        var35 < var19.length();
        var35 += 737771378 * (-2084005473 | 737771378 >> -2084005473) ^ 1412516303
      ) {
        char var59 = var19.charAt(var35);
        char var62 = (char)(
          (
                (
                      (
                          (((((var59 & '\ue000') >> 13 | var59 << 3) ^ 83) - 69 ^ 173) & 65528) >> 3
                            | ((((var59 & '\ue000') >> 13 | var59 << 3) ^ 83) - 69 ^ 173) << 13
                        )
                        ^ 212
                    )
                    - 208
                    + 20
                    + 210
                  & 65024
              )
              >> 9
            | (
                  (
                      (((((var59 & '\ue000') >> 13 | var59 << 3) ^ 83) - 69 ^ 173) & 65528) >> 3
                        | ((((var59 & '\ue000') >> 13 | var59 << 3) ^ 83) - 69 ^ 173) << 13
                    )
                    ^ 212
                )
                - 208
                + 20
                + 210
              << 7
        );
        var19.setCharAt(
          var35,
          (char)(
            (
                  (
                        (
                            (((((var59 & '\ue000') >> 13 | var59 << 3) ^ 83) - 69 ^ 173) & 65528) >> 3
                              | ((((var59 & '\ue000') >> 13 | var59 << 3) ^ 83) - 69 ^ 173) << 13
                          )
                          ^ 212
                      )
                      - 208
                      + 20
                      + 210
                    & 65024
                )
                >> 9
              | (
                    (
                        (((((var59 & '\ue000') >> 13 | var59 << 3) ^ 83) - 69 ^ 173) & 65528) >> 3
                          | ((((var59 & '\ue000') >> 13 | var59 << 3) ^ 83) - 69 ^ 173) << 13
                      )
                      ^ 212
                  )
                  - 208
                  + 20
                  + 210
                << 7
          )
        );
      }

      Class var7 = Class.forName(var19.toString(), false, yuw.class.getClassLoader());
      switch ((var4 ^ 789682637) + 986784197 + 154665915 - 1042019782 + 497222087 - 2139951643 + 1875405499 - 626970833 - 313072174 + 1294167952) {
        case 758245813:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 857235160:
        case 1549427409:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 909320582:
          var10000 = var0.findSpecial(var7, var5, var6, yuw.class);
          break;
        case 1067680424:
          var10000 = var0.findConstructor(var7, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    uts[(((var10 ^ 1816679468) - 1657592303 ^ 742690966 ^ 619151455) + 557681719 ^ 100596854) - 1715567502 - 1269900045 ^ 1846015865 ^ 1597444201] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (((var10 - 616925844 ^ 948386587 ^ 1736033927) - 245489950 ^ 14915452) - 344606734 + 2007442571 ^ 1910604712) + 997221909;
    MethodHandle var10000 = uts[(((var10 - 616925844 ^ 948386587 ^ 1736033927) - 245489950 ^ 14915452) - 344606734 + 2007442571 ^ 1910604712) + 997221909
      ^ 749174300];
    if (uts[var10001 ^ 749174300] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = 1250767784 ^ -1903385377 ^ -1006528649; var24 < var14.length(); var24 += (1499898097 + -1620452522 | 1) & 65561) {
        int var43 = var14.charAt(var24) ^ 'b';
        int var10004 = (var43 & 49152) >> 14;
        int var44 = ((var43 & 49152) >> 14 | var43 << 2) - 95;
        int var79 = (((var43 & 49152) >> 14 | var43 << 2) - 95 & 32768) >> 15;
        var43 = ((var10004 | var43 << 2) - 95 & 32768) >> 15 | ((var43 & 49152) >> 14 | var43 << 2) - 95 << 1;
        var10004 = ((var79 | var44 << 1) & 32768) >> 15;
        int var46 = ((var79 | var44 << 1) & 32768) >> 15 | var43 << 1;
        int var81 = ((((var79 | var44 << 1) & 32768) >> 15 | var43 << 1) & 49152) >> 14;
        var43 = (((var10004 | var43 << 1) & 49152) >> 14 | (((var79 | var44 << 1) & 32768) >> 15 | var43 << 1) << 2) ^ 93;
        var10004 = (((var81 | var46 << 2) ^ 93) & 57344) >> 13;
        int var48 = (((var81 | var46 << 2) ^ 93) & 57344) >> 13 | var43 << 3;
        int var83 = (((((var81 | var46 << 2) ^ 93) & 57344) >> 13 | var43 << 3) & 65520) >> 4;
        char var49 = (char)((((var10004 | var43 << 3) & 65520) >> 4 | ((((var81 | var46 << 2) ^ 93) & 57344) >> 13 | var43 << 3) << 12) + 117);
        var14.setCharAt(var24, (char)((var83 | var48 << 12) + 117));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (-338579370 - (1807854225 - -338579370 * 1807854225) | 0) & 1582080;
        var30 < var17.length();
        var30 += 761649913 ^ -320464253 ^ -1048330117
      ) {
        char var54 = var17.charAt(var30);
        char var57 = (char)(
          (
              (
                    (
                        ((((var54 & '\uffc0') >> 6 | var54 << '\n') - 120 + 16 ^ 64) - 31 & 57344) >> 13
                          | (((var54 & '\uffc0') >> 6 | var54 << '\n') - 120 + 16 ^ 64) - 31 << 3
                      )
                      & 65528
                  )
                  >> 3
                | (
                    ((((var54 & '\uffc0') >> 6 | var54 << '\n') - 120 + 16 ^ 64) - 31 & 57344) >> 13
                      | (((var54 & '\uffc0') >> 6 | var54 << '\n') - 120 + 16 ^ 64) - 31 << 3
                  )
                  << 13
            )
            - 30
            - 8
            + 243
        );
        var17.setCharAt(
          var30,
          (char)(
            (
                (
                      (
                          ((((var54 & '\uffc0') >> 6 | var54 << '\n') - 120 + 16 ^ 64) - 31 & 57344) >> 13
                            | (((var54 & '\uffc0') >> 6 | var54 << '\n') - 120 + 16 ^ 64) - 31 << 3
                        )
                        & 65528
                    )
                    >> 3
                  | (
                      ((((var54 & '\uffc0') >> 6 | var54 << '\n') - 120 + 16 ^ 64) - 31 & 57344) >> 13
                        | (((var54 & '\uffc0') >> 6 | var54 << '\n') - 120 + 16 ^ 64) - 31 << 3
                    )
                    << 13
              )
              - 30
              - 8
              + 243
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, yuw.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (2061459238 ^ 1974195643 | 0) & 537015554; var36 < var20.length(); var36 += (275839642 & 275839642 | 1) & 1107427589) {
        var20.setCharAt(var36, (char)((var20.charAt(var36) + 198 - 25 + 84 + 16 + 125 ^ 35) + 148 - 78 - 124 - 240));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), yuw.class.getClassLoader()).returnType();
      switch (((var4 - 766726991 ^ 731714522 ^ 1644798745) - 128960964 ^ 1141909691 ^ 1627590865 ^ 1680091942 ^ 666850192) + 66851240 ^ 354835605) {
        case 764830312:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 878317903:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1389770333:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1446351234:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      uts[(((var10 - 616925844 ^ 948386587 ^ 1736033927) - 245489950 ^ 14915452) - 344606734 + 2007442571 ^ 1910604712) + 997221909 ^ 749174300] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
