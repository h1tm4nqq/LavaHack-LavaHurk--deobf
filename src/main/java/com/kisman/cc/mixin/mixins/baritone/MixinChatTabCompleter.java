//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.baritone;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.gui.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ GuiChat.ChatTabCompleter.class })
public class MixinChatTabCompleter extends MixinTabCompleter
{
    @Inject(method = { "complete" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "complete" }, at = { @At("HEAD") }, cancellable = true)
    private void Method5263(final CallbackInfo callbackInfo) {
        if (this.dontComplete) {
            callbackInfo.cancel();
        }
    }
}
