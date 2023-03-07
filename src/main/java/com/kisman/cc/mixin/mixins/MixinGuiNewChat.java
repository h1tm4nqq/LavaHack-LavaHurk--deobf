//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.gui.GuiNewChat
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArg
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins;

import java.util.List;
import lavahack.client.dHW1jZK49fXgBu9AY91BXDMHsTGGza8u;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.o9lanP0gHU278cwDFs7XEsyWoBrJVe44;
import lavahack.client.om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz;
import lavahack.client.zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiNewChat;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={GuiNewChat.class}, priority=10000)
public class MixinGuiNewChat {
    @Shadow
    public boolean Field15554;
    private float Field15555;
    private int Field15556;
    private long Field15557 = System.currentTimeMillis();
    private float Field15558;
    private int Field15559;

    @Shadow
    @Shadow
    public float Method6286() {
        return 0.0f;
    }

    private void Method6287(long l) {
        if (this.Field15555 < 1.0f) {
            this.Field15555 += 0.004f * (float)l;
        }
        this.Field15555 = (float)dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2118(this.Field15555, 0.0, 1.0);
    }

    @Inject(method={"drawChat"}, at={@At(value="HEAD")})
    @Inject(method={"drawChat"}, at={@At(value="HEAD")})
    private void Method6288(CallbackInfo callbackInfo) {
        om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz2 = (om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz)leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Method1162("ChatModifier");
        if (!om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz2.Method35()) return;
        if (!om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz2.Method4012().Method365()) return;
        long l = System.currentTimeMillis();
        long l2 = l - this.Field15557;
        this.Field15557 = l;
        this.Method6287(l2);
        float f = this.Field15555;
        this.Field15558 = (float)dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2118(1.0f - (f -= 1.0f) * f * f * f, 0.0, 1.0);
    }

    /*
     * Exception decompiling
     */
    @Inject(method={"drawChat"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/renderer/GlStateManager;pushMatrix()V", ordinal=0, shift=At.Shift.AFTER)})
    @Inject(method={"drawChat"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/renderer/GlStateManager;pushMatrix()V", ordinal=0, shift=At.Shift.AFTER)})
    private void Method6289(CallbackInfo var1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl48 : RETURN - null : trying to set 0 previously set to 1
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

    @ModifyArg(method={"drawChat"}, at=@At(value="INVOKE", target="Ljava/util/List;get(I)Ljava/lang/Object;", ordinal=0, remap=false), index=0)
    @ModifyArg(method={"drawChat"}, at=@At(value="INVOKE", target="Ljava/util/List;get(I)Ljava/lang/Object;", ordinal=0, remap=false), index=0)
    private int Method6290(int n) {
        this.Field15559 = n;
        return this.Field15559;
    }

    @Redirect(method={"drawChat"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/GuiNewChat;drawRect(IIIII)V"))
    @Redirect(method={"drawChat"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/GuiNewChat;drawRect(IIIII)V"))
    private void Method6291(int n, int n2, int n3, int n4, int n5) {
        if (o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Field16381.Method365()) {
            return;
        }
        Gui.drawRect((int)n, (int)n2, (int)n3, (int)n4, (int)n5);
    }

    @Redirect(method={"drawChat"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/FontRenderer;drawStringWithShadow(Ljava/lang/String;FFI)I"))
    @Redirect(method={"drawChat"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/FontRenderer;drawStringWithShadow(Ljava/lang/String;FFI)I"))
    private int Method6292(FontRenderer fontRenderer, String string, float f, float f2, int n) {
        om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz2 = (om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz)leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Method1162("ChatModifier");
        int n2 = n;
        int n3 = (int)f2;
        if (this.Field15559 <= this.Field15556 && om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz2.Method35() && om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz2.Method4012().Method365()) {
            int n4 = (int)((float)((int)f2 >> 24 & 0xFF) * this.Field15558);
            n3 = (int)f2 & 0xFFFFFF | n4 << 24;
            n2 = zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4729(n, n4).getRGB();
        }
        if (!om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz2.Method35()) return fontRenderer.drawStringWithShadow(string, f, (float)n3, n2);
        if (!om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz2.Method4015().Method365()) return fontRenderer.drawStringWithShadow(string, f, (float)n3, n2);
        return fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(string, f, n3, n2);
    }

    @Inject(method={"printChatMessageWithOptionalDeletion"}, at={@At(value="HEAD")})
    @Inject(method={"printChatMessageWithOptionalDeletion"}, at={@At(value="HEAD")})
    private void Method6293(CallbackInfo callbackInfo) {
        this.Field15555 = 0.0f;
    }

    @ModifyVariable(method={"setChatLine"}, at=@At(value="STORE"), ordinal=0)
    @ModifyVariable(method={"setChatLine"}, at=@At(value="STORE"), ordinal=0)
    private List Method6294(List list) {
        this.Field15556 = list.size() - 1;
        return list;
    }

    @ModifyVariable(method={"getChatComponent"}, at=@At(value="STORE", ordinal=0), ordinal=4)
    @ModifyVariable(method={"getChatComponent"}, at=@At(value="STORE", ordinal=0), ordinal=4)
    private int Method6295(int n) {
        return n + 1;
    }
}

