
package dev.krypton.mixin;

// KryptonPlus Mixin: RenderPipelineMixin

import com.mojang.blaze3d.pipeline.RenderPipeline;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin({RenderPipeline.class})
public abstract class RenderPipelineMixin implements ts {
  @Unique
  private boolean lineSmooth;

  @Override
  public void txw(boolean var1) {
    this.lineSmooth = var1;
  }

  @Override
  public boolean dpe() {
    return this.lineSmooth;
  }
}
