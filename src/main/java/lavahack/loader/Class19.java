/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

import lavahack.loader.Class45;
import lavahack.loader.Class587;

public class Class19
extends Class587
implements Class45 {
    private String Field7903 = "*";
    private String Field7904 = "TheKisDevs & LavaHack Development owns you";

    @Override
    public void Method187(String string) {
        if (string == null) {
            throw new IllegalArgumentException("http resource descriptor must not be null");
        }
        this.Field7903 = string;
    }

    @Override
    public String Method186() {
        return this.Field7903;
    }

    private static String Method185(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 149;
            cArray2[n] = (char)(cArray[n] ^ (0x6AD0 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

