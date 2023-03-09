/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class452 {
    Field9882(0.0f, 0.0f),
    Field9883(Float.intBitsToFloat(1069547520), Float.intBitsToFloat(1028443341)),
    Field9884(Float.intBitsToFloat(0x3F000000), Float.intBitsToFloat(1028443341)),
    Field9885(Float.intBitsToFloat(0x3F333333), Float.intBitsToFloat(1032805417)),
    Field9886(Float.intBitsToFloat(1069547520), Float.intBitsToFloat(1025758986)),
    Field9887(Float.intBitsToFloat(1069547520), Float.intBitsToFloat(1022739087));

    private final float Field9888;
    private final float Field9889;
    private String Field9891 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    /*
     * WARNING - void declaration
     */
    private Class452() {
        void var4_2;
        void var3_1;
        this.Field9888 = var3_1;
        this.Field9889 = var4_2;
    }

    public float Method2152() {
        return this.Field9888;
    }

    public float Method2153() {
        return this.Field9889;
    }

    private static String Method2154(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 202;
            cArray2[n] = (char)(cArray[n] ^ (0x7D32 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

