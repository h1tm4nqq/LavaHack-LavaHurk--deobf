/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1368;
import lavahack.client.Class158;
import lavahack.client.Class707;
import org.jetbrains.annotations.NotNull;

class Class2059
extends Class1368 {
    private String Field17415 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class2059(@NotNull @NotNull Class158 class158) {
        super("resetconfig", class158);
    }

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        Class707.Method2948(Class707.Method2947(), Class707.Method2947().exists());
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 109;
            cArray2[n] = (char)(cArray[n] ^ (0x3652 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

