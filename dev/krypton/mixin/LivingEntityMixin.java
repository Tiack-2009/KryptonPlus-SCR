
package dev.krypton.mixin;

// KryptonPlus Mixin: LivingEntityMixin

import net.minecraft.LivingEntity;
import net.minecraft.ClientPlayerEntity;
import net.minecraft.class_4048;
import net.minecraft.class_4050;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({LivingEntity.class})
public abstract class LivingEntityMixin {
  @Inject(
    method = {"method_55694"},
    at = {@At("HEAD")},
    cancellable = true
  )
  private void getBaseDimensions(class_4050 var1, CallbackInfoReturnable<class_4048> var2) {
    if (this instanceof class_1657 var3) {
      if (var3.method_7340()) {
        return;
      }

      ek var4 = (ek)((jn)((zv)zv.kh).jca).icz(ek.class);
      if (var4.eb()) {
        var2.setReturnValue(class_4048.method_18384(0.6F, 1.8F).method_55685(1.62F));
      }
    }
  }

  @Inject(
    method = {"method_6028"},
    at = {@At("HEAD")},
    cancellable = true
  )
  private void modifySwingDuration(CallbackInfoReturnable<Integer> var1) {
    if (this instanceof class_1657 var2) {
      if (var2.method_7340()) {
        if ((zv)zv.kh != null && (jn)((zv)zv.kh).jca != null) {
          vsv var3 = (vsv)((jn)((zv)zv.kh).jca).icz(vsv.class);
          if (var3 != null && var3.eb()) {
            var1.setReturnValue(var3.icb());
          }
        }
      }
    }
  }
}
