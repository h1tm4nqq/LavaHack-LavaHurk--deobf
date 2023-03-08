//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.accessor;

import org.spongepowered.asm.mixin.*;
import net.minecraftforge.fml.common.*;
import org.spongepowered.asm.mixin.gen.*;

@Mixin({ ProgressManager.ProgressBar.class })
public interface AccessorProgressBar
{
    @Accessor("step")
    @Accessor("step")
    void Method739(final int p0);
}
