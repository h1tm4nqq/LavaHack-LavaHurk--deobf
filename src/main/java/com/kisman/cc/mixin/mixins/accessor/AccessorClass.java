/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Invoker
 */
package com.kisman.cc.mixin.mixins.accessor;

import java.util.Map;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={Class.class})
public interface AccessorClass {
    @Invoker(value="enumConstantDirectory")
    @Invoker(value="enumConstantDirectory")
    public Map Method6432();
}

