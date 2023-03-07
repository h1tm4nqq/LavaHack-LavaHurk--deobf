/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.play.server.SPacketEntityTeleport
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package com.kisman.cc.mixin.mixins.accessor;

import net.minecraft.network.play.server.SPacketEntityTeleport;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={SPacketEntityTeleport.class})
public interface ISPacketEntityTeleport {
    @Accessor(value="posX")
    @Accessor(value="posX")
    public void Method804(double var1);

    @Accessor(value="posY")
    @Accessor(value="posY")
    public void Method805(double var1);

    @Accessor(value="posZ")
    @Accessor(value="posZ")
    public void Method806(double var1);
}

