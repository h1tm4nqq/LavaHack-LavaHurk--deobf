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
import lavahack.client.Class1194;
import lavahack.client.Class44;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class Class37
implements Supplier {
    final Class1194 Field8038;
    private String Field8039 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method280();
    }

    public final boolean Method280() {
        Class44 class44 = Class1194.Method4809(this.Field8038);
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"crystalInfo");
        return class44.Method365();
    }

    Class37(Class1194 class1194) {
        this.Field8038 = class1194;
    }

    private static String Method281(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 136;
            cArray2[n] = (char)(cArray[n] ^ (0x6540 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

