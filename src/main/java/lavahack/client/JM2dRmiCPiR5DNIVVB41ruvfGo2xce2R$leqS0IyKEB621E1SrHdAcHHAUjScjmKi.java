/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field11018 = new JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Packet", (int)((long)1947956260 ^ (long)1947956260));
    public static final /* enum */ JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field11019 = new JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Vanilla", (int)-409763505L ^ 0xE793814E);
    private static final JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field11020;
    private int Field11021;

    public static JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field11020.clone();
    }

    public static JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] jM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[((int)590081427L ^ 0x232BED92) << 1];
        jM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)1098781306L ^ 0x417E127A] = Field11018;
        jM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-296103258L ^ 0xEE59D2A7] = Field11019;
        Field11020 = jM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method2949(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)645073569 ^ (long)645073569);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-57033220 ^ (long)-57033469);
            int n2 = (int)((long)-614778611 ^ (long)-614778618) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-942104009 ^ (long)-942110536) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

