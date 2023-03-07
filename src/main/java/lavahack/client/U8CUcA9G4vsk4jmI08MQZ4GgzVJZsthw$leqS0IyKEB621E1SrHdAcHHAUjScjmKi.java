/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class U8CUcA9G4vsk4jmI08MQZ4GgzVJZsthw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ U8CUcA9G4vsk4jmI08MQZ4GgzVJZsthw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field15039 = new U8CUcA9G4vsk4jmI08MQZ4GgzVJZsthw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("None", (int)388474879L ^ 0x1727A7FF);
    public static final /* enum */ U8CUcA9G4vsk4jmI08MQZ4GgzVJZsthw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field15040 = new U8CUcA9G4vsk4jmI08MQZ4GgzVJZsthw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Semi", (int)793426855L ^ 0x2F4ABBA6);
    public static final /* enum */ U8CUcA9G4vsk4jmI08MQZ4GgzVJZsthw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field15041 = new U8CUcA9G4vsk4jmI08MQZ4GgzVJZsthw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Full", (int)((long)568532087 ^ (long)568532086) << 1);
    private static final U8CUcA9G4vsk4jmI08MQZ4GgzVJZsthw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field15042;
    private String Field15043 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static U8CUcA9G4vsk4jmI08MQZ4GgzVJZsthw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (U8CUcA9G4vsk4jmI08MQZ4GgzVJZsthw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field15042.clone();
    }

    public static U8CUcA9G4vsk4jmI08MQZ4GgzVJZsthw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(U8CUcA9G4vsk4jmI08MQZ4GgzVJZsthw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private U8CUcA9G4vsk4jmI08MQZ4GgzVJZsthw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        U8CUcA9G4vsk4jmI08MQZ4GgzVJZsthw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] u8CUcA9G4vsk4jmI08MQZ4GgzVJZsthw$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new U8CUcA9G4vsk4jmI08MQZ4GgzVJZsthw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)1441411131L ^ 0x55EA3038];
        u8CUcA9G4vsk4jmI08MQZ4GgzVJZsthw$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-2091971192 ^ (long)-2091971192)] = Field15039;
        u8CUcA9G4vsk4jmI08MQZ4GgzVJZsthw$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-1411984745L ^ 0xABD6D296] = Field15040;
        u8CUcA9G4vsk4jmI08MQZ4GgzVJZsthw$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[((int)65646903L ^ 0x3E9B136) << 1] = Field15041;
        Field15042 = u8CUcA9G4vsk4jmI08MQZ4GgzVJZsthw$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method6020(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)735456663L ^ 0x2BD62D97;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1999445316L ^ 0x772D1DBB);
            int n2 = ((int)-1448253211L ^ 0xA9AD68F8) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)1619660947L ^ 0x608A1710) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

