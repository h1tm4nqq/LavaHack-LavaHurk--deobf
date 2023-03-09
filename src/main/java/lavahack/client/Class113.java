/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class113 {
    Field8392,
    Field8393,
    Field8394,
    Field8395;

    private String Field8397 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private static String Method828(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 94;
            cArray2[n] = (char)(cArray[n] ^ (0x100 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

