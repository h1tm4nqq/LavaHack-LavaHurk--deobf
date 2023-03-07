/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class HXnRfDxgW0IDRMY108HeHtXa5GGdRU0k$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf {
    public static final String Field16536 = "schematicaList";
    private int Field16537;

    private static String Method6947(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1282251547 ^ (long)-1282251547);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)354148261L ^ 0x151BDF5A);
            int n2 = (int)((long)791514440 ^ (long)791514437) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-71466690 ^ (long)-71463431) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

