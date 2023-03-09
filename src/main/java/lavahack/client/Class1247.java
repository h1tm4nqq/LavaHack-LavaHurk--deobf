/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

enum Class1247 {
    Field13648,
    Field13649;

    private int Field13651;

    private static String Method5012(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 161;
            cArray2[n] = (char)(cArray[n] ^ (0x445 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

