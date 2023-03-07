/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV
extends Enum {
    public static final /* enum */ AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field9768 = new AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV("SINGLE", (int)((long)1622188920 ^ (long)1622188920));
    public static final /* enum */ AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field9769 = new AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV("DOUBLE", (int)1021801179L ^ 0x3CE772DA);
    public static final /* enum */ AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field9770 = new AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV("CUSTOM", (int)((long)-773054399 ^ (long)-773054400) << 1);
    public static final /* enum */ AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field9771 = new AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV("NONE", (int)407428240L ^ 0x1848DC93);
    private static final AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] Field9772;
    private int Field9773;

    public static AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] values() {
        return (AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[])Field9772.clone();
    }

    public static AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV valueOf(String string) {
        return Enum.valueOf(AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV() {
        void var2_-1;
        void var1_-1;
    }

    static {
        AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray = new AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[((int)806954871L ^ 0x30192776) << 2];
        ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray[(int)((long)-378299950 ^ (long)-378299950)] = Field9768;
        ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray[(int)-1082541420L ^ 0xBF79BA95] = Field9769;
        ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray[(int)((long)1748376278 ^ (long)1748376279) << 1] = Field9770;
        ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray[(int)((long)-424336839 ^ (long)-424336838)] = Field9771;
        Field9772 = ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray;
    }

    private static String Method2053(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)799777412L ^ 0x2FABA284;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1383404350 ^ (long)-1383404483);
            int n2 = ((int)123035167L ^ 0x7555E52) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1566903062 ^ (long)-1566926387) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

