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
final class gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$Ljc0gDTN8WkwPRHY480HpEkScGALG41A
implements Supplier {
    public static final gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$Ljc0gDTN8WkwPRHY480HpEkScGALG41A Field12042 = new gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$Ljc0gDTN8WkwPRHY480HpEkScGALG41A();
    private int Field12043;

    public Object get() {
        return this.Method3911();
    }

    public final boolean Method3911() {
        int n;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7084(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16809);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"fuAll");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            n = (int)-734270826L ^ 0xD43BEA97;
            return n != 0;
        }
        n = (int)((long)-624991592 ^ (long)-624991592);
        return n != 0;
    }

    gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$Ljc0gDTN8WkwPRHY480HpEkScGALG41A() {
    }

    private static String Method3912(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1229623409L ^ 0x494A9071;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-146118938 ^ (long)-146119143);
            int n2 = ((int)367921104L ^ 0x15EE07D1) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1307794390 ^ (long)-1307790709) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

