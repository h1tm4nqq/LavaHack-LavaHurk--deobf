/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

enum Class973 {
    Field12174,
    Field12175;

    private String Field12177 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private static String Method3976(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 140;
            cArray2[n] = (char)(cArray[n] ^ (0x43CE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

