
package dev.krypton.mixin;

// KryptonPlus Mixin: DisconnectedScreenMixin

import net.minecraft.Text;
import net.minecraft.class_412;
import net.minecraft.class_4185;
import net.minecraft.class_419;
import net.minecraft.class_437;
import net.minecraft.class_442;
import net.minecraft.class_8667;
import net.minecraft.class_4185.class_7840;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_419.class})
public abstract class DisconnectedScreenMixin extends class_437 {
  @Shadow
  @Final
  private class_8667 field_44552;
  @Unique
  private class_4185 reconnectBtn;
  @Unique
  private double time;

  protected DisconnectedScreenMixin(class_2561 var1) {
    super(var1);
  }

  @Inject(
    method = {"method_25426"},
    at = {@At(
      value = "INVOKE",
      target = "Lnet/minecraft/class_8667;method_48222()V",
      shift = Shift.BEFORE
    )}
  )
  private void addButtons(CallbackInfo var1) {
    jt var2 = this.getAutoReconnect();
    if (var2 != null) {
      this.time = var2.tyb() * 20.0;
      if (var2.ei() != null && !var2.ppe()) {
        this.reconnectBtn = new class_7840(class_2561.method_43470(this.getText()), var1x -> this.tryConnecting()).method_46431();
        this.field_44552.method_52736(this.reconnectBtn);
      }
    }
  }

  public void method_25393() {
    jt var1 = this.getAutoReconnect();
    if (var1 != null && var1.eb() && var1.ei() != null) {
      if (this.time <= 0.0) {
        this.tryConnecting();
      } else {
        this.time--;
        if (this.reconnectBtn != null) {
          this.reconnectBtn.method_25355(class_2561.method_43470(this.getText()));
        }
      }
    }
  }

  @Unique
  private jt getAutoReconnect() {
    return (zv)zv.kh != null && ((zv)zv.kh).bb() != null ? (jt)((zv)zv.kh).bb().icz(jt.class) : null;
  }

  @Unique
  private String getText() {
    jt var1 = this.getAutoReconnect();
    String var2 = "Reconnect";
    if (var1 != null && var1.eb()) {
      var2 = var2 + " " + String.format("(%.1f)", this.time / 20.0);
    }

    return var2;
  }

  @Unique
  private void tryConnecting() {
    jt var1 = this.getAutoReconnect();
    if (var1 != null && var1.ei() != null) {
      class_412.method_36877(new class_442(), this.field_22787, var1.ei(), var1.ax(), false, null);
    }
  }
}
