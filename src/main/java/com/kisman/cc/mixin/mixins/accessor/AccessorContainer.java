//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.accessor;

import org.spongepowered.asm.mixin.*;
import net.minecraft.inventory.*;
import org.spongepowered.asm.mixin.gen.*;

@Mixin({ Container.class })
public interface AccessorContainer
{
    @Accessor("transactionID")
    @Accessor("transactionID")
    short Method3021();
    
    @Accessor("transactionID")
    @Accessor("transactionID")
    void Method3022(final short p0);
}
