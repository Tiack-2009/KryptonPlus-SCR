
package dev.krypton.mixin;

// KryptonPlus Mixin: HandledScreenMixin

import net.minecraft.class_1735;
import net.minecraft.PlayerScreenHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({PlayerScreenHandler.class})
public interface HandledScreenMixin {
  @Accessor("field_2787")
  class_1735 getFocusedSlot();
}
