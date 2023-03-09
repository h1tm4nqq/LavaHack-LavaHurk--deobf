/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class437 {
    Field9828,
    Field9829;

    private int Field9831;

    private static String Method2083(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 106;
            cArray2[n] = (char)(cArray[n] ^ (0x2744 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

