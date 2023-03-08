//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.viaforge;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import org.spongepowered.asm.mixin.injection.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.multiplayer.*;
import lavahack.client.*;

@Mixin({ GuiDisconnected.class })
public class MixinGuiDisconnected extends GuiScreen
{
    @Inject(method = { "initGui" }, at = { @At("RETURN") })
    @Inject(method = { "initGui" }, at = { @At("RETURN") })
    public void injectInitGui(final CallbackInfo callbackInfo) {
        this.buttonList.add(new GuiButton(1337, 5, 6, 98, 20, HnCeArMwqlA5KPZf75D1d92lhv5QGxpA.Method7470(FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D.Method7320().Method7330()).getName()));
        this.buttonList.add(new GuiButton(1338, 5, 28, 98, 20, "Reconnect"));
    }
    
    @Inject(method = { "actionPerformed" }, at = { @At("RETURN") })
    @Inject(method = { "actionPerformed" }, at = { @At("RETURN") })
    public void injectActionPerformed(final GuiButton guiButton, final CallbackInfo callbackInfo) {
        if (guiButton.id == 1337) {
            this.mc.displayGuiScreen((GuiScreen)leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16266.Method1236((GuiScreen)this));
        }
        else if (guiButton.id == 1338) {
            this.mc.displayGuiScreen((GuiScreen)new GuiConnecting((GuiScreen)new GuiMultiplayer((GuiScreen)new GuiMainMenu()), this.mc, new ServerData(FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D.Method7320().Method7328(), FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D.Method7320().Method7328(), false)));
        }
    }
    
    @Inject(method = { "drawScreen" }, at = { @At("RETURN") })
    @Inject(method = { "drawScreen" }, at = { @At("RETURN") })
    public void injectDrawScreen(final int n, final int n2, final float n3, final CallbackInfo callbackInfo) {
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745("<-- Current Version", 104.0, 13.0, -1);
    }
}
