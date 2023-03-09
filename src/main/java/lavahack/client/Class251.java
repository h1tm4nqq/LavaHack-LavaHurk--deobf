/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class251 {
    Field9120,
    Field9121;

    private int Field9123;

    private static String Method1365(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 44;
            cArray2[n] = (char)(cArray[n] ^ (0x47C0 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

