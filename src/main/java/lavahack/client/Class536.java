/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class536 {
    Field10262,
    Field10263,
    Field10264;

    private int Field10266;

    private static String Method2428(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 203;
            cArray2[n] = (char)(cArray[n] ^ (0x2771 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

