/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field16116 = new IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("MovementStop", (int)2051387544L ^ 0x7A45B098);
    public static final /* enum */ IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field16117 = new IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Motion", (int)((long)-1818455398 ^ (long)-1818455397));
    public static final /* enum */ IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field16118 = new IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Teleport", (int)((long)1228319024 ^ (long)1228319025) << 1);
    private static final IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field16119;
    private String Field16120 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field16119.clone();
    }

    public static IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] iC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)-910974144L ^ 0xC9B3A343];
        iC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)5652857 ^ (long)5652857)] = Field16116;
        iC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-1844342914L ^ 0x92118F7F] = Field16117;
        iC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[((int)-753328707L ^ 0xD3191DBC) << 1] = Field16118;
        Field16119 = iC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method6716(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)2009460764 ^ (long)2009460764);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)187575744L ^ 0xB2E2D3F);
            int n2 = (int)((long)-2093771745 ^ (long)-2093771562);
            cArray2[n] = (char)(cArray[n] ^ ((int)-1299370247L ^ 0xB28D0898 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

