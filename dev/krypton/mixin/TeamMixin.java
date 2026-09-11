
package dev.krypton.mixin;

// KryptonPlus Mixin: TeamMixin

import net.minecraft.Text;
import net.minecraft.class_268;
import net.minecraft.class_270;
import net.minecraft.class_5250;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_268.class})
public class TeamMixin {
  @Inject(
    method = {"method_1142(Lnet/minecraft/class_270;Lnet/minecraft/class_2561;)Lnet/minecraft/class_5250;"},
    at = {@At("RETURN")},
    cancellable = true
  )
  private static void onDecorateName(class_270 var0, class_2561 var1, CallbackInfoReturnable<class_5250> var2) {
    nz var3 = (nz)((jn)((zv)zv.kh).jca).icz(nz.class);
    if (var3 != null && var3.eb()) {
      class_5250 var4 = (class_5250)var2.getReturnValue();
      class_2561 var5 = var3.sh(var4);
      if (var5 != var4) {
        var2.setReturnValue((class_5250)var5);
      }
    }
  }
}
