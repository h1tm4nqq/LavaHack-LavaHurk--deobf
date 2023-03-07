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
import lavahack.client.lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements Supplier {
    final lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA Field10810;
    private String Field10811 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method2835();
    }

    public final boolean Method2835() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA.Method3897(this.Field10810);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"sneakSpam");
        return qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365();
    }

    lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA2) {
        this.Field10810 = lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA2;
    }

    private static String Method2836(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1958140569 ^ (long)1958140569);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1447576149 ^ (long)1447576234);
            int n2 = (int)1327843196L ^ 0x4F2547EF;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1466282581L ^ 0xA89A2392 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

