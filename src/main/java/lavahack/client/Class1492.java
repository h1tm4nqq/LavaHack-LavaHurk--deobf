/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class1492 {
    Field14977,
    Field14978;

    private String Field14980 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private static String Method5972(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 70;
            cArray2[n] = (char)(cArray[n] ^ (0x561 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

