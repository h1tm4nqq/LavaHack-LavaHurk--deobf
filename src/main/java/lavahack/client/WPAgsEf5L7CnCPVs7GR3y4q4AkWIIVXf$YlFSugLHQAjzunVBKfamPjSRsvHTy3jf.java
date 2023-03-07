/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends Enum {
    public static final /* enum */ WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field10783 = new WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Cube", (int)1208255061L ^ 0x48048255);
    public static final /* enum */ WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field10784 = new WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Glass", (int)((long)961968384 ^ (long)961968385));
    private static final WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] Field10785;
    private int Field10786;

    public static WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] values() {
        return (WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field10785.clone();
    }

    public static WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf valueOf(String string) {
        return Enum.valueOf(WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
        void var2_-1;
        void var1_-1;
    }

    static {
        WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] wPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray = new WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[((int)-2043952557L ^ 0x862BC252) << 1];
        wPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)-220254523 ^ (long)-220254523)] = Field10783;
        wPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)-100326729 ^ (long)-100326730)] = Field10784;
        Field10785 = wPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
    }

    private static String Method2777(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-116957966 ^ (long)-116957966);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1795805279 ^ (long)-1795805346);
            int n2 = (int)((long)215179240 ^ (long)215179257);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-680369984 ^ (long)-680391849) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

