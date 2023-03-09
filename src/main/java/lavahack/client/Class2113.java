/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.File;
import java.net.URL;
import lavahack.client.Class1368;
import lavahack.client.Class158;
import lavahack.client.Class1617;
import lavahack.client.Class813;

class Class2113
extends Class1368 {
    private String Field17608 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class2113(Class158 class158) {
        super("play", class158);
    }

    @Override
    public void Method443(String string, String[] stringArray) {
        Class813 class813 = (Class813)this.Method2057();
        if (stringArray.length < 2) {
            return;
        }
        if (stringArray[1].equals("file")) {
            if (stringArray.length < 3) {
                return;
            }
            String string2 = Class813.Method3422(class813) ? Class813.Method3423(stringArray, 2) : stringArray[2];
            File file = new File(string2);
            if (!file.exists()) return;
            if (file.isDirectory()) {
                return;
            }
            URL uRL = file.toURI().toURL();
            Class1617.Method6297(uRL.toExternalForm());
            this.Method437("Now playing: " + uRL.toExternalForm());
            return;
        }
        if (stringArray[1].equals("url")) {
            if (stringArray.length < 3) {
                return;
            }
            String string3 = Class813.Method3422(class813) ? Class813.Method3423(stringArray, 2) : stringArray[2];
            URL uRL = new URL(string3);
            Class1617.Method6297(uRL.toExternalForm());
            this.Method437("Now playing: " + uRL.toExternalForm());
            return;
        }
        String string4 = Class813.Method3422(class813) ? Class813.Method3423(stringArray, 1) : stringArray[1];
        Class1617.Method6297(Class813.Method3426(Class813.Method3424()) + string4);
        this.Method437("Now playing: " + Class813.Method3426(Class813.Method3424()) + string4);
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 219;
            cArray2[n] = (char)(cArray[n] ^ (0x4799 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

