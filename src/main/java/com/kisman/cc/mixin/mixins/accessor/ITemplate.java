//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.accessor;

import org.spongepowered.asm.mixin.*;
import net.minecraft.world.gen.structure.template.*;
import java.util.*;
import org.spongepowered.asm.mixin.gen.*;
import net.minecraft.util.math.*;

@Mixin({ Template.class })
public interface ITemplate
{
    @Accessor("blocks")
    @Accessor("blocks")
    List Method58();
    
    @Accessor("size")
    @Accessor("size")
    void Method59(final BlockPos p0);
    
    @Accessor("entities")
    @Accessor("entities")
    List Method60();
}
