/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

enum Class807 {
    Field11442,
    Field11443,
    Field11444;

    private int Field11446;

    private static String Method3404(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 140;
            cArray2[n] = (char)(cArray[n] ^ (0x72C4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

