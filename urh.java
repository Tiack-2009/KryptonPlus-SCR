// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

public enum urh {
  gl,
  qe,
  jh,
  cz,
  nq;

  public static urh[] tz;
  // [JNT] MethodHandle dispatch table (removed)
  public static urh valueOf(int var0) {
    return null /* jnt:encrypted */[var0];
  }

  // $VF: Failed to inline enum fields
  // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
  static {
    int var10000 = (921959289 ^ 1739363605 | 0) & 673189905;

    StringBuilder var10001;
    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < ((-1836803233 - 44417926 | 0) & 67627);
      var10000 += -1650217800 ^ 1614608879 ^ -39889578
    ) {
      int var18 = /* jnt */ - '1';
      int var10004 = (var18 & 64512) >> 10;
      int var19 = ((var18 & 64512) >> 10 | var18 << 6) - 134;
      int var53 = (((var18 & 64512) >> 10 | var18 << 6) - 134 & 65535) >> 0;
      char var20 = (char)((((var10004 | var18 << 6) - 134 & 65535) >> 0 | ((var18 & 64512) >> 10 | var18 << 6) - 134 << 16) ^ 79);
      /* jnt */((var53 | var19 << 16) ^ 79)
      );
    }

    gl = (urh)/* jnt */,
      0
    );
    var10000 = (778472152 * 778472152 | 0) & 268437804;

    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < (762142242 - 2063417900 ^ -1301275661);
      var10000 += -2119379653 + (-1666582601 ^ 2005854059) ^ 1825826326
    ) {
      char var23 = /* jnt */;
      int var54 = (var23 & '\ufff0') >> 4;
      int var24 = (var23 & '\ufff0') >> 4 | var23 << '\f';
      int var55 = (((var23 & '\ufff0') >> 4 | var23 << '\f') & 64512) >> 10;
      var23 = (char)((((var54 | var23 << '\f') & 64512) >> 10 | ((var23 & '\ufff0') >> 4 | var23 << '\f') << 6) - 226 + 218 ^ 67);
      /* jnt */((var55 | var24 << 6) - 226 + 218 ^ 67)
      );
    }

    qe = (urh)/* jnt */,
      1
    );
    var10000 = (1720330150 >>> -712311688 | 0) & -1709935216;

    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < ((-211053304 >> -211053304 | 5) & 262181);
      var10000 += (-744749919 * 1530321252 | 1) & -1576456175
    ) {
      char var28 = /* jnt */;
      int var56 = (var28 & '\ufff8') >> 3;
      int var29 = (((var28 & '\ufff8') >> 3 | var28 << '\r') ^ 33) - 108;
      int var57 = ((((var28 & '\ufff8') >> 3 | var28 << '\r') ^ 33) - 108 & 65535) >> 0;
      var28 = (char)(((((var56 | var28 << '\r') ^ 33) - 108 & 65535) >> 0 | (((var28 & '\ufff8') >> 3 | var28 << '\r') ^ 33) - 108 << 16) + 160);
      /* jnt */((var57 | var29 << 16) + 160)
      );
    }

    jh = (urh)/* jnt */,
      2
    );
    var10000 = (-450605242 | -804884211 | 0) & 9502880;

    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < ((1272045488 >>> (224372925 >> -183752020) | 4) & 42015684);
      var10000 += 2047561610 - 314442469 ^ 1733119140
    ) {
      int var33 = /* jnt */
        - 148
        + 101
        - 97;
      int var58 = (var33 & 65535) >> 0;
      int var34 = (var33 & 65535) >> 0 | var33 << 16;
      int var59 = (((var33 & 65535) >> 0 | var33 << 16) & 65024) >> 9;
      char var35 = (char)(((var58 | var33 << 16) & 65024) >> 9 | ((var33 & 65535) >> 0 | var33 << 16) << 7);
      /* jnt */(var59 | var34 << 7)
      );
    }

    cz = (urh)/* jnt */,
      3
    );
    var10000 = (-2086267011 ^ -2086267011 << 1893879847 | 0) & 637535234;

    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < ((552119022 | 552119022 | 4) & -586084076);
      var10000 += 1206256207 << 474733632 ^ 1206256206
    ) {
      char var38 = /* jnt */;
      char var41 = (char)(
        (
            (((((var38 & '\uffc0') >> 6 | var38 << '\n') + 243 & 65408) >> 7 | ((var38 & '\uffc0') >> 6 | var38 << '\n') + 243 << 9) & 57344) >> 13
              | ((((var38 & '\uffc0') >> 6 | var38 << '\n') + 243 & 65408) >> 7 | ((var38 & '\uffc0') >> 6 | var38 << '\n') + 243 << 9) << 3
          )
          - 109
      );
      /* jnt */(
          (
              (((((var38 & '\uffc0') >> 6 | var38 << '\n') + 243 & 65408) >> 7 | ((var38 & '\uffc0') >> 6 | var38 << '\n') + 243 << 9) & 57344) >> 13
                | ((((var38 & '\uffc0') >> 6 | var38 << '\n') + 243 & 65408) >> 7 | ((var38 & '\uffc0') >> 6 | var38 << '\n') + 243 << 9) << 3
            )
            - 109
        )
      );
    }

    nq = (urh)/* jnt */,
      4
    );
    tz = /* jnt */;
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (((var10 + 634162605 ^ 1617963535) - 2078968422 ^ 142012858) + 224550540 ^ 1207695061) - 1091250877 - 1209530819 + 861148720;
    MethodHandle var10000 = fdl[(((var10 + 634162605 ^ 1617963535) - 2078968422 ^ 142012858) + 224550540 ^ 1207695061) - 1091250877 - 1209530819 + 861148720
      ^ 339965950];
    if (fdl[var10001 ^ 339965950] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (-1180007235 + 184915312 | 0) & 960774466; var23 < var13.length(); var23 += (-515787648 | 540621650 | 1) & 268845101) {
        int var42 = (var13.charAt(var23) ^ '9') - 38 - 226 - 101;
        char var45 = (char)(
          ((((((var42 & 0) >> 16 | var42 << 0) ^ 143 ^ 74) - 177 & 65520) >> 4 | (((var42 & 0) >> 16 | var42 << 0) ^ 143 ^ 74) - 177 << 12) & 63488) >> 11
            | (((((var42 & 0) >> 16 | var42 << 0) ^ 143 ^ 74) - 177 & 65520) >> 4 | (((var42 & 0) >> 16 | var42 << 0) ^ 143 ^ 74) - 177 << 12) << 5
        );
        var13.setCharAt(
          var23,
          (char)(
            ((((((var42 & 0) >> 16 | var42 << 0) ^ 143 ^ 74) - 177 & 65520) >> 4 | (((var42 & 0) >> 16 | var42 << 0) ^ 143 ^ 74) - 177 << 12) & 63488) >> 11
              | (((((var42 & 0) >> 16 | var42 << 0) ^ 143 ^ 74) - 177 & 65520) >> 4 | (((var42 & 0) >> 16 | var42 << 0) ^ 143 ^ 74) - 177 << 12) << 5
          )
        );
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = 727499113 ^ -1246911625 ^ -1628347874; var29 < var16.length(); var29 += (102649403 | 2113560821) ^ 2147380990) {
        int var50 = (var16.charAt(var29) + 154 ^ 210 ^ 45) - 91;
        int var81 = (var50 & 32768) >> 15;
        int var51 = (((var50 & 32768) >> 15 | var50 << 1) + 242 ^ 209) + 122 - 115;
        int var82 = ((((var50 & 32768) >> 15 | var50 << 1) + 242 ^ 209) + 122 - 115 & 65408) >> 7;
        char var52 = (char)((((var81 | var50 << 1) + 242 ^ 209) + 122 - 115 & 65408) >> 7 | (((var50 & 32768) >> 15 | var50 << 1) + 242 ^ 209) + 122 - 115 << 9);
        var16.setCharAt(var29, (char)(var82 | var51 << 9));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), urh.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = 1310644001 & -1511969652 ^ 67109888; var35 < var19.length(); var35 += 1420705387 >> 1413398855 * -977767825 ^ 2774814) {
        int var57 = var19.charAt(var35);
        int var83 = (var57 & 65408) >> 7;
        int var58 = (var57 & 65408) >> 7 | var57 << 9;
        int var84 = (((var57 & 65408) >> 7 | var57 << 9) & 65534) >> 1;
        var57 = (((var83 | var57 << 9) & 65534) >> 1 | ((var57 & 65408) >> 7 | var57 << 9) << 15) - 122 + 151;
        var83 = ((var84 | var58 << 15) - 122 + 151 & 32768) >> 15;
        int var60 = ((var84 | var58 << 15) - 122 + 151 & 32768) >> 15 | var57 << 1;
        int var86 = ((((var84 | var58 << 15) - 122 + 151 & 32768) >> 15 | var57 << 1) & 0) >> 16;
        char var61 = (char)((((var83 | var57 << 1) & 0) >> 16 | (((var84 | var58 << 15) - 122 + 151 & 32768) >> 15 | var57 << 1) << 0) - 208 + 62 - 74 + 237);
        var19.setCharAt(var35, (char)((var86 | var60 << 0) - 208 + 62 - 74 + 237));
      }

      Class var7 = Class.forName(var19.toString(), false, urh.class.getClassLoader());
      switch (((var4 ^ 1823934629 ^ 1895718547) + 1494957820 + 1171165056 ^ 1159929574 ^ 414746655) + 1556323641 - 1636281144 + 1589911091 ^ 1586024155) {
        case 17086342:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 436706146:
        case 840553737:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 606676376:
          var10000 = var0.findSpecial(var7, var5, var6, urh.class);
          break;
        case 1297875742:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    fdl[(((var10 + 634162605 ^ 1617963535) - 2078968422 ^ 142012858) + 224550540 ^ 1207695061) - 1091250877 - 1209530819 + 861148720 ^ 339965950] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 + 220444446 ^ 255428670 ^ 883373260) + 1941315109 ^ 1044992361) - 234490891 - 1916129829 - 341047400 - 1924103427;
    MethodHandle var10000 = fdl[((var10 + 220444446 ^ 255428670 ^ 883373260) + 1941315109 ^ 1044992361)
      - 234490891
      - 1916129829
      - 341047400
      - 1924103427
      - 1667220351];
    if (fdl[var10001 - 1667220351] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (1978214527 * 1978214527 | 0) & 675283078; var24 < var14.length(); var24 += 1658653537 >> -875097876 ^ 404945) {
        int var43 = var14.charAt(var24) + 20;
        char var48 = (char)(
          (
              (
                    (
                        (
                              (
                                  (
                                        (
                                            (((((var43 & 65532) >> 2 | var43 << 14) & 65528) >> 3 | ((var43 & 65532) >> 2 | var43 << 14) << 13) & 63488) >> 11
                                              | ((((var43 & 65532) >> 2 | var43 << 14) & 65528) >> 3 | ((var43 & 65532) >> 2 | var43 << 14) << 13) << 5
                                          )
                                          ^ 12
                                      )
                                      - 94
                                    ^ 3
                                )
                                & 0
                            )
                            >> 16
                          | (
                              (
                                    (
                                        (((((var43 & 65532) >> 2 | var43 << 14) & 65528) >> 3 | ((var43 & 65532) >> 2 | var43 << 14) << 13) & 63488) >> 11
                                          | ((((var43 & 65532) >> 2 | var43 << 14) & 65528) >> 3 | ((var43 & 65532) >> 2 | var43 << 14) << 13) << 5
                                      )
                                      ^ 12
                                  )
                                  - 94
                                ^ 3
                            )
                            << 0
                      )
                      & 0
                  )
                  >> 16
                | (
                    (
                          (
                              (
                                    (
                                        (((((var43 & 65532) >> 2 | var43 << 14) & 65528) >> 3 | ((var43 & 65532) >> 2 | var43 << 14) << 13) & 63488) >> 11
                                          | ((((var43 & 65532) >> 2 | var43 << 14) & 65528) >> 3 | ((var43 & 65532) >> 2 | var43 << 14) << 13) << 5
                                      )
                                      ^ 12
                                  )
                                  - 94
                                ^ 3
                            )
                            & 0
                        )
                        >> 16
                      | (
                          (
                                (
                                    (((((var43 & 65532) >> 2 | var43 << 14) & 65528) >> 3 | ((var43 & 65532) >> 2 | var43 << 14) << 13) & 63488) >> 11
                                      | ((((var43 & 65532) >> 2 | var43 << 14) & 65528) >> 3 | ((var43 & 65532) >> 2 | var43 << 14) << 13) << 5
                                  )
                                  ^ 12
                              )
                              - 94
                            ^ 3
                        )
                        << 0
                  )
                  << 0
            )
            - 9
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
                                              (((((var43 & 65532) >> 2 | var43 << 14) & 65528) >> 3 | ((var43 & 65532) >> 2 | var43 << 14) << 13) & 63488)
                                                  >> 11
                                                | ((((var43 & 65532) >> 2 | var43 << 14) & 65528) >> 3 | ((var43 & 65532) >> 2 | var43 << 14) << 13) << 5
                                            )
                                            ^ 12
                                        )
                                        - 94
                                      ^ 3
                                  )
                                  & 0
                              )
                              >> 16
                            | (
                                (
                                      (
                                          (((((var43 & 65532) >> 2 | var43 << 14) & 65528) >> 3 | ((var43 & 65532) >> 2 | var43 << 14) << 13) & 63488) >> 11
                                            | ((((var43 & 65532) >> 2 | var43 << 14) & 65528) >> 3 | ((var43 & 65532) >> 2 | var43 << 14) << 13) << 5
                                        )
                                        ^ 12
                                    )
                                    - 94
                                  ^ 3
                              )
                              << 0
                        )
                        & 0
                    )
                    >> 16
                  | (
                      (
                            (
                                (
                                      (
                                          (((((var43 & 65532) >> 2 | var43 << 14) & 65528) >> 3 | ((var43 & 65532) >> 2 | var43 << 14) << 13) & 63488) >> 11
                                            | ((((var43 & 65532) >> 2 | var43 << 14) & 65528) >> 3 | ((var43 & 65532) >> 2 | var43 << 14) << 13) << 5
                                        )
                                        ^ 12
                                    )
                                    - 94
                                  ^ 3
                              )
                              & 0
                          )
                          >> 16
                        | (
                            (
                                  (
                                      (((((var43 & 65532) >> 2 | var43 << 14) & 65528) >> 3 | ((var43 & 65532) >> 2 | var43 << 14) << 13) & 63488) >> 11
                                        | ((((var43 & 65532) >> 2 | var43 << 14) & 65528) >> 3 | ((var43 & 65532) >> 2 | var43 << 14) << 13) << 5
                                    )
                                    ^ 12
                                )
                                - 94
                              ^ 3
                          )
                          << 0
                    )
                    << 0
              )
              - 9
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (105659097 & 361676476 | 0) & 1636844901; var30 < var17.length(); var30 += (-2096111424 | 165053040 | 1) & 1073745155) {
        int var53 = var17.charAt(var30);
        int var96 = (var53 & 49152) >> 14;
        int var54 = (var53 & 49152) >> 14 | var53 << 2;
        int var97 = (((var53 & 49152) >> 14 | var53 << 2) & 65520) >> 4;
        var53 = ((var96 | var53 << 2) & 65520) >> 4 | ((var53 & 49152) >> 14 | var53 << 2) << 12;
        var96 = ((var97 | var54 << 12) & 0) >> 16;
        int var56 = ((((var97 | var54 << 12) & 0) >> 16 | var53 << 0) + 180 ^ 229 ^ 234 ^ 220) + 50 + 228;
        int var99 = (((((var97 | var54 << 12) & 0) >> 16 | var53 << 0) + 180 ^ 229 ^ 234 ^ 220) + 50 + 228 & 57344) >> 13;
        char var57 = (char)(
          (((var96 | var53 << 0) + 180 ^ 229 ^ 234 ^ 220) + 50 + 228 & 57344) >> 13
            | ((((var97 | var54 << 12) & 0) >> 16 | var53 << 0) + 180 ^ 229 ^ 234 ^ 220) + 50 + 228 << 3
        );
        var17.setCharAt(var30, (char)(var99 | var56 << 3));
      }

      Class var6 = Class.forName(var17.toString(), false, urh.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (-299202763 >> -299202763 | 0) & 4; var36 < var20.length(); var36 += (-967136881 ^ 613088948 | 1) & 84772929) {
        int var62 = var20.charAt(var36);
        int var100 = (var62 & 61440) >> 12;
        int var63 = ((var62 & 61440) >> 12 | var62 << 4) - 67 - 167;
        int var101 = (((var62 & 61440) >> 12 | var62 << 4) - 67 - 167 & 32768) >> 15;
        var62 = (((var100 | var62 << 4) - 67 - 167 & 32768) >> 15 | ((var62 & 61440) >> 12 | var62 << 4) - 67 - 167 << 1) ^ 153;
        var100 = (((var101 | var63 << 1) ^ 153) & 49152) >> 14;
        int var65 = (((var101 | var63 << 1) ^ 153) & 49152) >> 14 | var62 << 2;
        int var103 = (((((var101 | var63 << 1) ^ 153) & 49152) >> 14 | var62 << 2) & 61440) >> 12;
        var62 = (((var100 | var62 << 2) & 61440) >> 12 | ((((var101 | var63 << 1) ^ 153) & 49152) >> 14 | var62 << 2) << 4) + 94;
        var100 = ((var103 | var65 << 4) + 94 & 49152) >> 14;
        int var67 = ((var103 | var65 << 4) + 94 & 49152) >> 14 | var62 << 2;
        int var105 = ((((var103 | var65 << 4) + 94 & 49152) >> 14 | var62 << 2) & 65472) >> 6;
        char var68 = (char)(((var100 | var62 << 2) & 65472) >> 6 | (((var103 | var65 << 4) + 94 & 49152) >> 14 | var62 << 2) << 10);
        var20.setCharAt(var36, (char)(var105 | var67 << 10));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), urh.class.getClassLoader()).returnType();
      switch (((var4 ^ 1678470407) - 703747247 + 1264152542 - 1624729209 ^ 1981120498 ^ 1748626957) + 1847443244 - 24184088 - 1138512425 - 312055329) {
        case 464741604:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 884149646:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1381470128:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1792461738:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      fdl[((var10 + 220444446 ^ 255428670 ^ 883373260) + 1941315109 ^ 1044992361) - 234490891 - 1916129829 - 341047400 - 1924103427 - 1667220351] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
