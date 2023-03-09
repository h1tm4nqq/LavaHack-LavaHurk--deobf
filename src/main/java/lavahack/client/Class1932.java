/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

enum Class1932 {
    Field16958,
    Field16959,
    Field16960,
    Field16961;

    private String Field16963 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private static String Method7188(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 180;
            cArray2[n] = (char)(cArray[n] ^ (0x26A9 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

