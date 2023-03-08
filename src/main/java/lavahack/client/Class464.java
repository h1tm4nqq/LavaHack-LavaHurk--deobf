//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class464
{
    Field9926("Off", 0), 
    Field9927("Place", 1);
    
    private static final Class464[] Field9928;
    private String Field9929 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class464(final String name, final int ordinal) {
    }
    
    static {
        Field9928 = new Class464[] { Class464.Field9926, Class464.Field9927 };
    }
    
    private static String Method2177(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x76BD ^ 0xF7));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
