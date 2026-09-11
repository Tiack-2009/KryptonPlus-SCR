// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Builder;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

public class td extends Builder {
  public boolean wvf;
  // [JNT] MethodHandle dispatch table (removed)
  public td(Snippet... var1) {
    int var6 = 1475390811;
    super();
    Snippet[] var2 = var1;
    int var3 = var1.length;
    int var4 = 0;

    while (true) {
      var6 = -1118449580 >>> 479715735 ^ -814438298;

      while (true) {
        switch ((var6 - 522097712 + 417287327 ^ 504579048) + 639063020 + 354425993 ^ 1447846599) {
          case -1735692396:
            return;
          case 1142026271:
        }

        if (var4 < var3) {
          Snippet var5 = var2[var4];
          /* jnt */;
          var4++;
          break;
        }

        var6 = (-347885034 | -1692397280 | -2082724669) & -1814286649;
      }
    }
  }

  public td dm() {
    null /* jnt:encrypted */;
    return this;
  }

  public RenderPipeline build() {
    RenderPipeline var1 = /* jnt */;
    /* jnt */var1, null /* jnt:encrypted */);
    return var1;
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 ^ 507498233) - 1603542618 ^ 1434242829) - 1047544540 + 168541054 - 64443757 ^ 1704866452 ^ 1039125928 ^ 1455046055;
    MethodHandle var10000 = gjm[(((var10 ^ 507498233) - 1603542618 ^ 1434242829) - 1047544540 + 168541054 - 64443757 ^ 1704866452 ^ 1039125928 ^ 1455046055)
      - 813248749];
    if (gjm[var10001 - 813248749] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (-1069092372 | -365833853) ^ -361238033; var23 < var13.length(); var23 += 296945806 >> 296945806 ^ 18125) {
        int var42 = var13.charAt(var23);
        int var10004 = (var42 & 32768) >> 15;
        int var43 = (var42 & 32768) >> 15 | var42 << 1;
        int var91 = (((var42 & 32768) >> 15 | var42 << 1) & 65504) >> 5;
        var42 = (((var10004 | var42 << 1) & 65504) >> 5 | ((var42 & 32768) >> 15 | var42 << 1) << 11) - 166;
        var10004 = ((var91 | var43 << 11) - 166 & 32768) >> 15;
        int var45 = ((var91 | var43 << 11) - 166 & 32768) >> 15 | var42 << 1;
        int var93 = ((((var91 | var43 << 11) - 166 & 32768) >> 15 | var42 << 1) & 65534) >> 1;
        var42 = (((var10004 | var42 << 1) & 65534) >> 1 | (((var91 | var43 << 11) - 166 & 32768) >> 15 | var42 << 1) << 15) + 89;
        var10004 = ((var93 | var45 << 15) + 89 & 0) >> 16;
        int var47 = (((var93 | var45 << 15) + 89 & 0) >> 16 | var42 << 0) ^ 111;
        int var95 = (((((var93 | var45 << 15) + 89 & 0) >> 16 | var42 << 0) ^ 111) & 65504) >> 5;
        char var48 = (char)(((((var10004 | var42 << 0) ^ 111) & 65504) >> 5 | ((((var93 | var45 << 15) + 89 & 0) >> 16 | var42 << 0) ^ 111) << 11) ^ 146);
        var13.setCharAt(var23, (char)((var95 | var47 << 11) ^ 146));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (-1979039673 - 306069943 | 0) & -2146434810; var29 < var16.length(); var29 += 963772189 * (963772189 << 963772189) ^ 536870913) {
        int var53 = var16.charAt(var29);
        int var96 = (var53 & 0) >> 16;
        int var54 = (((var53 & 0) >> 16 | var53 << 0) ^ 82 ^ 240) + 228;
        int var97 = ((((var53 & 0) >> 16 | var53 << 0) ^ 82 ^ 240) + 228 & 65024) >> 9;
        var53 = (((var96 | var53 << 0) ^ 82 ^ 240) + 228 & 65024) >> 9 | (((var53 & 0) >> 16 | var53 << 0) ^ 82 ^ 240) + 228 << 7;
        var96 = ((var97 | var54 << 7) & 61440) >> 12;
        int var56 = ((var97 | var54 << 7) & 61440) >> 12 | var53 << 4;
        int var99 = ((((var97 | var54 << 7) & 61440) >> 12 | var53 << 4) & 65534) >> 1;
        char var57 = (char)(((((var96 | var53 << 4) & 65534) >> 1 | (((var97 | var54 << 7) & 61440) >> 12 | var53 << 4) << 15) - 129 ^ 97) + 147);
        var16.setCharAt(var29, (char)(((var99 | var56 << 15) - 129 ^ 97) + 147));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), td.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (1564179776 << -226886029 | 0) & 280429516; var35 < var19.length(); var35 += (-2065717828 >>> 489251522 | 0) & -1765800431) {
        char var62 = var19.charAt(var35);
        char var67 = (char)(
          (
                (
                    (
                          (
                                (
                                      (
                                          ((((var62 & '\uffc0') >> 6 | var62 << '\n') + 211 + 183 + 63 ^ 90) & 65535) >> 0
                                            | (((var62 & '\uffc0') >> 6 | var62 << '\n') + 211 + 183 + 63 ^ 90) << 16
                                        )
                                        & 57344
                                    )
                                    >> 13
                                  | (
                                      ((((var62 & '\uffc0') >> 6 | var62 << '\n') + 211 + 183 + 63 ^ 90) & 65535) >> 0
                                        | (((var62 & '\uffc0') >> 6 | var62 << '\n') + 211 + 183 + 63 ^ 90) << 16
                                    )
                                    << 3
                              )
                              - 134
                            & 49152
                        )
                        >> 14
                      | (
                            (
                                  (
                                      ((((var62 & '\uffc0') >> 6 | var62 << '\n') + 211 + 183 + 63 ^ 90) & 65535) >> 0
                                        | (((var62 & '\uffc0') >> 6 | var62 << '\n') + 211 + 183 + 63 ^ 90) << 16
                                    )
                                    & 57344
                                )
                                >> 13
                              | (
                                  ((((var62 & '\uffc0') >> 6 | var62 << '\n') + 211 + 183 + 63 ^ 90) & 65535) >> 0
                                    | (((var62 & '\uffc0') >> 6 | var62 << '\n') + 211 + 183 + 63 ^ 90) << 16
                                )
                                << 3
                          )
                          - 134
                        << 2
                  )
                  & 0
              )
              >> 16
            | (
                (
                      (
                            (
                                  (
                                      ((((var62 & '\uffc0') >> 6 | var62 << '\n') + 211 + 183 + 63 ^ 90) & 65535) >> 0
                                        | (((var62 & '\uffc0') >> 6 | var62 << '\n') + 211 + 183 + 63 ^ 90) << 16
                                    )
                                    & 57344
                                )
                                >> 13
                              | (
                                  ((((var62 & '\uffc0') >> 6 | var62 << '\n') + 211 + 183 + 63 ^ 90) & 65535) >> 0
                                    | (((var62 & '\uffc0') >> 6 | var62 << '\n') + 211 + 183 + 63 ^ 90) << 16
                                )
                                << 3
                          )
                          - 134
                        & 49152
                    )
                    >> 14
                  | (
                        (
                              (
                                  ((((var62 & '\uffc0') >> 6 | var62 << '\n') + 211 + 183 + 63 ^ 90) & 65535) >> 0
                                    | (((var62 & '\uffc0') >> 6 | var62 << '\n') + 211 + 183 + 63 ^ 90) << 16
                                )
                                & 57344
                            )
                            >> 13
                          | (
                              ((((var62 & '\uffc0') >> 6 | var62 << '\n') + 211 + 183 + 63 ^ 90) & 65535) >> 0
                                | (((var62 & '\uffc0') >> 6 | var62 << '\n') + 211 + 183 + 63 ^ 90) << 16
                            )
                            << 3
                      )
                      - 134
                    << 2
              )
              << 0
        );
        var19.setCharAt(
          var35,
          (char)(
            (
                  (
                      (
                            (
                                  (
                                        (
                                            ((((var62 & '\uffc0') >> 6 | var62 << '\n') + 211 + 183 + 63 ^ 90) & 65535) >> 0
                                              | (((var62 & '\uffc0') >> 6 | var62 << '\n') + 211 + 183 + 63 ^ 90) << 16
                                          )
                                          & 57344
                                      )
                                      >> 13
                                    | (
                                        ((((var62 & '\uffc0') >> 6 | var62 << '\n') + 211 + 183 + 63 ^ 90) & 65535) >> 0
                                          | (((var62 & '\uffc0') >> 6 | var62 << '\n') + 211 + 183 + 63 ^ 90) << 16
                                      )
                                      << 3
                                )
                                - 134
                              & 49152
                          )
                          >> 14
                        | (
                              (
                                    (
                                        ((((var62 & '\uffc0') >> 6 | var62 << '\n') + 211 + 183 + 63 ^ 90) & 65535) >> 0
                                          | (((var62 & '\uffc0') >> 6 | var62 << '\n') + 211 + 183 + 63 ^ 90) << 16
                                      )
                                      & 57344
                                  )
                                  >> 13
                                | (
                                    ((((var62 & '\uffc0') >> 6 | var62 << '\n') + 211 + 183 + 63 ^ 90) & 65535) >> 0
                                      | (((var62 & '\uffc0') >> 6 | var62 << '\n') + 211 + 183 + 63 ^ 90) << 16
                                  )
                                  << 3
                            )
                            - 134
                          << 2
                    )
                    & 0
                )
                >> 16
              | (
                  (
                        (
                              (
                                    (
                                        ((((var62 & '\uffc0') >> 6 | var62 << '\n') + 211 + 183 + 63 ^ 90) & 65535) >> 0
                                          | (((var62 & '\uffc0') >> 6 | var62 << '\n') + 211 + 183 + 63 ^ 90) << 16
                                      )
                                      & 57344
                                  )
                                  >> 13
                                | (
                                    ((((var62 & '\uffc0') >> 6 | var62 << '\n') + 211 + 183 + 63 ^ 90) & 65535) >> 0
                                      | (((var62 & '\uffc0') >> 6 | var62 << '\n') + 211 + 183 + 63 ^ 90) << 16
                                  )
                                  << 3
                            )
                            - 134
                          & 49152
                      )
                      >> 14
                    | (
                          (
                                (
                                    ((((var62 & '\uffc0') >> 6 | var62 << '\n') + 211 + 183 + 63 ^ 90) & 65535) >> 0
                                      | (((var62 & '\uffc0') >> 6 | var62 << '\n') + 211 + 183 + 63 ^ 90) << 16
                                  )
                                  & 57344
                              )
                              >> 13
                            | (
                                ((((var62 & '\uffc0') >> 6 | var62 << '\n') + 211 + 183 + 63 ^ 90) & 65535) >> 0
                                  | (((var62 & '\uffc0') >> 6 | var62 << '\n') + 211 + 183 + 63 ^ 90) << 16
                              )
                              << 3
                        )
                        - 134
                      << 2
                )
                << 0
          )
        );
      }

      Class var7 = Class.forName(var19.toString(), false, td.class.getClassLoader());
      switch ((((var4 - 1041334109 ^ 1044809484) + 519743057 ^ 997934767) - 1008668577 - 736077813 + 1659074251 - 1676822494 ^ 156741298) - 1122175570) {
        case 1578171282:
        case 1994022393:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1841285715:
          var10000 = var0.findSpecial(var7, var5, var6, td.class);
          break;
        case 1998709548:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 2040207803:
          var10000 = var0.findConstructor(var7, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    gjm[(((var10 ^ 507498233) - 1603542618 ^ 1434242829) - 1047544540 + 168541054 - 64443757 ^ 1704866452 ^ 1039125928 ^ 1455046055) - 813248749] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (((var10 ^ 1763424432) + 679611269 ^ 1379956688) + 1613502988 ^ 568182766 ^ 818902796 ^ 1629345819 ^ 1371869416) + 629265045;
    MethodHandle var10000 = gjm[(((var10 ^ 1763424432) + 679611269 ^ 1379956688) + 1613502988 ^ 568182766 ^ 818902796 ^ 1629345819 ^ 1371869416)
      + 629265045
      - 698440594];
    if (gjm[var10001 - 698440594] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = 852357035 & -520503929 ^ 550088067; var24 < var14.length(); var24 += (-794016156 | -794016156 | 1) & 55746691) {
        int var43 = var14.charAt(var24) + 16 - 115 - 22 ^ 172;
        char var46 = (char)(
          (
              ((((((var43 & 65472) >> 6 | var43 << 10) & 65535) >> 0 | ((var43 & 65472) >> 6 | var43 << 10) << 16) ^ 50 ^ 5) & 65528) >> 3
                | (((((var43 & 65472) >> 6 | var43 << 10) & 65535) >> 0 | ((var43 & 65472) >> 6 | var43 << 10) << 16) ^ 50 ^ 5) << 13
            )
            + 123
        );
        var14.setCharAt(
          var24,
          (char)(
            (
                ((((((var43 & 65472) >> 6 | var43 << 10) & 65535) >> 0 | ((var43 & 65472) >> 6 | var43 << 10) << 16) ^ 50 ^ 5) & 65528) >> 3
                  | (((((var43 & 65472) >> 6 | var43 << 10) & 65535) >> 0 | ((var43 & 65472) >> 6 | var43 << 10) << 16) ^ 50 ^ 5) << 13
              )
              + 123
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (-1276270171 - 353421343 | 0) & 539105400; var30 < var17.length(); var30 += (-1770927405 * -79233718 | 1) & 350244865) {
        char var51 = var17.charAt(var30);
        char var52 = (char)((((((var51 & '︀') >> 9 | var51 << 7) + 38 ^ 43) + 115 ^ 4) - 54 - 206 ^ 130) + 245 + 83);
        var17.setCharAt(var30, (char)((((((var51 & '︀') >> 9 | var51 << 7) + 38 ^ 43) + 115 ^ 4) - 54 - 206 ^ 130) + 245 + 83));
      }

      Class var6 = Class.forName(var17.toString(), false, td.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (1798818107 + (-1352163658 << -1023215227) | 0) & -2016141308;
        var36 < var20.length();
        var36 += (-837183636 & -837183636 | 1) & 824590355
      ) {
        int var57 = var20.charAt(var36) - 14;
        char var62 = (char)(
          (
              (
                    (
                        (
                            (
                                  (
                                      (
                                            (
                                                (((var57 & 65408) >> 7 | var57 << 9) - 218 + 231 & 65534) >> 1
                                                  | ((var57 & 65408) >> 7 | var57 << 9) - 218 + 231 << 15
                                              )
                                              & 32768
                                          )
                                          >> 15
                                        | (
                                            (((var57 & 65408) >> 7 | var57 << 9) - 218 + 231 & 65534) >> 1
                                              | ((var57 & 65408) >> 7 | var57 << 9) - 218 + 231 << 15
                                          )
                                          << 1
                                    )
                                    & 57344
                                )
                                >> 13
                              | (
                                  (
                                        ((((var57 & 65408) >> 7 | var57 << 9) - 218 + 231 & 65534) >> 1 | ((var57 & 65408) >> 7 | var57 << 9) - 218 + 231 << 15)
                                          & 32768
                                      )
                                      >> 15
                                    | ((((var57 & 65408) >> 7 | var57 << 9) - 218 + 231 & 65534) >> 1 | ((var57 & 65408) >> 7 | var57 << 9) - 218 + 231 << 15)
                                      << 1
                                )
                                << 3
                          )
                          ^ 207
                      )
                      & 65520
                  )
                  >> 4
                | (
                    (
                        (
                              (
                                  (
                                        ((((var57 & 65408) >> 7 | var57 << 9) - 218 + 231 & 65534) >> 1 | ((var57 & 65408) >> 7 | var57 << 9) - 218 + 231 << 15)
                                          & 32768
                                      )
                                      >> 15
                                    | ((((var57 & 65408) >> 7 | var57 << 9) - 218 + 231 & 65534) >> 1 | ((var57 & 65408) >> 7 | var57 << 9) - 218 + 231 << 15)
                                      << 1
                                )
                                & 57344
                            )
                            >> 13
                          | (
                              (((((var57 & 65408) >> 7 | var57 << 9) - 218 + 231 & 65534) >> 1 | ((var57 & 65408) >> 7 | var57 << 9) - 218 + 231 << 15) & 32768)
                                  >> 15
                                | ((((var57 & 65408) >> 7 | var57 << 9) - 218 + 231 & 65534) >> 1 | ((var57 & 65408) >> 7 | var57 << 9) - 218 + 231 << 15) << 1
                            )
                            << 3
                      )
                      ^ 207
                  )
                  << 12
            )
            + 228
        );
        var20.setCharAt(
          var36,
          (char)(
            (
                (
                      (
                          (
                              (
                                    (
                                        (
                                              (
                                                  (((var57 & 65408) >> 7 | var57 << 9) - 218 + 231 & 65534) >> 1
                                                    | ((var57 & 65408) >> 7 | var57 << 9) - 218 + 231 << 15
                                                )
                                                & 32768
                                            )
                                            >> 15
                                          | (
                                              (((var57 & 65408) >> 7 | var57 << 9) - 218 + 231 & 65534) >> 1
                                                | ((var57 & 65408) >> 7 | var57 << 9) - 218 + 231 << 15
                                            )
                                            << 1
                                      )
                                      & 57344
                                  )
                                  >> 13
                                | (
                                    (
                                          (
                                              (((var57 & 65408) >> 7 | var57 << 9) - 218 + 231 & 65534) >> 1
                                                | ((var57 & 65408) >> 7 | var57 << 9) - 218 + 231 << 15
                                            )
                                            & 32768
                                        )
                                        >> 15
                                      | ((((var57 & 65408) >> 7 | var57 << 9) - 218 + 231 & 65534) >> 1 | ((var57 & 65408) >> 7 | var57 << 9) - 218 + 231 << 15)
                                        << 1
                                  )
                                  << 3
                            )
                            ^ 207
                        )
                        & 65520
                    )
                    >> 4
                  | (
                      (
                          (
                                (
                                    (
                                          (
                                              (((var57 & 65408) >> 7 | var57 << 9) - 218 + 231 & 65534) >> 1
                                                | ((var57 & 65408) >> 7 | var57 << 9) - 218 + 231 << 15
                                            )
                                            & 32768
                                        )
                                        >> 15
                                      | ((((var57 & 65408) >> 7 | var57 << 9) - 218 + 231 & 65534) >> 1 | ((var57 & 65408) >> 7 | var57 << 9) - 218 + 231 << 15)
                                        << 1
                                  )
                                  & 57344
                              )
                              >> 13
                            | (
                                (
                                      ((((var57 & 65408) >> 7 | var57 << 9) - 218 + 231 & 65534) >> 1 | ((var57 & 65408) >> 7 | var57 << 9) - 218 + 231 << 15)
                                        & 32768
                                    )
                                    >> 15
                                  | ((((var57 & 65408) >> 7 | var57 << 9) - 218 + 231 & 65534) >> 1 | ((var57 & 65408) >> 7 | var57 << 9) - 218 + 231 << 15)
                                    << 1
                              )
                              << 3
                        )
                        ^ 207
                    )
                    << 12
              )
              + 228
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), td.class.getClassLoader()).returnType();
      switch ((((var4 ^ 1897704486) + 822932377 ^ 840197942) + 1745560973 ^ 944706792 ^ 1212069875 ^ 1292639252) - 1807592962 + 1047940299 - 1419521719) {
        case 280101818:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 341404385:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 749808147:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1590376744:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      gjm[(((var10 ^ 1763424432) + 679611269 ^ 1379956688) + 1613502988 ^ 568182766 ^ 818902796 ^ 1629345819 ^ 1371869416) + 629265045 - 698440594] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
