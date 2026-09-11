
package dev.krypton.mixin;

// KryptonPlus Mixin: MinecraftClientMixin

import net.minecraft.class_1041;
import net.minecraft.ClientPlayerEntity;
import net.minecraft.MinecraftClient;
import net.minecraft.class_3966;
import net.minecraft.class_437;
import net.minecraft.class_638;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({MinecraftClient.class})
public class MinecraftClientMixin {
  @Shadow
  @Nullable
  public class_638 field_1687;
  @Shadow
  @Final
  private class_1041 field_1704;
  @Shadow
  private int field_1752;

  @Inject(
    method = {"method_1574"},
    at = {@At("HEAD")}
  )
  private void onTick(CallbackInfo var1) {
    jh var2 = new jh();
    gy.cj(var2);
    if (this.field_1687 != null) {
      by var3 = new by();
      gy.cj(var3);
    }
  }

  @Inject(
    method = {"method_15993"},
    at = {@At("HEAD")}
  )
  private void onResolutionChanged(CallbackInfo var1) {
    gy.cj(new sj(this.field_1704));
  }

  @Inject(
    method = {"method_1583"},
    at = {@At("RETURN")},
    cancellable = true
  )
  private void onItemUseReturn(CallbackInfo var1) {
    uvi var2 = new uvi(this.field_1752);
    gy.cj(var2);
    if (var2.zzk()) {
      var1.cancel();
    }

    this.field_1752 = var2.ha;
  }

  @Inject(
    method = {"method_1583"},
    at = {@At("HEAD")},
    cancellable = true
  )
  private void onItemUseHead(CallbackInfo var1) {
    pa var2 = new pa(this.field_1752);
    gy.cj(var2);
    if (var2.zzk()) {
      var1.cancel();
    }

    this.field_1752 = var2.ha;
  }

  @Inject(
    method = {"method_1536"},
    at = {@At("HEAD")},
    cancellable = true
  )
  private void onAttack(CallbackInfoReturnable<Boolean> var1) {
    ke var2 = new ke();
    gy.cj(var2);
    if (var2.zzk()) {
      var1.cancel();
      var1.setReturnValue(false);
    } else {
      cd var3 = (cd)((jn)((zv)zv.kh).jca).icz(cd.class);
      if (var3.pix.fqw()) {
        if (((MinecraftClient)zv.gk).field_1724 != null) {
          if (((MinecraftClient)zv.gk).field_1755 == null) {
            if (((MinecraftClient)zv.gk).field_1765 instanceof class_3966 var4) {
              if (var4.method_17782() instanceof class_1657 var7) {
                if (var3.mb(var7)) {
                  var2.dw();
                }
              }
            }
          }
        }
      }
    }
  }

  @Inject(
    method = {"method_1590"},
    at = {@At("HEAD")},
    cancellable = true
  )
  private void onBlockBreaking(boolean var1, CallbackInfo var2) {
    je var3 = new je();
    gy.cj(var3);
    if (var3.zzk()) {
      var2.cancel();
    }
  }

  @Inject(
    method = {"method_1507"},
    at = {@At("HEAD")},
    cancellable = true
  )
  private void onSetScreen(class_437 var1, CallbackInfo var2) {
    v var3 = new v(var1);
    gy.cj(var3);
    if (var3.zzk()) {
      var2.cancel();
    }
  }

  @Inject(
    method = {"method_1490"},
    at = {@At("HEAD")}
  )
  private void onClose(CallbackInfo var1) {
    ((zv)zv.kh).mgb().ev();
    ((zv)zv.kh).mgb().ql();
  }

  @Inject(
    method = {"<init>"},
    at = {@At("TAIL")}
  )
  private void onInit(CallbackInfo var1) {
    KryptonInitShim.startClientInit(zv.kh);
    ((zv)zv.kh).as();
  }
}
