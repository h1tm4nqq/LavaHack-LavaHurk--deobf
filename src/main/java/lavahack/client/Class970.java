//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class970
{
    Field12162("Static", 0), 
    Field12163("Gradient", 1), 
    Field12164("Rainbow", 2), 
    Field12165("Chroma", 3), 
    Field12166("ChromaRainbow", 4);
    
    private static final Class970[] Field12167;
    private String Field12168 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class970(final String name, final int ordinal) {
    }
    
    static {
        Field12167 = new Class970[] { Class970.Field12162, Class970.Field12163, Class970.Field12164, Class970.Field12165, Class970.Field12166 };
    }
    
    private static String Method3974(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x235F ^ 0x25));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
