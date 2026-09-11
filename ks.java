// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import dev.krypton.jnt3.Loader;

public class ks implements w {
  public ks() {
    this.__jnt__init__6211800956811284715__();
  }

  @Override
    // [JNT_NATIVE] byte[] bzk(byte[] var1, long var2) - implementation encrypted in native .so library
  public native byte[] bzk(byte[] var1, long var2);

  @Override
    // [JNT_NATIVE] byte[] mc(byte[] var1, int var2) - implementation encrypted in native .so library
  public native byte[] mc(byte[] var1, int var2);

  static native void rct(long var0);

  static {
    Loader.init(ks.class);
    rct(-4559139845094110720L - -4559139845094110720L ^ -6808964436932190034L);
  }

    // [JNT_NATIVE] void __jnt__init__6211800956811284715__() - implementation encrypted in native .so library
  public native void __jnt__init__6211800956811284715__();

  public static native void guard();
}
