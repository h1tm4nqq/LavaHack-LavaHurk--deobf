/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class Class983 {
    public static final String Field12205 = "schematicaRemove";
    private String Field12206 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private static String Method3995(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 248;
            cArray2[n] = (char)(cArray[n] ^ (0x6767 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

