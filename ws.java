// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import net.minecraft.BlockState;

public class ws extends wus {
  public Map gtr;
  public Map mif;
  public Runnable xo;
  // [JNT] MethodHandle dispatch table (removed)
  public ws(String var1, Map var2) {
    super(var1);
    this.mif = (HashMap)/* jnt */;
    this.gtr = (HashMap)/* jnt */;
  }

  public ws(String var1) {
    this(var1, (HashMap)/* jnt */);
  }

  public Map qx() {
    return null /* jnt:encrypted */;
  }

  public void ube(Map var1) {
    null /* jnt:encrypted *//* jnt */
    );
    if (null /* jnt:encrypted */ != null) {
      /* jnt */
      );
    }
  }

  public Set vjw() {
    return /* jnt */
    );
  }

  public zn hku(class_2248 var1) {
    return (zn)/* jnt */, var1
    );
  }

  public void rau(class_2248 var1, zn var2) {
    /* jnt */,
      var1,
      /* jnt */
    );
    if (null /* jnt:encrypted */ != null) {
      /* jnt */
      );
    }
  }

  public void ea(class_2248 var1, zn var2) {
    /* jnt */,
      var1,
      /* jnt */
    );
    if (null /* jnt:encrypted */ != null) {
      /* jnt */
      );
    }
  }

  public void zb(class_2248 var1) {
    /* jnt */, var1
    );
    if (null /* jnt:encrypted */ != null) {
      /* jnt */
      );
    }
  }

  public boolean or(class_2248 var1) {
    return /* jnt */, var1
    );
  }

  public Map qnh() {
    return null /* jnt:encrypted */;
  }

  public void ft() {
    null /* jnt:encrypted *//* jnt */
      )
    );
  }

  public ws jm(Runnable var1) {
    null /* jnt:encrypted */;
    return this;
  }

  @Override
  public boolean d() {
    return /* jnt */
      )
      && /* jnt */
      );
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 + 886581190 - 1798797273 ^ 125603352) - 949469436 + 1274496134 + 2013557956 - 1098139883 ^ 1015037069) - 528125680;
    MethodHandle var10000 = oql[((var10 + 886581190 - 1798797273 ^ 125603352) - 949469436 + 1274496134 + 2013557956 - 1098139883 ^ 1015037069) - 528125680
      ^ 706747329];
    if (oql[var10001 ^ 706747329] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (-508754999 >>> 1260385296 | 0) & 270605906; var23 < var13.length(); var23 += -1510493889 - 1226646066 ^ 1557827340) {
        char var42 = var13.charAt(var23);
        int var10004 = (var42 & '\uf800') >> 11;
        int var43 = ((var42 & '\uf800') >> 11 | var42 << 5) - 54 - 3;
        int var75 = (((var42 & '\uf800') >> 11 | var42 << 5) - 54 - 3 & 0) >> 16;
        var42 = (char)((((var10004 | var42 << 5) - 54 - 3 & 0) >> 16 | ((var42 & '\uf800') >> 11 | var42 << 5) - 54 - 3 << 0) - 236 - 24 - 119 + 31 + 12 - 228);
        var13.setCharAt(var23, (char)((var75 | var43 << 0) - 236 - 24 - 119 + 31 + 12 - 228));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = (212797480 * -1153947128 | 0) & 1648363027; var29 < var16.length(); var29 += 2039324496 >>> -433338228 ^ 497880) {
        int var49 = (var16.charAt(var29) + 127 - 159 + 16 ^ 200) + 201 ^ 253;
        int var76 = (var49 & 65504) >> 5;
        int var50 = ((var49 & 65504) >> 5 | var49 << 11) + 119;
        int var77 = (((var49 & 65504) >> 5 | var49 << 11) + 119 & 61440) >> 12;
        char var51 = (char)((((var76 | var49 << 11) + 119 & 61440) >> 12 | ((var49 & 65504) >> 5 | var49 << 11) + 119 << 4) ^ 10);
        var16.setCharAt(var29, (char)((var77 | var50 << 4) ^ 10));
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), ws.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = 87625241 >> 87625241 ^ 2; var35 < var19.length(); var35 += (-260725494 >>> -260725494 | 1) & -507363195) {
        int var56 = var19.charAt(var35) + 'v' - 10;
        char var59 = (char)(
          (
              (
                  (((((((var56 & 61440) >> 12 | var56 << 4) ^ 205) & 65534) >> 1 | (((var56 & 61440) >> 12 | var56 << 4) ^ 205) << 15) ^ 214) & 64512) >> 10
                    | ((((((var56 & 61440) >> 12 | var56 << 4) ^ 205) & 65534) >> 1 | (((var56 & 61440) >> 12 | var56 << 4) ^ 205) << 15) ^ 214) << 6
                )
                ^ 226
            )
            - 89
            - 170
        );
        var19.setCharAt(
          var35,
          (char)(
            (
                (
                    (((((((var56 & 61440) >> 12 | var56 << 4) ^ 205) & 65534) >> 1 | (((var56 & 61440) >> 12 | var56 << 4) ^ 205) << 15) ^ 214) & 64512) >> 10
                      | ((((((var56 & 61440) >> 12 | var56 << 4) ^ 205) & 65534) >> 1 | (((var56 & 61440) >> 12 | var56 << 4) ^ 205) << 15) ^ 214) << 6
                  )
                  ^ 226
              )
              - 89
              - 170
          )
        );
      }

      Class var7 = Class.forName(var19.toString(), false, ws.class.getClassLoader());
      switch ((((var4 - 1833736726 + 1559655738 ^ 1668979580) - 787830340 ^ 655313127) + 2027467209 - 2037847511 + 1879503470 ^ 1367406292) + 144730312) {
        case 41935149:
        case 1640174204:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 304917197:
          var10000 = var0.findSpecial(var7, var5, var6, ws.class);
          break;
        case 1573755092:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 1923529799:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    oql[((var10 + 886581190 - 1798797273 ^ 125603352) - 949469436 + 1274496134 + 2013557956 - 1098139883 ^ 1015037069) - 528125680 ^ 706747329] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((((var10 ^ 664268273) + 889361500 ^ 1560603344 ^ 1040158486) + 1645110978 ^ 1075620746) + 639305452 ^ 1141984428) + 1976743547;
    MethodHandle var10000 = oql[((((var10 ^ 664268273) + 889361500 ^ 1560603344 ^ 1040158486) + 1645110978 ^ 1075620746) + 639305452 ^ 1141984428)
      + 1976743547
      - 878489106];
    if (oql[var10001 - 878489106] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = -1361118692 >> 2089308477 ^ -3; var24 < var14.length(); var24 += 642912054 ^ -1499588961 ^ -2134107736) {
        int var43 = var14.charAt(var24) ^ 21;
        int var10004 = (var43 & 63488) >> 11;
        int var44 = ((var43 & 63488) >> 11 | var43 << 5) ^ 171 ^ 145 ^ 118;
        int var84 = ((((var43 & 63488) >> 11 | var43 << 5) ^ 171 ^ 145 ^ 118) & 63488) >> 11;
        var43 = ((((var10004 | var43 << 5) ^ 171 ^ 145 ^ 118) & 63488) >> 11 | (((var43 & 63488) >> 11 | var43 << 5) ^ 171 ^ 145 ^ 118) << 5) - 109;
        var10004 = ((var84 | var44 << 5) - 109 & 61440) >> 12;
        int var46 = (((var84 | var44 << 5) - 109 & 61440) >> 12 | var43 << 4) ^ 245;
        int var86 = (((((var84 | var44 << 5) - 109 & 61440) >> 12 | var43 << 4) ^ 245) & 63488) >> 11;
        char var47 = (char)((((var10004 | var43 << 4) ^ 245) & 63488) >> 11 | ((((var84 | var44 << 5) - 109 & 61440) >> 12 | var43 << 4) ^ 245) << 5);
        var14.setCharAt(var24, (char)(var86 | var46 << 5));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (1388192909 - -755453770 | 0) & 165896; var30 < var17.length(); var30 += (2008828635 + 2008828635 | 1) & 276898377) {
        int var52 = var17.charAt(var30) - 167;
        char var55 = (char)(
          (
                (
                      (
                          (((((var52 & 65504) >> 5 | var52 << 11) ^ 134) + 231 ^ 116 ^ 25) & 65504) >> 5
                            | ((((var52 & 65504) >> 5 | var52 << 11) ^ 134) + 231 ^ 116 ^ 25) << 11
                        )
                        & 65535
                    )
                    >> 0
                  | (
                      (((((var52 & 65504) >> 5 | var52 << 11) ^ 134) + 231 ^ 116 ^ 25) & 65504) >> 5
                        | ((((var52 & 65504) >> 5 | var52 << 11) ^ 134) + 231 ^ 116 ^ 25) << 11
                    )
                    << 16
              )
              + 177
            ^ 244
        );
        var17.setCharAt(
          var30,
          (char)(
            (
                  (
                        (
                            (((((var52 & 65504) >> 5 | var52 << 11) ^ 134) + 231 ^ 116 ^ 25) & 65504) >> 5
                              | ((((var52 & 65504) >> 5 | var52 << 11) ^ 134) + 231 ^ 116 ^ 25) << 11
                          )
                          & 65535
                      )
                      >> 0
                    | (
                        (((((var52 & 65504) >> 5 | var52 << 11) ^ 134) + 231 ^ 116 ^ 25) & 65504) >> 5
                          | ((((var52 & 65504) >> 5 | var52 << 11) ^ 134) + 231 ^ 116 ^ 25) << 11
                      )
                      << 16
                )
                + 177
              ^ 244
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, ws.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (1481947623 >>> (1916406800 ^ 1916406800) | 0) & -1501347832;
        var36 < var20.length();
        var36 += (-1860398906 * 225455110 | 1) & 1266848009
      ) {
        int var60 = var20.charAt(var36);
        int var90 = (var60 & 65408) >> 7;
        int var61 = ((var60 & 65408) >> 7 | var60 << 9) + 190;
        int var91 = (((var60 & 65408) >> 7 | var60 << 9) + 190 & 65408) >> 7;
        var60 = (((var90 | var60 << 9) + 190 & 65408) >> 7 | ((var60 & 65408) >> 7 | var60 << 9) + 190 << 9) + 227;
        var90 = ((var91 | var61 << 9) + 227 & 64512) >> 10;
        int var63 = ((((var91 | var61 << 9) + 227 & 64512) >> 10 | var60 << 6) ^ 156) + 27 - 178;
        int var93 = (((((var91 | var61 << 9) + 227 & 64512) >> 10 | var60 << 6) ^ 156) + 27 - 178 & 65520) >> 4;
        char var64 = (char)(
          ((((var90 | var60 << 6) ^ 156) + 27 - 178 & 65520) >> 4 | ((((var91 | var61 << 9) + 227 & 64512) >> 10 | var60 << 6) ^ 156) + 27 - 178 << 12) + 36
        );
        var20.setCharAt(var36, (char)((var93 | var63 << 12) + 36));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), ws.class.getClassLoader()).returnType();
      switch (((var4 ^ 98821812 ^ 1073348417) - 417862312 + 1685096272 - 1138820709 + 1618933416 ^ 660387417 ^ 1194434098) - 1186416155 - 657991650) {
        case 752888654:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1624260494:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1989426529:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 2094862783:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      oql[((((var10 ^ 664268273) + 889361500 ^ 1560603344 ^ 1040158486) + 1645110978 ^ 1075620746) + 639305452 ^ 1141984428) + 1976743547 - 878489106] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
