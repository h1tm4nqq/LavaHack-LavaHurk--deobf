/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class1369 {
    Field14228,
    Field14229;

    private int Field14231;

    private static String Method5463(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 153;
            cArray2[n] = (char)(cArray[n] ^ (0x14DD ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

