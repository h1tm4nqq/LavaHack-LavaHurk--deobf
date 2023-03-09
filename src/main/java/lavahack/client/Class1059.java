/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.ArrayList;
import lavahack.client.Class1182;
import lavahack.client.Class1393;
import lavahack.client.Class158;
import lavahack.client.Class1796;
import lavahack.client.Class42;
import org.jetbrains.annotations.NotNull;

public class Class1059
extends Class158 {
    private String Field12678 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1059() {
        super("setting");
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
        if (stringArray.length < 2) {
            Class1393.Method5504().Method1882("Not enough arguments: " + stringArray.length);
            return;
        }
        Class42 class42 = Class1796.Field16241.Field16254.Method1162(stringArray[0]);
        if (class42 == null) {
            Class1393.Method5504().Method1882("Could not find module: " + stringArray[0]);
            return;
        }
        ArrayList arrayList = Class1796.Field16241.Field16258.Method7571(class42);
        Class1182 class1182 = new Class1182(class42, arrayList);
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 72;
            cArray2[n] = (char)(cArray[n] ^ (0x4F7E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

