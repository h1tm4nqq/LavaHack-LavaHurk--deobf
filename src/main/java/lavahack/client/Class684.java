/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class684 {
    Field10896,
    Field10897;

    private String Field10899 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static Class684 Method2878(boolean bl) {
        Class684 class684;
        if (bl) {
            class684 = Field10896;
            return class684;
        }
        class684 = Field10897;
        return class684;
    }

    private static String Method2879(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 208;
            cArray2[n] = (char)(cArray[n] ^ (0x752C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

