
package dev.krypton.mixin;

// KryptonPlus Mixin: KeyBindingMixin

import net.minecraft.class_1041;
import net.minecraft.class_304;
import net.minecraft.MinecraftClient;
import net.minecraft.class_3675;
import net.minecraft.class_3675.class_306;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin({class_304.class})
public abstract class KeyBindingMixin implements mt {
  @Shadow
  private class_306 field_1655;

  @Override
  public boolean hbp() {
    class_1041 var1 = ((MinecraftClient)zv.gk).method_22683();
    int var2 = this.field_1655.method_1444();
    return class_3675.method_15987(var1, var2);
  }

  @Override
  public void hy() {
    this.method_23481(this.hbp());
  }

  @Shadow
  public abstract void method_23481(boolean var1);
}
