package dev.krypton;

// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import dev.krypton.jnt3.Loader;
import java.lang.invoke.MethodHandle;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {
  public static Object wwv;
  public static Object uvf;
  // [JNT] MethodHandle dispatch table (removed)

  public Main() {
    this.__jnt__init__6211445875888387295__();
  }

    // [JNT_NATIVE] void onInitialize() - implementation encrypted in native .so library
  public native void onInitialize();

  public static native void gnk(long var0);

  static {
    Loader.init(Main.class);
    gnk((7647995858569943871L ^ -4430050051394572085L | -7558957584279328764L) & -2369675516218349385L);
  }

    // [JNT_NATIVE] void __jnt__init__6211445875888387295__() - implementation encrypted in native .so library
  public native void __jnt__init__6211445875888387295__();

  public static native void guard();
}
