//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.baritone;

import baritone.utils.accessor.*;
import net.minecraft.world.gen.*;
import net.minecraft.world.chunk.storage.*;
import org.spongepowered.asm.mixin.*;

@Mixin({ ChunkProviderServer.class })
public class MixinChunkProviderServer implements IChunkProviderServer
{
    @Shadow
    @Final
    public IChunkLoader Field12719;
    
    public IChunkLoader getChunkLoader() {
        return null;
    }
}
