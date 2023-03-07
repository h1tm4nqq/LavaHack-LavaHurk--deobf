/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends Enum {
    public static final /* enum */ t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field13433 = new t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("None", (int)((long)-1645469917 ^ (long)-1645469917));
    public static final /* enum */ t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field13434 = new t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Millis", (int)((long)-479222352 ^ (long)-479222351));
    public static final /* enum */ t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field13435 = new t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Ticks", ((int)-417577322L ^ 0xE71C4697) << 1);
    private static final t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] Field13436;
    private String Field13437 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] values() {
        return (t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field13436.clone();
    }

    public static t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf valueOf(String string) {
        return Enum.valueOf(t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
        void var2_-1;
        void var1_-1;
    }

    static {
        t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray = new t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[(int)-2126734674L ^ 0x813C9AAD];
        t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)-1552389563L ^ 0xA3786A45] = Field13433;
        t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)647664827 ^ (long)647664826)] = Field13434;
        t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[((int)-224459481L ^ 0xF29F0526) << 1] = Field13435;
        Field13436 = t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
    }

    private static String Method4829(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-672701750L ^ 0xD7E762CA;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1826031536L ^ 0x6CD7074F);
            int n2 = (int)-1925444018L ^ 0x8D3C0E77;
            cArray2[n] = (char)(cArray[n] ^ ((int)589250927L ^ 0x231F1BBC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

