//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.gui.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import lavahack.client.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ GuiBossOverlay.class })
public class MixinGuiBossOverlay
{
    @Inject(method = { "renderBossHealth" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "renderBossHealth" }, at = { @At("HEAD") }, cancellable = true)
    private void Method2422(final CallbackInfo callbackInfo) {
        final DitR6vZ79qQrTZ031J7xzQQWKdUckNea.leqS0IyKEB621E1SrHdAcHHAUjScjmKi leqS0IyKEB621E1SrHdAcHHAUjScjmKi = new DitR6vZ79qQrTZ031J7xzQQWKdUckNea.leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
        lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
        if (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method159()) {
            callbackInfo.cancel();
        }
    }
}
