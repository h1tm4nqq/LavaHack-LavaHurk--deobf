/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

enum Class596 {
    Field10536,
    Field10537,
    Field10538;

    private int Field10540;

    private static String Method2580(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 238;
            cArray2[n] = (char)(cArray[n] ^ (0x3459 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

