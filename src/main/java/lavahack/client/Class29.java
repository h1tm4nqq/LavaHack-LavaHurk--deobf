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

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class Class29
implements Supplier {
    public static final Class29 Field7938 = new Class29();
    private String Field7939 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method245();
    }

    public final boolean Method245() {
        if (Class1831.Field16465 == null) return false;
        Class44 class44 = Class1831.Field16465.Field16457;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"CustomFontModule.instance.test");
        boolean bl = class44.Method365();
        return bl;
    }

    Class29() {
    }

    private static String Method246(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 210;
            cArray2[n] = (char)(cArray[n] ^ (0x5861 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

