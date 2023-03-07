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
final class JmZtWHNRIQ5Ri1a4G0kaFnrTWEDInXfj
implements Consumer {
    private final Function1 Field17023;
    private int Field17024;

    JmZtWHNRIQ5Ri1a4G0kaFnrTWEDInXfj(Function1 function1) {
        this.Field17023 = function1;
    }

    public final void accept(Object object) {
        Intrinsics.checkExpressionValueIsNotNull((Object)this.Field17023.invoke(object), (String)"invoke(...)");
    }

    private static String Method7270(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1089969641 ^ (long)1089969641);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-2136651229 ^ (long)-2136651044);
            int n2 = (int)((long)-2029555605 ^ (long)-2029555582);
            cArray2[n] = (char)(cArray[n] ^ ((int)855773578L ^ 0x3302064F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

