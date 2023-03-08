//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1041
{
    Field12586("None", 0), 
    Field12587("Pool", 1), 
    Field12588("Sound", 2), 
    Field12589("While", 3);
    
    private static final Class1041[] Field12590;
    private int Field12591;
    
    private Class1041(final String name, final int ordinal) {
    }
    
    static {
        Field12590 = new Class1041[] { Class1041.Field12586, Class1041.Field12587, Class1041.Field12588, Class1041.Field12589 };
    }
    
    private static String Method4251(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x542A ^ 0xCF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
