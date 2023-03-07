/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV
extends Enum {
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Field8132 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV("Damage", (int)1114198135L ^ 0x42695077);
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Field8133 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV("CevBreaker", (int)((long)-290302792 ^ (long)-290302791));
    private static final b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[] Field8134;
    private String Field8135 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[] values() {
        return (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[])Field8134.clone();
    }

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV valueOf(String string) {
        return Enum.valueOf(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV() {
        void var2_-1;
        void var1_-1;
    }

    static {
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[] b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[(int)((long)-1581998682 ^ (long)-1581998681) << 1];
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray[(int)-1650875966L ^ 0x9D99A1C2] = Field8132;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray[(int)1829667365L ^ 0x6D0E8224] = Field8133;
        Field8134 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray;
    }

    private static String Method429(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1298609798 ^ (long)-1298609798);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)859901487 ^ (long)859901648);
            int n2 = (int)-1405283669L ^ 0xAC3D128A;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)738585233 ^ (long)738589040) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

