// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.class_2350;

public class uy {
  public static byte xgp = 2;
  public static byte fsd = 4;
  public static byte zqt = 8;
  public static byte wtj = 16;
  public static byte jps = 32;
  public static byte vx = 64;
  // [JNT] MethodHandle dispatch table (removed)
  public static byte dft(class_2350 var0) {
    int var1 = -1502078164;
    return switch ((
          (
                switch ((
                        null /* jnt:encrypted */[/* jnt */]
                          ^ 1338736055
                      )
                      - 2101514893
                      - 1648361102
                      - 1867851571
                      + 218393876
                      + 1438098963) {
                      case 1672468618 -> (-788361321 << -788361321 | -1205695750) & -1111584770;
                      case 1672468619 -> -746275664 + -2041317355 * (-746275664 | -2041317355) ^ 932824888;
                      case 1672468620 -> (-330919661 >>> 1834877711 | -307363520) & -5356167;
                      case 1672468621 -> 883417783 ^ -228674254 ^ -1876476838;
                      case 1672468622 -> (546497056 << -2072680641 | -1224350169) & -11665537;
                      case 1672468623 -> 666581653 >>> 1379334628 ^ -1157629914;
                      default -> -1631187746 ^ -1994722546 ^ 1080555989;
                    }
                    + 1441435091
                  ^ 307709532
              )
              + 864628554
            ^ 589185043
        )
        - 269289813
      ^ 236971132) {
      case -1742337224 -> 16;
      case -833953804 -> throw (MatchException)/* jnt */;
      case -818527830 -> 8;
      case -588066144 -> 32;
      case 1389388090 -> 2;
      default -> 64;
      case 1866399730 -> 4;
    };
  }

  public static boolean keb(int var0, byte var1) {
    return (var0 & var1) == var1;
  }

  public static boolean gtn(int var0, byte var1) {
    return (var0 & var1) != var1;
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = var10 - 1239322746 - 1532028386 + 308564225 + 1803646042 + 575906186 + 1258757992 + 342508442 ^ 257378381 ^ 849094899;
    MethodHandle var10000 = cfp[var10 - 1239322746 - 1532028386 + 308564225 + 1803646042 + 575906186 + 1258757992 + 342508442
      ^ 257378381
      ^ 849094899
      ^ 850235837];
    if (cfp[var10001 ^ 850235837] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (-1596664407 * -1596664407 | 0) & 692076548; var23 < var13.length(); var23 += -1216469268 - -345667514 ^ -870801753) {
        int var42 = var13.charAt(var23);
        int var10004 = (var42 & 65534) >> 1;
        int var43 = (((var42 & 65534) >> 1 | var42 << 15) - 243 + 121 ^ 115) + 192 ^ 147;
        int var77 = (((((var42 & 65534) >> 1 | var42 << 15) - 243 + 121 ^ 115) + 192 ^ 147) & 65528) >> 3;
        var42 = ((((var10004 | var42 << 15) - 243 + 121 ^ 115) + 192 ^ 147) & 65528) >> 3
          | ((((var42 & 65534) >> 1 | var42 << 15) - 243 + 121 ^ 115) + 192 ^ 147) << 13;
        var10004 = ((var77 | var43 << 13) & 57344) >> 13;
        int var45 = ((var77 | var43 << 13) & 57344) >> 13 | var42 << 3;
        int var79 = ((((var77 | var43 << 13) & 57344) >> 13 | var42 << 3) & 64512) >> 10;
        char var46 = (char)((((var10004 | var42 << 3) & 64512) >> 10 | (((var77 | var43 << 13) & 57344) >> 13 | var42 << 3) << 6) ^ 155);
        var13.setCharAt(var23, (char)((var79 | var45 << 6) ^ 155));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (1341851527 >> 1341851527 | 0) & -1105197040; var29 < var16.length(); var29 += 1837902641 - 1837902641 ^ 1) {
        int var51 = (var16.charAt(var29) - 'E' + 207 ^ 104) + 178 - 103;
        char var52 = (char)(((var51 & 65535) >> 0 | var51 << 16) + 196 - 75 + 138 ^ 34);
        var16.setCharAt(var29, (char)(((var51 & 65535) >> 0 | var51 << 16) + 196 - 75 + 138 ^ 34));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), uy.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (1936646907 | 1936646907 | 0) & -2079319040; var35 < var19.length(); var35 += -502298220 >>> -502298220 ^ 3617) {
        int var57 = (var19.charAt(var35) - 'P' ^ 84) - 70;
        char var60 = (char)(
          (
              (((((((var57 & 65024) >> 9 | var57 << 7) ^ 219) & 57344) >> 13 | (((var57 & 65024) >> 9 | var57 << 7) ^ 219) << 3) ^ 166) & 63488) >> 11
                | ((((((var57 & 65024) >> 9 | var57 << 7) ^ 219) & 57344) >> 13 | (((var57 & 65024) >> 9 | var57 << 7) ^ 219) << 3) ^ 166) << 5
            )
            ^ 188
            ^ 60
        );
        var19.setCharAt(
          var35,
          (char)(
            (
                (((((((var57 & 65024) >> 9 | var57 << 7) ^ 219) & 57344) >> 13 | (((var57 & 65024) >> 9 | var57 << 7) ^ 219) << 3) ^ 166) & 63488) >> 11
                  | ((((((var57 & 65024) >> 9 | var57 << 7) ^ 219) & 57344) >> 13 | (((var57 & 65024) >> 9 | var57 << 7) ^ 219) << 3) ^ 166) << 5
              )
              ^ 188
              ^ 60
          )
        );
      }

