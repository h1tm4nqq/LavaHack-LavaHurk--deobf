/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class SLiqswd5ztNgsJq35KC6QtzyZcaQ4fym$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ SLiqswd5ztNgsJq35KC6QtzyZcaQ4fym$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field12531 = new SLiqswd5ztNgsJq35KC6QtzyZcaQ4fym$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Place", (int)-1514083975L ^ 0xA5C0E979);
    public static final /* enum */ SLiqswd5ztNgsJq35KC6QtzyZcaQ4fym$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field12532 = new SLiqswd5ztNgsJq35KC6QtzyZcaQ4fym$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Crystal", (int)((long)-1083077730 ^ (long)-1083077729));
    private static final SLiqswd5ztNgsJq35KC6QtzyZcaQ4fym$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field12533;
    private String Field12534 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static SLiqswd5ztNgsJq35KC6QtzyZcaQ4fym$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (SLiqswd5ztNgsJq35KC6QtzyZcaQ4fym$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field12533.clone();
    }

    public static SLiqswd5ztNgsJq35KC6QtzyZcaQ4fym$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(SLiqswd5ztNgsJq35KC6QtzyZcaQ4fym$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private SLiqswd5ztNgsJq35KC6QtzyZcaQ4fym$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        SLiqswd5ztNgsJq35KC6QtzyZcaQ4fym$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] sLiqswd5ztNgsJq35KC6QtzyZcaQ4fym$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new SLiqswd5ztNgsJq35KC6QtzyZcaQ4fym$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)-1895987150 ^ (long)-1895987149) << 1];
        sLiqswd5ztNgsJq35KC6QtzyZcaQ4fym$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)558479772 ^ (long)558479772)] = Field12531;
        sLiqswd5ztNgsJq35KC6QtzyZcaQ4fym$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-319753172 ^ (long)-319753171)] = Field12532;
        Field12533 = sLiqswd5ztNgsJq35KC6QtzyZcaQ4fym$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method4185(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1538609607 ^ (long)1538609607);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)678039678L ^ 0x286A1081);
            int n2 = (int)((long)-1093257310 ^ (long)-1093257345);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)172254501 ^ (long)172254396) << 5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

