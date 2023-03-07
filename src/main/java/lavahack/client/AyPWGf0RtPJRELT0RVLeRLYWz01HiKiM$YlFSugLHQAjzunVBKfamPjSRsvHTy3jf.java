/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends Enum {
    public static final /* enum */ AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field9697 = new AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("UNBREAKABLE", (int)((long)-815128352 ^ (long)-815128352));
    public static final /* enum */ AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field9698 = new AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("RESISTANT", (int)((long)-1040109405 ^ (long)-1040109406));
    public static final /* enum */ AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field9699 = new AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("BREAKABLE", (int)((long)317001342 ^ (long)317001343) << 1);
    private static final AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] Field9700;
    private int Field9701;

    public static AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] values() {
        return (AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field9700.clone();
    }

    public static AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf valueOf(String string) {
        return Enum.valueOf(AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
        void var2_-1;
        void var1_-1;
    }

    static {
        AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray = new AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[(int)((long)-1343490230 ^ (long)-1343490231)];
        ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)-1783126909 ^ (long)-1783126909)] = Field9697;
        ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)-1080914390 ^ (long)-1080914389)] = Field9698;
        ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)-566377602 ^ (long)-566377601) << 1] = Field9699;
        Field9700 = ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
    }

    private static String Method1998(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1825886868 ^ (long)1825886868);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1585125860L ^ 0xA184E6E3);
            int n2 = (int)((long)887139907 ^ (long)887139922) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-793214723 ^ (long)-793192332) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

