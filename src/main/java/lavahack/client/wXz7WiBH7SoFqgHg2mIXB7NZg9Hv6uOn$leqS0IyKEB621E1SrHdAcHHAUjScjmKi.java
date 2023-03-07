/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field14032 = new wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Regular", (int)((long)-1736323371 ^ (long)-1736323371));
    public static final /* enum */ wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field14033 = new wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Light", (int)((long)1887137058 ^ (long)1887137059));
    public static final /* enum */ wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field14034 = new wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Bold", (int)((long)-2091364612 ^ (long)-2091364611) << 1);
    private static final wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field14035;
    private String Field14036 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field14035.clone();
    }

    public static wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)-106790782 ^ (long)-106790783)];
        wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)1371690966 ^ (long)1371690966)] = Field14032;
        wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)1392299512L ^ 0x52FCCDF9] = Field14033;
        wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)1956792423 ^ (long)1956792422) << 1] = Field14034;
        Field14035 = wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method5342(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1058189036 ^ (long)-1058189036);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1742304305 ^ (long)-1742304464);
            int n2 = (int)((long)-150769136 ^ (long)-150768929);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)828037040 ^ (long)828035521) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

