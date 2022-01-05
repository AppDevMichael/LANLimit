

package xyz.trolly.lanlimit.mixin;


import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.At;
import net.minecraft.server.PlayerManager;


@Mixin(PlayerManager.class)
public class LANLimitMixin {

    @ModifyVariable(method = "<init>()V", at = @At(value = "HEAD"), ordinal = 0)
    private static int injected(int maxPlayers) {

        if (maxPlayers == 8) { return 64; }
        return maxPlayers;
    }
}