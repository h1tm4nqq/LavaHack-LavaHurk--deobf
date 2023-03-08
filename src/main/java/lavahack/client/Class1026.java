//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1026
{
    Field12512("Default", 0), 
    Field12513("Matrix", 1);
    
    private static final Class1026[] Field12514;
    private String Field12515 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1026(final String name, final int ordinal) {
    }
    
    static {
        Field12514 = new Class1026[] { Class1026.Field12512, Class1026.Field12513 };
    }
    
    private static String Method4166(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1CAB ^ 0x19));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
