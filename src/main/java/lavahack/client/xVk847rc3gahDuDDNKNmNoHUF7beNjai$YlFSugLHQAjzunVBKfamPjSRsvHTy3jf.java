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
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xVk847rc3gahDuDDNKNmNoHUF7beNjai;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0006\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class xVk847rc3gahDuDDNKNmNoHUF7beNjai$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
implements Supplier {
    final xVk847rc3gahDuDDNKNmNoHUF7beNjai Field8778;
    private int Field8779;

    public Object get() {
        return this.Method1092();
    }

    public final double Method1092() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = xVk847rc3gahDuDDNKNmNoHUF7beNjai.Method5966(this.Field8778);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"range");
        return qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method367();
    }

    xVk847rc3gahDuDDNKNmNoHUF7beNjai$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(xVk847rc3gahDuDDNKNmNoHUF7beNjai xVk847rc3gahDuDDNKNmNoHUF7beNjai2) {
        this.Field8778 = xVk847rc3gahDuDDNKNmNoHUF7beNjai2;
    }

    private static String Method1093(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1779642891 ^ (long)-1779642891);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1703577371 ^ (long)-1703577574);
            int n2 = ((int)1731771075L ^ 0x6738BAD8) << 3;
            cArray2[n] = (char)(cArray[n] ^ (((int)1097640438L ^ 0x416CA4A1) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

