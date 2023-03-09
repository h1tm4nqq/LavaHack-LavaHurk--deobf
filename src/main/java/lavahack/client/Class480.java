/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class480 {
    Field10003("Reload"),
    Field10004("Unload");

    final String Field10005;
    private String Field10007 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class480() {
        void var3_1;
        this.Field10005 = var3_1;
    }

    private static String Method2232(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 197;
            cArray2[n] = (char)(cArray[n] ^ (0x42AC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

