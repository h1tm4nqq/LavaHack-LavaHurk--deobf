/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field17791 = new CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("None", (int)-953547294L ^ 0xC72A05E2);
    public static final /* enum */ CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field17792 = new CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Normal", (int)684191291L ^ 0x28C7EE3A);
    public static final /* enum */ CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field17793 = new CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Silent", ((int)-1576927234L ^ 0xA201FFFF) << 1);
    private static final CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field17794;
    private int Field17795;

    public static CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field17794.clone();
    }

    public static CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] cyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)542081645 ^ (long)542081646)];
        cyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-74581523 ^ (long)-74581523)] = Field17791;
        cyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-1549002069L ^ 0xA3AC1AAA] = Field17792;
        cyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-498688793 ^ (long)-498688794) << 1] = Field17793;
        Field17794 = cyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method7711(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-863707372 ^ (long)-863707372);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1353539455 ^ (long)-1353539458);
            int n2 = (int)((long)1895621500 ^ (long)1895621447) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)1778961917L ^ 0x6A08BC74 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

