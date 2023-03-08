//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1095
{
    Field12932("Boolean", 0), 
    Field12933("Mode", 1), 
    Field12934("Color", 2), 
    Field12935("Number", 3);
    
    private static final Class1095[] Field12936;
    private String Field12937 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1095(final String name, final int ordinal) {
    }
    
    static {
        Field12936 = new Class1095[] { Class1095.Field12932, Class1095.Field12933, Class1095.Field12934, Class1095.Field12935 };
    }
    
    private static String Method4486(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6BE8 ^ 0x7E));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
