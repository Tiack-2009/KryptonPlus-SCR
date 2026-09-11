
package dev.krypton.mixin;

// KryptonPlus Mixin: ChunkOcclusionDataBuilderMixin

import net.minecraft.BlockPos;
import net.minecraft.class_852;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_852.class})
public abstract class ChunkOcclusionDataBuilderMixin {
  @Inject(
    method = {"method_3682"},
    at = {@At("HEAD")},
    cancellable = true
  )
  private void onMarkClosed(class_2338 var1, CallbackInfo var2) {
    d var3 = new d();
    gy.cj(var3);
    if (var3.zzk()) {
      var2.cancel();
    }
  }
}
