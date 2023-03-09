/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lavahack.client.agYEaptPUW8OPC6jB7DK1WZuIoCKRIex
 *  lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 *  net.minecraft.entity.passive.AbstractHorse
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.kisman.cc.mixin.mixins;

import lavahack.client.agYEaptPUW8OPC6jB7DK1WZuIoCKRIex;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.entity.passive.AbstractHorse;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={AbstractHorse.class})
public class MixinAbstractHorse {
    @Inject(method={"canBeSteered"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"canBeSteered"}, at={@At(value="HEAD")}, cancellable=true)
    private void Method298(CallbackInfoReturnable callbackInfoReturnable) {
        agYEaptPUW8OPC6jB7DK1WZuIoCKRIex agYEaptPUW8OPC6jB7DK1WZuIoCKRIex2 = new agYEaptPUW8OPC6jB7DK1WZuIoCKRIex();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)agYEaptPUW8OPC6jB7DK1WZuIoCKRIex2);
        if (!agYEaptPUW8OPC6jB7DK1WZuIoCKRIex2.cancelled) return;
        callbackInfoReturnable.setReturnValue((Object)true);
    }

    @Inject(method={"isHorseSaddled"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"isHorseSaddled"}, at={@At(value="HEAD")}, cancellable=true)
    private void Method299(CallbackInfoReturnable callbackInfoReturnable) {
        agYEaptPUW8OPC6jB7DK1WZuIoCKRIex agYEaptPUW8OPC6jB7DK1WZuIoCKRIex2 = new agYEaptPUW8OPC6jB7DK1WZuIoCKRIex();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)agYEaptPUW8OPC6jB7DK1WZuIoCKRIex2);
        if (!agYEaptPUW8OPC6jB7DK1WZuIoCKRIex2.cancelled) return;
        callbackInfoReturnable.setReturnValue((Object)true);
    }
}

