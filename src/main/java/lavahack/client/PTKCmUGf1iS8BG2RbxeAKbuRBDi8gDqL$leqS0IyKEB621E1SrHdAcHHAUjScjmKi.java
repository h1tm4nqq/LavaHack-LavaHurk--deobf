/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field16958 = new PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Off", (int)((long)849911413 ^ (long)849911413));
    public static final /* enum */ PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field16959 = new PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("SetDead", (int)((long)834261928 ^ (long)834261929));
    public static final /* enum */ PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field16960 = new PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("RemoveEntity", ((int)-951948182L ^ 0xC7426C6B) << 1);
    public static final /* enum */ PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field16961 = new PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Both", (int)-1933318165L ^ 0x8CC3E7E8);
    private static final PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field16962;
    private String Field16963 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field16962.clone();
    }

    public static PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] pTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)-1722521414 ^ (long)-1722521413) << 2];
        pTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-129510710 ^ (long)-129510710)] = Field16958;
        pTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-5213144 ^ (long)-5213143)] = Field16959;
        pTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-1452532390 ^ (long)-1452532389) << 1] = Field16960;
        pTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)114420971 ^ (long)114420968)] = Field16961;
        Field16962 = pTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method7188(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)208809089 ^ (long)208809089);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)471439084L ^ 0x1C199613);
            int n2 = ((int)-403350181L ^ 0xE7F55D76) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1516222007L ^ 0xA5A06F60 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

