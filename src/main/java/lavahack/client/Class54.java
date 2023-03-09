/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

enum Class54 {
    Field8165,
    Field8166,
    Field8167;

    private int Field8169;

    private static String Method485(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 79;
            cArray2[n] = (char)(cArray[n] ^ (0x4B52 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

