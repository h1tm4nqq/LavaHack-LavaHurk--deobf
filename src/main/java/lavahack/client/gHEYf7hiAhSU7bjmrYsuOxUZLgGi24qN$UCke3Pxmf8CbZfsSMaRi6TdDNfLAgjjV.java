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
import lavahack.client.gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV
implements Supplier {
    public static final gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Field11237 = new gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV();
    private String Field11238 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method3155();
    }

    public final boolean Method3155() {
        int n;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7084(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16809);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"fuAll");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            n = (int)((long)-810214279 ^ (long)-810214280);
            return n != 0;
        }
        n = (int)((long)784551758 ^ (long)784551758);
        return n != 0;
    }

    gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV() {
    }

    private static String Method3156(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1436127586 ^ (long)-1436127586);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)123762555L ^ 0x7607784);
            int n2 = (int)((long)1722473459 ^ (long)1722473332);
            cArray2[n] = (char)(cArray[n] ^ (((int)-1985264400L ^ 0x89AB7015) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

