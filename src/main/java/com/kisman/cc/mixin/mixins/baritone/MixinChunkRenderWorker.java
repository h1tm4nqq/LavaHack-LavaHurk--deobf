//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.BaritoneAPI
 *  baritone.api.utils.IPlayerContext
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.chunk.ChunkRenderWorker
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package com.kisman.cc.mixin.mixins.baritone;

import baritone.Baritone;
import baritone.api.BaritoneAPI;
import baritone.api.utils.IPlayerContext;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.chunk.ChunkRenderWorker;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={ChunkRenderWorker.class})
public class MixinChunkRenderWorker {
    @Shadow
    @Shadow
    private boolean Method1519(BlockPos blockPos, World world) {
        return false;
    }

    @Redirect(method={"processTask"}, at=@At(value="INVOKE", target="net/minecraft/client/renderer/chunk/ChunkRenderWorker.isChunkExisting(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/World;)Z"))
    @Redirect(method={"processTask"}, at=@At(value="INVOKE", target="net/minecraft/client/renderer/chunk/ChunkRenderWorker.isChunkExisting(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/World;)Z"))
    private boolean Method1520(ChunkRenderWorker chunkRenderWorker, BlockPos blockPos, World world) {
        if ((Boolean)Baritone.settings().renderCachedChunks.value == false) return this.Method1519(blockPos, world);
        if (Minecraft.getMinecraft().isSingleplayer()) return this.Method1519(blockPos, world);
        Baritone baritone = (Baritone)BaritoneAPI.getProvider().getPrimaryBaritone();
        IPlayerContext iPlayerContext = baritone.getPlayerContext();
        if (iPlayerContext.player() == null) return this.Method1519(blockPos, world);
        if (iPlayerContext.world() == null) return this.Method1519(blockPos, world);
        if (baritone.bsi == null) return this.Method1519(blockPos, world);
        if (baritone.bsi.isLoaded(blockPos.getX(), blockPos.getZ())) return true;
        if (this.Method1519(blockPos, world)) return true;
        return false;
    }
}

