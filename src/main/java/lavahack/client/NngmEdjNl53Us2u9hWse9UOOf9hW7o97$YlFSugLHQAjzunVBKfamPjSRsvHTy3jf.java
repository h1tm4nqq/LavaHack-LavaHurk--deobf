/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class NngmEdjNl53Us2u9hWse9UOOf9hW7o97$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends Enum {
    public static final /* enum */ NngmEdjNl53Us2u9hWse9UOOf9hW7o97$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field15115 = new NngmEdjNl53Us2u9hWse9UOOf9hW7o97$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("AIR", (int)((long)1968751230 ^ (long)1968751230));
    public static final /* enum */ NngmEdjNl53Us2u9hWse9UOOf9hW7o97$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field15116 = new NngmEdjNl53Us2u9hWse9UOOf9hW7o97$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("SURROUNDED", (int)1034195689L ^ 0x3DA492E8);
    public static final /* enum */ NngmEdjNl53Us2u9hWse9UOOf9hW7o97$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field15117 = new NngmEdjNl53Us2u9hWse9UOOf9hW7o97$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("PERSISTENT", ((int)-1342223900L ^ 0xAFFF49E5) << 1);
    public static final /* enum */ NngmEdjNl53Us2u9hWse9UOOf9hW7o97$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field15118 = new NngmEdjNl53Us2u9hWse9UOOf9hW7o97$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("ToggleAfterComplete", (int)693376740L ^ 0x295416E7);
    private static final NngmEdjNl53Us2u9hWse9UOOf9hW7o97$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] Field15119;
    private String Field15120 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static NngmEdjNl53Us2u9hWse9UOOf9hW7o97$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] values() {
        return (NngmEdjNl53Us2u9hWse9UOOf9hW7o97$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field15119.clone();
    }

    public static NngmEdjNl53Us2u9hWse9UOOf9hW7o97$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf valueOf(String string) {
        return Enum.valueOf(NngmEdjNl53Us2u9hWse9UOOf9hW7o97$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private NngmEdjNl53Us2u9hWse9UOOf9hW7o97$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
        void var2_-1;
        void var1_-1;
    }

    static {
        NngmEdjNl53Us2u9hWse9UOOf9hW7o97$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] nngmEdjNl53Us2u9hWse9UOOf9hW7o97$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray = new NngmEdjNl53Us2u9hWse9UOOf9hW7o97$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[(int)((long)171858791 ^ (long)171858790) << 2];
        nngmEdjNl53Us2u9hWse9UOOf9hW7o97$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)-1488683290L ^ 0xA7447EE6] = Field15115;
        nngmEdjNl53Us2u9hWse9UOOf9hW7o97$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)-195713480L ^ 0xF455A639] = Field15116;
        nngmEdjNl53Us2u9hWse9UOOf9hW7o97$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[((int)-68842505L ^ 0xFBE58BF6) << 1] = Field15117;
        nngmEdjNl53Us2u9hWse9UOOf9hW7o97$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)478619933L ^ 0x1C87291E] = Field15118;
        Field15119 = nngmEdjNl53Us2u9hWse9UOOf9hW7o97$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
    }

    private static String Method6055(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1789048000 ^ (long)-1789048000);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)784638114 ^ (long)784638045);
            int n2 = (int)-223253289L ^ 0xF2B16C54;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1976802235L ^ 0x8A2C27C0 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

