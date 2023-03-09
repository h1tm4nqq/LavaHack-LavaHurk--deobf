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
import lavahack.client.Class1160;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/features/module/render/shader/ShaderUtil$UniformInt;", "Lcom/kisman/cc/features/module/render/shader/ShaderUtil$Uniform;", "name", "", "value", "", "(Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "getValue", "()I", "kisman.cc"})
public final class Class1257
extends Class1160 {
    @NotNull
    private final String Field13699;
    private final int Field13700;
    private String Field13701 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final String Method5079() {
        return this.Field13699;
    }

    public final int Method5080() {
        return this.Field13700;
    }

    public Class1257(@NotNull @NotNull String string, int n) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"name");
        this.Field13699 = string;
        this.Field13700 = n;
    }

    private static String Method5081(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 207;
            cArray2[n] = (char)(cArray[n] ^ (0x4B69 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

