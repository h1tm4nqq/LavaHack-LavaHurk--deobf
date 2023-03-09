/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class1311 {
    Field14032,
    Field14033,
    Field14034;

    private String Field14036 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private static String Method5342(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 207;
            cArray2[n] = (char)(cArray[n] ^ (0x19C4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

