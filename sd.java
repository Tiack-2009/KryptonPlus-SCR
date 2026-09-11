// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.ByteBuffer;
import net.minecraft.Vec3d;
import net.minecraft.MinecraftClient;

public class sd {
  public VertexFormat cal;
  public int ezu;
  public double uyg = 1.0;
  public ByteBuffer ds = null;
  public long fdt;
  public long hmp;
  public ByteBuffer fq = null;
  public long vy;
  public int pmz;
  public int fqo;
  public boolean vj;
  public double gxz;
  public double iz;
  // [JNT] MethodHandle dispatch table (removed)
  public sd(RenderPipeline var1) {
    this(
      /* jnt */,
      /* jnt */
    );
  }

  public sd(VertexFormat var1, class_5596 var2) {
    this.cal = var1;
    this.ezu = /* jnt */;
  }

  public sd(VertexFormat var1, class_5596 var2, int var3, int var4) {
    this(var1, var2);
    /* jnt */;
  }

  public void qt() {
    int var2 = -1367973098;
    if (null /* jnt:encrypted */) {
      int var10000 = 334871998 >>> -1244342179 ^ 0;

      StringBuilder var10001;
      for (var10001 = (StringBuilder)/* jnt */;
        var10000 < (-733165595 - (863145427 << 1879875302) ^ -139898098);
        var10000 += (2063246799 * 2063246799 | 1) & 1342407307
      ) {
        char var6 = /* jnt */;
        char var11 = (char)(
          (
                (
                    (
                          (
                              (((((var6 & '\ufff8') >> 3 | var6 << '\r') & 65504) >> 5 | ((var6 & '\ufff8') >> 3 | var6 << '\r') << 11) & 65024) >> 9
                                | ((((var6 & '\ufff8') >> 3 | var6 << '\r') & 65504) >> 5 | ((var6 & '\ufff8') >> 3 | var6 << '\r') << 11) << 7
                            )
                            & 57344
                        )
                        >> 13
                      | (
                          (((((var6 & '\ufff8') >> 3 | var6 << '\r') & 65504) >> 5 | ((var6 & '\ufff8') >> 3 | var6 << '\r') << 11) & 65024) >> 9
                            | ((((var6 & '\ufff8') >> 3 | var6 << '\r') & 65504) >> 5 | ((var6 & '\ufff8') >> 3 | var6 << '\r') << 11) << 7
                        )
                        << 3
                  )
                  & 65024
              )
              >> 9
            | (
                (
                      (
                          (((((var6 & '\ufff8') >> 3 | var6 << '\r') & 65504) >> 5 | ((var6 & '\ufff8') >> 3 | var6 << '\r') << 11) & 65024) >> 9
                            | ((((var6 & '\ufff8') >> 3 | var6 << '\r') & 65504) >> 5 | ((var6 & '\ufff8') >> 3 | var6 << '\r') << 11) << 7
                        )
                        & 57344
                    )
                    >> 13
                  | (
                      (((((var6 & '\ufff8') >> 3 | var6 << '\r') & 65504) >> 5 | ((var6 & '\ufff8') >> 3 | var6 << '\r') << 11) & 65024) >> 9
                        | ((((var6 & '\ufff8') >> 3 | var6 << '\r') & 65504) >> 5 | ((var6 & '\ufff8') >> 3 | var6 << '\r') << 11) << 7
                    )
                    << 3
              )
              << 7
        );
        /* jnt */(
            (
                  (
                      (
                            (
                                (((((var6 & '\ufff8') >> 3 | var6 << '\r') & 65504) >> 5 | ((var6 & '\ufff8') >> 3 | var6 << '\r') << 11) & 65024) >> 9
                                  | ((((var6 & '\ufff8') >> 3 | var6 << '\r') & 65504) >> 5 | ((var6 & '\ufff8') >> 3 | var6 << '\r') << 11) << 7
                              )
                              & 57344
                          )
                          >> 13
                        | (
                            (((((var6 & '\ufff8') >> 3 | var6 << '\r') & 65504) >> 5 | ((var6 & '\ufff8') >> 3 | var6 << '\r') << 11) & 65024) >> 9
                              | ((((var6 & '\ufff8') >> 3 | var6 << '\r') & 65504) >> 5 | ((var6 & '\ufff8') >> 3 | var6 << '\r') << 11) << 7
                          )
                          << 3
                    )
                    & 65024
                )
                >> 9
              | (
                  (
                        (
                            (((((var6 & '\ufff8') >> 3 | var6 << '\r') & 65504) >> 5 | ((var6 & '\ufff8') >> 3 | var6 << '\r') << 11) & 65024) >> 9
                              | ((((var6 & '\ufff8') >> 3 | var6 << '\r') & 65504) >> 5 | ((var6 & '\ufff8') >> 3 | var6 << '\r') << 11) << 7
                          )
                          & 57344
                      )
                      >> 13
                    | (
                        (((((var6 & '\ufff8') >> 3 | var6 << '\r') & 65504) >> 5 | ((var6 & '\ufff8') >> 3 | var6 << '\r') << 11) & 65024) >> 9
                          | ((((var6 & '\ufff8') >> 3 | var6 << '\r') & 65504) >> 5 | ((var6 & '\ufff8') >> 3 | var6 << '\r') << 11) << 7
                      )
                      << 3
                )
                << 7
          )
        );
      }

      throw (IllegalStateException)/* jnt */
      );
    } else {
      var2 = 2102755656 & 565058780 ^ 1469640592;

      while (true) {
        switch ((var2 ^ 578691339) - 738180625 + 541363197 + 1696636691 - 1609307378 - 1521942982) {
          case -451245137:
            null /* jnt:encrypted */;
            null /* jnt:encrypted */;
            break;
          case -207280870:
          default:
            null /* jnt:encrypted */);
            null /* jnt:encrypted */;
            null /* jnt:encrypted */;
            null /* jnt:encrypted */;
            if (!null /* jnt:encrypted */) {
              var2 = -1199385325 + -815364722 ^ -472953150;
              continue;
            }

            class_243 var1 = /* jnt */null /* jnt:encrypted */
                )
              )
            );
            null /* jnt:encrypted */
            );
            null /* jnt:encrypted */
            );
            break;
          case 504920036:
            return;
        }

        var2 = (-1197711087 >>> 362854539 | 1562902546) & 1600693495;
      }
    }
  }

  public sd bm(double var1, double var3, double var5) {
    long var7 = null /* jnt:encrypted */;
    /* jnt */(var1 - null /* jnt:encrypted */)
    );
    /* jnt */var3);
    /* jnt */(var5 - null /* jnt:encrypted */)
    );
    null /* jnt:encrypted */ + 12L);
    return this;
  }

  public sd oed(double var1, double var3) {
    long var5 = null /* jnt:encrypted */;
    /* jnt */var1);
    /* jnt */var3);
    null /* jnt:encrypted */ + 8L);
    return this;
  }

  public sd fnd(float var1, float var2) {
    long var3 = null /* jnt:encrypted */;
    /* jnt */;
    /* jnt */;
    null /* jnt:encrypted */ + 8L);
    return this;
  }

  public sd hr(zn var1) {
    long var2 = null /* jnt:encrypted */;
    /* jnt */null /* jnt:encrypted */
    );
    /* jnt */null /* jnt:encrypted */
    );
    /* jnt */null /* jnt:encrypted */
    );
    /* jnt */((int)((float)null /* jnt:encrypted */ * (float)null /* jnt:encrypted */))
    );
    null /* jnt:encrypted */ + 4L);
    return this;
  }

  public int eeg() {
    int var10002 = null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    return var10002;
  }

  public void ojr(int var1, int var2) {
    long var3 = null /* jnt:encrypted */ + (long)null /* jnt:encrypted */ * 4L;
    /* jnt */;
    /* jnt */;
    null /* jnt:encrypted */ + 2);
  }

  public void vfg(int var1, int var2, int var3, int var4) {
    long var5 = null /* jnt:encrypted */ + (long)null /* jnt:encrypted */ * 4L;
    /* jnt */;
    /* jnt */;
    /* jnt */;
    /* jnt */;
    /* jnt */;
    /* jnt */;
    null /* jnt:encrypted */ + 6);
  }

  public void cyo(int var1, int var2, int var3) {
    long var4 = null /* jnt:encrypted */ + (long)null /* jnt:encrypted */ * 4L;
    /* jnt */;
    /* jnt */;
    /* jnt */;
    null /* jnt:encrypted */ + 3);
  }

  public void ncj() {
    /* jnt */;
  }

  public void bp() {
    /* jnt */;
  }

  public void wb() {
    /* jnt */;
  }

  public void drj(int var1, int var2) {
    int var6 = 1057401072;
    if (null /* jnt:encrypted */ != null
      && null /* jnt:encrypted */ != null) {
      var6 = -224966294 ^ -224966294 ^ 960114710;
    } else {
      var6 = (134953010 + 1819532984 | -1006591983) & -283004939;
    }

    while (true) {
      switch ((var6 ^ 1248633713) + 26728960 + 796207290 + 1345361694 - 903109751 - 1123028074) {
        case -1228523913:
        default:
          /* jnt */;
          return;
        case -946623280:
          if ((null /* jnt:encrypted */ + var2) * 4
            >= /* jnt */
            )) {
            int var7 = /* jnt */
                )
                * 2,
              /* jnt */
                )
                + var2 * 4
            );
            ByteBuffer var8 = /* jnt */;
            /* jnt */
              ),
              /* jnt */,
              (long)null /* jnt:encrypted */ * 4L
            );
            null /* jnt:encrypted */;
            null /* jnt:encrypted */
            );
          }

          var6 = (-1542122550 & -2024250539 | 1345215146) & 1940880058;
          break;
        case 582757074:
          return;
        case 2077213790:
          if ((null /* jnt:encrypted */ + var1) * null /* jnt:encrypted */
            >= /* jnt */
            )) {
            int var3 = /* jnt */;
            int var4 = /* jnt */
                )
                * 2,
              /* jnt */
                )
                + var1 * null /* jnt:encrypted */
            );
            ByteBuffer var5 = /* jnt */;
            /* jnt */
              ),
              /* jnt */,
              (long)var3
            );
            null /* jnt:encrypted */;
            null /* jnt:encrypted */
            );
            null /* jnt:encrypted */ + (long)var3);
          }

          var6 = (1055081933 & 1277455877 | -178857816) & -143139848;
      }
    }
  }

  public void vvz(int var1, int var2) {
    null /* jnt:encrypted */
    );
    long var10003 = /* jnt */
    );
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted */
    );
  }

  public void ag() {
    if (null /* jnt:encrypted */) {
      null /* jnt:encrypted */;
    } else {
      int var10000 = (-2012894106 | -2012894106) ^ -2012894106;

      StringBuilder var10001;
      for (var10001 = (StringBuilder)/* jnt */;
        var10000 < (1101790373 * 1101790373 ^ 1203978876);
        var10000 += -207049892 >> -419917063 ^ -8
      ) {
        int var3 = /* jnt */ - 'y' + 9 - 59 - 242;
        char var4 = (char)((var3 & 32768) >> 15 | var3 << 1);
        /* jnt */((var3 & 32768) >> 15 | var3 << 1));
      }

      throw (IllegalStateException)/* jnt */
      );
    }
  }

  public boolean cxt() {
    return null /* jnt:encrypted */;
  }

  public GpuBuffer icf() {
    /* jnt */, /* jnt */
    );
    return /* jnt */,
      null /* jnt:encrypted */
    );
  }

  public GpuBuffer jx() {
    /* jnt */, null /* jnt:encrypted */ * 4
    );
    return /* jnt */,
      null /* jnt:encrypted */
    );
  }

  public int duf() {
    return null /* jnt:encrypted */;
  }

  public int cz() {
    return (int)(null /* jnt:encrypted */ - null /* jnt:encrypted */);
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (((var10 - 354267221 ^ 1487540058) - 2005503751 - 890988360 + 959244701 ^ 812494523) + 1220518740 ^ 661083445) - 375606374;
    MethodHandle var10000 = fvw[(((var10 - 354267221 ^ 1487540058) - 2005503751 - 890988360 + 959244701 ^ 812494523) + 1220518740 ^ 661083445) - 375606374
      ^ 1629687196];
    if (fvw[var10001 ^ 1629687196] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (-1086644869 - 1123749246 | 0) & 3715074; var23 < var13.length(); var23 += ~(-1183128834 >> -218671282 - (-1183128834 - -218671282))) {
        char var42 = var13.charAt(var23);
        char var45 = (char)(
          (
              (
                    (
                        (((((var42 & '\uf800') >> 11 | var42 << 5) - 29 ^ 123) & 65534) >> 1 | (((var42 & '\uf800') >> 11 | var42 << 5) - 29 ^ 123) << 15)
                          ^ 154
                          ^ 229
                          ^ 243
                          ^ 60
                      )
                      & 65520
                  )
                  >> 4
                | (
                    (((((var42 & '\uf800') >> 11 | var42 << 5) - 29 ^ 123) & 65534) >> 1 | (((var42 & '\uf800') >> 11 | var42 << 5) - 29 ^ 123) << 15)
                      ^ 154
                      ^ 229
                      ^ 243
                      ^ 60
                  )
                  << 12
            )
            - 116
        );
        var13.setCharAt(
          var23,
          (char)(
            (
                (
                      (
                          (((((var42 & '\uf800') >> 11 | var42 << 5) - 29 ^ 123) & 65534) >> 1 | (((var42 & '\uf800') >> 11 | var42 << 5) - 29 ^ 123) << 15)
                            ^ 154
                            ^ 229
                            ^ 243
                            ^ 60
                        )
                        & 65520
                    )
                    >> 4
                  | (
                      (((((var42 & '\uf800') >> 11 | var42 << 5) - 29 ^ 123) & 65534) >> 1 | (((var42 & '\uf800') >> 11 | var42 << 5) - 29 ^ 123) << 15)
                        ^ 154
                        ^ 229
                        ^ 243
                        ^ 60
                    )
                    << 12
              )
              - 116
          )
        );
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = -1954055515 & 1107042226 ^ 25434784; var29 < var16.length(); var29 += (-1833811679 | -1002387454 | 0) & 688665669) {
        int var50 = (var16.charAt(var29) ^ '\'' ^ 236) + 54 ^ 129;
        char var51 = (char)(((((var50 & 65535) >> 0 | var50 << 16) ^ 190) - 121 ^ 140) + 127 ^ 141);
        var16.setCharAt(var29, (char)(((((var50 & 65535) >> 0 | var50 << 16) ^ 190) - 121 ^ 140) + 127 ^ 141));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), sd.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (-569487295 & -569487295 | 0) & 24219044; var35 < var19.length(); var35 += (-1238330157 - -6117289 | 1) & 17961859) {
        int var56 = var19.charAt(var35) ^ 190;
        char var61 = (char)(
          (
              (
                  (
                        (
                            (
                                  (
                                      (
                                          ((((((var56 & 57344) >> 13 | var56 << 3) & 65532) >> 2 | ((var56 & 57344) >> 13 | var56 << 3) << 14) ^ 182) & 32768)
                                              >> 15
                                            | (((((var56 & 57344) >> 13 | var56 << 3) & 65532) >> 2 | ((var56 & 57344) >> 13 | var56 << 3) << 14) ^ 182) << 1
                                        )
                                        ^ 56
                                    )
                                    & 65024
                                )
                                >> 9
                              | (
                                  (
                                      ((((((var56 & 57344) >> 13 | var56 << 3) & 65532) >> 2 | ((var56 & 57344) >> 13 | var56 << 3) << 14) ^ 182) & 32768)
                                          >> 15
                                        | (((((var56 & 57344) >> 13 | var56 << 3) & 65532) >> 2 | ((var56 & 57344) >> 13 | var56 << 3) << 14) ^ 182) << 1
                                    )
                                    ^ 56
                                )
                                << 7
                          )
                          & 65504
                      )
                      >> 5
                    | (
                        (
                              (
                                  (
                                      ((((((var56 & 57344) >> 13 | var56 << 3) & 65532) >> 2 | ((var56 & 57344) >> 13 | var56 << 3) << 14) ^ 182) & 32768)
                                          >> 15
                                        | (((((var56 & 57344) >> 13 | var56 << 3) & 65532) >> 2 | ((var56 & 57344) >> 13 | var56 << 3) << 14) ^ 182) << 1
                                    )
                                    ^ 56
                                )
                                & 65024
                            )
                            >> 9
                          | (
                              (
                                  ((((((var56 & 57344) >> 13 | var56 << 3) & 65532) >> 2 | ((var56 & 57344) >> 13 | var56 << 3) << 14) ^ 182) & 32768) >> 15
                                    | (((((var56 & 57344) >> 13 | var56 << 3) & 65532) >> 2 | ((var56 & 57344) >> 13 | var56 << 3) << 14) ^ 182) << 1
                                )
                                ^ 56
                            )
                            << 7
                      )
                      << 11
                )
                ^ 219
            )
            + 138
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
                                        (
                                            ((((((var56 & 57344) >> 13 | var56 << 3) & 65532) >> 2 | ((var56 & 57344) >> 13 | var56 << 3) << 14) ^ 182) & 32768)
                                                >> 15
                                              | (((((var56 & 57344) >> 13 | var56 << 3) & 65532) >> 2 | ((var56 & 57344) >> 13 | var56 << 3) << 14) ^ 182) << 1
                                          )
                                          ^ 56
                                      )
                                      & 65024
                                  )
                                  >> 9
                                | (
                                    (
                                        ((((((var56 & 57344) >> 13 | var56 << 3) & 65532) >> 2 | ((var56 & 57344) >> 13 | var56 << 3) << 14) ^ 182) & 32768)
                                            >> 15
                                          | (((((var56 & 57344) >> 13 | var56 << 3) & 65532) >> 2 | ((var56 & 57344) >> 13 | var56 << 3) << 14) ^ 182) << 1
                                      )
                                      ^ 56
                                  )
                                  << 7
                            )
                            & 65504
                        )
                        >> 5
                      | (
                          (
                                (
                                    (
                                        ((((((var56 & 57344) >> 13 | var56 << 3) & 65532) >> 2 | ((var56 & 57344) >> 13 | var56 << 3) << 14) ^ 182) & 32768)
                                            >> 15
                                          | (((((var56 & 57344) >> 13 | var56 << 3) & 65532) >> 2 | ((var56 & 57344) >> 13 | var56 << 3) << 14) ^ 182) << 1
                                      )
                                      ^ 56
                                  )
                                  & 65024
                              )
                              >> 9
                            | (
                                (
                                    ((((((var56 & 57344) >> 13 | var56 << 3) & 65532) >> 2 | ((var56 & 57344) >> 13 | var56 << 3) << 14) ^ 182) & 32768) >> 15
                                      | (((((var56 & 57344) >> 13 | var56 << 3) & 65532) >> 2 | ((var56 & 57344) >> 13 | var56 << 3) << 14) ^ 182) << 1
                                  )
                                  ^ 56
                              )
                              << 7
                        )
                        << 11
                  )
                  ^ 219
              )
              + 138
          )
        );
      }

      Class var7 = Class.forName(var19.toString(), false, sd.class.getClassLoader());
      switch ((var4 + 1943532160 + 900004613 - 1758957158 - 1200784445 + 2042125541 + 832191718 - 2084473690 ^ 95070329 ^ 32900918) + 1205103083) {
        case 11497458:
        case 523459263:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 603890848:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 903095388:
          var10000 = var0.findSpecial(var7, var5, var6, sd.class);
          break;
        case 1450393925:
          var10000 = var0.findConstructor(var7, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    fvw[(((var10 - 354267221 ^ 1487540058) - 2005503751 - 890988360 + 959244701 ^ 812494523) + 1220518740 ^ 661083445) - 375606374 ^ 1629687196] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (var10 - 577211395 - 2134273581 + 1521291002 ^ 1165027967) + 1507437102 - 2069979787 - 326305264 + 252958098 + 1449428860;
    MethodHandle var10000 = fvw[(var10 - 577211395 - 2134273581 + 1521291002 ^ 1165027967)
      + 1507437102
      - 2069979787
      - 326305264
      + 252958098
      + 1449428860
      - 1010601711];
    if (fvw[var10001 - 1010601711] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (-192125241 << 521231778 | 0) & 71304353; var24 < var14.length(); var24 += -710511554 ^ -710511554 & 1285241650 ^ -1859894259) {
        int var43 = (var14.charAt(var24) + 'T' - 60 ^ 55) + 130;
        int var10004 = (var43 & 0) >> 16;
        int var44 = ((var43 & 0) >> 16 | var43 << 0) - 79;
        int var90 = (((var43 & 0) >> 16 | var43 << 0) - 79 & 57344) >> 13;
        var43 = ((var10004 | var43 << 0) - 79 & 57344) >> 13 | ((var43 & 0) >> 16 | var43 << 0) - 79 << 3;
        var10004 = ((var90 | var44 << 3) & 49152) >> 14;
        int var46 = ((var90 | var44 << 3) & 49152) >> 14 | var43 << 2;
        int var92 = ((((var90 | var44 << 3) & 49152) >> 14 | var43 << 2) & 57344) >> 13;
        char var47 = (char)((((var10004 | var43 << 2) & 57344) >> 13 | (((var90 | var44 << 3) & 49152) >> 14 | var43 << 2) << 3) ^ 24);
        var14.setCharAt(var24, (char)((var92 | var46 << 3) ^ 24));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (656003921 & -1810263702 | 0) & -1293783928; var30 < var17.length(); var30 += -2136526675 & -179900263 ^ -2147078008) {
        int var52 = var17.charAt(var30);
        int var93 = (var52 & 65528) >> 3;
        int var53 = (var52 & 65528) >> 3 | var52 << 13;
        int var94 = (((var52 & 65528) >> 3 | var52 << 13) & 65520) >> 4;
        var52 = (((var93 | var52 << 13) & 65520) >> 4 | ((var52 & 65528) >> 3 | var52 << 13) << 12) + 55;
        var93 = ((var94 | var53 << 12) + 55 & 65408) >> 7;
        int var55 = (((var94 | var53 << 12) + 55 & 65408) >> 7 | var52 << 9) ^ 125;
        int var96 = (((((var94 | var53 << 12) + 55 & 65408) >> 7 | var52 << 9) ^ 125) & 32768) >> 15;
        var52 = (((var93 | var52 << 9) ^ 125) & 32768) >> 15 | ((((var94 | var53 << 12) + 55 & 65408) >> 7 | var52 << 9) ^ 125) << 1;
        var93 = ((var96 | var55 << 1) & 65472) >> 6;
        int var57 = ((var96 | var55 << 1) & 65472) >> 6 | var52 << 10;
        int var98 = ((((var96 | var55 << 1) & 65472) >> 6 | var52 << 10) & 65472) >> 6;
        char var58 = (char)(((((var93 | var52 << 10) & 65472) >> 6 | (((var96 | var55 << 1) & 65472) >> 6 | var52 << 10) << 10) ^ 245) - 41);
        var17.setCharAt(var30, (char)(((var98 | var57 << 10) ^ 245) - 41));
      }

      Class var6 = Class.forName(var17.toString(), false, sd.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (237444005 ^ -21775125 | 0) & 23740448; var36 < var20.length(); var36 += -258294226 - (-648138262 + -420229940) ^ 810073977) {
        int var63 = var20.charAt(var36);
        int var99 = (var63 & 32768) >> 15;
        int var64 = (var63 & 32768) >> 15 | var63 << 1;
        int var100 = (((var63 & 32768) >> 15 | var63 << 1) & 64512) >> 10;
        var63 = ((var99 | var63 << 1) & 64512) >> 10 | ((var63 & 32768) >> 15 | var63 << 1) << 6;
        var99 = ((var100 | var64 << 6) & 65535) >> 0;
        int var66 = (((var100 | var64 << 6) & 65535) >> 0 | var63 << 16) - 221 - 42 - 145 - 170 + 141 + 169;
        int var102 = ((((var100 | var64 << 6) & 65535) >> 0 | var63 << 16) - 221 - 42 - 145 - 170 + 141 + 169 & 65472) >> 6;
        char var67 = (char)(
          ((var99 | var63 << 16) - 221 - 42 - 145 - 170 + 141 + 169 & 65472) >> 6
            | (((var100 | var64 << 6) & 65535) >> 0 | var63 << 16) - 221 - 42 - 145 - 170 + 141 + 169 << 10
        );
        var20.setCharAt(var36, (char)(var102 | var66 << 10));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), sd.class.getClassLoader()).returnType();
      switch ((((var4 ^ 378015746 ^ 217231507) - 1195061893 + 682182179 ^ 649214064) - 2112816917 ^ 141976190 ^ 239277427) + 1446224204 - 682545979) {
        case 1037777211:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1320578608:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1408309780:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1466221136:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      fvw[(var10 - 577211395 - 2134273581 + 1521291002 ^ 1165027967) + 1507437102 - 2069979787 - 326305264 + 252958098 + 1449428860 - 1010601711] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
