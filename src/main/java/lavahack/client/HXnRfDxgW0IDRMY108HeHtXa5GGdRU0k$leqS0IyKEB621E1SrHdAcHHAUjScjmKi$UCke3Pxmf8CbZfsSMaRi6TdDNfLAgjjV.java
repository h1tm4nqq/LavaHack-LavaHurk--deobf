/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class HXnRfDxgW0IDRMY108HeHtXa5GGdRU0k$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV {
    public static final String Field12205 = "schematicaRemove";
    private String Field12206 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private static String Method3995(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1022793891 ^ (long)1022793891);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1514069938L ^ 0xA5C120B1);
            int n2 = ((int)-1681052940L ^ 0x9BCD2AEB) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1714792290L ^ 0x99CA3FF9 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

