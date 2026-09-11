
package dev.krypton.mixin;

// KryptonPlus Mixin: HeldItemRendererMixin

import net.minecraft.Identifier;
import net.minecraft.class_759;
import net.minecraft.class_8685;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin({class_759.class})
public class HeldItemRendererMixin {
  @ModifyVariable(
    method = {"method_3216"},
    at = @At("STORE"),
    ordinal = 0
  )
  private class_2960 modifyArmTexture(class_2960 var1) {
    return this.getOverrideSkinTexture(var1);
  }

  @ModifyVariable(
    method = {"method_3219"},
    at = @At("STORE"),
    ordinal = 0
  )
  private class_2960 modifyArmHoldingItemTexture(class_2960 var1) {
    return this.getOverrideSkinTexture(var1);
  }

  private class_2960 getOverrideSkinTexture(class_2960 var1) {
    g var2 = (g)((jn)((zv)zv.kh).jca).icz(g.class);
    if (var2 != null && var2.eb() && var2.fuu()) {
      class_8685 var3 = var2.jr();
      if (var3 != null) {
        return var3.comp_1626().comp_3627();
      }
    }

    return var1;
  }
}
