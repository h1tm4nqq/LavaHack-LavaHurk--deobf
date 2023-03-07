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
import lavahack.client.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import lavahack.client.TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventAspect;", "kotlin.jvm.PlatformType", "invoke"})
final class TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    public static final TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field11520 = new TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf();
    private String Field11521 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method3535((Ljc0gDTN8WkwPRHY480HpEkScGALG41A)object);
    }

    public final void Method3535(Ljc0gDTN8WkwPRHY480HpEkScGALG41A ljc0gDTN8WkwPRHY480HpEkScGALG41A) {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6759(TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Field16200);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"aspect");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) return;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6760(TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Field16200);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"aspectWidth");
        float f = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method368();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6761(TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Field16200);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"aspectHeight");
        ljc0gDTN8WkwPRHY480HpEkScGALG41A.Method7187(f / qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method368());
    }

    TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
    }

    private static String Method3536(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-2137234387L ^ 0x809C642D;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1314765829L ^ 0x4E5DBCFA);
            int n2 = (int)-567739796L ^ 0xDE28FA6B;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1950422728L ^ 0x8BBEEAF3) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

