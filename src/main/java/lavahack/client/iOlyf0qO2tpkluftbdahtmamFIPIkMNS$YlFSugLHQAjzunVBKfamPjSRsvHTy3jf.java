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
final class iOlyf0qO2tpkluftbdahtmamFIPIkMNS$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
implements Supplier {
    final iOlyf0qO2tpkluftbdahtmamFIPIkMNS Field9906;
    private String Field9907 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method2160();
    }

    public final boolean Method2160() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = iOlyf0qO2tpkluftbdahtmamFIPIkMNS.Method4757(this.Field9906);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"cooldownCheck");
        return qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365();
    }

    iOlyf0qO2tpkluftbdahtmamFIPIkMNS$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(iOlyf0qO2tpkluftbdahtmamFIPIkMNS iOlyf0qO2tpkluftbdahtmamFIPIkMNS2) {
        this.Field9906 = iOlyf0qO2tpkluftbdahtmamFIPIkMNS2;
    }

    private static String Method2161(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-361314178L ^ 0xEA76C87E;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1949154712L ^ 0x8BD24297);
            int n2 = ((int)46695916L ^ 0x2C885E1) << 3;
            cArray2[n] = (char)(cArray[n] ^ (((int)1626437054L ^ 0x60F17B33) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

