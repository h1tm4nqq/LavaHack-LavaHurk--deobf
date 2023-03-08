//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class954
{
    Field12062("X", 0), 
    Field12063("Y", 1), 
    Field12064("mX", 2), 
    Field12065("mY", 3);
    
    private static final Class954[] Field12066;
    private String Field12067 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class954(final String name, final int ordinal) {
    }
    
    static {
        Field12066 = new Class954[] { Class954.Field12062, Class954.Field12063, Class954.Field12064, Class954.Field12065 };
    }
    
    private static String Method3922(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x14CE ^ 0xE3));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
