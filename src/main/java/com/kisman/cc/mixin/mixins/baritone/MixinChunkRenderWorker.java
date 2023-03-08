//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.baritone;

import net.minecraft.client.renderer.chunk.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;
import org.spongepowered.asm.mixin.*;
import baritone.*;
import net.minecraft.client.*;
import baritone.api.*;
import baritone.api.utils.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ ChunkRenderWorker.class })
public class MixinChunkRenderWorker
{
    @Shadow
    @Shadow
    private boolean Method1519(final BlockPos blockPos, final World world) {
        return false;
    }
    
    @Redirect(method = { "processTask" }, at = @At(value = "INVOKE", target = "net/minecraft/client/renderer/chunk/ChunkRenderWorker.isChunkExisting(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/World;)Z"))
    @Redirect(method = { "processTask" }, at = @At(value = "INVOKE", target = "net/minecraft/client/renderer/chunk/ChunkRenderWorker.isChunkExisting(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/World;)Z"))
    private boolean Method1520(final ChunkRenderWorker chunkRenderWorker, final BlockPos blockPos, final World world) {
        if ((boolean)Baritone.settings().renderCachedChunks.value && !Minecraft.getMinecraft().isSingleplayer()) {
            final Baritone baritone = (Baritone)BaritoneAPI.getProvider().getPrimaryBaritone();
            final IPlayerContext playerContext = baritone.getPlayerContext();
            if (playerContext.player() != null && playerContext.world() != null && baritone.bsi != null) {
                return baritone.bsi.isLoaded(blockPos.getX(), blockPos.getZ()) || this.Method1519(blockPos, world);
            }
        }
        return this.Method1519(blockPos, world);
    }
}
