/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lavahack.client.Z9isRG6BYbrxGGNGITuabJZMH69DuRSA
 *  lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 *  net.minecraft.util.MovementInput
 *  net.minecraft.util.MovementInputFromOptions
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins;

import lavahack.client.Z9isRG6BYbrxGGNGITuabJZMH69DuRSA;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.util.MovementInput;
import net.minecraft.util.MovementInputFromOptions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={MovementInputFromOptions.class}, priority=10000)
public class MixinMovementInputFromOptions
extends MovementInput {
    @Inject(method={"updatePlayerMoveState"}, at={@At(value="RETURN")})
    @Inject(method={"updatePlayerMoveState"}, at={@At(value="RETURN")})
    public void updatePlayerMoveState(CallbackInfo callbackInfo) {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)new Z9isRG6BYbrxGGNGITuabJZMH69DuRSA());
    }
}

