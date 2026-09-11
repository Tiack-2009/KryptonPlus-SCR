// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.ByteBuffer;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.function.Consumer;

public class r extends hh {
  public Selector jv = /* jnt */;
  public SocketChannel sw;
  public Consumer xiy;
  // [JNT] MethodHandle dispatch table (removed)
  public r(String var1, Consumer var2) throws IOException {
    this.sw = /* jnt */
    );
    this.xiy = var2;
    /* jnt */, false
    );
    /* jnt */,
      null /* jnt:encrypted */,
      1
    );
    Thread var3 = (Thread)/* jnt */;
    int var10001 = (-1306427845 & -1306427845 | 0) & 262144;

    StringBuilder var10002;
    for (var10002 = (StringBuilder)/* jnt */;
      var10001 < ((1155939519 << 1155939519 | 25) & 1821300255);
      var10001 += 529225607 - (-1428641376 + 529225607) ^ 1428641377
    ) {
      int var6 = (/* jnt */ ^ '!')
        + 212
        + 176;
      char var7 = (char)(((var6 & 65408) >> 7 | var6 << 9) ^ 110);
      /* jnt */(((var6 & 65408) >> 7 | var6 << 9) ^ 110)
      );
    }

    /* jnt */
    );
    /* jnt */;
  }

  // $VF: Handled exception range with multiple entry points by splitting it
  // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
  public void run() {
    int var6 = 1782108630;
    so var1 = null /* jnt:encrypted */;
    ByteBuffer var2 = /* jnt */;
    ByteBuffer var3 = null;
    urh var4 = null;

    label61:
    while (true) {
      try {
        var6 = -523016485 << -523016485 ^ -1182287307;
      } catch (Exception var15) {
        boolean var10001 = false;
        return;
      }

      while (true) {
        label54:
        switch ((var6 - 1394958589 - 419314370 + 826396884 ^ 1881920887) - 859471381 - 1647602092) {
          case -1783520396:
            continue label61;
          case -1730834734:
            try {
              /* jnt */, var3
              );
              if (!/* jnt */) {
                var6 = (1045491609 & 101138071 | -711490267) & -170412185;
                continue;
              }
              break;
            } catch (Exception var10) {
              boolean var23 = false;
              return;
            }
          case -1054911876:
          default:
            try {
              /* jnt */
              );
              switch (((/* jnt */ ^ 546853288) - 378806102 - 1031878119 ^ 1733424012) + 2130135298 ^ 1417863324) {
                case 2118695029:
                  var6 = -716770603 * -716770603 ^ 1046053949;
                  continue;
                case 2118695038:
                  var6 = -1720116631 & -59605635 ^ 947007189;
                  continue;
                case 2118695039:
                  var6 = (439148718 >>> 439148718 | -1722718643) & -1688207409;
                  continue;
                default:
                  break label54;
              }
            } catch (Exception var13) {
              boolean var22 = false;
              return;
            }
          case 437509037:
            try {
              /* jnt */, var2
              );
              if (!/* jnt */) {
                var6 = -366207313 >>> (-1153736778 ^ -366207313 - -1153736778) ^ -1176425032;
                continue;
              }
              break;
            } catch (Exception var11) {
              boolean var21 = false;
              return;
            }
          case 1429152140:
            try {
              String var5 = /* jnt */,
                  /* jnt */
                )
              );
              /* jnt */,
                (yj)/* jnt */
                  )
                )
              );
              var3 = null;
              var1 = null /* jnt:encrypted */;
              break;
            } catch (Exception var9) {
              boolean var20 = false;
              return;
            }
          case 1589404439:
            try {
              var3 = /* jnt */
                )
              );
              var1 = null /* jnt:encrypted */;
              /* jnt */;
              break;
            } catch (Exception var14) {
              boolean var19 = false;
              return;
            }
          case 2036732865:
            try {
              var4 = /* jnt */
                )
              );
              var1 = null /* jnt:encrypted */;
              /* jnt */;
              break;
            } catch (Exception var12) {
              boolean var18 = false;
              return;
            }
          case 2140985061:
            try {
              /* jnt */, var2
              );
              if (!/* jnt */) {
                var6 = (1283685449 | -1315667282) ^ 1131779189;
                continue;
              }
            } catch (Exception var8) {
              boolean var17 = false;
              return;
            }
        }

        try {
          var6 = (2080147850 & -1097459329 | -1788272339) & -1779585619;
        } catch (Exception var7) {
          boolean var24 = false;
          return;
        }
      }
    }
  }

  // $VF: Handled exception range with multiple entry points by splitting it
  // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
  @Override
  public void nz(ByteBuffer var1) {
    int var3 = 2059899953;

    IOException var10000;
    label27: {
      try {
        var3 = (1808435078 & 1808435078 | 1009238185) & -1129843025;
      } catch (IOException var5) {
        var10000 = var5;
        boolean var10001 = false;
        break label27;
      }

      label24:
      while (true) {
        switch (((var3 ^ 1660078778 ^ 1565231070) - 1342738229 + 442788073 ^ 912739611) + 1337773188) {
          case 167771107:
            return;
          case 1255797992:
          default:
            try {
              /* jnt */, var1
              );
            } catch (IOException var4) {
              var10000 = var4;
              boolean var7 = false;
              break label24;
            }

            var3 = (-513595241 >>> 1283652843 | -26098220) & -17704962;
        }
      }
    }

    IOException var2 = var10000;
    /* jnt */;
  }

  // $VF: Handled exception range with multiple entry points by splitting it
  // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
  @Override
  public void snj() {
    int var2 = -1261367790;

    IOException var10000;
    label27: {
      try {
        var2 = 202651100 + 1694195283 ^ 1374441600;
      } catch (IOException var4) {
        var10000 = var4;
        boolean var10001 = false;
        break label27;
      }

      label24:
      while (true) {
        switch ((var2 + 2082067774 ^ 928924809) + 170864062 - 928566542 - 1987662900 - 1081063803) {
          case -946786203:
          default:
            try {
              /* jnt */
              );
              /* jnt */
              );
            } catch (IOException var3) {
              var10000 = var3;
              boolean var6 = false;
              break label24;
            }

            var2 = (867705627 * -126110666 | -2133716724) & -1459711699;
            break;
          case 1178007012:
            return;
        }
      }
    }

    IOException var1 = var10000;
    /* jnt */;
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (var10 ^ 568556283) - 773754005 - 2026030940 - 1027966808 + 991855922 + 566438643 + 1157818537 ^ 614744753 ^ 685114930;
    MethodHandle var10000 = qtm[(var10 ^ 568556283) - 773754005 - 2026030940 - 1027966808 + 991855922 + 566438643 + 1157818537
      ^ 614744753
      ^ 685114930
      ^ 46670611];
    if (qtm[var10001 ^ 46670611] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = -1969641142 * -2134806810 ^ 764798076; var23 < var13.length(); var23 += 1367026940 + 1367026940 ^ -1560913415) {
        char var42 = var13.charAt(var23);
        char var43 = (char)((((((var42 & '\uf800') >> 11 | var42 << 5) - 29 ^ 163) + 91 - 71 + 55 ^ 112) - 204 ^ 140) - 103);
        var13.setCharAt(var23, (char)((((((var42 & '\uf800') >> 11 | var42 << 5) - 29 ^ 163) + 91 - 71 + 55 ^ 112) - 204 ^ 140) - 103));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = 1553221725 - 1553221725 ^ 0; var29 < var16.length(); var29 += 599107636 >> (599107636 >> -1386522490) ^ 599107637) {
        int var48 = var16.charAt(var29);
        int var75 = (var48 & 65532) >> 2;
        int var49 = ((var48 & 65532) >> 2 | var48 << 14) ^ 3;
        int var76 = ((((var48 & 65532) >> 2 | var48 << 14) ^ 3) & 0) >> 16;
        var48 = (((var75 | var48 << 14) ^ 3) & 0) >> 16 | (((var48 & 65532) >> 2 | var48 << 14) ^ 3) << 0;
        var75 = ((var76 | var49 << 0) & 49152) >> 14;
        int var51 = ((var76 | var49 << 0) & 49152) >> 14 | var48 << 2;
        int var78 = ((((var76 | var49 << 0) & 49152) >> 14 | var48 << 2) & 49152) >> 14;
        char var52 = (char)(((((var75 | var48 << 2) & 49152) >> 14 | (((var76 | var49 << 0) & 49152) >> 14 | var48 << 2) << 2) + 166 + 45 ^ 135) - 17 + 248);
        var16.setCharAt(var29, (char)(((var78 | var51 << 2) + 166 + 45 ^ 135) - 17 + 248));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), r.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (-467627936 - 2104369007 | 0) & 424249856; var35 < var19.length(); var35 += (-49652274 | -49652274 | 1) & 7701041) {
        int var57 = var19.charAt(var35) - 'z';
        int var79 = (var57 & 63488) >> 11;
        int var58 = ((((var57 & 63488) >> 11 | var57 << 5) ^ 89) - 55 - 80 - 61 ^ 192 ^ 239) + 228;
        int var80 = (((((var57 & 63488) >> 11 | var57 << 5) ^ 89) - 55 - 80 - 61 ^ 192 ^ 239) + 228 & 32768) >> 15;
        char var59 = (char)(
          ((((var79 | var57 << 5) ^ 89) - 55 - 80 - 61 ^ 192 ^ 239) + 228 & 32768) >> 15
            | ((((var57 & 63488) >> 11 | var57 << 5) ^ 89) - 55 - 80 - 61 ^ 192 ^ 239) + 228 << 1
        );
        var19.setCharAt(var35, (char)(var80 | var58 << 1));
      }

      Class var7 = Class.forName(var19.toString(), false, r.class.getClassLoader());
      switch (((var4 ^ 2036793234) - 1390750017 ^ 1007965801 ^ 1761116812 ^ 1364590047) + 1360458890 + 1174751894 + 342664620 + 329956000 ^ 1242377303) {
        case 233080200:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 450524551:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 1535541293:
        case 2035768256:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1537951395:
          var10000 = var0.findSpecial(var7, var5, var6, r.class);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    qtm[(var10 ^ 568556283) - 773754005 - 2026030940 - 1027966808 + 991855922 + 566438643 + 1157818537 ^ 614744753 ^ 685114930 ^ 46670611] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (((var10 ^ 1144852493) + 257160762 - 1595343220 ^ 1104118922 ^ 1647034131 ^ 2012634939) + 151060357 ^ 1483185450) + 1855743088;
    MethodHandle var10000 = qtm[(((var10 ^ 1144852493) + 257160762 - 1595343220 ^ 1104118922 ^ 1647034131 ^ 2012634939) + 151060357 ^ 1483185450)
      + 1855743088
      - 1621771871];
    if (qtm[var10001 - 1621771871] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = 965841572 << 965841572 ^ -1726404032; var24 < var14.length(); var24 += (-470230120 | -470230120 << -1455203529 | 1) & 268828771) {
        int var43 = var14.charAt(var24) + 156;
        char var46 = (char)(
          (
                (
                      (((((var43 & 0) >> 16 | var43 << 0) & 65472) >> 6 | ((var43 & 0) >> 16 | var43 << 0) << 10) + 142 & 63488) >> 11
                        | ((((var43 & 0) >> 16 | var43 << 0) & 65472) >> 6 | ((var43 & 0) >> 16 | var43 << 0) << 10) + 142 << 5
                    )
                    - 195
                  ^ 75
                  ^ 166
              )
              + 109
            ^ 127
        );
        var14.setCharAt(
          var24,
          (char)(
            (
                  (
                        (((((var43 & 0) >> 16 | var43 << 0) & 65472) >> 6 | ((var43 & 0) >> 16 | var43 << 0) << 10) + 142 & 63488) >> 11
                          | ((((var43 & 0) >> 16 | var43 << 0) & 65472) >> 6 | ((var43 & 0) >> 16 | var43 << 0) << 10) + 142 << 5
                      )
                      - 195
                    ^ 75
                    ^ 166
                )
                + 109
              ^ 127
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = -250620929 + -250620929 ^ -501241858; var30 < var17.length(); var30 += -854088155 ^ -854088155 ^ 1) {
        int var51 = (var17.charAt(var30) - 212 ^ 124) + 97 + 144;
        int var80 = (var51 & 63488) >> 11;
        int var52 = (((var51 & 63488) >> 11 | var51 << 5) - 72 + 112 ^ 155) - 24;
        int var81 = ((((var51 & 63488) >> 11 | var51 << 5) - 72 + 112 ^ 155) - 24 & 63488) >> 11;
        char var53 = (char)((((var80 | var51 << 5) - 72 + 112 ^ 155) - 24 & 63488) >> 11 | (((var51 & 63488) >> 11 | var51 << 5) - 72 + 112 ^ 155) - 24 << 5);
        var17.setCharAt(var30, (char)(var81 | var52 << 5));
      }

      Class var6 = Class.forName(var17.toString(), false, r.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (1140025392 - -146756868 | 0) & -2147155838; var36 < var20.length(); var36 += 595581519 - 426524286 ^ 169057232) {
        char var58 = var20.charAt(var36);
        char var61 = (char)(
          (
              (
                  ((((((var58 & '쀀') >> 14 | var58 << 2) ^ 0 ^ 204) & 65532) >> 2 | (((var58 & '쀀') >> 14 | var58 << 2) ^ 0 ^ 204) << 14) & 65472) >> 6
                    | (((((var58 & '쀀') >> 14 | var58 << 2) ^ 0 ^ 204) & 65532) >> 2 | (((var58 & '쀀') >> 14 | var58 << 2) ^ 0 ^ 204) << 14) << 10
                )
                ^ 82
            )
            - 76
            - 188
            + 54
            + 157
        );
        var20.setCharAt(
          var36,
          (char)(
            (
                (
                    ((((((var58 & '쀀') >> 14 | var58 << 2) ^ 0 ^ 204) & 65532) >> 2 | (((var58 & '쀀') >> 14 | var58 << 2) ^ 0 ^ 204) << 14) & 65472) >> 6
                      | (((((var58 & '쀀') >> 14 | var58 << 2) ^ 0 ^ 204) & 65532) >> 2 | (((var58 & '쀀') >> 14 | var58 << 2) ^ 0 ^ 204) << 14) << 10
                  )
                  ^ 82
              )
              - 76
              - 188
              + 54
              + 157
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), r.class.getClassLoader()).returnType();
      switch ((var4 + 1992127128 + 951398765 ^ 1518175404 ^ 1728501870) - 414862658 + 1786084123 + 230875234 + 1195336392 - 1774161737 ^ 1465169383) {
        case 470574307:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 973956324:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1109073217:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1430422907:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      qtm[(((var10 ^ 1144852493) + 257160762 - 1595343220 ^ 1104118922 ^ 1647034131 ^ 2012634939) + 151060357 ^ 1483185450) + 1855743088 - 1621771871] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
