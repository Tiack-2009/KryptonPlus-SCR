// Status: PARTIAL - JNT native encryption (strings in jnt.so)


import dev.krypton.jnt3.Loader;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.nio.channels.SelectionKey;
import java.util.function.Consumer;

public class cp {
  public Object ves;
  public int erh;
  public Object fnr;
  public Object est;
  public Object vek;
  public Object vdi;
  public Object mzt;
  // [JNT] MethodHandle dispatch table (removed)

  public cp(String var1, int var2, long var3) {
    this.__jnt__init__489825219810245889__(var1, var2);
  }

  public static native byte[] anl(byte[] var0);

    // [JNT_NATIVE] void br(Runnable var1, int var2) - implementation encrypted in native .so library
  public native void br(Runnable var1, int var2);

    // [JNT_NATIVE] void qtc(Consumer var1, int var2) - implementation encrypted in native .so library
  public native void qtc(Consumer var1, int var2);

    // [JNT_NATIVE] void lhu(Consumer var1, int var2) - implementation encrypted in native .so library
  public native void lhu(Consumer var1, int var2) throws IOException;

    // [JNT_NATIVE] void jbl(int var1) - implementation encrypted in native .so library
  public native void jbl(int var1) throws IOException;

    // [JNT_NATIVE] void od(SelectionKey var1, long var2) - implementation encrypted in native .so library
  public native void od(SelectionKey var1, long var2);

    // [JNT_NATIVE] void phb(int var1) - implementation encrypted in native .so library
  public native void phb(int var1) throws IOException;

    // [JNT_NATIVE] void sz(SelectionKey var1, int var2) - implementation encrypted in native .so library
  public native void sz(SelectionKey var1, int var2) throws IOException;

    // [JNT_NATIVE] void pnm(byte[] var1) - implementation encrypted in native .so library
  public native void pnm(byte[] var1) throws IOException;

  static native void cum(int var0);

  static {
    Loader.init(cp.class);
    cum(232289251 >> -1933911367 ^ 58406070);
  }

    // [JNT_NATIVE] void __jnt__init__489825219810245889__(String var1, int var2) - implementation encrypted in native .so library
  public native void __jnt__init__489825219810245889__(String var1, int var2);

  public static native void guard();
}
