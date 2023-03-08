//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.accessor;

import org.spongepowered.asm.mixin.*;
import net.minecraft.network.handshake.client.*;
import org.spongepowered.asm.mixin.gen.*;

@Mixin({ C00Handshake.class })
public interface AccessorC00Handshake
{
    @Accessor("ip")
    @Accessor("ip")
    String Method1992();
    
    @Accessor("port")
    @Accessor("port")
    int Method1993();
}
