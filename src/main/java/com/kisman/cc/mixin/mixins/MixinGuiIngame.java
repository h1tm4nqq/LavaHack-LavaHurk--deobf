//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.gui.GuiIngame
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Overwrite
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins;

import lavahack.client.DitR6vZ79qQrTZ031J7xzQQWKdUckNea$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.DitR6vZ79qQrTZ031J7xzQQWKdUckNea$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
import lavahack.client.DitR6vZ79qQrTZ031J7xzQQWKdUckNea$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.W3C0y9394VvVcZKAtDfQSnqXm5zLQGty;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={GuiIngame.class}, priority=10000)
public class MixinGuiIngame
extends Gui {
    @Shadow
    @Final
    public Minecraft Field9696;

    @Shadow
    @Shadow
    protected void renderHotbarItem(int n, int n2, float f, EntityPlayer entityPlayer, ItemStack itemStack) {
    }

    @Shadow
    @Shadow
    public FontRenderer getFontRenderer() {
        return null;
    }

    @Inject(method={"renderPortal"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"renderPortal"}, at={@At(value="HEAD")}, cancellable=true)
    protected void antiPortal(float f, ScaledResolution scaledResolution, CallbackInfo callbackInfo) {
        DitR6vZ79qQrTZ031J7xzQQWKdUckNea$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV ditR6vZ79qQrTZ031J7xzQQWKdUckNea$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = new DitR6vZ79qQrTZ031J7xzQQWKdUckNea$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(ditR6vZ79qQrTZ031J7xzQQWKdUckNea$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV);
        if (!ditR6vZ79qQrTZ031J7xzQQWKdUckNea$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method159()) return;
        callbackInfo.cancel();
    }

    @Inject(method={"renderPumpkinOverlay"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"renderPumpkinOverlay"}, at={@At(value="HEAD")}, cancellable=true)
    protected void renderPumpkinOverlayHook(ScaledResolution scaledResolution, CallbackInfo callbackInfo) {
        DitR6vZ79qQrTZ031J7xzQQWKdUckNea$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS ditR6vZ79qQrTZ031J7xzQQWKdUckNea$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS = new DitR6vZ79qQrTZ031J7xzQQWKdUckNea$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(ditR6vZ79qQrTZ031J7xzQQWKdUckNea$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS);
        if (!ditR6vZ79qQrTZ031J7xzQQWKdUckNea$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method159()) return;
        callbackInfo.cancel();
    }

    @Inject(method={"renderPotionEffects"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"renderPotionEffects"}, at={@At(value="HEAD")}, cancellable=true)
    protected void renderPotionEffectsHook(ScaledResolution scaledResolution, CallbackInfo callbackInfo) {
        DitR6vZ79qQrTZ031J7xzQQWKdUckNea$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV ditR6vZ79qQrTZ031J7xzQQWKdUckNea$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = new DitR6vZ79qQrTZ031J7xzQQWKdUckNea$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(ditR6vZ79qQrTZ031J7xzQQWKdUckNea$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV);
        if (!ditR6vZ79qQrTZ031J7xzQQWKdUckNea$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method159()) return;
        callbackInfo.cancel();
    }

    /*
     * Exception decompiling
     */
    @Overwrite
    @Overwrite
    protected void renderHotbar(ScaledResolution var1, float var2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl522 : INVOKESTATIC - null : trying to set 5 previously set to 6
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.populateStackInfo(Op02WithProcessedDataAndRefs.java:207)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.populateStackInfo(Op02WithProcessedDataAndRefs.java:1559)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:434)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         *     at the.bytecode.club.bytecodeviewer.decompilers.impl.CFRDecompiler.decompileToZip(CFRDecompiler.java:306)
         *     at the.bytecode.club.bytecodeviewer.resources.ResourceDecompiling.decompileSaveAll(ResourceDecompiling.java:262)
         *     at the.bytecode.club.bytecodeviewer.resources.ResourceDecompiling.lambda$decompileSaveAll$0(ResourceDecompiling.java:127)
         *     at java.base/java.lang.Thread.run(Thread.java:833)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Redirect(method={"renderGameOverlay"}, at=@At(value="FIELD", target="Lnet/minecraft/client/Minecraft;player:Lnet/minecraft/client/entity/EntityPlayerSP;"))
    @Redirect(method={"renderGameOverlay"}, at=@At(value="FIELD", target="Lnet/minecraft/client/Minecraft;player:Lnet/minecraft/client/entity/EntityPlayerSP;"))
    private EntityPlayerSP redirectOverlayPlayer(Minecraft minecraft) {
        W3C0y9394VvVcZKAtDfQSnqXm5zLQGty w3C0y9394VvVcZKAtDfQSnqXm5zLQGty = new W3C0y9394VvVcZKAtDfQSnqXm5zLQGty();
        w3C0y9394VvVcZKAtDfQSnqXm5zLQGty.Field17182 = minecraft.player;
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(w3C0y9394VvVcZKAtDfQSnqXm5zLQGty);
        return w3C0y9394VvVcZKAtDfQSnqXm5zLQGty.Field17182;
    }

    @Redirect(method={"renderPotionEffects"}, at=@At(value="FIELD", target="Lnet/minecraft/client/Minecraft;player:Lnet/minecraft/client/entity/EntityPlayerSP;"))
    @Redirect(method={"renderPotionEffects"}, at=@At(value="FIELD", target="Lnet/minecraft/client/Minecraft;player:Lnet/minecraft/client/entity/EntityPlayerSP;"))
    private EntityPlayerSP redirectPotionPlayer(Minecraft minecraft) {
        W3C0y9394VvVcZKAtDfQSnqXm5zLQGty w3C0y9394VvVcZKAtDfQSnqXm5zLQGty = new W3C0y9394VvVcZKAtDfQSnqXm5zLQGty();
        w3C0y9394VvVcZKAtDfQSnqXm5zLQGty.Field17182 = minecraft.player;
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(w3C0y9394VvVcZKAtDfQSnqXm5zLQGty);
        return w3C0y9394VvVcZKAtDfQSnqXm5zLQGty.Field17182;
    }

    @Inject(method={"renderAttackIndicator"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"renderAttackIndicator"}, at={@At(value="HEAD")}, cancellable=true)
    private void onRenderAttackIndicator(float f, ScaledResolution scaledResolution, CallbackInfo callbackInfo) {
        p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5 p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl52 = new p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5(f, scaledResolution);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl52);
        if (!p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl52.Method159()) return;
        callbackInfo.cancel();
    }
}

