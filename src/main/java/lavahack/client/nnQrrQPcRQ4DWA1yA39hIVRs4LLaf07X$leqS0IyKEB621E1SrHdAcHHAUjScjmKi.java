/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9120 = new nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Blocking", (int)((long)1364242084 ^ (long)1364242084));
    public static final /* enum */ nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9121 = new nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Concurrent", (int)440266778L ^ 0x1A3DF01B);
    private static final nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field9122;
    private int Field9123;

    public static nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field9122.clone();
    }

    public static nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[((int)-954303725L ^ 0xC71E7B12) << 1];
        nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-1504674391L ^ 0xA6507DA9] = Field9120;
        nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-1915137161L ^ 0x8DD95376] = Field9121;
        Field9122 = nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method1365(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1252557052L ^ 0x4AA880FC;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1477281943 ^ (long)-1477281898);
            int n2 = (int)((long)-1113384151 ^ (long)-1113384158) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)1404401129L ^ 0x53B574F6) << 6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

