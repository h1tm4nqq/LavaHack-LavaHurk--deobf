//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import net.minecraft.client.gui.*;
import lavahack.client.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(value = { GuiMainMenu.class }, priority = 10000)
public class MixinGuiMainMenu extends GuiScreen
{
    private CRVKufIsB5B5TedoK53oRMKEmTI1lFCi Field15853;
    private String Field15854;
    
    public MixinGuiMainMenu() {
        this.Field15854 = "";
    }
    
    @Inject(method = { "initGui" }, at = { @At("RETURN") })
    @Inject(method = { "initGui" }, at = { @At("RETURN") })
    private void init(final CallbackInfo callbackInfo) {
        this.buttonList.add(new GuiButton(893, this.width / 2 - 100, this.height / 4 + 48 + 72 + 12 + 24, leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6783()));
        this.Field15853 = new CRVKufIsB5B5TedoK53oRMKEmTI1lFCi();
        this.Field15854 = krTNPXljKWh8NNaZWZXUD3nchZzlBDMg.Method1764();
    }
    
    @Inject(method = { "actionPerformed" }, at = { @At("RETURN") })
    @Inject(method = { "actionPerformed" }, at = { @At("RETURN") })
    public void injectActionPerformed(final GuiButton guiButton, final CallbackInfo callbackInfo) {
        if (guiButton.id == 893) {
            this.mc.displayGuiScreen((GuiScreen)new Fyw4VLWjpn2d3zfURwsqHpTCdEas3yyz((GuiScreen)this));
        }
    }
    
    @Inject(method = { "drawScreen" }, at = { @At("RETURN") })
    @Inject(method = { "drawScreen" }, at = { @At("RETURN") })
    public void down(final int n, final int n2, final float n3, final CallbackInfo callbackInfo) {
        if (krTNPXljKWh8NNaZWZXUD3nchZzlBDMg.Field9449) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16271.Method433();
        }
        if (krTNPXljKWh8NNaZWZXUD3nchZzlBDMg.Field9452) {
            this.Field15853.Method6979(10);
            this.Field15853.Method6984();
            this.Field15853.Method6985();
        }
    }
    
    @Redirect(method = { "drawScreen" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiMainMenu;drawCenteredString(Lnet/minecraft/client/gui/FontRenderer;Ljava/lang/String;III)V"))
    @Redirect(method = { "drawScreen" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiMainMenu;drawCenteredString(Lnet/minecraft/client/gui/FontRenderer;Ljava/lang/String;III)V"))
    private void injectForCustomSplash(final GuiMainMenu guiMainMenu, final FontRenderer fontRenderer, final String s, final int n, final int n2, final int n3) {
        final String s2 = krTNPXljKWh8NNaZWZXUD3nchZzlBDMg.Field9450 ? this.Field15854 : s;
        if (krTNPXljKWh8NNaZWZXUD3nchZzlBDMg.Field9451) {
            fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4746(s2, (double)n, (double)n2, n3);
        }
        else {
            guiMainMenu.drawCenteredString(fontRenderer, s2, n, n2, n3);
        }
    }
}
