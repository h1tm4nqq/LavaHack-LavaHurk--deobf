//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.renderer.entity.Render
 *  net.minecraft.client.renderer.entity.RenderLivingBase
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.util.ResourceLocation
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Overwrite
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins;

import javax.annotation.Nullable;
import lavahack.client.OvvNFVp1prZcFYv57XGirjG11JCXathw;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.uMfEtw4TfDofnkM30Gh2n5bH4HfzL3Wu;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={RenderLivingBase.class}, priority=10)
public class MixinRendererLivingEntity
extends Render {
    @Shadow
    protected ModelBase Field16560;

    protected MixinRendererLivingEntity() {
        super(null);
    }

    @Inject(method={"renderName(Lnet/minecraft/entity/Entity;DDD)V"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"renderName(Lnet/minecraft/entity/Entity;DDD)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void doRenderName(Entity entity, double d, double d2, double d3, CallbackInfo callbackInfo) {
        OvvNFVp1prZcFYv57XGirjG11JCXathw ovvNFVp1prZcFYv57XGirjG11JCXathw = new OvvNFVp1prZcFYv57XGirjG11JCXathw(entity, d, d, d3, "", 0.0);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(ovvNFVp1prZcFYv57XGirjG11JCXathw);
        if (!ovvNFVp1prZcFYv57XGirjG11JCXathw.Method159()) return;
        callbackInfo.cancel();
    }

    @Inject(method={"doRender(Lnet/minecraft/entity/EntityLivingBase;DDDFF)V"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"doRender(Lnet/minecraft/entity/EntityLivingBase;DDDFF)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void doDoRender(EntityLivingBase entityLivingBase, double d, double d2, double d3, float f, float f2, CallbackInfo callbackInfo) {
        Minecraft minecraft = Minecraft.getMinecraft();
        if (minecraft.world == null) return;
        if (minecraft.player == null) return;
        if (!uMfEtw4TfDofnkM30Gh2n5bH4HfzL3Wu.Field17089.Method35()) return;
        if (!uMfEtw4TfDofnkM30Gh2n5bH4HfzL3Wu.Field17089.Field17086.Method365()) return;
        if (!(minecraft.player.getDistance((Entity)entityLivingBase) > (float)uMfEtw4TfDofnkM30Gh2n5bH4HfzL3Wu.Field17089.Field17087.Method335())) return;
        callbackInfo.cancel();
    }

    /*
     * Exception decompiling
     */
    @Overwrite
    @Overwrite
    protected void renderModel(EntityLivingBase var1, float var2, float var3, float var4, float var5, float var6, float var7) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl59 : RETURN - null : trying to set 0 previously set to 1
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

    protected boolean isVisible(EntityLivingBase entityLivingBase) {
        if (!entityLivingBase.isInvisible()) return true;
        if (this.renderOutlines) return true;
        return false;
    }

    @Nullable
    @Nullable
    protected ResourceLocation getEntityTexture(EntityLivingBase entityLivingBase) {
        return null;
    }

    @Nullable
    @Nullable
    protected ResourceLocation getEntityTexture(Entity entity) {
        return this.getEntityTexture((EntityLivingBase)entity);
    }
}

