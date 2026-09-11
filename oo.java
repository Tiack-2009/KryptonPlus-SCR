// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import dev.krypton.jnt3.Loader;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashSet;
import net.minecraft.BlockState;

public class oo extends HashSet<class_2248> {
  // [JNT] MethodHandle dispatch table (removed)
  public oo(es var1) {
    this.vjb = var1;
    super();
    /* jnt */
    );
    /* jnt */
    );
    /* jnt */
    );
    /* jnt */
    );
    /* jnt */
    );
    /* jnt */
    );
    /* jnt */
    );
    /* jnt */
    );
    /* jnt */
    );
    /* jnt */
    );
  }

  static {
    Loader.init(oo.class);
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (((var10 - 870877380 ^ 1642980120) + 224410263 + 1234943042 ^ 364131530) - 767326715 ^ 1396701393) - 1266334965 + 276661541;
    MethodHandle var10000 = qaa[(((var10 - 870877380 ^ 1642980120) + 224410263 + 1234943042 ^ 364131530) - 767326715 ^ 1396701393) - 1266334965 + 276661541
      ^ 1715979995];
    if (qaa[var10001 ^ 1715979995] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (1220828180 >>> -232161828 | 0) & -207818551; var23 < var13.length(); var23 += (1766102363 & -79353573 | 0) & -2043501339) {
        int var42 = var13.charAt(var23) + 213 - 44;
        int var10004 = (var42 & 49152) >> 14;
        int var43 = (var42 & 49152) >> 14 | var42 << 2;
        int var83 = (((var42 & 49152) >> 14 | var42 << 2) & 65535) >> 0;
        var42 = ((var10004 | var42 << 2) & 65535) >> 0 | ((var42 & 49152) >> 14 | var42 << 2) << 16;
        var10004 = ((var83 | var43 << 16) & 65534) >> 1;
        int var45 = ((var83 | var43 << 16) & 65534) >> 1 | var42 << 15;
        int var85 = ((((var83 | var43 << 16) & 65534) >> 1 | var42 << 15) & 65024) >> 9;
        var42 = ((var10004 | var42 << 15) & 65024) >> 9 | (((var83 | var43 << 16) & 65534) >> 1 | var42 << 15) << 7;
        var10004 = ((var85 | var45 << 7) & 65024) >> 9;
        int var47 = ((var85 | var45 << 7) & 65024) >> 9 | var42 << 7;
        int var87 = ((((var85 | var45 << 7) & 65024) >> 9 | var42 << 7) & 63488) >> 11;
        char var48 = (char)((((var10004 | var42 << 7) & 63488) >> 11 | (((var85 | var45 << 7) & 65024) >> 9 | var42 << 7) << 5) - 5 + 219);
        var13.setCharAt(var23, (char)((var87 | var47 << 5) - 5 + 219));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = 1630152072 >> -170776160 ^ 1630152072; var29 < var16.length(); var29 += (1910421781 | 917388905 | 0) & 134283265) {
        char var53 = var16.charAt(var29);
        char var56 = (char)(
          (
              ((((((var53 & '￠') >> 5 | var53 << 11) & 49152) >> 14 | ((var53 & '￠') >> 5 | var53 << 11) << 2) + 220 ^ 103) + 108 & 65528) >> 3
                | (((((var53 & '￠') >> 5 | var53 << 11) & 49152) >> 14 | ((var53 & '￠') >> 5 | var53 << 11) << 2) + 220 ^ 103) + 108 << 13
            )
            - 82
            + 47
            - 253
            - 27
        );
        var16.setCharAt(
          var29,
          (char)(
            (
                ((((((var53 & '￠') >> 5 | var53 << 11) & 49152) >> 14 | ((var53 & '￠') >> 5 | var53 << 11) << 2) + 220 ^ 103) + 108 & 65528) >> 3
                  | (((((var53 & '￠') >> 5 | var53 << 11) & 49152) >> 14 | ((var53 & '￠') >> 5 | var53 << 11) << 2) + 220 ^ 103) + 108 << 13
              )
              - 82
              + 47
              - 253
              - 27
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), oo.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = (-521474762 | -434251317 | 374465922 | 0) & 150994944;
        var35 < var19.length();
        var35 += -734301848 * (-1149663204 + 557929592) ^ -1922895839
      ) {
        int var61 = (var19.charAt(var35) + 199 + 80 ^ 142) - 51;
        int var91 = (var61 & 61440) >> 12;
        int var62 = ((var61 & 61440) >> 12 | var61 << 4) - 212 + 247 - 4 + 28;
        int var92 = (((var61 & 61440) >> 12 | var61 << 4) - 212 + 247 - 4 + 28 & 65472) >> 6;
        char var63 = (char)(((var91 | var61 << 4) - 212 + 247 - 4 + 28 & 65472) >> 6 | ((var61 & 61440) >> 12 | var61 << 4) - 212 + 247 - 4 + 28 << 10);
        var19.setCharAt(var35, (char)(var92 | var62 << 10));
      }

      Class var7 = Class.forName(var19.toString(), false, oo.class.getClassLoader());
      switch ((var4 - 705039420 + 1374147963 ^ 929028157) + 1697575540 - 1743758239 + 1427464860 + 1263639785 + 1921649698 - 1005903785 + 1627422320) {
        case 859072525:
          var10000 = var0.findSpecial(var7, var5, var6, oo.class);
          break;
        case 1159430009:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 1203327042:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 1531847431:
        case 1751575944:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    qaa[(((var10 - 870877380 ^ 1642980120) + 224410263 + 1234943042 ^ 364131530) - 767326715 ^ 1396701393) - 1266334965 + 276661541 ^ 1715979995] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (var10 - 1897481791 ^ 1696945513 ^ 1290286976 ^ 11195504) + 863231648 - 1669349268 + 830376540 - 1357563804 + 1732646720;
    MethodHandle var10000 = qaa[(var10 - 1897481791 ^ 1696945513 ^ 1290286976 ^ 11195504)
      + 863231648
      - 1669349268
      + 830376540
      - 1357563804
      + 1732646720
      + 214943890];
    if (qaa[var10001 + 214943890] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (-646580644 >>> -1842298894 | 0) & -1495758462; var24 < var14.length(); var24 += (290452376 | 290452376 | 1) & -1064304575) {
        int var43 = (var14.charAt(var24) ^ '\n') - 57 + 150;
        int var10004 = (var43 & 65532) >> 2;
        int var44 = (var43 & 65532) >> 2 | var43 << 14;
        int var90 = (((var43 & 65532) >> 2 | var43 << 14) & 63488) >> 11;
        var43 = ((var10004 | var43 << 14) & 63488) >> 11 | ((var43 & 65532) >> 2 | var43 << 14) << 5;
        var10004 = ((var90 | var44 << 5) & 32768) >> 15;
        int var46 = ((var90 | var44 << 5) & 32768) >> 15 | var43 << 1;
        int var92 = ((((var90 | var44 << 5) & 32768) >> 15 | var43 << 1) & 65520) >> 4;
        char var47 = (char)((((var10004 | var43 << 1) & 65520) >> 4 | (((var90 | var44 << 5) & 32768) >> 15 | var43 << 1) << 12) - 116 - 180 - 133);
        var14.setCharAt(var24, (char)((var92 | var46 << 12) - 116 - 180 - 133));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = 577824309 << 577824309 ^ -962592768; var30 < var17.length(); var30 += -1023006567 + -1023006567 ^ -2046013133) {
        int var52 = var17.charAt(var30);
        int var93 = (var52 & 61440) >> 12;
        int var53 = (var52 & 61440) >> 12 | var52 << 4;
        int var94 = (((var52 & 61440) >> 12 | var52 << 4) & 65534) >> 1;
        var52 = (((var93 | var52 << 4) & 65534) >> 1 | ((var52 & 61440) >> 12 | var52 << 4) << 15) ^ 103;
        var93 = (((var94 | var53 << 15) ^ 103) & 61440) >> 12;
        int var55 = (((var94 | var53 << 15) ^ 103) & 61440) >> 12 | var52 << 4;
        int var96 = (((((var94 | var53 << 15) ^ 103) & 61440) >> 12 | var52 << 4) & 65408) >> 7;
        var52 = ((var93 | var52 << 4) & 65408) >> 7 | ((((var94 | var53 << 15) ^ 103) & 61440) >> 12 | var52 << 4) << 9;
        var93 = ((var96 | var55 << 9) & 65534) >> 1;
        int var57 = (((var96 | var55 << 9) & 65534) >> 1 | var52 << 15) + 240 + 120 - 67;
        int var98 = ((((var96 | var55 << 9) & 65534) >> 1 | var52 << 15) + 240 + 120 - 67 & 65528) >> 3;
        char var58 = (char)(((var93 | var52 << 15) + 240 + 120 - 67 & 65528) >> 3 | (((var96 | var55 << 9) & 65534) >> 1 | var52 << 15) + 240 + 120 - 67 << 13);
        var17.setCharAt(var30, (char)(var98 | var57 << 13));
      }

      Class var6 = Class.forName(var17.toString(), false, oo.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (-304427911 & -304427911 - (-304427911 << -304427911) | 0) & 337911812;
        var36 < var20.length();
        var36 += (-305218456 >>> 227812870 | 0) & 2013315335
      ) {
        int var63 = var20.charAt(var36) ^ 20;
        int var99 = (var63 & 61440) >> 12;
        int var64 = (var63 & 61440) >> 12 | var63 << 4;
        int var100 = (((var63 & 61440) >> 12 | var63 << 4) & 65534) >> 1;
        var63 = ((((var99 | var63 << 4) & 65534) >> 1 | ((var63 & 61440) >> 12 | var63 << 4) << 15) ^ 144) + 185;
        var99 = (((var100 | var64 << 15) ^ 144) + 185 & 32768) >> 15;
        int var66 = ((((var100 | var64 << 15) ^ 144) + 185 & 32768) >> 15 | var63 << 1) + 113;
        int var102 = (((((var100 | var64 << 15) ^ 144) + 185 & 32768) >> 15 | var63 << 1) + 113 & 65504) >> 5;
        char var67 = (char)(
          (((var99 | var63 << 1) + 113 & 65504) >> 5 | ((((var100 | var64 << 15) ^ 144) + 185 & 32768) >> 15 | var63 << 1) + 113 << 11) - 126 - 167
        );
        var20.setCharAt(var36, (char)((var102 | var66 << 11) - 126 - 167));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), oo.class.getClassLoader()).returnType();
      switch (((var4 - 963454551 + 1727297026 - 533993089 - 1872762962 ^ 1206419141) + 2014653416 + 667952064 ^ 488938416) - 2083331836 + 543407238) {
        case 279958082:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 776387058:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 843541149:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1822968422:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      qaa[(var10 - 1897481791 ^ 1696945513 ^ 1290286976 ^ 11195504) + 863231648 - 1669349268 + 830376540 - 1357563804 + 1732646720 + 214943890] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }

  public static native void guard();
}
