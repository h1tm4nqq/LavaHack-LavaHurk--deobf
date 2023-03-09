/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class2140 {
    Field17791,
    Field17792,
    Field17793;

    private int Field17795;

    private static String Method7711(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 118;
            cArray2[n] = (char)(cArray[n] ^ (0x7189 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

