// KryptonPlus Core: NumberSetting
// Original class: zn
// Status: PARTIAL - JNT native encryption (strings in jnt.so)


import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.class_124;
import net.minecraft.Vec3d;
import net.minecraft.NbtElement;
import net.minecraft.LiteralText;
import net.minecraft.class_5251;
import org.joml.Vector3f;
import org.joml.Vector4f;

public class NumberSetting {
  public static zn xd = (zn)/* jnt */;
  public static zn ff = (zn)/* jnt */;
  public static zn ws = (zn)/* jnt */;
  public static zn xjp = (zn)/* jnt */;
  public static zn nb = (zn)/* jnt */;
  public static zn wxk = (zn)/* jnt */;
  public static zn dm = (zn)/* jnt */;
  public static zn ns = (zn)/* jnt */;
  public static zn rf = (zn)/* jnt */;
  public static zn mg = (zn)/* jnt */;
  public static zn yg = (zn)/* jnt */;
  public static zn kl = (zn)/* jnt */;
  public static zn ap = (zn)/* jnt */;
  public int ltb;
  public int dz;
  public int fp;
  public int qb;
  // [JNT] MethodHandle dispatch table (removed)
  public zn() {
    this(255, 255, 255, 255);
  }

  public zn(int var1, int var2, int var3) {
    this.ltb = var1;
    this.dz = var2;
    this.fp = var3;
    this.qb = 255;
    /* jnt */;
  }

  public zn(int var1, int var2, int var3, int var4) {
    this.ltb = var1;
    this.dz = var2;
    this.fp = var3;
    this.qb = var4;
    /* jnt */;
  }

  public zn(float var1, float var2, float var3, float var4) {
    this.ltb = (int)(var1 * 255.0F);
    this.dz = (int)(var2 * 255.0F);
    this.fp = (int)(var3 * 255.0F);
    this.qb = (int)(var4 * 255.0F);
    /* jnt */;
  }

  public zn(int var1) {
    this.ltb = /* jnt */;
    this.dz = /* jnt */;
    this.fp = /* jnt */;
    this.qb = /* jnt */;
  }

