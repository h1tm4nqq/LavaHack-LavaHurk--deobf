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
import lavahack.client.Class1670;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/features/capes/Cape;", "", "cape", "Lcom/kisman/cc/features/capes/Capes;", "uuid", "", "(Lcom/kisman/cc/features/capes/Capes;Ljava/lang/String;)V", "getCape", "()Lcom/kisman/cc/features/capes/Capes;", "getUuid", "()Ljava/lang/String;", "kisman.cc"})
public final class Class1901 {
    @NotNull
    private final Class1670 Field16751;
    @NotNull
    private final String Field16752;
    private String Field16753 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final Class1670 Method7044() {
        return this.Field16751;
    }

    @NotNull
    @NotNull
    public final String Method7045() {
        return this.Field16752;
    }

    public Class1901(@NotNull @NotNull Class1670 class1670, @NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)class1670), (String)"cape");
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"uuid");
        this.Field16751 = class1670;
        this.Field16752 = string;
    }

    private static String Method7046(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 204;
            cArray2[n] = (char)(cArray[n] ^ (0x1AE3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

