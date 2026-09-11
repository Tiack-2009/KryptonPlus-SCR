// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.class_1113;
import net.minecraft.Item;
import net.minecraft.ItemStack;
import net.minecraft.Text;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class vc {
  @NotNull
  public class_2561 tn;
  @Nullable
  public class_2561 rvy;
  @Nullable
  public class_1799 yoq;
  @Nullable
  public class_1113 cq = null /* jnt:encrypted */;
  public long chp = 6000L;
  // [JNT] MethodHandle dispatch table (removed)
  public vc(@NotNull String var1) {
    this.tn = /* jnt */,
      /* jnt */,
        /* jnt */
        )
      )
    );
  }

  public vc uly(@Nullable String var1) {
    null /* jnt:encrypted */
        ? /* jnt */,
          /* jnt */,
            /* jnt */
            )
          )
        )
        : null
    );
    return this;
  }

  public vc ban(@Nullable class_1792 var1) {
    null /* jnt:encrypted */;
    return this;
  }

  public vc dbv(@Nullable class_1113 var1) {
    null /* jnt:encrypted */;
    return this;
  }

  public vc ggf(long var1) {
    null /* jnt:encrypted */;
    return this;
  }

  public cc tsy() {
    return (cc)/* jnt */;
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (var10 + 984978214 + 1876931464 ^ 1635494746) + 562709779 + 915026325 + 1174827908 - 2126192537 - 1834285264 + 627860622;
    MethodHandle var10000 = fxn[(var10 + 984978214 + 1876931464 ^ 1635494746)
      + 562709779
      + 915026325
      + 1174827908
      - 2126192537
      - 1834285264
      + 627860622
      + 304361645];
    if (fxn[var10001 + 304361645] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = 489690381 - 489690381 ^ 0; var23 < var13.length(); var23 += (-1000635907 & -529185048 | 1) & 822511105) {
        int var42 = var13.charAt(var23) + 'A' ^ 60;
        int var10004 = (var42 & 65532) >> 2;
        int var43 = ((var42 & 65532) >> 2 | var42 << 14) + 149 ^ 232;
        int var83 = ((((var42 & 65532) >> 2 | var42 << 14) + 149 ^ 232) & 63488) >> 11;
        var42 = (((var10004 | var42 << 14) + 149 ^ 232) & 63488) >> 11 | (((var42 & 65532) >> 2 | var42 << 14) + 149 ^ 232) << 5;
        var10004 = ((var83 | var43 << 5) & 63488) >> 11;
        int var45 = (((var83 | var43 << 5) & 63488) >> 11 | var42 << 5) + 152;
        int var85 = ((((var83 | var43 << 5) & 63488) >> 11 | var42 << 5) + 152 & 64512) >> 10;
        char var46 = (char)((((var10004 | var42 << 5) + 152 & 64512) >> 10 | (((var83 | var43 << 5) & 63488) >> 11 | var42 << 5) + 152 << 6) - 29);
        var13.setCharAt(var23, (char)((var85 | var45 << 6) - 29));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = 899850430 << 1049895781 ^ -1269557312; var29 < var16.length(); var29 += (2123963883 | 2123963883) ^ 2123963882) {
        char var51 = var16.charAt(var29);
        char var54 = (char)(
          (
                (
                    ((((var51 & '쀀') >> 14 | var51 << 2) + 48 - 10 & 65532) >> 2 | ((var51 & '쀀') >> 14 | var51 << 2) + 48 - 10 << 14) + 14 - 165 + 227 - 182
                      ^ 188
                  )
                  & 49152
              )
              >> 14
            | (((((var51 & '쀀') >> 14 | var51 << 2) + 48 - 10 & 65532) >> 2 | ((var51 & '쀀') >> 14 | var51 << 2) + 48 - 10 << 14) + 14 - 165 + 227 - 182 ^ 188)
              << 2
        );
        var16.setCharAt(
          var29,
          (char)(
            (
                  (
                      ((((var51 & '쀀') >> 14 | var51 << 2) + 48 - 10 & 65532) >> 2 | ((var51 & '쀀') >> 14 | var51 << 2) + 48 - 10 << 14) + 14 - 165 + 227 - 182
                        ^ 188
                    )
                    & 49152
                )
                >> 14
              | (
                  ((((var51 & '쀀') >> 14 | var51 << 2) + 48 - 10 & 65532) >> 2 | ((var51 & '쀀') >> 14 | var51 << 2) + 48 - 10 << 14) + 14 - 165 + 227 - 182
                    ^ 188
                )
                << 2
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), vc.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = -533023112 * 1050977020 ^ -702312928; var35 < var19.length(); var35 += (1415928342 >> (-1521826134 << 1943049143) | 1) & 50897249) {
        int var59 = var19.charAt(var35);
        int var89 = (var59 & 65472) >> 6;
        int var60 = ((var59 & 65472) >> 6 | var59 << 10) - 199 ^ 68;
        int var90 = ((((var59 & 65472) >> 6 | var59 << 10) - 199 ^ 68) & 65534) >> 1;
        var59 = (((var89 | var59 << 10) - 199 ^ 68) & 65534) >> 1 | (((var59 & 65472) >> 6 | var59 << 10) - 199 ^ 68) << 15;
        var89 = ((var90 | var60 << 15) & 65535) >> 0;
        int var62 = ((var90 | var60 << 15) & 65535) >> 0 | var59 << 16;
        int var92 = ((((var90 | var60 << 15) & 65535) >> 0 | var59 << 16) & 64512) >> 10;
        char var63 = (char)(((((var89 | var59 << 16) & 64512) >> 10 | (((var90 | var60 << 15) & 65535) >> 0 | var59 << 16) << 6) + 23 ^ 81) + 117 + 248);
        var19.setCharAt(var35, (char)(((var92 | var62 << 6) + 23 ^ 81) + 117 + 248));
      }

      Class var7 = Class.forName(var19.toString(), false, vc.class.getClassLoader());
      switch (((var4 + 806253827 - 549837148 + 264529421 ^ 24314175) - 507362305 ^ 1764884176 ^ 3586123) + 1929475295 ^ 343073875 ^ 1509358782) {
        case 45328015:
          var10000 = var0.findSpecial(var7, var5, var6, vc.class);
          break;
        case 1055236167:
        case 1870135779:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1113227541:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 1141727858:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    fxn[(var10 + 984978214 + 1876931464 ^ 1635494746) + 562709779 + 915026325 + 1174827908 - 2126192537 - 1834285264 + 627860622 + 304361645] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 ^ 1278427290) - 488310281 - 1528610189 ^ 385020102) - 355567131 - 1853666177 + 1684952143 - 959129779 + 640177152;
    MethodHandle var10000 = fxn[((var10 ^ 1278427290) - 488310281 - 1528610189 ^ 385020102)
      - 355567131
      - 1853666177
      + 1684952143
      - 959129779
      + 640177152
      - 1323075133];
    if (fxn[var10001 - 1323075133] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = (1514815897 >> -574428836 | 0) & 892829314; var24 < var14.length(); var24 += -1913717201 & -1103565444 ^ -1943475155) {
        int var43 = var14.charAt(var24) + '@' + 129 - 116 - 190 - 92;
        int var10004 = (var43 & 63488) >> 11;
        int var44 = (((var43 & 63488) >> 11 | var43 << 5) ^ 15) - 130;
        int var80 = ((((var43 & 63488) >> 11 | var43 << 5) ^ 15) - 130 & 65535) >> 0;
        char var45 = (char)(((((var10004 | var43 << 5) ^ 15) - 130 & 65535) >> 0 | (((var43 & 63488) >> 11 | var43 << 5) ^ 15) - 130 << 16) ^ 247);
        var14.setCharAt(var24, (char)((var80 | var44 << 16) ^ 247));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = 137406286 >> 137406286 ^ 8386; var30 < var17.length(); var30 += -76407720 & -76407720 ^ -76407719) {
        int var50 = var17.charAt(var30) + '5';
        int var81 = (var50 & 65472) >> 6;
        int var51 = (((var50 & 65472) >> 6 | var50 << 10) - 45 ^ 66) - 148 + 53 + 233;
        int var82 = ((((var50 & 65472) >> 6 | var50 << 10) - 45 ^ 66) - 148 + 53 + 233 & 65535) >> 0;
        char var52 = (char)(
          ((((var81 | var50 << 10) - 45 ^ 66) - 148 + 53 + 233 & 65535) >> 0 | (((var50 & 65472) >> 6 | var50 << 10) - 45 ^ 66) - 148 + 53 + 233 << 16)
            - 83
            - 170
        );
        var17.setCharAt(var30, (char)((var82 | var51 << 16) - 83 - 170));
      }

      Class var6 = Class.forName(var17.toString(), false, vc.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (295660064 >>> 1295707759 | 0) & -1582868288; var36 < var20.length(); var36 += -1766841384 >> -472478412 ^ -1686) {
        char var57 = var20.charAt(var36);
        char var62 = (char)(
          (
                (
                      (
                          (
                                (
                                    (((((var57 & '￼') >> 2 | var57 << 14) & 63488) >> 11 | ((var57 & '￼') >> 2 | var57 << 14) << 5) + 177 - 170 & 49152) >> 14
                                      | ((((var57 & '￼') >> 2 | var57 << 14) & 63488) >> 11 | ((var57 & '￼') >> 2 | var57 << 14) << 5) + 177 - 170 << 2
                                  )
                                  & 64512
                              )
                              >> 10
                            | (
                                (((((var57 & '￼') >> 2 | var57 << 14) & 63488) >> 11 | ((var57 & '￼') >> 2 | var57 << 14) << 5) + 177 - 170 & 49152) >> 14
                                  | ((((var57 & '￼') >> 2 | var57 << 14) & 63488) >> 11 | ((var57 & '￼') >> 2 | var57 << 14) << 5) + 177 - 170 << 2
                              )
                              << 6
                        )
                        & 65532
                    )
                    >> 2
                  | (
                      (
                            (
                                (((((var57 & '￼') >> 2 | var57 << 14) & 63488) >> 11 | ((var57 & '￼') >> 2 | var57 << 14) << 5) + 177 - 170 & 49152) >> 14
                                  | ((((var57 & '￼') >> 2 | var57 << 14) & 63488) >> 11 | ((var57 & '￼') >> 2 | var57 << 14) << 5) + 177 - 170 << 2
                              )
                              & 64512
                          )
                          >> 10
                        | (
                            (((((var57 & '￼') >> 2 | var57 << 14) & 63488) >> 11 | ((var57 & '￼') >> 2 | var57 << 14) << 5) + 177 - 170 & 49152) >> 14
                              | ((((var57 & '￼') >> 2 | var57 << 14) & 63488) >> 11 | ((var57 & '￼') >> 2 | var57 << 14) << 5) + 177 - 170 << 2
                          )
                          << 6
                    )
                    << 14
              )
              + 90
              + 249
            ^ 164
        );
        var20.setCharAt(
          var36,
          (char)(
            (
                  (
                        (
                            (
                                  (
                                      (((((var57 & '￼') >> 2 | var57 << 14) & 63488) >> 11 | ((var57 & '￼') >> 2 | var57 << 14) << 5) + 177 - 170 & 49152)
                                          >> 14
                                        | ((((var57 & '￼') >> 2 | var57 << 14) & 63488) >> 11 | ((var57 & '￼') >> 2 | var57 << 14) << 5) + 177 - 170 << 2
                                    )
                                    & 64512
                                )
                                >> 10
                              | (
                                  (((((var57 & '￼') >> 2 | var57 << 14) & 63488) >> 11 | ((var57 & '￼') >> 2 | var57 << 14) << 5) + 177 - 170 & 49152) >> 14
                                    | ((((var57 & '￼') >> 2 | var57 << 14) & 63488) >> 11 | ((var57 & '￼') >> 2 | var57 << 14) << 5) + 177 - 170 << 2
                                )
                                << 6
                          )
                          & 65532
                      )
                      >> 2
                    | (
                        (
                              (
                                  (((((var57 & '￼') >> 2 | var57 << 14) & 63488) >> 11 | ((var57 & '￼') >> 2 | var57 << 14) << 5) + 177 - 170 & 49152) >> 14
                                    | ((((var57 & '￼') >> 2 | var57 << 14) & 63488) >> 11 | ((var57 & '￼') >> 2 | var57 << 14) << 5) + 177 - 170 << 2
                                )
                                & 64512
                            )
                            >> 10
                          | (
                              (((((var57 & '￼') >> 2 | var57 << 14) & 63488) >> 11 | ((var57 & '￼') >> 2 | var57 << 14) << 5) + 177 - 170 & 49152) >> 14
                                | ((((var57 & '￼') >> 2 | var57 << 14) & 63488) >> 11 | ((var57 & '￼') >> 2 | var57 << 14) << 5) + 177 - 170 << 2
                            )
                            << 6
                      )
                      << 14
                )
                + 90
                + 249
              ^ 164
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), vc.class.getClassLoader()).returnType();
      switch (((var4 + 2019888864 ^ 621901530) + 370344424 - 1031844029 + 1577255498 + 1389383446 + 1292321690 ^ 2107605317 ^ 1387852721) - 1229870285) {
        case 280638399:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 395280966:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1476444032:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1988422880:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      fxn[((var10 ^ 1278427290) - 488310281 - 1528610189 ^ 385020102) - 355567131 - 1853666177 + 1684952143 - 959129779 + 640177152 - 1323075133] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
