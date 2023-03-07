/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field15103 = new PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("MAINHAND", (int)((long)-771183843 ^ (long)-771183843));
    public static final /* enum */ PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field15104 = new PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("OFFHAND", (int)((long)-1005005058 ^ (long)-1005005057));
    public static final /* enum */ PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field15105 = new PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("PACKET", ((int)1042101244L ^ 0x3E1D33FD) << 1);
    public static final /* enum */ PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field15106 = new PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("NONE", (int)-1663916569L ^ 0x9CD2A5E4);
    private static final PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field15107;
    private String Field15108 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field15107.clone();
    }

    public static PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] pzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)320429902 ^ (long)320429903) << 2];
        pzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)859663596 ^ (long)859663596)] = Field15103;
        pzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)578985213 ^ (long)578985212)] = Field15104;
        pzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[((int)33776269L ^ 0x203628C) << 1] = Field15105;
        pzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)426493032 ^ (long)426493035)] = Field15106;
        Field15107 = pzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method6047(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-218998467L ^ 0xF2F2593D;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1785008390 ^ (long)-1785008635);
            int n2 = (int)((long)555667144 ^ (long)555667141) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-644655207 ^ (long)-644656380) << 4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

