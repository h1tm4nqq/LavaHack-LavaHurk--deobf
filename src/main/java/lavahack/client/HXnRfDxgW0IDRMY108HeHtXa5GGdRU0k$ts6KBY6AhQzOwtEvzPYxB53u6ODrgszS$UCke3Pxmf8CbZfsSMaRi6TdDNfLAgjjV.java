/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class HXnRfDxgW0IDRMY108HeHtXa5GGdRU0k$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV {
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
        int n = (int)1149202819L ^ 0x447F7183;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-805242555L ^ 0xD000F9BA);
            int n2 = (int)649580848L ^ 0x26B7D145;
            cArray2[n] = (char)(cArray[n] ^ (((int)1299863893L ^ 0x4D7A7A84) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

