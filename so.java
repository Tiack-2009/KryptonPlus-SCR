// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

public enum so {
  msd,
  ptv,
  yvj;
  // [JNT] MethodHandle dispatch table (removed)
  // $VF: Failed to inline enum fields
  // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
  static {
    int var10000 = (-485529448 << 1440822171 | 0) & 115346521;

    StringBuilder var10001;
    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < ((-132232657 - -1168427215 | 4) & -2144600057);
      var10000 += (-357514225 >>> -231132371 | 1) & -1120892319
    ) {
      /* jnt */(
          (
              (/* jnt */ + 'i' ^ 176)
                  - 229
                ^ 251
            )
            + 9
        )
      );
    }

    msd = (so)/* jnt */,
      0
    );
    var10000 = 1231400378 << 1231400378 ^ -402653184;

    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < ((10155911 - -361907273 | 6) & -1458438105);
      var10000 += (-86335182 >> -86335182 | 1) & 321
    ) {
      int var12 = /* jnt */ ^ '$';
      char var15 = (char)(
        (((((var12 & 65472) >> 6 | var12 << 10) & 32768) >> 15 | ((var12 & 65472) >> 6 | var12 << 10) << 1) + 144 & 64512) >> 10
          | ((((var12 & 65472) >> 6 | var12 << 10) & 32768) >> 15 | ((var12 & 65472) >> 6 | var12 << 10) << 1) + 144 << 6
      );
      /* jnt */(
          (((((var12 & 65472) >> 6 | var12 << 10) & 32768) >> 15 | ((var12 & 65472) >> 6 | var12 << 10) << 1) + 144 & 64512) >> 10
            | ((((var12 & 65472) >> 6 | var12 << 10) & 32768) >> 15 | ((var12 & 65472) >> 6 | var12 << 10) << 1) + 144 << 6
        )
      );
    }

    ptv = (so)/* jnt */,
      1
    );
    var10000 = -1179605110 - -1179605110 ^ 0;

    for (var10001 = (StringBuilder)/* jnt */;
      var10000 < ((893546848 ^ 1834946457 | 4) & -2050981884);
      var10000 += 1970178838 & -2069301572 ^ 69763605
    ) {
      int var18 = /* jnt */ ^ 28 ^ 130;
      char var19 = (char)(((var18 & 49152) >> 14 | var18 << 2) ^ 192 ^ 105);
      /* jnt */(((var18 & 49152) >> 14 | var18 << 2) ^ 192 ^ 105)
      );
    }

    yvj = (so)/* jnt */,
      2
    );
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (((var10 ^ 2128211719 ^ 409026948) - 405548441 + 1375382118 ^ 134047828) - 1172749573 ^ 2023863725) - 1925268988 - 1666787414;
    MethodHandle var10000 = wax[(((var10 ^ 2128211719 ^ 409026948) - 405548441 + 1375382118 ^ 134047828) - 1172749573 ^ 2023863725) - 1925268988 - 1666787414
      ^ 428169610];
    if (wax[var10001 ^ 428169610] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = 982548609 ^ -453196284 ^ -563329403; var23 < var13.length(); var23 += 278925688 + -1374687542 ^ -1095761853) {
        int var42 = var13.charAt(var23) ^ '1';
        int var10004 = (var42 & 63488) >> 11;
        int var43 = (var42 & 63488) >> 11 | var42 << 5;
        int var87 = (((var42 & 63488) >> 11 | var42 << 5) & 57344) >> 13;
        var42 = ((var10004 | var42 << 5) & 57344) >> 13 | ((var42 & 63488) >> 11 | var42 << 5) << 3;
        var10004 = ((var87 | var43 << 3) & 49152) >> 14;
        int var45 = (((var87 | var43 << 3) & 49152) >> 14 | var42 << 2) - 157;
        int var89 = ((((var87 | var43 << 3) & 49152) >> 14 | var42 << 2) - 157 & 65024) >> 9;
        var42 = (((var10004 | var42 << 2) - 157 & 65024) >> 9 | (((var87 | var43 << 3) & 49152) >> 14 | var42 << 2) - 157 << 7) ^ 206;
        var10004 = (((var89 | var45 << 7) ^ 206) & 49152) >> 14;
        int var47 = ((((var89 | var45 << 7) ^ 206) & 49152) >> 14 | var42 << 2) - 1;
        int var91 = (((((var89 | var45 << 7) ^ 206) & 49152) >> 14 | var42 << 2) - 1 & 57344) >> 13;
        char var48 = (char)(((var10004 | var42 << 2) - 1 & 57344) >> 13 | ((((var89 | var45 << 7) ^ 206) & 49152) >> 14 | var42 << 2) - 1 << 3);
        var13.setCharAt(var23, (char)(var91 | var47 << 3));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (-1513764011 * (2093322300 & (-1513764011 | 2093322300)) | 0) & 110168065;
        var29 < var16.length();
        var29 += 1051322642 << 852410217 ^ 1406280705
      ) {
        int var53 = var16.charAt(var29);
        int var92 = (var53 & 65528) >> 3;
        int var54 = (var53 & 65528) >> 3 | var53 << 13;
        int var93 = (((var53 & 65528) >> 3 | var53 << 13) & 65408) >> 7;
        var53 = (((((var92 | var53 << 13) & 65408) >> 7 | ((var53 & 65528) >> 3 | var53 << 13) << 9) - 200 ^ 137) + 146 ^ 68) - 60;
        var92 = ((((var93 | var54 << 9) - 200 ^ 137) + 146 ^ 68) - 60 & 65528) >> 3;
        int var56 = ((((var93 | var54 << 9) - 200 ^ 137) + 146 ^ 68) - 60 & 65528) >> 3 | var53 << 13;
        int var95 = ((((((var93 | var54 << 9) - 200 ^ 137) + 146 ^ 68) - 60 & 65528) >> 3 | var53 << 13) & 65528) >> 3;
        char var57 = (char)(
          (((var92 | var53 << 13) & 65528) >> 3 | (((((var93 | var54 << 9) - 200 ^ 137) + 146 ^ 68) - 60 & 65528) >> 3 | var53 << 13) << 13) - 188
        );
        var16.setCharAt(var29, (char)((var95 | var56 << 13) - 188));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), so.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = 437559831 >> 1190226039 ^ 52; var35 < var19.length(); var35 += (-1772063839 ^ -151879067 | 1) & -1721760733) {
        char var62 = var19.charAt(var35);
        char var65 = (char)(
          (
                ((((((var62 & '￼') >> 2 | var62 << 14) + 11 & 65535) >> 0 | ((var62 & '￼') >> 2 | var62 << 14) + 11 << 16) + 122 ^ 117) - 248 + 153 ^ 122)
                    - 228
                  & 63488
              )
              >> 11
            | ((((((var62 & '￼') >> 2 | var62 << 14) + 11 & 65535) >> 0 | ((var62 & '￼') >> 2 | var62 << 14) + 11 << 16) + 122 ^ 117) - 248 + 153 ^ 122) - 228
              << 5
        );
        var19.setCharAt(
          var35,
          (char)(
            (
                  ((((((var62 & '￼') >> 2 | var62 << 14) + 11 & 65535) >> 0 | ((var62 & '￼') >> 2 | var62 << 14) + 11 << 16) + 122 ^ 117) - 248 + 153 ^ 122)
                      - 228
                    & 63488
                )
                >> 11
              | ((((((var62 & '￼') >> 2 | var62 << 14) + 11 & 65535) >> 0 | ((var62 & '￼') >> 2 | var62 << 14) + 11 << 16) + 122 ^ 117) - 248 + 153 ^ 122)
                  - 228
                << 5
          )
        );
      }

      Class var7 = Class.forName(var19.toString(), false, so.class.getClassLoader());
      switch (((var4 - 339971253 + 841216344 - 1326266940 + 727128749 - 1112060814 ^ 1203019051) - 772485104 - 1136228981 ^ 1235617295) - 1088561571) {
        case 292506934:
        case 930078253:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 795012977:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 959904873:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 1413583970:
          var10000 = var0.findSpecial(var7, var5, var6, so.class);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    wax[(((var10 ^ 2128211719 ^ 409026948) - 405548441 + 1375382118 ^ 134047828) - 1172749573 ^ 2023863725) - 1925268988 - 1666787414 ^ 428169610] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 ^ 1171759354 ^ 760661535) - 779426149 ^ 728244419) + 1907965206 + 1891955852 - 628424772 - 701169720 - 1967150533;
    MethodHandle var10000 = wax[((var10 ^ 1171759354 ^ 760661535) - 779426149 ^ 728244419)
      + 1907965206
      + 1891955852
      - 628424772
      - 701169720
      - 1967150533
      + 1073472324];
    if (wax[var10001 + 1073472324] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = 475738224 ^ -233462831 ^ -296840287; var24 < var14.length(); var24 += 1202857993 * -1377061470 ^ 709800627) {
        int var43 = var14.charAt(var24) + '$' + 247 ^ 159;
        char var46 = (char)(
          (((((((var43 & 64512) >> 10 | var43 << 6) - 65 ^ 120) & 0) >> 16 | (((var43 & 64512) >> 10 | var43 << 6) - 65 ^ 120) << 0) ^ 12 ^ 56) & 65472) >> 6
            | ((((((var43 & 64512) >> 10 | var43 << 6) - 65 ^ 120) & 0) >> 16 | (((var43 & 64512) >> 10 | var43 << 6) - 65 ^ 120) << 0) ^ 12 ^ 56) << 10
        );
        var14.setCharAt(
          var24,
          (char)(
            (((((((var43 & 64512) >> 10 | var43 << 6) - 65 ^ 120) & 0) >> 16 | (((var43 & 64512) >> 10 | var43 << 6) - 65 ^ 120) << 0) ^ 12 ^ 56) & 65472) >> 6
              | ((((((var43 & 64512) >> 10 | var43 << 6) - 65 ^ 120) & 0) >> 16 | (((var43 & 64512) >> 10 | var43 << 6) - 65 ^ 120) << 0) ^ 12 ^ 56) << 10
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = -2035461567 * 136125725 ^ 1028697693; var30 < var17.length(); var30 += (125535415 >> 1805140606 | 1) & 1182985409) {
        int var51 = var17.charAt(var30);
        int var92 = (var51 & 65535) >> 0;
        int var52 = (var51 & 65535) >> 0 | var51 << 16;
        int var93 = (((var51 & 65535) >> 0 | var51 << 16) & 65472) >> 6;
        var51 = ((var92 | var51 << 16) & 65472) >> 6 | ((var51 & 65535) >> 0 | var51 << 16) << 10;
        var92 = ((var93 | var52 << 10) & 65535) >> 0;
        int var54 = (((var93 | var52 << 10) & 65535) >> 0 | var51 << 16) - 76 + 173;
        int var95 = ((((var93 | var52 << 10) & 65535) >> 0 | var51 << 16) - 76 + 173 & 65520) >> 4;
        var51 = ((var92 | var51 << 16) - 76 + 173 & 65520) >> 4 | (((var93 | var52 << 10) & 65535) >> 0 | var51 << 16) - 76 + 173 << 12;
        var92 = ((var95 | var54 << 12) & 65472) >> 6;
        int var56 = (((var95 | var54 << 12) & 65472) >> 6 | var51 << 10) ^ 51 ^ 114;
        int var97 = (((((var95 | var54 << 12) & 65472) >> 6 | var51 << 10) ^ 51 ^ 114) & 65504) >> 5;
        char var57 = (char)((((var92 | var51 << 10) ^ 51 ^ 114) & 65504) >> 5 | ((((var95 | var54 << 12) & 65472) >> 6 | var51 << 10) ^ 51 ^ 114) << 11);
        var17.setCharAt(var30, (char)(var97 | var56 << 11));
      }

      Class var6 = Class.forName(var17.toString(), false, so.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (1183406285 >>> -1872899801 | 0) & 2134026502; var36 < var20.length(); var36 += 581180476 & -1626568799 ^ 33817633) {
        char var62 = var20.charAt(var36);
        char var67 = (char)(
          (
              (
                    (
                          (
                                (
                                    ((((((var62 & '쀀') >> 14 | var62 << 2) - 116 & 57344) >> 13 | ((var62 & '쀀') >> 14 | var62 << 2) - 116 << 3) ^ 30) & 65408)
                                        >> 7
                                      | (((((var62 & '쀀') >> 14 | var62 << 2) - 116 & 57344) >> 13 | ((var62 & '쀀') >> 14 | var62 << 2) - 116 << 3) ^ 30) << 9
                                  )
                                  & 65024
                              )
                              >> 9
                            | (
                                ((((((var62 & '쀀') >> 14 | var62 << 2) - 116 & 57344) >> 13 | ((var62 & '쀀') >> 14 | var62 << 2) - 116 << 3) ^ 30) & 65408)
                                    >> 7
                                  | (((((var62 & '쀀') >> 14 | var62 << 2) - 116 & 57344) >> 13 | ((var62 & '쀀') >> 14 | var62 << 2) - 116 << 3) ^ 30) << 9
                              )
                              << 7
                        )
                        - 11
                      & 65528
                  )
                  >> 3
                | (
                      (
                            (
                                ((((((var62 & '쀀') >> 14 | var62 << 2) - 116 & 57344) >> 13 | ((var62 & '쀀') >> 14 | var62 << 2) - 116 << 3) ^ 30) & 65408)
                                    >> 7
                                  | (((((var62 & '쀀') >> 14 | var62 << 2) - 116 & 57344) >> 13 | ((var62 & '쀀') >> 14 | var62 << 2) - 116 << 3) ^ 30) << 9
                              )
                              & 65024
                          )
                          >> 9
                        | (
                            ((((((var62 & '쀀') >> 14 | var62 << 2) - 116 & 57344) >> 13 | ((var62 & '쀀') >> 14 | var62 << 2) - 116 << 3) ^ 30) & 65408) >> 7
                              | (((((var62 & '쀀') >> 14 | var62 << 2) - 116 & 57344) >> 13 | ((var62 & '쀀') >> 14 | var62 << 2) - 116 << 3) ^ 30) << 9
                          )
                          << 7
                    )
                    - 11
                  << 13
            )
            - 43
            + 96
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
                                            (((((var62 & '쀀') >> 14 | var62 << 2) - 116 & 57344) >> 13 | ((var62 & '쀀') >> 14 | var62 << 2) - 116 << 3) ^ 30)
                                              & 65408
                                          )
                                          >> 7
                                        | (((((var62 & '쀀') >> 14 | var62 << 2) - 116 & 57344) >> 13 | ((var62 & '쀀') >> 14 | var62 << 2) - 116 << 3) ^ 30)
                                          << 9
                                    )
                                    & 65024
                                )
                                >> 9
                              | (
                                  ((((((var62 & '쀀') >> 14 | var62 << 2) - 116 & 57344) >> 13 | ((var62 & '쀀') >> 14 | var62 << 2) - 116 << 3) ^ 30) & 65408)
                                      >> 7
                                    | (((((var62 & '쀀') >> 14 | var62 << 2) - 116 & 57344) >> 13 | ((var62 & '쀀') >> 14 | var62 << 2) - 116 << 3) ^ 30) << 9
                                )
                                << 7
                          )
                          - 11
                        & 65528
                    )
                    >> 3
                  | (
                        (
                              (
                                  ((((((var62 & '쀀') >> 14 | var62 << 2) - 116 & 57344) >> 13 | ((var62 & '쀀') >> 14 | var62 << 2) - 116 << 3) ^ 30) & 65408)
                                      >> 7
                                    | (((((var62 & '쀀') >> 14 | var62 << 2) - 116 & 57344) >> 13 | ((var62 & '쀀') >> 14 | var62 << 2) - 116 << 3) ^ 30) << 9
                                )
                                & 65024
                            )
                            >> 9
                          | (
                              ((((((var62 & '쀀') >> 14 | var62 << 2) - 116 & 57344) >> 13 | ((var62 & '쀀') >> 14 | var62 << 2) - 116 << 3) ^ 30) & 65408) >> 7
                                | (((((var62 & '쀀') >> 14 | var62 << 2) - 116 & 57344) >> 13 | ((var62 & '쀀') >> 14 | var62 << 2) - 116 << 3) ^ 30) << 9
                            )
                            << 7
                      )
                      - 11
                    << 13
              )
              - 43
              + 96
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), so.class.getClassLoader()).returnType();
      switch (((var4 - 1075054556 - 2122673550 - 1640659807 ^ 1339239372) - 1628558558 + 782546531 ^ 1062186736) + 1110730798 ^ 226005790 ^ 426907022) {
        case 106748338:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 222575597:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 607038634:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 798114509:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      wax[((var10 ^ 1171759354 ^ 760661535) - 779426149 ^ 728244419) + 1907965206 + 1891955852 - 628424772 - 701169720 - 1967150533 + 1073472324] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
