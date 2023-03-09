/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class Class1176 {
    public static final String Field13288;
    public static final String Field13289;
    public static final String Field13290;
    public static final String Field13291;
    public static final String Field13292;
    public static final String Field13293;
    private String Field13294 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Field13293 = "gui.yes";
        Field13292 = "schematica.command.remove.areYouSure";
        Field13291 = "schematica.command.remove.schematicNotFound";
        Field13290 = "schematica.command.remove.schematicRemoved";
        Field13289 = "schematica.command.save.playersOnly";
        Field13288 = "schematica.command.remove.usage";
    }

    private static String Method4737(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 241;
            cArray2[n] = (char)(cArray[n] ^ (0x2804 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

