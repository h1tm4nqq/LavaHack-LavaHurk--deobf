/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class8 {
    Field7857,
    Field7858,
    Field7859;

    private int Field7861;

    private static String Method99(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 189;
            cArray2[n] = (char)(cArray[n] ^ (0x659E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

