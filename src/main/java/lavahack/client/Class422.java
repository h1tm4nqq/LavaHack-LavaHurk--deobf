/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class422 {
    Field9768,
    Field9769,
    Field9770,
    Field9771;

    private int Field9773;

    private static String Method2053(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 154;
            cArray2[n] = (char)(cArray[n] ^ (0x6D27 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

