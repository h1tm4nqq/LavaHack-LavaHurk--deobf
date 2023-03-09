/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Map;
import lavahack.client.Class158;
import lavahack.client.Class278;
import lavahack.client.Class769;
import org.jetbrains.annotations.NotNull;

public class Class809
extends Class158 {
    private int Field11451;

    public Class809() {
        super("lang");
    }

    @Override
    public String Method447() {
        return "";
    }

    @Override
    public String Method448() {
        return "lang <language>";
    }

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        Map map = Class278.Method1471();
        System.out.println(map);
        String string2 = Class278.Method1475(map, stringArray[1]);
        if (string2 != null) {
            Class769.Field11262 = string2;
            this.Method437("Set target language to " + (String)map.get(string2));
            return;
        }
        this.Method438("Could not find language");
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 48;
            cArray2[n] = (char)(cArray[n] ^ (0x7D36 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

