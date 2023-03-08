//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.baritone;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.renderer.chunk.*;
import net.minecraft.world.*;
import baritone.*;
import net.minecraft.client.*;
import baritone.api.*;
import baritone.api.utils.*;
import net.minecraft.util.math.*;
import org.spongepowered.asm.mixin.injection.*;
import net.minecraft.block.state.*;

@Mixin({ RenderChunk.class })
public class MixinRenderChunk
{
    @Redirect(method = { "rebuildChunk" }, at = @At(value = "INVOKE", target = "net/minecraft/world/ChunkCache.isEmpty()Z"))
    @Redirect(method = { "rebuildChunk" }, at = @At(value = "INVOKE", target = "net/minecraft/world/ChunkCache.isEmpty()Z"))
    private boolean Method7536(final ChunkCache chunkCache) {
        if (!chunkCache.isEmpty()) {
            return false;
        }
        if ((boolean)Baritone.settings().renderCachedChunks.value && !Minecraft.getMinecraft().isSingleplayer()) {
            final Baritone baritone = (Baritone)BaritoneAPI.getProvider().getPrimaryBaritone();
            final IPlayerContext playerContext = baritone.getPlayerContext();
            if (playerContext.player() != null && playerContext.world() != null && baritone.bsi != null) {
                final BlockPos getPosition = ((RenderChunk)this).getPosition();
                for (int n = -1, n2 = -1; !baritone.bsi.isLoaded(16 * n + getPosition.getX(), 16 * n2 + getPosition.getZ()); ++n2) {}
                return false;
            }
        }
        return true;
    }
    
    @Redirect(method = { "rebuildChunk" }, at = @At(value = "INVOKE", target = "net/minecraft/world/ChunkCache.getBlockState(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;"))
    @Redirect(method = { "rebuildChunk" }, at = @At(value = "INVOKE", target = "net/minecraft/world/ChunkCache.getBlockState(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;"))
    private IBlockState Method7537(final ChunkCache chunkCache, final BlockPos blockPos) {
        if ((boolean)Baritone.settings().renderCachedChunks.value && !Minecraft.getMinecraft().isSingleplayer()) {
            final Baritone baritone = (Baritone)BaritoneAPI.getProvider().getPrimaryBaritone();
            final IPlayerContext playerContext = baritone.getPlayerContext();
            if (playerContext.player() != null && playerContext.world() != null && baritone.bsi != null) {
                return baritone.bsi.get0(blockPos);
            }
        }
        return chunkCache.getBlockState(blockPos);
    }
}
