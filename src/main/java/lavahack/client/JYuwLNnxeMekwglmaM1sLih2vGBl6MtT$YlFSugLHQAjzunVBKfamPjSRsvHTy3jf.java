/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends Enum {
    public static final /* enum */ JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field9616 = new JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("None", (int)((long)-1144251199 ^ (long)-1144251199));
    public static final /* enum */ JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field9617 = new JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Strict", (int)((long)-110152908 ^ (long)-110152907));
    public static final /* enum */ JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field9618 = new JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Ticks", ((int)-1051178490L ^ 0xC1584A07) << 1);
    private static final JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] Field9619;
    private String Field9620 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] values() {
        return (JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field9619.clone();
    }

    public static JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf valueOf(String string) {
        return Enum.valueOf(JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
        void var2_-1;
        void var1_-1;
    }

    static {
        JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] jYuwLNnxeMekwglmaM1sLih2vGBl6MtT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray = new JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[(int)1224503873L ^ 0x48FC7242];
        jYuwLNnxeMekwglmaM1sLih2vGBl6MtT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)-2087082735 ^ (long)-2087082735)] = Field9616;
        jYuwLNnxeMekwglmaM1sLih2vGBl6MtT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)-220164525L ^ 0xF2E08E52] = Field9617;
        jYuwLNnxeMekwglmaM1sLih2vGBl6MtT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[((int)-1460180320L ^ 0xA8F76AA1) << 1] = Field9618;
        Field9619 = jYuwLNnxeMekwglmaM1sLih2vGBl6MtT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
    }

    private static String Method1863(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-556642224L ^ 0xDED25050;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1209514270L ^ 0x4817B9E1);
            int n2 = (int)((long)401424951 ^ (long)401424998) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-669514207 ^ (long)-669514300) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

