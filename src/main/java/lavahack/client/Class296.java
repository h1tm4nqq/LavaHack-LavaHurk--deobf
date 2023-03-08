//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public final class Class296
{
    public static final String Field9290;
    private String Field9291 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    static {
        Field9290 = "schematicaDownload";
    }
    
    private static String Method1556(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x22CC ^ 0x49));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
