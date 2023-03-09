/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

enum Class81 {
    Field8270,
    Field8271,
    Field8272,
    Field8273,
    Field8274,
    Field8275;

    private String Field8277 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private static String Method728(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 1;
            cArray2[n] = (char)(cArray[n] ^ (0x5110 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

