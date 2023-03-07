/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends Enum {
    public static final /* enum */ nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field12792 = new nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Before", (int)((long)-1383998221 ^ (long)-1383998221));
    public static final /* enum */ nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field12793 = new nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("After", (int)((long)-642650225 ^ (long)-642650226));
    public static final /* enum */ nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field12794 = new nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Both", ((int)501423917L ^ 0x1DE31F2C) << 1);
    private static final nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] Field12795;
    private int Field12796;

    public static nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] values() {
        return (nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field12795.clone();
    }

    public static nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf valueOf(String string) {
        return Enum.valueOf(nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
        void var2_-1;
        void var1_-1;
    }

    static {
        nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray = new nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[(int)998092394L ^ 0x3B7DAE69];
        nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)-410225400 ^ (long)-410225400)] = Field12792;
        nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)1438867076L ^ 0x55C35E85] = Field12793;
        nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)1328005263 ^ (long)1328005262) << 1] = Field12794;
        Field12795 = nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
    }

    private static String Method4352(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-383849684 ^ (long)-383849684);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-214017575L ^ 0xF33E5926);
            int n2 = ((int)-425090243L ^ 0xE6A9A32E) << 3;
            cArray2[n] = (char)(cArray[n] ^ (((int)-278948820L ^ 0xEF5FAD89) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

