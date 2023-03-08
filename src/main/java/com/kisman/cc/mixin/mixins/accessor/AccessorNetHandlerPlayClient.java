//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.accessor;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.network.*;
import org.spongepowered.asm.mixin.gen.*;
import com.mojang.authlib.*;

@Mixin({ NetHandlerPlayClient.class })
public interface AccessorNetHandlerPlayClient
{
    @Accessor("doneLoadingTerrain")
    @Accessor("doneLoadingTerrain")
    boolean Method5234();
    
    @Accessor("doneLoadingTerrain")
    @Accessor("doneLoadingTerrain")
    void Method5235(final boolean p0);
    
    @Accessor("profile")
    @Accessor("profile")
    void Method5236(final GameProfile p0);
}
