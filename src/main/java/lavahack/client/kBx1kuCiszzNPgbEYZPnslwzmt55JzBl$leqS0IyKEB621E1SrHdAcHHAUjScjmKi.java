/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class kBx1kuCiszzNPgbEYZPnslwzmt55JzBl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ kBx1kuCiszzNPgbEYZPnslwzmt55JzBl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field17388 = new kBx1kuCiszzNPgbEYZPnslwzmt55JzBl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Normal", (int)((long)1726324654 ^ (long)1726324654));
    public static final /* enum */ kBx1kuCiszzNPgbEYZPnslwzmt55JzBl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field17389 = new kBx1kuCiszzNPgbEYZPnslwzmt55JzBl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Control", (int)((long)-1961002176 ^ (long)-1961002175));
    public static final /* enum */ kBx1kuCiszzNPgbEYZPnslwzmt55JzBl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field17390 = new kBx1kuCiszzNPgbEYZPnslwzmt55JzBl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("NormalPacket", ((int)-678640767L ^ 0xD78CC380) << 1);
    private static final kBx1kuCiszzNPgbEYZPnslwzmt55JzBl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field17391;
    private String Field17392 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static kBx1kuCiszzNPgbEYZPnslwzmt55JzBl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (kBx1kuCiszzNPgbEYZPnslwzmt55JzBl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field17391.clone();
    }

    public static kBx1kuCiszzNPgbEYZPnslwzmt55JzBl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(kBx1kuCiszzNPgbEYZPnslwzmt55JzBl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private kBx1kuCiszzNPgbEYZPnslwzmt55JzBl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        kBx1kuCiszzNPgbEYZPnslwzmt55JzBl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] kBx1kuCiszzNPgbEYZPnslwzmt55JzBl$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new kBx1kuCiszzNPgbEYZPnslwzmt55JzBl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)-1450854202L ^ 0xA985B8C5];
        kBx1kuCiszzNPgbEYZPnslwzmt55JzBl$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-579016507L ^ 0xDD7CE8C5] = Field17388;
        kBx1kuCiszzNPgbEYZPnslwzmt55JzBl$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)331900371L ^ 0x13C865D2] = Field17389;
        kBx1kuCiszzNPgbEYZPnslwzmt55JzBl$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[((int)1814654093L ^ 0x6C296C8C) << 1] = Field17390;
        Field17391 = kBx1kuCiszzNPgbEYZPnslwzmt55JzBl$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method7568(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1017701011 ^ (long)-1017701011);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-2143466752L ^ 0x803D4BFF);
            int n2 = (int)((long)-1704690257 ^ (long)-1704690244) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-533582198 ^ (long)-533582633) << 4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

