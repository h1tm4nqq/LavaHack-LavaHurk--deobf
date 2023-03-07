/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class N8g04yYJzFIDm3i1WT6lDCy0XLBXMUr5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ N8g04yYJzFIDm3i1WT6lDCy0XLBXMUr5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field15821 = new N8g04yYJzFIDm3i1WT6lDCy0XLBXMUr5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Linear", (int)((long)-1583673050 ^ (long)-1583673050));
    public static final /* enum */ N8g04yYJzFIDm3i1WT6lDCy0XLBXMUr5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field15822 = new N8g04yYJzFIDm3i1WT6lDCy0XLBXMUr5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Curve", (int)((long)-284186186 ^ (long)-284186185));
    public static final /* enum */ N8g04yYJzFIDm3i1WT6lDCy0XLBXMUr5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field15823 = new N8g04yYJzFIDm3i1WT6lDCy0XLBXMUr5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Sin", (int)((long)-1250822410 ^ (long)-1250822409) << 1);
    private static final N8g04yYJzFIDm3i1WT6lDCy0XLBXMUr5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field15824;
    private int Field15825;

    public static N8g04yYJzFIDm3i1WT6lDCy0XLBXMUr5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (N8g04yYJzFIDm3i1WT6lDCy0XLBXMUr5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field15824.clone();
    }

    public static N8g04yYJzFIDm3i1WT6lDCy0XLBXMUr5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(N8g04yYJzFIDm3i1WT6lDCy0XLBXMUr5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private N8g04yYJzFIDm3i1WT6lDCy0XLBXMUr5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        N8g04yYJzFIDm3i1WT6lDCy0XLBXMUr5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] n8g04yYJzFIDm3i1WT6lDCy0XLBXMUr5$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new N8g04yYJzFIDm3i1WT6lDCy0XLBXMUr5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)12422496 ^ (long)12422499)];
        n8g04yYJzFIDm3i1WT6lDCy0XLBXMUr5$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-2077055429L ^ 0x8432A63B] = Field15821;
        n8g04yYJzFIDm3i1WT6lDCy0XLBXMUr5$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)2097424742L ^ 0x7D042967] = Field15822;
        n8g04yYJzFIDm3i1WT6lDCy0XLBXMUr5$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-1019309578 ^ (long)-1019309577) << 1] = Field15823;
        Field15824 = n8g04yYJzFIDm3i1WT6lDCy0XLBXMUr5$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method6474(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)821744459 ^ (long)821744459);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-187978083 ^ (long)-187978142);
            int n2 = (int)((long)1675395542 ^ (long)1675395539);
            cArray2[n] = (char)(cArray[n] ^ ((int)-1335621339L ^ 0xB0640620 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

