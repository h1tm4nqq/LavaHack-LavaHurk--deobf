/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class HXnRfDxgW0IDRMY108HeHtXa5GGdRU0k$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
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
        int n = (int)38891915L ^ 0x251718B;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1318733176L ^ 0x4E9A4587);
            int n2 = (int)((long)-276942568 ^ (long)-276942379);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1473049087 ^ (long)1473048934) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

