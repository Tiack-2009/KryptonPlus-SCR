
package dev.krypton.mixin;

// KryptonPlus Mixin: RenderSystemMixin

import com.mojang.blaze3d.systems.RenderSystem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({RenderSystem.class})
public abstract class RenderSystemMixin {
  @Inject(
    method = {"flipFrame"},
    at = {@At("TAIL")}
  )
  private static void krypton$flipFrame(CallbackInfo var0) {
    gr.mcu();
  }
}
