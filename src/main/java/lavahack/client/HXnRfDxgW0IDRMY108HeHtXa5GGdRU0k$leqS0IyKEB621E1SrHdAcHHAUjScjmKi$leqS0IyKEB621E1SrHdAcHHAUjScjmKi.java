/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class HXnRfDxgW0IDRMY108HeHtXa5GGdRU0k$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
    public static final String Field9290 = "schematicaDownload";
    private String Field9291 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private static String Method1556(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1180887377 ^ (long)1180887377);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-822104118 ^ (long)-822104267);
            int n2 = (int)1161721513L ^ 0x453E76E0;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1354838118 ^ (long)1354840277) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

