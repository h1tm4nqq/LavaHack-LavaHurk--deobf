/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

enum Class1356 {
    Field14178,
    Field14179,
    Field14180,
    Field14181,
    Field14182;

    private int Field14184;

    private static String Method5425(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 8;
            cArray2[n] = (char)(cArray[n] ^ (0x39F8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

