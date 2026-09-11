// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import dev.krypton.jnt3.Loader;

public class zk {
  public static Object ei;
  public zk() {
    this.__jnt__init__8456925846319948214__();
  }

  public static native int cmb(int var0, int var1, long var2);

  public static native byte[] kw(byte[] var0);

  public static native void zx(int var0);

  static {
    Loader.init(zk.class);
    zx((-571026622 - -104427652 | 1290859600) & 1341387869);
  }

    // [JNT_NATIVE] void __jnt__init__8456925846319948214__() - implementation encrypted in native .so library
  public native void __jnt__init__8456925846319948214__();

  public static native void guard();
}
