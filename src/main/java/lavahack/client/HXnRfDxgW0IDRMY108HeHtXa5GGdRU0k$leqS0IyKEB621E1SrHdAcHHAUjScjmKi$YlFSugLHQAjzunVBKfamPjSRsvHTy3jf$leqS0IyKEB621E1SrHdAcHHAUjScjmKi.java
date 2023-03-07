/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class HXnRfDxgW0IDRMY108HeHtXa5GGdRU0k$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
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
        int n = (int)((long)-1610059743 ^ (long)-1610059743);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-833093942 ^ (long)-833094091);
            int n2 = (int)((long)-2101528915 ^ (long)-2101528954);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1626668975 ^ (long)-1626651862) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

