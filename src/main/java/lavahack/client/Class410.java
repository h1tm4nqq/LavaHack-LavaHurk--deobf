//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class410
{
    Field9697("UNBREAKABLE", 0), 
    Field9698("RESISTANT", 1), 
    Field9699("BREAKABLE", 2);
    
    private static final Class410[] Field9700;
    private int Field9701;
    
    private Class410(final String name, final int ordinal) {
    }
    
    static {
        Field9700 = new Class410[] { Class410.Field9697, Class410.Field9698, Class410.Field9699 };
    }
    
    private static String Method1998(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5889 ^ 0x44));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
