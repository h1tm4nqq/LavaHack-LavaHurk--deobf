/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV
extends Enum {
    public static final /* enum */ WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Field14890 = new WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV("Left", (int)((long)1935051866 ^ (long)1935051866));
    public static final /* enum */ WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Field14891 = new WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV("Right", (int)((long)1219512165 ^ (long)1219512164));
    private static final WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[] Field14892;
    private String Field14893 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[] values() {
        return (WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[])Field14892.clone();
    }

    public static WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV valueOf(String string) {
        return Enum.valueOf(WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV() {
        void var2_-1;
        void var1_-1;
    }

    static {
        WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[] wPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray = new WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[(int)((long)-1598274812 ^ (long)-1598274811) << 1];
        wPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray[(int)((long)492832269 ^ (long)492832269)] = Field14890;
        wPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray[(int)((long)1885697716 ^ (long)1885697717)] = Field14891;
        Field14892 = wPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray;
    }

    private static String Method5921(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)0x55080808L ^ 0x55080808;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-262648674L ^ 0xF0584C61);
            int n2 = (int)739719702L ^ 0x2C173A75;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)875096036 ^ (long)875093737) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

