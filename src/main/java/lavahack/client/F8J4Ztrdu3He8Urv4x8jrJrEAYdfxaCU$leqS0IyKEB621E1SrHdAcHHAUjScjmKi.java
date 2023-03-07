/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class F8J4Ztrdu3He8Urv4x8jrJrEAYdfxaCU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ F8J4Ztrdu3He8Urv4x8jrJrEAYdfxaCU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9834 = new F8J4Ztrdu3He8Urv4x8jrJrEAYdfxaCU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Friend", (int)((long)236369540 ^ (long)236369540), "Only Friends");
    public static final /* enum */ F8J4Ztrdu3He8Urv4x8jrJrEAYdfxaCU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9835 = new F8J4Ztrdu3He8Urv4x8jrJrEAYdfxaCU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("OtherPLayers", (int)((long)1102761981 ^ (long)1102761980), "Only Other Players");
    public static final /* enum */ F8J4Ztrdu3He8Urv4x8jrJrEAYdfxaCU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9836 = new F8J4Ztrdu3He8Urv4x8jrJrEAYdfxaCU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Both", (int)((long)132715265 ^ (long)132715264) << 1, "Both");
    public String Field9837;
    private static final F8J4Ztrdu3He8Urv4x8jrJrEAYdfxaCU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field9838;
    private int Field9839;

    public static F8J4Ztrdu3He8Urv4x8jrJrEAYdfxaCU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (F8J4Ztrdu3He8Urv4x8jrJrEAYdfxaCU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field9838.clone();
    }

    public static F8J4Ztrdu3He8Urv4x8jrJrEAYdfxaCU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(F8J4Ztrdu3He8Urv4x8jrJrEAYdfxaCU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private F8J4Ztrdu3He8Urv4x8jrJrEAYdfxaCU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field9837 = var3_1;
    }

    public String Method2084() {
        return this.Field9837;
    }

    static {
        F8J4Ztrdu3He8Urv4x8jrJrEAYdfxaCU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] f8J4Ztrdu3He8Urv4x8jrJrEAYdfxaCU$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new F8J4Ztrdu3He8Urv4x8jrJrEAYdfxaCU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)226955532 ^ (long)226955535)];
        f8J4Ztrdu3He8Urv4x8jrJrEAYdfxaCU$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-1768072005L ^ 0x969D5CBB] = Field9834;
        f8J4Ztrdu3He8Urv4x8jrJrEAYdfxaCU$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-474147571L ^ 0xE3BD150C] = Field9835;
        f8J4Ztrdu3He8Urv4x8jrJrEAYdfxaCU$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[((int)1686645392L ^ 0x64882A91) << 1] = Field9836;
        Field9838 = f8J4Ztrdu3He8Urv4x8jrJrEAYdfxaCU$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method2085(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)849365584 ^ (long)849365584);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-163204888L ^ 0xF645B017);
            int n2 = (int)((long)1756638734 ^ (long)1756638963);
            cArray2[n] = (char)(cArray[n] ^ (((int)-1626535235L ^ 0x9F0D0718) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

