/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

enum Class1852 {
    Field16532,
    Field16533;

    private int Field16535;

    private static String Method6946(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 97;
            cArray2[n] = (char)(cArray[n] ^ (0x1B94 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

