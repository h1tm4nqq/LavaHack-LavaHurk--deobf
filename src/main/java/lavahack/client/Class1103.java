//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1103
{
    Field12975("None", 0), 
    Field12976("All", 1), 
    Field12977("AllButIgnorePops", 2);
    
    private static final Class1103[] Field12978;
    private String Field12979 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1103(final String name, final int ordinal) {
    }
    
    static {
        Field12978 = new Class1103[] { Class1103.Field12975, Class1103.Field12976, Class1103.Field12977 };
    }
    
    private static String Method4519(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x366D ^ 0x38));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
