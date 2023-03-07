//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiMainMenu
 *  net.minecraft.client.gui.GuiScreen
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins;

import lavahack.client.CRVKufIsB5B5TedoK53oRMKEmTI1lFCi;
import lavahack.client.Fyw4VLWjpn2d3zfURwsqHpTCdEas3yyz;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.krTNPXljKWh8NNaZWZXUD3nchZzlBDMg;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={GuiMainMenu.class}, priority=10000)
public class MixinGuiMainMenu
extends GuiScreen {
    private CRVKufIsB5B5TedoK53oRMKEmTI1lFCi Field15853;
    private String Field15854 = "";

    @Inject(method={"initGui"}, at={@At(value="RETURN")})
    @Inject(method={"initGui"}, at={@At(value="RETURN")})
    private void init(CallbackInfo callbackInfo) {
        int n = this.height / 4 + 48;
        this.buttonList.add(new GuiButton(893, this.width / 2 - 100, n + 72 + 12 + 24, leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6783()));
        this.Field15853 = new CRVKufIsB5B5TedoK53oRMKEmTI1lFCi();
        this.Field15854 = krTNPXljKWh8NNaZWZXUD3nchZzlBDMg.Method1764();
    }

    @Inject(method={"actionPerformed"}, at={@At(value="RETURN")})
    @Inject(method={"actionPerformed"}, at={@At(value="RETURN")})
    public void injectActionPerformed(GuiButton guiButton, CallbackInfo callbackInfo) {
        if (guiButton.id != 893) return;
        this.mc.displayGuiScreen((GuiScreen)new Fyw4VLWjpn2d3zfURwsqHpTCdEas3yyz(this));
    }

    @Inject(method={"drawScreen"}, at={@At(value="RETURN")})
    @Inject(method={"drawScreen"}, at={@At(value="RETURN")})
    public void down(int n, int n2, float f, CallbackInfo callbackInfo) {
        if (krTNPXljKWh8NNaZWZXUD3nchZzlBDMg.Field9449) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16271.Method433();
        }
        if (!krTNPXljKWh8NNaZWZXUD3nchZzlBDMg.Field9452) return;
        this.Field15853.Method6979(10);
        this.Field15853.Method6984();
        this.Field15853.Method6985();
    }

    @Redirect(method={"drawScreen"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/GuiMainMenu;drawCenteredString(Lnet/minecraft/client/gui/FontRenderer;Ljava/lang/String;III)V"))
    @Redirect(method={"drawScreen"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/GuiMainMenu;drawCenteredString(Lnet/minecraft/client/gui/FontRenderer;Ljava/lang/String;III)V"))
    private void injectForCustomSplash(GuiMainMenu guiMainMenu, FontRenderer fontRenderer, String string, int n, int n2, int n3) {
        String string2;
        String string3 = string2 = krTNPXljKWh8NNaZWZXUD3nchZzlBDMg.Field9450 ? this.Field15854 : string;
        if (krTNPXljKWh8NNaZWZXUD3nchZzlBDMg.Field9451) {
            fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4746(string2, n, n2, n3);
            return;
        }
        guiMainMenu.drawCenteredString(fontRenderer, string2, n, n2, n3);
    }
}

