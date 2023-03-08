//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1512
{
    Field15076("Custom", 0), 
    Field15077("SynsWithGui", 1);
    
    private static final Class1512[] Field15078;
    private int Field15079;
    
    private Class1512(final String name, final int ordinal) {
    }
    
    static {
        Field15078 = new Class1512[] { Class1512.Field15076, Class1512.Field15077 };
    }
    
    private static String Method6041(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2398 ^ 0x4B));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
