/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field17291 = new iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("STRENGTH", (int)747713684L ^ 0x2C913494);
    public static final /* enum */ iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field17292 = new iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("SPEED", (int)-303520226L ^ 0xEDE8A61F);
    public static final /* enum */ iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field17293 = new iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("FIRERES", ((int)1980110877L ^ 0x7606181C) << 1);
    private static final iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field17294;
    private String Field17295 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field17294.clone();
    }

    public static iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)-700302729 ^ (long)-700302732)];
        iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-1586798036L ^ 0xA16B622C] = Field17291;
        iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-469449793 ^ (long)-469449794)] = Field17292;
        iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[((int)-735233679L ^ 0xD42D3970) << 1] = Field17293;
        Field17294 = iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method7479(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-636236725L ^ 0xDA13CC4B;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-801884862 ^ (long)-801884739);
            int n2 = ((int)-1570798916L ^ 0xA25F82B9) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)-223469367L ^ 0xF2AE362E) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

