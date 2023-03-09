/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class984 {
    Field12207,
    Field12208,
    Field12209,
    Field12210;

    private int Field12212;

    private static String Method3996(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 83;
            cArray2[n] = (char)(cArray[n] ^ (0x6E26 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

