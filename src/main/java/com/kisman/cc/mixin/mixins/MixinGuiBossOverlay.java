/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lavahack.client.DitR6vZ79qQrTZ031J7xzQQWKdUckNea$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 *  lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 *  net.minecraft.client.gui.GuiBossOverlay
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins;

import lavahack.client.DitR6vZ79qQrTZ031J7xzQQWKdUckNea;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.gui.GuiBossOverlay;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={GuiBossOverlay.class})
public class MixinGuiBossOverlay {
    @Inject(method={"renderBossHealth"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"renderBossHealth"}, at={@At(value="HEAD")}, cancellable=true)
    private void Method2422(CallbackInfo callbackInfo) {
        DitR6vZ79qQrTZ031J7xzQQWKdUckNea.leqS0IyKEB621E1SrHdAcHHAUjScjmKi leqS0IyKEB621E1SrHdAcHHAUjScjmKi2 = new DitR6vZ79qQrTZ031J7xzQQWKdUckNea.leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)leqS0IyKEB621E1SrHdAcHHAUjScjmKi2);
        if (!leqS0IyKEB621E1SrHdAcHHAUjScjmKi2.Method159()) return;
        callbackInfo.cancel();
    }
}

