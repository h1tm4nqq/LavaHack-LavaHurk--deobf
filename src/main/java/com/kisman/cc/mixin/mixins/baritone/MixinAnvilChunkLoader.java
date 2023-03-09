/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.utils.accessor.IAnvilChunkLoader
 *  net.minecraft.world.chunk.storage.AnvilChunkLoader
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 */
package com.kisman.cc.mixin.mixins.baritone;

import baritone.utils.accessor.IAnvilChunkLoader;
import java.io.File;
import net.minecraft.world.chunk.storage.AnvilChunkLoader;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value={AnvilChunkLoader.class})
public class MixinAnvilChunkLoader
implements IAnvilChunkLoader {
    @Shadow
    @Final
    private File Field13751;

    public File getChunkSaveLocation() {
        MixinAnvilChunkLoader mixinAnvilChunkLoader = this;
        return null;
    }
}

