/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class97 {
    Field8338("Combat"),
    Field8339("Client"),
    Field8340("Movement"),
    Field8341("Player"),
    Field8342("Render"),
    Field8343("Misc"),
    Field8344("Exploit"),
    Field8345("Debug"),
    Field8346("WIP"),
    Field8347("Plugin&Lua");

    private final String Field8348;
    private String Field8350 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class97() {
        void var3_1;
        this.Field8348 = var3_1;
    }

    public final String Method807() {
        return this.Field8348;
    }

    private static String Method808(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 220;
            cArray2[n] = (char)(cArray[n] ^ (0x1C58 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

