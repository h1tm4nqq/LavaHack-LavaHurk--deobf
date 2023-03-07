/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class auE3dCySxyIc1tKngAVuALlcvYBWsMni$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends Enum {
    public static final /* enum */ auE3dCySxyIc1tKngAVuALlcvYBWsMni$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field8329 = new auE3dCySxyIc1tKngAVuALlcvYBWsMni$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("INTERMEDIARY", (int)2052196606L ^ 0x7A5208FE);
    public static final /* enum */ auE3dCySxyIc1tKngAVuALlcvYBWsMni$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field8330 = new auE3dCySxyIc1tKngAVuALlcvYBWsMni$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("NAMED", (int)-1448573559L ^ 0xA9A88588);
    public static final /* enum */ auE3dCySxyIc1tKngAVuALlcvYBWsMni$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field8331 = new auE3dCySxyIc1tKngAVuALlcvYBWsMni$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("OFFICIAL", ((int)629763021L ^ 0x25896BCC) << 1);
    private static final auE3dCySxyIc1tKngAVuALlcvYBWsMni$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] Field8332;
    private String Field8333 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static auE3dCySxyIc1tKngAVuALlcvYBWsMni$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] values() {
        return (auE3dCySxyIc1tKngAVuALlcvYBWsMni$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field8332.clone();
    }

    public static auE3dCySxyIc1tKngAVuALlcvYBWsMni$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf valueOf(String string) {
        return Enum.valueOf(auE3dCySxyIc1tKngAVuALlcvYBWsMni$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private auE3dCySxyIc1tKngAVuALlcvYBWsMni$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
        void var2_-1;
        void var1_-1;
    }

    static {
        auE3dCySxyIc1tKngAVuALlcvYBWsMni$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] auE3dCySxyIc1tKngAVuALlcvYBWsMni$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray = new auE3dCySxyIc1tKngAVuALlcvYBWsMni$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[(int)((long)-1547983844 ^ (long)-1547983841)];
        auE3dCySxyIc1tKngAVuALlcvYBWsMni$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)1399915805 ^ (long)1399915805)] = Field8329;
        auE3dCySxyIc1tKngAVuALlcvYBWsMni$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)421016303 ^ (long)421016302)] = Field8330;
        auE3dCySxyIc1tKngAVuALlcvYBWsMni$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)-1348117789 ^ (long)-1348117790) << 1] = Field8331;
        Field8332 = auE3dCySxyIc1tKngAVuALlcvYBWsMni$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
    }

    private static String Method802(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-715258114 ^ (long)-715258114);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1785994051L ^ 0x6A741BBC);
            int n2 = ((int)-1404842976L ^ 0xAC43CC53) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)976616037L ^ 0x3A35C6DA) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

