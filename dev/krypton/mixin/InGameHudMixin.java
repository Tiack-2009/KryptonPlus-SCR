
package dev.krypton.mixin;

// KryptonPlus Mixin: InGameHudMixin

import net.minecraft.MinecraftClient;
import net.minecraft.HandledScreen;
import net.minecraft.DrawContext;
import net.minecraft.class_9779;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({HandledScreen.class})
public class InGameHudMixin {
  @Inject(
    method = {"method_1753"},
    at = {@At("HEAD")}
  )
  private void onRenderHud(class_332 var1, class_9779 var2, CallbackInfo var3) {
    xo var4 = new xo(var1, var2.method_60637(true));
    gy.cj(var4);
  }

  @Inject(
    method = {"method_1765"},
    at = {@At("HEAD")},
    cancellable = true
  )
  private void onRenderStatusEffects(class_332 var1, class_9779 var2, CallbackInfo var3) {
    un var4 = (un)((zv)zv.kh).bb().icz(un.class);
    if (var4 != null && var4.eb()) {
      var3.cancel();
    }
  }

  @Inject(
    method = {"method_1736"},
    at = {@At("HEAD")},
    cancellable = true
  )
  private void onRenderCrosshair(class_332 var1, class_9779 var2, CallbackInfo var3) {
    if (((MinecraftClient)zv.gk).field_1755 instanceof yh) {
      var3.cancel();
    }
  }
}
