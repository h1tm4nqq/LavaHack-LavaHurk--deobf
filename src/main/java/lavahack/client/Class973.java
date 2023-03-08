//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class973
{
    Field12174("Full", 0), 
    Field12175("Head", 1);
    
    private static final Class973[] Field12176;
    private String Field12177 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class973(final String name, final int ordinal) {
    }
    
    static {
        Field12176 = new Class973[] { Class973.Field12174, Class973.Field12175 };
    }
    
    private static String Method3976(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x43CE ^ 0x8C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
