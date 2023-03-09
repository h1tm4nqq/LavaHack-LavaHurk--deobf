/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class788 {
    Field11330,
    Field11331,
    Field11332,
    Field11333;

    private String Field11335 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private static String Method3279(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 193;
            cArray2[n] = (char)(cArray[n] ^ (0x3C2E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

