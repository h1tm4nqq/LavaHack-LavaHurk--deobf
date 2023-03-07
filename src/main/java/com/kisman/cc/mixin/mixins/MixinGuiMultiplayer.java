//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiMultiplayer
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.multiplayer.ServerData
 *  net.minecraft.util.text.TextFormatting
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins;

import lavahack.client.FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D;
import lavahack.client.HnCeArMwqlA5KPZf75D1d92lhv5QGxpA;
import lavahack.client.KcCIZHkiqRyYy9aG2CChxoIkIF4rNhaT;
import lavahack.client.VLBGi4jQpjwoS2YuOQrDZuYou5Mqly3P;
import lavahack.client.XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.uYiUhRHxAsDrSfRBoXY14xI7yei7T67q;
import lavahack.client.z7MolJHxbI3dLCkyW4k8adebxx0YwJOU;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.util.text.TextFormatting;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={GuiMultiplayer.class}, priority=10000)
public class MixinGuiMultiplayer
extends GuiScreen {
    private GuiButton Field10087;

    @Inject(method={"initGui"}, at={@At(value="RETURN")})
    @Inject(method={"initGui"}, at={@At(value="RETURN")})
    public void initGui(CallbackInfo callbackInfo) {
        this.buttonList.add(new GuiButton(417, 7, 7, 60, 20, "Alts"));
        this.buttonList.add(new GuiButton(1337, 7, 34, 98, 20, HnCeArMwqlA5KPZf75D1d92lhv5QGxpA.Method7470(FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D.Method7320().Method7330()).getName()));
        this.buttonList.add(new uYiUhRHxAsDrSfRBoXY14xI7yei7T67q(7331, this.width - 24, 5));
        this.Field10087 = this.addButton(new GuiButton(1773, this.width - 126, 5, 100, 20, this.getDisplayString()));
    }

    @Inject(method={"actionPerformed"}, at={@At(value="RETURN")})
    @Inject(method={"actionPerformed"}, at={@At(value="RETURN")})
    public void actionPerformed(GuiButton guiButton, CallbackInfo callbackInfo) {
        if (guiButton.id == 417) {
            this.mc.displayGuiScreen((GuiScreen)new KcCIZHkiqRyYy9aG2CChxoIkIF4rNhaT(this));
            return;
        }
        if (guiButton.id == 1337) {
            this.mc.displayGuiScreen((GuiScreen)leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16266.Method1236(this));
            return;
        }
        if (guiButton.id == 1773) {
            XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Field14381.Method22();
            this.Field10087.displayString = this.getDisplayString();
            return;
        }
        if (guiButton.id != 7331) return;
        this.mc.displayGuiScreen((GuiScreen)new VLBGi4jQpjwoS2YuOQrDZuYou5Mqly3P(this));
    }

    @Inject(method={"confirmClicked"}, at={@At(value="HEAD")})
    @Inject(method={"confirmClicked"}, at={@At(value="HEAD")})
    public void confirmClickedHook(boolean bl, int n, CallbackInfo callbackInfo) {
        if (n != 1773) return;
        this.mc.displayGuiScreen((GuiScreen)this);
    }

    @Inject(method={"connectToServer"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"connectToServer"}, at={@At(value="HEAD")}, cancellable=true)
    public void connectToServerHook(ServerData serverData, CallbackInfo callbackInfo) {
        if (!XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Field14381.Method35()) return;
        this.mc.displayGuiScreen((GuiScreen)new z7MolJHxbI3dLCkyW4k8adebxx0YwJOU(this, this.mc, serverData));
        callbackInfo.cancel();
    }

    private String getDisplayString() {
        String string;
        StringBuilder stringBuilder = new StringBuilder().append("PingBypass: ");
        if (XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Field14381.Method35()) {
            string = TextFormatting.GREEN + "On";
            return stringBuilder.append(string).toString();
        }
        string = TextFormatting.RED + "Off";
        return stringBuilder.append(string).toString();
    }
}

