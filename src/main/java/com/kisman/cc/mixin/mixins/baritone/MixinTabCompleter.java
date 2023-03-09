/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.IBaritone
 *  baritone.api.event.events.TabCompleteEvent
 *  net.minecraft.client.gui.GuiChat$ChatTabCompleter
 *  net.minecraft.client.gui.GuiTextField
 *  net.minecraft.util.TabCompleter
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins.baritone;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.event.events.TabCompleteEvent;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.util.TabCompleter;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={TabCompleter.class})
public class MixinTabCompleter {
    @Shadow
    @Final
    protected GuiTextField Field14802;
    @Shadow
    protected boolean Field14803;
    @Unique
    protected boolean Field14804 = false;

    @Shadow
    @Shadow
    public void Method5261(String ... stringArray) {
    }

    @Inject(method={"requestCompletions"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"requestCompletions"}, at={@At(value="HEAD")}, cancellable=true)
    private void Method5262(String string, CallbackInfo callbackInfo) {
        if (!(this instanceof GuiChat.ChatTabCompleter)) {
            return;
        }
        IBaritone iBaritone = BaritoneAPI.getProvider().getPrimaryBaritone();
        TabCompleteEvent tabCompleteEvent = new TabCompleteEvent(string);
        iBaritone.getGameEventHandler().onPreTabComplete(tabCompleteEvent);
        if (tabCompleteEvent.isCancelled()) {
            callbackInfo.cancel();
            return;
        }
        if (tabCompleteEvent.completions == null) return;
        callbackInfo.cancel();
        this.Field14804 = true;
        this.Field14803 = true;
        this.Method5261(tabCompleteEvent.completions);
        this.Field14804 = false;
    }
}

