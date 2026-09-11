// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import dev.krypton.jnt3.Loader;
import java.lang.invoke.MethodHandle;

public class klt {
  public Object uv;
  public Object pcs;
  public Object ov;
  // [JNT] MethodHandle dispatch table (removed)

  public klt() {
    this.__jnt__init__2307489283539730209__();
  }

    // [JNT_NATIVE] void wz(long var1) - implementation encrypted in native .so library
  public native void wz(long var1);

    // [JNT_NATIVE] void ev() - implementation encrypted in native .so library
  public native void ev();

    // [JNT_NATIVE] void fg() - implementation encrypted in native .so library
  public native void fg();

    // [JNT_NATIVE] boolean ya(long var1) - implementation encrypted in native .so library
  public native boolean ya(long var1);

    // [JNT_NATIVE] JsonObject gy(int var1) - implementation encrypted in native .so library
  public native JsonObject gy(int var1);

    // [JNT_NATIVE] void epi(long var1) - implementation encrypted in native .so library
  public native void epi(long var1);

    // [JNT_NATIVE] void yww(String var1, long var2) - implementation encrypted in native .so library
  public native void yww(String var1, long var2);

    // [JNT_NATIVE] void ohe(wus var1, JsonElement var2, np var3, int var4) - implementation encrypted in native .so library
  public native void ohe(wus var1, JsonElement var2, np var3, int var4);

    // [JNT_NATIVE] void ql() - implementation encrypted in native .so library
  public native void ql();

    // [JNT_NATIVE] void alq(wus var1, JsonObject var2, int var3) - implementation encrypted in native .so library
  public native void alq(wus var1, JsonObject var2, int var3);

  static native void ujk(long var0);

  static {
    Loader.init(klt.class);
    ujk((-6727444643390257623L | 5685813182305840052L | 5877275029844053546L) & 6168084261533568938L);
  }

    // [JNT_NATIVE] void __jnt__init__2307489283539730209__() - implementation encrypted in native .so library
  public native void __jnt__init__2307489283539730209__();

  public static native void guard();
}
