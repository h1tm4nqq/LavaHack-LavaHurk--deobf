//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.baritone;

import baritone.utils.accessor.*;
import net.minecraft.world.chunk.storage.*;
import java.io.*;
import org.spongepowered.asm.mixin.*;

@Mixin({ AnvilChunkLoader.class })
public class MixinAnvilChunkLoader implements IAnvilChunkLoader
{
    @Shadow
    @Final
    private File Field13751;
    
    public File getChunkSaveLocation() {
        return null;
    }
}
