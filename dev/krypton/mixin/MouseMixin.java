
package dev.krypton.mixin;

// KryptonPlus Mixin: MouseMixin

import net.minecraft.class_1041;
import net.minecraft.Identifier;
import net.minecraft.class_11910;
import net.minecraft.MinecraftClient;
import net.minecraft.class_312;
import net.minecraft.MinecraftClient;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_312.class})
public abstract class MouseMixin {
  @Shadow
  @Final
  private class_310 field_1779;

  @Shadow
  public abstract double method_68879(class_1041 var1);

  @Shadow
  public abstract double method_68883(class_1041 var1);

  @Inject(
    method = {"method_1601"},
    at = {@At("HEAD")},
    cancellable = true
  )
  private void onMouseButton(long var1, class_11910 var3, int var4, CallbackInfo var5) {
    if (var3.comp_4801() != -1) {
      class_11909 var6 = new class_11909(this.method_68879(this.field_1779.method_22683()), this.method_68883(this.field_1779.method_22683()), var3);
      dq var7 = new dq(var6, var1, var4);
      gy.cj(var7);
      if (var7.zzk()) {
        var5.cancel();
      }
    }
  }

  @Inject(
    method = {"method_1598"},
    at = {@At("HEAD")},
    cancellable = true
  )
  private void onMouseScroll(long var1, double var3, double var5, CallbackInfo var7) {
    zqk var8 = new zqk(var5);
    gy.cj(var8);
    if (var8.zzk()) {
      var7.cancel();
    }
  }

  @Redirect(
    method = {"method_1606"},
    at = @At(
      value = "INVOKE",
      target = "Lnet/minecraft/class_746;method_5872(DD)V"
    )
  )
  private void updateMouseChangeLookDirection(class_746 var1, double var2, double var4) {
    vjf var6 = (vjf)((jn)((zv)zv.kh).jca).icz(vjf.class);
    if (var6 == null || !var6.eb()) {
      var1.method_5872(var2, var4);
    } else if (var6.aw.ac(lv.xwg)) {
      var6.cy = var6.cy + (float)(var2 / (10.0 / var6.bmg.hce()));
      var6.cb = var6.cb + (float)(var4 / (10.0 / var6.bmg.hce()));
      if (Math.abs(var6.cb) > 90.0F) {
        var6.cb = var6.cb > 0.0F ? 90.0F : -90.0F;
      }
    } else {
      var1.method_5872(var2, var4);
    }
  }
}
