// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import dev.krypton.jnt3.Loader;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Set;
import net.minecraft.BlockPos;

public record qc(
  int selfHeat,
  boolean hasUngrown,
  Set<class_2338> rotated,
  int selfHeat,
  boolean hasUngrown,
  Set<class_2338> rotated,
  int selfHeat,
  boolean hasUngrown,
  Set<class_2338> rotated,
  int selfHeat,
  boolean hasUngrown,
  Set<class_2338> rotated,
  int selfHeat,
  boolean hasUngrown,
  Set<class_2338> rotated,
  int selfHeat,
  boolean hasUngrown,
  Set<class_2338> rotated,
  int selfHeat,
  boolean hasUngrown,
  Set<class_2338> rotated,
  int selfHeat,
  boolean hasUngrown,
  Set<class_2338> rotated,
  int selfHeat,
  boolean hasUngrown,
  Set<class_2338> rotated,
  int selfHeat,
  boolean hasUngrown,
  Set<class_2338> rotated,
  int selfHeat,
  boolean hasUngrown,
  Set<class_2338> rotated,
  int selfHeat,
  boolean hasUngrown,
  Set<class_2338> rotated,
  int selfHeat,
  boolean hasUngrown,
  Set<class_2338> rotated,
  int selfHeat,
  boolean hasUngrown,
  Set<class_2338> rotated,
  int selfHeat,
  boolean hasUngrown,
  Set<class_2338> rotated,
  int selfHeat,
  boolean hasUngrown,
  Set<class_2338> rotated
) {
  public int sh;
  public boolean upr;
  public Set pig;
  // [JNT] MethodHandle dispatch table (removed)
  public qc(int var1, boolean var2, Set var3) {
    this.sh = var1;
    this.upr = var2;
    this.pig = var3;
  }

  public int gfa() {
    return null /* jnt:encrypted */;
  }

  public boolean qw() {
    return null /* jnt:encrypted */;
  }

  public Set zjm() {
    return null /* jnt:encrypted */;
  }

  static {
    Loader.init(qc.class);
  }

  public static Object _/* $VF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
    boolean var11 = false;
    int var10 = (Integer)var3[4];
    int var10001 = ((var10 - 2020341994 + 628532718 + 470344707 ^ 1551552385) - 1500846515 + 2066467346 ^ 1057035129) - 478003627 - 1652270484;
    MethodHandle var10000 = bfgj[((var10 - 2020341994 + 628532718 + 470344707 ^ 1551552385) - 1500846515 + 2066467346 ^ 1057035129) - 478003627 - 1652270484
      ^ 1747171029];
    if (bfgj[var10001 ^ 1747171029] == null) {
      int var4 = (Integer)var3[0];
      StringBuilder var14 = new StringBuilder((String)var3[1]);

      for (int var24 = 39102744 - -322774891 ^ 361877635; var24 < var14.length(); var24 += (1097016579 | -1138864331 | 0) & 8425609) {
        int var43 = var14.charAt(var24) - 'm';
        char var46 = (char)(
          (
                (((((var43 & 32768) >> 15 | var43 << 1) - 242 & 65520) >> 4 | ((var43 & 32768) >> 15 | var43 << 1) - 242 << 12) + 197 - 162 + 249 ^ 67) - 122
                  & 65520
              )
              >> 4
            | (((((var43 & 32768) >> 15 | var43 << 1) - 242 & 65520) >> 4 | ((var43 & 32768) >> 15 | var43 << 1) - 242 << 12) + 197 - 162 + 249 ^ 67) - 122
              << 12
        );
        var14.setCharAt(
          var24,
          (char)(
            (
                  (((((var43 & 32768) >> 15 | var43 << 1) - 242 & 65520) >> 4 | ((var43 & 32768) >> 15 | var43 << 1) - 242 << 12) + 197 - 162 + 249 ^ 67) - 122
                    & 65520
                )
                >> 4
              | (((((var43 & 32768) >> 15 | var43 << 1) - 242 & 65520) >> 4 | ((var43 & 32768) >> 15 | var43 << 1) - 242 << 12) + 197 - 162 + 249 ^ 67) - 122
                << 12
          )
        );
      }

      String var5 = var14.toString();
      StringBuilder var17 = new StringBuilder((String)var3[2]);

      for (int var30 = (-487855736 - -728882439 | 0) & 293607696; var30 < var17.length(); var30 += 258908797 & -1895866613 ^ 242090504) {
        int var51 = (var17.charAt(var30) ^ 165) + 62;
        int var84 = (var51 & 49152) >> 14;
        int var52 = (var51 & 49152) >> 14 | var51 << 2;
        int var85 = (((var51 & 49152) >> 14 | var51 << 2) & 65532) >> 2;
        var51 = (((var84 | var51 << 2) & 65532) >> 2 | ((var51 & 49152) >> 14 | var51 << 2) << 14) + 48 + 65 ^ 173;
        var84 = (((var85 | var52 << 14) + 48 + 65 ^ 173) & 65520) >> 4;
        int var54 = ((((var85 | var52 << 14) + 48 + 65 ^ 173) & 65520) >> 4 | var51 << 12) - 99;
        int var87 = (((((var85 | var52 << 14) + 48 + 65 ^ 173) & 65520) >> 4 | var51 << 12) - 99 & 61440) >> 12;
        char var55 = (char)(((var84 | var51 << 12) - 99 & 61440) >> 12 | ((((var85 | var52 << 14) + 48 + 65 ^ 173) & 65520) >> 4 | var51 << 12) - 99 << 4);
        var17.setCharAt(var30, (char)(var87 | var54 << 4));
      }

      Class var6 = Class.forName(var17.toString(), false, qc.class.getClassLoader());
      StringBuilder var20 = new StringBuilder((String)var3[3]);

      for (int var36 = (1919011020 * -1897313059 | 0) & 1077937251; var36 < var20.length(); var36 += -1045055554 * (-459894831 ^ -1045055554) ^ 1391868771) {
        char var60 = var20.charAt(var36);
        char var63 = (char)(
          (
              (
                    (
                        (((((var60 & '\ue000') >> 13 | var60 << 3) + 112 ^ 81) - 32 + 141 - 122 ^ 20) & 65504) >> 5
                          | ((((var60 & '\ue000') >> 13 | var60 << 3) + 112 ^ 81) - 32 + 141 - 122 ^ 20) << 11
                      )
                      & 65528
                  )
                  >> 3
                | (
                    (((((var60 & '\ue000') >> 13 | var60 << 3) + 112 ^ 81) - 32 + 141 - 122 ^ 20) & 65504) >> 5
                      | ((((var60 & '\ue000') >> 13 | var60 << 3) + 112 ^ 81) - 32 + 141 - 122 ^ 20) << 11
                  )
                  << 13
            )
            + 183
        );
        var20.setCharAt(
          var36,
          (char)(
            (
                (
                      (
                          (((((var60 & '\ue000') >> 13 | var60 << 3) + 112 ^ 81) - 32 + 141 - 122 ^ 20) & 65504) >> 5
                            | ((((var60 & '\ue000') >> 13 | var60 << 3) + 112 ^ 81) - 32 + 141 - 122 ^ 20) << 11
                        )
                        & 65528
                    )
                    >> 3
                  | (
                      (((((var60 & '\ue000') >> 13 | var60 << 3) + 112 ^ 81) - 32 + 141 - 122 ^ 20) & 65504) >> 5
                        | ((((var60 & '\ue000') >> 13 | var60 << 3) + 112 ^ 81) - 32 + 141 - 122 ^ 20) << 11
                    )
                    << 13
              )
              + 183
          )
        );
      }

      Class var7 = MethodType.fromMethodDescriptorString(var20.toString(), qc.class.getClassLoader()).returnType();
      switch (((var4 + 478259103 - 343180724 ^ 1979358793) - 911528667 ^ 1286190426 ^ 1034864467 ^ 205210854) - 1396764304 - 1470747803 - 1086544693) {
        case 1037221649:
          var10000 = var0.findStaticSetter(var6, var5, var7);
          break;
        case 1161436447:
          var10000 = var0.findSetter(var6, var5, var7);
          break;
        case 1338841309:
          var10000 = var0.findGetter(var6, var5, var7);
          break;
        case 1815140887:
          var10000 = var0.findStaticGetter(var6, var5, var7);
          break;
        default:
          throw new UnsupportedOperationException("Unsupported handle type!");
      }
    }

    if (!var11) {
      bfgj[((var10 - 2020341994 + 628532718 + 470344707 ^ 1551552385) - 1500846515 + 2066467346 ^ 1057035129) - 478003627 - 1652270484 ^ 1747171029] = var10000;
    }

    MethodHandle var12 = var10000.asType(var2);
    return new MutableCallSite(var12);
  }

  public static native void guard();
}
