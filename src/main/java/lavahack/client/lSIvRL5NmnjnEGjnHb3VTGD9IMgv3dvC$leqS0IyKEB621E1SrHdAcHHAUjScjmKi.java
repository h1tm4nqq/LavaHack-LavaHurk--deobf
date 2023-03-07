/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9863 = new lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("INVENTORY", (int)((long)932793432 ^ (long)932793432));
    public static final /* enum */ lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9864 = new lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("HOTBAR", (int)-805474136L ^ 0xCFFD70A9);
    public static final /* enum */ lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9865 = new lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("CRAFTING", ((int)1822485056L ^ 0x6CA0EA41) << 1);
    private static final lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field9866;
    private String Field9867 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field9866.clone();
    }

    public static lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)-1903650146L ^ 0x8E889A9D];
        lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-459332410L ^ 0xE49F24C6] = Field9863;
        lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)1205441581L ^ 0x47D9942C] = Field9864;
        lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[((int)442383137L ^ 0x1A5E3B20) << 1] = Field9865;
        Field9866 = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method2146(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1622839985 ^ (long)1622839985);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1633119286L ^ 0x9EA89335);
            int n2 = (int)((long)-601885442 ^ (long)-601885457) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)1018702545L ^ 0x3CB8328A) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

