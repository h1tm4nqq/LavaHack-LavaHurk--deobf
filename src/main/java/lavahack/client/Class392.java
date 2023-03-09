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

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/features/hud/modules/BindList$Element;", "", "text", "", "state", "", "(Ljava/lang/String;Z)V", "getState", "()Z", "getText", "()Ljava/lang/String;", "kisman.cc"})
public final class Class392 {
    @NotNull
    private final String Field9649;
    private final boolean Field9650;
    private int Field9651;

    @NotNull
    @NotNull
    public final String Method1910() {
        return this.Field9649;
    }

    public final boolean Method1911() {
        return this.Field9650;
    }

    public Class392(@NotNull @NotNull String string, boolean bl) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        this.Field9649 = string;
        this.Field9650 = bl;
    }

    private static String Method1912(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 255;
            cArray2[n] = (char)(cArray[n] ^ (0x2121 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

