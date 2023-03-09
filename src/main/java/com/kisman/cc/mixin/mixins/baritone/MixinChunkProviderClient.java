/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.utils.accessor.IChunkProviderClient
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  net.minecraft.client.multiplayer.ChunkProviderClient
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 */
package com.kisman.cc.mixin.mixins.baritone;

import baritone.utils.accessor.IChunkProviderClient;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import net.minecraft.client.multiplayer.ChunkProviderClient;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value={ChunkProviderClient.class})
public class MixinChunkProviderClient
implements IChunkProviderClient {
    @Shadow
    @Final
    private Long2ObjectMap Field13161;

    public Long2ObjectMap loadedChunks() {
        MixinChunkProviderClient mixinChunkProviderClient = this;
        return null;
    }
}

