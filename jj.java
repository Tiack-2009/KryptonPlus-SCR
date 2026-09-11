// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

public class jj {
  public String ue;
  public String bd;
  public boolean bi;
  // [JNT] MethodHandle dispatch table (removed)
  public jj(hn var1, String var2, String var3, boolean var4) {
    this.ue = var2;
    this.bd = var3;
    this.bi = var4;
  }

  public String go() {
    return null /* jnt:encrypted */;
  }

  public String vo() {
    return null /* jnt:encrypted */;
  }

  public boolean jh() {
    return null /* jnt:encrypted */;
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (var10 - 1416341788 + 614189987 - 1668088822 + 860320783 - 1429158827 - 2041284143 + 319475332 ^ 434861877) + 740614428;
    MethodHandle var10000 = lly[(var10 - 1416341788 + 614189987 - 1668088822 + 860320783 - 1429158827 - 2041284143 + 319475332 ^ 434861877)
      + 740614428
      - 550521674];
    if (lly[var10001 - 550521674] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = -179275596 * -179275596 ^ 828980880; var24 < var14.length(); var24 += 129773117 << -760050850 ^ 1073741825) {
        int var43 = var14.charAt(var24);
        int var10004 = (var43 & 65520) >> 4;
        int var44 = (var43 & 65520) >> 4 | var43 << 12;
        int var84 = (((var43 & 65520) >> 4 | var43 << 12) & 57344) >> 13;
        var43 = ((var10004 | var43 << 12) & 57344) >> 13 | ((var43 & 65520) >> 4 | var43 << 12) << 3;
        var10004 = ((var84 | var44 << 3) & 65534) >> 1;
        int var46 = (((var84 | var44 << 3) & 65534) >> 1 | var43 << 15) - 45;
        int var86 = ((((var84 | var44 << 3) & 65534) >> 1 | var43 << 15) - 45 & 65534) >> 1;
        var43 = ((var10004 | var43 << 15) - 45 & 65534) >> 1 | (((var84 | var44 << 3) & 65534) >> 1 | var43 << 15) - 45 << 15;
        var10004 = ((var86 | var46 << 15) & 65535) >> 0;
        int var48 = (((var86 | var46 << 15) & 65535) >> 0 | var43 << 16) ^ 227;
        int var88 = (((((var86 | var46 << 15) & 65535) >> 0 | var43 << 16) ^ 227) & 65534) >> 1;
        char var49 = (char)((((((var10004 | var43 << 16) ^ 227) & 65534) >> 1 | ((((var86 | var46 << 15) & 65535) >> 0 | var43 << 16) ^ 227) << 15) ^ 219) - 25);
        var14.setCharAt(var24, (char)(((var88 | var48 << 15) ^ 219) - 25));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (1193838585 & 896383358 | 0) & 848698503; var30 < var17.length(); var30 += (578454730 << 578454730 | 1) & 94392845) {
        int var54 = var17.charAt(var30) - '#' - 152 ^ 205;
        char var57 = (char)(
          (
                (
                    (((((var54 & 65528) >> 3 | var54 << 13) ^ 254) + 228 ^ 252 ^ 248) & 32768) >> 15
                      | ((((var54 & 65528) >> 3 | var54 << 13) ^ 254) + 228 ^ 252 ^ 248) << 1
                  )
                  & 63488
              )
              >> 11
            | (
                (((((var54 & 65528) >> 3 | var54 << 13) ^ 254) + 228 ^ 252 ^ 248) & 32768) >> 15
                  | ((((var54 & 65528) >> 3 | var54 << 13) ^ 254) + 228 ^ 252 ^ 248) << 1
              )
              << 5
        );
        var17.setCharAt(
          var30,
          (char)(
            (
                  (
                      (((((var54 & 65528) >> 3 | var54 << 13) ^ 254) + 228 ^ 252 ^ 248) & 32768) >> 15
                        | ((((var54 & 65528) >> 3 | var54 << 13) ^ 254) + 228 ^ 252 ^ 248) << 1
                    )
                    & 63488
                )
                >> 11
              | (
                  (((((var54 & 65528) >> 3 | var54 << 13) ^ 254) + 228 ^ 252 ^ 248) & 32768) >> 15
                    | ((((var54 & 65528) >> 3 | var54 << 13) ^ 254) + 228 ^ 252 ^ 248) << 1
                )
                << 5
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, jj.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (1366328505 ^ 243361600 | 0) & 537660418; var36 < var20.length(); var36 += 1754954723 >>> 114138534 ^ 27421166) {
        int var62 = (var20.charAt(var36) ^ 229 ^ 80) + 69 - 122 - 233;
        int var92 = (var62 & 65532) >> 2;
        int var63 = (((var62 & 65532) >> 2 | var62 << 14) + 249 ^ 18) - 42;
        int var93 = ((((var62 & 65532) >> 2 | var62 << 14) + 249 ^ 18) - 42 & 65535) >> 0;
        char var64 = (char)((((var92 | var62 << 14) + 249 ^ 18) - 42 & 65535) >> 0 | (((var62 & 65532) >> 2 | var62 << 14) + 249 ^ 18) - 42 << 16);
        var20.setCharAt(var36, (char)(var93 | var63 << 16));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), jj.class.getClassLoader()).returnType();
      switch ((((var4 ^ 551128979) + 705066899 ^ 1043499155 ^ 1233557098) - 987028739 - 295927864 - 1703630229 ^ 1493843097 ^ 661040621) + 96118023) {
        case 9744202:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 964350371:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1061134650:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1160644239:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      lly[(var10 - 1416341788 + 614189987 - 1668088822 + 860320783 - 1429158827 - 2041284143 + 319475332 ^ 434861877) + 740614428 - 550521674] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
