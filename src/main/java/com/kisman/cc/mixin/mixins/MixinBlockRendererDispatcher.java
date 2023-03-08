//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.block.state.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;
import net.minecraft.client.renderer.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import lavahack.client.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ BlockRendererDispatcher.class })
public class MixinBlockRendererDispatcher
{
    @Inject(method = { "renderBlock" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "renderBlock" }, at = { @At("HEAD") }, cancellable = true)
    private void Method3865(final IBlockState blockState, final BlockPos blockPos, final IBlockAccess blockAccess, final BufferBuilder bufferBuilder, final CallbackInfoReturnable callbackInfoReturnable) {
        final pkFsFgiZykGBET8wx0XXygS5258qy2Bd pkFsFgiZykGBET8wx0XXygS5258qy2Bd = new pkFsFgiZykGBET8wx0XXygS5258qy2Bd(blockState, blockPos);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)pkFsFgiZykGBET8wx0XXygS5258qy2Bd);
        if (pkFsFgiZykGBET8wx0XXygS5258qy2Bd.Method159()) {
            callbackInfoReturnable.setReturnValue((Object)false);
            callbackInfoReturnable.cancel();
        }
    }
}
