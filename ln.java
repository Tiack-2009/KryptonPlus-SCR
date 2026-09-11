// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import com.google.gson.JsonObject;
import dev.krypton.jnt3.Loader;
import java.util.concurrent.CompletableFuture;

public class ln {
  public static Object tba;
  public static int xa;
  public static Object hpy;
  public static Object wer;
  public boolean qvb;
  public Object dkd;
  public Object os;
  public ln(String var1, int var2) {
    this.__jnt__init__1288643786166093897__(var1);
  }

    // [JNT_NATIVE] CompletableFuture bxn(long var1) - implementation encrypted in native .so library
  public native CompletableFuture bxn(long var1);

    // [JNT_NATIVE] CompletableFuture jpv(JsonObject var1, int var2) - implementation encrypted in native .so library
  public native CompletableFuture jpv(JsonObject var1, int var2);

    // [JNT_NATIVE] boolean zwy(String var1, int var2) - implementation encrypted in native .so library
  public native boolean zwy(String var1, int var2);

    // [JNT_NATIVE] boolean opz(long var1) - implementation encrypted in native .so library
  public native boolean opz(long var1);

    // [JNT_NATIVE] JsonObject adm(int var1) - implementation encrypted in native .so library
  public native JsonObject adm(int var1);

    // [JNT_NATIVE] String qgd(int var1) - implementation encrypted in native .so library
  public native String qgd(int var1);

  public static native void wicb(long var0);

  static {
    Loader.init(ln.class);
    wicb(-7388028147477529995L ^ -2462698746788001756L ^ -8437399259526239608L);
  }

    // [JNT_NATIVE] void __jnt__init__1288643786166093897__(String var1) - implementation encrypted in native .so library
  public native void __jnt__init__1288643786166093897__(String var1);

  public static native void guard();
}
