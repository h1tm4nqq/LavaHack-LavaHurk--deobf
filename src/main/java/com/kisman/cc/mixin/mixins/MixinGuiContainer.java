//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.inventory.GuiContainer
 *  net.minecraft.inventory.ClickType
 *  net.minecraft.inventory.Container
 *  net.minecraft.inventory.Slot
 *  net.minecraft.item.ItemStack
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins;

import java.awt.Color;
import java.util.Set;
import lavahack.client.DfxOZyI94jdDOZQSfulpe3ocgVMaQcfh;
import lavahack.client.MtRGnZ0MQXYZVwcrh1IN1d8I8EVjc3bI;
import lavahack.client.Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc;
import lavahack.client.iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO;
import lavahack.client.zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={GuiContainer.class}, priority=10000)
public class MixinGuiContainer
extends GuiScreen {
    @Shadow
    protected int Field15987;
    @Shadow
    protected int Field15988;
    @Shadow
    protected int Field15989;
    @Shadow
    protected int Field15990;
    @Shadow
    public Container Field15991;
    @Shadow
    private ItemStack Field15992;
    @Shadow
    private Slot Field15993;
    @Shadow
    private boolean Field15994;
    @Shadow
    protected boolean Field15995;
    @Shadow
    @Final
    protected Set Field15996;
    @Shadow
    private int Field15997;
    @Shadow
    private Slot Field15998;
    public iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO Field15999 = new iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO();
    private boolean Field16000 = false;
    private boolean Field16001 = false;
    private boolean Field16002 = true;
    private boolean Field16003 = true;
    private boolean Field16004 = true;

    @Shadow
    @Shadow
    private void updateDragSplitting() {
    }

    @Shadow
    @Shadow
    protected boolean checkHotbarKeys(int n) {
        return false;
    }

    @Shadow
    @Shadow
    protected void handleMouseClick(Slot slot, int n, int n2, ClickType clickType) {
    }

    /*
     * Exception decompiling
     */
    @Inject(method={"drawScreen"}, at={@At(value="TAIL")})
    @Inject(method={"drawScreen"}, at={@At(value="TAIL")})
    public void drawee(int var1, int var2, float var3, CallbackInfo var4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl216 : GETSTATIC - null : trying to set 0 previously set to 23
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

    /*
     * Exception decompiling
     */
    @Inject(method={"drawScreen"}, at={@At(value="HEAD")})
    @Inject(method={"drawScreen"}, at={@At(value="HEAD")})
    private void doDrawScreen(int var1, int var2, float var3, CallbackInfo var4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl59 : GOTO - null : trying to set 4 previously set to 5
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

    @Inject(method={"keyTyped"}, at={@At(value="HEAD")})
    @Inject(method={"keyTyped"}, at={@At(value="HEAD")})
    private void keyTypedHook(char c, int n, CallbackInfo callbackInfo) {
        if (!Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye.Field8384.Field8380.Method365()) return;
        this.Field15999.Method2401().textboxKeyTyped(c, n);
    }

    @Inject(method={"mouseClicked"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"mouseClicked"}, at={@At(value="HEAD")}, cancellable=true)
    private void doMouseClicked(int n, int n2, int n3, CallbackInfo callbackInfo) {
        if (!Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye.Field8384.Method35()) return;
        if (!Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye.Field8384.Field8380.Method365()) return;
        if (this.Field15999 == null) return;
        this.Field15999.Method2401().mouseClicked(n, n2, n3);
        if (!this.Field15999.Method2401().isFocused()) return;
        callbackInfo.cancel();
    }

    @Inject(method={"drawSlot"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/renderer/GlStateManager;enableDepth()V")})
    @Inject(method={"drawSlot"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/renderer/GlStateManager;enableDepth()V")})
    private void drawSlotHook(Slot slot, CallbackInfo callbackInfo) {
        if (Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye.Field8384.Method35() && Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye.Field8384.Field8380.Method365() && !this.Field15999.Method2403().isEmpty() && this.Field15999.Method2403().contains(slot.getStack())) {
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect((int)slot.xPos, (int)slot.yPos, (int)(slot.xPos + 16), (int)(slot.yPos + 16), (int)zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709(100, 100));
        }
        if (!DfxOZyI94jdDOZQSfulpe3ocgVMaQcfh.Method2214().Method35()) return;
        if (!DfxOZyI94jdDOZQSfulpe3ocgVMaQcfh.Method2214().Method2210().Method365()) return;
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect((int)slot.xPos, (int)slot.yPos, (int)(slot.xPos + 16), (int)(slot.yPos + 16), (int)Color.BLACK.getRGB());
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4744(String.valueOf(DfxOZyI94jdDOZQSfulpe3ocgVMaQcfh.Method2214().Method2211().Method341() == MtRGnZ0MQXYZVwcrh1IN1d8I8EVjc3bI.Field16945 ? slot.getSlotIndex() : slot.slotNumber), slot.xPos, slot.yPos, -1);
    }
}

