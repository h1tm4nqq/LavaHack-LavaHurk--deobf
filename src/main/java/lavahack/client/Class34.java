/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class Class34 {
    public static final String Field8025;
    public static final String Field8026;
    public static final String Field8027;
    public static final String Field8028;
    public static final String Field8029;
    public static final String Field8030;
    public static final String Field8031;
    public static final String Field8032;
    private String Field8033 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Field8032 = "schematica.command.save.unknownFormat";
        Field8031 = "schematica.command.save.playerSchematicDirUnavailable";
        Field8030 = "schematica.command.save.quotaExceeded";
        Field8029 = "schematica.command.save.saveFailed";
        Field8028 = "schematica.command.save.saveSucceeded";
        Field8027 = "schematica.command.save.started";
        Field8026 = "schematica.command.save.playersOnly";
        Field8025 = "schematica.command.save.usage";
    }

    private static String Method277(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 154;
            cArray2[n] = (char)(cArray[n] ^ (0x15D7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

