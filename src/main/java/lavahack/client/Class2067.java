/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.net.URL;
import java.net.URLConnection;

public class Class2067 {
    private String Field17440 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static boolean Method7582(String string) {
        URLConnection uRLConnection = new URL(string).openConnection();
        uRLConnection.connect();
        return true;
    }

    private static String Method7583(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 75;
            cArray2[n] = (char)(cArray[n] ^ (0x1B56 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

