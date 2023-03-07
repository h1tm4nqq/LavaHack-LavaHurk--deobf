/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements Supplier {
    final om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz Field9160;
    private String Field9161 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method1424();
    }

    public final boolean Method1424() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field9160.Method4013();
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"customY");
        return qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365();
    }

    om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz2) {
        this.Field9160 = om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz2;
    }

    private static String Method1425(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)500757678L ^ 0x1DD8F4AE;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-85859694 ^ (long)-85859731);
            int n2 = (int)((long)-1350675677 ^ (long)-1350675574);
            cArray2[n] = (char)(cArray[n] ^ (((int)2047393408L ^ 0x7A08B2DF) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

