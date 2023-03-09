/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class410 {
    Field9697,
    Field9698,
    Field9699;

    private int Field9701;

    private static String Method1998(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 68;
            cArray2[n] = (char)(cArray[n] ^ (0x5889 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

