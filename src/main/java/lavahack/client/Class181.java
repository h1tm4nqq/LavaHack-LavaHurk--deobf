/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class Class181 {
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
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 218;
            cArray2[n] = (char)(cArray[n] ^ (0x60AB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

