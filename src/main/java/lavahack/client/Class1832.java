/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

enum Class1832 {
    Field16467,
    Field16468,
    Field16469;

    private String Field16471 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private static String Method6900(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 71;
            cArray2[n] = (char)(cArray[n] ^ (0x4BF4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

