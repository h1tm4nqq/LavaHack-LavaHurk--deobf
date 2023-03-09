/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class Class629 {
    public static final String Field10680;
    public static final String Field10681;
    public static final String Field10682;
    public static final String Field10683;
    public static final String Field10684;
    public static final String Field10685;
    public static final String Field10686;
    private String Field10687 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Field10686 = "schematica.command.list.noSchematics";
        Field10685 = "schematica.command.list.noSuchPage";
        Field10684 = "schematica.command.list.header";
        Field10683 = "schematica.command.list.download";
        Field10682 = "schematica.command.list.remove";
        Field10681 = "schematica.command.list.notAvailable";
        Field10680 = "schematica.command.list.usage";
    }

    private static String Method2725(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 43;
            cArray2[n] = (char)(cArray[n] ^ (0x437B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

