
package dev.krypton.mixin;

// KryptonPlus Mixin: GlBackendMixin

import com.mojang.blaze3d.systems.RenderPass;
import net.minecraft.class_10865;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin({class_10865.class})
public abstract class GlBackendMixin implements ww {
  @Unique
  private int x;
  @Unique
  private int y;
  @Unique
  private int width;
  @Unique
  private int height;
  @Unique
  private boolean set;

  @Override
  public void jq(int var1, int var2, int var3, int var4) {
    if (this.set) {
      throw new IllegalStateException("Currently there can only be one global scissor pushed");
    } else {
      this.x = var1;
      this.y = var2;
      this.width = var3;
      this.height = var4;
      this.set = true;
    }
  }

  @Override
  public void bqc() {
    if (!this.set) {
      throw new IllegalStateException("No scissor pushed");
    } else {
      this.set = false;
    }
  }

  @Deprecated
  @Override
  public void czt(RenderPass var1) {
    if (this.set) {
      var1.enableScissor(this.x, this.y, this.width, this.height);
    }
  }
}
