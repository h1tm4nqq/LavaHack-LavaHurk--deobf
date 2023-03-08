//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public final class Class1176
{
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
    
    private static String Method4737(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2804 ^ 0xF1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
