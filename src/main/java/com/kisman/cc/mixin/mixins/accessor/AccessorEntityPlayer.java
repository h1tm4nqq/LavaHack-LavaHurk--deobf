/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.entity.player.EntityPlayer
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package com.kisman.cc.mixin.mixins.accessor;

import com.mojang.authlib.GameProfile;
import net.minecraft.entity.player.EntityPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={EntityPlayer.class})
public interface AccessorEntityPlayer {
    @Accessor(value="speedInAir")
    @Accessor(value="speedInAir")
    public void Method6392(float var1);

    @Accessor(value="gameProfile")
    @Accessor(value="gameProfile")
    public void Method6393(GameProfile var1);
}

