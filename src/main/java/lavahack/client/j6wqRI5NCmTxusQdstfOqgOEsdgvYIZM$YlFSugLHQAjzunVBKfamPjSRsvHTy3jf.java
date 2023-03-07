/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends Enum {
    public static final /* enum */ j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field8165 = new j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("None", (int)((long)-1363594258 ^ (long)-1363594258));
    public static final /* enum */ j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field8166 = new j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Semi", (int)-1060752872L ^ 0xC0C63219);
    public static final /* enum */ j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field8167 = new j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Full", (int)((long)1493708966 ^ (long)1493708967) << 1);
    private static final j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] Field8168;
    private int Field8169;

    public static j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] values() {
        return (j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field8168.clone();
    }

    public static j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf valueOf(String string) {
        return Enum.valueOf(j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
        void var2_-1;
        void var1_-1;
    }

    static {
        j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray = new j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[(int)((long)669583179 ^ (long)669583176)];
        j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)804129969L ^ 0x2FEE0CB1] = Field8165;
        j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)1896250257 ^ (long)1896250256)] = Field8166;
        j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[((int)-534879908L ^ 0xE01E615D) << 1] = Field8167;
        Field8168 = j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
    }

    private static String Method485(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1012059712 ^ (long)-1012059712);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1058638514 ^ (long)1058638413);
            int n2 = (int)-931553889L ^ 0xC8799DD0;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)961276697 ^ (long)961269424) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

