/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class439 {
    Field9834("Only Friends"),
    Field9835("Only Other Players"),
    Field9836("Both");

    public String Field9837;
    private int Field9839;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class439() {
        void var3_1;
        this.Field9837 = var3_1;
    }

    public String Method2084() {
        return this.Field9837;
    }

    private static String Method2085(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 253;
            cArray2[n] = (char)(cArray[n] ^ (0x6D28 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

