// Status: PARTIAL - JNT native encryption (strings in jnt.so)


import dev.krypton.jnt3.Loader;

public enum dy {
  bto,
  yij,
  nj,
  vb,
  tui,
  kuf,
  cp,
  uq;

  public int bc;
  public dy(int var3, int var4) {
    this.__jnt__init__3488720533354968928__(var1, var2, var3);
  }

  public static native dy glg(int var0, int var1);

    // [JNT_NATIVE] int ykt(int var1) - implementation encrypted in native .so library
  public native int ykt(int var1);

  public static native void tht(int var0);

  // $VF: Failed to inline enum fields
  // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
  static {
    Loader.init(dy.class);
    tht(-765856346 * -765856346 ^ -113703553);
  }

    // [JNT_NATIVE] void __jnt__init__3488720533354968928__(String var1, int var2, int var3) - implementation encrypted in native .so library
  public native void __jnt__init__3488720533354968928__(String var1, int var2, int var3);

  public static native void guard();
}
