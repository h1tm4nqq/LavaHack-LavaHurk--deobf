/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.util.function.Function;
import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1056;
import lavahack.client.Class44;
import lavahack.client.Class467;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class Class867
implements Supplier {
    final Class1056 Field11651;
    private String Field11652 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method3659();
    }

    @NotNull
    @NotNull
    public final String Method3659() {
        StringBuilder stringBuilder = new StringBuilder().append('[');
        Function function = Class467.Field9943.Method2190();
        Class44 class44 = Class1056.Method4308(this.Field11651);
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"delay");
        return stringBuilder.append((String)function.apply(class44.Method335())).toString();
    }

    Class867(Class1056 class1056) {
        this.Field11651 = class1056;
    }

    private static String Method3660(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 46;
            cArray2[n] = (char)(cArray[n] ^ (0xD00 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

