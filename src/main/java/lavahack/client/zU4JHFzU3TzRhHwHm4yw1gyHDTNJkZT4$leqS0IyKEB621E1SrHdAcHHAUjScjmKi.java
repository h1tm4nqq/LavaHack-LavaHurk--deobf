/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field17332 = new zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Center", (int)((long)-709868046 ^ (long)-709868046));
    public static final /* enum */ zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field17333 = new zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Left", (int)((long)-844552460 ^ (long)-844552459));
    private static final zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field17334;
    private int Field17335;

    public static zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field17334.clone();
    }

    public static zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[((int)-706229582L ^ 0xD5E7CAB3) << 1];
        zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-1799532621 ^ (long)-1799532621)] = Field17332;
        zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-822455561L ^ 0xCEFA52F6] = Field17333;
        Field17334 = zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method7508(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-355178109L ^ 0xEAD46983;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-698346299L ^ 0xD660143A);
            int n2 = (int)((long)-2023333212 ^ (long)-2023333285);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-324077291 ^ (long)-324092690) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

