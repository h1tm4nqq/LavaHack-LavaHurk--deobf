//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1388
{
    Field14293("Chat", 0), 
    Field14294("Display", 1);
    
    private static final Class1388[] Field14295;
    private String Field14296 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1388(final String name, final int ordinal) {
    }
    
    static {
        Field14295 = new Class1388[] { Class1388.Field14293, Class1388.Field14294 };
    }
    
    private static String Method5496(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1AD4 ^ 0x6C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
