/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV
extends Enum {
    public static final /* enum */ vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field15137 = new vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV("None", (int)2054518436L ^ 0x7A7576A4);
    public static final /* enum */ vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field15138 = new vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV("TwoGradient", (int)-94047038L ^ 0xFA64F4C3);
    public static final /* enum */ vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field15139 = new vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV("ThreeGradient", (int)((long)-1200103886 ^ (long)-1200103885) << 1);
    public static final /* enum */ vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field15140 = new vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV("Syns", (int)1384841051L ^ 0x528AFF58);
    private static final vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] Field15141;
    private String Field15142 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] values() {
        return (vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[])Field15141.clone();
    }

    public static vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV valueOf(String string) {
        return Enum.valueOf(vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV() {
        void var2_-1;
        void var1_-1;
    }

    static {
        vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray = new vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[((int)520493315L ^ 0x1F061902) << 2];
        vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray[(int)796518490L ^ 0x2F79E85A] = Field15137;
        vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray[(int)1044616864L ^ 0x3E4396A1] = Field15138;
        vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray[(int)((long)-1149059661 ^ (long)-1149059662) << 1] = Field15139;
        vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray[(int)1248198433L ^ 0x4A65FF22] = Field15140;
        Field15141 = vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray;
    }

    private static String Method6066(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-272959538 ^ (long)-272959538);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1121195469 ^ (long)-1121195316);
            int n2 = (int)766047131L ^ 0x2DA8F356;
            cArray2[n] = (char)(cArray[n] ^ (((int)87740141L ^ 0x53AEDD8) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

