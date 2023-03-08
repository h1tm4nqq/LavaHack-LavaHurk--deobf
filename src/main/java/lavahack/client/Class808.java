//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class808
{
    Field11447("Section", 0), 
    Field11448("Angle", 1);
    
    private static final Class808[] Field11449;
    private String Field11450 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class808(final String name, final int ordinal) {
    }
    
    static {
        Field11449 = new Class808[] { Class808.Field11447, Class808.Field11448 };
    }
    
    private static String Method3405(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x508B ^ 0x66));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
