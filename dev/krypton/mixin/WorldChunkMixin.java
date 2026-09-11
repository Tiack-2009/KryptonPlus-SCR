
package dev.krypton.mixin;

// KryptonPlus Mixin: WorldChunkMixin

import net.minecraft.World;
import net.minecraft.BlockPos;
import net.minecraft.BlockState;
import net.minecraft.ClientWorld;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({ClientWorld.class})
public class WorldChunkMixin {
  @Shadow
  @Final
  class_1937 field_12858;

  @Inject(
    method = {"method_12010"},
    at = {@At("TAIL")}
  )
  private void onSetBlockState(class_2338 var1, class_2680 var2, int var3, CallbackInfoReturnable<class_2680> var4) {
    if (this.field_12858.method_8608()) {
      gy.cj(new jqs(var1, (BlockState)var4.getReturnValue(), var2));
    }
  }
}
