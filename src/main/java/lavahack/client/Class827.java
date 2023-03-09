/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u001a\u0010\u0016\u001a\u00020\u00032\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0018J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\b\u0010\u001b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n\u00a8\u0006\u001c"}, d2={"Lcom/kisman/cc/features/catlua/mapping/TSrgUtil$Method;", "", "obf", "", "obfSig", "deobf", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeobf", "()Ljava/lang/String;", "setDeobf", "(Ljava/lang/String;)V", "getObf", "setObf", "getObfSig", "setObfSig", "component1", "component2", "component3", "copy", "equals", "", "other", "getDeobfSig", "classNames", "", "hashCode", "", "toString", "kisman.cc"})
public final class Class827 {
    @NotNull
    private String Field11522;
    @NotNull
    private String Field11523;
    @NotNull
    private String Field11524;
    private String Field11525 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public String toString() {
        return this.Field11522 + ' ' + this.Field11523 + ' ' + this.Field11524;
    }

    @NotNull
    @NotNull
    public final String Method3537(@NotNull @NotNull Map map) {
        boolean bl;
        Intrinsics.checkParameterIsNotNull((Object)map, (String)"classNames");
        boolean bl2 = false;
        List list = new ArrayList();
        String string = "";
        boolean bl3 = false;
        CharSequence charSequence = this.Field11523;
        boolean bl4 = false;
        CharSequence charSequence2 = charSequence;
        block4: for (int i = 0; i < charSequence2.length(); ++i) {
            char c;
            char c2 = c = charSequence2.charAt(i);
            bl = false;
            switch (c2) {
                case 'L': {
                    string = "";
                    bl3 = true;
                    continue block4;
                }
                case ';': {
                    list.add(string);
                    bl3 = false;
                    continue block4;
                }
                default: {
                    continue block4;
                }
            }
        }
        charSequence = this.Field11523;
        Iterable iterable = list;
        boolean bl5 = false;
        Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            Object t = iterator.next();
            String string2 = (String)t;
            bl = false;
            if (!map.containsKey(string2)) continue;
            String string3 = 'L' + string2 + ';';
            StringBuilder stringBuilder = new StringBuilder().append('L');
            Object v = map.get(string2);
            if (v == null) {
                Intrinsics.throwNpe();
            }
            charSequence = StringsKt.replace$default((String)charSequence, (String)string3, (String)stringBuilder.append((String)v).append(';').toString(), (boolean)false, (int)4, null);
        }
        return charSequence;
    }

    @NotNull
    @NotNull
    public final String Method3538() {
        return this.Field11522;
    }

    public final void Method3539(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"<set-?>");
        this.Field11522 = string;
    }

    @NotNull
    @NotNull
    public final String Method3540() {
        return this.Field11523;
    }

    public final void Method3541(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"<set-?>");
        this.Field11523 = string;
    }

    @NotNull
    @NotNull
    public final String Method3542() {
        return this.Field11524;
    }

    public final void Method3543(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"<set-?>");
        this.Field11524 = string;
    }

    public Class827(@NotNull @NotNull String string, @NotNull @NotNull String string2, @NotNull @NotNull String string3) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"obf");
        Intrinsics.checkParameterIsNotNull((Object)string2, (String)"obfSig");
        Intrinsics.checkParameterIsNotNull((Object)string3, (String)"deobf");
        this.Field11522 = string;
        this.Field11523 = string2;
        this.Field11524 = string3;
    }

    @NotNull
    @NotNull
    public final String Method3544() {
        return this.Field11522;
    }

    @NotNull
    @NotNull
    public final String Method3545() {
        return this.Field11523;
    }

    @NotNull
    @NotNull
    public final String Method3546() {
        return this.Field11524;
    }

    @NotNull
    @NotNull
    public final Class827 Method3547(@NotNull @NotNull String string, @NotNull @NotNull String string2, @NotNull @NotNull String string3) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"obf");
        Intrinsics.checkParameterIsNotNull((Object)string2, (String)"obfSig");
        Intrinsics.checkParameterIsNotNull((Object)string3, (String)"deobf");
        return new Class827(string, string2, string3);
    }

    @NotNull
    @NotNull
    public static Class827 Method3548(Class827 class827, String string, String string2, String string3, int n, Object object) {
        if ((n & 1) != 0) {
            string = class827.Field11522;
        }
        if ((n & 2) != 0) {
            string2 = class827.Field11523;
        }
        if ((n & 4) == 0) return class827.Method3547(string, string2, string3);
        string3 = class827.Field11524;
        return class827.Method3547(string, string2, string3);
    }

    public int hashCode() {
        int n;
        String string = this.Field11522;
        String string2 = this.Field11523;
        int n2 = ((string != null ? string.hashCode() : 0) * 31 + (string2 != null ? string2.hashCode() : 0)) * 31;
        String string3 = this.Field11524;
        if (string3 != null) {
            n = string3.hashCode();
            return n2 + n;
        }
        n = 0;
        return n2 + n;
    }

    public boolean equals(@Nullable @Nullable Object object) {
        if (this == object) return true;
        if (!(object instanceof Class827)) return false;
        Class827 class827 = (Class827)object;
        if (!Intrinsics.areEqual((Object)this.Field11522, (Object)class827.Field11522)) return false;
        if (!Intrinsics.areEqual((Object)this.Field11523, (Object)class827.Field11523)) return false;
        if (!Intrinsics.areEqual((Object)this.Field11524, (Object)class827.Field11524)) return false;
        return true;
    }

    private static String Method3549(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 156;
            cArray2[n] = (char)(cArray[n] ^ (0x2D1B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

