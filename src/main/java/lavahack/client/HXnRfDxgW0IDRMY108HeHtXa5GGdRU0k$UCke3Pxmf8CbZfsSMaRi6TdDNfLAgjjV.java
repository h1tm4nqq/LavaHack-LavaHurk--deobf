/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class HXnRfDxgW0IDRMY108HeHtXa5GGdRU0k$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV {
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
        int n = (int)-409964152L ^ 0xE7907188;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1352597477 ^ (long)1352597274);
            int n2 = (int)-1383785051L ^ 0xAD851DC6;
            cArray2[n] = (char)(cArray[n] ^ (((int)1706951496L ^ 0x65BE0AE3) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

