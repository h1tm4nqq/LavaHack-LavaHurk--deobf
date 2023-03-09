/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

enum Class1844 {
    Field16501,
    Field16502,
    Field16503,
    Field16504,
    Field16505,
    Field16506;

    private String Field16508 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private static String Method6939(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 90;
            cArray2[n] = (char)(cArray[n] ^ (0x5CA3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

