/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1368;
import lavahack.client.Class1393;
import lavahack.client.Class158;
import org.jetbrains.annotations.NotNull;

class Class1291
extends Class1368 {
    private int Field13889;

    public Class1291(@NotNull @NotNull Class158 class158) {
        super("fmt", class158);
    }

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        Class1393.Method5505().Method1892("To be implemented");
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 124;
            cArray2[n] = (char)(cArray[n] ^ (0x8E8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

