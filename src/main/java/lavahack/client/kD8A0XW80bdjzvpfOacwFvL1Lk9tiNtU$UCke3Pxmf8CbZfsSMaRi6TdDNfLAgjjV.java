/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV
extends Enum {
    public static final /* enum */ kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Field13036 = new kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV("Bedrock", (int)-1763621480L ^ 0x96E14598);
    public static final /* enum */ kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Field13037 = new kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV("Obsidian", (int)((long)192307429 ^ (long)192307428));
    public static final /* enum */ kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Field13038 = new kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV("Mix", (int)((long)1860184750 ^ (long)1860184751) << 1);
    private static final kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[] Field13039;
    private int Field13040;

    public static kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[] values() {
        return (kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[])Field13039.clone();
    }

    public static kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV valueOf(String string) {
        return Enum.valueOf(kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV() {
        void var2_-1;
        void var1_-1;
    }

    static {
        kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[] kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray = new kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[(int)-1072205440L ^ 0xC0177183];
        kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray[(int)-611899240L ^ 0xDB872898] = Field13036;
        kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray[(int)1499878675L ^ 0x59665512] = Field13037;
        kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray[(int)((long)1831867599 ^ (long)1831867598) << 1] = Field13038;
        Field13039 = kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjVArray;
    }

    private static String Method4568(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)2110808455L ^ 0x7DD06187;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-829255438 ^ (long)-829255667);
            int n2 = (int)((long)-1042233225 ^ (long)-1042233225);
            cArray2[n] = (char)(cArray[n] ^ ((int)-1811993716L ^ 0x93FF39EB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

