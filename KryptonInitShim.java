// Status: PARTIAL - JNT native encryption (strings in jnt.so)

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class KryptonInitShim implements Runnable {
  private static final String[] MODULE_CLASSES = new String[]{
    "ae",
    "b",
    "ba",
    "bm",
    "cd",
    "cm",
    "cok",
    "da",
    "ek",
    "es",
    "fda",
    "fi",
    "fn",
    "g",
    "gdr",
    "gv",
    "iq",
    "it",
    "j",
    "jd",
    "jr",
    "jt",
    "jz",
    "ka",
    "kt",
    "kv",
    "kx",
    "lbl",
    "lj",
    "lx",
    "mc",
    "mf",
    "mg",
    "mj",
    "mn",
    "mwt",
    "nc",
    "no",
    "ns",
    "nx",
    "nz",
    "or",
    "ov",
    "oy",
    "pj",
    "pl",
    "pn",
    "pu",
    "px",
    "qf",
    "qr",
    "qz",
    "rs",
    "sh",
    "si",
    "sl",
    "tb",
    "tl",
    "to",
    "uc",
    "un",
    "vjf",
    "vn",
    "vsv",
    "vtk",
    "vw",
    "vx",
    "wf",
    "wk",
    "wl",
    "xt",
    "xu",
    "xx",
    "y",
    "yb",
    "zx"
  };
  private final zv target;

  private KryptonInitShim(zv var1) {
    this.target = var1;
  }

  public static void start(zv var0) {
    startClientInit(var0);
    Thread var1 = new Thread(new KryptonInitShim(var0), "Krypton native init");
    var1.setDaemon(true);
    var1.start();

    try {
      Thread.sleep(750L);
    } catch (InterruptedException var3) {
      Thread.currentThread().interrupt();
    }
  }

  public static void startClientInit(Object var0) {
    try {
      Object var1 = var0 != null ? var0 : zv.kh;
      if (var1 instanceof zv var2 && var2.jca == null) {
        var2.jca = new jn();
      }

      if (zv.jav == null || zv.gk == null) {
        Class var5 = Class.forName("net.minecraft.class_310");
        Object var3 = var5.getDeclaredMethod("method_1551").invoke(null);
        if (var3 != null) {
          zv.jav = var3;
          zv.gk = var3;
        }
      }

      if (var1 instanceof zv var6 && zv.gk != null && var6.jca != null) {
        populateModules(var6.jca);
        ensureEventBus(var6);
        registerModules(var6);
      }
    } catch (Throwable var4) {
      var4.printStackTrace();
    }
  }

  public static void fixGui(Object var0) {
    try {
      if (var0 == null) {
        return;
      }

      seedGuiObject(var0);
      if (getField(var0, "gvs") instanceof List var2) {
        for (Object var4 : var2) {
          seedGuiObject(var4);
          Object var5 = getField(var4, "dnt");
          if (var5 instanceof List) {
            for (Object var8 : (List)var5) {
              seedGuiObject(var8);
              Object var9 = getField(var8, "jjj");
              if (var9 instanceof List) {
                for (Object var12 : (List)var9) {
                  seedGuiObject(var12);
                }
              }
            }
          }
        }
      }
    } catch (Throwable var13) {
      var13.printStackTrace();
    }
  }

  public static void openGui() {
    try {
      startClientInit(null);
      Class var0 = Class.forName("net.minecraft.class_310");
      Object var1 = var0.getDeclaredMethod("method_1551").invoke(null);
      Object var2 = Class.forName("yva", true, var0.getClassLoader()).getDeclaredConstructor().newInstance();
      fixGui(var2);
      installGuiReference(var2);
      Class var3 = Class.forName("net.minecraft.class_437", false, var0.getClassLoader());
      Method var4 = var0.getDeclaredMethod("method_1507", var3);
      var4.invoke(var1, var2);
      installGuiReference(var2);
    } catch (Throwable var5) {
      var5.printStackTrace();
    }
  }

  private static void populateModules(Object var0) {
    try {
      List var1 = (List)var0.getClass().getDeclaredMethod("bhlc").invoke(var0);
      if (var1 != null && !var1.isEmpty()) {
        return;
      }
    } catch (Throwable var12) {
    }

    ArrayList var13 = new ArrayList();
    ClassLoader var2 = var0.getClass().getClassLoader();

    for (String var6 : MODULE_CLASSES) {
      try {
        Class var7 = Class.forName(var6, true, var2);
        Constructor var8 = var7.getDeclaredConstructor();
        var8.setAccessible(true);
        Object var9 = var8.newInstance();
        var13.add(var9);
      } catch (Throwable var11) {
        var11.printStackTrace();
      }
    }

    try {
      Field var14 = var0.getClass().getDeclaredField("gv");
      var14.setAccessible(true);
      var14.set(var0, var13);
    } catch (Throwable var10) {
      var10.printStackTrace();
    }
  }

  private static void ensureEventBus(zv var0) {
    try {
      if (var0.co == null || !(var0.co instanceof gy)) {
        var0.co = new gy();
      }
    } catch (Throwable var2) {
      var2.printStackTrace();
    }
  }

  private static void registerModules(zv var0) {
    try {
      if (var0.co instanceof gy var1 && var0.jca != null) {
        Field var10 = findField(gy.class, "slt");
        var10.setAccessible(true);
        if (var10.get(var1) instanceof Map var4 && !var4.isEmpty()) {
          return;
        }

        if (!(var0.jca.getClass().getDeclaredMethod("bhlc").invoke(var0.jca) instanceof List var5)) {
          return;
        }

        Method var6 = gy.class.getDeclaredMethod("ne", Object.class);
        var6.setAccessible(true);

        for (Object var8 : var5) {
          var6.invoke(var1, var8);
        }

        return;
      }
    } catch (Throwable var9) {
      var9.printStackTrace();
    }
  }

  private static void seedGuiObject(Object var0) {
    setColorIfNull(var0, "pb", 25, 25, 30, 0);
    setColorIfNull(var0, "fl", 255, 255, 255, 20);
  }

  private static void installGuiReference(Object var0) {
    Object var1 = zv.kh;
    if (var1 != null && var0 != null) {
      setObjectIfCompatible(var1, "io", var0);
    }
  }

  private static void setObjectIfCompatible(Object var0, String var1, Object var2) {
    try {
      Field var3 = findField(var0.getClass(), var1);
      if (var3 == null || var3.getType() != Object.class) {
        return;
      }

      var3.setAccessible(true);
      Object var4 = var3.get(var0);
      if (var4 == null || var4.getClass().getName().equals("yva")) {
        var3.set(var0, var2);
      }
    } catch (Throwable var5) {
    }
  }

  private static void setColorIfNull(Object var0, String var1, int var2, int var3, int var4, int var5) {
    try {
      Field var6 = findField(var0.getClass(), var1);
      if (var6 == null || var6.getType() != zn.class) {
        return;
      }

      var6.setAccessible(true);
      if (var6.get(var0) == null) {
        var6.set(var0, new zn(var2, var3, var4, var5));
      }
    } catch (Throwable var7) {
    }
  }

  private static Object getField(Object var0, String var1) {
    try {
      Field var2 = findField(var0.getClass(), var1);
      if (var2 == null) {
        return null;
      } else {
        var2.setAccessible(true);
        return var2.get(var0);
      }
    } catch (Throwable var3) {
      return null;
    }
  }

  private static Field findField(Class<?> var0, String var1) {
    for (Class var2 = var0; var2 != null; var2 = var2.getSuperclass()) {
      try {
        return var2.getDeclaredField(var1);
      } catch (NoSuchFieldException var4) {
      }
    }

    return null;
  }

  @Override
  public void run() {
    try {
      this.target.__jnt__init__3695260628471627179__();
    } catch (Throwable var2) {
      var2.printStackTrace();
    }
  }
}
