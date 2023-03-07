/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.IBaritone
 *  baritone.api.event.events.BlockInteractEvent
 *  baritone.api.event.events.BlockInteractEvent$Type
 *  baritone.api.event.events.TickEvent
 *  baritone.api.event.events.TickEvent$Type
 *  baritone.api.event.events.WorldEvent
 *  baritone.api.event.events.type.EventState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.multiplayer.PlayerControllerMP
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.client.settings.GameSettings
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.EnumActionResult
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  org.lwjgl.input.Mouse
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.LocalCapture
 */
package com.kisman.cc.mixin.mixins;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.event.events.BlockInteractEvent;
import baritone.api.event.events.TickEvent;
import baritone.api.event.events.WorldEvent;
import baritone.api.event.events.type.EventState;
import com.kisman.cc.event.Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import java.util.Iterator;
import java.util.function.BiFunction;
import lavahack.client.DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA;
import lavahack.client.LW9XsGygL5ez72fpW8b3DmWKe5wNuiTy;
import lavahack.client.QSyAD3eZsyQQEeCIIBcGJBEyANEJ87jH;
import lavahack.client.WEiQLLFUQVuGOj7qvqACpofn3o9d8dxK;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC;
import lavahack.client.w4Aw39jw2Y7noji9TGDOyzX40rFHppel;
import lavahack.client.w4Aw39jw2Y7noji9TGDOyzX40rFHppel$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.wkwi2Aupxpyp8sqUHbaH7iYHxWosUPRY;
import lavahack.client.xsjgW5Cq2fvtzUbTEsvr5lIr0M7naGKG;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import org.lwjgl.input.Mouse;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(value={Minecraft.class}, priority=10000)
public class MixinMinecraft
implements wkwi2Aupxpyp8sqUHbaH7iYHxWosUPRY {
    @Shadow
    public GameSettings Field16133;
    @Shadow
    public EntityPlayerSP Field16134;
    @Shadow
    public PlayerControllerMP Field16135;
    private boolean Field16136 = false;
    private boolean Field16137 = false;
    @Shadow
    public WorldClient Field16138;

    @Inject(method={"init"}, at={@At(value="RETURN")})
    @Inject(method={"init"}, at={@At(value="RETURN")})
    private void Method6718(CallbackInfo callbackInfo) {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Method6779();
    }

    @Inject(method={"runTick"}, at={@At(value="HEAD")})
    @Inject(method={"runTick"}, at={@At(value="HEAD")})
    public void Method6719(CallbackInfo callbackInfo) {
        lykufhPOEnCHuwIMw0o30bjFnsTt0nqG$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf lykufhPOEnCHuwIMw0o30bjFnsTt0nqG$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = new lykufhPOEnCHuwIMw0o30bjFnsTt0nqG$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(lykufhPOEnCHuwIMw0o30bjFnsTt0nqG$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf);
    }

    @Inject(method={"runTick"}, at={@At(value="RETURN")})
    @Inject(method={"runTick"}, at={@At(value="RETURN")})
    public void Method6720(CallbackInfo callbackInfo) {
        lykufhPOEnCHuwIMw0o30bjFnsTt0nqG$leqS0IyKEB621E1SrHdAcHHAUjScjmKi lykufhPOEnCHuwIMw0o30bjFnsTt0nqG$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = new lykufhPOEnCHuwIMw0o30bjFnsTt0nqG$leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(lykufhPOEnCHuwIMw0o30bjFnsTt0nqG$leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
        if (!DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA.Field15191.Method35()) return;
        DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA.Field15191.Method20();
    }

    /*
     * Exception decompiling
     */
    @Inject(method={"processKeyBinds"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/settings/KeyBinding;isKeyDown()Z", shift=At.Shift.BEFORE, ordinal=2)})
    @Inject(method={"processKeyBinds"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/settings/KeyBinding;isKeyDown()Z", shift=At.Shift.BEFORE, ordinal=2)})
    public void Method6721(CallbackInfo var1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl7 : ALOAD_0 - null : trying to set 1 previously set to 0
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

    @Inject(method={"clickMouse"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"clickMouse"}, at={@At(value="HEAD")}, cancellable=true)
    private void Method6722(CallbackInfo callbackInfo) {
        WEiQLLFUQVuGOj7qvqACpofn3o9d8dxK.Method2383();
        callbackInfo.cancel();
    }

    /*
     * Exception decompiling
     */
    @Inject(method={"rightClickMouse"}, at={@At(value="HEAD")})
    @Inject(method={"rightClickMouse"}, at={@At(value="HEAD")})
    public void Method6723(CallbackInfo var1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl16 : RETURN - null : trying to set 0 previously set to 2
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
    @Inject(method={"rightClickMouse"}, at={@At(value="RETURN")})
    @Inject(method={"rightClickMouse"}, at={@At(value="RETURN")})
    public void Method6724(CallbackInfo var1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl16 : RETURN - null : trying to set 1 previously set to 2
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
    @Inject(method={"sendClickBlockToController"}, at={@At(value="HEAD")})
    @Inject(method={"sendClickBlockToController"}, at={@At(value="HEAD")})
    public void Method6725(boolean var1, CallbackInfo var2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl16 : RETURN - null : trying to set 0 previously set to 2
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
    @Inject(method={"sendClickBlockToController"}, at={@At(value="RETURN")})
    @Inject(method={"sendClickBlockToController"}, at={@At(value="RETURN")})
    public void Method6726(boolean var1, CallbackInfo var2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl16 : RETURN - null : trying to set 1 previously set to 2
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

    @Shadow
    @Shadow
    private void Method6727(boolean bl) {
    }

    @Inject(method={"init"}, at={@At(value="RETURN")})
    @Inject(method={"init"}, at={@At(value="RETURN")})
    private void Method6728(CallbackInfo callbackInfo) {
        BaritoneAPI.getProvider().getPrimaryBaritone();
    }

    @Inject(method={"runTick"}, at={@At(value="FIELD", opcode=180, target="net/minecraft/client/Minecraft.currentScreen:Lnet/minecraft/client/gui/GuiScreen;", ordinal=5, shift=At.Shift.BY, by=-3)})
    @Inject(method={"runTick"}, at={@At(value="FIELD", opcode=180, target="net/minecraft/client/Minecraft.currentScreen:Lnet/minecraft/client/gui/GuiScreen;", ordinal=5, shift=At.Shift.BY, by=-3)})
    private void Method6729(CallbackInfo callbackInfo) {
        BiFunction biFunction = TickEvent.createNextProvider();
        Iterator iterator = BaritoneAPI.getProvider().getAllBaritones().iterator();
        while (iterator.hasNext()) {
            IBaritone iBaritone = (IBaritone)iterator.next();
            TickEvent.Type type = iBaritone.getPlayerContext().player() != null && iBaritone.getPlayerContext().world() != null ? TickEvent.Type.IN : TickEvent.Type.OUT;
            iBaritone.getGameEventHandler().onTick((TickEvent)biFunction.apply(EventState.PRE, type));
        }
    }

    @Inject(method={"loadWorld(Lnet/minecraft/client/multiplayer/WorldClient;Ljava/lang/String;)V"}, at={@At(value="HEAD")})
    @Inject(method={"loadWorld(Lnet/minecraft/client/multiplayer/WorldClient;Ljava/lang/String;)V"}, at={@At(value="HEAD")})
    private void Method6730(WorldClient worldClient, String string, CallbackInfo callbackInfo) {
        MixinMinecraft mixinMinecraft = this;
        if (null == null && worldClient == null) {
            return;
        }
        BaritoneAPI.getProvider().getPrimaryBaritone().getGameEventHandler().onWorldEvent(new WorldEvent(worldClient, EventState.PRE));
    }

    @Inject(method={"loadWorld(Lnet/minecraft/client/multiplayer/WorldClient;Ljava/lang/String;)V"}, at={@At(value="RETURN")})
    @Inject(method={"loadWorld(Lnet/minecraft/client/multiplayer/WorldClient;Ljava/lang/String;)V"}, at={@At(value="RETURN")})
    private void Method6731(WorldClient worldClient, String string, CallbackInfo callbackInfo) {
        BaritoneAPI.getProvider().getPrimaryBaritone().getGameEventHandler().onWorldEvent(new WorldEvent(worldClient, EventState.POST));
    }

    /*
     * Exception decompiling
     */
    @Redirect(method={"runTick"}, at=@At(value="FIELD", opcode=180, target="net/minecraft/client/gui/GuiScreen.allowUserInput:Z"))
    @Redirect(method={"runTick"}, at=@At(value="FIELD", opcode=180, target="net/minecraft/client/gui/GuiScreen.allowUserInput:Z"))
    private boolean Method6732(GuiScreen var1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl9 : ALOAD_1 - null : trying to set 0 previously set to 1
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

    @Inject(method={"clickMouse"}, at={@At(value="INVOKE", target="net/minecraft/client/multiplayer/PlayerControllerMP.clickBlock(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z")}, locals=LocalCapture.CAPTURE_FAILHARD)
    @Inject(method={"clickMouse"}, at={@At(value="INVOKE", target="net/minecraft/client/multiplayer/PlayerControllerMP.clickBlock(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z")}, locals=LocalCapture.CAPTURE_FAILHARD)
    private void Method6733(CallbackInfo callbackInfo, BlockPos blockPos) {
        BaritoneAPI.getProvider().getPrimaryBaritone().getGameEventHandler().onBlockInteract(new BlockInteractEvent(blockPos, BlockInteractEvent.Type.START_BREAK));
    }

    @Inject(method={"rightClickMouse"}, at={@At(value="INVOKE", target="net/minecraft/client/entity/EntityPlayerSP.swingArm(Lnet/minecraft/util/EnumHand;)V")}, locals=LocalCapture.CAPTURE_FAILHARD)
    @Inject(method={"rightClickMouse"}, at={@At(value="INVOKE", target="net/minecraft/client/entity/EntityPlayerSP.swingArm(Lnet/minecraft/util/EnumHand;)V")}, locals=LocalCapture.CAPTURE_FAILHARD)
    private void Method6734(CallbackInfo callbackInfo, EnumHand[] enumHandArray, int n, int n2, EnumHand enumHand, ItemStack itemStack, BlockPos blockPos, int n3, EnumActionResult enumActionResult) {
        BaritoneAPI.getProvider().getPrimaryBaritone().getGameEventHandler().onBlockInteract(new BlockInteractEvent(blockPos, BlockInteractEvent.Type.USE));
    }

    @Inject(method={"runTickKeyboard"}, at={@At(value="INVOKE_ASSIGN", target="org/lwjgl/input/Keyboard.getEventKeyState()Z", remap=false)})
    @Inject(method={"runTickKeyboard"}, at={@At(value="INVOKE_ASSIGN", target="org/lwjgl/input/Keyboard.getEventKeyState()Z", remap=false)})
    private void Method6735(CallbackInfo callbackInfo) {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(new w4Aw39jw2Y7noji9TGDOyzX40rFHppel(LW9XsGygL5ez72fpW8b3DmWKe5wNuiTy.Method3906(), LW9XsGygL5ez72fpW8b3DmWKe5wNuiTy.Method3907(), LW9XsGygL5ez72fpW8b3DmWKe5wNuiTy.Method3908()));
    }

    @Inject(method={"runTick"}, at={@At(value="FIELD", target="Lnet/minecraft/client/Minecraft;world:Lnet/minecraft/client/multiplayer/WorldClient;", ordinal=4, shift=At.Shift.BEFORE)})
    @Inject(method={"runTick"}, at={@At(value="FIELD", target="Lnet/minecraft/client/Minecraft;world:Lnet/minecraft/client/multiplayer/WorldClient;", ordinal=4, shift=At.Shift.BEFORE)})
    public void Method6736(CallbackInfo callbackInfo) {
        if (xsjgW5Cq2fvtzUbTEsvr5lIr0M7naGKG.Field8954.Method1262()) return;
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(new w4Aw39jw2Y7noji9TGDOyzX40rFHppel$leqS0IyKEB621E1SrHdAcHHAUjScjmKi());
    }

    @Inject(method={"runTickMouse"}, at={@At(value="INVOKE", target="Lorg/lwjgl/input/Mouse;getEventButton()I", remap=false)})
    @Inject(method={"runTickMouse"}, at={@At(value="INVOKE", target="Lorg/lwjgl/input/Mouse;getEventButton()I", remap=false)})
    private void Method6737(CallbackInfo callbackInfo) {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(new QSyAD3eZsyQQEeCIIBcGJBEyANEJ87jH(Mouse.getEventButton(), Mouse.getEventButtonState()));
    }

    @Inject(method={"sendClickBlockToController"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"sendClickBlockToController"}, at={@At(value="HEAD")}, cancellable=true)
    public void Method6738(boolean bl, CallbackInfo callbackInfo) {
        rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC2 = new rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC(Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13746, bl);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC2);
        if (!rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC2.Method159()) return;
        callbackInfo.cancel();
    }

    @Inject(method={"sendClickBlockToController"}, at={@At(value="RETURN")})
    @Inject(method={"sendClickBlockToController"}, at={@At(value="RETURN")})
    public void Method6739(boolean bl, CallbackInfo callbackInfo) {
        rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC2 = new rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC(Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13747, bl);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC2);
    }

    @Override
    public void Method6103(boolean bl) {
        this.Method6727(bl);
    }
}

