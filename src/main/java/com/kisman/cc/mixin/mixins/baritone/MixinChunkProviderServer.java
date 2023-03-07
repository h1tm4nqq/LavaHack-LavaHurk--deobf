/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.utils.accessor.IChunkProviderServer
 *  net.minecraft.world.chunk.storage.IChunkLoader
 *  net.minecraft.world.gen.ChunkProviderServer
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 */
package com.kisman.cc.mixin.mixins.baritone;

import baritone.utils.accessor.IChunkProviderServer;
import net.minecraft.world.chunk.storage.IChunkLoader;
import net.minecraft.world.gen.ChunkProviderServer;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value={ChunkProviderServer.class})
public class MixinChunkProviderServer
implements IChunkProviderServer {
    @Shadow
    @Final
    public IChunkLoader Field12719;

    public IChunkLoader getChunkLoader() {
        MixinChunkProviderServer mixinChunkProviderServer = this;
        return null;
    }
}

