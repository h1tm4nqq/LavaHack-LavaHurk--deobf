//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class437
{
    Field9828("PRE", 0), 
    Field9829("POST", 1);
    
    private static final Class437[] Field9830;
    private int Field9831;
    
    private Class437(final String name, final int ordinal) {
    }
    
    static {
        Field9830 = new Class437[] { Class437.Field9828, Class437.Field9829 };
    }
    
    private static String Method2083(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2744 ^ 0x6A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
