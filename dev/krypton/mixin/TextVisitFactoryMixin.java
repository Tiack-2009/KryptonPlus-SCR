
package dev.krypton.mixin;

// KryptonPlus Mixin: TextVisitFactoryMixin

import net.minecraft.class_5223;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({class_5223.class})
public class TextVisitFactoryMixin {
  private static String adjustText(String var0) {
    return var0;
  }
}
