//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.baritone;

import net.minecraft.util.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import net.minecraft.client.gui.*;
import baritone.api.event.events.*;
import baritone.api.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ TabCompleter.class })
public class MixinTabCompleter
{
    @Shadow
    @Final
    protected GuiTextField Field14802;
    @Shadow
    protected boolean Field14803;
    @Unique
    protected boolean Field14804;
    
    public MixinTabCompleter() {
        this.Field14804 = false;
    }
    
    @Shadow
    @Shadow
    public void Method5261(final String... array) {
    }
    
    @Inject(method = { "requestCompletions" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "requestCompletions" }, at = { @At("HEAD") }, cancellable = true)
    private void Method5262(final String s, final CallbackInfo callbackInfo) {
        if (!(this instanceof GuiChat.ChatTabCompleter)) {
            return;
        }
        final IBaritone primaryBaritone = BaritoneAPI.getProvider().getPrimaryBaritone();
        final TabCompleteEvent tabCompleteEvent = new TabCompleteEvent(s);
        primaryBaritone.getGameEventHandler().onPreTabComplete(tabCompleteEvent);
        if (tabCompleteEvent.isCancelled()) {
            callbackInfo.cancel();
            return;
        }
        if (tabCompleteEvent.completions != null) {
            callbackInfo.cancel();
            this.Field14804 = true;
            this.Field14803 = true;
            this.Method5261(tabCompleteEvent.completions);
            this.Field14804 = false;
        }
    }
}
