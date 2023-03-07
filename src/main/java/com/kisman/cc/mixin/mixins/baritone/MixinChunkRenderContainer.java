//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.ChunkRenderContainer
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.chunk.RenderChunk
 *  net.minecraft.util.math.BlockPos
 *  org.lwjgl.opengl.GL14
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package com.kisman.cc.mixin.mixins.baritone;

import baritone.Baritone;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ChunkRenderContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.util.math.BlockPos;
import org.lwjgl.opengl.GL14;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={ChunkRenderContainer.class})
public class MixinChunkRenderContainer {
    @Redirect(method={"preRenderChunk"}, at=@At(value="INVOKE", target="net/minecraft/client/renderer/chunk/RenderChunk.getPosition()Lnet/minecraft/util/math/BlockPos;"))
    @Redirect(method={"preRenderChunk"}, at=@At(value="INVOKE", target="net/minecraft/client/renderer/chunk/RenderChunk.getPosition()Lnet/minecraft/util/math/BlockPos;"))
    private BlockPos Method2654(RenderChunk renderChunk) {
        if ((Boolean)Baritone.settings().renderCachedChunks.value == false) return renderChunk.getPosition();
        if (Minecraft.getMinecraft().isSingleplayer()) return renderChunk.getPosition();
        if (!Minecraft.getMinecraft().world.getChunk(renderChunk.getPosition()).isEmpty()) return renderChunk.getPosition();
        GlStateManager.enableAlpha();
        GlStateManager.enableBlend();
        GL14.glBlendColor((float)0.0f, (float)0.0f, (float)0.0f, (float)((Float)Baritone.settings().cachedChunksOpacity.value).floatValue());
        GlStateManager.tryBlendFuncSeparate((int)32771, (int)32772, (int)1, (int)0);
        return renderChunk.getPosition();
    }
}

