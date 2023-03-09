/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class Class1476 {
    public static final String Field14882;
    public static final String Field14883;
    public static final String Field14884;
    public static final String Field14885;
    private String Field14886 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Field14885 = "schematica.format.invalid";
        Field14884 = "schematica.format.structure";
        Field14883 = "schematica.format.alpha";
        Field14882 = "schematica.format.classic";
    }

    private static String Method5917(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 128;
            cArray2[n] = (char)(cArray[n] ^ (0x6971 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

