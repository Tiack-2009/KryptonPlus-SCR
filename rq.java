// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

public class rq {
  public String ue;
  public String tw;
  public String ckl;
  // [JNT] MethodHandle dispatch table (removed)
  public rq(hn var1, String var2, String var3, String var4) {
    this.ue = var2;
    this.tw = var3;
    this.ckl = var4;
  }

  public String bwz() {
    return null /* jnt:encrypted */;
  }

  public String ypb() {
    return null /* jnt:encrypted */;
  }

  public String yb() {
    return null /* jnt:encrypted */;
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (((var10 + 255715404 ^ 298959812) + 1569992724 + 365209400 ^ 1835960196) + 1325413098 ^ 843543871) - 1128465957 - 1789006697;
    MethodHandle var10000 = nds[(((var10 + 255715404 ^ 298959812) + 1569992724 + 365209400 ^ 1835960196) + 1325413098 ^ 843543871)
      - 1128465957
      - 1789006697
      - 1392962153];
    if (nds[var10001 - 1392962153] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (1144815619 >> 173251762 | 0) & 1429007504; var24 < var14.length(); var24 += (-1296290225 >> (176503898 >> -1296290225) | 0) & 1265797) {
        int var43 = var14.charAt(var24) + 191;
        int var10004 = (var43 & 65534) >> 1;
        int var44 = (var43 & 65534) >> 1 | var43 << 15;
        int var92 = (((var43 & 65534) >> 1 | var43 << 15) & 65504) >> 5;
        var43 = ((var10004 | var43 << 15) & 65504) >> 5 | ((var43 & 65534) >> 1 | var43 << 15) << 11;
        var10004 = ((var92 | var44 << 11) & 32768) >> 15;
        int var46 = ((var92 | var44 << 11) & 32768) >> 15 | var43 << 1;
        int var94 = ((((var92 | var44 << 11) & 32768) >> 15 | var43 << 1) & 32768) >> 15;
        var43 = (((var10004 | var43 << 1) & 32768) >> 15 | (((var92 | var44 << 11) & 32768) >> 15 | var43 << 1) << 1) + 100;
        var10004 = ((var94 | var46 << 1) + 100 & 49152) >> 14;
        int var48 = ((var94 | var46 << 1) + 100 & 49152) >> 14 | var43 << 2;
        int var96 = ((((var94 | var46 << 1) + 100 & 49152) >> 14 | var43 << 2) & 65408) >> 7;
        var43 = ((var10004 | var43 << 2) & 65408) >> 7 | (((var94 | var46 << 1) + 100 & 49152) >> 14 | var43 << 2) << 9;
        var10004 = ((var96 | var48 << 9) & 0) >> 16;
        int var50 = ((var96 | var48 << 9) & 0) >> 16 | var43 << 0;
        int var98 = ((((var96 | var48 << 9) & 0) >> 16 | var43 << 0) & 65534) >> 1;
        char var51 = (char)(((var10004 | var43 << 0) & 65534) >> 1 | (((var96 | var48 << 9) & 0) >> 16 | var43 << 0) << 15);
        var14.setCharAt(var24, (char)(var98 | var50 << 15));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = -134593743 * -1970877503 ^ -56982799; var30 < var17.length(); var30 += (805070204 | -1910165085) ^ -1342343682) {
        int var56 = var17.charAt(var30);
        int var99 = (var56 & 0) >> 16;
        int var57 = ((var56 & 0) >> 16 | var56 << 0) - 221 ^ 220;
        int var100 = ((((var56 & 0) >> 16 | var56 << 0) - 221 ^ 220) & 65024) >> 9;
        var56 = (((var99 | var56 << 0) - 221 ^ 220) & 65024) >> 9 | (((var56 & 0) >> 16 | var56 << 0) - 221 ^ 220) << 7;
        var99 = ((var100 | var57 << 7) & 65535) >> 0;
        int var59 = ((((var100 | var57 << 7) & 65535) >> 0 | var56 << 16) ^ 115) - 86 ^ 30;
        int var102 = ((((((var100 | var57 << 7) & 65535) >> 0 | var56 << 16) ^ 115) - 86 ^ 30) & 32768) >> 15;
        char var60 = (char)(
          (((((var99 | var56 << 16) ^ 115) - 86 ^ 30) & 32768) >> 15 | (((((var100 | var57 << 7) & 65535) >> 0 | var56 << 16) ^ 115) - 86 ^ 30) << 1) ^ 117
        );
        var17.setCharAt(var30, (char)((var102 | var59 << 1) ^ 117));
      }

      Class var6 = Class.forName(var17.toString(), false, rq.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = -1925025795 * (1557578831 << -660937318) ^ 1275068416; var36 < var20.length(); var36 += -218463329 >> -87682737 ^ -6668) {
        int var65 = var20.charAt(var36) - '^' ^ 39;
        char var68 = (char)(
          (
              (
                  (((((var65 & 65528) >> 3 | var65 << 13) + 19 & 65520) >> 4 | ((var65 & 65528) >> 3 | var65 << 13) + 19 << 12) + 111 & 49152) >> 14
                    | ((((var65 & 65528) >> 3 | var65 << 13) + 19 & 65520) >> 4 | ((var65 & 65528) >> 3 | var65 << 13) + 19 << 12) + 111 << 2
                )
                ^ 19
            )
            - 214
            + 132
        );
        var20.setCharAt(
          var36,
          (char)(
            (
                (
                    (((((var65 & 65528) >> 3 | var65 << 13) + 19 & 65520) >> 4 | ((var65 & 65528) >> 3 | var65 << 13) + 19 << 12) + 111 & 49152) >> 14
                      | ((((var65 & 65528) >> 3 | var65 << 13) + 19 & 65520) >> 4 | ((var65 & 65528) >> 3 | var65 << 13) + 19 << 12) + 111 << 2
                  )
                  ^ 19
              )
              - 214
              + 132
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), rq.class.getClassLoader()).returnType();
      switch ((((var4 ^ 161706003) - 1090057675 + 1041133798 + 66871424 + 246709548 - 621584206 ^ 1993507748) - 1388256286 ^ 1677817045) - 1140444599) {
        case 1246720456:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1828378211:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1861480438:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 2032507235:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      nds[(((var10 + 255715404 ^ 298959812) + 1569992724 + 365209400 ^ 1835960196) + 1325413098 ^ 843543871) - 1128465957 - 1789006697 - 1392962153] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
