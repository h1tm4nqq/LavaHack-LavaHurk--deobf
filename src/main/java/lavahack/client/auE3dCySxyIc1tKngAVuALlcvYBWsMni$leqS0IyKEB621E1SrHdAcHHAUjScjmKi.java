/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class auE3dCySxyIc1tKngAVuALlcvYBWsMni$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ auE3dCySxyIc1tKngAVuALlcvYBWsMni$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field14820 = new auE3dCySxyIc1tKngAVuALlcvYBWsMni$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("OFFICIAL", (int)((long)-1072052414 ^ (long)-1072052414));
    public static final /* enum */ auE3dCySxyIc1tKngAVuALlcvYBWsMni$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field14821 = new auE3dCySxyIc1tKngAVuALlcvYBWsMni$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("INTERMEDIARY", (int)((long)1706874725 ^ (long)1706874724));
    public static final /* enum */ auE3dCySxyIc1tKngAVuALlcvYBWsMni$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field14822 = new auE3dCySxyIc1tKngAVuALlcvYBWsMni$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("NAMED", ((int)1739874120L ^ 0x67B45F49) << 1);
    private static final auE3dCySxyIc1tKngAVuALlcvYBWsMni$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field14823;
    private String Field14824 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static auE3dCySxyIc1tKngAVuALlcvYBWsMni$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (auE3dCySxyIc1tKngAVuALlcvYBWsMni$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field14823.clone();
    }

    public static auE3dCySxyIc1tKngAVuALlcvYBWsMni$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(auE3dCySxyIc1tKngAVuALlcvYBWsMni$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private auE3dCySxyIc1tKngAVuALlcvYBWsMni$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        auE3dCySxyIc1tKngAVuALlcvYBWsMni$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] auE3dCySxyIc1tKngAVuALlcvYBWsMni$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new auE3dCySxyIc1tKngAVuALlcvYBWsMni$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)2123041648L ^ 0x7E8B0B73];
        auE3dCySxyIc1tKngAVuALlcvYBWsMni$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)977205883 ^ (long)977205883)] = Field14820;
        auE3dCySxyIc1tKngAVuALlcvYBWsMni$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)1447177186L ^ 0x56422BE3] = Field14821;
        auE3dCySxyIc1tKngAVuALlcvYBWsMni$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)1603975740 ^ (long)1603975741) << 1] = Field14822;
        Field14823 = auE3dCySxyIc1tKngAVuALlcvYBWsMni$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method5817(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1898005361L ^ 0x8EDEBC8F;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-904216182L ^ 0xCA1AC175);
            int n2 = ((int)1595603248L ^ 0x5F1AF939) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1063389868 ^ (long)-1063390127) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

