//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public final class Class629
{
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
    
    private static String Method2725(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x437B ^ 0x2B));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
