/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.chunk.VisGraph
 *  net.minecraft.util.math.BlockPos
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins;

import lavahack.client.cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX9;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.renderer.chunk.VisGraph;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={VisGraph.class})
public class MixinVisGraph {
    @Inject(method={"setOpaqueCube"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"setOpaqueCube"}, at={@At(value="HEAD")}, cancellable=true)
    public void Method1119(BlockPos blockPos, CallbackInfo callbackInfo) {
        cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX9 cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX92 = new cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX9();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX92);
        if (!cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX92.Method159()) return;
        callbackInfo.cancel();
    }
}

