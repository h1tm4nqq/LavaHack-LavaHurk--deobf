/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class1430 {
    Field14681,
    Field14682;

    private int Field14684;

    private static String Method5717(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 20;
            cArray2[n] = (char)(cArray[n] ^ (0x294B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

