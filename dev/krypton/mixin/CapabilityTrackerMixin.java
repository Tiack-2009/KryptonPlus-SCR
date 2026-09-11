
package dev.krypton.mixin;

// KryptonPlus Mixin: CapabilityTrackerMixin

import com.mojang.blaze3d.opengl.GlStateManager.class_1018;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin({class_1018.class})
public abstract class CapabilityTrackerMixin implements qq {
  @Shadow
  private boolean field_5051;

  @Shadow
  public abstract void method_4470(boolean var1);

  @Override
  public boolean a() {
    return this.field_5051;
  }

  @Override
  public void ez(boolean var1) {
    this.method_4470(var1);
  }
}
