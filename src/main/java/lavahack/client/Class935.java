/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class Class935 {
    public static final String Field11988;
    public static final String Field11989;
    public static final String Field11990;
    public static final String Field11991;
    public static final String Field11992;
    private String Field11993 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Field11992 = "schematica.gui.format";
        Field11991 = "schematica.gui.saveselection";
        Field11990 = "schematica.gui.save";
        Field11989 = "schematica.gui.point.blue";
        Field11988 = "schematica.gui.point.red";
    }

    private static String Method3867(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 117;
            cArray2[n] = (char)(cArray[n] ^ (0x47A2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