      Class var7 = Class.forName(var19.toString(), false, uy.class.getClassLoader());
      switch ((var4 + 304936863 - 787301470 + 2055003072 - 286886884 + 1895339363 - 628120081 ^ 194105468) - 400692155 + 2008256549 + 1312153283) {
        case 818178025:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 831382963:
        case 977075736:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 2015855959:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 2040287041:
          var10000 = var0.findSpecial(var7, var5, var6, uy.class);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    cfp[var10 - 1239322746 - 1532028386 + 308564225 + 1803646042 + 575906186 + 1258757992 + 342508442 ^ 257378381 ^ 849094899 ^ 850235837] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (((var10 ^ 1336455622 ^ 2099932975) + 535900499 ^ 1240908646) - 64150697 + 1936017968 ^ 1799153275 ^ 1334602) - 860120332;
    MethodHandle var10000 = cfp[(((var10 ^ 1336455622 ^ 2099932975) + 535900499 ^ 1240908646) - 64150697 + 1936017968 ^ 1799153275 ^ 1334602)
      - 860120332
      - 486390853];
    if (cfp[var10001 - 486390853] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = 465107405 ^ -277652211 ^ -187980608; var24 < var14.length(); var24 += (-493502680 | -1375405980 >> -1294392767) ^ -141033669) {
        char var43 = var14.charAt(var24);
        char var48 = (char)(
          (
              (
                  (
                        (
                              (
                                    (
                                        (
                                              (
                                                    ((((var43 & '\uffc0') >> 6 | var43 << '\n') & 61440) >> 12 | ((var43 & '\uffc0') >> 6 | var43 << '\n') << 4)
                                                      & 65472
                                                  )
                                                  >> 6
                                                | ((((var43 & '\uffc0') >> 6 | var43 << '\n') & 61440) >> 12 | ((var43 & '\uffc0') >> 6 | var43 << '\n') << 4)
                                                  << 10
                                            )
                                            + 207
                                          ^ 12
                                      )
                                      & 65472
                                  )
                                  >> 6
                                | (
                                    (
                                          (((((var43 & '\uffc0') >> 6 | var43 << '\n') & 61440) >> 12 | ((var43 & '\uffc0') >> 6 | var43 << '\n') << 4) & 65472)
                                              >> 6
                                            | ((((var43 & '\uffc0') >> 6 | var43 << '\n') & 61440) >> 12 | ((var43 & '\uffc0') >> 6 | var43 << '\n') << 4)
                                              << 10
                                        )
                                        + 207
                                      ^ 12
                                  )
                                  << 10
                            )
                            + 209
                          & 65520
                      )
                      >> 4
                    | (
                          (
                                (
                                    (
                                          (((((var43 & '\uffc0') >> 6 | var43 << '\n') & 61440) >> 12 | ((var43 & '\uffc0') >> 6 | var43 << '\n') << 4) & 65472)
                                              >> 6
                                            | ((((var43 & '\uffc0') >> 6 | var43 << '\n') & 61440) >> 12 | ((var43 & '\uffc0') >> 6 | var43 << '\n') << 4)
                                              << 10
                                        )
                                        + 207
                                      ^ 12
                                  )
                                  & 65472
                              )
                              >> 6
                            | (
                                (
                                      (((((var43 & '\uffc0') >> 6 | var43 << '\n') & 61440) >> 12 | ((var43 & '\uffc0') >> 6 | var43 << '\n') << 4) & 65472)
                                          >> 6
                                        | ((((var43 & '\uffc0') >> 6 | var43 << '\n') & 61440) >> 12 | ((var43 & '\uffc0') >> 6 | var43 << '\n') << 4) << 10
                                    )
                                    + 207
                                  ^ 12
                              )
                              << 10
                        )
                        + 209
                      << 12
                )
                ^ 91
            )
            - 70
        );
        var14.setCharAt(
          var24,
          (char)(
            (
                (
                    (
                          (
                                (
                                      (
                                          (
                                                (
                                                      (
                                                          (((var43 & '\uffc0') >> 6 | var43 << '\n') & 61440) >> 12
                                                            | ((var43 & '\uffc0') >> 6 | var43 << '\n') << 4
                                                        )
                                                        & 65472
                                                    )
                                                    >> 6
                                                  | ((((var43 & '\uffc0') >> 6 | var43 << '\n') & 61440) >> 12 | ((var43 & '\uffc0') >> 6 | var43 << '\n') << 4)
                                                    << 10
                                              )
                                              + 207
                                            ^ 12
                                        )
                                        & 65472
                                    )
                                    >> 6
                                  | (
                                      (
                                            (
                                                  ((((var43 & '\uffc0') >> 6 | var43 << '\n') & 61440) >> 12 | ((var43 & '\uffc0') >> 6 | var43 << '\n') << 4)
                                                    & 65472
                                                )
                                                >> 6
                                              | ((((var43 & '\uffc0') >> 6 | var43 << '\n') & 61440) >> 12 | ((var43 & '\uffc0') >> 6 | var43 << '\n') << 4)
                                                << 10
                                          )
                                          + 207
                                        ^ 12
                                    )
                                    << 10
                              )
                              + 209
                            & 65520
                        )
                        >> 4
                      | (
                            (
                                  (
                                      (
                                            (
                                                  ((((var43 & '\uffc0') >> 6 | var43 << '\n') & 61440) >> 12 | ((var43 & '\uffc0') >> 6 | var43 << '\n') << 4)
                                                    & 65472
                                                )
                                                >> 6
                                              | ((((var43 & '\uffc0') >> 6 | var43 << '\n') & 61440) >> 12 | ((var43 & '\uffc0') >> 6 | var43 << '\n') << 4)
                                                << 10
                                          )
                                          + 207
                                        ^ 12
                                    )
                                    & 65472
                                )
                                >> 6
                              | (
                                  (
                                        (((((var43 & '\uffc0') >> 6 | var43 << '\n') & 61440) >> 12 | ((var43 & '\uffc0') >> 6 | var43 << '\n') << 4) & 65472)
                                            >> 6
                                          | ((((var43 & '\uffc0') >> 6 | var43 << '\n') & 61440) >> 12 | ((var43 & '\uffc0') >> 6 | var43 << '\n') << 4) << 10
                                      )
                                      + 207
                                    ^ 12
                                )
                                << 10
                          )
                          + 209
                        << 12
                  )
                  ^ 91
              )
              - 70
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (440034108 + 440034108 * 440034108 | 0) & 135799427; var30 < var17.length(); var30 += 1030428594 ^ -772911602 ^ -326805059) {
        int var53 = (var17.charAt(var30) - 176 + 246 + 205 ^ 119) - 241 - 241;
        char var56 = (char)(
          ((((((var53 & 65534) >> 1 | var53 << 15) & 65534) >> 1 | ((var53 & 65534) >> 1 | var53 << 15) << 15) ^ 93) & 0) >> 16
            | (((((var53 & 65534) >> 1 | var53 << 15) & 65534) >> 1 | ((var53 & 65534) >> 1 | var53 << 15) << 15) ^ 93) << 0
        );
        var17.setCharAt(
          var30,
          (char)(
            ((((((var53 & 65534) >> 1 | var53 << 15) & 65534) >> 1 | ((var53 & 65534) >> 1 | var53 << 15) << 15) ^ 93) & 0) >> 16
              | (((((var53 & 65534) >> 1 | var53 << 15) & 65534) >> 1 | ((var53 & 65534) >> 1 | var53 << 15) << 15) ^ 93) << 0
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, uy.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (-1511616524 + -1511616524 | 0) & 70262800; var36 < var20.length(); var36 += (459395996 + 2047176372 | 1) & 135278889) {
        int var61 = var20.charAt(var36) ^ 249;
        char var64 = (char)(
          (
              (
                    (
                        (((var61 & 65408) >> 7 | var61 << 9) - 24 - 66 - 31 + 198 - 80 & 57344) >> 13
                          | ((var61 & 65408) >> 7 | var61 << 9) - 24 - 66 - 31 + 198 - 80 << 3
                      )
                      & 65534
                  )
                  >> 1
                | (
                    (((var61 & 65408) >> 7 | var61 << 9) - 24 - 66 - 31 + 198 - 80 & 57344) >> 13
                      | ((var61 & 65408) >> 7 | var61 << 9) - 24 - 66 - 31 + 198 - 80 << 3
                  )
                  << 15
            )
            ^ 216
        );
        var20.setCharAt(
          var36,
          (char)(
            (
                (
                      (
                          (((var61 & 65408) >> 7 | var61 << 9) - 24 - 66 - 31 + 198 - 80 & 57344) >> 13
                            | ((var61 & 65408) >> 7 | var61 << 9) - 24 - 66 - 31 + 198 - 80 << 3
                        )
                        & 65534
                    )
                    >> 1
                  | (
                      (((var61 & 65408) >> 7 | var61 << 9) - 24 - 66 - 31 + 198 - 80 & 57344) >> 13
                        | ((var61 & 65408) >> 7 | var61 << 9) - 24 - 66 - 31 + 198 - 80 << 3
                    )
                    << 15
              )
              ^ 216
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), uy.class.getClassLoader()).returnType();
      switch ((var4 - 551086183 + 1001372421 + 1649765425 + 352986205 - 674284312 - 1600495227 ^ 1877192819 ^ 1678042778) + 1135273275 ^ 1901021209) {
        case 218375459:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1439257478:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1531544681:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1823368645:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      cfp[(((var10 ^ 1336455622 ^ 2099932975) + 535900499 ^ 1240908646) - 64150697 + 1936017968 ^ 1799153275 ^ 1334602) - 860120332 - 486390853] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
