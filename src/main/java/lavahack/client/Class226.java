/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class226 {
    Field8984("Load"),
    Field8985("Unload"),
    Field8986("Reload");

    final String Field8987;
    private String Field8989 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class226() {
        void var3_1;
        this.Field8987 = var3_1;
    }

    private static String Method1281(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 146;
            cArray2[n] = (char)(cArray[n] ^ (0x4A22 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

