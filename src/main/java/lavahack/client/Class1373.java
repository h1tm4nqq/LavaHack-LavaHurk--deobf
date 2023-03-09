/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class2054;
import lavahack.client.Class467;

public class Class1373 {
    private String Field14237 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static Class467 Method5471(String string) {
        Class467[] class467Array = Class467.values();
        int n = class467Array.length;
        int n2 = 0;
        while (n2 < n) {
            Class467 class467 = class467Array[n2];
            if (class467.name().equals(string)) {
                return class467;
            }
            ++n2;
        }
        throw new Class2054("Lua: cant resolve number type " + string);
    }

    private static String Method5472(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 135;
            cArray2[n] = (char)(cArray[n] ^ (0x48A5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

