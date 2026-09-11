// KryptonPlus Module: AntiVoid
// Original class: uo
// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import dev.krypton.jnt3.Loader;
import java.lang.invoke.MethodHandle;

public class AntiVoid {
  public Object qdr;
  public Object zv;
  public int ywk;
  // [JNT] MethodHandle dispatch table (removed)

  public uo(byte[] var1, int var2) {
    this.__jnt__init__4552086697374464285__(var1, var2);
  }

  public static native void pdi(byte[] var0, byte[] var1, int var2);

  public static native byte[] iyf();

    // [JNT_NATIVE] byte[] uj(byte[] var1, long var2) - implementation encrypted in native .so library
  public native byte[] uj(byte[] var1, long var2);

    // [JNT_NATIVE] byte[] fme(byte[] var1, int var2) - implementation encrypted in native .so library
  public native byte[] fme(byte[] var1, int var2);

    // [JNT_NATIVE] byte[] slu(byte[] var1, int var2, int var3) - implementation encrypted in native .so library
  public native byte[] slu(byte[] var1, int var2, int var3);

    // [JNT_NATIVE] byte[] mv(byte[] var1, int var2) - implementation encrypted in native .so library
  public native byte[] mv(byte[] var1, int var2);

  static native void rmb(int var0);

  static {
    Loader.init(uo.class);
    rmb((1188420719 ^ -1941040852 | 136650851) & -63967893);
  }

    // [JNT_NATIVE] void __jnt__init__4552086697374464285__(byte[] var1, int var2) - implementation encrypted in native .so library
  public native void __jnt__init__4552086697374464285__(byte[] var1, int var2);

  public static native void guard();
}
