/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

enum Class310 {
    Field9318,
    Field9319,
    Field9320;

    private int Field9322;

    private static String Method1588(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 31;
            cArray2[n] = (char)(cArray[n] ^ (0x4923 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

