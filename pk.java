// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

public record pk(
  float x0,
  float y0,
  float x1,
  float y1,
  float u0,
  float v0,
  float u1,
  float v1,
  float xAdvance,
  float x0,
  float y0,
  float x1,
  float y1,
  float u0,
  float v0,
  float u1,
  float v1,
  float xAdvance,
  float x0,
  float y0,
  float x1,
  float y1,
  float u0,
  float v0,
  float u1,
  float v1,
  float xAdvance,
  float x0,
  float y0,
  float x1,
  float y1,
  float u0,
  float v0,
  float u1,
  float v1,
  float xAdvance,
  float x0,
  float y0,
  float x1,
  float y1,
  float u0,
  float v0,
  float u1,
  float v1,
  float xAdvance,
  float x0,
  float y0,
  float x1,
  float y1,
  float u0,
  float v0,
  float u1,
  float v1,
  float xAdvance,
  float x0,
  float y0,
  float x1,
  float y1,
  float u0,
  float v0,
  float u1,
  float v1,
  float xAdvance,
  float x0,
  float y0,
  float x1,
  float y1,
  float u0,
  float v0,
  float u1,
  float v1,
  float xAdvance,
  float x0,
  float y0,
  float x1,
  float y1,
  float u0,
  float v0,
  float u1,
  float v1,
  float xAdvance,
  float x0,
  float y0,
  float x1,
  float y1,
  float u0,
  float v0,
  float u1,
  float v1,
  float xAdvance,
  float x0,
  float y0,
  float x1,
  float y1,
  float u0,
  float v0,
  float u1,
  float v1,
  float xAdvance,
  float x0,
  float y0,
  float x1,
  float y1,
  float u0,
  float v0,
  float u1,
  float v1,
  float xAdvance,
  float x0,
  float y0,
  float x1,
  float y1,
  float u0,
  float v0,
  float u1,
  float v1,
  float xAdvance,
  float x0,
  float y0,
  float x1,
  float y1,
  float u0,
  float v0,
  float u1,
  float v1,
  float xAdvance,
  float x0,
  float y0,
  float x1,
  float y1,
  float u0,
  float v0,
  float u1,
  float v1,
  float xAdvance,
  float x0,
  float y0,
  float x1,
  float y1,
  float u0,
  float v0,
  float u1,
  float v1,
  float xAdvance
) {
  public float hlf;
  public float sep;
  public float bjd;
  public float msl;
  public float wsm;
  public float kih;
  public float qbf;
  public float exdn;
  public float yz;
  // [JNT] MethodHandle dispatch table (removed)
  public pk(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
    this.hlf = var1;
    this.sep = var2;
    this.bjd = var3;
    this.msl = var4;
    this.wsm = var5;
    this.kih = var6;
    this.qbf = var7;
    this.exdn = var8;
    this.yz = var9;
  }

  public float dkd() {
    return null /* jnt:encrypted */;
  }

  public float bav() {
    return null /* jnt:encrypted */;
  }

  public float kam() {
    return null /* jnt:encrypted */;
  }

  public float aux() {
    return null /* jnt:encrypted */;
  }

  public float gpb() {
    return null /* jnt:encrypted */;
  }

  public float zf() {
    return null /* jnt:encrypted */;
  }

  public float td() {
    return null /* jnt:encrypted */;
  }

  public float ojh() {
    return null /* jnt:encrypted */;
  }

  public float wt() {
    return null /* jnt:encrypted */;
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 + 2055519835 ^ 2036560519 ^ 2045390319 ^ 663862770) - 431880463 ^ 258078977) + 2107064215 + 414905957 ^ 86377412;
    MethodHandle var10000 = jlk[(((var10 + 2055519835 ^ 2036560519 ^ 2045390319 ^ 663862770) - 431880463 ^ 258078977) + 2107064215 + 414905957 ^ 86377412)
      - 1460382982];
    if (jlk[var10001 - 1460382982] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (1685995653 | 1685995653) ^ 1685995653; var24 < var14.length(); var24 += (1401965326 - 1401965326 | 1) & 637112133) {
        int var43 = var14.charAt(var24) ^ '\n';
        char var46 = (char)(
          (
              (((((var43 & 65024) >> 9 | var43 << 7) + 240 + 232 - 74 & 64512) >> 10 | ((var43 & 65024) >> 9 | var43 << 7) + 240 + 232 - 74 << 6) & 64512)
                  >> 10
                | ((((var43 & 65024) >> 9 | var43 << 7) + 240 + 232 - 74 & 64512) >> 10 | ((var43 & 65024) >> 9 | var43 << 7) + 240 + 232 - 74 << 6) << 6
            )
            + 32
            - 182
            - 100
        );
        var14.setCharAt(
          var24,
          (char)(
            (
                (((((var43 & 65024) >> 9 | var43 << 7) + 240 + 232 - 74 & 64512) >> 10 | ((var43 & 65024) >> 9 | var43 << 7) + 240 + 232 - 74 << 6) & 64512)
                    >> 10
                  | ((((var43 & 65024) >> 9 | var43 << 7) + 240 + 232 - 74 & 64512) >> 10 | ((var43 & 65024) >> 9 | var43 << 7) + 240 + 232 - 74 << 6) << 6
              )
              + 32
              - 182
              - 100
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = 141586850 + -245546004 ^ -103959154; var30 < var17.length(); var30 += (-117140809 | -117140809) ^ -117140810) {
        int var51 = var17.charAt(var30) - 172 + 8;
        int var84 = (var51 & 63488) >> 11;
        int var52 = (var51 & 63488) >> 11 | var51 << 5;
        int var85 = (((var51 & 63488) >> 11 | var51 << 5) & 64512) >> 10;
        var51 = (((var84 | var51 << 5) & 64512) >> 10 | ((var51 & 63488) >> 11 | var51 << 5) << 6) - 233 + 193 + 72;
        var84 = ((var85 | var52 << 6) - 233 + 193 + 72 & 49152) >> 14;
        int var54 = ((var85 | var52 << 6) - 233 + 193 + 72 & 49152) >> 14 | var51 << 2;
        int var87 = ((((var85 | var52 << 6) - 233 + 193 + 72 & 49152) >> 14 | var51 << 2) & 65504) >> 5;
        char var55 = (char)((((var84 | var51 << 2) & 65504) >> 5 | (((var85 | var52 << 6) - 233 + 193 + 72 & 49152) >> 14 | var51 << 2) << 11) - 252);
        var17.setCharAt(var30, (char)((var87 | var54 << 11) - 252));
      }

      Class var6 = Class.forName(var17.toString(), false, pk.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (1344261705 >>> 641857428 | 0) & 965495404; var36 < var20.length(); var36 += 43876752 + 780768393 ^ 824645144) {
        int var60 = var20.charAt(var36) ^ 253;
        char var63 = (char)(
          (
              (
                    ((((((var60 & 0) >> 16 | var60 << 0) ^ 164) & 0) >> 16 | (((var60 & 0) >> 16 | var60 << 0) ^ 164) << 0) - 94 - 45 & 65024) >> 9
                      | (((((var60 & 0) >> 16 | var60 << 0) ^ 164) & 0) >> 16 | (((var60 & 0) >> 16 | var60 << 0) ^ 164) << 0) - 94 - 45 << 7
                  )
                  - 82
                ^ 35
            )
            + 246
        );
        var20.setCharAt(
          var36,
          (char)(
            (
                (
                      ((((((var60 & 0) >> 16 | var60 << 0) ^ 164) & 0) >> 16 | (((var60 & 0) >> 16 | var60 << 0) ^ 164) << 0) - 94 - 45 & 65024) >> 9
                        | (((((var60 & 0) >> 16 | var60 << 0) ^ 164) & 0) >> 16 | (((var60 & 0) >> 16 | var60 << 0) ^ 164) << 0) - 94 - 45 << 7
                    )
                    - 82
                  ^ 35
              )
              + 246
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), pk.class.getClassLoader()).returnType();
      switch ((((var4 ^ 458851293) + 110340237 ^ 228096167) - 1031078764 ^ 848690131) - 1485604803 - 1876388644 - 1984263853 - 1467194970 - 42451276) {
        case 588185955:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1703793250:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1857382878:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 2066391156:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      jlk[(((var10 + 2055519835 ^ 2036560519 ^ 2045390319 ^ 663862770) - 431880463 ^ 258078977) + 2107064215 + 414905957 ^ 86377412) - 1460382982] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
