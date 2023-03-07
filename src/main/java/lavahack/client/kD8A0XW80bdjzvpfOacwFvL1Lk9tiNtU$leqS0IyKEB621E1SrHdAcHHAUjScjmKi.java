/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;

public final class kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field13001 = new kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Bedrock", (int)((long)862122616 ^ (long)862122616), kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field13036);
    public static final /* enum */ kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field13002 = new kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Obsidian", (int)-1712473145L ^ 0x99EDBBC6, kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field13037);
    private final kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Field13003;
    private static final kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field13004;
    private String Field13005 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field13004.clone();
    }

    public static kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field13003 = var3_1;
    }

    public kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Method4542() {
        return this.Field13003;
    }

    static {
        kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)94253005 ^ (long)94253004) << 1];
        kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)818572704L ^ 0x30CA6DA0] = Field13001;
        kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-717858394L ^ 0xD53659A7] = Field13002;
        Field13004 = kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method4543(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-325538845 ^ (long)-325538845);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-3935284 ^ (long)-3935437);
            int n2 = (int)((long)1909440498 ^ (long)1909440389) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1761804488 ^ (long)1761818559) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

