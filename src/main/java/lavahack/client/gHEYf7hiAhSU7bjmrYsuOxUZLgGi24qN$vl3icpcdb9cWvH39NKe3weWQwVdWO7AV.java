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
final class gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV
implements Supplier {
    public static final gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field11440 = new gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV();
    private int Field11441;

    public Object get() {
        return this.Method3402();
    }

    public final boolean Method3402() {
        boolean bl;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7084(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16809);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"fuAll");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            bl = (int)440306650L ^ 0x1A3E8BDB;
            return bl;
        }
        bl = (int)940966437L ^ 0x38160225;
        return bl;
    }

    gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV() {
    }

    private static String Method3403(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-725832284 ^ (long)-725832284);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1460143175L ^ 0xA8F7FB46);
            int n2 = ((int)-1614621445L ^ 0x9FC2D4AC) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)1987086670L ^ 0x76709A8F) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

