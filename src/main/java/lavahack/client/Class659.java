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
import lavahack.client.Class44;
import lavahack.client.Class943;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class Class659
implements Supplier {
    final Class943 Field10810;
    private String Field10811 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method2835();
    }

    public final boolean Method2835() {
        Class44 class44 = Class943.Method3897(this.Field10810);
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"sneakSpam");
        return class44.Method365();
    }

    Class659(Class943 class943) {
        this.Field10810 = class943;
    }

    private static String Method2836(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 147;
            cArray2[n] = (char)(cArray[n] ^ (0x6E39 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

