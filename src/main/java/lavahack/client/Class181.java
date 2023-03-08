//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public final class Class181
{
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
    
    private static String Method1109(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x60AB ^ 0xDA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
