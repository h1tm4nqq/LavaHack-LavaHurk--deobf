//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.BaritoneAPI
 *  baritone.api.utils.IPlayerContext
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.chunk.RenderChunk
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.ChunkCache
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package com.kisman.cc.mixin.mixins.baritone;

import baritone.Baritone;
import baritone.api.BaritoneAPI;
import baritone.api.utils.IPlayerContext;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ChunkCache;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={RenderChunk.class})
public class MixinRenderChunk {
    @Redirect(method={"rebuildChunk"}, at=@At(value="INVOKE", target="net/minecraft/world/ChunkCache.isEmpty()Z"))
    @Redirect(method={"rebuildChunk"}, at=@At(value="INVOKE", target="net/minecraft/world/ChunkCache.isEmpty()Z"))
    private boolean Method7536(ChunkCache chunkCache) {
        if (!chunkCache.isEmpty()) {
            return false;
        }
        if ((Boolean)Baritone.settings().renderCachedChunks.value == false) return true;
        if (Minecraft.getMinecraft().isSingleplayer()) return true;
        Baritone baritone = (Baritone)BaritoneAPI.getProvider().getPrimaryBaritone();
        IPlayerContext iPlayerContext = baritone.getPlayerContext();
        if (iPlayerContext.player() == null) return true;
        if (iPlayerContext.world() == null) return true;
        if (baritone.bsi == null) return true;
        BlockPos blockPos = ((RenderChunk)this).getPosition();
        int n = -1;
        int n2 = -1;
        while (!baritone.bsi.isLoaded(16 * n + blockPos.getX(), 16 * n2 + blockPos.getZ())) {
            ++n2;
        }
        return false;
    }

    @Redirect(method={"rebuildChunk"}, at=@At(value="INVOKE", target="net/minecraft/world/ChunkCache.getBlockState(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;"))
    @Redirect(method={"rebuildChunk"}, at=@At(value="INVOKE", target="net/minecraft/world/ChunkCache.getBlockState(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;"))
    private IBlockState Method7537(ChunkCache chunkCache, BlockPos blockPos) {
        if ((Boolean)Baritone.settings().renderCachedChunks.value == false) return chunkCache.getBlockState(blockPos);
        if (Minecraft.getMinecraft().isSingleplayer()) return chunkCache.getBlockState(blockPos);
        Baritone baritone = (Baritone)BaritoneAPI.getProvider().getPrimaryBaritone();
        IPlayerContext iPlayerContext = baritone.getPlayerContext();
        if (iPlayerContext.player() == null) return chunkCache.getBlockState(blockPos);
        if (iPlayerContext.world() == null) return chunkCache.getBlockState(blockPos);
        if (baritone.bsi == null) return chunkCache.getBlockState(blockPos);
        return baritone.bsi.get0(blockPos);
    }
}

