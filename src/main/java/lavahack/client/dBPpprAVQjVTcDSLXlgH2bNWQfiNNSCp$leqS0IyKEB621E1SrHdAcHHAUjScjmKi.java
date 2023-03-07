/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9803 = new dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("None", (int)((long)-576464320 ^ (long)-576464320));
    public static final /* enum */ dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9804 = new dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Normal", (int)-961397579L ^ 0xC6B23CB4);
    public static final /* enum */ dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9805 = new dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Silent", (int)((long)-780682931 ^ (long)-780682932) << 1);
    private static final dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field9806;
    private String Field9807 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field9806.clone();
    }

    public static dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)-185599443L ^ 0xF4EFFA2E];
        dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)1789157117 ^ (long)1789157117)] = Field9803;
        dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-2137462654 ^ (long)-2137462653)] = Field9804;
        dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[((int)-750848773L ^ 0xD33EF4FA) << 1] = Field9805;
        Field9806 = dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method2063(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1567625629L ^ 0xA28FEE63;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-361944131L ^ 0xEA6D2B42);
            int n2 = (int)((long)456344208 ^ (long)456344237);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)739884788 ^ (long)739880097) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

