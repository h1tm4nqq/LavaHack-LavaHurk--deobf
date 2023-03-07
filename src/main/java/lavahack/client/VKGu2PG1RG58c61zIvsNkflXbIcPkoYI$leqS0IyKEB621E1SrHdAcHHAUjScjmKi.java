/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class VKGu2PG1RG58c61zIvsNkflXbIcPkoYI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ VKGu2PG1RG58c61zIvsNkflXbIcPkoYI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field11447 = new VKGu2PG1RG58c61zIvsNkflXbIcPkoYI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Section", (int)488326799L ^ 0x1D1B468F);
    public static final /* enum */ VKGu2PG1RG58c61zIvsNkflXbIcPkoYI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field11448 = new VKGu2PG1RG58c61zIvsNkflXbIcPkoYI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Angle", (int)-188198640L ^ 0xF4C85111);
    private static final VKGu2PG1RG58c61zIvsNkflXbIcPkoYI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field11449;
    private String Field11450 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static VKGu2PG1RG58c61zIvsNkflXbIcPkoYI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (VKGu2PG1RG58c61zIvsNkflXbIcPkoYI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field11449.clone();
    }

    public static VKGu2PG1RG58c61zIvsNkflXbIcPkoYI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(VKGu2PG1RG58c61zIvsNkflXbIcPkoYI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private VKGu2PG1RG58c61zIvsNkflXbIcPkoYI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        VKGu2PG1RG58c61zIvsNkflXbIcPkoYI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] vKGu2PG1RG58c61zIvsNkflXbIcPkoYI$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new VKGu2PG1RG58c61zIvsNkflXbIcPkoYI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)-1351302867 ^ (long)-1351302868) << 1];
        vKGu2PG1RG58c61zIvsNkflXbIcPkoYI$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)1443606813 ^ (long)1443606813)] = Field11447;
        vKGu2PG1RG58c61zIvsNkflXbIcPkoYI$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)301201624 ^ (long)301201625)] = Field11448;
        Field11449 = vKGu2PG1RG58c61zIvsNkflXbIcPkoYI$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method3405(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-2094144324L ^ 0x832DE4BC;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-240253745L ^ 0xF1AE0430);
            int n2 = ((int)-1686416962L ^ 0x9B7B518D) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)869733328 ^ (long)869745499) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

