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
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV
implements Supplier {
    public static final wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Field14874 = new wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV();
    private String Field14875 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method5915();
    }

    public final boolean Method5915() {
        int n;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Field14544.Field14437;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"AutoRer.instance.multiThreaddedSphereGetter");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Field14544.Field14438;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"AutoRer.instance.multiThreaddedTargetGetter");
            if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365()) {
                n = (int)1866365024L ^ 0x6F3E7860;
                return n != 0;
            }
        }
        n = (int)((long)461931744 ^ (long)461931745);
        return n != 0;
    }

    wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV() {
    }

    private static String Method5916(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)937541434L ^ 0x37E1BF3A;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1037904764L ^ 0x3DDD2B83);
            int n2 = (int)((long)-107852270 ^ (long)-107852251) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-627861484 ^ (long)-627838861) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

