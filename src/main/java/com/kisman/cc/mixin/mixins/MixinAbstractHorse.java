//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.entity.passive.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import lavahack.client.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ AbstractHorse.class })
public class MixinAbstractHorse
{
    @Inject(method = { "canBeSteered" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "canBeSteered" }, at = { @At("HEAD") }, cancellable = true)
    private void Method298(final CallbackInfoReturnable callbackInfoReturnable) {
        final agYEaptPUW8OPC6jB7DK1WZuIoCKRIex agYEaptPUW8OPC6jB7DK1WZuIoCKRIex = new agYEaptPUW8OPC6jB7DK1WZuIoCKRIex();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)agYEaptPUW8OPC6jB7DK1WZuIoCKRIex);
        if (agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.cancelled) {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }
    
    @Inject(method = { "isHorseSaddled" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "isHorseSaddled" }, at = { @At("HEAD") }, cancellable = true)
    private void Method299(final CallbackInfoReturnable callbackInfoReturnable) {
        final agYEaptPUW8OPC6jB7DK1WZuIoCKRIex agYEaptPUW8OPC6jB7DK1WZuIoCKRIex = new agYEaptPUW8OPC6jB7DK1WZuIoCKRIex();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)agYEaptPUW8OPC6jB7DK1WZuIoCKRIex);
        if (agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.cancelled) {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }
}
