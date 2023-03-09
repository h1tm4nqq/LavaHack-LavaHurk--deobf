/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.Regex
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2={"floatingPointNumber", "Lkotlin/text/Regex;", "parseNumber", "", "value", "", "oldValue", "kisman.cc"})
public final class Class1990 {
    private static final Regex Field17154 = new Regex("^[+-]?([0-9]+([.][0-9]*)?|[.][0-9]+)$");
    private int Field17155;

    public static final double Method7392(@NotNull @NotNull String string, double d) {
        double d2;
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"value");
        CharSequence charSequence = string;
        Regex regex = Field17154;
        boolean bl = false;
        if (regex.matches(charSequence)) {
            double d3;
            d2 = d3 = Double.parseDouble(string);
            return d2;
        }
        d2 = d;
        return d2;
    }

    private static String Method7393(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 234;
            cArray2[n] = (char)(cArray[n] ^ (0x1D8A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

