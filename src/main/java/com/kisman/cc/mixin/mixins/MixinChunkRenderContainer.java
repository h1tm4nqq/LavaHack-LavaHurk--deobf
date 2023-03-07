/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.ChunkRenderContainer
 *  net.minecraft.client.renderer.chunk.RenderChunk
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins;

import lavahack.client.D2A33i4puy3VG87sLGopuKBa7759W0RD;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.renderer.ChunkRenderContainer;
import net.minecraft.client.renderer.chunk.RenderChunk;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={ChunkRenderContainer.class})
public class MixinChunkRenderContainer {
    @Inject(method={"preRenderChunk"}, at={@At(value="RETURN", target="Lnet/minecraft/client/renderer/chunk/RenderChunk;getPosition()Lnet/minecraft/util/math/BlockPos/MutableBlockPos;")})
    @Inject(method={"preRenderChunk"}, at={@At(value="RETURN", target="Lnet/minecraft/client/renderer/chunk/RenderChunk;getPosition()Lnet/minecraft/util/math/BlockPos/MutableBlockPos;")})
    private void Method140(RenderChunk renderChunk, CallbackInfo callbackInfo) {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(new D2A33i4puy3VG87sLGopuKBa7759W0RD(renderChunk));
    }
}

