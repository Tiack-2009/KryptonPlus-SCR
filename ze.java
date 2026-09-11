// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.World;
import net.minecraft.BlockState;
import net.minecraft.class_2791;
import net.minecraft.class_2826;
import net.minecraft.MinecraftClient;

public class ze {
  public class_1937 kc = null /* jnt:encrypted */null /* jnt:encrypted */
  );
  public class_2791 s;
  // [JNT] MethodHandle dispatch table (removed)
  public class_2680 vd(int var1, int var2, int var3) {
    int var8 = 228261001;
    if (/* jnt */,
      var2
    )) {
      return /* jnt */
      );
    } else {
      int var4 = var1 >> 4;
      int var5 = var3 >> 4;
      class_2791 var6;
      if (null /* jnt:encrypted */
          != null
        && null /* jnt:encrypted */
          )
          == var4
        && null /* jnt:encrypted */
          )
          == var5) {
        var6 = null /* jnt:encrypted */;
      } else {
        var6 = /* jnt */,
          var4,
          var5,
          null /* jnt:encrypted */,
          false
        );
      }

      var8 = -777948887 + -1154736505 ^ -507900108;

      while (true) {
        switch ((var8 ^ 283734389 ^ 199019936) - 1549186245 + 60203785 + 223579114 + 1761934494) {
          case -1814383843:
          default:
            if (var6 == null) {
              return /* jnt */
              );
            }

            var8 = -386723768 + -386723768 ^ 1652344439;
            break;
          case -968371970:
            class_2826 var7 = /* jnt */[/* jnt */];
            if (var7 == null) {
              return /* jnt */
              );
            } else {
              null /* jnt:encrypted */;
              return /* jnt */;
            }
        }
      }
    }
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (((var10 ^ 181152379) - 464876079 + 145156938 - 190917419 ^ 1563948713 ^ 1484059348) + 1817587658 ^ 794034349) + 979943578;
    MethodHandle var10000 = fyj[(((var10 ^ 181152379) - 464876079 + 145156938 - 190917419 ^ 1563948713 ^ 1484059348) + 1817587658 ^ 794034349) + 979943578
      ^ 944960631];
    if (fyj[var10001 ^ 944960631] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = 2041442608 - 2041442608 ^ 0; var23 < var13.length(); var23 += (-1272729968 ^ -971496007 * -1880868092 | 1) & 285747211) {
        int var42 = var13.charAt(var23) - 194;
        char var45 = (char)(
          (
                ((((((var42 & 61440) >> 12 | var42 << 4) + 180 ^ 151) & 65024) >> 9 | (((var42 & 61440) >> 12 | var42 << 4) + 180 ^ 151) << 7) & 65535) >> 0
                  | (((((var42 & 61440) >> 12 | var42 << 4) + 180 ^ 151) & 65024) >> 9 | (((var42 & 61440) >> 12 | var42 << 4) + 180 ^ 151) << 7) << 16
              )
              + 199
              + 148
              + 100
            ^ 230
        );
        var13.setCharAt(
          var23,
          (char)(
            (
                  ((((((var42 & 61440) >> 12 | var42 << 4) + 180 ^ 151) & 65024) >> 9 | (((var42 & 61440) >> 12 | var42 << 4) + 180 ^ 151) << 7) & 65535) >> 0
                    | (((((var42 & 61440) >> 12 | var42 << 4) + 180 ^ 151) & 65024) >> 9 | (((var42 & 61440) >> 12 | var42 << 4) + 180 ^ 151) << 7) << 16
                )
                + 199
                + 148
                + 100
              ^ 230
          )
        );
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (2128715786 * 338622441 | 0) & 1080467617; var29 < var16.length(); var29 += (1848539458 ^ -2101221470 | 1) & 33554693) {
        char var50 = var16.charAt(var29);
        char var55 = (char)(
          (
              (
                    (
                          (
                                (
                                    (
                                          (((((var50 & '\uf800') >> 11 | var50 << 5) & 65408) >> 7 | ((var50 & '\uf800') >> 11 | var50 << 5) << 9) + 146 ^ 166)
                                            & 65504
                                        )
                                        >> 5
                                      | (((((var50 & '\uf800') >> 11 | var50 << 5) & 65408) >> 7 | ((var50 & '\uf800') >> 11 | var50 << 5) << 9) + 146 ^ 166)
                                        << 11
                                  )
                                  & 65532
                              )
                              >> 2
                            | (
                                ((((((var50 & '\uf800') >> 11 | var50 << 5) & 65408) >> 7 | ((var50 & '\uf800') >> 11 | var50 << 5) << 9) + 146 ^ 166) & 65504)
                                    >> 5
                                  | (((((var50 & '\uf800') >> 11 | var50 << 5) & 65408) >> 7 | ((var50 & '\uf800') >> 11 | var50 << 5) << 9) + 146 ^ 166) << 11
                              )
                              << 14
                        )
                        + 66
                        - 173
                      & 65472
                  )
                  >> 6
                | (
                      (
                            (
                                ((((((var50 & '\uf800') >> 11 | var50 << 5) & 65408) >> 7 | ((var50 & '\uf800') >> 11 | var50 << 5) << 9) + 146 ^ 166) & 65504)
                                    >> 5
                                  | (((((var50 & '\uf800') >> 11 | var50 << 5) & 65408) >> 7 | ((var50 & '\uf800') >> 11 | var50 << 5) << 9) + 146 ^ 166) << 11
                              )
                              & 65532
                          )
                          >> 2
                        | (
                            ((((((var50 & '\uf800') >> 11 | var50 << 5) & 65408) >> 7 | ((var50 & '\uf800') >> 11 | var50 << 5) << 9) + 146 ^ 166) & 65504)
                                >> 5
                              | (((((var50 & '\uf800') >> 11 | var50 << 5) & 65408) >> 7 | ((var50 & '\uf800') >> 11 | var50 << 5) << 9) + 146 ^ 166) << 11
                          )
                          << 14
                    )
                    + 66
                    - 173
                  << 10
            )
            ^ 25
        );
        var16.setCharAt(
          var29,
          (char)(
            (
                (
                      (
                            (
                                  (
                                      (
                                            (
                                                ((((var50 & '\uf800') >> 11 | var50 << 5) & 65408) >> 7 | ((var50 & '\uf800') >> 11 | var50 << 5) << 9) + 146
                                                  ^ 166
                                              )
                                              & 65504
                                          )
                                          >> 5
                                        | (((((var50 & '\uf800') >> 11 | var50 << 5) & 65408) >> 7 | ((var50 & '\uf800') >> 11 | var50 << 5) << 9) + 146 ^ 166)
                                          << 11
                                    )
                                    & 65532
                                )
                                >> 2
                              | (
                                  (
                                        (((((var50 & '\uf800') >> 11 | var50 << 5) & 65408) >> 7 | ((var50 & '\uf800') >> 11 | var50 << 5) << 9) + 146 ^ 166)
                                          & 65504
                                      )
                                      >> 5
                                    | (((((var50 & '\uf800') >> 11 | var50 << 5) & 65408) >> 7 | ((var50 & '\uf800') >> 11 | var50 << 5) << 9) + 146 ^ 166)
                                      << 11
                                )
                                << 14
                          )
                          + 66
                          - 173
                        & 65472
                    )
                    >> 6
                  | (
                        (
                              (
                                  (
                                        (((((var50 & '\uf800') >> 11 | var50 << 5) & 65408) >> 7 | ((var50 & '\uf800') >> 11 | var50 << 5) << 9) + 146 ^ 166)
                                          & 65504
                                      )
                                      >> 5
                                    | (((((var50 & '\uf800') >> 11 | var50 << 5) & 65408) >> 7 | ((var50 & '\uf800') >> 11 | var50 << 5) << 9) + 146 ^ 166)
                                      << 11
                                )
                                & 65532
                            )
                            >> 2
                          | (
                              ((((((var50 & '\uf800') >> 11 | var50 << 5) & 65408) >> 7 | ((var50 & '\uf800') >> 11 | var50 << 5) << 9) + 146 ^ 166) & 65504)
                                  >> 5
                                | (((((var50 & '\uf800') >> 11 | var50 << 5) & 65408) >> 7 | ((var50 & '\uf800') >> 11 | var50 << 5) << 9) + 146 ^ 166) << 11
                            )
                            << 14
                      )
                      + 66
                      - 173
                    << 10
              )
              ^ 25
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), ze.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = -1940632890 >>> -87366912 ^ -1940632890; var35 < var19.length(); var35 += 850505835 & -1836992157 & 1505632444 ^ 276832289) {
        int var60 = var19.charAt(var35) - 2;
        char var65 = (char)(
          (
              (
                    (
                          (
                                (
                                    (
                                        (((((var60 & 65520) >> 4 | var60 << 12) & 65520) >> 4 | ((var60 & 65520) >> 4 | var60 << 12) << 12) & 65472) >> 6
                                          | ((((var60 & 65520) >> 4 | var60 << 12) & 65520) >> 4 | ((var60 & 65520) >> 4 | var60 << 12) << 12) << 10
                                      )
                                      ^ 7
                                  )
                                  & 65520
                              )
                              >> 4
                            | (
                                (
                                    (((((var60 & 65520) >> 4 | var60 << 12) & 65520) >> 4 | ((var60 & 65520) >> 4 | var60 << 12) << 12) & 65472) >> 6
                                      | ((((var60 & 65520) >> 4 | var60 << 12) & 65520) >> 4 | ((var60 & 65520) >> 4 | var60 << 12) << 12) << 10
                                  )
                                  ^ 7
                              )
                              << 12
                        )
                        - 185
                        - 235
                      & 65532
                  )
                  >> 2
                | (
                      (
                            (
                                (
                                    (((((var60 & 65520) >> 4 | var60 << 12) & 65520) >> 4 | ((var60 & 65520) >> 4 | var60 << 12) << 12) & 65472) >> 6
                                      | ((((var60 & 65520) >> 4 | var60 << 12) & 65520) >> 4 | ((var60 & 65520) >> 4 | var60 << 12) << 12) << 10
                                  )
                                  ^ 7
                              )
                              & 65520
                          )
                          >> 4
                        | (
                            (
                                (((((var60 & 65520) >> 4 | var60 << 12) & 65520) >> 4 | ((var60 & 65520) >> 4 | var60 << 12) << 12) & 65472) >> 6
                                  | ((((var60 & 65520) >> 4 | var60 << 12) & 65520) >> 4 | ((var60 & 65520) >> 4 | var60 << 12) << 12) << 10
                              )
                              ^ 7
                          )
                          << 12
                    )
                    - 185
                    - 235
                  << 14
            )
            - 35
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
                                          (((((var60 & 65520) >> 4 | var60 << 12) & 65520) >> 4 | ((var60 & 65520) >> 4 | var60 << 12) << 12) & 65472) >> 6
                                            | ((((var60 & 65520) >> 4 | var60 << 12) & 65520) >> 4 | ((var60 & 65520) >> 4 | var60 << 12) << 12) << 10
                                        )
                                        ^ 7
                                    )
                                    & 65520
                                )
                                >> 4
                              | (
                                  (
                                      (((((var60 & 65520) >> 4 | var60 << 12) & 65520) >> 4 | ((var60 & 65520) >> 4 | var60 << 12) << 12) & 65472) >> 6
                                        | ((((var60 & 65520) >> 4 | var60 << 12) & 65520) >> 4 | ((var60 & 65520) >> 4 | var60 << 12) << 12) << 10
                                    )
                                    ^ 7
                                )
                                << 12
                          )
                          - 185
                          - 235
                        & 65532
                    )
                    >> 2
                  | (
                        (
                              (
                                  (
                                      (((((var60 & 65520) >> 4 | var60 << 12) & 65520) >> 4 | ((var60 & 65520) >> 4 | var60 << 12) << 12) & 65472) >> 6
                                        | ((((var60 & 65520) >> 4 | var60 << 12) & 65520) >> 4 | ((var60 & 65520) >> 4 | var60 << 12) << 12) << 10
                                    )
                                    ^ 7
                                )
                                & 65520
                            )
                            >> 4
                          | (
                              (
                                  (((((var60 & 65520) >> 4 | var60 << 12) & 65520) >> 4 | ((var60 & 65520) >> 4 | var60 << 12) << 12) & 65472) >> 6
                                    | ((((var60 & 65520) >> 4 | var60 << 12) & 65520) >> 4 | ((var60 & 65520) >> 4 | var60 << 12) << 12) << 10
                                )
                                ^ 7
                            )
                            << 12
                      )
                      - 185
                      - 235
                    << 14
              )
              - 35
          )
        );
      }

      Class var7 = Class.forName(var19.toString(), false, ze.class.getClassLoader());
      switch ((var4 + 1434610232 ^ 1306145746) - 117477901 - 1709390695 - 1896092662 - 1829920875 - 1829623257 + 1900927721 + 1916270258 + 95171774) {
        case 410880789:
        case 557374129:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 500303204:
          var10000 = var0.findSpecial(var7, var5, var6, ze.class);
          break;
        case 936113686:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 1104398156:
          var10000 = var0.findConstructor(var7, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    fyj[(((var10 ^ 181152379) - 464876079 + 145156938 - 190917419 ^ 1563948713 ^ 1484059348) + 1817587658 ^ 794034349) + 979943578 ^ 944960631] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 - 1443206150 + 1399790658 - 943726514 ^ 646345194) + 796270064 ^ 188720432) + 804658793 - 383342334 + 1255784600;
    MethodHandle var10000 = fyj[((var10 - 1443206150 + 1399790658 - 943726514 ^ 646345194) + 796270064 ^ 188720432) + 804658793 - 383342334 + 1255784600
      ^ 462935983];
    if (fyj[var10001 ^ 462935983] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = -135870477 >> (-2144502103 >> 1672620322) ^ -132687; var24 < var14.length(); var24 += (-789973486 & -1559682850 | 1) & 1266729121) {
        int var43 = var14.charAt(var24) + 238;
        char var48 = (char)(
          (
              (
                    (
                          (
                                (
                                    (((((var43 & 65532) >> 2 | var43 << 14) & 65024) >> 9 | ((var43 & 65532) >> 2 | var43 << 14) << 7) & 65520) >> 4
                                      | ((((var43 & 65532) >> 2 | var43 << 14) & 65024) >> 9 | ((var43 & 65532) >> 2 | var43 << 14) << 7) << 12
                                  )
                                  & 65520
                              )
                              >> 4
                            | (
                                (((((var43 & 65532) >> 2 | var43 << 14) & 65024) >> 9 | ((var43 & 65532) >> 2 | var43 << 14) << 7) & 65520) >> 4
                                  | ((((var43 & 65532) >> 2 | var43 << 14) & 65024) >> 9 | ((var43 & 65532) >> 2 | var43 << 14) << 7) << 12
                              )
                              << 12
                        )
                        - 49
                      & 65528
                  )
                  >> 3
                | (
                      (
                            (
                                (((((var43 & 65532) >> 2 | var43 << 14) & 65024) >> 9 | ((var43 & 65532) >> 2 | var43 << 14) << 7) & 65520) >> 4
                                  | ((((var43 & 65532) >> 2 | var43 << 14) & 65024) >> 9 | ((var43 & 65532) >> 2 | var43 << 14) << 7) << 12
                              )
                              & 65520
                          )
                          >> 4
                        | (
                            (((((var43 & 65532) >> 2 | var43 << 14) & 65024) >> 9 | ((var43 & 65532) >> 2 | var43 << 14) << 7) & 65520) >> 4
                              | ((((var43 & 65532) >> 2 | var43 << 14) & 65024) >> 9 | ((var43 & 65532) >> 2 | var43 << 14) << 7) << 12
                          )
                          << 12
                    )
                    - 49
                  << 13
            )
            + 93
            - 106
            + 205
        );
        var14.setCharAt(
          var24,
          (char)(
            (
                (
                      (
                            (
                                  (
                                      (((((var43 & 65532) >> 2 | var43 << 14) & 65024) >> 9 | ((var43 & 65532) >> 2 | var43 << 14) << 7) & 65520) >> 4
                                        | ((((var43 & 65532) >> 2 | var43 << 14) & 65024) >> 9 | ((var43 & 65532) >> 2 | var43 << 14) << 7) << 12
                                    )
                                    & 65520
                                )
                                >> 4
                              | (
                                  (((((var43 & 65532) >> 2 | var43 << 14) & 65024) >> 9 | ((var43 & 65532) >> 2 | var43 << 14) << 7) & 65520) >> 4
                                    | ((((var43 & 65532) >> 2 | var43 << 14) & 65024) >> 9 | ((var43 & 65532) >> 2 | var43 << 14) << 7) << 12
                                )
                                << 12
                          )
                          - 49
                        & 65528
                    )
                    >> 3
                  | (
                        (
                              (
                                  (((((var43 & 65532) >> 2 | var43 << 14) & 65024) >> 9 | ((var43 & 65532) >> 2 | var43 << 14) << 7) & 65520) >> 4
                                    | ((((var43 & 65532) >> 2 | var43 << 14) & 65024) >> 9 | ((var43 & 65532) >> 2 | var43 << 14) << 7) << 12
                                )
                                & 65520
                            )
                            >> 4
                          | (
                              (((((var43 & 65532) >> 2 | var43 << 14) & 65024) >> 9 | ((var43 & 65532) >> 2 | var43 << 14) << 7) & 65520) >> 4
                                | ((((var43 & 65532) >> 2 | var43 << 14) & 65024) >> 9 | ((var43 & 65532) >> 2 | var43 << 14) << 7) << 12
                            )
                            << 12
                      )
                      - 49
                    << 13
              )
              + 93
              - 106
              + 205
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = 1906704059 ^ -1707886608 ^ -342472373; var30 < var17.length(); var30 += 1536767029 << 1536767029 ^ -2036334591) {
        int var53 = var17.charAt(var30) + 227;
        int var94 = (var53 & 65528) >> 3;
        int var54 = (var53 & 65528) >> 3 | var53 << 13;
        int var95 = (((var53 & 65528) >> 3 | var53 << 13) & 64512) >> 10;
        var53 = ((var94 | var53 << 13) & 64512) >> 10 | ((var53 & 65528) >> 3 | var53 << 13) << 6;
        var94 = ((var95 | var54 << 6) & 65024) >> 9;
        int var56 = (((var95 | var54 << 6) & 65024) >> 9 | var53 << 7) - 36;
        int var97 = ((((var95 | var54 << 6) & 65024) >> 9 | var53 << 7) - 36 & 63488) >> 11;
        var53 = (((var94 | var53 << 7) - 36 & 63488) >> 11 | (((var95 | var54 << 6) & 65024) >> 9 | var53 << 7) - 36 << 5) - 29 - 23;
        var94 = ((var97 | var56 << 5) - 29 - 23 & 61440) >> 12;
        int var58 = ((var97 | var56 << 5) - 29 - 23 & 61440) >> 12 | var53 << 4;
        int var99 = ((((var97 | var56 << 5) - 29 - 23 & 61440) >> 12 | var53 << 4) & 32768) >> 15;
        char var59 = (char)(((var94 | var53 << 4) & 32768) >> 15 | (((var97 | var56 << 5) - 29 - 23 & 61440) >> 12 | var53 << 4) << 1);
        var17.setCharAt(var30, (char)(var99 | var58 << 1));
      }

      Class var6 = Class.forName(var17.toString(), false, ze.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (525558993 ^ -821946066 | 0) & 58982400; var36 < var20.length(); var36 += (-1105219348 << (1413040411 ^ 1413040411) | 1) & 20991491) {
        int var64 = var20.charAt(var36) + 'g';
        char var67 = (char)(
          (
              (((((((var64 & 63488) >> 11 | var64 << 5) ^ 150) & 65528) >> 3 | (((var64 & 63488) >> 11 | var64 << 5) ^ 150) << 13) + 79 - 114 ^ 118) & 65408)
                  >> 7
                | ((((((var64 & 63488) >> 11 | var64 << 5) ^ 150) & 65528) >> 3 | (((var64 & 63488) >> 11 | var64 << 5) ^ 150) << 13) + 79 - 114 ^ 118) << 9
            )
            - 94
            - 162
        );
        var20.setCharAt(
          var36,
          (char)(
            (
                (((((((var64 & 63488) >> 11 | var64 << 5) ^ 150) & 65528) >> 3 | (((var64 & 63488) >> 11 | var64 << 5) ^ 150) << 13) + 79 - 114 ^ 118) & 65408)
                    >> 7
                  | ((((((var64 & 63488) >> 11 | var64 << 5) ^ 150) & 65528) >> 3 | (((var64 & 63488) >> 11 | var64 << 5) ^ 150) << 13) + 79 - 114 ^ 118) << 9
              )
              - 94
              - 162
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), ze.class.getClassLoader()).returnType();
      switch ((var4 + 71480710 - 1055844739 ^ 715737802) - 1788379773 + 1711907892 + 2025969623 + 528125951 + 885143570 - 1596138326 + 725119299) {
        case 13930651:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 589453179:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 907865517:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1419531654:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      fyj[((var10 - 1443206150 + 1399790658 - 943726514 ^ 646345194) + 796270064 ^ 188720432) + 804658793 - 383342334 + 1255784600 ^ 462935983] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
