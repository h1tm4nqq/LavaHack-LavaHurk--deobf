//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public final class Class637
{
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
    
    private static String Method2766(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x132 ^ 0xCD));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
