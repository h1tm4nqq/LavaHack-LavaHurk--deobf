/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1303;
import lavahack.client.Class1889;
import lavahack.client.Class1996;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class941;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0015\u0010\n\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00a2\u0006\u0002\u0010!J\r\u0010\"\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010#J\r\u0010$\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010#J\u0015\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0016\u00a2\u0006\u0002\u0010%J\"\u0010&\u001a\b\u0012\u0004\u0012\u0002H\u00010'\"\u0004\b\u0001\u0010\u00012\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u00010'H\u0004J*\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u00010*\"\f\b\u0001\u0010\u0001*\u0006\u0012\u0002\b\u00030+2\f\u0010,\u001a\b\u0012\u0004\u0012\u0002H\u00010*H\u0004J\u0010\u0010-\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0004J\u0010\u0010.\u001a\u00020\b2\u0006\u0010,\u001a\u00020\bH\u0004J\u001b\u0010\u001a\u001a\u00028\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016\u00a2\u0006\u0002\u0010/R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0007j\b\u0012\u0004\u0012\u00020\u000b`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u00060"}, d2={"Lcom/kisman/cc/settings/util/AbstractPattern;", "T", "", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/features/module/Module;)V", "allSettings", "Ljava/util/ArrayList;", "Lcom/kisman/cc/settings/Setting;", "Lkotlin/collections/ArrayList;", "group", "Lcom/kisman/cc/settings/types/SettingGroup;", "getGroup", "()Lcom/kisman/cc/settings/types/SettingGroup;", "setGroup", "(Lcom/kisman/cc/settings/types/SettingGroup;)V", "groups", "getModule", "()Lcom/kisman/cc/features/module/Module;", "prefix", "", "getPrefix", "()Ljava/lang/String;", "setPrefix", "(Ljava/lang/String;)V", "settings", "visible", "Ljava/util/function/Supplier;", "", "getVisible", "()Ljava/util/function/Supplier;", "setVisible", "(Ljava/util/function/Supplier;)V", "(Lcom/kisman/cc/settings/types/SettingGroup;)Ljava/lang/Object;", "init", "()Ljava/lang/Object;", "preInit", "(Ljava/lang/String;)Ljava/lang/Object;", "setupArray", "Lcom/kisman/cc/settings/types/SettingArray;", "array", "setupEnum", "Lcom/kisman/cc/settings/types/SettingEnum;", "", "setting", "setupGroup", "setupSetting", "(Ljava/util/function/Supplier;)Ljava/lang/Object;", "kisman.cc"})
public abstract class Class91 {
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

    public final void Method766(@NotNull @NotNull Supplier supplier) {
        Intrinsics.checkParameterIsNotNull((Object)supplier, (String)"<set-?>");
        this.Field8304 = supplier;
    }

    @Nullable
    @Nullable
    public final String Method767() {
        return this.Field8305;
    }

    public final void Method768(@Nullable @Nullable String string) {
        this.Field8305 = string;
    }

    @Nullable
    @Nullable
    public final Class1996 Method769() {
        return this.Field8306;
    }

    public final void Method770(@Nullable @Nullable Class1996 class1996) {
        this.Field8306 = class1996;
    }

    public Object Method771(@NotNull @NotNull Supplier supplier) {
        Intrinsics.checkParameterIsNotNull((Object)supplier, (String)"visible");
        this.Field8304 = supplier;
        Iterator iterator = this.Field8308.iterator();
        while (iterator.hasNext()) {
            Class44 class44 = (Class44)iterator.next();
            class44.Method313(supplier);
        }
        return this;
    }

    public Object Method772(@NotNull @NotNull Class1996 class1996) {
        Intrinsics.checkParameterIsNotNull((Object)class1996, (String)"group");
        this.Field8306 = class1996;
        return this;
    }

    public Object Method773(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"prefix");
        this.Field8305 = string;
        Iterator iterator = this.Field8308.iterator();
        while (iterator.hasNext()) {
            Class44 class44;
            Class44 class442 = class44 = (Class44)iterator.next();
            Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"setting");
            class442.Method357(string + ' ' + class44.Method356());
        }
        return this;
    }

    @NotNull
    @NotNull
    protected final Class1303 Method774(@NotNull @NotNull Class1303 class1303) {
        Intrinsics.checkParameterIsNotNull((Object)class1303, (String)"setting");
        Class44 class44 = this.Method775(class1303);
        if (class44 != null) return (Class1303)class44;
        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.types.SettingEnum<T>");
    }

    @NotNull
    @NotNull
    protected final Class44 Method775(@NotNull @NotNull Class44 class44) {
        Intrinsics.checkParameterIsNotNull((Object)class44, (String)"setting");
        Class44 class442 = class44;
        boolean bl = false;
        boolean bl2 = false;
        Class44 class443 = class442;
        boolean bl3 = false;
        this.Field8308.add(class443);
        this.Field8307.add(class443);
        return class442;
    }

    @NotNull
    @NotNull
    protected final Class1996 Method776(@NotNull @NotNull Class1996 class1996) {
        Intrinsics.checkParameterIsNotNull((Object)class1996, (String)"group");
        Class44 class44 = class1996.Method313(this.Field8304);
        if (class44 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.types.SettingGroup");
        }
        Class1996 class19962 = (Class1996)class44;
        boolean bl = false;
        boolean bl2 = false;
        Class1996 class19963 = class19962;
        boolean bl3 = false;
        this.Field8309.add(class19963);
        this.Field8307.add(class19963);
        return class19962;
    }

    @NotNull
    @NotNull
    protected final Class941 Method777(@NotNull @NotNull Class941 class941) {
        Intrinsics.checkParameterIsNotNull((Object)class941, (String)"array");
        Class44 class44 = this.Method775(class941);
        if (class44 != null) return (Class941)class44;
        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.types.SettingArray<T>");
    }

    public abstract Object Method778();

    public abstract Object Method779();

    @NotNull
    @NotNull
    public final Class42 Method780() {
        return this.Field8310;
    }

    public Class91(@NotNull @NotNull Class42 class42) {
        Intrinsics.checkParameterIsNotNull((Object)class42, (String)"module");
        this.Field8310 = class42;
        this.Field8304 = Class1889.Field16704;
        this.Field8307 = new ArrayList();
        this.Field8308 = new ArrayList();
        this.Field8309 = new ArrayList();
    }

    private static String Method781(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 137;
            cArray2[n] = (char)(cArray[n] ^ (0x9EE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

