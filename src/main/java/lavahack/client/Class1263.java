/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

enum Class1263 {
    Field13712,
    Field13713;

    private String Field13715 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private static String Method5096(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 236;
            cArray2[n] = (char)(cArray[n] ^ (0x4FEB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

