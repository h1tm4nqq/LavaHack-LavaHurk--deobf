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
import lavahack.client.Class1488;
import lavahack.client.Class44;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0006\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class Class173
implements Supplier {
    final Class1488 Field8778;
    private int Field8779;

    public Object get() {
        return this.Method1092();
    }

    public final double Method1092() {
        Class44 class44 = Class1488.Method5966(this.Field8778);
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"range");
        return class44.Method367();
    }

    Class173(Class1488 class1488) {
        this.Field8778 = class1488;
    }

    private static String Method1093(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 216;
            cArray2[n] = (char)(cArray[n] ^ (0x355C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

