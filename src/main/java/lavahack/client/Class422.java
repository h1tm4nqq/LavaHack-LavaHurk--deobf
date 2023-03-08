//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class422
{
    Field9768("SINGLE", 0), 
    Field9769("DOUBLE", 1), 
    Field9770("CUSTOM", 2), 
    Field9771("NONE", 3);
    
    private static final Class422[] Field9772;
    private int Field9773;
    
    private Class422(final String name, final int ordinal) {
    }
    
    static {
        Field9772 = new Class422[] { Class422.Field9768, Class422.Field9769, Class422.Field9770, Class422.Field9771 };
    }
    
    private static String Method2053(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6D27 ^ 0x9A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
