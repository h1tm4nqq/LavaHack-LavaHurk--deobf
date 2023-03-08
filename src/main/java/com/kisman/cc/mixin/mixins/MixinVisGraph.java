//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.renderer.chunk.*;
import net.minecraft.util.math.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import lavahack.client.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ VisGraph.class })
public class MixinVisGraph
{
    @Inject(method = { "setOpaqueCube" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "setOpaqueCube" }, at = { @At("HEAD") }, cancellable = true)
    public void Method1119(final BlockPos blockPos, final CallbackInfo callbackInfo) {
        final cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX9 coy3JnnL4iiLr0AUdZQ0yQaDvd9YMfX9 = new cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX9();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)coy3JnnL4iiLr0AUdZQ0yQaDvd9YMfX9);
        if (coy3JnnL4iiLr0AUdZQ0yQaDvd9YMfX9.Method159()) {
            callbackInfo.cancel();
        }
    }
}
