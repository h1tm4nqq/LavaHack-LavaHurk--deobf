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
import lavahack.client.fdljcT89CBPrL7HBEVQFJfXSVaiifxsj;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/features/capes/Cape;", "", "cape", "Lcom/kisman/cc/features/capes/Capes;", "uuid", "", "(Lcom/kisman/cc/features/capes/Capes;Ljava/lang/String;)V", "getCape", "()Lcom/kisman/cc/features/capes/Capes;", "getUuid", "()Ljava/lang/String;", "kisman.cc"})
public final class XlHSG3OW4gX2o45A9DNWLPF6GqZiJOrl {
    @NotNull
    private final fdljcT89CBPrL7HBEVQFJfXSVaiifxsj Field16751;
    @NotNull
    private final String Field16752;
    private String Field16753 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final fdljcT89CBPrL7HBEVQFJfXSVaiifxsj Method7044() {
        return this.Field16751;
    }

    @NotNull
    @NotNull
    public final String Method7045() {
        return this.Field16752;
    }

    public XlHSG3OW4gX2o45A9DNWLPF6GqZiJOrl(@NotNull @NotNull fdljcT89CBPrL7HBEVQFJfXSVaiifxsj fdljcT89CBPrL7HBEVQFJfXSVaiifxsj2, @NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)fdljcT89CBPrL7HBEVQFJfXSVaiifxsj2), (String)"cape");
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"uuid");
        this.Field16751 = fdljcT89CBPrL7HBEVQFJfXSVaiifxsj2;
        this.Field16752 = string;
    }

    private static String Method7046(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)567067718L ^ 0x21CCC446;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1419939390L ^ 0xAB5D713D);
            int n2 = (int)((long)1648160834 ^ (long)1648160881) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1326195043 ^ (long)1326201728) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

