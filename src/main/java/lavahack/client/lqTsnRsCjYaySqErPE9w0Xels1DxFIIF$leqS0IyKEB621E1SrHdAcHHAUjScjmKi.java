/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class lqTsnRsCjYaySqErPE9w0Xels1DxFIIF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ lqTsnRsCjYaySqErPE9w0Xels1DxFIIF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10262 = new lqTsnRsCjYaySqErPE9w0Xels1DxFIIF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Packet", (int)((long)-165980919 ^ (long)-165980919));
    public static final /* enum */ lqTsnRsCjYaySqErPE9w0Xels1DxFIIF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10263 = new lqTsnRsCjYaySqErPE9w0Xels1DxFIIF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Desync", (int)1068671847L ^ 0x3FB2A366);
    public static final /* enum */ lqTsnRsCjYaySqErPE9w0Xels1DxFIIF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10264 = new lqTsnRsCjYaySqErPE9w0Xels1DxFIIF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Auto", ((int)-1140001006L ^ 0xBC0CF713) << 1);
    private static final lqTsnRsCjYaySqErPE9w0Xels1DxFIIF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field10265;
    private int Field10266;

    public static lqTsnRsCjYaySqErPE9w0Xels1DxFIIF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (lqTsnRsCjYaySqErPE9w0Xels1DxFIIF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field10265.clone();
    }

    public static lqTsnRsCjYaySqErPE9w0Xels1DxFIIF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(lqTsnRsCjYaySqErPE9w0Xels1DxFIIF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private lqTsnRsCjYaySqErPE9w0Xels1DxFIIF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        lqTsnRsCjYaySqErPE9w0Xels1DxFIIF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] lqTsnRsCjYaySqErPE9w0Xels1DxFIIF$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new lqTsnRsCjYaySqErPE9w0Xels1DxFIIF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)-1544297503L ^ 0xA3F3E3E2];
        lqTsnRsCjYaySqErPE9w0Xels1DxFIIF$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)1814847144L ^ 0x6C2C5EA8] = Field10262;
        lqTsnRsCjYaySqErPE9w0Xels1DxFIIF$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)1877341217L ^ 0x6FE5F420] = Field10263;
        lqTsnRsCjYaySqErPE9w0Xels1DxFIIF$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)1706036663 ^ (long)1706036662) << 1] = Field10264;
        Field10265 = lqTsnRsCjYaySqErPE9w0Xels1DxFIIF$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method2428(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)100263697 ^ (long)100263697);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)564957494 ^ (long)564957641);
            int n2 = (int)((long)860696521 ^ (long)860696322);
            cArray2[n] = (char)(cArray[n] ^ ((int)1207142541L ^ 0x47F3AFFC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

