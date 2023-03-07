/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;

public class cBm4iVtWT7prVJoaqH884vu4ZYKZDYms
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private int Field13265;

    public cBm4iVtWT7prVJoaqH884vu4ZYKZDYms() {
        super("NoMove", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1632352410 ^ (long)-1632352410);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1363892111L ^ 0xAEB4A88E);
            int n2 = (int)((long)1927305771 ^ (long)1927305784) << 3;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1296405664L ^ 0xB2BA4567) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

