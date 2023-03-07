/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field11066 = new JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("None", (int)((long)-1540225346 ^ (long)-1540225346));
    public static final /* enum */ JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field11067 = new JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Normal", (int)1151673904L ^ 0x44A52631);
    public static final /* enum */ JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field11068 = new JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Limited", ((int)-870894594L ^ 0xCC1733FF) << 1);
    public static final /* enum */ JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field11069 = new JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Strict", (int)((long)188940840 ^ (long)188940843));
    private static final JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field11070;
    private int Field11071;

    public static JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field11070.clone();
    }

    public static JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] jYuwLNnxeMekwglmaM1sLih2vGBl6MtT$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)345086363 ^ (long)345086362) << 2];
        jYuwLNnxeMekwglmaM1sLih2vGBl6MtT$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-328000889L ^ 0xEC731A87] = Field11066;
        jYuwLNnxeMekwglmaM1sLih2vGBl6MtT$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)1436175644 ^ (long)1436175645)] = Field11067;
        jYuwLNnxeMekwglmaM1sLih2vGBl6MtT$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-500157582 ^ (long)-500157581) << 1] = Field11068;
        jYuwLNnxeMekwglmaM1sLih2vGBl6MtT$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-293807328 ^ (long)-293807325)] = Field11069;
        Field11070 = jYuwLNnxeMekwglmaM1sLih2vGBl6MtT$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method3007(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1836685303L ^ 0x92866809;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-667740145L ^ 0xD83318F0);
            int n2 = ((int)-596091046L ^ 0xDC785F75) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)1733841871L ^ 0x6758595C) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

