/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV
extends Enum {
    public static final /* enum */ JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Field16446 = new JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV("PositionBounds", (int)2102589181L ^ 0x7D52F6FD);
    public static final /* enum */ JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Field16447 = new JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV("BoundsPosition", (int)((long)-310588465 ^ (long)-310588466));
    private static final JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[] Field16448;
    private int Field16449;

    public static JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[] values() {
        return (JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[])Field16448.clone();
    }

    public static JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV valueOf(String string) {
        return Enum.valueOf(JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV() {
        void var2_-1;
        void var1_-1;
    }

    static {
        JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[] jYuwLNnxeMekwglmaM1sLih2vGBl6MtT$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray = new JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[((int)-684578879L ^ 0xD73227C0) << 1];
        jYuwLNnxeMekwglmaM1sLih2vGBl6MtT$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray[(int)-628576152L ^ 0xDA88B068] = Field16446;
        jYuwLNnxeMekwglmaM1sLih2vGBl6MtT$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray[(int)((long)-862105352 ^ (long)-862105351)] = Field16447;
        Field16448 = jYuwLNnxeMekwglmaM1sLih2vGBl6MtT$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray;
    }

    private static String Method6887(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)493105338 ^ (long)493105338);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)32411364L ^ 0x1EE8E1B);
            int n2 = ((int)20865351L ^ 0x13E616A) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-352854646 ^ (long)-352869951) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

