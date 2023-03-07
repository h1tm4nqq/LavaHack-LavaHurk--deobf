/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class NngmEdjNl53Us2u9hWse9UOOf9hW7o97$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV
extends Enum {
    public static final /* enum */ NngmEdjNl53Us2u9hWse9UOOf9hW7o97$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Field15960 = new NngmEdjNl53Us2u9hWse9UOOf9hW7o97$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV("None", (int)((long)1152693244 ^ (long)1152693244));
    public static final /* enum */ NngmEdjNl53Us2u9hWse9UOOf9hW7o97$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Field15961 = new NngmEdjNl53Us2u9hWse9UOOf9hW7o97$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV("Normal", (int)392448064L ^ 0x17644841);
    public static final /* enum */ NngmEdjNl53Us2u9hWse9UOOf9hW7o97$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Field15962 = new NngmEdjNl53Us2u9hWse9UOOf9hW7o97$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV("Silent", ((int)1944545394L ^ 0x73E76873) << 1);
    private static final NngmEdjNl53Us2u9hWse9UOOf9hW7o97$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[] Field15963;
    private int Field15964;

    public static NngmEdjNl53Us2u9hWse9UOOf9hW7o97$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[] values() {
        return (NngmEdjNl53Us2u9hWse9UOOf9hW7o97$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[])Field15963.clone();
    }

    public static NngmEdjNl53Us2u9hWse9UOOf9hW7o97$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV valueOf(String string) {
        return Enum.valueOf(NngmEdjNl53Us2u9hWse9UOOf9hW7o97$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private NngmEdjNl53Us2u9hWse9UOOf9hW7o97$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV() {
        void var2_-1;
        void var1_-1;
    }

    static {
        NngmEdjNl53Us2u9hWse9UOOf9hW7o97$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[] nngmEdjNl53Us2u9hWse9UOOf9hW7o97$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray = new NngmEdjNl53Us2u9hWse9UOOf9hW7o97$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[(int)1585047611L ^ 0x5E79E838];
        nngmEdjNl53Us2u9hWse9UOOf9hW7o97$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray[(int)-2140872547L ^ 0x8064E09D] = Field15960;
        nngmEdjNl53Us2u9hWse9UOOf9hW7o97$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray[(int)-484174563L ^ 0xE324151C] = Field15961;
        nngmEdjNl53Us2u9hWse9UOOf9hW7o97$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray[(int)((long)1618366601 ^ (long)1618366600) << 1] = Field15962;
        Field15963 = nngmEdjNl53Us2u9hWse9UOOf9hW7o97$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray;
    }

    private static String Method6606(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-199465614L ^ 0xF41C6572;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)2146923502L ^ 0x7FF77311);
            int n2 = (int)((long)-95900149 ^ (long)-95900142) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1758707457 ^ (long)-1758702208) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

