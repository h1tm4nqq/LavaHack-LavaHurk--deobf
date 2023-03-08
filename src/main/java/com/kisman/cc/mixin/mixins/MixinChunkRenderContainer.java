//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.chunk.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import lavahack.client.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ ChunkRenderContainer.class })
public class MixinChunkRenderContainer
{
    @Inject(method = { "preRenderChunk" }, at = { @At(value = "RETURN", target = "Lnet/minecraft/client/renderer/chunk/RenderChunk;getPosition()Lnet/minecraft/util/math/BlockPos/MutableBlockPos;") })
    @Inject(method = { "preRenderChunk" }, at = { @At(value = "RETURN", target = "Lnet/minecraft/client/renderer/chunk/RenderChunk;getPosition()Lnet/minecraft/util/math/BlockPos/MutableBlockPos;") })
    private void Method140(final RenderChunk renderChunk, final CallbackInfo callbackInfo) {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)new D2A33i4puy3VG87sLGopuKBa7759W0RD(renderChunk));
    }
}
