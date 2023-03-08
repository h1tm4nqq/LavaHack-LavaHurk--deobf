//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.accessor;

import org.spongepowered.asm.mixin.*;
import java.util.*;
import org.spongepowered.asm.mixin.gen.*;

@Mixin({ Class.class })
public interface AccessorClass
{
    @Invoker("enumConstantDirectory")
    @Invoker("enumConstantDirectory")
    Map Method6432();
}
