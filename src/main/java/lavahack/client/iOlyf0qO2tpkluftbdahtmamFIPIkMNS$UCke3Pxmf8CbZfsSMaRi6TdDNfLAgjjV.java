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
import lavahack.client.iOlyf0qO2tpkluftbdahtmamFIPIkMNS;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class iOlyf0qO2tpkluftbdahtmamFIPIkMNS$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV
implements Supplier {
    final iOlyf0qO2tpkluftbdahtmamFIPIkMNS Field13613;
    private String Field13614 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method4965();
    }

    public final boolean Method4965() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = iOlyf0qO2tpkluftbdahtmamFIPIkMNS.Method4756(this.Field13613);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"rotation");
        return qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365();
    }

    iOlyf0qO2tpkluftbdahtmamFIPIkMNS$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(iOlyf0qO2tpkluftbdahtmamFIPIkMNS iOlyf0qO2tpkluftbdahtmamFIPIkMNS2) {
        this.Field13613 = iOlyf0qO2tpkluftbdahtmamFIPIkMNS2;
    }

    private static String Method4966(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1599854381 ^ (long)1599854381);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1045112174 ^ (long)1045112209);
            int n2 = (int)((long)907582857 ^ (long)907582902) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)670810103L ^ 0x27FB852C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

