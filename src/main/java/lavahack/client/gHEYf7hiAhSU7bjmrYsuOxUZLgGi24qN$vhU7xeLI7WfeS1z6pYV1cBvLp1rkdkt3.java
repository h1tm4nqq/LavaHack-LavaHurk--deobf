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
import lavahack.client.gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3
implements Supplier {
    public static final gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3 Field17121 = new gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3();
    private String Field17122 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method7340();
    }

    public final boolean Method7340() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7083(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16809);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"noInteractVal");
        return qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365();
    }

    gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3() {
    }

    private static String Method7341(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1397706838L ^ 0x534F5056;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)683778796L ^ 0x28C1A213);
            int n2 = ((int)-1589578727L ^ 0xA140F438) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1484722145L ^ 0xA780F004) << 5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

