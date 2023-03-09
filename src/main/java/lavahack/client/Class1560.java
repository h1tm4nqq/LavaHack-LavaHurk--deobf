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

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\b\u0010\u0017\u001a\u00020\u0003H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n\u00a8\u0006\u0018"}, d2={"Lcom/kisman/cc/features/catlua/mapping/MappingsGenerator$ClassMapping;", "", "deobf", "", "clientObf", "serverObf", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClientObf", "()Ljava/lang/String;", "setClientObf", "(Ljava/lang/String;)V", "getDeobf", "getServerObf", "setServerObf", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "kisman.cc"})
final class Class1560 {
    @NotNull
    private final String Field15275;
    @Nullable
    private String Field15276;
    @Nullable
    private String Field15277;
    private String Field15278 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public String toString() {
        return this.Field15275 + " (client: " + this.Field15276 + ") (server: " + this.Field15277 + ')';
    }

    @NotNull
    @NotNull
    public final String Method6143() {
        return this.Field15275;
    }

    @Nullable
    @Nullable
    public final String Method6144() {
        return this.Field15276;
    }

    public final void Method6145(@Nullable @Nullable String string) {
        this.Field15276 = string;
    }

    @Nullable
    @Nullable
    public final String Method6146() {
        return this.Field15277;
    }

    public final void Method6147(@Nullable @Nullable String string) {
        this.Field15277 = string;
    }

    public Class1560(@NotNull @NotNull String string, @Nullable @Nullable String string2, @Nullable @Nullable String string3) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"deobf");
        this.Field15275 = string;
        this.Field15276 = string2;
        this.Field15277 = string3;
    }

    public Class1560(String string, String string2, String string3, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 2) != 0) {
            string2 = null;
        }
        if ((n & 4) != 0) {
            string3 = null;
        }
        this(string, string2, string3);
    }

    @NotNull
    @NotNull
    public final String Method6148() {
        return this.Field15275;
    }

    @Nullable
    @Nullable
    public final String Method6149() {
        return this.Field15276;
    }

    @Nullable
    @Nullable
    public final String Method6150() {
        return this.Field15277;
    }

    @NotNull
    @NotNull
    public final Class1560 Method6151(@NotNull @NotNull String string, @Nullable @Nullable String string2, @Nullable @Nullable String string3) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"deobf");
        return new Class1560(string, string2, string3);
    }

    @NotNull
    @NotNull
    public static Class1560 Method6152(Class1560 class1560, String string, String string2, String string3, int n, Object object) {
        if ((n & 1) != 0) {
            string = class1560.Field15275;
        }
        if ((n & 2) != 0) {
            string2 = class1560.Field15276;
        }
        if ((n & 4) == 0) return class1560.Method6151(string, string2, string3);
        string3 = class1560.Field15277;
        return class1560.Method6151(string, string2, string3);
    }

    public int hashCode() {
        int n;
        String string = this.Field15275;
        String string2 = this.Field15276;
        int n2 = ((string != null ? string.hashCode() : 0) * 31 + (string2 != null ? string2.hashCode() : 0)) * 31;
        String string3 = this.Field15277;
        if (string3 != null) {
            n = string3.hashCode();
            return n2 + n;
        }
        n = 0;
        return n2 + n;
    }

    public boolean equals(@Nullable @Nullable Object object) {
        if (this == object) return true;
        if (!(object instanceof Class1560)) return false;
        Class1560 class1560 = (Class1560)object;
        if (!Intrinsics.areEqual((Object)this.Field15275, (Object)class1560.Field15275)) return false;
        if (!Intrinsics.areEqual((Object)this.Field15276, (Object)class1560.Field15276)) return false;
        if (!Intrinsics.areEqual((Object)this.Field15277, (Object)class1560.Field15277)) return false;
        return true;
    }

    private static String Method6153(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 158;
            cArray2[n] = (char)(cArray[n] ^ (0x3F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

