//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1010
{
    Field12390("BLANK", 0), 
    Field12391("BREAKABLE", 1), 
    Field12392("RESISTANT", 2), 
    Field12393("UNBREAKABLE", 3);
    
    private static final Class1010[] Field12394;
    private int Field12395;
    
    private Class1010(final String name, final int ordinal) {
    }
    
    static {
        Field12394 = new Class1010[] { Class1010.Field12390, Class1010.Field12391, Class1010.Field12392, Class1010.Field12393 };
    }
    
    private static String Method4120(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2646 ^ 0xA2));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
