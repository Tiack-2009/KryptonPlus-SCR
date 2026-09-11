
package dev.krypton.mixin;

// KryptonPlus Mixin: GameRendererMixin

import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.class_11228;
import net.minecraft.class_11246;
import net.minecraft.MinecraftClient;
import net.minecraft.DrawContext;
import net.minecraft.Camera;
import net.minecraft.MatrixStack;
import net.minecraft.WorldRenderer;
import net.minecraft.class_758;
import net.minecraft.class_9779;
import net.minecraft.class_758.class_4596;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin({WorldRenderer.class})
public abstract class GameRendererMixin {
  @Shadow
  @Final
  class_11246 field_59966;
  @Shadow
  @Final
  private class_4184 field_18765;
  @Shadow
  @Final
  private class_310 field_4015;
  @Shadow
  @Final
  private class_11228 field_59965;
  @Shadow
  @Final
  private class_758 field_60793;
  @Unique
  private oi renderer;

  @Shadow
  protected abstract void method_3186(class_4587 var1, float var2);

  @Shadow
  protected abstract void method_3198(class_4587 var1, float var2);

  @Inject(
    method = {"method_3188"},
    at = {@At(
      value = "INVOKE_STRING",
      target = "Lnet/minecraft/class_3695;method_15405(Ljava/lang/String;)V",
      args = {"ldc=hand"}
    )},
    locals = LocalCapture.CAPTURE_FAILEXCEPTION
  )
  private void onRenderWorld(
    class_9779 var1,
    CallbackInfo var2,
    @Local(ordinal = 0) Matrix4f var3,
    @Local(ordinal = 1) Matrix4f var4,
    @Local(ordinal = 0) float var5,
    @Local class_4587 var6
  ) {
    if ((MinecraftClient)zv.gk != null && ((MinecraftClient)zv.gk).field_1687 != null && ((MinecraftClient)zv.gk).field_1724 != null) {
      if (this.renderer == null) {
        this.renderer = new oi(dz.sg, dz.juj);
      }

      c.jjz(var3, var4);
      RenderSystem.getModelViewStack().pushMatrix().mul(var4);
      ((MatrixStack)zv.ftq).method_22903();
      this.method_3198((MatrixStack)zv.ftq, this.field_18765.method_55437());
      if ((Boolean)((MinecraftClient)zv.gk).field_1690.method_42448().method_41753()) {
        this.method_3186((MatrixStack)zv.ftq, this.field_18765.method_55437());
      }

      Matrix4f var7 = new Matrix4f(((MatrixStack)zv.ftq).method_23760().method_23761()).invert();
      RenderSystem.getModelViewStack().mul(var7);
      ((MatrixStack)zv.ftq).method_22909();
      this.renderer.dp();
      gy.cj(
        new lf(
          var6,
          this.renderer,
          var5,
          this.field_18765.method_71156().field_1352,
          this.field_18765.method_71156().field_1351,
          this.field_18765.method_71156().field_1350
        )
      );
      this.renderer.bxj(var6);
      RenderSystem.getModelViewStack().popMatrix();
    }
  }

  @Inject(
    method = {"method_3202"},
    at = {@At("HEAD")},
    cancellable = true
  )
  private void onShouldRenderBlockOutline(CallbackInfoReturnable<Boolean> var1) {
    if (((oy)((zv)zv.kh).bb().icz(oy.class)).eb()) {
      var1.setReturnValue(false);
    }
  }

  @Inject(
    method = {"method_3192"},
    at = {@At(
      value = "INVOKE",
      target = "Lnet/minecraft/class_11228;method_70890(Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V",
      shift = Shift.AFTER
    )}
  )
  private void onRenderGui(class_9779 var1, boolean var2, CallbackInfo var3) {
    if (this.field_4015.field_1755 instanceof yva var4) {
      this.field_59966.method_70926();
      int var8 = (int)this.field_4015.field_1729.method_68879(this.field_4015.method_22683());
      int var6 = (int)this.field_4015.field_1729.method_68883(this.field_4015.method_22683());
      class_332 var7 = new class_332(this.field_4015, this.field_59966, var8, var6);
      var4.fgk(var7, var8, var6, var1.method_60636());
      RenderSystem.getDevice().createCommandEncoder().clearDepthTexture(this.field_4015.method_1522().method_30278(), 1.0);
      this.field_59965.method_70890(this.field_60793.method_71109(class_4596.field_60101));
      this.field_59965.method_70879();
    }
  }
}
