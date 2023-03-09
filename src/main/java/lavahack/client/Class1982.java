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
import lavahack.client.Class1909;
import lavahack.client.Class44;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class Class1982
implements Supplier {
    public static final Class1982 Field17121 = new Class1982();
    private String Field17122 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method7340();
    }

    public final boolean Method7340() {
        Class44 class44 = Class1909.Method7083(Class1909.Field16809);
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"noInteractVal");
        return class44.Method365();
    }

    Class1982() {
    }

    private static String Method7341(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 132;
            cArray2[n] = (char)(cArray[n] ^ (0x360 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

