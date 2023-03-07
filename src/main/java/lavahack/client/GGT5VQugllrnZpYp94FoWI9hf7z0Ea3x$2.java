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
import lavahack.client.GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$2
implements Supplier {
    final GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x Field15631;
    private String Field15632 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method6372();
    }

    @NotNull
    @NotNull
    public final String Method6372() {
        StringBuilder stringBuilder = new StringBuilder().append((char)((long)1666796267 ^ (long)1666796208));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7119(this.Field15631);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"reverseStepVal");
        return stringBuilder.append(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method335()).append((char)((long)11168538 ^ (long)11168583)).toString();
    }

    GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$2(GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x) {
        this.Field15631 = gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x;
    }

    private static String Method6373(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-718698392 ^ (long)-718698392);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-501782030L ^ 0xE217690D);
            int n2 = (int)-810999588L ^ 0xCFA92065;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)504492906 ^ (long)504483987) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

