/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class Class637 {
    public static final String Field10744;
    public static final String Field10745;
    public static final String Field10746;
    public static final String Field10747;
    public static final String Field10748;
    private String Field10749 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Field10748 = "schematica.command.download.downloadFail";
        Field10747 = "schematica.command.download.downloadSucceeded";
        Field10746 = "schematica.command.download.started";
        Field10745 = "schematica.command.save.playersOnly";
        Field10744 = "schematica.command.download.usage";
    }

    private static String Method2766(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 205;
            cArray2[n] = (char)(cArray[n] ^ (0x132 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

