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
import lavahack.client.Class1444;
import lavahack.client.Class44;
import lavahack.client.Class55;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class Class1721
implements Supplier {
    final Class1444 Field15919;
    private int Field15920;

    public Object get() {
        return this.Method6580();
    }

    public final boolean Method6580() {
        Class44 class44 = this.Field15919.Method5757();
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"mode");
        if (!class44.Method341().equals((Object)Class55.Field8170)) return false;
        Object t = this.Field15919.Method5765().get();
        Intrinsics.checkExpressionValueIsNotNull(t, (String)"visible.get()");
        if ((Boolean)t == false) return false;
        return true;
    }

    Class1721(Class1444 class1444) {
        this.Field15919 = class1444;
    }

    private static String Method6581(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 252;
            cArray2[n] = (char)(cArray[n] ^ (0x1F70 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

