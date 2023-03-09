/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class728;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\u0018\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0010j\b\u0012\u0004\u0012\u00020\u0004`\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016H\u0016\u00a2\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0019H\u0016J\u000b\u0010\u001a\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0004H\u0016J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001f\u001a\u00020\u0004H\u0016J\u0019\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010!\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\"J\u0010\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0004H\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010&\u001a\u00020\u0002H\u0016J\u0016\u0010%\u001a\u00020\u00022\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\u0019H\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00028\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000b\u00a8\u0006("}, d2={"Lcom/kisman/cc/settings/types/SettingArray;", "T", "Lcom/kisman/cc/settings/Setting;", "name", "", "module", "Lcom/kisman/cc/features/module/Module;", "value", "list", "", "(Ljava/lang/String;Lcom/kisman/cc/features/module/Module;Ljava/lang/Object;Ljava/util/List;)V", "Ljava/lang/Object;", "checkValString", "", "str", "getOptions", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getStringFromIndex", "index", "", "getStringValues", "", "()[Ljava/lang/String;", "getSupplierString", "Ljava/util/function/Supplier;", "getValElement", "()Ljava/lang/Object;", "getValString", "register", "setTitle", "title", "setValElement", "t", "(Ljava/lang/Object;)Lcom/kisman/cc/settings/types/SettingArray;", "setValString", "in", "setVisible", "setting", "suppliner", "kisman.cc"})
public final class Class941
extends Class44 {
    private Object Field12015;
    private final List Field12016;
    private String Field12017 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final Object Method3886() {
        return this.Field12015;
    }

    @NotNull
    @NotNull
    public final Class941 Method3887(Object object) {
        this.Field12015 = object;
        return this;
    }

    @Override
    @NotNull
    @NotNull
    public String Method359() {
        return String.valueOf(this.Field12015);
    }

    @Override
    @NotNull
    @NotNull
    public Class44 Method360(@NotNull @NotNull String string) {
        Object e;
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"in");
        Iterator iterator = this.Field12016.iterator();
        do {
            if (!iterator.hasNext()) return this;
        } while (!Intrinsics.areEqual((Object)string, (Object)String.valueOf(e = iterator.next())));
        this.Field12015 = e;
        return this;
    }

    @Override
    public boolean Method309(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"str");
        return StringsKt.equals((String)String.valueOf(this.Field12015), (String)string, (boolean)true);
    }

    @Override
    @NotNull
    @NotNull
    public String[] Method315() {
        Collection collection = this.Method361();
        boolean bl = false;
        Collection collection2 = collection;
        String[] stringArray = collection2.toArray(new String[0]);
        if (stringArray != null) return stringArray;
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Override
    @NotNull
    @NotNull
    public ArrayList Method361() {
        ArrayList arrayList = new ArrayList();
        Iterator iterator = this.Field12016.iterator();
        while (iterator.hasNext()) {
            Object e = iterator.next();
            Collection collection = arrayList;
            String string = String.valueOf(e);
            boolean bl = false;
            collection.add(string);
        }
        return arrayList;
    }

    @Override
    @NotNull
    @NotNull
    public String Method317(int n) {
        return this.Method315()[n];
    }

    @Override
    @NotNull
    @NotNull
    public Supplier Method391() {
        return new Class728(this);
    }

    @NotNull
    @NotNull
    public Class941 Method3888(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"title");
        Class44 class44 = super.Method355(string);
        if (class44 != null) return (Class941)class44;
        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.types.SettingArray<T>");
    }

    @Override
    public Class44 Method355(String string) {
        return this.Method3888(string);
    }

    @NotNull
    @NotNull
    public Class941 Method3889(@NotNull @NotNull Class44 class44) {
        Intrinsics.checkParameterIsNotNull((Object)class44, (String)"setting");
        Class44 class442 = super.Method312(class44);
        if (class442 != null) return (Class941)class442;
        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.types.SettingArray<T>");
    }

    @Override
    public Class44 Method312(Class44 class44) {
        return this.Method3889(class44);
    }

    @Override
    @NotNull
    @NotNull
    public Class44 Method313(@NotNull @NotNull Supplier supplier) {
        Intrinsics.checkParameterIsNotNull((Object)supplier, (String)"suppliner");
        Class44 class44 = super.Method313(supplier);
        if (class44 != null) return (Class941)class44;
        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.types.SettingArray<T>");
    }

    @NotNull
    @NotNull
    public final Class941 Method3890() {
        Class941 class941 = this;
        boolean bl = false;
        boolean bl2 = false;
        Class941 class9412 = class941;
        boolean bl3 = false;
        this.Method358().Method26(class9412);
        return class941;
    }

    public Class941(@NotNull @NotNull String string, @NotNull @NotNull Class42 class42, Object object, @NotNull @NotNull List list) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"name");
        Intrinsics.checkParameterIsNotNull((Object)class42, (String)"module");
        Intrinsics.checkParameterIsNotNull((Object)list, (String)"list");
        super(string, class42);
        this.Field12015 = object;
        this.Field12016 = list;
        this.x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk = "Combo";
        this.Method304(this.Method361());
    }

    private static String Method409(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 18;
            cArray2[n] = (char)(cArray[n] ^ (0x2CE4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

