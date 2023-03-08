//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class830
{
    Field11530("Default", 0), 
    Field11531("EndFocused", 1), 
    Field11532("EveryTime", 2);
    
    private static final Class830[] Field11533;
    private int Field11534;
    
    private Class830(final String name, final int ordinal) {
    }
    
    static {
        Field11533 = new Class830[] { Class830.Field11530, Class830.Field11531, Class830.Field11532 };
    }
    
    private static String Method3552(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3E7A ^ 0x8A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
