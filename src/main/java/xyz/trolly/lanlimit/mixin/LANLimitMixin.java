

package xyz.trolly.lanlimit.mixin;


import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import net.minecraft.client.gui.screen.TitleScreen;

import net.minecraft.server.MinecraftServer;
import net.minecraft.server.PlayerManager;
import net.minecraft.server.integrated.IntegratedServer;
import net.minecraft.util.registry.DynamicRegistryManager;
import net.minecraft.world.WorldSaveHandler;


@Mixin(PlayerManager.class)
public class LANLimitMixin {

    @ModifyVariable(method = "<init>()V",
                    at = @At(value = "HEAD"), ordinal = 0)
    private static int injected(
                          int maxPlayers) {

        // if (server instanceof IntegratedServer) {

        //     return 10;
        // }
        return 10;
    }
    // }
    // @ModifyArg(method =
    // "<init>(Lnet/minecraft/server/integratedIntegratedServer;Lnet/minecraft/util/registry/DynamicRegistryManager/Impl;Lnet/minecraft/world/WorldSaveHandler;)V",
    // at = @At(value = "INVOKE",
    // target =
    // "Lnet/minecraft/server/PlayerManager;PlayerManager(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/util/registry/DynamicRegistryManager/Impl;Lnet/minecraft/world/WorldSaveHandler;I)V"),
    // index = 3)
    // private int injected(int x) {
    // return 10;
    // }
}