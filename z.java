// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import dev.krypton.jnt3.Loader;

public class z {
  public z() {
    this.__jnt__init__3601965633481355227__();
  }

  public static native byte[] dvw(dy var0, byte[]... var1);

  public static native byte[] ouo(String var0);

  public static native dy xay(byte[] var0, int var1);

  public static native String yug(byte[] var0, int var1, int var2);

  public static native String zxa(byte[] var0, int var1, int var2, int var3);

  public static native String zwg(byte[] var0, int[] var1, int var2);

  static native void yqm(int var0);

  static {
    Loader.init(z.class);
    yqm((1948072965 | 738898974 | -1449111128) & -1111687253);
  }

    // [JNT_NATIVE] void __jnt__init__3601965633481355227__() - implementation encrypted in native .so library
  public native void __jnt__init__3601965633481355227__();

  public static native void guard();
}
