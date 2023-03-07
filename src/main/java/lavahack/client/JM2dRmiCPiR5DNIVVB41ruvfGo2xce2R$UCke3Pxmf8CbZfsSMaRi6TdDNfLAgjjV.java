/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV
extends Enum {
    public static final /* enum */ JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Field15887 = new JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV("Single", (int)1694380610L ^ 0x64FE3242);
    public static final /* enum */ JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Field15888 = new JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV("All", (int)-214518982L ^ 0xF336B33B);
    private static final JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[] Field15889;
    private String Field15890 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[] values() {
        return (JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[])Field15889.clone();
    }

    public static JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV valueOf(String string) {
        return Enum.valueOf(JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV() {
        void var2_-1;
        void var1_-1;
    }

    static {
        JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[] jM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray = new JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[(int)((long)-1609859384 ^ (long)-1609859383) << 1];
        jM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray[(int)((long)-1941763480 ^ (long)-1941763480)] = Field15887;
        jM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray[(int)((long)-2044376879 ^ (long)-2044376880)] = Field15888;
        Field15889 = jM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray;
    }

    private static String Method6531(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)166272554L ^ 0x9E91E2A;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1445360403L ^ 0x562673EC);
            int n2 = (int)-1641915518L ^ 0x9E225BD3;
            cArray2[n] = (char)(cArray[n] ^ ((int)-957775177L ^ 0xC6E9E7C6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

