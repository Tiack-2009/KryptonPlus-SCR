// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import com.google.gson.JsonObject;
import dev.krypton.utils.discordutils.DiscordIPC.Opcode;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

public record yj(
  Opcode opcode,
  JsonObject data,
  Opcode opcode,
  JsonObject data,
  Opcode opcode,
  JsonObject data,
  Opcode opcode,
  JsonObject data,
  urh opcode,
  JsonObject data,
  urh opcode,
  JsonObject data,
  urh opcode,
  JsonObject data,
  urh opcode,
  JsonObject data,
  Opcode opcode,
  JsonObject data,
  Opcode opcode,
  JsonObject data,
  Opcode opcode,
  JsonObject data,
  Opcode opcode,
  JsonObject data,
  urh opcode,
  JsonObject data,
  urh opcode,
  JsonObject data,
  urh opcode,
  JsonObject data,
  urh opcode,
  JsonObject data
) {
  public urh nc;
  public JsonObject gg;
  // [JNT] MethodHandle dispatch table (removed)
  public yj(urh var1, JsonObject var2) {
    this.nc = var1;
    this.gg = var2;
  }

  public urh hb() {
    return null /* jnt:encrypted */;
  }

  public JsonObject tb() {
    return null /* jnt:encrypted */;
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = (var10 - 1912526853 - 1900363419 ^ 155350167 ^ 1189897322) + 383638004 + 311786339 - 642049068 - 1041250445 ^ 1362898946;
    MethodHandle var10000 = vvj[((var10 - 1912526853 - 1900363419 ^ 155350167 ^ 1189897322) + 383638004 + 311786339 - 642049068 - 1041250445 ^ 1362898946)
      + 201831899];
    if (vvj[var10001 + 201831899] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = 329655003 << -1109749954 ^ -1073741824; var24 < var14.length(); var24 += 1288602031 >> -337642531 ^ 3) {
        int var43 = var14.charAt(var24);
        int var10004 = (var43 & 65532) >> 2;
        int var44 = (((var43 & 65532) >> 2 | var43 << 14) + 226 ^ 134) + 204;
        int var82 = ((((var43 & 65532) >> 2 | var43 << 14) + 226 ^ 134) + 204 & 65528) >> 3;
        var43 = ((((var10004 | var43 << 14) + 226 ^ 134) + 204 & 65528) >> 3 | (((var43 & 65532) >> 2 | var43 << 14) + 226 ^ 134) + 204 << 13) + 227 + 82 + 153;
        var10004 = ((var82 | var44 << 13) + 227 + 82 + 153 & 65504) >> 5;
        int var46 = ((var82 | var44 << 13) + 227 + 82 + 153 & 65504) >> 5 | var43 << 11;
        int var84 = ((((var82 | var44 << 13) + 227 + 82 + 153 & 65504) >> 5 | var43 << 11) & 57344) >> 13;
        char var47 = (char)(((var10004 | var43 << 11) & 57344) >> 13 | (((var82 | var44 << 13) + 227 + 82 + 153 & 65504) >> 5 | var43 << 11) << 3);
        var14.setCharAt(var24, (char)(var84 | var46 << 3));
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = -1472149223 >> -1160963735 ^ -2875292; var30 < var17.length(); var30 += 80803085 ^ 2045562033 ^ 2101098941) {
        int var52 = var17.charAt(var30) + 181;
        char var55 = (char)(
          (
              (
                    (((((var52 & 65408) >> 7 | var52 << 9) & 64512) >> 10 | ((var52 & 65408) >> 7 | var52 << 9) << 6) & 57344) >> 13
                      | ((((var52 & 65408) >> 7 | var52 << 9) & 64512) >> 10 | ((var52 & 65408) >> 7 | var52 << 9) << 6) << 3
                  )
                  + 154
                ^ 5
            )
            - 226
            - 174
            + 128
            + 195
        );
        var17.setCharAt(
          var30,
          (char)(
            (
                (
                      (((((var52 & 65408) >> 7 | var52 << 9) & 64512) >> 10 | ((var52 & 65408) >> 7 | var52 << 9) << 6) & 57344) >> 13
                        | ((((var52 & 65408) >> 7 | var52 << 9) & 64512) >> 10 | ((var52 & 65408) >> 7 | var52 << 9) << 6) << 3
                    )
                    + 154
                  ^ 5
              )
              - 226
              - 174
              + 128
              + 195
          )
        );
      }

      Class var6 = Class.forName(var17.toString(), false, yj.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = 932734187 >>> 1043770948 ^ 58295886; var36 < var20.length(); var36 += 1529776258 << (-1781355683 & -1781355683) ^ 1073741825) {
        int var60 = var20.charAt(var36) - 217;
        char var63 = (char)(
          (
                (
                      (((((var60 & 65472) >> 6 | var60 << 10) - 185 ^ 52) - 35 ^ 151 ^ 99) & 61440) >> 12
                        | ((((var60 & 65472) >> 6 | var60 << 10) - 185 ^ 52) - 35 ^ 151 ^ 99) << 4
                    )
                    + 193
                  & 57344
              )
              >> 13
            | (
                  (((((var60 & 65472) >> 6 | var60 << 10) - 185 ^ 52) - 35 ^ 151 ^ 99) & 61440) >> 12
                    | ((((var60 & 65472) >> 6 | var60 << 10) - 185 ^ 52) - 35 ^ 151 ^ 99) << 4
                )
                + 193
              << 3
        );
        var20.setCharAt(
          var36,
          (char)(
            (
                  (
                        (((((var60 & 65472) >> 6 | var60 << 10) - 185 ^ 52) - 35 ^ 151 ^ 99) & 61440) >> 12
                          | ((((var60 & 65472) >> 6 | var60 << 10) - 185 ^ 52) - 35 ^ 151 ^ 99) << 4
                      )
                      + 193
                    & 57344
                )
                >> 13
              | (
                    (((((var60 & 65472) >> 6 | var60 << 10) - 185 ^ 52) - 35 ^ 151 ^ 99) & 61440) >> 12
                      | ((((var60 & 65472) >> 6 | var60 << 10) - 185 ^ 52) - 35 ^ 151 ^ 99) << 4
                  )
                  + 193
                << 3
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), yj.class.getClassLoader()).returnType();
      switch (var4 + 403659590 - 750273079 + 1746013981 + 503390471 + 1137192209 - 1398541074 + 498724761 + 1066686429 - 2105284059 ^ 2039885471) {
        case 170641491:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 977044486:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        case 1180518594:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1934170612:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      vvj[((var10 - 1912526853 - 1900363419 ^ 155350167 ^ 1189897322) + 383638004 + 311786339 - 642049068 - 1041250445 ^ 1362898946) + 201831899] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }
}
