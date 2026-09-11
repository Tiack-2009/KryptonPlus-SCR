
package dev.krypton.mixin;

// KryptonPlus Mixin: KeyboardMixin

import net.minecraft.class_11908;
import net.minecraft.KeyboardInput;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({KeyboardInput.class})
public class KeyboardMixin {
  @Inject(
    method = {"method_1466"},
    at = {@At("HEAD")},
    cancellable = true
  )
  private void onPress(long var1, int var3, class_11908 var4, CallbackInfo var5) {
    if (var4.comp_4795() == 344) {
      KryptonInitShim.openGui();
    } else if (var4.comp_4795() != -1) {
      rx var6 = new rx(var4, var1, var3);
      gy.cj(var6);
      if (var6.zzk()) {
        var5.cancel();
      }
    }
  }
}
