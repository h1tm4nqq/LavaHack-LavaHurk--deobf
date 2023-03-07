/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class HXnRfDxgW0IDRMY108HeHtXa5GGdRU0k$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV {
    public static final String Field9783 = "schematicaReplace";
    private String Field9784 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private static String Method2056(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)2101612929L ^ 0x7D441181;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-172118099 ^ (long)-172118190);
            int n2 = (int)((long)2119713293 ^ (long)2119713396) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)2143821350 ^ (long)2143826877) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

