/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u00c6\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\b\u0010\u001e\u001a\u00020\u0003H\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000e\u00a8\u0006\u001f"}, d2={"Lcom/kisman/cc/features/catlua/mapping/TSrgUtil$Clazz;", "", "obf", "", "deobf", "fields", "", "Lcom/kisman/cc/features/catlua/mapping/TSrgUtil$Field;", "methods", "Lcom/kisman/cc/features/catlua/mapping/TSrgUtil$Method;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getDeobf", "()Ljava/lang/String;", "setDeobf", "(Ljava/lang/String;)V", "getFields", "()Ljava/util/List;", "getMethods", "getObf", "setObf", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "kisman.cc"})
public final class Class1364 {
    @NotNull
    private String Field14204;
    @NotNull
    private String Field14205;
    @NotNull
    private final List Field14206;
    @NotNull
    private final List Field14207;
    private int Field14208;

    @NotNull
    @NotNull
    public String toString() {
        return this.Field14204 + ' ' + this.Field14205;
    }

    @NotNull
    @NotNull
    public final String Method5444() {
        return this.Field14204;
    }

    public final void Method5445(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"<set-?>");
        this.Field14204 = string;
    }

    @NotNull
    @NotNull
    public final String Method5446() {
        return this.Field14205;
    }

    public final void Method5447(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"<set-?>");
        this.Field14205 = string;
    }

    @NotNull
    @NotNull
    public final List Method5448() {
        return this.Field14206;
    }

    @NotNull
    @NotNull
    public final List Method5449() {
        return this.Field14207;
    }

    public Class1364(@NotNull @NotNull String string, @NotNull @NotNull String string2, @NotNull @NotNull List list, @NotNull @NotNull List list2) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"obf");
        Intrinsics.checkParameterIsNotNull((Object)string2, (String)"deobf");
        Intrinsics.checkParameterIsNotNull((Object)list, (String)"fields");
        Intrinsics.checkParameterIsNotNull((Object)list2, (String)"methods");
        this.Field14204 = string;
        this.Field14205 = string2;
        this.Field14206 = list;
        this.Field14207 = list2;
    }

    public Class1364(String string, String string2, List list, List list2, int n, DefaultConstructorMarker defaultConstructorMarker) {
        boolean bl;
        if ((n & 4) != 0) {
            bl = false;
            list = new ArrayList();
        }
        if ((n & 8) != 0) {
            bl = false;
            list2 = new ArrayList();
        }
        this(string, string2, list, list2);
    }

    @NotNull
    @NotNull
    public final String Method5450() {
        return this.Field14204;
    }

    @NotNull
    @NotNull
    public final String Method5451() {
        return this.Field14205;
    }

    @NotNull
    @NotNull
    public final List Method5452() {
        return this.Field14206;
    }

    @NotNull
    @NotNull
    public final List Method5453() {
        return this.Field14207;
    }

    @NotNull
    @NotNull
    public final Class1364 Method5454(@NotNull @NotNull String string, @NotNull @NotNull String string2, @NotNull @NotNull List list, @NotNull @NotNull List list2) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"obf");
        Intrinsics.checkParameterIsNotNull((Object)string2, (String)"deobf");
        Intrinsics.checkParameterIsNotNull((Object)list, (String)"fields");
        Intrinsics.checkParameterIsNotNull((Object)list2, (String)"methods");
        return new Class1364(string, string2, list, list2);
    }

    @NotNull
    @NotNull
    public static Class1364 Method5455(Class1364 class1364, String string, String string2, List list, List list2, int n, Object object) {
        if ((n & 1) != 0) {
            string = class1364.Field14204;
        }
        if ((n & 2) != 0) {
            string2 = class1364.Field14205;
        }
        if ((n & 4) != 0) {
            list = class1364.Field14206;
        }
        if ((n & 8) == 0) return class1364.Method5454(string, string2, list, list2);
        list2 = class1364.Field14207;
        return class1364.Method5454(string, string2, list, list2);
    }

    public int hashCode() {
        int n;
        String string = this.Field14204;
        String string2 = this.Field14205;
        List list = this.Field14206;
        int n2 = (((string != null ? string.hashCode() : 0) * 31 + (string2 != null ? string2.hashCode() : 0)) * 31 + (list != null ? ((Object)list).hashCode() : 0)) * 31;
        List list2 = this.Field14207;
        if (list2 != null) {
            n = ((Object)list2).hashCode();
            return n2 + n;
        }
        n = 0;
        return n2 + n;
    }

    public boolean equals(@Nullable @Nullable Object object) {
        if (this == object) return true;
        if (!(object instanceof Class1364)) return false;
        Class1364 class1364 = (Class1364)object;
        if (!Intrinsics.areEqual((Object)this.Field14204, (Object)class1364.Field14204)) return false;
        if (!Intrinsics.areEqual((Object)this.Field14205, (Object)class1364.Field14205)) return false;
        if (!Intrinsics.areEqual((Object)this.Field14206, (Object)class1364.Field14206)) return false;
        if (!Intrinsics.areEqual((Object)this.Field14207, (Object)class1364.Field14207)) return false;
        return true;
    }

    private static String Method5456(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 54;
            cArray2[n] = (char)(cArray[n] ^ (0x7925 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

