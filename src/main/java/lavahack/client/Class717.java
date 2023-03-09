/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

enum Class717 {
    Field11066,
    Field11067,
    Field11068,
    Field11069;

    private int Field11071;

    private static String Method3007(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 188;
            cArray2[n] = (char)(cArray[n] ^ (0x5498 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

