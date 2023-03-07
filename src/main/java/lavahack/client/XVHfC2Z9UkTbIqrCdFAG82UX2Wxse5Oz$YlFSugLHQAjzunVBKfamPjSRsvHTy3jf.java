/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends Enum {
    public static final /* enum */ XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field17534 = new XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Simple", (int)((long)-1220733405 ^ (long)-1220733405));
    public static final /* enum */ XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field17535 = new XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("CSGO", (int)((long)47124953 ^ (long)47124952));
    public static final /* enum */ XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field17536 = new XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Image", (int)((long)-717652280 ^ (long)-717652279) << 1);
    public static final /* enum */ XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field17537 = new XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("GishCode", (int)((long)96517076 ^ (long)96517079));
    private static final XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] Field17538;
    private String Field17539 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] values() {
        return (XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field17538.clone();
    }

    public static XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf valueOf(String string) {
        return Enum.valueOf(XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
        void var2_-1;
        void var1_-1;
    }

    static {
        XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] xVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray = new XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[((int)1549188264L ^ 0x5C56BCA9) << 2];
        xVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)1677422082 ^ (long)1677422082)] = Field17534;
        xVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)-1590427085L ^ 0xA1340232] = Field17535;
        xVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[((int)-674839385L ^ 0xD7C6C4A6) << 1] = Field17536;
        xVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)-1781643626 ^ (long)-1781643627)] = Field17537;
        Field17538 = xVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
    }

    private static String Method7630(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-33969167 ^ (long)-33969167);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1673218808L ^ 0x9C44B5F7);
            int n2 = (int)((long)-1635755047 ^ (long)-1635755208);
            cArray2[n] = (char)(cArray[n] ^ ((int)1920329255L ^ 0x7275D4EC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

