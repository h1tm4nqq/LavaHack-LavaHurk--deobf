//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.tileentity.TileEntity
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1037;
import lavahack.client.Class1254;
import lavahack.client.Class1673;
import lavahack.client.Class1736;
import lavahack.client.Class193;
import lavahack.client.Class1996;
import lavahack.client.Class2163;
import lavahack.client.Class403;
import lavahack.client.Class411;
import lavahack.client.Class42;
import lavahack.client.Class44;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010$\u001a\u00020\u0000J\u0010\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020'H\u0002J\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020)J\u000e\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020\u000eJ\u000e\u0010-\u001a\u00020)2\u0006\u0010,\u001a\u00020\u000eJ\u0006\u0010.\u001a\u00020\u0006J\u000e\u0010/\u001a\u00020)2\u0006\u0010,\u001a\u00020\u0010J\u000e\u00100\u001a\u00020)2\u0006\u0010,\u001a\u00020\u0010J\u0006\u00101\u001a\u00020)R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00150\bj\b\u0012\u0004\u0012\u00020\u0015`\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000Rb\u0010\u0016\u001aV\u0012\u0004\u0012\u00020\u0018\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00120\u0017j\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0012`\u001a0\u0017j*\u0012\u0004\u0012\u00020\u0018\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00120\u0017j\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0012`\u001a`\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R}\u0010\u001d\u001an\u0012\u0004\u0012\u00020\u001e\u0012,\u0012*\u0012\u0004\u0012\u00020\u0018\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00150\u0017j\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0015`\u001a0\u001f0\u0017j6\u0012\u0004\u0012\u00020\u001e\u0012,\u0012*\u0012\u0004\u0012\u00020\u0018\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00150\u0017j\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0015`\u001a0\u001f`\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!RJ\u0010\"\u001a>\u0012\u0004\u0012\u00020\u000e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00180\bj\b\u0012\u0004\u0012\u00020\u0018`\n0\u0017j\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00180\bj\b\u0012\u0004\u0012\u00020\u0018`\n`\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000RJ\u0010#\u001a>\u0012\u0004\u0012\u00020\u0010\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00180\bj\b\u0012\u0004\u0012\u00020\u0018`\n0\u0017j\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00180\bj\b\u0012\u0004\u0012\u00020\u0018`\n`\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2={"Lcom/kisman/cc/settings/util/ShadersRendererPattern;", "", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/features/module/Module;)V", "criticalSection", "", "groups", "Ljava/util/ArrayList;", "Lcom/kisman/cc/settings/types/SettingGroup;", "Lkotlin/collections/ArrayList;", "itemsFix", "Lcom/kisman/cc/settings/Setting;", "latestProcessedEntity", "Lnet/minecraft/entity/Entity;", "latestProcessedTileEntity", "Lnet/minecraft/tileentity/TileEntity;", "needToRenderHand", "Lcom/kisman/cc/util/thread/kisman/suppliers/ThreaddedBooleanSupplier;", "optimizationGroup", "settings", "Lcom/kisman/cc/settings/ShadersSetting;", "shaderMap", "Ljava/util/HashMap;", "Lcom/kisman/cc/util/enums/ShadersShaders;", "Lcom/kisman/cc/util/enums/dynamic/ShadersObjectsEnum$ShadersObjects;", "Lkotlin/collections/HashMap;", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "uniforms", "", "Lcom/kisman/cc/util/collections/Bind;", "getUniforms", "()Ljava/util/HashMap;", "validEntities", "validTileEntities", "init", "needToProcessType", "type", "Lcom/kisman/cc/util/enums/ShadersObjectTypes;", "renderEntitiesPost", "", "renderEntitiesPre", "renderEntityPost", "entity", "renderEntityPre", "renderHand", "renderTileEntityPost", "renderTileEntityPre", "update", "kisman.cc"})
public final class Class1482 {
    private final ArrayList Field14909;
    private final ArrayList Field14910;
    private final Class1996 Field14911;
    private final Class411 Field14912;
    private final Class44 Field14913;
    private Class1037 Field14914;
    private boolean Field14915;
    private final HashMap Field14916;
    @NotNull
    private final HashMap Field14917;
    private final HashMap Field14918;
    private final HashMap Field14919;
    private Entity Field14920;
    private TileEntity Field14921;
    private final Class42 Field14922;
    private String Field14923 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final HashMap Method5924() {
        return this.Field14917;
    }

    @NotNull
    @NotNull
    public final Class1482 Method5925() {
        for (Object object : this.Field14909) {
            this.Field14922.Method24((Class1996)object);
        }
        Iterator iterator = this.Field14910.iterator();
        while (true) {
            Object object;
            if (!iterator.hasNext()) {
                this.Field14922.Method24(this.Field14911);
                this.Field14922.Method23(this.Field14913);
                this.Field14912.Method2003();
                return this;
            }
            object = (Class403)iterator.next();
            this.Field14922.Method23(((Class403)object).Method1984());
        }
    }

