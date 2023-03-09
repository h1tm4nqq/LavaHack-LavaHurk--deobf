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
import lavahack.client.Class1000;
import lavahack.client.Class1854;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2={"Lcom/kisman/cc/gui/other/search/SearchGui$Companion;", "", "()V", "nameMode", "Lcom/kisman/cc/util/enums/SearchGuiItemsNameModes;", "getNameMode", "()Lcom/kisman/cc/util/enums/SearchGuiItemsNameModes;", "setNameMode", "(Lcom/kisman/cc/util/enums/SearchGuiItemsNameModes;)V", "resolutionX", "", "getResolutionX", "()I", "setResolutionX", "(I)V", "kisman.cc"})
public final class Class201 {
    private int Field8880;

    @NotNull
    @NotNull
    public final Class1854 Method1192() {
        return Class1000.access$getNameMode$cp();
    }

    public final void Method1193(@NotNull @NotNull Class1854 class1854) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)class1854), (String)"<set-?>");
        Class1000.access$setNameMode$cp(class1854);
    }

    public final int Method1194() {
        return Class1000.access$getResolutionX$cp();
    }

    public final void Method1195(int n) {
        Class1000.access$setResolutionX$cp(n);
    }

    private Class201() {
    }

    public Class201(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private static String Method1196(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 55;
            cArray2[n] = (char)(cArray[n] ^ (0x5C59 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

