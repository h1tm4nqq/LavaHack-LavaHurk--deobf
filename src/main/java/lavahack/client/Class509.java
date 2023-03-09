/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1368;
import lavahack.client.Class158;
import lavahack.client.Class1617;

class Class509
extends Class1368 {
    private String Field10145 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class509(Class158 class158) {
        super("volume", class158);
    }

    @Override
    public void Method443(String string, String[] stringArray) {
        if (stringArray.length < 2) {
            return;
        }
        int n = Integer.parseInt(stringArray[1]);
        Class1617.Method6303(n);
        this.Method437("Set music volume to: " + n);
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 160;
            cArray2[n] = (char)(cArray[n] ^ (0x787D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

