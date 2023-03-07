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
import lavahack.client.HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6;
import lavahack.client.HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
implements Supplier {
    final HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6 Field12644;
    private String Field12645 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method4287();
    }

    public final boolean Method4287() {
        int n;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6.Method4928(this.Field12644);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"heLogic");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method341() == HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16674) {
            n = (int)1557771878L ^ 0x5CD9B667;
            return n != 0;
        }
        n = (int)((long)467200884 ^ (long)467200884);
        return n != 0;
    }

    HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6 hsjWk9hXiCkuTOLzk6rPbVmU1luUitS6) {
        this.Field12644 = hsjWk9hXiCkuTOLzk6rPbVmU1luUitS6;
    }

    private static String Method4288(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1632594749 ^ (long)-1632594749);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1876588306 ^ (long)-1876588527);
            int n2 = (int)-1726650290L ^ 0x99156803;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-2138798874 ^ (long)-2138772515) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

