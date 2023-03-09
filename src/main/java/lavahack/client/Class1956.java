/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3)
final class Class1956
implements Consumer {
    private final Function1 Field17023;
    private int Field17024;

    Class1956(Function1 function1) {
        this.Field17023 = function1;
    }

    public final void accept(Object object) {
        Intrinsics.checkExpressionValueIsNotNull((Object)this.Field17023.invoke(object), (String)"invoke(...)");
    }

    private static String Method7270(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 233;
            cArray2[n] = (char)(cArray[n] ^ (0x17C5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

