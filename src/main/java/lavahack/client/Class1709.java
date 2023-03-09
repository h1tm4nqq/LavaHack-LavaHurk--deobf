/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\b\u0010\u0014\u001a\u00020\u0003H\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t\u00a8\u0006\u0015"}, d2={"Lcom/kisman/cc/features/catlua/mapping/TSrgUtil$Field;", "", "obf", "", "deobf", "(Ljava/lang/String;Ljava/lang/String;)V", "getDeobf", "()Ljava/lang/String;", "setDeobf", "(Ljava/lang/String;)V", "getObf", "setObf", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kisman.cc"})
public final class Class1709 {
    @NotNull
    private String Field15898;
    @NotNull
    private String Field15899;
    private String Field15900 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public String toString() {
        return this.Field15898 + ' ' + this.Field15899;
    }

    @NotNull
    @NotNull
    public final String Method6541() {
        return this.Field15898;
    }

    public final void Method6542(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"<set-?>");
        this.Field15898 = string;
    }

    @NotNull
    @NotNull
    public final String Method6543() {
        return this.Field15899;
    }

    public final void Method6544(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"<set-?>");
        this.Field15899 = string;
    }

    public Class1709(@NotNull @NotNull String string, @NotNull @NotNull String string2) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"obf");
        Intrinsics.checkParameterIsNotNull((Object)string2, (String)"deobf");
        this.Field15898 = string;
        this.Field15899 = string2;
    }

    @NotNull
    @NotNull
    public final String Method6545() {
        return this.Field15898;
    }

    @NotNull
    @NotNull
    public final String Method6546() {
        return this.Field15899;
    }

    @NotNull
    @NotNull
    public final Class1709 Method6547(@NotNull @NotNull String string, @NotNull @NotNull String string2) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"obf");
        Intrinsics.checkParameterIsNotNull((Object)string2, (String)"deobf");
        return new Class1709(string, string2);
    }

    @NotNull
    @NotNull
    public static Class1709 Method6548(Class1709 class1709, String string, String string2, int n, Object object) {
        if ((n & 1) != 0) {
            string = class1709.Field15898;
        }
        if ((n & 2) == 0) return class1709.Method6547(string, string2);
        string2 = class1709.Field15899;
        return class1709.Method6547(string, string2);
    }

    public int hashCode() {
        int n;
        String string = this.Field15898;
        int n2 = (string != null ? string.hashCode() : 0) * 31;
        String string2 = this.Field15899;
        if (string2 != null) {
            n = string2.hashCode();
            return n2 + n;
        }
        n = 0;
        return n2 + n;
    }

    public boolean equals(@Nullable @Nullable Object object) {
        if (this == object) return true;
        if (!(object instanceof Class1709)) return false;
        Class1709 class1709 = (Class1709)object;
        if (!Intrinsics.areEqual((Object)this.Field15898, (Object)class1709.Field15898)) return false;
        if (!Intrinsics.areEqual((Object)this.Field15899, (Object)class1709.Field15899)) return false;
        return true;
    }

    private static String Method6549(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 164;
            cArray2[n] = (char)(cArray[n] ^ (0x546D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

