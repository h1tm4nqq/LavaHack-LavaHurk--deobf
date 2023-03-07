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

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0006\u0010\u0003\u001a\u00020\u0001\u00a8\u0006\u0004"}, d2={"fragment", "", "name", "vertex", "kisman.cc"})
public final class eNiq4ZtBradWI9CJnlPSTLjH50L90Apv {
    private String Field7829 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public static final String Method61() {
        return "/assets/kismancc/shader/vertex.vert";
    }

    @NotNull
    @NotNull
    public static final String Method62(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"name");
        return "/assets/kismancc/shader/fragment/" + string;
    }

    private static String Method63(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)204071207L ^ 0xC29E127;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1407729210L ^ 0x53E83EC5);
            int n2 = ((int)-460997077L ^ 0xE485BE00) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1435998851 ^ (long)-1435995710) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

