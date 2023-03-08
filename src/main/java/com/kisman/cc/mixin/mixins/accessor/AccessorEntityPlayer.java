//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.accessor;

import org.spongepowered.asm.mixin.*;
import net.minecraft.entity.player.*;
import org.spongepowered.asm.mixin.gen.*;
import com.mojang.authlib.*;

@Mixin({ EntityPlayer.class })
public interface AccessorEntityPlayer
{
    @Accessor("speedInAir")
    @Accessor("speedInAir")
    void Method6392(final float p0);
    
    @Accessor("gameProfile")
    @Accessor("gameProfile")
    void Method6393(final GameProfile p0);
}
