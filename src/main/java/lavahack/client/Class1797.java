/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\b\u0010\u001a\u001a\u00020\u0003H\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b\u00a8\u0006\u001b"}, d2={"Lcom/kisman/cc/features/catlua/mapping/MappingsGenerator$FieldMapping;", "", "deobfField", "", "deobfClass", "clientObfTotal", "serverObfTotal", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClientObfTotal", "()Ljava/lang/String;", "setClientObfTotal", "(Ljava/lang/String;)V", "getDeobfClass", "getDeobfField", "getServerObfTotal", "setServerObfTotal", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "kisman.cc"})
final class Class1797 {
    @NotNull
    private final String Field16289;
    @NotNull
    private final String Field16290;
    @Nullable
    private String Field16291;
    @Nullable
    private String Field16292;
    private int Field16293;

    @NotNull
    @NotNull
    public String toString() {
        return this.Field16290 + '.' + this.Field16289 + " (client: " + this.Field16291 + ") (server: " + this.Field16292 + ')';
    }

    @NotNull
    @NotNull
    public final String Method6796() {
        return this.Field16289;
    }

    @NotNull
    @NotNull
    public final String Method6797() {
        return this.Field16290;
    }

    @Nullable
    @Nullable
    public final String Method6798() {
        return this.Field16291;
    }

    public final void Method6799(@Nullable @Nullable String string) {
        this.Field16291 = string;
    }

    @Nullable
    @Nullable
    public final String Method6800() {
        return this.Field16292;
    }

    public final void Method6801(@Nullable @Nullable String string) {
        this.Field16292 = string;
    }

    public Class1797(@NotNull @NotNull String string, @NotNull @NotNull String string2, @Nullable @Nullable String string3, @Nullable @Nullable String string4) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"deobfField");
        Intrinsics.checkParameterIsNotNull((Object)string2, (String)"deobfClass");
        this.Field16289 = string;
        this.Field16290 = string2;
        this.Field16291 = string3;
        this.Field16292 = string4;
    }

    public Class1797(String string, String string2, String string3, String string4, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 4) != 0) {
            string3 = null;
        }
        if ((n & 8) != 0) {
            string4 = null;
        }
        this(string, string2, string3, string4);
    }

    @NotNull
    @NotNull
    public final String Method6802() {
        return this.Field16289;
    }

    @NotNull
    @NotNull
    public final String Method6803() {
        return this.Field16290;
    }

    @Nullable
    @Nullable
    public final String Method6804() {
        return this.Field16291;
    }

    @Nullable
    @Nullable
    public final String Method6805() {
        return this.Field16292;
    }

    @NotNull
    @NotNull
    public final Class1797 Method6806(@NotNull @NotNull String string, @NotNull @NotNull String string2, @Nullable @Nullable String string3, @Nullable @Nullable String string4) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"deobfField");
        Intrinsics.checkParameterIsNotNull((Object)string2, (String)"deobfClass");
        return new Class1797(string, string2, string3, string4);
    }

    @NotNull
    @NotNull
    public static Class1797 Method6807(Class1797 class1797, String string, String string2, String string3, String string4, int n, Object object) {
        if ((n & 1) != 0) {
            string = class1797.Field16289;
        }
        if ((n & 2) != 0) {
            string2 = class1797.Field16290;
        }
        if ((n & 4) != 0) {
            string3 = class1797.Field16291;
        }
        if ((n & 8) == 0) return class1797.Method6806(string, string2, string3, string4);
        string4 = class1797.Field16292;
        return class1797.Method6806(string, string2, string3, string4);
    }

    public int hashCode() {
        int n;
        String string = this.Field16289;
        String string2 = this.Field16290;
        String string3 = this.Field16291;
        int n2 = (((string != null ? string.hashCode() : 0) * 31 + (string2 != null ? string2.hashCode() : 0)) * 31 + (string3 != null ? string3.hashCode() : 0)) * 31;
        String string4 = this.Field16292;
        if (string4 != null) {
            n = string4.hashCode();
            return n2 + n;
        }
        n = 0;
        return n2 + n;
    }

    public boolean equals(@Nullable @Nullable Object object) {
        if (this == object) return true;
        if (!(object instanceof Class1797)) return false;
        Class1797 class1797 = (Class1797)object;
        if (!Intrinsics.areEqual((Object)this.Field16289, (Object)class1797.Field16289)) return false;
        if (!Intrinsics.areEqual((Object)this.Field16290, (Object)class1797.Field16290)) return false;
        if (!Intrinsics.areEqual((Object)this.Field16291, (Object)class1797.Field16291)) return false;
        if (!Intrinsics.areEqual((Object)this.Field16292, (Object)class1797.Field16292)) return false;
        return true;
    }

    private static String Method6808(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 134;
            cArray2[n] = (char)(cArray[n] ^ (0x6BBB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

