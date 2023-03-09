//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lavahack.client.WazuyEmi1E8Qbbxmq0EXDYiIMAFUanLY
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.renderer.entity.Render
 *  net.minecraft.client.renderer.entity.RenderEnderCrystal
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityEnderCrystal
 *  net.minecraft.util.ResourceLocation
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins;

import com.kisman.cc.mixin.mixins.accessor.AccessorRenderEnderCrystal;
import lavahack.client.WazuyEmi1E8Qbbxmq0EXDYiIMAFUanLY;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderEnderCrystal;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={RenderEnderCrystal.class}, priority=10000)
public class MixinRenderEnderCrystal
extends Render {
    @Final
    @Shadow
    private ModelBase Field13234;
    @Final
    @Shadow
    private ModelBase Field13235;
    @Final
    @Shadow
    private static ResourceLocation Field13236;

    @Shadow
    @Shadow
    @Nullable
    @Nullable
    protected ResourceLocation getEntityTexture(@NotNull @NotNull EntityEnderCrystal entityEnderCrystal) {
        return null;
    }

    protected MixinRenderEnderCrystal(RenderManager renderManager) {
        super(renderManager);
    }

    @Inject(method={"<init>"}, at={@At(value="RETURN")})
    @Inject(method={"<init>"}, at={@At(value="RETURN")})
    private void init(RenderManager renderManager, CallbackInfo callbackInfo) {
        ((AccessorRenderEnderCrystal)((Object)this)).Method3251((ModelBase)new WazuyEmi1E8Qbbxmq0EXDYiIMAFUanLY(true));
        ((AccessorRenderEnderCrystal)((Object)this)).Method3252((ModelBase)new WazuyEmi1E8Qbbxmq0EXDYiIMAFUanLY(false));
    }

    /*
     * Exception decompiling
     */
    @Inject(method={"doRender(Lnet/minecraft/entity/item/EntityEnderCrystal;DDDFF)V"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"doRender(Lnet/minecraft/entity/item/EntityEnderCrystal;DDDFF)V"}, at={@At(value="HEAD")}, cancellable=true)
    public void IdoRender(EntityEnderCrystal var1, double var2, double var4, double var6, float var8, float var9, CallbackInfo var10) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl58 : RETURN - null : trying to set 0 previously set to 1
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
    @Nullable
    @Nullable
    protected ResourceLocation getEntityTexture(@NotNull @NotNull Entity entity) {
        return this.getEntityTexture((EntityEnderCrystal)entity);
    }
}

