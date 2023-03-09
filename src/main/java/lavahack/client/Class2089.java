/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class2089 {
    Field17534,
    Field17535,
    Field17536,
    Field17537;

    private String Field17539 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private static String Method7630(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 225;
            cArray2[n] = (char)(cArray[n] ^ (0x32CB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

