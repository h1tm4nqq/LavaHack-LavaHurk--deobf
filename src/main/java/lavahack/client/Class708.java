/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class708 {
    Field11018,
    Field11019;

    private int Field11021;

    private static String Method2949(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 88;
            cArray2[n] = (char)(cArray[n] ^ (0x551E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

