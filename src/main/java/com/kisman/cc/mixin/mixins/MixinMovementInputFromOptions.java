//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.util.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import lavahack.client.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(value = { MovementInputFromOptions.class }, priority = 10000)
public class MixinMovementInputFromOptions extends MovementInput
{
    @Inject(method = { "updatePlayerMoveState" }, at = { @At("RETURN") })
    @Inject(method = { "updatePlayerMoveState" }, at = { @At("RETURN") })
    public void updatePlayerMoveState(final CallbackInfo callbackInfo) {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)new Z9isRG6BYbrxGGNGITuabJZMH69DuRSA());
    }
}
