/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class txv604LX7jI49uXrB8aYJ9HwEBS85jgC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ txv604LX7jI49uXrB8aYJ9HwEBS85jgC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field12072 = new txv604LX7jI49uXrB8aYJ9HwEBS85jgC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Default", (int)-842364346L ^ 0xCDCA8A46);
    public static final /* enum */ txv604LX7jI49uXrB8aYJ9HwEBS85jgC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field12073 = new txv604LX7jI49uXrB8aYJ9HwEBS85jgC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Rewrite", (int)((long)545187034 ^ (long)545187035));
    private static final txv604LX7jI49uXrB8aYJ9HwEBS85jgC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field12074;
    private String Field12075 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static txv604LX7jI49uXrB8aYJ9HwEBS85jgC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (txv604LX7jI49uXrB8aYJ9HwEBS85jgC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field12074.clone();
    }

    public static txv604LX7jI49uXrB8aYJ9HwEBS85jgC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(txv604LX7jI49uXrB8aYJ9HwEBS85jgC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private txv604LX7jI49uXrB8aYJ9HwEBS85jgC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        txv604LX7jI49uXrB8aYJ9HwEBS85jgC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] txv604LX7jI49uXrB8aYJ9HwEBS85jgC$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new txv604LX7jI49uXrB8aYJ9HwEBS85jgC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[((int)1586195861L ^ 0x5E8B6D94) << 1];
        txv604LX7jI49uXrB8aYJ9HwEBS85jgC$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)1902895682L ^ 0x716BE242] = Field12072;
        txv604LX7jI49uXrB8aYJ9HwEBS85jgC$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-176048494L ^ 0xF581B693] = Field12073;
        Field12074 = txv604LX7jI49uXrB8aYJ9HwEBS85jgC$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method3924(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1523415975 ^ (long)1523415975);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-458773389 ^ (long)-458773364);
            int n2 = (int)((long)-358306752 ^ (long)-358306747);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1202073793 ^ (long)-1202075808) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

