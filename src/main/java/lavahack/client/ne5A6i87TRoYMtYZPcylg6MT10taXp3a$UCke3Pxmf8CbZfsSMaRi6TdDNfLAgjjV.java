/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.awt.Font;
import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.aaIDVwbtzp3KxPpHfK7jnkVMYqAV3lzi;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class ne5A6i87TRoYMtYZPcylg6MT10taXp3a$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV
implements Supplier {
    final Font Field11212;
    private String Field11213 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method3139();
    }

    public final int Method3139() {
        int n;
        if (aaIDVwbtzp3KxPpHfK7jnkVMYqAV3lzi.Field16465 != null) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = aaIDVwbtzp3KxPpHfK7jnkVMYqAV3lzi.Field16465.Field16462;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"CustomFontModule.instance.customSize");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = aaIDVwbtzp3KxPpHfK7jnkVMYqAV3lzi.Field16465.Field16463;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"CustomFontModule.instance.size");
                n = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method335();
                return n;
            }
        }
        n = this.Field11212.getSize();
        return n;
    }

    ne5A6i87TRoYMtYZPcylg6MT10taXp3a$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(Font font) {
        this.Field11212 = font;
    }

    private static String Method3140(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)926913427L ^ 0x373F9393;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-2098598718L ^ 0x82E9EC3D);
            int n2 = (int)((long)-873337898 ^ (long)-873337899) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1024662237 ^ (long)-1024660684) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

