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
final class GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$1
implements Supplier {
    final GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x Field15622;
    private String Field15623 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method6367();
    }

    @NotNull
    @NotNull
    public final String Method6367() {
        StringBuilder stringBuilder = new StringBuilder().append((char)((long)-1895182597 ^ (long)-1895182688));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field15622.Method7101();
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"stepVal");
        return stringBuilder.append(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method335()).append((char)((long)392679943 ^ (long)392680026)).toString();
    }

    GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$1(GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x) {
        this.Field15622 = gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x;
    }

    private static String Method6368(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-259157536L ^ 0xF08D91E0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)446818216L ^ 0x1AA1E757);
            int n2 = ((int)-1806670983L ^ 0x94506346) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-2118463273 ^ (long)-2118481852) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

