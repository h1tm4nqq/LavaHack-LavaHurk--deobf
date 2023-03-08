//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class48
{
    Field8136("Rewrite", 0), 
    Field8137("NoRules", 1), 
    Field8138("Simple", 2), 
    Field8139("Astolfo", 3), 
    Field8140("Noat", 4);
    
    private static final Class48[] Field8141;
    private String Field8142 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class48(final String name, final int ordinal) {
    }
    
    static {
        Field8141 = new Class48[] { Class48.Field8136, Class48.Field8137, Class48.Field8138, Class48.Field8139, Class48.Field8140 };
    }
    
    private static String Method430(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x612C ^ 0x5F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
