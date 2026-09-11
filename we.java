// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.EnchantmentHelper;
import net.minecraft.ClientPlayerEntity;
import net.minecraft.Vec3d;
import net.minecraft.class_3966;
import net.minecraft.ChunkLightProvider.class_5908;

public class we implements class_5908 {
  // [JNT] MethodHandle dispatch table (removed)
  public we(tl var1) {
    this.snd = var1;
    super();
  }

  public void method_34219(class_1268 var1) {
  }

  public void method_34220(class_1268 var1, class_243 var2) {
  }
  public void method_34218() {
    int var2 = -1875901386;
    if (null /* jnt:encrypted */
      )
      != null) {
      if (/* jnt */)
          )
        )
        == null /* jnt:encrypted */
        )
       {
        class_3966 var1 = (class_3966)null /* jnt:encrypted */
        );
        if (/* jnt */ instanceof class_1657
          )
         {
          null /* jnt:encrypted */,
            (ClientPlayerEntity)/* jnt */
          );
          null /* jnt:encrypted */,
            /* jnt */
          );
          null /* jnt:encrypted */;
          null /* jnt:encrypted */,
            /* jnt */)
              )
              + /* jnt */)
              )
          );
        }

        var2 = (687554588 | -403093825) ^ -1932530651;
      } else {
        var2 = 442526793 - 1556236121 ^ 108494382;
      }
    } else {
      var2 = 442526793 - 1556236121 ^ 108494382;
    }

    while (true) {
      switch ((var2 + 547020109 - 998683589 - 2094024820 + 1721092739 ^ 400264586) - 1728206166) {
        case -1093433755:
          return;
        case 907425449:
      }

      if (null /* jnt:encrypted */
      ) instanceof class_1657) {
        null /* jnt:encrypted */,
          (ClientPlayerEntity)null /* jnt:encrypted */
          )
        );
        null /* jnt:encrypted */,
          /* jnt */
        );
        null /* jnt:encrypted */;
        null /* jnt:encrypted */,
          /* jnt */)
            )
            + /* jnt */)
            )
        );
      }

      var2 = (687554588 | -403093825) ^ -1932530651;
    }
  }

  public static Object _/* $VF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    int var10 = (Integer)var3[4];
    int var10001 = (var10 + 1252737964 - 295051255 ^ 1900837495 ^ 15071939) + 1102660736 - 1373899625 - 684594826 + 2083851888 + 2051562355;
    MethodHandle var10000 = mgj[(var10 + 1252737964 - 295051255 ^ 1900837495 ^ 15071939) + 1102660736 - 1373899625 - 684594826 + 2083851888 + 2051562355
      ^ 800729723];
    if (mgj[var10001 ^ 800729723] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var13 = new StringBuilder((String)var3[1]);

      for (int var23 = (-1262728767 + -961130475 | 0) & -2147129816; var23 < var13.length(); var23 += (-1254786541 >> 1342038084 | 1) & 11305035) {
        int var42 = var13.charAt(var23) + 7 - 47;
        int var10004 = (var42 & 65534) >> 1;
        int var43 = (var42 & 65534) >> 1 | var42 << 15;
        int var81 = (((var42 & 65534) >> 1 | var42 << 15) & 0) >> 16;
        var42 = ((((var10004 | var42 << 15) & 0) >> 16 | ((var42 & 65534) >> 1 | var42 << 15) << 0) ^ 105) - 37;
        var10004 = (((var81 | var43 << 0) ^ 105) - 37 & 65408) >> 7;
        int var45 = (((var81 | var43 << 0) ^ 105) - 37 & 65408) >> 7 | var42 << 9;
        int var83 = (((((var81 | var43 << 0) ^ 105) - 37 & 65408) >> 7 | var42 << 9) & 64512) >> 10;
        char var46 = (char)((((var10004 | var42 << 9) & 64512) >> 10 | ((((var81 | var43 << 0) ^ 105) - 37 & 65408) >> 7 | var42 << 9) << 6) - 218 + 91);
        var13.setCharAt(var23, (char)((var83 | var45 << 6) - 218 + 91));
      }

      String var5 = var13.toString();
      StringBuilder var16 = new StringBuilder((String)var3[2]);

      for (int var29 = 1351332879 << 1652839725 ^ 1988222976; var29 < var16.length(); var29 += -774830953 + -774830953 ^ -1549661905) {
        int var51 = (var16.charAt(var29) ^ 'd') + 113;
        char var54 = (char)(
          (
              ((((((var51 & 57344) >> 13 | var51 << 3) ^ 178 ^ 193) & 61440) >> 12 | (((var51 & 57344) >> 13 | var51 << 3) ^ 178 ^ 193) << 4) & 65024) >> 9
                | (((((var51 & 57344) >> 13 | var51 << 3) ^ 178 ^ 193) & 61440) >> 12 | (((var51 & 57344) >> 13 | var51 << 3) ^ 178 ^ 193) << 4) << 7
            )
            - 70
            + 32
            - 213
        );
        var16.setCharAt(
          var29,
          (char)(
            (
                ((((((var51 & 57344) >> 13 | var51 << 3) ^ 178 ^ 193) & 61440) >> 12 | (((var51 & 57344) >> 13 | var51 << 3) ^ 178 ^ 193) << 4) & 65024) >> 9
                  | (((((var51 & 57344) >> 13 | var51 << 3) ^ 178 ^ 193) & 61440) >> 12 | (((var51 & 57344) >> 13 | var51 << 3) ^ 178 ^ 193) << 4) << 7
              )
              - 70
              + 32
              - 213
          )
        );
      }

      MethodType var6 = MethodType.fromMethodDescriptorString(var16.toString(), we.class.getClassLoader());
      StringBuilder var19 = new StringBuilder((String)var3[3]);

      for (int var35 = 551143605 >>> -1947961374 ^ 137785901; var35 < var19.length(); var35 += -134336864 - 1118517160 ^ -1252854023) {
        int var59 = var19.charAt(var35) + 195 + 232;
        char var62 = (char)(
          (
              (
                    (((((var59 & 65532) >> 2 | var59 << 14) & 65528) >> 3 | ((var59 & 65532) >> 2 | var59 << 14) << 13) - 207 & 65472) >> 6
                      | ((((var59 & 65532) >> 2 | var59 << 14) & 65528) >> 3 | ((var59 & 65532) >> 2 | var59 << 14) << 13) - 207 << 10
                  )
                  - 35
                ^ 57
            )
            + 171
            - 231
        );
        var19.setCharAt(
          var35,
          (char)(
            (
                (
                      (((((var59 & 65532) >> 2 | var59 << 14) & 65528) >> 3 | ((var59 & 65532) >> 2 | var59 << 14) << 13) - 207 & 65472) >> 6
                        | ((((var59 & 65532) >> 2 | var59 << 14) & 65528) >> 3 | ((var59 & 65532) >> 2 | var59 << 14) << 13) - 207 << 10
                    )
                    - 35
                  ^ 57
              )
              + 171
              - 231
          )
        );
      }

      Class var7 = Class.forName(var19.toString(), false, we.class.getClassLoader());
      switch ((var4 + 1901345757 ^ 300724550) - 1467530318 + 1329677741 + 2004832871 + 301390083 - 2010877048 - 539318995 + 905031095 - 215357933) {
        case 466021645:
          var10000 = var0.findStatic(var7, var5, var6);
          break;
        case 1095638758:
        case 1684003249:
          var10000 = var0.findVirtual(var7, var5, var6);
          break;
        case 1122585575:
          var10000 = var0.findConstructor(var7, var6);
          break;
        case 1876646284:
          var10000 = var0.findSpecial(var7, var5, var6, we.class);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    mgj[(var10 + 1252737964 - 295051255 ^ 1900837495 ^ 15071939) + 1102660736 - 1373899625 - 684594826 + 2083851888 + 2051562355 ^ 800729723] = var10000;
    MethodHandle var11 = var10000.asType(var2);
    return new MutableCallSite(var11);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (((var10 + 1861459599 ^ 1259208552) - 781109568 ^ 1864006113 ^ 1111186926) - 609654321 ^ 141912839) + 1525324810 ^ 2012988267;
    MethodHandle var10000 = mgj[((((var10 + 1861459599 ^ 1259208552) - 781109568 ^ 1864006113 ^ 1111186926) - 609654321 ^ 141912839) + 1525324810 ^ 2012988267)
      + 650542947];
    if (mgj[var10001 + 650542947] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = -791108396 ^ -1615932887 ^ 1333163773;
        var24 < var14.length();
        var24 += -1253320377 + (-1004202647 << (-1253320377 | -1004202647)) ^ 1073764678
      ) {
        int var43 = var14.charAt(var24) + 228 + 137 - 162 - 101 - 251 - 105 + 50;
        char var44 = (char)(((var43 & 0) >> 16 | var43 << 0) - 249 + 209);
        var14.setCharAt(var24, (char)(((var43 & 0) >> 16 | var43 << 0) - 249 + 209));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = -2016713824 >> -2016713824 ^ -2016713824; var30 < var17.length(); var30 += (-1856535507 | 1449187821) ^ -680010260) {
        char var49 = var17.charAt(var30);
        char var54 = (char)(
          (
              (
                    (
                          (
                              (
                                    (
                                          (((((var49 & 'ﰀ') >> 10 | var49 << 6) & 65520) >> 4 | ((var49 & 'ﰀ') >> 10 | var49 << 6) << 12) & 57344) >> 13
                                            | ((((var49 & 'ﰀ') >> 10 | var49 << 6) & 65520) >> 4 | ((var49 & 'ﰀ') >> 10 | var49 << 6) << 12) << 3
                                        )
                                        + 65
                                      & 64512
                                  )
                                  >> 10
                                | (
                                      (((((var49 & 'ﰀ') >> 10 | var49 << 6) & 65520) >> 4 | ((var49 & 'ﰀ') >> 10 | var49 << 6) << 12) & 57344) >> 13
                                        | ((((var49 & 'ﰀ') >> 10 | var49 << 6) & 65520) >> 4 | ((var49 & 'ﰀ') >> 10 | var49 << 6) << 12) << 3
                                    )
                                    + 65
                                  << 6
                            )
                            ^ 154
                        )
                        - 137
                      & 65528
                  )
                  >> 3
                | (
                      (
                          (
                                (
                                      (((((var49 & 'ﰀ') >> 10 | var49 << 6) & 65520) >> 4 | ((var49 & 'ﰀ') >> 10 | var49 << 6) << 12) & 57344) >> 13
                                        | ((((var49 & 'ﰀ') >> 10 | var49 << 6) & 65520) >> 4 | ((var49 & 'ﰀ') >> 10 | var49 << 6) << 12) << 3
                                    )
                                    + 65
                                  & 64512
                              )
                              >> 10
                            | (
                                  (((((var49 & 'ﰀ') >> 10 | var49 << 6) & 65520) >> 4 | ((var49 & 'ﰀ') >> 10 | var49 << 6) << 12) & 57344) >> 13
                                    | ((((var49 & 'ﰀ') >> 10 | var49 << 6) & 65520) >> 4 | ((var49 & 'ﰀ') >> 10 | var49 << 6) << 12) << 3
                                )
                                + 65
                              << 6
                        )
                        ^ 154
                    )
                    - 137
                  << 13
            )
            - 39
            - 142
        );
        var17.setCharAt(
          var30,
          (char)(
            (
                (
                      (
                            (
                                (
                                      (
                                            (((((var49 & 'ﰀ') >> 10 | var49 << 6) & 65520) >> 4 | ((var49 & 'ﰀ') >> 10 | var49 << 6) << 12) & 57344) >> 13
                                              | ((((var49 & 'ﰀ') >> 10 | var49 << 6) & 65520) >> 4 | ((var49 & 'ﰀ') >> 10 | var49 << 6) << 12) << 3
                                          )
                                          + 65
                                        & 64512
                                    )
                                    >> 10
                                  | (
                                        (((((var49 & 'ﰀ') >> 10 | var49 << 6) & 65520) >> 4 | ((var49 & 'ﰀ') >> 10 | var49 << 6) << 12) & 57344) >> 13
                                          | ((((var49 & 'ﰀ') >> 10 | var49 << 6) & 65520) >> 4 | ((var49 & 'ﰀ') >> 10 | var49 << 6) << 12) << 3
                                      )
                                      + 65
                                    << 6
                              )
                              ^ 154
                          )
                          - 137
                        & 65528
                    )
                    >> 3
                  | (
                        (
                            (
                                  (
                                        (((((var49 & 'ﰀ') >> 10 | var49 << 6) & 65520) >> 4 | ((var49 & 'ﰀ') >> 10 | var49 << 6) << 12) & 57344) >> 13
                                          | ((((var49 & 'ﰀ') >> 10 | var49 << 6) & 65520) >> 4 | ((var49 & 'ﰀ') >> 10 | var49 << 6) << 12) << 3
                                      )
                                      + 65
                                    & 64512
                                )
                                >> 10
                              | (
                                    (((((var49 & 'ﰀ') >> 10 | var49 << 6) & 65520) >> 4 | ((var49 & 'ﰀ') >> 10 | var49 << 6) << 12) & 57344) >> 13
                                      | ((((var49 & 'ﰀ') >> 10 | var49 << 6) & 65520) >> 4 | ((var49 & 'ﰀ') >> 10 | var49 << 6) << 12) << 3
                                  )
                                  + 65
                                << 6
                          )
                          ^ 154
                      )
                      - 137
                    << 13
              )
              - 39
              - 142
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, we.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (1858544055 | 1858544055 ^ -220683866) ^ -18898505; var36 < var20.length(); var36 += (1320645944 & 1905882867 | 1) & -1171651965) {
        int var59 = var20.charAt(var36) ^ 204;
        int var87 = (var59 & 49152) >> 14;
        int var60 = (var59 & 49152) >> 14 | var59 << 2;
        int var88 = (((var59 & 49152) >> 14 | var59 << 2) & 65520) >> 4;
        var59 = (((var87 | var59 << 2) & 65520) >> 4 | ((var59 & 49152) >> 14 | var59 << 2) << 12) + 206;
        var87 = ((var88 | var60 << 12) + 206 & 65408) >> 7;
        int var62 = ((((var88 | var60 << 12) + 206 & 65408) >> 7 | var59 << 9) ^ 97) + 242 - 193 + 209;
        int var90 = (((((var88 | var60 << 12) + 206 & 65408) >> 7 | var59 << 9) ^ 97) + 242 - 193 + 209 & 65534) >> 1;
        char var63 = (char)(
          (((var87 | var59 << 9) ^ 97) + 242 - 193 + 209 & 65534) >> 1
            | ((((var88 | var60 << 12) + 206 & 65408) >> 7 | var59 << 9) ^ 97) + 242 - 193 + 209 << 15
        );
        var20.setCharAt(var36, (char)(var90 | var62 << 15));
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), we.class.getClassLoader()).returnType();
      switch ((var4 - 335255451 + 1848564953 + 1261129061 ^ 702644446 ^ 1847038740) - 2012312292 - 1980856568 - 92014963 - 1269771372 - 321976236) {
        case 1357055011:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1993369006:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 2127912606:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 2142789492:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      mgj[((((var10 + 1861459599 ^ 1259208552) - 781109568 ^ 1864006113 ^ 1111186926) - 609654321 ^ 141912839) + 1525324810 ^ 2012988267) + 650542947] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
