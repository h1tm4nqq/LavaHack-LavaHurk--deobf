//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class645
{
    Field10783("Cube", 0), 
    Field10784("Glass", 1);
    
    private static final Class645[] Field10785;
    private int Field10786;
    
    private Class645(final String name, final int ordinal) {
    }
    
    static {
        Field10785 = new Class645[] { Class645.Field10783, Class645.Field10784 };
    }
    
    private static String Method2777(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6B97 ^ 0x11));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
