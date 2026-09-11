// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

public record op(
  int x,
  int z,
  int startY,
  int endY,
  int width,
  int length,
  int x,
  int z,
  int startY,
  int endY,
  int width,
  int length,
  int x,
  int z,
  int startY,
  int endY,
  int width,
  int length,
  int x,
  int z,
  int startY,
  int endY,
  int width,
  int length,
  int x,
  int z,
  int startY,
  int endY,
  int width,
  int length,
  int x,
  int z,
  int startY,
  int endY,
  int width,
  int length,
  int x,
  int z,
  int startY,
  int endY,
  int width,
  int length,
  int x,
  int z,
  int startY,
  int endY,
  int width,
  int length,
  int x,
  int z,
  int startY,
  int endY,
  int width,
  int length,
  int x,
  int z,
  int startY,
  int endY,
  int width,
  int length,
  int x,
  int z,
  int startY,
  int endY,
  int width,
  int length,
  int x,
  int z,
  int startY,
  int endY,
  int width,
  int length,
  int x,
  int z,
  int startY,
  int endY,
  int width,
  int length,
  int x,
  int z,
  int startY,
  int endY,
  int width,
  int length,
  int x,
  int z,
  int startY,
  int endY,
  int width,
  int length,
  int x,
  int z,
  int startY,
  int endY,
  int width,
  int length
) {
  public int jc;
  public int qi;
  public int jr;
  public int mt;
  public int kan;
  public int ut;
  // [JNT] MethodHandle dispatch table (removed)
  public op(int var1, int var2, int var3, int var4, int var5, int var6) {
    this.jc = var1;
    this.qi = var2;
    this.jr = var3;
    this.mt = var4;
    this.kan = var5;
    this.ut = var6;
  }

  public int xy() {
    return null /* jnt:encrypted */;
  }

  public int kq() {
    return null /* jnt:encrypted */;
  }

  public int kua() {
    return null /* jnt:encrypted */;
  }

  public int zpc() {
    return null /* jnt:encrypted */;
  }

  public int njf() {
    return null /* jnt:encrypted */;
  }

  public int pns() {
    return null /* jnt:encrypted */;
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (var10 + 1011786807 + 2089115279 - 896919992 + 1216778328 - 1252550592 + 893617444 ^ 1012952722) + 1334675786 + 470869407;
    MethodHandle var10000 = gqdf[(var10 + 1011786807 + 2089115279 - 896919992 + 1216778328 - 1252550592 + 893617444 ^ 1012952722)
      + 1334675786
      + 470869407
      - 1335188507];
    if (gqdf[var10001 - 1335188507] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = 259973803 ^ 1406624133 ^ 1554613038; var24 < var14.length(); var24 += (2089556592 | 1551393013 | 0) & -2113699575) {
        int var43 = var14.charAt(var24) ^ 143;
        int var10004 = (var43 & 65472) >> 6;
        int var44 = (var43 & 65472) >> 6 | var43 << 10;
        int var96 = (((var43 & 65472) >> 6 | var43 << 10) & 65532) >> 2;
        var43 = ((var10004 | var43 << 10) & 65532) >> 2 | ((var43 & 65472) >> 6 | var43 << 10) << 14;
        var10004 = ((var96 | var44 << 14) & 65472) >> 6;
        int var46 = ((var96 | var44 << 14) & 65472) >> 6 | var43 << 10;
        int var98 = ((((var96 | var44 << 14) & 65472) >> 6 | var43 << 10) & 65528) >> 3;
        var43 = ((var10004 | var43 << 10) & 65528) >> 3 | (((var96 | var44 << 14) & 65472) >> 6 | var43 << 10) << 13;
        var10004 = ((var98 | var46 << 13) & 64512) >> 10;
        int var48 = ((var98 | var46 << 13) & 64512) >> 10 | var43 << 6;
        int var100 = ((((var98 | var46 << 13) & 64512) >> 10 | var43 << 6) & 65024) >> 9;
        char var49 = (char)((((var10004 | var43 << 6) & 65024) >> 9 | (((var98 | var46 << 13) & 64512) >> 10 | var43 << 6) << 7) - 94 ^ 225 ^ 182);
        var14.setCharAt(var24, (char)((var100 | var48 << 7) - 94 ^ 225 ^ 182));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (-1921895429 ^ -1921895429 | 0) & 1797656836; var30 < var17.length(); var30 += (-901051794 >> -901051794 * -901051794 | 1) & 51921409) {
        int var54 = (var17.charAt(var30) ^ 19) + 24;
        int var101 = (var54 & 65534) >> 1;
        int var55 = (var54 & 65534) >> 1 | var54 << 15;
        int var102 = (((var54 & 65534) >> 1 | var54 << 15) & 65535) >> 0;
        var54 = (((var101 | var54 << 15) & 65535) >> 0 | ((var54 & 65534) >> 1 | var54 << 15) << 16) + 143;
        var101 = ((var102 | var55 << 16) + 143 & 64512) >> 10;
        int var57 = ((var102 | var55 << 16) + 143 & 64512) >> 10 | var54 << 6;
        int var104 = ((((var102 | var55 << 16) + 143 & 64512) >> 10 | var54 << 6) & 63488) >> 11;
        var54 = ((var101 | var54 << 6) & 63488) >> 11 | (((var102 | var55 << 16) + 143 & 64512) >> 10 | var54 << 6) << 5;
        var101 = ((var104 | var57 << 5) & 49152) >> 14;
        int var59 = (((var104 | var57 << 5) & 49152) >> 14 | var54 << 2) ^ 97;
        int var106 = (((((var104 | var57 << 5) & 49152) >> 14 | var54 << 2) ^ 97) & 61440) >> 12;
        char var60 = (char)((((var101 | var54 << 2) ^ 97) & 61440) >> 12 | ((((var104 | var57 << 5) & 49152) >> 14 | var54 << 2) ^ 97) << 4);
        var17.setCharAt(var30, (char)(var106 | var59 << 4));
      }

      Class var6 = Class.forName(var17.toString(), false, op.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = -2065098998 + -68668711 ^ -2133767709; var36 < var20.length(); var36 += (-1894513184 & 2147041443 | 1) & 1894388485) {
        char var65 = var20.charAt(var36);
        char var70 = (char)(
          (
              (
                    (
                        (
                              (
                                  (
                                        (((((var65 & '쀀') >> 14 | var65 << 2) & 65535) >> 0 | ((var65 & '쀀') >> 14 | var65 << 2) << 16) - 174 & 65472) >> 6
                                          | ((((var65 & '쀀') >> 14 | var65 << 2) & 65535) >> 0 | ((var65 & '쀀') >> 14 | var65 << 2) << 16) - 174 << 10
                                      )
                                      - 63
                                    ^ 236
                                    ^ 77
                                )
                                & 65024
                            )
                            >> 9
                          | (
                              (
                                    (((((var65 & '쀀') >> 14 | var65 << 2) & 65535) >> 0 | ((var65 & '쀀') >> 14 | var65 << 2) << 16) - 174 & 65472) >> 6
                                      | ((((var65 & '쀀') >> 14 | var65 << 2) & 65535) >> 0 | ((var65 & '쀀') >> 14 | var65 << 2) << 16) - 174 << 10
                                  )
                                  - 63
                                ^ 236
                                ^ 77
                            )
                            << 7
                      )
                      & 65535
                  )
                  >> 0
                | (
                    (
                          (
                              (
                                    (((((var65 & '쀀') >> 14 | var65 << 2) & 65535) >> 0 | ((var65 & '쀀') >> 14 | var65 << 2) << 16) - 174 & 65472) >> 6
                                      | ((((var65 & '쀀') >> 14 | var65 << 2) & 65535) >> 0 | ((var65 & '쀀') >> 14 | var65 << 2) << 16) - 174 << 10
                                  )
                                  - 63
                                ^ 236
                                ^ 77
                            )
                            & 65024
                        )
                        >> 9
                      | (
                          (
                                (((((var65 & '쀀') >> 14 | var65 << 2) & 65535) >> 0 | ((var65 & '쀀') >> 14 | var65 << 2) << 16) - 174 & 65472) >> 6
                                  | ((((var65 & '쀀') >> 14 | var65 << 2) & 65535) >> 0 | ((var65 & '쀀') >> 14 | var65 << 2) << 16) - 174 << 10
                              )
                              - 63
                            ^ 236
                            ^ 77
                        )
                        << 7
                  )
                  << 16
            )
            + 102
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
                                          (((((var65 & '쀀') >> 14 | var65 << 2) & 65535) >> 0 | ((var65 & '쀀') >> 14 | var65 << 2) << 16) - 174 & 65472) >> 6
                                            | ((((var65 & '쀀') >> 14 | var65 << 2) & 65535) >> 0 | ((var65 & '쀀') >> 14 | var65 << 2) << 16) - 174 << 10
                                        )
                                        - 63
                                      ^ 236
                                      ^ 77
                                  )
                                  & 65024
                              )
                              >> 9
                            | (
                                (
                                      (((((var65 & '쀀') >> 14 | var65 << 2) & 65535) >> 0 | ((var65 & '쀀') >> 14 | var65 << 2) << 16) - 174 & 65472) >> 6
                                        | ((((var65 & '쀀') >> 14 | var65 << 2) & 65535) >> 0 | ((var65 & '쀀') >> 14 | var65 << 2) << 16) - 174 << 10
                                    )
                                    - 63
                                  ^ 236
                                  ^ 77
                              )
                              << 7
                        )
                        & 65535
                    )
                    >> 0
                  | (
                      (
                            (
                                (
                                      (((((var65 & '쀀') >> 14 | var65 << 2) & 65535) >> 0 | ((var65 & '쀀') >> 14 | var65 << 2) << 16) - 174 & 65472) >> 6
                                        | ((((var65 & '쀀') >> 14 | var65 << 2) & 65535) >> 0 | ((var65 & '쀀') >> 14 | var65 << 2) << 16) - 174 << 10
                                    )
                                    - 63
                                  ^ 236
                                  ^ 77
                              )
                              & 65024
                          )
                          >> 9
                        | (
                            (
                                  (((((var65 & '쀀') >> 14 | var65 << 2) & 65535) >> 0 | ((var65 & '쀀') >> 14 | var65 << 2) << 16) - 174 & 65472) >> 6
                                    | ((((var65 & '쀀') >> 14 | var65 << 2) & 65535) >> 0 | ((var65 & '쀀') >> 14 | var65 << 2) << 16) - 174 << 10
                                )
                                - 63
                              ^ 236
                              ^ 77
                          )
                          << 7
                    )
                    << 16
              )
              + 102
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), op.class.getClassLoader()).returnType();
      switch ((var4 - 1007814804 - 775415250 ^ 76415173) - 1941694652 - 749863967 + 227061587 - 496045953 + 357026759 - 1352455736 - 1128370983) {
        case 5018594:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1502930497:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1620459927:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1677195700:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      gqdf[(var10 + 1011786807 + 2089115279 - 896919992 + 1216778328 - 1252550592 + 893617444 ^ 1012952722) + 1334675786 + 470869407 - 1335188507] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
