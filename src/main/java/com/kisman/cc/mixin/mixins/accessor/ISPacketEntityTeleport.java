//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.accessor;

import org.spongepowered.asm.mixin.*;
import net.minecraft.network.play.server.*;
import org.spongepowered.asm.mixin.gen.*;

@Mixin({ SPacketEntityTeleport.class })
public interface ISPacketEntityTeleport
{
    @Accessor("posX")
    @Accessor("posX")
    void Method804(final double p0);
    
    @Accessor("posY")
    @Accessor("posY")
    void Method805(final double p0);
    
    @Accessor("posZ")
    @Accessor("posZ")
    void Method806(final double p0);
}
