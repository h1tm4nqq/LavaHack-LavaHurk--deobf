/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class o9lanP0gHU278cwDFs7XEsyWoBrJVe44$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ o9lanP0gHU278cwDFs7XEsyWoBrJVe44$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field12975 = new o9lanP0gHU278cwDFs7XEsyWoBrJVe44$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("None", (int)966053065L ^ 0x3994CCC9);
    public static final /* enum */ o9lanP0gHU278cwDFs7XEsyWoBrJVe44$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field12976 = new o9lanP0gHU278cwDFs7XEsyWoBrJVe44$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("All", (int)912217059L ^ 0x365F53E2);
    public static final /* enum */ o9lanP0gHU278cwDFs7XEsyWoBrJVe44$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field12977 = new o9lanP0gHU278cwDFs7XEsyWoBrJVe44$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("AllButIgnorePops", ((int)-1322966632L ^ 0xB1252199) << 1);
    private static final o9lanP0gHU278cwDFs7XEsyWoBrJVe44$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field12978;
    private String Field12979 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static o9lanP0gHU278cwDFs7XEsyWoBrJVe44$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (o9lanP0gHU278cwDFs7XEsyWoBrJVe44$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field12978.clone();
    }

    public static o9lanP0gHU278cwDFs7XEsyWoBrJVe44$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(o9lanP0gHU278cwDFs7XEsyWoBrJVe44$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private o9lanP0gHU278cwDFs7XEsyWoBrJVe44$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        o9lanP0gHU278cwDFs7XEsyWoBrJVe44$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] o9lanP0gHU278cwDFs7XEsyWoBrJVe44$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new o9lanP0gHU278cwDFs7XEsyWoBrJVe44$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)-1490731520L ^ 0xA7253E03];
        o9lanP0gHU278cwDFs7XEsyWoBrJVe44$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-1257528906L ^ 0xB50BA1B6] = Field12975;
        o9lanP0gHU278cwDFs7XEsyWoBrJVe44$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)1641034819 ^ (long)1641034818)] = Field12976;
        o9lanP0gHU278cwDFs7XEsyWoBrJVe44$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-175910682 ^ (long)-175910681) << 1] = Field12977;
        Field12978 = o9lanP0gHU278cwDFs7XEsyWoBrJVe44$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method4519(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-771616293 ^ (long)-771616293);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)876610412L ^ 0x34400393);
            int n2 = (int)((long)1521649016 ^ (long)1521649023) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)725261114 ^ (long)725265751) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

