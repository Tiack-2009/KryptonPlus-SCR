
package dev.krypton.mixin;

// KryptonPlus Mixin: CountPlacementModifierAccessor

import net.minecraft.EndCityFeature;
import net.minecraft.StructurePoolBasedGenerator$PieceFactory$79;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({StructurePoolBasedGenerator$PieceFactory$79.class})
public interface CountPlacementModifierAccessor {
  @Accessor("field_35719")
  class_6017 getCount();
}
