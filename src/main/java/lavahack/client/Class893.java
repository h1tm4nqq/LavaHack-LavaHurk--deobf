/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class893 {
    Field11739,
    Field11740,
    Field11741;

    private int Field11743;

    private static String Method3721(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 91;
            cArray2[n] = (char)(cArray[n] ^ (0x1073 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

