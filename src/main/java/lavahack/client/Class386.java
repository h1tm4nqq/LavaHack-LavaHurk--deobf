/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

enum Class386 {
    Field9616,
    Field9617,
    Field9618;

    private String Field9620 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private static String Method1863(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 162;
            cArray2[n] = (char)(cArray[n] ^ (0xF94 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

