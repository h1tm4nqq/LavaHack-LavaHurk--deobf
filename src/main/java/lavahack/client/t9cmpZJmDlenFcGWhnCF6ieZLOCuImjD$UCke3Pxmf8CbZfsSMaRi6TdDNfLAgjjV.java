/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV
extends Enum {
    public static final /* enum */ t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Field8365 = new t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV("Off", (int)1619225282L ^ 0x60836AC2);
    public static final /* enum */ t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Field8366 = new t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV("Vanilla", (int)((long)-420955701 ^ (long)-420955702));
    public static final /* enum */ t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Field8367 = new t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV("SwitchBack", ((int)1161135573L ^ 0x453585D4) << 1);
    private static final t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[] Field8368;
    private int Field8369;

    public static t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[] values() {
        return (t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[])Field8368.clone();
    }

    public static t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV valueOf(String string) {
        return Enum.valueOf(t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV() {
        void var2_-1;
        void var1_-1;
    }

    static {
        t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[] t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray = new t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[(int)((long)201773269 ^ (long)201773270)];
        t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray[(int)((long)1169383430 ^ (long)1169383430)] = Field8365;
        t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray[(int)-1411599916L ^ 0xABDCB1D5] = Field8366;
        t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray[((int)73875379L ^ 0x4673FB2) << 1] = Field8367;
        Field8368 = t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray;
    }

    private static String Method818(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)890019580L ^ 0x350C9EFC;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-90003057L ^ 0xFAA2A970);
            int n2 = (int)-2052082218L ^ 0x85AFB521;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1042688655 ^ (long)-1042702274) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

