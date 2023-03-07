/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field12062 = new ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("X", (int)((long)-2039380659 ^ (long)-2039380659));
    public static final /* enum */ ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field12063 = new ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Y", (int)((long)-274343827 ^ (long)-274343828));
    public static final /* enum */ ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field12064 = new ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("mX", ((int)2145478329L ^ 0x7FE166B8) << 1);
    public static final /* enum */ ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field12065 = new ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("mY", (int)((long)-1512744837 ^ (long)-1512744840));
    private static final ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field12066;
    private String Field12067 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field12066.clone();
    }

    public static ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)-688563522 ^ (long)-688563521) << 2];
        ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-252395892L ^ 0xF0F4BE8C] = Field12062;
        ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)769462913 ^ (long)769462912)] = Field12063;
        ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-26503594 ^ (long)-26503593) << 1] = Field12064;
        ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)207026281L ^ 0xC56F86A] = Field12065;
        Field12066 = ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method3922(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)2059291427 ^ (long)2059291427);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-882218441L ^ 0xCB6A6AC8);
            int n2 = (int)((long)812415421 ^ (long)812415326);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-942779424 ^ (long)-942777977) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

