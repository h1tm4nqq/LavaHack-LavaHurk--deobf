/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.multiplayer.ServerData
 *  net.minecraft.client.network.ServerPinger
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins;

import lavahack.client.A50mpNcG9Jr7zq65VRTWW1xeYXIz5VEB$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.A50mpNcG9Jr7zq65VRTWW1xeYXIz5VEB$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.network.ServerPinger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={ServerPinger.class})
public class MixinServerPing {
    @Inject(method={"ping"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"ping"}, at={@At(value="HEAD")}, cancellable=true)
    public void Method6997(ServerData serverData, CallbackInfo callbackInfo) {
        A50mpNcG9Jr7zq65VRTWW1xeYXIz5VEB$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf a50mpNcG9Jr7zq65VRTWW1xeYXIz5VEB$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = new A50mpNcG9Jr7zq65VRTWW1xeYXIz5VEB$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(serverData);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(a50mpNcG9Jr7zq65VRTWW1xeYXIz5VEB$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf);
        if (!a50mpNcG9Jr7zq65VRTWW1xeYXIz5VEB$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method159()) return;
        callbackInfo.cancel();
    }

    @Inject(method={"tryCompatibilityPing"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"tryCompatibilityPing"}, at={@At(value="HEAD")}, cancellable=true)
    public void Method6998(ServerData serverData, CallbackInfo callbackInfo) {
        A50mpNcG9Jr7zq65VRTWW1xeYXIz5VEB$leqS0IyKEB621E1SrHdAcHHAUjScjmKi a50mpNcG9Jr7zq65VRTWW1xeYXIz5VEB$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = new A50mpNcG9Jr7zq65VRTWW1xeYXIz5VEB$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(serverData);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(a50mpNcG9Jr7zq65VRTWW1xeYXIz5VEB$leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
        if (!a50mpNcG9Jr7zq65VRTWW1xeYXIz5VEB$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method159()) return;
        callbackInfo.cancel();
    }
}

