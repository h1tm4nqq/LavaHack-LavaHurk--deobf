/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class1177 {
    Field13303,
    Field13304,
    Field13305;

    private String Field13307 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private static String Method4738(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 73;
            cArray2[n] = (char)(cArray[n] ^ (0x45CC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

