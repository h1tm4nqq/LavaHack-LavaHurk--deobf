/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lavahack.client.qkNYXJCKlwt24osL04Z8YViGXY5uHOX0
 *  net.minecraft.client.entity.AbstractClientPlayer
 *  net.minecraft.client.renderer.entity.RenderPlayer
 *  net.minecraft.entity.player.EntityPlayer
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins;

import lavahack.client.qkNYXJCKlwt24osL04Z8YViGXY5uHOX0;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.player.EntityPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={RenderPlayer.class})
public class MixinRenderPlayer {
    @Inject(method={"renderEntityName(Lnet/minecraft/client/entity/AbstractClientPlayer;DDDLjava/lang/String;D)V"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"renderEntityName(Lnet/minecraft/client/entity/AbstractClientPlayer;DDDLjava/lang/String;D)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void Method7284(AbstractClientPlayer abstractClientPlayer, double d, double d2, double d3, String string, double d4, CallbackInfo callbackInfo) {
        if (!qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.Field12155.Method35()) return;
        if (!(abstractClientPlayer instanceof EntityPlayer)) return;
        callbackInfo.cancel();
    }
}

