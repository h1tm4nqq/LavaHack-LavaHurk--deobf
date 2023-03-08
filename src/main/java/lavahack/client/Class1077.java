//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1077
{
    Field12792("Before", 0), 
    Field12793("After", 1), 
    Field12794("Both", 2);
    
    private static final Class1077[] Field12795;
    private int Field12796;
    
    private Class1077(final String name, final int ordinal) {
    }
    
    static {
        Field12795 = new Class1077[] { Class1077.Field12792, Class1077.Field12793, Class1077.Field12794 };
    }
    
    private static String Method4352(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x734A ^ 0x98));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
