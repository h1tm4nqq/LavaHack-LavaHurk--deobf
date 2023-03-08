//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.*;
import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004?\u0006\u0002\u0010\u0005J\u0015\u0010\n\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016?\u0006\u0002\u0010!J\r\u0010\"\u001a\u00028\u0000H&?\u0006\u0002\u0010#J\r\u0010$\u001a\u00028\u0000H&?\u0006\u0002\u0010#J\u0015\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0016?\u0006\u0002\u0010%J\"\u0010&\u001a\b\u0012\u0004\u0012\u0002H\u00010'\"\u0004\b\u0001\u0010\u00012\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u00010'H\u0004J*\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u00010*\"\f\b\u0001\u0010\u0001*\u0006\u0012\u0002\b\u00030+2\f\u0010,\u001a\b\u0012\u0004\u0012\u0002H\u00010*H\u0004J\u0010\u0010-\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0004J\u0010\u0010.\u001a\u00020\b2\u0006\u0010,\u001a\u00020\bH\u0004J\u001b\u0010\u001a\u001a\u00028\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016?\u0006\u0002\u0010/R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004?\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0007j\b\u0012\u0004\u0012\u00020\u000b`\tX\u0082\u0004?\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004?\u0006\u0002\n\u0000R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ?\u00060" }, d2 = { "Lcom/kisman/cc/settings/util/AbstractPattern;", "T", "", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/features/module/Module;)V", "allSettings", "Ljava/util/ArrayList;", "Lcom/kisman/cc/settings/Setting;", "Lkotlin/collections/ArrayList;", "group", "Lcom/kisman/cc/settings/types/SettingGroup;", "getGroup", "()Lcom/kisman/cc/settings/types/SettingGroup;", "setGroup", "(Lcom/kisman/cc/settings/types/SettingGroup;)V", "groups", "getModule", "()Lcom/kisman/cc/features/module/Module;", "prefix", "", "getPrefix", "()Ljava/lang/String;", "setPrefix", "(Ljava/lang/String;)V", "settings", "visible", "Ljava/util/function/Supplier;", "", "getVisible", "()Ljava/util/function/Supplier;", "setVisible", "(Ljava/util/function/Supplier;)V", "(Lcom/kisman/cc/settings/types/SettingGroup;)Ljava/lang/Object;", "init", "()Ljava/lang/Object;", "preInit", "(Ljava/lang/String;)Ljava/lang/Object;", "setupArray", "Lcom/kisman/cc/settings/types/SettingArray;", "array", "setupEnum", "Lcom/kisman/cc/settings/types/SettingEnum;", "", "setting", "setupGroup", "setupSetting", "(Ljava/util/function/Supplier;)Ljava/lang/Object;", "kisman.cc" })
public abstract class Class91
{
    @NotNull
    private Supplier Field8304;
    @Nullable
    private String Field8305;
    @Nullable
    private Class1996 Field8306;
    private final ArrayList Field8307;
    private final ArrayList Field8308;
    private final ArrayList Field8309;
    @NotNull
    private final Class42 Field8310;
    private String Field8311 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final Supplier Method765() {
        return this.Field8304;
    }
    
    public final void Method766(@NotNull @NotNull final Supplier field8304) {
        Intrinsics.checkParameterIsNotNull((Object)field8304, "<set-?>");
        this.Field8304 = field8304;
    }
    
    @Nullable
    @Nullable
    public final String Method767() {
        return this.Field8305;
    }
    
    public final void Method768(@Nullable @Nullable final String field8305) {
        this.Field8305 = field8305;
    }
    
    @Nullable
    @Nullable
    public final Class1996 Method769() {
        return this.Field8306;
    }
    
    public final void Method770(@Nullable @Nullable final Class1996 field8306) {
        this.Field8306 = field8306;
    }
    
    public Object Method771(@NotNull @NotNull final Supplier field8304) {
        Intrinsics.checkParameterIsNotNull((Object)field8304, "visible");
        this.Field8304 = field8304;
        final Iterator<Class44> iterator = this.Field8308.iterator();
        while (iterator.hasNext()) {
            iterator.next().Method313(field8304);
        }
        return this;
    }
    
    public Object Method772(@NotNull @NotNull final Class1996 field8306) {
        Intrinsics.checkParameterIsNotNull((Object)field8306, "group");
        this.Field8306 = field8306;
        return this;
    }
    
    public Object Method773(@NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "prefix");
        this.Field8305 = s;
        for (final Class44 class45 : this.Field8308) {
            final Class44 class44 = class45;
            Intrinsics.checkExpressionValueIsNotNull((Object)class45, "setting");
            class45.Method357(s + ' ' + class44.Method356());
        }
        return this;
    }
    
    @NotNull
    @NotNull
    protected final Class1303 Method774(@NotNull @NotNull final Class1303 class1303) {
        Intrinsics.checkParameterIsNotNull((Object)class1303, "setting");
        final Class44 method775 = this.Method775((Class44)class1303);
        if (method775 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.types.SettingEnum<T>");
        }
        return (Class1303)method775;
    }
    
    @NotNull
    @NotNull
    protected final Class44 Method775(@NotNull @NotNull final Class44 class44) {
        Intrinsics.checkParameterIsNotNull((Object)class44, "setting");
        this.Field8308.add(class44);
        this.Field8307.add(class44);
        return class44;
    }
    
    @NotNull
    @NotNull
    protected final Class1996 Method776(@NotNull @NotNull final Class1996 class1996) {
        Intrinsics.checkParameterIsNotNull((Object)class1996, "group");
        final Class44 method313 = class1996.Method313(this.Field8304);
        if (method313 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.types.SettingGroup");
        }
        final Class1996 class1998;
        final Class1996 class1997 = class1998 = (Class1996)method313;
        this.Field8309.add(class1998);
        this.Field8307.add(class1998);
        return class1997;
    }
    
    @NotNull
    @NotNull
    protected final Class941 Method777(@NotNull @NotNull final Class941 class941) {
        Intrinsics.checkParameterIsNotNull((Object)class941, "array");
        final Class44 method775 = this.Method775(class941);
        if (method775 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.types.SettingArray<T>");
        }
        return (Class941)method775;
    }
    
    public abstract Object Method778();
    
    public abstract Object Method779();
    
    @NotNull
    @NotNull
    public final Class42 Method780() {
        return this.Field8310;
    }
    
    public Class91(@NotNull @NotNull final Class42 field8310) {
        Intrinsics.checkParameterIsNotNull((Object)field8310, "module");
        this.Field8310 = field8310;
        this.Field8304 = (Supplier)Class1889.Field16704;
        this.Field8307 = new ArrayList();
        this.Field8308 = new ArrayList();
        this.Field8309 = new ArrayList();
    }
    
    private static String Method781(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x9EE ^ 0x89));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
