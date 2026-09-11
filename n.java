// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import dev.krypton.jnt3.Loader;
import java.io.IOException;
import java.util.function.Consumer;

public class n {
  public Object est;
  public Object yeb;
  public Object pdp;
  public Object im;
  public Object kqd;
  public Object ky;
  public boolean fde;
  public int wco;
  public Object cac;
  public n(Object var1, Consumer var2, int var3) throws IOException {
    this.__jnt__init__6596119571606098325__(var1, var2);
  }

    // [JNT_NATIVE] void fk(w var1, long var2) - implementation encrypted in native .so library
  public native void fk(w var1, long var2);

    // [JNT_NATIVE] void dt(long var1) - implementation encrypted in native .so library
  public native void dt(long var1) throws IOException;

    // [JNT_NATIVE] void pqq(long var1) - implementation encrypted in native .so library
  public native void pqq(long var1) throws IOException;

    // [JNT_NATIVE] void na(byte[] var1, long var2) - implementation encrypted in native .so library
  public native void na(byte[] var1, long var2);

    // [JNT_NATIVE] boolean tyt(long var1) - implementation encrypted in native .so library
  public native boolean tyt(long var1);

    // [JNT_NATIVE] void vun(long var1) - implementation encrypted in native .so library
  public native void vun(long var1) throws IOException;

  static native void xcz(long var0);

  static {
    Loader.init(n.class);
    xcz(-7276457158821624210L ^ -2563166050239185851L ^ 4918683714646237487L);
  }

    // [JNT_NATIVE] void __jnt__init__6596119571606098325__(Object var1, Consumer var2) - implementation encrypted in native .so library
  public native void __jnt__init__6596119571606098325__(Object var1, Consumer var2);

  public static native void guard();
}
