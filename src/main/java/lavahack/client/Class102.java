/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class102 {
    Field8354,
    Field8355;

    private String Field8357 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private static String Method814(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 133;
            cArray2[n] = (char)(cArray[n] ^ (0x53DC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

