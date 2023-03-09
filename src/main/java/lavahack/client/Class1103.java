/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class1103 {
    Field12975,
    Field12976,
    Field12977;

    private String Field12979 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private static String Method4519(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 56;
            cArray2[n] = (char)(cArray[n] ^ (0x366D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

