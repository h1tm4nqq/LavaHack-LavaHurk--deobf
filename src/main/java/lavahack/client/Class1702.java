/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class1702 {
    Field15881,
    Field15882,
    Field15883,
    Field15884;

    private int Field15886;

    private static String Method6528(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 98;
            cArray2[n] = (char)(cArray[n] ^ (0x5293 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

