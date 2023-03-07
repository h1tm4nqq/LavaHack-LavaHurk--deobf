/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field14093 = new XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Old", (int)747440198L ^ 0x2C8D0846);
    public static final /* enum */ XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field14094 = new XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("New", (int)-118283661L ^ 0xF8F32272);
    private static final XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field14095;
    private String Field14096 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field14095.clone();
    }

    public static XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] xVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)-761546111 ^ (long)-761546112) << 1];
        xVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-1354041023 ^ (long)-1354041023)] = Field14093;
        xVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-1088905506L ^ 0xBF189EDF] = Field14094;
        Field14095 = xVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method5372(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1716876554 ^ (long)1716876554);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)821497288L ^ 0x30F70D37);
            int n2 = (int)((long)104771671 ^ (long)104771668) << 6;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)469895120 ^ (long)469901335) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

