/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class NngmEdjNl53Us2u9hWse9UOOf9hW7o97$Ljc0gDTN8WkwPRHY480HpEkScGALG41A
extends Enum {
    public static final /* enum */ NngmEdjNl53Us2u9hWse9UOOf9hW7o97$Ljc0gDTN8WkwPRHY480HpEkScGALG41A Field16071 = new NngmEdjNl53Us2u9hWse9UOOf9hW7o97$Ljc0gDTN8WkwPRHY480HpEkScGALG41A("Normal", (int)-818089604L ^ 0xCF3CF17C);
    public static final /* enum */ NngmEdjNl53Us2u9hWse9UOOf9hW7o97$Ljc0gDTN8WkwPRHY480HpEkScGALG41A Field16072 = new NngmEdjNl53Us2u9hWse9UOOf9hW7o97$Ljc0gDTN8WkwPRHY480HpEkScGALG41A("Silent", (int)-1044183700L ^ 0xC1C3056D);
    private static final NngmEdjNl53Us2u9hWse9UOOf9hW7o97$Ljc0gDTN8WkwPRHY480HpEkScGALG41A[] Field16073;
    private String Field16074 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static NngmEdjNl53Us2u9hWse9UOOf9hW7o97$Ljc0gDTN8WkwPRHY480HpEkScGALG41A[] values() {
        return (NngmEdjNl53Us2u9hWse9UOOf9hW7o97$Ljc0gDTN8WkwPRHY480HpEkScGALG41A[])Field16073.clone();
    }

    public static NngmEdjNl53Us2u9hWse9UOOf9hW7o97$Ljc0gDTN8WkwPRHY480HpEkScGALG41A valueOf(String string) {
        return Enum.valueOf(NngmEdjNl53Us2u9hWse9UOOf9hW7o97$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private NngmEdjNl53Us2u9hWse9UOOf9hW7o97$Ljc0gDTN8WkwPRHY480HpEkScGALG41A() {
        void var2_-1;
        void var1_-1;
    }

    static {
        NngmEdjNl53Us2u9hWse9UOOf9hW7o97$Ljc0gDTN8WkwPRHY480HpEkScGALG41A[] nngmEdjNl53Us2u9hWse9UOOf9hW7o97$Ljc0gDTN8WkwPRHY480HpEkScGALG41AArray = new NngmEdjNl53Us2u9hWse9UOOf9hW7o97$Ljc0gDTN8WkwPRHY480HpEkScGALG41A[(int)((long)943858304 ^ (long)943858305) << 1];
        nngmEdjNl53Us2u9hWse9UOOf9hW7o97$Ljc0gDTN8WkwPRHY480HpEkScGALG41AArray[(int)((long)-581437956 ^ (long)-581437956)] = Field16071;
        nngmEdjNl53Us2u9hWse9UOOf9hW7o97$Ljc0gDTN8WkwPRHY480HpEkScGALG41AArray[(int)((long)1403745186 ^ (long)1403745187)] = Field16072;
        Field16073 = nngmEdjNl53Us2u9hWse9UOOf9hW7o97$Ljc0gDTN8WkwPRHY480HpEkScGALG41AArray;
    }

    private static String Method6713(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1389332518L ^ 0x52CF8826;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-76760162L ^ 0xFB6CBB61);
            int n2 = ((int)1769691699L ^ 0x697B5A7C) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)275385652 ^ (long)275392813) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

