/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.handshake.client.C00Handshake
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package com.kisman.cc.mixin.mixins.accessor;

import net.minecraft.network.handshake.client.C00Handshake;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={C00Handshake.class})
public interface AccessorC00Handshake {
    @Accessor(value="ip")
    @Accessor(value="ip")
    public String Method1992();

    @Accessor(value="port")
    @Accessor(value="port")
    public int Method1993();
}

