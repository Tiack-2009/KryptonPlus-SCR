// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import dev.krypton.jnt3.Loader;

public class am {
  public Object sx;
  public Object gcg;
  public am() {
    this.__jnt__init__7844176965722684316__();
  }

  public am(long var1) {
    this.__jnt__init__1469218795313110046__(var1);
  }

    // [JNT_NATIVE] void wjq(long var1) - implementation encrypted in native .so library
  public native void wjq(long var1);

    // [JNT_NATIVE] void snp(byte[] var1, long var2) - implementation encrypted in native .so library
  public native void snp(byte[] var1, long var2);

    // [JNT_NATIVE] void hhq(byte[] var1, long var2) - implementation encrypted in native .so library
  public native void hhq(byte[] var1, long var2);

  static native void xyu(long var0);

  static {
    Loader.init(am.class);
    xyu((-8089907330298873136L | -31620919543526127L) ^ -4007279705436440478L);
  }

    // [JNT_NATIVE] void __jnt__init__7844176965722684316__() - implementation encrypted in native .so library
  public native void __jnt__init__7844176965722684316__();

    // [JNT_NATIVE] void __jnt__init__1469218795313110046__(long var1) - implementation encrypted in native .so library
  public native void __jnt__init__1469218795313110046__(long var1);

  public static native void guard();
}
