//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.baritone;

import baritone.utils.accessor.*;
import net.minecraft.client.multiplayer.*;
import it.unimi.dsi.fastutil.longs.*;
import org.spongepowered.asm.mixin.*;

@Mixin({ ChunkProviderClient.class })
public class MixinChunkProviderClient implements IChunkProviderClient
{
    @Shadow
    @Final
    private Long2ObjectMap Field13161;
    
    public Long2ObjectMap loadedChunks() {
        return null;
    }
}
