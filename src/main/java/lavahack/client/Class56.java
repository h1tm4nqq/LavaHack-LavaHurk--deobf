/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class56 {
    Field8174,
    Field8175,
    Field8176,
    Field8177;

    private String Field8179 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private static String Method487(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 49;
            cArray2[n] = (char)(cArray[n] ^ (0x334E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

