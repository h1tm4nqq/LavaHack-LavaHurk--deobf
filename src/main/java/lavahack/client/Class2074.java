/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import java.util.function.Supplier;
import kotlin.Metadata;
import lavahack.client.Class415;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0002\b\u0003"}, d2={"<anonymous>", "", "kotlin.jvm.PlatformType", "get"})
final class Class2074
implements Supplier {
    public static final Class2074 Field17487 = new Class2074();
    private String Field17488 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method7615();
    }

    public final String Method7615() {
        if (!Class415.Field9718.Method2015()) return "Printing";
        return "Stationary";
    }

    Class2074() {
    }

    private static String Method7616(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 225;
            cArray2[n] = (char)(cArray[n] ^ (0x3C24 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

