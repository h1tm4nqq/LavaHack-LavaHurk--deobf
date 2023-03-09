/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class645 {
    Field10783,
    Field10784;

    private int Field10786;

    private static String Method2777(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 17;
            cArray2[n] = (char)(cArray[n] ^ (0x6B97 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

