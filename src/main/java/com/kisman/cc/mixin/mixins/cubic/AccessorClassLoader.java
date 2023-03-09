/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Invoker
 */
package com.kisman.cc.mixin.mixins.cubic;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={ClassLoader.class})
public interface AccessorClassLoader {
    @Invoker(value="findLoadedClass")
    @Invoker(value="findLoadedClass")
    public Class Method1455(String var1);

    @Invoker(value="getPackage")
    @Invoker(value="getPackage")
    public Package Method1456(String var1);

    @Invoker(value="findClass")
    @Invoker(value="findClass")
    public Class Method1457(String var1) throws ClassNotFoundException;
}

