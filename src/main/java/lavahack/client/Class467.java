/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Locale;
import java.util.function.Function;
import lavahack.client.Class182;

public enum Class467 {
    Field9942(number -> String.format(Locale.ENGLISH, "%.1f%%", Float.valueOf(number.floatValue()))),
    Field9943(number -> Class182.Field8796.Method1102(number.longValue())),
    Field9944(number -> String.format(Locale.ENGLISH, "%.4f", Float.valueOf(number.floatValue()))),
    Field9945(number -> Long.toString(number.longValue()));

    private Function Field9946;
    private int Field9948;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class467() {
        void var3_1;
        this.Field9946 = var3_1;
    }

    public Function Method2190() {
        return this.Field9946;
    }

    private static String Method2195(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 229;
            cArray2[n] = (char)(cArray[n] ^ (0x25DB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

