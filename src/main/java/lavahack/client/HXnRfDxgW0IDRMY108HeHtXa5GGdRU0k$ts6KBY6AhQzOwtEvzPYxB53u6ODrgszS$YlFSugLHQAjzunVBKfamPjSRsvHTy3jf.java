/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class HXnRfDxgW0IDRMY108HeHtXa5GGdRU0k$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf {
    public static final String Field8791;
    public static final String Field8792;
    public static final String Field8793;
    public static final String Field8794;
    private String Field8795 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Field8794 = "schematica.gui.noschematic";
        Field8793 = "schematica.gui.openFolder";
        Field8792 = "schematica.gui.folderInfo";
        Field8791 = "schematica.gui.title";
    }

    private static String Method1109(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1518166235 ^ (long)1518166235);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1273951101L ^ 0x4BEEF382);
            int n2 = ((int)876744300L ^ 0x34420E01) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)206034673L ^ 0xC47B65A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

