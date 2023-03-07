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

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class ne5A6i87TRoYMtYZPcylg6MT10taXp3a$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
implements Supplier {
    public static final ne5A6i87TRoYMtYZPcylg6MT10taXp3a$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field17847 = new ne5A6i87TRoYMtYZPcylg6MT10taXp3a$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf();
    private String Field17848 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method7742();
    }

    public final int Method7742() {
        int n;
        if (aaIDVwbtzp3KxPpHfK7jnkVMYqAV3lzi.Field16465 != null) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = aaIDVwbtzp3KxPpHfK7jnkVMYqAV3lzi.Field16465.Field16462;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"CustomFontModule.instance.customSize");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = aaIDVwbtzp3KxPpHfK7jnkVMYqAV3lzi.Field16465.Field16463;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"CustomFontModule.instance.size");
                n = (int)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method371();
                return n;
            }
        }
        n = ((int)-1968307119L ^ 0x8AAE0458) << 1;
        return n;
    }

    ne5A6i87TRoYMtYZPcylg6MT10taXp3a$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
    }

    private static String Method7743(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1383613057L ^ 0x52784281;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1225136055 ^ (long)-1225135946);
            int n2 = ((int)1510879912L ^ 0x5A0E32A7) << 4;
            cArray2[n] = (char)(cArray[n] ^ ((int)768223174L ^ 0x2DCA1C31 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

