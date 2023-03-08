//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.baritone;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.renderer.chunk.*;
import net.minecraft.util.math.*;
import baritone.*;
import net.minecraft.client.*;
import net.minecraft.client.renderer.*;
import org.lwjgl.opengl.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ ChunkRenderContainer.class })
public class MixinChunkRenderContainer
{
    @Redirect(method = { "preRenderChunk" }, at = @At(value = "INVOKE", target = "net/minecraft/client/renderer/chunk/RenderChunk.getPosition()Lnet/minecraft/util/math/BlockPos;"))
    @Redirect(method = { "preRenderChunk" }, at = @At(value = "INVOKE", target = "net/minecraft/client/renderer/chunk/RenderChunk.getPosition()Lnet/minecraft/util/math/BlockPos;"))
    private BlockPos Method2654(final RenderChunk renderChunk) {
        if ((boolean)Baritone.settings().renderCachedChunks.value && !Minecraft.getMinecraft().isSingleplayer() && Minecraft.getMinecraft().world.getChunk(renderChunk.getPosition()).isEmpty()) {
            GlStateManager.enableAlpha();
            GlStateManager.enableBlend();
            GL14.glBlendColor(0.0f, 0.0f, 0.0f, (float)Baritone.settings().cachedChunksOpacity.value);
            GlStateManager.tryBlendFuncSeparate(32771, 32772, 1, 0);
        }
        return renderChunk.getPosition();
    }
}
