/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class q1JKwy52TMxvizRt5jiGJiROVLAEPCKA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ q1JKwy52TMxvizRt5jiGJiROVLAEPCKA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field14977 = new q1JKwy52TMxvizRt5jiGJiROVLAEPCKA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Normal", (int)-1610590107L ^ 0xA0005865);
    public static final /* enum */ q1JKwy52TMxvizRt5jiGJiROVLAEPCKA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field14978 = new q1JKwy52TMxvizRt5jiGJiROVLAEPCKA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Camera", (int)((long)729391067 ^ (long)729391066));
    private static final q1JKwy52TMxvizRt5jiGJiROVLAEPCKA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field14979;
    private String Field14980 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static q1JKwy52TMxvizRt5jiGJiROVLAEPCKA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (q1JKwy52TMxvizRt5jiGJiROVLAEPCKA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field14979.clone();
    }

    public static q1JKwy52TMxvizRt5jiGJiROVLAEPCKA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(q1JKwy52TMxvizRt5jiGJiROVLAEPCKA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private q1JKwy52TMxvizRt5jiGJiROVLAEPCKA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        q1JKwy52TMxvizRt5jiGJiROVLAEPCKA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] q1JKwy52TMxvizRt5jiGJiROVLAEPCKA$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new q1JKwy52TMxvizRt5jiGJiROVLAEPCKA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[((int)-817576083L ^ 0xCF44C76C) << 1];
        q1JKwy52TMxvizRt5jiGJiROVLAEPCKA$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)2067977032 ^ (long)2067977032)] = Field14977;
        q1JKwy52TMxvizRt5jiGJiROVLAEPCKA$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-984318544L ^ 0xC5547DB1] = Field14978;
        Field14979 = q1JKwy52TMxvizRt5jiGJiROVLAEPCKA$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method5972(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1053371693L ^ 0x3EC92D2D;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1302348573L ^ 0xB25FBC1C);
            int n2 = (int)((long)-1217449790 ^ (long)-1217449759) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-2087733509L ^ 0x838FB39A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

