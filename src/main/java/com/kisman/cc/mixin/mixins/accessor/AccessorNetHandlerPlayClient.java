/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.client.network.NetHandlerPlayClient
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package com.kisman.cc.mixin.mixins.accessor;

import com.mojang.authlib.GameProfile;
import net.minecraft.client.network.NetHandlerPlayClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={NetHandlerPlayClient.class})
public interface AccessorNetHandlerPlayClient {
    @Accessor(value="doneLoadingTerrain")
    @Accessor(value="doneLoadingTerrain")
    public boolean Method5234();

    @Accessor(value="doneLoadingTerrain")
    @Accessor(value="doneLoadingTerrain")
    public void Method5235(boolean var1);

    @Accessor(value="profile")
    @Accessor(value="profile")
    public void Method5236(GameProfile var1);
}

