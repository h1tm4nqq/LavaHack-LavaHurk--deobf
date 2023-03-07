/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class d4NTxP82GecdlnZq2WRWI6H9iwOznKNr$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ d4NTxP82GecdlnZq2WRWI6H9iwOznKNr$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field12512 = new d4NTxP82GecdlnZq2WRWI6H9iwOznKNr$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Default", (int)1152483928L ^ 0x44B18258);
    public static final /* enum */ d4NTxP82GecdlnZq2WRWI6H9iwOznKNr$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field12513 = new d4NTxP82GecdlnZq2WRWI6H9iwOznKNr$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Matrix", (int)((long)621100706 ^ (long)621100707));
    private static final d4NTxP82GecdlnZq2WRWI6H9iwOznKNr$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field12514;
    private String Field12515 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static d4NTxP82GecdlnZq2WRWI6H9iwOznKNr$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (d4NTxP82GecdlnZq2WRWI6H9iwOznKNr$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field12514.clone();
    }

    public static d4NTxP82GecdlnZq2WRWI6H9iwOznKNr$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(d4NTxP82GecdlnZq2WRWI6H9iwOznKNr$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private d4NTxP82GecdlnZq2WRWI6H9iwOznKNr$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        d4NTxP82GecdlnZq2WRWI6H9iwOznKNr$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] d4NTxP82GecdlnZq2WRWI6H9iwOznKNr$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new d4NTxP82GecdlnZq2WRWI6H9iwOznKNr$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)-35361754 ^ (long)-35361753) << 1];
        d4NTxP82GecdlnZq2WRWI6H9iwOznKNr$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-284067018L ^ 0xEF117B36] = Field12512;
        d4NTxP82GecdlnZq2WRWI6H9iwOznKNr$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)1630726923L ^ 0x6132EB0A] = Field12513;
        Field12514 = d4NTxP82GecdlnZq2WRWI6H9iwOznKNr$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method4166(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-766122241 ^ (long)-766122241);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-915222558L ^ 0xC972CF1D);
            int n2 = (int)-1844562930L ^ 0x920E3417;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)939666890 ^ (long)939667809) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

