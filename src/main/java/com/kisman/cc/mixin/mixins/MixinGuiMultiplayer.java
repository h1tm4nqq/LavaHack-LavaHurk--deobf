//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.gui.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import org.spongepowered.asm.mixin.injection.*;
import net.minecraft.client.multiplayer.*;
import lavahack.client.*;
import net.minecraft.util.text.*;

@Mixin(value = { GuiMultiplayer.class }, priority = 10000)
public class MixinGuiMultiplayer extends GuiScreen
{
    private GuiButton Field10087;
    
    @Inject(method = { "initGui" }, at = { @At("RETURN") })
    @Inject(method = { "initGui" }, at = { @At("RETURN") })
    public void initGui(final CallbackInfo callbackInfo) {
        this.buttonList.add(new GuiButton(417, 7, 7, 60, 20, "Alts"));
        this.buttonList.add(new GuiButton(1337, 7, 34, 98, 20, HnCeArMwqlA5KPZf75D1d92lhv5QGxpA.Method7470(FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D.Method7320().Method7330()).getName()));
        this.buttonList.add(new uYiUhRHxAsDrSfRBoXY14xI7yei7T67q(7331, this.width - 24, 5));
        this.Field10087 = this.addButton(new GuiButton(1773, this.width - 126, 5, 100, 20, this.getDisplayString()));
    }
    
    @Inject(method = { "actionPerformed" }, at = { @At("RETURN") })
    @Inject(method = { "actionPerformed" }, at = { @At("RETURN") })
    public void actionPerformed(final GuiButton guiButton, final CallbackInfo callbackInfo) {
        if (guiButton.id == 417) {
            this.mc.displayGuiScreen((GuiScreen)new KcCIZHkiqRyYy9aG2CChxoIkIF4rNhaT((GuiScreen)this));
        }
        else if (guiButton.id == 1337) {
            this.mc.displayGuiScreen((GuiScreen)leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16266.Method1236((GuiScreen)this));
        }
        else if (guiButton.id == 1773) {
            XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Field14381.Method22();
            this.Field10087.displayString = this.getDisplayString();
        }
        else if (guiButton.id == 7331) {
            this.mc.displayGuiScreen((GuiScreen)new VLBGi4jQpjwoS2YuOQrDZuYou5Mqly3P((GuiScreen)this));
        }
    }
    
    @Inject(method = { "confirmClicked" }, at = { @At("HEAD") })
    @Inject(method = { "confirmClicked" }, at = { @At("HEAD") })
    public void confirmClickedHook(final boolean b, final int n, final CallbackInfo callbackInfo) {
        if (n == 1773) {
            this.mc.displayGuiScreen((GuiScreen)this);
        }
    }
    
    @Inject(method = { "connectToServer" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "connectToServer" }, at = { @At("HEAD") }, cancellable = true)
    public void connectToServerHook(final ServerData serverData, final CallbackInfo callbackInfo) {
        if (XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Field14381.Method35()) {
            this.mc.displayGuiScreen((GuiScreen)new z7MolJHxbI3dLCkyW4k8adebxx0YwJOU((GuiScreen)this, this.mc, serverData));
            callbackInfo.cancel();
        }
    }
    
    private String getDisplayString() {
        return "PingBypass: " + (XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Field14381.Method35() ? (TextFormatting.GREEN + "On") : (TextFormatting.RED + "Off"));
    }
}
