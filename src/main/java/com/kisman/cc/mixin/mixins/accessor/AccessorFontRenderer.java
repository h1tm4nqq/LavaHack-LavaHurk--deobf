//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.accessor;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.gui.*;
import net.minecraft.util.*;
import org.spongepowered.asm.mixin.gen.*;

@Mixin({ FontRenderer.class })
public interface AccessorFontRenderer
{
    @Accessor("locationFontTexture")
    @Accessor("locationFontTexture")
    void Method6040(final ResourceLocation p0);
}
