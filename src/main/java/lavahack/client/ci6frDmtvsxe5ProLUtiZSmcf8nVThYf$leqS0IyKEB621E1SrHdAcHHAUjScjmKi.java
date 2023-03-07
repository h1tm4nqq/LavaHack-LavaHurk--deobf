/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class ci6frDmtvsxe5ProLUtiZSmcf8nVThYf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ ci6frDmtvsxe5ProLUtiZSmcf8nVThYf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10003 = new ci6frDmtvsxe5ProLUtiZSmcf8nVThYf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("RELOAD", (int)-1042912258L ^ 0xC1D66BFE, "Reload");
    public static final /* enum */ ci6frDmtvsxe5ProLUtiZSmcf8nVThYf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10004 = new ci6frDmtvsxe5ProLUtiZSmcf8nVThYf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("UNLOAD", (int)1312636583L ^ 0x4E3D3EA6, "Unload");
    final String Field10005;
    private static final ci6frDmtvsxe5ProLUtiZSmcf8nVThYf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field10006;
    private String Field10007 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static ci6frDmtvsxe5ProLUtiZSmcf8nVThYf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (ci6frDmtvsxe5ProLUtiZSmcf8nVThYf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field10006.clone();
    }

    public static ci6frDmtvsxe5ProLUtiZSmcf8nVThYf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(ci6frDmtvsxe5ProLUtiZSmcf8nVThYf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ci6frDmtvsxe5ProLUtiZSmcf8nVThYf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field10005 = var3_1;
    }

    static {
        ci6frDmtvsxe5ProLUtiZSmcf8nVThYf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] ci6frDmtvsxe5ProLUtiZSmcf8nVThYf$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new ci6frDmtvsxe5ProLUtiZSmcf8nVThYf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[((int)-1234304301L ^ 0xB66E02D2) << 1];
        ci6frDmtvsxe5ProLUtiZSmcf8nVThYf$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-1283093934L ^ 0xB3858A52] = Field10003;
        ci6frDmtvsxe5ProLUtiZSmcf8nVThYf$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-1608719385 ^ (long)-1608719386)] = Field10004;
        Field10006 = ci6frDmtvsxe5ProLUtiZSmcf8nVThYf$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method2232(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1601515989 ^ (long)1601515989);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)409798041L ^ 0x186D0566);
            int n2 = (int)1933535689L ^ 0x733F690C;
            cArray2[n] = (char)(cArray[n] ^ (((int)349065658L ^ 0x14CE4111) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

