/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field8676 = new vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Old", (int)-1485626751L ^ 0xA7732281);
    public static final /* enum */ vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field8677 = new vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Impr", (int)1669807250L ^ 0x63873C93);
    private static final vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field8678;
    private String Field8679 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field8678.clone();
    }

    public static vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[((int)2022393903L ^ 0x788B482E) << 1];
        vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)928110677 ^ (long)928110677)] = Field8676;
        vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)664182487 ^ (long)664182486)] = Field8677;
        Field8678 = vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method1057(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-352023769L ^ 0xEB048B27;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)655803615 ^ (long)655803424);
            int n2 = (int)770707072L ^ 0x2DF00E11;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1849945317 ^ (long)1849944720) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

