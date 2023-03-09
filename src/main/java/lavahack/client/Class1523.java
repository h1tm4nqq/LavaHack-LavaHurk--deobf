/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class1523 {
    Field15115,
    Field15116,
    Field15117,
    Field15118;

    private String Field15120 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private static String Method6055(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 131;
            cArray2[n] = (char)(cArray[n] ^ (0x4385 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

