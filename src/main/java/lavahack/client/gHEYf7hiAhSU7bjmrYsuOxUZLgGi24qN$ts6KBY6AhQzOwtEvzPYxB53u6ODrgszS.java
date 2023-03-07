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
final class gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS
implements Supplier {
    public static final gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS Field7830 = new gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS();
    private String Field7831 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method64();
    }

    public final boolean Method64() {
        int n;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7084(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16809);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"fuAll");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            n = (int)((long)-619017616 ^ (long)-619017615);
            return n != 0;
        }
        n = (int)((long)1634393135 ^ (long)1634393135);
        return n != 0;
    }

    gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS() {
    }

    private static String Method65(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1125747482 ^ (long)-1125747482);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)596860767 ^ (long)596860832);
            int n2 = (int)-35281639L ^ 0xFDE5A54A;
            cArray2[n] = (char)(cArray[n] ^ (((int)-721034495L ^ 0xD505CACA) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

