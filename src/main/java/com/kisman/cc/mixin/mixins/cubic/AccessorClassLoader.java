//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.cubic;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.gen.*;

@Mixin({ ClassLoader.class })
public interface AccessorClassLoader
{
    @Invoker("findLoadedClass")
    @Invoker("findLoadedClass")
    Class Method1455(final String p0);
    
    @Invoker("getPackage")
    @Invoker("getPackage")
    Package Method1456(final String p0);
    
    @Invoker("findClass")
    @Invoker("findClass")
    Class Method1457(final String p0) throws ClassNotFoundException;
}
