//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public final class Class935
{
    public static final String Field11988;
    public static final String Field11989;
    public static final String Field11990;
    public static final String Field11991;
    public static final String Field11992;
    private String Field11993 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    static {
        Field11992 = "schematica.gui.format";
        Field11991 = "schematica.gui.saveselection";
        Field11990 = "schematica.gui.save";
        Field11989 = "schematica.gui.point.blue";
        Field11988 = "schematica.gui.point.red";
    }
    
    private static String Method3867(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x47A2 ^ 0x75));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
