/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class1205 {
    Field13466(true),
    Field13467,
    Field13468(true),
    Field13469,
    Field13470(true),
    Field13471;

    private boolean Field13472;
    private String Field13474 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1205() {
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1205() {
        void var3_1;
        this.Field13472 = var3_1;
    }

    public boolean Method4867() {
        return this.Field13472;
    }

    private static String Method4868(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 202;
            cArray2[n] = (char)(cArray[n] ^ (0x5A4D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

