/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1120;

public enum Class1111 {
    Field13001(Class1120.Field13036),
    Field13002(Class1120.Field13037);

    private final Class1120 Field13003;
    private String Field13005 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1111() {
        void var3_1;
        this.Field13003 = var3_1;
    }

    public Class1120 Method4542() {
        return this.Field13003;
    }

    private static String Method4543(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 238;
            cArray2[n] = (char)(cArray[n] ^ (0x6EEE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

