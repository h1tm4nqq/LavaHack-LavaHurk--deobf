/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class1010 {
    Field12390,
    Field12391,
    Field12392,
    Field12393;

    private int Field12395;

    private static String Method4120(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 162;
            cArray2[n] = (char)(cArray[n] ^ (0x2646 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

