// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

public class kc extends wus {
  public boolean px;
  public boolean en;
  // [JNT] MethodHandle dispatch table (removed)
  public kc(String var1, boolean var2) {
    super(var1);
    this.en = var2;
    this.px = var2;
  }

  public void jdt() {
    /* jnt */);
  }

  public boolean tix() {
    return null /* jnt:encrypted */;
  }

  public boolean fqw() {
    return null /* jnt:encrypted */;
  }

  public void uy(boolean var1) {
    null /* jnt:encrypted */;
  }

  @Override
  public boolean d() {
    return null /* jnt:encrypted */ == null /* jnt:encrypted */;
  }

  public kc wr(String var1) {
    /* jnt */;
    return this;
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (var10 - 1287230538 - 248729753 - 1417346817 ^ 2057603631) + 51310255 + 116054983 + 1157074239 - 426161777 ^ 1433968722;
    MethodHandle var10000 = hzq[((var10 - 1287230538 - 248729753 - 1417346817 ^ 2057603631) + 51310255 + 116054983 + 1157074239 - 426161777 ^ 1433968722)
      - 1231650791];
    if (hzq[var10001 - 1231650791] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (230701335 ^ -1033433978 ^ 230701335 >> -1033433978 | 0) & 808077314;
        var23 < var13.length();
        var23 += 1219728453 - 1400438157 ^ -180709703
      ) {
        int var42 = var13.charAt(var23);
        int var10004 = (var42 & 65472) >> 6;
        int var43 = (var42 & 65472) >> 6 | var42 << 10;
        int var97 = (((var42 & 65472) >> 6 | var42 << 10) & 65535) >> 0;
        var42 = ((var10004 | var42 << 10) & 65535) >> 0 | ((var42 & 65472) >> 6 | var42 << 10) << 16;
        var10004 = ((var97 | var43 << 16) & 65024) >> 9;
        int var45 = ((var97 | var43 << 16) & 65024) >> 9 | var42 << 7;
        int var99 = ((((var97 | var43 << 16) & 65024) >> 9 | var42 << 7) & 64512) >> 10;
        var42 = (((var10004 | var42 << 7) & 64512) >> 10 | (((var97 | var43 << 16) & 65024) >> 9 | var42 << 7) << 6) + 29 - 51;
        var10004 = ((var99 | var45 << 6) + 29 - 51 & 57344) >> 13;
        int var47 = ((var99 | var45 << 6) + 29 - 51 & 57344) >> 13 | var42 << 3;
        int var101 = ((((var99 | var45 << 6) + 29 - 51 & 57344) >> 13 | var42 << 3) & 0) >> 16;
        var42 = ((var10004 | var42 << 3) & 0) >> 16 | (((var99 | var45 << 6) + 29 - 51 & 57344) >> 13 | var42 << 3) << 0;
        var10004 = ((var101 | var47 << 0) & 65532) >> 2;
        int var49 = ((var101 | var47 << 0) & 65532) >> 2 | var42 << 14;
        int var103 = ((((var101 | var47 << 0) & 65532) >> 2 | var42 << 14) & 65534) >> 1;
        char var50 = (char)(((var10004 | var42 << 14) & 65534) >> 1 | (((var101 | var47 << 0) & 65532) >> 2 | var42 << 14) << 15);
        var13.setCharAt(var23, (char)(var103 | var49 << 15));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = 1239916344 >>> -1411101568 ^ 1239916344; var29 < var16.length(); var29 += (-2119362741 >>> (-1463796459 >> 1693103644) | 1) & 2130709065) {
        int var55 = var16.charAt(var29);
        int var104 = (var55 & 32768) >> 15;
        int var56 = (var55 & 32768) >> 15 | var55 << 1;
        int var105 = (((var55 & 32768) >> 15 | var55 << 1) & 65534) >> 1;
        var55 = (((var104 | var55 << 1) & 65534) >> 1 | ((var55 & 32768) >> 15 | var55 << 1) << 15) - 44 ^ 109;
        var104 = (((var105 | var56 << 15) - 44 ^ 109) & 65408) >> 7;
        int var58 = ((((var105 | var56 << 15) - 44 ^ 109) & 65408) >> 7 | var55 << 9) - 1 + 81;
        int var107 = (((((var105 | var56 << 15) - 44 ^ 109) & 65408) >> 7 | var55 << 9) - 1 + 81 & 65472) >> 6;
        var55 = ((var104 | var55 << 9) - 1 + 81 & 65472) >> 6 | ((((var105 | var56 << 15) - 44 ^ 109) & 65408) >> 7 | var55 << 9) - 1 + 81 << 10;
        var104 = ((var107 | var58 << 10) & 65532) >> 2;
        int var60 = ((var107 | var58 << 10) & 65532) >> 2 | var55 << 14;
        int var109 = ((((var107 | var58 << 10) & 65532) >> 2 | var55 << 14) & 65472) >> 6;
        char var61 = (char)(((var104 | var55 << 14) & 65472) >> 6 | (((var107 | var58 << 10) & 65532) >> 2 | var55 << 14) << 10);
        var16.setCharAt(var29, (char)(var109 | var60 << 10));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), kc.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = -79822313 >>> -1227665065 ^ 502; var35 < var19.length(); var35 += (360550398 & -673459625 | 1) & -360290015) {
        int var66 = var19.charAt(var35);
        int var110 = (var66 & 57344) >> 13;
        int var67 = (var66 & 57344) >> 13 | var66 << 3;
        int var111 = (((var66 & 57344) >> 13 | var66 << 3) & 32768) >> 15;
        var66 = ((var110 | var66 << 3) & 32768) >> 15 | ((var66 & 57344) >> 13 | var66 << 3) << 1;
        var110 = ((var111 | var67 << 1) & 65528) >> 3;
        int var69 = (((((var111 | var67 << 1) & 65528) >> 3 | var66 << 13) ^ 133) - 197 ^ 61) + 100;
        int var113 = ((((((var111 | var67 << 1) & 65528) >> 3 | var66 << 13) ^ 133) - 197 ^ 61) + 100 & 63488) >> 11;
        char var70 = (char)(
          (
              (
                  ((((var110 | var66 << 13) ^ 133) - 197 ^ 61) + 100 & 63488) >> 11
                    | (((((var111 | var67 << 1) & 65528) >> 3 | var66 << 13) ^ 133) - 197 ^ 61) + 100 << 5
                )
                ^ 166
            )
            - 189
        );
        var19.setCharAt(var35, (char)(((var113 | var69 << 5) ^ 166) - 189));
      }

      Class var7 = Class.forName(var19.toString(), false, kc.class.getClassLoader());
      switch (((var4 + 735704781 + 1139439781 ^ 1178694194 ^ 1631657278) + 1468499012 + 1612903871 ^ 23711558) + 1464936539 ^ 1366375433 ^ 1530714704) {
        case 168521653:
        case 1968787390:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 395722365:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 889143047:
          var10000 = var0.findSpecial(var7, var5, var6, kc.class);
          break;
        case 920711057:
          var10000 = var0.findConstructor(var7, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    hzq[((var10 - 1287230538 - 248729753 - 1417346817 ^ 2057603631) + 51310255 + 116054983 + 1157074239 - 426161777 ^ 1433968722) - 1231650791] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 - 1248219506 + 1981311342 ^ 1110419194) + 1703259573 - 1644085065 ^ 803383879) - 1766409541 - 235747203 ^ 522576746;
    MethodHandle var10000 = hzq[((var10 - 1248219506 + 1981311342 ^ 1110419194) + 1703259573 - 1644085065 ^ 803383879) - 1766409541 - 235747203
      ^ 522576746
      ^ 1973732845];
    if (hzq[var10001 ^ 1973732845] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = -921978608 >>> -526146182 ^ 50; var24 < var14.length(); var24 += (-763310718 >> -763310718 | 1) & 21219345) {
        int var43 = var14.charAt(var24);
        int var10004 = (var43 & 65534) >> 1;
        int var44 = (var43 & 65534) >> 1 | var43 << 15;
        int var80 = (((var43 & 65534) >> 1 | var43 << 15) & 63488) >> 11;
        var43 = (((var10004 | var43 << 15) & 63488) >> 11 | ((var43 & 65534) >> 1 | var43 << 15) << 5) + 192 - 196;
        var10004 = ((var80 | var44 << 5) + 192 - 196 & 65024) >> 9;
        int var46 = (((var80 | var44 << 5) + 192 - 196 & 65024) >> 9 | var43 << 7) ^ 151;
        int var82 = (((((var80 | var44 << 5) + 192 - 196 & 65024) >> 9 | var43 << 7) ^ 151) & 65534) >> 1;
        char var47 = (char)(
          (((((var10004 | var43 << 7) ^ 151) & 65534) >> 1 | ((((var80 | var44 << 5) + 192 - 196 & 65024) >> 9 | var43 << 7) ^ 151) << 15) - 29 ^ 205) + 118
        );
        var14.setCharAt(var24, (char)(((var82 | var46 << 15) - 29 ^ 205) + 118));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = 1171335741 * -1406818716 ^ -35058220; var30 < var17.length(); var30 += 1110415663 ^ 2068699489 ^ 962740303) {
        int var52 = (var17.charAt(var30) ^ 141) - 29 ^ 29 ^ 209;
        char var55 = (char)(
          ((((((var52 & 65472) >> 6 | var52 << 10) - 211 ^ 42) & 49152) >> 14 | (((var52 & 65472) >> 6 | var52 << 10) - 211 ^ 42) << 2) + 196 & 61440) >> 12
            | (((((var52 & 65472) >> 6 | var52 << 10) - 211 ^ 42) & 49152) >> 14 | (((var52 & 65472) >> 6 | var52 << 10) - 211 ^ 42) << 2) + 196 << 4
        );
        var17.setCharAt(
          var30,
          (char)(
            ((((((var52 & 65472) >> 6 | var52 << 10) - 211 ^ 42) & 49152) >> 14 | (((var52 & 65472) >> 6 | var52 << 10) - 211 ^ 42) << 2) + 196 & 61440) >> 12
              | (((((var52 & 65472) >> 6 | var52 << 10) - 211 ^ 42) & 49152) >> 14 | (((var52 & 65472) >> 6 | var52 << 10) - 211 ^ 42) << 2) + 196 << 4
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, kc.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (-2142328532 ^ -189343118 | 0) & 34015232; var36 < var20.length(); var36 += (-525555272 >> -525555272 | 1) & 9) {
        int var60 = var20.charAt(var36) + 152 + 97 - 133 - 12;
        int var86 = (var60 & 65532) >> 2;
        int var61 = (var60 & 65532) >> 2 | var60 << 14;
        int var87 = (((var60 & 65532) >> 2 | var60 << 14) & 65472) >> 6;
        char var62 = (char)((((var86 | var60 << 14) & 65472) >> 6 | ((var60 & 65532) >> 2 | var60 << 14) << 10) - 143 + 48 ^ 197 ^ 141);
        var20.setCharAt(var36, (char)((var87 | var61 << 10) - 143 + 48 ^ 197 ^ 141));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), kc.class.getClassLoader()).returnType();
      switch (((var4 + 1710354218 ^ 1142142519) - 1241586223 - 1149688626 - 935171194 + 28260653 + 332857979 - 5632581 ^ 848262728) - 973379762) {
        case 92276154:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 265909473:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1408924633:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1590168908:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      hzq[((var10 - 1248219506 + 1981311342 ^ 1110419194) + 1703259573 - 1644085065 ^ 803383879) - 1766409541 - 235747203 ^ 522576746 ^ 1973732845] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
