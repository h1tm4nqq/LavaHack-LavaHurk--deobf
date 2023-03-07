/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV
extends Enum {
    public static final /* enum */ jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Field12174 = new jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV("Full", (int)287565092L ^ 0x1123E524);
    public static final /* enum */ jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Field12175 = new jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV("Head", (int)((long)743541412 ^ (long)743541413));
    private static final jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[] Field12176;
    private String Field12177 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[] values() {
        return (jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[])Field12176.clone();
    }

    public static jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV valueOf(String string) {
        return Enum.valueOf(jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV() {
        void var2_-1;
        void var1_-1;
    }

    static {
        jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[] jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray = new jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[(int)((long)615305609 ^ (long)615305608) << 1];
        jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray[(int)-1819235841L ^ 0x9390A9FF] = Field12174;
        jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray[(int)((long)757688821 ^ (long)757688820)] = Field12175;
        Field12176 = jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray;
    }

    private static String Method3976(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)814426425 ^ (long)814426425);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)2065170064L ^ 0x7B17FE6F);
            int n2 = ((int)1504018196L ^ 0x59A57F37) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-842484929 ^ (long)-842493224) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

