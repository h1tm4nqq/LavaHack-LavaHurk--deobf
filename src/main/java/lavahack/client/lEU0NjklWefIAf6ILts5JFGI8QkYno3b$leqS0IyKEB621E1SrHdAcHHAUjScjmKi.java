/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class lEU0NjklWefIAf6ILts5JFGI8QkYno3b$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ lEU0NjklWefIAf6ILts5JFGI8QkYno3b$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10803 = new lEU0NjklWefIAf6ILts5JFGI8QkYno3b$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("None", (int)((long)2073635876 ^ (long)2073635876));
    public static final /* enum */ lEU0NjklWefIAf6ILts5JFGI8QkYno3b$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10804 = new lEU0NjklWefIAf6ILts5JFGI8QkYno3b$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Range", (int)((long)919331685 ^ (long)919331684));
    private static final lEU0NjklWefIAf6ILts5JFGI8QkYno3b$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field10805;
    private String Field10806 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static lEU0NjklWefIAf6ILts5JFGI8QkYno3b$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (lEU0NjklWefIAf6ILts5JFGI8QkYno3b$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field10805.clone();
    }

    public static lEU0NjklWefIAf6ILts5JFGI8QkYno3b$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(lEU0NjklWefIAf6ILts5JFGI8QkYno3b$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private lEU0NjklWefIAf6ILts5JFGI8QkYno3b$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        lEU0NjklWefIAf6ILts5JFGI8QkYno3b$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] lEU0NjklWefIAf6ILts5JFGI8QkYno3b$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new lEU0NjklWefIAf6ILts5JFGI8QkYno3b$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[((int)-1878947485L ^ 0x90018962) << 1];
        lEU0NjklWefIAf6ILts5JFGI8QkYno3b$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-1473616585L ^ 0xA82A6537] = Field10803;
        lEU0NjklWefIAf6ILts5JFGI8QkYno3b$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-1716651948 ^ (long)-1716651947)] = Field10804;
        Field10805 = lEU0NjklWefIAf6ILts5JFGI8QkYno3b$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method2830(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-553926305 ^ (long)-553926305);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)300556873L ^ 0x11EA22B6);
            int n2 = (int)-645354062L ^ 0xD988AD53;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1135369269 ^ (long)1135370548) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

