/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field11735 = new xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Vanilla", (int)((long)885204832 ^ (long)885204832));
    public static final /* enum */ xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field11736 = new xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Motion", (int)((long)-1496593005 ^ (long)-1496593006));
    private static final xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field11737;
    private String Field11738 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field11737.clone();
    }

    public static xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[((int)2075571654L ^ 0x7BB6B5C7) << 1];
        xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)75296889 ^ (long)75296889)] = Field11735;
        xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-1574214861L ^ 0xA22B6332] = Field11736;
        Field11737 = xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method3720(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1479991502L ^ 0xA7C91F32;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-750650305 ^ (long)-750650176);
            int n2 = (int)-629533233L ^ 0xDA7A1576;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1304384051 ^ (long)-1304376590) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

