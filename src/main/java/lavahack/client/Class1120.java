/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class1120 {
    Field13036,
    Field13037,
    Field13038;

    private int Field13040;

    private static String Method4568(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 0;
            cArray2[n] = (char)(cArray[n] ^ (0x1267 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

