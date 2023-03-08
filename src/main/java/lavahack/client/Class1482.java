//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import net.minecraft.entity.*;
import net.minecraft.tileentity.*;
import java.util.*;
import kotlin.jvm.internal.*;
import com.kisman.cc.util.*;
import net.minecraft.client.*;
import net.minecraft.client.renderer.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004J\u0006\u0010$\u001a\u00020\u0000J\u0010\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020'H\u0002J\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020)J\u000e\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020\u000eJ\u000e\u0010-\u001a\u00020)2\u0006\u0010,\u001a\u00020\u000eJ\u0006\u0010.\u001a\u00020\u0006J\u000e\u0010/\u001a\u00020)2\u0006\u0010,\u001a\u00020\u0010J\u000e\u00100\u001a\u00020)2\u0006\u0010,\u001a\u00020\u0010J\u0006\u00101\u001a\u00020)R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e?\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004?\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e?\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u0004?\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00150\bj\b\u0012\u0004\u0012\u00020\u0015`\nX\u0082\u0004?\u0006\u0002\n\u0000Rb\u0010\u0016\u001aV\u0012\u0004\u0012\u00020\u0018\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00120\u0017j\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0012`\u001a0\u0017j*\u0012\u0004\u0012\u00020\u0018\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00120\u0017j\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0012`\u001a`\u001aX\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004?\u0006\u0002\n\u0000R}\u0010\u001d\u001an\u0012\u0004\u0012\u00020\u001e\u0012,\u0012*\u0012\u0004\u0012\u00020\u0018\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00150\u0017j\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0015`\u001a0\u001f0\u0017j6\u0012\u0004\u0012\u00020\u001e\u0012,\u0012*\u0012\u0004\u0012\u00020\u0018\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00150\u0017j\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0015`\u001a0\u001f`\u001a?\u0006\b\n\u0000\u001a\u0004\b \u0010!RJ\u0010\"\u001a>\u0012\u0004\u0012\u00020\u000e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00180\bj\b\u0012\u0004\u0012\u00020\u0018`\n0\u0017j\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00180\bj\b\u0012\u0004\u0012\u00020\u0018`\n`\u001aX\u0082\u0004?\u0006\u0002\n\u0000RJ\u0010#\u001a>\u0012\u0004\u0012\u00020\u0010\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00180\bj\b\u0012\u0004\u0012\u00020\u0018`\n0\u0017j\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00180\bj\b\u0012\u0004\u0012\u00020\u0018`\n`\u001aX\u0082\u0004?\u0006\u0002\n\u0000?\u00062" }, d2 = { "Lcom/kisman/cc/settings/util/ShadersRendererPattern;", "", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/features/module/Module;)V", "criticalSection", "", "groups", "Ljava/util/ArrayList;", "Lcom/kisman/cc/settings/types/SettingGroup;", "Lkotlin/collections/ArrayList;", "itemsFix", "Lcom/kisman/cc/settings/Setting;", "latestProcessedEntity", "Lnet/minecraft/entity/Entity;", "latestProcessedTileEntity", "Lnet/minecraft/tileentity/TileEntity;", "needToRenderHand", "Lcom/kisman/cc/util/thread/kisman/suppliers/ThreaddedBooleanSupplier;", "optimizationGroup", "settings", "Lcom/kisman/cc/settings/ShadersSetting;", "shaderMap", "Ljava/util/HashMap;", "Lcom/kisman/cc/util/enums/ShadersShaders;", "Lcom/kisman/cc/util/enums/dynamic/ShadersObjectsEnum$ShadersObjects;", "Lkotlin/collections/HashMap;", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "uniforms", "", "Lcom/kisman/cc/util/collections/Bind;", "getUniforms", "()Ljava/util/HashMap;", "validEntities", "validTileEntities", "init", "needToProcessType", "type", "Lcom/kisman/cc/util/enums/ShadersObjectTypes;", "renderEntitiesPost", "", "renderEntitiesPre", "renderEntityPost", "entity", "renderEntityPre", "renderHand", "renderTileEntityPost", "renderTileEntityPre", "update", "kisman.cc" })
public final class Class1482
{
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
        final Iterator<Class1996> iterator = this.Field14909.iterator();
        while (iterator.hasNext()) {
            this.Field14922.Method24(iterator.next());
        }
        final Iterator<Class403> iterator2 = this.Field14910.iterator();
        while (iterator2.hasNext()) {
            this.Field14922.Method23(iterator2.next().Method1984());
        }
        this.Field14922.Method24(this.Field14911);
        this.Field14922.Method23(this.Field14913);
        this.Field14912.Method2003();
        return this;
    }
    
    private final boolean Method5926(final Class1736 class1736) {
        for (final Class403 class1737 : this.Field14910) {
            if (class1737.Method1985() == class1736 && class1737.Method1987() == null && class1737.Method1988() == Class1254.Field13685 && class1737.Method1984().Method365()) {
                return true;
            }
        }
        return false;
    }
    
    public final void Method5927() {
        this.Field14912.Method2005(Class193.Field8852);
    }
    
    public final boolean Method5928() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        lavahack/client/Class1482.Field14914:Llavahack/client/Class1037;
        //     4: invokevirtual   lavahack/client/Class1037.Method4228:()Ljava/lang/Boolean;
        //     7: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    10: ifeq            27
        //    13: aload_0        
        //    14: getfield        lavahack/client/Class1482.Field14913:Llavahack/client/Class44;
        //    17: invokevirtual   lavahack/client/Class44.Method365:()Z
        //    20: ifeq            27
        //    23: aload_0        
        //    24: goto            27
        //    27: iconst_0       
        //    28: ireturn        
        //    29: aload_0        
        //    30: getfield        lavahack/client/Class1482.Field14914:Llavahack/client/Class1037;
        //    33: invokevirtual   lavahack/client/Class1037.Method4228:()Ljava/lang/Boolean;
        //    36: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    39: ifeq            56
        //    42: aload_0        
        //    43: getfield        lavahack/client/Class1482.Field14913:Llavahack/client/Class44;
        //    46: invokevirtual   lavahack/client/Class44.Method365:()Z
        //    49: ifeq            56
        //    52: aload_0        
        //    53: goto            56
        //    56: iconst_0       
        //    57: ireturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Inconsistent stack size at #0027 (coming from #0024).
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2183)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.Decompiler.decompile(Decompiler.java:70)
        //     at org.ugp.mc.deobfuscator.Deobfuscator3000.decompile(Deobfuscator3000.java:538)
        //     at org.ugp.mc.deobfuscator.Deobfuscator3000.decompileAndDeobfuscate(Deobfuscator3000.java:552)
        //     at org.ugp.mc.deobfuscator.Deobfuscator3000.processMod(Deobfuscator3000.java:510)
        //     at org.ugp.mc.deobfuscator.Deobfuscator3000.lambda$21(Deobfuscator3000.java:329)
        //     at java.base/java.lang.Thread.run(Thread.java:833)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void Method5929(@NotNull @NotNull final Entity entity) {
        Intrinsics.checkParameterIsNotNull((Object)entity, "entity");
        if (this.Field14918.containsKey(entity)) {
            this.Field14920 = entity;
            final ArrayList<Class2163> value = this.Field14918.get(entity);
            if (value == null) {
                Intrinsics.throwNpe();
            }
            final Iterator<Class2163> iterator = value.iterator();
            while (iterator.hasNext()) {
                final Class1673 method6462 = iterator.next().Method1481().Method6462(this);
                final Minecraft field17803 = Class2142.Field17803;
                Intrinsics.checkExpressionValueIsNotNull((Object)field17803, "mc");
                method6462.Method923(field17803.getRenderPartialTicks());
            }
        }
        else {
            this.Field14920 = null;
        }
    }
    
    public final void Method5930(@NotNull @NotNull final Entity key) {
        Intrinsics.checkParameterIsNotNull((Object)key, "entity");
        if (this.Field14920 != null) {
            final ArrayList<Class2163> value = this.Field14918.get(key);
            if (value == null) {
                Intrinsics.throwNpe();
            }
            final Iterator<Class2163> iterator = value.iterator();
            while (iterator.hasNext()) {
                iterator.next().Method1481().Method6462(this).Method924();
            }
        }
    }
    
    public final void Method5931(@NotNull @NotNull final TileEntity tileEntity) {
        Intrinsics.checkParameterIsNotNull((Object)tileEntity, "entity");
        if (this.Field14919.containsKey(tileEntity)) {
            this.Field14921 = tileEntity;
            final ArrayList<Class2163> value = this.Field14919.get(tileEntity);
            if (value == null) {
                Intrinsics.throwNpe();
            }
            final Iterator<Class2163> iterator = value.iterator();
            while (iterator.hasNext()) {
                final Class1673 method6462 = iterator.next().Method1481().Method6462(this);
                final Minecraft field17803 = Class2142.Field17803;
                Intrinsics.checkExpressionValueIsNotNull((Object)field17803, "mc");
                method6462.Method923(field17803.getRenderPartialTicks());
            }
        }
        else {
            this.Field14921 = null;
        }
    }
    
    public final void Method5932(@NotNull @NotNull final TileEntity key) {
        Intrinsics.checkParameterIsNotNull((Object)key, "entity");
        if (this.Field14921 != null) {
            final ArrayList<Class2163> value = this.Field14919.get(key);
            if (value == null) {
                Intrinsics.throwNpe();
            }
            final Iterator<Class2163> iterator = value.iterator();
            while (iterator.hasNext()) {
                iterator.next().Method1481().Method6462(this).Method924();
            }
        }
    }
    
    public final void Method5933() {
        GlStateManager.matrixMode(5889);
        GlStateManager.pushMatrix();
        GlStateManager.matrixMode(5888);
        GlStateManager.pushMatrix();
    }
    
    public final void Method5934() {
        GlStateManager.color(1.0f, 1.0f, 1.0f);
        GlStateManager.matrixMode(5889);
        GlStateManager.popMatrix();
        GlStateManager.matrixMode(5888);
        GlStateManager.popMatrix();
    }
    
    public Class1482(@NotNull @NotNull final Class42 field14922) {
        Intrinsics.checkParameterIsNotNull((Object)field14922, "module");
        this.Field14922 = field14922;
        this.Field14909 = new ArrayList();
        this.Field14910 = new ArrayList();
        this.Field14911 = new Class1996(new Class44("Optimization", this.Field14922));
        this.Field14912 = new Class411(this.Field14922);
        this.Field14913 = new Class44("Items Fix", this.Field14922, false);
        this.Field14914 = new Class1037((Function0)Class1981.Field17119);
        this.Field14916 = new HashMap();
        this.Field14917 = new HashMap();
        this.Field14918 = new HashMap();
        this.Field14919 = new HashMap();
        for (final Class1736 class1736 : Class1736.values()) {
            final Class1996 e = new Class1996(new Class44(class1736.name(), this.Field14922));
            this.Field14909.add(e);
            for (final Class250 class1737 : Class250.Method1338(class1736)) {
                final Class1996 method7406 = e.Method7406(new Class1996(new Class44(class1737.name(), this.Field14922)));
                final Class1996 method7407 = method7406.Method7406(new Class1996(new Class44("Shaders", this.Field14922)));
                this.Field14909.add(method7406);
                this.Field14909.add(method7407);
                final ArrayList field14923 = this.Field14910;
                final Class1996 class1738 = method7406;
                final Class44 method7408 = new Class44(new StringBuilder().append(class1736).append(' ').append(class1737).append(" State").toString(), this.Field14922, false).Method355("State");
                Intrinsics.checkExpressionValueIsNotNull((Object)method7408, "Setting(\n               \u2026      ).setTitle(\"State\")");
                final Class44 method7409 = class1738.Method7405(method7408);
                final Class1736 class1739 = class1736;
                final Class250 class1740 = class1737;
                Intrinsics.checkExpressionValueIsNotNull((Object)class1740, "type1");
                field14923.add(new Class403(method7409, class1739, class1740, null, Class1254.Field13685, -1));
                for (final Class2163 class1741 : Class2163.values()) {
                    final ArrayList field14924 = this.Field14910;
                    final Class1996 class1742 = method7407;
                    final Class44 method7410 = new Class44(new StringBuilder().append(class1736).append(' ').append(class1737).append(' ').append(class1741.Method1483()).append(" State").toString(), this.Field14922, false).Method355(class1741.Method1483());
                    Intrinsics.checkExpressionValueIsNotNull((Object)method7410, "Setting(\n               \u2026Title(shader.displayName)");
                    field14924.add(new Class403(class1742.Method7405(method7410), class1736, class1737, class1741, Class1254.Field13686, -1));
                    final Class1996 method7411 = method7406.Method7406(new Class1996(new Class44(class1741.Method1483(), this.Field14922)));
                    final HashMap<Integer, Object> hashMap = new HashMap<Integer, Object>();
                    for (final Class812 class1743 : class1741.Method1484()) {
                        if (class1743.Method3417() != null) {
                            Class44 class1744;
                            if (class1743.Method3413() instanceof Class1959) {
                                final String string = class1736.name() + ' ' + class1737.name() + ' ' + class1741.Method1483() + ' ' + class1743.Method3417();
                                final Class42 field14925 = this.Field14922;
                                final Object method7412 = class1743.Method3413().Method647();
                                if (method7412 == null) {
                                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                                }
                                class1744 = new Class44(string, field14925, (int)method7412, 0.0, Double.longBitsToDouble((long)1392392332 ^ 0x4024000052FE388CL), true);
                            }
                            else if (class1743.Method3413() instanceof Class277) {
                                final String string2 = class1736.name() + ' ' + class1737.name() + ' ' + class1741.Method1483() + ' ' + class1743.Method3417();
                                final Class42 field14926 = this.Field14922;
                                final Object method7413 = class1743.Method3413().Method647();
                                if (method7413 == null) {
                                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                                }
                                class1744 = new Class44(string2, field14926, (float)method7413, 0.0, Double.longBitsToDouble(4621819117588971520L), false);
                            }
                            else {
                                if (!(class1743.Method3413() instanceof Class1360)) {
                                    continue;
                                }
                                final String string3 = class1736.name() + ' ' + class1737.name() + ' ' + class1741.Method1483() + ' ' + class1743.Method3417();
                                final Class42 field14927 = this.Field14922;
                                final Object method7414 = class1743.Method3413().Method647();
                                if (method7414 == null) {
                                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
                                }
                                class1744 = new Class44(string3, field14927, (boolean)method7414);
                            }
                            class1744.Method355(class1743.Method3417());
                            method7411.Method7405(class1744);
                            final Class403 e2 = new Class403(class1744, class1736, class1737, class1741, Class1254.Field13687, class1743.Method3418());
                            this.Field14910.add(e2);
                            hashMap.put(class1743.Method3418(), e2);
                        }
                    }
                    this.Field14917.put(class1741.Method1489(), new Class1621(class1741, hashMap));
                }
            }
        }
        this.Field14914 = new Class1037((Function0)new Class647(this));
    }
    
    public static final boolean Method5935(final Class1482 class1482, final Class1736 class1483) {
        return class1482.Method5926(class1483);
    }
    
    private static String Method5936(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x231F ^ 0x1A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
