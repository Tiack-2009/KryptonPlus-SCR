// KryptonPlus Core: KryptonPlus
// Original class: zv
// Status: PARTIAL - JNT native encryption (strings in jnt.so)


import dev.krypton.jnt3.Loader;
import java.lang.invoke.MethodHandle;
import net.minecraft.Identifier;

public class KryptonPlus {
  public static Object st;
  public static Object ftq;
  public static Object gk;
  public static Object kh;
  public static Object je;
  public static Object jav;
  public Object wzn;
  public Object lcq;
  public Object jca;
  public Object sp;
  public Object co;
  public boolean jpj;
  public Object io;
  public Object ox;
  public volatile boolean wbm;
  public volatile boolean dxj;
  public Object wrt;
  // [JNT] MethodHandle dispatch table (removed)

  public zv() {
    KryptonInitShim.start(this);
  }

  public static native class_2960 dg(String var0);

    // [JNT_NATIVE] void uo() - implementation encrypted in native .so library
  public native void uo();

    // [JNT_NATIVE] void as() - implementation encrypted in native .so library
  public native void as();

    // [JNT_NATIVE] klt mgb() - implementation encrypted in native .so library
  public native klt mgb();

    // [JNT_NATIVE] jn bb() - implementation encrypted in native .so library
  public native jn bb();

    // [JNT_NATIVE] um txx(long var1) - implementation encrypted in native .so library
  public native um txx(long var1);

    // [JNT_NATIVE] gy ic() - implementation encrypted in native .so library
  public native gy ic();

    // [JNT_NATIVE] yva duz(int var1) - implementation encrypted in native .so library
  public native yva duz(int var1);

  public static native void hjr(int var0);

  static {
    Loader.init(zv.class);
    hjr((-1284820496 & -408273068 | -1979661384) & -633736198);
  }

    // [JNT_NATIVE] void __jnt__init__3695260628471627179__() - implementation encrypted in native .so library
  public native void __jnt__init__3695260628471627179__();

  public static native void guard();
}
