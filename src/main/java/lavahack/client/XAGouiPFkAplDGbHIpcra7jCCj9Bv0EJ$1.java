/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import java.util.function.Supplier;
import kotlin.Metadata;
import lavahack.client.XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ$1
implements Supplier {
    public static final XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ$1 Field15894 = new XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ$1();
    private int Field15895;

    public Object get() {
        return this.Method6539();
    }

    @NotNull
    @NotNull
    public final String Method6539() {
        return XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Field14381.Method5549() + " ms";
    }

    XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ$1() {
    }

    private static String Method6540(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1276383414 ^ (long)-1276383414);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1519640511 ^ (long)-1519640386);
            int n2 = ((int)993877079L ^ 0x3B3D5C2E) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1670006457 ^ (long)1670007160) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

