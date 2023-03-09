/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lavahack.client.l6yKOMt7SVcyIzts9W2dZyllrA36dUBL
 *  lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 *  net.minecraft.client.renderer.chunk.RenderChunk
 *  net.minecraft.util.math.BlockPos
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins;

import lavahack.client.l6yKOMt7SVcyIzts9W2dZyllrA36dUBL;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={RenderChunk.class})
public class MixinRenderChunk {
    @Inject(method={"setPosition"}, at={@At(value="RETURN")})
    @Inject(method={"setPosition"}, at={@At(value="RETURN")})
    private void Method2148(int n, int n2, int n3, CallbackInfo callbackInfo) {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)new l6yKOMt7SVcyIzts9W2dZyllrA36dUBL((RenderChunk)this, new BlockPos(n, n2, n3)));
    }
}

