//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.entity.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import lavahack.client.*;
import net.minecraft.entity.player.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ RenderPlayer.class })
public class MixinRenderPlayer
{
    @Inject(method = { "renderEntityName(Lnet/minecraft/client/entity/AbstractClientPlayer;DDDLjava/lang/String;D)V" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "renderEntityName(Lnet/minecraft/client/entity/AbstractClientPlayer;DDDLjava/lang/String;D)V" }, at = { @At("HEAD") }, cancellable = true)
    private void Method7284(final AbstractClientPlayer abstractClientPlayer, final double n, final double n2, final double n3, final String s, final double n4, final CallbackInfo callbackInfo) {
        if (qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.Field12155.Method35() && abstractClientPlayer instanceof EntityPlayer) {
            callbackInfo.cancel();
        }
    }
}
