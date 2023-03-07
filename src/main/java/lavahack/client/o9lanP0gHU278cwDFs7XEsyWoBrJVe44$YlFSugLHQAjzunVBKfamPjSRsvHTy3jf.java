/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class o9lanP0gHU278cwDFs7XEsyWoBrJVe44$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends Enum {
    public static final /* enum */ o9lanP0gHU278cwDFs7XEsyWoBrJVe44$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field9182 = new o9lanP0gHU278cwDFs7XEsyWoBrJVe44$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("None", (int)-1749100880L ^ 0x97BED6B0);
    public static final /* enum */ o9lanP0gHU278cwDFs7XEsyWoBrJVe44$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field9183 = new o9lanP0gHU278cwDFs7XEsyWoBrJVe44$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Client", (int)((long)647009586 ^ (long)647009587));
    public static final /* enum */ o9lanP0gHU278cwDFs7XEsyWoBrJVe44$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field9184 = new o9lanP0gHU278cwDFs7XEsyWoBrJVe44$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Server", (int)((long)-2053004223 ^ (long)-2053004224) << 1);
    private static final o9lanP0gHU278cwDFs7XEsyWoBrJVe44$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] Field9185;
    private String Field9186 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static o9lanP0gHU278cwDFs7XEsyWoBrJVe44$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] values() {
        return (o9lanP0gHU278cwDFs7XEsyWoBrJVe44$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field9185.clone();
    }

    public static o9lanP0gHU278cwDFs7XEsyWoBrJVe44$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf valueOf(String string) {
        return Enum.valueOf(o9lanP0gHU278cwDFs7XEsyWoBrJVe44$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private o9lanP0gHU278cwDFs7XEsyWoBrJVe44$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
        void var2_-1;
        void var1_-1;
    }

    static {
        o9lanP0gHU278cwDFs7XEsyWoBrJVe44$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] o9lanP0gHU278cwDFs7XEsyWoBrJVe44$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray = new o9lanP0gHU278cwDFs7XEsyWoBrJVe44$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[(int)((long)1039987062 ^ (long)1039987061)];
        o9lanP0gHU278cwDFs7XEsyWoBrJVe44$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)220910643L ^ 0xD2AD433] = Field9182;
        o9lanP0gHU278cwDFs7XEsyWoBrJVe44$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)-2079044742 ^ (long)-2079044741)] = Field9183;
        o9lanP0gHU278cwDFs7XEsyWoBrJVe44$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[((int)-1029148969L ^ 0xC2A86ED6) << 1] = Field9184;
        Field9185 = o9lanP0gHU278cwDFs7XEsyWoBrJVe44$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
    }

    private static String Method1439(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)498117255 ^ (long)498117255);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1181897055 ^ (long)-1181897122);
            int n2 = (int)((long)-107272991 ^ (long)-107273078);
            cArray2[n] = (char)(cArray[n] ^ ((int)77836021L ^ 0x4A3C0DA ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

