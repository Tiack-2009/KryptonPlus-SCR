
package dev.krypton.mixin;

// KryptonPlus Mixin: CameraMixin

import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.Entity;
import net.minecraft.World;
import net.minecraft.Camera;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin({Camera.class})
public class CameraMixin {
  @Shadow
  private boolean field_18719;
  @Shadow
  private class_1937 field_18710;
  @Unique
  private float tickDelta;

  @Inject(
    method = {"method_19321"},
    at = {@At("HEAD")}
  )
  private void onUpdateHead(class_1937 var1, class_1297 var2, boolean var3, boolean var4, float var5, CallbackInfo var6) {
    this.tickDelta = var5;
  }

  @ModifyArgs(
    method = {"method_19321"},
    at = @At(
      value = "INVOKE",
      target = "Lnet/minecraft/class_4184;method_19327(DDD)V"
    )
  )
  private void update(Args var1) {
    oy var2 = (oy)((jn)((zv)zv.kh).jca).icz(oy.class);
    if (var2.eb()) {
      var1.set(0, var2.sum(this.tickDelta));
      var1.set(1, var2.cvn(this.tickDelta));
      var1.set(2, var2.tmh(this.tickDelta));
    }
  }

  @ModifyArgs(
    method = {"method_19321"},
    at = @At(
      value = "INVOKE",
      target = "Lnet/minecraft/class_4184;method_19325(FF)V"
    )
  )
  private void onUpdateSetRotationArgs(Args var1) {
    oy var2 = (oy)((jn)((zv)zv.kh).jca).icz(oy.class);
    vjf var3 = (vjf)((jn)((zv)zv.kh).jca).icz(vjf.class);
    if (var3.eb()) {
      var1.set(0, var3.cy);
      var1.set(1, var3.cb);
    }

    if (var2.eb()) {
      var1.set(0, (float)var2.mkm(this.tickDelta));
      var1.set(1, (float)var2.vs(this.tickDelta));
    }
  }

  @ModifyArgs(
    method = {"method_19321"},
    at = @At(
      value = "INVOKE",
      target = "Lnet/minecraft/class_4184;method_19327(DDD)V"
    )
  )
  private void onUpdateSetPosArgs(Args var1, @Local(argsOnly = true) float var2) {
    oy var3 = (oy)((jn)((zv)zv.kh).jca).icz(oy.class);
    if (var3.eb()) {
      var1.set(0, var3.sum(var2));
      var1.set(1, var3.cvn(var2));
      var1.set(2, var3.tmh(var2));
    }
  }

  @Inject(
    method = {"method_19321"},
    at = {@At("TAIL")}
  )
  private void onUpdateTail(class_1937 var1, class_1297 var2, boolean var3, boolean var4, float var5, CallbackInfo var6) {
    oy var7 = (oy)((jn)((zv)zv.kh).jca).icz(oy.class);
    if (var7.eb()) {
      this.field_18719 = true;
    }
  }

  @ModifyVariable(
    method = {"method_19318"},
    at = @At("HEAD"),
    ordinal = 0,
    argsOnly = true
  )
  private float modifyClipToSpace(float var1) {
    oy var2 = (oy)((jn)((zv)zv.kh).jca).icz(oy.class);
    return var2.eb() ? 0.0F : var1;
  }
}
