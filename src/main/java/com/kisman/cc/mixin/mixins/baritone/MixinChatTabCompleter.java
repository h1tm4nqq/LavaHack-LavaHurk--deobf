/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiChat$ChatTabCompleter
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins.baritone;

import com.kisman.cc.mixin.mixins.baritone.MixinTabCompleter;
import net.minecraft.client.gui.GuiChat;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={GuiChat.ChatTabCompleter.class})
public class MixinChatTabCompleter
extends MixinTabCompleter {
    @Inject(method={"complete"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"complete"}, at={@At(value="HEAD")}, cancellable=true)
    private void Method5263(CallbackInfo callbackInfo) {
        if (!this.dontComplete) return;
        callbackInfo.cancel();
    }
}

