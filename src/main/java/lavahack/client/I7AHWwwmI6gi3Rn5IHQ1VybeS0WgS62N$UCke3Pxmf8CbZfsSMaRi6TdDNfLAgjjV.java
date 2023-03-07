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
final class I7AHWwwmI6gi3Rn5IHQ1VybeS0WgS62N$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV
implements Supplier {
    public static final I7AHWwwmI6gi3Rn5IHQ1VybeS0WgS62N$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Field12838 = new I7AHWwwmI6gi3Rn5IHQ1VybeS0WgS62N$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV();
    private String Field12839 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method4377();
    }

    public final boolean Method4377() {
        int n;
        if (aaIDVwbtzp3KxPpHfK7jnkVMYqAV3lzi.Field16465 != null) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = aaIDVwbtzp3KxPpHfK7jnkVMYqAV3lzi.Field16465.Field16458;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"CustomFontModule.instance.test2");
            n = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365();
            return n != 0;
        }
        n = (int)((long)291549004 ^ (long)291549004);
        return n != 0;
    }

    I7AHWwwmI6gi3Rn5IHQ1VybeS0WgS62N$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV() {
    }

    private static String Method4378(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)25933807 ^ (long)25933807);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)358653860 ^ (long)358653787);
            int n2 = ((int)539588119L ^ 0x2029762C) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-626423707L ^ 0xDAA9AEEC) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

