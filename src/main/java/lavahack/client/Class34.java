//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public final class Class34
{
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
    
    private static String Method277(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x15D7 ^ 0x9A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
