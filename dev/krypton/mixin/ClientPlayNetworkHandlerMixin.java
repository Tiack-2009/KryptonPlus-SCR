
package dev.krypton.mixin;

// KryptonPlus Mixin: ClientPlayNetworkHandlerMixin

import net.minecraft.class_2604;
import net.minecraft.class_2663;
import net.minecraft.class_2672;
import net.minecraft.class_2678;
import net.minecraft.MinecraftClient;
import net.minecraft.class_5900;
import net.minecraft.class_634;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_634.class})
public abstract class ClientPlayNetworkHandlerMixin {
  @Inject(
    method = {"method_11128"},
    at = {@At("TAIL")}
  )
  private void onChunkData(class_2672 var1, CallbackInfo var2) {
    gy.cj(new zb(var1));
  }

  @Inject(
    method = {"method_11112"},
    at = {@At("HEAD")},
    cancellable = true
  )
  private void onEntitySpawn(class_2604 var1, CallbackInfo var2) {
    yf var3 = new yf(var1);
    gy.cj(var3);
    if (var3.zzk()) {
      var2.cancel();
    }
  }

  @Inject(
    method = {"method_11099"},
    at = {@At("TAIL")}
  )
  private void onTeam(class_5900 var1, CallbackInfo var2) {
    gy.cj(new lr(var1));
  }

  @Inject(
    method = {"method_11120"},
    at = {@At("HEAD")}
  )
  private void onJoin(class_2678 var1, CallbackInfo var2) {
    gy.cj(new cz());
  }

  @Inject(
    method = {"method_11148"},
    at = {@At("HEAD")}
  )
  private void onEntityStatus(class_2663 var1, CallbackInfo var2) {
    class_310 var3 = class_310.method_1551();
    if (var3.field_1724 != null && var3.field_1687 != null) {
      if (var1.method_11469(var3.field_1687) == var3.field_1724 && var1.method_11470() == 35) {
        gy.cj(new sbw());
      }
    }
  }
}
