/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.net.URL;
import java.net.URLConnection;

public class qjHQHUR6cDqJfxr2NHumjHRmiw9YFUmu {
    private String Field17440 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static boolean Method7582(String string) {
        URLConnection uRLConnection = new URL(string).openConnection();
        uRLConnection.connect();
        return ((int)-19241259L ^ 0xFEDA66D4) != 0;
    }

    private static String Method7583(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)608602907L ^ 0x24468B1B;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)197130820L ^ 0xBBFFABB);
            int n2 = (int)1820067044L ^ 0x6C7C04AF;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1903835934L ^ 0x8E85C949) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

