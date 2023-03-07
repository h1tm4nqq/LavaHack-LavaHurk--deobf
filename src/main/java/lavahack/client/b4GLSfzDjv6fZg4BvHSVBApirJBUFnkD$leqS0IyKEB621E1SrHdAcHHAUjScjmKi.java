/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field8174 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("None", (int)-1701978146L ^ 0x9A8DDFDE);
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field8175 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Cev", (int)1354827987L ^ 0x50C108D2);
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field8176 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Civ", (int)((long)1062447110 ^ (long)1062447111) << 1);
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field8177 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Both", (int)((long)-200843024 ^ (long)-200843021));
    private static final b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field8178;
    private String Field8179 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field8178.clone();
    }

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)962168595 ^ (long)962168594) << 2];
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)2094098352 ^ (long)2094098352)] = Field8174;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-229336738L ^ 0xF254995F] = Field8175;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[((int)1830770777L ^ 0x6D1F5858) << 1] = Field8176;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)885385739 ^ (long)885385736)] = Field8177;
        Field8178 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method487(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)490411745L ^ 0x1D3B16E1;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1411770736L ^ 0x5425E98F);
            int n2 = (int)((long)-579107519 ^ (long)-579107472);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1353031161 ^ (long)-1353024608) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

