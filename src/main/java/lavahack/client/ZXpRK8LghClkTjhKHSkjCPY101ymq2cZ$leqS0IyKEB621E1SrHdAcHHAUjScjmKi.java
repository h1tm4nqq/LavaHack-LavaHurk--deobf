/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field15881 = new ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Packet", (int)-1972272174L ^ 0x8A7183D2);
    public static final /* enum */ ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field15882 = new ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("AAC", (int)((long)-1827157080 ^ (long)-1827157079));
    public static final /* enum */ ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field15883 = new ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Anti", ((int)878460443L ^ 0x345C3E1A) << 1);
    public static final /* enum */ ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field15884 = new ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Bucket", (int)((long)1555260357 ^ (long)1555260358));
    private static final ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field15885;
    private int Field15886;

    public static ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field15885.clone();
    }

    public static ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] zXpRK8LghClkTjhKHSkjCPY101ymq2cZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new ZXpRK8LghClkTjhKHSkjCPY101ymq2cZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[((int)1286973031L ^ 0x4CB5A666) << 2];
        zXpRK8LghClkTjhKHSkjCPY101ymq2cZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-840364796L ^ 0xCDE90D04] = Field15881;
        zXpRK8LghClkTjhKHSkjCPY101ymq2cZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-1832735415L ^ 0x92C2AD48] = Field15882;
        zXpRK8LghClkTjhKHSkjCPY101ymq2cZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)2090248348 ^ (long)2090248349) << 1] = Field15883;
        zXpRK8LghClkTjhKHSkjCPY101ymq2cZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-1627682916 ^ (long)-1627682913)] = Field15884;
        Field15885 = zXpRK8LghClkTjhKHSkjCPY101ymq2cZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method6528(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)2046492558L ^ 0x79FAFF8E;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-75083513 ^ (long)-75083272);
            int n2 = ((int)-35368031L ^ 0xFDE45390) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-131774191L ^ 0xF8251B82 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

