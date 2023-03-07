/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field14228 = new j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("None", (int)921844774L ^ 0x36F23C26);
    public static final /* enum */ j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field14229 = new j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Sunrise", (int)-70630591L ^ 0xFBCA4340);
    private static final j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field14230;
    private int Field14231;

    public static j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field14230.clone();
    }

    public static j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)1730944965 ^ (long)1730944964) << 1];
        j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-649527978 ^ (long)-649527978)] = Field14228;
        j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-2132071323L ^ 0x80EB2C64] = Field14229;
        Field14230 = j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method5463(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)220300691L ^ 0xD218593;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)274846783L ^ 0x1061D4C0);
            int n2 = (int)((long)1092264284 ^ (long)1092264389);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-490037662 ^ (long)-490042689) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

