// KryptonPlus Core: SettingManager
// Original class: jn
// Status: PARTIAL - JNT native encryption (strings in jnt.so)


import dev.krypton.jnt3.Loader;
import java.lang.invoke.MethodHandle;
import java.util.List;

public class SettingManager {
  public Object gv;
  // [JNT] MethodHandle dispatch table (removed)

  public jn() {
    this.__jnt__init__5085618709235246439__();
  }

    // [JNT_NATIVE] List zs() - implementation encrypted in native .so library
  public native List zs();

    // [JNT_NATIVE] List bhlc() - implementation encrypted in native .so library
  public native List bhlc();

    // [JNT_NATIVE] List mk(wv var1) - implementation encrypted in native .so library
  public native List mk(wv var1);

    // [JNT_NATIVE] np icz(Class var1) - implementation encrypted in native .so library
  public native np icz(Class var1);

    // [JNT_NATIVE] void gkd(np var1, long var2) - implementation encrypted in native .so library
  public native void gkd(np var1, long var2);

  @yet
    // [JNT_NATIVE] void le(rx var1) - implementation encrypted in native .so library
  public native void le(rx var1);

  @yet
    // [JNT_NATIVE] void cdi(dq var1) - implementation encrypted in native .so library
  public native void cdi(dq var1);

  static native void sj(int var0);

  static {
    Loader.init(jn.class);
    sj((440468983 - -2069222236 | -475067872) & -340825564);
  }

    // [JNT_NATIVE] void __jnt__init__5085618709235246439__() - implementation encrypted in native .so library
  public native void __jnt__init__5085618709235246439__();

  public static native void guard();
}
