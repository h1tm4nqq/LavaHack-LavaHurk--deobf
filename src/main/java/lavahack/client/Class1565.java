/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1368;
import lavahack.client.Class158;
import lavahack.client.Class1617;

class Class1565
extends Class1368 {
    private int Field15296;

    public Class1565(Class158 class158) {
        super("resume", class158);
    }

    @Override
    public void Method443(String string, String[] stringArray) {
        Class1617.Method6296();
        this.Method437("Resumed the music");
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 93;
            cArray2[n] = (char)(cArray[n] ^ (0x4959 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

