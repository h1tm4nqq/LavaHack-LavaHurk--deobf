//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.accessor;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.model.*;
import org.spongepowered.asm.mixin.gen.*;

@Mixin({ RenderEnderCrystal.class })
public interface AccessorRenderEnderCrystal
{
    @Accessor("modelEnderCrystal")
    @Accessor("modelEnderCrystal")
    void Method3251(final ModelBase p0);
    
    @Accessor("modelEnderCrystalNoBase")
    @Accessor("modelEnderCrystalNoBase")
    void Method3252(final ModelBase p0);
}
