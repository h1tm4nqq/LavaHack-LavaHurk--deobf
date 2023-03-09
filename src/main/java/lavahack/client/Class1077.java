/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class1077 {
    Field12792,
    Field12793,
    Field12794;

    private int Field12796;

    private static String Method4352(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 152;
            cArray2[n] = (char)(cArray[n] ^ (0x734A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

