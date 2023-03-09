/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1368;
import lavahack.client.Class158;
import lavahack.client.Class813;
import org.jetbrains.annotations.NotNull;

class Class2003
extends Class1368 {
    private String Field17187 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class2003(Class158 class158) {
        super("argbuilding", class158);
    }

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        boolean bl = Boolean.parseBoolean(stringArray[1]);
        Class813.Method3421((Class813)this.Method2057(), bl);
        this.Method437("Arg building is now set to: " + bl);
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 39;
            cArray2[n] = (char)(cArray[n] ^ (0x5332 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

