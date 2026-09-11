// KryptonPlus Core: Setting
// Original class: wus
// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

public abstract class wus {
  public String cg;
  public String ue;
  // [JNT] MethodHandle dispatch table (removed)
  public wus(String var1) {
    this.ue = var1;
  }

  public abstract boolean d();

  public String roxh() {
    return null /* jnt:encrypted */;
  }

  public void xr(String var1) {
    null /* jnt:encrypted */;
  }

  public String rnj() {
    return null /* jnt:encrypted */;
  }

  public wus an(String var1) {
    null /* jnt:encrypted */;
    return this;
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 ^ 1472466251) - 1539602207 ^ 790707614) - 2116700641 - 1016645514 - 892823662 - 12247438 + 1953323501 - 996764165;
    MethodHandle var10000 = ptzm[((var10 ^ 1472466251) - 1539602207 ^ 790707614)
      - 2116700641
      - 1016645514
      - 892823662
      - 12247438
      + 1953323501
      - 996764165
      + 1521003276];
    if (ptzm[var10001 + 1521003276] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = -1350059743 & -617568653 ^ -1962893279; var24 < var14.length(); var24 += -906827768 - -906827768 ^ 1) {
        int var43 = var14.charAt(var24) ^ 'f';
        int var10004 = (var43 & 32768) >> 15;
        int var44 = (((var43 & 32768) >> 15 | var43 << 1) ^ 46) + 218 ^ 183 ^ 229 ^ 216;
        int var80 = (((((var43 & 32768) >> 15 | var43 << 1) ^ 46) + 218 ^ 183 ^ 229 ^ 216) & 65504) >> 5;
        char var45 = (char)(
          (
              ((((var10004 | var43 << 1) ^ 46) + 218 ^ 183 ^ 229 ^ 216) & 65504) >> 5
                | ((((var43 & 32768) >> 15 | var43 << 1) ^ 46) + 218 ^ 183 ^ 229 ^ 216) << 11
            )
            + 135
            - 252
        );
        var14.setCharAt(var24, (char)((var80 | var44 << 11) + 135 - 252));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (-314340051 * -1122974038 | 0) & 35672593; var30 < var17.length(); var30 += (1391678897 | 1016851856 | 0) & -2147483569) {
        char var50 = var17.charAt(var30);
        char var55 = (char)(
          (
              (
                    (
                        (
                              (
                                    (
                                          (((((var50 & '쀀') >> 14 | var50 << 2) & 0) >> 16 | ((var50 & '쀀') >> 14 | var50 << 2) << 0) & 0) >> 16
                                            | ((((var50 & '쀀') >> 14 | var50 << 2) & 0) >> 16 | ((var50 & '쀀') >> 14 | var50 << 2) << 0) << 0
                                        )
                                        + 170
                                      ^ 53
                                  )
                                  - 46
                                  + 164
                                & 63488
                            )
                            >> 11
                          | (
                                (
                                      (((((var50 & '쀀') >> 14 | var50 << 2) & 0) >> 16 | ((var50 & '쀀') >> 14 | var50 << 2) << 0) & 0) >> 16
                                        | ((((var50 & '쀀') >> 14 | var50 << 2) & 0) >> 16 | ((var50 & '쀀') >> 14 | var50 << 2) << 0) << 0
                                    )
                                    + 170
                                  ^ 53
                              )
                              - 46
                              + 164
                            << 5
                      )
                      & 65528
                  )
                  >> 3
                | (
                    (
                          (
                                (
                                      (((((var50 & '쀀') >> 14 | var50 << 2) & 0) >> 16 | ((var50 & '쀀') >> 14 | var50 << 2) << 0) & 0) >> 16
                                        | ((((var50 & '쀀') >> 14 | var50 << 2) & 0) >> 16 | ((var50 & '쀀') >> 14 | var50 << 2) << 0) << 0
                                    )
                                    + 170
                                  ^ 53
                              )
                              - 46
                              + 164
                            & 63488
                        )
                        >> 11
                      | (
                            (
                                  (((((var50 & '쀀') >> 14 | var50 << 2) & 0) >> 16 | ((var50 & '쀀') >> 14 | var50 << 2) << 0) & 0) >> 16
                                    | ((((var50 & '쀀') >> 14 | var50 << 2) & 0) >> 16 | ((var50 & '쀀') >> 14 | var50 << 2) << 0) << 0
                                )
                                + 170
                              ^ 53
                          )
                          - 46
                          + 164
                        << 5
                  )
                  << 13
            )
            - 182
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
                                            (((((var50 & '쀀') >> 14 | var50 << 2) & 0) >> 16 | ((var50 & '쀀') >> 14 | var50 << 2) << 0) & 0) >> 16
                                              | ((((var50 & '쀀') >> 14 | var50 << 2) & 0) >> 16 | ((var50 & '쀀') >> 14 | var50 << 2) << 0) << 0
                                          )
                                          + 170
                                        ^ 53
                                    )
                                    - 46
                                    + 164
                                  & 63488
                              )
                              >> 11
                            | (
                                  (
                                        (((((var50 & '쀀') >> 14 | var50 << 2) & 0) >> 16 | ((var50 & '쀀') >> 14 | var50 << 2) << 0) & 0) >> 16
                                          | ((((var50 & '쀀') >> 14 | var50 << 2) & 0) >> 16 | ((var50 & '쀀') >> 14 | var50 << 2) << 0) << 0
                                      )
                                      + 170
                                    ^ 53
                                )
                                - 46
                                + 164
                              << 5
                        )
                        & 65528
                    )
                    >> 3
                  | (
                      (
                            (
                                  (
                                        (((((var50 & '쀀') >> 14 | var50 << 2) & 0) >> 16 | ((var50 & '쀀') >> 14 | var50 << 2) << 0) & 0) >> 16
                                          | ((((var50 & '쀀') >> 14 | var50 << 2) & 0) >> 16 | ((var50 & '쀀') >> 14 | var50 << 2) << 0) << 0
                                      )
                                      + 170
                                    ^ 53
                                )
                                - 46
                                + 164
                              & 63488
                          )
                          >> 11
                        | (
                              (
                                    (((((var50 & '쀀') >> 14 | var50 << 2) & 0) >> 16 | ((var50 & '쀀') >> 14 | var50 << 2) << 0) & 0) >> 16
                                      | ((((var50 & '쀀') >> 14 | var50 << 2) & 0) >> 16 | ((var50 & '쀀') >> 14 | var50 << 2) << 0) << 0
                                  )
                                  + 170
                                ^ 53
                            )
                            - 46
                            + 164
                          << 5
                    )
                    << 13
              )
              - 182
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, wus.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = 1414865833 ^ 1664467665 ^ 929096056; var36 < var20.length(); var36 += (-597657301 - -597657301 | 1) & -493570185) {
        char var60 = var20.charAt(var36);
        int var86 = (var60 & '￼') >> 2;
        int var61 = ((((var60 & '￼') >> 2 | var60 << 14) ^ 32 ^ 219) + 247 + 198 - 90 ^ 170) + 178 ^ 189;
        int var87 = ((((((var60 & '￼') >> 2 | var60 << 14) ^ 32 ^ 219) + 247 + 198 - 90 ^ 170) + 178 ^ 189) & 65408) >> 7;
        var60 = (char)(
          (((((var86 | var60 << 14) ^ 32 ^ 219) + 247 + 198 - 90 ^ 170) + 178 ^ 189) & 65408) >> 7
            | (((((var60 & '￼') >> 2 | var60 << 14) ^ 32 ^ 219) + 247 + 198 - 90 ^ 170) + 178 ^ 189) << 9
        );
        var20.setCharAt(var36, (char)(var87 | var61 << 9));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), wus.class.getClassLoader()).returnType();
      switch ((((var4 ^ 1308410216) - 1796788971 - 2023105609 + 1261571680 ^ 1637610083) - 545946581 + 165793311 ^ 66283320 ^ 1825916763) + 1028145506) {
        case 150612252:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 949822000:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1187378441:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1685902678:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      ptzm[((var10 ^ 1472466251) - 1539602207 ^ 790707614) - 2116700641 - 1016645514 - 892823662 - 12247438 + 1953323501 - 996764165 + 1521003276] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
