/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

enum Class87 {
    Field8293(0xBF00BF),
    Field8294(0xFF0000),
    Field8295(12541696),
    Field8296(49151);

    public final int Field8297;
    private String Field8299 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class87() {
        void var3_1;
        this.Field8297 = var3_1;
    }

    private static String Method745(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 229;
            cArray2[n] = (char)(cArray[n] ^ (0x7B5E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

