/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class HXnRfDxgW0IDRMY108HeHtXa5GGdRU0k$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV {
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
        int n = (int)((long)-1532306843 ^ (long)-1532306843);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1078895933 ^ (long)-1078896068);
            int n2 = ((int)1052027509L ^ 0x3EB4AA74) << 7;
            cArray2[n] = (char)(cArray[n] ^ ((int)-2010265294L ^ 0x882DA043 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

