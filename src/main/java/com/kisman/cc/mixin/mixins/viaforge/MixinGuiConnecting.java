/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.multiplayer.GuiConnecting
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins.viaforge;

import lavahack.client.FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D;
import net.minecraft.client.multiplayer.GuiConnecting;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={GuiConnecting.class})
public class MixinGuiConnecting {
    @Inject(method={"connect"}, at={@At(value="HEAD")})
    @Inject(method={"connect"}, at={@At(value="HEAD")})
    public void Method1857(String string, int n, CallbackInfo callbackInfo) {
        FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D.Method7320().Method7329(string + ":" + n);
    }
}

