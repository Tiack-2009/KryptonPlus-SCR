// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import dev.krypton.jnt3.Loader;

public class jog implements w {
  public static int jo;
  public Object im;
  public jog() {
    this.__jnt__init__2147380406796773412__();
  }

    // [JNT_NATIVE] byte[] vzd() - implementation encrypted in native .so library
  public native byte[] vzd();

  @Override
    // [JNT_NATIVE] byte[] bzk(byte[] var1, long var2) - implementation encrypted in native .so library
  public native byte[] bzk(byte[] var1, long var2);

  @Override
    // [JNT_NATIVE] byte[] mc(byte[] var1, int var2) - implementation encrypted in native .so library
  public native byte[] mc(byte[] var1, int var2);

  static native void wo(long var0);

  static {
    Loader.init(jog.class);
    wo(9144220670938872928L * 6271590604232799134L ^ 5400425607599219532L);
  }

    // [JNT_NATIVE] void __jnt__init__2147380406796773412__() - implementation encrypted in native .so library
  public native void __jnt__init__2147380406796773412__();

  public static native void guard();
}
