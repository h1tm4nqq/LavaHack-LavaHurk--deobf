//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class956
{
    Field12072("Default", 0), 
    Field12073("Rewrite", 1);
    
    private static final Class956[] Field12074;
    private String Field12075 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class956(final String name, final int ordinal) {
    }
    
    static {
        Field12074 = new Class956[] { Class956.Field12072, Class956.Field12073 };
    }
    
    private static String Method3924(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x85F ^ 0x5));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
