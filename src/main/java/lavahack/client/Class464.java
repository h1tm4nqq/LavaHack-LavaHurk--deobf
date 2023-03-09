/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class464 {
    Field9926,
    Field9927;

    private String Field9929 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private static String Method2177(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 247;
            cArray2[n] = (char)(cArray[n] ^ (0x76BD ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

