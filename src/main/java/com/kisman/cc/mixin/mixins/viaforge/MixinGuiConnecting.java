//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.viaforge;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.multiplayer.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import lavahack.client.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ GuiConnecting.class })
public class MixinGuiConnecting
{
    @Inject(method = { "connect" }, at = { @At("HEAD") })
    @Inject(method = { "connect" }, at = { @At("HEAD") })
    public void Method1857(final String str, final int i, final CallbackInfo callbackInfo) {
        FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D.Method7320().Method7329(str + ":" + i);
    }
}
