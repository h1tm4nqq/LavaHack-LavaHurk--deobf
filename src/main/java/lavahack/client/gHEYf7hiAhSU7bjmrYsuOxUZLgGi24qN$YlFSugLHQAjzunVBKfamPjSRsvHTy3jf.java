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
final class gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
implements Supplier {
    public static final gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field16976 = new gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf();
    private String Field16977 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method7206();
    }

    public final boolean Method7206() {
        int n;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7084(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16809);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"fuAll");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            n = (int)((long)-1079081718 ^ (long)-1079081717);
            return n != 0;
        }
        n = (int)((long)907012188 ^ (long)907012188);
        return n != 0;
    }

    gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
    }

    private static String Method7207(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-172730940L ^ 0xF5B455C4;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-702495274 ^ (long)-702495447);
            int n2 = ((int)-984550990L ^ 0xC550F1F3) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)1070547527L ^ 0x3FCF6F58 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

