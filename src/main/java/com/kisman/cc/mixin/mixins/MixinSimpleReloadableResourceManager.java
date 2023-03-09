//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lavahack.client.APLiuD42NlPlraivP9dUfLBjuvNUPiXs
 *  net.minecraft.client.resources.IResourceManager
 *  net.minecraft.client.resources.SimpleReloadableResourceManager
 *  net.minecraft.client.resources.data.MetadataSerializer
 *  net.minecraft.util.ResourceLocation
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.kisman.cc.mixin.mixins;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import lavahack.client.APLiuD42NlPlraivP9dUfLBjuvNUPiXs;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.SimpleReloadableResourceManager;
import net.minecraft.client.resources.data.MetadataSerializer;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={SimpleReloadableResourceManager.class})
public class MixinSimpleReloadableResourceManager {
    @Shadow
    @Final
    private MetadataSerializer Field15873;
    @Shadow
    @Final
    private Set Field15874;

    @Redirect(method={"getAllResources"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/resources/IResourceManager;getAllResources(Lnet/minecraft/util/ResourceLocation;)Ljava/util/List;"))
    @Redirect(method={"getAllResources"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/resources/IResourceManager;getAllResources(Lnet/minecraft/util/ResourceLocation;)Ljava/util/List;"))
    private List Method6520(IResourceManager iResourceManager, ResourceLocation resourceLocation) throws IOException {
        List list = iResourceManager.getAllResources(resourceLocation);
        list.addAll(APLiuD42NlPlraivP9dUfLBjuvNUPiXs.Method5474((ResourceLocation)resourceLocation));
        return list;
    }

    /*
     * Exception decompiling
     */
    @Inject(method={"getResource"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"getResource"}, at={@At(value="HEAD")}, cancellable=true)
    private void Method6521(ResourceLocation var1, CallbackInfoReturnable var2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl54 : ALOAD_3 - null : trying to set 0 previously set to 1
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

    @Inject(method={"getResourceDomains"}, at={@At(value="HEAD")})
    @Inject(method={"getResourceDomains"}, at={@At(value="HEAD")})
    private void Method6522(CallbackInfoReturnable callbackInfoReturnable) {
        MixinSimpleReloadableResourceManager mixinSimpleReloadableResourceManager = this;
        Set set = null;
        set.add("kismancc");
    }
}

