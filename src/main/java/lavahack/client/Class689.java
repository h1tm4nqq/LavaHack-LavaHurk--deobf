/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class Class689 {
    public static final String Field10908;
    public static final String Field10909;
    private String Field10910 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Field10909 = ".nbt";
        Field10908 = ".schematic";
    }

    private static String Method2900(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 99;
            cArray2[n] = (char)(cArray[n] ^ (0x26AC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

