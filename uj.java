// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.class_11908;
import net.minecraft.Identifier;
import net.minecraft.DrawContext;

public class uj extends vwz {
  public kc ya;
  public float vd = 3.0F;
  public zn mp = (zn)/* jnt */;
  public zn yp = (zn)/* jnt */;
  public zn uw = (zn)/* jnt */;
  public zn hm = (zn)/* jnt */;
  public int kt = 13;
  public float il = 0.005F;
  public float ae = 0.002F;
  public float hvj = 0.0F;
  public float c = 0.0F;
  // [JNT] MethodHandle dispatch table (removed)
  public uj(fs var1, wus var2, int var3) {
    super(var1, var2, var3);
    this.ya = (kc)var2;
    this.c = /* jnt */) ? 1.0F : 0.0F;
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

    int var6 = /* jnt */
      + /* jnt */
      + null /* jnt:encrypted */
      + /* jnt */ / 2
      - 6;
    /* jnt */
      ),
      var1,
      /* jnt */ + 27,
      var6,
      /* jnt */)
    );
    /* jnt */;
  }

  public void at(int var1, int var2, float var3) {
    float var4 = var3 * 0.05F;
    float var5 = /* jnt */var1, (double)var2)
        && !null /* jnt:encrypted */)
        )
      ? 1.0F
      : 0.0F;
    null /* jnt:encrypted *//* jnt */null /* jnt:encrypted */, (double)var5, 0.005F, (double)var4
      )
    );
    float var6 = /* jnt */) ? 1.0F : 0.0F;
    null /* jnt:encrypted *//* jnt */null /* jnt:encrypted */, (double)var6, 0.002F, (double)var4
      )
    );
    null /* jnt:encrypted *//* jnt */null /* jnt:encrypted */, 0.0, 1.0)
    );
  }

  public void hl(class_332 var1) {
    int var2 = /* jnt */ + 8;
    int var3 = /* jnt */
      + /* jnt */
      + null /* jnt:encrypted */
      + /* jnt */ / 2
      - 6;
    zn var4 = /* jnt */), this
      )
    );
    /* jnt */, (double)var2, (double)var3, (double)(var2 + 13), (double)(var3 + 13), 3.0, 3.0, 3.0, 3.0
    );
    /* jnt */,
      (double)(var2 + 1),
      (double)(var3 + 1),
      (double)(var2 + 13 - 1),
      (double)(var3 + 13 - 1),
      2.5,
      2.5,
      2.5,
      2.5
    );
    if (null /* jnt:encrypted */ > 0.01F) {
      zn var5 = (zn)/* jnt */,
        /* jnt */,
        /* jnt */,
        (int)(255.0F * null /* jnt:encrypted */)
      );
      float var6 = 9.0F;
      float var7 = (float)(var2 + 2) + var6 * (1.0F - null /* jnt:encrypted */) / 2.0F;
      float var8 = (float)(var3 + 2) + var6 * (1.0F - null /* jnt:encrypted */) / 2.0F;
      /* jnt */var7,
        (double)var8,
        (double)(var7 + var6 * null /* jnt:encrypted */),
        (double)(var8 + var6 * null /* jnt:encrypted */),
        1.5,
        1.5,
        1.5,
        1.5
      );
      if (null /* jnt:encrypted */ > 0.7F) {
        float var9 = (null /* jnt:encrypted */ - 0.7F) * 3.33F;
        /* jnt *//* jnt */,
            /* jnt */,
            /* jnt */,
            (int)(40.0F * var9)
          ),
          (double)(var2 - 1),
          (double)(var3 - 1),
          (double)(var2 + 13 + 1),
          (double)(var3 + 13 + 1),
          3.5,
          3.5,
          3.5,
          3.5
        );
      }
    }
  }

  @Override
  public void z(class_11908 var1) {
    if (null /* jnt:encrypted */
      && null /* jnt:encrypted */)
      && /* jnt */
        == 259) {
      /* jnt */,
        /* jnt */)
      );
    }

    /* jnt */;
  }

  @Override
  public void iu(class_11909 var1, boolean var2) {
    if (/* jnt */,
        /* jnt */
      )
      && /* jnt */
        == 0) {
      /* jnt */);
    }

    /* jnt */;
  }

  @Override
  public void fr() {
    /* jnt */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted */ ? 1.0F : 0.0F
    );
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (var10 - 1677160998 - 669587773 + 1413812957 + 939807383 ^ 1807234832 ^ 2103876760) - 638756755 ^ 641531525 ^ 1823571747;
    MethodHandle var10000 = kdu[((var10 - 1677160998 - 669587773 + 1413812957 + 939807383 ^ 1807234832 ^ 2103876760) - 638756755 ^ 641531525 ^ 1823571747)
      + 1485955787];
    if (kdu[var10001 + 1485955787] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (-1692398641 | -1892728453) ^ -1624290305; var23 < var13.length(); var23 += (-486360081 >>> -486360081 | 0) & 50069729) {
        int var42 = (var13.charAt(var23) ^ 142) + 232 - 55;
        char var43 = (char)((((var42 & 64512) >> 10 | var42 << 6) ^ 250 ^ 215) + 184 + 130 - 170 - 60);
        var13.setCharAt(var23, (char)((((var42 & 64512) >> 10 | var42 << 6) ^ 250 ^ 215) + 184 + 130 - 170 - 60));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (854773734 + -1170346430 | 0) & 42614849;
        var29 < var16.length();
        var29 += (-1818775600 * (-162526467 - (-1818775600 & -162526467)) | 1) & 437651553
      ) {
        int var48 = var16.charAt(var29) - 'T';
        int var81 = (var48 & 61440) >> 12;
        int var49 = (((var48 & 61440) >> 12 | var48 << 4) + 188 + 46 ^ 116) - 66;
        int var82 = ((((var48 & 61440) >> 12 | var48 << 4) + 188 + 46 ^ 116) - 66 & 0) >> 16;
        var48 = (((var81 | var48 << 4) + 188 + 46 ^ 116) - 66 & 0) >> 16 | (((var48 & 61440) >> 12 | var48 << 4) + 188 + 46 ^ 116) - 66 << 0;
        var81 = ((var82 | var49 << 0) & 61440) >> 12;
        int var51 = ((var82 | var49 << 0) & 61440) >> 12 | var48 << 4;
        int var84 = ((((var82 | var49 << 0) & 61440) >> 12 | var48 << 4) & 0) >> 16;
        char var52 = (char)((((var81 | var48 << 4) & 0) >> 16 | (((var82 | var49 << 0) & 61440) >> 12 | var48 << 4) << 0) + 189);
        var16.setCharAt(var29, (char)((var84 | var51 << 0) + 189));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), uj.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (1739392551 >>> -822059608 | 0) & 352866344; var35 < var19.length(); var35 += (1198884771 << 1732501813 | 1) & 43747803) {
        char var57 = var19.charAt(var35);
        char var62 = (char)(
          (
                (
                    (
                        (
                              (
                                    (((((var57 & 0) >> 16 | var57 << 0) - 207 & 65520) >> 4 | ((var57 & 0) >> 16 | var57 << 0) - 207 << 12) & 65504) >> 5
                                      | ((((var57 & 0) >> 16 | var57 << 0) - 207 & 65520) >> 4 | ((var57 & 0) >> 16 | var57 << 0) - 207 << 12) << 11
                                  )
                                  - 155
                                  - 25
                                  + 202
                                & 65528
                            )
                            >> 3
                          | (
                                (((((var57 & 0) >> 16 | var57 << 0) - 207 & 65520) >> 4 | ((var57 & 0) >> 16 | var57 << 0) - 207 << 12) & 65504) >> 5
                                  | ((((var57 & 0) >> 16 | var57 << 0) - 207 & 65520) >> 4 | ((var57 & 0) >> 16 | var57 << 0) - 207 << 12) << 11
                              )
                              - 155
                              - 25
                              + 202
                            << 13
                      )
                      ^ 0
                  )
                  & 65408
              )
              >> 7
            | (
                (
                    (
                          (
                                (((((var57 & 0) >> 16 | var57 << 0) - 207 & 65520) >> 4 | ((var57 & 0) >> 16 | var57 << 0) - 207 << 12) & 65504) >> 5
                                  | ((((var57 & 0) >> 16 | var57 << 0) - 207 & 65520) >> 4 | ((var57 & 0) >> 16 | var57 << 0) - 207 << 12) << 11
                              )
                              - 155
                              - 25
                              + 202
                            & 65528
                        )
                        >> 3
                      | (
                            (((((var57 & 0) >> 16 | var57 << 0) - 207 & 65520) >> 4 | ((var57 & 0) >> 16 | var57 << 0) - 207 << 12) & 65504) >> 5
                              | ((((var57 & 0) >> 16 | var57 << 0) - 207 & 65520) >> 4 | ((var57 & 0) >> 16 | var57 << 0) - 207 << 12) << 11
                          )
                          - 155
                          - 25
                          + 202
                        << 13
                  )
                  ^ 0
              )
              << 9
        );
        var19.setCharAt(
          var35,
          (char)(
            (
                  (
                      (
                          (
                                (
                                      (((((var57 & 0) >> 16 | var57 << 0) - 207 & 65520) >> 4 | ((var57 & 0) >> 16 | var57 << 0) - 207 << 12) & 65504) >> 5
                                        | ((((var57 & 0) >> 16 | var57 << 0) - 207 & 65520) >> 4 | ((var57 & 0) >> 16 | var57 << 0) - 207 << 12) << 11
                                    )
                                    - 155
                                    - 25
                                    + 202
                                  & 65528
                              )
                              >> 3
                            | (
                                  (((((var57 & 0) >> 16 | var57 << 0) - 207 & 65520) >> 4 | ((var57 & 0) >> 16 | var57 << 0) - 207 << 12) & 65504) >> 5
                                    | ((((var57 & 0) >> 16 | var57 << 0) - 207 & 65520) >> 4 | ((var57 & 0) >> 16 | var57 << 0) - 207 << 12) << 11
                                )
                                - 155
                                - 25
                                + 202
                              << 13
                        )
                        ^ 0
                    )
                    & 65408
                )
                >> 7
              | (
                  (
                      (
                            (
                                  (((((var57 & 0) >> 16 | var57 << 0) - 207 & 65520) >> 4 | ((var57 & 0) >> 16 | var57 << 0) - 207 << 12) & 65504) >> 5
                                    | ((((var57 & 0) >> 16 | var57 << 0) - 207 & 65520) >> 4 | ((var57 & 0) >> 16 | var57 << 0) - 207 << 12) << 11
                                )
                                - 155
                                - 25
                                + 202
                              & 65528
                          )
                          >> 3
                        | (
                              (((((var57 & 0) >> 16 | var57 << 0) - 207 & 65520) >> 4 | ((var57 & 0) >> 16 | var57 << 0) - 207 << 12) & 65504) >> 5
                                | ((((var57 & 0) >> 16 | var57 << 0) - 207 & 65520) >> 4 | ((var57 & 0) >> 16 | var57 << 0) - 207 << 12) << 11
                            )
                            - 155
                            - 25
                            + 202
                          << 13
                    )
                    ^ 0
                )
                << 9
          )
        );
      }

      Class var7 = Class.forName(var19.toString(), false, uj.class.getClassLoader());
      switch ((((var4 ^ 1868526452) + 453587714 - 1219847766 + 98888613 ^ 1800211054 ^ 1549479242) + 380731225 ^ 1599365863) + 940242173 + 620971767) {
        case 539776508:
        case 1900586535:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 993198683:
          var10000 = var0.findSpecial(var7, var5, var6, uj.class);
          break;
        case 1328451018:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 1487071212:
          var10000 = var0.findConstructor(var7, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    kdu[((var10 - 1677160998 - 669587773 + 1413812957 + 939807383 ^ 1807234832 ^ 2103876760) - 638756755 ^ 641531525 ^ 1823571747) + 1485955787] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 ^ 1206901704) - 1192377844 - 1743999123 + 70893811 ^ 303866538) + 1310046139 - 381637059 - 1984154933 + 2032326193;
    MethodHandle var10000 = kdu[((var10 ^ 1206901704) - 1192377844 - 1743999123 + 70893811 ^ 303866538)
      + 1310046139
      - 381637059
      - 1984154933
      + 2032326193
      - 96491457];
    if (kdu[var10001 - 96491457] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = -1343888576 >>> 597570818 ^ 737769680; var24 < var14.length(); var24 += (-654078127 >> 765407915 + -1343603554 | 0) & 90129) {
        int var43 = (var14.charAt(var24) ^ 165 ^ 115) - 10;
        int var10004 = (var43 & 65532) >> 2;
        int var44 = ((var43 & 65532) >> 2 | var43 << 14) - 20;
        int var76 = (((var43 & 65532) >> 2 | var43 << 14) - 20 & 61440) >> 12;
        char var45 = (char)((((((var10004 | var43 << 14) - 20 & 61440) >> 12 | ((var43 & 65532) >> 2 | var43 << 14) - 20 << 4) ^ 208) - 105 ^ 249) - 112);
        var14.setCharAt(var24, (char)((((var76 | var44 << 4) ^ 208) - 105 ^ 249) - 112));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = 650616447 * 2114353599 ^ -2116859967; var30 < var17.length(); var30 += (460264377 << -336209889 | 1) & 1386988191) {
        char var50 = var17.charAt(var30);
        int var77 = (var50 & 'ﰀ') >> 10;
        int var51 = ((((var50 & 'ﰀ') >> 10 | var50 << 6) ^ 161) - 228 ^ 247) + 217 - 61 ^ 249 ^ 17;
        int var78 = ((((((var50 & 'ﰀ') >> 10 | var50 << 6) ^ 161) - 228 ^ 247) + 217 - 61 ^ 249 ^ 17) & 64512) >> 10;
        var50 = (char)(
          (
              (((((var77 | var50 << 6) ^ 161) - 228 ^ 247) + 217 - 61 ^ 249 ^ 17) & 64512) >> 10
                | (((((var50 & 'ﰀ') >> 10 | var50 << 6) ^ 161) - 228 ^ 247) + 217 - 61 ^ 249 ^ 17) << 6
            )
            + 135
        );
        var17.setCharAt(var30, (char)((var78 | var51 << 6) + 135));
      }

      Class var6 = Class.forName(var17.toString(), false, uj.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (523738315 - -2017579721 | 0) & 1074135043; var36 < var20.length(); var36 += (-692441502 << -456146011 | 1) & 674370065) {
        int var57 = var20.charAt(var36) ^ 'F';
        char var60 = (char)(
          (
              (((((var57 & 65504) >> 5 | var57 << 11) + 17 - 56 & 65024) >> 9 | ((var57 & 65504) >> 5 | var57 << 11) + 17 - 56 << 7) & 0) >> 16
                | ((((var57 & 65504) >> 5 | var57 << 11) + 17 - 56 & 65024) >> 9 | ((var57 & 65504) >> 5 | var57 << 11) + 17 - 56 << 7) << 0
            )
            - 109
            - 127
            + 65
            - 152
        );
        var20.setCharAt(
          var36,
          (char)(
            (
                (((((var57 & 65504) >> 5 | var57 << 11) + 17 - 56 & 65024) >> 9 | ((var57 & 65504) >> 5 | var57 << 11) + 17 - 56 << 7) & 0) >> 16
                  | ((((var57 & 65504) >> 5 | var57 << 11) + 17 - 56 & 65024) >> 9 | ((var57 & 65504) >> 5 | var57 << 11) + 17 - 56 << 7) << 0
              )
              - 109
              - 127
              + 65
              - 152
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), uj.class.getClassLoader()).returnType();
      switch (((var4 + 262755813 + 321693318 ^ 1475778562 ^ 1276505795) + 183756808 + 1648765070 - 1409162623 ^ 2096413263) - 145226205 - 1916570598) {
        case 918488806:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1111743489:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1476366628:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 2025314798:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      kdu[((var10 ^ 1206901704) - 1192377844 - 1743999123 + 70893811 ^ 303866538) + 1310046139 - 381637059 - 1984154933 + 2032326193 - 96491457] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
