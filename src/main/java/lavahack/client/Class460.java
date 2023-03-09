/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.awt.Desktop;
import lavahack.client.Class1368;
import lavahack.client.Class158;
import lavahack.client.Class707;
import org.jetbrains.annotations.NotNull;

class Class460
extends Class1368 {
    private int Field9908;

    public Class460(@NotNull @NotNull Class158 class158) {
        super("config", class158);
    }

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        if (!Class707.Method2947().exists()) {
            Class707.Method2948(Class707.Method2947(), false);
        }
        Desktop.getDesktop().open(Class707.Method2947());
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 193;
            cArray2[n] = (char)(cArray[n] ^ (0x2C73 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

