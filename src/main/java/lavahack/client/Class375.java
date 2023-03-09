/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1393;
import lavahack.client.Class158;
import lavahack.client.Class1796;
import org.jetbrains.annotations.NotNull;

public class Class375
extends Class158 {
    private String Field9581 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class375() {
        super("modcount");
    }

    @Override
    public String Method447() {
        return null;
    }

    @Override
    public String Method448() {
        return null;
    }

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        Class1393.Method5505().Method1892("LavaHack has " + Class1796.Field16241.Field16254.Field8854.size() + " modules");
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 218;
            cArray2[n] = (char)(cArray[n] ^ (0x459 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

