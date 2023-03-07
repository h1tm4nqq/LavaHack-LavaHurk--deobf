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
import lavahack.client.Y0vFviKb7lZj1fGvsLBvlVivNjKh4aSO;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class Y0vFviKb7lZj1fGvsLBvlVivNjKh4aSO$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements Supplier {
    final Y0vFviKb7lZj1fGvsLBvlVivNjKh4aSO Field8302;
    private String Field8303 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method763();
    }

    public final boolean Method763() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = Y0vFviKb7lZj1fGvsLBvlVivNjKh4aSO.Method2055(this.Field8302);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"bSmart");
        return qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365();
    }

    Y0vFviKb7lZj1fGvsLBvlVivNjKh4aSO$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(Y0vFviKb7lZj1fGvsLBvlVivNjKh4aSO y0vFviKb7lZj1fGvsLBvlVivNjKh4aSO) {
        this.Field8302 = y0vFviKb7lZj1fGvsLBvlVivNjKh4aSO;
    }

    private static String Method764(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-996301956 ^ (long)-996301956);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-23085177L ^ 0xFE9FBF78);
            int n2 = (int)((long)-306338729 ^ (long)-306338724);
            cArray2[n] = (char)(cArray[n] ^ ((int)-79404709L ^ 0xFB440CF8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

