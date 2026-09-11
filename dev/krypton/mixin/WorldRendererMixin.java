
package dev.krypton.mixin;

// KryptonPlus Mixin: WorldRendererMixin

import net.minecraft.class_761;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin({class_761.class})
public abstract class WorldRendererMixin {
  @ModifyArg(
    method = {"method_22710"},
    at = @At(
      value = "INVOKE",
      target = "Lnet/minecraft/class_761;method_74752(Lnet/minecraft/class_4184;Lnet/minecraft/class_4604;Z)V"
    ),
    index = 2
  )
  private boolean renderSetupTerrainModifyArg(boolean var1) {
    return ((oy)((jn)((zv)zv.kh).jca).icz(oy.class)).eb() || var1;
  }
}
