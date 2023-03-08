//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class8
{
    Field7857("None", 0), 
    Field7858("Normal", 1), 
    Field7859("Silent", 2);
    
    private static final Class8[] Field7860;
    private int Field7861;
    
    private Class8(final String name, final int ordinal) {
    }
    
    static {
        Field7860 = new Class8[] { Class8.Field7857, Class8.Field7858, Class8.Field7859 };
    }
    
    private static String Method99(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x659E ^ 0xBD));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
