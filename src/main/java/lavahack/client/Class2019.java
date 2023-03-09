/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

enum Class2019 {
    Field17291,
    Field17292,
    Field17293;

    private String Field17295 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private static String Method7479(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 20;
            cArray2[n] = (char)(cArray[n] ^ (0x2DCE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

