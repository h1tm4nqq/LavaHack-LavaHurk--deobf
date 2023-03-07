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
import lavahack.client.TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventArmSwingAnimationEnd;", "kotlin.jvm.PlatformType", "invoke"})
final class TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    public static final TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field16048 = new TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
    private int Field16049;

    @Override
    public void Method979(Object object) {
        this.Method6683((ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS)object);
    }

    public final void Method6683(ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS2) {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6757(TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Field16200);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"animation");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) return;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6758(TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Field16200);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"animationSpeed");
        ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS2.Method1671(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method335());
    }

    TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
    }

    private static String Method6684(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1654203071L ^ 0x9D66DD41;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)845741041L ^ 0x3268FB0E);
            int n2 = (int)((long)1830841457 ^ (long)1830841424) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)766675408L ^ 0x2DB2A583) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

