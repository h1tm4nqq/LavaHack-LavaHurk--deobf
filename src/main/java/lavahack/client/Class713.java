/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

enum Class713 {
    Field11035,
    Field11036;

    private String Field11038 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private static String Method2979(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 52;
            cArray2[n] = (char)(cArray[n] ^ (0x5D4A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

