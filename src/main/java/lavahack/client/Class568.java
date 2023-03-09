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
import lavahack.client.Class1831;
import lavahack.client.Class44;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class Class568
implements Supplier {
    public static final Class568 Field10420 = new Class568();
    private int Field10421;

    public Object get() {
        return this.Method2511();
    }

    public final int Method2511() {
        if (Class1831.Field16465 == null) return 18;
        Class44 class44 = Class1831.Field16465.Field16462;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"CustomFontModule.instance.customSize");
        if (!class44.Method365()) return 18;
        Class44 class442 = Class1831.Field16465.Field16463;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"CustomFontModule.instance.size");
        int n = (int)class442.Method372();
        return n;
    }

    Class568() {
    }

    private static String Method2512(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 140;
            cArray2[n] = (char)(cArray[n] ^ (0x7E1F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

