/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

enum Class727 {
    Field11089,
    Field11090;

    private int Field11092;

    private static String Method3045(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 35;
            cArray2[n] = (char)(cArray[n] ^ (0x3EDC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

