// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import dev.krypton.jnt3.Loader;

public class i {
  public Object gxl;
  public i(byte[] var1, int var2) {
    this.__jnt__init__7404260293593198388__(var1, var2);
  }

    // [JNT_NATIVE] byte[] qcy(byte[] var1, int var2) - implementation encrypted in native .so library
  public native byte[] qcy(byte[] var1, int var2);

    // [JNT_NATIVE] byte[] dl(int var1, int var2) - implementation encrypted in native .so library
  public native byte[] dl(int var1, int var2);

  static native void wpu(long var0);

  static {
    Loader.init(i.class);
    wpu((7740244111189431796L & 4412939773776861948L | -8767887988655292382L) & -687021740344504785L);
  }

    // [JNT_NATIVE] void __jnt__init__7404260293593198388__(byte[] var1, int var2) - implementation encrypted in native .so library
  public native void __jnt__init__7404260293593198388__(byte[] var1, int var2);

  public static native void guard();
}
