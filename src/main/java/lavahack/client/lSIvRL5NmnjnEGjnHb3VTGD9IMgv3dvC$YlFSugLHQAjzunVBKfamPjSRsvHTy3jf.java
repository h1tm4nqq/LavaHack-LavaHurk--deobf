/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends Enum {
    public static final /* enum */ lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field11739 = new lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("NORMAL", (int)((long)-1521629968 ^ (long)-1521629968));
    public static final /* enum */ lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field11740 = new lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("PACKET", (int)((long)-722357659 ^ (long)-722357660));
    public static final /* enum */ lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field11741 = new lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("NONE", (int)((long)-1513092360 ^ (long)-1513092359) << 1);
    private static final lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] Field11742;
    private int Field11743;

    public static lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] values() {
        return (lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field11742.clone();
    }

    public static lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf valueOf(String string) {
        return Enum.valueOf(lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
        void var2_-1;
        void var1_-1;
    }

    static {
        lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray = new lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[(int)((long)-8571735 ^ (long)-8571734)];
        lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)295501169L ^ 0x119CFD71] = Field11739;
        lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)-240864174L ^ 0xF1A4B453] = Field11740;
        lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)1393779386 ^ (long)1393779387) << 1] = Field11741;
        Field11742 = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
    }

    private static String Method3721(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)201985159 ^ (long)201985159);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1694700460L ^ 0x65031353);
            int n2 = (int)-2080116924L ^ 0x8403EF1F;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-139909009 ^ (long)-139904996) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

