/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

enum Class1237 {
    Field13608,
    Field13609,
    Field13610;

    private String Field13612 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private static String Method4964(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 85;
            cArray2[n] = (char)(cArray[n] ^ (0x4489 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

