

package xyz.trolly.lanlimit.mixin;


import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.At;
import net.minecraft.server.PlayerManager;


@Mixin(PlayerManager.class)
public class LANLimitMixin {
 //Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/util/registry/DynamicRegistryManager/Impl;Lnet/minecraft/world/WorldSaveHandler;I
    @ModifyVariable(method = "<init>", at = @At(value = "HEAD"))
    private static int injected(int maxPlayers) {

        if (maxPlayers == 8) { return 64; }
        return maxPlayers;
    }
}