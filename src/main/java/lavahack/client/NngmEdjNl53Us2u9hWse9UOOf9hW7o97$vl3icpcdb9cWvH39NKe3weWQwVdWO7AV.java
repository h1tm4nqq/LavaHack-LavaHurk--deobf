/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class NngmEdjNl53Us2u9hWse9UOOf9hW7o97$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV
extends Enum {
    public static final /* enum */ NngmEdjNl53Us2u9hWse9UOOf9hW7o97$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field15462 = new NngmEdjNl53Us2u9hWse9UOOf9hW7o97$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV("None", (int)312915935L ^ 0x12A6B7DF);
    public static final /* enum */ NngmEdjNl53Us2u9hWse9UOOf9hW7o97$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field15463 = new NngmEdjNl53Us2u9hWse9UOOf9hW7o97$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV("Dynamic", (int)-2122954023L ^ 0x81764AD8);
    public static final /* enum */ NngmEdjNl53Us2u9hWse9UOOf9hW7o97$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field15464 = new NngmEdjNl53Us2u9hWse9UOOf9hW7o97$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV("Static", (int)((long)552427238 ^ (long)552427239) << 1);
    private static final NngmEdjNl53Us2u9hWse9UOOf9hW7o97$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] Field15465;
    private String Field15466 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static NngmEdjNl53Us2u9hWse9UOOf9hW7o97$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] values() {
        return (NngmEdjNl53Us2u9hWse9UOOf9hW7o97$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[])Field15465.clone();
    }

    public static NngmEdjNl53Us2u9hWse9UOOf9hW7o97$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV valueOf(String string) {
        return Enum.valueOf(NngmEdjNl53Us2u9hWse9UOOf9hW7o97$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private NngmEdjNl53Us2u9hWse9UOOf9hW7o97$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV() {
        void var2_-1;
        void var1_-1;
    }

    static {
        NngmEdjNl53Us2u9hWse9UOOf9hW7o97$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] nngmEdjNl53Us2u9hWse9UOOf9hW7o97$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray = new NngmEdjNl53Us2u9hWse9UOOf9hW7o97$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[(int)-230961725L ^ 0xF23BCDC0];
        nngmEdjNl53Us2u9hWse9UOOf9hW7o97$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray[(int)-438396285L ^ 0xE5DE9A83] = Field15462;
        nngmEdjNl53Us2u9hWse9UOOf9hW7o97$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray[(int)2046507554L ^ 0x79FB3A23] = Field15463;
        nngmEdjNl53Us2u9hWse9UOOf9hW7o97$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray[(int)((long)1793447604 ^ (long)1793447605) << 1] = Field15464;
        Field15465 = nngmEdjNl53Us2u9hWse9UOOf9hW7o97$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray;
    }

    private static String Method6254(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)658746084L ^ 0x2743AAE4;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-113572203L ^ 0xF93B066A);
            int n2 = ((int)-353978522L ^ 0xEAE6B701) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1585193721 ^ (long)1585194942) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