    private final boolean Method5926(Class1736 class1736) {
        Class403 class403;
        Iterator iterator = this.Field14910.iterator();
        do {
            if (!iterator.hasNext()) return false;
        } while ((class403 = (Class403)iterator.next()).Method1985() != class1736 || class403.Method1987() != null || class403.Method1988() != Class1254.Field13685 || !class403.Method1984().Method365());
        return true;
    }

    public final void Method5927() {
        this.Field14912.Method2005(Class193.Field8852);
    }

    /*
     * Exception decompiling
     */
    public final boolean Method5928() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl12 : ICONST_0 - null : trying to set 0 previously set to 1
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

    public final void Method5929(@NotNull @NotNull Entity entity) {
        Intrinsics.checkParameterIsNotNull((Object)entity, (String)"entity");
        Object object = this.Field14918;
        boolean bl = false;
        Map map = object;
        boolean bl2 = false;
        if (!map.containsKey(entity)) {
            this.Field14920 = null;
            return;
        }
        this.Field14920 = entity;
        Object v = this.Field14918.get(entity);
        if (v == null) {
            Intrinsics.throwNpe();
        }
        Iterator iterator = ((ArrayList)v).iterator();
        while (iterator.hasNext()) {
            object = (Class2163)((Object)iterator.next());
            Class1673 class1673 = ((Class2163)((Object)object)).Method1481().Method6462(this);
            Minecraft minecraft = Class2142.Field17803;
            Intrinsics.checkExpressionValueIsNotNull((Object)minecraft, (String)"mc");
            class1673.Method923(minecraft.getRenderPartialTicks());
        }
    }

    public final void Method5930(@NotNull @NotNull Entity entity) {
        Intrinsics.checkParameterIsNotNull((Object)entity, (String)"entity");
        if (this.Field14920 == null) return;
        Object v = this.Field14918.get(entity);
        if (v == null) {
            Intrinsics.throwNpe();
        }
        Iterator iterator = ((ArrayList)v).iterator();
        while (iterator.hasNext()) {
            Class2163 class2163 = (Class2163)((Object)iterator.next());
            class2163.Method1481().Method6462(this).Method924();
        }
    }

    public final void Method5931(@NotNull @NotNull TileEntity tileEntity) {
        Intrinsics.checkParameterIsNotNull((Object)tileEntity, (String)"entity");
        Object object = this.Field14919;
        boolean bl = false;
        Map map = object;
        boolean bl2 = false;
        if (!map.containsKey(tileEntity)) {
            this.Field14921 = null;
            return;
        }
        this.Field14921 = tileEntity;
        Object v = this.Field14919.get(tileEntity);
        if (v == null) {
            Intrinsics.throwNpe();
        }
        Iterator iterator = ((ArrayList)v).iterator();
        while (iterator.hasNext()) {
            object = (Class2163)((Object)iterator.next());
            Class1673 class1673 = ((Class2163)((Object)object)).Method1481().Method6462(this);
            Minecraft minecraft = Class2142.Field17803;
            Intrinsics.checkExpressionValueIsNotNull((Object)minecraft, (String)"mc");
            class1673.Method923(minecraft.getRenderPartialTicks());
        }
    }

    public final void Method5932(@NotNull @NotNull TileEntity tileEntity) {
        Intrinsics.checkParameterIsNotNull((Object)tileEntity, (String)"entity");
        if (this.Field14921 == null) return;
        Object v = this.Field14919.get(tileEntity);
        if (v == null) {
            Intrinsics.throwNpe();
        }
        Iterator iterator = ((ArrayList)v).iterator();
        while (iterator.hasNext()) {
            Class2163 class2163 = (Class2163)((Object)iterator.next());
            class2163.Method1481().Method6462(this).Method924();
        }
    }

    public final void Method5933() {
        GlStateManager.matrixMode((int)5889);
        GlStateManager.pushMatrix();
        GlStateManager.matrixMode((int)5888);
        GlStateManager.pushMatrix();
    }

    public final void Method5934() {
        GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f);
        GlStateManager.matrixMode((int)5889);
        GlStateManager.popMatrix();
        GlStateManager.matrixMode((int)5888);
        GlStateManager.popMatrix();
    }

    /*
     * Exception decompiling
     */
    public Class1482(@NotNull @NotNull Class42 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[UNCONDITIONALDOLOOP]], but top level block is 2[UNCONDITIONALDOLOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    public static final boolean Method5935(Class1482 class1482, Class1736 class1736) {
        return class1482.Method5926(class1736);
    }

    private static String Method5936(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 26;
            cArray2[n] = (char)(cArray[n] ^ (0x231F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

