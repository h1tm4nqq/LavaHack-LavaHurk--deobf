//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1481
{
    Field14905("Always", 0), 
    Field14906("Smart", 1);
    
    private static final Class1481[] Field14907;
    private String Field14908 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1481(final String name, final int ordinal) {
    }
    
    static {
        Field14907 = new Class1481[] { Class1481.Field14905, Class1481.Field14906 };
    }
    
    private static String Method5923(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1088 ^ 0x66));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
