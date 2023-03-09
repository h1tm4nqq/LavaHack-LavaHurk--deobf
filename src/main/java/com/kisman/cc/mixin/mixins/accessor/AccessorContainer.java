/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.inventory.Container
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package com.kisman.cc.mixin.mixins.accessor;

import net.minecraft.inventory.Container;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={Container.class})
public interface AccessorContainer {
    @Accessor(value="transactionID")
    @Accessor(value="transactionID")
    public short Method3021();

    @Accessor(value="transactionID")
    @Accessor(value="transactionID")
    public void Method3022(short var1);
}

