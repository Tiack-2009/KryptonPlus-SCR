
package dev.krypton.mixin;

// KryptonPlus Mixin: ClientConnectionMixin

import io.netty.channel.ChannelPipeline;
import io.netty.handler.proxy.Socks4ProxyHandler;
import io.netty.handler.proxy.Socks5ProxyHandler;
import java.net.InetSocketAddress;
import net.minecraft.class_2535;
import net.minecraft.class_2547;
import net.minecraft.class_2596;
import net.minecraft.class_2598;
import net.minecraft.class_8762;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_2535.class})
public class ClientConnectionMixin {
  @Inject(
    method = {"method_10759"},
    at = {@At("HEAD")},
    cancellable = true
  )
  private static <T extends class_2547> void onPacketReceive(class_2596<T> var0, class_2547 var1, CallbackInfo var2) {
    xyk var3 = new xyk(var0);
    gy.cj(var3);
    if (var3.zzk()) {
      var2.cancel();
    }
  }

  @Inject(
    method = {"method_10743(Lnet/minecraft/class_2596;)V"},
    at = {@At("HEAD")},
    cancellable = true
  )
  private void onPacketSend(class_2596<?> var1, CallbackInfo var2) {
    u var3 = new u(var1);
    gy.cj(var3);
    if (var3.zzk()) {
      var2.cancel();
    }
  }

  @Inject(
    method = {"method_48311"},
    at = {@At("RETURN")}
  )
  private static void injectProxy(ChannelPipeline var0, class_2598 var1, boolean var2, class_8762 var3, CallbackInfo var4) {
    if (var1 == class_2598.field_11942 && !var2) {
      vx var5 = vx.ldu();
      if (var5 != null && var5.eb() && !var5.fvd.je().isBlank()) {
        int var6;
        try {
          var6 = Integer.parseInt(var5.rsq.je().trim());
        } catch (NumberFormatException var10) {
          return;
        }

        if (var6 >= 1 && var6 <= 65535) {
          InetSocketAddress var7 = new InetSocketAddress(var5.fvd.je(), var6);
          String var8 = var5.ixh.je();
          String var9 = var5.mu.je();
          if (var5.si.ac(war.gcd)) {
            var0.addFirst("socks-proxy", var8.isBlank() ? new Socks4ProxyHandler(var7) : new Socks4ProxyHandler(var7, var8));
          } else {
            var0.addFirst("socks-proxy", var8.isBlank() ? new Socks5ProxyHandler(var7) : new Socks5ProxyHandler(var7, var8, var9));
          }
        }
      }
    }
  }
}
