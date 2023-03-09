/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1996;
import lavahack.client.Class2013;
import lavahack.client.Class42;
import lavahack.client.Class44;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\tJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bJ\r\u0010\f\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bH\u0016\u00a8\u0006\u0016"}, d2={"Lcom/kisman/cc/settings/types/SettingEnum;", "T", "", "Lcom/kisman/cc/settings/Setting;", "name", "", "module", "Lcom/kisman/cc/features/module/Module;", "t", "(Ljava/lang/String;Lcom/kisman/cc/features/module/Module;Ljava/lang/Enum;)V", "getSupplierEnum0", "Ljava/util/function/Supplier;", "getValEnum", "()Ljava/lang/Enum;", "group", "Lcom/kisman/cc/settings/types/SettingGroup;", "register", "setTitle", "title", "setVisible", "visible", "", "kisman.cc"})
public final class Class1303
extends Class44 {
    private String Field13965 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    @NotNull
    @NotNull
    public Enum Method341() {
        Enum enum_ = super.Method341();
        if (enum_ != null) return enum_;
        throw new TypeCastException("null cannot be cast to non-null type T");
    }

    @NotNull
    @NotNull
    public Class1303 Method5300(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"title");
        Class44 class44 = super.Method355(string);
        if (class44 != null) return (Class1303)class44;
        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.types.SettingEnum<T>");
    }

    @Override
    public Class44 Method355(String string) {
        return this.Method5300(string);
    }

    @NotNull
    @NotNull
    public Class1303 Method5301(@NotNull @NotNull Supplier supplier) {
        Intrinsics.checkParameterIsNotNull((Object)supplier, (String)"visible");
        Class44 class44 = super.Method313(supplier);
        if (class44 != null) return (Class1303)class44;
        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.types.SettingEnum<T>");
    }

    @Override
    public Class44 Method313(Supplier supplier) {
        return this.Method5301(supplier);
    }

    @NotNull
    @NotNull
    public final Supplier Method5302() {
        return new Class2013(this);
    }

    @NotNull
    @NotNull
    public final Class1303 Method5303() {
        Class1303 class1303 = this.Field8085.Method25(this);
        if (class1303 != null) return class1303;
        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.types.SettingEnum<T>");
    }

    @NotNull
    @NotNull
    public final Class1303 Method5304(@NotNull @NotNull Class1996 class1996) {
        Intrinsics.checkParameterIsNotNull((Object)class1996, (String)"group");
        Class1303 class1303 = class1996.Method7407(this);
        if (class1303 != null) return class1303;
        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.types.SettingEnum<T>");
    }

    public Class1303(@NotNull @NotNull String string, @NotNull @NotNull Class42 class42, @NotNull @NotNull Enum enum_) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"name");
        Intrinsics.checkParameterIsNotNull((Object)class42, (String)"module");
        Intrinsics.checkParameterIsNotNull((Object)enum_, (String)"t");
        super(string, class42, enum_);
    }

    private static String Method409(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 60;
            cArray2[n] = (char)(cArray[n] ^ (0x6E28 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