  public zn(zn var1) {
    this.ltb = null /* jnt:encrypted */;
    this.dz = null /* jnt:encrypted */;
    this.fp = null /* jnt:encrypted */;
    this.qb = null /* jnt:encrypted */;
  }
  public zn(class_124 var1) {
    int var2 = -1556139647;
    super();
    if (/* jnt */) {
      this.ltb = /* jnt */
        )
      );
      this.dz = /* jnt */
        )
      );
      this.fp = /* jnt */
        )
      );
      this.qb = /* jnt */
        )
      );
      var2 = 65560287 * 1976379719 ^ 248849971;
    } else {
      var2 = (125080345 * -2124679282 | -2050401724) & -1913824409;
    }

    while (true) {
      switch (var2 - 579554990 + 1480895773 + 1715622856 - 1452350368 - 1880828663 ^ 1817898450) {
        case 258091060:
        default:
          this.ltb = 255;
          this.dz = 255;
          this.fp = 255;
          this.qb = 255;
          var2 = 65560287 * 1976379719 ^ 248849971;
          break;
        case 2020303192:
          return;
      }
    }
  }

  public zn(class_5251 var1) {
    this.ltb = /* jnt */
    );
    this.dz = /* jnt */
    );
    this.fp = /* jnt */
    );
    this.qb = /* jnt */
    );
  }
  public zn(class_2583 var1) {
    int var3 = 1377390562;
    super();
    class_5251 var2 = /* jnt */;
    if (var2 == null) {
      this.ltb = 255;
      this.dz = 255;
      this.fp = 255;
      this.qb = 255;
      var3 = 1888989311 * -913659226 ^ 97706808;
    } else {
      var3 = (-1299694423 >>> (929498083 ^ 1090458901) | 1597518997) & 2143171989;
    }

    while (true) {
      switch ((var3 - 2003295300 - 1345190465 ^ 1970131005) - 2141530328 ^ 289899276 ^ 446836340) {
        case 726397296:
        default:
          return;
        case 1758447661:
          this.ltb = /* jnt */
          );
          this.dz = /* jnt */
          );
          this.fp = /* jnt */
          );
          this.qb = /* jnt */
          );
      }

      var3 = 1888989311 * -913659226 ^ 97706808;
    }
  }

  public static int mi(int var0, int var1, int var2, int var3) {
    return (var0 << 16) + (var1 << 8) + var2 + (var3 << 24);
  }

  public static int mae(int var0) {
    return var0 >> 16 & 0xFF;
  }

  public static int ns(int var0) {
    return var0 >> 8 & 0xFF;
  }

  public static int ylp(int var0) {
    return var0 & 0xFF;
  }

  public static int zz(int var0) {
    return var0 >> 24 & 0xFF;
  }

  public static zn yn(double var0, double var2, double var4) {
    int var23 = -360329751;
    if (var2 <= 0.0) {
      return (zn)/* jnt */(var4 * 255.0), (int)(var4 * 255.0), (int)(var4 * 255.0), 255
      );
    } else {
      double var6 = var0;
      if (var0 >= 360.0) {
        var6 = 0.0;
      }

      var6 /= 60.0;
      int var16 = (int)var6;
      double var14 = var6 - (double)var16;
      double var8 = var4 * (1.0 - var2);
      double var10 = var4 * (1.0 - var2 * var14);
      double var12 = var4 * (1.0 - var2 * (1.0 - var14));

      double var17;
      double var19;
      double var21;
      switch (switch (var16 + 18538538 - 681690058 + 502692669 + 1770021462 - 774150538 - 2074005902) {
        case -1238593829 -> 722369668 << -1351552825 ^ -613141951;
        case -1238593828 -> (-1830192347 | -1830192347) ^ -152261596;
        case -1238593827 -> (1436448158 - 292648751 | 936380358) & -1076545594;
        case -1238593826 -> 1816751624 ^ -1435800210 ^ -510209960;
        case -1238593825 -> (-1248067087 * 1744769606 | -1859480975) & -1321296007;
        default -> (1030283687 + 570142073 | -1306914599) & -1086631207;
      } - 1417749429 - 2042218286 - 1197325909 + 776376583 - 1654614310 ^ 799261223) {
        case -1035897784:
          var17 = var8;
          var19 = var4;
          var21 = var12;
          break;
        case -228551744:
          var17 = var8;
          var19 = var10;
          var21 = var4;
          break;
        case 901224333:
        default:
          var17 = var10;
          var19 = var4;
          var21 = var8;
          break;
        case 1039871181:
          var17 = var4;
          var19 = var12;
          var21 = var8;
          break;
        case 1525371813:
          var17 = var4;
          var19 = var8;
          var21 = var10;
          break;
        case 1760221245:
          var17 = var12;
          var19 = var8;
          var21 = var4;
      }

      return (zn)/* jnt */(var17 * 255.0), (int)(var19 * 255.0), (int)(var21 * 255.0), 255
      );
    }
  }

  public zn fd(int var1, int var2, int var3, int var4) {
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    /* jnt */;
    return this;
  }

  public zn ih(int var1) {
    null /* jnt:encrypted */;
    /* jnt */;
    return this;
  }

  public zn yy(int var1) {
    null /* jnt:encrypted */;
    /* jnt */;
    return this;
  }

  public zn yd(int var1) {
    null /* jnt:encrypted */;
    /* jnt */;
    return this;
  }

  public zn ji(int var1) {
    null /* jnt:encrypted */;
    /* jnt */;
    return this;
  }

  public zn xfq(zn var1) {
    null /* jnt:encrypted */);
    null /* jnt:encrypted */);
    null /* jnt:encrypted */);
    null /* jnt:encrypted */);
    /* jnt */;
    return this;
  }

  public boolean ij(String var1) {
    String[] var2 = /* jnt */;
    if (var2.length != 3 && var2.length != 4) {
      return false;
    } else {
      try {
        int var3 = /* jnt */;
        int var4 = /* jnt */;
        int var5 = /* jnt */;
        int var6 = var2.length == 4
          ? /* jnt */
          : null /* jnt:encrypted */;
        null /* jnt:encrypted */;
        null /* jnt:encrypted */;
        null /* jnt:encrypted */;
        null /* jnt:encrypted */;
        return true;
      } catch (NumberFormatException var7) {
        return false;
      }
    }
  }

  public zn rf() {
    return (zn)/* jnt */,
      null /* jnt:encrypted */,
      null /* jnt:encrypted */,
      null /* jnt:encrypted */
    );
  }

  public class_5251 vv() {
    return /* jnt */
    );
  }

  public class_2583 gb() {
    return /* jnt */,
      /* jnt */
    );
  }

  public class_2583 gt(class_2583 var1) {
    return /* jnt */
    );
  }

  public int ho() {
    return null /* jnt:encrypted */;
  }

  public int xt() {
    return null /* jnt:encrypted */;
  }

  public int xvv() {
    return null /* jnt:encrypted */;
  }

  public int ti() {
    return null /* jnt:encrypted */;
  }

  public int oxx() {
    return /* jnt */;
  }

  public zn lt() {
    int var5 = -1355551636;
    byte var1 = 3;
    int var2 = null /* jnt:encrypted */;
    int var3 = null /* jnt:encrypted */;
    int var4 = null /* jnt:encrypted */;
    if (var2 == 0 && var3 == 0 && var4 == 0) {
      return (zn)/* jnt */
      );
    } else {
      var5 = (-773116840 & -773116840 | 1682478824) & 1861129965;

      while (true) {
        switch ((var5 + 355749504 + 1103866976 + 1640780251 ^ 187491552) - 509093635 - 80226639) {
          case -1451949310:
            return (zn)/* jnt */((double)var2 / 0.7), 255
              ),
              /* jnt */((double)var3 / 0.7), 255
              ),
              /* jnt */((double)var4 / 0.7), 255
              ),
              null /* jnt:encrypted */
            );
          case -568201378:
          default:
            if (var3 > 0 && var3 < var1) {
              var3 = var1;
            }

            var5 = -80396095 >> (988791062 >>> -155046876) ^ 1683754535;
            break;
          case -210127119:
            if (var2 > 0 && var2 < var1) {
              var2 = var1;
            }

            var5 = (636374190 + 731223423 | 287346324) & -777613355;
            break;
          case 1010586694:
            if (var4 > 0 && var4 < var1) {
              var4 = var1;
            }

            var5 = (-1263306333 + 1005040933 | 250437745) & 267254521;
        }
      }
    }
  }

  public zn kz() {
    return (zn)/* jnt */((double)null /* jnt:encrypted */ * 0.7), 0
      ),
      /* jnt */((double)null /* jnt:encrypted */ * 0.7), 0
      ),
      /* jnt */((double)null /* jnt:encrypted */ * 0.7), 0
      ),
      null /* jnt:encrypted */
    );
  }

  public static float[] xq(int var0, int var1, int var2, float[] var3) {
    int var12 = 1769828664;
    if (var3 == null) {
      var3 = new float[3];
    }

    int var4 = /* jnt */
    );
    int var5 = /* jnt */
    );
    float var6 = (float)var4 / 255.0F;
    float var7;
    if (var4 != 0) {
      var7 = (float)(var4 - var5) / (float)var4;
    } else {
      var7 = 0.0F;
    }

    var12 = (1524190306 & 373698710 | -501514664) & -350486657;

    float var13;
    label47:
    while (true) {
      switch ((var12 + 1988070562 ^ 53438313) + 1313156098 ^ 2010331064 ^ 1249126880 ^ 1509783813) {
        case -844890422:
        default:
          if (var7 == 0.0F) {
            var13 = 0.0F;
            break label47;
          }

          var12 = (701863204 + 701863204 | -1205415783) & -64554275;
          break;
        case -543855799:
          float var9 = (float)(var4 - var0) / (float)(var4 - var5);
          float var10 = (float)(var4 - var1) / (float)(var4 - var5);
          float var11 = (float)(var4 - var2) / (float)(var4 - var5);
          if (var0 == var4) {
            var13 = var11 - var10;
          } else {
            var12 = -463674025 & 2129971967 ^ -305109098;

            label38:
            while (true) {
              switch (((var12 ^ 917371522) + 130789134 - 1013180677 + 495396623 ^ 1175794687) - 127145682) {
                case -428252462:
                  if (var1 == var4) {
                    var13 = 2.0F + var9 - var11;
                    break label38;
                  }

                  var12 = (-58600845 - (1871828362 ^ -58600845 + 1871828362) | -213887824) & -77572679;
                  break;
                case -384460581:
                default:
                  var13 = 4.0F + var10 - var9;
                  break label38;
              }
            }
          }

          var13 /= 6.0F;
          if (var13 < 0.0F) {
            var13++;
          }
          break label47;
      }
    }

    var3[0] = var13;
    var3[1] = var7;
    var3[2] = var6;
    return var3;
  }

  public static int ww(float var0, float var1, float var2) {
    int var11 = -133847602;
    int var3 = 0;
    int var4 = 0;
    int var5 = 0;
    if (var1 == 0.0F) {
      var3 = var4 = var5 = (int)(var2 * 255.0F + 0.5F);
    } else {
      float var6 = (
          var0
            - (float)/* jnt */var0
            )
        )
        * 6.0F;
      float var7 = var6
        - (float)/* jnt */var6
        );
      float var8 = var2 * (1.0F - var1);
      float var9 = var2 * (1.0F - var1 * var7);
      float var10 = var2 * (1.0F - var1 * (1.0F - var7));
      switch ((((int)var6 + 442135904 ^ 1081113723) + 1012824525 ^ 736880426) - 1058972219 + 2146390842) {
        case -30140736:
          var11 = -2138610982 >> (2117743243 & -1871474656) ^ -1320694094;
          break;
        case -30140735:
          var11 = 836265354 + -1167174204 ^ 182896780;
          break;
        case -30140731:
          var11 = -1508068717 << 1121227152 ^ 26403650;
          break;
        case -30140725:
          var11 = (5883985 >> 5883985 | -695075066) & -690094186;
          break;
        case -30140724:
          var11 = (-1567348912 ^ -1332544922 | 1143278216) & -853041427;
          break;
        case -30140722:
          var11 = -163407220 * 834818059 ^ 92510378;
          break;
        default:
          return 0xFF000000 | var3 << 16 | var4 << 8 | var5;
      }

      switch (var11 + 1207400334 + 743751901 - 1261842632 - 1638126223 - 2140439577 ^ 1720228071) {
        case -1672016678:
          var3 = (int)(var10 * 255.0F + 0.5F);
          var4 = (int)(var8 * 255.0F + 0.5F);
          var5 = (int)(var2 * 255.0F + 0.5F);
          break;
        case -359803072:
          var3 = (int)(var9 * 255.0F + 0.5F);
          var4 = (int)(var2 * 255.0F + 0.5F);
          var5 = (int)(var8 * 255.0F + 0.5F);
          break;
        case -198625970:
          var3 = (int)(var8 * 255.0F + 0.5F);
          var4 = (int)(var9 * 255.0F + 0.5F);
          var5 = (int)(var2 * 255.0F + 0.5F);
          break;
        case 521586052:
          var3 = (int)(var2 * 255.0F + 0.5F);
          var4 = (int)(var8 * 255.0F + 0.5F);
          var5 = (int)(var9 * 255.0F + 0.5F);
          break;
        case 1224129626:
        default:
          var3 = (int)(var2 * 255.0F + 0.5F);
          var4 = (int)(var10 * 255.0F + 0.5F);
          var5 = (int)(var8 * 255.0F + 0.5F);
          break;
        case 2028415206:
          var3 = (int)(var8 * 255.0F + 0.5F);
          var4 = (int)(var2 * 255.0F + 0.5F);
          var5 = (int)(var10 * 255.0F + 0.5F);
      }
    }

    return 0xFF000000 | var3 << 16 | var4 << 8 | var5;
  }

  public static zn fy(float var0, float var1, float var2) {
    int var3 = /* jnt */;
    return (zn)/* jnt */;
  }
  public void hj() {
    int var1 = 1168113184;
    if (null /* jnt:encrypted */ < 0) {
      null /* jnt:encrypted */;
      var1 = (-586 ^ 813698673 | -1543236496) & -57403788;
    } else {
      var1 = 1240910510 & 83820413 ^ 679650242;
    }

    while (true) {
      label55:
      while (true) {
        switch ((var1 - 213352240 - 1749306166 ^ 1534519227) + 1390206986 - 1995303840 + 528707893) {
          case -1036337586:
            if (null /* jnt:encrypted */ >= 0) {
              var1 = 2067327511 * 2067327511 ^ -1999991001;
              continue;
            }

            null /* jnt:encrypted */;
            break label55;
          case -478093870:
            if (null /* jnt:encrypted */ > 255) {
              null /* jnt:encrypted */;
            }

            var1 = (-586 ^ 813698673 | -1543236496) & -57403788;
            continue;
          case 35698442:
            if (null /* jnt:encrypted */ > 255) {
              null /* jnt:encrypted */;
            }
            break label55;
          case 216461893:
            if (null /* jnt:encrypted */ > 255) {
              null /* jnt:encrypted */;
            }
            break;
          case 424286400:
          default:
            if (null /* jnt:encrypted */ < 0) {
              null /* jnt:encrypted */;
              var1 = -352891753 + -235640801 ^ 1023171652;
            } else {
              var1 = 1757336685 << 642434590 ^ -676898497;
            }
            continue;
          case 669061460:
            if (null /* jnt:encrypted */ >= 0) {
              var1 = 1447436570 >> -153601729 - (1447436570 >>> -153601729) ^ -1090636413;
              continue;
            }

            null /* jnt:encrypted */;
            break;
          case 735928022:
            return;
          case 1968164609:
            if (null /* jnt:encrypted */ > 255) {
              null /* jnt:encrypted */;
            }

            var1 = -352891753 + -235640801 ^ 1023171652;
            continue;
        }

        var1 = (-1363040675 >>> -250282749 | 44206392) & 2059045758;
      }

      var1 = (1959412190 + (1959412190 >> 1959412190) | -1147331072) & -1147330784;
    }
  }

  public class_243 hg() {
    return (Vec3d)/* jnt */null /* jnt:encrypted */ / 255.0,
      (double)null /* jnt:encrypted */ / 255.0,
      (double)null /* jnt:encrypted */ / 255.0
    );
  }

  public Vector3f pr() {
    return (Vector3f)/* jnt */null /* jnt:encrypted */ / 255.0F,
      (float)null /* jnt:encrypted */ / 255.0F,
      (float)null /* jnt:encrypted */ / 255.0F
    );
  }

  public Vector4f uxy() {
    return (Vector4f)/* jnt */null /* jnt:encrypted */ / 255.0F,
      (float)null /* jnt:encrypted */ / 255.0F,
      (float)null /* jnt:encrypted */ / 255.0F,
      (float)null /* jnt:encrypted */ / 255.0F
    );
  }

  public int nrk() {
    return /* jnt */,
      null /* jnt:encrypted */,
      null /* jnt:encrypted */,
      null /* jnt:encrypted */
    );
  }

  public class_2487 rm() {
    class_2487 var1 = (NbtElement)/* jnt */;
    /* jnt */
    );
    /* jnt */
    );
    /* jnt */
    );
    /* jnt */
    );
    return var1;
  }

  public zn cip(class_2487 var1) {
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    /* jnt */;
    return this;
  }

  @Override
  public String toString() {
    int var10000 = null /* jnt:encrypted */;
    int var4;
    int var3 = var4 = null /* jnt:encrypted */;
    int var2 = null /* jnt:encrypted */;
    int var1 = var10000;
    return /* jnt *//* jnt */,
                    var1
                  ),
                  " "
                ),
                var2
              ),
              " "
            ),
            var3
          ),
          " "
        ),
        var4
      )
    );
  }

  @Override
  public boolean equals(Object var1) {
    int var3 = -1523676000;
    if (this == var1) {
      return true;
    } else {
      var3 = (-56806980 | -314194165) ^ -1973585109;

      while (true) {
        switch (var3 - 1980783284 + 442668776 + 1276519144 - 1814742067 - 103720945 - 102221036) {
          case -2110591120:
            return false;
          case -1824445297:
            zn var2 = (zn)var1;
            return null /* jnt:encrypted */ == null /* jnt:encrypted */
              && null /* jnt:encrypted */ == null /* jnt:encrypted */
              && null /* jnt:encrypted */ == null /* jnt:encrypted */
              && null /* jnt:encrypted */ == null /* jnt:encrypted */;
          case -277366112:
        }

        if (var1 != null
          && /* jnt */
            == /* jnt */) {
          var3 = -1205443558 * 1751211369 ^ -322994647;
        } else {
          var3 = 1634134217 - 1296393082 ^ 505037867;
        }
      }
    }
  }

  @Override
  public int hashCode() {
    int var1 = null /* jnt:encrypted */;
    var1 = 31 * var1 + null /* jnt:encrypted */;
    var1 = 31 * var1 + null /* jnt:encrypted */;
    return 31 * var1 + null /* jnt:encrypted */;
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (var10 + 2075867811 + 2010980644 ^ 1029203423 ^ 594303440) - 1233433794 + 1600822173 - 677609370 + 1596232354 ^ 1009769189;
    MethodHandle var10000 = aye[((var10 + 2075867811 + 2010980644 ^ 1029203423 ^ 594303440) - 1233433794 + 1600822173 - 677609370 + 1596232354 ^ 1009769189)
      - 1420833062];
    if (aye[var10001 - 1420833062] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = -1909724841 * 1723106657 ^ 1779014903; var23 < var13.length(); var23 += (811827946 | 811827946 + -310034007) ^ 1038862074) {
        char var42 = var13.charAt(var23);
        char var47 = (char)(
          (
                (
                    (
                          (
                              (
                                    ((((((var42 & '￠') >> 5 | var42 << 11) & 65528) >> 3 | ((var42 & '￠') >> 5 | var42 << 11) << 13) ^ 155) + 135 & 64512)
                                        >> 10
                                      | (((((var42 & '￠') >> 5 | var42 << 11) & 65528) >> 3 | ((var42 & '￠') >> 5 | var42 << 11) << 13) ^ 155) + 135 << 6
                                  )
                                  - 29
                                ^ 123
                                ^ 149
                            )
                            & 65024
                        )
                        >> 9
                      | (
                          (
                                ((((((var42 & '￠') >> 5 | var42 << 11) & 65528) >> 3 | ((var42 & '￠') >> 5 | var42 << 11) << 13) ^ 155) + 135 & 64512) >> 10
                                  | (((((var42 & '￠') >> 5 | var42 << 11) & 65528) >> 3 | ((var42 & '￠') >> 5 | var42 << 11) << 13) ^ 155) + 135 << 6
                              )
                              - 29
                            ^ 123
                            ^ 149
                        )
                        << 7
                  )
                  & 65024
              )
              >> 9
            | (
                (
                      (
                          (
                                ((((((var42 & '￠') >> 5 | var42 << 11) & 65528) >> 3 | ((var42 & '￠') >> 5 | var42 << 11) << 13) ^ 155) + 135 & 64512) >> 10
                                  | (((((var42 & '￠') >> 5 | var42 << 11) & 65528) >> 3 | ((var42 & '￠') >> 5 | var42 << 11) << 13) ^ 155) + 135 << 6
                              )
                              - 29
                            ^ 123
                            ^ 149
                        )
                        & 65024
                    )
                    >> 9
                  | (
                      (
                            ((((((var42 & '￠') >> 5 | var42 << 11) & 65528) >> 3 | ((var42 & '￠') >> 5 | var42 << 11) << 13) ^ 155) + 135 & 64512) >> 10
                              | (((((var42 & '￠') >> 5 | var42 << 11) & 65528) >> 3 | ((var42 & '￠') >> 5 | var42 << 11) << 13) ^ 155) + 135 << 6
                          )
                          - 29
                        ^ 123
                        ^ 149
                    )
                    << 7
              )
              << 7
        );
        var13.setCharAt(
          var23,
          (char)(
            (
                  (
                      (
                            (
                                (
                                      ((((((var42 & '￠') >> 5 | var42 << 11) & 65528) >> 3 | ((var42 & '￠') >> 5 | var42 << 11) << 13) ^ 155) + 135 & 64512)
                                          >> 10
                                        | (((((var42 & '￠') >> 5 | var42 << 11) & 65528) >> 3 | ((var42 & '￠') >> 5 | var42 << 11) << 13) ^ 155) + 135 << 6
                                    )
                                    - 29
                                  ^ 123
                                  ^ 149
                              )
                              & 65024
                          )
                          >> 9
                        | (
                            (
                                  ((((((var42 & '￠') >> 5 | var42 << 11) & 65528) >> 3 | ((var42 & '￠') >> 5 | var42 << 11) << 13) ^ 155) + 135 & 64512) >> 10
                                    | (((((var42 & '￠') >> 5 | var42 << 11) & 65528) >> 3 | ((var42 & '￠') >> 5 | var42 << 11) << 13) ^ 155) + 135 << 6
                                )
                                - 29
                              ^ 123
                              ^ 149
                          )
                          << 7
                    )
                    & 65024
                )
                >> 9
              | (
                  (
                        (
                            (
                                  ((((((var42 & '￠') >> 5 | var42 << 11) & 65528) >> 3 | ((var42 & '￠') >> 5 | var42 << 11) << 13) ^ 155) + 135 & 64512) >> 10
                                    | (((((var42 & '￠') >> 5 | var42 << 11) & 65528) >> 3 | ((var42 & '￠') >> 5 | var42 << 11) << 13) ^ 155) + 135 << 6
                                )
                                - 29
                              ^ 123
                              ^ 149
                          )
                          & 65024
                      )
                      >> 9
                    | (
                        (
                              ((((((var42 & '￠') >> 5 | var42 << 11) & 65528) >> 3 | ((var42 & '￠') >> 5 | var42 << 11) << 13) ^ 155) + 135 & 64512) >> 10
                                | (((((var42 & '￠') >> 5 | var42 << 11) & 65528) >> 3 | ((var42 & '￠') >> 5 | var42 << 11) << 13) ^ 155) + 135 << 6
                            )
                            - 29
                          ^ 123
                          ^ 149
                      )
                      << 7
                )
                << 7
          )
        );
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (1984976707 << 1124735110 | 0) & 1076374828; var29 < var16.length(); var29 += -1249144591 << -1261847415 ^ 388096513) {
        int var52 = var16.charAt(var29) - 234;
        char var55 = (char)(
          (
              (
                    ((((((var52 & 65535) >> 0 | var52 << 16) & 65472) >> 6 | ((var52 & 65535) >> 0 | var52 << 16) << 10) + 3 ^ 116 ^ 110) & 61440) >> 12
                      | (((((var52 & 65535) >> 0 | var52 << 16) & 65472) >> 6 | ((var52 & 65535) >> 0 | var52 << 16) << 10) + 3 ^ 116 ^ 110) << 4
                  )
                  - 119
                ^ 197
            )
            + 137
        );
        var16.setCharAt(
          var29,
          (char)(
            (
                (
                      ((((((var52 & 65535) >> 0 | var52 << 16) & 65472) >> 6 | ((var52 & 65535) >> 0 | var52 << 16) << 10) + 3 ^ 116 ^ 110) & 61440) >> 12
                        | (((((var52 & 65535) >> 0 | var52 << 16) & 65472) >> 6 | ((var52 & 65535) >> 0 | var52 << 16) << 10) + 3 ^ 116 ^ 110) << 4
                    )
                    - 119
                  ^ 197
              )
              + 137
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), zn.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (-1295077405 >>> (-320867742 << (-1295077405 | -320867742)) | 0) & 63701280;
        var35 < var19.length();
        var35 += (986376163 | -2054732330 | 1) & 1076889609
      ) {
        int var60 = var19.charAt(var35) - 221;
        char var63 = (char)(
          (
              (
                  ((((((var60 & 63488) >> 11 | var60 << 5) & 64512) >> 10 | ((var60 & 63488) >> 11 | var60 << 5) << 6) + 45 - 165 ^ 192) + 59 & 49152) >> 14
                    | (((((var60 & 63488) >> 11 | var60 << 5) & 64512) >> 10 | ((var60 & 63488) >> 11 | var60 << 5) << 6) + 45 - 165 ^ 192) + 59 << 2
                )
                ^ 3
            )
            + 107
        );
        var19.setCharAt(
          var35,
          (char)(
            (
                (
                    ((((((var60 & 63488) >> 11 | var60 << 5) & 64512) >> 10 | ((var60 & 63488) >> 11 | var60 << 5) << 6) + 45 - 165 ^ 192) + 59 & 49152) >> 14
                      | (((((var60 & 63488) >> 11 | var60 << 5) & 64512) >> 10 | ((var60 & 63488) >> 11 | var60 << 5) << 6) + 45 - 165 ^ 192) + 59 << 2
                  )
                  ^ 3
              )
              + 107
          )
        );
      }

      Class var7 = Class.forName(var19.toString(), false, zn.class.getClassLoader());
      switch (((var4 + 1213368590 + 1099833900 - 180151575 ^ 677665798) + 1290567882 - 1864983364 ^ 1519815150 ^ 1085351510 ^ 1099653702) + 1753382140) {
        case 538583611:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 1300713455:
          var10000 = var0.findSpecial(var7, var5, var6, zn.class);
          break;
        case 1415226512:
        case 1657513003:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 2058655195:
          var10000 = var0.findConstructor(var7, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    aye[((var10 + 2075867811 + 2010980644 ^ 1029203423 ^ 594303440) - 1233433794 + 1600822173 - 677609370 + 1596232354 ^ 1009769189) - 1420833062] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 ^ 1796612227) - 885661799 + 1447737899 + 1923852778 ^ 1494419150) + 911302026 + 1792058376 + 1465246052 ^ 1311726277;
    MethodHandle var10000 = aye[(((var10 ^ 1796612227) - 885661799 + 1447737899 + 1923852778 ^ 1494419150) + 911302026 + 1792058376 + 1465246052 ^ 1311726277)
      - 1510748824];
    if (aye[var10001 - 1510748824] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (-814834944 << 1750477820 | 0) & 197166333; var24 < var14.length(); var24 += (546918880 ^ 546918880 | 1) & -1161057475) {
        char var43 = var14.charAt(var24);
        char var46 = (char)(
          (
                ((((((var43 & '￼') >> 2 | var43 << 14) + 25 & 65024) >> 9 | ((var43 & '￼') >> 2 | var43 << 14) + 25 << 7) ^ 46) & 64512) >> 10
                  | (((((var43 & '￼') >> 2 | var43 << 14) + 25 & 65024) >> 9 | ((var43 & '￼') >> 2 | var43 << 14) + 25 << 7) ^ 46) << 6
              )
              - 121
            ^ 162
            ^ 153
            ^ 192
            ^ 188
        );
        var14.setCharAt(
          var24,
          (char)(
            (
                  ((((((var43 & '￼') >> 2 | var43 << 14) + 25 & 65024) >> 9 | ((var43 & '￼') >> 2 | var43 << 14) + 25 << 7) ^ 46) & 64512) >> 10
                    | (((((var43 & '￼') >> 2 | var43 << 14) + 25 & 65024) >> 9 | ((var43 & '￼') >> 2 | var43 << 14) + 25 << 7) ^ 46) << 6
                )
                - 121
              ^ 162
              ^ 153
              ^ 192
              ^ 188
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = 1720435175 >>> 42253882 ^ 25; var30 < var17.length(); var30 += 653006073 ^ 653006073 ^ 1) {
        int var51 = var17.charAt(var30);
        int var88 = (var51 & 61440) >> 12;
        int var52 = (var51 & 61440) >> 12 | var51 << 4;
        int var89 = (((var51 & 61440) >> 12 | var51 << 4) & 65532) >> 2;
        var51 = (((var88 | var51 << 4) & 65532) >> 2 | ((var51 & 61440) >> 12 | var51 << 4) << 14) + 100 + 211 + 148;
        var88 = ((var89 | var52 << 14) + 100 + 211 + 148 & 65408) >> 7;
        int var54 = (((var89 | var52 << 14) + 100 + 211 + 148 & 65408) >> 7 | var51 << 9) - 6 - 148;
        int var91 = ((((var89 | var52 << 14) + 100 + 211 + 148 & 65408) >> 7 | var51 << 9) - 6 - 148 & 65535) >> 0;
        char var55 = (char)(
          (((var88 | var51 << 9) - 6 - 148 & 65535) >> 0 | (((var89 | var52 << 14) + 100 + 211 + 148 & 65408) >> 7 | var51 << 9) - 6 - 148 << 16) ^ 42
        );
        var17.setCharAt(var30, (char)((var91 | var54 << 16) ^ 42));
      }

      Class var6 = Class.forName(var17.toString(), false, zn.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (110986748 & 983288976 | 0) & 1028001858; var36 < var20.length(); var36 += 1807214958 - 1253943485 ^ 553271472) {
        int var60 = var20.charAt(var36) ^ 232;
        char var65 = (char)(
          (
                (
                    (
                          (
                                (
                                      ((((var60 & 65024) >> 9 | var60 << 7) - 84 - 133 & 49152) >> 14 | ((var60 & 65024) >> 9 | var60 << 7) - 84 - 133 << 2)
                                          + 135
                                        & 65024
                                    )
                                    >> 9
                                  | ((((var60 & 65024) >> 9 | var60 << 7) - 84 - 133 & 49152) >> 14 | ((var60 & 65024) >> 9 | var60 << 7) - 84 - 133 << 2)
                                      + 135
                                    << 7
                              )
                              + 151
                            & 64512
                        )
                        >> 10
                      | (
                            (
                                  ((((var60 & 65024) >> 9 | var60 << 7) - 84 - 133 & 49152) >> 14 | ((var60 & 65024) >> 9 | var60 << 7) - 84 - 133 << 2) + 135
                                    & 65024
                                )
                                >> 9
                              | ((((var60 & 65024) >> 9 | var60 << 7) - 84 - 133 & 49152) >> 14 | ((var60 & 65024) >> 9 | var60 << 7) - 84 - 133 << 2) + 135
                                << 7
                          )
                          + 151
                        << 6
                  )
                  & 0
              )
              >> 16
            | (
                (
                      (
                            (
                                  ((((var60 & 65024) >> 9 | var60 << 7) - 84 - 133 & 49152) >> 14 | ((var60 & 65024) >> 9 | var60 << 7) - 84 - 133 << 2) + 135
                                    & 65024
                                )
                                >> 9
                              | ((((var60 & 65024) >> 9 | var60 << 7) - 84 - 133 & 49152) >> 14 | ((var60 & 65024) >> 9 | var60 << 7) - 84 - 133 << 2) + 135
                                << 7
                          )
                          + 151
                        & 64512
                    )
                    >> 10
                  | (
                        (((((var60 & 65024) >> 9 | var60 << 7) - 84 - 133 & 49152) >> 14 | ((var60 & 65024) >> 9 | var60 << 7) - 84 - 133 << 2) + 135 & 65024)
                            >> 9
                          | ((((var60 & 65024) >> 9 | var60 << 7) - 84 - 133 & 49152) >> 14 | ((var60 & 65024) >> 9 | var60 << 7) - 84 - 133 << 2) + 135 << 7
                      )
                      + 151
                    << 6
              )
              << 0
        );
        var20.setCharAt(
          var36,
          (char)(
            (
                  (
                      (
                            (
                                  (
                                        ((((var60 & 65024) >> 9 | var60 << 7) - 84 - 133 & 49152) >> 14 | ((var60 & 65024) >> 9 | var60 << 7) - 84 - 133 << 2)
                                            + 135
                                          & 65024
                                      )
                                      >> 9
                                    | ((((var60 & 65024) >> 9 | var60 << 7) - 84 - 133 & 49152) >> 14 | ((var60 & 65024) >> 9 | var60 << 7) - 84 - 133 << 2)
                                        + 135
                                      << 7
                                )
                                + 151
                              & 64512
                          )
                          >> 10
                        | (
                              (
                                    ((((var60 & 65024) >> 9 | var60 << 7) - 84 - 133 & 49152) >> 14 | ((var60 & 65024) >> 9 | var60 << 7) - 84 - 133 << 2)
                                        + 135
                                      & 65024
                                  )
                                  >> 9
                                | ((((var60 & 65024) >> 9 | var60 << 7) - 84 - 133 & 49152) >> 14 | ((var60 & 65024) >> 9 | var60 << 7) - 84 - 133 << 2) + 135
                                  << 7
                            )
                            + 151
                          << 6
                    )
                    & 0
                )
                >> 16
              | (
                  (
                        (
                              (
                                    ((((var60 & 65024) >> 9 | var60 << 7) - 84 - 133 & 49152) >> 14 | ((var60 & 65024) >> 9 | var60 << 7) - 84 - 133 << 2)
                                        + 135
                                      & 65024
                                  )
                                  >> 9
                                | ((((var60 & 65024) >> 9 | var60 << 7) - 84 - 133 & 49152) >> 14 | ((var60 & 65024) >> 9 | var60 << 7) - 84 - 133 << 2) + 135
                                  << 7
                            )
                            + 151
                          & 64512
                      )
                      >> 10
                    | (
                          (((((var60 & 65024) >> 9 | var60 << 7) - 84 - 133 & 49152) >> 14 | ((var60 & 65024) >> 9 | var60 << 7) - 84 - 133 << 2) + 135 & 65024)
                              >> 9
                            | ((((var60 & 65024) >> 9 | var60 << 7) - 84 - 133 & 49152) >> 14 | ((var60 & 65024) >> 9 | var60 << 7) - 84 - 133 << 2) + 135 << 7
                        )
                        + 151
                      << 6
                )
                << 0
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), zn.class.getClassLoader()).returnType();
      switch ((var4 - 1433444382 + 781400879 - 672221769 - 3863613 ^ 1064478842 ^ 1914339181) + 2034039909 + 180389879 ^ 1757879664 ^ 540989804) {
        case 199040379:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 814446356:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1236308325:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1714309236:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      aye[(((var10 ^ 1796612227) - 885661799 + 1447737899 + 1923852778 ^ 1494419150) + 911302026 + 1792058376 + 1465246052 ^ 1311726277) - 1510748824] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
