/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class aYbbYntkurUPImKqpn4NToDjVrwxuFgJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ aYbbYntkurUPImKqpn4NToDjVrwxuFgJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field12709 = new aYbbYntkurUPImKqpn4NToDjVrwxuFgJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Silent", (int)1908305882L ^ 0x71BE6FDA);
    public static final /* enum */ aYbbYntkurUPImKqpn4NToDjVrwxuFgJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field12710 = new aYbbYntkurUPImKqpn4NToDjVrwxuFgJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Click", (int)-265171641L ^ 0xF031CD46);
    public static final /* enum */ aYbbYntkurUPImKqpn4NToDjVrwxuFgJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field12711 = new aYbbYntkurUPImKqpn4NToDjVrwxuFgJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Client", (int)((long)0x48480808 ^ (long)1212680201) << 1);
    public static final /* enum */ aYbbYntkurUPImKqpn4NToDjVrwxuFgJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field12712 = new aYbbYntkurUPImKqpn4NToDjVrwxuFgJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Fake", (int)2012682700L ^ 0x77F719CF);
    private static final aYbbYntkurUPImKqpn4NToDjVrwxuFgJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field12713;
    private String Field12714 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static aYbbYntkurUPImKqpn4NToDjVrwxuFgJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (aYbbYntkurUPImKqpn4NToDjVrwxuFgJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field12713.clone();
    }

    public static aYbbYntkurUPImKqpn4NToDjVrwxuFgJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(aYbbYntkurUPImKqpn4NToDjVrwxuFgJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private aYbbYntkurUPImKqpn4NToDjVrwxuFgJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        aYbbYntkurUPImKqpn4NToDjVrwxuFgJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] aYbbYntkurUPImKqpn4NToDjVrwxuFgJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new aYbbYntkurUPImKqpn4NToDjVrwxuFgJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)-1086629783 ^ (long)-1086629784) << 2];
        aYbbYntkurUPImKqpn4NToDjVrwxuFgJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-2051495090 ^ (long)-2051495090)] = Field12709;
        aYbbYntkurUPImKqpn4NToDjVrwxuFgJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-1209191089L ^ 0xB7ED354E] = Field12710;
        aYbbYntkurUPImKqpn4NToDjVrwxuFgJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)2123254475 ^ (long)2123254474) << 1] = Field12711;
        aYbbYntkurUPImKqpn4NToDjVrwxuFgJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-1862624321 ^ (long)-1862624324)] = Field12712;
        Field12713 = aYbbYntkurUPImKqpn4NToDjVrwxuFgJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method4336(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1432007078L ^ 0xAAA54E5A;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1549588748L ^ 0x5C5CD9F3);
            int n2 = (int)((long)-1340474287 ^ (long)-1340474276) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1118681391 ^ (long)1118692826) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

