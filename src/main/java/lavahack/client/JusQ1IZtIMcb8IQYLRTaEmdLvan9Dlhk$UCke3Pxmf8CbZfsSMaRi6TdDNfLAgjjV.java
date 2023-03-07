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
import lavahack.client.aaIDVwbtzp3KxPpHfK7jnkVMYqAV3lzi;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class JusQ1IZtIMcb8IQYLRTaEmdLvan9Dlhk$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV
implements Supplier {
    public static final JusQ1IZtIMcb8IQYLRTaEmdLvan9Dlhk$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Field14416 = new JusQ1IZtIMcb8IQYLRTaEmdLvan9Dlhk$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV();
    private int Field14417;

    public Object get() {
        return this.Method5580();
    }

    public final boolean Method5580() {
        boolean bl;
        if (aaIDVwbtzp3KxPpHfK7jnkVMYqAV3lzi.Field16465 != null) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = aaIDVwbtzp3KxPpHfK7jnkVMYqAV3lzi.Field16465.Field16458;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"CustomFontModule.instance.test2");
            bl = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365();
            return bl;
        }
        bl = (int)-184705097L ^ 0xF4FD9FB7;
        return bl;
    }

    JusQ1IZtIMcb8IQYLRTaEmdLvan9Dlhk$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV() {
    }

    private static String Method5581(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1775094699L ^ 0x69CDCBAB;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)79053848 ^ (long)79054055);
            int n2 = ((int)-1975627497L ^ 0x8A3E517C) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)777194791L ^ 0x2E530730 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

