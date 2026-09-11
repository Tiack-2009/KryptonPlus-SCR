// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.class_11908;
import net.minecraft.Identifier;
import net.minecraft.DrawContext;

public class iv extends vwz {
  public static zn mp = (zn)/* jnt */;
  public static zn hnm = (zn)/* jnt */;
  public static zn yp = (zn)/* jnt */;
  public static zn ix = (zn)/* jnt */;
  public static zn ja = (zn)/* jnt */;
  public static float bwj = 4.0F;
  public static float ym = 0.25F;
  public static float nbd = 0.35F;
  public static int al = 80;
  public static int gb = 16;
  public gn pr;
  public zn lma;
  public zn fl;
  public float hvj = 0.0F;
  public float ldm = 0.0F;
  // [JNT] MethodHandle dispatch table (removed)
  public iv(fs var1, wus var2, int var3) {
    super(var1, var2, var3);
    this.pr = (gn)var2;
  }

  @Override
  public void h(class_332 var1, int var2, int var3, float var4) {
    int var16 = 555003127;
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

    var16 = -1087124109 * 1593952663 ^ 1500733136;

    String var21;
    label43:
    while (true) {
      switch ((var16 ^ 1802072213) + 1817097940 - 886350777 - 843906876 + 2007079385 ^ 181504411) {
        case -1572750156:
        default:
          var21 = /* jnt */)
          );
          break label43;
        case 1405652179:
          /* jnt */),
            var1,
            /* jnt */ + 5,
            /* jnt */
              + /* jnt */
              + null /* jnt:encrypted */
              + 9,
            /* jnt */)
          );
          if (/* jnt */)) {
            int var10000 = (1150786456 << -596571281 | 0) & 1130615;

            StringBuilder var10001;
            for (var10001 = (StringBuilder)/* jnt */;
              var10000 < (-14737902 * -592855416 ^ -222603876);
              var10000 += (1864087810 >> 1139236900 | 1) & 2013675617
            ) {
              int var23 = /* jnt */ + 189;
              int var10004 = (var23 & 65504) >> 5;
              int var24 = (var23 & 65504) >> 5 | var23 << 11;
              int var28 = (((var23 & 65504) >> 5 | var23 << 11) & 65528) >> 3;
              char var25 = (char)(((((var10004 | var23 << 11) & 65528) >> 3 | ((var23 & 65504) >> 5 | var23 << 11) << 13) ^ 27) - 71);
              /* jnt */(((var28 | var24 << 13) ^ 27) - 71));
            }

            var21 = /* jnt */;
            break label43;
          }

          var16 = (121663680 * (745332037 >> 121663680) | 1076418082) & -643235846;
      }
    }

    String var17 = var21;
    int var6 = /* jnt */;
    byte var7 = 20;
    int var8 = /* jnt */;
    int var9 = /* jnt */ + /* jnt */ - var8 - 5;
    int var10 = /* jnt */
      + /* jnt */
      + null /* jnt:encrypted */
      + (/* jnt */ - var7) / 2;
    zn var11 = /* jnt */,
      null /* jnt:encrypted */,
      null /* jnt:encrypted */
    );
    /* jnt */var9, (double)var10, (double)(var9 + var8), (double)(var10 + var7), 4.0, 4.0, 4.0, 4.0
    );
    float var12 = /* jnt */ * 0.7F,
      /* jnt */var2, (double)var3, var9, var10, var8, var7) ? 0.2F : 0.0F
    );
    if (var12 > 0.0F) {
      zn var13 = (zn)/* jnt */),
        /* jnt */),
        /* jnt */),
        (int)((float)/* jnt */) * var12)
      );
      /* jnt */var9, (double)var10, (double)(var9 + var8), (double)(var10 + var7), 4.0, 4.0, 4.0, 4.0
      );
    }

    zn var18 = /* jnt */,
      null /* jnt:encrypted */,
      null /* jnt:encrypted */
    );
    /* jnt */ / 2, var10 + (var7 - 8) / 2 - 3, /* jnt */
    );
    if (/* jnt */)) {
      float var14 = (float)/* jnt *//* jnt */ / 500.0
          )
        )
        * 0.3F;
      zn var15 = (zn)/* jnt */),
        /* jnt */),
        /* jnt */),
        (int)((float)/* jnt */) * var14)
      );
      /* jnt */var9, (double)var10, (double)(var9 + var8), (double)(var10 + var7), 4.0, 4.0, 4.0, 4.0
      );
    }
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
    float var6 = /* jnt */) ? 1.0F : 0.0F;
    null /* jnt:encrypted *//* jnt */null /* jnt:encrypted */, (double)var6, 0.35F, (double)var4
      )
    );
  }

  public boolean olt(double var1, double var3, int var5, int var6, int var7, int var8) {
    return var1 >= (double)var5 && var1 <= (double)(var5 + var7) && var3 >= (double)var6 && var3 <= (double)(var6 + var8);
  }
  @Override
  public void iu(class_11909 var1, boolean var2) {
    int var9 = 964012120;
    String var12;
    if (/* jnt */)) {
      int var10000 = (1549737960 | 1478101377 * -1487759032) ^ -580919320;

      StringBuilder var10001;
      for (var10001 = (StringBuilder)/* jnt */;
        var10000 < (-33347908 >> -1271009211 ^ -1042119);
        var10000 += -812509619 & -1135790615 ^ -1946151864
      ) {
        int var14 = (/* jnt */ - 27 ^ 25) - 199 ^ 140;
        char var15 = (char)((var14 & 0) >> 16 | var14 << 0);
        /* jnt */((var14 & 0) >> 16 | var14 << 0));
      }

      var12 = /* jnt */;
    } else {
      var12 = /* jnt */)
      );
    }

    String var3 = var12;
    int var4 = /* jnt */;
    byte var5 = 20;
    int var6 = /* jnt */;
    int var7 = /* jnt */ + /* jnt */ - var6 - 5;
    int var8 = /* jnt */
      + /* jnt */
      + null /* jnt:encrypted */
      + (/* jnt */ - var5) / 2;
    if (/* jnt */,
      /* jnt */,
      var7,
      var8,
      var6,
      var5
    )) {
      if (!/* jnt */)) {
        if (/* jnt */ == 0) {
          /* jnt */);
          /* jnt */, true);
        }

        var9 = (-1823777933 >> -582680298 | -2146041820) & -1932132297;
      } else {
        var9 = (2075762574 + -586010806 | 75247617) & -453199471;
      }
    } else {
      var9 = (-1823777933 >> -582680298 | -2146041820) & -1932132297;
    }

    while (true) {
      switch (var9 - 1849307929 - 356702931 + 1431057059 - 703930108 + 1498362721 ^ 1947817156) {
        case -102339195:
        default:
          /* jnt */;
          return;
        case 538010155:
          /* jnt */, /* jnt */
          );
          /* jnt */, false);
          var9 = (-1823777933 >> -582680298 | -2146041820) & -1932132297;
          continue;
        case 842835305:
      }

      if (/* jnt */)) {
        /* jnt */),
          /* jnt */
        );
      }

      var9 = (-1237895318 ^ -295430121 | 1384961427) & 1407122899;
    }
  }
  @Override
  public void z(class_11908 var1) {
    int var2 = -705271704;
    if (/* jnt */)) {
      if (/* jnt */ == 256) {
        /* jnt */, false);
        var2 = (1754507105 >> 1213791050 | 566453004) & 903050030;
      } else {
        var2 = (-717636914 >>> (-779714186 << -1920583872) | -1523312470) & -1489085266;
      }
    } else {
      var2 = (1754507105 >> 1213791050 | 566453004) & 903050030;
    }

    while (true) {
      switch ((var2 ^ 1723374925) - 394366448 - 1332293257 - 871624358 + 146359322 + 744559612) {
        case -1501925474:
          if (/* jnt */)) {
            /* jnt */),
              /* jnt */
            );
          }

          var2 = (457461114 | 738326366 | 1106773506) & -906475774;
          break;
        case -914585786:
          /* jnt */, /* jnt */
          );
          /* jnt */, false);
          var2 = (1754507105 >> 1213791050 | 566453004) & 903050030;
          break;
        case -509105320:
          /* jnt */;
          return;
        case 1573401306:
          if (/* jnt */ == 259) {
            if (/* jnt */)) {
              /* jnt */), -1
              );
            }

            var2 = (558959570 | 558959570 | -1817590108) & -1280718914;
          } else {
            var2 = -208518297 << -468536741 ^ 1384538090;
          }
          break;
        case 1867319282:
        default:
          /* jnt */, -1);
          /* jnt */, false);
          var2 = (1754507105 >> 1213791050 | 566453004) & 903050030;
      }
    }
  }
  @Override
  public void po() {
    int var3 = 103880267;
    zn var1 = /* jnt */), this
      )
    );
    if (null /* jnt:encrypted */ == null) {
      null /* jnt:encrypted *//* jnt */,
          /* jnt */,
          /* jnt */,
          0
        )
      );
      var3 = 415977143 * -748545336 ^ 2011944686;
    } else {
      var3 = (1901794800 ^ -421484197 | 543531352) & 1651371000;
    }

    while (true) {
      switch ((var3 ^ 1328969532 ^ 403465615 ^ 1117062245 ^ 846973492 ^ 2053850890) - 781293384) {
        case -1557871946:
        default:
          short var2 = 255;
          if (/* jnt */) != var2) {
            null /* jnt:encrypted */
            );
          }

          /* jnt */;
          return;
        case 1363188424:
          null /* jnt:encrypted *//* jnt */,
              /* jnt */,
              /* jnt */,
              /* jnt */)
            )
          );
      }

      var3 = 415977143 * -748545336 ^ 2011944686;
    }
  }

  @Override
  public void fr() {
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    null /* jnt:encrypted */;
    /* jnt */;
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 - 151132339 ^ 207544073) + 635409912 - 2033878588 + 2136218136 ^ 950281674) + 1286020542 + 176452137 + 1564478423;
    MethodHandle var10000 = nyu[((var10 - 151132339 ^ 207544073) + 635409912 - 2033878588 + 2136218136 ^ 950281674)
      + 1286020542
      + 176452137
      + 1564478423
      - 301984703];
    if (nyu[var10001 - 301984703] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = 2054144145 >> -1385103962 ^ 32096002; var23 < var13.length(); var23 += (-634034857 | -634034857 | 0) & 97026689) {
        int var42 = (var13.charAt(var23) + '2' ^ 199 ^ 112) + 64 + 21;
        int var10004 = (var42 & 57344) >> 13;
        int var43 = (var42 & 57344) >> 13 | var42 << 3;
        int var89 = (((var42 & 57344) >> 13 | var42 << 3) & 65472) >> 6;
        var42 = ((var10004 | var42 << 3) & 65472) >> 6 | ((var42 & 57344) >> 13 | var42 << 3) << 10;
        var10004 = ((var89 | var43 << 10) & 63488) >> 11;
        int var45 = ((var89 | var43 << 10) & 63488) >> 11 | var42 << 5;
        int var91 = ((((var89 | var43 << 10) & 63488) >> 11 | var42 << 5) & 65534) >> 1;
        char var46 = (char)((((var10004 | var42 << 5) & 65534) >> 1 | (((var89 | var43 << 10) & 63488) >> 11 | var42 << 5) << 15) ^ 33);
        var13.setCharAt(var23, (char)((var91 | var45 << 15) ^ 33));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (-837090039 >>> -837090039 | 0) & 688939641; var29 < var16.length(); var29 += (2141183195 >>> 604516352 | 0) & 4194561) {
        int var51 = var16.charAt(var29);
        int var92 = (var51 & 32768) >> 15;
        int var52 = (((var51 & 32768) >> 15 | var51 << 1) - 53 ^ 65) + 113 ^ 72;
        int var93 = (((((var51 & 32768) >> 15 | var51 << 1) - 53 ^ 65) + 113 ^ 72) & 63488) >> 11;
        var51 = (((((var92 | var51 << 1) - 53 ^ 65) + 113 ^ 72) & 63488) >> 11 | ((((var51 & 32768) >> 15 | var51 << 1) - 53 ^ 65) + 113 ^ 72) << 5) + 82 + 48;
        var92 = ((var93 | var52 << 5) + 82 + 48 & 65472) >> 6;
        int var54 = ((var93 | var52 << 5) + 82 + 48 & 65472) >> 6 | var51 << 10;
        int var95 = ((((var93 | var52 << 5) + 82 + 48 & 65472) >> 6 | var51 << 10) & 65472) >> 6;
        char var55 = (char)(((var92 | var51 << 10) & 65472) >> 6 | (((var93 | var52 << 5) + 82 + 48 & 65472) >> 6 | var51 << 10) << 10);
        var16.setCharAt(var29, (char)(var95 | var54 << 10));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), iv.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = -1408867118 ^ 1429606674 >>> -1408867118 ^ -1408863841;
        var35 < var19.length();
        var35 += 1777415840 - (1777415840 ^ 1777415840) ^ 1777415841
      ) {
        int var60 = var19.charAt(var35);
        int var96 = (var60 & 65528) >> 3;
        int var61 = (var60 & 65528) >> 3 | var60 << 13;
        int var97 = (((var60 & 65528) >> 3 | var60 << 13) & 65532) >> 2;
        var60 = ((var96 | var60 << 13) & 65532) >> 2 | ((var60 & 65528) >> 3 | var60 << 13) << 14;
        var96 = ((var97 | var61 << 14) & 49152) >> 14;
        int var63 = (((var97 | var61 << 14) & 49152) >> 14 | var60 << 2) - 202;
        int var99 = ((((var97 | var61 << 14) & 49152) >> 14 | var60 << 2) - 202 & 0) >> 16;
        var60 = ((var96 | var60 << 2) - 202 & 0) >> 16 | (((var97 | var61 << 14) & 49152) >> 14 | var60 << 2) - 202 << 0;
        var96 = ((var99 | var63 << 0) & 65472) >> 6;
        int var65 = (((var99 | var63 << 0) & 65472) >> 6 | var60 << 10) ^ 114;
        int var101 = (((((var99 | var63 << 0) & 65472) >> 6 | var60 << 10) ^ 114) & 49152) >> 14;
        char var66 = (char)((((((var96 | var60 << 10) ^ 114) & 49152) >> 14 | ((((var99 | var63 << 0) & 65472) >> 6 | var60 << 10) ^ 114) << 2) ^ 15) - 202);
        var19.setCharAt(var35, (char)(((var101 | var65 << 2) ^ 15) - 202));
      }

      Class var7 = Class.forName(var19.toString(), false, iv.class.getClassLoader());
      switch (((var4 + 984437751 - 161888841 - 1972574160 + 345678447 ^ 1055772814 ^ 2118440169 ^ 400432118) - 1221122041 ^ 902880462) - 111925604) {
        case 362119488:
          var10000 = var0.findSpecial(var7, var5, var6, iv.class);
          break;
        case 499103291:
        case 1086102096:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1763862333:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 1920756826:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    nyu[((var10 - 151132339 ^ 207544073) + 635409912 - 2033878588 + 2136218136 ^ 950281674) + 1286020542 + 176452137 + 1564478423 - 301984703] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 ^ 71554339 ^ 205556489) - 1623692179 ^ 223818477 ^ 570767608) - 1432365720 + 294136713 - 342333130 + 815814438;
    MethodHandle var10000 = nyu[((var10 ^ 71554339 ^ 205556489) - 1623692179 ^ 223818477 ^ 570767608) - 1432365720 + 294136713 - 342333130 + 815814438
      ^ 1782809319];
    if (nyu[var10001 ^ 1782809319] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (1937438603 - -860566713 | 0) & 2670896; var24 < var14.length(); var24 += (926584428 << -153726219 | 1) & 846450533) {
        int var43 = var14.charAt(var24) ^ 174;
        int var10004 = (var43 & 65532) >> 2;
        int var44 = (var43 & 65532) >> 2 | var43 << 14;
        int var86 = (((var43 & 65532) >> 2 | var43 << 14) & 65535) >> 0;
        var43 = (((var10004 | var43 << 14) & 65535) >> 0 | ((var43 & 65532) >> 2 | var43 << 14) << 16) + 218 + 82;
        var10004 = ((var86 | var44 << 16) + 218 + 82 & 61440) >> 12;
        int var46 = ((((var86 | var44 << 16) + 218 + 82 & 61440) >> 12 | var43 << 4) ^ 128) + 30;
        int var88 = (((((var86 | var44 << 16) + 218 + 82 & 61440) >> 12 | var43 << 4) ^ 128) + 30 & 57344) >> 13;
        char var47 = (char)(
          ((((var10004 | var43 << 4) ^ 128) + 30 & 57344) >> 13 | ((((var86 | var44 << 16) + 218 + 82 & 61440) >> 12 | var43 << 4) ^ 128) + 30 << 3) + 153
        );
        var14.setCharAt(var24, (char)((var88 | var46 << 3) + 153));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = -1529265405 ^ -1161651757 ^ 505141968; var30 < var17.length(); var30 += -2060629595 << -1200173835 ^ 882900993) {
        int var52 = (var17.charAt(var30) ^ 227) + 49 - 97 + 71 + 162;
        int var89 = (var52 & 65534) >> 1;
        int var53 = ((var52 & 65534) >> 1 | var52 << 15) ^ 14;
        int var90 = ((((var52 & 65534) >> 1 | var52 << 15) ^ 14) & 65024) >> 9;
        char var54 = (char)(((((var89 | var52 << 15) ^ 14) & 65024) >> 9 | (((var52 & 65534) >> 1 | var52 << 15) ^ 14) << 7) - 35 - 92);
        var17.setCharAt(var30, (char)((var90 | var53 << 7) - 35 - 92));
      }

      Class var6 = Class.forName(var17.toString(), false, iv.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = -832138198 >>> 1250668924 ^ 12; var36 < var20.length(); var36 += 762475162 & -979221699 ^ 86131225) {
        int var59 = var20.charAt(var36) + 'E';
        int var91 = (var59 & 65504) >> 5;
        int var60 = (var59 & 65504) >> 5 | var59 << 11;
        int var92 = (((var59 & 65504) >> 5 | var59 << 11) & 32768) >> 15;
        var59 = (((var91 | var59 << 11) & 32768) >> 15 | ((var59 & 65504) >> 5 | var59 << 11) << 1) ^ 38;
        var91 = (((var92 | var60 << 1) ^ 38) & 0) >> 16;
        int var62 = (((((var92 | var60 << 1) ^ 38) & 0) >> 16 | var59 << 0) ^ 243) - 250;
        int var94 = ((((((var92 | var60 << 1) ^ 38) & 0) >> 16 | var59 << 0) ^ 243) - 250 & 49152) >> 14;
        var59 = (((var91 | var59 << 0) ^ 243) - 250 & 49152) >> 14 | (((((var92 | var60 << 1) ^ 38) & 0) >> 16 | var59 << 0) ^ 243) - 250 << 2;
        var91 = ((var94 | var62 << 2) & 65024) >> 9;
        int var64 = ((var94 | var62 << 2) & 65024) >> 9 | var59 << 7;
        int var96 = ((((var94 | var62 << 2) & 65024) >> 9 | var59 << 7) & 65024) >> 9;
        char var65 = (char)(((var91 | var59 << 7) & 65024) >> 9 | (((var94 | var62 << 2) & 65024) >> 9 | var59 << 7) << 7);
        var20.setCharAt(var36, (char)(var96 | var64 << 7));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), iv.class.getClassLoader()).returnType();
      switch ((((var4 ^ 557929422) - 1151434549 + 1360554661 - 140642815 ^ 1932576184) - 2099118027 ^ 2109303950 ^ 1113767044) + 375004545 ^ 1774862583) {
        case 403237455:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 741803922:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 925799464:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1181161552:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      nyu[((var10 ^ 71554339 ^ 205556489) - 1623692179 ^ 223818477 ^ 570767608) - 1432365720 + 294136713 - 342333130 + 815814438 ^ 1782809319] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
