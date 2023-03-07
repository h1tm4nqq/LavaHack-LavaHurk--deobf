/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10494 = new QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("OBSIDIAN", (int)((long)1648390386 ^ (long)1648390386));
    public static final /* enum */ QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10495 = new QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("BEDROCK", (int)((long)1044355484 ^ (long)1044355485));
    public static final /* enum */ QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10496 = new QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("CUSTOM", (int)((long)1663397282 ^ (long)1663397283) << 1);
    private static final QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field10497;
    private String Field10498 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field10497.clone();
    }

    public static QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] qpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)-769792556 ^ (long)-769792553)];
        qpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-2040049085 ^ (long)-2040049085)] = Field10494;
        qpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)688719521L ^ 0x290D06A0] = Field10495;
        qpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[((int)589462354L ^ 0x23227B53) << 1] = Field10496;
        Field10497 = qpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method2550(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)314417143 ^ (long)314417143);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1341538206 ^ (long)1341538145);
            int n2 = (int)((long)1142358364 ^ (long)1142358367) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)319733410 ^ (long)319718463) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

