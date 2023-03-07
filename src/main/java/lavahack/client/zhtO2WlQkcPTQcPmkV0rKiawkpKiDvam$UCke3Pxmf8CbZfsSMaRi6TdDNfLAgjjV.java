/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV
extends Enum {
    public static final /* enum */ zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Field7857 = new zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV("None", (int)((long)1564236495 ^ (long)1564236495));
    public static final /* enum */ zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Field7858 = new zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV("Normal", (int)-1576084990L ^ 0xA20EDA03);
    public static final /* enum */ zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Field7859 = new zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV("Silent", (int)((long)-384555212 ^ (long)-384555211) << 1);
    private static final zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[] Field7860;
    private int Field7861;

    public static zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[] values() {
        return (zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[])Field7860.clone();
    }

    public static zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV valueOf(String string) {
        return Enum.valueOf(zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV() {
        void var2_-1;
        void var1_-1;
    }

    static {
        zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[] zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray = new zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[(int)((long)-479478878 ^ (long)-479478879)];
        zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray[(int)((long)-1345129009 ^ (long)-1345129009)] = Field7857;
        zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray[(int)676278802L ^ 0x284F3213] = Field7858;
        zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray[(int)((long)-575341522 ^ (long)-575341521) << 1] = Field7859;
        Field7860 = zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray;
    }

    private static String Method99(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1760607090L ^ 0x970F448E;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)420634253 ^ (long)420634226);
            int n2 = (int)((long)-2104640623 ^ (long)-2104640724);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)887703900 ^ (long)887716755) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

