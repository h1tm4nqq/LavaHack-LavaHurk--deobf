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
import lavahack.client.Class1416;
import lavahack.client.Class44;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class Class1472
implements Supplier {
    public static final Class1472 Field14874 = new Class1472();
    private String Field14875 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method5915();
    }

    public final boolean Method5915() {
        Class44 class44 = Class1416.Field14544.Field14437;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"AutoRer.instance.multiThreaddedSphereGetter");
        if (class44.Method365()) return true;
        Class44 class442 = Class1416.Field14544.Field14438;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"AutoRer.instance.multiThreaddedTargetGetter");
        if (class442.Method365()) return true;
        return false;
    }

    Class1472() {
    }

    private static String Method5916(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 110;
            cArray2[n] = (char)(cArray[n] ^ (0x6867 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

