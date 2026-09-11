
package dev.krypton.mixin;

// KryptonPlus Mixin: MinecraftClientAccessor

import net.minecraft.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({MinecraftClient.class})
public interface MinecraftClientAccessor {
  @Invoker("method_1583")
  void invokeDoItemUse();
}
