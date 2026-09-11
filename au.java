// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.Identifier;
import net.minecraft.DrawContext;

public class au extends vwz {
  public yuw aaz;
  public zn mp = (zn)/* jnt */;
  public zn yp = (zn)/* jnt */;
  public zn fu = (zn)/* jnt */;
  public zn qkj = (zn)/* jnt */;
  public zn xu = (zn)/* jnt */;
  public float vd = 4.0F;
  public float il = 0.25F;
  public float hvj = 0.0F;
  public zn pb;
  // [JNT] MethodHandle dispatch table (removed)
  public au(fs var1, wus var2, int var3) {
    super(var1, var2, var3);
    this.aaz = (yuw)var2;
  }
  @Override
  public void po() {
    int var3 = -420656336;
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
      var3 = 834612059 >>> 1926789056 * 1280872211 ^ -1533960735;
    } else {
      var3 = (-1398842859 << 631816943 | 1881424127) & 1961189119;
    }

    while (true) {
      switch (((var3 - 515177620 ^ 417795779) + 1769889650 + 400496654 ^ 893452209) + 1460033627) {
        case 834874415:
          short var2 = 255;
          if (/* jnt */) != var2) {
            null /* jnt:encrypted */
            );
          }

          /* jnt */;
          return;
        case 1386976756:
        default:
          null /* jnt:encrypted *//* jnt */,
              /* jnt */,
              /* jnt */,
              /* jnt */)
            )
          );
      }

      var3 = 834612059 >>> 1926789056 * 1280872211 ^ -1533960735;
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

    int var18 = /* jnt */ + 5;
    int var6 = /* jnt */
      + /* jnt */
      + null /* jnt:encrypted */
      + /* jnt */ / 2;
    int var7 = var6 - 8;
    String var15 = /* jnt */
    );
    /* jnt *//* jnt */, var15
          ),
          ":"
        )
      ),
      var1,
      var18,
      var7,
      /* jnt */)
    );
    String var16 = /* jnt */
    );
    StringBuilder var10001 = /* jnt *//* jnt */, var16
    );
    int var10002 = -1308700498 >>> 2059783283 ^ 5695;

    StringBuilder var10003;
    for (var10003 = (StringBuilder)/* jnt */;
      var10002 < (-1021276067 << 1217882983 ^ -1874317694);
      var10002 += (937227728 | 103868511) ^ 939326942
    ) {
      int var30 = /* jnt */ + 191 + 183;
      int var10006 = (var30 & 49152) >> 14;
      int var31 = (var30 & 49152) >> 14 | var30 << 2;
      int var39 = (((var30 & 49152) >> 14 | var30 << 2) & 61440) >> 12;
      char var32 = (char)((((var10006 | var30 << 2) & 61440) >> 12 | ((var30 & 49152) >> 14 | var30 << 2) << 4) + 111);
      /* jnt */((var39 | var31 << 4) + 111));
    }

    int var8 = var18
      + /* jnt */
          )
        )
      )
      + 5;
    byte var9 = 60;
    byte var10 = 22;
    int var11 = var6 - var10 / 2;
    /* jnt */,
      (double)var8,
      (double)var11,
      (double)(var8 + var9),
      (double)(var11 + var10),
      4.0,
      4.0,
      4.0,
      4.0
    );
    /* jnt */,
      (double)(var8 + 1),
      (double)(var11 + 1),
      (double)(var8 + var9 - 1),
      (double)(var11 + var10 - 1),
      3.5,
      3.5,
      3.5,
      3.5
    );
    int var12 = /* jnt */)
    );
    StringBuilder var10000 = /* jnt *//* jnt */, var12
    );
    int var19 = -1450986939 - -188614057 ^ -1262372882;

    for (var22 = (StringBuilder)/* jnt */;
      var19 < (325950499 << 2039394681 ^ 1174405124);
      var19 += -784296261 - (-1823260097 >> -784296261) ^ -784296248
    ) {
      char var26 = /* jnt */;
      int var37 = (var26 & '\uf800') >> 11;
      int var27 = (((var26 & '\uf800') >> 11 | var26 << 5) ^ 225) - 41;
      int var38 = ((((var26 & '\uf800') >> 11 | var26 << 5) ^ 225) - 41 & 65532) >> 2;
      char var28 = (char)(((((var37 | var26 << 5) ^ 225) - 41 & 65532) >> 2 | (((var26 & '\uf800') >> 11 | var26 << 5) ^ 225) - 41 << 14) - 104);
      /* jnt */((var38 | var27 << 14) - 104));
    }

    String var13 = /* jnt */
      )
    );
    zn var14 = var12 > 0
      ? (zn)/* jnt */
      : (zn)/* jnt */;
    /* jnt */
    );
  }

  public void at(int var1, int var2, float var3) {
    float var4 = var3 * 0.05F;
    float var5 = /* jnt */var1, (double)var2)
        && !null /* jnt:encrypted */)
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
        (vy)/* jnt */)
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
    int var10001 = var10 - 2089979807 - 582365825 - 105399095 - 353532610 + 433862419 ^ 1921430921 ^ 1443677017 ^ 299842670 ^ 228637286;
    MethodHandle var10000 = ktm[(var10 - 2089979807 - 582365825 - 105399095 - 353532610 + 433862419 ^ 1921430921 ^ 1443677017 ^ 299842670 ^ 228637286)
      + 2028169619];
    if (ktm[var10001 + 2028169619] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (-1928513777 << -1928513777 + -1736388968 | 0) & 1342208031;
        var23 < var13.length();
        var23 += (303349037 << (1729105617 | 721268948) | 1) & 1515801177
      ) {
        int var42 = var13.charAt(var23) + 'H' + 116;
        char var47 = (char)(
          (
              (
                    (
                          (
                                (
                                    (
                                        (((((var42 & 65408) >> 7 | var42 << 9) & 65532) >> 2 | ((var42 & 65408) >> 7 | var42 << 9) << 14) & 61440) >> 12
                                          | ((((var42 & 65408) >> 7 | var42 << 9) & 65532) >> 2 | ((var42 & 65408) >> 7 | var42 << 9) << 14) << 4
                                      )
                                      ^ 212
                                  )
                                  & 65472
                              )
                              >> 6
                            | (
                                (
                                    (((((var42 & 65408) >> 7 | var42 << 9) & 65532) >> 2 | ((var42 & 65408) >> 7 | var42 << 9) << 14) & 61440) >> 12
                                      | ((((var42 & 65408) >> 7 | var42 << 9) & 65532) >> 2 | ((var42 & 65408) >> 7 | var42 << 9) << 14) << 4
                                  )
                                  ^ 212
                              )
                              << 10
                        )
                        + 57
                      & 64512
                  )
                  >> 10
                | (
                      (
                            (
                                (
                                    (((((var42 & 65408) >> 7 | var42 << 9) & 65532) >> 2 | ((var42 & 65408) >> 7 | var42 << 9) << 14) & 61440) >> 12
                                      | ((((var42 & 65408) >> 7 | var42 << 9) & 65532) >> 2 | ((var42 & 65408) >> 7 | var42 << 9) << 14) << 4
                                  )
                                  ^ 212
                              )
                              & 65472
                          )
                          >> 6
                        | (
                            (
                                (((((var42 & 65408) >> 7 | var42 << 9) & 65532) >> 2 | ((var42 & 65408) >> 7 | var42 << 9) << 14) & 61440) >> 12
                                  | ((((var42 & 65408) >> 7 | var42 << 9) & 65532) >> 2 | ((var42 & 65408) >> 7 | var42 << 9) << 14) << 4
                              )
                              ^ 212
                          )
                          << 10
                    )
                    + 57
                  << 6
            )
            - 55
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
                                          (((((var42 & 65408) >> 7 | var42 << 9) & 65532) >> 2 | ((var42 & 65408) >> 7 | var42 << 9) << 14) & 61440) >> 12
                                            | ((((var42 & 65408) >> 7 | var42 << 9) & 65532) >> 2 | ((var42 & 65408) >> 7 | var42 << 9) << 14) << 4
                                        )
                                        ^ 212
                                    )
                                    & 65472
                                )
                                >> 6
                              | (
                                  (
                                      (((((var42 & 65408) >> 7 | var42 << 9) & 65532) >> 2 | ((var42 & 65408) >> 7 | var42 << 9) << 14) & 61440) >> 12
                                        | ((((var42 & 65408) >> 7 | var42 << 9) & 65532) >> 2 | ((var42 & 65408) >> 7 | var42 << 9) << 14) << 4
                                    )
                                    ^ 212
                                )
                                << 10
                          )
                          + 57
                        & 64512
                    )
                    >> 10
                  | (
                        (
                              (
                                  (
                                      (((((var42 & 65408) >> 7 | var42 << 9) & 65532) >> 2 | ((var42 & 65408) >> 7 | var42 << 9) << 14) & 61440) >> 12
                                        | ((((var42 & 65408) >> 7 | var42 << 9) & 65532) >> 2 | ((var42 & 65408) >> 7 | var42 << 9) << 14) << 4
                                    )
                                    ^ 212
                                )
                                & 65472
                            )
                            >> 6
                          | (
                              (
                                  (((((var42 & 65408) >> 7 | var42 << 9) & 65532) >> 2 | ((var42 & 65408) >> 7 | var42 << 9) << 14) & 61440) >> 12
                                    | ((((var42 & 65408) >> 7 | var42 << 9) & 65532) >> 2 | ((var42 & 65408) >> 7 | var42 << 9) << 14) << 4
                                )
                                ^ 212
                            )
                            << 10
                      )
                      + 57
                    << 6
              )
              - 55
          )
        );
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = -1225452069 >>> -1225452069 ^ 22; var29 < var16.length(); var29 += (1005565009 + -819002810 | 0) & -469743519) {
        int var52 = var16.charAt(var29) - 243 - 200 ^ 223;
        char var55 = (char)(
          (((((var52 & 65408) >> 7 | var52 << 9) + 219 - 248 + 242 & 65408) >> 7 | ((var52 & 65408) >> 7 | var52 << 9) + 219 - 248 + 242 << 9) - 187 & 61440)
              >> 12
            | ((((var52 & 65408) >> 7 | var52 << 9) + 219 - 248 + 242 & 65408) >> 7 | ((var52 & 65408) >> 7 | var52 << 9) + 219 - 248 + 242 << 9) - 187 << 4
        );
        var16.setCharAt(
          var29,
          (char)(
            (((((var52 & 65408) >> 7 | var52 << 9) + 219 - 248 + 242 & 65408) >> 7 | ((var52 & 65408) >> 7 | var52 << 9) + 219 - 248 + 242 << 9) - 187 & 61440)
                >> 12
              | ((((var52 & 65408) >> 7 | var52 << 9) + 219 - 248 + 242 & 65408) >> 7 | ((var52 & 65408) >> 7 | var52 << 9) + 219 - 248 + 242 << 9) - 187 << 4
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), au.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (-371191732 ^ -371191732 | 0) & 1114977057; var35 < var19.length(); var35 += (2135288722 | 2135288722) ^ 2135288723) {
        char var60 = var19.charAt(var35);
        char var63 = (char)(
          (
              ((((((var60 & 'ﰀ') >> 10 | var60 << 6) & 65472) >> 6 | ((var60 & 'ﰀ') >> 10 | var60 << 6) << 10) ^ 71) - 175 - 171 + 148 - 112 - 6 & 32768) >> 15
                | (((((var60 & 'ﰀ') >> 10 | var60 << 6) & 65472) >> 6 | ((var60 & 'ﰀ') >> 10 | var60 << 6) << 10) ^ 71) - 175 - 171 + 148 - 112 - 6 << 1
            )
            - 9
        );
        var19.setCharAt(
          var35,
          (char)(
            (
                ((((((var60 & 'ﰀ') >> 10 | var60 << 6) & 65472) >> 6 | ((var60 & 'ﰀ') >> 10 | var60 << 6) << 10) ^ 71) - 175 - 171 + 148 - 112 - 6 & 32768)
                    >> 15
                  | (((((var60 & 'ﰀ') >> 10 | var60 << 6) & 65472) >> 6 | ((var60 & 'ﰀ') >> 10 | var60 << 6) << 10) ^ 71) - 175 - 171 + 148 - 112 - 6 << 1
              )
              - 9
          )
        );
      }

      Class var7 = Class.forName(var19.toString(), false, au.class.getClassLoader());
      switch ((var4 - 747251464 + 1293151335 ^ 1691587386) + 245230276 - 1849262071 - 1700867890 - 39640987 + 1630759075 - 1731675520 ^ 1202738854) {
        case 419840687:
        case 713911040:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 782723625:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 1935490661:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 2048111227:
          var10000 = var0.findSpecial(var7, var5, var6, au.class);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    ktm[(var10 - 2089979807 - 582365825 - 105399095 - 353532610 + 433862419 ^ 1921430921 ^ 1443677017 ^ 299842670 ^ 228637286) + 2028169619] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (((var10 ^ 626404926 ^ 846776016) - 1116535395 + 1234998197 ^ 1045443214) + 1778043824 ^ 261761405) + 1628120300 + 890323720;
    MethodHandle var10000 = ktm[(((var10 ^ 626404926 ^ 846776016) - 1116535395 + 1234998197 ^ 1045443214) + 1778043824 ^ 261761405)
      + 1628120300
      + 890323720
      + 992523825];
    if (ktm[var10001 + 992523825] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = 873196662 << 761793043 ^ 1672478720;
        var24 < var14.length();
        var24 += (1482622612 ^ (1340667297 | 1482622612 & 1340667297) | 0) & 1207962691
      ) {
        int var43 = var14.charAt(var24) + 203 + 163;
        int var10004 = (var43 & 65504) >> 5;
        int var44 = ((var43 & 65504) >> 5 | var43 << 11) + 86 + 34 ^ 248;
        int var84 = ((((var43 & 65504) >> 5 | var43 << 11) + 86 + 34 ^ 248) & 65532) >> 2;
        var43 = (((var10004 | var43 << 11) + 86 + 34 ^ 248) & 65532) >> 2 | (((var43 & 65504) >> 5 | var43 << 11) + 86 + 34 ^ 248) << 14;
        var10004 = ((var84 | var44 << 14) & 65520) >> 4;
        int var46 = (((var84 | var44 << 14) & 65520) >> 4 | var43 << 12) - 102;
        int var86 = ((((var84 | var44 << 14) & 65520) >> 4 | var43 << 12) - 102 & 65534) >> 1;
        char var47 = (char)(((var10004 | var43 << 12) - 102 & 65534) >> 1 | (((var84 | var44 << 14) & 65520) >> 4 | var43 << 12) - 102 << 15);
        var14.setCharAt(var24, (char)(var86 | var46 << 15));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (-2048347917 & -1382254840 | 0) & 1111836417; var30 < var17.length(); var30 += (-206320407 & 170179890 | 1) & 496971795) {
        int var52 = var17.charAt(var30) ^ 18;
        int var87 = (var52 & 49152) >> 14;
        int var53 = ((var52 & 49152) >> 14 | var52 << 2) + 29;
        int var88 = (((var52 & 49152) >> 14 | var52 << 2) + 29 & 63488) >> 11;
        var52 = (((var87 | var52 << 2) + 29 & 63488) >> 11 | ((var52 & 49152) >> 14 | var52 << 2) + 29 << 5) + 148;
        var87 = ((var88 | var53 << 5) + 148 & 32768) >> 15;
        int var55 = ((var88 | var53 << 5) + 148 & 32768) >> 15 | var52 << 1;
        int var90 = ((((var88 | var53 << 5) + 148 & 32768) >> 15 | var52 << 1) & 65534) >> 1;
        var52 = ((var87 | var52 << 1) & 65534) >> 1 | (((var88 | var53 << 5) + 148 & 32768) >> 15 | var52 << 1) << 15;
        var87 = ((var90 | var55 << 15) & 0) >> 16;
        int var57 = (((var90 | var55 << 15) & 0) >> 16 | var52 << 0) + 39;
        int var92 = ((((var90 | var55 << 15) & 0) >> 16 | var52 << 0) + 39 & 61440) >> 12;
        char var58 = (char)(((var87 | var52 << 0) + 39 & 61440) >> 12 | (((var90 | var55 << 15) & 0) >> 16 | var52 << 0) + 39 << 4);
        var17.setCharAt(var30, (char)(var92 | var57 << 4));
      }

      Class var6 = Class.forName(var17.toString(), false, au.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (-111803338 << -974080195 | 0) & 1051782050; var36 < var20.length(); var36 += -1309376273 * 788248816 * 552069749 ^ 979922769) {
        char var63 = var20.charAt(var36);
        char var64 = (char)((((((var63 & '\uf000') >> 12 | var63 << 4) - 21 - 240 ^ 27) + 176 ^ 108) + 194 ^ 115) - 209 + 102);
        var20.setCharAt(var36, (char)((((((var63 & '\uf000') >> 12 | var63 << 4) - 21 - 240 ^ 27) + 176 ^ 108) + 194 ^ 115) - 209 + 102));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), au.class.getClassLoader()).returnType();
      switch ((((var4 + 1183848354 ^ 1723126352) + 451768484 ^ 914512552) - 1760695229 + 412795215 + 1994182012 ^ 1416036441) - 188996736 ^ 420803974) {
        case 501279386:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 531963034:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1313774904:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 2080997778:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      ktm[(((var10 ^ 626404926 ^ 846776016) - 1116535395 + 1234998197 ^ 1045443214) + 1778043824 ^ 261761405) + 1628120300 + 890323720 + 992523825] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
