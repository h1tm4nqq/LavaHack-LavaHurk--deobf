/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 *  lavahack.client.pkFsFgiZykGBET8wx0XXygS5258qy2Bd
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.renderer.BlockRendererDispatcher
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.IBlockAccess
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.kisman.cc.mixin.mixins;

import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.pkFsFgiZykGBET8wx0XXygS5258qy2Bd;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={BlockRendererDispatcher.class})
public class MixinBlockRendererDispatcher {
    @Inject(method={"renderBlock"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"renderBlock"}, at={@At(value="HEAD")}, cancellable=true)
    private void Method3865(IBlockState iBlockState, BlockPos blockPos, IBlockAccess iBlockAccess, BufferBuilder bufferBuilder, CallbackInfoReturnable callbackInfoReturnable) {
        pkFsFgiZykGBET8wx0XXygS5258qy2Bd pkFsFgiZykGBET8wx0XXygS5258qy2Bd2 = new pkFsFgiZykGBET8wx0XXygS5258qy2Bd(iBlockState, blockPos);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)pkFsFgiZykGBET8wx0XXygS5258qy2Bd2);
        if (!pkFsFgiZykGBET8wx0XXygS5258qy2Bd2.Method159()) return;
        callbackInfoReturnable.setReturnValue((Object)false);
        callbackInfoReturnable.cancel();
    }
}

