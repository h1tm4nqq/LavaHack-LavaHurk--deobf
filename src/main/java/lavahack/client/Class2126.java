/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class2126 {
    Field17673,
    Field17674,
    Field17675;

    private int Field17677;

    private static String Method7664(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 244;
            cArray2[n] = (char)(cArray[n] ^ (0x2FED ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

