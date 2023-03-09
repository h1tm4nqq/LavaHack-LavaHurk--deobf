/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

enum Class1618 {
    Field15570,
    Field15571;

    private int Field15573;

    private static String Method6305(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 136;
            cArray2[n] = (char)(cArray[n] ^ (0x1091 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

